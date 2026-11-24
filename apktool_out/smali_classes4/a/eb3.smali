.class public final La/eb3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eb3;->a:B

    iput-object p1, p0, La/eb3;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/eb3;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/high16 v3, 0x3f000000    # 0.5f

    .line 7
    .line 8
    iget-object p0, p0, La/eb3;->b:La/l7m0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, La/uag0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p1, La/uag0;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_1
    check-cast p1, La/uag0;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_2
    move-object v0, p1

    .line 77
    check-cast v0, La/fhl;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, La/y3d;

    .line 87
    .line 88
    iget-wide v1, p0, La/y3d;->a:J

    .line 89
    .line 90
    const/4 v7, 0x0

    .line 91
    const/16 v8, 0x7e

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    const-wide/16 v4, 0x0

    .line 95
    .line 96
    const/4 v6, 0x0

    .line 97
    invoke-static/range {v0 .. v8}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_3
    check-cast p1, La/uag0;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, Ljava/lang/Number;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    sub-float/2addr p0, v3

    .line 119
    div-float/2addr p0, v3

    .line 120
    invoke-static {p0, v2, v1}, La/l1e0;->c(FFF)F

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 125
    .line 126
    .line 127
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_4
    check-cast p1, La/uag0;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Ljava/lang/Number;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    cmpg-float v0, v0, v3

    .line 146
    .line 147
    if-gez v0, :cond_0

    .line 148
    .line 149
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    check-cast p0, Ljava/lang/Number;

    .line 154
    .line 155
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    div-float/2addr p0, v3

    .line 160
    invoke-static {p0, v2, v1}, La/l1e0;->c(FFF)F

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    sub-float/2addr v1, p0

    .line 165
    goto :goto_0

    .line 166
    :cond_0
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    check-cast p0, Ljava/lang/Number;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    div-float/2addr p0, v3

    .line 177
    invoke-static {p0, v2, v1}, La/l1e0;->c(FFF)F

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    :goto_0
    invoke-virtual {p1, v1}, La/uag0;->b(F)V

    .line 182
    .line 183
    .line 184
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_5
    move-object v0, p1

    .line 188
    check-cast v0, La/fhl;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    check-cast p0, La/y3d;

    .line 198
    .line 199
    iget-wide v1, p0, La/y3d;->a:J

    .line 200
    .line 201
    const/4 v7, 0x0

    .line 202
    const/16 v8, 0x7e

    .line 203
    .line 204
    const/4 v3, 0x0

    .line 205
    const-wide/16 v4, 0x0

    .line 206
    .line 207
    const/4 v6, 0x0

    .line 208
    invoke-static/range {v0 .. v8}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 209
    .line 210
    .line 211
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_6
    check-cast p1, La/pi9;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    new-instance v0, La/eb3;

    .line 220
    .line 221
    const/4 v1, 0x5

    .line 222
    invoke-direct {v0, p0, v1}, La/eb3;-><init>(La/l7m0;B)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v0}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    return-object p0

    .line 230
    :pswitch_7
    move-object v0, p1

    .line 231
    check-cast v0, La/fhl;

    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 237
    .line 238
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 243
    .line 244
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 245
    .line 246
    .line 247
    move-result-wide v1

    .line 248
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    check-cast p0, Ljava/lang/Number;

    .line 253
    .line 254
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    const/4 v10, 0x0

    .line 259
    const/16 v11, 0x76

    .line 260
    .line 261
    const-wide/16 v3, 0x0

    .line 262
    .line 263
    const-wide/16 v5, 0x0

    .line 264
    .line 265
    const/4 v8, 0x0

    .line 266
    const/4 v9, 0x0

    .line 267
    invoke-static/range {v0 .. v11}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 268
    .line 269
    .line 270
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_8
    move-object v0, p1

    .line 274
    check-cast v0, La/fhl;

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-interface {v0}, La/fhl;->d()J

    .line 280
    .line 281
    .line 282
    move-result-wide v4

    .line 283
    const/16 p1, 0x20

    .line 284
    .line 285
    shr-long/2addr v4, p1

    .line 286
    long-to-int v4, v4

    .line 287
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    cmpl-float v4, v4, v2

    .line 296
    .line 297
    const/4 v6, 0x0

    .line 298
    if-lez v4, :cond_1

    .line 299
    .line 300
    goto :goto_1

    .line 301
    :cond_1
    move-object v5, v6

    .line 302
    :goto_1
    if-eqz v5, :cond_2

    .line 303
    .line 304
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    goto :goto_2

    .line 309
    :cond_2
    move v4, v1

    .line 310
    :goto_2
    invoke-interface {v0}, La/fhl;->d()J

    .line 311
    .line 312
    .line 313
    move-result-wide v7

    .line 314
    const-wide v9, 0xffffffffL

    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    and-long/2addr v7, v9

    .line 320
    long-to-int v5, v7

    .line 321
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    cmpl-float v2, v5, v2

    .line 330
    .line 331
    if-lez v2, :cond_3

    .line 332
    .line 333
    move-object v6, v7

    .line 334
    :cond_3
    if-eqz v6, :cond_4

    .line 335
    .line 336
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    goto :goto_3

    .line 341
    :cond_4
    move v2, v1

    .line 342
    :goto_3
    mul-float/2addr v3, v4

    .line 343
    const v5, 0x3f333333    # 0.7f

    .line 344
    .line 345
    .line 346
    mul-float/2addr v5, v2

    .line 347
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    int-to-long v6, v3

    .line 352
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    int-to-long v11, v3

    .line 357
    shl-long v5, v6, p1

    .line 358
    .line 359
    and-long v7, v11, v9

    .line 360
    .line 361
    or-long/2addr v5, v7

    .line 362
    float-to-double v3, v4

    .line 363
    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    .line 364
    .line 365
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 366
    .line 367
    .line 368
    move-result-wide v3

    .line 369
    double-to-float p1, v3

    .line 370
    float-to-double v2, v2

    .line 371
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 372
    .line 373
    .line 374
    move-result-wide v2

    .line 375
    double-to-float v2, v2

    .line 376
    add-float/2addr p1, v2

    .line 377
    float-to-double v2, p1

    .line 378
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 379
    .line 380
    .line 381
    move-result-wide v2

    .line 382
    double-to-float p1, v2

    .line 383
    const/high16 v2, 0x40000000    # 2.0f

    .line 384
    .line 385
    div-float/2addr p1, v2

    .line 386
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 387
    .line 388
    sget-wide v2, La/hi0;->W:J

    .line 389
    .line 390
    new-instance v4, La/y3d;

    .line 391
    .line 392
    invoke-direct {v4, v2, v3}, La/y3d;-><init>(J)V

    .line 393
    .line 394
    .line 395
    sget-wide v2, La/hi0;->b:J

    .line 396
    .line 397
    new-instance v7, La/y3d;

    .line 398
    .line 399
    invoke-direct {v7, v2, v3}, La/y3d;-><init>(J)V

    .line 400
    .line 401
    .line 402
    filled-new-array {v4, v7}, [La/y3d;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    move v3, v1

    .line 411
    new-instance v1, La/ttd0;

    .line 412
    .line 413
    invoke-direct {v1, v2, v5, v6, p1}, La/ttd0;-><init>(Ljava/util/List;JF)V

    .line 414
    .line 415
    .line 416
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    check-cast p0, Ljava/lang/Number;

    .line 421
    .line 422
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 423
    .line 424
    .line 425
    move-result p0

    .line 426
    sub-float v6, v3, p0

    .line 427
    .line 428
    const/4 v9, 0x0

    .line 429
    const/16 v10, 0x76

    .line 430
    .line 431
    const-wide/16 v2, 0x0

    .line 432
    .line 433
    const-wide/16 v4, 0x0

    .line 434
    .line 435
    const/4 v7, 0x0

    .line 436
    const/4 v8, 0x0

    .line 437
    invoke-static/range {v0 .. v10}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 438
    .line 439
    .line 440
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 441
    .line 442
    return-object p0

    .line 443
    :pswitch_9
    check-cast p1, La/uag0;

    .line 444
    .line 445
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    check-cast p0, Ljava/lang/Number;

    .line 453
    .line 454
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 455
    .line 456
    .line 457
    move-result p0

    .line 458
    neg-float p0, p0

    .line 459
    invoke-virtual {p1, p0}, La/uag0;->I(F)V

    .line 460
    .line 461
    .line 462
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 463
    .line 464
    return-object p0

    .line 465
    :pswitch_a
    check-cast p1, La/uag0;

    .line 466
    .line 467
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    check-cast p0, Ljava/lang/Number;

    .line 475
    .line 476
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 477
    .line 478
    .line 479
    move-result p0

    .line 480
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 481
    .line 482
    .line 483
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 484
    .line 485
    return-object p0

    .line 486
    :pswitch_b
    check-cast p1, La/uag0;

    .line 487
    .line 488
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    check-cast p0, Ljava/lang/Number;

    .line 496
    .line 497
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 498
    .line 499
    .line 500
    move-result p0

    .line 501
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 502
    .line 503
    .line 504
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 505
    .line 506
    return-object p0

    .line 507
    :pswitch_c
    check-cast p1, La/uag0;

    .line 508
    .line 509
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object p0

    .line 516
    check-cast p0, Ljava/lang/Number;

    .line 517
    .line 518
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 519
    .line 520
    .line 521
    move-result p0

    .line 522
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 523
    .line 524
    .line 525
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 526
    .line 527
    return-object p0

    .line 528
    nop

    .line 529
    :pswitch_data_0
    .packed-switch 0x0
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
