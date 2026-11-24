.class public final synthetic La/inl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uzh;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(La/uzh;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/inl;->a:B

    iput-object p1, p0, La/inl;->b:La/uzh;

    iput p2, p0, La/inl;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/inl;->a:B

    .line 4
    .line 5
    const-string v2, "tag"

    .line 6
    .line 7
    const-string v3, "title"

    .line 8
    .line 9
    const-string v4, "tagCurrent"

    .line 10
    .line 11
    const-string v5, "titleCurrent"

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    iget-object v8, v0, La/inl;->b:La/uzh;

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/c5n0;

    .line 23
    .line 24
    move-object/from16 v10, p2

    .line 25
    .line 26
    check-cast v10, La/p4e;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-wide v11, v10, La/p4e;->a:J

    .line 32
    .line 33
    invoke-static {v11, v12}, La/p4e;->i(J)I

    .line 34
    .line 35
    .line 36
    move-result v16

    .line 37
    iget-object v11, v8, La/uzh;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v11}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v11

    .line 43
    new-instance v12, La/bnl;

    .line 44
    .line 45
    const/16 v13, 0xb

    .line 46
    .line 47
    invoke-direct {v12, v8, v13}, La/bnl;-><init>(La/uzh;B)V

    .line 48
    .line 49
    .line 50
    new-instance v13, La/ugd;

    .line 51
    .line 52
    const v14, 0x1e646037

    .line 53
    .line 54
    .line 55
    invoke-direct {v13, v14, v9, v12}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v1, v5, v13}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, La/pj30;

    .line 67
    .line 68
    iget-wide v13, v10, La/p4e;->a:J

    .line 69
    .line 70
    const/16 v18, 0x0

    .line 71
    .line 72
    const/16 v19, 0xc

    .line 73
    .line 74
    const/4 v15, 0x0

    .line 75
    const/16 v17, 0x0

    .line 76
    .line 77
    invoke-static/range {v13 .. v19}, La/p4e;->b(JIIIII)J

    .line 78
    .line 79
    .line 80
    move-result-wide v12

    .line 81
    invoke-interface {v5, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    if-eqz v11, :cond_0

    .line 86
    .line 87
    move-object v4, v7

    .line 88
    move/from16 v14, v16

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    new-instance v12, La/bnl;

    .line 92
    .line 93
    const/16 v13, 0xc

    .line 94
    .line 95
    invoke-direct {v12, v8, v13}, La/bnl;-><init>(La/uzh;B)V

    .line 96
    .line 97
    .line 98
    new-instance v13, La/ugd;

    .line 99
    .line 100
    const v14, 0x3aec5711

    .line 101
    .line 102
    .line 103
    invoke-direct {v13, v14, v9, v12}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v1, v4, v13}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, La/pj30;

    .line 115
    .line 116
    iget-wide v13, v10, La/p4e;->a:J

    .line 117
    .line 118
    const/16 v18, 0x0

    .line 119
    .line 120
    const/16 v19, 0xc

    .line 121
    .line 122
    const/4 v15, 0x0

    .line 123
    const/16 v17, 0x0

    .line 124
    .line 125
    invoke-static/range {v13 .. v19}, La/p4e;->b(JIIIII)J

    .line 126
    .line 127
    .line 128
    move-result-wide v12

    .line 129
    move/from16 v14, v16

    .line 130
    .line 131
    invoke-interface {v4, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    :goto_0
    div-int/lit8 v12, v14, 0x2

    .line 136
    .line 137
    iget v13, v5, La/pu90;->a:I

    .line 138
    .line 139
    if-le v13, v12, :cond_1

    .line 140
    .line 141
    move v15, v9

    .line 142
    goto :goto_1

    .line 143
    :cond_1
    const/4 v15, 0x0

    .line 144
    :goto_1
    if-eqz v4, :cond_2

    .line 145
    .line 146
    iget v6, v4, La/pu90;->a:I

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_2
    const/4 v6, 0x0

    .line 150
    :goto_2
    if-le v6, v12, :cond_3

    .line 151
    .line 152
    move v6, v9

    .line 153
    goto :goto_3

    .line 154
    :cond_3
    const/4 v6, 0x0

    .line 155
    :goto_3
    iget v0, v0, La/inl;->c:I

    .line 156
    .line 157
    if-eqz v11, :cond_4

    .line 158
    .line 159
    move v13, v14

    .line 160
    goto :goto_5

    .line 161
    :cond_4
    if-eqz v15, :cond_6

    .line 162
    .line 163
    if-eqz v6, :cond_6

    .line 164
    .line 165
    div-int/lit8 v4, v0, 0x2

    .line 166
    .line 167
    sub-int v4, v12, v4

    .line 168
    .line 169
    if-gez v4, :cond_5

    .line 170
    .line 171
    const/4 v4, 0x0

    .line 172
    :cond_5
    move v13, v4

    .line 173
    goto :goto_5

    .line 174
    :cond_6
    if-eqz v15, :cond_8

    .line 175
    .line 176
    if-nez v6, :cond_8

    .line 177
    .line 178
    sub-int v13, v14, v0

    .line 179
    .line 180
    if-eqz v4, :cond_7

    .line 181
    .line 182
    iget v4, v4, La/pu90;->a:I

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_7
    const/4 v4, 0x0

    .line 186
    :goto_4
    invoke-static {v4, v12}, Ljava/lang/Math;->min(II)I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    sub-int/2addr v13, v4

    .line 191
    if-gez v13, :cond_8

    .line 192
    .line 193
    const/4 v13, 0x0

    .line 194
    :cond_8
    :goto_5
    if-eqz v11, :cond_9

    .line 195
    .line 196
    :goto_6
    const/4 v12, 0x0

    .line 197
    goto :goto_7

    .line 198
    :cond_9
    if-eqz v15, :cond_a

    .line 199
    .line 200
    if-eqz v6, :cond_a

    .line 201
    .line 202
    div-int/lit8 v4, v0, 0x2

    .line 203
    .line 204
    sub-int/2addr v12, v4

    .line 205
    if-gez v12, :cond_c

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_a
    if-eqz v6, :cond_c

    .line 209
    .line 210
    sub-int v4, v14, v0

    .line 211
    .line 212
    iget v5, v5, La/pu90;->a:I

    .line 213
    .line 214
    sub-int/2addr v4, v5

    .line 215
    if-gez v4, :cond_b

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_b
    move v12, v4

    .line 219
    :cond_c
    :goto_7
    new-instance v4, La/bnl;

    .line 220
    .line 221
    const/16 v5, 0x9

    .line 222
    .line 223
    invoke-direct {v4, v8, v5}, La/bnl;-><init>(La/uzh;B)V

    .line 224
    .line 225
    .line 226
    new-instance v5, La/ugd;

    .line 227
    .line 228
    const v6, 0x15f206ca

    .line 229
    .line 230
    .line 231
    invoke-direct {v5, v6, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v1, v3, v5}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    check-cast v3, La/pj30;

    .line 243
    .line 244
    iget-wide v4, v10, La/p4e;->a:J

    .line 245
    .line 246
    if-le v13, v14, :cond_d

    .line 247
    .line 248
    move/from16 v20, v14

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_d
    move/from16 v20, v13

    .line 252
    .line 253
    :goto_8
    const/16 v22, 0x0

    .line 254
    .line 255
    const/16 v23, 0xc

    .line 256
    .line 257
    const/16 v19, 0x0

    .line 258
    .line 259
    const/16 v21, 0x0

    .line 260
    .line 261
    move-wide/from16 v17, v4

    .line 262
    .line 263
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 264
    .line 265
    .line 266
    move-result-wide v4

    .line 267
    invoke-interface {v3, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 268
    .line 269
    .line 270
    move-result-object v15

    .line 271
    if-eqz v11, :cond_e

    .line 272
    .line 273
    goto :goto_a

    .line 274
    :cond_e
    if-gez v12, :cond_f

    .line 275
    .line 276
    const/4 v12, 0x0

    .line 277
    :cond_f
    new-instance v3, La/bnl;

    .line 278
    .line 279
    const/16 v4, 0xa

    .line 280
    .line 281
    invoke-direct {v3, v8, v4}, La/bnl;-><init>(La/uzh;B)V

    .line 282
    .line 283
    .line 284
    new-instance v4, La/ugd;

    .line 285
    .line 286
    const v5, 0x416eb130

    .line 287
    .line 288
    .line 289
    invoke-direct {v4, v5, v9, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-interface {v1, v2, v4}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, La/pj30;

    .line 301
    .line 302
    iget-wide v3, v10, La/p4e;->a:J

    .line 303
    .line 304
    if-le v12, v14, :cond_10

    .line 305
    .line 306
    move v6, v14

    .line 307
    goto :goto_9

    .line 308
    :cond_10
    move v6, v12

    .line 309
    :goto_9
    const/4 v8, 0x0

    .line 310
    const/16 v9, 0xc

    .line 311
    .line 312
    const/4 v5, 0x0

    .line 313
    const/4 v7, 0x0

    .line 314
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 315
    .line 316
    .line 317
    move-result-wide v3

    .line 318
    invoke-interface {v2, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    :goto_a
    iget v2, v15, La/pu90;->b:I

    .line 323
    .line 324
    if-eqz v7, :cond_11

    .line 325
    .line 326
    iget v6, v7, La/pu90;->b:I

    .line 327
    .line 328
    goto :goto_b

    .line 329
    :cond_11
    const/4 v6, 0x0

    .line 330
    :goto_b
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    new-instance v13, La/lw7;

    .line 335
    .line 336
    const/16 v19, 0x4

    .line 337
    .line 338
    move/from16 v17, v0

    .line 339
    .line 340
    move-object/from16 v16, v7

    .line 341
    .line 342
    move/from16 v18, v14

    .line 343
    .line 344
    move v14, v2

    .line 345
    invoke-direct/range {v13 .. v19}, La/lw7;-><init>(ILa/pu90;La/pu90;IIB)V

    .line 346
    .line 347
    .line 348
    move v0, v14

    .line 349
    move/from16 v14, v18

    .line 350
    .line 351
    invoke-static {v1, v14, v0, v13}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    return-object v0

    .line 356
    :pswitch_0
    move-object/from16 v1, p1

    .line 357
    .line 358
    check-cast v1, La/c5n0;

    .line 359
    .line 360
    move-object/from16 v6, p2

    .line 361
    .line 362
    check-cast v6, La/p4e;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    iget-wide v10, v6, La/p4e;->a:J

    .line 368
    .line 369
    invoke-static {v10, v11}, La/p4e;->i(J)I

    .line 370
    .line 371
    .line 372
    move-result v20

    .line 373
    iget-object v10, v8, La/uzh;->c:Ljava/lang/String;

    .line 374
    .line 375
    invoke-static {v10}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 376
    .line 377
    .line 378
    move-result v10

    .line 379
    new-instance v11, La/bnl;

    .line 380
    .line 381
    const/4 v12, 0x7

    .line 382
    invoke-direct {v11, v8, v12}, La/bnl;-><init>(La/uzh;B)V

    .line 383
    .line 384
    .line 385
    new-instance v12, La/ugd;

    .line 386
    .line 387
    const v13, -0x4bf13a17

    .line 388
    .line 389
    .line 390
    invoke-direct {v12, v13, v9, v11}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    invoke-interface {v1, v5, v12}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    check-cast v5, La/pj30;

    .line 402
    .line 403
    iget-wide v11, v6, La/p4e;->a:J

    .line 404
    .line 405
    const/16 v22, 0x0

    .line 406
    .line 407
    const/16 v23, 0xc

    .line 408
    .line 409
    const/16 v19, 0x0

    .line 410
    .line 411
    const/16 v21, 0x0

    .line 412
    .line 413
    move-wide/from16 v17, v11

    .line 414
    .line 415
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 416
    .line 417
    .line 418
    move-result-wide v11

    .line 419
    invoke-interface {v5, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    if-eqz v10, :cond_12

    .line 424
    .line 425
    move-object v4, v7

    .line 426
    move/from16 v13, v20

    .line 427
    .line 428
    goto :goto_c

    .line 429
    :cond_12
    new-instance v11, La/bnl;

    .line 430
    .line 431
    const/16 v12, 0x8

    .line 432
    .line 433
    invoke-direct {v11, v8, v12}, La/bnl;-><init>(La/uzh;B)V

    .line 434
    .line 435
    .line 436
    new-instance v12, La/ugd;

    .line 437
    .line 438
    const v13, 0x1bfaab43

    .line 439
    .line 440
    .line 441
    invoke-direct {v12, v13, v9, v11}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    invoke-interface {v1, v4, v12}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    check-cast v4, La/pj30;

    .line 453
    .line 454
    iget-wide v11, v6, La/p4e;->a:J

    .line 455
    .line 456
    const/16 v22, 0x0

    .line 457
    .line 458
    const/16 v23, 0xc

    .line 459
    .line 460
    const/16 v19, 0x0

    .line 461
    .line 462
    const/16 v21, 0x0

    .line 463
    .line 464
    move-wide/from16 v17, v11

    .line 465
    .line 466
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 467
    .line 468
    .line 469
    move-result-wide v11

    .line 470
    move/from16 v13, v20

    .line 471
    .line 472
    invoke-interface {v4, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    :goto_c
    div-int/lit8 v11, v13, 0x2

    .line 477
    .line 478
    iget v12, v5, La/pu90;->a:I

    .line 479
    .line 480
    if-le v12, v11, :cond_13

    .line 481
    .line 482
    move v14, v9

    .line 483
    goto :goto_d

    .line 484
    :cond_13
    const/4 v14, 0x0

    .line 485
    :goto_d
    if-eqz v4, :cond_14

    .line 486
    .line 487
    iget v15, v4, La/pu90;->a:I

    .line 488
    .line 489
    goto :goto_e

    .line 490
    :cond_14
    const/4 v15, 0x0

    .line 491
    :goto_e
    if-le v15, v11, :cond_15

    .line 492
    .line 493
    move v15, v9

    .line 494
    goto :goto_f

    .line 495
    :cond_15
    const/4 v15, 0x0

    .line 496
    :goto_f
    iget v0, v0, La/inl;->c:I

    .line 497
    .line 498
    if-eqz v10, :cond_16

    .line 499
    .line 500
    move v12, v13

    .line 501
    goto :goto_13

    .line 502
    :cond_16
    if-eqz v14, :cond_19

    .line 503
    .line 504
    if-eqz v15, :cond_19

    .line 505
    .line 506
    div-int/lit8 v4, v0, 0x2

    .line 507
    .line 508
    sub-int v4, v11, v4

    .line 509
    .line 510
    if-gez v4, :cond_17

    .line 511
    .line 512
    :goto_10
    const/16 v20, 0x0

    .line 513
    .line 514
    goto :goto_11

    .line 515
    :cond_17
    move/from16 v20, v4

    .line 516
    .line 517
    :cond_18
    :goto_11
    move/from16 v12, v20

    .line 518
    .line 519
    goto :goto_13

    .line 520
    :cond_19
    if-eqz v14, :cond_1b

    .line 521
    .line 522
    if-nez v15, :cond_1b

    .line 523
    .line 524
    sub-int v20, v13, v0

    .line 525
    .line 526
    if-eqz v4, :cond_1a

    .line 527
    .line 528
    iget v4, v4, La/pu90;->a:I

    .line 529
    .line 530
    goto :goto_12

    .line 531
    :cond_1a
    const/4 v4, 0x0

    .line 532
    :goto_12
    invoke-static {v4, v11}, Ljava/lang/Math;->min(II)I

    .line 533
    .line 534
    .line 535
    move-result v4

    .line 536
    sub-int v20, v20, v4

    .line 537
    .line 538
    if-gez v20, :cond_18

    .line 539
    .line 540
    goto :goto_10

    .line 541
    :cond_1b
    :goto_13
    if-eqz v10, :cond_1c

    .line 542
    .line 543
    :goto_14
    const/4 v11, 0x0

    .line 544
    goto :goto_15

    .line 545
    :cond_1c
    if-eqz v14, :cond_1d

    .line 546
    .line 547
    if-eqz v15, :cond_1d

    .line 548
    .line 549
    div-int/lit8 v4, v0, 0x2

    .line 550
    .line 551
    sub-int/2addr v11, v4

    .line 552
    if-gez v11, :cond_1f

    .line 553
    .line 554
    goto :goto_14

    .line 555
    :cond_1d
    if-eqz v15, :cond_1f

    .line 556
    .line 557
    sub-int v20, v13, v0

    .line 558
    .line 559
    iget v4, v5, La/pu90;->a:I

    .line 560
    .line 561
    sub-int v20, v20, v4

    .line 562
    .line 563
    if-gez v20, :cond_1e

    .line 564
    .line 565
    goto :goto_14

    .line 566
    :cond_1e
    move/from16 v11, v20

    .line 567
    .line 568
    :cond_1f
    :goto_15
    new-instance v4, La/bnl;

    .line 569
    .line 570
    const/4 v5, 0x5

    .line 571
    invoke-direct {v4, v8, v5}, La/bnl;-><init>(La/uzh;B)V

    .line 572
    .line 573
    .line 574
    new-instance v5, La/ugd;

    .line 575
    .line 576
    const v14, -0x4e150ac4

    .line 577
    .line 578
    .line 579
    invoke-direct {v5, v14, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    invoke-interface {v1, v3, v5}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v3

    .line 586
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    check-cast v3, La/pj30;

    .line 591
    .line 592
    iget-wide v4, v6, La/p4e;->a:J

    .line 593
    .line 594
    if-le v12, v13, :cond_20

    .line 595
    .line 596
    move/from16 v20, v13

    .line 597
    .line 598
    goto :goto_16

    .line 599
    :cond_20
    move/from16 v20, v12

    .line 600
    .line 601
    :goto_16
    const/16 v22, 0x0

    .line 602
    .line 603
    const/16 v23, 0xc

    .line 604
    .line 605
    const/16 v19, 0x0

    .line 606
    .line 607
    const/16 v21, 0x0

    .line 608
    .line 609
    move-wide/from16 v17, v4

    .line 610
    .line 611
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 612
    .line 613
    .line 614
    move-result-wide v4

    .line 615
    invoke-interface {v3, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 616
    .line 617
    .line 618
    move-result-object v3

    .line 619
    if-eqz v10, :cond_21

    .line 620
    .line 621
    goto :goto_18

    .line 622
    :cond_21
    if-gez v11, :cond_22

    .line 623
    .line 624
    const/4 v11, 0x0

    .line 625
    :cond_22
    new-instance v4, La/bnl;

    .line 626
    .line 627
    const/4 v5, 0x6

    .line 628
    invoke-direct {v4, v8, v5}, La/bnl;-><init>(La/uzh;B)V

    .line 629
    .line 630
    .line 631
    new-instance v5, La/ugd;

    .line 632
    .line 633
    const v7, 0x713b0122

    .line 634
    .line 635
    .line 636
    invoke-direct {v5, v7, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    invoke-interface {v1, v2, v5}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    check-cast v2, La/pj30;

    .line 648
    .line 649
    iget-wide v4, v6, La/p4e;->a:J

    .line 650
    .line 651
    if-le v11, v13, :cond_23

    .line 652
    .line 653
    move/from16 v20, v13

    .line 654
    .line 655
    goto :goto_17

    .line 656
    :cond_23
    move/from16 v20, v11

    .line 657
    .line 658
    :goto_17
    const/16 v22, 0x0

    .line 659
    .line 660
    const/16 v23, 0xc

    .line 661
    .line 662
    const/16 v19, 0x0

    .line 663
    .line 664
    const/16 v21, 0x0

    .line 665
    .line 666
    move-wide/from16 v17, v4

    .line 667
    .line 668
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 669
    .line 670
    .line 671
    move-result-wide v4

    .line 672
    invoke-interface {v2, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 673
    .line 674
    .line 675
    move-result-object v7

    .line 676
    :goto_18
    iget v2, v3, La/pu90;->b:I

    .line 677
    .line 678
    if-eqz v7, :cond_24

    .line 679
    .line 680
    iget v6, v7, La/pu90;->b:I

    .line 681
    .line 682
    goto :goto_19

    .line 683
    :cond_24
    const/4 v6, 0x0

    .line 684
    :goto_19
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    .line 685
    .line 686
    .line 687
    move-result v18

    .line 688
    new-instance v17, La/lw7;

    .line 689
    .line 690
    const/16 v23, 0x3

    .line 691
    .line 692
    move/from16 v21, v0

    .line 693
    .line 694
    move-object/from16 v19, v3

    .line 695
    .line 696
    move-object/from16 v20, v7

    .line 697
    .line 698
    move/from16 v22, v13

    .line 699
    .line 700
    invoke-direct/range {v17 .. v23}, La/lw7;-><init>(ILa/pu90;La/pu90;IIB)V

    .line 701
    .line 702
    .line 703
    move-object/from16 v2, v17

    .line 704
    .line 705
    move/from16 v0, v18

    .line 706
    .line 707
    invoke-static {v1, v13, v0, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    return-object v0

    .line 712
    :pswitch_1
    move-object/from16 v1, p1

    .line 713
    .line 714
    check-cast v1, La/c5n0;

    .line 715
    .line 716
    move-object/from16 v6, p2

    .line 717
    .line 718
    check-cast v6, La/p4e;

    .line 719
    .line 720
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    iget-wide v10, v6, La/p4e;->a:J

    .line 724
    .line 725
    invoke-static {v10, v11}, La/p4e;->i(J)I

    .line 726
    .line 727
    .line 728
    move-result v20

    .line 729
    iget-object v10, v8, La/uzh;->c:Ljava/lang/String;

    .line 730
    .line 731
    invoke-static {v10}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 732
    .line 733
    .line 734
    move-result v10

    .line 735
    new-instance v11, La/bnl;

    .line 736
    .line 737
    const/4 v12, 0x2

    .line 738
    invoke-direct {v11, v8, v12}, La/bnl;-><init>(La/uzh;B)V

    .line 739
    .line 740
    .line 741
    new-instance v12, La/ugd;

    .line 742
    .line 743
    const v13, -0xc5b25a7

    .line 744
    .line 745
    .line 746
    invoke-direct {v12, v13, v9, v11}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    invoke-interface {v1, v5, v12}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 750
    .line 751
    .line 752
    move-result-object v5

    .line 753
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v5

    .line 757
    check-cast v5, La/pj30;

    .line 758
    .line 759
    iget-wide v11, v6, La/p4e;->a:J

    .line 760
    .line 761
    const/16 v22, 0x0

    .line 762
    .line 763
    const/16 v23, 0xc

    .line 764
    .line 765
    const/16 v19, 0x0

    .line 766
    .line 767
    const/16 v21, 0x0

    .line 768
    .line 769
    move-wide/from16 v17, v11

    .line 770
    .line 771
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 772
    .line 773
    .line 774
    move-result-wide v11

    .line 775
    invoke-interface {v5, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 776
    .line 777
    .line 778
    move-result-object v5

    .line 779
    if-eqz v10, :cond_25

    .line 780
    .line 781
    move-object v4, v7

    .line 782
    move/from16 v13, v20

    .line 783
    .line 784
    goto :goto_1a

    .line 785
    :cond_25
    new-instance v11, La/bnl;

    .line 786
    .line 787
    const/4 v12, 0x3

    .line 788
    invoke-direct {v11, v8, v12}, La/bnl;-><init>(La/uzh;B)V

    .line 789
    .line 790
    .line 791
    new-instance v12, La/ugd;

    .line 792
    .line 793
    const v13, -0x29eb37cd

    .line 794
    .line 795
    .line 796
    invoke-direct {v12, v13, v9, v11}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 797
    .line 798
    .line 799
    invoke-interface {v1, v4, v12}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 800
    .line 801
    .line 802
    move-result-object v4

    .line 803
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v4

    .line 807
    check-cast v4, La/pj30;

    .line 808
    .line 809
    iget-wide v11, v6, La/p4e;->a:J

    .line 810
    .line 811
    const/16 v22, 0x0

    .line 812
    .line 813
    const/16 v23, 0xc

    .line 814
    .line 815
    const/16 v19, 0x0

    .line 816
    .line 817
    const/16 v21, 0x0

    .line 818
    .line 819
    move-wide/from16 v17, v11

    .line 820
    .line 821
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 822
    .line 823
    .line 824
    move-result-wide v11

    .line 825
    move/from16 v13, v20

    .line 826
    .line 827
    invoke-interface {v4, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 828
    .line 829
    .line 830
    move-result-object v4

    .line 831
    :goto_1a
    div-int/lit8 v11, v13, 0x2

    .line 832
    .line 833
    iget v12, v5, La/pu90;->a:I

    .line 834
    .line 835
    if-le v12, v11, :cond_26

    .line 836
    .line 837
    move v14, v9

    .line 838
    goto :goto_1b

    .line 839
    :cond_26
    const/4 v14, 0x0

    .line 840
    :goto_1b
    if-eqz v4, :cond_27

    .line 841
    .line 842
    iget v15, v4, La/pu90;->a:I

    .line 843
    .line 844
    goto :goto_1c

    .line 845
    :cond_27
    const/4 v15, 0x0

    .line 846
    :goto_1c
    if-le v15, v11, :cond_28

    .line 847
    .line 848
    move v15, v9

    .line 849
    goto :goto_1d

    .line 850
    :cond_28
    const/4 v15, 0x0

    .line 851
    :goto_1d
    iget v0, v0, La/inl;->c:I

    .line 852
    .line 853
    if-eqz v10, :cond_29

    .line 854
    .line 855
    move v12, v13

    .line 856
    goto :goto_20

    .line 857
    :cond_29
    if-eqz v14, :cond_2b

    .line 858
    .line 859
    if-eqz v15, :cond_2b

    .line 860
    .line 861
    div-int/lit8 v4, v0, 0x2

    .line 862
    .line 863
    sub-int v20, v11, v4

    .line 864
    .line 865
    :cond_2a
    :goto_1e
    move/from16 v12, v20

    .line 866
    .line 867
    goto :goto_20

    .line 868
    :cond_2b
    if-eqz v14, :cond_2d

    .line 869
    .line 870
    if-nez v15, :cond_2d

    .line 871
    .line 872
    sub-int v20, v13, v0

    .line 873
    .line 874
    if-eqz v4, :cond_2c

    .line 875
    .line 876
    iget v4, v4, La/pu90;->a:I

    .line 877
    .line 878
    goto :goto_1f

    .line 879
    :cond_2c
    const/4 v4, 0x0

    .line 880
    :goto_1f
    invoke-static {v4, v11}, Ljava/lang/Math;->min(II)I

    .line 881
    .line 882
    .line 883
    move-result v4

    .line 884
    sub-int v20, v20, v4

    .line 885
    .line 886
    if-gez v20, :cond_2a

    .line 887
    .line 888
    const/16 v20, 0x0

    .line 889
    .line 890
    goto :goto_1e

    .line 891
    :cond_2d
    :goto_20
    if-eqz v10, :cond_2e

    .line 892
    .line 893
    const/4 v11, 0x0

    .line 894
    goto :goto_21

    .line 895
    :cond_2e
    if-eqz v14, :cond_2f

    .line 896
    .line 897
    if-eqz v15, :cond_2f

    .line 898
    .line 899
    div-int/lit8 v4, v0, 0x2

    .line 900
    .line 901
    sub-int/2addr v11, v4

    .line 902
    goto :goto_21

    .line 903
    :cond_2f
    if-eqz v15, :cond_31

    .line 904
    .line 905
    sub-int v20, v13, v0

    .line 906
    .line 907
    iget v4, v5, La/pu90;->a:I

    .line 908
    .line 909
    sub-int v20, v20, v4

    .line 910
    .line 911
    if-gez v20, :cond_30

    .line 912
    .line 913
    const/16 v20, 0x0

    .line 914
    .line 915
    :cond_30
    move/from16 v11, v20

    .line 916
    .line 917
    :cond_31
    :goto_21
    new-instance v4, La/bnl;

    .line 918
    .line 919
    const/4 v5, 0x4

    .line 920
    invoke-direct {v4, v8, v5}, La/bnl;-><init>(La/uzh;B)V

    .line 921
    .line 922
    .line 923
    new-instance v5, La/ugd;

    .line 924
    .line 925
    const v14, -0x73de7a94

    .line 926
    .line 927
    .line 928
    invoke-direct {v5, v14, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 929
    .line 930
    .line 931
    invoke-interface {v1, v3, v5}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 932
    .line 933
    .line 934
    move-result-object v3

    .line 935
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v3

    .line 939
    check-cast v3, La/pj30;

    .line 940
    .line 941
    iget-wide v4, v6, La/p4e;->a:J

    .line 942
    .line 943
    if-le v12, v13, :cond_32

    .line 944
    .line 945
    move/from16 v20, v13

    .line 946
    .line 947
    goto :goto_22

    .line 948
    :cond_32
    move/from16 v20, v12

    .line 949
    .line 950
    :goto_22
    const/16 v22, 0x0

    .line 951
    .line 952
    const/16 v23, 0xc

    .line 953
    .line 954
    const/16 v19, 0x0

    .line 955
    .line 956
    const/16 v21, 0x0

    .line 957
    .line 958
    move-wide/from16 v17, v4

    .line 959
    .line 960
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 961
    .line 962
    .line 963
    move-result-wide v4

    .line 964
    invoke-interface {v3, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 965
    .line 966
    .line 967
    move-result-object v3

    .line 968
    if-eqz v10, :cond_33

    .line 969
    .line 970
    goto :goto_24

    .line 971
    :cond_33
    new-instance v4, La/bnl;

    .line 972
    .line 973
    invoke-direct {v4, v8, v9}, La/bnl;-><init>(La/uzh;B)V

    .line 974
    .line 975
    .line 976
    new-instance v5, La/ugd;

    .line 977
    .line 978
    const v7, -0x1b51e72e

    .line 979
    .line 980
    .line 981
    invoke-direct {v5, v7, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 982
    .line 983
    .line 984
    invoke-interface {v1, v2, v5}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 985
    .line 986
    .line 987
    move-result-object v2

    .line 988
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v2

    .line 992
    check-cast v2, La/pj30;

    .line 993
    .line 994
    iget-wide v4, v6, La/p4e;->a:J

    .line 995
    .line 996
    if-le v11, v13, :cond_34

    .line 997
    .line 998
    move/from16 v20, v13

    .line 999
    .line 1000
    goto :goto_23

    .line 1001
    :cond_34
    move/from16 v20, v11

    .line 1002
    .line 1003
    :goto_23
    const/16 v22, 0x0

    .line 1004
    .line 1005
    const/16 v23, 0xc

    .line 1006
    .line 1007
    const/16 v19, 0x0

    .line 1008
    .line 1009
    const/16 v21, 0x0

    .line 1010
    .line 1011
    move-wide/from16 v17, v4

    .line 1012
    .line 1013
    invoke-static/range {v17 .. v23}, La/p4e;->b(JIIIII)J

    .line 1014
    .line 1015
    .line 1016
    move-result-wide v4

    .line 1017
    invoke-interface {v2, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v7

    .line 1021
    :goto_24
    iget v2, v3, La/pu90;->b:I

    .line 1022
    .line 1023
    if-eqz v7, :cond_35

    .line 1024
    .line 1025
    iget v6, v7, La/pu90;->b:I

    .line 1026
    .line 1027
    goto :goto_25

    .line 1028
    :cond_35
    const/4 v6, 0x0

    .line 1029
    :goto_25
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    .line 1030
    .line 1031
    .line 1032
    move-result v18

    .line 1033
    new-instance v17, La/lw7;

    .line 1034
    .line 1035
    const/16 v23, 0x2

    .line 1036
    .line 1037
    move/from16 v21, v0

    .line 1038
    .line 1039
    move-object/from16 v19, v3

    .line 1040
    .line 1041
    move-object/from16 v20, v7

    .line 1042
    .line 1043
    move/from16 v22, v13

    .line 1044
    .line 1045
    invoke-direct/range {v17 .. v23}, La/lw7;-><init>(ILa/pu90;La/pu90;IIB)V

    .line 1046
    .line 1047
    .line 1048
    move-object/from16 v2, v17

    .line 1049
    .line 1050
    move/from16 v0, v18

    .line 1051
    .line 1052
    invoke-static {v1, v13, v0, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    return-object v0

    .line 1057
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
