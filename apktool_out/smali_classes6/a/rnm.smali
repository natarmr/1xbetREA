.class public final synthetic La/rnm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/unm;

.field public final synthetic b:F

.field public final synthetic c:J

.field public final synthetic d:La/e900;


# direct methods
.method public synthetic constructor <init>(La/unm;FJLa/e900;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rnm;->a:La/unm;

    iput p2, p0, La/rnm;->b:F

    iput-wide p3, p0, La/rnm;->c:J

    iput-object p5, p0, La/rnm;->d:La/e900;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/fhl;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, La/rnm;->a:La/unm;

    .line 11
    .line 12
    iget v3, v2, La/unm;->e:F

    .line 13
    .line 14
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-interface {v1}, La/fhl;->d()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    const/16 v10, 0x20

    .line 23
    .line 24
    shr-long/2addr v4, v10

    .line 25
    long-to-int v4, v4

    .line 26
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/high16 v11, 0x40000000    # 2.0f

    .line 31
    .line 32
    div-float/2addr v4, v11

    .line 33
    sget v5, La/snm;->a:F

    .line 34
    .line 35
    invoke-interface {v1, v5}, La/w6k;->w0(F)F

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    sub-float/2addr v4, v5

    .line 40
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    .line 41
    .line 42
    .line 43
    move-result v13

    .line 44
    invoke-interface {v1}, La/fhl;->d()J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    shr-long/2addr v3, v10

    .line 49
    long-to-int v3, v3

    .line 50
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    div-float/2addr v3, v11

    .line 55
    sub-float v4, v3, v13

    .line 56
    .line 57
    div-float v5, v13, v11

    .line 58
    .line 59
    move v6, v4

    .line 60
    sub-float v4, v3, v5

    .line 61
    .line 62
    const v7, 0x40c90fdb

    .line 63
    .line 64
    .line 65
    mul-float v8, v3, v7

    .line 66
    .line 67
    mul-float/2addr v7, v4

    .line 68
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    int-to-long v14, v9

    .line 73
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    move/from16 p1, v10

    .line 78
    .line 79
    move/from16 v19, v11

    .line 80
    .line 81
    int-to-long v10, v9

    .line 82
    shl-long v14, v14, p1

    .line 83
    .line 84
    const-wide v20, 0xffffffffL

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long v9, v10, v20

    .line 90
    .line 91
    or-long v10, v14, v9

    .line 92
    .line 93
    iget v9, v2, La/unm;->f:F

    .line 94
    .line 95
    invoke-interface {v1, v9}, La/w6k;->w0(F)F

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    div-float v12, v6, v19

    .line 100
    .line 101
    invoke-static {v5, v12}, Ljava/lang/Math;->min(FF)F

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    invoke-static {v9, v5}, Ljava/lang/Math;->min(FF)F

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    div-float v8, v5, v8

    .line 110
    .line 111
    const/high16 v22, 0x43b40000    # 360.0f

    .line 112
    .line 113
    mul-float v23, v8, v22

    .line 114
    .line 115
    div-float v7, v13, v7

    .line 116
    .line 117
    mul-float v7, v7, v22

    .line 118
    .line 119
    mul-float v24, v23, v19

    .line 120
    .line 121
    sub-float v8, v7, v24

    .line 122
    .line 123
    iget v9, v0, La/rnm;->b:F

    .line 124
    .line 125
    const/4 v12, 0x0

    .line 126
    cmpg-float v14, v9, v12

    .line 127
    .line 128
    const/high16 v25, 0x3f800000    # 1.0f

    .line 129
    .line 130
    if-gtz v14, :cond_0

    .line 131
    .line 132
    move/from16 v26, v12

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_0
    iget v14, v2, La/unm;->h:I

    .line 136
    .line 137
    int-to-float v14, v14

    .line 138
    cmpl-float v15, v9, v14

    .line 139
    .line 140
    if-ltz v15, :cond_1

    .line 141
    .line 142
    move/from16 v26, v25

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_1
    div-float/2addr v9, v14

    .line 146
    mul-float v9, v9, v22

    .line 147
    .line 148
    sub-float v7, v22, v7

    .line 149
    .line 150
    invoke-static {v9, v8, v7}, La/l1e0;->c(FFF)F

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    div-float v7, v7, v22

    .line 155
    .line 156
    move/from16 v26, v7

    .line 157
    .line 158
    :goto_0
    iget-boolean v2, v2, La/unm;->i:Z

    .line 159
    .line 160
    if-eqz v2, :cond_2

    .line 161
    .line 162
    move v2, v12

    .line 163
    new-instance v12, La/vtm0;

    .line 164
    .line 165
    const/16 v17, 0x0

    .line 166
    .line 167
    const/16 v18, 0x1e

    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const/4 v15, 0x0

    .line 171
    const/16 v16, 0x0

    .line 172
    .line 173
    invoke-direct/range {v12 .. v18}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 174
    .line 175
    .line 176
    const/16 v9, 0x6c

    .line 177
    .line 178
    move v14, v2

    .line 179
    move v7, v3

    .line 180
    iget-wide v2, v0, La/rnm;->c:J

    .line 181
    .line 182
    move/from16 v16, v5

    .line 183
    .line 184
    move v15, v6

    .line 185
    const-wide/16 v5, 0x0

    .line 186
    .line 187
    move/from16 v17, v7

    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    move-object/from16 v27, v12

    .line 191
    .line 192
    move v12, v8

    .line 193
    move-object/from16 v8, v27

    .line 194
    .line 195
    invoke-static/range {v1 .. v9}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 196
    .line 197
    .line 198
    :goto_1
    move v2, v4

    .line 199
    goto :goto_2

    .line 200
    :cond_2
    move/from16 v17, v3

    .line 201
    .line 202
    move/from16 v16, v5

    .line 203
    .line 204
    move v15, v6

    .line 205
    move v14, v12

    .line 206
    move v12, v8

    .line 207
    goto :goto_1

    .line 208
    :goto_2
    cmpl-float v3, v26, v25

    .line 209
    .line 210
    iget-object v0, v0, La/rnm;->d:La/e900;

    .line 211
    .line 212
    if-ltz v3, :cond_3

    .line 213
    .line 214
    new-instance v5, La/vtm0;

    .line 215
    .line 216
    move/from16 v7, v17

    .line 217
    .line 218
    const/16 v17, 0x0

    .line 219
    .line 220
    const/16 v18, 0x1e

    .line 221
    .line 222
    move v3, v14

    .line 223
    const/4 v14, 0x0

    .line 224
    move v6, v15

    .line 225
    const/4 v15, 0x0

    .line 226
    move/from16 v4, v16

    .line 227
    .line 228
    const/16 v16, 0x0

    .line 229
    .line 230
    move v9, v4

    .line 231
    move v8, v6

    .line 232
    move v4, v3

    .line 233
    move v3, v12

    .line 234
    move-object v12, v5

    .line 235
    invoke-direct/range {v12 .. v18}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 236
    .line 237
    .line 238
    const/16 v6, 0x6c

    .line 239
    .line 240
    move v12, v3

    .line 241
    move v14, v4

    .line 242
    const-wide/16 v3, 0x0

    .line 243
    .line 244
    move-object/from16 v27, v1

    .line 245
    .line 246
    move-object v1, v0

    .line 247
    move-object/from16 v0, v27

    .line 248
    .line 249
    invoke-static/range {v0 .. v6}, La/fhl;->O(La/fhl;La/ijj0;FJLa/vtm0;I)V

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_3
    move-object v7, v1

    .line 254
    move-object v1, v0

    .line 255
    move-object v0, v7

    .line 256
    move v8, v15

    .line 257
    move/from16 v9, v16

    .line 258
    .line 259
    move/from16 v7, v17

    .line 260
    .line 261
    :goto_3
    cmpl-float v2, v26, v14

    .line 262
    .line 263
    if-lez v2, :cond_b

    .line 264
    .line 265
    cmpg-float v2, v26, v25

    .line 266
    .line 267
    if-gez v2, :cond_b

    .line 268
    .line 269
    const/high16 v2, -0x3d4c0000    # -90.0f

    .line 270
    .line 271
    add-float v3, v23, v2

    .line 272
    .line 273
    mul-float v26, v26, v22

    .line 274
    .line 275
    sub-float v4, v26, v24

    .line 276
    .line 277
    invoke-static {v4, v12}, Ljava/lang/Math;->max(FF)F

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    float-to-double v5, v7

    .line 282
    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    .line 283
    .line 284
    invoke-static {v5, v6, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 285
    .line 286
    .line 287
    move-result-wide v5

    .line 288
    double-to-float v5, v5

    .line 289
    move v12, v3

    .line 290
    float-to-double v2, v9

    .line 291
    invoke-static {v2, v3, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 292
    .line 293
    .line 294
    move-result-wide v2

    .line 295
    double-to-float v2, v2

    .line 296
    sub-float/2addr v5, v2

    .line 297
    float-to-double v2, v5

    .line 298
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 299
    .line 300
    .line 301
    move-result-wide v2

    .line 302
    double-to-float v2, v2

    .line 303
    sub-float v3, v7, v2

    .line 304
    .line 305
    mul-float v5, v9, v8

    .line 306
    .line 307
    add-float v2, v9, v8

    .line 308
    .line 309
    div-float/2addr v5, v2

    .line 310
    move/from16 v17, v7

    .line 311
    .line 312
    float-to-double v6, v8

    .line 313
    invoke-static {v6, v7, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 314
    .line 315
    .line 316
    move-result-wide v6

    .line 317
    double-to-float v6, v6

    .line 318
    move v7, v3

    .line 319
    float-to-double v2, v5

    .line 320
    invoke-static {v2, v3, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 321
    .line 322
    .line 323
    move-result-wide v2

    .line 324
    double-to-float v2, v2

    .line 325
    sub-float/2addr v6, v2

    .line 326
    float-to-double v2, v6

    .line 327
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 328
    .line 329
    .line 330
    move-result-wide v2

    .line 331
    double-to-float v2, v2

    .line 332
    sub-float v2, v8, v2

    .line 333
    .line 334
    div-float/2addr v5, v8

    .line 335
    float-to-double v5, v5

    .line 336
    invoke-static {v5, v6}, Ljava/lang/Math;->asin(D)D

    .line 337
    .line 338
    .line 339
    move-result-wide v5

    .line 340
    double-to-float v3, v5

    .line 341
    const/high16 v5, 0x43340000    # 180.0f

    .line 342
    .line 343
    mul-float/2addr v3, v5

    .line 344
    const v6, 0x40490fdb    # (float)Math.PI

    .line 345
    .line 346
    .line 347
    div-float/2addr v3, v6

    .line 348
    invoke-static {}, La/z03;->a()La/w03;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    shr-long v14, v10, p1

    .line 353
    .line 354
    long-to-int v14, v14

    .line 355
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 356
    .line 357
    .line 358
    move-result v15

    .line 359
    sub-float v15, v15, v17

    .line 360
    .line 361
    and-long v10, v10, v20

    .line 362
    .line 363
    long-to-int v10, v10

    .line 364
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 365
    .line 366
    .line 367
    move-result v11

    .line 368
    sub-float v11, v11, v17

    .line 369
    .line 370
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 371
    .line 372
    .line 373
    move-result v18

    .line 374
    add-float v5, v18, v17

    .line 375
    .line 376
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 377
    .line 378
    .line 379
    move-result v18

    .line 380
    move-object/from16 v20, v0

    .line 381
    .line 382
    add-float v0, v18, v17

    .line 383
    .line 384
    move-object/from16 v17, v1

    .line 385
    .line 386
    iget-object v1, v6, La/w03;->a:Landroid/graphics/Path;

    .line 387
    .line 388
    move/from16 v18, v2

    .line 389
    .line 390
    iget-object v2, v6, La/w03;->b:Landroid/graphics/RectF;

    .line 391
    .line 392
    if-nez v2, :cond_4

    .line 393
    .line 394
    new-instance v2, Landroid/graphics/RectF;

    .line 395
    .line 396
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 397
    .line 398
    .line 399
    iput-object v2, v6, La/w03;->b:Landroid/graphics/RectF;

    .line 400
    .line 401
    :cond_4
    invoke-virtual {v2, v15, v11, v5, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 402
    .line 403
    .line 404
    iget-object v0, v6, La/w03;->b:Landroid/graphics/RectF;

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    const/4 v2, 0x0

    .line 410
    invoke-virtual {v1, v0, v12, v4, v2}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 411
    .line 412
    .line 413
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    sub-float/2addr v0, v8

    .line 418
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 419
    .line 420
    .line 421
    move-result v5

    .line 422
    sub-float/2addr v5, v8

    .line 423
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 424
    .line 425
    .line 426
    move-result v11

    .line 427
    add-float/2addr v11, v8

    .line 428
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 429
    .line 430
    .line 431
    move-result v15

    .line 432
    add-float/2addr v15, v8

    .line 433
    add-float v8, v12, v4

    .line 434
    .line 435
    add-float v8, v8, v23

    .line 436
    .line 437
    sub-float/2addr v8, v3

    .line 438
    neg-float v12, v4

    .line 439
    sub-float v12, v12, v24

    .line 440
    .line 441
    mul-float v3, v3, v19

    .line 442
    .line 443
    add-float/2addr v3, v12

    .line 444
    iget-object v12, v6, La/w03;->b:Landroid/graphics/RectF;

    .line 445
    .line 446
    if-nez v12, :cond_5

    .line 447
    .line 448
    new-instance v12, Landroid/graphics/RectF;

    .line 449
    .line 450
    invoke-direct {v12}, Landroid/graphics/RectF;-><init>()V

    .line 451
    .line 452
    .line 453
    iput-object v12, v6, La/w03;->b:Landroid/graphics/RectF;

    .line 454
    .line 455
    :cond_5
    invoke-virtual {v12, v0, v5, v11, v15}, Landroid/graphics/RectF;->set(FFFF)V

    .line 456
    .line 457
    .line 458
    iget-object v0, v6, La/w03;->b:Landroid/graphics/RectF;

    .line 459
    .line 460
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v1, v0, v8, v3, v2}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 464
    .line 465
    .line 466
    invoke-static {}, La/z03;->a()La/w03;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    add-float/2addr v13, v7

    .line 475
    add-float v13, v13, v18

    .line 476
    .line 477
    mul-float v5, v9, v19

    .line 478
    .line 479
    sub-float v3, v13, v5

    .line 480
    .line 481
    add-float v8, v1, v5

    .line 482
    .line 483
    iget-object v11, v0, La/w03;->a:Landroid/graphics/Path;

    .line 484
    .line 485
    iget-object v12, v0, La/w03;->b:Landroid/graphics/RectF;

    .line 486
    .line 487
    if-nez v12, :cond_6

    .line 488
    .line 489
    new-instance v12, Landroid/graphics/RectF;

    .line 490
    .line 491
    invoke-direct {v12}, Landroid/graphics/RectF;-><init>()V

    .line 492
    .line 493
    .line 494
    iput-object v12, v0, La/w03;->b:Landroid/graphics/RectF;

    .line 495
    .line 496
    :cond_6
    invoke-virtual {v12, v1, v3, v8, v13}, Landroid/graphics/RectF;->set(FFFF)V

    .line 497
    .line 498
    .line 499
    iget-object v12, v0, La/w03;->b:Landroid/graphics/RectF;

    .line 500
    .line 501
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    const/high16 v15, 0x42b40000    # 90.0f

    .line 505
    .line 506
    invoke-virtual {v11, v12, v15, v15, v2}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 507
    .line 508
    .line 509
    add-float v12, v7, v9

    .line 510
    .line 511
    add-float v12, v12, v18

    .line 512
    .line 513
    invoke-virtual {v0, v1, v12}, La/w03;->e(FF)V

    .line 514
    .line 515
    .line 516
    add-float v12, v7, v5

    .line 517
    .line 518
    iget-object v2, v0, La/w03;->b:Landroid/graphics/RectF;

    .line 519
    .line 520
    if-nez v2, :cond_7

    .line 521
    .line 522
    new-instance v2, Landroid/graphics/RectF;

    .line 523
    .line 524
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 525
    .line 526
    .line 527
    iput-object v2, v0, La/w03;->b:Landroid/graphics/RectF;

    .line 528
    .line 529
    :cond_7
    invoke-virtual {v2, v1, v7, v8, v12}, Landroid/graphics/RectF;->set(FFFF)V

    .line 530
    .line 531
    .line 532
    iget-object v1, v0, La/w03;->b:Landroid/graphics/RectF;

    .line 533
    .line 534
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    const/high16 v2, 0x43340000    # 180.0f

    .line 538
    .line 539
    const/4 v8, 0x0

    .line 540
    invoke-virtual {v11, v1, v2, v15, v8}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 541
    .line 542
    .line 543
    invoke-static {}, La/z03;->a()La/w03;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    sub-float/2addr v2, v5

    .line 552
    add-float/2addr v5, v2

    .line 553
    iget-object v8, v1, La/w03;->a:Landroid/graphics/Path;

    .line 554
    .line 555
    iget-object v11, v1, La/w03;->b:Landroid/graphics/RectF;

    .line 556
    .line 557
    if-nez v11, :cond_8

    .line 558
    .line 559
    new-instance v11, Landroid/graphics/RectF;

    .line 560
    .line 561
    invoke-direct {v11}, Landroid/graphics/RectF;-><init>()V

    .line 562
    .line 563
    .line 564
    iput-object v11, v1, La/w03;->b:Landroid/graphics/RectF;

    .line 565
    .line 566
    :cond_8
    invoke-virtual {v11, v2, v7, v5, v12}, Landroid/graphics/RectF;->set(FFFF)V

    .line 567
    .line 568
    .line 569
    iget-object v7, v1, La/w03;->b:Landroid/graphics/RectF;

    .line 570
    .line 571
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    const/high16 v11, -0x3d4c0000    # -90.0f

    .line 575
    .line 576
    const/4 v12, 0x0

    .line 577
    invoke-virtual {v8, v7, v11, v15, v12}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 578
    .line 579
    .line 580
    sub-float v7, v13, v9

    .line 581
    .line 582
    invoke-virtual {v1, v5, v7}, La/w03;->e(FF)V

    .line 583
    .line 584
    .line 585
    iget-object v7, v1, La/w03;->b:Landroid/graphics/RectF;

    .line 586
    .line 587
    if-nez v7, :cond_9

    .line 588
    .line 589
    new-instance v7, Landroid/graphics/RectF;

    .line 590
    .line 591
    invoke-direct {v7}, Landroid/graphics/RectF;-><init>()V

    .line 592
    .line 593
    .line 594
    iput-object v7, v1, La/w03;->b:Landroid/graphics/RectF;

    .line 595
    .line 596
    :cond_9
    invoke-virtual {v7, v2, v3, v5, v13}, Landroid/graphics/RectF;->set(FFFF)V

    .line 597
    .line 598
    .line 599
    iget-object v2, v1, La/w03;->b:Landroid/graphics/RectF;

    .line 600
    .line 601
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    const/4 v3, 0x0

    .line 605
    const/4 v12, 0x0

    .line 606
    invoke-virtual {v8, v2, v3, v15, v12}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 607
    .line 608
    .line 609
    add-float v4, v4, v24

    .line 610
    .line 611
    invoke-static {}, La/ui30;->a()[F

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 620
    .line 621
    .line 622
    move-result v5

    .line 623
    invoke-static {v2, v3, v5}, La/ui30;->g([FFF)V

    .line 624
    .line 625
    .line 626
    invoke-static {v4, v2}, La/ui30;->e(F[F)V

    .line 627
    .line 628
    .line 629
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    neg-float v3, v3

    .line 634
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 635
    .line 636
    .line 637
    move-result v4

    .line 638
    neg-float v4, v4

    .line 639
    invoke-static {v2, v3, v4}, La/ui30;->g([FFF)V

    .line 640
    .line 641
    .line 642
    iget-object v3, v1, La/w03;->d:Landroid/graphics/Matrix;

    .line 643
    .line 644
    if-nez v3, :cond_a

    .line 645
    .line 646
    new-instance v3, Landroid/graphics/Matrix;

    .line 647
    .line 648
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 649
    .line 650
    .line 651
    iput-object v3, v1, La/w03;->d:Landroid/graphics/Matrix;

    .line 652
    .line 653
    :cond_a
    invoke-static {v3, v2}, La/tke;->a0(Landroid/graphics/Matrix;[F)V

    .line 654
    .line 655
    .line 656
    iget-object v2, v1, La/w03;->a:Landroid/graphics/Path;

    .line 657
    .line 658
    iget-object v3, v1, La/w03;->d:Landroid/graphics/Matrix;

    .line 659
    .line 660
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v2, v3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 664
    .line 665
    .line 666
    invoke-static {}, La/z03;->a()La/w03;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    const/4 v3, 0x2

    .line 671
    invoke-virtual {v2, v6, v0, v3}, La/w03;->g(La/w03;La/w03;I)Z

    .line 672
    .line 673
    .line 674
    invoke-static {}, La/z03;->a()La/w03;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-virtual {v0, v2, v1, v3}, La/w03;->g(La/w03;La/w03;I)Z

    .line 679
    .line 680
    .line 681
    sget-object v4, La/l0q;->a:La/l0q;

    .line 682
    .line 683
    const/16 v5, 0x34

    .line 684
    .line 685
    const/4 v3, 0x0

    .line 686
    move-object v1, v0

    .line 687
    move-object/from16 v2, v17

    .line 688
    .line 689
    move-object/from16 v0, v20

    .line 690
    .line 691
    invoke-static/range {v0 .. v5}, La/fhl;->K0(La/fhl;La/w03;La/t89;FLa/agc;I)V

    .line 692
    .line 693
    .line 694
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 695
    .line 696
    return-object v0
.end method
