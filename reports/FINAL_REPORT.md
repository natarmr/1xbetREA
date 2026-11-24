# 1xBet Android APK — Comprehensive Reverse-Engineering & Security Investigation

**Target:** `D:\1xbetrea\1xbet.apk` · **Package:** `org.xbet.client1` · **Version:** `1xbet-prod-v260.1.0` (26001000)
**SHA-256:** `d0ae8e422e47b480c20fa170c5ff85e67ee6074a1ac106ce0f75890cb8a3133d` · **Analysis date:** 2026-11-24

**Method:** full JADX 1.5.7 decompilation (69,001 Java sources), apktool 3.0.3 resource decode, REA 6.7.0 + `jadx-headless-mcp 0.7.1` static analysis with incoming-reference tracing. Static analysis only — no APK execution, emulator, production network call, real bet, deposit or withdrawal.

> **Confidence notation:** **Confirmed** = directly proven by shipped code/config; **Strongly Supported** = multiple consistent code paths, no runtime proof; **Probable** = plausible inference with gaps; **Unverified** = requires backend, native key, or runtime evidence.

## Table of Contents

- 1. Executive Summary
- 2. APK Metadata and Technical Profile
- 3. Application Architecture
- 4. Internal Module Breakdown
- 5. Betting System: Complete Execution Flow
- 6. Recommendation Engine: Logic and Data Sources
- 7. Payment Architecture
- 8. Browser-Based Payment Processing
- 9. Payment Discrepancies and Root-Cause Analysis
- 10. Deposit and Withdrawal Limit Behaviour
- 11. Free Spins: Implementation and Algorithm Analysis
- 12. API Endpoint Inventory
- 13. Network Communication Diagrams
- 14. Database and Local Storage Analysis
- 15. Runtime Behaviour
- 16. Security Assessment
- 17. Confirmed Findings vs. Hypotheses
- 18. Unresolved Questions and Backend Dependencies
- 19. Final Technical Conclusions
- 20. Behavioural Data Collection, Personalisation and Downstream Forwarding
- 21. Passive Runtime Observations on Connected Android Device
- 22. MITM Traffic-Capture Attempt and Live Domain Observations
- 23. Offline Native Key Extraction and Remote-Config Decryption

- Appendix A — Supporting artefacts
- Appendix B — Full extracted endpoint list

## 1. Executive Summary

This investigation statically analysed the shipped `1xbet.apk` (package `org.xbet.client1`, version `1xbet-prod-v260.1.0`, SHA-256 `d0ae8e422e47b480c20fa170c5ff85e67ee6074a1ac106ce0f75890cb8a3133d`) using three complementary techniques: a full JADX decompilation (69,001 Java files), apktool resource/manifest decoding, and REA's JADX-backed Android analysis with incoming-reference tracing. No APK execution, emulator, production network call, real bet, deposit or withdrawal was performed.

The application is a Kotlin-first, multi-module Android client (85 first-party `org.xplatform` feature modules; Dagger 2 DI; OkHttp 5 with a Retrofit-style annotation layer; Cicerone navigation; Room; WorkManager; Firebase/HMS/AppsFlyer). Most business logic is additionally obfuscated into a flat `a` package, but Kotlin `@Metadata` and `kotlinx.serialization` descriptors preserve original class names and exact JSON field names, which made reliable reconstruction possible.

Five cross-cutting conclusions are supported by the shipped artifact:

1. **Server-authoritative money and odds.** Bet payloads, coefficients, stake bounds and win amounts are computed or validated by the backend. The client assembles `BetDataRequest` (34 JSON keys including `UserId`, `Summ`, `Events`, `Sign`) and sends it to `POST MobileLiveBetX/MobileMakeBet` with `X-Auth` bearer authentication; a client-side digest (`Sign`) is computed but the backend remains authoritative (Sections 5, 12). Odds changes are handled through `POST MobileLiveBetX/MobileUpdateCoupon` and a websocket at `/sockets/channel` (Section 5).

2. **A rotating, encrypted domain-checker controls where the app talks.** A mutable static host `ujn.h` is seeded to `https://mob-experience.space` (`a/ujn.java:22`) and is overwritten from `ru/redirect/api/getactualdomain` and `ActualDomain/v1/actual-domains/match-domain`, both carrying encrypted `dataHex`/`ivHex` payloads. This is anti-blocking / resilient infrastructure; the live current domain is Unverified statically (Section 3).

3. **Remote configuration can alter betting and financial behaviour.** The bundled `assets/remote-config/remote-config.json` is AES/CBC/PKCS5Padding-encrypted. The complete decryption chain was reconstructed: `a/wti.s()` → `a/mwn` (dataHex/ivHex) → `a/nrd.a()` → `a/ref.a():31`, with key from native `KeysImpl.getNativeConfigKey(0/1)` (`org/xplatform/secret/impl/KeysImpl.java:1328`) and IV from hex-decoded `ivHex`. Fetched config is merged over saved over bundled values and re-encrypted (`a/rxn.java:144-181`). Flag names include `hasFinancialSecurityDepositLimits`, `hasMAXBet`, `blockApp`, `paymentRefreshLimit`. Actual decrypted values are Unverified because the native key could not be executed/extracted statically (Section 3).

4. **Recommendations are backend-ranked and geo-targeted, not locally "AI".** The Aggregator/My Games screen is driven by ordered `nameType` carousels (`recommended`, `favorites`, `viewed`, `top_games`, `slots_popular`, `live_popular`, `crash_popular`) defined in bundled JSON and overridden remotely; country ID (default 225) and ISO code are inputs to the layout key (`a/knf0.java:38,42`, `a/mii0.java:1393-1395`). No scoring, weighting, or ML model exists in the APK; ranking happens server-side. A behavioural feedback signal (`promo_games_recomended_call`, `add_favor`, event 3295) is emitted (Section 6).

5. **Free-spin outcomes are backend-predetermined.** The Lucky Wheel request contains only `{WF: freeSpin, BAC: walletId}` (`a/jzk0.java:39`); the wheel animates to a sector supplied by the backend prize enum (`esr`/`uk10`, including `SPECIAL_BONUS=666`). Client RNG found in scratch card / lucky card / domino is cosmetic. A hidden Test Section exposes `testServerGame`, `manualTestDomain`, `isTestToolsEnabled` and a fallback domain `https://hfoweytnvkf.com` (`a/ot10.java:238`). Production free spins therefore interact with real backend promo systems; test isolation is opt-in, not structural (Section 11).

The security posture is mixed: positive controls include `allowBackup=false`, mostly non-exported components, `EncryptedSharedPreferences` with Keystore AES-256-GCM, and no universal WebView file access. However, `res/xml/network_security_config.xml` globally permits cleartext and trusts user CAs, OkHttp API traffic has no public-key pinning (the custom `a/tiq.java` handler is WebView-only issuer validation that calls `proceed()` on SSL errors), `libkeys.so`/`libsecurity.so` contain JNI-retrievable key material and secrets, the payment WebView prepends `http://` to arbitrary strings without a host allowlist, and deep-link/payment-callback handling relies on a caller-settable flag (Section 16). These are client-side weaknesses; whether they are exploitable against the live backend requires runtime testing (Section 18).

> Confidence notation used throughout: **Confirmed** = directly proven by shipped code/config; **Strongly Supported** = multiple consistent code paths, no runtime proof; **Probable** = plausible inference with gaps; **Unverified** = requires backend, native key, or runtime evidence.

---


## 2. APK Metadata and Technical Profile

### 2.1 Identity and build

| Property | Value | Confidence |
|---|---|---|
| File | `D:\1xbetrea\1xbet.apk` (47,715,154 bytes) | Confirmed |
| SHA-256 | `d0ae8e422e47b480c20fa170c5ff85e67ee6074a1ac106ce0f75890cb8a3133d` | Confirmed |
| Package | `org.xbet.client1` | Confirmed |
| Version | `1xbet-prod-v260.1.0`, code `26001000` | Confirmed |
| SDK | minSdk 24; targetSdk 37; compileSdk 37 | Confirmed |
| Application class | `org.platform.app.ApplicationLoader` | Confirmed |
| DEX | 7 files: classes.dex 9,799,176 B; classes2 9,142,716 B; classes3 10,463,164 B; classes4 10,924,388 B; classes5 10,658,536 B; classes6 12,746,584 B; classes7 66,636 B | Confirmed |
| Scale | 69,044 classes, 6,431 resource entries | Confirmed (REA `ev_a95f12a…`) |
| Build | AGP 9.4.1; git revision `4c23020c57da306c8e90ba584e839495089beaa7` | Confirmed |
| App label | `1xBet`; white-label strings also present: BetWinner, BetandU, FanSport, 1xBet-ke | Confirmed |
| Native ABIs | `arm64-v8a`, `armeabi-v7a` | Confirmed |

### 2.2 Signing identity

APK Signature Scheme v2 block present (pair ID `0x7109871A`, file offset 47,315,652); no v1 `META-INF` certificate. Signer certificate: Subject = Issuer = `O=1xBet`, serial `156DAD81`, valid 2016-09-23 → 2046-09-16, SHA-1 thumbprint `88FE04E7741DE72392139479786297ABDEC744E0`, signature algorithm `1.2.840.113549.1.1.11` (RSASSA-PKCS1-v1_5 with SHA-256). A v3.1 striding attribute pair (`0x42726577`) is also present. REA explicitly did **not** verify the APK signature; the values above were read directly from the signing block.

### 2.3 Manifest surface

32 activities, 30 services, 23 receivers, 10 providers, 42 intent-filters, 3 activity-aliases. Application attributes: `allowBackup="false"`, `networkSecurityConfig="@xml/network_security_config"`, `extractNativeLibs="true"`, `largeHeap="true"`, `requestLegacyExternalStorage="true"`, `dataExtractionRules`/`fullBackupContent` referencing AppsFlyer rules. Detailed security analysis in Section 16.

### 2.4 Analysis provenance

- REA MCP 6.7.0, `jadx-headless-mcp 0.7.1` (JAR SHA-256 `6e5eacf500b64292bfb73c49797c1958f6ee44646e43e868039ae7feb573ff75`), JDK 25.0.3 Temurin.
- JADX CLI 1.5.7 decompilation: 69,001 `.java` files; 961 methods failed decompilation (log `_tools/jadx.log`).
- apktool 3.0.3 decode: `apktool_out/` (smali skipped; Java-source recovery done by JADX).
- REA artifact inventory: 6,002 nodes / 6,432 occurrences / 6,431 edges, 0 integrity contradictions (evidence `ev_9e565541e68da3af44c0323540f5275fea6a98c7d44701be62e4ece70427d981`).
- 402 unique GET paths and 209 unique POST paths recovered from Retrofit-style annotations (Appendix B).

## 3. Application Architecture


**Target:** `D:\1xbetrea\1xbet.apk` — `org.xbet.client1`, version `1xbet-prod-v260.1.0` (versionCode `26001000`), 69,044 classes
**Analysis type:** AUTHORIZED static reverse-engineering of shipped artifacts only.
**Sources:** JADX decompiled Java (`D:\1xbetrea\decompiled\sources`), apktool output (`D:\1xbetrea\apktool_out`).
**Date:** 2026-11-24

---

### 0. Scope, method, and critical limitations

This report is derived **only** from static analysis of the APK: decompiled Java bytecode (JADX), decoded `AndroidManifest.xml`, resources, and native libraries present in the APK. **No runtime execution, no emulator, no network traffic to any 1xBet/production service, and no dynamic instrumentation was performed.** Static analysis proves what code *can* do; it does not prove what the app *actually* sends or receives at runtime. Backend behaviour (real key/IV values, whether an endpoint enforces auth server-side, what a live config blob decrypts to) cannot be established from the APK alone and is flagged `Unverified`.

Confidence scale used throughout:
- **Confirmed** — directly proven by decompiled code / manifest / resource in the shipped artifact.
- **Strongly Supported** — multiple independent code locations agree; minor ambiguity from decompiler artifacts only.
- **Probable** — inferred from naming/structure; no complete code path observed.
- **Unverified** — requires runtime or backend access.

> Note on deobfuscation: most first-party logic is compiled into the `a/` package with short names (e.g. `a.ofr` = Retrofit `@GET`, `a.kg80` = `@POST`, `a.nkd0` = `@Query`, `a.z190` = `@Path`, `a.jb8` = `@Body`, `a.xpv` = `@Header`, `a.dtv` = `@Headers`, `a.doo0` = `@Tag`). Feature-level code remains readable under `org/xplatform/**` (85 feature modules).

---

### 1. Architecture, languages, frameworks, SDKs

#### 1.1 Application entry point (Confirmed)

`AndroidManifest.xml:137` declares:

```xml
<application android:name="org.platform.app.ApplicationLoader" ...>
```

| Item | File | Evidence |
|---|---|---|
| Application class | `decompiled/sources/org/platform/app/ApplicationLoader.java:109` | `public class ApplicationLoader extends Application implements zyk, xs00, ak3, vmv, af3, vsd, jhg0, rj3, q1e, n5k0` |
| Main Activity | `decompiled/sources/org/xplatform/client1/features/appactivity/ApplicationActivity.java:231` | `extends yc3 implements ...` — single-top launcher activity (`AndroidManifest.xml:142`) |
| DI container (generated) | `decompiled/sources/a/g8i.java` (header) | `public final class g8i implements af3, DomainResolverDependencies, xjh0, i6a, oef { ... }` with hundreds of `n5d0`/`f8i` provider fields — a generated **Dagger 2** component |
| Additional Dagger component | `decompiled/sources/org/xplatform/domain/resolver/impl/di/DaggerDomainResolverComponent.java` | Dagger domain-resolver subcomponent |
| DI wiring in Application | `ApplicationLoader.java:351-386` | `g8i g8iVarC = c(); this.f46267a = mbl.a(g8iVarC.v); ... this.z = new ejc(i1w0Var);` — `mbl.a(...)` reads generated providers |

**Conclusion (Confirmed):** The app is a **Kotlin-first** Android application (Kotlin metadata/coroutines everywhere, `kotlinx.serialization`, Compose UI is present via `androidx`/`coil3`), built with **Dagger 2** (not Hilt — `ApplicationLoader` directly consumes a generated `AppComponent`-like class `a.g8i`; no `HiltAndroidApp`). Navigation uses **Cicerone** (`com.github.terrakok.cicerone`, `ApplicationLoader.java:104`, `:380-382`). Work is scheduled with **WorkManager** (`cpv0.d(...)`, `ApplicationLoader.java:313-321`).

#### 1.2 Languages / libraries observed (Confirmed unless noted)

| Category | Component | Evidence |
|---|---|---|
| Language | Kotlin (primary) + Java | Kotlin `@Metadata`, coroutines (`yje`/`zje` continuation classes), `kotlinx.serialization` serializers (`a/kwn.java`, `a/dhk0.java`, …) |
| UI | Jetpack Compose + classic Views | `androidx`, `coil3`, `org/xplatform/uikit*`, `fetVar` Compose composer params seen across `a/` classes |
| DI | Dagger 2 | `a/g8i.java`, `DaggerDomainResolverComponent.java` |
| Networking | **OkHttp 5.x** + a Retrofit-style annotation API layer | `okhttp3/OkHttpClient.java`, `okhttp3/internal/connection/ConnectPlan.java`, API interfaces annotated `@ofr`/`@kg80` in `a/` |
| Serialization | `kotlinx.serialization` (json), Gson-ish helpers | `vby`, `mwn.Companion.serializer()` (`a/asd.java:60`) |
| Crypto | JCA **AES/CBC/PKCS5Padding**, **Google Tink** (AES-GCM / AES-GCM-SIV / XAES-GCM primitives) | `a/ref.java:29-33`, `a/z8w0.java:23-25`, Tink key type URLs in `a/a70.java:13`, `a/epw0.java:191-208` |
| Local storage | SharedPreferences wrapper (`vwb0`), `AtomicFile` encrypted-config cache, **Room** (`OnexDatabase`) | `a/btt0.java:20,33`, `a/asd.java:35`, `a/g8i.java` imports `org.xplatform.onexdatabase.OnexDatabase` |
| Push/analytics | Firebase (FCM, Crashlytics, Remote Config, Perf), AppsFlyer, Customer.io, Huawei HMS, Yandex Auth, VK, OK, Discord, Telegram | `AndroidManifest.xml` meta-data + `com/google/firebase/**`, `com/appsflyer/**`, `com/huawei/hms/**` in sources |
| Native libs | `libkeys.so`, `libsecurity.so`, `libantifraud.so`, `libantifraud_audio.so`, `libtoolChecker.so`, `libsdk_bc_lib.so`, `libimage_processing_util_jni.so` | `apktool_out/lib/arm64-v8a/`, `System.loadLibrary(...)` calls (§4.4) |

#### 1.3 Module architecture (Strongly Supported)

`org/xplatform/**` contains 85 feature modules. Representative groups:

- **Core/infrastructure:** `core`, `domain`, `proxy`, `secret`, `services`, `feature`, `features`, `app_start`, `client1`
- **Betting:** `betting`, `make_bet`, `bet_history`, `bet_constructor`, `coupon`, `makebet_promocodes`, `sportgame`, `results`, `toto_bet`, `toto_jackpot`, `market_statistic`, `coef_type`
- **Payments/account:** `wallet`, `limits`, `limits_africa`, `limits_ee`, `limits_kenya`, `limits_ne`, `finsecurity_v2`, `personal`, `verification`, `responsible_game`
- **Bonus/gamification:** `bonuses`, `bonus_games`, `bonus_agreements`, `cashback`, `promotions`, `promo`, `reward_system`, `welcome_bonus`, `spin_and_win`, `lucky_wheel`, `scratch_card`
- **Casino/aggregator:** `aggregator`, `games_list`, `fast_games`, `onexdatabase`, `web`, `ufc`, `cyber`, `bonus_games`
- **Auth/security:** `authenticator`, `authqr`, `authreminder`, `auth_history`, `login`, `registration`, `pin_code`, `fingerprint`
- **Config/domain:** `democonfig`, `domain`, `feature` (test section lives under `feature/office/test_section`), `remote-config` models (obfuscated into `a/`)

```mermaid
graph TB
    M[AndroidManifest.xml<br/>application=org.platform.app.ApplicationLoader] --> AL[ApplicationLoader<br/>extends Application]
    AL --> DAG[a.g8i — generated Dagger AppComponent]
    DAG --> NET[OkHttp clients + interceptors<br/>(a/dk9 cache, a/z8w0 crypto)]
    DAG --> API[Retrofit-style API interfaces<br/>(a/*.java, @ofr GET / @kg80 POST)]
    DAG --> RC[RemoteConfig manager<br/>a/vff0 + a/asd + a/wti]
    DAG --> SEC[org.xplatform.secret.impl<br/>KeysImpl / SecurityImpl → native .so]
    RC --> SEC
    NET --> SEC
    API --> NET
    AL --> ACT[ApplicationActivity<br/>(single launcher, Cicerone router)]
    ACT --> MOD[85 org/xplatform feature modules]
    MOD --> API
```

---

### 2. Base URLs, domain checker, and API surface

#### 2.1 Hardcoded seed domain and domain-checker mechanism (Confirmed)

The API base host is **not** a single hardcoded production URL; it is resolved at runtime through a domain-checker subsystem and stored in a mutable static field.

| Finding | Evidence |
|---|---|
| Seed/default base URL | `decompiled/sources/a/ujn.java:24` → `public static String h = "https://mob-experience.space";` |
| The field is overwritten at runtime by resolvers | `a/p36.java:151`, `a/p36.java:195`, `a/to3.java:146`, `a/bl50.java:59`, `org/xplatform/app_start/impl/work/StartFailedLogWorker.java:210,338`, `org/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker.java:979` — all assign `ujn.h = str;` |
| Domain resolver module | `org/xplatform/domain/resolver/impl/di/DaggerDomainResolverComponent.java`, `DomainResolverDependencies.java` (exposes `getKeys`, `getSecurity`, `getPreferenceDataSource`) |
| Domain endpoints | `decompiled/sources/a/lyk.java:9-13` |
| Encrypted domain response model | `a/o930.java:13-16` — `org.xplatform.currentdomain.impl.data.model.MatchDomain` with `dataHex` + `ivHex`; `a/q930.java:8-53` |
| Plain domain response model | `a/ho.java:15-18` — `org.xplatform.currentdomain.impl.data.model.ActualDomain` with `domain`, `success`; `a/jo.java` |
| Redirect-stat endpoint | `a/w4w0.java:16,19` |

```java
// a/lyk.java:9-13  (plain API interface, annotated with obfuscated Retrofit annotations)
@ofr("ru/redirect/api/getactualdomain?id=2")
Object a(@nkd0("sign") String str, @nkd0("project_id") int i, yje<? super jo> yjeVar);   // returns ActualDomain

@ofr("ActualDomain/v1/actual-domains/match-domain")
Object b(@nkd0("projectId") int i, @nkd0("geo") String str, yje<? super dx5<q930>> yjeVar); // returns encrypted MatchDomain
```

Sanitized flow (Confirmed for the code path; the *resulting live domain* is Unverified):

1. App starts with `ujn.h = "https://mob-experience.space"` (`a/ujn.java:24`). This is used as a **placeholder/QA-looking seed**, not a production betting host.
2. `ru/redirect/api/getactualdomain?id=2` (params `sign`, `project_id`) or `ActualDomain/v1/actual-domains/match-domain` (params `projectId`, `geo`) is called.
3. The `match-domain` response carries `dataHex`/`ivHex` encrypted with the same AES/CBC construction as remote config (see §4) — the key function `KeysImpl.getMatchKeyLib()` exists (`KeysImpl.java:1323`) for this purpose.
4. Resolved domain string is assigned to `ujn.h` (`a/p36.java:151`, `a/to3.java:146`), after which it is used as the base URL for all API interfaces.

A secondary hardcoded CDN host mirror appears in `a/bjg0.java:9` (`https://hfoweytnvkf.com/static/img/...` — static game/image assets) and `a/azj0.java:48,68` uses `https://1xbet.com/` as a fallback/navigation URL. `ApplicationLoader.java:246` treats `https://mob-experience.space` as a special case to skip the local-time-diff worker.

> **Unverified:** which concrete domain(s) a given install resolves to, whether `sign` is a server-validated signature, and whether the domain-check response can be tampered with at runtime — these require observing/controlling the network.

#### 2.2 Endpoint inventory (Confirmed from annotations)

Extraction method: ripgrep over all 69k decompiled files for `@ofr("…")` and `@kg80("…")` path literals. **402 unique GET paths, 209 unique POST paths.** Raw extraction saved at `reports/_endpoints_raw.txt`.

Annotation map (Confirmed by usage semantics — `a/ofr.java`, `a/kg80.java`, `a/nkd0.java`, `a/z190.java`, `a/jb8.java`, `a/xpv.java`, `a/dtv.java`, `a/doo0.java`):

| Annotation | Meaning | Example |
|---|---|---|
| `@ofr("path")` | HTTP **GET** | `a/aqr.java:11` `@ofr("MainFeedLine/mobile/v3/game")` |
| `@kg80("path")` | HTTP **POST** | `a/fuz.java:13` `@kg80("LimitService/api/mobile/v4/limits")` |
| `@nkd0("name")` / `@z190("name")` | `@Query` / `@Path` | `a/lyk.java:10` |
| `@jb8` | `@Body` | `a/fuz.java:15` `@jb8 mni0 mni0Var` |
| `@xpv("X-Auth")` | `@Header` | nearly all authenticated endpoints |
| `@dtv({"Accept: application/vnd.xenvelop+json"})` | `@Headers` | hundreds of interfaces |
| `@doo0 fk9` | custom cache-tag argument (`a/dk9.java:41`) | `a/cq0.java:11` |

Common response wrapper: `dx5<T>` (envelope), `q16<T,U>` (data+errors), `u2t<T>`. Most calls are `suspend` (continuation `yje<? super dx5<T>>`).

##### Priority endpoints (evidence-backed)

| Area | Method | Path | Required params / auth | Purpose | API interface (file) |
|---|---|---|---|---|---|
| **Config** | GET | `configuration/v2/config/{bundle}/{whence}/{version}` | path `bundle`,`whence`,`version`; header `Accept: application/vnd.xenvelop+json`; returns `dx5<mwn>` (encrypted) | Fetch remote config | `a/zff0.java:8-9` (called from `a/rxn.java:108`) |
| Config | GET | `ConfigAppService/v1/ComApp`, `ConfigAppService/v1/App/MainMenu` | — | App/menu config | `a/l6d.java:14`, `b9s0`-area |
| Domain | GET | `ru/redirect/api/getactualdomain?id=2` | `sign`, `project_id` | Resolve actual domain | `a/lyk.java:9-10` |
| Domain | GET | `ActualDomain/v1/actual-domains/match-domain` | `projectId`, `geo`; returns `dx5<q930>` (encrypted) | Match domain | `a/lyk.java:12-13` |
| **Account / balance** | GET | `Account/v1/Mb/GetUserBalance` | `@Header X-Auth`; `@Query Language, Partner, Group, Whence`; returns balances list | User balance | `a/sl5.java:8-10` |
| Account | GET | `Account/v1/Mb/UserData`, `Account/v2/GetSecurityUser` | `X-Auth` | Profile / security settings | `a/` interfaces |
| **Auth** | POST | `UserAuth/Auth`, `/Auth2`, `/UserAuth/RefreshToken`, `/Logout`, `/ResetSession`, `/ResetAllSessions`, `/Check2fa` | body credentials / token; returns session data | Login / refresh / logout | `a/ew00.java:8-38`, `a/` auth interfaces |
| Auth | POST | `webapi/mobile/v1/token/auth`, `web-api/api/mobile/v1/auth`, `v2/login/internal` | body | Alternate token login | POST list |
| **Betting** | POST | `MobileLiveBetX/MobileMakeBet` (+ `Multi`, `Builder`, `Alternative`, `SaleBet`, `Bid`) | `X-Auth`, JSON body | Place bets | POST list (`a/` make-bet interfaces) |
| Betting | POST | `/toto2/Mobile/v1/makeBet`, `/toto/JackpotMobile/v1/makeBet` | `X-Auth`, body | Toto/jackpot bets | `a/gir0.java:20` |
| Betting | GET | `MainFeedLine/mobile/v3/game`, `MainFeedLive/mobile/v3/game` | `partId`, `whence`, `ref`, `lng`, `fcountry`, `country`, cache tag | Line/live event feed | `a/aqr.java:11,19`, `a/cq0.java:11,19` |
| Betting | GET | `{BetType}Feed/Mb_GetEventsZip` | body/map | Compressed event feed | GET list |
| Bet history | GET | `BetStorage/GetHistoryBetMobile` | `X-Auth`, params | Bet history | GET list |
| **Payments** | POST | `RestCoreService/v1/Mb/moneyMove` | `X-Auth`, body | Deposit / withdrawal money movement | `a/boe0.java:21` |
| Payments | POST | `SeamWalletService/TransferMoneyToPartnerAuth`, `TransferMoneyFromPartnerAuth`, `SendSmsCodeWithCaptcha`, `CheckSmsCodeAndTransferFrom/To` | `X-Auth`, body, captcha | Partner wallet transfers | POST list |
| Payments | POST | `PromoServiceAuth/CoinplayCCash/UserWithdraw` | `X-Auth`, body | Cashback withdrawal | POST list |
| Payments | GET | `RestCoreService/v1/mb/GetSaleTransactions`, `RestCoreService/v2/mb/GetTransactHistory` | `X-Auth`, account/date params | Transaction history | GET list |
| **Limits** | GET | `LimitService/api/mobile/v4/limits` | `X-Auth`, `lng`; returns `dx5<j300>` | Read responsible-gaming / financial limits | `a/fuz.java:9-11` |
| Limits | POST | `LimitService/api/mobile/v4/limits`, `.../limitaction`, `.../realitycheckaction` | `X-Auth`, typed body (`mni0`/`ymz`/`gce0`/`pni0`/`qti0`/`woi0`) | Set/change limits, reality-check | `a/fuz.java:13-35` |
| Limits | GET | `LimitService/v2/external/mobile/limits`, `LimitService/external/v3/reasons/selfexclude` | `X-Auth` | Self-exclusion | GET list |
| **Recommendations** | POST | `Aggregator_v3/v2/GetRecommendedGames` | `X-Auth`, `AppGuid`, `Accept`, body | Personalised game recommendations | `a/bx0.java:14,41` |
| Recommendations | GET | `aggregatorfeed/v1/advisedteams` | — | Advised teams feed | GET list |
| **Free spins** | GET | `Games/LuckyWheel/v2/Spins` | `X-Auth`, `Accept` | Available spins | `a/mk10.java:11-12` |
| Free spins | POST | `Games/LuckyWheel/v2/Spins`, `.../Spins/Bulk` | `X-Auth`, `Accept`, body `jzk0` | Spin / bulk spin | `a/mk10.java:8-9,14-15` |
| Bonuses | GET | `Account/v1/Bonus/GetUserBonusData`, `BonusFeed/GetUserBonusesGrouped`, `MobileB2/AvailablePlayerBonuses` | `X-Auth` | Bonuses | GET list |
| Promo | GET/POST | `RestCoreService/v1/mb/CheckPromoCode`, `promocode/UsePromocode` | `X-Auth` | Promo codes | GET/POST lists |
| Anti-fraud | POST | `BetAffilateIntegration/Device/install/mobile`, `/log/Android`, `cyberAnalytics/v1/analytics/event` | body | Telemetry / device install | POST list |
| Diagnostics | GET | `ProphylaxisStatus/v2/mobile`, `ProphylaxisStatus/v1/technicalProblems` | — | Maintenance window | GET list |

Full path lists (grouped by GET/POST) are embedded in `reports/_endpoints_raw.txt`; the extracted unique paths are enumerated in the tables above for the priority categories.

##### Request flow (Confirmed code structure)

```mermaid
sequenceDiagram
    participant UI as Feature module (org/xplatform/*)
    participant IF as API interface (a/*.java)
    participant OK as OkHttp chain
    participant INT as Interceptors (a/dk9 cache)
    participant CRY as Crypto (a/z8w0, SecurityImpl)
    participant BE as Backend (ujn.h base URL)

    UI->>IF: suspend call(@Header X-Auth, @Query…, @Body…)
    IF->>OK: Request(method=GET/POST, url=ujn.h + path)
    OK->>INT: cache lookup key = method + URL + selected headers (a/dk9.java:46-54)
    INT->>CRY: (for encrypted payloads) AES/CBC/PKCS5Padding with native key+IV
    CRY->>OK: hex/UTF-8 envelope
    OK->>BE: HTTPS request (Accept: application/vnd.xenvelop+json)
    BE-->>OK: dx5<T> / xenvelop response
    OK-->>UI: parsed Kotlin data model
```

---

### 3. Authentication, session management, token storage (Confirmed)

| Item | Evidence |
|---|---|
| Token header | `@xpv("X-Auth")` on nearly all authenticated API methods (e.g. `a/sl5.java:10`, `a/fuz.java:11`, `a/bx0.java:12-51`). |
| Token format | `a/btt0.java:16-25`: `a()` returns the stored value, prefixing `"Bearer "` if absent. |
| Token persistence | `a/btt0.java:20,33`: key **`"new_user_token"`** via `vwb0` (`SharedPreferences`-like `.c(...)`/`.h(...)`). |
| Atomic in-memory cache | `a/btt0.java:10`: `AtomicReference` initially `""`. |
| Session lifecycle endpoints | POST `UserAuth/Auth`, `/Auth2`, `/RefreshToken`, `/Logout`, `/ResetSession`, `/ResetAllSessions`, `/Check2fa` (POST list). |
| Auth verification endpoint | POST `Account/v1/Mb/CheckToken` (POST list) |
| Two-factor | `Account/v1.1/Mb/Set2fa`, `Account/v1/Mb/Delete2Fa`, `Account/v1/CheckCode`, `Account/v1/SendCode`, `authenticator/api/v2/approvals/*/confirm` |
| Additional header set used for cache keys | `a/dk9.java:23`: `Accept, Authorization, X-Auth, X-Language, X-FCountry, X-Country, fcountry, country` |
| Other observed headers | `AppGuid`, `X-Whence`, `X-Referral`, `X-Group`, `X-Bot-Id`, `X-Message-Id` (e.g. `a/bx0.java:15,22`, `a/et5.java:12`, `a/cup0.java:10`, `a/fg.java:15`) |
| QR / social auth | `UserAuth/SendAuthByQrCode`, `Account/v1.1/SetQrAuth`, `TgBotLink/deep-link/auth`, `partnerusers/v1/partnerapi/888starz/login`, OAuth endpoints for Yandex/VK/OK/Discord/Apple (`AndroidManifest.xml:36-90`, `a/c2w0.java:8`, `a/d5v0.java:40`) |

**Cookies:** no `CookieJar` usage found in the first-party networking classes; session continuity appears bearer-token based. `android.gov.nist.javax.sip.*` digest auth code (`a/wti.java:394-417`, `a/bg0.java:1062-1081`) belongs to the bundled SIP/softphone library (online-call support), not to the main REST API.

> **Unverified:** token expiry semantics, refresh-token rotation, server-side session invalidation, and whether `X-Auth` is mandatory on every endpoint — these require backend/runtime observation.

---

### 4. Request signing / encryption / obfuscation (Confirmed code, native key values Unverified)

#### 4.1 Layers

1. **Header-based auth** — `X-Auth: Bearer <token>` (§3). No evidence of a per-request HMAC signature over the body in the Java sources.
2. **`Accept: application/vnd.xenvelop+json`** on the majority of API interfaces — indicates an "envelope" response contract; some payloads are encrypted (see §4.3).
3. **AES/CBC/PKCS5Padding** with native-provided key+IV for sensitive strings/responses (`a/z8w0.java`), and for remote-config/domain blobs (`a/ref.java`).
4. **Google Tink** primitives (AES-GCM, AES-GCM-SIV, XAES-GCM) are bundled — `a/do20.java:314`, `a/b50.java:139`, `a/qow0.java:96-116`, Tink key type URLs in `a/a70.java:13`, `a/fww0.java:10`. Which specific Tink keyset is used at runtime is Unverified.
5. **Obfuscation**: R8/Dagger-generated short names; strings such as endpoint paths remain literal.

#### 4.2 Remote-config / domain AES construction (Confirmed)

`decompiled/sources/a/ref.java:20-40`:

```java
public final byte[] a(String str, rhi0 rhi0Var, String str2) { // str=dataHex, str2=ivHex
    byte[] bytes = b(rhi0Var).getBytes(Charsets.UTF_8);        // key from native lib
    SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
    IvParameterSpec ivParameterSpec = new IvParameterSpec(zvv.c(str2)); // hex → bytes
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    cipher.init(2 /* DECRYPT_MODE */, secretKeySpec, ivParameterSpec);
    byte[] out = cipher.doFinal(zvv.c(str));                    // hex → bytes
    Arrays.fill(bytes, (byte) 0);
    return out;
}
```

- `zvv.c(...)` = hex-string → byte[]; `zvv.g(...)` = byte[] → hex-string (used in `a/rxn.java:178`).
- Key source `a/ref.java:42-53`: ordinal 0 (`rhi0.MAIN`) → `keysImpl.getNativeConfigKey(0)`; ordinal 1 (`rhi0.STAGE`) → `getNativeConfigKey(1)`, dispatched through `a/din0.java:341` (constructor `a/din0.java:362-367`).

#### 4.3 Request/response AES construction (Confirmed)

`decompiled/sources/a/z8w0.java:21-56`:

```java
public static String a(String str, byte[] bArr /*IV*/, byte[] bArr2 /*key*/) {
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
    byte[] out = cipher.doFinal(defpackage.b.b(str));   // hex decode
    return new String(out, Charsets.UTF_8);
}
public static String c(String str, byte[] bArr, byte[] bArr2) {
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
    byte[] out = cipher.doFinal(str.getBytes(Charsets.UTF_8));
    return defpackage.b.a(out);                          // hex encode
}
```

Key/IV providers: `org/xplatform/secret/impl/SecurityImpl.java:139-157` → `getNativeKey(applicationId, isTest, defaultKey)` and `getNativeIV(applicationId, isTest, defaultV)`, both `native`. `a/z8w0.java:d/e/f/g` wrap these into suspend decrypt/encrypt operations; `a/v4w0.java:23-24` is the factory `a() -> new z8w0(security)`.

> **Unverified:** the literal key/IV values (they live in `libsecurity.so` / `libkeys.so`), and exactly which endpoints use the AES layer vs. plain JSON. `Strongly Supported` that it protects selected sensitive payloads (crypto helper is wired into the Dagger graph via `DomainResolverDependencies.getSecurity()`).

#### 4.4 Native libraries and certificate pinning (Confirmed)

| Library | Loader evidence | Purpose |
|---|---|---|
| `libkeys.so` | `a/mc0.java:261-263` `System.loadLibrary("keys"); ... keysImpl.createConfigForLib(bundleId, whence, isTest)` | Provides social/partner secrets and **`getNativeConfigKey(int type)`** (`KeysImpl.java:1328`) |
| `libsecurity.so` | `a/p23.java:153-156` `System.loadLibrary("security"); SecurityImpl.f...` | Provides `getNativeKey`/`getNativeIV` used by `a/z8w0.java` |
| `libantifraud.so`, `libantifraud_audio.so` | `a/n230.java:91`, `a/a04.java:32`, `a/qgx.java:78` | Anti-fraud device telemetry |
| `libtoolChecker.so`, `libsdk_bc_lib.so`, `libimage_processing_util_jni.so` | present in `lib/arm64-v8a/` | Tool detection / biometrics / image processing |

**Native key surface** (`org/xplatform/secret/impl/KeysImpl.java:1291-1374`) is extensive and includes `getTestSectionKeyLib`, `getFatmanTokenLib`, `getMatchKeyLib`, `getFirstKLib`, `getFirstVLib`, `getSecondKLib`, `getSecondVLib`, `getVersLib`, `getAlphabetLib`, social SDK ids/secrets (VK/OK/Mail.ru/Discord), SIP domains, and `getNativeConfigKey(int type)`. This is where "hidden" secrets live; they are **not** extractable from Java source.

**Certificate pinning:** `okhttp3.CertificatePinner` exists in the SDK but the app does **not** configure it — `OkHttpClient.Builder` defaults to `CertificatePinner.c` (empty) (`okhttp3/OkHttpClient.java:148,230,258`). `apktool_out/res/xml/network_security_config.xml` instead **expands** trust:

```xml
<base-config cleartextTrafficPermitted="true">
  <trust-anchors>
    <certificates src="@raw/lets_encrypt_x1" /> ... <certificates src="system" /> <certificates src="user" />
  </trust-anchors>
</base-config>
<domain-config cleartextTrafficPermitted="true">
  <domain includeSubdomains="true">livetex.ru</domain>
  <domain includeSubdomains="true">chls.pro</domain>
  <domain includeSubdomains="true">ipv4.fiddler</domain>
  <domain includeSubdomains="true">charlesproxy.com</domain>
  <trust-anchors><certificates src="system" /></trust-anchors>
</domain-config>
```

Implications (Confirmed from config): **user-installed CAs are trusted**, cleartext is permitted globally, and explicit exemptions exist for Charles Proxy / Fiddler / livetex domains. `res/raw/lets_encrypt_*.der` are added trust anchors (not pins). This is the opposite of certificate pinning and materially eases TLS interception on a rooted/user-CA-installed device.

---

### 5. Remote configuration — decryption algorithm reconstructed (Confirmed)

#### 5.1 Asset and model

- Asset: `apktool_out/assets/remote-config/remote-config.json` (68,121 bytes) — a single JSON object with exactly two string fields: `dataHex` (≈67 KB hex ⇒ ≈33 KB ciphertext) and `ivHex` (32 hex chars ⇒ 16-byte IV). The blob in the shipped APK is the **encrypted** form.
- Asset reader: `a/wti.java:1381-1390`:

```java
public mwn s() throws IOException {
    InputStream in = ((us00) this.c).getAssets().open("remote-config/remote-config.json");
    String strK = n8n0.k(new BufferedReader(new InputStreamReader(in, Charsets.UTF_8), 8192));
    return (mwn) ((vby) this.b).b(mwn.Companion.serializer(), strK);   // → EncryptedConfigResponse
}
```

- Model: `a/mwn.java:8-53` — `f22513a = dataHex`, `b = ivHex`; serializer descriptor name `org.xplatform.remoteconfig.data.models.EncryptedConfigResponse` (`a/kwn.java:13-16`).
- Saved-config cache: `a/asd.java:30-42` writes `<bundle>-saved_config_<MAIN|STAGE>_v3.json` under `filesDir` via `AtomicFile`.

#### 5.2 Exact decryption algorithm (Confirmed)

```
Input:  dataHex (hex), ivHex (hex), key selector = rhi0.MAIN(0) or rhi0.STAGE(1)

1. key string     = KeysImpl.getNativeConfigKey(selector)        // a/din0.java:341; native KeysImpl.java:1328
2. key bytes      = key string.getBytes(UTF-8)                   // a/ref.java:25
3. iv bytes       = hexDecode(ivHex)                             // a/ref.java:30  (zvv.c)
4. cipher         = Cipher.getInstance("AES/CBC/PKCS5Padding")   // a/ref.java:31
5. cipher.init(DECRYPT_MODE, new SecretKeySpec(keyBytes,"AES"), new IvParameterSpec(ivBytes)) // :32
6. plaintext      = cipher.doFinal(hexDecode(dataHex))           // :33
7. model          = Json.decodeFromString<yff0>(plaintext UTF-8) // a/nrd.java:37-45
   (on failure: retry once with the alternate MAIN↔STAGE key — a/nrd.java:26-33)
```

Call chain with exact locations:

| Step | Class / method | File : lines |
|---|---|---|
| Read asset | `a.wti.s()` | `decompiled/sources/a/wti.java:1381-1390` |
| Deserialize envelope | `a.mwn` + `a.kwn.deserialize` | `a/mwn.java:8-53`, `a/kwn.java:26-50` |
| Decrypt + parse | `a.nrd.a(mwn, rhi0, vby)` | `a/nrd.java:13-48` |
| AES engine | `a.ref.a(String dataHex, rhi0, String ivHex)` | `a/ref.java:20-40` |
| Key selection | `a.ref.b(rhi0)` → `a.din0.invokeSuspend` | `a/ref.java:42-53`, `a/din0.java:341,362-367` |
| Native key | `KeysImpl.getNativeConfigKey(int type)` | `org/xplatform/secret/impl/KeysImpl.java:1328` |
| Native lib load | `System.loadLibrary("keys")` | `a/mc0.java:261` |
| Remote fetch | `a.rxn.invokeSuspend` (default branch) | `a/rxn.java:96-203` |
| Merge + re-encrypt + persist | `a.rxn` | `a/rxn.java:144-193` (encrypt mode=1 at `:174-178`, save at `:193`) |
| Config API | `a.zff0.a(bundle, whence, version, Accept)` | `a/zff0.java:7-9` |
| Manager | `a.vff0` (b=load, c=apply, e=asset fallback) | `a/vff0.java:120-201`, `:400` |

#### 5.3 Remote-fetch merge behaviour (Confirmed)

`a/rxn.java:144-181` shows the fetched encrypted config is decrypted, then **merged over** (a) the local asset config (`vff0.e.s()`), (b) the saved config (`vff0.b(...)`), and (c) the newly fetched config, in that precedence order (`:161-163`: `map.putAll(asset); map.putAll(saved); map.putAll(fetched)`), then re-serialized, **re-encrypted with the same key + IV** and written to disk (`:164-181`, `:193`). This means the remote server can override every bundled flag.

#### 5.4 Decrypted config keys / feature flags (Confirmed — schema; values Unverified)

The plaintext schema is a large Kotlin data class `yff0` composed of nested config models. Exact field names are preserved in JADX serializers:

| Config model | File (serializer) | Example keys (field names) |
|---|---|---|
| `MainConfig` (132 fields) | `a/ls10.java:20-153` | `hasLine`, `hasLive`, `hasFinancial`, `hasCashbackAccountBalance`, `hasPromocodes`, `hasPromotions`, `hasMAXBet`, `hasSectionLotto`, `hasActualDomain`, `newActualDomain`, `paymentRefreshLimit`, `defaultOddsType`, `hasGameInsights`, `betHistoryWinBackBannerDeeplink`, `hasBetConstructor`, `hasBetBuilder` |
| `AggregatorConfig` (25 fields) | `a/ji0.java:15-41` | `hasCategoryAggregator`, `hasPromoAggregator`, `hasPromoShop`, `aggregatorMethodList`, `aggregatorMethodLayouts`, `hasAggregatorCurrencyConvertToggle` |
| `SectionsConfig` (36 fields) | `a/jnh0.java:16-53` | `hasSectionBonuses`, `hasSectionPromoCashback`, `hasSectionSecurity`, `hasSectionWelcomeBonus`, `blockApp`, `hasPolybetSection`, `TotoName`, `linktoUSSDinstruction` |
| `SecurityConfig` (54 fields) | `a/aoh0.java:15-70` | **`hasFinancialSecurityDepositLimits`**, **`hasFinancialSecurityBetsLimits`**, **`hasFinancialSecurityLossLimits`**, `isAllowedLoginByPhone/Qr/Social`, `minimumAge`, `isAllowedEditPhone`, `isAllowedPasswordChange`, `isBlockServiceNew`, `allowedGeoForVerification` |
| `SocialConfig` (10 fields) | `a/dhk0.java:13-24` | `hasVKontakteSocial`, `hasGoogleSocial`, `hasTelegramSocial`, `hasAppleIDSocial`, `hasXSocial`, `hasDiscordSocial` |
| `localConfig.json` (plaintext, shipped) | `apktool_out/assets/localConfig.json` | `Common.DomainChecker=true`, `ProjectId=216`, `SocialAppKey=android1xBet`, `XSocialAppKey=1xMobile`, `DemoLogin=""`, `DemoPass=""`, `HasChoicePhoneCodeForBindingPhone=true`, … |

**Can remote config change payment/betting behavior? Yes (Confirmed at schema/code level).** The decrypted `SecurityConfig` contains financial/deposit/bet/loss-limit toggles; `MainConfig` contains betting-feature flags (`hasMAXBet`, `hasBetConstructor`, `hasCashbackAccountBalance`, `paymentRefreshLimit`); `SectionsConfig` contains `blockApp`. `a/rxn.java:161-163` gives fetched values highest precedence, and `a/vff0.c(...)` applies them via a map to the whole app. The **actual current values** in the shipped encrypted blob remain `Unverified` because the native key is only available at runtime.

> To recover concrete values one would need to dump `KeysImpl.getNativeConfigKey(0/1)` at runtime or reverse `libkeys.so` — explicitly out of scope for this static-only analysis.

---

### 6. Hardcoded secrets, keys, endpoints, debug/test backdoors

| Finding | Location | Confidence | Notes |
|---|---|---|---|
| Google/Firebase API key `AIzaSyBbFaHNy_BLBTqa6BsNiFoR1U8VonsG9xw` | `apktool_out/res/values/strings.xml:2511` (`google_api_key`), `:2518` (`google_crash_reporting_api_key`) | Confirmed | Standard client-side Firebase key; normally restricted by package/sha — restrictions live in the Firebase project, not the APK |
| OAuth web client ID `366675113911-mg8us1caaidnd1h5kvucqll8ko1rdkfe.apps.googleusercontent.com` | `strings.xml:1730` (`default_web_client_id`) | Confirmed | Public OAuth client id |
| AppsFlyer onelink host `1xbet.onelink.me` | `strings.xml:351` | Confirmed | — |
| Hardcoded JWT (jwt.io sample: `sub=1234567890`, `name=John Doe`) used as a `Bearer` value | `a/b1f.java:350` | Confirmed | **Placeholder/test token**, not a real credential — it is the canonical jwt.io example token; likely a demo/dev code path |
| Seed base URL `https://mob-experience.space` | `a/ujn.java:24` | Confirmed | Resolved domain overwrites it at runtime |
| Static asset CDN `https://hfoweytnvkf.com` | `a/bjg0.java:9`, `a/dke0.java:636`, `a/cjx.java:782+` | Confirmed | Hardcoded image host |
| `https://1xbet.com/` fallback | `a/azj0.java:48,68` | Confirmed | Navigation fallback |
| Proxy/debug domains `chls.pro`, `ipv4.fiddler`, `charlesproxy.com`, `livetex.ru` | `res/xml/network_security_config.xml` | Confirmed | Cleartext-enabled exception list — facilitates MITM debugging |
| Built-in **Test Section** UI (`TestSectionScreen*`) with screens: `AuthorizationCredsScreen`, `ClientConfigScreen`, `FeatureTogglesScreen`, `ModuleInfoScreen`, `PaletteScreen`, `RemoteConfigTestScreen` | `org/xplatform/feature/office/test_section/impl/navigation/*.java`, wired in `a/g0p0.java:387-808` | Confirmed | In-app debug/backdoor menu reachable from navigation; gating not fully traced (`g0p0` builds the screen list). Authorization-creds and remote-config test screens are notable |
| `assets/keypack/id.txt` = `65228` | `apktool_out/assets/keypack/id.txt` | Confirmed | Opaque numeric id fed to native key library (likely `createConfigForLib`/`getFatmanTokenLib`) |
| Native secret getters (`getFatmanTokenLib`, `getMatchKeyLib`, `getTestSectionKeyLib`, social private keys, `getNativeConfigKey`) | `KeysImpl.java:1291-1374` | Confirmed | Values not present in Java; require native analysis |
| `libantifraud`, `libtoolChecker` | `apktool_out/lib/*` | Confirmed | Root/tool/emulator detection surface |
| `assets/mocks/onboarding/*.json` | `apktool_out/assets/mocks/onboarding/` | Confirmed | Bundled mock feeds for onboarding (not a production backdoor) |

**Not found:** plaintext production API keys for betting/payments, plaintext AES keys/IVs, admin passwords, or hardcoded production user credentials. `localConfig.json` has empty `DemoLogin`/`DemoPass`.

---

### 7. Findings summary and confidence matrix

| # | Finding | Confidence |
|---|---|---|
| 1 | Kotlin + Dagger 2 + OkHttp/Retrofit-style API layer + Cicerone + WorkManager; Application `org.platform.app.ApplicationLoader`, DI component `a.g8i` | **Confirmed** |
| 2 | 402 GET + 209 POST endpoint paths enumerated; full betting/payment/account/limits/config surface mapped | **Confirmed** |
| 3 | Base URL resolved at runtime through `ujn.h`; seed `https://mob-experience.space`; `getactualdomain` + `match-domain` endpoints | **Confirmed** (code) / **Unverified** (live domain) |
| 4 | Auth = `X-Auth: Bearer <token>` stored as `new_user_token`; refresh/logout endpoints present | **Confirmed** |
| 5 | Remote config asset is AES/CBC/PKCS5Padding encrypted; key from native `getNativeConfigKey(0/1)`, IV from `ivHex`; full chain reconstructed with line numbers | **Confirmed** |
| 6 | Remote config can override betting/payment/limit flags (`hasFinancialSecurityDepositLimits`, `hasMAXBet`, `blockApp`, …) | **Confirmed** (schema/merge code) / values **Unverified** |
| 7 | Second AES/CBC layer for request/response payloads with keys from `libsecurity.so` (`getNativeKey`/`getNativeIV`) | **Strongly Supported** |
| 8 | **No OkHttp certificate pinning; user CAs trusted; cleartext allowed; Charles/Fiddler exemptions** | **Confirmed** |
| 9 | Hardcoded Google/Firebase key, OAuth client id, jwt.io sample token, test-section backdoor UI | **Confirmed** |
| 10 | Which concrete host a device uses, live decrypted config values, native key literals, server-side auth enforcement, Tink keyset in use | **Unverified** (requires runtime/backend) |

---

#

## Appendix A — Key file index (all paths relative to `D:\1xbetrea\decompiled\sources\` unless noted)

| Concern | File |
|---|---|
| Application | `org/platform/app/ApplicationLoader.java` |
| Manifest | `D:\1xbetrea\apktool_out\AndroidManifest.xml` |
| DI component | `a/g8i.java`, `org/xplatform/domain/resolver/impl/di/DaggerDomainResolverComponent.java` |
| Network cache interceptor | `a/dk9.java` |
| API annotation definitions | `a/ofr.java`, `a/kg80.java`, `a/nkd0.java`, `a/z190.java`, `a/jb8.java`, `a/xpv.java`, `a/dtv.java` |
| Base-domain holder | `a/ujn.java` |
| Domain API | `a/lyk.java`, `a/w4w0.java`, `a/o930.java`, `a/q930.java` |
| Token storage | `a/btt0.java` |
| Remote-config asset reader | `a/wti.java` |
| Remote-config models | `a/mwn.java`, `a/kwn.java`, `a/yff0.java` |
| Remote-config decrypt | `a/nrd.java`, `a/ref.java`, `a/rhi0.java`, `a/din0.java` |
| Remote-config fetch/merge | `a/rxn.java`, `a/vff0.java`, `a/zff0.java`, `a/asd.java` |
| Remote-config schema | `a/ls10.java`, `a/ji0.java`, `a/jnh0.java`, `a/aoh0.java`, `a/dhk0.java` |
| Native key/security facade | `org/xplatform/secret/impl/KeysImpl.java`, `SecurityImpl.java` |
| Payload crypto | `a/z8w0.java`, `a/v4w0.java` |
| Network security config | `D:\1xbetrea\apktool_out\res\xml\network_security_config.xml` |
| Test section | `org/xplatform/feature/office/test_section/impl/navigation/*.java`, `a/g0p0.java` |
| Priority endpoint interfaces | `a/zff0.java`, `a/sl5.java`, `a/fuz.java`, `a/mk10.java`, `a/bx0.java`, `a/boe0.java`, `a/aqr.java`, `a/cq0.java`, `a/lyk.java` |

## 4. Internal Module Breakdown

First-party code is concentrated in `org/xplatform` (85 modules, ~1,052 files). Additional first-party entry points: `org/platform/app/ApplicationLoader.java` and `org/xbet/client1`. The remaining ~68,000 classes are third-party SDKs (AndroidX, OkHttp, Firebase, HMS, AppsFlyer, VK/OK/Yandex, reCAPTCHA) and the heavily obfuscated flat `a` package that holds most runtime business logic. Obfuscation is mitigated by Kotlin `@Metadata` and `kotlinx.serialization` descriptors, which preserve original class names and exact JSON keys.

| Module group | Modules (file count where notable) | Role |
|---|---|---|
| Core / infrastructure | `core`, `domain`, `services`, `feature`, `security`, `app_start`, `app_update`, `settings`, `themeswitch`, `localtimedif`, `client1`, `democonfig`, `secret`, `verification`, `fingerprint`, `pin_code`, `authenticator`, `authqr`, `authreminder`, `login`, `registration`, `registration_default`, `resident`, `mailing`, `messages`, `support`, `consultantchat`, `alerts_pipe_api`, `onexdatabase`, `feature/office/test_section` | DI, networking, crypto keys, auth, lifecycle, debug/test tooling, local DB |
| Betting / markets | `betting` (15), `make_bet` (6), `make_bet_settings`, `bet_constructor`, `makebet_promocodes`, `coupon` (10), `bet_history` (17), `bethistory`, `sportgame` (39), `feed` (23), `top` (60), `popular`, `related`, `results`, `market_statistic`, `coef_type`, `swipex`, `toto_bet`, `ufc`, `rules`, `responsible_game`, `limits_africa`, `limits_ee`, `limits_kenya`, `limits_ne`, `limits.ie`, `limits.rs` | Bet lifecycle, odds feeds, coupons, limits, responsible gambling |
| Payments / rewards | `feature/office/payment` (PaymentWebView), `wallet`, `promo`, `promotions`, `referral`, `bonus_games` (7), `wild_free_bet`, `spin_and_win` (3), `scratch_card`, `lucky_wheel`, `lucky_card` | Money movement, bonuses, free games |
| Games / aggregator | `aggregator` (17), `games_section`, `games_mania`, `cyber` (152 — largest module), `uikit_web_games`, `background_video`, `game_broadcasting` (23), `special_event`, `african_roulette`, `apple_fortune`, `crystal`, `dragons_gold`, `domino`, `eastern_nights`, `lucky_wheel`, `playersduel`, `tile_matching` | Casino/virtual games, live streams, aggregator catalogue |
| UI / presentation | `uikit` (117), `ui_core` (64), `uikit_sport` (40), `widget`, `banners`, `picker`, `favorites`, `search`, `main_menu`, `statistic` | Reusable Compose/View components and navigation |

Largest modules by file count: `cyber` 152, `uikit` 117, `ui_core` 64, `top` 60, `uikit_sport` 40, `sportgame` 39, `app_update` 38, `security` 38, `statistic` 35, `personal` 27.

Key cross-module mechanisms: Dagger 2 component `a.g8i`; OkHttp 5 client with a Retrofit-style annotation shim (`@ofr` = GET, `@kg80` = POST, `@jb8` = @Body, `@xpv` = @Header, `@nkd0` = @Query); Cicerone navigation; WorkManager; Room (`onexdatabase`); encrypted configuration via native `libkeys.so`/`libsecurity.so`. See Section 3 for file-level evidence.

## 5. Betting System: Complete Execution Flow


**Target:** `D:\1xbetrea\1xbet.apk` — `org.xbet.client1`, version `1xbet-prod-v260.1.0` (sha256 not re-verified here; APK is 47,715,154 bytes).
**Sources:** JADX Java output at `D:\1xbetrea\decompiled\sources` (69,001 files); `apktool_out`; REA JADX-provider MCP tools (available, used only to confirm tool signatures — all citations below are to the on-disk decompiled sources).
**Scope:** Authorized static analysis of shipped artifacts only. No network action against production services. No real deposits/bets/withdrawals.
**Date:** 2026-11-24.

---

### 0. How to read this report (obfuscation context)

The first-party Kotlin code is **almost entirely obfuscated** into a single flat package `a` (64,225 of ~69k Java files). JADX preserved the obfuscated identifiers (`a.zt6`, `a.w5z`, `a.g320`, …), but **Kotlin `@Metadata` annotations survive** and contain original fully-qualified names in their `d2` arrays and in generated `kotlinx.serialization` descriptors (`new zna0("org.xplatform....")`). These descriptors are the primary evidence for original model names and exact JSON keys.

**Decoded Retrofit annotation map (Strongly Supported — derived from parameter usage, not a vendored source file):**

| Obfuscated | Original Retrofit meaning | Evidence |
|---|---|---|
| `@ofr("path")` | `@GET("path")` | `a/gir0.java:8-18` (used with `@nkd0` query params, no body) |
| `@kg80("path")` | `@POST("path")` | `a/m520.java:9-25`, `a/rn6.java:11-20` (always paired with `@jb8` body) |
| `@jb8` | `@Body` | `a/m520.java:10`, `a/gir0.java:22` |
| `@xpv("X-Auth")` | `@Header("X-Auth")` | `a/m520.java:10`, `a/gir0.java:22` |
| `@dtv({"..."})` | `@Headers({...})` | `a/hon.java:12`, `a/gir0.java:8` |
| `@nkd0("name")` | `@Query("name")` | `a/rn6.java:14-16`, `a/hon.java:13` |
| `@okd0` | `@QueryMap` | `a/hon.java:10`, `a/vre.java:12` |
| `@z190("BetType")` | `@Path("BetType")` | `a/hon.java:10`, `a/mf6.java:10-16` |
| `dx5<T>` | Xenvelop response envelope wrapper (`Accept: application/vnd.xenvelop+json`) | `a/gir0.java:8-9`, `a/hon.java:12-13` |
| `q16<T,Z>` | `org.xplatform.onexcore.data.model.BaseResponse` | `a/q16.java:17-22` |
| `i2o` | `org.xplatform...ErrorCodes` enum (implements `kuw`) | `a/i2o.java:7-8` |
| `yje<T>` | Kotlin coroutine `Continuation<T>` | ubiquitous in suspend API interfaces |

**Confidence legend:** **Confirmed** = directly readable in shipped bytecode/JADX; **Strongly Supported** = unambiguous reconstruction from metadata/descriptor; **Probable** = inferred from circumstantial evidence; **Unverified** = not provable from static artifacts.

---

### 1. Bet construction and submission — call sequence

#### 1.1 UI entry points (Confirmed / Strongly Supported)

`org\xplatform` preserved fragment/screen stubs show the navigation surface:

- `org\xplatform\coupon\impl\coupon\presentation\CouponScreen.java` — `FragmentScreen` for the bet slip; the actual fragment is obfuscated `a/axe.java`, whose reflection metadata binds `org.xplatform.coupon.impl.databinding.FragmentCouponBinding` and args `couponId: String`, `afterBet: Boolean` (`a/axe.java:50`).
- `org\xplatform\make_bet\impl\presentation\model\CoefUiModel.java` — per-outcome coefficient UI model: `currentCoefView`, `currentCoefValue: Double`, `oldCoefView`, `coefChangeType`, `hasAutoSub` (fields `f46772a..i`, `toString()` at lines ~70-80). This is where a coefficient change is rendered.
- `org\xplatform\make_bet\impl\presentation\model\BetDetailsUiModel.java` — `betName`, `teamsName`, `subGameText`, `isDuelGame`, `hasAutoSub`.
- `a/a720.java:34` and `a/b720.java:27` bind `MakeBetBottomsheetFragmentBinding` / `MakeBetSimpleFragmentBinding` and carry `simpleBetGame: org.xplatform.betting.core.coupon.models.SingleBetGame` + `entryPointType`.
- Odds selection event names in decompiled metadata: `addToCoupon` (`org\xbet\client1\R.java:10835`, used at `a/lgj.java:31-32`), `ShowEventsAddedToCoupon` (`a/sgj.java:18`), and `BetZip` field `addedToCoupon` (`org\xplatform\betting\core\zip\model\zip\BetZip.java:159`).

#### 1.2 Domain request object before transport (Confirmed)

`a/ouj0.java` — original name from `toString()` line 134: **`SimpleBetDataModel`** (domain-level bet request). Fields (`ouj0.java:11-68`):

```
balanceId, bonusId, betSum(String), advancedBet, betEventsModelList(List),
vid(int), checkCF(int), withLobby, eventsIndexes(List), groupSumms(List),
expressNum(long), coefViewTypeId(int), vipBetSum, approvedBet, promoCode,
betGuid, autoBetParamsModel(ex4), couponCode,
couponTypeModel(q4f), isExpressBoost, oneClick, isPowerBet(Boolean),
saleBetId, antiExpressCoef(double), builderCoupon(vb9)
```

`a/ouj0.java:71-104` provides a `copy`-style method `a(ouj0, String)` that replaces `betGuid` — used for retry with a corrected bet GUID.

#### 1.3 Transport model and signature (Confirmed)

`a/zt6.java` — original name from serializer `a/xt6.java:17`: **`org.xplatform.betting.core.make_bet.data.model.BetDataRequest`**. Its `toString()` (`zt6.java:133-159`) names all 34 fields.

Exact JSON keys from the generated serializer `a/xt6.java:17-52` (this is the **actual wire body**; Confirmed):

| # | JSON key | Kotlin field | Type | Notes |
|---|---|---|---|---|
|0|`UserId`|f44940a|long|balance/account id|
|1|`UserIdBonus`|b|long|bonus account id|
|2|`AppGuid`|c|String|app GUID|
|3|`Summ`|d|String|**stake sent as String** (decimal precision) |
|4|`avanceBet`|e|boolean|advance bet flag|
|5|`Events`|f|List|`BetEventResponse` items (see §2)|
|6|`Vid`|g|int|bet source / coupon type (mapped by `a/nwd.java:13-69`)|
|7|`CheckCf`|h|int|coefficient-check mode|
|8|`WithLobby`|i|boolean| |
|9|`EventsIndexes`|j|List| |
|10|`GroupsSumms`|k|List|group stakes (system bets)|
|11|`expressNum`|l|long| |
|12|`partner`|m|int|hard-coded to `1` in secondary ctor (`zt6.java:181`)|
|13|`CfView`|n|int|coefficient view type|
|14|`notWait`|o|boolean|hard-coded `true` (`zt6.java:183`)|
|15|`VIPBetSumm`|p|boolean| |
|16|`Source`|q|int|hard-coded `22` (`zt6.java:185`)|
|17|`Date`|r|String| |
|18|`Sign`|s|String|client signature|
|19|`Lng`|t|String|language|
|20|`ApprovedBet`|u|boolean| |
|21|`betGUID`|v|String|nullable|
|22|`promo`|w|String|nullable|
|23|`autoBetCf`|x|double| |
|24|`DropOnScoreChange`|y|boolean| |
|25|`TransformEventKind`|z|boolean| (line-to-live)|
|26|`CalcSystemsMin`|A|boolean| |
|27|`CouponCode`|B|String| |
|28|`IsExpressBoost`|C|boolean| |
|29|`OneClickBet`|D|int|quick bet flag|
|30|`IsPowerBet`|E|boolean| |
|31|`SaleBetId`|F|String|nullable (bet sale)|
|32|`specialTypes`|G|int| |
|33|`BuilderCoupon`|H|`yb9`|nullable bet-constructor coupon|

**Client-side signature** — `a/w5z.java:314-339` `static String l(ouj0, long)`:

```java
String events = CollectionsKt.b0(ouj0.e, "##", ..., new r520((byte)5), 30); // join events with "##"
int checkCf = (vid == q4f.m.a()) ? 0 : ouj0.g;
String reversed = new StringBuilder(String.valueOf(j)).reverse().toString();
StringBuilder sb = new StringBuilder(events)
    .append('_').append(ouj0.b)   // bonusId
    .append('_'); ... append(checkCf).append('_').append(cfView).append('_')
    .append(reversed);            // reversed timestamp
return kcx.N(sb.toString());      // digest
```

`a/kcx.java:288-309` `N(String)` uses `MessageDigest.getInstance(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM)` with UTF-8 bytes and lowercase hex output. The referenced constant is a SHA-family algorithm from the bundled `android.gov.nist` core library; the exact SHA variant is **Probable (SHA-1)** — the constant's value was not inlined/read in this pass. This `Sign` is a **client-side anti-tamper value** whose verification is server-side (server-authoritative validation).

#### 1.4 Submission call chain (Confirmed)

```
UI: outcome tap → addToCoupon (R.id.addToCoupon, a/lgj.java:31) → Build SimpleBetDataModel (a/ouj0)
  → a/g320.a(ouj0, zje)                      [bet-placement use case]   a/g320.java:27-90
      ├─ logs analytics "BetEvRequest"/"BetEvResponse"                 a/g320.java:46-59,77-88
      │  fields: betUniqueToken, betQuickBet, betClickTime, betGUID, betVid, betCouponId
      └─ w5z.Z(ouj0, zContains, cont)                                  a/w5z.java:2026-2059
          └─ qjj.d0(dispatcher, ys8lambda, cont)  (withContext)         a/w5z.java:2044-2047
              └─ ys8 (case 19) → build zt6 (BetDataRequest) + REST POST
                 → returns q16<BetResultResponse,ErrorCodes>
          └─ l8x.t0(q16) → MakeBetSuccessModel (oa20) or failure (na20) a/l8x.java:3400-3480
```

`a/g320.java:60-63` calls `q3d.j(...).contains(ouj0.s)` to branch on `couponTypeModel` (`q4f`), passing a boolean `z` into `w5z.Z` — i.e. the use case distinguishes certain coupon types (anti-express/express) when selecting the transport path.

**Confidence:** chain Confirmed for method bodies present; the specific `ys8` case-19 body is partly truncated by JADX (`a/ys8.java:1134-1152` shows a JADX `IfRegionVisitor` failure), so the exact `zt6` construction inside the lambda is **Strongly Supported** rather than fully readable.

---

### 2. Bet-slip / coupon generation and validation

#### 2.1 Coupon type taxonomy (Confirmed)

`a/q4f.java:35-80+` (`CouponTypeModel`) enum constants and numeric ids used by `a/nwd.java:13-69` (`Vid` mapping):

`UNKNOWN(0)`, `SINGLE(1)`, `EXPRESS(2)`, `SYSTEM(3)`, `CEPOCHKA(4)`, `MULTI_BET(5)`, `CONDITION_BET(6)`, `ANTIEXPRESS(7)`, `LUCKY(8)`, `PATENT(9)`, `BET_BUILDER(10)`, `MULTI_SINGLE(11)`, `TOTO_FOOT(12)`, `TOTO_SCORE(13)`, `TOTO_HOCKEY(14)`, `TOTO_FIFTEEN(15)`, `TOTO_CYBER_FOOT(16)`, `TOTO_CYBER_SPORT(17)`, `TOTO_BASKET(18)`, `TOTO_1X(19)`, … (more TOTO types follow). `nwd.b(int)` divides by 10000 for large ids (multi-region coupon ids).

#### 2.2 Per-selection model (Confirmed — exact JSON keys)

`a/jv6.java:16-51` serializer for **`org.xplatform.betting.core.make_bet.data.model.BetEventResponse`** — this is each item in the `Events` array of `BetDataRequest` and of `UpdateCouponRequest`:

`Coef`, `CV`, `PV`, `Param`, `ParamMobile`, `Type`, `UiFeature`, `GameId`, `Kind`, `PlayerId`, `Block`, `Seconds`, `Expired`, `Price`, `InstrumentId`, `IsRelation`, `IsBannedExpress`, `FullScore`, `PeriodScores`, `ExtraKind`, `MS1`, `MS2`, `FS1`, `FS2`, `PS`, `SpecialCoef`, `TimeSec`, `TimeDirection`, `OriginalPlayerId`, `FullName`, `Finish`, `GameConstId`, `OptionLowerCf`, `OptionLowerCfView`.

Sanitized example (field names from code, values illustrative):
```json
{"GameId":1234567,"Type":12,"Kind":3,"Param":42,"CV":1.85,"PV":"1.85",
 "Coef":1.85,"Block":false,"Expired":false,"IsBannedExpress":false,
 "InstrumentId":0,"TimeSec":0,"Finish":false}
```

Note the app sends both **numeric `Coef`/`CV`** and **string `PV` (coefficient view)** — consistent with server recalculating and returning `Coef`/`CoefView` in `CouponResponse`.

#### 2.3 Coupon generate / save / update endpoints (Confirmed)

`a/vre.java` (coupon API interface):

| Method | Endpoint | Body type | Response |
|---|---|---|---|
|`a/vre.java:11-12`|`GET MainFeedLine/mobile/v3/betsOnFavoriteEvents`|query map|`dx5<List<zg7>>`|
|`a/vre.java:15-16`|`GET MainFeedLive/mobile/v3/gamesForCoupon`|`gameIds`,`lng`,`whence`|`dx5<List<s5t>>`|
|`a/vre.java:18-19`|`POST MobileLiveBetX/MobileSaveCoupon`|`xxg0`|`q16<String, i2o>`|
|`a/vre.java:21-22`|`POST MobileLiveBetX/MobileUpdateCouponMulti`|`fit0`|`q16<List<oit0>, i2o>`|
|`a/vre.java:24-25`|`POST MobileLiveBetX/MobileSaveCoupon`|`byg0`|`q16<String, i2o>`|
|`a/vre.java:27-28`|`POST MobileLiveBetX/MobileUpdateCoupon`|`iit0`|`q16<oit0, i2o>`|
|`a/vre.java:30-31`|`GET MobileLiveBetX/GetBets`|query map|`List<q16<fm00, i2o>>`|
|`a/vre.java:37-38`|`POST MobileLiveBetX/MobileUpdateCouponBuilder`|`sht0`|`q16<wht0, i2o>`|
|`a/wl00.java:8-12`|`POST MobileLiveBetX/MobileGetCoupon`|`dn00`/`an00`|`q16<fm00, i2o>`|

`a/git0.java:16-41` serializer for **`UpdateCouponRequest`** JSON keys:
`UserId, UserIdBonus, AppGuid, Vid, expressNum, Summ, Source, partner, CheckCf, Lng, notWait, Events, CfView, avanceBet, SaleBetId, MinBetSystem, AddPromoCodes, IsPowerBet, EventsIndexes, WithLobby, CalcSystemsMin, IsExpressBoost, Country, specialTypes`.

`a/mit0.java:19-75` serializer for **`UpdateCouponResponse`** JSON keys (truncated at 58, first 56 shown):
`BonusCode, CfView, CheckCf, Code, Events, ExpresCoef, Groups, GroupsSumms, Lng, NeedUpdateLine, Source, Sport, Summ, TerminalCode, Top, UserId, UserIdBonus, Vid, WithLobby, avanceBet, betGUID, changeCf, expressNum, notWait, partner, promo, InitialBet, BetStep, EventsIndexes, minBet, maxBet, MinBetSystems, lnC, lvC, Coef, CoefView, AntiExpressCoef, UnlimitedBet, RestrictionWarning, RestrictionWarningGameIds, MaxPayout, promoCodes, HyperBonusPercent, MinHyperBonusBetLimit, MaxHyperBonusLimit, exceptionText, NegAsiaBetFlg, CoefType, EventCountToBoost, MinEventCoefToBoost, IsExpressBoost, MinEventCountToBoost, NotValid, specialTypes, OptionLowerCf, OptionLowerCfView, …`

#### 2.4 Client-side validation rules (Confirmed / Strongly Supported)

- **Stake bounds** — `StepInputUiModel` (`org\xplatform\make_bet\impl\presentation\model\StepInputUiModel.java:24-45`) fields: `currentValue`, `initValue`, `stepValue`, `minValue`, `maxValue`, `currencySymbol`, `isUnlimitedBet`, `hasInitValue`, `autoMaxModel`, `isEditEnabled`, `isActionButtonEnabled`, `isUserInput`, `isStepControlsVisible`, `isVipBet`, `isSavedStateModel`, `isLoading`, `isEachWay`. Default when absent (`a/fy4.java:139`, `a/h620.java:145`, `a/qg20.java:251`): `min=-1`, `step=1.0`, `max=-1`, `isUnlimitedBet=true` — i.e. **-1 is a sentinel meaning "server did not supply a bound"**. Real bounds arrive from `UpdateCouponResponse.minBet/maxBet/BetStep` and `Games/Feed/MinMax/ByAccount` (`a/luz.java:9`).
- **Coefficient bounds** — `CoefStepInputUiModel` uses `java.math.BigDecimal` for all five numeric fields (`org\xplatform\make_bet\impl\presentation\model\CoefStepInputUiModel.java:19-38`). Default (`a/fy4.java:135`, `a/h620.java:143`): step `0.1`, min coef `1.01`, max coef `999.999` (one variant `9999999999999.999`). This is a **client formatting/step guard** for "coefficient type" bets, not the authoritative odds.
- **Auto-max** — `AutoMaxUiModel(isAutoMaxEnabled, autoMaxValue)` (`org\xplatform\make_bet\impl\presentation\model\AutoMaxUiModel.java:16-24,50`) — server-driven maximum ("auto max" button).
- **No client-side acceptance of a bet** — the bet is only accepted after the server returns `q16.Success=true`; see §5.
- **Signature** — `w5z.l()` / `kcx.N()` (§1.3) is a client-generated integrity value; server validates.

**Missing / Unverified:** exact string-input formatting (decimal separator, grouping) is implemented in obfuscated UI helpers (`a/cw40`-style lambdas, `w5z` constructor with `BigDecimal`/`Locale` at `w5z.java:13-30`) and was not fully reconstructed. `MaxPayout` handling exists in `UpdateCouponResponse` but its enforcement path was not traced.

---

### 3. Odds retrieval, update, and stale-odds handling

#### 3.1 Odds sources (Confirmed)

1. **Pre-match/live feed ZIP** — `a/hon.java:9-10`:
   ```java
   @ofr("{BetType}Feed/Mb_GetEventsZip")            // GET
   Object a(@z190("BetType") String lineLive, @okd0 Map<String,Object> params, yje<q16<i0t,i2o>> cb);
   ```
   `{BetType}` is substituted with `Line`/`Live` (same pattern in `a/hon.java:13`, `a/mf6.java:10/15`). Response `dx5<su10>` for the `MainFeed{BetType}/mobile/v3/game` variant (`hon.java:12-14`). Feed responses are wrapped in `dx5` with header `Accept: application/vnd.xenvelop+json`.
2. **Per-event / coupon game data** — `GET MainFeed{BetType}/mobile/v3/gamesForCoupon` (`a/vre.java:15-16,41-42`), `GET MainFeed{BetType}/mobile/v3/game` (`a/hon.java:13`).
3. **Bet builder** — `POST /MainFeed{BetType}/mobile/betbuilder/v3/events` (`a/mf6.java:10-12`), `GET /MainFeed{BetType}/mobile/betbuilder/v3/gameInfo` (`a/mf6.java:14-16`).
4. **Websocket real-time channel** — `a/ts4.java:469-477`:
   ```java
   Request.Builder builder = new Request.Builder();
   builder.d(str2.concat("/sockets/channel"));      // OkHttp .url(...)
   ...
   new c00(..., ft4Var.b.b)                          // Flow/observable of socket events
   ```
   Managed by `a/ft4.java` (holds `List<WebSocket>`), `a/guc.java` (OkHttpClient + `RealWebSocket` + endpoint strings `c,d,e`), `a/fuc.java` (extends `okhttp3.WebSocketListener`, parses `org.json.JSONObject`). **Probable** that this channel carries live coefficient ticks; the specific subscription frames/coefficient payload were not fully reconstructed (JADX truncation). No socket.io library is present — this is raw OkHttp WebSocket.
5. **Odds-type settings** — `org\xplatform\coef_type\impl\navigation\CoefTypeScreenFactoryImpl$getSettingsCoefTypeScreen$1.java` (screen only); server field `CoefType` in `UpdateCouponResponse` (`a/mit0.java:67`).

#### 3.2 Stale odds between selection and confirmation (Confirmed)

The app does **not** silently accept changed odds; it re-requests a recalculated coupon and shows a change description:

- `a/eye.java:7-20` — `CouponInfoUiModel(mainContainerUiState, coefChangeDesc: String, optionBetUiState, isAutoSub: Boolean)`.
- `a/cye.java:7-22` — `CouponInfoUiModel(coefficientContainerState, coefChangeDesc, isAuthorized, autoSubUiModel, optionBetUiState)`.
- `a/dye.java:59-62` — same model with `whenCoefChangedTitle`, `coefTitle`.
- UI bindings: `R.id.tvCoefChangeDesc` (`org\xbet\client1\R.java:14956`; used in `a/r620.java:105-106`), and the "possible win changed" block `clPossibleWinChange`, `ivPossibleWinChange`, `tvPossibleWin`, `tvPossibleWinChange`, `tvPossibleWinNew`, `tvPossibleWinOld`, `tvPossibleWinValue` (`a/brb0.java:33-107`).
- `CoefUiModel` carries `currentCoefValue`/`oldCoefView`/`coefChangeType` and `BetDetailsUiModel.hasAutoSub` — i.e. the UI distinguishes old vs new coefficient and whether auto-substitution (auto-accept) is enabled.
- **Re-request endpoint:** `POST MobileLiveBetX/MobileUpdateCoupon` (`a/vre.java:27-28`) with `UpdateCouponRequest` carrying `CheckCf` and the selected `Events`; response `UpdateCouponResponse` contains `changeCf`, `NeedUpdateLine`, updated `Events`, new `Coef`/`CoefView`/`ExpresCoef`, `NotValid`, `minBet/maxBet`, `MaxPayout`, `RestrictionWarning*`. Multi-coupon variant `MobileUpdateCouponMulti` (`a/vre.java:21-22`), builder variant `MobileUpdateCouponBuilder` (`a/vre.java:37-38`).
- **Server rejection if odds changed at submit time:** `i2o.CoefficientChangeCode("130")`, `CoefficientBlockCode("131")`, `CoefficientTemporarilyBlocked("113")`, `WrongCoefficient("159142")`, `WrongBetCoefficient("105643")`, `EventParameterChanged("148")`, `GameScoreIsChanged("157094")`, `PriceIsChangedForFinancialInstrument("301")` (`a/i2o.java:27-28,113,131,158,190,200,223`).
- `BetDataRequest.CheckCf` (`xt6.java:25`) and `CouponCode`/`betGUID` are the mechanisms tying a bet to a quoted coefficient; `ouj0.a(ouj0, String)` (`a/ouj0.java:71-104`) can replace `betGuid` for a corrected retry.

**Interpretation (Strongly Supported):** selection → local coupon shows coefficient → if feed/socket or `MobileUpdateCoupon` reports a change, the UI updates `coefChangeDesc` + old/new coef + old/new possible win, and (if `isAutoSub`) proceeds with the new coefficient; otherwise it asks the user. At submit, the server re-validates the coefficient and rejects with code 130/131/113 if stale. The exact user-prompt decision tree is obfuscated and not fully reconstructed.

---

### 4. Stake validation and potential winnings

#### 4.1 Stake (Confirmed for model/API; Probable for UI mechanics)

- Stake is transmitted as **string `Summ`** (`a/xt6.java:21`, `a/zt6.java:25`) — chosen to avoid floating-point rounding in JSON.
- Bounds/limits are **server-authoritative**: `UpdateCouponResponse.minBet`, `maxBet`, `BetStep`, `MaxPayout`, `UnlimitedBet`, `MinBetSystems`, `HyperBonus*` (`a/mit0.java:49-64`); separate `Games/Feed/MinMax/ByAccount` (`a/luz.java:9`). `StepInputUiModel.min/max` are populated from these; `-1` is "unlimited/unset" sentinel.
- Server error codes for stake: `BetSumExceeded("103991")`, `BetSumExceededNew("109")`, `AmountLessMinRate("105593")`, `NotCorrectBetSum("12202")`, `IncorrectBetSum("102767")`, `WrongSumOfBet("105639")`, `WrongRestOfBalanceAfterBet("157311")`, `ExceededMaxAmountBets("105571")`, `MinSummForVIP("156531")` (`a/i2o.java:31-32,44,58,133,182,176,55,152`).
- Balance check is also server-side; response returns new `Balance` (`a/ci7.java:17`, mapping to `gi7.b` / `MakeBetSuccessModel.balance`).

#### 4.2 Potential winnings (Strongly Supported: server-computed; client formats)

- `UpdateCouponResponse` supplies `Coef`, `CoefView`, `ExpresCoef`, `Summ`, `MaxPayout` (`a/mit0.java:25,32,54-55,60`) — the **server returns the recalculated coupon coefficient and stake**, so the authoritative "possible win" is derived from server data.
- `BetResultResponse`/`CouponResponse` likewise returns `Coef`, `CoefView`, `Summ` after acceptance (`a/h1f.java:17-19`, `a/ci7.java:21`). `MakeBetSuccessModel` exposes `coef`, `coefView`, `summ` (`a/oa20.java:57-71`).
- Client-side display models: `a/be20.java:26-27` `Value(possibleWin=…)` wrapping `ank0` (a `SpannableString` builder, `a/ank0.java:23-45`); `a/btn0.java:117-131` `SwipexCardMultiTeamUiModel(... coef=Coef(value=…), possibleWin=PossibleWin(value=…))`; `a/bhf.java:86-99` `CrystalResponse(… coeff=…, winSum=…)`. Formatting helpers include `h8x.s(ctf0Var, double, String)` (e.g. `a/ko0.java:811`, `a/wx4.java:111`).
- **Conclusion:** coefficient and stake (hence winnings) are **backend-authoritative**; the client multiplies/formats only for the live preview while the user types. I did **not** isolate a single clean `stake × coef` multiplication statement — the preview arithmetic is distributed across obfuscated formatting helpers (`h8x.s/u`, `ank0`, `w5z.R` at `a/w5z.java:1057-1337`). Confidence in "client preview exists" = Probable; in "backend is authoritative" = Confirmed.
- **Precision handling:** `CoefStepInputUiModel` uses `BigDecimal` (`org\xplatform\make_bet\impl\presentation\model\CoefStepInputUiModel.java:19-38`), stake uses `String`, coefficient uses `Double` in transport models (`BetDataRequest.autoBetCf: double`, `BetEventResponse.Coef`), and `MakeBetSuccessModel` uses `double`. Mixed precision is deliberate: money as string/BigDecimal, odds as Double.

---

### 5. Bet request transmission and response handling

#### 5.1 Complete endpoint inventory (all Confirmed — literal strings in `a/*.java`)

**Sports betting (core):**
| Endpoint | Method | File:line |
|---|---|---|
|`MobileLiveBetX/MobileMakeBet`|POST|`a/m520.java:9-10`|
|`MobileLiveBetX/MobileMakeBetMulti`|POST|`a/m520.java:18-19`|
|`MobileLiveBetX/MobileMakeBetBid`|POST|`a/m520.java:21-22`|
|`MobileLiveBetX/MobileMakeBetBuilder`|POST|`a/m520.java:24-25`|
|`MobileLiveBetX/MobileGetAvanceX`|POST|`a/m520.java:12-13`|
|`MobileLiveBetX/SaveBets`|POST|`a/m520.java:15-16`|
|`MobileLiveBetX/MobileMakeBetAlternative`|POST|`a/rn6.java:11-12`|
|`MobileLiveBetX/MobileMaxBetAlternative`|POST|`a/n520.java:9-10`|
|`MobileLiveBetX/MobileSaveCoupon`|POST|`a/vre.java:18-19,24-25`|
|`MobileLiveBetX/MobileUpdateCoupon`|POST|`a/vre.java:27-28`|
|`MobileLiveBetX/MobileUpdateCouponMulti`|POST|`a/vre.java:21-22`|
|`MobileLiveBetX/MobileUpdateCouponBuilder`|POST|`a/vre.java:37-38`|
|`MobileLiveBetX/MobileGetCoupon`|POST|`a/wl00.java:8-12`|
|`MobileLiveBetX/GetBets`|GET|`a/vre.java:30-31`|
|`MobileLiveBetX/MobileCancelBetBidWeb`|POST|`a/hv4.java:11`, `a/sw4.java:11`|
|`/MobileLiveBetX/MobileSaleBetSumExtS`|POST|`a/nvg0.java:8` (bet sale/cashout)|
|`/MobileLiveBetX/ExpressHighlight`|POST|`a/s07.java:8`|
|`alterbuilder/v3/calcEventGroups`|POST|`a/rn6.java:14-20` (bet constructor)|
|`Games/Feed/MinMax/ByAccount`|POST|`a/luz.java:9`|
|`PDFGeneratorService/GetPDFCouponForMobileWithHeaders`|POST|`a/mj0.java:12`, `a/omj0.java:9`|
|`PDFCuponGeneratorService/GetPromoPNGCouponForMobile`|POST|`a/mj0.java:9`|
|`BetHistory/Mobile/GetBetInfoHistoryWithSummaryByDates`|POST|`a/r37.java:9`, `a/oj7.java:11`|
|`BetHistory/Mobile/GetBetInfoHistoryByBetIdScan`|POST|`a/r37.java:21`|
|`BetHistory/Mobile/GetBetEventAlternativeInfos`|POST|`a/no2.java:8`|
|`BetStorage/GetHistoryBetMobile`|POST|`a/r37.java:18` (line 18 of r37)|
|`promocode/UsePromocode`|POST|`a/p9c0.java:10`|

**Toto / jackpot (separate vertical):** `POST /toto2/Mobile/v1/makeBet` (`a/gir0.java:20-22`, body `zkr0` = `TotoBetRequest`, header `X-Auth`), `POST /toto/JackpotMobile/v1/makeBet` (`a/nqr0.java:20`), `GET /toto2/Mobile/v1/couponInfo` (`a/wb7.java:8`), `GET /toto2/Mobile/v1/activeTirag` (`a/gir0.java:17-18`).

**Headers/signing:** `X-Auth` token header on every authenticated bet POST (`a/m520.java:10`, `a/rn6.java:12`, `a/gir0.java:22`, `a/n520.java:10`). Feed endpoints use `Accept: application/vnd.xenvelop+json` (`a/hon.java:12`, `a/vre.java:10`, `a/mf6.java:11`). Body integrity is the `Sign` field (§1.3). **Unverified:** whether additional device/app headers (fingerprint, `X-Request-Id`) are injected by an OkHttp interceptor — not traced in this pass.

#### 5.2 Response envelope (Confirmed)

`a/q16.java:7-22` = `org.xplatform.onexcore.data.model.BaseResponse<T,Z>` with JSON keys `Error`(String), `Success`(boolean), `ErrorCode`(enum), `Value`(T). `q16.a()` (`a/q16.java:43-58`) throws `zhi0` when `Error` is non-empty:

```java
public final Object a() throws zhi0 {
    if (Error != null && Error.length() > 0) throw new zhi0(Error, errorCode, null, 12);
    Object v = this.d; if (v == null) { return null; }
    return this.b ? v : null;      // Success flag gates Value
}
```

#### 5.3 Success / rejected / pending / cancelled (Confirmed mapping)

`a/l8x.java:3400-3480` `t0(q16)` converts the envelope to UI results:

- **Success** (`q16.Success=true`): builds `oa20` **`MakeBetSuccessModel`** (`a/oa20.java:56-73`) from `gi7`:
  ```
  MakeBetSuccessModel(id=<Coupon.Id>, balance=<Balance>, waitTime=<WaitTime>,
    betGUID=<betGUID>, walletId=<Coupon.UserIdBonus>, coef=<Coupon.Coef>,
    coefView=<Coupon.CoefView>, lnC, lvC, summ=<Coupon.Summ>,
    couponTypeModel=<nwd.b(Coupon.Vid)>, eventModels=[...])
  ```
  `BetResultResponse` JSON keys (`a/ci7.java:15-24`): `AdditionalInfo`, `Balance`, `Id`, `betGUID`, `WaitTime`, `Coupon`, `lnC`, `lvC`. `AdditionalInfo` is `FailureGamesResponse(gameIds)` (`a/nwo.java:39-41`, serializer `a/lwo.java`) — i.e. **partial success** is reported by a list of failed game ids inside an otherwise successful response.
- **Rejected** (`q16.Success=false`): builds `na20` with `(gameIds from AdditionalInfo, i2o error code, Error string)` (`a/l8x.java:3426-3440`). Analytics logs `BetEvResponse` with `betCouponId` only on success (`a/g320.java:76-88`).
- **Pending:** `WaitTime` on success (`ci7.java:20`, `oa20.waitTime`) plus `notWait` request flag (`xt6.java:32`) imply asynchronous acceptance: the app may show "bet accepted, waiting" and later poll `BetHistory`/`GetBets`. The exact polling state machine is **Probable/Unverified**.
- **Cancelled / blocked:** expressed as error codes, not a distinct envelope: `BetIsNotAccepted("302")`, `BetIsNotAcceptedForFinancialInstrument("300")`, `BetsAreNotAcceptedForOneExpress("305")`, `FailedCompleteBet("104")`, `GameLocked("133")`, `Locked("135")`, `BetsBlocked("111003")`, `BetEventBlocked("111004")`, `GameIsClosed("149")`, `UserMustNotMakeBets("152")` (`a/i2o.java:64-65,157,133,159,29-30,168,174`).
- **Success-bet alert model:** `org\xplatform\betting\core\success_bet_alert\presentation\models\SuccessBetAlertModel.java:17-28` carries `(String, String, String, Long, String, List)`; `SuccessBetInfoItem` sealed interface with `Simple`/`WithCurrency` (`SuccessBetInfoItem.java:11-22`); `SuccessBetStringModel.java:15-25` carries 4 strings. These are presentation models fed from `MakeBetSuccessModel`.

#### 5.4 Error code catalog (excerpt — Full enum at `a/i2o.java:8-226`)

Coefficient/odds: `130 CoefficientChangeCode`, `131 CoefficientBlockCode`, `113 CoefficientTemporarilyBlocked`, `159142 WrongCoefficient`, `105643 WrongBetCoefficient`, `148 EventParameterChanged`, `157094 GameScoreIsChanged`.
Stake/balance: `109/103991 BetSumExceeded`, `105593 AmountLessMinRate`, `12202 NotCorrectBetSum`, `157311 WrongRestOfBalanceAfterBet`.
Coupon/express/system: `308 WrongEventsInExpress`, `168 ExperssEventLimit`, `106407 WrongSystemParams`, `104645 BetsAreLimited`, `159426 BetsLimitIsExceeded`, `157972 EventsMaxCountExceeded`, `102677 WrongCouponFormat`.
Duplicate/lifecycle: `126 AlreadyBet`, `134 BetAlreadyPlaced`, `158218 BetExistsError`, `127 UserAlreadyBetOnOutcomeGame`, `129 WrongGameBet`, `141 GameIsNotExist`, `100/142 Live/LineGameFinished`, `158151 GameIsNotInLine`.
Bonus: `111005 ForbiddenBonusBet`, `159075 BetDoesNotMatchToBonus`, `105707 BonusIsClosed`, `105637 TypeOfBetDoesNotMatchToBonus`.
Bet sale: `643 BetSaleUnknownError`, `165497 BetAlreadySaved`, `165498 BetFromAnotherUser`.
Network/HTTP: `-1 NoInternetConnection`, `400/403/404/429/500`, `99 Error`, `158225 UnknownError`.

---

### 6. Client-side vs server-authoritative

| Aspect | Authority | Evidence |
|---|---|---|
| Selection → `BetEventResponse` fields sent | Client assembles, server validates | `jv6.java`, `xt6.java` |
| Stake bounds (min/max/step), balance, payout cap | **Server** | `mit0.java:49-60`, `luz.java:9`, `i2o.java:31,58` |
| Coefficient values & recalculation | **Server** | `mit0.java:25,54-55`, `h1f.java:17-18`, `i2o.java:27,113,131` |
| Final win/payout | **Server** (client formats preview) | `ci7.java`, `h1f.java`, `oa20.java` |
| Bet acceptance / rejection codes | **Server** | `q16.java`, `i2o.java`, `l8x.java:3426-3440` |
| Bet GUID / coupon id / WaitTime | **Server** | `ci7.java:18-20`, `oa20.java:57-71` |
| Request `Sign` digest | Client computes; server verifies | `w5z.java:314-339`, `kcx.java:288-309` |
| Odds display formatting / step controls / auto-sub UI | Client | `CoefUiModel`, `StepInputUiModel`, `eye.java` |
| Coupon type mapping | Client maps id→enum, server supplies `Vid` | `nwd.java:13-69`, `q4f.java` |

---

### 7. Interesting logic / features

- **Express / accumulator & system bets** — `q4f.EXPRESS(2)`, `SYSTEM(3)`, `CEPOCHKA(4)`, `ANTIEXPRESS(7)`, `PATENT(9)`, `MULTI_SINGLE(11)`. `BetDataRequest.expressNum`, `GroupsSumms`, `CalcSystemsMin` (`xt6.java:28-29,44`); `BetSystemRequest` wire keys `b,c,p,s` (`a/gn7.java:13-18`; `s` = system-params list). `POST MobileLiveBetX/ExpressHighlight` (`a/s07.java:8`); day-express screen `org\xplatform\feature\dayexpress\impl\presentation\DayExpressScreen.java`.
- **Bet constructor / builder** — `org\xplatform\bet_constructor\impl\...` modules; `MakeBetViaConstructorRequest` serializer `a/wg20.java` (17 fields); `BuilderEventRequest`/`BuilderGameRequest`/`BuilderCouponRequest` (`a/cc9.java`, `a/fc9.java`, `a/wb9.java`); `POST alterbuilder/v3/calcEventGroups` (`a/rn6.java:14-20`); `POST MobileLiveBetX/MobileMakeBetBuilder` (`a/m520.java:24-25`), `MobileUpdateCouponBuilder` (`a/vre.java:37-38`). `StepInputConfigModel` in `org\xplatform\bet_constructor\impl\makebet\domain\model\StepInputConfigModel.java`.
- **Cashout / bet sale / edit coupon** — `POST /MobileLiveBetX/MobileSaleBetSumExtS` (`a/nvg0.java:8`); `org\xplatform\bet_history\bet_sale\presentation\BetSaleScreen.java`, `...\sale\presentation\SaleBetScreen.java`, `...\edit_coupon\presentation\EditCouponFragmentScreen.java`, `...\edit_event\presentation\EditEventFragmentScreen.java`; edit models `EditCouponRequest`/`Response` (`a/smn.java`, `a/vmn.java`), `EventResponse` (44 fields) (`a/ggo.java`). `BetSaleUnknownError("643")`.
- **Free bets / bonuses in betting** — `UserIdBonus`, `avanceBet`, `promo`, `VIPBetSumm`, `IsPowerBet`, `HyperBonus*` in request/response; `org\xplatform\makebet_promocodes\api\presentation\models\PromoCodeInfoUiModel.java`; `promocode/UsePromocode` (`a/p9c0.java:10`); error codes `ForbiddenBonusBet`, `BonusIsClosed`, `BetDoesNotMatchToBonus`.
- **Quick bet / one-click** — `OneClickBet` (`xt6.java:47`), `betQuickBet` analytics flag (`a/g320.java:48,79`), `oneClick` in `ouj0`.
- **Bet sharing / coupon PDF** — `org\xplatform\bethistory\share_coupon\presentation\ShareCouponScreen.java`, `ShareCouponRequest` serializers (`a/gnj0.java`, `a/hnj0.java`), PDF endpoints (`a/mj0.java:9-12`, `a/omj0.java:9`), `org\xplatform\coupon\impl\generate_coupon\...` (GenerateCouponsScreen, FindCouponRequest/Response `a/kht.java`, `a/hdq.java`).
- **Coupon notification worker** — `org\xplatform\coupon\impl\notify\CouponNotificationWorker.java` (CoroutineWorker) — likely notifies on bet result/coupon state.
- **Coupon scanner / history** — `org\xplatform\bethistory\coupon_scanner\presentation\CouponScannerScreen.java`, `CouponScannerRequest` (`a/f2f.java`), `GetBetInfoHistoryByBetIdScan` (`a/r37.java:21`).
- **Toto & financial bets** — separate verticals with their own `makeBet` endpoints (`a/gir0.java:20`, `a/nqr0.java:20`, `a/lbq.java` FinanceBetRequest `a/nbq.java`).
- **Bet-source analytics** — `a/q4f` + `a/nwd` mapping; `BetEvRequest`/`BetEvResponse` logging (`a/g320.java:46-88`, `a/wdu.java:990-1015`) with `betVid`, `betGUID`, `betCouponId`, `betClickTime`, `betUniqueToken`, `betQuickBet`.

---

### 8. Mermaid diagrams

#### 8.1 Bet placement

```mermaid
sequenceDiagram
    participant U as User
    participant UI as Fragment (MakeBet/Coupon)
    participant VM as ViewModel (obfuscated)
    participant UC as g320 (bet use case)
    participant Repo as w5z.Z (repository)
    participant API as m520 / rn6 (Retrofit)
    participant BE as Backend

    U->>UI: tap outcome / market / odds
    UI->>VM: addToCoupon (R.id.addToCoupon)
    VM->>VM: build ouj0 SimpleBetDataModel (stake, events, vid, couponCode...)
    U->>UI: confirm bet
    UI->>UC: a(ouj0, cont)
    UC->>UC: log BetEvRequest (betGUID, betVid, clickTime)
    UC->>Repo: Z(ouj0, z, cont)
    Repo->>Repo: kcx.N(sign) via w5z.l()  %% client signature
    Repo->>Repo: build zt6 BetDataRequest (JSON keys in xt6)
    Repo->>API: POST MobileLiveBetX/MobileMakeBet (X-Auth, @Body zt6)
    API->>BE: HTTPS request
    BE-->>API: q16<BetResultResponse, ErrorCodes>
    API-->>Repo: q16
    Repo-->>UC: l8x.t0(q16) → oa20 success | na20 failure
    UC-->>VM: state update
    VM-->>UI: success-bet-alert / error UI
```

#### 8.2 Odds update / stale-odds recalculation

```mermaid
flowchart TD
    A[Feed: GET {BetType}Feed/Mb_GetEventsZip<br/>a/hon.java:9] --> B[Parse q16/i0t → events with Coef, CV, PV<br/>a/jv6.java:17-51]
    C[WebSocket {base}/sockets/channel<br/>a/ts4.java:469-477] --> B
    B --> D{odds differ from<br/>selected snapshot?}
    D -- no --> E[Coupon shows current coef]
    D -- yes --> F[POST MobileLiveBetX/MobileUpdateCoupon<br/>UpdateCouponRequest CheckCf + Events<br/>a/vre.java:27, a/git0.java:16]
    F --> G[UpdateCouponResponse: changeCf, NeedUpdateLine,<br/>new Coef/CoefView/ExpresCoef, minBet/maxBet,<br/>NotValid, RestrictionWarning — a/mit0.java:19]
    G --> H[CouponInfoUiModel: coefChangeDesc, isAutoSub<br/>a/eye.java, a/cye.java]
    H --> I{isAutoSub?}
    I -- yes --> J[Accept new coef, update possibleWin<br/>tvPossibleWinNew/Old — a/brb0.java:100-107]
    I -- no --> K[Prompt user (coefChangeDesc / tvCoefChangeDesc)]
    J --> L[Submit with new coefficient]
    K --> L
    L --> M{Server re-check at submit}
    M -- stale --> N[Error 130/131/113/159142<br/>a/i2o.java:27,113,131]
    M -- ok --> O[Success — MakeBetSuccessModel]
```

#### 8.3 Response handling

```mermaid
flowchart TD
    R[q16 BaseResponse<br/>Error / Success / ErrorCode / Value<br/>a/q16.java:17] --> S{Success flag?}
    S -- true --> V[Value = BetResultResponse gi7<br/>a/ci7.java:15]
    V --> V1[Build oa20 MakeBetSuccessModel<br/>id, balance, waitTime, betGUID, coef, coefView, summ, couponType<br/>a/l8x.java:3442+, a/oa20.java:57]
    V1 --> V2{AdditionalInfo.FailureGames<br/>non-empty?}
    V2 -- yes --> V3[Partial success: show failed gameIds<br/>a/nwo.java:40]
    V2 -- no --> V4[Success bet alert<br/>SuccessBetAlertModel]
    S -- false --> E[Build na20: gameIds, i2o code, Error string<br/>a/l8x.java:3426-3440]
    E --> E1{code family}
    E1 -->|130/131/113 coefficient| E2[Odds-change UI / re-request]
    E1 -->|109/103991/105593 stake| E3[Stake/balance UI]
    E1 -->|126/134/129 lifecycle| E4[Duplicate/invalid bet UI]
    E1 -->|302/300/305 rejection| E5[Not accepted UI]
    E1 -->|-1 network| E6[Retry / offline UI]
```

---

### 9. What is missing and why

- **Exact `ys8` case-19 body** (the lambda that actually assembles `zt6` inside `w5z.Z`): JADX failed with `IfRegionVisitor`/SSA errors (`a/ys8.java:1134-1152`). The endpoint, models, and signature are Confirmed; the precise field-by-field assignment inside the lambda is not. REA `inspect_android_method` could recover smali if needed.
- **Websocket subscription frames / coefficient tick schema:** `a/ts4.java`/`a/guc.java`/`a/fuc.java` show the channel and listener but not the decoded payload; JADX obfuscation and JSON handling are generic. Reliance on the feed ZIP + `MobileUpdateCoupon` is therefore the better-proven path.
- **Digest algorithm name:** `DigestServerAuthenticationHelper.DEFAULT_ALGORITHM` constant value not read (SHA variant = Probable).
- **Potential-win multiplication statement:** distributed across obfuscated formatting helpers; only the authoritative fields and display models are Confirmed.
- **Request signing/encryption interceptor:** not traced; only the `Sign` body field and `X-Auth` header are Confirmed.
- **Backend behavior** (actual acceptance policy, pending-vs-accepted timing) is inherently **backend-dependent**; this report describes only what the client sends and how it parses responses.

---

### 10. Evidence index (top citations)

- API map: `a/m520.java:9-25`, `a/gir0.java:8-22`, `a/hon.java:9-14`, `a/vre.java:9-42`, `a/wl00.java:8-12`, `a/rn6.java:11-20`, `a/mf6.java:10-16`, `a/n520.java:9-10`, `a/luz.java:9`.
- Request model: `a/zt6.java:9-203`, `a/xt6.java:17-52`, `a/ouj0.java:11-104`, `a/w5z.java:314-339`, `a/kcx.java:288-309`.
- Response/error models: `a/q16.java:7-58`, `a/i2o.java:8-252`, `a/ci7.java:15-24`, `a/h1f.java:15-23`, `a/jv6.java:16-51`, `a/mit0.java:19-75`, `a/git0.java:16-41`, `a/nwo.java:39-41`, `a/oa20.java:56-73`, `a/l8x.java:3400-3480`, `a/g320.java:27-90`.
- Odds/stale: `a/eye.java:7-20`, `a/cye.java:7-22`, `a/dye.java:59-62`, `a/ts4.java:469-477`, `org\xplatform\make_bet\impl\presentation\model\CoefUiModel.java`, `org\xbet\client1\R.java:14956`, `a/r620.java:105-106`, `a/brb0.java:33-107`.
- Stake/winnings: `org\xplatform\make_bet\impl\presentation\model\StepInputUiModel.java:24-45,107-122`, `CoefStepInputUiModel.java:19-38`, `AutoMaxUiModel.java:16-24`, `a/be20.java:26-27`, `a/btn0.java:117-131`.
- Coupon types/features: `a/q4f.java:35-80`, `a/nwd.java:13-69`, `a/gn7.java:13-18`, `a/wg20.java`, `a/smn.java`, `a/vmn.java`, `a/mj0.java:9-12`.

## 6. Recommendation Engine: Logic and Data Sources

### PART 1 — RECOMMENDATIONS / SUGGESTIONS

#### 1.1 Executive summary

The "recommended" surface is the **Aggregator ("My Games") main screen**. Its structure is **data-driven, not hardcoded**: a JSON layout document (`layoutConfigurationAggregatorAuth.json` / `...UnAuth.json`) defines an ordered list of carousels. Each carousel carries a `nameType` (`recommended`, `favorites`, `viewed`, `top_games`, `slots_popular`, `live_popular`, `crash_popular`) plus *ranking inputs* (`categoryId`, `partId`, `limit`, `filterType`, `isInfinite`, `miniatureType`). The layout document is fetched **per-country** (`COUNTRY_ID_PREFS_KEY`, `ISO_CODE_KEY`), cached in `SharedPreferences` and `AtomicFile`, with the bundled JSON as fallback. The client then converts each block into a `GamesCarouselModel` and asks the backend for the games. **No client-side scoring, weighting, or ML inference exists in the APK** — the only local processing is dedupe-by-id, model conversion, and rendering order. Personalization is evidenced by (a) geo-keyed layout selection, (b) dedicated `favorites` / `viewed` carousels fed by account activity, and (c) analytics events that report recommendation interactions (`promo_games_recomended_call`, `add_favor`, `game_id`, `type`).

#### 1.2 The layout configuration assets

##### Authenticated layout — `assets/layoutConfigurationAggregatorAuth.json`

`D:\1xbetrea\apktool_out\assets\layoutConfigurationAggregatorAuth.json` (112 lines). Sanitized excerpt (lines 15–25, 27–37, 68–92, 99–110):

```json
{ "nameType": "recommended",
  "additionalData": { "limit": 30, "categoryId": 824, "filterType": "and",
                      "isInfinite": true, "miniatureType": "horizontal" },
  "id": 85, "typeId": 5 },

{ "nameType": "favorites",
  "additionalData": { "limit": 30, "categoryId": 825, "filterType": "and",
                      "isInfinite": false, "miniatureType": "horizontal" },
  "id": 86, "typeId": 5 },

{ "nameType": "viewed",
  "additionalData": { "limit": 30, "categoryId": 847, "filterType": "and",
                      "isInfinite": false, "miniatureType": "horizontal" },
  "id": 88, "typeId": 5 },

{ "nameType": "slots_popular",
  "additionalData": { "limit": 8, "partId": 1, "categoryId": 17,
                      "filterType": "and", "isInfinite": true,
                      "miniatureType": "horizontal" }, "id": 90, "typeId": 5 },

{ "nameType": "live_popular",  { ... "partId": 37, "categoryId": 17, "limit": 8 ... }, "id": 91, "typeId": 5 },
{ "nameType": "crash_popular", { ... "partId": 149, "categoryId": 17, "limit": 8 ... }, "id": 93, "typeId": 5 }
```

Also present: `daily_tasks` (lines 9–13, `typeId 17`), `user_tournaments` (lines 39–45, `typeId 16`), an unnamed `typeId 9` block with `categoryId 981 / limit 100 / vertical` (lines 59–66), `typeId 14` (lines 3–7), `typeId 13` (lines 93–97). **Confirmed.**

##### Unauthenticated layout — `layoutConfigurationAggregatorUnAuth.json`

`...UnAuth.json` (87 lines) substitutes `top_games` for `recommended`:

```json
{ "nameType": "top_games",
  "additionalData": { "limit": 12, "categoryId": 824, "filterType": "and",
                      "isInfinite": false, "miniatureType": "vertical" },
  "id": 66, "typeId": 5 },
```
lines 4–14; the same `slots_popular` / `live_popular` / `crash_popular` blocks recur at lines 43–85 with `isInfinite: false`; `tournament_month` at lines 21–27. **Confirmed.**

##### Virtual layout — `layoutConfigurationVirtual.json`

`...Virtual.json` (20 lines) contains only `promotions` (`typeId 15`), `typeId 14`, `typeId 6` — no game carousels. **Confirmed.**

**Interpretation (Confirmed for structure / Strongly Supported for semantics):**
- `categoryId 824` = "top games" bucket; `825` = favorites bucket; `847` = "viewed"/recent bucket; `17` = aggregator games catalog; `981` = a large vertical catalog. The numeric IDs are opaque in the APK; the *association* to nameType is proven by co-location in the same block.
- `partId` partitions the catalog by game genre: `1` = slots, `37` = live casino, `149` = crash games. This mapping is independently corroborated by code (§1.7.1).
- `filterType: "and"`, `limit`, `isInfinite`, `miniatureType` are request/UI parameters, not ranking scores. **No `weight`, `score`, `priority`, or `rating` field exists anywhere in these configs** — a notable negative finding.

#### 1.3 Data models that deserialize the layout

| Class (obfuscated) | FQCN from serializer descriptor | Role | Citation |
|---|---|---|---|
| `d51` | `org.xplatform.aggregator.impl.core.data.models.AggregatorLayoutConfigurationResponse` | Top-level response; field `layout_blocks` | `a\d51.java:15–17, 26–48` |
| `f51` | (same response) | Holds `List f8937a` = content blocks | `a\f51.java:9–21, 39–41` |
| `hj0` | `org.xplatform.aggregator.impl.core.data.models.AggregatorContentBlockResponse` | Deserializes `id`, `typeId`, `name`, `nameType`, `additionalData` | `a\hj0.java:15–21, 34–71` |
| `jj0` | (block model) | Fields `f16598a=id`, `b=typeId`, `c=name`, **`d=nameType`**, `e=additionalData`; `toString()` labels `d` as `titleType` | `a\jj0.java:11–18, 70–75` |
| `ni0` | `AggregatorContentBlockAdditionalDataResponse` | `limit`, `partId`, `categoryId`, `filterType`, `isInfinite`, `miniatureType` | `a\ni0.java:13–20`; model `a\pi0.java:11–18, 78–85` |
| `xi0` | `GamesCarouselModel` | `id`, `headerModel`, `categoryId`, `limit`, `filterType`, `isInfinite`, `layoutType`, `partId` | `a\xi0.java:9–30, 51–66` |

Sanitized snippet — the field that carries the recommendation type (`a\jj0.java:70–75`):

```java
StringBuilder sbQ = hne.q("AggregatorContentBlockResponse(id=", this.f16598a,
                          ", typeId=", this.b, ", title=");
f140.v(sbQ, this.c, ", titleType=", this.d, ", additionalData=");
```

And the config-to-model conversion (`a\j120.java:1703–1734`, abbreviated):

```java
ti0 ti0VarE0 = i120.e0(jj0Var);                 // header from name/nameType
Integer num  = pi0Var.c;                         // categoryId
int iInt     = pi0Var.f27022a.intValue();        // limit
String str   = pi0Var.d;                         // filterType
boolean z    = pi0Var.e.booleanValue();          // isInfinite
// miniatureType -> pc0 enum, then:
return new xi0(strValueOf, ti0VarE0, num, iInt, str, z, pc0Var, pi0Var.b /* partId */);
```

**Confirmed:** the app turns every configured carousel into a `GamesCarouselModel` carrying exactly the parameters that will be sent upstream. There is no local scoring step in this method.

#### 1.4 Layout loader: remote-first with bundled fallback, cached

`a\z41.java` is the layout repository.

- Constructor creates three lazy `n0o0` providers that read the three bundled assets (`a\z41.java:28–98`):

```java
case 0: return z41Var.a("layoutConfigurationVirtual.json");
case 1: return z41Var.a("layoutConfigurationAggregatorAuth.json");
default:return z41Var.a("layoutConfigurationAggregatorUnAuth.json");
```

- `a(String)` opens the asset via `getAssets().open(str)` and deserializes through `f51.Companion.serializer()` (`a\z41.java:108–136`) — **Confirmed**.
- `c(String, mi0, int, String)` is the public accessor. It first calls `e(strB, mi0Var, z)` (remote/cached value). If that throws `g2`, it falls back to the bundled asset providers (`a\z41.java:138–176`, esp. 151–167) — **Confirmed**:

```java
g0g0Var = e(strB, mi0Var, z);
if (j0g0.a(g0g0Var) != null) {          // failure -> bundled default
    if (i2 == 1 && z)      f51Var = (f51) this.e.getValue();   // Auth
    else if (i2 == 1)      f51Var = (f51) this.f.getValue();   // UnAuth
    else                   f51Var = (f51) this.d.getValue();   // Virtual
    g0g0Var = f51Var;
}
```

- `e(...)` reads `SharedPreferences` keys `LAST_AUTH_MY_AGGREGATOR_KEY`, `LAST_UN_AUTH_MY_AGGREGATOR_KEY`, `LAST_AUTH_MY_VIRTUAL_KEY`, `LAST_UN_AUTH_MY_VIRTUAL_KEY` and a `<key>_SCREEN_CONFIG_<uuid>` string (`a\z41.java:182–202`).
- `f(...)` / `g(...)` read/write an `AtomicFile` named `myAggregatorConfiguration<uuid>.json` in `getNoBackupFilesDir()` (`a\z41.java:178–180, 205–264, 267–349`); `h(...)` maintains the "last key" pointers (`a\z41.java:351–375`).
- Cache key is a name-UUID of `(platform byte, screen name, int, string)` (`a\z41.java:100–106`):

```java
byte[] bytes = (str + i + i2 + str2).getBytes(Charsets.UTF_8);
return UUID.nameUUIDFromBytes(bytes).toString();
```

**Conclusion (Confirmed):** the recommendation *layout* is backend-controlled (downloaded config cached locally), and the bundled JSON is only a fallback/default. **Unverified:** the backend endpoint that produces the config and the algorithm that orders the blocks.

#### 1.5 Geo is a first-class input to the recommendation layout

`a\knf0.java` supplies the two extra parameters seen in `z41.c(...)` and `mii0.n(...)`:

```java
public final int b() {
    Integer num = this.e;
    return num != null ? num.intValue() : ua80.c(this.b, "COUNTRY_ID_PREFS_KEY", 225);
}
public final String c() {
    String strC = q7d0.c(this.b, "ISO_CODE_KEY");
    return strC == null ? "" : strC;
}
public final lnf0 d() { return new lnf0(c(), b()); }
```
(`a\knf0.java:36–48`; default country id **225**). Also `a()` reads the app GUID with a `FAKE_APP_GUID_ENABLED` / `FAKE_APP_GUID` test override (`a\knf0.java:25–34`).

`a\mii0.java:1393–1395` (and 226, 1358):

```java
iB = knf0Var.b();   // countryId
strC = knf0Var.c(); // ISO code
...
objN = mii0Var.n(str, mi0Var, num, iB, strC, b51Var2);   // remote fetch
...
g0g0Var = ((z41) mii0Var.b).c(str, mi0Var, iB, strC);    // cached/bundled fallback
```

**Confirmed:** the exact same carousel set can differ by country/ISO code. Supporting geo signals in `assets/localConfig.json:3–8, 55`: `WhiteListCountries`, `BlackListCountries`, `HiddenCountriesInProfile`, `NotNeedCheckCurrentGeoIsAllowedCountry`. **Strongly Supported:** geo-targeted catalog/promotion selection. **Unverified:** whether the backend additionally uses IP geolocation beyond the client-supplied country id.

#### 1.6 `nameType` semantics

| `nameType` | Where defined (asset) | Parameters | Likely source of ranked items | Confidence |
|---|---|---|---|---|
| `recommended` | Auth JSON L15–25 | categoryId 824, limit 30, infinite, horizontal | Backend recommender for signed-in account | Strongly Supported |
| `top_games` | UnAuth JSON L4–14 | categoryId 824, limit 12, finite, vertical | Backend global/popular ranking | Strongly Supported |
| `favorites` | Auth JSON L27–37 | categoryId 825, limit 30 | Backend list of account favorites | Strongly Supported |
| `viewed` | Auth JSON L47–57 | categoryId 847, limit 30 | Backend recently-viewed history | Strongly Supported |
| `slots_popular` | both, partId 1 | categoryId 17, limit 8 | Backend popularity by slot genre | Strongly Supported |
| `live_popular` | both, partId 37 | categoryId 17, limit 8 | Backend popularity by live-casino genre | Strongly Supported |
| `crash_popular` | both, partId 149 | categoryId 17, limit 8 | Backend popularity by crash genre | Strongly Supported |
| `daily_tasks` / `user_tournaments` / `tournament_month` / `promotions` | Auth/UnAuth/Virtual | none / UI-only | Campaign, tournament & promo backends | Strongly Supported |

`mi0` confirms two platform variants: `MY_AGGREGATOR(2)`, `MY_VIRTUAL(3)` (`a\mi0.java:4–6`).

#### 1.7 Part-id → name mapping (corroboration of the genre split)

`a\k21.java:83–111` maps numeric `partId`s to analytics type strings when a user adds a promoted game to favorites:

```java
if (j == 75)      str = "live_1x";
else if (j == 17) str = "slots_popular";
else if (j == -1) str = "recommended";
else              str = j == 37 ? "live_aggregator_popular" : "null";
...
kt2Var.a("promo_games_recomended_call",
         xp20.f(new Pair("action","add_favor"),
                new Pair(Payload.TYPE, str),
                new Pair("game_id", Long.valueOf(j5))));
```

The same call is also emitted as analytics event id **3295** via `x20Var.f40143a.a(tx3.l0(...), 3295L)` (`a\k21.java:96`). This is a **feedback signal**: the app reports which recommendation type produced a favorite action, and for which game. **Confirmed** that the event is emitted; **Unverified** whether/when the backend uses it to re-rank.

Complementary analytics seen: `a\kgb0.java:314–318` logs `games_promos_popular_call` with `point=lucky_wheel`, event id **12012**; `a\jm8.java:426–435` logs `games_bonus_games_call` with `point=lucky_wheel`; `a\am10.java:57` / `a\bo10.java:302` log `games_promos_lucky_wheel`.

#### 1.8 Local processing vs backend ranking

**Local processing (Confirmed):** `a\mii0.java:1364–1391` and `a\zri.java:482–505` do exactly three things:

1. `HashSet` dedupe of blocks by `jj0.f16598a` (block id);
2. `j120.i0(block, platform)` conversion, discarding blocks that fail conversion;
3. return the ordered `List<gj0>` — the **asset/backend order is preserved**; no `sort`, `compare`, `weight`, or `score` call occurs.

**Backend ranking (Strongly Supported):** because the client only carries `categoryId`, `partId`, `limit`, `filterType` upstream and never scores, the ordering of returned games must be produced by the backend. **Unverified:** whether that backend uses collaborative filtering, popularity counts, absolute counts, or manual merchandising.

**No ML model in APK (Probable):** no `.tflite`, `.mlmodel`, ONNX, or on-device inference library was observed in the relevant package paths; no scoring code accompanies the carousel models. (A full binary-wide asset inventory was not performed for this deliverable, so this is stated as Probable, not Confirmed.)

#### 1.9 Behavioral / account signals — what the APK actually shows

| Signal | Evidence | Confidence |
|---|---|---|
| Geo / country | `COUNTRY_ID_PREFS_KEY`, `ISO_CODE_KEY` used as layout key (`a\knf0.java:36–48`, `a\mii0.java:1393–1395`) | Confirmed |
| Account favorites | `favorites` carousel, categoryId 825 (`Auth.json:27–37`); `k21.java` logs `add_favor` | Confirmed (surface + telemetry) |
| View history | `viewed` carousel, categoryId 847 (`Auth.json:47–57`); `FavoritesInternalNavigation$favoriteDashboardViewedFragment$1.java` | Confirmed (surface) |
| Auth state | separate Auth/UnAuth layouts; `mi0`/`z41` choose by `z` = signed-in flag (`a\z41.java:144–165`) | Confirmed |
| Interaction with recommendations | `promo_games_recomended_call` + event 3295 (`a\k21.java:96–111`) | Confirmed |
| Betting-pattern-based scoring | none found | Unverified |
| Location beyond country id (GPS/IP) | no recommendation-specific code found | Unverified |

**Note:** `assets/localConfig.json:52` contains `ShopPopularPersonalizationTips: true` — a UI tips flag, **not** evidence of a personalization algorithm. It should not be over-read.

#### 1.10 Recommendation generation — Mermaid

```mermaid
flowchart TD
    A[App start / Aggregator tab] --> B[knf0: read COUNTRY_ID_PREFS_KEY, ISO_CODE_KEY]
    B --> C[Build key UUID = platform+screen+countryId+isoCode<br/>a/z41.java:100-106]
    C --> D{mii0.v / zri: cached layout available?}
    D -- SharedPreferences LAST_*_KEY + AtomicFile --> E[Load cached f51 layout]
    D -- miss --> F[Remote fetch mii0.n screen, countryId, isoCode]
    F -- fail g2 --> G[Bundled asset fallback:<br/>layoutConfigurationAggregatorAuth / UnAuth / Virtual.json]
    F -- success --> H[Persist via z41.g + h]
    E --> I[Parse layout_blocks -> jj0 blocks<br/>id, typeId, name, nameType, additionalData]
    G --> I
    H --> I
    I --> J[Dedupe by block id<br/>a/mii0.java:1364-1370]
    J --> K[j120.i0: typeId -> kj0 enum -> GamesCarouselModel xi0<br/>categoryId, limit, filterType, isInfinite, partId, layoutType]
    K --> L[Backend request per carousel<br/>CONTAINS ranking inputs]
    L --> M[Backend returns ordered games]
    M --> N[Render carousels in config order]
    N --> O[User taps add_favor / opens game]
    O --> P[Analytics: event 3295 + promo_games_recomended_call<br/>action, type, game_id — a/k21.java]
    P -. feedback loop, server-side unknown .-> F
```

---


## 7. Payment Architecture

### Executive summary

| Question | Answer | Confidence |
|---|---|---|
| Where do payment methods & their min amounts live? | In **backend-rendered HTML**, loaded into an in-app `WebView` at `<domain>/paysystems/{deposit\|withdraw}?...`. There is **no native payment-method enum, no native min/max amount constant, and no local asset listing payment methods**. | **Confirmed** (code-level: URL builder + WebView; no native model found after targeted search) |
| What makes the minimum change on every refresh? | **Backend** decides it. Each refresh generates a *fresh* URL and re-issues the WebView request with session-bound headers (`X-Auth: Bearer …`, `X-Deeplink`, `h_guid`, `sub_id`). No client-side randomization or local fallback config exists. | **Strongly Supported** (client side proven; backend side unverified — backend dependency) |
| How is deposit/withdraw "success" determined? | By a **substring match on the WebView URL** (`/onpay/success`, `/onpay/fail`, `/onpay/pending`, `/onpay/cancel`, and `/onpay/withdraw/*`). No HMAC/signature validation of the callback. Backend remains authoritative for the actual ledger change. | **Confirmed** |
| Are amount discrepancies caused client-side? | **No client-side amount is sent for gateway deposits/withdrawals.** The app passes only currency/balance id + deposit flag; the amount is entered and submitted on the backend page. Internal wallet transfers use a `double` (`MoveMoneyRequest.transferAmount`) — a theoretical float-precision risk, but not the gateway path. | **Confirmed** (gateway path) / **Unverified** (root cause of user reports requires backend logs) |
| Deposit vs withdrawal limits independent? | Yes at the routing level (`/paysystems/deposit` vs `/paysystems/withdraw`); responsible-gaming limits are a separate backend service (`LimitService`). | **Strongly Supported** |

> **Bottom line for the primary objective:** the app is a *transport* for a backend payment portal. The changing minimums are almost certainly generated server-side per request (possibly keyed on session/geo/account/risk/A-B bucket). This cannot be proven further from the APK alone — the decisive evidence is in the backend HTTP response for the paysystems URL. Recommended next step (out of scope here): capture that response in an authorized test session and diff two refreshes with identical headers except `h_guid`/timing.

---

### Scope, evidence standards, and negative-search notes

Confidence labels: **Confirmed** (direct code), **Strongly Supported** (code + consistent absence of alternatives), **Probable** (inference), **Unverified** (needs backend/runtime).

Negative claims in this report are based on the following searches (all under `D:\1xbetrea\decompiled\sources`):
- `rg -i 'minamount|min_amount|min_sum|maxamount|minimal' -g '*.java'` → only `Integer.MIN_VALUE` noise, `R.string.min_amount/max_amount` resource IDs, and responsible-gaming `LimitService` models. No payment-provider min/max model.
- `rg -i 'webmoney|qiwi|skrill|neteller|bitcoin|tinkoff|kaspi|...' -g '*.java'` → no payment-system enumeration class; matches are unrelated obfuscated strings.
- `rg 'Random|nextInt|Math.random|SecureRandom|shuffle'` over `w5z.java`, `db90.java`, `n1.java`, `ze1.java` → **zero matches**.
- Native libs (`libkeys.so`, `libsecurity.so`, `libantifraud.so`, `libtoolChecker.so`) exist but were not required to explain the observed payment flow; encrypted assets (`assets/remote-config/remote-config.json` → `{"dataHex":"…"}`) cannot be read statically without their keys.

---

### A. Payment architecture

#### A.1 Enumeration of payment methods — there is no native list

**Finding (Confirmed).** The app contains **no class that enumerates deposit/withdrawal payment systems** and no local JSON of payment methods. Instead:

1. The "Pay systems" screen is reached via deep link `xbet://open/paysystems?balanceId=…`.
   - `a\hrj.java:41` — enum constant `PAY_SYSTEMS("paysystems")`.
   - `a\erj.java:2806–2812` — deep-link router builds `vbd0(balanceId, registrationDefaultBonus)` from `paysystems` route (query params `balanceId`, `REGISTRATION_DEFAULT_BONUS_ID`).
   - `a\vbd0.java:6–34` — `PaySystem(balanceId, registrationDefaultBonus)` navigation model (no method list).
   - `org\xplatform\rules\impl\navigation\PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1.java:30–56` routes to a WebView fragment `a\x790` / `a\lmg0` with `EXTRA_URL`.

2. The URL for that screen is built at runtime in `a\w5z.java`, method `T(long balanceId, Continuation, boolean deposit)` — JADX left it as a bytecode dump at `a\w5z.java:1390–1400`; the equivalent smali is `apktool_out\smali_classes4\a\w5z.smali:8328–9310`. Reconstructed (sanitized):

   ```
   https://<runtime-domain>/paysystems/{deposit|withdraw}
       ?host=<host>
       &lng=<ISO language/country>
       &type=2
       &whence=22
       &h_guid=<app-install GUID>
       &m_project_id=1357
       &sub_id=<balanceId / currency id>
   ```
   Evidence lines (smali): path segments `paysystems` at `:8776`, `deposit`/`withdraw` at `:8791–8798`; query keys `host` `:9061`, `lng` `:9066`, `type=2` `:9071–9074`, `whence=22 (0x16)` `:9078–9085`, `h_guid` `:9089`, `m_project_id=1357 (0x54d)` `:9093–9102`, `sub_id=<balanceId>` `:9108–9114`; URL-encoding at `:9245–9285`.

   - Base domain `ujn.h` default: `a\ujn.java:22` → `"https://mob-experience.space"`, overwritten at app start from config: `a\p36.java:148–152`, `a\p36.java:192–196`, `a\bl50.java:59`, `a\to3.java:146`.
   - `h_guid` source: `a\knf0.java:24–34` (`FAKE_APP_GUID_ENABLED` override otherwise a persisted GUID); `lng` source: `knf0.c()` ISO code at `:46–48`; country id: `knf0.b()` at `:42–44`.

3. Payment *information* pages are also backend WebViews:
   - `a\okw.java:209` → `/paysystems/information/?type=2&whence=22&lng=<lang>&ref_id=1`
   - `a\j790.java:43` and `a\s690.java:44` → `/PaymentConsultant/office/payment/requests?set-base-url=v3-api&skip-lang-redirect=1`

**Conclusion (Confirmed):** the catalogue of deposit/withdrawal methods (cards, banks, e-wallets, crypto, local methods), their icons, and their displayed min/max amounts are **backend data**. The APK only provides the WebView container and request context. Any enumeration therefore requires the backend response, not the APK.

#### A.2 End-to-end trace: UI action → API → URL → WebView → callback → status

**Navigation into the payment screen (Confirmed):**
- `a\u88.java:490–520`, `a\qv3.java:595`, `a\d7a0.java:394`, `a\g940.java:40`, `a\hbu0.java:44`, `a\oau0.java:30`, `a\qi4.java:191` construct `PaymentScreenFactoryImpl$getPaymentScreen$1(r990, boolean deposit, long balanceId)`.
- `org\xplatform\feature\office\payment\impl\di\navigation\PaymentScreenFactoryImpl$getPaymentScreen$1.java:31–62` chooses between two WebView-backed fragments behind a feature flag `ygp.e`:
  - **new:** `a\r790` (`compose_fragment`), args `CURRENCY_ID`, `REDIRECT_URL`, `deposit`, `NOTIFICATION_ID` (`r790.java:35, 50–53`),
  - **old:** `a\o890` (`fragment_payment_browser`), identical args (`o890.java:54, 68–71`).
- `getPaymentRedirectionScreen` variant passes an explicit redirect URL (`…$getPaymentRedirectionScreen$1.java:38–56`).

**URL acquisition (Confirmed, reconstructed from bytecode dumps):**
- `a\k790.java:6–40` — `PaymentContentParams(deposit, currencyId, redirectUrl)`.
- `a\db90.java:87–100` (new ViewModel) / `a\p990.java:81–83,130` (old ViewModel): if `redirectUrl` is empty, fetch it from backend using **balance/currency id + deposit flag**:
  - `a\n1.java:69–82` (bytecode dump) → `w5z.T(balanceId, cont, deposit)`; empty result → error state `ba90` (`n1.java:86–91`);
  - then `a\n1.java:93–105` builds the return URL from `deeplink_scheme` + `"://open"` → **`xbet://open`** (resource value confirmed: `apktool_out\res\values\strings.xml:1724`) and calls `e1u.c(returnUrl, …)` to obtain request headers;
  - emits `fa90` state with `(reloadEnable, k790, url, headers, balanceId, deposit, currentUrl, …)` — `a\n1.java:113–131`, model at `a\fa90.java:9–35`.

**Headers injected into the WebView load (Confirmed):**
`a\s980.java:490–498`:
```java
return xp20.f(
  new Pair("X-Referral", "1"),
  new Pair("X-Auth", <auth token>),
  new Pair("X-Deeplink", (String) obj2),      // "xbet://open"
  new Pair("X-Mobile-Project-Id", "1357")
);
```
- `X-Auth` source: `a\btt0.java:15–26` → `Bearer <new_user_token>` from SharedPreferences `"new_user_token"` (value redacted).
- `PaymentWebView.d()` overrides `loadUrl(url, extraHeaders)` (`PaymentWebView.java:121–136`; `FixedWebView.java:63–70`), so these headers ride on the **initial** gateway navigation.
- Note discrepancy: `localConfig.json:10` declares `ProjectId = 216`, but networking code hardcodes `1357`. Documented as an observation, not a finding.

**WebView launch & lifecycle (Confirmed):**
- Old screen: `a\o890.java:129–145` wires file chooser / permission callbacks; `:140–190` error handlers; `:194–244` installs the URL router + JS bridge; `:353` `addJavascriptInterface(new l3v0(...), "paymentWebHandler")`; `:246–258` title = `payments_pay_in` when `deposit==true` else `payments_pay_out`; `:253` adds a `REFRESH_BUTTON`.
- New screen: `a\r790.java:56–82` lifecycle; `a\n790.java:156` `initWebView(PaymentWebView)`.
- On refresh: `a\db90.java:179–186` handles `o490` (`OnRefreshClick`) → logs analytics `dep_refresh_method` via `vd1.f37210a.c("dep_refresh_method")`, emits metric `3135`, calls `N()` and `O()`; `N()` at `db90.java:121–130` re-runs the URL/state use case (`ze1(db90, url, k790, balanceId, …)`, `a\ze1.java:641–648`). Old screen equivalent: `a\p990.java:155–157` (scheduled refresh) and `a\s980.java:485–488`.

**Callback & status determination (Confirmed):**
- `a\hs80.java:73–80` (case 9): any URL containing `/onpay/` produces `i490` (`OnPayCheck(url)`, `a\i490.java:6–18`).
- `a\xj80.java:704–766` (case 28 = `checkOnPay(String)`) matches URL substrings:
  - `/onpay/success` → `dep_done` analytics, metric `3044`, snackbar `notification_payment_succeed`, `qek0` (success style), then refresh;
  - `/onpay/fail` → `dep_error`, metric `3045`, `notification_payment_fail`, `rek0` (error style), refresh;
  - `/onpay/pending` → `notification_payment_pending`, refresh;
  - `/onpay/cancel` → `notification_payment_cancel`, refresh;
  - `/onpay/withdraw/success|fail|pending|cancel` → corresponding withdraw snackbars;
  - on any match, `p990VarM2.p.b` use case re-fetches balance/data and `A()` clears side effects (`:759–762`).
- New ViewModel duplicate of the same table: `a\db90.java:294–338` (with `/onpay/withdraw/cancel` special case).
- **No signature/HMAC/transaction-id verification** of these URLs exists in the app. This is a UI-state heuristic only; it does not grant funds or change balances. It is **not** a bypass of backend authorization (balance/bet history is re-fetched from backend).
- `OnRedirectToBrowser(url)` (`a\m490.java`), `OnCorruptedFileUrl` (`a\b490.java`), `OnDownload` (`a\c490.java`), `OnNetworkDisabled`, `OnPageFinish`, `OnError*` are the side-effect events consumed by `db90.x()` (`db90.java:143–339`).

#### A.3 Responsibility split

| Concern | App (client) | Payment gateway / backend Web page | Backend APIs |
|---|---|---|---|
| Method list + min/max display | WebView container only | **Renders** list, icons, min/max, fees, form | Serves HTML/JS at `/paysystems/{deposit\|withdraw}` |
| Amount entry / formatting | None on gateway path (native only for internal `moneyMove`) | Collects amount, applies provider fees/FX | Authoritative ledger |
| Session bootstrap | Builds URL, injects `X-Auth`, `X-Deeplink`, `h_guid`, `sub_id`, `lng` | Consumes headers, sets session | Generates redirect URL (`w5z.T`), validates token |
| Redirect / 3-D Secure | Intercepts custom schemes, opens external apps/browser | Performs provider redirects | — |
| Success/failure | Substring match on URL + refresh + snackbar | Renders `/onpay/*` target URL | Re-fetch of balance/history is authoritative |
| Responsible-gaming limits | Native UI + error display | — | `LimitService` (`fuz.java`) |

---


## 8. Browser-Based Payment Processing

### B. Browser-based payments

#### B.1 What triggers browser opening; exact URLs and parameters

There are **three** distinct launch modes (Confirmed):

1. **In-app WebView (default).** `PaymentWebView` extends `FixedWebView` → `android.webkit.WebView`. Settings at `PaymentWebView.java:77–108`: `setDomStorageEnabled(true)`, `setJavaScriptEnabled(true)`, `setLoadWithOverviewMode(true)`, `setUseWideViewPort(true)`, `setAllowFileAccess(true)`, feature flag `PAYMENT_REQUEST` enables a WebSettings compat path (`:86–103`), `setInitialScale(1)`, `setLayerType(2, null)`, custom `WebChromeClient`/`WebViewClient`.
   Initial navigation: `PaymentWebView.d(url, headers)` → `loadUrl(url, headers)` (`:121–136`), scheme-repair: strings not starting with `http`/`mailto`/`tel` are prefixed `"http://"` (`:132–134`).

2. **JS bridge → external browser/app.** `PaymentWebView` exposes `paymentWebHandler` (`o890.java:353`, `xj80.java:590–611`):
   - `l3v0.openInBrowser(String json)` (`a\l3v0.java:22–34`) parses `k3v0{url}` (`a\k3v0.java:6–20`) → `startIntentAction(intent)` → `o890.R0(intent)` (`o890.java:530–546`) → `startActivity`.
   - `l3v0.redirectToPersonalProfile()` (`l3v0.java:36–39`).
   - Equivalent old-screen handler: `startLaunchSocial(resId, package, uri)` (`o890.java:194`, `xj80.java:680–703`, `f490.java`).

3. **URL-scheme router inside the WebView** — `PaymentWebView.l(Uri)` (`PaymentWebView.java:210–299`), invoked from `hb90.shouldOverrideUrlLoading` (`hb90.java:169–181`). Full decision table:

   | Matched input | Action | Evidence |
   |---|---|---|
   | URL contains `/office/verification` + `type=sumsub` | emit verification event, stay in WebView | `PaymentWebView.java:220–231` |
   | `sobflous://`, `sberpay://`, `https://kaspi.kz` | `ACTION_VIEW` external intent | `:232–238` |
   | URL ends `.pdf` | wrap `https://docs.google.com/gview?embedded=true&url=<uri>` | `:239–246` |
   | `mailto:`, `tel:` | external intent | `:247–252` |
   | `browserintent://<url>` | strip prefix, `ACTION_VIEW` → external browser | `:253–259` |
   | `intent://…` | `Intent.parseUri(..., 1)` → external app | `:260–267` |
   | telegram (`tg://`, `t.me`, `telegram.me`, `telegram.dog`) / `viber://` | open installed app via `xdr.F` | `:268–284` |
   | any other non-`http` scheme | `ACTION_VIEW` external intent | `:285–293` |
   | `/onpay/*` via callback `o` | handled by `checkOnPay` (see §A.2) | `:268–270` |

   `l()` returns `true` for every non-null URI (verified in smali `PaymentWebView.smali:1048+`, `v3 = 1` and all exits `return v3`) — i.e. the client asserts interception of navigations.

**Parameters actually passed by the app** (sanitized). Two layers:

- **Payment portal URL** (from `w5z.T`, §A.1): `host`, `lng`, `type=2`, `whence=22`, `h_guid=<install GUID>`, `m_project_id=1357`, `sub_id=<balanceId>`, path `/paysystems/{deposit|withdraw}`. **No amount, no user id, no signature in the app-built URL.**
- **HTTP headers added to the WebView request** (`s980.java:490–498`): `X-Referral: 1`, `X-Auth: Bearer <redacted>`, `X-Deeplink: xbet://open`, `X-Mobile-Project-Id: 1357`.
- **Deep link return URL**: `xbet://open` (`p990.w()` at `p990.java:159–161`, `n1.java:93–100`); manifest registers `xbet://open`, `xbet://openapp`, `xbet://telegramBot` on `IntentForwardingActivity` (`AndroidManifest.xml:177–184`), parsed by `erj.java:1036–1038` → `prj.D(uri, …)` (`prj.java:342+`).
- The **gateway transaction id, amount, currency, signature, provider reference, language and device id** that appear in the final provider redirect are generated by the **backend page**, not by this APK. They are not visible statically.

#### B.2 Session initialization, completion, abandonment, validation

- **Init:** constructor of `db90` (`db90.java:87–104`) / `p990` (`p990.java:81–83`) → `w5z.T` (URL) + `e1u.c` (headers) → `fa90` state. Page load occurs via `PaymentWebView.d`; `hb90.onPageStarted` clears error dedupe sets and flags (`hb90.java:57–68`); `onPageFinished` reveals the WebView and fires the page-finish side effect (`:38–55`).
- **Completion:** `/onpay/success` or `/onpay/withdraw/success` → snackbar + `dep_done` analytics + data refresh (§A.2).
- **Abandonment:** `/onpay/cancel*` → cancel snackbar + refresh. Closing the fragment clears all callbacks and destroys the WebView (`r790.java:161–184`, `o890.java:744–765`).
- **Pending/async:** `/onpay/pending` variants are handled as distinct UI states, with **automatic refresh** — evidence that the app anticipates delayed backend settlement (`db90.java:323–330`, `xj80.java:736–739`). No polling loop for a specific transaction ID exists client-side; the refresh is a generic balance/data re-fetch.
- **Failure:** HTTP errors ≥ 400 on the main frame are classified with host comparison (`hb90.java:90–126`): if the host differs from the initial host it is tagged `REDIRECT`, else `HTTP`; status codes 401/500/502/504 (`PaymentWebView.java:49`) trigger a refresh callback; 404 stops loading. SSL errors are checked against bundled certificates (`tiq.java:17–75`, `hb90.java:128–167`) and only proceed when the pinned chain validates.
- **Callback validation:** **none cryptographically** — only URL substring matching. A URL containing `/onpay/success` anywhere would produce a "success" snackbar; this has no ledger effect. Transaction-to-session correlation is not done client-side (no transaction id is passed into the app-built URL); correlation, if any, is backend-side via `X-Auth` / cookies / `h_guid`.

#### B.3 `PaymentWebView`, manifest, whitelist

- `PaymentWebView.java` — full inspection above. Notable: `setAllowFileAccess(true)` (`:84`) and JS bridge (`:353` via owner) are expected for gateway pages, but widen the attack surface if a gateway page is compromised.
- `a\gb90.java` — WebChromeClient: console errors become `ib90.JS` telemetry (`:60–83`), `onCreateWindow` creates nested WebViews with JS enabled (`:85–111`), fullscreen video handling (`:113–189`), file chooser/permission delegation (`:150–207`).
- `a\hb90.java` — WebViewClient as above; error taxonomy enum `a\ib90.java` (`MAIN_FRAME`, `REDIRECT`, `HTTP`, `SSL`, `JS`), error event `a\jb90.java`.
- Manifest (`apktool_out\AndroidManifest.xml`): `IntentForwardingActivity` exported with `xbet://open|openapp|telegramBot` filters (`:158–185`); `ApplicationActivity` singleTop (`:142`); `Android App Links` for `https://<domain>/line` and `/live` (`:159–170`). No exported payment activity; payment fragments are internal.
- URL validation: **no domain allow-list for the WebView itself.** `PaymentWebView.d` trusts the URL supplied by the ViewModel, and reload/redirect handling relies on host *comparison for telemetry only* (`hb90.java:96–105`, `PaymentWebView.java:210–216`). Custom-scheme handling is an explicit list (§B.1); other non-http schemes are forwarded to `ACTION_VIEW`.

---


## 9. Payment Discrepancies and Root-Cause Analysis

### C. Payment discrepancies (requested / displayed / submitted / recorded amounts)

#### C.1 Rounding, conversion, fee, parsing — what the client actually does

**Finding (Confirmed for the gateway path): the app never computes a deposit/withdrawal amount.**
- The app-built URL (`w5z.T`) contains no amount, no currency amount field, no fee field (§A.1). The provider form and its validation live in backend HTML.
- No `BigDecimal`/`NumberFormat`/`DecimalFormat` amount handling exists in the payment screen code. The only `BigDecimal` in `w5z.java:2322` is `new BigDecimal(String.valueOf(ru6Var.f)).toPlainString()` inside bet-parameter serialization (`Param`), unrelated to payments.
- `a\tu40.java:6–35` — `MoveMoneyRequest(transferAmount: double)`; endpoint `POST /RestCoreService/v1/Mb/moneyMove` (`a\boe0.java:20–24`, `X-Auth` header, `Accept: application/vnd.xenvelop+json`). This is an **internal wallet money move**, and it does serialize a money value as a Java `double`. A float-representation/round-trip mismatch is *possible in principle* (e.g. 0.1+0.2 style artifacts, `Double.toString` formatting), but (**Unverified**) there is no evidence this endpoint is used for external deposits/withdrawals, and no evidence of user-visible truncation.

**Therefore:**
- **Confirmed code-level cause of gateway amount differences inside the app: none found.**
- **Probable locus of user-reported differences:** backend/gateway — display rounding, FX conversion at submission time, provider fee added after the displayed "you send" figure, or a stale cached quote. This is a backend-data question; the APK cannot prove or disprove it.

#### C.2 Duplicate / delayed / stale state — what the client does

| Behavior | Code | Assessment |
|---|---|---|
| Callback success/fail/pending triggers a generic data refresh, not a transaction-specific query | `db90.java:294–338`, `xj80.java:704–766`, `p990.A()` | **Confirmed.** Could display a balance that is momentarily stale if backend settlement lags; not a client bug per se. |
| Error dedupe `LinkedHashSet k` + counter `l` (max 3 repeats of one error class) | `PaymentWebView.java:55, 130–131, 176–194`; reset in `hb90.java:62–63` | **Confirmed.** Prevents error spam; may suppress repeated genuine errors within one page load. |
| `onPageFinished` fires page-finish side effect once per load via flag `f` | `hb90.java:38–55` | **Confirmed.** No transaction id attached. |
| No local persistence of payment session / transaction id | no `payment` SharedPreferences write except reading `"ok.payment"` (`w5z.java:2085` in smali) | **Confirmed.** Re-create/refresh discards prior state; "stale session" behavior would be backend-driven. |
| No client-side lock / idempotency key around refresh or callback | `db90.M()`, `N()`, `O()` are fire-and-forget coroutines | **Confirmed.** A rapid double-tap of refresh issues two URL fetches; `O()` cancels the previous `bby` job (`db90.java:132–140`), so likely benign, but exact cancellation semantics are not fully decompilable. **Hypothesis only — not reported as a bug.** |

**Do not assume fraud.** Every observed mechanism is consistent with ordinary asynchronous settlement and backend-side pricing. No code suggests intentional amount manipulation.

---


## 10. Deposit and Withdrawal Limit Behaviour

### D. Dynamic deposit / withdrawal limits — PRIMARY OBJECTIVE

#### D.1 Where min/max values originate

| Candidate source | Verdict | Evidence |
|---|---|---|
| Local asset JSON (`localConfig.json`, `init.json`, config assets) | **No** — no min/max fields; `localConfig.json` only has menu/common settings | read in full, §artifacts |
| Hardcoded constants in app code | **No** for payment-method minimums; only `whence=22`, `type=2`, `m_project_id=1357` constants in URL builder | `w5z.smali:8791–9102` |
| Remote config (`remote-config.json`) | Encrypted (`dataHex`), cannot be read statically; no code links it to payment min amounts found | asset inspection + searches |
| Payment-provider-specific values | Rendered by the backend page inside the WebView | URL builder + WebView fragments |
| Backend payment API | **Yes** — the redirect URL and page content come from backend (`w5z.T`); min/max is part of that response | `n1.java:69–105` |
| Responsible-gaming self-limits | **Separate backend service**, not payment-method minimums | `fuz.java`, `j300.java`, `yfg.java:416–429` |

#### D.2 Exact requests/responses for limits and caching/refresh behavior

**Payment-method minimums (the reported symptom):**
- Request: in-app WebView navigation to the freshly generated URL from `w5z.T` (§A.1), with injected headers (§B.1). It is a **page load**, not a typed Retrofit API call, so there is no response model in the APK.
- Refresh: `REFRESH_BUTTON` (`o890.java:253`) → `OnRefreshClick` (`o490`) → `db90.N()/O()` → **new URL generation + new WebView load**; analytics `dep_refresh_method` emitted (`db90.java:179–186`). Old screen: `p990` refresh with 10 s cooldown Lottie (`p990.java:85–129`). The cooldown applies to the error-state retry button, not to the toolbar refresh.
- Caching: No client-side cache of min/max values exists (no model, no store). WebView HTTP cache may apply but is bypassed in practice by the changing query/header context. **No fallback local config.** **No randomization** (search returned zero matches in all relevant classes).

**Responsible-gaming limits (different feature, documented to avoid conflation):**
- API interface `a\fuz.java`:
  - `GET LimitService/api/mobile/v4/limits` with `@ofr`, `X-Auth` header, `lng` query (`fuz.java:13–16`) → `dx5<j300>` (encrypted envelope).
  - `POST LimitService/api/mobile/v4/limits` (`:18–21`), `/limitaction` (`:23–25`), `/v3/realitycheckaction` (`:27–29`), plus v2 variants `LimitService/v2/external/mobile/limits|limitaction|testanswers` in `a\kuz.java`.
  - All use `Accept: application/vnd.xenvelop+json`; `dx5` indicates an encrypted/obfuscated envelope decoded with native libs.
- Response model `a\j300.java:6–46` → `LimitsResponse(moneyLimits, timeLimits)`.
- Backend enforcement error codes displayed natively: `a\yfg.java:416–429` — HTTP 403 with `DayDepositLimitInvalidRange`, `WeekDepositLimitInvalidRange`, `MonthDepositLimitInvalidRange`, `DayMonthLimitHierarchyViolationWarning`, `DayYearLimitHierarchyViolationWarning`, `MonthDayDepositLimitsInvalidRange`, `CurrentDepositLimitsInvalidValue`, `CurrentDepositLimitsExpensesInvalid` (`a\i2o.java`). The app shows the backend message verbatim.
- These values are user-configured self-limits; they do not explain a *payment method's* minimum changing on refresh.

#### D.3 Are deposit and withdrawal limits computed independently?

**Strongly Supported: yes, at least at the routing/transport layer.**
- Distinct URL path segments built from the `deposit` boolean: `/paysystems/deposit` vs `/paysystems/withdraw` (`w5z.smali:8791–8798`, `u88.java:493–516`).
- Distinct callback families: `/onpay/success|fail|pending|cancel` vs `/onpay/withdraw/success|fail|pending|cancel` (`db90.java:294–338`).
- Distinct analytics/metrics for deposits (`dep_done` 3044, `dep_error` 3045) vs withdraw snackbars.
- Whether the *backend uses the same minimum table* for both is unknown — backend dependency.

#### D.4 PRIMARY OBJECTIVE — exactly what drives changing minimum amounts

**Evidence-supported chain (Confirmed client side):**

1. Every entry/refresh of the payment list constructs a *new* URL via `w5z.T(balanceId, deposit)` and performs a fresh WebView load with the same `X-Auth` but a request context that includes `h_guid` (install/session GUID, `knf0.a()`), `sub_id` (balance/currency id), `lng`/`host` (geo/language), and timestamp-implicit freshness (`p36.java` domain resolution; `knf0.java:24–48`).
2. The app holds **no** min/max state, performs **no** rounding/FX for this path, has **no** randomization, and has **no** local fallback values.
3. Therefore the minimum displayed is produced by the **backend response** to that WebView request.

**Most probable backend drivers (Hypotheses — cannot be confirmed from APK; listed for investigation, not asserted as fact):**
- Per-session/per-request variation keyed on `h_guid` or a server-set cookie (A/B bucket, experiment assignment).
- Geo / country / language segmentation via `host` + `lng` (+ country id from `knf0.b()`), especially relevant for `limits_africa`, `limits_ee`, `limits_kenya`, `limits_ne` modules present in the app.
- Account/risk segment or payment-provider rotation / load balancing behind the portal, using `X-Auth` and `sub_id`.
- Time-based or provider-availability-driven minimums.
- Stale/edge-cached variants of the portal page served across refreshes.

**What is NOT supported by evidence:** client-side randomness, client-side currency conversion, a hardcoded table being shuffled, or the app deliberately altering amounts.

**Reproducible verification plan (requires authorized runtime access, NOT performed):**
1. With a test account and controlled environment, load `xbet://open/paysystems?balanceId=<test>` twice with ≥30 s separation.
2. Capture the **request URL** and **response body** for the `/paysystems/deposit?...` navigation (redact `X-Auth`, cookies, `h_guid`).
3. Diff the two responses for `min`/`minAmount`/`min_sum` fields and experiment/cohort headers.
4. Repeat with `h_guid` forced via `FAKE_APP_GUID_ENABLED`/`FAKE_APP_GUID` (`knf0.java:24–34`) to isolate GUID-dependence; repeat with a different `lng` to isolate geo-dependence.
5. Compare `/paysystems/deposit` vs `/paysystems/withdraw` responses to confirm independent tables.

---


### Evidence index (file : lines)

| Finding | Path (relative to `D:\1xbetrea\decompiled\sources` unless noted) |
|---|---|
| WebView class, loadUrl+headers, URL router | `org\xplatform\feature\office\payment\impl\presentation\view\PaymentWebView.java:48–313` |
| WebViewClient / error taxonomy | `a\hb90.java:38–193`, `a\ib90.java`, `a\jb90.java`, `a\tiq.java:17–95` |
| WebChromeClient | `a\gb90.java:23–212` |
| JS bridge | `a\l3v0.java:22–39`, `a\k3v0.java:6–20`, `a\o890.java:353`, `a\xj80.java:590–611` |
| Header construction (X-Auth etc.) | `a\s980.java:490–498`, `a\btt0.java:15–26`, `a\btt0.java:27–30` |
| Payment portal URL builder | `a\w5z.java:1390–1400` (dump); `apktool_out\smali_classes4\a\w5z.smali:8328–9310` |
| URL fetch / state emission | `a\n1.java:38–137`, `a\fa90.java`, `a\k790.java`, `a\ze1.java:641–648` |
| ViewModel callback table | `a\db90.java:121–140, 143–339`; `a\xj80.java:704–766` |
| Fragments / args / refresh button | `a\r790.java:35–82, 161–184`; `a\o890.java:54–72, 129–258, 530–546` |
| Return deep link | `a\p990.java:159–161`; `AndroidManifest.xml:158–185`; `strings.xml:1724`; `a\erj.java:1022–1039`; `a\prj.java:342+` |
| Paysystems deep-link route | `a\hrj.java:41`; `a\erj.java:2806–2812`; `a\vbd0.java`; `a\okw.java:209`; `a\j790.java:43`; `a\s690.java:44` |
| LimitService API + model + errors | `a\fuz.java:13–34`, `a\kuz.java`, `a\j300.java:6–46`, `a\yfg.java:416–429`, `a\i2o.java` |
| Internal money move (double) | `a\boe0.java:20–24`, `a\tu40.java:6–35` |
| Dynamic domain / GUID / geo | `a\ujn.java:22`, `a\p36.java:148–152`, `a\knf0.java:24–48` |
| Feature flag choosing payment fragment | `org\xplatform\feature\office\payment\impl\di\navigation\PaymentScreenFactoryImpl$getPaymentScreen$1.java:31–62` |

---


### Limitations / missing information (explicit)

1. **Backend source/DB not provided.** The actual min/max values, their computation, A/B configuration, expiry, and provider rotation are unknowable from this APK. This is the decisive gap for D.4.
2. **Several key coroutines are JADX "method dump skipped"** (`w5z.T`, `n1.l`, `ze1.invokeSuspend`). Reconstructions above come from smali and call-site context; exact suspension-point ordering may differ. No claim depends on a skipped detail beyond what smali confirms.
3. **Encrypted assets/config** (`remote-config.json` `dataHex`, `Accept: application/vnd.xenvelop+json` responses) require native keys; not decrypted (static-only scope).
4. **Provider URLs/parameters** (transaction ids, amounts, signatures) are emitted by the remote page at runtime and are not in the APK.
5. **No dynamic verification** was performed (per scope). All user-reported symptoms are treated as reports, not as confirmed vulnerabilities; nothing here alleges fraud.

## 11. Free Spins: Implementation and Algorithm Analysis

### PART 2 — FREE SPINS AND NON-MONETARY TEST FEATURES

#### 2.1 Feature inventory and entry points

| Feature / module | Entry point classes (decompiled) | Monetary? | Outcome source |
|---|---|---|---|
| **Lucky Wheel** | `a\fm10.java` (fragment), `a\bo10.java` / `a\pn10.java` (ViewModels), `a\bn70.java` (holder), `a\dm10.java` (state→animation), `org\xplatform\lucky_wheel\presentation\views\WheelView.java` | Can be **free** or **for money** (button strings both exist, §2.3) | Backend `LuckyWheelBonus` |
| **Spin & Win** | `org\xplatform\spin_and_win\...\SpinAndWinWheelView.java`, `SpinAndWinChoiceView.java`; VMs `a\tyk0.java`, `a\u90.java`, `a\qyk0.java`, `a\r90.java` | Promotional / free | Backend-derived `csr` in VM state |
| **Scratch Card** | `org\xplatform\scratch_card\...\ScratchCardView.java`, `ScratchCardFieldView.java`, `ScratchCardProtectLayerView.java` | Promotional | Card contents supplied as `c7h0.f` list (model) |
| **Lucky Card** | `org\xplatform\core\presentation\custom_views\cards\LuckyCardWidget.java`, `a\jj10.java` | Promotional | Backend sets card face; client RNG picks *reveal index* |
| **Bonus games** | `org\xplatform\bonus_games\...` (`LotteryView`, `MemoryGameView`, `NineTreasuresView`, `ErasableView`) | Promotional | Backend game state |
| **Wild Free Bet** | `org\xplatform\wild_free_bet\...\WildFreeBetScreens$SelectGameScreen.java`, `a\ffv0.java`, `a\bn70.java` (holder bonus) | Free bet | Backend bonus |
| **Demo/simulation game cards** | `dragons_gold`, `apple_fortune`, `eastern_nights`, `african_roulette`, `games_mania`, `domino`, `crystal`, `playersduel` (custom views) | Visual game clients | Backend game state |
| **Test Section (office tool)** | `a\p1q0.java` (hub), `a\stc.java` (Client Config), `a\lgf0.java` (Remote Config test), `a\q1j0.java`, `a\ttc.class`, `a\igf0.java` | Non-monetary tooling | Local + backend config |
| **Swipex onboarding mock cards** | `a\ypn0.java`, `a\qvi.java`, `a\yuu.java`; assets `cardsENG.json`, `cardsRU.json`, `gameEventsCard*.json` | **Non-monetary tutorial** | Hardcoded local assets |

#### 2.2 Outcome model — the prize enum and backend wire format

`a\esr.java:17–24` — client-side outcome enum (`f8344a` is the numeric code):

```java
NOTHING(0), DOUBLE_BONUS(1), RETURN_HALF(2), FREE_BET(3),
FREE_SPIN(4), WILD_FREE_BET(5), SPECIAL_BONUS(666);
```

`a\uk10.java:20–27` — **the same enum as a backend string field** (JSON values are strings):

```java
NOTHING("0"), DOUBLE_BONUS("1"), RETURN_HALF("2"), FREE_BET("3"),
FREE_SPIN("4"), WILD_FREE_BET("5"), SPECIAL_BONUS("666");
```

`a\ok10.java:16–27` — serializer descriptor for `org.xplatform.core.data.LuckyWheelBonus`, revealing the backend JSON field names:

```java
zna0Var.j("BNTID", true);              // bonus type id -> uk10
zna0Var.k(new iy(new String[]{"BT","BNTP"}, b)); // description
zna0Var.j("BNC", true); ... {"BC"}     // bonus enabled
zna0Var.j("GID", true);                // gameTypeId
zna0Var.j(TokenNames.E, true); zna0Var.j("CNT", true);   // count
zna0Var.j("TLM", true);                // remaining time
zna0Var.j("FBSE", true);               // free bet sum
```

`a\rk10.java:90–104` is the matching model (`toString()` prints `LuckyWheelBonus(bonusType=..., count=..., remainingTime=..., freeBetSum=...)`; fields `f30625a` type, `b` description, `c` gameTypeId, `d` enabled, `e` count, `f` remainingTime, `g` freeBetSum).

Mapping from backend to client outcome is a pure switch — `a\eeq.java:1055–1078`:

```java
public static final esr T(Integer num) {
    if (num != null && num.intValue() == 0) return esr.NOTHING;
    ...
    if (num != null && num.intValue() == 5) return esr.WILD_FREE_BET;
    if (num != null && num.intValue() == 666) return esr.SPECIAL_BONUS;
    jf4.k("Not supported bonus type"); return null;
}
```

Also `a\d5c.java:726–760`, `a\qk10.java:5–36`, `a\tdc.java:915–916` perform the same `uk10 → esr → csr` conversion. `csr` = `GameBonus` with `bsr` = `BonusIdentifierDetails(esr, amount, multiplier)` (`a\csr.java:7–20, 45–47`; `a\bsr.java:36`).

**Confirmed:** no RNG is involved in choosing `esr`; it is decoded from a backend field.

#### 2.3 Lucky Wheel — full execution reconstruction

##### Request

`a\hzk0.java:13–16` / `a\jzk0.java:9–45`:

```java
new zna0("org.xplatform.lucky_wheel.data.requests.SpinWheelRequest", ..., 2);
zna0Var.j("WF", false);   // freeSpin  (boolean)
zna0Var.j("BAC", false);  // walletId  (long)
...
public final String toString() {
    return "SpinWheelRequest(freeSpin=" + this.f17418a + ", walletId=" + this.b + ")";
}
```

This is the decisive evidence for the free-vs-paid distinction: **the client merely flags `freeSpin` and names a `walletId`; the backend decides the result.** **Confirmed.**

Wheel sectors are also backend-provided: `a\fav0.java:13–15` → `WheelSectionResponse` with field `BTID` (bonus type id), model `a\hav0.java:38` (`WheelSectionResponse(bonusType=...)`).

##### ViewModel and animation

- `a\bo10.java` (LuckyWheelGameViewModelOld) owns state. Field `H` is `x9v0` = `WheelInfo(freeSpinCounts, freeSpinTimer, winBonus, wheelSectors, balance, accountId)` (`a\x9v0.java:18–25, 44–51`).
- Button labels prove both modes (`a\bo10.java:242, 251`): `lucky_wheel_spin_for_money`, `lucky_wheel_free_spin_with_count_v2`, and `lucky_wheel_spin_all_v2` with `Integer.min(i, 100)` (spin-all capped at 100 free spins).
- On spin completion the VM writes a `mav0` WheelState whose `c`/`d` fields are the **target esr** (`a\bo10.java:232`): `new mav0(true, x9v0Var.d /* wheelSectors */, null, null, false)`.
- `a\dm10.java:110–148` consumes that state and **animates to the already-decided sector**:

```java
ArrayList<iav0> wheelItems = mav0Var.b;
fm10Var2.G0().t.setWheelItems(wheelItems);
esr esrVar = mav0Var.c;                 // predetermined outcome
if (esrVar != null) {
    ValueAnimator a = ((WheelView) luckyWheelView.q.f).a(2, esrVar);
    ...
    esr esrVar2 = mav0Var.d;            // second (result) spin: 7 rotations
    ValueAnimator a2 = wheelView.a(7, esrVar2);
```

- `org\xplatform\lucky_wheel\presentation\views\WheelView.java:50–81` — the view does **no** randomization; it computes a rotation angle that lands on the supplied `esr` sector:

```java
public final ValueAnimator a(int i2, esr esrVar) {
    int i3 = 0;
    for (iav0 iav0Var : this.b) {
        if (iav0Var.b == esrVar) {
            float angle = getItemSectorAngle();          // 360 / sectors
            return ValueAnimator.ofFloat(getRotation()%360,
                (360 - (i3*angle + rotation)) + i2*360 + rotation + 90);
        }
        i3++;
    }
    ...
}
```

Special handling: `esr.WILD_FREE_BET` / `esr.FREE_BET` sectors are matched via `esrVar.b()` (`WheelView.java:54–63`), consistent with `esr.b()` = `this == WILD_FREE_BET` (`a\esr.java:54–56`).

**Confirmed:** the wheel animation is a **presentation of a backend-decided result**, not a physical RNG. A user cannot influence the stop position by timing the tap.

##### Free-spin count / state

- Wheel info supplies `freeSpinCounts` (`x9v0.f40528a`) and `freeSpinTimer` (`x9v0.b`) — backend fields.
- Agent gifts fragment keeps navigation args `BONUSES_COUNT`, `FREE_SPINS_COUNT`, `GIFT_TYPE_ID`, `AFTER_AUTH` (`a\e11.java:24, 30–33`) — these are `SavedStateHandle` keys, not an independently maintained local wallet.
- Action `REQUEST_FREE_SPIN` exists in `a\cu60.java:140` (Compose state machine).
- Result icon for FREE_SPIN: `a\bo10.java:740` (`R.drawable.ic_result_free_spin`).

**Confirmed:** counters/balances arrive from backend `WheelInfo`/`GameBonus` and are displayed; **Unverified:** backend ledger implementation.

#### 2.4 Spin & Win, Scratch Card, Lucky Card, bonus games

##### Spin & Win
`a\qyk0.java:43–60` and `a\r90.java:45–67` both read the outcome from stored GameBonus state and then animate the selected button:

```java
esr esrVar2 = tyk0Var.e.a().f4905a.f3145a;   // GameBonus -> esr
if (esrVar2 == esr.DOUBLE_BONUS || esrVar2 == esr.FREE_BET ||
    esrVar2 == esr.RETURN_HALF || esrVar2 == esr.WILD_FREE_BET) { ... }
t0u t0uVar = tyk0Var.y; ...                    // animate chosen button
```

`org\xplatform\spin_and_win\presentation\views\SpinAndWinChoiceView.java:51–96` only lays out six colored buttons and assigns click listeners; `SpinAndWinWheelView.java:30–54` only inflates the wheel and an end-of-animation callback. **Strongly Supported:** backend-decided outcome, client animation.

##### Scratch Card
`org\xplatform\scratch_card\presentation\views\ScratchCardView.java:39–73` builds a 3×3 field from **model-supplied** `c7h0Var.f` list:

```java
ArrayList arrayListR = r3d.r(c7h0Var.f);
for (int idx : l1e0.o(0, 9)) {          // Kotlin random permutation of 0..9
    int iNextInt = ((bkx) it).nextInt();
    y6h0Var.b((z6h0) arrayListR.get(iNextInt));   // shuffle *placement* only
}
```

`bkx` is the Kotlin `kotlin.random.Random` iterator (`a\bkx.java:9, 12`) used throughout the app for view/position shuffling. **Confirmed:** the *set* of symbols is supplied by the model; **only their on-screen positions are shuffled locally**. **Strongly Supported:** model comes from backend game state (same `c7h0`/game framework as other bonus games); final prize attribution is backend-side.

##### Lucky Card
`org\xplatform\core\presentation\custom_views\cards\LuckyCardWidget.java:32, 41` holds `Random j = new Random()` and `k = 4` cards (from XML attr, default 4). The **card face** is set from a suit/rank integer before animation (`a\jj10.java:190–225`), then:

```java
luckyCardWidget2.i = random.nextInt(luckyCardWidget2.k - 1) + 1;  // a/jj10.java:227
int i4 = random.nextBoolean() ? -1 : 1;                            // a/jj10.java:229
```

These two `java.util.Random` calls pick **which card in the stack is revealed and the flip direction** — i.e. cosmetic choreography around a face that was already assigned by game state. **Confirmed:** client RNG exists here but does not generate the win/lose value; **Strongly Supported:** prize value is backend-driven.

##### Bonus games
`org\xplatform\bonus_games\impl\lottery\presentation\views\LotteryView.java`, `...memories\...\MemoryGameView.java`, `...treasure\...\NineTreasuresView.java` are rendering views; their state comes from the same game framework. **Strongly Supported:** backend state, local animation.

#### 2.5 RNG audit (what is actually random on the client)

| Location | RNG | Purpose | Outcome-relevant? |
|---|---|---|---|
| `a\bkx.java`, Kotlin `nextInt()` in ~50 view classes | `kotlin.random.Random.Default` | Choosing view ids, measure positions, shuffling symbol placement | **No** — cosmetic/layout |
| `org\xplatform\core\...\LuckyCardWidget.java:41`, `a\jj10.java:227,229` | `java.util.Random` | Reveal index & flip direction | **No** — cosmetic |
| `org\xplatform\domino\...\DominoHandView.java:162–164` | `java.util.Random` | Picks a tile from the remaining visual list | **No** for money; visual demo game |
| `a\itj0.java:14–69` | `java.util.Random` (reseeded via `new Random(random.nextLong())`) | Fisher–Yates-like no-immediate-repeat sequence generator | No — used by game containers for visual variety |
| `a\jj10.java`, `a\m6x0.java:1427`, `a\dmo.java:3541` | mixed | selection/animation | No |
| `SecureRandom` sites (`a\g1e0.java:13`, `a\jwn.java:15–43`, `a\joq0.java:82`, `a\eii0.java:92`) | `SecureRandom` / SP800 | TLS, key generation, cryptography | **No** — not game outcomes |
| `Math.random()` (`a\a03.java:74`, `a\ejx.java:57`, `a\g4x0.java`) | — | retry jitter/backoff | No |

**Conclusion (Confirmed for the audited sites):** there is **no client-side prize RNG and no probability table / weighting table for free spins in this APK**. Probability weights, if any, are server-side. **Unverified:** backend RNG fairness, seeds, or payout tables.

#### 2.6 Testing modes and environment isolation

The app ships an internal **Test Section** (`org\xplatform\feature\office\test_section\impl\navigation\TestSectionScreen$*.java`) with screens:

- `TestSectionScreen` → fragment `a\p1q0.java` — the hub; list of buttons driven by `ButtonClickEvents` (`a\p1q0.java:93–103`), with ~30 injected dependencies (`a\p1q0.java:53–84`).
- `ClientConfigScreen` → `a\stc.java` — displays/copies client config (`ClientConfigViewModel$CopyUiAction`, `a\stc.java:74–77`).
- `RemoteConfigTestScreen` → `a\lgf0.java` — Compose UI with `FILTERS_BS_DIALOG_REQUEST_KEY` (`KEYS_FILTER_TYPE`, `KEYS_SORT_TYPE`) and `CHANGE_VALUE_BS_DIALOG_REQUEST_KEY` allowing **filtering and changing remote-config values** (`a\lgf0.java:26–82, 83–138`).
- `DemoConfigScreenFactoryImpl$getScannerDemoConfigScreen$1.java` — a demo-config **scanner** entry point.

The test config model `a\l1q0.java:87–105` (`TestSectionCommonItemsModel`) exposes:

```
testServerStage, testServerGame, luxuryServer, testBanners, testAggregator,
checkGeo, marketNumberVisibility, allowDebugIframe, fakeLetters, appGuid,
isTestBuild, country, appVersion, highlightDesignSystem, sipCRMTest, sipCRMV2Test,
showPushInfo, testSpecialEvent, newAppStartPartner, dynamicThemeSwitchingEnable,
testDomainEnabled, isTestToolsEnabled, manualTestDomain, isTestRemoteConfigEnabled,
isFakeAppGuidEnabled, logFailedEventParams, internetEmulationEnabled,
multiplyStringsEnable
```

Additional test/demo switches:

- `a\ot10.java:236–239`: if `singlUrl` is empty and the build is test/debug with no test-domain override, the endpoint becomes **`https://hfoweytnvkf.com`** — a dedicated test host.
- `a\tff0.java:32–34`: `ConfigCacheKey(serverEndpointType=..., demoMode=false, testSectionOverrideConfigEnable=...)` — the test section can override config resolution.
- `a\yyk.java:8, 26, 74–75`: `isTest` / `getDebug()` / `getTestDomainEnabled()` on the environment config.
- `a\m71.java:39` (AggregatorGameFragment args): `demoAvailable`, `isDemo`, `bonusGame`, `balanceId`, `gameUrl`, `lobbyUrl` — games can be launched in **demo mode** or as a **bonus game**, distinct from a paid launch.
- `a\rir.java:11`, `a\s9r.java:55`: `GPWebAppDemoStatus` = `disabledDemoMode`, `authWithoutDemoBalance`, `notAuthWithoutDemoBalance`, `toggleDemoGameAvailable`.
- `a\zv0.java:25, 30`: response fields `isDemoAvailable`, `isTest`.
- `a\cwr0.java:513`: analytics/request param `isTest`.

**Answer to "do test spins touch production?":**
- **Default/production build (Confirmed):** free spins are ordinary backend requests flagged `freeSpin=true` (`a\jzk0.java:39`) against the normal production endpoint. They are *non-monetary in outcome* but are **not isolated** — they are real account-bound promo operations.
- **Test-section mode (Strongly Supported):** the Test Section can redirect game/server endpoints (`testServerStage`, `testServerGame`, `manualTestDomain`, test host in `a\ot10.java`), override remote config, fake the app GUID and country, and emulate internet conditions. In such a configuration, spins would target test infrastructure instead of production. Whether a given device/test session actually has these flags enabled **cannot be determined statically** (Unverified).
- **Demo game launch (Confirmed flag):** `isDemo` is a game-launch argument; demo games use play money rather than real balance. This is a different axis from "free spin".

**Different algorithms per mode? No evidence of distinct algorithms in the APK (Confirmed for client side):** all modes decode the same `uk10 → esr → csr` model. Any per-mode probability differences would be backend-side (Unverified).

#### 2.7 Card JSON assets — their real role

| Asset | Parser / model | Loading site | Role |
|---|---|---|---|
| `cardsENG.json`, `cardsRU.json` | `pja` = `{cards:List, switchFilter:Boolean, timestamp:Long}` | `a\yuu.java:44–142` (two lazy providers, one per language) | **Static mock sports-event cards** (3 football matches: Real Madrid–Barcelona, Arsenal–Man City, Man Utd–Liverpool, with fixed odds) |
| `gameEventsCardOne.json`, `gameEventsCardTwo.json`, `gameEventsCardThree.json` | `d600` = `{id:Integer, constId:Integer, events:List}` | `a\qvi.java:19–93, 94–...` | **Static mock event markets** (over/under, 1X2, handicaps) for the same three `id`/`constId` pairs as `cardsENG/RU` |

`a\yuu.java:57` / `:75` and `a\qvi.java:38/56/74` call `getAssets().open(...)` and deserialize with Kotlinx serialization — **Confirmed**.

`a\qvi.java:19–27` is invoked from `a\msi.java:130–137` (DI case 6) and consumed by `a\ypn0.java:115/190/265`:

```java
return new q0h0((qvi) ((rvi) ypn0Var.b2.getValue()).w.get());
```

`a\ypn0.java` metadata identifies it as the **Swipex onboarding fragment** (`SwipexOnboardingFragmentBinding`, `R.layout.swipex_onboarding_fragment`, `CardStackLayoutManager`).

**Conclusion (Confirmed):** these JSON files are **hardcoded sample sports-betting cards shown in the Swipex onboarding/tutorial** — i.e. a non-monetary demonstration of how betting cards look. They are **not** free-spin outcome tables, not probability tables, and not connected to the lucky-wheel / spin-and-win engines. Their `cf` values are illustrative fixed odds embedded in the APK.

#### 2.8 Free-spin execution — Mermaid

```mermaid
sequenceDiagram
    participant U as User
    participant F as Fragment (a/fm10, a/fm10-like)
    participant VM as ViewModel (a/bo10 / a/tyk0 / a/u90)
    participant API as Backend
    participant V as WheelView / SpinAndWinChoiceView / ScratchCardView

    U->>F: tap "free spin" / "spin all"
    F->>VM: spin(freeSpin=true, walletId)
    VM->>API: SpinWheelRequest {"WF": true, "BAC": walletId}<br/>(a/hzk0.java, a/jzk0.java)
    API-->>VM: WheelInfo + LuckyWheelBonus / game state<br/>{"BNTID":"4"|"5"|"666", "CNT":n, "FBSE":x, "TLM":t}<br/>(a/ok10.java, a/rk10.java)
    VM->>VM: uk10 -> esr (pure switch)<br/>a/eeq.T(), a/d5c.a0(), a/qk10.a()
    VM->>VM: build GameBonus csr / WheelState mav0<br/>a/csr.java, a/x9v0.java
    VM->>F: emit WheelState(target esr, wheelSectors)
    F->>V: setWheelItems(sectors)
    F->>V: animate(target esr, rotations=2 or 7)
    Note over V: WheelView.a() computes rotation to LAND ON<br/>the pre-decided sector — no local RNG<br/>(lucky_wheel/WheelView.java:50-81)
    V-->>U: result icon/text; count/balance from backend
    VM->>API: analytics: games_promos_lucky_wheel /<br/>games_bonus_games_call (a/am10, a/kgb0, a/jm8)
```

#### 2.9 Paid vs free spins — differences (Confirmed where noted)

| Dimension | Free spin | Real-money spin |
|---|---|---|
| Trigger flag | `SpinWheelRequest.WF = true` (`a\jzk0.java:39`) | `WF = false` |
| Wallet | `BAC` walletId still sent | `BAC` walletId sent |
| Outcome generation | Backend (same enums) | Backend (same enums) |
| Button label | `lucky_wheel_free_spin_with_count_v2` / `spin_all_v2` | `lucky_wheel_spin_for_money` (`a\bo10.java:242,251`) |
| Balance effect | Free-spin count decremented server-side; no stake | Real balance debited (`x9v0.e` balance field) |
| Animation engine | Same (`WheelView.a`) | Same |
| Test isolation | Production backend by default; optional test-section endpoint override | Same |

---


## 12. API Endpoint Inventory

The full machine-generated inventory of Retrofit-style annotations is in **Appendix B** (402 unique GET paths, 209 unique POST paths). The table below maps the highest-value endpoints recovered from the decompiled interfaces; all paths are relative to the runtime domain supplied by the domain checker (Section 3).

| Area | Method | Path | Purpose / notes |
|---|---|---|---|
| Config | GET | `configuration/v2/config/{bundle}/{whence}/{version}` | Fetch remote configuration bundle |
| Domain | GET | `ru/redirect/api/getactualdomain` | Domain checker (encrypted response) |
| Domain | GET | `ActualDomain/v1/actual-domains/match-domain` | Domain checker match (encrypted response) |
| Auth | POST | `Feeds/System/Auth.json?v=2` | Authentication / session |
| Account | GET | `Account/v1/Mb/GetUserBalance` | Balance |
| Betting | GET | `{BetType}Feed/Mb_GetEventsZip` | Odds/events feed (`a/hon.java:9`) |
| Betting | POST | `MobileLiveBetX/MobileMakeBet` | Submit bet (`a/m520.java:9`); variants `Multi`, `Bid`, `Builder`, `Alternative` |
| Betting | POST | `MobileLiveBetX/MobileUpdateCoupon` | Refactor stale odds (`a/vre.java:27`); variants `Multi`, `Builder` |
| Payments | POST | `RestCoreService/v1/Mb/moneyMove` | Money movement / withdrawals |
| Payments | GET | `https://<domain>/paysystems/{deposit|withdraw}` | Backend-rendered payment methods page in WebView |
| Wallet | POST | SeamWallet transfer endpoints | Internal balance transfers (`MoveMoneyRequest.transferAmount`, `double`) |
| Limits | GET | `LimitService/.../limits` | Deposit / betting limit data |
| Feeds | GET | `MainFeedLine/mobile/v3/game`, `MainFeedLive/mobile/v3/game` | Event lists |
| Recommendations | GET | `GetRecommendedGames` | Recommended games for Aggregator carousels |
| Free spins | POST | `Games/LuckyWheel/v2/Spins` | Lucky Wheel spin request `{WF, BAC}` |
| Push | — | `/sockets/channel` | WebSocket for odds/feed updates (`a/ts4.java:469-477`) |

Authentication: most calls carry `X-Auth: Bearer <token>`; payment WebView requests additionally inject `X-Deeplink: xbet://open`, `X-Referral: 1`, `X-Mobile-Project-Id: 1357` (`a/s980.java:490-498`). See Sections 3, 5, 7, 8 for request/response structures and handling.

## 13. Network Communication Diagrams (cross-cutting)

### 13.1 High-level communication topology

```mermaid
flowchart LR
    U[User] --> UI[org.xplatform feature modules<br/>Kotlin/Compose/Views]
    UI --> DC[Domain checker<br/>a/ujn.h + encrypted redirect API]
    DC --> API[Backend API hosts<br/>REST-like /Mobile*, /Account*, /Limit*]
    UI --> WS[WebSocket /sockets/channel<br/>odds + feed updates]
    UI --> RC[Remote config<br/>AES/CBC asset + fetched config]
    RC --> K[libkeys.so native config key]
    UI --> PW[Payment WebView / CustomTabs]
    PW --> PGW[Payment gateway pages]
    PGW --> CB[Deep-link / callback back to app]
    CB --> API
    UI --> SEC[libsecurity.so / libantifraud.so<br/>crypto + device integrity]
```

### 13.2 Bet placement (consolidated)

```mermaid
sequenceDiagram
    participant U as User
    participant UI as Bet UI (make_bet / sportgame)
    participant M as Bet models (a/ouj0, a/zt6)
    participant N as Network (a/w5z, a/m520)
    participant B as Backend
    U->>UI: tap outcome / market
    UI->>M: SimpleBetDataModel (event, type, coef)
    M->>M: build BetDataRequest (34 JSON keys)
    M->>M: compute Sign digest (a/kcx)
    UI->>N: submit
    N->>B: POST MobileLiveBetX/MobileMakeBet<br/>X-Auth: Bearer ..., body BetDataRequest
    alt odds changed
        B-->>N: reject 130/131/113
        N->>B: POST MobileLiveBetX/MobileUpdateCoupon
        B-->>N: UpdateCouponResponse (changeCf, minBet/maxBet, NotValid)
        N-->>UI: coefChangeDesc / isAutoSub prompt
    else accepted
        B-->>N: BaseResponse{Error,Success,ErrorCode,Value}
        N-->>UI: MakeBetSuccessModel / error via i2o codes
    end
```

### 13.3 Recommendation generation (consolidated)

```mermaid
flowchart TD
    A[App start / Aggregator screen] --> B[Layout key = countryId + ISO + auth state]
    B --> C{Remote layout available?}
    C -- yes --> D[Use fetched layout<br/>cached AtomicFile / SharedPreferences LAST_*]
    C -- no --> E[Bundled layoutConfigurationAggregator*.json]
    D --> F[Ordered nameType carousels]
    E --> F
    F --> G[GET GetRecommendedGames / categoryId, partId, limit]
    G --> H[Backend-ranked game list]
    H --> I[Local: dedupe by id + model conversion only]
    I --> J[UI carousels: recommended, popular, viewed, favorites]
    J --> K[Telemetry: promo_games_recomended_call + add_favor]
    K --> G
```

### 13.4 Deposit processing (high level — corroborate with Section 7)

```mermaid
sequenceDiagram
    participant U as User
    participant UI as Payment UI
    participant API as Backend
    participant WV as PaymentWebView / CustomTabs
    participant PGW as Payment gateway
    U->>UI: choose method + amount
    UI->>API: build payment request (moneyMove / provider API)
    API-->>UI: payment URL + transaction/callback identifiers
    UI->>WV: open URL (link_start_url / PARAM_URL)
    WV->>PGW: HTTPS page load + redirects
    U->>PGW: completes / abandons payment
    PGW-->>UI: deep-link / callback redirect
    UI->>API: verify / refresh transaction status
    API-->>UI: final balance + transaction record
```

### 13.5 Free-spin execution (consolidated)

```mermaid
sequenceDiagram
    participant U as User
    participant UI as LuckyWheel UI
    participant API as Backend promo service
    participant W as WheelView
    U->>UI: tap free spin
    UI->>API: POST Games/LuckyWheel/v2/Spins<br/>{WF: freeSpin, BAC: walletId}
    API-->>UI: LuckyWheelBonus {BNTID, CNT, FBSE} -> esr sector
    UI->>W: animate to predetermined sector (no client RNG for prize)
    W-->>UI: outcome (NOTHING / FREE_BET / FREE_SPIN / ...)
    UI->>API: apply reward / update counters + balance
```

---


### Mermaid diagrams

#### Deposit flow

```mermaid
sequenceDiagram
    participant U as User
    participant UI as Balance/Paysystems UI
    participant Nav as PaymentScreenFactory (a/u88, factory$1)
    participant VM as ViewModel (db90 / p990)
    participant BE as Backend (w5z.T / portal)
    participant WV as PaymentWebView
    participant GW as Gateway page

    U->>UI: Tap "Deposit"
    UI->>Nav: getPaymentScreen(deposit=true, balanceId)
    Nav->>WV: create r790/o890, args CURRENCY_ID / REDIRECT_URL / deposit
    VM->>BE: w5z.T(balanceId, deposit=true) → portal URL
    BE-->>VM: https://<domain>/paysystems/deposit?host&lng&type=2&whence=22&h_guid&m_project_id=1357&sub_id
    VM->>BE: e1u.c("xbet://open") → headers (s980.case11)
    BE-->>VM: {X-Referral:1, X-Auth:Bearer <redacted>, X-Deeplink:xbet://open, X-Mobile-Project-Id:1357}
    VM->>WV: loadUrl(url, headers) via PaymentWebView.d
    WV->>GW: GET portal page (JS enabled, pinned TLS via tiq)
    GW-->>U: renders payment methods + MIN amounts (backend data)
    U->>GW: selects method, enters amount, submits (all backend-side)
    GW->>WV: redirect to .../onpay/success (or fail/pending/cancel)
    WV->>VM: checkOnPay(url) → substring match (xj80.case28 / db90.x)
    VM->>BE: generic balance/data refresh + snackbar + analytics (dep_done / dep_error)
```

#### Withdrawal flow

```mermaid
sequenceDiagram
    participant U as User
    participant UI as Balance/Paysystems UI
    participant VM as ViewModel (db90 / p990)
    participant BE as Backend (w5z.T / portal)
    participant WV as PaymentWebView
    participant GW as Gateway page

    U->>UI: Tap "Withdraw"
    UI->>VM: getPaymentScreen(deposit=false, balanceId)
    VM->>BE: w5z.T(balanceId, deposit=false)
    BE-->>VM: https://<domain>/paysystems/withdraw?...&sub_id=<balanceId>
    VM->>WV: loadUrl with X-Auth / X-Deeplink / X-Mobile-Project-Id headers
    WV->>GW: load page; renders withdrawal methods + MIN amounts
    U->>GW: choose method, amount, confirm (backend-side validation incl. RG limits)
    alt Backend rejects (RG limit)
        GW-->>U: error message (403 + *DepositLimitInvalidRange etc., shown by yfg.java:416)
    else Accepted
        GW->>WV: /onpay/withdraw/success | fail | pending | cancel
        WV->>VM: checkOnPay → withdraw snackbar + refresh
    end
```

#### Browser redirect / callback flow

```mermaid
flowchart TD
    A[Gateway page in PaymentWebView] --> B{PaymentWebView.l Uri router}
    B -->|http/https| C[WebView loads; onPageStarted/onPageFinished in hb90]
    B -->|/onpay/*| D[checkOnPay: substring match<br/>xj80.case28 / db90.x]
    B -->|browserintent://url| E[strip prefix → ACTION_VIEW → external browser]
    B -->|intent://| F[Intent.parseUri → external app]
    B -->|sberpay://, sobflous://, https://kaspi.kz| G[ACTION_VIEW external app]
    B -->|tg://, t.me, viber://| H[open social app via xdr.F]
    B -->|mailto:, tel:| I[external intent]
    B -->|*.pdf| J[docs.google.com/gview?embedded=true&url=...]
    B -->|JS paymentWebHandler.openInBrowser| K[l3v0 → k3v0{url} → startIntentAction]
    D --> L{suffix}
    L -->|success| M[dep_done + snackbar success + refresh]
    L -->|fail| N[dep_error + snackbar fail + refresh]
    L -->|pending/cancel| O[pending/cancel snackbar + refresh]
    L -->|withdraw/*| P[withdraw-specific snackbar + refresh]
    E --> Q[xbet://open deep link on return<br/>IntentForwardingActivity → prj.D]
    K --> Q
    Q --> R[app foregrounded; no txn-id correlation client-side]
```

---


## 14. Database and Local Storage Analysis

### 3. Local storage

#### 3.1 Encrypted preferences (positive, with fallback)

`a\vwb0.java`:

- Line 14: `this.f38143a = str.concat("SECURE_SHARED_PREFERENCES");`
- Lines 23–47: plain `SharedPreferences`-style API (`c/getString`, `h/putString`, `e/putBoolean`, `f/putInt`, `g/putLong`, `i/remove`).
- `a\f8i.java:147`: `new vwb0(us00Var3, packageName2)` → preference file name is effectively `org.xbet.client1SECURE_SHARED_PREFERENCES`.
- `a\gvb0.java` case 1 delegates to `a\n2x.w(context, name)`.
- **`a\n2x.java:1235-1253`**: `w()` constructs a `y78` master key with `AES256_GCM` backed by Android Keystore (`KeyGenParameterSpec`, `xvw.v(y78Var)`, `uwn.a(...)` = `EncryptedSharedPreferences.create`). **On any exception it falls back to plain `getSharedPreferences(str, 0)`** (lines 1248–1251).

**Assessment (F-10, Low, Confirmed):** Sensitive config is *normally* encrypted with a Keystore AES256-GCM master key — a good control. The silent plaintext fallback on Keystore failure / unsupported API is the residual weakness. Observed keys in this store include `SAFE_DOMAIN`, `ATTEMPTS_VALUE` (`a\bl50.java:55,68`; `a\ot10.java:571,585,873`), and `FAKE_APP_GUID` (`a\a3n0.java:185,392`; `a\knf0.java:27-33`). No plaintext auth token was found in this store in static analysis.

#### 3.2 Other SharedPreferences observed

First-party / app-relevant names from `rg getSharedPreferences`:
- `widget_shared_prefs` (`a\a56.java:71`, `a\dz5.java:247`, `a\kk0.java:118`)
- `GamesPreferences` (`a\lsn.java:270`)
- `authsdk` (`a\pv00.java:1042`)
- `rate_limit_backoff_storage` (`a\sz2.java:263`)
- Third-party: `appsflyer-data`, `appsflyer-purchase-data`, `FirebasePerfSharedPrefs`, `com.google.firebase.*`, `com.google.android.gms.*`, `oksdkprefs`, `ok.payment`, `com.vkontakte.android_pref_name`, `_GRECAPTCHA`, `androidx.work.util.preferences`, `frc_*_settings`, `google.analytics.deferred.deeplink.prefs`.

`res\xml\appsflyer_backup_rules.xml` excludes AppsFlyer prefs/DB from backup; with `allowBackup="false"` this is belt-and-braces.

#### 3.3 Room database

`org\xplatform\onexdatabase\OnexDatabase.java` (lines 24–54):

- Abstract Room database `OnexDatabase extends zdg0`, with **45 entities** (`j = {j2e.g ... j2e.Y}`, line 25) and **13 DAOs** (`i()` through `v()`, lines 27–53).
- `OnexDatabase_Impl.java` is the generated implementation with 13 lazy DAO fields (lines 37–52).
- **No SQLCipher / Room encryption / passphrase wrapper was found** in the decompiled sources. Room defaults to an unencrypted SQLite file in `/data/data/org.xbet.client1/databases/`.

**Assessment (F-11, Low, Strongly Supported):** cached betting/game/config data is at rest in plaintext SQLite. On a rooted device or via forensic acquisition it is readable. Whether it contains PII or session material requires runtime database inspection — **Unverified**. The explicit DB filename was not recoverable from the decompiled Java (constructed through obfuscated DI); check smali or runtime `getDatabasePath()`.

#### 3.4 Files, logs, keystore

- No first-party plaintext token/card/PII logging was found: a filtered search of `Log.[devwe](...)` in `org\xplatform` for `token|password|auth|secret|key|card|pin|session` returned no matches. Kotlin `data class toString()` implementations do print tokens (e.g. `org\xplatform\security\api\presentation\models\TokenRestoreData.java:53`, `CheckEmailScreenParams.java:70,139,207`, `SocialStateModel.java:71,74`), but these are model debug strings, not confirmed logcat output. **Unverified** whether any logging framework writes them.
- `SYSTEM_ALERT_WINDOW`, `WRITE_EXTERNAL_STORAGE`, `ACCESS_ALL_DOWNLOADS` and `requestLegacyExternalStorage="true"` permit broad file visibility; the app-update service (`org\xplatform\app_update\impl\presentation\apk_service\AppUpdateDownloadApkService`, manifest line 332) writes an APK to storage — validate the destination and signature-check before install (**runtime required**).
- Android Keystore is used indirectly for the EncryptedSharedPreferences master key (`a\n2x.java:1238-1247`); AppsFlyer has its own `AFKeystoreWrapper`. No direct `KeyStore.getInstance` usage found in first-party classes.

---


## 15. Runtime Behaviour

### 7. Runtime / dynamic analysis feasibility

#### 7.1 What is available in this environment

Checks performed via shell:

- `Get-Command adb` → **not found**
- `Get-Command emulator` → **not found**
- Common SDK locations checked (`C:\Android`, `C:\Android\Sdk`, `C:\Program Files\Android`, `C:\Users\ramra\AppData\Local\Android\Sdk`, `D:\Android`, `D:\AndroidSdk`) → **none exist**
- `adb devices` → **not runnable**
- `python` → **not found**
- Available: PowerShell, `rg` (ripgrep), JADX output, apktool output, REA MCP tooling.

**Conclusion:** **No Android emulator, no physical device, no Android SDK, and no adb are available.** This assessment is therefore strictly static. No attempt was made to install/run the APK or contact any network service.

#### 7.2 What would be needed

1. Android SDK Platform Tools (`adb`, `fastboot`) + emulator system image (API 33–35, Google APIs or Play Store image) via Android Studio / `sdkmanager`, **or** a rooted physical test device with USB debugging enabled.
2. A dedicated test account and an isolated test network; no production deposits, withdrawals or bets.
3. Dynamic instrumentation: `frida-server` + `frida`/`objection` for Java and native hooking; optionally Magisk + Shamiko to root without tripping RootBeer.
4. TLS interception: Burp Suite / mitmproxy with a CA installed as a **user** CA (this app explicitly trusts user CAs) — though note that for a faithful production assessment the user CA should be removed from the build.
5. `aapt`/`apkanalyzer` for binary manifest inspection, `d8`/`baksmali` for smali-level confirmation of obfuscated branches, and a native disassembler (Ghidra/IDA/radare2/objdump) for `.so` analysis.
6. Root access on the guest to pull `/data/data/org.xbet.client1/shared_prefs/`, `/databases/`, `/files/`, and the extracted `lib/` directory.

#### 7.3 Findings requiring runtime confirmation

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


**Static-observation substitute.** In the absence of runtime execution, the following dynamic-facing behaviours were inferred from code and configs: odds/feed updates arrive over a WebSocket (`/sockets/channel`); layout/config is cached in SharedPreferences and `AtomicFile` then refreshed; payment status is refreshed asynchronously after deep-link callbacks; bets are confirmed only from backend `BaseResponse` values; free games animate to backend-supplied outcomes. These are code-level facts, not observed executions (Sections 3, 5, 8, 11).

## 16. Security Assessment

### 0. Executive summary

This is a large, actively maintained betting client with substantial anti-analysis and anti-fraud engineering. The manifest itself is comparatively well locked down (`allowBackup="false"`, almost all components non-exported or permission-guarded). The material risks found are concentrated in four areas:

1. **Network trust is deliberately weakened:** `res/xml/network_security_config.xml` sets `cleartextTrafficPermitted="true"` globally and trusts **user-installed CAs**, with explicit proxy-tool domains (`chls.pro`, `ipv4.fiddler`, `charlesproxy.com`). This defeats the protection normally expected from a financial app and makes TLS interception practical on any device with an installed proxy CA (including rooted test devices).
2. **Secrets are shipped inside native libraries.** `libkeys.so` and `libsecurity.so` export JNI methods returning OAuth private keys, tokens, redirect URLs, and named AES keys/IVs. JNI symbol names and numerous embedded string constants are directly visible in the binaries. Static extraction is straightforward; runtime extraction is even easier.
3. **The payment WebView is loaded from weakly validated inputs and exposes a JS bridge.** `PaymentWebView.d()` prepends `http://` to arbitrary strings and performs **no host allowlisting**; intent extras such as `link_start_url` / `PARAM_URL` flow into screen models that render in that WebView. A `@JavascriptInterface` bridge named `paymentWebHandler` exposes `openInBrowser(String)` which will request opening an arbitrary URL supplied by page JavaScript.
4. **Deep-link handling is permissive and replayable.** `xbet://openapp|open|telegramBot` and App Links flow into a generic intent-to-screen dispatcher with only an `INTENT_ALREADY_PROCESSED` dedupe flag; no nonce, signature, timestamp, or server-side callback validation was found in the inspected code.

**Overall posture:** High risk for user-facing payment phishing/MITM and for client-secret compromise; Medium risk from deep-link abuse. Several conclusions are explicitly marked where static analysis cannot prove exploitability.

#### Findings at a glance

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

### 1. Manifest analysis

Source: `D:\1xbetrea\apktool_out\AndroidManifest.xml` (line numbers below are exact).

#### 1.1 Application-level security attributes (line 137)

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

#### 1.2 Exported components (exact lines)

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

#### 1.3 Permission risk review

Lines 3–28, 114–128. Notable:

- `android.permission.READ_PRIVILEGED_PHONE_STATE` (line 117) — a **signature|privileged** permission not normally grantable to Play-store apps. Presence may indicate a split build flavor or copy/paste; verify it is not requested at runtime on production builds.
- `SYSTEM_ALERT_WINDOW` (lines 18, 27) — overlay capability; increases tapjacking risk.
- `REQUEST_INSTALL_PACKAGES` (line 115) — combined with `org.xplatform.app_update.impl.presentation.apk_service.AppUpdateDownloadApkService` (line 332) this enables sideloading an APK. If the update URL is attacker-influenced (see F-01 MITM), this is a plausible direct code-execution chain. **High potential impact — runtime confirmation required.**
- `WRITE_EXTERNAL_STORAGE`, `READ_EXTERNAL_STORAGE` (maxSdk 32), `ACCESS_ALL_DOWNLOADS` (lines 12–13, 19, 28), `requestLegacyExternalStorage=true`.
- `RECORD_AUDIO`, `MODIFY_AUDIO_SETTINGS`, `HIGH_SAMPLING_RATE_SENSORS` — consistent with `libantifraud_audio.so` device fingerprinting (§7).
- `READ_PHONE_STATE`, `ACCESS_FINE/COARSE_LOCATION`, `CAMERA`, `USE_FINGERPRINT`/`USE_BIOMETRIC`, `GET_TASKS`, `QUERY_*` package queries (lines 35–113) — broad device enumeration.
- Three custom signature-level permissions defined at lines 125, 132–134 — correctly scoped.

#### 1.4 Network security config — F-01 (High, Confirmed)

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

### 2. Deep links & payment callback attack surface

#### 2.1 Entry points

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

#### 2.2 How the intent is processed

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

#### 2.3 Replay and callback spoofing — F-06 (Medium, Strongly Supported)

- The only anti-replay mechanism found is the caller-settable boolean extra `INTENT_ALREADY_PROCESSED` (`a\jlx.java:29,36`). Any app can craft an explicit intent with this extra absent or set as desired; it is not a nonce, signature, or timestamp.
- No HMAC/signature validation of deep-link parameters, no server-issued one-time token, and no expiration check were found in the inspected deep-link classes.
- `xbet://` is a global custom scheme; any installed app can register a competing handler, enabling **scheme hijacking / phishing** on devices where the user chooses "open with" or where the 1xBet app is not installed. Android App Links (`https://1xbet.com/...` with `autoVerify`) are the stronger path but only cover `/line` and `/live`.
- **Payment callback / redirect URLs:** The payment WebView itself implements `l(Uri)` (see §4.3) where a page navigation to `/office/verification?type=sumsub` triggers a verification callback, and `sobflous://`, `sberpay://`, `https://kaspi.kz` trigger external intents. These are matched by **string prefix / path substring checks on attacker-influenced page navigation**, not by a signed server-side callback. A page loaded in the WebView (if an attacker can get their URL loaded, see F-03) can initiate these flows. **Exploitability Unverified** — requires confirming whether the WebView can actually be navigated to attacker content and whether downstream payment state is server-authorized.

#### 2.4 Mermaid — deep-link / payment callback attack surface

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


### 4. WebView security

#### 4.1 Payment WebView setup — `org\xplatform\feature\office\payment\impl\presentation\view\PaymentWebView.java`

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

#### 4.2 Unvalidated URL loading — F-03 (High, Strongly Supported)

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

#### 4.3 WebView URL/intent router — `PaymentWebView.l(Uri)` lines 210–299

- Lines 216: sets `this.h` when host differs from the originally loaded host (cross-host navigation flag).
- Lines 220–231: path `/office/verification` with query `type` → invokes verification callback (`sumsub` → `mbu0.SUM_SUB`).
- Lines 232–238: `sobflous://`, `sberpay://`, `https://kaspi.kz` → external `ACTION_VIEW` Intent.
- Lines 239–246: any URL ending `.pdf` → `https://docs.google.com/gview?embedded=true&url=` + **raw URI** (unencoded concatenation) → external viewer.
- Lines 247–252: `mailto:`, `tel:` → external intent.
- **Lines 253–259:** `browserintent://` prefix is stripped (`c.r(string, "browserintent://", "", true)`) and the remainder is passed to `Uri.parse()` and launched as an external `ACTION_VIEW` intent — **arbitrary scheme/URL launch driven by page navigation**.
- **Lines 260–267:** `intent://` URLs are parsed with `Intent.parseUri(string, 1)` (`URI_INTENT_SCHEME`) and the resulting Intent is invoked externally. This is the classic Android `intent://` scheme surface; exploitability depends on the downstream handler and Android version — **Unverified**.
- Lines 268–294: otherwise a predicate callback `this.o` is consulted; Telegram/Viber scheme handling; non-http schemes get an external `ACTION_VIEW`.

#### 4.4 JavaScript bridges — F-04 (Medium–High, Strongly Supported)

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

#### 4.5 Custom Tabs / external browser

Manifest `<queries>` includes `android.support.customtabs.action.CustomTabsService` (lines 47–48) and `http`/`https` VIEW (lines 43–45, 71–73). Yandex AuthSDK uses `ChromeTabDataActivity`/`ChromeTabLoginActivity` (manifest 360–379). Custom Tabs are used for OAuth, which is appropriate. No Custom Tabs use was identified for the payment flow itself (payment uses the in-app WebView above).

---

### 5. Native libraries

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

#### 5.1 `libkeys.so` — embedded secrets (F-02, High)

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

#### 5.2 `libsecurity.so` — AES key/IV material (F-02, High)

JNI symbols: `Java_org_xplatform_secret_impl_SecurityImpl_encrypt`, `...decrypt`, `...getNativeKey`, `...getNativeIV`; internal functions `fakeXor`, `encrypt`, `decrypt`, `base64_encode`, `base64_decode`, `checkEnvironment`, `valid_client_packages`, `isCasino`, `checkException`.

Java declarations: `org\xplatform\secret\impl\SecurityImpl.java:155-157` (`getNativeIV`, `getNativeKey`).

Embedded key/vector selector strings:
`default_key`, `casino_key`, `xcare_key`, `app_300_key`, `affiliate_key`, `esimus_key`, `sms_grabber_key`, and matching `default_vector`, `casino_vector`, `xcare_vector`, `app_300_vector`, `affiliate_vector`, `esimus_vector`, `sms_grabber_vector`. Also multiple base64-looking constants, e.g.:
`XVUCB1cDSlYAVVxVCgAODwRCSFEMUQoDCAcWA0UEWV8=`, `PBAuHlwAIEN7RGwqGwtBYksjKzQmU2FLQHQ5AjMwWgoHEXYRbUYyNkQGRBRYVF8nVm4aQXllUVYiWX9we0sWEg==`, `U1NRVl8FQAQFAQBQUFABXgtLT1NZAwEGXVYTBhMHCVw=`, `XVFVXVkNSwcABQpQXAcLAQdKTVZcdgQCDAJEBEBSXlNTUwMzATBTV0AAAVNZUFFTXAVOcgYCDFVacw0OATZNJw==`, `WF5SXFoETXcCBA1XXgQMDAUzTFFedwdwDgFBBkJTW1w=`, `CFIHBlsAH1JSAg9UWFZcDAIRTFNQVwQFCwtHUBZeXg8=`, `KCNTU1wDPwINdglUXnYAeQc0S1BccHNyegFGC0NVUS4=`.

These appear to be XOR/base64-obfuscated keys (consistent with `fakeXor`). Names such as `sms_grabber_key` are notable and warrant follow-up on what data is being encrypted.

**Remediation:** Treat all shipped key material as public. Move server-side validation server-side; use per-install keys derived from Android Keystore with remote attestation; never use a static AES key/IV for user data; rotate all exposed credentials.

#### 5.3 `libantifraud.so`, `libantifraud_audio.so`, `libtoolChecker.so`, `libsdk_bc_lib.so`

- `libantifraud.so`: JNI `Java_org_xplatform_fingerprint_impl_JniProfiler_pingWithParams` and `Java_org_xplatform_fingerprint_impl_MathTribunal_runFpuStress`; imports `sincos`, `libm`. Looks like **device/timing fingerprinting and emulator stress probing** (FPU behavior differs on emulators).
- `libantifraud_audio.so`: `Java_org_xplatform_fingerprint_impl_AudioTract_getHardwareAudioProfile`, uses AAudio stream builder APIs — **audio hardware fingerprinting**; explains `RECORD_AUDIO`/`HIGH_SAMPLING_RATE_SENSORS`.
- `libtoolChecker.so`: RootBeer — `Java_com_scottyab_rootbeer_RootBeerNative_checkForRoot`, `setLogDebugMessages`, `exists(const char*)`, strings `LOOKING FOR BINARY: %s PRESENT!!!` — **root/tool detection**.
- `libsdk_bc_lib.so` (3.3 MB, by far the largest): AppsFlyer `Java_com_appsflyer_internal_AFb1nSDK_afRDLog`; imports `dlopen`, `__system_property_*`, `syscall`, `faccessat`, `unlink` — **AppsFlyer anti-fraud / SDK integrity / environment inspection**.

Java-side corroboration: root detection in `a\tgk.java` (uses `RootBeerNative` at lines 824–831; logs at 739, 789), `a\jeg0.java:24`, `a\vdx.java:220`; emulator detection in `a\a4e.java:371,668` (`droid4x`, `Emulator`, `Android SDK built for x86`, `google_sdk`, `sdk`), `a\elo.java:48` (`emulator`, `emu64a`, `emu64x`, `generic`, `vsoc`).

**Limitations:** No disassembler/decompiler was used; only JNI symbol names, imported functions and printable strings were extracted. Actual algorithms, obfuscation, packing, and native-side control flow are **Unverified**. `libsdk_bc_lib.so` appears packed/obfuscated — string output was mostly import tables.

---

### 6. Client-side trust, session, validation, pinning, anti-fraud

#### 6.1 F-05 — Client-side trust assumptions (Medium, Probable)

- `SecurityImpl` / `KeysImpl` select secrets by `applicationId` and a Java `boolean isTest` parameter (`KeysImpl.java:1309,1317,1321,...`; `SecurityImpl.java:139-153`). The application ID is a **client-supplied string**, and the accompanying native `checkEnvironment` / `valid_client_packages` strings suggest the lib validates it. Any client-side allowlist of package names/environment can be patched or bypassed on a rooted device. Server-side authorization must not rely on these values.
- `FAKE_APP_GUID` / `FAKE_APP_GUID_ENABLED` (`a\knf0.java:27-33`, `a\a3n0.java:185,392`) allow the client identifier to be overridden from remote config and stored in preferences. If remote config delivery is intercepted (F-01), GUID-based device trust can be manipulated.
- No evidence was found that the deep-link/payment callbacks are signed or that the server validates a client-generated redirect target (F-06).
- **Improper authorization checks:** not directly assessable statically (server side out of scope). Every money-moving decision must be server-authoritative; this report does not claim otherwise. **Unverified.**

#### 6.2 F-09 — Certificate pinning (Medium, Confirmed)

- `okhttp3\OkHttpClient.java:148,230,242` — default `CertificatePinner.c` is used unless the builder sets one. Global search found **no application code configuring `CertificatePinner` / `certificatePinner(...)`**.
- `res\raw\lets_encrypt_*.der` and `harica_dv_tls_rsa.der` are referenced **only** as `<certificates src="@raw/...">` trust anchors in `network_security_config.xml` and in `org\xbet\client1\R.java:17959-17974`. They are **CA trust anchors, not certificate/public-key pins**.
- Combined with `src="user"` trust and global cleartext, the TLS posture is materially weaker than pinning.

**Remediation:** Implement SPKI/leaf pinning (OkHttp `CertificatePinner.add()` or network-security-config `<pin-set>` with backup pins) for API/payment hosts; remove user CA trust in production.

#### 6.3 F-12/F-14 — Root, emulator and tool detection (Info)

Documented in §5.3. These controls are **anti-analysis / device-integrity only**; no evidence they gate financial transactions. They are bypassable by standard tooling (Frida, Magisk hide, patched native libs). Note also that the audio/fingerprinting behavior may have privacy implications.

---


### 8. Recommendations (prioritized)

1. **P0 — Harden network config:** production `cleartextTrafficPermitted="false"`, remove `src="user"` and all proxy domains; add SPKI pinning for API and payment hosts with backup pins.
2. **P0 — Remove client-side secrets:** rotate all keys/tokens currently embedded in `libkeys.so`/`libsecurity.so`; move OAuth client secrets and redirect-URL trust server-side; use Keystore-derived per-install keys; remove the plaintext-preference fallback.
3. **P0 — Validate every WebView URL:** https-only + strict host allowlist at `PaymentWebView.d()`, in `a\blx.java` before constructing URL screens, and inside every `@JavascriptInterface` (`l3v0.openInBrowser`). Remove `setAllowFileAccess(true)` from payment WebViews. Remove or strictly gate `intent://` / `browserintent://` handling.
4. **P1 — Deep-link hardening:** server-issued single-use nonce + HMAC for any link that affects account/payment state; do not trust `INTENT_ALREADY_PROCESSED`; prefer verified App Links over the `xbet://` custom scheme; validate `https://1xbet.com` host/path/query strictly (avoid prefix `startsWith`).
5. **P1 — Verify self-update integrity:** signature-check downloaded APKs and fetch update metadata only over pinned TLS; re-evaluate `REQUEST_INSTALL_PACKAGES`, `READ_PRIVILEGED_PHONE_STATE`, `SYSTEM_ALERT_WINDOW`.
6. **P2 — Reduce surface:** remove exported `androidx.compose.ui.tooling.PreviewActivity` from release; confirm all AndroidX exported components are necessary; keep `allowBackup=false`.
7. **P2 — Storage:** encrypt Room DB if it contains PII/session data; audit what `sms_grabber_key`-encrypted data is stored and why.
8. **P3 — Anti-analysis:** recognize that root/emulator/tool detection is bypassable and must never be the sole authorization control.

---

### 9. Facts vs. hypotheses

**Established facts (from artifacts):** manifest attributes and exported list; resolved deep-link strings; network security config contents; presence and JNI names of all listed native methods and embedded string constants; WebView settings and JS bridge methods; intent-extra-to-screen mapping in `blx`; EncryptedSharedPreferences-with-plaintext-fallback implementation; Room schema size; absence of adb/emulator/SDK; absence of application-configured OkHttp CertificatePinner.

**Hypotheses / inferred:**
- That the proxy-tool domains and user-CA trust are leftover debug configuration (rather than intentional) — *Probable*.
- That `libsecurity.so` key constants are XOR/base64-obfuscated keys (names and `fakeXor` symbol suggest this, values not decoded) — *Probable*.
- That `OpenInBrowserAction` ultimately launches an external browser/Intent — *Strongly Supported*, downstream not fully traced.
- That `j120.f0` originally re-dispatched to another package (now a no-op due to JADX string-resolution loss) — *Unverified*.
- That the Room DB or preferences contain session tokens/PII — *Unverified* (requires runtime data inspection).
- That payment state can be changed from a spoofed WebView — *Unverified*; server-side authorization may fully mitigate impact.

**Not performed:** no APK execution, no emulator, no network requests, no deposits/withdrawals/bets, no dynamic instrumentation, no exploitation against any service.

### 16.x TLS/pinning reconciliation (coordinator verification)

The payments and security/architecture reports disagreed on certificate pinning. Direct verification resolved this: `okhttp3/OkHttpClient.java:148,230` initialises `CertificatePinner.c` (the default empty pinner), so **API traffic has no public-key pinning**. `a/tiq.java` is a `WebViewClient` used by many WebViews (including `org/xplatform/game_broadcasting/.../GameZoneWebView.java` and subclasses such as `a/hb90.java`); its `onReceivedSslError` compares the presented certificate issuer to bundled Let's Encrypt CAs and calls `sslErrorHandler.proceed()` when they match. That is issuer validation that overrides an SSL error — **not** certificate pinning, and it is WebView-only. This report therefore states: no OkHttp pinning; limited WebView issuer check that weakens SSL-error handling.

## 17. Confirmed Findings vs. Hypotheses

| # | Finding | Evidence | Confidence | Backend/runtime needed? |
|---|---------|----------|------------|--------------------------|
| F1 | Bet payload has 34 named JSON keys incl. `UserId`, `Summ`, `Events`, `Sign`; submitted to `MobileMakeBet` with `X-Auth` | `a/xt6.java:17-52`, `a/m520.java:9`, `a/zt6.java` | **Confirmed** | No |
| F2 | Stake bounds and coefficients are server-authoritative (`minBet/maxBet`, `Games/Feed/MinMax/ByAccount`) | betting report §4 | **Confirmed** | No |
| F3 | Odds changes trigger `MobileUpdateCoupon` refactor + 130/131/113 rejection codes | `a/vre.java:27`, `a/i2o.java:8-226` | **Confirmed** | No |
| F4 | Remote config is AES/CBC-encrypted with native key; can gate financial/betting flags | `a/ref.java:31`, `a/rxn.java:144-181`, `KeysImpl.java:1328` | **Confirmed** | Key values & live flags Unverified |
| F5 | Domain checker rotates base host from encrypted redirect responses | `a/ujn.java:22`, redirect API endpoints | **Confirmed (code)** | Live host Unverified |
| F6 | Recommendations are backend-ranked, geo-keyed, layout-driven; no local ML | `a/knf0.java:38,42`, `a/mii0.java:1393-1395`, layout JSONs | **Confirmed** | Ranking algorithm Unverified |
| F7 | Lucky Wheel prize is backend-predetermined; client only animates | `a/jzk0.java:39`, `a/ok10.java`, `a/rk10.java` | **Strongly Supported** | Backend prize RNG Unverified |
| F8 | Test Section exposes test-server/domain toggles and fallback domain | `a/ot10.java:238`, `p1q0/stc/lgf0`, `l1q0.java` | **Confirmed** | Actual environment isolation Unverified |
| F9 | Network security config trusts user CAs and permits cleartext globally | `res/xml/network_security_config.xml` | **Confirmed** | Exploitability Unverified |
| F10 | No OkHttp certificate pinning; bundled .der files are trust anchors | security report §6.2 | **Confirmed** | No |
| F11 | Native libs expose JNI-retrievable keys/secrets (Mail.ru key, Fatman token, AES key names) | security report §5, `KeysImpl.java` metadata | **Strongly Supported** | Native dynamic extraction not performed |
| F12 | Payment WebView accepts non-http strings by prepending `http://`, no host allowlist | `PaymentWebView.d():122-136`, `a/blx.java:91-96,214-270` | **Strongly Supported** | Runtime exploitability Unverified |
| F13 | Deep-link/callback replay relies on caller-settable `INTENT_ALREADY_PROCESSED` | security report §2 | **Strongly Supported** | Runtime replay not demonstrated |
| F14 | Changing minimum deposit/withdrawal amounts are **backend-generated**: each refresh builds a fresh `paysystems/{deposit|withdraw}` WebView URL with session/geo/account context (`h_guid`, `lng`, `sub_id`, `X-Auth`) and re-issues the request; zero `Random` matches and no cached min value in the client | payment report §D; `a/w5z.java` `T()`, `a/db90`/`a/p990` | **Confirmed (client mechanics)** | Specific backend drivers (A/B, geo, risk, provider rotation) are **Unverified** hypotheses |
| F15 | Payment amount discrepancies: no client-side amount is sent on the gateway path, so no client rounding/FX/fee logic exists there; internal transfers use a `double`; pending/cancel callbacks trigger a generic async refresh that can show momentarily stale balances | payment report §C | **Confirmed (code-level absence)** | Gateway/backend transaction records required for root cause |
| F16 | Reconciliation: there is **no OkHttp public-key pinning** (default empty `CertificatePinner`); `a/tiq.java` is a WebView `onReceivedSslError` handler that calls `proceed()` when the issuer matches bundled Let's Encrypt CAs — issuer validation, not pinning, and it overrides SSL errors | `okhttp3/OkHttpClient.java:148,230`; `a/tiq.java:20-90` | **Confirmed** | No |

---

## 18. Unresolved Questions and Backend Dependencies

The following cannot be answered from the APK alone; each states what is available, what is missing, and why it matters:

1. **Current live domain and API base URL.** Available: seeded host `https://mob-experience.space`, encrypted redirect endpoints, mutable static `ujn.h`. Missing: decrypted response from the live redirect service. Why it matters: determines which backend serves the app in a given region/session. Needed: runtime observation of `getactualdomain` response or native key + recorded payload.
2. **Decrypted remote-config values.** Available: ciphertext, IV, algorithm, native key accessor. Missing: native key value (stored in `libkeys.so`) and/or live fetched config. Why it matters: determines whether `hasFinancialSecurityDepositLimits`, `hasMAXBet`, `blockApp`, `paymentRefreshLimit` are active. Needed: native function invocation or Frida hook on `KeysImpl.getNativeConfigKey`.
3. **Backend ranking algorithm for recommendations.** Available: request parameters (`categoryId`, `partId`, `limit`, country, ISO) and feedback telemetry. Missing: server-side scoring model/weights. Why it matters: explains exactly why a given game is "recommended". Needed: backend access or differential testing with controlled accounts.
4. **Backend RNG for free spins.** Available: prize enum and wire fields (`BNTID`, `CNT`, `FBSE`). Missing: server-side probability tables/seeding and whether outcomes are user/segment weighted. Why it matters: fairness and test-mode behaviour. Needed: backend documentation or controlled repeated spins with recorded responses.
5. **Payment transaction records and callback verification.** Available: client-side URL/parameter construction and status handling. Missing: gateway-side records, server-side signature verification, actual amounts recorded. Why it matters: root-cause of reported discrepancies. Needed: test-account transaction logs, gateway merchant dashboard, server logs.
6. **Live min/max limit sources.** Available: client endpoints and config flags. Missing: actual API responses per provider/currency/segment and their refresh cadence. Needed: repeated authenticated requests in a controlled test account (Section 10 provides the code-level answer).
7. **Runtime behaviour.** Available: static call graphs and decompiled code. Missing: actual WebSocket frames, background services, cache expiry, WebView rendering. Needed: emulator/rooted device + Frida + MITM proxy; this environment has no adb/emulator/SDK (Section 15).
8. **961 JADX-failed methods.** Available: smali fallback through REA for selected methods. Missing: reconstructed Java for those bodies. Why it matters: a small fraction of code paths (likely lambdas/obfuscated try-catch) remain less readable.

---

## 19. Final Technical Conclusions

The APK is a mature, heavily obfuscated, server-driven betting client. Its money-related design is intentionally backend-authoritative: the client assembles and signs requests but the backend owns coefficients, stake bounds, bet acceptance, payment state and reward outcomes. This materially limits what a client-only compromise can change, but it does not eliminate client-side risk: the app trusts user-installed CAs for TLS, lacks certificate pinning, exposes key material through native JNI accessors, and routes payments through a WebView with weak URL validation and replayable deep-link handling.

The two user-reported anomalies map to distinct layers. Changing minimum deposit/withdrawal amounts are consistent with server/provider/config-driven values refreshed per request rather than hardcoded constants (Section 10 supplies the precise mechanisms and code paths). Payment amount discrepancies most plausibly arise at the amount-transformation / status-synchronisation boundary between client, gateway and backend (rounding/currency conversion/fees vs asynchronous status and stale sessions); Section 9 separates what the code proves from what requires transaction logs. No evidence of client-side fraud or manipulation was found, and none should be assumed without backend records.

Recommendations are not a local ML system: they are a remotely controllable, geo-keyed layout of carousels filled by backend-ranked lists. Free spins are backend-predetermined promo operations with a client-side animation, plus an opt-in Test Section for non-production experimentation.

The highest-value next steps are runtime: (a) hook `KeysImpl.getNativeConfigKey` to decrypt remote config and the redirect payload, (b) capture one authenticated betting and one payment session in a controlled test account to correlate client requests with backend responses, and (c) demonstrate or refute the WebView/deep-link issues on a device. All such steps require explicit authorization and must avoid real financial transactions.

### PART 3 — CONCLUSIONS, UNKNOWNS, AND WHAT IS MISSING

#### 3.1 What the APK proves

1. **Recommendations are configuration- and backend-driven.** The layout JSON (`nameType` + `categoryId` + `partId` + `limit` + `filterType` + `isInfinite` + `miniatureType`) is authoritative for *what kinds* of carousels appear and in what order; the backend fills them with ranked items. Bundled assets are fallbacks only.
2. **Geo is a key input** — country id and ISO code select the layout. Favorites/viewed carousels expose account-history personalization; telemetry reports interaction with recommendation types back to the server.
3. **No client-side ranking/ML and no client-side prize RNG** were found in the audited paths. The wheel/scratch/card animations visualize server responses. `SecureRandom` usage is cryptographic, not gaming.
4. **Free spins are real backend operations** flagged `WF=true`, not simulated local lotteries. The Test Section can redirect endpoints/config to test infrastructure, but that is a separate, opt-in developer mode.

#### 3.2 What remains genuinely unknown (and why)

| Question | Status | Why |
|---|---|---|
| Exact backend algorithm / weights / ML model for `recommended` | **Unverified** | Server-side only; APK contains no scoring code. |
| Whether the server actually consumes `promo_games_recomended_call` for re-ranking | **Unverified** | Telemetry emission is proven; server consumption is not. |
| Meaning of opaque ids `824/825/847/17/981` and `partId 1/37/149` | **Strongly Supported (mapping) / Unverified (server taxonomy)** | Co-location and analytics strings prove the mapping, not the backend schema. |
| Backend RNG fairness, probability tables, house edge for spins | **Unverified** | No tables in APK; `BNTID` is decoded as a string enum. |
| Whether other behavioral data (bets, session length, device) personalizes ranking | **Unverified** | Not observable statically; would require request capture/backend access. |
| Whether a specific device has test flags enabled | **Unverified** | Runtime SharedPreferences/remote-config state not present in APK. |
| Decrypted *values* of `assets/remote-config/remote-config.json` (68,121 bytes, `{"dataHex":"17148667d7cf..."}`) | **Unverified** | The cipher and full chain are established (AES/CBC/PKCS5Padding, IV from `ivHex`, key from native `KeysImpl.getNativeConfigKey`, Section 3), but the native key value was not extracted. Live flag values could affect ranking/payments and are explicitly **not** assumed. |

#### 3.3 High-value follow-ups (out of scope here)

- Extract the native key (`KeysImpl.getNativeConfigKey`) at runtime, decrypt `remote-config.json` using the reconstructed AES/CBC chain, and diff the resulting flags against `localConfig.json`.
- Capture (in an authorized staging environment) one Aggregator layout fetch and one `SpinWheelRequest`/response to confirm parameter names and ordering.
- DEX-level xref of `mii0.n()` and `uac0` transport to enumerate the exact endpoint identifiers for the layout/games APIs.
- Full scan for `.tflite`/ONNX assets to downgrade/upgrade the "no on-device ML" finding from Probable to Confirmed.

---

###

## 20. Behavioural Data Collection, Personalisation & Downstream Forwarding

### 20.0 Scope and method

This section is a static, read-only analysis of `D:\1xbetrea\1xbet.apk` (package `org.xbet.client1`, `1xbet-prod-v260.1.0`, SHA-256 `d0ae8e422e47b480c20fa170c5ff85e67ee6074a1ac106ce0f75890cb8a3133d`). Sources: 69,001 JADX-decompiled Java files in `decompiled/sources`, apktool-decoded assets in `apktool_out`, REA JADX analysis, and a read-only cross-check of `https://indian.1xbet.com/en` (report `06_website_crosscheck.md`). No APK execution, account login on our behalf, transaction, or real-money action was performed.

Confidence labels: **Confirmed** = directly visible in shipped code/config/network capture; **Strongly Supported** = several consistent code paths but no runtime proof; **Probable** = reasonable inference with material gaps; **Unverified** = needs backend, native key, or device capture.

### 20.1 Executive summary

The app collects four kinds of behavioural input: (1) explicit interaction events (favourites, recommendation taps, deposit-page actions, registration/profile choices); (2) environmental context attached to almost every request (language, country, currency, app/session GUID, `whence`/`ref`/`gr` partner parameters, auth state, first-deposit flag, app version); (3) identifiers (account ID, AppsFlyer ID, Firebase installation ID, FCM token, `fatman_uuid`, session token); and (4) device-integrity signals from native anti-fraud libraries.

That data is used locally only in a limited way — mostly to build request parameters and choose which cached/remote layout to show. The actual decisions (what is "recommended", what limits apply, which promotions appear, which backend host serves the app) are made by the backend. The website cross-check confirmed the same mechanism there: a config service, an A/B endpoint (`fatman-api/<id>/ab.json`), analytics POSTs, and A/B flags named `fatmanAbToRechargeA/B/C` on the recharge flow.

Data is forwarded to 1xBet backends and, through bundled SDKs, to third parties (AppsFlyer, Firebase Analytics/Crashlytics, Google/HMS ad-ID and push services, social login SDKs, reCAPTCHA, support chat). Several response/request bodies use an encrypted envelope (`Accept: application/vnd.xenvelop+json`, type `dx5`), so the exact field list inside those payloads cannot be enumerated statically.

### 20.2 What is collected — evidence table

| Category | Concrete evidence (file : line / source) | Data items | Confidence |
|---|---|---|---|
| Favourites / interests | `a/k21.java:96,101,111`; `a/ih5.java:58`; `a/mii0.java:588`; `a/ix0.java:123` | `add_favor` / `remove`, event ID **3295**, `game_id`, `type`; `cyber_champ_favor_add` with `sport_id`, `sub_sport_id`, `championship_id`, `screen`, `point` (live/line), `action`; `bet_add_favor` | **Confirmed** |
| Recommendation feedback | `a/k21.java:111` | `promo_games_recomended_call` with `type` and `game_id` — explicit feedback on suggested games | **Confirmed** |
| Payment-funnel behaviour | `a/db90.java:182,301`; `a/l890.java:77` | `dep_refresh_method` (refresh count/behaviour), `dep_done` (with parameter map), `dep_error` | **Confirmed** |
| Registration / profile choices | `a/eye0.java:71-119`; `a/j1l0.java:273`; `a/dc0.java:209`; `a/hi70.java:167` | Picker analytics for country, city, currency, document type, region, phone; each tagged with `AnalyticsEntryPoint` | **Confirmed** |
| Request context on ordinary APIs | `a/a0g.java:11`, `a/b9s0.java`, `a/c4j.java:12`, `a/cq0.java:11,19`, `a/et5.java:21-36`, `a/gkb.java:2134`, `a/g45.java:2128` | `ref`, `partner`, `whence`, `fcountry`/`country`, `gr`, `lng`, `curIso`, `isAuthorized`, `hasFirstDeposit`, `applicationVersion`, `limit`, `skip`, header `x-whence: 22` | **Confirmed** |
| Device/session identifiers | `a/a1q.java:27`, `a/kb8.java:17`, `a/ao4.java:49`, `a/a3n0.java:185,392`, `assets/init.json` | AppsFlyer ID; app GUID/session (`AuthSessionHistoryUiItemModel.appGuid`, `h_guid`); debug overrides `FAKE_APP_GUID_ENABLED`/`FAKE_APP_GUID`; `fatman_uuid` | **Confirmed** |
| Auth/session tokens | `a/btt0.java:15-26`; `a/s980.java:490-498` | `new_user_token`, `X-Auth: Bearer <token>`; payment WebView headers `X-Deeplink`, `X-Referral`, `X-Mobile-Project-Id: 1357` | **Confirmed** |
| Third-party SDK telemetry | `com/appsflyer/AppsFlyerLib.java:62-64`; `a/rv3.java:159`; `com/google/android/gms/measurement/**`; Firebase Crashlytics classes; `a/m8d.java:28` | AppsFlyer `logEvent(name, map)`; Firebase Analytics/Crashlytics events and crashes; `HasCustomerIo` flag (false in this build) | **Confirmed** (SDK presence); payload contents **Unverified** |
| Device integrity / anti-fraud | `libantifraud.so`, `libantifraud_audio.so`, `libtoolChecker.so`, `libsdk_bc_lib.so`; manifest permissions | root/emulator/tool detection, audio-based fraud checks, Play Integrity signals | **Strongly Supported** (native internals not executed) |
| Web platform A/B (cross-check) | `https://indian.1xbet.com/en` network capture + JS bundle | `POST /fatman-api/<id>/ab.json`, `fatmanAbToRechargeA/B/C`, `fatmanAbHideNavOnReg`, `GET /bff-api/config/group/get?groups=...&lang=...`, `POST /analytics-module-api/v1/analytics` | **Confirmed** (web, not APK) |

### 20.3 Data flow

```mermaid
flowchart TD
    subgraph Phone
      U[User actions: taps, favourites, refresh, registration] --> UI[Feature modules + obfuscated 'a' package]
      D[Device context: lang, country, GUID, app version, ad ID] --> UI
      APP[AppsFlyer / Firebase / HMS / social SDKs] --> UI
      NAT[libantifraud / libtoolChecker / Play Integrity] --> UI
      UI --> EV[Event dispatchers: kt2 / vd1 / rl70 → rv3.logEvent]
      UI --> REQ[Retrofit-style API calls<br/>X-Auth + whence/ref/gr/fcountry/lng]
    end
    EV -->|encrypted envelope dx5 / vnd.xenvelop+json| B1[1xBet analytics + config backends]
    EV -->|SDK defaults| T1[AppsFlyer, Firebase, HMS, ad networks]
    REQ --> B2[1xBet backends: balance, feed, limits, bets, payments]
    B2 --> RC[Remote config + A/B assignment<br/>fatman ab.json / config group get]
    RC -->|flags, layout, geo, cohort| UI
    B2 --> REC[Backend ranking + prize decisions]
    REC -->|recommended games, odds, limits, outcomes| UI
```

### 20.4 How the collected data changes the app's behaviour

1. **Remote config gates features.** `a/wti.s()` reads the encrypted asset, `a/mwn` parses `dataHex`/`ivHex`, `a/nrd.a()` → `a/ref.a():31` performs AES/CBC/PKCS5Padding with the key from native `KeysImpl.getNativeConfigKey(0/1)` (`KeysImpl.java:1328`). `a/rxn.java:144-181` merges fetched over saved over bundled values, re-encrypts and persists. Flags include `hasFinancialSecurityDepositLimits`, `hasMAXBet`, `blockApp`, `paymentRefreshLimit` — so server-side flags can change betting and financial UI/behaviour without an app update. **Confirmed (mechanism); live values Unverified.**

2. **Geo and account state select the layout.** Country ID (default 225) and ISO code are inputs to the layout key (`a/knf0.java:38,42`; `a/mii0.java:1393-1395`). Bundled `layoutConfigurationAggregatorAuth/UnAuth/Virtual.json` are fallbacks; remote layout wins and is cached in SharedPreferences/`AtomicFile` by `a/z41.java`. Dedicated country modules (`limits_africa`, `limits_ee`, `limits_kenya`, `limits_ne`) show that regional rules are first-class. `isAuthorized`, `hasFirstDeposit`, `curIso` and account ID are request parameters to several endpoints. **Confirmed.**

3. **A/B experimentation.** The APK carries `fatman_uuid`; the website calls `fatman-api/<id>/ab.json` and defines `fatmanAbToRechargeA/B/C`. This makes experiment-driven variation of the deposit/recharge surface **Strongly Supported** on the platform. Whether a specific experiment changes a displayed minimum is **Unverified** — it is the leading hypothesis for the changing-limit observation.

4. **Behavioural feedback loop for recommendations.** Favourites, viewed items and `promo_games_recomended_call` are sent to the backend; the "recommended" (824), "favorites" (825) and "viewed" (847) carousels are then populated by backend ranking. The app contains **no** local scoring/weighting/ML. **Confirmed** for emission and layout; backend consumption **Unverified**.

5. **Domain/host selection.** The mutable static host `ujn.h` is seeded to `https://mob-experience.space` (`a/ujn.java:22`) and overwritten from encrypted redirect responses (`ru/redirect/api/getactualdomain`, `ActualDomain/v1/actual-domains/match-domain`). Network/geo conditions therefore affect which backend the app talks to. **Confirmed (code); live value Unverified.**

6. **Test/demo overrides.** The Test Section (`a/p1q0.java`, `stc`, `lgf0`, `l1q0`, `ot10`, `m71`) can redirect endpoints, set `testServerGame`/`manualTestDomain`, and enable demo flags; `FAKE_APP_GUID_ENABLED` overrides the GUID. **Confirmed** — these are opt-in developer controls, not normal user behaviour.

### 20.5 What is forwarded onward

- **1xBet backends:** event dispatchers wrap payloads in the encrypted `dx5` envelope with `Accept: application/vnd.xenvelop+json` (examples: `a/a0g.java:9`, `a/aqr.java:10-26`, `a/b9s0.java:9-25`, `a/fuz.java` limit APIs). Ordinary requests carry the context fields in §20.2. **Confirmed** that data is sent; **Unverified** which exact fields are inside encrypted bodies.
- **AppsFlyer:** `AppsFlyerLib.logEvent(context, name, map)` via `a/rv3.java:159`; AppsFlyer ID collected (`a/kb8.java:17`, `a/a1q.java:27`). Install attribution and in-app events are forwarded by SDK default. **Confirmed.**
- **Firebase Analytics / Crashlytics:** event and crash logging, including automatic app-exception events; Firebase installation/analytics identifiers. **Confirmed presence; exact event set Unverified.**
- **Google/HMS advertising & push:** `AD_ID` and ad-attribution permissions, FCM/HMS registration tokens. **Confirmed presence.**
- **Social login SDKs:** VK, OK, Yandex, Telegram, Mail.ru, Discord — profile data is forwarded only when the user uses those login paths. **Confirmed presence; actual fields depend on user action.**
- **Other third parties:** reCAPTCHA (`com/google/recaptcha`), support-chat widgets (`widget.suphelper.top` iframe on the website; livetex/consdesk endpoints in the APK), customer.io flag. **Confirmed presence.**
- **Partner/referral attribution:** `ref`, `partner`, `whence`, `gr`, `m_project_id` parameters indicate affiliate/referral chain tracking sent to the backend. **Strongly Supported.**

### 20.6 Explicit unknowns

| Question | Status | Why / what would settle it |
|---|---|---|
| Full field inventory inside encrypted event envelopes | **Unverified** | Requires decrypted config key + runtime capture of `dx5` bodies. |
| Whether behavioural data feeds the risk/limit engine that changes minimums | **Probable, Unverified** | Needs backend logs or a controlled test account with captured requests. |
| Whether A/B assignment maps to specific limit/UI variants | **Strongly Supported mechanism, Unverified mapping** | Needs cohort headers + response diffs across repeated loads. |
| Whether the backend consumes `promo_games_recomended_call` for re-ranking | **Unverified** | Emission is proven; server consumption is not. |
| Third-party retention/sharing policies and consent gating | **Unverified** | SDK defaults and server-side contracts, not in the APK. |
| Whether ads/PII are shared beyond SDK defaults | **Unverified** | Would need network capture of third-party endpoints with an instrumented device. |

### 20.7 Verification plan (requires authorisation, not performed)

1. On a rooted/emulated device with MITM proxy and Frida, hook `KeysImpl.getNativeConfigKey` to decrypt remote config and redirect payloads.
2. Capture one authenticated session end-to-end; de-duplicate and list all analytics event names and their plaintext parameters.
3. Load the deposit page repeatedly with a test account, diff responses plus A/B/cohort headers, and correlate with `h_guid` and `lng` changes.
4. Use the `FAKE_APP_GUID_ENABLED`/`FAKE_APP_GUID` flags to test GUID-dependence of recommendations and limits.
5. Capture third-party SDK endpoints (AppsFlyer, Firebase) to document exactly what leaves the device; compare against consent toggles.

## 21. Passive Runtime Observations on Connected Android Device

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

## 22. MITM Traffic-Capture Attempt — Live Network Observations

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

## 23. Offline Native Key Extraction and Remote-Config Decryption

## Method and result

Using Python 3.12 with `pyelftools` and `capstone`, the ARM64 native libraries from the APK were analysed **offline**: ELF sections, dynamic symbols, `R_AARCH64_GLOB_DAT`/`RELATIVE` relocations, `.rodata` strings, and targeted disassembly. No device or emulator was used.

**Result:** the AES key that decrypts `assets/remote-config/remote-config.json` was recovered statically and the 34 KB configuration was decrypted successfully. This closes the largest "Unverified" gap from Sections 3, 17 and 18 (for the **bundled** configuration; live fetched values can still differ).

### 23.1 `libkeys.so` — config keys (Confirmed)

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

### 23.2 Decrypted bundled configuration — selected values (Confirmed for shipped defaults)

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

### 23.3 `libsecurity.so` — second crypto layer (Confirmed presence)

`libsecurity.so` exports `SecurityImpl_encrypt`, `SecurityImpl_decrypt`, `SecurityImpl_getNativeKey`, `SecurityImpl_getNativeIV`, with key/IV pairs for seven profiles: `default`, `xcare`, `affiliate`, `esimus`, `sms_grabber`, `casino`, `app_300`. Each is a Base64-like constant resolved through relocations, e.g.:

- `default_key` = `KVZSUFYEQXJ1cXlRWHMLeXZEOCMtBwVzfQFLBkAnUS4nXHMxDEBdUEoNdFVSV1NWLw1PBAcOCCVfd3wPdTFOUg==`
- `default_vector` = `KyZeVFh1SwN3dX4nKXZ9CHc3PVFRdnZyCAUwdEVRLCg=`
- `sms_grabber_key`, `casino_key`, `xcare_key`, etc. — all extracted (full list in the analysis scripts).

These constants are obfuscated (the library contains `xor`, `fakeXor`, `base64_encode`, `base64_decode` routines). They are used for the second envelope layer (`a/z8w0.java`, `Accept: application/vnd.xenvelop+json`), not for the remote-config file.

### 23.4 Other embedded secrets in `libkeys.so`

Relocation-resolved strings include: Mail.ru OAuth ID/key/callback and **private key**, Discord client ID/callback, Fatman tokens for several product brands, emulator/anti-fraud domain `android2-virt.bet-1x.com`, partner/client package IDs (`org.xbet.jvspin`, `com.xslots.client`, `org.melbet`, `org.xbet.casino.one`, …), and a `valid_client_packages` table. This corroborates the earlier native-secret finding with exact values available to any static analyst.

### 23.5 What still cannot be done offline

- Decrypting **live fetched** config or encrypted API envelopes requires the runtime-selected values (and possibly server keys), which are not in the APK.
- The domain-checker redirect payloads are encrypted with the same family of keys but were never captured with bodies (MITM CA blocked), so their plaintext remains unknown.
- The exact `Sign` digest constant used in bet requests still needs the `a/kcx.java` body (JADX truncated some lambdas), though the key material is now partly visible.

## Appendix A.1 — Recommendation / free-spin key file index

| File | Why it matters |
|---|---|
| `apktool_out/assets/layoutConfigurationAggregatorAuth.json` / `UnAuth.json` / `Virtual.json` | Recommendation carousel definitions |
| `apktool_out/assets/cardsENG.json`, `cardsRU.json`, `gameEventsCardOne/Two/Three.json` | Swipex onboarding mock cards |
| `apktool_out/assets/localConfig.json`, `remote-config/remote-config.json` | Feature flags / encrypted remote config |
| `decompiled/sources/a/z41.java` | Layout repository (remote + bundled fallback, caching) |
| `decompiled/sources/a/d51.java`, `hj0.java`, `jj0.java`, `ni0.java`, `pi0.java`, `f51.java`, `xi0.java` | Layout/block/carousel models |
| `decompiled/sources/a/mii0.java`, `zri.java`, `j120.java`, `knf0.java`, `mi0.java` | Layout consumption, dedupe, geo inputs, model conversion |
| `decompiled/sources/a/k21.java` | Recommendation→favorite analytics (`promo_games_recomended_call`) |
| `decompiled/sources/a/esr.java`, `uk10.java`, `ok10.java`, `rk10.java`, `csr.java`, `bsr.java`, `eeq.java`, `d5c.java`, `qk10.java` | Outcome enums and backend↔client mapping |
| `decompiled/sources/a/hzk0.java`, `jzk0.java`, `fav0.java`, `hav0.java`, `x9v0.java`, `mav0.java` | Spin request, wheel sectors, wheel info/state |
| `decompiled/sources/a/bo10.java`, `pn10.java`, `dm10.java`, `fm10.java`, `tyk0.java`, `u90.java`, `qyk0.java`, `r90.java` | Spin ViewModels and state→animation wiring |
| `decompiled/sources/org/xplatform/lucky_wheel/.../WheelView.java` | Predetermined-outcome animation |
| `decompiled/sources/org/xplatform/spin_and_win/...`, `scratch_card/...`, `core/.../LuckyCardWidget.java`, `a/jj10.java` | Other free games and cosmetic RNG |
| `decompiled/sources/a/p1q0.java`, `stc.java`, `lgf0.java`, `l1q0.java`, `ot10.java`, `tff0.java`, `m71.java`, `rir.java` | Test section, demo mode, endpoint overrides |
| `decompiled/sources/a/yuu.java`, `qvi.java`, `ypn0.java`, `msi.java` | Swipex onboarding mock-card loading |



## Appendix A — Supporting artefacts

| Artefact | Description |
|---|---|
| `reports/00_investigation_ledger.md` | Target identity, evidence IDs, tooling, checklist |
| `reports/01_architecture_network.md` | Full architecture / network / auth / remote-config report (Sections 3) |
| `reports/02_betting_system.md` | Full betting lifecycle report (Section 5) |
| `reports/03_payments_limits.md` | Full payments / browser / discrepancy / limits report (Sections 7-10) |
| `reports/04_recommendations_freespins.md` | Full recommendations / free-spins report (Sections 6, 11) |
| `reports/05_security_storage.md` | Full security / storage / runtime report (Sections 14-16) |
| eports/00_synthesis.md | Coordinator synthesis (Sections 1, 13, 17-19)
| `reports/07_behavioural_data.md` | Behavioural data / personalisation report (Section 20) |
| `reports/08_device_runtime.md` | Passive device observations and installed-APK comparison (Section 21) |
| `reports/09_mitm_runtime.md` | MITM attempt and live domain chain (Section 22) |
| `reports/10_native_keys.md` | Native key extraction and decrypted config (Section 23) |
| eports/07_behavioural_data.md | Behavioural data / personalisation report (Section 20) |
| `reports/_endpoints_raw.txt` | Raw endpoint extraction (Appendix B) |
| `decompiled/sources/` | 69,001 decompiled Java files |
| `apktool_out/` | Decoded manifest, resources, assets |
| `_tools/jadx.log`, `_tools/apktool.log` | Decompilation / decode logs |

## Appendix B — Full extracted endpoint list

```text
D:\1xbetrea\decompiled\sources\a\a0g.java:10:    @ofr("RestCoreService/v1/Mb/AllowedCurrencies")
D:\1xbetrea\decompiled\sources\a\a1f0.java:8:    @ofr("Account/v1/Mb/Register/GetRegistrationFields")
D:\1xbetrea\decompiled\sources\a\a8a0.java:10:    @ofr("/statisticGame/v2/PlayerMenu")
D:\1xbetrea\decompiled\sources\a\ada0.java:8:    @ofr("cyberstatistic/v2/transfers/player")
D:\1xbetrea\decompiled\sources\a\ag50.java:10:    @ofr("aggregatorfeed/v1/nearestgamebyglobalchamp")
D:\1xbetrea\decompiled\sources\a\agb.java:9:    @ofr("/statisticGame/v2/StageNet/champ")
D:\1xbetrea\decompiled\sources\a\ahm0.java:9:    @ofr("/statisticGame/v2/TopPlayers")
D:\1xbetrea\decompiled\sources\a\aqr.java:11:    @ofr("MainFeedLine/mobile/v3/game")
D:\1xbetrea\decompiled\sources\a\aqr.java:15:    @ofr("RefGame/v2/GetMainLiveByLineId")
D:\1xbetrea\decompiled\sources\a\aqr.java:19:    @ofr("MainFeedLive/mobile/v3/game")
D:\1xbetrea\decompiled\sources\a\aqr.java:23:    @ofr("MainFeedLive/mb/cyber/v3/game")
D:\1xbetrea\decompiled\sources\a\aqr.java:27:    @ofr("MainFeedLine/mb/cyber/v3/game")
D:\1xbetrea\decompiled\sources\a\ar1.java:9:    @ofr("/ContentAggregator/GetSpecialBanners")
D:\1xbetrea\decompiled\sources\a\atl0.java:11:    @ofr("MainFeedLive/mobile/v3/sports")
D:\1xbetrea\decompiled\sources\a\awp.java:10:    @ofr("ufcStatistic/v1/fighter/images")
D:\1xbetrea\decompiled\sources\a\b9s0.java:10:    @ofr("TournamentClientsV2/GetTournamentsPersonalInfo")
D:\1xbetrea\decompiled\sources\a\b9s0.java:14:    @ofr("TournamentClientsV2/GetTournamentResults")
D:\1xbetrea\decompiled\sources\a\b9s0.java:18:    @ofr("TournamentClientsV2/GetParticipantTournamentResult")
D:\1xbetrea\decompiled\sources\a\b9s0.java:22:    @ofr("TournamentClientsV2/GetTournamentGames")
D:\1xbetrea\decompiled\sources\a\b9s0.java:26:    @ofr("TournamentClientsV2/GetFullTournamentInfo")
D:\1xbetrea\decompiled\sources\a\bdf0.java:11:    @ofr("MainFeedLive/mobile/v3/advice")
D:\1xbetrea\decompiled\sources\a\bhm0.java:9:    @ofr("statisticGame/v3/TopChamp/Top10EventPlayers")
D:\1xbetrea\decompiled\sources\a\bhm0.java:12:    @ofr("statisticGame/v3/TopChamp/TopEventPlayers")
D:\1xbetrea\decompiled\sources\a\bog.java:12:    @ofr("/MainFeedLine/mb/cyber/v3/gamesByChamp")
D:\1xbetrea\decompiled\sources\a\bog.java:16:    @ofr("/MainFeedLive/mb/cyber/v3/champs/{cyberPagePath}")
D:\1xbetrea\decompiled\sources\a\bog.java:20:    @ofr("/MainFeedLine/mb/cyber/v3/topGames/{cyberPagePath}")
D:\1xbetrea\decompiled\sources\a\bog.java:24:    @ofr("aggregatorfeed/v1/topcyberchamps/real")
D:\1xbetrea\decompiled\sources\a\bog.java:28:    @ofr("/cyberImages/v1/champs")
D:\1xbetrea\decompiled\sources\a\bog.java:32:    @ofr("/MainFeedLive/mb/cyber/v3/topChamps/{cyberPagePath}")
D:\1xbetrea\decompiled\sources\a\bog.java:36:    @ofr("/MainFeedLine/mb/cyber/v3/champs/{cyberPagePath}")
D:\1xbetrea\decompiled\sources\a\bog.java:40:    @ofr("/MainFeedLive/mb/cyber/v3/gamesByChamp")
D:\1xbetrea\decompiled\sources\a\bog.java:44:    @ofr("/MainFeedLine/mb/cyber/v3/gamesBySport/{cyberPagePath}")
D:\1xbetrea\decompiled\sources\a\bog.java:48:    @ofr("/MainFeedLive/mb/cyber/v3/gamesBySport/{cyberPagePath}")
D:\1xbetrea\decompiled\sources\a\bog.java:52:    @ofr("/MainFeedLine/mb/cyber/v3/topChamps/{cyberPagePath}")
D:\1xbetrea\decompiled\sources\a\bog.java:56:    @ofr("/MainFeedLive/mb/cyber/v3/topGames/{cyberPagePath}")
D:\1xbetrea\decompiled\sources\a\boe0.java:10:    @ofr("RestCoreService/v1/Mb/getReferralNetworkInfo")
D:\1xbetrea\decompiled\sources\a\bor0.java:9:    @ofr("/toto/JackpotMobile/v1/betHistory")
D:\1xbetrea\decompiled\sources\a\bor0.java:12:    @ofr("/toto2/Mobile/v1/betHistory")
D:\1xbetrea\decompiled\sources\a\bpp0.java:9:    @ofr("/statisticGame/v2/TeamCharacteristics")
D:\1xbetrea\decompiled\sources\a\bx0.java:24:    @ofr("MobileB2/ActiveBonusAmount")
D:\1xbetrea\decompiled\sources\a\bx0.java:28:    @ofr("/Aggregator_v3/v2/Games/Get")
D:\1xbetrea\decompiled\sources\a\bx0.java:32:    @ofr("/ContentAggregator/v2/Games/List")
D:\1xbetrea\decompiled\sources\a\bx0.java:35:    @ofr("MobileB2/CountBonusesAvailable")
D:\1xbetrea\decompiled\sources\a\bx0.java:44:    @ofr("/ContentAggregator/v2/GetGamesByCharsMobile")
D:\1xbetrea\decompiled\sources\a\bx0.java:47:    @ofr("MobileF2/CntAvailableOffers")
D:\1xbetrea\decompiled\sources\a\bxf0.java:9:    @ofr("Account/v1/GetPasswordRequirements")
D:\1xbetrea\decompiled\sources\a\bza0.java:10:    @ofr("/Aggregator_v3/v2/PromoEntities/Get")
D:\1xbetrea\decompiled\sources\a\c2d0.java:9:    @ofr("/ProphylaxisStatus/v2/mobile")
D:\1xbetrea\decompiled\sources\a\c2d0.java:13:    @ofr("/ProphylaxisStatus/v1/technicalProblems")
D:\1xbetrea\decompiled\sources\a\c2w0.java:8:    @ofr("https://login.yandex.ru/info")
D:\1xbetrea\decompiled\sources\a\c4j.java:11:    @ofr("MobileS/HistoryTasks")
D:\1xbetrea\decompiled\sources\a\c4j.java:15:    @ofr("MobileS/ActiveTasks")
D:\1xbetrea\decompiled\sources\a\c4j.java:23:    @ofr("MobileS/AvailableTasks")
D:\1xbetrea\decompiled\sources\a\c7t.java:11:    @ofr("MainFeedLive/mobile/v3/gamesByChamp")
D:\1xbetrea\decompiled\sources\a\c7t.java:15:    @ofr("MainFeedLive/mobile/v3/favorites/gamesByTeam")
D:\1xbetrea\decompiled\sources\a\c9p.java:12:    @ofr("ResultService/mobile/api/v1/favoritegames")
D:\1xbetrea\decompiled\sources\a\c9s0.java:10:    @ofr("/cyberstatistic/v1/tournaments/valorant/feed/{feedId}")
D:\1xbetrea\decompiled\sources\a\c9s0.java:14:    @ofr("/cyberstatistic/v1/tournaments/lol/feed/{feedId}")
D:\1xbetrea\decompiled\sources\a\c9s0.java:18:    @ofr("/cyberstatistic/v1/tournaments/cs2/feed/{feedId}")
D:\1xbetrea\decompiled\sources\a\cb40.java:11:    @ofr("cyberstatistic/v1/dota-meta")
D:\1xbetrea\decompiled\sources\a\cb40.java:15:    @ofr("MainFeedLive/mb/cyber/v3/gamesByHeroes/real")
D:\1xbetrea\decompiled\sources\a\cd5.java:10:    @ofr("translate/v1/mobile/GetRules")
D:\1xbetrea\decompiled\sources\a\cdf0.java:11:    @ofr("/MainFeedLive/mobile/v3/bestGames")
D:\1xbetrea\decompiled\sources\a\cdf0.java:15:    @ofr("MainFeedLive/mb/cyber/v3/advice")
D:\1xbetrea\decompiled\sources\a\chh0.java:11:    @ofr("MainFeedLive/mobile/v3/search")
D:\1xbetrea\decompiled\sources\a\chh0.java:15:    @ofr("MainFeedLine/mobile/v3/search")
D:\1xbetrea\decompiled\sources\a\cm9.java:10:    @ofr("/cyberstatistic/v2/calendar/tournaments")
D:\1xbetrea\decompiled\sources\a\cq0.java:10:    @ofr("/ContentAggregator/v2/Games/GetSortingOptions")
D:\1xbetrea\decompiled\sources\a\cq0.java:14:    @ofr("/ContentAggregator/v2/GetLobbyMobile")
D:\1xbetrea\decompiled\sources\a\cq0.java:18:    @ofr("/ContentAggregator/v2/Categories/GetPromotedCategories")
D:\1xbetrea\decompiled\sources\a\cq0.java:22:    @ofr("/ContentAggregator/v2/GetFilterGroupsForPartition")
D:\1xbetrea\decompiled\sources\a\csp.java:9:    @ofr("ufcStatistic/v1/fight")
D:\1xbetrea\decompiled\sources\a\cza0.java:10:    @ofr("/Aggregator_v3/v2/PromoEntities/Get")
D:\1xbetrea\decompiled\sources\a\d57.java:9:    @ofr("/RestCoreService/v1/mb/GetSaleTransactions")
D:\1xbetrea\decompiled\sources\a\d5p0.java:9:    @ofr("/statisticGame/v2/ChampionatTeamStatistic")
D:\1xbetrea\decompiled\sources\a\dh30.java:9:    @ofr("PromoServiceAuth/GoallessFootball/GetActionMatches")
D:\1xbetrea\decompiled\sources\a\di8.java:10:    @ofr("Account/v1/Bonus/GetRegisterBonuses")
D:\1xbetrea\decompiled\sources\a\dns0.java:10:    @ofr("RefGame/v2/GetMainLiveByLineId")
D:\1xbetrea\decompiled\sources\a\dop0.java:9:    @ofr("statisticGame/v2/TopChamp/Teams")
D:\1xbetrea\decompiled\sources\a\ds70.java:13:    @ofr("TelephonyFeedBack/IsCallExist")
D:\1xbetrea\decompiled\sources\a\duf0.java:10:    @ofr("translate/v1/mobile/GetRules")
D:\1xbetrea\decompiled\sources\a\dzo0.java:11:    @ofr("MainFeedLive/mobile/v3/sportSection/gamesByOpp")
D:\1xbetrea\decompiled\sources\a\dzo0.java:15:    @ofr("MainFeedLine/mobile/v3/sportSection/gamesByOpp")
D:\1xbetrea\decompiled\sources\a\e7v0.java:8:    @ofr("Games/Quests/WeeklyPrize/GetUserData")
D:\1xbetrea\decompiled\sources\a\e9m0.java:10:    @ofr("/statisticGame/v2/ShortGame")
D:\1xbetrea\decompiled\sources\a\e9m0.java:13:    @ofr("/statisticGame/v2/Game")
D:\1xbetrea\decompiled\sources\a\e9m0.java:16:    @ofr("/statisticGame/v2/Dictionaries/LastUpdates")
D:\1xbetrea\decompiled\sources\a\ear.java:9:    @ofr("/statisticGame/v2/FullDescription")
D:\1xbetrea\decompiled\sources\a\ebs.java:10:    @ofr("statisticGame/v2/Events")
D:\1xbetrea\decompiled\sources\a\epq0.java:9:    @ofr("/toto2/Mobile/v1/tiragCategoriesResult")
D:\1xbetrea\decompiled\sources\a\et5.java:11:    @ofr("/Games/Preview/v2/GetBanner")
D:\1xbetrea\decompiled\sources\a\et5.java:14:    @ofr("translate/v1/mobile/GetBannerTypes")
D:\1xbetrea\decompiled\sources\a\et5.java:17:    @ofr("translate/v1/mobile/GetBannerById")
D:\1xbetrea\decompiled\sources\a\et5.java:20:    @ofr("translate/v1/mobile/GetTestBanners")
D:\1xbetrea\decompiled\sources\a\et5.java:23:    @ofr("cmsmobile/v1/banners/categories")
D:\1xbetrea\decompiled\sources\a\et5.java:26:    @ofr("cmsmobile/v1/banners/{id}")
D:\1xbetrea\decompiled\sources\a\et5.java:29:    @ofr("cmsmobile/v1/banners")
D:\1xbetrea\decompiled\sources\a\et5.java:32:    @ofr("Games/Preview/GetBanner")
D:\1xbetrea\decompiled\sources\a\et5.java:35:    @ofr("translate/v1/mobile/GetBanners")
D:\1xbetrea\decompiled\sources\a\ets0.java:9:    @ofr("/TvbetPromoTournament/api/GetJackpotWins")
D:\1xbetrea\decompiled\sources\a\evh.java:10:    @ofr("statisticGame/v2/cycling")
D:\1xbetrea\decompiled\sources\a\exa0.java:14:    @ofr("MesCore/v1/PopUp/GetPopUps")
D:\1xbetrea\decompiled\sources\a\f2m0.java:9:    @ofr("/statisticGame/v2/StageTTable")
D:\1xbetrea\decompiled\sources\a\f2m0.java:12:    @ofr("/statisticGame/v2/TopChamp/StageTTable")
D:\1xbetrea\decompiled\sources\a\f8r0.java:11:    @ofr("MainFeedLine/mobile/v3/bestGames")
D:\1xbetrea\decompiled\sources\a\fed.java:10:    @ofr("/statisticGame/v2/ChampLastGames")
D:\1xbetrea\decompiled\sources\a\fep.java:9:    @ofr("/GamesFavorites/v2/Favorites")
D:\1xbetrea\decompiled\sources\a\fg.java:23:    @ofr("/RestCoreService/v1/mb/GetPhoneNumber")
D:\1xbetrea\decompiled\sources\a\fh9.java:9:    @ofr("cyberstatistic/v1/tournaments/cs2/global/{globalId}")
D:\1xbetrea\decompiled\sources\a\flj0.java:9:    @ofr("RestCoreService/v1/mb/AppLinks")
D:\1xbetrea\decompiled\sources\a\flr0.java:9:    @ofr("/toto2/Mobile/v1/tirags")
D:\1xbetrea\decompiled\sources\a\flv0.java:10:    @ofr("statisticGame/v2/WinterResults")
D:\1xbetrea\decompiled\sources\a\fuz.java:10:    @ofr("LimitService/api/mobile/v4/limits")
D:\1xbetrea\decompiled\sources\a\fyk.java:9:    @ofr("Account/v1/GetDocTypes")
D:\1xbetrea\decompiled\sources\a\g2m0.java:11:    @ofr("MainFeedLine/mobile/v3/stageTableWhoWins")
D:\1xbetrea\decompiled\sources\a\gc8.java:8:    @ofr("Account/v1/Bonus/GetUserBonusData")
D:\1xbetrea\decompiled\sources\a\gc8.java:11:    @ofr("Account/v2/Bonus/GetBonusAgreements")
D:\1xbetrea\decompiled\sources\a\gcp0.java:10:    @ofr("/statisticGame/v2/FutureMatches")
D:\1xbetrea\decompiled\sources\a\gga0.java:11:    @ofr("Main{BetType}/mobile/duel/v3/BuildDuel")
D:\1xbetrea\decompiled\sources\a\gir0.java:9:    @ofr("/toto2/Mobile/v1/types")
D:\1xbetrea\decompiled\sources\a\gir0.java:13:    @ofr("/toto2/Mobile/v1/taxStatus")
D:\1xbetrea\decompiled\sources\a\gir0.java:17:    @ofr("/toto2/Mobile/v1/activeTirag")
D:\1xbetrea\decompiled\sources\a\gmb.java:11:    @ofr("MainFeedLine/mobile/v3/ChampsBySport")
D:\1xbetrea\decompiled\sources\a\gmb.java:15:    @ofr("MainFeedLine/mobile/v3/topChampsAndCountries")
D:\1xbetrea\decompiled\sources\a\gmb.java:19:    @ofr("MainFeedLine/mobile/v3/TopChamps")
D:\1xbetrea\decompiled\sources\a\gmb.java:23:    @ofr("MainFeedLine/mobile/v3/champsBySportAndCountries")
D:\1xbetrea\decompiled\sources\a\gmg.java:11:    @ofr("aggregatorfeed/v1/cybersports")
D:\1xbetrea\decompiled\sources\a\gmh0.java:12:    @ofr("Account/v1/Mb/Question/Get")
D:\1xbetrea\decompiled\sources\a\gqs.java:10:    @ofr("MainFeedLive/mobile/v3/chronoLine")
D:\1xbetrea\decompiled\sources\a\gqs.java:14:    @ofr("statisticGame/v2/Events")
D:\1xbetrea\decompiled\sources\a\gs00.java:8:    @ofr("RestCoreService/v1/Mb/GetUtcLocalTimeDiff")
D:\1xbetrea\decompiled\sources\a\guz.java:11:    @ofr("LimitService/api/mobile/v4/limits")
D:\1xbetrea\decompiled\sources\a\guz.java:19:    @ofr("LimitService/external/v3/reasons/selfexclude")
D:\1xbetrea\decompiled\sources\a\gzb.java:10:    @ofr("RestCoreService/v1/Mb/GetCheckBlock")
D:\1xbetrea\decompiled\sources\a\gzb.java:14:    @ofr("BlockService/v2/m-block")
D:\1xbetrea\decompiled\sources\a\h7a0.java:9:    @ofr("statisticGame/v2/Medals")
D:\1xbetrea\decompiled\sources\a\hgm0.java:9:    @ofr("statisticGame/v2/TopChamp/Stadiums")
D:\1xbetrea\decompiled\sources\a\hiw.java:11:    @ofr("MainFeedLive/mobile/v3/sportSection/gamesBySport")
D:\1xbetrea\decompiled\sources\a\hiw.java:15:    @ofr("MainFeedLine/mobile/v3/sportSection/gamesBySport")
D:\1xbetrea\decompiled\sources\a\hkc.java:11:    @ofr("RestCoreService/v1/Mb/GetNationality")
D:\1xbetrea\decompiled\sources\a\hmb.java:11:    @ofr("MainFeedLive/mobile/v3/ChampsBySport")
D:\1xbetrea\decompiled\sources\a\hmb.java:15:    @ofr("MainFeedLive/mobile/v3/ChampsBySportAndCountries")
D:\1xbetrea\decompiled\sources\a\hmb.java:19:    @ofr("MainFeedLive/mobile/v3/topChampsAndCountries")
D:\1xbetrea\decompiled\sources\a\hmb.java:23:    @ofr("MainFeedLive/mobile/v3/TopChamps")
D:\1xbetrea\decompiled\sources\a\hok0.java:8:    @ofr("champs-api/v1/get-champs-by-params")
D:\1xbetrea\decompiled\sources\a\hon.java:9:    @ofr("{BetType}Feed/Mb_GetEventsZip")
D:\1xbetrea\decompiled\sources\a\hon.java:13:    @ofr("MainFeed{BetType}/mobile/v3/game")
D:\1xbetrea\decompiled\sources\a\hpw.java:9:    @ofr("/statisticGame/v2/horsesracemenu")
D:\1xbetrea\decompiled\sources\a\huz.java:10:    @ofr("LimitService/api/mobile/v4/limits")
D:\1xbetrea\decompiled\sources\a\hyk.java:9:    @ofr("Account/v1/GetDocTypes")
D:\1xbetrea\decompiled\sources\a\i6g0.java:10:    @ofr("/statisticGame/v2/ChessTable")
D:\1xbetrea\decompiled\sources\a\ic10.java:8:    @ofr("/BetHistoryLotto/transaction-history/{providerId}")
D:\1xbetrea\decompiled\sources\a\icx.java:10:    @ofr("statisticGame/v2/InjuryList")
D:\1xbetrea\decompiled\sources\a\id30.java:9:    @ofr("statisticGame/v2/PointByPoint")
D:\1xbetrea\decompiled\sources\a\il90.java:12:    @ofr("/RestCoreService/v1/mb/GetPhoneNumber")
D:\1xbetrea\decompiled\sources\a\iqq0.java:9:    @ofr("/toto2/Mobile/v1/tiragResults")
D:\1xbetrea\decompiled\sources\a\is60.java:10:    @ofr("/Games/Preview/v2/GetGamesPreview")
D:\1xbetrea\decompiled\sources\a\is60.java:18:    @ofr("/Games/Preview/v2/GetActionsWorkStatus")
D:\1xbetrea\decompiled\sources\a\is60.java:22:    @ofr("/Games/Preview/v2/GetCashBackGamesPreview")
D:\1xbetrea\decompiled\sources\a\is60.java:26:    @ofr("/Games/Preview/v2/GetGameWorkStatus")
D:\1xbetrea\decompiled\sources\a\is60.java:34:    @ofr("/Games/Preview/v2/GetGamesActions")
D:\1xbetrea\decompiled\sources\a\isn0.java:11:    @ofr("swipe/cards")
D:\1xbetrea\decompiled\sources\a\isn0.java:15:    @ofr("MainFeedLive/mobile/v3/gameEvents")
D:\1xbetrea\decompiled\sources\a\isn0.java:19:    @ofr("swipe/sportswithchamps")
D:\1xbetrea\decompiled\sources\a\isn0.java:23:    @ofr("MainFeedLine/mobile/v3/gameEvents")
D:\1xbetrea\decompiled\sources\a\itd0.java:9:    @ofr("/statisticGame/v2/Races")
D:\1xbetrea\decompiled\sources\a\iuz.java:10:    @ofr("LimitService/api/mobile/v4/limits")
D:\1xbetrea\decompiled\sources\a\ivl0.java:10:    @ofr("statisticGame/v2/stadium")
D:\1xbetrea\decompiled\sources\a\iwu0.java:13:    @ofr("SeamWalletService/ConverterFrom")
D:\1xbetrea\decompiled\sources\a\iwu0.java:25:    @ofr("SeamWalletService/ConverterTo")
D:\1xbetrea\decompiled\sources\a\js7.java:10:    @ofr("MainFeed{BetType}/mobile/v3/betsByPlayers/game")
D:\1xbetrea\decompiled\sources\a\jtl0.java:11:    @ofr("ResultService/mobile/api/v1/sports")
D:\1xbetrea\decompiled\sources\a\jtl0.java:15:    @ofr("MainFeedLive/mb/result/v3/sports")
D:\1xbetrea\decompiled\sources\a\juz.java:10:    @ofr("LimitService/api/mobile/v4/limits")
D:\1xbetrea\decompiled\sources\a\jvl0.java:9:    @ofr("/statisticGame/v2/stadium")
D:\1xbetrea\decompiled\sources\a\jw00.java:9:    @ofr("Account/v1/GetAccountRequirements")
D:\1xbetrea\decompiled\sources\a\jyp.java:10:    @ofr("ufcStatistic/v1/fighter/list")
D:\1xbetrea\decompiled\sources\a\k9l0.java:10:    @ofr("MainFeed{BetType}/mobile/v3/game")
D:\1xbetrea\decompiled\sources\a\kcv.java:9:    @ofr("/statisticGame/v2/GrandPrix")
D:\1xbetrea\decompiled\sources\a\kfa0.java:10:    @ofr("Main{BetType}/mobile/duel/v3/GetAvailablePlayersForDuel")
D:\1xbetrea\decompiled\sources\a\kjk0.java:9:    @ofr("Account/v1/Mb/GetSocials")
D:\1xbetrea\decompiled\sources\a\kpg.java:10:    @ofr("/cyberstatistic/v1/matches/cs")
D:\1xbetrea\decompiled\sources\a\kpg.java:14:    @ofr("/cyberstatistic/v1/matches/dota2")
D:\1xbetrea\decompiled\sources\a\kuz.java:11:    @ofr("LimitService/v2/external/mobile/limits")
D:\1xbetrea\decompiled\sources\a\kuz.java:23:    @ofr("Limit/time/v1/AvaliableLimits")
D:\1xbetrea\decompiled\sources\a\l6d.java:14:    @ofr("ConfigAppService/v1/ComApp")
D:\1xbetrea\decompiled\sources\a\l7e0.java:9:    @ofr("/statisticGame/v2/StageTTable/champ")
D:\1xbetrea\decompiled\sources\a\l9s0.java:9:    @ofr("TournamentClientsV2/GetTournamentsPersonalInfo")
D:\1xbetrea\decompiled\sources\a\l9s0.java:13:    @ofr("TournamentClientsV2/GetTournaments")
D:\1xbetrea\decompiled\sources\a\lct.java:11:    @ofr("ResultService/mobile/api/v2/games")
D:\1xbetrea\decompiled\sources\a\lct.java:15:    @ofr("MainFeedLive/mb/result/v3/gamesBySport")
D:\1xbetrea\decompiled\sources\a\lje0.java:9:    @ofr("/statisticGame/v2/RefereeStatisticByTeams")
D:\1xbetrea\decompiled\sources\a\lk9.java:9:    @ofr("cyberstatistic/v2/calendar")
D:\1xbetrea\decompiled\sources\a\lk9.java:12:    @ofr("cyberstatistic/v2/calendar/available-dates")
D:\1xbetrea\decompiled\sources\a\lta0.java:10:    @ofr("RestCoreService/v1/Polybet/GetRulesTextsByLastVersionArray")
D:\1xbetrea\decompiled\sources\a\lwr0.java:9:    @ofr("ufcStatistic/v1/tournament")
D:\1xbetrea\decompiled\sources\a\lxp.java:9:    @ofr("ufcStatistic/v1/fighter")
D:\1xbetrea\decompiled\sources\a\lyk.java:9:    @ofr("ru/redirect/api/getactualdomain?id=2")
D:\1xbetrea\decompiled\sources\a\lyk.java:12:    @ofr("ActualDomain/v1/actual-domains/match-domain")
D:\1xbetrea\decompiled\sources\a\m3w0.java:8:    @ofr("getZone/web_nz/config.json")
D:\1xbetrea\decompiled\sources\a\m6t.java:11:    @ofr("MainFeedLine/mobile/v3/gamesByGlobalChamp")
D:\1xbetrea\decompiled\sources\a\m8r0.java:11:    @ofr("/MainFeedLive/mobile/v3/bestGames")
D:\1xbetrea\decompiled\sources\a\mb6.java:11:    @ofr("/MainFeedLive/mb/cyber/v3/bestGames/real")
D:\1xbetrea\decompiled\sources\a\mb6.java:15:    @ofr("/MainFeedLine/mb/cyber/v3/bestGames/real")
D:\1xbetrea\decompiled\sources\a\mes0.java:10:    @ofr("/RestCoreService/v2/mb/GetTransactHistory")
D:\1xbetrea\decompiled\sources\a\mf6.java:15:    @ofr("/MainFeed{BetType}/mobile/betbuilder/v3/gameInfo")
D:\1xbetrea\decompiled\sources\a\mfb.java:9:    @ofr("/statisticGame/v2/ChampMenu")
D:\1xbetrea\decompiled\sources\a\mk10.java:11:    @ofr("Games/LuckyWheel/v2/Spins")
D:\1xbetrea\decompiled\sources\a\mwf.java:9:    @ofr("betTagParser/btag")
D:\1xbetrea\decompiled\sources\a\mwr0.java:9:    @ofr("/ttfifa/GetTournament")
D:\1xbetrea\decompiled\sources\a\mxt0.java:10:    @ofr("/cyberstatistic/v1/matches/valorant")
D:\1xbetrea\decompiled\sources\a\n090.java:9:    @ofr("Account/v1/GetPasswordRequirements")
D:\1xbetrea\decompiled\sources\a\n0b.java:17:    @ofr("Games/Cashback/v1/Cashback")
D:\1xbetrea\decompiled\sources\a\n0b.java:21:    @ofr("Games/Cashback/v1/Cashback/Settings")
D:\1xbetrea\decompiled\sources\a\n3t0.java:10:    @ofr("ufcStatistic/v1/tournament/calendar")
D:\1xbetrea\decompiled\sources\a\n8u0.java:9:    @ofr("/VerificationService/v1/Home/verificationtypes")
D:\1xbetrea\decompiled\sources\a\ncb0.java:9:    @ofr("cyberstatistic/v1/pre-match-stat/dota2")
D:\1xbetrea\decompiled\sources\a\nes0.java:10:    @ofr("/RestCoreService/v2/mb/GetTransactHistory")
D:\1xbetrea\decompiled\sources\a\nhk0.java:10:    @ofr("/translate/v1/mobile/GetRules")
D:\1xbetrea\decompiled\sources\a\ni00.java:11:    @ofr("MainFeedLive/mobile/v3/tabs/games")
D:\1xbetrea\decompiled\sources\a\nqr0.java:9:    @ofr("/toto/JackpotMobile/v1/tirags")
D:\1xbetrea\decompiled\sources\a\nqr0.java:13:    @ofr("/toto/JackpotMobile/v1/types")
D:\1xbetrea\decompiled\sources\a\nqr0.java:17:    @ofr("/toto/JackpotMobile/v1/activeTirag")
D:\1xbetrea\decompiled\sources\a\nqu0.java:11:    @ofr("MainFeedLive/mb/cyber/v3/topGames/{cyberPagePath}")
D:\1xbetrea\decompiled\sources\a\nqu0.java:15:    @ofr("MainFeedLine/mb/cyber/v3/topGames/{cyberPagePath}")
D:\1xbetrea\decompiled\sources\a\nqu0.java:19:    @ofr("aggregatorfeed/v1/cybersportsbycategory")
D:\1xbetrea\decompiled\sources\a\nth0.java:14:    @ofr("Account/v2/GetSecurityUser")
D:\1xbetrea\decompiled\sources\a\ntp.java:9:    @ofr("/statisticGame/v2/FighterStat")
D:\1xbetrea\decompiled\sources\a\nvh.java:11:    @ofr("/statisticGame/v2/CyclingPlayerStatistic")
D:\1xbetrea\decompiled\sources\a\nvo.java:9:    @ofr("statisticGame/v2/TeamsFacts")
D:\1xbetrea\decompiled\sources\a\nwv.java:8:    @ofr("RestCoreService/v1/mb/AppLinks")
D:\1xbetrea\decompiled\sources\a\nz60.java:9:    @ofr("/Games/Preview/GetXGamesActions")
D:\1xbetrea\decompiled\sources\a\nz60.java:16:    @ofr("/Games/Preview/GetActionsWorkStatus")
D:\1xbetrea\decompiled\sources\a\nz60.java:19:    @ofr("/Games/Preview/GetCashBackGamesPreview")
D:\1xbetrea\decompiled\sources\a\nz60.java:22:    @ofr("/Games/Preview/GetGamesPreview")
D:\1xbetrea\decompiled\sources\a\nz60.java:25:    @ofr("/Games/Preview/GetGameWorkStatus")
D:\1xbetrea\decompiled\sources\a\nzf.java:9:    @ofr("/api/v1/accounts/region")
D:\1xbetrea\decompiled\sources\a\o0g0.java:10:    @ofr("ResultService/mobile/api/v2/games")
D:\1xbetrea\decompiled\sources\a\o1p0.java:10:    @ofr("statisticGame/v2/TeamMenu")
D:\1xbetrea\decompiled\sources\a\o1p0.java:14:    @ofr("statisticGame/v2/Teams/TeamBetStatistic")
D:\1xbetrea\decompiled\sources\a\o4a0.java:9:    @ofr("/statisticGame/v2/PlayerLastGame")
D:\1xbetrea\decompiled\sources\a\o8p0.java:9:    @ofr("cyberstatistic/v2/team")
D:\1xbetrea\decompiled\sources\a\oes0.java:9:    @ofr("/RestCoreService/v1/mb/GetSaleTransactions")
D:\1xbetrea\decompiled\sources\a\ogb0.java:9:    @ofr("ConfigAppService/v1/App/MainMenu")
D:\1xbetrea\decompiled\sources\a\ogp0.java:10:    @ofr("/statisticGame/v2/FIFATeamRatingChart")
D:\1xbetrea\decompiled\sources\a\oha0.java:9:    @ofr("/statisticGame/v2/PlayerStatistics")
D:\1xbetrea\decompiled\sources\a\oie0.java:10:    @ofr("/statisticGame/v2/RefereeLatestMatchs")
D:\1xbetrea\decompiled\sources\a\okv0.java:10:    @ofr("statisticGame/v2/WinterGame")
D:\1xbetrea\decompiled\sources\a\omp0.java:11:    @ofr("/statisticGame/v2/Transitions")
D:\1xbetrea\decompiled\sources\a\orw.java:9:    @ofr("/statisticGame/v2/HorsesRaceRunners")
D:\1xbetrea\decompiled\sources\a\ose0.java:8:    @ofr("RestCoreService/v1/mb/GetGeoRegionFullInfo")
D:\1xbetrea\decompiled\sources\a\ovp.java:11:    @ofr("MainFeedLine/mobile/v3/sportSection/gamesByOpp")
D:\1xbetrea\decompiled\sources\a\ovp.java:15:    @ofr("MainFeedLive/mobile/v3/sportSection/gamesByOpp")
D:\1xbetrea\decompiled\sources\a\owp.java:10:    @ofr("ResultService/mobile/api/v2/gamesByOpp")
D:\1xbetrea\decompiled\sources\a\oz90.java:9:    @ofr("statisticGame/v2/PlayerCareer")
D:\1xbetrea\decompiled\sources\a\p7e0.java:10:    @ofr("/statisticGame/v2/Rating/Table")
D:\1xbetrea\decompiled\sources\a\p7e0.java:14:    @ofr("/statisticGame/v2/Rating/TableByTournament")
D:\1xbetrea\decompiled\sources\a\p84.java:8:    @ofr("UserAuth/GetLatestActivityFull")
D:\1xbetrea\decompiled\sources\a\p8v0.java:8:    @ofr("Account/v1/Bonus/GetUserBonusData")
D:\1xbetrea\decompiled\sources\a\pfj.java:11:    @ofr("MainFeedLive/mobile/v3/expressDay")
D:\1xbetrea\decompiled\sources\a\pfj.java:15:    @ofr("MainFeedLine/mobile/v3/expressDay")
D:\1xbetrea\decompiled\sources\a\pkc.java:8:    @ofr("RestCoreService/v1/mb/GetGeoCityFullInfo")
D:\1xbetrea\decompiled\sources\a\pkg.java:11:    @ofr("/statisticGame/v2/mapstats")
D:\1xbetrea\decompiled\sources\a\pkg.java:15:    @ofr("/statisticGame/v2/PlayerComparison")
D:\1xbetrea\decompiled\sources\a\pkg.java:19:    @ofr("/cyberstatistic/v1/players/cs")
D:\1xbetrea\decompiled\sources\a\pnv.java:10:    @ofr("statisticGame/v2/HeadToHead")
D:\1xbetrea\decompiled\sources\a\pwf.java:9:    @ofr("t/btag.json")
D:\1xbetrea\decompiled\sources\a\pwf.java:12:    @ofr("t/btag.json")
D:\1xbetrea\decompiled\sources\a\pwf.java:15:    @ofr("t/btag.json")
D:\1xbetrea\decompiled\sources\a\q1e0.java:10:    @ofr("statisticGame/v2/TopChamp/RatingList")
D:\1xbetrea\decompiled\sources\a\q6t.java:11:    @ofr("MainFeedLine/mobile/v3/gamesByChamp")
D:\1xbetrea\decompiled\sources\a\q6t.java:15:    @ofr("MainFeedLine/mobile/v3/favorites/gamesByTeam")
D:\1xbetrea\decompiled\sources\a\q8r0.java:11:    @ofr("MainFeedLive/mobile/v3/bestGames")
D:\1xbetrea\decompiled\sources\a\q8r0.java:15:    @ofr("MainFeedLine/mobile/v3/bestGames")
D:\1xbetrea\decompiled\sources\a\qha0.java:9:    @ofr("/statisticGame/v2/PlayerStatistics")
D:\1xbetrea\decompiled\sources\a\qlg0.java:9:    @ofr("translate/v1/mobile/GetRules")
D:\1xbetrea\decompiled\sources\a\qlt.java:9:    @ofr("RestCoreService/v1/mb/GetGeoCityFullInfo")
D:\1xbetrea\decompiled\sources\a\qlt.java:12:    @ofr("Account/v1/GetPhoneMasks")
D:\1xbetrea\decompiled\sources\a\qlt.java:15:    @ofr("RestCoreService/v1/mb/GetAllowedCountries")
D:\1xbetrea\decompiled\sources\a\qlt.java:18:    @ofr("RestCoreService/v1/mb/GetGeoRegionFullInfo")
D:\1xbetrea\decompiled\sources\a\qsu0.java:10:    @ofr("translate/v1/mobile/GetRules")
D:\1xbetrea\decompiled\sources\a\qu9.java:12:    @ofr("/Account/v1/Mb/GetUserCalls")
D:\1xbetrea\decompiled\sources\a\qu9.java:16:    @ofr("RestCoreService/v1/Mb/GetCallTheme")
D:\1xbetrea\decompiled\sources\a\qu9.java:25:    @ofr("/Account/v1/BackCallLanguages")
D:\1xbetrea\decompiled\sources\a\quf.java:8:    @ofr("RestCoreService/v1/Mb/GetCurrencyBaseRate")
D:\1xbetrea\decompiled\sources\a\qvl0.java:10:    @ofr("statisticGame/v2/Stadium")
D:\1xbetrea\decompiled\sources\a\qxu.java:10:    @ofr("/TaxService/v1/GetTax")
D:\1xbetrea\decompiled\sources\a\qxu.java:14:    @ofr("/TaxService/v1/TaxStatus")
D:\1xbetrea\decompiled\sources\a\qzx.java:8:    @ofr("/Games/Feed/Jackpot/GetJackpotInfo")
D:\1xbetrea\decompiled\sources\a\r37.java:18:    @ofr("BetStorage/GetHistoryBetMobile")
D:\1xbetrea\decompiled\sources\a\r3t.java:10:    @ofr("BonusFeed/GetUserBonusesGrouped")
D:\1xbetrea\decompiled\sources\a\r6t.java:11:    @ofr("MainFeedLive/mobile/v3/gamesByGlobalChamp")
D:\1xbetrea\decompiled\sources\a\rb90.java:9:    @ofr("Account/v1/Rules/GetRulesFileByPartner")
D:\1xbetrea\decompiled\sources\a\rgt0.java:10:    @ofr("/statisticGame/v2/ChampFutureGames")
D:\1xbetrea\decompiled\sources\a\ris0.java:9:    @ofr("cyberstatistic/v2/transfers")
D:\1xbetrea\decompiled\sources\a\roc0.java:8:    @ofr("RestCoreService/v1/mb/CheckPromoCode")
D:\1xbetrea\decompiled\sources\a\s840.java:12:    @ofr("MesCore/v1/Mobile/GetCountMessages")
D:\1xbetrea\decompiled\sources\a\s840.java:15:    @ofr("MesCore/v2/Mobile/GetMessages")
D:\1xbetrea\decompiled\sources\a\s840.java:18:    @ofr("MesCore/v1/Mobile/GetMessages")
D:\1xbetrea\decompiled\sources\a\s840.java:21:    @ofr("MesCore/v2/Mobile/GetCountMessages")
D:\1xbetrea\decompiled\sources\a\sa0.java:8:    @ofr("BetStorage/GetHistoryBetMobile")
D:\1xbetrea\decompiled\sources\a\scb.java:11:    @ofr("cyberImages/v2/champs")
D:\1xbetrea\decompiled\sources\a\sfh.java:10:    @ofr("/statisticGame/v2/Cyber/Game")
D:\1xbetrea\decompiled\sources\a\sfh.java:14:    @ofr("/statisticGame/v2/StageTTable")
D:\1xbetrea\decompiled\sources\a\sgm0.java:9:    @ofr("/statisticGame/v2/TextBroadcast")
D:\1xbetrea\decompiled\sources\a\sk90.java:10:    @ofr("statisticGame/v2/PersonalStats")
D:\1xbetrea\decompiled\sources\a\sl5.java:9:    @ofr("Account/v1/Mb/GetUserBalance")
D:\1xbetrea\decompiled\sources\a\slp0.java:9:    @ofr("/statisticGame/v2/TeamsMenu")
D:\1xbetrea\decompiled\sources\a\slp0.java:12:    @ofr("/statisticGame/v2/TeamMenu")
D:\1xbetrea\decompiled\sources\a\sm.java:9:    @ofr("cyberstatistic/v2/team/list")
D:\1xbetrea\decompiled\sources\a\smw.java:9:    @ofr("/statisticGame/v2/HorseMenu")
D:\1xbetrea\decompiled\sources\a\sn50.java:9:    @ofr("/statisticGame/v2/News")
D:\1xbetrea\decompiled\sources\a\spv.java:9:    @ofr("statisticGame/v2/HeadToHead")
D:\1xbetrea\decompiled\sources\a\sqj0.java:10:    @ofr("/statisticGame/v2/ShortGame")
D:\1xbetrea\decompiled\sources\a\sv6.java:8:    @ofr("getZone/web_nz/config.json")
D:\1xbetrea\decompiled\sources\a\syy.java:9:    @ofr("/statisticGame/v2/headtohead")
D:\1xbetrea\decompiled\sources\a\t31.java:10:    @ofr("JackpotsCasino/AvailableCampaigns")
D:\1xbetrea\decompiled\sources\a\t31.java:14:    @ofr("/JackpotsCasino/CurrentAmountJackpots")
D:\1xbetrea\decompiled\sources\a\t31.java:18:    @ofr("JackpotsCasino/AvailableCampaignsByPlayer")
D:\1xbetrea\decompiled\sources\a\t7o.java:11:    @ofr("MainFeedLive/mb/cyber/v1/gamesByGlobalChamp")
D:\1xbetrea\decompiled\sources\a\t7o.java:15:    @ofr("MainFeedLine/mb/cyber/v1/gamesByGlobalChamp")
D:\1xbetrea\decompiled\sources\a\t8p.java:11:    @ofr("MainFeedLine/mobile/v3/favorites/games")
D:\1xbetrea\decompiled\sources\a\t8p.java:19:    @ofr("MainFeedLive/mobile/v3/favorites/games")
D:\1xbetrea\decompiled\sources\a\tgs.java:11:    @ofr("/MainFeedLine/mobile/v3/insights")
D:\1xbetrea\decompiled\sources\a\thp.java:11:    @ofr("MainFeedLine/mobile/v3/gamesByChamp")
D:\1xbetrea\decompiled\sources\a\thp.java:15:    @ofr("MainFeedLive/mobile/v3/gamesByChamp")
D:\1xbetrea\decompiled\sources\a\tih.java:10:    @ofr("/cyberstatistic/v2/calendar/tournaments")
D:\1xbetrea\decompiled\sources\a\tor0.java:9:    @ofr("/toto/JackpotMobile/v1/betHistory")
D:\1xbetrea\decompiled\sources\a\tor0.java:12:    @ofr("/toto2/Mobile/v1/betHistory")
D:\1xbetrea\decompiled\sources\a\tor0.java:15:    @ofr("/toto2/Mobile/v1/couponInfo")
D:\1xbetrea\decompiled\sources\a\tor0.java:19:    @ofr("/toto/JackpotMobile/v1/couponInfo")
D:\1xbetrea\decompiled\sources\a\tq6.java:11:    @ofr("alterbuilder/v3/games")
D:\1xbetrea\decompiled\sources\a\tuk.java:13:    @ofr("https://discord.com/api/users/@me")
D:\1xbetrea\decompiled\sources\a\tuq.java:9:    @ofr("statisticGame/v2/MatchPrediction")
D:\1xbetrea\decompiled\sources\a\twh.java:9:    @ofr("/statisticGame/v2/CyclingResults")
D:\1xbetrea\decompiled\sources\a\u41.java:10:    @ofr("ContentAggregator/Layouts/Get")
D:\1xbetrea\decompiled\sources\a\u5t.java:10:    @ofr("ResultService/mobile/api/v1/gamesByGlobalChamp/all")
D:\1xbetrea\decompiled\sources\a\u5t.java:14:    @ofr("ResultService/mobile/api/v1/gamesByGlobalChamp")
D:\1xbetrea\decompiled\sources\a\u8e.java:15:    @ofr("v2/most-required/internal")
D:\1xbetrea\decompiled\sources\a\uac0.java:11:    @ofr("PromoServiceUser/v5/Promotions/GetPromotionInfo")
D:\1xbetrea\decompiled\sources\a\ucp.java:9:    @ofr("FavoriteService/v1/Favorite")
D:\1xbetrea\decompiled\sources\a\ucw.java:8:    @ofr("cyberstatistic/v1/hltv-awards")
D:\1xbetrea\decompiled\sources\a\ufc0.java:9:    @ofr("PromotionsShowcase/v1/showcase")
D:\1xbetrea\decompiled\sources\a\ufc0.java:15:    @ofr("RestCoreService/v1/mb/CheckPromoCode")
D:\1xbetrea\decompiled\sources\a\ufc0.java:18:    @ofr("RestCoreService/v1/mb/GetPromoShop")
D:\1xbetrea\decompiled\sources\a\ufc0.java:27:    @ofr("PromotionsShowcase/v1/showcase/categories")
D:\1xbetrea\decompiled\sources\a\ugn.java:11:    @ofr("/statisticGame/v2/PlayerRankingsBreakdowns")
D:\1xbetrea\decompiled\sources\a\uke0.java:9:    @ofr("/statisticGame/v2/RefereeStatisticByTournaments")
D:\1xbetrea\decompiled\sources\a\ulu.java:8:    @ofr("RestCoreService/v1/Mb/GetMobileMarketingName")
D:\1xbetrea\decompiled\sources\a\utv.java:9:    @ofr("statisticGame/v2/HeatMap")
D:\1xbetrea\decompiled\sources\a\uxp0.java:10:    @ofr("/statisticGame/v2/TennisPlayerStats")
D:\1xbetrea\decompiled\sources\a\vb30.java:9:    @ofr("statisticGame/v2/BallByBall")
D:\1xbetrea\decompiled\sources\a\vba0.java:11:    @ofr("/statisticGame/v2/PlayerTennisMenu")
D:\1xbetrea\decompiled\sources\a\vfz.java:11:    @ofr("ufcStatistic/v1/leaderboard")
D:\1xbetrea\decompiled\sources\a\vgh0.java:10:    @ofr("ResultService/mobile/api/v1/search")
D:\1xbetrea\decompiled\sources\a\vre.java:11:    @ofr("MainFeedLine/mobile/v3/betsOnFavoriteEvents")
D:\1xbetrea\decompiled\sources\a\vre.java:15:    @ofr("MainFeedLive/mobile/v3/gamesForCoupon")
D:\1xbetrea\decompiled\sources\a\vre.java:30:    @ofr("MobileLiveBetX/GetBets")
D:\1xbetrea\decompiled\sources\a\vre.java:34:    @ofr("MainFeedLive/mobile/v3/betsOnFavoriteEvents")
D:\1xbetrea\decompiled\sources\a\vre.java:41:    @ofr("MainFeedLine/mobile/v3/gamesForCoupon")
D:\1xbetrea\decompiled\sources\a\vud0.java:10:    @ofr("/cyberstatistic/v1/matches/rainbow")
D:\1xbetrea\decompiled\sources\a\vwf.java:8:    @ofr("t/btag.json")
D:\1xbetrea\decompiled\sources\a\vwf.java:11:    @ofr("t/btag.json")
D:\1xbetrea\decompiled\sources\a\vx20.java:10:    @ofr("/MainFeedLive/mobile/v3/marketHistoryGraph")
D:\1xbetrea\decompiled\sources\a\vx20.java:14:    @ofr("/MainFeedLine/mobile/v3/marketHistoryGraph")
D:\1xbetrea\decompiled\sources\a\w4w0.java:16:    @ofr("/checker/redirect/stat/run/")
D:\1xbetrea\decompiled\sources\a\w5r0.java:11:    @ofr("MainFeedLive/mobile/v3/topGamesByStat")
D:\1xbetrea\decompiled\sources\a\w5r0.java:15:    @ofr("MainFeedLine/mobile/v3/topGamesByStat")
D:\1xbetrea\decompiled\sources\a\wb7.java:8:    @ofr("/toto2/Mobile/v1/couponInfo")
D:\1xbetrea\decompiled\sources\a\wb7.java:12:    @ofr("/toto/JackpotMobile/v1/couponInfo")
D:\1xbetrea\decompiled\sources\a\wc0.java:9:    @ofr("/Aggregator_v3/v2/Brands/Get")
D:\1xbetrea\decompiled\sources\a\wd1.java:8:    @ofr("MobileB2/AvailablePlayerBonuses")
D:\1xbetrea\decompiled\sources\a\wd1.java:12:    @ofr("Aggregator_v3/v2/Bonus/GetProductsByBonusId")
D:\1xbetrea\decompiled\sources\a\wd1.java:15:    @ofr("MobileF2/AvailableOffers")
D:\1xbetrea\decompiled\sources\a\wd1.java:22:    @ofr("Aggregator_v3/v2/Bonus/GetGamesByBonusId")
D:\1xbetrea\decompiled\sources\a\wea0.java:10:    @ofr("/cyberstatistic/v1/teams-lineup/mlbb")
D:\1xbetrea\decompiled\sources\a\wea0.java:13:    @ofr("/cyberstatistic/v1/teams-lineup/rainbow")
D:\1xbetrea\decompiled\sources\a\wea0.java:16:    @ofr("/cyberstatistic/v1/teams-lineup/lol")
D:\1xbetrea\decompiled\sources\a\wea0.java:20:    @ofr("/cyberstatistic/v1/teams-lineup/cs")
D:\1xbetrea\decompiled\sources\a\wea0.java:24:    @ofr("/cyberstatistic/v1/teams-lineup/dota2")
D:\1xbetrea\decompiled\sources\a\wea0.java:27:    @ofr("/cyberstatistic/v1/teams-lineup/valorant")
D:\1xbetrea\decompiled\sources\a\wf10.java:10:    @ofr("loyaltyCashback/v5/cashback")
D:\1xbetrea\decompiled\sources\a\wf10.java:14:    @ofr("loyaltyCashback/v5/program")
D:\1xbetrea\decompiled\sources\a\wgt.java:9:    @ofr("LivebetAdvice/GetFilters")
D:\1xbetrea\decompiled\sources\a\ws4.java:13:    @ofr("/authenticator/api/v2/approvals")
D:\1xbetrea\decompiled\sources\a\ws4.java:19:    @ofr("/authenticator/api/v2/approvals/{notificationId}")
D:\1xbetrea\decompiled\sources\a\ws4.java:23:    @ofr("authenticator/api/v2/registration/partner-permission-info")
D:\1xbetrea\decompiled\sources\a\ws4.java:30:    @ofr("/authenticator/api/v2/registration/get-registrations")
D:\1xbetrea\decompiled\sources\a\x6p0.java:10:    @ofr("/statisticGame/v2/CompletedMatches")
D:\1xbetrea\decompiled\sources\a\x7n0.java:11:    @ofr("/MainFeedLine/mb/subscriptions/v3/games")
D:\1xbetrea\decompiled\sources\a\x7n0.java:15:    @ofr("/MainFeedLive/mb/subscriptions/v3/games")
D:\1xbetrea\decompiled\sources\a\xbg.java:12:    @ofr("ResultService/mobile/api/v2/games")
D:\1xbetrea\decompiled\sources\a\xbg.java:16:    @ofr("ResultService/cyber/mobile/api/v2/gamesCalendar")
D:\1xbetrea\decompiled\sources\a\xbg.java:20:    @ofr("cyberImages/v1/champs")
D:\1xbetrea\decompiled\sources\a\xbg.java:23:    @ofr("/cyberstatistic/v1/tournaments")
D:\1xbetrea\decompiled\sources\a\xgm0.java:10:    @ofr("statisticGame/v2/TopChamp/TopChampRating")
D:\1xbetrea\decompiled\sources\a\xgm0.java:14:    @ofr("statisticGame/v2/TopChamp/TopChampRating")
D:\1xbetrea\decompiled\sources\a\xgm0.java:18:    @ofr("statisticGame/v2/TopChamp/TopChampTop10Rating")
D:\1xbetrea\decompiled\sources\a\xlk.java:10:    @ofr("RestCoreService/v1/mb/GetGeoCountryFullInfo")
D:\1xbetrea\decompiled\sources\a\xlk.java:14:    @ofr("RestCoreService/v1/Mb/Sports")
D:\1xbetrea\decompiled\sources\a\xlk.java:18:    @ofr("RestCoreService/v1/mb/getEventsTypeSmallGroups")
D:\1xbetrea\decompiled\sources\a\xlk.java:22:    @ofr("translate/v1/mobile/GetTranslationsOfKeys")
D:\1xbetrea\decompiled\sources\a\xlk.java:26:    @ofr("RestCoreService/v1/mb/getEventsTypeSmall")
D:\1xbetrea\decompiled\sources\a\xlk.java:30:    @ofr("RestCoreService/v1/mb/getStaticCurrency")
D:\1xbetrea\decompiled\sources\a\xuy.java:8:    @ofr("RestCoreService/v1/mb/SipLanguages")
D:\1xbetrea\decompiled\sources\a\xy90.java:9:    @ofr("statisticGame/v2/PlayerBio")
D:\1xbetrea\decompiled\sources\a\xyg.java:10:    @ofr("cyberstatistic/v1/cs-leaderboard")
D:\1xbetrea\decompiled\sources\a\xyg.java:13:    @ofr("cyberstatistic/v1/dota-leaderboard/players")
D:\1xbetrea\decompiled\sources\a\xyg.java:16:    @ofr("cyberstatistic/v1/dota-leaderboard/teams")
D:\1xbetrea\decompiled\sources\a\xyg.java:19:    @ofr("cyberstatistic/v1/leaderboard")
D:\1xbetrea\decompiled\sources\a\xzl0.java:9:    @ofr("/statisticGame/v2/StageNet")
D:\1xbetrea\decompiled\sources\a\xzl0.java:12:    @ofr("/statisticGame/v2/TopChamp/StageNet")
D:\1xbetrea\decompiled\sources\a\xzp0.java:10:    @ofr("statisticGame/v2/TennisWinLossYears")
D:\1xbetrea\decompiled\sources\a\y0d.java:12:    @ofr("PromoServiceAuth/CoinplayCCash/GetUserBalance")
D:\1xbetrea\decompiled\sources\a\y0d.java:15:    @ofr("PromoServiceAuth/CoinplayCCash/LastTransactions")
D:\1xbetrea\decompiled\sources\a\y2h.java:10:    @ofr("/cyberstatistic/v1/matches/lol")
D:\1xbetrea\decompiled\sources\a\y300.java:10:    @ofr("LimitService/api/mobile/v4/limits")
D:\1xbetrea\decompiled\sources\a\y5q.java:12:    @ofr("/FinFeed/GetPlotsBinaryStakes_3")
D:\1xbetrea\decompiled\sources\a\y5q.java:15:    @ofr("/FinFeed/GetInstruments_2")
D:\1xbetrea\decompiled\sources\a\y8n0.java:18:    @ofr("/SubServiceMb/v4/subs/games/GetSavedGameSubscriptionSettings")
D:\1xbetrea\decompiled\sources\a\y8n0.java:26:    @ofr("/SubServiceMb/v4/subs/common/GetSubscriptions")
D:\1xbetrea\decompiled\sources\a\y8n0.java:30:    @ofr("/SubServiceMb/v4/subs/games/GetSubscriptions")
D:\1xbetrea\decompiled\sources\a\y8r.java:11:    @ofr("/Games/FruitBlast/GetActiveGame")
D:\1xbetrea\decompiled\sources\a\y8r.java:17:    @ofr("/Games/FruitBlast/GetCoef")
D:\1xbetrea\decompiled\sources\a\ybe.java:9:    @ofr("/ContactsConfiguratorNew/v2/contacts/html")
D:\1xbetrea\decompiled\sources\a\yem0.java:9:    @ofr("/statisticGame/v2/KabaddiTop")
D:\1xbetrea\decompiled\sources\a\yjp0.java:9:    @ofr("/statisticGame/v2/Squad")
D:\1xbetrea\decompiled\sources\a\yk8.java:16:    @ofr("Account/v1/Bonus/GetRoleplayingBonus")
D:\1xbetrea\decompiled\sources\a\ylb.java:11:    @ofr("MainFeedLive/mobile/v3/champsBar")
D:\1xbetrea\decompiled\sources\a\ylb.java:15:    @ofr("MainFeedLine/mobile/v3/champsBar")
D:\1xbetrea\decompiled\sources\a\ymb.java:10:    @ofr("ResultService/mobile/api/v1/champs")
D:\1xbetrea\decompiled\sources\a\ynw.java:9:    @ofr("/statisticGame/v2/HorseLastRaces")
D:\1xbetrea\decompiled\sources\a\ysd0.java:10:    @ofr("/statisticGame/v2/racesresults")
D:\1xbetrea\decompiled\sources\a\z1l.java:9:    @ofr("cyberstatistic/v1/tournaments/dota2/global/{globalId}")
D:\1xbetrea\decompiled\sources\a\z2c0.java:9:    @ofr("Account/v1/Mb/UserData")
D:\1xbetrea\decompiled\sources\a\z4e0.java:10:    @ofr("/statisticGame/v2/FIFARatingYearHistory")
D:\1xbetrea\decompiled\sources\a\z52.java:10:    @ofr("/RestCoreService/v1/mb/GetAllowedSports")
D:\1xbetrea\decompiled\sources\a\z8p0.java:11:    @ofr("MainFeedLive/mb/cyber/v3/gamesByOpp")
D:\1xbetrea\decompiled\sources\a\z8p0.java:15:    @ofr("MainFeedLine/mb/cyber/v3/gamesByOpp")
D:\1xbetrea\decompiled\sources\a\z8p0.java:19:    @ofr("ResultService/cyber/mobile/api/v1/gamesByOpp")
D:\1xbetrea\decompiled\sources\a\z8p0.java:23:    @ofr("MainFeedLive/mb/cyber/v3/gamesByOppPartner")
D:\1xbetrea\decompiled\sources\a\z8p0.java:27:    @ofr("MainFeedLine/mb/cyber/v3/gamesByOppPartner")
D:\1xbetrea\decompiled\sources\a\z9n0.java:10:    @ofr("/SubServiceMb/v4/subs/teams/GetSubscriptions")
D:\1xbetrea\decompiled\sources\a\zca0.java:10:    @ofr("/statisticGame/v2/TransferList")
D:\1xbetrea\decompiled\sources\a\zem0.java:9:    @ofr("/statisticGame/v2/LineUps")
D:\1xbetrea\decompiled\sources\a\zff0.java:8:    @ofr("configuration/v2/config/{bundle}/{whence}/{version}")
D:\1xbetrea\decompiled\sources\a\zhb0.java:9:    @ofr("aggregatorfeed/v1/advisedteams")
D:\1xbetrea\decompiled\sources\a\zkt.java:9:    @ofr("/GeoIpService/v1/GeoIp/GetLocation")
D:\1xbetrea\decompiled\sources\a\zsl0.java:11:    @ofr("MainFeedLine/mobile/v3/sports")
D:\1xbetrea\decompiled\sources\a\zy00.java:9:    @ofr("cyberstatistic/v1/tournaments/lol/global/{globalId}")
```

