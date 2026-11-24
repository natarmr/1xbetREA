.class public final La/o57;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:La/z77;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;La/z77;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/o57;->a:B

    iput-object p1, p0, La/o57;->b:Ljava/util/ArrayList;

    iput-object p2, p0, La/o57;->c:La/z77;

    iput-object p3, p0, La/o57;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/o57;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    iget-object v3, v0, La/o57;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v4, 0x92

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    const/16 v6, 0x20

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    const/4 v8, 0x4

    .line 17
    iget-object v9, v0, La/o57;->c:La/z77;

    .line 18
    .line 19
    iget-object v10, v0, La/o57;->d:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    const/4 v11, 0x3

    .line 22
    const/4 v12, 0x0

    .line 23
    const/4 v13, 0x1

    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    check-cast v1, La/g9z;

    .line 30
    .line 31
    move-object/from16 v14, p2

    .line 32
    .line 33
    check-cast v14, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v14

    .line 39
    move-object/from16 v15, p3

    .line 40
    .line 41
    check-cast v15, La/fet;

    .line 42
    .line 43
    move-object/from16 v16, p4

    .line 44
    .line 45
    check-cast v16, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v16

    .line 51
    and-int/lit8 v17, v16, 0x6

    .line 52
    .line 53
    if-nez v17, :cond_1

    .line 54
    .line 55
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    move v7, v8

    .line 62
    :cond_0
    or-int v1, v16, v7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move/from16 v1, v16

    .line 66
    .line 67
    :goto_0
    and-int/lit8 v7, v16, 0x30

    .line 68
    .line 69
    if-nez v7, :cond_3

    .line 70
    .line 71
    invoke-virtual {v15, v14}, La/fet;->e(I)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_2

    .line 76
    .line 77
    move v5, v6

    .line 78
    :cond_2
    or-int/2addr v1, v5

    .line 79
    :cond_3
    and-int/lit16 v5, v1, 0x93

    .line 80
    .line 81
    if-eq v5, v4, :cond_4

    .line 82
    .line 83
    move v4, v13

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    move v4, v12

    .line 86
    :goto_1
    and-int/2addr v1, v13

    .line 87
    invoke-virtual {v15, v1, v4}, La/fet;->U(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_9

    .line 92
    .line 93
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, La/o8w;

    .line 98
    .line 99
    const v3, -0x480ad660

    .line 100
    .line 101
    .line 102
    invoke-virtual {v15, v3}, La/fet;->e0(I)V

    .line 103
    .line 104
    .line 105
    if-ne v14, v13, :cond_7

    .line 106
    .line 107
    move-object v3, v9

    .line 108
    check-cast v3, La/x77;

    .line 109
    .line 110
    iget-object v4, v3, La/x77;->i:La/qgv0;

    .line 111
    .line 112
    if-eqz v4, :cond_7

    .line 113
    .line 114
    const v4, -0x480a170d

    .line 115
    .line 116
    .line 117
    invoke-virtual {v15, v4}, La/fet;->e0(I)V

    .line 118
    .line 119
    .line 120
    iget-object v3, v3, La/x77;->i:La/qgv0;

    .line 121
    .line 122
    sget-object v4, La/qmk;->a:La/zcl;

    .line 123
    .line 124
    const/high16 v20, 0x41000000    # 8.0f

    .line 125
    .line 126
    const/16 v21, 0x7

    .line 127
    .line 128
    sget-object v16, La/jm40;->b:La/jm40;

    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    const/16 v18, 0x0

    .line 133
    .line 134
    const/16 v19, 0x0

    .line 135
    .line 136
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    new-instance v16, La/gy30;

    .line 141
    .line 142
    new-instance v17, La/ux30;

    .line 143
    .line 144
    iget-object v5, v3, La/qgv0;->b:Ljava/lang/String;

    .line 145
    .line 146
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 147
    .line 148
    sget-object v6, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 149
    .line 150
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 151
    .line 152
    .line 153
    move-result-wide v18

    .line 154
    iget-object v7, v3, La/qgv0;->c:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 157
    .line 158
    .line 159
    move-result-wide v20

    .line 160
    move-object/from16 v22, v5

    .line 161
    .line 162
    move-object/from16 v23, v7

    .line 163
    .line 164
    invoke-direct/range {v17 .. v23}, La/ux30;-><init>(JJLjava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    new-instance v5, La/zx30;

    .line 168
    .line 169
    new-instance v6, La/n0x;

    .line 170
    .line 171
    iget-object v7, v3, La/qgv0;->d:Ljava/lang/String;

    .line 172
    .line 173
    invoke-direct {v6, v7}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-direct {v5, v6, v11}, La/zx30;-><init>(La/o0x;I)V

    .line 177
    .line 178
    .line 179
    iget-wide v6, v3, La/qgv0;->e:J

    .line 180
    .line 181
    const/16 v23, 0x0

    .line 182
    .line 183
    const/16 v24, 0xf2

    .line 184
    .line 185
    const/16 v18, 0x0

    .line 186
    .line 187
    const/16 v22, 0x0

    .line 188
    .line 189
    move-object/from16 v19, v5

    .line 190
    .line 191
    move-wide/from16 v20, v6

    .line 192
    .line 193
    invoke-direct/range {v16 .. v24}, La/gy30;-><init>(La/wx30;La/sx30;La/fy30;JLjava/util/List;La/xx30;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v15, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    invoke-virtual {v15, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    or-int/2addr v5, v6

    .line 205
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    if-nez v5, :cond_5

    .line 210
    .line 211
    if-ne v6, v2, :cond_6

    .line 212
    .line 213
    :cond_5
    new-instance v6, La/n57;

    .line 214
    .line 215
    invoke-direct {v6, v10, v3, v11}, La/n57;-><init>(Lkotlin/jvm/functions/Function1;La/qgv0;B)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v15, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :cond_6
    move-object/from16 v17, v6

    .line 222
    .line 223
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 224
    .line 225
    const/16 v21, 0x0

    .line 226
    .line 227
    const/16 v22, 0x18

    .line 228
    .line 229
    const/16 v18, 0x0

    .line 230
    .line 231
    const/16 v19, 0x0

    .line 232
    .line 233
    move-object/from16 v20, v15

    .line 234
    .line 235
    move-object v15, v4

    .line 236
    invoke-static/range {v15 .. v22}, La/jiq0;->y(La/mm40;La/gy30;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 237
    .line 238
    .line 239
    move-object/from16 v2, v20

    .line 240
    .line 241
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 242
    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_7
    move-object v2, v15

    .line 246
    const v3, -0x47f1accc

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 253
    .line 254
    .line 255
    :goto_2
    instance-of v3, v1, La/p3w;

    .line 256
    .line 257
    if-eqz v3, :cond_8

    .line 258
    .line 259
    const v3, -0x47f04bcf

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 263
    .line 264
    .line 265
    move-object/from16 v16, v1

    .line 266
    .line 267
    check-cast v16, La/p3w;

    .line 268
    .line 269
    check-cast v9, La/x77;

    .line 270
    .line 271
    iget-object v1, v9, La/x77;->b:La/w2w;

    .line 272
    .line 273
    iget-boolean v1, v1, La/w2w;->c:Z

    .line 274
    .line 275
    iget-object v0, v0, La/o57;->d:Lkotlin/jvm/functions/Function1;

    .line 276
    .line 277
    const/16 v20, 0x0

    .line 278
    .line 279
    const/4 v15, 0x0

    .line 280
    move-object/from16 v18, v0

    .line 281
    .line 282
    move/from16 v17, v1

    .line 283
    .line 284
    move-object/from16 v19, v2

    .line 285
    .line 286
    invoke-static/range {v15 .. v20}, La/zvw;->h(La/mm40;La/p3w;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_8
    const v0, -0x47ea9f0c

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 300
    .line 301
    .line 302
    :goto_3
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_9
    move-object v2, v15

    .line 307
    invoke-virtual {v2}, La/fet;->X()V

    .line 308
    .line 309
    .line 310
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_0
    move-object/from16 v0, p1

    .line 314
    .line 315
    check-cast v0, La/g9z;

    .line 316
    .line 317
    move-object/from16 v1, p2

    .line 318
    .line 319
    check-cast v1, Ljava/lang/Number;

    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    move-object/from16 v14, p3

    .line 326
    .line 327
    check-cast v14, La/fet;

    .line 328
    .line 329
    move-object/from16 v15, p4

    .line 330
    .line 331
    check-cast v15, Ljava/lang/Number;

    .line 332
    .line 333
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 334
    .line 335
    .line 336
    move-result v15

    .line 337
    and-int/lit8 v16, v15, 0x6

    .line 338
    .line 339
    if-nez v16, :cond_b

    .line 340
    .line 341
    invoke-virtual {v14, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    if-eqz v0, :cond_a

    .line 346
    .line 347
    move v7, v8

    .line 348
    :cond_a
    or-int v0, v15, v7

    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_b
    move v0, v15

    .line 352
    :goto_5
    and-int/lit8 v7, v15, 0x30

    .line 353
    .line 354
    if-nez v7, :cond_d

    .line 355
    .line 356
    invoke-virtual {v14, v1}, La/fet;->e(I)Z

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    if-eqz v7, :cond_c

    .line 361
    .line 362
    move v5, v6

    .line 363
    :cond_c
    or-int/2addr v0, v5

    .line 364
    :cond_d
    and-int/lit16 v5, v0, 0x93

    .line 365
    .line 366
    if-eq v5, v4, :cond_e

    .line 367
    .line 368
    move v4, v13

    .line 369
    goto :goto_6

    .line 370
    :cond_e
    move v4, v12

    .line 371
    :goto_6
    and-int/2addr v0, v13

    .line 372
    invoke-virtual {v14, v0, v4}, La/fet;->U(IZ)Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-eqz v0, :cond_13

    .line 377
    .line 378
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    check-cast v0, La/o8w;

    .line 383
    .line 384
    const v3, -0x50eb35ff

    .line 385
    .line 386
    .line 387
    invoke-virtual {v14, v3}, La/fet;->e0(I)V

    .line 388
    .line 389
    .line 390
    if-ne v1, v13, :cond_11

    .line 391
    .line 392
    check-cast v9, La/x77;

    .line 393
    .line 394
    iget-object v1, v9, La/x77;->i:La/qgv0;

    .line 395
    .line 396
    if-eqz v1, :cond_11

    .line 397
    .line 398
    const v1, -0x50ea6a71

    .line 399
    .line 400
    .line 401
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 402
    .line 403
    .line 404
    iget-object v1, v9, La/x77;->i:La/qgv0;

    .line 405
    .line 406
    sget-object v3, La/qmk;->a:La/zcl;

    .line 407
    .line 408
    const/high16 v8, 0x41000000    # 8.0f

    .line 409
    .line 410
    const/4 v9, 0x7

    .line 411
    sget-object v4, La/jm40;->b:La/jm40;

    .line 412
    .line 413
    const/4 v5, 0x0

    .line 414
    const/4 v6, 0x0

    .line 415
    const/4 v7, 0x0

    .line 416
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    new-instance v15, La/gy30;

    .line 421
    .line 422
    new-instance v16, La/ux30;

    .line 423
    .line 424
    iget-object v4, v1, La/qgv0;->b:Ljava/lang/String;

    .line 425
    .line 426
    sget-object v5, La/s6t0;->a:La/pz40;

    .line 427
    .line 428
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 429
    .line 430
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 431
    .line 432
    .line 433
    move-result-wide v17

    .line 434
    iget-object v6, v1, La/qgv0;->c:Ljava/lang/String;

    .line 435
    .line 436
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 437
    .line 438
    .line 439
    move-result-wide v19

    .line 440
    move-object/from16 v21, v4

    .line 441
    .line 442
    move-object/from16 v22, v6

    .line 443
    .line 444
    invoke-direct/range {v16 .. v22}, La/ux30;-><init>(JJLjava/lang/String;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    new-instance v4, La/zx30;

    .line 448
    .line 449
    new-instance v5, La/n0x;

    .line 450
    .line 451
    iget-object v6, v1, La/qgv0;->d:Ljava/lang/String;

    .line 452
    .line 453
    invoke-direct {v5, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-direct {v4, v5, v11}, La/zx30;-><init>(La/o0x;I)V

    .line 457
    .line 458
    .line 459
    iget-wide v5, v1, La/qgv0;->e:J

    .line 460
    .line 461
    const/16 v22, 0x0

    .line 462
    .line 463
    const/16 v23, 0xf2

    .line 464
    .line 465
    const/16 v17, 0x0

    .line 466
    .line 467
    const/16 v21, 0x0

    .line 468
    .line 469
    move-object/from16 v18, v4

    .line 470
    .line 471
    move-wide/from16 v19, v5

    .line 472
    .line 473
    invoke-direct/range {v15 .. v23}, La/gy30;-><init>(La/wx30;La/sx30;La/fy30;JLjava/util/List;La/xx30;I)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v14, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v5

    .line 484
    or-int/2addr v4, v5

    .line 485
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    if-nez v4, :cond_f

    .line 490
    .line 491
    if-ne v5, v2, :cond_10

    .line 492
    .line 493
    :cond_f
    new-instance v5, La/n57;

    .line 494
    .line 495
    invoke-direct {v5, v10, v1, v13}, La/n57;-><init>(Lkotlin/jvm/functions/Function1;La/qgv0;B)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v14, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    :cond_10
    move-object/from16 v16, v5

    .line 502
    .line 503
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 504
    .line 505
    const/16 v20, 0x0

    .line 506
    .line 507
    const/16 v21, 0x18

    .line 508
    .line 509
    const/16 v17, 0x0

    .line 510
    .line 511
    const/16 v18, 0x0

    .line 512
    .line 513
    move-object/from16 v19, v14

    .line 514
    .line 515
    move-object v14, v3

    .line 516
    invoke-static/range {v14 .. v21}, La/jiq0;->y(La/mm40;La/gy30;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 517
    .line 518
    .line 519
    move-object/from16 v1, v19

    .line 520
    .line 521
    invoke-virtual {v1, v12}, La/fet;->r(Z)V

    .line 522
    .line 523
    .line 524
    goto :goto_7

    .line 525
    :cond_11
    move-object v1, v14

    .line 526
    const v2, -0x50d1e5e9

    .line 527
    .line 528
    .line 529
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v1, v12}, La/fet;->r(Z)V

    .line 533
    .line 534
    .line 535
    :goto_7
    instance-of v2, v0, La/cuo;

    .line 536
    .line 537
    if-eqz v2, :cond_12

    .line 538
    .line 539
    const v2, -0x50d06b9d

    .line 540
    .line 541
    .line 542
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 543
    .line 544
    .line 545
    const/4 v2, 0x0

    .line 546
    check-cast v0, La/cuo;

    .line 547
    .line 548
    invoke-static {v2, v0, v10, v1, v12}, La/ebc;->x(La/mm40;La/cuo;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v1, v12}, La/fet;->r(Z)V

    .line 552
    .line 553
    .line 554
    goto :goto_8

    .line 555
    :cond_12
    const v0, -0x50cc5f89

    .line 556
    .line 557
    .line 558
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v1, v12}, La/fet;->r(Z)V

    .line 562
    .line 563
    .line 564
    :goto_8
    invoke-virtual {v1, v12}, La/fet;->r(Z)V

    .line 565
    .line 566
    .line 567
    goto :goto_9

    .line 568
    :cond_13
    move-object v1, v14

    .line 569
    invoke-virtual {v1}, La/fet;->X()V

    .line 570
    .line 571
    .line 572
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 573
    .line 574
    return-object v0

    .line 575
    :pswitch_1
    move-object/from16 v1, p1

    .line 576
    .line 577
    check-cast v1, La/g9z;

    .line 578
    .line 579
    move-object/from16 v14, p2

    .line 580
    .line 581
    check-cast v14, Ljava/lang/Number;

    .line 582
    .line 583
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 584
    .line 585
    .line 586
    move-result v14

    .line 587
    move-object/from16 v15, p3

    .line 588
    .line 589
    check-cast v15, La/fet;

    .line 590
    .line 591
    move-object/from16 v16, p4

    .line 592
    .line 593
    check-cast v16, Ljava/lang/Number;

    .line 594
    .line 595
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 596
    .line 597
    .line 598
    move-result v16

    .line 599
    and-int/lit8 v17, v16, 0x6

    .line 600
    .line 601
    if-nez v17, :cond_15

    .line 602
    .line 603
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v1

    .line 607
    if-eqz v1, :cond_14

    .line 608
    .line 609
    move v7, v8

    .line 610
    :cond_14
    or-int v1, v16, v7

    .line 611
    .line 612
    goto :goto_a

    .line 613
    :cond_15
    move/from16 v1, v16

    .line 614
    .line 615
    :goto_a
    and-int/lit8 v7, v16, 0x30

    .line 616
    .line 617
    if-nez v7, :cond_17

    .line 618
    .line 619
    invoke-virtual {v15, v14}, La/fet;->e(I)Z

    .line 620
    .line 621
    .line 622
    move-result v7

    .line 623
    if-eqz v7, :cond_16

    .line 624
    .line 625
    move v5, v6

    .line 626
    :cond_16
    or-int/2addr v1, v5

    .line 627
    :cond_17
    and-int/lit16 v5, v1, 0x93

    .line 628
    .line 629
    if-eq v5, v4, :cond_18

    .line 630
    .line 631
    move v4, v13

    .line 632
    goto :goto_b

    .line 633
    :cond_18
    move v4, v12

    .line 634
    :goto_b
    and-int/2addr v1, v13

    .line 635
    invoke-virtual {v15, v1, v4}, La/fet;->U(IZ)Z

    .line 636
    .line 637
    .line 638
    move-result v1

    .line 639
    if-eqz v1, :cond_1d

    .line 640
    .line 641
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    check-cast v1, La/o8w;

    .line 646
    .line 647
    const v3, 0x7f0a1df7

    .line 648
    .line 649
    .line 650
    invoke-virtual {v15, v3}, La/fet;->e0(I)V

    .line 651
    .line 652
    .line 653
    if-ne v14, v13, :cond_1b

    .line 654
    .line 655
    move-object v3, v9

    .line 656
    check-cast v3, La/x77;

    .line 657
    .line 658
    iget-object v4, v3, La/x77;->i:La/qgv0;

    .line 659
    .line 660
    if-eqz v4, :cond_1b

    .line 661
    .line 662
    const v4, 0x7f0add4a

    .line 663
    .line 664
    .line 665
    invoke-virtual {v15, v4}, La/fet;->e0(I)V

    .line 666
    .line 667
    .line 668
    iget-object v3, v3, La/x77;->i:La/qgv0;

    .line 669
    .line 670
    sget-object v4, La/qmk;->a:La/zcl;

    .line 671
    .line 672
    const/high16 v20, 0x41000000    # 8.0f

    .line 673
    .line 674
    const/16 v21, 0x7

    .line 675
    .line 676
    sget-object v16, La/jm40;->b:La/jm40;

    .line 677
    .line 678
    const/16 v17, 0x0

    .line 679
    .line 680
    const/16 v18, 0x0

    .line 681
    .line 682
    const/16 v19, 0x0

    .line 683
    .line 684
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 685
    .line 686
    .line 687
    move-result-object v4

    .line 688
    new-instance v16, La/gy30;

    .line 689
    .line 690
    new-instance v17, La/ux30;

    .line 691
    .line 692
    iget-object v5, v3, La/qgv0;->b:Ljava/lang/String;

    .line 693
    .line 694
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 695
    .line 696
    sget-object v6, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 697
    .line 698
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 699
    .line 700
    .line 701
    move-result-wide v18

    .line 702
    iget-object v7, v3, La/qgv0;->c:Ljava/lang/String;

    .line 703
    .line 704
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 705
    .line 706
    .line 707
    move-result-wide v20

    .line 708
    move-object/from16 v22, v5

    .line 709
    .line 710
    move-object/from16 v23, v7

    .line 711
    .line 712
    invoke-direct/range {v17 .. v23}, La/ux30;-><init>(JJLjava/lang/String;Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    new-instance v5, La/zx30;

    .line 716
    .line 717
    new-instance v6, La/n0x;

    .line 718
    .line 719
    iget-object v7, v3, La/qgv0;->d:Ljava/lang/String;

    .line 720
    .line 721
    invoke-direct {v6, v7}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 722
    .line 723
    .line 724
    invoke-direct {v5, v6, v11}, La/zx30;-><init>(La/o0x;I)V

    .line 725
    .line 726
    .line 727
    iget-wide v6, v3, La/qgv0;->e:J

    .line 728
    .line 729
    const/16 v23, 0x0

    .line 730
    .line 731
    const/16 v24, 0xf2

    .line 732
    .line 733
    const/16 v18, 0x0

    .line 734
    .line 735
    const/16 v22, 0x0

    .line 736
    .line 737
    move-object/from16 v19, v5

    .line 738
    .line 739
    move-wide/from16 v20, v6

    .line 740
    .line 741
    invoke-direct/range {v16 .. v24}, La/gy30;-><init>(La/wx30;La/sx30;La/fy30;JLjava/util/List;La/xx30;I)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v15, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v5

    .line 748
    invoke-virtual {v15, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 749
    .line 750
    .line 751
    move-result v6

    .line 752
    or-int/2addr v5, v6

    .line 753
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v6

    .line 757
    if-nez v5, :cond_19

    .line 758
    .line 759
    if-ne v6, v2, :cond_1a

    .line 760
    .line 761
    :cond_19
    new-instance v6, La/n57;

    .line 762
    .line 763
    invoke-direct {v6, v10, v3, v12}, La/n57;-><init>(Lkotlin/jvm/functions/Function1;La/qgv0;B)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v15, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    :cond_1a
    move-object/from16 v17, v6

    .line 770
    .line 771
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 772
    .line 773
    const/16 v21, 0x0

    .line 774
    .line 775
    const/16 v22, 0x18

    .line 776
    .line 777
    const/16 v18, 0x0

    .line 778
    .line 779
    const/16 v19, 0x0

    .line 780
    .line 781
    move-object/from16 v20, v15

    .line 782
    .line 783
    move-object v15, v4

    .line 784
    invoke-static/range {v15 .. v22}, La/jiq0;->y(La/mm40;La/gy30;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 785
    .line 786
    .line 787
    move-object/from16 v2, v20

    .line 788
    .line 789
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 790
    .line 791
    .line 792
    goto :goto_c

    .line 793
    :cond_1b
    move-object v2, v15

    .line 794
    const v3, 0x7f2343ca

    .line 795
    .line 796
    .line 797
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 801
    .line 802
    .line 803
    :goto_c
    instance-of v3, v1, La/p3w;

    .line 804
    .line 805
    if-eqz v3, :cond_1c

    .line 806
    .line 807
    const v3, 0x7f24a4c7

    .line 808
    .line 809
    .line 810
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 811
    .line 812
    .line 813
    move-object/from16 v16, v1

    .line 814
    .line 815
    check-cast v16, La/p3w;

    .line 816
    .line 817
    check-cast v9, La/x77;

    .line 818
    .line 819
    iget-object v1, v9, La/x77;->b:La/w2w;

    .line 820
    .line 821
    iget-boolean v1, v1, La/w2w;->c:Z

    .line 822
    .line 823
    iget-object v0, v0, La/o57;->d:Lkotlin/jvm/functions/Function1;

    .line 824
    .line 825
    const/16 v20, 0x0

    .line 826
    .line 827
    const/4 v15, 0x0

    .line 828
    move-object/from16 v18, v0

    .line 829
    .line 830
    move/from16 v17, v1

    .line 831
    .line 832
    move-object/from16 v19, v2

    .line 833
    .line 834
    invoke-static/range {v15 .. v20}, La/zvw;->h(La/mm40;La/p3w;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 838
    .line 839
    .line 840
    goto :goto_d

    .line 841
    :cond_1c
    const v0, 0x7f2a518a

    .line 842
    .line 843
    .line 844
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 848
    .line 849
    .line 850
    :goto_d
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 851
    .line 852
    .line 853
    goto :goto_e

    .line 854
    :cond_1d
    move-object v2, v15

    .line 855
    invoke-virtual {v2}, La/fet;->X()V

    .line 856
    .line 857
    .line 858
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 859
    .line 860
    return-object v0

    .line 861
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
