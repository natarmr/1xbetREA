.class public final synthetic La/f6b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:La/w6b;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(JLa/w6b;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/f6b;->a:B

    iput-wide p1, p0, La/f6b;->b:J

    iput-object p3, p0, La/f6b;->c:La/w6b;

    iput-object p4, p0, La/f6b;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/f6b;->a:B

    .line 4
    .line 5
    const/16 v2, 0x492

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    const/high16 v9, 0x41000000    # 8.0f

    .line 9
    .line 10
    sget-object v10, La/jm40;->b:La/jm40;

    .line 11
    .line 12
    sget-object v11, La/ukd;->a:La/cl5;

    .line 13
    .line 14
    iget-object v12, v0, La/f6b;->d:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    iget-object v13, v0, La/f6b;->c:La/w6b;

    .line 17
    .line 18
    iget-wide v14, v0, La/f6b;->b:J

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    const/4 v5, 0x2

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, La/m3b;

    .line 28
    .line 29
    move-object/from16 v2, p2

    .line 30
    .line 31
    check-cast v2, La/a4x;

    .line 32
    .line 33
    move-object/from16 v6, p3

    .line 34
    .line 35
    check-cast v6, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-object/from16 v6, p4

    .line 41
    .line 42
    check-cast v6, La/fet;

    .line 43
    .line 44
    move-object/from16 v7, p5

    .line 45
    .line 46
    check-cast v7, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    and-int/lit8 v2, v7, 0x6

    .line 59
    .line 60
    if-nez v2, :cond_1

    .line 61
    .line 62
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    move v2, v3

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move v2, v5

    .line 71
    :goto_0
    or-int/2addr v7, v2

    .line 72
    :cond_1
    and-int/lit16 v2, v7, 0x403

    .line 73
    .line 74
    const/16 p0, 0x1

    .line 75
    .line 76
    const/16 v0, 0x402

    .line 77
    .line 78
    if-eq v2, v0, :cond_2

    .line 79
    .line 80
    move/from16 v0, p0

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    const/4 v0, 0x0

    .line 84
    :goto_1
    and-int/lit8 v2, v7, 0x1

    .line 85
    .line 86
    invoke-virtual {v6, v2, v0}, La/fet;->U(IZ)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_9

    .line 91
    .line 92
    sget-object v0, La/jd8;->n:La/ljc;

    .line 93
    .line 94
    invoke-static {v10, v14, v15, v0}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v2, La/qmk;->a:La/zcl;

    .line 99
    .line 100
    invoke-static {v0, v9, v8, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object v16

    .line 104
    iget-object v0, v1, La/m3b;->a:La/d4n;

    .line 105
    .line 106
    invoke-interface {v13}, La/w6b;->a()Z

    .line 107
    .line 108
    .line 109
    move-result v18

    .line 110
    invoke-virtual {v6, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    and-int/lit8 v5, v7, 0xe

    .line 115
    .line 116
    if-ne v5, v3, :cond_3

    .line 117
    .line 118
    move/from16 v7, p0

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    const/4 v7, 0x0

    .line 122
    :goto_2
    or-int/2addr v2, v7

    .line 123
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    if-nez v2, :cond_4

    .line 128
    .line 129
    if-ne v7, v11, :cond_5

    .line 130
    .line 131
    :cond_4
    new-instance v7, La/h6b;

    .line 132
    .line 133
    invoke-direct {v7, v12, v1, v3}, La/h6b;-><init>(Lkotlin/jvm/functions/Function1;La/m3b;B)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    move-object/from16 v19, v7

    .line 140
    .line 141
    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 142
    .line 143
    invoke-virtual {v6, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-ne v5, v3, :cond_6

    .line 148
    .line 149
    move/from16 v4, p0

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_6
    const/4 v4, 0x0

    .line 153
    :goto_3
    or-int/2addr v2, v4

    .line 154
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    if-nez v2, :cond_7

    .line 159
    .line 160
    if-ne v3, v11, :cond_8

    .line 161
    .line 162
    :cond_7
    new-instance v3, La/h6b;

    .line 163
    .line 164
    const/4 v2, 0x5

    .line 165
    invoke-direct {v3, v12, v1, v2}, La/h6b;-><init>(Lkotlin/jvm/functions/Function1;La/m3b;B)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v6, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_8
    move-object/from16 v20, v3

    .line 172
    .line 173
    check-cast v20, Lkotlin/jvm/functions/Function1;

    .line 174
    .line 175
    const/16 v22, 0x0

    .line 176
    .line 177
    const/16 v23, 0x0

    .line 178
    .line 179
    move-object/from16 v17, v0

    .line 180
    .line 181
    move-object/from16 v21, v6

    .line 182
    .line 183
    invoke-static/range {v16 .. v23}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_9
    move-object/from16 v21, v6

    .line 188
    .line 189
    invoke-virtual/range {v21 .. v21}, La/fet;->X()V

    .line 190
    .line 191
    .line 192
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object v0

    .line 195
    :pswitch_0
    const/16 p0, 0x1

    .line 196
    .line 197
    move-object/from16 v0, p1

    .line 198
    .line 199
    check-cast v0, La/m3b;

    .line 200
    .line 201
    move-object/from16 v1, p2

    .line 202
    .line 203
    check-cast v1, La/a4x;

    .line 204
    .line 205
    move-object/from16 v19, p3

    .line 206
    .line 207
    check-cast v19, Ljava/lang/Integer;

    .line 208
    .line 209
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    move-object/from16 v7, p4

    .line 214
    .line 215
    check-cast v7, La/fet;

    .line 216
    .line 217
    move-object/from16 v21, p5

    .line 218
    .line 219
    check-cast v21, Ljava/lang/Integer;

    .line 220
    .line 221
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Integer;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    and-int/lit8 v21, v8, 0x6

    .line 232
    .line 233
    if-nez v21, :cond_b

    .line 234
    .line 235
    invoke-virtual {v7, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v21

    .line 239
    if-eqz v21, :cond_a

    .line 240
    .line 241
    move/from16 v21, v3

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_a
    move/from16 v21, v5

    .line 245
    .line 246
    :goto_5
    or-int v21, v8, v21

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_b
    move/from16 v21, v8

    .line 250
    .line 251
    :goto_6
    and-int/lit8 v23, v8, 0x30

    .line 252
    .line 253
    if-nez v23, :cond_d

    .line 254
    .line 255
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v23

    .line 259
    if-eqz v23, :cond_c

    .line 260
    .line 261
    const/16 v18, 0x20

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_c
    const/16 v18, 0x10

    .line 265
    .line 266
    :goto_7
    or-int v21, v21, v18

    .line 267
    .line 268
    :cond_d
    and-int/lit16 v8, v8, 0x180

    .line 269
    .line 270
    if-nez v8, :cond_f

    .line 271
    .line 272
    invoke-virtual {v7, v6}, La/fet;->e(I)Z

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    if-eqz v8, :cond_e

    .line 277
    .line 278
    const/16 v16, 0x100

    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_e
    const/16 v16, 0x80

    .line 282
    .line 283
    :goto_8
    or-int v21, v21, v16

    .line 284
    .line 285
    :cond_f
    move/from16 v8, v21

    .line 286
    .line 287
    and-int/lit16 v4, v8, 0x493

    .line 288
    .line 289
    if-eq v4, v2, :cond_10

    .line 290
    .line 291
    move/from16 v2, p0

    .line 292
    .line 293
    goto :goto_9

    .line 294
    :cond_10
    const/4 v2, 0x0

    .line 295
    :goto_9
    and-int/lit8 v4, v8, 0x1

    .line 296
    .line 297
    invoke-virtual {v7, v4, v2}, La/fet;->U(IZ)Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-eqz v2, :cond_1c

    .line 302
    .line 303
    add-int/lit8 v2, v6, 0x1

    .line 304
    .line 305
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    check-cast v4, La/y2b;

    .line 310
    .line 311
    instance-of v4, v4, La/d4b;

    .line 312
    .line 313
    if-eqz v4, :cond_11

    .line 314
    .line 315
    sget-object v4, La/qmk;->a:La/zcl;

    .line 316
    .line 317
    sget-object v5, La/qmk;->i:La/zcl;

    .line 318
    .line 319
    invoke-static {v4, v4, v5, v5, v10}, La/dw9;->i(La/zcl;La/zcl;La/zcl;La/zcl;La/jm40;)La/mm40;

    .line 320
    .line 321
    .line 322
    move-result-object v10

    .line 323
    :cond_11
    sget-object v4, La/jd8;->n:La/ljc;

    .line 324
    .line 325
    invoke-static {v10, v14, v15, v4}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    add-int/lit8 v6, v6, -0x1

    .line 330
    .line 331
    invoke-static {v6, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v5

    .line 335
    check-cast v5, La/y2b;

    .line 336
    .line 337
    instance-of v5, v5, La/x5b;

    .line 338
    .line 339
    if-eqz v5, :cond_12

    .line 340
    .line 341
    sget-object v5, La/qmk;->a:La/zcl;

    .line 342
    .line 343
    const/high16 v5, 0x40000000    # 2.0f

    .line 344
    .line 345
    goto :goto_a

    .line 346
    :cond_12
    sget-object v5, La/qmk;->a:La/zcl;

    .line 347
    .line 348
    const/4 v5, 0x0

    .line 349
    :goto_a
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    check-cast v1, La/y2b;

    .line 354
    .line 355
    if-nez v1, :cond_13

    .line 356
    .line 357
    goto :goto_c

    .line 358
    :cond_13
    instance-of v2, v1, La/x5b;

    .line 359
    .line 360
    if-eqz v2, :cond_14

    .line 361
    .line 362
    :goto_b
    const/high16 v1, 0x40000000    # 2.0f

    .line 363
    .line 364
    goto :goto_d

    .line 365
    :cond_14
    instance-of v1, v1, La/d4b;

    .line 366
    .line 367
    if-eqz v1, :cond_15

    .line 368
    .line 369
    goto :goto_b

    .line 370
    :cond_15
    :goto_c
    const/4 v1, 0x0

    .line 371
    :goto_d
    invoke-static {v4, v9, v5, v9, v1}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    iget-object v2, v0, La/m3b;->a:La/d4n;

    .line 376
    .line 377
    const/4 v4, 0x2

    .line 378
    invoke-interface {v13}, La/w6b;->a()Z

    .line 379
    .line 380
    .line 381
    move-result v23

    .line 382
    invoke-virtual {v7, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    and-int/lit8 v6, v8, 0xe

    .line 387
    .line 388
    if-ne v6, v3, :cond_16

    .line 389
    .line 390
    move/from16 v8, p0

    .line 391
    .line 392
    goto :goto_e

    .line 393
    :cond_16
    const/4 v8, 0x0

    .line 394
    :goto_e
    or-int/2addr v5, v8

    .line 395
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    if-nez v5, :cond_17

    .line 400
    .line 401
    if-ne v8, v11, :cond_18

    .line 402
    .line 403
    :cond_17
    new-instance v8, La/h6b;

    .line 404
    .line 405
    const/4 v5, 0x3

    .line 406
    invoke-direct {v8, v12, v0, v5}, La/h6b;-><init>(Lkotlin/jvm/functions/Function1;La/m3b;B)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v7, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    :cond_18
    move-object/from16 v24, v8

    .line 413
    .line 414
    check-cast v24, Lkotlin/jvm/functions/Function1;

    .line 415
    .line 416
    invoke-virtual {v7, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    if-ne v6, v3, :cond_19

    .line 421
    .line 422
    move/from16 v21, p0

    .line 423
    .line 424
    goto :goto_f

    .line 425
    :cond_19
    const/16 v21, 0x0

    .line 426
    .line 427
    :goto_f
    or-int v3, v5, v21

    .line 428
    .line 429
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    if-nez v3, :cond_1a

    .line 434
    .line 435
    if-ne v5, v11, :cond_1b

    .line 436
    .line 437
    :cond_1a
    new-instance v5, La/h6b;

    .line 438
    .line 439
    invoke-direct {v5, v12, v0, v4}, La/h6b;-><init>(Lkotlin/jvm/functions/Function1;La/m3b;B)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    :cond_1b
    move-object/from16 v25, v5

    .line 446
    .line 447
    check-cast v25, Lkotlin/jvm/functions/Function1;

    .line 448
    .line 449
    const/16 v27, 0x0

    .line 450
    .line 451
    const/16 v28, 0x0

    .line 452
    .line 453
    move-object/from16 v21, v1

    .line 454
    .line 455
    move-object/from16 v22, v2

    .line 456
    .line 457
    move-object/from16 v26, v7

    .line 458
    .line 459
    invoke-static/range {v21 .. v28}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 460
    .line 461
    .line 462
    goto :goto_10

    .line 463
    :cond_1c
    move-object/from16 v26, v7

    .line 464
    .line 465
    invoke-virtual/range {v26 .. v26}, La/fet;->X()V

    .line 466
    .line 467
    .line 468
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 469
    .line 470
    return-object v0

    .line 471
    :pswitch_1
    move v4, v5

    .line 472
    const/16 p0, 0x1

    .line 473
    .line 474
    move-object/from16 v0, p1

    .line 475
    .line 476
    check-cast v0, La/m3b;

    .line 477
    .line 478
    move-object/from16 v1, p2

    .line 479
    .line 480
    check-cast v1, La/a4x;

    .line 481
    .line 482
    move-object/from16 v5, p3

    .line 483
    .line 484
    check-cast v5, Ljava/lang/Integer;

    .line 485
    .line 486
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 487
    .line 488
    .line 489
    move-result v5

    .line 490
    move-object/from16 v6, p4

    .line 491
    .line 492
    check-cast v6, La/fet;

    .line 493
    .line 494
    move-object/from16 v7, p5

    .line 495
    .line 496
    check-cast v7, Ljava/lang/Integer;

    .line 497
    .line 498
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 499
    .line 500
    .line 501
    move-result v7

    .line 502
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    and-int/lit8 v8, v7, 0x6

    .line 509
    .line 510
    if-nez v8, :cond_1e

    .line 511
    .line 512
    invoke-virtual {v6, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    move-result v8

    .line 516
    if-eqz v8, :cond_1d

    .line 517
    .line 518
    move v4, v3

    .line 519
    :cond_1d
    or-int/2addr v4, v7

    .line 520
    goto :goto_11

    .line 521
    :cond_1e
    move v4, v7

    .line 522
    :goto_11
    and-int/lit8 v8, v7, 0x30

    .line 523
    .line 524
    if-nez v8, :cond_20

    .line 525
    .line 526
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v8

    .line 530
    if-eqz v8, :cond_1f

    .line 531
    .line 532
    const/16 v18, 0x20

    .line 533
    .line 534
    goto :goto_12

    .line 535
    :cond_1f
    const/16 v18, 0x10

    .line 536
    .line 537
    :goto_12
    or-int v4, v4, v18

    .line 538
    .line 539
    :cond_20
    and-int/lit16 v7, v7, 0x180

    .line 540
    .line 541
    if-nez v7, :cond_22

    .line 542
    .line 543
    invoke-virtual {v6, v5}, La/fet;->e(I)Z

    .line 544
    .line 545
    .line 546
    move-result v7

    .line 547
    if-eqz v7, :cond_21

    .line 548
    .line 549
    const/16 v16, 0x100

    .line 550
    .line 551
    goto :goto_13

    .line 552
    :cond_21
    const/16 v16, 0x80

    .line 553
    .line 554
    :goto_13
    or-int v4, v4, v16

    .line 555
    .line 556
    :cond_22
    and-int/lit16 v7, v4, 0x493

    .line 557
    .line 558
    if-eq v7, v2, :cond_23

    .line 559
    .line 560
    move/from16 v2, p0

    .line 561
    .line 562
    goto :goto_14

    .line 563
    :cond_23
    const/4 v2, 0x0

    .line 564
    :goto_14
    and-int/lit8 v7, v4, 0x1

    .line 565
    .line 566
    invoke-virtual {v6, v7, v2}, La/fet;->U(IZ)Z

    .line 567
    .line 568
    .line 569
    move-result v2

    .line 570
    if-eqz v2, :cond_31

    .line 571
    .line 572
    sget-object v2, La/jd8;->n:La/ljc;

    .line 573
    .line 574
    invoke-static {v10, v14, v15, v2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 575
    .line 576
    .line 577
    move-result-object v23

    .line 578
    add-int/lit8 v2, v5, -0x1

    .line 579
    .line 580
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    check-cast v2, La/y2b;

    .line 585
    .line 586
    if-nez v2, :cond_24

    .line 587
    .line 588
    goto :goto_15

    .line 589
    :cond_24
    instance-of v7, v2, La/m3b;

    .line 590
    .line 591
    if-eqz v7, :cond_25

    .line 592
    .line 593
    sget-object v2, La/qmk;->a:La/zcl;

    .line 594
    .line 595
    const/high16 v2, 0x40c00000    # 6.0f

    .line 596
    .line 597
    move/from16 v25, v2

    .line 598
    .line 599
    goto :goto_16

    .line 600
    :cond_25
    instance-of v2, v2, La/x5b;

    .line 601
    .line 602
    if-eqz v2, :cond_26

    .line 603
    .line 604
    sget-object v2, La/qmk;->a:La/zcl;

    .line 605
    .line 606
    move/from16 v25, v9

    .line 607
    .line 608
    goto :goto_16

    .line 609
    :cond_26
    :goto_15
    sget-object v2, La/qmk;->a:La/zcl;

    .line 610
    .line 611
    const/16 v25, 0x0

    .line 612
    .line 613
    :goto_16
    add-int/lit8 v5, v5, 0x1

    .line 614
    .line 615
    invoke-static {v5, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    check-cast v1, La/y2b;

    .line 620
    .line 621
    if-nez v1, :cond_27

    .line 622
    .line 623
    goto :goto_17

    .line 624
    :cond_27
    instance-of v2, v1, La/m3b;

    .line 625
    .line 626
    if-eqz v2, :cond_28

    .line 627
    .line 628
    const/high16 v27, 0x40000000    # 2.0f

    .line 629
    .line 630
    goto :goto_18

    .line 631
    :cond_28
    instance-of v2, v1, La/x5b;

    .line 632
    .line 633
    if-eqz v2, :cond_29

    .line 634
    .line 635
    const/high16 v7, 0x41400000    # 12.0f

    .line 636
    .line 637
    move/from16 v27, v7

    .line 638
    .line 639
    goto :goto_18

    .line 640
    :cond_29
    instance-of v1, v1, La/d4b;

    .line 641
    .line 642
    if-eqz v1, :cond_2a

    .line 643
    .line 644
    move/from16 v27, v9

    .line 645
    .line 646
    goto :goto_18

    .line 647
    :cond_2a
    :goto_17
    const/16 v27, 0x0

    .line 648
    .line 649
    :goto_18
    const/16 v28, 0x5

    .line 650
    .line 651
    const/16 v24, 0x0

    .line 652
    .line 653
    const/16 v26, 0x0

    .line 654
    .line 655
    invoke-static/range {v23 .. v28}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 656
    .line 657
    .line 658
    move-result-object v23

    .line 659
    iget-object v1, v0, La/m3b;->a:La/d4n;

    .line 660
    .line 661
    invoke-interface {v13}, La/w6b;->a()Z

    .line 662
    .line 663
    .line 664
    move-result v25

    .line 665
    invoke-virtual {v6, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v2

    .line 669
    and-int/lit8 v4, v4, 0xe

    .line 670
    .line 671
    if-ne v4, v3, :cond_2b

    .line 672
    .line 673
    move/from16 v5, p0

    .line 674
    .line 675
    goto :goto_19

    .line 676
    :cond_2b
    const/4 v5, 0x0

    .line 677
    :goto_19
    or-int/2addr v2, v5

    .line 678
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    if-nez v2, :cond_2d

    .line 683
    .line 684
    if-ne v5, v11, :cond_2c

    .line 685
    .line 686
    goto :goto_1a

    .line 687
    :cond_2c
    const/4 v2, 0x0

    .line 688
    goto :goto_1b

    .line 689
    :cond_2d
    :goto_1a
    new-instance v5, La/h6b;

    .line 690
    .line 691
    const/4 v2, 0x0

    .line 692
    invoke-direct {v5, v12, v0, v2}, La/h6b;-><init>(Lkotlin/jvm/functions/Function1;La/m3b;B)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v6, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    :goto_1b
    move-object/from16 v26, v5

    .line 699
    .line 700
    check-cast v26, Lkotlin/jvm/functions/Function1;

    .line 701
    .line 702
    invoke-virtual {v6, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v5

    .line 706
    if-ne v4, v3, :cond_2e

    .line 707
    .line 708
    move/from16 v4, p0

    .line 709
    .line 710
    goto :goto_1c

    .line 711
    :cond_2e
    move v4, v2

    .line 712
    :goto_1c
    or-int v2, v5, v4

    .line 713
    .line 714
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v3

    .line 718
    if-nez v2, :cond_2f

    .line 719
    .line 720
    if-ne v3, v11, :cond_30

    .line 721
    .line 722
    :cond_2f
    new-instance v3, La/h6b;

    .line 723
    .line 724
    move/from16 v2, p0

    .line 725
    .line 726
    invoke-direct {v3, v12, v0, v2}, La/h6b;-><init>(Lkotlin/jvm/functions/Function1;La/m3b;B)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v6, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    :cond_30
    move-object/from16 v27, v3

    .line 733
    .line 734
    check-cast v27, Lkotlin/jvm/functions/Function1;

    .line 735
    .line 736
    const/16 v29, 0x0

    .line 737
    .line 738
    const/16 v30, 0x0

    .line 739
    .line 740
    move-object/from16 v24, v1

    .line 741
    .line 742
    move-object/from16 v28, v6

    .line 743
    .line 744
    invoke-static/range {v23 .. v30}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 745
    .line 746
    .line 747
    goto :goto_1d

    .line 748
    :cond_31
    move-object/from16 v28, v6

    .line 749
    .line 750
    invoke-virtual/range {v28 .. v28}, La/fet;->X()V

    .line 751
    .line 752
    .line 753
    :goto_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 754
    .line 755
    return-object v0

    .line 756
    nop

    .line 757
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
