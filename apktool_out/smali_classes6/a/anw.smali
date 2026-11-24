.class public final La/anw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/anw;->a:B

    iput-object p1, p0, La/anw;->b:Ljava/util/List;

    iput-object p2, p0, La/anw;->c:Ljava/util/List;

    iput-object p3, p0, La/anw;->d:Lkotlin/jvm/functions/Function1;

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
    iget-byte v1, v0, La/anw;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    iget-object v3, v0, La/anw;->c:Ljava/util/List;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object v6, v0, La/anw;->b:Ljava/util/List;

    .line 11
    .line 12
    const/16 v7, 0x92

    .line 13
    .line 14
    const/16 v8, 0x10

    .line 15
    .line 16
    const/16 v9, 0x20

    .line 17
    .line 18
    const/4 v10, 0x4

    .line 19
    const/4 v11, 0x6

    .line 20
    const/4 v12, 0x0

    .line 21
    iget-object v0, v0, La/anw;->d:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    const/4 v13, 0x2

    .line 24
    const/4 v14, 0x1

    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, La/g9z;

    .line 31
    .line 32
    move-object/from16 v15, p2

    .line 33
    .line 34
    check-cast v15, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v15

    .line 40
    const v16, 0x7f080c30

    .line 41
    .line 42
    .line 43
    move-object/from16 v5, p3

    .line 44
    .line 45
    check-cast v5, La/fet;

    .line 46
    .line 47
    move-object/from16 v17, p4

    .line 48
    .line 49
    check-cast v17, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v17

    .line 55
    and-int/lit8 v18, v17, 0x6

    .line 56
    .line 57
    if-nez v18, :cond_1

    .line 58
    .line 59
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v10, v13

    .line 67
    :goto_0
    or-int v1, v17, v10

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move/from16 v1, v17

    .line 71
    .line 72
    :goto_1
    and-int/lit8 v10, v17, 0x30

    .line 73
    .line 74
    if-nez v10, :cond_3

    .line 75
    .line 76
    invoke-virtual {v5, v15}, La/fet;->e(I)Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-eqz v10, :cond_2

    .line 81
    .line 82
    move v8, v9

    .line 83
    :cond_2
    or-int/2addr v1, v8

    .line 84
    :cond_3
    and-int/lit16 v8, v1, 0x93

    .line 85
    .line 86
    if-eq v8, v7, :cond_4

    .line 87
    .line 88
    move v7, v14

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move v7, v12

    .line 91
    :goto_2
    and-int/2addr v1, v14

    .line 92
    invoke-virtual {v5, v1, v7}, La/fet;->U(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_9

    .line 97
    .line 98
    invoke-interface {v6, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, La/j240;

    .line 103
    .line 104
    const v6, -0x194caca9

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5, v6}, La/fet;->e0(I)V

    .line 108
    .line 109
    .line 110
    new-instance v17, La/rqm;

    .line 111
    .line 112
    new-instance v6, La/tui0;

    .line 113
    .line 114
    iget-object v7, v1, La/j240;->b:Ljava/lang/String;

    .line 115
    .line 116
    sget-object v8, La/zaq0;->b:La/zfn;

    .line 117
    .line 118
    invoke-virtual {v5, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    check-cast v9, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 123
    .line 124
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 125
    .line 126
    .line 127
    move-result-wide v9

    .line 128
    move/from16 p0, v14

    .line 129
    .line 130
    new-instance v14, La/y3d;

    .line 131
    .line 132
    invoke-direct {v14, v9, v10}, La/y3d;-><init>(J)V

    .line 133
    .line 134
    .line 135
    invoke-direct {v6, v7, v14}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 136
    .line 137
    .line 138
    new-instance v18, La/nui0;

    .line 139
    .line 140
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v19

    .line 144
    new-instance v7, La/m0x;

    .line 145
    .line 146
    iget-object v9, v1, La/j240;->a:La/dfm0;

    .line 147
    .line 148
    invoke-interface {v9}, La/dfm0;->a()I

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    invoke-direct {v7, v9, v4, v11}, La/m0x;-><init>(ILa/bzw;I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 160
    .line 161
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 162
    .line 163
    .line 164
    move-result-wide v9

    .line 165
    new-instance v4, La/y3d;

    .line 166
    .line 167
    invoke-direct {v4, v9, v10}, La/y3d;-><init>(J)V

    .line 168
    .line 169
    .line 170
    new-instance v9, La/pc5;

    .line 171
    .line 172
    invoke-virtual {v5, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    check-cast v8, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 177
    .line 178
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 179
    .line 180
    .line 181
    move-result-wide v10

    .line 182
    new-instance v8, La/y3d;

    .line 183
    .line 184
    invoke-direct {v8, v10, v11}, La/y3d;-><init>(J)V

    .line 185
    .line 186
    .line 187
    invoke-direct {v9, v8}, La/pc5;-><init>(La/y3d;)V

    .line 188
    .line 189
    .line 190
    const/16 v25, 0x0

    .line 191
    .line 192
    const/16 v26, 0xd2

    .line 193
    .line 194
    const/16 v20, 0x0

    .line 195
    .line 196
    const/16 v23, 0x0

    .line 197
    .line 198
    move-object/from16 v22, v4

    .line 199
    .line 200
    move-object/from16 v21, v7

    .line 201
    .line 202
    move-object/from16 v24, v9

    .line 203
    .line 204
    invoke-direct/range {v18 .. v26}, La/nui0;-><init>(Ljava/lang/Integer;La/y3d;La/o0x;La/y3d;La/y3d;La/rc5;FI)V

    .line 205
    .line 206
    .line 207
    if-nez v15, :cond_5

    .line 208
    .line 209
    sget-object v3, La/wui0;->b:La/wui0;

    .line 210
    .line 211
    :goto_3
    move-object/from16 v23, v3

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    add-int/lit8 v3, v3, -0x1

    .line 219
    .line 220
    if-ne v15, v3, :cond_6

    .line 221
    .line 222
    sget-object v3, La/wui0;->d:La/wui0;

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_6
    sget-object v3, La/wui0;->c:La/wui0;

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :goto_4
    const/16 v25, 0x0

    .line 229
    .line 230
    const/16 v26, 0x19c

    .line 231
    .line 232
    const/16 v20, 0x0

    .line 233
    .line 234
    const/16 v21, 0x0

    .line 235
    .line 236
    sget-object v22, La/qvi0;->a:La/qvi0;

    .line 237
    .line 238
    const/16 v24, 0x0

    .line 239
    .line 240
    move-object/from16 v19, v18

    .line 241
    .line 242
    move-object/from16 v18, v6

    .line 243
    .line 244
    invoke-direct/range {v17 .. v26}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v5, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    or-int/2addr v3, v4

    .line 256
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    if-nez v3, :cond_7

    .line 261
    .line 262
    if-ne v4, v2, :cond_8

    .line 263
    .line 264
    :cond_7
    new-instance v4, La/puh;

    .line 265
    .line 266
    invoke-direct {v4, v0, v1, v13}, La/puh;-><init>(Lkotlin/jvm/functions/Function1;La/j240;B)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v5, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    :cond_8
    move-object/from16 v20, v4

    .line 273
    .line 274
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 275
    .line 276
    const/16 v25, 0x180

    .line 277
    .line 278
    const/16 v26, 0xe9

    .line 279
    .line 280
    const/16 v16, 0x0

    .line 281
    .line 282
    const/16 v18, 0x1

    .line 283
    .line 284
    const/16 v19, 0x0

    .line 285
    .line 286
    const/16 v21, 0x0

    .line 287
    .line 288
    const/16 v22, 0x0

    .line 289
    .line 290
    const/16 v23, 0x0

    .line 291
    .line 292
    move-object/from16 v24, v5

    .line 293
    .line 294
    invoke-static/range {v16 .. v26}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 295
    .line 296
    .line 297
    move-object/from16 v0, v24

    .line 298
    .line 299
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 300
    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_9
    move-object v0, v5

    .line 304
    invoke-virtual {v0}, La/fet;->X()V

    .line 305
    .line 306
    .line 307
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object v0

    .line 310
    :pswitch_0
    move/from16 p0, v14

    .line 311
    .line 312
    const v16, 0x7f080c30

    .line 313
    .line 314
    .line 315
    move-object/from16 v1, p1

    .line 316
    .line 317
    check-cast v1, La/g9z;

    .line 318
    .line 319
    move-object/from16 v5, p2

    .line 320
    .line 321
    check-cast v5, Ljava/lang/Number;

    .line 322
    .line 323
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    move-object/from16 v14, p3

    .line 328
    .line 329
    check-cast v14, La/fet;

    .line 330
    .line 331
    move-object/from16 v15, p4

    .line 332
    .line 333
    check-cast v15, Ljava/lang/Number;

    .line 334
    .line 335
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 336
    .line 337
    .line 338
    move-result v15

    .line 339
    and-int/lit8 v17, v15, 0x6

    .line 340
    .line 341
    if-nez v17, :cond_b

    .line 342
    .line 343
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    if-eqz v1, :cond_a

    .line 348
    .line 349
    goto :goto_6

    .line 350
    :cond_a
    move v10, v13

    .line 351
    :goto_6
    or-int v1, v15, v10

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_b
    move v1, v15

    .line 355
    :goto_7
    and-int/lit8 v10, v15, 0x30

    .line 356
    .line 357
    if-nez v10, :cond_d

    .line 358
    .line 359
    invoke-virtual {v14, v5}, La/fet;->e(I)Z

    .line 360
    .line 361
    .line 362
    move-result v10

    .line 363
    if-eqz v10, :cond_c

    .line 364
    .line 365
    move v8, v9

    .line 366
    :cond_c
    or-int/2addr v1, v8

    .line 367
    :cond_d
    and-int/lit16 v8, v1, 0x93

    .line 368
    .line 369
    if-eq v8, v7, :cond_e

    .line 370
    .line 371
    move/from16 v7, p0

    .line 372
    .line 373
    goto :goto_8

    .line 374
    :cond_e
    move v7, v12

    .line 375
    :goto_8
    and-int/lit8 v1, v1, 0x1

    .line 376
    .line 377
    invoke-virtual {v14, v1, v7}, La/fet;->U(IZ)Z

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    if-eqz v1, :cond_14

    .line 382
    .line 383
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    check-cast v1, La/j240;

    .line 388
    .line 389
    const v6, 0x537de6c4

    .line 390
    .line 391
    .line 392
    invoke-virtual {v14, v6}, La/fet;->e0(I)V

    .line 393
    .line 394
    .line 395
    new-instance v17, La/rqm;

    .line 396
    .line 397
    new-instance v6, La/tui0;

    .line 398
    .line 399
    iget-object v7, v1, La/j240;->b:Ljava/lang/String;

    .line 400
    .line 401
    sget-object v8, La/zaq0;->b:La/zfn;

    .line 402
    .line 403
    invoke-virtual {v14, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v9

    .line 407
    check-cast v9, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 408
    .line 409
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 410
    .line 411
    .line 412
    move-result-wide v9

    .line 413
    new-instance v13, La/y3d;

    .line 414
    .line 415
    invoke-direct {v13, v9, v10}, La/y3d;-><init>(J)V

    .line 416
    .line 417
    .line 418
    invoke-direct {v6, v7, v13}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 419
    .line 420
    .line 421
    new-instance v18, La/nui0;

    .line 422
    .line 423
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 424
    .line 425
    .line 426
    move-result-object v19

    .line 427
    new-instance v7, La/m0x;

    .line 428
    .line 429
    iget-object v9, v1, La/j240;->a:La/dfm0;

    .line 430
    .line 431
    invoke-interface {v9}, La/dfm0;->a()I

    .line 432
    .line 433
    .line 434
    move-result v9

    .line 435
    invoke-direct {v7, v9, v4, v11}, La/m0x;-><init>(ILa/bzw;I)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v14, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 443
    .line 444
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 445
    .line 446
    .line 447
    move-result-wide v9

    .line 448
    new-instance v4, La/y3d;

    .line 449
    .line 450
    invoke-direct {v4, v9, v10}, La/y3d;-><init>(J)V

    .line 451
    .line 452
    .line 453
    new-instance v9, La/pc5;

    .line 454
    .line 455
    invoke-virtual {v14, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v8

    .line 459
    check-cast v8, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 460
    .line 461
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 462
    .line 463
    .line 464
    move-result-wide v10

    .line 465
    new-instance v8, La/y3d;

    .line 466
    .line 467
    invoke-direct {v8, v10, v11}, La/y3d;-><init>(J)V

    .line 468
    .line 469
    .line 470
    invoke-direct {v9, v8}, La/pc5;-><init>(La/y3d;)V

    .line 471
    .line 472
    .line 473
    const/16 v25, 0x0

    .line 474
    .line 475
    const/16 v26, 0xd2

    .line 476
    .line 477
    const/16 v20, 0x0

    .line 478
    .line 479
    const/16 v23, 0x0

    .line 480
    .line 481
    move-object/from16 v22, v4

    .line 482
    .line 483
    move-object/from16 v21, v7

    .line 484
    .line 485
    move-object/from16 v24, v9

    .line 486
    .line 487
    invoke-direct/range {v18 .. v26}, La/nui0;-><init>(Ljava/lang/Integer;La/y3d;La/o0x;La/y3d;La/y3d;La/rc5;FI)V

    .line 488
    .line 489
    .line 490
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    move/from16 v7, p0

    .line 495
    .line 496
    if-ne v4, v7, :cond_f

    .line 497
    .line 498
    sget-object v3, La/wui0;->a:La/wui0;

    .line 499
    .line 500
    :goto_9
    move-object/from16 v23, v3

    .line 501
    .line 502
    goto :goto_a

    .line 503
    :cond_f
    if-nez v5, :cond_10

    .line 504
    .line 505
    sget-object v3, La/wui0;->b:La/wui0;

    .line 506
    .line 507
    goto :goto_9

    .line 508
    :cond_10
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    sub-int/2addr v3, v7

    .line 513
    if-ne v5, v3, :cond_11

    .line 514
    .line 515
    sget-object v3, La/wui0;->d:La/wui0;

    .line 516
    .line 517
    goto :goto_9

    .line 518
    :cond_11
    sget-object v3, La/wui0;->c:La/wui0;

    .line 519
    .line 520
    goto :goto_9

    .line 521
    :goto_a
    const/16 v25, 0x0

    .line 522
    .line 523
    const/16 v26, 0x19c

    .line 524
    .line 525
    const/16 v20, 0x0

    .line 526
    .line 527
    const/16 v21, 0x0

    .line 528
    .line 529
    sget-object v22, La/qvi0;->a:La/qvi0;

    .line 530
    .line 531
    const/16 v24, 0x0

    .line 532
    .line 533
    move-object/from16 v19, v18

    .line 534
    .line 535
    move-object/from16 v18, v6

    .line 536
    .line 537
    invoke-direct/range {v17 .. v26}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v14, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    or-int/2addr v3, v4

    .line 549
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    if-nez v3, :cond_12

    .line 554
    .line 555
    if-ne v4, v2, :cond_13

    .line 556
    .line 557
    :cond_12
    new-instance v4, La/puh;

    .line 558
    .line 559
    const/4 v7, 0x1

    .line 560
    invoke-direct {v4, v0, v1, v7}, La/puh;-><init>(Lkotlin/jvm/functions/Function1;La/j240;B)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v14, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    :cond_13
    move-object/from16 v21, v4

    .line 567
    .line 568
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 569
    .line 570
    const/16 v26, 0x180

    .line 571
    .line 572
    const/16 v27, 0xe9

    .line 573
    .line 574
    move-object/from16 v18, v17

    .line 575
    .line 576
    const/16 v17, 0x0

    .line 577
    .line 578
    const/16 v19, 0x1

    .line 579
    .line 580
    const/16 v20, 0x0

    .line 581
    .line 582
    const/16 v22, 0x0

    .line 583
    .line 584
    const/16 v23, 0x0

    .line 585
    .line 586
    const/16 v24, 0x0

    .line 587
    .line 588
    move-object/from16 v25, v14

    .line 589
    .line 590
    invoke-static/range {v17 .. v27}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 591
    .line 592
    .line 593
    move-object/from16 v0, v25

    .line 594
    .line 595
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 596
    .line 597
    .line 598
    goto :goto_b

    .line 599
    :cond_14
    move-object v0, v14

    .line 600
    invoke-virtual {v0}, La/fet;->X()V

    .line 601
    .line 602
    .line 603
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 604
    .line 605
    return-object v0

    .line 606
    :pswitch_1
    const v16, 0x7f080c30

    .line 607
    .line 608
    .line 609
    move-object/from16 v1, p1

    .line 610
    .line 611
    check-cast v1, La/g9z;

    .line 612
    .line 613
    move-object/from16 v5, p2

    .line 614
    .line 615
    check-cast v5, Ljava/lang/Number;

    .line 616
    .line 617
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 618
    .line 619
    .line 620
    move-result v5

    .line 621
    move-object/from16 v14, p3

    .line 622
    .line 623
    check-cast v14, La/fet;

    .line 624
    .line 625
    move-object/from16 v15, p4

    .line 626
    .line 627
    check-cast v15, Ljava/lang/Number;

    .line 628
    .line 629
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 630
    .line 631
    .line 632
    move-result v15

    .line 633
    and-int/lit8 v17, v15, 0x6

    .line 634
    .line 635
    if-nez v17, :cond_16

    .line 636
    .line 637
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    if-eqz v1, :cond_15

    .line 642
    .line 643
    goto :goto_c

    .line 644
    :cond_15
    move v10, v13

    .line 645
    :goto_c
    or-int v1, v15, v10

    .line 646
    .line 647
    goto :goto_d

    .line 648
    :cond_16
    move v1, v15

    .line 649
    :goto_d
    and-int/lit8 v10, v15, 0x30

    .line 650
    .line 651
    if-nez v10, :cond_18

    .line 652
    .line 653
    invoke-virtual {v14, v5}, La/fet;->e(I)Z

    .line 654
    .line 655
    .line 656
    move-result v10

    .line 657
    if-eqz v10, :cond_17

    .line 658
    .line 659
    move v8, v9

    .line 660
    :cond_17
    or-int/2addr v1, v8

    .line 661
    :cond_18
    and-int/lit16 v8, v1, 0x93

    .line 662
    .line 663
    if-eq v8, v7, :cond_19

    .line 664
    .line 665
    const/4 v7, 0x1

    .line 666
    :goto_e
    const/4 v8, 0x1

    .line 667
    goto :goto_f

    .line 668
    :cond_19
    move v7, v12

    .line 669
    goto :goto_e

    .line 670
    :goto_f
    and-int/2addr v1, v8

    .line 671
    invoke-virtual {v14, v1, v7}, La/fet;->U(IZ)Z

    .line 672
    .line 673
    .line 674
    move-result v1

    .line 675
    if-eqz v1, :cond_1f

    .line 676
    .line 677
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    check-cast v1, La/zmw;

    .line 682
    .line 683
    const v6, 0x4fa9466b

    .line 684
    .line 685
    .line 686
    invoke-virtual {v14, v6}, La/fet;->e0(I)V

    .line 687
    .line 688
    .line 689
    new-instance v17, La/rqm;

    .line 690
    .line 691
    new-instance v6, La/tui0;

    .line 692
    .line 693
    iget-object v7, v1, La/zmw;->a:Ljava/lang/String;

    .line 694
    .line 695
    sget-object v8, La/zaq0;->b:La/zfn;

    .line 696
    .line 697
    invoke-virtual {v14, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v9

    .line 701
    check-cast v9, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 702
    .line 703
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 704
    .line 705
    .line 706
    move-result-wide v9

    .line 707
    new-instance v13, La/y3d;

    .line 708
    .line 709
    invoke-direct {v13, v9, v10}, La/y3d;-><init>(J)V

    .line 710
    .line 711
    .line 712
    invoke-direct {v6, v7, v13}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 713
    .line 714
    .line 715
    new-instance v18, La/nui0;

    .line 716
    .line 717
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 718
    .line 719
    .line 720
    move-result-object v19

    .line 721
    new-instance v7, La/m0x;

    .line 722
    .line 723
    iget-object v9, v1, La/zmw;->b:La/jnw;

    .line 724
    .line 725
    iget v9, v9, La/jnw;->b:I

    .line 726
    .line 727
    invoke-direct {v7, v9, v4, v11}, La/m0x;-><init>(ILa/bzw;I)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v14, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v4

    .line 734
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 735
    .line 736
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 737
    .line 738
    .line 739
    move-result-wide v9

    .line 740
    new-instance v4, La/y3d;

    .line 741
    .line 742
    invoke-direct {v4, v9, v10}, La/y3d;-><init>(J)V

    .line 743
    .line 744
    .line 745
    new-instance v9, La/pc5;

    .line 746
    .line 747
    invoke-virtual {v14, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v8

    .line 751
    check-cast v8, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 752
    .line 753
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 754
    .line 755
    .line 756
    move-result-wide v10

    .line 757
    new-instance v8, La/y3d;

    .line 758
    .line 759
    invoke-direct {v8, v10, v11}, La/y3d;-><init>(J)V

    .line 760
    .line 761
    .line 762
    invoke-direct {v9, v8}, La/pc5;-><init>(La/y3d;)V

    .line 763
    .line 764
    .line 765
    const/16 v25, 0x0

    .line 766
    .line 767
    const/16 v26, 0xd2

    .line 768
    .line 769
    const/16 v20, 0x0

    .line 770
    .line 771
    const/16 v23, 0x0

    .line 772
    .line 773
    move-object/from16 v22, v4

    .line 774
    .line 775
    move-object/from16 v21, v7

    .line 776
    .line 777
    move-object/from16 v24, v9

    .line 778
    .line 779
    invoke-direct/range {v18 .. v26}, La/nui0;-><init>(Ljava/lang/Integer;La/y3d;La/o0x;La/y3d;La/y3d;La/rc5;FI)V

    .line 780
    .line 781
    .line 782
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 783
    .line 784
    .line 785
    move-result v4

    .line 786
    const/4 v7, 0x1

    .line 787
    if-ne v4, v7, :cond_1a

    .line 788
    .line 789
    sget-object v3, La/wui0;->a:La/wui0;

    .line 790
    .line 791
    :goto_10
    move-object/from16 v23, v3

    .line 792
    .line 793
    goto :goto_11

    .line 794
    :cond_1a
    if-nez v5, :cond_1b

    .line 795
    .line 796
    sget-object v3, La/wui0;->b:La/wui0;

    .line 797
    .line 798
    goto :goto_10

    .line 799
    :cond_1b
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 800
    .line 801
    .line 802
    move-result v3

    .line 803
    sub-int/2addr v3, v7

    .line 804
    if-ne v5, v3, :cond_1c

    .line 805
    .line 806
    sget-object v3, La/wui0;->d:La/wui0;

    .line 807
    .line 808
    goto :goto_10

    .line 809
    :cond_1c
    sget-object v3, La/wui0;->c:La/wui0;

    .line 810
    .line 811
    goto :goto_10

    .line 812
    :goto_11
    const/16 v25, 0x0

    .line 813
    .line 814
    const/16 v26, 0x19c

    .line 815
    .line 816
    const/16 v20, 0x0

    .line 817
    .line 818
    const/16 v21, 0x0

    .line 819
    .line 820
    sget-object v22, La/qvi0;->a:La/qvi0;

    .line 821
    .line 822
    const/16 v24, 0x0

    .line 823
    .line 824
    move-object/from16 v19, v18

    .line 825
    .line 826
    move-object/from16 v18, v6

    .line 827
    .line 828
    invoke-direct/range {v17 .. v26}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 829
    .line 830
    .line 831
    invoke-virtual {v14, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v3

    .line 835
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    move-result v4

    .line 839
    or-int/2addr v3, v4

    .line 840
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v4

    .line 844
    if-nez v3, :cond_1d

    .line 845
    .line 846
    if-ne v4, v2, :cond_1e

    .line 847
    .line 848
    :cond_1d
    new-instance v4, La/nsr;

    .line 849
    .line 850
    const/16 v2, 0xb

    .line 851
    .line 852
    invoke-direct {v4, v0, v1, v2}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v14, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 856
    .line 857
    .line 858
    :cond_1e
    move-object/from16 v21, v4

    .line 859
    .line 860
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 861
    .line 862
    const/16 v26, 0x180

    .line 863
    .line 864
    const/16 v27, 0xe9

    .line 865
    .line 866
    move-object/from16 v18, v17

    .line 867
    .line 868
    const/16 v17, 0x0

    .line 869
    .line 870
    const/16 v19, 0x0

    .line 871
    .line 872
    const/16 v20, 0x0

    .line 873
    .line 874
    const/16 v22, 0x0

    .line 875
    .line 876
    const/16 v23, 0x0

    .line 877
    .line 878
    const/16 v24, 0x0

    .line 879
    .line 880
    move-object/from16 v25, v14

    .line 881
    .line 882
    invoke-static/range {v17 .. v27}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 883
    .line 884
    .line 885
    move-object/from16 v0, v25

    .line 886
    .line 887
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 888
    .line 889
    .line 890
    goto :goto_12

    .line 891
    :cond_1f
    move-object v0, v14

    .line 892
    invoke-virtual {v0}, La/fet;->X()V

    .line 893
    .line 894
    .line 895
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 896
    .line 897
    return-object v0

    .line 898
    nop

    .line 899
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
