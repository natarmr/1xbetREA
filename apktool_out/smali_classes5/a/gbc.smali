.class public final synthetic La/gbc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(ZJ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/gbc;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, La/gbc;->b:J

    iput-boolean p1, p0, La/gbc;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(ZJB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/gbc;->a:B

    iput-boolean p1, p0, La/gbc;->c:Z

    iput-wide p2, p0, La/gbc;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gbc;->a:B

    .line 4
    .line 5
    const/high16 v3, 0x41b00000    # 22.0f

    .line 6
    .line 7
    const/high16 v4, 0x41880000    # 17.0f

    .line 8
    .line 9
    const/high16 v5, 0x42000000    # 32.0f

    .line 10
    .line 11
    const/high16 v6, 0x41900000    # 18.0f

    .line 12
    .line 13
    const/high16 v7, 0x40a00000    # 5.0f

    .line 14
    .line 15
    const/high16 v8, 0x41c00000    # 24.0f

    .line 16
    .line 17
    iget-wide v9, v0, La/gbc;->b:J

    .line 18
    .line 19
    const/high16 v11, 0x43b40000    # 360.0f

    .line 20
    .line 21
    const/4 v12, 0x0

    .line 22
    const/high16 v13, 0x40000000    # 2.0f

    .line 23
    .line 24
    const/high16 v14, 0x40800000    # 4.0f

    .line 25
    .line 26
    const/high16 v15, 0x3f800000    # 1.0f

    .line 27
    .line 28
    const-wide v16, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const/16 v18, 0x20

    .line 34
    .line 35
    const/high16 v19, 0x41000000    # 8.0f

    .line 36
    .line 37
    iget-boolean v2, v0, La/gbc;->c:Z

    .line 38
    .line 39
    packed-switch v1, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, La/pi9;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    sget-object v3, La/qmk;->a:La/zcl;

    .line 50
    .line 51
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    mul-float v24, v3, v15

    .line 56
    .line 57
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    mul-float/2addr v3, v8

    .line 62
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    mul-float/2addr v4, v7

    .line 67
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    mul-float/2addr v5, v14

    .line 72
    mul-float/2addr v5, v13

    .line 73
    sub-float v25, v3, v5

    .line 74
    .line 75
    if-eqz v2, :cond_0

    .line 76
    .line 77
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 78
    .line 79
    invoke-interface {v2}, La/y99;->d()J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    shr-long v7, v7, v18

    .line 84
    .line 85
    long-to-int v2, v7

    .line 86
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    :cond_0
    move/from16 v22, v12

    .line 91
    .line 92
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    mul-float/2addr v2, v6

    .line 97
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    mul-float/2addr v5, v14

    .line 102
    add-float/2addr v5, v2

    .line 103
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    mul-float/2addr v2, v14

    .line 108
    add-float v23, v2, v5

    .line 109
    .line 110
    add-float v4, v23, v4

    .line 111
    .line 112
    add-float v28, v4, v3

    .line 113
    .line 114
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    mul-float/2addr v2, v11

    .line 119
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    int-to-long v3, v3

    .line 124
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    int-to-long v5, v2

    .line 129
    shl-long v2, v3, v18

    .line 130
    .line 131
    and-long v4, v5, v16

    .line 132
    .line 133
    or-long v26, v2, v4

    .line 134
    .line 135
    new-instance v19, La/etq;

    .line 136
    .line 137
    const/16 v29, 0x3

    .line 138
    .line 139
    iget-wide v2, v0, La/gbc;->b:J

    .line 140
    .line 141
    move-wide/from16 v20, v2

    .line 142
    .line 143
    invoke-direct/range {v19 .. v29}, La/etq;-><init>(JFFFFJFB)V

    .line 144
    .line 145
    .line 146
    move-object/from16 v0, v19

    .line 147
    .line 148
    invoke-virtual {v1, v0}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0

    .line 153
    :pswitch_0
    move-object/from16 v1, p1

    .line 154
    .line 155
    check-cast v1, La/pi9;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    sget-object v6, La/qmk;->a:La/zcl;

    .line 161
    .line 162
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    mul-float v25, v6, v15

    .line 167
    .line 168
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    mul-float/2addr v6, v5

    .line 173
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    mul-float/2addr v5, v4

    .line 178
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    mul-float/2addr v4, v14

    .line 183
    mul-float/2addr v13, v4

    .line 184
    sub-float v26, v6, v13

    .line 185
    .line 186
    if-eqz v2, :cond_1

    .line 187
    .line 188
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 189
    .line 190
    invoke-interface {v2}, La/y99;->d()J

    .line 191
    .line 192
    .line 193
    move-result-wide v7

    .line 194
    shr-long v7, v7, v18

    .line 195
    .line 196
    long-to-int v2, v7

    .line 197
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    :cond_1
    move/from16 v23, v12

    .line 202
    .line 203
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    mul-float/2addr v2, v3

    .line 208
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    mul-float v3, v3, v19

    .line 213
    .line 214
    add-float/2addr v3, v2

    .line 215
    add-float v24, v3, v4

    .line 216
    .line 217
    add-float v5, v24, v5

    .line 218
    .line 219
    add-float v29, v5, v6

    .line 220
    .line 221
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    mul-float/2addr v2, v11

    .line 226
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    int-to-long v3, v3

    .line 231
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    int-to-long v5, v2

    .line 236
    shl-long v2, v3, v18

    .line 237
    .line 238
    and-long v4, v5, v16

    .line 239
    .line 240
    or-long v27, v2, v4

    .line 241
    .line 242
    new-instance v20, La/etq;

    .line 243
    .line 244
    const/16 v30, 0x2

    .line 245
    .line 246
    iget-wide v2, v0, La/gbc;->b:J

    .line 247
    .line 248
    move-wide/from16 v21, v2

    .line 249
    .line 250
    invoke-direct/range {v20 .. v30}, La/etq;-><init>(JFFFFJFB)V

    .line 251
    .line 252
    .line 253
    move-object/from16 v0, v20

    .line 254
    .line 255
    invoke-virtual {v1, v0}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    return-object v0

    .line 260
    :pswitch_1
    move-object/from16 v1, p1

    .line 261
    .line 262
    check-cast v1, La/fhl;

    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    if-eqz v2, :cond_2

    .line 268
    .line 269
    :goto_0
    move-wide v2, v9

    .line 270
    goto :goto_1

    .line 271
    :cond_2
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 272
    .line 273
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 278
    .line 279
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 280
    .line 281
    .line 282
    move-result-wide v9

    .line 283
    goto :goto_0

    .line 284
    :goto_1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 285
    .line 286
    const/high16 v0, 0x41800000    # 16.0f

    .line 287
    .line 288
    invoke-interface {v1, v0}, La/w6k;->w0(F)F

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    int-to-long v4, v4

    .line 297
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    int-to-long v6, v0

    .line 302
    shl-long v4, v4, v18

    .line 303
    .line 304
    and-long v6, v6, v16

    .line 305
    .line 306
    or-long v8, v4, v6

    .line 307
    .line 308
    const/4 v10, 0x0

    .line 309
    const/16 v11, 0xf6

    .line 310
    .line 311
    const-wide/16 v4, 0x0

    .line 312
    .line 313
    const-wide/16 v6, 0x0

    .line 314
    .line 315
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 316
    .line 317
    .line 318
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 319
    .line 320
    return-object v0

    .line 321
    :pswitch_2
    move-object/from16 v1, p1

    .line 322
    .line 323
    check-cast v1, La/pi9;

    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    sget-object v6, La/qmk;->a:La/zcl;

    .line 329
    .line 330
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    mul-float v25, v6, v15

    .line 335
    .line 336
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 337
    .line 338
    .line 339
    move-result v6

    .line 340
    mul-float/2addr v6, v5

    .line 341
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    mul-float/2addr v5, v4

    .line 346
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    mul-float/2addr v4, v14

    .line 351
    mul-float/2addr v13, v4

    .line 352
    sub-float v26, v6, v13

    .line 353
    .line 354
    if-eqz v2, :cond_3

    .line 355
    .line 356
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 357
    .line 358
    invoke-interface {v2}, La/y99;->d()J

    .line 359
    .line 360
    .line 361
    move-result-wide v7

    .line 362
    shr-long v7, v7, v18

    .line 363
    .line 364
    long-to-int v2, v7

    .line 365
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 366
    .line 367
    .line 368
    move-result v12

    .line 369
    :cond_3
    move/from16 v23, v12

    .line 370
    .line 371
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    mul-float/2addr v2, v3

    .line 376
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    mul-float v3, v3, v19

    .line 381
    .line 382
    add-float/2addr v3, v2

    .line 383
    add-float v24, v3, v4

    .line 384
    .line 385
    add-float v5, v24, v5

    .line 386
    .line 387
    add-float v29, v5, v6

    .line 388
    .line 389
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    mul-float/2addr v2, v11

    .line 394
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    int-to-long v3, v3

    .line 399
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    int-to-long v5, v2

    .line 404
    shl-long v2, v3, v18

    .line 405
    .line 406
    and-long v4, v5, v16

    .line 407
    .line 408
    or-long v27, v2, v4

    .line 409
    .line 410
    new-instance v20, La/etq;

    .line 411
    .line 412
    const/16 v30, 0x1

    .line 413
    .line 414
    iget-wide v2, v0, La/gbc;->b:J

    .line 415
    .line 416
    move-wide/from16 v21, v2

    .line 417
    .line 418
    invoke-direct/range {v20 .. v30}, La/etq;-><init>(JFFFFJFB)V

    .line 419
    .line 420
    .line 421
    move-object/from16 v0, v20

    .line 422
    .line 423
    invoke-virtual {v1, v0}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    return-object v0

    .line 428
    :pswitch_3
    move-object/from16 v1, p1

    .line 429
    .line 430
    check-cast v1, La/pi9;

    .line 431
    .line 432
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    sget-object v3, La/qmk;->a:La/zcl;

    .line 436
    .line 437
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    mul-float v24, v3, v15

    .line 442
    .line 443
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    mul-float/2addr v3, v8

    .line 448
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 449
    .line 450
    .line 451
    move-result v4

    .line 452
    mul-float/2addr v4, v7

    .line 453
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 454
    .line 455
    .line 456
    move-result v5

    .line 457
    mul-float/2addr v5, v14

    .line 458
    mul-float/2addr v5, v13

    .line 459
    sub-float v25, v3, v5

    .line 460
    .line 461
    if-eqz v2, :cond_4

    .line 462
    .line 463
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 464
    .line 465
    invoke-interface {v2}, La/y99;->d()J

    .line 466
    .line 467
    .line 468
    move-result-wide v7

    .line 469
    shr-long v7, v7, v18

    .line 470
    .line 471
    long-to-int v2, v7

    .line 472
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 473
    .line 474
    .line 475
    move-result v12

    .line 476
    :cond_4
    move/from16 v22, v12

    .line 477
    .line 478
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    mul-float/2addr v2, v6

    .line 483
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 484
    .line 485
    .line 486
    move-result v5

    .line 487
    mul-float/2addr v5, v14

    .line 488
    add-float/2addr v5, v2

    .line 489
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    mul-float/2addr v2, v14

    .line 494
    add-float v23, v2, v5

    .line 495
    .line 496
    add-float v4, v23, v4

    .line 497
    .line 498
    add-float v28, v4, v3

    .line 499
    .line 500
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    mul-float/2addr v2, v11

    .line 505
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 506
    .line 507
    .line 508
    move-result v3

    .line 509
    int-to-long v3, v3

    .line 510
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    int-to-long v5, v2

    .line 515
    shl-long v2, v3, v18

    .line 516
    .line 517
    and-long v4, v5, v16

    .line 518
    .line 519
    or-long v26, v2, v4

    .line 520
    .line 521
    new-instance v19, La/etq;

    .line 522
    .line 523
    const/16 v29, 0x0

    .line 524
    .line 525
    iget-wide v2, v0, La/gbc;->b:J

    .line 526
    .line 527
    move-wide/from16 v20, v2

    .line 528
    .line 529
    invoke-direct/range {v19 .. v29}, La/etq;-><init>(JFFFFJFB)V

    .line 530
    .line 531
    .line 532
    move-object/from16 v0, v19

    .line 533
    .line 534
    invoke-virtual {v1, v0}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    return-object v0

    .line 539
    :pswitch_4
    move-object/from16 v0, p1

    .line 540
    .line 541
    check-cast v0, La/lno;

    .line 542
    .line 543
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    new-instance v1, La/lno;

    .line 547
    .line 548
    iget-object v0, v0, La/lno;->a:Ljava/util/Map;

    .line 549
    .line 550
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    new-instance v4, Lkotlin/Pair;

    .line 559
    .line 560
    invoke-direct {v4, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    invoke-static {v0, v4}, La/xp20;->k(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    const/4 v2, 0x1

    .line 568
    invoke-direct {v1, v0, v2}, La/lno;-><init>(Ljava/util/Map;Z)V

    .line 569
    .line 570
    .line 571
    return-object v1

    .line 572
    :pswitch_5
    move-object/from16 v0, p1

    .line 573
    .line 574
    check-cast v0, La/abi0;

    .line 575
    .line 576
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    invoke-static {v0, v2}, La/yai0;->f(La/abi0;Z)V

    .line 580
    .line 581
    .line 582
    invoke-static {v0, v9, v10}, La/cbi0;->a(La/abi0;J)V

    .line 583
    .line 584
    .line 585
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 586
    .line 587
    return-object v0

    .line 588
    nop

    .line 589
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
