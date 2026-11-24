.class public final La/o0i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/o0i;->a:B

    iput-object p1, p0, La/o0i;->b:Ljava/util/List;

    iput-object p2, p0, La/o0i;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/o0i;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, La/ukd;->a:La/cl5;

    .line 7
    .line 8
    iget-object v4, v0, La/o0i;->c:Lkotlin/jvm/functions/Function2;

    .line 9
    .line 10
    iget-object v5, v0, La/o0i;->b:Ljava/util/List;

    .line 11
    .line 12
    const/16 v6, 0x92

    .line 13
    .line 14
    const/16 v7, 0x10

    .line 15
    .line 16
    const/16 v8, 0x20

    .line 17
    .line 18
    const/4 v9, 0x2

    .line 19
    const/4 v10, 0x4

    .line 20
    const/4 v11, 0x1

    .line 21
    const/4 v12, 0x0

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    check-cast v0, La/g9z;

    .line 28
    .line 29
    move-object/from16 v1, p2

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    move-object/from16 v2, p3

    .line 38
    .line 39
    check-cast v2, La/fet;

    .line 40
    .line 41
    move-object/from16 v3, p4

    .line 42
    .line 43
    check-cast v3, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    and-int/lit8 v13, v3, 0x6

    .line 50
    .line 51
    if-nez v13, :cond_1

    .line 52
    .line 53
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    move v9, v10

    .line 60
    :cond_0
    or-int v0, v3, v9

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move v0, v3

    .line 64
    :goto_0
    and-int/lit8 v3, v3, 0x30

    .line 65
    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    move v7, v8

    .line 75
    :cond_2
    or-int/2addr v0, v7

    .line 76
    :cond_3
    and-int/lit16 v3, v0, 0x93

    .line 77
    .line 78
    if-eq v3, v6, :cond_4

    .line 79
    .line 80
    move v3, v11

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    move v3, v12

    .line 83
    :goto_1
    and-int/2addr v0, v11

    .line 84
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, La/glg0;

    .line 95
    .line 96
    const v1, 0x31b58cc6

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 100
    .line 101
    .line 102
    sget-object v1, La/jm40;->b:La/jm40;

    .line 103
    .line 104
    const/high16 v3, 0x3f800000    # 1.0f

    .line 105
    .line 106
    invoke-static {v1, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const/16 v3, 0x180

    .line 111
    .line 112
    invoke-static {v0, v4, v1, v2, v3}, La/fww;->k(La/glg0;Lkotlin/jvm/functions/Function2;La/mm40;La/fet;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    invoke-virtual {v2}, La/fet;->X()V

    .line 120
    .line 121
    .line 122
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_0
    move-object/from16 v0, p1

    .line 126
    .line 127
    check-cast v0, La/zdz;

    .line 128
    .line 129
    move-object/from16 v1, p2

    .line 130
    .line 131
    check-cast v1, Ljava/lang/Number;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    move-object/from16 v2, p3

    .line 138
    .line 139
    check-cast v2, La/fet;

    .line 140
    .line 141
    move-object/from16 v13, p4

    .line 142
    .line 143
    check-cast v13, Ljava/lang/Number;

    .line 144
    .line 145
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    and-int/lit8 v14, v13, 0x6

    .line 150
    .line 151
    if-nez v14, :cond_7

    .line 152
    .line 153
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_6

    .line 158
    .line 159
    move v9, v10

    .line 160
    :cond_6
    or-int v0, v13, v9

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_7
    move v0, v13

    .line 164
    :goto_3
    and-int/lit8 v9, v13, 0x30

    .line 165
    .line 166
    if-nez v9, :cond_9

    .line 167
    .line 168
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    if-eqz v9, :cond_8

    .line 173
    .line 174
    move v7, v8

    .line 175
    :cond_8
    or-int/2addr v0, v7

    .line 176
    :cond_9
    and-int/lit16 v7, v0, 0x93

    .line 177
    .line 178
    if-eq v7, v6, :cond_a

    .line 179
    .line 180
    move v6, v11

    .line 181
    goto :goto_4

    .line 182
    :cond_a
    move v6, v12

    .line 183
    :goto_4
    and-int/2addr v0, v11

    .line 184
    invoke-virtual {v2, v0, v6}, La/fet;->U(IZ)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_d

    .line 189
    .line 190
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, La/zx80;

    .line 195
    .line 196
    const v1, 0x1c4e4502

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    if-nez v1, :cond_b

    .line 211
    .line 212
    if-ne v5, v3, :cond_c

    .line 213
    .line 214
    :cond_b
    new-instance v5, La/caz;

    .line 215
    .line 216
    const/16 v1, 0xa

    .line 217
    .line 218
    invoke-direct {v5, v4, v1}, La/caz;-><init>(Ljava/lang/Object;B)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 225
    .line 226
    invoke-static {v0, v5, v2, v12}, La/bdx;->M(La/zx80;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_d
    invoke-virtual {v2}, La/fet;->X()V

    .line 234
    .line 235
    .line 236
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    return-object v0

    .line 239
    :pswitch_1
    move-object/from16 v0, p1

    .line 240
    .line 241
    check-cast v0, La/g9z;

    .line 242
    .line 243
    move-object/from16 v1, p2

    .line 244
    .line 245
    check-cast v1, Ljava/lang/Number;

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    move-object/from16 v2, p3

    .line 252
    .line 253
    check-cast v2, La/fet;

    .line 254
    .line 255
    move-object/from16 v13, p4

    .line 256
    .line 257
    check-cast v13, Ljava/lang/Number;

    .line 258
    .line 259
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v13

    .line 263
    and-int/lit8 v14, v13, 0x6

    .line 264
    .line 265
    if-nez v14, :cond_f

    .line 266
    .line 267
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eqz v0, :cond_e

    .line 272
    .line 273
    move v9, v10

    .line 274
    :cond_e
    or-int v0, v13, v9

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_f
    move v0, v13

    .line 278
    :goto_6
    and-int/lit8 v9, v13, 0x30

    .line 279
    .line 280
    if-nez v9, :cond_11

    .line 281
    .line 282
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    if-eqz v9, :cond_10

    .line 287
    .line 288
    move v7, v8

    .line 289
    :cond_10
    or-int/2addr v0, v7

    .line 290
    :cond_11
    and-int/lit16 v7, v0, 0x93

    .line 291
    .line 292
    if-eq v7, v6, :cond_12

    .line 293
    .line 294
    move v6, v11

    .line 295
    goto :goto_7

    .line 296
    :cond_12
    move v6, v12

    .line 297
    :goto_7
    and-int/2addr v0, v11

    .line 298
    invoke-virtual {v2, v0, v6}, La/fet;->U(IZ)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_15

    .line 303
    .line 304
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    move-object v14, v0

    .line 309
    check-cast v14, La/r370;

    .line 310
    .line 311
    const v0, -0x35725e93    # -4640950.5f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    invoke-virtual {v2, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    or-int/2addr v0, v1

    .line 326
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    if-nez v0, :cond_13

    .line 331
    .line 332
    if-ne v1, v3, :cond_14

    .line 333
    .line 334
    :cond_13
    new-instance v1, La/ygy;

    .line 335
    .line 336
    const/16 v0, 0x17

    .line 337
    .line 338
    invoke-direct {v1, v4, v14, v0}, La/ygy;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    :cond_14
    move-object v15, v1

    .line 345
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 346
    .line 347
    const/16 v18, 0x1

    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    const/16 v17, 0x0

    .line 351
    .line 352
    move-object/from16 v16, v2

    .line 353
    .line 354
    invoke-static/range {v13 .. v18}, La/epv0;->d(La/mm40;La/r370;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 355
    .line 356
    .line 357
    move-object/from16 v0, v16

    .line 358
    .line 359
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 360
    .line 361
    .line 362
    goto :goto_8

    .line 363
    :cond_15
    move-object v0, v2

    .line 364
    invoke-virtual {v0}, La/fet;->X()V

    .line 365
    .line 366
    .line 367
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 368
    .line 369
    return-object v0

    .line 370
    :pswitch_2
    move-object/from16 v1, p1

    .line 371
    .line 372
    check-cast v1, La/g9z;

    .line 373
    .line 374
    move-object/from16 v2, p2

    .line 375
    .line 376
    check-cast v2, Ljava/lang/Number;

    .line 377
    .line 378
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 379
    .line 380
    .line 381
    move-result v15

    .line 382
    move-object/from16 v2, p3

    .line 383
    .line 384
    check-cast v2, La/fet;

    .line 385
    .line 386
    move-object/from16 v3, p4

    .line 387
    .line 388
    check-cast v3, Ljava/lang/Number;

    .line 389
    .line 390
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    and-int/lit8 v4, v3, 0x6

    .line 395
    .line 396
    if-nez v4, :cond_17

    .line 397
    .line 398
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-eqz v1, :cond_16

    .line 403
    .line 404
    move v9, v10

    .line 405
    :cond_16
    or-int v1, v3, v9

    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_17
    move v1, v3

    .line 409
    :goto_9
    and-int/lit8 v3, v3, 0x30

    .line 410
    .line 411
    if-nez v3, :cond_19

    .line 412
    .line 413
    invoke-virtual {v2, v15}, La/fet;->e(I)Z

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    if-eqz v3, :cond_18

    .line 418
    .line 419
    move v7, v8

    .line 420
    :cond_18
    or-int/2addr v1, v7

    .line 421
    :cond_19
    and-int/lit16 v3, v1, 0x93

    .line 422
    .line 423
    if-eq v3, v6, :cond_1a

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_1a
    move v11, v12

    .line 427
    :goto_a
    and-int/lit8 v3, v1, 0x1

    .line 428
    .line 429
    invoke-virtual {v2, v3, v11}, La/fet;->U(IZ)Z

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    if-eqz v3, :cond_1b

    .line 434
    .line 435
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    and-int/lit8 v1, v1, 0x7e

    .line 440
    .line 441
    move-object v14, v3

    .line 442
    check-cast v14, La/vpl;

    .line 443
    .line 444
    const v3, 0x34372ac9

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 448
    .line 449
    .line 450
    shl-int/lit8 v1, v1, 0x3

    .line 451
    .line 452
    and-int/lit16 v1, v1, 0x380

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    iget-object v0, v0, La/o0i;->c:Lkotlin/jvm/functions/Function2;

    .line 456
    .line 457
    move-object/from16 v16, v0

    .line 458
    .line 459
    move/from16 v18, v1

    .line 460
    .line 461
    move-object/from16 v17, v2

    .line 462
    .line 463
    invoke-static/range {v13 .. v18}, La/ohq0;->x(La/mm40;La/vpl;ILkotlin/jvm/functions/Function2;La/fet;I)V

    .line 464
    .line 465
    .line 466
    move-object/from16 v0, v17

    .line 467
    .line 468
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 469
    .line 470
    .line 471
    goto :goto_b

    .line 472
    :cond_1b
    move-object v0, v2

    .line 473
    invoke-virtual {v0}, La/fet;->X()V

    .line 474
    .line 475
    .line 476
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    return-object v0

    .line 479
    :pswitch_3
    move-object/from16 v0, p1

    .line 480
    .line 481
    check-cast v0, La/g9z;

    .line 482
    .line 483
    move-object/from16 v1, p2

    .line 484
    .line 485
    check-cast v1, Ljava/lang/Number;

    .line 486
    .line 487
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    move-object/from16 v3, p3

    .line 492
    .line 493
    check-cast v3, La/fet;

    .line 494
    .line 495
    move-object/from16 v13, p4

    .line 496
    .line 497
    check-cast v13, Ljava/lang/Number;

    .line 498
    .line 499
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 500
    .line 501
    .line 502
    move-result v13

    .line 503
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    and-int/lit8 v14, v13, 0x6

    .line 507
    .line 508
    if-nez v14, :cond_1d

    .line 509
    .line 510
    invoke-virtual {v3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    if-eqz v0, :cond_1c

    .line 515
    .line 516
    move v9, v10

    .line 517
    :cond_1c
    or-int v0, v13, v9

    .line 518
    .line 519
    goto :goto_c

    .line 520
    :cond_1d
    move v0, v13

    .line 521
    :goto_c
    and-int/lit8 v9, v13, 0x30

    .line 522
    .line 523
    if-nez v9, :cond_1f

    .line 524
    .line 525
    invoke-virtual {v3, v1}, La/fet;->e(I)Z

    .line 526
    .line 527
    .line 528
    move-result v9

    .line 529
    if-eqz v9, :cond_1e

    .line 530
    .line 531
    move v7, v8

    .line 532
    :cond_1e
    or-int/2addr v0, v7

    .line 533
    :cond_1f
    and-int/lit16 v7, v0, 0x93

    .line 534
    .line 535
    if-eq v7, v6, :cond_20

    .line 536
    .line 537
    move v6, v11

    .line 538
    goto :goto_d

    .line 539
    :cond_20
    move v6, v12

    .line 540
    :goto_d
    and-int/2addr v0, v11

    .line 541
    invoke-virtual {v3, v0, v6}, La/fet;->U(IZ)Z

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    if-eqz v0, :cond_21

    .line 546
    .line 547
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    check-cast v0, La/vpl;

    .line 552
    .line 553
    const v1, 0x156e833

    .line 554
    .line 555
    .line 556
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 557
    .line 558
    .line 559
    invoke-static {v2, v0, v4, v3, v12}, La/fre0;->u(La/mm40;La/vpl;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v3, v12}, La/fet;->r(Z)V

    .line 563
    .line 564
    .line 565
    goto :goto_e

    .line 566
    :cond_21
    invoke-virtual {v3}, La/fet;->X()V

    .line 567
    .line 568
    .line 569
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 570
    .line 571
    return-object v0

    .line 572
    :pswitch_4
    move-object/from16 v0, p1

    .line 573
    .line 574
    check-cast v0, La/g9z;

    .line 575
    .line 576
    move-object/from16 v1, p2

    .line 577
    .line 578
    check-cast v1, Ljava/lang/Number;

    .line 579
    .line 580
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    move-object/from16 v3, p3

    .line 585
    .line 586
    check-cast v3, La/fet;

    .line 587
    .line 588
    move-object/from16 v13, p4

    .line 589
    .line 590
    check-cast v13, Ljava/lang/Number;

    .line 591
    .line 592
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 593
    .line 594
    .line 595
    move-result v13

    .line 596
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    and-int/lit8 v14, v13, 0x6

    .line 600
    .line 601
    if-nez v14, :cond_23

    .line 602
    .line 603
    invoke-virtual {v3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    if-eqz v0, :cond_22

    .line 608
    .line 609
    move v9, v10

    .line 610
    :cond_22
    or-int v0, v13, v9

    .line 611
    .line 612
    goto :goto_f

    .line 613
    :cond_23
    move v0, v13

    .line 614
    :goto_f
    and-int/lit8 v9, v13, 0x30

    .line 615
    .line 616
    if-nez v9, :cond_25

    .line 617
    .line 618
    invoke-virtual {v3, v1}, La/fet;->e(I)Z

    .line 619
    .line 620
    .line 621
    move-result v9

    .line 622
    if-eqz v9, :cond_24

    .line 623
    .line 624
    move v7, v8

    .line 625
    :cond_24
    or-int/2addr v0, v7

    .line 626
    :cond_25
    and-int/lit16 v7, v0, 0x93

    .line 627
    .line 628
    if-eq v7, v6, :cond_26

    .line 629
    .line 630
    move v6, v11

    .line 631
    goto :goto_10

    .line 632
    :cond_26
    move v6, v12

    .line 633
    :goto_10
    and-int/2addr v0, v11

    .line 634
    invoke-virtual {v3, v0, v6}, La/fet;->U(IZ)Z

    .line 635
    .line 636
    .line 637
    move-result v0

    .line 638
    if-eqz v0, :cond_27

    .line 639
    .line 640
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    check-cast v0, La/vpl;

    .line 645
    .line 646
    const v1, 0x52ae2025

    .line 647
    .line 648
    .line 649
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 650
    .line 651
    .line 652
    invoke-static {v2, v0, v4, v3, v12}, La/x4d0;->u(La/mm40;La/vpl;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v3, v12}, La/fet;->r(Z)V

    .line 656
    .line 657
    .line 658
    goto :goto_11

    .line 659
    :cond_27
    invoke-virtual {v3}, La/fet;->X()V

    .line 660
    .line 661
    .line 662
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 663
    .line 664
    return-object v0

    .line 665
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
