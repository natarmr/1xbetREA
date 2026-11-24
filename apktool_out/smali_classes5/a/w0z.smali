.class public final synthetic La/w0z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:La/haj;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/haj;JLjava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/w0z;->a:B

    iput-object p1, p0, La/w0z;->c:La/haj;

    iput-wide p2, p0, La/w0z;->b:J

    iput-object p4, p0, La/w0z;->d:Ljava/lang/Object;

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
    iget-byte v1, v0, La/w0z;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/16 v3, 0x92

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    iget-wide v5, v0, La/w0z;->b:J

    .line 11
    .line 12
    const/16 v7, 0x10

    .line 13
    .line 14
    const/16 v8, 0x20

    .line 15
    .line 16
    const/4 v9, 0x4

    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, 0x1

    .line 19
    iget-object v12, v0, La/w0z;->d:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v13, v0, La/w0z;->c:La/haj;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast v13, La/caj;

    .line 27
    .line 28
    iget-object v0, v13, La/caj;->b:La/kmo;

    .line 29
    .line 30
    move-object v15, v12

    .line 31
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    move-object/from16 v1, p1

    .line 34
    .line 35
    check-cast v1, La/y5d;

    .line 36
    .line 37
    move-object/from16 v12, p2

    .line 38
    .line 39
    check-cast v12, La/mm40;

    .line 40
    .line 41
    move-object/from16 v13, p3

    .line 42
    .line 43
    check-cast v13, La/fet;

    .line 44
    .line 45
    move-object/from16 v14, p4

    .line 46
    .line 47
    check-cast v14, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-static {v14, v1, v12}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 50
    .line 51
    .line 52
    move-result v14

    .line 53
    and-int/lit8 v16, v14, 0x6

    .line 54
    .line 55
    if-nez v16, :cond_1

    .line 56
    .line 57
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v16

    .line 61
    if-eqz v16, :cond_0

    .line 62
    .line 63
    move v4, v9

    .line 64
    :cond_0
    or-int/2addr v4, v14

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move v4, v14

    .line 67
    :goto_0
    and-int/lit8 v14, v14, 0x30

    .line 68
    .line 69
    if-nez v14, :cond_3

    .line 70
    .line 71
    invoke-virtual {v13, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v14

    .line 75
    if-eqz v14, :cond_2

    .line 76
    .line 77
    move v7, v8

    .line 78
    :cond_2
    or-int/2addr v4, v7

    .line 79
    :cond_3
    and-int/lit16 v7, v4, 0x93

    .line 80
    .line 81
    if-eq v7, v3, :cond_4

    .line 82
    .line 83
    move v3, v11

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    move v3, v10

    .line 86
    :goto_1
    and-int/2addr v4, v11

    .line 87
    invoke-virtual {v13, v4, v3}, La/fet;->U(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_8

    .line 92
    .line 93
    if-nez v0, :cond_5

    .line 94
    .line 95
    const v0, -0x4ffb4bb8

    .line 96
    .line 97
    .line 98
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v13, v10}, La/fet;->r(Z)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    const v3, -0x4ffb4bb7

    .line 106
    .line 107
    .line 108
    invoke-virtual {v13, v3}, La/fet;->e0(I)V

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v13}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sget-object v3, La/gqw0;->n:La/xx7;

    .line 116
    .line 117
    invoke-virtual {v1, v12, v3}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 118
    .line 119
    .line 120
    move-result-object v16

    .line 121
    sget-object v1, La/qmk;->a:La/zcl;

    .line 122
    .line 123
    const/16 v20, 0x0

    .line 124
    .line 125
    const/16 v21, 0xd

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    const/high16 v18, 0x40000000    # 2.0f

    .line 130
    .line 131
    const/16 v19, 0x0

    .line 132
    .line 133
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v13, v5, v6}, La/fet;->f(J)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    if-nez v3, :cond_6

    .line 146
    .line 147
    if-ne v4, v2, :cond_7

    .line 148
    .line 149
    :cond_6
    new-instance v4, La/r2a0;

    .line 150
    .line 151
    invoke-direct {v4, v9, v5, v6}, La/r2a0;-><init>(BJ)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 158
    .line 159
    invoke-static {v1, v4}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    move-object v14, v0

    .line 168
    check-cast v14, La/kmo;

    .line 169
    .line 170
    const/16 v17, 0x0

    .line 171
    .line 172
    const/16 v18, 0x0

    .line 173
    .line 174
    move-object/from16 v16, v13

    .line 175
    .line 176
    move-object v13, v1

    .line 177
    invoke-static/range {v13 .. v18}, La/rcb;->F(La/mm40;La/kmo;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 178
    .line 179
    .line 180
    move-object/from16 v0, v16

    .line 181
    .line 182
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_8
    move-object v0, v13

    .line 187
    invoke-virtual {v0}, La/fet;->X()V

    .line 188
    .line 189
    .line 190
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_0
    move-object v3, v13

    .line 194
    check-cast v3, La/caj;

    .line 195
    .line 196
    move-object v6, v12

    .line 197
    check-cast v6, La/pz40;

    .line 198
    .line 199
    move-object/from16 v1, p1

    .line 200
    .line 201
    check-cast v1, La/y5d;

    .line 202
    .line 203
    move-object/from16 v2, p2

    .line 204
    .line 205
    check-cast v2, La/mm40;

    .line 206
    .line 207
    move-object/from16 v9, p3

    .line 208
    .line 209
    check-cast v9, La/fet;

    .line 210
    .line 211
    move-object/from16 v4, p4

    .line 212
    .line 213
    check-cast v4, Ljava/lang/Integer;

    .line 214
    .line 215
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    and-int/lit8 v4, v1, 0x30

    .line 220
    .line 221
    if-nez v4, :cond_a

    .line 222
    .line 223
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-eqz v4, :cond_9

    .line 228
    .line 229
    move v7, v8

    .line 230
    :cond_9
    or-int/2addr v1, v7

    .line 231
    :cond_a
    and-int/lit16 v4, v1, 0x91

    .line 232
    .line 233
    const/16 v5, 0x90

    .line 234
    .line 235
    if-eq v4, v5, :cond_b

    .line 236
    .line 237
    move v10, v11

    .line 238
    :cond_b
    and-int/2addr v1, v11

    .line 239
    invoke-virtual {v9, v1, v10}, La/fet;->U(IZ)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_c

    .line 244
    .line 245
    new-instance v1, La/ds8;

    .line 246
    .line 247
    const/4 v7, 0x4

    .line 248
    iget-wide v4, v0, La/w0z;->b:J

    .line 249
    .line 250
    invoke-direct/range {v1 .. v7}, La/ds8;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 251
    .line 252
    .line 253
    const v0, 0x1ffc8fce

    .line 254
    .line 255
    .line 256
    invoke-static {v0, v1, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    const/4 v1, 0x6

    .line 261
    invoke-static {v0, v9, v1}, La/kr00;->a(La/ugd;La/fet;I)V

    .line 262
    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_c
    invoke-virtual {v9}, La/fet;->X()V

    .line 266
    .line 267
    .line 268
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_1
    check-cast v13, La/aaj;

    .line 272
    .line 273
    iget-object v0, v13, La/aaj;->d:La/kmo;

    .line 274
    .line 275
    move-object v15, v12

    .line 276
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 277
    .line 278
    move-object/from16 v1, p1

    .line 279
    .line 280
    check-cast v1, La/y5d;

    .line 281
    .line 282
    move-object/from16 v12, p2

    .line 283
    .line 284
    check-cast v12, La/mm40;

    .line 285
    .line 286
    move-object/from16 v13, p3

    .line 287
    .line 288
    check-cast v13, La/fet;

    .line 289
    .line 290
    move-object/from16 v14, p4

    .line 291
    .line 292
    check-cast v14, Ljava/lang/Integer;

    .line 293
    .line 294
    invoke-static {v14, v1, v12}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 295
    .line 296
    .line 297
    move-result v14

    .line 298
    and-int/lit8 v16, v14, 0x6

    .line 299
    .line 300
    if-nez v16, :cond_e

    .line 301
    .line 302
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v16

    .line 306
    if-eqz v16, :cond_d

    .line 307
    .line 308
    move v4, v9

    .line 309
    :cond_d
    or-int/2addr v4, v14

    .line 310
    goto :goto_4

    .line 311
    :cond_e
    move v4, v14

    .line 312
    :goto_4
    and-int/lit8 v9, v14, 0x30

    .line 313
    .line 314
    if-nez v9, :cond_10

    .line 315
    .line 316
    invoke-virtual {v13, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v9

    .line 320
    if-eqz v9, :cond_f

    .line 321
    .line 322
    move v7, v8

    .line 323
    :cond_f
    or-int/2addr v4, v7

    .line 324
    :cond_10
    and-int/lit16 v7, v4, 0x93

    .line 325
    .line 326
    if-eq v7, v3, :cond_11

    .line 327
    .line 328
    move v3, v11

    .line 329
    goto :goto_5

    .line 330
    :cond_11
    move v3, v10

    .line 331
    :goto_5
    and-int/2addr v4, v11

    .line 332
    invoke-virtual {v13, v4, v3}, La/fet;->U(IZ)Z

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    if-eqz v3, :cond_16

    .line 337
    .line 338
    if-nez v0, :cond_12

    .line 339
    .line 340
    const v0, 0x27a56e89

    .line 341
    .line 342
    .line 343
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v13, v10}, La/fet;->r(Z)V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_7

    .line 350
    .line 351
    :cond_12
    const v3, 0x27a56e8a

    .line 352
    .line 353
    .line 354
    invoke-virtual {v13, v3}, La/fet;->e0(I)V

    .line 355
    .line 356
    .line 357
    invoke-static {v0, v13}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    sget-object v3, La/gqw0;->n:La/xx7;

    .line 362
    .line 363
    invoke-virtual {v1, v12, v3}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 364
    .line 365
    .line 366
    move-result-object v16

    .line 367
    sget-object v1, La/qmk;->a:La/zcl;

    .line 368
    .line 369
    const/16 v20, 0x0

    .line 370
    .line 371
    const/16 v21, 0xd

    .line 372
    .line 373
    const/16 v17, 0x0

    .line 374
    .line 375
    const/high16 v18, 0x40000000    # 2.0f

    .line 376
    .line 377
    const/16 v19, 0x0

    .line 378
    .line 379
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-virtual {v13, v5, v6}, La/fet;->f(J)Z

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    if-nez v3, :cond_13

    .line 392
    .line 393
    if-ne v4, v2, :cond_14

    .line 394
    .line 395
    :cond_13
    new-instance v4, La/dls;

    .line 396
    .line 397
    const/16 v2, 0xe

    .line 398
    .line 399
    invoke-direct {v4, v2, v5, v6}, La/dls;-><init>(BJ)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :cond_14
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 406
    .line 407
    invoke-static {v1, v4}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    sget-object v2, La/gqw0;->a:La/zx7;

    .line 412
    .line 413
    invoke-static {v2, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    iget-wide v3, v13, La/fet;->T:J

    .line 418
    .line 419
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    invoke-static {v13, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 432
    .line 433
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v13}, La/fet;->i0()V

    .line 437
    .line 438
    .line 439
    iget-boolean v5, v13, La/fet;->S:Z

    .line 440
    .line 441
    if-eqz v5, :cond_15

    .line 442
    .line 443
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 444
    .line 445
    invoke-virtual {v13, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 446
    .line 447
    .line 448
    goto :goto_6

    .line 449
    :cond_15
    invoke-virtual {v13}, La/fet;->r0()V

    .line 450
    .line 451
    .line 452
    :goto_6
    sget-object v5, La/gqw0;->x:La/shd;

    .line 453
    .line 454
    invoke-static {v13, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 455
    .line 456
    .line 457
    sget-object v2, La/gqw0;->w:La/shd;

    .line 458
    .line 459
    invoke-static {v13, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 460
    .line 461
    .line 462
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    sget-object v3, La/gqw0;->y:La/shd;

    .line 467
    .line 468
    invoke-static {v13, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 469
    .line 470
    .line 471
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 472
    .line 473
    .line 474
    sget-object v2, La/gqw0;->v:La/shd;

    .line 475
    .line 476
    invoke-static {v13, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 477
    .line 478
    .line 479
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    move-object v14, v0

    .line 484
    check-cast v14, La/kmo;

    .line 485
    .line 486
    const/16 v17, 0x6

    .line 487
    .line 488
    const/16 v18, 0x0

    .line 489
    .line 490
    move-object/from16 v16, v13

    .line 491
    .line 492
    sget-object v13, La/jm40;->b:La/jm40;

    .line 493
    .line 494
    invoke-static/range {v13 .. v18}, La/rcb;->F(La/mm40;La/kmo;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 495
    .line 496
    .line 497
    move-object/from16 v0, v16

    .line 498
    .line 499
    invoke-virtual {v0, v11}, La/fet;->r(Z)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 503
    .line 504
    .line 505
    goto :goto_7

    .line 506
    :cond_16
    move-object v0, v13

    .line 507
    invoke-virtual {v0}, La/fet;->X()V

    .line 508
    .line 509
    .line 510
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 511
    .line 512
    return-object v0

    .line 513
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
