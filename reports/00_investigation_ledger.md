# Investigation Ledger — 1xbet.apk

## Target identity (Confirmed)
- File: `D:\1xbetrea\1xbet.apk` — 47,715,154 bytes
- SHA-256: `d0ae8e422e47b480c20fa170c5ff85e67ee6074a1ac106ce0f75890cb8a3133d`
- Package: `org.xbet.client1`
- Version name: `1xbet-prod-v260.1.0`; version code `26001000`
- minSdk 24; targetSdk 37; compileSdk 37 (Android 17 codename)
- Application class: `org.platform.app.ApplicationLoader`
- 7 DEX files (classes.dex 9,799,176 B … classes6.dex 12,746,584 B; classes7.dex 66,636 B)
- 69,044 classes; 6,431 resource entries (REA JADX provider summary, evidence `ev_a95f12af1bb1bcd46e156bd8a8212f4ccbde66cdcd4f6ebf73e1989ebf332e63`)
- Build: AGP 9.4.1; git revision `4c23020c57da306c8e90ba584e839495089beaa7`
- Signing: APK Signature Scheme v2 (ID `0x7109871A`), self-signed cert Subject=Issuer=`O=1xBet`, serial `156DAD81`, valid 2016-09-23 → 2046-09-16, SHA-1 thumbprint `88FE04E7741DE72392139479786297ABDEC744E0`, RSA PKCS#1 v1.5/SHA-256 (`1.2.840.113549.1.1.11`). No v1 META-INF certificate entries; v3.1 striding attribute pair (`0x42726577`) also present. Signature verification of file integrity not performed by REA.
- Manifest: 32 activities, 30 services, 23 receivers, 10 providers, 42 intent-filters, 3 activity-aliases; `allowBackup=false`, `networkSecurityConfig=@xml/network_security_config`, `extractNativeLibs=true`, `largeHeap=true`, `requestLegacyExternalStorage=true`.

## Tooling / provenance
- REA MCP v6.7.0 with `jadx-headless-mcp 0.7.1` (artifact sha256 `6e5eacf500b64292bfb73c49797c1958f6ee44646e43e868039ae7feb573ff75`), JDK 25.0.3 Temurin.
- JADX CLI 1.5.7 full decompilation: `D:\1xbetrea\decompiled\sources` — 69,001 `.java` files; 961 methods failed decompilation (log `D:\1xbetrea\_tools\jadx.log`).
- apktool 3.0.3 decode: `D:\1xbetrea\apktool_out` (manifest, resources, assets; smali skipped).
- REA artifact inventory: 6,002 nodes / 6,432 occurrences / 6,431 edges, 0 integrity contradictions (evidence `ev_9e565541e68da3af44c0323540f5275fea6a98c7d44701be62e4ece70427d981`, view `ev_c91bcbd59ae39b39d6fe97a3e12d8e42468e02d3b3a3b5416a16747e73c0686e`).
- Master URL extract (260 unique strings from decompiled Java): `D:\1xbetrea\_tools\all_urls.txt`.

## Confirmed static observations
- Encrypted remote config: `assets/remote-config/remote-config.json` contains only `dataHex` and `ivHex` (68,121 bytes file). **RESOLVED (Section 23):** AES-256 key `ZgudVs2IhRqaWqj7owMwNWc1Mvkj6GuH` recovered from `libkeys.so` (`config_main_key`), CBC/PKCS5, IV from `ivHex`; bundled 34 KB config decrypted at `reports/remote_config_decrypted_main.txt`.
- First-party code is `org.xplatform` with 85 feature modules / ~1,052 files; notable: `betting`, `make_bet`, `coupon`, `bet_history`, `bet_constructor`, `feature/office/payment`, `wallet`, `limits_africa|ee|kenya|ne`, `responsible_game`, `spin_and_win`, `scratch_card`, `lucky_wheel`, `bonus_games`, `aggregator`, `top`, `popular`, `cyber` (virtualrecommended), `security`, `onexdatabase`, `democonfig`, `feature/office/test_section`.
- Asset configs: `layoutConfigurationAggregatorAuth.json` / `UnAuth.json` define recommendation-like blocks (`nameType`: recommended, top_games, slots_popular, live_popular, crash_popular, favorites, viewed) with `categoryId`, `partId`, `limit`, `filterType`, `isInfinite`, `miniatureType`. `gameEventsCardOne/Two/Three.json` define event types, parameters and coefficients for free games.
- Hardcoded domains observed in code include `https://1xbet.com/`, `hfoweytnvkf.com`, `mobilaserverslux.xyz`, `mobilaserverstest.xyz`, `mobserverstestii.xyz`, `mob-experience.space`, `bitstars.bet`, `betpari-ads.com`, `bwtsrv.com`, `kaspi.kz`, plus templated `%s` domain patterns (domain-checker / anti-block infrastructure likely; Agent 1 to confirm).
- Native libs (arm64-v8a + armeabi-v7a): `libkeys.so`, `libsecurity.so`, `libantifraud.so`, `libantifraud_audio.so`, `libtoolChecker.so`, `libsdk_bc_lib.so`, etc.

## Checklist → owner
1. Architecture / network / API / auth / remote config decryption → Agent 1 → `reports/01_architecture_network.md`
2. Betting lifecycle → Agent 2 → `reports/02_betting_system.md`
3. Payments / browser / discrepancies / dynamic limits → Agent 3 → `reports/03_payments_limits.md`
4. Recommendations / free spins → Agent 4 → `reports/04_recommendations_freespins.md`
5. Security / storage / runtime feasibility → Agent 5 → `reports/05_security_storage.md`
6. Final report synthesis (19 sections + Mermaid) → coordinator → `reports/FINAL_REPORT.md`

## Limitations to preserve
- Static analysis only: no APK execution, no emulator/device confirmed yet, no production network calls.
- 961 methods failed JADX decompilation; obfuscated/overloaded names may be aliases; REA display signatures can differ from raw DEX prototypes.
- Backend implementation, live configuration, actual transaction records, and server-side calculation logic are NOT observable from the APK.
- No real deposits, withdrawals, or bets were performed.
