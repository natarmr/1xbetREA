.class public abstract La/n5n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x42500000    # 52.0f

    .line 4
    .line 5
    sput v0, La/n5n;->a:F

    .line 6
    .line 7
    const/high16 v0, 0x42400000    # 48.0f

    .line 8
    .line 9
    sput v0, La/n5n;->b:F

    .line 10
    .line 11
    const/high16 v0, 0x41c00000    # 24.0f

    .line 12
    .line 13
    sput v0, La/n5n;->c:F

    .line 14
    .line 15
    const/high16 v0, 0x40800000    # 4.0f

    .line 16
    .line 17
    sput v0, La/n5n;->d:F

    .line 18
    .line 19
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    double-to-float v0, v0

    .line 29
    const/high16 v1, 0x40000000    # 2.0f

    .line 30
    .line 31
    mul-float/2addr v0, v1

    .line 32
    const/high16 v1, 0x42200000    # 40.0f

    .line 33
    .line 34
    div-float/2addr v1, v0

    .line 35
    sput v1, La/n5n;->e:F

    .line 36
    .line 37
    return-void
.end method

.method public static final a(La/mm40;ZLa/l5n;ZLa/gy40;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v8, p4

    .line 10
    .line 11
    move-object/from16 v9, p5

    .line 12
    .line 13
    move-object/from16 v10, p6

    .line 14
    .line 15
    move/from16 v11, p7

    .line 16
    .line 17
    const v3, -0x8b999cd

    .line 18
    .line 19
    .line 20
    invoke-virtual {v10, v3}, La/fet;->g0(I)La/fet;

    .line 21
    .line 22
    .line 23
    and-int/lit8 v3, v11, 0x6

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v3, v5

    .line 37
    :goto_0
    or-int/2addr v3, v11

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v3, v11

    .line 40
    :goto_1
    and-int/lit8 v6, v11, 0x30

    .line 41
    .line 42
    if-nez v6, :cond_3

    .line 43
    .line 44
    invoke-virtual {v10, v2}, La/fet;->h(Z)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    const/16 v6, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v6, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v3, v6

    .line 56
    :cond_3
    and-int/lit16 v6, v11, 0x180

    .line 57
    .line 58
    if-nez v6, :cond_6

    .line 59
    .line 60
    and-int/lit16 v6, v11, 0x200

    .line 61
    .line 62
    if-nez v6, :cond_4

    .line 63
    .line 64
    invoke-virtual {v10, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    invoke-virtual {v10, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    :goto_3
    if-eqz v6, :cond_5

    .line 74
    .line 75
    const/16 v6, 0x100

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_5
    const/16 v6, 0x80

    .line 79
    .line 80
    :goto_4
    or-int/2addr v3, v6

    .line 81
    :cond_6
    and-int/lit16 v6, v11, 0xc00

    .line 82
    .line 83
    if-nez v6, :cond_8

    .line 84
    .line 85
    invoke-virtual {v10, v4}, La/fet;->h(Z)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-eqz v6, :cond_7

    .line 90
    .line 91
    const/16 v6, 0x800

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_7
    const/16 v6, 0x400

    .line 95
    .line 96
    :goto_5
    or-int/2addr v3, v6

    .line 97
    :cond_8
    and-int/lit16 v6, v11, 0x6000

    .line 98
    .line 99
    if-nez v6, :cond_a

    .line 100
    .line 101
    invoke-virtual {v10, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_9

    .line 106
    .line 107
    const/16 v6, 0x4000

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_9
    const/16 v6, 0x2000

    .line 111
    .line 112
    :goto_6
    or-int/2addr v3, v6

    .line 113
    :cond_a
    const/high16 v6, 0x30000

    .line 114
    .line 115
    and-int/2addr v6, v11

    .line 116
    const/high16 v7, 0x20000

    .line 117
    .line 118
    if-nez v6, :cond_c

    .line 119
    .line 120
    invoke-virtual {v10, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_b

    .line 125
    .line 126
    move v6, v7

    .line 127
    goto :goto_7

    .line 128
    :cond_b
    const/high16 v6, 0x10000

    .line 129
    .line 130
    :goto_7
    or-int/2addr v3, v6

    .line 131
    :cond_c
    const v6, 0x12493

    .line 132
    .line 133
    .line 134
    and-int/2addr v6, v3

    .line 135
    const v14, 0x12492

    .line 136
    .line 137
    .line 138
    const/4 v15, 0x0

    .line 139
    const/16 v16, 0x20

    .line 140
    .line 141
    if-eq v6, v14, :cond_d

    .line 142
    .line 143
    const/4 v6, 0x1

    .line 144
    goto :goto_8

    .line 145
    :cond_d
    move v6, v15

    .line 146
    :goto_8
    and-int/lit8 v14, v3, 0x1

    .line 147
    .line 148
    invoke-virtual {v10, v14, v6}, La/fet;->U(IZ)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_22

    .line 153
    .line 154
    sget-object v6, La/bmd;->l:La/zfn;

    .line 155
    .line 156
    invoke-virtual {v10, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    check-cast v6, La/omv;

    .line 161
    .line 162
    sget-object v14, La/ukd;->a:La/cl5;

    .line 163
    .line 164
    if-nez v8, :cond_f

    .line 165
    .line 166
    const v13, -0x568bd0b8

    .line 167
    .line 168
    .line 169
    invoke-virtual {v10, v13}, La/fet;->e0(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v13

    .line 176
    if-ne v13, v14, :cond_e

    .line 177
    .line 178
    invoke-static {v10}, La/dw9;->j(La/fet;)La/gy40;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    :cond_e
    check-cast v13, La/gy40;

    .line 183
    .line 184
    invoke-virtual {v10, v15}, La/fet;->r(Z)V

    .line 185
    .line 186
    .line 187
    goto :goto_9

    .line 188
    :cond_f
    const v13, 0x3f45cd6f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v10, v13}, La/fet;->e0(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v10, v15}, La/fet;->r(Z)V

    .line 195
    .line 196
    .line 197
    move-object v13, v8

    .line 198
    :goto_9
    sget-object v2, La/jm40;->b:La/jm40;

    .line 199
    .line 200
    if-eqz v9, :cond_13

    .line 201
    .line 202
    const v12, -0x5689cc9e

    .line 203
    .line 204
    .line 205
    invoke-virtual {v10, v12}, La/fet;->e0(I)V

    .line 206
    .line 207
    .line 208
    new-instance v12, La/ucg0;

    .line 209
    .line 210
    invoke-direct {v12, v5}, La/ucg0;-><init>(I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v10, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    const/high16 v19, 0x70000

    .line 218
    .line 219
    and-int v3, v3, v19

    .line 220
    .line 221
    if-ne v3, v7, :cond_10

    .line 222
    .line 223
    const/4 v3, 0x1

    .line 224
    goto :goto_a

    .line 225
    :cond_10
    move v3, v15

    .line 226
    :goto_a
    or-int/2addr v3, v5

    .line 227
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    if-nez v3, :cond_11

    .line 232
    .line 233
    if-ne v5, v14, :cond_12

    .line 234
    .line 235
    :cond_11
    new-instance v5, La/dpl;

    .line 236
    .line 237
    const/16 v3, 0x15

    .line 238
    .line 239
    invoke-direct {v5, v6, v9, v3}, La/dpl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v10, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_12
    move-object v7, v5

    .line 246
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 247
    .line 248
    move/from16 v3, p1

    .line 249
    .line 250
    move v5, v4

    .line 251
    move-object v6, v12

    .line 252
    move-object v4, v13

    .line 253
    invoke-static/range {v2 .. v7}, La/lv00;->Y(La/mm40;ZLa/gy40;ZLa/ucg0;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    move-object v12, v2

    .line 258
    invoke-virtual {v10, v15}, La/fet;->r(Z)V

    .line 259
    .line 260
    .line 261
    move-object v2, v6

    .line 262
    goto :goto_b

    .line 263
    :cond_13
    move-object v12, v2

    .line 264
    const v2, -0x56817049

    .line 265
    .line 266
    .line 267
    invoke-virtual {v10, v2}, La/fet;->e0(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v10, v15}, La/fet;->r(Z)V

    .line 271
    .line 272
    .line 273
    move-object v2, v12

    .line 274
    :goto_b
    if-eqz p3, :cond_15

    .line 275
    .line 276
    const v3, -0x5837d8b8

    .line 277
    .line 278
    .line 279
    invoke-virtual {v10, v3}, La/fet;->e0(I)V

    .line 280
    .line 281
    .line 282
    if-eqz p1, :cond_14

    .line 283
    .line 284
    iget-wide v3, v0, La/l5n;->a:J

    .line 285
    .line 286
    goto :goto_c

    .line 287
    :cond_14
    iget-wide v3, v0, La/l5n;->b:J

    .line 288
    .line 289
    :goto_c
    const/4 v6, 0x0

    .line 290
    const/16 v7, 0xe

    .line 291
    .line 292
    move-object v5, v2

    .line 293
    move-wide v2, v3

    .line 294
    const/4 v4, 0x0

    .line 295
    move-object/from16 v23, v10

    .line 296
    .line 297
    move-object v10, v5

    .line 298
    move-object/from16 v5, v23

    .line 299
    .line 300
    invoke-static/range {v2 .. v7}, La/m5k0;->b(JLa/j73;La/fet;II)La/l7m0;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-virtual {v5, v15}, La/fet;->r(Z)V

    .line 305
    .line 306
    .line 307
    goto :goto_e

    .line 308
    :cond_15
    move-object v5, v10

    .line 309
    move-object v10, v2

    .line 310
    const v2, -0x583591c6

    .line 311
    .line 312
    .line 313
    invoke-virtual {v5, v2}, La/fet;->e0(I)V

    .line 314
    .line 315
    .line 316
    if-eqz p1, :cond_16

    .line 317
    .line 318
    iget-wide v2, v0, La/l5n;->e:J

    .line 319
    .line 320
    goto :goto_d

    .line 321
    :cond_16
    iget-wide v2, v0, La/l5n;->f:J

    .line 322
    .line 323
    :goto_d
    new-instance v4, La/y3d;

    .line 324
    .line 325
    invoke-direct {v4, v2, v3}, La/y3d;-><init>(J)V

    .line 326
    .line 327
    .line 328
    invoke-static {v4, v5}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    invoke-virtual {v5, v15}, La/fet;->r(Z)V

    .line 333
    .line 334
    .line 335
    :goto_e
    if-eqz p3, :cond_18

    .line 336
    .line 337
    const v3, 0x6431db3d

    .line 338
    .line 339
    .line 340
    invoke-virtual {v5, v3}, La/fet;->e0(I)V

    .line 341
    .line 342
    .line 343
    if-eqz p1, :cond_17

    .line 344
    .line 345
    iget-wide v3, v0, La/l5n;->c:J

    .line 346
    .line 347
    goto :goto_f

    .line 348
    :cond_17
    iget-wide v3, v0, La/l5n;->d:J

    .line 349
    .line 350
    :goto_f
    const/4 v6, 0x0

    .line 351
    const/16 v7, 0xe

    .line 352
    .line 353
    move-object/from16 v19, v2

    .line 354
    .line 355
    move-wide v2, v3

    .line 356
    const/4 v4, 0x0

    .line 357
    move-object/from16 v20, v19

    .line 358
    .line 359
    invoke-static/range {v2 .. v7}, La/m5k0;->b(JLa/j73;La/fet;II)La/l7m0;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-virtual {v5, v15}, La/fet;->r(Z)V

    .line 364
    .line 365
    .line 366
    goto :goto_11

    .line 367
    :cond_18
    move-object/from16 v20, v2

    .line 368
    .line 369
    const v2, 0x643429ef

    .line 370
    .line 371
    .line 372
    invoke-virtual {v5, v2}, La/fet;->e0(I)V

    .line 373
    .line 374
    .line 375
    if-eqz p1, :cond_19

    .line 376
    .line 377
    iget-wide v2, v0, La/l5n;->g:J

    .line 378
    .line 379
    goto :goto_10

    .line 380
    :cond_19
    iget-wide v2, v0, La/l5n;->h:J

    .line 381
    .line 382
    :goto_10
    new-instance v4, La/y3d;

    .line 383
    .line 384
    invoke-direct {v4, v2, v3}, La/y3d;-><init>(J)V

    .line 385
    .line 386
    .line 387
    invoke-static {v4, v5}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v5, v15}, La/fet;->r(Z)V

    .line 392
    .line 393
    .line 394
    :goto_11
    sget-object v3, La/bmd;->h:La/zfn;

    .line 395
    .line 396
    invoke-virtual {v5, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    check-cast v3, La/w6k;

    .line 401
    .line 402
    sget v4, La/n5n;->a:F

    .line 403
    .line 404
    sget v6, La/n5n;->c:F

    .line 405
    .line 406
    sub-float v7, v4, v6

    .line 407
    .line 408
    const/high16 v19, 0x40000000    # 2.0f

    .line 409
    .line 410
    move-object/from16 v21, v13

    .line 411
    .line 412
    sget v13, La/n5n;->d:F

    .line 413
    .line 414
    mul-float v19, v19, v13

    .line 415
    .line 416
    sub-float v7, v7, v19

    .line 417
    .line 418
    invoke-interface {v3, v7}, La/w6k;->T(F)I

    .line 419
    .line 420
    .line 421
    move-result v3

    .line 422
    if-eqz p1, :cond_1a

    .line 423
    .line 424
    int-to-long v7, v3

    .line 425
    shl-long v7, v7, v16

    .line 426
    .line 427
    goto :goto_12

    .line 428
    :cond_1a
    const-wide/16 v7, 0x0

    .line 429
    .line 430
    :goto_12
    sget v3, La/n5n;->e:F

    .line 431
    .line 432
    const/high16 v15, 0x447a0000    # 1000.0f

    .line 433
    .line 434
    const/4 v0, 0x0

    .line 435
    const/4 v5, 0x4

    .line 436
    invoke-static {v3, v15, v0, v5}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    sget-object v3, La/d43;->a:La/nul0;

    .line 441
    .line 442
    move-object v3, v10

    .line 443
    new-instance v10, La/ikx;

    .line 444
    .line 445
    invoke-direct {v10, v7, v8}, La/ikx;-><init>(J)V

    .line 446
    .line 447
    .line 448
    sget-object v11, La/hp4;->p:La/lxs0;

    .line 449
    .line 450
    const/4 v7, 0x1

    .line 451
    const/16 v17, 0x180

    .line 452
    .line 453
    const/16 v18, 0x8

    .line 454
    .line 455
    move v8, v13

    .line 456
    const/4 v13, 0x0

    .line 457
    move-object v15, v14

    .line 458
    const-string v14, "IntOffsetAnimation"

    .line 459
    .line 460
    move-object/from16 v19, v15

    .line 461
    .line 462
    const/4 v15, 0x0

    .line 463
    move-object v5, v12

    .line 464
    move-object v12, v0

    .line 465
    move-object v0, v5

    .line 466
    move-object/from16 v16, p6

    .line 467
    .line 468
    move v5, v7

    .line 469
    move/from16 v22, v8

    .line 470
    .line 471
    move-object/from16 v7, v19

    .line 472
    .line 473
    move-object/from16 v8, v21

    .line 474
    .line 475
    invoke-static/range {v10 .. v18}, La/d43;->c(Ljava/lang/Object;La/lxs0;La/j73;Ljava/lang/Float;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 476
    .line 477
    .line 478
    move-result-object v10

    .line 479
    move-object/from16 v11, v16

    .line 480
    .line 481
    invoke-interface {v1, v3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    invoke-static {v3, v4}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    sget v4, La/n5n;->b:F

    .line 490
    .line 491
    invoke-static {v3, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    sget-object v4, La/qmk;->a:La/zcl;

    .line 496
    .line 497
    const/high16 v4, 0x41000000    # 8.0f

    .line 498
    .line 499
    const/4 v12, 0x0

    .line 500
    invoke-static {v3, v12, v4, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    move-object/from16 v4, v20

    .line 505
    .line 506
    invoke-virtual {v11, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v12

    .line 510
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v13

    .line 514
    if-nez v12, :cond_1b

    .line 515
    .line 516
    if-ne v13, v7, :cond_1c

    .line 517
    .line 518
    :cond_1b
    new-instance v13, La/x1d;

    .line 519
    .line 520
    const/16 v12, 0x17

    .line 521
    .line 522
    invoke-direct {v13, v4, v12}, La/x1d;-><init>(La/l7m0;B)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v11, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    :cond_1c
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 529
    .line 530
    invoke-static {v3, v13}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    sget-object v4, La/gqw0;->a:La/zx7;

    .line 535
    .line 536
    const/4 v12, 0x0

    .line 537
    invoke-static {v4, v12}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 538
    .line 539
    .line 540
    move-result-object v4

    .line 541
    iget-wide v12, v11, La/fet;->T:J

    .line 542
    .line 543
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 544
    .line 545
    .line 546
    move-result v12

    .line 547
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 548
    .line 549
    .line 550
    move-result-object v13

    .line 551
    invoke-static {v11, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 552
    .line 553
    .line 554
    move-result-object v3

    .line 555
    sget-object v14, La/mkd;->c0:La/gqw0;

    .line 556
    .line 557
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v11}, La/fet;->i0()V

    .line 561
    .line 562
    .line 563
    iget-boolean v14, v11, La/fet;->S:Z

    .line 564
    .line 565
    if-eqz v14, :cond_1d

    .line 566
    .line 567
    sget-object v14, La/e7z;->u1:La/pcy;

    .line 568
    .line 569
    invoke-virtual {v11, v14}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 570
    .line 571
    .line 572
    goto :goto_13

    .line 573
    :cond_1d
    invoke-virtual {v11}, La/fet;->r0()V

    .line 574
    .line 575
    .line 576
    :goto_13
    sget-object v14, La/gqw0;->x:La/shd;

    .line 577
    .line 578
    invoke-static {v11, v4, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 579
    .line 580
    .line 581
    sget-object v4, La/gqw0;->w:La/shd;

    .line 582
    .line 583
    invoke-static {v11, v13, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 584
    .line 585
    .line 586
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    sget-object v12, La/gqw0;->y:La/shd;

    .line 591
    .line 592
    invoke-static {v11, v4, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 593
    .line 594
    .line 595
    invoke-static {v11}, La/jpm0;->n(La/fet;)V

    .line 596
    .line 597
    .line 598
    sget-object v4, La/gqw0;->v:La/shd;

    .line 599
    .line 600
    invoke-static {v11, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v11, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v3

    .line 607
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v4

    .line 611
    if-nez v3, :cond_1e

    .line 612
    .line 613
    if-ne v4, v7, :cond_1f

    .line 614
    .line 615
    :cond_1e
    new-instance v4, La/v7i0;

    .line 616
    .line 617
    const/16 v3, 0x19

    .line 618
    .line 619
    invoke-direct {v4, v10, v3}, La/v7i0;-><init>(La/l7m0;B)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v11, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    :cond_1f
    check-cast v4, La/xdr;

    .line 626
    .line 627
    invoke-static {v0, v4}, La/knx;->Q(La/mm40;La/xdr;)La/mm40;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    const/high16 v3, 0x41a00000    # 20.0f

    .line 632
    .line 633
    const/4 v4, 0x4

    .line 634
    invoke-static {v3, v4}, La/lcg0;->a(FI)La/ncg0;

    .line 635
    .line 636
    .line 637
    move-result-object v3

    .line 638
    invoke-static {v0, v8, v3}, La/a6x;->a(La/mm40;La/gy40;La/d6x;)La/mm40;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    move/from16 v8, v22

    .line 643
    .line 644
    invoke-static {v0, v8}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-static {v0, v6}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-virtual {v11, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v3

    .line 656
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v4

    .line 660
    if-nez v3, :cond_20

    .line 661
    .line 662
    if-ne v4, v7, :cond_21

    .line 663
    .line 664
    :cond_20
    new-instance v4, La/x1d;

    .line 665
    .line 666
    const/16 v3, 0x18

    .line 667
    .line 668
    invoke-direct {v4, v2, v3}, La/x1d;-><init>(La/l7m0;B)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v11, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 672
    .line 673
    .line 674
    :cond_21
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 675
    .line 676
    invoke-static {v0, v4}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    const/4 v12, 0x0

    .line 681
    invoke-static {v12, v11, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v11, v5}, La/fet;->r(Z)V

    .line 685
    .line 686
    .line 687
    goto :goto_14

    .line 688
    :cond_22
    move-object v11, v10

    .line 689
    invoke-virtual {v11}, La/fet;->X()V

    .line 690
    .line 691
    .line 692
    :goto_14
    invoke-virtual {v11}, La/fet;->u()La/yfe0;

    .line 693
    .line 694
    .line 695
    move-result-object v8

    .line 696
    if-eqz v8, :cond_23

    .line 697
    .line 698
    new-instance v0, La/ag;

    .line 699
    .line 700
    move/from16 v2, p1

    .line 701
    .line 702
    move-object/from16 v3, p2

    .line 703
    .line 704
    move/from16 v4, p3

    .line 705
    .line 706
    move-object/from16 v5, p4

    .line 707
    .line 708
    move/from16 v7, p7

    .line 709
    .line 710
    move-object v6, v9

    .line 711
    invoke-direct/range {v0 .. v7}, La/ag;-><init>(La/mm40;ZLa/l5n;ZLa/gy40;Lkotlin/jvm/functions/Function1;I)V

    .line 712
    .line 713
    .line 714
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 715
    .line 716
    :cond_23
    return-void
.end method

.method public static final b(La/mm40;ZZLa/gy40;Lkotlin/jvm/functions/Function1;La/fet;II)V
    .locals 28

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    move/from16 v8, p6

    .line 4
    .line 5
    const v0, 0x7df82c74

    .line 6
    .line 7
    .line 8
    invoke-virtual {v6, v0}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, p7, 0x1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    or-int/lit8 v1, v8, 0x6

    .line 16
    .line 17
    move v2, v1

    .line 18
    move-object/from16 v1, p0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    and-int/lit8 v1, v8, 0x6

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    move-object/from16 v1, p0

    .line 26
    .line 27
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v2, 0x2

    .line 36
    :goto_0
    or-int/2addr v2, v8

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object/from16 v1, p0

    .line 39
    .line 40
    move v2, v8

    .line 41
    :goto_1
    and-int/lit8 v3, v8, 0x30

    .line 42
    .line 43
    if-nez v3, :cond_4

    .line 44
    .line 45
    move/from16 v3, p1

    .line 46
    .line 47
    invoke-virtual {v6, v3}, La/fet;->h(Z)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_3

    .line 52
    .line 53
    const/16 v4, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    const/16 v4, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v2, v4

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move/from16 v3, p1

    .line 61
    .line 62
    :goto_3
    and-int/lit8 v4, p7, 0x4

    .line 63
    .line 64
    if-eqz v4, :cond_6

    .line 65
    .line 66
    or-int/lit16 v2, v2, 0x180

    .line 67
    .line 68
    :cond_5
    move/from16 v5, p2

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_6
    and-int/lit16 v5, v8, 0x180

    .line 72
    .line 73
    if-nez v5, :cond_5

    .line 74
    .line 75
    move/from16 v5, p2

    .line 76
    .line 77
    invoke-virtual {v6, v5}, La/fet;->h(Z)Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-eqz v7, :cond_7

    .line 82
    .line 83
    const/16 v7, 0x100

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_7
    const/16 v7, 0x80

    .line 87
    .line 88
    :goto_4
    or-int/2addr v2, v7

    .line 89
    :goto_5
    and-int/lit8 v7, p7, 0x8

    .line 90
    .line 91
    if-eqz v7, :cond_9

    .line 92
    .line 93
    or-int/lit16 v2, v2, 0xc00

    .line 94
    .line 95
    :cond_8
    move-object/from16 v9, p3

    .line 96
    .line 97
    goto :goto_7

    .line 98
    :cond_9
    and-int/lit16 v9, v8, 0xc00

    .line 99
    .line 100
    if-nez v9, :cond_8

    .line 101
    .line 102
    move-object/from16 v9, p3

    .line 103
    .line 104
    invoke-virtual {v6, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_a

    .line 109
    .line 110
    const/16 v10, 0x800

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_a
    const/16 v10, 0x400

    .line 114
    .line 115
    :goto_6
    or-int/2addr v2, v10

    .line 116
    :goto_7
    and-int/lit16 v10, v8, 0x6000

    .line 117
    .line 118
    if-nez v10, :cond_c

    .line 119
    .line 120
    move-object/from16 v10, p4

    .line 121
    .line 122
    invoke-virtual {v6, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    if-eqz v11, :cond_b

    .line 127
    .line 128
    const/16 v11, 0x4000

    .line 129
    .line 130
    goto :goto_8

    .line 131
    :cond_b
    const/16 v11, 0x2000

    .line 132
    .line 133
    :goto_8
    or-int/2addr v2, v11

    .line 134
    goto :goto_9

    .line 135
    :cond_c
    move-object/from16 v10, p4

    .line 136
    .line 137
    :goto_9
    and-int/lit16 v11, v2, 0x2493

    .line 138
    .line 139
    const/16 v12, 0x2492

    .line 140
    .line 141
    const/4 v13, 0x1

    .line 142
    if-eq v11, v12, :cond_d

    .line 143
    .line 144
    move v11, v13

    .line 145
    goto :goto_a

    .line 146
    :cond_d
    const/4 v11, 0x0

    .line 147
    :goto_a
    and-int/lit8 v12, v2, 0x1

    .line 148
    .line 149
    invoke-virtual {v6, v12, v11}, La/fet;->U(IZ)Z

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    if-eqz v11, :cond_12

    .line 154
    .line 155
    if-eqz v0, :cond_e

    .line 156
    .line 157
    sget-object v0, La/jm40;->b:La/jm40;

    .line 158
    .line 159
    goto :goto_b

    .line 160
    :cond_e
    move-object v0, v1

    .line 161
    :goto_b
    if-eqz v4, :cond_f

    .line 162
    .line 163
    move v3, v13

    .line 164
    goto :goto_c

    .line 165
    :cond_f
    move v3, v5

    .line 166
    :goto_c
    if-eqz v7, :cond_10

    .line 167
    .line 168
    const/4 v1, 0x0

    .line 169
    move-object v4, v1

    .line 170
    goto :goto_d

    .line 171
    :cond_10
    move-object v4, v9

    .line 172
    :goto_d
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 173
    .line 174
    invoke-virtual {v6, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 179
    .line 180
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    sget-object v7, La/ukd;->a:La/cl5;

    .line 185
    .line 186
    if-ne v5, v7, :cond_11

    .line 187
    .line 188
    new-instance v11, La/l5n;

    .line 189
    .line 190
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 191
    .line 192
    .line 193
    move-result-wide v12

    .line 194
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSwitchOff-0d7_KjU()J

    .line 195
    .line 196
    .line 197
    move-result-wide v14

    .line 198
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimaryForeground-0d7_KjU()J

    .line 199
    .line 200
    .line 201
    move-result-wide v16

    .line 202
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimaryForeground-0d7_KjU()J

    .line 203
    .line 204
    .line 205
    move-result-wide v18

    .line 206
    move-object/from16 p0, v0

    .line 207
    .line 208
    move-object/from16 p2, v1

    .line 209
    .line 210
    invoke-virtual/range {p2 .. p2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    const/high16 v5, 0x3f000000    # 0.5f

    .line 215
    .line 216
    invoke-static {v5, v0, v1}, La/y3d;->c(FJ)J

    .line 217
    .line 218
    .line 219
    move-result-wide v20

    .line 220
    invoke-virtual/range {p2 .. p2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSwitchOff-0d7_KjU()J

    .line 221
    .line 222
    .line 223
    move-result-wide v0

    .line 224
    invoke-static {v5, v0, v1}, La/y3d;->c(FJ)J

    .line 225
    .line 226
    .line 227
    move-result-wide v22

    .line 228
    invoke-virtual/range {p2 .. p2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimaryForeground-0d7_KjU()J

    .line 229
    .line 230
    .line 231
    move-result-wide v0

    .line 232
    const v5, 0x3f333333    # 0.7f

    .line 233
    .line 234
    .line 235
    invoke-static {v5, v0, v1}, La/y3d;->c(FJ)J

    .line 236
    .line 237
    .line 238
    move-result-wide v24

    .line 239
    invoke-virtual/range {p2 .. p2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimaryForeground-0d7_KjU()J

    .line 240
    .line 241
    .line 242
    move-result-wide v0

    .line 243
    invoke-static {v5, v0, v1}, La/y3d;->c(FJ)J

    .line 244
    .line 245
    .line 246
    move-result-wide v26

    .line 247
    invoke-direct/range {v11 .. v27}, La/l5n;-><init>(JJJJJJJJ)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v6, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    move-object v5, v11

    .line 254
    goto :goto_e

    .line 255
    :cond_11
    move-object/from16 p0, v0

    .line 256
    .line 257
    :goto_e
    check-cast v5, La/l5n;

    .line 258
    .line 259
    and-int/lit8 v0, v2, 0x7e

    .line 260
    .line 261
    shl-int/lit8 v1, v2, 0x3

    .line 262
    .line 263
    and-int/lit16 v2, v1, 0x1c00

    .line 264
    .line 265
    or-int/2addr v0, v2

    .line 266
    const v2, 0xe000

    .line 267
    .line 268
    .line 269
    and-int/2addr v2, v1

    .line 270
    or-int/2addr v0, v2

    .line 271
    const/high16 v2, 0x70000

    .line 272
    .line 273
    and-int/2addr v1, v2

    .line 274
    or-int v7, v0, v1

    .line 275
    .line 276
    move-object/from16 v0, p0

    .line 277
    .line 278
    move/from16 v1, p1

    .line 279
    .line 280
    move-object v2, v5

    .line 281
    move-object v5, v10

    .line 282
    invoke-static/range {v0 .. v7}, La/n5n;->a(La/mm40;ZLa/l5n;ZLa/gy40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 283
    .line 284
    .line 285
    move-object v1, v0

    .line 286
    goto :goto_f

    .line 287
    :cond_12
    invoke-virtual/range {p5 .. p5}, La/fet;->X()V

    .line 288
    .line 289
    .line 290
    move v3, v5

    .line 291
    move-object v4, v9

    .line 292
    :goto_f
    invoke-virtual/range {p5 .. p5}, La/fet;->u()La/yfe0;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    if-eqz v9, :cond_13

    .line 297
    .line 298
    new-instance v0, La/xjm;

    .line 299
    .line 300
    move/from16 v2, p1

    .line 301
    .line 302
    move-object/from16 v5, p4

    .line 303
    .line 304
    move/from16 v7, p7

    .line 305
    .line 306
    move v6, v8

    .line 307
    invoke-direct/range {v0 .. v7}, La/xjm;-><init>(La/mm40;ZZLa/gy40;Lkotlin/jvm/functions/Function1;II)V

    .line 308
    .line 309
    .line 310
    iput-object v0, v9, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 311
    .line 312
    :cond_13
    return-void
.end method
