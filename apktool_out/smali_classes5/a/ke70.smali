.class public final La/ke70;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lorg/xplatform/onexdatabase/OnexDatabase_Impl;


# direct methods
.method public constructor <init>(Lorg/xplatform/onexdatabase/OnexDatabase_Impl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ke70;->a:Lorg/xplatform/onexdatabase/OnexDatabase_Impl;

    .line 5
    .line 6
    return-void
.end method

.method public static a(La/qpg0;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "CREATE TABLE IF NOT EXISTS `bet_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `game_id` INTEGER NOT NULL, `main_game_id` INTEGER NOT NULL DEFAULT 0, `player_id` INTEGER NOT NULL, `sport_id` INTEGER NOT NULL, `player_name` TEXT NOT NULL, `game_match_name` TEXT NOT NULL, `first_opponent_first_img` TEXT NOT NULL, `first_opponent_second_img` TEXT NOT NULL, `second_opponent_first_img` TEXT NOT NULL, `second_opponent_second_img` TEXT NOT NULL, `group_name` TEXT NOT NULL, `champ_name` TEXT NOT NULL, `express_number` INTEGER NOT NULL, `coefficient` TEXT NOT NULL, `param` REAL NOT NULL, `time_start` INTEGER NOT NULL DEFAULT 0, `vid` TEXT NOT NULL DEFAULT \'\', `full_name` TEXT NOT NULL DEFAULT \'\', `name` TEXT NOT NULL, `kind` INTEGER NOT NULL, `type` INTEGER NOT NULL, `players_duel_game` TEXT NOT NULL DEFAULT \'\', `coupon_entry_feature_id` INTEGER NOT NULL DEFAULT 0, `first_opponent_name` TEXT NOT NULL DEFAULT \'\', `second_opponent_name` TEXT NOT NULL DEFAULT \'\', `opponents_full_name` TEXT NOT NULL DEFAULT \'\', `tournament_stage` TEXT NOT NULL DEFAULT \'\', `teams_number` INTEGER NOT NULL DEFAULT 0, `game_type` TEXT NOT NULL DEFAULT \'\', `game_vid` TEXT NOT NULL DEFAULT \'\', `group_id` INTEGER NOT NULL DEFAULT 0, `option_lower_cf` REAL NOT NULL DEFAULT 0, `option_lower_cf_view` TEXT NOT NULL DEFAULT \'\', `coupon_type_vid` INTEGER NOT NULL DEFAULT 0, `builder_game_type` INTEGER NOT NULL DEFAULT 0, `builder_game_vid` INTEGER NOT NULL DEFAULT 0, `builder_period` INTEGER NOT NULL DEFAULT 0, `builder_coef_available` INTEGER NOT NULL DEFAULT 0)"

    .line 2
    .line 3
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "CREATE TABLE IF NOT EXISTS `currencies` (`id` INTEGER NOT NULL, `code` TEXT NOT NULL, `name` TEXT NOT NULL, `top` INTEGER NOT NULL, `ruble_to_currency_rate` REAL NOT NULL, `symbol` TEXT NOT NULL, `min_out_deposit` REAL NOT NULL, `min_out_deposit_electron` REAL NOT NULL, `min_sum_bets` REAL NOT NULL, `round` INTEGER NOT NULL, `registration_hidden` INTEGER NOT NULL, `crypto` INTEGER NOT NULL, `initialBet` REAL NOT NULL, `betStep` REAL NOT NULL, PRIMARY KEY(`id`))"

    .line 7
    .line 8
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "CREATE TABLE IF NOT EXISTS `sports` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `team` TEXT NOT NULL, `short_name` TEXT NOT NULL, `cyber` INTEGER NOT NULL, `background` TEXT NOT NULL, `image_small` TEXT NOT NULL, `image_popular` TEXT NOT NULL, `background_tablet` TEXT NOT NULL, `background_champ_default` TEXT NOT NULL, `background_champ_tablet_default` TEXT NOT NULL, `background_champ_header_default` TEXT NOT NULL, `background_champ_header_tablet_default` TEXT NOT NULL, `game_background` TEXT NOT NULL, `sub_sports` TEXT NOT NULL, `image_champ_small` TEXT NOT NULL, `feed_image_vertical` TEXT NOT NULL, `feed_image_horizontal` TEXT NOT NULL, `feed_image_square` TEXT NOT NULL, `discipline_icon_3d` TEXT NOT NULL, `esports_event_focus_discipline_header` TEXT NOT NULL, `esports_header_focus_discipline_header` TEXT NOT NULL, `default_opponent_header` TEXT NOT NULL, `default_opponent_header_tablet` TEXT NOT NULL, PRIMARY KEY(`id`))"

    .line 12
    .line 13
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `type_param` INTEGER NOT NULL, `special_type` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    .line 17
    .line 18
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "CREATE TABLE IF NOT EXISTS `event_groups` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `position` INTEGER NOT NULL, `count_cols` INTEGER NOT NULL, `has_auto_sub` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    .line 22
    .line 23
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CREATE TABLE IF NOT EXISTS `favorite_champs` (`id` INTEGER NOT NULL, `is_live` INTEGER NOT NULL, `screen_type` TEXT NOT NULL, `primary_key` TEXT NOT NULL, PRIMARY KEY(`primary_key`))"

    .line 27
    .line 28
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "CREATE TABLE IF NOT EXISTS `strings` (`locale` TEXT NOT NULL, `key` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`key`, `locale`))"

    .line 32
    .line 33
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "CREATE TABLE IF NOT EXISTS `last_action` (`id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `date` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    .line 37
    .line 38
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "CREATE TABLE IF NOT EXISTS `country` (`id` INTEGER NOT NULL, `country_name` TEXT NOT NULL, `country_phone_code` INTEGER NOT NULL, `country_code` TEXT NOT NULL, `country_currency_id` INTEGER NOT NULL, `country_image` TEXT NOT NULL, `phone_mask_max_length` INTEGER NOT NULL DEFAULT 0, `phone_mask_min_length` INTEGER NOT NULL DEFAULT 0, `phone_mask` TEXT NOT NULL DEFAULT \'\', PRIMARY KEY(`id`))"

    .line 42
    .line 43
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "CREATE TABLE IF NOT EXISTS `market_filter` (`id` INTEGER NOT NULL, `hidden` INTEGER NOT NULL, `pinned_position` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    .line 47
    .line 48
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "CREATE TABLE IF NOT EXISTS `statistic_dictionaries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` INTEGER NOT NULL, `itemId` INTEGER NOT NULL, `title` TEXT NOT NULL)"

    .line 52
    .line 53
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v0, "CREATE TABLE IF NOT EXISTS `registration` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `registration_type_id` INTEGER NOT NULL, `field_name` TEXT NOT NULL, `is_required` INTEGER NOT NULL, `is_hidden` INTEGER NOT NULL, `min_age` TEXT)"

    .line 57
    .line 58
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "CREATE TABLE IF NOT EXISTS `quick_bet_settings_table` (`balanceId` INTEGER NOT NULL, `firstValue` REAL NOT NULL, `secondValue` REAL NOT NULL, `thirdValue` REAL NOT NULL, PRIMARY KEY(`balanceId`))"

    .line 62
    .line 63
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v0, "CREATE TABLE IF NOT EXISTS `news_catalog_banners` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    .line 67
    .line 68
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "CREATE TABLE IF NOT EXISTS `news_catalog_cms_banners` (`id` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    .line 72
    .line 73
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 77
    .line 78
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'9c0f7c853a4da42d379e451bd4efb125\')"

    .line 82
    .line 83
    invoke-static {p0, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0
.end method


# virtual methods
.method public final b(La/qpg0;La/zje;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/je70;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/je70;

    .line 11
    .line 12
    iget v3, v2, La/je70;->A:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/je70;->A:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/je70;

    .line 25
    .line 26
    move-object/from16 v3, p0

    .line 27
    .line 28
    invoke-direct {v2, v3, v1}, La/je70;-><init>(La/ke70;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v1, v2, La/je70;->y:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v4, v2, La/je70;->A:I

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    const-string v6, "type"

    .line 39
    .line 40
    const-string v7, "name"

    .line 41
    .line 42
    const-string v8, "id"

    .line 43
    .line 44
    const-string v9, "\n Found:\n"

    .line 45
    .line 46
    const/4 v10, 0x0

    .line 47
    const/4 v11, 0x0

    .line 48
    packed-switch v4, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v11

    .line 57
    :pswitch_0
    iget-object v0, v2, La/je70;->x:La/zjo0;

    .line 58
    .line 59
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_10

    .line 63
    .line 64
    :pswitch_1
    iget-object v0, v2, La/je70;->w:La/zjo0;

    .line 65
    .line 66
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 67
    .line 68
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_e

    .line 72
    .line 73
    :pswitch_2
    iget-object v0, v2, La/je70;->v:La/zjo0;

    .line 74
    .line 75
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 76
    .line 77
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_d

    .line 81
    .line 82
    :pswitch_3
    iget-object v0, v2, La/je70;->u:La/zjo0;

    .line 83
    .line 84
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 85
    .line 86
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_c

    .line 90
    .line 91
    :pswitch_4
    iget-object v0, v2, La/je70;->t:La/zjo0;

    .line 92
    .line 93
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 94
    .line 95
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_b

    .line 99
    .line 100
    :pswitch_5
    iget-object v0, v2, La/je70;->s:La/zjo0;

    .line 101
    .line 102
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 103
    .line 104
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_a

    .line 108
    .line 109
    :pswitch_6
    iget-object v0, v2, La/je70;->r:La/zjo0;

    .line 110
    .line 111
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 112
    .line 113
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_9

    .line 117
    .line 118
    :pswitch_7
    iget-object v0, v2, La/je70;->q:La/zjo0;

    .line 119
    .line 120
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 121
    .line 122
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_8

    .line 126
    .line 127
    :pswitch_8
    iget-object v0, v2, La/je70;->p:La/zjo0;

    .line 128
    .line 129
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 130
    .line 131
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto/16 :goto_7

    .line 135
    .line 136
    :pswitch_9
    iget-object v0, v2, La/je70;->o:La/zjo0;

    .line 137
    .line 138
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 139
    .line 140
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_6

    .line 144
    .line 145
    :pswitch_a
    iget-object v0, v2, La/je70;->n:La/zjo0;

    .line 146
    .line 147
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 148
    .line 149
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_5

    .line 153
    .line 154
    :pswitch_b
    iget-object v0, v2, La/je70;->m:La/zjo0;

    .line 155
    .line 156
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 157
    .line 158
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_4

    .line 162
    .line 163
    :pswitch_c
    iget-object v0, v2, La/je70;->l:La/zjo0;

    .line 164
    .line 165
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 166
    .line 167
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_3

    .line 171
    .line 172
    :pswitch_d
    iget-object v0, v2, La/je70;->k:La/zjo0;

    .line 173
    .line 174
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 175
    .line 176
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto/16 :goto_2

    .line 180
    .line 181
    :pswitch_e
    iget-object v0, v2, La/je70;->j:La/zjo0;

    .line 182
    .line 183
    iget-object v4, v2, La/je70;->i:La/qpg0;

    .line 184
    .line 185
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    move-object v13, v0

    .line 189
    move-object v0, v4

    .line 190
    goto/16 :goto_1

    .line 191
    .line 192
    :pswitch_f
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 196
    .line 197
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 198
    .line 199
    .line 200
    new-instance v12, La/tjo0;

    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    const/4 v14, 0x1

    .line 205
    const/16 v18, 0x1

    .line 206
    .line 207
    const/4 v13, 0x1

    .line 208
    const-string v15, "id"

    .line 209
    .line 210
    const-string v16, "INTEGER"

    .line 211
    .line 212
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v1, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    new-instance v13, La/tjo0;

    .line 219
    .line 220
    const/16 v18, 0x0

    .line 221
    .line 222
    const/4 v15, 0x1

    .line 223
    const/16 v19, 0x1

    .line 224
    .line 225
    const/4 v14, 0x0

    .line 226
    const-string v16, "game_id"

    .line 227
    .line 228
    const-string v17, "INTEGER"

    .line 229
    .line 230
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 231
    .line 232
    .line 233
    const-string v4, "game_id"

    .line 234
    .line 235
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    new-instance v14, La/tjo0;

    .line 239
    .line 240
    const-string v19, "0"

    .line 241
    .line 242
    const/16 v16, 0x1

    .line 243
    .line 244
    const/16 v20, 0x1

    .line 245
    .line 246
    const/4 v15, 0x0

    .line 247
    const-string v17, "main_game_id"

    .line 248
    .line 249
    const-string v18, "INTEGER"

    .line 250
    .line 251
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 252
    .line 253
    .line 254
    const-string v4, "main_game_id"

    .line 255
    .line 256
    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    new-instance v15, La/tjo0;

    .line 260
    .line 261
    const/16 v20, 0x0

    .line 262
    .line 263
    const/16 v17, 0x1

    .line 264
    .line 265
    const/16 v21, 0x1

    .line 266
    .line 267
    const/16 v16, 0x0

    .line 268
    .line 269
    const-string v18, "player_id"

    .line 270
    .line 271
    const-string v19, "INTEGER"

    .line 272
    .line 273
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 274
    .line 275
    .line 276
    const-string v4, "player_id"

    .line 277
    .line 278
    invoke-interface {v1, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    new-instance v16, La/tjo0;

    .line 282
    .line 283
    const/16 v21, 0x0

    .line 284
    .line 285
    const/16 v18, 0x1

    .line 286
    .line 287
    const/16 v22, 0x1

    .line 288
    .line 289
    const/16 v17, 0x0

    .line 290
    .line 291
    const-string v19, "sport_id"

    .line 292
    .line 293
    const-string v20, "INTEGER"

    .line 294
    .line 295
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 296
    .line 297
    .line 298
    move-object/from16 v4, v16

    .line 299
    .line 300
    const-string v12, "sport_id"

    .line 301
    .line 302
    invoke-interface {v1, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    new-instance v13, La/tjo0;

    .line 306
    .line 307
    const/16 v18, 0x0

    .line 308
    .line 309
    const/4 v15, 0x1

    .line 310
    const/16 v19, 0x1

    .line 311
    .line 312
    const/4 v14, 0x0

    .line 313
    const-string v16, "player_name"

    .line 314
    .line 315
    const-string v17, "TEXT"

    .line 316
    .line 317
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 318
    .line 319
    .line 320
    const-string v4, "player_name"

    .line 321
    .line 322
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    new-instance v14, La/tjo0;

    .line 326
    .line 327
    const/16 v19, 0x0

    .line 328
    .line 329
    const/16 v16, 0x1

    .line 330
    .line 331
    const/16 v20, 0x1

    .line 332
    .line 333
    const/4 v15, 0x0

    .line 334
    const-string v17, "game_match_name"

    .line 335
    .line 336
    const-string v18, "TEXT"

    .line 337
    .line 338
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 339
    .line 340
    .line 341
    const-string v4, "game_match_name"

    .line 342
    .line 343
    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    new-instance v15, La/tjo0;

    .line 347
    .line 348
    const/16 v20, 0x0

    .line 349
    .line 350
    const/16 v17, 0x1

    .line 351
    .line 352
    const/16 v21, 0x1

    .line 353
    .line 354
    const/16 v16, 0x0

    .line 355
    .line 356
    const-string v18, "first_opponent_first_img"

    .line 357
    .line 358
    const-string v19, "TEXT"

    .line 359
    .line 360
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 361
    .line 362
    .line 363
    const-string v4, "first_opponent_first_img"

    .line 364
    .line 365
    invoke-interface {v1, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    new-instance v16, La/tjo0;

    .line 369
    .line 370
    const/16 v21, 0x0

    .line 371
    .line 372
    const/16 v18, 0x1

    .line 373
    .line 374
    const/16 v17, 0x0

    .line 375
    .line 376
    const-string v19, "first_opponent_second_img"

    .line 377
    .line 378
    const-string v20, "TEXT"

    .line 379
    .line 380
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 381
    .line 382
    .line 383
    move-object/from16 v4, v16

    .line 384
    .line 385
    const-string v12, "first_opponent_second_img"

    .line 386
    .line 387
    invoke-interface {v1, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    new-instance v13, La/tjo0;

    .line 391
    .line 392
    const/16 v18, 0x0

    .line 393
    .line 394
    const/4 v15, 0x1

    .line 395
    const/16 v19, 0x1

    .line 396
    .line 397
    const/4 v14, 0x0

    .line 398
    const-string v16, "second_opponent_first_img"

    .line 399
    .line 400
    const-string v17, "TEXT"

    .line 401
    .line 402
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 403
    .line 404
    .line 405
    const-string v4, "second_opponent_first_img"

    .line 406
    .line 407
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    new-instance v14, La/tjo0;

    .line 411
    .line 412
    const/16 v19, 0x0

    .line 413
    .line 414
    const/16 v16, 0x1

    .line 415
    .line 416
    const/16 v20, 0x1

    .line 417
    .line 418
    const/4 v15, 0x0

    .line 419
    const-string v17, "second_opponent_second_img"

    .line 420
    .line 421
    const-string v18, "TEXT"

    .line 422
    .line 423
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 424
    .line 425
    .line 426
    const-string v4, "second_opponent_second_img"

    .line 427
    .line 428
    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    new-instance v15, La/tjo0;

    .line 432
    .line 433
    const/16 v20, 0x0

    .line 434
    .line 435
    const/16 v17, 0x1

    .line 436
    .line 437
    const/16 v21, 0x1

    .line 438
    .line 439
    const/16 v16, 0x0

    .line 440
    .line 441
    const-string v18, "group_name"

    .line 442
    .line 443
    const-string v19, "TEXT"

    .line 444
    .line 445
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 446
    .line 447
    .line 448
    const-string v4, "group_name"

    .line 449
    .line 450
    invoke-interface {v1, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    new-instance v16, La/tjo0;

    .line 454
    .line 455
    const/16 v21, 0x0

    .line 456
    .line 457
    const/16 v18, 0x1

    .line 458
    .line 459
    const/16 v17, 0x0

    .line 460
    .line 461
    const-string v19, "champ_name"

    .line 462
    .line 463
    const-string v20, "TEXT"

    .line 464
    .line 465
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 466
    .line 467
    .line 468
    move-object/from16 v4, v16

    .line 469
    .line 470
    const-string v12, "champ_name"

    .line 471
    .line 472
    invoke-interface {v1, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    new-instance v13, La/tjo0;

    .line 476
    .line 477
    const/16 v18, 0x0

    .line 478
    .line 479
    const/4 v15, 0x1

    .line 480
    const/16 v19, 0x1

    .line 481
    .line 482
    const/4 v14, 0x0

    .line 483
    const-string v16, "express_number"

    .line 484
    .line 485
    const-string v17, "INTEGER"

    .line 486
    .line 487
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 488
    .line 489
    .line 490
    const-string v4, "express_number"

    .line 491
    .line 492
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    new-instance v14, La/tjo0;

    .line 496
    .line 497
    const/16 v19, 0x0

    .line 498
    .line 499
    const/16 v16, 0x1

    .line 500
    .line 501
    const/16 v20, 0x1

    .line 502
    .line 503
    const/4 v15, 0x0

    .line 504
    const-string v17, "coefficient"

    .line 505
    .line 506
    const-string v18, "TEXT"

    .line 507
    .line 508
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 509
    .line 510
    .line 511
    const-string v4, "coefficient"

    .line 512
    .line 513
    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    new-instance v15, La/tjo0;

    .line 517
    .line 518
    const/16 v20, 0x0

    .line 519
    .line 520
    const/16 v17, 0x1

    .line 521
    .line 522
    const/16 v21, 0x1

    .line 523
    .line 524
    const/16 v16, 0x0

    .line 525
    .line 526
    const-string v18, "param"

    .line 527
    .line 528
    const-string v19, "REAL"

    .line 529
    .line 530
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 531
    .line 532
    .line 533
    const-string v4, "param"

    .line 534
    .line 535
    invoke-interface {v1, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    new-instance v16, La/tjo0;

    .line 539
    .line 540
    const-string v21, "0"

    .line 541
    .line 542
    const/16 v18, 0x1

    .line 543
    .line 544
    const/16 v17, 0x0

    .line 545
    .line 546
    const-string v19, "time_start"

    .line 547
    .line 548
    const-string v20, "INTEGER"

    .line 549
    .line 550
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 551
    .line 552
    .line 553
    move-object/from16 v4, v16

    .line 554
    .line 555
    const-string v12, "time_start"

    .line 556
    .line 557
    invoke-interface {v1, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    new-instance v13, La/tjo0;

    .line 561
    .line 562
    const-string v18, "\'\'"

    .line 563
    .line 564
    const/4 v15, 0x1

    .line 565
    const/16 v19, 0x1

    .line 566
    .line 567
    const/4 v14, 0x0

    .line 568
    const-string v16, "vid"

    .line 569
    .line 570
    const-string v17, "TEXT"

    .line 571
    .line 572
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 573
    .line 574
    .line 575
    const-string v4, "vid"

    .line 576
    .line 577
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    new-instance v14, La/tjo0;

    .line 581
    .line 582
    const-string v19, "\'\'"

    .line 583
    .line 584
    const/16 v16, 0x1

    .line 585
    .line 586
    const/16 v20, 0x1

    .line 587
    .line 588
    const/4 v15, 0x0

    .line 589
    const-string v17, "full_name"

    .line 590
    .line 591
    const-string v18, "TEXT"

    .line 592
    .line 593
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 594
    .line 595
    .line 596
    const-string v4, "full_name"

    .line 597
    .line 598
    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    new-instance v15, La/tjo0;

    .line 602
    .line 603
    const/16 v20, 0x0

    .line 604
    .line 605
    const/16 v17, 0x1

    .line 606
    .line 607
    const/16 v21, 0x1

    .line 608
    .line 609
    const/16 v16, 0x0

    .line 610
    .line 611
    const-string v18, "name"

    .line 612
    .line 613
    const-string v19, "TEXT"

    .line 614
    .line 615
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 616
    .line 617
    .line 618
    invoke-interface {v1, v7, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    new-instance v16, La/tjo0;

    .line 622
    .line 623
    const/16 v21, 0x0

    .line 624
    .line 625
    const/16 v18, 0x1

    .line 626
    .line 627
    const/16 v17, 0x0

    .line 628
    .line 629
    const-string v19, "kind"

    .line 630
    .line 631
    const-string v20, "INTEGER"

    .line 632
    .line 633
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 634
    .line 635
    .line 636
    move-object/from16 v4, v16

    .line 637
    .line 638
    const-string v12, "kind"

    .line 639
    .line 640
    invoke-interface {v1, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    new-instance v13, La/tjo0;

    .line 644
    .line 645
    const/16 v18, 0x0

    .line 646
    .line 647
    const/4 v15, 0x1

    .line 648
    const/16 v19, 0x1

    .line 649
    .line 650
    const/4 v14, 0x0

    .line 651
    const-string v16, "type"

    .line 652
    .line 653
    const-string v17, "INTEGER"

    .line 654
    .line 655
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 656
    .line 657
    .line 658
    invoke-interface {v1, v6, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    new-instance v14, La/tjo0;

    .line 662
    .line 663
    const-string v19, "\'\'"

    .line 664
    .line 665
    const/16 v16, 0x1

    .line 666
    .line 667
    const/16 v20, 0x1

    .line 668
    .line 669
    const/4 v15, 0x0

    .line 670
    const-string v17, "players_duel_game"

    .line 671
    .line 672
    const-string v18, "TEXT"

    .line 673
    .line 674
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 675
    .line 676
    .line 677
    const-string v4, "players_duel_game"

    .line 678
    .line 679
    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    new-instance v15, La/tjo0;

    .line 683
    .line 684
    const-string v20, "0"

    .line 685
    .line 686
    const/16 v17, 0x1

    .line 687
    .line 688
    const/16 v21, 0x1

    .line 689
    .line 690
    const/16 v16, 0x0

    .line 691
    .line 692
    const-string v18, "coupon_entry_feature_id"

    .line 693
    .line 694
    const-string v19, "INTEGER"

    .line 695
    .line 696
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 697
    .line 698
    .line 699
    const-string v4, "coupon_entry_feature_id"

    .line 700
    .line 701
    invoke-interface {v1, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    new-instance v16, La/tjo0;

    .line 705
    .line 706
    const-string v21, "\'\'"

    .line 707
    .line 708
    const/16 v18, 0x1

    .line 709
    .line 710
    const/16 v17, 0x0

    .line 711
    .line 712
    const-string v19, "first_opponent_name"

    .line 713
    .line 714
    const-string v20, "TEXT"

    .line 715
    .line 716
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 717
    .line 718
    .line 719
    move-object/from16 v4, v16

    .line 720
    .line 721
    const-string v12, "first_opponent_name"

    .line 722
    .line 723
    invoke-interface {v1, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    new-instance v13, La/tjo0;

    .line 727
    .line 728
    const-string v18, "\'\'"

    .line 729
    .line 730
    const/4 v15, 0x1

    .line 731
    const/16 v19, 0x1

    .line 732
    .line 733
    const/4 v14, 0x0

    .line 734
    const-string v16, "second_opponent_name"

    .line 735
    .line 736
    const-string v17, "TEXT"

    .line 737
    .line 738
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 739
    .line 740
    .line 741
    const-string v4, "second_opponent_name"

    .line 742
    .line 743
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    new-instance v14, La/tjo0;

    .line 747
    .line 748
    const-string v19, "\'\'"

    .line 749
    .line 750
    const/16 v16, 0x1

    .line 751
    .line 752
    const/16 v20, 0x1

    .line 753
    .line 754
    const/4 v15, 0x0

    .line 755
    const-string v17, "opponents_full_name"

    .line 756
    .line 757
    const-string v18, "TEXT"

    .line 758
    .line 759
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 760
    .line 761
    .line 762
    const-string v4, "opponents_full_name"

    .line 763
    .line 764
    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    new-instance v15, La/tjo0;

    .line 768
    .line 769
    const-string v20, "\'\'"

    .line 770
    .line 771
    const/16 v17, 0x1

    .line 772
    .line 773
    const/16 v21, 0x1

    .line 774
    .line 775
    const/16 v16, 0x0

    .line 776
    .line 777
    const-string v18, "tournament_stage"

    .line 778
    .line 779
    const-string v19, "TEXT"

    .line 780
    .line 781
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 782
    .line 783
    .line 784
    const-string v4, "tournament_stage"

    .line 785
    .line 786
    invoke-interface {v1, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    new-instance v16, La/tjo0;

    .line 790
    .line 791
    const-string v21, "0"

    .line 792
    .line 793
    const/16 v18, 0x1

    .line 794
    .line 795
    const/16 v17, 0x0

    .line 796
    .line 797
    const-string v19, "teams_number"

    .line 798
    .line 799
    const-string v20, "INTEGER"

    .line 800
    .line 801
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 802
    .line 803
    .line 804
    move-object/from16 v4, v16

    .line 805
    .line 806
    const-string v12, "teams_number"

    .line 807
    .line 808
    invoke-interface {v1, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    new-instance v13, La/tjo0;

    .line 812
    .line 813
    const-string v18, "\'\'"

    .line 814
    .line 815
    const/4 v15, 0x1

    .line 816
    const/16 v19, 0x1

    .line 817
    .line 818
    const/4 v14, 0x0

    .line 819
    const-string v16, "game_type"

    .line 820
    .line 821
    const-string v17, "TEXT"

    .line 822
    .line 823
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 824
    .line 825
    .line 826
    const-string v4, "game_type"

    .line 827
    .line 828
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    new-instance v14, La/tjo0;

    .line 832
    .line 833
    const-string v19, "\'\'"

    .line 834
    .line 835
    const/16 v16, 0x1

    .line 836
    .line 837
    const/16 v20, 0x1

    .line 838
    .line 839
    const/4 v15, 0x0

    .line 840
    const-string v17, "game_vid"

    .line 841
    .line 842
    const-string v18, "TEXT"

    .line 843
    .line 844
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 845
    .line 846
    .line 847
    const-string v4, "game_vid"

    .line 848
    .line 849
    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    new-instance v15, La/tjo0;

    .line 853
    .line 854
    const-string v20, "0"

    .line 855
    .line 856
    const/16 v17, 0x1

    .line 857
    .line 858
    const/16 v21, 0x1

    .line 859
    .line 860
    const/16 v16, 0x0

    .line 861
    .line 862
    const-string v18, "group_id"

    .line 863
    .line 864
    const-string v19, "INTEGER"

    .line 865
    .line 866
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 867
    .line 868
    .line 869
    const-string v4, "group_id"

    .line 870
    .line 871
    invoke-interface {v1, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    new-instance v16, La/tjo0;

    .line 875
    .line 876
    const-string v21, "0"

    .line 877
    .line 878
    const/16 v18, 0x1

    .line 879
    .line 880
    const/16 v17, 0x0

    .line 881
    .line 882
    const-string v19, "option_lower_cf"

    .line 883
    .line 884
    const-string v20, "REAL"

    .line 885
    .line 886
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 887
    .line 888
    .line 889
    move-object/from16 v4, v16

    .line 890
    .line 891
    const-string v12, "option_lower_cf"

    .line 892
    .line 893
    invoke-interface {v1, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    new-instance v13, La/tjo0;

    .line 897
    .line 898
    const-string v18, "\'\'"

    .line 899
    .line 900
    const/4 v15, 0x1

    .line 901
    const/16 v19, 0x1

    .line 902
    .line 903
    const/4 v14, 0x0

    .line 904
    const-string v16, "option_lower_cf_view"

    .line 905
    .line 906
    const-string v17, "TEXT"

    .line 907
    .line 908
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 909
    .line 910
    .line 911
    const-string v4, "option_lower_cf_view"

    .line 912
    .line 913
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    new-instance v14, La/tjo0;

    .line 917
    .line 918
    const-string v19, "0"

    .line 919
    .line 920
    const/16 v16, 0x1

    .line 921
    .line 922
    const/16 v20, 0x1

    .line 923
    .line 924
    const/4 v15, 0x0

    .line 925
    const-string v17, "coupon_type_vid"

    .line 926
    .line 927
    const-string v18, "INTEGER"

    .line 928
    .line 929
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 930
    .line 931
    .line 932
    const-string v4, "coupon_type_vid"

    .line 933
    .line 934
    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    new-instance v15, La/tjo0;

    .line 938
    .line 939
    const-string v20, "0"

    .line 940
    .line 941
    const/16 v17, 0x1

    .line 942
    .line 943
    const/16 v21, 0x1

    .line 944
    .line 945
    const/16 v16, 0x0

    .line 946
    .line 947
    const-string v18, "builder_game_type"

    .line 948
    .line 949
    const-string v19, "INTEGER"

    .line 950
    .line 951
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 952
    .line 953
    .line 954
    const-string v4, "builder_game_type"

    .line 955
    .line 956
    invoke-interface {v1, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    new-instance v16, La/tjo0;

    .line 960
    .line 961
    const-string v21, "0"

    .line 962
    .line 963
    const/16 v18, 0x1

    .line 964
    .line 965
    const/16 v17, 0x0

    .line 966
    .line 967
    const-string v19, "builder_game_vid"

    .line 968
    .line 969
    const-string v20, "INTEGER"

    .line 970
    .line 971
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 972
    .line 973
    .line 974
    move-object/from16 v4, v16

    .line 975
    .line 976
    const-string v12, "builder_game_vid"

    .line 977
    .line 978
    invoke-interface {v1, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    new-instance v13, La/tjo0;

    .line 982
    .line 983
    const-string v18, "0"

    .line 984
    .line 985
    const/4 v15, 0x1

    .line 986
    const/16 v19, 0x1

    .line 987
    .line 988
    const/4 v14, 0x0

    .line 989
    const-string v16, "builder_period"

    .line 990
    .line 991
    const-string v17, "INTEGER"

    .line 992
    .line 993
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 994
    .line 995
    .line 996
    const-string v4, "builder_period"

    .line 997
    .line 998
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    new-instance v14, La/tjo0;

    .line 1002
    .line 1003
    const-string v19, "0"

    .line 1004
    .line 1005
    const/16 v16, 0x1

    .line 1006
    .line 1007
    const/16 v20, 0x1

    .line 1008
    .line 1009
    const/4 v15, 0x0

    .line 1010
    const-string v17, "builder_coef_available"

    .line 1011
    .line 1012
    const-string v18, "INTEGER"

    .line 1013
    .line 1014
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1015
    .line 1016
    .line 1017
    const-string v4, "builder_coef_available"

    .line 1018
    .line 1019
    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 1023
    .line 1024
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1025
    .line 1026
    .line 1027
    new-instance v12, Ljava/util/LinkedHashSet;

    .line 1028
    .line 1029
    invoke-direct {v12}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1030
    .line 1031
    .line 1032
    new-instance v13, La/zjo0;

    .line 1033
    .line 1034
    const-string v14, "bet_events"

    .line 1035
    .line 1036
    invoke-direct {v13, v14, v1, v4, v12}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 1037
    .line 1038
    .line 1039
    iput-object v0, v2, La/je70;->i:La/qpg0;

    .line 1040
    .line 1041
    iput-object v13, v2, La/je70;->j:La/zjo0;

    .line 1042
    .line 1043
    iput v5, v2, La/je70;->A:I

    .line 1044
    .line 1045
    invoke-static {v0, v14, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v1

    .line 1049
    if-ne v1, v3, :cond_1

    .line 1050
    .line 1051
    goto/16 :goto_f

    .line 1052
    .line 1053
    :cond_1
    :goto_1
    check-cast v1, La/zjo0;

    .line 1054
    .line 1055
    invoke-virtual {v13, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v4

    .line 1059
    if-nez v4, :cond_2

    .line 1060
    .line 1061
    new-instance v0, La/eeg0;

    .line 1062
    .line 1063
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1064
    .line 1065
    const-string v3, "bet_events(org.xplatform.onexdatabase.entity.BetEventEntity).\n Expected:\n"

    .line 1066
    .line 1067
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    invoke-direct {v0, v1, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 1084
    .line 1085
    .line 1086
    return-object v0

    .line 1087
    :cond_2
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 1088
    .line 1089
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1090
    .line 1091
    .line 1092
    new-instance v12, La/tjo0;

    .line 1093
    .line 1094
    const/16 v17, 0x0

    .line 1095
    .line 1096
    const/4 v14, 0x1

    .line 1097
    const/16 v18, 0x1

    .line 1098
    .line 1099
    const/4 v13, 0x1

    .line 1100
    const-string v15, "id"

    .line 1101
    .line 1102
    const-string v16, "INTEGER"

    .line 1103
    .line 1104
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1105
    .line 1106
    .line 1107
    invoke-interface {v1, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1108
    .line 1109
    .line 1110
    new-instance v13, La/tjo0;

    .line 1111
    .line 1112
    const/16 v18, 0x0

    .line 1113
    .line 1114
    const/4 v15, 0x1

    .line 1115
    const/16 v19, 0x1

    .line 1116
    .line 1117
    const/4 v14, 0x0

    .line 1118
    const-string v16, "code"

    .line 1119
    .line 1120
    const-string v17, "TEXT"

    .line 1121
    .line 1122
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1123
    .line 1124
    .line 1125
    const-string v4, "code"

    .line 1126
    .line 1127
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1128
    .line 1129
    .line 1130
    new-instance v14, La/tjo0;

    .line 1131
    .line 1132
    const/16 v19, 0x0

    .line 1133
    .line 1134
    const/16 v16, 0x1

    .line 1135
    .line 1136
    const/16 v20, 0x1

    .line 1137
    .line 1138
    const/4 v15, 0x0

    .line 1139
    const-string v17, "name"

    .line 1140
    .line 1141
    const-string v18, "TEXT"

    .line 1142
    .line 1143
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1144
    .line 1145
    .line 1146
    invoke-interface {v1, v7, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1147
    .line 1148
    .line 1149
    new-instance v15, La/tjo0;

    .line 1150
    .line 1151
    const/16 v20, 0x0

    .line 1152
    .line 1153
    const/16 v17, 0x1

    .line 1154
    .line 1155
    const/16 v21, 0x1

    .line 1156
    .line 1157
    const/16 v16, 0x0

    .line 1158
    .line 1159
    const-string v18, "top"

    .line 1160
    .line 1161
    const-string v19, "INTEGER"

    .line 1162
    .line 1163
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1164
    .line 1165
    .line 1166
    const-string v4, "top"

    .line 1167
    .line 1168
    invoke-interface {v1, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1169
    .line 1170
    .line 1171
    new-instance v16, La/tjo0;

    .line 1172
    .line 1173
    const/16 v21, 0x0

    .line 1174
    .line 1175
    const/16 v18, 0x1

    .line 1176
    .line 1177
    const/16 v22, 0x1

    .line 1178
    .line 1179
    const/16 v17, 0x0

    .line 1180
    .line 1181
    const-string v19, "ruble_to_currency_rate"

    .line 1182
    .line 1183
    const-string v20, "REAL"

    .line 1184
    .line 1185
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1186
    .line 1187
    .line 1188
    move-object/from16 v4, v16

    .line 1189
    .line 1190
    const-string v12, "ruble_to_currency_rate"

    .line 1191
    .line 1192
    invoke-interface {v1, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    new-instance v13, La/tjo0;

    .line 1196
    .line 1197
    const/16 v18, 0x0

    .line 1198
    .line 1199
    const/4 v15, 0x1

    .line 1200
    const/16 v19, 0x1

    .line 1201
    .line 1202
    const/4 v14, 0x0

    .line 1203
    const-string v16, "symbol"

    .line 1204
    .line 1205
    const-string v17, "TEXT"

    .line 1206
    .line 1207
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1208
    .line 1209
    .line 1210
    const-string v4, "symbol"

    .line 1211
    .line 1212
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    new-instance v14, La/tjo0;

    .line 1216
    .line 1217
    const/16 v19, 0x0

    .line 1218
    .line 1219
    const/16 v16, 0x1

    .line 1220
    .line 1221
    const/16 v20, 0x1

    .line 1222
    .line 1223
    const/4 v15, 0x0

    .line 1224
    const-string v17, "min_out_deposit"

    .line 1225
    .line 1226
    const-string v18, "REAL"

    .line 1227
    .line 1228
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1229
    .line 1230
    .line 1231
    const-string v4, "min_out_deposit"

    .line 1232
    .line 1233
    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1234
    .line 1235
    .line 1236
    new-instance v15, La/tjo0;

    .line 1237
    .line 1238
    const/16 v20, 0x0

    .line 1239
    .line 1240
    const/16 v17, 0x1

    .line 1241
    .line 1242
    const/16 v21, 0x1

    .line 1243
    .line 1244
    const/16 v16, 0x0

    .line 1245
    .line 1246
    const-string v18, "min_out_deposit_electron"

    .line 1247
    .line 1248
    const-string v19, "REAL"

    .line 1249
    .line 1250
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1251
    .line 1252
    .line 1253
    const-string v4, "min_out_deposit_electron"

    .line 1254
    .line 1255
    invoke-interface {v1, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1256
    .line 1257
    .line 1258
    new-instance v16, La/tjo0;

    .line 1259
    .line 1260
    const/16 v21, 0x0

    .line 1261
    .line 1262
    const/16 v18, 0x1

    .line 1263
    .line 1264
    const/16 v17, 0x0

    .line 1265
    .line 1266
    const-string v19, "min_sum_bets"

    .line 1267
    .line 1268
    const-string v20, "REAL"

    .line 1269
    .line 1270
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1271
    .line 1272
    .line 1273
    move-object/from16 v4, v16

    .line 1274
    .line 1275
    const-string v12, "min_sum_bets"

    .line 1276
    .line 1277
    invoke-interface {v1, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1278
    .line 1279
    .line 1280
    new-instance v13, La/tjo0;

    .line 1281
    .line 1282
    const/16 v18, 0x0

    .line 1283
    .line 1284
    const/4 v15, 0x1

    .line 1285
    const/16 v19, 0x1

    .line 1286
    .line 1287
    const/4 v14, 0x0

    .line 1288
    const-string v16, "round"

    .line 1289
    .line 1290
    const-string v17, "INTEGER"

    .line 1291
    .line 1292
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1293
    .line 1294
    .line 1295
    const-string v4, "round"

    .line 1296
    .line 1297
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1298
    .line 1299
    .line 1300
    new-instance v14, La/tjo0;

    .line 1301
    .line 1302
    const/16 v19, 0x0

    .line 1303
    .line 1304
    const/16 v16, 0x1

    .line 1305
    .line 1306
    const/16 v20, 0x1

    .line 1307
    .line 1308
    const/4 v15, 0x0

    .line 1309
    const-string v17, "registration_hidden"

    .line 1310
    .line 1311
    const-string v18, "INTEGER"

    .line 1312
    .line 1313
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1314
    .line 1315
    .line 1316
    const-string v4, "registration_hidden"

    .line 1317
    .line 1318
    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    new-instance v15, La/tjo0;

    .line 1322
    .line 1323
    const/16 v20, 0x0

    .line 1324
    .line 1325
    const/16 v17, 0x1

    .line 1326
    .line 1327
    const/16 v21, 0x1

    .line 1328
    .line 1329
    const/16 v16, 0x0

    .line 1330
    .line 1331
    const-string v18, "crypto"

    .line 1332
    .line 1333
    const-string v19, "INTEGER"

    .line 1334
    .line 1335
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1336
    .line 1337
    .line 1338
    const-string v4, "crypto"

    .line 1339
    .line 1340
    invoke-interface {v1, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1341
    .line 1342
    .line 1343
    new-instance v16, La/tjo0;

    .line 1344
    .line 1345
    const/16 v21, 0x0

    .line 1346
    .line 1347
    const/16 v18, 0x1

    .line 1348
    .line 1349
    const/16 v17, 0x0

    .line 1350
    .line 1351
    const-string v19, "initialBet"

    .line 1352
    .line 1353
    const-string v20, "REAL"

    .line 1354
    .line 1355
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1356
    .line 1357
    .line 1358
    move-object/from16 v4, v16

    .line 1359
    .line 1360
    const-string v12, "initialBet"

    .line 1361
    .line 1362
    invoke-interface {v1, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1363
    .line 1364
    .line 1365
    new-instance v13, La/tjo0;

    .line 1366
    .line 1367
    const/16 v18, 0x0

    .line 1368
    .line 1369
    const/4 v15, 0x1

    .line 1370
    const/16 v19, 0x1

    .line 1371
    .line 1372
    const/4 v14, 0x0

    .line 1373
    const-string v16, "betStep"

    .line 1374
    .line 1375
    const-string v17, "REAL"

    .line 1376
    .line 1377
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1378
    .line 1379
    .line 1380
    const-string v4, "betStep"

    .line 1381
    .line 1382
    invoke-interface {v1, v4, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1383
    .line 1384
    .line 1385
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 1386
    .line 1387
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1388
    .line 1389
    .line 1390
    new-instance v12, Ljava/util/LinkedHashSet;

    .line 1391
    .line 1392
    invoke-direct {v12}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1393
    .line 1394
    .line 1395
    new-instance v13, La/zjo0;

    .line 1396
    .line 1397
    const-string v14, "currencies"

    .line 1398
    .line 1399
    invoke-direct {v13, v14, v1, v4, v12}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 1400
    .line 1401
    .line 1402
    iput-object v0, v2, La/je70;->i:La/qpg0;

    .line 1403
    .line 1404
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 1405
    .line 1406
    iput-object v13, v2, La/je70;->k:La/zjo0;

    .line 1407
    .line 1408
    const/4 v1, 0x2

    .line 1409
    iput v1, v2, La/je70;->A:I

    .line 1410
    .line 1411
    invoke-static {v0, v14, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v1

    .line 1415
    if-ne v1, v3, :cond_3

    .line 1416
    .line 1417
    goto/16 :goto_f

    .line 1418
    .line 1419
    :cond_3
    move-object v4, v0

    .line 1420
    move-object v0, v13

    .line 1421
    :goto_2
    check-cast v1, La/zjo0;

    .line 1422
    .line 1423
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 1424
    .line 1425
    .line 1426
    move-result v12

    .line 1427
    if-nez v12, :cond_4

    .line 1428
    .line 1429
    new-instance v2, La/eeg0;

    .line 1430
    .line 1431
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1432
    .line 1433
    const-string v4, "currencies(org.xplatform.onexdatabase.entity.CurrencyEntity).\n Expected:\n"

    .line 1434
    .line 1435
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1439
    .line 1440
    .line 1441
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1445
    .line 1446
    .line 1447
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v0

    .line 1451
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 1452
    .line 1453
    .line 1454
    return-object v2

    .line 1455
    :cond_4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 1456
    .line 1457
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1458
    .line 1459
    .line 1460
    new-instance v12, La/tjo0;

    .line 1461
    .line 1462
    const/16 v17, 0x0

    .line 1463
    .line 1464
    const/4 v14, 0x1

    .line 1465
    const/16 v18, 0x1

    .line 1466
    .line 1467
    const/4 v13, 0x1

    .line 1468
    const-string v15, "id"

    .line 1469
    .line 1470
    const-string v16, "INTEGER"

    .line 1471
    .line 1472
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1473
    .line 1474
    .line 1475
    invoke-interface {v0, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1476
    .line 1477
    .line 1478
    new-instance v13, La/tjo0;

    .line 1479
    .line 1480
    const/16 v18, 0x0

    .line 1481
    .line 1482
    const/4 v15, 0x1

    .line 1483
    const/16 v19, 0x1

    .line 1484
    .line 1485
    const/4 v14, 0x0

    .line 1486
    const-string v16, "name"

    .line 1487
    .line 1488
    const-string v17, "TEXT"

    .line 1489
    .line 1490
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1491
    .line 1492
    .line 1493
    invoke-interface {v0, v7, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    new-instance v14, La/tjo0;

    .line 1497
    .line 1498
    const/16 v19, 0x0

    .line 1499
    .line 1500
    const/16 v16, 0x1

    .line 1501
    .line 1502
    const/16 v20, 0x1

    .line 1503
    .line 1504
    const/4 v15, 0x0

    .line 1505
    const-string v17, "team"

    .line 1506
    .line 1507
    const-string v18, "TEXT"

    .line 1508
    .line 1509
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1510
    .line 1511
    .line 1512
    const-string v1, "team"

    .line 1513
    .line 1514
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1515
    .line 1516
    .line 1517
    new-instance v15, La/tjo0;

    .line 1518
    .line 1519
    const/16 v20, 0x0

    .line 1520
    .line 1521
    const/16 v17, 0x1

    .line 1522
    .line 1523
    const/16 v21, 0x1

    .line 1524
    .line 1525
    const/16 v16, 0x0

    .line 1526
    .line 1527
    const-string v18, "short_name"

    .line 1528
    .line 1529
    const-string v19, "TEXT"

    .line 1530
    .line 1531
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1532
    .line 1533
    .line 1534
    const-string v1, "short_name"

    .line 1535
    .line 1536
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1537
    .line 1538
    .line 1539
    new-instance v16, La/tjo0;

    .line 1540
    .line 1541
    const/16 v21, 0x0

    .line 1542
    .line 1543
    const/16 v18, 0x1

    .line 1544
    .line 1545
    const/16 v22, 0x1

    .line 1546
    .line 1547
    const/16 v17, 0x0

    .line 1548
    .line 1549
    const-string v19, "cyber"

    .line 1550
    .line 1551
    const-string v20, "INTEGER"

    .line 1552
    .line 1553
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1554
    .line 1555
    .line 1556
    move-object/from16 v1, v16

    .line 1557
    .line 1558
    const-string v12, "cyber"

    .line 1559
    .line 1560
    invoke-interface {v0, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    new-instance v13, La/tjo0;

    .line 1564
    .line 1565
    const/16 v18, 0x0

    .line 1566
    .line 1567
    const/4 v15, 0x1

    .line 1568
    const/16 v19, 0x1

    .line 1569
    .line 1570
    const/4 v14, 0x0

    .line 1571
    const-string v16, "background"

    .line 1572
    .line 1573
    const-string v17, "TEXT"

    .line 1574
    .line 1575
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1576
    .line 1577
    .line 1578
    const-string v1, "background"

    .line 1579
    .line 1580
    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1581
    .line 1582
    .line 1583
    new-instance v14, La/tjo0;

    .line 1584
    .line 1585
    const/16 v19, 0x0

    .line 1586
    .line 1587
    const/16 v16, 0x1

    .line 1588
    .line 1589
    const/16 v20, 0x1

    .line 1590
    .line 1591
    const/4 v15, 0x0

    .line 1592
    const-string v17, "image_small"

    .line 1593
    .line 1594
    const-string v18, "TEXT"

    .line 1595
    .line 1596
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1597
    .line 1598
    .line 1599
    const-string v1, "image_small"

    .line 1600
    .line 1601
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1602
    .line 1603
    .line 1604
    new-instance v15, La/tjo0;

    .line 1605
    .line 1606
    const/16 v20, 0x0

    .line 1607
    .line 1608
    const/16 v17, 0x1

    .line 1609
    .line 1610
    const/16 v21, 0x1

    .line 1611
    .line 1612
    const/16 v16, 0x0

    .line 1613
    .line 1614
    const-string v18, "image_popular"

    .line 1615
    .line 1616
    const-string v19, "TEXT"

    .line 1617
    .line 1618
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1619
    .line 1620
    .line 1621
    const-string v1, "image_popular"

    .line 1622
    .line 1623
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1624
    .line 1625
    .line 1626
    new-instance v16, La/tjo0;

    .line 1627
    .line 1628
    const/16 v21, 0x0

    .line 1629
    .line 1630
    const/16 v18, 0x1

    .line 1631
    .line 1632
    const/16 v17, 0x0

    .line 1633
    .line 1634
    const-string v19, "background_tablet"

    .line 1635
    .line 1636
    const-string v20, "TEXT"

    .line 1637
    .line 1638
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1639
    .line 1640
    .line 1641
    move-object/from16 v1, v16

    .line 1642
    .line 1643
    const-string v12, "background_tablet"

    .line 1644
    .line 1645
    invoke-interface {v0, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1646
    .line 1647
    .line 1648
    new-instance v13, La/tjo0;

    .line 1649
    .line 1650
    const/16 v18, 0x0

    .line 1651
    .line 1652
    const/4 v15, 0x1

    .line 1653
    const/16 v19, 0x1

    .line 1654
    .line 1655
    const/4 v14, 0x0

    .line 1656
    const-string v16, "background_champ_default"

    .line 1657
    .line 1658
    const-string v17, "TEXT"

    .line 1659
    .line 1660
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1661
    .line 1662
    .line 1663
    const-string v1, "background_champ_default"

    .line 1664
    .line 1665
    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1666
    .line 1667
    .line 1668
    new-instance v14, La/tjo0;

    .line 1669
    .line 1670
    const/16 v19, 0x0

    .line 1671
    .line 1672
    const/16 v16, 0x1

    .line 1673
    .line 1674
    const/16 v20, 0x1

    .line 1675
    .line 1676
    const/4 v15, 0x0

    .line 1677
    const-string v17, "background_champ_tablet_default"

    .line 1678
    .line 1679
    const-string v18, "TEXT"

    .line 1680
    .line 1681
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1682
    .line 1683
    .line 1684
    const-string v1, "background_champ_tablet_default"

    .line 1685
    .line 1686
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1687
    .line 1688
    .line 1689
    new-instance v15, La/tjo0;

    .line 1690
    .line 1691
    const/16 v20, 0x0

    .line 1692
    .line 1693
    const/16 v17, 0x1

    .line 1694
    .line 1695
    const/16 v21, 0x1

    .line 1696
    .line 1697
    const/16 v16, 0x0

    .line 1698
    .line 1699
    const-string v18, "background_champ_header_default"

    .line 1700
    .line 1701
    const-string v19, "TEXT"

    .line 1702
    .line 1703
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1704
    .line 1705
    .line 1706
    const-string v1, "background_champ_header_default"

    .line 1707
    .line 1708
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1709
    .line 1710
    .line 1711
    new-instance v16, La/tjo0;

    .line 1712
    .line 1713
    const/16 v21, 0x0

    .line 1714
    .line 1715
    const/16 v18, 0x1

    .line 1716
    .line 1717
    const/16 v17, 0x0

    .line 1718
    .line 1719
    const-string v19, "background_champ_header_tablet_default"

    .line 1720
    .line 1721
    const-string v20, "TEXT"

    .line 1722
    .line 1723
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1724
    .line 1725
    .line 1726
    move-object/from16 v1, v16

    .line 1727
    .line 1728
    const-string v12, "background_champ_header_tablet_default"

    .line 1729
    .line 1730
    invoke-interface {v0, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1731
    .line 1732
    .line 1733
    new-instance v13, La/tjo0;

    .line 1734
    .line 1735
    const/16 v18, 0x0

    .line 1736
    .line 1737
    const/4 v15, 0x1

    .line 1738
    const/16 v19, 0x1

    .line 1739
    .line 1740
    const/4 v14, 0x0

    .line 1741
    const-string v16, "game_background"

    .line 1742
    .line 1743
    const-string v17, "TEXT"

    .line 1744
    .line 1745
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1746
    .line 1747
    .line 1748
    const-string v1, "game_background"

    .line 1749
    .line 1750
    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1751
    .line 1752
    .line 1753
    new-instance v14, La/tjo0;

    .line 1754
    .line 1755
    const/16 v19, 0x0

    .line 1756
    .line 1757
    const/16 v16, 0x1

    .line 1758
    .line 1759
    const/16 v20, 0x1

    .line 1760
    .line 1761
    const/4 v15, 0x0

    .line 1762
    const-string v17, "sub_sports"

    .line 1763
    .line 1764
    const-string v18, "TEXT"

    .line 1765
    .line 1766
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1767
    .line 1768
    .line 1769
    const-string v1, "sub_sports"

    .line 1770
    .line 1771
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1772
    .line 1773
    .line 1774
    new-instance v15, La/tjo0;

    .line 1775
    .line 1776
    const/16 v20, 0x0

    .line 1777
    .line 1778
    const/16 v17, 0x1

    .line 1779
    .line 1780
    const/16 v21, 0x1

    .line 1781
    .line 1782
    const/16 v16, 0x0

    .line 1783
    .line 1784
    const-string v18, "image_champ_small"

    .line 1785
    .line 1786
    const-string v19, "TEXT"

    .line 1787
    .line 1788
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1789
    .line 1790
    .line 1791
    const-string v1, "image_champ_small"

    .line 1792
    .line 1793
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1794
    .line 1795
    .line 1796
    new-instance v16, La/tjo0;

    .line 1797
    .line 1798
    const/16 v21, 0x0

    .line 1799
    .line 1800
    const/16 v18, 0x1

    .line 1801
    .line 1802
    const/16 v17, 0x0

    .line 1803
    .line 1804
    const-string v19, "feed_image_vertical"

    .line 1805
    .line 1806
    const-string v20, "TEXT"

    .line 1807
    .line 1808
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1809
    .line 1810
    .line 1811
    move-object/from16 v1, v16

    .line 1812
    .line 1813
    const-string v12, "feed_image_vertical"

    .line 1814
    .line 1815
    invoke-interface {v0, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1816
    .line 1817
    .line 1818
    new-instance v13, La/tjo0;

    .line 1819
    .line 1820
    const/16 v18, 0x0

    .line 1821
    .line 1822
    const/4 v15, 0x1

    .line 1823
    const/16 v19, 0x1

    .line 1824
    .line 1825
    const/4 v14, 0x0

    .line 1826
    const-string v16, "feed_image_horizontal"

    .line 1827
    .line 1828
    const-string v17, "TEXT"

    .line 1829
    .line 1830
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1831
    .line 1832
    .line 1833
    const-string v1, "feed_image_horizontal"

    .line 1834
    .line 1835
    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1836
    .line 1837
    .line 1838
    new-instance v14, La/tjo0;

    .line 1839
    .line 1840
    const/16 v19, 0x0

    .line 1841
    .line 1842
    const/16 v16, 0x1

    .line 1843
    .line 1844
    const/16 v20, 0x1

    .line 1845
    .line 1846
    const/4 v15, 0x0

    .line 1847
    const-string v17, "feed_image_square"

    .line 1848
    .line 1849
    const-string v18, "TEXT"

    .line 1850
    .line 1851
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1852
    .line 1853
    .line 1854
    const-string v1, "feed_image_square"

    .line 1855
    .line 1856
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1857
    .line 1858
    .line 1859
    new-instance v15, La/tjo0;

    .line 1860
    .line 1861
    const/16 v20, 0x0

    .line 1862
    .line 1863
    const/16 v17, 0x1

    .line 1864
    .line 1865
    const/16 v21, 0x1

    .line 1866
    .line 1867
    const/16 v16, 0x0

    .line 1868
    .line 1869
    const-string v18, "discipline_icon_3d"

    .line 1870
    .line 1871
    const-string v19, "TEXT"

    .line 1872
    .line 1873
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1874
    .line 1875
    .line 1876
    const-string v1, "discipline_icon_3d"

    .line 1877
    .line 1878
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1879
    .line 1880
    .line 1881
    new-instance v16, La/tjo0;

    .line 1882
    .line 1883
    const/16 v21, 0x0

    .line 1884
    .line 1885
    const/16 v18, 0x1

    .line 1886
    .line 1887
    const/16 v17, 0x0

    .line 1888
    .line 1889
    const-string v19, "esports_event_focus_discipline_header"

    .line 1890
    .line 1891
    const-string v20, "TEXT"

    .line 1892
    .line 1893
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1894
    .line 1895
    .line 1896
    move-object/from16 v1, v16

    .line 1897
    .line 1898
    const-string v12, "esports_event_focus_discipline_header"

    .line 1899
    .line 1900
    invoke-interface {v0, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1901
    .line 1902
    .line 1903
    new-instance v13, La/tjo0;

    .line 1904
    .line 1905
    const/16 v18, 0x0

    .line 1906
    .line 1907
    const/4 v15, 0x1

    .line 1908
    const/16 v19, 0x1

    .line 1909
    .line 1910
    const/4 v14, 0x0

    .line 1911
    const-string v16, "esports_header_focus_discipline_header"

    .line 1912
    .line 1913
    const-string v17, "TEXT"

    .line 1914
    .line 1915
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1916
    .line 1917
    .line 1918
    const-string v1, "esports_header_focus_discipline_header"

    .line 1919
    .line 1920
    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1921
    .line 1922
    .line 1923
    new-instance v14, La/tjo0;

    .line 1924
    .line 1925
    const/16 v19, 0x0

    .line 1926
    .line 1927
    const/16 v16, 0x1

    .line 1928
    .line 1929
    const/16 v20, 0x1

    .line 1930
    .line 1931
    const/4 v15, 0x0

    .line 1932
    const-string v17, "default_opponent_header"

    .line 1933
    .line 1934
    const-string v18, "TEXT"

    .line 1935
    .line 1936
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1937
    .line 1938
    .line 1939
    const-string v1, "default_opponent_header"

    .line 1940
    .line 1941
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1942
    .line 1943
    .line 1944
    new-instance v15, La/tjo0;

    .line 1945
    .line 1946
    const/16 v20, 0x0

    .line 1947
    .line 1948
    const/16 v17, 0x1

    .line 1949
    .line 1950
    const/16 v21, 0x1

    .line 1951
    .line 1952
    const/16 v16, 0x0

    .line 1953
    .line 1954
    const-string v18, "default_opponent_header_tablet"

    .line 1955
    .line 1956
    const-string v19, "TEXT"

    .line 1957
    .line 1958
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1959
    .line 1960
    .line 1961
    const-string v1, "default_opponent_header_tablet"

    .line 1962
    .line 1963
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1964
    .line 1965
    .line 1966
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 1967
    .line 1968
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1969
    .line 1970
    .line 1971
    new-instance v12, Ljava/util/LinkedHashSet;

    .line 1972
    .line 1973
    invoke-direct {v12}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1974
    .line 1975
    .line 1976
    new-instance v13, La/zjo0;

    .line 1977
    .line 1978
    const-string v14, "sports"

    .line 1979
    .line 1980
    invoke-direct {v13, v14, v0, v1, v12}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 1981
    .line 1982
    .line 1983
    iput-object v4, v2, La/je70;->i:La/qpg0;

    .line 1984
    .line 1985
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 1986
    .line 1987
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 1988
    .line 1989
    iput-object v13, v2, La/je70;->l:La/zjo0;

    .line 1990
    .line 1991
    const/4 v0, 0x3

    .line 1992
    iput v0, v2, La/je70;->A:I

    .line 1993
    .line 1994
    invoke-static {v4, v14, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v1

    .line 1998
    if-ne v1, v3, :cond_5

    .line 1999
    .line 2000
    goto/16 :goto_f

    .line 2001
    .line 2002
    :cond_5
    move-object v0, v13

    .line 2003
    :goto_3
    check-cast v1, La/zjo0;

    .line 2004
    .line 2005
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 2006
    .line 2007
    .line 2008
    move-result v12

    .line 2009
    if-nez v12, :cond_6

    .line 2010
    .line 2011
    new-instance v2, La/eeg0;

    .line 2012
    .line 2013
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2014
    .line 2015
    const-string v4, "sports(org.xplatform.onexdatabase.entity.SportEntity).\n Expected:\n"

    .line 2016
    .line 2017
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2018
    .line 2019
    .line 2020
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2021
    .line 2022
    .line 2023
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2024
    .line 2025
    .line 2026
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2027
    .line 2028
    .line 2029
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2030
    .line 2031
    .line 2032
    move-result-object v0

    .line 2033
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 2034
    .line 2035
    .line 2036
    return-object v2

    .line 2037
    :cond_6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2038
    .line 2039
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2040
    .line 2041
    .line 2042
    new-instance v12, La/tjo0;

    .line 2043
    .line 2044
    const/16 v17, 0x0

    .line 2045
    .line 2046
    const/4 v14, 0x1

    .line 2047
    const/4 v13, 0x1

    .line 2048
    const-string v15, "id"

    .line 2049
    .line 2050
    const-string v16, "INTEGER"

    .line 2051
    .line 2052
    const/16 v18, 0x1

    .line 2053
    .line 2054
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2055
    .line 2056
    .line 2057
    invoke-interface {v0, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2058
    .line 2059
    .line 2060
    new-instance v13, La/tjo0;

    .line 2061
    .line 2062
    const/16 v18, 0x0

    .line 2063
    .line 2064
    const/4 v15, 0x1

    .line 2065
    const/4 v14, 0x0

    .line 2066
    const-string v16, "name"

    .line 2067
    .line 2068
    const-string v17, "TEXT"

    .line 2069
    .line 2070
    const/16 v19, 0x1

    .line 2071
    .line 2072
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2073
    .line 2074
    .line 2075
    invoke-interface {v0, v7, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2076
    .line 2077
    .line 2078
    new-instance v14, La/tjo0;

    .line 2079
    .line 2080
    const/16 v19, 0x0

    .line 2081
    .line 2082
    const/16 v16, 0x1

    .line 2083
    .line 2084
    const/4 v15, 0x0

    .line 2085
    const-string v17, "type_param"

    .line 2086
    .line 2087
    const-string v18, "INTEGER"

    .line 2088
    .line 2089
    const/16 v20, 0x1

    .line 2090
    .line 2091
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2092
    .line 2093
    .line 2094
    const-string v1, "type_param"

    .line 2095
    .line 2096
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2097
    .line 2098
    .line 2099
    new-instance v15, La/tjo0;

    .line 2100
    .line 2101
    const/16 v20, 0x0

    .line 2102
    .line 2103
    const/16 v17, 0x1

    .line 2104
    .line 2105
    const/16 v16, 0x0

    .line 2106
    .line 2107
    const-string v18, "special_type"

    .line 2108
    .line 2109
    const-string v19, "INTEGER"

    .line 2110
    .line 2111
    const/16 v21, 0x1

    .line 2112
    .line 2113
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2114
    .line 2115
    .line 2116
    const-string v1, "special_type"

    .line 2117
    .line 2118
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2119
    .line 2120
    .line 2121
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 2122
    .line 2123
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2124
    .line 2125
    .line 2126
    new-instance v12, Ljava/util/LinkedHashSet;

    .line 2127
    .line 2128
    invoke-direct {v12}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2129
    .line 2130
    .line 2131
    new-instance v13, La/zjo0;

    .line 2132
    .line 2133
    const-string v14, "events"

    .line 2134
    .line 2135
    invoke-direct {v13, v14, v0, v1, v12}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 2136
    .line 2137
    .line 2138
    iput-object v4, v2, La/je70;->i:La/qpg0;

    .line 2139
    .line 2140
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 2141
    .line 2142
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 2143
    .line 2144
    iput-object v11, v2, La/je70;->l:La/zjo0;

    .line 2145
    .line 2146
    iput-object v13, v2, La/je70;->m:La/zjo0;

    .line 2147
    .line 2148
    const/4 v0, 0x4

    .line 2149
    iput v0, v2, La/je70;->A:I

    .line 2150
    .line 2151
    invoke-static {v4, v14, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v1

    .line 2155
    if-ne v1, v3, :cond_7

    .line 2156
    .line 2157
    goto/16 :goto_f

    .line 2158
    .line 2159
    :cond_7
    move-object v0, v13

    .line 2160
    :goto_4
    check-cast v1, La/zjo0;

    .line 2161
    .line 2162
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 2163
    .line 2164
    .line 2165
    move-result v12

    .line 2166
    if-nez v12, :cond_8

    .line 2167
    .line 2168
    new-instance v2, La/eeg0;

    .line 2169
    .line 2170
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2171
    .line 2172
    const-string v4, "events(org.xplatform.onexdatabase.entity.EventDbModel).\n Expected:\n"

    .line 2173
    .line 2174
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2175
    .line 2176
    .line 2177
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2178
    .line 2179
    .line 2180
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2181
    .line 2182
    .line 2183
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2184
    .line 2185
    .line 2186
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v0

    .line 2190
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 2191
    .line 2192
    .line 2193
    return-object v2

    .line 2194
    :cond_8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2195
    .line 2196
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2197
    .line 2198
    .line 2199
    new-instance v12, La/tjo0;

    .line 2200
    .line 2201
    const/16 v17, 0x0

    .line 2202
    .line 2203
    const/4 v14, 0x1

    .line 2204
    const/4 v13, 0x1

    .line 2205
    const-string v15, "id"

    .line 2206
    .line 2207
    const-string v16, "INTEGER"

    .line 2208
    .line 2209
    const/16 v18, 0x1

    .line 2210
    .line 2211
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2212
    .line 2213
    .line 2214
    invoke-interface {v0, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2215
    .line 2216
    .line 2217
    new-instance v13, La/tjo0;

    .line 2218
    .line 2219
    const/16 v18, 0x0

    .line 2220
    .line 2221
    const/4 v15, 0x1

    .line 2222
    const/4 v14, 0x0

    .line 2223
    const-string v16, "name"

    .line 2224
    .line 2225
    const-string v17, "TEXT"

    .line 2226
    .line 2227
    const/16 v19, 0x1

    .line 2228
    .line 2229
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2230
    .line 2231
    .line 2232
    invoke-interface {v0, v7, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2233
    .line 2234
    .line 2235
    new-instance v14, La/tjo0;

    .line 2236
    .line 2237
    const/16 v19, 0x0

    .line 2238
    .line 2239
    const/16 v16, 0x1

    .line 2240
    .line 2241
    const/4 v15, 0x0

    .line 2242
    const-string v17, "position"

    .line 2243
    .line 2244
    const-string v18, "INTEGER"

    .line 2245
    .line 2246
    const/16 v20, 0x1

    .line 2247
    .line 2248
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2249
    .line 2250
    .line 2251
    const-string v1, "position"

    .line 2252
    .line 2253
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2254
    .line 2255
    .line 2256
    new-instance v15, La/tjo0;

    .line 2257
    .line 2258
    const/16 v20, 0x0

    .line 2259
    .line 2260
    const/16 v17, 0x1

    .line 2261
    .line 2262
    const/16 v16, 0x0

    .line 2263
    .line 2264
    const-string v18, "count_cols"

    .line 2265
    .line 2266
    const-string v19, "INTEGER"

    .line 2267
    .line 2268
    const/16 v21, 0x1

    .line 2269
    .line 2270
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2271
    .line 2272
    .line 2273
    const-string v1, "count_cols"

    .line 2274
    .line 2275
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2276
    .line 2277
    .line 2278
    new-instance v16, La/tjo0;

    .line 2279
    .line 2280
    const/16 v21, 0x0

    .line 2281
    .line 2282
    const/16 v18, 0x1

    .line 2283
    .line 2284
    const/16 v17, 0x0

    .line 2285
    .line 2286
    const-string v19, "has_auto_sub"

    .line 2287
    .line 2288
    const-string v20, "INTEGER"

    .line 2289
    .line 2290
    const/16 v22, 0x1

    .line 2291
    .line 2292
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2293
    .line 2294
    .line 2295
    move-object/from16 v1, v16

    .line 2296
    .line 2297
    const-string v7, "has_auto_sub"

    .line 2298
    .line 2299
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2300
    .line 2301
    .line 2302
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 2303
    .line 2304
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2305
    .line 2306
    .line 2307
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 2308
    .line 2309
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2310
    .line 2311
    .line 2312
    new-instance v12, La/zjo0;

    .line 2313
    .line 2314
    const-string v13, "event_groups"

    .line 2315
    .line 2316
    invoke-direct {v12, v13, v0, v1, v7}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 2317
    .line 2318
    .line 2319
    iput-object v4, v2, La/je70;->i:La/qpg0;

    .line 2320
    .line 2321
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 2322
    .line 2323
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 2324
    .line 2325
    iput-object v11, v2, La/je70;->l:La/zjo0;

    .line 2326
    .line 2327
    iput-object v11, v2, La/je70;->m:La/zjo0;

    .line 2328
    .line 2329
    iput-object v12, v2, La/je70;->n:La/zjo0;

    .line 2330
    .line 2331
    const/4 v0, 0x5

    .line 2332
    iput v0, v2, La/je70;->A:I

    .line 2333
    .line 2334
    invoke-static {v4, v13, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v1

    .line 2338
    if-ne v1, v3, :cond_9

    .line 2339
    .line 2340
    goto/16 :goto_f

    .line 2341
    .line 2342
    :cond_9
    move-object v0, v12

    .line 2343
    :goto_5
    check-cast v1, La/zjo0;

    .line 2344
    .line 2345
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 2346
    .line 2347
    .line 2348
    move-result v7

    .line 2349
    if-nez v7, :cond_a

    .line 2350
    .line 2351
    new-instance v2, La/eeg0;

    .line 2352
    .line 2353
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2354
    .line 2355
    const-string v4, "event_groups(org.xplatform.onexdatabase.entity.EventGroupDbModel).\n Expected:\n"

    .line 2356
    .line 2357
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2358
    .line 2359
    .line 2360
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2361
    .line 2362
    .line 2363
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2364
    .line 2365
    .line 2366
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2367
    .line 2368
    .line 2369
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2370
    .line 2371
    .line 2372
    move-result-object v0

    .line 2373
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 2374
    .line 2375
    .line 2376
    return-object v2

    .line 2377
    :cond_a
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2378
    .line 2379
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2380
    .line 2381
    .line 2382
    new-instance v12, La/tjo0;

    .line 2383
    .line 2384
    const/16 v17, 0x0

    .line 2385
    .line 2386
    const/4 v14, 0x1

    .line 2387
    const/4 v13, 0x0

    .line 2388
    const-string v15, "id"

    .line 2389
    .line 2390
    const-string v16, "INTEGER"

    .line 2391
    .line 2392
    const/16 v18, 0x1

    .line 2393
    .line 2394
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2395
    .line 2396
    .line 2397
    invoke-interface {v0, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2398
    .line 2399
    .line 2400
    new-instance v13, La/tjo0;

    .line 2401
    .line 2402
    const/16 v18, 0x0

    .line 2403
    .line 2404
    const/4 v15, 0x1

    .line 2405
    const/4 v14, 0x0

    .line 2406
    const-string v16, "is_live"

    .line 2407
    .line 2408
    const-string v17, "INTEGER"

    .line 2409
    .line 2410
    const/16 v19, 0x1

    .line 2411
    .line 2412
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2413
    .line 2414
    .line 2415
    const-string v1, "is_live"

    .line 2416
    .line 2417
    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2418
    .line 2419
    .line 2420
    new-instance v14, La/tjo0;

    .line 2421
    .line 2422
    const/16 v19, 0x0

    .line 2423
    .line 2424
    const/16 v16, 0x1

    .line 2425
    .line 2426
    const/4 v15, 0x0

    .line 2427
    const-string v17, "screen_type"

    .line 2428
    .line 2429
    const-string v18, "TEXT"

    .line 2430
    .line 2431
    const/16 v20, 0x1

    .line 2432
    .line 2433
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2434
    .line 2435
    .line 2436
    const-string v1, "screen_type"

    .line 2437
    .line 2438
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2439
    .line 2440
    .line 2441
    new-instance v15, La/tjo0;

    .line 2442
    .line 2443
    const/16 v20, 0x0

    .line 2444
    .line 2445
    const/16 v17, 0x1

    .line 2446
    .line 2447
    const-string v18, "primary_key"

    .line 2448
    .line 2449
    const-string v19, "TEXT"

    .line 2450
    .line 2451
    const/16 v21, 0x1

    .line 2452
    .line 2453
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2454
    .line 2455
    .line 2456
    const-string v1, "primary_key"

    .line 2457
    .line 2458
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2459
    .line 2460
    .line 2461
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 2462
    .line 2463
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2464
    .line 2465
    .line 2466
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 2467
    .line 2468
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2469
    .line 2470
    .line 2471
    new-instance v12, La/zjo0;

    .line 2472
    .line 2473
    const-string v13, "favorite_champs"

    .line 2474
    .line 2475
    invoke-direct {v12, v13, v0, v1, v7}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 2476
    .line 2477
    .line 2478
    iput-object v4, v2, La/je70;->i:La/qpg0;

    .line 2479
    .line 2480
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 2481
    .line 2482
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 2483
    .line 2484
    iput-object v11, v2, La/je70;->l:La/zjo0;

    .line 2485
    .line 2486
    iput-object v11, v2, La/je70;->m:La/zjo0;

    .line 2487
    .line 2488
    iput-object v11, v2, La/je70;->n:La/zjo0;

    .line 2489
    .line 2490
    iput-object v12, v2, La/je70;->o:La/zjo0;

    .line 2491
    .line 2492
    const/4 v0, 0x6

    .line 2493
    iput v0, v2, La/je70;->A:I

    .line 2494
    .line 2495
    invoke-static {v4, v13, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 2496
    .line 2497
    .line 2498
    move-result-object v1

    .line 2499
    if-ne v1, v3, :cond_b

    .line 2500
    .line 2501
    goto/16 :goto_f

    .line 2502
    .line 2503
    :cond_b
    move-object v0, v12

    .line 2504
    :goto_6
    check-cast v1, La/zjo0;

    .line 2505
    .line 2506
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 2507
    .line 2508
    .line 2509
    move-result v7

    .line 2510
    if-nez v7, :cond_c

    .line 2511
    .line 2512
    new-instance v2, La/eeg0;

    .line 2513
    .line 2514
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2515
    .line 2516
    const-string v4, "favorite_champs(org.xplatform.onexdatabase.entity.FavoriteChamp).\n Expected:\n"

    .line 2517
    .line 2518
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2519
    .line 2520
    .line 2521
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2522
    .line 2523
    .line 2524
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2525
    .line 2526
    .line 2527
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2528
    .line 2529
    .line 2530
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2531
    .line 2532
    .line 2533
    move-result-object v0

    .line 2534
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 2535
    .line 2536
    .line 2537
    return-object v2

    .line 2538
    :cond_c
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2539
    .line 2540
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2541
    .line 2542
    .line 2543
    new-instance v12, La/tjo0;

    .line 2544
    .line 2545
    const/16 v17, 0x0

    .line 2546
    .line 2547
    const/4 v14, 0x1

    .line 2548
    const/4 v13, 0x2

    .line 2549
    const-string v15, "locale"

    .line 2550
    .line 2551
    const-string v16, "TEXT"

    .line 2552
    .line 2553
    const/16 v18, 0x1

    .line 2554
    .line 2555
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2556
    .line 2557
    .line 2558
    const-string v1, "locale"

    .line 2559
    .line 2560
    invoke-interface {v0, v1, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2561
    .line 2562
    .line 2563
    new-instance v13, La/tjo0;

    .line 2564
    .line 2565
    const/16 v18, 0x0

    .line 2566
    .line 2567
    const/4 v15, 0x1

    .line 2568
    const-string v16, "key"

    .line 2569
    .line 2570
    const-string v17, "TEXT"

    .line 2571
    .line 2572
    const/16 v19, 0x1

    .line 2573
    .line 2574
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2575
    .line 2576
    .line 2577
    const-string v1, "key"

    .line 2578
    .line 2579
    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2580
    .line 2581
    .line 2582
    new-instance v14, La/tjo0;

    .line 2583
    .line 2584
    const/16 v19, 0x0

    .line 2585
    .line 2586
    const/16 v16, 0x1

    .line 2587
    .line 2588
    const/4 v15, 0x0

    .line 2589
    const-string v17, "value"

    .line 2590
    .line 2591
    const-string v18, "TEXT"

    .line 2592
    .line 2593
    const/16 v20, 0x1

    .line 2594
    .line 2595
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2596
    .line 2597
    .line 2598
    const-string v1, "value"

    .line 2599
    .line 2600
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2601
    .line 2602
    .line 2603
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 2604
    .line 2605
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2606
    .line 2607
    .line 2608
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 2609
    .line 2610
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2611
    .line 2612
    .line 2613
    new-instance v12, La/zjo0;

    .line 2614
    .line 2615
    const-string v13, "strings"

    .line 2616
    .line 2617
    invoke-direct {v12, v13, v0, v1, v7}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 2618
    .line 2619
    .line 2620
    iput-object v4, v2, La/je70;->i:La/qpg0;

    .line 2621
    .line 2622
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 2623
    .line 2624
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 2625
    .line 2626
    iput-object v11, v2, La/je70;->l:La/zjo0;

    .line 2627
    .line 2628
    iput-object v11, v2, La/je70;->m:La/zjo0;

    .line 2629
    .line 2630
    iput-object v11, v2, La/je70;->n:La/zjo0;

    .line 2631
    .line 2632
    iput-object v11, v2, La/je70;->o:La/zjo0;

    .line 2633
    .line 2634
    iput-object v12, v2, La/je70;->p:La/zjo0;

    .line 2635
    .line 2636
    const/4 v0, 0x7

    .line 2637
    iput v0, v2, La/je70;->A:I

    .line 2638
    .line 2639
    invoke-static {v4, v13, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 2640
    .line 2641
    .line 2642
    move-result-object v1

    .line 2643
    if-ne v1, v3, :cond_d

    .line 2644
    .line 2645
    goto/16 :goto_f

    .line 2646
    .line 2647
    :cond_d
    move-object v0, v12

    .line 2648
    :goto_7
    check-cast v1, La/zjo0;

    .line 2649
    .line 2650
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 2651
    .line 2652
    .line 2653
    move-result v7

    .line 2654
    if-nez v7, :cond_e

    .line 2655
    .line 2656
    new-instance v2, La/eeg0;

    .line 2657
    .line 2658
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2659
    .line 2660
    const-string v4, "strings(org.xplatform.onexdatabase.entity.AppString).\n Expected:\n"

    .line 2661
    .line 2662
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2663
    .line 2664
    .line 2665
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2666
    .line 2667
    .line 2668
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2669
    .line 2670
    .line 2671
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2672
    .line 2673
    .line 2674
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2675
    .line 2676
    .line 2677
    move-result-object v0

    .line 2678
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 2679
    .line 2680
    .line 2681
    return-object v2

    .line 2682
    :cond_e
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2683
    .line 2684
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2685
    .line 2686
    .line 2687
    new-instance v12, La/tjo0;

    .line 2688
    .line 2689
    const/16 v17, 0x0

    .line 2690
    .line 2691
    const/4 v14, 0x1

    .line 2692
    const/4 v13, 0x1

    .line 2693
    const-string v15, "id"

    .line 2694
    .line 2695
    const-string v16, "INTEGER"

    .line 2696
    .line 2697
    const/16 v18, 0x1

    .line 2698
    .line 2699
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2700
    .line 2701
    .line 2702
    invoke-interface {v0, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2703
    .line 2704
    .line 2705
    new-instance v13, La/tjo0;

    .line 2706
    .line 2707
    const/16 v18, 0x0

    .line 2708
    .line 2709
    const/4 v15, 0x1

    .line 2710
    const/4 v14, 0x0

    .line 2711
    const-string v16, "type"

    .line 2712
    .line 2713
    const-string v17, "INTEGER"

    .line 2714
    .line 2715
    const/16 v19, 0x1

    .line 2716
    .line 2717
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2718
    .line 2719
    .line 2720
    invoke-interface {v0, v6, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2721
    .line 2722
    .line 2723
    new-instance v14, La/tjo0;

    .line 2724
    .line 2725
    const/16 v19, 0x0

    .line 2726
    .line 2727
    const/16 v16, 0x1

    .line 2728
    .line 2729
    const/4 v15, 0x0

    .line 2730
    const-string v17, "date"

    .line 2731
    .line 2732
    const-string v18, "INTEGER"

    .line 2733
    .line 2734
    const/16 v20, 0x1

    .line 2735
    .line 2736
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2737
    .line 2738
    .line 2739
    const-string v1, "date"

    .line 2740
    .line 2741
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2742
    .line 2743
    .line 2744
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 2745
    .line 2746
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2747
    .line 2748
    .line 2749
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 2750
    .line 2751
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 2752
    .line 2753
    .line 2754
    new-instance v12, La/zjo0;

    .line 2755
    .line 2756
    const-string v13, "last_action"

    .line 2757
    .line 2758
    invoke-direct {v12, v13, v0, v1, v7}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 2759
    .line 2760
    .line 2761
    iput-object v4, v2, La/je70;->i:La/qpg0;

    .line 2762
    .line 2763
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 2764
    .line 2765
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 2766
    .line 2767
    iput-object v11, v2, La/je70;->l:La/zjo0;

    .line 2768
    .line 2769
    iput-object v11, v2, La/je70;->m:La/zjo0;

    .line 2770
    .line 2771
    iput-object v11, v2, La/je70;->n:La/zjo0;

    .line 2772
    .line 2773
    iput-object v11, v2, La/je70;->o:La/zjo0;

    .line 2774
    .line 2775
    iput-object v11, v2, La/je70;->p:La/zjo0;

    .line 2776
    .line 2777
    iput-object v12, v2, La/je70;->q:La/zjo0;

    .line 2778
    .line 2779
    const/16 v0, 0x8

    .line 2780
    .line 2781
    iput v0, v2, La/je70;->A:I

    .line 2782
    .line 2783
    invoke-static {v4, v13, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 2784
    .line 2785
    .line 2786
    move-result-object v1

    .line 2787
    if-ne v1, v3, :cond_f

    .line 2788
    .line 2789
    goto/16 :goto_f

    .line 2790
    .line 2791
    :cond_f
    move-object v0, v12

    .line 2792
    :goto_8
    check-cast v1, La/zjo0;

    .line 2793
    .line 2794
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 2795
    .line 2796
    .line 2797
    move-result v7

    .line 2798
    if-nez v7, :cond_10

    .line 2799
    .line 2800
    new-instance v2, La/eeg0;

    .line 2801
    .line 2802
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2803
    .line 2804
    const-string v4, "last_action(org.xplatform.onexdatabase.entity.LastAction).\n Expected:\n"

    .line 2805
    .line 2806
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2807
    .line 2808
    .line 2809
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2810
    .line 2811
    .line 2812
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2813
    .line 2814
    .line 2815
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2816
    .line 2817
    .line 2818
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2819
    .line 2820
    .line 2821
    move-result-object v0

    .line 2822
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 2823
    .line 2824
    .line 2825
    return-object v2

    .line 2826
    :cond_10
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2827
    .line 2828
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2829
    .line 2830
    .line 2831
    new-instance v12, La/tjo0;

    .line 2832
    .line 2833
    const/16 v17, 0x0

    .line 2834
    .line 2835
    const/4 v14, 0x1

    .line 2836
    const/4 v13, 0x1

    .line 2837
    const-string v15, "id"

    .line 2838
    .line 2839
    const-string v16, "INTEGER"

    .line 2840
    .line 2841
    const/16 v18, 0x1

    .line 2842
    .line 2843
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2844
    .line 2845
    .line 2846
    invoke-interface {v0, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2847
    .line 2848
    .line 2849
    new-instance v13, La/tjo0;

    .line 2850
    .line 2851
    const/16 v18, 0x0

    .line 2852
    .line 2853
    const/4 v15, 0x1

    .line 2854
    const/4 v14, 0x0

    .line 2855
    const-string v16, "country_name"

    .line 2856
    .line 2857
    const-string v17, "TEXT"

    .line 2858
    .line 2859
    const/16 v19, 0x1

    .line 2860
    .line 2861
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2862
    .line 2863
    .line 2864
    const-string v1, "country_name"

    .line 2865
    .line 2866
    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2867
    .line 2868
    .line 2869
    new-instance v14, La/tjo0;

    .line 2870
    .line 2871
    const/16 v19, 0x0

    .line 2872
    .line 2873
    const/16 v16, 0x1

    .line 2874
    .line 2875
    const/4 v15, 0x0

    .line 2876
    const-string v17, "country_phone_code"

    .line 2877
    .line 2878
    const-string v18, "INTEGER"

    .line 2879
    .line 2880
    const/16 v20, 0x1

    .line 2881
    .line 2882
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2883
    .line 2884
    .line 2885
    const-string v1, "country_phone_code"

    .line 2886
    .line 2887
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2888
    .line 2889
    .line 2890
    new-instance v15, La/tjo0;

    .line 2891
    .line 2892
    const/16 v20, 0x0

    .line 2893
    .line 2894
    const/16 v17, 0x1

    .line 2895
    .line 2896
    const/16 v16, 0x0

    .line 2897
    .line 2898
    const-string v18, "country_code"

    .line 2899
    .line 2900
    const-string v19, "TEXT"

    .line 2901
    .line 2902
    const/16 v21, 0x1

    .line 2903
    .line 2904
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2905
    .line 2906
    .line 2907
    const-string v1, "country_code"

    .line 2908
    .line 2909
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2910
    .line 2911
    .line 2912
    new-instance v16, La/tjo0;

    .line 2913
    .line 2914
    const/16 v21, 0x0

    .line 2915
    .line 2916
    const/16 v18, 0x1

    .line 2917
    .line 2918
    const/16 v17, 0x0

    .line 2919
    .line 2920
    const-string v19, "country_currency_id"

    .line 2921
    .line 2922
    const-string v20, "INTEGER"

    .line 2923
    .line 2924
    const/16 v22, 0x1

    .line 2925
    .line 2926
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2927
    .line 2928
    .line 2929
    move-object/from16 v1, v16

    .line 2930
    .line 2931
    const-string v7, "country_currency_id"

    .line 2932
    .line 2933
    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2934
    .line 2935
    .line 2936
    new-instance v12, La/tjo0;

    .line 2937
    .line 2938
    const/16 v17, 0x0

    .line 2939
    .line 2940
    const/4 v14, 0x1

    .line 2941
    const/4 v13, 0x0

    .line 2942
    const-string v15, "country_image"

    .line 2943
    .line 2944
    const-string v16, "TEXT"

    .line 2945
    .line 2946
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2947
    .line 2948
    .line 2949
    const-string v1, "country_image"

    .line 2950
    .line 2951
    invoke-interface {v0, v1, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2952
    .line 2953
    .line 2954
    new-instance v13, La/tjo0;

    .line 2955
    .line 2956
    const-string v18, "0"

    .line 2957
    .line 2958
    const/4 v15, 0x1

    .line 2959
    const/4 v14, 0x0

    .line 2960
    const-string v16, "phone_mask_max_length"

    .line 2961
    .line 2962
    const-string v17, "INTEGER"

    .line 2963
    .line 2964
    const/16 v19, 0x1

    .line 2965
    .line 2966
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2967
    .line 2968
    .line 2969
    const-string v1, "phone_mask_max_length"

    .line 2970
    .line 2971
    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2972
    .line 2973
    .line 2974
    new-instance v14, La/tjo0;

    .line 2975
    .line 2976
    const-string v19, "0"

    .line 2977
    .line 2978
    const/16 v16, 0x1

    .line 2979
    .line 2980
    const/4 v15, 0x0

    .line 2981
    const-string v17, "phone_mask_min_length"

    .line 2982
    .line 2983
    const-string v18, "INTEGER"

    .line 2984
    .line 2985
    const/16 v20, 0x1

    .line 2986
    .line 2987
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2988
    .line 2989
    .line 2990
    const-string v1, "phone_mask_min_length"

    .line 2991
    .line 2992
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2993
    .line 2994
    .line 2995
    new-instance v15, La/tjo0;

    .line 2996
    .line 2997
    const-string v20, "\'\'"

    .line 2998
    .line 2999
    const/16 v17, 0x1

    .line 3000
    .line 3001
    const/16 v16, 0x0

    .line 3002
    .line 3003
    const-string v18, "phone_mask"

    .line 3004
    .line 3005
    const-string v19, "TEXT"

    .line 3006
    .line 3007
    const/16 v21, 0x1

    .line 3008
    .line 3009
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3010
    .line 3011
    .line 3012
    const-string v1, "phone_mask"

    .line 3013
    .line 3014
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3015
    .line 3016
    .line 3017
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 3018
    .line 3019
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3020
    .line 3021
    .line 3022
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 3023
    .line 3024
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3025
    .line 3026
    .line 3027
    new-instance v12, La/zjo0;

    .line 3028
    .line 3029
    const-string v13, "country"

    .line 3030
    .line 3031
    invoke-direct {v12, v13, v0, v1, v7}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 3032
    .line 3033
    .line 3034
    iput-object v4, v2, La/je70;->i:La/qpg0;

    .line 3035
    .line 3036
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 3037
    .line 3038
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 3039
    .line 3040
    iput-object v11, v2, La/je70;->l:La/zjo0;

    .line 3041
    .line 3042
    iput-object v11, v2, La/je70;->m:La/zjo0;

    .line 3043
    .line 3044
    iput-object v11, v2, La/je70;->n:La/zjo0;

    .line 3045
    .line 3046
    iput-object v11, v2, La/je70;->o:La/zjo0;

    .line 3047
    .line 3048
    iput-object v11, v2, La/je70;->p:La/zjo0;

    .line 3049
    .line 3050
    iput-object v11, v2, La/je70;->q:La/zjo0;

    .line 3051
    .line 3052
    iput-object v12, v2, La/je70;->r:La/zjo0;

    .line 3053
    .line 3054
    const/16 v0, 0x9

    .line 3055
    .line 3056
    iput v0, v2, La/je70;->A:I

    .line 3057
    .line 3058
    invoke-static {v4, v13, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 3059
    .line 3060
    .line 3061
    move-result-object v1

    .line 3062
    if-ne v1, v3, :cond_11

    .line 3063
    .line 3064
    goto/16 :goto_f

    .line 3065
    .line 3066
    :cond_11
    move-object v0, v12

    .line 3067
    :goto_9
    check-cast v1, La/zjo0;

    .line 3068
    .line 3069
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 3070
    .line 3071
    .line 3072
    move-result v7

    .line 3073
    if-nez v7, :cond_12

    .line 3074
    .line 3075
    new-instance v2, La/eeg0;

    .line 3076
    .line 3077
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3078
    .line 3079
    const-string v4, "country(org.xplatform.onexdatabase.entity.CountryEntity).\n Expected:\n"

    .line 3080
    .line 3081
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3082
    .line 3083
    .line 3084
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3085
    .line 3086
    .line 3087
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3088
    .line 3089
    .line 3090
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3091
    .line 3092
    .line 3093
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3094
    .line 3095
    .line 3096
    move-result-object v0

    .line 3097
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 3098
    .line 3099
    .line 3100
    return-object v2

    .line 3101
    :cond_12
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3102
    .line 3103
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 3104
    .line 3105
    .line 3106
    new-instance v12, La/tjo0;

    .line 3107
    .line 3108
    const/16 v17, 0x0

    .line 3109
    .line 3110
    const/4 v14, 0x1

    .line 3111
    const/4 v13, 0x1

    .line 3112
    const-string v15, "id"

    .line 3113
    .line 3114
    const-string v16, "INTEGER"

    .line 3115
    .line 3116
    const/16 v18, 0x1

    .line 3117
    .line 3118
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3119
    .line 3120
    .line 3121
    invoke-interface {v0, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3122
    .line 3123
    .line 3124
    new-instance v13, La/tjo0;

    .line 3125
    .line 3126
    const/16 v18, 0x0

    .line 3127
    .line 3128
    const/4 v15, 0x1

    .line 3129
    const/4 v14, 0x0

    .line 3130
    const-string v16, "hidden"

    .line 3131
    .line 3132
    const-string v17, "INTEGER"

    .line 3133
    .line 3134
    const/16 v19, 0x1

    .line 3135
    .line 3136
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3137
    .line 3138
    .line 3139
    const-string v1, "hidden"

    .line 3140
    .line 3141
    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3142
    .line 3143
    .line 3144
    new-instance v14, La/tjo0;

    .line 3145
    .line 3146
    const/16 v19, 0x0

    .line 3147
    .line 3148
    const/16 v16, 0x1

    .line 3149
    .line 3150
    const/4 v15, 0x0

    .line 3151
    const-string v17, "pinned_position"

    .line 3152
    .line 3153
    const-string v18, "INTEGER"

    .line 3154
    .line 3155
    const/16 v20, 0x1

    .line 3156
    .line 3157
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3158
    .line 3159
    .line 3160
    const-string v1, "pinned_position"

    .line 3161
    .line 3162
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3163
    .line 3164
    .line 3165
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 3166
    .line 3167
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3168
    .line 3169
    .line 3170
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 3171
    .line 3172
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3173
    .line 3174
    .line 3175
    new-instance v12, La/zjo0;

    .line 3176
    .line 3177
    const-string v13, "market_filter"

    .line 3178
    .line 3179
    invoke-direct {v12, v13, v0, v1, v7}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 3180
    .line 3181
    .line 3182
    iput-object v4, v2, La/je70;->i:La/qpg0;

    .line 3183
    .line 3184
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 3185
    .line 3186
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 3187
    .line 3188
    iput-object v11, v2, La/je70;->l:La/zjo0;

    .line 3189
    .line 3190
    iput-object v11, v2, La/je70;->m:La/zjo0;

    .line 3191
    .line 3192
    iput-object v11, v2, La/je70;->n:La/zjo0;

    .line 3193
    .line 3194
    iput-object v11, v2, La/je70;->o:La/zjo0;

    .line 3195
    .line 3196
    iput-object v11, v2, La/je70;->p:La/zjo0;

    .line 3197
    .line 3198
    iput-object v11, v2, La/je70;->q:La/zjo0;

    .line 3199
    .line 3200
    iput-object v11, v2, La/je70;->r:La/zjo0;

    .line 3201
    .line 3202
    iput-object v12, v2, La/je70;->s:La/zjo0;

    .line 3203
    .line 3204
    const/16 v0, 0xa

    .line 3205
    .line 3206
    iput v0, v2, La/je70;->A:I

    .line 3207
    .line 3208
    invoke-static {v4, v13, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 3209
    .line 3210
    .line 3211
    move-result-object v1

    .line 3212
    if-ne v1, v3, :cond_13

    .line 3213
    .line 3214
    goto/16 :goto_f

    .line 3215
    .line 3216
    :cond_13
    move-object v0, v12

    .line 3217
    :goto_a
    check-cast v1, La/zjo0;

    .line 3218
    .line 3219
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 3220
    .line 3221
    .line 3222
    move-result v7

    .line 3223
    if-nez v7, :cond_14

    .line 3224
    .line 3225
    new-instance v2, La/eeg0;

    .line 3226
    .line 3227
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3228
    .line 3229
    const-string v4, "market_filter(org.xplatform.onexdatabase.entity.MarketFilterEntity).\n Expected:\n"

    .line 3230
    .line 3231
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3232
    .line 3233
    .line 3234
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3235
    .line 3236
    .line 3237
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3238
    .line 3239
    .line 3240
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3241
    .line 3242
    .line 3243
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3244
    .line 3245
    .line 3246
    move-result-object v0

    .line 3247
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 3248
    .line 3249
    .line 3250
    return-object v2

    .line 3251
    :cond_14
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3252
    .line 3253
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 3254
    .line 3255
    .line 3256
    new-instance v12, La/tjo0;

    .line 3257
    .line 3258
    const/16 v17, 0x0

    .line 3259
    .line 3260
    const/4 v14, 0x1

    .line 3261
    const/4 v13, 0x1

    .line 3262
    const-string v15, "id"

    .line 3263
    .line 3264
    const-string v16, "INTEGER"

    .line 3265
    .line 3266
    const/16 v18, 0x1

    .line 3267
    .line 3268
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3269
    .line 3270
    .line 3271
    invoke-interface {v0, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3272
    .line 3273
    .line 3274
    new-instance v13, La/tjo0;

    .line 3275
    .line 3276
    const/16 v18, 0x0

    .line 3277
    .line 3278
    const/4 v15, 0x1

    .line 3279
    const/4 v14, 0x0

    .line 3280
    const-string v16, "type"

    .line 3281
    .line 3282
    const-string v17, "INTEGER"

    .line 3283
    .line 3284
    const/16 v19, 0x1

    .line 3285
    .line 3286
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3287
    .line 3288
    .line 3289
    invoke-interface {v0, v6, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3290
    .line 3291
    .line 3292
    new-instance v14, La/tjo0;

    .line 3293
    .line 3294
    const/16 v19, 0x0

    .line 3295
    .line 3296
    const/16 v16, 0x1

    .line 3297
    .line 3298
    const/4 v15, 0x0

    .line 3299
    const-string v17, "itemId"

    .line 3300
    .line 3301
    const-string v18, "INTEGER"

    .line 3302
    .line 3303
    const/16 v20, 0x1

    .line 3304
    .line 3305
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3306
    .line 3307
    .line 3308
    const-string v1, "itemId"

    .line 3309
    .line 3310
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3311
    .line 3312
    .line 3313
    new-instance v15, La/tjo0;

    .line 3314
    .line 3315
    const/16 v20, 0x0

    .line 3316
    .line 3317
    const/16 v17, 0x1

    .line 3318
    .line 3319
    const/16 v16, 0x0

    .line 3320
    .line 3321
    const-string v18, "title"

    .line 3322
    .line 3323
    const-string v19, "TEXT"

    .line 3324
    .line 3325
    const/16 v21, 0x1

    .line 3326
    .line 3327
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3328
    .line 3329
    .line 3330
    const-string v1, "title"

    .line 3331
    .line 3332
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3333
    .line 3334
    .line 3335
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 3336
    .line 3337
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3338
    .line 3339
    .line 3340
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 3341
    .line 3342
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3343
    .line 3344
    .line 3345
    new-instance v7, La/zjo0;

    .line 3346
    .line 3347
    const-string v12, "statistic_dictionaries"

    .line 3348
    .line 3349
    invoke-direct {v7, v12, v0, v1, v6}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 3350
    .line 3351
    .line 3352
    iput-object v4, v2, La/je70;->i:La/qpg0;

    .line 3353
    .line 3354
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 3355
    .line 3356
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 3357
    .line 3358
    iput-object v11, v2, La/je70;->l:La/zjo0;

    .line 3359
    .line 3360
    iput-object v11, v2, La/je70;->m:La/zjo0;

    .line 3361
    .line 3362
    iput-object v11, v2, La/je70;->n:La/zjo0;

    .line 3363
    .line 3364
    iput-object v11, v2, La/je70;->o:La/zjo0;

    .line 3365
    .line 3366
    iput-object v11, v2, La/je70;->p:La/zjo0;

    .line 3367
    .line 3368
    iput-object v11, v2, La/je70;->q:La/zjo0;

    .line 3369
    .line 3370
    iput-object v11, v2, La/je70;->r:La/zjo0;

    .line 3371
    .line 3372
    iput-object v11, v2, La/je70;->s:La/zjo0;

    .line 3373
    .line 3374
    iput-object v7, v2, La/je70;->t:La/zjo0;

    .line 3375
    .line 3376
    const/16 v0, 0xb

    .line 3377
    .line 3378
    iput v0, v2, La/je70;->A:I

    .line 3379
    .line 3380
    invoke-static {v4, v12, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 3381
    .line 3382
    .line 3383
    move-result-object v1

    .line 3384
    if-ne v1, v3, :cond_15

    .line 3385
    .line 3386
    goto/16 :goto_f

    .line 3387
    .line 3388
    :cond_15
    move-object v0, v7

    .line 3389
    :goto_b
    check-cast v1, La/zjo0;

    .line 3390
    .line 3391
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 3392
    .line 3393
    .line 3394
    move-result v6

    .line 3395
    if-nez v6, :cond_16

    .line 3396
    .line 3397
    new-instance v2, La/eeg0;

    .line 3398
    .line 3399
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3400
    .line 3401
    const-string v4, "statistic_dictionaries(org.xplatform.onexdatabase.entity.StatisticDictionariesEntity).\n Expected:\n"

    .line 3402
    .line 3403
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3404
    .line 3405
    .line 3406
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3407
    .line 3408
    .line 3409
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3410
    .line 3411
    .line 3412
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3413
    .line 3414
    .line 3415
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3416
    .line 3417
    .line 3418
    move-result-object v0

    .line 3419
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 3420
    .line 3421
    .line 3422
    return-object v2

    .line 3423
    :cond_16
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3424
    .line 3425
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 3426
    .line 3427
    .line 3428
    new-instance v12, La/tjo0;

    .line 3429
    .line 3430
    const/16 v17, 0x0

    .line 3431
    .line 3432
    const/4 v14, 0x1

    .line 3433
    const/4 v13, 0x1

    .line 3434
    const-string v15, "id"

    .line 3435
    .line 3436
    const-string v16, "INTEGER"

    .line 3437
    .line 3438
    const/16 v18, 0x1

    .line 3439
    .line 3440
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3441
    .line 3442
    .line 3443
    invoke-interface {v0, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3444
    .line 3445
    .line 3446
    new-instance v13, La/tjo0;

    .line 3447
    .line 3448
    const/16 v18, 0x0

    .line 3449
    .line 3450
    const/4 v15, 0x1

    .line 3451
    const/4 v14, 0x0

    .line 3452
    const-string v16, "registration_type_id"

    .line 3453
    .line 3454
    const-string v17, "INTEGER"

    .line 3455
    .line 3456
    const/16 v19, 0x1

    .line 3457
    .line 3458
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3459
    .line 3460
    .line 3461
    const-string v1, "registration_type_id"

    .line 3462
    .line 3463
    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3464
    .line 3465
    .line 3466
    new-instance v14, La/tjo0;

    .line 3467
    .line 3468
    const/16 v19, 0x0

    .line 3469
    .line 3470
    const/16 v16, 0x1

    .line 3471
    .line 3472
    const/4 v15, 0x0

    .line 3473
    const-string v17, "field_name"

    .line 3474
    .line 3475
    const-string v18, "TEXT"

    .line 3476
    .line 3477
    const/16 v20, 0x1

    .line 3478
    .line 3479
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3480
    .line 3481
    .line 3482
    const-string v1, "field_name"

    .line 3483
    .line 3484
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3485
    .line 3486
    .line 3487
    new-instance v15, La/tjo0;

    .line 3488
    .line 3489
    const/16 v20, 0x0

    .line 3490
    .line 3491
    const/16 v17, 0x1

    .line 3492
    .line 3493
    const/16 v16, 0x0

    .line 3494
    .line 3495
    const-string v18, "is_required"

    .line 3496
    .line 3497
    const-string v19, "INTEGER"

    .line 3498
    .line 3499
    const/16 v21, 0x1

    .line 3500
    .line 3501
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3502
    .line 3503
    .line 3504
    const-string v1, "is_required"

    .line 3505
    .line 3506
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3507
    .line 3508
    .line 3509
    new-instance v16, La/tjo0;

    .line 3510
    .line 3511
    const/16 v21, 0x0

    .line 3512
    .line 3513
    const/16 v18, 0x1

    .line 3514
    .line 3515
    const/16 v17, 0x0

    .line 3516
    .line 3517
    const-string v19, "is_hidden"

    .line 3518
    .line 3519
    const-string v20, "INTEGER"

    .line 3520
    .line 3521
    const/16 v22, 0x1

    .line 3522
    .line 3523
    invoke-direct/range {v16 .. v22}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3524
    .line 3525
    .line 3526
    move-object/from16 v1, v16

    .line 3527
    .line 3528
    const-string v6, "is_hidden"

    .line 3529
    .line 3530
    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3531
    .line 3532
    .line 3533
    new-instance v12, La/tjo0;

    .line 3534
    .line 3535
    const/16 v17, 0x0

    .line 3536
    .line 3537
    const/4 v14, 0x1

    .line 3538
    const/4 v13, 0x0

    .line 3539
    const-string v15, "min_age"

    .line 3540
    .line 3541
    const-string v16, "TEXT"

    .line 3542
    .line 3543
    const/16 v18, 0x0

    .line 3544
    .line 3545
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3546
    .line 3547
    .line 3548
    const-string v1, "min_age"

    .line 3549
    .line 3550
    invoke-interface {v0, v1, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3551
    .line 3552
    .line 3553
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 3554
    .line 3555
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3556
    .line 3557
    .line 3558
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 3559
    .line 3560
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3561
    .line 3562
    .line 3563
    new-instance v7, La/zjo0;

    .line 3564
    .line 3565
    const-string v12, "registration"

    .line 3566
    .line 3567
    invoke-direct {v7, v12, v0, v1, v6}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 3568
    .line 3569
    .line 3570
    iput-object v4, v2, La/je70;->i:La/qpg0;

    .line 3571
    .line 3572
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 3573
    .line 3574
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 3575
    .line 3576
    iput-object v11, v2, La/je70;->l:La/zjo0;

    .line 3577
    .line 3578
    iput-object v11, v2, La/je70;->m:La/zjo0;

    .line 3579
    .line 3580
    iput-object v11, v2, La/je70;->n:La/zjo0;

    .line 3581
    .line 3582
    iput-object v11, v2, La/je70;->o:La/zjo0;

    .line 3583
    .line 3584
    iput-object v11, v2, La/je70;->p:La/zjo0;

    .line 3585
    .line 3586
    iput-object v11, v2, La/je70;->q:La/zjo0;

    .line 3587
    .line 3588
    iput-object v11, v2, La/je70;->r:La/zjo0;

    .line 3589
    .line 3590
    iput-object v11, v2, La/je70;->s:La/zjo0;

    .line 3591
    .line 3592
    iput-object v11, v2, La/je70;->t:La/zjo0;

    .line 3593
    .line 3594
    iput-object v7, v2, La/je70;->u:La/zjo0;

    .line 3595
    .line 3596
    const/16 v0, 0xc

    .line 3597
    .line 3598
    iput v0, v2, La/je70;->A:I

    .line 3599
    .line 3600
    invoke-static {v4, v12, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 3601
    .line 3602
    .line 3603
    move-result-object v1

    .line 3604
    if-ne v1, v3, :cond_17

    .line 3605
    .line 3606
    goto/16 :goto_f

    .line 3607
    .line 3608
    :cond_17
    move-object v0, v7

    .line 3609
    :goto_c
    check-cast v1, La/zjo0;

    .line 3610
    .line 3611
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 3612
    .line 3613
    .line 3614
    move-result v6

    .line 3615
    if-nez v6, :cond_18

    .line 3616
    .line 3617
    new-instance v2, La/eeg0;

    .line 3618
    .line 3619
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3620
    .line 3621
    const-string v4, "registration(org.xplatform.onexdatabase.entity.RegistrationEntity).\n Expected:\n"

    .line 3622
    .line 3623
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3624
    .line 3625
    .line 3626
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3627
    .line 3628
    .line 3629
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3630
    .line 3631
    .line 3632
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3633
    .line 3634
    .line 3635
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3636
    .line 3637
    .line 3638
    move-result-object v0

    .line 3639
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 3640
    .line 3641
    .line 3642
    return-object v2

    .line 3643
    :cond_18
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3644
    .line 3645
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 3646
    .line 3647
    .line 3648
    new-instance v12, La/tjo0;

    .line 3649
    .line 3650
    const/16 v17, 0x0

    .line 3651
    .line 3652
    const/4 v14, 0x1

    .line 3653
    const/4 v13, 0x1

    .line 3654
    const-string v15, "balanceId"

    .line 3655
    .line 3656
    const-string v16, "INTEGER"

    .line 3657
    .line 3658
    const/16 v18, 0x1

    .line 3659
    .line 3660
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3661
    .line 3662
    .line 3663
    const-string v1, "balanceId"

    .line 3664
    .line 3665
    invoke-interface {v0, v1, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3666
    .line 3667
    .line 3668
    new-instance v13, La/tjo0;

    .line 3669
    .line 3670
    const/16 v18, 0x0

    .line 3671
    .line 3672
    const/4 v15, 0x1

    .line 3673
    const/4 v14, 0x0

    .line 3674
    const-string v16, "firstValue"

    .line 3675
    .line 3676
    const-string v17, "REAL"

    .line 3677
    .line 3678
    const/16 v19, 0x1

    .line 3679
    .line 3680
    invoke-direct/range {v13 .. v19}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3681
    .line 3682
    .line 3683
    const-string v1, "firstValue"

    .line 3684
    .line 3685
    invoke-interface {v0, v1, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3686
    .line 3687
    .line 3688
    new-instance v14, La/tjo0;

    .line 3689
    .line 3690
    const/16 v19, 0x0

    .line 3691
    .line 3692
    const/16 v16, 0x1

    .line 3693
    .line 3694
    const/4 v15, 0x0

    .line 3695
    const-string v17, "secondValue"

    .line 3696
    .line 3697
    const-string v18, "REAL"

    .line 3698
    .line 3699
    const/16 v20, 0x1

    .line 3700
    .line 3701
    invoke-direct/range {v14 .. v20}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3702
    .line 3703
    .line 3704
    const-string v1, "secondValue"

    .line 3705
    .line 3706
    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3707
    .line 3708
    .line 3709
    new-instance v15, La/tjo0;

    .line 3710
    .line 3711
    const/16 v20, 0x0

    .line 3712
    .line 3713
    const/16 v17, 0x1

    .line 3714
    .line 3715
    const/16 v16, 0x0

    .line 3716
    .line 3717
    const-string v18, "thirdValue"

    .line 3718
    .line 3719
    const-string v19, "REAL"

    .line 3720
    .line 3721
    const/16 v21, 0x1

    .line 3722
    .line 3723
    invoke-direct/range {v15 .. v21}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3724
    .line 3725
    .line 3726
    const-string v1, "thirdValue"

    .line 3727
    .line 3728
    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3729
    .line 3730
    .line 3731
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 3732
    .line 3733
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3734
    .line 3735
    .line 3736
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 3737
    .line 3738
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3739
    .line 3740
    .line 3741
    new-instance v7, La/zjo0;

    .line 3742
    .line 3743
    const-string v12, "quick_bet_settings_table"

    .line 3744
    .line 3745
    invoke-direct {v7, v12, v0, v1, v6}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 3746
    .line 3747
    .line 3748
    iput-object v4, v2, La/je70;->i:La/qpg0;

    .line 3749
    .line 3750
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 3751
    .line 3752
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 3753
    .line 3754
    iput-object v11, v2, La/je70;->l:La/zjo0;

    .line 3755
    .line 3756
    iput-object v11, v2, La/je70;->m:La/zjo0;

    .line 3757
    .line 3758
    iput-object v11, v2, La/je70;->n:La/zjo0;

    .line 3759
    .line 3760
    iput-object v11, v2, La/je70;->o:La/zjo0;

    .line 3761
    .line 3762
    iput-object v11, v2, La/je70;->p:La/zjo0;

    .line 3763
    .line 3764
    iput-object v11, v2, La/je70;->q:La/zjo0;

    .line 3765
    .line 3766
    iput-object v11, v2, La/je70;->r:La/zjo0;

    .line 3767
    .line 3768
    iput-object v11, v2, La/je70;->s:La/zjo0;

    .line 3769
    .line 3770
    iput-object v11, v2, La/je70;->t:La/zjo0;

    .line 3771
    .line 3772
    iput-object v11, v2, La/je70;->u:La/zjo0;

    .line 3773
    .line 3774
    iput-object v7, v2, La/je70;->v:La/zjo0;

    .line 3775
    .line 3776
    const/16 v0, 0xd

    .line 3777
    .line 3778
    iput v0, v2, La/je70;->A:I

    .line 3779
    .line 3780
    invoke-static {v4, v12, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 3781
    .line 3782
    .line 3783
    move-result-object v1

    .line 3784
    if-ne v1, v3, :cond_19

    .line 3785
    .line 3786
    goto/16 :goto_f

    .line 3787
    .line 3788
    :cond_19
    move-object v0, v7

    .line 3789
    :goto_d
    check-cast v1, La/zjo0;

    .line 3790
    .line 3791
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 3792
    .line 3793
    .line 3794
    move-result v6

    .line 3795
    if-nez v6, :cond_1a

    .line 3796
    .line 3797
    new-instance v2, La/eeg0;

    .line 3798
    .line 3799
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3800
    .line 3801
    const-string v4, "quick_bet_settings_table(org.xplatform.onexdatabase.entity.QuickBetSettingsModelEntity).\n Expected:\n"

    .line 3802
    .line 3803
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3804
    .line 3805
    .line 3806
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3807
    .line 3808
    .line 3809
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3810
    .line 3811
    .line 3812
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3813
    .line 3814
    .line 3815
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3816
    .line 3817
    .line 3818
    move-result-object v0

    .line 3819
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 3820
    .line 3821
    .line 3822
    return-object v2

    .line 3823
    :cond_1a
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3824
    .line 3825
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 3826
    .line 3827
    .line 3828
    new-instance v12, La/tjo0;

    .line 3829
    .line 3830
    const/16 v17, 0x0

    .line 3831
    .line 3832
    const/4 v14, 0x1

    .line 3833
    const/4 v13, 0x1

    .line 3834
    const-string v15, "id"

    .line 3835
    .line 3836
    const-string v16, "INTEGER"

    .line 3837
    .line 3838
    const/16 v18, 0x1

    .line 3839
    .line 3840
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3841
    .line 3842
    .line 3843
    invoke-interface {v0, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3844
    .line 3845
    .line 3846
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 3847
    .line 3848
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3849
    .line 3850
    .line 3851
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 3852
    .line 3853
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3854
    .line 3855
    .line 3856
    new-instance v7, La/zjo0;

    .line 3857
    .line 3858
    const-string v12, "news_catalog_banners"

    .line 3859
    .line 3860
    invoke-direct {v7, v12, v0, v1, v6}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 3861
    .line 3862
    .line 3863
    iput-object v4, v2, La/je70;->i:La/qpg0;

    .line 3864
    .line 3865
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 3866
    .line 3867
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 3868
    .line 3869
    iput-object v11, v2, La/je70;->l:La/zjo0;

    .line 3870
    .line 3871
    iput-object v11, v2, La/je70;->m:La/zjo0;

    .line 3872
    .line 3873
    iput-object v11, v2, La/je70;->n:La/zjo0;

    .line 3874
    .line 3875
    iput-object v11, v2, La/je70;->o:La/zjo0;

    .line 3876
    .line 3877
    iput-object v11, v2, La/je70;->p:La/zjo0;

    .line 3878
    .line 3879
    iput-object v11, v2, La/je70;->q:La/zjo0;

    .line 3880
    .line 3881
    iput-object v11, v2, La/je70;->r:La/zjo0;

    .line 3882
    .line 3883
    iput-object v11, v2, La/je70;->s:La/zjo0;

    .line 3884
    .line 3885
    iput-object v11, v2, La/je70;->t:La/zjo0;

    .line 3886
    .line 3887
    iput-object v11, v2, La/je70;->u:La/zjo0;

    .line 3888
    .line 3889
    iput-object v11, v2, La/je70;->v:La/zjo0;

    .line 3890
    .line 3891
    iput-object v7, v2, La/je70;->w:La/zjo0;

    .line 3892
    .line 3893
    const/16 v0, 0xe

    .line 3894
    .line 3895
    iput v0, v2, La/je70;->A:I

    .line 3896
    .line 3897
    invoke-static {v4, v12, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 3898
    .line 3899
    .line 3900
    move-result-object v1

    .line 3901
    if-ne v1, v3, :cond_1b

    .line 3902
    .line 3903
    goto :goto_f

    .line 3904
    :cond_1b
    move-object v0, v7

    .line 3905
    :goto_e
    check-cast v1, La/zjo0;

    .line 3906
    .line 3907
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 3908
    .line 3909
    .line 3910
    move-result v6

    .line 3911
    if-nez v6, :cond_1c

    .line 3912
    .line 3913
    new-instance v2, La/eeg0;

    .line 3914
    .line 3915
    new-instance v3, Ljava/lang/StringBuilder;

    .line 3916
    .line 3917
    const-string v4, "news_catalog_banners(org.xplatform.onexdatabase.entity.NewsCatalogBanners).\n Expected:\n"

    .line 3918
    .line 3919
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3920
    .line 3921
    .line 3922
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3923
    .line 3924
    .line 3925
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3926
    .line 3927
    .line 3928
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3929
    .line 3930
    .line 3931
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3932
    .line 3933
    .line 3934
    move-result-object v0

    .line 3935
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 3936
    .line 3937
    .line 3938
    return-object v2

    .line 3939
    :cond_1c
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3940
    .line 3941
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 3942
    .line 3943
    .line 3944
    new-instance v12, La/tjo0;

    .line 3945
    .line 3946
    const/16 v17, 0x0

    .line 3947
    .line 3948
    const/4 v14, 0x1

    .line 3949
    const/4 v13, 0x1

    .line 3950
    const-string v15, "id"

    .line 3951
    .line 3952
    const-string v16, "INTEGER"

    .line 3953
    .line 3954
    const/16 v18, 0x1

    .line 3955
    .line 3956
    invoke-direct/range {v12 .. v18}, La/tjo0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3957
    .line 3958
    .line 3959
    invoke-interface {v0, v8, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3960
    .line 3961
    .line 3962
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 3963
    .line 3964
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3965
    .line 3966
    .line 3967
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 3968
    .line 3969
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 3970
    .line 3971
    .line 3972
    new-instance v7, La/zjo0;

    .line 3973
    .line 3974
    const-string v8, "news_catalog_cms_banners"

    .line 3975
    .line 3976
    invoke-direct {v7, v8, v0, v1, v6}, La/zjo0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 3977
    .line 3978
    .line 3979
    iput-object v11, v2, La/je70;->i:La/qpg0;

    .line 3980
    .line 3981
    iput-object v11, v2, La/je70;->j:La/zjo0;

    .line 3982
    .line 3983
    iput-object v11, v2, La/je70;->k:La/zjo0;

    .line 3984
    .line 3985
    iput-object v11, v2, La/je70;->l:La/zjo0;

    .line 3986
    .line 3987
    iput-object v11, v2, La/je70;->m:La/zjo0;

    .line 3988
    .line 3989
    iput-object v11, v2, La/je70;->n:La/zjo0;

    .line 3990
    .line 3991
    iput-object v11, v2, La/je70;->o:La/zjo0;

    .line 3992
    .line 3993
    iput-object v11, v2, La/je70;->p:La/zjo0;

    .line 3994
    .line 3995
    iput-object v11, v2, La/je70;->q:La/zjo0;

    .line 3996
    .line 3997
    iput-object v11, v2, La/je70;->r:La/zjo0;

    .line 3998
    .line 3999
    iput-object v11, v2, La/je70;->s:La/zjo0;

    .line 4000
    .line 4001
    iput-object v11, v2, La/je70;->t:La/zjo0;

    .line 4002
    .line 4003
    iput-object v11, v2, La/je70;->u:La/zjo0;

    .line 4004
    .line 4005
    iput-object v11, v2, La/je70;->v:La/zjo0;

    .line 4006
    .line 4007
    iput-object v11, v2, La/je70;->w:La/zjo0;

    .line 4008
    .line 4009
    iput-object v7, v2, La/je70;->x:La/zjo0;

    .line 4010
    .line 4011
    const/16 v0, 0xf

    .line 4012
    .line 4013
    iput v0, v2, La/je70;->A:I

    .line 4014
    .line 4015
    invoke-static {v4, v8, v2}, La/c9x;->G(La/qpg0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 4016
    .line 4017
    .line 4018
    move-result-object v1

    .line 4019
    if-ne v1, v3, :cond_1d

    .line 4020
    .line 4021
    :goto_f
    return-object v3

    .line 4022
    :cond_1d
    move-object v0, v7

    .line 4023
    :goto_10
    check-cast v1, La/zjo0;

    .line 4024
    .line 4025
    invoke-virtual {v0, v1}, La/zjo0;->equals(Ljava/lang/Object;)Z

    .line 4026
    .line 4027
    .line 4028
    move-result v2

    .line 4029
    if-nez v2, :cond_1e

    .line 4030
    .line 4031
    new-instance v2, La/eeg0;

    .line 4032
    .line 4033
    new-instance v3, Ljava/lang/StringBuilder;

    .line 4034
    .line 4035
    const-string v4, "news_catalog_cms_banners(org.xplatform.onexdatabase.entity.NewsCatalogCmsBanners).\n Expected:\n"

    .line 4036
    .line 4037
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4038
    .line 4039
    .line 4040
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 4041
    .line 4042
    .line 4043
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4044
    .line 4045
    .line 4046
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 4047
    .line 4048
    .line 4049
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4050
    .line 4051
    .line 4052
    move-result-object v0

    .line 4053
    invoke-direct {v2, v0, v10}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 4054
    .line 4055
    .line 4056
    return-object v2

    .line 4057
    :cond_1e
    new-instance v0, La/eeg0;

    .line 4058
    .line 4059
    invoke-direct {v0, v11, v5}, La/eeg0;-><init>(Ljava/lang/String;Z)V

    .line 4060
    .line 4061
    .line 4062
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
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
