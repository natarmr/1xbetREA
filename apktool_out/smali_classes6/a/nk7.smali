.class public final synthetic La/nk7;
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
    iput-byte p1, p0, La/nk7;->a:B

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
    iget-byte v0, v0, La/nk7;->a:B

    .line 4
    .line 5
    const/4 v1, 0x7

    .line 6
    const/high16 v2, 0x3f000000    # 0.5f

    .line 7
    .line 8
    const/4 v3, 0x6

    .line 9
    const/4 v4, 0x0

    .line 10
    const/16 v5, 0xfa

    .line 11
    .line 12
    const/high16 v6, 0x41800000    # 16.0f

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    const-wide v8, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const/16 v10, 0x20

    .line 21
    .line 22
    const/4 v11, 0x0

    .line 23
    const/4 v12, 0x0

    .line 24
    const/16 v13, 0xc

    .line 25
    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v14, p1

    .line 30
    .line 31
    check-cast v14, La/fhl;

    .line 32
    .line 33
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 37
    .line 38
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 39
    .line 40
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getOverlayBackground40-0d7_KjU()J

    .line 41
    .line 42
    .line 43
    move-result-wide v15

    .line 44
    const/16 v24, 0x0

    .line 45
    .line 46
    const/16 v25, 0x7e

    .line 47
    .line 48
    const-wide/16 v17, 0x0

    .line 49
    .line 50
    const-wide/16 v19, 0x0

    .line 51
    .line 52
    const/16 v21, 0x0

    .line 53
    .line 54
    const/16 v22, 0x0

    .line 55
    .line 56
    const/16 v23, 0x0

    .line 57
    .line 58
    invoke-static/range {v14 .. v25}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_0
    move-object/from16 v0, p1

    .line 65
    .line 66
    check-cast v0, Ljava/lang/Float;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    mul-float/2addr v0, v2

    .line 73
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    :pswitch_1
    move-object/from16 v0, p1

    .line 79
    .line 80
    check-cast v0, La/fhl;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-wide v1, La/y3d;->b:J

    .line 86
    .line 87
    const v3, 0x3e19999a    # 0.15f

    .line 88
    .line 89
    .line 90
    invoke-static {v3, v1, v2}, La/y3d;->c(FJ)J

    .line 91
    .line 92
    .line 93
    move-result-wide v1

    .line 94
    sget-object v3, La/qmk;->a:La/zcl;

    .line 95
    .line 96
    invoke-interface {v0, v11}, La/w6k;->w0(F)F

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    const/high16 v4, -0x3f400000    # -6.0f

    .line 105
    .line 106
    invoke-interface {v0, v4}, La/w6k;->w0(F)F

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    invoke-interface {v0}, La/fhl;->A0()La/nr;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v4}, La/nr;->i()La/x5a;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    invoke-static {}, La/saj;->D()La/ucs0;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    iget-object v5, v4, La/ucs0;->c:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v5, Landroid/graphics/Paint;

    .line 125
    .line 126
    cmpl-float v7, v3, v11

    .line 127
    .line 128
    if-lez v7, :cond_0

    .line 129
    .line 130
    new-instance v7, Landroid/graphics/BlurMaskFilter;

    .line 131
    .line 132
    sget-object v11, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 133
    .line 134
    invoke-direct {v7, v3, v11}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 138
    .line 139
    .line 140
    :cond_0
    invoke-static {v1, v2}, La/fbc;->U(J)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v0}, La/fhl;->d()J

    .line 148
    .line 149
    .line 150
    move-result-wide v1

    .line 151
    shr-long/2addr v1, v10

    .line 152
    long-to-int v1, v1

    .line 153
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    sub-float v15, v1, v13

    .line 158
    .line 159
    invoke-interface {v0}, La/fhl;->d()J

    .line 160
    .line 161
    .line 162
    move-result-wide v1

    .line 163
    and-long/2addr v1, v8

    .line 164
    long-to-int v1, v1

    .line 165
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 166
    .line 167
    .line 168
    move-result v16

    .line 169
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 170
    .line 171
    .line 172
    move-result v17

    .line 173
    invoke-interface {v0, v6}, La/w6k;->w0(F)F

    .line 174
    .line 175
    .line 176
    move-result v18

    .line 177
    move-object/from16 v19, v4

    .line 178
    .line 179
    invoke-interface/range {v12 .. v19}, La/x5a;->d(FFFFFFLa/ucs0;)V

    .line 180
    .line 181
    .line 182
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_2
    move-object/from16 v0, p1

    .line 186
    .line 187
    check-cast v0, La/a4x;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    new-instance v2, La/dil0;

    .line 193
    .line 194
    new-instance v3, La/zgl0;

    .line 195
    .line 196
    invoke-direct {v3}, La/zgl0;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-direct {v2, v12, v12, v3, v1}, La/dil0;-><init>(La/y9q0;La/y9q0;La/zgl0;I)V

    .line 200
    .line 201
    .line 202
    new-instance v1, La/zgl0;

    .line 203
    .line 204
    invoke-direct {v1}, La/zgl0;-><init>()V

    .line 205
    .line 206
    .line 207
    new-instance v3, La/z3n;

    .line 208
    .line 209
    invoke-direct {v3, v0, v1, v2, v13}, La/z3n;-><init>(La/a4x;La/zgl0;La/dil0;I)V

    .line 210
    .line 211
    .line 212
    return-object v3

    .line 213
    :pswitch_3
    move-object/from16 v0, p1

    .line 214
    .line 215
    check-cast v0, La/a4x;

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance v2, La/dil0;

    .line 221
    .line 222
    new-instance v3, La/zgl0;

    .line 223
    .line 224
    invoke-direct {v3}, La/zgl0;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-direct {v2, v12, v12, v3, v1}, La/dil0;-><init>(La/y9q0;La/y9q0;La/zgl0;I)V

    .line 228
    .line 229
    .line 230
    new-instance v1, La/zgl0;

    .line 231
    .line 232
    invoke-direct {v1}, La/zgl0;-><init>()V

    .line 233
    .line 234
    .line 235
    new-instance v3, La/z3n;

    .line 236
    .line 237
    invoke-direct {v3, v0, v1, v2, v13}, La/z3n;-><init>(La/a4x;La/zgl0;La/dil0;I)V

    .line 238
    .line 239
    .line 240
    return-object v3

    .line 241
    :pswitch_4
    move-object/from16 v0, p1

    .line 242
    .line 243
    check-cast v0, La/a4x;

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    new-instance v1, La/zgl0;

    .line 249
    .line 250
    invoke-direct {v1}, La/zgl0;-><init>()V

    .line 251
    .line 252
    .line 253
    new-instance v2, La/b4n;

    .line 254
    .line 255
    invoke-direct {v2, v0, v1, v13}, La/b4n;-><init>(La/a4x;La/zgl0;I)V

    .line 256
    .line 257
    .line 258
    return-object v2

    .line 259
    :pswitch_5
    move-object/from16 v0, p1

    .line 260
    .line 261
    check-cast v0, La/a4x;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    new-instance v1, La/zgl0;

    .line 267
    .line 268
    invoke-direct {v1}, La/zgl0;-><init>()V

    .line 269
    .line 270
    .line 271
    new-instance v2, La/c4n;

    .line 272
    .line 273
    invoke-direct {v2, v0, v1, v13}, La/c4n;-><init>(La/a4x;La/zgl0;I)V

    .line 274
    .line 275
    .line 276
    return-object v2

    .line 277
    :pswitch_6
    move-object/from16 v0, p1

    .line 278
    .line 279
    check-cast v0, La/a4x;

    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    new-instance v1, La/zgl0;

    .line 285
    .line 286
    invoke-direct {v1}, La/zgl0;-><init>()V

    .line 287
    .line 288
    .line 289
    new-instance v2, La/a4n;

    .line 290
    .line 291
    invoke-direct {v2, v0, v1, v13}, La/a4n;-><init>(La/a4x;La/ahl0;I)V

    .line 292
    .line 293
    .line 294
    return-object v2

    .line 295
    :pswitch_7
    move-object/from16 v0, p1

    .line 296
    .line 297
    check-cast v0, La/g7z;

    .line 298
    .line 299
    invoke-virtual {v0}, La/g7z;->a()V

    .line 300
    .line 301
    .line 302
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    return-object v0

    .line 305
    :pswitch_8
    move-object/from16 v0, p1

    .line 306
    .line 307
    check-cast v0, La/kg;

    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_5

    .line 317
    .line 318
    const/4 v1, 0x1

    .line 319
    if-eq v0, v1, :cond_4

    .line 320
    .line 321
    if-eq v0, v7, :cond_3

    .line 322
    .line 323
    const/4 v1, 0x3

    .line 324
    if-eq v0, v1, :cond_2

    .line 325
    .line 326
    const/4 v1, 0x4

    .line 327
    if-ne v0, v1, :cond_1

    .line 328
    .line 329
    sget-object v12, La/ijl;->e:La/ijl;

    .line 330
    .line 331
    goto :goto_0

    .line 332
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 333
    .line 334
    .line 335
    goto :goto_0

    .line 336
    :cond_2
    sget-object v12, La/ijl;->d:La/ijl;

    .line 337
    .line 338
    goto :goto_0

    .line 339
    :cond_3
    sget-object v12, La/ijl;->c:La/ijl;

    .line 340
    .line 341
    goto :goto_0

    .line 342
    :cond_4
    sget-object v12, La/ijl;->b:La/ijl;

    .line 343
    .line 344
    goto :goto_0

    .line 345
    :cond_5
    sget-object v12, La/ijl;->a:La/ijl;

    .line 346
    .line 347
    :goto_0
    return-object v12

    .line 348
    :pswitch_9
    move-object/from16 v0, p1

    .line 349
    .line 350
    check-cast v0, Ljava/lang/Throwable;

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 356
    .line 357
    .line 358
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 359
    .line 360
    return-object v0

    .line 361
    :pswitch_a
    if-nez p1, :cond_6

    .line 362
    .line 363
    sget-object v0, La/lj8;->O1:La/gl5;

    .line 364
    .line 365
    throw v12

    .line 366
    :cond_6
    new-instance v0, Ljava/lang/ClassCastException;

    .line 367
    .line 368
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 369
    .line 370
    .line 371
    throw v0

    .line 372
    :pswitch_b
    move-object/from16 v0, p1

    .line 373
    .line 374
    check-cast v0, Landroid/content/res/Resources;

    .line 375
    .line 376
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 377
    .line 378
    invoke-static {}, La/s6t0;->c()Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    return-object v0

    .line 387
    :pswitch_c
    move-object/from16 v0, p1

    .line 388
    .line 389
    check-cast v0, La/sl8;

    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    const-string v0, "bonus_item"

    .line 395
    .line 396
    return-object v0

    .line 397
    :pswitch_d
    move-object/from16 v0, p1

    .line 398
    .line 399
    check-cast v0, La/pi9;

    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 405
    .line 406
    sget-object v1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 407
    .line 408
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 409
    .line 410
    .line 411
    move-result-wide v13

    .line 412
    sget-object v1, La/qmk;->a:La/zcl;

    .line 413
    .line 414
    invoke-virtual {v0}, La/pi9;->getDensity()F

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    mul-float/2addr v1, v6

    .line 419
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    int-to-long v2, v2

    .line 424
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    int-to-long v4, v1

    .line 429
    shl-long v1, v2, v10

    .line 430
    .line 431
    and-long v3, v4, v8

    .line 432
    .line 433
    or-long v15, v1, v3

    .line 434
    .line 435
    new-instance v11, La/lf4;

    .line 436
    .line 437
    const/4 v12, 0x3

    .line 438
    invoke-direct/range {v11 .. v16}, La/lf4;-><init>(BJJ)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, v11}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    return-object v0

    .line 446
    :pswitch_e
    move-object/from16 v0, p1

    .line 447
    .line 448
    check-cast v0, La/pi9;

    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    sget-object v1, La/qmk;->a:La/zcl;

    .line 454
    .line 455
    invoke-virtual {v0}, La/pi9;->getDensity()F

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    mul-float/2addr v1, v6

    .line 460
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    int-to-long v2, v2

    .line 465
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    int-to-long v4, v1

    .line 470
    shl-long v1, v2, v10

    .line 471
    .line 472
    and-long v3, v4, v8

    .line 473
    .line 474
    or-long/2addr v1, v3

    .line 475
    new-instance v3, La/bx;

    .line 476
    .line 477
    invoke-direct {v3, v13, v1, v2}, La/bx;-><init>(BJ)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0, v3}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    return-object v0

    .line 485
    :pswitch_f
    move-object/from16 v0, p1

    .line 486
    .line 487
    check-cast v0, La/w6k;

    .line 488
    .line 489
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    sget-object v1, La/qmk;->a:La/zcl;

    .line 493
    .line 494
    const/high16 v1, 0x40800000    # 4.0f

    .line 495
    .line 496
    invoke-interface {v0, v1}, La/w6k;->T(F)I

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    neg-int v0, v0

    .line 501
    int-to-long v0, v0

    .line 502
    shl-long v2, v0, v10

    .line 503
    .line 504
    and-long/2addr v0, v8

    .line 505
    or-long/2addr v0, v2

    .line 506
    new-instance v2, La/ikx;

    .line 507
    .line 508
    invoke-direct {v2, v0, v1}, La/ikx;-><init>(J)V

    .line 509
    .line 510
    .line 511
    return-object v2

    .line 512
    :pswitch_10
    move-object/from16 v3, p1

    .line 513
    .line 514
    check-cast v3, La/fhl;

    .line 515
    .line 516
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 520
    .line 521
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack-0d7_KjU()J

    .line 522
    .line 523
    .line 524
    move-result-wide v0

    .line 525
    const v2, 0x3ee66666    # 0.45f

    .line 526
    .line 527
    .line 528
    invoke-static {v2, v0, v1}, La/y3d;->c(FJ)J

    .line 529
    .line 530
    .line 531
    move-result-wide v0

    .line 532
    new-instance v2, La/y3d;

    .line 533
    .line 534
    invoke-direct {v2, v0, v1}, La/y3d;-><init>(J)V

    .line 535
    .line 536
    .line 537
    sget-wide v0, La/y3d;->f:J

    .line 538
    .line 539
    new-instance v4, La/y3d;

    .line 540
    .line 541
    invoke-direct {v4, v0, v1}, La/y3d;-><init>(J)V

    .line 542
    .line 543
    .line 544
    filled-new-array {v2, v4}, [La/y3d;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-interface {v3}, La/fhl;->E0()J

    .line 553
    .line 554
    .line 555
    move-result-wide v1

    .line 556
    invoke-interface {v3}, La/fhl;->d()J

    .line 557
    .line 558
    .line 559
    move-result-wide v4

    .line 560
    invoke-static {v4, v5}, La/h7k0;->d(J)F

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    const/high16 v5, 0x40000000    # 2.0f

    .line 565
    .line 566
    div-float/2addr v4, v5

    .line 567
    new-instance v5, La/ttd0;

    .line 568
    .line 569
    invoke-direct {v5, v0, v1, v2, v4}, La/ttd0;-><init>(Ljava/util/List;JF)V

    .line 570
    .line 571
    .line 572
    const/4 v8, 0x0

    .line 573
    const/16 v9, 0x7e

    .line 574
    .line 575
    move-object v4, v5

    .line 576
    const/4 v5, 0x0

    .line 577
    const-wide/16 v6, 0x0

    .line 578
    .line 579
    invoke-static/range {v3 .. v9}, La/fhl;->O(La/fhl;La/ijj0;FJLa/vtm0;I)V

    .line 580
    .line 581
    .line 582
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 583
    .line 584
    return-object v0

    .line 585
    :pswitch_11
    move-object/from16 v0, p1

    .line 586
    .line 587
    check-cast v0, La/uag0;

    .line 588
    .line 589
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    const v1, 0x3e6147ae    # 0.22f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0, v1}, La/uag0;->y(F)V

    .line 596
    .line 597
    .line 598
    const/high16 v1, 0x3f800000    # 1.0f

    .line 599
    .line 600
    invoke-static {v2, v1}, La/osm0;->e(FF)J

    .line 601
    .line 602
    .line 603
    move-result-wide v1

    .line 604
    invoke-virtual {v0, v1, v2}, La/uag0;->G(J)V

    .line 605
    .line 606
    .line 607
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 608
    .line 609
    return-object v0

    .line 610
    :pswitch_12
    move-object/from16 v0, p1

    .line 611
    .line 612
    check-cast v0, La/j18;

    .line 613
    .line 614
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    iget-object v0, v0, La/j18;->b:Ljava/lang/String;

    .line 618
    .line 619
    return-object v0

    .line 620
    :pswitch_13
    move-object/from16 v1, p1

    .line 621
    .line 622
    check-cast v1, La/g7z;

    .line 623
    .line 624
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v1}, La/g7z;->a()V

    .line 628
    .line 629
    .line 630
    sget v0, La/d18;->a:F

    .line 631
    .line 632
    invoke-virtual {v1, v0}, La/g7z;->w0(F)F

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    sget-wide v2, La/y3d;->f:J

    .line 637
    .line 638
    new-instance v4, La/y3d;

    .line 639
    .line 640
    invoke-direct {v4, v2, v3}, La/y3d;-><init>(J)V

    .line 641
    .line 642
    .line 643
    sget-wide v5, La/y3d;->b:J

    .line 644
    .line 645
    new-instance v7, La/y3d;

    .line 646
    .line 647
    invoke-direct {v7, v5, v6}, La/y3d;-><init>(J)V

    .line 648
    .line 649
    .line 650
    filled-new-array {v4, v7}, [La/y3d;

    .line 651
    .line 652
    .line 653
    move-result-object v4

    .line 654
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 655
    .line 656
    .line 657
    move-result-object v4

    .line 658
    const/16 v7, 0x8

    .line 659
    .line 660
    invoke-static {v4, v11, v0, v7}, La/yk5;->g(Ljava/util/List;FFI)La/e900;

    .line 661
    .line 662
    .line 663
    move-result-object v12

    .line 664
    const/16 v20, 0x6

    .line 665
    .line 666
    const/16 v21, 0x3e

    .line 667
    .line 668
    const-wide/16 v13, 0x0

    .line 669
    .line 670
    const-wide/16 v15, 0x0

    .line 671
    .line 672
    const/16 v17, 0x0

    .line 673
    .line 674
    const/16 v18, 0x0

    .line 675
    .line 676
    const/16 v19, 0x0

    .line 677
    .line 678
    move-object v11, v1

    .line 679
    invoke-static/range {v11 .. v21}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 680
    .line 681
    .line 682
    new-instance v4, La/y3d;

    .line 683
    .line 684
    invoke-direct {v4, v5, v6}, La/y3d;-><init>(J)V

    .line 685
    .line 686
    .line 687
    new-instance v5, La/y3d;

    .line 688
    .line 689
    invoke-direct {v5, v2, v3}, La/y3d;-><init>(J)V

    .line 690
    .line 691
    .line 692
    filled-new-array {v4, v5}, [La/y3d;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    iget-object v3, v1, La/g7z;->a:La/a6a;

    .line 701
    .line 702
    invoke-interface {v3}, La/fhl;->d()J

    .line 703
    .line 704
    .line 705
    move-result-wide v4

    .line 706
    shr-long/2addr v4, v10

    .line 707
    long-to-int v4, v4

    .line 708
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 709
    .line 710
    .line 711
    move-result v4

    .line 712
    sub-float/2addr v4, v0

    .line 713
    invoke-interface {v3}, La/fhl;->d()J

    .line 714
    .line 715
    .line 716
    move-result-wide v5

    .line 717
    shr-long/2addr v5, v10

    .line 718
    long-to-int v0, v5

    .line 719
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 720
    .line 721
    .line 722
    move-result v0

    .line 723
    invoke-static {v2, v4, v0, v7}, La/yk5;->g(Ljava/util/List;FFI)La/e900;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    const/4 v10, 0x6

    .line 728
    const/16 v11, 0x3e

    .line 729
    .line 730
    const-wide/16 v3, 0x0

    .line 731
    .line 732
    const-wide/16 v5, 0x0

    .line 733
    .line 734
    const/4 v7, 0x0

    .line 735
    const/4 v8, 0x0

    .line 736
    const/4 v9, 0x0

    .line 737
    invoke-static/range {v1 .. v11}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 738
    .line 739
    .line 740
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 741
    .line 742
    return-object v0

    .line 743
    :pswitch_14
    move-object/from16 v0, p1

    .line 744
    .line 745
    check-cast v0, La/c53;

    .line 746
    .line 747
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    new-instance v0, La/lie;

    .line 751
    .line 752
    invoke-static {v5, v4, v12, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    invoke-static {v1, v11, v7}, La/kzn;->d(La/cfq;FI)La/pzn;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    invoke-static {v5, v4, v12, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 761
    .line 762
    .line 763
    move-result-object v2

    .line 764
    invoke-static {v2, v7}, La/kzn;->e(La/cfq;I)La/alo;

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    invoke-direct {v0, v1, v2, v12, v13}, La/lie;-><init>(La/pzn;La/alo;La/u7k0;I)V

    .line 769
    .line 770
    .line 771
    return-object v0

    .line 772
    :pswitch_15
    move-object/from16 v0, p1

    .line 773
    .line 774
    check-cast v0, La/c53;

    .line 775
    .line 776
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    new-instance v0, La/lie;

    .line 780
    .line 781
    invoke-static {v5, v4, v12, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 782
    .line 783
    .line 784
    move-result-object v1

    .line 785
    invoke-static {v1, v11, v7}, La/kzn;->d(La/cfq;FI)La/pzn;

    .line 786
    .line 787
    .line 788
    move-result-object v1

    .line 789
    invoke-static {v5, v4, v12, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 790
    .line 791
    .line 792
    move-result-object v2

    .line 793
    invoke-static {v2, v7}, La/kzn;->e(La/cfq;I)La/alo;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    invoke-direct {v0, v1, v2, v12, v13}, La/lie;-><init>(La/pzn;La/alo;La/u7k0;I)V

    .line 798
    .line 799
    .line 800
    return-object v0

    .line 801
    :pswitch_16
    move-object/from16 v0, p1

    .line 802
    .line 803
    check-cast v0, La/c53;

    .line 804
    .line 805
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    new-instance v0, La/lie;

    .line 809
    .line 810
    invoke-static {v5, v4, v12, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    invoke-static {v1, v11, v7}, La/kzn;->d(La/cfq;FI)La/pzn;

    .line 815
    .line 816
    .line 817
    move-result-object v1

    .line 818
    invoke-static {v5, v4, v12, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    invoke-static {v2, v7}, La/kzn;->e(La/cfq;I)La/alo;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    invoke-direct {v0, v1, v2, v12, v13}, La/lie;-><init>(La/pzn;La/alo;La/u7k0;I)V

    .line 827
    .line 828
    .line 829
    return-object v0

    .line 830
    :pswitch_17
    move-object/from16 v0, p1

    .line 831
    .line 832
    check-cast v0, La/c53;

    .line 833
    .line 834
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    new-instance v0, La/lie;

    .line 838
    .line 839
    invoke-static {v5, v4, v12, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 840
    .line 841
    .line 842
    move-result-object v1

    .line 843
    invoke-static {v1, v11, v7}, La/kzn;->d(La/cfq;FI)La/pzn;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    invoke-static {v5, v4, v12, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    invoke-static {v2, v7}, La/kzn;->e(La/cfq;I)La/alo;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    invoke-direct {v0, v1, v2, v12, v13}, La/lie;-><init>(La/pzn;La/alo;La/u7k0;I)V

    .line 856
    .line 857
    .line 858
    return-object v0

    .line 859
    :pswitch_18
    move-object/from16 v14, p1

    .line 860
    .line 861
    check-cast v14, La/fhl;

    .line 862
    .line 863
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 864
    .line 865
    .line 866
    sget-object v0, La/qmk;->a:La/zcl;

    .line 867
    .line 868
    invoke-interface {v14, v6}, La/w6k;->w0(F)F

    .line 869
    .line 870
    .line 871
    move-result v0

    .line 872
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 873
    .line 874
    .line 875
    move-result v1

    .line 876
    int-to-long v1, v1

    .line 877
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 878
    .line 879
    .line 880
    move-result v0

    .line 881
    int-to-long v3, v0

    .line 882
    shl-long v0, v1, v10

    .line 883
    .line 884
    and-long v2, v3, v8

    .line 885
    .line 886
    or-long v21, v0, v2

    .line 887
    .line 888
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 889
    .line 890
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 895
    .line 896
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 897
    .line 898
    .line 899
    move-result-wide v15

    .line 900
    const/16 v23, 0x0

    .line 901
    .line 902
    const/16 v24, 0xf6

    .line 903
    .line 904
    const-wide/16 v17, 0x0

    .line 905
    .line 906
    const-wide/16 v19, 0x0

    .line 907
    .line 908
    invoke-static/range {v14 .. v24}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 909
    .line 910
    .line 911
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 912
    .line 913
    return-object v0

    .line 914
    :pswitch_19
    move-object/from16 v0, p1

    .line 915
    .line 916
    check-cast v0, La/ry20;

    .line 917
    .line 918
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    iget-object v0, v0, La/ry20;->a:Ljava/lang/String;

    .line 922
    .line 923
    return-object v0

    .line 924
    :pswitch_1a
    move-object/from16 v0, p1

    .line 925
    .line 926
    check-cast v0, La/jvg0;

    .line 927
    .line 928
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    sget-object v1, La/sre0;->a:La/tre0;

    .line 936
    .line 937
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    return-object v0

    .line 942
    :pswitch_1b
    move-object/from16 v0, p1

    .line 943
    .line 944
    check-cast v0, La/jvg0;

    .line 945
    .line 946
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    invoke-interface {v0}, La/jvg0;->getItemId()I

    .line 950
    .line 951
    .line 952
    move-result v0

    .line 953
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    return-object v0

    .line 958
    :pswitch_1c
    move-object/from16 v1, p1

    .line 959
    .line 960
    check-cast v1, La/fhl;

    .line 961
    .line 962
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 966
    .line 967
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 972
    .line 973
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 974
    .line 975
    .line 976
    move-result-wide v2

    .line 977
    const/4 v11, 0x0

    .line 978
    const/16 v12, 0x7e

    .line 979
    .line 980
    const-wide/16 v4, 0x0

    .line 981
    .line 982
    const-wide/16 v6, 0x0

    .line 983
    .line 984
    const/4 v8, 0x0

    .line 985
    const/4 v9, 0x0

    .line 986
    const/4 v10, 0x0

    .line 987
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 988
    .line 989
    .line 990
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 991
    .line 992
    return-object v0

    .line 993
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
