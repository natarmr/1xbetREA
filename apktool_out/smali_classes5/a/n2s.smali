.class public final La/n2s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:La/t33;

.field public final synthetic b:La/t33;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/agk0;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:F

.field public final synthetic h:La/l7m0;


# direct methods
.method public constructor <init>(La/t33;La/t33;La/l7m0;La/agk0;IIFLa/l7m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/n2s;->a:La/t33;

    .line 5
    .line 6
    iput-object p2, p0, La/n2s;->b:La/t33;

    .line 7
    .line 8
    iput-object p3, p0, La/n2s;->c:La/l7m0;

    .line 9
    .line 10
    iput-object p4, p0, La/n2s;->d:La/agk0;

    .line 11
    .line 12
    iput p5, p0, La/n2s;->e:I

    .line 13
    .line 14
    iput p6, p0, La/n2s;->f:I

    .line 15
    .line 16
    iput p7, p0, La/n2s;->g:F

    .line 17
    .line 18
    iput-object p8, p0, La/n2s;->h:La/l7m0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 22

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
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    sget-object v3, La/qmk;->a:La/zcl;

    .line 13
    .line 14
    const/high16 v3, 0x40800000    # 4.0f

    .line 15
    .line 16
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/high16 v5, 0x41000000    # 8.0f

    .line 21
    .line 22
    invoke-interface {v1, v5}, La/w6k;->T(F)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    iget-object v7, v0, La/n2s;->a:La/t33;

    .line 27
    .line 28
    invoke-virtual {v7}, La/t33;->d()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    check-cast v8, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    const/4 v9, 0x0

    .line 39
    const/high16 v10, 0x3f800000    # 1.0f

    .line 40
    .line 41
    invoke-static {v8, v9, v10}, La/l1e0;->c(FFF)F

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    int-to-float v4, v4

    .line 46
    sub-float v8, v10, v8

    .line 47
    .line 48
    mul-float/2addr v4, v8

    .line 49
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    int-to-float v6, v6

    .line 54
    mul-float/2addr v6, v8

    .line 55
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const/high16 v8, 0x42600000    # 56.0f

    .line 60
    .line 61
    invoke-interface {v1, v8}, La/w6k;->T(F)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    invoke-interface {v1, v5}, La/w6k;->T(F)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    const/high16 v11, 0x42280000    # 42.0f

    .line 70
    .line 71
    invoke-interface {v1, v11}, La/w6k;->T(F)I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    const/high16 v12, 0x42380000    # 46.0f

    .line 76
    .line 77
    invoke-interface {v1, v12}, La/w6k;->T(F)I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    const-string v15, "SIMULATION"

    .line 90
    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    if-eqz v14, :cond_3

    .line 94
    .line 95
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    move-object/from16 v17, v14

    .line 100
    .line 101
    check-cast v17, La/pj30;

    .line 102
    .line 103
    invoke-interface/range {v17 .. v17}, La/pj30;->n()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    move/from16 v17, v9

    .line 108
    .line 109
    instance-of v9, v3, La/coc;

    .line 110
    .line 111
    if-eqz v9, :cond_0

    .line 112
    .line 113
    check-cast v3, La/coc;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_0
    move-object/from16 v3, v16

    .line 117
    .line 118
    :goto_1
    if-eqz v3, :cond_1

    .line 119
    .line 120
    iget-object v3, v3, La/coc;->b:Ljava/lang/String;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_1
    move-object/from16 v3, v16

    .line 124
    .line 125
    :goto_2
    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_2

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_2
    move/from16 v9, v17

    .line 133
    .line 134
    const/high16 v3, 0x40800000    # 4.0f

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    move/from16 v17, v9

    .line 138
    .line 139
    move-object/from16 v14, v16

    .line 140
    .line 141
    :goto_3
    check-cast v14, La/pj30;

    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    if-eqz v14, :cond_4

    .line 145
    .line 146
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    move v13, v10

    .line 151
    move/from16 v19, v11

    .line 152
    .line 153
    invoke-static {v2, v2, v3, v9}, La/p4e;->a(IIII)J

    .line 154
    .line 155
    .line 156
    move-result-wide v10

    .line 157
    invoke-interface {v14, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    goto :goto_4

    .line 162
    :cond_4
    move v13, v10

    .line 163
    move/from16 v19, v11

    .line 164
    .line 165
    move-object/from16 v9, v16

    .line 166
    .line 167
    :goto_4
    if-eqz v9, :cond_5

    .line 168
    .line 169
    iget v10, v9, La/pu90;->b:I

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_5
    move v10, v3

    .line 173
    :goto_5
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    :goto_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v14

    .line 181
    const-string v3, "TAB_ID"

    .line 182
    .line 183
    if-eqz v14, :cond_9

    .line 184
    .line 185
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v14

    .line 189
    move-object/from16 v20, v14

    .line 190
    .line 191
    check-cast v20, La/pj30;

    .line 192
    .line 193
    move/from16 v21, v13

    .line 194
    .line 195
    invoke-interface/range {v20 .. v20}, La/pj30;->n()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    move/from16 v20, v5

    .line 200
    .line 201
    instance-of v5, v13, La/coc;

    .line 202
    .line 203
    if-eqz v5, :cond_6

    .line 204
    .line 205
    check-cast v13, La/coc;

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_6
    move-object/from16 v13, v16

    .line 209
    .line 210
    :goto_7
    if-eqz v13, :cond_7

    .line 211
    .line 212
    iget-object v5, v13, La/coc;->b:Ljava/lang/String;

    .line 213
    .line 214
    goto :goto_8

    .line 215
    :cond_7
    move-object/from16 v5, v16

    .line 216
    .line 217
    :goto_8
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    if-eqz v5, :cond_8

    .line 222
    .line 223
    goto :goto_9

    .line 224
    :cond_8
    move/from16 v5, v20

    .line 225
    .line 226
    move/from16 v13, v21

    .line 227
    .line 228
    const/4 v3, 0x0

    .line 229
    goto :goto_6

    .line 230
    :cond_9
    move/from16 v20, v5

    .line 231
    .line 232
    move/from16 v21, v13

    .line 233
    .line 234
    move-object/from16 v14, v16

    .line 235
    .line 236
    :goto_9
    check-cast v14, La/pj30;

    .line 237
    .line 238
    if-eqz v14, :cond_a

    .line 239
    .line 240
    invoke-interface {v14, v2}, La/pj30;->b(I)I

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    goto :goto_a

    .line 245
    :cond_a
    const/4 v5, 0x0

    .line 246
    :goto_a
    invoke-virtual {v7}, La/t33;->d()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    check-cast v11, Ljava/lang/Number;

    .line 251
    .line 252
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 253
    .line 254
    .line 255
    move-result v11

    .line 256
    cmpg-float v11, v11, v17

    .line 257
    .line 258
    iget-object v14, v0, La/n2s;->b:La/t33;

    .line 259
    .line 260
    if-nez v11, :cond_b

    .line 261
    .line 262
    int-to-float v5, v5

    .line 263
    invoke-virtual {v14}, La/t33;->d()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    check-cast v11, Ljava/lang/Number;

    .line 268
    .line 269
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    sub-float v11, v21, v11

    .line 274
    .line 275
    move/from16 v13, v21

    .line 276
    .line 277
    move/from16 v21, v5

    .line 278
    .line 279
    move v5, v13

    .line 280
    move/from16 v13, v17

    .line 281
    .line 282
    invoke-static {v11, v13, v5}, La/l1e0;->c(FFF)F

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    mul-float v11, v11, v21

    .line 287
    .line 288
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    :cond_b
    sget-object v11, La/qmk;->a:La/zcl;

    .line 293
    .line 294
    const/high16 v11, 0x40800000    # 4.0f

    .line 295
    .line 296
    invoke-interface {v1, v11}, La/w6k;->T(F)I

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    mul-int/lit8 v11, v11, 0x2

    .line 301
    .line 302
    iget-object v13, v0, La/n2s;->c:La/l7m0;

    .line 303
    .line 304
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v13

    .line 308
    check-cast v13, Ljava/lang/Boolean;

    .line 309
    .line 310
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 311
    .line 312
    .line 313
    move-result v13

    .line 314
    if-eqz v13, :cond_c

    .line 315
    .line 316
    sub-int v13, v2, v11

    .line 317
    .line 318
    int-to-float v13, v13

    .line 319
    const v18, 0x3fe38e39

    .line 320
    .line 321
    .line 322
    div-float v13, v13, v18

    .line 323
    .line 324
    int-to-float v11, v11

    .line 325
    add-float/2addr v13, v11

    .line 326
    goto :goto_b

    .line 327
    :cond_c
    const/high16 v11, 0x43280000    # 168.0f

    .line 328
    .line 329
    invoke-interface {v1, v11}, La/w6k;->T(F)I

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    int-to-float v13, v11

    .line 334
    :goto_b
    iget-object v11, v0, La/n2s;->d:La/agk0;

    .line 335
    .line 336
    invoke-virtual {v11}, La/agk0;->l()F

    .line 337
    .line 338
    .line 339
    move-result v18

    .line 340
    cmpg-float v18, v18, v13

    .line 341
    .line 342
    if-nez v18, :cond_d

    .line 343
    .line 344
    goto :goto_c

    .line 345
    :cond_d
    invoke-virtual {v11, v13}, La/agk0;->m(F)V

    .line 346
    .line 347
    .line 348
    :goto_c
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 349
    .line 350
    .line 351
    move-result v11

    .line 352
    move-object/from16 v18, v7

    .line 353
    .line 354
    iget v7, v0, La/n2s;->e:I

    .line 355
    .line 356
    sub-int/2addr v11, v7

    .line 357
    sub-int/2addr v11, v8

    .line 358
    iget v7, v0, La/n2s;->f:I

    .line 359
    .line 360
    sub-int/2addr v11, v7

    .line 361
    sub-int v11, v11, v19

    .line 362
    .line 363
    sub-int/2addr v11, v12

    .line 364
    int-to-float v7, v11

    .line 365
    cmpg-float v8, v7, v13

    .line 366
    .line 367
    if-gez v8, :cond_e

    .line 368
    .line 369
    move v7, v13

    .line 370
    :cond_e
    invoke-virtual/range {v18 .. v18}, La/t33;->d()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v8

    .line 374
    check-cast v8, Ljava/lang/Number;

    .line 375
    .line 376
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    const/16 v17, 0x0

    .line 381
    .line 382
    cmpg-float v8, v8, v17

    .line 383
    .line 384
    if-nez v8, :cond_f

    .line 385
    .line 386
    sub-float/2addr v7, v13

    .line 387
    invoke-virtual {v14}, La/t33;->d()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v8

    .line 391
    check-cast v8, Ljava/lang/Number;

    .line 392
    .line 393
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 394
    .line 395
    .line 396
    move-result v8

    .line 397
    mul-float/2addr v8, v7

    .line 398
    add-float/2addr v8, v13

    .line 399
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 400
    .line 401
    .line 402
    move-result v7

    .line 403
    goto :goto_d

    .line 404
    :cond_f
    invoke-virtual/range {v18 .. v18}, La/t33;->d()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    check-cast v7, Ljava/lang/Number;

    .line 409
    .line 410
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 411
    .line 412
    .line 413
    move-result v7

    .line 414
    const/high16 v21, 0x3f800000    # 1.0f

    .line 415
    .line 416
    sub-float v7, v21, v7

    .line 417
    .line 418
    mul-float/2addr v7, v13

    .line 419
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 420
    .line 421
    .line 422
    move-result v7

    .line 423
    :goto_d
    invoke-virtual/range {v18 .. v18}, La/t33;->d()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v8

    .line 427
    check-cast v8, Ljava/lang/Number;

    .line 428
    .line 429
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 430
    .line 431
    .line 432
    move-result v8

    .line 433
    iget v11, v0, La/n2s;->g:F

    .line 434
    .line 435
    mul-float/2addr v8, v11

    .line 436
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    add-int v11, v5, v7

    .line 441
    .line 442
    add-int/2addr v11, v8

    .line 443
    new-instance v12, Ljava/util/ArrayList;

    .line 444
    .line 445
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 446
    .line 447
    .line 448
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object v13

    .line 452
    :goto_e
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v14

    .line 456
    if-eqz v14, :cond_1a

    .line 457
    .line 458
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v14

    .line 462
    check-cast v14, La/pj30;

    .line 463
    .line 464
    move-object/from16 v17, v9

    .line 465
    .line 466
    invoke-interface {v14}, La/pj30;->n()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v9

    .line 470
    move/from16 v18, v10

    .line 471
    .line 472
    instance-of v10, v9, La/coc;

    .line 473
    .line 474
    if-eqz v10, :cond_10

    .line 475
    .line 476
    check-cast v9, La/coc;

    .line 477
    .line 478
    goto :goto_f

    .line 479
    :cond_10
    move-object/from16 v9, v16

    .line 480
    .line 481
    :goto_f
    if-eqz v9, :cond_11

    .line 482
    .line 483
    iget-object v9, v9, La/coc;->b:Ljava/lang/String;

    .line 484
    .line 485
    goto :goto_10

    .line 486
    :cond_11
    move-object/from16 v9, v16

    .line 487
    .line 488
    :goto_10
    if-eqz v9, :cond_18

    .line 489
    .line 490
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 491
    .line 492
    .line 493
    move-result v10

    .line 494
    sparse-switch v10, :sswitch_data_0

    .line 495
    .line 496
    .line 497
    goto/16 :goto_11

    .line 498
    .line 499
    :sswitch_0
    const-string v10, "CARDS_ID"

    .line 500
    .line 501
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v9

    .line 505
    if-nez v9, :cond_12

    .line 506
    .line 507
    goto :goto_11

    .line 508
    :cond_12
    invoke-static {v2, v2, v7, v7}, La/p4e;->a(IIII)J

    .line 509
    .line 510
    .line 511
    move-result-wide v9

    .line 512
    invoke-interface {v14, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 513
    .line 514
    .line 515
    move-result-object v9

    .line 516
    goto :goto_12

    .line 517
    :sswitch_1
    const-string v10, "CARD_BACKGROUND_ID"

    .line 518
    .line 519
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v9

    .line 523
    if-nez v9, :cond_13

    .line 524
    .line 525
    goto :goto_11

    .line 526
    :cond_13
    invoke-static {v2, v2, v11, v11}, La/p4e;->a(IIII)J

    .line 527
    .line 528
    .line 529
    move-result-wide v9

    .line 530
    invoke-interface {v14, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 531
    .line 532
    .line 533
    move-result-object v9

    .line 534
    goto :goto_12

    .line 535
    :sswitch_2
    const-string v10, "INDICATOR_ID"

    .line 536
    .line 537
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v9

    .line 541
    if-nez v9, :cond_14

    .line 542
    .line 543
    goto :goto_11

    .line 544
    :cond_14
    invoke-static {v2, v2, v4, v4}, La/p4e;->a(IIII)J

    .line 545
    .line 546
    .line 547
    move-result-wide v9

    .line 548
    invoke-interface {v14, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 549
    .line 550
    .line 551
    move-result-object v9

    .line 552
    goto :goto_12

    .line 553
    :sswitch_3
    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v9

    .line 557
    if-nez v9, :cond_15

    .line 558
    .line 559
    goto :goto_11

    .line 560
    :cond_15
    move-object/from16 v9, v17

    .line 561
    .line 562
    goto :goto_12

    .line 563
    :sswitch_4
    const-string v10, "COMPRESSED_CARD_ID"

    .line 564
    .line 565
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v9

    .line 569
    if-nez v9, :cond_16

    .line 570
    .line 571
    goto :goto_11

    .line 572
    :cond_16
    invoke-static {v2, v2, v8, v8}, La/p4e;->a(IIII)J

    .line 573
    .line 574
    .line 575
    move-result-wide v9

    .line 576
    invoke-interface {v14, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 577
    .line 578
    .line 579
    move-result-object v9

    .line 580
    goto :goto_12

    .line 581
    :sswitch_5
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v9

    .line 585
    if-nez v9, :cond_17

    .line 586
    .line 587
    goto :goto_11

    .line 588
    :cond_17
    invoke-static {v2, v2, v5, v5}, La/p4e;->a(IIII)J

    .line 589
    .line 590
    .line 591
    move-result-wide v9

    .line 592
    invoke-interface {v14, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 593
    .line 594
    .line 595
    move-result-object v9

    .line 596
    goto :goto_12

    .line 597
    :cond_18
    :goto_11
    move-object/from16 v9, v16

    .line 598
    .line 599
    :goto_12
    if-eqz v9, :cond_19

    .line 600
    .line 601
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    :cond_19
    move-object/from16 v9, v17

    .line 605
    .line 606
    move/from16 v10, v18

    .line 607
    .line 608
    goto/16 :goto_e

    .line 609
    .line 610
    :cond_1a
    move/from16 v18, v10

    .line 611
    .line 612
    if-lez v18, :cond_1b

    .line 613
    .line 614
    move/from16 v5, v20

    .line 615
    .line 616
    goto :goto_13

    .line 617
    :cond_1b
    const/4 v5, 0x0

    .line 618
    :goto_13
    iget-object v0, v0, La/n2s;->h:La/l7m0;

    .line 619
    .line 620
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    check-cast v2, Ljava/lang/Number;

    .line 625
    .line 626
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    add-int/2addr v2, v11

    .line 631
    add-int/2addr v2, v4

    .line 632
    add-int/2addr v2, v6

    .line 633
    add-int v2, v2, v18

    .line 634
    .line 635
    add-int/2addr v2, v5

    .line 636
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 637
    .line 638
    .line 639
    move-result v3

    .line 640
    new-instance v4, La/inr;

    .line 641
    .line 642
    invoke-direct {v4, v12, v0, v6}, La/inr;-><init>(Ljava/util/ArrayList;La/l7m0;I)V

    .line 643
    .line 644
    .line 645
    invoke-static {v1, v3, v2, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    return-object v0

    .line 650
    nop

    .line 651
    :sswitch_data_0
    .sparse-switch
        -0x6cf585db -> :sswitch_5
        -0x42827614 -> :sswitch_4
        -0x3014edf9 -> :sswitch_3
        -0x1368da95 -> :sswitch_2
        0x267f1edd -> :sswitch_1
        0x2e369397 -> :sswitch_0
    .end sparse-switch
.end method
