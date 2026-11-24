.class public final synthetic La/ms60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;

.field public final synthetic c:La/ugd;

.field public final synthetic d:La/clo;


# direct methods
.method public synthetic constructor <init>(La/ugd;La/ugd;La/clo;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ms60;->a:B

    iput-object p1, p0, La/ms60;->b:La/ugd;

    iput-object p2, p0, La/ms60;->c:La/ugd;

    iput-object p3, p0, La/ms60;->d:La/clo;

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
    iget-byte v1, v0, La/ms60;->a:B

    .line 4
    .line 5
    const/high16 v2, -0x40800000    # -1.0f

    .line 6
    .line 7
    const-string v3, "dynamicContentId"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "staticContentId"

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v8, v0, La/ms60;->d:La/clo;

    .line 14
    .line 15
    iget-object v9, v0, La/ms60;->c:La/ugd;

    .line 16
    .line 17
    iget-object v0, v0, La/ms60;->b:La/ugd;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget-object v1, v8, La/clo;->a:La/oyq0;

    .line 23
    .line 24
    move-object/from16 v8, p1

    .line 25
    .line 26
    check-cast v8, La/c5n0;

    .line 27
    .line 28
    move-object/from16 v10, p2

    .line 29
    .line 30
    check-cast v10, La/p4e;

    .line 31
    .line 32
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v11, La/kie0;

    .line 36
    .line 37
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v8, v5, v0}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v15, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    move v12, v4

    .line 58
    :goto_0
    const/16 v17, 0x1

    .line 59
    .line 60
    if-ge v12, v5, :cond_0

    .line 61
    .line 62
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v13

    .line 66
    check-cast v13, La/pj30;

    .line 67
    .line 68
    move/from16 v16, v12

    .line 69
    .line 70
    move-object v12, v13

    .line 71
    iget-wide v13, v10, La/p4e;->a:J

    .line 72
    .line 73
    invoke-static/range {v12 .. v17}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 74
    .line 75
    .line 76
    move-result v12

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-interface {v8, v3, v9}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v3, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    move v9, v4

    .line 96
    :goto_1
    if-ge v9, v5, :cond_1

    .line 97
    .line 98
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    move-object/from16 v16, v12

    .line 103
    .line 104
    check-cast v16, La/pj30;

    .line 105
    .line 106
    iget-wide v12, v10, La/p4e;->a:J

    .line 107
    .line 108
    move-object/from16 v19, v3

    .line 109
    .line 110
    move/from16 v20, v9

    .line 111
    .line 112
    move/from16 v21, v17

    .line 113
    .line 114
    move-wide/from16 v17, v12

    .line 115
    .line 116
    invoke-static/range {v16 .. v21}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    move/from16 v17, v21

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    move-object v12, v3

    .line 124
    move/from16 v3, v17

    .line 125
    .line 126
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_2

    .line 131
    .line 132
    const/4 v0, 0x0

    .line 133
    goto :goto_3

    .line 134
    :cond_2
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    move-object v5, v0

    .line 139
    check-cast v5, La/pu90;

    .line 140
    .line 141
    iget v5, v5, La/pu90;->b:I

    .line 142
    .line 143
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    sub-int/2addr v9, v3

    .line 148
    if-gt v3, v9, :cond_4

    .line 149
    .line 150
    move v13, v3

    .line 151
    :goto_2
    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v14

    .line 155
    move-object v6, v14

    .line 156
    check-cast v6, La/pu90;

    .line 157
    .line 158
    iget v6, v6, La/pu90;->b:I

    .line 159
    .line 160
    if-ge v5, v6, :cond_3

    .line 161
    .line 162
    move v5, v6

    .line 163
    move-object v0, v14

    .line 164
    :cond_3
    if-eq v13, v9, :cond_4

    .line 165
    .line 166
    add-int/lit8 v13, v13, 0x1

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_4
    :goto_3
    check-cast v0, La/pu90;

    .line 170
    .line 171
    if-eqz v0, :cond_5

    .line 172
    .line 173
    iget v0, v0, La/pu90;->b:I

    .line 174
    .line 175
    int-to-float v0, v0

    .line 176
    goto :goto_4

    .line 177
    :cond_5
    move v0, v7

    .line 178
    :goto_4
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-nez v5, :cond_e

    .line 183
    .line 184
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-nez v5, :cond_e

    .line 189
    .line 190
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_6

    .line 195
    .line 196
    const/4 v2, 0x0

    .line 197
    goto :goto_6

    .line 198
    :cond_6
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    move-object v5, v2

    .line 203
    check-cast v5, La/pu90;

    .line 204
    .line 205
    iget v5, v5, La/pu90;->b:I

    .line 206
    .line 207
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    sub-int/2addr v6, v3

    .line 212
    if-gt v3, v6, :cond_8

    .line 213
    .line 214
    move v9, v3

    .line 215
    :goto_5
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    move-object v14, v13

    .line 220
    check-cast v14, La/pu90;

    .line 221
    .line 222
    iget v14, v14, La/pu90;->b:I

    .line 223
    .line 224
    if-ge v5, v14, :cond_7

    .line 225
    .line 226
    move-object v2, v13

    .line 227
    move v5, v14

    .line 228
    :cond_7
    if-eq v9, v6, :cond_8

    .line 229
    .line 230
    add-int/lit8 v9, v9, 0x1

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_8
    :goto_6
    check-cast v2, La/pu90;

    .line 234
    .line 235
    if-eqz v2, :cond_9

    .line 236
    .line 237
    iget v2, v2, La/pu90;->b:I

    .line 238
    .line 239
    int-to-float v2, v2

    .line 240
    goto :goto_7

    .line 241
    :cond_9
    move v2, v7

    .line 242
    :goto_7
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    if-eqz v5, :cond_a

    .line 247
    .line 248
    const/4 v6, 0x0

    .line 249
    goto :goto_9

    .line 250
    :cond_a
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    move-object v5, v4

    .line 255
    check-cast v5, La/pu90;

    .line 256
    .line 257
    iget v5, v5, La/pu90;->b:I

    .line 258
    .line 259
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    sub-int/2addr v6, v3

    .line 264
    if-gt v3, v6, :cond_c

    .line 265
    .line 266
    :goto_8
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    move-object v13, v9

    .line 271
    check-cast v13, La/pu90;

    .line 272
    .line 273
    iget v13, v13, La/pu90;->b:I

    .line 274
    .line 275
    if-ge v5, v13, :cond_b

    .line 276
    .line 277
    move-object v4, v9

    .line 278
    move v5, v13

    .line 279
    :cond_b
    if-eq v3, v6, :cond_c

    .line 280
    .line 281
    add-int/lit8 v3, v3, 0x1

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_c
    move-object v6, v4

    .line 285
    :goto_9
    check-cast v6, La/pu90;

    .line 286
    .line 287
    if-eqz v6, :cond_d

    .line 288
    .line 289
    iget v3, v6, La/pu90;->b:I

    .line 290
    .line 291
    int-to-float v7, v3

    .line 292
    :cond_d
    neg-float v3, v2

    .line 293
    iput v3, v1, La/oyq0;->a:F

    .line 294
    .line 295
    add-float v3, v7, v2

    .line 296
    .line 297
    invoke-virtual {v1}, La/oyq0;->a()F

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    invoke-static {v0, v3, v4, v3}, La/rw2;->a(FFFF)F

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    sub-float v2, v7, v2

    .line 306
    .line 307
    invoke-virtual {v1}, La/oyq0;->a()F

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    sub-float/2addr v2, v7

    .line 312
    mul-float/2addr v2, v1

    .line 313
    add-float/2addr v2, v7

    .line 314
    invoke-static {v2}, La/si30;->b(F)I

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    iput v1, v11, La/kie0;->a:I

    .line 319
    .line 320
    goto :goto_a

    .line 321
    :cond_e
    iput v2, v1, La/oyq0;->a:F

    .line 322
    .line 323
    :goto_a
    iget-wide v1, v10, La/p4e;->a:J

    .line 324
    .line 325
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    invoke-static {v0}, La/si30;->b(F)I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    new-instance v2, La/gi0;

    .line 334
    .line 335
    const/4 v3, 0x6

    .line 336
    invoke-direct {v2, v12, v15, v11, v3}, La/gi0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;La/kie0;B)V

    .line 337
    .line 338
    .line 339
    invoke-static {v8, v1, v0, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    return-object v0

    .line 344
    :pswitch_0
    iget-object v1, v8, La/clo;->a:La/oyq0;

    .line 345
    .line 346
    move-object/from16 v6, p1

    .line 347
    .line 348
    check-cast v6, La/c5n0;

    .line 349
    .line 350
    move-object/from16 v8, p2

    .line 351
    .line 352
    check-cast v8, La/p4e;

    .line 353
    .line 354
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    new-instance v10, La/kie0;

    .line 358
    .line 359
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 360
    .line 361
    .line 362
    invoke-interface {v6, v5, v0}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    new-instance v5, Ljava/util/ArrayList;

    .line 367
    .line 368
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 369
    .line 370
    .line 371
    move-result v11

    .line 372
    invoke-direct {v5, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 373
    .line 374
    .line 375
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 376
    .line 377
    .line 378
    move-result v11

    .line 379
    move v12, v4

    .line 380
    :goto_b
    const/16 v22, 0x1

    .line 381
    .line 382
    if-ge v12, v11, :cond_f

    .line 383
    .line 384
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v13

    .line 388
    move-object/from16 v17, v13

    .line 389
    .line 390
    check-cast v17, La/pj30;

    .line 391
    .line 392
    iget-wide v13, v8, La/p4e;->a:J

    .line 393
    .line 394
    move-object/from16 v20, v5

    .line 395
    .line 396
    move/from16 v21, v12

    .line 397
    .line 398
    move-wide/from16 v18, v13

    .line 399
    .line 400
    invoke-static/range {v17 .. v22}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 401
    .line 402
    .line 403
    move-result v12

    .line 404
    goto :goto_b

    .line 405
    :cond_f
    invoke-interface {v6, v3, v9}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    new-instance v3, Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 412
    .line 413
    .line 414
    move-result v9

    .line 415
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 416
    .line 417
    .line 418
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 419
    .line 420
    .line 421
    move-result v9

    .line 422
    move v11, v4

    .line 423
    :goto_c
    if-ge v11, v9, :cond_10

    .line 424
    .line 425
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v12

    .line 429
    move-object/from16 v17, v12

    .line 430
    .line 431
    check-cast v17, La/pj30;

    .line 432
    .line 433
    iget-wide v12, v8, La/p4e;->a:J

    .line 434
    .line 435
    move-object/from16 v20, v3

    .line 436
    .line 437
    move/from16 v21, v11

    .line 438
    .line 439
    move-wide/from16 v18, v12

    .line 440
    .line 441
    invoke-static/range {v17 .. v22}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 442
    .line 443
    .line 444
    move-result v11

    .line 445
    goto :goto_c

    .line 446
    :cond_10
    move-object v12, v3

    .line 447
    move/from16 v3, v22

    .line 448
    .line 449
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-eqz v0, :cond_11

    .line 454
    .line 455
    const/4 v0, 0x0

    .line 456
    goto :goto_e

    .line 457
    :cond_11
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    move-object v9, v0

    .line 462
    check-cast v9, La/pu90;

    .line 463
    .line 464
    iget v9, v9, La/pu90;->b:I

    .line 465
    .line 466
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 467
    .line 468
    .line 469
    move-result v11

    .line 470
    sub-int/2addr v11, v3

    .line 471
    if-gt v3, v11, :cond_13

    .line 472
    .line 473
    move v13, v3

    .line 474
    :goto_d
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v14

    .line 478
    move-object v15, v14

    .line 479
    check-cast v15, La/pu90;

    .line 480
    .line 481
    iget v15, v15, La/pu90;->b:I

    .line 482
    .line 483
    if-ge v9, v15, :cond_12

    .line 484
    .line 485
    move-object v0, v14

    .line 486
    move v9, v15

    .line 487
    :cond_12
    if-eq v13, v11, :cond_13

    .line 488
    .line 489
    add-int/lit8 v13, v13, 0x1

    .line 490
    .line 491
    goto :goto_d

    .line 492
    :cond_13
    :goto_e
    check-cast v0, La/pu90;

    .line 493
    .line 494
    if-eqz v0, :cond_14

    .line 495
    .line 496
    iget v0, v0, La/pu90;->b:I

    .line 497
    .line 498
    int-to-float v0, v0

    .line 499
    goto :goto_f

    .line 500
    :cond_14
    move v0, v7

    .line 501
    :goto_f
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 502
    .line 503
    .line 504
    move-result v9

    .line 505
    if-nez v9, :cond_1d

    .line 506
    .line 507
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 508
    .line 509
    .line 510
    move-result v9

    .line 511
    if-nez v9, :cond_1d

    .line 512
    .line 513
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    if-eqz v2, :cond_15

    .line 518
    .line 519
    const/4 v2, 0x0

    .line 520
    goto :goto_11

    .line 521
    :cond_15
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    move-object v9, v2

    .line 526
    check-cast v9, La/pu90;

    .line 527
    .line 528
    iget v9, v9, La/pu90;->b:I

    .line 529
    .line 530
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 531
    .line 532
    .line 533
    move-result v11

    .line 534
    sub-int/2addr v11, v3

    .line 535
    if-gt v3, v11, :cond_17

    .line 536
    .line 537
    move v13, v3

    .line 538
    :goto_10
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v14

    .line 542
    move-object v15, v14

    .line 543
    check-cast v15, La/pu90;

    .line 544
    .line 545
    iget v15, v15, La/pu90;->b:I

    .line 546
    .line 547
    if-ge v9, v15, :cond_16

    .line 548
    .line 549
    move-object v2, v14

    .line 550
    move v9, v15

    .line 551
    :cond_16
    if-eq v13, v11, :cond_17

    .line 552
    .line 553
    add-int/lit8 v13, v13, 0x1

    .line 554
    .line 555
    goto :goto_10

    .line 556
    :cond_17
    :goto_11
    check-cast v2, La/pu90;

    .line 557
    .line 558
    if-eqz v2, :cond_18

    .line 559
    .line 560
    iget v2, v2, La/pu90;->b:I

    .line 561
    .line 562
    int-to-float v2, v2

    .line 563
    goto :goto_12

    .line 564
    :cond_18
    move v2, v7

    .line 565
    :goto_12
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 566
    .line 567
    .line 568
    move-result v9

    .line 569
    if-eqz v9, :cond_19

    .line 570
    .line 571
    const/16 v16, 0x0

    .line 572
    .line 573
    goto :goto_14

    .line 574
    :cond_19
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    move-object v9, v4

    .line 579
    check-cast v9, La/pu90;

    .line 580
    .line 581
    iget v9, v9, La/pu90;->b:I

    .line 582
    .line 583
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 584
    .line 585
    .line 586
    move-result v11

    .line 587
    sub-int/2addr v11, v3

    .line 588
    if-gt v3, v11, :cond_1b

    .line 589
    .line 590
    :goto_13
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v13

    .line 594
    move-object v14, v13

    .line 595
    check-cast v14, La/pu90;

    .line 596
    .line 597
    iget v14, v14, La/pu90;->b:I

    .line 598
    .line 599
    if-ge v9, v14, :cond_1a

    .line 600
    .line 601
    move-object v4, v13

    .line 602
    move v9, v14

    .line 603
    :cond_1a
    if-eq v3, v11, :cond_1b

    .line 604
    .line 605
    add-int/lit8 v3, v3, 0x1

    .line 606
    .line 607
    goto :goto_13

    .line 608
    :cond_1b
    move-object/from16 v16, v4

    .line 609
    .line 610
    :goto_14
    move-object/from16 v3, v16

    .line 611
    .line 612
    check-cast v3, La/pu90;

    .line 613
    .line 614
    if-eqz v3, :cond_1c

    .line 615
    .line 616
    iget v3, v3, La/pu90;->b:I

    .line 617
    .line 618
    int-to-float v7, v3

    .line 619
    :cond_1c
    neg-float v3, v2

    .line 620
    iput v3, v1, La/oyq0;->a:F

    .line 621
    .line 622
    add-float v3, v7, v2

    .line 623
    .line 624
    invoke-virtual {v1}, La/oyq0;->a()F

    .line 625
    .line 626
    .line 627
    move-result v4

    .line 628
    invoke-static {v0, v3, v4, v3}, La/rw2;->a(FFFF)F

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    sub-float v2, v7, v2

    .line 633
    .line 634
    invoke-virtual {v1}, La/oyq0;->a()F

    .line 635
    .line 636
    .line 637
    move-result v1

    .line 638
    sub-float/2addr v2, v7

    .line 639
    mul-float/2addr v2, v1

    .line 640
    add-float/2addr v2, v7

    .line 641
    invoke-static {v2}, La/si30;->b(F)I

    .line 642
    .line 643
    .line 644
    move-result v1

    .line 645
    iput v1, v10, La/kie0;->a:I

    .line 646
    .line 647
    goto :goto_15

    .line 648
    :cond_1d
    iput v2, v1, La/oyq0;->a:F

    .line 649
    .line 650
    :goto_15
    iget-wide v1, v8, La/p4e;->a:J

    .line 651
    .line 652
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 653
    .line 654
    .line 655
    move-result v1

    .line 656
    invoke-static {v0}, La/si30;->b(F)I

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    new-instance v2, La/gi0;

    .line 661
    .line 662
    const/4 v3, 0x5

    .line 663
    invoke-direct {v2, v12, v5, v10, v3}, La/gi0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;La/kie0;B)V

    .line 664
    .line 665
    .line 666
    invoke-static {v6, v1, v0, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    return-object v0

    .line 671
    :pswitch_1
    iget-object v1, v8, La/clo;->a:La/oyq0;

    .line 672
    .line 673
    move-object/from16 v6, p1

    .line 674
    .line 675
    check-cast v6, La/c5n0;

    .line 676
    .line 677
    move-object/from16 v8, p2

    .line 678
    .line 679
    check-cast v8, La/p4e;

    .line 680
    .line 681
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    new-instance v10, La/kie0;

    .line 685
    .line 686
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 687
    .line 688
    .line 689
    invoke-interface {v6, v5, v0}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    new-instance v5, Ljava/util/ArrayList;

    .line 694
    .line 695
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 696
    .line 697
    .line 698
    move-result v11

    .line 699
    invoke-direct {v5, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 700
    .line 701
    .line 702
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 703
    .line 704
    .line 705
    move-result v11

    .line 706
    move v12, v4

    .line 707
    :goto_16
    const/16 v22, 0x1

    .line 708
    .line 709
    if-ge v12, v11, :cond_1e

    .line 710
    .line 711
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v13

    .line 715
    move-object/from16 v17, v13

    .line 716
    .line 717
    check-cast v17, La/pj30;

    .line 718
    .line 719
    iget-wide v13, v8, La/p4e;->a:J

    .line 720
    .line 721
    move-object/from16 v20, v5

    .line 722
    .line 723
    move/from16 v21, v12

    .line 724
    .line 725
    move-wide/from16 v18, v13

    .line 726
    .line 727
    invoke-static/range {v17 .. v22}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 728
    .line 729
    .line 730
    move-result v12

    .line 731
    goto :goto_16

    .line 732
    :cond_1e
    invoke-interface {v6, v3, v9}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    new-instance v3, Ljava/util/ArrayList;

    .line 737
    .line 738
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 739
    .line 740
    .line 741
    move-result v9

    .line 742
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 743
    .line 744
    .line 745
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 746
    .line 747
    .line 748
    move-result v9

    .line 749
    move v11, v4

    .line 750
    :goto_17
    if-ge v11, v9, :cond_1f

    .line 751
    .line 752
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v12

    .line 756
    move-object/from16 v17, v12

    .line 757
    .line 758
    check-cast v17, La/pj30;

    .line 759
    .line 760
    iget-wide v12, v8, La/p4e;->a:J

    .line 761
    .line 762
    move-object/from16 v20, v3

    .line 763
    .line 764
    move/from16 v21, v11

    .line 765
    .line 766
    move-wide/from16 v18, v12

    .line 767
    .line 768
    invoke-static/range {v17 .. v22}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 769
    .line 770
    .line 771
    move-result v11

    .line 772
    goto :goto_17

    .line 773
    :cond_1f
    move-object v12, v3

    .line 774
    move/from16 v3, v22

    .line 775
    .line 776
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 777
    .line 778
    .line 779
    move-result v0

    .line 780
    if-eqz v0, :cond_20

    .line 781
    .line 782
    const/4 v0, 0x0

    .line 783
    goto :goto_19

    .line 784
    :cond_20
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    move-object v9, v0

    .line 789
    check-cast v9, La/pu90;

    .line 790
    .line 791
    iget v9, v9, La/pu90;->b:I

    .line 792
    .line 793
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 794
    .line 795
    .line 796
    move-result v11

    .line 797
    sub-int/2addr v11, v3

    .line 798
    if-gt v3, v11, :cond_22

    .line 799
    .line 800
    move v13, v3

    .line 801
    :goto_18
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v14

    .line 805
    move-object v15, v14

    .line 806
    check-cast v15, La/pu90;

    .line 807
    .line 808
    iget v15, v15, La/pu90;->b:I

    .line 809
    .line 810
    if-ge v9, v15, :cond_21

    .line 811
    .line 812
    move-object v0, v14

    .line 813
    move v9, v15

    .line 814
    :cond_21
    if-eq v13, v11, :cond_22

    .line 815
    .line 816
    add-int/lit8 v13, v13, 0x1

    .line 817
    .line 818
    goto :goto_18

    .line 819
    :cond_22
    :goto_19
    check-cast v0, La/pu90;

    .line 820
    .line 821
    if-eqz v0, :cond_23

    .line 822
    .line 823
    iget v0, v0, La/pu90;->b:I

    .line 824
    .line 825
    int-to-float v0, v0

    .line 826
    goto :goto_1a

    .line 827
    :cond_23
    move v0, v7

    .line 828
    :goto_1a
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 829
    .line 830
    .line 831
    move-result v9

    .line 832
    if-nez v9, :cond_2c

    .line 833
    .line 834
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 835
    .line 836
    .line 837
    move-result v9

    .line 838
    if-nez v9, :cond_2c

    .line 839
    .line 840
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 841
    .line 842
    .line 843
    move-result v2

    .line 844
    if-eqz v2, :cond_24

    .line 845
    .line 846
    const/4 v2, 0x0

    .line 847
    goto :goto_1c

    .line 848
    :cond_24
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v2

    .line 852
    move-object v9, v2

    .line 853
    check-cast v9, La/pu90;

    .line 854
    .line 855
    iget v9, v9, La/pu90;->b:I

    .line 856
    .line 857
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 858
    .line 859
    .line 860
    move-result v11

    .line 861
    sub-int/2addr v11, v3

    .line 862
    if-gt v3, v11, :cond_26

    .line 863
    .line 864
    move v13, v3

    .line 865
    :goto_1b
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v14

    .line 869
    move-object v15, v14

    .line 870
    check-cast v15, La/pu90;

    .line 871
    .line 872
    iget v15, v15, La/pu90;->b:I

    .line 873
    .line 874
    if-ge v9, v15, :cond_25

    .line 875
    .line 876
    move-object v2, v14

    .line 877
    move v9, v15

    .line 878
    :cond_25
    if-eq v13, v11, :cond_26

    .line 879
    .line 880
    add-int/lit8 v13, v13, 0x1

    .line 881
    .line 882
    goto :goto_1b

    .line 883
    :cond_26
    :goto_1c
    check-cast v2, La/pu90;

    .line 884
    .line 885
    if-eqz v2, :cond_27

    .line 886
    .line 887
    iget v2, v2, La/pu90;->b:I

    .line 888
    .line 889
    int-to-float v2, v2

    .line 890
    goto :goto_1d

    .line 891
    :cond_27
    move v2, v7

    .line 892
    :goto_1d
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 893
    .line 894
    .line 895
    move-result v9

    .line 896
    if-eqz v9, :cond_28

    .line 897
    .line 898
    const/16 v16, 0x0

    .line 899
    .line 900
    goto :goto_1f

    .line 901
    :cond_28
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v4

    .line 905
    move-object v9, v4

    .line 906
    check-cast v9, La/pu90;

    .line 907
    .line 908
    iget v9, v9, La/pu90;->b:I

    .line 909
    .line 910
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 911
    .line 912
    .line 913
    move-result v11

    .line 914
    sub-int/2addr v11, v3

    .line 915
    if-gt v3, v11, :cond_2a

    .line 916
    .line 917
    :goto_1e
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v13

    .line 921
    move-object v14, v13

    .line 922
    check-cast v14, La/pu90;

    .line 923
    .line 924
    iget v14, v14, La/pu90;->b:I

    .line 925
    .line 926
    if-ge v9, v14, :cond_29

    .line 927
    .line 928
    move-object v4, v13

    .line 929
    move v9, v14

    .line 930
    :cond_29
    if-eq v3, v11, :cond_2a

    .line 931
    .line 932
    add-int/lit8 v3, v3, 0x1

    .line 933
    .line 934
    goto :goto_1e

    .line 935
    :cond_2a
    move-object/from16 v16, v4

    .line 936
    .line 937
    :goto_1f
    move-object/from16 v3, v16

    .line 938
    .line 939
    check-cast v3, La/pu90;

    .line 940
    .line 941
    if-eqz v3, :cond_2b

    .line 942
    .line 943
    iget v3, v3, La/pu90;->b:I

    .line 944
    .line 945
    int-to-float v7, v3

    .line 946
    :cond_2b
    neg-float v3, v2

    .line 947
    iput v3, v1, La/oyq0;->a:F

    .line 948
    .line 949
    add-float v3, v7, v2

    .line 950
    .line 951
    invoke-virtual {v1}, La/oyq0;->a()F

    .line 952
    .line 953
    .line 954
    move-result v4

    .line 955
    invoke-static {v0, v3, v4, v3}, La/rw2;->a(FFFF)F

    .line 956
    .line 957
    .line 958
    move-result v0

    .line 959
    sub-float v2, v7, v2

    .line 960
    .line 961
    invoke-virtual {v1}, La/oyq0;->a()F

    .line 962
    .line 963
    .line 964
    move-result v1

    .line 965
    sub-float/2addr v2, v7

    .line 966
    mul-float/2addr v2, v1

    .line 967
    add-float/2addr v2, v7

    .line 968
    invoke-static {v2}, La/si30;->b(F)I

    .line 969
    .line 970
    .line 971
    move-result v1

    .line 972
    iput v1, v10, La/kie0;->a:I

    .line 973
    .line 974
    goto :goto_20

    .line 975
    :cond_2c
    iput v2, v1, La/oyq0;->a:F

    .line 976
    .line 977
    :goto_20
    iget-wide v1, v8, La/p4e;->a:J

    .line 978
    .line 979
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 980
    .line 981
    .line 982
    move-result v1

    .line 983
    invoke-static {v0}, La/si30;->b(F)I

    .line 984
    .line 985
    .line 986
    move-result v0

    .line 987
    new-instance v2, La/gi0;

    .line 988
    .line 989
    const/4 v3, 0x4

    .line 990
    invoke-direct {v2, v12, v5, v10, v3}, La/gi0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;La/kie0;B)V

    .line 991
    .line 992
    .line 993
    invoke-static {v6, v1, v0, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    return-object v0

    .line 998
    nop

    .line 999
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
