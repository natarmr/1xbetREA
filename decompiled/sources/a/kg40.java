package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class kg40 extends dg40 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg40(int i, int i2, byte b) {
        super(i, i2);
        this.c = b;
    }

    @Override // a.dg40
    public final Unit a(qpg0 qpg0Var) {
        switch (this.c) {
            case 0:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN time_start INTEGER NOT NULL DEFAULT 0 ");
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN vid TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN full_name TEXT NOT NULL DEFAULT '' ");
                break;
            case 1:
                n2x.x(qpg0Var, "CREATE TABLE `bet_events_backup` (\n`id` INTEGER  PRIMARY KEY AUTOINCREMENT NOT NULL,\n`game_id` INTEGER  NOT NULL,\n`player_id` INTEGER  NOT NULL,\n`sport_id` INTEGER  NOT NULL,\n`player_name` TEXT  NOT NULL,\n`game_match_name` TEXT  NOT NULL,\n`group_name` TEXT  NOT NULL,\n`express_number` INTEGER  NOT NULL,\n`coefficient` TEXT  NOT NULL,\n`param` TEXT  NOT NULL,\n`time_start` INTEGER  NOT NULL DEFAULT 0,\n`vid` TEXT  NOT NULL DEFAULT '',\n`full_name` TEXT  NOT NULL DEFAULT '',\n`name` TEXT  NOT NULL,\n`kind` INTEGER  NOT NULL,\n`type` INTEGER  NOT NULL\n)");
                n2x.x(qpg0Var, "INSERT INTO bet_events_backup \nSELECT id, \n       game_id,\n       player_id, \n       sport_id,\n       player_name, \n       game_match_name, \n       group_name, \n       express_number, \n       coefficient, \n       param, \n       time_start, \n       vid, \n       full_name, \n       name, \n       kind, \n       type \nFROM bet_events  ");
                n2x.x(qpg0Var, "DROP TABLE bet_events");
                n2x.x(qpg0Var, "ALTER TABLE bet_events_backup RENAME TO bet_events ");
                break;
            case 2:
                n2x.x(qpg0Var, "ALTER TABLE currencies ADD COLUMN initialBet REAL NOT NULL DEFAULT 0 ");
                n2x.x(qpg0Var, "ALTER TABLE currencies ADD COLUMN betStep REAL NOT NULL DEFAULT 0 ");
                break;
            case 3:
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `market_filter` (\n`id` INTEGER PRIMARY KEY NOT NULL, \n`name` TEXT NOT NULL, \n`hidden` INTEGER NOT NULL, \n`pinned_position` INTEGER NOT NULL\n)");
                break;
            case 4:
                n2x.x(qpg0Var, "CREATE TABLE `market_filter_backup` (\n`id` INTEGER  PRIMARY KEY AUTOINCREMENT NOT NULL,\n`hidden` INTEGER  NOT NULL,\n`pinned_position` INTEGER  NOT NULL\n)");
                n2x.x(qpg0Var, "INSERT INTO market_filter_backup \nSELECT id, \n       hidden,\n       pinned_position\nFROM market_filter  ");
                n2x.x(qpg0Var, "DROP TABLE market_filter");
                n2x.x(qpg0Var, "ALTER TABLE market_filter_backup RENAME TO market_filter ");
                break;
            case 5:
                n2x.x(qpg0Var, "CREATE TABLE `statistic_dictionaries` (\n`id` INTEGER PRIMARY KEY NOT NULL, \n`type` INTEGER NOT NULL, \n`itemId` INTEGER NOT NULL, \n`title` TEXT NOT NULL\n)");
                break;
            case 6:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN main_game_id INTEGER NOT NULL DEFAULT 0 ");
                break;
            case 7:
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN cyber INTEGER NOT NULL DEFAULT 0 ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN background TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN background_tablet TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN background_champ_default TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN background_champ_tablet_default TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN background_champ_header_default TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN background_champ_header_tablet_default TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN sub_sports TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN image_small TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN image_popular TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN game_background TEXT NOT NULL DEFAULT '' ");
                break;
            case 8:
                n2x.x(qpg0Var, "delete from sports");
                break;
            case 9:
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN image_champ_small TEXT NOT NULL DEFAULT '' ");
                break;
            case 10:
                n2x.x(qpg0Var, "DROP TABLE `bet_events`");
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `bet_events` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `game_id` INTEGER NOT NULL, \n    `player_id` INTEGER NOT NULL, \n    `sport_id` INTEGER NOT NULL, \n    `player_name` TEXT NOT NULL, \n    `game_match_name` TEXT NOT NULL, \n    `group_name` TEXT NOT NULL, \n    `express_number` INTEGER NOT NULL,\n    `coefficient` TEXT NOT NULL,\n    `param` TEXT NOT NULL,\n    `time` TEXT NOT NULL, \n    `name` TEXT NOT NULL, \n    `kind` INTEGER NOT NULL, \n    `type` INTEGER NOT NULL\n)");
                break;
            case 11:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN players_duel_game TEXT NOT NULL DEFAULT '' ");
                break;
            case 12:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN coupon_entry_feature_id INTEGER DEFAULT 0 NOT NULL");
                break;
            case 13:
                n2x.x(qpg0Var, "DROP TABLE `country`");
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `country` (\n`id` INTEGER PRIMARY KEY NOT NULL,\n `country_name` TEXT NOT NULL,\n `country_phone_code` INTEGER NOT NULL,\n `country_code` TEXT NOT NULL,\n `country_currency_id` INTEGER NOT NULL,\n `country_image` TEXT NOT NULL,\n `phone_mask_max_length` INT NOT NULL,\n `phone_mask_min_length` INT NOT NULL,\n `phone_mask` TEXT NOT NULL\n)");
                break;
            case 14:
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `registration` (\n`id` INTEGER PRIMARY KEY NOT NULL, \n`registration_type_id` INTEGER NOT NULL, \n`field_name` TEXT NOT NULL, \n`is_required` INTEGER NOT NULL, \n`is_hidden` INTEGER NOT NULL, \n`min_age` TEXT\n)");
                break;
            case 15:
                n2x.x(qpg0Var, "DROP TABLE IF EXISTS bet_events_temp");
                n2x.x(qpg0Var, "ALTER TABLE bet_events RENAME TO bet_events_temp");
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `bet_events` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `game_id` INTEGER NOT NULL, \n    `main_game_id` INTEGER NOT NULL DEFAULT 0 ,\n    `player_id` INTEGER NOT NULL, \n    `sport_id` INTEGER NOT NULL, \n    `player_name` TEXT NOT NULL, \n    `game_match_name` TEXT NOT NULL, \n    `group_name` TEXT NOT NULL, \n    `express_number` INTEGER NOT NULL,\n    `coefficient` TEXT NOT NULL,\n    `param` REAL NOT NULL,\n    `time_start` INTEGER  NOT NULL DEFAULT 0,\n    `vid` TEXT  NOT NULL DEFAULT '',\n    `full_name` TEXT  NOT NULL DEFAULT '',\n    `name` TEXT NOT NULL, \n    `kind` INTEGER NOT NULL, \n    `type` INTEGER NOT NULL,\n    `players_duel_game` TEXT NOT NULL DEFAULT '',\n    `coupon_entry_feature_id` INTEGER DEFAULT 0 NOT NULL\n)");
                n2x.x(qpg0Var, "INSERT INTO bet_events\nSELECT id, \n       game_id,\n       main_game_id,\n       player_id,\n       sport_id,\n       player_name,\n       game_match_name,\n       group_name,\n       express_number,\n       coefficient,\n       param,\n       time_start,\n       vid,\n       full_name,\n       name,\n       kind,\n       type,\n       players_duel_game,\n       coupon_entry_feature_id\nFROM bet_events_temp");
                n2x.x(qpg0Var, "DROP TABLE IF EXISTS bet_events_temp");
                break;
            case 16:
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `quick_bet_settings_table` (\n`balanceId` INTEGER PRIMARY KEY NOT NULL, \n`firstValue` REAL NOT NULL, \n`secondValue` REAL NOT NULL, \n`thirdValue` REAL NOT NULL\n)");
                break;
            case 17:
                n2x.x(qpg0Var, "CREATE TABLE `country_backup` (\n`id` INTEGER  PRIMARY KEY NOT NULL,\n`country_name` TEXT  NOT NULL,\n`country_phone_code` INTEGER  NOT NULL,\n`country_code` TEXT  NOT NULL,\n`country_currency_id` INTEGER  NOT NULL,\n`country_image` TEXT NOT NULL,\n`phone_mask_max_length` INT NOT NULL DEFAULT 0,\n`phone_mask_min_length` INT NOT NULL DEFAULT 0,\n`phone_mask` TEXT NOT NULL DEFAULT ''\n)");
                n2x.x(qpg0Var, "INSERT INTO country_backup \nSELECT id, \ncountry_name,\ncountry_phone_code, \ncountry_code,\ncountry_currency_id, \ncountry_image, \nphone_mask_max_length, \nphone_mask_min_length, \nphone_mask\nFROM country  ");
                n2x.x(qpg0Var, "DROP TABLE country");
                n2x.x(qpg0Var, "ALTER TABLE country_backup RENAME TO country ");
                break;
            case 18:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN champ_name TEXT NOT NULL DEFAULT '' ");
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN first_opponent_first_img TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN first_opponent_second_img TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN second_opponent_first_img TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN second_opponent_second_img TEXT NOT NULL DEFAULT '' ");
                break;
            case 20:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN first_opponent_name TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN second_opponent_name TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN tournament_stage TEXT NOT NULL DEFAULT '' ");
                break;
            case 21:
                n2x.x(qpg0Var, "DROP TABLE `currencies`");
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `currencies` (\n    `id` INTEGER PRIMARY KEY NOT NULL, \n    `code` TEXT NOT NULL,\n    `name` TEXT NOT NULL,\n    `top` INTEGER NOT NULL,\n    `ruble_to_currency_rate` REAL NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `min_out_deposit` REAL NOT NULL,\n    `min_out_deposit_electron` REAL NOT NULL,\n    `min_sum_bets` REAL NOT NULL,\n    `round` INTEGER NOT NULL,\n    `registration_hidden` INTEGER NOT NULL,\n    `crypto` INTEGER NOT NULL\n)");
                break;
            case 22:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN teams_number INT NOT NULL DEFAULT 0 ");
                break;
            case 23:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN game_type TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN game_vid TEXT NOT NULL DEFAULT '' ");
                break;
            case 24:
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `news_catalog_banners` (\n    `id` INTEGER PRIMARY KEY NOT NULL\n)");
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `news_catalog_cms_banners` (\n    `id` INTEGER PRIMARY KEY NOT NULL\n)");
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                n2x.x(qpg0Var, "DROP TABLE IF EXISTS favorite_games");
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN feed_image_vertical TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN feed_image_horizontal TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN feed_image_square TEXT NOT NULL DEFAULT '' ");
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                n2x.x(qpg0Var, "ALTER TABLE event_groups ADD COLUMN has_auto_sub INTEGER NOT NULL DEFAULT 0 ");
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN discipline_icon_3d TEXT NOT NULL DEFAULT '' ");
                break;
            default:
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN esports_event_focus_discipline_header TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN esports_header_focus_discipline_header TEXT NOT NULL DEFAULT '' ");
                break;
        }
        return Unit.f46060a;
    }
}
