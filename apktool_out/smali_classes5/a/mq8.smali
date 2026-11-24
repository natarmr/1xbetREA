.class public final La/mq8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mq8;->a:B

    iput p1, p0, La/mq8;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 33

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
    iget-byte v3, v0, La/mq8;->a:B

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const-string v5, "REGISTER_OVERLAY_LOADER_ID"

    .line 11
    .line 12
    const-string v6, "TOOLBAR_ID"

    .line 13
    .line 14
    const-string v7, "width and height must be >= 0"

    .line 15
    .line 16
    const-string v8, "APP_VERSION_ID"

    .line 17
    .line 18
    const-string v9, "STEP_PROGRESS_BAR_ID"

    .line 19
    .line 20
    const-string v10, "PARTNER_LOGO_ID"

    .line 21
    .line 22
    const-string v11, "COMPANY_LOGO_ID"

    .line 23
    .line 24
    const-string v12, "MEDIA_ID"

    .line 25
    .line 26
    iget v14, v0, La/mq8;->b:I

    .line 27
    .line 28
    const/4 v15, 0x1

    .line 29
    const/4 v13, 0x0

    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    packed-switch v3, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    new-instance v0, La/bue0;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v0, v2}, La/bue0;-><init>(B)V

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v13, v13, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    move v7, v13

    .line 68
    move v8, v7

    .line 69
    move v9, v8

    .line 70
    :goto_0
    iget v10, v0, La/mq8;->b:I

    .line 71
    .line 72
    if-ge v7, v4, :cond_6

    .line 73
    .line 74
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    check-cast v11, La/pj30;

    .line 79
    .line 80
    invoke-static {v11}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    const-string v14, "REGISTER_BUTTON_ID"

    .line 85
    .line 86
    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v14

    .line 90
    if-eqz v14, :cond_1

    .line 91
    .line 92
    const/16 v20, 0x0

    .line 93
    .line 94
    const/16 v21, 0xb

    .line 95
    .line 96
    const/16 v17, 0x0

    .line 97
    .line 98
    const/16 v18, 0x0

    .line 99
    .line 100
    const/16 v19, 0x0

    .line 101
    .line 102
    move-wide/from16 v15, p3

    .line 103
    .line 104
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 105
    .line 106
    .line 107
    move-result-wide v13

    .line 108
    invoke-interface {v11, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    iget v10, v8, La/pu90;->b:I

    .line 113
    .line 114
    goto/16 :goto_4

    .line 115
    .line 116
    :cond_1
    invoke-static {v12, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    if-eqz v13, :cond_2

    .line 121
    .line 122
    const/16 v20, 0x0

    .line 123
    .line 124
    const/16 v21, 0xb

    .line 125
    .line 126
    const/16 v17, 0x0

    .line 127
    .line 128
    const/16 v18, 0x0

    .line 129
    .line 130
    const/16 v19, 0x0

    .line 131
    .line 132
    move-wide/from16 v15, p3

    .line 133
    .line 134
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 135
    .line 136
    .line 137
    move-result-wide v9

    .line 138
    invoke-interface {v11, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    iget v10, v9, La/pu90;->b:I

    .line 143
    .line 144
    move/from16 v32, v10

    .line 145
    .line 146
    move v10, v8

    .line 147
    move-object v8, v9

    .line 148
    move/from16 v9, v32

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_2
    invoke-static {v12, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    if-eqz v12, :cond_4

    .line 156
    .line 157
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    sub-int/2addr v10, v9

    .line 162
    if-gez v10, :cond_3

    .line 163
    .line 164
    const/16 v20, 0x0

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_3
    move/from16 v20, v10

    .line 168
    .line 169
    :goto_1
    const/16 v21, 0x3

    .line 170
    .line 171
    const/16 v17, 0x0

    .line 172
    .line 173
    const/16 v18, 0x0

    .line 174
    .line 175
    const/16 v19, 0x0

    .line 176
    .line 177
    move-wide/from16 v15, p3

    .line 178
    .line 179
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 180
    .line 181
    .line 182
    move-result-wide v12

    .line 183
    invoke-interface {v11, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    :goto_2
    move-object/from16 v32, v10

    .line 188
    .line 189
    move v10, v8

    .line 190
    move-object/from16 v8, v32

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_4
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 194
    .line 195
    .line 196
    move-result v12

    .line 197
    sub-int/2addr v12, v8

    .line 198
    sub-int/2addr v12, v9

    .line 199
    sub-int v10, v12, v10

    .line 200
    .line 201
    if-gez v10, :cond_5

    .line 202
    .line 203
    const/16 v20, 0x0

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_5
    move/from16 v20, v10

    .line 207
    .line 208
    :goto_3
    const/16 v21, 0x3

    .line 209
    .line 210
    const/16 v17, 0x0

    .line 211
    .line 212
    const/16 v18, 0x0

    .line 213
    .line 214
    const/16 v19, 0x0

    .line 215
    .line 216
    move-wide/from16 v15, p3

    .line 217
    .line 218
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 219
    .line 220
    .line 221
    move-result-wide v12

    .line 222
    invoke-interface {v11, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    goto :goto_2

    .line 227
    :goto_4
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    add-int/lit8 v7, v7, 0x1

    .line 231
    .line 232
    move v8, v10

    .line 233
    const/4 v13, 0x0

    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_6
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    new-instance v2, La/mu7;

    .line 245
    .line 246
    const/4 v7, 0x3

    .line 247
    move-wide/from16 v4, p3

    .line 248
    .line 249
    move v6, v10

    .line 250
    invoke-direct/range {v2 .. v7}, La/mu7;-><init>(Ljava/util/ArrayList;JIB)V

    .line 251
    .line 252
    .line 253
    invoke-static {v1, v0, v8, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    :goto_5
    return-object v0

    .line 258
    :pswitch_0
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-eqz v3, :cond_7

    .line 263
    .line 264
    new-instance v0, La/bue0;

    .line 265
    .line 266
    invoke-direct {v0, v4}, La/bue0;-><init>(B)V

    .line 267
    .line 268
    .line 269
    const/4 v2, 0x0

    .line 270
    invoke-static {v1, v2, v2, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    goto/16 :goto_c

    .line 275
    .line 276
    :cond_7
    new-instance v3, Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 283
    .line 284
    .line 285
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    const/4 v6, 0x0

    .line 290
    const/4 v7, 0x0

    .line 291
    const/4 v8, 0x0

    .line 292
    :goto_6
    iget v9, v0, La/mq8;->b:I

    .line 293
    .line 294
    if-ge v6, v4, :cond_e

    .line 295
    .line 296
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    check-cast v10, La/pj30;

    .line 301
    .line 302
    invoke-static {v10}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v11

    .line 306
    const-string v12, "REGISTER_BOTTOM_BAR_ID"

    .line 307
    .line 308
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v12

    .line 312
    if-eqz v12, :cond_8

    .line 313
    .line 314
    const/16 v20, 0x0

    .line 315
    .line 316
    const/16 v21, 0xb

    .line 317
    .line 318
    const/16 v17, 0x0

    .line 319
    .line 320
    const/16 v18, 0x0

    .line 321
    .line 322
    const/16 v19, 0x0

    .line 323
    .line 324
    move-wide/from16 v15, p3

    .line 325
    .line 326
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 327
    .line 328
    .line 329
    move-result-wide v11

    .line 330
    invoke-interface {v10, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    iget v9, v7, La/pu90;->b:I

    .line 335
    .line 336
    goto/16 :goto_b

    .line 337
    .line 338
    :cond_8
    const-string v12, "REGISTER_APP_BAR_ID"

    .line 339
    .line 340
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v12

    .line 344
    if-eqz v12, :cond_9

    .line 345
    .line 346
    const/16 v20, 0x0

    .line 347
    .line 348
    const/16 v21, 0xb

    .line 349
    .line 350
    const/16 v17, 0x0

    .line 351
    .line 352
    const/16 v18, 0x0

    .line 353
    .line 354
    const/16 v19, 0x0

    .line 355
    .line 356
    move-wide/from16 v15, p3

    .line 357
    .line 358
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 359
    .line 360
    .line 361
    move-result-wide v8

    .line 362
    invoke-interface {v10, v8, v9}, La/pj30;->S(J)La/pu90;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    iget v9, v8, La/pu90;->b:I

    .line 367
    .line 368
    move/from16 v32, v9

    .line 369
    .line 370
    move v9, v7

    .line 371
    move-object v7, v8

    .line 372
    move/from16 v8, v32

    .line 373
    .line 374
    goto :goto_b

    .line 375
    :cond_9
    const-string v12, "REGISTER_LOADER_ID"

    .line 376
    .line 377
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v12

    .line 381
    if-nez v12, :cond_c

    .line 382
    .line 383
    invoke-static {v11, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v11

    .line 387
    if-eqz v11, :cond_a

    .line 388
    .line 389
    goto :goto_9

    .line 390
    :cond_a
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 391
    .line 392
    .line 393
    move-result v11

    .line 394
    sub-int/2addr v11, v7

    .line 395
    sub-int/2addr v11, v8

    .line 396
    sub-int v9, v11, v9

    .line 397
    .line 398
    if-gez v9, :cond_b

    .line 399
    .line 400
    const/16 v20, 0x0

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_b
    move/from16 v20, v9

    .line 404
    .line 405
    :goto_7
    const/16 v21, 0x3

    .line 406
    .line 407
    const/16 v17, 0x0

    .line 408
    .line 409
    const/16 v18, 0x0

    .line 410
    .line 411
    const/16 v19, 0x0

    .line 412
    .line 413
    move-wide/from16 v15, p3

    .line 414
    .line 415
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 416
    .line 417
    .line 418
    move-result-wide v11

    .line 419
    invoke-interface {v10, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 420
    .line 421
    .line 422
    move-result-object v9

    .line 423
    :goto_8
    move-object/from16 v32, v9

    .line 424
    .line 425
    move v9, v7

    .line 426
    move-object/from16 v7, v32

    .line 427
    .line 428
    goto :goto_b

    .line 429
    :cond_c
    :goto_9
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 430
    .line 431
    .line 432
    move-result v9

    .line 433
    sub-int/2addr v9, v8

    .line 434
    if-gez v9, :cond_d

    .line 435
    .line 436
    const/16 v20, 0x0

    .line 437
    .line 438
    goto :goto_a

    .line 439
    :cond_d
    move/from16 v20, v9

    .line 440
    .line 441
    :goto_a
    const/16 v21, 0x3

    .line 442
    .line 443
    const/16 v17, 0x0

    .line 444
    .line 445
    const/16 v18, 0x0

    .line 446
    .line 447
    const/16 v19, 0x0

    .line 448
    .line 449
    move-wide/from16 v15, p3

    .line 450
    .line 451
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 452
    .line 453
    .line 454
    move-result-wide v11

    .line 455
    invoke-interface {v10, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 456
    .line 457
    .line 458
    move-result-object v9

    .line 459
    goto :goto_8

    .line 460
    :goto_b
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    add-int/lit8 v6, v6, 0x1

    .line 464
    .line 465
    move v7, v9

    .line 466
    goto/16 :goto_6

    .line 467
    .line 468
    :cond_e
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    new-instance v15, La/mu7;

    .line 477
    .line 478
    const/16 v20, 0x2

    .line 479
    .line 480
    move-wide/from16 v17, p3

    .line 481
    .line 482
    move-object/from16 v16, v3

    .line 483
    .line 484
    move/from16 v19, v9

    .line 485
    .line 486
    invoke-direct/range {v15 .. v20}, La/mu7;-><init>(Ljava/util/ArrayList;JIB)V

    .line 487
    .line 488
    .line 489
    invoke-static {v1, v0, v2, v15}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    :goto_c
    return-object v0

    .line 494
    :pswitch_1
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    sub-int/2addr v0, v14

    .line 499
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 500
    .line 501
    .line 502
    move-result-object v3

    .line 503
    :cond_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    if-eqz v4, :cond_10

    .line 508
    .line 509
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    move-object v5, v4

    .line 514
    check-cast v5, La/pj30;

    .line 515
    .line 516
    invoke-static {v5}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v5

    .line 524
    if-eqz v5, :cond_f

    .line 525
    .line 526
    goto :goto_d

    .line 527
    :cond_10
    const/4 v4, 0x0

    .line 528
    :goto_d
    check-cast v4, La/pj30;

    .line 529
    .line 530
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    :cond_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 535
    .line 536
    .line 537
    move-result v5

    .line 538
    if-eqz v5, :cond_12

    .line 539
    .line 540
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    move-object v6, v5

    .line 545
    check-cast v6, La/pj30;

    .line 546
    .line 547
    invoke-static {v6}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v6

    .line 551
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v6

    .line 555
    if-eqz v6, :cond_11

    .line 556
    .line 557
    goto :goto_e

    .line 558
    :cond_12
    const/4 v5, 0x0

    .line 559
    :goto_e
    check-cast v5, La/pj30;

    .line 560
    .line 561
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    :cond_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 566
    .line 567
    .line 568
    move-result v6

    .line 569
    if-eqz v6, :cond_14

    .line 570
    .line 571
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v6

    .line 575
    move-object v11, v6

    .line 576
    check-cast v11, La/pj30;

    .line 577
    .line 578
    invoke-static {v11}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v11

    .line 582
    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v11

    .line 586
    if-eqz v11, :cond_13

    .line 587
    .line 588
    goto :goto_f

    .line 589
    :cond_14
    const/4 v6, 0x0

    .line 590
    :goto_f
    check-cast v6, La/pj30;

    .line 591
    .line 592
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    :cond_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 597
    .line 598
    .line 599
    move-result v10

    .line 600
    if-eqz v10, :cond_16

    .line 601
    .line 602
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v10

    .line 606
    move-object v11, v10

    .line 607
    check-cast v11, La/pj30;

    .line 608
    .line 609
    invoke-static {v11}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v11

    .line 613
    invoke-static {v11, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v11

    .line 617
    if-eqz v11, :cond_15

    .line 618
    .line 619
    goto :goto_10

    .line 620
    :cond_16
    const/4 v10, 0x0

    .line 621
    :goto_10
    check-cast v10, La/pj30;

    .line 622
    .line 623
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    :cond_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 628
    .line 629
    .line 630
    move-result v3

    .line 631
    if-eqz v3, :cond_18

    .line 632
    .line 633
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v3

    .line 637
    move-object v9, v3

    .line 638
    check-cast v9, La/pj30;

    .line 639
    .line 640
    invoke-static {v9}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v9

    .line 644
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    move-result v9

    .line 648
    if-eqz v9, :cond_17

    .line 649
    .line 650
    goto :goto_11

    .line 651
    :cond_18
    const/4 v3, 0x0

    .line 652
    :goto_11
    check-cast v3, La/pj30;

    .line 653
    .line 654
    if-eqz v4, :cond_1c

    .line 655
    .line 656
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 657
    .line 658
    .line 659
    move-result v2

    .line 660
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 661
    .line 662
    .line 663
    move-result v8

    .line 664
    if-ltz v2, :cond_19

    .line 665
    .line 666
    move v9, v15

    .line 667
    goto :goto_12

    .line 668
    :cond_19
    const/4 v9, 0x0

    .line 669
    :goto_12
    if-ltz v8, :cond_1a

    .line 670
    .line 671
    goto :goto_13

    .line 672
    :cond_1a
    const/4 v15, 0x0

    .line 673
    :goto_13
    and-int/2addr v9, v15

    .line 674
    if-nez v9, :cond_1b

    .line 675
    .line 676
    invoke-static {v7}, La/zcx;->a(Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    :cond_1b
    invoke-static {v2, v2, v8, v8}, La/r4e;->h(IIII)J

    .line 680
    .line 681
    .line 682
    move-result-wide v7

    .line 683
    invoke-interface {v4, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    goto :goto_14

    .line 688
    :cond_1c
    const/4 v2, 0x0

    .line 689
    :goto_14
    if-eqz v5, :cond_1d

    .line 690
    .line 691
    const/16 v27, 0x0

    .line 692
    .line 693
    const/16 v28, 0xa

    .line 694
    .line 695
    const/16 v24, 0x0

    .line 696
    .line 697
    const/16 v25, 0x0

    .line 698
    .line 699
    const/16 v26, 0x0

    .line 700
    .line 701
    move-wide/from16 v22, p3

    .line 702
    .line 703
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 704
    .line 705
    .line 706
    move-result-wide v7

    .line 707
    invoke-interface {v5, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 708
    .line 709
    .line 710
    move-result-object v4

    .line 711
    goto :goto_15

    .line 712
    :cond_1d
    const/4 v4, 0x0

    .line 713
    :goto_15
    if-eqz v6, :cond_1e

    .line 714
    .line 715
    const/16 v27, 0x0

    .line 716
    .line 717
    const/16 v28, 0xa

    .line 718
    .line 719
    const/16 v24, 0x0

    .line 720
    .line 721
    const/16 v25, 0x0

    .line 722
    .line 723
    const/16 v26, 0x0

    .line 724
    .line 725
    move-wide/from16 v22, p3

    .line 726
    .line 727
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 728
    .line 729
    .line 730
    move-result-wide v7

    .line 731
    invoke-interface {v6, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 732
    .line 733
    .line 734
    move-result-object v5

    .line 735
    goto :goto_16

    .line 736
    :cond_1e
    const/4 v5, 0x0

    .line 737
    :goto_16
    if-eqz v10, :cond_1f

    .line 738
    .line 739
    const/16 v27, 0x0

    .line 740
    .line 741
    const/16 v28, 0xa

    .line 742
    .line 743
    const/16 v24, 0x0

    .line 744
    .line 745
    const/16 v25, 0x0

    .line 746
    .line 747
    const/16 v26, 0x0

    .line 748
    .line 749
    move-wide/from16 v22, p3

    .line 750
    .line 751
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 752
    .line 753
    .line 754
    move-result-wide v6

    .line 755
    invoke-interface {v10, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 756
    .line 757
    .line 758
    move-result-object v6

    .line 759
    move-object/from16 v30, v6

    .line 760
    .line 761
    goto :goto_17

    .line 762
    :cond_1f
    const/16 v30, 0x0

    .line 763
    .line 764
    :goto_17
    if-eqz v3, :cond_20

    .line 765
    .line 766
    const/16 v20, 0x0

    .line 767
    .line 768
    const/16 v21, 0xa

    .line 769
    .line 770
    const/16 v17, 0x0

    .line 771
    .line 772
    const/16 v18, 0x0

    .line 773
    .line 774
    const/16 v19, 0x0

    .line 775
    .line 776
    move-wide/from16 v15, p3

    .line 777
    .line 778
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 779
    .line 780
    .line 781
    move-result-wide v6

    .line 782
    invoke-interface {v3, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 783
    .line 784
    .line 785
    move-result-object v13

    .line 786
    move-object/from16 v29, v13

    .line 787
    .line 788
    goto :goto_18

    .line 789
    :cond_20
    const/16 v29, 0x0

    .line 790
    .line 791
    :goto_18
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 792
    .line 793
    .line 794
    move-result v3

    .line 795
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 796
    .line 797
    .line 798
    move-result v6

    .line 799
    new-instance v22, La/oq00;

    .line 800
    .line 801
    const/16 v31, 0x4

    .line 802
    .line 803
    move-wide/from16 v25, p3

    .line 804
    .line 805
    move/from16 v27, v0

    .line 806
    .line 807
    move-object/from16 v23, v2

    .line 808
    .line 809
    move-object/from16 v24, v4

    .line 810
    .line 811
    move-object/from16 v28, v5

    .line 812
    .line 813
    invoke-direct/range {v22 .. v31}, La/oq00;-><init>(La/pu90;La/pu90;JILa/pu90;La/pu90;La/pu90;B)V

    .line 814
    .line 815
    .line 816
    move-object/from16 v0, v22

    .line 817
    .line 818
    invoke-static {v1, v3, v6, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    return-object v0

    .line 823
    :pswitch_2
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 824
    .line 825
    .line 826
    move-result v0

    .line 827
    sub-int/2addr v0, v14

    .line 828
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    :cond_21
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 833
    .line 834
    .line 835
    move-result v4

    .line 836
    if-eqz v4, :cond_22

    .line 837
    .line 838
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v4

    .line 842
    move-object v5, v4

    .line 843
    check-cast v5, La/pj30;

    .line 844
    .line 845
    invoke-static {v5}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v5

    .line 849
    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v5

    .line 853
    if-eqz v5, :cond_21

    .line 854
    .line 855
    goto :goto_19

    .line 856
    :cond_22
    const/4 v4, 0x0

    .line 857
    :goto_19
    check-cast v4, La/pj30;

    .line 858
    .line 859
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 860
    .line 861
    .line 862
    move-result-object v3

    .line 863
    :cond_23
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 864
    .line 865
    .line 866
    move-result v5

    .line 867
    if-eqz v5, :cond_24

    .line 868
    .line 869
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v5

    .line 873
    move-object v6, v5

    .line 874
    check-cast v6, La/pj30;

    .line 875
    .line 876
    invoke-static {v6}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v6

    .line 880
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 881
    .line 882
    .line 883
    move-result v6

    .line 884
    if-eqz v6, :cond_23

    .line 885
    .line 886
    goto :goto_1a

    .line 887
    :cond_24
    const/4 v5, 0x0

    .line 888
    :goto_1a
    check-cast v5, La/pj30;

    .line 889
    .line 890
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 891
    .line 892
    .line 893
    move-result-object v3

    .line 894
    :cond_25
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 895
    .line 896
    .line 897
    move-result v6

    .line 898
    if-eqz v6, :cond_26

    .line 899
    .line 900
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v6

    .line 904
    move-object v11, v6

    .line 905
    check-cast v11, La/pj30;

    .line 906
    .line 907
    invoke-static {v11}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v11

    .line 911
    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v11

    .line 915
    if-eqz v11, :cond_25

    .line 916
    .line 917
    goto :goto_1b

    .line 918
    :cond_26
    const/4 v6, 0x0

    .line 919
    :goto_1b
    check-cast v6, La/pj30;

    .line 920
    .line 921
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 922
    .line 923
    .line 924
    move-result-object v3

    .line 925
    :cond_27
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 926
    .line 927
    .line 928
    move-result v10

    .line 929
    if-eqz v10, :cond_28

    .line 930
    .line 931
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v10

    .line 935
    move-object v11, v10

    .line 936
    check-cast v11, La/pj30;

    .line 937
    .line 938
    invoke-static {v11}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v11

    .line 942
    invoke-static {v11, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 943
    .line 944
    .line 945
    move-result v11

    .line 946
    if-eqz v11, :cond_27

    .line 947
    .line 948
    goto :goto_1c

    .line 949
    :cond_28
    const/4 v10, 0x0

    .line 950
    :goto_1c
    check-cast v10, La/pj30;

    .line 951
    .line 952
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 953
    .line 954
    .line 955
    move-result-object v2

    .line 956
    :cond_29
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 957
    .line 958
    .line 959
    move-result v3

    .line 960
    if-eqz v3, :cond_2a

    .line 961
    .line 962
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v3

    .line 966
    move-object v9, v3

    .line 967
    check-cast v9, La/pj30;

    .line 968
    .line 969
    invoke-static {v9}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v9

    .line 973
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    move-result v9

    .line 977
    if-eqz v9, :cond_29

    .line 978
    .line 979
    goto :goto_1d

    .line 980
    :cond_2a
    const/4 v3, 0x0

    .line 981
    :goto_1d
    check-cast v3, La/pj30;

    .line 982
    .line 983
    if-eqz v4, :cond_2e

    .line 984
    .line 985
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 986
    .line 987
    .line 988
    move-result v2

    .line 989
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 990
    .line 991
    .line 992
    move-result v8

    .line 993
    if-ltz v2, :cond_2b

    .line 994
    .line 995
    move v9, v15

    .line 996
    goto :goto_1e

    .line 997
    :cond_2b
    const/4 v9, 0x0

    .line 998
    :goto_1e
    if-ltz v8, :cond_2c

    .line 999
    .line 1000
    goto :goto_1f

    .line 1001
    :cond_2c
    const/4 v15, 0x0

    .line 1002
    :goto_1f
    and-int/2addr v9, v15

    .line 1003
    if-nez v9, :cond_2d

    .line 1004
    .line 1005
    invoke-static {v7}, La/zcx;->a(Ljava/lang/String;)V

    .line 1006
    .line 1007
    .line 1008
    :cond_2d
    invoke-static {v2, v2, v8, v8}, La/r4e;->h(IIII)J

    .line 1009
    .line 1010
    .line 1011
    move-result-wide v7

    .line 1012
    invoke-interface {v4, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v2

    .line 1016
    goto :goto_20

    .line 1017
    :cond_2e
    const/4 v2, 0x0

    .line 1018
    :goto_20
    if-eqz v5, :cond_2f

    .line 1019
    .line 1020
    const/16 v27, 0x0

    .line 1021
    .line 1022
    const/16 v28, 0xa

    .line 1023
    .line 1024
    const/16 v24, 0x0

    .line 1025
    .line 1026
    const/16 v25, 0x0

    .line 1027
    .line 1028
    const/16 v26, 0x0

    .line 1029
    .line 1030
    move-wide/from16 v22, p3

    .line 1031
    .line 1032
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 1033
    .line 1034
    .line 1035
    move-result-wide v7

    .line 1036
    invoke-interface {v5, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v4

    .line 1040
    goto :goto_21

    .line 1041
    :cond_2f
    const/4 v4, 0x0

    .line 1042
    :goto_21
    if-eqz v6, :cond_30

    .line 1043
    .line 1044
    const/16 v27, 0x0

    .line 1045
    .line 1046
    const/16 v28, 0xa

    .line 1047
    .line 1048
    const/16 v24, 0x0

    .line 1049
    .line 1050
    const/16 v25, 0x0

    .line 1051
    .line 1052
    const/16 v26, 0x0

    .line 1053
    .line 1054
    move-wide/from16 v22, p3

    .line 1055
    .line 1056
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 1057
    .line 1058
    .line 1059
    move-result-wide v7

    .line 1060
    invoke-interface {v6, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v5

    .line 1064
    goto :goto_22

    .line 1065
    :cond_30
    const/4 v5, 0x0

    .line 1066
    :goto_22
    if-eqz v10, :cond_31

    .line 1067
    .line 1068
    const/16 v27, 0x0

    .line 1069
    .line 1070
    const/16 v28, 0xa

    .line 1071
    .line 1072
    const/16 v24, 0x0

    .line 1073
    .line 1074
    const/16 v25, 0x0

    .line 1075
    .line 1076
    const/16 v26, 0x0

    .line 1077
    .line 1078
    move-wide/from16 v22, p3

    .line 1079
    .line 1080
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 1081
    .line 1082
    .line 1083
    move-result-wide v6

    .line 1084
    invoke-interface {v10, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v6

    .line 1088
    move-object/from16 v30, v6

    .line 1089
    .line 1090
    goto :goto_23

    .line 1091
    :cond_31
    const/16 v30, 0x0

    .line 1092
    .line 1093
    :goto_23
    if-eqz v3, :cond_32

    .line 1094
    .line 1095
    const/16 v20, 0x0

    .line 1096
    .line 1097
    const/16 v21, 0xa

    .line 1098
    .line 1099
    const/16 v17, 0x0

    .line 1100
    .line 1101
    const/16 v18, 0x0

    .line 1102
    .line 1103
    const/16 v19, 0x0

    .line 1104
    .line 1105
    move-wide/from16 v15, p3

    .line 1106
    .line 1107
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 1108
    .line 1109
    .line 1110
    move-result-wide v6

    .line 1111
    invoke-interface {v3, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v13

    .line 1115
    move-object/from16 v29, v13

    .line 1116
    .line 1117
    goto :goto_24

    .line 1118
    :cond_32
    const/16 v29, 0x0

    .line 1119
    .line 1120
    :goto_24
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1121
    .line 1122
    .line 1123
    move-result v3

    .line 1124
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 1125
    .line 1126
    .line 1127
    move-result v6

    .line 1128
    new-instance v22, La/oq00;

    .line 1129
    .line 1130
    const/16 v31, 0x3

    .line 1131
    .line 1132
    move-wide/from16 v25, p3

    .line 1133
    .line 1134
    move/from16 v27, v0

    .line 1135
    .line 1136
    move-object/from16 v23, v2

    .line 1137
    .line 1138
    move-object/from16 v24, v4

    .line 1139
    .line 1140
    move-object/from16 v28, v5

    .line 1141
    .line 1142
    invoke-direct/range {v22 .. v31}, La/oq00;-><init>(La/pu90;La/pu90;JILa/pu90;La/pu90;La/pu90;B)V

    .line 1143
    .line 1144
    .line 1145
    move-object/from16 v0, v22

    .line 1146
    .line 1147
    invoke-static {v1, v3, v6, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    return-object v0

    .line 1152
    :pswitch_3
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 1153
    .line 1154
    .line 1155
    move-result v0

    .line 1156
    sub-int/2addr v0, v14

    .line 1157
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v3

    .line 1161
    :cond_33
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1162
    .line 1163
    .line 1164
    move-result v4

    .line 1165
    if-eqz v4, :cond_34

    .line 1166
    .line 1167
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v4

    .line 1171
    move-object v5, v4

    .line 1172
    check-cast v5, La/pj30;

    .line 1173
    .line 1174
    invoke-static {v5}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v5

    .line 1178
    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1179
    .line 1180
    .line 1181
    move-result v5

    .line 1182
    if-eqz v5, :cond_33

    .line 1183
    .line 1184
    goto :goto_25

    .line 1185
    :cond_34
    const/4 v4, 0x0

    .line 1186
    :goto_25
    check-cast v4, La/pj30;

    .line 1187
    .line 1188
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v3

    .line 1192
    :cond_35
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1193
    .line 1194
    .line 1195
    move-result v5

    .line 1196
    if-eqz v5, :cond_36

    .line 1197
    .line 1198
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v5

    .line 1202
    move-object v6, v5

    .line 1203
    check-cast v6, La/pj30;

    .line 1204
    .line 1205
    invoke-static {v6}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v6

    .line 1209
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1210
    .line 1211
    .line 1212
    move-result v6

    .line 1213
    if-eqz v6, :cond_35

    .line 1214
    .line 1215
    goto :goto_26

    .line 1216
    :cond_36
    const/4 v5, 0x0

    .line 1217
    :goto_26
    check-cast v5, La/pj30;

    .line 1218
    .line 1219
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v3

    .line 1223
    :cond_37
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1224
    .line 1225
    .line 1226
    move-result v6

    .line 1227
    if-eqz v6, :cond_38

    .line 1228
    .line 1229
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v6

    .line 1233
    move-object v11, v6

    .line 1234
    check-cast v11, La/pj30;

    .line 1235
    .line 1236
    invoke-static {v11}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v11

    .line 1240
    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1241
    .line 1242
    .line 1243
    move-result v11

    .line 1244
    if-eqz v11, :cond_37

    .line 1245
    .line 1246
    goto :goto_27

    .line 1247
    :cond_38
    const/4 v6, 0x0

    .line 1248
    :goto_27
    check-cast v6, La/pj30;

    .line 1249
    .line 1250
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v3

    .line 1254
    :cond_39
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1255
    .line 1256
    .line 1257
    move-result v10

    .line 1258
    if-eqz v10, :cond_3a

    .line 1259
    .line 1260
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v10

    .line 1264
    move-object v11, v10

    .line 1265
    check-cast v11, La/pj30;

    .line 1266
    .line 1267
    invoke-static {v11}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v11

    .line 1271
    invoke-static {v11, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1272
    .line 1273
    .line 1274
    move-result v11

    .line 1275
    if-eqz v11, :cond_39

    .line 1276
    .line 1277
    goto :goto_28

    .line 1278
    :cond_3a
    const/4 v10, 0x0

    .line 1279
    :goto_28
    check-cast v10, La/pj30;

    .line 1280
    .line 1281
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v2

    .line 1285
    :cond_3b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1286
    .line 1287
    .line 1288
    move-result v3

    .line 1289
    if-eqz v3, :cond_3c

    .line 1290
    .line 1291
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v3

    .line 1295
    move-object v9, v3

    .line 1296
    check-cast v9, La/pj30;

    .line 1297
    .line 1298
    invoke-static {v9}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v9

    .line 1302
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1303
    .line 1304
    .line 1305
    move-result v9

    .line 1306
    if-eqz v9, :cond_3b

    .line 1307
    .line 1308
    goto :goto_29

    .line 1309
    :cond_3c
    const/4 v3, 0x0

    .line 1310
    :goto_29
    check-cast v3, La/pj30;

    .line 1311
    .line 1312
    if-eqz v4, :cond_40

    .line 1313
    .line 1314
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1315
    .line 1316
    .line 1317
    move-result v2

    .line 1318
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 1319
    .line 1320
    .line 1321
    move-result v8

    .line 1322
    if-ltz v2, :cond_3d

    .line 1323
    .line 1324
    move v9, v15

    .line 1325
    goto :goto_2a

    .line 1326
    :cond_3d
    const/4 v9, 0x0

    .line 1327
    :goto_2a
    if-ltz v8, :cond_3e

    .line 1328
    .line 1329
    goto :goto_2b

    .line 1330
    :cond_3e
    const/4 v15, 0x0

    .line 1331
    :goto_2b
    and-int/2addr v9, v15

    .line 1332
    if-nez v9, :cond_3f

    .line 1333
    .line 1334
    invoke-static {v7}, La/zcx;->a(Ljava/lang/String;)V

    .line 1335
    .line 1336
    .line 1337
    :cond_3f
    invoke-static {v2, v2, v8, v8}, La/r4e;->h(IIII)J

    .line 1338
    .line 1339
    .line 1340
    move-result-wide v7

    .line 1341
    invoke-interface {v4, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v2

    .line 1345
    goto :goto_2c

    .line 1346
    :cond_40
    const/4 v2, 0x0

    .line 1347
    :goto_2c
    if-eqz v5, :cond_41

    .line 1348
    .line 1349
    const/16 v27, 0x0

    .line 1350
    .line 1351
    const/16 v28, 0xa

    .line 1352
    .line 1353
    const/16 v24, 0x0

    .line 1354
    .line 1355
    const/16 v25, 0x0

    .line 1356
    .line 1357
    const/16 v26, 0x0

    .line 1358
    .line 1359
    move-wide/from16 v22, p3

    .line 1360
    .line 1361
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 1362
    .line 1363
    .line 1364
    move-result-wide v7

    .line 1365
    invoke-interface {v5, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v4

    .line 1369
    goto :goto_2d

    .line 1370
    :cond_41
    const/4 v4, 0x0

    .line 1371
    :goto_2d
    if-eqz v6, :cond_42

    .line 1372
    .line 1373
    const/16 v27, 0x0

    .line 1374
    .line 1375
    const/16 v28, 0xa

    .line 1376
    .line 1377
    const/16 v24, 0x0

    .line 1378
    .line 1379
    const/16 v25, 0x0

    .line 1380
    .line 1381
    const/16 v26, 0x0

    .line 1382
    .line 1383
    move-wide/from16 v22, p3

    .line 1384
    .line 1385
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 1386
    .line 1387
    .line 1388
    move-result-wide v7

    .line 1389
    invoke-interface {v6, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v5

    .line 1393
    goto :goto_2e

    .line 1394
    :cond_42
    const/4 v5, 0x0

    .line 1395
    :goto_2e
    if-eqz v10, :cond_43

    .line 1396
    .line 1397
    const/16 v27, 0x0

    .line 1398
    .line 1399
    const/16 v28, 0xa

    .line 1400
    .line 1401
    const/16 v24, 0x0

    .line 1402
    .line 1403
    const/16 v25, 0x0

    .line 1404
    .line 1405
    const/16 v26, 0x0

    .line 1406
    .line 1407
    move-wide/from16 v22, p3

    .line 1408
    .line 1409
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 1410
    .line 1411
    .line 1412
    move-result-wide v6

    .line 1413
    invoke-interface {v10, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v6

    .line 1417
    move-object/from16 v30, v6

    .line 1418
    .line 1419
    goto :goto_2f

    .line 1420
    :cond_43
    const/16 v30, 0x0

    .line 1421
    .line 1422
    :goto_2f
    if-eqz v3, :cond_44

    .line 1423
    .line 1424
    const/16 v20, 0x0

    .line 1425
    .line 1426
    const/16 v21, 0xa

    .line 1427
    .line 1428
    const/16 v17, 0x0

    .line 1429
    .line 1430
    const/16 v18, 0x0

    .line 1431
    .line 1432
    const/16 v19, 0x0

    .line 1433
    .line 1434
    move-wide/from16 v15, p3

    .line 1435
    .line 1436
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 1437
    .line 1438
    .line 1439
    move-result-wide v6

    .line 1440
    invoke-interface {v3, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v13

    .line 1444
    move-object/from16 v29, v13

    .line 1445
    .line 1446
    goto :goto_30

    .line 1447
    :cond_44
    const/16 v29, 0x0

    .line 1448
    .line 1449
    :goto_30
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1450
    .line 1451
    .line 1452
    move-result v3

    .line 1453
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 1454
    .line 1455
    .line 1456
    move-result v6

    .line 1457
    new-instance v22, La/oq00;

    .line 1458
    .line 1459
    const/16 v31, 0x2

    .line 1460
    .line 1461
    move-wide/from16 v25, p3

    .line 1462
    .line 1463
    move/from16 v28, v0

    .line 1464
    .line 1465
    move-object/from16 v23, v2

    .line 1466
    .line 1467
    move-object/from16 v24, v4

    .line 1468
    .line 1469
    move-object/from16 v27, v5

    .line 1470
    .line 1471
    invoke-direct/range {v22 .. v31}, La/oq00;-><init>(La/pu90;La/pu90;JLa/pu90;ILa/pu90;La/pu90;B)V

    .line 1472
    .line 1473
    .line 1474
    move-object/from16 v0, v22

    .line 1475
    .line 1476
    invoke-static {v1, v3, v6, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v0

    .line 1480
    return-object v0

    .line 1481
    :pswitch_4
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 1482
    .line 1483
    .line 1484
    move-result v0

    .line 1485
    sub-int/2addr v0, v14

    .line 1486
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v3

    .line 1490
    :cond_45
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1491
    .line 1492
    .line 1493
    move-result v4

    .line 1494
    if-eqz v4, :cond_46

    .line 1495
    .line 1496
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v4

    .line 1500
    move-object v5, v4

    .line 1501
    check-cast v5, La/pj30;

    .line 1502
    .line 1503
    invoke-static {v5}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v5

    .line 1507
    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1508
    .line 1509
    .line 1510
    move-result v5

    .line 1511
    if-eqz v5, :cond_45

    .line 1512
    .line 1513
    goto :goto_31

    .line 1514
    :cond_46
    const/4 v4, 0x0

    .line 1515
    :goto_31
    check-cast v4, La/pj30;

    .line 1516
    .line 1517
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v3

    .line 1521
    :cond_47
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1522
    .line 1523
    .line 1524
    move-result v5

    .line 1525
    if-eqz v5, :cond_48

    .line 1526
    .line 1527
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v5

    .line 1531
    move-object v6, v5

    .line 1532
    check-cast v6, La/pj30;

    .line 1533
    .line 1534
    invoke-static {v6}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v6

    .line 1538
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1539
    .line 1540
    .line 1541
    move-result v6

    .line 1542
    if-eqz v6, :cond_47

    .line 1543
    .line 1544
    goto :goto_32

    .line 1545
    :cond_48
    const/4 v5, 0x0

    .line 1546
    :goto_32
    check-cast v5, La/pj30;

    .line 1547
    .line 1548
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v3

    .line 1552
    :cond_49
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1553
    .line 1554
    .line 1555
    move-result v6

    .line 1556
    if-eqz v6, :cond_4a

    .line 1557
    .line 1558
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v6

    .line 1562
    move-object v11, v6

    .line 1563
    check-cast v11, La/pj30;

    .line 1564
    .line 1565
    invoke-static {v11}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v11

    .line 1569
    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1570
    .line 1571
    .line 1572
    move-result v11

    .line 1573
    if-eqz v11, :cond_49

    .line 1574
    .line 1575
    goto :goto_33

    .line 1576
    :cond_4a
    const/4 v6, 0x0

    .line 1577
    :goto_33
    check-cast v6, La/pj30;

    .line 1578
    .line 1579
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v3

    .line 1583
    :cond_4b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1584
    .line 1585
    .line 1586
    move-result v10

    .line 1587
    if-eqz v10, :cond_4c

    .line 1588
    .line 1589
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v10

    .line 1593
    move-object v11, v10

    .line 1594
    check-cast v11, La/pj30;

    .line 1595
    .line 1596
    invoke-static {v11}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v11

    .line 1600
    invoke-static {v11, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1601
    .line 1602
    .line 1603
    move-result v11

    .line 1604
    if-eqz v11, :cond_4b

    .line 1605
    .line 1606
    goto :goto_34

    .line 1607
    :cond_4c
    const/4 v10, 0x0

    .line 1608
    :goto_34
    check-cast v10, La/pj30;

    .line 1609
    .line 1610
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v2

    .line 1614
    :cond_4d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1615
    .line 1616
    .line 1617
    move-result v3

    .line 1618
    if-eqz v3, :cond_4e

    .line 1619
    .line 1620
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v3

    .line 1624
    move-object v9, v3

    .line 1625
    check-cast v9, La/pj30;

    .line 1626
    .line 1627
    invoke-static {v9}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v9

    .line 1631
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1632
    .line 1633
    .line 1634
    move-result v9

    .line 1635
    if-eqz v9, :cond_4d

    .line 1636
    .line 1637
    goto :goto_35

    .line 1638
    :cond_4e
    const/4 v3, 0x0

    .line 1639
    :goto_35
    check-cast v3, La/pj30;

    .line 1640
    .line 1641
    if-eqz v4, :cond_52

    .line 1642
    .line 1643
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1644
    .line 1645
    .line 1646
    move-result v2

    .line 1647
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 1648
    .line 1649
    .line 1650
    move-result v8

    .line 1651
    if-ltz v2, :cond_4f

    .line 1652
    .line 1653
    move v9, v15

    .line 1654
    goto :goto_36

    .line 1655
    :cond_4f
    const/4 v9, 0x0

    .line 1656
    :goto_36
    if-ltz v8, :cond_50

    .line 1657
    .line 1658
    goto :goto_37

    .line 1659
    :cond_50
    const/4 v15, 0x0

    .line 1660
    :goto_37
    and-int/2addr v9, v15

    .line 1661
    if-nez v9, :cond_51

    .line 1662
    .line 1663
    invoke-static {v7}, La/zcx;->a(Ljava/lang/String;)V

    .line 1664
    .line 1665
    .line 1666
    :cond_51
    invoke-static {v2, v2, v8, v8}, La/r4e;->h(IIII)J

    .line 1667
    .line 1668
    .line 1669
    move-result-wide v7

    .line 1670
    invoke-interface {v4, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v2

    .line 1674
    goto :goto_38

    .line 1675
    :cond_52
    const/4 v2, 0x0

    .line 1676
    :goto_38
    if-eqz v5, :cond_53

    .line 1677
    .line 1678
    const/16 v27, 0x0

    .line 1679
    .line 1680
    const/16 v28, 0xa

    .line 1681
    .line 1682
    const/16 v24, 0x0

    .line 1683
    .line 1684
    const/16 v25, 0x0

    .line 1685
    .line 1686
    const/16 v26, 0x0

    .line 1687
    .line 1688
    move-wide/from16 v22, p3

    .line 1689
    .line 1690
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 1691
    .line 1692
    .line 1693
    move-result-wide v7

    .line 1694
    invoke-interface {v5, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v4

    .line 1698
    goto :goto_39

    .line 1699
    :cond_53
    const/4 v4, 0x0

    .line 1700
    :goto_39
    if-eqz v6, :cond_54

    .line 1701
    .line 1702
    const/16 v27, 0x0

    .line 1703
    .line 1704
    const/16 v28, 0xa

    .line 1705
    .line 1706
    const/16 v24, 0x0

    .line 1707
    .line 1708
    const/16 v25, 0x0

    .line 1709
    .line 1710
    const/16 v26, 0x0

    .line 1711
    .line 1712
    move-wide/from16 v22, p3

    .line 1713
    .line 1714
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 1715
    .line 1716
    .line 1717
    move-result-wide v7

    .line 1718
    invoke-interface {v6, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v5

    .line 1722
    goto :goto_3a

    .line 1723
    :cond_54
    const/4 v5, 0x0

    .line 1724
    :goto_3a
    if-eqz v10, :cond_55

    .line 1725
    .line 1726
    const/16 v27, 0x0

    .line 1727
    .line 1728
    const/16 v28, 0xa

    .line 1729
    .line 1730
    const/16 v24, 0x0

    .line 1731
    .line 1732
    const/16 v25, 0x0

    .line 1733
    .line 1734
    const/16 v26, 0x0

    .line 1735
    .line 1736
    move-wide/from16 v22, p3

    .line 1737
    .line 1738
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 1739
    .line 1740
    .line 1741
    move-result-wide v6

    .line 1742
    invoke-interface {v10, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v6

    .line 1746
    move-object/from16 v30, v6

    .line 1747
    .line 1748
    goto :goto_3b

    .line 1749
    :cond_55
    const/16 v30, 0x0

    .line 1750
    .line 1751
    :goto_3b
    if-eqz v3, :cond_56

    .line 1752
    .line 1753
    const/16 v20, 0x0

    .line 1754
    .line 1755
    const/16 v21, 0xa

    .line 1756
    .line 1757
    const/16 v17, 0x0

    .line 1758
    .line 1759
    const/16 v18, 0x0

    .line 1760
    .line 1761
    const/16 v19, 0x0

    .line 1762
    .line 1763
    move-wide/from16 v15, p3

    .line 1764
    .line 1765
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 1766
    .line 1767
    .line 1768
    move-result-wide v6

    .line 1769
    invoke-interface {v3, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v13

    .line 1773
    move-object/from16 v29, v13

    .line 1774
    .line 1775
    goto :goto_3c

    .line 1776
    :cond_56
    const/16 v29, 0x0

    .line 1777
    .line 1778
    :goto_3c
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1779
    .line 1780
    .line 1781
    move-result v3

    .line 1782
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 1783
    .line 1784
    .line 1785
    move-result v6

    .line 1786
    new-instance v22, La/oq00;

    .line 1787
    .line 1788
    const/16 v31, 0x1

    .line 1789
    .line 1790
    move-wide/from16 v25, p3

    .line 1791
    .line 1792
    move/from16 v28, v0

    .line 1793
    .line 1794
    move-object/from16 v23, v2

    .line 1795
    .line 1796
    move-object/from16 v24, v4

    .line 1797
    .line 1798
    move-object/from16 v27, v5

    .line 1799
    .line 1800
    invoke-direct/range {v22 .. v31}, La/oq00;-><init>(La/pu90;La/pu90;JLa/pu90;ILa/pu90;La/pu90;B)V

    .line 1801
    .line 1802
    .line 1803
    move-object/from16 v0, v22

    .line 1804
    .line 1805
    invoke-static {v1, v3, v6, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v0

    .line 1809
    return-object v0

    .line 1810
    :pswitch_5
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 1811
    .line 1812
    .line 1813
    move-result v0

    .line 1814
    sub-int/2addr v0, v14

    .line 1815
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v3

    .line 1819
    :cond_57
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1820
    .line 1821
    .line 1822
    move-result v4

    .line 1823
    if-eqz v4, :cond_58

    .line 1824
    .line 1825
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v4

    .line 1829
    move-object v5, v4

    .line 1830
    check-cast v5, La/pj30;

    .line 1831
    .line 1832
    invoke-static {v5}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v5

    .line 1836
    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1837
    .line 1838
    .line 1839
    move-result v5

    .line 1840
    if-eqz v5, :cond_57

    .line 1841
    .line 1842
    goto :goto_3d

    .line 1843
    :cond_58
    const/4 v4, 0x0

    .line 1844
    :goto_3d
    check-cast v4, La/pj30;

    .line 1845
    .line 1846
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v3

    .line 1850
    :cond_59
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1851
    .line 1852
    .line 1853
    move-result v5

    .line 1854
    if-eqz v5, :cond_5a

    .line 1855
    .line 1856
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v5

    .line 1860
    move-object v6, v5

    .line 1861
    check-cast v6, La/pj30;

    .line 1862
    .line 1863
    invoke-static {v6}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v6

    .line 1867
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1868
    .line 1869
    .line 1870
    move-result v6

    .line 1871
    if-eqz v6, :cond_59

    .line 1872
    .line 1873
    goto :goto_3e

    .line 1874
    :cond_5a
    const/4 v5, 0x0

    .line 1875
    :goto_3e
    check-cast v5, La/pj30;

    .line 1876
    .line 1877
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v3

    .line 1881
    :cond_5b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1882
    .line 1883
    .line 1884
    move-result v6

    .line 1885
    if-eqz v6, :cond_5c

    .line 1886
    .line 1887
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v6

    .line 1891
    move-object v11, v6

    .line 1892
    check-cast v11, La/pj30;

    .line 1893
    .line 1894
    invoke-static {v11}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v11

    .line 1898
    invoke-static {v11, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1899
    .line 1900
    .line 1901
    move-result v11

    .line 1902
    if-eqz v11, :cond_5b

    .line 1903
    .line 1904
    goto :goto_3f

    .line 1905
    :cond_5c
    const/4 v6, 0x0

    .line 1906
    :goto_3f
    check-cast v6, La/pj30;

    .line 1907
    .line 1908
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v3

    .line 1912
    :cond_5d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1913
    .line 1914
    .line 1915
    move-result v10

    .line 1916
    if-eqz v10, :cond_5e

    .line 1917
    .line 1918
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v10

    .line 1922
    move-object v11, v10

    .line 1923
    check-cast v11, La/pj30;

    .line 1924
    .line 1925
    invoke-static {v11}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v11

    .line 1929
    invoke-static {v11, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1930
    .line 1931
    .line 1932
    move-result v11

    .line 1933
    if-eqz v11, :cond_5d

    .line 1934
    .line 1935
    goto :goto_40

    .line 1936
    :cond_5e
    const/4 v10, 0x0

    .line 1937
    :goto_40
    check-cast v10, La/pj30;

    .line 1938
    .line 1939
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v2

    .line 1943
    :cond_5f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1944
    .line 1945
    .line 1946
    move-result v3

    .line 1947
    if-eqz v3, :cond_60

    .line 1948
    .line 1949
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v3

    .line 1953
    move-object v9, v3

    .line 1954
    check-cast v9, La/pj30;

    .line 1955
    .line 1956
    invoke-static {v9}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v9

    .line 1960
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1961
    .line 1962
    .line 1963
    move-result v9

    .line 1964
    if-eqz v9, :cond_5f

    .line 1965
    .line 1966
    goto :goto_41

    .line 1967
    :cond_60
    const/4 v3, 0x0

    .line 1968
    :goto_41
    check-cast v3, La/pj30;

    .line 1969
    .line 1970
    if-eqz v4, :cond_64

    .line 1971
    .line 1972
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1973
    .line 1974
    .line 1975
    move-result v2

    .line 1976
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 1977
    .line 1978
    .line 1979
    move-result v8

    .line 1980
    if-ltz v2, :cond_61

    .line 1981
    .line 1982
    move v9, v15

    .line 1983
    goto :goto_42

    .line 1984
    :cond_61
    const/4 v9, 0x0

    .line 1985
    :goto_42
    if-ltz v8, :cond_62

    .line 1986
    .line 1987
    goto :goto_43

    .line 1988
    :cond_62
    const/4 v15, 0x0

    .line 1989
    :goto_43
    and-int/2addr v9, v15

    .line 1990
    if-nez v9, :cond_63

    .line 1991
    .line 1992
    invoke-static {v7}, La/zcx;->a(Ljava/lang/String;)V

    .line 1993
    .line 1994
    .line 1995
    :cond_63
    invoke-static {v2, v2, v8, v8}, La/r4e;->h(IIII)J

    .line 1996
    .line 1997
    .line 1998
    move-result-wide v7

    .line 1999
    invoke-interface {v4, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v2

    .line 2003
    goto :goto_44

    .line 2004
    :cond_64
    const/4 v2, 0x0

    .line 2005
    :goto_44
    if-eqz v5, :cond_65

    .line 2006
    .line 2007
    const/16 v27, 0x0

    .line 2008
    .line 2009
    const/16 v28, 0xa

    .line 2010
    .line 2011
    const/16 v24, 0x0

    .line 2012
    .line 2013
    const/16 v25, 0x0

    .line 2014
    .line 2015
    const/16 v26, 0x0

    .line 2016
    .line 2017
    move-wide/from16 v22, p3

    .line 2018
    .line 2019
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 2020
    .line 2021
    .line 2022
    move-result-wide v7

    .line 2023
    invoke-interface {v5, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v4

    .line 2027
    goto :goto_45

    .line 2028
    :cond_65
    const/4 v4, 0x0

    .line 2029
    :goto_45
    if-eqz v6, :cond_66

    .line 2030
    .line 2031
    const/16 v27, 0x0

    .line 2032
    .line 2033
    const/16 v28, 0xa

    .line 2034
    .line 2035
    const/16 v24, 0x0

    .line 2036
    .line 2037
    const/16 v25, 0x0

    .line 2038
    .line 2039
    const/16 v26, 0x0

    .line 2040
    .line 2041
    move-wide/from16 v22, p3

    .line 2042
    .line 2043
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 2044
    .line 2045
    .line 2046
    move-result-wide v7

    .line 2047
    invoke-interface {v6, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v5

    .line 2051
    goto :goto_46

    .line 2052
    :cond_66
    const/4 v5, 0x0

    .line 2053
    :goto_46
    if-eqz v10, :cond_67

    .line 2054
    .line 2055
    const/16 v27, 0x0

    .line 2056
    .line 2057
    const/16 v28, 0xa

    .line 2058
    .line 2059
    const/16 v24, 0x0

    .line 2060
    .line 2061
    const/16 v25, 0x0

    .line 2062
    .line 2063
    const/16 v26, 0x0

    .line 2064
    .line 2065
    move-wide/from16 v22, p3

    .line 2066
    .line 2067
    invoke-static/range {v22 .. v28}, La/p4e;->b(JIIIII)J

    .line 2068
    .line 2069
    .line 2070
    move-result-wide v6

    .line 2071
    invoke-interface {v10, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v6

    .line 2075
    move-object/from16 v29, v6

    .line 2076
    .line 2077
    goto :goto_47

    .line 2078
    :cond_67
    const/16 v29, 0x0

    .line 2079
    .line 2080
    :goto_47
    if-eqz v3, :cond_68

    .line 2081
    .line 2082
    const/16 v20, 0x0

    .line 2083
    .line 2084
    const/16 v21, 0xa

    .line 2085
    .line 2086
    const/16 v17, 0x0

    .line 2087
    .line 2088
    const/16 v18, 0x0

    .line 2089
    .line 2090
    const/16 v19, 0x0

    .line 2091
    .line 2092
    move-wide/from16 v15, p3

    .line 2093
    .line 2094
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 2095
    .line 2096
    .line 2097
    move-result-wide v6

    .line 2098
    invoke-interface {v3, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v13

    .line 2102
    move-object/from16 v30, v13

    .line 2103
    .line 2104
    goto :goto_48

    .line 2105
    :cond_68
    const/16 v30, 0x0

    .line 2106
    .line 2107
    :goto_48
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2108
    .line 2109
    .line 2110
    move-result v3

    .line 2111
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 2112
    .line 2113
    .line 2114
    move-result v6

    .line 2115
    new-instance v22, La/oq00;

    .line 2116
    .line 2117
    const/16 v31, 0x0

    .line 2118
    .line 2119
    move-wide/from16 v25, p3

    .line 2120
    .line 2121
    move/from16 v27, v0

    .line 2122
    .line 2123
    move-object/from16 v23, v2

    .line 2124
    .line 2125
    move-object/from16 v24, v4

    .line 2126
    .line 2127
    move-object/from16 v28, v5

    .line 2128
    .line 2129
    invoke-direct/range {v22 .. v31}, La/oq00;-><init>(La/pu90;La/pu90;JILa/pu90;La/pu90;La/pu90;B)V

    .line 2130
    .line 2131
    .line 2132
    move-object/from16 v0, v22

    .line 2133
    .line 2134
    invoke-static {v1, v3, v6, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v0

    .line 2138
    return-object v0

    .line 2139
    :pswitch_6
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2140
    .line 2141
    .line 2142
    move-result v0

    .line 2143
    sget-object v3, La/qmk;->a:La/zcl;

    .line 2144
    .line 2145
    const/high16 v3, 0x42600000    # 56.0f

    .line 2146
    .line 2147
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 2148
    .line 2149
    .line 2150
    move-result v3

    .line 2151
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v4

    .line 2155
    :cond_69
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2156
    .line 2157
    .line 2158
    move-result v5

    .line 2159
    const-string v7, "INFORMATION_BOARD_ID"

    .line 2160
    .line 2161
    if-eqz v5, :cond_6c

    .line 2162
    .line 2163
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2164
    .line 2165
    .line 2166
    move-result-object v5

    .line 2167
    move-object v8, v5

    .line 2168
    check-cast v8, La/pj30;

    .line 2169
    .line 2170
    invoke-interface {v8}, La/pj30;->n()Ljava/lang/Object;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v8

    .line 2174
    instance-of v9, v8, La/coc;

    .line 2175
    .line 2176
    if-eqz v9, :cond_6a

    .line 2177
    .line 2178
    check-cast v8, La/coc;

    .line 2179
    .line 2180
    goto :goto_49

    .line 2181
    :cond_6a
    const/4 v8, 0x0

    .line 2182
    :goto_49
    if-eqz v8, :cond_6b

    .line 2183
    .line 2184
    iget-object v8, v8, La/coc;->b:Ljava/lang/String;

    .line 2185
    .line 2186
    goto :goto_4a

    .line 2187
    :cond_6b
    const/4 v8, 0x0

    .line 2188
    :goto_4a
    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2189
    .line 2190
    .line 2191
    move-result v8

    .line 2192
    if-eqz v8, :cond_69

    .line 2193
    .line 2194
    goto :goto_4b

    .line 2195
    :cond_6c
    const/4 v5, 0x0

    .line 2196
    :goto_4b
    check-cast v5, La/pj30;

    .line 2197
    .line 2198
    if-eqz v5, :cond_6d

    .line 2199
    .line 2200
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 2201
    .line 2202
    .line 2203
    move-result v4

    .line 2204
    const/4 v8, 0x0

    .line 2205
    invoke-static {v0, v0, v8, v4}, La/p4e;->a(IIII)J

    .line 2206
    .line 2207
    .line 2208
    move-result-wide v9

    .line 2209
    invoke-interface {v5, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 2210
    .line 2211
    .line 2212
    move-result-object v4

    .line 2213
    goto :goto_4c

    .line 2214
    :cond_6d
    const/4 v4, 0x0

    .line 2215
    :goto_4c
    if-eqz v4, :cond_6e

    .line 2216
    .line 2217
    iget v5, v4, La/pu90;->b:I

    .line 2218
    .line 2219
    goto :goto_4d

    .line 2220
    :cond_6e
    const/4 v5, 0x0

    .line 2221
    :goto_4d
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 2222
    .line 2223
    .line 2224
    move-result v8

    .line 2225
    sub-int/2addr v8, v3

    .line 2226
    sub-int/2addr v8, v5

    .line 2227
    sub-int/2addr v8, v14

    .line 2228
    const/4 v9, 0x0

    .line 2229
    invoke-static {v9, v8}, Ljava/lang/Math;->max(II)I

    .line 2230
    .line 2231
    .line 2232
    move-result v8

    .line 2233
    sget-object v9, La/qmk;->a:La/zcl;

    .line 2234
    .line 2235
    const/high16 v9, 0x42400000    # 48.0f

    .line 2236
    .line 2237
    invoke-interface {v1, v9}, La/w6k;->T(F)I

    .line 2238
    .line 2239
    .line 2240
    move-result v9

    .line 2241
    const/high16 v10, 0x42200000    # 40.0f

    .line 2242
    .line 2243
    invoke-interface {v1, v10}, La/w6k;->T(F)I

    .line 2244
    .line 2245
    .line 2246
    move-result v10

    .line 2247
    add-int/2addr v10, v9

    .line 2248
    invoke-static {v14, v3, v5, v10}, La/hne;->D(IIII)I

    .line 2249
    .line 2250
    .line 2251
    move-result v5

    .line 2252
    new-instance v9, Ljava/util/ArrayList;

    .line 2253
    .line 2254
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 2255
    .line 2256
    .line 2257
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v2

    .line 2261
    :cond_6f
    :goto_4e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2262
    .line 2263
    .line 2264
    move-result v10

    .line 2265
    if-eqz v10, :cond_77

    .line 2266
    .line 2267
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v10

    .line 2271
    check-cast v10, La/pj30;

    .line 2272
    .line 2273
    invoke-interface {v10}, La/pj30;->n()Ljava/lang/Object;

    .line 2274
    .line 2275
    .line 2276
    move-result-object v11

    .line 2277
    instance-of v12, v11, La/coc;

    .line 2278
    .line 2279
    if-eqz v12, :cond_70

    .line 2280
    .line 2281
    check-cast v11, La/coc;

    .line 2282
    .line 2283
    goto :goto_4f

    .line 2284
    :cond_70
    const/4 v11, 0x0

    .line 2285
    :goto_4f
    if-eqz v11, :cond_71

    .line 2286
    .line 2287
    iget-object v11, v11, La/coc;->b:Ljava/lang/String;

    .line 2288
    .line 2289
    goto :goto_50

    .line 2290
    :cond_71
    const/4 v11, 0x0

    .line 2291
    :goto_50
    if-eqz v11, :cond_76

    .line 2292
    .line 2293
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 2294
    .line 2295
    .line 2296
    move-result v12

    .line 2297
    sparse-switch v12, :sswitch_data_0

    .line 2298
    .line 2299
    .line 2300
    goto :goto_51

    .line 2301
    :sswitch_0
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2302
    .line 2303
    .line 2304
    move-result v10

    .line 2305
    if-nez v10, :cond_72

    .line 2306
    .line 2307
    goto :goto_51

    .line 2308
    :cond_72
    move-object v10, v4

    .line 2309
    goto :goto_52

    .line 2310
    :sswitch_1
    const-string v12, "MARKETS_ID"

    .line 2311
    .line 2312
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2313
    .line 2314
    .line 2315
    move-result v11

    .line 2316
    if-nez v11, :cond_73

    .line 2317
    .line 2318
    goto :goto_51

    .line 2319
    :cond_73
    invoke-static {v0, v0, v8, v8}, La/p4e;->a(IIII)J

    .line 2320
    .line 2321
    .line 2322
    move-result-wide v11

    .line 2323
    invoke-interface {v10, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 2324
    .line 2325
    .line 2326
    move-result-object v10

    .line 2327
    goto :goto_52

    .line 2328
    :sswitch_2
    const-string v12, "BACKGROUND_ID"

    .line 2329
    .line 2330
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2331
    .line 2332
    .line 2333
    move-result v11

    .line 2334
    if-nez v11, :cond_74

    .line 2335
    .line 2336
    goto :goto_51

    .line 2337
    :cond_74
    invoke-static {v0, v0, v5, v5}, La/p4e;->a(IIII)J

    .line 2338
    .line 2339
    .line 2340
    move-result-wide v11

    .line 2341
    invoke-interface {v10, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 2342
    .line 2343
    .line 2344
    move-result-object v10

    .line 2345
    goto :goto_52

    .line 2346
    :sswitch_3
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2347
    .line 2348
    .line 2349
    move-result v11

    .line 2350
    if-nez v11, :cond_75

    .line 2351
    .line 2352
    goto :goto_51

    .line 2353
    :cond_75
    invoke-static {v0, v0, v3, v3}, La/p4e;->a(IIII)J

    .line 2354
    .line 2355
    .line 2356
    move-result-wide v11

    .line 2357
    invoke-interface {v10, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 2358
    .line 2359
    .line 2360
    move-result-object v10

    .line 2361
    goto :goto_52

    .line 2362
    :cond_76
    :goto_51
    const/4 v10, 0x0

    .line 2363
    :goto_52
    if-eqz v10, :cond_6f

    .line 2364
    .line 2365
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2366
    .line 2367
    .line 2368
    goto :goto_4e

    .line 2369
    :cond_77
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2370
    .line 2371
    .line 2372
    move-result v0

    .line 2373
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 2374
    .line 2375
    .line 2376
    move-result v2

    .line 2377
    new-instance v3, La/o6h;

    .line 2378
    .line 2379
    invoke-direct {v3, v14, v9}, La/o6h;-><init>(ILjava/util/ArrayList;)V

    .line 2380
    .line 2381
    .line 2382
    invoke-static {v1, v0, v2, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 2383
    .line 2384
    .line 2385
    move-result-object v0

    .line 2386
    return-object v0

    .line 2387
    :pswitch_7
    new-instance v0, Ljava/util/ArrayList;

    .line 2388
    .line 2389
    const/16 v3, 0xa

    .line 2390
    .line 2391
    invoke-static {v2, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2392
    .line 2393
    .line 2394
    move-result v3

    .line 2395
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2396
    .line 2397
    .line 2398
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2399
    .line 2400
    .line 2401
    move-result-object v2

    .line 2402
    :goto_53
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2403
    .line 2404
    .line 2405
    move-result v3

    .line 2406
    if-eqz v3, :cond_78

    .line 2407
    .line 2408
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2409
    .line 2410
    .line 2411
    move-result-object v3

    .line 2412
    check-cast v3, La/pj30;

    .line 2413
    .line 2414
    invoke-static/range {p3 .. p4}, La/p4e;->k(J)I

    .line 2415
    .line 2416
    .line 2417
    move-result v4

    .line 2418
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2419
    .line 2420
    .line 2421
    move-result v5

    .line 2422
    const v6, 0x7fffffff

    .line 2423
    .line 2424
    .line 2425
    const/4 v8, 0x0

    .line 2426
    invoke-static {v4, v5, v8, v6}, La/r4e;->a(IIII)J

    .line 2427
    .line 2428
    .line 2429
    move-result-wide v4

    .line 2430
    invoke-interface {v3, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 2431
    .line 2432
    .line 2433
    move-result-object v3

    .line 2434
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2435
    .line 2436
    .line 2437
    goto :goto_53

    .line 2438
    :cond_78
    invoke-static/range {p3 .. p4}, La/p4e;->e(J)Z

    .line 2439
    .line 2440
    .line 2441
    move-result v2

    .line 2442
    if-eqz v2, :cond_79

    .line 2443
    .line 2444
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2445
    .line 2446
    .line 2447
    move-result v2

    .line 2448
    goto :goto_56

    .line 2449
    :cond_79
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2450
    .line 2451
    .line 2452
    move-result-object v2

    .line 2453
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2454
    .line 2455
    .line 2456
    move-result v3

    .line 2457
    if-nez v3, :cond_7a

    .line 2458
    .line 2459
    const/4 v13, 0x0

    .line 2460
    goto :goto_55

    .line 2461
    :cond_7a
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2462
    .line 2463
    .line 2464
    move-result-object v3

    .line 2465
    check-cast v3, La/pu90;

    .line 2466
    .line 2467
    iget v3, v3, La/pu90;->a:I

    .line 2468
    .line 2469
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2470
    .line 2471
    .line 2472
    move-result-object v3

    .line 2473
    :goto_54
    move-object v13, v3

    .line 2474
    :cond_7b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2475
    .line 2476
    .line 2477
    move-result v3

    .line 2478
    if-eqz v3, :cond_7c

    .line 2479
    .line 2480
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2481
    .line 2482
    .line 2483
    move-result-object v3

    .line 2484
    check-cast v3, La/pu90;

    .line 2485
    .line 2486
    iget v3, v3, La/pu90;->a:I

    .line 2487
    .line 2488
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2489
    .line 2490
    .line 2491
    move-result-object v3

    .line 2492
    invoke-virtual {v13, v3}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 2493
    .line 2494
    .line 2495
    move-result v4

    .line 2496
    if-gez v4, :cond_7b

    .line 2497
    .line 2498
    goto :goto_54

    .line 2499
    :cond_7c
    :goto_55
    if-eqz v13, :cond_7d

    .line 2500
    .line 2501
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 2502
    .line 2503
    .line 2504
    move-result v2

    .line 2505
    goto :goto_56

    .line 2506
    :cond_7d
    invoke-static/range {p3 .. p4}, La/p4e;->k(J)I

    .line 2507
    .line 2508
    .line 2509
    move-result v2

    .line 2510
    :goto_56
    invoke-static/range {p3 .. p4}, La/p4e;->d(J)Z

    .line 2511
    .line 2512
    .line 2513
    move-result v3

    .line 2514
    if-eqz v3, :cond_7e

    .line 2515
    .line 2516
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 2517
    .line 2518
    .line 2519
    move-result v3

    .line 2520
    goto :goto_59

    .line 2521
    :cond_7e
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2522
    .line 2523
    .line 2524
    move-result-object v3

    .line 2525
    const/4 v4, 0x0

    .line 2526
    :goto_57
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2527
    .line 2528
    .line 2529
    move-result v5

    .line 2530
    if-eqz v5, :cond_7f

    .line 2531
    .line 2532
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2533
    .line 2534
    .line 2535
    move-result-object v5

    .line 2536
    check-cast v5, La/pu90;

    .line 2537
    .line 2538
    iget v5, v5, La/pu90;->b:I

    .line 2539
    .line 2540
    add-int/2addr v4, v5

    .line 2541
    goto :goto_57

    .line 2542
    :cond_7f
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 2543
    .line 2544
    .line 2545
    move-result v3

    .line 2546
    sub-int/2addr v3, v15

    .line 2547
    if-gez v3, :cond_80

    .line 2548
    .line 2549
    const/4 v13, 0x0

    .line 2550
    goto :goto_58

    .line 2551
    :cond_80
    move v13, v3

    .line 2552
    :goto_58
    mul-int/2addr v13, v14

    .line 2553
    add-int v3, v13, v4

    .line 2554
    .line 2555
    :goto_59
    new-instance v4, La/o6h;

    .line 2556
    .line 2557
    invoke-direct {v4, v0, v14}, La/o6h;-><init>(Ljava/util/ArrayList;I)V

    .line 2558
    .line 2559
    .line 2560
    invoke-static {v1, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 2561
    .line 2562
    .line 2563
    move-result-object v0

    .line 2564
    return-object v0

    .line 2565
    :pswitch_8
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2566
    .line 2567
    .line 2568
    move-result v6

    .line 2569
    const/4 v8, 0x0

    .line 2570
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2571
    .line 2572
    .line 2573
    move-result-object v0

    .line 2574
    check-cast v0, La/pj30;

    .line 2575
    .line 2576
    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2577
    .line 2578
    .line 2579
    move-result-object v2

    .line 2580
    check-cast v2, La/pj30;

    .line 2581
    .line 2582
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 2583
    .line 2584
    .line 2585
    move-result v3

    .line 2586
    invoke-interface {v0, v3}, La/pj30;->P(I)I

    .line 2587
    .line 2588
    .line 2589
    move-result v3

    .line 2590
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 2591
    .line 2592
    .line 2593
    move-result v5

    .line 2594
    invoke-interface {v2, v5}, La/pj30;->P(I)I

    .line 2595
    .line 2596
    .line 2597
    move-result v5

    .line 2598
    add-int v7, v3, v5

    .line 2599
    .line 2600
    add-int/2addr v7, v14

    .line 2601
    if-gt v7, v6, :cond_81

    .line 2602
    .line 2603
    goto :goto_5a

    .line 2604
    :cond_81
    sub-int v7, v6, v14

    .line 2605
    .line 2606
    if-gez v7, :cond_82

    .line 2607
    .line 2608
    move v7, v8

    .line 2609
    :cond_82
    int-to-double v9, v7

    .line 2610
    const-wide v11, 0x3fd999999999999aL    # 0.4

    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    mul-double/2addr v11, v9

    .line 2616
    double-to-int v7, v11

    .line 2617
    const-wide v11, 0x3fe3333333333333L    # 0.6

    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    mul-double/2addr v9, v11

    .line 2623
    double-to-int v9, v9

    .line 2624
    if-gt v3, v7, :cond_83

    .line 2625
    .line 2626
    sub-int v5, v6, v3

    .line 2627
    .line 2628
    sub-int/2addr v5, v14

    .line 2629
    if-gez v5, :cond_86

    .line 2630
    .line 2631
    move v5, v8

    .line 2632
    goto :goto_5a

    .line 2633
    :cond_83
    if-gt v5, v9, :cond_84

    .line 2634
    .line 2635
    sub-int v3, v6, v5

    .line 2636
    .line 2637
    sub-int/2addr v3, v14

    .line 2638
    if-gez v3, :cond_86

    .line 2639
    .line 2640
    move v3, v8

    .line 2641
    goto :goto_5a

    .line 2642
    :cond_84
    sub-int v3, v6, v7

    .line 2643
    .line 2644
    sub-int/2addr v3, v14

    .line 2645
    if-gez v3, :cond_85

    .line 2646
    .line 2647
    move v3, v8

    .line 2648
    :cond_85
    move v5, v3

    .line 2649
    move v3, v7

    .line 2650
    :cond_86
    :goto_5a
    if-gez v3, :cond_87

    .line 2651
    .line 2652
    move/from16 v18, v8

    .line 2653
    .line 2654
    goto :goto_5b

    .line 2655
    :cond_87
    move/from16 v18, v3

    .line 2656
    .line 2657
    :goto_5b
    const/16 v20, 0x0

    .line 2658
    .line 2659
    const/16 v21, 0xc

    .line 2660
    .line 2661
    const/16 v17, 0x0

    .line 2662
    .line 2663
    const/16 v19, 0x0

    .line 2664
    .line 2665
    move-wide/from16 v15, p3

    .line 2666
    .line 2667
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 2668
    .line 2669
    .line 2670
    move-result-wide v9

    .line 2671
    invoke-interface {v0, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 2672
    .line 2673
    .line 2674
    move-result-object v3

    .line 2675
    if-gez v5, :cond_88

    .line 2676
    .line 2677
    move/from16 v18, v8

    .line 2678
    .line 2679
    goto :goto_5c

    .line 2680
    :cond_88
    move/from16 v18, v5

    .line 2681
    .line 2682
    :goto_5c
    const/16 v20, 0x0

    .line 2683
    .line 2684
    const/16 v21, 0xc

    .line 2685
    .line 2686
    const/16 v17, 0x0

    .line 2687
    .line 2688
    const/16 v19, 0x0

    .line 2689
    .line 2690
    move-wide/from16 v15, p3

    .line 2691
    .line 2692
    invoke-static/range {v15 .. v21}, La/p4e;->b(JIIIII)J

    .line 2693
    .line 2694
    .line 2695
    move-result-wide v7

    .line 2696
    invoke-interface {v2, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 2697
    .line 2698
    .line 2699
    move-result-object v5

    .line 2700
    iget v0, v3, La/pu90;->b:I

    .line 2701
    .line 2702
    iget v2, v5, La/pu90;->b:I

    .line 2703
    .line 2704
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 2705
    .line 2706
    .line 2707
    move-result v0

    .line 2708
    iget v2, v3, La/pu90;->b:I

    .line 2709
    .line 2710
    sub-int v2, v0, v2

    .line 2711
    .line 2712
    div-int/2addr v2, v4

    .line 2713
    iget v7, v5, La/pu90;->b:I

    .line 2714
    .line 2715
    sub-int v7, v0, v7

    .line 2716
    .line 2717
    div-int/2addr v7, v4

    .line 2718
    move v4, v2

    .line 2719
    new-instance v2, La/lw7;

    .line 2720
    .line 2721
    const/4 v8, 0x1

    .line 2722
    invoke-direct/range {v2 .. v8}, La/lw7;-><init>(La/pu90;ILa/pu90;IIB)V

    .line 2723
    .line 2724
    .line 2725
    invoke-static {v1, v6, v0, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 2726
    .line 2727
    .line 2728
    move-result-object v0

    .line 2729
    return-object v0

    .line 2730
    nop

    .line 2731
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    :sswitch_data_0
    .sparse-switch
        0x2068547f -> :sswitch_3
        0x48e075cc -> :sswitch_2
        0x5f9032c3 -> :sswitch_1
        0x660f4f07 -> :sswitch_0
    .end sparse-switch
.end method
