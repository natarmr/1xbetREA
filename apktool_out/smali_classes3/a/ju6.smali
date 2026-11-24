.class public final La/ju6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:J

.field public final synthetic l:La/ou6;


# direct methods
.method public synthetic constructor <init>(JLa/ou6;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/ju6;->i:B

    iput-wide p1, p0, La/ju6;->k:J

    iput-object p3, p0, La/ju6;->l:La/ou6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ju6;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/ju6;

    .line 7
    .line 8
    iget-object v4, p0, La/ju6;->l:La/ou6;

    .line 9
    .line 10
    const/4 v6, 0x2

    .line 11
    iget-wide v2, p0, La/ju6;->k:J

    .line 12
    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v6}, La/ju6;-><init>(JLa/ou6;La/yje;B)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v1, La/ju6;->j:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    move-object v6, p2

    .line 21
    new-instance v2, La/ju6;

    .line 22
    .line 23
    iget-object v5, p0, La/ju6;->l:La/ou6;

    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    iget-wide v3, p0, La/ju6;->k:J

    .line 27
    .line 28
    invoke-direct/range {v2 .. v7}, La/ju6;-><init>(JLa/ou6;La/yje;B)V

    .line 29
    .line 30
    .line 31
    iput-object p1, v2, La/ju6;->j:Ljava/lang/Object;

    .line 32
    .line 33
    return-object v2

    .line 34
    :pswitch_1
    move-object v6, p2

    .line 35
    new-instance v2, La/ju6;

    .line 36
    .line 37
    iget-object v5, p0, La/ju6;->l:La/ou6;

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    iget-wide v3, p0, La/ju6;->k:J

    .line 41
    .line 42
    invoke-direct/range {v2 .. v7}, La/ju6;-><init>(JLa/ou6;La/yje;B)V

    .line 43
    .line 44
    .line 45
    iput-object p1, v2, La/ju6;->j:Ljava/lang/Object;

    .line 46
    .line 47
    return-object v2

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ju6;->i:B

    .line 2
    .line 3
    check-cast p1, La/qpg0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ju6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ju6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ju6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ju6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ju6;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ju6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/ju6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/ju6;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/ju6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 94

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ju6;->i:B

    .line 4
    .line 5
    const-string v2, "name"

    .line 6
    .line 7
    const-string v3, "full_name"

    .line 8
    .line 9
    const-string v4, "vid"

    .line 10
    .line 11
    const-string v5, "time_start"

    .line 12
    .line 13
    const-string v6, "param"

    .line 14
    .line 15
    const-string v7, "coefficient"

    .line 16
    .line 17
    const-string v8, "express_number"

    .line 18
    .line 19
    const-string v9, "champ_name"

    .line 20
    .line 21
    const-string v10, "group_name"

    .line 22
    .line 23
    const-string v11, "second_opponent_second_img"

    .line 24
    .line 25
    const-string v12, "second_opponent_first_img"

    .line 26
    .line 27
    const-string v13, "first_opponent_second_img"

    .line 28
    .line 29
    const-string v14, "first_opponent_first_img"

    .line 30
    .line 31
    const-string v15, "game_match_name"

    .line 32
    .line 33
    move/from16 v16, v1

    .line 34
    .line 35
    const-string v1, "player_name"

    .line 36
    .line 37
    move-object/from16 v17, v2

    .line 38
    .line 39
    const-string v2, "sport_id"

    .line 40
    .line 41
    move-object/from16 v18, v3

    .line 42
    .line 43
    const-string v3, "player_id"

    .line 44
    .line 45
    move-object/from16 v19, v4

    .line 46
    .line 47
    const-string v4, "main_game_id"

    .line 48
    .line 49
    move-object/from16 v20, v5

    .line 50
    .line 51
    const-string v5, "game_id"

    .line 52
    .line 53
    move-object/from16 v21, v6

    .line 54
    .line 55
    const-string v6, "id"

    .line 56
    .line 57
    move-object/from16 v22, v7

    .line 58
    .line 59
    move-object/from16 v23, v8

    .line 60
    .line 61
    iget-wide v7, v0, La/ju6;->k:J

    .line 62
    .line 63
    move-object/from16 v24, v9

    .line 64
    .line 65
    iget-object v9, v0, La/ju6;->j:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v9, La/qpg0;

    .line 68
    .line 69
    packed-switch v16, :pswitch_data_0

    .line 70
    .line 71
    .line 72
    sget-object v25, La/wne;->a:La/wne;

    .line 73
    .line 74
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    const-string v0, "select * from bet_events where id != ? order by id"

    .line 78
    .line 79
    invoke-interface {v9, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    const/4 v0, 0x1

    .line 84
    :try_start_0
    invoke-interface {v9, v0, v7, v8}, La/xpg0;->o(IJ)V

    .line 85
    .line 86
    .line 87
    invoke-static {v9, v6}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-static {v9, v5}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    invoke-static {v9, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    invoke-static {v9, v3}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-static {v9, v2}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    invoke-static {v9, v1}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    invoke-static {v9, v14}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    invoke-static {v9, v13}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    invoke-static {v9, v12}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    invoke-static {v9, v11}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    invoke-static {v9, v10}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    move-object/from16 v13, v24

    .line 136
    .line 137
    invoke-static {v9, v13}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    move-object/from16 v14, v23

    .line 142
    .line 143
    invoke-static {v9, v14}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    move-object/from16 v15, v22

    .line 148
    .line 149
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v15

    .line 153
    move/from16 p1, v15

    .line 154
    .line 155
    move-object/from16 v15, v21

    .line 156
    .line 157
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v15

    .line 161
    move/from16 v16, v15

    .line 162
    .line 163
    move-object/from16 v15, v20

    .line 164
    .line 165
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v15

    .line 169
    move/from16 v20, v15

    .line 170
    .line 171
    move-object/from16 v15, v19

    .line 172
    .line 173
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    move/from16 v19, v15

    .line 178
    .line 179
    move-object/from16 v15, v18

    .line 180
    .line 181
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v15

    .line 185
    move/from16 v18, v15

    .line 186
    .line 187
    move-object/from16 v15, v17

    .line 188
    .line 189
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    move/from16 v17, v15

    .line 194
    .line 195
    const-string v15, "kind"

    .line 196
    .line 197
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    move-result v15

    .line 201
    move/from16 v21, v15

    .line 202
    .line 203
    const-string v15, "type"

    .line 204
    .line 205
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v15

    .line 209
    move/from16 v22, v15

    .line 210
    .line 211
    const-string v15, "players_duel_game"

    .line 212
    .line 213
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    move-result v15

    .line 217
    move/from16 v23, v15

    .line 218
    .line 219
    const-string v15, "coupon_entry_feature_id"

    .line 220
    .line 221
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 222
    .line 223
    .line 224
    move-result v15

    .line 225
    move/from16 v24, v15

    .line 226
    .line 227
    const-string v15, "first_opponent_name"

    .line 228
    .line 229
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    move-result v15

    .line 233
    move/from16 v25, v15

    .line 234
    .line 235
    const-string v15, "second_opponent_name"

    .line 236
    .line 237
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    move-result v15

    .line 241
    move/from16 v26, v15

    .line 242
    .line 243
    const-string v15, "opponents_full_name"

    .line 244
    .line 245
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    move-result v15

    .line 249
    move/from16 v27, v15

    .line 250
    .line 251
    const-string v15, "tournament_stage"

    .line 252
    .line 253
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 254
    .line 255
    .line 256
    move-result v15

    .line 257
    move/from16 v28, v15

    .line 258
    .line 259
    const-string v15, "teams_number"

    .line 260
    .line 261
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    move-result v15

    .line 265
    move/from16 v29, v15

    .line 266
    .line 267
    const-string v15, "game_type"

    .line 268
    .line 269
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 270
    .line 271
    .line 272
    move-result v15

    .line 273
    move/from16 v30, v15

    .line 274
    .line 275
    const-string v15, "game_vid"

    .line 276
    .line 277
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 278
    .line 279
    .line 280
    move-result v15

    .line 281
    move/from16 v31, v15

    .line 282
    .line 283
    const-string v15, "group_id"

    .line 284
    .line 285
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 286
    .line 287
    .line 288
    move-result v15

    .line 289
    move/from16 v32, v15

    .line 290
    .line 291
    const-string v15, "option_lower_cf"

    .line 292
    .line 293
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 294
    .line 295
    .line 296
    move-result v15

    .line 297
    move/from16 v33, v15

    .line 298
    .line 299
    const-string v15, "option_lower_cf_view"

    .line 300
    .line 301
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 302
    .line 303
    .line 304
    move-result v15

    .line 305
    move/from16 v34, v15

    .line 306
    .line 307
    const-string v15, "coupon_type_vid"

    .line 308
    .line 309
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 310
    .line 311
    .line 312
    move-result v15

    .line 313
    move/from16 v35, v15

    .line 314
    .line 315
    const-string v15, "builder_game_type"

    .line 316
    .line 317
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 318
    .line 319
    .line 320
    move-result v15

    .line 321
    move/from16 v36, v15

    .line 322
    .line 323
    const-string v15, "builder_game_vid"

    .line 324
    .line 325
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    move-result v15

    .line 329
    move/from16 v37, v15

    .line 330
    .line 331
    const-string v15, "builder_period"

    .line 332
    .line 333
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 334
    .line 335
    .line 336
    move-result v15

    .line 337
    move/from16 v38, v15

    .line 338
    .line 339
    const-string v15, "builder_coef_available"

    .line 340
    .line 341
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 342
    .line 343
    .line 344
    move-result v15

    .line 345
    move/from16 v39, v15

    .line 346
    .line 347
    new-instance v15, Ljava/util/ArrayList;

    .line 348
    .line 349
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 350
    .line 351
    .line 352
    :goto_0
    invoke-interface {v9}, La/xpg0;->W0()Z

    .line 353
    .line 354
    .line 355
    move-result v40

    .line 356
    if-eqz v40, :cond_0

    .line 357
    .line 358
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 359
    .line 360
    .line 361
    move-result-wide v42

    .line 362
    invoke-interface {v9, v5}, La/xpg0;->getLong(I)J

    .line 363
    .line 364
    .line 365
    move-result-wide v44

    .line 366
    invoke-interface {v9, v4}, La/xpg0;->getLong(I)J

    .line 367
    .line 368
    .line 369
    move-result-wide v46

    .line 370
    invoke-interface {v9, v3}, La/xpg0;->getLong(I)J

    .line 371
    .line 372
    .line 373
    move-result-wide v48

    .line 374
    invoke-interface {v9, v2}, La/xpg0;->getLong(I)J

    .line 375
    .line 376
    .line 377
    move-result-wide v50

    .line 378
    invoke-interface {v9, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v52

    .line 382
    invoke-interface {v9, v6}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v53

    .line 386
    invoke-interface {v9, v7}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v54

    .line 390
    invoke-interface {v9, v8}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v55

    .line 394
    invoke-interface {v9, v12}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v56

    .line 398
    invoke-interface {v9, v11}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v57

    .line 402
    invoke-interface {v9, v10}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v58

    .line 406
    invoke-interface {v9, v13}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v59

    .line 410
    invoke-interface {v9, v14}, La/xpg0;->getLong(I)J

    .line 411
    .line 412
    .line 413
    move-result-wide v60

    .line 414
    move/from16 v40, v0

    .line 415
    .line 416
    move/from16 v0, p1

    .line 417
    .line 418
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v62

    .line 422
    move/from16 p1, v0

    .line 423
    .line 424
    move/from16 v0, v16

    .line 425
    .line 426
    invoke-interface {v9, v0}, La/xpg0;->getDouble(I)D

    .line 427
    .line 428
    .line 429
    move-result-wide v63

    .line 430
    move/from16 v16, v0

    .line 431
    .line 432
    move/from16 v0, v20

    .line 433
    .line 434
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 435
    .line 436
    .line 437
    move-result-wide v65

    .line 438
    move/from16 v20, v0

    .line 439
    .line 440
    move/from16 v0, v19

    .line 441
    .line 442
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v67

    .line 446
    move/from16 v19, v0

    .line 447
    .line 448
    move/from16 v0, v18

    .line 449
    .line 450
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v68

    .line 454
    move/from16 v18, v0

    .line 455
    .line 456
    move/from16 v0, v17

    .line 457
    .line 458
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v69

    .line 462
    move/from16 v17, v0

    .line 463
    .line 464
    move/from16 v92, v1

    .line 465
    .line 466
    move/from16 v0, v21

    .line 467
    .line 468
    move/from16 v21, v2

    .line 469
    .line 470
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 471
    .line 472
    .line 473
    move-result-wide v1

    .line 474
    long-to-int v1, v1

    .line 475
    move-object/from16 v2, p0

    .line 476
    .line 477
    move/from16 v93, v0

    .line 478
    .line 479
    iget-object v0, v2, La/ju6;->l:La/ou6;

    .line 480
    .line 481
    iget-object v0, v0, La/ou6;->b:La/art;

    .line 482
    .line 483
    sget-object v0, La/toy;->b:La/sqt;

    .line 484
    .line 485
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-static {v1}, La/sqt;->h(I)La/toy;

    .line 489
    .line 490
    .line 491
    move-result-object v70

    .line 492
    move/from16 v0, v22

    .line 493
    .line 494
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 495
    .line 496
    .line 497
    move-result-wide v71

    .line 498
    move/from16 v1, v23

    .line 499
    .line 500
    invoke-interface {v9, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v73

    .line 504
    move/from16 v22, v0

    .line 505
    .line 506
    move/from16 v23, v1

    .line 507
    .line 508
    move/from16 v0, v24

    .line 509
    .line 510
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 511
    .line 512
    .line 513
    move-result-wide v1

    .line 514
    long-to-int v1, v1

    .line 515
    move/from16 v2, v25

    .line 516
    .line 517
    invoke-interface {v9, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v75

    .line 521
    move/from16 v24, v0

    .line 522
    .line 523
    move/from16 v0, v26

    .line 524
    .line 525
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v76

    .line 529
    move/from16 v26, v0

    .line 530
    .line 531
    move/from16 v0, v27

    .line 532
    .line 533
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v77

    .line 537
    move/from16 v27, v0

    .line 538
    .line 539
    move/from16 v0, v28

    .line 540
    .line 541
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v78

    .line 545
    move/from16 v28, v0

    .line 546
    .line 547
    move/from16 v74, v1

    .line 548
    .line 549
    move/from16 v25, v2

    .line 550
    .line 551
    move/from16 v0, v29

    .line 552
    .line 553
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 554
    .line 555
    .line 556
    move-result-wide v1

    .line 557
    long-to-int v1, v1

    .line 558
    move/from16 v2, v30

    .line 559
    .line 560
    invoke-interface {v9, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v80

    .line 564
    move/from16 v29, v0

    .line 565
    .line 566
    move/from16 v0, v31

    .line 567
    .line 568
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v81

    .line 572
    move/from16 v31, v0

    .line 573
    .line 574
    move/from16 v0, v32

    .line 575
    .line 576
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 577
    .line 578
    .line 579
    move-result-wide v82

    .line 580
    move/from16 v32, v0

    .line 581
    .line 582
    move/from16 v0, v33

    .line 583
    .line 584
    invoke-interface {v9, v0}, La/xpg0;->getDouble(I)D

    .line 585
    .line 586
    .line 587
    move-result-wide v84

    .line 588
    move/from16 v33, v0

    .line 589
    .line 590
    move/from16 v0, v34

    .line 591
    .line 592
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v86

    .line 596
    move/from16 v34, v0

    .line 597
    .line 598
    move/from16 v79, v1

    .line 599
    .line 600
    move/from16 v30, v2

    .line 601
    .line 602
    move/from16 v0, v35

    .line 603
    .line 604
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 605
    .line 606
    .line 607
    move-result-wide v1

    .line 608
    long-to-int v1, v1

    .line 609
    move/from16 v35, v0

    .line 610
    .line 611
    move/from16 v87, v1

    .line 612
    .line 613
    move/from16 v2, v36

    .line 614
    .line 615
    invoke-interface {v9, v2}, La/xpg0;->getLong(I)J

    .line 616
    .line 617
    .line 618
    move-result-wide v0

    .line 619
    long-to-int v0, v0

    .line 620
    move/from16 v36, v3

    .line 621
    .line 622
    move/from16 v1, v37

    .line 623
    .line 624
    move/from16 v37, v2

    .line 625
    .line 626
    invoke-interface {v9, v1}, La/xpg0;->getLong(I)J

    .line 627
    .line 628
    .line 629
    move-result-wide v2

    .line 630
    long-to-int v2, v2

    .line 631
    move/from16 v88, v0

    .line 632
    .line 633
    move/from16 v3, v38

    .line 634
    .line 635
    move/from16 v38, v1

    .line 636
    .line 637
    invoke-interface {v9, v3}, La/xpg0;->getLong(I)J

    .line 638
    .line 639
    .line 640
    move-result-wide v0

    .line 641
    long-to-int v0, v0

    .line 642
    move/from16 v89, v2

    .line 643
    .line 644
    move/from16 v1, v39

    .line 645
    .line 646
    move/from16 v39, v3

    .line 647
    .line 648
    invoke-interface {v9, v1}, La/xpg0;->getLong(I)J

    .line 649
    .line 650
    .line 651
    move-result-wide v2

    .line 652
    long-to-int v2, v2

    .line 653
    new-instance v41, La/pu6;

    .line 654
    .line 655
    move/from16 v90, v0

    .line 656
    .line 657
    move/from16 v91, v2

    .line 658
    .line 659
    invoke-direct/range {v41 .. v91}, La/pu6;-><init>(JJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;DJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/toy;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;IIIII)V

    .line 660
    .line 661
    .line 662
    move-object/from16 v0, v41

    .line 663
    .line 664
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 665
    .line 666
    .line 667
    move/from16 v2, v21

    .line 668
    .line 669
    move/from16 v3, v36

    .line 670
    .line 671
    move/from16 v36, v37

    .line 672
    .line 673
    move/from16 v37, v38

    .line 674
    .line 675
    move/from16 v38, v39

    .line 676
    .line 677
    move/from16 v0, v40

    .line 678
    .line 679
    move/from16 v21, v93

    .line 680
    .line 681
    move/from16 v39, v1

    .line 682
    .line 683
    move/from16 v1, v92

    .line 684
    .line 685
    goto/16 :goto_0

    .line 686
    .line 687
    :catchall_0
    move-exception v0

    .line 688
    goto :goto_1

    .line 689
    :cond_0
    invoke-interface {v9}, Ljava/lang/AutoCloseable;->close()V

    .line 690
    .line 691
    .line 692
    return-object v15

    .line 693
    :goto_1
    invoke-interface {v9}, Ljava/lang/AutoCloseable;->close()V

    .line 694
    .line 695
    .line 696
    throw v0

    .line 697
    :pswitch_0
    sget-object v25, La/wne;->a:La/wne;

    .line 698
    .line 699
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    const-string v0, "select * from bet_events where id = ? order by id ASC limit 1"

    .line 703
    .line 704
    invoke-interface {v9, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 705
    .line 706
    .line 707
    move-result-object v9

    .line 708
    const/4 v0, 0x1

    .line 709
    :try_start_1
    invoke-interface {v9, v0, v7, v8}, La/xpg0;->o(IJ)V

    .line 710
    .line 711
    .line 712
    invoke-static {v9, v6}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 713
    .line 714
    .line 715
    move-result v0

    .line 716
    invoke-static {v9, v5}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 717
    .line 718
    .line 719
    move-result v5

    .line 720
    invoke-static {v9, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 721
    .line 722
    .line 723
    move-result v4

    .line 724
    invoke-static {v9, v3}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 725
    .line 726
    .line 727
    move-result v3

    .line 728
    invoke-static {v9, v2}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 729
    .line 730
    .line 731
    move-result v2

    .line 732
    invoke-static {v9, v1}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 733
    .line 734
    .line 735
    move-result v1

    .line 736
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 737
    .line 738
    .line 739
    move-result v6

    .line 740
    invoke-static {v9, v14}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 741
    .line 742
    .line 743
    move-result v7

    .line 744
    invoke-static {v9, v13}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 745
    .line 746
    .line 747
    move-result v8

    .line 748
    invoke-static {v9, v12}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 749
    .line 750
    .line 751
    move-result v12

    .line 752
    invoke-static {v9, v11}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 753
    .line 754
    .line 755
    move-result v11

    .line 756
    invoke-static {v9, v10}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 757
    .line 758
    .line 759
    move-result v10

    .line 760
    move-object/from16 v13, v24

    .line 761
    .line 762
    invoke-static {v9, v13}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 763
    .line 764
    .line 765
    move-result v13

    .line 766
    move-object/from16 v14, v23

    .line 767
    .line 768
    invoke-static {v9, v14}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 769
    .line 770
    .line 771
    move-result v14

    .line 772
    move-object/from16 v15, v22

    .line 773
    .line 774
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 775
    .line 776
    .line 777
    move-result v15

    .line 778
    move/from16 p1, v15

    .line 779
    .line 780
    move-object/from16 v15, v21

    .line 781
    .line 782
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 783
    .line 784
    .line 785
    move-result v15

    .line 786
    move/from16 v16, v15

    .line 787
    .line 788
    move-object/from16 v15, v20

    .line 789
    .line 790
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 791
    .line 792
    .line 793
    move-result v15

    .line 794
    move/from16 v20, v15

    .line 795
    .line 796
    move-object/from16 v15, v19

    .line 797
    .line 798
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 799
    .line 800
    .line 801
    move-result v15

    .line 802
    move/from16 v19, v15

    .line 803
    .line 804
    move-object/from16 v15, v18

    .line 805
    .line 806
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 807
    .line 808
    .line 809
    move-result v15

    .line 810
    move/from16 v18, v15

    .line 811
    .line 812
    move-object/from16 v15, v17

    .line 813
    .line 814
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 815
    .line 816
    .line 817
    move-result v15

    .line 818
    move/from16 v17, v15

    .line 819
    .line 820
    const-string v15, "kind"

    .line 821
    .line 822
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 823
    .line 824
    .line 825
    move-result v15

    .line 826
    move/from16 v21, v15

    .line 827
    .line 828
    const-string v15, "type"

    .line 829
    .line 830
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 831
    .line 832
    .line 833
    move-result v15

    .line 834
    move/from16 v22, v15

    .line 835
    .line 836
    const-string v15, "players_duel_game"

    .line 837
    .line 838
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 839
    .line 840
    .line 841
    move-result v15

    .line 842
    move/from16 v23, v15

    .line 843
    .line 844
    const-string v15, "coupon_entry_feature_id"

    .line 845
    .line 846
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 847
    .line 848
    .line 849
    move-result v15

    .line 850
    move/from16 v24, v15

    .line 851
    .line 852
    const-string v15, "first_opponent_name"

    .line 853
    .line 854
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 855
    .line 856
    .line 857
    move-result v15

    .line 858
    move/from16 v25, v15

    .line 859
    .line 860
    const-string v15, "second_opponent_name"

    .line 861
    .line 862
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 863
    .line 864
    .line 865
    move-result v15

    .line 866
    move/from16 v26, v15

    .line 867
    .line 868
    const-string v15, "opponents_full_name"

    .line 869
    .line 870
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 871
    .line 872
    .line 873
    move-result v15

    .line 874
    move/from16 v27, v15

    .line 875
    .line 876
    const-string v15, "tournament_stage"

    .line 877
    .line 878
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 879
    .line 880
    .line 881
    move-result v15

    .line 882
    move/from16 v28, v15

    .line 883
    .line 884
    const-string v15, "teams_number"

    .line 885
    .line 886
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 887
    .line 888
    .line 889
    move-result v15

    .line 890
    move/from16 v29, v15

    .line 891
    .line 892
    const-string v15, "game_type"

    .line 893
    .line 894
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 895
    .line 896
    .line 897
    move-result v15

    .line 898
    move/from16 v30, v15

    .line 899
    .line 900
    const-string v15, "game_vid"

    .line 901
    .line 902
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 903
    .line 904
    .line 905
    move-result v15

    .line 906
    move/from16 v31, v15

    .line 907
    .line 908
    const-string v15, "group_id"

    .line 909
    .line 910
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 911
    .line 912
    .line 913
    move-result v15

    .line 914
    move/from16 v32, v15

    .line 915
    .line 916
    const-string v15, "option_lower_cf"

    .line 917
    .line 918
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 919
    .line 920
    .line 921
    move-result v15

    .line 922
    move/from16 v33, v15

    .line 923
    .line 924
    const-string v15, "option_lower_cf_view"

    .line 925
    .line 926
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 927
    .line 928
    .line 929
    move-result v15

    .line 930
    move/from16 v34, v15

    .line 931
    .line 932
    const-string v15, "coupon_type_vid"

    .line 933
    .line 934
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 935
    .line 936
    .line 937
    move-result v15

    .line 938
    move/from16 v35, v15

    .line 939
    .line 940
    const-string v15, "builder_game_type"

    .line 941
    .line 942
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 943
    .line 944
    .line 945
    move-result v15

    .line 946
    move/from16 v36, v15

    .line 947
    .line 948
    const-string v15, "builder_game_vid"

    .line 949
    .line 950
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 951
    .line 952
    .line 953
    move-result v15

    .line 954
    move/from16 v37, v15

    .line 955
    .line 956
    const-string v15, "builder_period"

    .line 957
    .line 958
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 959
    .line 960
    .line 961
    move-result v15

    .line 962
    move/from16 v38, v15

    .line 963
    .line 964
    const-string v15, "builder_coef_available"

    .line 965
    .line 966
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 967
    .line 968
    .line 969
    move-result v15

    .line 970
    invoke-interface {v9}, La/xpg0;->W0()Z

    .line 971
    .line 972
    .line 973
    move-result v39

    .line 974
    if-eqz v39, :cond_1

    .line 975
    .line 976
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 977
    .line 978
    .line 979
    move-result-wide v41

    .line 980
    invoke-interface {v9, v5}, La/xpg0;->getLong(I)J

    .line 981
    .line 982
    .line 983
    move-result-wide v43

    .line 984
    invoke-interface {v9, v4}, La/xpg0;->getLong(I)J

    .line 985
    .line 986
    .line 987
    move-result-wide v45

    .line 988
    invoke-interface {v9, v3}, La/xpg0;->getLong(I)J

    .line 989
    .line 990
    .line 991
    move-result-wide v47

    .line 992
    invoke-interface {v9, v2}, La/xpg0;->getLong(I)J

    .line 993
    .line 994
    .line 995
    move-result-wide v49

    .line 996
    invoke-interface {v9, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v51

    .line 1000
    invoke-interface {v9, v6}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v52

    .line 1004
    invoke-interface {v9, v7}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v53

    .line 1008
    invoke-interface {v9, v8}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v54

    .line 1012
    invoke-interface {v9, v12}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v55

    .line 1016
    invoke-interface {v9, v11}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v56

    .line 1020
    invoke-interface {v9, v10}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v57

    .line 1024
    invoke-interface {v9, v13}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v58

    .line 1028
    invoke-interface {v9, v14}, La/xpg0;->getLong(I)J

    .line 1029
    .line 1030
    .line 1031
    move-result-wide v59

    .line 1032
    move/from16 v0, p1

    .line 1033
    .line 1034
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v61

    .line 1038
    move/from16 v0, v16

    .line 1039
    .line 1040
    invoke-interface {v9, v0}, La/xpg0;->getDouble(I)D

    .line 1041
    .line 1042
    .line 1043
    move-result-wide v62

    .line 1044
    move/from16 v0, v20

    .line 1045
    .line 1046
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 1047
    .line 1048
    .line 1049
    move-result-wide v64

    .line 1050
    move/from16 v0, v19

    .line 1051
    .line 1052
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v66

    .line 1056
    move/from16 v0, v18

    .line 1057
    .line 1058
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v67

    .line 1062
    move/from16 v0, v17

    .line 1063
    .line 1064
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v68

    .line 1068
    move/from16 v0, v21

    .line 1069
    .line 1070
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 1071
    .line 1072
    .line 1073
    move-result-wide v0

    .line 1074
    long-to-int v0, v0

    .line 1075
    move-object/from16 v1, p0

    .line 1076
    .line 1077
    iget-object v1, v1, La/ju6;->l:La/ou6;

    .line 1078
    .line 1079
    iget-object v1, v1, La/ou6;->b:La/art;

    .line 1080
    .line 1081
    sget-object v1, La/toy;->b:La/sqt;

    .line 1082
    .line 1083
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1084
    .line 1085
    .line 1086
    invoke-static {v0}, La/sqt;->h(I)La/toy;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v69

    .line 1090
    move/from16 v0, v22

    .line 1091
    .line 1092
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 1093
    .line 1094
    .line 1095
    move-result-wide v70

    .line 1096
    move/from16 v0, v23

    .line 1097
    .line 1098
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v72

    .line 1102
    move/from16 v0, v24

    .line 1103
    .line 1104
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 1105
    .line 1106
    .line 1107
    move-result-wide v0

    .line 1108
    long-to-int v0, v0

    .line 1109
    move/from16 v1, v25

    .line 1110
    .line 1111
    invoke-interface {v9, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v74

    .line 1115
    move/from16 v1, v26

    .line 1116
    .line 1117
    invoke-interface {v9, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v75

    .line 1121
    move/from16 v1, v27

    .line 1122
    .line 1123
    invoke-interface {v9, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v76

    .line 1127
    move/from16 v1, v28

    .line 1128
    .line 1129
    invoke-interface {v9, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v77

    .line 1133
    move/from16 v1, v29

    .line 1134
    .line 1135
    invoke-interface {v9, v1}, La/xpg0;->getLong(I)J

    .line 1136
    .line 1137
    .line 1138
    move-result-wide v1

    .line 1139
    long-to-int v1, v1

    .line 1140
    move/from16 v2, v30

    .line 1141
    .line 1142
    invoke-interface {v9, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v79

    .line 1146
    move/from16 v2, v31

    .line 1147
    .line 1148
    invoke-interface {v9, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v80

    .line 1152
    move/from16 v2, v32

    .line 1153
    .line 1154
    invoke-interface {v9, v2}, La/xpg0;->getLong(I)J

    .line 1155
    .line 1156
    .line 1157
    move-result-wide v81

    .line 1158
    move/from16 v2, v33

    .line 1159
    .line 1160
    invoke-interface {v9, v2}, La/xpg0;->getDouble(I)D

    .line 1161
    .line 1162
    .line 1163
    move-result-wide v83

    .line 1164
    move/from16 v2, v34

    .line 1165
    .line 1166
    invoke-interface {v9, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v85

    .line 1170
    move/from16 v2, v35

    .line 1171
    .line 1172
    invoke-interface {v9, v2}, La/xpg0;->getLong(I)J

    .line 1173
    .line 1174
    .line 1175
    move-result-wide v2

    .line 1176
    long-to-int v2, v2

    .line 1177
    move/from16 v3, v36

    .line 1178
    .line 1179
    invoke-interface {v9, v3}, La/xpg0;->getLong(I)J

    .line 1180
    .line 1181
    .line 1182
    move-result-wide v3

    .line 1183
    long-to-int v3, v3

    .line 1184
    move/from16 v4, v37

    .line 1185
    .line 1186
    invoke-interface {v9, v4}, La/xpg0;->getLong(I)J

    .line 1187
    .line 1188
    .line 1189
    move-result-wide v4

    .line 1190
    long-to-int v4, v4

    .line 1191
    move/from16 v5, v38

    .line 1192
    .line 1193
    invoke-interface {v9, v5}, La/xpg0;->getLong(I)J

    .line 1194
    .line 1195
    .line 1196
    move-result-wide v5

    .line 1197
    long-to-int v5, v5

    .line 1198
    invoke-interface {v9, v15}, La/xpg0;->getLong(I)J

    .line 1199
    .line 1200
    .line 1201
    move-result-wide v6

    .line 1202
    long-to-int v6, v6

    .line 1203
    new-instance v40, La/pu6;

    .line 1204
    .line 1205
    move/from16 v73, v0

    .line 1206
    .line 1207
    move/from16 v78, v1

    .line 1208
    .line 1209
    move/from16 v86, v2

    .line 1210
    .line 1211
    move/from16 v87, v3

    .line 1212
    .line 1213
    move/from16 v88, v4

    .line 1214
    .line 1215
    move/from16 v89, v5

    .line 1216
    .line 1217
    move/from16 v90, v6

    .line 1218
    .line 1219
    invoke-direct/range {v40 .. v90}, La/pu6;-><init>(JJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;DJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/toy;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;IIIII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1220
    .line 1221
    .line 1222
    goto :goto_2

    .line 1223
    :catchall_1
    move-exception v0

    .line 1224
    goto :goto_3

    .line 1225
    :cond_1
    const/16 v40, 0x0

    .line 1226
    .line 1227
    :goto_2
    invoke-interface {v9}, Ljava/lang/AutoCloseable;->close()V

    .line 1228
    .line 1229
    .line 1230
    return-object v40

    .line 1231
    :goto_3
    invoke-interface {v9}, Ljava/lang/AutoCloseable;->close()V

    .line 1232
    .line 1233
    .line 1234
    throw v0

    .line 1235
    :pswitch_1
    sget-object v25, La/wne;->a:La/wne;

    .line 1236
    .line 1237
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1238
    .line 1239
    .line 1240
    const-string v0, "select * from bet_events where game_id = ? order by game_id ASC limit 1"

    .line 1241
    .line 1242
    invoke-interface {v9, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v9

    .line 1246
    const/4 v0, 0x1

    .line 1247
    :try_start_2
    invoke-interface {v9, v0, v7, v8}, La/xpg0;->o(IJ)V

    .line 1248
    .line 1249
    .line 1250
    invoke-static {v9, v6}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1251
    .line 1252
    .line 1253
    move-result v0

    .line 1254
    invoke-static {v9, v5}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1255
    .line 1256
    .line 1257
    move-result v5

    .line 1258
    invoke-static {v9, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1259
    .line 1260
    .line 1261
    move-result v4

    .line 1262
    invoke-static {v9, v3}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1263
    .line 1264
    .line 1265
    move-result v3

    .line 1266
    invoke-static {v9, v2}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1267
    .line 1268
    .line 1269
    move-result v2

    .line 1270
    invoke-static {v9, v1}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1271
    .line 1272
    .line 1273
    move-result v1

    .line 1274
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1275
    .line 1276
    .line 1277
    move-result v6

    .line 1278
    invoke-static {v9, v14}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1279
    .line 1280
    .line 1281
    move-result v7

    .line 1282
    invoke-static {v9, v13}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1283
    .line 1284
    .line 1285
    move-result v8

    .line 1286
    invoke-static {v9, v12}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1287
    .line 1288
    .line 1289
    move-result v12

    .line 1290
    invoke-static {v9, v11}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1291
    .line 1292
    .line 1293
    move-result v11

    .line 1294
    invoke-static {v9, v10}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1295
    .line 1296
    .line 1297
    move-result v10

    .line 1298
    move-object/from16 v13, v24

    .line 1299
    .line 1300
    invoke-static {v9, v13}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1301
    .line 1302
    .line 1303
    move-result v13

    .line 1304
    move-object/from16 v14, v23

    .line 1305
    .line 1306
    invoke-static {v9, v14}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1307
    .line 1308
    .line 1309
    move-result v14

    .line 1310
    move-object/from16 v15, v22

    .line 1311
    .line 1312
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1313
    .line 1314
    .line 1315
    move-result v15

    .line 1316
    move/from16 p1, v15

    .line 1317
    .line 1318
    move-object/from16 v15, v21

    .line 1319
    .line 1320
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1321
    .line 1322
    .line 1323
    move-result v15

    .line 1324
    move/from16 v16, v15

    .line 1325
    .line 1326
    move-object/from16 v15, v20

    .line 1327
    .line 1328
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1329
    .line 1330
    .line 1331
    move-result v15

    .line 1332
    move/from16 v20, v15

    .line 1333
    .line 1334
    move-object/from16 v15, v19

    .line 1335
    .line 1336
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1337
    .line 1338
    .line 1339
    move-result v15

    .line 1340
    move/from16 v19, v15

    .line 1341
    .line 1342
    move-object/from16 v15, v18

    .line 1343
    .line 1344
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1345
    .line 1346
    .line 1347
    move-result v15

    .line 1348
    move/from16 v18, v15

    .line 1349
    .line 1350
    move-object/from16 v15, v17

    .line 1351
    .line 1352
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1353
    .line 1354
    .line 1355
    move-result v15

    .line 1356
    move/from16 v17, v15

    .line 1357
    .line 1358
    const-string v15, "kind"

    .line 1359
    .line 1360
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1361
    .line 1362
    .line 1363
    move-result v15

    .line 1364
    move/from16 v21, v15

    .line 1365
    .line 1366
    const-string v15, "type"

    .line 1367
    .line 1368
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1369
    .line 1370
    .line 1371
    move-result v15

    .line 1372
    move/from16 v22, v15

    .line 1373
    .line 1374
    const-string v15, "players_duel_game"

    .line 1375
    .line 1376
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1377
    .line 1378
    .line 1379
    move-result v15

    .line 1380
    move/from16 v23, v15

    .line 1381
    .line 1382
    const-string v15, "coupon_entry_feature_id"

    .line 1383
    .line 1384
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1385
    .line 1386
    .line 1387
    move-result v15

    .line 1388
    move/from16 v24, v15

    .line 1389
    .line 1390
    const-string v15, "first_opponent_name"

    .line 1391
    .line 1392
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1393
    .line 1394
    .line 1395
    move-result v15

    .line 1396
    move/from16 v25, v15

    .line 1397
    .line 1398
    const-string v15, "second_opponent_name"

    .line 1399
    .line 1400
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1401
    .line 1402
    .line 1403
    move-result v15

    .line 1404
    move/from16 v26, v15

    .line 1405
    .line 1406
    const-string v15, "opponents_full_name"

    .line 1407
    .line 1408
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1409
    .line 1410
    .line 1411
    move-result v15

    .line 1412
    move/from16 v27, v15

    .line 1413
    .line 1414
    const-string v15, "tournament_stage"

    .line 1415
    .line 1416
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1417
    .line 1418
    .line 1419
    move-result v15

    .line 1420
    move/from16 v28, v15

    .line 1421
    .line 1422
    const-string v15, "teams_number"

    .line 1423
    .line 1424
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1425
    .line 1426
    .line 1427
    move-result v15

    .line 1428
    move/from16 v29, v15

    .line 1429
    .line 1430
    const-string v15, "game_type"

    .line 1431
    .line 1432
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1433
    .line 1434
    .line 1435
    move-result v15

    .line 1436
    move/from16 v30, v15

    .line 1437
    .line 1438
    const-string v15, "game_vid"

    .line 1439
    .line 1440
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1441
    .line 1442
    .line 1443
    move-result v15

    .line 1444
    move/from16 v31, v15

    .line 1445
    .line 1446
    const-string v15, "group_id"

    .line 1447
    .line 1448
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1449
    .line 1450
    .line 1451
    move-result v15

    .line 1452
    move/from16 v32, v15

    .line 1453
    .line 1454
    const-string v15, "option_lower_cf"

    .line 1455
    .line 1456
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1457
    .line 1458
    .line 1459
    move-result v15

    .line 1460
    move/from16 v33, v15

    .line 1461
    .line 1462
    const-string v15, "option_lower_cf_view"

    .line 1463
    .line 1464
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1465
    .line 1466
    .line 1467
    move-result v15

    .line 1468
    move/from16 v34, v15

    .line 1469
    .line 1470
    const-string v15, "coupon_type_vid"

    .line 1471
    .line 1472
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1473
    .line 1474
    .line 1475
    move-result v15

    .line 1476
    move/from16 v35, v15

    .line 1477
    .line 1478
    const-string v15, "builder_game_type"

    .line 1479
    .line 1480
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1481
    .line 1482
    .line 1483
    move-result v15

    .line 1484
    move/from16 v36, v15

    .line 1485
    .line 1486
    const-string v15, "builder_game_vid"

    .line 1487
    .line 1488
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1489
    .line 1490
    .line 1491
    move-result v15

    .line 1492
    move/from16 v37, v15

    .line 1493
    .line 1494
    const-string v15, "builder_period"

    .line 1495
    .line 1496
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1497
    .line 1498
    .line 1499
    move-result v15

    .line 1500
    move/from16 v38, v15

    .line 1501
    .line 1502
    const-string v15, "builder_coef_available"

    .line 1503
    .line 1504
    invoke-static {v9, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 1505
    .line 1506
    .line 1507
    move-result v15

    .line 1508
    invoke-interface {v9}, La/xpg0;->W0()Z

    .line 1509
    .line 1510
    .line 1511
    move-result v39

    .line 1512
    if-eqz v39, :cond_2

    .line 1513
    .line 1514
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 1515
    .line 1516
    .line 1517
    move-result-wide v41

    .line 1518
    invoke-interface {v9, v5}, La/xpg0;->getLong(I)J

    .line 1519
    .line 1520
    .line 1521
    move-result-wide v43

    .line 1522
    invoke-interface {v9, v4}, La/xpg0;->getLong(I)J

    .line 1523
    .line 1524
    .line 1525
    move-result-wide v45

    .line 1526
    invoke-interface {v9, v3}, La/xpg0;->getLong(I)J

    .line 1527
    .line 1528
    .line 1529
    move-result-wide v47

    .line 1530
    invoke-interface {v9, v2}, La/xpg0;->getLong(I)J

    .line 1531
    .line 1532
    .line 1533
    move-result-wide v49

    .line 1534
    invoke-interface {v9, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v51

    .line 1538
    invoke-interface {v9, v6}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v52

    .line 1542
    invoke-interface {v9, v7}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v53

    .line 1546
    invoke-interface {v9, v8}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v54

    .line 1550
    invoke-interface {v9, v12}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v55

    .line 1554
    invoke-interface {v9, v11}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v56

    .line 1558
    invoke-interface {v9, v10}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v57

    .line 1562
    invoke-interface {v9, v13}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v58

    .line 1566
    invoke-interface {v9, v14}, La/xpg0;->getLong(I)J

    .line 1567
    .line 1568
    .line 1569
    move-result-wide v59

    .line 1570
    move/from16 v0, p1

    .line 1571
    .line 1572
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v61

    .line 1576
    move/from16 v0, v16

    .line 1577
    .line 1578
    invoke-interface {v9, v0}, La/xpg0;->getDouble(I)D

    .line 1579
    .line 1580
    .line 1581
    move-result-wide v62

    .line 1582
    move/from16 v0, v20

    .line 1583
    .line 1584
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 1585
    .line 1586
    .line 1587
    move-result-wide v64

    .line 1588
    move/from16 v0, v19

    .line 1589
    .line 1590
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v66

    .line 1594
    move/from16 v0, v18

    .line 1595
    .line 1596
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v67

    .line 1600
    move/from16 v0, v17

    .line 1601
    .line 1602
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v68

    .line 1606
    move/from16 v0, v21

    .line 1607
    .line 1608
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 1609
    .line 1610
    .line 1611
    move-result-wide v0

    .line 1612
    long-to-int v0, v0

    .line 1613
    move-object/from16 v1, p0

    .line 1614
    .line 1615
    iget-object v1, v1, La/ju6;->l:La/ou6;

    .line 1616
    .line 1617
    iget-object v1, v1, La/ou6;->b:La/art;

    .line 1618
    .line 1619
    sget-object v1, La/toy;->b:La/sqt;

    .line 1620
    .line 1621
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1622
    .line 1623
    .line 1624
    invoke-static {v0}, La/sqt;->h(I)La/toy;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v69

    .line 1628
    move/from16 v0, v22

    .line 1629
    .line 1630
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 1631
    .line 1632
    .line 1633
    move-result-wide v70

    .line 1634
    move/from16 v0, v23

    .line 1635
    .line 1636
    invoke-interface {v9, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v72

    .line 1640
    move/from16 v0, v24

    .line 1641
    .line 1642
    invoke-interface {v9, v0}, La/xpg0;->getLong(I)J

    .line 1643
    .line 1644
    .line 1645
    move-result-wide v0

    .line 1646
    long-to-int v0, v0

    .line 1647
    move/from16 v1, v25

    .line 1648
    .line 1649
    invoke-interface {v9, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v74

    .line 1653
    move/from16 v1, v26

    .line 1654
    .line 1655
    invoke-interface {v9, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v75

    .line 1659
    move/from16 v1, v27

    .line 1660
    .line 1661
    invoke-interface {v9, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v76

    .line 1665
    move/from16 v1, v28

    .line 1666
    .line 1667
    invoke-interface {v9, v1}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v77

    .line 1671
    move/from16 v1, v29

    .line 1672
    .line 1673
    invoke-interface {v9, v1}, La/xpg0;->getLong(I)J

    .line 1674
    .line 1675
    .line 1676
    move-result-wide v1

    .line 1677
    long-to-int v1, v1

    .line 1678
    move/from16 v2, v30

    .line 1679
    .line 1680
    invoke-interface {v9, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v79

    .line 1684
    move/from16 v2, v31

    .line 1685
    .line 1686
    invoke-interface {v9, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v80

    .line 1690
    move/from16 v2, v32

    .line 1691
    .line 1692
    invoke-interface {v9, v2}, La/xpg0;->getLong(I)J

    .line 1693
    .line 1694
    .line 1695
    move-result-wide v81

    .line 1696
    move/from16 v2, v33

    .line 1697
    .line 1698
    invoke-interface {v9, v2}, La/xpg0;->getDouble(I)D

    .line 1699
    .line 1700
    .line 1701
    move-result-wide v83

    .line 1702
    move/from16 v2, v34

    .line 1703
    .line 1704
    invoke-interface {v9, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v85

    .line 1708
    move/from16 v2, v35

    .line 1709
    .line 1710
    invoke-interface {v9, v2}, La/xpg0;->getLong(I)J

    .line 1711
    .line 1712
    .line 1713
    move-result-wide v2

    .line 1714
    long-to-int v2, v2

    .line 1715
    move/from16 v3, v36

    .line 1716
    .line 1717
    invoke-interface {v9, v3}, La/xpg0;->getLong(I)J

    .line 1718
    .line 1719
    .line 1720
    move-result-wide v3

    .line 1721
    long-to-int v3, v3

    .line 1722
    move/from16 v4, v37

    .line 1723
    .line 1724
    invoke-interface {v9, v4}, La/xpg0;->getLong(I)J

    .line 1725
    .line 1726
    .line 1727
    move-result-wide v4

    .line 1728
    long-to-int v4, v4

    .line 1729
    move/from16 v5, v38

    .line 1730
    .line 1731
    invoke-interface {v9, v5}, La/xpg0;->getLong(I)J

    .line 1732
    .line 1733
    .line 1734
    move-result-wide v5

    .line 1735
    long-to-int v5, v5

    .line 1736
    invoke-interface {v9, v15}, La/xpg0;->getLong(I)J

    .line 1737
    .line 1738
    .line 1739
    move-result-wide v6

    .line 1740
    long-to-int v6, v6

    .line 1741
    new-instance v40, La/pu6;

    .line 1742
    .line 1743
    move/from16 v73, v0

    .line 1744
    .line 1745
    move/from16 v78, v1

    .line 1746
    .line 1747
    move/from16 v86, v2

    .line 1748
    .line 1749
    move/from16 v87, v3

    .line 1750
    .line 1751
    move/from16 v88, v4

    .line 1752
    .line 1753
    move/from16 v89, v5

    .line 1754
    .line 1755
    move/from16 v90, v6

    .line 1756
    .line 1757
    invoke-direct/range {v40 .. v90}, La/pu6;-><init>(JJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;DJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/toy;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;IIIII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1758
    .line 1759
    .line 1760
    goto :goto_4

    .line 1761
    :catchall_2
    move-exception v0

    .line 1762
    goto :goto_5

    .line 1763
    :cond_2
    const/16 v40, 0x0

    .line 1764
    .line 1765
    :goto_4
    invoke-interface {v9}, Ljava/lang/AutoCloseable;->close()V

    .line 1766
    .line 1767
    .line 1768
    return-object v40

    .line 1769
    :goto_5
    invoke-interface {v9}, Ljava/lang/AutoCloseable;->close()V

    .line 1770
    .line 1771
    .line 1772
    throw v0

    .line 1773
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
