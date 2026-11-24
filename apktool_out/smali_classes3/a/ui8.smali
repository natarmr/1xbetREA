.class public final La/ui8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ui8;->a:B

    iput-object p1, p0, La/ui8;->b:Ljava/util/ArrayList;

    iput-object p2, p0, La/ui8;->c:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ui8;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/ui8;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/high16 v4, 0x41800000    # 16.0f

    .line 9
    .line 10
    iget-object v0, v0, La/ui8;->b:Ljava/util/ArrayList;

    .line 11
    .line 12
    const/16 v5, 0x92

    .line 13
    .line 14
    const/16 v6, 0x10

    .line 15
    .line 16
    const/16 v7, 0x20

    .line 17
    .line 18
    const/4 v8, 0x4

    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x1

    .line 21
    const/4 v11, 0x2

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, La/g9z;

    .line 28
    .line 29
    move-object/from16 v12, p2

    .line 30
    .line 31
    check-cast v12, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v12

    .line 37
    move-object/from16 v13, p3

    .line 38
    .line 39
    check-cast v13, La/fet;

    .line 40
    .line 41
    move-object/from16 v14, p4

    .line 42
    .line 43
    check-cast v14, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v14

    .line 49
    and-int/lit8 v15, v14, 0x6

    .line 50
    .line 51
    if-nez v15, :cond_1

    .line 52
    .line 53
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move v8, v11

    .line 61
    :goto_0
    or-int v1, v14, v8

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move v1, v14

    .line 65
    :goto_1
    and-int/lit8 v8, v14, 0x30

    .line 66
    .line 67
    if-nez v8, :cond_3

    .line 68
    .line 69
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_2

    .line 74
    .line 75
    move v6, v7

    .line 76
    :cond_2
    or-int/2addr v1, v6

    .line 77
    :cond_3
    and-int/lit16 v6, v1, 0x93

    .line 78
    .line 79
    if-eq v6, v5, :cond_4

    .line 80
    .line 81
    move v5, v10

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move v5, v9

    .line 84
    :goto_2
    and-int/2addr v1, v10

    .line 85
    invoke-virtual {v13, v1, v5}, La/fet;->U(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_7

    .line 90
    .line 91
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, La/gta0;

    .line 96
    .line 97
    const v1, -0x2828bc70

    .line 98
    .line 99
    .line 100
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 101
    .line 102
    .line 103
    sget-object v1, La/qmk;->a:La/zcl;

    .line 104
    .line 105
    const/high16 v18, 0x41800000    # 16.0f

    .line 106
    .line 107
    const/16 v19, 0x5

    .line 108
    .line 109
    sget-object v20, La/jm40;->b:La/jm40;

    .line 110
    .line 111
    const/4 v15, 0x0

    .line 112
    const/high16 v16, 0x41400000    # 12.0f

    .line 113
    .line 114
    const/16 v17, 0x0

    .line 115
    .line 116
    move-object/from16 v14, v20

    .line 117
    .line 118
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    move-object v5, v14

    .line 123
    sget-object v6, La/uc9;->c:La/mw3;

    .line 124
    .line 125
    sget-object v7, La/gqw0;->m:La/xx7;

    .line 126
    .line 127
    invoke-static {v6, v7, v13, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    iget-wide v7, v13, La/fet;->T:J

    .line 132
    .line 133
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-static {v13, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    sget-object v14, La/mkd;->c0:La/gqw0;

    .line 146
    .line 147
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v13}, La/fet;->i0()V

    .line 151
    .line 152
    .line 153
    iget-boolean v14, v13, La/fet;->S:Z

    .line 154
    .line 155
    if-eqz v14, :cond_5

    .line 156
    .line 157
    sget-object v14, La/e7z;->u1:La/pcy;

    .line 158
    .line 159
    invoke-virtual {v13, v14}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_5
    invoke-virtual {v13}, La/fet;->r0()V

    .line 164
    .line 165
    .line 166
    :goto_3
    sget-object v14, La/gqw0;->x:La/shd;

    .line 167
    .line 168
    invoke-static {v13, v6, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 169
    .line 170
    .line 171
    sget-object v6, La/gqw0;->w:La/shd;

    .line 172
    .line 173
    invoke-static {v13, v8, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    sget-object v7, La/gqw0;->y:La/shd;

    .line 181
    .line 182
    invoke-static {v13, v6, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 186
    .line 187
    .line 188
    sget-object v6, La/gqw0;->v:La/shd;

    .line 189
    .line 190
    invoke-static {v13, v1, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v5, v4, v3, v11}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    iget-object v1, v0, La/gta0;->b:Ljava/lang/String;

    .line 198
    .line 199
    sget-object v21, La/j1t0;->a:La/qrq;

    .line 200
    .line 201
    sget-wide v18, La/qmk;->u:J

    .line 202
    .line 203
    sget-wide v27, La/qmk;->H:J

    .line 204
    .line 205
    new-instance v15, La/y9q0;

    .line 206
    .line 207
    const/16 v26, 0x0

    .line 208
    .line 209
    const v29, 0xfdffdd

    .line 210
    .line 211
    .line 212
    const-wide/16 v16, 0x0

    .line 213
    .line 214
    const/16 v20, 0x0

    .line 215
    .line 216
    const-wide/16 v22, 0x0

    .line 217
    .line 218
    const/16 v24, 0x0

    .line 219
    .line 220
    const/16 v25, 0x0

    .line 221
    .line 222
    invoke-direct/range {v15 .. v29}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 223
    .line 224
    .line 225
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 226
    .line 227
    invoke-virtual {v13, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 232
    .line 233
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 234
    .line 235
    .line 236
    move-result-wide v3

    .line 237
    const/16 v36, 0x180

    .line 238
    .line 239
    const v37, 0x1eff8

    .line 240
    .line 241
    .line 242
    const/16 v17, 0x0

    .line 243
    .line 244
    const-wide/16 v18, 0x0

    .line 245
    .line 246
    const/16 v21, 0x0

    .line 247
    .line 248
    const/16 v22, 0x0

    .line 249
    .line 250
    const-wide/16 v23, 0x0

    .line 251
    .line 252
    const/16 v25, 0x0

    .line 253
    .line 254
    const-wide/16 v26, 0x0

    .line 255
    .line 256
    const/16 v28, 0x2

    .line 257
    .line 258
    const/16 v29, 0x0

    .line 259
    .line 260
    const/16 v30, 0x0

    .line 261
    .line 262
    const/16 v31, 0x0

    .line 263
    .line 264
    const/16 v32, 0x0

    .line 265
    .line 266
    const/16 v35, 0x0

    .line 267
    .line 268
    move-object/from16 v34, v13

    .line 269
    .line 270
    move-object/from16 v33, v15

    .line 271
    .line 272
    move-object v13, v1

    .line 273
    move-wide v15, v3

    .line 274
    invoke-static/range {v13 .. v37}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 275
    .line 276
    .line 277
    const/16 v24, 0x0

    .line 278
    .line 279
    const/16 v25, 0xd

    .line 280
    .line 281
    const/16 v21, 0x0

    .line 282
    .line 283
    const/high16 v22, 0x41800000    # 16.0f

    .line 284
    .line 285
    const/16 v23, 0x0

    .line 286
    .line 287
    move-object/from16 v20, v5

    .line 288
    .line 289
    invoke-static/range {v20 .. v25}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 290
    .line 291
    .line 292
    move-result-object v13

    .line 293
    iget-object v14, v0, La/gta0;->c:Ljava/lang/String;

    .line 294
    .line 295
    const/16 v22, 0x0

    .line 296
    .line 297
    const/16 v23, 0x34

    .line 298
    .line 299
    const/4 v15, 0x0

    .line 300
    const/16 v16, 0x5

    .line 301
    .line 302
    const-wide/16 v17, 0x0

    .line 303
    .line 304
    const-wide/16 v19, 0x0

    .line 305
    .line 306
    move-object/from16 v21, v34

    .line 307
    .line 308
    invoke-static/range {v13 .. v23}, La/kkb;->m(La/mm40;Ljava/lang/String;La/ro8;IJJLa/fet;II)V

    .line 309
    .line 310
    .line 311
    move-object/from16 v0, v21

    .line 312
    .line 313
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    sub-int/2addr v1, v10

    .line 321
    if-ge v12, v1, :cond_6

    .line 322
    .line 323
    const v1, -0x281d0151

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 327
    .line 328
    .line 329
    const/16 v24, 0x0

    .line 330
    .line 331
    const/16 v25, 0xd

    .line 332
    .line 333
    const/16 v21, 0x0

    .line 334
    .line 335
    const/high16 v22, 0x42000000    # 32.0f

    .line 336
    .line 337
    const/16 v23, 0x0

    .line 338
    .line 339
    move-object/from16 v20, v5

    .line 340
    .line 341
    invoke-static/range {v20 .. v25}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 342
    .line 343
    .line 344
    move-result-object v13

    .line 345
    sget-object v14, La/qqm;->a:La/qqm;

    .line 346
    .line 347
    const/16 v19, 0x1b0

    .line 348
    .line 349
    const/16 v20, 0x8

    .line 350
    .line 351
    sget-object v15, La/zfi0;->a:La/zfi0;

    .line 352
    .line 353
    const-wide/16 v16, 0x0

    .line 354
    .line 355
    move-object/from16 v18, v0

    .line 356
    .line 357
    invoke-static/range {v13 .. v20}, La/vtb;->t(La/mm40;La/qqm;La/bgi0;JLa/fet;II)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 361
    .line 362
    .line 363
    goto :goto_4

    .line 364
    :cond_6
    const v1, -0x28186a58

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 371
    .line 372
    .line 373
    :goto_4
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 374
    .line 375
    .line 376
    goto :goto_5

    .line 377
    :cond_7
    move-object v0, v13

    .line 378
    invoke-virtual {v0}, La/fet;->X()V

    .line 379
    .line 380
    .line 381
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 382
    .line 383
    return-object v0

    .line 384
    :pswitch_0
    move-object/from16 v1, p1

    .line 385
    .line 386
    check-cast v1, La/g9z;

    .line 387
    .line 388
    move-object/from16 v12, p2

    .line 389
    .line 390
    check-cast v12, Ljava/lang/Number;

    .line 391
    .line 392
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v12

    .line 396
    move-object/from16 v13, p3

    .line 397
    .line 398
    check-cast v13, La/fet;

    .line 399
    .line 400
    move-object/from16 v14, p4

    .line 401
    .line 402
    check-cast v14, Ljava/lang/Number;

    .line 403
    .line 404
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result v14

    .line 408
    and-int/lit8 v15, v14, 0x6

    .line 409
    .line 410
    if-nez v15, :cond_9

    .line 411
    .line 412
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    if-eqz v1, :cond_8

    .line 417
    .line 418
    goto :goto_6

    .line 419
    :cond_8
    move v8, v11

    .line 420
    :goto_6
    or-int v1, v14, v8

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_9
    move v1, v14

    .line 424
    :goto_7
    and-int/lit8 v8, v14, 0x30

    .line 425
    .line 426
    if-nez v8, :cond_b

    .line 427
    .line 428
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 429
    .line 430
    .line 431
    move-result v8

    .line 432
    if-eqz v8, :cond_a

    .line 433
    .line 434
    move v6, v7

    .line 435
    :cond_a
    or-int/2addr v1, v6

    .line 436
    :cond_b
    and-int/lit16 v6, v1, 0x93

    .line 437
    .line 438
    if-eq v6, v5, :cond_c

    .line 439
    .line 440
    move v5, v10

    .line 441
    goto :goto_8

    .line 442
    :cond_c
    move v5, v9

    .line 443
    :goto_8
    and-int/2addr v1, v10

    .line 444
    invoke-virtual {v13, v1, v5}, La/fet;->U(IZ)Z

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    if-eqz v1, :cond_e

    .line 449
    .line 450
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    check-cast v0, Lkotlin/Pair;

    .line 455
    .line 456
    const v1, -0x7fc01f3e

    .line 457
    .line 458
    .line 459
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 460
    .line 461
    .line 462
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v0, La/pan;

    .line 465
    .line 466
    sget-object v1, La/qmk;->a:La/zcl;

    .line 467
    .line 468
    sget-object v1, La/jm40;->b:La/jm40;

    .line 469
    .line 470
    invoke-static {v1, v4, v3, v11}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    invoke-static {v1, v0, v13, v9}, La/f1t0;->q(La/mm40;La/pan;La/fet;I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    sub-int/2addr v0, v10

    .line 482
    if-eq v12, v0, :cond_d

    .line 483
    .line 484
    const v0, -0x7fbd46fd

    .line 485
    .line 486
    .line 487
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 488
    .line 489
    .line 490
    const/16 v18, 0x0

    .line 491
    .line 492
    const/16 v19, 0x5

    .line 493
    .line 494
    move-object/from16 v17, v13

    .line 495
    .line 496
    const/4 v13, 0x0

    .line 497
    const/high16 v14, 0x40c00000    # 6.0f

    .line 498
    .line 499
    const-wide/16 v15, 0x0

    .line 500
    .line 501
    invoke-static/range {v13 .. v19}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 502
    .line 503
    .line 504
    sget-object v14, La/qqm;->a:La/qqm;

    .line 505
    .line 506
    const/16 v19, 0x1b0

    .line 507
    .line 508
    const/16 v20, 0x9

    .line 509
    .line 510
    sget-object v15, La/zfi0;->a:La/zfi0;

    .line 511
    .line 512
    move-object/from16 v18, v17

    .line 513
    .line 514
    const-wide/16 v16, 0x0

    .line 515
    .line 516
    invoke-static/range {v13 .. v20}, La/vtb;->t(La/mm40;La/qqm;La/bgi0;JLa/fet;II)V

    .line 517
    .line 518
    .line 519
    move-object/from16 v17, v18

    .line 520
    .line 521
    const/16 v18, 0x0

    .line 522
    .line 523
    const/16 v19, 0x5

    .line 524
    .line 525
    const/high16 v14, 0x40c00000    # 6.0f

    .line 526
    .line 527
    const-wide/16 v15, 0x0

    .line 528
    .line 529
    invoke-static/range {v13 .. v19}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 530
    .line 531
    .line 532
    move-object/from16 v0, v17

    .line 533
    .line 534
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 535
    .line 536
    .line 537
    goto :goto_9

    .line 538
    :cond_d
    move-object v0, v13

    .line 539
    const v1, -0x7fb877b5

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 546
    .line 547
    .line 548
    :goto_9
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 549
    .line 550
    .line 551
    goto :goto_a

    .line 552
    :cond_e
    move-object v0, v13

    .line 553
    invoke-virtual {v0}, La/fet;->X()V

    .line 554
    .line 555
    .line 556
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 557
    .line 558
    return-object v0

    .line 559
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
