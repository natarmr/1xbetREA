.class public final La/gtq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gtq;->a:B

    iput-object p1, p0, La/gtq;->b:La/pz40;

    iput-object p2, p0, La/gtq;->c:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 16

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
    move-wide/from16 v3, p3

    .line 8
    .line 9
    iget-byte v5, v0, La/gtq;->a:B

    .line 10
    .line 11
    iget-object v9, v0, La/gtq;->c:La/pz40;

    .line 12
    .line 13
    iget-object v0, v0, La/gtq;->b:La/pz40;

    .line 14
    .line 15
    const-string v6, "PERIOD_CONTENT_ID"

    .line 16
    .line 17
    const-string v7, "TOTAL_CONTENT_ID"

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    packed-switch v5, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    new-instance v0, La/rnp;

    .line 33
    .line 34
    const/16 v2, 0x14

    .line 35
    .line 36
    invoke-direct {v0, v2}, La/rnp;-><init>(B)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v10, v10, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 40
    .line 41
    .line 42
    move-result-object v11

    .line 43
    goto/16 :goto_9

    .line 44
    .line 45
    :cond_0
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 46
    .line 47
    .line 48
    move-result v12

    .line 49
    new-instance v13, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    move v8, v10

    .line 59
    :goto_0
    if-ge v8, v5, :cond_2

    .line 60
    .line 61
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v14

    .line 65
    check-cast v14, La/pj30;

    .line 66
    .line 67
    invoke-static {v14}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    invoke-static {v15, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v15

    .line 75
    if-eqz v15, :cond_1

    .line 76
    .line 77
    invoke-interface {v14, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 78
    .line 79
    .line 80
    move-result-object v14

    .line 81
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    move v7, v10

    .line 92
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_3

    .line 97
    .line 98
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    check-cast v8, La/pu90;

    .line 103
    .line 104
    iget v8, v8, La/pu90;->a:I

    .line 105
    .line 106
    add-int/2addr v7, v8

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    sub-int v5, v12, v7

    .line 109
    .line 110
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    move v8, v10

    .line 115
    :goto_2
    if-ge v8, v7, :cond_5

    .line 116
    .line 117
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    move-object v15, v14

    .line 122
    check-cast v15, La/pj30;

    .line 123
    .line 124
    invoke-static {v15}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v15

    .line 128
    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v15

    .line 132
    if-eqz v15, :cond_4

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    const/4 v14, 0x0

    .line 139
    :goto_3
    check-cast v14, La/pj30;

    .line 140
    .line 141
    if-eqz v14, :cond_6

    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    const/16 v8, 0xd

    .line 145
    .line 146
    const/4 v4, 0x0

    .line 147
    const/4 v6, 0x0

    .line 148
    move-wide/from16 v2, p3

    .line 149
    .line 150
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    invoke-interface {v14, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    goto :goto_4

    .line 159
    :cond_6
    const/4 v2, 0x0

    .line 160
    :goto_4
    if-eqz v2, :cond_7

    .line 161
    .line 162
    iget v3, v2, La/pu90;->a:I

    .line 163
    .line 164
    invoke-interface {v1, v3}, La/w6k;->r0(I)F

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    new-instance v4, La/ycl;

    .line 169
    .line 170
    invoke-direct {v4, v3}, La/ycl;-><init>(F)V

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_7
    const/4 v4, 0x0

    .line 175
    :goto_5
    invoke-interface {v0, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eqz v3, :cond_d

    .line 187
    .line 188
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    check-cast v3, La/pu90;

    .line 193
    .line 194
    iget v3, v3, La/pu90;->b:I

    .line 195
    .line 196
    :cond_8
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-eqz v4, :cond_9

    .line 201
    .line 202
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    check-cast v4, La/pu90;

    .line 207
    .line 208
    iget v4, v4, La/pu90;->b:I

    .line 209
    .line 210
    if-ge v3, v4, :cond_8

    .line 211
    .line 212
    move v3, v4

    .line 213
    goto :goto_6

    .line 214
    :cond_9
    if-eqz v2, :cond_a

    .line 215
    .line 216
    iget v0, v2, La/pu90;->b:I

    .line 217
    .line 218
    goto :goto_7

    .line 219
    :cond_a
    move v0, v10

    .line 220
    :goto_7
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    move v4, v10

    .line 229
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_b

    .line 234
    .line 235
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    check-cast v5, La/pu90;

    .line 240
    .line 241
    iget v5, v5, La/pu90;->a:I

    .line 242
    .line 243
    add-int/2addr v4, v5

    .line 244
    goto :goto_8

    .line 245
    :cond_b
    if-eqz v2, :cond_c

    .line 246
    .line 247
    iget v10, v2, La/pu90;->a:I

    .line 248
    .line 249
    :cond_c
    add-int/2addr v4, v10

    .line 250
    invoke-static {v12, v4}, Ljava/lang/Math;->min(II)I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    invoke-interface {v1, v0}, La/w6k;->r0(I)F

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    new-instance v5, La/ycl;

    .line 259
    .line 260
    invoke-direct {v5, v4}, La/ycl;-><init>(F)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v9, v5}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    new-instance v4, La/ftq;

    .line 267
    .line 268
    const/4 v5, 0x1

    .line 269
    invoke-direct {v4, v13, v2, v3, v5}, La/ftq;-><init>(Ljava/util/ArrayList;La/pu90;IB)V

    .line 270
    .line 271
    .line 272
    invoke-static {v1, v3, v0, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 273
    .line 274
    .line 275
    move-result-object v11

    .line 276
    goto :goto_9

    .line 277
    :cond_d
    invoke-static {}, La/itt0;->a()V

    .line 278
    .line 279
    .line 280
    const/4 v11, 0x0

    .line 281
    :goto_9
    return-object v11

    .line 282
    :pswitch_0
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    if-eqz v5, :cond_e

    .line 287
    .line 288
    new-instance v0, La/rnp;

    .line 289
    .line 290
    const/16 v2, 0x13

    .line 291
    .line 292
    invoke-direct {v0, v2}, La/rnp;-><init>(B)V

    .line 293
    .line 294
    .line 295
    invoke-static {v1, v10, v10, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    goto/16 :goto_14

    .line 300
    .line 301
    :cond_e
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 302
    .line 303
    .line 304
    move-result v12

    .line 305
    new-instance v13, Ljava/util/ArrayList;

    .line 306
    .line 307
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 308
    .line 309
    .line 310
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 311
    .line 312
    .line 313
    move-result v5

    .line 314
    move v8, v10

    .line 315
    :goto_a
    if-ge v8, v5, :cond_11

    .line 316
    .line 317
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v14

    .line 321
    check-cast v14, La/pj30;

    .line 322
    .line 323
    invoke-static {v14}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v15

    .line 327
    const-string v11, "RED_CARDS_CONTENT_ID"

    .line 328
    .line 329
    invoke-static {v15, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    if-nez v11, :cond_f

    .line 334
    .line 335
    const-string v11, "YELLOW_CARDS_CONTENT_ID"

    .line 336
    .line 337
    invoke-static {v15, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    if-nez v11, :cond_f

    .line 342
    .line 343
    const-string v11, "CORNERS_CONTENT_ID"

    .line 344
    .line 345
    invoke-static {v15, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v11

    .line 349
    if-nez v11, :cond_f

    .line 350
    .line 351
    invoke-static {v15, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v11

    .line 355
    if-eqz v11, :cond_10

    .line 356
    .line 357
    :cond_f
    invoke-interface {v14, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    :cond_10
    add-int/lit8 v8, v8, 0x1

    .line 365
    .line 366
    goto :goto_a

    .line 367
    :cond_11
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    move v7, v10

    .line 372
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v8

    .line 376
    if-eqz v8, :cond_12

    .line 377
    .line 378
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v8

    .line 382
    check-cast v8, La/pu90;

    .line 383
    .line 384
    iget v8, v8, La/pu90;->a:I

    .line 385
    .line 386
    add-int/2addr v7, v8

    .line 387
    goto :goto_b

    .line 388
    :cond_12
    sub-int v5, v12, v7

    .line 389
    .line 390
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 391
    .line 392
    .line 393
    move-result v7

    .line 394
    move v8, v10

    .line 395
    :goto_c
    if-ge v8, v7, :cond_14

    .line 396
    .line 397
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v11

    .line 401
    move-object v14, v11

    .line 402
    check-cast v14, La/pj30;

    .line 403
    .line 404
    invoke-static {v14}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v14

    .line 408
    invoke-static {v14, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v14

    .line 412
    if-eqz v14, :cond_13

    .line 413
    .line 414
    goto :goto_d

    .line 415
    :cond_13
    add-int/lit8 v8, v8, 0x1

    .line 416
    .line 417
    goto :goto_c

    .line 418
    :cond_14
    const/4 v11, 0x0

    .line 419
    :goto_d
    check-cast v11, La/pj30;

    .line 420
    .line 421
    if-eqz v11, :cond_15

    .line 422
    .line 423
    const/4 v7, 0x0

    .line 424
    const/16 v8, 0xd

    .line 425
    .line 426
    const/4 v4, 0x0

    .line 427
    const/4 v6, 0x0

    .line 428
    move-wide/from16 v2, p3

    .line 429
    .line 430
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 431
    .line 432
    .line 433
    move-result-wide v2

    .line 434
    invoke-interface {v11, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    goto :goto_e

    .line 439
    :cond_15
    const/4 v2, 0x0

    .line 440
    :goto_e
    if-eqz v2, :cond_16

    .line 441
    .line 442
    iget v3, v2, La/pu90;->a:I

    .line 443
    .line 444
    invoke-interface {v1, v3}, La/w6k;->r0(I)F

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    new-instance v4, La/ycl;

    .line 449
    .line 450
    invoke-direct {v4, v3}, La/ycl;-><init>(F)V

    .line 451
    .line 452
    .line 453
    goto :goto_f

    .line 454
    :cond_16
    const/4 v4, 0x0

    .line 455
    :goto_f
    invoke-interface {v0, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    if-eqz v3, :cond_1c

    .line 467
    .line 468
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    check-cast v3, La/pu90;

    .line 473
    .line 474
    iget v3, v3, La/pu90;->b:I

    .line 475
    .line 476
    :cond_17
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    if-eqz v4, :cond_18

    .line 481
    .line 482
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    check-cast v4, La/pu90;

    .line 487
    .line 488
    iget v4, v4, La/pu90;->b:I

    .line 489
    .line 490
    if-ge v3, v4, :cond_17

    .line 491
    .line 492
    move v3, v4

    .line 493
    goto :goto_10

    .line 494
    :cond_18
    if-eqz v2, :cond_19

    .line 495
    .line 496
    iget v0, v2, La/pu90;->b:I

    .line 497
    .line 498
    goto :goto_11

    .line 499
    :cond_19
    move v0, v10

    .line 500
    :goto_11
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    move v4, v10

    .line 509
    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 510
    .line 511
    .line 512
    move-result v5

    .line 513
    if-eqz v5, :cond_1a

    .line 514
    .line 515
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    check-cast v5, La/pu90;

    .line 520
    .line 521
    iget v5, v5, La/pu90;->a:I

    .line 522
    .line 523
    add-int/2addr v4, v5

    .line 524
    goto :goto_12

    .line 525
    :cond_1a
    if-eqz v2, :cond_1b

    .line 526
    .line 527
    iget v3, v2, La/pu90;->a:I

    .line 528
    .line 529
    goto :goto_13

    .line 530
    :cond_1b
    move v3, v10

    .line 531
    :goto_13
    add-int/2addr v4, v3

    .line 532
    invoke-static {v12, v4}, Ljava/lang/Math;->min(II)I

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    invoke-interface {v1, v0}, La/w6k;->r0(I)F

    .line 537
    .line 538
    .line 539
    move-result v4

    .line 540
    new-instance v5, La/ycl;

    .line 541
    .line 542
    invoke-direct {v5, v4}, La/ycl;-><init>(F)V

    .line 543
    .line 544
    .line 545
    invoke-interface {v9, v5}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    new-instance v4, La/ftq;

    .line 549
    .line 550
    invoke-direct {v4, v13, v2, v3, v10}, La/ftq;-><init>(Ljava/util/ArrayList;La/pu90;IB)V

    .line 551
    .line 552
    .line 553
    invoke-static {v1, v3, v0, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 554
    .line 555
    .line 556
    move-result-object v11

    .line 557
    goto :goto_14

    .line 558
    :cond_1c
    invoke-static {}, La/itt0;->a()V

    .line 559
    .line 560
    .line 561
    const/4 v11, 0x0

    .line 562
    :goto_14
    return-object v11

    .line 563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
