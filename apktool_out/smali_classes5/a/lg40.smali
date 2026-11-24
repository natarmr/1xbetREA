.class public final La/lg40;
.super La/dg40;
.source "SourceFile"


# instance fields
.field public final synthetic c:B


# direct methods
.method public synthetic constructor <init>(IIB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lg40;->c:B

    invoke-direct {p0, p1, p2}, La/dg40;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(La/qpg0;)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-byte p0, p0, La/lg40;->c:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "ALTER TABLE `favorite_champs` ADD COLUMN `screen_type` TEXT DEFAULT \'\' NOT NULL"

    .line 7
    .line 8
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    const-string p0, "    CREATE TABLE IF NOT EXISTS `country` (\n    `id` INTEGER PRIMARY KEY NOT NULL,\n     `country_name` TEXT NOT NULL,\n     `country_phone_code` INTEGER NOT NULL,\n     `country_code` TEXT NOT NULL,\n     `country_currency_id` INTEGER NOT NULL,\n     `country_image` TEXT NOT NULL\n)"

    .line 15
    .line 16
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_1
    const-string p0, "ALTER TABLE `sports` ADD COLUMN `short_name` TEXT DEFAULT \'\' NOT NULL"

    .line 23
    .line 24
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string p0, "ALTER TABLE `event_groups` ADD COLUMN `count_cols` INTEGER DEFAULT 0 NOT NULL"

    .line 28
    .line 29
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_2
    const-string p0, "DROP TABLE `favorite_games`"

    .line 36
    .line 37
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string p0, "CREATE TABLE IF NOT EXISTS `favorite_games` (`id` INTEGER PRIMARY KEY NOT NULL, `main_game_id` INTEGER NOT NULL, `is_live` INTEGER NOT NULL)"

    .line 41
    .line 42
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_3
    const-string p0, "ALTER TABLE `favorite_champs` RENAME TO `favorite_champs_old`"

    .line 49
    .line 50
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string p0, "CREATE TABLE IF NOT EXISTS `favorite_champs` (`id` INTEGER NOT NULL, `is_live` INTEGER NOT NULL, `primary_key` TEXT NOT NULL PRIMARY KEY)"

    .line 54
    .line 55
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string p0, "INSERT INTO `favorite_champs` SELECT *, id || is_live AS `primary_key` FROM `favorite_champs_old`"

    .line 59
    .line 60
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string p0, "DROP TABLE IF EXISTS `favorite_champs_old`"

    .line 64
    .line 65
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_4
    const-string p0, "CREATE TABLE IF NOT EXISTS `last_action` (`id` INTEGER PRIMARY KEY NOT NULL, `type` INTEGER NOT NULL, `date` INTEGER NOT NULL)"

    .line 72
    .line 73
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_5
    const-string p0, "ALTER TABLE bet_events ADD COLUMN builder_game_type INTEGER NOT NULL DEFAULT 0 "

    .line 80
    .line 81
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string p0, "ALTER TABLE bet_events ADD COLUMN builder_game_vid INTEGER NOT NULL DEFAULT 0 "

    .line 85
    .line 86
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const-string p0, "ALTER TABLE bet_events ADD COLUMN builder_period INTEGER NOT NULL DEFAULT 0 "

    .line 90
    .line 91
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string p0, "ALTER TABLE bet_events ADD COLUMN builder_coef_available INTEGER NOT NULL DEFAULT 0 "

    .line 95
    .line 96
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_6
    const-string p0, "ALTER TABLE bet_events ADD COLUMN coupon_type_vid INTEGER NOT NULL DEFAULT 0 "

    .line 103
    .line 104
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_7
    const-string p0, "ALTER TABLE sports ADD COLUMN default_opponent_header TEXT NOT NULL DEFAULT \'\' "

    .line 111
    .line 112
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const-string p0, "ALTER TABLE sports ADD COLUMN default_opponent_header_tablet TEXT NOT NULL DEFAULT \'\' "

    .line 116
    .line 117
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_8
    const-string p0, "ALTER TABLE bet_events ADD COLUMN opponents_full_name TEXT NOT NULL DEFAULT \'\' "

    .line 124
    .line 125
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_9
    const-string p0, "ALTER TABLE bet_events ADD COLUMN option_lower_cf_view TEXT NOT NULL DEFAULT \'\' "

    .line 132
    .line 133
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_a
    const-string p0, "ALTER TABLE events ADD COLUMN special_type INTEGER NOT NULL DEFAULT 0 "

    .line 140
    .line 141
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_b
    const-string p0, "CREATE TABLE IF NOT EXISTS `strings` (`locale` TEXT NOT NULL, `key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`key`, `locale`))"

    .line 148
    .line 149
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_c
    const-string p0, "ALTER TABLE bet_events ADD COLUMN option_lower_cf REAL NOT NULL DEFAULT 0 "

    .line 156
    .line 157
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_d
    const-string p0, "ALTER TABLE bet_events ADD COLUMN group_id INTEGER NOT NULL DEFAULT 0 "

    .line 164
    .line 165
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
