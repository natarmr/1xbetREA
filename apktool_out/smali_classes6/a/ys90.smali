.class public abstract La/ys90;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-wide v0, 0x4082c00000000000L    # 600.0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    double-to-float v2, v2

    .line 11
    const/high16 v3, 0x40000000    # 2.0f

    .line 12
    .line 13
    mul-float/2addr v2, v3

    .line 14
    const/high16 v4, 0x42200000    # 40.0f

    .line 15
    .line 16
    div-float/2addr v4, v2

    .line 17
    const v2, 0x3d4ccccd    # 0.05f

    .line 18
    .line 19
    .line 20
    const/high16 v5, 0x3f800000    # 1.0f

    .line 21
    .line 22
    invoke-static {v4, v2, v5}, La/l1e0;->c(FFF)F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    sput v2, La/ys90;->a:F

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    double-to-float v0, v0

    .line 33
    mul-float/2addr v0, v3

    .line 34
    const/high16 v1, 0x42700000    # 60.0f

    .line 35
    .line 36
    div-float/2addr v1, v0

    .line 37
    sput v1, La/ys90;->b:F

    .line 38
    .line 39
    return-void
.end method

.method public static final a(La/mm40;Landroidx/compose/runtime/snapshots/SnapshotStateList;ZFILa/b8x;La/okt0;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 52

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move/from16 v0, p2

    .line 6
    .line 7
    move/from16 v15, p3

    .line 8
    .line 9
    move/from16 v2, p4

    .line 10
    .line 11
    move-object/from16 v7, p6

    .line 12
    .line 13
    move-object/from16 v3, p8

    .line 14
    .line 15
    move-object/from16 v4, p10

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const v6, 0x2546caec

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v6}, La/fet;->g0(I)La/fet;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_0

    .line 34
    .line 35
    const/4 v6, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v6, 0x2

    .line 38
    :goto_0
    or-int v6, p11, v6

    .line 39
    .line 40
    invoke-virtual {v4, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    if-eqz v10, :cond_1

    .line 45
    .line 46
    const/16 v10, 0x20

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/16 v10, 0x10

    .line 50
    .line 51
    :goto_1
    or-int/2addr v6, v10

    .line 52
    invoke-virtual {v4, v0}, La/fet;->h(Z)Z

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    if-eqz v10, :cond_2

    .line 57
    .line 58
    const/16 v10, 0x100

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/16 v10, 0x80

    .line 62
    .line 63
    :goto_2
    or-int/2addr v6, v10

    .line 64
    invoke-virtual {v4, v15}, La/fet;->d(F)Z

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    if-eqz v10, :cond_3

    .line 69
    .line 70
    const/16 v10, 0x800

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    const/16 v10, 0x400

    .line 74
    .line 75
    :goto_3
    or-int/2addr v6, v10

    .line 76
    invoke-virtual {v4, v2}, La/fet;->e(I)Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-eqz v10, :cond_4

    .line 81
    .line 82
    const/16 v10, 0x4000

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_4
    const/16 v10, 0x2000

    .line 86
    .line 87
    :goto_4
    or-int/2addr v6, v10

    .line 88
    const/high16 v10, 0x10000

    .line 89
    .line 90
    or-int/2addr v6, v10

    .line 91
    invoke-virtual {v4, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    if-eqz v10, :cond_5

    .line 96
    .line 97
    const/high16 v10, 0x100000

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_5
    const/high16 v10, 0x80000

    .line 101
    .line 102
    :goto_5
    or-int/2addr v6, v10

    .line 103
    move/from16 v10, p7

    .line 104
    .line 105
    invoke-virtual {v4, v10}, La/fet;->h(Z)Z

    .line 106
    .line 107
    .line 108
    move-result v16

    .line 109
    if-eqz v16, :cond_6

    .line 110
    .line 111
    const/high16 v16, 0x800000

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_6
    const/high16 v16, 0x400000

    .line 115
    .line 116
    :goto_6
    or-int v6, v6, v16

    .line 117
    .line 118
    invoke-virtual {v4, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v16

    .line 122
    if-eqz v16, :cond_7

    .line 123
    .line 124
    const/high16 v16, 0x4000000

    .line 125
    .line 126
    goto :goto_7

    .line 127
    :cond_7
    const/high16 v16, 0x2000000

    .line 128
    .line 129
    :goto_7
    or-int v6, v6, v16

    .line 130
    .line 131
    move-object/from16 v11, p9

    .line 132
    .line 133
    invoke-virtual {v4, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v16

    .line 137
    if-eqz v16, :cond_8

    .line 138
    .line 139
    const/high16 v16, 0x20000000

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_8
    const/high16 v16, 0x10000000

    .line 143
    .line 144
    :goto_8
    or-int v6, v6, v16

    .line 145
    .line 146
    const v16, 0x12492493

    .line 147
    .line 148
    .line 149
    and-int v14, v6, v16

    .line 150
    .line 151
    const v9, 0x12492492

    .line 152
    .line 153
    .line 154
    if-eq v14, v9, :cond_9

    .line 155
    .line 156
    const/4 v9, 0x1

    .line 157
    goto :goto_9

    .line 158
    :cond_9
    const/4 v9, 0x0

    .line 159
    :goto_9
    and-int/lit8 v14, v6, 0x1

    .line 160
    .line 161
    invoke-virtual {v4, v14, v9}, La/fet;->U(IZ)Z

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    if-eqz v9, :cond_44

    .line 166
    .line 167
    invoke-virtual {v4}, La/fet;->Z()V

    .line 168
    .line 169
    .line 170
    and-int/lit8 v9, p11, 0x1

    .line 171
    .line 172
    const v14, -0x70001

    .line 173
    .line 174
    .line 175
    if-eqz v9, :cond_b

    .line 176
    .line 177
    invoke-virtual {v4}, La/fet;->B()Z

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    if-eqz v9, :cond_a

    .line 182
    .line 183
    goto :goto_a

    .line 184
    :cond_a
    invoke-virtual {v4}, La/fet;->X()V

    .line 185
    .line 186
    .line 187
    and-int/2addr v6, v14

    .line 188
    move v9, v6

    .line 189
    move-object/from16 v6, p5

    .line 190
    .line 191
    goto :goto_b

    .line 192
    :cond_b
    :goto_a
    new-instance v9, La/b8x;

    .line 193
    .line 194
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 195
    .line 196
    .line 197
    and-int/2addr v6, v14

    .line 198
    move-object/from16 v51, v9

    .line 199
    .line 200
    move v9, v6

    .line 201
    move-object/from16 v6, v51

    .line 202
    .line 203
    :goto_b
    invoke-virtual {v4}, La/fet;->s()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v14

    .line 210
    const/high16 v13, 0x44160000    # 600.0f

    .line 211
    .line 212
    const/4 v12, 0x0

    .line 213
    sget-object v8, La/ukd;->a:La/cl5;

    .line 214
    .line 215
    if-ne v14, v8, :cond_c

    .line 216
    .line 217
    sget v14, La/ys90;->b:F

    .line 218
    .line 219
    const/4 v0, 0x4

    .line 220
    invoke-static {v14, v13, v12, v0}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    invoke-virtual {v4, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    goto :goto_c

    .line 228
    :cond_c
    const/4 v0, 0x4

    .line 229
    :goto_c
    check-cast v14, La/nul0;

    .line 230
    .line 231
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    if-ne v0, v8, :cond_d

    .line 236
    .line 237
    sget v0, La/ys90;->a:F

    .line 238
    .line 239
    const/4 v2, 0x4

    .line 240
    invoke-static {v0, v13, v12, v2}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {v4, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_d
    move-object/from16 v25, v0

    .line 248
    .line 249
    check-cast v25, La/nul0;

    .line 250
    .line 251
    sget-object v0, La/bmd;->h:La/zfn;

    .line 252
    .line 253
    invoke-virtual {v4, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, La/w6k;

    .line 258
    .line 259
    sget v2, La/fs90;->a:F

    .line 260
    .line 261
    invoke-interface {v0, v2}, La/w6k;->w0(F)F

    .line 262
    .line 263
    .line 264
    move-result v13

    .line 265
    move-object/from16 p5, v12

    .line 266
    .line 267
    invoke-interface {v0, v15}, La/w6k;->w0(F)F

    .line 268
    .line 269
    .line 270
    move-result v12

    .line 271
    invoke-virtual {v4, v12}, La/fet;->d(F)Z

    .line 272
    .line 273
    .line 274
    move-result v20

    .line 275
    move/from16 v21, v2

    .line 276
    .line 277
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    const/high16 v22, 0x40000000    # 2.0f

    .line 282
    .line 283
    if-nez v20, :cond_e

    .line 284
    .line 285
    if-ne v2, v8, :cond_f

    .line 286
    .line 287
    :cond_e
    div-float v12, v12, v22

    .line 288
    .line 289
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_f
    check-cast v2, Ljava/lang/Number;

    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 303
    .line 304
    .line 305
    move-result v12

    .line 306
    invoke-static {v5, v4}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    invoke-static {v3, v4}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    invoke-static/range {p9 .. p10}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    and-int/lit16 v11, v9, 0x380

    .line 319
    .line 320
    move/from16 v44, v9

    .line 321
    .line 322
    const/16 v9, 0x100

    .line 323
    .line 324
    if-ne v11, v9, :cond_10

    .line 325
    .line 326
    const/4 v9, 0x1

    .line 327
    goto :goto_d

    .line 328
    :cond_10
    const/4 v9, 0x0

    .line 329
    :goto_d
    invoke-virtual {v4, v12}, La/fet;->e(I)Z

    .line 330
    .line 331
    .line 332
    move-result v20

    .line 333
    or-int v9, v9, v20

    .line 334
    .line 335
    const v20, 0xe000

    .line 336
    .line 337
    .line 338
    move/from16 v23, v9

    .line 339
    .line 340
    and-int v9, v44, v20

    .line 341
    .line 342
    move-object/from16 v45, v14

    .line 343
    .line 344
    const/16 v14, 0x4000

    .line 345
    .line 346
    if-ne v9, v14, :cond_11

    .line 347
    .line 348
    const/4 v9, 0x1

    .line 349
    goto :goto_e

    .line 350
    :cond_11
    const/4 v9, 0x0

    .line 351
    :goto_e
    or-int v9, v23, v9

    .line 352
    .line 353
    invoke-virtual {v4, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v14

    .line 357
    or-int/2addr v9, v14

    .line 358
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v14

    .line 362
    if-nez v9, :cond_13

    .line 363
    .line 364
    if-ne v14, v8, :cond_12

    .line 365
    .line 366
    goto :goto_f

    .line 367
    :cond_12
    move-object/from16 v46, v6

    .line 368
    .line 369
    goto :goto_15

    .line 370
    :cond_13
    :goto_f
    if-eqz p2, :cond_17

    .line 371
    .line 372
    if-lez v12, :cond_17

    .line 373
    .line 374
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    const/4 v9, 0x1

    .line 378
    if-ge v12, v9, :cond_14

    .line 379
    .line 380
    const/4 v9, 0x1

    .line 381
    goto :goto_10

    .line 382
    :cond_14
    move v9, v12

    .line 383
    :goto_10
    const-wide v23, 0x4072c00000000000L    # 300.0

    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    int-to-double v14, v9

    .line 389
    div-double v23, v23, v14

    .line 390
    .line 391
    invoke-static/range {v23 .. v24}, Ljava/lang/Math;->ceil(D)D

    .line 392
    .line 393
    .line 394
    move-result-wide v14

    .line 395
    double-to-int v14, v14

    .line 396
    const/4 v15, 0x3

    .line 397
    invoke-static {v15, v14}, Ljava/lang/Math;->max(II)I

    .line 398
    .line 399
    .line 400
    move-result v14

    .line 401
    const/16 v18, 0x3e8

    .line 402
    .line 403
    div-int v15, v18, v9

    .line 404
    .line 405
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 406
    .line 407
    .line 408
    move-result v14

    .line 409
    rem-int/lit8 v15, v14, 0x2

    .line 410
    .line 411
    move-object/from16 v46, v6

    .line 412
    .line 413
    const/4 v6, 0x1

    .line 414
    if-ne v15, v6, :cond_15

    .line 415
    .line 416
    :goto_11
    const/4 v6, 0x3

    .line 417
    goto :goto_12

    .line 418
    :cond_15
    add-int/lit8 v14, v14, -0x1

    .line 419
    .line 420
    goto :goto_11

    .line 421
    :goto_12
    if-ge v14, v6, :cond_16

    .line 422
    .line 423
    move/from16 v28, v6

    .line 424
    .line 425
    goto :goto_13

    .line 426
    :cond_16
    move/from16 v28, v14

    .line 427
    .line 428
    :goto_13
    mul-int v29, v28, v9

    .line 429
    .line 430
    div-int/lit8 v6, v28, 0x2

    .line 431
    .line 432
    mul-int v30, v6, v9

    .line 433
    .line 434
    rem-int v6, p4, v9

    .line 435
    .line 436
    add-int/2addr v6, v9

    .line 437
    rem-int/2addr v6, v9

    .line 438
    add-int v31, v6, v30

    .line 439
    .line 440
    new-instance v26, La/a8x;

    .line 441
    .line 442
    move/from16 v27, v9

    .line 443
    .line 444
    invoke-direct/range {v26 .. v31}, La/a8x;-><init>(IIIII)V

    .line 445
    .line 446
    .line 447
    move-object/from16 v14, v26

    .line 448
    .line 449
    goto :goto_14

    .line 450
    :cond_17
    move-object/from16 v46, v6

    .line 451
    .line 452
    move-object/from16 v14, p5

    .line 453
    .line 454
    :goto_14
    invoke-virtual {v4, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    :goto_15
    check-cast v14, La/a8x;

    .line 458
    .line 459
    invoke-static {v14, v4}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    if-eqz v14, :cond_18

    .line 464
    .line 465
    iget v9, v14, La/a8x;->e:I

    .line 466
    .line 467
    :goto_16
    const/4 v1, 0x0

    .line 468
    const/4 v15, 0x2

    .line 469
    goto :goto_17

    .line 470
    :cond_18
    move/from16 v9, p4

    .line 471
    .line 472
    goto :goto_16

    .line 473
    :goto_17
    invoke-static {v9, v1, v4, v1, v15}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 474
    .line 475
    .line 476
    move-result-object v9

    .line 477
    const/16 v1, 0x100

    .line 478
    .line 479
    if-ne v11, v1, :cond_19

    .line 480
    .line 481
    const/4 v1, 0x1

    .line 482
    goto :goto_18

    .line 483
    :cond_19
    const/4 v1, 0x0

    .line 484
    :goto_18
    invoke-virtual {v4, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v11

    .line 488
    or-int/2addr v1, v11

    .line 489
    invoke-virtual {v4, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v11

    .line 493
    or-int/2addr v1, v11

    .line 494
    invoke-virtual {v4, v13}, La/fet;->d(F)Z

    .line 495
    .line 496
    .line 497
    move-result v11

    .line 498
    or-int/2addr v1, v11

    .line 499
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v11

    .line 503
    if-nez v1, :cond_1a

    .line 504
    .line 505
    if-ne v11, v8, :cond_1b

    .line 506
    .line 507
    :cond_1a
    new-instance v1, La/hh10;

    .line 508
    .line 509
    const/4 v11, 0x1

    .line 510
    invoke-direct {v1, v9, v13, v14, v11}, La/hh10;-><init>(Ljava/lang/Object;FLjava/lang/Object;B)V

    .line 511
    .line 512
    .line 513
    invoke-static {v1}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 514
    .line 515
    .line 516
    move-result-object v11

    .line 517
    invoke-virtual {v4, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    :cond_1b
    check-cast v11, La/l7m0;

    .line 521
    .line 522
    invoke-virtual {v4, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v1

    .line 526
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v15

    .line 530
    if-nez v1, :cond_1c

    .line 531
    .line 532
    if-ne v15, v8, :cond_1d

    .line 533
    .line 534
    :cond_1c
    sget-object v1, La/gfk0;->b:La/gfk0;

    .line 535
    .line 536
    new-instance v15, La/qcz;

    .line 537
    .line 538
    invoke-direct {v15, v9, v1}, La/qcz;-><init>(La/xcz;La/ifk0;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v4, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    :cond_1d
    check-cast v15, La/ffk0;

    .line 545
    .line 546
    invoke-static {v15, v4}, La/bdx;->m0(La/ffk0;La/fet;)La/afk0;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    const/high16 v15, 0x41100000    # 9.0f

    .line 551
    .line 552
    mul-float v15, v15, v21

    .line 553
    .line 554
    move-object/from16 v47, v1

    .line 555
    .line 556
    sget-object v1, La/dy2;->b:La/zfn;

    .line 557
    .line 558
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    check-cast v1, Landroid/content/Context;

    .line 563
    .line 564
    move-object/from16 v33, v3

    .line 565
    .line 566
    sget-object v3, La/bmd;->l:La/zfn;

    .line 567
    .line 568
    invoke-virtual {v4, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    check-cast v3, La/omv;

    .line 573
    .line 574
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v16

    .line 578
    move-object/from16 v28, v5

    .line 579
    .line 580
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    if-nez v16, :cond_1f

    .line 585
    .line 586
    if-ne v5, v8, :cond_1e

    .line 587
    .line 588
    goto :goto_19

    .line 589
    :cond_1e
    move-object/from16 v38, v10

    .line 590
    .line 591
    goto :goto_1c

    .line 592
    :cond_1f
    :goto_19
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 593
    .line 594
    move-object/from16 v38, v10

    .line 595
    .line 596
    const/16 v10, 0x1f

    .line 597
    .line 598
    if-lt v5, v10, :cond_20

    .line 599
    .line 600
    const-string v5, "vibrator_manager"

    .line 601
    .line 602
    invoke-virtual {v1, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    invoke-static {v1}, La/tl50;->q(Ljava/lang/Object;)Landroid/os/VibratorManager;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    invoke-static {v1}, La/tl50;->p(Landroid/os/VibratorManager;)Landroid/os/Vibrator;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    :goto_1a
    move-object v5, v1

    .line 618
    goto :goto_1b

    .line 619
    :cond_20
    const-string v5, "vibrator"

    .line 620
    .line 621
    invoke-virtual {v1, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    check-cast v1, Landroid/os/Vibrator;

    .line 629
    .line 630
    goto :goto_1a

    .line 631
    :goto_1b
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    :goto_1c
    check-cast v5, Landroid/os/Vibrator;

    .line 635
    .line 636
    new-instance v1, La/nw20;

    .line 637
    .line 638
    invoke-direct {v1, v3, v5}, La/nw20;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    if-ne v3, v8, :cond_21

    .line 646
    .line 647
    const-wide/16 v18, 0x0

    .line 648
    .line 649
    invoke-static/range {v18 .. v19}, Landroidx/compose/runtime/e;->c(J)La/egk0;

    .line 650
    .line 651
    .line 652
    move-result-object v3

    .line 653
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    :cond_21
    move-object/from16 v41, v3

    .line 657
    .line 658
    check-cast v41, La/egk0;

    .line 659
    .line 660
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v3

    .line 664
    if-ne v3, v8, :cond_22

    .line 665
    .line 666
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 667
    .line 668
    .line 669
    move-result-object v3

    .line 670
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    :cond_22
    move-object/from16 v30, v3

    .line 674
    .line 675
    check-cast v30, La/cgk0;

    .line 676
    .line 677
    invoke-virtual {v4, v2}, La/fet;->d(F)Z

    .line 678
    .line 679
    .line 680
    move-result v3

    .line 681
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v5

    .line 685
    const/4 v10, 0x0

    .line 686
    if-nez v3, :cond_23

    .line 687
    .line 688
    if-ne v5, v8, :cond_25

    .line 689
    .line 690
    :cond_23
    invoke-interface {v0, v15}, La/w6k;->w0(F)F

    .line 691
    .line 692
    .line 693
    move-result v3

    .line 694
    div-float v3, v3, v22

    .line 695
    .line 696
    sub-float/2addr v3, v2

    .line 697
    cmpg-float v5, v3, v10

    .line 698
    .line 699
    if-gez v5, :cond_24

    .line 700
    .line 701
    move v3, v10

    .line 702
    :cond_24
    invoke-static {v3}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 703
    .line 704
    .line 705
    move-result-object v5

    .line 706
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 707
    .line 708
    .line 709
    :cond_25
    check-cast v5, La/agk0;

    .line 710
    .line 711
    invoke-virtual {v5}, La/agk0;->l()F

    .line 712
    .line 713
    .line 714
    move-result v3

    .line 715
    invoke-interface {v0, v3}, La/w6k;->s0(F)F

    .line 716
    .line 717
    .line 718
    move-result v0

    .line 719
    invoke-virtual {v5}, La/agk0;->l()F

    .line 720
    .line 721
    .line 722
    move-result v3

    .line 723
    invoke-virtual {v4, v3}, La/fet;->d(F)Z

    .line 724
    .line 725
    .line 726
    move-result v3

    .line 727
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v10

    .line 731
    if-nez v3, :cond_26

    .line 732
    .line 733
    if-ne v10, v8, :cond_27

    .line 734
    .line 735
    :cond_26
    invoke-virtual {v5}, La/agk0;->l()F

    .line 736
    .line 737
    .line 738
    move-result v3

    .line 739
    mul-float v3, v3, v22

    .line 740
    .line 741
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 742
    .line 743
    .line 744
    move-result-object v10

    .line 745
    invoke-virtual {v4, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    :cond_27
    check-cast v10, Ljava/lang/Number;

    .line 749
    .line 750
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 751
    .line 752
    .line 753
    move-result v3

    .line 754
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v5

    .line 758
    if-ne v5, v8, :cond_28

    .line 759
    .line 760
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 761
    .line 762
    invoke-static {v5}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 763
    .line 764
    .line 765
    move-result-object v5

    .line 766
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    :cond_28
    move-object/from16 v20, v5

    .line 770
    .line 771
    check-cast v20, La/pz40;

    .line 772
    .line 773
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v5

    .line 777
    if-ne v5, v8, :cond_29

    .line 778
    .line 779
    sget-object v5, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 780
    .line 781
    invoke-static {v5, v4}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 782
    .line 783
    .line 784
    move-result-object v5

    .line 785
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 786
    .line 787
    .line 788
    :cond_29
    check-cast v5, La/vne;

    .line 789
    .line 790
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v10

    .line 794
    if-ne v10, v8, :cond_2a

    .line 795
    .line 796
    invoke-static/range {p5 .. p5}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 797
    .line 798
    .line 799
    move-result-object v10

    .line 800
    invoke-virtual {v4, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 801
    .line 802
    .line 803
    :cond_2a
    move-object/from16 v29, v10

    .line 804
    .line 805
    check-cast v29, La/pz40;

    .line 806
    .line 807
    const/high16 v10, 0x380000

    .line 808
    .line 809
    and-int v10, v44, v10

    .line 810
    .line 811
    move/from16 v48, v3

    .line 812
    .line 813
    const/high16 v3, 0x100000

    .line 814
    .line 815
    if-eq v10, v3, :cond_2c

    .line 816
    .line 817
    invoke-virtual {v4, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    move-result v3

    .line 821
    if-eqz v3, :cond_2b

    .line 822
    .line 823
    goto :goto_1d

    .line 824
    :cond_2b
    const/4 v3, 0x0

    .line 825
    goto :goto_1e

    .line 826
    :cond_2c
    :goto_1d
    const/4 v3, 0x1

    .line 827
    :goto_1e
    invoke-virtual {v4, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    move-result v10

    .line 831
    or-int/2addr v3, v10

    .line 832
    invoke-virtual {v4, v13}, La/fet;->d(F)Z

    .line 833
    .line 834
    .line 835
    move-result v10

    .line 836
    or-int/2addr v3, v10

    .line 837
    invoke-virtual {v4, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v10

    .line 841
    or-int/2addr v3, v10

    .line 842
    invoke-virtual {v4, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    move-result v10

    .line 846
    or-int/2addr v3, v10

    .line 847
    invoke-virtual {v4, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    move-result v10

    .line 851
    or-int/2addr v3, v10

    .line 852
    invoke-virtual {v4, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    move-result v10

    .line 856
    or-int/2addr v3, v10

    .line 857
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v10

    .line 861
    if-nez v3, :cond_2e

    .line 862
    .line 863
    if-ne v10, v8, :cond_2d

    .line 864
    .line 865
    goto :goto_1f

    .line 866
    :cond_2d
    move-object v3, v9

    .line 867
    move-object v9, v5

    .line 868
    move-object v5, v6

    .line 869
    move-object v6, v3

    .line 870
    move-object v3, v7

    .line 871
    move v7, v13

    .line 872
    move-object/from16 v18, v25

    .line 873
    .line 874
    move-object/from16 v25, v29

    .line 875
    .line 876
    goto :goto_20

    .line 877
    :cond_2e
    :goto_1f
    new-instance v16, La/ms90;

    .line 878
    .line 879
    const/16 v27, 0x0

    .line 880
    .line 881
    move-object/from16 v19, v5

    .line 882
    .line 883
    move-object/from16 v26, v6

    .line 884
    .line 885
    move-object/from16 v17, v7

    .line 886
    .line 887
    move-object/from16 v21, v9

    .line 888
    .line 889
    move-object/from16 v24, v11

    .line 890
    .line 891
    move/from16 v22, v13

    .line 892
    .line 893
    move-object/from16 v23, v14

    .line 894
    .line 895
    move-object/from16 v18, v25

    .line 896
    .line 897
    move-object/from16 v25, v29

    .line 898
    .line 899
    invoke-direct/range {v16 .. v27}, La/ms90;-><init>(La/okt0;La/j73;La/vne;La/pz40;La/xcz;FLa/a8x;La/l7m0;La/pz40;La/pz40;La/yje;)V

    .line 900
    .line 901
    .line 902
    move-object/from16 v10, v16

    .line 903
    .line 904
    move-object/from16 v3, v17

    .line 905
    .line 906
    move-object/from16 v9, v19

    .line 907
    .line 908
    move-object/from16 v6, v21

    .line 909
    .line 910
    move/from16 v7, v22

    .line 911
    .line 912
    move-object/from16 v5, v26

    .line 913
    .line 914
    invoke-virtual {v4, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 915
    .line 916
    .line 917
    :goto_20
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 918
    .line 919
    invoke-static {v3, v6, v10, v4}, La/m0x0;->v(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 920
    .line 921
    .line 922
    if-eqz v14, :cond_2f

    .line 923
    .line 924
    iget v10, v14, La/a8x;->c:I

    .line 925
    .line 926
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 927
    .line 928
    .line 929
    move-result-object v10

    .line 930
    goto :goto_21

    .line 931
    :cond_2f
    move-object/from16 v10, p5

    .line 932
    .line 933
    :goto_21
    invoke-virtual {v4, v12}, La/fet;->e(I)Z

    .line 934
    .line 935
    .line 936
    move-result v13

    .line 937
    invoke-virtual {v4, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 938
    .line 939
    .line 940
    move-result v10

    .line 941
    or-int/2addr v10, v13

    .line 942
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v13

    .line 946
    if-nez v10, :cond_30

    .line 947
    .line 948
    if-ne v13, v8, :cond_31

    .line 949
    .line 950
    :cond_30
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 951
    .line 952
    invoke-static {v10}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 953
    .line 954
    .line 955
    move-result-object v13

    .line 956
    invoke-virtual {v4, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    :cond_31
    check-cast v13, La/pz40;

    .line 960
    .line 961
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v10

    .line 965
    if-ne v10, v8, :cond_32

    .line 966
    .line 967
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 968
    .line 969
    invoke-static {v10}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 970
    .line 971
    .line 972
    move-result-object v10

    .line 973
    invoke-virtual {v4, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 974
    .line 975
    .line 976
    :cond_32
    check-cast v10, La/pz40;

    .line 977
    .line 978
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v3

    .line 982
    if-ne v3, v8, :cond_33

    .line 983
    .line 984
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 985
    .line 986
    invoke-static {v3}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 987
    .line 988
    .line 989
    move-result-object v3

    .line 990
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 991
    .line 992
    .line 993
    :cond_33
    move-object/from16 v24, v3

    .line 994
    .line 995
    check-cast v24, La/pz40;

    .line 996
    .line 997
    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 998
    .line 999
    .line 1000
    move-result-object v3

    .line 1001
    move-object/from16 v34, v10

    .line 1002
    .line 1003
    invoke-static/range {p7 .. p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v10

    .line 1007
    move/from16 v49, v2

    .line 1008
    .line 1009
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    move/from16 v50, v12

    .line 1014
    .line 1015
    if-eqz v14, :cond_34

    .line 1016
    .line 1017
    iget v12, v14, La/a8x;->c:I

    .line 1018
    .line 1019
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v12

    .line 1023
    goto :goto_22

    .line 1024
    :cond_34
    move-object/from16 v12, p5

    .line 1025
    .line 1026
    :goto_22
    filled-new-array {v6, v3, v10, v2, v12}, [Ljava/lang/Object;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v2

    .line 1030
    invoke-virtual {v4, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1031
    .line 1032
    .line 1033
    move-result v3

    .line 1034
    invoke-virtual {v4, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1035
    .line 1036
    .line 1037
    move-result v10

    .line 1038
    or-int/2addr v3, v10

    .line 1039
    invoke-virtual {v4, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v10

    .line 1043
    or-int/2addr v3, v10

    .line 1044
    invoke-virtual {v4, v7}, La/fet;->d(F)Z

    .line 1045
    .line 1046
    .line 1047
    move-result v10

    .line 1048
    or-int/2addr v3, v10

    .line 1049
    move-object/from16 v10, v38

    .line 1050
    .line 1051
    invoke-virtual {v4, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v12

    .line 1055
    or-int/2addr v3, v12

    .line 1056
    const/high16 v12, 0x1c00000

    .line 1057
    .line 1058
    and-int v12, v44, v12

    .line 1059
    .line 1060
    move/from16 v16, v3

    .line 1061
    .line 1062
    const/high16 v3, 0x800000

    .line 1063
    .line 1064
    if-ne v12, v3, :cond_35

    .line 1065
    .line 1066
    const/4 v3, 0x1

    .line 1067
    goto :goto_23

    .line 1068
    :cond_35
    const/4 v3, 0x0

    .line 1069
    :goto_23
    or-int v3, v16, v3

    .line 1070
    .line 1071
    invoke-virtual {v4, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v16

    .line 1075
    or-int v3, v3, v16

    .line 1076
    .line 1077
    invoke-virtual {v4, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v16

    .line 1081
    or-int v3, v3, v16

    .line 1082
    .line 1083
    invoke-virtual {v4, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1084
    .line 1085
    .line 1086
    move-result v16

    .line 1087
    or-int v3, v3, v16

    .line 1088
    .line 1089
    move/from16 v16, v3

    .line 1090
    .line 1091
    move-object/from16 v3, v28

    .line 1092
    .line 1093
    invoke-virtual {v4, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1094
    .line 1095
    .line 1096
    move-result v17

    .line 1097
    or-int v16, v16, v17

    .line 1098
    .line 1099
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v3

    .line 1103
    if-nez v16, :cond_37

    .line 1104
    .line 1105
    if-ne v3, v8, :cond_36

    .line 1106
    .line 1107
    goto :goto_24

    .line 1108
    :cond_36
    move-object v13, v9

    .line 1109
    move-object v9, v6

    .line 1110
    move-object v6, v5

    .line 1111
    move-object/from16 v5, v28

    .line 1112
    .line 1113
    goto :goto_25

    .line 1114
    :cond_37
    :goto_24
    new-instance v16, La/ps90;

    .line 1115
    .line 1116
    const/16 v19, 0x0

    .line 1117
    .line 1118
    move/from16 v32, p7

    .line 1119
    .line 1120
    move-object/from16 v22, v6

    .line 1121
    .line 1122
    move/from16 v17, v7

    .line 1123
    .line 1124
    move-object/from16 v26, v10

    .line 1125
    .line 1126
    move-object/from16 v31, v11

    .line 1127
    .line 1128
    move-object/from16 v23, v13

    .line 1129
    .line 1130
    move-object/from16 v21, v14

    .line 1131
    .line 1132
    move-object/from16 v29, v24

    .line 1133
    .line 1134
    move-object/from16 v27, v28

    .line 1135
    .line 1136
    move-object/from16 v24, v20

    .line 1137
    .line 1138
    move-object/from16 v28, v25

    .line 1139
    .line 1140
    move-object/from16 v25, v5

    .line 1141
    .line 1142
    move-object/from16 v20, v9

    .line 1143
    .line 1144
    invoke-direct/range {v16 .. v32}, La/ps90;-><init>(FLa/j73;La/yje;La/vne;La/a8x;La/xcz;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/cgk0;La/l7m0;Z)V

    .line 1145
    .line 1146
    .line 1147
    move-object/from16 v3, v16

    .line 1148
    .line 1149
    move-object/from16 v13, v20

    .line 1150
    .line 1151
    move-object/from16 v9, v22

    .line 1152
    .line 1153
    move-object/from16 v20, v24

    .line 1154
    .line 1155
    move-object/from16 v6, v25

    .line 1156
    .line 1157
    move-object/from16 v5, v27

    .line 1158
    .line 1159
    move-object/from16 v25, v28

    .line 1160
    .line 1161
    move-object/from16 v24, v29

    .line 1162
    .line 1163
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1164
    .line 1165
    .line 1166
    :goto_25
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 1167
    .line 1168
    invoke-static {v2, v3, v4}, La/m0x0;->w([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 1169
    .line 1170
    .line 1171
    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v2

    .line 1175
    invoke-static/range {p7 .. p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v3

    .line 1179
    invoke-virtual {v4, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1180
    .line 1181
    .line 1182
    move-result v16

    .line 1183
    move-object/from16 v21, v9

    .line 1184
    .line 1185
    move-object/from16 v9, v33

    .line 1186
    .line 1187
    invoke-virtual {v4, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v17

    .line 1191
    or-int v16, v16, v17

    .line 1192
    .line 1193
    invoke-virtual {v4, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    move-result v17

    .line 1197
    or-int v16, v16, v17

    .line 1198
    .line 1199
    invoke-virtual {v4, v7}, La/fet;->d(F)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v17

    .line 1203
    or-int v16, v16, v17

    .line 1204
    .line 1205
    invoke-virtual {v4, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v17

    .line 1209
    or-int v16, v16, v17

    .line 1210
    .line 1211
    move-object/from16 v26, v6

    .line 1212
    .line 1213
    const/high16 v6, 0x800000

    .line 1214
    .line 1215
    if-ne v12, v6, :cond_38

    .line 1216
    .line 1217
    const/4 v6, 0x1

    .line 1218
    goto :goto_26

    .line 1219
    :cond_38
    const/4 v6, 0x0

    .line 1220
    :goto_26
    or-int v6, v16, v6

    .line 1221
    .line 1222
    invoke-virtual {v4, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1223
    .line 1224
    .line 1225
    move-result v16

    .line 1226
    or-int v6, v6, v16

    .line 1227
    .line 1228
    invoke-virtual {v4, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1229
    .line 1230
    .line 1231
    move-result v16

    .line 1232
    or-int v6, v6, v16

    .line 1233
    .line 1234
    invoke-virtual {v4, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1235
    .line 1236
    .line 1237
    move-result v16

    .line 1238
    or-int v6, v6, v16

    .line 1239
    .line 1240
    invoke-virtual {v4, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1241
    .line 1242
    .line 1243
    move-result v16

    .line 1244
    or-int v6, v6, v16

    .line 1245
    .line 1246
    move-object/from16 v28, v5

    .line 1247
    .line 1248
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v5

    .line 1252
    if-nez v6, :cond_3a

    .line 1253
    .line 1254
    if-ne v5, v8, :cond_39

    .line 1255
    .line 1256
    goto :goto_27

    .line 1257
    :cond_39
    move/from16 v33, v0

    .line 1258
    .line 1259
    move-object v0, v13

    .line 1260
    move-object/from16 v9, v26

    .line 1261
    .line 1262
    move-object/from16 v6, v28

    .line 1263
    .line 1264
    move-object v13, v11

    .line 1265
    move-object/from16 v11, v21

    .line 1266
    .line 1267
    goto :goto_28

    .line 1268
    :cond_3a
    :goto_27
    new-instance v16, La/rs90;

    .line 1269
    .line 1270
    const/16 v33, 0x0

    .line 1271
    .line 1272
    move/from16 v27, v7

    .line 1273
    .line 1274
    move-object/from16 v23, v10

    .line 1275
    .line 1276
    move-object/from16 v29, v14

    .line 1277
    .line 1278
    move-object/from16 v17, v21

    .line 1279
    .line 1280
    move-object/from16 v31, v25

    .line 1281
    .line 1282
    move-object/from16 v22, v26

    .line 1283
    .line 1284
    move-object/from16 v26, v28

    .line 1285
    .line 1286
    move-object/from16 v32, v30

    .line 1287
    .line 1288
    move-object/from16 v19, v34

    .line 1289
    .line 1290
    move-object/from16 v30, v11

    .line 1291
    .line 1292
    move-object/from16 v28, v13

    .line 1293
    .line 1294
    move-object/from16 v25, v18

    .line 1295
    .line 1296
    move-object/from16 v21, v20

    .line 1297
    .line 1298
    move-object/from16 v20, v24

    .line 1299
    .line 1300
    move/from16 v24, p7

    .line 1301
    .line 1302
    move-object/from16 v18, v9

    .line 1303
    .line 1304
    invoke-direct/range {v16 .. v33}, La/rs90;-><init>(La/xcz;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;ZLa/j73;La/pz40;FLa/vne;La/a8x;La/l7m0;La/pz40;La/cgk0;La/yje;)V

    .line 1305
    .line 1306
    .line 1307
    move/from16 v33, v0

    .line 1308
    .line 1309
    move-object/from16 v5, v16

    .line 1310
    .line 1311
    move-object/from16 v11, v17

    .line 1312
    .line 1313
    move-object/from16 v24, v20

    .line 1314
    .line 1315
    move-object/from16 v20, v21

    .line 1316
    .line 1317
    move-object/from16 v9, v22

    .line 1318
    .line 1319
    move-object/from16 v18, v25

    .line 1320
    .line 1321
    move-object/from16 v6, v26

    .line 1322
    .line 1323
    move-object/from16 v0, v28

    .line 1324
    .line 1325
    move-object/from16 v13, v30

    .line 1326
    .line 1327
    move-object/from16 v25, v31

    .line 1328
    .line 1329
    move-object/from16 v30, v32

    .line 1330
    .line 1331
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1332
    .line 1333
    .line 1334
    :goto_28
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 1335
    .line 1336
    invoke-static {v11, v2, v3, v5, v4}, La/m0x0;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 1337
    .line 1338
    .line 1339
    invoke-static/range {v20 .. v20}, La/ys90;->c(La/pz40;)Z

    .line 1340
    .line 1341
    .line 1342
    move-result v2

    .line 1343
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    invoke-virtual {v4, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1348
    .line 1349
    .line 1350
    move-result v3

    .line 1351
    invoke-virtual {v4, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v5

    .line 1355
    or-int/2addr v3, v5

    .line 1356
    invoke-virtual {v4, v7}, La/fet;->d(F)Z

    .line 1357
    .line 1358
    .line 1359
    move-result v5

    .line 1360
    or-int/2addr v3, v5

    .line 1361
    invoke-virtual {v4, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1362
    .line 1363
    .line 1364
    move-result v5

    .line 1365
    or-int/2addr v3, v5

    .line 1366
    const/high16 v5, 0x800000

    .line 1367
    .line 1368
    if-ne v12, v5, :cond_3b

    .line 1369
    .line 1370
    const/4 v5, 0x1

    .line 1371
    goto :goto_29

    .line 1372
    :cond_3b
    const/4 v5, 0x0

    .line 1373
    :goto_29
    or-int/2addr v3, v5

    .line 1374
    invoke-virtual {v4, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1375
    .line 1376
    .line 1377
    move-result v5

    .line 1378
    or-int/2addr v3, v5

    .line 1379
    invoke-virtual {v4, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1380
    .line 1381
    .line 1382
    move-result v5

    .line 1383
    or-int/2addr v3, v5

    .line 1384
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1385
    .line 1386
    .line 1387
    move-result v5

    .line 1388
    or-int/2addr v3, v5

    .line 1389
    invoke-virtual {v4, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1390
    .line 1391
    .line 1392
    move-result v5

    .line 1393
    or-int/2addr v3, v5

    .line 1394
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v5

    .line 1398
    if-nez v3, :cond_3d

    .line 1399
    .line 1400
    if-ne v5, v8, :cond_3c

    .line 1401
    .line 1402
    goto :goto_2a

    .line 1403
    :cond_3c
    move-object v9, v0

    .line 1404
    move-object v6, v11

    .line 1405
    move-object v11, v13

    .line 1406
    goto :goto_2b

    .line 1407
    :cond_3d
    :goto_2a
    new-instance v16, La/ss90;

    .line 1408
    .line 1409
    const/16 v19, 0x0

    .line 1410
    .line 1411
    move/from16 v32, p7

    .line 1412
    .line 1413
    move-object/from16 v28, v6

    .line 1414
    .line 1415
    move/from16 v17, v7

    .line 1416
    .line 1417
    move-object/from16 v26, v9

    .line 1418
    .line 1419
    move-object/from16 v27, v10

    .line 1420
    .line 1421
    move-object/from16 v22, v11

    .line 1422
    .line 1423
    move-object/from16 v31, v13

    .line 1424
    .line 1425
    move-object/from16 v21, v14

    .line 1426
    .line 1427
    move-object/from16 v23, v20

    .line 1428
    .line 1429
    move-object/from16 v29, v25

    .line 1430
    .line 1431
    move-object/from16 v25, v34

    .line 1432
    .line 1433
    move-object/from16 v20, v0

    .line 1434
    .line 1435
    invoke-direct/range {v16 .. v32}, La/ss90;-><init>(FLa/j73;La/yje;La/vne;La/a8x;La/xcz;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/pz40;La/cgk0;La/l7m0;Z)V

    .line 1436
    .line 1437
    .line 1438
    move-object/from16 v5, v16

    .line 1439
    .line 1440
    move-object/from16 v9, v20

    .line 1441
    .line 1442
    move-object/from16 v6, v22

    .line 1443
    .line 1444
    move-object/from16 v20, v23

    .line 1445
    .line 1446
    move-object/from16 v25, v29

    .line 1447
    .line 1448
    move-object/from16 v11, v31

    .line 1449
    .line 1450
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1451
    .line 1452
    .line 1453
    :goto_2b
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 1454
    .line 1455
    invoke-static {v4, v2, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1456
    .line 1457
    .line 1458
    invoke-virtual {v4, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1459
    .line 1460
    .line 1461
    move-result v0

    .line 1462
    invoke-virtual {v4, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1463
    .line 1464
    .line 1465
    move-result v2

    .line 1466
    or-int/2addr v0, v2

    .line 1467
    invoke-virtual {v4, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1468
    .line 1469
    .line 1470
    move-result v2

    .line 1471
    or-int/2addr v0, v2

    .line 1472
    invoke-virtual {v4, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1473
    .line 1474
    .line 1475
    move-result v2

    .line 1476
    or-int/2addr v0, v2

    .line 1477
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v2

    .line 1481
    if-nez v0, :cond_3e

    .line 1482
    .line 1483
    if-ne v2, v8, :cond_3f

    .line 1484
    .line 1485
    :cond_3e
    new-instance v34, La/s6d;

    .line 1486
    .line 1487
    const/16 v42, 0x0

    .line 1488
    .line 1489
    const/16 v43, 0x7

    .line 1490
    .line 1491
    move-object/from16 v40, v1

    .line 1492
    .line 1493
    move-object/from16 v35, v6

    .line 1494
    .line 1495
    move-object/from16 v38, v10

    .line 1496
    .line 1497
    move-object/from16 v36, v11

    .line 1498
    .line 1499
    move-object/from16 v37, v20

    .line 1500
    .line 1501
    move-object/from16 v39, v30

    .line 1502
    .line 1503
    invoke-direct/range {v34 .. v43}, La/s6d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1504
    .line 1505
    .line 1506
    move-object/from16 v2, v34

    .line 1507
    .line 1508
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1509
    .line 1510
    .line 1511
    :cond_3f
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 1512
    .line 1513
    invoke-static {v6, v14, v2, v4}, La/m0x0;->v(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 1514
    .line 1515
    .line 1516
    move-object/from16 v1, p0

    .line 1517
    .line 1518
    invoke-static {v1, v15}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v0

    .line 1522
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1523
    .line 1524
    invoke-static {v0, v15}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    sget-object v2, La/gqw0;->a:La/zx7;

    .line 1529
    .line 1530
    const/4 v3, 0x0

    .line 1531
    invoke-static {v2, v3}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v2

    .line 1535
    iget-wide v12, v4, La/fet;->T:J

    .line 1536
    .line 1537
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 1538
    .line 1539
    .line 1540
    move-result v5

    .line 1541
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v10

    .line 1545
    invoke-static {v4, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0

    .line 1549
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 1550
    .line 1551
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual {v4}, La/fet;->i0()V

    .line 1555
    .line 1556
    .line 1557
    iget-boolean v12, v4, La/fet;->S:Z

    .line 1558
    .line 1559
    if-eqz v12, :cond_40

    .line 1560
    .line 1561
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 1562
    .line 1563
    invoke-virtual {v4, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1564
    .line 1565
    .line 1566
    goto :goto_2c

    .line 1567
    :cond_40
    invoke-virtual {v4}, La/fet;->r0()V

    .line 1568
    .line 1569
    .line 1570
    :goto_2c
    sget-object v12, La/gqw0;->x:La/shd;

    .line 1571
    .line 1572
    invoke-static {v4, v2, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1573
    .line 1574
    .line 1575
    sget-object v2, La/gqw0;->w:La/shd;

    .line 1576
    .line 1577
    invoke-static {v4, v10, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1578
    .line 1579
    .line 1580
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v2

    .line 1584
    sget-object v5, La/gqw0;->y:La/shd;

    .line 1585
    .line 1586
    invoke-static {v4, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1587
    .line 1588
    .line 1589
    invoke-static {v4}, La/jpm0;->n(La/fet;)V

    .line 1590
    .line 1591
    .line 1592
    sget-object v2, La/gqw0;->v:La/shd;

    .line 1593
    .line 1594
    invoke-static {v4, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1595
    .line 1596
    .line 1597
    const-string v0, "PICKER_WHEEL_LAZY_COLUMN"

    .line 1598
    .line 1599
    sget-object v2, La/jm40;->b:La/jm40;

    .line 1600
    .line 1601
    invoke-static {v2, v0}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v0

    .line 1605
    move/from16 v10, v33

    .line 1606
    .line 1607
    const/4 v5, 0x1

    .line 1608
    const/4 v12, 0x0

    .line 1609
    invoke-static {v12, v10, v5}, La/s5x0;->t(FFI)La/lh80;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v16

    .line 1613
    invoke-virtual {v4, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1614
    .line 1615
    .line 1616
    move-result v10

    .line 1617
    move/from16 v13, v50

    .line 1618
    .line 1619
    invoke-virtual {v4, v13}, La/fet;->e(I)Z

    .line 1620
    .line 1621
    .line 1622
    move-result v17

    .line 1623
    or-int v10, v10, v17

    .line 1624
    .line 1625
    and-int/lit8 v3, v44, 0x70

    .line 1626
    .line 1627
    const/16 v5, 0x20

    .line 1628
    .line 1629
    if-eq v3, v5, :cond_41

    .line 1630
    .line 1631
    const/4 v3, 0x0

    .line 1632
    goto :goto_2d

    .line 1633
    :cond_41
    const/4 v3, 0x1

    .line 1634
    :goto_2d
    or-int/2addr v3, v10

    .line 1635
    invoke-virtual {v4, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1636
    .line 1637
    .line 1638
    move-result v5

    .line 1639
    or-int/2addr v3, v5

    .line 1640
    invoke-virtual {v4, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1641
    .line 1642
    .line 1643
    move-result v5

    .line 1644
    or-int/2addr v3, v5

    .line 1645
    invoke-virtual {v4, v7}, La/fet;->d(F)Z

    .line 1646
    .line 1647
    .line 1648
    move-result v5

    .line 1649
    or-int/2addr v3, v5

    .line 1650
    invoke-virtual {v4, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1651
    .line 1652
    .line 1653
    move-result v5

    .line 1654
    or-int/2addr v3, v5

    .line 1655
    move/from16 v10, v49

    .line 1656
    .line 1657
    invoke-virtual {v4, v10}, La/fet;->d(F)Z

    .line 1658
    .line 1659
    .line 1660
    move-result v5

    .line 1661
    or-int/2addr v3, v5

    .line 1662
    move/from16 v5, v48

    .line 1663
    .line 1664
    invoke-virtual {v4, v5}, La/fet;->d(F)Z

    .line 1665
    .line 1666
    .line 1667
    move-result v17

    .line 1668
    or-int v3, v3, v17

    .line 1669
    .line 1670
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v12

    .line 1674
    if-nez v3, :cond_42

    .line 1675
    .line 1676
    if-ne v12, v8, :cond_43

    .line 1677
    .line 1678
    :cond_42
    move-object v3, v2

    .line 1679
    goto :goto_2e

    .line 1680
    :cond_43
    move-object/from16 v17, v0

    .line 1681
    .line 1682
    move-object v0, v2

    .line 1683
    move-object v15, v4

    .line 1684
    goto :goto_2f

    .line 1685
    :goto_2e
    new-instance v2, La/gs90;

    .line 1686
    .line 1687
    move-object/from16 v17, v0

    .line 1688
    .line 1689
    move-object v0, v3

    .line 1690
    move-object v15, v4

    .line 1691
    move-object v8, v11

    .line 1692
    move v4, v13

    .line 1693
    move-object v3, v14

    .line 1694
    move-object/from16 v13, v20

    .line 1695
    .line 1696
    move-object/from16 v14, v25

    .line 1697
    .line 1698
    move-object/from16 v12, v45

    .line 1699
    .line 1700
    move v11, v5

    .line 1701
    move-object/from16 v5, p1

    .line 1702
    .line 1703
    invoke-direct/range {v2 .. v14}, La/gs90;-><init>(La/a8x;ILandroidx/compose/runtime/snapshots/SnapshotStateList;La/xcz;FLa/l7m0;La/vne;FFLa/nul0;La/pz40;La/pz40;)V

    .line 1704
    .line 1705
    .line 1706
    invoke-virtual {v15, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1707
    .line 1708
    .line 1709
    move-object v12, v2

    .line 1710
    :goto_2f
    move-object v10, v12

    .line 1711
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 1712
    .line 1713
    const/4 v12, 0x6

    .line 1714
    const/16 v13, 0x1b8

    .line 1715
    .line 1716
    const/4 v5, 0x0

    .line 1717
    move-object/from16 v21, v6

    .line 1718
    .line 1719
    const/4 v6, 0x0

    .line 1720
    const/4 v8, 0x0

    .line 1721
    const/4 v9, 0x0

    .line 1722
    move-object v11, v15

    .line 1723
    move-object/from16 v4, v16

    .line 1724
    .line 1725
    move-object/from16 v2, v17

    .line 1726
    .line 1727
    move-object/from16 v3, v21

    .line 1728
    .line 1729
    move-object/from16 v7, v47

    .line 1730
    .line 1731
    invoke-static/range {v2 .. v13}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1732
    .line 1733
    .line 1734
    move-object v4, v11

    .line 1735
    sget-object v2, La/gqw0;->b:La/zx7;

    .line 1736
    .line 1737
    sget-object v3, La/jr8;->a:La/jr8;

    .line 1738
    .line 1739
    invoke-virtual {v3, v0, v2}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v2

    .line 1743
    sget v5, La/fs90;->b:F

    .line 1744
    .line 1745
    invoke-static {v2, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v2

    .line 1749
    const/high16 v5, 0x3f800000    # 1.0f

    .line 1750
    .line 1751
    invoke-static {v2, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v2

    .line 1755
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 1756
    .line 1757
    invoke-virtual {v4, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v6

    .line 1761
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1762
    .line 1763
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 1764
    .line 1765
    .line 1766
    move-result-wide v6

    .line 1767
    const v8, 0x3f6147ae    # 0.88f

    .line 1768
    .line 1769
    .line 1770
    invoke-static {v8, v6, v7}, La/y3d;->c(FJ)J

    .line 1771
    .line 1772
    .line 1773
    move-result-wide v6

    .line 1774
    new-instance v9, La/y3d;

    .line 1775
    .line 1776
    invoke-direct {v9, v6, v7}, La/y3d;-><init>(J)V

    .line 1777
    .line 1778
    .line 1779
    invoke-virtual {v4, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v6

    .line 1783
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1784
    .line 1785
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent0-0d7_KjU()J

    .line 1786
    .line 1787
    .line 1788
    move-result-wide v6

    .line 1789
    new-instance v10, La/y3d;

    .line 1790
    .line 1791
    invoke-direct {v10, v6, v7}, La/y3d;-><init>(J)V

    .line 1792
    .line 1793
    .line 1794
    filled-new-array {v9, v10}, [La/y3d;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v6

    .line 1798
    invoke-static {v6}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v6

    .line 1802
    const/16 v7, 0xe

    .line 1803
    .line 1804
    const/4 v12, 0x0

    .line 1805
    invoke-static {v6, v12, v12, v7}, La/yk5;->n(Ljava/util/List;FFI)La/e900;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v6

    .line 1809
    const/4 v9, 0x6

    .line 1810
    const/4 v10, 0x0

    .line 1811
    invoke-static {v2, v6, v10, v9}, La/i120;->P(La/mm40;La/t89;La/yjj0;I)La/mm40;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v2

    .line 1815
    const/4 v6, 0x0

    .line 1816
    invoke-static {v6, v4, v2}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 1817
    .line 1818
    .line 1819
    sget-object v2, La/gqw0;->h:La/zx7;

    .line 1820
    .line 1821
    invoke-virtual {v3, v0, v2}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v0

    .line 1825
    sget v2, La/fs90;->c:F

    .line 1826
    .line 1827
    invoke-static {v0, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1828
    .line 1829
    .line 1830
    move-result-object v0

    .line 1831
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1832
    .line 1833
    invoke-static {v0, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v0

    .line 1837
    invoke-virtual {v4, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v2

    .line 1841
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1842
    .line 1843
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent0-0d7_KjU()J

    .line 1844
    .line 1845
    .line 1846
    move-result-wide v2

    .line 1847
    new-instance v11, La/y3d;

    .line 1848
    .line 1849
    invoke-direct {v11, v2, v3}, La/y3d;-><init>(J)V

    .line 1850
    .line 1851
    .line 1852
    invoke-virtual {v4, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v2

    .line 1856
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1857
    .line 1858
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 1859
    .line 1860
    .line 1861
    move-result-wide v2

    .line 1862
    invoke-static {v8, v2, v3}, La/y3d;->c(FJ)J

    .line 1863
    .line 1864
    .line 1865
    move-result-wide v2

    .line 1866
    new-instance v5, La/y3d;

    .line 1867
    .line 1868
    invoke-direct {v5, v2, v3}, La/y3d;-><init>(J)V

    .line 1869
    .line 1870
    .line 1871
    filled-new-array {v11, v5}, [La/y3d;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v2

    .line 1875
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v2

    .line 1879
    const/4 v12, 0x0

    .line 1880
    invoke-static {v2, v12, v12, v7}, La/yk5;->n(Ljava/util/List;FFI)La/e900;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v2

    .line 1884
    invoke-static {v0, v2, v10, v9}, La/i120;->P(La/mm40;La/t89;La/yjj0;I)La/mm40;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v0

    .line 1888
    invoke-static {v6, v4, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 1889
    .line 1890
    .line 1891
    const/4 v5, 0x1

    .line 1892
    invoke-virtual {v4, v5}, La/fet;->r(Z)V

    .line 1893
    .line 1894
    .line 1895
    move-object/from16 v6, v46

    .line 1896
    .line 1897
    goto :goto_30

    .line 1898
    :cond_44
    invoke-virtual {v4}, La/fet;->X()V

    .line 1899
    .line 1900
    .line 1901
    move-object/from16 v6, p5

    .line 1902
    .line 1903
    :goto_30
    invoke-virtual {v4}, La/fet;->u()La/yfe0;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v12

    .line 1907
    if-eqz v12, :cond_45

    .line 1908
    .line 1909
    new-instance v0, La/hs90;

    .line 1910
    .line 1911
    move-object/from16 v2, p1

    .line 1912
    .line 1913
    move/from16 v3, p2

    .line 1914
    .line 1915
    move/from16 v4, p3

    .line 1916
    .line 1917
    move/from16 v5, p4

    .line 1918
    .line 1919
    move-object/from16 v7, p6

    .line 1920
    .line 1921
    move/from16 v8, p7

    .line 1922
    .line 1923
    move-object/from16 v9, p8

    .line 1924
    .line 1925
    move-object/from16 v10, p9

    .line 1926
    .line 1927
    move/from16 v11, p11

    .line 1928
    .line 1929
    invoke-direct/range {v0 .. v11}, La/hs90;-><init>(La/mm40;Landroidx/compose/runtime/snapshots/SnapshotStateList;ZFILa/b8x;La/okt0;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;I)V

    .line 1930
    .line 1931
    .line 1932
    iput-object v0, v12, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 1933
    .line 1934
    :cond_45
    return-void
.end method

.method public static final b(La/pz40;La/pz40;ZLa/j73;La/pz40;La/xcz;FLa/vne;La/pz40;La/a8x;La/l7m0;La/pz40;La/cgk0;)V
    .locals 12

    .line 1
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/a8x;

    .line 6
    .line 7
    invoke-static/range {p5 .. p6}, La/ys90;->e(La/xcz;F)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    iget v1, p0, La/a8x;->a:I

    .line 14
    .line 15
    rem-int v2, v0, v1

    .line 16
    .line 17
    if-ltz v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    add-int/2addr v2, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v2, v0

    .line 23
    :goto_0
    invoke-interface {p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/util/List;

    .line 28
    .line 29
    if-eqz p2, :cond_6

    .line 30
    .line 31
    invoke-static {v2, p1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, La/cav0;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    iget-boolean p2, p2, La/cav0;->c:Z

    .line 41
    .line 42
    if-ne p2, v1, :cond_2

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    const/4 v3, 0x0

    .line 50
    if-eqz p0, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move v1, v3

    .line 54
    :goto_1
    new-instance v4, La/gg4;

    .line 55
    .line 56
    const/16 v5, 0x8

    .line 57
    .line 58
    invoke-direct {v4, p1, v5}, La/gg4;-><init>(Ljava/util/List;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p2, v2, v1, v3, v4}, La/ys90;->g(IIZILkotlin/jvm/functions/Function1;)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    goto :goto_2

    .line 72
    :cond_4
    move p1, v2

    .line 73
    :goto_2
    if-eqz p0, :cond_5

    .line 74
    .line 75
    iget p2, p0, La/a8x;->a:I

    .line 76
    .line 77
    iget p0, p0, La/a8x;->c:I

    .line 78
    .line 79
    invoke-static {v0, p1, p2, p0}, La/ys90;->h(IIII)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    :cond_5
    move v10, p1

    .line 84
    if-eq v10, v0, :cond_6

    .line 85
    .line 86
    move-object v11, p3

    .line 87
    move-object/from16 v5, p5

    .line 88
    .line 89
    move/from16 v6, p6

    .line 90
    .line 91
    move-object/from16 v3, p7

    .line 92
    .line 93
    move-object/from16 v4, p8

    .line 94
    .line 95
    move-object/from16 v7, p9

    .line 96
    .line 97
    move-object/from16 v8, p10

    .line 98
    .line 99
    move-object/from16 v9, p11

    .line 100
    .line 101
    invoke-static/range {v3 .. v11}, La/ys90;->d(La/vne;La/pz40;La/xcz;FLa/a8x;La/l7m0;La/pz40;ILa/j73;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_6
    :goto_3
    invoke-virtual/range {p12 .. p12}, La/cgk0;->l()I

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eq v2, p0, :cond_7

    .line 110
    .line 111
    move-object/from16 p0, p12

    .line 112
    .line 113
    invoke-virtual {p0, v2}, La/cgk0;->m(I)V

    .line 114
    .line 115
    .line 116
    :cond_7
    invoke-interface/range {p4 .. p4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 121
    .line 122
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public static final c(La/pz40;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static final d(La/vne;La/pz40;La/xcz;FLa/a8x;La/l7m0;La/pz40;ILa/j73;)V
    .locals 7

    .line 1
    invoke-static {p1}, La/ys90;->c(La/pz40;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p2, p7, p3}, La/ys90;->f(La/xcz;IF)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/high16 v1, 0x3f000000    # 0.5f

    .line 17
    .line 18
    cmpg-float v0, v0, v1

    .line 19
    .line 20
    if-gtz v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    if-eqz p4, :cond_3

    .line 24
    .line 25
    iget p4, p4, La/a8x;->a:I

    .line 26
    .line 27
    rem-int v0, p7, p4

    .line 28
    .line 29
    if-ltz v0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    add-int/2addr v0, p4

    .line 33
    goto :goto_0

    .line 34
    :cond_3
    move v0, p7

    .line 35
    :goto_0
    invoke-interface {p5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p4

    .line 39
    check-cast p4, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    if-ne v0, p4, :cond_4

    .line 46
    .line 47
    :goto_1
    return-void

    .line 48
    :cond_4
    invoke-interface {p6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p4

    .line 52
    check-cast p4, La/bby;

    .line 53
    .line 54
    const/4 p5, 0x0

    .line 55
    if-eqz p4, :cond_5

    .line 56
    .line 57
    invoke-interface {p4, p5}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 58
    .line 59
    .line 60
    :cond_5
    new-instance v0, La/ws90;

    .line 61
    .line 62
    const/4 v6, 0x0

    .line 63
    move-object v2, p1

    .line 64
    move-object v1, p2

    .line 65
    move v4, p3

    .line 66
    move v3, p7

    .line 67
    move-object v5, p8

    .line 68
    invoke-direct/range {v0 .. v6}, La/ws90;-><init>(La/xcz;La/pz40;IFLa/j73;La/yje;)V

    .line 69
    .line 70
    .line 71
    const/4 p1, 0x3

    .line 72
    invoke-static {p0, p5, p5, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    new-instance p1, La/y9v;

    .line 77
    .line 78
    const/16 p2, 0x18

    .line 79
    .line 80
    invoke-direct {p1, v2, p2}, La/y9v;-><init>(La/pz40;B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 84
    .line 85
    .line 86
    invoke-interface {p6, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public static final e(La/xcz;F)I
    .locals 7

    .line 1
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, La/mcz;->o:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, La/mcz;->h()J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    const-wide v5, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr v3, v5

    .line 20
    long-to-int v1, v3

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget v1, v0, La/mcz;->m:I

    .line 25
    .line 26
    iget v3, v0, La/mcz;->n:I

    .line 27
    .line 28
    add-int/2addr v1, v3

    .line 29
    int-to-float v1, v1

    .line 30
    const/high16 v3, 0x40000000    # 2.0f

    .line 31
    .line 32
    div-float/2addr v1, v3

    .line 33
    invoke-virtual {p0}, La/xcz;->h()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    int-to-float v3, v3

    .line 38
    mul-float/2addr v3, p1

    .line 39
    invoke-virtual {p0}, La/xcz;->i()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    int-to-float p0, p0

    .line 44
    add-float/2addr v3, p0

    .line 45
    add-float/2addr v3, v1

    .line 46
    div-float/2addr v3, p1

    .line 47
    const/high16 p0, 0x3f000000    # 0.5f

    .line 48
    .line 49
    sub-float/2addr v3, p0

    .line 50
    invoke-static {v3}, La/si30;->b(F)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    iget p1, v0, La/mcz;->o:I

    .line 55
    .line 56
    add-int/lit8 p1, p1, -0x1

    .line 57
    .line 58
    invoke-static {p0, v2, p1}, La/l1e0;->d(III)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0

    .line 63
    :cond_1
    :goto_0
    return v2
.end method

.method public static final f(La/xcz;IF)F
    .locals 2

    .line 1
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, La/mcz;->m:I

    .line 6
    .line 7
    iget v0, v0, La/mcz;->n:I

    .line 8
    .line 9
    add-int/2addr v1, v0

    .line 10
    int-to-float v0, v1

    .line 11
    const/high16 v1, 0x40000000    # 2.0f

    .line 12
    .line 13
    div-float/2addr v0, v1

    .line 14
    invoke-virtual {p0}, La/xcz;->h()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    int-to-float v1, v1

    .line 19
    mul-float/2addr v1, p2

    .line 20
    invoke-virtual {p0}, La/xcz;->i()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    int-to-float p0, p0

    .line 25
    add-float/2addr v1, p0

    .line 26
    add-float/2addr v1, v0

    .line 27
    int-to-float p0, p1

    .line 28
    const/high16 p1, 0x3f000000    # 0.5f

    .line 29
    .line 30
    add-float/2addr p0, p1

    .line 31
    mul-float/2addr p0, p2

    .line 32
    sub-float/2addr p0, v1

    .line 33
    return p0
.end method

.method public static final g(IIZILkotlin/jvm/functions/Function1;)Ljava/lang/Integer;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gtz p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_6

    .line 5
    .line 6
    :cond_0
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-static {p1, p0}, Ljava/lang/Math;->floorMod(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-ltz p1, :cond_2

    .line 22
    .line 23
    if-ge p1, p0, :cond_2

    .line 24
    .line 25
    move-object p1, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_2
    move-object p1, v0

    .line 28
    :goto_0
    const/4 v1, -0x1

    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    if-gez p3, :cond_3

    .line 33
    .line 34
    new-array p3, v2, [I

    .line 35
    .line 36
    aput v1, p3, v3

    .line 37
    .line 38
    aput v4, p3, v4

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    if-lez p3, :cond_4

    .line 42
    .line 43
    new-array p3, v2, [I

    .line 44
    .line 45
    aput v4, p3, v3

    .line 46
    .line 47
    aput v1, p3, v4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    new-array p3, v2, [I

    .line 51
    .line 52
    aput v1, p3, v3

    .line 53
    .line 54
    aput v4, p3, v4

    .line 55
    .line 56
    :goto_1
    if-nez p1, :cond_5

    .line 57
    .line 58
    goto :goto_6

    .line 59
    :cond_5
    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p2, :cond_7

    .line 77
    .line 78
    add-int/lit8 v1, p0, -0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_7
    add-int/lit8 v1, p0, -0x1

    .line 82
    .line 83
    sub-int/2addr v1, p1

    .line 84
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    :goto_2
    if-gt v4, v1, :cond_d

    .line 89
    .line 90
    move-object v2, v0

    .line 91
    :goto_3
    array-length v5, p3

    .line 92
    move v6, v3

    .line 93
    :goto_4
    if-ge v6, v5, :cond_b

    .line 94
    .line 95
    aget v7, p3, v6

    .line 96
    .line 97
    mul-int/2addr v7, v4

    .line 98
    add-int/2addr v7, p1

    .line 99
    if-eqz p2, :cond_8

    .line 100
    .line 101
    invoke-static {v7, p0}, Ljava/lang/Math;->floorMod(II)I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    goto :goto_5

    .line 110
    :cond_8
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    if-ltz v7, :cond_9

    .line 115
    .line 116
    if-ge v7, p0, :cond_9

    .line 117
    .line 118
    move-object v7, v8

    .line 119
    goto :goto_5

    .line 120
    :cond_9
    move-object v7, v0

    .line 121
    :goto_5
    if-nez v2, :cond_a

    .line 122
    .line 123
    if-eqz v7, :cond_a

    .line 124
    .line 125
    invoke-interface {p4, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    check-cast v8, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    if-eqz v8, :cond_a

    .line 136
    .line 137
    move-object v2, v7

    .line 138
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_b
    if-eq v4, v1, :cond_c

    .line 142
    .line 143
    add-int/lit8 v4, v4, 0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_c
    return-object v2

    .line 147
    :cond_d
    :goto_6
    return-object v0
.end method

.method public static final h(IIII)I
    .locals 3

    .line 1
    rem-int v0, p0, p2

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    add-int/2addr v0, p2

    .line 7
    :goto_0
    sub-int/2addr p1, v0

    .line 8
    rem-int/2addr p1, p2

    .line 9
    add-int/2addr p1, p2

    .line 10
    rem-int/2addr p1, p2

    .line 11
    sub-int v0, p1, p2

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ge v1, v2, :cond_1

    .line 22
    .line 23
    move p1, v0

    .line 24
    :cond_1
    add-int/2addr p0, p1

    .line 25
    if-gez p0, :cond_2

    .line 26
    .line 27
    neg-int p1, p0

    .line 28
    div-int/2addr p1, p2

    .line 29
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    mul-int/2addr p1, p2

    .line 32
    add-int/2addr p0, p1

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    if-lt p0, p3, :cond_3

    .line 35
    .line 36
    sub-int p1, p0, p3

    .line 37
    .line 38
    div-int/2addr p1, p2

    .line 39
    add-int/lit8 p1, p1, 0x1

    .line 40
    .line 41
    mul-int/2addr p1, p2

    .line 42
    sub-int/2addr p0, p1

    .line 43
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 44
    add-int/lit8 p3, p3, -0x1

    .line 45
    .line 46
    invoke-static {p0, p1, p3}, La/l1e0;->d(III)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0
.end method
