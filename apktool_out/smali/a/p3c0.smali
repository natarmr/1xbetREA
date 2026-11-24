.class public abstract La/p3c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zsf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/bu40;->b:La/zsf;

    .line 2
    .line 3
    sput-object v0, La/p3c0;->a:La/zsf;

    .line 4
    .line 5
    return-void
.end method

.method public static final a(La/mm40;JFJIFLa/fet;II)V
    .locals 28

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    move/from16 v9, p9

    .line 4
    .line 5
    const v1, 0x13db87c1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, p10, 0x1

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    or-int/lit8 v3, v9, 0x6

    .line 17
    .line 18
    move v4, v3

    .line 19
    move-object/from16 v3, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v3, v9, 0x6

    .line 23
    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    move-object/from16 v3, p0

    .line 27
    .line 28
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    const/4 v4, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v4, v2

    .line 37
    :goto_0
    or-int/2addr v4, v9

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move-object/from16 v3, p0

    .line 40
    .line 41
    move v4, v9

    .line 42
    :goto_1
    and-int/lit8 v5, v9, 0x30

    .line 43
    .line 44
    if-nez v5, :cond_4

    .line 45
    .line 46
    and-int/lit8 v5, p10, 0x2

    .line 47
    .line 48
    move-wide/from16 v7, p1

    .line 49
    .line 50
    if-nez v5, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0, v7, v8}, La/fet;->f(J)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    const/16 v5, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    const/16 v5, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v4, v5

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    move-wide/from16 v7, p1

    .line 66
    .line 67
    :goto_3
    and-int/lit8 v5, p10, 0x4

    .line 68
    .line 69
    if-eqz v5, :cond_6

    .line 70
    .line 71
    or-int/lit16 v4, v4, 0x180

    .line 72
    .line 73
    :cond_5
    move/from16 v11, p3

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_6
    and-int/lit16 v11, v9, 0x180

    .line 77
    .line 78
    if-nez v11, :cond_5

    .line 79
    .line 80
    move/from16 v11, p3

    .line 81
    .line 82
    invoke-virtual {v0, v11}, La/fet;->d(F)Z

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    if-eqz v12, :cond_7

    .line 87
    .line 88
    const/16 v12, 0x100

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_7
    const/16 v12, 0x80

    .line 92
    .line 93
    :goto_4
    or-int/2addr v4, v12

    .line 94
    :goto_5
    and-int/lit16 v12, v9, 0xc00

    .line 95
    .line 96
    if-nez v12, :cond_9

    .line 97
    .line 98
    and-int/lit8 v12, p10, 0x8

    .line 99
    .line 100
    move-wide/from16 v14, p4

    .line 101
    .line 102
    if-nez v12, :cond_8

    .line 103
    .line 104
    invoke-virtual {v0, v14, v15}, La/fet;->f(J)Z

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    if-eqz v12, :cond_8

    .line 109
    .line 110
    const/16 v12, 0x800

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_8
    const/16 v12, 0x400

    .line 114
    .line 115
    :goto_6
    or-int/2addr v4, v12

    .line 116
    goto :goto_7

    .line 117
    :cond_9
    move-wide/from16 v14, p4

    .line 118
    .line 119
    :goto_7
    const v12, 0x36000

    .line 120
    .line 121
    .line 122
    or-int/2addr v4, v12

    .line 123
    const v12, 0x12493

    .line 124
    .line 125
    .line 126
    and-int/2addr v12, v4

    .line 127
    const v6, 0x12492

    .line 128
    .line 129
    .line 130
    const/4 v13, 0x0

    .line 131
    const/4 v10, 0x1

    .line 132
    if-eq v12, v6, :cond_a

    .line 133
    .line 134
    move v6, v10

    .line 135
    goto :goto_8

    .line 136
    :cond_a
    move v6, v13

    .line 137
    :goto_8
    and-int/lit8 v12, v4, 0x1

    .line 138
    .line 139
    invoke-virtual {v0, v12, v6}, La/fet;->U(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v6, :cond_1e

    .line 144
    .line 145
    invoke-virtual {v0}, La/fet;->Z()V

    .line 146
    .line 147
    .line 148
    and-int/lit8 v6, v9, 0x1

    .line 149
    .line 150
    if-eqz v6, :cond_e

    .line 151
    .line 152
    invoke-virtual {v0}, La/fet;->B()Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-eqz v6, :cond_b

    .line 157
    .line 158
    goto :goto_9

    .line 159
    :cond_b
    invoke-virtual {v0}, La/fet;->X()V

    .line 160
    .line 161
    .line 162
    and-int/lit8 v1, p10, 0x2

    .line 163
    .line 164
    if-eqz v1, :cond_c

    .line 165
    .line 166
    and-int/lit8 v4, v4, -0x71

    .line 167
    .line 168
    :cond_c
    and-int/lit8 v1, p10, 0x8

    .line 169
    .line 170
    if-eqz v1, :cond_d

    .line 171
    .line 172
    and-int/lit16 v4, v4, -0x1c01

    .line 173
    .line 174
    :cond_d
    move/from16 v18, p6

    .line 175
    .line 176
    move/from16 v19, p7

    .line 177
    .line 178
    goto :goto_c

    .line 179
    :cond_e
    :goto_9
    if-eqz v1, :cond_f

    .line 180
    .line 181
    sget-object v1, La/jm40;->b:La/jm40;

    .line 182
    .line 183
    goto :goto_a

    .line 184
    :cond_f
    move-object v1, v3

    .line 185
    :goto_a
    and-int/lit8 v3, p10, 0x2

    .line 186
    .line 187
    if-eqz v3, :cond_10

    .line 188
    .line 189
    sget-object v3, La/q3c0;->a:La/u4d;

    .line 190
    .line 191
    invoke-static {v3, v0}, La/v4d;->d(La/u4d;La/fet;)J

    .line 192
    .line 193
    .line 194
    move-result-wide v6

    .line 195
    and-int/lit8 v4, v4, -0x71

    .line 196
    .line 197
    goto :goto_b

    .line 198
    :cond_10
    move-wide v6, v7

    .line 199
    :goto_b
    const/high16 v3, 0x40800000    # 4.0f

    .line 200
    .line 201
    if-eqz v5, :cond_11

    .line 202
    .line 203
    move v11, v3

    .line 204
    :cond_11
    and-int/lit8 v5, p10, 0x8

    .line 205
    .line 206
    if-eqz v5, :cond_12

    .line 207
    .line 208
    sget-wide v14, La/y3d;->f:J

    .line 209
    .line 210
    and-int/lit16 v4, v4, -0x1c01

    .line 211
    .line 212
    :cond_12
    move/from16 v19, v3

    .line 213
    .line 214
    move-wide v7, v6

    .line 215
    move/from16 v18, v10

    .line 216
    .line 217
    move-object v3, v1

    .line 218
    :goto_c
    invoke-virtual {v0}, La/fet;->s()V

    .line 219
    .line 220
    .line 221
    sget-object v1, La/bmd;->h:La/zfn;

    .line 222
    .line 223
    invoke-virtual {v0, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    check-cast v1, La/w6k;

    .line 228
    .line 229
    new-instance v25, La/vtm0;

    .line 230
    .line 231
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    const/4 v5, 0x0

    .line 236
    const/16 v6, 0x1a

    .line 237
    .line 238
    const/4 v12, 0x0

    .line 239
    const/16 v16, 0x0

    .line 240
    .line 241
    move/from16 p1, v1

    .line 242
    .line 243
    move-object/from16 p5, v5

    .line 244
    .line 245
    move/from16 p6, v6

    .line 246
    .line 247
    move/from16 p2, v12

    .line 248
    .line 249
    move/from16 p4, v16

    .line 250
    .line 251
    move/from16 p3, v18

    .line 252
    .line 253
    move-object/from16 p0, v25

    .line 254
    .line 255
    invoke-direct/range {p0 .. p6}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 256
    .line 257
    .line 258
    move-object/from16 v1, p0

    .line 259
    .line 260
    invoke-static {v5, v0, v10}, La/b8k0;->V(Ljava/lang/String;La/fet;I)La/z7x;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    sget-object v12, La/ihn;->d:La/z73;

    .line 265
    .line 266
    const/16 v10, 0x1770

    .line 267
    .line 268
    invoke-static {v10, v13, v12, v2}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    move-wide/from16 v23, v14

    .line 273
    .line 274
    const-wide/16 v13, 0x0

    .line 275
    .line 276
    const/4 v15, 0x6

    .line 277
    invoke-static {v2, v5, v13, v14, v15}, La/ro4;->b0(La/xen;La/kkf0;JI)La/w7x;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    const/16 v17, 0x8

    .line 282
    .line 283
    const/16 v20, 0x0

    .line 284
    .line 285
    const/high16 v21, 0x44870000    # 1080.0f

    .line 286
    .line 287
    const/16 v22, 0x0

    .line 288
    .line 289
    const/16 v25, 0x11b8

    .line 290
    .line 291
    move-object/from16 p5, v0

    .line 292
    .line 293
    move-object/from16 p3, v2

    .line 294
    .line 295
    move-object/from16 p0, v6

    .line 296
    .line 297
    move/from16 p7, v17

    .line 298
    .line 299
    move/from16 p1, v20

    .line 300
    .line 301
    move/from16 p2, v21

    .line 302
    .line 303
    move-object/from16 p4, v22

    .line 304
    .line 305
    move/from16 p6, v25

    .line 306
    .line 307
    invoke-static/range {p0 .. p7}, La/b8k0;->r(La/z7x;FFLa/w7x;Ljava/lang/String;La/fet;II)La/x7x;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    move-object/from16 v2, p0

    .line 312
    .line 313
    new-instance v6, La/wyb0;

    .line 314
    .line 315
    const/4 v12, 0x5

    .line 316
    invoke-direct {v6, v12}, La/wyb0;-><init>(B)V

    .line 317
    .line 318
    .line 319
    new-instance v12, La/jmy;

    .line 320
    .line 321
    new-instance v10, La/imy;

    .line 322
    .line 323
    invoke-direct {v10}, La/imy;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v6, v10}, La/wyb0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    invoke-direct {v12, v10}, La/jmy;-><init>(La/imy;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v12, v5, v13, v14, v15}, La/ro4;->b0(La/xen;La/kkf0;JI)La/w7x;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    const/4 v10, 0x0

    .line 337
    const/16 v12, 0x8

    .line 338
    .line 339
    const/high16 v21, 0x43b40000    # 360.0f

    .line 340
    .line 341
    move-object/from16 p5, p8

    .line 342
    .line 343
    move-object/from16 p3, v6

    .line 344
    .line 345
    move-object/from16 p4, v10

    .line 346
    .line 347
    move/from16 p7, v12

    .line 348
    .line 349
    move/from16 p2, v21

    .line 350
    .line 351
    const/16 p6, 0x11b8

    .line 352
    .line 353
    invoke-static/range {p0 .. p7}, La/b8k0;->r(La/z7x;FFLa/w7x;Ljava/lang/String;La/fet;II)La/x7x;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    move-object/from16 v6, p0

    .line 358
    .line 359
    move/from16 v10, p6

    .line 360
    .line 361
    new-instance v12, La/jmy;

    .line 362
    .line 363
    new-instance v10, La/imy;

    .line 364
    .line 365
    invoke-direct {v10}, La/imy;-><init>()V

    .line 366
    .line 367
    .line 368
    const/16 v5, 0x1770

    .line 369
    .line 370
    iput v5, v10, La/imy;->a:I

    .line 371
    .line 372
    const v17, 0x3f5eb852    # 0.87f

    .line 373
    .line 374
    .line 375
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 376
    .line 377
    .line 378
    move-result-object v13

    .line 379
    const/16 v14, 0xbb8

    .line 380
    .line 381
    invoke-virtual {v10, v14, v13}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 382
    .line 383
    .line 384
    move-result-object v13

    .line 385
    sget-object v14, La/p3c0;->a:La/zsf;

    .line 386
    .line 387
    iput-object v14, v13, La/hmy;->b:La/ghn;

    .line 388
    .line 389
    const v13, 0x3dcccccd    # 0.1f

    .line 390
    .line 391
    .line 392
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 393
    .line 394
    .line 395
    move-result-object v13

    .line 396
    invoke-virtual {v10, v5, v13}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 397
    .line 398
    .line 399
    invoke-direct {v12, v10}, La/jmy;-><init>(La/imy;)V

    .line 400
    .line 401
    .line 402
    const/4 v5, 0x0

    .line 403
    const-wide/16 v13, 0x0

    .line 404
    .line 405
    invoke-static {v12, v5, v13, v14, v15}, La/ro4;->b0(La/xen;La/kkf0;JI)La/w7x;

    .line 406
    .line 407
    .line 408
    move-result-object v5

    .line 409
    const/4 v10, 0x0

    .line 410
    const/16 v12, 0x8

    .line 411
    .line 412
    const v13, 0x3dcccccd    # 0.1f

    .line 413
    .line 414
    .line 415
    const v14, 0x3f5eb852    # 0.87f

    .line 416
    .line 417
    .line 418
    move-object/from16 p3, v5

    .line 419
    .line 420
    move-object/from16 p4, v10

    .line 421
    .line 422
    move/from16 p7, v12

    .line 423
    .line 424
    move/from16 p1, v13

    .line 425
    .line 426
    move/from16 p2, v14

    .line 427
    .line 428
    const/16 p6, 0x11b8

    .line 429
    .line 430
    invoke-static/range {p0 .. p7}, La/b8k0;->r(La/z7x;FFLa/w7x;Ljava/lang/String;La/fet;II)La/x7x;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    move-object/from16 v6, p5

    .line 435
    .line 436
    new-instance v10, La/wyb0;

    .line 437
    .line 438
    invoke-direct {v10, v15}, La/wyb0;-><init>(B)V

    .line 439
    .line 440
    .line 441
    const/4 v12, 0x1

    .line 442
    invoke-static {v3, v12, v10}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 443
    .line 444
    .line 445
    move-result-object v10

    .line 446
    const/high16 v13, 0x42200000    # 40.0f

    .line 447
    .line 448
    invoke-static {v10, v13}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 449
    .line 450
    .line 451
    move-result-object v10

    .line 452
    invoke-virtual {v6, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v13

    .line 456
    const v14, 0xe000

    .line 457
    .line 458
    .line 459
    and-int/2addr v14, v4

    .line 460
    const/16 v15, 0x4000

    .line 461
    .line 462
    if-ne v14, v15, :cond_13

    .line 463
    .line 464
    move v14, v12

    .line 465
    goto :goto_d

    .line 466
    :cond_13
    const/4 v14, 0x0

    .line 467
    :goto_d
    or-int/2addr v13, v14

    .line 468
    const/high16 v14, 0x70000

    .line 469
    .line 470
    and-int/2addr v14, v4

    .line 471
    const/high16 v15, 0x20000

    .line 472
    .line 473
    if-ne v14, v15, :cond_14

    .line 474
    .line 475
    move v14, v12

    .line 476
    goto :goto_e

    .line 477
    :cond_14
    const/4 v14, 0x0

    .line 478
    :goto_e
    or-int/2addr v13, v14

    .line 479
    and-int/lit16 v14, v4, 0x380

    .line 480
    .line 481
    const/16 v15, 0x100

    .line 482
    .line 483
    if-ne v14, v15, :cond_15

    .line 484
    .line 485
    move v14, v12

    .line 486
    goto :goto_f

    .line 487
    :cond_15
    const/4 v14, 0x0

    .line 488
    :goto_f
    or-int/2addr v13, v14

    .line 489
    invoke-virtual {v6, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v14

    .line 493
    or-int/2addr v13, v14

    .line 494
    invoke-virtual {v6, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v14

    .line 498
    or-int/2addr v13, v14

    .line 499
    and-int/lit16 v14, v4, 0x1c00

    .line 500
    .line 501
    xor-int/lit16 v14, v14, 0xc00

    .line 502
    .line 503
    const/16 v15, 0x800

    .line 504
    .line 505
    move/from16 p0, v13

    .line 506
    .line 507
    move-wide/from16 v12, v23

    .line 508
    .line 509
    if-le v14, v15, :cond_16

    .line 510
    .line 511
    invoke-virtual {v6, v12, v13}, La/fet;->f(J)Z

    .line 512
    .line 513
    .line 514
    move-result v14

    .line 515
    if-nez v14, :cond_17

    .line 516
    .line 517
    :cond_16
    and-int/lit16 v14, v4, 0xc00

    .line 518
    .line 519
    if-ne v14, v15, :cond_18

    .line 520
    .line 521
    :cond_17
    const/4 v14, 0x1

    .line 522
    goto :goto_10

    .line 523
    :cond_18
    const/4 v14, 0x0

    .line 524
    :goto_10
    or-int v14, p0, v14

    .line 525
    .line 526
    invoke-virtual {v6, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v15

    .line 530
    or-int/2addr v14, v15

    .line 531
    and-int/lit8 v15, v4, 0x70

    .line 532
    .line 533
    xor-int/lit8 v15, v15, 0x30

    .line 534
    .line 535
    move-object/from16 v21, v0

    .line 536
    .line 537
    const/16 v0, 0x20

    .line 538
    .line 539
    if-le v15, v0, :cond_19

    .line 540
    .line 541
    invoke-virtual {v6, v7, v8}, La/fet;->f(J)Z

    .line 542
    .line 543
    .line 544
    move-result v15

    .line 545
    if-nez v15, :cond_1a

    .line 546
    .line 547
    :cond_19
    and-int/lit8 v4, v4, 0x30

    .line 548
    .line 549
    if-ne v4, v0, :cond_1b

    .line 550
    .line 551
    :cond_1a
    const/16 v16, 0x1

    .line 552
    .line 553
    goto :goto_11

    .line 554
    :cond_1b
    const/16 v16, 0x0

    .line 555
    .line 556
    :goto_11
    or-int v0, v14, v16

    .line 557
    .line 558
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v4

    .line 562
    if-nez v0, :cond_1d

    .line 563
    .line 564
    sget-object v0, La/ukd;->a:La/cl5;

    .line 565
    .line 566
    if-ne v4, v0, :cond_1c

    .line 567
    .line 568
    goto :goto_12

    .line 569
    :cond_1c
    move-wide/from16 v26, v7

    .line 570
    .line 571
    move/from16 v20, v11

    .line 572
    .line 573
    move-wide/from16 v23, v12

    .line 574
    .line 575
    goto :goto_13

    .line 576
    :cond_1d
    :goto_12
    new-instance v16, La/o3c0;

    .line 577
    .line 578
    move-object/from16 v25, v1

    .line 579
    .line 580
    move-object/from16 v22, v2

    .line 581
    .line 582
    move-object/from16 v17, v5

    .line 583
    .line 584
    move-wide/from16 v26, v7

    .line 585
    .line 586
    move/from16 v20, v11

    .line 587
    .line 588
    move-wide/from16 v23, v12

    .line 589
    .line 590
    invoke-direct/range {v16 .. v27}, La/o3c0;-><init>(La/x7x;IFFLa/x7x;La/x7x;JLa/vtm0;J)V

    .line 591
    .line 592
    .line 593
    move-object/from16 v4, v16

    .line 594
    .line 595
    invoke-virtual {v6, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    :goto_13
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 599
    .line 600
    const/4 v12, 0x0

    .line 601
    invoke-static {v10, v4, v6, v12}, La/p8a;->k(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 602
    .line 603
    .line 604
    move-object v1, v3

    .line 605
    move/from16 v7, v18

    .line 606
    .line 607
    move/from16 v8, v19

    .line 608
    .line 609
    move/from16 v4, v20

    .line 610
    .line 611
    move-wide/from16 v5, v23

    .line 612
    .line 613
    move-wide/from16 v2, v26

    .line 614
    .line 615
    goto :goto_14

    .line 616
    :cond_1e
    move-object v6, v0

    .line 617
    invoke-virtual {v6}, La/fet;->X()V

    .line 618
    .line 619
    .line 620
    move-object v1, v3

    .line 621
    move-wide v2, v7

    .line 622
    move v4, v11

    .line 623
    move-wide v5, v14

    .line 624
    move/from16 v7, p6

    .line 625
    .line 626
    move/from16 v8, p7

    .line 627
    .line 628
    :goto_14
    invoke-virtual/range {p8 .. p8}, La/fet;->u()La/yfe0;

    .line 629
    .line 630
    .line 631
    move-result-object v11

    .line 632
    if-eqz v11, :cond_1f

    .line 633
    .line 634
    new-instance v0, La/k3c0;

    .line 635
    .line 636
    move/from16 v10, p10

    .line 637
    .line 638
    invoke-direct/range {v0 .. v10}, La/k3c0;-><init>(La/mm40;JFJIFII)V

    .line 639
    .line 640
    .line 641
    iput-object v0, v11, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 642
    .line 643
    :cond_1f
    return-void
.end method

.method public static final b(Lkotlin/jvm/functions/Function0;La/mm40;JFJFLa/fet;I)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v10, p2

    .line 6
    .line 7
    move/from16 v6, p4

    .line 8
    .line 9
    move-wide/from16 v7, p5

    .line 10
    .line 11
    move-object/from16 v0, p8

    .line 12
    .line 13
    move/from16 v12, p9

    .line 14
    .line 15
    const v3, -0x6b38c90b

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v3}, La/fet;->g0(I)La/fet;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v3, v12, 0x6

    .line 22
    .line 23
    const/4 v4, 0x4

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    move v3, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v3, 0x2

    .line 35
    :goto_0
    or-int/2addr v3, v12

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v3, v12

    .line 38
    :goto_1
    and-int/lit8 v5, v12, 0x30

    .line 39
    .line 40
    if-nez v5, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    const/16 v5, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v5, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v3, v5

    .line 54
    :cond_3
    and-int/lit16 v5, v12, 0x180

    .line 55
    .line 56
    if-nez v5, :cond_5

    .line 57
    .line 58
    invoke-virtual {v0, v10, v11}, La/fet;->f(J)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_4

    .line 63
    .line 64
    const/16 v5, 0x100

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v5, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v3, v5

    .line 70
    :cond_5
    and-int/lit16 v5, v12, 0xc00

    .line 71
    .line 72
    if-nez v5, :cond_7

    .line 73
    .line 74
    invoke-virtual {v0, v6}, La/fet;->d(F)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_6

    .line 79
    .line 80
    const/16 v5, 0x800

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    const/16 v5, 0x400

    .line 84
    .line 85
    :goto_4
    or-int/2addr v3, v5

    .line 86
    :cond_7
    and-int/lit16 v5, v12, 0x6000

    .line 87
    .line 88
    if-nez v5, :cond_9

    .line 89
    .line 90
    invoke-virtual {v0, v7, v8}, La/fet;->f(J)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_8

    .line 95
    .line 96
    const/16 v5, 0x4000

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    const/16 v5, 0x2000

    .line 100
    .line 101
    :goto_5
    or-int/2addr v3, v5

    .line 102
    :cond_9
    const/high16 v5, 0x30000

    .line 103
    .line 104
    and-int/2addr v5, v12

    .line 105
    const/4 v15, 0x1

    .line 106
    if-nez v5, :cond_b

    .line 107
    .line 108
    invoke-virtual {v0, v15}, La/fet;->e(I)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_a

    .line 113
    .line 114
    const/high16 v5, 0x20000

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_a
    const/high16 v5, 0x10000

    .line 118
    .line 119
    :goto_6
    or-int/2addr v3, v5

    .line 120
    :cond_b
    const/high16 v5, 0x180000

    .line 121
    .line 122
    and-int/2addr v5, v12

    .line 123
    if-nez v5, :cond_d

    .line 124
    .line 125
    move/from16 v5, p7

    .line 126
    .line 127
    invoke-virtual {v0, v5}, La/fet;->d(F)Z

    .line 128
    .line 129
    .line 130
    move-result v16

    .line 131
    if-eqz v16, :cond_c

    .line 132
    .line 133
    const/high16 v16, 0x100000

    .line 134
    .line 135
    goto :goto_7

    .line 136
    :cond_c
    const/high16 v16, 0x80000

    .line 137
    .line 138
    :goto_7
    or-int v3, v3, v16

    .line 139
    .line 140
    goto :goto_8

    .line 141
    :cond_d
    move/from16 v5, p7

    .line 142
    .line 143
    :goto_8
    const v16, 0x92493

    .line 144
    .line 145
    .line 146
    and-int v13, v3, v16

    .line 147
    .line 148
    const v14, 0x92492

    .line 149
    .line 150
    .line 151
    if-eq v13, v14, :cond_e

    .line 152
    .line 153
    move v13, v15

    .line 154
    goto :goto_9

    .line 155
    :cond_e
    const/4 v13, 0x0

    .line 156
    :goto_9
    and-int/lit8 v14, v3, 0x1

    .line 157
    .line 158
    invoke-virtual {v0, v14, v13}, La/fet;->U(IZ)Z

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    if-eqz v13, :cond_21

    .line 163
    .line 164
    invoke-virtual {v0}, La/fet;->Z()V

    .line 165
    .line 166
    .line 167
    and-int/lit8 v13, v12, 0x1

    .line 168
    .line 169
    if-eqz v13, :cond_10

    .line 170
    .line 171
    invoke-virtual {v0}, La/fet;->B()Z

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    if-eqz v13, :cond_f

    .line 176
    .line 177
    goto :goto_a

    .line 178
    :cond_f
    invoke-virtual {v0}, La/fet;->X()V

    .line 179
    .line 180
    .line 181
    :cond_10
    :goto_a
    invoke-virtual {v0}, La/fet;->s()V

    .line 182
    .line 183
    .line 184
    and-int/lit8 v13, v3, 0xe

    .line 185
    .line 186
    if-ne v13, v4, :cond_11

    .line 187
    .line 188
    move v4, v15

    .line 189
    goto :goto_b

    .line 190
    :cond_11
    const/4 v4, 0x0

    .line 191
    :goto_b
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v13

    .line 195
    sget-object v14, La/ukd;->a:La/cl5;

    .line 196
    .line 197
    if-nez v4, :cond_12

    .line 198
    .line 199
    if-ne v13, v14, :cond_13

    .line 200
    .line 201
    :cond_12
    new-instance v13, La/l3c0;

    .line 202
    .line 203
    invoke-direct {v13, v1, v15}, La/l3c0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_13
    move-object v4, v13

    .line 210
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 211
    .line 212
    sget-object v13, La/bmd;->h:La/zfn;

    .line 213
    .line 214
    invoke-virtual {v0, v13}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v13

    .line 218
    check-cast v13, La/w6k;

    .line 219
    .line 220
    new-instance v17, La/vtm0;

    .line 221
    .line 222
    invoke-interface {v13, v6}, La/w6k;->w0(F)F

    .line 223
    .line 224
    .line 225
    move-result v18

    .line 226
    const/16 v22, 0x0

    .line 227
    .line 228
    const/16 v23, 0x1a

    .line 229
    .line 230
    const/16 v19, 0x0

    .line 231
    .line 232
    const/16 v20, 0x1

    .line 233
    .line 234
    const/16 v21, 0x0

    .line 235
    .line 236
    invoke-direct/range {v17 .. v23}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 237
    .line 238
    .line 239
    move-object/from16 v13, v17

    .line 240
    .line 241
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v17

    .line 245
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    if-nez v17, :cond_14

    .line 250
    .line 251
    if-ne v9, v14, :cond_15

    .line 252
    .line 253
    :cond_14
    new-instance v9, La/r3w;

    .line 254
    .line 255
    const/16 v15, 0x14

    .line 256
    .line 257
    invoke-direct {v9, v4, v15}, La/r3w;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    :cond_15
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 264
    .line 265
    const/4 v15, 0x1

    .line 266
    invoke-static {v2, v15, v9}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    const/high16 v15, 0x42200000    # 40.0f

    .line 271
    .line 272
    invoke-static {v9, v15}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 273
    .line 274
    .line 275
    move-result-object v15

    .line 276
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    const/high16 v19, 0x70000

    .line 281
    .line 282
    and-int v1, v3, v19

    .line 283
    .line 284
    const/high16 v2, 0x20000

    .line 285
    .line 286
    if-ne v1, v2, :cond_16

    .line 287
    .line 288
    const/4 v1, 0x1

    .line 289
    goto :goto_c

    .line 290
    :cond_16
    const/4 v1, 0x0

    .line 291
    :goto_c
    or-int/2addr v1, v9

    .line 292
    const/high16 v2, 0x380000

    .line 293
    .line 294
    and-int/2addr v2, v3

    .line 295
    const/high16 v9, 0x100000

    .line 296
    .line 297
    if-ne v2, v9, :cond_17

    .line 298
    .line 299
    const/4 v2, 0x1

    .line 300
    goto :goto_d

    .line 301
    :cond_17
    const/4 v2, 0x0

    .line 302
    :goto_d
    or-int/2addr v1, v2

    .line 303
    and-int/lit16 v2, v3, 0x1c00

    .line 304
    .line 305
    const/16 v9, 0x800

    .line 306
    .line 307
    if-ne v2, v9, :cond_18

    .line 308
    .line 309
    const/4 v2, 0x1

    .line 310
    goto :goto_e

    .line 311
    :cond_18
    const/4 v2, 0x0

    .line 312
    :goto_e
    or-int/2addr v1, v2

    .line 313
    const v2, 0xe000

    .line 314
    .line 315
    .line 316
    and-int/2addr v2, v3

    .line 317
    xor-int/lit16 v2, v2, 0x6000

    .line 318
    .line 319
    const/16 v9, 0x4000

    .line 320
    .line 321
    if-le v2, v9, :cond_19

    .line 322
    .line 323
    invoke-virtual {v0, v7, v8}, La/fet;->f(J)Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-nez v2, :cond_1a

    .line 328
    .line 329
    :cond_19
    and-int/lit16 v2, v3, 0x6000

    .line 330
    .line 331
    if-ne v2, v9, :cond_1b

    .line 332
    .line 333
    :cond_1a
    const/4 v2, 0x1

    .line 334
    goto :goto_f

    .line 335
    :cond_1b
    const/4 v2, 0x0

    .line 336
    :goto_f
    or-int/2addr v1, v2

    .line 337
    invoke-virtual {v0, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    or-int/2addr v1, v2

    .line 342
    and-int/lit16 v2, v3, 0x380

    .line 343
    .line 344
    xor-int/lit16 v2, v2, 0x180

    .line 345
    .line 346
    const/16 v9, 0x100

    .line 347
    .line 348
    if-le v2, v9, :cond_1c

    .line 349
    .line 350
    invoke-virtual {v0, v10, v11}, La/fet;->f(J)Z

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    if-nez v2, :cond_1d

    .line 355
    .line 356
    :cond_1c
    and-int/lit16 v2, v3, 0x180

    .line 357
    .line 358
    if-ne v2, v9, :cond_1e

    .line 359
    .line 360
    :cond_1d
    const/16 v17, 0x1

    .line 361
    .line 362
    goto :goto_10

    .line 363
    :cond_1e
    const/16 v17, 0x0

    .line 364
    .line 365
    :goto_10
    or-int v1, v1, v17

    .line 366
    .line 367
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    if-nez v1, :cond_20

    .line 372
    .line 373
    if-ne v2, v14, :cond_1f

    .line 374
    .line 375
    goto :goto_11

    .line 376
    :cond_1f
    const/4 v1, 0x0

    .line 377
    goto :goto_12

    .line 378
    :cond_20
    :goto_11
    new-instance v3, La/n3c0;

    .line 379
    .line 380
    move-object v9, v13

    .line 381
    const/4 v1, 0x0

    .line 382
    invoke-direct/range {v3 .. v11}, La/n3c0;-><init>(Lkotlin/jvm/functions/Function0;FFJLa/vtm0;J)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    move-object v2, v3

    .line 389
    :goto_12
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 390
    .line 391
    invoke-static {v15, v2, v0, v1}, La/p8a;->k(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 392
    .line 393
    .line 394
    goto :goto_13

    .line 395
    :cond_21
    invoke-virtual {v0}, La/fet;->X()V

    .line 396
    .line 397
    .line 398
    :goto_13
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    if-eqz v10, :cond_22

    .line 403
    .line 404
    new-instance v0, La/ou50;

    .line 405
    .line 406
    move-object/from16 v1, p0

    .line 407
    .line 408
    move-object/from16 v2, p1

    .line 409
    .line 410
    move-wide/from16 v3, p2

    .line 411
    .line 412
    move/from16 v5, p4

    .line 413
    .line 414
    move-wide/from16 v6, p5

    .line 415
    .line 416
    move/from16 v8, p7

    .line 417
    .line 418
    move v9, v12

    .line 419
    invoke-direct/range {v0 .. v9}, La/ou50;-><init>(Lkotlin/jvm/functions/Function0;La/mm40;JFJFI)V

    .line 420
    .line 421
    .line 422
    iput-object v0, v10, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 423
    .line 424
    :cond_22
    return-void
.end method

.method public static final c(Lkotlin/jvm/functions/Function0;La/mm40;JJIFLkotlin/jvm/functions/Function1;La/fet;II)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v9, p2

    .line 6
    .line 7
    move-wide/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v0, p9

    .line 10
    .line 11
    const v3, -0x144387f6

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v3}, La/fet;->g0(I)La/fet;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x4

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    move v3, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v3, 0x2

    .line 27
    :goto_0
    or-int v3, p10, v3

    .line 28
    .line 29
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-eqz v7, :cond_1

    .line 34
    .line 35
    const/16 v7, 0x20

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v7, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v3, v7

    .line 41
    invoke-virtual {v0, v9, v10}, La/fet;->f(J)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-eqz v7, :cond_2

    .line 46
    .line 47
    const/16 v7, 0x100

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v7, 0x80

    .line 51
    .line 52
    :goto_2
    or-int/2addr v3, v7

    .line 53
    invoke-virtual {v0, v5, v6}, La/fet;->f(J)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_3

    .line 58
    .line 59
    const/16 v7, 0x800

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    const/16 v7, 0x400

    .line 63
    .line 64
    :goto_3
    or-int/2addr v3, v7

    .line 65
    and-int/lit8 v7, p11, 0x10

    .line 66
    .line 67
    if-eqz v7, :cond_4

    .line 68
    .line 69
    or-int/lit16 v3, v3, 0x6000

    .line 70
    .line 71
    move/from16 v13, p6

    .line 72
    .line 73
    :goto_4
    move/from16 v14, p7

    .line 74
    .line 75
    goto :goto_6

    .line 76
    :cond_4
    move/from16 v13, p6

    .line 77
    .line 78
    invoke-virtual {v0, v13}, La/fet;->e(I)Z

    .line 79
    .line 80
    .line 81
    move-result v14

    .line 82
    if-eqz v14, :cond_5

    .line 83
    .line 84
    const/16 v14, 0x4000

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_5
    const/16 v14, 0x2000

    .line 88
    .line 89
    :goto_5
    or-int/2addr v3, v14

    .line 90
    goto :goto_4

    .line 91
    :goto_6
    invoke-virtual {v0, v14}, La/fet;->d(F)Z

    .line 92
    .line 93
    .line 94
    move-result v15

    .line 95
    if-eqz v15, :cond_6

    .line 96
    .line 97
    const/high16 v15, 0x20000

    .line 98
    .line 99
    goto :goto_7

    .line 100
    :cond_6
    const/high16 v15, 0x10000

    .line 101
    .line 102
    :goto_7
    or-int/2addr v3, v15

    .line 103
    const v15, 0x92493

    .line 104
    .line 105
    .line 106
    and-int/2addr v15, v3

    .line 107
    const v11, 0x92492

    .line 108
    .line 109
    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v12, 0x1

    .line 112
    if-eq v15, v11, :cond_7

    .line 113
    .line 114
    move v11, v12

    .line 115
    goto :goto_8

    .line 116
    :cond_7
    move v11, v8

    .line 117
    :goto_8
    and-int/lit8 v15, v3, 0x1

    .line 118
    .line 119
    invoke-virtual {v0, v15, v11}, La/fet;->U(IZ)Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-eqz v11, :cond_1a

    .line 124
    .line 125
    invoke-virtual {v0}, La/fet;->Z()V

    .line 126
    .line 127
    .line 128
    and-int/lit8 v11, p10, 0x1

    .line 129
    .line 130
    if-eqz v11, :cond_9

    .line 131
    .line 132
    invoke-virtual {v0}, La/fet;->B()Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-eqz v11, :cond_8

    .line 137
    .line 138
    goto :goto_9

    .line 139
    :cond_8
    invoke-virtual {v0}, La/fet;->X()V

    .line 140
    .line 141
    .line 142
    goto :goto_a

    .line 143
    :cond_9
    :goto_9
    if-eqz v7, :cond_a

    .line 144
    .line 145
    move v13, v12

    .line 146
    :cond_a
    :goto_a
    invoke-virtual {v0}, La/fet;->s()V

    .line 147
    .line 148
    .line 149
    and-int/lit8 v7, v3, 0xe

    .line 150
    .line 151
    if-ne v7, v4, :cond_b

    .line 152
    .line 153
    move v4, v12

    .line 154
    goto :goto_b

    .line 155
    :cond_b
    move v4, v8

    .line 156
    :goto_b
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    sget-object v11, La/ukd;->a:La/cl5;

    .line 161
    .line 162
    if-nez v4, :cond_c

    .line 163
    .line 164
    if-ne v7, v11, :cond_d

    .line 165
    .line 166
    :cond_c
    new-instance v7, La/l3c0;

    .line 167
    .line 168
    invoke-direct {v7, v1, v8}, La/l3c0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_d
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 175
    .line 176
    sget-object v4, La/o7;->a:La/mm40;

    .line 177
    .line 178
    invoke-interface {v2, v4}, La/mm40;->e(La/mm40;)La/mm40;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v0, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    if-nez v15, :cond_e

    .line 191
    .line 192
    if-ne v8, v11, :cond_f

    .line 193
    .line 194
    :cond_e
    new-instance v8, La/r3w;

    .line 195
    .line 196
    const/16 v15, 0x13

    .line 197
    .line 198
    invoke-direct {v8, v7, v15}, La/r3w;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_f
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 205
    .line 206
    invoke-static {v4, v12, v8}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    const/high16 v8, 0x43700000    # 240.0f

    .line 211
    .line 212
    const/high16 v15, 0x40800000    # 4.0f

    .line 213
    .line 214
    invoke-static {v4, v8, v15}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 215
    .line 216
    .line 217
    move-result-object v15

    .line 218
    const v4, 0xe000

    .line 219
    .line 220
    .line 221
    and-int/2addr v4, v3

    .line 222
    const/16 v8, 0x4000

    .line 223
    .line 224
    if-ne v4, v8, :cond_10

    .line 225
    .line 226
    move v4, v12

    .line 227
    goto :goto_c

    .line 228
    :cond_10
    const/4 v4, 0x0

    .line 229
    :goto_c
    const/high16 v8, 0x70000

    .line 230
    .line 231
    and-int/2addr v8, v3

    .line 232
    const/high16 v12, 0x20000

    .line 233
    .line 234
    if-ne v8, v12, :cond_11

    .line 235
    .line 236
    const/4 v8, 0x1

    .line 237
    goto :goto_d

    .line 238
    :cond_11
    const/4 v8, 0x0

    .line 239
    :goto_d
    or-int/2addr v4, v8

    .line 240
    invoke-virtual {v0, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    or-int/2addr v4, v8

    .line 245
    and-int/lit16 v8, v3, 0x1c00

    .line 246
    .line 247
    xor-int/lit16 v8, v8, 0xc00

    .line 248
    .line 249
    const/16 v12, 0x800

    .line 250
    .line 251
    if-le v8, v12, :cond_12

    .line 252
    .line 253
    invoke-virtual {v0, v5, v6}, La/fet;->f(J)Z

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    if-nez v8, :cond_13

    .line 258
    .line 259
    :cond_12
    and-int/lit16 v8, v3, 0xc00

    .line 260
    .line 261
    if-ne v8, v12, :cond_14

    .line 262
    .line 263
    :cond_13
    const/4 v8, 0x1

    .line 264
    goto :goto_e

    .line 265
    :cond_14
    const/4 v8, 0x0

    .line 266
    :goto_e
    or-int/2addr v4, v8

    .line 267
    and-int/lit16 v8, v3, 0x380

    .line 268
    .line 269
    xor-int/lit16 v8, v8, 0x180

    .line 270
    .line 271
    const/16 v12, 0x100

    .line 272
    .line 273
    if-le v8, v12, :cond_15

    .line 274
    .line 275
    invoke-virtual {v0, v9, v10}, La/fet;->f(J)Z

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    if-nez v8, :cond_16

    .line 280
    .line 281
    :cond_15
    and-int/lit16 v3, v3, 0x180

    .line 282
    .line 283
    if-ne v3, v12, :cond_17

    .line 284
    .line 285
    :cond_16
    const/4 v12, 0x1

    .line 286
    goto :goto_f

    .line 287
    :cond_17
    const/4 v12, 0x0

    .line 288
    :goto_f
    or-int v3, v4, v12

    .line 289
    .line 290
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    if-nez v3, :cond_19

    .line 295
    .line 296
    if-ne v4, v11, :cond_18

    .line 297
    .line 298
    goto :goto_10

    .line 299
    :cond_18
    move-object v3, v4

    .line 300
    move v4, v13

    .line 301
    const/4 v12, 0x0

    .line 302
    goto :goto_11

    .line 303
    :cond_19
    :goto_10
    new-instance v3, La/glw;

    .line 304
    .line 305
    move-wide v11, v5

    .line 306
    move-object v6, v7

    .line 307
    move-wide v7, v11

    .line 308
    move-object/from16 v11, p8

    .line 309
    .line 310
    move v4, v13

    .line 311
    move v5, v14

    .line 312
    const/4 v12, 0x0

    .line 313
    invoke-direct/range {v3 .. v11}, La/glw;-><init>(IFLkotlin/jvm/functions/Function0;JJLkotlin/jvm/functions/Function1;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    :goto_11
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 320
    .line 321
    invoke-static {v15, v3, v0, v12}, La/p8a;->k(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 322
    .line 323
    .line 324
    move v7, v4

    .line 325
    goto :goto_12

    .line 326
    :cond_1a
    invoke-virtual {v0}, La/fet;->X()V

    .line 327
    .line 328
    .line 329
    move v7, v13

    .line 330
    :goto_12
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 331
    .line 332
    .line 333
    move-result-object v12

    .line 334
    if-eqz v12, :cond_1b

    .line 335
    .line 336
    new-instance v0, La/m3c0;

    .line 337
    .line 338
    move-wide/from16 v3, p2

    .line 339
    .line 340
    move-wide/from16 v5, p4

    .line 341
    .line 342
    move/from16 v8, p7

    .line 343
    .line 344
    move-object/from16 v9, p8

    .line 345
    .line 346
    move/from16 v10, p10

    .line 347
    .line 348
    move/from16 v11, p11

    .line 349
    .line 350
    invoke-direct/range {v0 .. v11}, La/m3c0;-><init>(Lkotlin/jvm/functions/Function0;La/mm40;JJIFLkotlin/jvm/functions/Function1;II)V

    .line 351
    .line 352
    .line 353
    iput-object v0, v12, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 354
    .line 355
    :cond_1b
    return-void
.end method

.method public static final d(La/fhl;FFJLa/vtm0;)V
    .locals 12

    .line 1
    move-object/from16 v10, p5

    .line 2
    .line 3
    iget v0, v10, La/vtm0;->a:F

    .line 4
    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    div-float/2addr v0, v1

    .line 8
    invoke-interface {p0}, La/fhl;->d()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const/16 v4, 0x20

    .line 13
    .line 14
    shr-long/2addr v2, v4

    .line 15
    long-to-int v2, v2

    .line 16
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    mul-float/2addr v1, v0

    .line 21
    sub-float/2addr v2, v1

    .line 22
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-long v5, v1

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-long v0, v0

    .line 32
    shl-long/2addr v5, v4

    .line 33
    const-wide v7, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v0, v7

    .line 39
    or-long/2addr v5, v0

    .line 40
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    int-to-long v0, v0

    .line 45
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    int-to-long v2, v2

    .line 50
    shl-long/2addr v0, v4

    .line 51
    and-long/2addr v2, v7

    .line 52
    or-long v7, v0, v2

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    const/16 v11, 0x340

    .line 56
    .line 57
    move-object v0, p0

    .line 58
    move v3, p1

    .line 59
    move v4, p2

    .line 60
    move-wide v1, p3

    .line 61
    invoke-static/range {v0 .. v11}, La/fhl;->V(La/fhl;JFFJJFLa/agc;I)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static final e(La/fhl;FFJFI)V
    .locals 22

    .line 1
    invoke-interface/range {p0 .. p0}, La/fhl;->d()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-interface/range {p0 .. p0}, La/fhl;->d()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const-wide v5, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v3, v5

    .line 23
    long-to-int v1, v3

    .line 24
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/high16 v3, 0x40000000    # 2.0f

    .line 29
    .line 30
    div-float v4, v1, v3

    .line 31
    .line 32
    invoke-interface/range {p0 .. p0}, La/fhl;->getLayoutDirection()La/k6z;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    sget-object v8, La/k6z;->a:La/k6z;

    .line 37
    .line 38
    if-ne v7, v8, :cond_0

    .line 39
    .line 40
    const/4 v7, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v7, 0x0

    .line 43
    :goto_0
    const/high16 v8, 0x3f800000    # 1.0f

    .line 44
    .line 45
    if-eqz v7, :cond_1

    .line 46
    .line 47
    move/from16 v9, p1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    sub-float v9, v8, p2

    .line 51
    .line 52
    :goto_1
    mul-float/2addr v9, v0

    .line 53
    if-eqz v7, :cond_2

    .line 54
    .line 55
    move/from16 v8, p2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    sub-float v8, v8, p1

    .line 59
    .line 60
    :goto_2
    mul-float/2addr v8, v0

    .line 61
    if-nez p6, :cond_3

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    cmpl-float v1, v1, v0

    .line 65
    .line 66
    if-lez v1, :cond_4

    .line 67
    .line 68
    :goto_3
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    int-to-long v0, v0

    .line 73
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    int-to-long v9, v3

    .line 78
    shl-long/2addr v0, v2

    .line 79
    and-long/2addr v9, v5

    .line 80
    or-long v14, v0, v9

    .line 81
    .line 82
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    int-to-long v0, v0

    .line 87
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    int-to-long v3, v3

    .line 92
    shl-long/2addr v0, v2

    .line 93
    and-long v2, v3, v5

    .line 94
    .line 95
    or-long v16, v0, v2

    .line 96
    .line 97
    const/16 v20, 0x0

    .line 98
    .line 99
    const/16 v21, 0x1f0

    .line 100
    .line 101
    const/16 v19, 0x0

    .line 102
    .line 103
    move-object/from16 v11, p0

    .line 104
    .line 105
    move-wide/from16 v12, p3

    .line 106
    .line 107
    move/from16 v18, p5

    .line 108
    .line 109
    invoke-static/range {v11 .. v21}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_4
    div-float v1, p5, v3

    .line 114
    .line 115
    sub-float/2addr v0, v1

    .line 116
    cmpg-float v3, v9, v1

    .line 117
    .line 118
    if-gez v3, :cond_5

    .line 119
    .line 120
    move v9, v1

    .line 121
    :cond_5
    cmpl-float v3, v9, v0

    .line 122
    .line 123
    if-lez v3, :cond_6

    .line 124
    .line 125
    move v9, v0

    .line 126
    :cond_6
    cmpg-float v3, v8, v1

    .line 127
    .line 128
    if-gez v3, :cond_7

    .line 129
    .line 130
    move v8, v1

    .line 131
    :cond_7
    cmpl-float v1, v8, v0

    .line 132
    .line 133
    if-lez v1, :cond_8

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_8
    move v0, v8

    .line 137
    :goto_4
    sub-float v1, p2, p1

    .line 138
    .line 139
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    const/4 v3, 0x0

    .line 144
    cmpl-float v1, v1, v3

    .line 145
    .line 146
    if-lez v1, :cond_9

    .line 147
    .line 148
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    int-to-long v7, v1

    .line 153
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    int-to-long v9, v1

    .line 158
    shl-long/2addr v7, v2

    .line 159
    and-long/2addr v9, v5

    .line 160
    or-long/2addr v7, v9

    .line 161
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    int-to-long v0, v0

    .line 166
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    int-to-long v3, v3

    .line 171
    shl-long/2addr v0, v2

    .line 172
    and-long v2, v3, v5

    .line 173
    .line 174
    or-long v5, v0, v2

    .line 175
    .line 176
    const/4 v9, 0x0

    .line 177
    const/16 v10, 0x1e0

    .line 178
    .line 179
    move-object/from16 v0, p0

    .line 180
    .line 181
    move-wide/from16 v1, p3

    .line 182
    .line 183
    move-wide v3, v7

    .line 184
    move/from16 v7, p5

    .line 185
    .line 186
    move/from16 v8, p6

    .line 187
    .line 188
    invoke-static/range {v0 .. v10}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 189
    .line 190
    .line 191
    :cond_9
    return-void
.end method
