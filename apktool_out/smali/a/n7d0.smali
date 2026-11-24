.class public final La/n7d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fuo;


# instance fields
.field public final a:La/coq0;

.field public final b:Landroid/util/SparseArray;

.field public final c:La/fq80;

.field public final d:La/l7d0;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:J

.field public i:La/xiq;

.field public j:La/huo;

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, La/coq0;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, La/coq0;-><init>(J)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/n7d0;->a:La/coq0;

    .line 12
    .line 13
    new-instance v0, La/fq80;

    .line 14
    .line 15
    const/16 v1, 0x1000

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/fq80;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/n7d0;->c:La/fq80;

    .line 21
    .line 22
    new-instance v0, Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, La/n7d0;->b:Landroid/util/SparseArray;

    .line 28
    .line 29
    new-instance v0, La/l7d0;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, La/l7d0;-><init>(B)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, La/n7d0;->d:La/l7d0;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a(La/guo;La/mtc;)I
    .locals 29

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
    iget-object v3, v0, La/n7d0;->d:La/l7d0;

    .line 8
    .line 9
    iget-object v4, v3, La/l7d0;->b:La/coq0;

    .line 10
    .line 11
    iget-object v5, v0, La/n7d0;->j:La/huo;

    .line 12
    .line 13
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, La/guo;->getLength()J

    .line 17
    .line 18
    .line 19
    move-result-wide v15

    .line 20
    const-wide/16 v20, -0x1

    .line 21
    .line 22
    cmp-long v5, v15, v20

    .line 23
    .line 24
    const-wide/16 v7, 0x0

    .line 25
    .line 26
    const/16 v11, 0x1ba

    .line 27
    .line 28
    const/4 v12, 0x4

    .line 29
    const/4 v13, 0x1

    .line 30
    const/4 v14, 0x0

    .line 31
    if-eqz v5, :cond_b

    .line 32
    .line 33
    const/16 v17, 0x3

    .line 34
    .line 35
    iget-boolean v6, v3, La/l7d0;->d:Z

    .line 36
    .line 37
    if-nez v6, :cond_a

    .line 38
    .line 39
    iget-object v0, v3, La/l7d0;->c:La/fq80;

    .line 40
    .line 41
    iget-boolean v5, v3, La/l7d0;->f:Z

    .line 42
    .line 43
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const-wide/16 v9, 0x4e20

    .line 49
    .line 50
    if-nez v5, :cond_3

    .line 51
    .line 52
    invoke-interface {v1}, La/guo;->getLength()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    long-to-int v6, v6

    .line 61
    int-to-long v7, v6

    .line 62
    sub-long/2addr v4, v7

    .line 63
    invoke-interface {v1}, La/guo;->getPosition()J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    cmp-long v7, v7, v4

    .line 68
    .line 69
    if-eqz v7, :cond_0

    .line 70
    .line 71
    iput-wide v4, v2, La/mtc;->a:J

    .line 72
    .line 73
    return v13

    .line 74
    :cond_0
    invoke-virtual {v0, v6}, La/fq80;->J(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v1}, La/guo;->g()V

    .line 78
    .line 79
    .line 80
    iget-object v2, v0, La/fq80;->a:[B

    .line 81
    .line 82
    invoke-interface {v1, v2, v14, v6}, La/guo;->n([BII)V

    .line 83
    .line 84
    .line 85
    iget v1, v0, La/fq80;->b:I

    .line 86
    .line 87
    iget v2, v0, La/fq80;->c:I

    .line 88
    .line 89
    sub-int/2addr v2, v12

    .line 90
    :goto_0
    if-lt v2, v1, :cond_2

    .line 91
    .line 92
    iget-object v4, v0, La/fq80;->a:[B

    .line 93
    .line 94
    invoke-static {v4, v2}, La/l7d0;->b([BI)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-ne v4, v11, :cond_1

    .line 99
    .line 100
    add-int/lit8 v4, v2, 0x4

    .line 101
    .line 102
    invoke-virtual {v0, v4}, La/fq80;->M(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, La/l7d0;->c(La/fq80;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    cmp-long v6, v4, v18

    .line 110
    .line 111
    if-eqz v6, :cond_1

    .line 112
    .line 113
    move-wide v9, v4

    .line 114
    goto :goto_1

    .line 115
    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    move-wide/from16 v9, v18

    .line 119
    .line 120
    :goto_1
    iput-wide v9, v3, La/l7d0;->h:J

    .line 121
    .line 122
    iput-boolean v13, v3, La/l7d0;->f:Z

    .line 123
    .line 124
    return v14

    .line 125
    :cond_3
    iget-wide v5, v3, La/l7d0;->h:J

    .line 126
    .line 127
    cmp-long v5, v5, v18

    .line 128
    .line 129
    if-nez v5, :cond_4

    .line 130
    .line 131
    invoke-virtual {v3, v1}, La/l7d0;->a(La/guo;)V

    .line 132
    .line 133
    .line 134
    return v14

    .line 135
    :cond_4
    iget-boolean v5, v3, La/l7d0;->e:Z

    .line 136
    .line 137
    if-nez v5, :cond_8

    .line 138
    .line 139
    invoke-interface {v1}, La/guo;->getLength()J

    .line 140
    .line 141
    .line 142
    move-result-wide v4

    .line 143
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 144
    .line 145
    .line 146
    move-result-wide v4

    .line 147
    long-to-int v4, v4

    .line 148
    invoke-interface {v1}, La/guo;->getPosition()J

    .line 149
    .line 150
    .line 151
    move-result-wide v5

    .line 152
    cmp-long v5, v5, v7

    .line 153
    .line 154
    if-eqz v5, :cond_5

    .line 155
    .line 156
    iput-wide v7, v2, La/mtc;->a:J

    .line 157
    .line 158
    return v13

    .line 159
    :cond_5
    invoke-virtual {v0, v4}, La/fq80;->J(I)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v1}, La/guo;->g()V

    .line 163
    .line 164
    .line 165
    iget-object v2, v0, La/fq80;->a:[B

    .line 166
    .line 167
    invoke-interface {v1, v2, v14, v4}, La/guo;->n([BII)V

    .line 168
    .line 169
    .line 170
    iget v1, v0, La/fq80;->b:I

    .line 171
    .line 172
    iget v2, v0, La/fq80;->c:I

    .line 173
    .line 174
    :goto_2
    add-int/lit8 v4, v2, -0x3

    .line 175
    .line 176
    if-ge v1, v4, :cond_7

    .line 177
    .line 178
    iget-object v4, v0, La/fq80;->a:[B

    .line 179
    .line 180
    invoke-static {v4, v1}, La/l7d0;->b([BI)I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-ne v4, v11, :cond_6

    .line 185
    .line 186
    add-int/lit8 v4, v1, 0x4

    .line 187
    .line 188
    invoke-virtual {v0, v4}, La/fq80;->M(I)V

    .line 189
    .line 190
    .line 191
    invoke-static {v0}, La/l7d0;->c(La/fq80;)J

    .line 192
    .line 193
    .line 194
    move-result-wide v4

    .line 195
    cmp-long v6, v4, v18

    .line 196
    .line 197
    if-eqz v6, :cond_6

    .line 198
    .line 199
    move-wide v9, v4

    .line 200
    goto :goto_3

    .line 201
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_7
    move-wide/from16 v9, v18

    .line 205
    .line 206
    :goto_3
    iput-wide v9, v3, La/l7d0;->g:J

    .line 207
    .line 208
    iput-boolean v13, v3, La/l7d0;->e:Z

    .line 209
    .line 210
    return v14

    .line 211
    :cond_8
    iget-wide v5, v3, La/l7d0;->g:J

    .line 212
    .line 213
    cmp-long v0, v5, v18

    .line 214
    .line 215
    if-nez v0, :cond_9

    .line 216
    .line 217
    invoke-virtual {v3, v1}, La/l7d0;->a(La/guo;)V

    .line 218
    .line 219
    .line 220
    return v14

    .line 221
    :cond_9
    invoke-virtual {v4, v5, v6}, La/coq0;->b(J)J

    .line 222
    .line 223
    .line 224
    move-result-wide v5

    .line 225
    iget-wide v7, v3, La/l7d0;->h:J

    .line 226
    .line 227
    invoke-virtual {v4, v7, v8}, La/coq0;->c(J)J

    .line 228
    .line 229
    .line 230
    move-result-wide v7

    .line 231
    sub-long/2addr v7, v5

    .line 232
    iput-wide v7, v3, La/l7d0;->i:J

    .line 233
    .line 234
    invoke-virtual {v3, v1}, La/l7d0;->a(La/guo;)V

    .line 235
    .line 236
    .line 237
    return v14

    .line 238
    :cond_a
    :goto_4
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_b
    const/16 v17, 0x3

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :goto_5
    iget-boolean v6, v0, La/n7d0;->k:Z

    .line 248
    .line 249
    if-nez v6, :cond_d

    .line 250
    .line 251
    iput-boolean v13, v0, La/n7d0;->k:Z

    .line 252
    .line 253
    iget-wide v9, v3, La/l7d0;->i:J

    .line 254
    .line 255
    cmp-long v3, v9, v18

    .line 256
    .line 257
    if-eqz v3, :cond_c

    .line 258
    .line 259
    new-instance v6, La/xiq;

    .line 260
    .line 261
    move-wide/from16 v18, v7

    .line 262
    .line 263
    new-instance v7, La/bj5;

    .line 264
    .line 265
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 266
    .line 267
    .line 268
    new-instance v8, La/kd30;

    .line 269
    .line 270
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 271
    .line 272
    .line 273
    iput-object v4, v8, La/kd30;->a:Ljava/lang/Object;

    .line 274
    .line 275
    new-instance v3, La/fq80;

    .line 276
    .line 277
    invoke-direct {v3}, La/fq80;-><init>()V

    .line 278
    .line 279
    .line 280
    iput-object v3, v8, La/kd30;->b:Ljava/lang/Object;

    .line 281
    .line 282
    const-wide/16 v3, 0x1

    .line 283
    .line 284
    add-long/2addr v3, v9

    .line 285
    move-wide/from16 v22, v18

    .line 286
    .line 287
    move/from16 v19, v17

    .line 288
    .line 289
    const-wide/16 v17, 0xbc

    .line 290
    .line 291
    move/from16 v24, v19

    .line 292
    .line 293
    const/16 v19, 0x3e8

    .line 294
    .line 295
    move/from16 v25, v13

    .line 296
    .line 297
    move/from16 v26, v14

    .line 298
    .line 299
    const-wide/16 v13, 0x0

    .line 300
    .line 301
    move-wide/from16 v27, v3

    .line 302
    .line 303
    move v3, v12

    .line 304
    move-wide/from16 v11, v27

    .line 305
    .line 306
    move/from16 v27, v26

    .line 307
    .line 308
    move/from16 v26, v5

    .line 309
    .line 310
    move/from16 v5, v27

    .line 311
    .line 312
    move/from16 v4, v25

    .line 313
    .line 314
    invoke-direct/range {v6 .. v19}, La/xiq;-><init>(La/b28;La/d28;JJJJJI)V

    .line 315
    .line 316
    .line 317
    iput-object v6, v0, La/n7d0;->i:La/xiq;

    .line 318
    .line 319
    iget-object v7, v0, La/n7d0;->j:La/huo;

    .line 320
    .line 321
    iget-object v6, v6, La/xiq;->a:La/z18;

    .line 322
    .line 323
    invoke-interface {v7, v6}, La/huo;->f(La/fvh0;)V

    .line 324
    .line 325
    .line 326
    goto :goto_6

    .line 327
    :cond_c
    move/from16 v26, v5

    .line 328
    .line 329
    move-wide/from16 v22, v7

    .line 330
    .line 331
    move v3, v12

    .line 332
    move v4, v13

    .line 333
    move v5, v14

    .line 334
    iget-object v6, v0, La/n7d0;->j:La/huo;

    .line 335
    .line 336
    new-instance v7, La/ca5;

    .line 337
    .line 338
    invoke-direct {v7, v9, v10}, La/ca5;-><init>(J)V

    .line 339
    .line 340
    .line 341
    invoke-interface {v6, v7}, La/huo;->f(La/fvh0;)V

    .line 342
    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_d
    move/from16 v26, v5

    .line 346
    .line 347
    move-wide/from16 v22, v7

    .line 348
    .line 349
    move v3, v12

    .line 350
    move v4, v13

    .line 351
    move v5, v14

    .line 352
    :goto_6
    iget-object v6, v0, La/n7d0;->i:La/xiq;

    .line 353
    .line 354
    if-eqz v6, :cond_e

    .line 355
    .line 356
    iget-object v7, v6, La/xiq;->c:La/a28;

    .line 357
    .line 358
    if-eqz v7, :cond_e

    .line 359
    .line 360
    invoke-virtual {v6, v1, v2}, La/xiq;->a(La/guo;La/mtc;)I

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    return v0

    .line 365
    :cond_e
    invoke-interface {v1}, La/guo;->g()V

    .line 366
    .line 367
    .line 368
    if-eqz v26, :cond_f

    .line 369
    .line 370
    invoke-interface {v1}, La/guo;->i()J

    .line 371
    .line 372
    .line 373
    move-result-wide v6

    .line 374
    sub-long/2addr v15, v6

    .line 375
    goto :goto_7

    .line 376
    :cond_f
    move-wide/from16 v15, v20

    .line 377
    .line 378
    :goto_7
    cmp-long v2, v15, v20

    .line 379
    .line 380
    const/4 v6, -0x1

    .line 381
    if-eqz v2, :cond_10

    .line 382
    .line 383
    const-wide/16 v7, 0x4

    .line 384
    .line 385
    cmp-long v2, v15, v7

    .line 386
    .line 387
    if-gez v2, :cond_10

    .line 388
    .line 389
    invoke-virtual {v0}, La/n7d0;->g()V

    .line 390
    .line 391
    .line 392
    return v6

    .line 393
    :cond_10
    iget-object v2, v0, La/n7d0;->c:La/fq80;

    .line 394
    .line 395
    iget-object v7, v2, La/fq80;->a:[B

    .line 396
    .line 397
    invoke-interface {v1, v7, v5, v3, v4}, La/guo;->b([BIIZ)Z

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    if-nez v7, :cond_11

    .line 402
    .line 403
    invoke-virtual {v0}, La/n7d0;->g()V

    .line 404
    .line 405
    .line 406
    return v6

    .line 407
    :cond_11
    invoke-virtual {v2, v5}, La/fq80;->M(I)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2}, La/fq80;->m()I

    .line 411
    .line 412
    .line 413
    move-result v7

    .line 414
    const/16 v8, 0x1b9

    .line 415
    .line 416
    if-ne v7, v8, :cond_12

    .line 417
    .line 418
    invoke-virtual {v0}, La/n7d0;->g()V

    .line 419
    .line 420
    .line 421
    return v6

    .line 422
    :cond_12
    const/16 v6, 0x1ba

    .line 423
    .line 424
    if-ne v7, v6, :cond_13

    .line 425
    .line 426
    iget-object v0, v2, La/fq80;->a:[B

    .line 427
    .line 428
    const/16 v3, 0xa

    .line 429
    .line 430
    invoke-interface {v1, v0, v5, v3}, La/guo;->n([BII)V

    .line 431
    .line 432
    .line 433
    const/16 v0, 0x9

    .line 434
    .line 435
    invoke-virtual {v2, v0}, La/fq80;->M(I)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2}, La/fq80;->z()I

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    and-int/lit8 v0, v0, 0x7

    .line 443
    .line 444
    add-int/lit8 v0, v0, 0xe

    .line 445
    .line 446
    invoke-interface {v1, v0}, La/guo;->m(I)V

    .line 447
    .line 448
    .line 449
    return v5

    .line 450
    :cond_13
    const/16 v6, 0x1bb

    .line 451
    .line 452
    const/4 v8, 0x2

    .line 453
    const/4 v9, 0x6

    .line 454
    if-ne v7, v6, :cond_14

    .line 455
    .line 456
    iget-object v0, v2, La/fq80;->a:[B

    .line 457
    .line 458
    invoke-interface {v1, v0, v5, v8}, La/guo;->n([BII)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2, v5}, La/fq80;->M(I)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2}, La/fq80;->G()I

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    add-int/2addr v0, v9

    .line 469
    invoke-interface {v1, v0}, La/guo;->m(I)V

    .line 470
    .line 471
    .line 472
    return v5

    .line 473
    :cond_14
    and-int/lit16 v6, v7, -0x100

    .line 474
    .line 475
    const/16 v10, 0x8

    .line 476
    .line 477
    shr-int/2addr v6, v10

    .line 478
    if-eq v6, v4, :cond_15

    .line 479
    .line 480
    invoke-interface {v1, v4}, La/guo;->m(I)V

    .line 481
    .line 482
    .line 483
    return v5

    .line 484
    :cond_15
    and-int/lit16 v6, v7, 0xff

    .line 485
    .line 486
    iget-object v11, v0, La/n7d0;->b:Landroid/util/SparseArray;

    .line 487
    .line 488
    invoke-virtual {v11, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v12

    .line 492
    check-cast v12, La/m7d0;

    .line 493
    .line 494
    iget-boolean v13, v0, La/n7d0;->e:Z

    .line 495
    .line 496
    if-nez v13, :cond_1b

    .line 497
    .line 498
    if-nez v12, :cond_19

    .line 499
    .line 500
    const/16 v13, 0xbd

    .line 501
    .line 502
    const-string v14, "video/mp2p"

    .line 503
    .line 504
    if-ne v6, v13, :cond_16

    .line 505
    .line 506
    new-instance v7, La/g6;

    .line 507
    .line 508
    invoke-direct {v7, v14}, La/g6;-><init>(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    iput-boolean v4, v0, La/n7d0;->f:Z

    .line 512
    .line 513
    invoke-interface {v1}, La/guo;->getPosition()J

    .line 514
    .line 515
    .line 516
    move-result-wide v13

    .line 517
    iput-wide v13, v0, La/n7d0;->h:J

    .line 518
    .line 519
    goto :goto_8

    .line 520
    :cond_16
    and-int/lit16 v13, v7, 0xe0

    .line 521
    .line 522
    const/16 v15, 0xc0

    .line 523
    .line 524
    const/4 v3, 0x0

    .line 525
    if-ne v13, v15, :cond_17

    .line 526
    .line 527
    new-instance v7, La/lv40;

    .line 528
    .line 529
    invoke-direct {v7, v3, v5, v14}, La/lv40;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 530
    .line 531
    .line 532
    iput-boolean v4, v0, La/n7d0;->f:Z

    .line 533
    .line 534
    invoke-interface {v1}, La/guo;->getPosition()J

    .line 535
    .line 536
    .line 537
    move-result-wide v13

    .line 538
    iput-wide v13, v0, La/n7d0;->h:J

    .line 539
    .line 540
    goto :goto_8

    .line 541
    :cond_17
    and-int/lit16 v7, v7, 0xf0

    .line 542
    .line 543
    const/16 v13, 0xe0

    .line 544
    .line 545
    if-ne v7, v13, :cond_18

    .line 546
    .line 547
    new-instance v7, La/jjv;

    .line 548
    .line 549
    invoke-direct {v7, v3, v14}, La/jjv;-><init>(La/cyu;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    iput-boolean v4, v0, La/n7d0;->g:Z

    .line 553
    .line 554
    invoke-interface {v1}, La/guo;->getPosition()J

    .line 555
    .line 556
    .line 557
    move-result-wide v13

    .line 558
    iput-wide v13, v0, La/n7d0;->h:J

    .line 559
    .line 560
    goto :goto_8

    .line 561
    :cond_18
    move-object v7, v3

    .line 562
    :goto_8
    if-eqz v7, :cond_19

    .line 563
    .line 564
    new-instance v3, La/zrs0;

    .line 565
    .line 566
    const/16 v12, 0x100

    .line 567
    .line 568
    invoke-direct {v3, v6, v12}, La/zrs0;-><init>(II)V

    .line 569
    .line 570
    .line 571
    iget-object v12, v0, La/n7d0;->j:La/huo;

    .line 572
    .line 573
    invoke-interface {v7, v12, v3}, La/trn;->e(La/huo;La/zrs0;)V

    .line 574
    .line 575
    .line 576
    new-instance v12, La/m7d0;

    .line 577
    .line 578
    iget-object v3, v0, La/n7d0;->a:La/coq0;

    .line 579
    .line 580
    invoke-direct {v12, v7, v3}, La/m7d0;-><init>(La/trn;La/coq0;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v11, v6, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    :cond_19
    iget-boolean v3, v0, La/n7d0;->f:Z

    .line 587
    .line 588
    if-eqz v3, :cond_1a

    .line 589
    .line 590
    iget-boolean v3, v0, La/n7d0;->g:Z

    .line 591
    .line 592
    if-eqz v3, :cond_1a

    .line 593
    .line 594
    iget-wide v6, v0, La/n7d0;->h:J

    .line 595
    .line 596
    const-wide/16 v13, 0x2000

    .line 597
    .line 598
    add-long/2addr v6, v13

    .line 599
    goto :goto_9

    .line 600
    :cond_1a
    const-wide/32 v6, 0x100000

    .line 601
    .line 602
    .line 603
    :goto_9
    invoke-interface {v1}, La/guo;->getPosition()J

    .line 604
    .line 605
    .line 606
    move-result-wide v13

    .line 607
    cmp-long v3, v13, v6

    .line 608
    .line 609
    if-lez v3, :cond_1b

    .line 610
    .line 611
    iput-boolean v4, v0, La/n7d0;->e:Z

    .line 612
    .line 613
    iget-object v0, v0, La/n7d0;->j:La/huo;

    .line 614
    .line 615
    invoke-interface {v0}, La/huo;->o()V

    .line 616
    .line 617
    .line 618
    :cond_1b
    iget-object v0, v2, La/fq80;->a:[B

    .line 619
    .line 620
    invoke-interface {v1, v0, v5, v8}, La/guo;->n([BII)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v2, v5}, La/fq80;->M(I)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v2}, La/fq80;->G()I

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    add-int/2addr v0, v9

    .line 631
    if-nez v12, :cond_1c

    .line 632
    .line 633
    invoke-interface {v1, v0}, La/guo;->m(I)V

    .line 634
    .line 635
    .line 636
    return v5

    .line 637
    :cond_1c
    invoke-virtual {v2, v0}, La/fq80;->J(I)V

    .line 638
    .line 639
    .line 640
    iget-object v3, v2, La/fq80;->a:[B

    .line 641
    .line 642
    invoke-interface {v1, v3, v5, v0}, La/guo;->readFully([BII)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2, v9}, La/fq80;->M(I)V

    .line 646
    .line 647
    .line 648
    iget-object v0, v12, La/m7d0;->a:La/trn;

    .line 649
    .line 650
    iget-object v1, v12, La/m7d0;->c:La/q8b;

    .line 651
    .line 652
    iget-object v3, v1, La/q8b;->b:[B

    .line 653
    .line 654
    const/4 v6, 0x3

    .line 655
    invoke-virtual {v2, v3, v5, v6}, La/fq80;->k([BII)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v1, v5}, La/q8b;->m(I)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1, v10}, La/q8b;->o(I)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1}, La/q8b;->f()Z

    .line 665
    .line 666
    .line 667
    move-result v3

    .line 668
    iput-boolean v3, v12, La/m7d0;->d:Z

    .line 669
    .line 670
    invoke-virtual {v1}, La/q8b;->f()Z

    .line 671
    .line 672
    .line 673
    move-result v3

    .line 674
    iput-boolean v3, v12, La/m7d0;->e:Z

    .line 675
    .line 676
    invoke-virtual {v1, v9}, La/q8b;->o(I)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v1, v10}, La/q8b;->g(I)I

    .line 680
    .line 681
    .line 682
    move-result v3

    .line 683
    iget-object v6, v1, La/q8b;->b:[B

    .line 684
    .line 685
    invoke-virtual {v2, v6, v5, v3}, La/fq80;->k([BII)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v1, v5}, La/q8b;->m(I)V

    .line 689
    .line 690
    .line 691
    iget-object v3, v12, La/m7d0;->b:La/coq0;

    .line 692
    .line 693
    iget-boolean v6, v12, La/m7d0;->d:Z

    .line 694
    .line 695
    if-eqz v6, :cond_1e

    .line 696
    .line 697
    const/4 v6, 0x4

    .line 698
    invoke-virtual {v1, v6}, La/q8b;->o(I)V

    .line 699
    .line 700
    .line 701
    const/4 v6, 0x3

    .line 702
    invoke-virtual {v1, v6}, La/q8b;->g(I)I

    .line 703
    .line 704
    .line 705
    move-result v7

    .line 706
    int-to-long v6, v7

    .line 707
    const/16 v8, 0x1e

    .line 708
    .line 709
    shl-long/2addr v6, v8

    .line 710
    invoke-virtual {v1, v4}, La/q8b;->o(I)V

    .line 711
    .line 712
    .line 713
    const/16 v9, 0xf

    .line 714
    .line 715
    invoke-virtual {v1, v9}, La/q8b;->g(I)I

    .line 716
    .line 717
    .line 718
    move-result v10

    .line 719
    shl-int/2addr v10, v9

    .line 720
    int-to-long v10, v10

    .line 721
    or-long/2addr v6, v10

    .line 722
    invoke-virtual {v1, v4}, La/q8b;->o(I)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v1, v9}, La/q8b;->g(I)I

    .line 726
    .line 727
    .line 728
    move-result v10

    .line 729
    int-to-long v10, v10

    .line 730
    or-long/2addr v6, v10

    .line 731
    invoke-virtual {v1, v4}, La/q8b;->o(I)V

    .line 732
    .line 733
    .line 734
    iget-boolean v10, v12, La/m7d0;->f:Z

    .line 735
    .line 736
    if-nez v10, :cond_1d

    .line 737
    .line 738
    iget-boolean v10, v12, La/m7d0;->e:Z

    .line 739
    .line 740
    if-eqz v10, :cond_1d

    .line 741
    .line 742
    const/4 v10, 0x4

    .line 743
    invoke-virtual {v1, v10}, La/q8b;->o(I)V

    .line 744
    .line 745
    .line 746
    const/4 v10, 0x3

    .line 747
    invoke-virtual {v1, v10}, La/q8b;->g(I)I

    .line 748
    .line 749
    .line 750
    move-result v10

    .line 751
    int-to-long v10, v10

    .line 752
    shl-long/2addr v10, v8

    .line 753
    invoke-virtual {v1, v4}, La/q8b;->o(I)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v1, v9}, La/q8b;->g(I)I

    .line 757
    .line 758
    .line 759
    move-result v8

    .line 760
    shl-int/2addr v8, v9

    .line 761
    int-to-long v13, v8

    .line 762
    or-long/2addr v10, v13

    .line 763
    invoke-virtual {v1, v4}, La/q8b;->o(I)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v1, v9}, La/q8b;->g(I)I

    .line 767
    .line 768
    .line 769
    move-result v8

    .line 770
    int-to-long v8, v8

    .line 771
    or-long/2addr v8, v10

    .line 772
    invoke-virtual {v1, v4}, La/q8b;->o(I)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v3, v8, v9}, La/coq0;->b(J)J

    .line 776
    .line 777
    .line 778
    iput-boolean v4, v12, La/m7d0;->f:Z

    .line 779
    .line 780
    :cond_1d
    invoke-virtual {v3, v6, v7}, La/coq0;->b(J)J

    .line 781
    .line 782
    .line 783
    move-result-wide v7

    .line 784
    :goto_a
    const/4 v3, 0x4

    .line 785
    goto :goto_b

    .line 786
    :cond_1e
    move-wide/from16 v7, v22

    .line 787
    .line 788
    goto :goto_a

    .line 789
    :goto_b
    invoke-interface {v0, v3, v7, v8}, La/trn;->g(IJ)V

    .line 790
    .line 791
    .line 792
    invoke-interface {v0, v2}, La/trn;->a(La/fq80;)V

    .line 793
    .line 794
    .line 795
    invoke-interface {v0}, La/trn;->f()V

    .line 796
    .line 797
    .line 798
    iget-object v0, v2, La/fq80;->a:[B

    .line 799
    .line 800
    array-length v0, v0

    .line 801
    invoke-virtual {v2, v0}, La/fq80;->L(I)V

    .line 802
    .line 803
    .line 804
    return v5
.end method

.method public final b(JJ)V
    .locals 7

    .line 1
    iget-object p1, p0, La/n7d0;->b:Landroid/util/SparseArray;

    .line 2
    .line 3
    iget-object p2, p0, La/n7d0;->a:La/coq0;

    .line 4
    .line 5
    monitor-enter p2

    .line 6
    :try_start_0
    iget-wide v0, p2, La/coq0;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p2

    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    move v0, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v4

    .line 23
    :goto_0
    if-nez v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p2}, La/coq0;->d()J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    cmp-long v0, v5, v2

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    cmp-long v0, v5, v2

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    cmp-long v0, v5, p3

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v1, v4

    .line 45
    :goto_1
    move v0, v1

    .line 46
    :cond_2
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p2, p3, p4}, La/coq0;->f(J)V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget-object p0, p0, La/n7d0;->i:La/xiq;

    .line 52
    .line 53
    if-eqz p0, :cond_4

    .line 54
    .line 55
    invoke-virtual {p0, p3, p4}, La/xiq;->d(J)V

    .line 56
    .line 57
    .line 58
    :cond_4
    move p0, v4

    .line 59
    :goto_2
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-ge p0, p2, :cond_5

    .line 64
    .line 65
    invoke-virtual {p1, p0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    check-cast p2, La/m7d0;

    .line 70
    .line 71
    iput-boolean v4, p2, La/m7d0;->f:Z

    .line 72
    .line 73
    iget-object p2, p2, La/m7d0;->a:La/trn;

    .line 74
    .line 75
    invoke-interface {p2}, La/trn;->c()V

    .line 76
    .line 77
    .line 78
    add-int/lit8 p0, p0, 0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    return-void

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw p0
.end method

.method public final c(La/guo;)Z
    .locals 8

    .line 1
    const/16 p0, 0xe

    .line 2
    .line 3
    new-array v0, p0, [B

    .line 4
    .line 5
    check-cast p1, La/guj;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, v0, v1, p0, v1}, La/guj;->b([BIIZ)Z

    .line 9
    .line 10
    .line 11
    aget-byte p0, v0, v1

    .line 12
    .line 13
    and-int/lit16 p0, p0, 0xff

    .line 14
    .line 15
    shl-int/lit8 p0, p0, 0x18

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    aget-byte v3, v0, v2

    .line 19
    .line 20
    and-int/lit16 v3, v3, 0xff

    .line 21
    .line 22
    shl-int/lit8 v3, v3, 0x10

    .line 23
    .line 24
    or-int/2addr p0, v3

    .line 25
    const/4 v3, 0x2

    .line 26
    aget-byte v4, v0, v3

    .line 27
    .line 28
    and-int/lit16 v4, v4, 0xff

    .line 29
    .line 30
    const/16 v5, 0x8

    .line 31
    .line 32
    shl-int/2addr v4, v5

    .line 33
    or-int/2addr p0, v4

    .line 34
    const/4 v4, 0x3

    .line 35
    aget-byte v6, v0, v4

    .line 36
    .line 37
    and-int/lit16 v6, v6, 0xff

    .line 38
    .line 39
    or-int/2addr p0, v6

    .line 40
    const/16 v6, 0x1ba

    .line 41
    .line 42
    if-eq v6, p0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p0, 0x4

    .line 46
    aget-byte v6, v0, p0

    .line 47
    .line 48
    and-int/lit16 v6, v6, 0xc4

    .line 49
    .line 50
    const/16 v7, 0x44

    .line 51
    .line 52
    if-eq v6, v7, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 v6, 0x6

    .line 56
    aget-byte v6, v0, v6

    .line 57
    .line 58
    and-int/2addr v6, p0

    .line 59
    if-eq v6, p0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    aget-byte v6, v0, v5

    .line 63
    .line 64
    and-int/2addr v6, p0

    .line 65
    if-eq v6, p0, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/16 p0, 0x9

    .line 69
    .line 70
    aget-byte p0, v0, p0

    .line 71
    .line 72
    and-int/2addr p0, v2

    .line 73
    if-eq p0, v2, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    const/16 p0, 0xc

    .line 77
    .line 78
    aget-byte p0, v0, p0

    .line 79
    .line 80
    and-int/2addr p0, v4

    .line 81
    if-eq p0, v4, :cond_5

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    const/16 p0, 0xd

    .line 85
    .line 86
    aget-byte p0, v0, p0

    .line 87
    .line 88
    and-int/lit8 p0, p0, 0x7

    .line 89
    .line 90
    invoke-virtual {p1, p0, v1}, La/guj;->f(IZ)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0, v1, v4, v1}, La/guj;->b([BIIZ)Z

    .line 94
    .line 95
    .line 96
    aget-byte p0, v0, v1

    .line 97
    .line 98
    and-int/lit16 p0, p0, 0xff

    .line 99
    .line 100
    shl-int/lit8 p0, p0, 0x10

    .line 101
    .line 102
    aget-byte p1, v0, v2

    .line 103
    .line 104
    and-int/lit16 p1, p1, 0xff

    .line 105
    .line 106
    shl-int/2addr p1, v5

    .line 107
    or-int/2addr p0, p1

    .line 108
    aget-byte p1, v0, v3

    .line 109
    .line 110
    and-int/lit16 p1, p1, 0xff

    .line 111
    .line 112
    or-int/2addr p0, p1

    .line 113
    if-ne v2, p0, :cond_6

    .line 114
    .line 115
    return v2

    .line 116
    :cond_6
    :goto_0
    return v1
.end method

.method public final e(La/huo;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/n7d0;->j:La/huo;

    .line 2
    .line 3
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, La/n7d0;->b:Landroid/util/SparseArray;

    .line 3
    .line 4
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, La/m7d0;

    .line 15
    .line 16
    iget-object v1, v1, La/m7d0;->a:La/trn;

    .line 17
    .line 18
    invoke-interface {v1}, La/trn;->d()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
