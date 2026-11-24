.class public final synthetic La/dx2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dx2;->a:B

    iput p1, p0, La/dx2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/dx2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget p0, p0, La/dx2;->b:I

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/abi0;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p0}, La/cbi0;->c(La/abi0;I)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    check-cast p1, Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v0, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 28
    .line 29
    const/4 v2, 0x6

    .line 30
    invoke-direct {v0, p1, v1, v2}, Lorg/xplatform/uikit/components/counter/DsCounter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    .line 32
    .line 33
    sget-object v1, La/r0m;->q:La/r0m;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/counter/DsCounter;->setComponentStyle(La/r0m;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->setCount(Ljava/lang/Integer;)V

    .line 43
    .line 44
    .line 45
    const p0, 0x7f0606da

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p0}, Landroid/content/Context;->getColor(I)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->setTextColor(I)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_1
    check-cast p1, La/kr5;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget p1, p1, La/kr5;->b:I

    .line 62
    .line 63
    if-ne p1, p0, :cond_0

    .line 64
    .line 65
    move v2, v3

    .line 66
    :cond_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :pswitch_2
    check-cast p1, La/kr5;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget p1, p1, La/kr5;->b:I

    .line 77
    .line 78
    if-ne p1, p0, :cond_1

    .line 79
    .line 80
    move v2, v3

    .line 81
    :cond_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_3
    check-cast p1, La/vzg0;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v0, La/gp40;

    .line 92
    .line 93
    invoke-static {p0}, La/tlb;->T(I)La/xrz;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-wide/16 v8, 0x0

    .line 98
    .line 99
    const/4 v10, 0x0

    .line 100
    const/4 v2, 0x0

    .line 101
    const/4 v3, 0x0

    .line 102
    const-string v4, ""

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    const/4 v6, -0x1

    .line 106
    const/4 v7, -0x1

    .line 107
    invoke-direct/range {v0 .. v10}, La/gp40;-><init>(La/xrz;La/pcq;ZLjava/lang/String;ZIIJZ)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_4
    check-cast p1, La/abi0;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {p1, p0}, La/cbi0;->c(La/abi0;I)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_5
    check-cast p1, La/abi0;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    sget-object v0, La/cbi0;->b:La/zai0;

    .line 128
    .line 129
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-le p1, p0, :cond_2

    .line 146
    .line 147
    move v2, v3

    .line 148
    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :pswitch_7
    check-cast p1, La/o1x;

    .line 154
    .line 155
    iget-object p1, p1, La/o1x;->a:Landroid/content/Context;

    .line 156
    .line 157
    invoke-static {p0, p1}, La/vtb;->V(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-static {p0}, La/c3x;->r(Landroid/graphics/drawable/Drawable;)La/dyw;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    :pswitch_8
    check-cast p1, La/o1x;

    .line 167
    .line 168
    iget-object p1, p1, La/o1x;->a:Landroid/content/Context;

    .line 169
    .line 170
    invoke-static {p0, p1}, La/vtb;->V(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, La/c3x;->r(Landroid/graphics/drawable/Drawable;)La/dyw;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    return-object p0

    .line 179
    :pswitch_9
    check-cast p1, La/abi0;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-static {p1, p0}, La/cbi0;->c(La/abi0;I)V

    .line 185
    .line 186
    .line 187
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object p0

    .line 190
    :pswitch_a
    check-cast p1, Landroid/content/Context;

    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    new-instance v0, Landroid/widget/FrameLayout;

    .line 196
    .line 197
    invoke-direct {v0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 201
    .line 202
    .line 203
    return-object v0

    .line 204
    :pswitch_b
    check-cast p1, La/fhl;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, La/nr;->i()La/x5a;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, La/vw2;->b(La/x5a;)Landroid/graphics/Canvas;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-interface {p1}, La/fhl;->d()J

    .line 222
    .line 223
    .line 224
    move-result-wide v2

    .line 225
    const/16 v0, 0x20

    .line 226
    .line 227
    shr-long/2addr v2, v0

    .line 228
    long-to-int v0, v2

    .line 229
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    invoke-interface {p1}, La/fhl;->d()J

    .line 234
    .line 235
    .line 236
    move-result-wide v2

    .line 237
    const-wide v5, 0xffffffffL

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    and-long/2addr v2, v5

    .line 243
    long-to-int v0, v2

    .line 244
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    new-instance v8, Landroid/graphics/Paint;

    .line 249
    .line 250
    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 251
    .line 252
    .line 253
    sget-wide v2, La/y3d;->f:J

    .line 254
    .line 255
    invoke-static {v2, v3}, La/fbc;->U(J)I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 260
    .line 261
    .line 262
    sget-object v0, La/qmk;->a:La/zcl;

    .line 263
    .line 264
    const/high16 v0, 0x40800000    # 4.0f

    .line 265
    .line 266
    invoke-interface {p1, v0}, La/w6k;->w0(F)F

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    const/high16 v2, 0x40000000    # 2.0f

    .line 271
    .line 272
    invoke-interface {p1, v2}, La/w6k;->w0(F)F

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    const/4 v2, 0x0

    .line 277
    invoke-virtual {v8, v0, v2, p1, p0}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 278
    .line 279
    .line 280
    const/4 v3, 0x0

    .line 281
    const/4 v6, 0x0

    .line 282
    const/4 v7, 0x0

    .line 283
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 284
    .line 285
    .line 286
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object p0

    .line 289
    :pswitch_c
    check-cast p1, La/nqq;

    .line 290
    .line 291
    invoke-virtual {p1, p0}, La/nqq;->Z0(I)Z

    .line 292
    .line 293
    .line 294
    move-result p0

    .line 295
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    return-object p0

    .line 300
    :pswitch_d
    check-cast p1, La/nqq;

    .line 301
    .line 302
    invoke-virtual {p1, p0}, La/nqq;->h1(I)Z

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    return-object p0

    .line 311
    :pswitch_e
    check-cast p1, La/nqq;

    .line 312
    .line 313
    invoke-virtual {p1, p0}, La/nqq;->h1(I)Z

    .line 314
    .line 315
    .line 316
    move-result p0

    .line 317
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    return-object p0

    .line 322
    :pswitch_f
    check-cast p1, La/x8z;

    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-static {p0}, La/q8x;->e(I)J

    .line 328
    .line 329
    .line 330
    move-result-wide p0

    .line 331
    new-instance v0, La/pgv;

    .line 332
    .line 333
    invoke-direct {v0, p0, p1}, La/pgv;-><init>(J)V

    .line 334
    .line 335
    .line 336
    return-object v0

    .line 337
    :pswitch_10
    check-cast p1, La/x8z;

    .line 338
    .line 339
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-static {p0}, La/q8x;->e(I)J

    .line 343
    .line 344
    .line 345
    move-result-wide p0

    .line 346
    new-instance v0, La/pgv;

    .line 347
    .line 348
    invoke-direct {v0, p0, p1}, La/pgv;-><init>(J)V

    .line 349
    .line 350
    .line 351
    return-object v0

    .line 352
    :pswitch_11
    check-cast p1, La/abi0;

    .line 353
    .line 354
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-static {p1, p0}, La/cbi0;->c(La/abi0;I)V

    .line 358
    .line 359
    .line 360
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 361
    .line 362
    return-object p0

    .line 363
    :pswitch_12
    check-cast p1, La/abi0;

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-static {p1, p0}, La/cbi0;->c(La/abi0;I)V

    .line 369
    .line 370
    .line 371
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 372
    .line 373
    return-object p0

    .line 374
    :pswitch_13
    check-cast p1, La/vzg0;

    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    new-instance v0, La/k8k;

    .line 380
    .line 381
    invoke-static {p0}, La/tlb;->T(I)La/xrz;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    new-instance v2, La/d8k;

    .line 386
    .line 387
    const-wide/16 v7, 0x0

    .line 388
    .line 389
    const-string v9, ""

    .line 390
    .line 391
    const-wide/16 v3, 0x0

    .line 392
    .line 393
    const-wide/16 v5, 0x0

    .line 394
    .line 395
    const/4 v10, 0x0

    .line 396
    invoke-direct/range {v2 .. v10}, La/d8k;-><init>(JJJLjava/lang/String;Z)V

    .line 397
    .line 398
    .line 399
    const-string v4, ""

    .line 400
    .line 401
    const/4 v5, 0x0

    .line 402
    const/4 v3, 0x0

    .line 403
    invoke-direct/range {v0 .. v5}, La/k8k;-><init>(La/xrz;La/d8k;ZLjava/lang/String;Z)V

    .line 404
    .line 405
    .line 406
    return-object v0

    .line 407
    :pswitch_14
    check-cast p1, La/uag0;

    .line 408
    .line 409
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-virtual {p1, p0}, La/uag0;->e(I)V

    .line 413
    .line 414
    .line 415
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 416
    .line 417
    return-object p0

    .line 418
    :pswitch_15
    check-cast p1, La/abi0;

    .line 419
    .line 420
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-static {p1, p0}, La/cbi0;->c(La/abi0;I)V

    .line 424
    .line 425
    .line 426
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 427
    .line 428
    return-object p0

    .line 429
    :pswitch_16
    check-cast p1, Lorg/xplatform/uikit/components/chips/Chip;

    .line 430
    .line 431
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {v0, p0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/chips/Chip;->setText(Ljava/lang/CharSequence;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {p1, v3}, Lorg/xplatform/uikit/components/chips/Chip;->setSelected(Z)V

    .line 446
    .line 447
    .line 448
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 449
    .line 450
    return-object p0

    .line 451
    :pswitch_17
    check-cast p1, Ljava/lang/Integer;

    .line 452
    .line 453
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 454
    .line 455
    .line 456
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 457
    .line 458
    const-string v0, "Collection doesn\'t contain element at index "

    .line 459
    .line 460
    const/16 v1, 0x2e

    .line 461
    .line 462
    invoke-static {v0, p0, v1}, La/brm0;->l(Ljava/lang/String;IC)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object p0

    .line 466
    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    throw p1

    .line 470
    :pswitch_18
    check-cast p1, Landroid/content/Context;

    .line 471
    .line 472
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    new-instance v0, Lorg/xplatform/uikit/components/chips/Chip;

    .line 476
    .line 477
    invoke-direct {v0, p1, v1}, Lorg/xplatform/uikit/components/chips/Chip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/chips/Chip;->setStyle(I)V

    .line 481
    .line 482
    .line 483
    return-object v0

    .line 484
    :pswitch_19
    check-cast p1, La/vzg0;

    .line 485
    .line 486
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    new-instance v0, La/hf7;

    .line 490
    .line 491
    invoke-static {p0}, La/tlb;->T(I)La/xrz;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    new-instance v2, La/af7;

    .line 496
    .line 497
    const-wide/16 v11, 0x0

    .line 498
    .line 499
    const-string v13, ""

    .line 500
    .line 501
    const/4 v3, 0x0

    .line 502
    const/4 v4, 0x0

    .line 503
    const-wide/16 v5, 0x0

    .line 504
    .line 505
    const-wide/16 v7, 0x0

    .line 506
    .line 507
    const-wide/16 v9, 0x0

    .line 508
    .line 509
    invoke-direct/range {v2 .. v13}, La/af7;-><init>(ZZJJJJLjava/lang/String;)V

    .line 510
    .line 511
    .line 512
    const-string v4, ""

    .line 513
    .line 514
    const/4 v5, 0x0

    .line 515
    invoke-direct/range {v0 .. v5}, La/hf7;-><init>(La/xrz;La/af7;ZLjava/lang/String;Z)V

    .line 516
    .line 517
    .line 518
    return-object v0

    .line 519
    :pswitch_1a
    check-cast p1, La/nqq;

    .line 520
    .line 521
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->j2:Ljava/lang/Class;

    .line 522
    .line 523
    invoke-virtual {p1, p0}, La/nqq;->h1(I)Z

    .line 524
    .line 525
    .line 526
    move-result p0

    .line 527
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 528
    .line 529
    .line 530
    move-result-object p0

    .line 531
    return-object p0

    .line 532
    :pswitch_1b
    check-cast p1, La/nqq;

    .line 533
    .line 534
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->j2:Ljava/lang/Class;

    .line 535
    .line 536
    invoke-virtual {p1, p0}, La/nqq;->h1(I)Z

    .line 537
    .line 538
    .line 539
    move-result p0

    .line 540
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 541
    .line 542
    .line 543
    move-result-object p0

    .line 544
    return-object p0

    .line 545
    :pswitch_1c
    check-cast p1, La/nqq;

    .line 546
    .line 547
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->j2:Ljava/lang/Class;

    .line 548
    .line 549
    invoke-virtual {p1, p0}, La/nqq;->h1(I)Z

    .line 550
    .line 551
    .line 552
    move-result p0

    .line 553
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 554
    .line 555
    .line 556
    move-result-object p0

    .line 557
    return-object p0

    .line 558
    nop

    .line 559
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
