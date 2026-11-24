# 22. MITM Traffic-Capture Attempt — Live Network Observations

## Scope and result

With the user's authorization, a local HTTPS interception proxy was set up against the connected (non-rooted) device. All actions were limited to proxy configuration and app navigation while the app remained **logged out**. No login, bet, deposit, withdrawal or money control was used.

**Outcome:** destination-level evidence was obtained, but **TLS decryption was not achieved** — the Android user-CA installation repeatedly failed, so all app TLS handshakes to the proxy were rejected (`Trust anchor for certification path not found`). Request/response bodies therefore remain unavailable. The device was restored to its original state afterwards.

## Setup performed

1. Installed mitmproxy 12.3.1 (Python 3.12) and started `mitmdump` on port 8080 with a flow-logging addon.
2. Established `adb reverse tcp:8080 tcp:8080` so the device could reach the proxy through USB.
3. Set the device's global proxy to `127.0.0.1:8080`.
4. Pushed the mitmproxy CA (`.pem`, `.cer`, `.crt`) to the phone and attempted installation through **Settings → Credential storage → Install certificates from storage → CA certificate**. The installer returned to the previous screen without confirmation and the certificate never appeared under user credentials. The certificate itself was verified valid (`CA:TRUE`, `keyCertSign`, SHA-256 fingerprint `F9:96:3A:F0:…`).
5. Discovered that the **app has its own Proxy settings screen** (Server / Port / optional Username / Password) and configured it to `127.0.0.1:8080`, which made the app generate traffic through the proxy.

## Key finding 1 — live domain fallback chain (Confirmed)

The app contacted a sequence of backend domains on every startup attempt, in the same order:

| Order | Domain | Resolved IP | Evidence |
|---|---|---|---|
| 1 | `andind2022.com` | `185.162.90.3` | mitmproxy `server connect` lines at 04:51:26, 04:55:11, 04:57:30, 04:58:24, 04:59:25 |
| 2 | `s2zg0bhwgyuuin.com` | `94.241.188.54` | 04:51:29, 04:55:13, 04:57:44 |
| 3 | `swtxk1t2akyhuc.com` | `194.53.55.48` | 04:51:30, 04:55:14, 04:57:45 |
| seed/fallback | `mob-experience.space` | `46.23.107.136` | 04:57:57, 04:58:27, 04:59:28 |

This is **live confirmation** of the static domain-checker / anti-blocking architecture in Section 3: a mutable seed host (`ujn.h = https://mob-experience.space`) plus encrypted redirect responses and rotating/fallback domains. Three of these domains do not appear in the static APK strings, confirming they are delivered at runtime. Only destination hosts and IPs were observed — the encrypted payloads could not be read.

SDK endpoints also observed: `cdn-settings.appsflyersdk.com`, `launches.appsflyersdk.com`, `firebaseinstallations.googleapis.com`, `crashlyticsreports-pa.googleapis.com`, `cloudflare-dns.com`, `dns.google.com`. (Other installed apps' traffic also traversed the global proxy and was excluded from this analysis.)

## Key finding 2 — the app detects and exposes proxies (Confirmed)

When the system proxy was active, the app refused to continue and showed a **"No internet connection — Check your network connection and run the program again"** screen with a **"Proxy"** button. Tapping it opened a first-party **Proxy settings** screen with a toggle and Server/Port/Username/Password fields. Screenshot preserved at `reports/device_proxy_detection.png`.

This is a dual-use feature: it supports deliberate proxy configuration (useful in restricted networks) but also acts as anti-interception detection when a proxy is imposed externally. It explains why the MITM attempt produced repeated "Trust anchor" failures rather than usable flows.

## What was NOT obtained

- No decrypted request or response bodies: betting, deposit/withdrawal limits, recommendations, free-spin outcomes and analytics payloads could not be inspected.
- No confirmation of whether A/B experiments alter minimum amounts.
- No answer to the trial-vs-real spin question or payment-fake question. Those remain backend-dependent.

## Second attempt (user requested, same result)

At the user's request the install was retried on the still-connected phone:
- Fresh copies of the CA were pushed (`.pem`, `.cer`, `.crt`).
- A **clean CA generated with OpenSSL** (CA:TRUE, `keyCertSign`, no Extended Key Usage — the original mitmproxy CA had an EKU that Android sometimes rejects) was also pushed as `mitm2.crt`.
- File-picker selection via UI, and direct launch of `com.android.certinstaller/.CertInstallerMain` with the file URI, were both tried.
- In every case the installer returned without a confirmation dialog, and **Settings → Credential storage → User credentials** continued to show "No user credentials installed". No installer error was logged; `com.android.certinstaller` was repeatedly frozen by the OS.

**Conclusion:** this is an OPPO ColorOS / Android 16 policy restriction on installing user CAs from storage, not a problem with the certificate format. Further attempts on this device are unlikely to succeed. A rooted emulator or a device without this restriction would be required for decrypted capture.

## Cleanup performed (device restored)

- App proxy toggle switched **off** and fields cleared.
- Global proxy cleared (`settings put global http_proxy :0`).
- `adb reverse --remove-all` executed.
- mitmproxy stopped; all pushed CA files removed from `/sdcard/Download`.
- No real-money action was taken at any point.

**User note:** please check Settings → Credential storage → User credentials. If a `mitmproxy` certificate appears, remove it — it affects all apps on the phone. Nothing was intentionally left installed.

## If this is pursued later

The missing piece is a trusted CA. Options: install the DER certificate manually with the exact "CA certificate" flow (and verify it appears under user credentials), or use a rooted device / repackaged debuggable build where a system/user CA can be trusted reliably. Once trusted, repeat the same setup and inspect the decrypted flows.
