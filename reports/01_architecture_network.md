# 1xBet Android App — Architecture, Networking, Authentication & Remote Configuration

**Target:** `D:\1xbetrea\1xbet.apk` — `org.xbet.client1`, version `1xbet-prod-v260.1.0` (versionCode `26001000`), 69,044 classes
**Analysis type:** AUTHORIZED static reverse-engineering of shipped artifacts only.
**Sources:** JADX decompiled Java (`D:\1xbetrea\decompiled\sources`), apktool output (`D:\1xbetrea\apktool_out`).
**Date:** 2026-11-24

---

## 0. Scope, method, and critical limitations

This report is derived **only** from static analysis of the APK: decompiled Java bytecode (JADX), decoded `AndroidManifest.xml`, resources, and native libraries present in the APK. **No runtime execution, no emulator, no network traffic to any 1xBet/production service, and no dynamic instrumentation was performed.** Static analysis proves what code *can* do; it does not prove what the app *actually* sends or receives at runtime. Backend behaviour (real key/IV values, whether an endpoint enforces auth server-side, what a live config blob decrypts to) cannot be established from the APK alone and is flagged `Unverified`.

Confidence scale used throughout:
- **Confirmed** — directly proven by decompiled code / manifest / resource in the shipped artifact.
- **Strongly Supported** — multiple independent code locations agree; minor ambiguity from decompiler artifacts only.
- **Probable** — inferred from naming/structure; no complete code path observed.
- **Unverified** — requires runtime or backend access.

> Note on deobfuscation: most first-party logic is compiled into the `a/` package with short names (e.g. `a.ofr` = Retrofit `@GET`, `a.kg80` = `@POST`, `a.nkd0` = `@Query`, `a.z190` = `@Path`, `a.jb8` = `@Body`, `a.xpv` = `@Header`, `a.dtv` = `@Headers`, `a.doo0` = `@Tag`). Feature-level code remains readable under `org/xplatform/**` (85 feature modules).

---

## 1. Architecture, languages, frameworks, SDKs

### 1.1 Application entry point (Confirmed)

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

### 1.2 Languages / libraries observed (Confirmed unless noted)

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

### 1.3 Module architecture (Strongly Supported)

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

## 2. Base URLs, domain checker, and API surface

### 2.1 Hardcoded seed domain and domain-checker mechanism (Confirmed)

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

### 2.2 Endpoint inventory (Confirmed from annotations)

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

#### Priority endpoints (evidence-backed)

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

#### Request flow (Confirmed code structure)

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

## 3. Authentication, session management, token storage (Confirmed)

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

## 4. Request signing / encryption / obfuscation (Confirmed code, native key values Unverified)

### 4.1 Layers

1. **Header-based auth** — `X-Auth: Bearer <token>` (§3). No evidence of a per-request HMAC signature over the body in the Java sources.
2. **`Accept: application/vnd.xenvelop+json`** on the majority of API interfaces — indicates an "envelope" response contract; some payloads are encrypted (see §4.3).
3. **AES/CBC/PKCS5Padding** with native-provided key+IV for sensitive strings/responses (`a/z8w0.java`), and for remote-config/domain blobs (`a/ref.java`).
4. **Google Tink** primitives (AES-GCM, AES-GCM-SIV, XAES-GCM) are bundled — `a/do20.java:314`, `a/b50.java:139`, `a/qow0.java:96-116`, Tink key type URLs in `a/a70.java:13`, `a/fww0.java:10`. Which specific Tink keyset is used at runtime is Unverified.
5. **Obfuscation**: R8/Dagger-generated short names; strings such as endpoint paths remain literal.

### 4.2 Remote-config / domain AES construction (Confirmed)

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

### 4.3 Request/response AES construction (Confirmed)

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

### 4.4 Native libraries and certificate pinning (Confirmed)

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

## 5. Remote configuration — decryption algorithm reconstructed (Confirmed)

### 5.1 Asset and model

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

### 5.2 Exact decryption algorithm (Confirmed)

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

### 5.3 Remote-fetch merge behaviour (Confirmed)

`a/rxn.java:144-181` shows the fetched encrypted config is decrypted, then **merged over** (a) the local asset config (`vff0.e.s()`), (b) the saved config (`vff0.b(...)`), and (c) the newly fetched config, in that precedence order (`:161-163`: `map.putAll(asset); map.putAll(saved); map.putAll(fetched)`), then re-serialized, **re-encrypted with the same key + IV** and written to disk (`:164-181`, `:193`). This means the remote server can override every bundled flag.

### 5.4 Decrypted config keys / feature flags (Confirmed — schema; values Unverified)

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

## 6. Hardcoded secrets, keys, endpoints, debug/test backdoors

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

## 7. Findings summary and confidence matrix

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
