.class public final synthetic La/dm10;
.super La/xo;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/dm10;->h:B

    invoke-direct/range {p0 .. p6}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dm10;->h:B

    .line 4
    .line 5
    const-string v2, "COUPON_TAG"

    .line 6
    .line 7
    const v3, 0x7f010054

    .line 8
    .line 9
    .line 10
    const v4, 0x7f010053

    .line 11
    .line 12
    .line 13
    const v5, 0x7f010052

    .line 14
    .line 15
    .line 16
    const v6, 0x7f010051

    .line 17
    .line 18
    .line 19
    const/16 v7, 0xb

    .line 20
    .line 21
    const v8, 0x7f13032f

    .line 22
    .line 23
    .line 24
    const-string v9, ""

    .line 25
    .line 26
    const/4 v10, 0x3

    .line 27
    const/4 v12, 0x1

    .line 28
    const/4 v13, 0x2

    .line 29
    const/16 v14, 0x8

    .line 30
    .line 31
    const/4 v15, 0x0

    .line 32
    const/16 v16, 0x4

    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    iget-object v0, v0, La/xo;->a:Ljava/lang/Object;

    .line 36
    .line 37
    packed-switch v1, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    move-object/from16 v1, p1

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Throwable;

    .line 43
    .line 44
    move-object/from16 v2, p2

    .line 45
    .line 46
    check-cast v2, La/yje;

    .line 47
    .line 48
    check-cast v0, La/qg20;

    .line 49
    .line 50
    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    .line 51
    .line 52
    if-nez v2, :cond_0

    .line 53
    .line 54
    iget-object v2, v0, La/qg20;->t:La/duj;

    .line 55
    .line 56
    new-instance v3, La/ed20;

    .line 57
    .line 58
    invoke-direct {v3, v0, v13}, La/ed20;-><init>(La/qg20;B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_0
    move-object/from16 v1, p1

    .line 72
    .line 73
    check-cast v1, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    move-object/from16 v3, p2

    .line 80
    .line 81
    check-cast v3, La/yje;

    .line 82
    .line 83
    check-cast v0, La/c720;

    .line 84
    .line 85
    sget-object v3, La/c720;->p2:La/wsz;

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2}, La/c720;->X0(D)V

    .line 88
    .line 89
    .line 90
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_1
    move-object/from16 v1, p1

    .line 94
    .line 95
    check-cast v1, La/ri20;

    .line 96
    .line 97
    move-object/from16 v2, p2

    .line 98
    .line 99
    check-cast v2, La/yje;

    .line 100
    .line 101
    check-cast v0, La/c720;

    .line 102
    .line 103
    sget-object v2, La/c720;->p2:La/wsz;

    .line 104
    .line 105
    invoke-virtual {v0}, La/stl;->P0()La/vfk;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v0, v0, La/vfk;->f:Landroid/widget/FrameLayout;

    .line 110
    .line 111
    invoke-static {v0}, La/pym0;->i(Landroid/view/ViewGroup;)La/ihu0;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    new-instance v2, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-nez v3, :cond_1

    .line 129
    .line 130
    move-object v3, v15

    .line 131
    goto :goto_4

    .line 132
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    move-object v4, v3

    .line 137
    check-cast v4, Landroid/view/View;

    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    instance-of v5, v4, Landroid/view/ViewGroup;

    .line 143
    .line 144
    if-eqz v5, :cond_2

    .line 145
    .line 146
    check-cast v4, Landroid/view/ViewGroup;

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    move-object v4, v15

    .line 150
    :goto_1
    if-eqz v4, :cond_3

    .line 151
    .line 152
    new-instance v5, La/jhu0;

    .line 153
    .line 154
    invoke-direct {v5, v4}, La/jhu0;-><init>(Landroid/view/ViewGroup;)V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_3
    move-object v5, v15

    .line 159
    :goto_2
    if-eqz v5, :cond_4

    .line 160
    .line 161
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_4

    .line 166
    .line 167
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_5

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-nez v0, :cond_5

    .line 182
    .line 183
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v0, Ljava/util/Iterator;

    .line 188
    .line 189
    invoke-static {v2}, La/w3d;->z(Ljava/util/List;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_5
    :goto_4
    check-cast v3, Landroid/view/View;

    .line 194
    .line 195
    instance-of v0, v3, La/s6q;

    .line 196
    .line 197
    if-eqz v0, :cond_6

    .line 198
    .line 199
    check-cast v3, La/s6q;

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_6
    move-object v3, v15

    .line 203
    :goto_5
    if-nez v3, :cond_7

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_7
    if-eqz v1, :cond_a

    .line 207
    .line 208
    instance-of v0, v1, La/pi20;

    .line 209
    .line 210
    if-eqz v0, :cond_8

    .line 211
    .line 212
    sget-object v0, La/jvn;->a:La/pek;

    .line 213
    .line 214
    check-cast v1, La/pi20;

    .line 215
    .line 216
    iget v2, v1, La/pi20;->b:I

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {v2}, La/pek;->k(I)La/jvn;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    iget-wide v1, v1, La/pi20;->a:D

    .line 226
    .line 227
    sget-object v4, La/p3u0;->e:La/p3u0;

    .line 228
    .line 229
    invoke-static {v0, v1, v2, v4}, La/ahb;->C(La/jvn;DLa/p3u0;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    sget-object v1, La/l0d;->f:La/l0d;

    .line 234
    .line 235
    invoke-virtual {v3, v9, v0, v1}, La/s6q;->a(Ljava/lang/String;Ljava/lang/String;La/l0d;)V

    .line 236
    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_8
    instance-of v0, v1, La/qi20;

    .line 240
    .line 241
    if-eqz v0, :cond_9

    .line 242
    .line 243
    sget-object v0, La/jvn;->a:La/pek;

    .line 244
    .line 245
    check-cast v1, La/qi20;

    .line 246
    .line 247
    iget v2, v1, La/qi20;->b:I

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-static {v2}, La/pek;->k(I)La/jvn;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    iget-wide v1, v1, La/qi20;->a:D

    .line 257
    .line 258
    sget-object v4, La/p3u0;->e:La/p3u0;

    .line 259
    .line 260
    invoke-static {v0, v1, v2, v4}, La/ahb;->C(La/jvn;DLa/p3u0;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    sget-object v1, La/l0d;->a:La/l0d;

    .line 265
    .line 266
    invoke-virtual {v3, v0, v9, v1}, La/s6q;->a(Ljava/lang/String;Ljava/lang/String;La/l0d;)V

    .line 267
    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_9
    instance-of v0, v1, La/oi20;

    .line 271
    .line 272
    if-eqz v0, :cond_a

    .line 273
    .line 274
    sget-object v0, La/jvn;->a:La/pek;

    .line 275
    .line 276
    check-cast v1, La/oi20;

    .line 277
    .line 278
    iget v2, v1, La/oi20;->d:I

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-static {v2}, La/pek;->k(I)La/jvn;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    iget-wide v4, v1, La/oi20;->b:D

    .line 288
    .line 289
    sget-object v6, La/p3u0;->e:La/p3u0;

    .line 290
    .line 291
    invoke-static {v0, v4, v5, v6}, La/ahb;->C(La/jvn;DLa/p3u0;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v2}, La/pek;->k(I)La/jvn;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    iget-wide v4, v1, La/oi20;->a:D

    .line 300
    .line 301
    invoke-static {v2, v4, v5, v6}, La/ahb;->C(La/jvn;DLa/p3u0;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    iget-object v1, v1, La/oi20;->c:La/l0d;

    .line 306
    .line 307
    invoke-virtual {v3, v0, v2, v1}, La/s6q;->a(Ljava/lang/String;Ljava/lang/String;La/l0d;)V

    .line 308
    .line 309
    .line 310
    :goto_6
    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 314
    .line 315
    .line 316
    :goto_7
    return-object v15

    .line 317
    :pswitch_2
    move-object/from16 v1, p1

    .line 318
    .line 319
    check-cast v1, La/mi20;

    .line 320
    .line 321
    move-object/from16 v2, p2

    .line 322
    .line 323
    check-cast v2, La/yje;

    .line 324
    .line 325
    check-cast v0, La/c720;

    .line 326
    .line 327
    sget-object v2, La/c720;->p2:La/wsz;

    .line 328
    .line 329
    invoke-virtual {v0}, La/c720;->V0()La/c6q;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    iget-object v3, v2, La/c6q;->b:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 334
    .line 335
    invoke-virtual {v0}, La/stl;->P0()La/vfk;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    iget-object v4, v4, La/vfk;->c:Landroid/widget/FrameLayout;

    .line 340
    .line 341
    new-instance v5, La/pls0;

    .line 342
    .line 343
    invoke-static {v4}, La/pym0;->i(Landroid/view/ViewGroup;)La/ihu0;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    invoke-virtual {v4}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    invoke-direct {v5, v4}, La/pls0;-><init>(Ljava/util/Iterator;)V

    .line 352
    .line 353
    .line 354
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    if-nez v4, :cond_b

    .line 359
    .line 360
    move-object v4, v15

    .line 361
    goto :goto_8

    .line 362
    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    :goto_8
    check-cast v4, Landroid/view/View;

    .line 367
    .line 368
    if-eqz v4, :cond_d

    .line 369
    .line 370
    instance-of v5, v1, La/li20;

    .line 371
    .line 372
    if-eqz v5, :cond_c

    .line 373
    .line 374
    move v5, v11

    .line 375
    goto :goto_9

    .line 376
    :cond_c
    move v5, v14

    .line 377
    :goto_9
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 378
    .line 379
    .line 380
    :cond_d
    iget-object v4, v2, La/c6q;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 381
    .line 382
    instance-of v5, v1, La/ki20;

    .line 383
    .line 384
    if-eqz v5, :cond_e

    .line 385
    .line 386
    move v6, v11

    .line 387
    goto :goto_a

    .line 388
    :cond_e
    move v6, v14

    .line 389
    :goto_a
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 390
    .line 391
    .line 392
    iget-object v2, v2, La/c6q;->d:Landroid/widget/TextView;

    .line 393
    .line 394
    instance-of v6, v1, La/li20;

    .line 395
    .line 396
    if-eqz v6, :cond_f

    .line 397
    .line 398
    move v6, v11

    .line 399
    goto :goto_b

    .line 400
    :cond_f
    move v6, v14

    .line 401
    :goto_b
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 402
    .line 403
    .line 404
    if-eqz v5, :cond_10

    .line 405
    .line 406
    move v2, v11

    .line 407
    goto :goto_c

    .line 408
    :cond_10
    move v2, v14

    .line 409
    :goto_c
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 410
    .line 411
    .line 412
    if-eqz v5, :cond_18

    .line 413
    .line 414
    iget-object v2, v0, La/c720;->l2:La/xze;

    .line 415
    .line 416
    if-eqz v2, :cond_11

    .line 417
    .line 418
    iget-object v2, v2, La/zx5;->n:Ljava/lang/Object;

    .line 419
    .line 420
    move-object v15, v2

    .line 421
    check-cast v15, Ljava/util/ArrayList;

    .line 422
    .line 423
    :cond_11
    check-cast v1, La/ki20;

    .line 424
    .line 425
    iget-object v2, v1, La/ki20;->d:Ljava/util/List;

    .line 426
    .line 427
    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v5

    .line 431
    if-eqz v5, :cond_12

    .line 432
    .line 433
    goto :goto_e

    .line 434
    :cond_12
    iget-boolean v1, v1, La/ki20;->c:Z

    .line 435
    .line 436
    iget-object v5, v0, La/c720;->l2:La/xze;

    .line 437
    .line 438
    if-eqz v5, :cond_13

    .line 439
    .line 440
    invoke-virtual {v5, v2}, La/zx5;->H(Ljava/util/List;)V

    .line 441
    .line 442
    .line 443
    :cond_13
    invoke-virtual {v4}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    if-nez v5, :cond_14

    .line 448
    .line 449
    iget-object v5, v0, La/c720;->l2:La/xze;

    .line 450
    .line 451
    invoke-virtual {v4, v5}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 452
    .line 453
    .line 454
    :cond_14
    if-eqz v1, :cond_15

    .line 455
    .line 456
    move v14, v11

    .line 457
    :cond_15
    invoke-virtual {v3, v14}, Landroid/view/View;->setVisibility(I)V

    .line 458
    .line 459
    .line 460
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    invoke-virtual {v4, v1}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0}, La/c720;->V0()La/c6q;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    iget-object v3, v1, La/c6q;->b:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 472
    .line 473
    iget-object v4, v3, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->k:Ljava/util/ArrayList;

    .line 474
    .line 475
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 479
    .line 480
    .line 481
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    if-eqz v5, :cond_16

    .line 490
    .line 491
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    check-cast v5, La/y6q;

    .line 496
    .line 497
    new-instance v6, La/vvh0;

    .line 498
    .line 499
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 500
    .line 501
    .line 502
    invoke-interface {v5}, La/y6q;->a()I

    .line 503
    .line 504
    .line 505
    move-result v5

    .line 506
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v5

    .line 510
    invoke-virtual {v6, v5}, La/vvh0;->a(Ljava/lang/CharSequence;)V

    .line 511
    .line 512
    .line 513
    const/4 v5, 0x6

    .line 514
    invoke-static {v3, v6, v11, v5}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->a(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;La/vvh0;ZI)V

    .line 515
    .line 516
    .line 517
    goto :goto_d

    .line 518
    :cond_16
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    if-nez v0, :cond_17

    .line 523
    .line 524
    iget-object v0, v1, La/c6q;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 525
    .line 526
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->setSelectedPosition(I)V

    .line 531
    .line 532
    .line 533
    :cond_17
    new-instance v0, La/caz;

    .line 534
    .line 535
    invoke-direct {v0, v1, v10}, La/caz;-><init>(Ljava/lang/Object;B)V

    .line 536
    .line 537
    .line 538
    invoke-static {v3, v0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->f(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Lkotlin/jvm/functions/Function1;)V

    .line 539
    .line 540
    .line 541
    :cond_18
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 542
    .line 543
    return-object v0

    .line 544
    :pswitch_3
    move-object/from16 v1, p1

    .line 545
    .line 546
    check-cast v1, La/e9h0;

    .line 547
    .line 548
    move-object/from16 v2, p2

    .line 549
    .line 550
    check-cast v2, La/yje;

    .line 551
    .line 552
    check-cast v0, La/ol60;

    .line 553
    .line 554
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 558
    .line 559
    return-object v0

    .line 560
    :pswitch_4
    move-object/from16 v1, p1

    .line 561
    .line 562
    check-cast v1, La/zz10;

    .line 563
    .line 564
    move-object/from16 v2, p2

    .line 565
    .line 566
    check-cast v2, La/yje;

    .line 567
    .line 568
    check-cast v0, La/c020;

    .line 569
    .line 570
    sget-object v2, La/c020;->U1:La/wsz;

    .line 571
    .line 572
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    sget-object v2, La/uz10;->a:La/uz10;

    .line 576
    .line 577
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    if-eqz v3, :cond_19

    .line 582
    .line 583
    goto/16 :goto_10

    .line 584
    .line 585
    :cond_19
    sget-object v3, La/xz10;->a:La/xz10;

    .line 586
    .line 587
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    if-eqz v3, :cond_1b

    .line 592
    .line 593
    iget-object v1, v0, La/c020;->O1:La/poq0;

    .line 594
    .line 595
    if-eqz v1, :cond_1a

    .line 596
    .line 597
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    sget-object v3, La/fk60;->b:La/uuz;

    .line 605
    .line 606
    sget-object v3, La/noq0;->m2:La/y2m0;

    .line 607
    .line 608
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    const-string v3, "TipsDialogTag"

    .line 612
    .line 613
    invoke-virtual {v1, v3}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    if-nez v4, :cond_22

    .line 618
    .line 619
    new-instance v4, La/noq0;

    .line 620
    .line 621
    invoke-direct {v4}, La/noq0;-><init>()V

    .line 622
    .line 623
    .line 624
    sget-object v5, La/noq0;->n2:[La/iiy;

    .line 625
    .line 626
    aget-object v6, v5, v10

    .line 627
    .line 628
    iget-object v7, v4, La/noq0;->h2:La/zz2;

    .line 629
    .line 630
    invoke-virtual {v7, v4, v6, v12}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 631
    .line 632
    .line 633
    iget-object v6, v4, La/noq0;->i2:La/phf0;

    .line 634
    .line 635
    aget-object v5, v5, v16

    .line 636
    .line 637
    invoke-virtual {v6, v4, v5, v9}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    invoke-static {v4, v1, v3}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    goto/16 :goto_f

    .line 644
    .line 645
    :cond_1a
    const-string v0, "tipsDialogFeature"

    .line 646
    .line 647
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    throw v15

    .line 651
    :cond_1b
    sget-object v3, La/yz10;->a:La/yz10;

    .line 652
    .line 653
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v3

    .line 657
    const-string v4, "snackbarManager"

    .line 658
    .line 659
    if-eqz v3, :cond_1d

    .line 660
    .line 661
    iget-object v1, v0, La/c020;->P1:La/wdk0;

    .line 662
    .line 663
    if-eqz v1, :cond_1c

    .line 664
    .line 665
    new-instance v18, La/xdk0;

    .line 666
    .line 667
    sget-object v6, La/pek0;->a:La/pek0;

    .line 668
    .line 669
    const v3, 0x7f130e62

    .line 670
    .line 671
    .line 672
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v7

    .line 676
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    const v3, 0x7f130e61

    .line 680
    .line 681
    .line 682
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v8

    .line 686
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    const/4 v11, 0x0

    .line 690
    const/16 v12, 0x78

    .line 691
    .line 692
    const/4 v9, 0x0

    .line 693
    const/4 v10, 0x0

    .line 694
    move-object/from16 v5, v18

    .line 695
    .line 696
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 697
    .line 698
    .line 699
    const/16 v23, 0x0

    .line 700
    .line 701
    const/16 v24, 0x3fc

    .line 702
    .line 703
    const/16 v20, 0x0

    .line 704
    .line 705
    const/16 v21, 0x0

    .line 706
    .line 707
    const/16 v22, 0x0

    .line 708
    .line 709
    move-object/from16 v19, v0

    .line 710
    .line 711
    move-object/from16 v17, v1

    .line 712
    .line 713
    invoke-static/range {v17 .. v24}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 714
    .line 715
    .line 716
    goto/16 :goto_f

    .line 717
    .line 718
    :cond_1c
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    throw v15

    .line 722
    :cond_1d
    instance-of v3, v1, La/vz10;

    .line 723
    .line 724
    if-eqz v3, :cond_1f

    .line 725
    .line 726
    check-cast v1, La/vz10;

    .line 727
    .line 728
    iget-object v1, v1, La/vz10;->a:Ljava/lang/String;

    .line 729
    .line 730
    iget-object v3, v0, La/c020;->Q1:La/ii;

    .line 731
    .line 732
    if-eqz v3, :cond_1e

    .line 733
    .line 734
    new-instance v16, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 735
    .line 736
    const v4, 0x7f1306cb

    .line 737
    .line 738
    .line 739
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v17

    .line 743
    new-instance v4, Landroid/text/SpannableString;

    .line 744
    .line 745
    invoke-static {v1, v11}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 746
    .line 747
    .line 748
    move-result-object v1

    .line 749
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    invoke-direct {v4, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 753
    .line 754
    .line 755
    const v1, 0x7f1304ff

    .line 756
    .line 757
    .line 758
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v19

    .line 762
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v20

    .line 769
    sget-object v25, La/n12;->a:La/n12;

    .line 770
    .line 771
    const/16 v26, 0x0

    .line 772
    .line 773
    const/16 v27, 0x5d0

    .line 774
    .line 775
    const/16 v21, 0x0

    .line 776
    .line 777
    const-string v22, "REQUEST_APP_INFO_DIALOG_KEY"

    .line 778
    .line 779
    const/16 v23, 0x0

    .line 780
    .line 781
    const/16 v24, 0x0

    .line 782
    .line 783
    move-object/from16 v18, v4

    .line 784
    .line 785
    invoke-direct/range {v16 .. v27}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 786
    .line 787
    .line 788
    move-object/from16 v1, v16

    .line 789
    .line 790
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v3, v1, v4}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 798
    .line 799
    .line 800
    goto :goto_f

    .line 801
    :cond_1e
    const-string v0, "actionDialogManager"

    .line 802
    .line 803
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    throw v15

    .line 807
    :cond_1f
    instance-of v3, v1, La/tz10;

    .line 808
    .line 809
    if-eqz v3, :cond_21

    .line 810
    .line 811
    check-cast v1, La/tz10;

    .line 812
    .line 813
    iget-object v1, v1, La/tz10;->a:Ljava/lang/String;

    .line 814
    .line 815
    iget-object v3, v0, La/c020;->P1:La/wdk0;

    .line 816
    .line 817
    if-eqz v3, :cond_20

    .line 818
    .line 819
    invoke-static {v1, v11}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 824
    .line 825
    .line 826
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v20

    .line 830
    const v1, 0x7f130671

    .line 831
    .line 832
    .line 833
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v21

    .line 837
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    const v1, 0x7f080467

    .line 841
    .line 842
    .line 843
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 844
    .line 845
    .line 846
    move-result-object v23

    .line 847
    const/16 v24, 0x0

    .line 848
    .line 849
    const/16 v25, 0x50

    .line 850
    .line 851
    const-string v19, ""

    .line 852
    .line 853
    const/16 v22, 0x0

    .line 854
    .line 855
    move-object/from16 v17, v0

    .line 856
    .line 857
    move-object/from16 v18, v3

    .line 858
    .line 859
    invoke-static/range {v17 .. v25}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 860
    .line 861
    .line 862
    goto :goto_f

    .line 863
    :cond_20
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    throw v15

    .line 867
    :cond_21
    instance-of v3, v1, La/wz10;

    .line 868
    .line 869
    if-eqz v3, :cond_24

    .line 870
    .line 871
    check-cast v1, La/wz10;

    .line 872
    .line 873
    iget-object v7, v1, La/wz10;->a:Ljava/lang/String;

    .line 874
    .line 875
    iget-object v1, v0, La/c020;->P1:La/wdk0;

    .line 876
    .line 877
    if-eqz v1, :cond_23

    .line 878
    .line 879
    new-instance v18, La/xdk0;

    .line 880
    .line 881
    sget-object v6, La/rek0;->b:La/rek0;

    .line 882
    .line 883
    const/4 v11, 0x0

    .line 884
    const/16 v12, 0x7c

    .line 885
    .line 886
    const/4 v8, 0x0

    .line 887
    const/4 v9, 0x0

    .line 888
    const/4 v10, 0x0

    .line 889
    move-object/from16 v5, v18

    .line 890
    .line 891
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 892
    .line 893
    .line 894
    const/16 v23, 0x0

    .line 895
    .line 896
    const/16 v24, 0x3fc

    .line 897
    .line 898
    const/16 v20, 0x0

    .line 899
    .line 900
    const/16 v21, 0x0

    .line 901
    .line 902
    const/16 v22, 0x0

    .line 903
    .line 904
    move-object/from16 v19, v0

    .line 905
    .line 906
    move-object/from16 v17, v1

    .line 907
    .line 908
    invoke-static/range {v17 .. v24}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 909
    .line 910
    .line 911
    :cond_22
    :goto_f
    invoke-virtual {v0}, La/c020;->I0()La/l020;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    iget-object v0, v0, La/l020;->t:La/p7m0;

    .line 916
    .line 917
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 918
    .line 919
    .line 920
    invoke-virtual {v0, v15, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 921
    .line 922
    .line 923
    :goto_10
    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 924
    .line 925
    goto :goto_11

    .line 926
    :cond_23
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 927
    .line 928
    .line 929
    throw v15

    .line 930
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 931
    .line 932
    .line 933
    :goto_11
    return-object v15

    .line 934
    :pswitch_5
    move-object/from16 v1, p1

    .line 935
    .line 936
    check-cast v1, La/g020;

    .line 937
    .line 938
    move-object/from16 v2, p2

    .line 939
    .line 940
    check-cast v2, La/yje;

    .line 941
    .line 942
    check-cast v0, La/c020;

    .line 943
    .line 944
    sget-object v2, La/c020;->U1:La/wsz;

    .line 945
    .line 946
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    sget-object v2, La/f020;->a:La/f020;

    .line 950
    .line 951
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 952
    .line 953
    .line 954
    move-result v2

    .line 955
    if-eqz v2, :cond_25

    .line 956
    .line 957
    invoke-virtual {v0, v15}, La/c020;->G0(Ljava/lang/Integer;)V

    .line 958
    .line 959
    .line 960
    goto :goto_12

    .line 961
    :cond_25
    instance-of v2, v1, La/e020;

    .line 962
    .line 963
    if-eqz v2, :cond_26

    .line 964
    .line 965
    check-cast v1, La/e020;

    .line 966
    .line 967
    iget v1, v1, La/e020;->a:I

    .line 968
    .line 969
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 970
    .line 971
    .line 972
    move-result-object v1

    .line 973
    invoke-virtual {v0, v1}, La/c020;->G0(Ljava/lang/Integer;)V

    .line 974
    .line 975
    .line 976
    :goto_12
    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 977
    .line 978
    goto :goto_13

    .line 979
    :cond_26
    invoke-static {}, La/t9f;->b()V

    .line 980
    .line 981
    .line 982
    :goto_13
    return-object v15

    .line 983
    :pswitch_6
    move-object/from16 v1, p1

    .line 984
    .line 985
    check-cast v1, Ljava/lang/Throwable;

    .line 986
    .line 987
    move-object/from16 v2, p2

    .line 988
    .line 989
    check-cast v2, La/yje;

    .line 990
    .line 991
    check-cast v0, La/cx10;

    .line 992
    .line 993
    invoke-virtual {v0, v1}, La/cx10;->y(Ljava/lang/Throwable;)V

    .line 994
    .line 995
    .line 996
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 997
    .line 998
    return-object v0

    .line 999
    :pswitch_7
    move-object/from16 v1, p1

    .line 1000
    .line 1001
    check-cast v1, Ljava/lang/Throwable;

    .line 1002
    .line 1003
    move-object/from16 v2, p2

    .line 1004
    .line 1005
    check-cast v2, La/yje;

    .line 1006
    .line 1007
    check-cast v0, La/cx10;

    .line 1008
    .line 1009
    invoke-virtual {v0, v1}, La/cx10;->y(Ljava/lang/Throwable;)V

    .line 1010
    .line 1011
    .line 1012
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1013
    .line 1014
    return-object v0

    .line 1015
    :pswitch_8
    move-object/from16 v1, p1

    .line 1016
    .line 1017
    check-cast v1, Ljava/lang/Throwable;

    .line 1018
    .line 1019
    move-object/from16 v2, p2

    .line 1020
    .line 1021
    check-cast v2, La/yje;

    .line 1022
    .line 1023
    check-cast v0, La/cx10;

    .line 1024
    .line 1025
    invoke-virtual {v0, v1}, La/cx10;->y(Ljava/lang/Throwable;)V

    .line 1026
    .line 1027
    .line 1028
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1029
    .line 1030
    return-object v0

    .line 1031
    :pswitch_9
    move-object/from16 v1, p1

    .line 1032
    .line 1033
    check-cast v1, Ljava/lang/Throwable;

    .line 1034
    .line 1035
    move-object/from16 v2, p2

    .line 1036
    .line 1037
    check-cast v2, La/yje;

    .line 1038
    .line 1039
    check-cast v0, La/cx10;

    .line 1040
    .line 1041
    invoke-virtual {v0, v1}, La/cx10;->y(Ljava/lang/Throwable;)V

    .line 1042
    .line 1043
    .line 1044
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1045
    .line 1046
    return-object v0

    .line 1047
    :pswitch_a
    move-object/from16 v1, p1

    .line 1048
    .line 1049
    check-cast v1, Ljava/lang/Throwable;

    .line 1050
    .line 1051
    move-object/from16 v2, p2

    .line 1052
    .line 1053
    check-cast v2, La/yje;

    .line 1054
    .line 1055
    check-cast v0, La/cx10;

    .line 1056
    .line 1057
    invoke-virtual {v0, v1}, La/cx10;->y(Ljava/lang/Throwable;)V

    .line 1058
    .line 1059
    .line 1060
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1061
    .line 1062
    return-object v0

    .line 1063
    :pswitch_b
    move-object/from16 v1, p1

    .line 1064
    .line 1065
    check-cast v1, La/ay10;

    .line 1066
    .line 1067
    move-object/from16 v2, p2

    .line 1068
    .line 1069
    check-cast v2, La/yje;

    .line 1070
    .line 1071
    check-cast v0, La/dw10;

    .line 1072
    .line 1073
    sget-object v2, La/dw10;->V1:La/uuz;

    .line 1074
    .line 1075
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1079
    .line 1080
    .line 1081
    move-result v1

    .line 1082
    const/16 v2, 0xa

    .line 1083
    .line 1084
    packed-switch v1, :pswitch_data_1

    .line 1085
    .line 1086
    .line 1087
    new-instance v1, La/sv10;

    .line 1088
    .line 1089
    const/16 v7, 0x10

    .line 1090
    .line 1091
    invoke-direct {v1, v7}, La/sv10;-><init>(B)V

    .line 1092
    .line 1093
    .line 1094
    goto :goto_14

    .line 1095
    :pswitch_c
    const-class v1, La/ce00;

    .line 1096
    .line 1097
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v9

    .line 1101
    new-instance v1, La/sv10;

    .line 1102
    .line 1103
    const/16 v7, 0xf

    .line 1104
    .line 1105
    invoke-direct {v1, v7}, La/sv10;-><init>(B)V

    .line 1106
    .line 1107
    .line 1108
    goto :goto_14

    .line 1109
    :pswitch_d
    const-class v1, La/xsq0;

    .line 1110
    .line 1111
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v9

    .line 1115
    new-instance v1, La/sv10;

    .line 1116
    .line 1117
    const/16 v7, 0xe

    .line 1118
    .line 1119
    invoke-direct {v1, v7}, La/sv10;-><init>(B)V

    .line 1120
    .line 1121
    .line 1122
    goto :goto_14

    .line 1123
    :pswitch_e
    const-class v1, La/l8;

    .line 1124
    .line 1125
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v9

    .line 1129
    new-instance v1, La/sv10;

    .line 1130
    .line 1131
    const/16 v7, 0xc

    .line 1132
    .line 1133
    invoke-direct {v1, v7}, La/sv10;-><init>(B)V

    .line 1134
    .line 1135
    .line 1136
    goto :goto_14

    .line 1137
    :pswitch_f
    const-class v1, La/f9;

    .line 1138
    .line 1139
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v9

    .line 1143
    new-instance v1, La/sv10;

    .line 1144
    .line 1145
    invoke-direct {v1, v7}, La/sv10;-><init>(B)V

    .line 1146
    .line 1147
    .line 1148
    goto :goto_14

    .line 1149
    :pswitch_10
    const-class v1, La/y8;

    .line 1150
    .line 1151
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v9

    .line 1155
    new-instance v1, La/sv10;

    .line 1156
    .line 1157
    const/16 v7, 0xd

    .line 1158
    .line 1159
    invoke-direct {v1, v7}, La/sv10;-><init>(B)V

    .line 1160
    .line 1161
    .line 1162
    goto :goto_14

    .line 1163
    :pswitch_11
    const-class v1, La/t9;

    .line 1164
    .line 1165
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v9

    .line 1169
    new-instance v1, La/sv10;

    .line 1170
    .line 1171
    invoke-direct {v1, v2}, La/sv10;-><init>(B)V

    .line 1172
    .line 1173
    .line 1174
    goto :goto_14

    .line 1175
    :pswitch_12
    const-class v1, La/ufo0;

    .line 1176
    .line 1177
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v9

    .line 1181
    new-instance v1, La/zv10;

    .line 1182
    .line 1183
    invoke-direct {v1, v0, v10}, La/zv10;-><init>(La/dw10;B)V

    .line 1184
    .line 1185
    .line 1186
    goto :goto_14

    .line 1187
    :pswitch_13
    const-class v1, La/jho0;

    .line 1188
    .line 1189
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v9

    .line 1193
    new-instance v1, La/zv10;

    .line 1194
    .line 1195
    invoke-direct {v1, v0, v13}, La/zv10;-><init>(La/dw10;B)V

    .line 1196
    .line 1197
    .line 1198
    :goto_14
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v0}, Landroidx/fragment/app/e;->P()I

    .line 1206
    .line 1207
    .line 1208
    move-result v7

    .line 1209
    invoke-static {v11, v7}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v7

    .line 1213
    new-instance v8, Ljava/util/ArrayList;

    .line 1214
    .line 1215
    invoke-static {v7, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1216
    .line 1217
    .line 1218
    move-result v2

    .line 1219
    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v7}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v2

    .line 1226
    :goto_15
    move-object v7, v2

    .line 1227
    check-cast v7, La/kkx;

    .line 1228
    .line 1229
    iget-boolean v7, v7, La/kkx;->c:Z

    .line 1230
    .line 1231
    if-eqz v7, :cond_27

    .line 1232
    .line 1233
    move-object v7, v2

    .line 1234
    check-cast v7, La/bkx;

    .line 1235
    .line 1236
    invoke-virtual {v7}, La/bkx;->nextInt()I

    .line 1237
    .line 1238
    .line 1239
    move-result v7

    .line 1240
    invoke-virtual {v0, v7}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v7

    .line 1244
    iget-object v7, v7, La/zb5;->i:Ljava/lang/String;

    .line 1245
    .line 1246
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1247
    .line 1248
    .line 1249
    goto :goto_15

    .line 1250
    :cond_27
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v2

    .line 1254
    :cond_28
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1255
    .line 1256
    .line 1257
    move-result v7

    .line 1258
    if-eqz v7, :cond_29

    .line 1259
    .line 1260
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v7

    .line 1264
    move-object v8, v7

    .line 1265
    check-cast v8, Ljava/lang/String;

    .line 1266
    .line 1267
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1268
    .line 1269
    .line 1270
    move-result v8

    .line 1271
    if-eqz v8, :cond_28

    .line 1272
    .line 1273
    move-object v15, v7

    .line 1274
    :cond_29
    check-cast v15, Ljava/lang/String;

    .line 1275
    .line 1276
    new-instance v2, La/zb5;

    .line 1277
    .line 1278
    invoke-direct {v2, v0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v2, v6, v5, v4, v3}, La/zb5;->p(IIII)V

    .line 1282
    .line 1283
    .line 1284
    const v3, 0x7f0a0a2d

    .line 1285
    .line 1286
    .line 1287
    if-nez v15, :cond_2a

    .line 1288
    .line 1289
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v0

    .line 1293
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 1294
    .line 1295
    invoke-virtual {v2, v3, v0, v9}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v2, v9}, La/zb5;->c(Ljava/lang/String;)V

    .line 1299
    .line 1300
    .line 1301
    goto :goto_16

    .line 1302
    :cond_2a
    invoke-virtual {v0, v9}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v0

    .line 1306
    if-eqz v0, :cond_2b

    .line 1307
    .line 1308
    invoke-virtual {v2, v3, v0, v9}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1309
    .line 1310
    .line 1311
    :cond_2b
    :goto_16
    invoke-virtual {v2, v12, v12}, La/zb5;->g(ZZ)I

    .line 1312
    .line 1313
    .line 1314
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1315
    .line 1316
    return-object v0

    .line 1317
    :pswitch_14
    move-object/from16 v1, p1

    .line 1318
    .line 1319
    check-cast v1, Ljava/lang/String;

    .line 1320
    .line 1321
    move-object/from16 v2, p2

    .line 1322
    .line 1323
    check-cast v2, La/yje;

    .line 1324
    .line 1325
    check-cast v0, La/dw10;

    .line 1326
    .line 1327
    sget-object v2, La/dw10;->V1:La/uuz;

    .line 1328
    .line 1329
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v2

    .line 1333
    iget-object v2, v2, La/j1r;->f:La/d5e0;

    .line 1334
    .line 1335
    iget-object v2, v2, La/d5e0;->c:Landroid/widget/TextView;

    .line 1336
    .line 1337
    const v3, 0x7f131276

    .line 1338
    .line 1339
    .line 1340
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v1

    .line 1344
    invoke-virtual {v0, v3, v1}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v0

    .line 1348
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1349
    .line 1350
    .line 1351
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1352
    .line 1353
    return-object v0

    .line 1354
    :pswitch_15
    move-object/from16 v1, p1

    .line 1355
    .line 1356
    check-cast v1, La/nw10;

    .line 1357
    .line 1358
    move-object/from16 v2, p2

    .line 1359
    .line 1360
    check-cast v2, La/yje;

    .line 1361
    .line 1362
    check-cast v0, La/dw10;

    .line 1363
    .line 1364
    sget-object v2, La/dw10;->V1:La/uuz;

    .line 1365
    .line 1366
    instance-of v2, v1, La/iw10;

    .line 1367
    .line 1368
    if-eqz v2, :cond_2c

    .line 1369
    .line 1370
    check-cast v1, La/iw10;

    .line 1371
    .line 1372
    invoke-virtual {v0}, La/dw10;->H0()La/vki;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v2

    .line 1376
    iget-object v2, v2, La/vki;->D:La/peg0;

    .line 1377
    .line 1378
    iget-object v2, v2, La/peg0;->b:Ljava/lang/Object;

    .line 1379
    .line 1380
    check-cast v2, La/yzn0;

    .line 1381
    .line 1382
    invoke-virtual {v2}, La/yzn0;->i()La/ynb;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v9

    .line 1386
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1387
    .line 1388
    .line 1389
    const v2, 0x7f130162

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v10

    .line 1396
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1397
    .line 1398
    .line 1399
    iget-object v11, v1, La/iw10;->a:Ljava/lang/String;

    .line 1400
    .line 1401
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v12

    .line 1405
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1406
    .line 1407
    .line 1408
    const v2, 0x7f130e5d

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v13

    .line 1415
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v14

    .line 1422
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1423
    .line 1424
    .line 1425
    iget-object v15, v1, La/iw10;->b:La/ql5;

    .line 1426
    .line 1427
    invoke-virtual/range {v9 .. v15}, La/ynb;->a(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/e;Ljava/lang/String;Ljava/lang/String;La/ql5;)V

    .line 1428
    .line 1429
    .line 1430
    goto/16 :goto_17

    .line 1431
    .line 1432
    :cond_2c
    instance-of v2, v1, La/gw10;

    .line 1433
    .line 1434
    if-eqz v2, :cond_2d

    .line 1435
    .line 1436
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v0

    .line 1440
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1441
    .line 1442
    new-instance v2, Lkotlin/Pair;

    .line 1443
    .line 1444
    const-string v3, "UPDATED_BALANCE_KEY"

    .line 1445
    .line 1446
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1447
    .line 1448
    .line 1449
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v1

    .line 1453
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v1

    .line 1457
    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1458
    .line 1459
    .line 1460
    goto/16 :goto_17

    .line 1461
    .line 1462
    :cond_2d
    instance-of v2, v1, La/jw10;

    .line 1463
    .line 1464
    if-eqz v2, :cond_2e

    .line 1465
    .line 1466
    invoke-virtual {v0}, La/dw10;->H0()La/vki;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v1

    .line 1470
    iget-object v1, v1, La/vki;->D:La/peg0;

    .line 1471
    .line 1472
    iget-object v1, v1, La/peg0;->b:Ljava/lang/Object;

    .line 1473
    .line 1474
    check-cast v1, La/yzn0;

    .line 1475
    .line 1476
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v2

    .line 1480
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1481
    .line 1482
    .line 1483
    sget-object v3, La/bm5;->g:La/bm5;

    .line 1484
    .line 1485
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v5

    .line 1489
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1490
    .line 1491
    .line 1492
    const-string v7, "SELECT_BALANCE_REQUEST_KEY"

    .line 1493
    .line 1494
    const/16 v8, 0x1ae

    .line 1495
    .line 1496
    const/4 v4, 0x0

    .line 1497
    const/4 v6, 0x0

    .line 1498
    invoke-static/range {v2 .. v8}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 1499
    .line 1500
    .line 1501
    goto/16 :goto_17

    .line 1502
    .line 1503
    :cond_2e
    instance-of v2, v1, La/hw10;

    .line 1504
    .line 1505
    if-eqz v2, :cond_30

    .line 1506
    .line 1507
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v0

    .line 1511
    iget-object v0, v0, La/j1r;->e:Landroid/widget/FrameLayout;

    .line 1512
    .line 1513
    check-cast v1, La/hw10;

    .line 1514
    .line 1515
    iget-boolean v1, v1, La/hw10;->a:Z

    .line 1516
    .line 1517
    if-eqz v1, :cond_2f

    .line 1518
    .line 1519
    move v14, v11

    .line 1520
    :cond_2f
    invoke-virtual {v0, v14}, Landroid/view/View;->setVisibility(I)V

    .line 1521
    .line 1522
    .line 1523
    goto/16 :goto_17

    .line 1524
    .line 1525
    :cond_30
    instance-of v2, v1, La/kw10;

    .line 1526
    .line 1527
    if-eqz v2, :cond_31

    .line 1528
    .line 1529
    invoke-virtual {v0}, La/dw10;->H0()La/vki;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v2

    .line 1533
    iget-object v2, v2, La/vki;->C:La/wdk0;

    .line 1534
    .line 1535
    new-instance v17, La/xdk0;

    .line 1536
    .line 1537
    sget-object v4, La/rek0;->b:La/rek0;

    .line 1538
    .line 1539
    check-cast v1, La/kw10;

    .line 1540
    .line 1541
    iget-object v5, v1, La/kw10;->a:Ljava/lang/String;

    .line 1542
    .line 1543
    const/4 v9, 0x0

    .line 1544
    const/16 v10, 0x7c

    .line 1545
    .line 1546
    const/4 v6, 0x0

    .line 1547
    const/4 v7, 0x0

    .line 1548
    const/4 v8, 0x0

    .line 1549
    move-object/from16 v3, v17

    .line 1550
    .line 1551
    invoke-direct/range {v3 .. v10}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1552
    .line 1553
    .line 1554
    const/16 v22, 0x0

    .line 1555
    .line 1556
    const/16 v23, 0x3fc

    .line 1557
    .line 1558
    const/16 v19, 0x0

    .line 1559
    .line 1560
    const/16 v20, 0x0

    .line 1561
    .line 1562
    const/16 v21, 0x0

    .line 1563
    .line 1564
    move-object/from16 v18, v0

    .line 1565
    .line 1566
    move-object/from16 v16, v2

    .line 1567
    .line 1568
    invoke-static/range {v16 .. v23}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1569
    .line 1570
    .line 1571
    goto :goto_17

    .line 1572
    :cond_31
    instance-of v2, v1, La/mw10;

    .line 1573
    .line 1574
    if-eqz v2, :cond_32

    .line 1575
    .line 1576
    invoke-virtual {v0}, La/dw10;->H0()La/vki;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v1

    .line 1580
    iget-object v1, v1, La/vki;->F:La/nr00;

    .line 1581
    .line 1582
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v0

    .line 1586
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1587
    .line 1588
    .line 1589
    sget-object v1, La/jvp0;->a:La/jvp0;

    .line 1590
    .line 1591
    invoke-static {v0}, La/s9m0;->m(Landroidx/fragment/app/e;)V

    .line 1592
    .line 1593
    .line 1594
    goto :goto_17

    .line 1595
    :cond_32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1596
    .line 1597
    .line 1598
    sget-object v2, La/lw10;->a:La/lw10;

    .line 1599
    .line 1600
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1601
    .line 1602
    .line 1603
    move-result v1

    .line 1604
    if-eqz v1, :cond_33

    .line 1605
    .line 1606
    invoke-virtual {v0}, La/dw10;->H0()La/vki;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v1

    .line 1610
    iget-object v1, v1, La/vki;->E:La/ii;

    .line 1611
    .line 1612
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1613
    .line 1614
    const v3, 0x7f1300e2

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v3

    .line 1621
    const v4, 0x7f1300e1

    .line 1622
    .line 1623
    .line 1624
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v4

    .line 1628
    const v5, 0x7f130f00

    .line 1629
    .line 1630
    .line 1631
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v5

    .line 1635
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1636
    .line 1637
    .line 1638
    const v6, 0x7f130abf

    .line 1639
    .line 1640
    .line 1641
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v6

    .line 1645
    sget-object v11, La/n12;->a:La/n12;

    .line 1646
    .line 1647
    const/4 v12, 0x0

    .line 1648
    const/16 v13, 0x1d0

    .line 1649
    .line 1650
    const/4 v7, 0x0

    .line 1651
    const-string v8, "NEED_IDENTIFICATION_TJ_DIALOG_REQUEST_KEY"

    .line 1652
    .line 1653
    const/4 v9, 0x0

    .line 1654
    const/4 v10, 0x0

    .line 1655
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v0

    .line 1662
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {v1, v2, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1666
    .line 1667
    .line 1668
    :goto_17
    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1669
    .line 1670
    goto :goto_18

    .line 1671
    :cond_33
    invoke-static {}, La/t9f;->b()V

    .line 1672
    .line 1673
    .line 1674
    :goto_18
    return-object v15

    .line 1675
    :pswitch_16
    move-object/from16 v1, p1

    .line 1676
    .line 1677
    check-cast v1, La/rw10;

    .line 1678
    .line 1679
    move-object/from16 v2, p2

    .line 1680
    .line 1681
    check-cast v2, La/yje;

    .line 1682
    .line 1683
    check-cast v0, La/dw10;

    .line 1684
    .line 1685
    sget-object v2, La/dw10;->V1:La/uuz;

    .line 1686
    .line 1687
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v2

    .line 1691
    iget-object v2, v2, La/j1r;->f:La/d5e0;

    .line 1692
    .line 1693
    iget-object v2, v2, La/d5e0;->b:Landroid/widget/FrameLayout;

    .line 1694
    .line 1695
    iget-boolean v3, v1, La/rw10;->e:Z

    .line 1696
    .line 1697
    iget-object v4, v1, La/rw10;->a:Ljava/lang/String;

    .line 1698
    .line 1699
    iget-boolean v5, v1, La/rw10;->d:Z

    .line 1700
    .line 1701
    iget-boolean v6, v1, La/rw10;->c:Z

    .line 1702
    .line 1703
    iget-boolean v7, v1, La/rw10;->f:Z

    .line 1704
    .line 1705
    iget-object v8, v1, La/rw10;->j:La/qw10;

    .line 1706
    .line 1707
    if-eqz v3, :cond_34

    .line 1708
    .line 1709
    move v3, v11

    .line 1710
    goto :goto_19

    .line 1711
    :cond_34
    move v3, v14

    .line 1712
    :goto_19
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1713
    .line 1714
    .line 1715
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v2

    .line 1719
    iget-object v2, v2, La/j1r;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 1720
    .line 1721
    if-eqz v7, :cond_35

    .line 1722
    .line 1723
    move v3, v11

    .line 1724
    goto :goto_1a

    .line 1725
    :cond_35
    move v3, v14

    .line 1726
    :goto_1a
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1727
    .line 1728
    .line 1729
    if-eqz v7, :cond_36

    .line 1730
    .line 1731
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v2

    .line 1735
    iget-object v2, v2, La/j1r;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 1736
    .line 1737
    iget-object v3, v1, La/rw10;->k:Ljava/lang/String;

    .line 1738
    .line 1739
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setAccountTitle(Ljava/lang/CharSequence;)V

    .line 1740
    .line 1741
    .line 1742
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v2

    .line 1746
    iget-object v2, v2, La/j1r;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 1747
    .line 1748
    iget-object v3, v1, La/rw10;->l:Ljava/lang/String;

    .line 1749
    .line 1750
    iget-object v7, v1, La/rw10;->m:Ljava/lang/String;

    .line 1751
    .line 1752
    invoke-virtual {v2, v3, v7}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->x(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 1753
    .line 1754
    .line 1755
    :cond_36
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v2

    .line 1759
    iget-object v2, v2, La/j1r;->c:Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 1760
    .line 1761
    if-eqz v6, :cond_37

    .line 1762
    .line 1763
    move v3, v11

    .line 1764
    goto :goto_1b

    .line 1765
    :cond_37
    move v3, v14

    .line 1766
    :goto_1b
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1767
    .line 1768
    .line 1769
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v2

    .line 1773
    iget-object v2, v2, La/j1r;->g:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 1774
    .line 1775
    if-eqz v6, :cond_38

    .line 1776
    .line 1777
    move v3, v11

    .line 1778
    goto :goto_1c

    .line 1779
    :cond_38
    move v3, v14

    .line 1780
    :goto_1c
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1781
    .line 1782
    .line 1783
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v2

    .line 1787
    iget-object v2, v2, La/j1r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 1788
    .line 1789
    if-eqz v5, :cond_39

    .line 1790
    .line 1791
    move v3, v11

    .line 1792
    goto :goto_1d

    .line 1793
    :cond_39
    move v3, v14

    .line 1794
    :goto_1d
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1795
    .line 1796
    .line 1797
    if-eqz v5, :cond_43

    .line 1798
    .line 1799
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v2

    .line 1803
    iget-object v2, v2, La/j1r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 1804
    .line 1805
    const-string v3, "message"

    .line 1806
    .line 1807
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v2

    .line 1811
    if-eqz v2, :cond_3b

    .line 1812
    .line 1813
    iget-boolean v3, v1, La/rw10;->g:Z

    .line 1814
    .line 1815
    if-eqz v3, :cond_3a

    .line 1816
    .line 1817
    move v14, v11

    .line 1818
    :cond_3a
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 1819
    .line 1820
    .line 1821
    :cond_3b
    if-eqz v2, :cond_3c

    .line 1822
    .line 1823
    iget-object v3, v1, La/rw10;->h:Ljava/lang/Integer;

    .line 1824
    .line 1825
    invoke-virtual {v2, v3}, La/e1i;->setCount(Ljava/lang/Integer;)V

    .line 1826
    .line 1827
    .line 1828
    :cond_3c
    iget-object v2, v0, La/dw10;->Q1:La/y2c0;

    .line 1829
    .line 1830
    if-nez v2, :cond_3d

    .line 1831
    .line 1832
    new-instance v2, La/y2c0;

    .line 1833
    .line 1834
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v3

    .line 1838
    invoke-direct {v2, v3}, La/y2c0;-><init>(Landroid/content/Context;)V

    .line 1839
    .line 1840
    .line 1841
    :cond_3d
    iget-object v3, v0, La/dw10;->R1:La/n2c0;

    .line 1842
    .line 1843
    if-nez v3, :cond_3e

    .line 1844
    .line 1845
    new-instance v3, La/n2c0;

    .line 1846
    .line 1847
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v5

    .line 1851
    invoke-direct {v3, v5}, La/n2c0;-><init>(Landroid/content/Context;)V

    .line 1852
    .line 1853
    .line 1854
    :cond_3e
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v5

    .line 1858
    iget-object v5, v5, La/j1r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 1859
    .line 1860
    instance-of v6, v8, La/ow10;

    .line 1861
    .line 1862
    if-eqz v6, :cond_40

    .line 1863
    .line 1864
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v6

    .line 1868
    if-eqz v6, :cond_3f

    .line 1869
    .line 1870
    check-cast v8, La/ow10;

    .line 1871
    .line 1872
    iget v7, v8, La/ow10;->a:I

    .line 1873
    .line 1874
    invoke-virtual {v6, v7}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v15

    .line 1878
    :cond_3f
    invoke-virtual {v2, v15}, La/y2c0;->setProfileIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1879
    .line 1880
    .line 1881
    goto :goto_1e

    .line 1882
    :cond_40
    instance-of v6, v8, La/pw10;

    .line 1883
    .line 1884
    if-eqz v6, :cond_42

    .line 1885
    .line 1886
    check-cast v8, La/pw10;

    .line 1887
    .line 1888
    iget-object v6, v8, La/pw10;->a:Ljava/lang/String;

    .line 1889
    .line 1890
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v7

    .line 1894
    if-eqz v7, :cond_41

    .line 1895
    .line 1896
    iget v8, v8, La/pw10;->b:I

    .line 1897
    .line 1898
    invoke-virtual {v7, v8}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v15

    .line 1902
    :cond_41
    iget-object v7, v2, La/y2c0;->c:La/l2c0;

    .line 1903
    .line 1904
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v8

    .line 1908
    invoke-static {v8}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v8

    .line 1912
    new-instance v9, La/k1x;

    .line 1913
    .line 1914
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v10

    .line 1918
    invoke-direct {v9, v10}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 1919
    .line 1920
    .line 1921
    iput-object v6, v9, La/k1x;->c:Ljava/lang/Object;

    .line 1922
    .line 1923
    invoke-static {v9, v7}, La/t1x;->h(La/k1x;Landroid/widget/ImageView;)V

    .line 1924
    .line 1925
    .line 1926
    invoke-static {v9, v15}, La/t1x;->d(La/k1x;Landroid/graphics/drawable/Drawable;)V

    .line 1927
    .line 1928
    .line 1929
    invoke-static {v9, v15}, La/t1x;->g(La/k1x;Landroid/graphics/drawable/Drawable;)V

    .line 1930
    .line 1931
    .line 1932
    invoke-virtual {v9}, La/k1x;->a()La/o1x;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v6

    .line 1936
    invoke-virtual {v8, v6}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 1937
    .line 1938
    .line 1939
    :goto_1e
    iput-object v2, v0, La/dw10;->Q1:La/y2c0;

    .line 1940
    .line 1941
    iget-object v5, v5, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 1942
    .line 1943
    invoke-virtual {v5, v2}, La/oiz;->setCustomView(Landroid/view/View;)V

    .line 1944
    .line 1945
    .line 1946
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v2

    .line 1950
    iget-object v2, v2, La/j1r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 1951
    .line 1952
    invoke-virtual {v3, v4}, La/n2c0;->setTitle(Ljava/lang/CharSequence;)V

    .line 1953
    .line 1954
    .line 1955
    iget-object v4, v1, La/rw10;->b:Ljava/lang/String;

    .line 1956
    .line 1957
    invoke-virtual {v3, v4}, La/n2c0;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 1958
    .line 1959
    .line 1960
    iput-object v3, v0, La/dw10;->R1:La/n2c0;

    .line 1961
    .line 1962
    iget-object v2, v2, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 1963
    .line 1964
    invoke-virtual {v2, v3}, La/wf40;->setCustomView(Landroid/view/View;)V

    .line 1965
    .line 1966
    .line 1967
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v0

    .line 1971
    iget-object v0, v0, La/j1r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 1972
    .line 1973
    const-string v2, "settings"

    .line 1974
    .line 1975
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v0

    .line 1979
    if-eqz v0, :cond_44

    .line 1980
    .line 1981
    iget-object v1, v1, La/rw10;->i:La/i8m0;

    .line 1982
    .line 1983
    iget-object v2, v0, La/e1i;->k:La/if5;

    .line 1984
    .line 1985
    iget v3, v0, La/e1i;->g:I

    .line 1986
    .line 1987
    iget v0, v0, La/e1i;->f:I

    .line 1988
    .line 1989
    invoke-virtual {v2, v1, v3, v0}, La/if5;->d(La/i8m0;II)V

    .line 1990
    .line 1991
    .line 1992
    goto :goto_1f

    .line 1993
    :cond_42
    invoke-static {}, La/t9f;->b()V

    .line 1994
    .line 1995
    .line 1996
    goto :goto_20

    .line 1997
    :cond_43
    invoke-virtual {v0}, La/dw10;->G0()La/j1r;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v0

    .line 2001
    iget-object v0, v0, La/j1r;->g:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2002
    .line 2003
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 2004
    .line 2005
    .line 2006
    :cond_44
    :goto_1f
    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2007
    .line 2008
    :goto_20
    return-object v15

    .line 2009
    :pswitch_17
    move-object/from16 v1, p1

    .line 2010
    .line 2011
    check-cast v1, La/lm7;

    .line 2012
    .line 2013
    move-object/from16 v3, p2

    .line 2014
    .line 2015
    check-cast v3, La/yje;

    .line 2016
    .line 2017
    check-cast v0, La/hv10;

    .line 2018
    .line 2019
    sget-object v3, La/hv10;->X1:La/atz;

    .line 2020
    .line 2021
    invoke-virtual {v0}, La/hv10;->H0()La/byq;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v0

    .line 2025
    iget-object v0, v0, La/byq;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 2026
    .line 2027
    iget-wide v3, v1, La/lm7;->a:J

    .line 2028
    .line 2029
    long-to-int v1, v3

    .line 2030
    iget-object v3, v0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->g:Ljava/util/LinkedHashMap;

    .line 2031
    .line 2032
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v4

    .line 2036
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2037
    .line 2038
    .line 2039
    iget-object v0, v0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 2040
    .line 2041
    if-eqz v0, :cond_45

    .line 2042
    .line 2043
    invoke-interface {v0, v1, v2}, La/kao0;->b(ILjava/lang/String;)V

    .line 2044
    .line 2045
    .line 2046
    :cond_45
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2047
    .line 2048
    return-object v0

    .line 2049
    :pswitch_18
    move-object/from16 v1, p1

    .line 2050
    .line 2051
    check-cast v1, La/h120;

    .line 2052
    .line 2053
    move-object/from16 v7, p2

    .line 2054
    .line 2055
    check-cast v7, La/yje;

    .line 2056
    .line 2057
    check-cast v0, La/hv10;

    .line 2058
    .line 2059
    sget-object v7, La/hv10;->X1:La/atz;

    .line 2060
    .line 2061
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2062
    .line 2063
    .line 2064
    iget-object v7, v1, La/h120;->a:La/w950;

    .line 2065
    .line 2066
    invoke-virtual {v0}, La/hv10;->H0()La/byq;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v8

    .line 2070
    iget-object v8, v8, La/byq;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 2071
    .line 2072
    iget-object v7, v7, La/w950;->a:La/cb50;

    .line 2073
    .line 2074
    instance-of v9, v7, La/bb50;

    .line 2075
    .line 2076
    if-eqz v9, :cond_46

    .line 2077
    .line 2078
    const-string v2, "POPULAR_TAG"

    .line 2079
    .line 2080
    goto :goto_21

    .line 2081
    :cond_46
    instance-of v9, v7, La/ya50;

    .line 2082
    .line 2083
    if-eqz v9, :cond_47

    .line 2084
    .line 2085
    const-string v2, "FAVORITES_TAG"

    .line 2086
    .line 2087
    goto :goto_21

    .line 2088
    :cond_47
    instance-of v9, v7, La/xa50;

    .line 2089
    .line 2090
    if-eqz v9, :cond_48

    .line 2091
    .line 2092
    goto :goto_21

    .line 2093
    :cond_48
    instance-of v2, v7, La/za50;

    .line 2094
    .line 2095
    if-eqz v2, :cond_49

    .line 2096
    .line 2097
    const-string v2, "HISTORY_TAG"

    .line 2098
    .line 2099
    goto :goto_21

    .line 2100
    :cond_49
    instance-of v2, v7, La/ab50;

    .line 2101
    .line 2102
    if-eqz v2, :cond_53

    .line 2103
    .line 2104
    const-string v2, "MENU_TAG"

    .line 2105
    .line 2106
    :goto_21
    invoke-virtual {v8, v2}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setSelectedTab(Ljava/lang/String;)V

    .line 2107
    .line 2108
    .line 2109
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v0

    .line 2113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2114
    .line 2115
    .line 2116
    iget-object v2, v1, La/h120;->a:La/w950;

    .line 2117
    .line 2118
    iget-object v7, v2, La/w950;->a:La/cb50;

    .line 2119
    .line 2120
    iget-object v7, v7, La/cb50;->a:Ljava/lang/String;

    .line 2121
    .line 2122
    iget-object v8, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 2123
    .line 2124
    invoke-virtual {v8}, La/pmi;->p()Ljava/util/List;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v8

    .line 2128
    invoke-static {v8}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v9

    .line 2132
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v8

    .line 2136
    :cond_4a
    :goto_22
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2137
    .line 2138
    .line 2139
    move-result v10

    .line 2140
    if-eqz v10, :cond_4b

    .line 2141
    .line 2142
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v10

    .line 2146
    move-object v14, v10

    .line 2147
    check-cast v14, Landroidx/fragment/app/Fragment;

    .line 2148
    .line 2149
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->O()Z

    .line 2150
    .line 2151
    .line 2152
    move-result v15

    .line 2153
    if-nez v15, :cond_4a

    .line 2154
    .line 2155
    iget-object v14, v14, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 2156
    .line 2157
    invoke-static {v14, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2158
    .line 2159
    .line 2160
    move-result v14

    .line 2161
    if-nez v14, :cond_4a

    .line 2162
    .line 2163
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2164
    .line 2165
    .line 2166
    goto :goto_22

    .line 2167
    :cond_4b
    invoke-virtual {v0, v7}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 2168
    .line 2169
    .line 2170
    move-result-object v8

    .line 2171
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2172
    .line 2173
    .line 2174
    move-result v10

    .line 2175
    if-eqz v10, :cond_4c

    .line 2176
    .line 2177
    if-eqz v8, :cond_4c

    .line 2178
    .line 2179
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->S()Z

    .line 2180
    .line 2181
    .line 2182
    move-result v10

    .line 2183
    if-ne v10, v12, :cond_4c

    .line 2184
    .line 2185
    goto/16 :goto_25

    .line 2186
    .line 2187
    :cond_4c
    new-instance v10, La/zb5;

    .line 2188
    .line 2189
    invoke-direct {v10, v0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 2190
    .line 2191
    .line 2192
    invoke-virtual {v10, v6, v5, v4, v3}, La/zb5;->p(IIII)V

    .line 2193
    .line 2194
    .line 2195
    if-eqz v8, :cond_50

    .line 2196
    .line 2197
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->S()Z

    .line 2198
    .line 2199
    .line 2200
    move-result v0

    .line 2201
    if-eqz v0, :cond_4d

    .line 2202
    .line 2203
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->O()Z

    .line 2204
    .line 2205
    .line 2206
    move-result v0

    .line 2207
    if-eqz v0, :cond_51

    .line 2208
    .line 2209
    :cond_4d
    sget-object v0, La/lkz;->e:La/lkz;

    .line 2210
    .line 2211
    invoke-virtual {v10, v8, v0}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 2212
    .line 2213
    .line 2214
    invoke-virtual {v10, v8}, La/zb5;->r(Landroidx/fragment/app/Fragment;)V

    .line 2215
    .line 2216
    .line 2217
    instance-of v0, v8, La/sao0;

    .line 2218
    .line 2219
    if-nez v0, :cond_4e

    .line 2220
    .line 2221
    goto :goto_23

    .line 2222
    :cond_4e
    check-cast v8, La/sao0;

    .line 2223
    .line 2224
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v0

    .line 2228
    const v1, 0x7f0a0388

    .line 2229
    .line 2230
    .line 2231
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v0

    .line 2235
    if-nez v0, :cond_4f

    .line 2236
    .line 2237
    goto :goto_23

    .line 2238
    :cond_4f
    instance-of v1, v0, La/ygt0;

    .line 2239
    .line 2240
    if-eqz v1, :cond_51

    .line 2241
    .line 2242
    iget-boolean v1, v2, La/w950;->b:Z

    .line 2243
    .line 2244
    if-nez v1, :cond_51

    .line 2245
    .line 2246
    check-cast v0, La/ygt0;

    .line 2247
    .line 2248
    invoke-interface {v0}, La/ygt0;->e()V

    .line 2249
    .line 2250
    .line 2251
    goto :goto_23

    .line 2252
    :cond_50
    sget-object v0, La/sao0;->V1:La/m6m0;

    .line 2253
    .line 2254
    iget-object v1, v1, La/h120;->b:La/cb50;

    .line 2255
    .line 2256
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2257
    .line 2258
    .line 2259
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2260
    .line 2261
    .line 2262
    new-instance v0, La/sao0;

    .line 2263
    .line 2264
    invoke-direct {v0}, La/sao0;-><init>()V

    .line 2265
    .line 2266
    .line 2267
    sget-object v2, La/sao0;->W1:[La/iiy;

    .line 2268
    .line 2269
    aget-object v3, v2, v11

    .line 2270
    .line 2271
    iget-object v4, v0, La/sao0;->O1:La/phf0;

    .line 2272
    .line 2273
    invoke-virtual {v4, v0, v3, v7}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 2274
    .line 2275
    .line 2276
    iget-object v3, v0, La/sao0;->Q1:La/yzn0;

    .line 2277
    .line 2278
    aget-object v4, v2, v13

    .line 2279
    .line 2280
    invoke-virtual {v3, v0, v4, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 2281
    .line 2282
    .line 2283
    iget-object v1, v0, La/sao0;->P1:La/cgx0;

    .line 2284
    .line 2285
    aget-object v2, v2, v12

    .line 2286
    .line 2287
    invoke-virtual {v1, v0, v2, v11}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 2288
    .line 2289
    .line 2290
    const v1, 0x7f0a060f

    .line 2291
    .line 2292
    .line 2293
    invoke-virtual {v10, v1, v0, v7, v12}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 2294
    .line 2295
    .line 2296
    :cond_51
    :goto_23
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2297
    .line 2298
    .line 2299
    move-result-object v0

    .line 2300
    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2301
    .line 2302
    .line 2303
    move-result v1

    .line 2304
    if-eqz v1, :cond_52

    .line 2305
    .line 2306
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v1

    .line 2310
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 2311
    .line 2312
    sget-object v2, La/lkz;->c:La/lkz;

    .line 2313
    .line 2314
    invoke-virtual {v10, v1, v2}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 2315
    .line 2316
    .line 2317
    invoke-virtual {v10, v1}, La/zb5;->m(Landroidx/fragment/app/Fragment;)V

    .line 2318
    .line 2319
    .line 2320
    goto :goto_24

    .line 2321
    :cond_52
    invoke-virtual {v10, v12, v12}, La/zb5;->g(ZZ)I

    .line 2322
    .line 2323
    .line 2324
    :goto_25
    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2325
    .line 2326
    goto :goto_26

    .line 2327
    :cond_53
    invoke-static {}, La/t9f;->b()V

    .line 2328
    .line 2329
    .line 2330
    :goto_26
    return-object v15

    .line 2331
    :pswitch_19
    move-object/from16 v1, p1

    .line 2332
    .line 2333
    check-cast v1, La/mao0;

    .line 2334
    .line 2335
    move-object/from16 v2, p2

    .line 2336
    .line 2337
    check-cast v2, La/yje;

    .line 2338
    .line 2339
    check-cast v0, La/hv10;

    .line 2340
    .line 2341
    sget-object v2, La/hv10;->X1:La/atz;

    .line 2342
    .line 2343
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2344
    .line 2345
    .line 2346
    iget-object v2, v1, La/mao0;->b:La/lao0;

    .line 2347
    .line 2348
    iget-object v3, v0, La/hv10;->V1:La/lao0;

    .line 2349
    .line 2350
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2351
    .line 2352
    .line 2353
    move-result v3

    .line 2354
    if-nez v3, :cond_54

    .line 2355
    .line 2356
    iput-object v2, v0, La/hv10;->V1:La/lao0;

    .line 2357
    .line 2358
    invoke-virtual {v0}, La/hv10;->H0()La/byq;

    .line 2359
    .line 2360
    .line 2361
    move-result-object v3

    .line 2362
    iget-object v3, v3, La/byq;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 2363
    .line 2364
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setTabBarDSModel(La/lao0;)V

    .line 2365
    .line 2366
    .line 2367
    invoke-virtual {v0}, La/hv10;->H0()La/byq;

    .line 2368
    .line 2369
    .line 2370
    move-result-object v2

    .line 2371
    iget-object v2, v2, La/byq;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 2372
    .line 2373
    new-instance v3, La/km00;

    .line 2374
    .line 2375
    invoke-direct {v3, v0, v7}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 2376
    .line 2377
    .line 2378
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->setOnTabClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 2379
    .line 2380
    .line 2381
    :cond_54
    invoke-virtual {v0}, La/hv10;->H0()La/byq;

    .line 2382
    .line 2383
    .line 2384
    move-result-object v0

    .line 2385
    iget-object v0, v0, La/byq;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 2386
    .line 2387
    iget-boolean v1, v1, La/mao0;->a:Z

    .line 2388
    .line 2389
    if-eqz v1, :cond_55

    .line 2390
    .line 2391
    move v14, v11

    .line 2392
    :cond_55
    invoke-virtual {v0, v14}, Landroid/view/View;->setVisibility(I)V

    .line 2393
    .line 2394
    .line 2395
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2396
    .line 2397
    return-object v0

    .line 2398
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2399
    .line 2400
    check-cast v1, Ljava/lang/Boolean;

    .line 2401
    .line 2402
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2403
    .line 2404
    .line 2405
    move-result v1

    .line 2406
    move-object/from16 v2, p2

    .line 2407
    .line 2408
    check-cast v2, La/yje;

    .line 2409
    .line 2410
    check-cast v0, La/fm10;

    .line 2411
    .line 2412
    sget-object v2, La/fm10;->S1:[La/iiy;

    .line 2413
    .line 2414
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v0

    .line 2418
    iget-object v0, v0, La/g1r;->d:Landroid/widget/Button;

    .line 2419
    .line 2420
    if-nez v1, :cond_56

    .line 2421
    .line 2422
    move/from16 v11, v16

    .line 2423
    .line 2424
    :cond_56
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 2425
    .line 2426
    .line 2427
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2428
    .line 2429
    return-object v0

    .line 2430
    :pswitch_1b
    move-object/from16 v1, p1

    .line 2431
    .line 2432
    check-cast v1, Ljava/lang/Boolean;

    .line 2433
    .line 2434
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2435
    .line 2436
    .line 2437
    move-result v1

    .line 2438
    move-object/from16 v2, p2

    .line 2439
    .line 2440
    check-cast v2, La/yje;

    .line 2441
    .line 2442
    check-cast v0, La/fm10;

    .line 2443
    .line 2444
    sget-object v2, La/fm10;->S1:[La/iiy;

    .line 2445
    .line 2446
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2447
    .line 2448
    .line 2449
    move-result-object v0

    .line 2450
    iget-object v0, v0, La/g1r;->b:Landroid/widget/Button;

    .line 2451
    .line 2452
    if-eqz v1, :cond_57

    .line 2453
    .line 2454
    move v14, v11

    .line 2455
    :cond_57
    invoke-virtual {v0, v14}, Landroid/view/View;->setVisibility(I)V

    .line 2456
    .line 2457
    .line 2458
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2459
    .line 2460
    return-object v0

    .line 2461
    :pswitch_1c
    move-object/from16 v1, p1

    .line 2462
    .line 2463
    check-cast v1, La/fyb0;

    .line 2464
    .line 2465
    move-object/from16 v2, p2

    .line 2466
    .line 2467
    check-cast v2, La/yje;

    .line 2468
    .line 2469
    check-cast v0, La/fm10;

    .line 2470
    .line 2471
    sget-object v2, La/fm10;->S1:[La/iiy;

    .line 2472
    .line 2473
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2474
    .line 2475
    .line 2476
    iget-boolean v2, v1, La/fyb0;->a:Z

    .line 2477
    .line 2478
    if-eqz v2, :cond_58

    .line 2479
    .line 2480
    iget-object v2, v0, La/fm10;->R1:La/n0o0;

    .line 2481
    .line 2482
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2483
    .line 2484
    .line 2485
    move-result-object v2

    .line 2486
    check-cast v2, La/dyb0;

    .line 2487
    .line 2488
    iget-object v3, v1, La/fyb0;->b:Ljava/util/List;

    .line 2489
    .line 2490
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2491
    .line 2492
    .line 2493
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2494
    .line 2495
    .line 2496
    iget-object v4, v2, La/dyb0;->e:Ljava/util/ArrayList;

    .line 2497
    .line 2498
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 2499
    .line 2500
    .line 2501
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2502
    .line 2503
    .line 2504
    invoke-virtual {v2}, La/yge0;->g()V

    .line 2505
    .line 2506
    .line 2507
    :cond_58
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2508
    .line 2509
    .line 2510
    move-result-object v0

    .line 2511
    iget-object v0, v0, La/g1r;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2512
    .line 2513
    iget-boolean v1, v1, La/fyb0;->a:Z

    .line 2514
    .line 2515
    if-nez v1, :cond_59

    .line 2516
    .line 2517
    move/from16 v11, v16

    .line 2518
    .line 2519
    :cond_59
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 2520
    .line 2521
    .line 2522
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2523
    .line 2524
    return-object v0

    .line 2525
    :pswitch_1d
    move-object/from16 v1, p1

    .line 2526
    .line 2527
    check-cast v1, La/fqs;

    .line 2528
    .line 2529
    move-object/from16 v2, p2

    .line 2530
    .line 2531
    check-cast v2, La/yje;

    .line 2532
    .line 2533
    check-cast v0, La/fm10;

    .line 2534
    .line 2535
    sget-object v2, La/fm10;->S1:[La/iiy;

    .line 2536
    .line 2537
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2538
    .line 2539
    .line 2540
    iget-boolean v2, v1, La/fqs;->a:Z

    .line 2541
    .line 2542
    iget-boolean v3, v1, La/fqs;->f:Z

    .line 2543
    .line 2544
    if-eqz v2, :cond_5e

    .line 2545
    .line 2546
    new-instance v2, La/r3e;

    .line 2547
    .line 2548
    invoke-direct {v2}, La/r3e;-><init>()V

    .line 2549
    .line 2550
    .line 2551
    if-eqz v3, :cond_5a

    .line 2552
    .line 2553
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2554
    .line 2555
    .line 2556
    move-result-object v4

    .line 2557
    iget-object v4, v4, La/g1r;->d:Landroid/widget/Button;

    .line 2558
    .line 2559
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 2560
    .line 2561
    .line 2562
    move-result v4

    .line 2563
    goto :goto_27

    .line 2564
    :cond_5a
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2565
    .line 2566
    .line 2567
    move-result-object v4

    .line 2568
    iget-object v4, v4, La/g1r;->e:Landroid/widget/Button;

    .line 2569
    .line 2570
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 2571
    .line 2572
    .line 2573
    move-result v4

    .line 2574
    :goto_27
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2575
    .line 2576
    .line 2577
    move-result-object v5

    .line 2578
    iget-object v5, v5, La/g1r;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2579
    .line 2580
    invoke-virtual {v2, v5}, La/r3e;->e(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 2581
    .line 2582
    .line 2583
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2584
    .line 2585
    .line 2586
    move-result-object v5

    .line 2587
    iget-object v5, v5, La/g1r;->f:Landroid/widget/Button;

    .line 2588
    .line 2589
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 2590
    .line 2591
    .line 2592
    move-result v5

    .line 2593
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2594
    .line 2595
    .line 2596
    move-result-object v6

    .line 2597
    iget-object v7, v2, La/r3e;->g:Ljava/util/HashMap;

    .line 2598
    .line 2599
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 2600
    .line 2601
    .line 2602
    move-result v6

    .line 2603
    if-nez v6, :cond_5b

    .line 2604
    .line 2605
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2606
    .line 2607
    .line 2608
    move-result-object v6

    .line 2609
    new-instance v8, La/m3e;

    .line 2610
    .line 2611
    invoke-direct {v8}, La/m3e;-><init>()V

    .line 2612
    .line 2613
    .line 2614
    invoke-virtual {v7, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2615
    .line 2616
    .line 2617
    :cond_5b
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2618
    .line 2619
    .line 2620
    move-result-object v5

    .line 2621
    invoke-virtual {v7, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2622
    .line 2623
    .line 2624
    move-result-object v5

    .line 2625
    check-cast v5, La/m3e;

    .line 2626
    .line 2627
    if-nez v5, :cond_5c

    .line 2628
    .line 2629
    goto :goto_28

    .line 2630
    :cond_5c
    iget-object v5, v5, La/m3e;->e:La/n3e;

    .line 2631
    .line 2632
    iput v4, v5, La/n3e;->o:I

    .line 2633
    .line 2634
    const/4 v4, -0x1

    .line 2635
    iput v4, v5, La/n3e;->p:I

    .line 2636
    .line 2637
    iput v4, v5, La/n3e;->q:I

    .line 2638
    .line 2639
    iput v4, v5, La/n3e;->r:I

    .line 2640
    .line 2641
    iput v4, v5, La/n3e;->s:I

    .line 2642
    .line 2643
    :goto_28
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2644
    .line 2645
    .line 2646
    move-result-object v4

    .line 2647
    iget-object v4, v4, La/g1r;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2648
    .line 2649
    invoke-virtual {v2, v4}, La/r3e;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 2650
    .line 2651
    .line 2652
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2653
    .line 2654
    .line 2655
    move-result-object v2

    .line 2656
    iget-object v2, v2, La/g1r;->s:Landroid/widget/TextView;

    .line 2657
    .line 2658
    iget v4, v1, La/fqs;->c:I

    .line 2659
    .line 2660
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(I)V

    .line 2661
    .line 2662
    .line 2663
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2664
    .line 2665
    .line 2666
    move-result-object v2

    .line 2667
    iget-object v2, v2, La/g1r;->s:Landroid/widget/TextView;

    .line 2668
    .line 2669
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2670
    .line 2671
    .line 2672
    move-result-object v4

    .line 2673
    iget v5, v1, La/fqs;->d:I

    .line 2674
    .line 2675
    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    .line 2676
    .line 2677
    .line 2678
    move-result v4

    .line 2679
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2680
    .line 2681
    .line 2682
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2683
    .line 2684
    .line 2685
    move-result-object v2

    .line 2686
    iget-object v2, v2, La/g1r;->l:Landroid/widget/ImageView;

    .line 2687
    .line 2688
    iget v4, v1, La/fqs;->b:I

    .line 2689
    .line 2690
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2691
    .line 2692
    .line 2693
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2694
    .line 2695
    .line 2696
    move-result-object v2

    .line 2697
    iget-object v2, v2, La/g1r;->p:Landroid/widget/TextView;

    .line 2698
    .line 2699
    iget-object v4, v1, La/fqs;->e:Ljava/lang/String;

    .line 2700
    .line 2701
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2702
    .line 2703
    .line 2704
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2705
    .line 2706
    .line 2707
    move-result-object v2

    .line 2708
    iget-object v2, v2, La/g1r;->d:Landroid/widget/Button;

    .line 2709
    .line 2710
    if-eqz v3, :cond_5d

    .line 2711
    .line 2712
    move v14, v11

    .line 2713
    :cond_5d
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 2714
    .line 2715
    .line 2716
    :cond_5e
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2717
    .line 2718
    .line 2719
    move-result-object v0

    .line 2720
    iget-object v0, v0, La/g1r;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2721
    .line 2722
    iget-boolean v1, v1, La/fqs;->a:Z

    .line 2723
    .line 2724
    if-nez v1, :cond_5f

    .line 2725
    .line 2726
    move/from16 v11, v16

    .line 2727
    .line 2728
    :cond_5f
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 2729
    .line 2730
    .line 2731
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2732
    .line 2733
    return-object v0

    .line 2734
    :pswitch_1e
    move-object/from16 v1, p1

    .line 2735
    .line 2736
    check-cast v1, La/snq0;

    .line 2737
    .line 2738
    move-object/from16 v2, p2

    .line 2739
    .line 2740
    check-cast v2, La/yje;

    .line 2741
    .line 2742
    check-cast v0, La/fm10;

    .line 2743
    .line 2744
    sget-object v2, La/fm10;->S1:[La/iiy;

    .line 2745
    .line 2746
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2747
    .line 2748
    .line 2749
    move-result-object v2

    .line 2750
    iget-object v2, v2, La/g1r;->n:Landroid/widget/LinearLayout;

    .line 2751
    .line 2752
    iget-object v3, v1, La/snq0;->a:La/c8h0;

    .line 2753
    .line 2754
    iget-object v1, v1, La/snq0;->b:La/xmq0;

    .line 2755
    .line 2756
    sget-object v4, La/c8h0;->a:La/c8h0;

    .line 2757
    .line 2758
    if-eq v3, v4, :cond_60

    .line 2759
    .line 2760
    move/from16 v4, v16

    .line 2761
    .line 2762
    goto :goto_29

    .line 2763
    :cond_60
    move v4, v11

    .line 2764
    :goto_29
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2765
    .line 2766
    .line 2767
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2768
    .line 2769
    .line 2770
    move-result-object v2

    .line 2771
    iget-object v2, v2, La/g1r;->o:Landroid/widget/LinearLayout;

    .line 2772
    .line 2773
    sget-object v4, La/c8h0;->b:La/c8h0;

    .line 2774
    .line 2775
    if-eq v3, v4, :cond_61

    .line 2776
    .line 2777
    move/from16 v11, v16

    .line 2778
    .line 2779
    :cond_61
    invoke-virtual {v2, v11}, Landroid/view/View;->setVisibility(I)V

    .line 2780
    .line 2781
    .line 2782
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 2783
    .line 2784
    .line 2785
    move-result v2

    .line 2786
    if-eqz v2, :cond_64

    .line 2787
    .line 2788
    if-eq v2, v12, :cond_63

    .line 2789
    .line 2790
    if-ne v2, v13, :cond_62

    .line 2791
    .line 2792
    goto :goto_2a

    .line 2793
    :cond_62
    invoke-static {}, La/t9f;->b()V

    .line 2794
    .line 2795
    .line 2796
    goto :goto_2b

    .line 2797
    :cond_63
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2798
    .line 2799
    .line 2800
    move-result-object v0

    .line 2801
    iget-object v0, v0, La/g1r;->q:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelTimerView;

    .line 2802
    .line 2803
    invoke-virtual {v0, v1}, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelTimerView;->b(La/xmq0;)V

    .line 2804
    .line 2805
    .line 2806
    goto :goto_2a

    .line 2807
    :cond_64
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2808
    .line 2809
    .line 2810
    move-result-object v0

    .line 2811
    iget-object v0, v0, La/g1r;->r:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelTimerView;

    .line 2812
    .line 2813
    invoke-virtual {v0, v1}, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelTimerView;->b(La/xmq0;)V

    .line 2814
    .line 2815
    .line 2816
    :goto_2a
    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2817
    .line 2818
    :goto_2b
    return-object v15

    .line 2819
    :pswitch_1f
    move-object/from16 v1, p1

    .line 2820
    .line 2821
    check-cast v1, La/rxk0;

    .line 2822
    .line 2823
    move-object/from16 v2, p2

    .line 2824
    .line 2825
    check-cast v2, La/yje;

    .line 2826
    .line 2827
    check-cast v0, La/fm10;

    .line 2828
    .line 2829
    sget-object v2, La/fm10;->S1:[La/iiy;

    .line 2830
    .line 2831
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2832
    .line 2833
    .line 2834
    move-result-object v2

    .line 2835
    iget-object v2, v2, La/g1r;->h:Landroid/widget/Button;

    .line 2836
    .line 2837
    iget-boolean v3, v1, La/rxk0;->a:Z

    .line 2838
    .line 2839
    if-eqz v3, :cond_65

    .line 2840
    .line 2841
    move v14, v11

    .line 2842
    :cond_65
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 2843
    .line 2844
    .line 2845
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2846
    .line 2847
    .line 2848
    move-result-object v0

    .line 2849
    iget-object v0, v0, La/g1r;->h:Landroid/widget/Button;

    .line 2850
    .line 2851
    iget-object v1, v1, La/rxk0;->b:Ljava/lang/String;

    .line 2852
    .line 2853
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2854
    .line 2855
    .line 2856
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2857
    .line 2858
    return-object v0

    .line 2859
    :pswitch_20
    move-object/from16 v1, p1

    .line 2860
    .line 2861
    check-cast v1, La/gzk0;

    .line 2862
    .line 2863
    move-object/from16 v2, p2

    .line 2864
    .line 2865
    check-cast v2, La/yje;

    .line 2866
    .line 2867
    check-cast v0, La/fm10;

    .line 2868
    .line 2869
    sget-object v2, La/fm10;->S1:[La/iiy;

    .line 2870
    .line 2871
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2872
    .line 2873
    .line 2874
    move-result-object v2

    .line 2875
    iget-object v2, v2, La/g1r;->g:Landroid/widget/Button;

    .line 2876
    .line 2877
    iget-object v3, v1, La/gzk0;->a:La/c8h0;

    .line 2878
    .line 2879
    iget-object v1, v1, La/gzk0;->b:Ljava/lang/String;

    .line 2880
    .line 2881
    sget-object v4, La/c8h0;->a:La/c8h0;

    .line 2882
    .line 2883
    if-ne v3, v4, :cond_66

    .line 2884
    .line 2885
    move v14, v11

    .line 2886
    :cond_66
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 2887
    .line 2888
    .line 2889
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2890
    .line 2891
    .line 2892
    move-result-object v2

    .line 2893
    iget-object v2, v2, La/g1r;->f:Landroid/widget/Button;

    .line 2894
    .line 2895
    sget-object v5, La/c8h0;->b:La/c8h0;

    .line 2896
    .line 2897
    if-eq v3, v5, :cond_67

    .line 2898
    .line 2899
    move/from16 v11, v16

    .line 2900
    .line 2901
    :cond_67
    invoke-virtual {v2, v11}, Landroid/view/View;->setVisibility(I)V

    .line 2902
    .line 2903
    .line 2904
    if-ne v3, v4, :cond_68

    .line 2905
    .line 2906
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2907
    .line 2908
    .line 2909
    move-result-object v2

    .line 2910
    iget-object v2, v2, La/g1r;->g:Landroid/widget/Button;

    .line 2911
    .line 2912
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2913
    .line 2914
    .line 2915
    :cond_68
    if-ne v3, v5, :cond_69

    .line 2916
    .line 2917
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2918
    .line 2919
    .line 2920
    move-result-object v0

    .line 2921
    iget-object v0, v0, La/g1r;->f:Landroid/widget/Button;

    .line 2922
    .line 2923
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2924
    .line 2925
    .line 2926
    :cond_69
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2927
    .line 2928
    return-object v0

    .line 2929
    :pswitch_21
    move-object/from16 v1, p1

    .line 2930
    .line 2931
    check-cast v1, La/mav0;

    .line 2932
    .line 2933
    move-object/from16 v2, p2

    .line 2934
    .line 2935
    check-cast v2, La/yje;

    .line 2936
    .line 2937
    check-cast v0, La/fm10;

    .line 2938
    .line 2939
    sget-object v2, La/fm10;->S1:[La/iiy;

    .line 2940
    .line 2941
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2942
    .line 2943
    .line 2944
    move-result-object v2

    .line 2945
    iget-object v2, v2, La/g1r;->t:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;

    .line 2946
    .line 2947
    iget-boolean v3, v1, La/mav0;->a:Z

    .line 2948
    .line 2949
    if-eqz v3, :cond_6a

    .line 2950
    .line 2951
    move v14, v11

    .line 2952
    :cond_6a
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 2953
    .line 2954
    .line 2955
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2956
    .line 2957
    .line 2958
    move-result-object v2

    .line 2959
    iget-object v2, v2, La/g1r;->t:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;

    .line 2960
    .line 2961
    iget-object v3, v1, La/mav0;->b:Ljava/util/List;

    .line 2962
    .line 2963
    invoke-virtual {v2, v3}, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->setWheelItems(Ljava/util/List;)V

    .line 2964
    .line 2965
    .line 2966
    iget-object v2, v1, La/mav0;->c:La/esr;

    .line 2967
    .line 2968
    if-eqz v2, :cond_6c

    .line 2969
    .line 2970
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 2971
    .line 2972
    .line 2973
    move-result-object v3

    .line 2974
    iget-object v3, v3, La/g1r;->t:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;

    .line 2975
    .line 2976
    iget-object v4, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->r:Landroid/animation/Animator;

    .line 2977
    .line 2978
    if-eqz v4, :cond_6b

    .line 2979
    .line 2980
    goto :goto_2c

    .line 2981
    :cond_6b
    iget-object v4, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->q:La/uk5;

    .line 2982
    .line 2983
    iget-object v4, v4, La/uk5;->f:Ljava/lang/Object;

    .line 2984
    .line 2985
    check-cast v4, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;

    .line 2986
    .line 2987
    invoke-virtual {v4, v13, v2}, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->a(ILa/esr;)Landroid/animation/ValueAnimator;

    .line 2988
    .line 2989
    .line 2990
    move-result-object v2

    .line 2991
    iget-object v4, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->v:Ljava/util/List;

    .line 2992
    .line 2993
    iget-object v5, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->s:La/bm10;

    .line 2994
    .line 2995
    invoke-virtual {v3, v2, v4, v5}, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->u(Landroid/animation/ValueAnimator;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V

    .line 2996
    .line 2997
    .line 2998
    iput-object v2, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->r:Landroid/animation/Animator;

    .line 2999
    .line 3000
    invoke-virtual {v2}, Landroid/animation/Animator;->start()V

    .line 3001
    .line 3002
    .line 3003
    :cond_6c
    :goto_2c
    iget-object v2, v1, La/mav0;->d:La/esr;

    .line 3004
    .line 3005
    if-eqz v2, :cond_6e

    .line 3006
    .line 3007
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 3008
    .line 3009
    .line 3010
    move-result-object v3

    .line 3011
    iget-object v3, v3, La/g1r;->t:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;

    .line 3012
    .line 3013
    iget-object v4, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->q:La/uk5;

    .line 3014
    .line 3015
    iget-object v5, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->r:Landroid/animation/Animator;

    .line 3016
    .line 3017
    if-eqz v5, :cond_6d

    .line 3018
    .line 3019
    goto :goto_2d

    .line 3020
    :cond_6d
    iget-object v5, v4, La/uk5;->f:Ljava/lang/Object;

    .line 3021
    .line 3022
    check-cast v5, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;

    .line 3023
    .line 3024
    iget-object v4, v4, La/uk5;->d:Landroid/view/View;

    .line 3025
    .line 3026
    const/4 v6, 0x7

    .line 3027
    invoke-virtual {v5, v6, v2}, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->a(ILa/esr;)Landroid/animation/ValueAnimator;

    .line 3028
    .line 3029
    .line 3030
    move-result-object v2

    .line 3031
    iget-object v5, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->w:Ljava/util/List;

    .line 3032
    .line 3033
    iget-object v6, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->t:La/bm10;

    .line 3034
    .line 3035
    invoke-virtual {v3, v2, v5, v6}, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->u(Landroid/animation/ValueAnimator;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V

    .line 3036
    .line 3037
    .line 3038
    new-array v5, v13, [F

    .line 3039
    .line 3040
    fill-array-data v5, :array_0

    .line 3041
    .line 3042
    .line 3043
    invoke-static {v5, v13}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 3044
    .line 3045
    .line 3046
    move-result-object v5

    .line 3047
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 3048
    .line 3049
    .line 3050
    move-result-object v5

    .line 3051
    new-instance v6, La/ro10;

    .line 3052
    .line 3053
    invoke-direct {v6, v4, v11}, La/ro10;-><init>(Landroid/view/View;B)V

    .line 3054
    .line 3055
    .line 3056
    invoke-virtual {v5, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 3057
    .line 3058
    .line 3059
    const-wide/16 v6, 0x1f4

    .line 3060
    .line 3061
    invoke-virtual {v5, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 3062
    .line 3063
    .line 3064
    new-instance v8, La/po10;

    .line 3065
    .line 3066
    invoke-direct {v8, v3, v11}, La/po10;-><init>(Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;B)V

    .line 3067
    .line 3068
    .line 3069
    invoke-virtual {v5, v8}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 3070
    .line 3071
    .line 3072
    new-array v8, v13, [F

    .line 3073
    .line 3074
    fill-array-data v8, :array_1

    .line 3075
    .line 3076
    .line 3077
    invoke-static {v8, v13}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 3078
    .line 3079
    .line 3080
    move-result-object v8

    .line 3081
    invoke-static {v8}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 3082
    .line 3083
    .line 3084
    move-result-object v8

    .line 3085
    new-instance v9, La/ro10;

    .line 3086
    .line 3087
    invoke-direct {v9, v4, v11}, La/ro10;-><init>(Landroid/view/View;B)V

    .line 3088
    .line 3089
    .line 3090
    invoke-virtual {v8, v9}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 3091
    .line 3092
    .line 3093
    invoke-virtual {v8, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 3094
    .line 3095
    .line 3096
    const-wide/16 v6, 0x3e8

    .line 3097
    .line 3098
    invoke-virtual {v8, v6, v7}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 3099
    .line 3100
    .line 3101
    new-instance v4, La/po10;

    .line 3102
    .line 3103
    invoke-direct {v4, v3, v12}, La/po10;-><init>(Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;B)V

    .line 3104
    .line 3105
    .line 3106
    invoke-virtual {v8, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 3107
    .line 3108
    .line 3109
    new-instance v4, Landroid/animation/AnimatorSet;

    .line 3110
    .line 3111
    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 3112
    .line 3113
    .line 3114
    new-array v6, v10, [Landroid/animation/Animator;

    .line 3115
    .line 3116
    aput-object v5, v6, v11

    .line 3117
    .line 3118
    aput-object v2, v6, v12

    .line 3119
    .line 3120
    aput-object v8, v6, v13

    .line 3121
    .line 3122
    invoke-virtual {v4, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 3123
    .line 3124
    .line 3125
    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->start()V

    .line 3126
    .line 3127
    .line 3128
    iput-object v4, v3, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->r:Landroid/animation/Animator;

    .line 3129
    .line 3130
    :cond_6e
    :goto_2d
    iget-boolean v1, v1, La/mav0;->e:Z

    .line 3131
    .line 3132
    if-eqz v1, :cond_6f

    .line 3133
    .line 3134
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 3135
    .line 3136
    .line 3137
    move-result-object v0

    .line 3138
    iget-object v0, v0, La/g1r;->t:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;

    .line 3139
    .line 3140
    iget-object v0, v0, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->q:La/uk5;

    .line 3141
    .line 3142
    iget-object v0, v0, La/uk5;->f:Ljava/lang/Object;

    .line 3143
    .line 3144
    check-cast v0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;

    .line 3145
    .line 3146
    invoke-virtual {v0, v12}, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->setShowActiveSector(Z)V

    .line 3147
    .line 3148
    .line 3149
    goto :goto_2e

    .line 3150
    :cond_6f
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 3151
    .line 3152
    .line 3153
    move-result-object v0

    .line 3154
    iget-object v0, v0, La/g1r;->t:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;

    .line 3155
    .line 3156
    iget-object v0, v0, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->q:La/uk5;

    .line 3157
    .line 3158
    iget-object v0, v0, La/uk5;->f:Ljava/lang/Object;

    .line 3159
    .line 3160
    check-cast v0, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;

    .line 3161
    .line 3162
    invoke-virtual {v0, v11}, Lorg/xplatform/lucky_wheel/presentation/views/WheelView;->setShowActiveSector(Z)V

    .line 3163
    .line 3164
    .line 3165
    :goto_2e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3166
    .line 3167
    return-object v0

    .line 3168
    :pswitch_22
    move-object/from16 v1, p1

    .line 3169
    .line 3170
    check-cast v1, Ljava/lang/Boolean;

    .line 3171
    .line 3172
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3173
    .line 3174
    .line 3175
    move-result v1

    .line 3176
    move-object/from16 v2, p2

    .line 3177
    .line 3178
    check-cast v2, La/yje;

    .line 3179
    .line 3180
    check-cast v0, La/fm10;

    .line 3181
    .line 3182
    sget-object v2, La/fm10;->S1:[La/iiy;

    .line 3183
    .line 3184
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 3185
    .line 3186
    .line 3187
    move-result-object v0

    .line 3188
    iget-object v0, v0, La/g1r;->t:Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;

    .line 3189
    .line 3190
    invoke-virtual {v0, v1}, Lorg/xplatform/lucky_wheel/presentation/views/LuckyWheelView;->setNewYearMode(Z)V

    .line 3191
    .line 3192
    .line 3193
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3194
    .line 3195
    return-object v0

    .line 3196
    :pswitch_23
    move-object/from16 v1, p1

    .line 3197
    .line 3198
    check-cast v1, La/rn10;

    .line 3199
    .line 3200
    move-object/from16 v2, p2

    .line 3201
    .line 3202
    check-cast v2, La/yje;

    .line 3203
    .line 3204
    check-cast v0, La/fm10;

    .line 3205
    .line 3206
    sget-object v2, La/fm10;->S1:[La/iiy;

    .line 3207
    .line 3208
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3209
    .line 3210
    .line 3211
    sget-object v2, La/rn10;->a:La/rn10;

    .line 3212
    .line 3213
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3214
    .line 3215
    .line 3216
    move-result v1

    .line 3217
    if-eqz v1, :cond_71

    .line 3218
    .line 3219
    iget-object v1, v0, La/fm10;->O1:La/uxs0;

    .line 3220
    .line 3221
    if-eqz v1, :cond_70

    .line 3222
    .line 3223
    new-instance v1, La/ffv0;

    .line 3224
    .line 3225
    invoke-direct {v1}, La/ffv0;-><init>()V

    .line 3226
    .line 3227
    .line 3228
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3229
    .line 3230
    .line 3231
    move-result-object v0

    .line 3232
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3233
    .line 3234
    .line 3235
    invoke-static {v1, v0}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 3236
    .line 3237
    .line 3238
    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3239
    .line 3240
    goto :goto_2f

    .line 3241
    :cond_70
    const-string v0, "wildFreeBetScreenFactory"

    .line 3242
    .line 3243
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3244
    .line 3245
    .line 3246
    throw v15

    .line 3247
    :cond_71
    invoke-static {}, La/t9f;->b()V

    .line 3248
    .line 3249
    .line 3250
    :goto_2f
    return-object v15

    .line 3251
    :pswitch_24
    move-object/from16 v1, p1

    .line 3252
    .line 3253
    check-cast v1, Ljava/lang/Boolean;

    .line 3254
    .line 3255
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3256
    .line 3257
    .line 3258
    move-result v1

    .line 3259
    move-object/from16 v2, p2

    .line 3260
    .line 3261
    check-cast v2, La/yje;

    .line 3262
    .line 3263
    check-cast v0, La/fm10;

    .line 3264
    .line 3265
    sget-object v2, La/fm10;->S1:[La/iiy;

    .line 3266
    .line 3267
    invoke-virtual {v0}, La/fm10;->G0()La/g1r;

    .line 3268
    .line 3269
    .line 3270
    move-result-object v0

    .line 3271
    iget-object v0, v0, La/g1r;->e:Landroid/widget/Button;

    .line 3272
    .line 3273
    if-nez v1, :cond_72

    .line 3274
    .line 3275
    move/from16 v11, v16

    .line 3276
    .line 3277
    :cond_72
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 3278
    .line 3279
    .line 3280
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3281
    .line 3282
    return-object v0

    .line 3283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
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

    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method
