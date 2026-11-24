.class public final La/a4o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/b4o;


# direct methods
.method public constructor <init>(La/b4o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/a4o;->a:La/b4o;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Void;

    .line 4
    .line 5
    move-object/from16 v0, p0

    .line 6
    .line 7
    iget-object v0, v0, La/a4o;->a:La/b4o;

    .line 8
    .line 9
    iget-object v1, v0, La/b4o;->f:La/n0o0;

    .line 10
    .line 11
    invoke-virtual {v0}, La/b4o;->a()La/fee;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    iget-object v2, v0, La/b4o;->m:La/n0o0;

    .line 28
    .line 29
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, La/fee;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v2, v0, La/b4o;->n:La/n0o0;

    .line 37
    .line 38
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, La/fee;

    .line 43
    .line 44
    :goto_0
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, La/fee;

    .line 49
    .line 50
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iget-object v5, v0, La/b4o;->c:La/ctf0;

    .line 61
    .line 62
    iget-object v6, v0, La/b4o;->h:La/n0o0;

    .line 63
    .line 64
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, La/fee;

    .line 69
    .line 70
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    check-cast v6, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    iget-object v7, v0, La/b4o;->l:La/n0o0;

    .line 81
    .line 82
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, La/fee;

    .line 87
    .line 88
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    check-cast v7, Ljava/lang/String;

    .line 93
    .line 94
    iget-object v8, v0, La/b4o;->j:La/n0o0;

    .line 95
    .line 96
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    check-cast v8, La/fee;

    .line 101
    .line 102
    invoke-virtual {v8}, La/fee;->c()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, La/ygq0;

    .line 107
    .line 108
    invoke-virtual {v0}, La/b4o;->a()La/fee;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-virtual {v9}, La/fee;->c()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    check-cast v9, Ljava/lang/Number;

    .line 117
    .line 118
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    const/4 v10, 0x0

    .line 123
    const/4 v11, 0x1

    .line 124
    if-nez v9, :cond_1

    .line 125
    .line 126
    move v9, v11

    .line 127
    goto :goto_1

    .line 128
    :cond_1
    move v9, v10

    .line 129
    :goto_1
    iget-object v12, v0, La/b4o;->k:La/n0o0;

    .line 130
    .line 131
    invoke-virtual {v12}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    check-cast v12, La/fee;

    .line 136
    .line 137
    invoke-virtual {v12}, La/fee;->c()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    check-cast v12, Ljava/lang/Boolean;

    .line 142
    .line 143
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    iget-object v13, v0, La/b4o;->a:La/y3o;

    .line 148
    .line 149
    iget-object v13, v13, La/y3o;->a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 150
    .line 151
    instance-of v13, v13, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$BestGames;

    .line 152
    .line 153
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    check-cast v1, La/fee;

    .line 158
    .line 159
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    const/4 v14, 0x0

    .line 170
    if-nez v1, :cond_5

    .line 171
    .line 172
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, La/j0g0;

    .line 177
    .line 178
    if-eqz v1, :cond_3

    .line 179
    .line 180
    iget-object v1, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 181
    .line 182
    instance-of v2, v1, La/g0g0;

    .line 183
    .line 184
    if-eqz v2, :cond_2

    .line 185
    .line 186
    move-object v1, v14

    .line 187
    :cond_2
    check-cast v1, La/m3o;

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_3
    move-object v1, v14

    .line 191
    :goto_2
    if-eqz v1, :cond_4

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_4
    move/from16 v18, v10

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_5
    :goto_3
    move/from16 v18, v11

    .line 198
    .line 199
    :goto_4
    iget-object v1, v0, La/b4o;->i:La/n0o0;

    .line 200
    .line 201
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, La/fee;

    .line 206
    .line 207
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    check-cast v1, Ljava/lang/Number;

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 218
    .line 219
    iget-byte v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 220
    .line 221
    if-ne v1, v2, :cond_6

    .line 222
    .line 223
    move v1, v11

    .line 224
    goto :goto_5

    .line 225
    :cond_6
    move v1, v10

    .line 226
    :goto_5
    iget-object v0, v0, La/b4o;->o:La/n0o0;

    .line 227
    .line 228
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, La/fee;

    .line 233
    .line 234
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, Ljava/lang/Boolean;

    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 254
    .line 255
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 260
    .line 261
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 262
    .line 263
    .line 264
    move-result-wide v20

    .line 265
    new-instance v15, La/wkm;

    .line 266
    .line 267
    const/16 v16, 0x0

    .line 268
    .line 269
    const v17, 0x7f080bc5

    .line 270
    .line 271
    .line 272
    sget-object v19, La/ra50;->a:La/ra50;

    .line 273
    .line 274
    invoke-direct/range {v15 .. v21}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 275
    .line 276
    .line 277
    move-object v2, v15

    .line 278
    if-eqz v0, :cond_7

    .line 279
    .line 280
    const v15, 0x7f08052b

    .line 281
    .line 282
    .line 283
    :goto_6
    move/from16 v17, v15

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_7
    const v15, 0x7f08052c

    .line 287
    .line 288
    .line 289
    goto :goto_6

    .line 290
    :goto_7
    if-eqz v0, :cond_8

    .line 291
    .line 292
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 297
    .line 298
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 299
    .line 300
    .line 301
    move-result-wide v15

    .line 302
    :goto_8
    move-wide/from16 v20, v15

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_8
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 310
    .line 311
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 312
    .line 313
    .line 314
    move-result-wide v15

    .line 315
    goto :goto_8

    .line 316
    :goto_9
    new-instance v15, La/wkm;

    .line 317
    .line 318
    const/16 v16, 0x3

    .line 319
    .line 320
    invoke-direct/range {v15 .. v21}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 321
    .line 322
    .line 323
    if-eqz v9, :cond_d

    .line 324
    .line 325
    if-eqz v12, :cond_9

    .line 326
    .line 327
    const v0, 0x7f080c92

    .line 328
    .line 329
    .line 330
    :goto_a
    move/from16 v24, v0

    .line 331
    .line 332
    goto :goto_b

    .line 333
    :cond_9
    const v0, 0x7f080c91

    .line 334
    .line 335
    .line 336
    goto :goto_a

    .line 337
    :goto_b
    if-nez v4, :cond_a

    .line 338
    .line 339
    goto :goto_c

    .line 340
    :cond_a
    move-object v3, v14

    .line 341
    :goto_c
    if-eqz v3, :cond_b

    .line 342
    .line 343
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 344
    .line 345
    .line 346
    move-result v18

    .line 347
    :cond_b
    move/from16 v25, v18

    .line 348
    .line 349
    if-eqz v12, :cond_c

    .line 350
    .line 351
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 356
    .line 357
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 358
    .line 359
    .line 360
    move-result-wide v3

    .line 361
    :goto_d
    move-wide/from16 v27, v3

    .line 362
    .line 363
    goto :goto_e

    .line 364
    :cond_c
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 369
    .line 370
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 371
    .line 372
    .line 373
    move-result-wide v3

    .line 374
    goto :goto_d

    .line 375
    :goto_e
    new-instance v22, La/wkm;

    .line 376
    .line 377
    const/16 v23, 0x2

    .line 378
    .line 379
    move-object/from16 v26, v19

    .line 380
    .line 381
    invoke-direct/range {v22 .. v28}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 382
    .line 383
    .line 384
    :goto_f
    move-object/from16 v0, v22

    .line 385
    .line 386
    goto :goto_15

    .line 387
    :cond_d
    if-nez v13, :cond_12

    .line 388
    .line 389
    sget-object v0, La/ygq0;->c:La/ygq0;

    .line 390
    .line 391
    if-eq v8, v0, :cond_e

    .line 392
    .line 393
    const v9, 0x7f08079a

    .line 394
    .line 395
    .line 396
    :goto_10
    move/from16 v24, v9

    .line 397
    .line 398
    goto :goto_11

    .line 399
    :cond_e
    const v9, 0x7f0807a0

    .line 400
    .line 401
    .line 402
    goto :goto_10

    .line 403
    :goto_11
    if-nez v4, :cond_f

    .line 404
    .line 405
    goto :goto_12

    .line 406
    :cond_f
    move-object v3, v14

    .line 407
    :goto_12
    if-eqz v3, :cond_10

    .line 408
    .line 409
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 410
    .line 411
    .line 412
    move-result v18

    .line 413
    :cond_10
    move/from16 v25, v18

    .line 414
    .line 415
    if-eq v8, v0, :cond_11

    .line 416
    .line 417
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 422
    .line 423
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 424
    .line 425
    .line 426
    move-result-wide v3

    .line 427
    :goto_13
    move-wide/from16 v27, v3

    .line 428
    .line 429
    goto :goto_14

    .line 430
    :cond_11
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 435
    .line 436
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 437
    .line 438
    .line 439
    move-result-wide v3

    .line 440
    goto :goto_13

    .line 441
    :goto_14
    new-instance v22, La/wkm;

    .line 442
    .line 443
    const/16 v23, 0x1

    .line 444
    .line 445
    move-object/from16 v26, v19

    .line 446
    .line 447
    invoke-direct/range {v22 .. v28}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 448
    .line 449
    .line 450
    goto :goto_f

    .line 451
    :cond_12
    move-object v0, v14

    .line 452
    :goto_15
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    if-eqz v1, :cond_13

    .line 457
    .line 458
    if-nez v6, :cond_13

    .line 459
    .line 460
    invoke-virtual {v3, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    invoke-virtual {v3, v15}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    goto :goto_16

    .line 467
    :cond_13
    if-eqz v1, :cond_14

    .line 468
    .line 469
    if-eqz v6, :cond_14

    .line 470
    .line 471
    invoke-virtual {v3, v15}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    goto :goto_16

    .line 475
    :cond_14
    if-nez v1, :cond_15

    .line 476
    .line 477
    if-nez v6, :cond_15

    .line 478
    .line 479
    invoke-virtual {v3, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    :cond_15
    :goto_16
    if-eqz v0, :cond_16

    .line 483
    .line 484
    invoke-virtual {v3, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    :cond_16
    invoke-static {v3}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-virtual {v0}, La/e4;->b()I

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    if-eq v1, v11, :cond_19

    .line 496
    .line 497
    const/4 v2, 0x2

    .line 498
    if-eq v1, v2, :cond_18

    .line 499
    .line 500
    const/4 v3, 0x3

    .line 501
    if-eq v1, v3, :cond_17

    .line 502
    .line 503
    goto :goto_17

    .line 504
    :cond_17
    new-instance v14, La/ua50;

    .line 505
    .line 506
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    check-cast v1, La/wkm;

    .line 511
    .line 512
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    check-cast v3, La/wkm;

    .line 517
    .line 518
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    check-cast v0, La/wkm;

    .line 523
    .line 524
    invoke-direct {v14, v1, v3, v0}, La/ua50;-><init>(La/wkm;La/wkm;La/wkm;)V

    .line 525
    .line 526
    .line 527
    goto :goto_17

    .line 528
    :cond_18
    new-instance v14, La/va50;

    .line 529
    .line 530
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    check-cast v1, La/wkm;

    .line 535
    .line 536
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    check-cast v0, La/wkm;

    .line 541
    .line 542
    invoke-direct {v14, v1, v0}, La/va50;-><init>(La/wkm;La/wkm;)V

    .line 543
    .line 544
    .line 545
    goto :goto_17

    .line 546
    :cond_19
    new-instance v14, La/ta50;

    .line 547
    .line 548
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    check-cast v0, La/wkm;

    .line 553
    .line 554
    invoke-direct {v14, v0}, La/ta50;-><init>(La/wkm;)V

    .line 555
    .line 556
    .line 557
    :goto_17
    new-instance v0, La/ilm;

    .line 558
    .line 559
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 564
    .line 565
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 566
    .line 567
    .line 568
    move-result-wide v1

    .line 569
    invoke-direct {v0, v1, v2}, La/ilm;-><init>(J)V

    .line 570
    .line 571
    .line 572
    if-eqz v6, :cond_1a

    .line 573
    .line 574
    new-instance v1, La/nlm;

    .line 575
    .line 576
    new-array v2, v10, [Ljava/lang/Object;

    .line 577
    .line 578
    iget-object v3, v5, La/ctf0;->b:La/lsm0;

    .line 579
    .line 580
    invoke-static {v2, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    const v4, 0x7f1311bf

    .line 585
    .line 586
    .line 587
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    new-instance v3, La/hmm;

    .line 592
    .line 593
    const/16 v4, 0xa

    .line 594
    .line 595
    invoke-direct {v3, v4, v7, v2, v10}, La/hmm;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 596
    .line 597
    .line 598
    invoke-direct {v1, v3}, La/nlm;-><init>(La/hmm;)V

    .line 599
    .line 600
    .line 601
    :goto_18
    move-object/from16 v17, v1

    .line 602
    .line 603
    goto :goto_19

    .line 604
    :cond_1a
    new-instance v1, La/plm;

    .line 605
    .line 606
    new-array v2, v10, [Ljava/lang/Object;

    .line 607
    .line 608
    iget-object v3, v5, La/ctf0;->b:La/lsm0;

    .line 609
    .line 610
    invoke-static {v2, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    const v4, 0x7f13087f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 626
    .line 627
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 628
    .line 629
    .line 630
    move-result-wide v3

    .line 631
    sget-object v5, La/fa50;->a:La/fa50;

    .line 632
    .line 633
    invoke-direct {v1, v2, v3, v4, v5}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 634
    .line 635
    .line 636
    goto :goto_18

    .line 637
    :goto_19
    if-eqz v14, :cond_1b

    .line 638
    .line 639
    new-instance v1, La/dmm;

    .line 640
    .line 641
    invoke-direct {v1, v14}, La/dmm;-><init>(La/wa50;)V

    .line 642
    .line 643
    .line 644
    :goto_1a
    move-object/from16 v18, v1

    .line 645
    .line 646
    goto :goto_1b

    .line 647
    :cond_1b
    sget-object v1, La/fmm;->a:La/fmm;

    .line 648
    .line 649
    goto :goto_1a

    .line 650
    :goto_1b
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 655
    .line 656
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 657
    .line 658
    .line 659
    move-result-wide v19

    .line 660
    new-instance v15, La/imm;

    .line 661
    .line 662
    const/16 v22, 0x0

    .line 663
    .line 664
    const/16 v21, 0x0

    .line 665
    .line 666
    move-object/from16 v16, v0

    .line 667
    .line 668
    invoke-direct/range {v15 .. v22}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 669
    .line 670
    .line 671
    new-instance v0, La/f4o;

    .line 672
    .line 673
    invoke-direct {v0, v15}, La/f4o;-><init>(La/imm;)V

    .line 674
    .line 675
    .line 676
    return-object v0
.end method
