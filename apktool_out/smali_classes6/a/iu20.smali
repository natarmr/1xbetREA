.class public final synthetic La/iu20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uv20;

.field public final synthetic c:La/xdr;


# direct methods
.method public synthetic constructor <init>(BLa/xdr;La/uv20;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/iu20;->a:B

    iput-object p3, p0, La/iu20;->b:La/uv20;

    iput-object p2, p0, La/iu20;->c:La/xdr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iu20;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41e00000    # 28.0f

    .line 6
    .line 7
    const/high16 v3, 0x40c00000    # 6.0f

    .line 8
    .line 9
    sget-object v4, La/ukd;->a:La/cl5;

    .line 10
    .line 11
    const/16 v5, 0x12

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    iget-object v10, v0, La/iu20;->b:La/uv20;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v11, p1

    .line 23
    .line 24
    check-cast v11, La/yhg0;

    .line 25
    .line 26
    move-object/from16 v1, p2

    .line 27
    .line 28
    check-cast v1, La/fet;

    .line 29
    .line 30
    move-object/from16 v12, p3

    .line 31
    .line 32
    check-cast v12, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v12

    .line 38
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    and-int/lit8 v13, v12, 0x6

    .line 42
    .line 43
    if-nez v13, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v13

    .line 49
    if-eqz v13, :cond_0

    .line 50
    .line 51
    move v6, v7

    .line 52
    :cond_0
    or-int/2addr v12, v6

    .line 53
    :cond_1
    and-int/lit8 v6, v12, 0x13

    .line 54
    .line 55
    if-eq v6, v5, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move v9, v8

    .line 59
    :goto_0
    and-int/lit8 v5, v12, 0x1

    .line 60
    .line 61
    invoke-virtual {v1, v5, v9}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_6

    .line 66
    .line 67
    iget-boolean v5, v10, La/uv20;->c:Z

    .line 68
    .line 69
    if-eqz v5, :cond_3

    .line 70
    .line 71
    const v5, 0x2c462f7d

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 75
    .line 76
    .line 77
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 78
    .line 79
    invoke-virtual {v1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 84
    .line 85
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 86
    .line 87
    .line 88
    move-result-wide v6

    .line 89
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    const v5, 0x2c4723fa

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 97
    .line 98
    .line 99
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 100
    .line 101
    invoke-virtual {v1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 106
    .line 107
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 108
    .line 109
    .line 110
    move-result-wide v6

    .line 111
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 112
    .line 113
    .line 114
    :goto_1
    sget-object v8, La/qmk;->a:La/zcl;

    .line 115
    .line 116
    const/16 v17, 0x0

    .line 117
    .line 118
    const/16 v18, 0xb

    .line 119
    .line 120
    sget-object v13, La/jm40;->b:La/jm40;

    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const/4 v15, 0x0

    .line 124
    const/high16 v16, 0x40800000    # 4.0f

    .line 125
    .line 126
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-static {v8, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v1, v6, v7}, La/fet;->f(J)Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    if-nez v8, :cond_4

    .line 143
    .line 144
    if-ne v9, v4, :cond_5

    .line 145
    .line 146
    :cond_4
    new-instance v9, La/dls;

    .line 147
    .line 148
    const/16 v4, 0x16

    .line 149
    .line 150
    invoke-direct {v9, v4, v6, v7}, La/dls;-><init>(BJ)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :cond_5
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 157
    .line 158
    invoke-static {v2, v9}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-static {v2, v3}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    iget-wide v13, v10, La/uv20;->a:J

    .line 167
    .line 168
    iget-object v15, v10, La/uv20;->b:Ljava/lang/String;

    .line 169
    .line 170
    iget-boolean v3, v10, La/uv20;->c:Z

    .line 171
    .line 172
    invoke-virtual {v1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 177
    .line 178
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimaryForeground-0d7_KjU()J

    .line 179
    .line 180
    .line 181
    move-result-wide v17

    .line 182
    invoke-virtual {v1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 187
    .line 188
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 189
    .line 190
    .line 191
    move-result-wide v19

    .line 192
    and-int/lit8 v23, v12, 0xe

    .line 193
    .line 194
    iget-object v0, v0, La/iu20;->c:La/xdr;

    .line 195
    .line 196
    move-object/from16 v21, v0

    .line 197
    .line 198
    move-object/from16 v22, v1

    .line 199
    .line 200
    move-object v12, v2

    .line 201
    move/from16 v16, v3

    .line 202
    .line 203
    invoke-static/range {v11 .. v23}, La/c3x;->e(La/yhg0;La/mm40;JLjava/lang/String;ZJJLa/xdr;La/fet;I)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_6
    move-object/from16 v22, v1

    .line 208
    .line 209
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 210
    .line 211
    .line 212
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_0
    move-object/from16 v1, p1

    .line 216
    .line 217
    check-cast v1, La/yhg0;

    .line 218
    .line 219
    move-object/from16 v12, p2

    .line 220
    .line 221
    check-cast v12, La/fet;

    .line 222
    .line 223
    move-object/from16 v11, p3

    .line 224
    .line 225
    check-cast v11, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    and-int/lit8 v13, v11, 0x6

    .line 235
    .line 236
    if-nez v13, :cond_8

    .line 237
    .line 238
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v13

    .line 242
    if-eqz v13, :cond_7

    .line 243
    .line 244
    move v6, v7

    .line 245
    :cond_7
    or-int/2addr v11, v6

    .line 246
    :cond_8
    and-int/lit8 v6, v11, 0x13

    .line 247
    .line 248
    if-eq v6, v5, :cond_9

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_9
    move v9, v8

    .line 252
    :goto_3
    and-int/lit8 v5, v11, 0x1

    .line 253
    .line 254
    invoke-virtual {v12, v5, v9}, La/fet;->U(IZ)Z

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    if-eqz v5, :cond_d

    .line 259
    .line 260
    iget-boolean v5, v10, La/uv20;->c:Z

    .line 261
    .line 262
    if-eqz v5, :cond_a

    .line 263
    .line 264
    const v5, -0x4058c281

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v5}, La/fet;->e0(I)V

    .line 268
    .line 269
    .line 270
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 271
    .line 272
    invoke-virtual {v12, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 277
    .line 278
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 279
    .line 280
    .line 281
    move-result-wide v5

    .line 282
    invoke-virtual {v12, v8}, La/fet;->r(Z)V

    .line 283
    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_a
    const v5, -0x4057cd2b

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v5}, La/fet;->e0(I)V

    .line 290
    .line 291
    .line 292
    sget-object v5, La/m8m0;->a:La/zfn;

    .line 293
    .line 294
    invoke-virtual {v12, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    check-cast v5, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 299
    .line 300
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 301
    .line 302
    .line 303
    move-result-wide v5

    .line 304
    invoke-virtual {v12, v8}, La/fet;->r(Z)V

    .line 305
    .line 306
    .line 307
    :goto_4
    sget-object v7, La/qmk;->a:La/zcl;

    .line 308
    .line 309
    const/16 v17, 0x0

    .line 310
    .line 311
    const/16 v18, 0xb

    .line 312
    .line 313
    sget-object v13, La/jm40;->b:La/jm40;

    .line 314
    .line 315
    const/4 v14, 0x0

    .line 316
    const/4 v15, 0x0

    .line 317
    const/high16 v16, 0x40800000    # 4.0f

    .line 318
    .line 319
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    invoke-static {v7, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-virtual {v12, v5, v6}, La/fet;->f(J)Z

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    if-nez v7, :cond_b

    .line 336
    .line 337
    if-ne v8, v4, :cond_c

    .line 338
    .line 339
    :cond_b
    new-instance v8, La/dls;

    .line 340
    .line 341
    const/16 v4, 0x13

    .line 342
    .line 343
    invoke-direct {v8, v4, v5, v6}, La/dls;-><init>(BJ)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    :cond_c
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 350
    .line 351
    invoke-static {v2, v8}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-static {v2, v3}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    iget-wide v3, v10, La/uv20;->a:J

    .line 360
    .line 361
    iget-object v5, v10, La/uv20;->b:Ljava/lang/String;

    .line 362
    .line 363
    iget-boolean v6, v10, La/uv20;->c:Z

    .line 364
    .line 365
    sget-object v7, La/zaq0;->b:La/zfn;

    .line 366
    .line 367
    invoke-virtual {v12, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v8

    .line 371
    check-cast v8, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 372
    .line 373
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimaryForeground-0d7_KjU()J

    .line 374
    .line 375
    .line 376
    move-result-wide v8

    .line 377
    invoke-virtual {v12, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    check-cast v7, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 382
    .line 383
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 384
    .line 385
    .line 386
    move-result-wide v13

    .line 387
    and-int/lit8 v7, v11, 0xe

    .line 388
    .line 389
    iget-object v11, v0, La/iu20;->c:La/xdr;

    .line 390
    .line 391
    move-wide/from16 v24, v13

    .line 392
    .line 393
    move v13, v7

    .line 394
    move-wide v7, v8

    .line 395
    move-wide/from16 v9, v24

    .line 396
    .line 397
    invoke-static/range {v1 .. v13}, La/c3x;->e(La/yhg0;La/mm40;JLjava/lang/String;ZJJLa/xdr;La/fet;I)V

    .line 398
    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_d
    invoke-virtual {v12}, La/fet;->X()V

    .line 402
    .line 403
    .line 404
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 405
    .line 406
    return-object v0

    .line 407
    :pswitch_1
    move-object/from16 v1, p1

    .line 408
    .line 409
    check-cast v1, La/yhg0;

    .line 410
    .line 411
    move-object/from16 v12, p2

    .line 412
    .line 413
    check-cast v12, La/fet;

    .line 414
    .line 415
    move-object/from16 v2, p3

    .line 416
    .line 417
    check-cast v2, Ljava/lang/Integer;

    .line 418
    .line 419
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    and-int/lit8 v3, v2, 0x6

    .line 427
    .line 428
    if-nez v3, :cond_f

    .line 429
    .line 430
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    if-eqz v3, :cond_e

    .line 435
    .line 436
    move v6, v7

    .line 437
    :cond_e
    or-int/2addr v2, v6

    .line 438
    :cond_f
    and-int/lit8 v3, v2, 0x13

    .line 439
    .line 440
    if-eq v3, v5, :cond_10

    .line 441
    .line 442
    move v8, v9

    .line 443
    :cond_10
    and-int/lit8 v3, v2, 0x1

    .line 444
    .line 445
    invoke-virtual {v12, v3, v8}, La/fet;->U(IZ)Z

    .line 446
    .line 447
    .line 448
    move-result v3

    .line 449
    if-eqz v3, :cond_11

    .line 450
    .line 451
    sget-object v3, La/qmk;->a:La/zcl;

    .line 452
    .line 453
    const/4 v8, 0x0

    .line 454
    const/16 v9, 0xb

    .line 455
    .line 456
    sget-object v4, La/jm40;->b:La/jm40;

    .line 457
    .line 458
    const/4 v5, 0x0

    .line 459
    const/4 v6, 0x0

    .line 460
    const/high16 v7, 0x41400000    # 12.0f

    .line 461
    .line 462
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    const/high16 v4, 0x41800000    # 16.0f

    .line 467
    .line 468
    invoke-static {v3, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    move v5, v2

    .line 473
    move-object v2, v3

    .line 474
    iget-wide v3, v10, La/uv20;->a:J

    .line 475
    .line 476
    move v6, v5

    .line 477
    iget-object v5, v10, La/uv20;->b:Ljava/lang/String;

    .line 478
    .line 479
    move v7, v6

    .line 480
    iget-boolean v6, v10, La/uv20;->c:Z

    .line 481
    .line 482
    sget-object v8, La/zaq0;->b:La/zfn;

    .line 483
    .line 484
    invoke-virtual {v12, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v9

    .line 488
    check-cast v9, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 489
    .line 490
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 491
    .line 492
    .line 493
    move-result-wide v9

    .line 494
    invoke-virtual {v12, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v8

    .line 498
    check-cast v8, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 499
    .line 500
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 501
    .line 502
    .line 503
    move-result-wide v13

    .line 504
    const/high16 v8, 0x3f000000    # 0.5f

    .line 505
    .line 506
    invoke-static {v8, v13, v14}, La/y3d;->c(FJ)J

    .line 507
    .line 508
    .line 509
    move-result-wide v13

    .line 510
    and-int/lit8 v7, v7, 0xe

    .line 511
    .line 512
    iget-object v11, v0, La/iu20;->c:La/xdr;

    .line 513
    .line 514
    move-wide/from16 v24, v13

    .line 515
    .line 516
    move v13, v7

    .line 517
    move-wide v7, v9

    .line 518
    move-wide/from16 v9, v24

    .line 519
    .line 520
    invoke-static/range {v1 .. v13}, La/c3x;->e(La/yhg0;La/mm40;JLjava/lang/String;ZJJLa/xdr;La/fet;I)V

    .line 521
    .line 522
    .line 523
    goto :goto_6

    .line 524
    :cond_11
    invoke-virtual {v12}, La/fet;->X()V

    .line 525
    .line 526
    .line 527
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 528
    .line 529
    return-object v0

    .line 530
    :pswitch_2
    move-object/from16 v1, p1

    .line 531
    .line 532
    check-cast v1, La/yhg0;

    .line 533
    .line 534
    move-object/from16 v12, p2

    .line 535
    .line 536
    check-cast v12, La/fet;

    .line 537
    .line 538
    move-object/from16 v2, p3

    .line 539
    .line 540
    check-cast v2, Ljava/lang/Integer;

    .line 541
    .line 542
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    and-int/lit8 v11, v2, 0x6

    .line 550
    .line 551
    if-nez v11, :cond_13

    .line 552
    .line 553
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v11

    .line 557
    if-eqz v11, :cond_12

    .line 558
    .line 559
    move v6, v7

    .line 560
    :cond_12
    or-int/2addr v2, v6

    .line 561
    :cond_13
    and-int/lit8 v6, v2, 0x13

    .line 562
    .line 563
    if-eq v6, v5, :cond_14

    .line 564
    .line 565
    goto :goto_7

    .line 566
    :cond_14
    move v9, v8

    .line 567
    :goto_7
    and-int/lit8 v5, v2, 0x1

    .line 568
    .line 569
    invoke-virtual {v12, v5, v9}, La/fet;->U(IZ)Z

    .line 570
    .line 571
    .line 572
    move-result v5

    .line 573
    if-eqz v5, :cond_18

    .line 574
    .line 575
    iget-boolean v5, v10, La/uv20;->c:Z

    .line 576
    .line 577
    if-eqz v5, :cond_15

    .line 578
    .line 579
    const v5, -0x67301381

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12, v5}, La/fet;->e0(I)V

    .line 583
    .line 584
    .line 585
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 586
    .line 587
    invoke-virtual {v12, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v6

    .line 591
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 592
    .line 593
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 594
    .line 595
    .line 596
    move-result-wide v6

    .line 597
    invoke-virtual {v12, v8}, La/fet;->r(Z)V

    .line 598
    .line 599
    .line 600
    goto :goto_8

    .line 601
    :cond_15
    const v5, -0x672f1f04

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12, v5}, La/fet;->e0(I)V

    .line 605
    .line 606
    .line 607
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 608
    .line 609
    invoke-virtual {v12, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v6

    .line 613
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 614
    .line 615
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 616
    .line 617
    .line 618
    move-result-wide v6

    .line 619
    invoke-virtual {v12, v8}, La/fet;->r(Z)V

    .line 620
    .line 621
    .line 622
    :goto_8
    sget-object v8, La/qmk;->a:La/zcl;

    .line 623
    .line 624
    const/16 v17, 0x0

    .line 625
    .line 626
    const/16 v18, 0xb

    .line 627
    .line 628
    sget-object v13, La/jm40;->b:La/jm40;

    .line 629
    .line 630
    const/4 v14, 0x0

    .line 631
    const/4 v15, 0x0

    .line 632
    const/high16 v16, 0x41000000    # 8.0f

    .line 633
    .line 634
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 635
    .line 636
    .line 637
    move-result-object v8

    .line 638
    const/high16 v9, 0x41f00000    # 30.0f

    .line 639
    .line 640
    invoke-static {v8, v9}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 641
    .line 642
    .line 643
    move-result-object v8

    .line 644
    invoke-virtual {v12, v6, v7}, La/fet;->f(J)Z

    .line 645
    .line 646
    .line 647
    move-result v9

    .line 648
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v11

    .line 652
    if-nez v9, :cond_16

    .line 653
    .line 654
    if-ne v11, v4, :cond_17

    .line 655
    .line 656
    :cond_16
    new-instance v11, La/dls;

    .line 657
    .line 658
    const/16 v4, 0x11

    .line 659
    .line 660
    invoke-direct {v11, v4, v6, v7}, La/dls;-><init>(BJ)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    :cond_17
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 667
    .line 668
    invoke-static {v8, v11}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    invoke-static {v4, v3}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 673
    .line 674
    .line 675
    move-result-object v3

    .line 676
    move v6, v2

    .line 677
    move-object v2, v3

    .line 678
    iget-wide v3, v10, La/uv20;->a:J

    .line 679
    .line 680
    iget-object v7, v10, La/uv20;->b:Ljava/lang/String;

    .line 681
    .line 682
    move v8, v6

    .line 683
    iget-boolean v6, v10, La/uv20;->c:Z

    .line 684
    .line 685
    invoke-virtual {v12, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v9

    .line 689
    check-cast v9, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 690
    .line 691
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimaryForeground-0d7_KjU()J

    .line 692
    .line 693
    .line 694
    move-result-wide v9

    .line 695
    invoke-virtual {v12, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v5

    .line 699
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 700
    .line 701
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 702
    .line 703
    .line 704
    move-result-wide v13

    .line 705
    and-int/lit8 v5, v8, 0xe

    .line 706
    .line 707
    iget-object v11, v0, La/iu20;->c:La/xdr;

    .line 708
    .line 709
    move-wide/from16 v24, v13

    .line 710
    .line 711
    move v13, v5

    .line 712
    move-object v5, v7

    .line 713
    move-wide v7, v9

    .line 714
    move-wide/from16 v9, v24

    .line 715
    .line 716
    invoke-static/range {v1 .. v13}, La/c3x;->e(La/yhg0;La/mm40;JLjava/lang/String;ZJJLa/xdr;La/fet;I)V

    .line 717
    .line 718
    .line 719
    goto :goto_9

    .line 720
    :cond_18
    invoke-virtual {v12}, La/fet;->X()V

    .line 721
    .line 722
    .line 723
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 724
    .line 725
    return-object v0

    .line 726
    :pswitch_3
    move-object/from16 v1, p1

    .line 727
    .line 728
    check-cast v1, La/yhg0;

    .line 729
    .line 730
    move-object/from16 v12, p2

    .line 731
    .line 732
    check-cast v12, La/fet;

    .line 733
    .line 734
    move-object/from16 v2, p3

    .line 735
    .line 736
    check-cast v2, Ljava/lang/Integer;

    .line 737
    .line 738
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 739
    .line 740
    .line 741
    move-result v2

    .line 742
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    and-int/lit8 v3, v2, 0x6

    .line 746
    .line 747
    if-nez v3, :cond_1a

    .line 748
    .line 749
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v3

    .line 753
    if-eqz v3, :cond_19

    .line 754
    .line 755
    move v6, v7

    .line 756
    :cond_19
    or-int/2addr v2, v6

    .line 757
    :cond_1a
    and-int/lit8 v3, v2, 0x13

    .line 758
    .line 759
    if-eq v3, v5, :cond_1b

    .line 760
    .line 761
    move v8, v9

    .line 762
    :cond_1b
    and-int/lit8 v3, v2, 0x1

    .line 763
    .line 764
    invoke-virtual {v12, v3, v8}, La/fet;->U(IZ)Z

    .line 765
    .line 766
    .line 767
    move-result v3

    .line 768
    if-eqz v3, :cond_1c

    .line 769
    .line 770
    sget-object v3, La/qmk;->a:La/zcl;

    .line 771
    .line 772
    const/4 v8, 0x0

    .line 773
    const/16 v9, 0xb

    .line 774
    .line 775
    sget-object v4, La/jm40;->b:La/jm40;

    .line 776
    .line 777
    const/4 v5, 0x0

    .line 778
    const/4 v6, 0x0

    .line 779
    const/high16 v7, 0x41400000    # 12.0f

    .line 780
    .line 781
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 782
    .line 783
    .line 784
    move-result-object v3

    .line 785
    const/high16 v4, 0x41a00000    # 20.0f

    .line 786
    .line 787
    invoke-static {v3, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 788
    .line 789
    .line 790
    move-result-object v3

    .line 791
    move v5, v2

    .line 792
    move-object v2, v3

    .line 793
    iget-wide v3, v10, La/uv20;->a:J

    .line 794
    .line 795
    move v6, v5

    .line 796
    iget-object v5, v10, La/uv20;->b:Ljava/lang/String;

    .line 797
    .line 798
    iget-boolean v7, v10, La/uv20;->c:Z

    .line 799
    .line 800
    sget-object v8, La/zaq0;->b:La/zfn;

    .line 801
    .line 802
    invoke-virtual {v12, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v9

    .line 806
    check-cast v9, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 807
    .line 808
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 809
    .line 810
    .line 811
    move-result-wide v9

    .line 812
    invoke-virtual {v12, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v8

    .line 816
    check-cast v8, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 817
    .line 818
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary60-0d7_KjU()J

    .line 819
    .line 820
    .line 821
    move-result-wide v13

    .line 822
    and-int/lit8 v6, v6, 0xe

    .line 823
    .line 824
    iget-object v11, v0, La/iu20;->c:La/xdr;

    .line 825
    .line 826
    move-wide/from16 v24, v13

    .line 827
    .line 828
    move v13, v6

    .line 829
    move v6, v7

    .line 830
    move-wide v7, v9

    .line 831
    move-wide/from16 v9, v24

    .line 832
    .line 833
    invoke-static/range {v1 .. v13}, La/c3x;->e(La/yhg0;La/mm40;JLjava/lang/String;ZJJLa/xdr;La/fet;I)V

    .line 834
    .line 835
    .line 836
    goto :goto_a

    .line 837
    :cond_1c
    invoke-virtual {v12}, La/fet;->X()V

    .line 838
    .line 839
    .line 840
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 841
    .line 842
    return-object v0

    .line 843
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
