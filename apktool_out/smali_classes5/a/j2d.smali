.class public final synthetic La/j2d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;

.field public final synthetic c:La/ugd;

.field public final synthetic d:La/w2d;


# direct methods
.method public synthetic constructor <init>(La/ugd;La/ugd;La/w2d;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/j2d;->a:B

    iput-object p1, p0, La/j2d;->b:La/ugd;

    iput-object p2, p0, La/j2d;->c:La/ugd;

    iput-object p3, p0, La/j2d;->d:La/w2d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/j2d;->a:B

    .line 4
    .line 5
    const/high16 v2, -0x40800000    # -1.0f

    .line 6
    .line 7
    const-string v3, "collapsingContentId"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "stickyContentId"

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v8, v0, La/j2d;->d:La/w2d;

    .line 14
    .line 15
    iget-object v9, v0, La/j2d;->c:La/ugd;

    .line 16
    .line 17
    iget-object v0, v0, La/j2d;->b:La/ugd;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget-object v1, v8, La/w2d;->a:La/x2d;

    .line 23
    .line 24
    move-object/from16 v2, p1

    .line 25
    .line 26
    check-cast v2, La/c5n0;

    .line 27
    .line 28
    move-object/from16 v8, p2

    .line 29
    .line 30
    check-cast v8, La/p4e;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {v2, v5, v0}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v13, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    invoke-direct {v13, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    move v14, v4

    .line 53
    :goto_0
    const/4 v15, 0x1

    .line 54
    if-ge v14, v5, :cond_0

    .line 55
    .line 56
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    check-cast v10, La/pj30;

    .line 61
    .line 62
    iget-wide v11, v8, La/p4e;->a:J

    .line 63
    .line 64
    invoke-static/range {v10 .. v15}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 65
    .line 66
    .line 67
    move-result v14

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-interface {v2, v3, v9}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v3, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    move v9, v4

    .line 87
    :goto_1
    if-ge v9, v5, :cond_1

    .line 88
    .line 89
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    check-cast v10, La/pj30;

    .line 94
    .line 95
    iget-wide v11, v8, La/p4e;->a:J

    .line 96
    .line 97
    move-object/from16 v18, v3

    .line 98
    .line 99
    move/from16 v19, v9

    .line 100
    .line 101
    move-wide/from16 v16, v11

    .line 102
    .line 103
    move/from16 v20, v15

    .line 104
    .line 105
    move-object v15, v10

    .line 106
    invoke-static/range {v15 .. v20}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    move/from16 v15, v20

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    const/4 v0, 0x0

    .line 120
    goto :goto_3

    .line 121
    :cond_2
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    move-object v5, v0

    .line 126
    check-cast v5, La/pu90;

    .line 127
    .line 128
    iget v5, v5, La/pu90;->b:I

    .line 129
    .line 130
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    sub-int/2addr v9, v15

    .line 135
    if-gt v15, v9, :cond_4

    .line 136
    .line 137
    move v10, v15

    .line 138
    :goto_2
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    move-object v12, v11

    .line 143
    check-cast v12, La/pu90;

    .line 144
    .line 145
    iget v12, v12, La/pu90;->b:I

    .line 146
    .line 147
    if-ge v5, v12, :cond_3

    .line 148
    .line 149
    move-object v0, v11

    .line 150
    move v5, v12

    .line 151
    :cond_3
    if-eq v10, v9, :cond_4

    .line 152
    .line 153
    add-int/lit8 v10, v10, 0x1

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    :goto_3
    check-cast v0, La/pu90;

    .line 157
    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    iget v0, v0, La/pu90;->b:I

    .line 161
    .line 162
    int-to-float v0, v0

    .line 163
    goto :goto_4

    .line 164
    :cond_5
    move v0, v6

    .line 165
    :goto_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_6

    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    goto :goto_6

    .line 173
    :cond_6
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    move-object v7, v5

    .line 178
    check-cast v7, La/pu90;

    .line 179
    .line 180
    iget v7, v7, La/pu90;->b:I

    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    sub-int/2addr v9, v15

    .line 187
    if-gt v15, v9, :cond_8

    .line 188
    .line 189
    :goto_5
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    move-object v11, v10

    .line 194
    check-cast v11, La/pu90;

    .line 195
    .line 196
    iget v11, v11, La/pu90;->b:I

    .line 197
    .line 198
    if-ge v7, v11, :cond_7

    .line 199
    .line 200
    move-object v5, v10

    .line 201
    move v7, v11

    .line 202
    :cond_7
    if-eq v15, v9, :cond_8

    .line 203
    .line 204
    add-int/lit8 v15, v15, 0x1

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_8
    move-object v7, v5

    .line 208
    :goto_6
    check-cast v7, La/pu90;

    .line 209
    .line 210
    if-eqz v7, :cond_9

    .line 211
    .line 212
    iget v5, v7, La/pu90;->b:I

    .line 213
    .line 214
    int-to-float v5, v5

    .line 215
    goto :goto_7

    .line 216
    :cond_9
    move v5, v6

    .line 217
    :goto_7
    cmpl-float v7, v5, v6

    .line 218
    .line 219
    if-lez v7, :cond_a

    .line 220
    .line 221
    neg-float v6, v5

    .line 222
    :cond_a
    invoke-virtual {v1, v6}, La/x2d;->c(F)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, La/x2d;->a()F

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    const/high16 v6, 0x3f800000    # 1.0f

    .line 230
    .line 231
    sub-float/2addr v6, v1

    .line 232
    mul-float/2addr v6, v5

    .line 233
    add-float/2addr v6, v0

    .line 234
    invoke-static {v6}, La/si30;->b(F)I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-gez v0, :cond_b

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_b
    move v4, v0

    .line 242
    :goto_8
    int-to-float v0, v4

    .line 243
    sub-float/2addr v0, v5

    .line 244
    invoke-static {v0}, La/si30;->b(F)I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    iget-wide v5, v8, La/p4e;->a:J

    .line 249
    .line 250
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    new-instance v5, La/g18;

    .line 255
    .line 256
    const/4 v6, 0x7

    .line 257
    invoke-direct {v5, v3, v13, v0, v6}, La/g18;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 258
    .line 259
    .line 260
    invoke-static {v2, v1, v4, v5}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    return-object v0

    .line 265
    :pswitch_0
    iget-object v1, v8, La/w2d;->a:La/x2d;

    .line 266
    .line 267
    move-object/from16 v8, p1

    .line 268
    .line 269
    check-cast v8, La/c5n0;

    .line 270
    .line 271
    move-object/from16 v10, p2

    .line 272
    .line 273
    check-cast v10, La/p4e;

    .line 274
    .line 275
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-interface {v8, v5, v0}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    new-instance v14, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    invoke-direct {v14, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    move v15, v4

    .line 296
    :goto_9
    const/16 v16, 0x1

    .line 297
    .line 298
    if-ge v15, v5, :cond_c

    .line 299
    .line 300
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    check-cast v11, La/pj30;

    .line 305
    .line 306
    iget-wide v12, v10, La/p4e;->a:J

    .line 307
    .line 308
    invoke-static/range {v11 .. v16}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 309
    .line 310
    .line 311
    move-result v15

    .line 312
    goto :goto_9

    .line 313
    :cond_c
    invoke-interface {v8, v3, v9}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    new-instance v3, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    move v9, v4

    .line 331
    :goto_a
    if-ge v9, v5, :cond_d

    .line 332
    .line 333
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    check-cast v11, La/pj30;

    .line 338
    .line 339
    iget-wide v12, v10, La/p4e;->a:J

    .line 340
    .line 341
    move-object/from16 v19, v3

    .line 342
    .line 343
    move/from16 v20, v9

    .line 344
    .line 345
    move-wide/from16 v17, v12

    .line 346
    .line 347
    move/from16 v21, v16

    .line 348
    .line 349
    move-object/from16 v16, v11

    .line 350
    .line 351
    invoke-static/range {v16 .. v21}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 352
    .line 353
    .line 354
    move-result v9

    .line 355
    move/from16 v16, v21

    .line 356
    .line 357
    goto :goto_a

    .line 358
    :cond_d
    move-object v11, v3

    .line 359
    move/from16 v3, v16

    .line 360
    .line 361
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-eqz v0, :cond_e

    .line 366
    .line 367
    const/4 v0, 0x0

    .line 368
    goto :goto_c

    .line 369
    :cond_e
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    move-object v5, v0

    .line 374
    check-cast v5, La/pu90;

    .line 375
    .line 376
    iget v5, v5, La/pu90;->b:I

    .line 377
    .line 378
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 379
    .line 380
    .line 381
    move-result v9

    .line 382
    sub-int/2addr v9, v3

    .line 383
    if-gt v3, v9, :cond_10

    .line 384
    .line 385
    move v12, v3

    .line 386
    :goto_b
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v13

    .line 390
    move-object v15, v13

    .line 391
    check-cast v15, La/pu90;

    .line 392
    .line 393
    iget v15, v15, La/pu90;->b:I

    .line 394
    .line 395
    if-ge v5, v15, :cond_f

    .line 396
    .line 397
    move-object v0, v13

    .line 398
    move v5, v15

    .line 399
    :cond_f
    if-eq v12, v9, :cond_10

    .line 400
    .line 401
    add-int/lit8 v12, v12, 0x1

    .line 402
    .line 403
    goto :goto_b

    .line 404
    :cond_10
    :goto_c
    check-cast v0, La/pu90;

    .line 405
    .line 406
    if-eqz v0, :cond_11

    .line 407
    .line 408
    iget v0, v0, La/pu90;->b:I

    .line 409
    .line 410
    int-to-float v0, v0

    .line 411
    goto :goto_d

    .line 412
    :cond_11
    move v0, v6

    .line 413
    :goto_d
    new-instance v5, La/kie0;

    .line 414
    .line 415
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 419
    .line 420
    .line 421
    move-result v9

    .line 422
    if-nez v9, :cond_1a

    .line 423
    .line 424
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 425
    .line 426
    .line 427
    move-result v9

    .line 428
    if-nez v9, :cond_1a

    .line 429
    .line 430
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    if-eqz v2, :cond_12

    .line 435
    .line 436
    const/4 v2, 0x0

    .line 437
    goto :goto_f

    .line 438
    :cond_12
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    move-object v9, v2

    .line 443
    check-cast v9, La/pu90;

    .line 444
    .line 445
    iget v9, v9, La/pu90;->b:I

    .line 446
    .line 447
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 448
    .line 449
    .line 450
    move-result v12

    .line 451
    sub-int/2addr v12, v3

    .line 452
    if-gt v3, v12, :cond_14

    .line 453
    .line 454
    move v13, v3

    .line 455
    :goto_e
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v15

    .line 459
    move-object v7, v15

    .line 460
    check-cast v7, La/pu90;

    .line 461
    .line 462
    iget v7, v7, La/pu90;->b:I

    .line 463
    .line 464
    if-ge v9, v7, :cond_13

    .line 465
    .line 466
    move v9, v7

    .line 467
    move-object v2, v15

    .line 468
    :cond_13
    if-eq v13, v12, :cond_14

    .line 469
    .line 470
    add-int/lit8 v13, v13, 0x1

    .line 471
    .line 472
    goto :goto_e

    .line 473
    :cond_14
    :goto_f
    check-cast v2, La/pu90;

    .line 474
    .line 475
    if-eqz v2, :cond_15

    .line 476
    .line 477
    iget v2, v2, La/pu90;->b:I

    .line 478
    .line 479
    int-to-float v2, v2

    .line 480
    goto :goto_10

    .line 481
    :cond_15
    move v2, v6

    .line 482
    :goto_10
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 483
    .line 484
    .line 485
    move-result v7

    .line 486
    if-eqz v7, :cond_16

    .line 487
    .line 488
    const/4 v7, 0x0

    .line 489
    goto :goto_12

    .line 490
    :cond_16
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    move-object v7, v4

    .line 495
    check-cast v7, La/pu90;

    .line 496
    .line 497
    iget v7, v7, La/pu90;->b:I

    .line 498
    .line 499
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 500
    .line 501
    .line 502
    move-result v9

    .line 503
    sub-int/2addr v9, v3

    .line 504
    if-gt v3, v9, :cond_18

    .line 505
    .line 506
    :goto_11
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v12

    .line 510
    move-object v13, v12

    .line 511
    check-cast v13, La/pu90;

    .line 512
    .line 513
    iget v13, v13, La/pu90;->b:I

    .line 514
    .line 515
    if-ge v7, v13, :cond_17

    .line 516
    .line 517
    move-object v4, v12

    .line 518
    move v7, v13

    .line 519
    :cond_17
    if-eq v3, v9, :cond_18

    .line 520
    .line 521
    add-int/lit8 v3, v3, 0x1

    .line 522
    .line 523
    goto :goto_11

    .line 524
    :cond_18
    move-object v7, v4

    .line 525
    :goto_12
    check-cast v7, La/pu90;

    .line 526
    .line 527
    if-eqz v7, :cond_19

    .line 528
    .line 529
    iget v3, v7, La/pu90;->b:I

    .line 530
    .line 531
    int-to-float v3, v3

    .line 532
    goto :goto_13

    .line 533
    :cond_19
    move v3, v6

    .line 534
    :goto_13
    neg-float v4, v2

    .line 535
    invoke-virtual {v1, v4}, La/x2d;->c(F)V

    .line 536
    .line 537
    .line 538
    sub-float/2addr v3, v2

    .line 539
    invoke-virtual {v1}, La/x2d;->a()F

    .line 540
    .line 541
    .line 542
    move-result v4

    .line 543
    invoke-static {v2, v0, v4}, La/l7x;->O(FFF)F

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    invoke-virtual {v1}, La/x2d;->a()F

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    invoke-static {v6, v3, v1}, La/l7x;->O(FFF)F

    .line 552
    .line 553
    .line 554
    move-result v1

    .line 555
    invoke-static {v1}, La/si30;->b(F)I

    .line 556
    .line 557
    .line 558
    move-result v1

    .line 559
    iput v1, v5, La/kie0;->a:I

    .line 560
    .line 561
    goto :goto_14

    .line 562
    :cond_1a
    invoke-virtual {v1, v2}, La/x2d;->c(F)V

    .line 563
    .line 564
    .line 565
    :goto_14
    iget-wide v1, v10, La/p4e;->a:J

    .line 566
    .line 567
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 568
    .line 569
    .line 570
    move-result v1

    .line 571
    invoke-static {v0}, La/si30;->b(F)I

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    new-instance v2, La/gi0;

    .line 576
    .line 577
    const/4 v3, 0x3

    .line 578
    invoke-direct {v2, v11, v14, v5, v3}, La/gi0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;La/kie0;B)V

    .line 579
    .line 580
    .line 581
    invoke-static {v8, v1, v0, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    return-object v0

    .line 586
    :pswitch_1
    iget-object v1, v8, La/w2d;->a:La/x2d;

    .line 587
    .line 588
    move-object/from16 v7, p1

    .line 589
    .line 590
    check-cast v7, La/c5n0;

    .line 591
    .line 592
    move-object/from16 v8, p2

    .line 593
    .line 594
    check-cast v8, La/p4e;

    .line 595
    .line 596
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    invoke-interface {v7, v5, v0}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    new-instance v13, Ljava/util/ArrayList;

    .line 604
    .line 605
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 606
    .line 607
    .line 608
    move-result v5

    .line 609
    invoke-direct {v13, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 610
    .line 611
    .line 612
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 613
    .line 614
    .line 615
    move-result v5

    .line 616
    move v14, v4

    .line 617
    :goto_15
    const/4 v15, 0x1

    .line 618
    if-ge v14, v5, :cond_1b

    .line 619
    .line 620
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v10

    .line 624
    check-cast v10, La/pj30;

    .line 625
    .line 626
    iget-wide v11, v8, La/p4e;->a:J

    .line 627
    .line 628
    invoke-static/range {v10 .. v15}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 629
    .line 630
    .line 631
    move-result v14

    .line 632
    goto :goto_15

    .line 633
    :cond_1b
    invoke-interface {v7, v3, v9}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    new-instance v3, Ljava/util/ArrayList;

    .line 638
    .line 639
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 640
    .line 641
    .line 642
    move-result v5

    .line 643
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 644
    .line 645
    .line 646
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 647
    .line 648
    .line 649
    move-result v5

    .line 650
    move v9, v4

    .line 651
    :goto_16
    if-ge v9, v5, :cond_1c

    .line 652
    .line 653
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v10

    .line 657
    move-object/from16 v17, v10

    .line 658
    .line 659
    check-cast v17, La/pj30;

    .line 660
    .line 661
    iget-wide v10, v8, La/p4e;->a:J

    .line 662
    .line 663
    move-object/from16 v20, v3

    .line 664
    .line 665
    move/from16 v21, v9

    .line 666
    .line 667
    move-wide/from16 v18, v10

    .line 668
    .line 669
    move/from16 v22, v15

    .line 670
    .line 671
    invoke-static/range {v17 .. v22}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 672
    .line 673
    .line 674
    move-result v9

    .line 675
    goto :goto_16

    .line 676
    :cond_1c
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    if-eqz v0, :cond_1d

    .line 681
    .line 682
    const/4 v0, 0x0

    .line 683
    goto :goto_18

    .line 684
    :cond_1d
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    move-object v5, v0

    .line 689
    check-cast v5, La/pu90;

    .line 690
    .line 691
    iget v5, v5, La/pu90;->b:I

    .line 692
    .line 693
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 694
    .line 695
    .line 696
    move-result v9

    .line 697
    sub-int/2addr v9, v15

    .line 698
    if-gt v15, v9, :cond_1f

    .line 699
    .line 700
    move v10, v15

    .line 701
    :goto_17
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v11

    .line 705
    move-object v12, v11

    .line 706
    check-cast v12, La/pu90;

    .line 707
    .line 708
    iget v12, v12, La/pu90;->b:I

    .line 709
    .line 710
    if-ge v5, v12, :cond_1e

    .line 711
    .line 712
    move-object v0, v11

    .line 713
    move v5, v12

    .line 714
    :cond_1e
    if-eq v10, v9, :cond_1f

    .line 715
    .line 716
    add-int/lit8 v10, v10, 0x1

    .line 717
    .line 718
    goto :goto_17

    .line 719
    :cond_1f
    :goto_18
    check-cast v0, La/pu90;

    .line 720
    .line 721
    if-eqz v0, :cond_20

    .line 722
    .line 723
    iget v0, v0, La/pu90;->b:I

    .line 724
    .line 725
    int-to-float v0, v0

    .line 726
    goto :goto_19

    .line 727
    :cond_20
    move v0, v6

    .line 728
    :goto_19
    new-instance v5, La/kie0;

    .line 729
    .line 730
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 734
    .line 735
    .line 736
    move-result v9

    .line 737
    if-nez v9, :cond_29

    .line 738
    .line 739
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 740
    .line 741
    .line 742
    move-result v9

    .line 743
    if-nez v9, :cond_29

    .line 744
    .line 745
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 746
    .line 747
    .line 748
    move-result v2

    .line 749
    if-eqz v2, :cond_21

    .line 750
    .line 751
    const/4 v2, 0x0

    .line 752
    goto :goto_1b

    .line 753
    :cond_21
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    move-object v9, v2

    .line 758
    check-cast v9, La/pu90;

    .line 759
    .line 760
    iget v9, v9, La/pu90;->b:I

    .line 761
    .line 762
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 763
    .line 764
    .line 765
    move-result v10

    .line 766
    sub-int/2addr v10, v15

    .line 767
    if-gt v15, v10, :cond_23

    .line 768
    .line 769
    move v11, v15

    .line 770
    :goto_1a
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v12

    .line 774
    move-object v14, v12

    .line 775
    check-cast v14, La/pu90;

    .line 776
    .line 777
    iget v14, v14, La/pu90;->b:I

    .line 778
    .line 779
    if-ge v9, v14, :cond_22

    .line 780
    .line 781
    move-object v2, v12

    .line 782
    move v9, v14

    .line 783
    :cond_22
    if-eq v11, v10, :cond_23

    .line 784
    .line 785
    add-int/lit8 v11, v11, 0x1

    .line 786
    .line 787
    goto :goto_1a

    .line 788
    :cond_23
    :goto_1b
    check-cast v2, La/pu90;

    .line 789
    .line 790
    if-eqz v2, :cond_24

    .line 791
    .line 792
    iget v2, v2, La/pu90;->b:I

    .line 793
    .line 794
    int-to-float v2, v2

    .line 795
    goto :goto_1c

    .line 796
    :cond_24
    move v2, v6

    .line 797
    :goto_1c
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 798
    .line 799
    .line 800
    move-result v9

    .line 801
    if-eqz v9, :cond_25

    .line 802
    .line 803
    const/16 v16, 0x0

    .line 804
    .line 805
    goto :goto_1e

    .line 806
    :cond_25
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v9

    .line 810
    move-object v10, v9

    .line 811
    check-cast v10, La/pu90;

    .line 812
    .line 813
    iget v10, v10, La/pu90;->b:I

    .line 814
    .line 815
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 816
    .line 817
    .line 818
    move-result v11

    .line 819
    sub-int/2addr v11, v15

    .line 820
    if-gt v15, v11, :cond_27

    .line 821
    .line 822
    :goto_1d
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v12

    .line 826
    move-object v14, v12

    .line 827
    check-cast v14, La/pu90;

    .line 828
    .line 829
    iget v14, v14, La/pu90;->b:I

    .line 830
    .line 831
    if-ge v10, v14, :cond_26

    .line 832
    .line 833
    move-object v9, v12

    .line 834
    move v10, v14

    .line 835
    :cond_26
    if-eq v15, v11, :cond_27

    .line 836
    .line 837
    add-int/lit8 v15, v15, 0x1

    .line 838
    .line 839
    goto :goto_1d

    .line 840
    :cond_27
    move-object/from16 v16, v9

    .line 841
    .line 842
    :goto_1e
    move-object/from16 v9, v16

    .line 843
    .line 844
    check-cast v9, La/pu90;

    .line 845
    .line 846
    if-eqz v9, :cond_28

    .line 847
    .line 848
    iget v6, v9, La/pu90;->b:I

    .line 849
    .line 850
    int-to-float v6, v6

    .line 851
    :cond_28
    neg-float v9, v2

    .line 852
    invoke-virtual {v1, v9}, La/x2d;->c(F)V

    .line 853
    .line 854
    .line 855
    add-float v9, v6, v2

    .line 856
    .line 857
    sub-float v2, v6, v2

    .line 858
    .line 859
    invoke-virtual {v1}, La/x2d;->a()F

    .line 860
    .line 861
    .line 862
    move-result v10

    .line 863
    invoke-static {v0, v9, v10, v9}, La/rw2;->a(FFFF)F

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    invoke-virtual {v1}, La/x2d;->a()F

    .line 868
    .line 869
    .line 870
    move-result v1

    .line 871
    sub-float/2addr v2, v6

    .line 872
    mul-float/2addr v2, v1

    .line 873
    add-float/2addr v2, v6

    .line 874
    invoke-static {v2}, La/si30;->b(F)I

    .line 875
    .line 876
    .line 877
    move-result v1

    .line 878
    iput v1, v5, La/kie0;->a:I

    .line 879
    .line 880
    goto :goto_1f

    .line 881
    :cond_29
    invoke-virtual {v1, v2}, La/x2d;->c(F)V

    .line 882
    .line 883
    .line 884
    :goto_1f
    iget-wide v1, v8, La/p4e;->a:J

    .line 885
    .line 886
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 887
    .line 888
    .line 889
    move-result v1

    .line 890
    if-gez v1, :cond_2a

    .line 891
    .line 892
    move v1, v4

    .line 893
    :cond_2a
    invoke-static {v0}, La/si30;->b(F)I

    .line 894
    .line 895
    .line 896
    move-result v0

    .line 897
    if-gez v0, :cond_2b

    .line 898
    .line 899
    goto :goto_20

    .line 900
    :cond_2b
    move v4, v0

    .line 901
    :goto_20
    new-instance v0, La/gi0;

    .line 902
    .line 903
    const/4 v2, 0x1

    .line 904
    invoke-direct {v0, v3, v13, v5, v2}, La/gi0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;La/kie0;B)V

    .line 905
    .line 906
    .line 907
    invoke-static {v7, v1, v4, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    return-object v0

    .line 912
    nop

    .line 913
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
