.class public final La/vvl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:La/a4x;

.field public final synthetic d:La/u23;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;La/a4x;La/u23;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/vvl0;->a:B

    iput-object p1, p0, La/vvl0;->b:Ljava/util/List;

    iput-object p2, p0, La/vvl0;->c:La/a4x;

    iput-object p3, p0, La/vvl0;->d:La/u23;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vvl0;->a:B

    .line 4
    .line 5
    iget-object v4, v0, La/vvl0;->c:La/a4x;

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const-class v6, Landroid/text/style/URLSpan;

    .line 9
    .line 10
    sget-object v7, La/ukd;->a:La/cl5;

    .line 11
    .line 12
    const-string v8, ": "

    .line 13
    .line 14
    iget-object v9, v0, La/vvl0;->b:Ljava/util/List;

    .line 15
    .line 16
    const/16 v10, 0x92

    .line 17
    .line 18
    const/16 v12, 0x20

    .line 19
    .line 20
    const/4 v13, 0x2

    .line 21
    const/4 v14, 0x4

    .line 22
    iget-object v0, v0, La/vvl0;->d:La/u23;

    .line 23
    .line 24
    const/4 v15, 0x1

    .line 25
    const/4 v2, 0x0

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, La/g9z;

    .line 32
    .line 33
    move-object/from16 v16, p2

    .line 34
    .line 35
    check-cast v16, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    move-object/from16 v11, p3

    .line 42
    .line 43
    check-cast v11, La/fet;

    .line 44
    .line 45
    move-object/from16 v17, p4

    .line 46
    .line 47
    check-cast v17, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v17

    .line 53
    and-int/lit8 v18, v17, 0x6

    .line 54
    .line 55
    if-nez v18, :cond_1

    .line 56
    .line 57
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    move v13, v14

    .line 64
    :cond_0
    or-int v1, v17, v13

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move/from16 v1, v17

    .line 68
    .line 69
    :goto_0
    and-int/lit8 v13, v17, 0x30

    .line 70
    .line 71
    if-nez v13, :cond_3

    .line 72
    .line 73
    invoke-virtual {v11, v3}, La/fet;->e(I)Z

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    if-eqz v13, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    const/16 v12, 0x10

    .line 81
    .line 82
    :goto_1
    or-int/2addr v1, v12

    .line 83
    :cond_3
    and-int/lit16 v12, v1, 0x93

    .line 84
    .line 85
    if-eq v12, v10, :cond_4

    .line 86
    .line 87
    move v10, v15

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move v10, v2

    .line 90
    :goto_2
    and-int/2addr v1, v15

    .line 91
    invoke-virtual {v11, v1, v10}, La/fet;->U(IZ)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_a

    .line 96
    .line 97
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, La/swl0;

    .line 102
    .line 103
    const v9, -0x38c6cc62

    .line 104
    .line 105
    .line 106
    invoke-virtual {v11, v9}, La/fet;->e0(I)V

    .line 107
    .line 108
    .line 109
    const v9, -0x5cab917a

    .line 110
    .line 111
    .line 112
    invoke-virtual {v11, v9}, La/fet;->e0(I)V

    .line 113
    .line 114
    .line 115
    new-instance v9, La/h83;

    .line 116
    .line 117
    invoke-direct {v9}, La/h83;-><init>()V

    .line 118
    .line 119
    .line 120
    new-instance v17, La/smk0;

    .line 121
    .line 122
    sget-object v22, La/psq;->f:La/psq;

    .line 123
    .line 124
    const/16 v36, 0x0

    .line 125
    .line 126
    const v37, 0xfffb

    .line 127
    .line 128
    .line 129
    const-wide/16 v18, 0x0

    .line 130
    .line 131
    const-wide/16 v20, 0x0

    .line 132
    .line 133
    const/16 v23, 0x0

    .line 134
    .line 135
    const/16 v24, 0x0

    .line 136
    .line 137
    const/16 v25, 0x0

    .line 138
    .line 139
    const/16 v26, 0x0

    .line 140
    .line 141
    const-wide/16 v27, 0x0

    .line 142
    .line 143
    const/16 v29, 0x0

    .line 144
    .line 145
    const/16 v30, 0x0

    .line 146
    .line 147
    const/16 v31, 0x0

    .line 148
    .line 149
    const-wide/16 v32, 0x0

    .line 150
    .line 151
    const/16 v34, 0x0

    .line 152
    .line 153
    const/16 v35, 0x0

    .line 154
    .line 155
    invoke-direct/range {v17 .. v37}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 156
    .line 157
    .line 158
    move-object/from16 v10, v17

    .line 159
    .line 160
    invoke-virtual {v9, v10}, La/h83;->g(La/smk0;)I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    :try_start_0
    iget-object v12, v1, La/swl0;->a:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v9, v12}, La/h83;->c(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v8}, La/h83;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 170
    .line 171
    .line 172
    invoke-virtual {v9, v10}, La/h83;->d(I)V

    .line 173
    .line 174
    .line 175
    iget-object v1, v1, La/swl0;->b:Ljava/lang/String;

    .line 176
    .line 177
    sget-object v8, La/m8m0;->a:La/zfn;

    .line 178
    .line 179
    invoke-virtual {v11, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    check-cast v10, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 184
    .line 185
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 186
    .line 187
    .line 188
    move-result-wide v18

    .line 189
    invoke-virtual {v11, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    check-cast v8, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 194
    .line 195
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/StaticColors;->getDarkBlue-0d7_KjU()J

    .line 196
    .line 197
    .line 198
    move-result-wide v12

    .line 199
    invoke-virtual {v11, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    invoke-virtual {v11, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    or-int/2addr v8, v10

    .line 208
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    if-nez v8, :cond_5

    .line 213
    .line 214
    if-ne v10, v7, :cond_6

    .line 215
    .line 216
    :cond_5
    new-instance v10, La/uvl0;

    .line 217
    .line 218
    invoke-direct {v10, v9, v0, v15}, La/uvl0;-><init>(La/h83;La/u23;B)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v11, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_6
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 225
    .line 226
    new-instance v0, Landroid/text/SpannableString;

    .line 227
    .line 228
    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v0, v15}, Landroid/text/util/Linkify;->addLinks(Landroid/text/Spannable;I)Z

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    invoke-virtual {v0, v2, v1, v6}, Landroid/text/SpannableString;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    new-instance v6, La/wvl0;

    .line 246
    .line 247
    const/4 v7, 0x3

    .line 248
    invoke-direct {v6, v0, v7}, La/wvl0;-><init>(Landroid/text/SpannableString;B)V

    .line 249
    .line 250
    .line 251
    invoke-static {v1, v6}, La/tx3;->Y([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    move v6, v2

    .line 260
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    if-eqz v7, :cond_7

    .line 265
    .line 266
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    check-cast v7, Landroid/text/style/URLSpan;

    .line 271
    .line 272
    sget-object v25, La/j1t0;->c:La/qrq;

    .line 273
    .line 274
    new-instance v17, La/smk0;

    .line 275
    .line 276
    const/16 v36, 0x0

    .line 277
    .line 278
    const v37, 0xffde

    .line 279
    .line 280
    .line 281
    const-wide/16 v20, 0x0

    .line 282
    .line 283
    const/16 v22, 0x0

    .line 284
    .line 285
    const/16 v23, 0x0

    .line 286
    .line 287
    const/16 v24, 0x0

    .line 288
    .line 289
    const/16 v26, 0x0

    .line 290
    .line 291
    const-wide/16 v27, 0x0

    .line 292
    .line 293
    const/16 v29, 0x0

    .line 294
    .line 295
    const/16 v30, 0x0

    .line 296
    .line 297
    const/16 v31, 0x0

    .line 298
    .line 299
    const-wide/16 v32, 0x0

    .line 300
    .line 301
    const/16 v34, 0x0

    .line 302
    .line 303
    const/16 v35, 0x0

    .line 304
    .line 305
    invoke-direct/range {v17 .. v37}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 306
    .line 307
    .line 308
    move-object/from16 v8, v17

    .line 309
    .line 310
    invoke-virtual {v9, v8}, La/h83;->g(La/smk0;)I

    .line 311
    .line 312
    .line 313
    move-result v8

    .line 314
    :try_start_1
    invoke-virtual {v0, v7}, Landroid/text/SpannableString;->getSpanStart(Ljava/lang/Object;)I

    .line 315
    .line 316
    .line 317
    move-result v14

    .line 318
    invoke-virtual {v0, v6, v14}, Landroid/text/SpannableString;->subSequence(II)Ljava/lang/CharSequence;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    invoke-virtual {v9, v6}, La/h83;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 327
    .line 328
    .line 329
    invoke-virtual {v9, v8}, La/h83;->d(I)V

    .line 330
    .line 331
    .line 332
    new-instance v6, La/jb00;

    .line 333
    .line 334
    invoke-virtual {v7}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    new-instance v14, La/f9q0;

    .line 342
    .line 343
    new-instance v20, La/smk0;

    .line 344
    .line 345
    const/16 v39, 0x0

    .line 346
    .line 347
    const v40, 0xefde

    .line 348
    .line 349
    .line 350
    const-wide/16 v23, 0x0

    .line 351
    .line 352
    move-object/from16 v28, v25

    .line 353
    .line 354
    const/16 v25, 0x0

    .line 355
    .line 356
    const/16 v26, 0x0

    .line 357
    .line 358
    const/16 v27, 0x0

    .line 359
    .line 360
    const/16 v29, 0x0

    .line 361
    .line 362
    const-wide/16 v30, 0x0

    .line 363
    .line 364
    const/16 v32, 0x0

    .line 365
    .line 366
    const/16 v33, 0x0

    .line 367
    .line 368
    const/16 v34, 0x0

    .line 369
    .line 370
    const-wide/16 v35, 0x0

    .line 371
    .line 372
    sget-object v37, La/k5q0;->c:La/k5q0;

    .line 373
    .line 374
    const/16 v38, 0x0

    .line 375
    .line 376
    move-wide/from16 v21, v12

    .line 377
    .line 378
    invoke-direct/range {v20 .. v40}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 379
    .line 380
    .line 381
    move-object/from16 v12, v20

    .line 382
    .line 383
    invoke-direct {v14, v12, v5, v5, v5}, La/f9q0;-><init>(La/smk0;La/smk0;La/smk0;La/smk0;)V

    .line 384
    .line 385
    .line 386
    new-instance v12, La/sa4;

    .line 387
    .line 388
    const/4 v13, 0x7

    .line 389
    invoke-direct {v12, v10, v13}, La/sa4;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 390
    .line 391
    .line 392
    invoke-direct {v6, v8, v14, v12}, La/jb00;-><init>(Ljava/lang/String;La/f9q0;La/sa4;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, v7}, Landroid/text/SpannableString;->getSpanStart(Ljava/lang/Object;)I

    .line 396
    .line 397
    .line 398
    move-result v8

    .line 399
    invoke-virtual {v0, v7}, Landroid/text/SpannableString;->getSpanEnd(Ljava/lang/Object;)I

    .line 400
    .line 401
    .line 402
    move-result v12

    .line 403
    invoke-virtual {v0, v8, v12}, Landroid/text/SpannableString;->subSequence(II)Ljava/lang/CharSequence;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    invoke-virtual {v9, v6}, La/h83;->e(La/jb00;)I

    .line 412
    .line 413
    .line 414
    move-result v6

    .line 415
    :try_start_2
    invoke-virtual {v9, v8}, La/h83;->c(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 416
    .line 417
    .line 418
    invoke-virtual {v9, v6}, La/h83;->d(I)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0, v7}, Landroid/text/SpannableString;->getSpanEnd(Ljava/lang/Object;)I

    .line 422
    .line 423
    .line 424
    move-result v6

    .line 425
    move-wide/from16 v12, v21

    .line 426
    .line 427
    goto/16 :goto_3

    .line 428
    .line 429
    :catchall_0
    move-exception v0

    .line 430
    invoke-virtual {v9, v6}, La/h83;->d(I)V

    .line 431
    .line 432
    .line 433
    throw v0

    .line 434
    :catchall_1
    move-exception v0

    .line 435
    invoke-virtual {v9, v8}, La/h83;->d(I)V

    .line 436
    .line 437
    .line 438
    throw v0

    .line 439
    :cond_7
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    if-ge v6, v1, :cond_8

    .line 444
    .line 445
    sget-object v25, La/j1t0;->c:La/qrq;

    .line 446
    .line 447
    new-instance v17, La/smk0;

    .line 448
    .line 449
    const/16 v36, 0x0

    .line 450
    .line 451
    const v37, 0xffde

    .line 452
    .line 453
    .line 454
    const-wide/16 v20, 0x0

    .line 455
    .line 456
    const/16 v22, 0x0

    .line 457
    .line 458
    const/16 v23, 0x0

    .line 459
    .line 460
    const/16 v24, 0x0

    .line 461
    .line 462
    const/16 v26, 0x0

    .line 463
    .line 464
    const-wide/16 v27, 0x0

    .line 465
    .line 466
    const/16 v29, 0x0

    .line 467
    .line 468
    const/16 v30, 0x0

    .line 469
    .line 470
    const/16 v31, 0x0

    .line 471
    .line 472
    const-wide/16 v32, 0x0

    .line 473
    .line 474
    const/16 v34, 0x0

    .line 475
    .line 476
    const/16 v35, 0x0

    .line 477
    .line 478
    invoke-direct/range {v17 .. v37}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 479
    .line 480
    .line 481
    move-object/from16 v1, v17

    .line 482
    .line 483
    invoke-virtual {v9, v1}, La/h83;->g(La/smk0;)I

    .line 484
    .line 485
    .line 486
    move-result v1

    .line 487
    :try_start_3
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 488
    .line 489
    .line 490
    move-result v5

    .line 491
    invoke-virtual {v0, v6, v5}, Landroid/text/SpannableString;->subSequence(II)Ljava/lang/CharSequence;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {v9, v0}, La/h83;->c(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 500
    .line 501
    .line 502
    invoke-virtual {v9, v1}, La/h83;->d(I)V

    .line 503
    .line 504
    .line 505
    goto :goto_4

    .line 506
    :catchall_2
    move-exception v0

    .line 507
    invoke-virtual {v9, v1}, La/h83;->d(I)V

    .line 508
    .line 509
    .line 510
    throw v0

    .line 511
    :cond_8
    :goto_4
    invoke-virtual {v9}, La/h83;->h()La/j83;

    .line 512
    .line 513
    .line 514
    move-result-object v17

    .line 515
    invoke-virtual {v11, v2}, La/fet;->r(Z)V

    .line 516
    .line 517
    .line 518
    invoke-static {v4}, La/q3d;->i(Ljava/util/List;)I

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    if-ge v3, v0, :cond_9

    .line 523
    .line 524
    sget-object v0, La/qmk;->a:La/zcl;

    .line 525
    .line 526
    const/high16 v7, 0x40800000    # 4.0f

    .line 527
    .line 528
    goto :goto_5

    .line 529
    :cond_9
    sget-object v0, La/qmk;->a:La/zcl;

    .line 530
    .line 531
    const/4 v7, 0x0

    .line 532
    :goto_5
    const/4 v8, 0x7

    .line 533
    sget-object v3, La/jm40;->b:La/jm40;

    .line 534
    .line 535
    const/4 v4, 0x0

    .line 536
    const/4 v5, 0x0

    .line 537
    const/4 v6, 0x0

    .line 538
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 539
    .line 540
    .line 541
    move-result-object v18

    .line 542
    sget-object v25, La/j1t0;->b:La/qrq;

    .line 543
    .line 544
    sget-wide v22, La/qmk;->p:J

    .line 545
    .line 546
    sget-wide v31, La/qmk;->C:J

    .line 547
    .line 548
    new-instance v19, La/y9q0;

    .line 549
    .line 550
    const/16 v30, 0x0

    .line 551
    .line 552
    const v33, 0xfdffdd

    .line 553
    .line 554
    .line 555
    const-wide/16 v20, 0x0

    .line 556
    .line 557
    const/16 v24, 0x0

    .line 558
    .line 559
    const-wide/16 v26, 0x0

    .line 560
    .line 561
    const/16 v28, 0x0

    .line 562
    .line 563
    const/16 v29, 0x0

    .line 564
    .line 565
    invoke-direct/range {v19 .. v33}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 566
    .line 567
    .line 568
    sget-object v0, La/m8m0;->a:La/zfn;

    .line 569
    .line 570
    invoke-virtual {v11, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    check-cast v0, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 575
    .line 576
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 577
    .line 578
    .line 579
    move-result-wide v0

    .line 580
    const/16 v39, 0x0

    .line 581
    .line 582
    const v40, 0x3fff8

    .line 583
    .line 584
    .line 585
    const/16 v21, 0x0

    .line 586
    .line 587
    const-wide/16 v22, 0x0

    .line 588
    .line 589
    const-wide/16 v25, 0x0

    .line 590
    .line 591
    const/16 v27, 0x0

    .line 592
    .line 593
    const-wide/16 v28, 0x0

    .line 594
    .line 595
    const/16 v31, 0x0

    .line 596
    .line 597
    const/16 v32, 0x0

    .line 598
    .line 599
    const/16 v33, 0x0

    .line 600
    .line 601
    const/16 v34, 0x0

    .line 602
    .line 603
    const/16 v35, 0x0

    .line 604
    .line 605
    const/16 v38, 0x0

    .line 606
    .line 607
    move-object/from16 v37, v11

    .line 608
    .line 609
    move-object/from16 v36, v19

    .line 610
    .line 611
    move-wide/from16 v19, v0

    .line 612
    .line 613
    invoke-static/range {v17 .. v40}, La/v8q0;->b(La/j83;La/mm40;JLa/n05;JLa/nrq;JLa/f2q0;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 614
    .line 615
    .line 616
    move-object/from16 v0, v37

    .line 617
    .line 618
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 619
    .line 620
    .line 621
    goto :goto_6

    .line 622
    :catchall_3
    move-exception v0

    .line 623
    invoke-virtual {v9, v10}, La/h83;->d(I)V

    .line 624
    .line 625
    .line 626
    throw v0

    .line 627
    :cond_a
    move-object v0, v11

    .line 628
    invoke-virtual {v0}, La/fet;->X()V

    .line 629
    .line 630
    .line 631
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 632
    .line 633
    return-object v0

    .line 634
    :pswitch_0
    move-object/from16 v1, p1

    .line 635
    .line 636
    check-cast v1, La/g9z;

    .line 637
    .line 638
    move-object/from16 v3, p2

    .line 639
    .line 640
    check-cast v3, Ljava/lang/Number;

    .line 641
    .line 642
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    move-object/from16 v11, p3

    .line 647
    .line 648
    check-cast v11, La/fet;

    .line 649
    .line 650
    move-object/from16 v17, p4

    .line 651
    .line 652
    check-cast v17, Ljava/lang/Number;

    .line 653
    .line 654
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 655
    .line 656
    .line 657
    move-result v17

    .line 658
    and-int/lit8 v18, v17, 0x6

    .line 659
    .line 660
    if-nez v18, :cond_c

    .line 661
    .line 662
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v1

    .line 666
    if-eqz v1, :cond_b

    .line 667
    .line 668
    move v13, v14

    .line 669
    :cond_b
    or-int v1, v17, v13

    .line 670
    .line 671
    goto :goto_7

    .line 672
    :cond_c
    move/from16 v1, v17

    .line 673
    .line 674
    :goto_7
    and-int/lit8 v13, v17, 0x30

    .line 675
    .line 676
    if-nez v13, :cond_e

    .line 677
    .line 678
    invoke-virtual {v11, v3}, La/fet;->e(I)Z

    .line 679
    .line 680
    .line 681
    move-result v13

    .line 682
    if-eqz v13, :cond_d

    .line 683
    .line 684
    goto :goto_8

    .line 685
    :cond_d
    const/16 v12, 0x10

    .line 686
    .line 687
    :goto_8
    or-int/2addr v1, v12

    .line 688
    :cond_e
    and-int/lit16 v12, v1, 0x93

    .line 689
    .line 690
    if-eq v12, v10, :cond_f

    .line 691
    .line 692
    move v10, v15

    .line 693
    goto :goto_9

    .line 694
    :cond_f
    move v10, v2

    .line 695
    :goto_9
    and-int/2addr v1, v15

    .line 696
    invoke-virtual {v11, v1, v10}, La/fet;->U(IZ)Z

    .line 697
    .line 698
    .line 699
    move-result v1

    .line 700
    if-eqz v1, :cond_15

    .line 701
    .line 702
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    check-cast v1, La/pwl0;

    .line 707
    .line 708
    const v9, -0x19c049c8

    .line 709
    .line 710
    .line 711
    invoke-virtual {v11, v9}, La/fet;->e0(I)V

    .line 712
    .line 713
    .line 714
    const v9, 0x6a8630ac

    .line 715
    .line 716
    .line 717
    invoke-virtual {v11, v9}, La/fet;->e0(I)V

    .line 718
    .line 719
    .line 720
    new-instance v9, La/h83;

    .line 721
    .line 722
    invoke-direct {v9}, La/h83;-><init>()V

    .line 723
    .line 724
    .line 725
    new-instance v17, La/smk0;

    .line 726
    .line 727
    sget-object v22, La/psq;->f:La/psq;

    .line 728
    .line 729
    const/16 v36, 0x0

    .line 730
    .line 731
    const v37, 0xfffb

    .line 732
    .line 733
    .line 734
    const-wide/16 v18, 0x0

    .line 735
    .line 736
    const-wide/16 v20, 0x0

    .line 737
    .line 738
    const/16 v23, 0x0

    .line 739
    .line 740
    const/16 v24, 0x0

    .line 741
    .line 742
    const/16 v25, 0x0

    .line 743
    .line 744
    const/16 v26, 0x0

    .line 745
    .line 746
    const-wide/16 v27, 0x0

    .line 747
    .line 748
    const/16 v29, 0x0

    .line 749
    .line 750
    const/16 v30, 0x0

    .line 751
    .line 752
    const/16 v31, 0x0

    .line 753
    .line 754
    const-wide/16 v32, 0x0

    .line 755
    .line 756
    const/16 v34, 0x0

    .line 757
    .line 758
    const/16 v35, 0x0

    .line 759
    .line 760
    invoke-direct/range {v17 .. v37}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 761
    .line 762
    .line 763
    move-object/from16 v10, v17

    .line 764
    .line 765
    invoke-virtual {v9, v10}, La/h83;->g(La/smk0;)I

    .line 766
    .line 767
    .line 768
    move-result v10

    .line 769
    :try_start_4
    iget-object v12, v1, La/pwl0;->a:Ljava/lang/String;

    .line 770
    .line 771
    invoke-virtual {v9, v12}, La/h83;->c(Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v9, v8}, La/h83;->c(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    .line 775
    .line 776
    .line 777
    invoke-virtual {v9, v10}, La/h83;->d(I)V

    .line 778
    .line 779
    .line 780
    iget-object v1, v1, La/pwl0;->b:Ljava/lang/String;

    .line 781
    .line 782
    sget-object v8, La/m8m0;->a:La/zfn;

    .line 783
    .line 784
    invoke-virtual {v11, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v10

    .line 788
    check-cast v10, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 789
    .line 790
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 791
    .line 792
    .line 793
    move-result-wide v18

    .line 794
    invoke-virtual {v11, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v8

    .line 798
    check-cast v8, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 799
    .line 800
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/StaticColors;->getDarkBlue-0d7_KjU()J

    .line 801
    .line 802
    .line 803
    move-result-wide v12

    .line 804
    invoke-virtual {v11, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    move-result v8

    .line 808
    invoke-virtual {v11, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 809
    .line 810
    .line 811
    move-result v10

    .line 812
    or-int/2addr v8, v10

    .line 813
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v10

    .line 817
    if-nez v8, :cond_10

    .line 818
    .line 819
    if-ne v10, v7, :cond_11

    .line 820
    .line 821
    :cond_10
    new-instance v10, La/uvl0;

    .line 822
    .line 823
    invoke-direct {v10, v9, v0, v2}, La/uvl0;-><init>(La/h83;La/u23;B)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v11, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    :cond_11
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 830
    .line 831
    new-instance v0, Landroid/text/SpannableString;

    .line 832
    .line 833
    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 834
    .line 835
    .line 836
    invoke-static {v0, v15}, Landroid/text/util/Linkify;->addLinks(Landroid/text/Spannable;I)Z

    .line 837
    .line 838
    .line 839
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 840
    .line 841
    .line 842
    move-result v1

    .line 843
    invoke-virtual {v0, v2, v1, v6}, Landroid/text/SpannableString;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    new-instance v6, La/wvl0;

    .line 851
    .line 852
    invoke-direct {v6, v0, v2}, La/wvl0;-><init>(Landroid/text/SpannableString;B)V

    .line 853
    .line 854
    .line 855
    invoke-static {v1, v6}, La/tx3;->Y([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 860
    .line 861
    .line 862
    move-result-object v1

    .line 863
    move v6, v2

    .line 864
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 865
    .line 866
    .line 867
    move-result v7

    .line 868
    if-eqz v7, :cond_12

    .line 869
    .line 870
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object v7

    .line 874
    check-cast v7, Landroid/text/style/URLSpan;

    .line 875
    .line 876
    sget-object v25, La/j1t0;->c:La/qrq;

    .line 877
    .line 878
    new-instance v17, La/smk0;

    .line 879
    .line 880
    const/16 v36, 0x0

    .line 881
    .line 882
    const v37, 0xffde

    .line 883
    .line 884
    .line 885
    const-wide/16 v20, 0x0

    .line 886
    .line 887
    const/16 v22, 0x0

    .line 888
    .line 889
    const/16 v23, 0x0

    .line 890
    .line 891
    const/16 v24, 0x0

    .line 892
    .line 893
    const/16 v26, 0x0

    .line 894
    .line 895
    const-wide/16 v27, 0x0

    .line 896
    .line 897
    const/16 v29, 0x0

    .line 898
    .line 899
    const/16 v30, 0x0

    .line 900
    .line 901
    const/16 v31, 0x0

    .line 902
    .line 903
    const-wide/16 v32, 0x0

    .line 904
    .line 905
    const/16 v34, 0x0

    .line 906
    .line 907
    const/16 v35, 0x0

    .line 908
    .line 909
    invoke-direct/range {v17 .. v37}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 910
    .line 911
    .line 912
    move-object/from16 v8, v17

    .line 913
    .line 914
    invoke-virtual {v9, v8}, La/h83;->g(La/smk0;)I

    .line 915
    .line 916
    .line 917
    move-result v8

    .line 918
    :try_start_5
    invoke-virtual {v0, v7}, Landroid/text/SpannableString;->getSpanStart(Ljava/lang/Object;)I

    .line 919
    .line 920
    .line 921
    move-result v14

    .line 922
    invoke-virtual {v0, v6, v14}, Landroid/text/SpannableString;->subSequence(II)Ljava/lang/CharSequence;

    .line 923
    .line 924
    .line 925
    move-result-object v6

    .line 926
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v6

    .line 930
    invoke-virtual {v9, v6}, La/h83;->c(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 931
    .line 932
    .line 933
    invoke-virtual {v9, v8}, La/h83;->d(I)V

    .line 934
    .line 935
    .line 936
    new-instance v6, La/jb00;

    .line 937
    .line 938
    invoke-virtual {v7}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v8

    .line 942
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    new-instance v14, La/f9q0;

    .line 946
    .line 947
    new-instance v20, La/smk0;

    .line 948
    .line 949
    const/16 v39, 0x0

    .line 950
    .line 951
    const v40, 0xefde

    .line 952
    .line 953
    .line 954
    const-wide/16 v23, 0x0

    .line 955
    .line 956
    move-object/from16 v28, v25

    .line 957
    .line 958
    const/16 v25, 0x0

    .line 959
    .line 960
    const/16 v26, 0x0

    .line 961
    .line 962
    const/16 v27, 0x0

    .line 963
    .line 964
    const/16 v29, 0x0

    .line 965
    .line 966
    const-wide/16 v30, 0x0

    .line 967
    .line 968
    const/16 v32, 0x0

    .line 969
    .line 970
    const/16 v33, 0x0

    .line 971
    .line 972
    const/16 v34, 0x0

    .line 973
    .line 974
    const-wide/16 v35, 0x0

    .line 975
    .line 976
    sget-object v37, La/k5q0;->c:La/k5q0;

    .line 977
    .line 978
    const/16 v38, 0x0

    .line 979
    .line 980
    move-wide/from16 v21, v12

    .line 981
    .line 982
    invoke-direct/range {v20 .. v40}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 983
    .line 984
    .line 985
    move-object/from16 v12, v20

    .line 986
    .line 987
    invoke-direct {v14, v12, v5, v5, v5}, La/f9q0;-><init>(La/smk0;La/smk0;La/smk0;La/smk0;)V

    .line 988
    .line 989
    .line 990
    new-instance v12, La/sa4;

    .line 991
    .line 992
    const/4 v13, 0x6

    .line 993
    invoke-direct {v12, v10, v13}, La/sa4;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 994
    .line 995
    .line 996
    invoke-direct {v6, v8, v14, v12}, La/jb00;-><init>(Ljava/lang/String;La/f9q0;La/sa4;)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v0, v7}, Landroid/text/SpannableString;->getSpanStart(Ljava/lang/Object;)I

    .line 1000
    .line 1001
    .line 1002
    move-result v8

    .line 1003
    invoke-virtual {v0, v7}, Landroid/text/SpannableString;->getSpanEnd(Ljava/lang/Object;)I

    .line 1004
    .line 1005
    .line 1006
    move-result v12

    .line 1007
    invoke-virtual {v0, v8, v12}, Landroid/text/SpannableString;->subSequence(II)Ljava/lang/CharSequence;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v8

    .line 1011
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v8

    .line 1015
    invoke-virtual {v9, v6}, La/h83;->e(La/jb00;)I

    .line 1016
    .line 1017
    .line 1018
    move-result v6

    .line 1019
    :try_start_6
    invoke-virtual {v9, v8}, La/h83;->c(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v9, v6}, La/h83;->d(I)V

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v0, v7}, Landroid/text/SpannableString;->getSpanEnd(Ljava/lang/Object;)I

    .line 1026
    .line 1027
    .line 1028
    move-result v6

    .line 1029
    move-wide/from16 v12, v21

    .line 1030
    .line 1031
    goto/16 :goto_a

    .line 1032
    .line 1033
    :catchall_4
    move-exception v0

    .line 1034
    invoke-virtual {v9, v6}, La/h83;->d(I)V

    .line 1035
    .line 1036
    .line 1037
    throw v0

    .line 1038
    :catchall_5
    move-exception v0

    .line 1039
    invoke-virtual {v9, v8}, La/h83;->d(I)V

    .line 1040
    .line 1041
    .line 1042
    throw v0

    .line 1043
    :cond_12
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 1044
    .line 1045
    .line 1046
    move-result v1

    .line 1047
    if-ge v6, v1, :cond_13

    .line 1048
    .line 1049
    sget-object v25, La/j1t0;->c:La/qrq;

    .line 1050
    .line 1051
    new-instance v17, La/smk0;

    .line 1052
    .line 1053
    const/16 v36, 0x0

    .line 1054
    .line 1055
    const v37, 0xffde

    .line 1056
    .line 1057
    .line 1058
    const-wide/16 v20, 0x0

    .line 1059
    .line 1060
    const/16 v22, 0x0

    .line 1061
    .line 1062
    const/16 v23, 0x0

    .line 1063
    .line 1064
    const/16 v24, 0x0

    .line 1065
    .line 1066
    const/16 v26, 0x0

    .line 1067
    .line 1068
    const-wide/16 v27, 0x0

    .line 1069
    .line 1070
    const/16 v29, 0x0

    .line 1071
    .line 1072
    const/16 v30, 0x0

    .line 1073
    .line 1074
    const/16 v31, 0x0

    .line 1075
    .line 1076
    const-wide/16 v32, 0x0

    .line 1077
    .line 1078
    const/16 v34, 0x0

    .line 1079
    .line 1080
    const/16 v35, 0x0

    .line 1081
    .line 1082
    invoke-direct/range {v17 .. v37}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 1083
    .line 1084
    .line 1085
    move-object/from16 v1, v17

    .line 1086
    .line 1087
    invoke-virtual {v9, v1}, La/h83;->g(La/smk0;)I

    .line 1088
    .line 1089
    .line 1090
    move-result v1

    .line 1091
    :try_start_7
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 1092
    .line 1093
    .line 1094
    move-result v5

    .line 1095
    invoke-virtual {v0, v6, v5}, Landroid/text/SpannableString;->subSequence(II)Ljava/lang/CharSequence;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    invoke-virtual {v9, v0}, La/h83;->c(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v9, v1}, La/h83;->d(I)V

    .line 1107
    .line 1108
    .line 1109
    goto :goto_b

    .line 1110
    :catchall_6
    move-exception v0

    .line 1111
    invoke-virtual {v9, v1}, La/h83;->d(I)V

    .line 1112
    .line 1113
    .line 1114
    throw v0

    .line 1115
    :cond_13
    :goto_b
    invoke-virtual {v9}, La/h83;->h()La/j83;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v17

    .line 1119
    invoke-virtual {v11, v2}, La/fet;->r(Z)V

    .line 1120
    .line 1121
    .line 1122
    invoke-static {v4}, La/q3d;->i(Ljava/util/List;)I

    .line 1123
    .line 1124
    .line 1125
    move-result v0

    .line 1126
    if-ge v3, v0, :cond_14

    .line 1127
    .line 1128
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1129
    .line 1130
    const/high16 v7, 0x40800000    # 4.0f

    .line 1131
    .line 1132
    goto :goto_c

    .line 1133
    :cond_14
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1134
    .line 1135
    const/4 v7, 0x0

    .line 1136
    :goto_c
    const/4 v8, 0x7

    .line 1137
    sget-object v3, La/jm40;->b:La/jm40;

    .line 1138
    .line 1139
    const/4 v4, 0x0

    .line 1140
    const/4 v5, 0x0

    .line 1141
    const/4 v6, 0x0

    .line 1142
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v18

    .line 1146
    sget-object v25, La/j1t0;->b:La/qrq;

    .line 1147
    .line 1148
    sget-wide v22, La/qmk;->p:J

    .line 1149
    .line 1150
    sget-wide v31, La/qmk;->C:J

    .line 1151
    .line 1152
    new-instance v19, La/y9q0;

    .line 1153
    .line 1154
    const/16 v30, 0x0

    .line 1155
    .line 1156
    const v33, 0xfdffdd

    .line 1157
    .line 1158
    .line 1159
    const-wide/16 v20, 0x0

    .line 1160
    .line 1161
    const/16 v24, 0x0

    .line 1162
    .line 1163
    const-wide/16 v26, 0x0

    .line 1164
    .line 1165
    const/16 v28, 0x0

    .line 1166
    .line 1167
    const/16 v29, 0x0

    .line 1168
    .line 1169
    invoke-direct/range {v19 .. v33}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 1170
    .line 1171
    .line 1172
    sget-object v0, La/m8m0;->a:La/zfn;

    .line 1173
    .line 1174
    invoke-virtual {v11, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    check-cast v0, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1179
    .line 1180
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1181
    .line 1182
    .line 1183
    move-result-wide v0

    .line 1184
    const/16 v39, 0x0

    .line 1185
    .line 1186
    const v40, 0x3fff8

    .line 1187
    .line 1188
    .line 1189
    const/16 v21, 0x0

    .line 1190
    .line 1191
    const-wide/16 v22, 0x0

    .line 1192
    .line 1193
    const-wide/16 v25, 0x0

    .line 1194
    .line 1195
    const/16 v27, 0x0

    .line 1196
    .line 1197
    const-wide/16 v28, 0x0

    .line 1198
    .line 1199
    const/16 v31, 0x0

    .line 1200
    .line 1201
    const/16 v32, 0x0

    .line 1202
    .line 1203
    const/16 v33, 0x0

    .line 1204
    .line 1205
    const/16 v34, 0x0

    .line 1206
    .line 1207
    const/16 v35, 0x0

    .line 1208
    .line 1209
    const/16 v38, 0x0

    .line 1210
    .line 1211
    move-object/from16 v37, v11

    .line 1212
    .line 1213
    move-object/from16 v36, v19

    .line 1214
    .line 1215
    move-wide/from16 v19, v0

    .line 1216
    .line 1217
    invoke-static/range {v17 .. v40}, La/v8q0;->b(La/j83;La/mm40;JLa/n05;JLa/nrq;JLa/f2q0;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1218
    .line 1219
    .line 1220
    move-object/from16 v0, v37

    .line 1221
    .line 1222
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 1223
    .line 1224
    .line 1225
    goto :goto_d

    .line 1226
    :catchall_7
    move-exception v0

    .line 1227
    invoke-virtual {v9, v10}, La/h83;->d(I)V

    .line 1228
    .line 1229
    .line 1230
    throw v0

    .line 1231
    :cond_15
    move-object v0, v11

    .line 1232
    invoke-virtual {v0}, La/fet;->X()V

    .line 1233
    .line 1234
    .line 1235
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1236
    .line 1237
    return-object v0

    .line 1238
    nop

    .line 1239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
