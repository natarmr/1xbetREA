.class public final La/buj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public final b:Ljava/util/ArrayDeque;

.field public final c:La/u3u0;

.field public d:La/pv00;

.field public e:B

.field public f:I

.field public g:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, La/buj;->a:[B

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/buj;->b:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    new-instance v0, La/u3u0;

    .line 18
    .line 19
    invoke-direct {v0}, La/u3u0;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/buj;->c:La/u3u0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(La/guo;)Z
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/buj;->d:La/pv00;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    :goto_0
    iget-object v2, v0, La/buj;->b:Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, La/auj;

    .line 17
    .line 18
    const v6, 0x1549a966

    .line 19
    .line 20
    .line 21
    const v9, 0x1654ae6b

    .line 22
    .line 23
    .line 24
    const v10, 0x1c53bb6b

    .line 25
    .line 26
    .line 27
    const/4 v14, -0x1

    .line 28
    const/4 v15, 0x2

    .line 29
    const-wide/16 v16, 0x0

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const-wide/16 v18, -0x1

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v8, 0x1

    .line 36
    if-eqz v3, :cond_ac

    .line 37
    .line 38
    invoke-interface {v1}, La/guo;->getPosition()J

    .line 39
    .line 40
    .line 41
    move-result-wide v20

    .line 42
    const/16 v22, 0x8

    .line 43
    .line 44
    iget-wide v11, v3, La/auj;->b:J

    .line 45
    .line 46
    cmp-long v3, v20, v11

    .line 47
    .line 48
    if-ltz v3, :cond_ab

    .line 49
    .line 50
    iget-object v0, v0, La/buj;->d:La/pv00;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, La/auj;

    .line 57
    .line 58
    iget v1, v1, La/auj;->a:I

    .line 59
    .line 60
    iget-object v0, v0, La/pv00;->a:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, La/cj30;

    .line 63
    .line 64
    sget-object v2, La/cj30;->w0:Ljava/util/Map;

    .line 65
    .line 66
    iget-object v3, v0, La/cj30;->F:Landroid/util/SparseArray;

    .line 67
    .line 68
    iget-object v11, v0, La/cj30;->c:Landroid/util/SparseArray;

    .line 69
    .line 70
    iget-object v12, v0, La/cj30;->q0:La/huo;

    .line 71
    .line 72
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const/16 v12, 0x80

    .line 76
    .line 77
    if-eq v1, v12, :cond_a9

    .line 78
    .line 79
    const/16 v12, 0xa0

    .line 80
    .line 81
    const-string v5, "A_OPUS"

    .line 82
    .line 83
    if-eq v1, v12, :cond_a3

    .line 84
    .line 85
    const/16 v12, 0xae

    .line 86
    .line 87
    const-string v13, "video/webm"

    .line 88
    .line 89
    if-eq v1, v12, :cond_26

    .line 90
    .line 91
    const/16 v2, 0x45b9

    .line 92
    .line 93
    if-eq v1, v2, :cond_25

    .line 94
    .line 95
    const/16 v2, 0x4dbb

    .line 96
    .line 97
    if-eq v1, v2, :cond_22

    .line 98
    .line 99
    const/16 v2, 0x6240

    .line 100
    .line 101
    if-eq v1, v2, :cond_20

    .line 102
    .line 103
    const/16 v2, 0x6d80

    .line 104
    .line 105
    if-eq v1, v2, :cond_1e

    .line 106
    .line 107
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    if-eq v1, v6, :cond_1c

    .line 113
    .line 114
    if-eq v1, v9, :cond_c

    .line 115
    .line 116
    if-eq v1, v10, :cond_5

    .line 117
    .line 118
    const/16 v2, 0xb6

    .line 119
    .line 120
    if-eq v1, v2, :cond_3

    .line 121
    .line 122
    const/16 v2, 0xb7

    .line 123
    .line 124
    if-eq v1, v2, :cond_1

    .line 125
    .line 126
    :cond_0
    :goto_1
    move v12, v8

    .line 127
    goto/16 :goto_49

    .line 128
    .line 129
    :cond_1
    iget-boolean v2, v0, La/cj30;->C:Z

    .line 130
    .line 131
    if-nez v2, :cond_0

    .line 132
    .line 133
    invoke-virtual {v0, v1}, La/cj30;->g(I)V

    .line 134
    .line 135
    .line 136
    iget-wide v1, v0, La/cj30;->H:J

    .line 137
    .line 138
    cmp-long v1, v1, v12

    .line 139
    .line 140
    if-eqz v1, :cond_0

    .line 141
    .line 142
    iget v1, v0, La/cj30;->I:I

    .line 143
    .line 144
    if-eq v1, v14, :cond_0

    .line 145
    .line 146
    iget-wide v4, v0, La/cj30;->J:J

    .line 147
    .line 148
    cmp-long v2, v4, v18

    .line 149
    .line 150
    if-eqz v2, :cond_0

    .line 151
    .line 152
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Ljava/util/List;

    .line 157
    .line 158
    if-nez v1, :cond_2

    .line 159
    .line 160
    new-instance v1, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    iget v2, v0, La/cj30;->I:I

    .line 166
    .line 167
    invoke-virtual {v3, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_2
    new-instance v9, La/zi30;

    .line 171
    .line 172
    iget-wide v10, v0, La/cj30;->H:J

    .line 173
    .line 174
    iget-wide v2, v0, La/cj30;->u:J

    .line 175
    .line 176
    iget-wide v4, v0, La/cj30;->J:J

    .line 177
    .line 178
    add-long v12, v2, v4

    .line 179
    .line 180
    iget-wide v14, v0, La/cj30;->K:J

    .line 181
    .line 182
    invoke-direct/range {v9 .. v15}, La/zi30;-><init>(JJJ)V

    .line 183
    .line 184
    .line 185
    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    return v8

    .line 189
    :cond_3
    iget-object v1, v0, La/cj30;->A:La/yi30;

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    iget-wide v2, v1, La/yi30;->a:J

    .line 195
    .line 196
    cmp-long v5, v2, v16

    .line 197
    .line 198
    if-eqz v5, :cond_4

    .line 199
    .line 200
    iget-object v5, v0, La/cj30;->d:Landroid/util/LongSparseArray;

    .line 201
    .line 202
    invoke-virtual {v5, v2, v3, v1}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :cond_4
    iput-object v4, v0, La/cj30;->A:La/yi30;

    .line 206
    .line 207
    return v8

    .line 208
    :cond_5
    iget-boolean v1, v0, La/cj30;->C:Z

    .line 209
    .line 210
    if-nez v1, :cond_0

    .line 211
    .line 212
    move v1, v7

    .line 213
    :goto_2
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-ge v1, v2, :cond_9

    .line 218
    .line 219
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    check-cast v2, Ljava/util/List;

    .line 224
    .line 225
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-nez v2, :cond_8

    .line 230
    .line 231
    iget-wide v1, v0, La/cj30;->x:J

    .line 232
    .line 233
    cmp-long v1, v1, v12

    .line 234
    .line 235
    if-nez v1, :cond_6

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_6
    move v1, v7

    .line 239
    :goto_3
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-ge v1, v2, :cond_7

    .line 244
    .line 245
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    check-cast v2, Ljava/util/List;

    .line 250
    .line 251
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 252
    .line 253
    .line 254
    add-int/lit8 v1, v1, 0x1

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_7
    new-instance v24, La/aj30;

    .line 258
    .line 259
    iget-wide v1, v0, La/cj30;->x:J

    .line 260
    .line 261
    iget v4, v0, La/cj30;->L:I

    .line 262
    .line 263
    iget-wide v5, v0, La/cj30;->u:J

    .line 264
    .line 265
    iget-wide v9, v0, La/cj30;->t:J

    .line 266
    .line 267
    move-wide/from16 v26, v1

    .line 268
    .line 269
    move-object/from16 v25, v3

    .line 270
    .line 271
    move/from16 v28, v4

    .line 272
    .line 273
    move-wide/from16 v29, v5

    .line 274
    .line 275
    move-wide/from16 v31, v9

    .line 276
    .line 277
    invoke-direct/range {v24 .. v32}, La/aj30;-><init>(Landroid/util/SparseArray;JIJJ)V

    .line 278
    .line 279
    .line 280
    move-object/from16 v1, v24

    .line 281
    .line 282
    iget-object v2, v0, La/cj30;->q0:La/huo;

    .line 283
    .line 284
    invoke-interface {v2, v1}, La/huo;->f(La/fvh0;)V

    .line 285
    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_8
    move-object/from16 v25, v3

    .line 289
    .line 290
    add-int/lit8 v1, v1, 0x1

    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_9
    :goto_4
    iget-object v1, v0, La/cj30;->q0:La/huo;

    .line 294
    .line 295
    new-instance v2, La/ca5;

    .line 296
    .line 297
    iget-wide v3, v0, La/cj30;->x:J

    .line 298
    .line 299
    invoke-direct {v2, v3, v4}, La/ca5;-><init>(J)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v1, v2}, La/huo;->f(La/fvh0;)V

    .line 303
    .line 304
    .line 305
    :goto_5
    iput-boolean v8, v0, La/cj30;->C:Z

    .line 306
    .line 307
    iput-boolean v7, v0, La/cj30;->G:Z

    .line 308
    .line 309
    :goto_6
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-ge v7, v1, :cond_b

    .line 314
    .line 315
    invoke-virtual {v11, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    check-cast v1, La/bj30;

    .line 320
    .line 321
    iget-boolean v2, v1, La/bj30;->X:Z

    .line 322
    .line 323
    if-nez v2, :cond_a

    .line 324
    .line 325
    invoke-virtual {v0, v1}, La/cj30;->q(La/bj30;)V

    .line 326
    .line 327
    .line 328
    iget-object v2, v1, La/bj30;->d0:La/ncs0;

    .line 329
    .line 330
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    iget-object v2, v1, La/bj30;->d0:La/ncs0;

    .line 334
    .line 335
    iget-object v1, v1, La/bj30;->e0:Landroidx/media3/common/b;

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-interface {v2, v1}, La/ncs0;->c(Landroidx/media3/common/b;)V

    .line 341
    .line 342
    .line 343
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_b
    invoke-virtual {v0}, La/cj30;->l()V

    .line 347
    .line 348
    .line 349
    return v8

    .line 350
    :cond_c
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_1b

    .line 355
    .line 356
    iget-boolean v1, v0, La/cj30;->e:Z

    .line 357
    .line 358
    if-eqz v1, :cond_e

    .line 359
    .line 360
    iget-wide v1, v0, La/cj30;->N:J

    .line 361
    .line 362
    cmp-long v1, v1, v18

    .line 363
    .line 364
    if-eqz v1, :cond_e

    .line 365
    .line 366
    iget-boolean v1, v0, La/cj30;->C:Z

    .line 367
    .line 368
    if-eqz v1, :cond_d

    .line 369
    .line 370
    goto :goto_7

    .line 371
    :cond_d
    move v1, v7

    .line 372
    goto :goto_8

    .line 373
    :cond_e
    :goto_7
    move v1, v8

    .line 374
    :goto_8
    move v2, v7

    .line 375
    move v3, v14

    .line 376
    move v4, v3

    .line 377
    move v5, v4

    .line 378
    move v6, v5

    .line 379
    :goto_9
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    if-ge v2, v9, :cond_14

    .line 384
    .line 385
    invoke-virtual {v11, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    check-cast v9, La/bj30;

    .line 390
    .line 391
    iget v10, v9, La/bj30;->f:I

    .line 392
    .line 393
    if-ne v10, v15, :cond_10

    .line 394
    .line 395
    iget-boolean v10, v9, La/bj30;->b0:Z

    .line 396
    .line 397
    if-eqz v10, :cond_f

    .line 398
    .line 399
    iget v3, v9, La/bj30;->d:I

    .line 400
    .line 401
    :cond_f
    if-ne v4, v14, :cond_12

    .line 402
    .line 403
    iget v4, v9, La/bj30;->d:I

    .line 404
    .line 405
    goto :goto_a

    .line 406
    :cond_10
    if-ne v10, v8, :cond_12

    .line 407
    .line 408
    iget-boolean v10, v9, La/bj30;->b0:Z

    .line 409
    .line 410
    if-eqz v10, :cond_11

    .line 411
    .line 412
    iget v5, v9, La/bj30;->d:I

    .line 413
    .line 414
    :cond_11
    if-ne v6, v14, :cond_12

    .line 415
    .line 416
    iget v6, v9, La/bj30;->d:I

    .line 417
    .line 418
    :cond_12
    :goto_a
    if-eqz v1, :cond_13

    .line 419
    .line 420
    iget-boolean v10, v9, La/bj30;->X:Z

    .line 421
    .line 422
    if-nez v10, :cond_13

    .line 423
    .line 424
    invoke-virtual {v0, v9}, La/cj30;->q(La/bj30;)V

    .line 425
    .line 426
    .line 427
    iget-object v10, v9, La/bj30;->d0:La/ncs0;

    .line 428
    .line 429
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    iget-object v10, v9, La/bj30;->d0:La/ncs0;

    .line 433
    .line 434
    iget-object v9, v9, La/bj30;->e0:Landroidx/media3/common/b;

    .line 435
    .line 436
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    invoke-interface {v10, v9}, La/ncs0;->c(Landroidx/media3/common/b;)V

    .line 440
    .line 441
    .line 442
    :cond_13
    add-int/lit8 v2, v2, 0x1

    .line 443
    .line 444
    goto :goto_9

    .line 445
    :cond_14
    if-eq v3, v14, :cond_15

    .line 446
    .line 447
    iput v3, v0, La/cj30;->L:I

    .line 448
    .line 449
    goto :goto_b

    .line 450
    :cond_15
    if-eq v4, v14, :cond_16

    .line 451
    .line 452
    iput v4, v0, La/cj30;->L:I

    .line 453
    .line 454
    goto :goto_b

    .line 455
    :cond_16
    if-eq v5, v14, :cond_17

    .line 456
    .line 457
    iput v5, v0, La/cj30;->L:I

    .line 458
    .line 459
    goto :goto_b

    .line 460
    :cond_17
    if-eq v6, v14, :cond_18

    .line 461
    .line 462
    iput v6, v0, La/cj30;->L:I

    .line 463
    .line 464
    goto :goto_b

    .line 465
    :cond_18
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    if-lez v2, :cond_19

    .line 470
    .line 471
    invoke-virtual {v11, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    check-cast v2, La/bj30;

    .line 476
    .line 477
    iget v14, v2, La/bj30;->d:I

    .line 478
    .line 479
    :cond_19
    iput v14, v0, La/cj30;->L:I

    .line 480
    .line 481
    :goto_b
    iput-boolean v8, v0, La/cj30;->S:Z

    .line 482
    .line 483
    iget-wide v2, v0, La/cj30;->R:J

    .line 484
    .line 485
    cmp-long v2, v2, v18

    .line 486
    .line 487
    if-eqz v2, :cond_1a

    .line 488
    .line 489
    invoke-virtual {v0}, La/cj30;->m()V

    .line 490
    .line 491
    .line 492
    :cond_1a
    if-eqz v1, :cond_0

    .line 493
    .line 494
    invoke-virtual {v0}, La/cj30;->l()V

    .line 495
    .line 496
    .line 497
    return v8

    .line 498
    :cond_1b
    const-string v0, "No valid tracks were found"

    .line 499
    .line 500
    invoke-static {v0, v4}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    throw v0

    .line 505
    :cond_1c
    iget-wide v1, v0, La/cj30;->v:J

    .line 506
    .line 507
    cmp-long v1, v1, v12

    .line 508
    .line 509
    if-nez v1, :cond_1d

    .line 510
    .line 511
    const-wide/32 v1, 0xf4240

    .line 512
    .line 513
    .line 514
    iput-wide v1, v0, La/cj30;->v:J

    .line 515
    .line 516
    :cond_1d
    iget-wide v1, v0, La/cj30;->w:J

    .line 517
    .line 518
    cmp-long v3, v1, v12

    .line 519
    .line 520
    if-eqz v3, :cond_0

    .line 521
    .line 522
    invoke-virtual {v0, v1, v2}, La/cj30;->p(J)J

    .line 523
    .line 524
    .line 525
    move-result-wide v1

    .line 526
    iput-wide v1, v0, La/cj30;->x:J

    .line 527
    .line 528
    return v8

    .line 529
    :cond_1e
    invoke-virtual {v0, v1}, La/cj30;->h(I)V

    .line 530
    .line 531
    .line 532
    iget-object v0, v0, La/cj30;->B:La/bj30;

    .line 533
    .line 534
    iget-boolean v1, v0, La/bj30;->j:Z

    .line 535
    .line 536
    if-eqz v1, :cond_0

    .line 537
    .line 538
    iget-object v0, v0, La/bj30;->k:[B

    .line 539
    .line 540
    if-nez v0, :cond_1f

    .line 541
    .line 542
    goto/16 :goto_1

    .line 543
    .line 544
    :cond_1f
    const-string v0, "Combining encryption and compression is not supported"

    .line 545
    .line 546
    invoke-static {v0, v4}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    throw v0

    .line 551
    :cond_20
    invoke-virtual {v0, v1}, La/cj30;->h(I)V

    .line 552
    .line 553
    .line 554
    iget-object v0, v0, La/cj30;->B:La/bj30;

    .line 555
    .line 556
    iget-boolean v1, v0, La/bj30;->j:Z

    .line 557
    .line 558
    if-eqz v1, :cond_0

    .line 559
    .line 560
    iget-object v1, v0, La/bj30;->l:La/mcs0;

    .line 561
    .line 562
    if-eqz v1, :cond_21

    .line 563
    .line 564
    new-instance v2, Landroidx/media3/common/DrmInitData;

    .line 565
    .line 566
    new-instance v3, Landroidx/media3/common/DrmInitData$SchemeData;

    .line 567
    .line 568
    sget-object v5, La/tg9;->a:Ljava/util/UUID;

    .line 569
    .line 570
    iget-object v1, v1, La/mcs0;->b:[B

    .line 571
    .line 572
    invoke-direct {v3, v5, v4, v13, v1}, Landroidx/media3/common/DrmInitData$SchemeData;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 573
    .line 574
    .line 575
    filled-new-array {v3}, [Landroidx/media3/common/DrmInitData$SchemeData;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    invoke-direct {v2, v4, v8, v1}, Landroidx/media3/common/DrmInitData;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/DrmInitData$SchemeData;)V

    .line 580
    .line 581
    .line 582
    iput-object v2, v0, La/bj30;->n:Landroidx/media3/common/DrmInitData;

    .line 583
    .line 584
    return v8

    .line 585
    :cond_21
    const-string v0, "Encrypted Track found but ContentEncKeyID was not found"

    .line 586
    .line 587
    invoke-static {v0, v4}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    throw v0

    .line 592
    :cond_22
    iget v1, v0, La/cj30;->D:I

    .line 593
    .line 594
    if-eq v1, v14, :cond_24

    .line 595
    .line 596
    iget-wide v2, v0, La/cj30;->E:J

    .line 597
    .line 598
    cmp-long v5, v2, v18

    .line 599
    .line 600
    if-eqz v5, :cond_24

    .line 601
    .line 602
    if-ne v1, v10, :cond_23

    .line 603
    .line 604
    iput-wide v2, v0, La/cj30;->N:J

    .line 605
    .line 606
    return v8

    .line 607
    :cond_23
    if-ne v1, v9, :cond_0

    .line 608
    .line 609
    iput-wide v2, v0, La/cj30;->P:J

    .line 610
    .line 611
    return v8

    .line 612
    :cond_24
    const-string v0, "Mandatory element SeekID or SeekPosition not found"

    .line 613
    .line 614
    invoke-static {v0, v4}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    throw v0

    .line 619
    :cond_25
    :goto_c
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    if-ge v7, v1, :cond_0

    .line 624
    .line 625
    invoke-virtual {v11, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    check-cast v1, La/bj30;

    .line 630
    .line 631
    invoke-virtual {v0, v1}, La/cj30;->q(La/bj30;)V

    .line 632
    .line 633
    .line 634
    add-int/lit8 v7, v7, 0x1

    .line 635
    .line 636
    goto :goto_c

    .line 637
    :cond_26
    iget-object v1, v0, La/cj30;->B:La/bj30;

    .line 638
    .line 639
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    iget-object v3, v1, La/bj30;->c:Ljava/lang/String;

    .line 643
    .line 644
    if-eqz v3, :cond_a2

    .line 645
    .line 646
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 647
    .line 648
    .line 649
    move-result v6

    .line 650
    const-string v10, "A_MPEG/L3"

    .line 651
    .line 652
    const-string v12, "A_MPEG/L2"

    .line 653
    .line 654
    const-string v9, "A_VORBIS"

    .line 655
    .line 656
    const-string v14, "A_TRUEHD"

    .line 657
    .line 658
    const-string v15, "A_MS/ACM"

    .line 659
    .line 660
    const-string v8, "V_MPEG4/ISO/SP"

    .line 661
    .line 662
    const-string v7, "V_MPEG4/ISO/AP"

    .line 663
    .line 664
    const/16 v16, 0x12

    .line 665
    .line 666
    const/16 v17, 0x14

    .line 667
    .line 668
    sparse-switch v6, :sswitch_data_0

    .line 669
    .line 670
    .line 671
    :goto_d
    const/4 v6, -0x1

    .line 672
    goto/16 :goto_e

    .line 673
    .line 674
    :sswitch_0
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    move-result v6

    .line 678
    if-nez v6, :cond_27

    .line 679
    .line 680
    goto :goto_d

    .line 681
    :cond_27
    const/16 v6, 0x22

    .line 682
    .line 683
    goto/16 :goto_e

    .line 684
    .line 685
    :sswitch_1
    const-string v6, "A_FLAC"

    .line 686
    .line 687
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    move-result v6

    .line 691
    if-nez v6, :cond_28

    .line 692
    .line 693
    goto :goto_d

    .line 694
    :cond_28
    const/16 v6, 0x21

    .line 695
    .line 696
    goto/16 :goto_e

    .line 697
    .line 698
    :sswitch_2
    const-string v6, "A_EAC3"

    .line 699
    .line 700
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-result v6

    .line 704
    if-nez v6, :cond_29

    .line 705
    .line 706
    goto :goto_d

    .line 707
    :cond_29
    const/16 v6, 0x20

    .line 708
    .line 709
    goto/16 :goto_e

    .line 710
    .line 711
    :sswitch_3
    const-string v6, "A_ALAC"

    .line 712
    .line 713
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v6

    .line 717
    if-nez v6, :cond_2a

    .line 718
    .line 719
    goto :goto_d

    .line 720
    :cond_2a
    const/16 v6, 0x1f

    .line 721
    .line 722
    goto/16 :goto_e

    .line 723
    .line 724
    :sswitch_4
    const-string v6, "V_MPEG2"

    .line 725
    .line 726
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    move-result v6

    .line 730
    if-nez v6, :cond_2b

    .line 731
    .line 732
    goto :goto_d

    .line 733
    :cond_2b
    const/16 v6, 0x1e

    .line 734
    .line 735
    goto/16 :goto_e

    .line 736
    .line 737
    :sswitch_5
    const-string v6, "S_TEXT/UTF8"

    .line 738
    .line 739
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    move-result v6

    .line 743
    if-nez v6, :cond_2c

    .line 744
    .line 745
    goto :goto_d

    .line 746
    :cond_2c
    const/16 v6, 0x1d

    .line 747
    .line 748
    goto/16 :goto_e

    .line 749
    .line 750
    :sswitch_6
    const-string v6, "S_TEXT/WEBVTT"

    .line 751
    .line 752
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v6

    .line 756
    if-nez v6, :cond_2d

    .line 757
    .line 758
    goto :goto_d

    .line 759
    :cond_2d
    const/16 v6, 0x1c

    .line 760
    .line 761
    goto/16 :goto_e

    .line 762
    .line 763
    :sswitch_7
    const-string v6, "V_MPEGH/ISO/HEVC"

    .line 764
    .line 765
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v6

    .line 769
    if-nez v6, :cond_2e

    .line 770
    .line 771
    goto :goto_d

    .line 772
    :cond_2e
    const/16 v6, 0x1b

    .line 773
    .line 774
    goto/16 :goto_e

    .line 775
    .line 776
    :sswitch_8
    const-string v6, "S_TEXT/SSA"

    .line 777
    .line 778
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    move-result v6

    .line 782
    if-nez v6, :cond_2f

    .line 783
    .line 784
    goto :goto_d

    .line 785
    :cond_2f
    const/16 v6, 0x1a

    .line 786
    .line 787
    goto/16 :goto_e

    .line 788
    .line 789
    :sswitch_9
    const-string v6, "S_TEXT/ASS"

    .line 790
    .line 791
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    move-result v6

    .line 795
    if-nez v6, :cond_30

    .line 796
    .line 797
    goto :goto_d

    .line 798
    :cond_30
    const/16 v6, 0x19

    .line 799
    .line 800
    goto/16 :goto_e

    .line 801
    .line 802
    :sswitch_a
    const-string v6, "A_PCM/INT/LIT"

    .line 803
    .line 804
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    move-result v6

    .line 808
    if-nez v6, :cond_31

    .line 809
    .line 810
    goto/16 :goto_d

    .line 811
    .line 812
    :cond_31
    const/16 v6, 0x18

    .line 813
    .line 814
    goto/16 :goto_e

    .line 815
    .line 816
    :sswitch_b
    const-string v6, "A_PCM/INT/BIG"

    .line 817
    .line 818
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v6

    .line 822
    if-nez v6, :cond_32

    .line 823
    .line 824
    goto/16 :goto_d

    .line 825
    .line 826
    :cond_32
    const/16 v6, 0x17

    .line 827
    .line 828
    goto/16 :goto_e

    .line 829
    .line 830
    :sswitch_c
    const-string v6, "A_PCM/FLOAT/IEEE"

    .line 831
    .line 832
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    move-result v6

    .line 836
    if-nez v6, :cond_33

    .line 837
    .line 838
    goto/16 :goto_d

    .line 839
    .line 840
    :cond_33
    const/16 v6, 0x16

    .line 841
    .line 842
    goto/16 :goto_e

    .line 843
    .line 844
    :sswitch_d
    const-string v6, "A_DTS/EXPRESS"

    .line 845
    .line 846
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    move-result v6

    .line 850
    if-nez v6, :cond_34

    .line 851
    .line 852
    goto/16 :goto_d

    .line 853
    .line 854
    :cond_34
    const/16 v6, 0x15

    .line 855
    .line 856
    goto/16 :goto_e

    .line 857
    .line 858
    :sswitch_e
    const-string v6, "V_THEORA"

    .line 859
    .line 860
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 861
    .line 862
    .line 863
    move-result v6

    .line 864
    if-nez v6, :cond_35

    .line 865
    .line 866
    goto/16 :goto_d

    .line 867
    .line 868
    :cond_35
    move/from16 v6, v17

    .line 869
    .line 870
    goto/16 :goto_e

    .line 871
    .line 872
    :sswitch_f
    const-string v6, "S_HDMV/PGS"

    .line 873
    .line 874
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 875
    .line 876
    .line 877
    move-result v6

    .line 878
    if-nez v6, :cond_36

    .line 879
    .line 880
    goto/16 :goto_d

    .line 881
    .line 882
    :cond_36
    const/16 v6, 0x13

    .line 883
    .line 884
    goto/16 :goto_e

    .line 885
    .line 886
    :sswitch_10
    const-string v6, "V_VP9"

    .line 887
    .line 888
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 889
    .line 890
    .line 891
    move-result v6

    .line 892
    if-nez v6, :cond_37

    .line 893
    .line 894
    goto/16 :goto_d

    .line 895
    .line 896
    :cond_37
    move/from16 v6, v16

    .line 897
    .line 898
    goto/16 :goto_e

    .line 899
    .line 900
    :sswitch_11
    const-string v6, "V_VP8"

    .line 901
    .line 902
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 903
    .line 904
    .line 905
    move-result v6

    .line 906
    if-nez v6, :cond_38

    .line 907
    .line 908
    goto/16 :goto_d

    .line 909
    .line 910
    :cond_38
    const/16 v6, 0x11

    .line 911
    .line 912
    goto/16 :goto_e

    .line 913
    .line 914
    :sswitch_12
    const-string v6, "V_AV1"

    .line 915
    .line 916
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    move-result v6

    .line 920
    if-nez v6, :cond_39

    .line 921
    .line 922
    goto/16 :goto_d

    .line 923
    .line 924
    :cond_39
    const/16 v6, 0x10

    .line 925
    .line 926
    goto/16 :goto_e

    .line 927
    .line 928
    :sswitch_13
    const-string v6, "A_DTS"

    .line 929
    .line 930
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 931
    .line 932
    .line 933
    move-result v6

    .line 934
    if-nez v6, :cond_3a

    .line 935
    .line 936
    goto/16 :goto_d

    .line 937
    .line 938
    :cond_3a
    const/16 v6, 0xf

    .line 939
    .line 940
    goto/16 :goto_e

    .line 941
    .line 942
    :sswitch_14
    const-string v6, "A_AC3"

    .line 943
    .line 944
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 945
    .line 946
    .line 947
    move-result v6

    .line 948
    if-nez v6, :cond_3b

    .line 949
    .line 950
    goto/16 :goto_d

    .line 951
    .line 952
    :cond_3b
    const/16 v6, 0xe

    .line 953
    .line 954
    goto/16 :goto_e

    .line 955
    .line 956
    :sswitch_15
    const-string v6, "A_AAC"

    .line 957
    .line 958
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 959
    .line 960
    .line 961
    move-result v6

    .line 962
    if-nez v6, :cond_3c

    .line 963
    .line 964
    goto/16 :goto_d

    .line 965
    .line 966
    :cond_3c
    const/16 v6, 0xd

    .line 967
    .line 968
    goto/16 :goto_e

    .line 969
    .line 970
    :sswitch_16
    const-string v6, "A_DTS/LOSSLESS"

    .line 971
    .line 972
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 973
    .line 974
    .line 975
    move-result v6

    .line 976
    if-nez v6, :cond_3d

    .line 977
    .line 978
    goto/16 :goto_d

    .line 979
    .line 980
    :cond_3d
    const/16 v6, 0xc

    .line 981
    .line 982
    goto/16 :goto_e

    .line 983
    .line 984
    :sswitch_17
    const-string v6, "S_VOBSUB"

    .line 985
    .line 986
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    move-result v6

    .line 990
    if-nez v6, :cond_3e

    .line 991
    .line 992
    goto/16 :goto_d

    .line 993
    .line 994
    :cond_3e
    const/16 v6, 0xb

    .line 995
    .line 996
    goto/16 :goto_e

    .line 997
    .line 998
    :sswitch_18
    const-string v6, "V_MPEG4/ISO/AVC"

    .line 999
    .line 1000
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1001
    .line 1002
    .line 1003
    move-result v6

    .line 1004
    if-nez v6, :cond_3f

    .line 1005
    .line 1006
    goto/16 :goto_d

    .line 1007
    .line 1008
    :cond_3f
    const/16 v6, 0xa

    .line 1009
    .line 1010
    goto/16 :goto_e

    .line 1011
    .line 1012
    :sswitch_19
    const-string v6, "V_MPEG4/ISO/ASP"

    .line 1013
    .line 1014
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v6

    .line 1018
    if-nez v6, :cond_40

    .line 1019
    .line 1020
    goto/16 :goto_d

    .line 1021
    .line 1022
    :cond_40
    const/16 v6, 0x9

    .line 1023
    .line 1024
    goto/16 :goto_e

    .line 1025
    .line 1026
    :sswitch_1a
    const-string v6, "S_DVBSUB"

    .line 1027
    .line 1028
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v6

    .line 1032
    if-nez v6, :cond_41

    .line 1033
    .line 1034
    goto/16 :goto_d

    .line 1035
    .line 1036
    :cond_41
    move/from16 v6, v22

    .line 1037
    .line 1038
    goto :goto_e

    .line 1039
    :sswitch_1b
    const-string v6, "V_MS/VFW/FOURCC"

    .line 1040
    .line 1041
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v6

    .line 1045
    if-nez v6, :cond_42

    .line 1046
    .line 1047
    goto/16 :goto_d

    .line 1048
    .line 1049
    :cond_42
    const/4 v6, 0x7

    .line 1050
    goto :goto_e

    .line 1051
    :sswitch_1c
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v6

    .line 1055
    if-nez v6, :cond_43

    .line 1056
    .line 1057
    goto/16 :goto_d

    .line 1058
    .line 1059
    :cond_43
    const/4 v6, 0x6

    .line 1060
    goto :goto_e

    .line 1061
    :sswitch_1d
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1062
    .line 1063
    .line 1064
    move-result v6

    .line 1065
    if-nez v6, :cond_44

    .line 1066
    .line 1067
    goto/16 :goto_d

    .line 1068
    .line 1069
    :cond_44
    const/4 v6, 0x5

    .line 1070
    goto :goto_e

    .line 1071
    :sswitch_1e
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v6

    .line 1075
    if-nez v6, :cond_45

    .line 1076
    .line 1077
    goto/16 :goto_d

    .line 1078
    .line 1079
    :cond_45
    const/4 v6, 0x4

    .line 1080
    goto :goto_e

    .line 1081
    :sswitch_1f
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v6

    .line 1085
    if-nez v6, :cond_46

    .line 1086
    .line 1087
    goto/16 :goto_d

    .line 1088
    .line 1089
    :cond_46
    const/4 v6, 0x3

    .line 1090
    goto :goto_e

    .line 1091
    :sswitch_20
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v6

    .line 1095
    if-nez v6, :cond_47

    .line 1096
    .line 1097
    goto/16 :goto_d

    .line 1098
    .line 1099
    :cond_47
    const/4 v6, 0x2

    .line 1100
    goto :goto_e

    .line 1101
    :sswitch_21
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1102
    .line 1103
    .line 1104
    move-result v6

    .line 1105
    if-nez v6, :cond_48

    .line 1106
    .line 1107
    goto/16 :goto_d

    .line 1108
    .line 1109
    :cond_48
    const/4 v6, 0x1

    .line 1110
    goto :goto_e

    .line 1111
    :sswitch_22
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1112
    .line 1113
    .line 1114
    move-result v6

    .line 1115
    if-nez v6, :cond_49

    .line 1116
    .line 1117
    goto/16 :goto_d

    .line 1118
    .line 1119
    :cond_49
    const/4 v6, 0x0

    .line 1120
    :goto_e
    packed-switch v6, :pswitch_data_0

    .line 1121
    .line 1122
    .line 1123
    :goto_f
    const/4 v5, 0x0

    .line 1124
    goto/16 :goto_45

    .line 1125
    .line 1126
    :pswitch_0
    iget v6, v1, La/bj30;->d:I

    .line 1127
    .line 1128
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 1129
    .line 1130
    .line 1131
    move-result v19

    .line 1132
    sparse-switch v19, :sswitch_data_1

    .line 1133
    .line 1134
    .line 1135
    :goto_10
    const/4 v5, -0x1

    .line 1136
    goto/16 :goto_11

    .line 1137
    .line 1138
    :sswitch_23
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1139
    .line 1140
    .line 1141
    move-result v5

    .line 1142
    if-nez v5, :cond_4a

    .line 1143
    .line 1144
    goto :goto_10

    .line 1145
    :cond_4a
    const/16 v5, 0x22

    .line 1146
    .line 1147
    goto/16 :goto_11

    .line 1148
    .line 1149
    :sswitch_24
    const-string v5, "A_FLAC"

    .line 1150
    .line 1151
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1152
    .line 1153
    .line 1154
    move-result v5

    .line 1155
    if-nez v5, :cond_4b

    .line 1156
    .line 1157
    goto :goto_10

    .line 1158
    :cond_4b
    const/16 v5, 0x21

    .line 1159
    .line 1160
    goto/16 :goto_11

    .line 1161
    .line 1162
    :sswitch_25
    const-string v5, "A_EAC3"

    .line 1163
    .line 1164
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1165
    .line 1166
    .line 1167
    move-result v5

    .line 1168
    if-nez v5, :cond_4c

    .line 1169
    .line 1170
    goto :goto_10

    .line 1171
    :cond_4c
    const/16 v5, 0x20

    .line 1172
    .line 1173
    goto/16 :goto_11

    .line 1174
    .line 1175
    :sswitch_26
    const-string v5, "A_ALAC"

    .line 1176
    .line 1177
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1178
    .line 1179
    .line 1180
    move-result v5

    .line 1181
    if-nez v5, :cond_4d

    .line 1182
    .line 1183
    goto :goto_10

    .line 1184
    :cond_4d
    const/16 v5, 0x1f

    .line 1185
    .line 1186
    goto/16 :goto_11

    .line 1187
    .line 1188
    :sswitch_27
    const-string v5, "V_MPEG2"

    .line 1189
    .line 1190
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1191
    .line 1192
    .line 1193
    move-result v5

    .line 1194
    if-nez v5, :cond_4e

    .line 1195
    .line 1196
    goto :goto_10

    .line 1197
    :cond_4e
    const/16 v5, 0x1e

    .line 1198
    .line 1199
    goto/16 :goto_11

    .line 1200
    .line 1201
    :sswitch_28
    const-string v5, "S_TEXT/UTF8"

    .line 1202
    .line 1203
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1204
    .line 1205
    .line 1206
    move-result v5

    .line 1207
    if-nez v5, :cond_4f

    .line 1208
    .line 1209
    goto :goto_10

    .line 1210
    :cond_4f
    const/16 v5, 0x1d

    .line 1211
    .line 1212
    goto/16 :goto_11

    .line 1213
    .line 1214
    :sswitch_29
    const-string v5, "S_TEXT/WEBVTT"

    .line 1215
    .line 1216
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v5

    .line 1220
    if-nez v5, :cond_50

    .line 1221
    .line 1222
    goto :goto_10

    .line 1223
    :cond_50
    const/16 v5, 0x1c

    .line 1224
    .line 1225
    goto/16 :goto_11

    .line 1226
    .line 1227
    :sswitch_2a
    const-string v5, "V_MPEGH/ISO/HEVC"

    .line 1228
    .line 1229
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1230
    .line 1231
    .line 1232
    move-result v5

    .line 1233
    if-nez v5, :cond_51

    .line 1234
    .line 1235
    goto :goto_10

    .line 1236
    :cond_51
    const/16 v5, 0x1b

    .line 1237
    .line 1238
    goto/16 :goto_11

    .line 1239
    .line 1240
    :sswitch_2b
    const-string v5, "S_TEXT/SSA"

    .line 1241
    .line 1242
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1243
    .line 1244
    .line 1245
    move-result v5

    .line 1246
    if-nez v5, :cond_52

    .line 1247
    .line 1248
    goto :goto_10

    .line 1249
    :cond_52
    const/16 v5, 0x1a

    .line 1250
    .line 1251
    goto/16 :goto_11

    .line 1252
    .line 1253
    :sswitch_2c
    const-string v5, "S_TEXT/ASS"

    .line 1254
    .line 1255
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1256
    .line 1257
    .line 1258
    move-result v5

    .line 1259
    if-nez v5, :cond_53

    .line 1260
    .line 1261
    goto :goto_10

    .line 1262
    :cond_53
    const/16 v5, 0x19

    .line 1263
    .line 1264
    goto/16 :goto_11

    .line 1265
    .line 1266
    :sswitch_2d
    const-string v5, "A_PCM/INT/LIT"

    .line 1267
    .line 1268
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1269
    .line 1270
    .line 1271
    move-result v5

    .line 1272
    if-nez v5, :cond_54

    .line 1273
    .line 1274
    goto/16 :goto_10

    .line 1275
    .line 1276
    :cond_54
    const/16 v5, 0x18

    .line 1277
    .line 1278
    goto/16 :goto_11

    .line 1279
    .line 1280
    :sswitch_2e
    const-string v5, "A_PCM/INT/BIG"

    .line 1281
    .line 1282
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v5

    .line 1286
    if-nez v5, :cond_55

    .line 1287
    .line 1288
    goto/16 :goto_10

    .line 1289
    .line 1290
    :cond_55
    const/16 v5, 0x17

    .line 1291
    .line 1292
    goto/16 :goto_11

    .line 1293
    .line 1294
    :sswitch_2f
    const-string v5, "A_PCM/FLOAT/IEEE"

    .line 1295
    .line 1296
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1297
    .line 1298
    .line 1299
    move-result v5

    .line 1300
    if-nez v5, :cond_56

    .line 1301
    .line 1302
    goto/16 :goto_10

    .line 1303
    .line 1304
    :cond_56
    const/16 v5, 0x16

    .line 1305
    .line 1306
    goto/16 :goto_11

    .line 1307
    .line 1308
    :sswitch_30
    const-string v5, "A_DTS/EXPRESS"

    .line 1309
    .line 1310
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1311
    .line 1312
    .line 1313
    move-result v5

    .line 1314
    if-nez v5, :cond_57

    .line 1315
    .line 1316
    goto/16 :goto_10

    .line 1317
    .line 1318
    :cond_57
    const/16 v5, 0x15

    .line 1319
    .line 1320
    goto/16 :goto_11

    .line 1321
    .line 1322
    :sswitch_31
    const-string v5, "V_THEORA"

    .line 1323
    .line 1324
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1325
    .line 1326
    .line 1327
    move-result v5

    .line 1328
    if-nez v5, :cond_58

    .line 1329
    .line 1330
    goto/16 :goto_10

    .line 1331
    .line 1332
    :cond_58
    move/from16 v5, v17

    .line 1333
    .line 1334
    goto/16 :goto_11

    .line 1335
    .line 1336
    :sswitch_32
    const-string v5, "S_HDMV/PGS"

    .line 1337
    .line 1338
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1339
    .line 1340
    .line 1341
    move-result v5

    .line 1342
    if-nez v5, :cond_59

    .line 1343
    .line 1344
    goto/16 :goto_10

    .line 1345
    .line 1346
    :cond_59
    const/16 v5, 0x13

    .line 1347
    .line 1348
    goto/16 :goto_11

    .line 1349
    .line 1350
    :sswitch_33
    const-string v5, "V_VP9"

    .line 1351
    .line 1352
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v5

    .line 1356
    if-nez v5, :cond_5a

    .line 1357
    .line 1358
    goto/16 :goto_10

    .line 1359
    .line 1360
    :cond_5a
    move/from16 v5, v16

    .line 1361
    .line 1362
    goto/16 :goto_11

    .line 1363
    .line 1364
    :sswitch_34
    const-string v5, "V_VP8"

    .line 1365
    .line 1366
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1367
    .line 1368
    .line 1369
    move-result v5

    .line 1370
    if-nez v5, :cond_5b

    .line 1371
    .line 1372
    goto/16 :goto_10

    .line 1373
    .line 1374
    :cond_5b
    const/16 v5, 0x11

    .line 1375
    .line 1376
    goto/16 :goto_11

    .line 1377
    .line 1378
    :sswitch_35
    const-string v5, "V_AV1"

    .line 1379
    .line 1380
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1381
    .line 1382
    .line 1383
    move-result v5

    .line 1384
    if-nez v5, :cond_5c

    .line 1385
    .line 1386
    goto/16 :goto_10

    .line 1387
    .line 1388
    :cond_5c
    const/16 v5, 0x10

    .line 1389
    .line 1390
    goto/16 :goto_11

    .line 1391
    .line 1392
    :sswitch_36
    const-string v5, "A_DTS"

    .line 1393
    .line 1394
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1395
    .line 1396
    .line 1397
    move-result v5

    .line 1398
    if-nez v5, :cond_5d

    .line 1399
    .line 1400
    goto/16 :goto_10

    .line 1401
    .line 1402
    :cond_5d
    const/16 v5, 0xf

    .line 1403
    .line 1404
    goto/16 :goto_11

    .line 1405
    .line 1406
    :sswitch_37
    const-string v5, "A_AC3"

    .line 1407
    .line 1408
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1409
    .line 1410
    .line 1411
    move-result v5

    .line 1412
    if-nez v5, :cond_5e

    .line 1413
    .line 1414
    goto/16 :goto_10

    .line 1415
    .line 1416
    :cond_5e
    const/16 v5, 0xe

    .line 1417
    .line 1418
    goto/16 :goto_11

    .line 1419
    .line 1420
    :sswitch_38
    const-string v5, "A_AAC"

    .line 1421
    .line 1422
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1423
    .line 1424
    .line 1425
    move-result v5

    .line 1426
    if-nez v5, :cond_5f

    .line 1427
    .line 1428
    goto/16 :goto_10

    .line 1429
    .line 1430
    :cond_5f
    const/16 v5, 0xd

    .line 1431
    .line 1432
    goto/16 :goto_11

    .line 1433
    .line 1434
    :sswitch_39
    const-string v5, "A_DTS/LOSSLESS"

    .line 1435
    .line 1436
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1437
    .line 1438
    .line 1439
    move-result v5

    .line 1440
    if-nez v5, :cond_60

    .line 1441
    .line 1442
    goto/16 :goto_10

    .line 1443
    .line 1444
    :cond_60
    const/16 v5, 0xc

    .line 1445
    .line 1446
    goto/16 :goto_11

    .line 1447
    .line 1448
    :sswitch_3a
    const-string v5, "S_VOBSUB"

    .line 1449
    .line 1450
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1451
    .line 1452
    .line 1453
    move-result v5

    .line 1454
    if-nez v5, :cond_61

    .line 1455
    .line 1456
    goto/16 :goto_10

    .line 1457
    .line 1458
    :cond_61
    const/16 v5, 0xb

    .line 1459
    .line 1460
    goto/16 :goto_11

    .line 1461
    .line 1462
    :sswitch_3b
    const-string v5, "V_MPEG4/ISO/AVC"

    .line 1463
    .line 1464
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1465
    .line 1466
    .line 1467
    move-result v5

    .line 1468
    if-nez v5, :cond_62

    .line 1469
    .line 1470
    goto/16 :goto_10

    .line 1471
    .line 1472
    :cond_62
    const/16 v5, 0xa

    .line 1473
    .line 1474
    goto/16 :goto_11

    .line 1475
    .line 1476
    :sswitch_3c
    const-string v5, "V_MPEG4/ISO/ASP"

    .line 1477
    .line 1478
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1479
    .line 1480
    .line 1481
    move-result v5

    .line 1482
    if-nez v5, :cond_63

    .line 1483
    .line 1484
    goto/16 :goto_10

    .line 1485
    .line 1486
    :cond_63
    const/16 v5, 0x9

    .line 1487
    .line 1488
    goto/16 :goto_11

    .line 1489
    .line 1490
    :sswitch_3d
    const-string v5, "S_DVBSUB"

    .line 1491
    .line 1492
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1493
    .line 1494
    .line 1495
    move-result v5

    .line 1496
    if-nez v5, :cond_64

    .line 1497
    .line 1498
    goto/16 :goto_10

    .line 1499
    .line 1500
    :cond_64
    move/from16 v5, v22

    .line 1501
    .line 1502
    goto :goto_11

    .line 1503
    :sswitch_3e
    const-string v5, "V_MS/VFW/FOURCC"

    .line 1504
    .line 1505
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1506
    .line 1507
    .line 1508
    move-result v5

    .line 1509
    if-nez v5, :cond_65

    .line 1510
    .line 1511
    goto/16 :goto_10

    .line 1512
    .line 1513
    :cond_65
    const/4 v5, 0x7

    .line 1514
    goto :goto_11

    .line 1515
    :sswitch_3f
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1516
    .line 1517
    .line 1518
    move-result v5

    .line 1519
    if-nez v5, :cond_66

    .line 1520
    .line 1521
    goto/16 :goto_10

    .line 1522
    .line 1523
    :cond_66
    const/4 v5, 0x6

    .line 1524
    goto :goto_11

    .line 1525
    :sswitch_40
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    move-result v5

    .line 1529
    if-nez v5, :cond_67

    .line 1530
    .line 1531
    goto/16 :goto_10

    .line 1532
    .line 1533
    :cond_67
    const/4 v5, 0x5

    .line 1534
    goto :goto_11

    .line 1535
    :sswitch_41
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1536
    .line 1537
    .line 1538
    move-result v5

    .line 1539
    if-nez v5, :cond_68

    .line 1540
    .line 1541
    goto/16 :goto_10

    .line 1542
    .line 1543
    :cond_68
    const/4 v5, 0x4

    .line 1544
    goto :goto_11

    .line 1545
    :sswitch_42
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1546
    .line 1547
    .line 1548
    move-result v5

    .line 1549
    if-nez v5, :cond_69

    .line 1550
    .line 1551
    goto/16 :goto_10

    .line 1552
    .line 1553
    :cond_69
    const/4 v5, 0x3

    .line 1554
    goto :goto_11

    .line 1555
    :sswitch_43
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1556
    .line 1557
    .line 1558
    move-result v5

    .line 1559
    if-nez v5, :cond_6a

    .line 1560
    .line 1561
    goto/16 :goto_10

    .line 1562
    .line 1563
    :cond_6a
    const/4 v5, 0x2

    .line 1564
    goto :goto_11

    .line 1565
    :sswitch_44
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1566
    .line 1567
    .line 1568
    move-result v5

    .line 1569
    if-nez v5, :cond_6b

    .line 1570
    .line 1571
    goto/16 :goto_10

    .line 1572
    .line 1573
    :cond_6b
    const/4 v5, 0x1

    .line 1574
    goto :goto_11

    .line 1575
    :sswitch_45
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1576
    .line 1577
    .line 1578
    move-result v5

    .line 1579
    if-nez v5, :cond_6c

    .line 1580
    .line 1581
    goto/16 :goto_10

    .line 1582
    .line 1583
    :cond_6c
    const/4 v5, 0x0

    .line 1584
    :goto_11
    const-string v8, "application/dvbsubs"

    .line 1585
    .line 1586
    const-string v9, "application/vobsub"

    .line 1587
    .line 1588
    const-string v10, "application/pgs"

    .line 1589
    .line 1590
    const-string v12, "video/x-unknown"

    .line 1591
    .line 1592
    const-string v14, "text/x-ssa"

    .line 1593
    .line 1594
    const-string v15, "text/vtt"

    .line 1595
    .line 1596
    const-string v7, "application/x-subrip"

    .line 1597
    .line 1598
    const-string v4, ". Setting mimeType to audio/x-unknown"

    .line 1599
    .line 1600
    const-string v19, "audio/raw"

    .line 1601
    .line 1602
    const-string v27, "audio/x-unknown"

    .line 1603
    .line 1604
    move/from16 v28, v5

    .line 1605
    .line 1606
    const-string v5, "MatroskaExtractor"

    .line 1607
    .line 1608
    packed-switch v28, :pswitch_data_1

    .line 1609
    .line 1610
    .line 1611
    const-string v0, "Unrecognized codec identifier."

    .line 1612
    .line 1613
    const/4 v1, 0x0

    .line 1614
    invoke-static {v0, v1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v0

    .line 1618
    throw v0

    .line 1619
    :pswitch_1
    new-instance v3, Ljava/util/ArrayList;

    .line 1620
    .line 1621
    const/4 v4, 0x3

    .line 1622
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1623
    .line 1624
    .line 1625
    iget-object v4, v1, La/bj30;->c:Ljava/lang/String;

    .line 1626
    .line 1627
    invoke-virtual {v1, v4}, La/bj30;->a(Ljava/lang/String;)[B

    .line 1628
    .line 1629
    .line 1630
    move-result-object v4

    .line 1631
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1632
    .line 1633
    .line 1634
    invoke-static/range {v22 .. v22}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v4

    .line 1638
    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1639
    .line 1640
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v4

    .line 1644
    move-object/from16 v28, v13

    .line 1645
    .line 1646
    iget-wide v12, v1, La/bj30;->U:J

    .line 1647
    .line 1648
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v4

    .line 1652
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    .line 1653
    .line 1654
    .line 1655
    move-result-object v4

    .line 1656
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1657
    .line 1658
    .line 1659
    invoke-static/range {v22 .. v22}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v4

    .line 1663
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v4

    .line 1667
    iget-wide v12, v1, La/bj30;->V:J

    .line 1668
    .line 1669
    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v4

    .line 1673
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    .line 1674
    .line 1675
    .line 1676
    move-result-object v4

    .line 1677
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1678
    .line 1679
    .line 1680
    const-string v12, "audio/opus"

    .line 1681
    .line 1682
    const/16 v4, 0x1680

    .line 1683
    .line 1684
    move-object/from16 v23, v0

    .line 1685
    .line 1686
    move-object/from16 v17, v3

    .line 1687
    .line 1688
    move/from16 v18, v6

    .line 1689
    .line 1690
    move-object/from16 v21, v11

    .line 1691
    .line 1692
    :goto_12
    move-object/from16 p0, v12

    .line 1693
    .line 1694
    const/4 v3, -0x1

    .line 1695
    :goto_13
    const/4 v5, -0x1

    .line 1696
    :goto_14
    const/4 v6, -0x1

    .line 1697
    const/4 v11, -0x1

    .line 1698
    const/4 v12, -0x1

    .line 1699
    const/4 v13, -0x1

    .line 1700
    const/16 v16, 0x0

    .line 1701
    .line 1702
    goto/16 :goto_33

    .line 1703
    .line 1704
    :pswitch_2
    move-object/from16 v28, v13

    .line 1705
    .line 1706
    invoke-virtual {v1, v3}, La/bj30;->a(Ljava/lang/String;)[B

    .line 1707
    .line 1708
    .line 1709
    move-result-object v3

    .line 1710
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v3

    .line 1714
    iget v4, v1, La/bj30;->R:I

    .line 1715
    .line 1716
    sget-object v5, La/vtt0;->a:Ljava/lang/String;

    .line 1717
    .line 1718
    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1719
    .line 1720
    invoke-static {v4, v5}, La/vtt0;->z(ILjava/nio/ByteOrder;)I

    .line 1721
    .line 1722
    .line 1723
    move-result v4

    .line 1724
    const-string v12, "audio/flac"

    .line 1725
    .line 1726
    if-nez v4, :cond_6d

    .line 1727
    .line 1728
    :goto_15
    move-object/from16 v23, v0

    .line 1729
    .line 1730
    move-object/from16 v17, v3

    .line 1731
    .line 1732
    move/from16 v18, v6

    .line 1733
    .line 1734
    move-object/from16 v21, v11

    .line 1735
    .line 1736
    :goto_16
    move-object/from16 p0, v12

    .line 1737
    .line 1738
    :goto_17
    const/4 v3, -0x1

    .line 1739
    const/4 v4, -0x1

    .line 1740
    goto :goto_13

    .line 1741
    :cond_6d
    move-object/from16 v23, v0

    .line 1742
    .line 1743
    move-object/from16 v17, v3

    .line 1744
    .line 1745
    move v5, v4

    .line 1746
    move/from16 v18, v6

    .line 1747
    .line 1748
    move-object/from16 v21, v11

    .line 1749
    .line 1750
    move-object/from16 p0, v12

    .line 1751
    .line 1752
    const/4 v3, -0x1

    .line 1753
    const/4 v4, -0x1

    .line 1754
    goto :goto_14

    .line 1755
    :pswitch_3
    move-object/from16 v28, v13

    .line 1756
    .line 1757
    const-string v12, "audio/eac3"

    .line 1758
    .line 1759
    :goto_18
    move-object/from16 v23, v0

    .line 1760
    .line 1761
    move/from16 v18, v6

    .line 1762
    .line 1763
    move-object/from16 v21, v11

    .line 1764
    .line 1765
    :goto_19
    move-object/from16 p0, v12

    .line 1766
    .line 1767
    :goto_1a
    const/4 v3, -0x1

    .line 1768
    const/4 v4, -0x1

    .line 1769
    :goto_1b
    const/4 v5, -0x1

    .line 1770
    :goto_1c
    const/4 v6, -0x1

    .line 1771
    const/4 v11, -0x1

    .line 1772
    const/4 v12, -0x1

    .line 1773
    const/4 v13, -0x1

    .line 1774
    const/16 v16, 0x0

    .line 1775
    .line 1776
    const/16 v17, 0x0

    .line 1777
    .line 1778
    goto/16 :goto_33

    .line 1779
    .line 1780
    :pswitch_4
    move-object/from16 v28, v13

    .line 1781
    .line 1782
    invoke-virtual {v1, v3}, La/bj30;->a(Ljava/lang/String;)[B

    .line 1783
    .line 1784
    .line 1785
    move-result-object v3

    .line 1786
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1787
    .line 1788
    .line 1789
    move-result-object v3

    .line 1790
    iget v4, v1, La/bj30;->R:I

    .line 1791
    .line 1792
    sget-object v5, La/vtt0;->a:Ljava/lang/String;

    .line 1793
    .line 1794
    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1795
    .line 1796
    invoke-static {v4, v5}, La/vtt0;->z(ILjava/nio/ByteOrder;)I

    .line 1797
    .line 1798
    .line 1799
    move-result v4

    .line 1800
    const-string v12, "audio/alac"

    .line 1801
    .line 1802
    if-nez v4, :cond_6d

    .line 1803
    .line 1804
    goto :goto_15

    .line 1805
    :pswitch_5
    move-object/from16 v28, v13

    .line 1806
    .line 1807
    const-string v12, "video/mpeg2"

    .line 1808
    .line 1809
    goto :goto_18

    .line 1810
    :pswitch_6
    move-object/from16 v28, v13

    .line 1811
    .line 1812
    move-object/from16 v23, v0

    .line 1813
    .line 1814
    move/from16 v18, v6

    .line 1815
    .line 1816
    move-object/from16 p0, v7

    .line 1817
    .line 1818
    :goto_1d
    move-object/from16 v21, v11

    .line 1819
    .line 1820
    goto :goto_1a

    .line 1821
    :pswitch_7
    move-object/from16 v28, v13

    .line 1822
    .line 1823
    move-object/from16 v23, v0

    .line 1824
    .line 1825
    move/from16 v18, v6

    .line 1826
    .line 1827
    move-object/from16 v21, v11

    .line 1828
    .line 1829
    move-object/from16 p0, v15

    .line 1830
    .line 1831
    goto :goto_1a

    .line 1832
    :pswitch_8
    move-object/from16 v28, v13

    .line 1833
    .line 1834
    new-instance v3, La/fq80;

    .line 1835
    .line 1836
    iget-object v4, v1, La/bj30;->c:Ljava/lang/String;

    .line 1837
    .line 1838
    invoke-virtual {v1, v4}, La/bj30;->a(Ljava/lang/String;)[B

    .line 1839
    .line 1840
    .line 1841
    move-result-object v4

    .line 1842
    invoke-direct {v3, v4}, La/fq80;-><init>([B)V

    .line 1843
    .line 1844
    .line 1845
    const/4 v4, 0x0

    .line 1846
    const/4 v5, 0x0

    .line 1847
    invoke-static {v3, v5, v4}, La/xvv;->a(La/fq80;ZLa/dgu;)La/xvv;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v3

    .line 1851
    iget-object v4, v3, La/xvv;->a:Ljava/util/List;

    .line 1852
    .line 1853
    iget v5, v3, La/xvv;->b:I

    .line 1854
    .line 1855
    iput v5, v1, La/bj30;->f0:I

    .line 1856
    .line 1857
    iget-object v5, v3, La/xvv;->n:Ljava/lang/String;

    .line 1858
    .line 1859
    iget v12, v3, La/xvv;->h:I

    .line 1860
    .line 1861
    iget v13, v3, La/xvv;->j:I

    .line 1862
    .line 1863
    move-object/from16 v16, v4

    .line 1864
    .line 1865
    iget v4, v3, La/xvv;->i:I

    .line 1866
    .line 1867
    move/from16 v17, v4

    .line 1868
    .line 1869
    iget v4, v3, La/xvv;->f:I

    .line 1870
    .line 1871
    iget v3, v3, La/xvv;->g:I

    .line 1872
    .line 1873
    const-string v18, "video/hevc"

    .line 1874
    .line 1875
    :goto_1e
    move-object/from16 v23, v0

    .line 1876
    .line 1877
    move-object/from16 v21, v11

    .line 1878
    .line 1879
    move/from16 v11, v17

    .line 1880
    .line 1881
    move-object/from16 p0, v18

    .line 1882
    .line 1883
    move/from16 v18, v6

    .line 1884
    .line 1885
    move v6, v12

    .line 1886
    move-object/from16 v17, v16

    .line 1887
    .line 1888
    move v12, v3

    .line 1889
    move v3, v4

    .line 1890
    move-object/from16 v16, v5

    .line 1891
    .line 1892
    :goto_1f
    const/4 v4, -0x1

    .line 1893
    const/4 v5, -0x1

    .line 1894
    goto/16 :goto_33

    .line 1895
    .line 1896
    :pswitch_9
    move-object/from16 v28, v13

    .line 1897
    .line 1898
    sget-object v4, La/cj30;->s0:[B

    .line 1899
    .line 1900
    invoke-virtual {v1, v3}, La/bj30;->a(Ljava/lang/String;)[B

    .line 1901
    .line 1902
    .line 1903
    move-result-object v3

    .line 1904
    invoke-static {v4, v3}, La/b4x;->v(Ljava/lang/Object;Ljava/lang/Object;)La/rcf0;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v3

    .line 1908
    move-object/from16 v23, v0

    .line 1909
    .line 1910
    move-object/from16 v17, v3

    .line 1911
    .line 1912
    move/from16 v18, v6

    .line 1913
    .line 1914
    move-object/from16 v21, v11

    .line 1915
    .line 1916
    move-object/from16 p0, v14

    .line 1917
    .line 1918
    goto/16 :goto_17

    .line 1919
    .line 1920
    :pswitch_a
    move-object/from16 v28, v13

    .line 1921
    .line 1922
    iget v3, v1, La/bj30;->R:I

    .line 1923
    .line 1924
    sget-object v12, La/vtt0;->a:Ljava/lang/String;

    .line 1925
    .line 1926
    sget-object v12, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1927
    .line 1928
    invoke-static {v3, v12}, La/vtt0;->z(ILjava/nio/ByteOrder;)I

    .line 1929
    .line 1930
    .line 1931
    move-result v3

    .line 1932
    if-nez v3, :cond_6e

    .line 1933
    .line 1934
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1935
    .line 1936
    const-string v12, "Unsupported little endian PCM bit depth: "

    .line 1937
    .line 1938
    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1939
    .line 1940
    .line 1941
    iget v12, v1, La/bj30;->R:I

    .line 1942
    .line 1943
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1944
    .line 1945
    .line 1946
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1947
    .line 1948
    .line 1949
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v3

    .line 1953
    invoke-static {v5, v3}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 1954
    .line 1955
    .line 1956
    :goto_20
    move-object/from16 v23, v0

    .line 1957
    .line 1958
    move/from16 v18, v6

    .line 1959
    .line 1960
    move-object/from16 v21, v11

    .line 1961
    .line 1962
    :goto_21
    move-object/from16 p0, v27

    .line 1963
    .line 1964
    goto/16 :goto_1a

    .line 1965
    .line 1966
    :cond_6e
    move-object/from16 v23, v0

    .line 1967
    .line 1968
    move v5, v3

    .line 1969
    move/from16 v18, v6

    .line 1970
    .line 1971
    move-object/from16 v21, v11

    .line 1972
    .line 1973
    :goto_22
    move-object/from16 p0, v19

    .line 1974
    .line 1975
    const/4 v3, -0x1

    .line 1976
    const/4 v4, -0x1

    .line 1977
    goto/16 :goto_1c

    .line 1978
    .line 1979
    :pswitch_b
    move-object/from16 v28, v13

    .line 1980
    .line 1981
    iget v3, v1, La/bj30;->R:I

    .line 1982
    .line 1983
    sget-object v12, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 1984
    .line 1985
    invoke-static {v3, v12}, La/vtt0;->z(ILjava/nio/ByteOrder;)I

    .line 1986
    .line 1987
    .line 1988
    move-result v3

    .line 1989
    if-nez v3, :cond_6e

    .line 1990
    .line 1991
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1992
    .line 1993
    const-string v12, "Unsupported big endian PCM bit depth: "

    .line 1994
    .line 1995
    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1996
    .line 1997
    .line 1998
    iget v12, v1, La/bj30;->R:I

    .line 1999
    .line 2000
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2001
    .line 2002
    .line 2003
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2004
    .line 2005
    .line 2006
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v3

    .line 2010
    invoke-static {v5, v3}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 2011
    .line 2012
    .line 2013
    goto :goto_20

    .line 2014
    :pswitch_c
    move-object/from16 v28, v13

    .line 2015
    .line 2016
    iget v3, v1, La/bj30;->R:I

    .line 2017
    .line 2018
    sget-object v12, La/vtt0;->a:Ljava/lang/String;

    .line 2019
    .line 2020
    sget-object v12, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2021
    .line 2022
    invoke-static {v3, v12}, La/vtt0;->x(ILjava/nio/ByteOrder;)I

    .line 2023
    .line 2024
    .line 2025
    move-result v3

    .line 2026
    if-nez v3, :cond_6e

    .line 2027
    .line 2028
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2029
    .line 2030
    const-string v12, "Unsupported floating point PCM bit depth: "

    .line 2031
    .line 2032
    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2033
    .line 2034
    .line 2035
    iget v12, v1, La/bj30;->R:I

    .line 2036
    .line 2037
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2038
    .line 2039
    .line 2040
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2041
    .line 2042
    .line 2043
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v3

    .line 2047
    invoke-static {v5, v3}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 2048
    .line 2049
    .line 2050
    goto :goto_20

    .line 2051
    :pswitch_d
    move-object/from16 v28, v13

    .line 2052
    .line 2053
    const-string v12, "audio/vnd.dts.hd;profile=lbr"

    .line 2054
    .line 2055
    goto/16 :goto_18

    .line 2056
    .line 2057
    :pswitch_e
    move-object/from16 v28, v13

    .line 2058
    .line 2059
    goto/16 :goto_18

    .line 2060
    .line 2061
    :pswitch_f
    move-object/from16 v28, v13

    .line 2062
    .line 2063
    move-object/from16 v23, v0

    .line 2064
    .line 2065
    move/from16 v18, v6

    .line 2066
    .line 2067
    move-object/from16 p0, v10

    .line 2068
    .line 2069
    goto/16 :goto_1d

    .line 2070
    .line 2071
    :pswitch_10
    move-object/from16 v28, v13

    .line 2072
    .line 2073
    iget-object v3, v1, La/bj30;->m:[B

    .line 2074
    .line 2075
    if-nez v3, :cond_6f

    .line 2076
    .line 2077
    const/4 v3, 0x0

    .line 2078
    goto :goto_23

    .line 2079
    :cond_6f
    invoke-static {v3}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v3

    .line 2083
    :goto_23
    const-string v12, "video/x-vnd.on2.vp9"

    .line 2084
    .line 2085
    goto/16 :goto_15

    .line 2086
    .line 2087
    :pswitch_11
    move-object/from16 v28, v13

    .line 2088
    .line 2089
    const-string v12, "video/x-vnd.on2.vp8"

    .line 2090
    .line 2091
    goto/16 :goto_18

    .line 2092
    .line 2093
    :pswitch_12
    move-object/from16 v28, v13

    .line 2094
    .line 2095
    iget-object v3, v1, La/bj30;->m:[B

    .line 2096
    .line 2097
    const-string v12, "video/av01"

    .line 2098
    .line 2099
    if-nez v3, :cond_70

    .line 2100
    .line 2101
    goto/16 :goto_18

    .line 2102
    .line 2103
    :cond_70
    invoke-static {v3}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 2104
    .line 2105
    .line 2106
    move-result-object v3

    .line 2107
    iget-object v4, v1, La/bj30;->m:[B

    .line 2108
    .line 2109
    invoke-static {v4}, La/z55;->h([B)La/z55;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v4

    .line 2113
    if-nez v4, :cond_71

    .line 2114
    .line 2115
    goto/16 :goto_15

    .line 2116
    .line 2117
    :cond_71
    iget v5, v4, La/z55;->c:I

    .line 2118
    .line 2119
    iget v13, v4, La/z55;->e:I

    .line 2120
    .line 2121
    move-object/from16 p0, v3

    .line 2122
    .line 2123
    iget v3, v4, La/z55;->d:I

    .line 2124
    .line 2125
    move/from16 v16, v3

    .line 2126
    .line 2127
    iget v3, v4, La/z55;->b:I

    .line 2128
    .line 2129
    iget-object v4, v4, La/z55;->f:Ljava/lang/Object;

    .line 2130
    .line 2131
    check-cast v4, Ljava/lang/String;

    .line 2132
    .line 2133
    move-object/from16 v17, p0

    .line 2134
    .line 2135
    move-object/from16 v23, v0

    .line 2136
    .line 2137
    move/from16 v18, v6

    .line 2138
    .line 2139
    move-object/from16 v21, v11

    .line 2140
    .line 2141
    move-object/from16 p0, v12

    .line 2142
    .line 2143
    move/from16 v11, v16

    .line 2144
    .line 2145
    move v12, v3

    .line 2146
    move-object/from16 v16, v4

    .line 2147
    .line 2148
    move v6, v5

    .line 2149
    goto/16 :goto_1f

    .line 2150
    .line 2151
    :pswitch_13
    move-object/from16 v28, v13

    .line 2152
    .line 2153
    const/4 v3, 0x1

    .line 2154
    iput-boolean v3, v1, La/bj30;->X:Z

    .line 2155
    .line 2156
    const-string v12, "audio/vnd.dts"

    .line 2157
    .line 2158
    goto/16 :goto_18

    .line 2159
    .line 2160
    :pswitch_14
    move-object/from16 v28, v13

    .line 2161
    .line 2162
    const-string v12, "audio/ac3"

    .line 2163
    .line 2164
    goto/16 :goto_18

    .line 2165
    .line 2166
    :pswitch_15
    move-object/from16 v28, v13

    .line 2167
    .line 2168
    invoke-virtual {v1, v3}, La/bj30;->a(Ljava/lang/String;)[B

    .line 2169
    .line 2170
    .line 2171
    move-result-object v3

    .line 2172
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v3

    .line 2176
    iget-object v4, v1, La/bj30;->m:[B

    .line 2177
    .line 2178
    new-instance v5, La/q8b;

    .line 2179
    .line 2180
    array-length v12, v4

    .line 2181
    invoke-direct {v5, v4, v12}, La/q8b;-><init>([BI)V

    .line 2182
    .line 2183
    .line 2184
    const/4 v4, 0x0

    .line 2185
    invoke-static {v5, v4}, La/cy2;->E(La/q8b;Z)La/cf60;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v5

    .line 2189
    iget v4, v5, La/cf60;->b:I

    .line 2190
    .line 2191
    iput v4, v1, La/bj30;->T:I

    .line 2192
    .line 2193
    iget v4, v5, La/cf60;->c:I

    .line 2194
    .line 2195
    iput v4, v1, La/bj30;->Q:I

    .line 2196
    .line 2197
    iget-object v4, v5, La/cf60;->d:Ljava/lang/Object;

    .line 2198
    .line 2199
    check-cast v4, Ljava/lang/String;

    .line 2200
    .line 2201
    const-string v12, "audio/mp4a-latm"

    .line 2202
    .line 2203
    move-object/from16 v23, v0

    .line 2204
    .line 2205
    move-object/from16 v17, v3

    .line 2206
    .line 2207
    move-object/from16 v16, v4

    .line 2208
    .line 2209
    move/from16 v18, v6

    .line 2210
    .line 2211
    move-object/from16 v21, v11

    .line 2212
    .line 2213
    move-object/from16 p0, v12

    .line 2214
    .line 2215
    :goto_24
    const/4 v3, -0x1

    .line 2216
    const/4 v4, -0x1

    .line 2217
    const/4 v5, -0x1

    .line 2218
    const/4 v6, -0x1

    .line 2219
    const/4 v11, -0x1

    .line 2220
    const/4 v12, -0x1

    .line 2221
    const/4 v13, -0x1

    .line 2222
    goto/16 :goto_33

    .line 2223
    .line 2224
    :pswitch_16
    move-object/from16 v28, v13

    .line 2225
    .line 2226
    const-string v12, "audio/vnd.dts.hd"

    .line 2227
    .line 2228
    goto/16 :goto_18

    .line 2229
    .line 2230
    :pswitch_17
    move-object/from16 v28, v13

    .line 2231
    .line 2232
    invoke-virtual {v1, v3}, La/bj30;->a(Ljava/lang/String;)[B

    .line 2233
    .line 2234
    .line 2235
    move-result-object v3

    .line 2236
    invoke-static {v3}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v3

    .line 2240
    move-object/from16 v23, v0

    .line 2241
    .line 2242
    move-object/from16 v17, v3

    .line 2243
    .line 2244
    move/from16 v18, v6

    .line 2245
    .line 2246
    move-object/from16 p0, v9

    .line 2247
    .line 2248
    :goto_25
    move-object/from16 v21, v11

    .line 2249
    .line 2250
    goto/16 :goto_17

    .line 2251
    .line 2252
    :pswitch_18
    move-object/from16 v28, v13

    .line 2253
    .line 2254
    new-instance v3, La/fq80;

    .line 2255
    .line 2256
    iget-object v4, v1, La/bj30;->c:Ljava/lang/String;

    .line 2257
    .line 2258
    invoke-virtual {v1, v4}, La/bj30;->a(Ljava/lang/String;)[B

    .line 2259
    .line 2260
    .line 2261
    move-result-object v4

    .line 2262
    invoke-direct {v3, v4}, La/fq80;-><init>([B)V

    .line 2263
    .line 2264
    .line 2265
    invoke-static {v3}, La/z95;->a(La/fq80;)La/z95;

    .line 2266
    .line 2267
    .line 2268
    move-result-object v3

    .line 2269
    iget-object v4, v3, La/z95;->a:Ljava/util/ArrayList;

    .line 2270
    .line 2271
    iget v5, v3, La/z95;->b:I

    .line 2272
    .line 2273
    iput v5, v1, La/bj30;->f0:I

    .line 2274
    .line 2275
    iget-object v5, v3, La/z95;->l:Ljava/lang/String;

    .line 2276
    .line 2277
    iget v12, v3, La/z95;->g:I

    .line 2278
    .line 2279
    iget v13, v3, La/z95;->i:I

    .line 2280
    .line 2281
    move-object/from16 v16, v4

    .line 2282
    .line 2283
    iget v4, v3, La/z95;->h:I

    .line 2284
    .line 2285
    move/from16 v17, v4

    .line 2286
    .line 2287
    iget v4, v3, La/z95;->e:I

    .line 2288
    .line 2289
    iget v3, v3, La/z95;->f:I

    .line 2290
    .line 2291
    const-string v18, "video/avc"

    .line 2292
    .line 2293
    goto/16 :goto_1e

    .line 2294
    .line 2295
    :pswitch_19
    move-object/from16 v28, v13

    .line 2296
    .line 2297
    const/4 v4, 0x4

    .line 2298
    new-array v5, v4, [B

    .line 2299
    .line 2300
    invoke-virtual {v1, v3}, La/bj30;->a(Ljava/lang/String;)[B

    .line 2301
    .line 2302
    .line 2303
    move-result-object v3

    .line 2304
    const/4 v12, 0x0

    .line 2305
    invoke-static {v3, v12, v5, v12, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2306
    .line 2307
    .line 2308
    invoke-static {v5}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 2309
    .line 2310
    .line 2311
    move-result-object v3

    .line 2312
    move-object/from16 v23, v0

    .line 2313
    .line 2314
    move-object/from16 v17, v3

    .line 2315
    .line 2316
    move/from16 v18, v6

    .line 2317
    .line 2318
    move-object/from16 p0, v8

    .line 2319
    .line 2320
    goto :goto_25

    .line 2321
    :pswitch_1a
    move-object/from16 v28, v13

    .line 2322
    .line 2323
    new-instance v3, La/fq80;

    .line 2324
    .line 2325
    iget-object v4, v1, La/bj30;->c:Ljava/lang/String;

    .line 2326
    .line 2327
    invoke-virtual {v1, v4}, La/bj30;->a(Ljava/lang/String;)[B

    .line 2328
    .line 2329
    .line 2330
    move-result-object v4

    .line 2331
    invoke-direct {v3, v4}, La/fq80;-><init>([B)V

    .line 2332
    .line 2333
    .line 2334
    const/16 v4, 0x10

    .line 2335
    .line 2336
    :try_start_0
    invoke-virtual {v3, v4}, La/fq80;->N(I)V

    .line 2337
    .line 2338
    .line 2339
    invoke-virtual {v3}, La/fq80;->q()J

    .line 2340
    .line 2341
    .line 2342
    move-result-wide v18

    .line 2343
    const-wide/32 v29, 0x58564944

    .line 2344
    .line 2345
    .line 2346
    cmp-long v4, v18, v29

    .line 2347
    .line 2348
    if-nez v4, :cond_72

    .line 2349
    .line 2350
    new-instance v3, Landroid/util/Pair;

    .line 2351
    .line 2352
    const-string v4, "video/divx"
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2353
    .line 2354
    const/4 v5, 0x0

    .line 2355
    :try_start_1
    invoke-direct {v3, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 2356
    .line 2357
    .line 2358
    :goto_26
    const/4 v5, 0x0

    .line 2359
    goto :goto_28

    .line 2360
    :catch_0
    const/4 v5, 0x0

    .line 2361
    goto/16 :goto_29

    .line 2362
    .line 2363
    :cond_72
    const-wide/32 v29, 0x33363248

    .line 2364
    .line 2365
    .line 2366
    cmp-long v4, v18, v29

    .line 2367
    .line 2368
    if-nez v4, :cond_73

    .line 2369
    .line 2370
    :try_start_2
    new-instance v3, Landroid/util/Pair;

    .line 2371
    .line 2372
    const-string v4, "video/3gpp"
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0

    .line 2373
    .line 2374
    const/4 v5, 0x0

    .line 2375
    :try_start_3
    invoke-direct {v3, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_1

    .line 2376
    .line 2377
    .line 2378
    goto :goto_26

    .line 2379
    :cond_73
    const-wide/32 v29, 0x31435657

    .line 2380
    .line 2381
    .line 2382
    cmp-long v4, v18, v29

    .line 2383
    .line 2384
    if-nez v4, :cond_77

    .line 2385
    .line 2386
    :try_start_4
    iget v4, v3, La/fq80;->b:I

    .line 2387
    .line 2388
    add-int/lit8 v4, v4, 0x14

    .line 2389
    .line 2390
    iget-object v3, v3, La/fq80;->a:[B

    .line 2391
    .line 2392
    :goto_27
    array-length v5, v3

    .line 2393
    const/16 v20, 0x4

    .line 2394
    .line 2395
    add-int/lit8 v5, v5, -0x4

    .line 2396
    .line 2397
    if-ge v4, v5, :cond_76

    .line 2398
    .line 2399
    aget-byte v5, v3, v4

    .line 2400
    .line 2401
    if-nez v5, :cond_74

    .line 2402
    .line 2403
    add-int/lit8 v5, v4, 0x1

    .line 2404
    .line 2405
    aget-byte v5, v3, v5

    .line 2406
    .line 2407
    if-nez v5, :cond_74

    .line 2408
    .line 2409
    add-int/lit8 v5, v4, 0x2

    .line 2410
    .line 2411
    aget-byte v5, v3, v5

    .line 2412
    .line 2413
    const/4 v12, 0x1

    .line 2414
    if-ne v5, v12, :cond_74

    .line 2415
    .line 2416
    add-int/lit8 v5, v4, 0x3

    .line 2417
    .line 2418
    aget-byte v5, v3, v5

    .line 2419
    .line 2420
    const/16 v12, 0xf

    .line 2421
    .line 2422
    if-ne v5, v12, :cond_75

    .line 2423
    .line 2424
    array-length v5, v3

    .line 2425
    invoke-static {v3, v4, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 2426
    .line 2427
    .line 2428
    move-result-object v3

    .line 2429
    new-instance v4, Landroid/util/Pair;

    .line 2430
    .line 2431
    const-string v5, "video/wvc1"

    .line 2432
    .line 2433
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2434
    .line 2435
    .line 2436
    move-result-object v3

    .line 2437
    invoke-direct {v4, v5, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2438
    .line 2439
    .line 2440
    move-object v3, v4

    .line 2441
    goto :goto_26

    .line 2442
    :cond_74
    const/16 v12, 0xf

    .line 2443
    .line 2444
    :cond_75
    add-int/lit8 v4, v4, 0x1

    .line 2445
    .line 2446
    goto :goto_27

    .line 2447
    :cond_76
    const-string v0, "Failed to find FourCC VC1 initialization data"
    :try_end_4
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_0

    .line 2448
    .line 2449
    const/4 v5, 0x0

    .line 2450
    :try_start_5
    invoke-static {v0, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 2451
    .line 2452
    .line 2453
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_1

    .line 2454
    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_0

    .line 2455
    :cond_77
    const-string v3, "Unknown FourCC. Setting mimeType to video/x-unknown"

    .line 2456
    .line 2457
    invoke-static {v5, v3}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 2458
    .line 2459
    .line 2460
    new-instance v3, Landroid/util/Pair;

    .line 2461
    .line 2462
    const/4 v5, 0x0

    .line 2463
    invoke-direct {v3, v12, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2464
    .line 2465
    .line 2466
    :goto_28
    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2467
    .line 2468
    move-object v12, v4

    .line 2469
    check-cast v12, Ljava/lang/String;

    .line 2470
    .line 2471
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 2472
    .line 2473
    move-object/from16 v26, v3

    .line 2474
    .line 2475
    check-cast v26, Ljava/util/List;

    .line 2476
    .line 2477
    move-object/from16 v23, v0

    .line 2478
    .line 2479
    move-object/from16 v16, v5

    .line 2480
    .line 2481
    move/from16 v18, v6

    .line 2482
    .line 2483
    move-object/from16 v21, v11

    .line 2484
    .line 2485
    move-object/from16 p0, v12

    .line 2486
    .line 2487
    move-object/from16 v17, v26

    .line 2488
    .line 2489
    goto/16 :goto_24

    .line 2490
    .line 2491
    :catch_1
    :goto_29
    const-string v0, "Error parsing FourCC private data"

    .line 2492
    .line 2493
    invoke-static {v0, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 2494
    .line 2495
    .line 2496
    move-result-object v0

    .line 2497
    throw v0

    .line 2498
    :pswitch_1b
    move-object/from16 v28, v13

    .line 2499
    .line 2500
    const-string v12, "audio/mpeg"

    .line 2501
    .line 2502
    :goto_2a
    move-object/from16 v23, v0

    .line 2503
    .line 2504
    move/from16 v18, v6

    .line 2505
    .line 2506
    move-object/from16 v21, v11

    .line 2507
    .line 2508
    move-object/from16 p0, v12

    .line 2509
    .line 2510
    const/4 v3, -0x1

    .line 2511
    const/16 v4, 0x1000

    .line 2512
    .line 2513
    goto/16 :goto_1b

    .line 2514
    .line 2515
    :pswitch_1c
    move-object/from16 v28, v13

    .line 2516
    .line 2517
    const-string v12, "audio/mpeg-L2"

    .line 2518
    .line 2519
    goto :goto_2a

    .line 2520
    :pswitch_1d
    move-object/from16 v28, v13

    .line 2521
    .line 2522
    invoke-virtual {v1, v3}, La/bj30;->a(Ljava/lang/String;)[B

    .line 2523
    .line 2524
    .line 2525
    move-result-object v3

    .line 2526
    const-string v4, "Error parsing vorbis codec private"

    .line 2527
    .line 2528
    const/16 v32, 0x0

    .line 2529
    .line 2530
    :try_start_7
    aget-byte v5, v3, v32

    .line 2531
    .line 2532
    const/4 v12, 0x2

    .line 2533
    if-ne v5, v12, :cond_7d

    .line 2534
    .line 2535
    const/4 v5, 0x1

    .line 2536
    const/4 v12, 0x0

    .line 2537
    :goto_2b
    aget-byte v13, v3, v5

    .line 2538
    .line 2539
    move/from16 p0, v5

    .line 2540
    .line 2541
    const/16 v5, 0xff

    .line 2542
    .line 2543
    and-int/2addr v13, v5

    .line 2544
    if-ne v13, v5, :cond_78

    .line 2545
    .line 2546
    add-int/lit16 v12, v12, 0xff

    .line 2547
    .line 2548
    add-int/lit8 v5, p0, 0x1

    .line 2549
    .line 2550
    goto :goto_2b

    .line 2551
    :cond_78
    const/16 v31, 0x1

    .line 2552
    .line 2553
    add-int/lit8 v16, p0, 0x1

    .line 2554
    .line 2555
    add-int/2addr v12, v13

    .line 2556
    move/from16 v18, v6

    .line 2557
    .line 2558
    const/4 v13, 0x0

    .line 2559
    :goto_2c
    aget-byte v6, v3, v16

    .line 2560
    .line 2561
    and-int/2addr v6, v5

    .line 2562
    if-ne v6, v5, :cond_79

    .line 2563
    .line 2564
    add-int/lit16 v13, v13, 0xff

    .line 2565
    .line 2566
    add-int/lit8 v16, v16, 0x1

    .line 2567
    .line 2568
    goto :goto_2c

    .line 2569
    :cond_79
    const/16 v31, 0x1

    .line 2570
    .line 2571
    add-int/lit8 v5, v16, 0x1

    .line 2572
    .line 2573
    add-int/2addr v13, v6

    .line 2574
    aget-byte v6, v3, v5

    .line 2575
    .line 2576
    move/from16 p0, v13

    .line 2577
    .line 2578
    move/from16 v13, v31

    .line 2579
    .line 2580
    if-ne v6, v13, :cond_7c

    .line 2581
    .line 2582
    new-array v6, v12, [B

    .line 2583
    .line 2584
    const/4 v13, 0x0

    .line 2585
    invoke-static {v3, v5, v6, v13, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2586
    .line 2587
    .line 2588
    add-int/2addr v5, v12

    .line 2589
    aget-byte v12, v3, v5

    .line 2590
    .line 2591
    const/4 v13, 0x3

    .line 2592
    if-ne v12, v13, :cond_7b

    .line 2593
    .line 2594
    add-int v5, v5, p0

    .line 2595
    .line 2596
    aget-byte v12, v3, v5

    .line 2597
    .line 2598
    const/4 v13, 0x5

    .line 2599
    if-ne v12, v13, :cond_7a

    .line 2600
    .line 2601
    array-length v12, v3

    .line 2602
    sub-int/2addr v12, v5

    .line 2603
    new-array v12, v12, [B

    .line 2604
    .line 2605
    array-length v13, v3

    .line 2606
    sub-int/2addr v13, v5

    .line 2607
    move-object/from16 v21, v11

    .line 2608
    .line 2609
    const/4 v11, 0x0

    .line 2610
    invoke-static {v3, v5, v12, v11, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2611
    .line 2612
    .line 2613
    new-instance v3, Ljava/util/ArrayList;

    .line 2614
    .line 2615
    const/4 v5, 0x2

    .line 2616
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 2617
    .line 2618
    .line 2619
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2620
    .line 2621
    .line 2622
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_2

    .line 2623
    .line 2624
    .line 2625
    const-string v12, "audio/vorbis"

    .line 2626
    .line 2627
    const/16 v4, 0x2000

    .line 2628
    .line 2629
    move-object/from16 v23, v0

    .line 2630
    .line 2631
    move-object/from16 v17, v3

    .line 2632
    .line 2633
    goto/16 :goto_12

    .line 2634
    .line 2635
    :catch_2
    const/4 v5, 0x0

    .line 2636
    goto :goto_2d

    .line 2637
    :cond_7a
    const/4 v5, 0x0

    .line 2638
    :try_start_8
    invoke-static {v4, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 2639
    .line 2640
    .line 2641
    move-result-object v0

    .line 2642
    throw v0

    .line 2643
    :cond_7b
    const/4 v5, 0x0

    .line 2644
    invoke-static {v4, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 2645
    .line 2646
    .line 2647
    move-result-object v0

    .line 2648
    throw v0

    .line 2649
    :cond_7c
    const/4 v5, 0x0

    .line 2650
    invoke-static {v4, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 2651
    .line 2652
    .line 2653
    move-result-object v0

    .line 2654
    throw v0

    .line 2655
    :cond_7d
    const/4 v5, 0x0

    .line 2656
    invoke-static {v4, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 2657
    .line 2658
    .line 2659
    move-result-object v0

    .line 2660
    throw v0
    :try_end_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_3

    .line 2661
    :catch_3
    :goto_2d
    invoke-static {v4, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 2662
    .line 2663
    .line 2664
    move-result-object v0

    .line 2665
    throw v0

    .line 2666
    :pswitch_1e
    move/from16 v18, v6

    .line 2667
    .line 2668
    move-object/from16 v21, v11

    .line 2669
    .line 2670
    move-object/from16 v28, v13

    .line 2671
    .line 2672
    new-instance v3, La/rrs0;

    .line 2673
    .line 2674
    invoke-direct {v3}, La/rrs0;-><init>()V

    .line 2675
    .line 2676
    .line 2677
    iput-object v3, v1, La/bj30;->W:La/rrs0;

    .line 2678
    .line 2679
    const-string v12, "audio/true-hd"

    .line 2680
    .line 2681
    move-object/from16 v23, v0

    .line 2682
    .line 2683
    goto/16 :goto_19

    .line 2684
    .line 2685
    :pswitch_1f
    move/from16 v18, v6

    .line 2686
    .line 2687
    move-object/from16 v21, v11

    .line 2688
    .line 2689
    move-object/from16 v28, v13

    .line 2690
    .line 2691
    new-instance v3, La/fq80;

    .line 2692
    .line 2693
    iget-object v6, v1, La/bj30;->c:Ljava/lang/String;

    .line 2694
    .line 2695
    invoke-virtual {v1, v6}, La/bj30;->a(Ljava/lang/String;)[B

    .line 2696
    .line 2697
    .line 2698
    move-result-object v6

    .line 2699
    invoke-direct {v3, v6}, La/fq80;-><init>([B)V

    .line 2700
    .line 2701
    .line 2702
    :try_start_9
    invoke-virtual {v3}, La/fq80;->s()I

    .line 2703
    .line 2704
    .line 2705
    move-result v6

    .line 2706
    const/4 v12, 0x1

    .line 2707
    if-ne v6, v12, :cond_7e

    .line 2708
    .line 2709
    goto :goto_30

    .line 2710
    :cond_7e
    const v11, 0xfffe

    .line 2711
    .line 2712
    .line 2713
    if-ne v6, v11, :cond_84

    .line 2714
    .line 2715
    move/from16 v6, v17

    .line 2716
    .line 2717
    invoke-virtual {v3, v6}, La/fq80;->M(I)V

    .line 2718
    .line 2719
    .line 2720
    invoke-virtual {v3}, La/fq80;->r()I

    .line 2721
    .line 2722
    .line 2723
    move-result v6

    .line 2724
    iget v11, v1, La/bj30;->Q:I

    .line 2725
    .line 2726
    shr-int/lit8 v12, v6, 0x12

    .line 2727
    .line 2728
    if-nez v12, :cond_80

    .line 2729
    .line 2730
    if-eqz v6, :cond_7f

    .line 2731
    .line 2732
    invoke-static {v6}, Ljava/lang/Integer;->bitCount(I)I

    .line 2733
    .line 2734
    .line 2735
    move-result v12

    .line 2736
    if-ne v12, v11, :cond_80

    .line 2737
    .line 2738
    :cond_7f
    const/4 v11, 0x1

    .line 2739
    goto :goto_2e

    .line 2740
    :cond_80
    const/4 v11, 0x0

    .line 2741
    :goto_2e
    if-eqz v11, :cond_82

    .line 2742
    .line 2743
    if-nez v6, :cond_81

    .line 2744
    .line 2745
    const/4 v6, -0x1

    .line 2746
    goto :goto_2f

    .line 2747
    :cond_81
    const/16 v25, 0x2

    .line 2748
    .line 2749
    shl-int/lit8 v6, v6, 0x2

    .line 2750
    .line 2751
    :goto_2f
    iput v6, v1, La/bj30;->S:I

    .line 2752
    .line 2753
    :cond_82
    invoke-virtual {v3}, La/fq80;->t()J

    .line 2754
    .line 2755
    .line 2756
    move-result-wide v11

    .line 2757
    sget-object v6, La/cj30;->v0:Ljava/util/UUID;

    .line 2758
    .line 2759
    invoke-virtual {v6}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 2760
    .line 2761
    .line 2762
    move-result-wide v16

    .line 2763
    cmp-long v11, v11, v16

    .line 2764
    .line 2765
    if-nez v11, :cond_84

    .line 2766
    .line 2767
    invoke-virtual {v3}, La/fq80;->t()J

    .line 2768
    .line 2769
    .line 2770
    move-result-wide v11

    .line 2771
    invoke-virtual {v6}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 2772
    .line 2773
    .line 2774
    move-result-wide v16
    :try_end_9
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_9 .. :try_end_9} :catch_4

    .line 2775
    cmp-long v3, v11, v16

    .line 2776
    .line 2777
    if-nez v3, :cond_84

    .line 2778
    .line 2779
    :goto_30
    iget v3, v1, La/bj30;->R:I

    .line 2780
    .line 2781
    sget-object v6, La/vtt0;->a:Ljava/lang/String;

    .line 2782
    .line 2783
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2784
    .line 2785
    invoke-static {v3, v6}, La/vtt0;->z(ILjava/nio/ByteOrder;)I

    .line 2786
    .line 2787
    .line 2788
    move-result v3

    .line 2789
    if-nez v3, :cond_83

    .line 2790
    .line 2791
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2792
    .line 2793
    const-string v6, "Unsupported PCM bit depth: "

    .line 2794
    .line 2795
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2796
    .line 2797
    .line 2798
    iget v6, v1, La/bj30;->R:I

    .line 2799
    .line 2800
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2801
    .line 2802
    .line 2803
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2804
    .line 2805
    .line 2806
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2807
    .line 2808
    .line 2809
    move-result-object v3

    .line 2810
    invoke-static {v5, v3}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 2811
    .line 2812
    .line 2813
    :goto_31
    move-object/from16 v23, v0

    .line 2814
    .line 2815
    goto/16 :goto_21

    .line 2816
    .line 2817
    :cond_83
    move-object/from16 v23, v0

    .line 2818
    .line 2819
    move v5, v3

    .line 2820
    goto/16 :goto_22

    .line 2821
    .line 2822
    :cond_84
    const-string v3, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"

    .line 2823
    .line 2824
    invoke-static {v5, v3}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 2825
    .line 2826
    .line 2827
    goto :goto_31

    .line 2828
    :catch_4
    const-string v0, "Error parsing MS/ACM codec private"

    .line 2829
    .line 2830
    const/4 v5, 0x0

    .line 2831
    invoke-static {v0, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 2832
    .line 2833
    .line 2834
    move-result-object v0

    .line 2835
    throw v0

    .line 2836
    :pswitch_20
    move/from16 v18, v6

    .line 2837
    .line 2838
    move-object/from16 v21, v11

    .line 2839
    .line 2840
    move-object/from16 v28, v13

    .line 2841
    .line 2842
    iget-object v3, v1, La/bj30;->m:[B

    .line 2843
    .line 2844
    if-nez v3, :cond_85

    .line 2845
    .line 2846
    const/4 v3, 0x0

    .line 2847
    goto :goto_32

    .line 2848
    :cond_85
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2849
    .line 2850
    .line 2851
    move-result-object v3

    .line 2852
    :goto_32
    const-string v12, "video/mp4v-es"

    .line 2853
    .line 2854
    move-object/from16 v23, v0

    .line 2855
    .line 2856
    move-object/from16 v17, v3

    .line 2857
    .line 2858
    goto/16 :goto_16

    .line 2859
    .line 2860
    :goto_33
    iget-object v0, v1, La/bj30;->P:[B

    .line 2861
    .line 2862
    if-eqz v0, :cond_86

    .line 2863
    .line 2864
    new-instance v0, La/fq80;

    .line 2865
    .line 2866
    move/from16 v19, v4

    .line 2867
    .line 2868
    iget-object v4, v1, La/bj30;->P:[B

    .line 2869
    .line 2870
    invoke-direct {v0, v4}, La/fq80;-><init>([B)V

    .line 2871
    .line 2872
    .line 2873
    invoke-static {v0}, La/hbb;->a(La/fq80;)La/hbb;

    .line 2874
    .line 2875
    .line 2876
    move-result-object v0

    .line 2877
    if-eqz v0, :cond_87

    .line 2878
    .line 2879
    iget-object v0, v0, La/hbb;->b:Ljava/lang/String;

    .line 2880
    .line 2881
    const-string v4, "video/dolby-vision"

    .line 2882
    .line 2883
    move-object/from16 v16, v0

    .line 2884
    .line 2885
    goto :goto_34

    .line 2886
    :cond_86
    move/from16 v19, v4

    .line 2887
    .line 2888
    :cond_87
    move-object/from16 v4, p0

    .line 2889
    .line 2890
    :goto_34
    iget-boolean v0, v1, La/bj30;->b0:Z

    .line 2891
    .line 2892
    move/from16 v20, v0

    .line 2893
    .line 2894
    iget-boolean v0, v1, La/bj30;->a0:Z

    .line 2895
    .line 2896
    if-eqz v0, :cond_88

    .line 2897
    .line 2898
    const/16 v25, 0x2

    .line 2899
    .line 2900
    goto :goto_35

    .line 2901
    :cond_88
    const/16 v25, 0x0

    .line 2902
    .line 2903
    :goto_35
    or-int v0, v20, v25

    .line 2904
    .line 2905
    move/from16 p0, v0

    .line 2906
    .line 2907
    new-instance v0, La/awq;

    .line 2908
    .line 2909
    invoke-direct {v0}, La/awq;-><init>()V

    .line 2910
    .line 2911
    .line 2912
    invoke-static {v4}, La/mg40;->i(Ljava/lang/String;)Z

    .line 2913
    .line 2914
    .line 2915
    move-result v20

    .line 2916
    if-eqz v20, :cond_89

    .line 2917
    .line 2918
    iget v3, v1, La/bj30;->Q:I

    .line 2919
    .line 2920
    iput v3, v0, La/awq;->I:I

    .line 2921
    .line 2922
    iget v3, v1, La/bj30;->S:I

    .line 2923
    .line 2924
    iput v3, v0, La/awq;->J:I

    .line 2925
    .line 2926
    iget v3, v1, La/bj30;->T:I

    .line 2927
    .line 2928
    iput v3, v0, La/awq;->K:I

    .line 2929
    .line 2930
    iput v5, v0, La/awq;->L:I

    .line 2931
    .line 2932
    goto/16 :goto_43

    .line 2933
    .line 2934
    :cond_89
    invoke-static {v4}, La/mg40;->m(Ljava/lang/String;)Z

    .line 2935
    .line 2936
    .line 2937
    move-result v5

    .line 2938
    if-eqz v5, :cond_9d

    .line 2939
    .line 2940
    iget v5, v1, La/bj30;->t:I

    .line 2941
    .line 2942
    if-nez v5, :cond_8c

    .line 2943
    .line 2944
    iget v5, v1, La/bj30;->r:I

    .line 2945
    .line 2946
    const/4 v7, -0x1

    .line 2947
    if-ne v5, v7, :cond_8a

    .line 2948
    .line 2949
    iget v5, v1, La/bj30;->o:I

    .line 2950
    .line 2951
    :cond_8a
    iput v5, v1, La/bj30;->r:I

    .line 2952
    .line 2953
    iget v5, v1, La/bj30;->s:I

    .line 2954
    .line 2955
    if-ne v5, v7, :cond_8b

    .line 2956
    .line 2957
    iget v5, v1, La/bj30;->p:I

    .line 2958
    .line 2959
    :cond_8b
    iput v5, v1, La/bj30;->s:I

    .line 2960
    .line 2961
    goto :goto_36

    .line 2962
    :cond_8c
    const/4 v7, -0x1

    .line 2963
    :goto_36
    iget v5, v1, La/bj30;->r:I

    .line 2964
    .line 2965
    const/high16 v8, -0x40800000    # -1.0f

    .line 2966
    .line 2967
    if-eq v5, v7, :cond_8d

    .line 2968
    .line 2969
    iget v9, v1, La/bj30;->s:I

    .line 2970
    .line 2971
    if-eq v9, v7, :cond_8d

    .line 2972
    .line 2973
    iget v7, v1, La/bj30;->p:I

    .line 2974
    .line 2975
    mul-int/2addr v7, v5

    .line 2976
    int-to-float v5, v7

    .line 2977
    iget v7, v1, La/bj30;->o:I

    .line 2978
    .line 2979
    mul-int/2addr v7, v9

    .line 2980
    int-to-float v7, v7

    .line 2981
    div-float/2addr v5, v7

    .line 2982
    :goto_37
    const/4 v7, -0x1

    .line 2983
    goto :goto_38

    .line 2984
    :cond_8d
    move v5, v8

    .line 2985
    goto :goto_37

    .line 2986
    :goto_38
    if-ne v6, v7, :cond_8f

    .line 2987
    .line 2988
    if-eq v13, v7, :cond_8e

    .line 2989
    .line 2990
    goto :goto_39

    .line 2991
    :cond_8e
    if-eq v11, v7, :cond_90

    .line 2992
    .line 2993
    iget v6, v1, La/bj30;->C:I

    .line 2994
    .line 2995
    if-ne v6, v7, :cond_90

    .line 2996
    .line 2997
    iget v6, v1, La/bj30;->A:I

    .line 2998
    .line 2999
    iget v13, v1, La/bj30;->B:I

    .line 3000
    .line 3001
    :cond_8f
    :goto_39
    move/from16 v34, v6

    .line 3002
    .line 3003
    move/from16 v35, v11

    .line 3004
    .line 3005
    move/from16 v36, v13

    .line 3006
    .line 3007
    const/4 v7, -0x1

    .line 3008
    goto :goto_3a

    .line 3009
    :cond_90
    iget v6, v1, La/bj30;->A:I

    .line 3010
    .line 3011
    iget v13, v1, La/bj30;->B:I

    .line 3012
    .line 3013
    iget v11, v1, La/bj30;->C:I

    .line 3014
    .line 3015
    goto :goto_39

    .line 3016
    :goto_3a
    if-eq v3, v7, :cond_91

    .line 3017
    .line 3018
    :goto_3b
    move/from16 v38, v3

    .line 3019
    .line 3020
    goto :goto_3c

    .line 3021
    :cond_91
    iget v3, v1, La/bj30;->q:I

    .line 3022
    .line 3023
    if-eq v3, v7, :cond_92

    .line 3024
    .line 3025
    goto :goto_3b

    .line 3026
    :cond_92
    move/from16 v38, v22

    .line 3027
    .line 3028
    :goto_3c
    if-eq v12, v7, :cond_93

    .line 3029
    .line 3030
    move/from16 v39, v12

    .line 3031
    .line 3032
    goto :goto_3d

    .line 3033
    :cond_93
    iget v3, v1, La/bj30;->q:I

    .line 3034
    .line 3035
    if-eq v3, v7, :cond_94

    .line 3036
    .line 3037
    move/from16 v39, v3

    .line 3038
    .line 3039
    goto :goto_3d

    .line 3040
    :cond_94
    move/from16 v39, v22

    .line 3041
    .line 3042
    :goto_3d
    iget v3, v1, La/bj30;->F:F

    .line 3043
    .line 3044
    cmpl-float v3, v3, v8

    .line 3045
    .line 3046
    if-eqz v3, :cond_96

    .line 3047
    .line 3048
    iget v3, v1, La/bj30;->G:F

    .line 3049
    .line 3050
    cmpl-float v3, v3, v8

    .line 3051
    .line 3052
    if-eqz v3, :cond_96

    .line 3053
    .line 3054
    iget v3, v1, La/bj30;->H:F

    .line 3055
    .line 3056
    cmpl-float v3, v3, v8

    .line 3057
    .line 3058
    if-eqz v3, :cond_96

    .line 3059
    .line 3060
    iget v3, v1, La/bj30;->I:F

    .line 3061
    .line 3062
    cmpl-float v3, v3, v8

    .line 3063
    .line 3064
    if-eqz v3, :cond_96

    .line 3065
    .line 3066
    iget v3, v1, La/bj30;->J:F

    .line 3067
    .line 3068
    cmpl-float v3, v3, v8

    .line 3069
    .line 3070
    if-eqz v3, :cond_96

    .line 3071
    .line 3072
    iget v3, v1, La/bj30;->K:F

    .line 3073
    .line 3074
    cmpl-float v3, v3, v8

    .line 3075
    .line 3076
    if-eqz v3, :cond_96

    .line 3077
    .line 3078
    iget v3, v1, La/bj30;->L:F

    .line 3079
    .line 3080
    cmpl-float v3, v3, v8

    .line 3081
    .line 3082
    if-eqz v3, :cond_96

    .line 3083
    .line 3084
    iget v3, v1, La/bj30;->M:F

    .line 3085
    .line 3086
    cmpl-float v3, v3, v8

    .line 3087
    .line 3088
    if-eqz v3, :cond_96

    .line 3089
    .line 3090
    iget v3, v1, La/bj30;->N:F

    .line 3091
    .line 3092
    cmpl-float v3, v3, v8

    .line 3093
    .line 3094
    if-eqz v3, :cond_96

    .line 3095
    .line 3096
    iget v3, v1, La/bj30;->O:F

    .line 3097
    .line 3098
    cmpl-float v3, v3, v8

    .line 3099
    .line 3100
    if-nez v3, :cond_95

    .line 3101
    .line 3102
    goto/16 :goto_3e

    .line 3103
    .line 3104
    :cond_95
    const/16 v3, 0x19

    .line 3105
    .line 3106
    new-array v3, v3, [B

    .line 3107
    .line 3108
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 3109
    .line 3110
    .line 3111
    move-result-object v6

    .line 3112
    sget-object v7, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 3113
    .line 3114
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 3115
    .line 3116
    .line 3117
    move-result-object v6

    .line 3118
    const/4 v11, 0x0

    .line 3119
    invoke-virtual {v6, v11}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 3120
    .line 3121
    .line 3122
    iget v7, v1, La/bj30;->F:F

    .line 3123
    .line 3124
    const v8, 0x47435000    # 50000.0f

    .line 3125
    .line 3126
    .line 3127
    mul-float/2addr v7, v8

    .line 3128
    const/high16 v9, 0x3f000000    # 0.5f

    .line 3129
    .line 3130
    add-float/2addr v7, v9

    .line 3131
    float-to-int v7, v7

    .line 3132
    int-to-short v7, v7

    .line 3133
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3134
    .line 3135
    .line 3136
    iget v7, v1, La/bj30;->G:F

    .line 3137
    .line 3138
    mul-float/2addr v7, v8

    .line 3139
    add-float/2addr v7, v9

    .line 3140
    float-to-int v7, v7

    .line 3141
    int-to-short v7, v7

    .line 3142
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3143
    .line 3144
    .line 3145
    iget v7, v1, La/bj30;->H:F

    .line 3146
    .line 3147
    mul-float/2addr v7, v8

    .line 3148
    add-float/2addr v7, v9

    .line 3149
    float-to-int v7, v7

    .line 3150
    int-to-short v7, v7

    .line 3151
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3152
    .line 3153
    .line 3154
    iget v7, v1, La/bj30;->I:F

    .line 3155
    .line 3156
    mul-float/2addr v7, v8

    .line 3157
    add-float/2addr v7, v9

    .line 3158
    float-to-int v7, v7

    .line 3159
    int-to-short v7, v7

    .line 3160
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3161
    .line 3162
    .line 3163
    iget v7, v1, La/bj30;->J:F

    .line 3164
    .line 3165
    mul-float/2addr v7, v8

    .line 3166
    add-float/2addr v7, v9

    .line 3167
    float-to-int v7, v7

    .line 3168
    int-to-short v7, v7

    .line 3169
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3170
    .line 3171
    .line 3172
    iget v7, v1, La/bj30;->K:F

    .line 3173
    .line 3174
    mul-float/2addr v7, v8

    .line 3175
    add-float/2addr v7, v9

    .line 3176
    float-to-int v7, v7

    .line 3177
    int-to-short v7, v7

    .line 3178
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3179
    .line 3180
    .line 3181
    iget v7, v1, La/bj30;->L:F

    .line 3182
    .line 3183
    mul-float/2addr v7, v8

    .line 3184
    add-float/2addr v7, v9

    .line 3185
    float-to-int v7, v7

    .line 3186
    int-to-short v7, v7

    .line 3187
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3188
    .line 3189
    .line 3190
    iget v7, v1, La/bj30;->M:F

    .line 3191
    .line 3192
    mul-float/2addr v7, v8

    .line 3193
    add-float/2addr v7, v9

    .line 3194
    float-to-int v7, v7

    .line 3195
    int-to-short v7, v7

    .line 3196
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3197
    .line 3198
    .line 3199
    iget v7, v1, La/bj30;->N:F

    .line 3200
    .line 3201
    add-float/2addr v7, v9

    .line 3202
    float-to-int v7, v7

    .line 3203
    int-to-short v7, v7

    .line 3204
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3205
    .line 3206
    .line 3207
    iget v7, v1, La/bj30;->O:F

    .line 3208
    .line 3209
    add-float/2addr v7, v9

    .line 3210
    float-to-int v7, v7

    .line 3211
    int-to-short v7, v7

    .line 3212
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3213
    .line 3214
    .line 3215
    iget v7, v1, La/bj30;->D:I

    .line 3216
    .line 3217
    int-to-short v7, v7

    .line 3218
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3219
    .line 3220
    .line 3221
    iget v7, v1, La/bj30;->E:I

    .line 3222
    .line 3223
    int-to-short v7, v7

    .line 3224
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3225
    .line 3226
    .line 3227
    move-object/from16 v37, v3

    .line 3228
    .line 3229
    goto :goto_3f

    .line 3230
    :cond_96
    :goto_3e
    const/16 v37, 0x0

    .line 3231
    .line 3232
    :goto_3f
    new-instance v33, La/c4d;

    .line 3233
    .line 3234
    invoke-direct/range {v33 .. v39}, La/c4d;-><init>(III[BII)V

    .line 3235
    .line 3236
    .line 3237
    move-object/from16 v3, v33

    .line 3238
    .line 3239
    iget-object v6, v1, La/bj30;->b:Ljava/lang/String;

    .line 3240
    .line 3241
    if-eqz v6, :cond_97

    .line 3242
    .line 3243
    invoke-interface {v2, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 3244
    .line 3245
    .line 3246
    move-result v6

    .line 3247
    if-eqz v6, :cond_97

    .line 3248
    .line 3249
    iget-object v6, v1, La/bj30;->b:Ljava/lang/String;

    .line 3250
    .line 3251
    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3252
    .line 3253
    .line 3254
    move-result-object v6

    .line 3255
    check-cast v6, Ljava/lang/Integer;

    .line 3256
    .line 3257
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 3258
    .line 3259
    .line 3260
    move-result v14

    .line 3261
    goto :goto_40

    .line 3262
    :cond_97
    const/4 v14, -0x1

    .line 3263
    :goto_40
    iget v6, v1, La/bj30;->u:I

    .line 3264
    .line 3265
    if-nez v6, :cond_9c

    .line 3266
    .line 3267
    iget v6, v1, La/bj30;->v:F

    .line 3268
    .line 3269
    const/4 v7, 0x0

    .line 3270
    invoke-static {v6, v7}, Ljava/lang/Float;->compare(FF)I

    .line 3271
    .line 3272
    .line 3273
    move-result v6

    .line 3274
    if-nez v6, :cond_9c

    .line 3275
    .line 3276
    iget v6, v1, La/bj30;->w:F

    .line 3277
    .line 3278
    invoke-static {v6, v7}, Ljava/lang/Float;->compare(FF)I

    .line 3279
    .line 3280
    .line 3281
    move-result v6

    .line 3282
    if-nez v6, :cond_9c

    .line 3283
    .line 3284
    iget v6, v1, La/bj30;->x:F

    .line 3285
    .line 3286
    invoke-static {v6, v7}, Ljava/lang/Float;->compare(FF)I

    .line 3287
    .line 3288
    .line 3289
    move-result v6

    .line 3290
    if-nez v6, :cond_98

    .line 3291
    .line 3292
    const/4 v7, 0x0

    .line 3293
    goto :goto_42

    .line 3294
    :cond_98
    iget v6, v1, La/bj30;->x:F

    .line 3295
    .line 3296
    const/high16 v7, 0x42b40000    # 90.0f

    .line 3297
    .line 3298
    invoke-static {v6, v7}, Ljava/lang/Float;->compare(FF)I

    .line 3299
    .line 3300
    .line 3301
    move-result v6

    .line 3302
    if-nez v6, :cond_99

    .line 3303
    .line 3304
    const/16 v7, 0x5a

    .line 3305
    .line 3306
    goto :goto_42

    .line 3307
    :cond_99
    iget v6, v1, La/bj30;->x:F

    .line 3308
    .line 3309
    const/high16 v7, -0x3ccc0000    # -180.0f

    .line 3310
    .line 3311
    invoke-static {v6, v7}, Ljava/lang/Float;->compare(FF)I

    .line 3312
    .line 3313
    .line 3314
    move-result v6

    .line 3315
    if-eqz v6, :cond_9b

    .line 3316
    .line 3317
    iget v6, v1, La/bj30;->x:F

    .line 3318
    .line 3319
    const/high16 v7, 0x43340000    # 180.0f

    .line 3320
    .line 3321
    invoke-static {v6, v7}, Ljava/lang/Float;->compare(FF)I

    .line 3322
    .line 3323
    .line 3324
    move-result v6

    .line 3325
    if-nez v6, :cond_9a

    .line 3326
    .line 3327
    goto :goto_41

    .line 3328
    :cond_9a
    iget v6, v1, La/bj30;->x:F

    .line 3329
    .line 3330
    const/high16 v7, -0x3d4c0000    # -90.0f

    .line 3331
    .line 3332
    invoke-static {v6, v7}, Ljava/lang/Float;->compare(FF)I

    .line 3333
    .line 3334
    .line 3335
    move-result v6

    .line 3336
    if-nez v6, :cond_9c

    .line 3337
    .line 3338
    const/16 v7, 0x10e

    .line 3339
    .line 3340
    goto :goto_42

    .line 3341
    :cond_9b
    :goto_41
    const/16 v7, 0xb4

    .line 3342
    .line 3343
    goto :goto_42

    .line 3344
    :cond_9c
    move v7, v14

    .line 3345
    :goto_42
    iget v6, v1, La/bj30;->o:I

    .line 3346
    .line 3347
    iput v6, v0, La/awq;->v:I

    .line 3348
    .line 3349
    iget v6, v1, La/bj30;->p:I

    .line 3350
    .line 3351
    iput v6, v0, La/awq;->w:I

    .line 3352
    .line 3353
    iput v5, v0, La/awq;->D:F

    .line 3354
    .line 3355
    iput v7, v0, La/awq;->B:I

    .line 3356
    .line 3357
    iget-object v5, v1, La/bj30;->y:[B

    .line 3358
    .line 3359
    iput-object v5, v0, La/awq;->E:[B

    .line 3360
    .line 3361
    iget v5, v1, La/bj30;->z:I

    .line 3362
    .line 3363
    iput v5, v0, La/awq;->F:I

    .line 3364
    .line 3365
    iput-object v3, v0, La/awq;->G:La/c4d;

    .line 3366
    .line 3367
    goto :goto_43

    .line 3368
    :cond_9d
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3369
    .line 3370
    .line 3371
    move-result v3

    .line 3372
    if-nez v3, :cond_9f

    .line 3373
    .line 3374
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3375
    .line 3376
    .line 3377
    move-result v3

    .line 3378
    if-nez v3, :cond_9f

    .line 3379
    .line 3380
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3381
    .line 3382
    .line 3383
    move-result v3

    .line 3384
    if-nez v3, :cond_9f

    .line 3385
    .line 3386
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3387
    .line 3388
    .line 3389
    move-result v3

    .line 3390
    if-nez v3, :cond_9f

    .line 3391
    .line 3392
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3393
    .line 3394
    .line 3395
    move-result v3

    .line 3396
    if-nez v3, :cond_9f

    .line 3397
    .line 3398
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3399
    .line 3400
    .line 3401
    move-result v3

    .line 3402
    if-eqz v3, :cond_9e

    .line 3403
    .line 3404
    goto :goto_43

    .line 3405
    :cond_9e
    const-string v0, "Unexpected MIME type."

    .line 3406
    .line 3407
    const/4 v5, 0x0

    .line 3408
    invoke-static {v0, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 3409
    .line 3410
    .line 3411
    move-result-object v0

    .line 3412
    throw v0

    .line 3413
    :cond_9f
    :goto_43
    iget-object v3, v1, La/bj30;->b:Ljava/lang/String;

    .line 3414
    .line 3415
    if-eqz v3, :cond_a0

    .line 3416
    .line 3417
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 3418
    .line 3419
    .line 3420
    move-result v2

    .line 3421
    if-nez v2, :cond_a0

    .line 3422
    .line 3423
    iget-object v2, v1, La/bj30;->b:Ljava/lang/String;

    .line 3424
    .line 3425
    iput-object v2, v0, La/awq;->b:Ljava/lang/String;

    .line 3426
    .line 3427
    :cond_a0
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 3428
    .line 3429
    .line 3430
    move-result-object v2

    .line 3431
    iput-object v2, v0, La/awq;->a:Ljava/lang/String;

    .line 3432
    .line 3433
    iget-boolean v2, v1, La/bj30;->a:Z

    .line 3434
    .line 3435
    if-eqz v2, :cond_a1

    .line 3436
    .line 3437
    move-object/from16 v13, v28

    .line 3438
    .line 3439
    goto :goto_44

    .line 3440
    :cond_a1
    const-string v13, "video/x-matroska"

    .line 3441
    .line 3442
    :goto_44
    invoke-static {v13}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 3443
    .line 3444
    .line 3445
    move-result-object v2

    .line 3446
    iput-object v2, v0, La/awq;->n:Ljava/lang/String;

    .line 3447
    .line 3448
    invoke-static {v4}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 3449
    .line 3450
    .line 3451
    move-result-object v2

    .line 3452
    iput-object v2, v0, La/awq;->o:Ljava/lang/String;

    .line 3453
    .line 3454
    move/from16 v4, v19

    .line 3455
    .line 3456
    iput v4, v0, La/awq;->p:I

    .line 3457
    .line 3458
    iget-object v2, v1, La/bj30;->c0:Ljava/lang/String;

    .line 3459
    .line 3460
    iput-object v2, v0, La/awq;->d:Ljava/lang/String;

    .line 3461
    .line 3462
    move/from16 v2, p0

    .line 3463
    .line 3464
    iput v2, v0, La/awq;->e:I

    .line 3465
    .line 3466
    move-object/from16 v3, v17

    .line 3467
    .line 3468
    iput-object v3, v0, La/awq;->r:Ljava/util/List;

    .line 3469
    .line 3470
    move-object/from16 v2, v16

    .line 3471
    .line 3472
    iput-object v2, v0, La/awq;->k:Ljava/lang/String;

    .line 3473
    .line 3474
    iget-object v2, v1, La/bj30;->n:Landroidx/media3/common/DrmInitData;

    .line 3475
    .line 3476
    iput-object v2, v0, La/awq;->s:Landroidx/media3/common/DrmInitData;

    .line 3477
    .line 3478
    new-instance v2, Landroidx/media3/common/b;

    .line 3479
    .line 3480
    invoke-direct {v2, v0}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 3481
    .line 3482
    .line 3483
    iput-object v2, v1, La/bj30;->e0:Landroidx/media3/common/b;

    .line 3484
    .line 3485
    move-object/from16 v0, v23

    .line 3486
    .line 3487
    iget-object v2, v0, La/cj30;->q0:La/huo;

    .line 3488
    .line 3489
    iget v3, v1, La/bj30;->d:I

    .line 3490
    .line 3491
    iget v4, v1, La/bj30;->f:I

    .line 3492
    .line 3493
    invoke-interface {v2, v3, v4}, La/huo;->q(II)La/ncs0;

    .line 3494
    .line 3495
    .line 3496
    move-result-object v2

    .line 3497
    iput-object v2, v1, La/bj30;->d0:La/ncs0;

    .line 3498
    .line 3499
    iget v2, v1, La/bj30;->d:I

    .line 3500
    .line 3501
    move-object/from16 v3, v21

    .line 3502
    .line 3503
    invoke-virtual {v3, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 3504
    .line 3505
    .line 3506
    goto/16 :goto_f

    .line 3507
    .line 3508
    :goto_45
    iput-object v5, v0, La/cj30;->B:La/bj30;

    .line 3509
    .line 3510
    :goto_46
    const/16 v31, 0x1

    .line 3511
    .line 3512
    return v31

    .line 3513
    :cond_a2
    move-object v5, v4

    .line 3514
    const-string v0, "CodecId is missing in TrackEntry element"

    .line 3515
    .line 3516
    invoke-static {v0, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 3517
    .line 3518
    .line 3519
    move-result-object v0

    .line 3520
    throw v0

    .line 3521
    :cond_a3
    move-object v3, v11

    .line 3522
    iget-byte v1, v0, La/cj30;->V:B

    .line 3523
    .line 3524
    const/4 v12, 0x2

    .line 3525
    if-eq v1, v12, :cond_a4

    .line 3526
    .line 3527
    const/4 v12, 0x1

    .line 3528
    goto/16 :goto_49

    .line 3529
    .line 3530
    :cond_a4
    iget v1, v0, La/cj30;->b0:I

    .line 3531
    .line 3532
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 3533
    .line 3534
    .line 3535
    move-result-object v1

    .line 3536
    check-cast v1, La/bj30;

    .line 3537
    .line 3538
    iget-object v2, v1, La/bj30;->d0:La/ncs0;

    .line 3539
    .line 3540
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3541
    .line 3542
    .line 3543
    iget-wide v2, v0, La/cj30;->g0:J

    .line 3544
    .line 3545
    cmp-long v2, v2, v16

    .line 3546
    .line 3547
    if-lez v2, :cond_a5

    .line 3548
    .line 3549
    iget-object v2, v1, La/bj30;->c:Ljava/lang/String;

    .line 3550
    .line 3551
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3552
    .line 3553
    .line 3554
    move-result v2

    .line 3555
    if-eqz v2, :cond_a5

    .line 3556
    .line 3557
    iget-object v2, v0, La/cj30;->r:La/fq80;

    .line 3558
    .line 3559
    invoke-static/range {v22 .. v22}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 3560
    .line 3561
    .line 3562
    move-result-object v3

    .line 3563
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 3564
    .line 3565
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 3566
    .line 3567
    .line 3568
    move-result-object v3

    .line 3569
    iget-wide v4, v0, La/cj30;->g0:J

    .line 3570
    .line 3571
    invoke-virtual {v3, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 3572
    .line 3573
    .line 3574
    move-result-object v3

    .line 3575
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    .line 3576
    .line 3577
    .line 3578
    move-result-object v3

    .line 3579
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3580
    .line 3581
    .line 3582
    array-length v4, v3

    .line 3583
    invoke-virtual {v2, v3, v4}, La/fq80;->K([BI)V

    .line 3584
    .line 3585
    .line 3586
    :cond_a5
    const/4 v2, 0x0

    .line 3587
    const/4 v3, 0x0

    .line 3588
    :goto_47
    iget v4, v0, La/cj30;->Z:I

    .line 3589
    .line 3590
    if-ge v2, v4, :cond_a6

    .line 3591
    .line 3592
    iget-object v4, v0, La/cj30;->a0:[I

    .line 3593
    .line 3594
    aget v4, v4, v2

    .line 3595
    .line 3596
    add-int/2addr v3, v4

    .line 3597
    add-int/lit8 v2, v2, 0x1

    .line 3598
    .line 3599
    goto :goto_47

    .line 3600
    :cond_a6
    const/4 v2, 0x0

    .line 3601
    :goto_48
    iget v4, v0, La/cj30;->Z:I

    .line 3602
    .line 3603
    if-ge v2, v4, :cond_a8

    .line 3604
    .line 3605
    iget-wide v4, v0, La/cj30;->W:J

    .line 3606
    .line 3607
    iget v6, v1, La/bj30;->g:I

    .line 3608
    .line 3609
    mul-int/2addr v6, v2

    .line 3610
    div-int/lit16 v6, v6, 0x3e8

    .line 3611
    .line 3612
    int-to-long v6, v6

    .line 3613
    add-long v26, v4, v6

    .line 3614
    .line 3615
    iget v4, v0, La/cj30;->d0:I

    .line 3616
    .line 3617
    if-nez v2, :cond_a7

    .line 3618
    .line 3619
    iget-boolean v5, v0, La/cj30;->f0:Z

    .line 3620
    .line 3621
    if-nez v5, :cond_a7

    .line 3622
    .line 3623
    or-int/lit8 v4, v4, 0x1

    .line 3624
    .line 3625
    :cond_a7
    move/from16 v28, v4

    .line 3626
    .line 3627
    iget-object v4, v0, La/cj30;->a0:[I

    .line 3628
    .line 3629
    aget v29, v4, v2

    .line 3630
    .line 3631
    sub-int v30, v3, v29

    .line 3632
    .line 3633
    move-object/from16 v24, v0

    .line 3634
    .line 3635
    move-object/from16 v25, v1

    .line 3636
    .line 3637
    invoke-virtual/range {v24 .. v30}, La/cj30;->i(La/bj30;JIII)V

    .line 3638
    .line 3639
    .line 3640
    add-int/lit8 v2, v2, 0x1

    .line 3641
    .line 3642
    move/from16 v3, v30

    .line 3643
    .line 3644
    goto :goto_48

    .line 3645
    :cond_a8
    const/4 v11, 0x0

    .line 3646
    iput-byte v11, v0, La/cj30;->V:B

    .line 3647
    .line 3648
    const/4 v12, 0x1

    .line 3649
    return v12

    .line 3650
    :cond_a9
    move v12, v8

    .line 3651
    iget-object v0, v0, La/cj30;->A:La/yi30;

    .line 3652
    .line 3653
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3654
    .line 3655
    .line 3656
    iget-object v1, v0, La/yi30;->f:Ljava/lang/String;

    .line 3657
    .line 3658
    if-nez v1, :cond_aa

    .line 3659
    .line 3660
    iget-object v1, v0, La/yi30;->h:Ljava/lang/String;

    .line 3661
    .line 3662
    if-eqz v1, :cond_aa

    .line 3663
    .line 3664
    iput-object v1, v0, La/yi30;->f:Ljava/lang/String;

    .line 3665
    .line 3666
    iget-object v1, v0, La/yi30;->i:Ljava/lang/String;

    .line 3667
    .line 3668
    if-eqz v1, :cond_aa

    .line 3669
    .line 3670
    iput-object v1, v0, La/yi30;->g:Ljava/lang/String;

    .line 3671
    .line 3672
    :cond_aa
    :goto_49
    return v12

    .line 3673
    :cond_ab
    :goto_4a
    move v12, v8

    .line 3674
    goto :goto_4b

    .line 3675
    :cond_ac
    const/16 v22, 0x8

    .line 3676
    .line 3677
    goto :goto_4a

    .line 3678
    :goto_4b
    iget-byte v3, v0, La/buj;->e:B

    .line 3679
    .line 3680
    iget-object v4, v0, La/buj;->c:La/u3u0;

    .line 3681
    .line 3682
    if-nez v3, :cond_b3

    .line 3683
    .line 3684
    const/4 v5, 0x4

    .line 3685
    const/4 v11, 0x0

    .line 3686
    invoke-virtual {v4, v1, v12, v11, v5}, La/u3u0;->j(La/guo;ZZI)J

    .line 3687
    .line 3688
    .line 3689
    move-result-wide v7

    .line 3690
    const-wide/16 v12, -0x2

    .line 3691
    .line 3692
    cmp-long v3, v7, v12

    .line 3693
    .line 3694
    if-nez v3, :cond_b1

    .line 3695
    .line 3696
    invoke-interface {v1}, La/guo;->g()V

    .line 3697
    .line 3698
    .line 3699
    :goto_4c
    iget-object v3, v0, La/buj;->a:[B

    .line 3700
    .line 3701
    invoke-interface {v1, v3, v11, v5}, La/guo;->n([BII)V

    .line 3702
    .line 3703
    .line 3704
    aget-byte v5, v3, v11

    .line 3705
    .line 3706
    move/from16 v8, v22

    .line 3707
    .line 3708
    const/4 v7, 0x0

    .line 3709
    :goto_4d
    if-ge v7, v8, :cond_ae

    .line 3710
    .line 3711
    sget-object v8, La/u3u0;->d:[J

    .line 3712
    .line 3713
    aget-wide v11, v8, v7

    .line 3714
    .line 3715
    int-to-long v13, v5

    .line 3716
    and-long/2addr v11, v13

    .line 3717
    cmp-long v8, v11, v16

    .line 3718
    .line 3719
    if-eqz v8, :cond_ad

    .line 3720
    .line 3721
    add-int/lit8 v7, v7, 0x1

    .line 3722
    .line 3723
    :goto_4e
    const/4 v5, -0x1

    .line 3724
    goto :goto_4f

    .line 3725
    :cond_ad
    add-int/lit8 v7, v7, 0x1

    .line 3726
    .line 3727
    const/16 v8, 0x8

    .line 3728
    .line 3729
    goto :goto_4d

    .line 3730
    :cond_ae
    const/4 v7, -0x1

    .line 3731
    goto :goto_4e

    .line 3732
    :goto_4f
    if-eq v7, v5, :cond_af

    .line 3733
    .line 3734
    const/4 v8, 0x4

    .line 3735
    if-gt v7, v8, :cond_af

    .line 3736
    .line 3737
    const/4 v11, 0x0

    .line 3738
    invoke-static {v3, v11, v7}, La/u3u0;->a([BZI)J

    .line 3739
    .line 3740
    .line 3741
    move-result-wide v12

    .line 3742
    long-to-int v3, v12

    .line 3743
    iget-object v8, v0, La/buj;->d:La/pv00;

    .line 3744
    .line 3745
    iget-object v8, v8, La/pv00;->a:Ljava/lang/Object;

    .line 3746
    .line 3747
    if-eq v3, v6, :cond_b0

    .line 3748
    .line 3749
    const v8, 0x1043a770

    .line 3750
    .line 3751
    .line 3752
    if-eq v3, v8, :cond_b0

    .line 3753
    .line 3754
    const v8, 0x1f43b675

    .line 3755
    .line 3756
    .line 3757
    if-eq v3, v8, :cond_b0

    .line 3758
    .line 3759
    if-eq v3, v10, :cond_b0

    .line 3760
    .line 3761
    if-ne v3, v9, :cond_af

    .line 3762
    .line 3763
    goto :goto_50

    .line 3764
    :cond_af
    const/4 v12, 0x1

    .line 3765
    goto :goto_51

    .line 3766
    :cond_b0
    :goto_50
    invoke-interface {v1, v7}, La/guo;->m(I)V

    .line 3767
    .line 3768
    .line 3769
    int-to-long v7, v3

    .line 3770
    :cond_b1
    const/4 v12, 0x1

    .line 3771
    goto :goto_52

    .line 3772
    :goto_51
    invoke-interface {v1, v12}, La/guo;->m(I)V

    .line 3773
    .line 3774
    .line 3775
    const/4 v5, 0x4

    .line 3776
    const/4 v11, 0x0

    .line 3777
    const/16 v22, 0x8

    .line 3778
    .line 3779
    goto :goto_4c

    .line 3780
    :goto_52
    cmp-long v3, v7, v18

    .line 3781
    .line 3782
    if-nez v3, :cond_b2

    .line 3783
    .line 3784
    const/4 v11, 0x0

    .line 3785
    return v11

    .line 3786
    :cond_b2
    const/4 v11, 0x0

    .line 3787
    long-to-int v3, v7

    .line 3788
    iput v3, v0, La/buj;->f:I

    .line 3789
    .line 3790
    iput-byte v12, v0, La/buj;->e:B

    .line 3791
    .line 3792
    move v3, v12

    .line 3793
    goto :goto_53

    .line 3794
    :cond_b3
    const/4 v11, 0x0

    .line 3795
    :goto_53
    if-ne v3, v12, :cond_b4

    .line 3796
    .line 3797
    const/16 v8, 0x8

    .line 3798
    .line 3799
    invoke-virtual {v4, v1, v11, v12, v8}, La/u3u0;->j(La/guo;ZZI)J

    .line 3800
    .line 3801
    .line 3802
    move-result-wide v3

    .line 3803
    iput-wide v3, v0, La/buj;->g:J

    .line 3804
    .line 3805
    const/4 v12, 0x2

    .line 3806
    iput-byte v12, v0, La/buj;->e:B

    .line 3807
    .line 3808
    :cond_b4
    iget-object v3, v0, La/buj;->d:La/pv00;

    .line 3809
    .line 3810
    iget v4, v0, La/buj;->f:I

    .line 3811
    .line 3812
    iget-object v5, v3, La/pv00;->a:Ljava/lang/Object;

    .line 3813
    .line 3814
    sparse-switch v4, :sswitch_data_2

    .line 3815
    .line 3816
    .line 3817
    const/4 v5, 0x0

    .line 3818
    goto :goto_54

    .line 3819
    :sswitch_46
    const/4 v5, 0x5

    .line 3820
    goto :goto_54

    .line 3821
    :sswitch_47
    const/4 v5, 0x4

    .line 3822
    goto :goto_54

    .line 3823
    :sswitch_48
    const/4 v5, 0x3

    .line 3824
    goto :goto_54

    .line 3825
    :sswitch_49
    const/4 v5, 0x2

    .line 3826
    goto :goto_54

    .line 3827
    :sswitch_4a
    const/4 v5, 0x1

    .line 3828
    :goto_54
    if-eqz v5, :cond_c3

    .line 3829
    .line 3830
    const/4 v12, 0x1

    .line 3831
    if-eq v5, v12, :cond_c2

    .line 3832
    .line 3833
    const-wide/16 v6, 0x8

    .line 3834
    .line 3835
    const/4 v12, 0x2

    .line 3836
    if-eq v5, v12, :cond_c0

    .line 3837
    .line 3838
    const/4 v13, 0x3

    .line 3839
    if-eq v5, v13, :cond_bc

    .line 3840
    .line 3841
    const/4 v8, 0x4

    .line 3842
    if-eq v5, v8, :cond_bb

    .line 3843
    .line 3844
    const/4 v13, 0x5

    .line 3845
    if-ne v5, v13, :cond_ba

    .line 3846
    .line 3847
    iget-wide v8, v0, La/buj;->g:J

    .line 3848
    .line 3849
    const-wide/16 v10, 0x4

    .line 3850
    .line 3851
    cmp-long v2, v8, v10

    .line 3852
    .line 3853
    if-eqz v2, :cond_b6

    .line 3854
    .line 3855
    cmp-long v2, v8, v6

    .line 3856
    .line 3857
    if-nez v2, :cond_b5

    .line 3858
    .line 3859
    goto :goto_55

    .line 3860
    :cond_b5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 3861
    .line 3862
    const-string v2, "Invalid float size: "

    .line 3863
    .line 3864
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3865
    .line 3866
    .line 3867
    iget-wide v2, v0, La/buj;->g:J

    .line 3868
    .line 3869
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 3870
    .line 3871
    .line 3872
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3873
    .line 3874
    .line 3875
    move-result-object v0

    .line 3876
    const/4 v5, 0x0

    .line 3877
    invoke-static {v0, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 3878
    .line 3879
    .line 3880
    move-result-object v0

    .line 3881
    throw v0

    .line 3882
    :cond_b6
    :goto_55
    long-to-int v2, v8

    .line 3883
    invoke-virtual {v0, v1, v2}, La/buj;->b(La/guo;I)J

    .line 3884
    .line 3885
    .line 3886
    move-result-wide v5

    .line 3887
    const/4 v8, 0x4

    .line 3888
    if-ne v2, v8, :cond_b7

    .line 3889
    .line 3890
    long-to-int v1, v5

    .line 3891
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 3892
    .line 3893
    .line 3894
    move-result v1

    .line 3895
    float-to-double v1, v1

    .line 3896
    goto :goto_56

    .line 3897
    :cond_b7
    invoke-static {v5, v6}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 3898
    .line 3899
    .line 3900
    move-result-wide v1

    .line 3901
    :goto_56
    iget-object v3, v3, La/pv00;->a:Ljava/lang/Object;

    .line 3902
    .line 3903
    check-cast v3, La/cj30;

    .line 3904
    .line 3905
    const/16 v5, 0xb5

    .line 3906
    .line 3907
    if-eq v4, v5, :cond_b9

    .line 3908
    .line 3909
    const/16 v5, 0x4489

    .line 3910
    .line 3911
    if-eq v4, v5, :cond_b8

    .line 3912
    .line 3913
    packed-switch v4, :pswitch_data_2

    .line 3914
    .line 3915
    .line 3916
    packed-switch v4, :pswitch_data_3

    .line 3917
    .line 3918
    .line 3919
    :goto_57
    const/4 v11, 0x0

    .line 3920
    goto/16 :goto_58

    .line 3921
    .line 3922
    :pswitch_21
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 3923
    .line 3924
    .line 3925
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 3926
    .line 3927
    double-to-float v1, v1

    .line 3928
    iput v1, v3, La/bj30;->x:F

    .line 3929
    .line 3930
    goto :goto_57

    .line 3931
    :pswitch_22
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 3932
    .line 3933
    .line 3934
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 3935
    .line 3936
    double-to-float v1, v1

    .line 3937
    iput v1, v3, La/bj30;->w:F

    .line 3938
    .line 3939
    goto :goto_57

    .line 3940
    :pswitch_23
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 3941
    .line 3942
    .line 3943
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 3944
    .line 3945
    double-to-float v1, v1

    .line 3946
    iput v1, v3, La/bj30;->v:F

    .line 3947
    .line 3948
    goto :goto_57

    .line 3949
    :pswitch_24
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 3950
    .line 3951
    .line 3952
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 3953
    .line 3954
    double-to-float v1, v1

    .line 3955
    iput v1, v3, La/bj30;->O:F

    .line 3956
    .line 3957
    goto :goto_57

    .line 3958
    :pswitch_25
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 3959
    .line 3960
    .line 3961
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 3962
    .line 3963
    double-to-float v1, v1

    .line 3964
    iput v1, v3, La/bj30;->N:F

    .line 3965
    .line 3966
    goto :goto_57

    .line 3967
    :pswitch_26
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 3968
    .line 3969
    .line 3970
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 3971
    .line 3972
    double-to-float v1, v1

    .line 3973
    iput v1, v3, La/bj30;->M:F

    .line 3974
    .line 3975
    goto :goto_57

    .line 3976
    :pswitch_27
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 3977
    .line 3978
    .line 3979
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 3980
    .line 3981
    double-to-float v1, v1

    .line 3982
    iput v1, v3, La/bj30;->L:F

    .line 3983
    .line 3984
    goto :goto_57

    .line 3985
    :pswitch_28
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 3986
    .line 3987
    .line 3988
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 3989
    .line 3990
    double-to-float v1, v1

    .line 3991
    iput v1, v3, La/bj30;->K:F

    .line 3992
    .line 3993
    goto :goto_57

    .line 3994
    :pswitch_29
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 3995
    .line 3996
    .line 3997
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 3998
    .line 3999
    double-to-float v1, v1

    .line 4000
    iput v1, v3, La/bj30;->J:F

    .line 4001
    .line 4002
    goto :goto_57

    .line 4003
    :pswitch_2a
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 4004
    .line 4005
    .line 4006
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 4007
    .line 4008
    double-to-float v1, v1

    .line 4009
    iput v1, v3, La/bj30;->I:F

    .line 4010
    .line 4011
    goto :goto_57

    .line 4012
    :pswitch_2b
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 4013
    .line 4014
    .line 4015
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 4016
    .line 4017
    double-to-float v1, v1

    .line 4018
    iput v1, v3, La/bj30;->H:F

    .line 4019
    .line 4020
    goto :goto_57

    .line 4021
    :pswitch_2c
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 4022
    .line 4023
    .line 4024
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 4025
    .line 4026
    double-to-float v1, v1

    .line 4027
    iput v1, v3, La/bj30;->G:F

    .line 4028
    .line 4029
    goto :goto_57

    .line 4030
    :pswitch_2d
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 4031
    .line 4032
    .line 4033
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 4034
    .line 4035
    double-to-float v1, v1

    .line 4036
    iput v1, v3, La/bj30;->F:F

    .line 4037
    .line 4038
    goto :goto_57

    .line 4039
    :cond_b8
    double-to-long v1, v1

    .line 4040
    iput-wide v1, v3, La/cj30;->w:J

    .line 4041
    .line 4042
    goto :goto_57

    .line 4043
    :cond_b9
    invoke-virtual {v3, v4}, La/cj30;->h(I)V

    .line 4044
    .line 4045
    .line 4046
    iget-object v3, v3, La/cj30;->B:La/bj30;

    .line 4047
    .line 4048
    double-to-int v1, v1

    .line 4049
    iput v1, v3, La/bj30;->T:I

    .line 4050
    .line 4051
    goto/16 :goto_57

    .line 4052
    .line 4053
    :goto_58
    iput-byte v11, v0, La/buj;->e:B

    .line 4054
    .line 4055
    goto/16 :goto_46

    .line 4056
    .line 4057
    :cond_ba
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4058
    .line 4059
    const-string v1, "Invalid element type "

    .line 4060
    .line 4061
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4062
    .line 4063
    .line 4064
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 4065
    .line 4066
    .line 4067
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4068
    .line 4069
    .line 4070
    move-result-object v0

    .line 4071
    const/4 v5, 0x0

    .line 4072
    invoke-static {v0, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 4073
    .line 4074
    .line 4075
    move-result-object v0

    .line 4076
    throw v0

    .line 4077
    :cond_bb
    iget-wide v5, v0, La/buj;->g:J

    .line 4078
    .line 4079
    long-to-int v2, v5

    .line 4080
    invoke-virtual {v3, v4, v2, v1}, La/pv00;->c(IILa/guo;)V

    .line 4081
    .line 4082
    .line 4083
    const/4 v11, 0x0

    .line 4084
    iput-byte v11, v0, La/buj;->e:B

    .line 4085
    .line 4086
    goto/16 :goto_46

    .line 4087
    .line 4088
    :cond_bc
    const/4 v11, 0x0

    .line 4089
    iget-wide v5, v0, La/buj;->g:J

    .line 4090
    .line 4091
    const-wide/32 v7, 0x7fffffff

    .line 4092
    .line 4093
    .line 4094
    cmp-long v2, v5, v7

    .line 4095
    .line 4096
    if-gtz v2, :cond_bf

    .line 4097
    .line 4098
    long-to-int v2, v5

    .line 4099
    if-nez v2, :cond_bd

    .line 4100
    .line 4101
    const-string v1, ""

    .line 4102
    .line 4103
    goto :goto_5a

    .line 4104
    :cond_bd
    new-array v5, v2, [B

    .line 4105
    .line 4106
    invoke-interface {v1, v5, v11, v2}, La/guo;->readFully([BII)V

    .line 4107
    .line 4108
    .line 4109
    :goto_59
    if-lez v2, :cond_be

    .line 4110
    .line 4111
    add-int/lit8 v1, v2, -0x1

    .line 4112
    .line 4113
    aget-byte v1, v5, v1

    .line 4114
    .line 4115
    if-nez v1, :cond_be

    .line 4116
    .line 4117
    add-int/lit8 v2, v2, -0x1

    .line 4118
    .line 4119
    goto :goto_59

    .line 4120
    :cond_be
    new-instance v1, Ljava/lang/String;

    .line 4121
    .line 4122
    const/4 v11, 0x0

    .line 4123
    invoke-direct {v1, v5, v11, v2}, Ljava/lang/String;-><init>([BII)V

    .line 4124
    .line 4125
    .line 4126
    :goto_5a
    invoke-virtual {v3, v4, v1}, La/pv00;->r(ILjava/lang/String;)V

    .line 4127
    .line 4128
    .line 4129
    iput-byte v11, v0, La/buj;->e:B

    .line 4130
    .line 4131
    goto/16 :goto_46

    .line 4132
    .line 4133
    :cond_bf
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4134
    .line 4135
    const-string v2, "String element size: "

    .line 4136
    .line 4137
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4138
    .line 4139
    .line 4140
    iget-wide v2, v0, La/buj;->g:J

    .line 4141
    .line 4142
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 4143
    .line 4144
    .line 4145
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4146
    .line 4147
    .line 4148
    move-result-object v0

    .line 4149
    const/4 v5, 0x0

    .line 4150
    invoke-static {v0, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 4151
    .line 4152
    .line 4153
    move-result-object v0

    .line 4154
    throw v0

    .line 4155
    :cond_c0
    iget-wide v8, v0, La/buj;->g:J

    .line 4156
    .line 4157
    cmp-long v2, v8, v6

    .line 4158
    .line 4159
    if-gtz v2, :cond_c1

    .line 4160
    .line 4161
    long-to-int v2, v8

    .line 4162
    invoke-virtual {v0, v1, v2}, La/buj;->b(La/guo;I)J

    .line 4163
    .line 4164
    .line 4165
    move-result-wide v1

    .line 4166
    invoke-virtual {v3, v4, v1, v2}, La/pv00;->k(IJ)V

    .line 4167
    .line 4168
    .line 4169
    const/4 v11, 0x0

    .line 4170
    iput-byte v11, v0, La/buj;->e:B

    .line 4171
    .line 4172
    goto/16 :goto_46

    .line 4173
    .line 4174
    :cond_c1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4175
    .line 4176
    const-string v2, "Invalid integer size: "

    .line 4177
    .line 4178
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4179
    .line 4180
    .line 4181
    iget-wide v2, v0, La/buj;->g:J

    .line 4182
    .line 4183
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 4184
    .line 4185
    .line 4186
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4187
    .line 4188
    .line 4189
    move-result-object v0

    .line 4190
    const/4 v5, 0x0

    .line 4191
    invoke-static {v0, v5}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 4192
    .line 4193
    .line 4194
    move-result-object v0

    .line 4195
    throw v0

    .line 4196
    :cond_c2
    invoke-interface {v1}, La/guo;->getPosition()J

    .line 4197
    .line 4198
    .line 4199
    move-result-wide v3

    .line 4200
    iget-wide v5, v0, La/buj;->g:J

    .line 4201
    .line 4202
    add-long/2addr v5, v3

    .line 4203
    new-instance v1, La/auj;

    .line 4204
    .line 4205
    iget v7, v0, La/buj;->f:I

    .line 4206
    .line 4207
    invoke-direct {v1, v7, v5, v6}, La/auj;-><init>(IJ)V

    .line 4208
    .line 4209
    .line 4210
    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 4211
    .line 4212
    .line 4213
    iget-object v1, v0, La/buj;->d:La/pv00;

    .line 4214
    .line 4215
    iget v2, v0, La/buj;->f:I

    .line 4216
    .line 4217
    iget-wide v5, v0, La/buj;->g:J

    .line 4218
    .line 4219
    invoke-virtual/range {v1 .. v6}, La/pv00;->q(IJJ)V

    .line 4220
    .line 4221
    .line 4222
    const/4 v11, 0x0

    .line 4223
    iput-byte v11, v0, La/buj;->e:B

    .line 4224
    .line 4225
    goto/16 :goto_46

    .line 4226
    .line 4227
    :cond_c3
    const/4 v11, 0x0

    .line 4228
    iget-wide v2, v0, La/buj;->g:J

    .line 4229
    .line 4230
    long-to-int v2, v2

    .line 4231
    invoke-interface {v1, v2}, La/guo;->m(I)V

    .line 4232
    .line 4233
    .line 4234
    iput-byte v11, v0, La/buj;->e:B

    .line 4235
    .line 4236
    goto/16 :goto_0

    .line 4237
    .line 4238
    nop

    .line 4239
    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_22
        -0x7ce7f3b0 -> :sswitch_21
        -0x76567dc0 -> :sswitch_20
        -0x6a615338 -> :sswitch_1f
        -0x672350af -> :sswitch_1e
        -0x585f4fce -> :sswitch_1d
        -0x585f4fcd -> :sswitch_1c
        -0x51dc40b2 -> :sswitch_1b
        -0x37a9c464 -> :sswitch_1a
        -0x2016c535 -> :sswitch_19
        -0x2016c4e5 -> :sswitch_18
        -0x19552dbd -> :sswitch_17
        -0x1538b2ba -> :sswitch_16
        0x3c02325 -> :sswitch_15
        0x3c02353 -> :sswitch_14
        0x3c030c5 -> :sswitch_13
        0x4e81333 -> :sswitch_12
        0x4e86155 -> :sswitch_11
        0x4e86156 -> :sswitch_10
        0x5e8da3e -> :sswitch_f
        0x1a8350d6 -> :sswitch_e
        0x2056f406 -> :sswitch_d
        0x25e26ee2 -> :sswitch_c
        0x2b45174d -> :sswitch_b
        0x2b453ce4 -> :sswitch_a
        0x2c0618eb -> :sswitch_9
        0x2c065c6b -> :sswitch_8
        0x32fdf009 -> :sswitch_7
        0x3e4ca2d8 -> :sswitch_6
        0x54c61e47 -> :sswitch_5
        0x6bd6c624 -> :sswitch_4
        0x74446acb -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    .line 4240
    .line 4241
    .line 4242
    .line 4243
    .line 4244
    .line 4245
    .line 4246
    .line 4247
    .line 4248
    .line 4249
    .line 4250
    .line 4251
    .line 4252
    .line 4253
    .line 4254
    .line 4255
    .line 4256
    .line 4257
    .line 4258
    .line 4259
    .line 4260
    .line 4261
    .line 4262
    .line 4263
    .line 4264
    .line 4265
    .line 4266
    .line 4267
    .line 4268
    .line 4269
    .line 4270
    .line 4271
    .line 4272
    .line 4273
    .line 4274
    .line 4275
    .line 4276
    .line 4277
    .line 4278
    .line 4279
    .line 4280
    .line 4281
    .line 4282
    .line 4283
    .line 4284
    .line 4285
    .line 4286
    .line 4287
    .line 4288
    .line 4289
    .line 4290
    .line 4291
    .line 4292
    .line 4293
    .line 4294
    .line 4295
    .line 4296
    .line 4297
    .line 4298
    .line 4299
    .line 4300
    .line 4301
    .line 4302
    .line 4303
    .line 4304
    .line 4305
    .line 4306
    .line 4307
    .line 4308
    .line 4309
    .line 4310
    .line 4311
    .line 4312
    .line 4313
    .line 4314
    .line 4315
    .line 4316
    .line 4317
    .line 4318
    .line 4319
    .line 4320
    .line 4321
    .line 4322
    .line 4323
    .line 4324
    .line 4325
    .line 4326
    .line 4327
    .line 4328
    .line 4329
    .line 4330
    .line 4331
    .line 4332
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7ce7f5de -> :sswitch_45
        -0x7ce7f3b0 -> :sswitch_44
        -0x76567dc0 -> :sswitch_43
        -0x6a615338 -> :sswitch_42
        -0x672350af -> :sswitch_41
        -0x585f4fce -> :sswitch_40
        -0x585f4fcd -> :sswitch_3f
        -0x51dc40b2 -> :sswitch_3e
        -0x37a9c464 -> :sswitch_3d
        -0x2016c535 -> :sswitch_3c
        -0x2016c4e5 -> :sswitch_3b
        -0x19552dbd -> :sswitch_3a
        -0x1538b2ba -> :sswitch_39
        0x3c02325 -> :sswitch_38
        0x3c02353 -> :sswitch_37
        0x3c030c5 -> :sswitch_36
        0x4e81333 -> :sswitch_35
        0x4e86155 -> :sswitch_34
        0x4e86156 -> :sswitch_33
        0x5e8da3e -> :sswitch_32
        0x1a8350d6 -> :sswitch_31
        0x2056f406 -> :sswitch_30
        0x25e26ee2 -> :sswitch_2f
        0x2b45174d -> :sswitch_2e
        0x2b453ce4 -> :sswitch_2d
        0x2c0618eb -> :sswitch_2c
        0x2c065c6b -> :sswitch_2b
        0x32fdf009 -> :sswitch_2a
        0x3e4ca2d8 -> :sswitch_29
        0x54c61e47 -> :sswitch_28
        0x6bd6c624 -> :sswitch_27
        0x74446acb -> :sswitch_26
        0x7446132a -> :sswitch_25
        0x7446b0a6 -> :sswitch_24
        0x744ad97d -> :sswitch_23
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_20
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_20
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x80 -> :sswitch_4a
        0x83 -> :sswitch_49
        0x85 -> :sswitch_48
        0x86 -> :sswitch_48
        0x88 -> :sswitch_49
        0x89 -> :sswitch_49
        0x8f -> :sswitch_4a
        0x91 -> :sswitch_49
        0x92 -> :sswitch_49
        0x98 -> :sswitch_49
        0x9b -> :sswitch_49
        0x9f -> :sswitch_49
        0xa0 -> :sswitch_4a
        0xa1 -> :sswitch_47
        0xa3 -> :sswitch_47
        0xa5 -> :sswitch_47
        0xa6 -> :sswitch_4a
        0xae -> :sswitch_4a
        0xb0 -> :sswitch_49
        0xb3 -> :sswitch_49
        0xb5 -> :sswitch_46
        0xb6 -> :sswitch_4a
        0xb7 -> :sswitch_4a
        0xba -> :sswitch_49
        0xbb -> :sswitch_4a
        0xd7 -> :sswitch_49
        0xe0 -> :sswitch_4a
        0xe1 -> :sswitch_4a
        0xe7 -> :sswitch_49
        0xee -> :sswitch_49
        0xf0 -> :sswitch_49
        0xf1 -> :sswitch_49
        0xf7 -> :sswitch_49
        0xfb -> :sswitch_49
        0x41e4 -> :sswitch_4a
        0x41e7 -> :sswitch_49
        0x41ed -> :sswitch_47
        0x4254 -> :sswitch_49
        0x4255 -> :sswitch_47
        0x4282 -> :sswitch_48
        0x4285 -> :sswitch_49
        0x42f7 -> :sswitch_49
        0x437c -> :sswitch_48
        0x4489 -> :sswitch_46
        0x45b9 -> :sswitch_4a
        0x47e1 -> :sswitch_49
        0x47e2 -> :sswitch_47
        0x47e7 -> :sswitch_4a
        0x47e8 -> :sswitch_49
        0x4dbb -> :sswitch_4a
        0x5031 -> :sswitch_49
        0x5032 -> :sswitch_49
        0x5034 -> :sswitch_4a
        0x5035 -> :sswitch_4a
        0x536e -> :sswitch_48
        0x53ab -> :sswitch_47
        0x53ac -> :sswitch_49
        0x53b8 -> :sswitch_49
        0x54b0 -> :sswitch_49
        0x54b2 -> :sswitch_49
        0x54ba -> :sswitch_49
        0x55aa -> :sswitch_49
        0x55b0 -> :sswitch_4a
        0x55b2 -> :sswitch_49
        0x55b9 -> :sswitch_49
        0x55ba -> :sswitch_49
        0x55bb -> :sswitch_49
        0x55bc -> :sswitch_49
        0x55bd -> :sswitch_49
        0x55d0 -> :sswitch_4a
        0x55d1 -> :sswitch_46
        0x55d2 -> :sswitch_46
        0x55d3 -> :sswitch_46
        0x55d4 -> :sswitch_46
        0x55d5 -> :sswitch_46
        0x55d6 -> :sswitch_46
        0x55d7 -> :sswitch_46
        0x55d8 -> :sswitch_46
        0x55d9 -> :sswitch_46
        0x55da -> :sswitch_46
        0x55ee -> :sswitch_49
        0x56aa -> :sswitch_49
        0x56bb -> :sswitch_49
        0x6240 -> :sswitch_4a
        0x6264 -> :sswitch_49
        0x63a2 -> :sswitch_47
        0x6d80 -> :sswitch_4a
        0x73c4 -> :sswitch_49
        0x73c5 -> :sswitch_49
        0x75a1 -> :sswitch_4a
        0x75a2 -> :sswitch_49
        0x7670 -> :sswitch_4a
        0x7671 -> :sswitch_49
        0x7672 -> :sswitch_47
        0x7673 -> :sswitch_46
        0x7674 -> :sswitch_46
        0x7675 -> :sswitch_46
        0x22b59c -> :sswitch_48
        0x23e383 -> :sswitch_49
        0x2ad7b1 -> :sswitch_49
        0x1043a770 -> :sswitch_4a
        0x114d9b74 -> :sswitch_4a
        0x1549a966 -> :sswitch_4a
        0x1654ae6b -> :sswitch_4a
        0x18538067 -> :sswitch_4a
        0x1a45dfa3 -> :sswitch_4a
        0x1c53bb6b -> :sswitch_4a
        0x1f43b675 -> :sswitch_4a
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x55d1
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7673
        :pswitch_23
        :pswitch_22
        :pswitch_21
    .end packed-switch
.end method

.method public final b(La/guo;I)J
    .locals 5

    .line 1
    iget-object p0, p0, La/buj;->a:[B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-interface {p1, p0, v0, p2}, La/guo;->readFully([BII)V

    .line 5
    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    :goto_0
    if-ge v0, p2, :cond_0

    .line 10
    .line 11
    const/16 p1, 0x8

    .line 12
    .line 13
    shl-long/2addr v1, p1

    .line 14
    aget-byte p1, p0, v0

    .line 15
    .line 16
    and-int/lit16 p1, p1, 0xff

    .line 17
    .line 18
    int-to-long v3, p1

    .line 19
    or-long/2addr v1, v3

    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-wide v1
.end method
