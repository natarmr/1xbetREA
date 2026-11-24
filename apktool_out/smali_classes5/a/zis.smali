.class public final synthetic La/zis;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLa/haj;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/zis;->a:B

    iput-wide p1, p0, La/zis;->b:J

    iput-object p3, p0, La/zis;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/zis;->a:B

    iput-object p1, p0, La/zis;->c:Ljava/lang/Object;

    iput-wide p2, p0, La/zis;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zis;->a:B

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    sget-object v3, La/ukd;->a:La/cl5;

    .line 7
    .line 8
    const/16 v4, 0x90

    .line 9
    .line 10
    iget-wide v5, v0, La/zis;->b:J

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/16 v8, 0x10

    .line 14
    .line 15
    const/16 v9, 0x20

    .line 16
    .line 17
    const/4 v10, 0x1

    .line 18
    iget-object v11, v0, La/zis;->c:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v11, La/aaj;

    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    check-cast v0, La/y5d;

    .line 28
    .line 29
    move-object/from16 v1, p2

    .line 30
    .line 31
    check-cast v1, La/mm40;

    .line 32
    .line 33
    move-object/from16 v2, p3

    .line 34
    .line 35
    check-cast v2, La/fet;

    .line 36
    .line 37
    move-object/from16 v12, p4

    .line 38
    .line 39
    check-cast v12, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-static {v12, v0, v1}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    and-int/lit8 v12, v0, 0x30

    .line 46
    .line 47
    if-nez v12, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v12

    .line 53
    if-eqz v12, :cond_0

    .line 54
    .line 55
    move v8, v9

    .line 56
    :cond_0
    or-int/2addr v0, v8

    .line 57
    :cond_1
    and-int/lit16 v8, v0, 0x91

    .line 58
    .line 59
    if-eq v8, v4, :cond_2

    .line 60
    .line 61
    move v7, v10

    .line 62
    :cond_2
    and-int/2addr v0, v10

    .line 63
    invoke-virtual {v2, v0, v7}, La/fet;->U(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    invoke-virtual {v2, v5, v6}, La/fet;->f(J)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    if-ne v4, v3, :cond_4

    .line 80
    .line 81
    :cond_3
    new-instance v4, La/dls;

    .line 82
    .line 83
    const/16 v0, 0xd

    .line 84
    .line 85
    invoke-direct {v4, v0, v5, v6}, La/dls;-><init>(BJ)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 92
    .line 93
    invoke-static {v1, v4}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sget-object v1, La/qmk;->a:La/zcl;

    .line 98
    .line 99
    const/high16 v1, 0x41400000    # 12.0f

    .line 100
    .line 101
    const/high16 v3, 0x41000000    # 8.0f

    .line 102
    .line 103
    invoke-static {v0, v1, v3}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    iget-object v12, v11, La/aaj;->b:Ljava/lang/String;

    .line 108
    .line 109
    sget-object v20, La/j1t0;->a:La/qrq;

    .line 110
    .line 111
    sget-wide v17, La/qmk;->q:J

    .line 112
    .line 113
    sget-wide v26, La/qmk;->D:J

    .line 114
    .line 115
    new-instance v14, La/y9q0;

    .line 116
    .line 117
    const/16 v25, 0x0

    .line 118
    .line 119
    const v28, 0xfdffdd

    .line 120
    .line 121
    .line 122
    const-wide/16 v15, 0x0

    .line 123
    .line 124
    const/16 v19, 0x0

    .line 125
    .line 126
    const-wide/16 v21, 0x0

    .line 127
    .line 128
    const/16 v23, 0x0

    .line 129
    .line 130
    const/16 v24, 0x0

    .line 131
    .line 132
    invoke-direct/range {v14 .. v28}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 133
    .line 134
    .line 135
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 136
    .line 137
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 138
    .line 139
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 140
    .line 141
    .line 142
    move-result-wide v0

    .line 143
    new-instance v3, La/f2q0;

    .line 144
    .line 145
    const/4 v4, 0x3

    .line 146
    invoke-direct {v3, v4}, La/f2q0;-><init>(I)V

    .line 147
    .line 148
    .line 149
    const/16 v35, 0x6180

    .line 150
    .line 151
    const v36, 0x1abf8

    .line 152
    .line 153
    .line 154
    const/16 v16, 0x0

    .line 155
    .line 156
    const-wide/16 v17, 0x0

    .line 157
    .line 158
    const/16 v20, 0x0

    .line 159
    .line 160
    const/16 v21, 0x0

    .line 161
    .line 162
    const-wide/16 v22, 0x0

    .line 163
    .line 164
    const-wide/16 v25, 0x0

    .line 165
    .line 166
    const/16 v27, 0x2

    .line 167
    .line 168
    const/16 v28, 0x0

    .line 169
    .line 170
    const/16 v29, 0x1

    .line 171
    .line 172
    const/16 v30, 0x0

    .line 173
    .line 174
    const/16 v31, 0x0

    .line 175
    .line 176
    const/16 v34, 0x0

    .line 177
    .line 178
    move-object/from16 v33, v2

    .line 179
    .line 180
    move-object/from16 v24, v3

    .line 181
    .line 182
    move-object/from16 v32, v14

    .line 183
    .line 184
    move-wide v14, v0

    .line 185
    invoke-static/range {v12 .. v36}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 186
    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_5
    move-object/from16 v33, v2

    .line 190
    .line 191
    invoke-virtual/range {v33 .. v33}, La/fet;->X()V

    .line 192
    .line 193
    .line 194
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object v0

    .line 197
    :pswitch_0
    move-object v3, v11

    .line 198
    check-cast v3, La/pz40;

    .line 199
    .line 200
    move-object/from16 v1, p1

    .line 201
    .line 202
    check-cast v1, La/y5d;

    .line 203
    .line 204
    move-object/from16 v2, p2

    .line 205
    .line 206
    check-cast v2, La/mm40;

    .line 207
    .line 208
    move-object/from16 v11, p3

    .line 209
    .line 210
    check-cast v11, La/fet;

    .line 211
    .line 212
    move-object/from16 v5, p4

    .line 213
    .line 214
    check-cast v5, Ljava/lang/Integer;

    .line 215
    .line 216
    invoke-static {v5, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    and-int/lit8 v5, v1, 0x30

    .line 221
    .line 222
    if-nez v5, :cond_7

    .line 223
    .line 224
    invoke-virtual {v11, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    if-eqz v5, :cond_6

    .line 229
    .line 230
    move v8, v9

    .line 231
    :cond_6
    or-int/2addr v1, v8

    .line 232
    :cond_7
    and-int/lit16 v5, v1, 0x91

    .line 233
    .line 234
    if-eq v5, v4, :cond_8

    .line 235
    .line 236
    move v7, v10

    .line 237
    :cond_8
    and-int/2addr v1, v10

    .line 238
    invoke-virtual {v11, v1, v7}, La/fet;->U(IZ)Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-eqz v1, :cond_9

    .line 243
    .line 244
    sget-object v1, La/vko0;->a:La/zfn;

    .line 245
    .line 246
    sget-object v4, La/bmd;->n:La/zfn;

    .line 247
    .line 248
    invoke-virtual {v11, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-virtual {v1, v4}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    new-instance v1, La/fsw;

    .line 257
    .line 258
    const/4 v6, 0x0

    .line 259
    iget-wide v4, v0, La/zis;->b:J

    .line 260
    .line 261
    invoke-direct/range {v1 .. v6}, La/fsw;-><init>(La/mm40;La/pz40;JB)V

    .line 262
    .line 263
    .line 264
    const v0, 0x536ed98e

    .line 265
    .line 266
    .line 267
    invoke-static {v0, v1, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    const/16 v1, 0x38

    .line 272
    .line 273
    invoke-static {v7, v0, v11, v1}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 274
    .line 275
    .line 276
    goto :goto_1

    .line 277
    :cond_9
    invoke-virtual {v11}, La/fet;->X()V

    .line 278
    .line 279
    .line 280
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_1
    check-cast v11, La/z9j;

    .line 284
    .line 285
    move-object/from16 v0, p1

    .line 286
    .line 287
    check-cast v0, La/y5d;

    .line 288
    .line 289
    move-object/from16 v1, p2

    .line 290
    .line 291
    check-cast v1, La/mm40;

    .line 292
    .line 293
    move-object/from16 v3, p3

    .line 294
    .line 295
    check-cast v3, La/fet;

    .line 296
    .line 297
    move-object/from16 v12, p4

    .line 298
    .line 299
    check-cast v12, Ljava/lang/Integer;

    .line 300
    .line 301
    invoke-static {v12, v0, v1}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    and-int/lit8 v12, v0, 0x30

    .line 306
    .line 307
    if-nez v12, :cond_b

    .line 308
    .line 309
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v12

    .line 313
    if-eqz v12, :cond_a

    .line 314
    .line 315
    move v8, v9

    .line 316
    :cond_a
    or-int/2addr v0, v8

    .line 317
    :cond_b
    and-int/lit16 v8, v0, 0x91

    .line 318
    .line 319
    if-eq v8, v4, :cond_c

    .line 320
    .line 321
    move v7, v10

    .line 322
    :cond_c
    and-int/2addr v0, v10

    .line 323
    invoke-virtual {v3, v0, v7}, La/fet;->U(IZ)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_d

    .line 328
    .line 329
    new-instance v0, La/my2;

    .line 330
    .line 331
    invoke-direct {v0, v1, v5, v6, v11}, La/my2;-><init>(La/mm40;JLa/z9j;)V

    .line 332
    .line 333
    .line 334
    const v1, -0x38a5372e

    .line 335
    .line 336
    .line 337
    invoke-static {v1, v0, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {v0, v3, v2}, La/kr00;->a(La/ugd;La/fet;I)V

    .line 342
    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_d
    invoke-virtual {v3}, La/fet;->X()V

    .line 346
    .line 347
    .line 348
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    return-object v0

    .line 351
    :pswitch_2
    check-cast v11, La/cjs;

    .line 352
    .line 353
    move-object/from16 v0, p1

    .line 354
    .line 355
    check-cast v0, La/mm40;

    .line 356
    .line 357
    move-object/from16 v4, p2

    .line 358
    .line 359
    check-cast v4, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;

    .line 360
    .line 361
    move-object/from16 v1, p3

    .line 362
    .line 363
    check-cast v1, La/fet;

    .line 364
    .line 365
    move-object/from16 v12, p4

    .line 366
    .line 367
    check-cast v12, Ljava/lang/Integer;

    .line 368
    .line 369
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 370
    .line 371
    .line 372
    move-result v12

    .line 373
    sget-object v13, La/cjs;->a2:La/nek;

    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    and-int/lit8 v13, v12, 0x6

    .line 382
    .line 383
    if-nez v13, :cond_f

    .line 384
    .line 385
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v13

    .line 389
    if-eqz v13, :cond_e

    .line 390
    .line 391
    const/4 v13, 0x4

    .line 392
    goto :goto_3

    .line 393
    :cond_e
    const/4 v13, 0x2

    .line 394
    :goto_3
    or-int/2addr v13, v12

    .line 395
    goto :goto_4

    .line 396
    :cond_f
    move v13, v12

    .line 397
    :goto_4
    and-int/lit8 v14, v12, 0x30

    .line 398
    .line 399
    if-nez v14, :cond_12

    .line 400
    .line 401
    and-int/lit8 v12, v12, 0x40

    .line 402
    .line 403
    if-nez v12, :cond_10

    .line 404
    .line 405
    invoke-virtual {v1, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v12

    .line 409
    goto :goto_5

    .line 410
    :cond_10
    invoke-virtual {v1, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v12

    .line 414
    :goto_5
    if-eqz v12, :cond_11

    .line 415
    .line 416
    move v8, v9

    .line 417
    :cond_11
    or-int/2addr v13, v8

    .line 418
    :cond_12
    and-int/lit16 v8, v13, 0x93

    .line 419
    .line 420
    const/16 v9, 0x92

    .line 421
    .line 422
    if-eq v8, v9, :cond_13

    .line 423
    .line 424
    move v7, v10

    .line 425
    :cond_13
    and-int/lit8 v8, v13, 0x1

    .line 426
    .line 427
    invoke-virtual {v1, v8, v7}, La/fet;->U(IZ)Z

    .line 428
    .line 429
    .line 430
    move-result v7

    .line 431
    if-eqz v7, :cond_16

    .line 432
    .line 433
    iget-object v7, v11, La/cjs;->Q1:La/uuz;

    .line 434
    .line 435
    if-eqz v7, :cond_15

    .line 436
    .line 437
    sget-object v7, La/qmk;->l:La/zcl;

    .line 438
    .line 439
    sget-object v8, La/qmk;->a:La/zcl;

    .line 440
    .line 441
    new-instance v9, La/ugg0;

    .line 442
    .line 443
    invoke-direct {v9, v7, v7, v8, v8}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 444
    .line 445
    .line 446
    invoke-static {v0, v5, v6, v9}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-static {v7, v7, v8, v8, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    if-ne v5, v3, :cond_14

    .line 459
    .line 460
    new-instance v5, La/dcr;

    .line 461
    .line 462
    const/16 v3, 0x1b

    .line 463
    .line 464
    invoke-direct {v5, v3}, La/dcr;-><init>(B)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    :cond_14
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 471
    .line 472
    shl-int/lit8 v2, v13, 0x6

    .line 473
    .line 474
    and-int/lit16 v2, v2, 0x1c00

    .line 475
    .line 476
    const/16 v3, 0x6030

    .line 477
    .line 478
    or-int v7, v3, v2

    .line 479
    .line 480
    sget-object v2, La/jm40;->b:La/jm40;

    .line 481
    .line 482
    move-object v6, v1

    .line 483
    move-object v3, v11

    .line 484
    move-object v1, v0

    .line 485
    invoke-static/range {v1 .. v7}, La/uuz;->c(La/mm40;La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 486
    .line 487
    .line 488
    goto :goto_6

    .line 489
    :cond_15
    const-string v0, "marketsCategoriesFactory"

    .line 490
    .line 491
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    const/4 v0, 0x0

    .line 495
    throw v0

    .line 496
    :cond_16
    move-object v6, v1

    .line 497
    invoke-virtual {v6}, La/fet;->X()V

    .line 498
    .line 499
    .line 500
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 501
    .line 502
    return-object v0

    .line 503
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
