.class public abstract La/ico;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/List;La/y78;La/v5l0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZLa/sff0;La/sip;Ljava/util/List;Ljava/util/List;JLa/ctf0;Z)Ljava/util/List;
    .locals 25

    .line 1
    move-object/from16 v1, p11

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v0, La/c8m;

    .line 19
    .line 20
    invoke-static/range {p6 .. p6}, La/kpb;->u(La/sip;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v15, 0x0

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    new-array v2, v15, [Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v3, v1, La/ctf0;->b:La/lsm0;

    .line 30
    .line 31
    invoke-static {v2, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const v4, 0x7f130609

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-array v2, v15, [Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v3, v1, La/ctf0;->b:La/lsm0;

    .line 46
    .line 47
    invoke-static {v2, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const v4, 0x7f130b2c

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :goto_0
    sget-object v3, La/rv00;->m:La/rv00;

    .line 59
    .line 60
    invoke-direct {v0, v2, v3}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 61
    .line 62
    .line 63
    new-instance v2, La/ftk;

    .line 64
    .line 65
    new-instance v3, Ljava/util/ArrayList;

    .line 66
    .line 67
    const/16 v4, 0xa

    .line 68
    .line 69
    move-object/from16 v5, p0

    .line 70
    .line 71
    invoke-static {v5, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    const-wide/16 v9, 0x28

    .line 87
    .line 88
    if-eqz v7, :cond_3

    .line 89
    .line 90
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, La/eih;

    .line 95
    .line 96
    iget-wide v11, v7, La/eih;->a:J

    .line 97
    .line 98
    cmp-long v9, v11, v9

    .line 99
    .line 100
    if-nez v9, :cond_1

    .line 101
    .line 102
    iget-wide v11, v7, La/eih;->b:J

    .line 103
    .line 104
    :cond_1
    move-wide/from16 v17, v11

    .line 105
    .line 106
    new-instance v16, La/ctk;

    .line 107
    .line 108
    iget-object v9, v7, La/eih;->d:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v7, v7, La/eih;->c:Ljava/lang/String;

    .line 111
    .line 112
    cmp-long v10, p9, v17

    .line 113
    .line 114
    if-nez v10, :cond_2

    .line 115
    .line 116
    const/16 v21, 0x1

    .line 117
    .line 118
    :goto_2
    move-object/from16 v20, v7

    .line 119
    .line 120
    move-object/from16 v19, v9

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_2
    move/from16 v21, v15

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :goto_3
    invoke-direct/range {v16 .. v21}, La/ctk;-><init>(JLjava/lang/String;Ljava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    move-object/from16 v7, v16

    .line 130
    .line 131
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_4

    .line 140
    .line 141
    sget-object v3, La/iun;->a:La/iun;

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_4
    invoke-static {v3, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    invoke-static {v6}, La/wp20;->a(I)I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    const/16 v7, 0x10

    .line 153
    .line 154
    if-ge v6, v7, :cond_5

    .line 155
    .line 156
    move v6, v7

    .line 157
    :cond_5
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 158
    .line 159
    invoke-direct {v7, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-eqz v6, :cond_6

    .line 171
    .line 172
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    move-object v11, v6

    .line 177
    check-cast v11, La/ctk;

    .line 178
    .line 179
    iget-wide v11, v11, La/ctk;->a:J

    .line 180
    .line 181
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    invoke-interface {v7, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-interface/range {p8 .. p8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    :cond_7
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    if-eqz v11, :cond_8

    .line 203
    .line 204
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    check-cast v11, Ljava/lang/Number;

    .line 209
    .line 210
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 211
    .line 212
    .line 213
    move-result-wide v11

    .line 214
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    invoke-virtual {v7, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    check-cast v11, La/ctk;

    .line 223
    .line 224
    if-eqz v11, :cond_7

    .line 225
    .line 226
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_8
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    :goto_6
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    move-object/from16 v6, p6

    .line 239
    .line 240
    invoke-direct {v2, v6, v3}, La/ftk;-><init>(La/sip;La/i4;)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-eqz v3, :cond_9

    .line 248
    .line 249
    sget-object v0, La/iun;->a:La/iun;

    .line 250
    .line 251
    return-object v0

    .line 252
    :cond_9
    new-instance v16, La/hco;

    .line 253
    .line 254
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-static/range {p3 .. p3}, Lorg/xplatform/cyber/section/api/domain/entity/d;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    const-string v11, "EventFocusTopEventsUiModel_"

    .line 263
    .line 264
    const-string v12, "_"

    .line 265
    .line 266
    invoke-static {v11, v3, v12, v7}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v17

    .line 270
    new-instance v3, La/v7m;

    .line 271
    .line 272
    invoke-direct {v3, v0}, La/v7m;-><init>(La/c8m;)V

    .line 273
    .line 274
    .line 275
    const-wide/16 v11, 0x0

    .line 276
    .line 277
    cmp-long v0, p9, v11

    .line 278
    .line 279
    if-gtz v0, :cond_a

    .line 280
    .line 281
    sget-object v0, La/iun;->a:La/iun;

    .line 282
    .line 283
    move-object/from16 v20, v2

    .line 284
    .line 285
    move-object/from16 v22, v3

    .line 286
    .line 287
    goto/16 :goto_13

    .line 288
    .line 289
    :cond_a
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    const/16 v18, 0x0

    .line 298
    .line 299
    if-eqz v5, :cond_d

    .line 300
    .line 301
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    move-object v7, v5

    .line 306
    check-cast v7, La/eih;

    .line 307
    .line 308
    iget-wide v11, v7, La/eih;->a:J

    .line 309
    .line 310
    cmp-long v13, v11, v9

    .line 311
    .line 312
    if-nez v13, :cond_c

    .line 313
    .line 314
    iget-wide v11, v7, La/eih;->b:J

    .line 315
    .line 316
    :cond_c
    cmp-long v7, v11, p9

    .line 317
    .line 318
    if-nez v7, :cond_b

    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_d
    move-object/from16 v5, v18

    .line 322
    .line 323
    :goto_7
    move-object v0, v5

    .line 324
    check-cast v0, La/eih;

    .line 325
    .line 326
    if-eqz v0, :cond_1a

    .line 327
    .line 328
    iget-object v5, v0, La/eih;->e:Ljava/util/ArrayList;

    .line 329
    .line 330
    new-instance v7, Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-static {v5, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v19

    .line 343
    :goto_8
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    if-eqz v5, :cond_19

    .line 348
    .line 349
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    check-cast v5, La/d0t;

    .line 354
    .line 355
    invoke-interface/range {p7 .. p7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 356
    .line 357
    .line 358
    move-result-object v9

    .line 359
    :cond_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 360
    .line 361
    .line 362
    move-result v10

    .line 363
    if-eqz v10, :cond_f

    .line 364
    .line 365
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v10

    .line 369
    move-object v11, v10

    .line 370
    check-cast v11, La/lok0;

    .line 371
    .line 372
    iget v11, v11, La/lok0;->a:I

    .line 373
    .line 374
    iget v12, v5, La/d0t;->O:I

    .line 375
    .line 376
    if-ne v11, v12, :cond_e

    .line 377
    .line 378
    goto :goto_9

    .line 379
    :cond_f
    move-object/from16 v10, v18

    .line 380
    .line 381
    :goto_9
    check-cast v10, La/lok0;

    .line 382
    .line 383
    move-object/from16 v9, p5

    .line 384
    .line 385
    iget-boolean v11, v9, La/sff0;->J:Z

    .line 386
    .line 387
    iget-object v12, v0, La/eih;->f:Ljava/lang/String;

    .line 388
    .line 389
    sget-object v13, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 390
    .line 391
    move-object/from16 v14, p3

    .line 392
    .line 393
    invoke-virtual {v14, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v13

    .line 397
    move-object/from16 v20, v7

    .line 398
    .line 399
    new-instance v7, Ljava/util/ArrayList;

    .line 400
    .line 401
    move-object/from16 v15, p7

    .line 402
    .line 403
    invoke-static {v15, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 404
    .line 405
    .line 406
    move-result v8

    .line 407
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 408
    .line 409
    .line 410
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v8

    .line 414
    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v23

    .line 418
    if-eqz v23, :cond_10

    .line 419
    .line 420
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v23

    .line 424
    move-object/from16 v4, v23

    .line 425
    .line 426
    check-cast v4, La/lok0;

    .line 427
    .line 428
    iget v4, v4, La/lok0;->a:I

    .line 429
    .line 430
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 431
    .line 432
    .line 433
    move-result-object v4

    .line 434
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    const/16 v4, 0xa

    .line 438
    .line 439
    goto :goto_a

    .line 440
    :cond_10
    if-eqz v10, :cond_11

    .line 441
    .line 442
    iget-boolean v4, v10, La/lok0;->n:Z

    .line 443
    .line 444
    move v8, v4

    .line 445
    goto :goto_b

    .line 446
    :cond_11
    const/4 v8, 0x0

    .line 447
    :goto_b
    if-eqz v10, :cond_12

    .line 448
    .line 449
    iget-boolean v4, v10, La/lok0;->p:Z

    .line 450
    .line 451
    :goto_c
    move-object/from16 p0, v0

    .line 452
    .line 453
    goto :goto_d

    .line 454
    :cond_12
    const/4 v4, 0x0

    .line 455
    goto :goto_c

    .line 456
    :goto_d
    iget-object v0, v5, La/d0t;->K:Ljava/util/List;

    .line 457
    .line 458
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-eqz v0, :cond_16

    .line 463
    .line 464
    iget-object v0, v5, La/d0t;->k:Ljava/util/List;

    .line 465
    .line 466
    if-eqz v0, :cond_13

    .line 467
    .line 468
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 469
    .line 470
    .line 471
    move-result v23

    .line 472
    if-eqz v23, :cond_13

    .line 473
    .line 474
    goto :goto_f

    .line 475
    :cond_13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 480
    .line 481
    .line 482
    move-result v23

    .line 483
    if-eqz v23, :cond_15

    .line 484
    .line 485
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v23

    .line 489
    move-object/from16 p8, v0

    .line 490
    .line 491
    move-object/from16 v0, v23

    .line 492
    .line 493
    check-cast v0, La/d0t;

    .line 494
    .line 495
    iget-object v0, v0, La/d0t;->K:Ljava/util/List;

    .line 496
    .line 497
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-nez v0, :cond_14

    .line 502
    .line 503
    goto :goto_10

    .line 504
    :cond_14
    move-object/from16 v0, p8

    .line 505
    .line 506
    goto :goto_e

    .line 507
    :cond_15
    :goto_f
    sget-object v0, La/i5l0;->a:La/i5l0;

    .line 508
    .line 509
    goto :goto_11

    .line 510
    :cond_16
    :goto_10
    sget-object v0, La/l5l0;->a:La/l5l0;

    .line 511
    .line 512
    :goto_11
    if-eqz v10, :cond_17

    .line 513
    .line 514
    iget-object v10, v10, La/lok0;->u:Ljava/lang/String;

    .line 515
    .line 516
    goto :goto_12

    .line 517
    :cond_17
    move-object/from16 v10, v18

    .line 518
    .line 519
    :goto_12
    if-nez v10, :cond_18

    .line 520
    .line 521
    const-string v10, ""

    .line 522
    .line 523
    :cond_18
    const/16 v23, 0x0

    .line 524
    .line 525
    move-object v6, v12

    .line 526
    move-object v12, v0

    .line 527
    move-object v0, v5

    .line 528
    move-object v5, v6

    .line 529
    move/from16 v14, p12

    .line 530
    .line 531
    move-object/from16 v22, v3

    .line 532
    .line 533
    move v9, v4

    .line 534
    move v4, v11

    .line 535
    move v6, v13

    .line 536
    move-object/from16 v15, v20

    .line 537
    .line 538
    const/16 v24, 0xa

    .line 539
    .line 540
    move-object/from16 v11, p2

    .line 541
    .line 542
    move/from16 v3, p4

    .line 543
    .line 544
    move-object/from16 v20, v2

    .line 545
    .line 546
    move-object v13, v10

    .line 547
    move/from16 v10, v23

    .line 548
    .line 549
    move-object/from16 v23, p0

    .line 550
    .line 551
    move-object/from16 v2, p1

    .line 552
    .line 553
    invoke-static/range {v0 .. v14}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-object/from16 v6, p6

    .line 561
    .line 562
    move-object/from16 v1, p11

    .line 563
    .line 564
    move-object v7, v15

    .line 565
    move-object/from16 v2, v20

    .line 566
    .line 567
    move-object/from16 v3, v22

    .line 568
    .line 569
    move-object/from16 v0, v23

    .line 570
    .line 571
    move/from16 v4, v24

    .line 572
    .line 573
    const/4 v15, 0x0

    .line 574
    goto/16 :goto_8

    .line 575
    .line 576
    :cond_19
    move-object/from16 v20, v2

    .line 577
    .line 578
    move-object/from16 v22, v3

    .line 579
    .line 580
    move-object v15, v7

    .line 581
    move-object v0, v15

    .line 582
    goto :goto_13

    .line 583
    :cond_1a
    move-object/from16 v20, v2

    .line 584
    .line 585
    move-object/from16 v22, v3

    .line 586
    .line 587
    sget-object v0, La/lak0;->c:La/lak0;

    .line 588
    .line 589
    :goto_13
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    new-instance v9, La/vb90;

    .line 594
    .line 595
    sget-object v1, La/q0s;->a:La/q0s;

    .line 596
    .line 597
    move/from16 v14, p12

    .line 598
    .line 599
    const/4 v2, 0x1

    .line 600
    invoke-direct {v9, v1, v0, v2, v14}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 601
    .line 602
    .line 603
    sget-object v10, La/k3g;->a:La/k3g;

    .line 604
    .line 605
    move-object/from16 v6, p6

    .line 606
    .line 607
    move-object/from16 v4, v16

    .line 608
    .line 609
    move-object/from16 v5, v17

    .line 610
    .line 611
    move-object/from16 v8, v20

    .line 612
    .line 613
    move-object/from16 v7, v22

    .line 614
    .line 615
    invoke-direct/range {v4 .. v10}, La/hco;-><init>(Ljava/lang/String;La/sip;La/b8m;La/htk;La/vb90;La/m3g;)V

    .line 616
    .line 617
    .line 618
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    return-object v0
.end method
