.class public abstract La/n1i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x40c00000    # 6.0f

    .line 4
    .line 5
    sput v0, La/n1i;->a:F

    .line 6
    .line 7
    const/high16 v1, 0x40800000    # 4.0f

    .line 8
    .line 9
    sput v1, La/n1i;->b:F

    .line 10
    .line 11
    const/high16 v1, 0x40000000    # 2.0f

    .line 12
    .line 13
    sput v1, La/n1i;->c:F

    .line 14
    .line 15
    sput v0, La/n1i;->d:F

    .line 16
    .line 17
    return-void
.end method

.method public static final a(La/mm40;La/xk80;La/smm;La/y3d;La/fet;II)V
    .locals 28

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v4, p4

    .line 4
    .line 5
    move/from16 v5, p5

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v0, 0x6c2cd29e

    .line 11
    .line 12
    .line 13
    invoke-virtual {v4, v0}, La/fet;->g0(I)La/fet;

    .line 14
    .line 15
    .line 16
    and-int/lit8 v0, p6, 0x1

    .line 17
    .line 18
    const/4 v6, 0x2

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    or-int/lit8 v1, v5, 0x6

    .line 22
    .line 23
    move v3, v1

    .line 24
    move-object/from16 v1, p0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    and-int/lit8 v1, v5, 0x6

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    move-object/from16 v1, p0

    .line 32
    .line 33
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    const/4 v3, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v3, v6

    .line 42
    :goto_0
    or-int/2addr v3, v5

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object/from16 v1, p0

    .line 45
    .line 46
    move v3, v5

    .line 47
    :goto_1
    and-int/lit8 v7, v5, 0x30

    .line 48
    .line 49
    if-nez v7, :cond_4

    .line 50
    .line 51
    invoke-virtual {v4, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_3

    .line 56
    .line 57
    const/16 v7, 0x20

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    const/16 v7, 0x10

    .line 61
    .line 62
    :goto_2
    or-int/2addr v3, v7

    .line 63
    :cond_4
    and-int/lit16 v7, v5, 0x180

    .line 64
    .line 65
    if-nez v7, :cond_6

    .line 66
    .line 67
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    invoke-virtual {v4, v7}, La/fet;->e(I)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_5

    .line 76
    .line 77
    const/16 v7, 0x100

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    const/16 v7, 0x80

    .line 81
    .line 82
    :goto_3
    or-int/2addr v3, v7

    .line 83
    :cond_6
    and-int/lit8 v7, p6, 0x8

    .line 84
    .line 85
    if-eqz v7, :cond_8

    .line 86
    .line 87
    or-int/lit16 v3, v3, 0xc00

    .line 88
    .line 89
    :cond_7
    move-object/from16 v8, p3

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_8
    and-int/lit16 v8, v5, 0xc00

    .line 93
    .line 94
    if-nez v8, :cond_7

    .line 95
    .line 96
    move-object/from16 v8, p3

    .line 97
    .line 98
    invoke-virtual {v4, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-eqz v9, :cond_9

    .line 103
    .line 104
    const/16 v9, 0x800

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_9
    const/16 v9, 0x400

    .line 108
    .line 109
    :goto_4
    or-int/2addr v3, v9

    .line 110
    :goto_5
    and-int/lit16 v9, v3, 0x493

    .line 111
    .line 112
    const/16 v10, 0x492

    .line 113
    .line 114
    const/4 v11, 0x0

    .line 115
    const/4 v12, 0x1

    .line 116
    if-eq v9, v10, :cond_a

    .line 117
    .line 118
    move v9, v12

    .line 119
    goto :goto_6

    .line 120
    :cond_a
    move v9, v11

    .line 121
    :goto_6
    and-int/2addr v3, v12

    .line 122
    invoke-virtual {v4, v3, v9}, La/fet;->U(IZ)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_44

    .line 127
    .line 128
    if-eqz v0, :cond_b

    .line 129
    .line 130
    sget-object v0, La/jm40;->b:La/jm40;

    .line 131
    .line 132
    move-object v1, v0

    .line 133
    :cond_b
    if-eqz v7, :cond_c

    .line 134
    .line 135
    const/4 v0, 0x0

    .line 136
    goto :goto_7

    .line 137
    :cond_c
    move-object v0, v8

    .line 138
    :goto_7
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    const/4 v7, 0x3

    .line 143
    sget-object v8, La/ukd;->a:La/cl5;

    .line 144
    .line 145
    if-ne v3, v8, :cond_d

    .line 146
    .line 147
    new-instance v3, La/s39;

    .line 148
    .line 149
    invoke-direct {v3, v2, v7}, La/s39;-><init>(La/xk80;B)V

    .line 150
    .line 151
    .line 152
    invoke-static {v3}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_d
    check-cast v3, La/l7m0;

    .line 160
    .line 161
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    check-cast v3, Ljava/lang/Number;

    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-ge v9, v6, :cond_e

    .line 172
    .line 173
    invoke-virtual {v4}, La/fet;->u()La/yfe0;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    if-eqz v8, :cond_45

    .line 178
    .line 179
    move-object v4, v0

    .line 180
    new-instance v0, La/m1i;

    .line 181
    .line 182
    const/4 v7, 0x0

    .line 183
    move-object/from16 v3, p2

    .line 184
    .line 185
    move/from16 v6, p6

    .line 186
    .line 187
    invoke-direct/range {v0 .. v7}, La/m1i;-><init>(La/mm40;La/xk80;La/smm;La/y3d;IIB)V

    .line 188
    .line 189
    .line 190
    :goto_8
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 191
    .line 192
    return-void

    .line 193
    :cond_e
    move-object v13, v0

    .line 194
    move-object v10, v1

    .line 195
    sget v14, La/n1i;->d:F

    .line 196
    .line 197
    sget v15, La/n1i;->a:F

    .line 198
    .line 199
    add-float v0, v14, v15

    .line 200
    .line 201
    int-to-float v1, v9

    .line 202
    mul-float/2addr v0, v1

    .line 203
    add-float/2addr v0, v14

    .line 204
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_12

    .line 209
    .line 210
    if-eq v1, v12, :cond_11

    .line 211
    .line 212
    if-eq v1, v6, :cond_10

    .line 213
    .line 214
    if-ne v1, v7, :cond_f

    .line 215
    .line 216
    const v1, 0x14430aa5

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 220
    .line 221
    .line 222
    sget-object v1, La/m8m0;->a:La/zfn;

    .line 223
    .line 224
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 229
    .line 230
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack20-0d7_KjU()J

    .line 231
    .line 232
    .line 233
    move-result-wide v1

    .line 234
    invoke-virtual {v4, v11}, La/fet;->r(Z)V

    .line 235
    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_f
    const v0, 0x1442e920

    .line 239
    .line 240
    .line 241
    invoke-static {v0, v4, v11}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    throw v0

    .line 246
    :cond_10
    const v1, 0x14430029

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v4, v11}, La/fet;->r(Z)V

    .line 253
    .line 254
    .line 255
    sget-wide v1, La/y3d;->f:J

    .line 256
    .line 257
    goto :goto_9

    .line 258
    :cond_11
    const v1, 0x1442f929

    .line 259
    .line 260
    .line 261
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 262
    .line 263
    .line 264
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 265
    .line 266
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 271
    .line 272
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary10-0d7_KjU()J

    .line 273
    .line 274
    .line 275
    move-result-wide v1

    .line 276
    invoke-virtual {v4, v11}, La/fet;->r(Z)V

    .line 277
    .line 278
    .line 279
    goto :goto_9

    .line 280
    :cond_12
    const v1, 0x1442ef69

    .line 281
    .line 282
    .line 283
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4, v11}, La/fet;->r(Z)V

    .line 287
    .line 288
    .line 289
    sget-wide v1, La/y3d;->f:J

    .line 290
    .line 291
    :goto_9
    if-nez v13, :cond_17

    .line 292
    .line 293
    const v3, 0x741f9c34

    .line 294
    .line 295
    .line 296
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    if-eqz v3, :cond_16

    .line 304
    .line 305
    if-eq v3, v12, :cond_15

    .line 306
    .line 307
    if-eq v3, v6, :cond_14

    .line 308
    .line 309
    if-ne v3, v7, :cond_13

    .line 310
    .line 311
    const v3, 0x14433903

    .line 312
    .line 313
    .line 314
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 315
    .line 316
    .line 317
    sget-object v3, La/m8m0;->a:La/zfn;

    .line 318
    .line 319
    invoke-virtual {v4, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    check-cast v3, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 324
    .line 325
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 326
    .line 327
    .line 328
    move-result-wide v16

    .line 329
    invoke-virtual {v4, v11}, La/fet;->r(Z)V

    .line 330
    .line 331
    .line 332
    goto :goto_a

    .line 333
    :cond_13
    const v0, 0x1443158e

    .line 334
    .line 335
    .line 336
    invoke-static {v0, v4, v11}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    throw v0

    .line 341
    :cond_14
    const v3, 0x14432f43

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 345
    .line 346
    .line 347
    sget-object v3, La/m8m0;->a:La/zfn;

    .line 348
    .line 349
    invoke-virtual {v4, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    check-cast v3, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 354
    .line 355
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 356
    .line 357
    .line 358
    move-result-wide v16

    .line 359
    invoke-virtual {v4, v11}, La/fet;->r(Z)V

    .line 360
    .line 361
    .line 362
    goto :goto_a

    .line 363
    :cond_15
    const v3, 0x14432685

    .line 364
    .line 365
    .line 366
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 367
    .line 368
    .line 369
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 370
    .line 371
    invoke-virtual {v4, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 376
    .line 377
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 378
    .line 379
    .line 380
    move-result-wide v16

    .line 381
    invoke-virtual {v4, v11}, La/fet;->r(Z)V

    .line 382
    .line 383
    .line 384
    goto :goto_a

    .line 385
    :cond_16
    const v3, 0x14431d45

    .line 386
    .line 387
    .line 388
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 389
    .line 390
    .line 391
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 392
    .line 393
    invoke-virtual {v4, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 398
    .line 399
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 400
    .line 401
    .line 402
    move-result-wide v16

    .line 403
    invoke-virtual {v4, v11}, La/fet;->r(Z)V

    .line 404
    .line 405
    .line 406
    :goto_a
    invoke-virtual {v4, v11}, La/fet;->r(Z)V

    .line 407
    .line 408
    .line 409
    move-object/from16 p3, v8

    .line 410
    .line 411
    goto :goto_b

    .line 412
    :cond_17
    const v3, 0x14431268

    .line 413
    .line 414
    .line 415
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v4, v11}, La/fet;->r(Z)V

    .line 419
    .line 420
    .line 421
    move-object/from16 p3, v8

    .line 422
    .line 423
    iget-wide v7, v13, La/y3d;->a:J

    .line 424
    .line 425
    move-wide/from16 v16, v7

    .line 426
    .line 427
    :goto_b
    sget-object v3, La/uc9;->e:La/nw3;

    .line 428
    .line 429
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 430
    .line 431
    sget-object v7, La/qmk;->a:La/zcl;

    .line 432
    .line 433
    const/high16 v7, 0x41900000    # 18.0f

    .line 434
    .line 435
    invoke-static {v10, v7}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    invoke-static {v7, v0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    const/high16 v7, 0x43b40000    # 360.0f

    .line 444
    .line 445
    invoke-static {v7}, La/vgg0;->a(F)La/ugg0;

    .line 446
    .line 447
    .line 448
    move-result-object v7

    .line 449
    invoke-static {v0, v7}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    sget-object v7, La/jd8;->n:La/ljc;

    .line 454
    .line 455
    invoke-static {v0, v1, v2, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    sget-object v1, La/gqw0;->d:La/zx7;

    .line 460
    .line 461
    invoke-static {v0, v1, v12}, La/o7k0;->x(La/mm40;La/u12;Z)La/mm40;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    const/16 v1, 0x36

    .line 466
    .line 467
    invoke-static {v3, v5, v4, v1}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    iget-wide v2, v4, La/fet;->T:J

    .line 472
    .line 473
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    invoke-static {v4, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 486
    .line 487
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v4}, La/fet;->i0()V

    .line 491
    .line 492
    .line 493
    iget-boolean v5, v4, La/fet;->S:Z

    .line 494
    .line 495
    if-eqz v5, :cond_18

    .line 496
    .line 497
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 498
    .line 499
    invoke-virtual {v4, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 500
    .line 501
    .line 502
    goto :goto_c

    .line 503
    :cond_18
    invoke-virtual {v4}, La/fet;->r0()V

    .line 504
    .line 505
    .line 506
    :goto_c
    sget-object v5, La/gqw0;->x:La/shd;

    .line 507
    .line 508
    invoke-static {v4, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 509
    .line 510
    .line 511
    sget-object v1, La/gqw0;->w:La/shd;

    .line 512
    .line 513
    invoke-static {v4, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 514
    .line 515
    .line 516
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    sget-object v2, La/gqw0;->y:La/shd;

    .line 521
    .line 522
    invoke-static {v4, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 523
    .line 524
    .line 525
    invoke-static {v4}, La/jpm0;->n(La/fet;)V

    .line 526
    .line 527
    .line 528
    sget-object v1, La/gqw0;->v:La/shd;

    .line 529
    .line 530
    invoke-static {v4, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {p1 .. p1}, La/xk80;->k()I

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    if-eqz v0, :cond_1b

    .line 542
    .line 543
    if-eq v0, v12, :cond_1b

    .line 544
    .line 545
    if-eq v0, v6, :cond_1a

    .line 546
    .line 547
    const/4 v1, 0x3

    .line 548
    if-ne v0, v1, :cond_19

    .line 549
    .line 550
    goto :goto_d

    .line 551
    :cond_19
    const v0, 0x486b2ad

    .line 552
    .line 553
    .line 554
    invoke-static {v0, v4, v11}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    throw v0

    .line 559
    :cond_1a
    :goto_d
    const v0, 0x486cd09

    .line 560
    .line 561
    .line 562
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v4, v11}, La/fet;->r(Z)V

    .line 566
    .line 567
    .line 568
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 569
    .line 570
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite30-0d7_KjU()J

    .line 571
    .line 572
    .line 573
    move-result-wide v0

    .line 574
    :goto_e
    move-wide/from16 v18, v0

    .line 575
    .line 576
    goto :goto_f

    .line 577
    :cond_1b
    const v0, 0x486bfed

    .line 578
    .line 579
    .line 580
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 581
    .line 582
    .line 583
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 584
    .line 585
    invoke-virtual {v4, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 590
    .line 591
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary20-0d7_KjU()J

    .line 592
    .line 593
    .line 594
    move-result-wide v0

    .line 595
    invoke-virtual {v4, v11}, La/fet;->r(Z)V

    .line 596
    .line 597
    .line 598
    goto :goto_e

    .line 599
    :goto_f
    invoke-virtual/range {p1 .. p1}, La/xk80;->n()I

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    const/16 v1, 0x9

    .line 604
    .line 605
    if-le v0, v1, :cond_3f

    .line 606
    .line 607
    const v0, -0x73aa15a5

    .line 608
    .line 609
    .line 610
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {p1 .. p1}, La/xk80;->n()I

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    div-int/lit8 v1, v9, 0x2

    .line 618
    .line 619
    add-int/lit8 v2, v1, 0x1

    .line 620
    .line 621
    invoke-virtual {v4, v0}, La/fet;->e(I)Z

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    invoke-virtual {v4, v7}, La/fet;->e(I)Z

    .line 626
    .line 627
    .line 628
    move-result v5

    .line 629
    or-int/2addr v3, v5

    .line 630
    invoke-virtual {v4, v2}, La/fet;->e(I)Z

    .line 631
    .line 632
    .line 633
    move-result v5

    .line 634
    or-int/2addr v3, v5

    .line 635
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v5

    .line 639
    if-nez v3, :cond_1c

    .line 640
    .line 641
    move-object/from16 v3, p3

    .line 642
    .line 643
    if-ne v5, v3, :cond_1f

    .line 644
    .line 645
    goto :goto_10

    .line 646
    :cond_1c
    move-object/from16 v3, p3

    .line 647
    .line 648
    :goto_10
    sub-int v5, v0, v7

    .line 649
    .line 650
    if-ge v5, v2, :cond_1d

    .line 651
    .line 652
    mul-int/lit8 v5, v2, 0x2

    .line 653
    .line 654
    sub-int/2addr v5, v0

    .line 655
    add-int/2addr v5, v7

    .line 656
    goto :goto_11

    .line 657
    :cond_1d
    if-lt v7, v2, :cond_1e

    .line 658
    .line 659
    move v5, v2

    .line 660
    goto :goto_11

    .line 661
    :cond_1e
    add-int/lit8 v5, v7, 0x1

    .line 662
    .line 663
    :goto_11
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 664
    .line 665
    .line 666
    move-result-object v5

    .line 667
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    :cond_1f
    check-cast v5, Ljava/lang/Number;

    .line 671
    .line 672
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 673
    .line 674
    .line 675
    move-result v5

    .line 676
    const/high16 p0, 0x40000000    # 2.0f

    .line 677
    .line 678
    invoke-virtual/range {p1 .. p1}, La/xk80;->l()F

    .line 679
    .line 680
    .line 681
    move-result v8

    .line 682
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 683
    .line 684
    .line 685
    move-result-object v20

    .line 686
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 687
    .line 688
    .line 689
    move-result-object v21

    .line 690
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 691
    .line 692
    .line 693
    move-result-object v22

    .line 694
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 695
    .line 696
    .line 697
    move-result-object v23

    .line 698
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 699
    .line 700
    .line 701
    move-result-object v24

    .line 702
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 703
    .line 704
    .line 705
    move-result-object v25

    .line 706
    filled-new-array/range {v20 .. v25}, [Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v20

    .line 710
    const/4 v11, 0x6

    .line 711
    invoke-virtual {v4, v11}, La/fet;->e(I)Z

    .line 712
    .line 713
    .line 714
    move-result v22

    .line 715
    const/4 v6, 0x0

    .line 716
    :goto_12
    if-ge v6, v11, :cond_20

    .line 717
    .line 718
    aget-object v11, v20, v6

    .line 719
    .line 720
    invoke-virtual {v4, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    move-result v11

    .line 724
    or-int v22, v22, v11

    .line 725
    .line 726
    add-int/lit8 v6, v6, 0x1

    .line 727
    .line 728
    const/4 v11, 0x6

    .line 729
    goto :goto_12

    .line 730
    :cond_20
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v6

    .line 734
    if-nez v22, :cond_22

    .line 735
    .line 736
    if-ne v6, v3, :cond_21

    .line 737
    .line 738
    goto :goto_13

    .line 739
    :cond_21
    move/from16 v20, v12

    .line 740
    .line 741
    goto :goto_17

    .line 742
    :cond_22
    :goto_13
    if-ne v5, v2, :cond_27

    .line 743
    .line 744
    add-int/lit8 v6, v9, 0x1

    .line 745
    .line 746
    if-ne v0, v6, :cond_23

    .line 747
    .line 748
    int-to-float v6, v2

    .line 749
    const/high16 v11, 0x3f800000    # 1.0f

    .line 750
    .line 751
    sub-float v11, v6, v11

    .line 752
    .line 753
    move/from16 v20, v12

    .line 754
    .line 755
    int-to-float v12, v7

    .line 756
    add-float/2addr v12, v8

    .line 757
    cmpg-float v11, v11, v12

    .line 758
    .line 759
    if-gtz v11, :cond_24

    .line 760
    .line 761
    cmpg-float v6, v12, v6

    .line 762
    .line 763
    if-gtz v6, :cond_24

    .line 764
    .line 765
    goto :goto_14

    .line 766
    :cond_23
    move/from16 v20, v12

    .line 767
    .line 768
    :cond_24
    int-to-float v6, v2

    .line 769
    const/high16 v11, 0x3f000000    # 0.5f

    .line 770
    .line 771
    add-float/2addr v11, v6

    .line 772
    sub-int v12, v0, v7

    .line 773
    .line 774
    int-to-float v12, v12

    .line 775
    add-float v22, v12, v8

    .line 776
    .line 777
    cmpg-float v6, v6, v22

    .line 778
    .line 779
    if-gtz v6, :cond_25

    .line 780
    .line 781
    cmpg-float v6, v22, v11

    .line 782
    .line 783
    if-gtz v6, :cond_25

    .line 784
    .line 785
    goto :goto_15

    .line 786
    :cond_25
    sub-float/2addr v12, v8

    .line 787
    add-int/lit8 v6, v1, 0x2

    .line 788
    .line 789
    int-to-float v6, v6

    .line 790
    cmpg-float v6, v12, v6

    .line 791
    .line 792
    if-gez v6, :cond_26

    .line 793
    .line 794
    goto :goto_14

    .line 795
    :cond_26
    int-to-float v6, v7

    .line 796
    add-float/2addr v6, v8

    .line 797
    int-to-float v11, v1

    .line 798
    cmpl-float v6, v6, v11

    .line 799
    .line 800
    if-lez v6, :cond_28

    .line 801
    .line 802
    :goto_14
    move/from16 v6, v20

    .line 803
    .line 804
    goto :goto_16

    .line 805
    :cond_27
    move/from16 v20, v12

    .line 806
    .line 807
    :cond_28
    :goto_15
    const/4 v6, 0x0

    .line 808
    :goto_16
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 809
    .line 810
    .line 811
    move-result-object v6

    .line 812
    invoke-virtual {v4, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 813
    .line 814
    .line 815
    :goto_17
    check-cast v6, Ljava/lang/Boolean;

    .line 816
    .line 817
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 818
    .line 819
    .line 820
    move-result v6

    .line 821
    invoke-virtual {v4, v8}, La/fet;->d(F)Z

    .line 822
    .line 823
    .line 824
    move-result v11

    .line 825
    invoke-virtual {v4, v8}, La/fet;->d(F)Z

    .line 826
    .line 827
    .line 828
    move-result v12

    .line 829
    or-int/2addr v11, v12

    .line 830
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v12

    .line 834
    if-nez v11, :cond_29

    .line 835
    .line 836
    if-ne v12, v3, :cond_2b

    .line 837
    .line 838
    :cond_29
    if-eqz v6, :cond_2a

    .line 839
    .line 840
    mul-float/2addr v8, v14

    .line 841
    neg-float v6, v8

    .line 842
    mul-float v6, v6, p0

    .line 843
    .line 844
    goto :goto_18

    .line 845
    :cond_2a
    sget-object v6, La/qmk;->a:La/zcl;

    .line 846
    .line 847
    const/4 v6, 0x0

    .line 848
    :goto_18
    div-float v8, v14, p0

    .line 849
    .line 850
    add-float/2addr v8, v14

    .line 851
    sub-float/2addr v6, v8

    .line 852
    invoke-static {v6, v4}, La/twn;->j(FLa/fet;)La/ycl;

    .line 853
    .line 854
    .line 855
    move-result-object v12

    .line 856
    :cond_2b
    check-cast v12, La/ycl;

    .line 857
    .line 858
    iget v6, v12, La/ycl;->a:F

    .line 859
    .line 860
    add-int/lit8 v8, v9, 0x2

    .line 861
    .line 862
    const/4 v11, 0x0

    .line 863
    :goto_19
    if-ge v11, v8, :cond_3e

    .line 864
    .line 865
    invoke-virtual {v4, v5}, La/fet;->e(I)Z

    .line 866
    .line 867
    .line 868
    move-result v12

    .line 869
    invoke-virtual {v4, v11}, La/fet;->e(I)Z

    .line 870
    .line 871
    .line 872
    move-result v14

    .line 873
    or-int/2addr v12, v14

    .line 874
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v14

    .line 878
    if-nez v12, :cond_2d

    .line 879
    .line 880
    if-ne v14, v3, :cond_2c

    .line 881
    .line 882
    goto :goto_1a

    .line 883
    :cond_2c
    move/from16 p3, v5

    .line 884
    .line 885
    move v12, v6

    .line 886
    goto :goto_1c

    .line 887
    :cond_2d
    :goto_1a
    move/from16 p3, v5

    .line 888
    .line 889
    move v12, v6

    .line 890
    if-ne v5, v11, :cond_2e

    .line 891
    .line 892
    move-wide/from16 v5, v16

    .line 893
    .line 894
    goto :goto_1b

    .line 895
    :cond_2e
    move-wide/from16 v5, v18

    .line 896
    .line 897
    :goto_1b
    invoke-static {v5, v6, v4}, La/dw9;->e(JLa/fet;)La/y3d;

    .line 898
    .line 899
    .line 900
    move-result-object v14

    .line 901
    :goto_1c
    check-cast v14, La/y3d;

    .line 902
    .line 903
    iget-wide v5, v14, La/y3d;->a:J

    .line 904
    .line 905
    invoke-virtual {v4, v7}, La/fet;->e(I)Z

    .line 906
    .line 907
    .line 908
    move-result v14

    .line 909
    invoke-virtual {v4, v2}, La/fet;->e(I)Z

    .line 910
    .line 911
    .line 912
    move-result v22

    .line 913
    or-int v14, v14, v22

    .line 914
    .line 915
    invoke-virtual {v4, v11}, La/fet;->e(I)Z

    .line 916
    .line 917
    .line 918
    move-result v22

    .line 919
    or-int v14, v14, v22

    .line 920
    .line 921
    move/from16 v22, v0

    .line 922
    .line 923
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    if-nez v14, :cond_30

    .line 928
    .line 929
    if-ne v0, v3, :cond_2f

    .line 930
    .line 931
    goto :goto_1d

    .line 932
    :cond_2f
    move/from16 v26, v1

    .line 933
    .line 934
    move-object/from16 v27, v3

    .line 935
    .line 936
    const/4 v1, 0x2

    .line 937
    goto/16 :goto_25

    .line 938
    .line 939
    :cond_30
    :goto_1d
    sub-int v0, v9, v11

    .line 940
    .line 941
    add-int/lit8 v0, v0, 0x1

    .line 942
    .line 943
    move/from16 v14, v20

    .line 944
    .line 945
    if-ne v7, v1, :cond_31

    .line 946
    .line 947
    if-ne v11, v14, :cond_31

    .line 948
    .line 949
    move/from16 v26, v1

    .line 950
    .line 951
    :goto_1e
    move-object/from16 v27, v3

    .line 952
    .line 953
    move v0, v15

    .line 954
    :goto_1f
    const/4 v1, 0x2

    .line 955
    goto/16 :goto_24

    .line 956
    .line 957
    :cond_31
    const/4 v14, 0x2

    .line 958
    if-ne v7, v1, :cond_33

    .line 959
    .line 960
    if-ne v11, v14, :cond_33

    .line 961
    .line 962
    :goto_20
    move/from16 v26, v1

    .line 963
    .line 964
    move-object/from16 v27, v3

    .line 965
    .line 966
    move v1, v14

    .line 967
    :cond_32
    :goto_21
    move v0, v15

    .line 968
    goto/16 :goto_24

    .line 969
    .line 970
    :cond_33
    sget v24, La/n1i;->b:F

    .line 971
    .line 972
    const/4 v14, 0x1

    .line 973
    if-ne v7, v2, :cond_34

    .line 974
    .line 975
    if-ne v11, v14, :cond_34

    .line 976
    .line 977
    move/from16 v26, v1

    .line 978
    .line 979
    move-object/from16 v27, v3

    .line 980
    .line 981
    :goto_22
    move/from16 v0, v24

    .line 982
    .line 983
    goto :goto_1f

    .line 984
    :cond_34
    const/4 v14, 0x2

    .line 985
    if-ne v7, v2, :cond_35

    .line 986
    .line 987
    if-ne v11, v14, :cond_35

    .line 988
    .line 989
    goto :goto_20

    .line 990
    :cond_35
    sget v25, La/n1i;->c:F

    .line 991
    .line 992
    const/4 v14, 0x1

    .line 993
    if-lt v7, v2, :cond_36

    .line 994
    .line 995
    if-gt v11, v14, :cond_36

    .line 996
    .line 997
    move/from16 v26, v1

    .line 998
    .line 999
    move-object/from16 v27, v3

    .line 1000
    .line 1001
    move/from16 v0, v25

    .line 1002
    .line 1003
    goto :goto_1f

    .line 1004
    :cond_36
    if-lt v7, v2, :cond_37

    .line 1005
    .line 1006
    const/4 v14, 0x2

    .line 1007
    if-ne v11, v14, :cond_37

    .line 1008
    .line 1009
    move/from16 v26, v1

    .line 1010
    .line 1011
    move-object/from16 v27, v3

    .line 1012
    .line 1013
    move v1, v14

    .line 1014
    :goto_23
    move/from16 v0, v24

    .line 1015
    .line 1016
    goto :goto_24

    .line 1017
    :cond_37
    sub-int v14, v22, v7

    .line 1018
    .line 1019
    move/from16 v26, v1

    .line 1020
    .line 1021
    if-ne v14, v2, :cond_38

    .line 1022
    .line 1023
    const/4 v1, 0x1

    .line 1024
    if-ne v0, v1, :cond_38

    .line 1025
    .line 1026
    goto :goto_1e

    .line 1027
    :cond_38
    if-ne v14, v2, :cond_39

    .line 1028
    .line 1029
    const/4 v1, 0x2

    .line 1030
    if-ne v0, v1, :cond_39

    .line 1031
    .line 1032
    move-object/from16 v27, v3

    .line 1033
    .line 1034
    goto :goto_21

    .line 1035
    :cond_39
    add-int/lit8 v1, v26, 0x2

    .line 1036
    .line 1037
    move-object/from16 v27, v3

    .line 1038
    .line 1039
    const/4 v3, 0x1

    .line 1040
    if-ne v14, v1, :cond_3a

    .line 1041
    .line 1042
    if-ne v0, v3, :cond_3a

    .line 1043
    .line 1044
    goto :goto_22

    .line 1045
    :cond_3a
    if-ne v14, v1, :cond_3b

    .line 1046
    .line 1047
    const/4 v1, 0x2

    .line 1048
    if-ne v0, v1, :cond_3c

    .line 1049
    .line 1050
    goto :goto_21

    .line 1051
    :cond_3b
    const/4 v1, 0x2

    .line 1052
    :cond_3c
    if-lt v14, v2, :cond_3d

    .line 1053
    .line 1054
    if-gt v0, v3, :cond_3d

    .line 1055
    .line 1056
    move/from16 v0, v25

    .line 1057
    .line 1058
    goto :goto_24

    .line 1059
    :cond_3d
    if-lt v14, v2, :cond_32

    .line 1060
    .line 1061
    if-ne v0, v1, :cond_32

    .line 1062
    .line 1063
    goto :goto_23

    .line 1064
    :goto_24
    invoke-static {v0, v4}, La/twn;->j(FLa/fet;)La/ycl;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    :goto_25
    check-cast v0, La/ycl;

    .line 1069
    .line 1070
    iget v0, v0, La/ycl;->a:F

    .line 1071
    .line 1072
    move/from16 v23, v1

    .line 1073
    .line 1074
    move v3, v2

    .line 1075
    move v2, v0

    .line 1076
    move-wide v0, v5

    .line 1077
    const/4 v5, 0x0

    .line 1078
    move v6, v3

    .line 1079
    move v3, v12

    .line 1080
    move/from16 v12, p3

    .line 1081
    .line 1082
    invoke-static/range {v0 .. v5}, La/n1i;->b(JFFLa/fet;I)V

    .line 1083
    .line 1084
    .line 1085
    add-int/lit8 v11, v11, 0x1

    .line 1086
    .line 1087
    move v2, v6

    .line 1088
    move v5, v12

    .line 1089
    move/from16 v0, v22

    .line 1090
    .line 1091
    move/from16 v1, v26

    .line 1092
    .line 1093
    const/16 v20, 0x1

    .line 1094
    .line 1095
    move v6, v3

    .line 1096
    move-object/from16 v3, v27

    .line 1097
    .line 1098
    goto/16 :goto_19

    .line 1099
    .line 1100
    :cond_3e
    const/4 v0, 0x0

    .line 1101
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 1102
    .line 1103
    .line 1104
    :goto_26
    const/4 v14, 0x1

    .line 1105
    goto :goto_29

    .line 1106
    :cond_3f
    move-object/from16 v6, p3

    .line 1107
    .line 1108
    const/high16 p0, 0x40000000    # 2.0f

    .line 1109
    .line 1110
    const v0, -0x736db236

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 1114
    .line 1115
    .line 1116
    const/4 v8, 0x0

    .line 1117
    :goto_27
    if-ge v8, v9, :cond_43

    .line 1118
    .line 1119
    invoke-virtual {v4, v7}, La/fet;->e(I)Z

    .line 1120
    .line 1121
    .line 1122
    move-result v0

    .line 1123
    invoke-virtual {v4, v8}, La/fet;->e(I)Z

    .line 1124
    .line 1125
    .line 1126
    move-result v1

    .line 1127
    or-int/2addr v0, v1

    .line 1128
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v1

    .line 1132
    if-nez v0, :cond_40

    .line 1133
    .line 1134
    if-ne v1, v6, :cond_42

    .line 1135
    .line 1136
    :cond_40
    if-ne v7, v8, :cond_41

    .line 1137
    .line 1138
    move-wide/from16 v0, v16

    .line 1139
    .line 1140
    goto :goto_28

    .line 1141
    :cond_41
    move-wide/from16 v0, v18

    .line 1142
    .line 1143
    :goto_28
    invoke-static {v0, v1, v4}, La/dw9;->e(JLa/fet;)La/y3d;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v1

    .line 1147
    :cond_42
    check-cast v1, La/y3d;

    .line 1148
    .line 1149
    iget-wide v0, v1, La/y3d;->a:J

    .line 1150
    .line 1151
    div-float v3, v14, p0

    .line 1152
    .line 1153
    const/16 v5, 0x1b0

    .line 1154
    .line 1155
    sget v2, La/n1i;->a:F

    .line 1156
    .line 1157
    invoke-static/range {v0 .. v5}, La/n1i;->b(JFFLa/fet;I)V

    .line 1158
    .line 1159
    .line 1160
    add-int/lit8 v8, v8, 0x1

    .line 1161
    .line 1162
    goto :goto_27

    .line 1163
    :cond_43
    const/4 v0, 0x0

    .line 1164
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_26

    .line 1168
    :goto_29
    invoke-virtual {v4, v14}, La/fet;->r(Z)V

    .line 1169
    .line 1170
    .line 1171
    move-object v1, v10

    .line 1172
    move-object v4, v13

    .line 1173
    goto :goto_2a

    .line 1174
    :cond_44
    invoke-virtual {v4}, La/fet;->X()V

    .line 1175
    .line 1176
    .line 1177
    move-object v4, v8

    .line 1178
    :goto_2a
    invoke-virtual/range {p4 .. p4}, La/fet;->u()La/yfe0;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v8

    .line 1182
    if-eqz v8, :cond_45

    .line 1183
    .line 1184
    new-instance v0, La/m1i;

    .line 1185
    .line 1186
    const/4 v7, 0x1

    .line 1187
    move-object/from16 v2, p1

    .line 1188
    .line 1189
    move-object/from16 v3, p2

    .line 1190
    .line 1191
    move/from16 v5, p5

    .line 1192
    .line 1193
    move/from16 v6, p6

    .line 1194
    .line 1195
    invoke-direct/range {v0 .. v7}, La/m1i;-><init>(La/mm40;La/xk80;La/smm;La/y3d;IIB)V

    .line 1196
    .line 1197
    .line 1198
    goto/16 :goto_8

    .line 1199
    .line 1200
    :cond_45
    return-void
.end method

.method public static final b(JFFLa/fet;I)V
    .locals 17

    .line 1
    move-wide/from16 v1, p0

    .line 2
    .line 3
    move/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v0, p4

    .line 8
    .line 9
    move/from16 v5, p5

    .line 10
    .line 11
    const v6, -0x7e43fec6

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v6}, La/fet;->g0(I)La/fet;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, La/fet;->f(J)Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    const/4 v7, 0x2

    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    const/4 v6, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v6, v7

    .line 27
    :goto_0
    or-int/2addr v6, v5

    .line 28
    and-int/lit8 v8, v5, 0x30

    .line 29
    .line 30
    if-nez v8, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0, v3}, La/fet;->d(F)Z

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    if-eqz v8, :cond_1

    .line 37
    .line 38
    const/16 v8, 0x20

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/16 v8, 0x10

    .line 42
    .line 43
    :goto_1
    or-int/2addr v6, v8

    .line 44
    :cond_2
    and-int/lit16 v8, v5, 0x180

    .line 45
    .line 46
    if-nez v8, :cond_4

    .line 47
    .line 48
    invoke-virtual {v0, v4}, La/fet;->d(F)Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eqz v8, :cond_3

    .line 53
    .line 54
    const/16 v8, 0x100

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    const/16 v8, 0x80

    .line 58
    .line 59
    :goto_2
    or-int/2addr v6, v8

    .line 60
    :cond_4
    and-int/lit16 v8, v6, 0x93

    .line 61
    .line 62
    const/16 v9, 0x92

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    const/4 v11, 0x1

    .line 66
    if-eq v8, v9, :cond_5

    .line 67
    .line 68
    move v8, v11

    .line 69
    goto :goto_3

    .line 70
    :cond_5
    move v8, v10

    .line 71
    :goto_3
    and-int/2addr v6, v11

    .line 72
    invoke-virtual {v0, v6, v8}, La/fet;->U(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_7

    .line 77
    .line 78
    sget-object v6, La/jm40;->b:La/jm40;

    .line 79
    .line 80
    const/4 v8, 0x0

    .line 81
    invoke-static {v6, v4, v8, v7}, La/ffb0;->R(La/mm40;FFI)La/mm40;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    sget v12, La/n1i;->a:F

    .line 86
    .line 87
    const/high16 v13, 0x40000000    # 2.0f

    .line 88
    .line 89
    mul-float/2addr v12, v13

    .line 90
    invoke-static {v9, v12}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    sget-object v12, La/gqw0;->e:La/zx7;

    .line 95
    .line 96
    invoke-static {v12, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    iget-wide v10, v0, La/fet;->T:J

    .line 101
    .line 102
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    invoke-static {v0, v9}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 115
    .line 116
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, La/fet;->i0()V

    .line 120
    .line 121
    .line 122
    move/from16 v16, v13

    .line 123
    .line 124
    iget-boolean v13, v0, La/fet;->S:Z

    .line 125
    .line 126
    if-eqz v13, :cond_6

    .line 127
    .line 128
    sget-object v13, La/e7z;->u1:La/pcy;

    .line 129
    .line 130
    invoke-virtual {v0, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_6
    invoke-virtual {v0}, La/fet;->r0()V

    .line 135
    .line 136
    .line 137
    :goto_4
    sget-object v13, La/gqw0;->x:La/shd;

    .line 138
    .line 139
    invoke-static {v0, v14, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 140
    .line 141
    .line 142
    sget-object v13, La/gqw0;->w:La/shd;

    .line 143
    .line 144
    invoke-static {v0, v11, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    sget-object v11, La/gqw0;->y:La/shd;

    .line 152
    .line 153
    invoke-static {v0, v10, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 157
    .line 158
    .line 159
    sget-object v10, La/gqw0;->v:La/shd;

    .line 160
    .line 161
    invoke-static {v0, v9, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 162
    .line 163
    .line 164
    sget v9, La/n1i;->d:F

    .line 165
    .line 166
    div-float v9, v9, v16

    .line 167
    .line 168
    invoke-static {v6, v9, v8, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    sget-object v7, La/jr8;->a:La/jr8;

    .line 173
    .line 174
    invoke-virtual {v7, v6, v12}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-static {v6}, La/hp4;->C(La/mm40;)La/mm40;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    sget-object v7, La/vgg0;->a:La/ugg0;

    .line 183
    .line 184
    invoke-static {v6, v7}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    sget-object v7, La/jd8;->n:La/ljc;

    .line 189
    .line 190
    invoke-static {v6, v1, v2, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-static {v6, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    const/4 v15, 0x0

    .line 199
    invoke-static {v15, v0, v6}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 200
    .line 201
    .line 202
    const/4 v6, 0x1

    .line 203
    invoke-virtual {v0, v6}, La/fet;->r(Z)V

    .line 204
    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_7
    invoke-virtual {v0}, La/fet;->X()V

    .line 208
    .line 209
    .line 210
    :goto_5
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    if-eqz v6, :cond_8

    .line 215
    .line 216
    new-instance v0, La/l1i;

    .line 217
    .line 218
    invoke-direct/range {v0 .. v5}, La/l1i;-><init>(JFFI)V

    .line 219
    .line 220
    .line 221
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 222
    .line 223
    :cond_8
    return-void
.end method
