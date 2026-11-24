.class public final synthetic La/d69;
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
    iput-byte p1, p0, La/d69;->a:B

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
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/d69;->a:B

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const v3, 0x7f070717

    .line 9
    .line 10
    .line 11
    const/high16 v4, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const-wide v5, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const/16 v7, 0x20

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x0

    .line 22
    const/16 v10, 0x190

    .line 23
    .line 24
    const/4 v11, 0x2

    .line 25
    const/4 v12, 0x6

    .line 26
    const/4 v13, 0x0

    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object v0, v1

    .line 31
    check-cast v0, Ljava/lang/Throwable;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_0
    move-object v0, v1

    .line 43
    check-cast v0, La/ou90;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_1
    move-object v0, v1

    .line 52
    check-cast v0, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->f:I

    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_2
    move-object v0, v1

    .line 63
    check-cast v0, La/dja;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :pswitch_3
    move-object v0, v1

    .line 74
    check-cast v0, La/sjd;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v1, La/asa;

    .line 80
    .line 81
    invoke-direct {v1, v0}, La/asa;-><init>(La/sjd;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :pswitch_4
    move-object v2, v1

    .line 86
    check-cast v2, La/fhl;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 92
    .line 93
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 98
    .line 99
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 100
    .line 101
    .line 102
    move-result-wide v3

    .line 103
    const/4 v12, 0x0

    .line 104
    const/16 v13, 0x7e

    .line 105
    .line 106
    const-wide/16 v5, 0x0

    .line 107
    .line 108
    const-wide/16 v7, 0x0

    .line 109
    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v10, 0x0

    .line 112
    const/4 v11, 0x0

    .line 113
    invoke-static/range {v2 .. v13}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 114
    .line 115
    .line 116
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_5
    move-object v0, v1

    .line 120
    check-cast v0, La/c53;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {v10, v13, v9, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0, v8, v11}, La/kzn;->d(La/cfq;FI)La/pzn;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v10, v13, v9, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-static {v1, v11}, La/kzn;->e(La/cfq;I)La/alo;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v0, v1}, La/ay3;->e0(La/pzn;La/alo;)La/lie;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    return-object v0

    .line 146
    :pswitch_6
    move-object v0, v1

    .line 147
    check-cast v0, La/oc90;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-interface {v0}, La/oc90;->getKey()I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    return-object v0

    .line 161
    :pswitch_7
    move-object v0, v1

    .line 162
    check-cast v0, La/c53;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {v10, v13, v9, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-static {v0, v8, v11}, La/kzn;->d(La/cfq;FI)La/pzn;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v10, v13, v9, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-static {v1, v11}, La/kzn;->e(La/cfq;I)La/alo;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-static {v0, v1}, La/ay3;->e0(La/pzn;La/alo;)La/lie;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    :pswitch_8
    move-object v0, v1

    .line 189
    check-cast v0, La/kc90;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-interface {v0}, La/kc90;->getKey()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    return-object v0

    .line 203
    :pswitch_9
    check-cast v1, La/fhl;

    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 209
    .line 210
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack80-0d7_KjU()J

    .line 211
    .line 212
    .line 213
    move-result-wide v9

    .line 214
    invoke-interface {v1}, La/fhl;->d()J

    .line 215
    .line 216
    .line 217
    move-result-wide v2

    .line 218
    shr-long/2addr v2, v7

    .line 219
    long-to-int v2, v2

    .line 220
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    sget-object v3, La/qmk;->a:La/zcl;

    .line 225
    .line 226
    const/high16 v3, 0x41b00000    # 22.0f

    .line 227
    .line 228
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    int-to-long v11, v2

    .line 237
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    int-to-long v2, v2

    .line 242
    shl-long/2addr v11, v7

    .line 243
    and-long/2addr v2, v5

    .line 244
    or-long v13, v11, v2

    .line 245
    .line 246
    const/high16 v2, 0x41000000    # 8.0f

    .line 247
    .line 248
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    int-to-long v11, v8

    .line 257
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    move-wide/from16 v19, v5

    .line 262
    .line 263
    int-to-long v5, v3

    .line 264
    shl-long/2addr v11, v7

    .line 265
    and-long v5, v5, v19

    .line 266
    .line 267
    or-long v15, v11, v5

    .line 268
    .line 269
    const/16 v17, 0x0

    .line 270
    .line 271
    const/16 v18, 0xf2

    .line 272
    .line 273
    const-wide/16 v11, 0x0

    .line 274
    .line 275
    move-object v8, v1

    .line 276
    invoke-static/range {v8 .. v18}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 284
    .line 285
    .line 286
    move-result-wide v5

    .line 287
    const/high16 v0, 0x428c0000    # 70.0f

    .line 288
    .line 289
    invoke-interface {v1, v0}, La/w6k;->w0(F)F

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    int-to-long v8, v3

    .line 298
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    int-to-long v10, v0

    .line 303
    shl-long/2addr v8, v7

    .line 304
    and-long v10, v10, v19

    .line 305
    .line 306
    or-long/2addr v8, v10

    .line 307
    invoke-interface {v1}, La/fhl;->d()J

    .line 308
    .line 309
    .line 310
    move-result-wide v10

    .line 311
    shr-long/2addr v10, v7

    .line 312
    long-to-int v0, v10

    .line 313
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    const/high16 v3, 0x40000000    # 2.0f

    .line 318
    .line 319
    mul-float/2addr v2, v3

    .line 320
    sub-float/2addr v0, v2

    .line 321
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    int-to-long v3, v0

    .line 330
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    int-to-long v10, v0

    .line 335
    shl-long v2, v3, v7

    .line 336
    .line 337
    and-long v10, v10, v19

    .line 338
    .line 339
    or-long/2addr v2, v10

    .line 340
    const/high16 v0, 0x43b40000    # 360.0f

    .line 341
    .line 342
    invoke-interface {v1, v0}, La/w6k;->w0(F)F

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    int-to-long v10, v4

    .line 351
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    int-to-long v12, v0

    .line 356
    shl-long/2addr v10, v7

    .line 357
    and-long v12, v12, v19

    .line 358
    .line 359
    or-long/2addr v10, v12

    .line 360
    move-wide/from16 v24, v5

    .line 361
    .line 362
    move-wide v6, v2

    .line 363
    move-wide/from16 v2, v24

    .line 364
    .line 365
    move-wide v4, v8

    .line 366
    move-wide v8, v10

    .line 367
    const/4 v10, 0x0

    .line 368
    const/16 v11, 0xf0

    .line 369
    .line 370
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 371
    .line 372
    .line 373
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    return-object v0

    .line 376
    :pswitch_a
    move-wide/from16 v19, v5

    .line 377
    .line 378
    move-object v0, v1

    .line 379
    check-cast v0, La/pi9;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    sget-object v1, La/qmk;->a:La/zcl;

    .line 385
    .line 386
    const/high16 v1, 0x41200000    # 10.0f

    .line 387
    .line 388
    invoke-virtual {v0}, La/pi9;->getDensity()F

    .line 389
    .line 390
    .line 391
    move-result v2

    .line 392
    mul-float/2addr v2, v1

    .line 393
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    int-to-long v5, v1

    .line 398
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    int-to-long v1, v1

    .line 403
    shl-long/2addr v5, v7

    .line 404
    and-long v1, v1, v19

    .line 405
    .line 406
    or-long/2addr v1, v5

    .line 407
    new-instance v5, La/vtm0;

    .line 408
    .line 409
    invoke-virtual {v0}, La/pi9;->getDensity()F

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    mul-float v6, v3, v4

    .line 414
    .line 415
    const/4 v10, 0x0

    .line 416
    const/16 v11, 0x1e

    .line 417
    .line 418
    const/4 v7, 0x0

    .line 419
    const/4 v8, 0x0

    .line 420
    const/4 v9, 0x0

    .line 421
    invoke-direct/range {v5 .. v11}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 422
    .line 423
    .line 424
    new-instance v3, La/rja;

    .line 425
    .line 426
    invoke-direct {v3, v1, v2, v5, v13}, La/rja;-><init>(JLa/vtm0;B)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0, v3}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    return-object v0

    .line 434
    :pswitch_b
    move-object v2, v1

    .line 435
    check-cast v2, La/cp;

    .line 436
    .line 437
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    iget-object v0, v2, La/cp;->w:Landroid/content/Context;

    .line 441
    .line 442
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 447
    .line 448
    .line 449
    move-result v13

    .line 450
    new-instance v12, La/qmk0;

    .line 451
    .line 452
    const/16 v20, 0x0

    .line 453
    .line 454
    const/16 v21, 0x1de

    .line 455
    .line 456
    const/4 v14, 0x0

    .line 457
    const/4 v15, 0x0

    .line 458
    const/16 v16, 0x0

    .line 459
    .line 460
    const/16 v17, 0x0

    .line 461
    .line 462
    const/16 v18, 0x1

    .line 463
    .line 464
    const/16 v19, 0x0

    .line 465
    .line 466
    invoke-direct/range {v12 .. v21}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 467
    .line 468
    .line 469
    new-instance v3, La/gkz;

    .line 470
    .line 471
    invoke-direct {v3}, La/gkz;-><init>()V

    .line 472
    .line 473
    .line 474
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 475
    .line 476
    check-cast v0, La/msx;

    .line 477
    .line 478
    iget-object v1, v0, La/msx;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 479
    .line 480
    invoke-virtual {v1, v12}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 481
    .line 482
    .line 483
    iget-object v1, v0, La/msx;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 484
    .line 485
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 486
    .line 487
    .line 488
    new-instance v4, La/gkz;

    .line 489
    .line 490
    invoke-direct {v4}, La/gkz;-><init>()V

    .line 491
    .line 492
    .line 493
    iget-object v0, v0, La/msx;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 494
    .line 495
    invoke-virtual {v0, v12}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 499
    .line 500
    .line 501
    new-instance v5, La/nka;

    .line 502
    .line 503
    invoke-direct {v5}, La/nka;-><init>()V

    .line 504
    .line 505
    .line 506
    new-instance v6, La/nka;

    .line 507
    .line 508
    invoke-direct {v6}, La/nka;-><init>()V

    .line 509
    .line 510
    .line 511
    iput-object v0, v5, La/nka;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 512
    .line 513
    iput-object v6, v5, La/nka;->c:La/nka;

    .line 514
    .line 515
    iput-object v1, v6, La/nka;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 516
    .line 517
    iput-object v5, v6, La/nka;->c:La/nka;

    .line 518
    .line 519
    new-instance v7, La/kja;

    .line 520
    .line 521
    invoke-direct {v7, v2, v11}, La/kja;-><init>(La/cp;B)V

    .line 522
    .line 523
    .line 524
    iput-object v7, v5, La/nka;->a:Lkotlin/jvm/functions/Function2;

    .line 525
    .line 526
    new-instance v7, La/kja;

    .line 527
    .line 528
    const/4 v8, 0x3

    .line 529
    invoke-direct {v7, v2, v8}, La/kja;-><init>(La/cp;B)V

    .line 530
    .line 531
    .line 532
    iput-object v7, v6, La/nka;->a:Lkotlin/jvm/functions/Function2;

    .line 533
    .line 534
    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 538
    .line 539
    .line 540
    new-instance v1, La/lja;

    .line 541
    .line 542
    const/4 v6, 0x1

    .line 543
    move-object v5, v2

    .line 544
    invoke-direct/range {v1 .. v6}, La/lja;-><init>(La/cp;La/gkz;La/gkz;La/cp;B)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 548
    .line 549
    .line 550
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    return-object v0

    .line 553
    :pswitch_c
    move-object v0, v1

    .line 554
    check-cast v0, La/cp;

    .line 555
    .line 556
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    iget-object v1, v0, La/cp;->w:Landroid/content/Context;

    .line 560
    .line 561
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 566
    .line 567
    .line 568
    move-result v15

    .line 569
    new-instance v14, La/qmk0;

    .line 570
    .line 571
    const/16 v22, 0x0

    .line 572
    .line 573
    const/16 v23, 0x1de

    .line 574
    .line 575
    const/16 v16, 0x0

    .line 576
    .line 577
    const/16 v17, 0x0

    .line 578
    .line 579
    const/16 v18, 0x0

    .line 580
    .line 581
    const/16 v19, 0x0

    .line 582
    .line 583
    const/16 v20, 0x1

    .line 584
    .line 585
    const/16 v21, 0x0

    .line 586
    .line 587
    invoke-direct/range {v14 .. v23}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 588
    .line 589
    .line 590
    new-instance v3, La/gkz;

    .line 591
    .line 592
    invoke-direct {v3}, La/gkz;-><init>()V

    .line 593
    .line 594
    .line 595
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 596
    .line 597
    check-cast v1, La/msx;

    .line 598
    .line 599
    iget-object v4, v1, La/msx;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 600
    .line 601
    invoke-virtual {v4, v14}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 602
    .line 603
    .line 604
    iget-object v4, v1, La/msx;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 605
    .line 606
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 607
    .line 608
    .line 609
    new-instance v5, La/gkz;

    .line 610
    .line 611
    invoke-direct {v5}, La/gkz;-><init>()V

    .line 612
    .line 613
    .line 614
    iget-object v1, v1, La/msx;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 615
    .line 616
    invoke-virtual {v1, v14}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 620
    .line 621
    .line 622
    new-instance v6, La/nka;

    .line 623
    .line 624
    invoke-direct {v6}, La/nka;-><init>()V

    .line 625
    .line 626
    .line 627
    new-instance v7, La/nka;

    .line 628
    .line 629
    invoke-direct {v7}, La/nka;-><init>()V

    .line 630
    .line 631
    .line 632
    iput-object v1, v6, La/nka;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 633
    .line 634
    iput-object v7, v6, La/nka;->c:La/nka;

    .line 635
    .line 636
    iput-object v4, v7, La/nka;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 637
    .line 638
    iput-object v6, v7, La/nka;->c:La/nka;

    .line 639
    .line 640
    new-instance v8, La/kja;

    .line 641
    .line 642
    invoke-direct {v8, v0, v13}, La/kja;-><init>(La/cp;B)V

    .line 643
    .line 644
    .line 645
    iput-object v8, v6, La/nka;->a:Lkotlin/jvm/functions/Function2;

    .line 646
    .line 647
    new-instance v8, La/kja;

    .line 648
    .line 649
    invoke-direct {v8, v0, v2}, La/kja;-><init>(La/cp;B)V

    .line 650
    .line 651
    .line 652
    iput-object v8, v7, La/nka;->a:Lkotlin/jvm/functions/Function2;

    .line 653
    .line 654
    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v1, v7}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 658
    .line 659
    .line 660
    new-instance v1, La/lja;

    .line 661
    .line 662
    const/4 v6, 0x0

    .line 663
    move-object v4, v5

    .line 664
    move-object v5, v0

    .line 665
    move-object v2, v0

    .line 666
    invoke-direct/range {v1 .. v6}, La/lja;-><init>(La/cp;La/gkz;La/gkz;La/cp;B)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v2, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 670
    .line 671
    .line 672
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 673
    .line 674
    return-object v0

    .line 675
    :pswitch_d
    move-object v0, v1

    .line 676
    check-cast v0, Ljava/lang/Throwable;

    .line 677
    .line 678
    sget v1, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->x:I

    .line 679
    .line 680
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 684
    .line 685
    return-object v0

    .line 686
    :pswitch_e
    move-object v0, v1

    .line 687
    check-cast v0, La/cp;

    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    new-instance v1, La/ok;

    .line 693
    .line 694
    invoke-direct {v1, v0, v0, v12}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 698
    .line 699
    .line 700
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 701
    .line 702
    return-object v0

    .line 703
    :pswitch_f
    move-object v0, v1

    .line 704
    check-cast v0, La/cp;

    .line 705
    .line 706
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    new-instance v1, La/ok;

    .line 710
    .line 711
    const/4 v2, 0x5

    .line 712
    invoke-direct {v1, v0, v0, v2}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 716
    .line 717
    .line 718
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 719
    .line 720
    return-object v0

    .line 721
    :pswitch_10
    move-object v0, v1

    .line 722
    check-cast v0, Lkotlin/text/MatchResult;

    .line 723
    .line 724
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    invoke-interface {v0}, Lkotlin/text/MatchResult;->getValue()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 732
    .line 733
    .line 734
    move-result v0

    .line 735
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    return-object v0

    .line 740
    :pswitch_11
    move-object v0, v1

    .line 741
    check-cast v0, Lkotlin/text/MatchResult;

    .line 742
    .line 743
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 744
    .line 745
    .line 746
    invoke-interface {v0}, Lkotlin/text/MatchResult;->getValue()Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 751
    .line 752
    .line 753
    move-result v0

    .line 754
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    return-object v0

    .line 759
    :pswitch_12
    move-object v0, v1

    .line 760
    check-cast v0, La/b7r;

    .line 761
    .line 762
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 766
    .line 767
    return-object v0

    .line 768
    :pswitch_13
    move-object v0, v1

    .line 769
    check-cast v0, Lkotlin/Pair;

    .line 770
    .line 771
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast v0, Ljava/lang/CharSequence;

    .line 777
    .line 778
    return-object v0

    .line 779
    :pswitch_14
    instance-of v0, v1, La/nfi0;

    .line 780
    .line 781
    if-eqz v0, :cond_0

    .line 782
    .line 783
    move-object v0, v1

    .line 784
    check-cast v0, La/nfi0;

    .line 785
    .line 786
    iget-object v0, v0, La/nfi0;->a:Ljava/lang/String;

    .line 787
    .line 788
    goto :goto_0

    .line 789
    :cond_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    :goto_0
    return-object v0

    .line 794
    :pswitch_15
    move-object v0, v1

    .line 795
    check-cast v0, Ljava/lang/Throwable;

    .line 796
    .line 797
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 801
    .line 802
    .line 803
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 804
    .line 805
    return-object v0

    .line 806
    :pswitch_16
    move-object v0, v1

    .line 807
    check-cast v0, Ljava/lang/Throwable;

    .line 808
    .line 809
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 813
    .line 814
    .line 815
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 816
    .line 817
    return-object v0

    .line 818
    :pswitch_17
    move-object v0, v1

    .line 819
    check-cast v0, La/eu9;

    .line 820
    .line 821
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    iget-object v5, v0, La/eu9;->b:Ljava/lang/String;

    .line 825
    .line 826
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 827
    .line 828
    .line 829
    move-result v1

    .line 830
    const-string v3, "/500"

    .line 831
    .line 832
    invoke-static {v1, v3}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v6

    .line 836
    const/16 v3, 0x1f4

    .line 837
    .line 838
    if-le v1, v3, :cond_1

    .line 839
    .line 840
    move v7, v2

    .line 841
    goto :goto_1

    .line 842
    :cond_1
    move v7, v13

    .line 843
    :goto_1
    new-instance v3, La/fu9;

    .line 844
    .line 845
    iget v4, v0, La/eu9;->a:I

    .line 846
    .line 847
    if-nez v7, :cond_3

    .line 848
    .line 849
    if-gtz v4, :cond_2

    .line 850
    .line 851
    goto :goto_2

    .line 852
    :cond_2
    move v8, v13

    .line 853
    goto :goto_3

    .line 854
    :cond_3
    :goto_2
    move v8, v2

    .line 855
    :goto_3
    invoke-direct/range {v3 .. v8}, La/fu9;-><init>(ILjava/lang/String;Ljava/lang/String;ZZ)V

    .line 856
    .line 857
    .line 858
    return-object v3

    .line 859
    :pswitch_18
    move-object v0, v1

    .line 860
    check-cast v0, Lkotlin/Pair;

    .line 861
    .line 862
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v1, Ljava/lang/String;

    .line 868
    .line 869
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 870
    .line 871
    check-cast v0, Ljava/lang/String;

    .line 872
    .line 873
    const-string v2, ": "

    .line 874
    .line 875
    invoke-static {v1, v2, v0}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    return-object v0

    .line 880
    :pswitch_19
    move-object v0, v1

    .line 881
    check-cast v0, La/abi0;

    .line 882
    .line 883
    invoke-static {v0, v13}, La/yai0;->e(La/abi0;I)V

    .line 884
    .line 885
    .line 886
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 887
    .line 888
    return-object v0

    .line 889
    :pswitch_1a
    move-object v0, v1

    .line 890
    check-cast v0, La/jtl;

    .line 891
    .line 892
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 893
    .line 894
    .line 895
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 896
    .line 897
    return-object v0

    .line 898
    :pswitch_1b
    move-object v0, v1

    .line 899
    check-cast v0, Ljava/lang/Integer;

    .line 900
    .line 901
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 902
    .line 903
    .line 904
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 905
    .line 906
    return-object v0

    .line 907
    :pswitch_1c
    move-object v0, v1

    .line 908
    check-cast v0, La/z59;

    .line 909
    .line 910
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    new-instance v1, La/c69;

    .line 914
    .line 915
    invoke-direct {v1, v0}, La/c69;-><init>(La/z59;)V

    .line 916
    .line 917
    .line 918
    return-object v1

    .line 919
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
