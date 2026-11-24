.class public final La/h13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h13;->a:B

    iput-object p1, p0, La/h13;->b:Ljava/lang/Object;

    iput-object p2, p0, La/h13;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 21

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
    iget-byte v3, v0, La/h13;->a:B

    .line 8
    .line 9
    iget-object v10, v0, La/h13;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v0, v0, La/h13;->c:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v3, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    move-object v11, v2

    .line 24
    check-cast v11, La/pj30;

    .line 25
    .line 26
    if-eqz v11, :cond_0

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    const/16 v8, 0xe

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    move-wide/from16 v2, p3

    .line 35
    .line 36
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    move-wide v6, v2

    .line 41
    invoke-interface {v11, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-wide/from16 v6, p3

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    :goto_0
    check-cast v0, La/agk0;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    if-eqz v8, :cond_1

    .line 53
    .line 54
    iget v3, v8, La/pu90;->b:I

    .line 55
    .line 56
    int-to-float v3, v3

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v3, v2

    .line 59
    :goto_1
    const/high16 v4, -0x40800000    # -1.0f

    .line 60
    .line 61
    mul-float/2addr v3, v4

    .line 62
    invoke-virtual {v0, v3}, La/agk0;->m(F)V

    .line 63
    .line 64
    .line 65
    check-cast v10, La/nyq0;

    .line 66
    .line 67
    if-eqz v10, :cond_2

    .line 68
    .line 69
    invoke-interface {v10}, La/nyq0;->getState()La/oyq0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    iget-object v0, v0, La/oyq0;->c:La/agk0;

    .line 76
    .line 77
    invoke-virtual {v0}, La/agk0;->l()F

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    move v0, v2

    .line 83
    :goto_2
    if-eqz v8, :cond_3

    .line 84
    .line 85
    iget v2, v8, La/pu90;->b:I

    .line 86
    .line 87
    int-to-float v2, v2

    .line 88
    :cond_3
    add-float/2addr v2, v0

    .line 89
    invoke-static {v2}, La/si30;->b(F)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-gez v2, :cond_4

    .line 94
    .line 95
    const/4 v9, 0x0

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    move v9, v2

    .line 98
    :goto_3
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    new-instance v3, La/j3d;

    .line 103
    .line 104
    const/4 v4, 0x2

    .line 105
    invoke-direct {v3, v8, v0, v4}, La/j3d;-><init>(La/pu90;FB)V

    .line 106
    .line 107
    .line 108
    invoke-static {v1, v2, v9, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0

    .line 113
    :pswitch_0
    move-wide/from16 v6, p3

    .line 114
    .line 115
    new-instance v3, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    const/4 v11, 0x0

    .line 129
    :goto_4
    if-ge v11, v5, :cond_6

    .line 130
    .line 131
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    move-object v13, v12

    .line 136
    check-cast v13, La/pj30;

    .line 137
    .line 138
    invoke-interface {v13}, La/pj30;->n()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    instance-of v13, v13, La/p9q0;

    .line 143
    .line 144
    if-nez v13, :cond_5

    .line 145
    .line 146
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    :cond_5
    add-int/lit8 v11, v11, 0x1

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_6
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 153
    .line 154
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Ljava/util/List;

    .line 159
    .line 160
    if-eqz v0, :cond_a

    .line 161
    .line 162
    new-instance v5, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v11

    .line 168
    invoke-direct {v5, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 172
    .line 173
    .line 174
    move-result v11

    .line 175
    const/4 v12, 0x0

    .line 176
    :goto_5
    if-ge v12, v11, :cond_9

    .line 177
    .line 178
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    check-cast v13, La/jge0;

    .line 183
    .line 184
    if-eqz v13, :cond_7

    .line 185
    .line 186
    iget v14, v13, La/jge0;->b:F

    .line 187
    .line 188
    iget v15, v13, La/jge0;->a:F

    .line 189
    .line 190
    new-instance v8, Lkotlin/Pair;

    .line 191
    .line 192
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v16

    .line 196
    move-object/from16 v4, v16

    .line 197
    .line 198
    check-cast v4, La/pj30;

    .line 199
    .line 200
    iget v9, v13, La/jge0;->c:F

    .line 201
    .line 202
    sub-float/2addr v9, v15

    .line 203
    move-object/from16 v17, v10

    .line 204
    .line 205
    float-to-double v9, v9

    .line 206
    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    .line 207
    .line 208
    .line 209
    move-result-wide v9

    .line 210
    double-to-float v9, v9

    .line 211
    float-to-int v9, v9

    .line 212
    iget v10, v13, La/jge0;->d:F

    .line 213
    .line 214
    sub-float/2addr v10, v14

    .line 215
    move v13, v11

    .line 216
    float-to-double v10, v10

    .line 217
    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    .line 218
    .line 219
    .line 220
    move-result-wide v10

    .line 221
    double-to-float v10, v10

    .line 222
    float-to-int v10, v10

    .line 223
    move-object/from16 v18, v0

    .line 224
    .line 225
    const/4 v0, 0x0

    .line 226
    const/4 v11, 0x5

    .line 227
    invoke-static {v0, v9, v0, v10, v11}, La/r4e;->b(IIIII)J

    .line 228
    .line 229
    .line 230
    move-result-wide v9

    .line 231
    invoke-interface {v4, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    int-to-long v10, v4

    .line 244
    const/16 v4, 0x20

    .line 245
    .line 246
    shl-long/2addr v10, v4

    .line 247
    int-to-long v14, v9

    .line 248
    const-wide v19, 0xffffffffL

    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    and-long v14, v14, v19

    .line 254
    .line 255
    or-long v9, v10, v14

    .line 256
    .line 257
    new-instance v4, La/ikx;

    .line 258
    .line 259
    invoke-direct {v4, v9, v10}, La/ikx;-><init>(J)V

    .line 260
    .line 261
    .line 262
    invoke-direct {v8, v0, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_7
    move-object/from16 v18, v0

    .line 267
    .line 268
    move-object/from16 v17, v10

    .line 269
    .line 270
    move v13, v11

    .line 271
    const/4 v8, 0x0

    .line 272
    :goto_6
    if-eqz v8, :cond_8

    .line 273
    .line 274
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    :cond_8
    add-int/lit8 v12, v12, 0x1

    .line 278
    .line 279
    move v11, v13

    .line 280
    move-object/from16 v10, v17

    .line 281
    .line 282
    move-object/from16 v0, v18

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_9
    move-object v8, v5

    .line 286
    :goto_7
    move-object/from16 v17, v10

    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_a
    const/4 v8, 0x0

    .line 290
    goto :goto_7

    .line 291
    :goto_8
    new-instance v0, Ljava/util/ArrayList;

    .line 292
    .line 293
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 298
    .line 299
    .line 300
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    const/4 v9, 0x0

    .line 305
    :goto_9
    if-ge v9, v3, :cond_c

    .line 306
    .line 307
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    move-object v5, v4

    .line 312
    check-cast v5, La/pj30;

    .line 313
    .line 314
    invoke-interface {v5}, La/pj30;->n()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    instance-of v5, v5, La/p9q0;

    .line 319
    .line 320
    if-eqz v5, :cond_b

    .line 321
    .line 322
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    :cond_b
    add-int/lit8 v9, v9, 0x1

    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_c
    move-object/from16 v10, v17

    .line 329
    .line 330
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 331
    .line 332
    invoke-static {v0, v10}, La/aad;->V(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/util/ArrayList;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-static {v6, v7}, La/p4e;->i(J)I

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    invoke-static {v6, v7}, La/p4e;->h(J)I

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    new-instance v4, La/wvv;

    .line 345
    .line 346
    const/4 v5, 0x1

    .line 347
    invoke-direct {v4, v8, v0, v5}, La/wvv;-><init>(Ljava/util/List;Ljava/util/List;B)V

    .line 348
    .line 349
    .line 350
    invoke-static {v1, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    return-object v0

    .line 355
    :pswitch_1
    move-wide/from16 v6, p3

    .line 356
    .line 357
    move-object/from16 v17, v10

    .line 358
    .line 359
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-eqz v3, :cond_d

    .line 367
    .line 368
    new-instance v0, La/er90;

    .line 369
    .line 370
    const/16 v2, 0xa

    .line 371
    .line 372
    invoke-direct {v0, v2}, La/er90;-><init>(B)V

    .line 373
    .line 374
    .line 375
    const/4 v2, 0x0

    .line 376
    invoke-static {v1, v2, v2, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 377
    .line 378
    .line 379
    move-result-object v8

    .line 380
    goto/16 :goto_11

    .line 381
    .line 382
    :cond_d
    move-object/from16 v10, v17

    .line 383
    .line 384
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 385
    .line 386
    const-string v3, "Collection contains no element matching the predicate."

    .line 387
    .line 388
    const-string v4, "LOGO"

    .line 389
    .line 390
    if-nez v10, :cond_10

    .line 391
    .line 392
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 393
    .line 394
    if-nez v0, :cond_10

    .line 395
    .line 396
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    const/4 v9, 0x0

    .line 401
    :goto_a
    if-ge v9, v0, :cond_f

    .line 402
    .line 403
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    check-cast v5, La/pj30;

    .line 408
    .line 409
    invoke-static {v5}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v8

    .line 413
    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    if-eqz v8, :cond_e

    .line 418
    .line 419
    invoke-interface {v5, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    iget v2, v0, La/pu90;->a:I

    .line 424
    .line 425
    iget v3, v0, La/pu90;->b:I

    .line 426
    .line 427
    new-instance v4, La/cam;

    .line 428
    .line 429
    const/16 v5, 0x14

    .line 430
    .line 431
    invoke-direct {v4, v0, v5}, La/cam;-><init>(La/pu90;B)V

    .line 432
    .line 433
    .line 434
    invoke-static {v1, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 435
    .line 436
    .line 437
    move-result-object v8

    .line 438
    goto/16 :goto_11

    .line 439
    .line 440
    :cond_e
    add-int/lit8 v9, v9, 0x1

    .line 441
    .line 442
    goto :goto_a

    .line 443
    :cond_f
    invoke-static {v3}, La/qf00;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 444
    .line 445
    .line 446
    invoke-static {}, La/csj;->b()V

    .line 447
    .line 448
    .line 449
    :goto_b
    const/4 v8, 0x0

    .line 450
    goto/16 :goto_11

    .line 451
    .line 452
    :cond_10
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    const/4 v5, 0x0

    .line 457
    :goto_c
    if-ge v5, v0, :cond_1b

    .line 458
    .line 459
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v8

    .line 463
    check-cast v8, La/pj30;

    .line 464
    .line 465
    invoke-static {v8}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v9

    .line 469
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v9

    .line 473
    if-eqz v9, :cond_1a

    .line 474
    .line 475
    invoke-interface {v8, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    new-instance v8, Ljava/util/ArrayList;

    .line 480
    .line 481
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 482
    .line 483
    .line 484
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    :cond_11
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    if-eqz v3, :cond_12

    .line 493
    .line 494
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    move-object v5, v3

    .line 499
    check-cast v5, La/pj30;

    .line 500
    .line 501
    invoke-static {v5}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v5

    .line 509
    if-nez v5, :cond_11

    .line 510
    .line 511
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    goto :goto_d

    .line 515
    :cond_12
    new-instance v5, Ljava/util/ArrayList;

    .line 516
    .line 517
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 525
    .line 526
    .line 527
    move-result v9

    .line 528
    const/4 v6, 0x0

    .line 529
    :goto_e
    if-ge v6, v9, :cond_13

    .line 530
    .line 531
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    check-cast v2, La/pj30;

    .line 536
    .line 537
    const/4 v7, 0x1

    .line 538
    move-wide/from16 v3, p3

    .line 539
    .line 540
    invoke-static/range {v2 .. v7}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 541
    .line 542
    .line 543
    move-result v6

    .line 544
    goto :goto_e

    .line 545
    :cond_13
    invoke-static {v5, v0}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    if-eqz v3, :cond_19

    .line 558
    .line 559
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    check-cast v3, La/pu90;

    .line 564
    .line 565
    iget v3, v3, La/pu90;->a:I

    .line 566
    .line 567
    :cond_14
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 568
    .line 569
    .line 570
    move-result v4

    .line 571
    if-eqz v4, :cond_15

    .line 572
    .line 573
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v4

    .line 577
    check-cast v4, La/pu90;

    .line 578
    .line 579
    iget v4, v4, La/pu90;->a:I

    .line 580
    .line 581
    if-ge v3, v4, :cond_14

    .line 582
    .line 583
    move v3, v4

    .line 584
    goto :goto_f

    .line 585
    :cond_15
    invoke-static {v5, v0}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 594
    .line 595
    .line 596
    move-result v4

    .line 597
    if-eqz v4, :cond_18

    .line 598
    .line 599
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    check-cast v4, La/pu90;

    .line 604
    .line 605
    iget v4, v4, La/pu90;->b:I

    .line 606
    .line 607
    :cond_16
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 608
    .line 609
    .line 610
    move-result v6

    .line 611
    if-eqz v6, :cond_17

    .line 612
    .line 613
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v6

    .line 617
    check-cast v6, La/pu90;

    .line 618
    .line 619
    iget v6, v6, La/pu90;->b:I

    .line 620
    .line 621
    if-ge v4, v6, :cond_16

    .line 622
    .line 623
    move v4, v6

    .line 624
    goto :goto_10

    .line 625
    :cond_17
    new-instance v2, La/ka70;

    .line 626
    .line 627
    const/16 v6, 0x17

    .line 628
    .line 629
    invoke-direct {v2, v0, v5, v6}, La/ka70;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 630
    .line 631
    .line 632
    invoke-static {v1, v3, v4, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 633
    .line 634
    .line 635
    move-result-object v8

    .line 636
    goto :goto_11

    .line 637
    :cond_18
    invoke-static {}, La/itt0;->a()V

    .line 638
    .line 639
    .line 640
    goto/16 :goto_b

    .line 641
    .line 642
    :cond_19
    invoke-static {}, La/itt0;->a()V

    .line 643
    .line 644
    .line 645
    goto/16 :goto_b

    .line 646
    .line 647
    :cond_1a
    add-int/lit8 v5, v5, 0x1

    .line 648
    .line 649
    move-wide/from16 v6, p3

    .line 650
    .line 651
    goto/16 :goto_c

    .line 652
    .line 653
    :cond_1b
    invoke-static {v3}, La/qf00;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 654
    .line 655
    .line 656
    invoke-static {}, La/csj;->b()V

    .line 657
    .line 658
    .line 659
    goto/16 :goto_b

    .line 660
    .line 661
    :goto_11
    return-object v8

    .line 662
    :pswitch_2
    move-object/from16 v17, v10

    .line 663
    .line 664
    move-object/from16 v10, v17

    .line 665
    .line 666
    check-cast v10, La/rmb0;

    .line 667
    .line 668
    check-cast v0, La/k6z;

    .line 669
    .line 670
    invoke-virtual {v10, v0}, La/rmb0;->setParentLayoutDirection(La/k6z;)V

    .line 671
    .line 672
    .line 673
    new-instance v0, La/sy2;

    .line 674
    .line 675
    const/4 v11, 0x5

    .line 676
    invoke-direct {v0, v11}, La/sy2;-><init>(B)V

    .line 677
    .line 678
    .line 679
    const/4 v2, 0x0

    .line 680
    invoke-static {v1, v2, v2, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    return-object v0

    .line 685
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
