.class public final La/x55;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tgi0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/x55;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/x55;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>([La/nek;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/x55;->a:B

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/x55;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(La/dgu;Ljava/util/List;)La/j910;
    .locals 25

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
    iget-byte v3, v0, La/x55;->a:B

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/16 v5, 0x1a

    .line 11
    .line 12
    iget-object v0, v0, La/x55;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v3, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v7, La/cy2;->T:La/ar20;

    .line 18
    .line 19
    check-cast v0, [La/nek;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v3, La/j910;

    .line 25
    .line 26
    invoke-direct {v3, v5}, La/j910;-><init>(B)V

    .line 27
    .line 28
    .line 29
    new-instance v5, La/xvq0;

    .line 30
    .line 31
    invoke-direct {v5, v1, v2}, La/xvq0;-><init>(La/dgu;Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {v5}, La/wvq0;->e()La/ar20;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const/4 v14, 0x0

    .line 44
    if-eqz v2, :cond_15

    .line 45
    .line 46
    move v2, v14

    .line 47
    move v15, v2

    .line 48
    :goto_1
    if-ge v2, v4, :cond_13

    .line 49
    .line 50
    aget-object v6, v0, v2

    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, La/wvq0;->e()La/ar20;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    iget-object v8, v5, La/wvq0;->b:La/dgu;

    .line 60
    .line 61
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-nez v6, :cond_0

    .line 66
    .line 67
    move/from16 p2, v14

    .line 68
    .line 69
    move/from16 v10, p2

    .line 70
    .line 71
    goto/16 :goto_b

    .line 72
    .line 73
    :cond_0
    invoke-virtual {v5, v14}, La/wvq0;->f(I)La/lvq0;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    iget v6, v6, La/lvq0;->b:I

    .line 78
    .line 79
    invoke-virtual {v8, v6}, La/dgu;->i(I)C

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    move v10, v4

    .line 84
    move-object v9, v5

    .line 85
    move v6, v14

    .line 86
    :goto_2
    const/16 v11, 0x32

    .line 87
    .line 88
    if-ge v6, v11, :cond_2

    .line 89
    .line 90
    invoke-virtual {v9}, La/wvq0;->g()La/ar20;

    .line 91
    .line 92
    .line 93
    move-result-object v11

    .line 94
    invoke-static {v11, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-eqz v11, :cond_2

    .line 99
    .line 100
    invoke-virtual {v9}, La/wvq0;->a()La/wvq0;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    iget-object v13, v11, La/wvq0;->b:La/dgu;

    .line 105
    .line 106
    invoke-virtual {v11, v14}, La/wvq0;->f(I)La/lvq0;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    iget v11, v11, La/lvq0;->b:I

    .line 111
    .line 112
    invoke-virtual {v13, v11}, La/dgu;->i(I)C

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    if-eq v11, v12, :cond_1

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_1
    invoke-virtual {v9}, La/wvq0;->a()La/wvq0;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    add-int/lit8 v10, v10, 0x1

    .line 124
    .line 125
    add-int/lit8 v6, v6, 0x1

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_2
    :goto_3
    const/16 v6, 0x2a

    .line 129
    .line 130
    if-ne v12, v6, :cond_3

    .line 131
    .line 132
    move v6, v4

    .line 133
    goto :goto_4

    .line 134
    :cond_3
    move v6, v14

    .line 135
    :goto_4
    invoke-static {v9, v4}, La/nek;->k(La/wvq0;I)Z

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    if-nez v11, :cond_6

    .line 140
    .line 141
    invoke-static {v9, v4}, La/nek;->h(La/wvq0;I)Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-eqz v11, :cond_4

    .line 146
    .line 147
    const/4 v11, -0x1

    .line 148
    invoke-static {v5, v11}, La/nek;->k(La/wvq0;I)Z

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    if-nez v13, :cond_5

    .line 153
    .line 154
    invoke-static {v5, v11}, La/nek;->h(La/wvq0;I)Z

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-eqz v13, :cond_7

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_4
    const/4 v11, -0x1

    .line 162
    :cond_5
    :goto_5
    move v13, v4

    .line 163
    goto :goto_6

    .line 164
    :cond_6
    const/4 v11, -0x1

    .line 165
    :cond_7
    move v13, v14

    .line 166
    :goto_6
    invoke-virtual {v5, v11}, La/wvq0;->b(I)C

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    invoke-virtual {v5, v14}, La/wvq0;->f(I)La/lvq0;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    iget v11, v11, La/lvq0;->b:I

    .line 175
    .line 176
    invoke-virtual {v8, v11}, La/dgu;->i(I)C

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    if-eq v4, v8, :cond_9

    .line 181
    .line 182
    const/4 v11, -0x1

    .line 183
    invoke-static {v5, v11}, La/nek;->k(La/wvq0;I)Z

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    if-nez v4, :cond_9

    .line 188
    .line 189
    invoke-static {v5, v11}, La/nek;->h(La/wvq0;I)Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_8

    .line 194
    .line 195
    const/4 v4, 0x1

    .line 196
    invoke-static {v9, v4}, La/nek;->k(La/wvq0;I)Z

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    if-nez v8, :cond_8

    .line 201
    .line 202
    invoke-static {v9, v4}, La/nek;->h(La/wvq0;I)Z

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-eqz v8, :cond_9

    .line 207
    .line 208
    :cond_8
    const/4 v4, 0x1

    .line 209
    goto :goto_7

    .line 210
    :cond_9
    move v4, v14

    .line 211
    :goto_7
    const-string v11, "$^`"

    .line 212
    .line 213
    if-eqz v6, :cond_a

    .line 214
    .line 215
    move v8, v13

    .line 216
    move/from16 p2, v14

    .line 217
    .line 218
    const/high16 p1, 0x63f00000

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_a
    move/from16 p2, v14

    .line 222
    .line 223
    const/high16 p1, 0x63f00000

    .line 224
    .line 225
    if-eqz v13, :cond_c

    .line 226
    .line 227
    if-eqz v4, :cond_b

    .line 228
    .line 229
    const/4 v8, -0x1

    .line 230
    invoke-virtual {v5, v8}, La/wvq0;->b(I)C

    .line 231
    .line 232
    .line 233
    move-result v14

    .line 234
    invoke-static {v11, v14}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    if-nez v8, :cond_b

    .line 239
    .line 240
    invoke-static {v14}, Ljava/lang/Character;->getType(C)I

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    shr-int v8, p1, v8

    .line 245
    .line 246
    const/16 v16, 0x1

    .line 247
    .line 248
    and-int/lit8 v8, v8, 0x1

    .line 249
    .line 250
    if-eqz v8, :cond_c

    .line 251
    .line 252
    :cond_b
    const/4 v8, 0x1

    .line 253
    goto :goto_8

    .line 254
    :cond_c
    move/from16 v8, p2

    .line 255
    .line 256
    :goto_8
    if-eqz v6, :cond_d

    .line 257
    .line 258
    move v11, v4

    .line 259
    goto :goto_9

    .line 260
    :cond_d
    if-eqz v4, :cond_f

    .line 261
    .line 262
    if-eqz v13, :cond_e

    .line 263
    .line 264
    const/4 v4, 0x1

    .line 265
    invoke-virtual {v9, v4}, La/wvq0;->b(I)C

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    invoke-static {v11, v6}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 270
    .line 271
    .line 272
    move-result v9

    .line 273
    if-nez v9, :cond_e

    .line 274
    .line 275
    invoke-static {v6}, Ljava/lang/Character;->getType(C)I

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    shr-int v6, p1, v6

    .line 280
    .line 281
    and-int/2addr v6, v4

    .line 282
    if-eqz v6, :cond_f

    .line 283
    .line 284
    :cond_e
    const/4 v11, 0x1

    .line 285
    goto :goto_9

    .line 286
    :cond_f
    move/from16 v11, p2

    .line 287
    .line 288
    :goto_9
    move/from16 v4, p2

    .line 289
    .line 290
    :goto_a
    if-ge v4, v10, :cond_10

    .line 291
    .line 292
    new-instance v6, La/p6k;

    .line 293
    .line 294
    iget v9, v5, La/wvq0;->a:I

    .line 295
    .line 296
    add-int/2addr v9, v4

    .line 297
    move/from16 v24, v10

    .line 298
    .line 299
    move v10, v8

    .line 300
    move v8, v9

    .line 301
    move/from16 v9, v24

    .line 302
    .line 303
    invoke-direct/range {v6 .. v12}, La/p6k;-><init>(La/ar20;IIZZC)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    add-int/lit8 v4, v4, 0x1

    .line 310
    .line 311
    move v8, v10

    .line 312
    move v10, v9

    .line 313
    goto :goto_a

    .line 314
    :cond_10
    move v9, v10

    .line 315
    :goto_b
    add-int/2addr v15, v10

    .line 316
    move/from16 v4, p2

    .line 317
    .line 318
    :goto_c
    if-ge v4, v10, :cond_12

    .line 319
    .line 320
    invoke-virtual {v5}, La/wvq0;->e()La/ar20;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    if-nez v6, :cond_11

    .line 325
    .line 326
    :goto_d
    const/4 v11, -0x1

    .line 327
    goto :goto_e

    .line 328
    :cond_11
    invoke-virtual {v5}, La/wvq0;->a()La/wvq0;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    add-int/lit8 v4, v4, 0x1

    .line 333
    .line 334
    goto :goto_c

    .line 335
    :cond_12
    add-int/lit8 v2, v2, 0x1

    .line 336
    .line 337
    move/from16 v14, p2

    .line 338
    .line 339
    const/4 v4, 0x1

    .line 340
    goto/16 :goto_1

    .line 341
    .line 342
    :cond_13
    if-nez v15, :cond_14

    .line 343
    .line 344
    invoke-virtual {v5}, La/wvq0;->a()La/wvq0;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    :cond_14
    const/4 v4, 0x1

    .line 349
    goto/16 :goto_0

    .line 350
    .line 351
    :cond_15
    move/from16 p2, v14

    .line 352
    .line 353
    goto :goto_d

    .line 354
    :goto_e
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v17

    .line 358
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    new-array v4, v2, [Ljava/lang/Integer;

    .line 363
    .line 364
    move/from16 v5, p2

    .line 365
    .line 366
    :goto_f
    if-ge v5, v2, :cond_16

    .line 367
    .line 368
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v6

    .line 372
    aput-object v6, v4, v5

    .line 373
    .line 374
    add-int/lit8 v5, v5, 0x1

    .line 375
    .line 376
    goto :goto_f

    .line 377
    :cond_16
    new-instance v2, Ljava/util/HashMap;

    .line 378
    .line 379
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    move/from16 v8, p2

    .line 387
    .line 388
    move v9, v8

    .line 389
    const/4 v10, -0x2

    .line 390
    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v11

    .line 394
    if-eqz v11, :cond_24

    .line 395
    .line 396
    add-int/lit8 v11, v9, 0x1

    .line 397
    .line 398
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v12

    .line 402
    check-cast v12, La/p6k;

    .line 403
    .line 404
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v13

    .line 408
    check-cast v13, La/p6k;

    .line 409
    .line 410
    iget-char v13, v13, La/p6k;->f:C

    .line 411
    .line 412
    iget-char v14, v12, La/p6k;->f:C

    .line 413
    .line 414
    iget v15, v12, La/p6k;->b:I

    .line 415
    .line 416
    iget v6, v12, La/p6k;->c:I

    .line 417
    .line 418
    if-ne v13, v14, :cond_17

    .line 419
    .line 420
    add-int/lit8 v13, v15, -0x1

    .line 421
    .line 422
    if-eq v10, v13, :cond_18

    .line 423
    .line 424
    :cond_17
    move v8, v9

    .line 425
    :cond_18
    iget-boolean v10, v12, La/p6k;->e:Z

    .line 426
    .line 427
    if-nez v10, :cond_19

    .line 428
    .line 429
    move v9, v11

    .line 430
    move v10, v15

    .line 431
    goto :goto_10

    .line 432
    :cond_19
    invoke-static {v14}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 433
    .line 434
    .line 435
    move-result-object v10

    .line 436
    invoke-virtual {v2, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v10

    .line 440
    if-nez v10, :cond_1a

    .line 441
    .line 442
    invoke-static {v14}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 443
    .line 444
    .line 445
    move-result-object v10

    .line 446
    move-object/from16 v18, v17

    .line 447
    .line 448
    move-object/from16 v19, v17

    .line 449
    .line 450
    move-object/from16 v20, v17

    .line 451
    .line 452
    move-object/from16 v21, v17

    .line 453
    .line 454
    move-object/from16 v22, v17

    .line 455
    .line 456
    filled-new-array/range {v17 .. v22}, [Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v13

    .line 460
    invoke-virtual {v2, v10, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    :cond_1a
    invoke-static {v14}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 464
    .line 465
    .line 466
    move-result-object v10

    .line 467
    invoke-virtual {v2, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v10

    .line 471
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    check-cast v10, [Ljava/lang/Integer;

    .line 475
    .line 476
    iget-boolean v13, v12, La/p6k;->d:Z

    .line 477
    .line 478
    const/16 v18, 0x3

    .line 479
    .line 480
    if-eqz v13, :cond_1b

    .line 481
    .line 482
    move/from16 v13, v18

    .line 483
    .line 484
    goto :goto_11

    .line 485
    :cond_1b
    move/from16 v13, p2

    .line 486
    .line 487
    :goto_11
    rem-int/lit8 v19, v6, 0x3

    .line 488
    .line 489
    add-int v13, v19, v13

    .line 490
    .line 491
    aget-object v10, v10, v13

    .line 492
    .line 493
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 494
    .line 495
    .line 496
    move-result v10

    .line 497
    aget-object v13, v4, v8

    .line 498
    .line 499
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 500
    .line 501
    .line 502
    move-result v13

    .line 503
    sub-int v13, v8, v13

    .line 504
    .line 505
    const/16 v16, 0x1

    .line 506
    .line 507
    add-int/lit8 v13, v13, -0x1

    .line 508
    .line 509
    move-object/from16 v20, v0

    .line 510
    .line 511
    move v0, v13

    .line 512
    :goto_12
    if-le v0, v10, :cond_21

    .line 513
    .line 514
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v21

    .line 518
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    move/from16 v22, v0

    .line 522
    .line 523
    move-object/from16 v0, v21

    .line 524
    .line 525
    check-cast v0, La/p6k;

    .line 526
    .line 527
    move-object/from16 v21, v4

    .line 528
    .line 529
    iget-char v4, v0, La/p6k;->f:C

    .line 530
    .line 531
    if-eq v4, v14, :cond_1c

    .line 532
    .line 533
    aget-object v0, v21, v22

    .line 534
    .line 535
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    add-int/lit8 v0, v0, 0x1

    .line 540
    .line 541
    sub-int v0, v22, v0

    .line 542
    .line 543
    move-object/from16 v4, v21

    .line 544
    .line 545
    :goto_13
    const/16 v16, 0x1

    .line 546
    .line 547
    goto :goto_12

    .line 548
    :cond_1c
    iget-boolean v4, v0, La/p6k;->d:Z

    .line 549
    .line 550
    if-eqz v4, :cond_20

    .line 551
    .line 552
    iget v4, v0, La/p6k;->g:I

    .line 553
    .line 554
    if-gez v4, :cond_20

    .line 555
    .line 556
    iget-boolean v4, v0, La/p6k;->e:Z

    .line 557
    .line 558
    if-nez v4, :cond_1d

    .line 559
    .line 560
    iget-boolean v4, v12, La/p6k;->d:Z

    .line 561
    .line 562
    if-eqz v4, :cond_1e

    .line 563
    .line 564
    :cond_1d
    iget v4, v0, La/p6k;->c:I

    .line 565
    .line 566
    add-int v23, v4, v6

    .line 567
    .line 568
    rem-int/lit8 v23, v23, 0x3

    .line 569
    .line 570
    if-nez v23, :cond_1e

    .line 571
    .line 572
    rem-int/lit8 v4, v4, 0x3

    .line 573
    .line 574
    if-nez v4, :cond_20

    .line 575
    .line 576
    if-eqz v19, :cond_1e

    .line 577
    .line 578
    goto :goto_16

    .line 579
    :cond_1e
    if-lez v22, :cond_1f

    .line 580
    .line 581
    add-int/lit8 v4, v22, -0x1

    .line 582
    .line 583
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v6

    .line 587
    check-cast v6, La/p6k;

    .line 588
    .line 589
    iget-boolean v6, v6, La/p6k;->d:Z

    .line 590
    .line 591
    if-nez v6, :cond_1f

    .line 592
    .line 593
    aget-object v4, v21, v4

    .line 594
    .line 595
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    const/16 v16, 0x1

    .line 600
    .line 601
    add-int/lit8 v4, v4, 0x1

    .line 602
    .line 603
    goto :goto_14

    .line 604
    :cond_1f
    move/from16 v4, p2

    .line 605
    .line 606
    :goto_14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 607
    .line 608
    .line 609
    move-result-object v6

    .line 610
    aput-object v6, v21, v22

    .line 611
    .line 612
    sub-int v6, v9, v22

    .line 613
    .line 614
    add-int/2addr v6, v4

    .line 615
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 616
    .line 617
    .line 618
    move-result-object v4

    .line 619
    aput-object v4, v21, v9

    .line 620
    .line 621
    move/from16 v4, p2

    .line 622
    .line 623
    iput-boolean v4, v12, La/p6k;->d:Z

    .line 624
    .line 625
    iput v9, v0, La/p6k;->g:I

    .line 626
    .line 627
    iput-boolean v4, v0, La/p6k;->e:Z

    .line 628
    .line 629
    const/4 v10, -0x2

    .line 630
    const/4 v13, -0x1

    .line 631
    :goto_15
    const/4 v0, -0x1

    .line 632
    goto :goto_17

    .line 633
    :cond_20
    :goto_16
    aget-object v0, v21, v22

    .line 634
    .line 635
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 636
    .line 637
    .line 638
    move-result v0

    .line 639
    const/16 v16, 0x1

    .line 640
    .line 641
    add-int/lit8 v0, v0, 0x1

    .line 642
    .line 643
    sub-int v0, v22, v0

    .line 644
    .line 645
    move-object/from16 v4, v21

    .line 646
    .line 647
    const/16 p2, 0x0

    .line 648
    .line 649
    goto :goto_13

    .line 650
    :cond_21
    move-object/from16 v21, v4

    .line 651
    .line 652
    move v10, v15

    .line 653
    goto :goto_15

    .line 654
    :goto_17
    if-eq v13, v0, :cond_23

    .line 655
    .line 656
    invoke-static {v14}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 665
    .line 666
    .line 667
    check-cast v0, [Ljava/lang/Integer;

    .line 668
    .line 669
    iget-boolean v4, v12, La/p6k;->d:Z

    .line 670
    .line 671
    if-eqz v4, :cond_22

    .line 672
    .line 673
    goto :goto_18

    .line 674
    :cond_22
    const/16 v18, 0x0

    .line 675
    .line 676
    :goto_18
    add-int v19, v19, v18

    .line 677
    .line 678
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 679
    .line 680
    .line 681
    move-result-object v4

    .line 682
    aput-object v4, v0, v19

    .line 683
    .line 684
    :cond_23
    move v9, v11

    .line 685
    move-object/from16 v0, v20

    .line 686
    .line 687
    move-object/from16 v4, v21

    .line 688
    .line 689
    const/16 p2, 0x0

    .line 690
    .line 691
    goto/16 :goto_10

    .line 692
    .line 693
    :cond_24
    move/from16 v4, p2

    .line 694
    .line 695
    move-object/from16 v20, v0

    .line 696
    .line 697
    aget-object v0, v20, v4

    .line 698
    .line 699
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 703
    .line 704
    .line 705
    move-result v0

    .line 706
    const/4 v11, -0x1

    .line 707
    add-int/2addr v0, v11

    .line 708
    if-ltz v0, :cond_2b

    .line 709
    .line 710
    move v2, v4

    .line 711
    :goto_19
    add-int/lit8 v5, v0, -0x1

    .line 712
    .line 713
    if-eqz v2, :cond_26

    .line 714
    .line 715
    move v2, v4

    .line 716
    :cond_25
    const/4 v11, -0x1

    .line 717
    goto/16 :goto_1c

    .line 718
    .line 719
    :cond_26
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v6

    .line 723
    check-cast v6, La/p6k;

    .line 724
    .line 725
    iget-object v8, v6, La/p6k;->a:La/ar20;

    .line 726
    .line 727
    iget v9, v6, La/p6k;->b:I

    .line 728
    .line 729
    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    move-result v8

    .line 733
    if-eqz v8, :cond_25

    .line 734
    .line 735
    iget v8, v6, La/p6k;->g:I

    .line 736
    .line 737
    const/4 v11, -0x1

    .line 738
    if-ne v8, v11, :cond_27

    .line 739
    .line 740
    goto/16 :goto_1c

    .line 741
    .line 742
    :cond_27
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    check-cast v2, La/p6k;

    .line 747
    .line 748
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v8

    .line 752
    check-cast v8, La/p6k;

    .line 753
    .line 754
    if-lez v0, :cond_28

    .line 755
    .line 756
    add-int/lit8 v0, v0, -0x1

    .line 757
    .line 758
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v10

    .line 762
    check-cast v10, La/p6k;

    .line 763
    .line 764
    iget v10, v10, La/p6k;->g:I

    .line 765
    .line 766
    iget v12, v2, La/p6k;->g:I

    .line 767
    .line 768
    const/16 v16, 0x1

    .line 769
    .line 770
    add-int/lit8 v12, v12, 0x1

    .line 771
    .line 772
    if-ne v10, v12, :cond_28

    .line 773
    .line 774
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v10

    .line 778
    check-cast v10, La/p6k;

    .line 779
    .line 780
    iget-char v10, v10, La/p6k;->f:C

    .line 781
    .line 782
    iget-char v12, v2, La/p6k;->f:C

    .line 783
    .line 784
    if-ne v10, v12, :cond_28

    .line 785
    .line 786
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    check-cast v0, La/p6k;

    .line 791
    .line 792
    iget v0, v0, La/p6k;->b:I

    .line 793
    .line 794
    iget v10, v2, La/p6k;->b:I

    .line 795
    .line 796
    add-int/lit8 v10, v10, -0x1

    .line 797
    .line 798
    if-ne v0, v10, :cond_28

    .line 799
    .line 800
    iget v0, v2, La/p6k;->g:I

    .line 801
    .line 802
    add-int/lit8 v0, v0, 0x1

    .line 803
    .line 804
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    check-cast v0, La/p6k;

    .line 809
    .line 810
    iget v0, v0, La/p6k;->b:I

    .line 811
    .line 812
    iget v2, v8, La/p6k;->b:I

    .line 813
    .line 814
    add-int/lit8 v2, v2, 0x1

    .line 815
    .line 816
    if-ne v0, v2, :cond_28

    .line 817
    .line 818
    const/4 v0, 0x1

    .line 819
    goto :goto_1a

    .line 820
    :cond_28
    move v0, v4

    .line 821
    :goto_1a
    iget v2, v6, La/p6k;->g:I

    .line 822
    .line 823
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    check-cast v2, La/p6k;

    .line 828
    .line 829
    if-eqz v0, :cond_29

    .line 830
    .line 831
    new-instance v6, La/sgi0;

    .line 832
    .line 833
    new-instance v8, Lkotlin/ranges/IntRange;

    .line 834
    .line 835
    add-int/lit8 v9, v9, -0x1

    .line 836
    .line 837
    iget v2, v2, La/p6k;->b:I

    .line 838
    .line 839
    add-int/lit8 v2, v2, 0x2

    .line 840
    .line 841
    const/4 v10, 0x1

    .line 842
    invoke-direct {v8, v9, v2, v10}, Lkotlin/ranges/a;-><init>(III)V

    .line 843
    .line 844
    .line 845
    sget-object v2, La/wb;->x:La/ar20;

    .line 846
    .line 847
    invoke-direct {v6, v8, v2}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 848
    .line 849
    .line 850
    goto :goto_1b

    .line 851
    :cond_29
    const/4 v10, 0x1

    .line 852
    new-instance v6, La/sgi0;

    .line 853
    .line 854
    new-instance v8, Lkotlin/ranges/IntRange;

    .line 855
    .line 856
    iget v2, v2, La/p6k;->b:I

    .line 857
    .line 858
    add-int/2addr v2, v10

    .line 859
    invoke-direct {v8, v9, v2, v10}, Lkotlin/ranges/a;-><init>(III)V

    .line 860
    .line 861
    .line 862
    sget-object v2, La/wb;->w:La/ar20;

    .line 863
    .line 864
    invoke-direct {v6, v8, v2}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 865
    .line 866
    .line 867
    :goto_1b
    iget-object v2, v3, La/j910;->b:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast v2, Ljava/util/ArrayList;

    .line 870
    .line 871
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 872
    .line 873
    .line 874
    move v2, v0

    .line 875
    :goto_1c
    if-gez v5, :cond_2a

    .line 876
    .line 877
    goto :goto_1d

    .line 878
    :cond_2a
    move v0, v5

    .line 879
    goto/16 :goto_19

    .line 880
    .line 881
    :cond_2b
    :goto_1d
    return-object v3

    .line 882
    :pswitch_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    new-instance v3, La/j910;

    .line 886
    .line 887
    invoke-direct {v3, v5}, La/j910;-><init>(B)V

    .line 888
    .line 889
    .line 890
    new-instance v4, Ljava/util/ArrayList;

    .line 891
    .line 892
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 893
    .line 894
    .line 895
    new-instance v5, La/xvq0;

    .line 896
    .line 897
    invoke-direct {v5, v1, v2}, La/xvq0;-><init>(La/dgu;Ljava/util/List;)V

    .line 898
    .line 899
    .line 900
    const/16 v1, -0xef

    .line 901
    .line 902
    move v2, v1

    .line 903
    move v6, v2

    .line 904
    :goto_1e
    iget v7, v5, La/wvq0;->a:I

    .line 905
    .line 906
    invoke-virtual {v5}, La/wvq0;->e()La/ar20;

    .line 907
    .line 908
    .line 909
    move-result-object v8

    .line 910
    if-eqz v8, :cond_31

    .line 911
    .line 912
    invoke-virtual {v5}, La/wvq0;->e()La/ar20;

    .line 913
    .line 914
    .line 915
    move-result-object v8

    .line 916
    sget-object v9, La/cy2;->H:La/ar20;

    .line 917
    .line 918
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 919
    .line 920
    .line 921
    move-result v8

    .line 922
    if-eqz v8, :cond_2e

    .line 923
    .line 924
    invoke-virtual {v5}, La/xvq0;->g()La/ar20;

    .line 925
    .line 926
    .line 927
    move-result-object v8

    .line 928
    if-eqz v8, :cond_2e

    .line 929
    .line 930
    move-object v9, v0

    .line 931
    check-cast v9, Ljava/util/List;

    .line 932
    .line 933
    invoke-interface {v9, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 934
    .line 935
    .line 936
    move-result v8

    .line 937
    if-eqz v8, :cond_2e

    .line 938
    .line 939
    :goto_1f
    invoke-virtual {v5}, La/wvq0;->e()La/ar20;

    .line 940
    .line 941
    .line 942
    move-result-object v8

    .line 943
    sget-object v9, La/cy2;->I:La/ar20;

    .line 944
    .line 945
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 946
    .line 947
    .line 948
    move-result v8

    .line 949
    if-nez v8, :cond_2c

    .line 950
    .line 951
    invoke-virtual {v5}, La/wvq0;->e()La/ar20;

    .line 952
    .line 953
    .line 954
    move-result-object v8

    .line 955
    if-eqz v8, :cond_2c

    .line 956
    .line 957
    invoke-virtual {v5}, La/xvq0;->h()La/xvq0;

    .line 958
    .line 959
    .line 960
    move-result-object v5

    .line 961
    goto :goto_1f

    .line 962
    :cond_2c
    invoke-virtual {v5}, La/wvq0;->e()La/ar20;

    .line 963
    .line 964
    .line 965
    move-result-object v8

    .line 966
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 967
    .line 968
    .line 969
    move-result v8

    .line 970
    if-eqz v8, :cond_2d

    .line 971
    .line 972
    new-instance v8, La/sgi0;

    .line 973
    .line 974
    new-instance v9, Lkotlin/ranges/IntRange;

    .line 975
    .line 976
    iget v10, v5, La/wvq0;->a:I

    .line 977
    .line 978
    const/4 v11, 0x1

    .line 979
    add-int/2addr v10, v11

    .line 980
    invoke-direct {v9, v7, v10, v11}, Lkotlin/ranges/a;-><init>(III)V

    .line 981
    .line 982
    .line 983
    sget-object v7, La/wb;->H:La/ar20;

    .line 984
    .line 985
    invoke-direct {v8, v9, v7}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 986
    .line 987
    .line 988
    iget-object v7, v3, La/j910;->b:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v7, Ljava/util/ArrayList;

    .line 991
    .line 992
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 993
    .line 994
    .line 995
    :cond_2d
    const/4 v10, 0x1

    .line 996
    goto :goto_22

    .line 997
    :cond_2e
    add-int/lit8 v8, v2, 0x1

    .line 998
    .line 999
    if-ne v8, v7, :cond_2f

    .line 1000
    .line 1001
    const/4 v10, 0x1

    .line 1002
    goto :goto_21

    .line 1003
    :cond_2f
    if-eq v6, v1, :cond_30

    .line 1004
    .line 1005
    new-instance v8, Lkotlin/ranges/IntRange;

    .line 1006
    .line 1007
    const/4 v10, 0x1

    .line 1008
    invoke-direct {v8, v6, v2, v10}, Lkotlin/ranges/a;-><init>(III)V

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1012
    .line 1013
    .line 1014
    goto :goto_20

    .line 1015
    :cond_30
    const/4 v10, 0x1

    .line 1016
    :goto_20
    move v6, v7

    .line 1017
    :goto_21
    move v2, v7

    .line 1018
    :goto_22
    invoke-virtual {v5}, La/xvq0;->h()La/xvq0;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v5

    .line 1022
    goto :goto_1e

    .line 1023
    :cond_31
    const/4 v10, 0x1

    .line 1024
    if-eq v6, v1, :cond_32

    .line 1025
    .line 1026
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 1027
    .line 1028
    invoke-direct {v0, v6, v2, v10}, Lkotlin/ranges/a;-><init>(III)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1032
    .line 1033
    .line 1034
    :cond_32
    invoke-virtual {v3, v4}, La/j910;->D(Ljava/util/ArrayList;)V

    .line 1035
    .line 1036
    .line 1037
    return-object v3

    .line 1038
    nop

    .line 1039
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
