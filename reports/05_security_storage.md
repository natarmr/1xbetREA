# 1xBet Android APK — Security, Storage & Integrity Assessment

**Target:** `D:\1xbetrea\1xbet.apk` — `org.xbet.client1`, `v1xbet-prod-v260.1.0`
**Assessment type:** Authorized **static** reverse engineering only. No APK execution, no network/deposit/bet actions, no production interaction.
**Artifacts reviewed:** `D:\1xbetrea\apktool_out` (AndroidManifest.xml, res/, assets/, lib/), `D:\1xbetrea\decompiled\sources` (JADX, 69,001 files; first-party `org\xplatform`, obfuscated `a`, `defpackage`, `com`, `ru`).
**Date:** 2026-11-24

---

## 0. Executive summary

This is a large, actively maintained betting client with substantial anti-analysis and anti-fraud engineering. The manifest itself is comparatively well locked down (`allowBackup="false"`, almost all components non-exported or permission-guarded). The material risks found are concentrated in four areas:

1. **Network trust is deliberately weakened:** `res/xml/network_security_config.xml` sets `cleartextTrafficPermitted="true"` globally and trusts **user-installed CAs**, with explicit proxy-tool domains (`chls.pro`, `ipv4.fiddler`, `charlesproxy.com`). This defeats the protection normally expected from a financial app and makes TLS interception practical on any device with an installed proxy CA (including rooted test devices).
2. **Secrets are shipped inside native libraries.** `libkeys.so` and `libsecurity.so` export JNI methods returning OAuth private keys, tokens, redirect URLs, and named AES keys/IVs. JNI symbol names and numerous embedded string constants are directly visible in the binaries. Static extraction is straightforward; runtime extraction is even easier.
3. **The payment WebView is loaded from weakly validated inputs and exposes a JS bridge.** `PaymentWebView.d()` prepends `http://` to arbitrary strings and performs **no host allowlisting**; intent extras such as `link_start_url` / `PARAM_URL` flow into screen models that render in that WebView. A `@JavascriptInterface` bridge named `paymentWebHandler` exposes `openInBrowser(String)` which will request opening an arbitrary URL supplied by page JavaScript.
4. **Deep-link handling is permissive and replayable.** `xbet://openapp|open|telegramBot` and App Links flow into a generic intent-to-screen dispatcher with only an `INTENT_ALREADY_PROCESSED` dedupe flag; no nonce, signature, timestamp, or server-side callback validation was found in the inspected code.

**Overall posture:** High risk for user-facing payment phishing/MITM and for client-secret compromise; Medium risk from deep-link abuse. Several conclusions are explicitly marked where static analysis cannot prove exploitability.

### Findings at a glance

| ID | Finding | Severity | Confidence |
|----|---------|----------|------------|
| F-01 | Global cleartext traffic + user-CA trust + proxy domains in network security config | **High** | Confirmed |
| F-02 | Client secrets, OAuth private keys, tokens, AES key/IV in `libkeys.so` / `libsecurity.so` | **High** | Confirmed (existence); values not decoded |
| F-03 | Payment WebView loads unvalidated URLs (no scheme/host allowlist, HTTP fallback) | **High** | Strongly Supported |
| F-04 | `paymentWebHandler.openInBrowser()` JS bridge accepts arbitrary URL from page JS | **Medium–High** | Strongly Supported |
| F-05 | Native secret validation / environment checks are client-side only | **Medium** | Probable |
| F-06 | Deep links replayable, no callback signature/nonce; `xbet://` scheme hijack potential | **Medium** | Strongly Supported |
| F-07 | `intent://` / `browserintent://` handling launches external intents from WebView content | **Medium** | Strongly Supported (exploitability Unverified) |
| F-08 | WebView file access enabled broadly; WebView debugging gated on debuggable flag | **Low–Medium** | Confirmed |
| F-09 | No certificate/public-key pinning; Let's Encrypt `.der` files are trust anchors, not pins | **Medium** | Confirmed |
| F-10 | EncryptedSharedPreferences with Keystore master key, but plaintext fallback path | **Low** | Confirmed |
| F-11 | Room database unencrypted; 45 entities / 13 DAOs | **Low** | Strongly Supported |
| F-12 | Over-broad permissions (`READ_PRIVILEGED_PHONE_STATE`, `SYSTEM_ALERT_WINDOW`, `REQUEST_INSTALL_PACKAGES`, …) | **Medium** | Confirmed (manifest) |
| F-13 | Exported Compose `PreviewActivity` and other non-essential exported components | **Low** | Confirmed |
| F-14 | Root/emulator/tool detection and device fingerprinting (RootBeer, antifraud libs) | **Info** | Confirmed |
| F-15 | Remote-config-driven `FAKE_APP_GUID` / `SAFE_DOMAIN` stored in preferences | **Low** | Strongly Supported |

Confidence legend: **Confirmed** = directly observed in decompiled/decoded artifact; **Strongly Supported** = code path observed, one downstream step not fully traced; **Probable** = inference from naming/strings; **Unverified** = requires runtime.

---

## 1. Manifest analysis

Source: `D:\1xbetrea\apktool_out\AndroidManifest.xml` (line numbers below are exact).

### 1.1 Application-level security attributes (line 137)

```xml
<application android:allowBackup="false" ...
    android:dataExtractionRules="@xml/appsflyer_data_extraction_rules"
    android:fullBackupContent="@xml/appsflyer_backups_rules"
    android:networkSecurityConfig="@xml/network_security_config"
    android:requestLegacyExternalStorage="true"
    android:extractNativeLibs="true"
    android:name="org.platform.app.ApplicationLoader" ...>
```

- `android:allowBackup="false"` — **good**; prevents ADB backup extraction of app data.
- `android:networkSecurityConfig` — present, but the referenced config is insecure (see F-01).
- `android:usesCleartextTraffic` — **absent**; the default would be false, **but** the network security config overrides this with `cleartextTrafficPermitted="true"` in `<base-config>`.
- `android:requestLegacyExternalStorage="true"` — broad legacy external storage visibility (line 137); relevant given `WRITE_EXTERNAL_STORAGE`/`ACCESS_ALL_DOWNLOADS`.
- `android:extractNativeLibs="true"` — native libs are extracted to the app's native library dir at install time; this **increases ease of static/dynamic extraction** of `libkeys.so`/`libsecurity.so`.
- No `android:taskAffinity` declared anywhere in the manifest (default = package name). No custom task affinity abuse found.
- No `android:sharedUserId`.

### 1.2 Exported components (exact lines)

| Line | Component | Notes / risk |
|------|-----------|--------------|
| 142 | `org.xplatform.client1.features.appactivity.ApplicationActivity` | `exported=true`, `launchMode=singleTop`. Main entry. |
| 145 | `org.xplatform.client1.LauncherAliasLegacy` | alias, `enabled=false`, `exported=true` |
| 151 | `org.xplatform.client1.LauncherAliasColor` | alias, `enabled=true`, `exported=true` |
| 158 | **`IntentForwardingActivity`** | `exported=true`, `noHistory=true`, transparent theme, deep-link intent filters (see §2) |
| 334 | `org.xplatform.authreminder.impl.CheckAuthReminderBroadcastReceiver` | `enabled=false`, `exported=true`, BOOT_COMPLETED — disabled, low risk |
| 362 | `com.yandex.authsdk.internal.ChromeTabDataActivity` | `exported=true`, `autoVerify=true`, http/https + custom OAuth scheme callback |
| 379 | `com.yandex.authsdk.YandexOauthClientIdActivity` | exported alias of above |
| 388 | `com.google.firebase.auth.internal.GenericIdpActivity` | `singleTask`, `genericidp://firebase.auth/` |
| 396 | `com.google.firebase.auth.internal.RecaptchaActivity` | `singleTask`, `recaptcha://firebase.auth/` |
| 436 | `com.google.android.gms.auth.api.signin.RevocationBoundService` | exported but guarded by Google's `REVOCATION_NOTIFICATION` permission |
| 437 | `com.google.firebase.iid.FirebaseInstanceIdReceiver` | guarded by `com.google.android.c2dm.permission.SEND` |
| 451 | **`androidx.compose.ui.tooling.PreviewActivity`** | **`exported=true` in a production build** — unnecessary tooling surface (F-13) |
| 453 | `androidx.work.impl.background.systemjob.SystemJobService` | exported with `BIND_JOB_SERVICE` — standard AndroidX |
| 461 | `androidx.work.impl.diagnostics.DiagnosticsReceiver` | exported with `android.permission.DUMP` — standard AndroidX |
| 470 | `androidx.profileinstaller.ProfileInstallReceiver` | exported with `DUMP` — standard AndroidX |
| 499 | `com.huawei.hms.support.api.push.PushMsgReceiver` | signature-level `org.xbet.client1.permission.PROCESS_PUSH_MSG` |
| 505 | `com.huawei.hms.support.api.push.PushReceiver` | same signature permission |
| 511 | `com.huawei.hms.support.api.push.service.HmsMsgService` | exported, intent-filter; process `:pushservice` |
| 517 | `com.huawei.hms.support.api.push.PushProvider` | exported, guarded by signature read/write permissions (lines 132–134) |

All app-defined services (online call, game video, widgets, app-update APK download, background video, FCM/HMS messaging) are `exported="false"` (lines 186–193, 281–310, 332, 339–349). All app-defined widget receivers are non-exported (lines 200–319). `androidx.core.content.FileProvider` is `exported="false"` with `grantUriPermissions="true"` (lines 195–197). **No exported content provider belonging to first-party code was found.** This is a positive finding.

### 1.3 Permission risk review

Lines 3–28, 114–128. Notable:

- `android.permission.READ_PRIVILEGED_PHONE_STATE` (line 117) — a **signature|privileged** permission not normally grantable to Play-store apps. Presence may indicate a split build flavor or copy/paste; verify it is not requested at runtime on production builds.
- `SYSTEM_ALERT_WINDOW` (lines 18, 27) — overlay capability; increases tapjacking risk.
- `REQUEST_INSTALL_PACKAGES` (line 115) — combined with `org.xplatform.app_update.impl.presentation.apk_service.AppUpdateDownloadApkService` (line 332) this enables sideloading an APK. If the update URL is attacker-influenced (see F-01 MITM), this is a plausible direct code-execution chain. **High potential impact — runtime confirmation required.**
- `WRITE_EXTERNAL_STORAGE`, `READ_EXTERNAL_STORAGE` (maxSdk 32), `ACCESS_ALL_DOWNLOADS` (lines 12–13, 19, 28), `requestLegacyExternalStorage=true`.
- `RECORD_AUDIO`, `MODIFY_AUDIO_SETTINGS`, `HIGH_SAMPLING_RATE_SENSORS` — consistent with `libantifraud_audio.so` device fingerprinting (§7).
- `READ_PHONE_STATE`, `ACCESS_FINE/COARSE_LOCATION`, `CAMERA`, `USE_FINGERPRINT`/`USE_BIOMETRIC`, `GET_TASKS`, `QUERY_*` package queries (lines 35–113) — broad device enumeration.
- Three custom signature-level permissions defined at lines 125, 132–134 — correctly scoped.

### 1.4 Network security config — F-01 (High, Confirmed)

`D:\1xbetrea\apktool_out\res\xml\network_security_config.xml` (full file, 19 lines):

```xml
<network-security-config>
  <base-config cleartextTrafficPermitted="true">        <!-- global cleartext -->
    <trust-anchors>
      <certificates src="@raw/lets_encrypt_x1" /> ... <certificates src="@raw/lets_encrypt_e5" />
      <certificates src="@raw/lets_encrypt_e6" />
      <certificates src="system" />
      <certificates src="user" />                        <!-- USER CA TRUSTED -->
    </trust-anchors>
  </base-config>
  <domain-config cleartextTrafficPermitted="true">
    <domain includeSubdomains="true">livetex.ru</domain>
    <domain includeSubdomains="true">chls.pro</domain>          <!-- Charles proxy -->
    <domain includeSubdomains="true">ipv4.fiddler</domain>      <!-- Fiddler -->
    <domain includeSubdomains="true">charlesproxy.com</domain>
    <trust-anchors><certificates src="system" /></trust-anchors>
  </domain-config>
</network-security-config>
```

**Impact:** An attacker who can install a CA (common on rooted/jailbroken devices, or via MDM/enterprise enrollment) can terminate TLS for *any* host, including payment and authentication endpoints. Combined with `cleartextTrafficPermitted="true"`, plaintext HTTP is accepted app-wide. The proxy-tool domains strongly suggest the production config was derived from a debugging config.

**Remediation:** Set `cleartextTrafficPermitted="false"` in `<base-config>`; remove `<certificates src="user">` and the proxy domains from the production config; place debugging variants under `res/xml/debug/` selected via build-type source sets. Restrict cleartext to explicit localhost/debug domains only if strictly necessary.

---

## 2. Deep links & payment callback attack surface

### 2.1 Entry points

Resolved string resources (`res/values/strings.xml`):

| Resource | Value | Line |
|----------|-------|------|
| `domain` | `1xbet.com` | 1829 |
| `appsflyer_host` | `1xbet.onelink.me` | 351 |
| `deeplink_scheme` | `xbet` | 1724 |

`IntentForwardingActivity` (manifest lines 158–185) accepts:

1. `https://1xbet.com/line*`, `https://1xbet.com/live*` — `autoVerify=true`
2. `https://1xbet.onelink.me/*` — AppsFlyer OneLink, `autoVerify=true`
3. `xbet://openapp`, `xbet://open`, `xbet://telegramBot` — custom scheme, **no `autoVerify`, no ownership proof**

Third-party exported OAuth callbacks: `yxa088414ac82149538dd816fd742c7526://auth/finish` (manifest 372–377) and `https://yxa088414ac82149538dd816fd742c7526.oauth.yandex.ru/auth/finish` (363–371); client ID `a088414ac82149538dd816fd742c7526` at line 380.

### 2.2 How the intent is processed

`org\xplatform\client1\features\appactivity\IntentForwardingActivity.java`:

- `onCreate` lines 28–61: resolves DI `yr3`/`dlx`, calls `j120.f0(this, intent)` (line 46), then `dlx.c.a(intent)` (line 53), then obtains the launcher intent via `j120.Q(this)` (line 55; implemented in `a\j120.java:878-881` as `getLaunchIntentForPackage()`), adds flag `0x4000000` and category `"CUSTOM_INTENT"` (lines 56–57) and starts it.
- `onNewIntent` lines 67–76 does the same forwarding.

`a\j120.java:1314-1344` — `f0(yc3, Intent)`: attempts to re-dispatch an arbitrary `Intent` (action, data URI, all extras, flags `0x10008000`/`FLAG_ACTIVITY_*`) to another package. **Important caveat:** in the decompiled output the target package string is the empty literal `""` (lines 1316, 1318, 1319, 1322). Under either plausible semantics of `StringsKt.W("")` the method returns `false`, i.e. it is a **no-op in this build**; this is most likely JADX constant/obfuscation resolution loss. **Confidence: Unverified** as to original release behavior — must be checked in smali/runtime before drawing conclusions.

`a\jlx.java:21-41` — `a(Intent)`:
- calls `blx.d(intent)` (extras classloader hardening),
- removes `SCOPE_ACCOUNT_PROFILE` extra,
- ignores MAIN+DEFAULT / MAIN+LAUNCHER with no extras,
- reads boolean `INTENT_ALREADY_PROCESSED` (line 29) and sets it to `true` (line 36),
- wraps in `flx` and dispatches to a handler flow (`p7m0.o`).

`a\blx.java:50-483` — `b(Intent)` maps intent extras to screen models. Security-relevant mappings:

| Extra | Line(s) | Destination |
|-------|---------|-------------|
| `link_start_key` + `link_start_url` | 91–96 | `new ebd0(url)` — arbitrary URL screen |
| `PARAM_URL` (case 29/30) | 214–226 | `new rad0(url)` |
| `PARAM_URL` (case 37) | 252–254 | `new wbd0(url)` |
| `PARAM_URL` (case 41/42) | 262–267 | `jcd0` / `kcd0` |
| `PARAM_URL` (case 43) | 268–270 | `new ebd0(url)` |
| `OPEN_PAYMENT` | 138–142 | `new vbd0()` — payment screen |
| `OPEN_SCREEN` (enum string) | 24–43, 144+ | 90+ screen branches |

**No host/scheme validation of `link_start_url` or `PARAM_URL` is present in `blx`, `jlx`, or `IntentForwardingActivity`.** These values are consumed by WebView-backed screens (§4). This is the core of F-03.

### 2.3 Replay and callback spoofing — F-06 (Medium, Strongly Supported)

- The only anti-replay mechanism found is the caller-settable boolean extra `INTENT_ALREADY_PROCESSED` (`a\jlx.java:29,36`). Any app can craft an explicit intent with this extra absent or set as desired; it is not a nonce, signature, or timestamp.
- No HMAC/signature validation of deep-link parameters, no server-issued one-time token, and no expiration check were found in the inspected deep-link classes.
- `xbet://` is a global custom scheme; any installed app can register a competing handler, enabling **scheme hijacking / phishing** on devices where the user chooses "open with" or where the 1xBet app is not installed. Android App Links (`https://1xbet.com/...` with `autoVerify`) are the stronger path but only cover `/line` and `/live`.
- **Payment callback / redirect URLs:** The payment WebView itself implements `l(Uri)` (see §4.3) where a page navigation to `/office/verification?type=sumsub` triggers a verification callback, and `sobflous://`, `sberpay://`, `https://kaspi.kz` trigger external intents. These are matched by **string prefix / path substring checks on attacker-influenced page navigation**, not by a signed server-side callback. A page loaded in the WebView (if an attacker can get their URL loaded, see F-03) can initiate these flows. **Exploitability Unverified** — requires confirming whether the WebView can actually be navigated to attacker content and whether downstream payment state is server-authorized.

### 2.4 Mermaid — deep-link / payment callback attack surface

```mermaid
flowchart TD
    A[Attacker: crafted link / QR / message] --> B{Entry point}
    B -->|https://1xbet.com/line,/live| C[IntentForwardingActivity<br/>manifest L158-185 autoVerify]
    B -->|https://1xbet.onelink.me/*| C
    B -->|xbet://openapp|open|telegramBot| C
    B -->|3rd-party app: explicit Intent<br/>link_start_url / PARAM_URL| C

    C --> D[j120.f0 - no-op in this build<br/>a/j120.java:1314-1344]
    C --> E[jlx.a - INTENT_ALREADY_PROCESSED<br/>a/jlx.java:21-41]
    E --> F[blx.b - extras to screen models<br/>a/blx.java:50-483]
    F -->|link_start_url / PARAM_URL<br/>NO host validation| G[URL-carrying screen model<br/>ebd0 / rad0 / wbd0]

    G --> H[PaymentWebView.d<br/>PaymentWebView.java:122-136<br/>prepends http:// to non-http strings]
    H --> I[Payment WebView<br/>JS enabled + file access + payment request]

    I --> J[paymentWebHandler JS bridge<br/>a/l3v0.java:22-34]
    J -->|openInBrowser JSON url| K[OpenInBrowserAction v890<br/>external browser / Intent]

    I --> L[PaymentWebView.l Uri router<br/>lines 210-299]
    L -->|/office/verification?type=sumsub| M[Verification callback]
    L -->|sobflous:// sberpay:// kaspi.kz| N[External payment app Intent]
    L -->|browserintent:// / intent://| O[Intent.parseUri -> external launch]
    L -->|*.pdf| P[docs.google.com/gview?url=...]

    Q[MITM: cleartext=true + user CA trusted<br/>network_security_config.xml] -.->|can rewrite any hop| C
    Q -.->|can rewrite page/payment response| I
```

---

## 3. Local storage

### 3.1 Encrypted preferences (positive, with fallback)

`a\vwb0.java`:

- Line 14: `this.f38143a = str.concat("SECURE_SHARED_PREFERENCES");`
- Lines 23–47: plain `SharedPreferences`-style API (`c/getString`, `h/putString`, `e/putBoolean`, `f/putInt`, `g/putLong`, `i/remove`).
- `a\f8i.java:147`: `new vwb0(us00Var3, packageName2)` → preference file name is effectively `org.xbet.client1SECURE_SHARED_PREFERENCES`.
- `a\gvb0.java` case 1 delegates to `a\n2x.w(context, name)`.
- **`a\n2x.java:1235-1253`**: `w()` constructs a `y78` master key with `AES256_GCM` backed by Android Keystore (`KeyGenParameterSpec`, `xvw.v(y78Var)`, `uwn.a(...)` = `EncryptedSharedPreferences.create`). **On any exception it falls back to plain `getSharedPreferences(str, 0)`** (lines 1248–1251).

**Assessment (F-10, Low, Confirmed):** Sensitive config is *normally* encrypted with a Keystore AES256-GCM master key — a good control. The silent plaintext fallback on Keystore failure / unsupported API is the residual weakness. Observed keys in this store include `SAFE_DOMAIN`, `ATTEMPTS_VALUE` (`a\bl50.java:55,68`; `a\ot10.java:571,585,873`), and `FAKE_APP_GUID` (`a\a3n0.java:185,392`; `a\knf0.java:27-33`). No plaintext auth token was found in this store in static analysis.

### 3.2 Other SharedPreferences observed

First-party / app-relevant names from `rg getSharedPreferences`:
- `widget_shared_prefs` (`a\a56.java:71`, `a\dz5.java:247`, `a\kk0.java:118`)
- `GamesPreferences` (`a\lsn.java:270`)
- `authsdk` (`a\pv00.java:1042`)
- `rate_limit_backoff_storage` (`a\sz2.java:263`)
- Third-party: `appsflyer-data`, `appsflyer-purchase-data`, `FirebasePerfSharedPrefs`, `com.google.firebase.*`, `com.google.android.gms.*`, `oksdkprefs`, `ok.payment`, `com.vkontakte.android_pref_name`, `_GRECAPTCHA`, `androidx.work.util.preferences`, `frc_*_settings`, `google.analytics.deferred.deeplink.prefs`.

`res\xml\appsflyer_backup_rules.xml` excludes AppsFlyer prefs/DB from backup; with `allowBackup="false"` this is belt-and-braces.

### 3.3 Room database

`org\xplatform\onexdatabase\OnexDatabase.java` (lines 24–54):

- Abstract Room database `OnexDatabase extends zdg0`, with **45 entities** (`j = {j2e.g ... j2e.Y}`, line 25) and **13 DAOs** (`i()` through `v()`, lines 27–53).
- `OnexDatabase_Impl.java` is the generated implementation with 13 lazy DAO fields (lines 37–52).
- **No SQLCipher / Room encryption / passphrase wrapper was found** in the decompiled sources. Room defaults to an unencrypted SQLite file in `/data/data/org.xbet.client1/databases/`.

**Assessment (F-11, Low, Strongly Supported):** cached betting/game/config data is at rest in plaintext SQLite. On a rooted device or via forensic acquisition it is readable. Whether it contains PII or session material requires runtime database inspection — **Unverified**. The explicit DB filename was not recoverable from the decompiled Java (constructed through obfuscated DI); check smali or runtime `getDatabasePath()`.

### 3.4 Files, logs, keystore

- No first-party plaintext token/card/PII logging was found: a filtered search of `Log.[devwe](...)` in `org\xplatform` for `token|password|auth|secret|key|card|pin|session` returned no matches. Kotlin `data class toString()` implementations do print tokens (e.g. `org\xplatform\security\api\presentation\models\TokenRestoreData.java:53`, `CheckEmailScreenParams.java:70,139,207`, `SocialStateModel.java:71,74`), but these are model debug strings, not confirmed logcat output. **Unverified** whether any logging framework writes them.
- `SYSTEM_ALERT_WINDOW`, `WRITE_EXTERNAL_STORAGE`, `ACCESS_ALL_DOWNLOADS` and `requestLegacyExternalStorage="true"` permit broad file visibility; the app-update service (`org\xplatform\app_update\impl\presentation\apk_service\AppUpdateDownloadApkService`, manifest line 332) writes an APK to storage — validate the destination and signature-check before install (**runtime required**).
- Android Keystore is used indirectly for the EncryptedSharedPreferences master key (`a\n2x.java:1238-1247`); AppsFlyer has its own `AFKeystoreWrapper`. No direct `KeyStore.getInstance` usage found in first-party classes.

---

## 4. WebView security

### 4.1 Payment WebView setup — `org\xplatform\feature\office\payment\impl\presentation\view\PaymentWebView.java`

Constructor lines 71–110:

| Line | Setting | Assessment |
|------|---------|------------|
| 80 | `setDomStorageEnabled(true)` | expected |
| 81 | **`setJavaScriptEnabled(true)`** | required for payment pages, but increases bridge risk (F-04) |
| 82–83 | `setLoadWithOverviewMode(true)`, `setUseWideViewPort(true)` | cosmetic |
| 84 | **`setAllowFileAccess(true)`** | unnecessary for remote payment pages; file:/// access enabled |
| 86–103 | `if (z4v0.a("PAYMENT_REQUEST")) ... d4v0Var.o()` | `a\zlt0.java:239-241` shows this calls `WebSettingsBoundaryInterface.setPaymentRequestEnabled(true)` (Payment Request API), not a file-access escalation |
| 106–107 | WebChromeClient `gb90`, WebViewClient `hb90` | custom clients |

No `setAllowUniversalAccessFromFileURLs`, `setAllowFileAccessFromFileURLs`, `setMixedContentMode`, or `setWebContentsDebuggingEnabled` call in `PaymentWebView` itself. A global search found **no** `setAllowUniversalAccessFromFileURLs` anywhere in the decompiled tree (positive). `setAllowFileAccess(true)` is widespread across WebView wrappers (`a\bg0.java:919`, `a\bib.java:175`, `a\cbg0.java:45`, `a\df.java:33`, `a\dwf0.java:40`, `a\kxc0.java:181`, `a\l590.java:392`, `a\lmg0.java:72`, `a\nzo.java:43`, `a\otp0.java:542`, `a\pfl.java`, `a\qwc0.java:185`, `a\u3v0.java:41`, `a\w590.java:243`, `a\whn0.java:231`, `a\yax.java:49`).

**`setWebContentsDebuggingEnabled(true)`** appears in `a\nzo.java:67`, `a\r790.java:72`, `a\o890.java:257`, and several others — **but each observed call is guarded by `(getApplicationInfo().flags & 2) != 0`** (`ApplicationInfo.FLAG_DEBUGGABLE`), e.g. `a\o890.java:256-258`. In a release build this should be false. **Action:** verify the shipped APK is not debuggable (check `android:debuggable` in the binary AndroidManifest / `aapt dump badging`).

### 4.2 Unvalidated URL loading — F-03 (High, Strongly Supported)

`PaymentWebView.d(String str, Map map)`, lines 122–136:

```java
String host = Uri.parse(str).getHost();
if (host == null) host = "";
this.i = host;                      // used only to flag cross-host navigation in l()
...
if (!c.x(str, "http", false) && !c.x(str, "mailto", false) && !c.x(str, "tel", false)) {
    str = "http://".concat(str);    // ANY other string becomes an HTTP URL
}
super.d(str, map);
```

Problems:
- `c.x(str, "http", false)` is a **prefix** check, so `javascript:`/`file:`/`data:`/`xbet:` etc. fall through and are turned into `http://javascript:...` — no allowlist, no `Uri.getScheme()` validation, no HTTPS enforcement.
- Combined with F-01 (`cleartextTrafficPermitted=true`), loading `http://attacker.tld` is fully permitted.
- Inputs reaching this path originate from intent extras (`link_start_url`, `PARAM_URL`) via `a\blx.java` (§2.2) and from server-driven configuration.

**Impact:** An attacker able to supply a deep link/intent URL can present an arbitrary page inside the app's payment WebView, which (a) has JavaScript and file access enabled, and (b) has a privileged JS bridge (§4.4). This is a credible **payment credential/phishing** primitive. A server-side authorization step may still protect actual money movement — **Unverified**.

### 4.3 WebView URL/intent router — `PaymentWebView.l(Uri)` lines 210–299

- Lines 216: sets `this.h` when host differs from the originally loaded host (cross-host navigation flag).
- Lines 220–231: path `/office/verification` with query `type` → invokes verification callback (`sumsub` → `mbu0.SUM_SUB`).
- Lines 232–238: `sobflous://`, `sberpay://`, `https://kaspi.kz` → external `ACTION_VIEW` Intent.
- Lines 239–246: any URL ending `.pdf` → `https://docs.google.com/gview?embedded=true&url=` + **raw URI** (unencoded concatenation) → external viewer.
- Lines 247–252: `mailto:`, `tel:` → external intent.
- **Lines 253–259:** `browserintent://` prefix is stripped (`c.r(string, "browserintent://", "", true)`) and the remainder is passed to `Uri.parse()` and launched as an external `ACTION_VIEW` intent — **arbitrary scheme/URL launch driven by page navigation**.
- **Lines 260–267:** `intent://` URLs are parsed with `Intent.parseUri(string, 1)` (`URI_INTENT_SCHEME`) and the resulting Intent is invoked externally. This is the classic Android `intent://` scheme surface; exploitability depends on the downstream handler and Android version — **Unverified**.
- Lines 268–294: otherwise a predicate callback `this.o` is consulted; Telegram/Viber scheme handling; non-http schemes get an external `ACTION_VIEW`.

### 4.4 JavaScript bridges — F-04 (Medium–High, Strongly Supported)

Registered bridges (from global `addJavascriptInterface` search):

| File / line | Bridge name | Notes |
|-------------|-------------|-------|
| `a\o890.java:353` | **`paymentWebHandler`** | payment flow; `new l3v0(...)` |
| `a\xj80.java:590` | **`paymentWebHandler`** | second payment flow |
| `a\a2v0.java:78`, `a\w1v0.java:80`, `a\sic.java:107` | `MobileAppApi` | general web screens |
| `a\bib.java:181`, `a\kxc0.java:188`, `a\qwc0.java:192`, `a\w590.java:281` | `MobileAppApiV2` | general web screens |
| `org\xplatform\game_broadcasting\...\GameZoneWebView.java:85` | `Mobile` | game zone |
| `a\otp0.java:547` | `GPWebAppBridge` | game/payment provider |
| 3rd-party | reCAPTCHA, VK, OK, Yandex | third-party SDKs |

`a\l3v0.java` — the payment bridge surface is small but sensitive:

```java
@JavascriptInterface                                  // line 22
public final void openInBrowser(String str) {         // line 23
    if (str == null) return;
    String str2 = ((k3v0) vbyVar.b(serializer, str)).f17638a;  // JSON -> OpenInBrowserData.url
    if (str2 == null) return;
    this.b.invoke(str2);                              // emits OpenInBrowserAction(url)
}
@JavascriptInterface                                  // line 36
public final void redirectToPersonalProfile() { ... } // line 37
```

`k3v0.java:12,16-38` is a pure data holder (`OpenInBrowserData(url=...)`) — **no URL validation**. `a\v890.java` wraps it as `OpenInBrowserAction(url=...)`; `a\o890.java:330-337` sends it on an internal channel. **No scheme or host allowlist was found in the bridge itself.** Downstream handler (likely external browser via `ACTION_VIEW`) was not fully traced — hence Strongly Supported rather than Confirmed.

**Remediation:** validate `url` inside `@JavascriptInterface` against an explicit https-only host allowlist; reject `javascript:`, `file:`, `intent:`, `content:`; require user confirmation before external navigation; consider `@JavascriptInterface` only on trusted, pinned origins and remove `setAllowFileAccess(true)`.

### 4.5 Custom Tabs / external browser

Manifest `<queries>` includes `android.support.customtabs.action.CustomTabsService` (lines 47–48) and `http`/`https` VIEW (lines 43–45, 71–73). Yandex AuthSDK uses `ChromeTabDataActivity`/`ChromeTabLoginActivity` (manifest 360–379). Custom Tabs are used for OAuth, which is appropriate. No Custom Tabs use was identified for the payment flow itself (payment uses the in-app WebView above).

---

## 5. Native libraries

Loaded libraries and their Java load sites (global `loadLibrary` search):

| Library | Load site | Function (evidence) |
|---------|-----------|---------------------|
| `libkeys.so` | `a\mc0.java:261` | `org.xplatform.secret.impl.KeysImpl` native methods |
| `libsecurity.so` | `a\p23.java:153` | `org.xplatform.secret.impl.SecurityImpl` native methods |
| `libantifraud.so` | `a\n230.java:91`, `a\qgx.java:78` | `org.xplatform.fingerprint.impl.JniProfiler`, `MathTribunal` |
| `libantifraud_audio.so` | `a\a04.java:32` | `org.xplatform.fingerprint.impl.AudioTract` |
| `libtoolChecker.so` | `com\scottyab\rootbeer\RootBeerNative.java:13` | RootBeer root detection |
| `libsdk_bc_lib.so` | `com\appsflyer\internal\AFa1iSDK.java:13` | AppsFlyer anti-fraud / SDK integrity |
| `libdatastore_shared_counter.so`, `libimage_processing_util_jni.so`, `libsurface_util_jni.so`, `libandroidx.graphics.path.so` | AndroidX / camera | benign support libs |

Tooling note: `nm`/`objdump`/`readelf` were not available; string extraction used `rg -a -o '[ -~]{6,}'` directly on the ELF files in `apktool_out\lib\arm64-v8a\` (and the same `armeabi-v7a` files exist).

### 5.1 `libkeys.so` — embedded secrets (F-02, High)

JNI symbols observed (exact strings in the binary):
`Java_org_xplatform_secret_impl_KeysImpl_getNativeItsMeRedirectUrlLib`, `...getNativeItsMeClientIdLib`, `...getNativeItsMeServiceLib`, `...getOkIdLib`, `...getOkKeyLib`, `...getOkRedirectUrlLib`, `...getMailruPrivateKeyLib`, `...getMailruIdLib`, `...getMailruCallbackUrlLib`, `...getClientDiscordIdLib`, `...getDiscordCallbackUrlLib`, `...getLowThen1kLib`, `...getMoreThen1kLib`, `...getPartnerLowThen10kLib`, `...getPartnerMoreThen10kLib`, `...getVipLib`, `...getUralPlusLib`, `...getUralMinusLib`, `...getNativeConfigKey`, `...getEmulatorTxtDomainLib`, `...getTestSectionKeyLib`, `...getTestTxtLib`.

Corresponding Java declarations in `org\xplatform\secret\impl\KeysImpl.java` lines **1291–1374**, including:
- `getMailruPrivateKeyLib(String applicationId, boolean isTest)` (line 1321) — **private key**
- `getFatmanTokenLib(String applicationId, boolean isTest)` (line 1309) — **token**
- `getFirstKLib()`, `getFirstVLib()`, `getSecondKLib()`, `getSecondVLib()`, `getMatchKeyLib()`, `getAlphabetLib()`, `getVersLib()` — key material
- `getMailruCallbackUrlLib`, `getOkRedirectUrlLib`, `getDiscordCallbackUrlLib` — OAuth redirect URLs
- `getEmulatorTxtDomainLib()` (line 1307) — anti-emulator config domain

Embedded config-name strings in the binary: `defaultSocialKeys`, `oneXSpin`, `oneXSlots`, `oneXGames`, `checkEnvironment`, `config_main_key`, `config_stage_key`, `emulator_txt_domain`, `test_section_key`, `melbet_*` / `x_care_*` variants — indicating **white-label key sets selected by applicationId**.

**Impact:** All of these are recoverable statically (the strings are literally in the `.so`) and trivially at runtime by calling the public JNI methods. Long-lived private keys/tokens must be considered compromised. OAuth redirect URLs are client-side trust anchors and can be abused for token interception if the corresponding server configuration is weak. **Confidence: Confirmed** for the presence and names of these secrets; the actual plaintext values were **not** decoded in this assessment.

### 5.2 `libsecurity.so` — AES key/IV material (F-02, High)

JNI symbols: `Java_org_xplatform_secret_impl_SecurityImpl_encrypt`, `...decrypt`, `...getNativeKey`, `...getNativeIV`; internal functions `fakeXor`, `encrypt`, `decrypt`, `base64_encode`, `base64_decode`, `checkEnvironment`, `valid_client_packages`, `isCasino`, `checkException`.

Java declarations: `org\xplatform\secret\impl\SecurityImpl.java:155-157` (`getNativeIV`, `getNativeKey`).

Embedded key/vector selector strings:
`default_key`, `casino_key`, `xcare_key`, `app_300_key`, `affiliate_key`, `esimus_key`, `sms_grabber_key`, and matching `default_vector`, `casino_vector`, `xcare_vector`, `app_300_vector`, `affiliate_vector`, `esimus_vector`, `sms_grabber_vector`. Also multiple base64-looking constants, e.g.:
`XVUCB1cDSlYAVVxVCgAODwRCSFEMUQoDCAcWA0UEWV8=`, `PBAuHlwAIEN7RGwqGwtBYksjKzQmU2FLQHQ5AjMwWgoHEXYRbUYyNkQGRBRYVF8nVm4aQXllUVYiWX9we0sWEg==`, `U1NRVl8FQAQFAQBQUFABXgtLT1NZAwEGXVYTBhMHCVw=`, `XVFVXVkNSwcABQpQXAcLAQdKTVZcdgQCDAJEBEBSXlNTUwMzATBTV0AAAVNZUFFTXAVOcgYCDFVacw0OATZNJw==`, `WF5SXFoETXcCBA1XXgQMDAUzTFFedwdwDgFBBkJTW1w=`, `CFIHBlsAH1JSAg9UWFZcDAIRTFNQVwQFCwtHUBZeXg8=`, `KCNTU1wDPwINdglUXnYAeQc0S1BccHNyegFGC0NVUS4=`.

These appear to be XOR/base64-obfuscated keys (consistent with `fakeXor`). Names such as `sms_grabber_key` are notable and warrant follow-up on what data is being encrypted.

**Remediation:** Treat all shipped key material as public. Move server-side validation server-side; use per-install keys derived from Android Keystore with remote attestation; never use a static AES key/IV for user data; rotate all exposed credentials.

### 5.3 `libantifraud.so`, `libantifraud_audio.so`, `libtoolChecker.so`, `libsdk_bc_lib.so`

- `libantifraud.so`: JNI `Java_org_xplatform_fingerprint_impl_JniProfiler_pingWithParams` and `Java_org_xplatform_fingerprint_impl_MathTribunal_runFpuStress`; imports `sincos`, `libm`. Looks like **device/timing fingerprinting and emulator stress probing** (FPU behavior differs on emulators).
- `libantifraud_audio.so`: `Java_org_xplatform_fingerprint_impl_AudioTract_getHardwareAudioProfile`, uses AAudio stream builder APIs — **audio hardware fingerprinting**; explains `RECORD_AUDIO`/`HIGH_SAMPLING_RATE_SENSORS`.
- `libtoolChecker.so`: RootBeer — `Java_com_scottyab_rootbeer_RootBeerNative_checkForRoot`, `setLogDebugMessages`, `exists(const char*)`, strings `LOOKING FOR BINARY: %s PRESENT!!!` — **root/tool detection**.
- `libsdk_bc_lib.so` (3.3 MB, by far the largest): AppsFlyer `Java_com_appsflyer_internal_AFb1nSDK_afRDLog`; imports `dlopen`, `__system_property_*`, `syscall`, `faccessat`, `unlink` — **AppsFlyer anti-fraud / SDK integrity / environment inspection**.

Java-side corroboration: root detection in `a\tgk.java` (uses `RootBeerNative` at lines 824–831; logs at 739, 789), `a\jeg0.java:24`, `a\vdx.java:220`; emulator detection in `a\a4e.java:371,668` (`droid4x`, `Emulator`, `Android SDK built for x86`, `google_sdk`, `sdk`), `a\elo.java:48` (`emulator`, `emu64a`, `emu64x`, `generic`, `vsoc`).

**Limitations:** No disassembler/decompiler was used; only JNI symbol names, imported functions and printable strings were extracted. Actual algorithms, obfuscation, packing, and native-side control flow are **Unverified**. `libsdk_bc_lib.so` appears packed/obfuscated — string output was mostly import tables.

---

## 6. Client-side trust, session, validation, pinning, anti-fraud

### 6.1 F-05 — Client-side trust assumptions (Medium, Probable)

- `SecurityImpl` / `KeysImpl` select secrets by `applicationId` and a Java `boolean isTest` parameter (`KeysImpl.java:1309,1317,1321,...`; `SecurityImpl.java:139-153`). The application ID is a **client-supplied string**, and the accompanying native `checkEnvironment` / `valid_client_packages` strings suggest the lib validates it. Any client-side allowlist of package names/environment can be patched or bypassed on a rooted device. Server-side authorization must not rely on these values.
- `FAKE_APP_GUID` / `FAKE_APP_GUID_ENABLED` (`a\knf0.java:27-33`, `a\a3n0.java:185,392`) allow the client identifier to be overridden from remote config and stored in preferences. If remote config delivery is intercepted (F-01), GUID-based device trust can be manipulated.
- No evidence was found that the deep-link/payment callbacks are signed or that the server validates a client-generated redirect target (F-06).
- **Improper authorization checks:** not directly assessable statically (server side out of scope). Every money-moving decision must be server-authoritative; this report does not claim otherwise. **Unverified.**

### 6.2 F-09 — Certificate pinning (Medium, Confirmed)

- `okhttp3\OkHttpClient.java:148,230,242` — default `CertificatePinner.c` is used unless the builder sets one. Global search found **no application code configuring `CertificatePinner` / `certificatePinner(...)`**.
- `res\raw\lets_encrypt_*.der` and `harica_dv_tls_rsa.der` are referenced **only** as `<certificates src="@raw/...">` trust anchors in `network_security_config.xml` and in `org\xbet\client1\R.java:17959-17974`. They are **CA trust anchors, not certificate/public-key pins**.
- Combined with `src="user"` trust and global cleartext, the TLS posture is materially weaker than pinning.

**Remediation:** Implement SPKI/leaf pinning (OkHttp `CertificatePinner.add()` or network-security-config `<pin-set>` with backup pins) for API/payment hosts; remove user CA trust in production.

### 6.3 F-12/F-14 — Root, emulator and tool detection (Info)

Documented in §5.3. These controls are **anti-analysis / device-integrity only**; no evidence they gate financial transactions. They are bypassable by standard tooling (Frida, Magisk hide, patched native libs). Note also that the audio/fingerprinting behavior may have privacy implications.

---

## 7. Runtime / dynamic analysis feasibility

### 7.1 What is available in this environment

Checks performed via shell:

- `Get-Command adb` → **not found**
- `Get-Command emulator` → **not found**
- Common SDK locations checked (`C:\Android`, `C:\Android\Sdk`, `C:\Program Files\Android`, `C:\Users\ramra\AppData\Local\Android\Sdk`, `D:\Android`, `D:\AndroidSdk`) → **none exist**
- `adb devices` → **not runnable**
- `python` → **not found**
- Available: PowerShell, `rg` (ripgrep), JADX output, apktool output, REA MCP tooling.

**Conclusion:** **No Android emulator, no physical device, no Android SDK, and no adb are available.** This assessment is therefore strictly static. No attempt was made to install/run the APK or contact any network service.

### 7.2 What would be needed

1. Android SDK Platform Tools (`adb`, `fastboot`) + emulator system image (API 33–35, Google APIs or Play Store image) via Android Studio / `sdkmanager`, **or** a rooted physical test device with USB debugging enabled.
2. A dedicated test account and an isolated test network; no production deposits, withdrawals or bets.
3. Dynamic instrumentation: `frida-server` + `frida`/`objection` for Java and native hooking; optionally Magisk + Shamiko to root without tripping RootBeer.
4. TLS interception: Burp Suite / mitmproxy with a CA installed as a **user** CA (this app explicitly trusts user CAs) — though note that for a faithful production assessment the user CA should be removed from the build.
5. `aapt`/`apkanalyzer` for binary manifest inspection, `d8`/`baksmali` for smali-level confirmation of obfuscated branches, and a native disassembler (Ghidra/IDA/radare2/objdump) for `.so` analysis.
6. Root access on the guest to pull `/data/data/org.xbet.client1/shared_prefs/`, `/databases/`, `/files/`, and the extracted `lib/` directory.

### 7.3 Findings requiring runtime confirmation

| Finding | What runtime must establish |
|---------|-----------------------------|
| F-01 | Actually intercept a TLS session with a user CA; confirm which API hosts are reached over cleartext HTTP. |
| F-02 | Call `KeysImpl`/`SecurityImpl` native methods with Frida to dump real key/token values; disassemble `.so` for the obfuscation algorithm. |
| F-03 | Confirm which deep-link extra reaches `PaymentWebView.d()`; verify an arbitrary host can be rendered; check whether server-side payment state is still authoritative. |
| F-04 | Invoke `paymentWebHandler.openInBrowser()` from injected JS and trace the resulting `OpenInBrowserAction` to the final Intent/browser call. |
| F-05 | Patch/override `applicationId` and `isTest` and observe whether server requests are still authorized. |
| F-06 | Test deep-link replay, cross-app `xbet://` hijack, and whether any callback token is accepted twice. |
| F-07 | Test `browserintent://` / `intent://` navigation from WebView content with a benign test intent; confirm component resolution. |
| F-08 | Verify release APK's `android:debuggable` flag and confirm CDP debugging is unavailable. |
| F-10/F-11 | Pull live `shared_prefs` and Room DB; determine fallback path taken, and whether PII/session tokens are stored. |
| F-12 | Verify whether root/emulator detection blocks any sensitive flow or only reports telemetry. |
| §1.3 | Check whether `REQUEST_INSTALL_PACKAGES` self-update URL can be influenced via the MITM position; verify APK signature validation before install. |

---

## 8. Recommendations (prioritized)

1. **P0 — Harden network config:** production `cleartextTrafficPermitted="false"`, remove `src="user"` and all proxy domains; add SPKI pinning for API and payment hosts with backup pins.
2. **P0 — Remove client-side secrets:** rotate all keys/tokens currently embedded in `libkeys.so`/`libsecurity.so`; move OAuth client secrets and redirect-URL trust server-side; use Keystore-derived per-install keys; remove the plaintext-preference fallback.
3. **P0 — Validate every WebView URL:** https-only + strict host allowlist at `PaymentWebView.d()`, in `a\blx.java` before constructing URL screens, and inside every `@JavascriptInterface` (`l3v0.openInBrowser`). Remove `setAllowFileAccess(true)` from payment WebViews. Remove or strictly gate `intent://` / `browserintent://` handling.
4. **P1 — Deep-link hardening:** server-issued single-use nonce + HMAC for any link that affects account/payment state; do not trust `INTENT_ALREADY_PROCESSED`; prefer verified App Links over the `xbet://` custom scheme; validate `https://1xbet.com` host/path/query strictly (avoid prefix `startsWith`).
5. **P1 — Verify self-update integrity:** signature-check downloaded APKs and fetch update metadata only over pinned TLS; re-evaluate `REQUEST_INSTALL_PACKAGES`, `READ_PRIVILEGED_PHONE_STATE`, `SYSTEM_ALERT_WINDOW`.
6. **P2 — Reduce surface:** remove exported `androidx.compose.ui.tooling.PreviewActivity` from release; confirm all AndroidX exported components are necessary; keep `allowBackup=false`.
7. **P2 — Storage:** encrypt Room DB if it contains PII/session data; audit what `sms_grabber_key`-encrypted data is stored and why.
8. **P3 — Anti-analysis:** recognize that root/emulator/tool detection is bypassable and must never be the sole authorization control.

---

## 9. Facts vs. hypotheses

**Established facts (from artifacts):** manifest attributes and exported list; resolved deep-link strings; network security config contents; presence and JNI names of all listed native methods and embedded string constants; WebView settings and JS bridge methods; intent-extra-to-screen mapping in `blx`; EncryptedSharedPreferences-with-plaintext-fallback implementation; Room schema size; absence of adb/emulator/SDK; absence of application-configured OkHttp CertificatePinner.

**Hypotheses / inferred:**
- That the proxy-tool domains and user-CA trust are leftover debug configuration (rather than intentional) — *Probable*.
- That `libsecurity.so` key constants are XOR/base64-obfuscated keys (names and `fakeXor` symbol suggest this, values not decoded) — *Probable*.
- That `OpenInBrowserAction` ultimately launches an external browser/Intent — *Strongly Supported*, downstream not fully traced.
- That `j120.f0` originally re-dispatched to another package (now a no-op due to JADX string-resolution loss) — *Unverified*.
- That the Room DB or preferences contain session tokens/PII — *Unverified* (requires runtime data inspection).
- That payment state can be changed from a spoofed WebView — *Unverified*; server-side authorization may fully mitigate impact.

**Not performed:** no APK execution, no emulator, no network requests, no deposits/withdrawals/bets, no dynamic instrumentation, no exploitation against any service.
