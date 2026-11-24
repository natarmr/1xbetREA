# 21. Passive Runtime Observations on Connected Android Device

## Scope and boundary

The device became reachable over USB on the second attempt. All actions so far were **read-only**: identity queries, package listing, `dumpsys`, `logcat -d`, `pm path`, `adb pull` of the installed APK, and one screen capture. No app was started, no UI was clicked, no login, bet, deposit or withdrawal was performed. A screen capture accidentally showed a different personal app; the file was deleted immediately and its contents are neither recorded nor described here. Future screen captures will only be taken when the 1xBet app is the focused app.

## Device identity

| Property | Value |
|---|---|
| Serial | `5LVCGQ7XGAMJGMPV` |
| Model / brand | `CPH2607` / OPPO (Reno11 Pro 5G family) |
| Product | `CPH2607IN`, device `OP5AD3L1` |
| Android | 16 (SDK 36), security patch 2026-10-01 |
| Build fingerprint | `OPPO/CPH2607IN/OP5AD3L1:16/BP2A.250605.015/U.R4T2.54f490f-2ec2793-2ec2794:user/release-keys` |
| ABIs | arm64-v8a, armeabi-v7a, armeabi |
| Root / debuggable | `ro.secure=1`, `ro.debuggable=0`; release-keys — **not rooted, not debuggable** |
| ADB client | platform-tools 37.0.3 (REA configured via `REA_ADB_PATH`) |

## Installed 1xBet package

- Package present: `org.xbet.client1`, installed 2026-11-24 04:04:25.
- Version name `1xbet-prod-v260.1.0`, code `26001000` — **identical** to the supplied APK analysed in Sections 1–20.
- Single APK path: `/data/app/~~tjmr-G2VwlssNu8JyKN6Ag==/org.xbet.client1-aokaOfkmYc4LteJLl7oBxg==/base.apk`.
- Installer: `com.google.android.packageinstaller`; originating app: `com.coloros.filemanager` — i.e. **sideloaded from the file manager**, not installed from a store.
- No dangerous permissions are currently granted (location, camera, microphone, phone state, storage, notifications all `granted=false`).
- No 1xBet process or service was running at the time of inspection; `logcat -d` contained no 1xBet-specific entries.
- `run-as org.xbet.client1` fails ("package not debuggable"), so app-private SharedPreferences / Room databases are **not accessible** without root. This confirms the limitation anticipated in Section 15.

## Important finding: installed APK is personalised per download

The installed `base.apk` has the **same byte length** (47,715,154) but a **different SHA-256** from the supplied APK:

- Supplied: `d0ae8e422e47b480c20fa170c5ff85e67ee6074a1ac106ce0f75890cb8a3133d`
- Installed: `0be645d235f92beed93817f9c2676d55497bbb0ca60cd8584a1346cf0bf64e47`

A proper per-entry stream hash comparison of all 6,213 ZIP entries found **exactly one differing entry**: `assets/init.json`.

| Field | Supplied APK | Installed APK |
|---|---|---|
| `apppDownloadId` | `07773786c17e5eaaa5a1fae91957c14d7422b338caa12fb13f9699edc4cd9213` | `0935a20ab9b646c3b7ae3b799f9de3bcc9efc603aa353bbcd3515ac86296a5b6` |
| `fatman_uuid` | `201b3c31-5cc5-1f08-abf4-5b466eda3645` | `225817de-4f3b-f14c-e502-c0ca350f6427` |

Everything else — code, resources, manifest, native libraries, all other assets — is byte-identical. The APK v2 signing-block signatures differ as a consequence of the changed entry, but the signer certificate is the same (`O=1xBet`, serial `156DAD81`, SHA-256 fingerprint `4941CDB8...`).

**Interpretation (Confirmed):** each distributed APK is personalised with a unique download ID and Fatman UUID embedded in `assets/init.json`. These are the identifiers discussed in Section 20 (behavioural data / A-B framework). This is a distribution/attribution mechanism, not a code difference. It means static analysis of any one sample APK cannot know the live identifiers of a particular installation.

**Practical consequence:** our decompiled code conclusions apply to the installed app, but any identifier-dependent behaviour (A/B assignment, install attribution, anti-fraud checks) will differ per installation.

## What remains unavailable on this device

- App-private data (SharedPreferences, Room DB, WebView cache) — needs root or a debuggable build.
- Frida hooking of `KeysImpl.getNativeConfigKey` to decrypt remote config / redirect payloads — needs root or repackaging.
- MITM traffic capture — needs a proxy configured on the device plus user-CA installation; not attempted.
- UI observation of 1xBet — the app is not currently foregrounded; no UI action taken.

## Runtime observations with the app in the foreground (logged out)

After the user brought the app forward, the focused activity was confirmed as `org.xbet.client1/org.xplatform.client1.LauncherAliasColor`, with process `org.xbet.client1` running as `u0_a1004` (pid 3059, RSS ≈ 490 MB).

**Screen (cropped screenshot: `reports/device_1xbet_top_cropped.png`)** — the logged-out **Top** tab shows:
- Top-level tabs: Top, Sports, Esports, Casino, 1xGames.
- Sport filters: All, Cricket, Football, Basketball, Tennis, Kabaddi.
- Promotional cards: "ILT20 free bet giveaway", "Crypto Freebet 30%", "Welcome package of up to 150 000 I…".
- Game row: All Games, Crash, Crystal, Burning Hot, Midgard Zombies.
- Sections: TOP-EVENTS (ILT20), Top LIVE (Sport), and bottom navigation Popular / Favorites / Bet slip / History / Menu.

This directly corroborates the static module map and the website cross-check (Sections 4, 6, 7, 20). A personal notification overlay was present in the raw capture; that region was cropped out and the raw file deleted.

**Logcat (bounded, `--pid=3059`, redacted):** no credentials, tokens or URLs were observed. Internal log lines are enabled in this production build and expose obfuscated action dispatch, e.g.:
- `I onCreateDialog: Current screen: a.qk4`
- `I System.out: ulg:onAction 🚀 Выполнение Action clg`
- `I System.out: tjb0:onAction 🚀 Выполнение Action p4l0`

These tie live behaviour to the obfuscated `a`-package classes found statically and show that verbose action logging is left on in the shipped build (low-severity information exposure).

## Next steps (require explicit go-ahead)

1. Ask the user to bring the **logged-out 1xBet app** to the foreground; then capture screens only of that app.
2. Optionally start the app via REA `start_adb_app` and observe which activities/permissions it requests — still passive.
3. Read bounded logcat filtered to the app process once it is running.
4. Do **not** log in, bet, deposit, withdraw, or click any money-related control.

No changes were made to the device.
