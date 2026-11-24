# 23. Offline Native Key Extraction and Remote-Config Decryption

## Method and result

Using Python 3.12 with `pyelftools` and `capstone`, the ARM64 native libraries from the APK were analysed **offline**: ELF sections, dynamic symbols, `R_AARCH64_GLOB_DAT`/`RELATIVE` relocations, `.rodata` strings, and targeted disassembly. No device or emulator was used.

**Result:** the AES key that decrypts `assets/remote-config/remote-config.json` was recovered statically and the 34 KB configuration was decrypted successfully. This closes the largest "Unverified" gap from Sections 3, 17 and 18 (for the **bundled** configuration; live fetched values can still differ).

## 23.1 `libkeys.so` — config keys (Confirmed)

`Java_org_xplatform_secret_impl_KeysImpl_getNativeConfigKey(int)` at `0x6168` branches on the argument:
- type `0` → GOT `0xae58` → symbol `config_main_key` (`.data` `0xf288`)
- type `1` → GOT `0xae60` → symbol `config_stage_key` (`.data` `0xf290`)
- other → null

The relocation chain resolves to these 32-byte ASCII keys:

| Symbol | Value | Role |
|---|---|---|
| `config_main_key` | `ZgudVs2IhRqaWqj7owMwNWc1Mvkj6GuH` | AES-256 key, type 0 (production) |
| `config_stage_key` | `asuperstrong32bitpasswordgohere0` | AES-256 key, type 1 (stage/test) |

Verification: `dataHex` (34,032 bytes) decrypts with `AES/CBC/PKCS5Padding`, IV = hex-decoded `ivHex`, using the **main** key. The stage key fails padding. Plaintext saved at `reports/remote_config_decrypted_main.txt` (34,026 bytes).

## 23.2 Decrypted bundled configuration — selected values (Confirmed for shipped defaults)

The plaintext is JSON `{"configKeys":{...},"version":"260.0.0"}`. Relevant flags:

| Flag | Shipped value | Relevance |
|---|---|---|
| `blockApp` | `false` | no kill switch active in bundled config |
| `isBettingEnabled` | `true` | betting enabled |
| `hasFinancial` | `true` | financial section enabled |
| `hasFinancialSecurityDepositLimits` | `false` | responsible-gaming deposit-limit feature off by default — **not** the source of changing payment minimums |
| `hasMAXBet` | `false` | no max-bet limit feature |
| `paymentRefreshLimit` | `30` | payment page refresh throttle (seconds), consistent with observed refresh cooldowns |
| `hasActualDomain` | `true`, `newActualDomain` `false` | domain-checker enabled (old-style) |
| `paymentHost` | `""` | payment host supplied at runtime, not bundled |
| `isAllowedProxySettings` | `true` | **explains the app's built-in Proxy settings screen** (Section 22) |
| `BlockDepositCupis`, `BlockDepositVerification`, `BlockWithdrawCupis`, `BlockWithdrawVerification` | all `false` | no payment blocks in bundled config |
| `hasBonusGames` | `true`; `hasGamesWildFreebet` `false`; `hasLuckyWheelHalloween` `false`; `holidayEvent` `halloween` with start/end timestamps | free-game feature state is remote-flag controlled |
| `mlPopularAllowedGeo` | `[192]`; `BettingEnabledGeo` `[]` | geo-gated ML/popular feature; betting geo list empty by default |
| `hasPromoRecommends`, `hasPopularGamesCarusel`, `hasViewed` | all `true` | recommendation carousels enabled |
| `menuTop`, `menuSport`, `menuOther`, `menuAggregator`, `menuGames` | explicit ordered arrays | remote-configurable navigation, matching `localConfig.json` |

**Correction to earlier sections:** remote-config *mechanism and key* are now Confirmed, and the bundled values above are known. What remains Unverified is only the **live fetched** configuration stored on the device at runtime.

## 23.3 `libsecurity.so` — second crypto layer (Confirmed presence)

`libsecurity.so` exports `SecurityImpl_encrypt`, `SecurityImpl_decrypt`, `SecurityImpl_getNativeKey`, `SecurityImpl_getNativeIV`, with key/IV pairs for seven profiles: `default`, `xcare`, `affiliate`, `esimus`, `sms_grabber`, `casino`, `app_300`. Each is a Base64-like constant resolved through relocations, e.g.:

- `default_key` = `KVZSUFYEQXJ1cXlRWHMLeXZEOCMtBwVzfQFLBkAnUS4nXHMxDEBdUEoNdFVSV1NWLw1PBAcOCCVfd3wPdTFOUg==`
- `default_vector` = `KyZeVFh1SwN3dX4nKXZ9CHc3PVFRdnZyCAUwdEVRLCg=`
- `sms_grabber_key`, `casino_key`, `xcare_key`, etc. — all extracted (full list in the analysis scripts).

These constants are obfuscated (the library contains `xor`, `fakeXor`, `base64_encode`, `base64_decode` routines). They are used for the second envelope layer (`a/z8w0.java`, `Accept: application/vnd.xenvelop+json`), not for the remote-config file.

## 23.4 Other embedded secrets in `libkeys.so`

Relocation-resolved strings include: Mail.ru OAuth ID/key/callback and **private key**, Discord client ID/callback, Fatman tokens for several product brands, emulator/anti-fraud domain `android2-virt.bet-1x.com`, partner/client package IDs (`org.xbet.jvspin`, `com.xslots.client`, `org.melbet`, `org.xbet.casino.one`, …), and a `valid_client_packages` table. This corroborates the earlier native-secret finding with exact values available to any static analyst.

## 23.5 What still cannot be done offline

- Decrypting **live fetched** config or encrypted API envelopes requires the runtime-selected values (and possibly server keys), which are not in the APK.
- The domain-checker redirect payloads are encrypted with the same family of keys but were never captured with bodies (MITM CA blocked), so their plaintext remains unknown.
- The exact `Sign` digest constant used in bet requests still needs the `a/kcx.java` body (JADX truncated some lambdas), though the key material is now partly visible.
