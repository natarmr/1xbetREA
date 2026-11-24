package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import org.xplatform.onexdatabase.OnexDatabase_Impl;

/* JADX INFO: loaded from: classes5.dex */
public final class ke70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnexDatabase_Impl f18140a;

    public ke70(OnexDatabase_Impl onexDatabase_Impl) {
        this.f18140a = onexDatabase_Impl;
    }

    public static Unit a(qpg0 qpg0Var) {
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `bet_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `game_id` INTEGER NOT NULL, `main_game_id` INTEGER NOT NULL DEFAULT 0, `player_id` INTEGER NOT NULL, `sport_id` INTEGER NOT NULL, `player_name` TEXT NOT NULL, `game_match_name` TEXT NOT NULL, `first_opponent_first_img` TEXT NOT NULL, `first_opponent_second_img` TEXT NOT NULL, `second_opponent_first_img` TEXT NOT NULL, `second_opponent_second_img` TEXT NOT NULL, `group_name` TEXT NOT NULL, `champ_name` TEXT NOT NULL, `express_number` INTEGER NOT NULL, `coefficient` TEXT NOT NULL, `param` REAL NOT NULL, `time_start` INTEGER NOT NULL DEFAULT 0, `vid` TEXT NOT NULL DEFAULT '', `full_name` TEXT NOT NULL DEFAULT '', `name` TEXT NOT NULL, `kind` INTEGER NOT NULL, `type` INTEGER NOT NULL, `players_duel_game` TEXT NOT NULL DEFAULT '', `coupon_entry_feature_id` INTEGER NOT NULL DEFAULT 0, `first_opponent_name` TEXT NOT NULL DEFAULT '', `second_opponent_name` TEXT NOT NULL DEFAULT '', `opponents_full_name` TEXT NOT NULL DEFAULT '', `tournament_stage` TEXT NOT NULL DEFAULT '', `teams_number` INTEGER NOT NULL DEFAULT 0, `game_type` TEXT NOT NULL DEFAULT '', `game_vid` TEXT NOT NULL DEFAULT '', `group_id` INTEGER NOT NULL DEFAULT 0, `option_lower_cf` REAL NOT NULL DEFAULT 0, `option_lower_cf_view` TEXT NOT NULL DEFAULT '', `coupon_type_vid` INTEGER NOT NULL DEFAULT 0, `builder_game_type` INTEGER NOT NULL DEFAULT 0, `builder_game_vid` INTEGER NOT NULL DEFAULT 0, `builder_period` INTEGER NOT NULL DEFAULT 0, `builder_coef_available` INTEGER NOT NULL DEFAULT 0)");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `currencies` (`id` INTEGER NOT NULL, `code` TEXT NOT NULL, `name` TEXT NOT NULL, `top` INTEGER NOT NULL, `ruble_to_currency_rate` REAL NOT NULL, `symbol` TEXT NOT NULL, `min_out_deposit` REAL NOT NULL, `min_out_deposit_electron` REAL NOT NULL, `min_sum_bets` REAL NOT NULL, `round` INTEGER NOT NULL, `registration_hidden` INTEGER NOT NULL, `crypto` INTEGER NOT NULL, `initialBet` REAL NOT NULL, `betStep` REAL NOT NULL, PRIMARY KEY(`id`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `sports` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `team` TEXT NOT NULL, `short_name` TEXT NOT NULL, `cyber` INTEGER NOT NULL, `background` TEXT NOT NULL, `image_small` TEXT NOT NULL, `image_popular` TEXT NOT NULL, `background_tablet` TEXT NOT NULL, `background_champ_default` TEXT NOT NULL, `background_champ_tablet_default` TEXT NOT NULL, `background_champ_header_default` TEXT NOT NULL, `background_champ_header_tablet_default` TEXT NOT NULL, `game_background` TEXT NOT NULL, `sub_sports` TEXT NOT NULL, `image_champ_small` TEXT NOT NULL, `feed_image_vertical` TEXT NOT NULL, `feed_image_horizontal` TEXT NOT NULL, `feed_image_square` TEXT NOT NULL, `discipline_icon_3d` TEXT NOT NULL, `esports_event_focus_discipline_header` TEXT NOT NULL, `esports_header_focus_discipline_header` TEXT NOT NULL, `default_opponent_header` TEXT NOT NULL, `default_opponent_header_tablet` TEXT NOT NULL, PRIMARY KEY(`id`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `type_param` INTEGER NOT NULL, `special_type` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `event_groups` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `position` INTEGER NOT NULL, `count_cols` INTEGER NOT NULL, `has_auto_sub` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `favorite_champs` (`id` INTEGER NOT NULL, `is_live` INTEGER NOT NULL, `screen_type` TEXT NOT NULL, `primary_key` TEXT NOT NULL, PRIMARY KEY(`primary_key`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `strings` (`locale` TEXT NOT NULL, `key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`key`, `locale`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `last_action` (`id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `date` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `country` (`id` INTEGER NOT NULL, `country_name` TEXT NOT NULL, `country_phone_code` INTEGER NOT NULL, `country_code` TEXT NOT NULL, `country_currency_id` INTEGER NOT NULL, `country_image` TEXT NOT NULL, `phone_mask_max_length` INTEGER NOT NULL DEFAULT 0, `phone_mask_min_length` INTEGER NOT NULL DEFAULT 0, `phone_mask` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`id`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `market_filter` (`id` INTEGER NOT NULL, `hidden` INTEGER NOT NULL, `pinned_position` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `statistic_dictionaries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` INTEGER NOT NULL, `itemId` INTEGER NOT NULL, `title` TEXT NOT NULL)");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `registration` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `registration_type_id` INTEGER NOT NULL, `field_name` TEXT NOT NULL, `is_required` INTEGER NOT NULL, `is_hidden` INTEGER NOT NULL, `min_age` TEXT)");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `quick_bet_settings_table` (`balanceId` INTEGER NOT NULL, `firstValue` REAL NOT NULL, `secondValue` REAL NOT NULL, `thirdValue` REAL NOT NULL, PRIMARY KEY(`balanceId`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `news_catalog_banners` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `news_catalog_cms_banners` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        n2x.x(qpg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9c0f7c853a4da42d379e451bd4efb125')");
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0c8f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0c98  */
    /* JADX WARN: Code duplicated, block: B:106:0x0cb2  */
    /* JADX WARN: Code duplicated, block: B:109:0x0d3b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0d44  */
    /* JADX WARN: Code duplicated, block: B:114:0x0d5e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0e17  */
    /* JADX WARN: Code duplicated, block: B:120:0x0e20  */
    /* JADX WARN: Code duplicated, block: B:122:0x0e3a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0ecb  */
    /* JADX WARN: Code duplicated, block: B:128:0x0ed4  */
    /* JADX WARN: Code duplicated, block: B:130:0x0eee  */
    /* JADX WARN: Code duplicated, block: B:133:0x0f3f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0f48  */
    /* JADX WARN: Code duplicated, block: B:138:0x0f62  */
    /* JADX WARN: Code duplicated, block: B:141:0x0fb5  */
    /* JADX WARN: Code duplicated, block: B:144:0x0fbe  */
    /* JADX WARN: Code duplicated, block: B:146:0x0fd8  */
    /* JADX WARN: Code duplicated, block: B:32:0x0424  */
    /* JADX WARN: Code duplicated, block: B:34:0x043e  */
    /* JADX WARN: Code duplicated, block: B:37:0x058a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0594  */
    /* JADX WARN: Code duplicated, block: B:42:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x07da  */
    /* JADX WARN: Code duplicated, block: B:50:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x086e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0877  */
    /* JADX WARN: Code duplicated, block: B:58:0x0891  */
    /* JADX WARN: Code duplicated, block: B:61:0x0925  */
    /* JADX WARN: Code duplicated, block: B:64:0x092e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0948  */
    /* JADX WARN: Code duplicated, block: B:69:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0a5f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:85:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:90:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:93:0x0bf9  */
    /* JADX WARN: Code duplicated, block: B:96:0x0c02  */
    /* JADX WARN: Code duplicated, block: B:98:0x0c1c  */
    /* JADX WARN: Instruction removed from duplicated block: B:104:0x0c98, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:112:0x0d44, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:120:0x0e20, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x0ed4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:136:0x0f48, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:144:0x0fbe, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0424, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x0594, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x07da, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0877, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x092e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x09cf, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x0a5f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0aef, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x0c02, please report this as an issue */
    public final Object b(qpg0 qpg0Var, zje zjeVar) {
        je70 je70Var;
        zjo0 zjo0Var;
        zjo0 zjo0Var2;
        zjo0 zjo0Var3;
        qpg0 qpg0Var2;
        zjo0 zjo0Var4;
        zjo0 zjo0Var5;
        zjo0 zjo0Var6;
        zjo0 zjo0Var7;
        zjo0 zjo0Var8;
        zjo0 zjo0Var9;
        zjo0 zjo0Var10;
        zjo0 zjo0Var11;
        zjo0 zjo0Var12;
        zjo0 zjo0Var13;
        zjo0 zjo0Var14;
        zjo0 zjo0Var15;
        zjo0 zjo0Var16;
        zjo0 zjo0Var17;
        zjo0 zjo0Var18;
        zjo0 zjo0Var19;
        zjo0 zjo0Var20;
        zjo0 zjo0Var21;
        zjo0 zjo0Var22;
        zjo0 zjo0Var23;
        zjo0 zjo0Var24;
        zjo0 zjo0Var25;
        zjo0 zjo0Var26;
        zjo0 zjo0Var27;
        zjo0 zjo0Var28;
        zjo0 zjo0Var29;
        zjo0 zjo0Var30;
        zjo0 zjo0Var31;
        zjo0 zjo0Var32;
        zjo0 zjo0Var33;
        zjo0 zjo0Var34;
        zjo0 zjo0Var35;
        zjo0 zjo0Var36;
        zjo0 zjo0Var37;
        zjo0 zjo0Var38;
        zjo0 zjo0Var39;
        zjo0 zjo0Var40;
        zjo0 zjo0Var41;
        zjo0 zjo0Var42;
        zjo0 zjo0Var43;
        zjo0 zjo0Var44;
        qpg0 qpg0Var3 = qpg0Var;
        if (zjeVar instanceof je70) {
            je70Var = (je70) zjeVar;
            int i = je70Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                je70Var.A = i - Integer.MIN_VALUE;
            } else {
                je70Var = new je70(this, zjeVar);
            }
        } else {
            je70Var = new je70(this, zjeVar);
        }
        Object objG = je70Var.y;
        wne wneVar = wne.f39444a;
        switch (je70Var.A) {
            case 0:
                z1x.P(objG);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                linkedHashMap.put("game_id", new tjo0(0, 1, "game_id", "INTEGER", null, true));
                linkedHashMap.put("main_game_id", new tjo0(0, 1, "main_game_id", "INTEGER", "0", true));
                linkedHashMap.put("player_id", new tjo0(0, 1, "player_id", "INTEGER", null, true));
                linkedHashMap.put("sport_id", new tjo0(0, 1, "sport_id", "INTEGER", null, true));
                linkedHashMap.put("player_name", new tjo0(0, 1, "player_name", "TEXT", null, true));
                linkedHashMap.put("game_match_name", new tjo0(0, 1, "game_match_name", "TEXT", null, true));
                linkedHashMap.put("first_opponent_first_img", new tjo0(0, 1, "first_opponent_first_img", "TEXT", null, true));
                linkedHashMap.put("first_opponent_second_img", new tjo0(0, 1, "first_opponent_second_img", "TEXT", null, true));
                linkedHashMap.put("second_opponent_first_img", new tjo0(0, 1, "second_opponent_first_img", "TEXT", null, true));
                linkedHashMap.put("second_opponent_second_img", new tjo0(0, 1, "second_opponent_second_img", "TEXT", null, true));
                linkedHashMap.put("group_name", new tjo0(0, 1, "group_name", "TEXT", null, true));
                linkedHashMap.put("champ_name", new tjo0(0, 1, "champ_name", "TEXT", null, true));
                linkedHashMap.put("express_number", new tjo0(0, 1, "express_number", "INTEGER", null, true));
                linkedHashMap.put("coefficient", new tjo0(0, 1, "coefficient", "TEXT", null, true));
                linkedHashMap.put(RemoteMessageConst.MessageBody.PARAM, new tjo0(0, 1, RemoteMessageConst.MessageBody.PARAM, "REAL", null, true));
                linkedHashMap.put("time_start", new tjo0(0, 1, "time_start", "INTEGER", "0", true));
                linkedHashMap.put("vid", new tjo0(0, 1, "vid", "TEXT", "''", true));
                linkedHashMap.put("full_name", new tjo0(0, 1, "full_name", "TEXT", "''", true));
                linkedHashMap.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                linkedHashMap.put("kind", new tjo0(0, 1, "kind", "INTEGER", null, true));
                linkedHashMap.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                linkedHashMap.put("players_duel_game", new tjo0(0, 1, "players_duel_game", "TEXT", "''", true));
                linkedHashMap.put("coupon_entry_feature_id", new tjo0(0, 1, "coupon_entry_feature_id", "INTEGER", "0", true));
                linkedHashMap.put("first_opponent_name", new tjo0(0, 1, "first_opponent_name", "TEXT", "''", true));
                linkedHashMap.put("second_opponent_name", new tjo0(0, 1, "second_opponent_name", "TEXT", "''", true));
                linkedHashMap.put("opponents_full_name", new tjo0(0, 1, "opponents_full_name", "TEXT", "''", true));
                linkedHashMap.put("tournament_stage", new tjo0(0, 1, "tournament_stage", "TEXT", "''", true));
                linkedHashMap.put("teams_number", new tjo0(0, 1, "teams_number", "INTEGER", "0", true));
                linkedHashMap.put("game_type", new tjo0(0, 1, "game_type", "TEXT", "''", true));
                linkedHashMap.put("game_vid", new tjo0(0, 1, "game_vid", "TEXT", "''", true));
                linkedHashMap.put("group_id", new tjo0(0, 1, "group_id", "INTEGER", "0", true));
                linkedHashMap.put("option_lower_cf", new tjo0(0, 1, "option_lower_cf", "REAL", "0", true));
                linkedHashMap.put("option_lower_cf_view", new tjo0(0, 1, "option_lower_cf_view", "TEXT", "''", true));
                linkedHashMap.put("coupon_type_vid", new tjo0(0, 1, "coupon_type_vid", "INTEGER", "0", true));
                linkedHashMap.put("builder_game_type", new tjo0(0, 1, "builder_game_type", "INTEGER", "0", true));
                linkedHashMap.put("builder_game_vid", new tjo0(0, 1, "builder_game_vid", "INTEGER", "0", true));
                linkedHashMap.put("builder_period", new tjo0(0, 1, "builder_period", "INTEGER", "0", true));
                linkedHashMap.put("builder_coef_available", new tjo0(0, 1, "builder_coef_available", "INTEGER", "0", true));
                zjo0Var = new zjo0("bet_events", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var3;
                je70Var.j = zjo0Var;
                je70Var.A = 1;
                objG = c9x.G(qpg0Var3, "bet_events", je70Var);
                if (objG != wneVar) {
                    zjo0Var2 = (zjo0) objG;
                    if (!zjo0Var.equals(zjo0Var2)) {
                        return new eeg0("bet_events(org.xplatform.onexdatabase.entity.BetEventEntity).\n Expected:\n" + zjo0Var + "\n Found:\n" + zjo0Var2, false);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                    linkedHashMap2.put("code", new tjo0(0, 1, "code", "TEXT", null, true));
                    linkedHashMap2.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                    linkedHashMap2.put("top", new tjo0(0, 1, "top", "INTEGER", null, true));
                    linkedHashMap2.put("ruble_to_currency_rate", new tjo0(0, 1, "ruble_to_currency_rate", "REAL", null, true));
                    linkedHashMap2.put("symbol", new tjo0(0, 1, "symbol", "TEXT", null, true));
                    linkedHashMap2.put("min_out_deposit", new tjo0(0, 1, "min_out_deposit", "REAL", null, true));
                    linkedHashMap2.put("min_out_deposit_electron", new tjo0(0, 1, "min_out_deposit_electron", "REAL", null, true));
                    linkedHashMap2.put("min_sum_bets", new tjo0(0, 1, "min_sum_bets", "REAL", null, true));
                    linkedHashMap2.put("round", new tjo0(0, 1, "round", "INTEGER", null, true));
                    linkedHashMap2.put("registration_hidden", new tjo0(0, 1, "registration_hidden", "INTEGER", null, true));
                    linkedHashMap2.put("crypto", new tjo0(0, 1, "crypto", "INTEGER", null, true));
                    linkedHashMap2.put("initialBet", new tjo0(0, 1, "initialBet", "REAL", null, true));
                    linkedHashMap2.put("betStep", new tjo0(0, 1, "betStep", "REAL", null, true));
                    zjo0Var3 = new zjo0("currencies", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var3;
                    je70Var.j = null;
                    je70Var.k = zjo0Var3;
                    je70Var.A = 2;
                    objG = c9x.G(qpg0Var3, "currencies", je70Var);
                    if (objG != wneVar) {
                        qpg0Var2 = qpg0Var3;
                        zjo0Var4 = zjo0Var3;
                        zjo0Var5 = (zjo0) objG;
                        if (!zjo0Var4.equals(zjo0Var5)) {
                            return new eeg0("currencies(org.xplatform.onexdatabase.entity.CurrencyEntity).\n Expected:\n" + zjo0Var4 + "\n Found:\n" + zjo0Var5, false);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                        linkedHashMap3.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                        linkedHashMap3.put("team", new tjo0(0, 1, "team", "TEXT", null, true));
                        linkedHashMap3.put("short_name", new tjo0(0, 1, "short_name", "TEXT", null, true));
                        linkedHashMap3.put("cyber", new tjo0(0, 1, "cyber", "INTEGER", null, true));
                        linkedHashMap3.put("background", new tjo0(0, 1, "background", "TEXT", null, true));
                        linkedHashMap3.put("image_small", new tjo0(0, 1, "image_small", "TEXT", null, true));
                        linkedHashMap3.put("image_popular", new tjo0(0, 1, "image_popular", "TEXT", null, true));
                        linkedHashMap3.put("background_tablet", new tjo0(0, 1, "background_tablet", "TEXT", null, true));
                        linkedHashMap3.put("background_champ_default", new tjo0(0, 1, "background_champ_default", "TEXT", null, true));
                        linkedHashMap3.put("background_champ_tablet_default", new tjo0(0, 1, "background_champ_tablet_default", "TEXT", null, true));
                        linkedHashMap3.put("background_champ_header_default", new tjo0(0, 1, "background_champ_header_default", "TEXT", null, true));
                        linkedHashMap3.put("background_champ_header_tablet_default", new tjo0(0, 1, "background_champ_header_tablet_default", "TEXT", null, true));
                        linkedHashMap3.put("game_background", new tjo0(0, 1, "game_background", "TEXT", null, true));
                        linkedHashMap3.put("sub_sports", new tjo0(0, 1, "sub_sports", "TEXT", null, true));
                        linkedHashMap3.put("image_champ_small", new tjo0(0, 1, "image_champ_small", "TEXT", null, true));
                        linkedHashMap3.put("feed_image_vertical", new tjo0(0, 1, "feed_image_vertical", "TEXT", null, true));
                        linkedHashMap3.put("feed_image_horizontal", new tjo0(0, 1, "feed_image_horizontal", "TEXT", null, true));
                        linkedHashMap3.put("feed_image_square", new tjo0(0, 1, "feed_image_square", "TEXT", null, true));
                        linkedHashMap3.put("discipline_icon_3d", new tjo0(0, 1, "discipline_icon_3d", "TEXT", null, true));
                        linkedHashMap3.put("esports_event_focus_discipline_header", new tjo0(0, 1, "esports_event_focus_discipline_header", "TEXT", null, true));
                        linkedHashMap3.put("esports_header_focus_discipline_header", new tjo0(0, 1, "esports_header_focus_discipline_header", "TEXT", null, true));
                        linkedHashMap3.put("default_opponent_header", new tjo0(0, 1, "default_opponent_header", "TEXT", null, true));
                        linkedHashMap3.put("default_opponent_header_tablet", new tjo0(0, 1, "default_opponent_header_tablet", "TEXT", null, true));
                        zjo0Var6 = new zjo0("sports", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = qpg0Var2;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = zjo0Var6;
                        je70Var.A = 3;
                        objG = c9x.G(qpg0Var2, "sports", je70Var);
                        if (objG != wneVar) {
                            zjo0Var7 = zjo0Var6;
                            zjo0Var8 = (zjo0) objG;
                            if (!zjo0Var7.equals(zjo0Var8)) {
                                return new eeg0("sports(org.xplatform.onexdatabase.entity.SportEntity).\n Expected:\n" + zjo0Var7 + "\n Found:\n" + zjo0Var8, false);
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            linkedHashMap4.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                            linkedHashMap4.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                            linkedHashMap4.put("type_param", new tjo0(0, 1, "type_param", "INTEGER", null, true));
                            linkedHashMap4.put("special_type", new tjo0(0, 1, "special_type", "INTEGER", null, true));
                            zjo0Var9 = new zjo0("events", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                            je70Var.i = qpg0Var2;
                            je70Var.j = null;
                            je70Var.k = null;
                            je70Var.l = null;
                            je70Var.m = zjo0Var9;
                            je70Var.A = 4;
                            objG = c9x.G(qpg0Var2, "events", je70Var);
                            if (objG != wneVar) {
                                zjo0Var10 = zjo0Var9;
                                zjo0Var11 = (zjo0) objG;
                                if (!zjo0Var10.equals(zjo0Var11)) {
                                    return new eeg0("events(org.xplatform.onexdatabase.entity.EventDbModel).\n Expected:\n" + zjo0Var10 + "\n Found:\n" + zjo0Var11, false);
                                }
                                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                linkedHashMap5.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                linkedHashMap5.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                                linkedHashMap5.put("position", new tjo0(0, 1, "position", "INTEGER", null, true));
                                linkedHashMap5.put("count_cols", new tjo0(0, 1, "count_cols", "INTEGER", null, true));
                                linkedHashMap5.put("has_auto_sub", new tjo0(0, 1, "has_auto_sub", "INTEGER", null, true));
                                zjo0Var12 = new zjo0("event_groups", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
                                je70Var.i = qpg0Var2;
                                je70Var.j = null;
                                je70Var.k = null;
                                je70Var.l = null;
                                je70Var.m = null;
                                je70Var.n = zjo0Var12;
                                je70Var.A = 5;
                                objG = c9x.G(qpg0Var2, "event_groups", je70Var);
                                if (objG != wneVar) {
                                    zjo0Var13 = zjo0Var12;
                                    zjo0Var14 = (zjo0) objG;
                                    if (!zjo0Var13.equals(zjo0Var14)) {
                                        return new eeg0("event_groups(org.xplatform.onexdatabase.entity.EventGroupDbModel).\n Expected:\n" + zjo0Var13 + "\n Found:\n" + zjo0Var14, false);
                                    }
                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                    linkedHashMap6.put(ParameterNames.ID, new tjo0(0, 1, ParameterNames.ID, "INTEGER", null, true));
                                    linkedHashMap6.put("is_live", new tjo0(0, 1, "is_live", "INTEGER", null, true));
                                    linkedHashMap6.put("screen_type", new tjo0(0, 1, "screen_type", "TEXT", null, true));
                                    linkedHashMap6.put("primary_key", new tjo0(1, 1, "primary_key", "TEXT", null, true));
                                    zjo0Var15 = new zjo0("favorite_champs", linkedHashMap6, new LinkedHashSet(), new LinkedHashSet());
                                    je70Var.i = qpg0Var2;
                                    je70Var.j = null;
                                    je70Var.k = null;
                                    je70Var.l = null;
                                    je70Var.m = null;
                                    je70Var.n = null;
                                    je70Var.o = zjo0Var15;
                                    je70Var.A = 6;
                                    objG = c9x.G(qpg0Var2, "favorite_champs", je70Var);
                                    if (objG != wneVar) {
                                        zjo0Var16 = zjo0Var15;
                                        zjo0Var17 = (zjo0) objG;
                                        if (!zjo0Var16.equals(zjo0Var17)) {
                                            return new eeg0("favorite_champs(org.xplatform.onexdatabase.entity.FavoriteChamp).\n Expected:\n" + zjo0Var16 + "\n Found:\n" + zjo0Var17, false);
                                        }
                                        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                        linkedHashMap7.put("locale", new tjo0(2, 1, "locale", "TEXT", null, true));
                                        linkedHashMap7.put("key", new tjo0(1, 1, "key", "TEXT", null, true));
                                        linkedHashMap7.put("value", new tjo0(0, 1, "value", "TEXT", null, true));
                                        zjo0Var18 = new zjo0("strings", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
                                        je70Var.i = qpg0Var2;
                                        je70Var.j = null;
                                        je70Var.k = null;
                                        je70Var.l = null;
                                        je70Var.m = null;
                                        je70Var.n = null;
                                        je70Var.o = null;
                                        je70Var.p = zjo0Var18;
                                        je70Var.A = 7;
                                        objG = c9x.G(qpg0Var2, "strings", je70Var);
                                        if (objG != wneVar) {
                                            zjo0Var19 = zjo0Var18;
                                            zjo0Var20 = (zjo0) objG;
                                            if (!zjo0Var19.equals(zjo0Var20)) {
                                                return new eeg0("strings(org.xplatform.onexdatabase.entity.AppString).\n Expected:\n" + zjo0Var19 + "\n Found:\n" + zjo0Var20, false);
                                            }
                                            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                                            linkedHashMap8.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                            linkedHashMap8.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                                            linkedHashMap8.put("date", new tjo0(0, 1, "date", "INTEGER", null, true));
                                            zjo0Var21 = new zjo0("last_action", linkedHashMap8, new LinkedHashSet(), new LinkedHashSet());
                                            je70Var.i = qpg0Var2;
                                            je70Var.j = null;
                                            je70Var.k = null;
                                            je70Var.l = null;
                                            je70Var.m = null;
                                            je70Var.n = null;
                                            je70Var.o = null;
                                            je70Var.p = null;
                                            je70Var.q = zjo0Var21;
                                            je70Var.A = 8;
                                            objG = c9x.G(qpg0Var2, "last_action", je70Var);
                                            if (objG != wneVar) {
                                                zjo0Var22 = zjo0Var21;
                                                zjo0Var23 = (zjo0) objG;
                                                if (!zjo0Var22.equals(zjo0Var23)) {
                                                    return new eeg0("last_action(org.xplatform.onexdatabase.entity.LastAction).\n Expected:\n" + zjo0Var22 + "\n Found:\n" + zjo0Var23, false);
                                                }
                                                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                                                linkedHashMap9.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                linkedHashMap9.put("country_name", new tjo0(0, 1, "country_name", "TEXT", null, true));
                                                linkedHashMap9.put("country_phone_code", new tjo0(0, 1, "country_phone_code", "INTEGER", null, true));
                                                linkedHashMap9.put("country_code", new tjo0(0, 1, "country_code", "TEXT", null, true));
                                                linkedHashMap9.put("country_currency_id", new tjo0(0, 1, "country_currency_id", "INTEGER", null, true));
                                                linkedHashMap9.put("country_image", new tjo0(0, 1, "country_image", "TEXT", null, true));
                                                linkedHashMap9.put("phone_mask_max_length", new tjo0(0, 1, "phone_mask_max_length", "INTEGER", "0", true));
                                                linkedHashMap9.put("phone_mask_min_length", new tjo0(0, 1, "phone_mask_min_length", "INTEGER", "0", true));
                                                linkedHashMap9.put("phone_mask", new tjo0(0, 1, "phone_mask", "TEXT", "''", true));
                                                zjo0Var24 = new zjo0("country", linkedHashMap9, new LinkedHashSet(), new LinkedHashSet());
                                                je70Var.i = qpg0Var2;
                                                je70Var.j = null;
                                                je70Var.k = null;
                                                je70Var.l = null;
                                                je70Var.m = null;
                                                je70Var.n = null;
                                                je70Var.o = null;
                                                je70Var.p = null;
                                                je70Var.q = null;
                                                je70Var.r = zjo0Var24;
                                                je70Var.A = 9;
                                                objG = c9x.G(qpg0Var2, "country", je70Var);
                                                if (objG != wneVar) {
                                                    zjo0Var25 = zjo0Var24;
                                                    zjo0Var26 = (zjo0) objG;
                                                    if (!zjo0Var25.equals(zjo0Var26)) {
                                                        return new eeg0("country(org.xplatform.onexdatabase.entity.CountryEntity).\n Expected:\n" + zjo0Var25 + "\n Found:\n" + zjo0Var26, false);
                                                    }
                                                    LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                                                    linkedHashMap10.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                    linkedHashMap10.put(ParameterNames.HIDDEN, new tjo0(0, 1, ParameterNames.HIDDEN, "INTEGER", null, true));
                                                    linkedHashMap10.put("pinned_position", new tjo0(0, 1, "pinned_position", "INTEGER", null, true));
                                                    zjo0Var27 = new zjo0("market_filter", linkedHashMap10, new LinkedHashSet(), new LinkedHashSet());
                                                    je70Var.i = qpg0Var2;
                                                    je70Var.j = null;
                                                    je70Var.k = null;
                                                    je70Var.l = null;
                                                    je70Var.m = null;
                                                    je70Var.n = null;
                                                    je70Var.o = null;
                                                    je70Var.p = null;
                                                    je70Var.q = null;
                                                    je70Var.r = null;
                                                    je70Var.s = zjo0Var27;
                                                    je70Var.A = 10;
                                                    objG = c9x.G(qpg0Var2, "market_filter", je70Var);
                                                    if (objG != wneVar) {
                                                        zjo0Var28 = zjo0Var27;
                                                        zjo0Var29 = (zjo0) objG;
                                                        if (!zjo0Var28.equals(zjo0Var29)) {
                                                            return new eeg0("market_filter(org.xplatform.onexdatabase.entity.MarketFilterEntity).\n Expected:\n" + zjo0Var28 + "\n Found:\n" + zjo0Var29, false);
                                                        }
                                                        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                                                        linkedHashMap11.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                        linkedHashMap11.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                                                        linkedHashMap11.put("itemId", new tjo0(0, 1, "itemId", "INTEGER", null, true));
                                                        linkedHashMap11.put("title", new tjo0(0, 1, "title", "TEXT", null, true));
                                                        zjo0Var30 = new zjo0("statistic_dictionaries", linkedHashMap11, new LinkedHashSet(), new LinkedHashSet());
                                                        je70Var.i = qpg0Var2;
                                                        je70Var.j = null;
                                                        je70Var.k = null;
                                                        je70Var.l = null;
                                                        je70Var.m = null;
                                                        je70Var.n = null;
                                                        je70Var.o = null;
                                                        je70Var.p = null;
                                                        je70Var.q = null;
                                                        je70Var.r = null;
                                                        je70Var.s = null;
                                                        je70Var.t = zjo0Var30;
                                                        je70Var.A = 11;
                                                        objG = c9x.G(qpg0Var2, "statistic_dictionaries", je70Var);
                                                        if (objG != wneVar) {
                                                            zjo0Var31 = zjo0Var30;
                                                            zjo0Var32 = (zjo0) objG;
                                                            if (!zjo0Var31.equals(zjo0Var32)) {
                                                                return new eeg0("statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n" + zjo0Var31 + "\n Found:\n" + zjo0Var32, false);
                                                            }
                                                            LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                                                            linkedHashMap12.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                            linkedHashMap12.put("registration_type_id", new tjo0(0, 1, "registration_type_id", "INTEGER", null, true));
                                                            linkedHashMap12.put("field_name", new tjo0(0, 1, "field_name", "TEXT", null, true));
                                                            linkedHashMap12.put("is_required", new tjo0(0, 1, "is_required", "INTEGER", null, true));
                                                            linkedHashMap12.put("is_hidden", new tjo0(0, 1, "is_hidden", "INTEGER", null, true));
                                                            linkedHashMap12.put("min_age", new tjo0(0, 1, "min_age", "TEXT", null, false));
                                                            zjo0Var33 = new zjo0("registration", linkedHashMap12, new LinkedHashSet(), new LinkedHashSet());
                                                            je70Var.i = qpg0Var2;
                                                            je70Var.j = null;
                                                            je70Var.k = null;
                                                            je70Var.l = null;
                                                            je70Var.m = null;
                                                            je70Var.n = null;
                                                            je70Var.o = null;
                                                            je70Var.p = null;
                                                            je70Var.q = null;
                                                            je70Var.r = null;
                                                            je70Var.s = null;
                                                            je70Var.t = null;
                                                            je70Var.u = zjo0Var33;
                                                            je70Var.A = 12;
                                                            objG = c9x.G(qpg0Var2, "registration", je70Var);
                                                            if (objG != wneVar) {
                                                                zjo0Var34 = zjo0Var33;
                                                                zjo0Var35 = (zjo0) objG;
                                                                if (!zjo0Var34.equals(zjo0Var35)) {
                                                                    return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                                                                }
                                                                LinkedHashMap linkedHashMap13 = new LinkedHashMap();
                                                                linkedHashMap13.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                                                                linkedHashMap13.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                                                                linkedHashMap13.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                                                                linkedHashMap13.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                                                                zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap13, new LinkedHashSet(), new LinkedHashSet());
                                                                je70Var.i = qpg0Var2;
                                                                je70Var.j = null;
                                                                je70Var.k = null;
                                                                je70Var.l = null;
                                                                je70Var.m = null;
                                                                je70Var.n = null;
                                                                je70Var.o = null;
                                                                je70Var.p = null;
                                                                je70Var.q = null;
                                                                je70Var.r = null;
                                                                je70Var.s = null;
                                                                je70Var.t = null;
                                                                je70Var.u = null;
                                                                je70Var.v = zjo0Var36;
                                                                je70Var.A = 13;
                                                                objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                                                                if (objG != wneVar) {
                                                                    zjo0Var37 = zjo0Var36;
                                                                    zjo0Var38 = (zjo0) objG;
                                                                    if (!zjo0Var37.equals(zjo0Var38)) {
                                                                        return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                                                                    }
                                                                    LinkedHashMap linkedHashMap14 = new LinkedHashMap();
                                                                    linkedHashMap14.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                                    zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap14, new LinkedHashSet(), new LinkedHashSet());
                                                                    je70Var.i = qpg0Var2;
                                                                    je70Var.j = null;
                                                                    je70Var.k = null;
                                                                    je70Var.l = null;
                                                                    je70Var.m = null;
                                                                    je70Var.n = null;
                                                                    je70Var.o = null;
                                                                    je70Var.p = null;
                                                                    je70Var.q = null;
                                                                    je70Var.r = null;
                                                                    je70Var.s = null;
                                                                    je70Var.t = null;
                                                                    je70Var.u = null;
                                                                    je70Var.v = null;
                                                                    je70Var.w = zjo0Var39;
                                                                    je70Var.A = 14;
                                                                    objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                                                                    if (objG != wneVar) {
                                                                        zjo0Var40 = zjo0Var39;
                                                                        zjo0Var41 = (zjo0) objG;
                                                                        if (!zjo0Var40.equals(zjo0Var41)) {
                                                                            return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                                                                        }
                                                                        LinkedHashMap linkedHashMap15 = new LinkedHashMap();
                                                                        linkedHashMap15.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                                        zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap15, new LinkedHashSet(), new LinkedHashSet());
                                                                        je70Var.i = null;
                                                                        je70Var.j = null;
                                                                        je70Var.k = null;
                                                                        je70Var.l = null;
                                                                        je70Var.m = null;
                                                                        je70Var.n = null;
                                                                        je70Var.o = null;
                                                                        je70Var.p = null;
                                                                        je70Var.q = null;
                                                                        je70Var.r = null;
                                                                        je70Var.s = null;
                                                                        je70Var.t = null;
                                                                        je70Var.u = null;
                                                                        je70Var.v = null;
                                                                        je70Var.w = null;
                                                                        je70Var.x = zjo0Var42;
                                                                        je70Var.A = 15;
                                                                        objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                                                                        if (objG != wneVar) {
                                                                            zjo0Var43 = zjo0Var42;
                                                                            zjo0Var44 = (zjo0) objG;
                                                                            if (!zjo0Var43.equals(zjo0Var44)) {
                                                                                return new eeg0(null, true);
                                                                            }
                                                                            return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 1:
                zjo0 zjo0Var45 = je70Var.j;
                qpg0 qpg0Var4 = je70Var.i;
                z1x.P(objG);
                zjo0Var = zjo0Var45;
                qpg0Var3 = qpg0Var4;
                zjo0Var2 = (zjo0) objG;
                if (!zjo0Var.equals(zjo0Var2)) {
                    return new eeg0("bet_events(org.xplatform.onexdatabase.entity.BetEventEntity).\n Expected:\n" + zjo0Var + "\n Found:\n" + zjo0Var2, false);
                }
                LinkedHashMap linkedHashMap16 = new LinkedHashMap();
                linkedHashMap16.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                linkedHashMap16.put("code", new tjo0(0, 1, "code", "TEXT", null, true));
                linkedHashMap16.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                linkedHashMap16.put("top", new tjo0(0, 1, "top", "INTEGER", null, true));
                linkedHashMap16.put("ruble_to_currency_rate", new tjo0(0, 1, "ruble_to_currency_rate", "REAL", null, true));
                linkedHashMap16.put("symbol", new tjo0(0, 1, "symbol", "TEXT", null, true));
                linkedHashMap16.put("min_out_deposit", new tjo0(0, 1, "min_out_deposit", "REAL", null, true));
                linkedHashMap16.put("min_out_deposit_electron", new tjo0(0, 1, "min_out_deposit_electron", "REAL", null, true));
                linkedHashMap16.put("min_sum_bets", new tjo0(0, 1, "min_sum_bets", "REAL", null, true));
                linkedHashMap16.put("round", new tjo0(0, 1, "round", "INTEGER", null, true));
                linkedHashMap16.put("registration_hidden", new tjo0(0, 1, "registration_hidden", "INTEGER", null, true));
                linkedHashMap16.put("crypto", new tjo0(0, 1, "crypto", "INTEGER", null, true));
                linkedHashMap16.put("initialBet", new tjo0(0, 1, "initialBet", "REAL", null, true));
                linkedHashMap16.put("betStep", new tjo0(0, 1, "betStep", "REAL", null, true));
                zjo0Var3 = new zjo0("currencies", linkedHashMap16, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var3;
                je70Var.j = null;
                je70Var.k = zjo0Var3;
                je70Var.A = 2;
                objG = c9x.G(qpg0Var3, "currencies", je70Var);
                if (objG != wneVar) {
                    qpg0Var2 = qpg0Var3;
                    zjo0Var4 = zjo0Var3;
                    zjo0Var5 = (zjo0) objG;
                    if (!zjo0Var4.equals(zjo0Var5)) {
                        return new eeg0("currencies(org.xplatform.onexdatabase.entity.CurrencyEntity).\n Expected:\n" + zjo0Var4 + "\n Found:\n" + zjo0Var5, false);
                    }
                    LinkedHashMap linkedHashMap17 = new LinkedHashMap();
                    linkedHashMap17.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                    linkedHashMap17.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                    linkedHashMap17.put("team", new tjo0(0, 1, "team", "TEXT", null, true));
                    linkedHashMap17.put("short_name", new tjo0(0, 1, "short_name", "TEXT", null, true));
                    linkedHashMap17.put("cyber", new tjo0(0, 1, "cyber", "INTEGER", null, true));
                    linkedHashMap17.put("background", new tjo0(0, 1, "background", "TEXT", null, true));
                    linkedHashMap17.put("image_small", new tjo0(0, 1, "image_small", "TEXT", null, true));
                    linkedHashMap17.put("image_popular", new tjo0(0, 1, "image_popular", "TEXT", null, true));
                    linkedHashMap17.put("background_tablet", new tjo0(0, 1, "background_tablet", "TEXT", null, true));
                    linkedHashMap17.put("background_champ_default", new tjo0(0, 1, "background_champ_default", "TEXT", null, true));
                    linkedHashMap17.put("background_champ_tablet_default", new tjo0(0, 1, "background_champ_tablet_default", "TEXT", null, true));
                    linkedHashMap17.put("background_champ_header_default", new tjo0(0, 1, "background_champ_header_default", "TEXT", null, true));
                    linkedHashMap17.put("background_champ_header_tablet_default", new tjo0(0, 1, "background_champ_header_tablet_default", "TEXT", null, true));
                    linkedHashMap17.put("game_background", new tjo0(0, 1, "game_background", "TEXT", null, true));
                    linkedHashMap17.put("sub_sports", new tjo0(0, 1, "sub_sports", "TEXT", null, true));
                    linkedHashMap17.put("image_champ_small", new tjo0(0, 1, "image_champ_small", "TEXT", null, true));
                    linkedHashMap17.put("feed_image_vertical", new tjo0(0, 1, "feed_image_vertical", "TEXT", null, true));
                    linkedHashMap17.put("feed_image_horizontal", new tjo0(0, 1, "feed_image_horizontal", "TEXT", null, true));
                    linkedHashMap17.put("feed_image_square", new tjo0(0, 1, "feed_image_square", "TEXT", null, true));
                    linkedHashMap17.put("discipline_icon_3d", new tjo0(0, 1, "discipline_icon_3d", "TEXT", null, true));
                    linkedHashMap17.put("esports_event_focus_discipline_header", new tjo0(0, 1, "esports_event_focus_discipline_header", "TEXT", null, true));
                    linkedHashMap17.put("esports_header_focus_discipline_header", new tjo0(0, 1, "esports_header_focus_discipline_header", "TEXT", null, true));
                    linkedHashMap17.put("default_opponent_header", new tjo0(0, 1, "default_opponent_header", "TEXT", null, true));
                    linkedHashMap17.put("default_opponent_header_tablet", new tjo0(0, 1, "default_opponent_header_tablet", "TEXT", null, true));
                    zjo0Var6 = new zjo0("sports", linkedHashMap17, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var2;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = zjo0Var6;
                    je70Var.A = 3;
                    objG = c9x.G(qpg0Var2, "sports", je70Var);
                    if (objG != wneVar) {
                        zjo0Var7 = zjo0Var6;
                        zjo0Var8 = (zjo0) objG;
                        if (!zjo0Var7.equals(zjo0Var8)) {
                            return new eeg0("sports(org.xplatform.onexdatabase.entity.SportEntity).\n Expected:\n" + zjo0Var7 + "\n Found:\n" + zjo0Var8, false);
                        }
                        LinkedHashMap linkedHashMap18 = new LinkedHashMap();
                        linkedHashMap18.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                        linkedHashMap18.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                        linkedHashMap18.put("type_param", new tjo0(0, 1, "type_param", "INTEGER", null, true));
                        linkedHashMap18.put("special_type", new tjo0(0, 1, "special_type", "INTEGER", null, true));
                        zjo0Var9 = new zjo0("events", linkedHashMap18, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = qpg0Var2;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = null;
                        je70Var.m = zjo0Var9;
                        je70Var.A = 4;
                        objG = c9x.G(qpg0Var2, "events", je70Var);
                        if (objG != wneVar) {
                            zjo0Var10 = zjo0Var9;
                            zjo0Var11 = (zjo0) objG;
                            if (!zjo0Var10.equals(zjo0Var11)) {
                                return new eeg0("events(org.xplatform.onexdatabase.entity.EventDbModel).\n Expected:\n" + zjo0Var10 + "\n Found:\n" + zjo0Var11, false);
                            }
                            LinkedHashMap linkedHashMap19 = new LinkedHashMap();
                            linkedHashMap19.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                            linkedHashMap19.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                            linkedHashMap19.put("position", new tjo0(0, 1, "position", "INTEGER", null, true));
                            linkedHashMap19.put("count_cols", new tjo0(0, 1, "count_cols", "INTEGER", null, true));
                            linkedHashMap19.put("has_auto_sub", new tjo0(0, 1, "has_auto_sub", "INTEGER", null, true));
                            zjo0Var12 = new zjo0("event_groups", linkedHashMap19, new LinkedHashSet(), new LinkedHashSet());
                            je70Var.i = qpg0Var2;
                            je70Var.j = null;
                            je70Var.k = null;
                            je70Var.l = null;
                            je70Var.m = null;
                            je70Var.n = zjo0Var12;
                            je70Var.A = 5;
                            objG = c9x.G(qpg0Var2, "event_groups", je70Var);
                            if (objG != wneVar) {
                                zjo0Var13 = zjo0Var12;
                                zjo0Var14 = (zjo0) objG;
                                if (!zjo0Var13.equals(zjo0Var14)) {
                                    return new eeg0("event_groups(org.xplatform.onexdatabase.entity.EventGroupDbModel).\n Expected:\n" + zjo0Var13 + "\n Found:\n" + zjo0Var14, false);
                                }
                                LinkedHashMap linkedHashMap20 = new LinkedHashMap();
                                linkedHashMap20.put(ParameterNames.ID, new tjo0(0, 1, ParameterNames.ID, "INTEGER", null, true));
                                linkedHashMap20.put("is_live", new tjo0(0, 1, "is_live", "INTEGER", null, true));
                                linkedHashMap20.put("screen_type", new tjo0(0, 1, "screen_type", "TEXT", null, true));
                                linkedHashMap20.put("primary_key", new tjo0(1, 1, "primary_key", "TEXT", null, true));
                                zjo0Var15 = new zjo0("favorite_champs", linkedHashMap20, new LinkedHashSet(), new LinkedHashSet());
                                je70Var.i = qpg0Var2;
                                je70Var.j = null;
                                je70Var.k = null;
                                je70Var.l = null;
                                je70Var.m = null;
                                je70Var.n = null;
                                je70Var.o = zjo0Var15;
                                je70Var.A = 6;
                                objG = c9x.G(qpg0Var2, "favorite_champs", je70Var);
                                if (objG != wneVar) {
                                    zjo0Var16 = zjo0Var15;
                                    zjo0Var17 = (zjo0) objG;
                                    if (!zjo0Var16.equals(zjo0Var17)) {
                                        return new eeg0("favorite_champs(org.xplatform.onexdatabase.entity.FavoriteChamp).\n Expected:\n" + zjo0Var16 + "\n Found:\n" + zjo0Var17, false);
                                    }
                                    LinkedHashMap linkedHashMap21 = new LinkedHashMap();
                                    linkedHashMap21.put("locale", new tjo0(2, 1, "locale", "TEXT", null, true));
                                    linkedHashMap21.put("key", new tjo0(1, 1, "key", "TEXT", null, true));
                                    linkedHashMap21.put("value", new tjo0(0, 1, "value", "TEXT", null, true));
                                    zjo0Var18 = new zjo0("strings", linkedHashMap21, new LinkedHashSet(), new LinkedHashSet());
                                    je70Var.i = qpg0Var2;
                                    je70Var.j = null;
                                    je70Var.k = null;
                                    je70Var.l = null;
                                    je70Var.m = null;
                                    je70Var.n = null;
                                    je70Var.o = null;
                                    je70Var.p = zjo0Var18;
                                    je70Var.A = 7;
                                    objG = c9x.G(qpg0Var2, "strings", je70Var);
                                    if (objG != wneVar) {
                                        zjo0Var19 = zjo0Var18;
                                        zjo0Var20 = (zjo0) objG;
                                        if (!zjo0Var19.equals(zjo0Var20)) {
                                            return new eeg0("strings(org.xplatform.onexdatabase.entity.AppString).\n Expected:\n" + zjo0Var19 + "\n Found:\n" + zjo0Var20, false);
                                        }
                                        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                                        linkedHashMap22.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                        linkedHashMap22.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                                        linkedHashMap22.put("date", new tjo0(0, 1, "date", "INTEGER", null, true));
                                        zjo0Var21 = new zjo0("last_action", linkedHashMap22, new LinkedHashSet(), new LinkedHashSet());
                                        je70Var.i = qpg0Var2;
                                        je70Var.j = null;
                                        je70Var.k = null;
                                        je70Var.l = null;
                                        je70Var.m = null;
                                        je70Var.n = null;
                                        je70Var.o = null;
                                        je70Var.p = null;
                                        je70Var.q = zjo0Var21;
                                        je70Var.A = 8;
                                        objG = c9x.G(qpg0Var2, "last_action", je70Var);
                                        if (objG != wneVar) {
                                            zjo0Var22 = zjo0Var21;
                                            zjo0Var23 = (zjo0) objG;
                                            if (!zjo0Var22.equals(zjo0Var23)) {
                                                return new eeg0("last_action(org.xplatform.onexdatabase.entity.LastAction).\n Expected:\n" + zjo0Var22 + "\n Found:\n" + zjo0Var23, false);
                                            }
                                            LinkedHashMap linkedHashMap23 = new LinkedHashMap();
                                            linkedHashMap23.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                            linkedHashMap23.put("country_name", new tjo0(0, 1, "country_name", "TEXT", null, true));
                                            linkedHashMap23.put("country_phone_code", new tjo0(0, 1, "country_phone_code", "INTEGER", null, true));
                                            linkedHashMap23.put("country_code", new tjo0(0, 1, "country_code", "TEXT", null, true));
                                            linkedHashMap23.put("country_currency_id", new tjo0(0, 1, "country_currency_id", "INTEGER", null, true));
                                            linkedHashMap23.put("country_image", new tjo0(0, 1, "country_image", "TEXT", null, true));
                                            linkedHashMap23.put("phone_mask_max_length", new tjo0(0, 1, "phone_mask_max_length", "INTEGER", "0", true));
                                            linkedHashMap23.put("phone_mask_min_length", new tjo0(0, 1, "phone_mask_min_length", "INTEGER", "0", true));
                                            linkedHashMap23.put("phone_mask", new tjo0(0, 1, "phone_mask", "TEXT", "''", true));
                                            zjo0Var24 = new zjo0("country", linkedHashMap23, new LinkedHashSet(), new LinkedHashSet());
                                            je70Var.i = qpg0Var2;
                                            je70Var.j = null;
                                            je70Var.k = null;
                                            je70Var.l = null;
                                            je70Var.m = null;
                                            je70Var.n = null;
                                            je70Var.o = null;
                                            je70Var.p = null;
                                            je70Var.q = null;
                                            je70Var.r = zjo0Var24;
                                            je70Var.A = 9;
                                            objG = c9x.G(qpg0Var2, "country", je70Var);
                                            if (objG != wneVar) {
                                                zjo0Var25 = zjo0Var24;
                                                zjo0Var26 = (zjo0) objG;
                                                if (!zjo0Var25.equals(zjo0Var26)) {
                                                    return new eeg0("country(org.xplatform.onexdatabase.entity.CountryEntity).\n Expected:\n" + zjo0Var25 + "\n Found:\n" + zjo0Var26, false);
                                                }
                                                LinkedHashMap linkedHashMap110 = new LinkedHashMap();
                                                linkedHashMap110.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                linkedHashMap110.put(ParameterNames.HIDDEN, new tjo0(0, 1, ParameterNames.HIDDEN, "INTEGER", null, true));
                                                linkedHashMap110.put("pinned_position", new tjo0(0, 1, "pinned_position", "INTEGER", null, true));
                                                zjo0Var27 = new zjo0("market_filter", linkedHashMap110, new LinkedHashSet(), new LinkedHashSet());
                                                je70Var.i = qpg0Var2;
                                                je70Var.j = null;
                                                je70Var.k = null;
                                                je70Var.l = null;
                                                je70Var.m = null;
                                                je70Var.n = null;
                                                je70Var.o = null;
                                                je70Var.p = null;
                                                je70Var.q = null;
                                                je70Var.r = null;
                                                je70Var.s = zjo0Var27;
                                                je70Var.A = 10;
                                                objG = c9x.G(qpg0Var2, "market_filter", je70Var);
                                                if (objG != wneVar) {
                                                    zjo0Var28 = zjo0Var27;
                                                    zjo0Var29 = (zjo0) objG;
                                                    if (!zjo0Var28.equals(zjo0Var29)) {
                                                        return new eeg0("market_filter(org.xplatform.onexdatabase.entity.MarketFilterEntity).\n Expected:\n" + zjo0Var28 + "\n Found:\n" + zjo0Var29, false);
                                                    }
                                                    LinkedHashMap linkedHashMap111 = new LinkedHashMap();
                                                    linkedHashMap111.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                    linkedHashMap111.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                                                    linkedHashMap111.put("itemId", new tjo0(0, 1, "itemId", "INTEGER", null, true));
                                                    linkedHashMap111.put("title", new tjo0(0, 1, "title", "TEXT", null, true));
                                                    zjo0Var30 = new zjo0("statistic_dictionaries", linkedHashMap111, new LinkedHashSet(), new LinkedHashSet());
                                                    je70Var.i = qpg0Var2;
                                                    je70Var.j = null;
                                                    je70Var.k = null;
                                                    je70Var.l = null;
                                                    je70Var.m = null;
                                                    je70Var.n = null;
                                                    je70Var.o = null;
                                                    je70Var.p = null;
                                                    je70Var.q = null;
                                                    je70Var.r = null;
                                                    je70Var.s = null;
                                                    je70Var.t = zjo0Var30;
                                                    je70Var.A = 11;
                                                    objG = c9x.G(qpg0Var2, "statistic_dictionaries", je70Var);
                                                    if (objG != wneVar) {
                                                        zjo0Var31 = zjo0Var30;
                                                        zjo0Var32 = (zjo0) objG;
                                                        if (!zjo0Var31.equals(zjo0Var32)) {
                                                            return new eeg0("statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n" + zjo0Var31 + "\n Found:\n" + zjo0Var32, false);
                                                        }
                                                        LinkedHashMap linkedHashMap112 = new LinkedHashMap();
                                                        linkedHashMap112.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                        linkedHashMap112.put("registration_type_id", new tjo0(0, 1, "registration_type_id", "INTEGER", null, true));
                                                        linkedHashMap112.put("field_name", new tjo0(0, 1, "field_name", "TEXT", null, true));
                                                        linkedHashMap112.put("is_required", new tjo0(0, 1, "is_required", "INTEGER", null, true));
                                                        linkedHashMap112.put("is_hidden", new tjo0(0, 1, "is_hidden", "INTEGER", null, true));
                                                        linkedHashMap112.put("min_age", new tjo0(0, 1, "min_age", "TEXT", null, false));
                                                        zjo0Var33 = new zjo0("registration", linkedHashMap112, new LinkedHashSet(), new LinkedHashSet());
                                                        je70Var.i = qpg0Var2;
                                                        je70Var.j = null;
                                                        je70Var.k = null;
                                                        je70Var.l = null;
                                                        je70Var.m = null;
                                                        je70Var.n = null;
                                                        je70Var.o = null;
                                                        je70Var.p = null;
                                                        je70Var.q = null;
                                                        je70Var.r = null;
                                                        je70Var.s = null;
                                                        je70Var.t = null;
                                                        je70Var.u = zjo0Var33;
                                                        je70Var.A = 12;
                                                        objG = c9x.G(qpg0Var2, "registration", je70Var);
                                                        if (objG != wneVar) {
                                                            zjo0Var34 = zjo0Var33;
                                                            zjo0Var35 = (zjo0) objG;
                                                            if (!zjo0Var34.equals(zjo0Var35)) {
                                                                return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                                                            }
                                                            LinkedHashMap linkedHashMap113 = new LinkedHashMap();
                                                            linkedHashMap113.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                                                            linkedHashMap113.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                                                            linkedHashMap113.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                                                            linkedHashMap113.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                                                            zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap113, new LinkedHashSet(), new LinkedHashSet());
                                                            je70Var.i = qpg0Var2;
                                                            je70Var.j = null;
                                                            je70Var.k = null;
                                                            je70Var.l = null;
                                                            je70Var.m = null;
                                                            je70Var.n = null;
                                                            je70Var.o = null;
                                                            je70Var.p = null;
                                                            je70Var.q = null;
                                                            je70Var.r = null;
                                                            je70Var.s = null;
                                                            je70Var.t = null;
                                                            je70Var.u = null;
                                                            je70Var.v = zjo0Var36;
                                                            je70Var.A = 13;
                                                            objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                                                            if (objG != wneVar) {
                                                                zjo0Var37 = zjo0Var36;
                                                                zjo0Var38 = (zjo0) objG;
                                                                if (!zjo0Var37.equals(zjo0Var38)) {
                                                                    return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                                                                }
                                                                LinkedHashMap linkedHashMap114 = new LinkedHashMap();
                                                                linkedHashMap114.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                                zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap114, new LinkedHashSet(), new LinkedHashSet());
                                                                je70Var.i = qpg0Var2;
                                                                je70Var.j = null;
                                                                je70Var.k = null;
                                                                je70Var.l = null;
                                                                je70Var.m = null;
                                                                je70Var.n = null;
                                                                je70Var.o = null;
                                                                je70Var.p = null;
                                                                je70Var.q = null;
                                                                je70Var.r = null;
                                                                je70Var.s = null;
                                                                je70Var.t = null;
                                                                je70Var.u = null;
                                                                je70Var.v = null;
                                                                je70Var.w = zjo0Var39;
                                                                je70Var.A = 14;
                                                                objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                                                                if (objG != wneVar) {
                                                                    zjo0Var40 = zjo0Var39;
                                                                    zjo0Var41 = (zjo0) objG;
                                                                    if (!zjo0Var40.equals(zjo0Var41)) {
                                                                        return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                                                                    }
                                                                    LinkedHashMap linkedHashMap115 = new LinkedHashMap();
                                                                    linkedHashMap115.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                                    zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap115, new LinkedHashSet(), new LinkedHashSet());
                                                                    je70Var.i = null;
                                                                    je70Var.j = null;
                                                                    je70Var.k = null;
                                                                    je70Var.l = null;
                                                                    je70Var.m = null;
                                                                    je70Var.n = null;
                                                                    je70Var.o = null;
                                                                    je70Var.p = null;
                                                                    je70Var.q = null;
                                                                    je70Var.r = null;
                                                                    je70Var.s = null;
                                                                    je70Var.t = null;
                                                                    je70Var.u = null;
                                                                    je70Var.v = null;
                                                                    je70Var.w = null;
                                                                    je70Var.x = zjo0Var42;
                                                                    je70Var.A = 15;
                                                                    objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                                                                    if (objG != wneVar) {
                                                                        zjo0Var43 = zjo0Var42;
                                                                        zjo0Var44 = (zjo0) objG;
                                                                        if (!zjo0Var43.equals(zjo0Var44)) {
                                                                            return new eeg0(null, true);
                                                                        }
                                                                        return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 2:
                zjo0Var4 = je70Var.k;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var5 = (zjo0) objG;
                if (!zjo0Var4.equals(zjo0Var5)) {
                    return new eeg0("currencies(org.xplatform.onexdatabase.entity.CurrencyEntity).\n Expected:\n" + zjo0Var4 + "\n Found:\n" + zjo0Var5, false);
                }
                LinkedHashMap linkedHashMap116 = new LinkedHashMap();
                linkedHashMap116.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                linkedHashMap116.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                linkedHashMap116.put("team", new tjo0(0, 1, "team", "TEXT", null, true));
                linkedHashMap116.put("short_name", new tjo0(0, 1, "short_name", "TEXT", null, true));
                linkedHashMap116.put("cyber", new tjo0(0, 1, "cyber", "INTEGER", null, true));
                linkedHashMap116.put("background", new tjo0(0, 1, "background", "TEXT", null, true));
                linkedHashMap116.put("image_small", new tjo0(0, 1, "image_small", "TEXT", null, true));
                linkedHashMap116.put("image_popular", new tjo0(0, 1, "image_popular", "TEXT", null, true));
                linkedHashMap116.put("background_tablet", new tjo0(0, 1, "background_tablet", "TEXT", null, true));
                linkedHashMap116.put("background_champ_default", new tjo0(0, 1, "background_champ_default", "TEXT", null, true));
                linkedHashMap116.put("background_champ_tablet_default", new tjo0(0, 1, "background_champ_tablet_default", "TEXT", null, true));
                linkedHashMap116.put("background_champ_header_default", new tjo0(0, 1, "background_champ_header_default", "TEXT", null, true));
                linkedHashMap116.put("background_champ_header_tablet_default", new tjo0(0, 1, "background_champ_header_tablet_default", "TEXT", null, true));
                linkedHashMap116.put("game_background", new tjo0(0, 1, "game_background", "TEXT", null, true));
                linkedHashMap116.put("sub_sports", new tjo0(0, 1, "sub_sports", "TEXT", null, true));
                linkedHashMap116.put("image_champ_small", new tjo0(0, 1, "image_champ_small", "TEXT", null, true));
                linkedHashMap116.put("feed_image_vertical", new tjo0(0, 1, "feed_image_vertical", "TEXT", null, true));
                linkedHashMap116.put("feed_image_horizontal", new tjo0(0, 1, "feed_image_horizontal", "TEXT", null, true));
                linkedHashMap116.put("feed_image_square", new tjo0(0, 1, "feed_image_square", "TEXT", null, true));
                linkedHashMap116.put("discipline_icon_3d", new tjo0(0, 1, "discipline_icon_3d", "TEXT", null, true));
                linkedHashMap116.put("esports_event_focus_discipline_header", new tjo0(0, 1, "esports_event_focus_discipline_header", "TEXT", null, true));
                linkedHashMap116.put("esports_header_focus_discipline_header", new tjo0(0, 1, "esports_header_focus_discipline_header", "TEXT", null, true));
                linkedHashMap116.put("default_opponent_header", new tjo0(0, 1, "default_opponent_header", "TEXT", null, true));
                linkedHashMap116.put("default_opponent_header_tablet", new tjo0(0, 1, "default_opponent_header_tablet", "TEXT", null, true));
                zjo0Var6 = new zjo0("sports", linkedHashMap116, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var2;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = zjo0Var6;
                je70Var.A = 3;
                objG = c9x.G(qpg0Var2, "sports", je70Var);
                if (objG != wneVar) {
                    zjo0Var7 = zjo0Var6;
                    zjo0Var8 = (zjo0) objG;
                    if (!zjo0Var7.equals(zjo0Var8)) {
                        return new eeg0("sports(org.xplatform.onexdatabase.entity.SportEntity).\n Expected:\n" + zjo0Var7 + "\n Found:\n" + zjo0Var8, false);
                    }
                    LinkedHashMap linkedHashMap117 = new LinkedHashMap();
                    linkedHashMap117.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                    linkedHashMap117.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                    linkedHashMap117.put("type_param", new tjo0(0, 1, "type_param", "INTEGER", null, true));
                    linkedHashMap117.put("special_type", new tjo0(0, 1, "special_type", "INTEGER", null, true));
                    zjo0Var9 = new zjo0("events", linkedHashMap117, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var2;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = null;
                    je70Var.m = zjo0Var9;
                    je70Var.A = 4;
                    objG = c9x.G(qpg0Var2, "events", je70Var);
                    if (objG != wneVar) {
                        zjo0Var10 = zjo0Var9;
                        zjo0Var11 = (zjo0) objG;
                        if (!zjo0Var10.equals(zjo0Var11)) {
                            return new eeg0("events(org.xplatform.onexdatabase.entity.EventDbModel).\n Expected:\n" + zjo0Var10 + "\n Found:\n" + zjo0Var11, false);
                        }
                        LinkedHashMap linkedHashMap118 = new LinkedHashMap();
                        linkedHashMap118.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                        linkedHashMap118.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                        linkedHashMap118.put("position", new tjo0(0, 1, "position", "INTEGER", null, true));
                        linkedHashMap118.put("count_cols", new tjo0(0, 1, "count_cols", "INTEGER", null, true));
                        linkedHashMap118.put("has_auto_sub", new tjo0(0, 1, "has_auto_sub", "INTEGER", null, true));
                        zjo0Var12 = new zjo0("event_groups", linkedHashMap118, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = qpg0Var2;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = null;
                        je70Var.m = null;
                        je70Var.n = zjo0Var12;
                        je70Var.A = 5;
                        objG = c9x.G(qpg0Var2, "event_groups", je70Var);
                        if (objG != wneVar) {
                            zjo0Var13 = zjo0Var12;
                            zjo0Var14 = (zjo0) objG;
                            if (!zjo0Var13.equals(zjo0Var14)) {
                                return new eeg0("event_groups(org.xplatform.onexdatabase.entity.EventGroupDbModel).\n Expected:\n" + zjo0Var13 + "\n Found:\n" + zjo0Var14, false);
                            }
                            LinkedHashMap linkedHashMap24 = new LinkedHashMap();
                            linkedHashMap24.put(ParameterNames.ID, new tjo0(0, 1, ParameterNames.ID, "INTEGER", null, true));
                            linkedHashMap24.put("is_live", new tjo0(0, 1, "is_live", "INTEGER", null, true));
                            linkedHashMap24.put("screen_type", new tjo0(0, 1, "screen_type", "TEXT", null, true));
                            linkedHashMap24.put("primary_key", new tjo0(1, 1, "primary_key", "TEXT", null, true));
                            zjo0Var15 = new zjo0("favorite_champs", linkedHashMap24, new LinkedHashSet(), new LinkedHashSet());
                            je70Var.i = qpg0Var2;
                            je70Var.j = null;
                            je70Var.k = null;
                            je70Var.l = null;
                            je70Var.m = null;
                            je70Var.n = null;
                            je70Var.o = zjo0Var15;
                            je70Var.A = 6;
                            objG = c9x.G(qpg0Var2, "favorite_champs", je70Var);
                            if (objG != wneVar) {
                                zjo0Var16 = zjo0Var15;
                                zjo0Var17 = (zjo0) objG;
                                if (!zjo0Var16.equals(zjo0Var17)) {
                                    return new eeg0("favorite_champs(org.xplatform.onexdatabase.entity.FavoriteChamp).\n Expected:\n" + zjo0Var16 + "\n Found:\n" + zjo0Var17, false);
                                }
                                LinkedHashMap linkedHashMap25 = new LinkedHashMap();
                                linkedHashMap25.put("locale", new tjo0(2, 1, "locale", "TEXT", null, true));
                                linkedHashMap25.put("key", new tjo0(1, 1, "key", "TEXT", null, true));
                                linkedHashMap25.put("value", new tjo0(0, 1, "value", "TEXT", null, true));
                                zjo0Var18 = new zjo0("strings", linkedHashMap25, new LinkedHashSet(), new LinkedHashSet());
                                je70Var.i = qpg0Var2;
                                je70Var.j = null;
                                je70Var.k = null;
                                je70Var.l = null;
                                je70Var.m = null;
                                je70Var.n = null;
                                je70Var.o = null;
                                je70Var.p = zjo0Var18;
                                je70Var.A = 7;
                                objG = c9x.G(qpg0Var2, "strings", je70Var);
                                if (objG != wneVar) {
                                    zjo0Var19 = zjo0Var18;
                                    zjo0Var20 = (zjo0) objG;
                                    if (!zjo0Var19.equals(zjo0Var20)) {
                                        return new eeg0("strings(org.xplatform.onexdatabase.entity.AppString).\n Expected:\n" + zjo0Var19 + "\n Found:\n" + zjo0Var20, false);
                                    }
                                    LinkedHashMap linkedHashMap26 = new LinkedHashMap();
                                    linkedHashMap26.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                    linkedHashMap26.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                                    linkedHashMap26.put("date", new tjo0(0, 1, "date", "INTEGER", null, true));
                                    zjo0Var21 = new zjo0("last_action", linkedHashMap26, new LinkedHashSet(), new LinkedHashSet());
                                    je70Var.i = qpg0Var2;
                                    je70Var.j = null;
                                    je70Var.k = null;
                                    je70Var.l = null;
                                    je70Var.m = null;
                                    je70Var.n = null;
                                    je70Var.o = null;
                                    je70Var.p = null;
                                    je70Var.q = zjo0Var21;
                                    je70Var.A = 8;
                                    objG = c9x.G(qpg0Var2, "last_action", je70Var);
                                    if (objG != wneVar) {
                                        zjo0Var22 = zjo0Var21;
                                        zjo0Var23 = (zjo0) objG;
                                        if (!zjo0Var22.equals(zjo0Var23)) {
                                            return new eeg0("last_action(org.xplatform.onexdatabase.entity.LastAction).\n Expected:\n" + zjo0Var22 + "\n Found:\n" + zjo0Var23, false);
                                        }
                                        LinkedHashMap linkedHashMap27 = new LinkedHashMap();
                                        linkedHashMap27.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                        linkedHashMap27.put("country_name", new tjo0(0, 1, "country_name", "TEXT", null, true));
                                        linkedHashMap27.put("country_phone_code", new tjo0(0, 1, "country_phone_code", "INTEGER", null, true));
                                        linkedHashMap27.put("country_code", new tjo0(0, 1, "country_code", "TEXT", null, true));
                                        linkedHashMap27.put("country_currency_id", new tjo0(0, 1, "country_currency_id", "INTEGER", null, true));
                                        linkedHashMap27.put("country_image", new tjo0(0, 1, "country_image", "TEXT", null, true));
                                        linkedHashMap27.put("phone_mask_max_length", new tjo0(0, 1, "phone_mask_max_length", "INTEGER", "0", true));
                                        linkedHashMap27.put("phone_mask_min_length", new tjo0(0, 1, "phone_mask_min_length", "INTEGER", "0", true));
                                        linkedHashMap27.put("phone_mask", new tjo0(0, 1, "phone_mask", "TEXT", "''", true));
                                        zjo0Var24 = new zjo0("country", linkedHashMap27, new LinkedHashSet(), new LinkedHashSet());
                                        je70Var.i = qpg0Var2;
                                        je70Var.j = null;
                                        je70Var.k = null;
                                        je70Var.l = null;
                                        je70Var.m = null;
                                        je70Var.n = null;
                                        je70Var.o = null;
                                        je70Var.p = null;
                                        je70Var.q = null;
                                        je70Var.r = zjo0Var24;
                                        je70Var.A = 9;
                                        objG = c9x.G(qpg0Var2, "country", je70Var);
                                        if (objG != wneVar) {
                                            zjo0Var25 = zjo0Var24;
                                            zjo0Var26 = (zjo0) objG;
                                            if (!zjo0Var25.equals(zjo0Var26)) {
                                                return new eeg0("country(org.xplatform.onexdatabase.entity.CountryEntity).\n Expected:\n" + zjo0Var25 + "\n Found:\n" + zjo0Var26, false);
                                            }
                                            LinkedHashMap linkedHashMap119 = new LinkedHashMap();
                                            linkedHashMap119.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                            linkedHashMap119.put(ParameterNames.HIDDEN, new tjo0(0, 1, ParameterNames.HIDDEN, "INTEGER", null, true));
                                            linkedHashMap119.put("pinned_position", new tjo0(0, 1, "pinned_position", "INTEGER", null, true));
                                            zjo0Var27 = new zjo0("market_filter", linkedHashMap119, new LinkedHashSet(), new LinkedHashSet());
                                            je70Var.i = qpg0Var2;
                                            je70Var.j = null;
                                            je70Var.k = null;
                                            je70Var.l = null;
                                            je70Var.m = null;
                                            je70Var.n = null;
                                            je70Var.o = null;
                                            je70Var.p = null;
                                            je70Var.q = null;
                                            je70Var.r = null;
                                            je70Var.s = zjo0Var27;
                                            je70Var.A = 10;
                                            objG = c9x.G(qpg0Var2, "market_filter", je70Var);
                                            if (objG != wneVar) {
                                                zjo0Var28 = zjo0Var27;
                                                zjo0Var29 = (zjo0) objG;
                                                if (!zjo0Var28.equals(zjo0Var29)) {
                                                    return new eeg0("market_filter(org.xplatform.onexdatabase.entity.MarketFilterEntity).\n Expected:\n" + zjo0Var28 + "\n Found:\n" + zjo0Var29, false);
                                                }
                                                LinkedHashMap linkedHashMap1110 = new LinkedHashMap();
                                                linkedHashMap1110.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                linkedHashMap1110.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                                                linkedHashMap1110.put("itemId", new tjo0(0, 1, "itemId", "INTEGER", null, true));
                                                linkedHashMap1110.put("title", new tjo0(0, 1, "title", "TEXT", null, true));
                                                zjo0Var30 = new zjo0("statistic_dictionaries", linkedHashMap1110, new LinkedHashSet(), new LinkedHashSet());
                                                je70Var.i = qpg0Var2;
                                                je70Var.j = null;
                                                je70Var.k = null;
                                                je70Var.l = null;
                                                je70Var.m = null;
                                                je70Var.n = null;
                                                je70Var.o = null;
                                                je70Var.p = null;
                                                je70Var.q = null;
                                                je70Var.r = null;
                                                je70Var.s = null;
                                                je70Var.t = zjo0Var30;
                                                je70Var.A = 11;
                                                objG = c9x.G(qpg0Var2, "statistic_dictionaries", je70Var);
                                                if (objG != wneVar) {
                                                    zjo0Var31 = zjo0Var30;
                                                    zjo0Var32 = (zjo0) objG;
                                                    if (!zjo0Var31.equals(zjo0Var32)) {
                                                        return new eeg0("statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n" + zjo0Var31 + "\n Found:\n" + zjo0Var32, false);
                                                    }
                                                    LinkedHashMap linkedHashMap1111 = new LinkedHashMap();
                                                    linkedHashMap1111.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                    linkedHashMap1111.put("registration_type_id", new tjo0(0, 1, "registration_type_id", "INTEGER", null, true));
                                                    linkedHashMap1111.put("field_name", new tjo0(0, 1, "field_name", "TEXT", null, true));
                                                    linkedHashMap1111.put("is_required", new tjo0(0, 1, "is_required", "INTEGER", null, true));
                                                    linkedHashMap1111.put("is_hidden", new tjo0(0, 1, "is_hidden", "INTEGER", null, true));
                                                    linkedHashMap1111.put("min_age", new tjo0(0, 1, "min_age", "TEXT", null, false));
                                                    zjo0Var33 = new zjo0("registration", linkedHashMap1111, new LinkedHashSet(), new LinkedHashSet());
                                                    je70Var.i = qpg0Var2;
                                                    je70Var.j = null;
                                                    je70Var.k = null;
                                                    je70Var.l = null;
                                                    je70Var.m = null;
                                                    je70Var.n = null;
                                                    je70Var.o = null;
                                                    je70Var.p = null;
                                                    je70Var.q = null;
                                                    je70Var.r = null;
                                                    je70Var.s = null;
                                                    je70Var.t = null;
                                                    je70Var.u = zjo0Var33;
                                                    je70Var.A = 12;
                                                    objG = c9x.G(qpg0Var2, "registration", je70Var);
                                                    if (objG != wneVar) {
                                                        zjo0Var34 = zjo0Var33;
                                                        zjo0Var35 = (zjo0) objG;
                                                        if (!zjo0Var34.equals(zjo0Var35)) {
                                                            return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                                                        }
                                                        LinkedHashMap linkedHashMap1112 = new LinkedHashMap();
                                                        linkedHashMap1112.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                                                        linkedHashMap1112.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                                                        linkedHashMap1112.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                                                        linkedHashMap1112.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                                                        zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap1112, new LinkedHashSet(), new LinkedHashSet());
                                                        je70Var.i = qpg0Var2;
                                                        je70Var.j = null;
                                                        je70Var.k = null;
                                                        je70Var.l = null;
                                                        je70Var.m = null;
                                                        je70Var.n = null;
                                                        je70Var.o = null;
                                                        je70Var.p = null;
                                                        je70Var.q = null;
                                                        je70Var.r = null;
                                                        je70Var.s = null;
                                                        je70Var.t = null;
                                                        je70Var.u = null;
                                                        je70Var.v = zjo0Var36;
                                                        je70Var.A = 13;
                                                        objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                                                        if (objG != wneVar) {
                                                            zjo0Var37 = zjo0Var36;
                                                            zjo0Var38 = (zjo0) objG;
                                                            if (!zjo0Var37.equals(zjo0Var38)) {
                                                                return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                                                            }
                                                            LinkedHashMap linkedHashMap1113 = new LinkedHashMap();
                                                            linkedHashMap1113.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                            zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap1113, new LinkedHashSet(), new LinkedHashSet());
                                                            je70Var.i = qpg0Var2;
                                                            je70Var.j = null;
                                                            je70Var.k = null;
                                                            je70Var.l = null;
                                                            je70Var.m = null;
                                                            je70Var.n = null;
                                                            je70Var.o = null;
                                                            je70Var.p = null;
                                                            je70Var.q = null;
                                                            je70Var.r = null;
                                                            je70Var.s = null;
                                                            je70Var.t = null;
                                                            je70Var.u = null;
                                                            je70Var.v = null;
                                                            je70Var.w = zjo0Var39;
                                                            je70Var.A = 14;
                                                            objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                                                            if (objG != wneVar) {
                                                                zjo0Var40 = zjo0Var39;
                                                                zjo0Var41 = (zjo0) objG;
                                                                if (!zjo0Var40.equals(zjo0Var41)) {
                                                                    return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                                                                }
                                                                LinkedHashMap linkedHashMap1114 = new LinkedHashMap();
                                                                linkedHashMap1114.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                                zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap1114, new LinkedHashSet(), new LinkedHashSet());
                                                                je70Var.i = null;
                                                                je70Var.j = null;
                                                                je70Var.k = null;
                                                                je70Var.l = null;
                                                                je70Var.m = null;
                                                                je70Var.n = null;
                                                                je70Var.o = null;
                                                                je70Var.p = null;
                                                                je70Var.q = null;
                                                                je70Var.r = null;
                                                                je70Var.s = null;
                                                                je70Var.t = null;
                                                                je70Var.u = null;
                                                                je70Var.v = null;
                                                                je70Var.w = null;
                                                                je70Var.x = zjo0Var42;
                                                                je70Var.A = 15;
                                                                objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                                                                if (objG != wneVar) {
                                                                    zjo0Var43 = zjo0Var42;
                                                                    zjo0Var44 = (zjo0) objG;
                                                                    if (!zjo0Var43.equals(zjo0Var44)) {
                                                                        return new eeg0(null, true);
                                                                    }
                                                                    return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 3:
                zjo0Var7 = je70Var.l;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var8 = (zjo0) objG;
                if (!zjo0Var7.equals(zjo0Var8)) {
                    return new eeg0("sports(org.xplatform.onexdatabase.entity.SportEntity).\n Expected:\n" + zjo0Var7 + "\n Found:\n" + zjo0Var8, false);
                }
                LinkedHashMap linkedHashMap1115 = new LinkedHashMap();
                linkedHashMap1115.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                linkedHashMap1115.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                linkedHashMap1115.put("type_param", new tjo0(0, 1, "type_param", "INTEGER", null, true));
                linkedHashMap1115.put("special_type", new tjo0(0, 1, "special_type", "INTEGER", null, true));
                zjo0Var9 = new zjo0("events", linkedHashMap1115, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var2;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = null;
                je70Var.m = zjo0Var9;
                je70Var.A = 4;
                objG = c9x.G(qpg0Var2, "events", je70Var);
                if (objG != wneVar) {
                    zjo0Var10 = zjo0Var9;
                    zjo0Var11 = (zjo0) objG;
                    if (!zjo0Var10.equals(zjo0Var11)) {
                        return new eeg0("events(org.xplatform.onexdatabase.entity.EventDbModel).\n Expected:\n" + zjo0Var10 + "\n Found:\n" + zjo0Var11, false);
                    }
                    LinkedHashMap linkedHashMap1116 = new LinkedHashMap();
                    linkedHashMap1116.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                    linkedHashMap1116.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                    linkedHashMap1116.put("position", new tjo0(0, 1, "position", "INTEGER", null, true));
                    linkedHashMap1116.put("count_cols", new tjo0(0, 1, "count_cols", "INTEGER", null, true));
                    linkedHashMap1116.put("has_auto_sub", new tjo0(0, 1, "has_auto_sub", "INTEGER", null, true));
                    zjo0Var12 = new zjo0("event_groups", linkedHashMap1116, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var2;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = null;
                    je70Var.m = null;
                    je70Var.n = zjo0Var12;
                    je70Var.A = 5;
                    objG = c9x.G(qpg0Var2, "event_groups", je70Var);
                    if (objG != wneVar) {
                        zjo0Var13 = zjo0Var12;
                        zjo0Var14 = (zjo0) objG;
                        if (!zjo0Var13.equals(zjo0Var14)) {
                            return new eeg0("event_groups(org.xplatform.onexdatabase.entity.EventGroupDbModel).\n Expected:\n" + zjo0Var13 + "\n Found:\n" + zjo0Var14, false);
                        }
                        LinkedHashMap linkedHashMap28 = new LinkedHashMap();
                        linkedHashMap28.put(ParameterNames.ID, new tjo0(0, 1, ParameterNames.ID, "INTEGER", null, true));
                        linkedHashMap28.put("is_live", new tjo0(0, 1, "is_live", "INTEGER", null, true));
                        linkedHashMap28.put("screen_type", new tjo0(0, 1, "screen_type", "TEXT", null, true));
                        linkedHashMap28.put("primary_key", new tjo0(1, 1, "primary_key", "TEXT", null, true));
                        zjo0Var15 = new zjo0("favorite_champs", linkedHashMap28, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = qpg0Var2;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = null;
                        je70Var.m = null;
                        je70Var.n = null;
                        je70Var.o = zjo0Var15;
                        je70Var.A = 6;
                        objG = c9x.G(qpg0Var2, "favorite_champs", je70Var);
                        if (objG != wneVar) {
                            zjo0Var16 = zjo0Var15;
                            zjo0Var17 = (zjo0) objG;
                            if (!zjo0Var16.equals(zjo0Var17)) {
                                return new eeg0("favorite_champs(org.xplatform.onexdatabase.entity.FavoriteChamp).\n Expected:\n" + zjo0Var16 + "\n Found:\n" + zjo0Var17, false);
                            }
                            LinkedHashMap linkedHashMap29 = new LinkedHashMap();
                            linkedHashMap29.put("locale", new tjo0(2, 1, "locale", "TEXT", null, true));
                            linkedHashMap29.put("key", new tjo0(1, 1, "key", "TEXT", null, true));
                            linkedHashMap29.put("value", new tjo0(0, 1, "value", "TEXT", null, true));
                            zjo0Var18 = new zjo0("strings", linkedHashMap29, new LinkedHashSet(), new LinkedHashSet());
                            je70Var.i = qpg0Var2;
                            je70Var.j = null;
                            je70Var.k = null;
                            je70Var.l = null;
                            je70Var.m = null;
                            je70Var.n = null;
                            je70Var.o = null;
                            je70Var.p = zjo0Var18;
                            je70Var.A = 7;
                            objG = c9x.G(qpg0Var2, "strings", je70Var);
                            if (objG != wneVar) {
                                zjo0Var19 = zjo0Var18;
                                zjo0Var20 = (zjo0) objG;
                                if (!zjo0Var19.equals(zjo0Var20)) {
                                    return new eeg0("strings(org.xplatform.onexdatabase.entity.AppString).\n Expected:\n" + zjo0Var19 + "\n Found:\n" + zjo0Var20, false);
                                }
                                LinkedHashMap linkedHashMap210 = new LinkedHashMap();
                                linkedHashMap210.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                linkedHashMap210.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                                linkedHashMap210.put("date", new tjo0(0, 1, "date", "INTEGER", null, true));
                                zjo0Var21 = new zjo0("last_action", linkedHashMap210, new LinkedHashSet(), new LinkedHashSet());
                                je70Var.i = qpg0Var2;
                                je70Var.j = null;
                                je70Var.k = null;
                                je70Var.l = null;
                                je70Var.m = null;
                                je70Var.n = null;
                                je70Var.o = null;
                                je70Var.p = null;
                                je70Var.q = zjo0Var21;
                                je70Var.A = 8;
                                objG = c9x.G(qpg0Var2, "last_action", je70Var);
                                if (objG != wneVar) {
                                    zjo0Var22 = zjo0Var21;
                                    zjo0Var23 = (zjo0) objG;
                                    if (!zjo0Var22.equals(zjo0Var23)) {
                                        return new eeg0("last_action(org.xplatform.onexdatabase.entity.LastAction).\n Expected:\n" + zjo0Var22 + "\n Found:\n" + zjo0Var23, false);
                                    }
                                    LinkedHashMap linkedHashMap211 = new LinkedHashMap();
                                    linkedHashMap211.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                    linkedHashMap211.put("country_name", new tjo0(0, 1, "country_name", "TEXT", null, true));
                                    linkedHashMap211.put("country_phone_code", new tjo0(0, 1, "country_phone_code", "INTEGER", null, true));
                                    linkedHashMap211.put("country_code", new tjo0(0, 1, "country_code", "TEXT", null, true));
                                    linkedHashMap211.put("country_currency_id", new tjo0(0, 1, "country_currency_id", "INTEGER", null, true));
                                    linkedHashMap211.put("country_image", new tjo0(0, 1, "country_image", "TEXT", null, true));
                                    linkedHashMap211.put("phone_mask_max_length", new tjo0(0, 1, "phone_mask_max_length", "INTEGER", "0", true));
                                    linkedHashMap211.put("phone_mask_min_length", new tjo0(0, 1, "phone_mask_min_length", "INTEGER", "0", true));
                                    linkedHashMap211.put("phone_mask", new tjo0(0, 1, "phone_mask", "TEXT", "''", true));
                                    zjo0Var24 = new zjo0("country", linkedHashMap211, new LinkedHashSet(), new LinkedHashSet());
                                    je70Var.i = qpg0Var2;
                                    je70Var.j = null;
                                    je70Var.k = null;
                                    je70Var.l = null;
                                    je70Var.m = null;
                                    je70Var.n = null;
                                    je70Var.o = null;
                                    je70Var.p = null;
                                    je70Var.q = null;
                                    je70Var.r = zjo0Var24;
                                    je70Var.A = 9;
                                    objG = c9x.G(qpg0Var2, "country", je70Var);
                                    if (objG != wneVar) {
                                        zjo0Var25 = zjo0Var24;
                                        zjo0Var26 = (zjo0) objG;
                                        if (!zjo0Var25.equals(zjo0Var26)) {
                                            return new eeg0("country(org.xplatform.onexdatabase.entity.CountryEntity).\n Expected:\n" + zjo0Var25 + "\n Found:\n" + zjo0Var26, false);
                                        }
                                        LinkedHashMap linkedHashMap1117 = new LinkedHashMap();
                                        linkedHashMap1117.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                        linkedHashMap1117.put(ParameterNames.HIDDEN, new tjo0(0, 1, ParameterNames.HIDDEN, "INTEGER", null, true));
                                        linkedHashMap1117.put("pinned_position", new tjo0(0, 1, "pinned_position", "INTEGER", null, true));
                                        zjo0Var27 = new zjo0("market_filter", linkedHashMap1117, new LinkedHashSet(), new LinkedHashSet());
                                        je70Var.i = qpg0Var2;
                                        je70Var.j = null;
                                        je70Var.k = null;
                                        je70Var.l = null;
                                        je70Var.m = null;
                                        je70Var.n = null;
                                        je70Var.o = null;
                                        je70Var.p = null;
                                        je70Var.q = null;
                                        je70Var.r = null;
                                        je70Var.s = zjo0Var27;
                                        je70Var.A = 10;
                                        objG = c9x.G(qpg0Var2, "market_filter", je70Var);
                                        if (objG != wneVar) {
                                            zjo0Var28 = zjo0Var27;
                                            zjo0Var29 = (zjo0) objG;
                                            if (!zjo0Var28.equals(zjo0Var29)) {
                                                return new eeg0("market_filter(org.xplatform.onexdatabase.entity.MarketFilterEntity).\n Expected:\n" + zjo0Var28 + "\n Found:\n" + zjo0Var29, false);
                                            }
                                            LinkedHashMap linkedHashMap1118 = new LinkedHashMap();
                                            linkedHashMap1118.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                            linkedHashMap1118.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                                            linkedHashMap1118.put("itemId", new tjo0(0, 1, "itemId", "INTEGER", null, true));
                                            linkedHashMap1118.put("title", new tjo0(0, 1, "title", "TEXT", null, true));
                                            zjo0Var30 = new zjo0("statistic_dictionaries", linkedHashMap1118, new LinkedHashSet(), new LinkedHashSet());
                                            je70Var.i = qpg0Var2;
                                            je70Var.j = null;
                                            je70Var.k = null;
                                            je70Var.l = null;
                                            je70Var.m = null;
                                            je70Var.n = null;
                                            je70Var.o = null;
                                            je70Var.p = null;
                                            je70Var.q = null;
                                            je70Var.r = null;
                                            je70Var.s = null;
                                            je70Var.t = zjo0Var30;
                                            je70Var.A = 11;
                                            objG = c9x.G(qpg0Var2, "statistic_dictionaries", je70Var);
                                            if (objG != wneVar) {
                                                zjo0Var31 = zjo0Var30;
                                                zjo0Var32 = (zjo0) objG;
                                                if (!zjo0Var31.equals(zjo0Var32)) {
                                                    return new eeg0("statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n" + zjo0Var31 + "\n Found:\n" + zjo0Var32, false);
                                                }
                                                LinkedHashMap linkedHashMap1119 = new LinkedHashMap();
                                                linkedHashMap1119.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                linkedHashMap1119.put("registration_type_id", new tjo0(0, 1, "registration_type_id", "INTEGER", null, true));
                                                linkedHashMap1119.put("field_name", new tjo0(0, 1, "field_name", "TEXT", null, true));
                                                linkedHashMap1119.put("is_required", new tjo0(0, 1, "is_required", "INTEGER", null, true));
                                                linkedHashMap1119.put("is_hidden", new tjo0(0, 1, "is_hidden", "INTEGER", null, true));
                                                linkedHashMap1119.put("min_age", new tjo0(0, 1, "min_age", "TEXT", null, false));
                                                zjo0Var33 = new zjo0("registration", linkedHashMap1119, new LinkedHashSet(), new LinkedHashSet());
                                                je70Var.i = qpg0Var2;
                                                je70Var.j = null;
                                                je70Var.k = null;
                                                je70Var.l = null;
                                                je70Var.m = null;
                                                je70Var.n = null;
                                                je70Var.o = null;
                                                je70Var.p = null;
                                                je70Var.q = null;
                                                je70Var.r = null;
                                                je70Var.s = null;
                                                je70Var.t = null;
                                                je70Var.u = zjo0Var33;
                                                je70Var.A = 12;
                                                objG = c9x.G(qpg0Var2, "registration", je70Var);
                                                if (objG != wneVar) {
                                                    zjo0Var34 = zjo0Var33;
                                                    zjo0Var35 = (zjo0) objG;
                                                    if (!zjo0Var34.equals(zjo0Var35)) {
                                                        return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                                                    }
                                                    LinkedHashMap linkedHashMap11110 = new LinkedHashMap();
                                                    linkedHashMap11110.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                                                    linkedHashMap11110.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                                                    linkedHashMap11110.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                                                    linkedHashMap11110.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                                                    zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap11110, new LinkedHashSet(), new LinkedHashSet());
                                                    je70Var.i = qpg0Var2;
                                                    je70Var.j = null;
                                                    je70Var.k = null;
                                                    je70Var.l = null;
                                                    je70Var.m = null;
                                                    je70Var.n = null;
                                                    je70Var.o = null;
                                                    je70Var.p = null;
                                                    je70Var.q = null;
                                                    je70Var.r = null;
                                                    je70Var.s = null;
                                                    je70Var.t = null;
                                                    je70Var.u = null;
                                                    je70Var.v = zjo0Var36;
                                                    je70Var.A = 13;
                                                    objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                                                    if (objG != wneVar) {
                                                        zjo0Var37 = zjo0Var36;
                                                        zjo0Var38 = (zjo0) objG;
                                                        if (!zjo0Var37.equals(zjo0Var38)) {
                                                            return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                                                        }
                                                        LinkedHashMap linkedHashMap11111 = new LinkedHashMap();
                                                        linkedHashMap11111.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                        zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap11111, new LinkedHashSet(), new LinkedHashSet());
                                                        je70Var.i = qpg0Var2;
                                                        je70Var.j = null;
                                                        je70Var.k = null;
                                                        je70Var.l = null;
                                                        je70Var.m = null;
                                                        je70Var.n = null;
                                                        je70Var.o = null;
                                                        je70Var.p = null;
                                                        je70Var.q = null;
                                                        je70Var.r = null;
                                                        je70Var.s = null;
                                                        je70Var.t = null;
                                                        je70Var.u = null;
                                                        je70Var.v = null;
                                                        je70Var.w = zjo0Var39;
                                                        je70Var.A = 14;
                                                        objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                                                        if (objG != wneVar) {
                                                            zjo0Var40 = zjo0Var39;
                                                            zjo0Var41 = (zjo0) objG;
                                                            if (!zjo0Var40.equals(zjo0Var41)) {
                                                                return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                                                            }
                                                            LinkedHashMap linkedHashMap11112 = new LinkedHashMap();
                                                            linkedHashMap11112.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                            zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap11112, new LinkedHashSet(), new LinkedHashSet());
                                                            je70Var.i = null;
                                                            je70Var.j = null;
                                                            je70Var.k = null;
                                                            je70Var.l = null;
                                                            je70Var.m = null;
                                                            je70Var.n = null;
                                                            je70Var.o = null;
                                                            je70Var.p = null;
                                                            je70Var.q = null;
                                                            je70Var.r = null;
                                                            je70Var.s = null;
                                                            je70Var.t = null;
                                                            je70Var.u = null;
                                                            je70Var.v = null;
                                                            je70Var.w = null;
                                                            je70Var.x = zjo0Var42;
                                                            je70Var.A = 15;
                                                            objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                                                            if (objG != wneVar) {
                                                                zjo0Var43 = zjo0Var42;
                                                                zjo0Var44 = (zjo0) objG;
                                                                if (!zjo0Var43.equals(zjo0Var44)) {
                                                                    return new eeg0(null, true);
                                                                }
                                                                return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 4:
                zjo0Var10 = je70Var.m;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var11 = (zjo0) objG;
                if (!zjo0Var10.equals(zjo0Var11)) {
                    return new eeg0("events(org.xplatform.onexdatabase.entity.EventDbModel).\n Expected:\n" + zjo0Var10 + "\n Found:\n" + zjo0Var11, false);
                }
                LinkedHashMap linkedHashMap11113 = new LinkedHashMap();
                linkedHashMap11113.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                linkedHashMap11113.put("name", new tjo0(0, 1, "name", "TEXT", null, true));
                linkedHashMap11113.put("position", new tjo0(0, 1, "position", "INTEGER", null, true));
                linkedHashMap11113.put("count_cols", new tjo0(0, 1, "count_cols", "INTEGER", null, true));
                linkedHashMap11113.put("has_auto_sub", new tjo0(0, 1, "has_auto_sub", "INTEGER", null, true));
                zjo0Var12 = new zjo0("event_groups", linkedHashMap11113, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var2;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = null;
                je70Var.m = null;
                je70Var.n = zjo0Var12;
                je70Var.A = 5;
                objG = c9x.G(qpg0Var2, "event_groups", je70Var);
                if (objG != wneVar) {
                    zjo0Var13 = zjo0Var12;
                    zjo0Var14 = (zjo0) objG;
                    if (!zjo0Var13.equals(zjo0Var14)) {
                        return new eeg0("event_groups(org.xplatform.onexdatabase.entity.EventGroupDbModel).\n Expected:\n" + zjo0Var13 + "\n Found:\n" + zjo0Var14, false);
                    }
                    LinkedHashMap linkedHashMap212 = new LinkedHashMap();
                    linkedHashMap212.put(ParameterNames.ID, new tjo0(0, 1, ParameterNames.ID, "INTEGER", null, true));
                    linkedHashMap212.put("is_live", new tjo0(0, 1, "is_live", "INTEGER", null, true));
                    linkedHashMap212.put("screen_type", new tjo0(0, 1, "screen_type", "TEXT", null, true));
                    linkedHashMap212.put("primary_key", new tjo0(1, 1, "primary_key", "TEXT", null, true));
                    zjo0Var15 = new zjo0("favorite_champs", linkedHashMap212, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var2;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = null;
                    je70Var.m = null;
                    je70Var.n = null;
                    je70Var.o = zjo0Var15;
                    je70Var.A = 6;
                    objG = c9x.G(qpg0Var2, "favorite_champs", je70Var);
                    if (objG != wneVar) {
                        zjo0Var16 = zjo0Var15;
                        zjo0Var17 = (zjo0) objG;
                        if (!zjo0Var16.equals(zjo0Var17)) {
                            return new eeg0("favorite_champs(org.xplatform.onexdatabase.entity.FavoriteChamp).\n Expected:\n" + zjo0Var16 + "\n Found:\n" + zjo0Var17, false);
                        }
                        LinkedHashMap linkedHashMap213 = new LinkedHashMap();
                        linkedHashMap213.put("locale", new tjo0(2, 1, "locale", "TEXT", null, true));
                        linkedHashMap213.put("key", new tjo0(1, 1, "key", "TEXT", null, true));
                        linkedHashMap213.put("value", new tjo0(0, 1, "value", "TEXT", null, true));
                        zjo0Var18 = new zjo0("strings", linkedHashMap213, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = qpg0Var2;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = null;
                        je70Var.m = null;
                        je70Var.n = null;
                        je70Var.o = null;
                        je70Var.p = zjo0Var18;
                        je70Var.A = 7;
                        objG = c9x.G(qpg0Var2, "strings", je70Var);
                        if (objG != wneVar) {
                            zjo0Var19 = zjo0Var18;
                            zjo0Var20 = (zjo0) objG;
                            if (!zjo0Var19.equals(zjo0Var20)) {
                                return new eeg0("strings(org.xplatform.onexdatabase.entity.AppString).\n Expected:\n" + zjo0Var19 + "\n Found:\n" + zjo0Var20, false);
                            }
                            LinkedHashMap linkedHashMap214 = new LinkedHashMap();
                            linkedHashMap214.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                            linkedHashMap214.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                            linkedHashMap214.put("date", new tjo0(0, 1, "date", "INTEGER", null, true));
                            zjo0Var21 = new zjo0("last_action", linkedHashMap214, new LinkedHashSet(), new LinkedHashSet());
                            je70Var.i = qpg0Var2;
                            je70Var.j = null;
                            je70Var.k = null;
                            je70Var.l = null;
                            je70Var.m = null;
                            je70Var.n = null;
                            je70Var.o = null;
                            je70Var.p = null;
                            je70Var.q = zjo0Var21;
                            je70Var.A = 8;
                            objG = c9x.G(qpg0Var2, "last_action", je70Var);
                            if (objG != wneVar) {
                                zjo0Var22 = zjo0Var21;
                                zjo0Var23 = (zjo0) objG;
                                if (!zjo0Var22.equals(zjo0Var23)) {
                                    return new eeg0("last_action(org.xplatform.onexdatabase.entity.LastAction).\n Expected:\n" + zjo0Var22 + "\n Found:\n" + zjo0Var23, false);
                                }
                                LinkedHashMap linkedHashMap215 = new LinkedHashMap();
                                linkedHashMap215.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                linkedHashMap215.put("country_name", new tjo0(0, 1, "country_name", "TEXT", null, true));
                                linkedHashMap215.put("country_phone_code", new tjo0(0, 1, "country_phone_code", "INTEGER", null, true));
                                linkedHashMap215.put("country_code", new tjo0(0, 1, "country_code", "TEXT", null, true));
                                linkedHashMap215.put("country_currency_id", new tjo0(0, 1, "country_currency_id", "INTEGER", null, true));
                                linkedHashMap215.put("country_image", new tjo0(0, 1, "country_image", "TEXT", null, true));
                                linkedHashMap215.put("phone_mask_max_length", new tjo0(0, 1, "phone_mask_max_length", "INTEGER", "0", true));
                                linkedHashMap215.put("phone_mask_min_length", new tjo0(0, 1, "phone_mask_min_length", "INTEGER", "0", true));
                                linkedHashMap215.put("phone_mask", new tjo0(0, 1, "phone_mask", "TEXT", "''", true));
                                zjo0Var24 = new zjo0("country", linkedHashMap215, new LinkedHashSet(), new LinkedHashSet());
                                je70Var.i = qpg0Var2;
                                je70Var.j = null;
                                je70Var.k = null;
                                je70Var.l = null;
                                je70Var.m = null;
                                je70Var.n = null;
                                je70Var.o = null;
                                je70Var.p = null;
                                je70Var.q = null;
                                je70Var.r = zjo0Var24;
                                je70Var.A = 9;
                                objG = c9x.G(qpg0Var2, "country", je70Var);
                                if (objG != wneVar) {
                                    zjo0Var25 = zjo0Var24;
                                    zjo0Var26 = (zjo0) objG;
                                    if (!zjo0Var25.equals(zjo0Var26)) {
                                        return new eeg0("country(org.xplatform.onexdatabase.entity.CountryEntity).\n Expected:\n" + zjo0Var25 + "\n Found:\n" + zjo0Var26, false);
                                    }
                                    LinkedHashMap linkedHashMap11114 = new LinkedHashMap();
                                    linkedHashMap11114.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                    linkedHashMap11114.put(ParameterNames.HIDDEN, new tjo0(0, 1, ParameterNames.HIDDEN, "INTEGER", null, true));
                                    linkedHashMap11114.put("pinned_position", new tjo0(0, 1, "pinned_position", "INTEGER", null, true));
                                    zjo0Var27 = new zjo0("market_filter", linkedHashMap11114, new LinkedHashSet(), new LinkedHashSet());
                                    je70Var.i = qpg0Var2;
                                    je70Var.j = null;
                                    je70Var.k = null;
                                    je70Var.l = null;
                                    je70Var.m = null;
                                    je70Var.n = null;
                                    je70Var.o = null;
                                    je70Var.p = null;
                                    je70Var.q = null;
                                    je70Var.r = null;
                                    je70Var.s = zjo0Var27;
                                    je70Var.A = 10;
                                    objG = c9x.G(qpg0Var2, "market_filter", je70Var);
                                    if (objG != wneVar) {
                                        zjo0Var28 = zjo0Var27;
                                        zjo0Var29 = (zjo0) objG;
                                        if (!zjo0Var28.equals(zjo0Var29)) {
                                            return new eeg0("market_filter(org.xplatform.onexdatabase.entity.MarketFilterEntity).\n Expected:\n" + zjo0Var28 + "\n Found:\n" + zjo0Var29, false);
                                        }
                                        LinkedHashMap linkedHashMap11115 = new LinkedHashMap();
                                        linkedHashMap11115.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                        linkedHashMap11115.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                                        linkedHashMap11115.put("itemId", new tjo0(0, 1, "itemId", "INTEGER", null, true));
                                        linkedHashMap11115.put("title", new tjo0(0, 1, "title", "TEXT", null, true));
                                        zjo0Var30 = new zjo0("statistic_dictionaries", linkedHashMap11115, new LinkedHashSet(), new LinkedHashSet());
                                        je70Var.i = qpg0Var2;
                                        je70Var.j = null;
                                        je70Var.k = null;
                                        je70Var.l = null;
                                        je70Var.m = null;
                                        je70Var.n = null;
                                        je70Var.o = null;
                                        je70Var.p = null;
                                        je70Var.q = null;
                                        je70Var.r = null;
                                        je70Var.s = null;
                                        je70Var.t = zjo0Var30;
                                        je70Var.A = 11;
                                        objG = c9x.G(qpg0Var2, "statistic_dictionaries", je70Var);
                                        if (objG != wneVar) {
                                            zjo0Var31 = zjo0Var30;
                                            zjo0Var32 = (zjo0) objG;
                                            if (!zjo0Var31.equals(zjo0Var32)) {
                                                return new eeg0("statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n" + zjo0Var31 + "\n Found:\n" + zjo0Var32, false);
                                            }
                                            LinkedHashMap linkedHashMap11116 = new LinkedHashMap();
                                            linkedHashMap11116.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                            linkedHashMap11116.put("registration_type_id", new tjo0(0, 1, "registration_type_id", "INTEGER", null, true));
                                            linkedHashMap11116.put("field_name", new tjo0(0, 1, "field_name", "TEXT", null, true));
                                            linkedHashMap11116.put("is_required", new tjo0(0, 1, "is_required", "INTEGER", null, true));
                                            linkedHashMap11116.put("is_hidden", new tjo0(0, 1, "is_hidden", "INTEGER", null, true));
                                            linkedHashMap11116.put("min_age", new tjo0(0, 1, "min_age", "TEXT", null, false));
                                            zjo0Var33 = new zjo0("registration", linkedHashMap11116, new LinkedHashSet(), new LinkedHashSet());
                                            je70Var.i = qpg0Var2;
                                            je70Var.j = null;
                                            je70Var.k = null;
                                            je70Var.l = null;
                                            je70Var.m = null;
                                            je70Var.n = null;
                                            je70Var.o = null;
                                            je70Var.p = null;
                                            je70Var.q = null;
                                            je70Var.r = null;
                                            je70Var.s = null;
                                            je70Var.t = null;
                                            je70Var.u = zjo0Var33;
                                            je70Var.A = 12;
                                            objG = c9x.G(qpg0Var2, "registration", je70Var);
                                            if (objG != wneVar) {
                                                zjo0Var34 = zjo0Var33;
                                                zjo0Var35 = (zjo0) objG;
                                                if (!zjo0Var34.equals(zjo0Var35)) {
                                                    return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                                                }
                                                LinkedHashMap linkedHashMap11117 = new LinkedHashMap();
                                                linkedHashMap11117.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                                                linkedHashMap11117.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                                                linkedHashMap11117.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                                                linkedHashMap11117.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                                                zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap11117, new LinkedHashSet(), new LinkedHashSet());
                                                je70Var.i = qpg0Var2;
                                                je70Var.j = null;
                                                je70Var.k = null;
                                                je70Var.l = null;
                                                je70Var.m = null;
                                                je70Var.n = null;
                                                je70Var.o = null;
                                                je70Var.p = null;
                                                je70Var.q = null;
                                                je70Var.r = null;
                                                je70Var.s = null;
                                                je70Var.t = null;
                                                je70Var.u = null;
                                                je70Var.v = zjo0Var36;
                                                je70Var.A = 13;
                                                objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                                                if (objG != wneVar) {
                                                    zjo0Var37 = zjo0Var36;
                                                    zjo0Var38 = (zjo0) objG;
                                                    if (!zjo0Var37.equals(zjo0Var38)) {
                                                        return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                                                    }
                                                    LinkedHashMap linkedHashMap11118 = new LinkedHashMap();
                                                    linkedHashMap11118.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                    zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap11118, new LinkedHashSet(), new LinkedHashSet());
                                                    je70Var.i = qpg0Var2;
                                                    je70Var.j = null;
                                                    je70Var.k = null;
                                                    je70Var.l = null;
                                                    je70Var.m = null;
                                                    je70Var.n = null;
                                                    je70Var.o = null;
                                                    je70Var.p = null;
                                                    je70Var.q = null;
                                                    je70Var.r = null;
                                                    je70Var.s = null;
                                                    je70Var.t = null;
                                                    je70Var.u = null;
                                                    je70Var.v = null;
                                                    je70Var.w = zjo0Var39;
                                                    je70Var.A = 14;
                                                    objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                                                    if (objG != wneVar) {
                                                        zjo0Var40 = zjo0Var39;
                                                        zjo0Var41 = (zjo0) objG;
                                                        if (!zjo0Var40.equals(zjo0Var41)) {
                                                            return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                                                        }
                                                        LinkedHashMap linkedHashMap11119 = new LinkedHashMap();
                                                        linkedHashMap11119.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                        zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap11119, new LinkedHashSet(), new LinkedHashSet());
                                                        je70Var.i = null;
                                                        je70Var.j = null;
                                                        je70Var.k = null;
                                                        je70Var.l = null;
                                                        je70Var.m = null;
                                                        je70Var.n = null;
                                                        je70Var.o = null;
                                                        je70Var.p = null;
                                                        je70Var.q = null;
                                                        je70Var.r = null;
                                                        je70Var.s = null;
                                                        je70Var.t = null;
                                                        je70Var.u = null;
                                                        je70Var.v = null;
                                                        je70Var.w = null;
                                                        je70Var.x = zjo0Var42;
                                                        je70Var.A = 15;
                                                        objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                                                        if (objG != wneVar) {
                                                            zjo0Var43 = zjo0Var42;
                                                            zjo0Var44 = (zjo0) objG;
                                                            if (!zjo0Var43.equals(zjo0Var44)) {
                                                                return new eeg0(null, true);
                                                            }
                                                            return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 5:
                zjo0Var13 = je70Var.n;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var14 = (zjo0) objG;
                if (!zjo0Var13.equals(zjo0Var14)) {
                    return new eeg0("event_groups(org.xplatform.onexdatabase.entity.EventGroupDbModel).\n Expected:\n" + zjo0Var13 + "\n Found:\n" + zjo0Var14, false);
                }
                LinkedHashMap linkedHashMap216 = new LinkedHashMap();
                linkedHashMap216.put(ParameterNames.ID, new tjo0(0, 1, ParameterNames.ID, "INTEGER", null, true));
                linkedHashMap216.put("is_live", new tjo0(0, 1, "is_live", "INTEGER", null, true));
                linkedHashMap216.put("screen_type", new tjo0(0, 1, "screen_type", "TEXT", null, true));
                linkedHashMap216.put("primary_key", new tjo0(1, 1, "primary_key", "TEXT", null, true));
                zjo0Var15 = new zjo0("favorite_champs", linkedHashMap216, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var2;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = null;
                je70Var.m = null;
                je70Var.n = null;
                je70Var.o = zjo0Var15;
                je70Var.A = 6;
                objG = c9x.G(qpg0Var2, "favorite_champs", je70Var);
                if (objG != wneVar) {
                    zjo0Var16 = zjo0Var15;
                    zjo0Var17 = (zjo0) objG;
                    if (!zjo0Var16.equals(zjo0Var17)) {
                        return new eeg0("favorite_champs(org.xplatform.onexdatabase.entity.FavoriteChamp).\n Expected:\n" + zjo0Var16 + "\n Found:\n" + zjo0Var17, false);
                    }
                    LinkedHashMap linkedHashMap217 = new LinkedHashMap();
                    linkedHashMap217.put("locale", new tjo0(2, 1, "locale", "TEXT", null, true));
                    linkedHashMap217.put("key", new tjo0(1, 1, "key", "TEXT", null, true));
                    linkedHashMap217.put("value", new tjo0(0, 1, "value", "TEXT", null, true));
                    zjo0Var18 = new zjo0("strings", linkedHashMap217, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var2;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = null;
                    je70Var.m = null;
                    je70Var.n = null;
                    je70Var.o = null;
                    je70Var.p = zjo0Var18;
                    je70Var.A = 7;
                    objG = c9x.G(qpg0Var2, "strings", je70Var);
                    if (objG != wneVar) {
                        zjo0Var19 = zjo0Var18;
                        zjo0Var20 = (zjo0) objG;
                        if (!zjo0Var19.equals(zjo0Var20)) {
                            return new eeg0("strings(org.xplatform.onexdatabase.entity.AppString).\n Expected:\n" + zjo0Var19 + "\n Found:\n" + zjo0Var20, false);
                        }
                        LinkedHashMap linkedHashMap218 = new LinkedHashMap();
                        linkedHashMap218.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                        linkedHashMap218.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                        linkedHashMap218.put("date", new tjo0(0, 1, "date", "INTEGER", null, true));
                        zjo0Var21 = new zjo0("last_action", linkedHashMap218, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = qpg0Var2;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = null;
                        je70Var.m = null;
                        je70Var.n = null;
                        je70Var.o = null;
                        je70Var.p = null;
                        je70Var.q = zjo0Var21;
                        je70Var.A = 8;
                        objG = c9x.G(qpg0Var2, "last_action", je70Var);
                        if (objG != wneVar) {
                            zjo0Var22 = zjo0Var21;
                            zjo0Var23 = (zjo0) objG;
                            if (!zjo0Var22.equals(zjo0Var23)) {
                                return new eeg0("last_action(org.xplatform.onexdatabase.entity.LastAction).\n Expected:\n" + zjo0Var22 + "\n Found:\n" + zjo0Var23, false);
                            }
                            LinkedHashMap linkedHashMap219 = new LinkedHashMap();
                            linkedHashMap219.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                            linkedHashMap219.put("country_name", new tjo0(0, 1, "country_name", "TEXT", null, true));
                            linkedHashMap219.put("country_phone_code", new tjo0(0, 1, "country_phone_code", "INTEGER", null, true));
                            linkedHashMap219.put("country_code", new tjo0(0, 1, "country_code", "TEXT", null, true));
                            linkedHashMap219.put("country_currency_id", new tjo0(0, 1, "country_currency_id", "INTEGER", null, true));
                            linkedHashMap219.put("country_image", new tjo0(0, 1, "country_image", "TEXT", null, true));
                            linkedHashMap219.put("phone_mask_max_length", new tjo0(0, 1, "phone_mask_max_length", "INTEGER", "0", true));
                            linkedHashMap219.put("phone_mask_min_length", new tjo0(0, 1, "phone_mask_min_length", "INTEGER", "0", true));
                            linkedHashMap219.put("phone_mask", new tjo0(0, 1, "phone_mask", "TEXT", "''", true));
                            zjo0Var24 = new zjo0("country", linkedHashMap219, new LinkedHashSet(), new LinkedHashSet());
                            je70Var.i = qpg0Var2;
                            je70Var.j = null;
                            je70Var.k = null;
                            je70Var.l = null;
                            je70Var.m = null;
                            je70Var.n = null;
                            je70Var.o = null;
                            je70Var.p = null;
                            je70Var.q = null;
                            je70Var.r = zjo0Var24;
                            je70Var.A = 9;
                            objG = c9x.G(qpg0Var2, "country", je70Var);
                            if (objG != wneVar) {
                                zjo0Var25 = zjo0Var24;
                                zjo0Var26 = (zjo0) objG;
                                if (!zjo0Var25.equals(zjo0Var26)) {
                                    return new eeg0("country(org.xplatform.onexdatabase.entity.CountryEntity).\n Expected:\n" + zjo0Var25 + "\n Found:\n" + zjo0Var26, false);
                                }
                                LinkedHashMap linkedHashMap111110 = new LinkedHashMap();
                                linkedHashMap111110.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                linkedHashMap111110.put(ParameterNames.HIDDEN, new tjo0(0, 1, ParameterNames.HIDDEN, "INTEGER", null, true));
                                linkedHashMap111110.put("pinned_position", new tjo0(0, 1, "pinned_position", "INTEGER", null, true));
                                zjo0Var27 = new zjo0("market_filter", linkedHashMap111110, new LinkedHashSet(), new LinkedHashSet());
                                je70Var.i = qpg0Var2;
                                je70Var.j = null;
                                je70Var.k = null;
                                je70Var.l = null;
                                je70Var.m = null;
                                je70Var.n = null;
                                je70Var.o = null;
                                je70Var.p = null;
                                je70Var.q = null;
                                je70Var.r = null;
                                je70Var.s = zjo0Var27;
                                je70Var.A = 10;
                                objG = c9x.G(qpg0Var2, "market_filter", je70Var);
                                if (objG != wneVar) {
                                    zjo0Var28 = zjo0Var27;
                                    zjo0Var29 = (zjo0) objG;
                                    if (!zjo0Var28.equals(zjo0Var29)) {
                                        return new eeg0("market_filter(org.xplatform.onexdatabase.entity.MarketFilterEntity).\n Expected:\n" + zjo0Var28 + "\n Found:\n" + zjo0Var29, false);
                                    }
                                    LinkedHashMap linkedHashMap111111 = new LinkedHashMap();
                                    linkedHashMap111111.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                    linkedHashMap111111.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                                    linkedHashMap111111.put("itemId", new tjo0(0, 1, "itemId", "INTEGER", null, true));
                                    linkedHashMap111111.put("title", new tjo0(0, 1, "title", "TEXT", null, true));
                                    zjo0Var30 = new zjo0("statistic_dictionaries", linkedHashMap111111, new LinkedHashSet(), new LinkedHashSet());
                                    je70Var.i = qpg0Var2;
                                    je70Var.j = null;
                                    je70Var.k = null;
                                    je70Var.l = null;
                                    je70Var.m = null;
                                    je70Var.n = null;
                                    je70Var.o = null;
                                    je70Var.p = null;
                                    je70Var.q = null;
                                    je70Var.r = null;
                                    je70Var.s = null;
                                    je70Var.t = zjo0Var30;
                                    je70Var.A = 11;
                                    objG = c9x.G(qpg0Var2, "statistic_dictionaries", je70Var);
                                    if (objG != wneVar) {
                                        zjo0Var31 = zjo0Var30;
                                        zjo0Var32 = (zjo0) objG;
                                        if (!zjo0Var31.equals(zjo0Var32)) {
                                            return new eeg0("statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n" + zjo0Var31 + "\n Found:\n" + zjo0Var32, false);
                                        }
                                        LinkedHashMap linkedHashMap111112 = new LinkedHashMap();
                                        linkedHashMap111112.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                        linkedHashMap111112.put("registration_type_id", new tjo0(0, 1, "registration_type_id", "INTEGER", null, true));
                                        linkedHashMap111112.put("field_name", new tjo0(0, 1, "field_name", "TEXT", null, true));
                                        linkedHashMap111112.put("is_required", new tjo0(0, 1, "is_required", "INTEGER", null, true));
                                        linkedHashMap111112.put("is_hidden", new tjo0(0, 1, "is_hidden", "INTEGER", null, true));
                                        linkedHashMap111112.put("min_age", new tjo0(0, 1, "min_age", "TEXT", null, false));
                                        zjo0Var33 = new zjo0("registration", linkedHashMap111112, new LinkedHashSet(), new LinkedHashSet());
                                        je70Var.i = qpg0Var2;
                                        je70Var.j = null;
                                        je70Var.k = null;
                                        je70Var.l = null;
                                        je70Var.m = null;
                                        je70Var.n = null;
                                        je70Var.o = null;
                                        je70Var.p = null;
                                        je70Var.q = null;
                                        je70Var.r = null;
                                        je70Var.s = null;
                                        je70Var.t = null;
                                        je70Var.u = zjo0Var33;
                                        je70Var.A = 12;
                                        objG = c9x.G(qpg0Var2, "registration", je70Var);
                                        if (objG != wneVar) {
                                            zjo0Var34 = zjo0Var33;
                                            zjo0Var35 = (zjo0) objG;
                                            if (!zjo0Var34.equals(zjo0Var35)) {
                                                return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                                            }
                                            LinkedHashMap linkedHashMap111113 = new LinkedHashMap();
                                            linkedHashMap111113.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                                            linkedHashMap111113.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                                            linkedHashMap111113.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                                            linkedHashMap111113.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                                            zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap111113, new LinkedHashSet(), new LinkedHashSet());
                                            je70Var.i = qpg0Var2;
                                            je70Var.j = null;
                                            je70Var.k = null;
                                            je70Var.l = null;
                                            je70Var.m = null;
                                            je70Var.n = null;
                                            je70Var.o = null;
                                            je70Var.p = null;
                                            je70Var.q = null;
                                            je70Var.r = null;
                                            je70Var.s = null;
                                            je70Var.t = null;
                                            je70Var.u = null;
                                            je70Var.v = zjo0Var36;
                                            je70Var.A = 13;
                                            objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                                            if (objG != wneVar) {
                                                zjo0Var37 = zjo0Var36;
                                                zjo0Var38 = (zjo0) objG;
                                                if (!zjo0Var37.equals(zjo0Var38)) {
                                                    return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                                                }
                                                LinkedHashMap linkedHashMap111114 = new LinkedHashMap();
                                                linkedHashMap111114.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap111114, new LinkedHashSet(), new LinkedHashSet());
                                                je70Var.i = qpg0Var2;
                                                je70Var.j = null;
                                                je70Var.k = null;
                                                je70Var.l = null;
                                                je70Var.m = null;
                                                je70Var.n = null;
                                                je70Var.o = null;
                                                je70Var.p = null;
                                                je70Var.q = null;
                                                je70Var.r = null;
                                                je70Var.s = null;
                                                je70Var.t = null;
                                                je70Var.u = null;
                                                je70Var.v = null;
                                                je70Var.w = zjo0Var39;
                                                je70Var.A = 14;
                                                objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                                                if (objG != wneVar) {
                                                    zjo0Var40 = zjo0Var39;
                                                    zjo0Var41 = (zjo0) objG;
                                                    if (!zjo0Var40.equals(zjo0Var41)) {
                                                        return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                                                    }
                                                    LinkedHashMap linkedHashMap111115 = new LinkedHashMap();
                                                    linkedHashMap111115.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                    zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap111115, new LinkedHashSet(), new LinkedHashSet());
                                                    je70Var.i = null;
                                                    je70Var.j = null;
                                                    je70Var.k = null;
                                                    je70Var.l = null;
                                                    je70Var.m = null;
                                                    je70Var.n = null;
                                                    je70Var.o = null;
                                                    je70Var.p = null;
                                                    je70Var.q = null;
                                                    je70Var.r = null;
                                                    je70Var.s = null;
                                                    je70Var.t = null;
                                                    je70Var.u = null;
                                                    je70Var.v = null;
                                                    je70Var.w = null;
                                                    je70Var.x = zjo0Var42;
                                                    je70Var.A = 15;
                                                    objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                                                    if (objG != wneVar) {
                                                        zjo0Var43 = zjo0Var42;
                                                        zjo0Var44 = (zjo0) objG;
                                                        if (!zjo0Var43.equals(zjo0Var44)) {
                                                            return new eeg0(null, true);
                                                        }
                                                        return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 6:
                zjo0Var16 = je70Var.o;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var17 = (zjo0) objG;
                if (!zjo0Var16.equals(zjo0Var17)) {
                    return new eeg0("favorite_champs(org.xplatform.onexdatabase.entity.FavoriteChamp).\n Expected:\n" + zjo0Var16 + "\n Found:\n" + zjo0Var17, false);
                }
                LinkedHashMap linkedHashMap2110 = new LinkedHashMap();
                linkedHashMap2110.put("locale", new tjo0(2, 1, "locale", "TEXT", null, true));
                linkedHashMap2110.put("key", new tjo0(1, 1, "key", "TEXT", null, true));
                linkedHashMap2110.put("value", new tjo0(0, 1, "value", "TEXT", null, true));
                zjo0Var18 = new zjo0("strings", linkedHashMap2110, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var2;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = null;
                je70Var.m = null;
                je70Var.n = null;
                je70Var.o = null;
                je70Var.p = zjo0Var18;
                je70Var.A = 7;
                objG = c9x.G(qpg0Var2, "strings", je70Var);
                if (objG != wneVar) {
                    zjo0Var19 = zjo0Var18;
                    zjo0Var20 = (zjo0) objG;
                    if (!zjo0Var19.equals(zjo0Var20)) {
                        return new eeg0("strings(org.xplatform.onexdatabase.entity.AppString).\n Expected:\n" + zjo0Var19 + "\n Found:\n" + zjo0Var20, false);
                    }
                    LinkedHashMap linkedHashMap2111 = new LinkedHashMap();
                    linkedHashMap2111.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                    linkedHashMap2111.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                    linkedHashMap2111.put("date", new tjo0(0, 1, "date", "INTEGER", null, true));
                    zjo0Var21 = new zjo0("last_action", linkedHashMap2111, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var2;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = null;
                    je70Var.m = null;
                    je70Var.n = null;
                    je70Var.o = null;
                    je70Var.p = null;
                    je70Var.q = zjo0Var21;
                    je70Var.A = 8;
                    objG = c9x.G(qpg0Var2, "last_action", je70Var);
                    if (objG != wneVar) {
                        zjo0Var22 = zjo0Var21;
                        zjo0Var23 = (zjo0) objG;
                        if (!zjo0Var22.equals(zjo0Var23)) {
                            return new eeg0("last_action(org.xplatform.onexdatabase.entity.LastAction).\n Expected:\n" + zjo0Var22 + "\n Found:\n" + zjo0Var23, false);
                        }
                        LinkedHashMap linkedHashMap2112 = new LinkedHashMap();
                        linkedHashMap2112.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                        linkedHashMap2112.put("country_name", new tjo0(0, 1, "country_name", "TEXT", null, true));
                        linkedHashMap2112.put("country_phone_code", new tjo0(0, 1, "country_phone_code", "INTEGER", null, true));
                        linkedHashMap2112.put("country_code", new tjo0(0, 1, "country_code", "TEXT", null, true));
                        linkedHashMap2112.put("country_currency_id", new tjo0(0, 1, "country_currency_id", "INTEGER", null, true));
                        linkedHashMap2112.put("country_image", new tjo0(0, 1, "country_image", "TEXT", null, true));
                        linkedHashMap2112.put("phone_mask_max_length", new tjo0(0, 1, "phone_mask_max_length", "INTEGER", "0", true));
                        linkedHashMap2112.put("phone_mask_min_length", new tjo0(0, 1, "phone_mask_min_length", "INTEGER", "0", true));
                        linkedHashMap2112.put("phone_mask", new tjo0(0, 1, "phone_mask", "TEXT", "''", true));
                        zjo0Var24 = new zjo0("country", linkedHashMap2112, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = qpg0Var2;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = null;
                        je70Var.m = null;
                        je70Var.n = null;
                        je70Var.o = null;
                        je70Var.p = null;
                        je70Var.q = null;
                        je70Var.r = zjo0Var24;
                        je70Var.A = 9;
                        objG = c9x.G(qpg0Var2, "country", je70Var);
                        if (objG != wneVar) {
                            zjo0Var25 = zjo0Var24;
                            zjo0Var26 = (zjo0) objG;
                            if (!zjo0Var25.equals(zjo0Var26)) {
                                return new eeg0("country(org.xplatform.onexdatabase.entity.CountryEntity).\n Expected:\n" + zjo0Var25 + "\n Found:\n" + zjo0Var26, false);
                            }
                            LinkedHashMap linkedHashMap111116 = new LinkedHashMap();
                            linkedHashMap111116.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                            linkedHashMap111116.put(ParameterNames.HIDDEN, new tjo0(0, 1, ParameterNames.HIDDEN, "INTEGER", null, true));
                            linkedHashMap111116.put("pinned_position", new tjo0(0, 1, "pinned_position", "INTEGER", null, true));
                            zjo0Var27 = new zjo0("market_filter", linkedHashMap111116, new LinkedHashSet(), new LinkedHashSet());
                            je70Var.i = qpg0Var2;
                            je70Var.j = null;
                            je70Var.k = null;
                            je70Var.l = null;
                            je70Var.m = null;
                            je70Var.n = null;
                            je70Var.o = null;
                            je70Var.p = null;
                            je70Var.q = null;
                            je70Var.r = null;
                            je70Var.s = zjo0Var27;
                            je70Var.A = 10;
                            objG = c9x.G(qpg0Var2, "market_filter", je70Var);
                            if (objG != wneVar) {
                                zjo0Var28 = zjo0Var27;
                                zjo0Var29 = (zjo0) objG;
                                if (!zjo0Var28.equals(zjo0Var29)) {
                                    return new eeg0("market_filter(org.xplatform.onexdatabase.entity.MarketFilterEntity).\n Expected:\n" + zjo0Var28 + "\n Found:\n" + zjo0Var29, false);
                                }
                                LinkedHashMap linkedHashMap111117 = new LinkedHashMap();
                                linkedHashMap111117.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                linkedHashMap111117.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                                linkedHashMap111117.put("itemId", new tjo0(0, 1, "itemId", "INTEGER", null, true));
                                linkedHashMap111117.put("title", new tjo0(0, 1, "title", "TEXT", null, true));
                                zjo0Var30 = new zjo0("statistic_dictionaries", linkedHashMap111117, new LinkedHashSet(), new LinkedHashSet());
                                je70Var.i = qpg0Var2;
                                je70Var.j = null;
                                je70Var.k = null;
                                je70Var.l = null;
                                je70Var.m = null;
                                je70Var.n = null;
                                je70Var.o = null;
                                je70Var.p = null;
                                je70Var.q = null;
                                je70Var.r = null;
                                je70Var.s = null;
                                je70Var.t = zjo0Var30;
                                je70Var.A = 11;
                                objG = c9x.G(qpg0Var2, "statistic_dictionaries", je70Var);
                                if (objG != wneVar) {
                                    zjo0Var31 = zjo0Var30;
                                    zjo0Var32 = (zjo0) objG;
                                    if (!zjo0Var31.equals(zjo0Var32)) {
                                        return new eeg0("statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n" + zjo0Var31 + "\n Found:\n" + zjo0Var32, false);
                                    }
                                    LinkedHashMap linkedHashMap111118 = new LinkedHashMap();
                                    linkedHashMap111118.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                    linkedHashMap111118.put("registration_type_id", new tjo0(0, 1, "registration_type_id", "INTEGER", null, true));
                                    linkedHashMap111118.put("field_name", new tjo0(0, 1, "field_name", "TEXT", null, true));
                                    linkedHashMap111118.put("is_required", new tjo0(0, 1, "is_required", "INTEGER", null, true));
                                    linkedHashMap111118.put("is_hidden", new tjo0(0, 1, "is_hidden", "INTEGER", null, true));
                                    linkedHashMap111118.put("min_age", new tjo0(0, 1, "min_age", "TEXT", null, false));
                                    zjo0Var33 = new zjo0("registration", linkedHashMap111118, new LinkedHashSet(), new LinkedHashSet());
                                    je70Var.i = qpg0Var2;
                                    je70Var.j = null;
                                    je70Var.k = null;
                                    je70Var.l = null;
                                    je70Var.m = null;
                                    je70Var.n = null;
                                    je70Var.o = null;
                                    je70Var.p = null;
                                    je70Var.q = null;
                                    je70Var.r = null;
                                    je70Var.s = null;
                                    je70Var.t = null;
                                    je70Var.u = zjo0Var33;
                                    je70Var.A = 12;
                                    objG = c9x.G(qpg0Var2, "registration", je70Var);
                                    if (objG != wneVar) {
                                        zjo0Var34 = zjo0Var33;
                                        zjo0Var35 = (zjo0) objG;
                                        if (!zjo0Var34.equals(zjo0Var35)) {
                                            return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                                        }
                                        LinkedHashMap linkedHashMap111119 = new LinkedHashMap();
                                        linkedHashMap111119.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                                        linkedHashMap111119.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                                        linkedHashMap111119.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                                        linkedHashMap111119.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                                        zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap111119, new LinkedHashSet(), new LinkedHashSet());
                                        je70Var.i = qpg0Var2;
                                        je70Var.j = null;
                                        je70Var.k = null;
                                        je70Var.l = null;
                                        je70Var.m = null;
                                        je70Var.n = null;
                                        je70Var.o = null;
                                        je70Var.p = null;
                                        je70Var.q = null;
                                        je70Var.r = null;
                                        je70Var.s = null;
                                        je70Var.t = null;
                                        je70Var.u = null;
                                        je70Var.v = zjo0Var36;
                                        je70Var.A = 13;
                                        objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                                        if (objG != wneVar) {
                                            zjo0Var37 = zjo0Var36;
                                            zjo0Var38 = (zjo0) objG;
                                            if (!zjo0Var37.equals(zjo0Var38)) {
                                                return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                                            }
                                            LinkedHashMap linkedHashMap1111110 = new LinkedHashMap();
                                            linkedHashMap1111110.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                            zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap1111110, new LinkedHashSet(), new LinkedHashSet());
                                            je70Var.i = qpg0Var2;
                                            je70Var.j = null;
                                            je70Var.k = null;
                                            je70Var.l = null;
                                            je70Var.m = null;
                                            je70Var.n = null;
                                            je70Var.o = null;
                                            je70Var.p = null;
                                            je70Var.q = null;
                                            je70Var.r = null;
                                            je70Var.s = null;
                                            je70Var.t = null;
                                            je70Var.u = null;
                                            je70Var.v = null;
                                            je70Var.w = zjo0Var39;
                                            je70Var.A = 14;
                                            objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                                            if (objG != wneVar) {
                                                zjo0Var40 = zjo0Var39;
                                                zjo0Var41 = (zjo0) objG;
                                                if (!zjo0Var40.equals(zjo0Var41)) {
                                                    return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                                                }
                                                LinkedHashMap linkedHashMap1111111 = new LinkedHashMap();
                                                linkedHashMap1111111.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                                zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap1111111, new LinkedHashSet(), new LinkedHashSet());
                                                je70Var.i = null;
                                                je70Var.j = null;
                                                je70Var.k = null;
                                                je70Var.l = null;
                                                je70Var.m = null;
                                                je70Var.n = null;
                                                je70Var.o = null;
                                                je70Var.p = null;
                                                je70Var.q = null;
                                                je70Var.r = null;
                                                je70Var.s = null;
                                                je70Var.t = null;
                                                je70Var.u = null;
                                                je70Var.v = null;
                                                je70Var.w = null;
                                                je70Var.x = zjo0Var42;
                                                je70Var.A = 15;
                                                objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                                                if (objG != wneVar) {
                                                    zjo0Var43 = zjo0Var42;
                                                    zjo0Var44 = (zjo0) objG;
                                                    if (!zjo0Var43.equals(zjo0Var44)) {
                                                        return new eeg0(null, true);
                                                    }
                                                    return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 7:
                zjo0Var19 = je70Var.p;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var20 = (zjo0) objG;
                if (!zjo0Var19.equals(zjo0Var20)) {
                    return new eeg0("strings(org.xplatform.onexdatabase.entity.AppString).\n Expected:\n" + zjo0Var19 + "\n Found:\n" + zjo0Var20, false);
                }
                LinkedHashMap linkedHashMap2113 = new LinkedHashMap();
                linkedHashMap2113.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                linkedHashMap2113.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                linkedHashMap2113.put("date", new tjo0(0, 1, "date", "INTEGER", null, true));
                zjo0Var21 = new zjo0("last_action", linkedHashMap2113, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var2;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = null;
                je70Var.m = null;
                je70Var.n = null;
                je70Var.o = null;
                je70Var.p = null;
                je70Var.q = zjo0Var21;
                je70Var.A = 8;
                objG = c9x.G(qpg0Var2, "last_action", je70Var);
                if (objG != wneVar) {
                    zjo0Var22 = zjo0Var21;
                    zjo0Var23 = (zjo0) objG;
                    if (!zjo0Var22.equals(zjo0Var23)) {
                        return new eeg0("last_action(org.xplatform.onexdatabase.entity.LastAction).\n Expected:\n" + zjo0Var22 + "\n Found:\n" + zjo0Var23, false);
                    }
                    LinkedHashMap linkedHashMap2114 = new LinkedHashMap();
                    linkedHashMap2114.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                    linkedHashMap2114.put("country_name", new tjo0(0, 1, "country_name", "TEXT", null, true));
                    linkedHashMap2114.put("country_phone_code", new tjo0(0, 1, "country_phone_code", "INTEGER", null, true));
                    linkedHashMap2114.put("country_code", new tjo0(0, 1, "country_code", "TEXT", null, true));
                    linkedHashMap2114.put("country_currency_id", new tjo0(0, 1, "country_currency_id", "INTEGER", null, true));
                    linkedHashMap2114.put("country_image", new tjo0(0, 1, "country_image", "TEXT", null, true));
                    linkedHashMap2114.put("phone_mask_max_length", new tjo0(0, 1, "phone_mask_max_length", "INTEGER", "0", true));
                    linkedHashMap2114.put("phone_mask_min_length", new tjo0(0, 1, "phone_mask_min_length", "INTEGER", "0", true));
                    linkedHashMap2114.put("phone_mask", new tjo0(0, 1, "phone_mask", "TEXT", "''", true));
                    zjo0Var24 = new zjo0("country", linkedHashMap2114, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var2;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = null;
                    je70Var.m = null;
                    je70Var.n = null;
                    je70Var.o = null;
                    je70Var.p = null;
                    je70Var.q = null;
                    je70Var.r = zjo0Var24;
                    je70Var.A = 9;
                    objG = c9x.G(qpg0Var2, "country", je70Var);
                    if (objG != wneVar) {
                        zjo0Var25 = zjo0Var24;
                        zjo0Var26 = (zjo0) objG;
                        if (!zjo0Var25.equals(zjo0Var26)) {
                            return new eeg0("country(org.xplatform.onexdatabase.entity.CountryEntity).\n Expected:\n" + zjo0Var25 + "\n Found:\n" + zjo0Var26, false);
                        }
                        LinkedHashMap linkedHashMap1111112 = new LinkedHashMap();
                        linkedHashMap1111112.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                        linkedHashMap1111112.put(ParameterNames.HIDDEN, new tjo0(0, 1, ParameterNames.HIDDEN, "INTEGER", null, true));
                        linkedHashMap1111112.put("pinned_position", new tjo0(0, 1, "pinned_position", "INTEGER", null, true));
                        zjo0Var27 = new zjo0("market_filter", linkedHashMap1111112, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = qpg0Var2;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = null;
                        je70Var.m = null;
                        je70Var.n = null;
                        je70Var.o = null;
                        je70Var.p = null;
                        je70Var.q = null;
                        je70Var.r = null;
                        je70Var.s = zjo0Var27;
                        je70Var.A = 10;
                        objG = c9x.G(qpg0Var2, "market_filter", je70Var);
                        if (objG != wneVar) {
                            zjo0Var28 = zjo0Var27;
                            zjo0Var29 = (zjo0) objG;
                            if (!zjo0Var28.equals(zjo0Var29)) {
                                return new eeg0("market_filter(org.xplatform.onexdatabase.entity.MarketFilterEntity).\n Expected:\n" + zjo0Var28 + "\n Found:\n" + zjo0Var29, false);
                            }
                            LinkedHashMap linkedHashMap1111113 = new LinkedHashMap();
                            linkedHashMap1111113.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                            linkedHashMap1111113.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                            linkedHashMap1111113.put("itemId", new tjo0(0, 1, "itemId", "INTEGER", null, true));
                            linkedHashMap1111113.put("title", new tjo0(0, 1, "title", "TEXT", null, true));
                            zjo0Var30 = new zjo0("statistic_dictionaries", linkedHashMap1111113, new LinkedHashSet(), new LinkedHashSet());
                            je70Var.i = qpg0Var2;
                            je70Var.j = null;
                            je70Var.k = null;
                            je70Var.l = null;
                            je70Var.m = null;
                            je70Var.n = null;
                            je70Var.o = null;
                            je70Var.p = null;
                            je70Var.q = null;
                            je70Var.r = null;
                            je70Var.s = null;
                            je70Var.t = zjo0Var30;
                            je70Var.A = 11;
                            objG = c9x.G(qpg0Var2, "statistic_dictionaries", je70Var);
                            if (objG != wneVar) {
                                zjo0Var31 = zjo0Var30;
                                zjo0Var32 = (zjo0) objG;
                                if (!zjo0Var31.equals(zjo0Var32)) {
                                    return new eeg0("statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n" + zjo0Var31 + "\n Found:\n" + zjo0Var32, false);
                                }
                                LinkedHashMap linkedHashMap1111114 = new LinkedHashMap();
                                linkedHashMap1111114.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                linkedHashMap1111114.put("registration_type_id", new tjo0(0, 1, "registration_type_id", "INTEGER", null, true));
                                linkedHashMap1111114.put("field_name", new tjo0(0, 1, "field_name", "TEXT", null, true));
                                linkedHashMap1111114.put("is_required", new tjo0(0, 1, "is_required", "INTEGER", null, true));
                                linkedHashMap1111114.put("is_hidden", new tjo0(0, 1, "is_hidden", "INTEGER", null, true));
                                linkedHashMap1111114.put("min_age", new tjo0(0, 1, "min_age", "TEXT", null, false));
                                zjo0Var33 = new zjo0("registration", linkedHashMap1111114, new LinkedHashSet(), new LinkedHashSet());
                                je70Var.i = qpg0Var2;
                                je70Var.j = null;
                                je70Var.k = null;
                                je70Var.l = null;
                                je70Var.m = null;
                                je70Var.n = null;
                                je70Var.o = null;
                                je70Var.p = null;
                                je70Var.q = null;
                                je70Var.r = null;
                                je70Var.s = null;
                                je70Var.t = null;
                                je70Var.u = zjo0Var33;
                                je70Var.A = 12;
                                objG = c9x.G(qpg0Var2, "registration", je70Var);
                                if (objG != wneVar) {
                                    zjo0Var34 = zjo0Var33;
                                    zjo0Var35 = (zjo0) objG;
                                    if (!zjo0Var34.equals(zjo0Var35)) {
                                        return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                                    }
                                    LinkedHashMap linkedHashMap1111115 = new LinkedHashMap();
                                    linkedHashMap1111115.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                                    linkedHashMap1111115.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                                    linkedHashMap1111115.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                                    linkedHashMap1111115.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                                    zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap1111115, new LinkedHashSet(), new LinkedHashSet());
                                    je70Var.i = qpg0Var2;
                                    je70Var.j = null;
                                    je70Var.k = null;
                                    je70Var.l = null;
                                    je70Var.m = null;
                                    je70Var.n = null;
                                    je70Var.o = null;
                                    je70Var.p = null;
                                    je70Var.q = null;
                                    je70Var.r = null;
                                    je70Var.s = null;
                                    je70Var.t = null;
                                    je70Var.u = null;
                                    je70Var.v = zjo0Var36;
                                    je70Var.A = 13;
                                    objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                                    if (objG != wneVar) {
                                        zjo0Var37 = zjo0Var36;
                                        zjo0Var38 = (zjo0) objG;
                                        if (!zjo0Var37.equals(zjo0Var38)) {
                                            return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                                        }
                                        LinkedHashMap linkedHashMap1111116 = new LinkedHashMap();
                                        linkedHashMap1111116.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                        zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap1111116, new LinkedHashSet(), new LinkedHashSet());
                                        je70Var.i = qpg0Var2;
                                        je70Var.j = null;
                                        je70Var.k = null;
                                        je70Var.l = null;
                                        je70Var.m = null;
                                        je70Var.n = null;
                                        je70Var.o = null;
                                        je70Var.p = null;
                                        je70Var.q = null;
                                        je70Var.r = null;
                                        je70Var.s = null;
                                        je70Var.t = null;
                                        je70Var.u = null;
                                        je70Var.v = null;
                                        je70Var.w = zjo0Var39;
                                        je70Var.A = 14;
                                        objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                                        if (objG != wneVar) {
                                            zjo0Var40 = zjo0Var39;
                                            zjo0Var41 = (zjo0) objG;
                                            if (!zjo0Var40.equals(zjo0Var41)) {
                                                return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                                            }
                                            LinkedHashMap linkedHashMap1111117 = new LinkedHashMap();
                                            linkedHashMap1111117.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                            zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap1111117, new LinkedHashSet(), new LinkedHashSet());
                                            je70Var.i = null;
                                            je70Var.j = null;
                                            je70Var.k = null;
                                            je70Var.l = null;
                                            je70Var.m = null;
                                            je70Var.n = null;
                                            je70Var.o = null;
                                            je70Var.p = null;
                                            je70Var.q = null;
                                            je70Var.r = null;
                                            je70Var.s = null;
                                            je70Var.t = null;
                                            je70Var.u = null;
                                            je70Var.v = null;
                                            je70Var.w = null;
                                            je70Var.x = zjo0Var42;
                                            je70Var.A = 15;
                                            objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                                            if (objG != wneVar) {
                                                zjo0Var43 = zjo0Var42;
                                                zjo0Var44 = (zjo0) objG;
                                                if (!zjo0Var43.equals(zjo0Var44)) {
                                                    return new eeg0(null, true);
                                                }
                                                return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 8:
                zjo0Var22 = je70Var.q;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var23 = (zjo0) objG;
                if (!zjo0Var22.equals(zjo0Var23)) {
                    return new eeg0("last_action(org.xplatform.onexdatabase.entity.LastAction).\n Expected:\n" + zjo0Var22 + "\n Found:\n" + zjo0Var23, false);
                }
                LinkedHashMap linkedHashMap2115 = new LinkedHashMap();
                linkedHashMap2115.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                linkedHashMap2115.put("country_name", new tjo0(0, 1, "country_name", "TEXT", null, true));
                linkedHashMap2115.put("country_phone_code", new tjo0(0, 1, "country_phone_code", "INTEGER", null, true));
                linkedHashMap2115.put("country_code", new tjo0(0, 1, "country_code", "TEXT", null, true));
                linkedHashMap2115.put("country_currency_id", new tjo0(0, 1, "country_currency_id", "INTEGER", null, true));
                linkedHashMap2115.put("country_image", new tjo0(0, 1, "country_image", "TEXT", null, true));
                linkedHashMap2115.put("phone_mask_max_length", new tjo0(0, 1, "phone_mask_max_length", "INTEGER", "0", true));
                linkedHashMap2115.put("phone_mask_min_length", new tjo0(0, 1, "phone_mask_min_length", "INTEGER", "0", true));
                linkedHashMap2115.put("phone_mask", new tjo0(0, 1, "phone_mask", "TEXT", "''", true));
                zjo0Var24 = new zjo0("country", linkedHashMap2115, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var2;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = null;
                je70Var.m = null;
                je70Var.n = null;
                je70Var.o = null;
                je70Var.p = null;
                je70Var.q = null;
                je70Var.r = zjo0Var24;
                je70Var.A = 9;
                objG = c9x.G(qpg0Var2, "country", je70Var);
                if (objG != wneVar) {
                    zjo0Var25 = zjo0Var24;
                    zjo0Var26 = (zjo0) objG;
                    if (!zjo0Var25.equals(zjo0Var26)) {
                        return new eeg0("country(org.xplatform.onexdatabase.entity.CountryEntity).\n Expected:\n" + zjo0Var25 + "\n Found:\n" + zjo0Var26, false);
                    }
                    LinkedHashMap linkedHashMap1111118 = new LinkedHashMap();
                    linkedHashMap1111118.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                    linkedHashMap1111118.put(ParameterNames.HIDDEN, new tjo0(0, 1, ParameterNames.HIDDEN, "INTEGER", null, true));
                    linkedHashMap1111118.put("pinned_position", new tjo0(0, 1, "pinned_position", "INTEGER", null, true));
                    zjo0Var27 = new zjo0("market_filter", linkedHashMap1111118, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var2;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = null;
                    je70Var.m = null;
                    je70Var.n = null;
                    je70Var.o = null;
                    je70Var.p = null;
                    je70Var.q = null;
                    je70Var.r = null;
                    je70Var.s = zjo0Var27;
                    je70Var.A = 10;
                    objG = c9x.G(qpg0Var2, "market_filter", je70Var);
                    if (objG != wneVar) {
                        zjo0Var28 = zjo0Var27;
                        zjo0Var29 = (zjo0) objG;
                        if (!zjo0Var28.equals(zjo0Var29)) {
                            return new eeg0("market_filter(org.xplatform.onexdatabase.entity.MarketFilterEntity).\n Expected:\n" + zjo0Var28 + "\n Found:\n" + zjo0Var29, false);
                        }
                        LinkedHashMap linkedHashMap1111119 = new LinkedHashMap();
                        linkedHashMap1111119.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                        linkedHashMap1111119.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                        linkedHashMap1111119.put("itemId", new tjo0(0, 1, "itemId", "INTEGER", null, true));
                        linkedHashMap1111119.put("title", new tjo0(0, 1, "title", "TEXT", null, true));
                        zjo0Var30 = new zjo0("statistic_dictionaries", linkedHashMap1111119, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = qpg0Var2;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = null;
                        je70Var.m = null;
                        je70Var.n = null;
                        je70Var.o = null;
                        je70Var.p = null;
                        je70Var.q = null;
                        je70Var.r = null;
                        je70Var.s = null;
                        je70Var.t = zjo0Var30;
                        je70Var.A = 11;
                        objG = c9x.G(qpg0Var2, "statistic_dictionaries", je70Var);
                        if (objG != wneVar) {
                            zjo0Var31 = zjo0Var30;
                            zjo0Var32 = (zjo0) objG;
                            if (!zjo0Var31.equals(zjo0Var32)) {
                                return new eeg0("statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n" + zjo0Var31 + "\n Found:\n" + zjo0Var32, false);
                            }
                            LinkedHashMap linkedHashMap11111110 = new LinkedHashMap();
                            linkedHashMap11111110.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                            linkedHashMap11111110.put("registration_type_id", new tjo0(0, 1, "registration_type_id", "INTEGER", null, true));
                            linkedHashMap11111110.put("field_name", new tjo0(0, 1, "field_name", "TEXT", null, true));
                            linkedHashMap11111110.put("is_required", new tjo0(0, 1, "is_required", "INTEGER", null, true));
                            linkedHashMap11111110.put("is_hidden", new tjo0(0, 1, "is_hidden", "INTEGER", null, true));
                            linkedHashMap11111110.put("min_age", new tjo0(0, 1, "min_age", "TEXT", null, false));
                            zjo0Var33 = new zjo0("registration", linkedHashMap11111110, new LinkedHashSet(), new LinkedHashSet());
                            je70Var.i = qpg0Var2;
                            je70Var.j = null;
                            je70Var.k = null;
                            je70Var.l = null;
                            je70Var.m = null;
                            je70Var.n = null;
                            je70Var.o = null;
                            je70Var.p = null;
                            je70Var.q = null;
                            je70Var.r = null;
                            je70Var.s = null;
                            je70Var.t = null;
                            je70Var.u = zjo0Var33;
                            je70Var.A = 12;
                            objG = c9x.G(qpg0Var2, "registration", je70Var);
                            if (objG != wneVar) {
                                zjo0Var34 = zjo0Var33;
                                zjo0Var35 = (zjo0) objG;
                                if (!zjo0Var34.equals(zjo0Var35)) {
                                    return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                                }
                                LinkedHashMap linkedHashMap11111111 = new LinkedHashMap();
                                linkedHashMap11111111.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                                linkedHashMap11111111.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                                linkedHashMap11111111.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                                linkedHashMap11111111.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                                zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap11111111, new LinkedHashSet(), new LinkedHashSet());
                                je70Var.i = qpg0Var2;
                                je70Var.j = null;
                                je70Var.k = null;
                                je70Var.l = null;
                                je70Var.m = null;
                                je70Var.n = null;
                                je70Var.o = null;
                                je70Var.p = null;
                                je70Var.q = null;
                                je70Var.r = null;
                                je70Var.s = null;
                                je70Var.t = null;
                                je70Var.u = null;
                                je70Var.v = zjo0Var36;
                                je70Var.A = 13;
                                objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                                if (objG != wneVar) {
                                    zjo0Var37 = zjo0Var36;
                                    zjo0Var38 = (zjo0) objG;
                                    if (!zjo0Var37.equals(zjo0Var38)) {
                                        return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                                    }
                                    LinkedHashMap linkedHashMap11111112 = new LinkedHashMap();
                                    linkedHashMap11111112.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                    zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap11111112, new LinkedHashSet(), new LinkedHashSet());
                                    je70Var.i = qpg0Var2;
                                    je70Var.j = null;
                                    je70Var.k = null;
                                    je70Var.l = null;
                                    je70Var.m = null;
                                    je70Var.n = null;
                                    je70Var.o = null;
                                    je70Var.p = null;
                                    je70Var.q = null;
                                    je70Var.r = null;
                                    je70Var.s = null;
                                    je70Var.t = null;
                                    je70Var.u = null;
                                    je70Var.v = null;
                                    je70Var.w = zjo0Var39;
                                    je70Var.A = 14;
                                    objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                                    if (objG != wneVar) {
                                        zjo0Var40 = zjo0Var39;
                                        zjo0Var41 = (zjo0) objG;
                                        if (!zjo0Var40.equals(zjo0Var41)) {
                                            return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                                        }
                                        LinkedHashMap linkedHashMap11111113 = new LinkedHashMap();
                                        linkedHashMap11111113.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                        zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap11111113, new LinkedHashSet(), new LinkedHashSet());
                                        je70Var.i = null;
                                        je70Var.j = null;
                                        je70Var.k = null;
                                        je70Var.l = null;
                                        je70Var.m = null;
                                        je70Var.n = null;
                                        je70Var.o = null;
                                        je70Var.p = null;
                                        je70Var.q = null;
                                        je70Var.r = null;
                                        je70Var.s = null;
                                        je70Var.t = null;
                                        je70Var.u = null;
                                        je70Var.v = null;
                                        je70Var.w = null;
                                        je70Var.x = zjo0Var42;
                                        je70Var.A = 15;
                                        objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                                        if (objG != wneVar) {
                                            zjo0Var43 = zjo0Var42;
                                            zjo0Var44 = (zjo0) objG;
                                            if (!zjo0Var43.equals(zjo0Var44)) {
                                                return new eeg0(null, true);
                                            }
                                            return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 9:
                zjo0Var25 = je70Var.r;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var26 = (zjo0) objG;
                if (!zjo0Var25.equals(zjo0Var26)) {
                    return new eeg0("country(org.xplatform.onexdatabase.entity.CountryEntity).\n Expected:\n" + zjo0Var25 + "\n Found:\n" + zjo0Var26, false);
                }
                LinkedHashMap linkedHashMap11111114 = new LinkedHashMap();
                linkedHashMap11111114.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                linkedHashMap11111114.put(ParameterNames.HIDDEN, new tjo0(0, 1, ParameterNames.HIDDEN, "INTEGER", null, true));
                linkedHashMap11111114.put("pinned_position", new tjo0(0, 1, "pinned_position", "INTEGER", null, true));
                zjo0Var27 = new zjo0("market_filter", linkedHashMap11111114, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var2;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = null;
                je70Var.m = null;
                je70Var.n = null;
                je70Var.o = null;
                je70Var.p = null;
                je70Var.q = null;
                je70Var.r = null;
                je70Var.s = zjo0Var27;
                je70Var.A = 10;
                objG = c9x.G(qpg0Var2, "market_filter", je70Var);
                if (objG != wneVar) {
                    zjo0Var28 = zjo0Var27;
                    zjo0Var29 = (zjo0) objG;
                    if (!zjo0Var28.equals(zjo0Var29)) {
                        return new eeg0("market_filter(org.xplatform.onexdatabase.entity.MarketFilterEntity).\n Expected:\n" + zjo0Var28 + "\n Found:\n" + zjo0Var29, false);
                    }
                    LinkedHashMap linkedHashMap11111115 = new LinkedHashMap();
                    linkedHashMap11111115.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                    linkedHashMap11111115.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                    linkedHashMap11111115.put("itemId", new tjo0(0, 1, "itemId", "INTEGER", null, true));
                    linkedHashMap11111115.put("title", new tjo0(0, 1, "title", "TEXT", null, true));
                    zjo0Var30 = new zjo0("statistic_dictionaries", linkedHashMap11111115, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var2;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = null;
                    je70Var.m = null;
                    je70Var.n = null;
                    je70Var.o = null;
                    je70Var.p = null;
                    je70Var.q = null;
                    je70Var.r = null;
                    je70Var.s = null;
                    je70Var.t = zjo0Var30;
                    je70Var.A = 11;
                    objG = c9x.G(qpg0Var2, "statistic_dictionaries", je70Var);
                    if (objG != wneVar) {
                        zjo0Var31 = zjo0Var30;
                        zjo0Var32 = (zjo0) objG;
                        if (!zjo0Var31.equals(zjo0Var32)) {
                            return new eeg0("statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n" + zjo0Var31 + "\n Found:\n" + zjo0Var32, false);
                        }
                        LinkedHashMap linkedHashMap11111116 = new LinkedHashMap();
                        linkedHashMap11111116.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                        linkedHashMap11111116.put("registration_type_id", new tjo0(0, 1, "registration_type_id", "INTEGER", null, true));
                        linkedHashMap11111116.put("field_name", new tjo0(0, 1, "field_name", "TEXT", null, true));
                        linkedHashMap11111116.put("is_required", new tjo0(0, 1, "is_required", "INTEGER", null, true));
                        linkedHashMap11111116.put("is_hidden", new tjo0(0, 1, "is_hidden", "INTEGER", null, true));
                        linkedHashMap11111116.put("min_age", new tjo0(0, 1, "min_age", "TEXT", null, false));
                        zjo0Var33 = new zjo0("registration", linkedHashMap11111116, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = qpg0Var2;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = null;
                        je70Var.m = null;
                        je70Var.n = null;
                        je70Var.o = null;
                        je70Var.p = null;
                        je70Var.q = null;
                        je70Var.r = null;
                        je70Var.s = null;
                        je70Var.t = null;
                        je70Var.u = zjo0Var33;
                        je70Var.A = 12;
                        objG = c9x.G(qpg0Var2, "registration", je70Var);
                        if (objG != wneVar) {
                            zjo0Var34 = zjo0Var33;
                            zjo0Var35 = (zjo0) objG;
                            if (!zjo0Var34.equals(zjo0Var35)) {
                                return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                            }
                            LinkedHashMap linkedHashMap11111117 = new LinkedHashMap();
                            linkedHashMap11111117.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                            linkedHashMap11111117.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                            linkedHashMap11111117.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                            linkedHashMap11111117.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                            zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap11111117, new LinkedHashSet(), new LinkedHashSet());
                            je70Var.i = qpg0Var2;
                            je70Var.j = null;
                            je70Var.k = null;
                            je70Var.l = null;
                            je70Var.m = null;
                            je70Var.n = null;
                            je70Var.o = null;
                            je70Var.p = null;
                            je70Var.q = null;
                            je70Var.r = null;
                            je70Var.s = null;
                            je70Var.t = null;
                            je70Var.u = null;
                            je70Var.v = zjo0Var36;
                            je70Var.A = 13;
                            objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                            if (objG != wneVar) {
                                zjo0Var37 = zjo0Var36;
                                zjo0Var38 = (zjo0) objG;
                                if (!zjo0Var37.equals(zjo0Var38)) {
                                    return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                                }
                                LinkedHashMap linkedHashMap11111118 = new LinkedHashMap();
                                linkedHashMap11111118.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap11111118, new LinkedHashSet(), new LinkedHashSet());
                                je70Var.i = qpg0Var2;
                                je70Var.j = null;
                                je70Var.k = null;
                                je70Var.l = null;
                                je70Var.m = null;
                                je70Var.n = null;
                                je70Var.o = null;
                                je70Var.p = null;
                                je70Var.q = null;
                                je70Var.r = null;
                                je70Var.s = null;
                                je70Var.t = null;
                                je70Var.u = null;
                                je70Var.v = null;
                                je70Var.w = zjo0Var39;
                                je70Var.A = 14;
                                objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                                if (objG != wneVar) {
                                    zjo0Var40 = zjo0Var39;
                                    zjo0Var41 = (zjo0) objG;
                                    if (!zjo0Var40.equals(zjo0Var41)) {
                                        return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                                    }
                                    LinkedHashMap linkedHashMap11111119 = new LinkedHashMap();
                                    linkedHashMap11111119.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                    zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap11111119, new LinkedHashSet(), new LinkedHashSet());
                                    je70Var.i = null;
                                    je70Var.j = null;
                                    je70Var.k = null;
                                    je70Var.l = null;
                                    je70Var.m = null;
                                    je70Var.n = null;
                                    je70Var.o = null;
                                    je70Var.p = null;
                                    je70Var.q = null;
                                    je70Var.r = null;
                                    je70Var.s = null;
                                    je70Var.t = null;
                                    je70Var.u = null;
                                    je70Var.v = null;
                                    je70Var.w = null;
                                    je70Var.x = zjo0Var42;
                                    je70Var.A = 15;
                                    objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                                    if (objG != wneVar) {
                                        zjo0Var43 = zjo0Var42;
                                        zjo0Var44 = (zjo0) objG;
                                        if (!zjo0Var43.equals(zjo0Var44)) {
                                            return new eeg0(null, true);
                                        }
                                        return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                                    }
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 10:
                zjo0Var28 = je70Var.s;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var29 = (zjo0) objG;
                if (!zjo0Var28.equals(zjo0Var29)) {
                    return new eeg0("market_filter(org.xplatform.onexdatabase.entity.MarketFilterEntity).\n Expected:\n" + zjo0Var28 + "\n Found:\n" + zjo0Var29, false);
                }
                LinkedHashMap linkedHashMap111111110 = new LinkedHashMap();
                linkedHashMap111111110.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                linkedHashMap111111110.put(Payload.TYPE, new tjo0(0, 1, Payload.TYPE, "INTEGER", null, true));
                linkedHashMap111111110.put("itemId", new tjo0(0, 1, "itemId", "INTEGER", null, true));
                linkedHashMap111111110.put("title", new tjo0(0, 1, "title", "TEXT", null, true));
                zjo0Var30 = new zjo0("statistic_dictionaries", linkedHashMap111111110, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var2;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = null;
                je70Var.m = null;
                je70Var.n = null;
                je70Var.o = null;
                je70Var.p = null;
                je70Var.q = null;
                je70Var.r = null;
                je70Var.s = null;
                je70Var.t = zjo0Var30;
                je70Var.A = 11;
                objG = c9x.G(qpg0Var2, "statistic_dictionaries", je70Var);
                if (objG != wneVar) {
                    zjo0Var31 = zjo0Var30;
                    zjo0Var32 = (zjo0) objG;
                    if (!zjo0Var31.equals(zjo0Var32)) {
                        return new eeg0("statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n" + zjo0Var31 + "\n Found:\n" + zjo0Var32, false);
                    }
                    LinkedHashMap linkedHashMap111111111 = new LinkedHashMap();
                    linkedHashMap111111111.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                    linkedHashMap111111111.put("registration_type_id", new tjo0(0, 1, "registration_type_id", "INTEGER", null, true));
                    linkedHashMap111111111.put("field_name", new tjo0(0, 1, "field_name", "TEXT", null, true));
                    linkedHashMap111111111.put("is_required", new tjo0(0, 1, "is_required", "INTEGER", null, true));
                    linkedHashMap111111111.put("is_hidden", new tjo0(0, 1, "is_hidden", "INTEGER", null, true));
                    linkedHashMap111111111.put("min_age", new tjo0(0, 1, "min_age", "TEXT", null, false));
                    zjo0Var33 = new zjo0("registration", linkedHashMap111111111, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var2;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = null;
                    je70Var.m = null;
                    je70Var.n = null;
                    je70Var.o = null;
                    je70Var.p = null;
                    je70Var.q = null;
                    je70Var.r = null;
                    je70Var.s = null;
                    je70Var.t = null;
                    je70Var.u = zjo0Var33;
                    je70Var.A = 12;
                    objG = c9x.G(qpg0Var2, "registration", je70Var);
                    if (objG != wneVar) {
                        zjo0Var34 = zjo0Var33;
                        zjo0Var35 = (zjo0) objG;
                        if (!zjo0Var34.equals(zjo0Var35)) {
                            return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                        }
                        LinkedHashMap linkedHashMap111111112 = new LinkedHashMap();
                        linkedHashMap111111112.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                        linkedHashMap111111112.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                        linkedHashMap111111112.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                        linkedHashMap111111112.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                        zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap111111112, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = qpg0Var2;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = null;
                        je70Var.m = null;
                        je70Var.n = null;
                        je70Var.o = null;
                        je70Var.p = null;
                        je70Var.q = null;
                        je70Var.r = null;
                        je70Var.s = null;
                        je70Var.t = null;
                        je70Var.u = null;
                        je70Var.v = zjo0Var36;
                        je70Var.A = 13;
                        objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                        if (objG != wneVar) {
                            zjo0Var37 = zjo0Var36;
                            zjo0Var38 = (zjo0) objG;
                            if (!zjo0Var37.equals(zjo0Var38)) {
                                return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                            }
                            LinkedHashMap linkedHashMap111111113 = new LinkedHashMap();
                            linkedHashMap111111113.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                            zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap111111113, new LinkedHashSet(), new LinkedHashSet());
                            je70Var.i = qpg0Var2;
                            je70Var.j = null;
                            je70Var.k = null;
                            je70Var.l = null;
                            je70Var.m = null;
                            je70Var.n = null;
                            je70Var.o = null;
                            je70Var.p = null;
                            je70Var.q = null;
                            je70Var.r = null;
                            je70Var.s = null;
                            je70Var.t = null;
                            je70Var.u = null;
                            je70Var.v = null;
                            je70Var.w = zjo0Var39;
                            je70Var.A = 14;
                            objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                            if (objG != wneVar) {
                                zjo0Var40 = zjo0Var39;
                                zjo0Var41 = (zjo0) objG;
                                if (!zjo0Var40.equals(zjo0Var41)) {
                                    return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                                }
                                LinkedHashMap linkedHashMap111111114 = new LinkedHashMap();
                                linkedHashMap111111114.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                                zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap111111114, new LinkedHashSet(), new LinkedHashSet());
                                je70Var.i = null;
                                je70Var.j = null;
                                je70Var.k = null;
                                je70Var.l = null;
                                je70Var.m = null;
                                je70Var.n = null;
                                je70Var.o = null;
                                je70Var.p = null;
                                je70Var.q = null;
                                je70Var.r = null;
                                je70Var.s = null;
                                je70Var.t = null;
                                je70Var.u = null;
                                je70Var.v = null;
                                je70Var.w = null;
                                je70Var.x = zjo0Var42;
                                je70Var.A = 15;
                                objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                                if (objG != wneVar) {
                                    zjo0Var43 = zjo0Var42;
                                    zjo0Var44 = (zjo0) objG;
                                    if (!zjo0Var43.equals(zjo0Var44)) {
                                        return new eeg0(null, true);
                                    }
                                    return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                                }
                            }
                        }
                    }
                }
                return wneVar;
            case 11:
                zjo0Var31 = je70Var.t;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var32 = (zjo0) objG;
                if (!zjo0Var31.equals(zjo0Var32)) {
                    return new eeg0("statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n" + zjo0Var31 + "\n Found:\n" + zjo0Var32, false);
                }
                LinkedHashMap linkedHashMap111111115 = new LinkedHashMap();
                linkedHashMap111111115.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                linkedHashMap111111115.put("registration_type_id", new tjo0(0, 1, "registration_type_id", "INTEGER", null, true));
                linkedHashMap111111115.put("field_name", new tjo0(0, 1, "field_name", "TEXT", null, true));
                linkedHashMap111111115.put("is_required", new tjo0(0, 1, "is_required", "INTEGER", null, true));
                linkedHashMap111111115.put("is_hidden", new tjo0(0, 1, "is_hidden", "INTEGER", null, true));
                linkedHashMap111111115.put("min_age", new tjo0(0, 1, "min_age", "TEXT", null, false));
                zjo0Var33 = new zjo0("registration", linkedHashMap111111115, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var2;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = null;
                je70Var.m = null;
                je70Var.n = null;
                je70Var.o = null;
                je70Var.p = null;
                je70Var.q = null;
                je70Var.r = null;
                je70Var.s = null;
                je70Var.t = null;
                je70Var.u = zjo0Var33;
                je70Var.A = 12;
                objG = c9x.G(qpg0Var2, "registration", je70Var);
                if (objG != wneVar) {
                    zjo0Var34 = zjo0Var33;
                    zjo0Var35 = (zjo0) objG;
                    if (!zjo0Var34.equals(zjo0Var35)) {
                        return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                    }
                    LinkedHashMap linkedHashMap111111116 = new LinkedHashMap();
                    linkedHashMap111111116.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                    linkedHashMap111111116.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                    linkedHashMap111111116.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                    linkedHashMap111111116.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                    zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap111111116, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var2;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = null;
                    je70Var.m = null;
                    je70Var.n = null;
                    je70Var.o = null;
                    je70Var.p = null;
                    je70Var.q = null;
                    je70Var.r = null;
                    je70Var.s = null;
                    je70Var.t = null;
                    je70Var.u = null;
                    je70Var.v = zjo0Var36;
                    je70Var.A = 13;
                    objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                    if (objG != wneVar) {
                        zjo0Var37 = zjo0Var36;
                        zjo0Var38 = (zjo0) objG;
                        if (!zjo0Var37.equals(zjo0Var38)) {
                            return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                        }
                        LinkedHashMap linkedHashMap111111117 = new LinkedHashMap();
                        linkedHashMap111111117.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                        zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap111111117, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = qpg0Var2;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = null;
                        je70Var.m = null;
                        je70Var.n = null;
                        je70Var.o = null;
                        je70Var.p = null;
                        je70Var.q = null;
                        je70Var.r = null;
                        je70Var.s = null;
                        je70Var.t = null;
                        je70Var.u = null;
                        je70Var.v = null;
                        je70Var.w = zjo0Var39;
                        je70Var.A = 14;
                        objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                        if (objG != wneVar) {
                            zjo0Var40 = zjo0Var39;
                            zjo0Var41 = (zjo0) objG;
                            if (!zjo0Var40.equals(zjo0Var41)) {
                                return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                            }
                            LinkedHashMap linkedHashMap111111118 = new LinkedHashMap();
                            linkedHashMap111111118.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                            zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap111111118, new LinkedHashSet(), new LinkedHashSet());
                            je70Var.i = null;
                            je70Var.j = null;
                            je70Var.k = null;
                            je70Var.l = null;
                            je70Var.m = null;
                            je70Var.n = null;
                            je70Var.o = null;
                            je70Var.p = null;
                            je70Var.q = null;
                            je70Var.r = null;
                            je70Var.s = null;
                            je70Var.t = null;
                            je70Var.u = null;
                            je70Var.v = null;
                            je70Var.w = null;
                            je70Var.x = zjo0Var42;
                            je70Var.A = 15;
                            objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                            if (objG != wneVar) {
                                zjo0Var43 = zjo0Var42;
                                zjo0Var44 = (zjo0) objG;
                                if (!zjo0Var43.equals(zjo0Var44)) {
                                    return new eeg0(null, true);
                                }
                                return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                            }
                        }
                    }
                }
                return wneVar;
            case 12:
                zjo0Var34 = je70Var.u;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var35 = (zjo0) objG;
                if (!zjo0Var34.equals(zjo0Var35)) {
                    return new eeg0("registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n" + zjo0Var34 + "\n Found:\n" + zjo0Var35, false);
                }
                LinkedHashMap linkedHashMap111111119 = new LinkedHashMap();
                linkedHashMap111111119.put("balanceId", new tjo0(1, 1, "balanceId", "INTEGER", null, true));
                linkedHashMap111111119.put("firstValue", new tjo0(0, 1, "firstValue", "REAL", null, true));
                linkedHashMap111111119.put("secondValue", new tjo0(0, 1, "secondValue", "REAL", null, true));
                linkedHashMap111111119.put("thirdValue", new tjo0(0, 1, "thirdValue", "REAL", null, true));
                zjo0Var36 = new zjo0("quick_bet_settings_table", linkedHashMap111111119, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var2;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = null;
                je70Var.m = null;
                je70Var.n = null;
                je70Var.o = null;
                je70Var.p = null;
                je70Var.q = null;
                je70Var.r = null;
                je70Var.s = null;
                je70Var.t = null;
                je70Var.u = null;
                je70Var.v = zjo0Var36;
                je70Var.A = 13;
                objG = c9x.G(qpg0Var2, "quick_bet_settings_table", je70Var);
                if (objG != wneVar) {
                    zjo0Var37 = zjo0Var36;
                    zjo0Var38 = (zjo0) objG;
                    if (!zjo0Var37.equals(zjo0Var38)) {
                        return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                    }
                    LinkedHashMap linkedHashMap1111111110 = new LinkedHashMap();
                    linkedHashMap1111111110.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                    zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap1111111110, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = qpg0Var2;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = null;
                    je70Var.m = null;
                    je70Var.n = null;
                    je70Var.o = null;
                    je70Var.p = null;
                    je70Var.q = null;
                    je70Var.r = null;
                    je70Var.s = null;
                    je70Var.t = null;
                    je70Var.u = null;
                    je70Var.v = null;
                    je70Var.w = zjo0Var39;
                    je70Var.A = 14;
                    objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                    if (objG != wneVar) {
                        zjo0Var40 = zjo0Var39;
                        zjo0Var41 = (zjo0) objG;
                        if (!zjo0Var40.equals(zjo0Var41)) {
                            return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                        }
                        LinkedHashMap linkedHashMap1111111111 = new LinkedHashMap();
                        linkedHashMap1111111111.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                        zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap1111111111, new LinkedHashSet(), new LinkedHashSet());
                        je70Var.i = null;
                        je70Var.j = null;
                        je70Var.k = null;
                        je70Var.l = null;
                        je70Var.m = null;
                        je70Var.n = null;
                        je70Var.o = null;
                        je70Var.p = null;
                        je70Var.q = null;
                        je70Var.r = null;
                        je70Var.s = null;
                        je70Var.t = null;
                        je70Var.u = null;
                        je70Var.v = null;
                        je70Var.w = null;
                        je70Var.x = zjo0Var42;
                        je70Var.A = 15;
                        objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                        if (objG != wneVar) {
                            zjo0Var43 = zjo0Var42;
                            zjo0Var44 = (zjo0) objG;
                            if (!zjo0Var43.equals(zjo0Var44)) {
                                return new eeg0(null, true);
                            }
                            return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                        }
                    }
                }
                return wneVar;
            case 13:
                zjo0Var37 = je70Var.v;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var38 = (zjo0) objG;
                if (!zjo0Var37.equals(zjo0Var38)) {
                    return new eeg0("quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n" + zjo0Var37 + "\n Found:\n" + zjo0Var38, false);
                }
                LinkedHashMap linkedHashMap1111111112 = new LinkedHashMap();
                linkedHashMap1111111112.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                zjo0Var39 = new zjo0("news_catalog_banners", linkedHashMap1111111112, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = qpg0Var2;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = null;
                je70Var.m = null;
                je70Var.n = null;
                je70Var.o = null;
                je70Var.p = null;
                je70Var.q = null;
                je70Var.r = null;
                je70Var.s = null;
                je70Var.t = null;
                je70Var.u = null;
                je70Var.v = null;
                je70Var.w = zjo0Var39;
                je70Var.A = 14;
                objG = c9x.G(qpg0Var2, "news_catalog_banners", je70Var);
                if (objG != wneVar) {
                    zjo0Var40 = zjo0Var39;
                    zjo0Var41 = (zjo0) objG;
                    if (!zjo0Var40.equals(zjo0Var41)) {
                        return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                    }
                    LinkedHashMap linkedHashMap1111111113 = new LinkedHashMap();
                    linkedHashMap1111111113.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                    zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap1111111113, new LinkedHashSet(), new LinkedHashSet());
                    je70Var.i = null;
                    je70Var.j = null;
                    je70Var.k = null;
                    je70Var.l = null;
                    je70Var.m = null;
                    je70Var.n = null;
                    je70Var.o = null;
                    je70Var.p = null;
                    je70Var.q = null;
                    je70Var.r = null;
                    je70Var.s = null;
                    je70Var.t = null;
                    je70Var.u = null;
                    je70Var.v = null;
                    je70Var.w = null;
                    je70Var.x = zjo0Var42;
                    je70Var.A = 15;
                    objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                    if (objG != wneVar) {
                        zjo0Var43 = zjo0Var42;
                        zjo0Var44 = (zjo0) objG;
                        if (!zjo0Var43.equals(zjo0Var44)) {
                            return new eeg0(null, true);
                        }
                        return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                    }
                }
                return wneVar;
            case 14:
                zjo0Var40 = je70Var.w;
                qpg0Var2 = je70Var.i;
                z1x.P(objG);
                zjo0Var41 = (zjo0) objG;
                if (!zjo0Var40.equals(zjo0Var41)) {
                    return new eeg0("news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n" + zjo0Var40 + "\n Found:\n" + zjo0Var41, false);
                }
                LinkedHashMap linkedHashMap1111111114 = new LinkedHashMap();
                linkedHashMap1111111114.put(ParameterNames.ID, new tjo0(1, 1, ParameterNames.ID, "INTEGER", null, true));
                zjo0Var42 = new zjo0("news_catalog_cms_banners", linkedHashMap1111111114, new LinkedHashSet(), new LinkedHashSet());
                je70Var.i = null;
                je70Var.j = null;
                je70Var.k = null;
                je70Var.l = null;
                je70Var.m = null;
                je70Var.n = null;
                je70Var.o = null;
                je70Var.p = null;
                je70Var.q = null;
                je70Var.r = null;
                je70Var.s = null;
                je70Var.t = null;
                je70Var.u = null;
                je70Var.v = null;
                je70Var.w = null;
                je70Var.x = zjo0Var42;
                je70Var.A = 15;
                objG = c9x.G(qpg0Var2, "news_catalog_cms_banners", je70Var);
                if (objG != wneVar) {
                    zjo0Var43 = zjo0Var42;
                    zjo0Var44 = (zjo0) objG;
                    if (!zjo0Var43.equals(zjo0Var44)) {
                        return new eeg0(null, true);
                    }
                    return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
                }
                return wneVar;
            case 15:
                zjo0Var43 = je70Var.x;
                z1x.P(objG);
                zjo0Var44 = (zjo0) objG;
                if (!zjo0Var43.equals(zjo0Var44)) {
                    return new eeg0(null, true);
                }
                return new eeg0("news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n" + zjo0Var43 + "\n Found:\n" + zjo0Var44, false);
            default:
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
