.class public final La/xuv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sv40;


# instance fields
.field public final a:La/ywv0;

.field public final b:La/pz40;

.field public final c:La/pz40;

.field public final d:La/pz40;

.field public final e:Z

.field public final f:La/muv0;


# direct methods
.method public constructor <init>(La/ywv0;La/pz40;La/pz40;La/pz40;ZLa/l7m0;La/muv0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/xuv0;->a:La/ywv0;

    .line 11
    .line 12
    iput-object p2, p0, La/xuv0;->b:La/pz40;

    .line 13
    .line 14
    iput-object p3, p0, La/xuv0;->c:La/pz40;

    .line 15
    .line 16
    iput-object p4, p0, La/xuv0;->d:La/pz40;

    .line 17
    .line 18
    iput-boolean p5, p0, La/xuv0;->e:Z

    .line 19
    .line 20
    iput-object p7, p0, La/xuv0;->f:La/muv0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/xuv0;->f:La/muv0;

    .line 6
    .line 7
    iget-object v3, v2, La/muv0;->a:La/h0q0;

    .line 8
    .line 9
    move-object/from16 v4, p2

    .line 10
    .line 11
    check-cast v4, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    new-instance v0, La/ejv0;

    .line 21
    .line 22
    const/16 v2, 0x12

    .line 23
    .line 24
    invoke-direct {v0, v2}, La/ejv0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v6, v6, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :cond_0
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-interface {v1}, La/cnx;->M()Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    iget-object v8, v0, La/xuv0;->a:La/ywv0;

    .line 41
    .line 42
    const/4 v9, 0x1

    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    iget-object v7, v8, La/ywv0;->j:La/ruv0;

    .line 46
    .line 47
    invoke-virtual {v7}, La/ruv0;->g()Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-nez v7, :cond_2

    .line 52
    .line 53
    invoke-virtual {v2}, La/muv0;->b()Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_2

    .line 58
    .line 59
    iget-boolean v7, v2, La/muv0;->c:Z

    .line 60
    .line 61
    if-eqz v7, :cond_1

    .line 62
    .line 63
    invoke-virtual {v3}, La/h0q0;->l()La/bsv0;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    iget-object v7, v7, La/bsv0;->b:La/esv0;

    .line 68
    .line 69
    if-nez v7, :cond_1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iget-boolean v7, v2, La/muv0;->c:Z

    .line 73
    .line 74
    if-eqz v7, :cond_2

    .line 75
    .line 76
    invoke-virtual {v3}, La/h0q0;->p()La/bxv0;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    iget-object v7, v7, La/bxv0;->f:La/stv0;

    .line 81
    .line 82
    sget-object v10, La/stv0;->c:La/stv0;

    .line 83
    .line 84
    if-ne v7, v10, :cond_2

    .line 85
    .line 86
    iget-boolean v7, v2, La/muv0;->e:Z

    .line 87
    .line 88
    if-eqz v7, :cond_2

    .line 89
    .line 90
    :goto_0
    move v7, v9

    .line 91
    goto :goto_1

    .line 92
    :cond_2
    move v7, v6

    .line 93
    :goto_1
    invoke-interface {v1}, La/cnx;->M()Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-eqz v10, :cond_3

    .line 98
    .line 99
    invoke-virtual {v2}, La/muv0;->b()Z

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    if-nez v10, :cond_3

    .line 104
    .line 105
    move v10, v9

    .line 106
    goto :goto_2

    .line 107
    :cond_3
    move v10, v6

    .line 108
    :goto_2
    invoke-interface {v1}, La/cnx;->M()Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    if-eqz v11, :cond_4

    .line 113
    .line 114
    invoke-virtual {v2}, La/muv0;->b()Z

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    if-eqz v11, :cond_4

    .line 119
    .line 120
    move v11, v9

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    move v11, v6

    .line 123
    :goto_3
    const/4 v12, 0x3

    .line 124
    if-eqz v11, :cond_7

    .line 125
    .line 126
    iget-object v13, v8, La/ywv0;->d:La/glt0;

    .line 127
    .line 128
    invoke-virtual {v13}, La/glt0;->d()La/lxv0;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    sget-object v14, La/jxv0;->a:La/jxv0;

    .line 133
    .line 134
    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    if-eqz v13, :cond_7

    .line 139
    .line 140
    iget-boolean v13, v2, La/muv0;->f:Z

    .line 141
    .line 142
    if-nez v13, :cond_5

    .line 143
    .line 144
    move v13, v6

    .line 145
    goto :goto_4

    .line 146
    :cond_5
    invoke-virtual {v3}, La/h0q0;->l()La/bsv0;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    iget-object v13, v13, La/bsv0;->a:La/esv0;

    .line 151
    .line 152
    instance-of v13, v13, La/dsv0;

    .line 153
    .line 154
    :goto_4
    if-eqz v13, :cond_7

    .line 155
    .line 156
    iget-object v13, v2, La/muv0;->i:La/pz40;

    .line 157
    .line 158
    check-cast v13, La/hgk0;

    .line 159
    .line 160
    invoke-virtual {v13}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v13

    .line 164
    check-cast v13, La/atv0;

    .line 165
    .line 166
    instance-of v13, v13, La/zsv0;

    .line 167
    .line 168
    if-nez v13, :cond_6

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_6
    iget v13, v2, La/muv0;->h:I

    .line 172
    .line 173
    if-ge v13, v12, :cond_7

    .line 174
    .line 175
    move v13, v9

    .line 176
    goto :goto_6

    .line 177
    :cond_7
    :goto_5
    move v13, v6

    .line 178
    :goto_6
    if-eqz v10, :cond_8

    .line 179
    .line 180
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 181
    .line 182
    .line 183
    move-result v14

    .line 184
    goto :goto_7

    .line 185
    :cond_8
    if-eqz v13, :cond_9

    .line 186
    .line 187
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 188
    .line 189
    .line 190
    move-result v14

    .line 191
    goto :goto_7

    .line 192
    :cond_9
    iget-object v14, v8, La/ywv0;->d:La/glt0;

    .line 193
    .line 194
    iget-object v14, v14, La/glt0;->c:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v14, La/t33;

    .line 197
    .line 198
    invoke-virtual {v14}, La/t33;->d()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v14

    .line 202
    check-cast v14, Ljava/lang/Number;

    .line 203
    .line 204
    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    .line 205
    .line 206
    .line 207
    move-result v14

    .line 208
    invoke-static {v14}, La/si30;->b(F)I

    .line 209
    .line 210
    .line 211
    move-result v14

    .line 212
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 213
    .line 214
    .line 215
    move-result v15

    .line 216
    invoke-static {v14, v6, v15}, La/l1e0;->d(III)I

    .line 217
    .line 218
    .line 219
    move-result v14

    .line 220
    :goto_7
    iget-object v15, v0, La/xuv0;->b:La/pz40;

    .line 221
    .line 222
    iget-boolean v12, v0, La/xuv0;->e:Z

    .line 223
    .line 224
    if-nez v12, :cond_a

    .line 225
    .line 226
    move/from16 v16, v6

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_a
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v16

    .line 233
    check-cast v16, Ljava/lang/Number;

    .line 234
    .line 235
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result v16

    .line 239
    :goto_8
    if-eqz v10, :cond_b

    .line 240
    .line 241
    move/from16 v10, v16

    .line 242
    .line 243
    goto :goto_b

    .line 244
    :cond_b
    if-nez v12, :cond_c

    .line 245
    .line 246
    move v10, v6

    .line 247
    goto :goto_a

    .line 248
    :cond_c
    iget-object v10, v8, La/ywv0;->j:La/ruv0;

    .line 249
    .line 250
    invoke-virtual {v10}, La/ruv0;->g()Z

    .line 251
    .line 252
    .line 253
    move-result v12

    .line 254
    if-nez v12, :cond_e

    .line 255
    .line 256
    iget-object v12, v10, La/ruv0;->u:La/c4m0;

    .line 257
    .line 258
    if-eqz v12, :cond_d

    .line 259
    .line 260
    invoke-virtual {v12}, La/pby;->isActive()Z

    .line 261
    .line 262
    .line 263
    move-result v12

    .line 264
    if-ne v12, v9, :cond_d

    .line 265
    .line 266
    goto :goto_9

    .line 267
    :cond_d
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    check-cast v10, Ljava/lang/Number;

    .line 272
    .line 273
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    goto :goto_a

    .line 278
    :cond_e
    :goto_9
    invoke-virtual {v10}, La/ruv0;->e()F

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    invoke-static {v10}, La/si30;->b(F)I

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    int-to-float v10, v10

    .line 287
    iget-object v12, v0, La/xuv0;->c:La/pz40;

    .line 288
    .line 289
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v12

    .line 293
    check-cast v12, Ljava/lang/Number;

    .line 294
    .line 295
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 296
    .line 297
    .line 298
    move-result v12

    .line 299
    int-to-float v12, v12

    .line 300
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v15

    .line 304
    check-cast v15, Ljava/lang/Number;

    .line 305
    .line 306
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 307
    .line 308
    .line 309
    move-result v15

    .line 310
    int-to-float v15, v15

    .line 311
    sub-float/2addr v10, v12

    .line 312
    invoke-static {v10, v15}, Ljava/lang/Math;->max(FF)F

    .line 313
    .line 314
    .line 315
    move-result v10

    .line 316
    invoke-static {v10}, La/si30;->b(F)I

    .line 317
    .line 318
    .line 319
    move-result v10

    .line 320
    :goto_a
    sget-object v12, La/qmk;->a:La/zcl;

    .line 321
    .line 322
    iget-object v0, v0, La/xuv0;->d:La/pz40;

    .line 323
    .line 324
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    check-cast v0, La/ycl;

    .line 329
    .line 330
    iget v0, v0, La/ycl;->a:F

    .line 331
    .line 332
    const/high16 v12, 0x42200000    # 40.0f

    .line 333
    .line 334
    add-float/2addr v12, v0

    .line 335
    invoke-interface {v1, v12}, La/w6k;->T(F)I

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    sub-int v0, v14, v0

    .line 340
    .line 341
    if-gez v0, :cond_f

    .line 342
    .line 343
    move v0, v6

    .line 344
    :cond_f
    if-le v10, v0, :cond_10

    .line 345
    .line 346
    move v10, v0

    .line 347
    :cond_10
    :goto_b
    sub-int/2addr v14, v10

    .line 348
    if-gez v14, :cond_11

    .line 349
    .line 350
    move v14, v6

    .line 351
    :cond_11
    invoke-static/range {p3 .. p4}, La/p4e;->j(J)I

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    sub-int/2addr v0, v10

    .line 356
    if-gez v0, :cond_12

    .line 357
    .line 358
    move v0, v6

    .line 359
    :cond_12
    if-eqz v11, :cond_14

    .line 360
    .line 361
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 362
    .line 363
    .line 364
    move-result v12

    .line 365
    sub-int v12, v12, v16

    .line 366
    .line 367
    if-gez v12, :cond_13

    .line 368
    .line 369
    move v12, v6

    .line 370
    :cond_13
    :goto_c
    move/from16 p0, v10

    .line 371
    .line 372
    goto :goto_d

    .line 373
    :cond_14
    move v12, v14

    .line 374
    goto :goto_c

    .line 375
    :goto_d
    invoke-static {v6, v5, v6, v12}, La/r4e;->a(IIII)J

    .line 376
    .line 377
    .line 378
    move-result-wide v9

    .line 379
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v17

    .line 383
    check-cast v17, Ljava/util/List;

    .line 384
    .line 385
    invoke-static/range {v17 .. v17}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v17

    .line 389
    move-object/from16 v15, v17

    .line 390
    .line 391
    check-cast v15, La/pj30;

    .line 392
    .line 393
    const/16 v24, 0x0

    .line 394
    .line 395
    if-eqz v15, :cond_15

    .line 396
    .line 397
    invoke-interface {v15, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 398
    .line 399
    .line 400
    move-result-object v15

    .line 401
    :goto_e
    const/4 v6, 0x3

    .line 402
    goto :goto_f

    .line 403
    :cond_15
    move-object/from16 v15, v24

    .line 404
    .line 405
    goto :goto_e

    .line 406
    :goto_f
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    check-cast v6, Ljava/util/List;

    .line 411
    .line 412
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v6

    .line 416
    check-cast v6, La/pj30;

    .line 417
    .line 418
    if-eqz v6, :cond_16

    .line 419
    .line 420
    invoke-interface {v6, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    goto :goto_10

    .line 425
    :cond_16
    move-object/from16 v6, v24

    .line 426
    .line 427
    :goto_10
    if-eqz v11, :cond_17

    .line 428
    .line 429
    move-object/from16 v25, v3

    .line 430
    .line 431
    :goto_11
    move/from16 v22, v12

    .line 432
    .line 433
    move-object/from16 v26, v15

    .line 434
    .line 435
    const/4 v15, 0x1

    .line 436
    goto :goto_14

    .line 437
    :cond_17
    if-eqz v6, :cond_18

    .line 438
    .line 439
    iget v12, v6, La/pu90;->b:I

    .line 440
    .line 441
    goto :goto_12

    .line 442
    :cond_18
    const/4 v12, 0x0

    .line 443
    :goto_12
    sub-int v12, v14, v12

    .line 444
    .line 445
    move-object/from16 v25, v3

    .line 446
    .line 447
    if-eqz v15, :cond_19

    .line 448
    .line 449
    iget v3, v15, La/pu90;->b:I

    .line 450
    .line 451
    goto :goto_13

    .line 452
    :cond_19
    const/4 v3, 0x0

    .line 453
    :goto_13
    sub-int/2addr v12, v3

    .line 454
    const/4 v3, 0x0

    .line 455
    invoke-static {v12, v3, v14}, La/l1e0;->d(III)I

    .line 456
    .line 457
    .line 458
    move-result v12

    .line 459
    goto :goto_11

    .line 460
    :goto_14
    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    move-object/from16 v12, v26

    .line 465
    .line 466
    check-cast v3, Ljava/util/List;

    .line 467
    .line 468
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    check-cast v3, La/pj30;

    .line 473
    .line 474
    if-eqz v3, :cond_1a

    .line 475
    .line 476
    const/16 v21, 0x0

    .line 477
    .line 478
    const/16 v23, 0x7

    .line 479
    .line 480
    const/16 v19, 0x0

    .line 481
    .line 482
    const/16 v20, 0x0

    .line 483
    .line 484
    move-wide/from16 v17, v9

    .line 485
    .line 486
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 487
    .line 488
    .line 489
    move-result-wide v9

    .line 490
    invoke-interface {v3, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    goto :goto_15

    .line 495
    :cond_1a
    move-object/from16 v3, v24

    .line 496
    .line 497
    :goto_15
    if-eqz v12, :cond_1b

    .line 498
    .line 499
    iget v9, v12, La/pu90;->b:I

    .line 500
    .line 501
    goto :goto_16

    .line 502
    :cond_1b
    const/4 v9, 0x0

    .line 503
    :goto_16
    if-eqz v3, :cond_1c

    .line 504
    .line 505
    iget v10, v3, La/pu90;->b:I

    .line 506
    .line 507
    goto :goto_17

    .line 508
    :cond_1c
    const/4 v10, 0x0

    .line 509
    :goto_17
    add-int/2addr v9, v10

    .line 510
    if-eqz v6, :cond_1d

    .line 511
    .line 512
    iget v10, v6, La/pu90;->b:I

    .line 513
    .line 514
    goto :goto_18

    .line 515
    :cond_1d
    const/4 v10, 0x0

    .line 516
    :goto_18
    add-int/2addr v9, v10

    .line 517
    if-eqz v12, :cond_1e

    .line 518
    .line 519
    iget v10, v12, La/pu90;->b:I

    .line 520
    .line 521
    goto :goto_19

    .line 522
    :cond_1e
    const/4 v10, 0x0

    .line 523
    :goto_19
    invoke-static {v10, v14}, Ljava/lang/Math;->min(II)I

    .line 524
    .line 525
    .line 526
    move-result v10

    .line 527
    if-eqz v6, :cond_1f

    .line 528
    .line 529
    iget v15, v6, La/pu90;->b:I

    .line 530
    .line 531
    goto :goto_1a

    .line 532
    :cond_1f
    const/4 v15, 0x0

    .line 533
    :goto_1a
    sub-int v10, v14, v10

    .line 534
    .line 535
    move-object/from16 v30, v6

    .line 536
    .line 537
    if-gez v10, :cond_20

    .line 538
    .line 539
    const/4 v6, 0x0

    .line 540
    goto :goto_1b

    .line 541
    :cond_20
    move v6, v10

    .line 542
    :goto_1b
    invoke-static {v15, v6}, Ljava/lang/Math;->min(II)I

    .line 543
    .line 544
    .line 545
    move-result v6

    .line 546
    if-eqz v3, :cond_21

    .line 547
    .line 548
    iget v15, v3, La/pu90;->b:I

    .line 549
    .line 550
    goto :goto_1c

    .line 551
    :cond_21
    const/4 v15, 0x0

    .line 552
    :goto_1c
    sub-int v6, v10, v6

    .line 553
    .line 554
    if-gez v6, :cond_22

    .line 555
    .line 556
    const/4 v10, 0x0

    .line 557
    goto :goto_1d

    .line 558
    :cond_22
    move v10, v6

    .line 559
    :goto_1d
    invoke-static {v15, v10}, Ljava/lang/Math;->min(II)I

    .line 560
    .line 561
    .line 562
    move-result v10

    .line 563
    if-eqz v11, :cond_23

    .line 564
    .line 565
    sub-int/2addr v6, v10

    .line 566
    if-gez v6, :cond_24

    .line 567
    .line 568
    :goto_1e
    const/4 v6, 0x0

    .line 569
    goto :goto_1f

    .line 570
    :cond_23
    sub-int v6, v14, v9

    .line 571
    .line 572
    if-gez v6, :cond_24

    .line 573
    .line 574
    goto :goto_1e

    .line 575
    :cond_24
    :goto_1f
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 576
    .line 577
    .line 578
    move-result v10

    .line 579
    sub-int v10, v10, v16

    .line 580
    .line 581
    if-gez v10, :cond_25

    .line 582
    .line 583
    const/4 v10, 0x0

    .line 584
    :cond_25
    sub-int/2addr v10, v9

    .line 585
    if-gez v10, :cond_26

    .line 586
    .line 587
    const/4 v10, 0x0

    .line 588
    :cond_26
    invoke-interface {v1}, La/cnx;->M()Z

    .line 589
    .line 590
    .line 591
    move-result v11

    .line 592
    if-eqz v11, :cond_27

    .line 593
    .line 594
    invoke-virtual {v2}, La/muv0;->b()Z

    .line 595
    .line 596
    .line 597
    move-result v11

    .line 598
    if-nez v11, :cond_27

    .line 599
    .line 600
    move v6, v10

    .line 601
    :cond_27
    const/4 v11, 0x2

    .line 602
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v4

    .line 606
    check-cast v4, Ljava/util/List;

    .line 607
    .line 608
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    check-cast v4, La/pj30;

    .line 613
    .line 614
    invoke-static/range {p3 .. p4}, La/p4e;->f(J)Z

    .line 615
    .line 616
    .line 617
    move-result v11

    .line 618
    if-eqz v11, :cond_28

    .line 619
    .line 620
    move v11, v6

    .line 621
    :goto_20
    move-object/from16 v26, v12

    .line 622
    .line 623
    const/4 v15, 0x0

    .line 624
    goto :goto_21

    .line 625
    :cond_28
    const/4 v11, 0x0

    .line 626
    goto :goto_20

    .line 627
    :goto_21
    invoke-static {v15, v5, v11, v6}, La/r4e;->a(IIII)J

    .line 628
    .line 629
    .line 630
    move-result-wide v11

    .line 631
    invoke-interface {v4, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 632
    .line 633
    .line 634
    move-result-object v4

    .line 635
    iget v11, v4, La/pu90;->b:I

    .line 636
    .line 637
    int-to-float v6, v6

    .line 638
    const/high16 v12, 0x3f800000    # 1.0f

    .line 639
    .line 640
    cmpl-float v17, v6, v12

    .line 641
    .line 642
    if-lez v17, :cond_29

    .line 643
    .line 644
    int-to-float v11, v11

    .line 645
    sub-float/2addr v6, v12

    .line 646
    cmpl-float v6, v11, v6

    .line 647
    .line 648
    if-ltz v6, :cond_29

    .line 649
    .line 650
    const/4 v6, 0x1

    .line 651
    goto :goto_22

    .line 652
    :cond_29
    move v6, v15

    .line 653
    :goto_22
    invoke-interface {v1}, La/cnx;->M()Z

    .line 654
    .line 655
    .line 656
    move-result v11

    .line 657
    if-eqz v11, :cond_2b

    .line 658
    .line 659
    if-eqz v7, :cond_2a

    .line 660
    .line 661
    iput-boolean v6, v2, La/muv0;->e:Z

    .line 662
    .line 663
    const/4 v11, 0x1

    .line 664
    goto :goto_23

    .line 665
    :cond_2a
    const/4 v11, 0x1

    .line 666
    iput-boolean v11, v2, La/muv0;->c:Z

    .line 667
    .line 668
    iput-boolean v6, v2, La/muv0;->e:Z

    .line 669
    .line 670
    :goto_23
    if-eqz v13, :cond_2b

    .line 671
    .line 672
    iget v13, v2, La/muv0;->h:I

    .line 673
    .line 674
    add-int/2addr v13, v11

    .line 675
    iput v13, v2, La/muv0;->h:I

    .line 676
    .line 677
    :cond_2b
    iget v11, v4, La/pu90;->b:I

    .line 678
    .line 679
    add-int/2addr v11, v9

    .line 680
    invoke-static {v11, v0, v14}, La/l1e0;->d(III)I

    .line 681
    .line 682
    .line 683
    move-result v31

    .line 684
    invoke-interface {v1}, La/cnx;->M()Z

    .line 685
    .line 686
    .line 687
    move-result v11

    .line 688
    if-eqz v11, :cond_31

    .line 689
    .line 690
    invoke-virtual {v2}, La/muv0;->b()Z

    .line 691
    .line 692
    .line 693
    move-result v11

    .line 694
    invoke-virtual {v2}, La/muv0;->a()Ljava/lang/Integer;

    .line 695
    .line 696
    .line 697
    move-result-object v13

    .line 698
    if-eqz v13, :cond_2d

    .line 699
    .line 700
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 701
    .line 702
    .line 703
    move-result v14

    .line 704
    iget-object v8, v8, La/ywv0;->c:La/fht0;

    .line 705
    .line 706
    invoke-virtual {v8}, La/fht0;->f()La/cvv0;

    .line 707
    .line 708
    .line 709
    move-result-object v8

    .line 710
    if-eqz v8, :cond_2c

    .line 711
    .line 712
    invoke-static {v8}, La/ktt0;->n(La/cvv0;)I

    .line 713
    .line 714
    .line 715
    move-result v8

    .line 716
    goto :goto_24

    .line 717
    :cond_2c
    const v8, 0x7fffffff

    .line 718
    .line 719
    .line 720
    :goto_24
    add-int/2addr v14, v9

    .line 721
    add-int v14, v14, v16

    .line 722
    .line 723
    move/from16 p2, v12

    .line 724
    .line 725
    const/high16 v12, 0x42400000    # 48.0f

    .line 726
    .line 727
    invoke-interface {v1, v12}, La/w6k;->T(F)I

    .line 728
    .line 729
    .line 730
    move-result v12

    .line 731
    sub-int/2addr v8, v12

    .line 732
    if-gt v14, v8, :cond_2e

    .line 733
    .line 734
    move-object/from16 v24, v13

    .line 735
    .line 736
    goto :goto_25

    .line 737
    :cond_2d
    move/from16 p2, v12

    .line 738
    .line 739
    :cond_2e
    :goto_25
    iget v8, v4, La/pu90;->b:I

    .line 740
    .line 741
    if-eqz v11, :cond_2f

    .line 742
    .line 743
    if-eqz v24, :cond_32

    .line 744
    .line 745
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Integer;->intValue()I

    .line 746
    .line 747
    .line 748
    move-result v10

    .line 749
    goto :goto_26

    .line 750
    :cond_2f
    int-to-float v11, v8

    .line 751
    int-to-float v12, v10

    .line 752
    sub-float v12, v12, p2

    .line 753
    .line 754
    cmpl-float v11, v11, v12

    .line 755
    .line 756
    if-ltz v11, :cond_30

    .line 757
    .line 758
    goto :goto_26

    .line 759
    :cond_30
    move v10, v8

    .line 760
    goto :goto_26

    .line 761
    :cond_31
    iget v10, v4, La/pu90;->b:I

    .line 762
    .line 763
    :cond_32
    :goto_26
    invoke-interface {v1}, La/cnx;->M()Z

    .line 764
    .line 765
    .line 766
    move-result v8

    .line 767
    if-eqz v8, :cond_34

    .line 768
    .line 769
    add-int/2addr v9, v10

    .line 770
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 771
    .line 772
    .line 773
    move-result v8

    .line 774
    sub-int v8, v8, v16

    .line 775
    .line 776
    if-gez v8, :cond_33

    .line 777
    .line 778
    move v8, v15

    .line 779
    :cond_33
    invoke-static {v9, v0, v8}, La/l1e0;->d(III)I

    .line 780
    .line 781
    .line 782
    move-result v0

    .line 783
    goto :goto_27

    .line 784
    :cond_34
    move/from16 v0, v31

    .line 785
    .line 786
    :goto_27
    invoke-interface {v1}, La/cnx;->M()Z

    .line 787
    .line 788
    .line 789
    move-result v8

    .line 790
    if-eqz v8, :cond_38

    .line 791
    .line 792
    if-eqz v7, :cond_38

    .line 793
    .line 794
    if-eqz v6, :cond_38

    .line 795
    .line 796
    iget-object v6, v2, La/muv0;->b:La/fht0;

    .line 797
    .line 798
    invoke-virtual {v6}, La/fht0;->f()La/cvv0;

    .line 799
    .line 800
    .line 801
    move-result-object v6

    .line 802
    if-nez v6, :cond_35

    .line 803
    .line 804
    move v2, v15

    .line 805
    goto :goto_28

    .line 806
    :cond_35
    iget-boolean v2, v2, La/muv0;->c:Z

    .line 807
    .line 808
    if-eqz v2, :cond_36

    .line 809
    .line 810
    invoke-virtual/range {v25 .. v25}, La/h0q0;->l()La/bsv0;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    iget-object v2, v2, La/bsv0;->b:La/esv0;

    .line 815
    .line 816
    if-nez v2, :cond_36

    .line 817
    .line 818
    invoke-static {v6}, La/ktt0;->n(La/cvv0;)I

    .line 819
    .line 820
    .line 821
    move-result v2

    .line 822
    invoke-static {v6}, La/ktt0;->k(La/cvv0;)I

    .line 823
    .line 824
    .line 825
    move-result v6

    .line 826
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    .line 827
    .line 828
    .line 829
    move-result v2

    .line 830
    goto :goto_28

    .line 831
    :cond_36
    invoke-static {v6}, La/ktt0;->k(La/cvv0;)I

    .line 832
    .line 833
    .line 834
    move-result v2

    .line 835
    :goto_28
    sub-int v2, v2, v16

    .line 836
    .line 837
    if-gez v2, :cond_37

    .line 838
    .line 839
    move v2, v15

    .line 840
    :cond_37
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 841
    .line 842
    .line 843
    move-result v0

    .line 844
    :cond_38
    move-object/from16 v12, v26

    .line 845
    .line 846
    if-eqz v26, :cond_39

    .line 847
    .line 848
    iget v2, v12, La/pu90;->b:I

    .line 849
    .line 850
    goto :goto_29

    .line 851
    :cond_39
    move v2, v15

    .line 852
    :goto_29
    if-eqz v3, :cond_3a

    .line 853
    .line 854
    iget v6, v3, La/pu90;->b:I

    .line 855
    .line 856
    goto :goto_2a

    .line 857
    :cond_3a
    move v6, v15

    .line 858
    :goto_2a
    add-int v29, v2, v6

    .line 859
    .line 860
    invoke-interface {v1}, La/cnx;->M()Z

    .line 861
    .line 862
    .line 863
    move-result v2

    .line 864
    if-eqz v2, :cond_3b

    .line 865
    .line 866
    goto :goto_2b

    .line 867
    :cond_3b
    move/from16 v16, p0

    .line 868
    .line 869
    :goto_2b
    add-int v0, v0, v16

    .line 870
    .line 871
    new-instance v25, La/jm10;

    .line 872
    .line 873
    move-object/from16 v27, v3

    .line 874
    .line 875
    move-object/from16 v28, v4

    .line 876
    .line 877
    move-object/from16 v26, v12

    .line 878
    .line 879
    invoke-direct/range {v25 .. v31}, La/jm10;-><init>(La/pu90;La/pu90;La/pu90;ILa/pu90;I)V

    .line 880
    .line 881
    .line 882
    move-object/from16 v2, v25

    .line 883
    .line 884
    invoke-static {v1, v5, v0, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    return-object v0
.end method
