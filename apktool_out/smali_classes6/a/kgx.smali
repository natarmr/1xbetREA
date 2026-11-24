.class public final synthetic La/kgx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/kgx;->a:B

    iput-wide p1, p0, La/kgx;->b:J

    iput-object p3, p0, La/kgx;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/kgx;->d:Lkotlin/jvm/functions/Function1;

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
    iget-byte v1, v0, La/kgx;->a:B

    .line 4
    .line 5
    const/16 v2, 0x410

    .line 6
    .line 7
    const/16 v5, 0x492

    .line 8
    .line 9
    const/high16 v10, 0x41000000    # 8.0f

    .line 10
    .line 11
    const/4 v11, 0x0

    .line 12
    sget-object v12, La/jm40;->b:La/jm40;

    .line 13
    .line 14
    const/4 v13, 0x0

    .line 15
    const/16 v14, 0x10

    .line 16
    .line 17
    const/16 v15, 0x20

    .line 18
    .line 19
    const/16 v16, 0x1

    .line 20
    .line 21
    iget-wide v3, v0, La/kgx;->b:J

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/fv20;

    .line 29
    .line 30
    move-object/from16 v5, p2

    .line 31
    .line 32
    check-cast v5, La/d4n;

    .line 33
    .line 34
    move-object/from16 v6, p3

    .line 35
    .line 36
    check-cast v6, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-object/from16 v6, p4

    .line 42
    .line 43
    check-cast v6, La/fet;

    .line 44
    .line 45
    move-object/from16 v7, p5

    .line 46
    .line 47
    check-cast v7, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    and-int/lit8 v1, v7, 0x30

    .line 60
    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    invoke-virtual {v6, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    move v14, v15

    .line 70
    :cond_0
    or-int/2addr v7, v14

    .line 71
    :cond_1
    and-int/lit16 v1, v7, 0x411

    .line 72
    .line 73
    if-eq v1, v2, :cond_2

    .line 74
    .line 75
    move/from16 v13, v16

    .line 76
    .line 77
    :cond_2
    and-int/lit8 v1, v7, 0x1

    .line 78
    .line 79
    invoke-virtual {v6, v1, v13}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    sget-object v1, La/jd8;->n:La/ljc;

    .line 86
    .line 87
    invoke-static {v12, v3, v4, v1}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    sget-object v1, La/qmk;->a:La/zcl;

    .line 92
    .line 93
    const/16 v17, 0x0

    .line 94
    .line 95
    const/16 v18, 0xa

    .line 96
    .line 97
    const/high16 v14, 0x41000000    # 8.0f

    .line 98
    .line 99
    const/4 v15, 0x0

    .line 100
    const/high16 v16, 0x41000000    # 8.0f

    .line 101
    .line 102
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 103
    .line 104
    .line 105
    move-result-object v17

    .line 106
    sget-object v1, La/kr00;->a:La/zfn;

    .line 107
    .line 108
    invoke-virtual {v6, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result v19

    .line 118
    and-int/lit8 v23, v7, 0x70

    .line 119
    .line 120
    const/16 v24, 0x0

    .line 121
    .line 122
    iget-object v1, v0, La/kgx;->c:Lkotlin/jvm/functions/Function1;

    .line 123
    .line 124
    iget-object v0, v0, La/kgx;->d:Lkotlin/jvm/functions/Function1;

    .line 125
    .line 126
    move-object/from16 v21, v0

    .line 127
    .line 128
    move-object/from16 v20, v1

    .line 129
    .line 130
    move-object/from16 v18, v5

    .line 131
    .line 132
    move-object/from16 v22, v6

    .line 133
    .line 134
    invoke-static/range {v17 .. v24}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    move-object/from16 v22, v6

    .line 139
    .line 140
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 141
    .line 142
    .line 143
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object v0

    .line 146
    :pswitch_0
    move-object/from16 v1, p1

    .line 147
    .line 148
    check-cast v1, La/fv20;

    .line 149
    .line 150
    move-object/from16 v2, p2

    .line 151
    .line 152
    check-cast v2, La/d4n;

    .line 153
    .line 154
    move-object/from16 v19, p3

    .line 155
    .line 156
    check-cast v19, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    move-object/from16 v7, p4

    .line 163
    .line 164
    check-cast v7, La/fet;

    .line 165
    .line 166
    move-object/from16 v21, p5

    .line 167
    .line 168
    check-cast v21, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    and-int/lit8 v21, v8, 0x6

    .line 181
    .line 182
    if-nez v21, :cond_5

    .line 183
    .line 184
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v21

    .line 188
    if-eqz v21, :cond_4

    .line 189
    .line 190
    const/16 v22, 0x4

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_4
    const/16 v22, 0x2

    .line 194
    .line 195
    :goto_1
    or-int v9, v8, v22

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    move v9, v8

    .line 199
    :goto_2
    and-int/lit8 v21, v8, 0x30

    .line 200
    .line 201
    if-nez v21, :cond_7

    .line 202
    .line 203
    invoke-virtual {v7, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v21

    .line 207
    if-eqz v21, :cond_6

    .line 208
    .line 209
    move v14, v15

    .line 210
    :cond_6
    or-int/2addr v9, v14

    .line 211
    :cond_7
    and-int/lit16 v8, v8, 0x180

    .line 212
    .line 213
    if-nez v8, :cond_9

    .line 214
    .line 215
    invoke-virtual {v7, v6}, La/fet;->e(I)Z

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    if-eqz v8, :cond_8

    .line 220
    .line 221
    const/16 v19, 0x100

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_8
    const/16 v19, 0x80

    .line 225
    .line 226
    :goto_3
    or-int v9, v9, v19

    .line 227
    .line 228
    :cond_9
    and-int/lit16 v8, v9, 0x493

    .line 229
    .line 230
    if-eq v8, v5, :cond_a

    .line 231
    .line 232
    move/from16 v13, v16

    .line 233
    .line 234
    :cond_a
    and-int/lit8 v5, v9, 0x1

    .line 235
    .line 236
    invoke-virtual {v7, v5, v13}, La/fet;->U(IZ)Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-eqz v5, :cond_d

    .line 241
    .line 242
    sget-object v5, La/jd8;->n:La/ljc;

    .line 243
    .line 244
    invoke-static {v12, v3, v4, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    sget-object v4, La/qmk;->a:La/zcl;

    .line 249
    .line 250
    if-nez v6, :cond_b

    .line 251
    .line 252
    const/high16 v4, 0x40c00000    # 6.0f

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_b
    move v4, v11

    .line 256
    :goto_4
    iget-object v1, v1, La/fv20;->b:La/a4x;

    .line 257
    .line 258
    invoke-static {v1}, La/q3d;->i(Ljava/util/List;)I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-ne v6, v1, :cond_c

    .line 263
    .line 264
    const/high16 v11, 0x40000000    # 2.0f

    .line 265
    .line 266
    :cond_c
    invoke-static {v3, v10, v4, v10, v11}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 267
    .line 268
    .line 269
    move-result-object v19

    .line 270
    sget-object v1, La/kr00;->a:La/zfn;

    .line 271
    .line 272
    invoke-virtual {v7, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    check-cast v1, Ljava/lang/Boolean;

    .line 277
    .line 278
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 279
    .line 280
    .line 281
    move-result v21

    .line 282
    and-int/lit8 v25, v9, 0x70

    .line 283
    .line 284
    const/16 v26, 0x0

    .line 285
    .line 286
    iget-object v1, v0, La/kgx;->c:Lkotlin/jvm/functions/Function1;

    .line 287
    .line 288
    iget-object v0, v0, La/kgx;->d:Lkotlin/jvm/functions/Function1;

    .line 289
    .line 290
    move-object/from16 v23, v0

    .line 291
    .line 292
    move-object/from16 v22, v1

    .line 293
    .line 294
    move-object/from16 v20, v2

    .line 295
    .line 296
    move-object/from16 v24, v7

    .line 297
    .line 298
    invoke-static/range {v19 .. v26}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 299
    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_d
    move-object/from16 v24, v7

    .line 303
    .line 304
    invoke-virtual/range {v24 .. v24}, La/fet;->X()V

    .line 305
    .line 306
    .line 307
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object v0

    .line 310
    :pswitch_1
    move-object/from16 v1, p1

    .line 311
    .line 312
    check-cast v1, La/fv20;

    .line 313
    .line 314
    move-object/from16 v2, p2

    .line 315
    .line 316
    check-cast v2, La/d4n;

    .line 317
    .line 318
    move-object/from16 v6, p3

    .line 319
    .line 320
    check-cast v6, Ljava/lang/Integer;

    .line 321
    .line 322
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    move-object/from16 v7, p4

    .line 327
    .line 328
    check-cast v7, La/fet;

    .line 329
    .line 330
    move-object/from16 v8, p5

    .line 331
    .line 332
    check-cast v8, Ljava/lang/Integer;

    .line 333
    .line 334
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result v8

    .line 338
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    iget-object v9, v1, La/fv20;->b:La/a4x;

    .line 342
    .line 343
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    and-int/lit8 v17, v8, 0x6

    .line 347
    .line 348
    if-nez v17, :cond_f

    .line 349
    .line 350
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_e

    .line 355
    .line 356
    const/16 v21, 0x4

    .line 357
    .line 358
    goto :goto_6

    .line 359
    :cond_e
    const/16 v21, 0x2

    .line 360
    .line 361
    :goto_6
    or-int v1, v8, v21

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_f
    move v1, v8

    .line 365
    :goto_7
    and-int/lit8 v17, v8, 0x30

    .line 366
    .line 367
    if-nez v17, :cond_11

    .line 368
    .line 369
    invoke-virtual {v7, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v17

    .line 373
    if-eqz v17, :cond_10

    .line 374
    .line 375
    move v14, v15

    .line 376
    :cond_10
    or-int/2addr v1, v14

    .line 377
    :cond_11
    and-int/lit16 v8, v8, 0x180

    .line 378
    .line 379
    if-nez v8, :cond_13

    .line 380
    .line 381
    invoke-virtual {v7, v6}, La/fet;->e(I)Z

    .line 382
    .line 383
    .line 384
    move-result v8

    .line 385
    if-eqz v8, :cond_12

    .line 386
    .line 387
    const/16 v19, 0x100

    .line 388
    .line 389
    goto :goto_8

    .line 390
    :cond_12
    const/16 v19, 0x80

    .line 391
    .line 392
    :goto_8
    or-int v1, v1, v19

    .line 393
    .line 394
    :cond_13
    and-int/lit16 v8, v1, 0x493

    .line 395
    .line 396
    if-eq v8, v5, :cond_14

    .line 397
    .line 398
    move/from16 v13, v16

    .line 399
    .line 400
    :cond_14
    and-int/lit8 v5, v1, 0x1

    .line 401
    .line 402
    invoke-virtual {v7, v5, v13}, La/fet;->U(IZ)Z

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    if-eqz v5, :cond_17

    .line 407
    .line 408
    invoke-static {v9}, La/q3d;->i(Ljava/util/List;)I

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    if-ne v6, v5, :cond_15

    .line 413
    .line 414
    sget-object v5, La/qmk;->a:La/zcl;

    .line 415
    .line 416
    sget-object v8, La/qmk;->i:La/zcl;

    .line 417
    .line 418
    invoke-static {v5, v5, v8, v8, v12}, La/dw9;->i(La/zcl;La/zcl;La/zcl;La/zcl;La/jm40;)La/mm40;

    .line 419
    .line 420
    .line 421
    move-result-object v12

    .line 422
    :cond_15
    sget-object v5, La/jd8;->n:La/ljc;

    .line 423
    .line 424
    invoke-static {v12, v3, v4, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    sget-object v4, La/qmk;->a:La/zcl;

    .line 429
    .line 430
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 431
    .line 432
    .line 433
    move-result v4

    .line 434
    add-int/lit8 v4, v4, -0x1

    .line 435
    .line 436
    if-ne v6, v4, :cond_16

    .line 437
    .line 438
    const/high16 v4, 0x40000000    # 2.0f

    .line 439
    .line 440
    goto :goto_9

    .line 441
    :cond_16
    move v4, v11

    .line 442
    :goto_9
    invoke-static {v3, v10, v11, v10, v4}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 443
    .line 444
    .line 445
    move-result-object v23

    .line 446
    sget-object v3, La/kr00;->a:La/zfn;

    .line 447
    .line 448
    invoke-virtual {v7, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    check-cast v3, Ljava/lang/Boolean;

    .line 453
    .line 454
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 455
    .line 456
    .line 457
    move-result v25

    .line 458
    and-int/lit8 v29, v1, 0x70

    .line 459
    .line 460
    const/16 v30, 0x0

    .line 461
    .line 462
    iget-object v1, v0, La/kgx;->c:Lkotlin/jvm/functions/Function1;

    .line 463
    .line 464
    iget-object v0, v0, La/kgx;->d:Lkotlin/jvm/functions/Function1;

    .line 465
    .line 466
    move-object/from16 v27, v0

    .line 467
    .line 468
    move-object/from16 v26, v1

    .line 469
    .line 470
    move-object/from16 v24, v2

    .line 471
    .line 472
    move-object/from16 v28, v7

    .line 473
    .line 474
    invoke-static/range {v23 .. v30}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 475
    .line 476
    .line 477
    goto :goto_a

    .line 478
    :cond_17
    move-object/from16 v28, v7

    .line 479
    .line 480
    invoke-virtual/range {v28 .. v28}, La/fet;->X()V

    .line 481
    .line 482
    .line 483
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 484
    .line 485
    return-object v0

    .line 486
    :pswitch_2
    move-object/from16 v1, p1

    .line 487
    .line 488
    check-cast v1, La/zgx;

    .line 489
    .line 490
    move-object/from16 v5, p2

    .line 491
    .line 492
    check-cast v5, La/d4n;

    .line 493
    .line 494
    move-object/from16 v6, p3

    .line 495
    .line 496
    check-cast v6, Ljava/lang/Integer;

    .line 497
    .line 498
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    move-object/from16 v6, p4

    .line 502
    .line 503
    check-cast v6, La/fet;

    .line 504
    .line 505
    move-object/from16 v7, p5

    .line 506
    .line 507
    check-cast v7, Ljava/lang/Integer;

    .line 508
    .line 509
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 510
    .line 511
    .line 512
    move-result v7

    .line 513
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    and-int/lit8 v1, v7, 0x30

    .line 520
    .line 521
    if-nez v1, :cond_19

    .line 522
    .line 523
    invoke-virtual {v6, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v1

    .line 527
    if-eqz v1, :cond_18

    .line 528
    .line 529
    move v14, v15

    .line 530
    :cond_18
    or-int/2addr v7, v14

    .line 531
    :cond_19
    and-int/lit16 v1, v7, 0x411

    .line 532
    .line 533
    if-eq v1, v2, :cond_1a

    .line 534
    .line 535
    move/from16 v13, v16

    .line 536
    .line 537
    :cond_1a
    and-int/lit8 v1, v7, 0x1

    .line 538
    .line 539
    invoke-virtual {v6, v1, v13}, La/fet;->U(IZ)Z

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    if-eqz v1, :cond_1b

    .line 544
    .line 545
    sget-object v1, La/jd8;->n:La/ljc;

    .line 546
    .line 547
    invoke-static {v12, v3, v4, v1}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 548
    .line 549
    .line 550
    move-result-object v13

    .line 551
    sget-object v1, La/qmk;->a:La/zcl;

    .line 552
    .line 553
    const/16 v17, 0x0

    .line 554
    .line 555
    const/16 v18, 0xa

    .line 556
    .line 557
    const/high16 v14, 0x41000000    # 8.0f

    .line 558
    .line 559
    const/4 v15, 0x0

    .line 560
    const/high16 v16, 0x41000000    # 8.0f

    .line 561
    .line 562
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 563
    .line 564
    .line 565
    move-result-object v17

    .line 566
    sget-object v1, La/kr00;->a:La/zfn;

    .line 567
    .line 568
    invoke-virtual {v6, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    check-cast v1, Ljava/lang/Boolean;

    .line 573
    .line 574
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 575
    .line 576
    .line 577
    move-result v19

    .line 578
    and-int/lit8 v23, v7, 0x70

    .line 579
    .line 580
    const/16 v24, 0x0

    .line 581
    .line 582
    iget-object v1, v0, La/kgx;->c:Lkotlin/jvm/functions/Function1;

    .line 583
    .line 584
    iget-object v0, v0, La/kgx;->d:Lkotlin/jvm/functions/Function1;

    .line 585
    .line 586
    move-object/from16 v21, v0

    .line 587
    .line 588
    move-object/from16 v20, v1

    .line 589
    .line 590
    move-object/from16 v18, v5

    .line 591
    .line 592
    move-object/from16 v22, v6

    .line 593
    .line 594
    invoke-static/range {v17 .. v24}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 595
    .line 596
    .line 597
    goto :goto_b

    .line 598
    :cond_1b
    move-object/from16 v22, v6

    .line 599
    .line 600
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 601
    .line 602
    .line 603
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 604
    .line 605
    return-object v0

    .line 606
    :pswitch_3
    move-object/from16 v1, p1

    .line 607
    .line 608
    check-cast v1, La/zgx;

    .line 609
    .line 610
    move-object/from16 v2, p2

    .line 611
    .line 612
    check-cast v2, La/d4n;

    .line 613
    .line 614
    move-object/from16 v6, p3

    .line 615
    .line 616
    check-cast v6, Ljava/lang/Integer;

    .line 617
    .line 618
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 619
    .line 620
    .line 621
    move-result v6

    .line 622
    move-object/from16 v7, p4

    .line 623
    .line 624
    check-cast v7, La/fet;

    .line 625
    .line 626
    move-object/from16 v8, p5

    .line 627
    .line 628
    check-cast v8, Ljava/lang/Integer;

    .line 629
    .line 630
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 631
    .line 632
    .line 633
    move-result v8

    .line 634
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    and-int/lit8 v9, v8, 0x6

    .line 641
    .line 642
    if-nez v9, :cond_1d

    .line 643
    .line 644
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    move-result v9

    .line 648
    if-eqz v9, :cond_1c

    .line 649
    .line 650
    const/16 v21, 0x4

    .line 651
    .line 652
    goto :goto_c

    .line 653
    :cond_1c
    const/16 v21, 0x2

    .line 654
    .line 655
    :goto_c
    or-int v9, v8, v21

    .line 656
    .line 657
    goto :goto_d

    .line 658
    :cond_1d
    move v9, v8

    .line 659
    :goto_d
    and-int/lit8 v21, v8, 0x30

    .line 660
    .line 661
    if-nez v21, :cond_1f

    .line 662
    .line 663
    invoke-virtual {v7, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result v21

    .line 667
    if-eqz v21, :cond_1e

    .line 668
    .line 669
    move v14, v15

    .line 670
    :cond_1e
    or-int/2addr v9, v14

    .line 671
    :cond_1f
    and-int/lit16 v8, v8, 0x180

    .line 672
    .line 673
    if-nez v8, :cond_21

    .line 674
    .line 675
    invoke-virtual {v7, v6}, La/fet;->e(I)Z

    .line 676
    .line 677
    .line 678
    move-result v8

    .line 679
    if-eqz v8, :cond_20

    .line 680
    .line 681
    const/16 v19, 0x100

    .line 682
    .line 683
    goto :goto_e

    .line 684
    :cond_20
    const/16 v19, 0x80

    .line 685
    .line 686
    :goto_e
    or-int v9, v9, v19

    .line 687
    .line 688
    :cond_21
    and-int/lit16 v8, v9, 0x493

    .line 689
    .line 690
    if-eq v8, v5, :cond_22

    .line 691
    .line 692
    move/from16 v13, v16

    .line 693
    .line 694
    :cond_22
    and-int/lit8 v5, v9, 0x1

    .line 695
    .line 696
    invoke-virtual {v7, v5, v13}, La/fet;->U(IZ)Z

    .line 697
    .line 698
    .line 699
    move-result v5

    .line 700
    if-eqz v5, :cond_25

    .line 701
    .line 702
    sget-object v5, La/jd8;->n:La/ljc;

    .line 703
    .line 704
    invoke-static {v12, v3, v4, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 705
    .line 706
    .line 707
    move-result-object v3

    .line 708
    sget-object v4, La/qmk;->a:La/zcl;

    .line 709
    .line 710
    if-nez v6, :cond_23

    .line 711
    .line 712
    const/high16 v4, 0x40c00000    # 6.0f

    .line 713
    .line 714
    goto :goto_f

    .line 715
    :cond_23
    move v4, v11

    .line 716
    :goto_f
    iget-object v1, v1, La/zgx;->b:La/a4x;

    .line 717
    .line 718
    invoke-static {v1}, La/q3d;->i(Ljava/util/List;)I

    .line 719
    .line 720
    .line 721
    move-result v1

    .line 722
    if-ne v6, v1, :cond_24

    .line 723
    .line 724
    const/high16 v11, 0x40000000    # 2.0f

    .line 725
    .line 726
    :cond_24
    invoke-static {v3, v10, v4, v10, v11}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 727
    .line 728
    .line 729
    move-result-object v23

    .line 730
    sget-object v1, La/kr00;->a:La/zfn;

    .line 731
    .line 732
    invoke-virtual {v7, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    check-cast v1, Ljava/lang/Boolean;

    .line 737
    .line 738
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 739
    .line 740
    .line 741
    move-result v25

    .line 742
    and-int/lit8 v29, v9, 0x70

    .line 743
    .line 744
    const/16 v30, 0x0

    .line 745
    .line 746
    iget-object v1, v0, La/kgx;->c:Lkotlin/jvm/functions/Function1;

    .line 747
    .line 748
    iget-object v0, v0, La/kgx;->d:Lkotlin/jvm/functions/Function1;

    .line 749
    .line 750
    move-object/from16 v27, v0

    .line 751
    .line 752
    move-object/from16 v26, v1

    .line 753
    .line 754
    move-object/from16 v24, v2

    .line 755
    .line 756
    move-object/from16 v28, v7

    .line 757
    .line 758
    invoke-static/range {v23 .. v30}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 759
    .line 760
    .line 761
    goto :goto_10

    .line 762
    :cond_25
    move-object/from16 v28, v7

    .line 763
    .line 764
    invoke-virtual/range {v28 .. v28}, La/fet;->X()V

    .line 765
    .line 766
    .line 767
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 768
    .line 769
    return-object v0

    .line 770
    :pswitch_4
    move-object/from16 v1, p1

    .line 771
    .line 772
    check-cast v1, La/zgx;

    .line 773
    .line 774
    move-object/from16 v2, p2

    .line 775
    .line 776
    check-cast v2, La/d4n;

    .line 777
    .line 778
    move-object/from16 v6, p3

    .line 779
    .line 780
    check-cast v6, Ljava/lang/Integer;

    .line 781
    .line 782
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 783
    .line 784
    .line 785
    move-result v6

    .line 786
    move-object/from16 v7, p4

    .line 787
    .line 788
    check-cast v7, La/fet;

    .line 789
    .line 790
    move-object/from16 v8, p5

    .line 791
    .line 792
    check-cast v8, Ljava/lang/Integer;

    .line 793
    .line 794
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 795
    .line 796
    .line 797
    move-result v8

    .line 798
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 799
    .line 800
    .line 801
    iget-object v9, v1, La/zgx;->b:La/a4x;

    .line 802
    .line 803
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 804
    .line 805
    .line 806
    and-int/lit8 v23, v8, 0x6

    .line 807
    .line 808
    if-nez v23, :cond_27

    .line 809
    .line 810
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    move-result v1

    .line 814
    if-eqz v1, :cond_26

    .line 815
    .line 816
    const/16 v21, 0x4

    .line 817
    .line 818
    goto :goto_11

    .line 819
    :cond_26
    const/16 v21, 0x2

    .line 820
    .line 821
    :goto_11
    or-int v1, v8, v21

    .line 822
    .line 823
    goto :goto_12

    .line 824
    :cond_27
    move v1, v8

    .line 825
    :goto_12
    and-int/lit8 v21, v8, 0x30

    .line 826
    .line 827
    if-nez v21, :cond_29

    .line 828
    .line 829
    invoke-virtual {v7, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    move-result v21

    .line 833
    if-eqz v21, :cond_28

    .line 834
    .line 835
    move v14, v15

    .line 836
    :cond_28
    or-int/2addr v1, v14

    .line 837
    :cond_29
    and-int/lit16 v8, v8, 0x180

    .line 838
    .line 839
    if-nez v8, :cond_2b

    .line 840
    .line 841
    invoke-virtual {v7, v6}, La/fet;->e(I)Z

    .line 842
    .line 843
    .line 844
    move-result v8

    .line 845
    if-eqz v8, :cond_2a

    .line 846
    .line 847
    const/16 v19, 0x100

    .line 848
    .line 849
    goto :goto_13

    .line 850
    :cond_2a
    const/16 v19, 0x80

    .line 851
    .line 852
    :goto_13
    or-int v1, v1, v19

    .line 853
    .line 854
    :cond_2b
    and-int/lit16 v8, v1, 0x493

    .line 855
    .line 856
    if-eq v8, v5, :cond_2c

    .line 857
    .line 858
    move/from16 v13, v16

    .line 859
    .line 860
    :cond_2c
    and-int/lit8 v5, v1, 0x1

    .line 861
    .line 862
    invoke-virtual {v7, v5, v13}, La/fet;->U(IZ)Z

    .line 863
    .line 864
    .line 865
    move-result v5

    .line 866
    if-eqz v5, :cond_30

    .line 867
    .line 868
    invoke-static {v9}, La/q3d;->i(Ljava/util/List;)I

    .line 869
    .line 870
    .line 871
    move-result v5

    .line 872
    if-ne v6, v5, :cond_2d

    .line 873
    .line 874
    sget-object v5, La/qmk;->a:La/zcl;

    .line 875
    .line 876
    sget-object v8, La/qmk;->i:La/zcl;

    .line 877
    .line 878
    invoke-static {v5, v5, v8, v8, v12}, La/dw9;->i(La/zcl;La/zcl;La/zcl;La/zcl;La/jm40;)La/mm40;

    .line 879
    .line 880
    .line 881
    move-result-object v12

    .line 882
    :cond_2d
    sget-object v5, La/jd8;->n:La/ljc;

    .line 883
    .line 884
    invoke-static {v12, v3, v4, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    sget-object v4, La/qmk;->a:La/zcl;

    .line 889
    .line 890
    if-nez v6, :cond_2e

    .line 891
    .line 892
    const/high16 v4, 0x40c00000    # 6.0f

    .line 893
    .line 894
    goto :goto_14

    .line 895
    :cond_2e
    move v4, v11

    .line 896
    :goto_14
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 897
    .line 898
    .line 899
    move-result v5

    .line 900
    add-int/lit8 v5, v5, -0x1

    .line 901
    .line 902
    if-ne v6, v5, :cond_2f

    .line 903
    .line 904
    const/high16 v11, 0x40000000    # 2.0f

    .line 905
    .line 906
    :cond_2f
    invoke-static {v3, v10, v4, v10, v11}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 907
    .line 908
    .line 909
    move-result-object v23

    .line 910
    sget-object v3, La/kr00;->a:La/zfn;

    .line 911
    .line 912
    invoke-virtual {v7, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v3

    .line 916
    check-cast v3, Ljava/lang/Boolean;

    .line 917
    .line 918
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 919
    .line 920
    .line 921
    move-result v25

    .line 922
    and-int/lit8 v29, v1, 0x70

    .line 923
    .line 924
    const/16 v30, 0x0

    .line 925
    .line 926
    iget-object v1, v0, La/kgx;->c:Lkotlin/jvm/functions/Function1;

    .line 927
    .line 928
    iget-object v0, v0, La/kgx;->d:Lkotlin/jvm/functions/Function1;

    .line 929
    .line 930
    move-object/from16 v27, v0

    .line 931
    .line 932
    move-object/from16 v26, v1

    .line 933
    .line 934
    move-object/from16 v24, v2

    .line 935
    .line 936
    move-object/from16 v28, v7

    .line 937
    .line 938
    invoke-static/range {v23 .. v30}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 939
    .line 940
    .line 941
    goto :goto_15

    .line 942
    :cond_30
    move-object/from16 v28, v7

    .line 943
    .line 944
    invoke-virtual/range {v28 .. v28}, La/fet;->X()V

    .line 945
    .line 946
    .line 947
    :goto_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 948
    .line 949
    return-object v0

    .line 950
    nop

    .line 951
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
