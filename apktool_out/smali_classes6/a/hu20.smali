.class public final synthetic La/hu20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uv20;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/uv20;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hu20;->a:B

    iput-object p1, p0, La/hu20;->b:La/uv20;

    iput-object p2, p0, La/hu20;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hu20;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x41e00000    # 28.0f

    .line 8
    .line 9
    const/high16 v4, 0x40c00000    # 6.0f

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/16 v6, 0x92

    .line 13
    .line 14
    const/16 v7, 0x10

    .line 15
    .line 16
    const/16 v8, 0x20

    .line 17
    .line 18
    const/4 v9, 0x2

    .line 19
    const/4 v10, 0x4

    .line 20
    const/4 v11, 0x1

    .line 21
    iget-object v12, v0, La/hu20;->b:La/uv20;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v13, p1

    .line 27
    .line 28
    check-cast v13, La/yhg0;

    .line 29
    .line 30
    move-object/from16 v17, p2

    .line 31
    .line 32
    check-cast v17, La/f07;

    .line 33
    .line 34
    move-object/from16 v1, p3

    .line 35
    .line 36
    check-cast v1, La/fet;

    .line 37
    .line 38
    move-object/from16 v14, p4

    .line 39
    .line 40
    check-cast v14, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v14

    .line 46
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    and-int/lit8 v15, v14, 0x6

    .line 53
    .line 54
    if-nez v15, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v15

    .line 60
    if-eqz v15, :cond_0

    .line 61
    .line 62
    move v9, v10

    .line 63
    :cond_0
    or-int/2addr v9, v14

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move v9, v14

    .line 66
    :goto_0
    and-int/lit8 v10, v14, 0x30

    .line 67
    .line 68
    if-nez v10, :cond_3

    .line 69
    .line 70
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    invoke-virtual {v1, v10}, La/fet;->e(I)Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-eqz v10, :cond_2

    .line 79
    .line 80
    move v7, v8

    .line 81
    :cond_2
    or-int/2addr v9, v7

    .line 82
    :cond_3
    and-int/lit16 v7, v9, 0x93

    .line 83
    .line 84
    if-eq v7, v6, :cond_4

    .line 85
    .line 86
    move v5, v11

    .line 87
    :cond_4
    and-int/lit8 v6, v9, 0x1

    .line 88
    .line 89
    invoke-virtual {v1, v6, v5}, La/fet;->U(IZ)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_7

    .line 94
    .line 95
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 96
    .line 97
    invoke-virtual {v1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 102
    .line 103
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 104
    .line 105
    .line 106
    move-result-wide v6

    .line 107
    sget-object v8, La/qmk;->a:La/zcl;

    .line 108
    .line 109
    const/16 v22, 0x0

    .line 110
    .line 111
    const/16 v23, 0xb

    .line 112
    .line 113
    sget-object v18, La/jm40;->b:La/jm40;

    .line 114
    .line 115
    const/16 v19, 0x0

    .line 116
    .line 117
    const/16 v20, 0x0

    .line 118
    .line 119
    const/high16 v21, 0x40800000    # 4.0f

    .line 120
    .line 121
    invoke-static/range {v18 .. v23}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-static {v8, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v1, v6, v7}, La/fet;->f(J)Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    if-nez v8, :cond_5

    .line 138
    .line 139
    if-ne v10, v2, :cond_6

    .line 140
    .line 141
    :cond_5
    new-instance v10, La/dls;

    .line 142
    .line 143
    const/16 v2, 0x14

    .line 144
    .line 145
    invoke-direct {v10, v2, v6, v7}, La/dls;-><init>(BJ)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_6
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 152
    .line 153
    invoke-static {v3, v10}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-static {v2, v4}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    iget-wide v2, v12, La/uv20;->a:J

    .line 162
    .line 163
    invoke-virtual {v1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 168
    .line 169
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 170
    .line 171
    .line 172
    move-result-wide v18

    .line 173
    and-int/lit8 v4, v9, 0xe

    .line 174
    .line 175
    shl-int/lit8 v5, v9, 0x6

    .line 176
    .line 177
    and-int/lit16 v5, v5, 0x1c00

    .line 178
    .line 179
    or-int v22, v4, v5

    .line 180
    .line 181
    iget-object v0, v0, La/hu20;->c:Lkotlin/jvm/functions/Function1;

    .line 182
    .line 183
    move-object/from16 v20, v0

    .line 184
    .line 185
    move-object/from16 v21, v1

    .line 186
    .line 187
    move-wide v15, v2

    .line 188
    invoke-static/range {v13 .. v22}, La/z1x;->e(La/yhg0;La/mm40;JLa/f07;JLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_7
    move-object/from16 v21, v1

    .line 193
    .line 194
    invoke-virtual/range {v21 .. v21}, La/fet;->X()V

    .line 195
    .line 196
    .line 197
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object v0

    .line 200
    :pswitch_0
    move-object/from16 v1, p1

    .line 201
    .line 202
    check-cast v1, La/yhg0;

    .line 203
    .line 204
    move v13, v5

    .line 205
    move-object/from16 v5, p2

    .line 206
    .line 207
    check-cast v5, La/f07;

    .line 208
    .line 209
    move v14, v9

    .line 210
    move-object/from16 v9, p3

    .line 211
    .line 212
    check-cast v9, La/fet;

    .line 213
    .line 214
    move-object/from16 v2, p4

    .line 215
    .line 216
    check-cast v2, Ljava/lang/Integer;

    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    and-int/lit8 v15, v2, 0x6

    .line 229
    .line 230
    if-nez v15, :cond_9

    .line 231
    .line 232
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v15

    .line 236
    if-eqz v15, :cond_8

    .line 237
    .line 238
    move v14, v10

    .line 239
    :cond_8
    or-int v10, v2, v14

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_9
    move v10, v2

    .line 243
    :goto_2
    and-int/lit8 v2, v2, 0x30

    .line 244
    .line 245
    if-nez v2, :cond_b

    .line 246
    .line 247
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    invoke-virtual {v9, v2}, La/fet;->e(I)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_a

    .line 256
    .line 257
    move v7, v8

    .line 258
    :cond_a
    or-int/2addr v10, v7

    .line 259
    :cond_b
    and-int/lit16 v2, v10, 0x93

    .line 260
    .line 261
    if-eq v2, v6, :cond_c

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_c
    move v11, v13

    .line 265
    :goto_3
    and-int/lit8 v2, v10, 0x1

    .line 266
    .line 267
    invoke-virtual {v9, v2, v11}, La/fet;->U(IZ)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-eqz v2, :cond_d

    .line 272
    .line 273
    sget-object v2, La/qmk;->a:La/zcl;

    .line 274
    .line 275
    const/16 v17, 0x0

    .line 276
    .line 277
    const/16 v18, 0xb

    .line 278
    .line 279
    sget-object v13, La/jm40;->b:La/jm40;

    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    const/4 v15, 0x0

    .line 283
    const/high16 v16, 0x40800000    # 4.0f

    .line 284
    .line 285
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-static {v2, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-static {v2, v4}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    iget-wide v3, v12, La/uv20;->a:J

    .line 298
    .line 299
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 300
    .line 301
    invoke-virtual {v9, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 306
    .line 307
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 308
    .line 309
    .line 310
    move-result-wide v6

    .line 311
    and-int/lit8 v8, v10, 0xe

    .line 312
    .line 313
    shl-int/lit8 v10, v10, 0x6

    .line 314
    .line 315
    and-int/lit16 v10, v10, 0x1c00

    .line 316
    .line 317
    or-int/2addr v10, v8

    .line 318
    iget-object v8, v0, La/hu20;->c:Lkotlin/jvm/functions/Function1;

    .line 319
    .line 320
    invoke-static/range {v1 .. v10}, La/z1x;->e(La/yhg0;La/mm40;JLa/f07;JLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 321
    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_d
    invoke-virtual {v9}, La/fet;->X()V

    .line 325
    .line 326
    .line 327
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_1
    move v13, v5

    .line 331
    move v14, v9

    .line 332
    move-object/from16 v1, p1

    .line 333
    .line 334
    check-cast v1, La/yhg0;

    .line 335
    .line 336
    move-object/from16 v5, p2

    .line 337
    .line 338
    check-cast v5, La/f07;

    .line 339
    .line 340
    move-object/from16 v9, p3

    .line 341
    .line 342
    check-cast v9, La/fet;

    .line 343
    .line 344
    move-object/from16 v2, p4

    .line 345
    .line 346
    check-cast v2, Ljava/lang/Integer;

    .line 347
    .line 348
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    and-int/lit8 v3, v2, 0x6

    .line 359
    .line 360
    if-nez v3, :cond_f

    .line 361
    .line 362
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-eqz v3, :cond_e

    .line 367
    .line 368
    move v14, v10

    .line 369
    :cond_e
    or-int v3, v2, v14

    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_f
    move v3, v2

    .line 373
    :goto_5
    and-int/lit8 v2, v2, 0x30

    .line 374
    .line 375
    if-nez v2, :cond_11

    .line 376
    .line 377
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    invoke-virtual {v9, v2}, La/fet;->e(I)Z

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    if-eqz v2, :cond_10

    .line 386
    .line 387
    move v7, v8

    .line 388
    :cond_10
    or-int/2addr v3, v7

    .line 389
    :cond_11
    and-int/lit16 v2, v3, 0x93

    .line 390
    .line 391
    if-eq v2, v6, :cond_12

    .line 392
    .line 393
    goto :goto_6

    .line 394
    :cond_12
    move v11, v13

    .line 395
    :goto_6
    and-int/lit8 v2, v3, 0x1

    .line 396
    .line 397
    invoke-virtual {v9, v2, v11}, La/fet;->U(IZ)Z

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    if-eqz v2, :cond_13

    .line 402
    .line 403
    sget-object v2, La/qmk;->a:La/zcl;

    .line 404
    .line 405
    const/16 v17, 0x0

    .line 406
    .line 407
    const/16 v18, 0xb

    .line 408
    .line 409
    sget-object v13, La/jm40;->b:La/jm40;

    .line 410
    .line 411
    const/4 v14, 0x0

    .line 412
    const/4 v15, 0x0

    .line 413
    const/high16 v16, 0x41400000    # 12.0f

    .line 414
    .line 415
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    const/high16 v4, 0x41800000    # 16.0f

    .line 420
    .line 421
    invoke-static {v2, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    move v6, v3

    .line 426
    iget-wide v3, v12, La/uv20;->a:J

    .line 427
    .line 428
    sget-object v7, La/zaq0;->b:La/zfn;

    .line 429
    .line 430
    invoke-virtual {v9, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v7

    .line 434
    check-cast v7, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 435
    .line 436
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 437
    .line 438
    .line 439
    move-result-wide v7

    .line 440
    and-int/lit8 v10, v6, 0xe

    .line 441
    .line 442
    shl-int/lit8 v6, v6, 0x6

    .line 443
    .line 444
    and-int/lit16 v6, v6, 0x1c00

    .line 445
    .line 446
    or-int/2addr v10, v6

    .line 447
    move-wide v6, v7

    .line 448
    iget-object v8, v0, La/hu20;->c:Lkotlin/jvm/functions/Function1;

    .line 449
    .line 450
    invoke-static/range {v1 .. v10}, La/z1x;->e(La/yhg0;La/mm40;JLa/f07;JLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 451
    .line 452
    .line 453
    goto :goto_7

    .line 454
    :cond_13
    invoke-virtual {v9}, La/fet;->X()V

    .line 455
    .line 456
    .line 457
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 458
    .line 459
    return-object v0

    .line 460
    :pswitch_2
    move v13, v5

    .line 461
    move v14, v9

    .line 462
    move-object/from16 v1, p1

    .line 463
    .line 464
    check-cast v1, La/yhg0;

    .line 465
    .line 466
    move-object/from16 v5, p2

    .line 467
    .line 468
    check-cast v5, La/f07;

    .line 469
    .line 470
    move-object/from16 v9, p3

    .line 471
    .line 472
    check-cast v9, La/fet;

    .line 473
    .line 474
    move-object/from16 v3, p4

    .line 475
    .line 476
    check-cast v3, Ljava/lang/Integer;

    .line 477
    .line 478
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    and-int/lit8 v15, v3, 0x6

    .line 489
    .line 490
    if-nez v15, :cond_15

    .line 491
    .line 492
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v15

    .line 496
    if-eqz v15, :cond_14

    .line 497
    .line 498
    move v14, v10

    .line 499
    :cond_14
    or-int v10, v3, v14

    .line 500
    .line 501
    goto :goto_8

    .line 502
    :cond_15
    move v10, v3

    .line 503
    :goto_8
    and-int/lit8 v3, v3, 0x30

    .line 504
    .line 505
    if-nez v3, :cond_17

    .line 506
    .line 507
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    invoke-virtual {v9, v3}, La/fet;->e(I)Z

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    if-eqz v3, :cond_16

    .line 516
    .line 517
    move v7, v8

    .line 518
    :cond_16
    or-int/2addr v10, v7

    .line 519
    :cond_17
    and-int/lit16 v3, v10, 0x93

    .line 520
    .line 521
    if-eq v3, v6, :cond_18

    .line 522
    .line 523
    goto :goto_9

    .line 524
    :cond_18
    move v11, v13

    .line 525
    :goto_9
    and-int/lit8 v3, v10, 0x1

    .line 526
    .line 527
    invoke-virtual {v9, v3, v11}, La/fet;->U(IZ)Z

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    if-eqz v3, :cond_1b

    .line 532
    .line 533
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 534
    .line 535
    invoke-virtual {v9, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 540
    .line 541
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 542
    .line 543
    .line 544
    move-result-wide v6

    .line 545
    sget-object v8, La/qmk;->a:La/zcl;

    .line 546
    .line 547
    const/16 v17, 0x0

    .line 548
    .line 549
    const/16 v18, 0xb

    .line 550
    .line 551
    sget-object v13, La/jm40;->b:La/jm40;

    .line 552
    .line 553
    const/4 v14, 0x0

    .line 554
    const/4 v15, 0x0

    .line 555
    const/high16 v16, 0x41000000    # 8.0f

    .line 556
    .line 557
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 558
    .line 559
    .line 560
    move-result-object v8

    .line 561
    const/high16 v11, 0x41f00000    # 30.0f

    .line 562
    .line 563
    invoke-static {v8, v11}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 564
    .line 565
    .line 566
    move-result-object v8

    .line 567
    invoke-virtual {v9, v6, v7}, La/fet;->f(J)Z

    .line 568
    .line 569
    .line 570
    move-result v11

    .line 571
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v13

    .line 575
    if-nez v11, :cond_19

    .line 576
    .line 577
    if-ne v13, v2, :cond_1a

    .line 578
    .line 579
    :cond_19
    new-instance v13, La/dls;

    .line 580
    .line 581
    const/16 v2, 0x12

    .line 582
    .line 583
    invoke-direct {v13, v2, v6, v7}, La/dls;-><init>(BJ)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v9, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    :cond_1a
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 590
    .line 591
    invoke-static {v8, v13}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    invoke-static {v2, v4}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    iget-wide v6, v12, La/uv20;->a:J

    .line 600
    .line 601
    invoke-virtual {v9, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 606
    .line 607
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 608
    .line 609
    .line 610
    move-result-wide v3

    .line 611
    and-int/lit8 v8, v10, 0xe

    .line 612
    .line 613
    shl-int/lit8 v10, v10, 0x6

    .line 614
    .line 615
    and-int/lit16 v10, v10, 0x1c00

    .line 616
    .line 617
    or-int/2addr v10, v8

    .line 618
    iget-object v8, v0, La/hu20;->c:Lkotlin/jvm/functions/Function1;

    .line 619
    .line 620
    move-wide/from16 v24, v6

    .line 621
    .line 622
    move-wide v6, v3

    .line 623
    move-wide/from16 v3, v24

    .line 624
    .line 625
    invoke-static/range {v1 .. v10}, La/z1x;->e(La/yhg0;La/mm40;JLa/f07;JLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 626
    .line 627
    .line 628
    goto :goto_a

    .line 629
    :cond_1b
    invoke-virtual {v9}, La/fet;->X()V

    .line 630
    .line 631
    .line 632
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 633
    .line 634
    return-object v0

    .line 635
    :pswitch_3
    move v13, v5

    .line 636
    move v14, v9

    .line 637
    move-object/from16 v1, p1

    .line 638
    .line 639
    check-cast v1, La/yhg0;

    .line 640
    .line 641
    move-object/from16 v5, p2

    .line 642
    .line 643
    check-cast v5, La/f07;

    .line 644
    .line 645
    move-object/from16 v9, p3

    .line 646
    .line 647
    check-cast v9, La/fet;

    .line 648
    .line 649
    move-object/from16 v2, p4

    .line 650
    .line 651
    check-cast v2, Ljava/lang/Integer;

    .line 652
    .line 653
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    and-int/lit8 v3, v2, 0x6

    .line 664
    .line 665
    if-nez v3, :cond_1d

    .line 666
    .line 667
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    move-result v3

    .line 671
    if-eqz v3, :cond_1c

    .line 672
    .line 673
    move v14, v10

    .line 674
    :cond_1c
    or-int v3, v2, v14

    .line 675
    .line 676
    goto :goto_b

    .line 677
    :cond_1d
    move v3, v2

    .line 678
    :goto_b
    and-int/lit8 v2, v2, 0x30

    .line 679
    .line 680
    if-nez v2, :cond_1f

    .line 681
    .line 682
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 683
    .line 684
    .line 685
    move-result v2

    .line 686
    invoke-virtual {v9, v2}, La/fet;->e(I)Z

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    if-eqz v2, :cond_1e

    .line 691
    .line 692
    move v7, v8

    .line 693
    :cond_1e
    or-int/2addr v3, v7

    .line 694
    :cond_1f
    and-int/lit16 v2, v3, 0x93

    .line 695
    .line 696
    if-eq v2, v6, :cond_20

    .line 697
    .line 698
    goto :goto_c

    .line 699
    :cond_20
    move v11, v13

    .line 700
    :goto_c
    and-int/lit8 v2, v3, 0x1

    .line 701
    .line 702
    invoke-virtual {v9, v2, v11}, La/fet;->U(IZ)Z

    .line 703
    .line 704
    .line 705
    move-result v2

    .line 706
    if-eqz v2, :cond_21

    .line 707
    .line 708
    sget-object v2, La/qmk;->a:La/zcl;

    .line 709
    .line 710
    const/16 v17, 0x0

    .line 711
    .line 712
    const/16 v18, 0xb

    .line 713
    .line 714
    sget-object v13, La/jm40;->b:La/jm40;

    .line 715
    .line 716
    const/4 v14, 0x0

    .line 717
    const/4 v15, 0x0

    .line 718
    const/high16 v16, 0x41400000    # 12.0f

    .line 719
    .line 720
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    const/high16 v4, 0x41a00000    # 20.0f

    .line 725
    .line 726
    invoke-static {v2, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    iget-wide v6, v12, La/uv20;->a:J

    .line 731
    .line 732
    sget-object v4, La/zaq0;->b:La/zfn;

    .line 733
    .line 734
    invoke-virtual {v9, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v4

    .line 738
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 739
    .line 740
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 741
    .line 742
    .line 743
    move-result-wide v10

    .line 744
    and-int/lit8 v4, v3, 0xe

    .line 745
    .line 746
    shl-int/lit8 v3, v3, 0x6

    .line 747
    .line 748
    and-int/lit16 v3, v3, 0x1c00

    .line 749
    .line 750
    or-int/2addr v3, v4

    .line 751
    iget-object v8, v0, La/hu20;->c:Lkotlin/jvm/functions/Function1;

    .line 752
    .line 753
    move-wide/from16 v24, v10

    .line 754
    .line 755
    move v10, v3

    .line 756
    move-wide v3, v6

    .line 757
    move-wide/from16 v6, v24

    .line 758
    .line 759
    invoke-static/range {v1 .. v10}, La/z1x;->e(La/yhg0;La/mm40;JLa/f07;JLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 760
    .line 761
    .line 762
    goto :goto_d

    .line 763
    :cond_21
    invoke-virtual {v9}, La/fet;->X()V

    .line 764
    .line 765
    .line 766
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 767
    .line 768
    return-object v0

    .line 769
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
