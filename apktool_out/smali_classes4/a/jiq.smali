.class public final synthetic La/jiq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/jge0;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:La/x03;

.field public final synthetic d:La/hiq;

.field public final synthetic e:La/liq;

.field public final synthetic f:Z

.field public final synthetic g:La/w03;

.field public final synthetic h:La/w03;

.field public final synthetic i:Ljava/util/ArrayList;

.field public final synthetic j:J


# direct methods
.method public synthetic constructor <init>(La/jge0;Ljava/util/ArrayList;La/x03;La/hiq;La/liq;ZLa/w03;La/w03;Ljava/util/ArrayList;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jiq;->a:La/jge0;

    iput-object p2, p0, La/jiq;->b:Ljava/util/ArrayList;

    iput-object p3, p0, La/jiq;->c:La/x03;

    iput-object p4, p0, La/jiq;->d:La/hiq;

    iput-object p5, p0, La/jiq;->e:La/liq;

    iput-boolean p6, p0, La/jiq;->f:Z

    iput-object p7, p0, La/jiq;->g:La/w03;

    iput-object p8, p0, La/jiq;->h:La/w03;

    iput-object p9, p0, La/jiq;->i:Ljava/util/ArrayList;

    iput-wide p10, p0, La/jiq;->j:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v10, v0, La/jiq;->c:La/x03;

    .line 4
    .line 5
    iget-object v12, v0, La/jiq;->g:La/w03;

    .line 6
    .line 7
    iget-object v13, v0, La/jiq;->h:La/w03;

    .line 8
    .line 9
    move-object/from16 v1, p1

    .line 10
    .line 11
    check-cast v1, La/fhl;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v14, v0, La/jiq;->d:La/hiq;

    .line 17
    .line 18
    iget v2, v14, La/hiq;->b:I

    .line 19
    .line 20
    iget-object v15, v0, La/jiq;->e:La/liq;

    .line 21
    .line 22
    iget-object v3, v15, La/liq;->e:La/wev;

    .line 23
    .line 24
    sget-object v4, La/qmk;->a:La/zcl;

    .line 25
    .line 26
    const/high16 v4, 0x3f800000    # 1.0f

    .line 27
    .line 28
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    const/high16 v5, 0x41600000    # 14.0f

    .line 33
    .line 34
    invoke-interface {v1, v5}, La/w6k;->w0(F)F

    .line 35
    .line 36
    .line 37
    move-result v16

    .line 38
    iget-object v5, v0, La/jiq;->a:La/jge0;

    .line 39
    .line 40
    iget v6, v5, La/jge0;->d:F

    .line 41
    .line 42
    iget v7, v5, La/jge0;->c:F

    .line 43
    .line 44
    iget v9, v5, La/jge0;->b:F

    .line 45
    .line 46
    sub-float v11, v6, v9

    .line 47
    .line 48
    add-int/lit8 v4, v2, -0x1

    .line 49
    .line 50
    int-to-float v4, v4

    .line 51
    div-float v17, v11, v4

    .line 52
    .line 53
    div-int/lit8 v2, v2, 0x2

    .line 54
    .line 55
    iget-object v4, v0, La/jiq;->b:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v18

    .line 61
    const/16 v19, 0x0

    .line 62
    .line 63
    move/from16 v4, v19

    .line 64
    .line 65
    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const/16 v20, 0x0

    .line 70
    .line 71
    move/from16 v21, v9

    .line 72
    .line 73
    iget-boolean v9, v0, La/jiq;->f:Z

    .line 74
    .line 75
    const/16 v22, 0x0

    .line 76
    .line 77
    const/high16 v23, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/16 v24, 0x20

    .line 80
    .line 81
    const-wide v25, 0xffffffffL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    if-eqz v11, :cond_4

    .line 87
    .line 88
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    add-int/lit8 v27, v4, 0x1

    .line 93
    .line 94
    if-ltz v4, :cond_3

    .line 95
    .line 96
    check-cast v11, La/a9q0;

    .line 97
    .line 98
    move-object/from16 v28, v1

    .line 99
    .line 100
    if-ne v4, v2, :cond_1

    .line 101
    .line 102
    sget-object v1, La/wev;->a:La/wev;

    .line 103
    .line 104
    if-eq v3, v1, :cond_0

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_0
    move/from16 v22, v2

    .line 108
    .line 109
    move-object/from16 v23, v3

    .line 110
    .line 111
    move-object/from16 v33, v5

    .line 112
    .line 113
    move-object/from16 v31, v12

    .line 114
    .line 115
    move-object/from16 v30, v13

    .line 116
    .line 117
    move-object/from16 v32, v14

    .line 118
    .line 119
    move/from16 v29, v21

    .line 120
    .line 121
    move-object/from16 v1, v28

    .line 122
    .line 123
    move/from16 v21, v6

    .line 124
    .line 125
    move/from16 v28, v7

    .line 126
    .line 127
    goto/16 :goto_4

    .line 128
    .line 129
    :cond_1
    :goto_1
    int-to-float v1, v4

    .line 130
    mul-float v1, v1, v17

    .line 131
    .line 132
    add-float v20, v1, v21

    .line 133
    .line 134
    if-eqz v9, :cond_2

    .line 135
    .line 136
    move/from16 v1, v23

    .line 137
    .line 138
    :goto_2
    move/from16 v29, v2

    .line 139
    .line 140
    move-object v4, v3

    .line 141
    goto :goto_3

    .line 142
    :cond_2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :goto_3
    invoke-interface/range {v28 .. v28}, La/fhl;->E0()J

    .line 146
    .line 147
    .line 148
    move-result-wide v2

    .line 149
    move/from16 v30, v9

    .line 150
    .line 151
    invoke-interface/range {v28 .. v28}, La/fhl;->A0()La/nr;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    move-object/from16 v32, v11

    .line 156
    .line 157
    move-object/from16 v31, v12

    .line 158
    .line 159
    invoke-virtual {v9}, La/nr;->p()J

    .line 160
    .line 161
    .line 162
    move-result-wide v11

    .line 163
    invoke-virtual {v9}, La/nr;->i()La/x5a;

    .line 164
    .line 165
    .line 166
    move-result-object v23

    .line 167
    invoke-interface/range {v23 .. v23}, La/x5a;->l()V

    .line 168
    .line 169
    .line 170
    move-object/from16 v23, v4

    .line 171
    .line 172
    :try_start_0
    iget-object v4, v9, La/nr;->b:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v4, La/fvt0;

    .line 175
    .line 176
    move-object/from16 v33, v5

    .line 177
    .line 178
    const/high16 v5, 0x3f800000    # 1.0f

    .line 179
    .line 180
    invoke-virtual {v4, v1, v5, v2, v3}, La/fvt0;->z(FFJ)V

    .line 181
    .line 182
    .line 183
    sget-object v1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 184
    .line 185
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 186
    .line 187
    .line 188
    move-result-wide v2

    .line 189
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    move v4, v6

    .line 194
    int-to-long v5, v1

    .line 195
    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    move-wide/from16 v34, v2

    .line 200
    .line 201
    int-to-long v1, v1

    .line 202
    shl-long v5, v5, v24

    .line 203
    .line 204
    and-long v1, v1, v25

    .line 205
    .line 206
    or-long/2addr v1, v5

    .line 207
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    int-to-long v5, v3

    .line 212
    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 213
    .line 214
    .line 215
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 216
    move-wide/from16 v36, v1

    .line 217
    .line 218
    int-to-long v1, v3

    .line 219
    shl-long v5, v5, v24

    .line 220
    .line 221
    and-long v1, v1, v25

    .line 222
    .line 223
    or-long/2addr v1, v5

    .line 224
    move-object v3, v9

    .line 225
    const/4 v9, 0x0

    .line 226
    move-wide v5, v11

    .line 227
    const/16 v11, 0x1d0

    .line 228
    .line 229
    move-object/from16 v24, v3

    .line 230
    .line 231
    move/from16 v22, v29

    .line 232
    .line 233
    move/from16 v0, v30

    .line 234
    .line 235
    move-object/from16 v12, v32

    .line 236
    .line 237
    move-object/from16 v30, v13

    .line 238
    .line 239
    move-object/from16 v32, v14

    .line 240
    .line 241
    move/from16 v29, v21

    .line 242
    .line 243
    move/from16 v21, v4

    .line 244
    .line 245
    move-wide v13, v5

    .line 246
    move-wide/from16 v4, v36

    .line 247
    .line 248
    move-object/from16 v43, v28

    .line 249
    .line 250
    move/from16 v28, v7

    .line 251
    .line 252
    move-wide v6, v1

    .line 253
    move-object/from16 v1, v43

    .line 254
    .line 255
    move-wide/from16 v2, v34

    .line 256
    .line 257
    :try_start_1
    invoke-static/range {v1 .. v11}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v24 .. v24}, La/nr;->i()La/x5a;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-interface {v2}, La/x5a;->i()V

    .line 265
    .line 266
    .line 267
    move-object/from16 v3, v24

    .line 268
    .line 269
    invoke-virtual {v3, v13, v14}, La/nr;->H(J)V

    .line 270
    .line 271
    .line 272
    add-float v7, v28, v16

    .line 273
    .line 274
    iget-wide v2, v12, La/a9q0;->c:J

    .line 275
    .line 276
    and-long v2, v2, v25

    .line 277
    .line 278
    long-to-int v2, v2

    .line 279
    div-int/lit8 v2, v2, 0x2

    .line 280
    .line 281
    int-to-float v2, v2

    .line 282
    sub-float v2, v20, v2

    .line 283
    .line 284
    invoke-static {v1, v12, v7, v2, v0}, La/ahy;->X(La/fhl;La/a9q0;FFZ)V

    .line 285
    .line 286
    .line 287
    :goto_4
    move-object/from16 v0, p0

    .line 288
    .line 289
    move/from16 v6, v21

    .line 290
    .line 291
    move/from16 v2, v22

    .line 292
    .line 293
    move-object/from16 v3, v23

    .line 294
    .line 295
    move/from16 v4, v27

    .line 296
    .line 297
    move/from16 v7, v28

    .line 298
    .line 299
    move/from16 v9, v29

    .line 300
    .line 301
    move-object/from16 v13, v30

    .line 302
    .line 303
    move-object/from16 v12, v31

    .line 304
    .line 305
    move-object/from16 v14, v32

    .line 306
    .line 307
    move-object/from16 v5, v33

    .line 308
    .line 309
    goto/16 :goto_0

    .line 310
    .line 311
    :catchall_0
    move-exception v0

    .line 312
    move-object/from16 v3, v24

    .line 313
    .line 314
    goto :goto_5

    .line 315
    :catchall_1
    move-exception v0

    .line 316
    move-object v3, v9

    .line 317
    move-wide v13, v11

    .line 318
    :goto_5
    invoke-static {v3, v13, v14}, Lc;->g(La/nr;J)V

    .line 319
    .line 320
    .line 321
    throw v0

    .line 322
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 323
    .line 324
    .line 325
    throw v20

    .line 326
    :cond_4
    move-object/from16 v33, v5

    .line 327
    .line 328
    move/from16 v28, v7

    .line 329
    .line 330
    move v0, v9

    .line 331
    move-object/from16 v31, v12

    .line 332
    .line 333
    move-object/from16 v30, v13

    .line 334
    .line 335
    move-object/from16 v32, v14

    .line 336
    .line 337
    move/from16 v29, v21

    .line 338
    .line 339
    move/from16 v21, v6

    .line 340
    .line 341
    iget-object v2, v15, La/liq;->c:La/kiq;

    .line 342
    .line 343
    iget-wide v3, v2, La/kiq;->c:J

    .line 344
    .line 345
    iget-object v2, v15, La/liq;->d:La/kiq;

    .line 346
    .line 347
    iget-wide v8, v2, La/kiq;->c:J

    .line 348
    .line 349
    sget-object v2, La/qmk;->a:La/zcl;

    .line 350
    .line 351
    const/high16 v5, 0x3f800000    # 1.0f

    .line 352
    .line 353
    invoke-interface {v1, v5}, La/w6k;->w0(F)F

    .line 354
    .line 355
    .line 356
    move-result v11

    .line 357
    if-eqz v0, :cond_5

    .line 358
    .line 359
    move/from16 v2, v23

    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 363
    .line 364
    :goto_6
    invoke-interface {v1}, La/fhl;->E0()J

    .line 365
    .line 366
    .line 367
    move-result-wide v5

    .line 368
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 369
    .line 370
    .line 371
    move-result-object v7

    .line 372
    invoke-virtual {v7}, La/nr;->p()J

    .line 373
    .line 374
    .line 375
    move-result-wide v12

    .line 376
    invoke-virtual {v7}, La/nr;->i()La/x5a;

    .line 377
    .line 378
    .line 379
    move-result-object v10

    .line 380
    invoke-interface {v10}, La/x5a;->l()V

    .line 381
    .line 382
    .line 383
    :try_start_2
    iget-object v10, v7, La/nr;->b:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v10, La/fvt0;

    .line 386
    .line 387
    const/high16 v14, 0x3f800000    # 1.0f

    .line 388
    .line 389
    invoke-virtual {v10, v2, v14, v5, v6}, La/fvt0;->z(FFJ)V

    .line 390
    .line 391
    .line 392
    move-object/from16 v2, v33

    .line 393
    .line 394
    iget v5, v2, La/jge0;->a:F

    .line 395
    .line 396
    add-float v35, v29, v11

    .line 397
    .line 398
    iget v6, v2, La/jge0;->c:F

    .line 399
    .line 400
    invoke-virtual {v2}, La/jge0;->e()J

    .line 401
    .line 402
    .line 403
    move-result-wide v14

    .line 404
    and-long v14, v14, v25

    .line 405
    .line 406
    long-to-int v10, v14

    .line 407
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 408
    .line 409
    .line 410
    move-result v37

    .line 411
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 412
    .line 413
    .line 414
    move-result-object v10

    .line 415
    invoke-virtual {v10}, La/nr;->p()J

    .line 416
    .line 417
    .line 418
    move-result-wide v14

    .line 419
    invoke-virtual {v10}, La/nr;->i()La/x5a;

    .line 420
    .line 421
    .line 422
    move-result-object v16

    .line 423
    invoke-interface/range {v16 .. v16}, La/x5a;->l()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_b

    .line 424
    .line 425
    .line 426
    move-object/from16 v17, v1

    .line 427
    .line 428
    :try_start_3
    iget-object v1, v10, La/nr;->b:Ljava/lang/Object;

    .line 429
    .line 430
    move-object/from16 v33, v1

    .line 431
    .line 432
    check-cast v33, La/fvt0;

    .line 433
    .line 434
    const/16 v38, 0x1

    .line 435
    .line 436
    move/from16 v34, v5

    .line 437
    .line 438
    move/from16 v36, v6

    .line 439
    .line 440
    invoke-virtual/range {v33 .. v38}, La/fvt0;->k(FFFFI)V

    .line 441
    .line 442
    .line 443
    new-instance v6, La/vtm0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    .line 444
    .line 445
    move-wide/from16 v33, v14

    .line 446
    .line 447
    const/4 v15, 0x0

    .line 448
    const/16 v16, 0x1e

    .line 449
    .line 450
    move-wide v13, v12

    .line 451
    const/4 v12, 0x0

    .line 452
    move-wide/from16 v35, v13

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const/4 v14, 0x0

    .line 456
    move-object v1, v10

    .line 457
    move-object v10, v6

    .line 458
    :try_start_4
    invoke-direct/range {v10 .. v16}, La/vtm0;-><init>(FFIILa/x03;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    .line 459
    .line 460
    .line 461
    move-object v5, v7

    .line 462
    const/16 v7, 0x34

    .line 463
    .line 464
    move-object v10, v5

    .line 465
    const/4 v5, 0x0

    .line 466
    move-object v12, v1

    .line 467
    move-object v15, v2

    .line 468
    move-object/from16 v1, v17

    .line 469
    .line 470
    move-object/from16 v2, v31

    .line 471
    .line 472
    move-wide/from16 v13, v33

    .line 473
    .line 474
    :try_start_5
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 475
    .line 476
    .line 477
    const/high16 v2, 0x3f000000    # 0.5f

    .line 478
    .line 479
    invoke-static {v2, v3, v4}, La/y3d;->c(FJ)J

    .line 480
    .line 481
    .line 482
    move-result-wide v3

    .line 483
    const/4 v6, 0x0

    .line 484
    const/16 v7, 0x3c

    .line 485
    .line 486
    const/4 v5, 0x0

    .line 487
    move-wide/from16 v17, v8

    .line 488
    .line 489
    move v8, v2

    .line 490
    move-object/from16 v2, v30

    .line 491
    .line 492
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 493
    .line 494
    .line 495
    :try_start_6
    invoke-virtual {v12}, La/nr;->i()La/x5a;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    invoke-interface {v2}, La/x5a;->i()V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v13, v14}, La/nr;->H(J)V

    .line 503
    .line 504
    .line 505
    iget v2, v15, La/jge0;->a:F

    .line 506
    .line 507
    invoke-virtual {v15}, La/jge0;->e()J

    .line 508
    .line 509
    .line 510
    move-result-wide v3

    .line 511
    and-long v3, v3, v25

    .line 512
    .line 513
    long-to-int v3, v3

    .line 514
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 515
    .line 516
    .line 517
    move-result v39

    .line 518
    iget v3, v15, La/jge0;->c:F

    .line 519
    .line 520
    add-float v41, v21, v11

    .line 521
    .line 522
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 523
    .line 524
    .line 525
    move-result-object v9

    .line 526
    invoke-virtual {v9}, La/nr;->p()J

    .line 527
    .line 528
    .line 529
    move-result-wide v4

    .line 530
    invoke-virtual {v9}, La/nr;->i()La/x5a;

    .line 531
    .line 532
    .line 533
    move-result-object v6

    .line 534
    invoke-interface {v6}, La/x5a;->l()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 535
    .line 536
    .line 537
    :try_start_7
    iget-object v6, v9, La/nr;->b:Ljava/lang/Object;

    .line 538
    .line 539
    move-object/from16 v37, v6

    .line 540
    .line 541
    check-cast v37, La/fvt0;

    .line 542
    .line 543
    const/16 v42, 0x1

    .line 544
    .line 545
    move/from16 v38, v2

    .line 546
    .line 547
    move/from16 v40, v3

    .line 548
    .line 549
    invoke-virtual/range {v37 .. v42}, La/fvt0;->k(FFFFI)V

    .line 550
    .line 551
    .line 552
    new-instance v6, La/vtm0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 553
    .line 554
    move-object/from16 v33, v15

    .line 555
    .line 556
    const/4 v15, 0x0

    .line 557
    const/16 v16, 0x1e

    .line 558
    .line 559
    const/4 v12, 0x0

    .line 560
    const/4 v13, 0x0

    .line 561
    const/4 v14, 0x0

    .line 562
    move-object v2, v10

    .line 563
    move-object v10, v6

    .line 564
    :try_start_8
    invoke-direct/range {v10 .. v16}, La/vtm0;-><init>(FFIILa/x03;I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 565
    .line 566
    .line 567
    const/16 v7, 0x34

    .line 568
    .line 569
    move-wide v3, v4

    .line 570
    const/4 v5, 0x0

    .line 571
    move-object v10, v2

    .line 572
    move-wide v13, v3

    .line 573
    move-wide/from16 v3, v17

    .line 574
    .line 575
    move-object/from16 v2, v31

    .line 576
    .line 577
    move-object/from16 v15, v33

    .line 578
    .line 579
    move-wide/from16 v11, v35

    .line 580
    .line 581
    :try_start_9
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 582
    .line 583
    .line 584
    invoke-static {v8, v3, v4}, La/y3d;->c(FJ)J

    .line 585
    .line 586
    .line 587
    move-result-wide v3

    .line 588
    const/4 v6, 0x0

    .line 589
    const/16 v7, 0x3c

    .line 590
    .line 591
    const/4 v5, 0x0

    .line 592
    move-object/from16 v2, v30

    .line 593
    .line 594
    invoke-static/range {v1 .. v7}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 595
    .line 596
    .line 597
    :try_start_a
    invoke-virtual {v9}, La/nr;->i()La/x5a;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    invoke-interface {v2}, La/x5a;->i()V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v9, v13, v14}, La/nr;->H(J)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 605
    .line 606
    .line 607
    invoke-static {v10, v11, v12}, Lc;->g(La/nr;J)V

    .line 608
    .line 609
    .line 610
    move-object/from16 v2, v32

    .line 611
    .line 612
    iget-wide v2, v2, La/hiq;->c:J

    .line 613
    .line 614
    move-object/from16 v4, p0

    .line 615
    .line 616
    iget-object v5, v4, La/jiq;->i:Ljava/util/ArrayList;

    .line 617
    .line 618
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 619
    .line 620
    .line 621
    move-result-object v5

    .line 622
    :goto_7
    move/from16 v6, v19

    .line 623
    .line 624
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 625
    .line 626
    .line 627
    move-result v7

    .line 628
    if-eqz v7, :cond_8

    .line 629
    .line 630
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v7

    .line 634
    add-int/lit8 v19, v6, 0x1

    .line 635
    .line 636
    if-ltz v6, :cond_7

    .line 637
    .line 638
    check-cast v7, La/a9q0;

    .line 639
    .line 640
    int-to-long v8, v6

    .line 641
    iget-wide v10, v4, La/jiq;->j:J

    .line 642
    .line 643
    mul-long/2addr v8, v10

    .line 644
    if-nez v6, :cond_6

    .line 645
    .line 646
    move/from16 v8, v22

    .line 647
    .line 648
    goto :goto_8

    .line 649
    :cond_6
    long-to-float v6, v8

    .line 650
    long-to-float v8, v2

    .line 651
    div-float/2addr v6, v8

    .line 652
    iget v8, v15, La/jge0;->a:F

    .line 653
    .line 654
    sub-float v8, v28, v8

    .line 655
    .line 656
    mul-float/2addr v8, v6

    .line 657
    iget-wide v9, v7, La/a9q0;->c:J

    .line 658
    .line 659
    shr-long v9, v9, v24

    .line 660
    .line 661
    long-to-int v6, v9

    .line 662
    div-int/lit8 v6, v6, 0x2

    .line 663
    .line 664
    int-to-float v6, v6

    .line 665
    sub-float/2addr v8, v6

    .line 666
    :goto_8
    invoke-interface {v1}, La/fhl;->d()J

    .line 667
    .line 668
    .line 669
    move-result-wide v9

    .line 670
    and-long v9, v9, v25

    .line 671
    .line 672
    long-to-int v6, v9

    .line 673
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 674
    .line 675
    .line 676
    move-result v6

    .line 677
    iget-wide v9, v7, La/a9q0;->c:J

    .line 678
    .line 679
    and-long v9, v9, v25

    .line 680
    .line 681
    long-to-int v9, v9

    .line 682
    int-to-float v9, v9

    .line 683
    sub-float/2addr v6, v9

    .line 684
    invoke-static {v1, v7, v8, v6, v0}, La/ahy;->X(La/fhl;La/a9q0;FFZ)V

    .line 685
    .line 686
    .line 687
    goto :goto_7

    .line 688
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 689
    .line 690
    .line 691
    throw v20

    .line 692
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 693
    .line 694
    return-object v0

    .line 695
    :catchall_2
    move-exception v0

    .line 696
    :goto_9
    move-wide v1, v11

    .line 697
    goto :goto_e

    .line 698
    :catchall_3
    move-exception v0

    .line 699
    goto :goto_b

    .line 700
    :catchall_4
    move-exception v0

    .line 701
    move-object v10, v2

    .line 702
    :goto_a
    move-wide v13, v4

    .line 703
    move-wide/from16 v11, v35

    .line 704
    .line 705
    goto :goto_b

    .line 706
    :catchall_5
    move-exception v0

    .line 707
    goto :goto_a

    .line 708
    :goto_b
    :try_start_b
    invoke-virtual {v9}, La/nr;->i()La/x5a;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    invoke-interface {v1}, La/x5a;->i()V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v9, v13, v14}, La/nr;->H(J)V

    .line 716
    .line 717
    .line 718
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 719
    :catchall_6
    move-exception v0

    .line 720
    move-wide/from16 v11, v35

    .line 721
    .line 722
    goto :goto_9

    .line 723
    :catchall_7
    move-exception v0

    .line 724
    :goto_c
    move-wide/from16 v1, v35

    .line 725
    .line 726
    goto :goto_d

    .line 727
    :catchall_8
    move-exception v0

    .line 728
    move-object v12, v1

    .line 729
    move-object v10, v7

    .line 730
    move-wide/from16 v13, v33

    .line 731
    .line 732
    goto :goto_c

    .line 733
    :catchall_9
    move-exception v0

    .line 734
    move-wide v1, v12

    .line 735
    move-wide v13, v14

    .line 736
    move-object v12, v10

    .line 737
    move-object v10, v7

    .line 738
    :goto_d
    :try_start_c
    invoke-virtual {v12}, La/nr;->i()La/x5a;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    invoke-interface {v3}, La/x5a;->i()V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12, v13, v14}, La/nr;->H(J)V

    .line 746
    .line 747
    .line 748
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 749
    :catchall_a
    move-exception v0

    .line 750
    goto :goto_e

    .line 751
    :catchall_b
    move-exception v0

    .line 752
    move-object v10, v7

    .line 753
    move-wide v1, v12

    .line 754
    :goto_e
    invoke-static {v10, v1, v2}, Lc;->g(La/nr;J)V

    .line 755
    .line 756
    .line 757
    throw v0
.end method
