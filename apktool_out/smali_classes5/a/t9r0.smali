.class public final synthetic La/t9r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/t9r0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/t9r0;->a:B

    .line 4
    .line 5
    const-wide v1, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const/16 v3, 0x20

    .line 11
    .line 12
    const/4 v4, 0x2

    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v0, p1

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, La/epv0;->O(I)La/mdm;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :pswitch_0
    move-object/from16 v0, p1

    .line 33
    .line 34
    check-cast v0, La/f3s0;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sget-object v1, La/sre0;->a:La/tre0;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :pswitch_1
    move-object/from16 v0, p1

    .line 51
    .line 52
    check-cast v0, La/f3s0;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, La/f3s0;->getKey()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :pswitch_2
    move-object/from16 v0, p1

    .line 63
    .line 64
    check-cast v0, La/fee;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/bqr;

    .line 74
    .line 75
    invoke-static {v0, v7}, La/kpb;->o0(La/bqr;Z)La/cqr;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0

    .line 80
    :pswitch_3
    move-object/from16 v0, p1

    .line 81
    .line 82
    check-cast v0, La/imy;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    const/16 v1, 0xa28

    .line 88
    .line 89
    iput v1, v0, La/imy;->a:I

    .line 90
    .line 91
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v0, v7, v2}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 96
    .line 97
    .line 98
    const/16 v3, 0x3e8

    .line 99
    .line 100
    invoke-virtual {v0, v3, v2}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 101
    .line 102
    .line 103
    const v3, 0x3f19999a    # 0.6f

    .line 104
    .line 105
    .line 106
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    const/16 v4, 0x514

    .line 111
    .line 112
    invoke-virtual {v0, v4, v3}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 113
    .line 114
    .line 115
    const/16 v4, 0x8fc

    .line 116
    .line 117
    invoke-virtual {v0, v4, v3}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1, v2}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 121
    .line 122
    .line 123
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object v0

    .line 126
    :pswitch_4
    move-object/from16 v0, p1

    .line 127
    .line 128
    check-cast v0, Ljava/util/List;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance v6, La/ngk0;

    .line 134
    .line 135
    invoke-direct {v6}, La/ngk0;-><init>()V

    .line 136
    .line 137
    .line 138
    const/4 v8, 0x3

    .line 139
    invoke-static {v0, v8, v8}, Lkotlin/collections/CollectionsKt;->Q0(Ljava/lang/Iterable;II)Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-eqz v9, :cond_1

    .line 152
    .line 153
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    check-cast v9, Ljava/util/List;

    .line 158
    .line 159
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-lt v10, v8, :cond_0

    .line 164
    .line 165
    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    check-cast v10, Ljava/lang/Number;

    .line 170
    .line 171
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    float-to-long v10, v10

    .line 176
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    invoke-interface {v9, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    check-cast v11, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    check-cast v9, Ljava/lang/Number;

    .line 195
    .line 196
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    int-to-long v11, v11

    .line 205
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    int-to-long v13, v9

    .line 210
    shl-long/2addr v11, v3

    .line 211
    and-long/2addr v13, v1

    .line 212
    or-long/2addr v11, v13

    .line 213
    new-instance v9, La/ne60;

    .line 214
    .line 215
    invoke-direct {v9, v11, v12}, La/ne60;-><init>(J)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v6, v10, v9}, La/ngk0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    goto :goto_0

    .line 222
    :cond_1
    return-object v6

    .line 223
    :pswitch_5
    move-object/from16 v13, p1

    .line 224
    .line 225
    check-cast v13, La/fhl;

    .line 226
    .line 227
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    sget-object v0, La/qmk;->a:La/zcl;

    .line 231
    .line 232
    const/high16 v0, 0x42100000    # 36.0f

    .line 233
    .line 234
    invoke-interface {v13, v0}, La/w6k;->w0(F)F

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    sget-wide v4, La/y3d;->f:J

    .line 239
    .line 240
    new-instance v7, La/y3d;

    .line 241
    .line 242
    invoke-direct {v7, v4, v5}, La/y3d;-><init>(J)V

    .line 243
    .line 244
    .line 245
    sget-wide v4, La/kkg;->J:J

    .line 246
    .line 247
    new-instance v8, La/y3d;

    .line 248
    .line 249
    invoke-direct {v8, v4, v5}, La/y3d;-><init>(J)V

    .line 250
    .line 251
    .line 252
    filled-new-array {v7, v8}, [La/y3d;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    invoke-static {v7}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    const/16 v8, 0x8

    .line 261
    .line 262
    invoke-static {v7, v6, v0, v8}, La/yk5;->n(Ljava/util/List;FFI)La/e900;

    .line 263
    .line 264
    .line 265
    move-result-object v14

    .line 266
    invoke-interface {v13}, La/fhl;->d()J

    .line 267
    .line 268
    .line 269
    move-result-wide v9

    .line 270
    shr-long/2addr v9, v3

    .line 271
    long-to-int v7, v9

    .line 272
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    int-to-long v9, v7

    .line 281
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    int-to-long v11, v7

    .line 286
    shl-long/2addr v9, v3

    .line 287
    and-long/2addr v11, v1

    .line 288
    or-long v17, v9, v11

    .line 289
    .line 290
    const/16 v22, 0x0

    .line 291
    .line 292
    const/16 v23, 0x7a

    .line 293
    .line 294
    const-wide/16 v15, 0x0

    .line 295
    .line 296
    const/16 v19, 0x0

    .line 297
    .line 298
    const/16 v20, 0x0

    .line 299
    .line 300
    const/16 v21, 0x0

    .line 301
    .line 302
    invoke-static/range {v13 .. v23}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 303
    .line 304
    .line 305
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    int-to-long v6, v6

    .line 310
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 311
    .line 312
    .line 313
    move-result v9

    .line 314
    int-to-long v9, v9

    .line 315
    shl-long/2addr v6, v3

    .line 316
    and-long/2addr v9, v1

    .line 317
    or-long v16, v6, v9

    .line 318
    .line 319
    invoke-interface {v13}, La/fhl;->d()J

    .line 320
    .line 321
    .line 322
    move-result-wide v6

    .line 323
    shr-long/2addr v6, v3

    .line 324
    long-to-int v6, v6

    .line 325
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    invoke-interface {v13}, La/fhl;->d()J

    .line 330
    .line 331
    .line 332
    move-result-wide v9

    .line 333
    and-long/2addr v9, v1

    .line 334
    long-to-int v7, v9

    .line 335
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    sub-float/2addr v7, v0

    .line 340
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 341
    .line 342
    .line 343
    move-result v6

    .line 344
    int-to-long v9, v6

    .line 345
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    int-to-long v6, v6

    .line 350
    shl-long/2addr v9, v3

    .line 351
    and-long/2addr v6, v1

    .line 352
    or-long v18, v9, v6

    .line 353
    .line 354
    const/16 v23, 0x0

    .line 355
    .line 356
    const/16 v24, 0x78

    .line 357
    .line 358
    const/16 v20, 0x0

    .line 359
    .line 360
    const/16 v22, 0x0

    .line 361
    .line 362
    move-wide v14, v4

    .line 363
    invoke-static/range {v13 .. v24}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 364
    .line 365
    .line 366
    sget-object v3, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 367
    .line 368
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 369
    .line 370
    .line 371
    move-result-wide v4

    .line 372
    new-instance v6, La/y3d;

    .line 373
    .line 374
    invoke-direct {v6, v4, v5}, La/y3d;-><init>(J)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 378
    .line 379
    .line 380
    move-result-wide v3

    .line 381
    new-instance v5, La/y3d;

    .line 382
    .line 383
    invoke-direct {v5, v3, v4}, La/y3d;-><init>(J)V

    .line 384
    .line 385
    .line 386
    filled-new-array {v6, v5}, [La/y3d;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-interface {v13}, La/fhl;->d()J

    .line 395
    .line 396
    .line 397
    move-result-wide v4

    .line 398
    and-long/2addr v1, v4

    .line 399
    long-to-int v1, v1

    .line 400
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    invoke-static {v3, v0, v1, v8}, La/yk5;->n(Ljava/util/List;FFI)La/e900;

    .line 405
    .line 406
    .line 407
    move-result-object v14

    .line 408
    const/16 v22, 0x0

    .line 409
    .line 410
    const/16 v23, 0x7e

    .line 411
    .line 412
    const-wide/16 v15, 0x0

    .line 413
    .line 414
    const-wide/16 v17, 0x0

    .line 415
    .line 416
    const/16 v19, 0x0

    .line 417
    .line 418
    const/16 v20, 0x0

    .line 419
    .line 420
    invoke-static/range {v13 .. v23}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 421
    .line 422
    .line 423
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    return-object v0

    .line 426
    :pswitch_6
    move-object/from16 v0, p1

    .line 427
    .line 428
    check-cast v0, La/awr0;

    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    iget v0, v0, La/awr0;->a:I

    .line 434
    .line 435
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    return-object v0

    .line 440
    :pswitch_7
    move-object/from16 v0, p1

    .line 441
    .line 442
    check-cast v0, La/ntr0;

    .line 443
    .line 444
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    iget-object v0, v0, La/ntr0;->a:La/md80;

    .line 448
    .line 449
    return-object v0

    .line 450
    :pswitch_8
    move-object/from16 v0, p1

    .line 451
    .line 452
    check-cast v0, La/ntr0;

    .line 453
    .line 454
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    iget-boolean v0, v0, La/ntr0;->b:Z

    .line 458
    .line 459
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    return-object v0

    .line 464
    :pswitch_9
    move-object/from16 v0, p1

    .line 465
    .line 466
    check-cast v0, La/vd80;

    .line 467
    .line 468
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    iget-object v0, v0, La/vd80;->d:Ljava/util/List;

    .line 472
    .line 473
    return-object v0

    .line 474
    :pswitch_a
    move-object/from16 v0, p1

    .line 475
    .line 476
    check-cast v0, La/kfk0;

    .line 477
    .line 478
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 482
    .line 483
    return-object v0

    .line 484
    :pswitch_b
    move-object/from16 v0, p1

    .line 485
    .line 486
    check-cast v0, La/k0g0;

    .line 487
    .line 488
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 492
    .line 493
    return-object v0

    .line 494
    :pswitch_c
    move-object/from16 v0, p1

    .line 495
    .line 496
    check-cast v0, La/tk0;

    .line 497
    .line 498
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    new-instance v1, La/zdr0;

    .line 502
    .line 503
    invoke-direct {v1, v0}, La/zdr0;-><init>(La/tk0;)V

    .line 504
    .line 505
    .line 506
    return-object v1

    .line 507
    :pswitch_d
    move-object/from16 v0, p1

    .line 508
    .line 509
    check-cast v0, La/dw60;

    .line 510
    .line 511
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    new-instance v1, La/ber0;

    .line 515
    .line 516
    invoke-direct {v1, v0}, La/ber0;-><init>(La/dw60;)V

    .line 517
    .line 518
    .line 519
    return-object v1

    .line 520
    :pswitch_e
    move-object/from16 v0, p1

    .line 521
    .line 522
    check-cast v0, La/d5l0;

    .line 523
    .line 524
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    new-instance v1, La/der0;

    .line 528
    .line 529
    invoke-direct {v1, v0}, La/der0;-><init>(La/d5l0;)V

    .line 530
    .line 531
    .line 532
    return-object v1

    .line 533
    :pswitch_f
    move-object/from16 v0, p1

    .line 534
    .line 535
    check-cast v0, La/eer0;

    .line 536
    .line 537
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    return-object v0

    .line 541
    :pswitch_10
    move-object/from16 v0, p1

    .line 542
    .line 543
    check-cast v0, La/m470;

    .line 544
    .line 545
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    new-instance v1, La/cer0;

    .line 549
    .line 550
    invoke-direct {v1, v0}, La/cer0;-><init>(La/m470;)V

    .line 551
    .line 552
    .line 553
    return-object v1

    .line 554
    :pswitch_11
    move-object/from16 v0, p1

    .line 555
    .line 556
    check-cast v0, La/o8r0;

    .line 557
    .line 558
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    iget-object v1, v0, La/o8r0;->a:La/n8r0;

    .line 562
    .line 563
    iget v0, v0, La/o8r0;->b:I

    .line 564
    .line 565
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    if-eqz v1, :cond_4

    .line 570
    .line 571
    if-eq v1, v5, :cond_3

    .line 572
    .line 573
    if-ne v1, v4, :cond_2

    .line 574
    .line 575
    new-instance v6, La/mdm;

    .line 576
    .line 577
    sget-object v1, La/pb10;->c:La/xuz;

    .line 578
    .line 579
    sget-object v2, La/pb10;->g:La/pb10;

    .line 580
    .line 581
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    invoke-static {v2, v0}, La/xuz;->a(La/pb10;I)I

    .line 585
    .line 586
    .line 587
    move-result v7

    .line 588
    const-wide/16 v17, 0x0

    .line 589
    .line 590
    const/16 v19, 0x25e

    .line 591
    .line 592
    const/4 v8, 0x0

    .line 593
    const/4 v9, 0x0

    .line 594
    const/4 v10, 0x0

    .line 595
    const/4 v11, 0x0

    .line 596
    const v12, 0x7f1305c0

    .line 597
    .line 598
    .line 599
    const/4 v13, 0x0

    .line 600
    const v14, 0x7f131690

    .line 601
    .line 602
    .line 603
    const-wide/16 v15, 0x2710

    .line 604
    .line 605
    invoke-direct/range {v6 .. v19}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 606
    .line 607
    .line 608
    goto :goto_1

    .line 609
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 610
    .line 611
    .line 612
    const/4 v6, 0x0

    .line 613
    goto :goto_1

    .line 614
    :cond_3
    new-instance v7, La/mdm;

    .line 615
    .line 616
    sget-object v1, La/pb10;->c:La/xuz;

    .line 617
    .line 618
    sget-object v2, La/pb10;->g:La/pb10;

    .line 619
    .line 620
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    invoke-static {v2, v0}, La/xuz;->a(La/pb10;I)I

    .line 624
    .line 625
    .line 626
    move-result v8

    .line 627
    const-wide/16 v18, 0x0

    .line 628
    .line 629
    const/16 v20, 0x25e

    .line 630
    .line 631
    const/4 v9, 0x0

    .line 632
    const/4 v10, 0x0

    .line 633
    const/4 v11, 0x0

    .line 634
    const/4 v12, 0x0

    .line 635
    const v13, 0x7f130677

    .line 636
    .line 637
    .line 638
    const/4 v14, 0x0

    .line 639
    const v15, 0x7f131690

    .line 640
    .line 641
    .line 642
    const-wide/16 v16, 0x2710

    .line 643
    .line 644
    invoke-direct/range {v7 .. v20}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 645
    .line 646
    .line 647
    move-object v6, v7

    .line 648
    goto :goto_1

    .line 649
    :cond_4
    sget-object v10, La/pdm;->d:La/pdm;

    .line 650
    .line 651
    sget-object v0, La/pb10;->c:La/xuz;

    .line 652
    .line 653
    new-instance v8, La/mdm;

    .line 654
    .line 655
    const-wide/16 v19, 0x0

    .line 656
    .line 657
    const/16 v21, 0x3fc

    .line 658
    .line 659
    const v9, 0x7f130792

    .line 660
    .line 661
    .line 662
    const/4 v11, 0x0

    .line 663
    const/4 v12, 0x0

    .line 664
    const/4 v13, 0x0

    .line 665
    const/4 v14, 0x0

    .line 666
    const/4 v15, 0x0

    .line 667
    const/16 v16, 0x0

    .line 668
    .line 669
    const-wide/16 v17, 0x0

    .line 670
    .line 671
    invoke-direct/range {v8 .. v21}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 672
    .line 673
    .line 674
    move-object v6, v8

    .line 675
    :goto_1
    return-object v6

    .line 676
    :pswitch_12
    move-object/from16 v0, p1

    .line 677
    .line 678
    check-cast v0, La/qdr0;

    .line 679
    .line 680
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    sget-object v1, La/sre0;->a:La/tre0;

    .line 688
    .line 689
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    return-object v0

    .line 694
    :pswitch_13
    move-object/from16 v0, p1

    .line 695
    .line 696
    check-cast v0, La/qdr0;

    .line 697
    .line 698
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    invoke-interface {v0}, La/qdr0;->getKey()Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    return-object v0

    .line 706
    :pswitch_14
    move-object/from16 v0, p1

    .line 707
    .line 708
    check-cast v0, Landroid/view/View;

    .line 709
    .line 710
    sget-object v1, La/udr0;->O1:La/s2m0;

    .line 711
    .line 712
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 716
    .line 717
    new-instance v1, La/c6r;

    .line 718
    .line 719
    invoke-direct {v1, v0, v0}, La/c6r;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 720
    .line 721
    .line 722
    return-object v1

    .line 723
    :pswitch_15
    move-object/from16 v2, p1

    .line 724
    .line 725
    check-cast v2, La/fhl;

    .line 726
    .line 727
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    .line 729
    .line 730
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 731
    .line 732
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 737
    .line 738
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 739
    .line 740
    .line 741
    move-result-wide v3

    .line 742
    const/4 v12, 0x0

    .line 743
    const/16 v13, 0x7e

    .line 744
    .line 745
    const-wide/16 v5, 0x0

    .line 746
    .line 747
    const-wide/16 v7, 0x0

    .line 748
    .line 749
    const/4 v9, 0x0

    .line 750
    const/4 v10, 0x0

    .line 751
    const/4 v11, 0x0

    .line 752
    invoke-static/range {v2 .. v13}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 753
    .line 754
    .line 755
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 756
    .line 757
    return-object v0

    .line 758
    :pswitch_16
    move-object/from16 v0, p1

    .line 759
    .line 760
    check-cast v0, La/p6t0;

    .line 761
    .line 762
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    sget-object v1, La/sre0;->a:La/tre0;

    .line 770
    .line 771
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    return-object v0

    .line 776
    :pswitch_17
    move-object/from16 v0, p1

    .line 777
    .line 778
    check-cast v0, La/p6t0;

    .line 779
    .line 780
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    invoke-interface {v0}, La/p6t0;->getKey()Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    return-object v0

    .line 788
    :pswitch_18
    move-object/from16 v0, p1

    .line 789
    .line 790
    check-cast v0, La/h1b0;

    .line 791
    .line 792
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    const-class v0, La/h1b0;

    .line 796
    .line 797
    sget-object v1, La/sre0;->a:La/tre0;

    .line 798
    .line 799
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    return-object v0

    .line 804
    :pswitch_19
    move-object/from16 v0, p1

    .line 805
    .line 806
    check-cast v0, La/h1b0;

    .line 807
    .line 808
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    iget-wide v0, v0, La/h1b0;->a:J

    .line 812
    .line 813
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    return-object v0

    .line 818
    :pswitch_1a
    move-object/from16 v0, p1

    .line 819
    .line 820
    check-cast v0, La/qpo;

    .line 821
    .line 822
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    iget-wide v0, v0, La/qpo;->a:J

    .line 826
    .line 827
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    return-object v0

    .line 832
    :pswitch_1b
    move-object/from16 v0, p1

    .line 833
    .line 834
    check-cast v0, La/upk0;

    .line 835
    .line 836
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 837
    .line 838
    .line 839
    iget v0, v0, La/upk0;->a:I

    .line 840
    .line 841
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    return-object v0

    .line 846
    :pswitch_1c
    move-object/from16 v1, p1

    .line 847
    .line 848
    check-cast v1, La/fhl;

    .line 849
    .line 850
    sget-object v0, La/v9r0;->O1:La/j6m0;

    .line 851
    .line 852
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 856
    .line 857
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 862
    .line 863
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 864
    .line 865
    .line 866
    move-result-wide v2

    .line 867
    const/4 v11, 0x0

    .line 868
    const/16 v12, 0x7e

    .line 869
    .line 870
    const-wide/16 v4, 0x0

    .line 871
    .line 872
    const-wide/16 v6, 0x0

    .line 873
    .line 874
    const/4 v8, 0x0

    .line 875
    const/4 v9, 0x0

    .line 876
    const/4 v10, 0x0

    .line 877
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 878
    .line 879
    .line 880
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 881
    .line 882
    return-object v0

    .line 883
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
