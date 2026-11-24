.class public final synthetic La/w5t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a6t0;


# direct methods
.method public synthetic constructor <init>(La/a6t0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w5t0;->a:B

    iput-object p1, p0, La/w5t0;->b:La/a6t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/w5t0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/w5t0;->b:La/a6t0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, La/k0w0;

    .line 14
    .line 15
    iget-object v3, v0, La/a6t0;->B:La/qgh;

    .line 16
    .line 17
    sget-object v5, La/sip;->b:La/sip;

    .line 18
    .line 19
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, La/s5t0;

    .line 24
    .line 25
    iget-object v4, v4, La/s5t0;->j:La/ypl0;

    .line 26
    .line 27
    iget-object v11, v4, La/ypl0;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, La/s5t0;

    .line 34
    .line 35
    iget-object v4, v4, La/s5t0;->i:Ljava/util/List;

    .line 36
    .line 37
    new-instance v12, Ljava/util/ArrayList;

    .line 38
    .line 39
    const/16 v6, 0xa

    .line 40
    .line 41
    invoke-static {v4, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-direct {v12, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_0

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    check-cast v6, La/t9m0;

    .line 63
    .line 64
    iget-short v6, v6, La/t9m0;->a:S

    .line 65
    .line 66
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, La/s5t0;

    .line 79
    .line 80
    iget-object v4, v4, La/s5t0;->i:Ljava/util/List;

    .line 81
    .line 82
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    check-cast v6, La/s5t0;

    .line 87
    .line 88
    iget-object v6, v6, La/s5t0;->f:Ljava/util/List;

    .line 89
    .line 90
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, La/s5t0;

    .line 95
    .line 96
    iget-object v7, v7, La/s5t0;->c:La/i6t0;

    .line 97
    .line 98
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    check-cast v8, La/s5t0;

    .line 103
    .line 104
    iget-object v8, v8, La/s5t0;->d:La/rsp;

    .line 105
    .line 106
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, La/s5t0;

    .line 111
    .line 112
    iget-object v0, v0, La/s5t0;->e:La/lov;

    .line 113
    .line 114
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    new-instance v10, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v13

    .line 134
    if-eqz v13, :cond_4

    .line 135
    .line 136
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    check-cast v13, La/t9m0;

    .line 141
    .line 142
    sget-object v15, La/vnb0;->c:La/c0o;

    .line 143
    .line 144
    invoke-virtual {v15}, La/b3;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    :cond_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v16

    .line 152
    if-eqz v16, :cond_3

    .line 153
    .line 154
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v16

    .line 158
    move-object/from16 v14, v16

    .line 159
    .line 160
    check-cast v14, La/vnb0;

    .line 161
    .line 162
    iget-object v14, v14, La/vnb0;->a:La/t9m0;

    .line 163
    .line 164
    if-ne v14, v13, :cond_2

    .line 165
    .line 166
    move-object/from16 v14, v16

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_3
    const/4 v14, 0x0

    .line 170
    :goto_2
    check-cast v14, La/vnb0;

    .line 171
    .line 172
    if-eqz v14, :cond_1

    .line 173
    .line 174
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_4
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-eqz v10, :cond_19

    .line 187
    .line 188
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    check-cast v10, La/vnb0;

    .line 193
    .line 194
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    iget-object v10, v10, La/vnb0;->a:La/t9m0;

    .line 199
    .line 200
    iget-short v10, v10, La/t9m0;->a:S

    .line 201
    .line 202
    if-eqz v13, :cond_16

    .line 203
    .line 204
    const/4 v14, 0x1

    .line 205
    if-eq v13, v14, :cond_12

    .line 206
    .line 207
    const/4 v15, 0x2

    .line 208
    if-eq v13, v15, :cond_10

    .line 209
    .line 210
    const/4 v14, 0x3

    .line 211
    if-ne v13, v14, :cond_f

    .line 212
    .line 213
    if-eqz v0, :cond_e

    .line 214
    .line 215
    iget-object v13, v0, La/lov;->e:Ljava/util/List;

    .line 216
    .line 217
    if-eqz v13, :cond_5

    .line 218
    .line 219
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 220
    .line 221
    .line 222
    move-result v14

    .line 223
    if-eqz v14, :cond_5

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_5
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v13

    .line 230
    :cond_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v14

    .line 234
    if-eqz v14, :cond_7

    .line 235
    .line 236
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v14

    .line 240
    check-cast v14, La/n4t0;

    .line 241
    .line 242
    invoke-static {v14}, La/bww;->P(La/n4t0;)Z

    .line 243
    .line 244
    .line 245
    move-result v14

    .line 246
    if-eqz v14, :cond_6

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_7
    :goto_4
    iget-object v13, v0, La/lov;->f:Ljava/util/List;

    .line 250
    .line 251
    if-eqz v13, :cond_8

    .line 252
    .line 253
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 254
    .line 255
    .line 256
    move-result v14

    .line 257
    if-eqz v14, :cond_8

    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_8
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    :cond_9
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v14

    .line 268
    if-eqz v14, :cond_a

    .line 269
    .line 270
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v14

    .line 274
    check-cast v14, La/n4t0;

    .line 275
    .line 276
    invoke-static {v14}, La/bww;->P(La/n4t0;)Z

    .line 277
    .line 278
    .line 279
    move-result v14

    .line 280
    if-eqz v14, :cond_9

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_a
    :goto_5
    iget-object v13, v0, La/lov;->g:Ljava/util/List;

    .line 284
    .line 285
    if-eqz v13, :cond_b

    .line 286
    .line 287
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 288
    .line 289
    .line 290
    move-result v14

    .line 291
    if-eqz v14, :cond_b

    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_b
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object v13

    .line 298
    :cond_c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v14

    .line 302
    if-eqz v14, :cond_e

    .line 303
    .line 304
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v14

    .line 308
    check-cast v14, La/n4t0;

    .line 309
    .line 310
    invoke-static {v14}, La/bww;->P(La/n4t0;)Z

    .line 311
    .line 312
    .line 313
    move-result v14

    .line 314
    if-eqz v14, :cond_c

    .line 315
    .line 316
    :cond_d
    :goto_6
    move-object/from16 v16, v3

    .line 317
    .line 318
    goto/16 :goto_a

    .line 319
    .line 320
    :cond_e
    :goto_7
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v10

    .line 324
    invoke-virtual {v9, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    goto :goto_6

    .line 328
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 329
    .line 330
    .line 331
    const/4 v14, 0x0

    .line 332
    goto/16 :goto_b

    .line 333
    .line 334
    :cond_10
    invoke-static {v2, v6}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    check-cast v13, La/mxp;

    .line 339
    .line 340
    invoke-static {v14, v6}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v14

    .line 344
    check-cast v14, La/mxp;

    .line 345
    .line 346
    if-eqz v13, :cond_11

    .line 347
    .line 348
    if-eqz v14, :cond_11

    .line 349
    .line 350
    invoke-static {v13, v14}, La/tdc;->h0(La/mxp;La/mxp;)Z

    .line 351
    .line 352
    .line 353
    move-result v15

    .line 354
    if-nez v15, :cond_d

    .line 355
    .line 356
    invoke-static {v13, v14}, La/tdc;->a0(La/mxp;La/mxp;)Z

    .line 357
    .line 358
    .line 359
    move-result v15

    .line 360
    if-nez v15, :cond_d

    .line 361
    .line 362
    invoke-static {v13, v14}, La/tdc;->S(La/mxp;La/mxp;)Z

    .line 363
    .line 364
    .line 365
    move-result v13

    .line 366
    if-nez v13, :cond_d

    .line 367
    .line 368
    :cond_11
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v10

    .line 372
    invoke-virtual {v9, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_12
    if-eqz v7, :cond_14

    .line 377
    .line 378
    iget-wide v13, v7, La/i6t0;->a:J

    .line 379
    .line 380
    move-object/from16 v16, v3

    .line 381
    .line 382
    iget-wide v2, v7, La/i6t0;->b:J

    .line 383
    .line 384
    invoke-static {v8, v13, v14}, La/b8k0;->A(La/rsp;J)La/nsp;

    .line 385
    .line 386
    .line 387
    move-result-object v13

    .line 388
    invoke-static {v8, v2, v3}, La/b8k0;->A(La/rsp;J)La/nsp;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    if-eqz v13, :cond_13

    .line 393
    .line 394
    if-eqz v2, :cond_13

    .line 395
    .line 396
    iget-object v3, v13, La/nsp;->a:La/jup;

    .line 397
    .line 398
    iget-object v14, v2, La/nsp;->a:La/jup;

    .line 399
    .line 400
    invoke-static {v3, v14}, La/b8k0;->P(La/jup;La/jup;)Z

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    if-eqz v3, :cond_13

    .line 405
    .line 406
    new-instance v3, Lkotlin/Pair;

    .line 407
    .line 408
    invoke-direct {v3, v13, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_13
    const/4 v3, 0x0

    .line 413
    :goto_8
    if-eqz v3, :cond_15

    .line 414
    .line 415
    goto :goto_a

    .line 416
    :cond_14
    move-object/from16 v16, v3

    .line 417
    .line 418
    :cond_15
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-virtual {v9, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_16
    move-object/from16 v16, v3

    .line 427
    .line 428
    if-eqz v7, :cond_18

    .line 429
    .line 430
    iget-wide v2, v7, La/i6t0;->a:J

    .line 431
    .line 432
    iget-wide v13, v7, La/i6t0;->b:J

    .line 433
    .line 434
    invoke-static {v8, v2, v3}, La/jwb;->D(La/rsp;J)La/nsp;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-static {v8, v13, v14}, La/jwb;->D(La/rsp;J)La/nsp;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    if-eqz v2, :cond_17

    .line 443
    .line 444
    if-eqz v3, :cond_17

    .line 445
    .line 446
    iget-object v13, v2, La/nsp;->a:La/jup;

    .line 447
    .line 448
    iget-object v14, v3, La/nsp;->a:La/jup;

    .line 449
    .line 450
    invoke-static {v13, v14}, La/jwb;->Q(La/jup;La/jup;)Z

    .line 451
    .line 452
    .line 453
    move-result v13

    .line 454
    if-eqz v13, :cond_17

    .line 455
    .line 456
    new-instance v13, Lkotlin/Pair;

    .line 457
    .line 458
    invoke-direct {v13, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    goto :goto_9

    .line 462
    :cond_17
    const/4 v13, 0x0

    .line 463
    :goto_9
    if-eqz v13, :cond_18

    .line 464
    .line 465
    goto :goto_a

    .line 466
    :cond_18
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    invoke-virtual {v9, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    :goto_a
    move-object/from16 v3, v16

    .line 474
    .line 475
    const/4 v2, 0x0

    .line 476
    goto/16 :goto_3

    .line 477
    .line 478
    :cond_19
    move-object/from16 v16, v3

    .line 479
    .line 480
    invoke-static {v9}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 481
    .line 482
    .line 483
    move-result-object v13

    .line 484
    sget-object v6, La/dam0;->b:La/dam0;

    .line 485
    .line 486
    new-instance v4, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 487
    .line 488
    const-wide/16 v7, 0xbd

    .line 489
    .line 490
    const-wide/16 v9, -0x1

    .line 491
    .line 492
    invoke-direct/range {v4 .. v13}, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;-><init>(La/sip;La/dam0;JJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    new-instance v0, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;

    .line 499
    .line 500
    invoke-direct {v0, v4}, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;-><init>(Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 504
    .line 505
    .line 506
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 507
    .line 508
    :goto_b
    return-object v14

    .line 509
    :pswitch_0
    move-object/from16 v1, p1

    .line 510
    .line 511
    check-cast v1, Ljava/lang/Integer;

    .line 512
    .line 513
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    new-instance v2, La/r5t0;

    .line 518
    .line 519
    iget-object v3, v0, La/a6t0;->v:La/ctf0;

    .line 520
    .line 521
    const/4 v15, 0x0

    .line 522
    new-array v4, v15, [Ljava/lang/Object;

    .line 523
    .line 524
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 525
    .line 526
    invoke-static {v4, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v4

    .line 530
    invoke-virtual {v3, v1, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    invoke-direct {v2, v1}, La/r5t0;-><init>(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 541
    .line 542
    return-object v0

    .line 543
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
