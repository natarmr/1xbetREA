.class public final La/lu6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:J

.field public final synthetic k:B

.field public final synthetic l:D

.field public final synthetic m:J

.field public final synthetic n:J

.field public final synthetic o:La/ou6;


# direct methods
.method public constructor <init>(JIDJJLa/ou6;La/yje;)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/lu6;->j:J

    .line 2
    .line 3
    iput-byte p3, p0, La/lu6;->k:B

    .line 4
    .line 5
    iput-wide p4, p0, La/lu6;->l:D

    .line 6
    .line 7
    iput-wide p6, p0, La/lu6;->m:J

    .line 8
    .line 9
    iput-wide p8, p0, La/lu6;->n:J

    .line 10
    .line 11
    iput-object p10, p0, La/lu6;->o:La/ou6;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p11}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    new-instance v0, La/lu6;

    .line 2
    .line 3
    iget-wide v8, p0, La/lu6;->n:J

    .line 4
    .line 5
    iget-object v10, p0, La/lu6;->o:La/ou6;

    .line 6
    .line 7
    iget-wide v1, p0, La/lu6;->j:J

    .line 8
    .line 9
    iget-byte v3, p0, La/lu6;->k:B

    .line 10
    .line 11
    iget-wide v4, p0, La/lu6;->l:D

    .line 12
    .line 13
    iget-wide v6, p0, La/lu6;->m:J

    .line 14
    .line 15
    move-object v11, p2

    .line 16
    invoke-direct/range {v0 .. v11}, La/lu6;-><init>(JIDJJLa/ou6;La/yje;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/lu6;->i:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/qpg0;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/lu6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/lu6;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/lu6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 90

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/lu6;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/qpg0;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "select * from bet_events where game_id = ? and kind = ? and param = ? and player_Id = ? and type = ? order by game_id ASC limit 1"

    .line 13
    .line 14
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :try_start_0
    iget-wide v2, v0, La/lu6;->j:J

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-interface {v1, v4, v2, v3}, La/xpg0;->o(IJ)V

    .line 22
    .line 23
    .line 24
    iget-byte v2, v0, La/lu6;->k:B

    .line 25
    .line 26
    int-to-long v2, v2

    .line 27
    const/4 v4, 0x2

    .line 28
    invoke-interface {v1, v4, v2, v3}, La/xpg0;->o(IJ)V

    .line 29
    .line 30
    .line 31
    iget-wide v2, v0, La/lu6;->l:D

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    invoke-interface {v1, v2, v3, v4}, La/xpg0;->p(DI)V

    .line 35
    .line 36
    .line 37
    iget-wide v2, v0, La/lu6;->m:J

    .line 38
    .line 39
    const/4 v4, 0x4

    .line 40
    invoke-interface {v1, v4, v2, v3}, La/xpg0;->o(IJ)V

    .line 41
    .line 42
    .line 43
    iget-wide v2, v0, La/lu6;->n:J

    .line 44
    .line 45
    const/4 v0, 0x5

    .line 46
    invoke-interface {v1, v0, v2, v3}, La/xpg0;->o(IJ)V

    .line 47
    .line 48
    .line 49
    const-string v0, "id"

    .line 50
    .line 51
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const-string v2, "game_id"

    .line 56
    .line 57
    invoke-static {v1, v2}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    const-string v3, "main_game_id"

    .line 62
    .line 63
    invoke-static {v1, v3}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    const-string v4, "player_id"

    .line 68
    .line 69
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    const-string v5, "sport_id"

    .line 74
    .line 75
    invoke-static {v1, v5}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    const-string v6, "player_name"

    .line 80
    .line 81
    invoke-static {v1, v6}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    const-string v7, "game_match_name"

    .line 86
    .line 87
    invoke-static {v1, v7}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    const-string v8, "first_opponent_first_img"

    .line 92
    .line 93
    invoke-static {v1, v8}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    const-string v9, "first_opponent_second_img"

    .line 98
    .line 99
    invoke-static {v1, v9}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    const-string v10, "second_opponent_first_img"

    .line 104
    .line 105
    invoke-static {v1, v10}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    const-string v11, "second_opponent_second_img"

    .line 110
    .line 111
    invoke-static {v1, v11}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    const-string v12, "group_name"

    .line 116
    .line 117
    invoke-static {v1, v12}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    const-string v13, "champ_name"

    .line 122
    .line 123
    invoke-static {v1, v13}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v13

    .line 127
    const-string v14, "express_number"

    .line 128
    .line 129
    invoke-static {v1, v14}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    const-string v15, "coefficient"

    .line 134
    .line 135
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    move-result v15

    .line 139
    move/from16 p0, v15

    .line 140
    .line 141
    const-string v15, "param"

    .line 142
    .line 143
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    move/from16 p1, v15

    .line 148
    .line 149
    const-string v15, "time_start"

    .line 150
    .line 151
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    move-result v15

    .line 155
    move/from16 v16, v15

    .line 156
    .line 157
    const-string v15, "vid"

    .line 158
    .line 159
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    move-result v15

    .line 163
    move/from16 v17, v15

    .line 164
    .line 165
    const-string v15, "full_name"

    .line 166
    .line 167
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    move/from16 v18, v15

    .line 172
    .line 173
    const-string v15, "name"

    .line 174
    .line 175
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v15

    .line 179
    move/from16 v19, v15

    .line 180
    .line 181
    const-string v15, "kind"

    .line 182
    .line 183
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 184
    .line 185
    .line 186
    move-result v15

    .line 187
    move/from16 v20, v15

    .line 188
    .line 189
    const-string v15, "type"

    .line 190
    .line 191
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    move-result v15

    .line 195
    move/from16 v21, v15

    .line 196
    .line 197
    const-string v15, "players_duel_game"

    .line 198
    .line 199
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    move-result v15

    .line 203
    move/from16 v22, v15

    .line 204
    .line 205
    const-string v15, "coupon_entry_feature_id"

    .line 206
    .line 207
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    move-result v15

    .line 211
    move/from16 v23, v15

    .line 212
    .line 213
    const-string v15, "first_opponent_name"

    .line 214
    .line 215
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v15

    .line 219
    move/from16 v24, v15

    .line 220
    .line 221
    const-string v15, "second_opponent_name"

    .line 222
    .line 223
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 224
    .line 225
    .line 226
    move-result v15

    .line 227
    move/from16 v25, v15

    .line 228
    .line 229
    const-string v15, "opponents_full_name"

    .line 230
    .line 231
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 232
    .line 233
    .line 234
    move-result v15

    .line 235
    move/from16 v26, v15

    .line 236
    .line 237
    const-string v15, "tournament_stage"

    .line 238
    .line 239
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    move-result v15

    .line 243
    move/from16 v27, v15

    .line 244
    .line 245
    const-string v15, "teams_number"

    .line 246
    .line 247
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 248
    .line 249
    .line 250
    move-result v15

    .line 251
    move/from16 v28, v15

    .line 252
    .line 253
    const-string v15, "game_type"

    .line 254
    .line 255
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    move-result v15

    .line 259
    move/from16 v29, v15

    .line 260
    .line 261
    const-string v15, "game_vid"

    .line 262
    .line 263
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result v15

    .line 267
    move/from16 v30, v15

    .line 268
    .line 269
    const-string v15, "group_id"

    .line 270
    .line 271
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    move-result v15

    .line 275
    move/from16 v31, v15

    .line 276
    .line 277
    const-string v15, "option_lower_cf"

    .line 278
    .line 279
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 280
    .line 281
    .line 282
    move-result v15

    .line 283
    move/from16 v32, v15

    .line 284
    .line 285
    const-string v15, "option_lower_cf_view"

    .line 286
    .line 287
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 288
    .line 289
    .line 290
    move-result v15

    .line 291
    move/from16 v33, v15

    .line 292
    .line 293
    const-string v15, "coupon_type_vid"

    .line 294
    .line 295
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 296
    .line 297
    .line 298
    move-result v15

    .line 299
    move/from16 v34, v15

    .line 300
    .line 301
    const-string v15, "builder_game_type"

    .line 302
    .line 303
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 304
    .line 305
    .line 306
    move-result v15

    .line 307
    move/from16 v35, v15

    .line 308
    .line 309
    const-string v15, "builder_game_vid"

    .line 310
    .line 311
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 312
    .line 313
    .line 314
    move-result v15

    .line 315
    move/from16 v36, v15

    .line 316
    .line 317
    const-string v15, "builder_period"

    .line 318
    .line 319
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 320
    .line 321
    .line 322
    move-result v15

    .line 323
    move/from16 v37, v15

    .line 324
    .line 325
    const-string v15, "builder_coef_available"

    .line 326
    .line 327
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 328
    .line 329
    .line 330
    move-result v15

    .line 331
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 332
    .line 333
    .line 334
    move-result v38

    .line 335
    if-eqz v38, :cond_0

    .line 336
    .line 337
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 338
    .line 339
    .line 340
    move-result-wide v40

    .line 341
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 342
    .line 343
    .line 344
    move-result-wide v42

    .line 345
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 346
    .line 347
    .line 348
    move-result-wide v44

    .line 349
    invoke-interface {v1, v4}, La/xpg0;->getLong(I)J

    .line 350
    .line 351
    .line 352
    move-result-wide v46

    .line 353
    invoke-interface {v1, v5}, La/xpg0;->getLong(I)J

    .line 354
    .line 355
    .line 356
    move-result-wide v48

    .line 357
    invoke-interface {v1, v6}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v50

    .line 361
    invoke-interface {v1, v7}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v51

    .line 365
    invoke-interface {v1, v8}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v52

    .line 369
    invoke-interface {v1, v9}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v53

    .line 373
    invoke-interface {v1, v10}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v54

    .line 377
    invoke-interface {v1, v11}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v55

    .line 381
    invoke-interface {v1, v12}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v56

    .line 385
    invoke-interface {v1, v13}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v57

    .line 389
    invoke-interface {v1, v14}, La/xpg0;->getLong(I)J

    .line 390
    .line 391
    .line 392
    move-result-wide v58

    .line 393
    move/from16 v0, p0

    .line 394
    .line 395
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v60

    .line 399
    move/from16 v0, p1

    .line 400
    .line 401
    invoke-interface {v1, v0}, La/xpg0;->getDouble(I)D

    .line 402
    .line 403
    .line 404
    move-result-wide v61

    .line 405
    move/from16 v0, v16

    .line 406
    .line 407
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 408
    .line 409
    .line 410
    move-result-wide v63

    .line 411
    move/from16 v0, v17

    .line 412
    .line 413
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v65

    .line 417
    move/from16 v0, v18

    .line 418
    .line 419
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v66

    .line 423
    move/from16 v0, v19

    .line 424
    .line 425
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v67

    .line 429
    move/from16 v0, v20

    .line 430
    .line 431
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 432
    .line 433
    .line 434
    move-result-wide v2

    .line 435
    long-to-int v0, v2

    .line 436
    sget-object v2, La/toy;->b:La/sqt;

    .line 437
    .line 438
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-static {v0}, La/sqt;->h(I)La/toy;

    .line 442
    .line 443
    .line 444
    move-result-object v68

    .line 445
    move/from16 v0, v21

    .line 446
    .line 447
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 448
    .line 449
    .line 450
    move-result-wide v69

    .line 451
    move/from16 v0, v22

    .line 452
    .line 453
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v71

    .line 457
    move/from16 v0, v23

    .line 458
    .line 459
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 460
    .line 461
    .line 462
    move-result-wide v2

    .line 463
    long-to-int v0, v2

    .line 464
    move/from16 v2, v24

    .line 465
    .line 466
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v73

    .line 470
    move/from16 v2, v25

    .line 471
    .line 472
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v74

    .line 476
    move/from16 v2, v26

    .line 477
    .line 478
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v75

    .line 482
    move/from16 v2, v27

    .line 483
    .line 484
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v76

    .line 488
    move/from16 v2, v28

    .line 489
    .line 490
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 491
    .line 492
    .line 493
    move-result-wide v2

    .line 494
    long-to-int v2, v2

    .line 495
    move/from16 v3, v29

    .line 496
    .line 497
    invoke-interface {v1, v3}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v78

    .line 501
    move/from16 v3, v30

    .line 502
    .line 503
    invoke-interface {v1, v3}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v79

    .line 507
    move/from16 v3, v31

    .line 508
    .line 509
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 510
    .line 511
    .line 512
    move-result-wide v80

    .line 513
    move/from16 v3, v32

    .line 514
    .line 515
    invoke-interface {v1, v3}, La/xpg0;->getDouble(I)D

    .line 516
    .line 517
    .line 518
    move-result-wide v82

    .line 519
    move/from16 v3, v33

    .line 520
    .line 521
    invoke-interface {v1, v3}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v84

    .line 525
    move/from16 v3, v34

    .line 526
    .line 527
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 528
    .line 529
    .line 530
    move-result-wide v3

    .line 531
    long-to-int v3, v3

    .line 532
    move/from16 v4, v35

    .line 533
    .line 534
    invoke-interface {v1, v4}, La/xpg0;->getLong(I)J

    .line 535
    .line 536
    .line 537
    move-result-wide v4

    .line 538
    long-to-int v4, v4

    .line 539
    move/from16 v5, v36

    .line 540
    .line 541
    invoke-interface {v1, v5}, La/xpg0;->getLong(I)J

    .line 542
    .line 543
    .line 544
    move-result-wide v5

    .line 545
    long-to-int v5, v5

    .line 546
    move/from16 v6, v37

    .line 547
    .line 548
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 549
    .line 550
    .line 551
    move-result-wide v6

    .line 552
    long-to-int v6, v6

    .line 553
    invoke-interface {v1, v15}, La/xpg0;->getLong(I)J

    .line 554
    .line 555
    .line 556
    move-result-wide v7

    .line 557
    long-to-int v7, v7

    .line 558
    new-instance v39, La/pu6;

    .line 559
    .line 560
    move/from16 v72, v0

    .line 561
    .line 562
    move/from16 v77, v2

    .line 563
    .line 564
    move/from16 v85, v3

    .line 565
    .line 566
    move/from16 v86, v4

    .line 567
    .line 568
    move/from16 v87, v5

    .line 569
    .line 570
    move/from16 v88, v6

    .line 571
    .line 572
    move/from16 v89, v7

    .line 573
    .line 574
    invoke-direct/range {v39 .. v89}, La/pu6;-><init>(JJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;DJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/toy;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;IIIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 575
    .line 576
    .line 577
    goto :goto_0

    .line 578
    :catchall_0
    move-exception v0

    .line 579
    goto :goto_1

    .line 580
    :cond_0
    const/16 v39, 0x0

    .line 581
    .line 582
    :goto_0
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 583
    .line 584
    .line 585
    return-object v39

    .line 586
    :goto_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 587
    .line 588
    .line 589
    throw v0
.end method
