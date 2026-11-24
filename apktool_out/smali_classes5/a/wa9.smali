.class public final synthetic La/wa9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xa9;


# direct methods
.method public synthetic constructor <init>(La/xa9;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wa9;->a:B

    iput-object p1, p0, La/wa9;->b:La/xa9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wa9;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v0, v0, La/wa9;->b:La/xa9;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/wdn;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    if-ne v1, v3, :cond_1

    .line 27
    .line 28
    iget-object v0, v0, La/xa9;->c:La/n0o0;

    .line 29
    .line 30
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/fee;

    .line 35
    .line 36
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/util/Collection;

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v3, 0x0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 52
    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget-object v0, v0, La/xa9;->b:La/n0o0;

    .line 57
    .line 58
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, La/fee;

    .line 63
    .line 64
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/util/Collection;

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_0

    .line 75
    .line 76
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    :goto_1
    return-object v5

    .line 81
    :pswitch_0
    move-object/from16 v1, p1

    .line 82
    .line 83
    check-cast v1, La/wdn;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v6, v0, La/xa9;->e:La/n0o0;

    .line 89
    .line 90
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    check-cast v6, La/fee;

    .line 95
    .line 96
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    check-cast v6, Ljava/util/List;

    .line 101
    .line 102
    iget-object v7, v0, La/xa9;->b:La/n0o0;

    .line 103
    .line 104
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    check-cast v7, La/fee;

    .line 109
    .line 110
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    check-cast v7, Ljava/util/List;

    .line 115
    .line 116
    iget-object v8, v0, La/xa9;->c:La/n0o0;

    .line 117
    .line 118
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    check-cast v8, La/fee;

    .line 123
    .line 124
    invoke-virtual {v8}, La/fee;->c()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    check-cast v8, Ljava/util/List;

    .line 129
    .line 130
    iget-object v0, v0, La/xa9;->f:La/n0o0;

    .line 131
    .line 132
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, La/fee;

    .line 137
    .line 138
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, La/l9s;

    .line 143
    .line 144
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    if-eqz v0, :cond_3

    .line 151
    .line 152
    invoke-interface {v0}, La/l9s;->j()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    goto :goto_2

    .line 157
    :cond_3
    const/4 v9, 0x0

    .line 158
    :goto_2
    if-nez v9, :cond_4

    .line 159
    .line 160
    move-object v9, v2

    .line 161
    :cond_4
    if-eqz v0, :cond_5

    .line 162
    .line 163
    invoke-interface {v0}, La/l9s;->g()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    goto :goto_3

    .line 168
    :cond_5
    const/4 v0, 0x0

    .line 169
    :goto_3
    if-nez v0, :cond_6

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_6
    move-object v2, v0

    .line 173
    :goto_4
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_8

    .line 178
    .line 179
    if-ne v0, v3, :cond_7

    .line 180
    .line 181
    move-object v0, v8

    .line 182
    goto :goto_6

    .line 183
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 184
    .line 185
    .line 186
    :goto_5
    const/4 v5, 0x0

    .line 187
    goto/16 :goto_15

    .line 188
    .line 189
    :cond_8
    move-object v0, v7

    .line 190
    :goto_6
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_a

    .line 195
    .line 196
    if-ne v1, v3, :cond_9

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 200
    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_a
    move-object v7, v8

    .line 204
    :goto_7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    const/4 v8, 0x5

    .line 209
    if-ge v1, v8, :cond_b

    .line 210
    .line 211
    move v1, v3

    .line 212
    goto :goto_8

    .line 213
    :cond_b
    const/4 v1, 0x0

    .line 214
    :goto_8
    if-nez v6, :cond_c

    .line 215
    .line 216
    sget-object v8, La/iun;->a:La/iun;

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_c
    move-object v8, v6

    .line 220
    :goto_9
    new-instance v10, Ljava/util/ArrayList;

    .line 221
    .line 222
    const/16 v11, 0xa

    .line 223
    .line 224
    invoke-static {v8, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 229
    .line 230
    .line 231
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    const/4 v11, 0x0

    .line 236
    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    if-eqz v12, :cond_1d

    .line 241
    .line 242
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    add-int/lit8 v13, v11, 0x1

    .line 247
    .line 248
    if-ltz v11, :cond_1c

    .line 249
    .line 250
    check-cast v12, La/tdn;

    .line 251
    .line 252
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 253
    .line 254
    .line 255
    move-result v14

    .line 256
    if-eqz v14, :cond_e

    .line 257
    .line 258
    :cond_d
    const/16 p0, 0x0

    .line 259
    .line 260
    const/4 v4, 0x0

    .line 261
    goto :goto_c

    .line 262
    :cond_e
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v14

    .line 266
    :goto_b
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v15

    .line 270
    if-eqz v15, :cond_d

    .line 271
    .line 272
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v15

    .line 276
    check-cast v15, La/tdn;

    .line 277
    .line 278
    const/16 p0, 0x0

    .line 279
    .line 280
    iget-wide v4, v15, La/tdn;->a:J

    .line 281
    .line 282
    move-wide/from16 v16, v4

    .line 283
    .line 284
    iget-wide v3, v12, La/tdn;->a:J

    .line 285
    .line 286
    cmp-long v3, v16, v3

    .line 287
    .line 288
    if-nez v3, :cond_f

    .line 289
    .line 290
    const/4 v4, 0x1

    .line 291
    goto :goto_c

    .line 292
    :cond_f
    const/4 v3, 0x1

    .line 293
    goto :goto_b

    .line 294
    :goto_c
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    if-eqz v3, :cond_11

    .line 299
    .line 300
    :cond_10
    move-object/from16 p1, v0

    .line 301
    .line 302
    move v14, v1

    .line 303
    const/4 v0, 0x0

    .line 304
    goto :goto_e

    .line 305
    :cond_11
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-eqz v5, :cond_10

    .line 314
    .line 315
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    check-cast v5, La/tdn;

    .line 320
    .line 321
    move-object/from16 p1, v0

    .line 322
    .line 323
    move v14, v1

    .line 324
    iget-wide v0, v5, La/tdn;->a:J

    .line 325
    .line 326
    move-wide/from16 v16, v0

    .line 327
    .line 328
    iget-wide v0, v12, La/tdn;->a:J

    .line 329
    .line 330
    cmp-long v0, v16, v0

    .line 331
    .line 332
    if-nez v0, :cond_12

    .line 333
    .line 334
    const/4 v0, 0x1

    .line 335
    goto :goto_e

    .line 336
    :cond_12
    move-object/from16 v0, p1

    .line 337
    .line 338
    move v1, v14

    .line 339
    goto :goto_d

    .line 340
    :goto_e
    new-instance v1, La/la9;

    .line 341
    .line 342
    move-object v5, v2

    .line 343
    iget-wide v2, v12, La/tdn;->a:J

    .line 344
    .line 345
    iget-object v15, v12, La/tdn;->d:Ljava/lang/Integer;

    .line 346
    .line 347
    if-nez v15, :cond_13

    .line 348
    .line 349
    move/from16 v17, v0

    .line 350
    .line 351
    move-object/from16 v0, p0

    .line 352
    .line 353
    goto :goto_f

    .line 354
    :cond_13
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 355
    .line 356
    .line 357
    move-result v15

    .line 358
    move/from16 v17, v0

    .line 359
    .line 360
    const/4 v0, 0x1

    .line 361
    if-ne v15, v0, :cond_14

    .line 362
    .line 363
    move-object v0, v9

    .line 364
    goto :goto_f

    .line 365
    :cond_14
    move-object v0, v5

    .line 366
    :goto_f
    if-nez v4, :cond_16

    .line 367
    .line 368
    if-eqz v17, :cond_15

    .line 369
    .line 370
    goto :goto_10

    .line 371
    :cond_15
    const/4 v15, 0x0

    .line 372
    goto :goto_11

    .line 373
    :cond_16
    :goto_10
    const/4 v15, 0x1

    .line 374
    :goto_11
    if-nez v4, :cond_18

    .line 375
    .line 376
    if-nez v17, :cond_17

    .line 377
    .line 378
    if-eqz v14, :cond_17

    .line 379
    .line 380
    goto :goto_12

    .line 381
    :cond_17
    const/4 v4, 0x0

    .line 382
    goto :goto_13

    .line 383
    :cond_18
    :goto_12
    const/4 v4, 0x1

    .line 384
    :goto_13
    if-nez v11, :cond_19

    .line 385
    .line 386
    sget-object v11, La/wui0;->b:La/wui0;

    .line 387
    .line 388
    move-object/from16 v18, v5

    .line 389
    .line 390
    goto :goto_14

    .line 391
    :cond_19
    if-eqz v6, :cond_1a

    .line 392
    .line 393
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 394
    .line 395
    .line 396
    move-result v17

    .line 397
    move-object/from16 v18, v5

    .line 398
    .line 399
    const/16 v16, 0x1

    .line 400
    .line 401
    add-int/lit8 v5, v17, -0x1

    .line 402
    .line 403
    if-ne v11, v5, :cond_1b

    .line 404
    .line 405
    sget-object v11, La/wui0;->d:La/wui0;

    .line 406
    .line 407
    goto :goto_14

    .line 408
    :cond_1a
    move-object/from16 v18, v5

    .line 409
    .line 410
    :cond_1b
    sget-object v11, La/wui0;->c:La/wui0;

    .line 411
    .line 412
    :goto_14
    invoke-static {v12, v0, v15, v4, v11}, La/fww;->K(La/tdn;Ljava/lang/String;ZZLa/wui0;)La/rqm;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-direct {v1, v2, v3, v0}, La/la9;-><init>(JLa/rqm;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-object/from16 v0, p1

    .line 423
    .line 424
    move v11, v13

    .line 425
    move v1, v14

    .line 426
    move-object/from16 v2, v18

    .line 427
    .line 428
    const/4 v3, 0x1

    .line 429
    goto/16 :goto_a

    .line 430
    .line 431
    :cond_1c
    const/16 p0, 0x0

    .line 432
    .line 433
    invoke-static {}, La/q3d;->p()V

    .line 434
    .line 435
    .line 436
    throw p0

    .line 437
    :cond_1d
    invoke-static {v10}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    :goto_15
    return-object v5

    .line 442
    :pswitch_1
    const/16 p0, 0x0

    .line 443
    .line 444
    move-object/from16 v1, p1

    .line 445
    .line 446
    check-cast v1, La/rvm0;

    .line 447
    .line 448
    iget-object v3, v0, La/xa9;->d:La/n0o0;

    .line 449
    .line 450
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    check-cast v3, La/fee;

    .line 455
    .line 456
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    check-cast v3, Ljava/util/List;

    .line 461
    .line 462
    iget-object v4, v0, La/xa9;->b:La/n0o0;

    .line 463
    .line 464
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v4

    .line 468
    check-cast v4, La/fee;

    .line 469
    .line 470
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    check-cast v4, Ljava/util/List;

    .line 475
    .line 476
    iget-object v0, v0, La/xa9;->c:La/n0o0;

    .line 477
    .line 478
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    check-cast v0, La/fee;

    .line 483
    .line 484
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    check-cast v0, Ljava/util/List;

    .line 489
    .line 490
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    new-instance v5, La/imm;

    .line 500
    .line 501
    new-instance v6, La/ilm;

    .line 502
    .line 503
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 504
    .line 505
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 506
    .line 507
    .line 508
    move-result-object v7

    .line 509
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 510
    .line 511
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 512
    .line 513
    .line 514
    move-result-wide v7

    .line 515
    invoke-direct {v6, v7, v8}, La/ilm;-><init>(J)V

    .line 516
    .line 517
    .line 518
    new-instance v7, La/plm;

    .line 519
    .line 520
    if-eqz v1, :cond_1e

    .line 521
    .line 522
    iget-object v1, v1, La/rvm0;->c:Ljava/lang/String;

    .line 523
    .line 524
    goto :goto_16

    .line 525
    :cond_1e
    move-object/from16 v1, p0

    .line 526
    .line 527
    :goto_16
    if-nez v1, :cond_1f

    .line 528
    .line 529
    goto :goto_17

    .line 530
    :cond_1f
    move-object v2, v1

    .line 531
    :goto_17
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 536
    .line 537
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 538
    .line 539
    .line 540
    move-result-wide v8

    .line 541
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 542
    .line 543
    .line 544
    move-result v1

    .line 545
    const/4 v15, 0x1

    .line 546
    if-le v1, v15, :cond_20

    .line 547
    .line 548
    new-instance v1, La/ea50;

    .line 549
    .line 550
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 555
    .line 556
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 557
    .line 558
    .line 559
    move-result-wide v10

    .line 560
    invoke-direct {v1, v10, v11}, La/ea50;-><init>(J)V

    .line 561
    .line 562
    .line 563
    goto :goto_18

    .line 564
    :cond_20
    sget-object v1, La/fa50;->a:La/fa50;

    .line 565
    .line 566
    :goto_18
    invoke-direct {v7, v2, v8, v9, v1}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 567
    .line 568
    .line 569
    new-instance v8, La/dmm;

    .line 570
    .line 571
    new-instance v1, La/ta50;

    .line 572
    .line 573
    new-instance v16, La/wkm;

    .line 574
    .line 575
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    if-eqz v2, :cond_22

    .line 580
    .line 581
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-nez v0, :cond_21

    .line 586
    .line 587
    goto :goto_19

    .line 588
    :cond_21
    const/16 v19, 0x0

    .line 589
    .line 590
    goto :goto_1a

    .line 591
    :cond_22
    :goto_19
    move/from16 v19, v15

    .line 592
    .line 593
    :goto_1a
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 598
    .line 599
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 600
    .line 601
    .line 602
    move-result-wide v21

    .line 603
    const/16 v17, 0x1

    .line 604
    .line 605
    const v18, 0x7f080a30

    .line 606
    .line 607
    .line 608
    sget-object v20, La/ra50;->a:La/ra50;

    .line 609
    .line 610
    invoke-direct/range {v16 .. v22}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 611
    .line 612
    .line 613
    move-object/from16 v0, v16

    .line 614
    .line 615
    invoke-direct {v1, v0}, La/ta50;-><init>(La/wkm;)V

    .line 616
    .line 617
    .line 618
    invoke-direct {v8, v1}, La/dmm;-><init>(La/wa50;)V

    .line 619
    .line 620
    .line 621
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 626
    .line 627
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 628
    .line 629
    .line 630
    move-result-wide v9

    .line 631
    const/4 v11, 0x0

    .line 632
    const/4 v12, 0x0

    .line 633
    invoke-direct/range {v5 .. v12}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 634
    .line 635
    .line 636
    return-object v5

    .line 637
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
