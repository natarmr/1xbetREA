.class public final La/gic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:La/a4x;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;La/a4x;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/gic;->a:B

    iput-object p1, p0, La/gic;->b:Ljava/util/List;

    iput-object p2, p0, La/gic;->c:La/a4x;

    iput-object p3, p0, La/gic;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;La/a4x;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/gic;->a:B

    iput-object p1, p0, La/gic;->b:Ljava/util/List;

    iput-object p2, p0, La/gic;->d:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/gic;->c:La/a4x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gic;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/high16 v4, 0x41400000    # 12.0f

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    sget-object v7, La/ukd;->a:La/cl5;

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    iget-object v9, v0, La/gic;->d:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    iget-object v10, v0, La/gic;->b:Ljava/util/List;

    .line 18
    .line 19
    const/16 v11, 0x92

    .line 20
    .line 21
    const/4 v14, 0x4

    .line 22
    iget-object v15, v0, La/gic;->c:La/a4x;

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x1

    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v0, p1

    .line 31
    .line 32
    check-cast v0, La/g9z;

    .line 33
    .line 34
    move-object/from16 v1, p2

    .line 35
    .line 36
    check-cast v1, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    move-object/from16 v2, p3

    .line 43
    .line 44
    check-cast v2, La/fet;

    .line 45
    .line 46
    move-object/from16 v3, p4

    .line 47
    .line 48
    check-cast v3, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    and-int/lit8 v4, v3, 0x6

    .line 55
    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move v14, v5

    .line 66
    :goto_0
    or-int v0, v3, v14

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move v0, v3

    .line 70
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 71
    .line 72
    if-nez v3, :cond_3

    .line 73
    .line 74
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_2

    .line 79
    .line 80
    const/16 v17, 0x20

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    const/16 v17, 0x10

    .line 84
    .line 85
    :goto_2
    or-int v0, v0, v17

    .line 86
    .line 87
    :cond_3
    and-int/lit16 v3, v0, 0x93

    .line 88
    .line 89
    if-eq v3, v11, :cond_4

    .line 90
    .line 91
    move v3, v13

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    move v3, v12

    .line 94
    :goto_3
    and-int/2addr v0, v13

    .line 95
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_b

    .line 100
    .line 101
    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, La/etp0;

    .line 106
    .line 107
    const v3, 0x26d53874

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 111
    .line 112
    .line 113
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    iget v3, v3, La/wfn;->d:F

    .line 118
    .line 119
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    iget v4, v4, La/wfn;->d:F

    .line 124
    .line 125
    invoke-static {v15}, La/q3d;->i(Ljava/util/List;)I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-ne v1, v5, :cond_5

    .line 130
    .line 131
    sget-object v5, La/qmk;->a:La/zcl;

    .line 132
    .line 133
    const/high16 v8, 0x41e00000    # 28.0f

    .line 134
    .line 135
    :goto_4
    move/from16 v20, v8

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_5
    sget-object v5, La/qmk;->a:La/zcl;

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :goto_5
    const/16 v21, 0x2

    .line 142
    .line 143
    sget-object v16, La/jm40;->b:La/jm40;

    .line 144
    .line 145
    const/16 v18, 0x0

    .line 146
    .line 147
    move/from16 v17, v3

    .line 148
    .line 149
    move/from16 v19, v4

    .line 150
    .line 151
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 152
    .line 153
    .line 154
    move-result-object v19

    .line 155
    new-instance v20, La/nui0;

    .line 156
    .line 157
    iget-object v3, v0, La/etp0;->b:La/ctp0;

    .line 158
    .line 159
    iget v3, v3, La/ctp0;->a:I

    .line 160
    .line 161
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v21

    .line 165
    new-instance v3, La/m0x;

    .line 166
    .line 167
    iget-object v4, v0, La/etp0;->b:La/ctp0;

    .line 168
    .line 169
    iget v4, v4, La/ctp0;->a:I

    .line 170
    .line 171
    const/4 v5, 0x6

    .line 172
    invoke-direct {v3, v4, v6, v5}, La/m0x;-><init>(ILa/bzw;I)V

    .line 173
    .line 174
    .line 175
    sget-object v4, La/s6t0;->a:La/pz40;

    .line 176
    .line 177
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 182
    .line 183
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 184
    .line 185
    .line 186
    move-result-wide v4

    .line 187
    new-instance v8, La/y3d;

    .line 188
    .line 189
    invoke-direct {v8, v4, v5}, La/y3d;-><init>(J)V

    .line 190
    .line 191
    .line 192
    const/16 v27, 0x0

    .line 193
    .line 194
    const/16 v28, 0xf2

    .line 195
    .line 196
    const/16 v22, 0x0

    .line 197
    .line 198
    const/16 v25, 0x0

    .line 199
    .line 200
    const/16 v26, 0x0

    .line 201
    .line 202
    move-object/from16 v23, v3

    .line 203
    .line 204
    move-object/from16 v24, v8

    .line 205
    .line 206
    invoke-direct/range {v20 .. v28}, La/nui0;-><init>(Ljava/lang/Integer;La/y3d;La/o0x;La/y3d;La/y3d;La/rc5;FI)V

    .line 207
    .line 208
    .line 209
    new-instance v3, La/tui0;

    .line 210
    .line 211
    iget-object v4, v0, La/etp0;->a:Ljava/lang/String;

    .line 212
    .line 213
    invoke-direct {v3, v4, v6}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 214
    .line 215
    .line 216
    if-nez v1, :cond_6

    .line 217
    .line 218
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-ne v4, v13, :cond_6

    .line 223
    .line 224
    sget-object v1, La/wui0;->a:La/wui0;

    .line 225
    .line 226
    :goto_6
    move-object/from16 v26, v1

    .line 227
    .line 228
    move-object/from16 v22, v20

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_6
    if-nez v1, :cond_7

    .line 232
    .line 233
    sget-object v1, La/wui0;->b:La/wui0;

    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_7
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    sub-int/2addr v4, v13

    .line 241
    if-ne v1, v4, :cond_8

    .line 242
    .line 243
    sget-object v1, La/wui0;->d:La/wui0;

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_8
    sget-object v1, La/wui0;->c:La/wui0;

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :goto_7
    new-instance v20, La/rqm;

    .line 250
    .line 251
    const/16 v28, 0x0

    .line 252
    .line 253
    const/16 v29, 0x1bc

    .line 254
    .line 255
    const/16 v23, 0x0

    .line 256
    .line 257
    const/16 v24, 0x0

    .line 258
    .line 259
    const/16 v25, 0x0

    .line 260
    .line 261
    const/16 v27, 0x0

    .line 262
    .line 263
    move-object/from16 v21, v3

    .line 264
    .line 265
    invoke-direct/range {v20 .. v29}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    or-int/2addr v1, v3

    .line 277
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    if-nez v1, :cond_9

    .line 282
    .line 283
    if-ne v3, v7, :cond_a

    .line 284
    .line 285
    :cond_9
    new-instance v3, La/ywm0;

    .line 286
    .line 287
    const/16 v1, 0xb

    .line 288
    .line 289
    invoke-direct {v3, v9, v0, v1}, La/ywm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :cond_a
    move-object/from16 v23, v3

    .line 296
    .line 297
    check-cast v23, Lkotlin/jvm/functions/Function0;

    .line 298
    .line 299
    const/16 v28, 0x0

    .line 300
    .line 301
    const/16 v29, 0xec

    .line 302
    .line 303
    const/16 v21, 0x0

    .line 304
    .line 305
    const/16 v22, 0x0

    .line 306
    .line 307
    const/16 v24, 0x0

    .line 308
    .line 309
    const/16 v25, 0x0

    .line 310
    .line 311
    const/16 v26, 0x0

    .line 312
    .line 313
    move-object/from16 v27, v2

    .line 314
    .line 315
    invoke-static/range {v19 .. v29}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 316
    .line 317
    .line 318
    move-object/from16 v0, v27

    .line 319
    .line 320
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 321
    .line 322
    .line 323
    goto :goto_8

    .line 324
    :cond_b
    move-object v0, v2

    .line 325
    invoke-virtual {v0}, La/fet;->X()V

    .line 326
    .line 327
    .line 328
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 329
    .line 330
    return-object v0

    .line 331
    :pswitch_0
    move-object/from16 v0, p1

    .line 332
    .line 333
    check-cast v0, La/g9z;

    .line 334
    .line 335
    move-object/from16 v1, p2

    .line 336
    .line 337
    check-cast v1, Ljava/lang/Number;

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    move-object/from16 v2, p3

    .line 344
    .line 345
    check-cast v2, La/fet;

    .line 346
    .line 347
    move-object/from16 v3, p4

    .line 348
    .line 349
    check-cast v3, Ljava/lang/Number;

    .line 350
    .line 351
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    and-int/lit8 v4, v3, 0x6

    .line 356
    .line 357
    if-nez v4, :cond_d

    .line 358
    .line 359
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_c

    .line 364
    .line 365
    goto :goto_9

    .line 366
    :cond_c
    move v14, v5

    .line 367
    :goto_9
    or-int v0, v3, v14

    .line 368
    .line 369
    goto :goto_a

    .line 370
    :cond_d
    move v0, v3

    .line 371
    :goto_a
    and-int/lit8 v3, v3, 0x30

    .line 372
    .line 373
    if-nez v3, :cond_f

    .line 374
    .line 375
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    if-eqz v3, :cond_e

    .line 380
    .line 381
    const/16 v17, 0x20

    .line 382
    .line 383
    goto :goto_b

    .line 384
    :cond_e
    const/16 v17, 0x10

    .line 385
    .line 386
    :goto_b
    or-int v0, v0, v17

    .line 387
    .line 388
    :cond_f
    and-int/lit16 v3, v0, 0x93

    .line 389
    .line 390
    if-eq v3, v11, :cond_10

    .line 391
    .line 392
    move v3, v13

    .line 393
    goto :goto_c

    .line 394
    :cond_10
    move v3, v12

    .line 395
    :goto_c
    and-int/2addr v0, v13

    .line 396
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-eqz v0, :cond_20

    .line 401
    .line 402
    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    check-cast v0, La/p6t0;

    .line 407
    .line 408
    const v3, -0x24ea4048

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 412
    .line 413
    .line 414
    if-nez v0, :cond_11

    .line 415
    .line 416
    goto/16 :goto_e

    .line 417
    .line 418
    :cond_11
    instance-of v3, v0, La/u2p0;

    .line 419
    .line 420
    sget-object v17, La/jm40;->b:La/jm40;

    .line 421
    .line 422
    if-eqz v3, :cond_14

    .line 423
    .line 424
    const v1, -0x19f70846

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 428
    .line 429
    .line 430
    sget-object v1, La/qmk;->a:La/zcl;

    .line 431
    .line 432
    const/16 v21, 0x0

    .line 433
    .line 434
    const/16 v22, 0x8

    .line 435
    .line 436
    const/high16 v18, 0x41000000    # 8.0f

    .line 437
    .line 438
    const/high16 v19, 0x41400000    # 12.0f

    .line 439
    .line 440
    const/high16 v20, 0x41000000    # 8.0f

    .line 441
    .line 442
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 443
    .line 444
    .line 445
    move-result-object v19

    .line 446
    move-object v1, v0

    .line 447
    check-cast v1, La/u2p0;

    .line 448
    .line 449
    iget-object v1, v1, La/u2p0;->b:La/jjm;

    .line 450
    .line 451
    sget-object v21, La/kjm;->a:La/kjm;

    .line 452
    .line 453
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    invoke-virtual {v2, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    or-int/2addr v3, v4

    .line 462
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    if-nez v3, :cond_12

    .line 467
    .line 468
    if-ne v4, v7, :cond_13

    .line 469
    .line 470
    :cond_12
    new-instance v4, La/y2p0;

    .line 471
    .line 472
    invoke-direct {v4, v0, v9}, La/y2p0;-><init>(La/p6t0;Lkotlin/jvm/functions/Function1;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    :cond_13
    move-object/from16 v23, v4

    .line 479
    .line 480
    check-cast v23, Lkotlin/jvm/functions/Function0;

    .line 481
    .line 482
    const/16 v26, 0x180

    .line 483
    .line 484
    const/16 v27, 0x28

    .line 485
    .line 486
    const/16 v22, 0x0

    .line 487
    .line 488
    const/16 v24, 0x0

    .line 489
    .line 490
    move-object/from16 v20, v1

    .line 491
    .line 492
    move-object/from16 v25, v2

    .line 493
    .line 494
    invoke-static/range {v19 .. v27}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 498
    .line 499
    .line 500
    goto/16 :goto_f

    .line 501
    .line 502
    :cond_14
    instance-of v3, v0, La/b3p0;

    .line 503
    .line 504
    if-eqz v3, :cond_15

    .line 505
    .line 506
    const v0, -0x19f6ac1b

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 510
    .line 511
    .line 512
    invoke-static {v12, v2, v6}, La/v2n0;->e(ILa/fet;La/mm40;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 516
    .line 517
    .line 518
    goto/16 :goto_f

    .line 519
    .line 520
    :cond_15
    instance-of v3, v0, La/w2p0;

    .line 521
    .line 522
    if-eqz v3, :cond_16

    .line 523
    .line 524
    const v1, -0x19f6983f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 528
    .line 529
    .line 530
    check-cast v0, La/w2p0;

    .line 531
    .line 532
    iget-object v0, v0, La/w2p0;->a:La/j1p0;

    .line 533
    .line 534
    invoke-static {v6, v0, v2, v12}, La/aad;->D(La/mm40;La/j1p0;La/fet;I)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 538
    .line 539
    .line 540
    goto/16 :goto_f

    .line 541
    .line 542
    :cond_16
    instance-of v3, v0, La/a3p0;

    .line 543
    .line 544
    if-eqz v3, :cond_17

    .line 545
    .line 546
    const v1, -0x19f6844f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 550
    .line 551
    .line 552
    sget-object v1, La/qmk;->a:La/zcl;

    .line 553
    .line 554
    const/16 v21, 0x0

    .line 555
    .line 556
    const/16 v22, 0xd

    .line 557
    .line 558
    const/16 v18, 0x0

    .line 559
    .line 560
    const/high16 v19, 0x41000000    # 8.0f

    .line 561
    .line 562
    const/16 v20, 0x0

    .line 563
    .line 564
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    check-cast v0, La/a3p0;

    .line 569
    .line 570
    iget-object v0, v0, La/a3p0;->a:La/m1p0;

    .line 571
    .line 572
    invoke-static {v1, v0, v2, v12}, La/pym0;->d(La/mm40;La/m1p0;La/fet;I)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 576
    .line 577
    .line 578
    goto/16 :goto_f

    .line 579
    .line 580
    :cond_17
    instance-of v3, v0, La/p2p0;

    .line 581
    .line 582
    if-eqz v3, :cond_18

    .line 583
    .line 584
    const v1, -0x19f667fa

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 588
    .line 589
    .line 590
    check-cast v0, La/p2p0;

    .line 591
    .line 592
    iget-object v0, v0, La/p2p0;->b:La/rqm;

    .line 593
    .line 594
    const/16 v28, 0x0

    .line 595
    .line 596
    const/16 v29, 0xfd

    .line 597
    .line 598
    const/16 v19, 0x0

    .line 599
    .line 600
    const/16 v21, 0x0

    .line 601
    .line 602
    const/16 v22, 0x0

    .line 603
    .line 604
    const/16 v23, 0x0

    .line 605
    .line 606
    const/16 v24, 0x0

    .line 607
    .line 608
    const/16 v25, 0x0

    .line 609
    .line 610
    const/16 v26, 0x0

    .line 611
    .line 612
    move-object/from16 v20, v0

    .line 613
    .line 614
    move-object/from16 v27, v2

    .line 615
    .line 616
    invoke-static/range {v19 .. v29}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 620
    .line 621
    .line 622
    goto/16 :goto_f

    .line 623
    .line 624
    :cond_18
    instance-of v3, v0, La/o2p0;

    .line 625
    .line 626
    if-eqz v3, :cond_1b

    .line 627
    .line 628
    const v1, -0x19f65b17

    .line 629
    .line 630
    .line 631
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 632
    .line 633
    .line 634
    move-object v1, v0

    .line 635
    check-cast v1, La/o2p0;

    .line 636
    .line 637
    iget-object v1, v1, La/o2p0;->b:La/rqm;

    .line 638
    .line 639
    invoke-virtual {v2, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v3

    .line 643
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    move-result v4

    .line 647
    or-int/2addr v3, v4

    .line 648
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    if-nez v3, :cond_19

    .line 653
    .line 654
    if-ne v4, v7, :cond_1a

    .line 655
    .line 656
    :cond_19
    new-instance v4, La/y2p0;

    .line 657
    .line 658
    invoke-direct {v4, v9, v0}, La/y2p0;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    :cond_1a
    move-object/from16 v23, v4

    .line 665
    .line 666
    check-cast v23, Lkotlin/jvm/functions/Function0;

    .line 667
    .line 668
    const/16 v28, 0x0

    .line 669
    .line 670
    const/16 v29, 0xed

    .line 671
    .line 672
    const/16 v19, 0x0

    .line 673
    .line 674
    const/16 v21, 0x0

    .line 675
    .line 676
    const/16 v22, 0x0

    .line 677
    .line 678
    const/16 v24, 0x0

    .line 679
    .line 680
    const/16 v25, 0x0

    .line 681
    .line 682
    const/16 v26, 0x0

    .line 683
    .line 684
    move-object/from16 v20, v1

    .line 685
    .line 686
    move-object/from16 v27, v2

    .line 687
    .line 688
    invoke-static/range {v19 .. v29}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 692
    .line 693
    .line 694
    goto :goto_f

    .line 695
    :cond_1b
    instance-of v3, v0, La/v2p0;

    .line 696
    .line 697
    if-eqz v3, :cond_1f

    .line 698
    .line 699
    const v3, -0x19f6314c

    .line 700
    .line 701
    .line 702
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 703
    .line 704
    .line 705
    sub-int/2addr v1, v13

    .line 706
    invoke-static {v1, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    instance-of v1, v1, La/u2p0;

    .line 711
    .line 712
    if-nez v1, :cond_1c

    .line 713
    .line 714
    sget-object v1, La/qmk;->a:La/zcl;

    .line 715
    .line 716
    const/high16 v19, 0x41000000    # 8.0f

    .line 717
    .line 718
    goto :goto_d

    .line 719
    :cond_1c
    sget-object v1, La/qmk;->a:La/zcl;

    .line 720
    .line 721
    move/from16 v19, v8

    .line 722
    .line 723
    :goto_d
    const/16 v21, 0x0

    .line 724
    .line 725
    const/16 v22, 0xd

    .line 726
    .line 727
    const/16 v18, 0x0

    .line 728
    .line 729
    const/16 v20, 0x0

    .line 730
    .line 731
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 732
    .line 733
    .line 734
    move-result-object v19

    .line 735
    move-object v1, v0

    .line 736
    check-cast v1, La/v2p0;

    .line 737
    .line 738
    iget-object v3, v1, La/v2p0;->b:La/mim0;

    .line 739
    .line 740
    iget-boolean v1, v1, La/v2p0;->c:Z

    .line 741
    .line 742
    invoke-virtual {v2, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    move-result v4

    .line 746
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    move-result v5

    .line 750
    or-int/2addr v4, v5

    .line 751
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v5

    .line 755
    if-nez v4, :cond_1d

    .line 756
    .line 757
    if-ne v5, v7, :cond_1e

    .line 758
    .line 759
    :cond_1d
    new-instance v5, La/bi2;

    .line 760
    .line 761
    const/16 v4, 0xa

    .line 762
    .line 763
    invoke-direct {v5, v9, v0, v4}, La/bi2;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    :cond_1e
    move-object/from16 v22, v5

    .line 770
    .line 771
    check-cast v22, Lkotlin/jvm/functions/Function1;

    .line 772
    .line 773
    const/16 v24, 0x0

    .line 774
    .line 775
    move/from16 v21, v1

    .line 776
    .line 777
    move-object/from16 v23, v2

    .line 778
    .line 779
    move-object/from16 v20, v3

    .line 780
    .line 781
    invoke-static/range {v19 .. v24}, La/lgb;->n(La/mm40;La/mim0;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 785
    .line 786
    .line 787
    goto :goto_f

    .line 788
    :cond_1f
    :goto_e
    const v0, -0x24c517e3

    .line 789
    .line 790
    .line 791
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 795
    .line 796
    .line 797
    :goto_f
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 798
    .line 799
    .line 800
    goto :goto_10

    .line 801
    :cond_20
    invoke-virtual {v2}, La/fet;->X()V

    .line 802
    .line 803
    .line 804
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 805
    .line 806
    return-object v0

    .line 807
    :pswitch_1
    move-object/from16 v1, p1

    .line 808
    .line 809
    check-cast v1, La/g9z;

    .line 810
    .line 811
    move-object/from16 v2, p2

    .line 812
    .line 813
    check-cast v2, Ljava/lang/Number;

    .line 814
    .line 815
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 816
    .line 817
    .line 818
    move-result v2

    .line 819
    move-object/from16 v3, p3

    .line 820
    .line 821
    check-cast v3, La/fet;

    .line 822
    .line 823
    move-object/from16 v6, p4

    .line 824
    .line 825
    check-cast v6, Ljava/lang/Number;

    .line 826
    .line 827
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 828
    .line 829
    .line 830
    move-result v6

    .line 831
    and-int/lit8 v7, v6, 0x6

    .line 832
    .line 833
    if-nez v7, :cond_22

    .line 834
    .line 835
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    move-result v1

    .line 839
    if-eqz v1, :cond_21

    .line 840
    .line 841
    goto :goto_11

    .line 842
    :cond_21
    move v14, v5

    .line 843
    :goto_11
    or-int v1, v6, v14

    .line 844
    .line 845
    goto :goto_12

    .line 846
    :cond_22
    move v1, v6

    .line 847
    :goto_12
    and-int/lit8 v5, v6, 0x30

    .line 848
    .line 849
    if-nez v5, :cond_24

    .line 850
    .line 851
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 852
    .line 853
    .line 854
    move-result v5

    .line 855
    if-eqz v5, :cond_23

    .line 856
    .line 857
    const/16 v17, 0x20

    .line 858
    .line 859
    goto :goto_13

    .line 860
    :cond_23
    const/16 v17, 0x10

    .line 861
    .line 862
    :goto_13
    or-int v1, v1, v17

    .line 863
    .line 864
    :cond_24
    and-int/lit16 v5, v1, 0x93

    .line 865
    .line 866
    if-eq v5, v11, :cond_25

    .line 867
    .line 868
    move v5, v13

    .line 869
    goto :goto_14

    .line 870
    :cond_25
    move v5, v12

    .line 871
    :goto_14
    and-int/2addr v1, v13

    .line 872
    invoke-virtual {v3, v1, v5}, La/fet;->U(IZ)Z

    .line 873
    .line 874
    .line 875
    move-result v1

    .line 876
    if-eqz v1, :cond_30

    .line 877
    .line 878
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v1

    .line 882
    check-cast v1, La/p6t0;

    .line 883
    .line 884
    const v5, -0x1ed68529

    .line 885
    .line 886
    .line 887
    invoke-virtual {v3, v5}, La/fet;->e0(I)V

    .line 888
    .line 889
    .line 890
    if-nez v1, :cond_26

    .line 891
    .line 892
    goto/16 :goto_1c

    .line 893
    .line 894
    :cond_26
    instance-of v5, v1, La/t3q;

    .line 895
    .line 896
    sget-object v16, La/jm40;->b:La/jm40;

    .line 897
    .line 898
    const/high16 v6, 0x40c00000    # 6.0f

    .line 899
    .line 900
    if-eqz v5, :cond_29

    .line 901
    .line 902
    const v0, 0x4111dc23

    .line 903
    .line 904
    .line 905
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 906
    .line 907
    .line 908
    add-int/2addr v2, v13

    .line 909
    invoke-static {v2, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    instance-of v0, v0, La/i3q;

    .line 914
    .line 915
    if-nez v0, :cond_28

    .line 916
    .line 917
    invoke-static {v2, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    instance-of v0, v0, La/b3q;

    .line 922
    .line 923
    if-eqz v0, :cond_27

    .line 924
    .line 925
    goto :goto_15

    .line 926
    :cond_27
    sget-object v0, La/qmk;->a:La/zcl;

    .line 927
    .line 928
    move/from16 v20, v6

    .line 929
    .line 930
    goto :goto_16

    .line 931
    :cond_28
    :goto_15
    sget-object v0, La/qmk;->a:La/zcl;

    .line 932
    .line 933
    move/from16 v20, v8

    .line 934
    .line 935
    :goto_16
    const/16 v21, 0x7

    .line 936
    .line 937
    const/16 v17, 0x0

    .line 938
    .line 939
    const/16 v18, 0x0

    .line 940
    .line 941
    const/16 v19, 0x0

    .line 942
    .line 943
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    check-cast v1, La/t3q;

    .line 948
    .line 949
    invoke-static {v0, v1, v9, v3, v12}, La/jpm0;->e(La/mm40;La/t3q;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v3, v12}, La/fet;->r(Z)V

    .line 953
    .line 954
    .line 955
    goto/16 :goto_1d

    .line 956
    .line 957
    :cond_29
    instance-of v5, v1, La/i3q;

    .line 958
    .line 959
    if-eqz v5, :cond_2b

    .line 960
    .line 961
    const v0, 0x41122eca

    .line 962
    .line 963
    .line 964
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 965
    .line 966
    .line 967
    sget-object v0, La/qmk;->a:La/zcl;

    .line 968
    .line 969
    if-nez v2, :cond_2a

    .line 970
    .line 971
    move/from16 v18, v8

    .line 972
    .line 973
    goto :goto_17

    .line 974
    :cond_2a
    move/from16 v18, v4

    .line 975
    .line 976
    :goto_17
    const/16 v20, 0x0

    .line 977
    .line 978
    const/16 v21, 0xc

    .line 979
    .line 980
    const/high16 v17, 0x41400000    # 12.0f

    .line 981
    .line 982
    const/16 v19, 0x0

    .line 983
    .line 984
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 985
    .line 986
    .line 987
    move-result-object v19

    .line 988
    new-instance v20, La/hjm;

    .line 989
    .line 990
    check-cast v1, La/i3q;

    .line 991
    .line 992
    iget-object v0, v1, La/i3q;->a:Ljava/lang/String;

    .line 993
    .line 994
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 995
    .line 996
    invoke-virtual {v3, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object v1

    .line 1000
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1001
    .line 1002
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1003
    .line 1004
    .line 1005
    move-result-wide v1

    .line 1006
    new-instance v4, La/y3d;

    .line 1007
    .line 1008
    invoke-direct {v4, v1, v2}, La/y3d;-><init>(J)V

    .line 1009
    .line 1010
    .line 1011
    const/16 v32, 0x0

    .line 1012
    .line 1013
    const/16 v33, 0x1ffa

    .line 1014
    .line 1015
    const/16 v22, 0x0

    .line 1016
    .line 1017
    const/16 v24, 0x0

    .line 1018
    .line 1019
    const/16 v25, 0x0

    .line 1020
    .line 1021
    const/16 v26, 0x0

    .line 1022
    .line 1023
    const/16 v27, 0x0

    .line 1024
    .line 1025
    const/16 v28, 0x0

    .line 1026
    .line 1027
    const/16 v29, 0x0

    .line 1028
    .line 1029
    const/16 v30, 0x0

    .line 1030
    .line 1031
    const/16 v31, 0x0

    .line 1032
    .line 1033
    move-object/from16 v21, v0

    .line 1034
    .line 1035
    move-object/from16 v23, v4

    .line 1036
    .line 1037
    invoke-direct/range {v20 .. v33}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1038
    .line 1039
    .line 1040
    sget-object v21, La/kjm;->b:La/kjm;

    .line 1041
    .line 1042
    const/16 v26, 0x180

    .line 1043
    .line 1044
    const/16 v27, 0x38

    .line 1045
    .line 1046
    const/16 v23, 0x0

    .line 1047
    .line 1048
    move-object/from16 v25, v3

    .line 1049
    .line 1050
    invoke-static/range {v19 .. v27}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v3, v12}, La/fet;->r(Z)V

    .line 1054
    .line 1055
    .line 1056
    goto :goto_1d

    .line 1057
    :cond_2b
    instance-of v4, v1, La/b3q;

    .line 1058
    .line 1059
    if-eqz v4, :cond_2f

    .line 1060
    .line 1061
    const v4, -0x1ec3cd9b

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 1065
    .line 1066
    .line 1067
    add-int/lit8 v4, v2, 0x1

    .line 1068
    .line 1069
    invoke-static {v4, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v5

    .line 1073
    instance-of v5, v5, La/t3q;

    .line 1074
    .line 1075
    if-eqz v5, :cond_2c

    .line 1076
    .line 1077
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1078
    .line 1079
    move/from16 v20, v6

    .line 1080
    .line 1081
    goto :goto_18

    .line 1082
    :cond_2c
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1083
    .line 1084
    move/from16 v20, v8

    .line 1085
    .line 1086
    :goto_18
    const/16 v21, 0x7

    .line 1087
    .line 1088
    const/16 v17, 0x0

    .line 1089
    .line 1090
    const/16 v18, 0x0

    .line 1091
    .line 1092
    const/16 v19, 0x0

    .line 1093
    .line 1094
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v19

    .line 1098
    move-object/from16 v21, v1

    .line 1099
    .line 1100
    check-cast v21, La/b3q;

    .line 1101
    .line 1102
    invoke-static {v4, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v1

    .line 1106
    instance-of v1, v1, La/i3q;

    .line 1107
    .line 1108
    if-nez v1, :cond_2e

    .line 1109
    .line 1110
    invoke-static {v4, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v1

    .line 1114
    instance-of v1, v1, La/t3q;

    .line 1115
    .line 1116
    if-nez v1, :cond_2e

    .line 1117
    .line 1118
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 1119
    .line 1120
    .line 1121
    move-result v1

    .line 1122
    sub-int/2addr v1, v13

    .line 1123
    if-ne v1, v2, :cond_2d

    .line 1124
    .line 1125
    goto :goto_1a

    .line 1126
    :cond_2d
    sget-object v1, La/j3l0;->a:La/j3l0;

    .line 1127
    .line 1128
    :goto_19
    move-object/from16 v20, v1

    .line 1129
    .line 1130
    goto :goto_1b

    .line 1131
    :cond_2e
    :goto_1a
    new-instance v1, La/k3l0;

    .line 1132
    .line 1133
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1134
    .line 1135
    .line 1136
    goto :goto_19

    .line 1137
    :goto_1b
    iget-object v0, v0, La/gic;->d:Lkotlin/jvm/functions/Function1;

    .line 1138
    .line 1139
    const/16 v24, 0x0

    .line 1140
    .line 1141
    move-object/from16 v22, v0

    .line 1142
    .line 1143
    move-object/from16 v23, v3

    .line 1144
    .line 1145
    invoke-static/range {v19 .. v24}, La/knm0;->c(La/mm40;La/n3l0;La/b3q;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v3, v12}, La/fet;->r(Z)V

    .line 1149
    .line 1150
    .line 1151
    goto :goto_1d

    .line 1152
    :cond_2f
    :goto_1c
    const v0, -0x1eb4ecf7

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v3, v12}, La/fet;->r(Z)V

    .line 1159
    .line 1160
    .line 1161
    :goto_1d
    invoke-virtual {v3, v12}, La/fet;->r(Z)V

    .line 1162
    .line 1163
    .line 1164
    goto :goto_1e

    .line 1165
    :cond_30
    invoke-virtual {v3}, La/fet;->X()V

    .line 1166
    .line 1167
    .line 1168
    :goto_1e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1169
    .line 1170
    return-object v0

    .line 1171
    :pswitch_2
    move-object/from16 v1, p1

    .line 1172
    .line 1173
    check-cast v1, La/g9z;

    .line 1174
    .line 1175
    move-object/from16 v2, p2

    .line 1176
    .line 1177
    check-cast v2, Ljava/lang/Number;

    .line 1178
    .line 1179
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1180
    .line 1181
    .line 1182
    move-result v2

    .line 1183
    move-object/from16 v3, p3

    .line 1184
    .line 1185
    check-cast v3, La/fet;

    .line 1186
    .line 1187
    move-object/from16 v4, p4

    .line 1188
    .line 1189
    check-cast v4, Ljava/lang/Number;

    .line 1190
    .line 1191
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 1192
    .line 1193
    .line 1194
    move-result v4

    .line 1195
    and-int/lit8 v6, v4, 0x6

    .line 1196
    .line 1197
    if-nez v6, :cond_32

    .line 1198
    .line 1199
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v1

    .line 1203
    if-eqz v1, :cond_31

    .line 1204
    .line 1205
    goto :goto_1f

    .line 1206
    :cond_31
    move v14, v5

    .line 1207
    :goto_1f
    or-int v1, v4, v14

    .line 1208
    .line 1209
    goto :goto_20

    .line 1210
    :cond_32
    move v1, v4

    .line 1211
    :goto_20
    and-int/lit8 v4, v4, 0x30

    .line 1212
    .line 1213
    if-nez v4, :cond_34

    .line 1214
    .line 1215
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 1216
    .line 1217
    .line 1218
    move-result v4

    .line 1219
    if-eqz v4, :cond_33

    .line 1220
    .line 1221
    const/16 v17, 0x20

    .line 1222
    .line 1223
    goto :goto_21

    .line 1224
    :cond_33
    const/16 v17, 0x10

    .line 1225
    .line 1226
    :goto_21
    or-int v1, v1, v17

    .line 1227
    .line 1228
    :cond_34
    and-int/lit16 v4, v1, 0x93

    .line 1229
    .line 1230
    if-eq v4, v11, :cond_35

    .line 1231
    .line 1232
    move v4, v13

    .line 1233
    goto :goto_22

    .line 1234
    :cond_35
    move v4, v12

    .line 1235
    :goto_22
    and-int/2addr v1, v13

    .line 1236
    invoke-virtual {v3, v1, v4}, La/fet;->U(IZ)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v1

    .line 1240
    if-eqz v1, :cond_39

    .line 1241
    .line 1242
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v1

    .line 1246
    move-object/from16 v20, v1

    .line 1247
    .line 1248
    check-cast v20, La/nz30;

    .line 1249
    .line 1250
    const v1, -0x30126f5c

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 1254
    .line 1255
    .line 1256
    if-nez v2, :cond_36

    .line 1257
    .line 1258
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 1259
    .line 1260
    .line 1261
    move-result v1

    .line 1262
    if-ne v1, v13, :cond_36

    .line 1263
    .line 1264
    sget-object v1, La/wui0;->a:La/wui0;

    .line 1265
    .line 1266
    :goto_23
    move-object/from16 v21, v1

    .line 1267
    .line 1268
    goto :goto_24

    .line 1269
    :cond_36
    if-nez v2, :cond_37

    .line 1270
    .line 1271
    sget-object v1, La/wui0;->b:La/wui0;

    .line 1272
    .line 1273
    goto :goto_23

    .line 1274
    :cond_37
    invoke-static {v15}, La/q3d;->i(Ljava/util/List;)I

    .line 1275
    .line 1276
    .line 1277
    move-result v1

    .line 1278
    if-ne v2, v1, :cond_38

    .line 1279
    .line 1280
    sget-object v1, La/wui0;->d:La/wui0;

    .line 1281
    .line 1282
    goto :goto_23

    .line 1283
    :cond_38
    sget-object v1, La/wui0;->c:La/wui0;

    .line 1284
    .line 1285
    goto :goto_23

    .line 1286
    :goto_24
    iget-object v0, v0, La/gic;->d:Lkotlin/jvm/functions/Function1;

    .line 1287
    .line 1288
    const/16 v24, 0x0

    .line 1289
    .line 1290
    const/16 v19, 0x0

    .line 1291
    .line 1292
    move-object/from16 v22, v0

    .line 1293
    .line 1294
    move-object/from16 v23, v3

    .line 1295
    .line 1296
    invoke-static/range {v19 .. v24}, La/rq8;->q(La/mm40;La/nz30;La/wui0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1297
    .line 1298
    .line 1299
    move-object/from16 v0, v23

    .line 1300
    .line 1301
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 1302
    .line 1303
    .line 1304
    goto :goto_25

    .line 1305
    :cond_39
    move-object v0, v3

    .line 1306
    invoke-virtual {v0}, La/fet;->X()V

    .line 1307
    .line 1308
    .line 1309
    :goto_25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1310
    .line 1311
    return-object v0

    .line 1312
    :pswitch_3
    move-object/from16 v0, p1

    .line 1313
    .line 1314
    check-cast v0, La/g9z;

    .line 1315
    .line 1316
    move-object/from16 v1, p2

    .line 1317
    .line 1318
    check-cast v1, Ljava/lang/Number;

    .line 1319
    .line 1320
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1321
    .line 1322
    .line 1323
    move-result v1

    .line 1324
    move-object/from16 v2, p3

    .line 1325
    .line 1326
    check-cast v2, La/fet;

    .line 1327
    .line 1328
    move-object/from16 v4, p4

    .line 1329
    .line 1330
    check-cast v4, Ljava/lang/Number;

    .line 1331
    .line 1332
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 1333
    .line 1334
    .line 1335
    move-result v4

    .line 1336
    and-int/lit8 v6, v4, 0x6

    .line 1337
    .line 1338
    if-nez v6, :cond_3b

    .line 1339
    .line 1340
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1341
    .line 1342
    .line 1343
    move-result v0

    .line 1344
    if-eqz v0, :cond_3a

    .line 1345
    .line 1346
    goto :goto_26

    .line 1347
    :cond_3a
    move v14, v5

    .line 1348
    :goto_26
    or-int v0, v4, v14

    .line 1349
    .line 1350
    goto :goto_27

    .line 1351
    :cond_3b
    move v0, v4

    .line 1352
    :goto_27
    and-int/lit8 v4, v4, 0x30

    .line 1353
    .line 1354
    if-nez v4, :cond_3d

    .line 1355
    .line 1356
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1357
    .line 1358
    .line 1359
    move-result v4

    .line 1360
    if-eqz v4, :cond_3c

    .line 1361
    .line 1362
    const/16 v17, 0x20

    .line 1363
    .line 1364
    goto :goto_28

    .line 1365
    :cond_3c
    const/16 v17, 0x10

    .line 1366
    .line 1367
    :goto_28
    or-int v0, v0, v17

    .line 1368
    .line 1369
    :cond_3d
    and-int/lit16 v4, v0, 0x93

    .line 1370
    .line 1371
    if-eq v4, v11, :cond_3e

    .line 1372
    .line 1373
    move v4, v13

    .line 1374
    goto :goto_29

    .line 1375
    :cond_3e
    move v4, v12

    .line 1376
    :goto_29
    and-int/2addr v0, v13

    .line 1377
    invoke-virtual {v2, v0, v4}, La/fet;->U(IZ)Z

    .line 1378
    .line 1379
    .line 1380
    move-result v0

    .line 1381
    if-eqz v0, :cond_47

    .line 1382
    .line 1383
    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v0

    .line 1387
    check-cast v0, La/cq90;

    .line 1388
    .line 1389
    const v4, 0x15d91452

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 1393
    .line 1394
    .line 1395
    if-eqz v0, :cond_46

    .line 1396
    .line 1397
    instance-of v4, v0, La/aq90;

    .line 1398
    .line 1399
    sget-object v17, La/jm40;->b:La/jm40;

    .line 1400
    .line 1401
    if-eqz v4, :cond_45

    .line 1402
    .line 1403
    const v4, 0x15da1a5d

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 1407
    .line 1408
    .line 1409
    if-ne v1, v13, :cond_3f

    .line 1410
    .line 1411
    invoke-interface {v15, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v4

    .line 1415
    instance-of v4, v4, La/bq90;

    .line 1416
    .line 1417
    if-eqz v4, :cond_3f

    .line 1418
    .line 1419
    sget-object v4, La/qmk;->a:La/zcl;

    .line 1420
    .line 1421
    const/high16 v19, 0x41000000    # 8.0f

    .line 1422
    .line 1423
    goto :goto_2a

    .line 1424
    :cond_3f
    sget-object v4, La/qmk;->a:La/zcl;

    .line 1425
    .line 1426
    move/from16 v19, v8

    .line 1427
    .line 1428
    :goto_2a
    add-int/2addr v1, v13

    .line 1429
    invoke-static {v1, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v1

    .line 1433
    instance-of v1, v1, La/aq90;

    .line 1434
    .line 1435
    const/16 v21, 0x0

    .line 1436
    .line 1437
    const/16 v22, 0x8

    .line 1438
    .line 1439
    const/high16 v18, 0x40800000    # 4.0f

    .line 1440
    .line 1441
    const/high16 v20, 0x40800000    # 4.0f

    .line 1442
    .line 1443
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v19

    .line 1447
    move-object/from16 v4, v17

    .line 1448
    .line 1449
    move-object v6, v0

    .line 1450
    check-cast v6, La/aq90;

    .line 1451
    .line 1452
    iget-object v6, v6, La/aq90;->b:La/rqm;

    .line 1453
    .line 1454
    invoke-virtual {v2, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1455
    .line 1456
    .line 1457
    move-result v10

    .line 1458
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1459
    .line 1460
    .line 1461
    move-result v11

    .line 1462
    or-int/2addr v10, v11

    .line 1463
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v11

    .line 1467
    if-nez v10, :cond_40

    .line 1468
    .line 1469
    if-ne v11, v7, :cond_41

    .line 1470
    .line 1471
    :cond_40
    new-instance v11, La/de40;

    .line 1472
    .line 1473
    invoke-direct {v11, v9, v0, v12}, La/de40;-><init>(Lkotlin/jvm/functions/Function1;La/cq90;B)V

    .line 1474
    .line 1475
    .line 1476
    invoke-virtual {v2, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1477
    .line 1478
    .line 1479
    :cond_41
    move-object/from16 v23, v11

    .line 1480
    .line 1481
    check-cast v23, Lkotlin/jvm/functions/Function0;

    .line 1482
    .line 1483
    invoke-virtual {v2, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1484
    .line 1485
    .line 1486
    move-result v10

    .line 1487
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1488
    .line 1489
    .line 1490
    move-result v11

    .line 1491
    or-int/2addr v10, v11

    .line 1492
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v11

    .line 1496
    if-nez v10, :cond_42

    .line 1497
    .line 1498
    if-ne v11, v7, :cond_43

    .line 1499
    .line 1500
    :cond_42
    new-instance v11, La/de40;

    .line 1501
    .line 1502
    invoke-direct {v11, v9, v0, v13}, La/de40;-><init>(Lkotlin/jvm/functions/Function1;La/cq90;B)V

    .line 1503
    .line 1504
    .line 1505
    invoke-virtual {v2, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1506
    .line 1507
    .line 1508
    :cond_43
    move-object/from16 v25, v11

    .line 1509
    .line 1510
    check-cast v25, Lkotlin/jvm/functions/Function0;

    .line 1511
    .line 1512
    const/16 v28, 0x0

    .line 1513
    .line 1514
    const/16 v29, 0xac

    .line 1515
    .line 1516
    const/16 v21, 0x0

    .line 1517
    .line 1518
    const/16 v22, 0x0

    .line 1519
    .line 1520
    const/16 v24, 0x0

    .line 1521
    .line 1522
    const/16 v26, 0x0

    .line 1523
    .line 1524
    move-object/from16 v27, v2

    .line 1525
    .line 1526
    move-object/from16 v20, v6

    .line 1527
    .line 1528
    invoke-static/range {v19 .. v29}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1529
    .line 1530
    .line 1531
    if-eqz v1, :cond_44

    .line 1532
    .line 1533
    const v0, 0x15e643ed

    .line 1534
    .line 1535
    .line 1536
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 1537
    .line 1538
    .line 1539
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v0

    .line 1543
    const/high16 v1, 0x41800000    # 16.0f

    .line 1544
    .line 1545
    invoke-static {v0, v1, v8, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0

    .line 1549
    invoke-static {v0, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v0

    .line 1553
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 1554
    .line 1555
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v1

    .line 1559
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1560
    .line 1561
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSeparator60-0d7_KjU()J

    .line 1562
    .line 1563
    .line 1564
    move-result-wide v3

    .line 1565
    sget-object v1, La/jd8;->n:La/ljc;

    .line 1566
    .line 1567
    invoke-static {v0, v3, v4, v1}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v0

    .line 1571
    invoke-static {v12, v2, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 1572
    .line 1573
    .line 1574
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 1575
    .line 1576
    .line 1577
    goto :goto_2b

    .line 1578
    :cond_44
    const v0, 0x15ebc765

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 1582
    .line 1583
    .line 1584
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 1585
    .line 1586
    .line 1587
    :goto_2b
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 1588
    .line 1589
    .line 1590
    goto :goto_2c

    .line 1591
    :cond_45
    move-object/from16 v4, v17

    .line 1592
    .line 1593
    instance-of v1, v0, La/bq90;

    .line 1594
    .line 1595
    if-eqz v1, :cond_46

    .line 1596
    .line 1597
    const v1, -0x6263b511

    .line 1598
    .line 1599
    .line 1600
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 1601
    .line 1602
    .line 1603
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1604
    .line 1605
    const/16 v21, 0x0

    .line 1606
    .line 1607
    const/16 v22, 0xd

    .line 1608
    .line 1609
    const/16 v18, 0x0

    .line 1610
    .line 1611
    const/high16 v19, 0x41000000    # 8.0f

    .line 1612
    .line 1613
    const/16 v20, 0x0

    .line 1614
    .line 1615
    move-object/from16 v17, v4

    .line 1616
    .line 1617
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v1

    .line 1621
    check-cast v0, La/bq90;

    .line 1622
    .line 1623
    invoke-static {v1, v0, v2, v12}, La/q8x;->m(La/mm40;La/bq90;La/fet;I)V

    .line 1624
    .line 1625
    .line 1626
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 1627
    .line 1628
    .line 1629
    :goto_2c
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 1630
    .line 1631
    .line 1632
    goto :goto_2d

    .line 1633
    :cond_46
    const v0, -0x62645a2f

    .line 1634
    .line 1635
    .line 1636
    invoke-static {v0, v2, v12}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v0

    .line 1640
    throw v0

    .line 1641
    :cond_47
    invoke-virtual {v2}, La/fet;->X()V

    .line 1642
    .line 1643
    .line 1644
    :goto_2d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1645
    .line 1646
    return-object v0

    .line 1647
    :pswitch_4
    move-object/from16 v0, p1

    .line 1648
    .line 1649
    check-cast v0, La/g9z;

    .line 1650
    .line 1651
    move-object/from16 v1, p2

    .line 1652
    .line 1653
    check-cast v1, Ljava/lang/Number;

    .line 1654
    .line 1655
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1656
    .line 1657
    .line 1658
    move-result v1

    .line 1659
    move-object/from16 v6, p3

    .line 1660
    .line 1661
    check-cast v6, La/fet;

    .line 1662
    .line 1663
    move-object/from16 v16, p4

    .line 1664
    .line 1665
    check-cast v16, Ljava/lang/Number;

    .line 1666
    .line 1667
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 1668
    .line 1669
    .line 1670
    move-result v16

    .line 1671
    and-int/lit8 v19, v16, 0x6

    .line 1672
    .line 1673
    if-nez v19, :cond_49

    .line 1674
    .line 1675
    invoke-virtual {v6, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1676
    .line 1677
    .line 1678
    move-result v0

    .line 1679
    if-eqz v0, :cond_48

    .line 1680
    .line 1681
    goto :goto_2e

    .line 1682
    :cond_48
    move v14, v5

    .line 1683
    :goto_2e
    or-int v0, v16, v14

    .line 1684
    .line 1685
    goto :goto_2f

    .line 1686
    :cond_49
    move/from16 v0, v16

    .line 1687
    .line 1688
    :goto_2f
    and-int/lit8 v14, v16, 0x30

    .line 1689
    .line 1690
    if-nez v14, :cond_4b

    .line 1691
    .line 1692
    invoke-virtual {v6, v1}, La/fet;->e(I)Z

    .line 1693
    .line 1694
    .line 1695
    move-result v14

    .line 1696
    if-eqz v14, :cond_4a

    .line 1697
    .line 1698
    const/16 v17, 0x20

    .line 1699
    .line 1700
    goto :goto_30

    .line 1701
    :cond_4a
    const/16 v17, 0x10

    .line 1702
    .line 1703
    :goto_30
    or-int v0, v0, v17

    .line 1704
    .line 1705
    :cond_4b
    and-int/lit16 v14, v0, 0x93

    .line 1706
    .line 1707
    if-eq v14, v11, :cond_4c

    .line 1708
    .line 1709
    move v11, v13

    .line 1710
    goto :goto_31

    .line 1711
    :cond_4c
    move v11, v12

    .line 1712
    :goto_31
    and-int/2addr v0, v13

    .line 1713
    invoke-virtual {v6, v0, v11}, La/fet;->U(IZ)Z

    .line 1714
    .line 1715
    .line 1716
    move-result v0

    .line 1717
    if-eqz v0, :cond_53

    .line 1718
    .line 1719
    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v0

    .line 1723
    check-cast v0, La/q2k0;

    .line 1724
    .line 1725
    const v10, 0x14d30507

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v6, v10}, La/fet;->e0(I)V

    .line 1729
    .line 1730
    .line 1731
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 1732
    .line 1733
    .line 1734
    move-result v10

    .line 1735
    if-ne v10, v13, :cond_4d

    .line 1736
    .line 1737
    move v10, v13

    .line 1738
    goto :goto_32

    .line 1739
    :cond_4d
    move v10, v12

    .line 1740
    :goto_32
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 1741
    .line 1742
    .line 1743
    move-result v11

    .line 1744
    sub-int/2addr v11, v13

    .line 1745
    if-ne v1, v11, :cond_4e

    .line 1746
    .line 1747
    move v1, v13

    .line 1748
    goto :goto_33

    .line 1749
    :cond_4e
    move v1, v12

    .line 1750
    :goto_33
    invoke-static {v6}, La/xfn;->a(La/fet;)La/wfn;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v11

    .line 1754
    iget v11, v11, La/wfn;->d:F

    .line 1755
    .line 1756
    invoke-static {v2, v11, v8, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v5

    .line 1760
    invoke-static {v5, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v19

    .line 1764
    iget-object v3, v0, La/q2k0;->b:La/rqm;

    .line 1765
    .line 1766
    if-nez v10, :cond_4f

    .line 1767
    .line 1768
    if-nez v1, :cond_4f

    .line 1769
    .line 1770
    move/from16 v21, v13

    .line 1771
    .line 1772
    goto :goto_34

    .line 1773
    :cond_4f
    move/from16 v21, v12

    .line 1774
    .line 1775
    :goto_34
    invoke-virtual {v6, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1776
    .line 1777
    .line 1778
    move-result v5

    .line 1779
    invoke-virtual {v6, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1780
    .line 1781
    .line 1782
    move-result v8

    .line 1783
    or-int/2addr v5, v8

    .line 1784
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v8

    .line 1788
    if-nez v5, :cond_50

    .line 1789
    .line 1790
    if-ne v8, v7, :cond_51

    .line 1791
    .line 1792
    :cond_50
    new-instance v8, La/ha30;

    .line 1793
    .line 1794
    const/4 v5, 0x5

    .line 1795
    invoke-direct {v8, v9, v0, v5}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1796
    .line 1797
    .line 1798
    invoke-virtual {v6, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1799
    .line 1800
    .line 1801
    :cond_51
    move-object/from16 v23, v8

    .line 1802
    .line 1803
    check-cast v23, Lkotlin/jvm/functions/Function0;

    .line 1804
    .line 1805
    const/16 v28, 0x0

    .line 1806
    .line 1807
    const/16 v29, 0xe8

    .line 1808
    .line 1809
    const/16 v22, 0x0

    .line 1810
    .line 1811
    const/16 v24, 0x0

    .line 1812
    .line 1813
    const/16 v25, 0x0

    .line 1814
    .line 1815
    const/16 v26, 0x0

    .line 1816
    .line 1817
    move-object/from16 v20, v3

    .line 1818
    .line 1819
    move-object/from16 v27, v6

    .line 1820
    .line 1821
    invoke-static/range {v19 .. v29}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1822
    .line 1823
    .line 1824
    move-object/from16 v0, v27

    .line 1825
    .line 1826
    if-eqz v1, :cond_52

    .line 1827
    .line 1828
    const v1, 0x14da0ee6

    .line 1829
    .line 1830
    .line 1831
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 1832
    .line 1833
    .line 1834
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1835
    .line 1836
    invoke-static {v2, v4, v0, v12}, La/rz4;->t(La/jm40;FLa/fet;Z)V

    .line 1837
    .line 1838
    .line 1839
    goto :goto_35

    .line 1840
    :cond_52
    const v1, 0x14db20ef

    .line 1841
    .line 1842
    .line 1843
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 1844
    .line 1845
    .line 1846
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 1847
    .line 1848
    .line 1849
    :goto_35
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 1850
    .line 1851
    .line 1852
    goto :goto_36

    .line 1853
    :cond_53
    move-object v0, v6

    .line 1854
    invoke-virtual {v0}, La/fet;->X()V

    .line 1855
    .line 1856
    .line 1857
    :goto_36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1858
    .line 1859
    return-object v0

    .line 1860
    :pswitch_5
    move-object/from16 v0, p1

    .line 1861
    .line 1862
    check-cast v0, La/g9z;

    .line 1863
    .line 1864
    move-object/from16 v1, p2

    .line 1865
    .line 1866
    check-cast v1, Ljava/lang/Number;

    .line 1867
    .line 1868
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1869
    .line 1870
    .line 1871
    move-result v1

    .line 1872
    move-object/from16 v3, p3

    .line 1873
    .line 1874
    check-cast v3, La/fet;

    .line 1875
    .line 1876
    move-object/from16 v4, p4

    .line 1877
    .line 1878
    check-cast v4, Ljava/lang/Number;

    .line 1879
    .line 1880
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 1881
    .line 1882
    .line 1883
    move-result v4

    .line 1884
    and-int/lit8 v16, v4, 0x6

    .line 1885
    .line 1886
    if-nez v16, :cond_55

    .line 1887
    .line 1888
    invoke-virtual {v3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1889
    .line 1890
    .line 1891
    move-result v0

    .line 1892
    if-eqz v0, :cond_54

    .line 1893
    .line 1894
    goto :goto_37

    .line 1895
    :cond_54
    move v14, v5

    .line 1896
    :goto_37
    or-int v0, v4, v14

    .line 1897
    .line 1898
    goto :goto_38

    .line 1899
    :cond_55
    move v0, v4

    .line 1900
    :goto_38
    and-int/lit8 v4, v4, 0x30

    .line 1901
    .line 1902
    if-nez v4, :cond_57

    .line 1903
    .line 1904
    invoke-virtual {v3, v1}, La/fet;->e(I)Z

    .line 1905
    .line 1906
    .line 1907
    move-result v4

    .line 1908
    if-eqz v4, :cond_56

    .line 1909
    .line 1910
    const/16 v17, 0x20

    .line 1911
    .line 1912
    goto :goto_39

    .line 1913
    :cond_56
    const/16 v17, 0x10

    .line 1914
    .line 1915
    :goto_39
    or-int v0, v0, v17

    .line 1916
    .line 1917
    :cond_57
    and-int/lit16 v4, v0, 0x93

    .line 1918
    .line 1919
    if-eq v4, v11, :cond_58

    .line 1920
    .line 1921
    move v4, v13

    .line 1922
    goto :goto_3a

    .line 1923
    :cond_58
    move v4, v12

    .line 1924
    :goto_3a
    and-int/2addr v0, v13

    .line 1925
    invoke-virtual {v3, v0, v4}, La/fet;->U(IZ)Z

    .line 1926
    .line 1927
    .line 1928
    move-result v0

    .line 1929
    if-eqz v0, :cond_60

    .line 1930
    .line 1931
    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v0

    .line 1935
    check-cast v0, La/twm0;

    .line 1936
    .line 1937
    const v4, 0x7b32d92a

    .line 1938
    .line 1939
    .line 1940
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 1941
    .line 1942
    .line 1943
    iget-wide v10, v0, La/twm0;->a:J

    .line 1944
    .line 1945
    iget-object v4, v0, La/twm0;->b:Ljava/lang/String;

    .line 1946
    .line 1947
    iget-boolean v14, v0, La/twm0;->c:Z

    .line 1948
    .line 1949
    invoke-virtual {v3, v10, v11}, La/fet;->f(J)Z

    .line 1950
    .line 1951
    .line 1952
    move-result v10

    .line 1953
    invoke-virtual {v3, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1954
    .line 1955
    .line 1956
    move-result v11

    .line 1957
    or-int/2addr v10, v11

    .line 1958
    invoke-virtual {v3, v14}, La/fet;->h(Z)Z

    .line 1959
    .line 1960
    .line 1961
    move-result v11

    .line 1962
    or-int/2addr v10, v11

    .line 1963
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v11

    .line 1967
    if-nez v10, :cond_59

    .line 1968
    .line 1969
    if-ne v11, v7, :cond_5a

    .line 1970
    .line 1971
    :cond_59
    new-instance v16, La/kvl;

    .line 1972
    .line 1973
    iget-wide v10, v0, La/twm0;->a:J

    .line 1974
    .line 1975
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v17

    .line 1979
    new-instance v10, La/tui0;

    .line 1980
    .line 1981
    invoke-direct {v10, v4, v6}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 1982
    .line 1983
    .line 1984
    new-instance v4, La/nvi0;

    .line 1985
    .line 1986
    invoke-direct {v4, v14}, La/nvi0;-><init>(Z)V

    .line 1987
    .line 1988
    .line 1989
    const/16 v21, 0x0

    .line 1990
    .line 1991
    const/16 v22, 0x1f4

    .line 1992
    .line 1993
    const/16 v19, 0x0

    .line 1994
    .line 1995
    move-object/from16 v20, v4

    .line 1996
    .line 1997
    move-object/from16 v18, v10

    .line 1998
    .line 1999
    invoke-direct/range {v16 .. v22}, La/kvl;-><init>(Ljava/lang/Object;La/tui0;La/oui0;La/pvi0;La/wui0;I)V

    .line 2000
    .line 2001
    .line 2002
    move-object/from16 v11, v16

    .line 2003
    .line 2004
    invoke-virtual {v3, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2005
    .line 2006
    .line 2007
    :cond_5a
    move-object/from16 v20, v11

    .line 2008
    .line 2009
    check-cast v20, La/kvl;

    .line 2010
    .line 2011
    sget-object v4, La/qmk;->a:La/zcl;

    .line 2012
    .line 2013
    const/high16 v4, 0x40800000    # 4.0f

    .line 2014
    .line 2015
    invoke-static {v2, v4, v8, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v19

    .line 2019
    invoke-virtual {v3, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2020
    .line 2021
    .line 2022
    move-result v2

    .line 2023
    invoke-virtual {v3, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2024
    .line 2025
    .line 2026
    move-result v4

    .line 2027
    or-int/2addr v2, v4

    .line 2028
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v4

    .line 2032
    if-nez v2, :cond_5b

    .line 2033
    .line 2034
    if-ne v4, v7, :cond_5c

    .line 2035
    .line 2036
    :cond_5b
    new-instance v4, La/fic;

    .line 2037
    .line 2038
    invoke-direct {v4, v9, v0, v12}, La/fic;-><init>(Lkotlin/jvm/functions/Function1;La/twm0;B)V

    .line 2039
    .line 2040
    .line 2041
    invoke-virtual {v3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2042
    .line 2043
    .line 2044
    :cond_5c
    move-object/from16 v21, v4

    .line 2045
    .line 2046
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 2047
    .line 2048
    invoke-virtual {v3, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2049
    .line 2050
    .line 2051
    move-result v2

    .line 2052
    invoke-virtual {v3, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2053
    .line 2054
    .line 2055
    move-result v4

    .line 2056
    or-int/2addr v2, v4

    .line 2057
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v4

    .line 2061
    if-nez v2, :cond_5d

    .line 2062
    .line 2063
    if-ne v4, v7, :cond_5e

    .line 2064
    .line 2065
    :cond_5d
    new-instance v4, La/fic;

    .line 2066
    .line 2067
    invoke-direct {v4, v9, v0, v13}, La/fic;-><init>(Lkotlin/jvm/functions/Function1;La/twm0;B)V

    .line 2068
    .line 2069
    .line 2070
    invoke-virtual {v3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2071
    .line 2072
    .line 2073
    :cond_5e
    move-object/from16 v22, v4

    .line 2074
    .line 2075
    check-cast v22, Lkotlin/jvm/functions/Function1;

    .line 2076
    .line 2077
    const/16 v24, 0x0

    .line 2078
    .line 2079
    const/16 v25, 0x4

    .line 2080
    .line 2081
    move-object/from16 v23, v3

    .line 2082
    .line 2083
    invoke-static/range {v19 .. v25}, La/dub;->x(La/mm40;La/mvl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 2084
    .line 2085
    .line 2086
    move-object/from16 v0, v23

    .line 2087
    .line 2088
    invoke-static {v15}, La/q3d;->i(Ljava/util/List;)I

    .line 2089
    .line 2090
    .line 2091
    move-result v2

    .line 2092
    if-eq v1, v2, :cond_5f

    .line 2093
    .line 2094
    const v1, 0x7b396367

    .line 2095
    .line 2096
    .line 2097
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 2098
    .line 2099
    .line 2100
    sget-object v20, La/qqm;->a:La/qqm;

    .line 2101
    .line 2102
    const/16 v25, 0x30

    .line 2103
    .line 2104
    const/16 v26, 0xd

    .line 2105
    .line 2106
    const/16 v19, 0x0

    .line 2107
    .line 2108
    const/16 v21, 0x0

    .line 2109
    .line 2110
    const-wide/16 v22, 0x0

    .line 2111
    .line 2112
    move-object/from16 v24, v0

    .line 2113
    .line 2114
    invoke-static/range {v19 .. v26}, La/vtb;->t(La/mm40;La/qqm;La/bgi0;JLa/fet;II)V

    .line 2115
    .line 2116
    .line 2117
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 2118
    .line 2119
    .line 2120
    goto :goto_3b

    .line 2121
    :cond_5f
    const v1, 0x7b3b47a8

    .line 2122
    .line 2123
    .line 2124
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 2125
    .line 2126
    .line 2127
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 2128
    .line 2129
    .line 2130
    :goto_3b
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 2131
    .line 2132
    .line 2133
    goto :goto_3c

    .line 2134
    :cond_60
    move-object v0, v3

    .line 2135
    invoke-virtual {v0}, La/fet;->X()V

    .line 2136
    .line 2137
    .line 2138
    :goto_3c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2139
    .line 2140
    return-object v0

    .line 2141
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
