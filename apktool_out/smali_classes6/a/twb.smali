.class public final synthetic La/twb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:La/xwb;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:La/a4x;

.field public final synthetic g:I

.field public final synthetic h:F

.field public final synthetic i:La/g9q0;

.field public final synthetic j:La/pz40;

.field public final synthetic k:F

.field public final synthetic l:La/rah0;


# direct methods
.method public synthetic constructor <init>(FFFLa/xwb;Ljava/util/List;La/a4x;IFLa/g9q0;La/pz40;FLa/rah0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/twb;->a:F

    iput p2, p0, La/twb;->b:F

    iput p3, p0, La/twb;->c:F

    iput-object p4, p0, La/twb;->d:La/xwb;

    iput-object p5, p0, La/twb;->e:Ljava/util/List;

    iput-object p6, p0, La/twb;->f:La/a4x;

    iput p7, p0, La/twb;->g:I

    iput p8, p0, La/twb;->h:F

    iput-object p9, p0, La/twb;->i:La/g9q0;

    iput-object p10, p0, La/twb;->j:La/pz40;

    iput p11, p0, La/twb;->k:F

    iput-object p12, p0, La/twb;->l:La/rah0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 51

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
    iget v2, v0, La/twb;->a:F

    .line 11
    .line 12
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 13
    .line 14
    .line 15
    move-result v12

    .line 16
    iget v2, v0, La/twb;->b:F

    .line 17
    .line 18
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 19
    .line 20
    .line 21
    move-result v13

    .line 22
    iget v2, v0, La/twb;->c:F

    .line 23
    .line 24
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 25
    .line 26
    .line 27
    move-result v14

    .line 28
    const/high16 v15, 0x42200000    # 40.0f

    .line 29
    .line 30
    invoke-interface {v1, v15}, La/w6k;->w0(F)F

    .line 31
    .line 32
    .line 33
    move-result v16

    .line 34
    iget-object v2, v0, La/twb;->e:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v17

    .line 40
    :goto_0
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget-object v8, v0, La/twb;->d:La/xwb;

    .line 45
    .line 46
    iget v3, v0, La/twb;->g:I

    .line 47
    .line 48
    iget v4, v0, La/twb;->h:F

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    const-wide v18, 0xffffffffL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    const/16 v20, 0x20

    .line 57
    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    sub-int/2addr v2, v3

    .line 71
    int-to-float v2, v2

    .line 72
    div-float/2addr v2, v4

    .line 73
    mul-float/2addr v2, v13

    .line 74
    add-float v2, v2, v16

    .line 75
    .line 76
    move v4, v2

    .line 77
    iget-wide v2, v8, La/xwb;->g:J

    .line 78
    .line 79
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    int-to-long v5, v5

    .line 84
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    int-to-long v7, v7

    .line 89
    shl-long v5, v5, v20

    .line 90
    .line 91
    and-long v7, v7, v18

    .line 92
    .line 93
    or-long/2addr v5, v7

    .line 94
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    int-to-long v7, v7

    .line 99
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    int-to-long v10, v4

    .line 104
    shl-long v7, v7, v20

    .line 105
    .line 106
    and-long v9, v10, v18

    .line 107
    .line 108
    or-long/2addr v7, v9

    .line 109
    sget-object v4, La/qmk;->a:La/zcl;

    .line 110
    .line 111
    const/high16 v4, 0x3f800000    # 1.0f

    .line 112
    .line 113
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    const/4 v10, 0x0

    .line 118
    const/16 v11, 0x1f0

    .line 119
    .line 120
    const/4 v9, 0x0

    .line 121
    move-wide/from16 v47, v7

    .line 122
    .line 123
    move v8, v4

    .line 124
    move-wide v4, v5

    .line 125
    move-wide/from16 v6, v47

    .line 126
    .line 127
    invoke-static/range {v1 .. v11}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_0
    new-instance v12, Ljava/util/ArrayList;

    .line 132
    .line 133
    const/16 v2, 0xa

    .line 134
    .line 135
    iget-object v10, v0, La/twb;->f:La/a4x;

    .line 136
    .line 137
    invoke-static {v10, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    const/4 v11, 0x0

    .line 149
    move v5, v11

    .line 150
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    const/16 v17, 0x0

    .line 155
    .line 156
    const/high16 v7, 0x40000000    # 2.0f

    .line 157
    .line 158
    if-eqz v6, :cond_2

    .line 159
    .line 160
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    add-int/lit8 v21, v5, 0x1

    .line 165
    .line 166
    if-ltz v5, :cond_1

    .line 167
    .line 168
    check-cast v6, La/uoa0;

    .line 169
    .line 170
    int-to-float v5, v5

    .line 171
    mul-float/2addr v5, v14

    .line 172
    div-float v7, v14, v7

    .line 173
    .line 174
    add-float/2addr v7, v5

    .line 175
    iget v5, v6, La/uoa0;->b:I

    .line 176
    .line 177
    sub-int/2addr v5, v3

    .line 178
    int-to-float v5, v5

    .line 179
    div-float/2addr v5, v4

    .line 180
    mul-float/2addr v5, v13

    .line 181
    add-float v5, v5, v16

    .line 182
    .line 183
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    int-to-long v6, v6

    .line 188
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    move/from16 v22, v9

    .line 193
    .line 194
    move-object/from16 v23, v10

    .line 195
    .line 196
    int-to-long v9, v5

    .line 197
    shl-long v5, v6, v20

    .line 198
    .line 199
    and-long v9, v9, v18

    .line 200
    .line 201
    or-long/2addr v5, v9

    .line 202
    new-instance v7, La/ne60;

    .line 203
    .line 204
    invoke-direct {v7, v5, v6}, La/ne60;-><init>(J)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move/from16 v5, v21

    .line 211
    .line 212
    move/from16 v9, v22

    .line 213
    .line 214
    move-object/from16 v10, v23

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 218
    .line 219
    .line 220
    throw v17

    .line 221
    :cond_2
    move/from16 v22, v9

    .line 222
    .line 223
    move-object/from16 v23, v10

    .line 224
    .line 225
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    const/high16 v21, 0x40400000    # 3.0f

    .line 230
    .line 231
    const/4 v9, 0x1

    .line 232
    if-le v2, v9, :cond_b

    .line 233
    .line 234
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    const/4 v3, 0x2

    .line 239
    if-ge v2, v3, :cond_4

    .line 240
    .line 241
    invoke-static {}, La/z03;->a()La/w03;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    move/from16 v27, v7

    .line 246
    .line 247
    move-object/from16 v25, v8

    .line 248
    .line 249
    move/from16 v24, v9

    .line 250
    .line 251
    :cond_3
    move-object v15, v12

    .line 252
    move-object v7, v2

    .line 253
    goto/16 :goto_9

    .line 254
    .line 255
    :cond_4
    add-int/lit8 v4, v2, -0x1

    .line 256
    .line 257
    new-array v5, v4, [F

    .line 258
    .line 259
    new-array v6, v4, [F

    .line 260
    .line 261
    move v10, v11

    .line 262
    :goto_2
    if-ge v10, v4, :cond_5

    .line 263
    .line 264
    move/from16 v24, v9

    .line 265
    .line 266
    add-int/lit8 v9, v10, 0x1

    .line 267
    .line 268
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v25

    .line 272
    move-object/from16 v15, v25

    .line 273
    .line 274
    check-cast v15, La/ne60;

    .line 275
    .line 276
    move/from16 v27, v7

    .line 277
    .line 278
    move-object/from16 v25, v8

    .line 279
    .line 280
    iget-wide v7, v15, La/ne60;->a:J

    .line 281
    .line 282
    shr-long v7, v7, v20

    .line 283
    .line 284
    long-to-int v7, v7

    .line 285
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    check-cast v8, La/ne60;

    .line 294
    .line 295
    move/from16 v28, v4

    .line 296
    .line 297
    iget-wide v3, v8, La/ne60;->a:J

    .line 298
    .line 299
    shr-long v3, v3, v20

    .line 300
    .line 301
    long-to-int v3, v3

    .line 302
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    sub-float/2addr v7, v3

    .line 307
    aput v7, v6, v10

    .line 308
    .line 309
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    check-cast v3, La/ne60;

    .line 314
    .line 315
    iget-wide v3, v3, La/ne60;->a:J

    .line 316
    .line 317
    and-long v3, v3, v18

    .line 318
    .line 319
    long-to-int v3, v3

    .line 320
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    check-cast v4, La/ne60;

    .line 329
    .line 330
    iget-wide v7, v4, La/ne60;->a:J

    .line 331
    .line 332
    and-long v7, v7, v18

    .line 333
    .line 334
    long-to-int v4, v7

    .line 335
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    sub-float/2addr v3, v4

    .line 340
    aget v4, v6, v10

    .line 341
    .line 342
    div-float/2addr v3, v4

    .line 343
    aput v3, v5, v10

    .line 344
    .line 345
    move v10, v9

    .line 346
    move/from16 v9, v24

    .line 347
    .line 348
    move-object/from16 v8, v25

    .line 349
    .line 350
    move/from16 v7, v27

    .line 351
    .line 352
    move/from16 v4, v28

    .line 353
    .line 354
    const/4 v3, 0x2

    .line 355
    const/high16 v15, 0x42200000    # 40.0f

    .line 356
    .line 357
    goto :goto_2

    .line 358
    :cond_5
    move/from16 v28, v4

    .line 359
    .line 360
    move/from16 v27, v7

    .line 361
    .line 362
    move-object/from16 v25, v8

    .line 363
    .line 364
    move/from16 v24, v9

    .line 365
    .line 366
    new-array v3, v2, [F

    .line 367
    .line 368
    move/from16 v7, v24

    .line 369
    .line 370
    :goto_3
    if-ge v7, v4, :cond_7

    .line 371
    .line 372
    add-int/lit8 v8, v7, -0x1

    .line 373
    .line 374
    aget v9, v5, v8

    .line 375
    .line 376
    aget v10, v5, v7

    .line 377
    .line 378
    mul-float v28, v9, v10

    .line 379
    .line 380
    cmpg-float v28, v28, v22

    .line 381
    .line 382
    if-gtz v28, :cond_6

    .line 383
    .line 384
    aput v22, v3, v7

    .line 385
    .line 386
    goto :goto_4

    .line 387
    :cond_6
    aget v28, v6, v7

    .line 388
    .line 389
    mul-float v9, v9, v28

    .line 390
    .line 391
    aget v29, v6, v8

    .line 392
    .line 393
    mul-float v30, v10, v29

    .line 394
    .line 395
    add-float v30, v30, v9

    .line 396
    .line 397
    add-float v29, v29, v28

    .line 398
    .line 399
    div-float v30, v30, v29

    .line 400
    .line 401
    invoke-static {v10}, Ljava/lang/Math;->signum(F)F

    .line 402
    .line 403
    .line 404
    move-result v9

    .line 405
    aget v8, v5, v8

    .line 406
    .line 407
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 408
    .line 409
    .line 410
    move-result v8

    .line 411
    mul-float v8, v8, v27

    .line 412
    .line 413
    aget v10, v5, v7

    .line 414
    .line 415
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 416
    .line 417
    .line 418
    move-result v10

    .line 419
    mul-float v10, v10, v27

    .line 420
    .line 421
    invoke-static/range {v30 .. v30}, Ljava/lang/Math;->abs(F)F

    .line 422
    .line 423
    .line 424
    move-result v15

    .line 425
    invoke-static {v10, v15}, Ljava/lang/Math;->min(FF)F

    .line 426
    .line 427
    .line 428
    move-result v10

    .line 429
    invoke-static {v8, v10}, Ljava/lang/Math;->min(FF)F

    .line 430
    .line 431
    .line 432
    move-result v8

    .line 433
    mul-float/2addr v8, v9

    .line 434
    aput v8, v3, v7

    .line 435
    .line 436
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 437
    .line 438
    goto :goto_3

    .line 439
    :cond_7
    const/4 v15, 0x2

    .line 440
    if-le v2, v15, :cond_a

    .line 441
    .line 442
    aget v7, v5, v11

    .line 443
    .line 444
    aget v8, v6, v11

    .line 445
    .line 446
    aget v9, v6, v24

    .line 447
    .line 448
    add-float/2addr v9, v8

    .line 449
    div-float v10, v8, v9

    .line 450
    .line 451
    const/high16 v15, 0x3f800000    # 1.0f

    .line 452
    .line 453
    add-float/2addr v10, v15

    .line 454
    mul-float/2addr v10, v7

    .line 455
    aget v15, v5, v24

    .line 456
    .line 457
    mul-float/2addr v15, v8

    .line 458
    div-float/2addr v15, v9

    .line 459
    sub-float/2addr v10, v15

    .line 460
    mul-float v8, v10, v7

    .line 461
    .line 462
    cmpg-float v8, v8, v22

    .line 463
    .line 464
    if-gtz v8, :cond_8

    .line 465
    .line 466
    move/from16 v8, v22

    .line 467
    .line 468
    goto :goto_5

    .line 469
    :cond_8
    invoke-static {v7}, Ljava/lang/Math;->signum(F)F

    .line 470
    .line 471
    .line 472
    move-result v7

    .line 473
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    aget v9, v5, v11

    .line 478
    .line 479
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 480
    .line 481
    .line 482
    move-result v9

    .line 483
    mul-float v9, v9, v27

    .line 484
    .line 485
    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    .line 486
    .line 487
    .line 488
    move-result v8

    .line 489
    mul-float/2addr v8, v7

    .line 490
    :goto_5
    aput v8, v3, v11

    .line 491
    .line 492
    add-int/lit8 v7, v2, -0x2

    .line 493
    .line 494
    aget v8, v5, v7

    .line 495
    .line 496
    aget v9, v6, v7

    .line 497
    .line 498
    add-int/lit8 v2, v2, -0x3

    .line 499
    .line 500
    aget v10, v6, v2

    .line 501
    .line 502
    add-float/2addr v10, v9

    .line 503
    div-float v15, v9, v10

    .line 504
    .line 505
    const/high16 v28, 0x3f800000    # 1.0f

    .line 506
    .line 507
    add-float v15, v15, v28

    .line 508
    .line 509
    mul-float/2addr v15, v8

    .line 510
    aget v2, v5, v2

    .line 511
    .line 512
    mul-float/2addr v2, v9

    .line 513
    div-float/2addr v2, v10

    .line 514
    sub-float/2addr v15, v2

    .line 515
    mul-float v2, v15, v8

    .line 516
    .line 517
    cmpg-float v2, v2, v22

    .line 518
    .line 519
    if-gtz v2, :cond_9

    .line 520
    .line 521
    move/from16 v5, v22

    .line 522
    .line 523
    goto :goto_6

    .line 524
    :cond_9
    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    .line 529
    .line 530
    .line 531
    move-result v8

    .line 532
    aget v5, v5, v7

    .line 533
    .line 534
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 535
    .line 536
    .line 537
    move-result v5

    .line 538
    mul-float v5, v5, v27

    .line 539
    .line 540
    invoke-static {v8, v5}, Ljava/lang/Math;->min(FF)F

    .line 541
    .line 542
    .line 543
    move-result v5

    .line 544
    mul-float/2addr v5, v2

    .line 545
    :goto_6
    aput v5, v3, v4

    .line 546
    .line 547
    goto :goto_7

    .line 548
    :cond_a
    aget v2, v5, v11

    .line 549
    .line 550
    aput v2, v3, v11

    .line 551
    .line 552
    aget v2, v5, v11

    .line 553
    .line 554
    aput v2, v3, v24

    .line 555
    .line 556
    :goto_7
    invoke-static {}, La/z03;->a()La/w03;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v5

    .line 564
    check-cast v5, La/ne60;

    .line 565
    .line 566
    iget-wide v7, v5, La/ne60;->a:J

    .line 567
    .line 568
    shr-long v7, v7, v20

    .line 569
    .line 570
    long-to-int v5, v7

    .line 571
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 572
    .line 573
    .line 574
    move-result v5

    .line 575
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v7

    .line 579
    check-cast v7, La/ne60;

    .line 580
    .line 581
    iget-wide v7, v7, La/ne60;->a:J

    .line 582
    .line 583
    and-long v7, v7, v18

    .line 584
    .line 585
    long-to-int v7, v7

    .line 586
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 587
    .line 588
    .line 589
    move-result v7

    .line 590
    invoke-virtual {v2, v5, v7}, La/w03;->f(FF)V

    .line 591
    .line 592
    .line 593
    move v5, v11

    .line 594
    :goto_8
    if-ge v5, v4, :cond_3

    .line 595
    .line 596
    aget v7, v6, v5

    .line 597
    .line 598
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v8

    .line 602
    check-cast v8, La/ne60;

    .line 603
    .line 604
    iget-wide v8, v8, La/ne60;->a:J

    .line 605
    .line 606
    shr-long v8, v8, v20

    .line 607
    .line 608
    long-to-int v8, v8

    .line 609
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 610
    .line 611
    .line 612
    move-result v8

    .line 613
    div-float v9, v7, v21

    .line 614
    .line 615
    add-float v29, v8, v9

    .line 616
    .line 617
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v8

    .line 621
    check-cast v8, La/ne60;

    .line 622
    .line 623
    move-object v15, v12

    .line 624
    iget-wide v11, v8, La/ne60;->a:J

    .line 625
    .line 626
    and-long v11, v11, v18

    .line 627
    .line 628
    long-to-int v8, v11

    .line 629
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 630
    .line 631
    .line 632
    move-result v8

    .line 633
    aget v11, v3, v5

    .line 634
    .line 635
    mul-float/2addr v11, v7

    .line 636
    div-float v11, v11, v21

    .line 637
    .line 638
    add-float v30, v11, v8

    .line 639
    .line 640
    add-int/lit8 v5, v5, 0x1

    .line 641
    .line 642
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v8

    .line 646
    check-cast v8, La/ne60;

    .line 647
    .line 648
    iget-wide v11, v8, La/ne60;->a:J

    .line 649
    .line 650
    shr-long v11, v11, v20

    .line 651
    .line 652
    long-to-int v8, v11

    .line 653
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 654
    .line 655
    .line 656
    move-result v8

    .line 657
    sub-float v31, v8, v9

    .line 658
    .line 659
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v8

    .line 663
    check-cast v8, La/ne60;

    .line 664
    .line 665
    iget-wide v8, v8, La/ne60;->a:J

    .line 666
    .line 667
    and-long v8, v8, v18

    .line 668
    .line 669
    long-to-int v8, v8

    .line 670
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 671
    .line 672
    .line 673
    move-result v8

    .line 674
    aget v9, v3, v5

    .line 675
    .line 676
    mul-float/2addr v7, v9

    .line 677
    div-float v7, v7, v21

    .line 678
    .line 679
    sub-float v32, v8, v7

    .line 680
    .line 681
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v7

    .line 685
    check-cast v7, La/ne60;

    .line 686
    .line 687
    iget-wide v7, v7, La/ne60;->a:J

    .line 688
    .line 689
    shr-long v7, v7, v20

    .line 690
    .line 691
    long-to-int v7, v7

    .line 692
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 693
    .line 694
    .line 695
    move-result v33

    .line 696
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v7

    .line 700
    check-cast v7, La/ne60;

    .line 701
    .line 702
    iget-wide v7, v7, La/ne60;->a:J

    .line 703
    .line 704
    and-long v7, v7, v18

    .line 705
    .line 706
    long-to-int v7, v7

    .line 707
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 708
    .line 709
    .line 710
    move-result v34

    .line 711
    iget-object v7, v2, La/w03;->a:Landroid/graphics/Path;

    .line 712
    .line 713
    move-object/from16 v28, v7

    .line 714
    .line 715
    invoke-virtual/range {v28 .. v34}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 716
    .line 717
    .line 718
    move-object v12, v15

    .line 719
    const/4 v11, 0x0

    .line 720
    goto :goto_8

    .line 721
    :goto_9
    invoke-static {}, La/z03;->a()La/w03;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    invoke-static {v2, v7}, La/w03;->a(La/w03;La/w03;)V

    .line 726
    .line 727
    .line 728
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v3

    .line 732
    check-cast v3, La/ne60;

    .line 733
    .line 734
    iget-wide v3, v3, La/ne60;->a:J

    .line 735
    .line 736
    shr-long v3, v3, v20

    .line 737
    .line 738
    long-to-int v3, v3

    .line 739
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 740
    .line 741
    .line 742
    move-result v3

    .line 743
    add-float v4, v16, v13

    .line 744
    .line 745
    invoke-virtual {v2, v3, v4}, La/w03;->e(FF)V

    .line 746
    .line 747
    .line 748
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v3

    .line 752
    check-cast v3, La/ne60;

    .line 753
    .line 754
    iget-wide v5, v3, La/ne60;->a:J

    .line 755
    .line 756
    shr-long v5, v5, v20

    .line 757
    .line 758
    long-to-int v3, v5

    .line 759
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 760
    .line 761
    .line 762
    move-result v3

    .line 763
    invoke-virtual {v2, v3, v4}, La/w03;->e(FF)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v2}, La/w03;->c()V

    .line 767
    .line 768
    .line 769
    move-object/from16 v8, v25

    .line 770
    .line 771
    iget-object v3, v8, La/xwb;->b:La/e900;

    .line 772
    .line 773
    const/4 v5, 0x0

    .line 774
    const/16 v6, 0x3c

    .line 775
    .line 776
    const/4 v4, 0x0

    .line 777
    invoke-static/range {v1 .. v6}, La/fhl;->K0(La/fhl;La/w03;La/t89;FLa/agc;I)V

    .line 778
    .line 779
    .line 780
    iget-wide v3, v8, La/xwb;->a:J

    .line 781
    .line 782
    new-instance v6, La/vtm0;

    .line 783
    .line 784
    move/from16 v2, v27

    .line 785
    .line 786
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 787
    .line 788
    .line 789
    move-result v29

    .line 790
    const/16 v33, 0x0

    .line 791
    .line 792
    const/16 v34, 0x12

    .line 793
    .line 794
    const/16 v30, 0x0

    .line 795
    .line 796
    const/16 v31, 0x1

    .line 797
    .line 798
    const/16 v32, 0x1

    .line 799
    .line 800
    move-object/from16 v28, v6

    .line 801
    .line 802
    invoke-direct/range {v28 .. v34}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 803
    .line 804
    .line 805
    move-object v2, v7

    .line 806
    const/16 v7, 0x34

    .line 807
    .line 808
    const/4 v5, 0x0

    .line 809
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 810
    .line 811
    .line 812
    goto :goto_a

    .line 813
    :cond_b
    move/from16 v27, v7

    .line 814
    .line 815
    move/from16 v24, v9

    .line 816
    .line 817
    move-object v15, v12

    .line 818
    :goto_a
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->size()I

    .line 819
    .line 820
    .line 821
    move-result v12

    .line 822
    const/high16 v2, 0x40c00000    # 6.0f

    .line 823
    .line 824
    if-ltz v12, :cond_c

    .line 825
    .line 826
    const/4 v3, 0x0

    .line 827
    :goto_b
    int-to-float v4, v3

    .line 828
    mul-float/2addr v4, v14

    .line 829
    sget-object v5, La/qmk;->a:La/zcl;

    .line 830
    .line 831
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 832
    .line 833
    .line 834
    move-result v5

    .line 835
    move v7, v2

    .line 836
    move v6, v3

    .line 837
    iget-wide v2, v8, La/xwb;->g:J

    .line 838
    .line 839
    add-float v9, v16, v13

    .line 840
    .line 841
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 842
    .line 843
    .line 844
    move-result v11

    .line 845
    move-object/from16 v25, v8

    .line 846
    .line 847
    int-to-long v7, v11

    .line 848
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 849
    .line 850
    .line 851
    move-result v11

    .line 852
    int-to-long v10, v11

    .line 853
    shl-long v7, v7, v20

    .line 854
    .line 855
    and-long v10, v10, v18

    .line 856
    .line 857
    or-long/2addr v7, v10

    .line 858
    add-float/2addr v9, v5

    .line 859
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 860
    .line 861
    .line 862
    move-result v4

    .line 863
    int-to-long v4, v4

    .line 864
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 865
    .line 866
    .line 867
    move-result v9

    .line 868
    int-to-long v9, v9

    .line 869
    shl-long v4, v4, v20

    .line 870
    .line 871
    and-long v9, v9, v18

    .line 872
    .line 873
    or-long/2addr v4, v9

    .line 874
    move v10, v6

    .line 875
    const/high16 v9, 0x3f800000    # 1.0f

    .line 876
    .line 877
    move-wide/from16 v47, v7

    .line 878
    .line 879
    move-wide v6, v4

    .line 880
    move-wide/from16 v4, v47

    .line 881
    .line 882
    invoke-interface {v1, v9}, La/w6k;->w0(F)F

    .line 883
    .line 884
    .line 885
    move-result v8

    .line 886
    move v11, v10

    .line 887
    const/4 v10, 0x0

    .line 888
    move/from16 v30, v11

    .line 889
    .line 890
    const/16 v11, 0x1f0

    .line 891
    .line 892
    move/from16 v31, v9

    .line 893
    .line 894
    const/4 v9, 0x0

    .line 895
    move/from16 p1, v13

    .line 896
    .line 897
    move/from16 v22, v14

    .line 898
    .line 899
    move/from16 v28, v24

    .line 900
    .line 901
    move-object/from16 v14, v25

    .line 902
    .line 903
    move/from16 v13, v30

    .line 904
    .line 905
    const/16 v29, 0x0

    .line 906
    .line 907
    move-object/from16 v24, v15

    .line 908
    .line 909
    const/high16 v15, 0x40c00000    # 6.0f

    .line 910
    .line 911
    invoke-static/range {v1 .. v11}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 912
    .line 913
    .line 914
    if-eq v13, v12, :cond_d

    .line 915
    .line 916
    add-int/lit8 v3, v13, 0x1

    .line 917
    .line 918
    move/from16 v13, p1

    .line 919
    .line 920
    move-object v8, v14

    .line 921
    move v2, v15

    .line 922
    move/from16 v14, v22

    .line 923
    .line 924
    move-object/from16 v15, v24

    .line 925
    .line 926
    move/from16 v24, v28

    .line 927
    .line 928
    const/16 v22, 0x0

    .line 929
    .line 930
    goto :goto_b

    .line 931
    :cond_c
    move/from16 p1, v13

    .line 932
    .line 933
    move/from16 v22, v14

    .line 934
    .line 935
    move/from16 v28, v24

    .line 936
    .line 937
    const/16 v29, 0x0

    .line 938
    .line 939
    move-object v14, v8

    .line 940
    move-object/from16 v24, v15

    .line 941
    .line 942
    move v15, v2

    .line 943
    :cond_d
    invoke-interface/range {v23 .. v23}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 944
    .line 945
    .line 946
    move-result-object v8

    .line 947
    move/from16 v11, v29

    .line 948
    .line 949
    :goto_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 950
    .line 951
    .line 952
    move-result v2

    .line 953
    iget-object v3, v0, La/twb;->i:La/g9q0;

    .line 954
    .line 955
    const/high16 v12, 0x41000000    # 8.0f

    .line 956
    .line 957
    if-eqz v2, :cond_f

    .line 958
    .line 959
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v2

    .line 963
    add-int/lit8 v9, v11, 0x1

    .line 964
    .line 965
    if-ltz v11, :cond_e

    .line 966
    .line 967
    check-cast v2, La/uoa0;

    .line 968
    .line 969
    int-to-float v4, v11

    .line 970
    mul-float v4, v4, v22

    .line 971
    .line 972
    div-float v5, v22, v27

    .line 973
    .line 974
    add-float/2addr v5, v4

    .line 975
    sget-object v4, La/qmk;->a:La/zcl;

    .line 976
    .line 977
    invoke-interface {v1, v12}, La/w6k;->w0(F)F

    .line 978
    .line 979
    .line 980
    move-result v4

    .line 981
    add-float/2addr v4, v5

    .line 982
    iget v2, v2, La/uoa0;->a:I

    .line 983
    .line 984
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 985
    .line 986
    .line 987
    move-result-object v2

    .line 988
    new-instance v5, La/j83;

    .line 989
    .line 990
    invoke-direct {v5, v2}, La/j83;-><init>(Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    iget-object v2, v14, La/xwb;->e:La/y9q0;

    .line 994
    .line 995
    const/16 v45, 0x0

    .line 996
    .line 997
    const/16 v46, 0x7fc

    .line 998
    .line 999
    const/16 v38, 0x0

    .line 1000
    .line 1001
    const/16 v39, 0x0

    .line 1002
    .line 1003
    const/16 v40, 0x0

    .line 1004
    .line 1005
    const-wide/16 v41, 0x0

    .line 1006
    .line 1007
    const/16 v43, 0x0

    .line 1008
    .line 1009
    const/16 v44, 0x0

    .line 1010
    .line 1011
    move-object/from16 v37, v2

    .line 1012
    .line 1013
    move-object/from16 v35, v3

    .line 1014
    .line 1015
    move-object/from16 v36, v5

    .line 1016
    .line 1017
    invoke-static/range {v35 .. v46}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v2

    .line 1021
    add-float v13, v16, p1

    .line 1022
    .line 1023
    const/high16 v3, 0x41a00000    # 20.0f

    .line 1024
    .line 1025
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 1026
    .line 1027
    .line 1028
    move-result v5

    .line 1029
    add-float/2addr v5, v13

    .line 1030
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1031
    .line 1032
    .line 1033
    move-result v6

    .line 1034
    int-to-long v6, v6

    .line 1035
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1036
    .line 1037
    .line 1038
    move-result v5

    .line 1039
    int-to-long v10, v5

    .line 1040
    shl-long v5, v6, v20

    .line 1041
    .line 1042
    and-long v10, v10, v18

    .line 1043
    .line 1044
    or-long/2addr v5, v10

    .line 1045
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v10

    .line 1049
    invoke-virtual {v10}, La/nr;->p()J

    .line 1050
    .line 1051
    .line 1052
    move-result-wide v11

    .line 1053
    invoke-virtual {v10}, La/nr;->i()La/x5a;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v7

    .line 1057
    invoke-interface {v7}, La/x5a;->l()V

    .line 1058
    .line 1059
    .line 1060
    :try_start_0
    iget-object v7, v10, La/nr;->b:Ljava/lang/Object;

    .line 1061
    .line 1062
    check-cast v7, La/fvt0;

    .line 1063
    .line 1064
    const/high16 v15, 0x42200000    # 40.0f

    .line 1065
    .line 1066
    invoke-virtual {v7, v15, v5, v6}, La/fvt0;->y(FJ)V

    .line 1067
    .line 1068
    .line 1069
    iget-wide v5, v14, La/xwb;->f:J

    .line 1070
    .line 1071
    move v7, v4

    .line 1072
    iget-wide v3, v2, La/a9q0;->c:J

    .line 1073
    .line 1074
    shr-long v3, v3, v20

    .line 1075
    .line 1076
    long-to-int v3, v3

    .line 1077
    int-to-float v3, v3

    .line 1078
    div-float v3, v3, v27

    .line 1079
    .line 1080
    sub-float v4, v7, v3

    .line 1081
    .line 1082
    const/high16 v3, 0x41a00000    # 20.0f

    .line 1083
    .line 1084
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 1085
    .line 1086
    .line 1087
    move-result v3

    .line 1088
    add-float/2addr v13, v3

    .line 1089
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1090
    .line 1091
    .line 1092
    move-result v3

    .line 1093
    int-to-long v3, v3

    .line 1094
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1095
    .line 1096
    .line 1097
    move-result v7

    .line 1098
    move-object v13, v1

    .line 1099
    move-object/from16 v26, v2

    .line 1100
    .line 1101
    int-to-long v1, v7

    .line 1102
    shl-long v3, v3, v20

    .line 1103
    .line 1104
    and-long v1, v1, v18

    .line 1105
    .line 1106
    or-long/2addr v1, v3

    .line 1107
    const/16 v7, 0xf8

    .line 1108
    .line 1109
    move-wide v3, v5

    .line 1110
    move-wide v5, v1

    .line 1111
    move-object v1, v13

    .line 1112
    move-object/from16 v2, v26

    .line 1113
    .line 1114
    invoke-static/range {v1 .. v7}, La/v2n0;->o(La/fhl;La/a9q0;JJI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1115
    .line 1116
    .line 1117
    invoke-static {v10, v11, v12}, Lc;->g(La/nr;J)V

    .line 1118
    .line 1119
    .line 1120
    move v11, v9

    .line 1121
    const/high16 v15, 0x40c00000    # 6.0f

    .line 1122
    .line 1123
    goto/16 :goto_c

    .line 1124
    .line 1125
    :catchall_0
    move-exception v0

    .line 1126
    invoke-static {v10, v11, v12}, Lc;->g(La/nr;J)V

    .line 1127
    .line 1128
    .line 1129
    throw v0

    .line 1130
    :cond_e
    invoke-static {}, La/q3d;->p()V

    .line 1131
    .line 1132
    .line 1133
    throw v17

    .line 1134
    :cond_f
    move-object/from16 v35, v3

    .line 1135
    .line 1136
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v10

    .line 1140
    move/from16 v11, v29

    .line 1141
    .line 1142
    :goto_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1143
    .line 1144
    .line 1145
    move-result v2

    .line 1146
    iget-object v3, v0, La/twb;->j:La/pz40;

    .line 1147
    .line 1148
    if-eqz v2, :cond_14

    .line 1149
    .line 1150
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v2

    .line 1154
    add-int/lit8 v13, v11, 0x1

    .line 1155
    .line 1156
    if-ltz v11, :cond_13

    .line 1157
    .line 1158
    check-cast v2, La/ne60;

    .line 1159
    .line 1160
    iget-wide v5, v2, La/ne60;->a:J

    .line 1161
    .line 1162
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v2

    .line 1166
    check-cast v2, Ljava/lang/Integer;

    .line 1167
    .line 1168
    if-nez v2, :cond_10

    .line 1169
    .line 1170
    goto :goto_e

    .line 1171
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1172
    .line 1173
    .line 1174
    move-result v2

    .line 1175
    if-ne v11, v2, :cond_11

    .line 1176
    .line 1177
    move/from16 v11, v28

    .line 1178
    .line 1179
    goto :goto_f

    .line 1180
    :cond_11
    :goto_e
    move/from16 v11, v29

    .line 1181
    .line 1182
    :goto_f
    if-eqz v11, :cond_12

    .line 1183
    .line 1184
    iget-wide v2, v14, La/xwb;->c:J

    .line 1185
    .line 1186
    const v4, 0x3ecccccd    # 0.4f

    .line 1187
    .line 1188
    .line 1189
    invoke-static {v4, v2, v3}, La/y3d;->c(FJ)J

    .line 1190
    .line 1191
    .line 1192
    move-result-wide v2

    .line 1193
    new-instance v4, La/y3d;

    .line 1194
    .line 1195
    invoke-direct {v4, v2, v3}, La/y3d;-><init>(J)V

    .line 1196
    .line 1197
    .line 1198
    sget-wide v2, La/y3d;->f:J

    .line 1199
    .line 1200
    new-instance v7, La/y3d;

    .line 1201
    .line 1202
    invoke-direct {v7, v2, v3}, La/y3d;-><init>(J)V

    .line 1203
    .line 1204
    .line 1205
    filled-new-array {v4, v7}, [La/y3d;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v2

    .line 1209
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v2

    .line 1213
    const/high16 v15, 0x40c00000    # 6.0f

    .line 1214
    .line 1215
    invoke-interface {v1, v15}, La/w6k;->w0(F)F

    .line 1216
    .line 1217
    .line 1218
    move-result v3

    .line 1219
    mul-float v3, v3, v21

    .line 1220
    .line 1221
    new-instance v4, La/ttd0;

    .line 1222
    .line 1223
    invoke-direct {v4, v2, v5, v6, v3}, La/ttd0;-><init>(Ljava/util/List;JF)V

    .line 1224
    .line 1225
    .line 1226
    invoke-interface {v1, v15}, La/w6k;->w0(F)F

    .line 1227
    .line 1228
    .line 1229
    move-result v2

    .line 1230
    mul-float v3, v2, v21

    .line 1231
    .line 1232
    move-object v2, v4

    .line 1233
    move-wide v4, v5

    .line 1234
    const/4 v6, 0x0

    .line 1235
    const/16 v7, 0x78

    .line 1236
    .line 1237
    invoke-static/range {v1 .. v7}, La/fhl;->O(La/fhl;La/ijj0;FJLa/vtm0;I)V

    .line 1238
    .line 1239
    .line 1240
    goto :goto_10

    .line 1241
    :cond_12
    move-wide v4, v5

    .line 1242
    const/high16 v15, 0x40c00000    # 6.0f

    .line 1243
    .line 1244
    :goto_10
    invoke-interface {v1, v15}, La/w6k;->w0(F)F

    .line 1245
    .line 1246
    .line 1247
    move-result v2

    .line 1248
    iget-wide v6, v14, La/xwb;->c:J

    .line 1249
    .line 1250
    const/4 v8, 0x0

    .line 1251
    const/16 v9, 0x78

    .line 1252
    .line 1253
    move-wide/from16 v47, v4

    .line 1254
    .line 1255
    move v4, v2

    .line 1256
    move-wide v2, v6

    .line 1257
    move-wide/from16 v5, v47

    .line 1258
    .line 1259
    const/4 v7, 0x0

    .line 1260
    invoke-static/range {v1 .. v9}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 1261
    .line 1262
    .line 1263
    move v2, v4

    .line 1264
    move-wide v4, v5

    .line 1265
    iget-wide v6, v14, La/xwb;->d:J

    .line 1266
    .line 1267
    new-instance v36, La/vtm0;

    .line 1268
    .line 1269
    const/4 v11, 0x0

    .line 1270
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 1271
    .line 1272
    .line 1273
    move-result v37

    .line 1274
    const/16 v41, 0x0

    .line 1275
    .line 1276
    const/16 v42, 0x1e

    .line 1277
    .line 1278
    const/16 v38, 0x0

    .line 1279
    .line 1280
    const/16 v39, 0x0

    .line 1281
    .line 1282
    const/16 v40, 0x0

    .line 1283
    .line 1284
    invoke-direct/range {v36 .. v42}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 1285
    .line 1286
    .line 1287
    const/16 v9, 0x68

    .line 1288
    .line 1289
    move-wide/from16 v47, v4

    .line 1290
    .line 1291
    move v4, v2

    .line 1292
    move-wide v2, v6

    .line 1293
    move-wide/from16 v5, v47

    .line 1294
    .line 1295
    const/4 v7, 0x0

    .line 1296
    move-object/from16 v8, v36

    .line 1297
    .line 1298
    invoke-static/range {v1 .. v9}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 1299
    .line 1300
    .line 1301
    move v11, v13

    .line 1302
    goto/16 :goto_d

    .line 1303
    .line 1304
    :cond_13
    invoke-static {}, La/q3d;->p()V

    .line 1305
    .line 1306
    .line 1307
    throw v17

    .line 1308
    :cond_14
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v2

    .line 1312
    check-cast v2, Ljava/lang/Integer;

    .line 1313
    .line 1314
    if-eqz v2, :cond_15

    .line 1315
    .line 1316
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1317
    .line 1318
    .line 1319
    move-result v2

    .line 1320
    move-object/from16 v15, v24

    .line 1321
    .line 1322
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v3

    .line 1326
    check-cast v3, La/ne60;

    .line 1327
    .line 1328
    iget-wide v3, v3, La/ne60;->a:J

    .line 1329
    .line 1330
    move-object/from16 v5, v23

    .line 1331
    .line 1332
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v2

    .line 1336
    move-object v13, v2

    .line 1337
    check-cast v13, La/uoa0;

    .line 1338
    .line 1339
    iget-wide v5, v14, La/xwb;->a:J

    .line 1340
    .line 1341
    const/high16 v2, 0x3f000000    # 0.5f

    .line 1342
    .line 1343
    invoke-static {v2, v5, v6}, La/y3d;->c(FJ)J

    .line 1344
    .line 1345
    .line 1346
    move-result-wide v5

    .line 1347
    shr-long v2, v3, v20

    .line 1348
    .line 1349
    long-to-int v15, v2

    .line 1350
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1351
    .line 1352
    .line 1353
    move-result v2

    .line 1354
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1355
    .line 1356
    .line 1357
    move-result v2

    .line 1358
    int-to-long v2, v2

    .line 1359
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1360
    .line 1361
    .line 1362
    move-result v4

    .line 1363
    int-to-long v7, v4

    .line 1364
    shl-long v2, v2, v20

    .line 1365
    .line 1366
    and-long v7, v7, v18

    .line 1367
    .line 1368
    or-long/2addr v2, v7

    .line 1369
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1370
    .line 1371
    .line 1372
    move-result v4

    .line 1373
    add-float v7, v16, p1

    .line 1374
    .line 1375
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1376
    .line 1377
    .line 1378
    move-result v4

    .line 1379
    int-to-long v8, v4

    .line 1380
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1381
    .line 1382
    .line 1383
    move-result v4

    .line 1384
    int-to-long v10, v4

    .line 1385
    shl-long v7, v8, v20

    .line 1386
    .line 1387
    and-long v9, v10, v18

    .line 1388
    .line 1389
    or-long/2addr v7, v9

    .line 1390
    sget-object v4, La/qmk;->a:La/zcl;

    .line 1391
    .line 1392
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1393
    .line 1394
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 1395
    .line 1396
    .line 1397
    move-result v4

    .line 1398
    iget-object v10, v14, La/xwb;->h:La/x03;

    .line 1399
    .line 1400
    const/16 v11, 0x1d0

    .line 1401
    .line 1402
    const/4 v9, 0x0

    .line 1403
    move-wide/from16 v47, v7

    .line 1404
    .line 1405
    move v8, v4

    .line 1406
    move-wide/from16 v49, v5

    .line 1407
    .line 1408
    move-wide v4, v2

    .line 1409
    move-wide/from16 v2, v49

    .line 1410
    .line 1411
    move-wide/from16 v6, v47

    .line 1412
    .line 1413
    invoke-static/range {v1 .. v11}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 1414
    .line 1415
    .line 1416
    iget v2, v13, La/uoa0;->b:I

    .line 1417
    .line 1418
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v2

    .line 1422
    new-instance v3, La/j83;

    .line 1423
    .line 1424
    invoke-direct {v3, v2}, La/j83;-><init>(Ljava/lang/String;)V

    .line 1425
    .line 1426
    .line 1427
    iget-object v2, v14, La/xwb;->j:La/y9q0;

    .line 1428
    .line 1429
    const/16 v45, 0x0

    .line 1430
    .line 1431
    const/16 v46, 0x7fc

    .line 1432
    .line 1433
    const/16 v38, 0x0

    .line 1434
    .line 1435
    const/16 v39, 0x0

    .line 1436
    .line 1437
    const/16 v40, 0x0

    .line 1438
    .line 1439
    const-wide/16 v41, 0x0

    .line 1440
    .line 1441
    const/16 v43, 0x0

    .line 1442
    .line 1443
    const/16 v44, 0x0

    .line 1444
    .line 1445
    move-object/from16 v37, v2

    .line 1446
    .line 1447
    move-object/from16 v36, v3

    .line 1448
    .line 1449
    invoke-static/range {v35 .. v46}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v11

    .line 1453
    const/high16 v13, 0x40800000    # 4.0f

    .line 1454
    .line 1455
    invoke-interface {v1, v13}, La/w6k;->w0(F)F

    .line 1456
    .line 1457
    .line 1458
    move-result v17

    .line 1459
    iget-wide v2, v11, La/a9q0;->c:J

    .line 1460
    .line 1461
    shr-long v4, v2, v20

    .line 1462
    .line 1463
    long-to-int v4, v4

    .line 1464
    int-to-float v4, v4

    .line 1465
    mul-float v5, v17, v13

    .line 1466
    .line 1467
    add-float/2addr v5, v4

    .line 1468
    and-long v2, v2, v18

    .line 1469
    .line 1470
    long-to-int v2, v2

    .line 1471
    int-to-float v2, v2

    .line 1472
    mul-float v21, v17, v27

    .line 1473
    .line 1474
    add-float v22, v2, v21

    .line 1475
    .line 1476
    sub-float v16, v16, v22

    .line 1477
    .line 1478
    invoke-interface {v1, v12}, La/w6k;->w0(F)F

    .line 1479
    .line 1480
    .line 1481
    move-result v2

    .line 1482
    sub-float v16, v16, v2

    .line 1483
    .line 1484
    iget v2, v0, La/twb;->k:F

    .line 1485
    .line 1486
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 1487
    .line 1488
    .line 1489
    move-result v2

    .line 1490
    iget-object v0, v0, La/twb;->l:La/rah0;

    .line 1491
    .line 1492
    iget-object v0, v0, La/rah0;->a:La/cgk0;

    .line 1493
    .line 1494
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 1495
    .line 1496
    .line 1497
    move-result v0

    .line 1498
    int-to-float v0, v0

    .line 1499
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1500
    .line 1501
    .line 1502
    move-result v3

    .line 1503
    div-float v4, v5, v27

    .line 1504
    .line 1505
    sub-float/2addr v3, v4

    .line 1506
    invoke-interface {v1, v13}, La/w6k;->w0(F)F

    .line 1507
    .line 1508
    .line 1509
    move-result v4

    .line 1510
    add-float/2addr v4, v0

    .line 1511
    add-float/2addr v0, v2

    .line 1512
    sub-float/2addr v0, v5

    .line 1513
    invoke-interface {v1, v13}, La/w6k;->w0(F)F

    .line 1514
    .line 1515
    .line 1516
    move-result v2

    .line 1517
    sub-float/2addr v0, v2

    .line 1518
    invoke-static {v3, v4, v0}, La/l1e0;->c(FFF)F

    .line 1519
    .line 1520
    .line 1521
    move-result v12

    .line 1522
    iget-wide v2, v14, La/xwb;->i:J

    .line 1523
    .line 1524
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1525
    .line 1526
    .line 1527
    move-result v0

    .line 1528
    int-to-long v6, v0

    .line 1529
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1530
    .line 1531
    .line 1532
    move-result v0

    .line 1533
    int-to-long v8, v0

    .line 1534
    shl-long v6, v6, v20

    .line 1535
    .line 1536
    and-long v8, v8, v18

    .line 1537
    .line 1538
    or-long/2addr v6, v8

    .line 1539
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1540
    .line 1541
    .line 1542
    move-result v0

    .line 1543
    int-to-long v4, v0

    .line 1544
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1545
    .line 1546
    .line 1547
    move-result v0

    .line 1548
    int-to-long v8, v0

    .line 1549
    shl-long v4, v4, v20

    .line 1550
    .line 1551
    and-long v8, v8, v18

    .line 1552
    .line 1553
    or-long/2addr v4, v8

    .line 1554
    invoke-interface {v1, v13}, La/w6k;->w0(F)F

    .line 1555
    .line 1556
    .line 1557
    move-result v0

    .line 1558
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1559
    .line 1560
    .line 1561
    move-result v8

    .line 1562
    int-to-long v8, v8

    .line 1563
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1564
    .line 1565
    .line 1566
    move-result v0

    .line 1567
    move-object/from16 v25, v14

    .line 1568
    .line 1569
    int-to-long v13, v0

    .line 1570
    shl-long v8, v8, v20

    .line 1571
    .line 1572
    and-long v13, v13, v18

    .line 1573
    .line 1574
    or-long/2addr v8, v13

    .line 1575
    move-object v0, v1

    .line 1576
    move-wide v1, v2

    .line 1577
    move-wide/from16 v47, v6

    .line 1578
    .line 1579
    move-wide v5, v4

    .line 1580
    move-wide/from16 v3, v47

    .line 1581
    .line 1582
    move-wide v7, v8

    .line 1583
    const/4 v9, 0x0

    .line 1584
    const/16 v10, 0xf0

    .line 1585
    .line 1586
    invoke-static/range {v0 .. v10}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 1587
    .line 1588
    .line 1589
    move-object v1, v0

    .line 1590
    move-object/from16 v14, v25

    .line 1591
    .line 1592
    iget-wide v2, v14, La/xwb;->k:J

    .line 1593
    .line 1594
    add-float v12, v12, v21

    .line 1595
    .line 1596
    add-float v17, v16, v17

    .line 1597
    .line 1598
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1599
    .line 1600
    .line 1601
    move-result v0

    .line 1602
    int-to-long v4, v0

    .line 1603
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1604
    .line 1605
    .line 1606
    move-result v0

    .line 1607
    int-to-long v6, v0

    .line 1608
    shl-long v4, v4, v20

    .line 1609
    .line 1610
    and-long v6, v6, v18

    .line 1611
    .line 1612
    or-long/2addr v4, v6

    .line 1613
    const/16 v6, 0xf8

    .line 1614
    .line 1615
    move-object v0, v1

    .line 1616
    move-object v1, v11

    .line 1617
    invoke-static/range {v0 .. v6}, La/v2n0;->o(La/fhl;La/a9q0;JJI)V

    .line 1618
    .line 1619
    .line 1620
    move-object v1, v0

    .line 1621
    invoke-static {}, La/z03;->a()La/w03;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v0

    .line 1625
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1626
    .line 1627
    .line 1628
    move-result v2

    .line 1629
    const/high16 v3, 0x40800000    # 4.0f

    .line 1630
    .line 1631
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 1632
    .line 1633
    .line 1634
    move-result v4

    .line 1635
    sub-float/2addr v2, v4

    .line 1636
    add-float v4, v16, v22

    .line 1637
    .line 1638
    invoke-virtual {v0, v2, v4}, La/w03;->f(FF)V

    .line 1639
    .line 1640
    .line 1641
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1642
    .line 1643
    .line 1644
    move-result v2

    .line 1645
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 1646
    .line 1647
    .line 1648
    move-result v5

    .line 1649
    add-float/2addr v5, v2

    .line 1650
    invoke-virtual {v0, v5, v4}, La/w03;->e(FF)V

    .line 1651
    .line 1652
    .line 1653
    invoke-static {v15}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1654
    .line 1655
    .line 1656
    move-result v2

    .line 1657
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 1658
    .line 1659
    .line 1660
    move-result v3

    .line 1661
    add-float/2addr v3, v4

    .line 1662
    invoke-virtual {v0, v2, v3}, La/w03;->e(FF)V

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {v0}, La/w03;->c()V

    .line 1666
    .line 1667
    .line 1668
    iget-wide v2, v14, La/xwb;->i:J

    .line 1669
    .line 1670
    const/4 v5, 0x0

    .line 1671
    const/16 v6, 0x3c

    .line 1672
    .line 1673
    const/4 v4, 0x0

    .line 1674
    move-object/from16 v47, v1

    .line 1675
    .line 1676
    move-object v1, v0

    .line 1677
    move-object/from16 v0, v47

    .line 1678
    .line 1679
    invoke-static/range {v0 .. v6}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 1680
    .line 1681
    .line 1682
    :cond_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1683
    .line 1684
    return-object v0
.end method
