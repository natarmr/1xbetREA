.class public final La/ewy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:La/slp;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;La/slp;Lkotlin/jvm/functions/Function1;ZB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/ewy;->a:B

    iput-object p1, p0, La/ewy;->b:Ljava/util/List;

    iput-object p2, p0, La/ewy;->c:La/slp;

    iput-object p3, p0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    iput-boolean p4, p0, La/ewy;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ewy;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    const/high16 v5, 0x41a00000    # 20.0f

    .line 8
    .line 9
    iget-boolean v6, v0, La/ewy;->e:Z

    .line 10
    .line 11
    iget-object v7, v0, La/ewy;->b:Ljava/util/List;

    .line 12
    .line 13
    const/16 v8, 0x92

    .line 14
    .line 15
    const/16 v10, 0x20

    .line 16
    .line 17
    const/4 v11, 0x2

    .line 18
    const/4 v12, 0x4

    .line 19
    const/4 v13, 0x0

    .line 20
    const/4 v14, 0x1

    .line 21
    iget-object v15, v0, La/ewy;->c:La/slp;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    check-cast v0, La/g9z;

    .line 29
    .line 30
    move-object/from16 v1, p2

    .line 31
    .line 32
    check-cast v1, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    move-object/from16 v3, p3

    .line 39
    .line 40
    check-cast v3, La/fet;

    .line 41
    .line 42
    move-object/from16 v4, p4

    .line 43
    .line 44
    check-cast v4, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iget-object v15, v15, La/slp;->b:La/a4x;

    .line 51
    .line 52
    and-int/lit8 v16, v4, 0x6

    .line 53
    .line 54
    if-nez v16, :cond_1

    .line 55
    .line 56
    invoke-virtual {v3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    move v11, v12

    .line 63
    :cond_0
    or-int v0, v4, v11

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move v0, v4

    .line 67
    :goto_0
    and-int/lit8 v4, v4, 0x30

    .line 68
    .line 69
    if-nez v4, :cond_3

    .line 70
    .line 71
    invoke-virtual {v3, v1}, La/fet;->e(I)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    move v9, v10

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    const/16 v9, 0x10

    .line 80
    .line 81
    :goto_1
    or-int/2addr v0, v9

    .line 82
    :cond_3
    and-int/lit16 v4, v0, 0x93

    .line 83
    .line 84
    if-eq v4, v8, :cond_4

    .line 85
    .line 86
    move v4, v14

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move v4, v13

    .line 89
    :goto_2
    and-int/2addr v0, v14

    .line 90
    invoke-virtual {v3, v0, v4}, La/fet;->U(IZ)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_12

    .line 95
    .line 96
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, La/p6t0;

    .line 101
    .line 102
    const v4, 0x25e198f8

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v4, v1, 0x1

    .line 109
    .line 110
    invoke-static {v4, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, La/p6t0;

    .line 115
    .line 116
    instance-of v7, v0, La/olp;

    .line 117
    .line 118
    if-nez v7, :cond_6

    .line 119
    .line 120
    instance-of v7, v0, La/clp;

    .line 121
    .line 122
    if-eqz v7, :cond_5

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_5
    move v7, v13

    .line 126
    goto :goto_4

    .line 127
    :cond_6
    :goto_3
    move v7, v14

    .line 128
    :goto_4
    instance-of v8, v4, La/olp;

    .line 129
    .line 130
    if-nez v8, :cond_8

    .line 131
    .line 132
    instance-of v4, v4, La/clp;

    .line 133
    .line 134
    if-eqz v4, :cond_7

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_7
    move v4, v13

    .line 138
    goto :goto_6

    .line 139
    :cond_8
    :goto_5
    move v4, v14

    .line 140
    :goto_6
    if-eqz v7, :cond_9

    .line 141
    .line 142
    if-nez v4, :cond_9

    .line 143
    .line 144
    move v4, v14

    .line 145
    goto :goto_7

    .line 146
    :cond_9
    move v4, v13

    .line 147
    :goto_7
    if-nez v0, :cond_a

    .line 148
    .line 149
    goto/16 :goto_8

    .line 150
    .line 151
    :cond_a
    instance-of v7, v0, La/plp;

    .line 152
    .line 153
    if-eqz v7, :cond_b

    .line 154
    .line 155
    const v2, 0x11bd1e10

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 159
    .line 160
    .line 161
    check-cast v0, La/plp;

    .line 162
    .line 163
    invoke-static {v0, v3, v13}, La/b34;->l(La/plp;La/fet;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 167
    .line 168
    .line 169
    goto :goto_9

    .line 170
    :cond_b
    instance-of v7, v0, La/ilp;

    .line 171
    .line 172
    if-eqz v7, :cond_c

    .line 173
    .line 174
    const v4, 0x11bd2606

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 178
    .line 179
    .line 180
    check-cast v0, La/ilp;

    .line 181
    .line 182
    invoke-static {v0, v2, v3, v13}, La/b34;->I(La/ilp;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 186
    .line 187
    .line 188
    goto :goto_9

    .line 189
    :cond_c
    instance-of v7, v0, La/xkp;

    .line 190
    .line 191
    if-eqz v7, :cond_d

    .line 192
    .line 193
    const v4, 0x11bd3845

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 197
    .line 198
    .line 199
    check-cast v0, La/xkp;

    .line 200
    .line 201
    invoke-static {v0, v2, v3, v13}, La/b34;->v(La/xkp;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 205
    .line 206
    .line 207
    goto :goto_9

    .line 208
    :cond_d
    instance-of v7, v0, La/alp;

    .line 209
    .line 210
    if-eqz v7, :cond_e

    .line 211
    .line 212
    const v4, 0x11bd4bd0

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 216
    .line 217
    .line 218
    check-cast v0, La/alp;

    .line 219
    .line 220
    invoke-static {v0, v2, v3, v13}, La/b34;->x(La/alp;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 224
    .line 225
    .line 226
    goto :goto_9

    .line 227
    :cond_e
    instance-of v7, v0, La/olp;

    .line 228
    .line 229
    if-eqz v7, :cond_f

    .line 230
    .line 231
    const v7, 0x11bd5f36

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v7}, La/fet;->e0(I)V

    .line 235
    .line 236
    .line 237
    check-cast v0, La/olp;

    .line 238
    .line 239
    invoke-static {v0, v4, v2, v3, v13}, La/b34;->L(La/olp;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 243
    .line 244
    .line 245
    goto :goto_9

    .line 246
    :cond_f
    instance-of v7, v0, La/clp;

    .line 247
    .line 248
    if-eqz v7, :cond_10

    .line 249
    .line 250
    const v7, 0x11bd78a1

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v7}, La/fet;->e0(I)V

    .line 254
    .line 255
    .line 256
    check-cast v0, La/clp;

    .line 257
    .line 258
    invoke-static {v0, v4, v2, v3, v13}, La/b34;->N(La/clp;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 262
    .line 263
    .line 264
    goto :goto_9

    .line 265
    :cond_10
    :goto_8
    const v0, 0x11bd8f63

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 272
    .line 273
    .line 274
    :goto_9
    if-nez v6, :cond_11

    .line 275
    .line 276
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    sub-int/2addr v0, v14

    .line 281
    if-ne v1, v0, :cond_11

    .line 282
    .line 283
    const v0, 0x25f5d55b

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 287
    .line 288
    .line 289
    sget-object v0, La/qmk;->a:La/zcl;

    .line 290
    .line 291
    sget-object v0, La/jm40;->b:La/jm40;

    .line 292
    .line 293
    invoke-static {v0, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 298
    .line 299
    invoke-virtual {v3, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 304
    .line 305
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 306
    .line 307
    .line 308
    move-result-wide v1

    .line 309
    sget-object v4, La/jd8;->n:La/ljc;

    .line 310
    .line 311
    invoke-static {v0, v1, v2, v4}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-static {v3, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 319
    .line 320
    .line 321
    goto :goto_a

    .line 322
    :cond_11
    const v0, 0x25f8c423

    .line 323
    .line 324
    .line 325
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 329
    .line 330
    .line 331
    :goto_a
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 332
    .line 333
    .line 334
    goto :goto_b

    .line 335
    :cond_12
    invoke-virtual {v3}, La/fet;->X()V

    .line 336
    .line 337
    .line 338
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    return-object v0

    .line 341
    :pswitch_0
    move-object/from16 v1, p1

    .line 342
    .line 343
    check-cast v1, La/g9z;

    .line 344
    .line 345
    move-object/from16 v2, p2

    .line 346
    .line 347
    check-cast v2, Ljava/lang/Number;

    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    move-object/from16 v3, p3

    .line 354
    .line 355
    check-cast v3, La/fet;

    .line 356
    .line 357
    move-object/from16 v17, p4

    .line 358
    .line 359
    check-cast v17, Ljava/lang/Number;

    .line 360
    .line 361
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 362
    .line 363
    .line 364
    move-result v17

    .line 365
    and-int/lit8 v18, v17, 0x6

    .line 366
    .line 367
    if-nez v18, :cond_14

    .line 368
    .line 369
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-eqz v1, :cond_13

    .line 374
    .line 375
    move v11, v12

    .line 376
    :cond_13
    or-int v1, v17, v11

    .line 377
    .line 378
    goto :goto_c

    .line 379
    :cond_14
    move/from16 v1, v17

    .line 380
    .line 381
    :goto_c
    and-int/lit8 v11, v17, 0x30

    .line 382
    .line 383
    if-nez v11, :cond_16

    .line 384
    .line 385
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 386
    .line 387
    .line 388
    move-result v11

    .line 389
    if-eqz v11, :cond_15

    .line 390
    .line 391
    move v9, v10

    .line 392
    goto :goto_d

    .line 393
    :cond_15
    const/16 v9, 0x10

    .line 394
    .line 395
    :goto_d
    or-int/2addr v1, v9

    .line 396
    :cond_16
    and-int/lit16 v9, v1, 0x93

    .line 397
    .line 398
    if-eq v9, v8, :cond_17

    .line 399
    .line 400
    move v8, v14

    .line 401
    goto :goto_e

    .line 402
    :cond_17
    move v8, v13

    .line 403
    :goto_e
    and-int/2addr v1, v14

    .line 404
    invoke-virtual {v3, v1, v8}, La/fet;->U(IZ)Z

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    if-eqz v1, :cond_2a

    .line 409
    .line 410
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    check-cast v1, La/p6t0;

    .line 415
    .line 416
    const v7, -0x4884aab1

    .line 417
    .line 418
    .line 419
    invoke-virtual {v3, v7}, La/fet;->e0(I)V

    .line 420
    .line 421
    .line 422
    iget-object v7, v15, La/slp;->b:La/a4x;

    .line 423
    .line 424
    add-int/lit8 v8, v2, -0x1

    .line 425
    .line 426
    invoke-static {v8, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v8

    .line 430
    check-cast v8, La/p6t0;

    .line 431
    .line 432
    add-int/lit8 v9, v2, 0x1

    .line 433
    .line 434
    invoke-static {v9, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v9

    .line 438
    check-cast v9, La/p6t0;

    .line 439
    .line 440
    instance-of v8, v8, La/plp;

    .line 441
    .line 442
    if-eqz v9, :cond_19

    .line 443
    .line 444
    instance-of v10, v9, La/plp;

    .line 445
    .line 446
    if-eqz v10, :cond_18

    .line 447
    .line 448
    goto :goto_f

    .line 449
    :cond_18
    move/from16 v17, v13

    .line 450
    .line 451
    goto :goto_10

    .line 452
    :cond_19
    :goto_f
    move/from16 v17, v14

    .line 453
    .line 454
    :goto_10
    instance-of v10, v1, La/olp;

    .line 455
    .line 456
    if-nez v10, :cond_1b

    .line 457
    .line 458
    instance-of v10, v1, La/clp;

    .line 459
    .line 460
    if-nez v10, :cond_1b

    .line 461
    .line 462
    instance-of v10, v1, La/vhp;

    .line 463
    .line 464
    if-eqz v10, :cond_1a

    .line 465
    .line 466
    goto :goto_11

    .line 467
    :cond_1a
    move v10, v13

    .line 468
    goto :goto_12

    .line 469
    :cond_1b
    :goto_11
    move v10, v14

    .line 470
    :goto_12
    instance-of v11, v9, La/olp;

    .line 471
    .line 472
    if-nez v11, :cond_1d

    .line 473
    .line 474
    instance-of v12, v9, La/clp;

    .line 475
    .line 476
    if-nez v12, :cond_1d

    .line 477
    .line 478
    instance-of v12, v9, La/vhp;

    .line 479
    .line 480
    if-eqz v12, :cond_1c

    .line 481
    .line 482
    goto :goto_13

    .line 483
    :cond_1c
    move v12, v13

    .line 484
    goto :goto_14

    .line 485
    :cond_1d
    :goto_13
    move v12, v14

    .line 486
    :goto_14
    if-eqz v10, :cond_1e

    .line 487
    .line 488
    if-nez v12, :cond_1e

    .line 489
    .line 490
    move/from16 v18, v14

    .line 491
    .line 492
    goto :goto_15

    .line 493
    :cond_1e
    move/from16 v18, v13

    .line 494
    .line 495
    :goto_15
    sget-object v19, La/jm40;->b:La/jm40;

    .line 496
    .line 497
    if-nez v1, :cond_1f

    .line 498
    .line 499
    move-object/from16 v4, v19

    .line 500
    .line 501
    goto/16 :goto_17

    .line 502
    .line 503
    :cond_1f
    instance-of v10, v1, La/plp;

    .line 504
    .line 505
    if-eqz v10, :cond_21

    .line 506
    .line 507
    const v0, -0x2ba0e040

    .line 508
    .line 509
    .line 510
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 511
    .line 512
    .line 513
    sget-object v0, La/qmk;->a:La/zcl;

    .line 514
    .line 515
    if-lez v2, :cond_20

    .line 516
    .line 517
    const/high16 v21, 0x41400000    # 12.0f

    .line 518
    .line 519
    goto :goto_16

    .line 520
    :cond_20
    const/16 v21, 0x0

    .line 521
    .line 522
    :goto_16
    const/16 v23, 0x0

    .line 523
    .line 524
    const/16 v24, 0xd

    .line 525
    .line 526
    const/16 v20, 0x0

    .line 527
    .line 528
    const/16 v22, 0x0

    .line 529
    .line 530
    invoke-static/range {v19 .. v24}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    move-object/from16 v4, v19

    .line 535
    .line 536
    check-cast v1, La/plp;

    .line 537
    .line 538
    invoke-static {v0, v1, v3, v13}, La/acb;->d(La/mm40;La/plp;La/fet;I)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 542
    .line 543
    .line 544
    goto/16 :goto_18

    .line 545
    .line 546
    :cond_21
    move-object/from16 v4, v19

    .line 547
    .line 548
    instance-of v10, v1, La/ilp;

    .line 549
    .line 550
    if-eqz v10, :cond_22

    .line 551
    .line 552
    const v9, -0x2ba0c02c

    .line 553
    .line 554
    .line 555
    invoke-virtual {v3, v9}, La/fet;->e0(I)V

    .line 556
    .line 557
    .line 558
    move-object/from16 v16, v1

    .line 559
    .line 560
    check-cast v16, La/ilp;

    .line 561
    .line 562
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 563
    .line 564
    const/16 v21, 0x0

    .line 565
    .line 566
    move-object/from16 v19, v0

    .line 567
    .line 568
    move-object/from16 v20, v3

    .line 569
    .line 570
    move/from16 v18, v17

    .line 571
    .line 572
    move/from16 v17, v8

    .line 573
    .line 574
    invoke-static/range {v16 .. v21}, La/ny9;->G(La/ilp;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 578
    .line 579
    .line 580
    goto/16 :goto_18

    .line 581
    .line 582
    :cond_22
    move/from16 v27, v17

    .line 583
    .line 584
    move/from16 v17, v8

    .line 585
    .line 586
    move/from16 v8, v18

    .line 587
    .line 588
    move/from16 v18, v27

    .line 589
    .line 590
    instance-of v10, v1, La/xkp;

    .line 591
    .line 592
    if-eqz v10, :cond_23

    .line 593
    .line 594
    const v8, -0x2ba0a1ad

    .line 595
    .line 596
    .line 597
    invoke-virtual {v3, v8}, La/fet;->e0(I)V

    .line 598
    .line 599
    .line 600
    move-object/from16 v16, v1

    .line 601
    .line 602
    check-cast v16, La/xkp;

    .line 603
    .line 604
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 605
    .line 606
    const/16 v21, 0x0

    .line 607
    .line 608
    move-object/from16 v19, v0

    .line 609
    .line 610
    move-object/from16 v20, v3

    .line 611
    .line 612
    invoke-static/range {v16 .. v21}, La/ny9;->u(La/xkp;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 616
    .line 617
    .line 618
    goto/16 :goto_18

    .line 619
    .line 620
    :cond_23
    instance-of v10, v1, La/alp;

    .line 621
    .line 622
    if-eqz v10, :cond_24

    .line 623
    .line 624
    const v8, -0x2ba081e2

    .line 625
    .line 626
    .line 627
    invoke-virtual {v3, v8}, La/fet;->e0(I)V

    .line 628
    .line 629
    .line 630
    move-object/from16 v16, v1

    .line 631
    .line 632
    check-cast v16, La/alp;

    .line 633
    .line 634
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 635
    .line 636
    const/16 v21, 0x0

    .line 637
    .line 638
    move-object/from16 v19, v0

    .line 639
    .line 640
    move-object/from16 v20, v3

    .line 641
    .line 642
    invoke-static/range {v16 .. v21}, La/ny9;->v(La/alp;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 646
    .line 647
    .line 648
    goto/16 :goto_18

    .line 649
    .line 650
    :cond_24
    instance-of v10, v1, La/olp;

    .line 651
    .line 652
    if-eqz v10, :cond_25

    .line 653
    .line 654
    const v9, -0x486beb50

    .line 655
    .line 656
    .line 657
    invoke-virtual {v3, v9}, La/fet;->e0(I)V

    .line 658
    .line 659
    .line 660
    move-object/from16 v16, v1

    .line 661
    .line 662
    check-cast v16, La/olp;

    .line 663
    .line 664
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 665
    .line 666
    const/16 v21, 0x0

    .line 667
    .line 668
    move-object/from16 v19, v0

    .line 669
    .line 670
    move-object/from16 v20, v3

    .line 671
    .line 672
    move/from16 v17, v18

    .line 673
    .line 674
    move/from16 v18, v8

    .line 675
    .line 676
    invoke-static/range {v16 .. v21}, La/ny9;->H(La/olp;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 680
    .line 681
    .line 682
    goto :goto_18

    .line 683
    :cond_25
    instance-of v10, v1, La/vhp;

    .line 684
    .line 685
    if-eqz v10, :cond_26

    .line 686
    .line 687
    const v8, -0x48682404

    .line 688
    .line 689
    .line 690
    invoke-virtual {v3, v8}, La/fet;->e0(I)V

    .line 691
    .line 692
    .line 693
    move-object/from16 v16, v1

    .line 694
    .line 695
    check-cast v16, La/vhp;

    .line 696
    .line 697
    instance-of v1, v9, La/vhp;

    .line 698
    .line 699
    xor-int/2addr v1, v14

    .line 700
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 701
    .line 702
    const/16 v22, 0x0

    .line 703
    .line 704
    move-object/from16 v20, v0

    .line 705
    .line 706
    move-object/from16 v21, v3

    .line 707
    .line 708
    move/from16 v19, v11

    .line 709
    .line 710
    move/from16 v17, v18

    .line 711
    .line 712
    move/from16 v18, v1

    .line 713
    .line 714
    invoke-static/range {v16 .. v22}, La/ny9;->s(La/vhp;ZZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 718
    .line 719
    .line 720
    goto :goto_18

    .line 721
    :cond_26
    move/from16 v10, v18

    .line 722
    .line 723
    instance-of v12, v1, La/uhp;

    .line 724
    .line 725
    if-eqz v12, :cond_27

    .line 726
    .line 727
    const v0, -0x48630d69

    .line 728
    .line 729
    .line 730
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 731
    .line 732
    .line 733
    instance-of v0, v9, La/uhp;

    .line 734
    .line 735
    xor-int/2addr v0, v14

    .line 736
    invoke-static {v10, v0, v11, v3, v13}, La/ny9;->t(ZZZLa/fet;I)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 740
    .line 741
    .line 742
    goto :goto_18

    .line 743
    :cond_27
    instance-of v9, v1, La/clp;

    .line 744
    .line 745
    if-eqz v9, :cond_28

    .line 746
    .line 747
    const v9, -0x485ee19b

    .line 748
    .line 749
    .line 750
    invoke-virtual {v3, v9}, La/fet;->e0(I)V

    .line 751
    .line 752
    .line 753
    move-object/from16 v16, v1

    .line 754
    .line 755
    check-cast v16, La/clp;

    .line 756
    .line 757
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 758
    .line 759
    const/16 v21, 0x0

    .line 760
    .line 761
    move-object/from16 v19, v0

    .line 762
    .line 763
    move-object/from16 v20, v3

    .line 764
    .line 765
    move/from16 v18, v8

    .line 766
    .line 767
    move/from16 v17, v10

    .line 768
    .line 769
    invoke-static/range {v16 .. v21}, La/ny9;->I(La/clp;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 773
    .line 774
    .line 775
    goto :goto_18

    .line 776
    :cond_28
    :goto_17
    const v0, -0x2b9fda31

    .line 777
    .line 778
    .line 779
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 783
    .line 784
    .line 785
    :goto_18
    if-nez v6, :cond_29

    .line 786
    .line 787
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 788
    .line 789
    .line 790
    move-result v0

    .line 791
    sub-int/2addr v0, v14

    .line 792
    if-ne v2, v0, :cond_29

    .line 793
    .line 794
    const v0, -0x4859f391

    .line 795
    .line 796
    .line 797
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 798
    .line 799
    .line 800
    sget-object v0, La/qmk;->a:La/zcl;

    .line 801
    .line 802
    invoke-static {v4, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 807
    .line 808
    invoke-virtual {v3, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 813
    .line 814
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 815
    .line 816
    .line 817
    move-result-wide v1

    .line 818
    sget-object v4, La/jd8;->n:La/ljc;

    .line 819
    .line 820
    invoke-static {v0, v1, v2, v4}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    invoke-static {v3, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 828
    .line 829
    .line 830
    goto :goto_19

    .line 831
    :cond_29
    const v0, -0x485704c9

    .line 832
    .line 833
    .line 834
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 838
    .line 839
    .line 840
    :goto_19
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 841
    .line 842
    .line 843
    goto :goto_1a

    .line 844
    :cond_2a
    invoke-virtual {v3}, La/fet;->X()V

    .line 845
    .line 846
    .line 847
    :goto_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 848
    .line 849
    return-object v0

    .line 850
    :pswitch_1
    move-object/from16 v1, p1

    .line 851
    .line 852
    check-cast v1, La/g9z;

    .line 853
    .line 854
    move-object/from16 v3, p2

    .line 855
    .line 856
    check-cast v3, Ljava/lang/Number;

    .line 857
    .line 858
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 859
    .line 860
    .line 861
    move-result v3

    .line 862
    move-object/from16 v4, p3

    .line 863
    .line 864
    check-cast v4, La/fet;

    .line 865
    .line 866
    move-object/from16 v18, p4

    .line 867
    .line 868
    check-cast v18, Ljava/lang/Number;

    .line 869
    .line 870
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    .line 871
    .line 872
    .line 873
    move-result v18

    .line 874
    iget-object v15, v15, La/slp;->b:La/a4x;

    .line 875
    .line 876
    and-int/lit8 v19, v18, 0x6

    .line 877
    .line 878
    if-nez v19, :cond_2c

    .line 879
    .line 880
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 881
    .line 882
    .line 883
    move-result v1

    .line 884
    if-eqz v1, :cond_2b

    .line 885
    .line 886
    move v11, v12

    .line 887
    :cond_2b
    or-int v1, v18, v11

    .line 888
    .line 889
    goto :goto_1b

    .line 890
    :cond_2c
    move/from16 v1, v18

    .line 891
    .line 892
    :goto_1b
    and-int/lit8 v11, v18, 0x30

    .line 893
    .line 894
    if-nez v11, :cond_2e

    .line 895
    .line 896
    invoke-virtual {v4, v3}, La/fet;->e(I)Z

    .line 897
    .line 898
    .line 899
    move-result v11

    .line 900
    if-eqz v11, :cond_2d

    .line 901
    .line 902
    move v9, v10

    .line 903
    goto :goto_1c

    .line 904
    :cond_2d
    const/16 v9, 0x10

    .line 905
    .line 906
    :goto_1c
    or-int/2addr v1, v9

    .line 907
    :cond_2e
    and-int/lit16 v9, v1, 0x93

    .line 908
    .line 909
    if-eq v9, v8, :cond_2f

    .line 910
    .line 911
    move v8, v14

    .line 912
    goto :goto_1d

    .line 913
    :cond_2f
    move v8, v13

    .line 914
    :goto_1d
    and-int/2addr v1, v14

    .line 915
    invoke-virtual {v4, v1, v8}, La/fet;->U(IZ)Z

    .line 916
    .line 917
    .line 918
    move-result v1

    .line 919
    if-eqz v1, :cond_40

    .line 920
    .line 921
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v1

    .line 925
    check-cast v1, La/p6t0;

    .line 926
    .line 927
    const v7, -0x146ee1b4

    .line 928
    .line 929
    .line 930
    invoke-virtual {v4, v7}, La/fet;->e0(I)V

    .line 931
    .line 932
    .line 933
    add-int/lit8 v7, v3, 0x1

    .line 934
    .line 935
    invoke-static {v7, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v7

    .line 939
    check-cast v7, La/p6t0;

    .line 940
    .line 941
    if-eqz v7, :cond_31

    .line 942
    .line 943
    instance-of v8, v7, La/plp;

    .line 944
    .line 945
    if-eqz v8, :cond_30

    .line 946
    .line 947
    goto :goto_1e

    .line 948
    :cond_30
    move v8, v13

    .line 949
    goto :goto_1f

    .line 950
    :cond_31
    :goto_1e
    move v8, v14

    .line 951
    :goto_1f
    instance-of v9, v1, La/olp;

    .line 952
    .line 953
    if-nez v9, :cond_33

    .line 954
    .line 955
    instance-of v9, v1, La/clp;

    .line 956
    .line 957
    if-eqz v9, :cond_32

    .line 958
    .line 959
    goto :goto_20

    .line 960
    :cond_32
    move v9, v13

    .line 961
    goto :goto_21

    .line 962
    :cond_33
    :goto_20
    move v9, v14

    .line 963
    :goto_21
    instance-of v10, v7, La/olp;

    .line 964
    .line 965
    if-nez v10, :cond_35

    .line 966
    .line 967
    instance-of v7, v7, La/clp;

    .line 968
    .line 969
    if-eqz v7, :cond_34

    .line 970
    .line 971
    goto :goto_22

    .line 972
    :cond_34
    move v7, v13

    .line 973
    goto :goto_23

    .line 974
    :cond_35
    :goto_22
    move v7, v14

    .line 975
    :goto_23
    if-eqz v9, :cond_36

    .line 976
    .line 977
    if-nez v7, :cond_36

    .line 978
    .line 979
    move/from16 v19, v14

    .line 980
    .line 981
    goto :goto_24

    .line 982
    :cond_36
    move/from16 v19, v13

    .line 983
    .line 984
    :goto_24
    sget-object v20, La/jm40;->b:La/jm40;

    .line 985
    .line 986
    if-nez v1, :cond_37

    .line 987
    .line 988
    move-object v2, v4

    .line 989
    move-object/from16 v7, v20

    .line 990
    .line 991
    goto/16 :goto_27

    .line 992
    .line 993
    :cond_37
    instance-of v7, v1, La/plp;

    .line 994
    .line 995
    if-eqz v7, :cond_39

    .line 996
    .line 997
    const v0, 0x181da680

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 1001
    .line 1002
    .line 1003
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1004
    .line 1005
    if-lez v3, :cond_38

    .line 1006
    .line 1007
    const/high16 v22, 0x41400000    # 12.0f

    .line 1008
    .line 1009
    goto :goto_25

    .line 1010
    :cond_38
    const/16 v22, 0x0

    .line 1011
    .line 1012
    :goto_25
    const/16 v24, 0x0

    .line 1013
    .line 1014
    const/16 v25, 0xd

    .line 1015
    .line 1016
    const/16 v21, 0x0

    .line 1017
    .line 1018
    const/16 v23, 0x0

    .line 1019
    .line 1020
    invoke-static/range {v20 .. v25}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    move-object/from16 v7, v20

    .line 1025
    .line 1026
    check-cast v1, La/plp;

    .line 1027
    .line 1028
    invoke-static {v0, v1, v4, v13}, La/acb;->d(La/mm40;La/plp;La/fet;I)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 1032
    .line 1033
    .line 1034
    :goto_26
    move-object v2, v4

    .line 1035
    goto/16 :goto_28

    .line 1036
    .line 1037
    :cond_39
    move-object/from16 v7, v20

    .line 1038
    .line 1039
    instance-of v9, v1, La/ilp;

    .line 1040
    .line 1041
    if-eqz v9, :cond_3a

    .line 1042
    .line 1043
    const v0, 0x181dc662

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 1047
    .line 1048
    .line 1049
    check-cast v1, La/ilp;

    .line 1050
    .line 1051
    invoke-static {v1, v8, v2, v4, v13}, La/b34;->J(La/ilp;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 1055
    .line 1056
    .line 1057
    goto :goto_26

    .line 1058
    :cond_3a
    instance-of v9, v1, La/xkp;

    .line 1059
    .line 1060
    if-eqz v9, :cond_3b

    .line 1061
    .line 1062
    const v0, 0x181ddea1

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 1066
    .line 1067
    .line 1068
    check-cast v1, La/xkp;

    .line 1069
    .line 1070
    invoke-static {v1, v8, v2, v4, v13}, La/b34;->w(La/xkp;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 1074
    .line 1075
    .line 1076
    goto :goto_26

    .line 1077
    :cond_3b
    instance-of v9, v1, La/alp;

    .line 1078
    .line 1079
    if-eqz v9, :cond_3c

    .line 1080
    .line 1081
    const v0, 0x181df82c

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 1085
    .line 1086
    .line 1087
    check-cast v1, La/alp;

    .line 1088
    .line 1089
    invoke-static {v1, v8, v2, v4, v13}, La/b34;->y(La/alp;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 1093
    .line 1094
    .line 1095
    goto :goto_26

    .line 1096
    :cond_3c
    instance-of v2, v1, La/olp;

    .line 1097
    .line 1098
    if-eqz v2, :cond_3d

    .line 1099
    .line 1100
    const v2, -0x145bdf50

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v4, v2}, La/fet;->e0(I)V

    .line 1104
    .line 1105
    .line 1106
    move-object/from16 v17, v1

    .line 1107
    .line 1108
    check-cast v17, La/olp;

    .line 1109
    .line 1110
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 1111
    .line 1112
    const/16 v22, 0x0

    .line 1113
    .line 1114
    move-object/from16 v20, v0

    .line 1115
    .line 1116
    move-object/from16 v21, v4

    .line 1117
    .line 1118
    move/from16 v18, v8

    .line 1119
    .line 1120
    invoke-static/range {v17 .. v22}, La/b34;->M(La/olp;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1121
    .line 1122
    .line 1123
    move-object/from16 v2, v21

    .line 1124
    .line 1125
    invoke-virtual {v2, v13}, La/fet;->r(Z)V

    .line 1126
    .line 1127
    .line 1128
    goto :goto_28

    .line 1129
    :cond_3d
    move-object v2, v4

    .line 1130
    move/from16 v18, v8

    .line 1131
    .line 1132
    instance-of v4, v1, La/clp;

    .line 1133
    .line 1134
    if-eqz v4, :cond_3e

    .line 1135
    .line 1136
    const v4, 0x181e30fd

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 1140
    .line 1141
    .line 1142
    move-object/from16 v17, v1

    .line 1143
    .line 1144
    check-cast v17, La/clp;

    .line 1145
    .line 1146
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 1147
    .line 1148
    const/16 v22, 0x0

    .line 1149
    .line 1150
    move-object/from16 v20, v0

    .line 1151
    .line 1152
    move-object/from16 v21, v2

    .line 1153
    .line 1154
    invoke-static/range {v17 .. v22}, La/b34;->O(La/clp;ZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v2, v13}, La/fet;->r(Z)V

    .line 1158
    .line 1159
    .line 1160
    goto :goto_28

    .line 1161
    :cond_3e
    :goto_27
    const v0, 0x181e4d8f

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v2, v13}, La/fet;->r(Z)V

    .line 1168
    .line 1169
    .line 1170
    :goto_28
    if-nez v6, :cond_3f

    .line 1171
    .line 1172
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 1173
    .line 1174
    .line 1175
    move-result v0

    .line 1176
    sub-int/2addr v0, v14

    .line 1177
    if-ne v3, v0, :cond_3f

    .line 1178
    .line 1179
    const v0, -0x14532351

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 1183
    .line 1184
    .line 1185
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1186
    .line 1187
    invoke-static {v7, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 1192
    .line 1193
    invoke-virtual {v2, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v1

    .line 1197
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1198
    .line 1199
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 1200
    .line 1201
    .line 1202
    move-result-wide v3

    .line 1203
    sget-object v1, La/jd8;->n:La/ljc;

    .line 1204
    .line 1205
    invoke-static {v0, v3, v4, v1}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    invoke-static {v2, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v2, v13}, La/fet;->r(Z)V

    .line 1213
    .line 1214
    .line 1215
    goto :goto_29

    .line 1216
    :cond_3f
    const v0, -0x14503489

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v2, v13}, La/fet;->r(Z)V

    .line 1223
    .line 1224
    .line 1225
    :goto_29
    invoke-virtual {v2, v13}, La/fet;->r(Z)V

    .line 1226
    .line 1227
    .line 1228
    goto :goto_2a

    .line 1229
    :cond_40
    move-object v2, v4

    .line 1230
    invoke-virtual {v2}, La/fet;->X()V

    .line 1231
    .line 1232
    .line 1233
    :goto_2a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1234
    .line 1235
    return-object v0

    .line 1236
    :pswitch_2
    move-object/from16 v1, p1

    .line 1237
    .line 1238
    check-cast v1, La/g9z;

    .line 1239
    .line 1240
    move-object/from16 v2, p2

    .line 1241
    .line 1242
    check-cast v2, Ljava/lang/Number;

    .line 1243
    .line 1244
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1245
    .line 1246
    .line 1247
    move-result v2

    .line 1248
    move-object/from16 v3, p3

    .line 1249
    .line 1250
    check-cast v3, La/fet;

    .line 1251
    .line 1252
    move-object/from16 v4, p4

    .line 1253
    .line 1254
    check-cast v4, Ljava/lang/Number;

    .line 1255
    .line 1256
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 1257
    .line 1258
    .line 1259
    move-result v4

    .line 1260
    iget-object v9, v15, La/slp;->b:La/a4x;

    .line 1261
    .line 1262
    and-int/lit8 v19, v4, 0x6

    .line 1263
    .line 1264
    if-nez v19, :cond_42

    .line 1265
    .line 1266
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v1

    .line 1270
    if-eqz v1, :cond_41

    .line 1271
    .line 1272
    move v11, v12

    .line 1273
    :cond_41
    or-int v1, v4, v11

    .line 1274
    .line 1275
    goto :goto_2b

    .line 1276
    :cond_42
    move v1, v4

    .line 1277
    :goto_2b
    and-int/lit8 v4, v4, 0x30

    .line 1278
    .line 1279
    if-nez v4, :cond_44

    .line 1280
    .line 1281
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 1282
    .line 1283
    .line 1284
    move-result v4

    .line 1285
    if-eqz v4, :cond_43

    .line 1286
    .line 1287
    move/from16 v18, v10

    .line 1288
    .line 1289
    goto :goto_2c

    .line 1290
    :cond_43
    const/16 v18, 0x10

    .line 1291
    .line 1292
    :goto_2c
    or-int v1, v1, v18

    .line 1293
    .line 1294
    :cond_44
    and-int/lit16 v4, v1, 0x93

    .line 1295
    .line 1296
    if-eq v4, v8, :cond_45

    .line 1297
    .line 1298
    move v4, v14

    .line 1299
    goto :goto_2d

    .line 1300
    :cond_45
    move v4, v13

    .line 1301
    :goto_2d
    and-int/2addr v1, v14

    .line 1302
    invoke-virtual {v3, v1, v4}, La/fet;->U(IZ)Z

    .line 1303
    .line 1304
    .line 1305
    move-result v1

    .line 1306
    if-eqz v1, :cond_56

    .line 1307
    .line 1308
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v1

    .line 1312
    check-cast v1, La/p6t0;

    .line 1313
    .line 1314
    const v4, -0x51163453

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 1318
    .line 1319
    .line 1320
    add-int/lit8 v4, v2, 0x1

    .line 1321
    .line 1322
    invoke-static {v4, v9}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v4

    .line 1326
    check-cast v4, La/p6t0;

    .line 1327
    .line 1328
    if-eqz v4, :cond_47

    .line 1329
    .line 1330
    instance-of v7, v4, La/plp;

    .line 1331
    .line 1332
    if-eqz v7, :cond_46

    .line 1333
    .line 1334
    goto :goto_2e

    .line 1335
    :cond_46
    move/from16 v19, v13

    .line 1336
    .line 1337
    goto :goto_2f

    .line 1338
    :cond_47
    :goto_2e
    move/from16 v19, v14

    .line 1339
    .line 1340
    :goto_2f
    instance-of v7, v1, La/olp;

    .line 1341
    .line 1342
    if-nez v7, :cond_49

    .line 1343
    .line 1344
    instance-of v7, v1, La/clp;

    .line 1345
    .line 1346
    if-eqz v7, :cond_48

    .line 1347
    .line 1348
    goto :goto_30

    .line 1349
    :cond_48
    move v7, v13

    .line 1350
    goto :goto_31

    .line 1351
    :cond_49
    :goto_30
    move v7, v14

    .line 1352
    :goto_31
    instance-of v8, v4, La/olp;

    .line 1353
    .line 1354
    if-nez v8, :cond_4b

    .line 1355
    .line 1356
    instance-of v4, v4, La/clp;

    .line 1357
    .line 1358
    if-eqz v4, :cond_4a

    .line 1359
    .line 1360
    goto :goto_32

    .line 1361
    :cond_4a
    move v4, v13

    .line 1362
    goto :goto_33

    .line 1363
    :cond_4b
    :goto_32
    move v4, v14

    .line 1364
    :goto_33
    if-eqz v7, :cond_4c

    .line 1365
    .line 1366
    if-nez v4, :cond_4c

    .line 1367
    .line 1368
    move/from16 v20, v14

    .line 1369
    .line 1370
    goto :goto_34

    .line 1371
    :cond_4c
    move/from16 v20, v13

    .line 1372
    .line 1373
    :goto_34
    sget-object v21, La/jm40;->b:La/jm40;

    .line 1374
    .line 1375
    if-nez v1, :cond_4d

    .line 1376
    .line 1377
    move-object/from16 v4, v21

    .line 1378
    .line 1379
    goto/16 :goto_36

    .line 1380
    .line 1381
    :cond_4d
    instance-of v4, v1, La/plp;

    .line 1382
    .line 1383
    if-eqz v4, :cond_4f

    .line 1384
    .line 1385
    const v0, 0x583947ec

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 1389
    .line 1390
    .line 1391
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1392
    .line 1393
    if-lez v2, :cond_4e

    .line 1394
    .line 1395
    const/high16 v23, 0x41400000    # 12.0f

    .line 1396
    .line 1397
    goto :goto_35

    .line 1398
    :cond_4e
    const/16 v23, 0x0

    .line 1399
    .line 1400
    :goto_35
    const/16 v25, 0x0

    .line 1401
    .line 1402
    const/16 v26, 0xd

    .line 1403
    .line 1404
    const/16 v22, 0x0

    .line 1405
    .line 1406
    const/16 v24, 0x0

    .line 1407
    .line 1408
    invoke-static/range {v21 .. v26}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    move-object/from16 v4, v21

    .line 1413
    .line 1414
    check-cast v1, La/plp;

    .line 1415
    .line 1416
    invoke-static {v0, v1, v3, v13}, La/acb;->d(La/mm40;La/plp;La/fet;I)V

    .line 1417
    .line 1418
    .line 1419
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 1420
    .line 1421
    .line 1422
    goto/16 :goto_37

    .line 1423
    .line 1424
    :cond_4f
    move-object/from16 v4, v21

    .line 1425
    .line 1426
    instance-of v7, v1, La/ilp;

    .line 1427
    .line 1428
    if-eqz v7, :cond_50

    .line 1429
    .line 1430
    const v7, 0x58396805

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v3, v7}, La/fet;->e0(I)V

    .line 1434
    .line 1435
    .line 1436
    move-object/from16 v18, v1

    .line 1437
    .line 1438
    check-cast v18, La/ilp;

    .line 1439
    .line 1440
    iget-object v1, v15, La/slp;->c:Ljava/lang/String;

    .line 1441
    .line 1442
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 1443
    .line 1444
    const/16 v23, 0x0

    .line 1445
    .line 1446
    move-object/from16 v21, v0

    .line 1447
    .line 1448
    move-object/from16 v20, v1

    .line 1449
    .line 1450
    move-object/from16 v22, v3

    .line 1451
    .line 1452
    invoke-static/range {v18 .. v23}, La/o2e;->O(La/ilp;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1453
    .line 1454
    .line 1455
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 1456
    .line 1457
    .line 1458
    goto/16 :goto_37

    .line 1459
    .line 1460
    :cond_50
    instance-of v7, v1, La/xkp;

    .line 1461
    .line 1462
    if-eqz v7, :cond_51

    .line 1463
    .line 1464
    const v7, 0x58398724

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v3, v7}, La/fet;->e0(I)V

    .line 1468
    .line 1469
    .line 1470
    move-object/from16 v18, v1

    .line 1471
    .line 1472
    check-cast v18, La/xkp;

    .line 1473
    .line 1474
    iget-object v1, v15, La/slp;->c:Ljava/lang/String;

    .line 1475
    .line 1476
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 1477
    .line 1478
    const/16 v23, 0x0

    .line 1479
    .line 1480
    move-object/from16 v21, v0

    .line 1481
    .line 1482
    move-object/from16 v20, v1

    .line 1483
    .line 1484
    move-object/from16 v22, v3

    .line 1485
    .line 1486
    invoke-static/range {v18 .. v23}, La/o2e;->A(La/xkp;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 1490
    .line 1491
    .line 1492
    goto/16 :goto_37

    .line 1493
    .line 1494
    :cond_51
    instance-of v7, v1, La/alp;

    .line 1495
    .line 1496
    if-eqz v7, :cond_52

    .line 1497
    .line 1498
    const v7, 0x5839a78f

    .line 1499
    .line 1500
    .line 1501
    invoke-virtual {v3, v7}, La/fet;->e0(I)V

    .line 1502
    .line 1503
    .line 1504
    move-object/from16 v18, v1

    .line 1505
    .line 1506
    check-cast v18, La/alp;

    .line 1507
    .line 1508
    iget-object v1, v15, La/slp;->c:Ljava/lang/String;

    .line 1509
    .line 1510
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 1511
    .line 1512
    const/16 v23, 0x0

    .line 1513
    .line 1514
    move-object/from16 v21, v0

    .line 1515
    .line 1516
    move-object/from16 v20, v1

    .line 1517
    .line 1518
    move-object/from16 v22, v3

    .line 1519
    .line 1520
    invoke-static/range {v18 .. v23}, La/o2e;->B(La/alp;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 1524
    .line 1525
    .line 1526
    goto :goto_37

    .line 1527
    :cond_52
    instance-of v7, v1, La/olp;

    .line 1528
    .line 1529
    if-eqz v7, :cond_53

    .line 1530
    .line 1531
    const v7, -0x5100cd33

    .line 1532
    .line 1533
    .line 1534
    invoke-virtual {v3, v7}, La/fet;->e0(I)V

    .line 1535
    .line 1536
    .line 1537
    move-object/from16 v18, v1

    .line 1538
    .line 1539
    check-cast v18, La/olp;

    .line 1540
    .line 1541
    iget-object v1, v15, La/slp;->c:Ljava/lang/String;

    .line 1542
    .line 1543
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 1544
    .line 1545
    const/16 v24, 0x0

    .line 1546
    .line 1547
    move-object/from16 v22, v0

    .line 1548
    .line 1549
    move-object/from16 v21, v1

    .line 1550
    .line 1551
    move-object/from16 v23, v3

    .line 1552
    .line 1553
    invoke-static/range {v18 .. v24}, La/o2e;->Q(La/olp;ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1554
    .line 1555
    .line 1556
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 1557
    .line 1558
    .line 1559
    goto :goto_37

    .line 1560
    :cond_53
    instance-of v7, v1, La/clp;

    .line 1561
    .line 1562
    if-eqz v7, :cond_54

    .line 1563
    .line 1564
    const v7, -0x50fc2a1e

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v3, v7}, La/fet;->e0(I)V

    .line 1568
    .line 1569
    .line 1570
    move-object/from16 v18, v1

    .line 1571
    .line 1572
    check-cast v18, La/clp;

    .line 1573
    .line 1574
    iget-object v1, v15, La/slp;->c:Ljava/lang/String;

    .line 1575
    .line 1576
    iget-object v0, v0, La/ewy;->d:Lkotlin/jvm/functions/Function1;

    .line 1577
    .line 1578
    const/16 v24, 0x0

    .line 1579
    .line 1580
    move-object/from16 v22, v0

    .line 1581
    .line 1582
    move-object/from16 v21, v1

    .line 1583
    .line 1584
    move-object/from16 v23, v3

    .line 1585
    .line 1586
    invoke-static/range {v18 .. v24}, La/o2e;->R(La/clp;ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 1590
    .line 1591
    .line 1592
    goto :goto_37

    .line 1593
    :cond_54
    :goto_36
    const v0, 0x583a115b

    .line 1594
    .line 1595
    .line 1596
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 1600
    .line 1601
    .line 1602
    :goto_37
    if-nez v6, :cond_55

    .line 1603
    .line 1604
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 1605
    .line 1606
    .line 1607
    move-result v0

    .line 1608
    sub-int/2addr v0, v14

    .line 1609
    if-ne v2, v0, :cond_55

    .line 1610
    .line 1611
    const v0, -0x50f66d9d

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 1615
    .line 1616
    .line 1617
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1618
    .line 1619
    invoke-static {v4, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v0

    .line 1623
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 1624
    .line 1625
    invoke-virtual {v3, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v1

    .line 1629
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1630
    .line 1631
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 1632
    .line 1633
    .line 1634
    move-result-wide v1

    .line 1635
    sget-object v4, La/jd8;->n:La/ljc;

    .line 1636
    .line 1637
    invoke-static {v0, v1, v2, v4}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v0

    .line 1641
    invoke-static {v3, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 1642
    .line 1643
    .line 1644
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 1645
    .line 1646
    .line 1647
    goto :goto_38

    .line 1648
    :cond_55
    const v0, -0x50f37ed5

    .line 1649
    .line 1650
    .line 1651
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 1652
    .line 1653
    .line 1654
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 1655
    .line 1656
    .line 1657
    :goto_38
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 1658
    .line 1659
    .line 1660
    goto :goto_39

    .line 1661
    :cond_56
    invoke-virtual {v3}, La/fet;->X()V

    .line 1662
    .line 1663
    .line 1664
    :goto_39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1665
    .line 1666
    return-object v0

    .line 1667
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
