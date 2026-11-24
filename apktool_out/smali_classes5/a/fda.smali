.class public final La/fda;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fda;->a:B

    iput-object p1, p0, La/fda;->b:Ljava/util/ArrayList;

    iput-object p2, p0, La/fda;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fda;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41c00000    # 24.0f

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    sget-object v4, La/ukd;->a:La/cl5;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v6, v0, La/fda;->c:Lkotlin/jvm/functions/Function2;

    .line 13
    .line 14
    iget-object v7, v0, La/fda;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/16 v8, 0x92

    .line 17
    .line 18
    const/16 v9, 0x10

    .line 19
    .line 20
    const/16 v10, 0x20

    .line 21
    .line 22
    const/4 v11, 0x4

    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v13, 0x2

    .line 25
    const/4 v14, 0x1

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v0, p1

    .line 30
    .line 31
    check-cast v0, La/g9z;

    .line 32
    .line 33
    move-object/from16 v1, p2

    .line 34
    .line 35
    check-cast v1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    move-object/from16 v2, p3

    .line 42
    .line 43
    check-cast v2, La/fet;

    .line 44
    .line 45
    move-object/from16 v3, p4

    .line 46
    .line 47
    check-cast v3, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    and-int/lit8 v15, v3, 0x6

    .line 54
    .line 55
    if-nez v15, :cond_1

    .line 56
    .line 57
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v11, v13

    .line 65
    :goto_0
    or-int v0, v3, v11

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move v0, v3

    .line 69
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 70
    .line 71
    if-nez v3, :cond_3

    .line 72
    .line 73
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    move v9, v10

    .line 80
    :cond_2
    or-int/2addr v0, v9

    .line 81
    :cond_3
    and-int/lit16 v3, v0, 0x93

    .line 82
    .line 83
    if-eq v3, v8, :cond_4

    .line 84
    .line 85
    move v3, v14

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move v3, v12

    .line 88
    :goto_2
    and-int/2addr v0, v14

    .line 89
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_a

    .line 94
    .line 95
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/mzc0;

    .line 100
    .line 101
    const v1, 0x41209e8d

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-ne v1, v4, :cond_5

    .line 112
    .line 113
    invoke-static {v5}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_5
    check-cast v1, La/pz40;

    .line 121
    .line 122
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    if-ne v3, v4, :cond_6

    .line 127
    .line 128
    invoke-static {v2}, La/dw9;->j(La/fet;)La/gy40;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    :cond_6
    move-object/from16 v16, v3

    .line 133
    .line 134
    check-cast v16, La/gy40;

    .line 135
    .line 136
    invoke-virtual {v2, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    invoke-virtual {v2, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    or-int/2addr v3, v5

    .line 145
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    if-nez v3, :cond_7

    .line 150
    .line 151
    if-ne v5, v4, :cond_8

    .line 152
    .line 153
    :cond_7
    new-instance v5, La/qzc0;

    .line 154
    .line 155
    invoke-direct {v5, v6, v0, v1, v14}, La/qzc0;-><init>(Lkotlin/jvm/functions/Function2;La/mzc0;La/pz40;B)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_8
    move-object/from16 v20, v5

    .line 162
    .line 163
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 164
    .line 165
    const/16 v21, 0x1c

    .line 166
    .line 167
    sget-object v15, La/jm40;->b:La/jm40;

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    const/16 v18, 0x0

    .line 172
    .line 173
    const/16 v19, 0x0

    .line 174
    .line 175
    invoke-static/range {v15 .. v21}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 176
    .line 177
    .line 178
    move-result-object v15

    .line 179
    sget-object v3, La/j1t0;->e:La/zfn;

    .line 180
    .line 181
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, La/g1t0;

    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-static {}, La/g1t0;->j()La/y9q0;

    .line 191
    .line 192
    .line 193
    move-result-object v16

    .line 194
    sget-object v17, La/d4d;->z:La/d4d;

    .line 195
    .line 196
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    if-ne v3, v4, :cond_9

    .line 201
    .line 202
    new-instance v3, La/wta;

    .line 203
    .line 204
    invoke-direct {v3, v1, v13}, La/wta;-><init>(La/pz40;B)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    :cond_9
    move-object/from16 v19, v3

    .line 211
    .line 212
    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 213
    .line 214
    const/16 v21, 0x6180

    .line 215
    .line 216
    move-object/from16 v18, v0

    .line 217
    .line 218
    move-object/from16 v20, v2

    .line 219
    .line 220
    invoke-static/range {v15 .. v21}, La/n7x;->h(La/mm40;La/y9q0;La/d4d;La/mzc0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 221
    .line 222
    .line 223
    move-object/from16 v0, v20

    .line 224
    .line 225
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_a
    move-object v0, v2

    .line 230
    invoke-virtual {v0}, La/fet;->X()V

    .line 231
    .line 232
    .line 233
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object v0

    .line 236
    :pswitch_0
    move-object/from16 v0, p1

    .line 237
    .line 238
    check-cast v0, La/g9z;

    .line 239
    .line 240
    move-object/from16 v1, p2

    .line 241
    .line 242
    check-cast v1, Ljava/lang/Number;

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    move-object/from16 v2, p3

    .line 249
    .line 250
    check-cast v2, La/fet;

    .line 251
    .line 252
    move-object/from16 v3, p4

    .line 253
    .line 254
    check-cast v3, Ljava/lang/Number;

    .line 255
    .line 256
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    and-int/lit8 v15, v3, 0x6

    .line 261
    .line 262
    if-nez v15, :cond_c

    .line 263
    .line 264
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-eqz v0, :cond_b

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_b
    move v11, v13

    .line 272
    :goto_4
    or-int v0, v3, v11

    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_c
    move v0, v3

    .line 276
    :goto_5
    and-int/lit8 v3, v3, 0x30

    .line 277
    .line 278
    if-nez v3, :cond_e

    .line 279
    .line 280
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-eqz v3, :cond_d

    .line 285
    .line 286
    move v9, v10

    .line 287
    :cond_d
    or-int/2addr v0, v9

    .line 288
    :cond_e
    and-int/lit16 v3, v0, 0x93

    .line 289
    .line 290
    if-eq v3, v8, :cond_f

    .line 291
    .line 292
    move v3, v14

    .line 293
    goto :goto_6

    .line 294
    :cond_f
    move v3, v12

    .line 295
    :goto_6
    and-int/lit8 v8, v0, 0x1

    .line 296
    .line 297
    invoke-virtual {v2, v8, v3}, La/fet;->U(IZ)Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-eqz v3, :cond_15

    .line 302
    .line 303
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    check-cast v3, La/ah7;

    .line 308
    .line 309
    const v7, -0x33f68f42    # -3.6029176E7f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v7}, La/fet;->e0(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    and-int/lit8 v8, v0, 0x70

    .line 320
    .line 321
    xor-int/lit8 v8, v8, 0x30

    .line 322
    .line 323
    if-le v8, v10, :cond_10

    .line 324
    .line 325
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    if-nez v8, :cond_12

    .line 330
    .line 331
    :cond_10
    and-int/lit8 v0, v0, 0x30

    .line 332
    .line 333
    if-ne v0, v10, :cond_11

    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_11
    move v14, v12

    .line 337
    :cond_12
    :goto_7
    or-int v0, v7, v14

    .line 338
    .line 339
    invoke-virtual {v2, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    or-int/2addr v0, v7

    .line 344
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v7

    .line 348
    if-nez v0, :cond_13

    .line 349
    .line 350
    if-ne v7, v4, :cond_14

    .line 351
    .line 352
    :cond_13
    new-instance v7, La/i5;

    .line 353
    .line 354
    invoke-direct {v7, v6, v1, v3}, La/i5;-><init>(Lkotlin/jvm/functions/Function2;ILa/ah7;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    :cond_14
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 361
    .line 362
    invoke-static {v5, v3, v7, v2, v12}, La/sac;->t(La/mm40;La/ah7;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 366
    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_15
    invoke-virtual {v2}, La/fet;->X()V

    .line 370
    .line 371
    .line 372
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 373
    .line 374
    return-object v0

    .line 375
    :pswitch_1
    move-object/from16 v1, p1

    .line 376
    .line 377
    check-cast v1, La/g9z;

    .line 378
    .line 379
    move-object/from16 v4, p2

    .line 380
    .line 381
    check-cast v4, Ljava/lang/Number;

    .line 382
    .line 383
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 384
    .line 385
    .line 386
    move-result v4

    .line 387
    move-object/from16 v5, p3

    .line 388
    .line 389
    check-cast v5, La/fet;

    .line 390
    .line 391
    move-object/from16 v6, p4

    .line 392
    .line 393
    check-cast v6, Ljava/lang/Number;

    .line 394
    .line 395
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 396
    .line 397
    .line 398
    move-result v6

    .line 399
    and-int/lit8 v15, v6, 0x6

    .line 400
    .line 401
    if-nez v15, :cond_17

    .line 402
    .line 403
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    if-eqz v1, :cond_16

    .line 408
    .line 409
    goto :goto_9

    .line 410
    :cond_16
    move v11, v13

    .line 411
    :goto_9
    or-int v1, v6, v11

    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_17
    move v1, v6

    .line 415
    :goto_a
    and-int/lit8 v6, v6, 0x30

    .line 416
    .line 417
    if-nez v6, :cond_19

    .line 418
    .line 419
    invoke-virtual {v5, v4}, La/fet;->e(I)Z

    .line 420
    .line 421
    .line 422
    move-result v6

    .line 423
    if-eqz v6, :cond_18

    .line 424
    .line 425
    move v9, v10

    .line 426
    :cond_18
    or-int/2addr v1, v9

    .line 427
    :cond_19
    and-int/lit16 v6, v1, 0x93

    .line 428
    .line 429
    if-eq v6, v8, :cond_1a

    .line 430
    .line 431
    move v6, v14

    .line 432
    goto :goto_b

    .line 433
    :cond_1a
    move v6, v12

    .line 434
    :goto_b
    and-int/2addr v1, v14

    .line 435
    invoke-virtual {v5, v1, v6}, La/fet;->U(IZ)Z

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    if-eqz v1, :cond_1b

    .line 440
    .line 441
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    move-object/from16 v16, v1

    .line 446
    .line 447
    check-cast v16, La/mdp0;

    .line 448
    .line 449
    const v1, -0x5a88a504

    .line 450
    .line 451
    .line 452
    invoke-virtual {v5, v1}, La/fet;->e0(I)V

    .line 453
    .line 454
    .line 455
    sget-object v1, La/qmk;->a:La/zcl;

    .line 456
    .line 457
    invoke-static {v3, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 458
    .line 459
    .line 460
    move-result-object v15

    .line 461
    const/16 v19, 0x0

    .line 462
    .line 463
    const/16 v20, 0x0

    .line 464
    .line 465
    iget-object v0, v0, La/fda;->c:Lkotlin/jvm/functions/Function2;

    .line 466
    .line 467
    move-object/from16 v17, v0

    .line 468
    .line 469
    move-object/from16 v18, v5

    .line 470
    .line 471
    invoke-static/range {v15 .. v20}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 472
    .line 473
    .line 474
    move-object/from16 v0, v18

    .line 475
    .line 476
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 477
    .line 478
    .line 479
    goto :goto_c

    .line 480
    :cond_1b
    move-object v0, v5

    .line 481
    invoke-virtual {v0}, La/fet;->X()V

    .line 482
    .line 483
    .line 484
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    return-object v0

    .line 487
    :pswitch_2
    move-object/from16 v1, p1

    .line 488
    .line 489
    check-cast v1, La/g9z;

    .line 490
    .line 491
    move-object/from16 v4, p2

    .line 492
    .line 493
    check-cast v4, Ljava/lang/Number;

    .line 494
    .line 495
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    move-object/from16 v5, p3

    .line 500
    .line 501
    check-cast v5, La/fet;

    .line 502
    .line 503
    move-object/from16 v6, p4

    .line 504
    .line 505
    check-cast v6, Ljava/lang/Number;

    .line 506
    .line 507
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 508
    .line 509
    .line 510
    move-result v6

    .line 511
    and-int/lit8 v15, v6, 0x6

    .line 512
    .line 513
    if-nez v15, :cond_1d

    .line 514
    .line 515
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    if-eqz v1, :cond_1c

    .line 520
    .line 521
    goto :goto_d

    .line 522
    :cond_1c
    move v11, v13

    .line 523
    :goto_d
    or-int v1, v6, v11

    .line 524
    .line 525
    goto :goto_e

    .line 526
    :cond_1d
    move v1, v6

    .line 527
    :goto_e
    and-int/lit8 v6, v6, 0x30

    .line 528
    .line 529
    if-nez v6, :cond_1f

    .line 530
    .line 531
    invoke-virtual {v5, v4}, La/fet;->e(I)Z

    .line 532
    .line 533
    .line 534
    move-result v6

    .line 535
    if-eqz v6, :cond_1e

    .line 536
    .line 537
    move v9, v10

    .line 538
    :cond_1e
    or-int/2addr v1, v9

    .line 539
    :cond_1f
    and-int/lit16 v6, v1, 0x93

    .line 540
    .line 541
    if-eq v6, v8, :cond_20

    .line 542
    .line 543
    move v6, v14

    .line 544
    goto :goto_f

    .line 545
    :cond_20
    move v6, v12

    .line 546
    :goto_f
    and-int/2addr v1, v14

    .line 547
    invoke-virtual {v5, v1, v6}, La/fet;->U(IZ)Z

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    if-eqz v1, :cond_21

    .line 552
    .line 553
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    move-object/from16 v16, v1

    .line 558
    .line 559
    check-cast v16, La/mdp0;

    .line 560
    .line 561
    const v1, 0x75ee3f05

    .line 562
    .line 563
    .line 564
    invoke-virtual {v5, v1}, La/fet;->e0(I)V

    .line 565
    .line 566
    .line 567
    sget-object v1, La/qmk;->a:La/zcl;

    .line 568
    .line 569
    invoke-static {v3, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 570
    .line 571
    .line 572
    move-result-object v15

    .line 573
    const/16 v19, 0x0

    .line 574
    .line 575
    const/16 v20, 0x0

    .line 576
    .line 577
    iget-object v0, v0, La/fda;->c:Lkotlin/jvm/functions/Function2;

    .line 578
    .line 579
    move-object/from16 v17, v0

    .line 580
    .line 581
    move-object/from16 v18, v5

    .line 582
    .line 583
    invoke-static/range {v15 .. v20}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 584
    .line 585
    .line 586
    move-object/from16 v0, v18

    .line 587
    .line 588
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 589
    .line 590
    .line 591
    goto :goto_10

    .line 592
    :cond_21
    move-object v0, v5

    .line 593
    invoke-virtual {v0}, La/fet;->X()V

    .line 594
    .line 595
    .line 596
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 597
    .line 598
    return-object v0

    .line 599
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
