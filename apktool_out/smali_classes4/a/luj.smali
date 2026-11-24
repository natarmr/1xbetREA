.class public abstract La/luj;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/List;La/y78;La/ctf0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZLa/sff0;ZLjava/util/List;Z)La/lc00;
    .locals 32

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move-object/from16 v15, p3

    .line 4
    .line 5
    move-object/from16 v0, p5

    .line 6
    .line 7
    move/from16 v6, p6

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 19
    .line 20
    .line 21
    move-result-object v11

    .line 22
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_10

    .line 27
    .line 28
    new-instance v2, La/nuj;

    .line 29
    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v4, "HomeHeaderUiModel_"

    .line 33
    .line 34
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const/4 v12, 0x0

    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    new-instance v16, La/hjm;

    .line 48
    .line 49
    new-array v4, v12, [Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v5, v1, La/ctf0;->b:La/lsm0;

    .line 52
    .line 53
    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    const v7, 0x7f1305fc

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v7, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v17

    .line 64
    const/16 v28, 0x0

    .line 65
    .line 66
    const/16 v29, 0x1fbe

    .line 67
    .line 68
    const/16 v18, 0x0

    .line 69
    .line 70
    const/16 v19, 0x0

    .line 71
    .line 72
    const/16 v20, 0x0

    .line 73
    .line 74
    const/16 v21, 0x0

    .line 75
    .line 76
    const/16 v22, 0x0

    .line 77
    .line 78
    const/16 v23, 0x1

    .line 79
    .line 80
    const/16 v24, 0x0

    .line 81
    .line 82
    const/16 v25, 0x0

    .line 83
    .line 84
    const/16 v26, 0x0

    .line 85
    .line 86
    const/16 v27, 0x0

    .line 87
    .line 88
    invoke-direct/range {v16 .. v29}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 89
    .line 90
    .line 91
    move-object/from16 v4, v16

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    new-instance v17, La/hjm;

    .line 95
    .line 96
    new-array v4, v12, [Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v5, v1, La/ctf0;->b:La/lsm0;

    .line 99
    .line 100
    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    const v7, 0x7f130fd3

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5, v7, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v18

    .line 111
    const/16 v29, 0x0

    .line 112
    .line 113
    const/16 v30, 0x1fbe

    .line 114
    .line 115
    const/16 v19, 0x0

    .line 116
    .line 117
    const/16 v20, 0x0

    .line 118
    .line 119
    const/16 v21, 0x0

    .line 120
    .line 121
    const/16 v22, 0x0

    .line 122
    .line 123
    const/16 v23, 0x0

    .line 124
    .line 125
    const/16 v24, 0x0

    .line 126
    .line 127
    const/16 v25, 0x0

    .line 128
    .line 129
    const/16 v26, 0x0

    .line 130
    .line 131
    const/16 v27, 0x0

    .line 132
    .line 133
    const/16 v28, 0x0

    .line 134
    .line 135
    invoke-direct/range {v17 .. v30}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 136
    .line 137
    .line 138
    move-object/from16 v4, v17

    .line 139
    .line 140
    :goto_0
    invoke-direct {v2, v3, v4}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v11, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v16

    .line 150
    move v13, v12

    .line 151
    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-eqz v2, :cond_10

    .line 156
    .line 157
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    add-int/lit8 v17, v13, 0x1

    .line 162
    .line 163
    if-ltz v13, :cond_f

    .line 164
    .line 165
    check-cast v2, La/eih;

    .line 166
    .line 167
    iget-wide v3, v2, La/eih;->a:J

    .line 168
    .line 169
    iget-object v5, v2, La/eih;->e:Ljava/util/ArrayList;

    .line 170
    .line 171
    const-wide/16 v7, 0x28

    .line 172
    .line 173
    cmp-long v7, v3, v7

    .line 174
    .line 175
    if-nez v7, :cond_1

    .line 176
    .line 177
    iget-wide v3, v2, La/eih;->b:J

    .line 178
    .line 179
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-nez v7, :cond_e

    .line 184
    .line 185
    new-instance v7, La/akw;

    .line 186
    .line 187
    new-instance v8, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-string v9, "HomeSubHeaderUiModel_"

    .line 190
    .line 191
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    move-object v9, v7

    .line 205
    iget-object v7, v2, La/eih;->c:Ljava/lang/String;

    .line 206
    .line 207
    new-array v10, v12, [Ljava/lang/Object;

    .line 208
    .line 209
    iget-object v14, v1, La/ctf0;->b:La/lsm0;

    .line 210
    .line 211
    invoke-static {v10, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    const v12, 0x7f1300e4

    .line 216
    .line 217
    .line 218
    invoke-virtual {v14, v12, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    move-object v12, v9

    .line 223
    new-instance v9, La/n0x;

    .line 224
    .line 225
    iget-object v14, v2, La/eih;->d:Ljava/lang/String;

    .line 226
    .line 227
    invoke-direct {v9, v14}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    move-object v14, v5

    .line 231
    move-wide v4, v3

    .line 232
    move-object v3, v8

    .line 233
    move-object v8, v10

    .line 234
    new-instance v10, La/m0x;

    .line 235
    .line 236
    const v1, 0x7f0807b5

    .line 237
    .line 238
    .line 239
    move-object/from16 v19, v2

    .line 240
    .line 241
    const/4 v2, 0x6

    .line 242
    move-object/from16 v20, v12

    .line 243
    .line 244
    const/4 v12, 0x0

    .line 245
    invoke-direct {v10, v1, v12, v2}, La/m0x;-><init>(ILa/bzw;I)V

    .line 246
    .line 247
    .line 248
    move-object/from16 v1, v19

    .line 249
    .line 250
    move-object/from16 v2, v20

    .line 251
    .line 252
    invoke-direct/range {v2 .. v10}, La/akw;-><init>(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;La/n0x;La/m0x;)V

    .line 253
    .line 254
    .line 255
    move-object v9, v2

    .line 256
    move v2, v6

    .line 257
    invoke-virtual {v11, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    iget-object v3, v0, La/sff0;->g:La/mum0;

    .line 261
    .line 262
    iget-object v3, v3, La/mum0;->y:La/v5l0;

    .line 263
    .line 264
    new-instance v4, La/kuj;

    .line 265
    .line 266
    invoke-static {v15}, Lorg/xplatform/cyber/section/api/domain/entity/d;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    new-instance v6, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    const-string v7, "HomeDefaultGameCardUiModel_"

    .line 273
    .line 274
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v7, "_"

    .line 284
    .line 285
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    sget-object v6, La/q0s;->b:La/q0s;

    .line 296
    .line 297
    new-instance v7, Ljava/util/ArrayList;

    .line 298
    .line 299
    const/16 v8, 0xa

    .line 300
    .line 301
    invoke-static {v14, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 302
    .line 303
    .line 304
    move-result v9

    .line 305
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 309
    .line 310
    .line 311
    move-result-object v19

    .line 312
    :goto_2
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v9

    .line 316
    if-eqz v9, :cond_d

    .line 317
    .line 318
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v9

    .line 322
    check-cast v9, La/d0t;

    .line 323
    .line 324
    invoke-interface/range {p7 .. p7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object v10

    .line 328
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v13

    .line 332
    if-eqz v13, :cond_3

    .line 333
    .line 334
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    move-object v14, v13

    .line 339
    check-cast v14, La/lok0;

    .line 340
    .line 341
    iget v14, v14, La/lok0;->a:I

    .line 342
    .line 343
    iget v12, v9, La/d0t;->O:I

    .line 344
    .line 345
    if-ne v14, v12, :cond_2

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :cond_2
    const/4 v12, 0x0

    .line 349
    goto :goto_3

    .line 350
    :cond_3
    const/4 v13, 0x0

    .line 351
    :goto_4
    check-cast v13, La/lok0;

    .line 352
    .line 353
    move-object v10, v4

    .line 354
    iget-boolean v4, v0, La/sff0;->J:Z

    .line 355
    .line 356
    move-object v12, v5

    .line 357
    iget-object v5, v1, La/eih;->f:Ljava/lang/String;

    .line 358
    .line 359
    sget-object v14, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 360
    .line 361
    invoke-virtual {v15, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v14

    .line 365
    move-object/from16 v20, v7

    .line 366
    .line 367
    new-instance v7, Ljava/util/ArrayList;

    .line 368
    .line 369
    move-object/from16 v0, p7

    .line 370
    .line 371
    move-object/from16 v21, v1

    .line 372
    .line 373
    invoke-static {v0, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 378
    .line 379
    .line 380
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 385
    .line 386
    .line 387
    move-result v22

    .line 388
    if-eqz v22, :cond_4

    .line 389
    .line 390
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v22

    .line 394
    move-object/from16 v8, v22

    .line 395
    .line 396
    check-cast v8, La/lok0;

    .line 397
    .line 398
    iget v8, v8, La/lok0;->a:I

    .line 399
    .line 400
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 401
    .line 402
    .line 403
    move-result-object v8

    .line 404
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    const/16 v8, 0xa

    .line 408
    .line 409
    goto :goto_5

    .line 410
    :cond_4
    if-eqz v13, :cond_5

    .line 411
    .line 412
    iget-boolean v1, v13, La/lok0;->n:Z

    .line 413
    .line 414
    move v8, v1

    .line 415
    goto :goto_6

    .line 416
    :cond_5
    const/4 v8, 0x0

    .line 417
    :goto_6
    if-eqz v13, :cond_6

    .line 418
    .line 419
    iget-boolean v1, v13, La/lok0;->p:Z

    .line 420
    .line 421
    goto :goto_7

    .line 422
    :cond_6
    const/4 v1, 0x0

    .line 423
    :goto_7
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 424
    .line 425
    invoke-virtual {v15, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    move/from16 v22, v0

    .line 430
    .line 431
    iget-object v0, v9, La/d0t;->K:Ljava/util/List;

    .line 432
    .line 433
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    if-eqz v0, :cond_a

    .line 438
    .line 439
    iget-object v0, v9, La/d0t;->k:Ljava/util/List;

    .line 440
    .line 441
    if-eqz v0, :cond_7

    .line 442
    .line 443
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 444
    .line 445
    .line 446
    move-result v24

    .line 447
    if-eqz v24, :cond_7

    .line 448
    .line 449
    goto :goto_9

    .line 450
    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v24

    .line 458
    if-eqz v24, :cond_9

    .line 459
    .line 460
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v24

    .line 464
    move-object/from16 v25, v0

    .line 465
    .line 466
    move-object/from16 v0, v24

    .line 467
    .line 468
    check-cast v0, La/d0t;

    .line 469
    .line 470
    iget-object v0, v0, La/d0t;->K:Ljava/util/List;

    .line 471
    .line 472
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-nez v0, :cond_8

    .line 477
    .line 478
    goto :goto_a

    .line 479
    :cond_8
    move-object/from16 v0, v25

    .line 480
    .line 481
    goto :goto_8

    .line 482
    :cond_9
    :goto_9
    sget-object v0, La/i5l0;->a:La/i5l0;

    .line 483
    .line 484
    goto :goto_b

    .line 485
    :cond_a
    :goto_a
    sget-object v0, La/l5l0;->a:La/l5l0;

    .line 486
    .line 487
    :goto_b
    if-eqz v13, :cond_b

    .line 488
    .line 489
    iget-object v13, v13, La/lok0;->u:Ljava/lang/String;

    .line 490
    .line 491
    goto :goto_c

    .line 492
    :cond_b
    const/4 v13, 0x0

    .line 493
    :goto_c
    if-nez v13, :cond_c

    .line 494
    .line 495
    const-string v13, ""

    .line 496
    .line 497
    :cond_c
    move-object/from16 v2, p1

    .line 498
    .line 499
    move-object/from16 v18, v11

    .line 500
    .line 501
    move-object/from16 v31, v12

    .line 502
    .line 503
    move-object/from16 v15, v20

    .line 504
    .line 505
    const/16 v23, 0x0

    .line 506
    .line 507
    const/16 v24, 0x0

    .line 508
    .line 509
    const/16 v25, 0xa

    .line 510
    .line 511
    move-object v12, v0

    .line 512
    move-object v11, v3

    .line 513
    move-object v0, v9

    .line 514
    move-object/from16 v20, v10

    .line 515
    .line 516
    move/from16 v10, v22

    .line 517
    .line 518
    move/from16 v3, p4

    .line 519
    .line 520
    move v9, v1

    .line 521
    move-object/from16 v22, v6

    .line 522
    .line 523
    move v6, v14

    .line 524
    move-object/from16 v1, p2

    .line 525
    .line 526
    move/from16 v14, p8

    .line 527
    .line 528
    invoke-static/range {v0 .. v14}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-object/from16 v0, p5

    .line 536
    .line 537
    move/from16 v2, p6

    .line 538
    .line 539
    move-object v3, v11

    .line 540
    move-object v7, v15

    .line 541
    move-object/from16 v11, v18

    .line 542
    .line 543
    move-object/from16 v4, v20

    .line 544
    .line 545
    move-object/from16 v1, v21

    .line 546
    .line 547
    move-object/from16 v6, v22

    .line 548
    .line 549
    move-object/from16 v12, v23

    .line 550
    .line 551
    move/from16 v8, v25

    .line 552
    .line 553
    move-object/from16 v5, v31

    .line 554
    .line 555
    move-object/from16 v15, p3

    .line 556
    .line 557
    goto/16 :goto_2

    .line 558
    .line 559
    :cond_d
    move-object/from16 v20, v4

    .line 560
    .line 561
    move-object/from16 v31, v5

    .line 562
    .line 563
    move-object/from16 v22, v6

    .line 564
    .line 565
    move-object v15, v7

    .line 566
    move-object/from16 v18, v11

    .line 567
    .line 568
    const/16 v24, 0x0

    .line 569
    .line 570
    invoke-static {v15}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    new-instance v1, La/vb90;

    .line 575
    .line 576
    const/4 v2, 0x1

    .line 577
    move/from16 v14, p8

    .line 578
    .line 579
    move-object/from16 v3, v22

    .line 580
    .line 581
    invoke-direct {v1, v3, v0, v2, v14}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 582
    .line 583
    .line 584
    move-object/from16 v10, v20

    .line 585
    .line 586
    move-object/from16 v12, v31

    .line 587
    .line 588
    invoke-direct {v10, v12, v1}, La/kuj;-><init>(Ljava/lang/String;La/vb90;)V

    .line 589
    .line 590
    .line 591
    move-object/from16 v0, v18

    .line 592
    .line 593
    invoke-virtual {v0, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    goto :goto_d

    .line 597
    :cond_e
    move/from16 v14, p8

    .line 598
    .line 599
    move-object v0, v11

    .line 600
    move/from16 v24, v12

    .line 601
    .line 602
    :goto_d
    move-object/from16 v1, p2

    .line 603
    .line 604
    move-object/from16 v15, p3

    .line 605
    .line 606
    move/from16 v6, p6

    .line 607
    .line 608
    move-object v11, v0

    .line 609
    move/from16 v13, v17

    .line 610
    .line 611
    move/from16 v12, v24

    .line 612
    .line 613
    move-object/from16 v0, p5

    .line 614
    .line 615
    goto/16 :goto_1

    .line 616
    .line 617
    :cond_f
    const/16 v23, 0x0

    .line 618
    .line 619
    invoke-static {}, La/q3d;->p()V

    .line 620
    .line 621
    .line 622
    throw v23

    .line 623
    :cond_10
    move-object v0, v11

    .line 624
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    return-object v0
.end method
