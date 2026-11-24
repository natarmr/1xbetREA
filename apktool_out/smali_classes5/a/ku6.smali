.class public final La/ku6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:J

.field public final synthetic k:I

.field public final synthetic l:La/ou6;


# direct methods
.method public constructor <init>(JILa/ou6;La/yje;)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/ku6;->j:J

    .line 2
    .line 3
    iput p3, p0, La/ku6;->k:I

    .line 4
    .line 5
    iput-object p4, p0, La/ku6;->l:La/ou6;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/ku6;

    .line 2
    .line 3
    iget v3, p0, La/ku6;->k:I

    .line 4
    .line 5
    iget-object v4, p0, La/ku6;->l:La/ou6;

    .line 6
    .line 7
    iget-wide v1, p0, La/ku6;->j:J

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, La/ku6;-><init>(JILa/ou6;La/yje;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, La/ku6;->i:Ljava/lang/Object;

    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, La/ku6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ku6;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ku6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 94

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/ku6;->i:Ljava/lang/Object;

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
    const-string v2, "select * from bet_events where game_id = ? and coupon_type_vid != ? order by game_id"

    .line 13
    .line 14
    invoke-interface {v1, v2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :try_start_0
    iget-wide v2, v0, La/ku6;->j:J

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-interface {v1, v4, v2, v3}, La/xpg0;->o(IJ)V

    .line 22
    .line 23
    .line 24
    iget v2, v0, La/ku6;->k:I

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
    const-string v2, "id"

    .line 32
    .line 33
    invoke-static {v1, v2}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const-string v3, "game_id"

    .line 38
    .line 39
    invoke-static {v1, v3}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const-string v4, "main_game_id"

    .line 44
    .line 45
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const-string v5, "player_id"

    .line 50
    .line 51
    invoke-static {v1, v5}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    const-string v6, "sport_id"

    .line 56
    .line 57
    invoke-static {v1, v6}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    const-string v7, "player_name"

    .line 62
    .line 63
    invoke-static {v1, v7}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    const-string v8, "game_match_name"

    .line 68
    .line 69
    invoke-static {v1, v8}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    const-string v9, "first_opponent_first_img"

    .line 74
    .line 75
    invoke-static {v1, v9}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    const-string v10, "first_opponent_second_img"

    .line 80
    .line 81
    invoke-static {v1, v10}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    const-string v11, "second_opponent_first_img"

    .line 86
    .line 87
    invoke-static {v1, v11}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    const-string v12, "second_opponent_second_img"

    .line 92
    .line 93
    invoke-static {v1, v12}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    const-string v13, "group_name"

    .line 98
    .line 99
    invoke-static {v1, v13}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    const-string v14, "champ_name"

    .line 104
    .line 105
    invoke-static {v1, v14}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    const-string v15, "express_number"

    .line 110
    .line 111
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    const-string v0, "coefficient"

    .line 116
    .line 117
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    move/from16 p1, v0

    .line 122
    .line 123
    const-string v0, "param"

    .line 124
    .line 125
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    move/from16 v16, v0

    .line 130
    .line 131
    const-string v0, "time_start"

    .line 132
    .line 133
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    move/from16 v17, v0

    .line 138
    .line 139
    const-string v0, "vid"

    .line 140
    .line 141
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    move/from16 v18, v0

    .line 146
    .line 147
    const-string v0, "full_name"

    .line 148
    .line 149
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    move/from16 v19, v0

    .line 154
    .line 155
    const-string v0, "name"

    .line 156
    .line 157
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    move/from16 v20, v0

    .line 162
    .line 163
    const-string v0, "kind"

    .line 164
    .line 165
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    move/from16 v21, v0

    .line 170
    .line 171
    const-string v0, "type"

    .line 172
    .line 173
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    move/from16 v22, v0

    .line 178
    .line 179
    const-string v0, "players_duel_game"

    .line 180
    .line 181
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    move/from16 v23, v0

    .line 186
    .line 187
    const-string v0, "coupon_entry_feature_id"

    .line 188
    .line 189
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    move/from16 v24, v0

    .line 194
    .line 195
    const-string v0, "first_opponent_name"

    .line 196
    .line 197
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    move/from16 v25, v0

    .line 202
    .line 203
    const-string v0, "second_opponent_name"

    .line 204
    .line 205
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    move/from16 v26, v0

    .line 210
    .line 211
    const-string v0, "opponents_full_name"

    .line 212
    .line 213
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    move/from16 v27, v0

    .line 218
    .line 219
    const-string v0, "tournament_stage"

    .line 220
    .line 221
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    move/from16 v28, v0

    .line 226
    .line 227
    const-string v0, "teams_number"

    .line 228
    .line 229
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    move/from16 v29, v0

    .line 234
    .line 235
    const-string v0, "game_type"

    .line 236
    .line 237
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    move/from16 v30, v0

    .line 242
    .line 243
    const-string v0, "game_vid"

    .line 244
    .line 245
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    move/from16 v31, v0

    .line 250
    .line 251
    const-string v0, "group_id"

    .line 252
    .line 253
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    move/from16 v32, v0

    .line 258
    .line 259
    const-string v0, "option_lower_cf"

    .line 260
    .line 261
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    move/from16 v33, v0

    .line 266
    .line 267
    const-string v0, "option_lower_cf_view"

    .line 268
    .line 269
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    move/from16 v34, v0

    .line 274
    .line 275
    const-string v0, "coupon_type_vid"

    .line 276
    .line 277
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    move/from16 v35, v0

    .line 282
    .line 283
    const-string v0, "builder_game_type"

    .line 284
    .line 285
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    move/from16 v36, v0

    .line 290
    .line 291
    const-string v0, "builder_game_vid"

    .line 292
    .line 293
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    move/from16 v37, v0

    .line 298
    .line 299
    const-string v0, "builder_period"

    .line 300
    .line 301
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    move/from16 v38, v0

    .line 306
    .line 307
    const-string v0, "builder_coef_available"

    .line 308
    .line 309
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    move/from16 v39, v0

    .line 314
    .line 315
    new-instance v0, Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 318
    .line 319
    .line 320
    :goto_0
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 321
    .line 322
    .line 323
    move-result v40

    .line 324
    if-eqz v40, :cond_0

    .line 325
    .line 326
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 327
    .line 328
    .line 329
    move-result-wide v42

    .line 330
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 331
    .line 332
    .line 333
    move-result-wide v44

    .line 334
    invoke-interface {v1, v4}, La/xpg0;->getLong(I)J

    .line 335
    .line 336
    .line 337
    move-result-wide v46

    .line 338
    invoke-interface {v1, v5}, La/xpg0;->getLong(I)J

    .line 339
    .line 340
    .line 341
    move-result-wide v48

    .line 342
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 343
    .line 344
    .line 345
    move-result-wide v50

    .line 346
    invoke-interface {v1, v7}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v52

    .line 350
    invoke-interface {v1, v8}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v53

    .line 354
    invoke-interface {v1, v9}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v54

    .line 358
    invoke-interface {v1, v10}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v55

    .line 362
    invoke-interface {v1, v11}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v56

    .line 366
    invoke-interface {v1, v12}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v57

    .line 370
    invoke-interface {v1, v13}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v58

    .line 374
    invoke-interface {v1, v14}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v59

    .line 378
    invoke-interface {v1, v15}, La/xpg0;->getLong(I)J

    .line 379
    .line 380
    .line 381
    move-result-wide v60

    .line 382
    move/from16 v40, v2

    .line 383
    .line 384
    move/from16 v2, p1

    .line 385
    .line 386
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v62

    .line 390
    move/from16 p1, v2

    .line 391
    .line 392
    move/from16 v2, v16

    .line 393
    .line 394
    invoke-interface {v1, v2}, La/xpg0;->getDouble(I)D

    .line 395
    .line 396
    .line 397
    move-result-wide v63

    .line 398
    move/from16 v16, v2

    .line 399
    .line 400
    move/from16 v2, v17

    .line 401
    .line 402
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 403
    .line 404
    .line 405
    move-result-wide v65

    .line 406
    move/from16 v17, v2

    .line 407
    .line 408
    move/from16 v2, v18

    .line 409
    .line 410
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v67

    .line 414
    move/from16 v18, v2

    .line 415
    .line 416
    move/from16 v2, v19

    .line 417
    .line 418
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v68

    .line 422
    move/from16 v19, v2

    .line 423
    .line 424
    move/from16 v2, v20

    .line 425
    .line 426
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v69

    .line 430
    move/from16 v20, v2

    .line 431
    .line 432
    move/from16 v92, v4

    .line 433
    .line 434
    move/from16 v2, v21

    .line 435
    .line 436
    move/from16 v21, v3

    .line 437
    .line 438
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 439
    .line 440
    .line 441
    move-result-wide v3

    .line 442
    long-to-int v3, v3

    .line 443
    move-object/from16 v4, p0

    .line 444
    .line 445
    move/from16 v93, v2

    .line 446
    .line 447
    iget-object v2, v4, La/ku6;->l:La/ou6;

    .line 448
    .line 449
    iget-object v2, v2, La/ou6;->b:La/art;

    .line 450
    .line 451
    sget-object v2, La/toy;->b:La/sqt;

    .line 452
    .line 453
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    invoke-static {v3}, La/sqt;->h(I)La/toy;

    .line 457
    .line 458
    .line 459
    move-result-object v70

    .line 460
    move/from16 v2, v22

    .line 461
    .line 462
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 463
    .line 464
    .line 465
    move-result-wide v71

    .line 466
    move/from16 v3, v23

    .line 467
    .line 468
    invoke-interface {v1, v3}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v73

    .line 472
    move/from16 v22, v2

    .line 473
    .line 474
    move/from16 v23, v3

    .line 475
    .line 476
    move/from16 v2, v24

    .line 477
    .line 478
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 479
    .line 480
    .line 481
    move-result-wide v3

    .line 482
    long-to-int v3, v3

    .line 483
    move/from16 v4, v25

    .line 484
    .line 485
    invoke-interface {v1, v4}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v75

    .line 489
    move/from16 v24, v2

    .line 490
    .line 491
    move/from16 v2, v26

    .line 492
    .line 493
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v76

    .line 497
    move/from16 v26, v2

    .line 498
    .line 499
    move/from16 v2, v27

    .line 500
    .line 501
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v77

    .line 505
    move/from16 v27, v2

    .line 506
    .line 507
    move/from16 v2, v28

    .line 508
    .line 509
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v78

    .line 513
    move/from16 v28, v2

    .line 514
    .line 515
    move/from16 v74, v3

    .line 516
    .line 517
    move/from16 v25, v4

    .line 518
    .line 519
    move/from16 v2, v29

    .line 520
    .line 521
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 522
    .line 523
    .line 524
    move-result-wide v3

    .line 525
    long-to-int v3, v3

    .line 526
    move/from16 v4, v30

    .line 527
    .line 528
    invoke-interface {v1, v4}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v80

    .line 532
    move/from16 v29, v2

    .line 533
    .line 534
    move/from16 v2, v31

    .line 535
    .line 536
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v81

    .line 540
    move/from16 v31, v2

    .line 541
    .line 542
    move/from16 v2, v32

    .line 543
    .line 544
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 545
    .line 546
    .line 547
    move-result-wide v82

    .line 548
    move/from16 v32, v2

    .line 549
    .line 550
    move/from16 v2, v33

    .line 551
    .line 552
    invoke-interface {v1, v2}, La/xpg0;->getDouble(I)D

    .line 553
    .line 554
    .line 555
    move-result-wide v84

    .line 556
    move/from16 v33, v2

    .line 557
    .line 558
    move/from16 v2, v34

    .line 559
    .line 560
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v86

    .line 564
    move/from16 v34, v2

    .line 565
    .line 566
    move/from16 v79, v3

    .line 567
    .line 568
    move/from16 v30, v4

    .line 569
    .line 570
    move/from16 v2, v35

    .line 571
    .line 572
    invoke-interface {v1, v2}, La/xpg0;->getLong(I)J

    .line 573
    .line 574
    .line 575
    move-result-wide v3

    .line 576
    long-to-int v3, v3

    .line 577
    move/from16 v35, v2

    .line 578
    .line 579
    move/from16 v87, v3

    .line 580
    .line 581
    move/from16 v4, v36

    .line 582
    .line 583
    invoke-interface {v1, v4}, La/xpg0;->getLong(I)J

    .line 584
    .line 585
    .line 586
    move-result-wide v2

    .line 587
    long-to-int v2, v2

    .line 588
    move/from16 v36, v5

    .line 589
    .line 590
    move/from16 v3, v37

    .line 591
    .line 592
    move/from16 v37, v4

    .line 593
    .line 594
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 595
    .line 596
    .line 597
    move-result-wide v4

    .line 598
    long-to-int v4, v4

    .line 599
    move/from16 v88, v2

    .line 600
    .line 601
    move/from16 v5, v38

    .line 602
    .line 603
    move/from16 v38, v3

    .line 604
    .line 605
    invoke-interface {v1, v5}, La/xpg0;->getLong(I)J

    .line 606
    .line 607
    .line 608
    move-result-wide v2

    .line 609
    long-to-int v2, v2

    .line 610
    move/from16 v89, v4

    .line 611
    .line 612
    move/from16 v3, v39

    .line 613
    .line 614
    move/from16 v39, v5

    .line 615
    .line 616
    invoke-interface {v1, v3}, La/xpg0;->getLong(I)J

    .line 617
    .line 618
    .line 619
    move-result-wide v4

    .line 620
    long-to-int v4, v4

    .line 621
    new-instance v41, La/pu6;

    .line 622
    .line 623
    move/from16 v90, v2

    .line 624
    .line 625
    move/from16 v91, v4

    .line 626
    .line 627
    invoke-direct/range {v41 .. v91}, La/pu6;-><init>(JJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;DJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/toy;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;IIIII)V

    .line 628
    .line 629
    .line 630
    move-object/from16 v2, v41

    .line 631
    .line 632
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 633
    .line 634
    .line 635
    move/from16 v5, v36

    .line 636
    .line 637
    move/from16 v36, v37

    .line 638
    .line 639
    move/from16 v37, v38

    .line 640
    .line 641
    move/from16 v38, v39

    .line 642
    .line 643
    move/from16 v2, v40

    .line 644
    .line 645
    move/from16 v4, v92

    .line 646
    .line 647
    move/from16 v39, v3

    .line 648
    .line 649
    move/from16 v3, v21

    .line 650
    .line 651
    move/from16 v21, v93

    .line 652
    .line 653
    goto/16 :goto_0

    .line 654
    .line 655
    :catchall_0
    move-exception v0

    .line 656
    goto :goto_1

    .line 657
    :cond_0
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 658
    .line 659
    .line 660
    return-object v0

    .line 661
    :goto_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 662
    .line 663
    .line 664
    throw v0
.end method
