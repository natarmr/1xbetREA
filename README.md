# 1xBet Android APK — reverse-engineering archive

This repository is a self-contained record of a **static analysis of the shipped `1xbet.apk`**. It holds the written reports, the raw extracted evidence, and the decompiled application — but deliberately **not** the analyst's personal files, device screenshots, network captures, or private keys.

**Target:** `org.xbet.client1`, version `1xbet-prod-v260.1.0` (build `26001000`)
**SHA-256:** `d0ae8e422e47b480c20fa170c5ff85e67ee6074a1ac106ce0f75890cb8a3133d`
**Analysis date:** 2026-11-24

> **Method:** static analysis only. The APK was never executed on a device or emulator, no production network calls were made, and no real bets, deposits or withdrawals were performed. Findings about live backend behaviour are explicitly marked as hypotheses rather than proven facts.

---

## What is kept where

| Path | What it is | Scale |
|---|---|---|
| `reports/` | The written investigation — start here | 15 files, ~0.7 MB |
| `decompiled/sources/` | Full JADX decompilation of the app's Java/Kotlin source | 69,001 files, ~256 MB |
| `apktool_out/` | apktool decode: manifest, resources, assets and smali bytecode | 78,497 files, ~721 MB |
| `_tools/` | Extraction scripts and the logs they produced | 10 files |
| `.gitignore` | Rules that keep personal and sensitive artifacts out of the repo | 1 file |

Together that is **147,524 files, about 978 MB uncompressed** (roughly 263 MB in Git's compressed object store).

### The reports (`reports/`)

- **`FINAL_REPORT.md`** — the complete 35-section write-up, with the executive summary, architecture, betting flow, payment behaviour, recommendation engine, free spins, security assessment, and final conclusions. This is the best single entry point.
- **`00_investigation_ledger.md`** — target identity, tooling provenance, confirmed observations, owner checklist and limitations.
- **`00_synthesis.md`** — cross-cutting synthesis of the individual investigations.
- **`01_architecture_network.md`** — architecture, networking, authentication, API surface and remote-config decryption.
- **`02_betting_system.md`** — the betting lifecycle from event selection to bet placement.
- **`03_payments_limits.md`** — payment architecture, browser-based payments, discrepancies and changing deposit/withdrawal limits.
- **`04_recommendations_freespins.md`** — recommendation carousels and free-spin/promo mechanics.
- **`05_security_storage.md`** — storage, native key material and runtime feasibility.
- **`06_website_crosscheck.md`** — cross-check against the public website.
- **`07_behavioural_data.md`** — telemetry, personalisation and downstream data forwarding.
- **`08_device_runtime.md`**, **`09_mitm_runtime.md`**, **`10_native_keys.md`** — passive device observations, the MITM attempt, and offline native key extraction / remote-config decryption.

### Raw evidence inside `reports/`

- **`remote_config_decrypted_main.txt`** — the ~34 KB bundled remote config, decrypted offline after recovering the AES-256 key and IV from native code.
- **`_endpoints_raw.txt`** — 611 extracted API endpoints, kept raw rather than summarised.

### Tooling and extraction artefacts (`_tools/`)

Only the reproducible, non-sensitive pieces are archived: `analyze_native.py`, `decrypt_config.py`, `dump_native.py`, `log_flows.py`, `resolve_native.py`, `assemble_report.ps1`, `apktool.bat`, `all_urls.txt` (master URL extract), plus `apktool.log` and `jadx.log`.

The work was produced with JADX 1.5.7 (full decompilation), apktool 3.0.3 (resource decode), and REA 6.7.0 with `jadx-headless-mcp 0.7.1` for call-graph-backed analysis.

---

## What is intentionally *not* here

The `.gitignore` records these exclusions so they cannot be committed by accident:

- **The APK itself** (`1xbet.apk`) and a duplicate top-level `FINAL_REPORT.md`.
- **Device screenshots** — `_tools/screens*` and `reports/device_*.png`. These were captured on a personal device and are not evidence.
- **MITM captures** (`cap*.mitm`) and **certificates / private keys** (`certs/`, `newca/`, `mitm*.crt`, `signer_*.der`).
- **Tool binaries, archives, SDK folders** (JARs, ZIPs, `bin/`, `lib/`, `platform-tools/`, `pt35/`, `__pycache__/`) and the tool README/licence files.
- `decompiled/resources/` — the decoded resources are already preserved under `apktool_out/`.

---

## Practical notes

- **Confidence language:** the reports use **Confirmed** (proven by shipped code/config), **Strongly Supported**, **Probable**, and **Unverified** (needs backend or runtime evidence). Please keep that distinction in mind when quoting findings.
- **History:** the 147k files are split across 44 commits. A single large push repeatedly timed out, so the archive was uploaded in small batches; the final tree is identical to the original single archive snapshot.
- **Windows quirk:** six files whose names are reserved DOS device names (`aux.java`, `con.java`, `nul.java`, `prn.java`, `lpt0.java`, `lpt0.smali`) always appear as "modified" to Git for Windows. Their committed contents were verified byte-for-byte by SHA-1 against the on-disk files; the working copies are correct. These names cannot be checked out normally on Windows, but are valid on other platforms.
- **Author identity:** commits use a generic local identity (`Investigation Archive <archive@localhost>`) so no personal email is embedded in the history.
