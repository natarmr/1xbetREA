.class public final La/kg40;
.super La/dg40;
.source "SourceFile"


# instance fields
.field public final synthetic c:B


# direct methods
.method public synthetic constructor <init>(IIB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kg40;->c:B

    invoke-direct {p0, p1, p2}, La/dg40;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(La/qpg0;)Lkotlin/Unit;
    .locals 1

    .line 1
    iget-byte p0, p0, La/kg40;->c:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "ALTER TABLE sports ADD COLUMN esports_event_focus_discipline_header TEXT NOT NULL DEFAULT \'\' "

    .line 7
    .line 8
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p0, "ALTER TABLE sports ADD COLUMN esports_header_focus_discipline_header TEXT NOT NULL DEFAULT \'\' "

    .line 12
    .line 13
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    const-string p0, "ALTER TABLE sports ADD COLUMN discipline_icon_3d TEXT NOT NULL DEFAULT \'\' "

    .line 20
    .line 21
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_1
    const-string p0, "ALTER TABLE event_groups ADD COLUMN has_auto_sub INTEGER NOT NULL DEFAULT 0 "

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
    const-string p0, "ALTER TABLE sports ADD COLUMN feed_image_vertical TEXT NOT NULL DEFAULT \'\' "

    .line 36
    .line 37
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string p0, "ALTER TABLE sports ADD COLUMN feed_image_horizontal TEXT NOT NULL DEFAULT \'\' "

    .line 41
    .line 42
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string p0, "ALTER TABLE sports ADD COLUMN feed_image_square TEXT NOT NULL DEFAULT \'\' "

    .line 46
    .line 47
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_3
    const-string p0, "DROP TABLE IF EXISTS favorite_games"

    .line 54
    .line 55
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_4
    const-string p0, "CREATE TABLE IF NOT EXISTS `news_catalog_banners` (\n    `id` INTEGER PRIMARY KEY NOT NULL\n)"

    .line 62
    .line 63
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string p0, "CREATE TABLE IF NOT EXISTS `news_catalog_cms_banners` (\n    `id` INTEGER PRIMARY KEY NOT NULL\n)"

    .line 67
    .line 68
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_5
    const-string p0, "ALTER TABLE bet_events ADD COLUMN game_type TEXT NOT NULL DEFAULT \'\' "

    .line 75
    .line 76
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string p0, "ALTER TABLE bet_events ADD COLUMN game_vid TEXT NOT NULL DEFAULT \'\' "

    .line 80
    .line 81
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_6
    const-string p0, "ALTER TABLE bet_events ADD COLUMN teams_number INT NOT NULL DEFAULT 0 "

    .line 88
    .line 89
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_7
    const-string p0, "DROP TABLE `currencies`"

    .line 96
    .line 97
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const-string p0, "CREATE TABLE IF NOT EXISTS `currencies` (\n    `id` INTEGER PRIMARY KEY NOT NULL, \n    `code` TEXT NOT NULL,\n    `name` TEXT NOT NULL,\n    `top` INTEGER NOT NULL,\n    `ruble_to_currency_rate` REAL NOT NULL,\n    `symbol` TEXT NOT NULL,\n    `min_out_deposit` REAL NOT NULL,\n    `min_out_deposit_electron` REAL NOT NULL,\n    `min_sum_bets` REAL NOT NULL,\n    `round` INTEGER NOT NULL,\n    `registration_hidden` INTEGER NOT NULL,\n    `crypto` INTEGER NOT NULL\n)"

    .line 101
    .line 102
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_8
    const-string p0, "ALTER TABLE bet_events ADD COLUMN first_opponent_name TEXT NOT NULL DEFAULT \'\' "

    .line 109
    .line 110
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string p0, "ALTER TABLE bet_events ADD COLUMN second_opponent_name TEXT NOT NULL DEFAULT \'\' "

    .line 114
    .line 115
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const-string p0, "ALTER TABLE bet_events ADD COLUMN tournament_stage TEXT NOT NULL DEFAULT \'\' "

    .line 119
    .line 120
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_9
    const-string p0, "ALTER TABLE bet_events ADD COLUMN first_opponent_first_img TEXT NOT NULL DEFAULT \'\' "

    .line 127
    .line 128
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const-string p0, "ALTER TABLE bet_events ADD COLUMN first_opponent_second_img TEXT NOT NULL DEFAULT \'\' "

    .line 132
    .line 133
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const-string p0, "ALTER TABLE bet_events ADD COLUMN second_opponent_first_img TEXT NOT NULL DEFAULT \'\' "

    .line 137
    .line 138
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const-string p0, "ALTER TABLE bet_events ADD COLUMN second_opponent_second_img TEXT NOT NULL DEFAULT \'\' "

    .line 142
    .line 143
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_a
    const-string p0, "ALTER TABLE bet_events ADD COLUMN champ_name TEXT NOT NULL DEFAULT \'\' "

    .line 150
    .line 151
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    return-object p0

    .line 157
    :pswitch_b
    const-string p0, "CREATE TABLE `country_backup` (\n`id` INTEGER  PRIMARY KEY NOT NULL,\n`country_name` TEXT  NOT NULL,\n`country_phone_code` INTEGER  NOT NULL,\n`country_code` TEXT  NOT NULL,\n`country_currency_id` INTEGER  NOT NULL,\n`country_image` TEXT NOT NULL,\n`phone_mask_max_length` INT NOT NULL DEFAULT 0,\n`phone_mask_min_length` INT NOT NULL DEFAULT 0,\n`phone_mask` TEXT NOT NULL DEFAULT \'\'\n)"

    .line 158
    .line 159
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    const-string p0, "INSERT INTO country_backup \nSELECT id, \ncountry_name,\ncountry_phone_code, \ncountry_code,\ncountry_currency_id, \ncountry_image, \nphone_mask_max_length, \nphone_mask_min_length, \nphone_mask\nFROM country  "

    .line 163
    .line 164
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    const-string p0, "DROP TABLE country"

    .line 168
    .line 169
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const-string p0, "ALTER TABLE country_backup RENAME TO country "

    .line 173
    .line 174
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_c
    const-string p0, "CREATE TABLE IF NOT EXISTS `quick_bet_settings_table` (\n`balanceId` INTEGER PRIMARY KEY NOT NULL, \n`firstValue` REAL NOT NULL, \n`secondValue` REAL NOT NULL, \n`thirdValue` REAL NOT NULL\n)"

    .line 181
    .line 182
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object p0

    .line 188
    :pswitch_d
    const-string p0, "DROP TABLE IF EXISTS bet_events_temp"

    .line 189
    .line 190
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const-string v0, "ALTER TABLE bet_events RENAME TO bet_events_temp"

    .line 194
    .line 195
    invoke-static {p1, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    const-string v0, "CREATE TABLE IF NOT EXISTS `bet_events` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `game_id` INTEGER NOT NULL, \n    `main_game_id` INTEGER NOT NULL DEFAULT 0 ,\n    `player_id` INTEGER NOT NULL, \n    `sport_id` INTEGER NOT NULL, \n    `player_name` TEXT NOT NULL, \n    `game_match_name` TEXT NOT NULL, \n    `group_name` TEXT NOT NULL, \n    `express_number` INTEGER NOT NULL,\n    `coefficient` TEXT NOT NULL,\n    `param` REAL NOT NULL,\n    `time_start` INTEGER  NOT NULL DEFAULT 0,\n    `vid` TEXT  NOT NULL DEFAULT \'\',\n    `full_name` TEXT  NOT NULL DEFAULT \'\',\n    `name` TEXT NOT NULL, \n    `kind` INTEGER NOT NULL, \n    `type` INTEGER NOT NULL,\n    `players_duel_game` TEXT NOT NULL DEFAULT \'\',\n    `coupon_entry_feature_id` INTEGER DEFAULT 0 NOT NULL\n)"

    .line 199
    .line 200
    invoke-static {p1, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    const-string v0, "INSERT INTO bet_events\nSELECT id, \n       game_id,\n       main_game_id,\n       player_id,\n       sport_id,\n       player_name,\n       game_match_name,\n       group_name,\n       express_number,\n       coefficient,\n       param,\n       time_start,\n       vid,\n       full_name,\n       name,\n       kind,\n       type,\n       players_duel_game,\n       coupon_entry_feature_id\nFROM bet_events_temp"

    .line 204
    .line 205
    invoke-static {p1, v0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_e
    const-string p0, "CREATE TABLE IF NOT EXISTS `registration` (\n`id` INTEGER PRIMARY KEY NOT NULL, \n`registration_type_id` INTEGER NOT NULL, \n`field_name` TEXT NOT NULL, \n`is_required` INTEGER NOT NULL, \n`is_hidden` INTEGER NOT NULL, \n`min_age` TEXT\n)"

    .line 215
    .line 216
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_f
    const-string p0, "DROP TABLE `country`"

    .line 223
    .line 224
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    const-string p0, "CREATE TABLE IF NOT EXISTS `country` (\n`id` INTEGER PRIMARY KEY NOT NULL,\n `country_name` TEXT NOT NULL,\n `country_phone_code` INTEGER NOT NULL,\n `country_code` TEXT NOT NULL,\n `country_currency_id` INTEGER NOT NULL,\n `country_image` TEXT NOT NULL,\n `phone_mask_max_length` INT NOT NULL,\n `phone_mask_min_length` INT NOT NULL,\n `phone_mask` TEXT NOT NULL\n)"

    .line 228
    .line 229
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_10
    const-string p0, "ALTER TABLE bet_events ADD COLUMN coupon_entry_feature_id INTEGER DEFAULT 0 NOT NULL"

    .line 236
    .line 237
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    return-object p0

    .line 243
    :pswitch_11
    const-string p0, "ALTER TABLE bet_events ADD COLUMN players_duel_game TEXT NOT NULL DEFAULT \'\' "

    .line 244
    .line 245
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_12
    const-string p0, "DROP TABLE `bet_events`"

    .line 252
    .line 253
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    const-string p0, "CREATE TABLE IF NOT EXISTS `bet_events` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `game_id` INTEGER NOT NULL, \n    `player_id` INTEGER NOT NULL, \n    `sport_id` INTEGER NOT NULL, \n    `player_name` TEXT NOT NULL, \n    `game_match_name` TEXT NOT NULL, \n    `group_name` TEXT NOT NULL, \n    `express_number` INTEGER NOT NULL,\n    `coefficient` TEXT NOT NULL,\n    `param` TEXT NOT NULL,\n    `time` TEXT NOT NULL, \n    `name` TEXT NOT NULL, \n    `kind` INTEGER NOT NULL, \n    `type` INTEGER NOT NULL\n)"

    .line 257
    .line 258
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object p0

    .line 264
    :pswitch_13
    const-string p0, "ALTER TABLE sports ADD COLUMN image_champ_small TEXT NOT NULL DEFAULT \'\' "

    .line 265
    .line 266
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object p0

    .line 272
    :pswitch_14
    const-string p0, "delete from sports"

    .line 273
    .line 274
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object p0

    .line 280
    :pswitch_15
    const-string p0, "ALTER TABLE sports ADD COLUMN cyber INTEGER NOT NULL DEFAULT 0 "

    .line 281
    .line 282
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const-string p0, "ALTER TABLE sports ADD COLUMN background TEXT NOT NULL DEFAULT \'\' "

    .line 286
    .line 287
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    const-string p0, "ALTER TABLE sports ADD COLUMN background_tablet TEXT NOT NULL DEFAULT \'\' "

    .line 291
    .line 292
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    const-string p0, "ALTER TABLE sports ADD COLUMN background_champ_default TEXT NOT NULL DEFAULT \'\' "

    .line 296
    .line 297
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    const-string p0, "ALTER TABLE sports ADD COLUMN background_champ_tablet_default TEXT NOT NULL DEFAULT \'\' "

    .line 301
    .line 302
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    const-string p0, "ALTER TABLE sports ADD COLUMN background_champ_header_default TEXT NOT NULL DEFAULT \'\' "

    .line 306
    .line 307
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    const-string p0, "ALTER TABLE sports ADD COLUMN background_champ_header_tablet_default TEXT NOT NULL DEFAULT \'\' "

    .line 311
    .line 312
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    const-string p0, "ALTER TABLE sports ADD COLUMN sub_sports TEXT NOT NULL DEFAULT \'\' "

    .line 316
    .line 317
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    const-string p0, "ALTER TABLE sports ADD COLUMN image_small TEXT NOT NULL DEFAULT \'\' "

    .line 321
    .line 322
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    const-string p0, "ALTER TABLE sports ADD COLUMN image_popular TEXT NOT NULL DEFAULT \'\' "

    .line 326
    .line 327
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    const-string p0, "ALTER TABLE sports ADD COLUMN game_background TEXT NOT NULL DEFAULT \'\' "

    .line 331
    .line 332
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object p0

    .line 338
    :pswitch_16
    const-string p0, "ALTER TABLE bet_events ADD COLUMN main_game_id INTEGER NOT NULL DEFAULT 0 "

    .line 339
    .line 340
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    return-object p0

    .line 346
    :pswitch_17
    const-string p0, "CREATE TABLE `statistic_dictionaries` (\n`id` INTEGER PRIMARY KEY NOT NULL, \n`type` INTEGER NOT NULL, \n`itemId` INTEGER NOT NULL, \n`title` TEXT NOT NULL\n)"

    .line 347
    .line 348
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 352
    .line 353
    return-object p0

    .line 354
    :pswitch_18
    const-string p0, "CREATE TABLE `market_filter_backup` (\n`id` INTEGER  PRIMARY KEY AUTOINCREMENT NOT NULL,\n`hidden` INTEGER  NOT NULL,\n`pinned_position` INTEGER  NOT NULL\n)"

    .line 355
    .line 356
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    const-string p0, "INSERT INTO market_filter_backup \nSELECT id, \n       hidden,\n       pinned_position\nFROM market_filter  "

    .line 360
    .line 361
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    const-string p0, "DROP TABLE market_filter"

    .line 365
    .line 366
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    const-string p0, "ALTER TABLE market_filter_backup RENAME TO market_filter "

    .line 370
    .line 371
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object p0

    .line 377
    :pswitch_19
    const-string p0, "CREATE TABLE IF NOT EXISTS `market_filter` (\n`id` INTEGER PRIMARY KEY NOT NULL, \n`name` TEXT NOT NULL, \n`hidden` INTEGER NOT NULL, \n`pinned_position` INTEGER NOT NULL\n)"

    .line 378
    .line 379
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 383
    .line 384
    return-object p0

    .line 385
    :pswitch_1a
    const-string p0, "ALTER TABLE currencies ADD COLUMN initialBet REAL NOT NULL DEFAULT 0 "

    .line 386
    .line 387
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    const-string p0, "ALTER TABLE currencies ADD COLUMN betStep REAL NOT NULL DEFAULT 0 "

    .line 391
    .line 392
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    return-object p0

    .line 398
    :pswitch_1b
    const-string p0, "CREATE TABLE `bet_events_backup` (\n`id` INTEGER  PRIMARY KEY AUTOINCREMENT NOT NULL,\n`game_id` INTEGER  NOT NULL,\n`player_id` INTEGER  NOT NULL,\n`sport_id` INTEGER  NOT NULL,\n`player_name` TEXT  NOT NULL,\n`game_match_name` TEXT  NOT NULL,\n`group_name` TEXT  NOT NULL,\n`express_number` INTEGER  NOT NULL,\n`coefficient` TEXT  NOT NULL,\n`param` TEXT  NOT NULL,\n`time_start` INTEGER  NOT NULL DEFAULT 0,\n`vid` TEXT  NOT NULL DEFAULT \'\',\n`full_name` TEXT  NOT NULL DEFAULT \'\',\n`name` TEXT  NOT NULL,\n`kind` INTEGER  NOT NULL,\n`type` INTEGER  NOT NULL\n)"

    .line 399
    .line 400
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    const-string p0, "INSERT INTO bet_events_backup \nSELECT id, \n       game_id,\n       player_id, \n       sport_id,\n       player_name, \n       game_match_name, \n       group_name, \n       express_number, \n       coefficient, \n       param, \n       time_start, \n       vid, \n       full_name, \n       name, \n       kind, \n       type \nFROM bet_events  "

    .line 404
    .line 405
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    const-string p0, "DROP TABLE bet_events"

    .line 409
    .line 410
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    const-string p0, "ALTER TABLE bet_events_backup RENAME TO bet_events "

    .line 414
    .line 415
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 419
    .line 420
    return-object p0

    .line 421
    :pswitch_1c
    const-string p0, "ALTER TABLE bet_events ADD COLUMN time_start INTEGER NOT NULL DEFAULT 0 "

    .line 422
    .line 423
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    const-string p0, "ALTER TABLE bet_events ADD COLUMN vid TEXT NOT NULL DEFAULT \'\' "

    .line 427
    .line 428
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    const-string p0, "ALTER TABLE bet_events ADD COLUMN full_name TEXT NOT NULL DEFAULT \'\' "

    .line 432
    .line 433
    invoke-static {p1, p0}, La/n2x;->x(La/qpg0;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 437
    .line 438
    return-object p0

    .line 439
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
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
