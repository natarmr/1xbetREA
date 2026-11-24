.class public final La/b2d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(FB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/b2d;->a:B

    iput p1, p0, La/b2d;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 19

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
    iget-byte v3, v0, La/b2d;->a:B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget v0, v0, La/b2d;->b:F

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x1

    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    packed-switch v3, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    new-instance v3, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v7, 0xa

    .line 27
    .line 28
    invoke-static {v2, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_0

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, La/pj30;

    .line 50
    .line 51
    const/4 v13, 0x0

    .line 52
    const/16 v14, 0xe

    .line 53
    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x0

    .line 56
    const/4 v12, 0x0

    .line 57
    move-wide/from16 v8, p3

    .line 58
    .line 59
    invoke-static/range {v8 .. v14}, La/p4e;->b(JIIIII)J

    .line 60
    .line 61
    .line 62
    move-result-wide v10

    .line 63
    invoke-interface {v7, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    move v8, v5

    .line 81
    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_2

    .line 86
    .line 87
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    check-cast v9, La/pu90;

    .line 92
    .line 93
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    iget v9, v9, La/pu90;->a:I

    .line 101
    .line 102
    add-int/2addr v9, v0

    .line 103
    add-int/2addr v8, v9

    .line 104
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-le v8, v9, :cond_1

    .line 109
    .line 110
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-nez v7, :cond_3

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, La/pu90;

    .line 126
    .line 127
    iget v4, v4, La/pu90;->b:I

    .line 128
    .line 129
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_5

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    check-cast v7, La/pu90;

    .line 144
    .line 145
    iget v7, v7, La/pu90;->b:I

    .line 146
    .line 147
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-virtual {v4, v7}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-gez v8, :cond_4

    .line 156
    .line 157
    move-object v4, v7

    .line 158
    goto :goto_1

    .line 159
    :cond_5
    :goto_2
    if-eqz v4, :cond_6

    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    :cond_6
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    new-instance v4, La/x5q;

    .line 170
    .line 171
    invoke-direct {v4, v2, v3, v6}, La/x5q;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;B)V

    .line 172
    .line 173
    .line 174
    invoke-static {v1, v0, v5, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    return-object v0

    .line 179
    :pswitch_0
    sget-object v3, La/qmk;->a:La/zcl;

    .line 180
    .line 181
    const/high16 v3, 0x41000000    # 8.0f

    .line 182
    .line 183
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    check-cast v4, La/pj30;

    .line 192
    .line 193
    move-wide/from16 v12, p3

    .line 194
    .line 195
    invoke-interface {v4, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    check-cast v6, La/pj30;

    .line 204
    .line 205
    const/16 v17, 0x0

    .line 206
    .line 207
    const/16 v18, 0xe

    .line 208
    .line 209
    const/4 v14, 0x0

    .line 210
    const/4 v15, 0x0

    .line 211
    const/16 v16, 0x0

    .line 212
    .line 213
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 214
    .line 215
    .line 216
    move-result-wide v7

    .line 217
    invoke-interface {v6, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    iget v7, v10, La/pu90;->a:I

    .line 226
    .line 227
    sub-int/2addr v6, v7

    .line 228
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    add-int/2addr v7, v6

    .line 233
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    if-le v0, v6, :cond_7

    .line 246
    .line 247
    move v14, v6

    .line 248
    goto :goto_3

    .line 249
    :cond_7
    move v14, v0

    .line 250
    :goto_3
    const/4 v0, 0x2

    .line 251
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, La/pj30;

    .line 256
    .line 257
    const/16 v17, 0x0

    .line 258
    .line 259
    const/16 v18, 0x8

    .line 260
    .line 261
    const/16 v16, 0x0

    .line 262
    .line 263
    move v15, v14

    .line 264
    move-wide/from16 v12, p3

    .line 265
    .line 266
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 267
    .line 268
    .line 269
    move-result-wide v6

    .line 270
    invoke-interface {v0, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    iget v0, v4, La/pu90;->b:I

    .line 275
    .line 276
    add-int v9, v0, v3

    .line 277
    .line 278
    iget v0, v8, La/pu90;->b:I

    .line 279
    .line 280
    iget v2, v10, La/pu90;->b:I

    .line 281
    .line 282
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    iget v3, v10, La/pu90;->a:I

    .line 291
    .line 292
    sub-int/2addr v2, v3

    .line 293
    if-gez v2, :cond_8

    .line 294
    .line 295
    move v11, v5

    .line 296
    goto :goto_4

    .line 297
    :cond_8
    move v11, v2

    .line 298
    :goto_4
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    add-int/2addr v0, v9

    .line 303
    new-instance v7, La/k7m;

    .line 304
    .line 305
    move-object v12, v4

    .line 306
    invoke-direct/range {v7 .. v12}, La/k7m;-><init>(La/pu90;ILa/pu90;ILa/pu90;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v1, v2, v0, v7}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    return-object v0

    .line 314
    :pswitch_1
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    move v6, v5

    .line 319
    :goto_5
    if-ge v6, v3, :cond_b

    .line 320
    .line 321
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    check-cast v7, La/pj30;

    .line 326
    .line 327
    invoke-static {v7}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v8

    .line 331
    const-string v9, "content"

    .line 332
    .line 333
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v8

    .line 337
    if-eqz v8, :cond_a

    .line 338
    .line 339
    const/16 v17, 0x0

    .line 340
    .line 341
    const/16 v18, 0xb

    .line 342
    .line 343
    const/4 v14, 0x0

    .line 344
    const/4 v15, 0x0

    .line 345
    const/16 v16, 0x0

    .line 346
    .line 347
    move-wide/from16 v12, p3

    .line 348
    .line 349
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 350
    .line 351
    .line 352
    move-result-wide v2

    .line 353
    invoke-interface {v7, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    int-to-float v3, v3

    .line 362
    add-float/2addr v3, v0

    .line 363
    invoke-static {v3}, La/si30;->b(F)I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-gez v0, :cond_9

    .line 368
    .line 369
    goto :goto_6

    .line 370
    :cond_9
    move v5, v0

    .line 371
    :goto_6
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    new-instance v3, La/n7;

    .line 376
    .line 377
    const/16 v4, 0xb

    .line 378
    .line 379
    invoke-direct {v3, v2, v5, v4}, La/n7;-><init>(La/pu90;IB)V

    .line 380
    .line 381
    .line 382
    invoke-static {v1, v0, v5, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    goto :goto_7

    .line 387
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_b
    const-string v0, "Collection contains no element matching the predicate."

    .line 391
    .line 392
    invoke-static {v0}, La/qf00;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 393
    .line 394
    .line 395
    invoke-static {}, La/csj;->b()V

    .line 396
    .line 397
    .line 398
    :goto_7
    return-object v4

    .line 399
    :pswitch_2
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    if-eqz v3, :cond_c

    .line 404
    .line 405
    new-instance v0, La/e6c;

    .line 406
    .line 407
    const/16 v2, 0x1a

    .line 408
    .line 409
    invoke-direct {v0, v2}, La/e6c;-><init>(B)V

    .line 410
    .line 411
    .line 412
    invoke-static {v1, v5, v5, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    goto/16 :goto_c

    .line 417
    .line 418
    :cond_c
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    new-instance v3, La/kie0;

    .line 423
    .line 424
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 425
    .line 426
    .line 427
    new-instance v4, Ljava/util/ArrayList;

    .line 428
    .line 429
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 430
    .line 431
    .line 432
    move-result v7

    .line 433
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 434
    .line 435
    .line 436
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    move v8, v5

    .line 441
    :goto_8
    if-ge v8, v7, :cond_13

    .line 442
    .line 443
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v9

    .line 447
    check-cast v9, La/pj30;

    .line 448
    .line 449
    invoke-static {v9}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v10

    .line 453
    const-string v11, "TOOLBAR_CONTAINER_KEY"

    .line 454
    .line 455
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v11

    .line 459
    if-eqz v11, :cond_d

    .line 460
    .line 461
    const v17, 0x7fffffff

    .line 462
    .line 463
    .line 464
    const/16 v18, 0x3

    .line 465
    .line 466
    const/4 v14, 0x0

    .line 467
    const/4 v15, 0x0

    .line 468
    const/16 v16, 0x0

    .line 469
    .line 470
    move-wide/from16 v12, p3

    .line 471
    .line 472
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 473
    .line 474
    .line 475
    move-result-wide v10

    .line 476
    invoke-interface {v9, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 477
    .line 478
    .line 479
    move-result-object v9

    .line 480
    iget v10, v9, La/pu90;->b:I

    .line 481
    .line 482
    iput v10, v3, La/kie0;->a:I

    .line 483
    .line 484
    goto :goto_b

    .line 485
    :cond_d
    const-string v11, "TAB_CONTENT_KEY"

    .line 486
    .line 487
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v10

    .line 491
    if-eqz v10, :cond_12

    .line 492
    .line 493
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 494
    .line 495
    .line 496
    move-result v10

    .line 497
    iget v11, v3, La/kie0;->a:I

    .line 498
    .line 499
    sub-int/2addr v10, v11

    .line 500
    add-int/2addr v10, v0

    .line 501
    if-gez v10, :cond_e

    .line 502
    .line 503
    move v10, v5

    .line 504
    :cond_e
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 505
    .line 506
    .line 507
    move-result v11

    .line 508
    if-ltz v11, :cond_f

    .line 509
    .line 510
    move v12, v6

    .line 511
    goto :goto_9

    .line 512
    :cond_f
    move v12, v5

    .line 513
    :goto_9
    if-ltz v10, :cond_10

    .line 514
    .line 515
    move v13, v6

    .line 516
    goto :goto_a

    .line 517
    :cond_10
    move v13, v5

    .line 518
    :goto_a
    and-int/2addr v12, v13

    .line 519
    if-nez v12, :cond_11

    .line 520
    .line 521
    const-string v12, "width and height must be >= 0"

    .line 522
    .line 523
    invoke-static {v12}, La/zcx;->a(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    :cond_11
    invoke-static {v11, v11, v10, v10}, La/r4e;->h(IIII)J

    .line 527
    .line 528
    .line 529
    move-result-wide v10

    .line 530
    invoke-interface {v9, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 531
    .line 532
    .line 533
    move-result-object v9

    .line 534
    goto :goto_b

    .line 535
    :cond_12
    const/16 v17, 0x0

    .line 536
    .line 537
    const/16 v18, 0xb

    .line 538
    .line 539
    const/4 v14, 0x0

    .line 540
    const/4 v15, 0x0

    .line 541
    const/16 v16, 0x0

    .line 542
    .line 543
    move-wide/from16 v12, p3

    .line 544
    .line 545
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 546
    .line 547
    .line 548
    move-result-wide v10

    .line 549
    invoke-interface {v9, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 550
    .line 551
    .line 552
    move-result-object v9

    .line 553
    :goto_b
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    add-int/lit8 v8, v8, 0x1

    .line 557
    .line 558
    goto :goto_8

    .line 559
    :cond_13
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 560
    .line 561
    .line 562
    move-result v2

    .line 563
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 564
    .line 565
    .line 566
    move-result v5

    .line 567
    new-instance v7, La/hf4;

    .line 568
    .line 569
    invoke-direct {v7, v4, v3, v0, v6}, La/hf4;-><init>(Ljava/util/ArrayList;La/kie0;IB)V

    .line 570
    .line 571
    .line 572
    invoke-static {v1, v2, v5, v7}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    :goto_c
    return-object v0

    .line 577
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
