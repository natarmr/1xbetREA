.class public final synthetic La/wal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gv1;


# direct methods
.method public synthetic constructor <init>(La/gv1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wal;->a:B

    iput-object p1, p0, La/wal;->b:La/gv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 52

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/fee;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/jlr;

    .line 13
    .line 14
    instance-of v1, v0, La/xkr;

    .line 15
    .line 16
    if-eqz v1, :cond_88

    .line 17
    .line 18
    check-cast v0, La/xkr;

    .line 19
    .line 20
    iget-object v3, v0, La/xkr;->d:La/m9s;

    .line 21
    .line 22
    move-object/from16 v0, p0

    .line 23
    .line 24
    iget-object v0, v0, La/wal;->b:La/gv1;

    .line 25
    .line 26
    iget-object v1, v0, La/gv1;->d:La/n0o0;

    .line 27
    .line 28
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/fee;

    .line 33
    .line 34
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    move-object v7, v1

    .line 39
    check-cast v7, La/x9l;

    .line 40
    .line 41
    iget-object v1, v0, La/gv1;->q:La/n0o0;

    .line 42
    .line 43
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, La/fee;

    .line 48
    .line 49
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    move-object v8, v1

    .line 54
    check-cast v8, La/z6l;

    .line 55
    .line 56
    iget-object v4, v0, La/gv1;->b:La/ctf0;

    .line 57
    .line 58
    iget-object v1, v0, La/gv1;->p:La/n0o0;

    .line 59
    .line 60
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, La/fee;

    .line 65
    .line 66
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/util/List;

    .line 71
    .line 72
    iget-object v2, v0, La/gv1;->k:La/n0o0;

    .line 73
    .line 74
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, La/fee;

    .line 79
    .line 80
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    move-object v5, v2

    .line 85
    check-cast v5, La/yws;

    .line 86
    .line 87
    iget-object v0, v0, La/gv1;->B:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, La/f9l;

    .line 90
    .line 91
    iget-boolean v15, v0, La/f9l;->z:Z

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v0, v3, La/m9s;->n:Ljava/util/List;

    .line 97
    .line 98
    iget-object v2, v3, La/m9s;->m:Ljava/util/List;

    .line 99
    .line 100
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    if-nez v7, :cond_0

    .line 110
    .line 111
    sget-object v0, La/lak0;->c:La/lak0;

    .line 112
    .line 113
    return-object v0

    .line 114
    :cond_0
    move-object v6, v2

    .line 115
    iget-object v2, v7, La/x9l;->a:La/c5l;

    .line 116
    .line 117
    iget-object v9, v2, La/c5l;->c:La/y9l;

    .line 118
    .line 119
    iget-object v10, v2, La/c5l;->b:La/y9l;

    .line 120
    .line 121
    move-object/from16 v23, v1

    .line 122
    .line 123
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    if-eqz v5, :cond_2

    .line 128
    .line 129
    iget-boolean v11, v5, La/yws;->c:Z

    .line 130
    .line 131
    if-nez v11, :cond_1

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_1
    new-instance v11, La/kxs;

    .line 135
    .line 136
    invoke-direct {v11}, La/kxs;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v11}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    :cond_2
    :goto_0
    new-instance v11, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-interface/range {v23 .. v23}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    :cond_3
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-eqz v13, :cond_4

    .line 156
    .line 157
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    move-object v14, v13

    .line 162
    check-cast v14, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 163
    .line 164
    iget-boolean v14, v14, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->c:Z

    .line 165
    .line 166
    if-eqz v14, :cond_3

    .line 167
    .line 168
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_4
    new-instance v12, La/e3l;

    .line 173
    .line 174
    const/16 v13, 0xa

    .line 175
    .line 176
    invoke-direct {v12, v13}, La/e3l;-><init>(B)V

    .line 177
    .line 178
    .line 179
    invoke-static {v11, v12}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    new-instance v12, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    if-eqz v14, :cond_8

    .line 197
    .line 198
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v14

    .line 202
    check-cast v14, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 203
    .line 204
    sget-object v16, La/e9l;->f:La/c0o;

    .line 205
    .line 206
    invoke-virtual/range {v16 .. v16}, La/b3;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v16

    .line 210
    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v17

    .line 214
    if-eqz v17, :cond_6

    .line 215
    .line 216
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v17

    .line 220
    const/16 p1, 0x0

    .line 221
    .line 222
    move-object/from16 v13, v17

    .line 223
    .line 224
    check-cast v13, La/e9l;

    .line 225
    .line 226
    iget-object v13, v13, La/e9l;->a:La/t9m0;

    .line 227
    .line 228
    move-object/from16 v24, v0

    .line 229
    .line 230
    iget-object v0, v14, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->a:La/t9m0;

    .line 231
    .line 232
    if-ne v13, v0, :cond_5

    .line 233
    .line 234
    move-object/from16 v13, v17

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_5
    move-object/from16 v0, v24

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_6
    move-object/from16 v24, v0

    .line 241
    .line 242
    const/16 p1, 0x0

    .line 243
    .line 244
    move-object/from16 v13, p1

    .line 245
    .line 246
    :goto_4
    check-cast v13, La/e9l;

    .line 247
    .line 248
    if-eqz v13, :cond_7

    .line 249
    .line 250
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    :cond_7
    move-object/from16 v0, v24

    .line 254
    .line 255
    const/16 v13, 0xa

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_8
    move-object/from16 v24, v0

    .line 259
    .line 260
    const/16 p1, 0x0

    .line 261
    .line 262
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v11

    .line 270
    if-eqz v11, :cond_84

    .line 271
    .line 272
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v11

    .line 276
    check-cast v11, La/e9l;

    .line 277
    .line 278
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    const-string v13, "playerlogo/"

    .line 283
    .line 284
    const-string v21, "%s/%s"

    .line 285
    .line 286
    const-string v22, "%s/playerlogo/%s"

    .line 287
    .line 288
    const-string v12, ""

    .line 289
    .line 290
    packed-switch v11, :pswitch_data_0

    .line 291
    .line 292
    .line 293
    invoke-static {}, La/t9f;->b()V

    .line 294
    .line 295
    .line 296
    return-object p1

    .line 297
    :pswitch_0
    iget-object v11, v7, La/x9l;->d:La/ljg;

    .line 298
    .line 299
    iget-wide v12, v8, La/z6l;->f:J

    .line 300
    .line 301
    iget-boolean v14, v8, La/z6l;->g:Z

    .line 302
    .line 303
    invoke-static {v11, v3}, La/x2x;->b0(La/ljg;La/m9s;)Z

    .line 304
    .line 305
    .line 306
    move-result v16

    .line 307
    if-eqz v16, :cond_9

    .line 308
    .line 309
    move-object/from16 v35, v0

    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_9
    move-object/from16 v35, v0

    .line 313
    .line 314
    sget-object v0, La/n2z;->a:Ljava/util/List;

    .line 315
    .line 316
    invoke-static {v11, v0}, La/n2z;->a(La/ljg;Ljava/util/List;)Ljava/util/ArrayList;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-static {v12, v13, v0}, La/n2z;->d(JLjava/util/ArrayList;)La/l2z;

    .line 321
    .line 322
    .line 323
    move-result-object v29

    .line 324
    if-nez v29, :cond_a

    .line 325
    .line 326
    :goto_6
    move-object/from16 p0, v5

    .line 327
    .line 328
    move-object/from16 v28, v6

    .line 329
    .line 330
    move-object/from16 v36, v10

    .line 331
    .line 332
    const/16 v6, 0xa

    .line 333
    .line 334
    move-object v10, v4

    .line 335
    move-object v4, v9

    .line 336
    goto :goto_7

    .line 337
    :cond_a
    sget-wide v31, La/kkg;->m:J

    .line 338
    .line 339
    const/4 v12, 0x0

    .line 340
    new-array v13, v12, [Ljava/lang/Object;

    .line 341
    .line 342
    move-object/from16 v30, v0

    .line 343
    .line 344
    iget-object v0, v4, La/ctf0;->b:La/lsm0;

    .line 345
    .line 346
    invoke-static {v13, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v12

    .line 350
    const v13, 0x7f1309aa

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v13, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v33

    .line 357
    invoke-virtual {v4}, La/ctf0;->j()Z

    .line 358
    .line 359
    .line 360
    move-result v34

    .line 361
    const-string v28, "LAST_MATCHES_TABS"

    .line 362
    .line 363
    move-object/from16 v27, v11

    .line 364
    .line 365
    invoke-static/range {v27 .. v34}, La/q5x;->C(La/ljg;Ljava/lang/String;La/l2z;Ljava/util/ArrayList;JLjava/lang/String;Z)La/boo0;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    new-instance v11, La/psv;

    .line 370
    .line 371
    const-string v12, "LAST_MATCHES_HEADER"

    .line 372
    .line 373
    const v13, 0x7f130abc

    .line 374
    .line 375
    .line 376
    invoke-direct {v11, v12, v13}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 377
    .line 378
    .line 379
    const/4 v13, 0x0

    .line 380
    move-object v12, v11

    .line 381
    move v11, v14

    .line 382
    const/4 v14, 0x0

    .line 383
    move-object/from16 p0, v5

    .line 384
    .line 385
    move-object/from16 v28, v6

    .line 386
    .line 387
    move-object/from16 v36, v10

    .line 388
    .line 389
    move-object v5, v12

    .line 390
    move-object/from16 v10, v29

    .line 391
    .line 392
    const/16 v6, 0xa

    .line 393
    .line 394
    move-object v12, v4

    .line 395
    move-object v4, v9

    .line 396
    move-object/from16 v9, v27

    .line 397
    .line 398
    invoke-static/range {v9 .. v15}, La/n2z;->c(La/ljg;La/l2z;ZLa/ctf0;ZZZ)La/m2z;

    .line 399
    .line 400
    .line 401
    move-result-object v9

    .line 402
    move-object v10, v12

    .line 403
    invoke-virtual {v1, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    :goto_7
    move-object/from16 v26, v2

    .line 413
    .line 414
    move-object v11, v4

    .line 415
    move v9, v6

    .line 416
    move-object/from16 v34, v7

    .line 417
    .line 418
    move-object/from16 v20, v8

    .line 419
    .line 420
    move-object v4, v10

    .line 421
    move/from16 v30, v15

    .line 422
    .line 423
    move-object/from16 v7, v23

    .line 424
    .line 425
    :goto_8
    move-object/from16 v10, p0

    .line 426
    .line 427
    goto/16 :goto_61

    .line 428
    .line 429
    :pswitch_1
    move-object/from16 v35, v0

    .line 430
    .line 431
    move-object/from16 p0, v5

    .line 432
    .line 433
    move-object/from16 v28, v6

    .line 434
    .line 435
    move-object/from16 v36, v10

    .line 436
    .line 437
    const/16 v6, 0xa

    .line 438
    .line 439
    move-object v10, v4

    .line 440
    move-object v4, v9

    .line 441
    iget-object v0, v7, La/x9l;->c:La/ic6;

    .line 442
    .line 443
    sget-object v5, La/dng;->a:Ljava/util/List;

    .line 444
    .line 445
    iget-object v9, v8, La/z6l;->d:Ljava/util/List;

    .line 446
    .line 447
    iget-wide v11, v8, La/z6l;->e:J

    .line 448
    .line 449
    invoke-virtual {v10}, La/ctf0;->j()Z

    .line 450
    .line 451
    .line 452
    move-result v13

    .line 453
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    invoke-static {v0}, La/bkb;->R(La/ic6;)Z

    .line 460
    .line 461
    .line 462
    move-result v14

    .line 463
    iget-object v6, v0, La/ic6;->b:La/fc6;

    .line 464
    .line 465
    move-object/from16 v21, v5

    .line 466
    .line 467
    iget-object v5, v6, La/fc6;->b:Ljava/util/ArrayList;

    .line 468
    .line 469
    iget-object v0, v0, La/ic6;->a:La/fc6;

    .line 470
    .line 471
    move-object/from16 v22, v5

    .line 472
    .line 473
    iget-object v5, v0, La/fc6;->b:Ljava/util/ArrayList;

    .line 474
    .line 475
    if-eqz v14, :cond_b

    .line 476
    .line 477
    goto/16 :goto_c

    .line 478
    .line 479
    :cond_b
    new-instance v14, Ljava/util/ArrayList;

    .line 480
    .line 481
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 482
    .line 483
    .line 484
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 485
    .line 486
    .line 487
    move-result-object v21

    .line 488
    :goto_9
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    .line 489
    .line 490
    .line 491
    move-result v25

    .line 492
    if-eqz v25, :cond_f

    .line 493
    .line 494
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v25

    .line 498
    move-object/from16 v30, v5

    .line 499
    .line 500
    move-object/from16 v5, v25

    .line 501
    .line 502
    check-cast v5, La/r2g;

    .line 503
    .line 504
    if-eqz v5, :cond_e

    .line 505
    .line 506
    move-wide/from16 v31, v11

    .line 507
    .line 508
    instance-of v11, v5, La/p2g;

    .line 509
    .line 510
    if-eqz v11, :cond_c

    .line 511
    .line 512
    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayList;->isEmpty()Z

    .line 513
    .line 514
    .line 515
    move-result v11

    .line 516
    if-nez v11, :cond_d

    .line 517
    .line 518
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    goto :goto_a

    .line 522
    :cond_c
    instance-of v11, v5, La/q2g;

    .line 523
    .line 524
    if-eqz v11, :cond_e

    .line 525
    .line 526
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->isEmpty()Z

    .line 527
    .line 528
    .line 529
    move-result v11

    .line 530
    if-nez v11, :cond_d

    .line 531
    .line 532
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    :cond_d
    :goto_a
    move-object/from16 v5, v30

    .line 536
    .line 537
    move-wide/from16 v11, v31

    .line 538
    .line 539
    goto :goto_9

    .line 540
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 541
    .line 542
    .line 543
    return-object p1

    .line 544
    :cond_f
    move-object/from16 v30, v5

    .line 545
    .line 546
    move-wide/from16 v31, v11

    .line 547
    .line 548
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 549
    .line 550
    .line 551
    move-result-object v5

    .line 552
    :cond_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 553
    .line 554
    .line 555
    move-result v11

    .line 556
    if-eqz v11, :cond_11

    .line 557
    .line 558
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v11

    .line 562
    move-object v12, v11

    .line 563
    check-cast v12, La/r2g;

    .line 564
    .line 565
    iget-byte v12, v12, La/r2g;->a:B

    .line 566
    .line 567
    move-object/from16 v21, v11

    .line 568
    .line 569
    int-to-long v11, v12

    .line 570
    cmp-long v11, v11, v31

    .line 571
    .line 572
    if-nez v11, :cond_10

    .line 573
    .line 574
    goto :goto_b

    .line 575
    :cond_11
    move-object/from16 v21, p1

    .line 576
    .line 577
    :goto_b
    check-cast v21, La/r2g;

    .line 578
    .line 579
    if-nez v21, :cond_12

    .line 580
    .line 581
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v5

    .line 585
    move-object/from16 v21, v5

    .line 586
    .line 587
    check-cast v21, La/r2g;

    .line 588
    .line 589
    :cond_12
    move-object/from16 v5, v21

    .line 590
    .line 591
    if-nez v5, :cond_13

    .line 592
    .line 593
    :goto_c
    move-object/from16 v32, v3

    .line 594
    .line 595
    move-object/from16 v31, v4

    .line 596
    .line 597
    move/from16 v22, v15

    .line 598
    .line 599
    goto/16 :goto_1a

    .line 600
    .line 601
    :cond_13
    instance-of v11, v5, La/p2g;

    .line 602
    .line 603
    if-eqz v11, :cond_14

    .line 604
    .line 605
    goto :goto_d

    .line 606
    :cond_14
    move-object/from16 v30, v22

    .line 607
    .line 608
    :goto_d
    new-instance v11, La/psv;

    .line 609
    .line 610
    const-string v12, "BEST_HEROES_HEADER"

    .line 611
    .line 612
    move/from16 v21, v13

    .line 613
    .line 614
    const v13, 0x7f130227

    .line 615
    .line 616
    .line 617
    invoke-direct {v11, v12, v13}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v1, v11}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    sget-wide v11, La/kkg;->m:J

    .line 624
    .line 625
    new-instance v13, Ljava/util/ArrayList;

    .line 626
    .line 627
    move-object/from16 v31, v4

    .line 628
    .line 629
    move/from16 v22, v15

    .line 630
    .line 631
    const/16 v15, 0xa

    .line 632
    .line 633
    invoke-static {v14, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 634
    .line 635
    .line 636
    move-result v4

    .line 637
    invoke-direct {v13, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 641
    .line 642
    .line 643
    move-result-object v4

    .line 644
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 645
    .line 646
    .line 647
    move-result v14

    .line 648
    if-eqz v14, :cond_18

    .line 649
    .line 650
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v14

    .line 654
    check-cast v14, La/r2g;

    .line 655
    .line 656
    new-instance v37, La/lxl;

    .line 657
    .line 658
    iget-byte v15, v14, La/r2g;->a:B

    .line 659
    .line 660
    move-object/from16 v32, v3

    .line 661
    .line 662
    move-object/from16 v25, v4

    .line 663
    .line 664
    int-to-long v3, v15

    .line 665
    new-instance v15, La/xxl;

    .line 666
    .line 667
    move-wide/from16 v38, v3

    .line 668
    .line 669
    instance-of v3, v14, La/p2g;

    .line 670
    .line 671
    if-eqz v3, :cond_15

    .line 672
    .line 673
    iget-object v3, v0, La/fc6;->a:Ljava/lang/String;

    .line 674
    .line 675
    goto :goto_f

    .line 676
    :cond_15
    instance-of v3, v14, La/q2g;

    .line 677
    .line 678
    if-eqz v3, :cond_17

    .line 679
    .line 680
    iget-object v3, v6, La/fc6;->a:Ljava/lang/String;

    .line 681
    .line 682
    :goto_f
    invoke-direct {v15, v3}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    iget-byte v3, v14, La/r2g;->a:B

    .line 686
    .line 687
    int-to-long v3, v3

    .line 688
    iget-byte v14, v5, La/r2g;->a:B

    .line 689
    .line 690
    move-wide/from16 v33, v3

    .line 691
    .line 692
    int-to-long v3, v14

    .line 693
    cmp-long v3, v33, v3

    .line 694
    .line 695
    if-nez v3, :cond_16

    .line 696
    .line 697
    sget-object v3, La/uxl;->b:La/uxl;

    .line 698
    .line 699
    :goto_10
    move-object/from16 v42, v3

    .line 700
    .line 701
    goto :goto_11

    .line 702
    :cond_16
    sget-object v3, La/uxl;->a:La/uxl;

    .line 703
    .line 704
    goto :goto_10

    .line 705
    :goto_11
    const/16 v43, 0x0

    .line 706
    .line 707
    const/16 v44, 0x6c

    .line 708
    .line 709
    const/16 v41, 0x0

    .line 710
    .line 711
    move-object/from16 v40, v15

    .line 712
    .line 713
    invoke-direct/range {v37 .. v44}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 714
    .line 715
    .line 716
    move-object/from16 v3, v37

    .line 717
    .line 718
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-object/from16 v4, v25

    .line 722
    .line 723
    move-object/from16 v3, v32

    .line 724
    .line 725
    goto :goto_e

    .line 726
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 727
    .line 728
    .line 729
    return-object p1

    .line 730
    :cond_18
    move-object/from16 v32, v3

    .line 731
    .line 732
    invoke-static {v13}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 733
    .line 734
    .line 735
    move-result-object v38

    .line 736
    new-instance v0, La/boo0;

    .line 737
    .line 738
    new-instance v37, La/fyl;

    .line 739
    .line 740
    invoke-static/range {v21 .. v21}, La/xfn;->b(Z)La/wfn;

    .line 741
    .line 742
    .line 743
    move-result-object v3

    .line 744
    iget v3, v3, La/wfn;->e:F

    .line 745
    .line 746
    const/4 v4, 0x2

    .line 747
    const/4 v5, 0x0

    .line 748
    invoke-static {v3, v5, v4}, La/s5x0;->t(FFI)La/lh80;

    .line 749
    .line 750
    .line 751
    move-result-object v41

    .line 752
    new-instance v3, La/jyl;

    .line 753
    .line 754
    new-instance v4, La/y3d;

    .line 755
    .line 756
    invoke-direct {v4, v11, v12}, La/y3d;-><init>(J)V

    .line 757
    .line 758
    .line 759
    move-object/from16 v6, p1

    .line 760
    .line 761
    const/16 v5, 0x7e

    .line 762
    .line 763
    invoke-direct {v3, v4, v6, v6, v5}, La/jyl;-><init>(La/y3d;La/y3d;La/y3d;I)V

    .line 764
    .line 765
    .line 766
    const/16 v43, 0x6

    .line 767
    .line 768
    const/16 v39, 0x0

    .line 769
    .line 770
    const/16 v40, 0x0

    .line 771
    .line 772
    move-object/from16 v42, v3

    .line 773
    .line 774
    invoke-direct/range {v37 .. v43}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 775
    .line 776
    .line 777
    move-object/from16 v3, v37

    .line 778
    .line 779
    sget-object v4, La/pno0;->a:La/pno0;

    .line 780
    .line 781
    const-string v5, "BEST_HEROES_TABS"

    .line 782
    .line 783
    invoke-direct {v0, v5, v3, v4}, La/boo0;-><init>(Ljava/lang/String;La/fyl;La/pno0;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    new-instance v0, Ljava/util/ArrayList;

    .line 790
    .line 791
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 792
    .line 793
    .line 794
    invoke-interface/range {v30 .. v30}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 795
    .line 796
    .line 797
    move-result-object v3

    .line 798
    :cond_19
    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 799
    .line 800
    .line 801
    move-result v4

    .line 802
    if-eqz v4, :cond_1a

    .line 803
    .line 804
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v4

    .line 808
    move-object v5, v4

    .line 809
    check-cast v5, La/bc6;

    .line 810
    .line 811
    iget-object v5, v5, La/bc6;->f:Ljava/util/ArrayList;

    .line 812
    .line 813
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 814
    .line 815
    .line 816
    move-result v5

    .line 817
    if-nez v5, :cond_19

    .line 818
    .line 819
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    goto :goto_12

    .line 823
    :cond_1a
    const/4 v4, 0x5

    .line 824
    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    new-instance v3, Ljava/util/ArrayList;

    .line 829
    .line 830
    const/16 v15, 0xa

    .line 831
    .line 832
    invoke-static {v0, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 833
    .line 834
    .line 835
    move-result v4

    .line 836
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 837
    .line 838
    .line 839
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    const/4 v4, 0x0

    .line 844
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 845
    .line 846
    .line 847
    move-result v5

    .line 848
    if-eqz v5, :cond_24

    .line 849
    .line 850
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v5

    .line 854
    add-int/lit8 v6, v4, 0x1

    .line 855
    .line 856
    if-ltz v4, :cond_23

    .line 857
    .line 858
    check-cast v5, La/bc6;

    .line 859
    .line 860
    iget-object v11, v5, La/bc6;->a:Ljava/lang/String;

    .line 861
    .line 862
    invoke-interface {v9, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    move-result v44

    .line 866
    if-nez v4, :cond_1b

    .line 867
    .line 868
    const/16 v47, 0x1

    .line 869
    .line 870
    goto :goto_14

    .line 871
    :cond_1b
    const/16 v47, 0x0

    .line 872
    .line 873
    :goto_14
    iget-object v11, v5, La/bc6;->a:Ljava/lang/String;

    .line 874
    .line 875
    new-instance v12, Ljava/lang/StringBuilder;

    .line 876
    .line 877
    const-string v13, "BEST_HEROES"

    .line 878
    .line 879
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 886
    .line 887
    .line 888
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v38

    .line 892
    sget-object v39, La/wb6;->a:La/wb6;

    .line 893
    .line 894
    iget-object v4, v5, La/bc6;->a:Ljava/lang/String;

    .line 895
    .line 896
    iget-object v11, v5, La/bc6;->c:Ljava/lang/String;

    .line 897
    .line 898
    iget-object v12, v5, La/bc6;->b:Ljava/lang/String;

    .line 899
    .line 900
    iget v13, v5, La/bc6;->e:I

    .line 901
    .line 902
    const/4 v14, 0x1

    .line 903
    if-eq v13, v14, :cond_20

    .line 904
    .line 905
    const/4 v14, 0x2

    .line 906
    if-eq v13, v14, :cond_1f

    .line 907
    .line 908
    const/4 v14, 0x3

    .line 909
    if-eq v13, v14, :cond_1e

    .line 910
    .line 911
    const/4 v14, 0x4

    .line 912
    if-eq v13, v14, :cond_1d

    .line 913
    .line 914
    const/4 v14, 0x5

    .line 915
    if-eq v13, v14, :cond_1c

    .line 916
    .line 917
    sget-object v13, La/dc6;->a:La/dc6;

    .line 918
    .line 919
    :goto_15
    move-object/from16 v45, v13

    .line 920
    .line 921
    goto :goto_16

    .line 922
    :cond_1c
    new-instance v13, La/cc6;

    .line 923
    .line 924
    const v14, 0x7f0804a2

    .line 925
    .line 926
    .line 927
    invoke-direct {v13, v14}, La/cc6;-><init>(I)V

    .line 928
    .line 929
    .line 930
    goto :goto_15

    .line 931
    :cond_1d
    new-instance v13, La/cc6;

    .line 932
    .line 933
    const v14, 0x7f0804a3

    .line 934
    .line 935
    .line 936
    invoke-direct {v13, v14}, La/cc6;-><init>(I)V

    .line 937
    .line 938
    .line 939
    goto :goto_15

    .line 940
    :cond_1e
    new-instance v13, La/cc6;

    .line 941
    .line 942
    const v14, 0x7f0804b7

    .line 943
    .line 944
    .line 945
    invoke-direct {v13, v14}, La/cc6;-><init>(I)V

    .line 946
    .line 947
    .line 948
    goto :goto_15

    .line 949
    :cond_1f
    new-instance v13, La/cc6;

    .line 950
    .line 951
    const v14, 0x7f0804ae

    .line 952
    .line 953
    .line 954
    invoke-direct {v13, v14}, La/cc6;-><init>(I)V

    .line 955
    .line 956
    .line 957
    goto :goto_15

    .line 958
    :cond_20
    new-instance v13, La/cc6;

    .line 959
    .line 960
    const v14, 0x7f0804a1

    .line 961
    .line 962
    .line 963
    invoke-direct {v13, v14}, La/cc6;-><init>(I)V

    .line 964
    .line 965
    .line 966
    goto :goto_15

    .line 967
    :goto_16
    if-eqz v44, :cond_21

    .line 968
    .line 969
    const v13, 0x7f08081e

    .line 970
    .line 971
    .line 972
    :goto_17
    move/from16 v46, v13

    .line 973
    .line 974
    goto :goto_18

    .line 975
    :cond_21
    const v13, 0x7f080815

    .line 976
    .line 977
    .line 978
    goto :goto_17

    .line 979
    :goto_18
    iget-object v5, v5, La/bc6;->f:Ljava/util/ArrayList;

    .line 980
    .line 981
    const/4 v14, 0x3

    .line 982
    invoke-static {v5, v14}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 983
    .line 984
    .line 985
    move-result-object v5

    .line 986
    new-instance v13, Ljava/util/ArrayList;

    .line 987
    .line 988
    const/16 v15, 0xa

    .line 989
    .line 990
    invoke-static {v5, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 991
    .line 992
    .line 993
    move-result v14

    .line 994
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 995
    .line 996
    .line 997
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 998
    .line 999
    .line 1000
    move-result-object v5

    .line 1001
    :goto_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1002
    .line 1003
    .line 1004
    move-result v14

    .line 1005
    if-eqz v14, :cond_22

    .line 1006
    .line 1007
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v14

    .line 1011
    check-cast v14, La/xb6;

    .line 1012
    .line 1013
    invoke-static {v14}, La/j47;->E0(La/xb6;)La/zb6;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v14

    .line 1017
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1018
    .line 1019
    .line 1020
    goto :goto_19

    .line 1021
    :cond_22
    invoke-static {v13}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v43

    .line 1025
    new-instance v37, La/gc6;

    .line 1026
    .line 1027
    move-object/from16 v40, v4

    .line 1028
    .line 1029
    move-object/from16 v41, v11

    .line 1030
    .line 1031
    move-object/from16 v42, v12

    .line 1032
    .line 1033
    invoke-direct/range {v37 .. v47}, La/gc6;-><init>(Ljava/lang/String;La/wb6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;ZLa/ec6;IZ)V

    .line 1034
    .line 1035
    .line 1036
    move-object/from16 v4, v37

    .line 1037
    .line 1038
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1039
    .line 1040
    .line 1041
    move v4, v6

    .line 1042
    goto/16 :goto_13

    .line 1043
    .line 1044
    :cond_23
    invoke-static {}, La/q3d;->p()V

    .line 1045
    .line 1046
    .line 1047
    const/4 v6, 0x0

    .line 1048
    throw v6

    .line 1049
    :cond_24
    invoke-virtual {v1, v3}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1050
    .line 1051
    .line 1052
    :cond_25
    :goto_1a
    move-object/from16 v26, v2

    .line 1053
    .line 1054
    move-object/from16 v34, v7

    .line 1055
    .line 1056
    move-object/from16 v20, v8

    .line 1057
    .line 1058
    move-object v4, v10

    .line 1059
    move/from16 v30, v22

    .line 1060
    .line 1061
    move-object/from16 v7, v23

    .line 1062
    .line 1063
    move-object/from16 v11, v31

    .line 1064
    .line 1065
    move-object/from16 v3, v32

    .line 1066
    .line 1067
    :goto_1b
    const/16 v9, 0xa

    .line 1068
    .line 1069
    goto/16 :goto_8

    .line 1070
    .line 1071
    :pswitch_2
    move-object/from16 v35, v0

    .line 1072
    .line 1073
    move-object/from16 v32, v3

    .line 1074
    .line 1075
    move-object/from16 p0, v5

    .line 1076
    .line 1077
    move-object/from16 v28, v6

    .line 1078
    .line 1079
    move-object/from16 v31, v9

    .line 1080
    .line 1081
    move-object/from16 v36, v10

    .line 1082
    .line 1083
    move/from16 v22, v15

    .line 1084
    .line 1085
    move-object v10, v4

    .line 1086
    iget-object v0, v7, La/x9l;->b:La/smg;

    .line 1087
    .line 1088
    iget-object v3, v8, La/z6l;->c:La/o4i0;

    .line 1089
    .line 1090
    iget-object v4, v0, La/smg;->c:Ljava/util/List;

    .line 1091
    .line 1092
    invoke-static {v4}, La/xww;->P(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v4

    .line 1096
    iget-object v5, v0, La/smg;->f:Ljava/util/List;

    .line 1097
    .line 1098
    invoke-static {v5}, La/xww;->P(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v5

    .line 1102
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1103
    .line 1104
    .line 1105
    move-result v6

    .line 1106
    if-nez v6, :cond_25

    .line 1107
    .line 1108
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1109
    .line 1110
    .line 1111
    move-result v6

    .line 1112
    if-nez v6, :cond_25

    .line 1113
    .line 1114
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v6

    .line 1118
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1119
    .line 1120
    .line 1121
    move-result v6

    .line 1122
    const/16 v15, 0xa

    .line 1123
    .line 1124
    if-eq v6, v15, :cond_26

    .line 1125
    .line 1126
    goto :goto_1a

    .line 1127
    :cond_26
    iget-object v6, v3, La/o4i0;->a:Ljava/lang/String;

    .line 1128
    .line 1129
    invoke-static {v6, v4}, La/xww;->A(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v6

    .line 1133
    iget-object v3, v3, La/o4i0;->b:Ljava/lang/String;

    .line 1134
    .line 1135
    invoke-static {v3, v5}, La/xww;->A(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v3

    .line 1139
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v9

    .line 1143
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1144
    .line 1145
    .line 1146
    move-result v11

    .line 1147
    if-nez v11, :cond_27

    .line 1148
    .line 1149
    goto :goto_1a

    .line 1150
    :cond_27
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1151
    .line 1152
    .line 1153
    move-result v11

    .line 1154
    if-nez v11, :cond_28

    .line 1155
    .line 1156
    goto :goto_1a

    .line 1157
    :cond_28
    new-instance v11, La/psv;

    .line 1158
    .line 1159
    const-string v13, "COMPOSITION_HEADER"

    .line 1160
    .line 1161
    const v14, 0x7f1304cc

    .line 1162
    .line 1163
    .line 1164
    invoke-direct {v11, v13, v14}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v1, v11}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1168
    .line 1169
    .line 1170
    new-instance v15, La/ifa0;

    .line 1171
    .line 1172
    new-instance v11, La/gfa0;

    .line 1173
    .line 1174
    iget-object v13, v0, La/smg;->a:Ljava/lang/String;

    .line 1175
    .line 1176
    iget-object v14, v0, La/smg;->b:Ljava/lang/String;

    .line 1177
    .line 1178
    invoke-direct {v11, v13, v14, v12}, La/gfa0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1179
    .line 1180
    .line 1181
    new-instance v13, La/gfa0;

    .line 1182
    .line 1183
    iget-object v14, v0, La/smg;->d:Ljava/lang/String;

    .line 1184
    .line 1185
    iget-object v0, v0, La/smg;->e:Ljava/lang/String;

    .line 1186
    .line 1187
    invoke-direct {v13, v14, v0, v12}, La/gfa0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1188
    .line 1189
    .line 1190
    invoke-static {v6, v4}, La/zvw;->B(Ljava/lang/String;Ljava/util/ArrayList;)La/i4;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v19

    .line 1194
    invoke-static {v3, v5}, La/zvw;->B(Ljava/lang/String;Ljava/util/ArrayList;)La/i4;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v20

    .line 1198
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    :cond_29
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1203
    .line 1204
    .line 1205
    move-result v4

    .line 1206
    if-eqz v4, :cond_2a

    .line 1207
    .line 1208
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v4

    .line 1212
    move-object v5, v4

    .line 1213
    check-cast v5, La/wmg;

    .line 1214
    .line 1215
    iget-object v5, v5, La/wmg;->a:Ljava/lang/String;

    .line 1216
    .line 1217
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v5

    .line 1221
    if-eqz v5, :cond_29

    .line 1222
    .line 1223
    goto :goto_1c

    .line 1224
    :cond_2a
    const/4 v4, 0x0

    .line 1225
    :goto_1c
    check-cast v4, La/wmg;

    .line 1226
    .line 1227
    if-nez v4, :cond_2b

    .line 1228
    .line 1229
    new-instance v37, La/wmg;

    .line 1230
    .line 1231
    sget-object v48, La/iun;->a:La/iun;

    .line 1232
    .line 1233
    const-string v49, ""

    .line 1234
    .line 1235
    const-string v38, ""

    .line 1236
    .line 1237
    const-string v39, ""

    .line 1238
    .line 1239
    const-string v40, ""

    .line 1240
    .line 1241
    const/16 v41, 0x0

    .line 1242
    .line 1243
    const/16 v42, 0x0

    .line 1244
    .line 1245
    const/16 v43, 0x0

    .line 1246
    .line 1247
    const/16 v44, 0x0

    .line 1248
    .line 1249
    const/16 v45, 0x0

    .line 1250
    .line 1251
    const/16 v46, 0x0

    .line 1252
    .line 1253
    const/16 v47, 0x0

    .line 1254
    .line 1255
    invoke-direct/range {v37 .. v49}, La/wmg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZILjava/util/List;Ljava/lang/String;)V

    .line 1256
    .line 1257
    .line 1258
    move-object/from16 v4, v37

    .line 1259
    .line 1260
    :cond_2b
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    :cond_2c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1265
    .line 1266
    .line 1267
    move-result v5

    .line 1268
    if-eqz v5, :cond_2d

    .line 1269
    .line 1270
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v5

    .line 1274
    move-object v6, v5

    .line 1275
    check-cast v6, La/wmg;

    .line 1276
    .line 1277
    iget-object v6, v6, La/wmg;->a:Ljava/lang/String;

    .line 1278
    .line 1279
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1280
    .line 1281
    .line 1282
    move-result v6

    .line 1283
    if-eqz v6, :cond_2c

    .line 1284
    .line 1285
    goto :goto_1d

    .line 1286
    :cond_2d
    const/4 v5, 0x0

    .line 1287
    :goto_1d
    check-cast v5, La/wmg;

    .line 1288
    .line 1289
    if-nez v5, :cond_2e

    .line 1290
    .line 1291
    new-instance v37, La/wmg;

    .line 1292
    .line 1293
    sget-object v48, La/iun;->a:La/iun;

    .line 1294
    .line 1295
    const-string v49, ""

    .line 1296
    .line 1297
    const-string v38, ""

    .line 1298
    .line 1299
    const-string v39, ""

    .line 1300
    .line 1301
    const-string v40, ""

    .line 1302
    .line 1303
    const/16 v41, 0x0

    .line 1304
    .line 1305
    const/16 v42, 0x0

    .line 1306
    .line 1307
    const/16 v43, 0x0

    .line 1308
    .line 1309
    const/16 v44, 0x0

    .line 1310
    .line 1311
    const/16 v45, 0x0

    .line 1312
    .line 1313
    const/16 v46, 0x0

    .line 1314
    .line 1315
    const/16 v47, 0x0

    .line 1316
    .line 1317
    invoke-direct/range {v37 .. v49}, La/wmg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZILjava/util/List;Ljava/lang/String;)V

    .line 1318
    .line 1319
    .line 1320
    move-object/from16 v5, v37

    .line 1321
    .line 1322
    :cond_2e
    new-instance v0, La/efa0;

    .line 1323
    .line 1324
    invoke-static {v4, v5}, La/ufx;->B(La/wmg;La/wmg;)La/dfa0;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v3

    .line 1328
    invoke-static {v5, v4}, La/ufx;->B(La/wmg;La/wmg;)La/dfa0;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v4

    .line 1332
    const/4 v12, 0x0

    .line 1333
    new-array v5, v12, [Ljava/lang/Object;

    .line 1334
    .line 1335
    iget-object v6, v10, La/ctf0;->b:La/lsm0;

    .line 1336
    .line 1337
    invoke-static {v5, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v5

    .line 1341
    const v9, 0x7f13071e

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v6, v9, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v5

    .line 1348
    invoke-static {v5}, La/uvw;->u(Ljava/lang/String;)La/ffa0;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v5

    .line 1352
    new-array v9, v12, [Ljava/lang/Object;

    .line 1353
    .line 1354
    invoke-static {v9, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v9

    .line 1358
    const v14, 0x7f130718

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v6, v14, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v9

    .line 1365
    invoke-static {v9}, La/uvw;->u(Ljava/lang/String;)La/ffa0;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v9

    .line 1369
    new-array v14, v12, [Ljava/lang/Object;

    .line 1370
    .line 1371
    invoke-static {v14, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v14

    .line 1375
    const v12, 0x7f130708

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v6, v12, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v12

    .line 1382
    invoke-static {v12}, La/uvw;->u(Ljava/lang/String;)La/ffa0;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v12

    .line 1386
    move-object/from16 v17, v11

    .line 1387
    .line 1388
    const/4 v14, 0x0

    .line 1389
    new-array v11, v14, [Ljava/lang/Object;

    .line 1390
    .line 1391
    invoke-static {v11, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v11

    .line 1395
    const v14, 0x7f13072d

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v6, v14, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v11

    .line 1402
    invoke-static {v11}, La/uvw;->u(Ljava/lang/String;)La/ffa0;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v11

    .line 1406
    filled-new-array {v5, v9, v12, v11}, [La/ffa0;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v5

    .line 1410
    invoke-static {v5}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v5

    .line 1414
    const/4 v12, 0x0

    .line 1415
    new-array v9, v12, [Ljava/lang/Object;

    .line 1416
    .line 1417
    invoke-static {v9, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v9

    .line 1421
    const v11, 0x7f131388

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v6, v11, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v6

    .line 1428
    invoke-direct {v0, v3, v4, v5, v6}, La/efa0;-><init>(La/dfa0;La/dfa0;La/a4x;Ljava/lang/String;)V

    .line 1429
    .line 1430
    .line 1431
    const-string v16, "PLAYERS_COMPOSITION"

    .line 1432
    .line 1433
    move-object/from16 v21, v0

    .line 1434
    .line 1435
    move-object/from16 v18, v13

    .line 1436
    .line 1437
    invoke-direct/range {v15 .. v21}, La/ifa0;-><init>(Ljava/lang/String;La/gfa0;La/gfa0;La/a4x;La/a4x;La/efa0;)V

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v1, v15}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1441
    .line 1442
    .line 1443
    goto/16 :goto_1a

    .line 1444
    .line 1445
    :pswitch_3
    move-object/from16 v35, v0

    .line 1446
    .line 1447
    move-object/from16 v32, v3

    .line 1448
    .line 1449
    move-object/from16 p0, v5

    .line 1450
    .line 1451
    move-object/from16 v28, v6

    .line 1452
    .line 1453
    move-object/from16 v31, v9

    .line 1454
    .line 1455
    move-object/from16 v36, v10

    .line 1456
    .line 1457
    move/from16 v22, v15

    .line 1458
    .line 1459
    move-object v10, v4

    .line 1460
    iget-object v0, v10, La/ctf0;->b:La/lsm0;

    .line 1461
    .line 1462
    invoke-virtual {v10}, La/ctf0;->j()Z

    .line 1463
    .line 1464
    .line 1465
    move-result v3

    .line 1466
    iget-object v4, v2, La/c5l;->e:Ljava/util/List;

    .line 1467
    .line 1468
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->t0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v4

    .line 1472
    new-instance v5, Ljava/util/ArrayList;

    .line 1473
    .line 1474
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1475
    .line 1476
    .line 1477
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v4

    .line 1481
    :cond_2f
    :goto_1e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1482
    .line 1483
    .line 1484
    move-result v6

    .line 1485
    if-eqz v6, :cond_30

    .line 1486
    .line 1487
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v6

    .line 1491
    move-object v9, v6

    .line 1492
    check-cast v9, La/cah;

    .line 1493
    .line 1494
    iget v11, v9, La/cah;->a:I

    .line 1495
    .line 1496
    const/4 v13, -0x1

    .line 1497
    if-eq v11, v13, :cond_2f

    .line 1498
    .line 1499
    iget v9, v9, La/cah;->b:I

    .line 1500
    .line 1501
    if-eq v9, v13, :cond_2f

    .line 1502
    .line 1503
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1504
    .line 1505
    .line 1506
    goto :goto_1e

    .line 1507
    :cond_30
    new-instance v4, Ljava/util/ArrayList;

    .line 1508
    .line 1509
    const/16 v15, 0xa

    .line 1510
    .line 1511
    invoke-static {v5, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1512
    .line 1513
    .line 1514
    move-result v6

    .line 1515
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v5

    .line 1522
    :goto_1f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1523
    .line 1524
    .line 1525
    move-result v6

    .line 1526
    if-eqz v6, :cond_3e

    .line 1527
    .line 1528
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v6

    .line 1532
    check-cast v6, La/cah;

    .line 1533
    .line 1534
    iget-object v9, v6, La/cah;->d:La/zf90;

    .line 1535
    .line 1536
    const/4 v14, 0x1

    .line 1537
    invoke-static {v9, v14}, La/wvb;->U(La/zf90;I)Ljava/lang/Integer;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v11

    .line 1541
    if-eqz v11, :cond_31

    .line 1542
    .line 1543
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1544
    .line 1545
    .line 1546
    move-result v11

    .line 1547
    const/4 v14, 0x0

    .line 1548
    new-array v13, v14, [Ljava/lang/Object;

    .line 1549
    .line 1550
    invoke-static {v13, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v13

    .line 1554
    invoke-virtual {v0, v11, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v13

    .line 1558
    goto :goto_20

    .line 1559
    :cond_31
    const/4 v14, 0x0

    .line 1560
    const/4 v13, 0x0

    .line 1561
    :goto_20
    if-nez v13, :cond_32

    .line 1562
    .line 1563
    move-object v11, v12

    .line 1564
    :goto_21
    const/4 v13, 0x2

    .line 1565
    goto :goto_22

    .line 1566
    :cond_32
    move-object v11, v13

    .line 1567
    goto :goto_21

    .line 1568
    :goto_22
    invoke-static {v9, v13}, La/wvb;->U(La/zf90;I)Ljava/lang/Integer;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v15

    .line 1572
    if-eqz v15, :cond_33

    .line 1573
    .line 1574
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 1575
    .line 1576
    .line 1577
    move-result v15

    .line 1578
    new-array v13, v14, [Ljava/lang/Object;

    .line 1579
    .line 1580
    invoke-static {v13, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v13

    .line 1584
    invoke-virtual {v0, v15, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v13

    .line 1588
    goto :goto_23

    .line 1589
    :cond_33
    const/4 v13, 0x0

    .line 1590
    :goto_23
    if-nez v13, :cond_34

    .line 1591
    .line 1592
    move-object v15, v12

    .line 1593
    goto :goto_24

    .line 1594
    :cond_34
    move-object v15, v13

    .line 1595
    :goto_24
    invoke-static/range {v28 .. v28}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v13

    .line 1599
    check-cast v13, Ljava/lang/String;

    .line 1600
    .line 1601
    if-nez v13, :cond_35

    .line 1602
    .line 1603
    move-object v13, v12

    .line 1604
    :cond_35
    invoke-static {v13}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v13

    .line 1608
    invoke-static/range {v24 .. v24}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v14

    .line 1612
    check-cast v14, Ljava/lang/String;

    .line 1613
    .line 1614
    if-nez v14, :cond_36

    .line 1615
    .line 1616
    move-object v14, v12

    .line 1617
    :cond_36
    invoke-static {v14}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v14

    .line 1621
    move-object/from16 v26, v0

    .line 1622
    .line 1623
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1624
    .line 1625
    move/from16 v30, v3

    .line 1626
    .line 1627
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 1628
    .line 1629
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1630
    .line 1631
    .line 1632
    if-eqz v30, :cond_37

    .line 1633
    .line 1634
    const-string v3, "static/img/ImgDefault/Esports/Dota2/Previos_Maps_Tablet.png"

    .line 1635
    .line 1636
    goto :goto_25

    .line 1637
    :cond_37
    const-string v3, "static/img/ImgDefault/Esports/Dota2/Previos_Maps.png"

    .line 1638
    .line 1639
    :goto_25
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1640
    .line 1641
    .line 1642
    move-result v16

    .line 1643
    if-nez v16, :cond_38

    .line 1644
    .line 1645
    move-object/from16 v25, v5

    .line 1646
    .line 1647
    const/4 v5, 0x0

    .line 1648
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1649
    .line 1650
    .line 1651
    move-object/from16 v16, v11

    .line 1652
    .line 1653
    goto :goto_27

    .line 1654
    :cond_38
    move-object/from16 v25, v5

    .line 1655
    .line 1656
    move-object/from16 v16, v11

    .line 1657
    .line 1658
    const/4 v5, 0x0

    .line 1659
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 1660
    .line 1661
    invoke-static {v3, v11, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1662
    .line 1663
    .line 1664
    move-result v11

    .line 1665
    if-nez v11, :cond_3b

    .line 1666
    .line 1667
    const-string v11, "https://"

    .line 1668
    .line 1669
    invoke-static {v3, v11, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1670
    .line 1671
    .line 1672
    move-result v11

    .line 1673
    if-eqz v11, :cond_39

    .line 1674
    .line 1675
    const/4 v5, 0x0

    .line 1676
    goto :goto_26

    .line 1677
    :cond_39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 1678
    .line 1679
    .line 1680
    move-result v5

    .line 1681
    const/16 v11, 0x2f

    .line 1682
    .line 1683
    if-lez v5, :cond_3a

    .line 1684
    .line 1685
    const-string v5, "/"

    .line 1686
    .line 1687
    invoke-static {v0, v5}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1688
    .line 1689
    .line 1690
    move-result v5

    .line 1691
    if-nez v5, :cond_3a

    .line 1692
    .line 1693
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1694
    .line 1695
    .line 1696
    :cond_3a
    move/from16 v17, v11

    .line 1697
    .line 1698
    const/4 v5, 0x1

    .line 1699
    new-array v11, v5, [C

    .line 1700
    .line 1701
    const/4 v5, 0x0

    .line 1702
    aput-char v17, v11, v5

    .line 1703
    .line 1704
    invoke-static {v3, v11}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v3

    .line 1708
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1709
    .line 1710
    .line 1711
    goto :goto_27

    .line 1712
    :cond_3b
    :goto_26
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1713
    .line 1714
    .line 1715
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1716
    .line 1717
    .line 1718
    :goto_27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v0

    .line 1722
    sget-object v3, La/zf90;->a:La/zf90;

    .line 1723
    .line 1724
    if-ne v9, v3, :cond_3c

    .line 1725
    .line 1726
    sget-object v3, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1727
    .line 1728
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGamesTextVictory-0d7_KjU()J

    .line 1729
    .line 1730
    .line 1731
    move-result-wide v19

    .line 1732
    goto :goto_28

    .line 1733
    :cond_3c
    sget-object v3, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1734
    .line 1735
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 1736
    .line 1737
    .line 1738
    move-result-wide v19

    .line 1739
    :goto_28
    sget-object v11, La/zf90;->b:La/zf90;

    .line 1740
    .line 1741
    if-ne v9, v11, :cond_3d

    .line 1742
    .line 1743
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGamesTextVictory-0d7_KjU()J

    .line 1744
    .line 1745
    .line 1746
    move-result-wide v33

    .line 1747
    goto :goto_29

    .line 1748
    :cond_3d
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 1749
    .line 1750
    .line 1751
    move-result-wide v33

    .line 1752
    :goto_29
    iget v3, v6, La/cah;->c:I

    .line 1753
    .line 1754
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v3

    .line 1758
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v3

    .line 1762
    const v9, 0x7f13071d

    .line 1763
    .line 1764
    .line 1765
    invoke-virtual {v10, v9, v3}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v3

    .line 1769
    iget v9, v6, La/cah;->a:I

    .line 1770
    .line 1771
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v9

    .line 1775
    iget v11, v6, La/cah;->b:I

    .line 1776
    .line 1777
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v11

    .line 1781
    const-string v5, " : "

    .line 1782
    .line 1783
    invoke-static {v9, v5, v11}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v5

    .line 1787
    iget v6, v6, La/cah;->c:I

    .line 1788
    .line 1789
    new-instance v9, La/xls;

    .line 1790
    .line 1791
    move-object/from16 v18, v0

    .line 1792
    .line 1793
    move/from16 v21, v6

    .line 1794
    .line 1795
    move-object v0, v12

    .line 1796
    move-object/from16 v11, v16

    .line 1797
    .line 1798
    move-wide/from16 v16, v33

    .line 1799
    .line 1800
    const/4 v6, 0x2

    .line 1801
    move-wide/from16 v50, v19

    .line 1802
    .line 1803
    move-object/from16 v19, v3

    .line 1804
    .line 1805
    move-object/from16 v20, v5

    .line 1806
    .line 1807
    move-object v3, v10

    .line 1808
    move-object v10, v13

    .line 1809
    move-wide/from16 v12, v50

    .line 1810
    .line 1811
    const/4 v5, 0x0

    .line 1812
    invoke-direct/range {v9 .. v22}, La/xls;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 1813
    .line 1814
    .line 1815
    move/from16 v15, v22

    .line 1816
    .line 1817
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1818
    .line 1819
    .line 1820
    move-object v12, v0

    .line 1821
    move-object v10, v3

    .line 1822
    move-object/from16 v5, v25

    .line 1823
    .line 1824
    move-object/from16 v0, v26

    .line 1825
    .line 1826
    move/from16 v3, v30

    .line 1827
    .line 1828
    goto/16 :goto_1f

    .line 1829
    .line 1830
    :cond_3e
    move-object v3, v10

    .line 1831
    move/from16 v15, v22

    .line 1832
    .line 1833
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1834
    .line 1835
    .line 1836
    move-result v0

    .line 1837
    if-eqz v0, :cond_3f

    .line 1838
    .line 1839
    goto :goto_2a

    .line 1840
    :cond_3f
    new-instance v0, La/psv;

    .line 1841
    .line 1842
    const-string v5, "PREVIOUS_MAPS_HEADER"

    .line 1843
    .line 1844
    const v6, 0x7f130ff8

    .line 1845
    .line 1846
    .line 1847
    invoke-direct {v0, v5, v6}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 1848
    .line 1849
    .line 1850
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1851
    .line 1852
    .line 1853
    new-instance v0, La/hvb0;

    .line 1854
    .line 1855
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v4

    .line 1859
    invoke-direct {v0, v4}, La/hvb0;-><init>(La/a4x;)V

    .line 1860
    .line 1861
    .line 1862
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1863
    .line 1864
    .line 1865
    :goto_2a
    move-object/from16 v10, p0

    .line 1866
    .line 1867
    move-object/from16 v26, v2

    .line 1868
    .line 1869
    move-object v4, v3

    .line 1870
    move-object/from16 v34, v7

    .line 1871
    .line 1872
    move-object/from16 v20, v8

    .line 1873
    .line 1874
    move/from16 v30, v15

    .line 1875
    .line 1876
    move-object/from16 v7, v23

    .line 1877
    .line 1878
    move-object/from16 v11, v31

    .line 1879
    .line 1880
    move-object/from16 v3, v32

    .line 1881
    .line 1882
    :goto_2b
    const/16 v9, 0xa

    .line 1883
    .line 1884
    goto/16 :goto_61

    .line 1885
    .line 1886
    :pswitch_4
    move-object/from16 v35, v0

    .line 1887
    .line 1888
    move-object/from16 v32, v3

    .line 1889
    .line 1890
    move-object v3, v4

    .line 1891
    move-object/from16 p0, v5

    .line 1892
    .line 1893
    move-object/from16 v28, v6

    .line 1894
    .line 1895
    move-object/from16 v31, v9

    .line 1896
    .line 1897
    move-object/from16 v36, v10

    .line 1898
    .line 1899
    iget-object v0, v2, La/c5l;->a:La/g9l;

    .line 1900
    .line 1901
    iget-object v0, v0, La/g9l;->g:Ljava/util/List;

    .line 1902
    .line 1903
    move-object/from16 v9, v36

    .line 1904
    .line 1905
    iget-object v4, v9, La/y9l;->a:La/i6l;

    .line 1906
    .line 1907
    move-object/from16 v10, v32

    .line 1908
    .line 1909
    invoke-static {v10, v0, v4}, La/zjb;->t(La/m9s;Ljava/util/List;La/i6l;)La/v2l;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v0

    .line 1913
    iget-object v4, v0, La/v2l;->d:Ljava/util/ArrayList;

    .line 1914
    .line 1915
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1916
    .line 1917
    .line 1918
    move-result v4

    .line 1919
    if-eqz v4, :cond_40

    .line 1920
    .line 1921
    goto :goto_2c

    .line 1922
    :cond_40
    new-instance v4, La/psv;

    .line 1923
    .line 1924
    const-string v5, "BANS_PICKS_HEADER"

    .line 1925
    .line 1926
    const v6, 0x7f130f6c

    .line 1927
    .line 1928
    .line 1929
    invoke-direct {v4, v5, v6}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 1930
    .line 1931
    .line 1932
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1933
    .line 1934
    .line 1935
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1936
    .line 1937
    .line 1938
    :goto_2c
    move-object/from16 v26, v2

    .line 1939
    .line 1940
    move-object v4, v3

    .line 1941
    move-object/from16 v34, v7

    .line 1942
    .line 1943
    move-object/from16 v20, v8

    .line 1944
    .line 1945
    move-object/from16 v36, v9

    .line 1946
    .line 1947
    move-object v3, v10

    .line 1948
    move/from16 v30, v15

    .line 1949
    .line 1950
    move-object/from16 v7, v23

    .line 1951
    .line 1952
    move-object/from16 v11, v31

    .line 1953
    .line 1954
    goto/16 :goto_1b

    .line 1955
    .line 1956
    :pswitch_5
    move-object/from16 v35, v0

    .line 1957
    .line 1958
    move-object/from16 p0, v5

    .line 1959
    .line 1960
    move-object/from16 v28, v6

    .line 1961
    .line 1962
    move-object/from16 v31, v9

    .line 1963
    .line 1964
    move-object v9, v10

    .line 1965
    move-object v0, v12

    .line 1966
    const/4 v5, 0x0

    .line 1967
    const/4 v6, 0x2

    .line 1968
    move-object v10, v3

    .line 1969
    move-object v3, v4

    .line 1970
    iget-wide v11, v8, La/z6l;->b:J

    .line 1971
    .line 1972
    invoke-static/range {v28 .. v28}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v4

    .line 1976
    check-cast v4, Ljava/lang/String;

    .line 1977
    .line 1978
    if-nez v4, :cond_41

    .line 1979
    .line 1980
    move-object v4, v0

    .line 1981
    :cond_41
    invoke-static/range {v24 .. v24}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v14

    .line 1985
    check-cast v14, Ljava/lang/String;

    .line 1986
    .line 1987
    if-nez v14, :cond_42

    .line 1988
    .line 1989
    move-object v14, v0

    .line 1990
    :cond_42
    invoke-virtual {v3}, La/ctf0;->j()Z

    .line 1991
    .line 1992
    .line 1993
    move-result v18

    .line 1994
    iget-object v6, v9, La/y9l;->b:Ljava/util/List;

    .line 1995
    .line 1996
    new-instance v5, Ljava/util/ArrayList;

    .line 1997
    .line 1998
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1999
    .line 2000
    .line 2001
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v6

    .line 2005
    :goto_2d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2006
    .line 2007
    .line 2008
    move-result v30

    .line 2009
    if-eqz v30, :cond_44

    .line 2010
    .line 2011
    move-object/from16 v30, v6

    .line 2012
    .line 2013
    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v6

    .line 2017
    move-wide/from16 v32, v11

    .line 2018
    .line 2019
    move-object v11, v6

    .line 2020
    check-cast v11, La/z4l;

    .line 2021
    .line 2022
    iget-object v11, v11, La/z4l;->q:Ljava/lang/String;

    .line 2023
    .line 2024
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 2025
    .line 2026
    .line 2027
    move-result v11

    .line 2028
    if-lez v11, :cond_43

    .line 2029
    .line 2030
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2031
    .line 2032
    .line 2033
    :cond_43
    move-object/from16 v6, v30

    .line 2034
    .line 2035
    move-wide/from16 v11, v32

    .line 2036
    .line 2037
    goto :goto_2d

    .line 2038
    :cond_44
    move-wide/from16 v32, v11

    .line 2039
    .line 2040
    new-instance v6, Ljava/util/ArrayList;

    .line 2041
    .line 2042
    const/16 v11, 0xa

    .line 2043
    .line 2044
    invoke-static {v5, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2045
    .line 2046
    .line 2047
    move-result v12

    .line 2048
    invoke-direct {v6, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2049
    .line 2050
    .line 2051
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v5

    .line 2055
    :goto_2e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2056
    .line 2057
    .line 2058
    move-result v11

    .line 2059
    if-eqz v11, :cond_45

    .line 2060
    .line 2061
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v11

    .line 2065
    check-cast v11, La/z4l;

    .line 2066
    .line 2067
    new-instance v12, La/ual;

    .line 2068
    .line 2069
    invoke-direct {v12, v4, v11}, La/ual;-><init>(Ljava/lang/String;La/z4l;)V

    .line 2070
    .line 2071
    .line 2072
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2073
    .line 2074
    .line 2075
    goto :goto_2e

    .line 2076
    :cond_45
    move-object/from16 v11, v31

    .line 2077
    .line 2078
    iget-object v4, v11, La/y9l;->b:Ljava/util/List;

    .line 2079
    .line 2080
    new-instance v5, Ljava/util/ArrayList;

    .line 2081
    .line 2082
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2083
    .line 2084
    .line 2085
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2086
    .line 2087
    .line 2088
    move-result-object v4

    .line 2089
    :goto_2f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2090
    .line 2091
    .line 2092
    move-result v12

    .line 2093
    if-eqz v12, :cond_47

    .line 2094
    .line 2095
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2096
    .line 2097
    .line 2098
    move-result-object v12

    .line 2099
    move-object/from16 v30, v4

    .line 2100
    .line 2101
    move-object v4, v12

    .line 2102
    check-cast v4, La/z4l;

    .line 2103
    .line 2104
    iget-object v4, v4, La/z4l;->q:Ljava/lang/String;

    .line 2105
    .line 2106
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 2107
    .line 2108
    .line 2109
    move-result v4

    .line 2110
    if-lez v4, :cond_46

    .line 2111
    .line 2112
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2113
    .line 2114
    .line 2115
    :cond_46
    move-object/from16 v4, v30

    .line 2116
    .line 2117
    goto :goto_2f

    .line 2118
    :cond_47
    new-instance v4, Ljava/util/ArrayList;

    .line 2119
    .line 2120
    move/from16 v30, v15

    .line 2121
    .line 2122
    const/16 v12, 0xa

    .line 2123
    .line 2124
    invoke-static {v5, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2125
    .line 2126
    .line 2127
    move-result v15

    .line 2128
    invoke-direct {v4, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 2129
    .line 2130
    .line 2131
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v5

    .line 2135
    :goto_30
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2136
    .line 2137
    .line 2138
    move-result v12

    .line 2139
    if-eqz v12, :cond_48

    .line 2140
    .line 2141
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v12

    .line 2145
    check-cast v12, La/z4l;

    .line 2146
    .line 2147
    new-instance v15, La/ual;

    .line 2148
    .line 2149
    invoke-direct {v15, v14, v12}, La/ual;-><init>(Ljava/lang/String;La/z4l;)V

    .line 2150
    .line 2151
    .line 2152
    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2153
    .line 2154
    .line 2155
    goto :goto_30

    .line 2156
    :cond_48
    invoke-static {v6, v4}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v4

    .line 2160
    iget-object v5, v2, La/c5l;->d:Ljava/util/List;

    .line 2161
    .line 2162
    invoke-static {v5}, La/nkb;->D(Ljava/util/List;)La/lc00;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v5

    .line 2166
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 2167
    .line 2168
    .line 2169
    move-result v6

    .line 2170
    const/16 v15, 0xa

    .line 2171
    .line 2172
    if-ne v6, v15, :cond_49

    .line 2173
    .line 2174
    invoke-virtual {v5}, La/lc00;->isEmpty()Z

    .line 2175
    .line 2176
    .line 2177
    move-result v6

    .line 2178
    if-eqz v6, :cond_4a

    .line 2179
    .line 2180
    :cond_49
    move-object/from16 v26, v2

    .line 2181
    .line 2182
    move-object/from16 v34, v7

    .line 2183
    .line 2184
    goto/16 :goto_38

    .line 2185
    .line 2186
    :cond_4a
    invoke-virtual {v5}, La/lc00;->isEmpty()Z

    .line 2187
    .line 2188
    .line 2189
    move-result v6

    .line 2190
    if-eqz v6, :cond_4b

    .line 2191
    .line 2192
    goto :goto_31

    .line 2193
    :cond_4b
    invoke-virtual {v5}, La/lc00;->iterator()Ljava/util/Iterator;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v6

    .line 2197
    :cond_4c
    move-object v12, v6

    .line 2198
    check-cast v12, La/paw;

    .line 2199
    .line 2200
    invoke-virtual {v12}, La/paw;->hasNext()Z

    .line 2201
    .line 2202
    .line 2203
    move-result v14

    .line 2204
    if-eqz v14, :cond_4d

    .line 2205
    .line 2206
    invoke-virtual {v12}, La/paw;->next()Ljava/lang/Object;

    .line 2207
    .line 2208
    .line 2209
    move-result-object v12

    .line 2210
    check-cast v12, La/aal;

    .line 2211
    .line 2212
    iget-byte v12, v12, La/aal;->a:B

    .line 2213
    .line 2214
    int-to-long v14, v12

    .line 2215
    cmp-long v12, v14, v32

    .line 2216
    .line 2217
    if-nez v12, :cond_4c

    .line 2218
    .line 2219
    move-wide/from16 v14, v32

    .line 2220
    .line 2221
    goto :goto_32

    .line 2222
    :cond_4d
    :goto_31
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 2223
    .line 2224
    .line 2225
    move-result-object v6

    .line 2226
    check-cast v6, La/aal;

    .line 2227
    .line 2228
    iget-byte v6, v6, La/aal;->a:B

    .line 2229
    .line 2230
    int-to-long v14, v6

    .line 2231
    :goto_32
    new-instance v6, Ljava/util/ArrayList;

    .line 2232
    .line 2233
    move-wide/from16 v31, v14

    .line 2234
    .line 2235
    const/16 v12, 0xa

    .line 2236
    .line 2237
    invoke-static {v5, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2238
    .line 2239
    .line 2240
    move-result v14

    .line 2241
    invoke-direct {v6, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 2242
    .line 2243
    .line 2244
    invoke-virtual {v5}, La/lc00;->iterator()Ljava/util/Iterator;

    .line 2245
    .line 2246
    .line 2247
    move-result-object v5

    .line 2248
    :goto_33
    move-object v12, v5

    .line 2249
    check-cast v12, La/paw;

    .line 2250
    .line 2251
    invoke-virtual {v12}, La/paw;->hasNext()Z

    .line 2252
    .line 2253
    .line 2254
    move-result v14

    .line 2255
    if-eqz v14, :cond_4f

    .line 2256
    .line 2257
    invoke-virtual {v12}, La/paw;->next()Ljava/lang/Object;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v12

    .line 2261
    check-cast v12, La/aal;

    .line 2262
    .line 2263
    new-instance v36, La/lxl;

    .line 2264
    .line 2265
    iget-byte v14, v12, La/aal;->a:B

    .line 2266
    .line 2267
    int-to-long v14, v14

    .line 2268
    move-object/from16 v33, v5

    .line 2269
    .line 2270
    new-instance v5, La/xxl;

    .line 2271
    .line 2272
    move-wide/from16 v37, v14

    .line 2273
    .line 2274
    iget v14, v12, La/aal;->b:I

    .line 2275
    .line 2276
    move-object/from16 v34, v7

    .line 2277
    .line 2278
    const/4 v15, 0x0

    .line 2279
    new-array v7, v15, [Ljava/lang/Object;

    .line 2280
    .line 2281
    invoke-virtual {v3, v14, v7}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2282
    .line 2283
    .line 2284
    move-result-object v7

    .line 2285
    invoke-direct {v5, v7}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 2286
    .line 2287
    .line 2288
    iget-byte v7, v12, La/aal;->a:B

    .line 2289
    .line 2290
    int-to-long v14, v7

    .line 2291
    cmp-long v7, v31, v14

    .line 2292
    .line 2293
    if-nez v7, :cond_4e

    .line 2294
    .line 2295
    sget-object v7, La/uxl;->b:La/uxl;

    .line 2296
    .line 2297
    :goto_34
    move-object/from16 v41, v7

    .line 2298
    .line 2299
    goto :goto_35

    .line 2300
    :cond_4e
    sget-object v7, La/uxl;->a:La/uxl;

    .line 2301
    .line 2302
    goto :goto_34

    .line 2303
    :goto_35
    const/16 v42, 0x0

    .line 2304
    .line 2305
    const/16 v43, 0x6c

    .line 2306
    .line 2307
    const/16 v40, 0x0

    .line 2308
    .line 2309
    move-object/from16 v39, v5

    .line 2310
    .line 2311
    invoke-direct/range {v36 .. v43}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 2312
    .line 2313
    .line 2314
    move-object/from16 v5, v36

    .line 2315
    .line 2316
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2317
    .line 2318
    .line 2319
    move-object/from16 v5, v33

    .line 2320
    .line 2321
    move-object/from16 v7, v34

    .line 2322
    .line 2323
    goto :goto_33

    .line 2324
    :cond_4f
    move-object/from16 v34, v7

    .line 2325
    .line 2326
    new-instance v5, La/boo0;

    .line 2327
    .line 2328
    new-instance v36, La/fyl;

    .line 2329
    .line 2330
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2331
    .line 2332
    .line 2333
    move-result-object v37

    .line 2334
    invoke-virtual {v3}, La/ctf0;->j()Z

    .line 2335
    .line 2336
    .line 2337
    move-result v6

    .line 2338
    invoke-static {v6}, La/xfn;->b(Z)La/wfn;

    .line 2339
    .line 2340
    .line 2341
    move-result-object v6

    .line 2342
    iget v6, v6, La/wfn;->e:F

    .line 2343
    .line 2344
    const/4 v7, 0x0

    .line 2345
    const/4 v14, 0x2

    .line 2346
    invoke-static {v6, v7, v14}, La/s5x0;->t(FFI)La/lh80;

    .line 2347
    .line 2348
    .line 2349
    move-result-object v40

    .line 2350
    new-instance v6, La/jyl;

    .line 2351
    .line 2352
    sget-wide v14, La/kkg;->m:J

    .line 2353
    .line 2354
    new-instance v7, La/y3d;

    .line 2355
    .line 2356
    invoke-direct {v7, v14, v15}, La/y3d;-><init>(J)V

    .line 2357
    .line 2358
    .line 2359
    const/16 v12, 0x7e

    .line 2360
    .line 2361
    const/4 v14, 0x0

    .line 2362
    invoke-direct {v6, v7, v14, v14, v12}, La/jyl;-><init>(La/y3d;La/y3d;La/y3d;I)V

    .line 2363
    .line 2364
    .line 2365
    const/16 v42, 0x6

    .line 2366
    .line 2367
    const/16 v38, 0x0

    .line 2368
    .line 2369
    const/16 v39, 0x0

    .line 2370
    .line 2371
    move-object/from16 v41, v6

    .line 2372
    .line 2373
    invoke-direct/range {v36 .. v42}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 2374
    .line 2375
    .line 2376
    move-object/from16 v6, v36

    .line 2377
    .line 2378
    sget-object v7, La/pno0;->a:La/pno0;

    .line 2379
    .line 2380
    const-string v12, "GOLD_CREEPS_BUYBACK_TABS"

    .line 2381
    .line 2382
    invoke-direct {v5, v12, v6, v7}, La/boo0;-><init>(Ljava/lang/String;La/fyl;La/pno0;)V

    .line 2383
    .line 2384
    .line 2385
    if-eqz v18, :cond_52

    .line 2386
    .line 2387
    new-instance v0, La/e3l;

    .line 2388
    .line 2389
    const/4 v5, 0x6

    .line 2390
    invoke-direct {v0, v5}, La/e3l;-><init>(B)V

    .line 2391
    .line 2392
    .line 2393
    invoke-static {v4, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2394
    .line 2395
    .line 2396
    move-result-object v0

    .line 2397
    const v5, 0x7f1305eb

    .line 2398
    .line 2399
    .line 2400
    const/4 v12, 0x0

    .line 2401
    new-array v6, v12, [Ljava/lang/Object;

    .line 2402
    .line 2403
    invoke-virtual {v3, v5, v6}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2404
    .line 2405
    .line 2406
    move-result-object v5

    .line 2407
    const v6, 0x7f1305e4

    .line 2408
    .line 2409
    .line 2410
    new-array v7, v12, [Ljava/lang/Object;

    .line 2411
    .line 2412
    invoke-virtual {v3, v6, v7}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2413
    .line 2414
    .line 2415
    move-result-object v6

    .line 2416
    new-instance v7, Ljava/util/ArrayList;

    .line 2417
    .line 2418
    const/16 v15, 0xa

    .line 2419
    .line 2420
    invoke-static {v0, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2421
    .line 2422
    .line 2423
    move-result v12

    .line 2424
    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2425
    .line 2426
    .line 2427
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2428
    .line 2429
    .line 2430
    move-result-object v0

    .line 2431
    :goto_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2432
    .line 2433
    .line 2434
    move-result v12

    .line 2435
    if-eqz v12, :cond_50

    .line 2436
    .line 2437
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2438
    .line 2439
    .line 2440
    move-result-object v12

    .line 2441
    check-cast v12, La/ual;

    .line 2442
    .line 2443
    invoke-static {v12}, La/xkb;->Y(La/ual;)La/a5l;

    .line 2444
    .line 2445
    .line 2446
    move-result-object v12

    .line 2447
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2448
    .line 2449
    .line 2450
    goto :goto_36

    .line 2451
    :cond_50
    invoke-static {v7}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2452
    .line 2453
    .line 2454
    move-result-object v0

    .line 2455
    new-instance v7, Ljava/util/ArrayList;

    .line 2456
    .line 2457
    const/16 v15, 0xa

    .line 2458
    .line 2459
    invoke-static {v4, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2460
    .line 2461
    .line 2462
    move-result v12

    .line 2463
    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2464
    .line 2465
    .line 2466
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2467
    .line 2468
    .line 2469
    move-result-object v4

    .line 2470
    :goto_37
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2471
    .line 2472
    .line 2473
    move-result v12

    .line 2474
    if-eqz v12, :cond_51

    .line 2475
    .line 2476
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2477
    .line 2478
    .line 2479
    move-result-object v12

    .line 2480
    check-cast v12, La/ual;

    .line 2481
    .line 2482
    invoke-static {v12, v3}, La/xkb;->X(La/ual;La/ctf0;)La/a5l;

    .line 2483
    .line 2484
    .line 2485
    move-result-object v12

    .line 2486
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2487
    .line 2488
    .line 2489
    goto :goto_37

    .line 2490
    :cond_51
    invoke-static {v7}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2491
    .line 2492
    .line 2493
    move-result-object v4

    .line 2494
    new-instance v7, La/c4l;

    .line 2495
    .line 2496
    invoke-direct {v7, v5, v6, v0, v4}, La/c4l;-><init>(Ljava/lang/String;Ljava/lang/String;La/i4;La/i4;)V

    .line 2497
    .line 2498
    .line 2499
    invoke-virtual {v1, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2500
    .line 2501
    .line 2502
    move-object/from16 v26, v2

    .line 2503
    .line 2504
    :goto_38
    move-object/from16 v36, v9

    .line 2505
    .line 2506
    move-object/from16 v16, v10

    .line 2507
    .line 2508
    move-object/from16 v20, v11

    .line 2509
    .line 2510
    goto/16 :goto_4a

    .line 2511
    .line 2512
    :cond_52
    const/4 v12, 0x0

    .line 2513
    sget-object v6, La/aal;->c:La/aal;

    .line 2514
    .line 2515
    const-wide/16 v6, 0x4

    .line 2516
    .line 2517
    cmp-long v6, v31, v6

    .line 2518
    .line 2519
    if-nez v6, :cond_54

    .line 2520
    .line 2521
    new-instance v0, La/e3l;

    .line 2522
    .line 2523
    const/4 v6, 0x1

    .line 2524
    invoke-direct {v0, v6}, La/e3l;-><init>(B)V

    .line 2525
    .line 2526
    .line 2527
    invoke-static {v4, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2528
    .line 2529
    .line 2530
    move-result-object v0

    .line 2531
    new-instance v4, Ljava/util/ArrayList;

    .line 2532
    .line 2533
    const/16 v15, 0xa

    .line 2534
    .line 2535
    invoke-static {v0, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2536
    .line 2537
    .line 2538
    move-result v6

    .line 2539
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 2540
    .line 2541
    .line 2542
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2543
    .line 2544
    .line 2545
    move-result-object v0

    .line 2546
    :goto_39
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2547
    .line 2548
    .line 2549
    move-result v6

    .line 2550
    if-eqz v6, :cond_53

    .line 2551
    .line 2552
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2553
    .line 2554
    .line 2555
    move-result-object v6

    .line 2556
    check-cast v6, La/ual;

    .line 2557
    .line 2558
    invoke-static {v6}, La/xkb;->Y(La/ual;)La/a5l;

    .line 2559
    .line 2560
    .line 2561
    move-result-object v6

    .line 2562
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2563
    .line 2564
    .line 2565
    goto :goto_39

    .line 2566
    :cond_53
    move-object/from16 v26, v2

    .line 2567
    .line 2568
    move-object/from16 v36, v9

    .line 2569
    .line 2570
    move-object/from16 v16, v10

    .line 2571
    .line 2572
    move-object/from16 v20, v11

    .line 2573
    .line 2574
    goto/16 :goto_49

    .line 2575
    .line 2576
    :cond_54
    const/4 v6, 0x1

    .line 2577
    const-wide/16 v26, 0xa

    .line 2578
    .line 2579
    cmp-long v7, v31, v26

    .line 2580
    .line 2581
    if-nez v7, :cond_5c

    .line 2582
    .line 2583
    new-instance v7, La/e3l;

    .line 2584
    .line 2585
    const/4 v15, 0x2

    .line 2586
    invoke-direct {v7, v15}, La/e3l;-><init>(B)V

    .line 2587
    .line 2588
    .line 2589
    invoke-static {v4, v7}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2590
    .line 2591
    .line 2592
    move-result-object v4

    .line 2593
    new-instance v7, Ljava/util/ArrayList;

    .line 2594
    .line 2595
    const/16 v15, 0xa

    .line 2596
    .line 2597
    invoke-static {v4, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2598
    .line 2599
    .line 2600
    move-result v12

    .line 2601
    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 2602
    .line 2603
    .line 2604
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2605
    .line 2606
    .line 2607
    move-result-object v4

    .line 2608
    :goto_3a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2609
    .line 2610
    .line 2611
    move-result v12

    .line 2612
    if-eqz v12, :cond_5b

    .line 2613
    .line 2614
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2615
    .line 2616
    .line 2617
    move-result-object v12

    .line 2618
    check-cast v12, La/ual;

    .line 2619
    .line 2620
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2621
    .line 2622
    .line 2623
    iget-object v15, v12, La/ual;->b:La/z4l;

    .line 2624
    .line 2625
    iget v14, v15, La/z4l;->a:I

    .line 2626
    .line 2627
    const-string v6, "CREEPS_ITEM"

    .line 2628
    .line 2629
    invoke-static {v14, v6}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 2630
    .line 2631
    .line 2632
    move-result-object v6

    .line 2633
    iget-object v14, v15, La/z4l;->q:Ljava/lang/String;

    .line 2634
    .line 2635
    move-object/from16 v16, v4

    .line 2636
    .line 2637
    iget-object v4, v15, La/z4l;->j:La/l1h;

    .line 2638
    .line 2639
    iget-object v12, v12, La/ual;->a:Ljava/lang/String;

    .line 2640
    .line 2641
    move-object/from16 v20, v11

    .line 2642
    .line 2643
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 2644
    .line 2645
    invoke-static {v12, v11}, Lkotlin/text/c;->y(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2646
    .line 2647
    .line 2648
    move-result v11

    .line 2649
    if-eqz v11, :cond_55

    .line 2650
    .line 2651
    :goto_3b
    move-object/from16 v26, v2

    .line 2652
    .line 2653
    move-object/from16 v36, v9

    .line 2654
    .line 2655
    goto :goto_3f

    .line 2656
    :cond_55
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 2657
    .line 2658
    .line 2659
    move-result v11

    .line 2660
    if-nez v11, :cond_56

    .line 2661
    .line 2662
    goto :goto_3c

    .line 2663
    :cond_56
    sget-object v11, La/u0d;->a:Ljava/util/List;

    .line 2664
    .line 2665
    invoke-static {v12}, La/u0d;->c(Ljava/lang/String;)Z

    .line 2666
    .line 2667
    .line 2668
    move-result v11

    .line 2669
    if-eqz v11, :cond_57

    .line 2670
    .line 2671
    :goto_3c
    move-object v12, v0

    .line 2672
    goto :goto_3b

    .line 2673
    :cond_57
    const/4 v11, 0x1

    .line 2674
    invoke-static {v12, v13, v11}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2675
    .line 2676
    .line 2677
    move-result v17

    .line 2678
    if-eqz v17, :cond_58

    .line 2679
    .line 2680
    move-object/from16 v11, v21

    .line 2681
    .line 2682
    :goto_3d
    move-object/from16 v36, v9

    .line 2683
    .line 2684
    goto :goto_3e

    .line 2685
    :cond_58
    move-object/from16 v11, v22

    .line 2686
    .line 2687
    goto :goto_3d

    .line 2688
    :goto_3e
    sget-object v9, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 2689
    .line 2690
    move-object/from16 v26, v2

    .line 2691
    .line 2692
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 2693
    .line 2694
    filled-new-array {v2, v12}, [Ljava/lang/Object;

    .line 2695
    .line 2696
    .line 2697
    move-result-object v2

    .line 2698
    const/4 v12, 0x2

    .line 2699
    invoke-static {v2, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2700
    .line 2701
    .line 2702
    move-result-object v2

    .line 2703
    invoke-static {v9, v11, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2704
    .line 2705
    .line 2706
    move-result-object v12

    .line 2707
    :goto_3f
    iget v2, v4, La/l1h;->d:I

    .line 2708
    .line 2709
    const/4 v9, -0x1

    .line 2710
    if-ne v2, v9, :cond_59

    .line 2711
    .line 2712
    const/4 v2, 0x0

    .line 2713
    :cond_59
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2714
    .line 2715
    .line 2716
    move-result-object v2

    .line 2717
    iget-object v11, v15, La/z4l;->r:La/i6l;

    .line 2718
    .line 2719
    move-object v15, v10

    .line 2720
    invoke-static {v11}, La/xkb;->W(La/i6l;)J

    .line 2721
    .line 2722
    .line 2723
    move-result-wide v10

    .line 2724
    iget v4, v4, La/l1h;->e:I

    .line 2725
    .line 2726
    if-ne v4, v9, :cond_5a

    .line 2727
    .line 2728
    const/4 v4, 0x0

    .line 2729
    :cond_5a
    const-string v9, " / "

    .line 2730
    .line 2731
    invoke-static {v4, v9}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 2732
    .line 2733
    .line 2734
    move-result-object v4

    .line 2735
    new-instance v9, La/a4l;

    .line 2736
    .line 2737
    invoke-direct {v9, v2, v4, v10, v11}, La/a4l;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 2738
    .line 2739
    .line 2740
    new-instance v2, La/a5l;

    .line 2741
    .line 2742
    invoke-direct {v2, v6, v12, v14, v9}, La/a5l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4l;)V

    .line 2743
    .line 2744
    .line 2745
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2746
    .line 2747
    .line 2748
    move-object v10, v15

    .line 2749
    move-object/from16 v4, v16

    .line 2750
    .line 2751
    move-object/from16 v11, v20

    .line 2752
    .line 2753
    move-object/from16 v2, v26

    .line 2754
    .line 2755
    move-object/from16 v9, v36

    .line 2756
    .line 2757
    const/4 v6, 0x1

    .line 2758
    const/4 v14, 0x0

    .line 2759
    goto/16 :goto_3a

    .line 2760
    .line 2761
    :cond_5b
    move-object/from16 v26, v2

    .line 2762
    .line 2763
    move-object/from16 v36, v9

    .line 2764
    .line 2765
    move-object/from16 v20, v11

    .line 2766
    .line 2767
    move-object v4, v7

    .line 2768
    move-object/from16 v16, v10

    .line 2769
    .line 2770
    goto/16 :goto_49

    .line 2771
    .line 2772
    :cond_5c
    move-object/from16 v26, v2

    .line 2773
    .line 2774
    move-object/from16 v36, v9

    .line 2775
    .line 2776
    move-object v15, v10

    .line 2777
    move-object/from16 v20, v11

    .line 2778
    .line 2779
    const-wide/16 v6, 0xb

    .line 2780
    .line 2781
    cmp-long v2, v31, v6

    .line 2782
    .line 2783
    if-nez v2, :cond_5e

    .line 2784
    .line 2785
    new-instance v0, La/e3l;

    .line 2786
    .line 2787
    const/4 v14, 0x3

    .line 2788
    invoke-direct {v0, v14}, La/e3l;-><init>(B)V

    .line 2789
    .line 2790
    .line 2791
    invoke-static {v4, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2792
    .line 2793
    .line 2794
    move-result-object v0

    .line 2795
    new-instance v4, Ljava/util/ArrayList;

    .line 2796
    .line 2797
    const/16 v12, 0xa

    .line 2798
    .line 2799
    invoke-static {v0, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2800
    .line 2801
    .line 2802
    move-result v2

    .line 2803
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 2804
    .line 2805
    .line 2806
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2807
    .line 2808
    .line 2809
    move-result-object v0

    .line 2810
    :goto_40
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2811
    .line 2812
    .line 2813
    move-result v2

    .line 2814
    if-eqz v2, :cond_5d

    .line 2815
    .line 2816
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2817
    .line 2818
    .line 2819
    move-result-object v2

    .line 2820
    check-cast v2, La/ual;

    .line 2821
    .line 2822
    invoke-static {v2, v3}, La/xkb;->X(La/ual;La/ctf0;)La/a5l;

    .line 2823
    .line 2824
    .line 2825
    move-result-object v2

    .line 2826
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2827
    .line 2828
    .line 2829
    goto :goto_40

    .line 2830
    :cond_5d
    move-object/from16 v16, v15

    .line 2831
    .line 2832
    goto/16 :goto_49

    .line 2833
    .line 2834
    :cond_5e
    const-wide/16 v6, 0xc

    .line 2835
    .line 2836
    cmp-long v2, v31, v6

    .line 2837
    .line 2838
    if-nez v2, :cond_63

    .line 2839
    .line 2840
    new-instance v2, La/e3l;

    .line 2841
    .line 2842
    const/4 v14, 0x4

    .line 2843
    invoke-direct {v2, v14}, La/e3l;-><init>(B)V

    .line 2844
    .line 2845
    .line 2846
    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2847
    .line 2848
    .line 2849
    move-result-object v2

    .line 2850
    new-instance v4, Ljava/util/ArrayList;

    .line 2851
    .line 2852
    const/16 v12, 0xa

    .line 2853
    .line 2854
    invoke-static {v2, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2855
    .line 2856
    .line 2857
    move-result v6

    .line 2858
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 2859
    .line 2860
    .line 2861
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2862
    .line 2863
    .line 2864
    move-result-object v2

    .line 2865
    :goto_41
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2866
    .line 2867
    .line 2868
    move-result v6

    .line 2869
    if-eqz v6, :cond_5d

    .line 2870
    .line 2871
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2872
    .line 2873
    .line 2874
    move-result-object v6

    .line 2875
    check-cast v6, La/ual;

    .line 2876
    .line 2877
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2878
    .line 2879
    .line 2880
    iget-object v7, v6, La/ual;->b:La/z4l;

    .line 2881
    .line 2882
    iget v9, v7, La/z4l;->a:I

    .line 2883
    .line 2884
    const-string v10, "GOLD_ITEM"

    .line 2885
    .line 2886
    invoke-static {v9, v10}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 2887
    .line 2888
    .line 2889
    move-result-object v9

    .line 2890
    iget-object v10, v7, La/z4l;->q:Ljava/lang/String;

    .line 2891
    .line 2892
    iget-object v12, v6, La/ual;->a:Ljava/lang/String;

    .line 2893
    .line 2894
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 2895
    .line 2896
    invoke-static {v12, v6}, Lkotlin/text/c;->y(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2897
    .line 2898
    .line 2899
    move-result v6

    .line 2900
    if-eqz v6, :cond_5f

    .line 2901
    .line 2902
    goto :goto_44

    .line 2903
    :cond_5f
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 2904
    .line 2905
    .line 2906
    move-result v6

    .line 2907
    if-nez v6, :cond_60

    .line 2908
    .line 2909
    goto :goto_42

    .line 2910
    :cond_60
    sget-object v6, La/u0d;->a:Ljava/util/List;

    .line 2911
    .line 2912
    invoke-static {v12}, La/u0d;->c(Ljava/lang/String;)Z

    .line 2913
    .line 2914
    .line 2915
    move-result v6

    .line 2916
    if-eqz v6, :cond_61

    .line 2917
    .line 2918
    :goto_42
    move-object v12, v0

    .line 2919
    goto :goto_44

    .line 2920
    :cond_61
    const/4 v14, 0x1

    .line 2921
    invoke-static {v12, v13, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2922
    .line 2923
    .line 2924
    move-result v6

    .line 2925
    if-eqz v6, :cond_62

    .line 2926
    .line 2927
    move-object/from16 v6, v21

    .line 2928
    .line 2929
    goto :goto_43

    .line 2930
    :cond_62
    move-object/from16 v6, v22

    .line 2931
    .line 2932
    :goto_43
    sget-object v11, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 2933
    .line 2934
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 2935
    .line 2936
    filled-new-array {v14, v12}, [Ljava/lang/Object;

    .line 2937
    .line 2938
    .line 2939
    move-result-object v12

    .line 2940
    const/4 v14, 0x2

    .line 2941
    invoke-static {v12, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2942
    .line 2943
    .line 2944
    move-result-object v12

    .line 2945
    invoke-static {v11, v6, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2946
    .line 2947
    .line 2948
    move-result-object v12

    .line 2949
    :goto_44
    new-instance v6, La/a4l;

    .line 2950
    .line 2951
    iget-object v11, v7, La/z4l;->j:La/l1h;

    .line 2952
    .line 2953
    iget v11, v11, La/l1h;->g:I

    .line 2954
    .line 2955
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2956
    .line 2957
    .line 2958
    move-result-object v11

    .line 2959
    iget-object v7, v7, La/z4l;->r:La/i6l;

    .line 2960
    .line 2961
    move-object/from16 v16, v15

    .line 2962
    .line 2963
    invoke-static {v7}, La/xkb;->W(La/i6l;)J

    .line 2964
    .line 2965
    .line 2966
    move-result-wide v14

    .line 2967
    invoke-direct {v6, v11, v0, v14, v15}, La/a4l;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 2968
    .line 2969
    .line 2970
    new-instance v7, La/a5l;

    .line 2971
    .line 2972
    invoke-direct {v7, v9, v12, v10, v6}, La/a5l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4l;)V

    .line 2973
    .line 2974
    .line 2975
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2976
    .line 2977
    .line 2978
    move-object/from16 v15, v16

    .line 2979
    .line 2980
    goto :goto_41

    .line 2981
    :cond_63
    move-object/from16 v16, v15

    .line 2982
    .line 2983
    const-wide/16 v6, 0xd

    .line 2984
    .line 2985
    cmp-long v2, v31, v6

    .line 2986
    .line 2987
    if-nez v2, :cond_68

    .line 2988
    .line 2989
    new-instance v2, La/e3l;

    .line 2990
    .line 2991
    const/4 v14, 0x5

    .line 2992
    invoke-direct {v2, v14}, La/e3l;-><init>(B)V

    .line 2993
    .line 2994
    .line 2995
    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2996
    .line 2997
    .line 2998
    move-result-object v2

    .line 2999
    new-instance v4, Ljava/util/ArrayList;

    .line 3000
    .line 3001
    const/16 v15, 0xa

    .line 3002
    .line 3003
    invoke-static {v2, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3004
    .line 3005
    .line 3006
    move-result v6

    .line 3007
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 3008
    .line 3009
    .line 3010
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3011
    .line 3012
    .line 3013
    move-result-object v2

    .line 3014
    :goto_45
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 3015
    .line 3016
    .line 3017
    move-result v6

    .line 3018
    if-eqz v6, :cond_69

    .line 3019
    .line 3020
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3021
    .line 3022
    .line 3023
    move-result-object v6

    .line 3024
    check-cast v6, La/ual;

    .line 3025
    .line 3026
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3027
    .line 3028
    .line 3029
    iget-object v7, v6, La/ual;->b:La/z4l;

    .line 3030
    .line 3031
    iget v9, v7, La/z4l;->a:I

    .line 3032
    .line 3033
    const-string v10, "EXPERIENCE_ITEM"

    .line 3034
    .line 3035
    invoke-static {v9, v10}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 3036
    .line 3037
    .line 3038
    move-result-object v9

    .line 3039
    iget-object v10, v7, La/z4l;->q:Ljava/lang/String;

    .line 3040
    .line 3041
    iget-object v12, v6, La/ual;->a:Ljava/lang/String;

    .line 3042
    .line 3043
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 3044
    .line 3045
    invoke-static {v12, v6}, Lkotlin/text/c;->y(Ljava/lang/String;Ljava/lang/String;)Z

    .line 3046
    .line 3047
    .line 3048
    move-result v6

    .line 3049
    if-eqz v6, :cond_64

    .line 3050
    .line 3051
    goto :goto_48

    .line 3052
    :cond_64
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 3053
    .line 3054
    .line 3055
    move-result v6

    .line 3056
    if-nez v6, :cond_65

    .line 3057
    .line 3058
    goto :goto_46

    .line 3059
    :cond_65
    sget-object v6, La/u0d;->a:Ljava/util/List;

    .line 3060
    .line 3061
    invoke-static {v12}, La/u0d;->c(Ljava/lang/String;)Z

    .line 3062
    .line 3063
    .line 3064
    move-result v6

    .line 3065
    if-eqz v6, :cond_66

    .line 3066
    .line 3067
    :goto_46
    move-object v12, v0

    .line 3068
    goto :goto_48

    .line 3069
    :cond_66
    const/4 v14, 0x1

    .line 3070
    invoke-static {v12, v13, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 3071
    .line 3072
    .line 3073
    move-result v6

    .line 3074
    if-eqz v6, :cond_67

    .line 3075
    .line 3076
    move-object/from16 v6, v21

    .line 3077
    .line 3078
    goto :goto_47

    .line 3079
    :cond_67
    move-object/from16 v6, v22

    .line 3080
    .line 3081
    :goto_47
    sget-object v11, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 3082
    .line 3083
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 3084
    .line 3085
    filled-new-array {v14, v12}, [Ljava/lang/Object;

    .line 3086
    .line 3087
    .line 3088
    move-result-object v12

    .line 3089
    const/4 v14, 0x2

    .line 3090
    invoke-static {v12, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3091
    .line 3092
    .line 3093
    move-result-object v12

    .line 3094
    invoke-static {v11, v6, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 3095
    .line 3096
    .line 3097
    move-result-object v12

    .line 3098
    :goto_48
    iget-object v6, v7, La/z4l;->j:La/l1h;

    .line 3099
    .line 3100
    iget v6, v6, La/l1h;->h:I

    .line 3101
    .line 3102
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 3103
    .line 3104
    .line 3105
    move-result-object v6

    .line 3106
    iget-object v7, v7, La/z4l;->r:La/i6l;

    .line 3107
    .line 3108
    invoke-static {v7}, La/xkb;->W(La/i6l;)J

    .line 3109
    .line 3110
    .line 3111
    move-result-wide v14

    .line 3112
    new-instance v7, La/a4l;

    .line 3113
    .line 3114
    invoke-direct {v7, v6, v0, v14, v15}, La/a4l;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 3115
    .line 3116
    .line 3117
    new-instance v6, La/a5l;

    .line 3118
    .line 3119
    invoke-direct {v6, v9, v12, v10, v7}, La/a5l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4l;)V

    .line 3120
    .line 3121
    .line 3122
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3123
    .line 3124
    .line 3125
    const/16 v15, 0xa

    .line 3126
    .line 3127
    goto :goto_45

    .line 3128
    :cond_68
    sget-object v4, La/lak0;->c:La/lak0;

    .line 3129
    .line 3130
    :cond_69
    :goto_49
    invoke-virtual {v1, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3131
    .line 3132
    .line 3133
    new-instance v0, La/d4l;

    .line 3134
    .line 3135
    invoke-static {v4}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3136
    .line 3137
    .line 3138
    move-result-object v2

    .line 3139
    invoke-direct {v0, v2}, La/d4l;-><init>(La/i4;)V

    .line 3140
    .line 3141
    .line 3142
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3143
    .line 3144
    .line 3145
    :goto_4a
    move-object/from16 v10, p0

    .line 3146
    .line 3147
    move-object v4, v3

    .line 3148
    move-object/from16 v3, v16

    .line 3149
    .line 3150
    move-object/from16 v11, v20

    .line 3151
    .line 3152
    move-object/from16 v7, v23

    .line 3153
    .line 3154
    const/16 v9, 0xa

    .line 3155
    .line 3156
    move-object/from16 v20, v8

    .line 3157
    .line 3158
    goto/16 :goto_61

    .line 3159
    .line 3160
    :pswitch_6
    move-object/from16 v35, v0

    .line 3161
    .line 3162
    move-object/from16 v26, v2

    .line 3163
    .line 3164
    move-object/from16 v16, v3

    .line 3165
    .line 3166
    move-object v3, v4

    .line 3167
    move-object/from16 p0, v5

    .line 3168
    .line 3169
    move-object/from16 v28, v6

    .line 3170
    .line 3171
    move-object/from16 v34, v7

    .line 3172
    .line 3173
    move-object/from16 v20, v9

    .line 3174
    .line 3175
    move-object/from16 v36, v10

    .line 3176
    .line 3177
    move/from16 v30, v15

    .line 3178
    .line 3179
    iget-wide v4, v8, La/z6l;->a:J

    .line 3180
    .line 3181
    invoke-virtual {v3}, La/ctf0;->j()Z

    .line 3182
    .line 3183
    .line 3184
    move-result v43

    .line 3185
    move-object/from16 v15, v16

    .line 3186
    .line 3187
    invoke-static {v2, v15}, La/bkb;->W(La/c5l;La/m9s;)Z

    .line 3188
    .line 3189
    .line 3190
    move-result v0

    .line 3191
    move-object/from16 v9, v36

    .line 3192
    .line 3193
    iget-object v6, v9, La/y9l;->a:La/i6l;

    .line 3194
    .line 3195
    if-eqz v0, :cond_6a

    .line 3196
    .line 3197
    move-object/from16 v11, v20

    .line 3198
    .line 3199
    goto/16 :goto_54

    .line 3200
    .line 3201
    :cond_6a
    sget-object v0, La/dng;->b:Ljava/util/List;

    .line 3202
    .line 3203
    invoke-static {v4, v5, v0}, La/ewm0;->t(JLjava/util/List;)La/aco0;

    .line 3204
    .line 3205
    .line 3206
    move-result-object v38

    .line 3207
    sget-wide v40, La/kkg;->m:J

    .line 3208
    .line 3209
    sget-object v42, La/pno0;->a:La/pno0;

    .line 3210
    .line 3211
    new-instance v7, La/ep4;

    .line 3212
    .line 3213
    const/16 v10, 0x1d

    .line 3214
    .line 3215
    invoke-direct {v7, v3, v10}, La/ep4;-><init>(La/ctf0;B)V

    .line 3216
    .line 3217
    .line 3218
    const-string v37, "STATISTIC_ITEMS_SKILLS_TABS"

    .line 3219
    .line 3220
    move-object/from16 v39, v0

    .line 3221
    .line 3222
    move-object/from16 v44, v7

    .line 3223
    .line 3224
    invoke-static/range {v37 .. v44}, La/qem0;->k(Ljava/lang/String;La/aco0;Ljava/util/List;JLa/pno0;ZLkotlin/jvm/functions/Function1;)La/boo0;

    .line 3225
    .line 3226
    .line 3227
    move-result-object v0

    .line 3228
    move/from16 v7, v43

    .line 3229
    .line 3230
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3231
    .line 3232
    .line 3233
    sget-object v0, La/g5l;->b:La/g5l;

    .line 3234
    .line 3235
    iget-wide v10, v0, La/g5l;->a:J

    .line 3236
    .line 3237
    cmp-long v0, v4, v10

    .line 3238
    .line 3239
    if-nez v0, :cond_6d

    .line 3240
    .line 3241
    move-object/from16 v11, v20

    .line 3242
    .line 3243
    invoke-static {v15, v9, v11}, La/sac;->n0(La/m9s;La/y9l;La/y9l;)La/dal;

    .line 3244
    .line 3245
    .line 3246
    move-result-object v0

    .line 3247
    sget-object v4, La/j6l;->a:La/j6l;

    .line 3248
    .line 3249
    sget-object v5, La/i6l;->b:La/i6l;

    .line 3250
    .line 3251
    if-ne v6, v5, :cond_6b

    .line 3252
    .line 3253
    move-object v5, v9

    .line 3254
    goto :goto_4b

    .line 3255
    :cond_6b
    move-object v5, v11

    .line 3256
    :goto_4b
    invoke-static {v4, v0, v5, v3, v7}, La/fbc;->K(La/j6l;La/dal;La/y9l;La/ctf0;Z)La/zlp0;

    .line 3257
    .line 3258
    .line 3259
    move-result-object v4

    .line 3260
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3261
    .line 3262
    .line 3263
    sget-object v4, La/j6l;->b:La/j6l;

    .line 3264
    .line 3265
    iget-object v5, v11, La/y9l;->a:La/i6l;

    .line 3266
    .line 3267
    sget-object v6, La/i6l;->c:La/i6l;

    .line 3268
    .line 3269
    if-ne v5, v6, :cond_6c

    .line 3270
    .line 3271
    move-object v5, v11

    .line 3272
    goto :goto_4c

    .line 3273
    :cond_6c
    move-object v5, v9

    .line 3274
    :goto_4c
    invoke-static {v4, v0, v5, v3, v7}, La/fbc;->K(La/j6l;La/dal;La/y9l;La/ctf0;Z)La/zlp0;

    .line 3275
    .line 3276
    .line 3277
    move-result-object v0

    .line 3278
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3279
    .line 3280
    .line 3281
    goto/16 :goto_54

    .line 3282
    .line 3283
    :cond_6d
    move-object/from16 v11, v20

    .line 3284
    .line 3285
    sget-object v0, La/g5l;->c:La/g5l;

    .line 3286
    .line 3287
    iget-wide v12, v0, La/g5l;->a:J

    .line 3288
    .line 3289
    cmp-long v0, v4, v12

    .line 3290
    .line 3291
    const-wide/16 v12, 0x1

    .line 3292
    .line 3293
    if-nez v0, :cond_70

    .line 3294
    .line 3295
    invoke-static {v15, v9, v11}, La/sac;->n0(La/m9s;La/y9l;La/y9l;)La/dal;

    .line 3296
    .line 3297
    .line 3298
    move-result-object v0

    .line 3299
    new-instance v4, Ljava/util/ArrayList;

    .line 3300
    .line 3301
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 3302
    .line 3303
    .line 3304
    sget-object v5, La/j6l;->a:La/j6l;

    .line 3305
    .line 3306
    sget-object v7, La/i6l;->b:La/i6l;

    .line 3307
    .line 3308
    if-ne v6, v7, :cond_6e

    .line 3309
    .line 3310
    move-object v7, v9

    .line 3311
    goto :goto_4d

    .line 3312
    :cond_6e
    move-object v7, v11

    .line 3313
    :goto_4d
    invoke-static {v0, v12, v13, v5, v7}, La/slb;->L(La/dal;JLa/j6l;La/y9l;)La/k4l;

    .line 3314
    .line 3315
    .line 3316
    move-result-object v5

    .line 3317
    sget-object v7, La/j6l;->b:La/j6l;

    .line 3318
    .line 3319
    sget-object v10, La/i6l;->c:La/i6l;

    .line 3320
    .line 3321
    if-ne v6, v10, :cond_6f

    .line 3322
    .line 3323
    move-object v6, v9

    .line 3324
    :goto_4e
    const-wide/16 v12, 0x2

    .line 3325
    .line 3326
    goto :goto_4f

    .line 3327
    :cond_6f
    move-object v6, v11

    .line 3328
    goto :goto_4e

    .line 3329
    :goto_4f
    invoke-static {v0, v12, v13, v7, v6}, La/slb;->L(La/dal;JLa/j6l;La/y9l;)La/k4l;

    .line 3330
    .line 3331
    .line 3332
    move-result-object v0

    .line 3333
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3334
    .line 3335
    .line 3336
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3337
    .line 3338
    .line 3339
    invoke-virtual {v1, v4}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 3340
    .line 3341
    .line 3342
    goto :goto_54

    .line 3343
    :cond_70
    sget-object v0, La/g5l;->d:La/g5l;

    .line 3344
    .line 3345
    iget-wide v12, v0, La/g5l;->a:J

    .line 3346
    .line 3347
    cmp-long v0, v4, v12

    .line 3348
    .line 3349
    if-nez v0, :cond_73

    .line 3350
    .line 3351
    invoke-static {v15, v9, v11}, La/sac;->n0(La/m9s;La/y9l;La/y9l;)La/dal;

    .line 3352
    .line 3353
    .line 3354
    move-result-object v0

    .line 3355
    new-instance v4, Ljava/util/ArrayList;

    .line 3356
    .line 3357
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 3358
    .line 3359
    .line 3360
    sget-object v5, La/j6l;->a:La/j6l;

    .line 3361
    .line 3362
    sget-object v7, La/i6l;->b:La/i6l;

    .line 3363
    .line 3364
    if-ne v6, v7, :cond_71

    .line 3365
    .line 3366
    move-object v7, v9

    .line 3367
    :goto_50
    const-wide/16 v12, 0x1

    .line 3368
    .line 3369
    goto :goto_51

    .line 3370
    :cond_71
    move-object v7, v11

    .line 3371
    goto :goto_50

    .line 3372
    :goto_51
    invoke-static {v0, v12, v13, v5, v7}, La/tlb;->G(La/dal;JLa/j6l;La/y9l;)La/u4l;

    .line 3373
    .line 3374
    .line 3375
    move-result-object v5

    .line 3376
    sget-object v7, La/j6l;->b:La/j6l;

    .line 3377
    .line 3378
    sget-object v10, La/i6l;->c:La/i6l;

    .line 3379
    .line 3380
    if-ne v6, v10, :cond_72

    .line 3381
    .line 3382
    move-object v6, v9

    .line 3383
    :goto_52
    const-wide/16 v12, 0x2

    .line 3384
    .line 3385
    goto :goto_53

    .line 3386
    :cond_72
    move-object v6, v11

    .line 3387
    goto :goto_52

    .line 3388
    :goto_53
    invoke-static {v0, v12, v13, v7, v6}, La/tlb;->G(La/dal;JLa/j6l;La/y9l;)La/u4l;

    .line 3389
    .line 3390
    .line 3391
    move-result-object v0

    .line 3392
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3393
    .line 3394
    .line 3395
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3396
    .line 3397
    .line 3398
    invoke-virtual {v1, v4}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 3399
    .line 3400
    .line 3401
    :cond_73
    :goto_54
    move-object/from16 v10, p0

    .line 3402
    .line 3403
    move-object/from16 v26, v2

    .line 3404
    .line 3405
    move-object v4, v3

    .line 3406
    move-object/from16 v20, v8

    .line 3407
    .line 3408
    move-object/from16 v36, v9

    .line 3409
    .line 3410
    move-object v3, v15

    .line 3411
    move-object/from16 v7, v23

    .line 3412
    .line 3413
    goto/16 :goto_2b

    .line 3414
    .line 3415
    :pswitch_7
    move-object/from16 v35, v0

    .line 3416
    .line 3417
    move-object/from16 p0, v5

    .line 3418
    .line 3419
    move-object/from16 v28, v6

    .line 3420
    .line 3421
    move-object/from16 v34, v7

    .line 3422
    .line 3423
    move-object v11, v9

    .line 3424
    move-object v9, v10

    .line 3425
    move/from16 v30, v15

    .line 3426
    .line 3427
    move-object v15, v3

    .line 3428
    move-object v3, v4

    .line 3429
    invoke-virtual {v3}, La/ctf0;->j()Z

    .line 3430
    .line 3431
    .line 3432
    move-result v6

    .line 3433
    move-object v3, v15

    .line 3434
    move-object/from16 v7, v23

    .line 3435
    .line 3436
    const/4 v14, 0x0

    .line 3437
    const/16 v15, 0xa

    .line 3438
    .line 3439
    invoke-static/range {v1 .. v6}, La/wzb;->J(La/lc00;La/c5l;La/m9s;La/ctf0;La/yws;Z)V

    .line 3440
    .line 3441
    .line 3442
    :cond_74
    :goto_55
    move-object/from16 v26, v2

    .line 3443
    .line 3444
    move-object v10, v5

    .line 3445
    move-object/from16 v20, v8

    .line 3446
    .line 3447
    move-object/from16 v36, v9

    .line 3448
    .line 3449
    move v9, v15

    .line 3450
    goto/16 :goto_61

    .line 3451
    .line 3452
    :pswitch_8
    move-object/from16 v14, p1

    .line 3453
    .line 3454
    move-object/from16 v35, v0

    .line 3455
    .line 3456
    move-object/from16 v28, v6

    .line 3457
    .line 3458
    move-object/from16 v34, v7

    .line 3459
    .line 3460
    move-object v11, v9

    .line 3461
    move-object v9, v10

    .line 3462
    move-object v0, v12

    .line 3463
    move/from16 v30, v15

    .line 3464
    .line 3465
    move-object/from16 v7, v23

    .line 3466
    .line 3467
    const/16 v15, 0xa

    .line 3468
    .line 3469
    invoke-virtual {v4}, La/ctf0;->j()Z

    .line 3470
    .line 3471
    .line 3472
    move-result v6

    .line 3473
    invoke-static {v2}, La/bkb;->V(La/c5l;)Z

    .line 3474
    .line 3475
    .line 3476
    move-result v10

    .line 3477
    if-nez v10, :cond_74

    .line 3478
    .line 3479
    if-eqz v6, :cond_75

    .line 3480
    .line 3481
    goto :goto_55

    .line 3482
    :cond_75
    iget-wide v14, v3, La/m9s;->a:J

    .line 3483
    .line 3484
    iget-object v6, v3, La/m9s;->c:Ljava/util/List;

    .line 3485
    .line 3486
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 3487
    .line 3488
    .line 3489
    move-result-object v6

    .line 3490
    check-cast v6, Ljava/lang/Long;

    .line 3491
    .line 3492
    const-wide/16 v16, 0x0

    .line 3493
    .line 3494
    if-eqz v6, :cond_76

    .line 3495
    .line 3496
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 3497
    .line 3498
    .line 3499
    move-result-wide v19

    .line 3500
    move-object v10, v5

    .line 3501
    move-wide/from16 v5, v19

    .line 3502
    .line 3503
    goto :goto_56

    .line 3504
    :cond_76
    move-object v10, v5

    .line 3505
    move-wide/from16 v5, v16

    .line 3506
    .line 3507
    :goto_56
    invoke-static/range {v28 .. v28}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 3508
    .line 3509
    .line 3510
    move-result-object v12

    .line 3511
    check-cast v12, Ljava/lang/String;

    .line 3512
    .line 3513
    if-nez v12, :cond_77

    .line 3514
    .line 3515
    move-object v12, v0

    .line 3516
    move-object/from16 v19, v12

    .line 3517
    .line 3518
    goto :goto_57

    .line 3519
    :cond_77
    move-object/from16 v19, v0

    .line 3520
    .line 3521
    :goto_57
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 3522
    .line 3523
    invoke-static {v12, v0}, Lkotlin/text/c;->y(Ljava/lang/String;Ljava/lang/String;)Z

    .line 3524
    .line 3525
    .line 3526
    move-result v0

    .line 3527
    if-eqz v0, :cond_78

    .line 3528
    .line 3529
    move-object/from16 v26, v2

    .line 3530
    .line 3531
    move-object/from16 v20, v8

    .line 3532
    .line 3533
    goto :goto_5b

    .line 3534
    :cond_78
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 3535
    .line 3536
    .line 3537
    move-result v0

    .line 3538
    if-nez v0, :cond_79

    .line 3539
    .line 3540
    goto :goto_58

    .line 3541
    :cond_79
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 3542
    .line 3543
    invoke-static {v12}, La/u0d;->c(Ljava/lang/String;)Z

    .line 3544
    .line 3545
    .line 3546
    move-result v0

    .line 3547
    if-eqz v0, :cond_7a

    .line 3548
    .line 3549
    :goto_58
    move-object/from16 v26, v2

    .line 3550
    .line 3551
    move-object/from16 v20, v8

    .line 3552
    .line 3553
    move-object/from16 v12, v19

    .line 3554
    .line 3555
    goto :goto_5b

    .line 3556
    :cond_7a
    const/4 v0, 0x1

    .line 3557
    invoke-static {v12, v13, v0}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 3558
    .line 3559
    .line 3560
    move-result v20

    .line 3561
    if-eqz v20, :cond_7b

    .line 3562
    .line 3563
    move-object/from16 v0, v21

    .line 3564
    .line 3565
    :goto_59
    move-object/from16 v26, v2

    .line 3566
    .line 3567
    goto :goto_5a

    .line 3568
    :cond_7b
    move-object/from16 v0, v22

    .line 3569
    .line 3570
    goto :goto_59

    .line 3571
    :goto_5a
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 3572
    .line 3573
    move-object/from16 v20, v8

    .line 3574
    .line 3575
    sget-object v8, La/ujn;->h:Ljava/lang/String;

    .line 3576
    .line 3577
    filled-new-array {v8, v12}, [Ljava/lang/Object;

    .line 3578
    .line 3579
    .line 3580
    move-result-object v8

    .line 3581
    const/4 v12, 0x2

    .line 3582
    invoke-static {v8, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3583
    .line 3584
    .line 3585
    move-result-object v8

    .line 3586
    invoke-static {v2, v0, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 3587
    .line 3588
    .line 3589
    move-result-object v12

    .line 3590
    :goto_5b
    iget-object v0, v9, La/y9l;->b:Ljava/util/List;

    .line 3591
    .line 3592
    new-instance v2, Ljava/util/ArrayList;

    .line 3593
    .line 3594
    move-object/from16 v36, v9

    .line 3595
    .line 3596
    const/16 v8, 0xa

    .line 3597
    .line 3598
    invoke-static {v0, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3599
    .line 3600
    .line 3601
    move-result v9

    .line 3602
    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 3603
    .line 3604
    .line 3605
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3606
    .line 3607
    .line 3608
    move-result-object v0

    .line 3609
    :goto_5c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3610
    .line 3611
    .line 3612
    move-result v8

    .line 3613
    if-eqz v8, :cond_7c

    .line 3614
    .line 3615
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3616
    .line 3617
    .line 3618
    move-result-object v8

    .line 3619
    check-cast v8, La/z4l;

    .line 3620
    .line 3621
    invoke-static {v8}, La/wwb;->T(La/z4l;)La/u6l;

    .line 3622
    .line 3623
    .line 3624
    move-result-object v8

    .line 3625
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3626
    .line 3627
    .line 3628
    goto :goto_5c

    .line 3629
    :cond_7c
    new-instance v0, La/y4l;

    .line 3630
    .line 3631
    invoke-direct {v0, v5, v6, v12, v2}, La/y4l;-><init>(JLjava/lang/String;Ljava/util/ArrayList;)V

    .line 3632
    .line 3633
    .line 3634
    iget-object v2, v3, La/m9s;->d:Ljava/util/List;

    .line 3635
    .line 3636
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 3637
    .line 3638
    .line 3639
    move-result-object v2

    .line 3640
    check-cast v2, Ljava/lang/Long;

    .line 3641
    .line 3642
    if-eqz v2, :cond_7d

    .line 3643
    .line 3644
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 3645
    .line 3646
    .line 3647
    move-result-wide v16

    .line 3648
    :cond_7d
    move-wide/from16 v5, v16

    .line 3649
    .line 3650
    invoke-static/range {v24 .. v24}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 3651
    .line 3652
    .line 3653
    move-result-object v2

    .line 3654
    move-object v12, v2

    .line 3655
    check-cast v12, Ljava/lang/String;

    .line 3656
    .line 3657
    if-nez v12, :cond_7e

    .line 3658
    .line 3659
    move-object/from16 v12, v19

    .line 3660
    .line 3661
    :cond_7e
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 3662
    .line 3663
    invoke-static {v12, v2}, Lkotlin/text/c;->y(Ljava/lang/String;Ljava/lang/String;)Z

    .line 3664
    .line 3665
    .line 3666
    move-result v2

    .line 3667
    if-eqz v2, :cond_7f

    .line 3668
    .line 3669
    goto :goto_5f

    .line 3670
    :cond_7f
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 3671
    .line 3672
    .line 3673
    move-result v2

    .line 3674
    if-nez v2, :cond_80

    .line 3675
    .line 3676
    goto :goto_5d

    .line 3677
    :cond_80
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 3678
    .line 3679
    invoke-static {v12}, La/u0d;->c(Ljava/lang/String;)Z

    .line 3680
    .line 3681
    .line 3682
    move-result v2

    .line 3683
    if-eqz v2, :cond_81

    .line 3684
    .line 3685
    :goto_5d
    move-object/from16 v12, v19

    .line 3686
    .line 3687
    goto :goto_5f

    .line 3688
    :cond_81
    const/4 v2, 0x1

    .line 3689
    invoke-static {v12, v13, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 3690
    .line 3691
    .line 3692
    move-result v2

    .line 3693
    if-eqz v2, :cond_82

    .line 3694
    .line 3695
    move-object/from16 v2, v21

    .line 3696
    .line 3697
    goto :goto_5e

    .line 3698
    :cond_82
    move-object/from16 v2, v22

    .line 3699
    .line 3700
    :goto_5e
    sget-object v8, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 3701
    .line 3702
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 3703
    .line 3704
    filled-new-array {v9, v12}, [Ljava/lang/Object;

    .line 3705
    .line 3706
    .line 3707
    move-result-object v9

    .line 3708
    const/4 v12, 0x2

    .line 3709
    invoke-static {v9, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3710
    .line 3711
    .line 3712
    move-result-object v9

    .line 3713
    invoke-static {v8, v2, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 3714
    .line 3715
    .line 3716
    move-result-object v12

    .line 3717
    :goto_5f
    iget-object v2, v11, La/y9l;->b:Ljava/util/List;

    .line 3718
    .line 3719
    new-instance v8, Ljava/util/ArrayList;

    .line 3720
    .line 3721
    const/16 v9, 0xa

    .line 3722
    .line 3723
    invoke-static {v2, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3724
    .line 3725
    .line 3726
    move-result v13

    .line 3727
    invoke-direct {v8, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 3728
    .line 3729
    .line 3730
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3731
    .line 3732
    .line 3733
    move-result-object v2

    .line 3734
    :goto_60
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 3735
    .line 3736
    .line 3737
    move-result v13

    .line 3738
    if-eqz v13, :cond_83

    .line 3739
    .line 3740
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3741
    .line 3742
    .line 3743
    move-result-object v13

    .line 3744
    check-cast v13, La/z4l;

    .line 3745
    .line 3746
    invoke-static {v13}, La/wwb;->T(La/z4l;)La/u6l;

    .line 3747
    .line 3748
    .line 3749
    move-result-object v13

    .line 3750
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3751
    .line 3752
    .line 3753
    goto :goto_60

    .line 3754
    :cond_83
    new-instance v2, La/y4l;

    .line 3755
    .line 3756
    invoke-direct {v2, v5, v6, v12, v8}, La/y4l;-><init>(JLjava/lang/String;Ljava/util/ArrayList;)V

    .line 3757
    .line 3758
    .line 3759
    new-instance v5, La/lal;

    .line 3760
    .line 3761
    invoke-direct {v5, v14, v15, v0, v2}, La/lal;-><init>(JLa/y4l;La/y4l;)V

    .line 3762
    .line 3763
    .line 3764
    invoke-virtual {v1, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3765
    .line 3766
    .line 3767
    :goto_61
    move-object/from16 v23, v7

    .line 3768
    .line 3769
    move-object v5, v10

    .line 3770
    move-object v9, v11

    .line 3771
    move-object/from16 v8, v20

    .line 3772
    .line 3773
    move-object/from16 v2, v26

    .line 3774
    .line 3775
    move-object/from16 v6, v28

    .line 3776
    .line 3777
    move/from16 v15, v30

    .line 3778
    .line 3779
    move-object/from16 v7, v34

    .line 3780
    .line 3781
    move-object/from16 v0, v35

    .line 3782
    .line 3783
    move-object/from16 v10, v36

    .line 3784
    .line 3785
    const/16 p1, 0x0

    .line 3786
    .line 3787
    goto/16 :goto_5

    .line 3788
    .line 3789
    :cond_84
    move-object v0, v7

    .line 3790
    move-object/from16 v7, v23

    .line 3791
    .line 3792
    iget-boolean v0, v0, La/x9l;->e:Z

    .line 3793
    .line 3794
    new-instance v2, Ljava/util/ArrayList;

    .line 3795
    .line 3796
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3797
    .line 3798
    .line 3799
    iget v3, v3, La/m9s;->D:I

    .line 3800
    .line 3801
    if-lez v3, :cond_85

    .line 3802
    .line 3803
    if-eqz v0, :cond_85

    .line 3804
    .line 3805
    invoke-static {v4}, La/feb;->K(La/ctf0;)La/rx;

    .line 3806
    .line 3807
    .line 3808
    move-result-object v3

    .line 3809
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3810
    .line 3811
    .line 3812
    :cond_85
    if-eqz v0, :cond_86

    .line 3813
    .line 3814
    invoke-static {v4, v7}, La/n7x;->w(La/ctf0;Ljava/util/List;)La/rx;

    .line 3815
    .line 3816
    .line 3817
    move-result-object v0

    .line 3818
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3819
    .line 3820
    .line 3821
    :cond_86
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 3822
    .line 3823
    .line 3824
    move-result v0

    .line 3825
    if-eqz v0, :cond_87

    .line 3826
    .line 3827
    goto :goto_62

    .line 3828
    :cond_87
    new-instance v0, La/psv;

    .line 3829
    .line 3830
    const-string v3, "ADDITIONAL_INFO_HEADER"

    .line 3831
    .line 3832
    const v4, 0x7f13006f

    .line 3833
    .line 3834
    .line 3835
    invoke-direct {v0, v3, v4}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 3836
    .line 3837
    .line 3838
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3839
    .line 3840
    .line 3841
    new-instance v0, La/wy;

    .line 3842
    .line 3843
    const-string v3, "ADDITIONAL_INFO"

    .line 3844
    .line 3845
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3846
    .line 3847
    .line 3848
    move-result-object v2

    .line 3849
    invoke-direct {v0, v2, v3}, La/wy;-><init>(La/i4;Ljava/lang/String;)V

    .line 3850
    .line 3851
    .line 3852
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3853
    .line 3854
    .line 3855
    :goto_62
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3856
    .line 3857
    .line 3858
    move-result-object v0

    .line 3859
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3860
    .line 3861
    .line 3862
    move-result-object v0

    .line 3863
    return-object v0

    .line 3864
    :cond_88
    sget-object v0, La/lak0;->c:La/lak0;

    .line 3865
    .line 3866
    return-object v0

    .line 3867
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
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


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wal;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/wal;->b:La/gv1;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v0, p1

    .line 12
    .line 13
    check-cast v0, La/fee;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, v3, La/gv1;->t:La/n0o0;

    .line 19
    .line 20
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/fee;

    .line 25
    .line 26
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, La/szj0;

    .line 31
    .line 32
    iget-object v1, v3, La/gv1;->B:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, La/f9l;

    .line 35
    .line 36
    iget-object v1, v1, La/f9l;->q:La/sff0;

    .line 37
    .line 38
    iget-boolean v1, v1, La/sff0;->K1:Z

    .line 39
    .line 40
    iget-object v2, v3, La/gv1;->b:La/ctf0;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/pzw;->W(La/szj0;ZLa/ctf0;)La/sam;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :pswitch_0
    iget-object v0, v3, La/gv1;->y:La/n0o0;

    .line 48
    .line 49
    iget-object v1, v3, La/gv1;->C:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v4, v1

    .line 52
    check-cast v4, La/g2v;

    .line 53
    .line 54
    move-object/from16 v1, p1

    .line 55
    .line 56
    check-cast v1, La/fee;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, La/jlr;

    .line 66
    .line 67
    if-eqz v1, :cond_7

    .line 68
    .line 69
    instance-of v5, v1, La/xkr;

    .line 70
    .line 71
    const-wide/16 v6, 0x1

    .line 72
    .line 73
    if-eqz v5, :cond_1

    .line 74
    .line 75
    iget-object v1, v3, La/gv1;->d:La/n0o0;

    .line 76
    .line 77
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, La/fee;

    .line 82
    .line 83
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-nez v1, :cond_0

    .line 88
    .line 89
    invoke-static {v6, v7}, La/ozb;->K(J)La/pb10;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    const-wide/16 v15, 0x0

    .line 94
    .line 95
    const/16 v17, 0x3fe

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    const/4 v7, 0x0

    .line 99
    const/4 v8, 0x0

    .line 100
    const/4 v9, 0x0

    .line 101
    const/4 v10, 0x0

    .line 102
    const/4 v11, 0x0

    .line 103
    const/4 v12, 0x0

    .line 104
    const-wide/16 v13, 0x0

    .line 105
    .line 106
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v2, La/nss;

    .line 111
    .line 112
    invoke-direct {v2, v0}, La/nss;-><init>(La/mdm;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_1

    .line 116
    .line 117
    :cond_0
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, La/fee;

    .line 122
    .line 123
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v2, La/pss;

    .line 129
    .line 130
    invoke-direct {v2, v0}, La/pss;-><init>(La/l7m0;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_1

    .line 134
    .line 135
    :cond_1
    instance-of v5, v1, La/alr;

    .line 136
    .line 137
    if-eqz v5, :cond_2

    .line 138
    .line 139
    new-instance v2, La/lss;

    .line 140
    .line 141
    sget-object v0, La/pb10;->v:La/pb10;

    .line 142
    .line 143
    invoke-static {v6, v7, v0}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    sget-object v7, La/ldm;->b:La/ldm;

    .line 148
    .line 149
    const-wide/16 v15, 0x0

    .line 150
    .line 151
    const/16 v17, 0x25a

    .line 152
    .line 153
    const/4 v6, 0x0

    .line 154
    const/4 v8, 0x0

    .line 155
    const/4 v9, 0x0

    .line 156
    const v10, 0x7f130677

    .line 157
    .line 158
    .line 159
    const/4 v11, 0x0

    .line 160
    const v12, 0x7f131690

    .line 161
    .line 162
    .line 163
    const-wide/16 v13, 0x2710

    .line 164
    .line 165
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v1, v3, La/gv1;->s:La/n0o0;

    .line 170
    .line 171
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, La/fee;

    .line 176
    .line 177
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, La/da10;

    .line 182
    .line 183
    iget-short v1, v1, La/da10;->a:S

    .line 184
    .line 185
    int-to-long v3, v1

    .line 186
    invoke-direct {v2, v3, v4, v0}, La/lss;-><init>(JLa/mdm;)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_1

    .line 190
    .line 191
    :cond_2
    instance-of v3, v1, La/blr;

    .line 192
    .line 193
    if-eqz v3, :cond_3

    .line 194
    .line 195
    new-instance v0, La/pdq;

    .line 196
    .line 197
    invoke-static {v6, v7}, La/ozb;->K(J)La/pb10;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    sget-object v7, La/ldm;->b:La/ldm;

    .line 202
    .line 203
    const-wide/16 v15, 0x0

    .line 204
    .line 205
    const/16 v17, 0x3fa

    .line 206
    .line 207
    const/4 v6, 0x0

    .line 208
    const/4 v8, 0x0

    .line 209
    const/4 v9, 0x0

    .line 210
    const/4 v10, 0x0

    .line 211
    const/4 v11, 0x0

    .line 212
    const/4 v12, 0x0

    .line 213
    const-wide/16 v13, 0x0

    .line 214
    .line 215
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    check-cast v1, La/blr;

    .line 220
    .line 221
    iget-wide v3, v1, La/blr;->c:J

    .line 222
    .line 223
    const v1, 0x7f13168b

    .line 224
    .line 225
    .line 226
    invoke-direct {v0, v2, v3, v4, v1}, La/pdq;-><init>(La/mdm;JI)V

    .line 227
    .line 228
    .line 229
    new-instance v2, La/mss;

    .line 230
    .line 231
    invoke-direct {v2, v0}, La/mss;-><init>(La/pdq;)V

    .line 232
    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_3
    instance-of v3, v1, La/clr;

    .line 236
    .line 237
    if-eqz v3, :cond_4

    .line 238
    .line 239
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    check-cast v0, La/fee;

    .line 244
    .line 245
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    new-instance v2, La/pss;

    .line 251
    .line 252
    invoke-direct {v2, v0}, La/pss;-><init>(La/l7m0;)V

    .line 253
    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_4
    instance-of v0, v1, La/dlr;

    .line 257
    .line 258
    if-eqz v0, :cond_5

    .line 259
    .line 260
    goto :goto_0

    .line 261
    :cond_5
    instance-of v0, v1, La/ilr;

    .line 262
    .line 263
    if-eqz v0, :cond_6

    .line 264
    .line 265
    :goto_0
    invoke-static {v6, v7}, La/ozb;->K(J)La/pb10;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    const-wide/16 v15, 0x0

    .line 270
    .line 271
    const/16 v17, 0x3fe

    .line 272
    .line 273
    const/4 v6, 0x0

    .line 274
    const/4 v7, 0x0

    .line 275
    const/4 v8, 0x0

    .line 276
    const/4 v9, 0x0

    .line 277
    const/4 v10, 0x0

    .line 278
    const/4 v11, 0x0

    .line 279
    const/4 v12, 0x0

    .line 280
    const-wide/16 v13, 0x0

    .line 281
    .line 282
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    new-instance v2, La/nss;

    .line 287
    .line 288
    invoke-direct {v2, v0}, La/nss;-><init>(La/mdm;)V

    .line 289
    .line 290
    .line 291
    goto :goto_1

    .line 292
    :cond_6
    instance-of v0, v1, La/elr;

    .line 293
    .line 294
    if-eqz v0, :cond_7

    .line 295
    .line 296
    sget-object v0, La/pb10;->v:La/pb10;

    .line 297
    .line 298
    invoke-static {v6, v7, v0}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    sget-object v7, La/ldm;->b:La/ldm;

    .line 303
    .line 304
    const-wide/16 v15, 0x0

    .line 305
    .line 306
    const/16 v17, 0x35a

    .line 307
    .line 308
    const/4 v6, 0x0

    .line 309
    const/4 v8, 0x0

    .line 310
    const/4 v9, 0x0

    .line 311
    const v10, 0x7f130922

    .line 312
    .line 313
    .line 314
    const/4 v11, 0x0

    .line 315
    const v12, 0x7f130987

    .line 316
    .line 317
    .line 318
    const-wide/16 v13, 0x0

    .line 319
    .line 320
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    new-instance v2, La/oss;

    .line 325
    .line 326
    invoke-direct {v2, v0}, La/oss;-><init>(La/mdm;)V

    .line 327
    .line 328
    .line 329
    goto :goto_1

    .line 330
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 331
    .line 332
    .line 333
    :goto_1
    return-object v2

    .line 334
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/wal;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    return-object v0

    .line 339
    :pswitch_2
    move-object/from16 v0, p1

    .line 340
    .line 341
    check-cast v0, La/fee;

    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    move-object v4, v0

    .line 351
    check-cast v4, La/jlr;

    .line 352
    .line 353
    iget-object v0, v3, La/gv1;->f:La/n0o0;

    .line 354
    .line 355
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    check-cast v0, La/fee;

    .line 360
    .line 361
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    check-cast v0, Ljava/lang/Boolean;

    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    iget-object v0, v3, La/gv1;->B:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v0, La/f9l;

    .line 374
    .line 375
    iget-object v1, v0, La/f9l;->q:La/sff0;

    .line 376
    .line 377
    iget-boolean v6, v1, La/sff0;->J:Z

    .line 378
    .line 379
    iget-object v1, v3, La/gv1;->l:La/n0o0;

    .line 380
    .line 381
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    check-cast v1, La/fee;

    .line 386
    .line 387
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    check-cast v1, Ljava/lang/Boolean;

    .line 392
    .line 393
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 394
    .line 395
    .line 396
    move-result v7

    .line 397
    iget-object v1, v3, La/gv1;->m:La/n0o0;

    .line 398
    .line 399
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    check-cast v1, La/fee;

    .line 404
    .line 405
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    check-cast v1, Ljava/lang/Boolean;

    .line 410
    .line 411
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 412
    .line 413
    .line 414
    move-result v8

    .line 415
    iget-boolean v9, v0, La/f9l;->t:Z

    .line 416
    .line 417
    iget-object v0, v3, La/gv1;->k:La/n0o0;

    .line 418
    .line 419
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    check-cast v0, La/fee;

    .line 424
    .line 425
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    move-object v10, v0

    .line 430
    check-cast v10, La/yws;

    .line 431
    .line 432
    invoke-static/range {v4 .. v10}, La/ulb;->j0(La/jlr;ZZZZZLa/yws;)La/its;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    return-object v0

    .line 437
    :pswitch_3
    move-object/from16 v0, p1

    .line 438
    .line 439
    check-cast v0, La/fee;

    .line 440
    .line 441
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    check-cast v0, La/jlr;

    .line 449
    .line 450
    invoke-static {v0}, La/d5c;->C(La/jlr;)La/m9s;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    iget-object v7, v3, La/gv1;->b:La/ctf0;

    .line 455
    .line 456
    iget-object v0, v3, La/gv1;->B:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v0, La/f9l;

    .line 459
    .line 460
    if-eqz v4, :cond_8

    .line 461
    .line 462
    iget-object v1, v3, La/gv1;->d:La/n0o0;

    .line 463
    .line 464
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    check-cast v1, La/fee;

    .line 469
    .line 470
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    check-cast v1, La/x9l;

    .line 475
    .line 476
    if-eqz v1, :cond_8

    .line 477
    .line 478
    invoke-static {v1, v4}, La/zjb;->P(La/x9l;La/m9s;)La/la30;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    :cond_8
    move-object v8, v2

    .line 483
    iget-object v1, v3, La/gv1;->f:La/n0o0;

    .line 484
    .line 485
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    check-cast v1, La/fee;

    .line 490
    .line 491
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    check-cast v1, Ljava/lang/Boolean;

    .line 496
    .line 497
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 498
    .line 499
    .line 500
    move-result v9

    .line 501
    iget-object v1, v3, La/gv1;->i:La/n0o0;

    .line 502
    .line 503
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    check-cast v1, La/fee;

    .line 508
    .line 509
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    move-object v10, v1

    .line 514
    check-cast v10, Ljava/util/List;

    .line 515
    .line 516
    iget-boolean v11, v0, La/f9l;->z:Z

    .line 517
    .line 518
    iget-object v1, v3, La/gv1;->e:La/n0o0;

    .line 519
    .line 520
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    check-cast v1, La/fee;

    .line 525
    .line 526
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    check-cast v1, La/ypl0;

    .line 531
    .line 532
    iget-object v1, v1, La/ypl0;->c:La/lel0;

    .line 533
    .line 534
    iget-object v13, v1, La/lel0;->a:Ljava/lang/String;

    .line 535
    .line 536
    iget-object v0, v0, La/f9l;->a:Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 537
    .line 538
    iget-object v14, v0, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;->g:Ljava/lang/String;

    .line 539
    .line 540
    const/4 v5, 0x0

    .line 541
    const/4 v6, 0x0

    .line 542
    const/4 v12, 0x1

    .line 543
    invoke-static/range {v4 .. v14}, La/hkb;->P(La/m9s;ZZLa/ctf0;La/la30;ZLjava/util/List;ZZLjava/lang/String;Ljava/lang/String;)La/zqg;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    return-object v0

    .line 548
    :pswitch_4
    move-object/from16 v0, p1

    .line 549
    .line 550
    check-cast v0, La/fee;

    .line 551
    .line 552
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    new-instance v0, La/avs;

    .line 556
    .line 557
    iget-object v1, v3, La/gv1;->j:La/n0o0;

    .line 558
    .line 559
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    check-cast v1, La/fee;

    .line 564
    .line 565
    iget-object v1, v1, La/fee;->d:La/pz40;

    .line 566
    .line 567
    iget-object v2, v3, La/gv1;->n:La/n0o0;

    .line 568
    .line 569
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    check-cast v2, La/fee;

    .line 574
    .line 575
    iget-object v2, v2, La/fee;->d:La/pz40;

    .line 576
    .line 577
    iget-object v4, v3, La/gv1;->g:La/n0o0;

    .line 578
    .line 579
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v4

    .line 583
    check-cast v4, La/fee;

    .line 584
    .line 585
    iget-object v4, v4, La/fee;->d:La/pz40;

    .line 586
    .line 587
    iget-object v3, v3, La/gv1;->h:La/n0o0;

    .line 588
    .line 589
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v3

    .line 593
    check-cast v3, La/fee;

    .line 594
    .line 595
    iget-object v3, v3, La/fee;->d:La/pz40;

    .line 596
    .line 597
    invoke-direct {v0, v1, v2, v4, v3}, La/avs;-><init>(La/l7m0;La/l7m0;La/l7m0;La/l7m0;)V

    .line 598
    .line 599
    .line 600
    return-object v0

    .line 601
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
