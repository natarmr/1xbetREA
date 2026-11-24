.class public final La/qn7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i4;


# direct methods
.method public synthetic constructor <init>(La/i4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qn7;->a:B

    iput-object p1, p0, La/qn7;->b:La/i4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qn7;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/qn7;->b:La/i4;

    .line 6
    .line 7
    const/16 v2, 0x92

    .line 8
    .line 9
    const/16 v3, 0x10

    .line 10
    .line 11
    const/16 v4, 0x20

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x4

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/g9z;

    .line 23
    .line 24
    move-object/from16 v9, p2

    .line 25
    .line 26
    check-cast v9, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    move-object/from16 v10, p3

    .line 33
    .line 34
    check-cast v10, La/fet;

    .line 35
    .line 36
    move-object/from16 v11, p4

    .line 37
    .line 38
    check-cast v11, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v11

    .line 44
    and-int/lit8 v12, v11, 0x6

    .line 45
    .line 46
    if-nez v12, :cond_1

    .line 47
    .line 48
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    move v5, v6

    .line 55
    :cond_0
    or-int v1, v11, v5

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move v1, v11

    .line 59
    :goto_0
    and-int/lit8 v5, v11, 0x30

    .line 60
    .line 61
    if-nez v5, :cond_3

    .line 62
    .line 63
    invoke-virtual {v10, v9}, La/fet;->e(I)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    move v3, v4

    .line 70
    :cond_2
    or-int/2addr v1, v3

    .line 71
    :cond_3
    and-int/lit16 v3, v1, 0x93

    .line 72
    .line 73
    if-eq v3, v2, :cond_4

    .line 74
    .line 75
    move v2, v8

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    move v2, v7

    .line 78
    :goto_1
    and-int/2addr v1, v8

    .line 79
    invoke-virtual {v10, v1, v2}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_8

    .line 84
    .line 85
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/lvw;

    .line 90
    .line 91
    const v1, -0x1290e06

    .line 92
    .line 93
    .line 94
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 95
    .line 96
    .line 97
    if-nez v0, :cond_5

    .line 98
    .line 99
    move-object v1, v10

    .line 100
    goto :goto_2

    .line 101
    :cond_5
    instance-of v1, v0, La/mgs0;

    .line 102
    .line 103
    sget-object v2, La/jm40;->b:La/jm40;

    .line 104
    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    const v0, -0x127ed95

    .line 108
    .line 109
    .line 110
    invoke-virtual {v10, v0}, La/fet;->e0(I)V

    .line 111
    .line 112
    .line 113
    new-instance v11, La/hjm;

    .line 114
    .line 115
    const v0, 0x7f131680

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v7, v10}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    new-instance v13, La/ojm;

    .line 123
    .line 124
    const/16 v0, 0x7f

    .line 125
    .line 126
    invoke-direct {v13, v0}, La/ojm;-><init>(I)V

    .line 127
    .line 128
    .line 129
    const/16 v23, 0x0

    .line 130
    .line 131
    const/16 v24, 0x1ffc

    .line 132
    .line 133
    const/4 v14, 0x0

    .line 134
    const/4 v15, 0x0

    .line 135
    const/16 v16, 0x0

    .line 136
    .line 137
    const/16 v17, 0x0

    .line 138
    .line 139
    const/16 v18, 0x0

    .line 140
    .line 141
    const/16 v19, 0x0

    .line 142
    .line 143
    const/16 v20, 0x0

    .line 144
    .line 145
    const/16 v21, 0x0

    .line 146
    .line 147
    const/16 v22, 0x0

    .line 148
    .line 149
    invoke-direct/range {v11 .. v24}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 150
    .line 151
    .line 152
    sget-object v12, La/kjm;->b:La/kjm;

    .line 153
    .line 154
    const/16 v17, 0x186

    .line 155
    .line 156
    const/16 v18, 0x38

    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    move-object/from16 v16, v10

    .line 160
    .line 161
    move-object v10, v2

    .line 162
    invoke-static/range {v10 .. v18}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 163
    .line 164
    .line 165
    move-object/from16 v1, v16

    .line 166
    .line 167
    invoke-virtual {v1, v7}, La/fet;->r(Z)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_6
    move-object v1, v10

    .line 172
    move-object v10, v2

    .line 173
    instance-of v2, v0, La/yfs0;

    .line 174
    .line 175
    if-eqz v2, :cond_7

    .line 176
    .line 177
    const v2, -0x11daa17

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 181
    .line 182
    .line 183
    const/high16 v2, 0x3f800000    # 1.0f

    .line 184
    .line 185
    invoke-static {v10, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    sget-object v2, La/qmk;->a:La/zcl;

    .line 190
    .line 191
    const/high16 v15, 0x40c00000    # 6.0f

    .line 192
    .line 193
    const/16 v16, 0x7

    .line 194
    .line 195
    const/4 v12, 0x0

    .line 196
    const/4 v13, 0x0

    .line 197
    const/4 v14, 0x0

    .line 198
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    check-cast v0, La/yfs0;

    .line 203
    .line 204
    invoke-static {v2, v0, v1, v7}, La/hhm0;->i(La/mm40;La/yfs0;La/fet;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v7}, La/fet;->r(Z)V

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_7
    :goto_2
    const v0, -0x1166e91

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v7}, La/fet;->r(Z)V

    .line 218
    .line 219
    .line 220
    :goto_3
    invoke-virtual {v1, v7}, La/fet;->r(Z)V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_8
    move-object v1, v10

    .line 225
    invoke-virtual {v1}, La/fet;->X()V

    .line 226
    .line 227
    .line 228
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object v0

    .line 231
    :pswitch_0
    move-object/from16 v1, p1

    .line 232
    .line 233
    check-cast v1, La/g9z;

    .line 234
    .line 235
    move-object/from16 v9, p2

    .line 236
    .line 237
    check-cast v9, Ljava/lang/Number;

    .line 238
    .line 239
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    move-object/from16 v10, p3

    .line 244
    .line 245
    check-cast v10, La/fet;

    .line 246
    .line 247
    move-object/from16 v11, p4

    .line 248
    .line 249
    check-cast v11, Ljava/lang/Number;

    .line 250
    .line 251
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    and-int/lit8 v12, v11, 0x6

    .line 256
    .line 257
    if-nez v12, :cond_a

    .line 258
    .line 259
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-eqz v1, :cond_9

    .line 264
    .line 265
    move v5, v6

    .line 266
    :cond_9
    or-int v1, v11, v5

    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_a
    move v1, v11

    .line 270
    :goto_5
    and-int/lit8 v5, v11, 0x30

    .line 271
    .line 272
    if-nez v5, :cond_c

    .line 273
    .line 274
    invoke-virtual {v10, v9}, La/fet;->e(I)Z

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    if-eqz v5, :cond_b

    .line 279
    .line 280
    move v3, v4

    .line 281
    :cond_b
    or-int/2addr v1, v3

    .line 282
    :cond_c
    and-int/lit16 v3, v1, 0x93

    .line 283
    .line 284
    if-eq v3, v2, :cond_d

    .line 285
    .line 286
    move v2, v8

    .line 287
    goto :goto_6

    .line 288
    :cond_d
    move v2, v7

    .line 289
    :goto_6
    and-int/2addr v1, v8

    .line 290
    invoke-virtual {v10, v1, v2}, La/fet;->U(IZ)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-eqz v1, :cond_e

    .line 295
    .line 296
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    check-cast v0, La/fj90;

    .line 301
    .line 302
    const v1, 0x73673e46

    .line 303
    .line 304
    .line 305
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 306
    .line 307
    .line 308
    sget-object v1, La/qmk;->a:La/zcl;

    .line 309
    .line 310
    const/high16 v15, 0x41000000    # 8.0f

    .line 311
    .line 312
    const/16 v16, 0x7

    .line 313
    .line 314
    sget-object v11, La/jm40;->b:La/jm40;

    .line 315
    .line 316
    const/4 v12, 0x0

    .line 317
    const/4 v13, 0x0

    .line 318
    const/4 v14, 0x0

    .line 319
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    new-instance v11, La/rqm;

    .line 324
    .line 325
    new-instance v12, La/rui0;

    .line 326
    .line 327
    iget-object v13, v0, La/fj90;->c:Ljava/lang/String;

    .line 328
    .line 329
    iget-object v15, v0, La/fj90;->b:Ljava/lang/String;

    .line 330
    .line 331
    const/16 v16, 0x0

    .line 332
    .line 333
    const/16 v17, 0x3a

    .line 334
    .line 335
    const/4 v14, 0x0

    .line 336
    invoke-direct/range {v12 .. v17}, La/rui0;-><init>(Ljava/lang/String;La/y3d;Ljava/lang/String;La/y3d;I)V

    .line 337
    .line 338
    .line 339
    new-instance v13, La/oui0;

    .line 340
    .line 341
    new-instance v2, La/m0x;

    .line 342
    .line 343
    iget v0, v0, La/fj90;->a:I

    .line 344
    .line 345
    const/4 v3, 0x0

    .line 346
    const/4 v4, 0x6

    .line 347
    invoke-direct {v2, v0, v3, v4}, La/m0x;-><init>(ILa/bzw;I)V

    .line 348
    .line 349
    .line 350
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 351
    .line 352
    invoke-virtual {v10, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 357
    .line 358
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 359
    .line 360
    .line 361
    move-result-wide v3

    .line 362
    new-instance v0, La/y3d;

    .line 363
    .line 364
    invoke-direct {v0, v3, v4}, La/y3d;-><init>(J)V

    .line 365
    .line 366
    .line 367
    const/16 v18, 0x13

    .line 368
    .line 369
    const/4 v15, 0x0

    .line 370
    move-object/from16 v17, v0

    .line 371
    .line 372
    move-object/from16 v16, v2

    .line 373
    .line 374
    invoke-direct/range {v13 .. v18}, La/oui0;-><init>(Ljava/lang/Integer;La/y3d;La/o0x;La/y3d;I)V

    .line 375
    .line 376
    .line 377
    const/16 v19, 0x0

    .line 378
    .line 379
    const/16 v20, 0x1fc

    .line 380
    .line 381
    const/16 v16, 0x0

    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    const/16 v18, 0x0

    .line 386
    .line 387
    invoke-direct/range {v11 .. v20}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 388
    .line 389
    .line 390
    const/16 v19, 0x0

    .line 391
    .line 392
    const/16 v20, 0xfc

    .line 393
    .line 394
    const/4 v12, 0x0

    .line 395
    const/4 v13, 0x0

    .line 396
    move-object/from16 v18, v10

    .line 397
    .line 398
    move-object v10, v1

    .line 399
    invoke-static/range {v10 .. v20}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 400
    .line 401
    .line 402
    move-object/from16 v0, v18

    .line 403
    .line 404
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 405
    .line 406
    .line 407
    goto :goto_7

    .line 408
    :cond_e
    move-object v0, v10

    .line 409
    invoke-virtual {v0}, La/fet;->X()V

    .line 410
    .line 411
    .line 412
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    return-object v0

    .line 415
    :pswitch_1
    move-object/from16 v1, p1

    .line 416
    .line 417
    check-cast v1, La/g9z;

    .line 418
    .line 419
    move-object/from16 v9, p2

    .line 420
    .line 421
    check-cast v9, Ljava/lang/Number;

    .line 422
    .line 423
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 424
    .line 425
    .line 426
    move-result v9

    .line 427
    move-object/from16 v10, p3

    .line 428
    .line 429
    check-cast v10, La/fet;

    .line 430
    .line 431
    move-object/from16 v11, p4

    .line 432
    .line 433
    check-cast v11, Ljava/lang/Number;

    .line 434
    .line 435
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 436
    .line 437
    .line 438
    move-result v11

    .line 439
    and-int/lit8 v12, v11, 0x6

    .line 440
    .line 441
    if-nez v12, :cond_10

    .line 442
    .line 443
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    if-eqz v1, :cond_f

    .line 448
    .line 449
    move v5, v6

    .line 450
    :cond_f
    or-int v1, v11, v5

    .line 451
    .line 452
    goto :goto_8

    .line 453
    :cond_10
    move v1, v11

    .line 454
    :goto_8
    and-int/lit8 v5, v11, 0x30

    .line 455
    .line 456
    if-nez v5, :cond_12

    .line 457
    .line 458
    invoke-virtual {v10, v9}, La/fet;->e(I)Z

    .line 459
    .line 460
    .line 461
    move-result v5

    .line 462
    if-eqz v5, :cond_11

    .line 463
    .line 464
    move v3, v4

    .line 465
    :cond_11
    or-int/2addr v1, v3

    .line 466
    :cond_12
    and-int/lit16 v3, v1, 0x93

    .line 467
    .line 468
    if-eq v3, v2, :cond_13

    .line 469
    .line 470
    move v2, v8

    .line 471
    goto :goto_9

    .line 472
    :cond_13
    move v2, v7

    .line 473
    :goto_9
    and-int/2addr v1, v8

    .line 474
    invoke-virtual {v10, v1, v2}, La/fet;->U(IZ)Z

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    if-eqz v1, :cond_16

    .line 479
    .line 480
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    check-cast v0, La/lgg0;

    .line 485
    .line 486
    const v1, -0x4cda8470

    .line 487
    .line 488
    .line 489
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 490
    .line 491
    .line 492
    if-eqz v0, :cond_15

    .line 493
    .line 494
    instance-of v1, v0, La/jgg0;

    .line 495
    .line 496
    if-eqz v1, :cond_14

    .line 497
    .line 498
    const v1, -0x7e5998ba

    .line 499
    .line 500
    .line 501
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 502
    .line 503
    .line 504
    check-cast v0, La/jgg0;

    .line 505
    .line 506
    invoke-static {v0, v10, v7}, La/x9x;->u(La/jgg0;La/fet;I)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v10, v7}, La/fet;->r(Z)V

    .line 510
    .line 511
    .line 512
    goto :goto_a

    .line 513
    :cond_14
    instance-of v0, v0, La/kgg0;

    .line 514
    .line 515
    if-eqz v0, :cond_15

    .line 516
    .line 517
    const v0, -0x7e598d06

    .line 518
    .line 519
    .line 520
    invoke-virtual {v10, v0}, La/fet;->e0(I)V

    .line 521
    .line 522
    .line 523
    invoke-static {v7, v10}, La/kcx;->p(ILa/fet;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v10, v7}, La/fet;->r(Z)V

    .line 527
    .line 528
    .line 529
    :goto_a
    invoke-virtual {v10, v7}, La/fet;->r(Z)V

    .line 530
    .line 531
    .line 532
    goto :goto_b

    .line 533
    :cond_15
    const v0, -0x7e59a12d

    .line 534
    .line 535
    .line 536
    invoke-static {v0, v10, v7}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    throw v0

    .line 541
    :cond_16
    invoke-virtual {v10}, La/fet;->X()V

    .line 542
    .line 543
    .line 544
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 545
    .line 546
    return-object v0

    .line 547
    :pswitch_2
    move-object/from16 v1, p1

    .line 548
    .line 549
    check-cast v1, La/g9z;

    .line 550
    .line 551
    move-object/from16 v9, p2

    .line 552
    .line 553
    check-cast v9, Ljava/lang/Number;

    .line 554
    .line 555
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 556
    .line 557
    .line 558
    move-result v9

    .line 559
    move-object/from16 v10, p3

    .line 560
    .line 561
    check-cast v10, La/fet;

    .line 562
    .line 563
    move-object/from16 v11, p4

    .line 564
    .line 565
    check-cast v11, Ljava/lang/Number;

    .line 566
    .line 567
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 568
    .line 569
    .line 570
    move-result v11

    .line 571
    and-int/lit8 v12, v11, 0x6

    .line 572
    .line 573
    if-nez v12, :cond_18

    .line 574
    .line 575
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    if-eqz v1, :cond_17

    .line 580
    .line 581
    move v5, v6

    .line 582
    :cond_17
    or-int v1, v11, v5

    .line 583
    .line 584
    goto :goto_c

    .line 585
    :cond_18
    move v1, v11

    .line 586
    :goto_c
    and-int/lit8 v5, v11, 0x30

    .line 587
    .line 588
    if-nez v5, :cond_1a

    .line 589
    .line 590
    invoke-virtual {v10, v9}, La/fet;->e(I)Z

    .line 591
    .line 592
    .line 593
    move-result v5

    .line 594
    if-eqz v5, :cond_19

    .line 595
    .line 596
    move v3, v4

    .line 597
    :cond_19
    or-int/2addr v1, v3

    .line 598
    :cond_1a
    and-int/lit16 v3, v1, 0x93

    .line 599
    .line 600
    if-eq v3, v2, :cond_1b

    .line 601
    .line 602
    move v2, v8

    .line 603
    goto :goto_d

    .line 604
    :cond_1b
    move v2, v7

    .line 605
    :goto_d
    and-int/2addr v1, v8

    .line 606
    invoke-virtual {v10, v1, v2}, La/fet;->U(IZ)Z

    .line 607
    .line 608
    .line 609
    move-result v1

    .line 610
    if-eqz v1, :cond_1c

    .line 611
    .line 612
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    check-cast v0, La/sls;

    .line 617
    .line 618
    const v1, -0x1e659062

    .line 619
    .line 620
    .line 621
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 622
    .line 623
    .line 624
    invoke-static {v0, v10, v7}, La/vic;->m(La/sls;La/fet;I)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v10, v7}, La/fet;->r(Z)V

    .line 628
    .line 629
    .line 630
    goto :goto_e

    .line 631
    :cond_1c
    invoke-virtual {v10}, La/fet;->X()V

    .line 632
    .line 633
    .line 634
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 635
    .line 636
    return-object v0

    .line 637
    :pswitch_3
    move-object/from16 v1, p1

    .line 638
    .line 639
    check-cast v1, La/g9z;

    .line 640
    .line 641
    move-object/from16 v9, p2

    .line 642
    .line 643
    check-cast v9, Ljava/lang/Number;

    .line 644
    .line 645
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 646
    .line 647
    .line 648
    move-result v9

    .line 649
    move-object/from16 v10, p3

    .line 650
    .line 651
    check-cast v10, La/fet;

    .line 652
    .line 653
    move-object/from16 v11, p4

    .line 654
    .line 655
    check-cast v11, Ljava/lang/Number;

    .line 656
    .line 657
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 658
    .line 659
    .line 660
    move-result v11

    .line 661
    and-int/lit8 v12, v11, 0x6

    .line 662
    .line 663
    if-nez v12, :cond_1e

    .line 664
    .line 665
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    if-eqz v1, :cond_1d

    .line 670
    .line 671
    move v5, v6

    .line 672
    :cond_1d
    or-int v1, v11, v5

    .line 673
    .line 674
    goto :goto_f

    .line 675
    :cond_1e
    move v1, v11

    .line 676
    :goto_f
    and-int/lit8 v5, v11, 0x30

    .line 677
    .line 678
    if-nez v5, :cond_20

    .line 679
    .line 680
    invoke-virtual {v10, v9}, La/fet;->e(I)Z

    .line 681
    .line 682
    .line 683
    move-result v5

    .line 684
    if-eqz v5, :cond_1f

    .line 685
    .line 686
    move v3, v4

    .line 687
    :cond_1f
    or-int/2addr v1, v3

    .line 688
    :cond_20
    and-int/lit16 v3, v1, 0x93

    .line 689
    .line 690
    if-eq v3, v2, :cond_21

    .line 691
    .line 692
    move v2, v8

    .line 693
    goto :goto_10

    .line 694
    :cond_21
    move v2, v7

    .line 695
    :goto_10
    and-int/2addr v1, v8

    .line 696
    invoke-virtual {v10, v1, v2}, La/fet;->U(IZ)Z

    .line 697
    .line 698
    .line 699
    move-result v1

    .line 700
    if-eqz v1, :cond_22

    .line 701
    .line 702
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    check-cast v0, La/fuy;

    .line 707
    .line 708
    const v1, -0x61e7217a

    .line 709
    .line 710
    .line 711
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 712
    .line 713
    .line 714
    invoke-static {v0, v10, v7}, La/i120;->K(La/fuy;La/fet;I)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v10, v7}, La/fet;->r(Z)V

    .line 718
    .line 719
    .line 720
    goto :goto_11

    .line 721
    :cond_22
    invoke-virtual {v10}, La/fet;->X()V

    .line 722
    .line 723
    .line 724
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 725
    .line 726
    return-object v0

    .line 727
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
