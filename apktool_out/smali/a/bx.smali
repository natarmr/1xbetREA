.class public final synthetic La/bx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(BJ)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/bx;->a:B

    iput-wide p2, p0, La/bx;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bx;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/high16 v3, 0x40000000    # 2.0f

    .line 7
    .line 8
    const/high16 v4, 0x41200000    # 10.0f

    .line 9
    .line 10
    const/high16 v5, 0x40400000    # 3.0f

    .line 11
    .line 12
    const/high16 v6, 0x40800000    # 4.0f

    .line 13
    .line 14
    const/high16 v7, 0x41800000    # 16.0f

    .line 15
    .line 16
    const/high16 v8, 0x41000000    # 8.0f

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    iget-wide v10, v0, La/bx;->b:J

    .line 20
    .line 21
    const-wide v12, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const/16 v14, 0x20

    .line 27
    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    move-object/from16 v15, p1

    .line 32
    .line 33
    check-cast v15, La/fhl;

    .line 34
    .line 35
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    sget-object v1, La/qmk;->a:La/zcl;

    .line 39
    .line 40
    invoke-interface {v15, v8}, La/w6k;->w0(F)F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    int-to-long v2, v2

    .line 49
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    int-to-long v4, v1

    .line 54
    shl-long v1, v2, v14

    .line 55
    .line 56
    and-long v3, v4, v12

    .line 57
    .line 58
    or-long v22, v1, v3

    .line 59
    .line 60
    const/16 v24, 0x0

    .line 61
    .line 62
    const/16 v25, 0xf6

    .line 63
    .line 64
    iget-wide v0, v0, La/bx;->b:J

    .line 65
    .line 66
    const-wide/16 v18, 0x0

    .line 67
    .line 68
    const-wide/16 v20, 0x0

    .line 69
    .line 70
    move-wide/from16 v16, v0

    .line 71
    .line 72
    invoke-static/range {v15 .. v25}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_0
    move-object/from16 v1, p1

    .line 79
    .line 80
    check-cast v1, La/fhl;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object v2, La/qmk;->a:La/zcl;

    .line 86
    .line 87
    const/high16 v2, 0x43b40000    # 360.0f

    .line 88
    .line 89
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    int-to-long v3, v3

    .line 98
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    int-to-long v5, v2

    .line 103
    shl-long v2, v3, v14

    .line 104
    .line 105
    and-long v4, v5, v12

    .line 106
    .line 107
    or-long v8, v2, v4

    .line 108
    .line 109
    const/4 v10, 0x0

    .line 110
    const/16 v11, 0xf6

    .line 111
    .line 112
    iget-wide v2, v0, La/bx;->b:J

    .line 113
    .line 114
    const-wide/16 v4, 0x0

    .line 115
    .line 116
    const-wide/16 v6, 0x0

    .line 117
    .line 118
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 119
    .line 120
    .line 121
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_1
    move-object/from16 v1, p1

    .line 125
    .line 126
    check-cast v1, La/fhl;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-interface {v1}, La/fhl;->d()J

    .line 132
    .line 133
    .line 134
    move-result-wide v6

    .line 135
    invoke-interface {v1, v8}, La/w6k;->w0(F)F

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    invoke-interface {v1, v8}, La/w6k;->w0(F)F

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    int-to-long v4, v2

    .line 148
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    int-to-long v2, v2

    .line 153
    shl-long/2addr v4, v14

    .line 154
    and-long/2addr v2, v12

    .line 155
    or-long v8, v4, v2

    .line 156
    .line 157
    new-instance v10, La/vtm0;

    .line 158
    .line 159
    sget-object v2, La/qmk;->a:La/zcl;

    .line 160
    .line 161
    const/high16 v2, 0x3f800000    # 1.0f

    .line 162
    .line 163
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    const/4 v15, 0x0

    .line 168
    const/16 v16, 0x1e

    .line 169
    .line 170
    const/4 v12, 0x0

    .line 171
    const/4 v13, 0x0

    .line 172
    const/4 v14, 0x0

    .line 173
    invoke-direct/range {v10 .. v16}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 174
    .line 175
    .line 176
    const/16 v11, 0xe0

    .line 177
    .line 178
    iget-wide v2, v0, La/bx;->b:J

    .line 179
    .line 180
    const-wide/16 v4, 0x0

    .line 181
    .line 182
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 183
    .line 184
    .line 185
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object v0

    .line 188
    :pswitch_2
    move-object/from16 v1, p1

    .line 189
    .line 190
    check-cast v1, La/fhl;

    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    sget-object v2, La/qmk;->a:La/zcl;

    .line 196
    .line 197
    invoke-interface {v1, v7}, La/w6k;->w0(F)F

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    int-to-long v3, v3

    .line 206
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    int-to-long v5, v2

    .line 211
    shl-long v2, v3, v14

    .line 212
    .line 213
    and-long v4, v5, v12

    .line 214
    .line 215
    or-long v8, v2, v4

    .line 216
    .line 217
    const/4 v10, 0x0

    .line 218
    const/16 v11, 0xf6

    .line 219
    .line 220
    iget-wide v2, v0, La/bx;->b:J

    .line 221
    .line 222
    const-wide/16 v4, 0x0

    .line 223
    .line 224
    const-wide/16 v6, 0x0

    .line 225
    .line 226
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 227
    .line 228
    .line 229
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object v0

    .line 232
    :pswitch_3
    move-object/from16 v1, p1

    .line 233
    .line 234
    check-cast v1, La/fhl;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    const/4 v10, 0x0

    .line 240
    const/16 v11, 0xfe

    .line 241
    .line 242
    iget-wide v2, v0, La/bx;->b:J

    .line 243
    .line 244
    const-wide/16 v4, 0x0

    .line 245
    .line 246
    const-wide/16 v6, 0x0

    .line 247
    .line 248
    const-wide/16 v8, 0x0

    .line 249
    .line 250
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 251
    .line 252
    .line 253
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_4
    move-object/from16 v1, p1

    .line 257
    .line 258
    check-cast v1, La/fhl;

    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-interface {v1}, La/fhl;->d()J

    .line 264
    .line 265
    .line 266
    move-result-wide v6

    .line 267
    const/4 v11, 0x0

    .line 268
    const/16 v12, 0x7a

    .line 269
    .line 270
    iget-wide v2, v0, La/bx;->b:J

    .line 271
    .line 272
    const-wide/16 v4, 0x0

    .line 273
    .line 274
    const/4 v8, 0x0

    .line 275
    const/4 v9, 0x0

    .line 276
    const/4 v10, 0x0

    .line 277
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 278
    .line 279
    .line 280
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_5
    move-object/from16 v1, p1

    .line 284
    .line 285
    check-cast v1, La/fhl;

    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-interface {v1}, La/fhl;->d()J

    .line 291
    .line 292
    .line 293
    move-result-wide v6

    .line 294
    const/4 v11, 0x0

    .line 295
    const/16 v12, 0x7a

    .line 296
    .line 297
    iget-wide v2, v0, La/bx;->b:J

    .line 298
    .line 299
    const-wide/16 v4, 0x0

    .line 300
    .line 301
    const/4 v8, 0x0

    .line 302
    const/4 v9, 0x0

    .line 303
    const/4 v10, 0x0

    .line 304
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 305
    .line 306
    .line 307
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object v0

    .line 310
    :pswitch_6
    move-object/from16 v0, p1

    .line 311
    .line 312
    check-cast v0, La/abi0;

    .line 313
    .line 314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-static {v0, v10, v11}, La/cbi0;->a(La/abi0;J)V

    .line 318
    .line 319
    .line 320
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 321
    .line 322
    return-object v0

    .line 323
    :pswitch_7
    move-object/from16 v0, p1

    .line 324
    .line 325
    check-cast v0, La/fhl;

    .line 326
    .line 327
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    sget-wide v1, La/y3d;->f:J

    .line 331
    .line 332
    invoke-static {v10, v11, v1, v2}, La/h2t0;->a(JJ)Z

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    if-nez v3, :cond_0

    .line 337
    .line 338
    invoke-interface {v0}, La/fhl;->d()J

    .line 339
    .line 340
    .line 341
    move-result-wide v7

    .line 342
    and-long/2addr v12, v7

    .line 343
    long-to-int v3, v12

    .line 344
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    div-float v17, v12, v5

    .line 349
    .line 350
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    div-float/2addr v5, v4

    .line 355
    invoke-interface {v0}, La/fhl;->A0()La/nr;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    invoke-virtual {v4}, La/nr;->i()La/x5a;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    invoke-static {v4}, La/vw2;->b(La/x5a;)Landroid/graphics/Canvas;

    .line 364
    .line 365
    .line 366
    move-result-object v15

    .line 367
    sget-object v4, La/qmk;->a:La/zcl;

    .line 368
    .line 369
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 370
    .line 371
    .line 372
    move-result v16

    .line 373
    shr-long/2addr v7, v14

    .line 374
    long-to-int v4, v7

    .line 375
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 380
    .line 381
    .line 382
    move-result v6

    .line 383
    sub-float v18, v4, v6

    .line 384
    .line 385
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    sub-float v19, v3, v5

    .line 390
    .line 391
    invoke-interface {v0, v9}, La/w6k;->w0(F)F

    .line 392
    .line 393
    .line 394
    move-result v20

    .line 395
    invoke-interface {v0, v9}, La/w6k;->w0(F)F

    .line 396
    .line 397
    .line 398
    move-result v21

    .line 399
    new-instance v3, Landroid/graphics/Paint;

    .line 400
    .line 401
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 402
    .line 403
    .line 404
    invoke-static {v1, v2}, La/fbc;->U(J)I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 409
    .line 410
    .line 411
    const/high16 v1, 0x41600000    # 14.0f

    .line 412
    .line 413
    invoke-interface {v0, v1}, La/w6k;->w0(F)F

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    invoke-static {v10, v11}, La/fbc;->U(J)I

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    invoke-virtual {v3, v0, v9, v9, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 422
    .line 423
    .line 424
    move-object/from16 v22, v3

    .line 425
    .line 426
    invoke-virtual/range {v15 .. v22}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 427
    .line 428
    .line 429
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 430
    .line 431
    return-object v0

    .line 432
    :pswitch_8
    move-object/from16 v1, p1

    .line 433
    .line 434
    check-cast v1, La/fhl;

    .line 435
    .line 436
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    sget-object v4, La/qmk;->a:La/zcl;

    .line 440
    .line 441
    invoke-interface {v1, v6}, La/w6k;->w0(F)F

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    invoke-interface {v1, v6}, La/w6k;->w0(F)F

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    invoke-interface {v1}, La/fhl;->d()J

    .line 450
    .line 451
    .line 452
    move-result-wide v6

    .line 453
    and-long/2addr v6, v12

    .line 454
    long-to-int v6, v6

    .line 455
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 456
    .line 457
    .line 458
    move-result v16

    .line 459
    invoke-interface {v1}, La/fhl;->d()J

    .line 460
    .line 461
    .line 462
    move-result-wide v6

    .line 463
    and-long/2addr v6, v12

    .line 464
    long-to-int v6, v6

    .line 465
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 466
    .line 467
    .line 468
    move-result v6

    .line 469
    div-float/2addr v6, v3

    .line 470
    const/4 v3, 0x2

    .line 471
    new-array v3, v3, [F

    .line 472
    .line 473
    aput v4, v3, v2

    .line 474
    .line 475
    const/4 v2, 0x1

    .line 476
    aput v5, v3, v2

    .line 477
    .line 478
    invoke-static {v9, v3}, La/qjj;->K(F[F)La/x03;

    .line 479
    .line 480
    .line 481
    move-result-object v20

    .line 482
    invoke-static {}, La/z03;->a()La/w03;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    invoke-virtual {v2, v9, v6}, La/w03;->f(FF)V

    .line 487
    .line 488
    .line 489
    invoke-interface {v1}, La/fhl;->d()J

    .line 490
    .line 491
    .line 492
    move-result-wide v3

    .line 493
    shr-long/2addr v3, v14

    .line 494
    long-to-int v3, v3

    .line 495
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    invoke-virtual {v2, v3, v6}, La/w03;->e(FF)V

    .line 500
    .line 501
    .line 502
    new-instance v15, La/vtm0;

    .line 503
    .line 504
    const/16 v19, 0x0

    .line 505
    .line 506
    const/16 v21, 0xa

    .line 507
    .line 508
    const/16 v17, 0x0

    .line 509
    .line 510
    const/16 v18, 0x0

    .line 511
    .line 512
    invoke-direct/range {v15 .. v21}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 513
    .line 514
    .line 515
    const/16 v7, 0x34

    .line 516
    .line 517
    iget-wide v3, v0, La/bx;->b:J

    .line 518
    .line 519
    const/4 v5, 0x0

    .line 520
    move-object v6, v15

    .line 521
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 522
    .line 523
    .line 524
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 525
    .line 526
    return-object v0

    .line 527
    :pswitch_9
    move-object/from16 v1, p1

    .line 528
    .line 529
    check-cast v1, La/fhl;

    .line 530
    .line 531
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    const/4 v11, 0x0

    .line 535
    const/16 v12, 0x7e

    .line 536
    .line 537
    iget-wide v2, v0, La/bx;->b:J

    .line 538
    .line 539
    const-wide/16 v4, 0x0

    .line 540
    .line 541
    const-wide/16 v6, 0x0

    .line 542
    .line 543
    const/4 v8, 0x0

    .line 544
    const/4 v9, 0x0

    .line 545
    const/4 v10, 0x0

    .line 546
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 547
    .line 548
    .line 549
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 550
    .line 551
    return-object v0

    .line 552
    :pswitch_a
    move-object/from16 v1, p1

    .line 553
    .line 554
    check-cast v1, La/fhl;

    .line 555
    .line 556
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    const/4 v11, 0x0

    .line 560
    const/16 v12, 0x7e

    .line 561
    .line 562
    iget-wide v2, v0, La/bx;->b:J

    .line 563
    .line 564
    const-wide/16 v4, 0x0

    .line 565
    .line 566
    const-wide/16 v6, 0x0

    .line 567
    .line 568
    const/4 v8, 0x0

    .line 569
    const/4 v9, 0x0

    .line 570
    const/4 v10, 0x0

    .line 571
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 572
    .line 573
    .line 574
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 575
    .line 576
    return-object v0

    .line 577
    :pswitch_b
    move-object/from16 v1, p1

    .line 578
    .line 579
    check-cast v1, La/fhl;

    .line 580
    .line 581
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    const/4 v11, 0x0

    .line 585
    const/16 v12, 0x7e

    .line 586
    .line 587
    iget-wide v2, v0, La/bx;->b:J

    .line 588
    .line 589
    const-wide/16 v4, 0x0

    .line 590
    .line 591
    const-wide/16 v6, 0x0

    .line 592
    .line 593
    const/4 v8, 0x0

    .line 594
    const/4 v9, 0x0

    .line 595
    const/4 v10, 0x0

    .line 596
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 597
    .line 598
    .line 599
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 600
    .line 601
    return-object v0

    .line 602
    :pswitch_c
    move-object/from16 v1, p1

    .line 603
    .line 604
    check-cast v1, La/fhl;

    .line 605
    .line 606
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    const/4 v11, 0x0

    .line 610
    const/16 v12, 0x7e

    .line 611
    .line 612
    iget-wide v2, v0, La/bx;->b:J

    .line 613
    .line 614
    const-wide/16 v4, 0x0

    .line 615
    .line 616
    const-wide/16 v6, 0x0

    .line 617
    .line 618
    const/4 v8, 0x0

    .line 619
    const/4 v9, 0x0

    .line 620
    const/4 v10, 0x0

    .line 621
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 622
    .line 623
    .line 624
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 625
    .line 626
    return-object v0

    .line 627
    :pswitch_d
    move-object/from16 v1, p1

    .line 628
    .line 629
    check-cast v1, La/fhl;

    .line 630
    .line 631
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    sget-object v2, La/qmk;->a:La/zcl;

    .line 635
    .line 636
    invoke-interface {v1, v7}, La/w6k;->w0(F)F

    .line 637
    .line 638
    .line 639
    move-result v2

    .line 640
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 641
    .line 642
    .line 643
    move-result v3

    .line 644
    int-to-long v3, v3

    .line 645
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    int-to-long v5, v2

    .line 650
    shl-long v2, v3, v14

    .line 651
    .line 652
    and-long v4, v5, v12

    .line 653
    .line 654
    or-long v8, v2, v4

    .line 655
    .line 656
    const/4 v10, 0x0

    .line 657
    const/16 v11, 0xf6

    .line 658
    .line 659
    iget-wide v2, v0, La/bx;->b:J

    .line 660
    .line 661
    const-wide/16 v4, 0x0

    .line 662
    .line 663
    const-wide/16 v6, 0x0

    .line 664
    .line 665
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 666
    .line 667
    .line 668
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 669
    .line 670
    return-object v0

    .line 671
    :pswitch_e
    move-object/from16 v1, p1

    .line 672
    .line 673
    check-cast v1, La/fhl;

    .line 674
    .line 675
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    sget-object v2, La/qmk;->a:La/zcl;

    .line 679
    .line 680
    const/high16 v2, 0x41a00000    # 20.0f

    .line 681
    .line 682
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 683
    .line 684
    .line 685
    move-result v2

    .line 686
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 687
    .line 688
    .line 689
    move-result v3

    .line 690
    int-to-long v3, v3

    .line 691
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 692
    .line 693
    .line 694
    move-result v2

    .line 695
    int-to-long v5, v2

    .line 696
    shl-long v2, v3, v14

    .line 697
    .line 698
    and-long v4, v5, v12

    .line 699
    .line 700
    or-long v8, v2, v4

    .line 701
    .line 702
    const/4 v10, 0x0

    .line 703
    const/16 v11, 0xf6

    .line 704
    .line 705
    iget-wide v2, v0, La/bx;->b:J

    .line 706
    .line 707
    const-wide/16 v4, 0x0

    .line 708
    .line 709
    const-wide/16 v6, 0x0

    .line 710
    .line 711
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 712
    .line 713
    .line 714
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 715
    .line 716
    return-object v0

    .line 717
    :pswitch_f
    move-object/from16 v0, p1

    .line 718
    .line 719
    check-cast v0, La/n39;

    .line 720
    .line 721
    iget-object v1, v0, La/n39;->b:Lkotlin/jvm/functions/Function1;

    .line 722
    .line 723
    if-nez v1, :cond_1

    .line 724
    .line 725
    goto :goto_1

    .line 726
    :cond_1
    iget-object v2, v0, La/n39;->a:La/n5a;

    .line 727
    .line 728
    if-eqz v2, :cond_2

    .line 729
    .line 730
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 731
    .line 732
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 740
    goto :goto_0

    .line 741
    :catchall_0
    move-exception v0

    .line 742
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 743
    .line 744
    new-instance v1, La/g0g0;

    .line 745
    .line 746
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 747
    .line 748
    .line 749
    move-object v0, v1

    .line 750
    :goto_0
    invoke-virtual {v2, v0}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    :cond_2
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 754
    .line 755
    return-object v0

    .line 756
    :pswitch_10
    move-object/from16 v1, p1

    .line 757
    .line 758
    check-cast v1, La/fhl;

    .line 759
    .line 760
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 764
    .line 765
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 770
    .line 771
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 772
    .line 773
    .line 774
    move-result-wide v2

    .line 775
    const/4 v10, 0x0

    .line 776
    const/16 v11, 0xf6

    .line 777
    .line 778
    const-wide/16 v4, 0x0

    .line 779
    .line 780
    const-wide/16 v6, 0x0

    .line 781
    .line 782
    iget-wide v8, v0, La/bx;->b:J

    .line 783
    .line 784
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 785
    .line 786
    .line 787
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 788
    .line 789
    return-object v0

    .line 790
    :pswitch_11
    move-object/from16 v1, p1

    .line 791
    .line 792
    check-cast v1, La/fhl;

    .line 793
    .line 794
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    const/4 v10, 0x0

    .line 798
    const/16 v11, 0xfe

    .line 799
    .line 800
    iget-wide v2, v0, La/bx;->b:J

    .line 801
    .line 802
    const-wide/16 v4, 0x0

    .line 803
    .line 804
    const-wide/16 v6, 0x0

    .line 805
    .line 806
    const-wide/16 v8, 0x0

    .line 807
    .line 808
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 809
    .line 810
    .line 811
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 812
    .line 813
    return-object v0

    .line 814
    :pswitch_12
    move-object/from16 v1, p1

    .line 815
    .line 816
    check-cast v1, La/fhl;

    .line 817
    .line 818
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    invoke-interface {v1}, La/fhl;->d()J

    .line 822
    .line 823
    .line 824
    move-result-wide v6

    .line 825
    const/4 v11, 0x0

    .line 826
    const/16 v12, 0x7a

    .line 827
    .line 828
    iget-wide v2, v0, La/bx;->b:J

    .line 829
    .line 830
    const-wide/16 v4, 0x0

    .line 831
    .line 832
    const/4 v8, 0x0

    .line 833
    const/4 v9, 0x0

    .line 834
    const/4 v10, 0x0

    .line 835
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 836
    .line 837
    .line 838
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 839
    .line 840
    return-object v0

    .line 841
    :pswitch_13
    move-object/from16 v1, p1

    .line 842
    .line 843
    check-cast v1, La/fhl;

    .line 844
    .line 845
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 846
    .line 847
    .line 848
    invoke-interface {v1}, La/fhl;->d()J

    .line 849
    .line 850
    .line 851
    move-result-wide v6

    .line 852
    const/4 v11, 0x0

    .line 853
    const/16 v12, 0x7a

    .line 854
    .line 855
    iget-wide v2, v0, La/bx;->b:J

    .line 856
    .line 857
    const-wide/16 v4, 0x0

    .line 858
    .line 859
    const/4 v8, 0x0

    .line 860
    const/4 v9, 0x0

    .line 861
    const/4 v10, 0x0

    .line 862
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 863
    .line 864
    .line 865
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 866
    .line 867
    return-object v0

    .line 868
    :pswitch_14
    move-object/from16 v1, p1

    .line 869
    .line 870
    check-cast v1, La/fhl;

    .line 871
    .line 872
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    invoke-interface {v1}, La/fhl;->d()J

    .line 876
    .line 877
    .line 878
    move-result-wide v6

    .line 879
    const/4 v11, 0x0

    .line 880
    const/16 v12, 0x7a

    .line 881
    .line 882
    iget-wide v2, v0, La/bx;->b:J

    .line 883
    .line 884
    const-wide/16 v4, 0x0

    .line 885
    .line 886
    const/4 v8, 0x0

    .line 887
    const/4 v9, 0x0

    .line 888
    const/4 v10, 0x0

    .line 889
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 890
    .line 891
    .line 892
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 893
    .line 894
    return-object v0

    .line 895
    :pswitch_15
    move-object/from16 v1, p1

    .line 896
    .line 897
    check-cast v1, La/fhl;

    .line 898
    .line 899
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    const/4 v10, 0x0

    .line 903
    const/16 v11, 0xfe

    .line 904
    .line 905
    iget-wide v2, v0, La/bx;->b:J

    .line 906
    .line 907
    const-wide/16 v4, 0x0

    .line 908
    .line 909
    const-wide/16 v6, 0x0

    .line 910
    .line 911
    const-wide/16 v8, 0x0

    .line 912
    .line 913
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 914
    .line 915
    .line 916
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 917
    .line 918
    return-object v0

    .line 919
    :pswitch_16
    move-object/from16 v1, p1

    .line 920
    .line 921
    check-cast v1, La/fhl;

    .line 922
    .line 923
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 924
    .line 925
    .line 926
    const/4 v8, 0x0

    .line 927
    const/16 v9, 0x7e

    .line 928
    .line 929
    iget-wide v2, v0, La/bx;->b:J

    .line 930
    .line 931
    const/4 v4, 0x0

    .line 932
    const-wide/16 v5, 0x0

    .line 933
    .line 934
    const/4 v7, 0x0

    .line 935
    invoke-static/range {v1 .. v9}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 936
    .line 937
    .line 938
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 939
    .line 940
    return-object v0

    .line 941
    :pswitch_17
    move-object/from16 v1, p1

    .line 942
    .line 943
    check-cast v1, La/pi9;

    .line 944
    .line 945
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 946
    .line 947
    .line 948
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 949
    .line 950
    invoke-interface {v2}, La/y99;->d()J

    .line 951
    .line 952
    .line 953
    move-result-wide v2

    .line 954
    and-long/2addr v2, v12

    .line 955
    long-to-int v2, v2

    .line 956
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 957
    .line 958
    .line 959
    move-result v2

    .line 960
    div-float/2addr v2, v5

    .line 961
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 962
    .line 963
    .line 964
    move-result v3

    .line 965
    int-to-long v3, v3

    .line 966
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 967
    .line 968
    .line 969
    move-result v2

    .line 970
    int-to-long v5, v2

    .line 971
    shl-long v2, v3, v14

    .line 972
    .line 973
    and-long v4, v5, v12

    .line 974
    .line 975
    or-long v10, v2, v4

    .line 976
    .line 977
    new-instance v6, La/lf4;

    .line 978
    .line 979
    const/4 v7, 0x0

    .line 980
    iget-wide v8, v0, La/bx;->b:J

    .line 981
    .line 982
    invoke-direct/range {v6 .. v11}, La/lf4;-><init>(BJJ)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v1, v6}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    return-object v0

    .line 990
    :pswitch_18
    move-object/from16 v0, p1

    .line 991
    .line 992
    check-cast v0, La/pi9;

    .line 993
    .line 994
    iget-object v1, v0, La/pi9;->a:La/y99;

    .line 995
    .line 996
    invoke-interface {v1}, La/y99;->d()J

    .line 997
    .line 998
    .line 999
    move-result-wide v4

    .line 1000
    shr-long/2addr v4, v14

    .line 1001
    long-to-int v1, v4

    .line 1002
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1003
    .line 1004
    .line 1005
    move-result v1

    .line 1006
    div-float/2addr v1, v3

    .line 1007
    invoke-static {v0, v1}, La/eeq;->Q(La/pi9;F)La/vz2;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v3

    .line 1011
    new-instance v4, La/m78;

    .line 1012
    .line 1013
    const/4 v5, 0x5

    .line 1014
    invoke-direct {v4, v10, v11, v5}, La/m78;-><init>(JI)V

    .line 1015
    .line 1016
    .line 1017
    new-instance v5, La/ny2;

    .line 1018
    .line 1019
    invoke-direct {v5, v1, v3, v4, v2}, La/ny2;-><init>(FLjava/lang/Object;Ljava/lang/Object;B)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v0, v5}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    return-object v0

    .line 1027
    :pswitch_19
    move-object/from16 v1, p1

    .line 1028
    .line 1029
    check-cast v1, La/fhl;

    .line 1030
    .line 1031
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1032
    .line 1033
    .line 1034
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1035
    .line 1036
    const/high16 v2, 0x40c00000    # 6.0f

    .line 1037
    .line 1038
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 1039
    .line 1040
    .line 1041
    move-result v3

    .line 1042
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 1043
    .line 1044
    .line 1045
    move-result v2

    .line 1046
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1047
    .line 1048
    .line 1049
    move-result v3

    .line 1050
    int-to-long v3, v3

    .line 1051
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1052
    .line 1053
    .line 1054
    move-result v2

    .line 1055
    int-to-long v5, v2

    .line 1056
    shl-long v2, v3, v14

    .line 1057
    .line 1058
    and-long v4, v5, v12

    .line 1059
    .line 1060
    or-long v8, v2, v4

    .line 1061
    .line 1062
    const/4 v10, 0x0

    .line 1063
    const/16 v11, 0xf6

    .line 1064
    .line 1065
    iget-wide v2, v0, La/bx;->b:J

    .line 1066
    .line 1067
    const-wide/16 v4, 0x0

    .line 1068
    .line 1069
    const-wide/16 v6, 0x0

    .line 1070
    .line 1071
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 1072
    .line 1073
    .line 1074
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1075
    .line 1076
    return-object v0

    .line 1077
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1078
    .line 1079
    check-cast v1, La/fhl;

    .line 1080
    .line 1081
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    const/4 v11, 0x0

    .line 1085
    const/16 v12, 0x7e

    .line 1086
    .line 1087
    iget-wide v2, v0, La/bx;->b:J

    .line 1088
    .line 1089
    const-wide/16 v4, 0x0

    .line 1090
    .line 1091
    const-wide/16 v6, 0x0

    .line 1092
    .line 1093
    const/4 v8, 0x0

    .line 1094
    const/4 v9, 0x0

    .line 1095
    const/4 v10, 0x0

    .line 1096
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 1097
    .line 1098
    .line 1099
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1100
    .line 1101
    return-object v0

    .line 1102
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1103
    .line 1104
    check-cast v1, La/fhl;

    .line 1105
    .line 1106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1107
    .line 1108
    .line 1109
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1110
    .line 1111
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 1112
    .line 1113
    .line 1114
    move-result v2

    .line 1115
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1116
    .line 1117
    .line 1118
    move-result v3

    .line 1119
    int-to-long v3, v3

    .line 1120
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1121
    .line 1122
    .line 1123
    move-result v2

    .line 1124
    int-to-long v5, v2

    .line 1125
    shl-long v2, v3, v14

    .line 1126
    .line 1127
    and-long v4, v5, v12

    .line 1128
    .line 1129
    or-long v8, v2, v4

    .line 1130
    .line 1131
    const/4 v10, 0x0

    .line 1132
    const/16 v11, 0xf6

    .line 1133
    .line 1134
    iget-wide v2, v0, La/bx;->b:J

    .line 1135
    .line 1136
    const-wide/16 v4, 0x0

    .line 1137
    .line 1138
    const-wide/16 v6, 0x0

    .line 1139
    .line 1140
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 1141
    .line 1142
    .line 1143
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1144
    .line 1145
    return-object v0

    .line 1146
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1147
    .line 1148
    check-cast v1, La/fhl;

    .line 1149
    .line 1150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1151
    .line 1152
    .line 1153
    const/4 v10, 0x0

    .line 1154
    const/16 v11, 0xfe

    .line 1155
    .line 1156
    iget-wide v2, v0, La/bx;->b:J

    .line 1157
    .line 1158
    const-wide/16 v4, 0x0

    .line 1159
    .line 1160
    const-wide/16 v6, 0x0

    .line 1161
    .line 1162
    const-wide/16 v8, 0x0

    .line 1163
    .line 1164
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 1165
    .line 1166
    .line 1167
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1168
    .line 1169
    return-object v0

    .line 1170
    nop

    .line 1171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
