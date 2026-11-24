$ErrorActionPreference = 'Stop'
$base = 'D:\1xbetrea\reports'
$syn  = Join-Path $base '00_synthesis.md'
$r01  = Join-Path $base '01_architecture_network.md'
$r02  = Join-Path $base '02_betting_system.md'
$r03  = Join-Path $base '03_payments_limits.md'
$r04  = Join-Path $base '04_recommendations_freespins.md'
$r05  = Join-Path $base '05_security_storage.md'
$raw  = Join-Path $base '_endpoints_raw.txt'
$outFile = Join-Path $base 'FINAL_REPORT.md'

function Norm-Heading([string]$x) {
    return $x.Trim().Replace([char]0x2014, '-').Replace([char]0x2013, '-').Replace([char]0x2212, '-')
}

function Get-Block {
    param([string]$Path, [string]$Start, [string]$End)
    $lines = [System.IO.File]::ReadAllLines($Path)
    $s = -1; $e = $lines.Length
    $ns = Norm-Heading $Start
    $ne = if ($End) { Norm-Heading $End } else { $null }
    for ($i = 0; $i -lt $lines.Length; $i++) {
        $nl = Norm-Heading $lines[$i]
        if ($s -lt 0 -and $nl -eq $ns) { $s = $i }
        elseif ($s -ge 0 -and $ne -and $nl -eq $ne) { $e = $i; break }
    }
    if ($s -lt 0) { throw "Start heading not found: [$Start] in $Path" }
    if ($e -le $s) { return @() }
    return @($lines[$s..($e-1)])
}

function Convert-Headings {
    param([string[]]$Lines, [int]$Levels)
    return @($Lines | ForEach-Object {
        if ($_ -match '^(#{1,6})(\s.*)$') {
            ('#' * [Math]::Min(6, $Matches[1].Length + $Levels)) + $Matches[2]
        } else { $_ }
    })
}

function Convert-Whole {
    param([string]$Path, [bool]$StripH1, [int]$Levels)
    $lines = [System.IO.File]::ReadAllLines($Path)
    if ($StripH1 -and $lines.Length -gt 0 -and $lines[0] -match '^#\s') {
        $lines = @($lines[1..($lines.Length-1)])
    }
    return Convert-Headings -Lines $lines -Levels $Levels
}

$o = New-Object System.Collections.Generic.List[string]
function Add-Line([string]$s) { $o.Add($s) }
function Add-Block([string[]]$lines) { foreach ($l in $lines) { $o.Add($l) }; $o.Add('') }

# ---------- Front matter ----------
Add-Line '# 1xBet Android APK — Comprehensive Reverse-Engineering & Security Investigation'
Add-Line ''
Add-Line '**Target:** `D:\1xbetrea\1xbet.apk` · **Package:** `org.xbet.client1` · **Version:** `1xbet-prod-v260.1.0` (26001000)'
Add-Line '**SHA-256:** `d0ae8e422e47b480c20fa170c5ff85e67ee6074a1ac106ce0f75890cb8a3133d` · **Analysis date:** 2026-11-24'
Add-Line ''
Add-Line '**Method:** full JADX 1.5.7 decompilation (69,001 Java sources), apktool 3.0.3 resource decode, REA 6.7.0 + `jadx-headless-mcp 0.7.1` static analysis with incoming-reference tracing. Static analysis only — no APK execution, emulator, production network call, real bet, deposit or withdrawal.'
Add-Line ''
Add-Line '> **Confidence notation:** **Confirmed** = directly proven by shipped code/config; **Strongly Supported** = multiple consistent code paths, no runtime proof; **Probable** = plausible inference with gaps; **Unverified** = requires backend, native key, or runtime evidence.'
Add-Line ''
Add-Line '## Table of Contents'
Add-Line ''
$toc = @(
 '1. Executive Summary',
 '2. APK Metadata and Technical Profile',
 '3. Application Architecture',
 '4. Internal Module Breakdown',
 '5. Betting System: Complete Execution Flow',
 '6. Recommendation Engine: Logic and Data Sources',
 '7. Payment Architecture',
 '8. Browser-Based Payment Processing',
 '9. Payment Discrepancies and Root-Cause Analysis',
 '10. Deposit and Withdrawal Limit Behaviour',
 '11. Free Spins: Implementation and Algorithm Analysis',
 '12. API Endpoint Inventory',
 '13. Network Communication Diagrams',
 '14. Database and Local Storage Analysis',
 '15. Runtime Behaviour',
 '16. Security Assessment',
 '17. Confirmed Findings vs. Hypotheses',
 '18. Unresolved Questions and Backend Dependencies',
 '19. Final Technical Conclusions',
 'Appendix A — Supporting artefacts',
 'Appendix B — Full extracted endpoint list'
)
foreach ($t in $toc) { Add-Line "- $t" }
Add-Line ''

# ---------- 1 ----------
Add-Block (Get-Block -Path $syn -Start '## 1. Executive Summary' -End '## 13. Network Communication Diagrams (cross-cutting)')

# ---------- 2 ----------
Add-Line '## 2. APK Metadata and Technical Profile'
Add-Line ''
Add-Block @(
'### 2.1 Identity and build',
'',
'| Property | Value | Confidence |',
'|---|---|---|',
'| File | `D:\1xbetrea\1xbet.apk` (47,715,154 bytes) | Confirmed |',
'| SHA-256 | `d0ae8e422e47b480c20fa170c5ff85e67ee6074a1ac106ce0f75890cb8a3133d` | Confirmed |',
'| Package | `org.xbet.client1` | Confirmed |',
'| Version | `1xbet-prod-v260.1.0`, code `26001000` | Confirmed |',
'| SDK | minSdk 24; targetSdk 37; compileSdk 37 | Confirmed |',
'| Application class | `org.platform.app.ApplicationLoader` | Confirmed |',
'| DEX | 7 files: classes.dex 9,799,176 B; classes2 9,142,716 B; classes3 10,463,164 B; classes4 10,924,388 B; classes5 10,658,536 B; classes6 12,746,584 B; classes7 66,636 B | Confirmed |',
'| Scale | 69,044 classes, 6,431 resource entries | Confirmed (REA `ev_a95f12a…`) |',
'| Build | AGP 9.4.1; git revision `4c23020c57da306c8e90ba584e839495089beaa7` | Confirmed |',
'| App label | `1xBet`; white-label strings also present: BetWinner, BetandU, FanSport, 1xBet-ke | Confirmed |',
'| Native ABIs | `arm64-v8a`, `armeabi-v7a` | Confirmed |',
'',
'### 2.2 Signing identity',
'',
'APK Signature Scheme v2 block present (pair ID `0x7109871A`, file offset 47,315,652); no v1 `META-INF` certificate. Signer certificate: Subject = Issuer = `O=1xBet`, serial `156DAD81`, valid 2016-09-23 → 2046-09-16, SHA-1 thumbprint `88FE04E7741DE72392139479786297ABDEC744E0`, signature algorithm `1.2.840.113549.1.1.11` (RSASSA-PKCS1-v1_5 with SHA-256). A v3.1 striding attribute pair (`0x42726577`) is also present. REA explicitly did **not** verify the APK signature; the values above were read directly from the signing block.',
'',
'### 2.3 Manifest surface',
'',
'32 activities, 30 services, 23 receivers, 10 providers, 42 intent-filters, 3 activity-aliases. Application attributes: `allowBackup="false"`, `networkSecurityConfig="@xml/network_security_config"`, `extractNativeLibs="true"`, `largeHeap="true"`, `requestLegacyExternalStorage="true"`, `dataExtractionRules`/`fullBackupContent` referencing AppsFlyer rules. Detailed security analysis in Section 16.',
'',
'### 2.4 Analysis provenance',
'',
'- REA MCP 6.7.0, `jadx-headless-mcp 0.7.1` (JAR SHA-256 `6e5eacf500b64292bfb73c49797c1958f6ee44646e43e868039ae7feb573ff75`), JDK 25.0.3 Temurin.',
'- JADX CLI 1.5.7 decompilation: 69,001 `.java` files; 961 methods failed decompilation (log `_tools/jadx.log`).',
'- apktool 3.0.3 decode: `apktool_out/` (smali skipped; Java-source recovery done by JADX).',
'- REA artifact inventory: 6,002 nodes / 6,432 occurrences / 6,431 edges, 0 integrity contradictions (evidence `ev_9e565541e68da3af44c0323540f5275fea6a98c7d44701be62e4ece70427d981`).',
'- 402 unique GET paths and 209 unique POST paths recovered from Retrofit-style annotations (Appendix B).'
)

# ---------- 3 ----------
Add-Line '## 3. Application Architecture'
Add-Line ''
Add-Block (Convert-Whole -Path $r01 -StripH1 $true -Levels 1)

# ---------- 4 ----------
Add-Line '## 4. Internal Module Breakdown'
Add-Line ''
Add-Block @(
'First-party code is concentrated in `org/xplatform` (85 modules, ~1,052 files). Additional first-party entry points: `org/platform/app/ApplicationLoader.java` and `org/xbet/client1`. The remaining ~68,000 classes are third-party SDKs (AndroidX, OkHttp, Firebase, HMS, AppsFlyer, VK/OK/Yandex, reCAPTCHA) and the heavily obfuscated flat `a` package that holds most runtime business logic. Obfuscation is mitigated by Kotlin `@Metadata` and `kotlinx.serialization` descriptors, which preserve original class names and exact JSON keys.',
'',
'| Module group | Modules (file count where notable) | Role |',
'|---|---|---|',
'| Core / infrastructure | `core`, `domain`, `services`, `feature`, `security`, `app_start`, `app_update`, `settings`, `themeswitch`, `localtimedif`, `client1`, `democonfig`, `secret`, `verification`, `fingerprint`, `pin_code`, `authenticator`, `authqr`, `authreminder`, `login`, `registration`, `registration_default`, `resident`, `mailing`, `messages`, `support`, `consultantchat`, `alerts_pipe_api`, `onexdatabase`, `feature/office/test_section` | DI, networking, crypto keys, auth, lifecycle, debug/test tooling, local DB |',
'| Betting / markets | `betting` (15), `make_bet` (6), `make_bet_settings`, `bet_constructor`, `makebet_promocodes`, `coupon` (10), `bet_history` (17), `bethistory`, `sportgame` (39), `feed` (23), `top` (60), `popular`, `related`, `results`, `market_statistic`, `coef_type`, `swipex`, `toto_bet`, `ufc`, `rules`, `responsible_game`, `limits_africa`, `limits_ee`, `limits_kenya`, `limits_ne`, `limits.ie`, `limits.rs` | Bet lifecycle, odds feeds, coupons, limits, responsible gambling |',
'| Payments / rewards | `feature/office/payment` (PaymentWebView), `wallet`, `promo`, `promotions`, `referral`, `bonus_games` (7), `wild_free_bet`, `spin_and_win` (3), `scratch_card`, `lucky_wheel`, `lucky_card` | Money movement, bonuses, free games |',
'| Games / aggregator | `aggregator` (17), `games_section`, `games_mania`, `cyber` (152 — largest module), `uikit_web_games`, `background_video`, `game_broadcasting` (23), `special_event`, `african_roulette`, `apple_fortune`, `crystal`, `dragons_gold`, `domino`, `eastern_nights`, `lucky_wheel`, `playersduel`, `tile_matching` | Casino/virtual games, live streams, aggregator catalogue |',
'| UI / presentation | `uikit` (117), `ui_core` (64), `uikit_sport` (40), `widget`, `banners`, `picker`, `favorites`, `search`, `main_menu`, `statistic` | Reusable Compose/View components and navigation |',
'',
'Largest modules by file count: `cyber` 152, `uikit` 117, `ui_core` 64, `top` 60, `uikit_sport` 40, `sportgame` 39, `app_update` 38, `security` 38, `statistic` 35, `personal` 27.',
'',
'Key cross-module mechanisms: Dagger 2 component `a.g8i`; OkHttp 5 client with a Retrofit-style annotation shim (`@ofr` = GET, `@kg80` = POST, `@jb8` = @Body, `@xpv` = @Header, `@nkd0` = @Query); Cicerone navigation; WorkManager; Room (`onexdatabase`); encrypted configuration via native `libkeys.so`/`libsecurity.so`. See Section 3 for file-level evidence.'
)

# ---------- 5 ----------
Add-Line '## 5. Betting System: Complete Execution Flow'
Add-Line ''
Add-Block (Convert-Whole -Path $r02 -StripH1 $true -Levels 1)

# ---------- 6 ----------
Add-Line '## 6. Recommendation Engine: Logic and Data Sources'
Add-Line ''
Add-Block (Convert-Headings -Lines (Get-Block -Path $r04 -Start '# PART 1 - RECOMMENDATIONS / SUGGESTIONS' -End '# PART 2 - FREE SPINS AND NON-MONETARY TEST FEATURES') -Levels 2)

# ---------- 7 ----------
Add-Line '## 7. Payment Architecture'
Add-Line ''
Add-Block (Convert-Headings -Lines (Get-Block -Path $r03 -Start '## Executive summary' -End '## B. Browser-based payments') -Levels 1)

# ---------- 8 ----------
Add-Line '## 8. Browser-Based Payment Processing'
Add-Line ''
Add-Block (Convert-Headings -Lines (Get-Block -Path $r03 -Start '## B. Browser-based payments' -End '## C. Payment discrepancies (requested / displayed / submitted / recorded amounts)') -Levels 1)

# ---------- 9 ----------
Add-Line '## 9. Payment Discrepancies and Root-Cause Analysis'
Add-Line ''
Add-Block (Convert-Headings -Lines (Get-Block -Path $r03 -Start '## C. Payment discrepancies (requested / displayed / submitted / recorded amounts)' -End '## D. Dynamic deposit / withdrawal limits - PRIMARY OBJECTIVE') -Levels 1)

# ---------- 10 ----------
Add-Line '## 10. Deposit and Withdrawal Limit Behaviour'
Add-Line ''
Add-Block (Convert-Headings -Lines (Get-Block -Path $r03 -Start '## D. Dynamic deposit / withdrawal limits - PRIMARY OBJECTIVE' -End '## Mermaid diagrams') -Levels 1)
Add-Block (Convert-Headings -Lines (Get-Block -Path $r03 -Start '## Evidence index (file : lines)' -End '## Limitations / missing information (explicit)') -Levels 1)
Add-Block (Convert-Headings -Lines (Get-Block -Path $r03 -Start '## Limitations / missing information (explicit)' -End $null) -Levels 1)

# ---------- 11 ----------
Add-Line '## 11. Free Spins: Implementation and Algorithm Analysis'
Add-Line ''
Add-Block (Convert-Headings -Lines (Get-Block -Path $r04 -Start '# PART 2 - FREE SPINS AND NON-MONETARY TEST FEATURES' -End '# PART 3 - CONCLUSIONS, UNKNOWNS, AND WHAT IS MISSING') -Levels 2)

# ---------- 12 ----------
Add-Line '## 12. API Endpoint Inventory'
Add-Line ''
Add-Block @(
'The full machine-generated inventory of Retrofit-style annotations is in **Appendix B** (402 unique GET paths, 209 unique POST paths). The table below maps the highest-value endpoints recovered from the decompiled interfaces; all paths are relative to the runtime domain supplied by the domain checker (Section 3).',
'',
'| Area | Method | Path | Purpose / notes |',
'|---|---|---|---|',
'| Config | GET | `configuration/v2/config/{bundle}/{whence}/{version}` | Fetch remote configuration bundle |',
'| Domain | GET | `ru/redirect/api/getactualdomain` | Domain checker (encrypted response) |',
'| Domain | GET | `ActualDomain/v1/actual-domains/match-domain` | Domain checker match (encrypted response) |',
'| Auth | POST | `Feeds/System/Auth.json?v=2` | Authentication / session |',
'| Account | GET | `Account/v1/Mb/GetUserBalance` | Balance |',
'| Betting | GET | `{BetType}Feed/Mb_GetEventsZip` | Odds/events feed (`a/hon.java:9`) |',
'| Betting | POST | `MobileLiveBetX/MobileMakeBet` | Submit bet (`a/m520.java:9`); variants `Multi`, `Bid`, `Builder`, `Alternative` |',
'| Betting | POST | `MobileLiveBetX/MobileUpdateCoupon` | Refactor stale odds (`a/vre.java:27`); variants `Multi`, `Builder` |',
'| Payments | POST | `RestCoreService/v1/Mb/moneyMove` | Money movement / withdrawals |',
'| Payments | GET | `https://<domain>/paysystems/{deposit|withdraw}` | Backend-rendered payment methods page in WebView |',
'| Wallet | POST | SeamWallet transfer endpoints | Internal balance transfers (`MoveMoneyRequest.transferAmount`, `double`) |',
'| Limits | GET | `LimitService/.../limits` | Deposit / betting limit data |',
'| Feeds | GET | `MainFeedLine/mobile/v3/game`, `MainFeedLive/mobile/v3/game` | Event lists |',
'| Recommendations | GET | `GetRecommendedGames` | Recommended games for Aggregator carousels |',
'| Free spins | POST | `Games/LuckyWheel/v2/Spins` | Lucky Wheel spin request `{WF, BAC}` |',
'| Push | — | `/sockets/channel` | WebSocket for odds/feed updates (`a/ts4.java:469-477`) |',
'',
'Authentication: most calls carry `X-Auth: Bearer <token>`; payment WebView requests additionally inject `X-Deeplink: xbet://open`, `X-Referral: 1`, `X-Mobile-Project-Id: 1357` (`a/s980.java:490-498`). See Sections 3, 5, 7, 8 for request/response structures and handling.'
)

# ---------- 13 ----------
Add-Block (Get-Block -Path $syn -Start '## 13. Network Communication Diagrams (cross-cutting)' -End '## 17. Confirmed Findings vs. Hypotheses')
Add-Block (Convert-Headings -Lines (Get-Block -Path $r03 -Start '## Mermaid diagrams' -End '## Evidence index (file : lines)') -Levels 1)

# ---------- 14 ----------
Add-Line '## 14. Database and Local Storage Analysis'
Add-Line ''
Add-Block (Convert-Headings -Lines (Get-Block -Path $r05 -Start '## 3. Local storage' -End '## 4. WebView security') -Levels 1)

# ---------- 15 ----------
Add-Line '## 15. Runtime Behaviour'
Add-Line ''
Add-Block (Convert-Headings -Lines (Get-Block -Path $r05 -Start '## 7. Runtime / dynamic analysis feasibility' -End '## 8. Recommendations (prioritized)') -Levels 1)
Add-Line '**Static-observation substitute.** In the absence of runtime execution, the following dynamic-facing behaviours were inferred from code and configs: odds/feed updates arrive over a WebSocket (`/sockets/channel`); layout/config is cached in SharedPreferences and `AtomicFile` then refreshed; payment status is refreshed asynchronously after deep-link callbacks; bets are confirmed only from backend `BaseResponse` values; free games animate to backend-supplied outcomes. These are code-level facts, not observed executions (Sections 3, 5, 8, 11).'
Add-Line ''

# ---------- 16 ----------
Add-Line '## 16. Security Assessment'
Add-Line ''
Add-Block (Convert-Headings -Lines (Get-Block -Path $r05 -Start '## 0. Executive summary' -End '## 3. Local storage') -Levels 1)
Add-Block (Convert-Headings -Lines (Get-Block -Path $r05 -Start '## 4. WebView security' -End '## 7. Runtime / dynamic analysis feasibility') -Levels 1)
Add-Block (Convert-Headings -Lines (Get-Block -Path $r05 -Start '## 8. Recommendations (prioritized)' -End $null) -Levels 1)
Add-Line '### 16.x TLS/pinning reconciliation (coordinator verification)'
Add-Line ''
Add-Line 'The payments and security/architecture reports disagreed on certificate pinning. Direct verification resolved this: `okhttp3/OkHttpClient.java:148,230` initialises `CertificatePinner.c` (the default empty pinner), so **API traffic has no public-key pinning**. `a/tiq.java` is a `WebViewClient` used by many WebViews (including `org/xplatform/game_broadcasting/.../GameZoneWebView.java` and subclasses such as `a/hb90.java`); its `onReceivedSslError` compares the presented certificate issuer to bundled Let''s Encrypt CAs and calls `sslErrorHandler.proceed()` when they match. That is issuer validation that overrides an SSL error — **not** certificate pinning, and it is WebView-only. This report therefore states: no OkHttp pinning; limited WebView issuer check that weakens SSL-error handling.'
Add-Line ''

# ---------- 17-19 ----------
Add-Block (Get-Block -Path $syn -Start '## 17. Confirmed Findings vs. Hypotheses' -End $null)
Add-Block (Convert-Headings -Lines (Get-Block -Path $r04 -Start '# PART 3 - CONCLUSIONS, UNKNOWNS, AND WHAT IS MISSING' -End $null) -Levels 2)

# ---------- Appendices ----------
Add-Line '## Appendix A — Supporting artefacts'
Add-Line ''
Add-Block @(
'| Artefact | Description |',
'|---|---|',
'| `reports/00_investigation_ledger.md` | Target identity, evidence IDs, tooling, checklist |',
'| `reports/01_architecture_network.md` | Full architecture / network / auth / remote-config report (Sections 3) |',
'| `reports/02_betting_system.md` | Full betting lifecycle report (Section 5) |',
'| `reports/03_payments_limits.md` | Full payments / browser / discrepancy / limits report (Sections 7-10) |',
'| `reports/04_recommendations_freespins.md` | Full recommendations / free-spins report (Sections 6, 11) |',
'| `reports/05_security_storage.md` | Full security / storage / runtime report (Sections 14-16) |',
'| `reports/00_synthesis.md` | Coordinator synthesis (Sections 1, 13, 17-19) |',
'| `reports/_endpoints_raw.txt` | Raw endpoint extraction (Appendix B) |',
'| `decompiled/sources/` | 69,001 decompiled Java files |',
'| `apktool_out/` | Decoded manifest, resources, assets |',
'| `_tools/jadx.log`, `_tools/apktool.log` | Decompilation / decode logs |'
)

Add-Line '## Appendix B — Full extracted endpoint list'
Add-Line ''
Add-Line '```text'
$rawLines = [System.IO.File]::ReadAllLines($raw)
foreach ($l in $rawLines) { Add-Line $l }
Add-Line '```'
Add-Line ''

$text = ($o -join "`r`n") + "`r`n"
[System.IO.File]::WriteAllText($outFile, $text, (New-Object System.Text.UTF8Encoding($false)))
Write-Output ("FINAL_REPORT_WRITTEN=" + $outFile)
Write-Output ("LINES=" + $o.Count)
Write-Output ("BYTES=" + (Get-Item $outFile).Length)
