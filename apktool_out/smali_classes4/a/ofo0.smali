.class public final synthetic La/ofo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/ofo0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/ofo0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/ofo0;->a:B

    .line 4
    .line 5
    const-string v1, "Missing required view with ID: "

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v0, p1

    .line 15
    .line 16
    check-cast v0, Landroid/view/LayoutInflater;

    .line 17
    .line 18
    move-object/from16 v3, p2

    .line 19
    .line 20
    check-cast v3, Landroid/view/ViewGroup;

    .line 21
    .line 22
    const v5, 0x7f0d05fd

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v3, v5, v3, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const v3, 0x7f0a086c

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Landroid/widget/ImageView;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    const v3, 0x7f0a089b

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Landroid/widget/ImageView;

    .line 48
    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    const v3, 0x7f0a1182

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Landroid/widget/TextView;

    .line 59
    .line 60
    if-eqz v6, :cond_0

    .line 61
    .line 62
    new-instance v2, La/mgp0;

    .line 63
    .line 64
    check-cast v0, Landroid/widget/LinearLayout;

    .line 65
    .line 66
    invoke-direct {v2, v0, v4, v5, v6}, La/mgp0;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    return-object v2

    .line 86
    :pswitch_0
    move-object/from16 v0, p1

    .line 87
    .line 88
    check-cast v0, Landroid/view/LayoutInflater;

    .line 89
    .line 90
    move-object/from16 v1, p2

    .line 91
    .line 92
    check-cast v1, Landroid/view/ViewGroup;

    .line 93
    .line 94
    const v3, 0x7f0d0170

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v1, v3, v1, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_1

    .line 102
    .line 103
    check-cast v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;

    .line 104
    .line 105
    new-instance v2, La/cal;

    .line 106
    .line 107
    invoke-direct {v2, v0, v0}, La/cal;-><init>(Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    const-string v0, "rootView"

    .line 112
    .line 113
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :goto_1
    return-object v2

    .line 117
    :pswitch_1
    move-object/from16 v0, p1

    .line 118
    .line 119
    check-cast v0, Ljava/lang/Long;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-object/from16 v0, p2

    .line 125
    .line 126
    check-cast v0, Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_2
    move-object/from16 v0, p1

    .line 135
    .line 136
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 137
    .line 138
    move-object/from16 v1, p2

    .line 139
    .line 140
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    new-instance v2, La/meo0;

    .line 149
    .line 150
    const/16 v3, 0x13

    .line 151
    .line 152
    invoke-direct {v2, v3}, La/meo0;-><init>(B)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    new-instance v0, La/fno0;

    .line 159
    .line 160
    const/16 v2, 0x18

    .line 161
    .line 162
    invoke-direct {v0, v2}, La/fno0;-><init>(B)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object v0

    .line 171
    :pswitch_3
    move-object/from16 v0, p1

    .line 172
    .line 173
    check-cast v0, La/fet;

    .line 174
    .line 175
    move-object/from16 v1, p2

    .line 176
    .line 177
    check-cast v1, Ljava/lang/Integer;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    const v1, 0x1baeaba7

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 186
    .line 187
    .line 188
    invoke-static {v4, v4, v0, v4, v3}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v0, v4}, La/fet;->r(Z)V

    .line 193
    .line 194
    .line 195
    return-object v1

    .line 196
    :pswitch_4
    move-object/from16 v0, p1

    .line 197
    .line 198
    check-cast v0, La/fet;

    .line 199
    .line 200
    move-object/from16 v1, p2

    .line 201
    .line 202
    check-cast v1, Ljava/lang/Integer;

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    const v1, -0x13e027ef

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 211
    .line 212
    .line 213
    invoke-static {v4, v4, v0, v4, v3}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-virtual {v0, v4}, La/fet;->r(Z)V

    .line 218
    .line 219
    .line 220
    return-object v1

    .line 221
    :pswitch_5
    move-object/from16 v0, p1

    .line 222
    .line 223
    check-cast v0, La/fet;

    .line 224
    .line 225
    move-object/from16 v1, p2

    .line 226
    .line 227
    check-cast v1, Ljava/lang/Integer;

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    const v1, 0x550561f2

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 236
    .line 237
    .line 238
    invoke-static {v4, v4, v0, v4, v3}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v0, v4}, La/fet;->r(Z)V

    .line 243
    .line 244
    .line 245
    return-object v1

    .line 246
    :pswitch_6
    move-object/from16 v0, p1

    .line 247
    .line 248
    check-cast v0, La/fet;

    .line 249
    .line 250
    move-object/from16 v1, p2

    .line 251
    .line 252
    check-cast v1, Ljava/lang/Integer;

    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 255
    .line 256
    .line 257
    const v1, 0x6803bfdd

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 261
    .line 262
    .line 263
    invoke-static {v4, v4, v0, v4, v3}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {v0, v4}, La/fet;->r(Z)V

    .line 268
    .line 269
    .line 270
    return-object v1

    .line 271
    :pswitch_7
    move-object/from16 v0, p1

    .line 272
    .line 273
    check-cast v0, Ljava/lang/Throwable;

    .line 274
    .line 275
    move-object/from16 v0, p2

    .line 276
    .line 277
    check-cast v0, Ljava/lang/String;

    .line 278
    .line 279
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    return-object v0

    .line 282
    :pswitch_8
    move-object/from16 v0, p1

    .line 283
    .line 284
    check-cast v0, La/fet;

    .line 285
    .line 286
    move-object/from16 v1, p2

    .line 287
    .line 288
    check-cast v1, Ljava/lang/Integer;

    .line 289
    .line 290
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-static {v5}, La/x8x;->L(I)I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    invoke-static {v1, v0}, La/hp4;->A(ILa/fet;)V

    .line 298
    .line 299
    .line 300
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    return-object v0

    .line 303
    :pswitch_9
    move-object/from16 v0, p1

    .line 304
    .line 305
    check-cast v0, La/fet;

    .line 306
    .line 307
    move-object/from16 v1, p2

    .line 308
    .line 309
    check-cast v1, Ljava/lang/Integer;

    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-static {v5}, La/x8x;->L(I)I

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    invoke-static {v1, v0}, La/w7n0;->f(ILa/fet;)V

    .line 319
    .line 320
    .line 321
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object v0

    .line 324
    :pswitch_a
    move-object/from16 v1, p1

    .line 325
    .line 326
    check-cast v1, La/fhl;

    .line 327
    .line 328
    move-object/from16 v0, p2

    .line 329
    .line 330
    check-cast v0, La/nu90;

    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    sget-object v2, La/qmk;->a:La/zcl;

    .line 339
    .line 340
    const/high16 v2, 0x41e00000    # 28.0f

    .line 341
    .line 342
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    int-to-long v3, v3

    .line 351
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    int-to-long v5, v2

    .line 356
    const/16 v12, 0x20

    .line 357
    .line 358
    shl-long v2, v3, v12

    .line 359
    .line 360
    const-wide v13, 0xffffffffL

    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    and-long v4, v5, v13

    .line 366
    .line 367
    or-long v15, v2, v4

    .line 368
    .line 369
    invoke-interface {v1}, La/fhl;->d()J

    .line 370
    .line 371
    .line 372
    move-result-wide v2

    .line 373
    shr-long/2addr v2, v12

    .line 374
    long-to-int v2, v2

    .line 375
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    shr-long v3, v15, v12

    .line 380
    .line 381
    long-to-int v3, v3

    .line 382
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    sub-float/2addr v2, v3

    .line 387
    const/high16 v3, 0x40000000    # 2.0f

    .line 388
    .line 389
    div-float/2addr v2, v3

    .line 390
    invoke-interface {v1}, La/fhl;->d()J

    .line 391
    .line 392
    .line 393
    move-result-wide v4

    .line 394
    and-long/2addr v4, v13

    .line 395
    long-to-int v4, v4

    .line 396
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    and-long v5, v15, v13

    .line 401
    .line 402
    long-to-int v5, v5

    .line 403
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    sub-float/2addr v4, v5

    .line 408
    div-float/2addr v4, v3

    .line 409
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    int-to-long v2, v2

    .line 414
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 415
    .line 416
    .line 417
    move-result v4

    .line 418
    int-to-long v4, v4

    .line 419
    shl-long/2addr v2, v12

    .line 420
    and-long/2addr v4, v13

    .line 421
    or-long v17, v2, v4

    .line 422
    .line 423
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 424
    .line 425
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 430
    .line 431
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary20-0d7_KjU()J

    .line 432
    .line 433
    .line 434
    move-result-wide v2

    .line 435
    invoke-interface {v1}, La/fhl;->d()J

    .line 436
    .line 437
    .line 438
    move-result-wide v6

    .line 439
    const/high16 v4, 0x41800000    # 16.0f

    .line 440
    .line 441
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    int-to-long v8, v5

    .line 450
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 451
    .line 452
    .line 453
    move-result v4

    .line 454
    int-to-long v4, v4

    .line 455
    shl-long/2addr v8, v12

    .line 456
    and-long/2addr v4, v13

    .line 457
    or-long/2addr v8, v4

    .line 458
    const/4 v10, 0x0

    .line 459
    const/16 v11, 0xf2

    .line 460
    .line 461
    const-wide/16 v4, 0x0

    .line 462
    .line 463
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 464
    .line 465
    .line 466
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 467
    .line 468
    .line 469
    move-result-object v7

    .line 470
    invoke-virtual {v7}, La/nr;->p()J

    .line 471
    .line 472
    .line 473
    move-result-wide v8

    .line 474
    invoke-virtual {v7}, La/nr;->i()La/x5a;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    invoke-interface {v2}, La/x5a;->l()V

    .line 479
    .line 480
    .line 481
    :try_start_0
    iget-object v2, v7, La/nr;->b:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v2, La/fvt0;

    .line 484
    .line 485
    shr-long v3, v17, v12

    .line 486
    .line 487
    long-to-int v3, v3

    .line 488
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    and-long v4, v17, v13

    .line 493
    .line 494
    long-to-int v4, v4

    .line 495
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    invoke-virtual {v2, v3, v4}, La/fvt0;->A(FF)V

    .line 500
    .line 501
    .line 502
    move-object v2, v1

    .line 503
    iget-object v1, v0, La/nu90;->a:La/pm80;

    .line 504
    .line 505
    iget v5, v0, La/nu90;->b:F

    .line 506
    .line 507
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 512
    .line 513
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary40-0d7_KjU()J

    .line 514
    .line 515
    .line 516
    move-result-wide v3

    .line 517
    new-instance v6, La/m78;

    .line 518
    .line 519
    const/4 v0, 0x5

    .line 520
    invoke-direct {v6, v3, v4, v0}, La/m78;-><init>(JI)V

    .line 521
    .line 522
    .line 523
    move-wide v3, v15

    .line 524
    invoke-virtual/range {v1 .. v6}, La/pm80;->e(La/fhl;JFLa/a4d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 525
    .line 526
    .line 527
    invoke-static {v7, v8, v9}, Lc;->g(La/nr;J)V

    .line 528
    .line 529
    .line 530
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 531
    .line 532
    return-object v0

    .line 533
    :catchall_0
    move-exception v0

    .line 534
    invoke-static {v7, v8, v9}, Lc;->g(La/nr;J)V

    .line 535
    .line 536
    .line 537
    throw v0

    .line 538
    :pswitch_b
    move-object/from16 v0, p1

    .line 539
    .line 540
    check-cast v0, La/oyg0;

    .line 541
    .line 542
    move-object/from16 v1, p2

    .line 543
    .line 544
    check-cast v1, La/z2p0;

    .line 545
    .line 546
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    const/4 v7, 0x0

    .line 553
    const/16 v8, 0x17

    .line 554
    .line 555
    const/4 v2, 0x0

    .line 556
    const/4 v3, 0x0

    .line 557
    const/4 v4, 0x1

    .line 558
    const/4 v5, 0x0

    .line 559
    const/4 v6, 0x0

    .line 560
    invoke-static/range {v1 .. v8}, La/z2p0;->a(La/z2p0;La/t1p0;La/nfp0;ZLa/x2p0;ZZI)La/z2p0;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    return-object v0

    .line 565
    :pswitch_c
    move-object/from16 v0, p1

    .line 566
    .line 567
    check-cast v0, Ljava/lang/Integer;

    .line 568
    .line 569
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 570
    .line 571
    .line 572
    move-object/from16 v0, p2

    .line 573
    .line 574
    check-cast v0, La/p6t0;

    .line 575
    .line 576
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    invoke-interface {v0}, La/p6t0;->getKey()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    return-object v0

    .line 584
    :pswitch_d
    move-object/from16 v0, p1

    .line 585
    .line 586
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 587
    .line 588
    move-object/from16 v1, p2

    .line 589
    .line 590
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 591
    .line 592
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    new-instance v2, La/meo0;

    .line 599
    .line 600
    const/16 v3, 0xf

    .line 601
    .line 602
    invoke-direct {v2, v3}, La/meo0;-><init>(B)V

    .line 603
    .line 604
    .line 605
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    new-instance v0, La/fno0;

    .line 609
    .line 610
    const/4 v2, 0x7

    .line 611
    invoke-direct {v0, v2}, La/fno0;-><init>(B)V

    .line 612
    .line 613
    .line 614
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 618
    .line 619
    return-object v0

    .line 620
    :pswitch_e
    move-object/from16 v0, p1

    .line 621
    .line 622
    check-cast v0, Ljava/lang/Throwable;

    .line 623
    .line 624
    move-object/from16 v1, p2

    .line 625
    .line 626
    check-cast v1, Ljava/lang/String;

    .line 627
    .line 628
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 635
    .line 636
    return-object v0

    .line 637
    :pswitch_f
    move-object/from16 v0, p1

    .line 638
    .line 639
    check-cast v0, La/fet;

    .line 640
    .line 641
    move-object/from16 v1, p2

    .line 642
    .line 643
    check-cast v1, Ljava/lang/Integer;

    .line 644
    .line 645
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    invoke-static {v5}, La/x8x;->L(I)I

    .line 649
    .line 650
    .line 651
    move-result v1

    .line 652
    invoke-static {v1, v0}, La/jtm0;->c(ILa/fet;)V

    .line 653
    .line 654
    .line 655
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 656
    .line 657
    return-object v0

    .line 658
    :pswitch_10
    move-object/from16 v0, p1

    .line 659
    .line 660
    check-cast v0, La/fet;

    .line 661
    .line 662
    move-object/from16 v1, p2

    .line 663
    .line 664
    check-cast v1, Ljava/lang/Integer;

    .line 665
    .line 666
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    invoke-static {v5}, La/x8x;->L(I)I

    .line 670
    .line 671
    .line 672
    move-result v1

    .line 673
    invoke-static {v1, v0}, La/tnq0;->a(ILa/fet;)V

    .line 674
    .line 675
    .line 676
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 677
    .line 678
    return-object v0

    .line 679
    :pswitch_11
    move-object/from16 v0, p1

    .line 680
    .line 681
    check-cast v0, La/fet;

    .line 682
    .line 683
    move-object/from16 v1, p2

    .line 684
    .line 685
    check-cast v1, Ljava/lang/Integer;

    .line 686
    .line 687
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    invoke-static {v5}, La/x8x;->L(I)I

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    invoke-static {v1, v0}, La/xsm0;->d(ILa/fet;)V

    .line 695
    .line 696
    .line 697
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 698
    .line 699
    return-object v0

    .line 700
    :pswitch_12
    move-object/from16 v0, p1

    .line 701
    .line 702
    check-cast v0, Ljava/lang/Integer;

    .line 703
    .line 704
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 705
    .line 706
    .line 707
    move-result v0

    .line 708
    move-object/from16 v1, p2

    .line 709
    .line 710
    check-cast v1, La/p6t0;

    .line 711
    .line 712
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    invoke-interface {v1}, La/p6t0;->getKey()Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    invoke-static {v0, v1}, La/rz4;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    return-object v0

    .line 724
    :pswitch_13
    move-object/from16 v0, p1

    .line 725
    .line 726
    check-cast v0, Ljava/lang/Integer;

    .line 727
    .line 728
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    move-object/from16 v0, p2

    .line 732
    .line 733
    check-cast v0, La/o8w;

    .line 734
    .line 735
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    invoke-interface {v0}, La/o8w;->getKey()Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    return-object v0

    .line 743
    :pswitch_14
    move-object/from16 v0, p1

    .line 744
    .line 745
    check-cast v0, La/fet;

    .line 746
    .line 747
    move-object/from16 v1, p2

    .line 748
    .line 749
    check-cast v1, Ljava/lang/Integer;

    .line 750
    .line 751
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    invoke-static {v5}, La/x8x;->L(I)I

    .line 755
    .line 756
    .line 757
    move-result v1

    .line 758
    invoke-static {v1, v0}, La/y0x0;->x(ILa/fet;)V

    .line 759
    .line 760
    .line 761
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 762
    .line 763
    return-object v0

    .line 764
    :pswitch_15
    move-object/from16 v0, p1

    .line 765
    .line 766
    check-cast v0, Ljava/lang/Integer;

    .line 767
    .line 768
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    move-object/from16 v1, p2

    .line 773
    .line 774
    check-cast v1, La/p6t0;

    .line 775
    .line 776
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    invoke-interface {v1}, La/p6t0;->getKey()Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    invoke-static {v0, v1}, La/rz4;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    return-object v0

    .line 788
    :pswitch_16
    move-object/from16 v0, p1

    .line 789
    .line 790
    check-cast v0, Ljava/lang/Integer;

    .line 791
    .line 792
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    move-object/from16 v0, p2

    .line 796
    .line 797
    check-cast v0, La/o8w;

    .line 798
    .line 799
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    .line 801
    .line 802
    invoke-interface {v0}, La/o8w;->getKey()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    return-object v0

    .line 807
    :pswitch_17
    move-object/from16 v0, p1

    .line 808
    .line 809
    check-cast v0, La/fet;

    .line 810
    .line 811
    move-object/from16 v1, p2

    .line 812
    .line 813
    check-cast v1, Ljava/lang/Integer;

    .line 814
    .line 815
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 816
    .line 817
    .line 818
    invoke-static {v5}, La/x8x;->L(I)I

    .line 819
    .line 820
    .line 821
    move-result v1

    .line 822
    invoke-static {v1, v0}, La/hmw0;->U(ILa/fet;)V

    .line 823
    .line 824
    .line 825
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 826
    .line 827
    return-object v0

    .line 828
    :pswitch_18
    move-object/from16 v0, p1

    .line 829
    .line 830
    check-cast v0, La/fet;

    .line 831
    .line 832
    move-object/from16 v1, p2

    .line 833
    .line 834
    check-cast v1, Ljava/lang/Integer;

    .line 835
    .line 836
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 837
    .line 838
    .line 839
    invoke-static {v5}, La/x8x;->L(I)I

    .line 840
    .line 841
    .line 842
    move-result v1

    .line 843
    invoke-static {v1, v0}, La/hmw0;->V(ILa/fet;)V

    .line 844
    .line 845
    .line 846
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 847
    .line 848
    return-object v0

    .line 849
    :pswitch_19
    move-object/from16 v0, p1

    .line 850
    .line 851
    check-cast v0, Ljava/lang/Throwable;

    .line 852
    .line 853
    move-object/from16 v1, p2

    .line 854
    .line 855
    check-cast v1, Ljava/lang/String;

    .line 856
    .line 857
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 864
    .line 865
    return-object v0

    .line 866
    :pswitch_1a
    move-object/from16 v0, p1

    .line 867
    .line 868
    check-cast v0, Ljava/lang/Throwable;

    .line 869
    .line 870
    move-object/from16 v1, p2

    .line 871
    .line 872
    check-cast v1, Ljava/lang/String;

    .line 873
    .line 874
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 875
    .line 876
    .line 877
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 878
    .line 879
    return-object v0

    .line 880
    :pswitch_1b
    move-object/from16 v0, p1

    .line 881
    .line 882
    check-cast v0, Ljava/lang/Throwable;

    .line 883
    .line 884
    move-object/from16 v1, p2

    .line 885
    .line 886
    check-cast v1, Ljava/lang/String;

    .line 887
    .line 888
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 895
    .line 896
    return-object v0

    .line 897
    :pswitch_1c
    move-object/from16 v0, p1

    .line 898
    .line 899
    check-cast v0, Landroid/view/LayoutInflater;

    .line 900
    .line 901
    move-object/from16 v3, p2

    .line 902
    .line 903
    check-cast v3, Landroid/view/ViewGroup;

    .line 904
    .line 905
    const v5, 0x7f0d0352

    .line 906
    .line 907
    .line 908
    invoke-static {v0, v3, v5, v3, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    move-object v3, v0

    .line 913
    check-cast v3, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 914
    .line 915
    const v4, 0x7f0a0929

    .line 916
    .line 917
    .line 918
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 919
    .line 920
    .line 921
    move-result-object v5

    .line 922
    check-cast v5, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 923
    .line 924
    if-eqz v5, :cond_2

    .line 925
    .line 926
    const v4, 0x7f0a0a39

    .line 927
    .line 928
    .line 929
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 930
    .line 931
    .line 932
    move-result-object v6

    .line 933
    check-cast v6, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 934
    .line 935
    if-eqz v6, :cond_2

    .line 936
    .line 937
    new-instance v2, La/xrx;

    .line 938
    .line 939
    invoke-direct {v2, v3, v5, v6}, La/xrx;-><init>(Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 940
    .line 941
    .line 942
    goto :goto_2

    .line 943
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    :goto_2
    return-object v2

    .line 959
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
