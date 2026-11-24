.class public final synthetic La/lkw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mkw;


# direct methods
.method public synthetic constructor <init>(La/mkw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lkw;->a:B

    iput-object p1, p0, La/lkw;->b:La/mkw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 53

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lkw;->a:B

    .line 4
    .line 5
    const-string v2, "/"

    .line 6
    .line 7
    const-string v3, "https://"

    .line 8
    .line 9
    sget-object v6, La/l5l0;->a:La/l5l0;

    .line 10
    .line 11
    sget-object v7, La/i5l0;->a:La/i5l0;

    .line 12
    .line 13
    const-string v8, ""

    .line 14
    .line 15
    const/16 v9, 0xa

    .line 16
    .line 17
    iget-object v0, v0, La/lkw;->b:La/mkw;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, La/viw;

    .line 25
    .line 26
    iget-object v13, v0, La/mkw;->i:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v14, v13

    .line 29
    check-cast v14, La/y78;

    .line 30
    .line 31
    iget-object v13, v0, La/mkw;->g:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v13, La/yjw;

    .line 34
    .line 35
    iget-boolean v15, v13, La/yjw;->b:Z

    .line 36
    .line 37
    const/16 p0, 0x0

    .line 38
    .line 39
    iget-object v10, v13, La/yjw;->c:La/sff0;

    .line 40
    .line 41
    iget-boolean v10, v10, La/sff0;->J:Z

    .line 42
    .line 43
    iget-object v0, v0, La/mkw;->b:La/ctf0;

    .line 44
    .line 45
    iget-object v11, v13, La/yjw;->a:Ljava/util/List;

    .line 46
    .line 47
    if-nez v11, :cond_0

    .line 48
    .line 49
    sget-object v11, La/iun;->a:La/iun;

    .line 50
    .line 51
    :cond_0
    iget-boolean v13, v13, La/yjw;->f:Z

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    if-nez v1, :cond_1

    .line 60
    .line 61
    goto/16 :goto_1f

    .line 62
    .line 63
    :cond_1
    iget-object v4, v1, La/viw;->a:Ljava/lang/Object;

    .line 64
    .line 65
    new-instance v5, La/j0g0;

    .line 66
    .line 67
    invoke-direct {v5, v4}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v5}, La/vzb;->J(La/j0g0;)Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iget-object v5, v1, La/viw;->b:Ljava/lang/Object;

    .line 75
    .line 76
    new-instance v12, La/j0g0;

    .line 77
    .line 78
    invoke-direct {v12, v5}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v12}, La/vzb;->J(La/j0g0;)Ljava/util/ArrayList;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    if-eqz v12, :cond_2

    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    if-eqz v12, :cond_2

    .line 96
    .line 97
    goto/16 :goto_1f

    .line 98
    .line 99
    :cond_2
    new-instance v12, Ljava/util/ArrayList;

    .line 100
    .line 101
    move-object/from16 p1, v5

    .line 102
    .line 103
    invoke-static {v4, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    invoke-direct {v12, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v16

    .line 118
    if-eqz v16, :cond_3

    .line 119
    .line 120
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v16

    .line 124
    move-object/from16 v9, v16

    .line 125
    .line 126
    check-cast v9, La/tiw;

    .line 127
    .line 128
    move-object/from16 v16, v5

    .line 129
    .line 130
    move-object/from16 v28, v6

    .line 131
    .line 132
    iget-wide v5, v9, La/tiw;->d:J

    .line 133
    .line 134
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-object/from16 v5, v16

    .line 142
    .line 143
    move-object/from16 v6, v28

    .line 144
    .line 145
    const/16 v9, 0xa

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_3
    move-object/from16 v28, v6

    .line 149
    .line 150
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    new-instance v6, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    if-eqz v12, :cond_5

    .line 168
    .line 169
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    move-object/from16 v29, v7

    .line 174
    .line 175
    move-object v7, v12

    .line 176
    check-cast v7, La/tiw;

    .line 177
    .line 178
    move-object/from16 v30, v8

    .line 179
    .line 180
    iget-wide v7, v7, La/tiw;->d:J

    .line 181
    .line 182
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-nez v7, :cond_4

    .line 191
    .line 192
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    :cond_4
    move-object/from16 v7, v29

    .line 196
    .line 197
    move-object/from16 v8, v30

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_5
    move-object/from16 v29, v7

    .line 201
    .line 202
    move-object/from16 v30, v8

    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    rsub-int/lit8 v5, v5, 0x4

    .line 209
    .line 210
    if-gez v5, :cond_6

    .line 211
    .line 212
    const/4 v5, 0x0

    .line 213
    :cond_6
    invoke-static {v6, v5}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    new-instance v6, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    const/4 v7, 0x0

    .line 231
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    if-eqz v8, :cond_27

    .line 236
    .line 237
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    add-int/lit8 v9, v7, 0x1

    .line 242
    .line 243
    if-ltz v7, :cond_26

    .line 244
    .line 245
    check-cast v8, La/tiw;

    .line 246
    .line 247
    if-nez v7, :cond_7

    .line 248
    .line 249
    const/4 v7, 0x1

    .line 250
    goto :goto_3

    .line 251
    :cond_7
    const/4 v7, 0x0

    .line 252
    :goto_3
    iget-object v12, v1, La/viw;->c:La/ypl0;

    .line 253
    .line 254
    iget-object v12, v12, La/ypl0;->c:La/lel0;

    .line 255
    .line 256
    move-object/from16 v31, v1

    .line 257
    .line 258
    iget-object v1, v12, La/lel0;->j:Ljava/lang/String;

    .line 259
    .line 260
    iget-object v12, v12, La/lel0;->e:Ljava/lang/String;

    .line 261
    .line 262
    move-object/from16 v32, v4

    .line 263
    .line 264
    move-object/from16 v33, v5

    .line 265
    .line 266
    iget-wide v4, v8, La/tiw;->d:J

    .line 267
    .line 268
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v16

    .line 272
    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v17

    .line 276
    if-eqz v17, :cond_9

    .line 277
    .line 278
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v17

    .line 282
    move-object/from16 v18, v1

    .line 283
    .line 284
    move-object/from16 v1, v17

    .line 285
    .line 286
    check-cast v1, La/tiw;

    .line 287
    .line 288
    move-wide/from16 v34, v4

    .line 289
    .line 290
    iget-wide v4, v1, La/tiw;->d:J

    .line 291
    .line 292
    cmp-long v1, v4, v34

    .line 293
    .line 294
    if-nez v1, :cond_8

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_8
    move-object/from16 v1, v18

    .line 298
    .line 299
    move-wide/from16 v4, v34

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_9
    move-object/from16 v18, v1

    .line 303
    .line 304
    move-wide/from16 v34, v4

    .line 305
    .line 306
    move-object/from16 v17, p0

    .line 307
    .line 308
    :goto_5
    move-object/from16 v1, v17

    .line 309
    .line 310
    check-cast v1, La/tiw;

    .line 311
    .line 312
    if-eqz v1, :cond_a

    .line 313
    .line 314
    iget-object v1, v1, La/tiw;->a:Ljava/util/List;

    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_a
    move-object/from16 v1, p0

    .line 318
    .line 319
    :goto_6
    if-nez v1, :cond_b

    .line 320
    .line 321
    sget-object v1, La/iun;->a:La/iun;

    .line 322
    .line 323
    :cond_b
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    if-eqz v5, :cond_d

    .line 332
    .line 333
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    move-object/from16 v16, v4

    .line 338
    .line 339
    move-object v4, v5

    .line 340
    check-cast v4, La/tiw;

    .line 341
    .line 342
    move-object/from16 v17, v5

    .line 343
    .line 344
    iget-wide v4, v4, La/tiw;->d:J

    .line 345
    .line 346
    cmp-long v4, v4, v34

    .line 347
    .line 348
    if-nez v4, :cond_c

    .line 349
    .line 350
    move-object/from16 v5, v17

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_c
    move-object/from16 v4, v16

    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_d
    move-object/from16 v5, p0

    .line 357
    .line 358
    :goto_8
    check-cast v5, La/tiw;

    .line 359
    .line 360
    if-eqz v5, :cond_e

    .line 361
    .line 362
    iget-object v4, v5, La/tiw;->a:Ljava/util/List;

    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_e
    move-object/from16 v4, p0

    .line 366
    .line 367
    :goto_9
    if-nez v4, :cond_f

    .line 368
    .line 369
    sget-object v4, La/iun;->a:La/iun;

    .line 370
    .line 371
    :cond_f
    new-instance v5, La/wpv;

    .line 372
    .line 373
    move/from16 v36, v7

    .line 374
    .line 375
    const/4 v7, 0x2

    .line 376
    invoke-direct {v5, v7}, La/wpv;-><init>(B)V

    .line 377
    .line 378
    .line 379
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    if-eqz v4, :cond_10

    .line 392
    .line 393
    move-object/from16 v5, p0

    .line 394
    .line 395
    move-object/from16 v16, v0

    .line 396
    .line 397
    move/from16 v38, v9

    .line 398
    .line 399
    move/from16 v24, v10

    .line 400
    .line 401
    move/from16 v23, v15

    .line 402
    .line 403
    goto/16 :goto_1e

    .line 404
    .line 405
    :cond_10
    new-instance v4, Ljava/util/ArrayList;

    .line 406
    .line 407
    const/16 v5, 0xa

    .line 408
    .line 409
    invoke-static {v11, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 410
    .line 411
    .line 412
    move-result v7

    .line 413
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 414
    .line 415
    .line 416
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 421
    .line 422
    .line 423
    move-result v7

    .line 424
    if-eqz v7, :cond_11

    .line 425
    .line 426
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v7

    .line 430
    check-cast v7, La/lok0;

    .line 431
    .line 432
    iget v7, v7, La/lok0;->a:I

    .line 433
    .line 434
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 435
    .line 436
    .line 437
    move-result-object v7

    .line 438
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    goto :goto_a

    .line 442
    :cond_11
    new-instance v5, Ljava/util/ArrayList;

    .line 443
    .line 444
    move-object/from16 v21, v4

    .line 445
    .line 446
    const/16 v7, 0xa

    .line 447
    .line 448
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 449
    .line 450
    .line 451
    move-result v4

    .line 452
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    .line 461
    .line 462
    move-result v4

    .line 463
    if-eqz v4, :cond_1e

    .line 464
    .line 465
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    check-cast v4, La/d0t;

    .line 470
    .line 471
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 472
    .line 473
    .line 474
    move-result-object v7

    .line 475
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 476
    .line 477
    .line 478
    move-result v16

    .line 479
    if-eqz v16, :cond_13

    .line 480
    .line 481
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v16

    .line 485
    move-object/from16 v37, v1

    .line 486
    .line 487
    move-object/from16 v1, v16

    .line 488
    .line 489
    check-cast v1, La/lok0;

    .line 490
    .line 491
    iget v1, v1, La/lok0;->a:I

    .line 492
    .line 493
    move-object/from16 v17, v7

    .line 494
    .line 495
    iget v7, v4, La/d0t;->O:I

    .line 496
    .line 497
    if-ne v1, v7, :cond_12

    .line 498
    .line 499
    goto :goto_d

    .line 500
    :cond_12
    move-object/from16 v7, v17

    .line 501
    .line 502
    move-object/from16 v1, v37

    .line 503
    .line 504
    goto :goto_c

    .line 505
    :cond_13
    move-object/from16 v37, v1

    .line 506
    .line 507
    move-object/from16 v16, p0

    .line 508
    .line 509
    :goto_d
    move-object/from16 v1, v16

    .line 510
    .line 511
    check-cast v1, La/lok0;

    .line 512
    .line 513
    if-eqz v1, :cond_14

    .line 514
    .line 515
    iget-boolean v7, v1, La/lok0;->n:Z

    .line 516
    .line 517
    move/from16 v25, v7

    .line 518
    .line 519
    goto :goto_e

    .line 520
    :cond_14
    const/16 v25, 0x0

    .line 521
    .line 522
    :goto_e
    if-eqz v1, :cond_15

    .line 523
    .line 524
    iget-boolean v7, v1, La/lok0;->p:Z

    .line 525
    .line 526
    move/from16 v26, v7

    .line 527
    .line 528
    goto :goto_f

    .line 529
    :cond_15
    const/16 v26, 0x0

    .line 530
    .line 531
    :goto_f
    iget-object v7, v4, La/d0t;->K:Ljava/util/List;

    .line 532
    .line 533
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    if-eqz v7, :cond_19

    .line 538
    .line 539
    iget-object v7, v4, La/d0t;->k:Ljava/util/List;

    .line 540
    .line 541
    if-eqz v7, :cond_16

    .line 542
    .line 543
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 544
    .line 545
    .line 546
    move-result v16

    .line 547
    if-eqz v16, :cond_16

    .line 548
    .line 549
    goto :goto_11

    .line 550
    :cond_16
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 551
    .line 552
    .line 553
    move-result-object v7

    .line 554
    :goto_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 555
    .line 556
    .line 557
    move-result v16

    .line 558
    if-eqz v16, :cond_18

    .line 559
    .line 560
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v16

    .line 564
    move-object/from16 v17, v7

    .line 565
    .line 566
    move-object/from16 v7, v16

    .line 567
    .line 568
    check-cast v7, La/d0t;

    .line 569
    .line 570
    iget-object v7, v7, La/d0t;->K:Ljava/util/List;

    .line 571
    .line 572
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 573
    .line 574
    .line 575
    move-result v7

    .line 576
    if-nez v7, :cond_17

    .line 577
    .line 578
    goto :goto_12

    .line 579
    :cond_17
    move-object/from16 v7, v17

    .line 580
    .line 581
    goto :goto_10

    .line 582
    :cond_18
    :goto_11
    move-object/from16 v17, v29

    .line 583
    .line 584
    goto :goto_13

    .line 585
    :cond_19
    :goto_12
    move-object/from16 v17, v28

    .line 586
    .line 587
    :goto_13
    if-eqz v1, :cond_1a

    .line 588
    .line 589
    iget-object v1, v1, La/lok0;->u:Ljava/lang/String;

    .line 590
    .line 591
    goto :goto_14

    .line 592
    :cond_1a
    move-object/from16 v1, p0

    .line 593
    .line 594
    :goto_14
    if-nez v1, :cond_1b

    .line 595
    .line 596
    move-object/from16 v19, v30

    .line 597
    .line 598
    goto :goto_15

    .line 599
    :cond_1b
    move-object/from16 v19, v1

    .line 600
    .line 601
    :goto_15
    iget-object v1, v8, La/tiw;->f:Ljava/util/List;

    .line 602
    .line 603
    iget-object v7, v8, La/tiw;->g:Ljava/util/Set;

    .line 604
    .line 605
    move-object/from16 v22, v1

    .line 606
    .line 607
    move/from16 v38, v9

    .line 608
    .line 609
    const/4 v1, 0x0

    .line 610
    new-array v9, v1, [Ljava/lang/Object;

    .line 611
    .line 612
    move/from16 v24, v10

    .line 613
    .line 614
    iget-object v10, v0, La/ctf0;->b:La/lsm0;

    .line 615
    .line 616
    invoke-static {v9, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v9

    .line 620
    const v1, 0x7f1316d0

    .line 621
    .line 622
    .line 623
    invoke-virtual {v10, v1, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v9

    .line 627
    move-object/from16 v16, v0

    .line 628
    .line 629
    iget-wide v0, v4, La/d0t;->a:J

    .line 630
    .line 631
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    invoke-interface {v7, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v0

    .line 639
    if-eqz v0, :cond_1c

    .line 640
    .line 641
    goto :goto_16

    .line 642
    :cond_1c
    move-object/from16 v9, p0

    .line 643
    .line 644
    :goto_16
    if-nez v9, :cond_1d

    .line 645
    .line 646
    move-object/from16 v20, v30

    .line 647
    .line 648
    :goto_17
    move/from16 v23, v15

    .line 649
    .line 650
    move-object v15, v4

    .line 651
    goto :goto_18

    .line 652
    :cond_1d
    move-object/from16 v20, v9

    .line 653
    .line 654
    goto :goto_17

    .line 655
    :goto_18
    invoke-static/range {v14 .. v26}, La/ieb;->Z(La/y78;La/d0t;La/ctf0;La/m5l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;ZZZZ)La/grh;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    move-object/from16 v1, v16

    .line 660
    .line 661
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-object v0, v1

    .line 665
    move/from16 v15, v23

    .line 666
    .line 667
    move/from16 v10, v24

    .line 668
    .line 669
    move-object/from16 v1, v37

    .line 670
    .line 671
    move/from16 v9, v38

    .line 672
    .line 673
    goto/16 :goto_b

    .line 674
    .line 675
    :cond_1e
    move-object v1, v0

    .line 676
    move/from16 v38, v9

    .line 677
    .line 678
    move/from16 v24, v10

    .line 679
    .line 680
    move/from16 v23, v15

    .line 681
    .line 682
    invoke-static/range {v34 .. v35}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    if-eqz v36, :cond_1f

    .line 687
    .line 688
    new-instance v41, La/ljm;

    .line 689
    .line 690
    invoke-direct/range {v41 .. v41}, La/ljm;-><init>()V

    .line 691
    .line 692
    .line 693
    const/4 v4, 0x0

    .line 694
    new-array v7, v4, [Ljava/lang/Object;

    .line 695
    .line 696
    iget-object v9, v1, La/ctf0;->b:La/lsm0;

    .line 697
    .line 698
    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v7

    .line 702
    const v10, 0x7f130403

    .line 703
    .line 704
    .line 705
    invoke-virtual {v9, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v40

    .line 709
    new-instance v7, La/ue9;

    .line 710
    .line 711
    new-array v10, v4, [Ljava/lang/Object;

    .line 712
    .line 713
    invoke-static {v10, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v10

    .line 717
    const v4, 0x7f1300e4

    .line 718
    .line 719
    .line 720
    invoke-virtual {v9, v4, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v4

    .line 724
    invoke-direct {v7, v4}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    new-instance v39, La/hjm;

    .line 728
    .line 729
    const/16 v51, 0x0

    .line 730
    .line 731
    const/16 v52, 0x1bfc

    .line 732
    .line 733
    const/16 v42, 0x0

    .line 734
    .line 735
    const/16 v43, 0x0

    .line 736
    .line 737
    const/16 v44, 0x0

    .line 738
    .line 739
    const/16 v45, 0x0

    .line 740
    .line 741
    const/16 v46, 0x0

    .line 742
    .line 743
    const/16 v47, 0x0

    .line 744
    .line 745
    const/16 v48, 0x0

    .line 746
    .line 747
    const/16 v49, 0x0

    .line 748
    .line 749
    move-object/from16 v50, v7

    .line 750
    .line 751
    invoke-direct/range {v39 .. v52}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 752
    .line 753
    .line 754
    move-object/from16 v4, v39

    .line 755
    .line 756
    new-instance v7, La/riw;

    .line 757
    .line 758
    invoke-direct {v7, v4}, La/riw;-><init>(La/hjm;)V

    .line 759
    .line 760
    .line 761
    goto :goto_19

    .line 762
    :cond_1f
    move-object/from16 v7, p0

    .line 763
    .line 764
    :goto_19
    iget-object v4, v8, La/tiw;->e:Ljava/lang/String;

    .line 765
    .line 766
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 767
    .line 768
    .line 769
    move-result v8

    .line 770
    if-nez v8, :cond_20

    .line 771
    .line 772
    goto :goto_1a

    .line 773
    :cond_20
    move-object v12, v4

    .line 774
    :goto_1a
    new-instance v4, La/eiw;

    .line 775
    .line 776
    invoke-static/range {v34 .. v35}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v8

    .line 780
    new-instance v9, La/n0x;

    .line 781
    .line 782
    new-instance v10, Ljava/lang/StringBuilder;

    .line 783
    .line 784
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 785
    .line 786
    invoke-direct {v10, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 793
    .line 794
    .line 795
    move-result v15

    .line 796
    if-nez v15, :cond_21

    .line 797
    .line 798
    const/4 v15, 0x0

    .line 799
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 800
    .line 801
    .line 802
    move-object/from16 v16, v1

    .line 803
    .line 804
    goto :goto_1d

    .line 805
    :cond_21
    move-object/from16 v16, v1

    .line 806
    .line 807
    const/4 v15, 0x0

    .line 808
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 809
    .line 810
    invoke-static {v12, v1, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 811
    .line 812
    .line 813
    move-result v1

    .line 814
    if-nez v1, :cond_24

    .line 815
    .line 816
    invoke-static {v12, v3, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 817
    .line 818
    .line 819
    move-result v1

    .line 820
    if-eqz v1, :cond_22

    .line 821
    .line 822
    const/4 v15, 0x0

    .line 823
    goto :goto_1c

    .line 824
    :cond_22
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    .line 825
    .line 826
    .line 827
    move-result v1

    .line 828
    if-lez v1, :cond_23

    .line 829
    .line 830
    invoke-static {v10, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 831
    .line 832
    .line 833
    move-result v1

    .line 834
    if-nez v1, :cond_23

    .line 835
    .line 836
    const/16 v1, 0x2f

    .line 837
    .line 838
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    move/from16 v27, v1

    .line 842
    .line 843
    const/4 v15, 0x1

    .line 844
    goto :goto_1b

    .line 845
    :cond_23
    const/4 v15, 0x1

    .line 846
    const/16 v27, 0x2f

    .line 847
    .line 848
    :goto_1b
    new-array v1, v15, [C

    .line 849
    .line 850
    const/4 v15, 0x0

    .line 851
    aput-char v27, v1, v15

    .line 852
    .line 853
    invoke-static {v12, v1}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v1

    .line 857
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 858
    .line 859
    .line 860
    goto :goto_1d

    .line 861
    :cond_24
    :goto_1c
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 865
    .line 866
    .line 867
    :goto_1d
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    invoke-direct {v9, v1}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    invoke-direct {v4, v9, v8}, La/eiw;-><init>(La/n0x;Ljava/lang/String;)V

    .line 875
    .line 876
    .line 877
    new-instance v1, La/q4t0;

    .line 878
    .line 879
    sget-object v8, La/y3t0;->b:La/y3t0;

    .line 880
    .line 881
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 882
    .line 883
    .line 884
    move-result-object v5

    .line 885
    invoke-static {}, La/axq;->g()Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v9

    .line 889
    invoke-direct {v1, v9, v8, v5, v13}, La/q4t0;-><init>(Ljava/lang/String;La/y3t0;La/a4x;Z)V

    .line 890
    .line 891
    .line 892
    new-instance v5, La/siw;

    .line 893
    .line 894
    invoke-direct {v5, v0, v7, v4, v1}, La/siw;-><init>(Ljava/lang/String;La/riw;La/eiw;La/q4t0;)V

    .line 895
    .line 896
    .line 897
    :goto_1e
    if-eqz v5, :cond_25

    .line 898
    .line 899
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    :cond_25
    move-object/from16 v0, v16

    .line 903
    .line 904
    move/from16 v15, v23

    .line 905
    .line 906
    move/from16 v10, v24

    .line 907
    .line 908
    move-object/from16 v1, v31

    .line 909
    .line 910
    move-object/from16 v4, v32

    .line 911
    .line 912
    move-object/from16 v5, v33

    .line 913
    .line 914
    move/from16 v7, v38

    .line 915
    .line 916
    goto/16 :goto_2

    .line 917
    .line 918
    :cond_26
    invoke-static {}, La/q3d;->p()V

    .line 919
    .line 920
    .line 921
    throw p0

    .line 922
    :cond_27
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 923
    .line 924
    .line 925
    move-result v0

    .line 926
    if-nez v0, :cond_28

    .line 927
    .line 928
    move-object v10, v6

    .line 929
    goto :goto_20

    .line 930
    :cond_28
    :goto_1f
    move-object/from16 v10, p0

    .line 931
    .line 932
    :goto_20
    return-object v10

    .line 933
    :pswitch_0
    move-object/from16 v28, v6

    .line 934
    .line 935
    move-object/from16 v29, v7

    .line 936
    .line 937
    move-object/from16 v30, v8

    .line 938
    .line 939
    const/16 p0, 0x0

    .line 940
    .line 941
    move-object/from16 v1, p1

    .line 942
    .line 943
    check-cast v1, La/viw;

    .line 944
    .line 945
    iget-object v4, v0, La/mkw;->i:Ljava/lang/Object;

    .line 946
    .line 947
    move-object v5, v4

    .line 948
    check-cast v5, La/y78;

    .line 949
    .line 950
    iget-object v4, v0, La/mkw;->g:Ljava/lang/Object;

    .line 951
    .line 952
    check-cast v4, La/yjw;

    .line 953
    .line 954
    iget-boolean v14, v4, La/yjw;->b:Z

    .line 955
    .line 956
    iget-object v6, v4, La/yjw;->c:La/sff0;

    .line 957
    .line 958
    iget-boolean v15, v6, La/sff0;->J:Z

    .line 959
    .line 960
    iget-object v7, v0, La/mkw;->b:La/ctf0;

    .line 961
    .line 962
    iget-object v0, v4, La/yjw;->a:Ljava/util/List;

    .line 963
    .line 964
    if-nez v0, :cond_29

    .line 965
    .line 966
    sget-object v0, La/iun;->a:La/iun;

    .line 967
    .line 968
    :cond_29
    iget-boolean v4, v4, La/yjw;->f:Z

    .line 969
    .line 970
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 974
    .line 975
    .line 976
    new-instance v6, La/fkw;

    .line 977
    .line 978
    new-instance v8, La/n0x;

    .line 979
    .line 980
    new-instance v9, Ljava/lang/StringBuilder;

    .line 981
    .line 982
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 983
    .line 984
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 985
    .line 986
    .line 987
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 988
    .line 989
    const-string v11, "static/img/ImgDefault/MMA/UFC/Logo.png"

    .line 990
    .line 991
    const/4 v12, 0x0

    .line 992
    invoke-static {v11, v10, v12}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 993
    .line 994
    .line 995
    move-result v10

    .line 996
    if-nez v10, :cond_2c

    .line 997
    .line 998
    invoke-static {v11, v3, v12}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 999
    .line 1000
    .line 1001
    move-result v3

    .line 1002
    if-eqz v3, :cond_2a

    .line 1003
    .line 1004
    const/4 v12, 0x0

    .line 1005
    goto :goto_23

    .line 1006
    :cond_2a
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 1007
    .line 1008
    .line 1009
    move-result v3

    .line 1010
    if-lez v3, :cond_2b

    .line 1011
    .line 1012
    invoke-static {v9, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v2

    .line 1016
    if-nez v2, :cond_2b

    .line 1017
    .line 1018
    const/16 v2, 0x2f

    .line 1019
    .line 1020
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1021
    .line 1022
    .line 1023
    :goto_21
    const/4 v3, 0x1

    .line 1024
    goto :goto_22

    .line 1025
    :cond_2b
    const/16 v2, 0x2f

    .line 1026
    .line 1027
    goto :goto_21

    .line 1028
    :goto_22
    new-array v10, v3, [C

    .line 1029
    .line 1030
    const/4 v12, 0x0

    .line 1031
    aput-char v2, v10, v12

    .line 1032
    .line 1033
    invoke-static {v11, v10}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v2

    .line 1037
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1038
    .line 1039
    .line 1040
    goto :goto_24

    .line 1041
    :cond_2c
    :goto_23
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1045
    .line 1046
    .line 1047
    :goto_24
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v2

    .line 1051
    invoke-direct {v8, v2}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1052
    .line 1053
    .line 1054
    if-eqz v1, :cond_3c

    .line 1055
    .line 1056
    iget-object v2, v1, La/viw;->d:La/j0g0;

    .line 1057
    .line 1058
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 1059
    .line 1060
    instance-of v3, v2, La/g0g0;

    .line 1061
    .line 1062
    if-eqz v3, :cond_2d

    .line 1063
    .line 1064
    move-object/from16 v2, p0

    .line 1065
    .line 1066
    :cond_2d
    check-cast v2, La/hkw;

    .line 1067
    .line 1068
    if-nez v2, :cond_2e

    .line 1069
    .line 1070
    move-object/from16 v10, p0

    .line 1071
    .line 1072
    move-object v3, v6

    .line 1073
    move-object v0, v8

    .line 1074
    goto/16 :goto_2f

    .line 1075
    .line 1076
    :cond_2e
    move-object v3, v6

    .line 1077
    iget-object v6, v2, La/hkw;->a:La/d0t;

    .line 1078
    .line 1079
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v9

    .line 1083
    :cond_2f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1084
    .line 1085
    .line 1086
    move-result v10

    .line 1087
    if-eqz v10, :cond_30

    .line 1088
    .line 1089
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v10

    .line 1093
    move-object v11, v10

    .line 1094
    check-cast v11, La/lok0;

    .line 1095
    .line 1096
    iget v11, v11, La/lok0;->a:I

    .line 1097
    .line 1098
    iget v12, v6, La/d0t;->O:I

    .line 1099
    .line 1100
    if-ne v11, v12, :cond_2f

    .line 1101
    .line 1102
    goto :goto_25

    .line 1103
    :cond_30
    move-object/from16 v10, p0

    .line 1104
    .line 1105
    :goto_25
    check-cast v10, La/lok0;

    .line 1106
    .line 1107
    iget-object v1, v1, La/viw;->c:La/ypl0;

    .line 1108
    .line 1109
    iget-object v1, v1, La/ypl0;->c:La/lel0;

    .line 1110
    .line 1111
    iget-object v9, v1, La/lel0;->j:Ljava/lang/String;

    .line 1112
    .line 1113
    new-instance v12, Ljava/util/ArrayList;

    .line 1114
    .line 1115
    const/16 v1, 0xa

    .line 1116
    .line 1117
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1118
    .line 1119
    .line 1120
    move-result v1

    .line 1121
    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1122
    .line 1123
    .line 1124
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    :goto_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1129
    .line 1130
    .line 1131
    move-result v1

    .line 1132
    if-eqz v1, :cond_31

    .line 1133
    .line 1134
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v1

    .line 1138
    check-cast v1, La/lok0;

    .line 1139
    .line 1140
    iget v1, v1, La/lok0;->a:I

    .line 1141
    .line 1142
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v1

    .line 1146
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1147
    .line 1148
    .line 1149
    goto :goto_26

    .line 1150
    :cond_31
    if-eqz v10, :cond_32

    .line 1151
    .line 1152
    iget-boolean v1, v10, La/lok0;->n:Z

    .line 1153
    .line 1154
    move/from16 v16, v1

    .line 1155
    .line 1156
    goto :goto_27

    .line 1157
    :cond_32
    const/16 v16, 0x0

    .line 1158
    .line 1159
    :goto_27
    if-eqz v10, :cond_33

    .line 1160
    .line 1161
    iget-boolean v1, v10, La/lok0;->p:Z

    .line 1162
    .line 1163
    move/from16 v17, v1

    .line 1164
    .line 1165
    goto :goto_28

    .line 1166
    :cond_33
    const/16 v17, 0x0

    .line 1167
    .line 1168
    :goto_28
    iget-object v0, v6, La/d0t;->K:Ljava/util/List;

    .line 1169
    .line 1170
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1171
    .line 1172
    .line 1173
    move-result v0

    .line 1174
    if-eqz v0, :cond_37

    .line 1175
    .line 1176
    iget-object v0, v6, La/d0t;->k:Ljava/util/List;

    .line 1177
    .line 1178
    if-eqz v0, :cond_34

    .line 1179
    .line 1180
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1181
    .line 1182
    .line 1183
    move-result v1

    .line 1184
    if-eqz v1, :cond_34

    .line 1185
    .line 1186
    goto :goto_29

    .line 1187
    :cond_34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    :cond_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1192
    .line 1193
    .line 1194
    move-result v1

    .line 1195
    if-eqz v1, :cond_36

    .line 1196
    .line 1197
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v1

    .line 1201
    check-cast v1, La/d0t;

    .line 1202
    .line 1203
    iget-object v1, v1, La/d0t;->K:Ljava/util/List;

    .line 1204
    .line 1205
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1206
    .line 1207
    .line 1208
    move-result v1

    .line 1209
    if-nez v1, :cond_35

    .line 1210
    .line 1211
    goto :goto_2a

    .line 1212
    :cond_36
    :goto_29
    move-object/from16 v28, v29

    .line 1213
    .line 1214
    :cond_37
    :goto_2a
    if-eqz v10, :cond_38

    .line 1215
    .line 1216
    iget-object v0, v10, La/lok0;->u:Ljava/lang/String;

    .line 1217
    .line 1218
    goto :goto_2b

    .line 1219
    :cond_38
    move-object/from16 v0, p0

    .line 1220
    .line 1221
    :goto_2b
    if-nez v0, :cond_39

    .line 1222
    .line 1223
    move-object/from16 v10, v30

    .line 1224
    .line 1225
    goto :goto_2c

    .line 1226
    :cond_39
    move-object v10, v0

    .line 1227
    :goto_2c
    iget-object v13, v2, La/hkw;->c:Ljava/util/ArrayList;

    .line 1228
    .line 1229
    iget-object v0, v2, La/hkw;->b:La/ikw;

    .line 1230
    .line 1231
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1232
    .line 1233
    .line 1234
    move-result v0

    .line 1235
    if-eqz v0, :cond_3b

    .line 1236
    .line 1237
    const/4 v1, 0x1

    .line 1238
    if-ne v0, v1, :cond_3a

    .line 1239
    .line 1240
    const/4 v1, 0x0

    .line 1241
    new-array v0, v1, [Ljava/lang/Object;

    .line 1242
    .line 1243
    iget-object v2, v7, La/ctf0;->b:La/lsm0;

    .line 1244
    .line 1245
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    const v1, 0x7f1316d9

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v2, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v0

    .line 1256
    :goto_2d
    move-object v11, v0

    .line 1257
    move-object v0, v8

    .line 1258
    move-object/from16 v8, v28

    .line 1259
    .line 1260
    goto :goto_2e

    .line 1261
    :cond_3a
    invoke-static {}, La/t9f;->b()V

    .line 1262
    .line 1263
    .line 1264
    move-object/from16 v10, p0

    .line 1265
    .line 1266
    goto :goto_30

    .line 1267
    :cond_3b
    const/4 v1, 0x0

    .line 1268
    new-array v0, v1, [Ljava/lang/Object;

    .line 1269
    .line 1270
    iget-object v2, v7, La/ctf0;->b:La/lsm0;

    .line 1271
    .line 1272
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v0

    .line 1276
    const v1, 0x7f1316d0

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v2, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v0

    .line 1283
    goto :goto_2d

    .line 1284
    :goto_2e
    invoke-static/range {v5 .. v17}, La/ieb;->Z(La/y78;La/d0t;La/ctf0;La/m5l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;ZZZZ)La/grh;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v1

    .line 1288
    new-instance v10, La/uiw;

    .line 1289
    .line 1290
    invoke-direct {v10, v1, v4}, La/uiw;-><init>(La/grh;Z)V

    .line 1291
    .line 1292
    .line 1293
    goto :goto_2f

    .line 1294
    :cond_3c
    move-object v3, v6

    .line 1295
    move-object v0, v8

    .line 1296
    move-object/from16 v10, p0

    .line 1297
    .line 1298
    :goto_2f
    invoke-direct {v3, v0, v10, v4}, La/fkw;-><init>(La/n0x;La/uiw;Z)V

    .line 1299
    .line 1300
    .line 1301
    move-object v10, v3

    .line 1302
    :goto_30
    return-object v10

    .line 1303
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
