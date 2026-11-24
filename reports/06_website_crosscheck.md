# Website Cross-Check — `https://indian.1xbet.com/en`

## Scope and constraints (read this first)

- Inspection date: 2026-11-24. Public pages only, via the user's connected Brave browser in **read-only/passive** mode.
- The browser already had an **authenticated 1xBet session** (account menu, balance, "Log out" visible). No login was attempted, no form was submitted, no "Confirm"/"Deposit"/"Withdraw"/"Play" button was clicked, no bet or transaction of any kind was made.
- No tokens, cookies, account numbers, names or balances are reproduced here. Network capture recorded URLs and response headers only (`bodies: false`); the tool redacted all header values.
- The site is served through Cloudflare (`cf-ray`, `cf-cache-status` headers). It redirected the bare `/en` URL to `/en?v=2` on first load.

## 1. Strong matches to the APK findings

| Website observation (evidence) | APK finding it corroborates | Assessment |
|---|---|---|
| Page exposes `SPORTS`, `LIVE`, `MULTI-LIVE`, `1XGAMES`, `SLOTS`, `LIVE CASINO`, `Fast bet`, `Toto`, `Bingo`, `Scratch Cards`, `Lotto`, `Virtual sports`, `TV Games`, `Cyber2077`, `Apple Of Fortune`, `Crystal`, `Plinko`, `Crash`, `Spin and Win`, `Wild West Gold`, `Relics of Zeus`, etc. | The 85-module `org.xplatform` map: `sportgame`, `feed`, `cyber`, `games_section`, `spin_and_win`, `scratch_card`, `lucky_wheel`, `crystal`, `apple_fortune`, `african_roulette`, `bonus_games`, `bets_on_yours`, `fast_bet`, `toto_bet`, `bingo` | **Strong match** — the product catalogue is the same |
| `/en/office/recharge` shows grouped methods: *Recommended* (UPI, UPI Fast, UPI QR, iCash.One +50%, Crypto), *Payment cards* (Visa, MasterCard), *E-wallets* (MoneyGO, BinancePay, Neteller, GG\|Bnk Wallet, MoneyGo USD, AIRTM 30%), *Bank transfer* (IMPS New), *Cryptocurrency* | Payment report conclusion: there is no native catalogue; the "Pay systems" screen renders a backend-provided page with provider-specific groups and promo badges | **Strong match** — confirms backend-rendered, dynamically composed catalogue |
| Deposit page contains no min/max amounts in its static DOM; the SEO page `/en/information/payment` is titled "1xBet Minimum Deposit & Withdrawal in India – Rules, Time, Limit" but says "Select a payment system to top up your account" | Payment report §D: no local min/max constants, no cached values; values come with the freshly loaded backend page | **Strong match** (absence of local values) |
| Network: `GET /bff-api/config/group/get?groups=...&lang=...`; shared JS contains `getBalanceFromAccountApi` with `isUseXAuth:!0` for `/account-api/user/balance`; `/account-api/office/user-config` | APK config fetch (`configuration/v2/config/{bundle}/{whence}/{version}`) and `X-Auth` bearer + `GetUserBalance` | **Concept match** — same architecture (config service + authenticated balance API), different endpoint naming for web vs mobile |
| Network: `POST /fatman-api/<id>/ab.json`; JS constants `fatmanAbToRechargeA`, `fatmanAbToRechargeB`, `fatmanAbToRechargeC`, `fatmanAbHideNavOnReg`; APK `assets/init.json` contains `fatman_uuid` | Payment report §D.4 listed **A/B experimentation behind the recharge page** as an unverified hypothesis; APK's `fatman_uuid` and encrypted redirect payloads | **Strengthens the hypothesis** (now Strongly Supported that an A/B framework exists on the recharge surface), but still does **not** prove it changes the minimum amount |
| Shared JS route table: `onpay/success`, `onpay/fail`, `onpay/withdraw/success`; APK matches URL substrings `/onpay/success\|fail\|pending\|cancel` and `/onpay/withdraw/*` | Payment report §B: callback handling by URL path matching | **Exact match** — same callback URL vocabulary on web and app |
| JS contains `TP_PLAYER_DEMO:"game-player-demo"` and a `FreeSpinsModal` component | APK demo/test section, free-spin UI, and cosmetic/demo game modes | **Match** — demo play and free-spin UI exist on both platforms |
| JS betting model returns `{min_sum, win_sum}` for stake/coefficient handling | Betting report: stake bounds and win amounts come from server data; coefficient inputs use `BigDecimal` client-side | **Concept match** (web has client-side min/win display fields; APK has server `minBet/maxBet`) |
| Promotions visible: "ILT20 FREE BET GIVEAWAY", "CRYPTO FREEBET — 30% cashback", bonus rules pages | APK promotion/bonus/free-bet modules (`bonus_games`, `makebet_promocodes`, `promotions`) | **Match** |
| Cloudflare fronting, region-specific domain `indian.1xbet.com`, first load rewrote to `?v=2`; APK has encrypted domain checker and rotating hosts | Anti-blocking / resilient domain infrastructure | **Consistent**, though the website alone does not prove the APK's live host rotation |

## 2. Differences / non-matches (important to state honestly)

1. **Different API naming on web vs mobile.** The site uses `/bff-api/*`, `/account-api/*`, `/analytics-module-api/v1/analytics`, `/fatman-api/*`; the APK uses paths like `Account/v1/Mb/GetUserBalance`, `configuration/v2/config/...`, `MobileLiveBetX/MobileMakeBet`. This is expected for separate clients, but it means static endpoint names cannot be mapped 1:1. The *concepts* (config, balance, analytics, A/B, callbacks) match.
2. **No endpoint strings from the APK appeared in the two main web JS bundles.** Searches for `MobileMakeBet`, `GetRecommendedGames`, `configuration/v2/config`, `paysystems`, `xbet://` returned no hits in the fetched entry/shared bundles. They may live in lazy-loaded chunks not inspected. This is a bounded negative search, not proof of absence.
3. **Game pages render empty in static HTML.** `/en/games`, `/en/games/spin-and-win`, `/en/games/crystal` returned only the site shell; game content is loaded later into iframes/canvas. I did not click "Play", so no demo/free-trial behaviour could be observed. The website therefore **does not answer** the "is trial math the same as real math?" question.
4. **Withdrawal page (`/en/office/deduce`) rendered no min/max fields in static HTML** while logged in; it likely needs client-side JS interaction. I did not interact with withdrawal controls. No amount limits were observed.

## 3. Effect on the earlier conclusions

- **No change** to the betting, free-spin, or security findings — the website adds no evidence about server-side RNG, callback signature verification, or client TLS behaviour.
- **Strengthened:** payment architecture (backend-rendered provider page), existence of A/B experimentation around the recharge flow, and the shared `onpay/*` callback convention.
- **Still Unverified:** the specific driver of changing minimum deposit/withdrawal amounts; whether trial and real game outcomes use the same probability tables; whether any spin type is biased toward losing. These require the authorized test-account/device step.

## 4. What the device step would add (proposed, not performed)

1. Capture the APK's actual domain-checker response and remote-config decryption key (`KeysImpl.getNativeConfigKey`) at runtime.
2. Capture two authenticated `/paysystems/deposit` loads and diff responses plus A/B/cohort headers — this would convert the A/B hypothesis into a finding or kill it.
3. Record a small set of demo/trial and real spin responses on a **test account with no real money**, and compare the returned prize distributions.
4. Demonstrate or refute the WebView URL/deep-link weaknesses on the device.
