.class public final La/n460;
.super La/x460;
.source "SourceFile"


# instance fields
.field public final c:La/lm40;

.field public final d:La/v610;

.field public final e:La/u710;

.field public f:La/s460;

.field public g:La/woa0;

.field public h:Z

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(La/lm40;)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/x460;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/n460;->c:La/lm40;

    .line 5
    .line 6
    new-instance p1, La/v610;

    .line 7
    .line 8
    invoke-direct {p1}, La/v610;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    new-array v1, v0, [J

    .line 13
    .line 14
    iput-object v1, p1, La/v610;->c:[J

    .line 15
    .line 16
    iput-object p1, p0, La/n460;->d:La/v610;

    .line 17
    .line 18
    new-instance p1, La/u710;

    .line 19
    .line 20
    invoke-direct {p1, v0}, La/u710;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/n460;->e:La/u710;

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, La/n460;->i:Z

    .line 27
    .line 28
    iput-boolean p1, p0, La/n460;->j:Z

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(La/u710;La/j6z;La/cgx0;Z)Z
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-super/range {p0 .. p4}, La/x460;->a(La/u710;La/j6z;La/cgx0;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget-object v5, v0, La/n460;->c:La/lm40;

    .line 14
    .line 15
    iget-boolean v6, v5, La/lm40;->n:Z

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    if-nez v6, :cond_0

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_0
    const/4 v8, 0x0

    .line 22
    :goto_0
    if-eqz v5, :cond_8

    .line 23
    .line 24
    instance-of v10, v5, La/gpa0;

    .line 25
    .line 26
    const/16 v11, 0x10

    .line 27
    .line 28
    if-eqz v10, :cond_1

    .line 29
    .line 30
    check-cast v5, La/gpa0;

    .line 31
    .line 32
    invoke-static {v5, v11}, La/vcc;->X(La/yzj;I)La/s460;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iput-object v5, v0, La/n460;->f:La/s460;

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_1
    iget v10, v5, La/lm40;->c:I

    .line 40
    .line 41
    and-int/2addr v10, v11

    .line 42
    if-eqz v10, :cond_7

    .line 43
    .line 44
    instance-of v10, v5, La/f3k;

    .line 45
    .line 46
    if-eqz v10, :cond_7

    .line 47
    .line 48
    move-object v10, v5

    .line 49
    check-cast v10, La/f3k;

    .line 50
    .line 51
    iget-object v10, v10, La/f3k;->p:La/lm40;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    :goto_1
    if-eqz v10, :cond_6

    .line 55
    .line 56
    iget v12, v10, La/lm40;->c:I

    .line 57
    .line 58
    and-int/2addr v12, v11

    .line 59
    if-eqz v12, :cond_5

    .line 60
    .line 61
    add-int/lit8 v9, v9, 0x1

    .line 62
    .line 63
    if-ne v9, v7, :cond_2

    .line 64
    .line 65
    move-object v5, v10

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    if-nez v8, :cond_3

    .line 68
    .line 69
    new-instance v8, La/xz40;

    .line 70
    .line 71
    new-array v12, v11, [La/lm40;

    .line 72
    .line 73
    invoke-direct {v8, v12}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    if-eqz v5, :cond_4

    .line 77
    .line 78
    invoke-virtual {v8, v5}, La/xz40;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    :cond_4
    invoke-virtual {v8, v10}, La/xz40;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_2
    iget-object v10, v10, La/lm40;->f:La/lm40;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_6
    if-ne v9, v7, :cond_7

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_7
    :goto_3
    invoke-static {v8}, La/vcc;->V(La/xz40;)La/lm40;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    goto :goto_0

    .line 96
    :cond_8
    iget-object v5, v0, La/n460;->f:La/s460;

    .line 97
    .line 98
    if-nez v5, :cond_9

    .line 99
    .line 100
    :goto_4
    return v7

    .line 101
    :cond_9
    invoke-virtual {v1}, La/u710;->h()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    const/4 v8, 0x0

    .line 106
    :goto_5
    iget-object v10, v0, La/n460;->d:La/v610;

    .line 107
    .line 108
    iget-object v11, v0, La/n460;->e:La/u710;

    .line 109
    .line 110
    if-ge v8, v5, :cond_10

    .line 111
    .line 112
    invoke-virtual {v1, v8}, La/u710;->e(I)J

    .line 113
    .line 114
    .line 115
    move-result-wide v12

    .line 116
    invoke-virtual {v1, v8}, La/u710;->i(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    check-cast v14, La/dpa0;

    .line 121
    .line 122
    invoke-virtual {v10, v12, v13}, La/v610;->c(J)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-eqz v10, :cond_f

    .line 127
    .line 128
    move v15, v7

    .line 129
    iget-wide v6, v14, La/dpa0;->g:J

    .line 130
    .line 131
    iget-wide v9, v14, La/dpa0;->c:J

    .line 132
    .line 133
    const-wide v16, 0x7fffffff7fffffffL

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    and-long v18, v6, v16

    .line 139
    .line 140
    const-wide v20, 0x7fffff007fffffL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    add-long v18, v18, v20

    .line 146
    .line 147
    const-wide v22, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    and-long v18, v18, v22

    .line 153
    .line 154
    const-wide/16 v24, 0x0

    .line 155
    .line 156
    cmp-long v18, v18, v24

    .line 157
    .line 158
    if-nez v18, :cond_e

    .line 159
    .line 160
    and-long v18, v9, v16

    .line 161
    .line 162
    add-long v18, v18, v20

    .line 163
    .line 164
    and-long v18, v18, v22

    .line 165
    .line 166
    cmp-long v18, v18, v24

    .line 167
    .line 168
    if-nez v18, :cond_e

    .line 169
    .line 170
    move/from16 v18, v15

    .line 171
    .line 172
    new-instance v15, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v14}, La/dpa0;->b()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v19

    .line 178
    move/from16 v49, v4

    .line 179
    .line 180
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v14}, La/dpa0;->b()Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    move/from16 v19, v5

    .line 192
    .line 193
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    move/from16 v50, v8

    .line 198
    .line 199
    const/4 v8, 0x0

    .line 200
    :goto_6
    if-ge v8, v5, :cond_b

    .line 201
    .line 202
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v26

    .line 206
    move-object/from16 v27, v4

    .line 207
    .line 208
    move-object/from16 v4, v26

    .line 209
    .line 210
    check-cast v4, La/ayv;

    .line 211
    .line 212
    move-object/from16 v51, v11

    .line 213
    .line 214
    move-wide/from16 v52, v12

    .line 215
    .line 216
    iget-wide v11, v4, La/ayv;->b:J

    .line 217
    .line 218
    and-long v28, v11, v16

    .line 219
    .line 220
    add-long v28, v28, v20

    .line 221
    .line 222
    and-long v28, v28, v22

    .line 223
    .line 224
    cmp-long v13, v28, v24

    .line 225
    .line 226
    if-nez v13, :cond_a

    .line 227
    .line 228
    new-instance v28, La/ayv;

    .line 229
    .line 230
    move-object/from16 v54, v14

    .line 231
    .line 232
    iget-wide v13, v4, La/ayv;->a:J

    .line 233
    .line 234
    move/from16 v26, v5

    .line 235
    .line 236
    iget-object v5, v0, La/n460;->f:La/s460;

    .line 237
    .line 238
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5, v2, v11, v12}, La/s460;->F(La/j6z;J)J

    .line 242
    .line 243
    .line 244
    move-result-wide v31

    .line 245
    iget v5, v4, La/ayv;->c:F

    .line 246
    .line 247
    iget-wide v11, v4, La/ayv;->d:J

    .line 248
    .line 249
    move/from16 v33, v5

    .line 250
    .line 251
    iget-wide v4, v4, La/ayv;->e:J

    .line 252
    .line 253
    move-wide/from16 v36, v4

    .line 254
    .line 255
    move-wide/from16 v34, v11

    .line 256
    .line 257
    move-wide/from16 v29, v13

    .line 258
    .line 259
    invoke-direct/range {v28 .. v37}, La/ayv;-><init>(JJFJJ)V

    .line 260
    .line 261
    .line 262
    move-object/from16 v4, v28

    .line 263
    .line 264
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_a
    move/from16 v26, v5

    .line 269
    .line 270
    move-object/from16 v54, v14

    .line 271
    .line 272
    :goto_7
    add-int/lit8 v8, v8, 0x1

    .line 273
    .line 274
    move/from16 v5, v26

    .line 275
    .line 276
    move-object/from16 v4, v27

    .line 277
    .line 278
    move-object/from16 v11, v51

    .line 279
    .line 280
    move-wide/from16 v12, v52

    .line 281
    .line 282
    move-object/from16 v14, v54

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_b
    move-object/from16 v51, v11

    .line 286
    .line 287
    move-wide/from16 v52, v12

    .line 288
    .line 289
    move-object/from16 v54, v14

    .line 290
    .line 291
    iget-object v4, v0, La/n460;->f:La/s460;

    .line 292
    .line 293
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v4, v2, v6, v7}, La/s460;->F(La/j6z;J)J

    .line 297
    .line 298
    .line 299
    move-result-wide v37

    .line 300
    iget-object v4, v0, La/n460;->f:La/s460;

    .line 301
    .line 302
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v4, v2, v9, v10}, La/s460;->F(La/j6z;J)J

    .line 306
    .line 307
    .line 308
    move-result-wide v31

    .line 309
    iget-wide v4, v14, La/dpa0;->a:J

    .line 310
    .line 311
    iget-wide v6, v14, La/dpa0;->b:J

    .line 312
    .line 313
    iget-boolean v8, v14, La/dpa0;->d:Z

    .line 314
    .line 315
    iget-wide v9, v14, La/dpa0;->f:J

    .line 316
    .line 317
    iget-boolean v11, v14, La/dpa0;->h:Z

    .line 318
    .line 319
    iget v12, v14, La/dpa0;->i:I

    .line 320
    .line 321
    move-wide/from16 v27, v4

    .line 322
    .line 323
    iget-wide v4, v14, La/dpa0;->j:J

    .line 324
    .line 325
    iget v13, v14, La/dpa0;->e:F

    .line 326
    .line 327
    new-instance v26, La/dpa0;

    .line 328
    .line 329
    iget v2, v14, La/dpa0;->k:F

    .line 330
    .line 331
    move-wide/from16 v42, v4

    .line 332
    .line 333
    iget-wide v4, v14, La/dpa0;->l:J

    .line 334
    .line 335
    move-wide/from16 v45, v4

    .line 336
    .line 337
    iget-wide v4, v14, La/dpa0;->n:J

    .line 338
    .line 339
    move/from16 v44, v2

    .line 340
    .line 341
    move-wide/from16 v47, v4

    .line 342
    .line 343
    move-wide/from16 v29, v6

    .line 344
    .line 345
    move/from16 v33, v8

    .line 346
    .line 347
    move-wide/from16 v35, v9

    .line 348
    .line 349
    move/from16 v39, v11

    .line 350
    .line 351
    move/from16 v40, v12

    .line 352
    .line 353
    move/from16 v34, v13

    .line 354
    .line 355
    move-object/from16 v41, v15

    .line 356
    .line 357
    invoke-direct/range {v26 .. v48}, La/dpa0;-><init>(JJJZFJJZILjava/util/ArrayList;JFJJ)V

    .line 358
    .line 359
    .line 360
    move-object/from16 v2, v26

    .line 361
    .line 362
    iget-object v4, v14, La/dpa0;->q:La/dpa0;

    .line 363
    .line 364
    if-nez v4, :cond_c

    .line 365
    .line 366
    move-object v4, v14

    .line 367
    :cond_c
    iput-object v4, v2, La/dpa0;->q:La/dpa0;

    .line 368
    .line 369
    iget-object v4, v14, La/dpa0;->q:La/dpa0;

    .line 370
    .line 371
    if-nez v4, :cond_d

    .line 372
    .line 373
    goto :goto_8

    .line 374
    :cond_d
    move-object v14, v4

    .line 375
    :goto_8
    iput-object v14, v2, La/dpa0;->q:La/dpa0;

    .line 376
    .line 377
    move-object/from16 v6, v51

    .line 378
    .line 379
    move-wide/from16 v4, v52

    .line 380
    .line 381
    invoke-virtual {v6, v2, v4, v5}, La/u710;->f(Ljava/lang/Object;J)V

    .line 382
    .line 383
    .line 384
    goto :goto_9

    .line 385
    :cond_e
    move/from16 v49, v4

    .line 386
    .line 387
    move/from16 v19, v5

    .line 388
    .line 389
    move/from16 v50, v8

    .line 390
    .line 391
    move/from16 v18, v15

    .line 392
    .line 393
    goto :goto_9

    .line 394
    :cond_f
    move/from16 v49, v4

    .line 395
    .line 396
    move/from16 v19, v5

    .line 397
    .line 398
    move/from16 v18, v7

    .line 399
    .line 400
    move/from16 v50, v8

    .line 401
    .line 402
    :goto_9
    add-int/lit8 v8, v50, 0x1

    .line 403
    .line 404
    move-object/from16 v2, p2

    .line 405
    .line 406
    move/from16 v7, v18

    .line 407
    .line 408
    move/from16 v5, v19

    .line 409
    .line 410
    move/from16 v4, v49

    .line 411
    .line 412
    goto/16 :goto_5

    .line 413
    .line 414
    :cond_10
    move/from16 v49, v4

    .line 415
    .line 416
    move/from16 v18, v7

    .line 417
    .line 418
    move-object v6, v11

    .line 419
    invoke-virtual {v6}, La/u710;->d()Z

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    if-eqz v2, :cond_11

    .line 424
    .line 425
    const/4 v2, 0x0

    .line 426
    iput v2, v10, La/v610;->b:I

    .line 427
    .line 428
    iget-object v0, v0, La/x460;->a:La/xz40;

    .line 429
    .line 430
    invoke-virtual {v0}, La/xz40;->g()V

    .line 431
    .line 432
    .line 433
    return v18

    .line 434
    :cond_11
    iget v2, v10, La/v610;->b:I

    .line 435
    .line 436
    add-int/lit8 v2, v2, -0x1

    .line 437
    .line 438
    :goto_a
    const/4 v4, -0x1

    .line 439
    if-ge v4, v2, :cond_15

    .line 440
    .line 441
    iget-object v5, v10, La/v610;->c:[J

    .line 442
    .line 443
    aget-wide v7, v5, v2

    .line 444
    .line 445
    invoke-virtual {v1, v7, v8}, La/u710;->c(J)I

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    if-ltz v5, :cond_12

    .line 450
    .line 451
    goto :goto_c

    .line 452
    :cond_12
    iget v5, v10, La/v610;->b:I

    .line 453
    .line 454
    if-ge v2, v5, :cond_14

    .line 455
    .line 456
    add-int/lit8 v5, v5, -0x1

    .line 457
    .line 458
    move v7, v2

    .line 459
    :goto_b
    if-ge v7, v5, :cond_13

    .line 460
    .line 461
    iget-object v8, v10, La/v610;->c:[J

    .line 462
    .line 463
    add-int/lit8 v9, v7, 0x1

    .line 464
    .line 465
    aget-wide v11, v8, v9

    .line 466
    .line 467
    aput-wide v11, v8, v7

    .line 468
    .line 469
    move v7, v9

    .line 470
    goto :goto_b

    .line 471
    :cond_13
    iget v5, v10, La/v610;->b:I

    .line 472
    .line 473
    add-int/2addr v5, v4

    .line 474
    iput v5, v10, La/v610;->b:I

    .line 475
    .line 476
    :cond_14
    :goto_c
    add-int/lit8 v2, v2, -0x1

    .line 477
    .line 478
    goto :goto_a

    .line 479
    :cond_15
    new-instance v1, Ljava/util/ArrayList;

    .line 480
    .line 481
    invoke-virtual {v6}, La/u710;->h()I

    .line 482
    .line 483
    .line 484
    move-result v2

    .line 485
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v6}, La/u710;->h()I

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    const/4 v4, 0x0

    .line 493
    :goto_d
    if-ge v4, v2, :cond_16

    .line 494
    .line 495
    invoke-virtual {v6, v4}, La/u710;->i(I)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    add-int/lit8 v4, v4, 0x1

    .line 503
    .line 504
    goto :goto_d

    .line 505
    :cond_16
    new-instance v2, La/woa0;

    .line 506
    .line 507
    invoke-direct {v2, v1, v3}, La/woa0;-><init>(Ljava/util/List;La/cgx0;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 511
    .line 512
    .line 513
    move-result v4

    .line 514
    const/4 v5, 0x0

    .line 515
    :goto_e
    if-ge v5, v4, :cond_18

    .line 516
    .line 517
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v6

    .line 521
    move-object v7, v6

    .line 522
    check-cast v7, La/dpa0;

    .line 523
    .line 524
    iget-wide v7, v7, La/dpa0;->a:J

    .line 525
    .line 526
    invoke-virtual {v3, v7, v8}, La/cgx0;->d(J)Z

    .line 527
    .line 528
    .line 529
    move-result v7

    .line 530
    if-eqz v7, :cond_17

    .line 531
    .line 532
    goto :goto_f

    .line 533
    :cond_17
    add-int/lit8 v5, v5, 0x1

    .line 534
    .line 535
    goto :goto_e

    .line 536
    :cond_18
    const/4 v6, 0x0

    .line 537
    :goto_f
    check-cast v6, La/dpa0;

    .line 538
    .line 539
    const/4 v1, 0x3

    .line 540
    if-eqz v6, :cond_25

    .line 541
    .line 542
    iget-boolean v3, v6, La/dpa0;->d:Z

    .line 543
    .line 544
    if-nez p4, :cond_19

    .line 545
    .line 546
    const/4 v4, 0x0

    .line 547
    iput-boolean v4, v0, La/n460;->i:Z

    .line 548
    .line 549
    move v5, v4

    .line 550
    goto :goto_14

    .line 551
    :cond_19
    const/4 v4, 0x0

    .line 552
    iget-boolean v5, v0, La/n460;->i:Z

    .line 553
    .line 554
    if-nez v5, :cond_1f

    .line 555
    .line 556
    if-nez v3, :cond_1a

    .line 557
    .line 558
    iget-boolean v7, v6, La/dpa0;->h:Z

    .line 559
    .line 560
    if-eqz v7, :cond_1f

    .line 561
    .line 562
    :cond_1a
    iget-object v5, v0, La/n460;->f:La/s460;

    .line 563
    .line 564
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    iget-wide v7, v5, La/pu90;->c:J

    .line 568
    .line 569
    iget-wide v5, v6, La/dpa0;->c:J

    .line 570
    .line 571
    const/16 v9, 0x20

    .line 572
    .line 573
    shr-long v10, v5, v9

    .line 574
    .line 575
    long-to-int v10, v10

    .line 576
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 577
    .line 578
    .line 579
    move-result v10

    .line 580
    const-wide v11, 0xffffffffL

    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    and-long/2addr v5, v11

    .line 586
    long-to-int v5, v5

    .line 587
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 588
    .line 589
    .line 590
    move-result v5

    .line 591
    shr-long v13, v7, v9

    .line 592
    .line 593
    long-to-int v6, v13

    .line 594
    and-long/2addr v7, v11

    .line 595
    long-to-int v7, v7

    .line 596
    const/4 v8, 0x0

    .line 597
    cmpg-float v9, v10, v8

    .line 598
    .line 599
    if-gez v9, :cond_1b

    .line 600
    .line 601
    move/from16 v9, v18

    .line 602
    .line 603
    goto :goto_10

    .line 604
    :cond_1b
    move v9, v4

    .line 605
    :goto_10
    int-to-float v6, v6

    .line 606
    cmpl-float v6, v10, v6

    .line 607
    .line 608
    if-lez v6, :cond_1c

    .line 609
    .line 610
    move/from16 v6, v18

    .line 611
    .line 612
    goto :goto_11

    .line 613
    :cond_1c
    move v6, v4

    .line 614
    :goto_11
    or-int/2addr v6, v9

    .line 615
    cmpg-float v8, v5, v8

    .line 616
    .line 617
    if-gez v8, :cond_1d

    .line 618
    .line 619
    move/from16 v8, v18

    .line 620
    .line 621
    goto :goto_12

    .line 622
    :cond_1d
    move v8, v4

    .line 623
    :goto_12
    or-int/2addr v6, v8

    .line 624
    int-to-float v7, v7

    .line 625
    cmpl-float v5, v5, v7

    .line 626
    .line 627
    if-lez v5, :cond_1e

    .line 628
    .line 629
    move/from16 v5, v18

    .line 630
    .line 631
    goto :goto_13

    .line 632
    :cond_1e
    move v5, v4

    .line 633
    :goto_13
    or-int/2addr v5, v6

    .line 634
    xor-int/lit8 v5, v5, 0x1

    .line 635
    .line 636
    iput-boolean v5, v0, La/n460;->i:Z

    .line 637
    .line 638
    :cond_1f
    :goto_14
    iget-boolean v6, v0, La/n460;->h:Z

    .line 639
    .line 640
    const/4 v7, 0x5

    .line 641
    const/4 v8, 0x4

    .line 642
    if-eq v5, v6, :cond_23

    .line 643
    .line 644
    iget v9, v2, La/woa0;->f:I

    .line 645
    .line 646
    if-ne v9, v1, :cond_20

    .line 647
    .line 648
    goto :goto_15

    .line 649
    :cond_20
    if-ne v9, v8, :cond_21

    .line 650
    .line 651
    goto :goto_15

    .line 652
    :cond_21
    if-ne v9, v7, :cond_23

    .line 653
    .line 654
    :goto_15
    if-eqz v5, :cond_22

    .line 655
    .line 656
    move v7, v8

    .line 657
    :cond_22
    iput v7, v2, La/woa0;->f:I

    .line 658
    .line 659
    goto :goto_16

    .line 660
    :cond_23
    iget v9, v2, La/woa0;->f:I

    .line 661
    .line 662
    if-ne v9, v8, :cond_24

    .line 663
    .line 664
    if-eqz v6, :cond_24

    .line 665
    .line 666
    iget-boolean v6, v0, La/n460;->j:Z

    .line 667
    .line 668
    if-nez v6, :cond_24

    .line 669
    .line 670
    iput v1, v2, La/woa0;->f:I

    .line 671
    .line 672
    goto :goto_16

    .line 673
    :cond_24
    if-ne v9, v7, :cond_26

    .line 674
    .line 675
    if-eqz v5, :cond_26

    .line 676
    .line 677
    if-eqz v3, :cond_26

    .line 678
    .line 679
    iput v1, v2, La/woa0;->f:I

    .line 680
    .line 681
    goto :goto_16

    .line 682
    :cond_25
    const/4 v4, 0x0

    .line 683
    :cond_26
    :goto_16
    if-nez v49, :cond_2a

    .line 684
    .line 685
    iget v3, v2, La/woa0;->f:I

    .line 686
    .line 687
    if-ne v3, v1, :cond_2a

    .line 688
    .line 689
    iget-object v1, v0, La/n460;->g:La/woa0;

    .line 690
    .line 691
    if-eqz v1, :cond_2a

    .line 692
    .line 693
    iget-object v1, v1, La/woa0;->a:Ljava/util/List;

    .line 694
    .line 695
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 696
    .line 697
    .line 698
    move-result v3

    .line 699
    iget-object v5, v2, La/woa0;->a:Ljava/util/List;

    .line 700
    .line 701
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 702
    .line 703
    .line 704
    move-result v6

    .line 705
    if-eq v3, v6, :cond_27

    .line 706
    .line 707
    goto :goto_18

    .line 708
    :cond_27
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 709
    .line 710
    .line 711
    move-result v3

    .line 712
    move v6, v4

    .line 713
    :goto_17
    if-ge v6, v3, :cond_29

    .line 714
    .line 715
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v7

    .line 719
    check-cast v7, La/dpa0;

    .line 720
    .line 721
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v8

    .line 725
    check-cast v8, La/dpa0;

    .line 726
    .line 727
    iget-wide v9, v7, La/dpa0;->c:J

    .line 728
    .line 729
    iget-wide v7, v8, La/dpa0;->c:J

    .line 730
    .line 731
    invoke-static {v9, v10, v7, v8}, La/ne60;->c(JJ)Z

    .line 732
    .line 733
    .line 734
    move-result v7

    .line 735
    if-nez v7, :cond_28

    .line 736
    .line 737
    goto :goto_18

    .line 738
    :cond_28
    add-int/lit8 v6, v6, 0x1

    .line 739
    .line 740
    goto :goto_17

    .line 741
    :cond_29
    move v7, v4

    .line 742
    goto :goto_19

    .line 743
    :cond_2a
    :goto_18
    move/from16 v7, v18

    .line 744
    .line 745
    :goto_19
    iput-object v2, v0, La/n460;->g:La/woa0;

    .line 746
    .line 747
    return v7
.end method

.method public final b(La/cgx0;)V
    .locals 10

    .line 1
    invoke-super {p0, p1}, La/x460;->b(La/cgx0;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/n460;->g:La/woa0;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean v1, p0, La/n460;->i:Z

    .line 10
    .line 11
    iput-boolean v1, p0, La/n460;->h:Z

    .line 12
    .line 13
    iget-object v1, v0, La/woa0;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_4

    .line 22
    .line 23
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    check-cast v5, La/dpa0;

    .line 28
    .line 29
    iget-boolean v6, v5, La/dpa0;->d:Z

    .line 30
    .line 31
    iget-wide v7, v5, La/dpa0;->a:J

    .line 32
    .line 33
    invoke-virtual {p1, v7, v8}, La/cgx0;->d(J)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    iget-boolean v9, p0, La/n460;->i:Z

    .line 38
    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    :cond_1
    if-nez v6, :cond_3

    .line 44
    .line 45
    if-nez v9, :cond_3

    .line 46
    .line 47
    :cond_2
    iget-object v5, p0, La/n460;->d:La/v610;

    .line 48
    .line 49
    invoke-virtual {v5, v7, v8}, La/v610;->e(J)V

    .line 50
    .line 51
    .line 52
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    iput-boolean v3, p0, La/n460;->i:Z

    .line 56
    .line 57
    iget p1, v0, La/woa0;->f:I

    .line 58
    .line 59
    const/4 v0, 0x5

    .line 60
    if-ne p1, v0, :cond_5

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    :cond_5
    iput-boolean v3, p0, La/n460;->j:Z

    .line 64
    .line 65
    return-void
.end method

.method public final c()V
    .locals 8

    .line 1
    iget-object v0, p0, La/x460;->a:La/xz40;

    .line 2
    .line 3
    iget-object v1, v0, La/xz40;->a:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v0, v0, La/xz40;->c:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v0, :cond_0

    .line 10
    .line 11
    aget-object v4, v1, v3

    .line 12
    .line 13
    check-cast v4, La/n460;

    .line 14
    .line 15
    invoke-virtual {v4}, La/n460;->c()V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iget-object p0, p0, La/n460;->c:La/lm40;

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    :goto_1
    if-eqz p0, :cond_8

    .line 26
    .line 27
    instance-of v3, p0, La/gpa0;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    check-cast p0, La/gpa0;

    .line 32
    .line 33
    invoke-interface {p0}, La/gpa0;->n0()V

    .line 34
    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    iget v3, p0, La/lm40;->c:I

    .line 38
    .line 39
    const/16 v4, 0x10

    .line 40
    .line 41
    and-int/2addr v3, v4

    .line 42
    if-eqz v3, :cond_7

    .line 43
    .line 44
    instance-of v3, p0, La/f3k;

    .line 45
    .line 46
    if-eqz v3, :cond_7

    .line 47
    .line 48
    move-object v3, p0

    .line 49
    check-cast v3, La/f3k;

    .line 50
    .line 51
    iget-object v3, v3, La/f3k;->p:La/lm40;

    .line 52
    .line 53
    move v5, v2

    .line 54
    :goto_2
    const/4 v6, 0x1

    .line 55
    if-eqz v3, :cond_6

    .line 56
    .line 57
    iget v7, v3, La/lm40;->c:I

    .line 58
    .line 59
    and-int/2addr v7, v4

    .line 60
    if-eqz v7, :cond_5

    .line 61
    .line 62
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    if-ne v5, v6, :cond_2

    .line 65
    .line 66
    move-object p0, v3

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    if-nez v1, :cond_3

    .line 69
    .line 70
    new-instance v1, La/xz40;

    .line 71
    .line 72
    new-array v6, v4, [La/lm40;

    .line 73
    .line 74
    invoke-direct {v1, v6}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    if-eqz p0, :cond_4

    .line 78
    .line 79
    invoke-virtual {v1, p0}, La/xz40;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object p0, v0

    .line 83
    :cond_4
    invoke-virtual {v1, v3}, La/xz40;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    :goto_3
    iget-object v3, v3, La/lm40;->f:La/lm40;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_6
    if-ne v5, v6, :cond_7

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_7
    :goto_4
    invoke-static {v1}, La/vcc;->V(La/xz40;)La/lm40;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    goto :goto_1

    .line 97
    :cond_8
    return-void
.end method

.method public final d(La/cgx0;)Z
    .locals 14

    .line 1
    iget-object v0, p0, La/n460;->e:La/u710;

    .line 2
    .line 3
    invoke-virtual {v0}, La/u710;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, La/n460;->c:La/lm40;

    .line 14
    .line 15
    iget-boolean v4, v1, La/lm40;->n:Z

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_1
    iget-object v4, v1, La/lm40;->h:La/s460;

    .line 22
    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    iget-object v4, v4, La/s460;->u:La/e7z;

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    invoke-virtual {v4}, La/e7z;->J()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move v4, v3

    .line 35
    :goto_0
    if-nez v4, :cond_3

    .line 36
    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_3
    iget-object v4, p0, La/n460;->g:La/woa0;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v5, p0, La/n460;->f:La/s460;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-wide v5, v5, La/pu90;->c:J

    .line 50
    .line 51
    move-object v7, v1

    .line 52
    move-object v8, v2

    .line 53
    :goto_1
    const/4 v9, 0x1

    .line 54
    if-eqz v7, :cond_b

    .line 55
    .line 56
    instance-of v10, v7, La/gpa0;

    .line 57
    .line 58
    if-eqz v10, :cond_4

    .line 59
    .line 60
    check-cast v7, La/gpa0;

    .line 61
    .line 62
    sget-object v9, La/xoa0;->c:La/xoa0;

    .line 63
    .line 64
    invoke-interface {v7, v4, v9, v5, v6}, La/gpa0;->h(La/woa0;La/xoa0;J)V

    .line 65
    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    iget v10, v7, La/lm40;->c:I

    .line 69
    .line 70
    const/16 v11, 0x10

    .line 71
    .line 72
    and-int/2addr v10, v11

    .line 73
    if-eqz v10, :cond_a

    .line 74
    .line 75
    instance-of v10, v7, La/f3k;

    .line 76
    .line 77
    if-eqz v10, :cond_a

    .line 78
    .line 79
    move-object v10, v7

    .line 80
    check-cast v10, La/f3k;

    .line 81
    .line 82
    iget-object v10, v10, La/f3k;->p:La/lm40;

    .line 83
    .line 84
    move v12, v3

    .line 85
    :goto_2
    if-eqz v10, :cond_9

    .line 86
    .line 87
    iget v13, v10, La/lm40;->c:I

    .line 88
    .line 89
    and-int/2addr v13, v11

    .line 90
    if-eqz v13, :cond_8

    .line 91
    .line 92
    add-int/lit8 v12, v12, 0x1

    .line 93
    .line 94
    if-ne v12, v9, :cond_5

    .line 95
    .line 96
    move-object v7, v10

    .line 97
    goto :goto_3

    .line 98
    :cond_5
    if-nez v8, :cond_6

    .line 99
    .line 100
    new-instance v8, La/xz40;

    .line 101
    .line 102
    new-array v13, v11, [La/lm40;

    .line 103
    .line 104
    invoke-direct {v8, v13}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    if-eqz v7, :cond_7

    .line 108
    .line 109
    invoke-virtual {v8, v7}, La/xz40;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    move-object v7, v2

    .line 113
    :cond_7
    invoke-virtual {v8, v10}, La/xz40;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_8
    :goto_3
    iget-object v10, v10, La/lm40;->f:La/lm40;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_9
    if-ne v12, v9, :cond_a

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_a
    :goto_4
    invoke-static {v8}, La/vcc;->V(La/xz40;)La/lm40;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    goto :goto_1

    .line 127
    :cond_b
    iget-boolean v1, v1, La/lm40;->n:Z

    .line 128
    .line 129
    if-eqz v1, :cond_c

    .line 130
    .line 131
    iget-object v1, p0, La/x460;->a:La/xz40;

    .line 132
    .line 133
    iget-object v4, v1, La/xz40;->a:[Ljava/lang/Object;

    .line 134
    .line 135
    iget v1, v1, La/xz40;->c:I

    .line 136
    .line 137
    :goto_5
    if-ge v3, v1, :cond_c

    .line 138
    .line 139
    aget-object v5, v4, v3

    .line 140
    .line 141
    check-cast v5, La/n460;

    .line 142
    .line 143
    invoke-virtual {v5, p1}, La/n460;->d(La/cgx0;)Z

    .line 144
    .line 145
    .line 146
    add-int/lit8 v3, v3, 0x1

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_c
    move v3, v9

    .line 150
    :goto_6
    invoke-virtual {p0, p1}, La/n460;->b(La/cgx0;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, La/u710;->a()V

    .line 154
    .line 155
    .line 156
    iput-object v2, p0, La/n460;->f:La/s460;

    .line 157
    .line 158
    return v3
.end method

.method public final e(La/cgx0;Z)Z
    .locals 13

    .line 1
    iget-object v0, p0, La/n460;->e:La/u710;

    .line 2
    .line 3
    invoke-virtual {v0}, La/u710;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v0, p0, La/n460;->c:La/lm40;

    .line 12
    .line 13
    iget-boolean v2, v0, La/lm40;->n:Z

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iget-object v2, v0, La/lm40;->h:La/s460;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    iget-object v2, v2, La/s460;->u:La/e7z;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2}, La/e7z;->J()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v2, v1

    .line 32
    :goto_0
    if-nez v2, :cond_3

    .line 33
    .line 34
    :goto_1
    return v1

    .line 35
    :cond_3
    iget-object v2, p0, La/n460;->g:La/woa0;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v3, p0, La/n460;->f:La/s460;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-wide v3, v3, La/pu90;->c:J

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    move-object v6, v0

    .line 49
    move-object v7, v5

    .line 50
    :goto_2
    const/16 v8, 0x10

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    if-eqz v6, :cond_b

    .line 54
    .line 55
    instance-of v10, v6, La/gpa0;

    .line 56
    .line 57
    if-eqz v10, :cond_4

    .line 58
    .line 59
    check-cast v6, La/gpa0;

    .line 60
    .line 61
    sget-object v8, La/xoa0;->a:La/xoa0;

    .line 62
    .line 63
    invoke-interface {v6, v2, v8, v3, v4}, La/gpa0;->h(La/woa0;La/xoa0;J)V

    .line 64
    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_4
    iget v10, v6, La/lm40;->c:I

    .line 68
    .line 69
    and-int/2addr v10, v8

    .line 70
    if-eqz v10, :cond_a

    .line 71
    .line 72
    instance-of v10, v6, La/f3k;

    .line 73
    .line 74
    if-eqz v10, :cond_a

    .line 75
    .line 76
    move-object v10, v6

    .line 77
    check-cast v10, La/f3k;

    .line 78
    .line 79
    iget-object v10, v10, La/f3k;->p:La/lm40;

    .line 80
    .line 81
    move v11, v1

    .line 82
    :goto_3
    if-eqz v10, :cond_9

    .line 83
    .line 84
    iget v12, v10, La/lm40;->c:I

    .line 85
    .line 86
    and-int/2addr v12, v8

    .line 87
    if-eqz v12, :cond_8

    .line 88
    .line 89
    add-int/lit8 v11, v11, 0x1

    .line 90
    .line 91
    if-ne v11, v9, :cond_5

    .line 92
    .line 93
    move-object v6, v10

    .line 94
    goto :goto_4

    .line 95
    :cond_5
    if-nez v7, :cond_6

    .line 96
    .line 97
    new-instance v7, La/xz40;

    .line 98
    .line 99
    new-array v12, v8, [La/lm40;

    .line 100
    .line 101
    invoke-direct {v7, v12}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_6
    if-eqz v6, :cond_7

    .line 105
    .line 106
    invoke-virtual {v7, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v6, v5

    .line 110
    :cond_7
    invoke-virtual {v7, v10}, La/xz40;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_8
    :goto_4
    iget-object v10, v10, La/lm40;->f:La/lm40;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_9
    if-ne v11, v9, :cond_a

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_a
    :goto_5
    invoke-static {v7}, La/vcc;->V(La/xz40;)La/lm40;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    goto :goto_2

    .line 124
    :cond_b
    iget-boolean v6, v0, La/lm40;->n:Z

    .line 125
    .line 126
    if-eqz v6, :cond_c

    .line 127
    .line 128
    iget-object v6, p0, La/x460;->a:La/xz40;

    .line 129
    .line 130
    iget-object v7, v6, La/xz40;->a:[Ljava/lang/Object;

    .line 131
    .line 132
    iget v6, v6, La/xz40;->c:I

    .line 133
    .line 134
    move v10, v1

    .line 135
    :goto_6
    if-ge v10, v6, :cond_c

    .line 136
    .line 137
    aget-object v11, v7, v10

    .line 138
    .line 139
    check-cast v11, La/n460;

    .line 140
    .line 141
    iget-object v12, p0, La/n460;->f:La/s460;

    .line 142
    .line 143
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v11, p1, p2}, La/n460;->e(La/cgx0;Z)Z

    .line 147
    .line 148
    .line 149
    add-int/lit8 v10, v10, 0x1

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_c
    iget-boolean p0, v0, La/lm40;->n:Z

    .line 153
    .line 154
    if-eqz p0, :cond_14

    .line 155
    .line 156
    move-object p0, v5

    .line 157
    :goto_7
    if-eqz v0, :cond_14

    .line 158
    .line 159
    instance-of p1, v0, La/gpa0;

    .line 160
    .line 161
    if-eqz p1, :cond_d

    .line 162
    .line 163
    check-cast v0, La/gpa0;

    .line 164
    .line 165
    sget-object p1, La/xoa0;->b:La/xoa0;

    .line 166
    .line 167
    invoke-interface {v0, v2, p1, v3, v4}, La/gpa0;->h(La/woa0;La/xoa0;J)V

    .line 168
    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_d
    iget p1, v0, La/lm40;->c:I

    .line 172
    .line 173
    and-int/2addr p1, v8

    .line 174
    if-eqz p1, :cond_13

    .line 175
    .line 176
    instance-of p1, v0, La/f3k;

    .line 177
    .line 178
    if-eqz p1, :cond_13

    .line 179
    .line 180
    move-object p1, v0

    .line 181
    check-cast p1, La/f3k;

    .line 182
    .line 183
    iget-object p1, p1, La/f3k;->p:La/lm40;

    .line 184
    .line 185
    move p2, v1

    .line 186
    :goto_8
    if-eqz p1, :cond_12

    .line 187
    .line 188
    iget v6, p1, La/lm40;->c:I

    .line 189
    .line 190
    and-int/2addr v6, v8

    .line 191
    if-eqz v6, :cond_11

    .line 192
    .line 193
    add-int/lit8 p2, p2, 0x1

    .line 194
    .line 195
    if-ne p2, v9, :cond_e

    .line 196
    .line 197
    move-object v0, p1

    .line 198
    goto :goto_9

    .line 199
    :cond_e
    if-nez p0, :cond_f

    .line 200
    .line 201
    new-instance p0, La/xz40;

    .line 202
    .line 203
    new-array v6, v8, [La/lm40;

    .line 204
    .line 205
    invoke-direct {p0, v6}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_f
    if-eqz v0, :cond_10

    .line 209
    .line 210
    invoke-virtual {p0, v0}, La/xz40;->b(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    move-object v0, v5

    .line 214
    :cond_10
    invoke-virtual {p0, p1}, La/xz40;->b(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_11
    :goto_9
    iget-object p1, p1, La/lm40;->f:La/lm40;

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_12
    if-ne p2, v9, :cond_13

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_13
    :goto_a
    invoke-static {p0}, La/vcc;->V(La/xz40;)La/lm40;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    goto :goto_7

    .line 228
    :cond_14
    return v9
.end method

.method public final f(JLa/vy40;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/n460;->d:La/v610;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, La/v610;->c(J)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p3, p0}, La/vy40;->e(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, La/v610;->e(J)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/n460;->e:La/u710;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2}, La/u710;->g(J)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p0, p0, La/x460;->a:La/xz40;

    .line 24
    .line 25
    iget-object v0, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 26
    .line 27
    iget p0, p0, La/xz40;->c:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    :goto_0
    if-ge v1, p0, :cond_1

    .line 31
    .line 32
    aget-object v2, v0, v1

    .line 33
    .line 34
    check-cast v2, La/n460;

    .line 35
    .line 36
    invoke-virtual {v2, p1, p2, p3}, La/n460;->f(JLa/vy40;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Node(modifierNode="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/n460;->c:La/lm40;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", children="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/x460;->a:La/xz40;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", pointerIds="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, La/n460;->d:La/v610;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, ")"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
