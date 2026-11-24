.class public final La/h3d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:La/f3d;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/pz40;

.field public final synthetic e:La/pz40;

.field public final synthetic f:La/pz40;


# direct methods
.method public constructor <init>(FLa/f3d;La/pz40;La/pz40;La/pz40;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/h3d;->a:F

    .line 5
    .line 6
    iput-object p2, p0, La/h3d;->b:La/f3d;

    .line 7
    .line 8
    iput-object p3, p0, La/h3d;->c:La/pz40;

    .line 9
    .line 10
    iput-object p4, p0, La/h3d;->d:La/pz40;

    .line 11
    .line 12
    iput-object p5, p0, La/h3d;->e:La/pz40;

    .line 13
    .line 14
    iput-object p6, p0, La/h3d;->f:La/pz40;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    new-instance v0, La/y2d;

    .line 17
    .line 18
    invoke-direct {v0, v3}, La/y2d;-><init>(B)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v4, v4, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_0
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    const/4 v6, 0x0

    .line 35
    const-string v7, "BACKGROUND_KEY"

    .line 36
    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    move-object v8, v5

    .line 44
    check-cast v8, La/pj30;

    .line 45
    .line 46
    invoke-static {v8}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eqz v8, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    move-object v5, v6

    .line 58
    :goto_0
    check-cast v5, La/pj30;

    .line 59
    .line 60
    new-instance v2, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    move v9, v4

    .line 74
    :goto_1
    if-ge v9, v8, :cond_4

    .line 75
    .line 76
    move-object/from16 v10, p2

    .line 77
    .line 78
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    move-object v12, v11

    .line 83
    check-cast v12, La/pj30;

    .line 84
    .line 85
    invoke-static {v12}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    invoke-static {v12, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v12

    .line 93
    if-nez v12, :cond_3

    .line 94
    .line 95
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    new-instance v7, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    move v9, v4

    .line 115
    :goto_2
    iget-object v10, v0, La/h3d;->d:La/pz40;

    .line 116
    .line 117
    iget-object v15, v0, La/h3d;->c:La/pz40;

    .line 118
    .line 119
    iget-object v11, v0, La/h3d;->f:La/pz40;

    .line 120
    .line 121
    iget-object v12, v0, La/h3d;->e:La/pz40;

    .line 122
    .line 123
    if-ge v9, v8, :cond_b

    .line 124
    .line 125
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    check-cast v13, La/pj30;

    .line 130
    .line 131
    invoke-static {v13}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    const-string v3, "STATIC_HEADER_KEY"

    .line 136
    .line 137
    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_7

    .line 142
    .line 143
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    const v11, 0x7fffffff

    .line 148
    .line 149
    .line 150
    if-ne v3, v11, :cond_5

    .line 151
    .line 152
    :goto_3
    move/from16 v22, v11

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_5
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    invoke-static {v15}, La/wzb;->b(La/pz40;)I

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    sub-int/2addr v3, v11

    .line 164
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    check-cast v10, Ljava/lang/Number;

    .line 169
    .line 170
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    sub-int/2addr v3, v10

    .line 175
    if-gez v3, :cond_6

    .line 176
    .line 177
    move v11, v4

    .line 178
    goto :goto_3

    .line 179
    :cond_6
    move v11, v3

    .line 180
    goto :goto_3

    .line 181
    :goto_4
    const/16 v21, 0x0

    .line 182
    .line 183
    const/16 v23, 0x3

    .line 184
    .line 185
    const/16 v19, 0x0

    .line 186
    .line 187
    const/16 v20, 0x0

    .line 188
    .line 189
    move-wide/from16 v17, p3

    .line 190
    .line 191
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 192
    .line 193
    .line 194
    move-result-wide v10

    .line 195
    invoke-interface {v13, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    iget v10, v3, La/pu90;->b:I

    .line 200
    .line 201
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    invoke-interface {v12, v10}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_5

    .line 209
    .line 210
    :cond_7
    const-string v3, "COLLAPSING_HEADER_KEY"

    .line 211
    .line 212
    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_8

    .line 217
    .line 218
    const v22, 0x7fffffff

    .line 219
    .line 220
    .line 221
    const/16 v23, 0x3

    .line 222
    .line 223
    const/16 v19, 0x0

    .line 224
    .line 225
    const/16 v20, 0x0

    .line 226
    .line 227
    const/16 v21, 0x0

    .line 228
    .line 229
    move-wide/from16 v17, p3

    .line 230
    .line 231
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 232
    .line 233
    .line 234
    move-result-wide v14

    .line 235
    invoke-interface {v13, v14, v15}, La/pj30;->S(J)La/pu90;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    iget v10, v3, La/pu90;->b:I

    .line 240
    .line 241
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    invoke-interface {v11, v10}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_8
    const-string v3, "ANIMATED_CONTENT_KEY"

    .line 250
    .line 251
    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-eqz v3, :cond_9

    .line 256
    .line 257
    const v22, 0x7fffffff

    .line 258
    .line 259
    .line 260
    const/16 v23, 0x3

    .line 261
    .line 262
    const/16 v19, 0x0

    .line 263
    .line 264
    const/16 v20, 0x0

    .line 265
    .line 266
    const/16 v21, 0x0

    .line 267
    .line 268
    move-wide/from16 v17, p3

    .line 269
    .line 270
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 271
    .line 272
    .line 273
    move-result-wide v11

    .line 274
    invoke-interface {v13, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    iget v11, v3, La/pu90;->b:I

    .line 279
    .line 280
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    invoke-interface {v10, v11}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_9
    const-string v3, "TOOLBAR_KEY"

    .line 289
    .line 290
    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-eqz v3, :cond_a

    .line 295
    .line 296
    const/16 v22, 0x0

    .line 297
    .line 298
    const/16 v23, 0xb

    .line 299
    .line 300
    const/16 v19, 0x0

    .line 301
    .line 302
    const/16 v20, 0x0

    .line 303
    .line 304
    const/16 v21, 0x0

    .line 305
    .line 306
    move-wide/from16 v17, p3

    .line 307
    .line 308
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 309
    .line 310
    .line 311
    move-result-wide v10

    .line 312
    invoke-interface {v13, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    iget v10, v3, La/pu90;->b:I

    .line 317
    .line 318
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 319
    .line 320
    .line 321
    move-result-object v10

    .line 322
    invoke-interface {v15, v10}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    goto :goto_5

    .line 326
    :cond_a
    const/16 v22, 0x0

    .line 327
    .line 328
    const/16 v23, 0xb

    .line 329
    .line 330
    const/16 v19, 0x0

    .line 331
    .line 332
    const/16 v20, 0x0

    .line 333
    .line 334
    const/16 v21, 0x0

    .line 335
    .line 336
    move-wide/from16 v17, p3

    .line 337
    .line 338
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 339
    .line 340
    .line 341
    move-result-wide v10

    .line 342
    invoke-interface {v13, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    :goto_5
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    add-int/lit8 v9, v9, 0x1

    .line 350
    .line 351
    const/4 v3, 0x1

    .line 352
    goto/16 :goto_2

    .line 353
    .line 354
    :cond_b
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    check-cast v2, Ljava/lang/Number;

    .line 359
    .line 360
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    if-eqz v2, :cond_c

    .line 365
    .line 366
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    check-cast v2, Ljava/lang/Number;

    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    if-eqz v2, :cond_c

    .line 377
    .line 378
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    check-cast v2, Ljava/lang/Number;

    .line 383
    .line 384
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    check-cast v3, Ljava/lang/Number;

    .line 393
    .line 394
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    :goto_6
    move v14, v2

    .line 403
    goto :goto_7

    .line 404
    :cond_c
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    check-cast v2, Ljava/lang/Number;

    .line 409
    .line 410
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eqz v2, :cond_d

    .line 415
    .line 416
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    check-cast v2, Ljava/lang/Number;

    .line 421
    .line 422
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    goto :goto_6

    .line 427
    :cond_d
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    check-cast v2, Ljava/lang/Number;

    .line 432
    .line 433
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    if-eqz v2, :cond_e

    .line 438
    .line 439
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    check-cast v2, Ljava/lang/Number;

    .line 444
    .line 445
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 446
    .line 447
    .line 448
    move-result v2

    .line 449
    goto :goto_6

    .line 450
    :cond_e
    move v14, v4

    .line 451
    :goto_7
    iget v2, v0, La/h3d;->a:F

    .line 452
    .line 453
    invoke-interface {v1, v2}, La/w6k;->T(F)I

    .line 454
    .line 455
    .line 456
    move-result v2

    .line 457
    invoke-static {v15}, La/wzb;->b(La/pz40;)I

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    add-int/2addr v3, v14

    .line 462
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v8

    .line 466
    check-cast v8, Ljava/lang/Number;

    .line 467
    .line 468
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 469
    .line 470
    .line 471
    move-result v8

    .line 472
    add-int/2addr v8, v3

    .line 473
    add-int/2addr v8, v2

    .line 474
    if-eqz v5, :cond_12

    .line 475
    .line 476
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    if-ltz v2, :cond_f

    .line 481
    .line 482
    const/4 v3, 0x1

    .line 483
    goto :goto_8

    .line 484
    :cond_f
    move v3, v4

    .line 485
    :goto_8
    if-ltz v8, :cond_10

    .line 486
    .line 487
    const/16 v16, 0x1

    .line 488
    .line 489
    goto :goto_9

    .line 490
    :cond_10
    move/from16 v16, v4

    .line 491
    .line 492
    :goto_9
    and-int v3, v3, v16

    .line 493
    .line 494
    if-nez v3, :cond_11

    .line 495
    .line 496
    const-string v3, "width and height must be >= 0"

    .line 497
    .line 498
    invoke-static {v3}, La/zcx;->a(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    :cond_11
    invoke-static {v2, v2, v8, v8}, La/r4e;->h(IIII)J

    .line 502
    .line 503
    .line 504
    move-result-wide v2

    .line 505
    invoke-interface {v5, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    :cond_12
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    if-eqz v6, :cond_13

    .line 514
    .line 515
    invoke-virtual {v2, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    :cond_13
    invoke-virtual {v2, v7}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 519
    .line 520
    .line 521
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 522
    .line 523
    .line 524
    move-result-object v13

    .line 525
    int-to-float v2, v14

    .line 526
    iget-object v12, v0, La/h3d;->b:La/f3d;

    .line 527
    .line 528
    invoke-virtual {v12, v2}, La/f3d;->f(F)V

    .line 529
    .line 530
    .line 531
    iget-object v0, v12, La/f3d;->a:La/agk0;

    .line 532
    .line 533
    invoke-virtual {v0}, La/agk0;->l()F

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    invoke-static {v0}, La/si30;->b(F)I

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    sub-int/2addr v8, v0

    .line 542
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    check-cast v0, Ljava/lang/Number;

    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    check-cast v2, Ljava/lang/Number;

    .line 557
    .line 558
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 559
    .line 560
    .line 561
    move-result v2

    .line 562
    add-int/2addr v2, v0

    .line 563
    if-ge v8, v2, :cond_14

    .line 564
    .line 565
    move v8, v2

    .line 566
    :cond_14
    iget v0, v12, La/f3d;->i:I

    .line 567
    .line 568
    if-gez v0, :cond_15

    .line 569
    .line 570
    neg-int v8, v0

    .line 571
    :cond_15
    iput v8, v12, La/f3d;->i:I

    .line 572
    .line 573
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    new-instance v11, La/ec3;

    .line 578
    .line 579
    const/16 v16, 0x3

    .line 580
    .line 581
    invoke-direct/range {v11 .. v16}, La/ec3;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 582
    .line 583
    .line 584
    invoke-static {v1, v0, v8, v11}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    return-object v0
.end method
