.class public final synthetic La/gew;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/a4x;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gew;->a:B

    iput-object p1, p0, La/gew;->b:La/a4x;

    iput-object p2, p0, La/gew;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gew;->a:B

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    const/16 v3, 0x90

    .line 8
    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    sget-object v5, La/ukd;->a:La/cl5;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    iget-object v7, v0, La/gew;->c:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    iget-object v0, v0, La/gew;->b:La/a4x;

    .line 17
    .line 18
    const/16 v8, 0xe

    .line 19
    .line 20
    const/16 v9, 0x10

    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/g9z;

    .line 29
    .line 30
    move-object/from16 v11, p2

    .line 31
    .line 32
    check-cast v11, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v11

    .line 38
    move-object/from16 v12, p3

    .line 39
    .line 40
    check-cast v12, La/fet;

    .line 41
    .line 42
    move-object/from16 v13, p4

    .line 43
    .line 44
    check-cast v13, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v13

    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    and-int/lit8 v1, v13, 0x30

    .line 54
    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    invoke-virtual {v12, v11}, La/fet;->e(I)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v4, v9

    .line 65
    :goto_0
    or-int/2addr v13, v4

    .line 66
    :cond_1
    and-int/lit16 v1, v13, 0x91

    .line 67
    .line 68
    if-eq v1, v3, :cond_2

    .line 69
    .line 70
    move v1, v6

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move v1, v10

    .line 73
    :goto_1
    and-int/lit8 v3, v13, 0x1

    .line 74
    .line 75
    invoke-virtual {v12, v3, v1}, La/fet;->U(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_c

    .line 80
    .line 81
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, La/p6t0;

    .line 86
    .line 87
    instance-of v1, v0, La/zog;

    .line 88
    .line 89
    if-eqz v1, :cond_b

    .line 90
    .line 91
    const v1, 0x2597dcf4

    .line 92
    .line 93
    .line 94
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 95
    .line 96
    .line 97
    sget-object v1, La/qmk;->a:La/zcl;

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    const/16 v18, 0xd

    .line 102
    .line 103
    sget-object v13, La/jm40;->b:La/jm40;

    .line 104
    .line 105
    const/4 v14, 0x0

    .line 106
    const/high16 v15, 0x40800000    # 4.0f

    .line 107
    .line 108
    const/16 v16, 0x0

    .line 109
    .line 110
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    move-object v3, v0

    .line 115
    check-cast v3, La/zog;

    .line 116
    .line 117
    iget-object v13, v3, La/zog;->b:La/m5m;

    .line 118
    .line 119
    invoke-virtual {v12, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    if-nez v4, :cond_3

    .line 128
    .line 129
    if-ne v6, v5, :cond_4

    .line 130
    .line 131
    :cond_3
    new-instance v6, La/rp30;

    .line 132
    .line 133
    invoke-direct {v6, v7, v8}, La/rp30;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_4
    move-object v15, v6

    .line 140
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 141
    .line 142
    invoke-virtual {v12, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    if-nez v4, :cond_5

    .line 151
    .line 152
    if-ne v6, v5, :cond_6

    .line 153
    .line 154
    :cond_5
    new-instance v6, La/m040;

    .line 155
    .line 156
    const/16 v4, 0x16

    .line 157
    .line 158
    invoke-direct {v6, v7, v4}, La/m040;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_6
    move-object/from16 v16, v6

    .line 165
    .line 166
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 167
    .line 168
    invoke-virtual {v12, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    or-int/2addr v0, v4

    .line 177
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    if-nez v0, :cond_7

    .line 182
    .line 183
    if-ne v4, v5, :cond_8

    .line 184
    .line 185
    :cond_7
    new-instance v4, La/mk40;

    .line 186
    .line 187
    invoke-direct {v4, v7, v3, v10}, La/mk40;-><init>(Lkotlin/jvm/functions/Function1;La/zog;B)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_8
    move-object/from16 v17, v4

    .line 194
    .line 195
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 196
    .line 197
    invoke-virtual {v12, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    if-nez v0, :cond_9

    .line 206
    .line 207
    if-ne v3, v5, :cond_a

    .line 208
    .line 209
    :cond_9
    new-instance v3, La/rp30;

    .line 210
    .line 211
    invoke-direct {v3, v7, v2}, La/rp30;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_a
    move-object/from16 v19, v3

    .line 218
    .line 219
    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 220
    .line 221
    const/16 v22, 0x0

    .line 222
    .line 223
    const/16 v23, 0x144

    .line 224
    .line 225
    const/4 v14, 0x0

    .line 226
    const/16 v18, 0x0

    .line 227
    .line 228
    const/16 v20, 0x0

    .line 229
    .line 230
    move-object/from16 v21, v12

    .line 231
    .line 232
    move-object v12, v1

    .line 233
    invoke-static/range {v12 .. v23}, La/j5m;->a(La/mm40;La/o5m;La/h5m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 234
    .line 235
    .line 236
    move-object/from16 v0, v21

    .line 237
    .line 238
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_b
    move-object v0, v12

    .line 243
    const v1, 0x25a7e1ea

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 250
    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_c
    move-object v0, v12

    .line 254
    invoke-virtual {v0}, La/fet;->X()V

    .line 255
    .line 256
    .line 257
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_0
    move-object/from16 v1, p1

    .line 261
    .line 262
    check-cast v1, La/g9z;

    .line 263
    .line 264
    move-object/from16 v11, p2

    .line 265
    .line 266
    check-cast v11, Ljava/lang/Integer;

    .line 267
    .line 268
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    move-object/from16 v12, p3

    .line 273
    .line 274
    check-cast v12, La/fet;

    .line 275
    .line 276
    move-object/from16 v13, p4

    .line 277
    .line 278
    check-cast v13, Ljava/lang/Integer;

    .line 279
    .line 280
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result v13

    .line 284
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    and-int/lit8 v1, v13, 0x30

    .line 288
    .line 289
    if-nez v1, :cond_e

    .line 290
    .line 291
    invoke-virtual {v12, v11}, La/fet;->e(I)Z

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    if-eqz v1, :cond_d

    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_d
    move v4, v9

    .line 299
    :goto_3
    or-int/2addr v13, v4

    .line 300
    :cond_e
    and-int/lit16 v1, v13, 0x91

    .line 301
    .line 302
    if-eq v1, v3, :cond_f

    .line 303
    .line 304
    move v1, v6

    .line 305
    goto :goto_4

    .line 306
    :cond_f
    move v1, v10

    .line 307
    :goto_4
    and-int/lit8 v3, v13, 0x1

    .line 308
    .line 309
    invoke-virtual {v12, v3, v1}, La/fet;->U(IZ)Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-eqz v1, :cond_23

    .line 314
    .line 315
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    check-cast v0, La/p6t0;

    .line 320
    .line 321
    if-nez v0, :cond_11

    .line 322
    .line 323
    :cond_10
    move-object v0, v12

    .line 324
    goto/16 :goto_5

    .line 325
    .line 326
    :cond_11
    instance-of v1, v0, La/bew;

    .line 327
    .line 328
    if-eqz v1, :cond_14

    .line 329
    .line 330
    const v1, 0x6792a94

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 334
    .line 335
    .line 336
    check-cast v0, La/bew;

    .line 337
    .line 338
    invoke-virtual {v12, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    if-nez v1, :cond_12

    .line 347
    .line 348
    if-ne v2, v5, :cond_13

    .line 349
    .line 350
    :cond_12
    new-instance v2, La/dht;

    .line 351
    .line 352
    const/16 v1, 0xf

    .line 353
    .line 354
    invoke-direct {v2, v7, v1}, La/dht;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    :cond_13
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 361
    .line 362
    invoke-static {v0, v2, v12, v10}, La/wvb;->B(La/bew;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v10}, La/fet;->r(Z)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_6

    .line 369
    .line 370
    :cond_14
    instance-of v1, v0, La/t93;

    .line 371
    .line 372
    if-eqz v1, :cond_19

    .line 373
    .line 374
    const v1, 0x67f51c4

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 378
    .line 379
    .line 380
    check-cast v0, La/t93;

    .line 381
    .line 382
    invoke-virtual {v12, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    if-nez v1, :cond_15

    .line 391
    .line 392
    if-ne v3, v5, :cond_16

    .line 393
    .line 394
    :cond_15
    new-instance v3, La/dht;

    .line 395
    .line 396
    invoke-direct {v3, v7, v9}, La/dht;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    :cond_16
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 403
    .line 404
    invoke-virtual {v12, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    if-nez v1, :cond_17

    .line 413
    .line 414
    if-ne v4, v5, :cond_18

    .line 415
    .line 416
    :cond_17
    new-instance v4, La/i8v;

    .line 417
    .line 418
    invoke-direct {v4, v7, v2}, La/i8v;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    :cond_18
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 425
    .line 426
    invoke-static {v0, v3, v4, v12, v10}, La/bsr0;->c(La/t93;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v10}, La/fet;->r(Z)V

    .line 430
    .line 431
    .line 432
    goto/16 :goto_6

    .line 433
    .line 434
    :cond_19
    instance-of v1, v0, La/yf60;

    .line 435
    .line 436
    if-eqz v1, :cond_1c

    .line 437
    .line 438
    const v1, 0x688ca10

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 442
    .line 443
    .line 444
    check-cast v0, La/yf60;

    .line 445
    .line 446
    invoke-virtual {v12, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    if-nez v1, :cond_1a

    .line 455
    .line 456
    if-ne v2, v5, :cond_1b

    .line 457
    .line 458
    :cond_1a
    new-instance v2, La/i8v;

    .line 459
    .line 460
    invoke-direct {v2, v7, v8}, La/i8v;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    :cond_1b
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 467
    .line 468
    invoke-static {v0, v2, v12, v10}, La/ucx;->s(La/yf60;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v10}, La/fet;->r(Z)V

    .line 472
    .line 473
    .line 474
    goto/16 :goto_6

    .line 475
    .line 476
    :cond_1c
    instance-of v1, v0, La/idw;

    .line 477
    .line 478
    if-eqz v1, :cond_10

    .line 479
    .line 480
    const v1, 0x68c51e8

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 484
    .line 485
    .line 486
    move-object v1, v0

    .line 487
    check-cast v1, La/idw;

    .line 488
    .line 489
    invoke-virtual {v12, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    if-nez v2, :cond_1d

    .line 498
    .line 499
    if-ne v3, v5, :cond_1e

    .line 500
    .line 501
    :cond_1d
    new-instance v3, La/dht;

    .line 502
    .line 503
    const/16 v2, 0x11

    .line 504
    .line 505
    invoke-direct {v3, v7, v2}, La/dht;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    :cond_1e
    move-object v13, v3

    .line 512
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 513
    .line 514
    invoke-virtual {v12, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v2

    .line 518
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    if-nez v2, :cond_1f

    .line 523
    .line 524
    if-ne v3, v5, :cond_20

    .line 525
    .line 526
    :cond_1f
    new-instance v3, La/dht;

    .line 527
    .line 528
    invoke-direct {v3, v7, v8}, La/dht;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    :cond_20
    move-object v14, v3

    .line 535
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 536
    .line 537
    invoke-virtual {v12, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    or-int/2addr v2, v3

    .line 546
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    if-nez v2, :cond_21

    .line 551
    .line 552
    if-ne v3, v5, :cond_22

    .line 553
    .line 554
    :cond_21
    new-instance v3, La/vwj;

    .line 555
    .line 556
    const/4 v2, 0x4

    .line 557
    invoke-direct {v3, v7, v0, v2}, La/vwj;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    :cond_22
    move-object v15, v3

    .line 564
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 565
    .line 566
    const/16 v17, 0x0

    .line 567
    .line 568
    move-object/from16 v16, v12

    .line 569
    .line 570
    move-object v12, v1

    .line 571
    invoke-static/range {v12 .. v17}, La/m0x0;->s(La/idw;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 572
    .line 573
    .line 574
    move-object/from16 v0, v16

    .line 575
    .line 576
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 577
    .line 578
    .line 579
    goto :goto_6

    .line 580
    :goto_5
    const v1, 0x6944277

    .line 581
    .line 582
    .line 583
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 587
    .line 588
    .line 589
    goto :goto_6

    .line 590
    :cond_23
    move-object v0, v12

    .line 591
    invoke-virtual {v0}, La/fet;->X()V

    .line 592
    .line 593
    .line 594
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 595
    .line 596
    return-object v0

    .line 597
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
