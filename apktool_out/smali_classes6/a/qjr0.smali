.class public final synthetic La/qjr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qjr0;->a:B

    iput-object p1, p0, La/qjr0;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qjr0;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/high16 v3, 0x42200000    # 40.0f

    .line 8
    .line 9
    const/high16 v4, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/16 v5, 0x12

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x0

    .line 16
    sget-object v9, La/jm40;->b:La/jm40;

    .line 17
    .line 18
    const/4 v10, 0x6

    .line 19
    const/16 v11, 0x10

    .line 20
    .line 21
    iget-object v12, v0, La/qjr0;->b:La/l7m0;

    .line 22
    .line 23
    const/4 v13, 0x0

    .line 24
    const/4 v14, 0x1

    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, La/yhg0;

    .line 31
    .line 32
    move-object/from16 v7, p2

    .line 33
    .line 34
    check-cast v7, La/fet;

    .line 35
    .line 36
    move-object/from16 v2, p3

    .line 37
    .line 38
    check-cast v2, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    and-int/lit8 v1, v2, 0x11

    .line 48
    .line 49
    if-eq v1, v11, :cond_0

    .line 50
    .line 51
    move v13, v14

    .line 52
    :cond_0
    and-int/lit8 v1, v2, 0x1

    .line 53
    .line 54
    invoke-virtual {v7, v1, v13}, La/fet;->U(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    sget-object v1, La/qmk;->a:La/zcl;

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    const/16 v13, 0xb

    .line 64
    .line 65
    sget-object v8, La/jm40;->b:La/jm40;

    .line 66
    .line 67
    const/4 v9, 0x0

    .line 68
    const/4 v10, 0x0

    .line 69
    const/high16 v11, 0x41400000    # 12.0f

    .line 70
    .line 71
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v1, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 80
    .line 81
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 86
    .line 87
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 88
    .line 89
    .line 90
    move-result-wide v2

    .line 91
    sget-object v4, La/qmk;->g:La/zcl;

    .line 92
    .line 93
    sget-object v5, La/vgg0;->a:La/ugg0;

    .line 94
    .line 95
    new-instance v5, La/ugg0;

    .line 96
    .line 97
    invoke-direct {v5, v4, v4, v4, v4}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v2, v3, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const/high16 v2, 0x40000000    # 2.0f

    .line 105
    .line 106
    invoke-static {v1, v2}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v9, 0x4

    .line 112
    iget-object v5, v0, La/qjr0;->b:La/l7m0;

    .line 113
    .line 114
    const/4 v6, 0x0

    .line 115
    invoke-static/range {v4 .. v9}, La/x1x;->s(La/mm40;La/l7m0;La/xdr;La/fet;II)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    invoke-virtual {v7}, La/fet;->X()V

    .line 120
    .line 121
    .line 122
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_0
    move-object/from16 v0, p1

    .line 126
    .line 127
    check-cast v0, La/yhg0;

    .line 128
    .line 129
    move-object/from16 v1, p2

    .line 130
    .line 131
    check-cast v1, La/fet;

    .line 132
    .line 133
    move-object/from16 v3, p3

    .line 134
    .line 135
    check-cast v3, Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    and-int/lit8 v0, v3, 0x11

    .line 145
    .line 146
    if-eq v0, v11, :cond_2

    .line 147
    .line 148
    move v0, v14

    .line 149
    goto :goto_1

    .line 150
    :cond_2
    move v0, v13

    .line 151
    :goto_1
    and-int/2addr v3, v14

    .line 152
    invoke-virtual {v1, v3, v0}, La/fet;->U(IZ)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_3

    .line 157
    .line 158
    const v0, 0x7f08096d

    .line 159
    .line 160
    .line 161
    invoke-static {v0, v13, v1}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 166
    .line 167
    invoke-virtual {v1, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 172
    .line 173
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary40-0d7_KjU()J

    .line 174
    .line 175
    .line 176
    move-result-wide v3

    .line 177
    new-instance v5, La/m78;

    .line 178
    .line 179
    const/4 v6, 0x5

    .line 180
    invoke-direct {v5, v3, v4, v6}, La/m78;-><init>(JI)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0, v5, v8, v2}, La/ju70;->T(La/pm80;La/m78;Lkotlin/jvm/functions/Function2;I)La/oil;

    .line 184
    .line 185
    .line 186
    move-result-object v18

    .line 187
    sget-object v0, La/qmk;->a:La/zcl;

    .line 188
    .line 189
    const/high16 v0, 0x42100000    # 36.0f

    .line 190
    .line 191
    invoke-static {v9, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 192
    .line 193
    .line 194
    move-result-object v17

    .line 195
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    move-object v15, v0

    .line 200
    check-cast v15, Ljava/lang/String;

    .line 201
    .line 202
    const/16 v29, 0x0

    .line 203
    .line 204
    const/16 v30, 0x7fc0

    .line 205
    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    const/16 v21, 0x0

    .line 209
    .line 210
    const/16 v22, 0x0

    .line 211
    .line 212
    const/16 v23, 0x0

    .line 213
    .line 214
    const/16 v24, 0x0

    .line 215
    .line 216
    const/16 v25, 0x0

    .line 217
    .line 218
    const/16 v26, 0x0

    .line 219
    .line 220
    const v28, 0x49030

    .line 221
    .line 222
    .line 223
    move-object/from16 v19, v18

    .line 224
    .line 225
    move-object/from16 v20, v18

    .line 226
    .line 227
    move-object/from16 v27, v1

    .line 228
    .line 229
    invoke-static/range {v15 .. v30}, La/k7x;->b(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/pm80;La/pm80;La/pm80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;La/fet;III)V

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_3
    move-object/from16 v27, v1

    .line 234
    .line 235
    invoke-virtual/range {v27 .. v27}, La/fet;->X()V

    .line 236
    .line 237
    .line 238
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_1
    move-object/from16 v0, p1

    .line 242
    .line 243
    check-cast v0, La/yhg0;

    .line 244
    .line 245
    move-object/from16 v1, p2

    .line 246
    .line 247
    check-cast v1, La/fet;

    .line 248
    .line 249
    move-object/from16 v3, p3

    .line 250
    .line 251
    check-cast v3, Ljava/lang/Integer;

    .line 252
    .line 253
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    and-int/lit8 v0, v3, 0x11

    .line 261
    .line 262
    if-eq v0, v11, :cond_4

    .line 263
    .line 264
    move v0, v14

    .line 265
    goto :goto_3

    .line 266
    :cond_4
    move v0, v13

    .line 267
    :goto_3
    and-int/2addr v3, v14

    .line 268
    invoke-virtual {v1, v3, v0}, La/fet;->U(IZ)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_7

    .line 273
    .line 274
    const v0, -0x49dbba19

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 278
    .line 279
    .line 280
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    check-cast v0, Ljava/lang/Iterable;

    .line 285
    .line 286
    new-instance v3, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    move v2, v13

    .line 300
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    if-eqz v4, :cond_6

    .line 305
    .line 306
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    add-int/lit8 v5, v2, 0x1

    .line 311
    .line 312
    if-ltz v2, :cond_5

    .line 313
    .line 314
    check-cast v4, La/v6n;

    .line 315
    .line 316
    new-instance v6, La/n2m;

    .line 317
    .line 318
    invoke-direct {v6, v2, v4}, La/n2m;-><init>(ILa/v6n;)V

    .line 319
    .line 320
    .line 321
    const v2, -0x323b0993

    .line 322
    .line 323
    .line 324
    invoke-static {v2, v6, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move v2, v5

    .line 332
    goto :goto_4

    .line 333
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 334
    .line 335
    .line 336
    throw v8

    .line 337
    :cond_6
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 338
    .line 339
    .line 340
    invoke-static {v9, v3, v1, v10}, La/uva;->a(La/mm40;Ljava/util/ArrayList;La/fet;I)V

    .line 341
    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_7
    invoke-virtual {v1}, La/fet;->X()V

    .line 345
    .line 346
    .line 347
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 348
    .line 349
    return-object v0

    .line 350
    :pswitch_2
    move-object/from16 v0, p1

    .line 351
    .line 352
    check-cast v0, La/yhg0;

    .line 353
    .line 354
    move-object/from16 v1, p2

    .line 355
    .line 356
    check-cast v1, La/fet;

    .line 357
    .line 358
    move-object/from16 v2, p3

    .line 359
    .line 360
    check-cast v2, Ljava/lang/Integer;

    .line 361
    .line 362
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    and-int/lit8 v3, v2, 0x6

    .line 370
    .line 371
    if-nez v3, :cond_9

    .line 372
    .line 373
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    if-eqz v3, :cond_8

    .line 378
    .line 379
    move v6, v7

    .line 380
    :cond_8
    or-int/2addr v2, v6

    .line 381
    :cond_9
    and-int/lit8 v3, v2, 0x13

    .line 382
    .line 383
    if-eq v3, v5, :cond_a

    .line 384
    .line 385
    move v13, v14

    .line 386
    :cond_a
    and-int/2addr v2, v14

    .line 387
    invoke-virtual {v1, v2, v13}, La/fet;->U(IZ)Z

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    if-eqz v2, :cond_b

    .line 392
    .line 393
    sget-object v2, La/qmk;->a:La/zcl;

    .line 394
    .line 395
    const/4 v9, 0x0

    .line 396
    const/16 v10, 0xa

    .line 397
    .line 398
    sget-object v5, La/jm40;->b:La/jm40;

    .line 399
    .line 400
    const/high16 v6, 0x41400000    # 12.0f

    .line 401
    .line 402
    const/4 v7, 0x0

    .line 403
    const/high16 v8, 0x41400000    # 12.0f

    .line 404
    .line 405
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-interface {v0, v4, v2, v14}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 410
    .line 411
    .line 412
    move-result-object v16

    .line 413
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    move-object v15, v0

    .line 418
    check-cast v15, Ljava/lang/String;

    .line 419
    .line 420
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 421
    .line 422
    sget-object v23, La/j1t0;->b:La/qrq;

    .line 423
    .line 424
    sget-wide v20, La/qmk;->r:J

    .line 425
    .line 426
    sget-wide v29, La/qmk;->F:J

    .line 427
    .line 428
    new-instance v17, La/y9q0;

    .line 429
    .line 430
    const/16 v28, 0x0

    .line 431
    .line 432
    const v31, 0xfdffdd

    .line 433
    .line 434
    .line 435
    const-wide/16 v18, 0x0

    .line 436
    .line 437
    const/16 v22, 0x0

    .line 438
    .line 439
    const-wide/16 v24, 0x0

    .line 440
    .line 441
    const/16 v26, 0x0

    .line 442
    .line 443
    const/16 v27, 0x0

    .line 444
    .line 445
    invoke-direct/range {v17 .. v31}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 446
    .line 447
    .line 448
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 453
    .line 454
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 455
    .line 456
    .line 457
    move-result-wide v2

    .line 458
    const/16 v38, 0x6180

    .line 459
    .line 460
    const v39, 0x1aff8

    .line 461
    .line 462
    .line 463
    const/16 v19, 0x0

    .line 464
    .line 465
    const-wide/16 v20, 0x0

    .line 466
    .line 467
    const/16 v23, 0x0

    .line 468
    .line 469
    const/16 v24, 0x0

    .line 470
    .line 471
    const-wide/16 v25, 0x0

    .line 472
    .line 473
    const/16 v27, 0x0

    .line 474
    .line 475
    const-wide/16 v28, 0x0

    .line 476
    .line 477
    const/16 v30, 0x2

    .line 478
    .line 479
    const/16 v31, 0x0

    .line 480
    .line 481
    const/16 v32, 0x1

    .line 482
    .line 483
    const/16 v33, 0x0

    .line 484
    .line 485
    const/16 v34, 0x0

    .line 486
    .line 487
    const/16 v37, 0x0

    .line 488
    .line 489
    move-object/from16 v36, v1

    .line 490
    .line 491
    move-object/from16 v35, v17

    .line 492
    .line 493
    move-wide/from16 v17, v2

    .line 494
    .line 495
    invoke-static/range {v15 .. v39}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 496
    .line 497
    .line 498
    goto :goto_6

    .line 499
    :cond_b
    move-object/from16 v36, v1

    .line 500
    .line 501
    invoke-virtual/range {v36 .. v36}, La/fet;->X()V

    .line 502
    .line 503
    .line 504
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 505
    .line 506
    return-object v0

    .line 507
    :pswitch_3
    move-object/from16 v0, p1

    .line 508
    .line 509
    check-cast v0, La/y5d;

    .line 510
    .line 511
    move-object/from16 v1, p2

    .line 512
    .line 513
    check-cast v1, La/fet;

    .line 514
    .line 515
    move-object/from16 v2, p3

    .line 516
    .line 517
    check-cast v2, Ljava/lang/Integer;

    .line 518
    .line 519
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    sget-object v3, La/ywu0;->s2:La/sxs0;

    .line 524
    .line 525
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    and-int/lit8 v0, v2, 0x11

    .line 529
    .line 530
    if-eq v0, v11, :cond_c

    .line 531
    .line 532
    move v0, v14

    .line 533
    goto :goto_7

    .line 534
    :cond_c
    move v0, v13

    .line 535
    :goto_7
    and-int/2addr v2, v14

    .line 536
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    if-eqz v0, :cond_d

    .line 541
    .line 542
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    check-cast v0, La/vxu0;

    .line 547
    .line 548
    iget-object v0, v0, La/vxu0;->a:Ljava/lang/String;

    .line 549
    .line 550
    invoke-static {v13, v1, v8, v0}, La/ipm0;->b(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    goto :goto_8

    .line 554
    :cond_d
    invoke-virtual {v1}, La/fet;->X()V

    .line 555
    .line 556
    .line 557
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 558
    .line 559
    return-object v0

    .line 560
    :pswitch_4
    move-object/from16 v0, p1

    .line 561
    .line 562
    check-cast v0, La/y5d;

    .line 563
    .line 564
    move-object/from16 v1, p2

    .line 565
    .line 566
    check-cast v1, La/fet;

    .line 567
    .line 568
    move-object/from16 v2, p3

    .line 569
    .line 570
    check-cast v2, Ljava/lang/Integer;

    .line 571
    .line 572
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 573
    .line 574
    .line 575
    move-result v2

    .line 576
    sget-object v3, La/pwu0;->q2:La/svs0;

    .line 577
    .line 578
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    and-int/lit8 v0, v2, 0x11

    .line 582
    .line 583
    if-eq v0, v11, :cond_e

    .line 584
    .line 585
    move v0, v14

    .line 586
    goto :goto_9

    .line 587
    :cond_e
    move v0, v13

    .line 588
    :goto_9
    and-int/2addr v2, v14

    .line 589
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-eqz v0, :cond_f

    .line 594
    .line 595
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    check-cast v0, La/twu0;

    .line 600
    .line 601
    iget-object v0, v0, La/twu0;->a:Ljava/lang/String;

    .line 602
    .line 603
    invoke-static {v13, v1, v8, v0}, La/xnm0;->f(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    goto :goto_a

    .line 607
    :cond_f
    invoke-virtual {v1}, La/fet;->X()V

    .line 608
    .line 609
    .line 610
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 611
    .line 612
    return-object v0

    .line 613
    :pswitch_5
    move-object/from16 v0, p1

    .line 614
    .line 615
    check-cast v0, La/yhg0;

    .line 616
    .line 617
    move-object/from16 v1, p2

    .line 618
    .line 619
    check-cast v1, La/fet;

    .line 620
    .line 621
    move-object/from16 v2, p3

    .line 622
    .line 623
    check-cast v2, Ljava/lang/Integer;

    .line 624
    .line 625
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    and-int/lit8 v0, v2, 0x11

    .line 633
    .line 634
    if-eq v0, v11, :cond_10

    .line 635
    .line 636
    move v0, v14

    .line 637
    goto :goto_b

    .line 638
    :cond_10
    move v0, v13

    .line 639
    :goto_b
    and-int/2addr v2, v14

    .line 640
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    if-eqz v0, :cond_12

    .line 645
    .line 646
    sget-object v0, La/qmk;->a:La/zcl;

    .line 647
    .line 648
    invoke-static {v9, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 653
    .line 654
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 659
    .line 660
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 661
    .line 662
    .line 663
    move-result-wide v2

    .line 664
    sget-object v4, La/qmk;->g:La/zcl;

    .line 665
    .line 666
    sget-object v5, La/vgg0;->a:La/ugg0;

    .line 667
    .line 668
    new-instance v5, La/ugg0;

    .line 669
    .line 670
    invoke-direct {v5, v4, v4, v4, v4}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 671
    .line 672
    .line 673
    invoke-static {v0, v2, v3, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    sget-object v2, La/gqw0;->e:La/zx7;

    .line 678
    .line 679
    invoke-static {v2, v13}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    iget-wide v3, v1, La/fet;->T:J

    .line 684
    .line 685
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 686
    .line 687
    .line 688
    move-result v3

    .line 689
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 690
    .line 691
    .line 692
    move-result-object v4

    .line 693
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 698
    .line 699
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v1}, La/fet;->i0()V

    .line 703
    .line 704
    .line 705
    iget-boolean v5, v1, La/fet;->S:Z

    .line 706
    .line 707
    if-eqz v5, :cond_11

    .line 708
    .line 709
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 710
    .line 711
    invoke-virtual {v1, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 712
    .line 713
    .line 714
    goto :goto_c

    .line 715
    :cond_11
    invoke-virtual {v1}, La/fet;->r0()V

    .line 716
    .line 717
    .line 718
    :goto_c
    sget-object v5, La/gqw0;->x:La/shd;

    .line 719
    .line 720
    invoke-static {v1, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 721
    .line 722
    .line 723
    sget-object v2, La/gqw0;->w:La/shd;

    .line 724
    .line 725
    invoke-static {v1, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 726
    .line 727
    .line 728
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 729
    .line 730
    .line 731
    move-result-object v2

    .line 732
    sget-object v3, La/gqw0;->y:La/shd;

    .line 733
    .line 734
    invoke-static {v1, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 735
    .line 736
    .line 737
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 738
    .line 739
    .line 740
    sget-object v2, La/gqw0;->v:La/shd;

    .line 741
    .line 742
    invoke-static {v1, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 743
    .line 744
    .line 745
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    check-cast v0, Ljava/lang/Number;

    .line 750
    .line 751
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    invoke-static {v0, v10, v1}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 756
    .line 757
    .line 758
    move-result-object v15

    .line 759
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 764
    .line 765
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 766
    .line 767
    .line 768
    move-result-wide v18

    .line 769
    const/16 v21, 0x30

    .line 770
    .line 771
    const/16 v22, 0x4

    .line 772
    .line 773
    const/16 v16, 0x0

    .line 774
    .line 775
    const/16 v17, 0x0

    .line 776
    .line 777
    move-object/from16 v20, v1

    .line 778
    .line 779
    invoke-static/range {v15 .. v22}, La/dww;->b(La/r2x;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 780
    .line 781
    .line 782
    move-object/from16 v0, v20

    .line 783
    .line 784
    invoke-virtual {v0, v14}, La/fet;->r(Z)V

    .line 785
    .line 786
    .line 787
    goto :goto_d

    .line 788
    :cond_12
    move-object v0, v1

    .line 789
    invoke-virtual {v0}, La/fet;->X()V

    .line 790
    .line 791
    .line 792
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 793
    .line 794
    return-object v0

    .line 795
    :pswitch_6
    move-object/from16 v0, p1

    .line 796
    .line 797
    check-cast v0, La/y5d;

    .line 798
    .line 799
    move-object/from16 v1, p2

    .line 800
    .line 801
    check-cast v1, La/fet;

    .line 802
    .line 803
    move-object/from16 v2, p3

    .line 804
    .line 805
    check-cast v2, Ljava/lang/Integer;

    .line 806
    .line 807
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 808
    .line 809
    .line 810
    move-result v2

    .line 811
    sget v3, La/amr0;->m2:I

    .line 812
    .line 813
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    and-int/lit8 v3, v2, 0x6

    .line 817
    .line 818
    if-nez v3, :cond_14

    .line 819
    .line 820
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v3

    .line 824
    if-eqz v3, :cond_13

    .line 825
    .line 826
    move v6, v7

    .line 827
    :cond_13
    or-int/2addr v2, v6

    .line 828
    :cond_14
    and-int/lit8 v3, v2, 0x13

    .line 829
    .line 830
    if-eq v3, v5, :cond_15

    .line 831
    .line 832
    move v13, v14

    .line 833
    :cond_15
    and-int/2addr v2, v14

    .line 834
    invoke-virtual {v1, v2, v13}, La/fet;->U(IZ)Z

    .line 835
    .line 836
    .line 837
    move-result v2

    .line 838
    if-eqz v2, :cond_16

    .line 839
    .line 840
    invoke-static {v9, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    sget-object v3, La/gqw0;->n:La/xx7;

    .line 845
    .line 846
    invoke-virtual {v0, v2, v3}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 847
    .line 848
    .line 849
    move-result-object v4

    .line 850
    sget-object v0, La/qmk;->a:La/zcl;

    .line 851
    .line 852
    const/4 v8, 0x0

    .line 853
    const/16 v9, 0xd

    .line 854
    .line 855
    const/4 v5, 0x0

    .line 856
    const/high16 v6, 0x41e00000    # 28.0f

    .line 857
    .line 858
    const/4 v7, 0x0

    .line 859
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 860
    .line 861
    .line 862
    move-result-object v15

    .line 863
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    check-cast v0, La/jq8;

    .line 868
    .line 869
    iget-object v0, v0, La/jq8;->a:Ljava/lang/String;

    .line 870
    .line 871
    const/16 v23, 0x0

    .line 872
    .line 873
    const/16 v24, 0x1c

    .line 874
    .line 875
    const-wide/16 v17, 0x0

    .line 876
    .line 877
    const/16 v19, 0x0

    .line 878
    .line 879
    const-wide/16 v20, 0x0

    .line 880
    .line 881
    move-object/from16 v16, v0

    .line 882
    .line 883
    move-object/from16 v22, v1

    .line 884
    .line 885
    invoke-static/range {v15 .. v24}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 886
    .line 887
    .line 888
    goto :goto_e

    .line 889
    :cond_16
    move-object/from16 v22, v1

    .line 890
    .line 891
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 892
    .line 893
    .line 894
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 895
    .line 896
    return-object v0

    .line 897
    :pswitch_7
    move-object/from16 v0, p1

    .line 898
    .line 899
    check-cast v0, La/y5d;

    .line 900
    .line 901
    move-object/from16 v1, p2

    .line 902
    .line 903
    check-cast v1, La/fet;

    .line 904
    .line 905
    move-object/from16 v2, p3

    .line 906
    .line 907
    check-cast v2, Ljava/lang/Integer;

    .line 908
    .line 909
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 910
    .line 911
    .line 912
    move-result v2

    .line 913
    sget v3, La/ylr0;->m2:I

    .line 914
    .line 915
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 916
    .line 917
    .line 918
    and-int/lit8 v3, v2, 0x6

    .line 919
    .line 920
    if-nez v3, :cond_18

    .line 921
    .line 922
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    move-result v3

    .line 926
    if-eqz v3, :cond_17

    .line 927
    .line 928
    move v6, v7

    .line 929
    :cond_17
    or-int/2addr v2, v6

    .line 930
    :cond_18
    and-int/lit8 v3, v2, 0x13

    .line 931
    .line 932
    if-eq v3, v5, :cond_19

    .line 933
    .line 934
    move v13, v14

    .line 935
    :cond_19
    and-int/2addr v2, v14

    .line 936
    invoke-virtual {v1, v2, v13}, La/fet;->U(IZ)Z

    .line 937
    .line 938
    .line 939
    move-result v2

    .line 940
    if-eqz v2, :cond_1a

    .line 941
    .line 942
    invoke-static {v9, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 943
    .line 944
    .line 945
    move-result-object v2

    .line 946
    sget-object v3, La/gqw0;->n:La/xx7;

    .line 947
    .line 948
    invoke-virtual {v0, v2, v3}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 949
    .line 950
    .line 951
    move-result-object v4

    .line 952
    sget-object v0, La/qmk;->a:La/zcl;

    .line 953
    .line 954
    const/4 v8, 0x0

    .line 955
    const/16 v9, 0xd

    .line 956
    .line 957
    const/4 v5, 0x0

    .line 958
    const/high16 v6, 0x41e00000    # 28.0f

    .line 959
    .line 960
    const/4 v7, 0x0

    .line 961
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 962
    .line 963
    .line 964
    move-result-object v15

    .line 965
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    check-cast v0, La/cmr0;

    .line 970
    .line 971
    iget-object v0, v0, La/cmr0;->a:Ljava/lang/String;

    .line 972
    .line 973
    const/16 v23, 0x0

    .line 974
    .line 975
    const/16 v24, 0x1c

    .line 976
    .line 977
    const-wide/16 v17, 0x0

    .line 978
    .line 979
    const/16 v19, 0x0

    .line 980
    .line 981
    const-wide/16 v20, 0x0

    .line 982
    .line 983
    move-object/from16 v16, v0

    .line 984
    .line 985
    move-object/from16 v22, v1

    .line 986
    .line 987
    invoke-static/range {v15 .. v24}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 988
    .line 989
    .line 990
    goto :goto_f

    .line 991
    :cond_1a
    move-object/from16 v22, v1

    .line 992
    .line 993
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 994
    .line 995
    .line 996
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 997
    .line 998
    return-object v0

    .line 999
    :pswitch_8
    move-object/from16 v0, p1

    .line 1000
    .line 1001
    check-cast v0, La/mm40;

    .line 1002
    .line 1003
    move-object/from16 v1, p2

    .line 1004
    .line 1005
    check-cast v1, La/fet;

    .line 1006
    .line 1007
    move-object/from16 v2, p3

    .line 1008
    .line 1009
    check-cast v2, Ljava/lang/Integer;

    .line 1010
    .line 1011
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1012
    .line 1013
    .line 1014
    move-result v2

    .line 1015
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1016
    .line 1017
    .line 1018
    and-int/lit8 v3, v2, 0x6

    .line 1019
    .line 1020
    if-nez v3, :cond_1c

    .line 1021
    .line 1022
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v3

    .line 1026
    if-eqz v3, :cond_1b

    .line 1027
    .line 1028
    move v6, v7

    .line 1029
    :cond_1b
    or-int/2addr v2, v6

    .line 1030
    :cond_1c
    and-int/lit8 v3, v2, 0x13

    .line 1031
    .line 1032
    if-eq v3, v5, :cond_1d

    .line 1033
    .line 1034
    move v13, v14

    .line 1035
    :cond_1d
    and-int/lit8 v3, v2, 0x1

    .line 1036
    .line 1037
    invoke-virtual {v1, v3, v13}, La/fet;->U(IZ)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v3

    .line 1041
    if-eqz v3, :cond_1e

    .line 1042
    .line 1043
    and-int/lit8 v2, v2, 0xe

    .line 1044
    .line 1045
    or-int/lit8 v2, v2, 0x30

    .line 1046
    .line 1047
    invoke-static {v2, v1, v0, v12}, La/idm0;->g(ILa/fet;La/mm40;La/l7m0;)V

    .line 1048
    .line 1049
    .line 1050
    goto :goto_10

    .line 1051
    :cond_1e
    invoke-virtual {v1}, La/fet;->X()V

    .line 1052
    .line 1053
    .line 1054
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1055
    .line 1056
    return-object v0

    .line 1057
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
.end method
