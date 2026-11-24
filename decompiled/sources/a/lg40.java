package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class lg40 extends dg40 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lg40(int i, int i2, byte b) {
        super(i, i2);
        this.c = b;
    }

    @Override // a.dg40
    public final Unit a(qpg0 qpg0Var) {
        switch (this.c) {
            case 0:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN group_id INTEGER NOT NULL DEFAULT 0 ");
                break;
            case 1:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN option_lower_cf REAL NOT NULL DEFAULT 0 ");
                break;
            case 2:
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `strings` (`locale` TEXT NOT NULL, `key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`key`, `locale`))");
                break;
            case 3:
                n2x.x(qpg0Var, "ALTER TABLE events ADD COLUMN special_type INTEGER NOT NULL DEFAULT 0 ");
                break;
            case 4:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN option_lower_cf_view TEXT NOT NULL DEFAULT '' ");
                break;
            case 5:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN opponents_full_name TEXT NOT NULL DEFAULT '' ");
                break;
            case 6:
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN default_opponent_header TEXT NOT NULL DEFAULT '' ");
                n2x.x(qpg0Var, "ALTER TABLE sports ADD COLUMN default_opponent_header_tablet TEXT NOT NULL DEFAULT '' ");
                break;
            case 7:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN coupon_type_vid INTEGER NOT NULL DEFAULT 0 ");
                break;
            case 8:
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN builder_game_type INTEGER NOT NULL DEFAULT 0 ");
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN builder_game_vid INTEGER NOT NULL DEFAULT 0 ");
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN builder_period INTEGER NOT NULL DEFAULT 0 ");
                n2x.x(qpg0Var, "ALTER TABLE bet_events ADD COLUMN builder_coef_available INTEGER NOT NULL DEFAULT 0 ");
                break;
            case 9:
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `last_action` (`id` INTEGER PRIMARY KEY NOT NULL, `type` INTEGER NOT NULL, `date` INTEGER NOT NULL)");
                break;
            case 10:
                n2x.x(qpg0Var, "ALTER TABLE `favorite_champs` RENAME TO `favorite_champs_old`");
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `favorite_champs` (`id` INTEGER NOT NULL, `is_live` INTEGER NOT NULL, `primary_key` TEXT NOT NULL PRIMARY KEY)");
                n2x.x(qpg0Var, "INSERT INTO `favorite_champs` SELECT *, id || is_live AS `primary_key` FROM `favorite_champs_old`");
                n2x.x(qpg0Var, "DROP TABLE IF EXISTS `favorite_champs_old`");
                break;
            case 11:
                n2x.x(qpg0Var, "DROP TABLE `favorite_games`");
                n2x.x(qpg0Var, "CREATE TABLE IF NOT EXISTS `favorite_games` (`id` INTEGER PRIMARY KEY NOT NULL, `main_game_id` INTEGER NOT NULL, `is_live` INTEGER NOT NULL)");
                break;
            case 12:
                n2x.x(qpg0Var, "ALTER TABLE `sports` ADD COLUMN `short_name` TEXT DEFAULT '' NOT NULL");
                n2x.x(qpg0Var, "ALTER TABLE `event_groups` ADD COLUMN `count_cols` INTEGER DEFAULT 0 NOT NULL");
                break;
            case 13:
                n2x.x(qpg0Var, "    CREATE TABLE IF NOT EXISTS `country` (\n    `id` INTEGER PRIMARY KEY NOT NULL,\n     `country_name` TEXT NOT NULL,\n     `country_phone_code` INTEGER NOT NULL,\n     `country_code` TEXT NOT NULL,\n     `country_currency_id` INTEGER NOT NULL,\n     `country_image` TEXT NOT NULL\n)");
                break;
            default:
                n2x.x(qpg0Var, "ALTER TABLE `favorite_champs` ADD COLUMN `screen_type` TEXT DEFAULT '' NOT NULL");
                break;
        }
        return Unit.f46060a;
    }
}
