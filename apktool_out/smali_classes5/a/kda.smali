.class public final synthetic La/kda;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qda;


# direct methods
.method public synthetic constructor <init>(La/qda;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kda;->a:B

    iput-object p1, p0, La/kda;->b:La/qda;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kda;->a:B

    .line 4
    .line 5
    const/16 v2, 0x90

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/16 v4, 0x10

    .line 9
    .line 10
    const/16 v5, 0x20

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    iget-object v0, v0, La/kda;->b:La/qda;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, La/y5d;

    .line 22
    .line 23
    move-object/from16 v8, p2

    .line 24
    .line 25
    check-cast v8, La/mm40;

    .line 26
    .line 27
    move-object/from16 v9, p3

    .line 28
    .line 29
    check-cast v9, La/fet;

    .line 30
    .line 31
    move-object/from16 v10, p4

    .line 32
    .line 33
    check-cast v10, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-static {v10, v1, v8}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    and-int/lit8 v10, v1, 0x30

    .line 40
    .line 41
    if-nez v10, :cond_1

    .line 42
    .line 43
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    if-eqz v10, :cond_0

    .line 48
    .line 49
    move v4, v5

    .line 50
    :cond_0
    or-int/2addr v1, v4

    .line 51
    :cond_1
    and-int/lit16 v4, v1, 0x91

    .line 52
    .line 53
    if-eq v4, v2, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v6, v7

    .line 57
    :goto_0
    and-int/lit8 v2, v1, 0x1

    .line 58
    .line 59
    invoke-virtual {v9, v2, v6}, La/fet;->U(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    iget-object v0, v0, La/qda;->c:La/j83;

    .line 66
    .line 67
    shr-int/2addr v1, v3

    .line 68
    and-int/lit8 v1, v1, 0xe

    .line 69
    .line 70
    invoke-static {v8, v0, v9, v1}, La/knx;->l(La/mm40;La/j83;La/fet;I)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {v9}, La/fet;->X()V

    .line 75
    .line 76
    .line 77
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_0
    move-object/from16 v1, p1

    .line 81
    .line 82
    check-cast v1, La/y5d;

    .line 83
    .line 84
    move-object/from16 v8, p2

    .line 85
    .line 86
    check-cast v8, La/mm40;

    .line 87
    .line 88
    move-object/from16 v2, p3

    .line 89
    .line 90
    check-cast v2, La/fet;

    .line 91
    .line 92
    move-object/from16 v9, p4

    .line 93
    .line 94
    check-cast v9, Ljava/lang/Integer;

    .line 95
    .line 96
    invoke-static {v9, v1, v8}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    and-int/lit8 v10, v9, 0x6

    .line 101
    .line 102
    if-nez v10, :cond_5

    .line 103
    .line 104
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_4

    .line 109
    .line 110
    const/4 v10, 0x4

    .line 111
    goto :goto_2

    .line 112
    :cond_4
    const/4 v10, 0x2

    .line 113
    :goto_2
    or-int/2addr v10, v9

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    move v10, v9

    .line 116
    :goto_3
    const/16 v14, 0x30

    .line 117
    .line 118
    and-int/2addr v9, v14

    .line 119
    if-nez v9, :cond_7

    .line 120
    .line 121
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eqz v9, :cond_6

    .line 126
    .line 127
    move v4, v5

    .line 128
    :cond_6
    or-int/2addr v10, v4

    .line 129
    :cond_7
    and-int/lit16 v4, v10, 0x93

    .line 130
    .line 131
    const/16 v5, 0x92

    .line 132
    .line 133
    if-eq v4, v5, :cond_8

    .line 134
    .line 135
    move v4, v6

    .line 136
    goto :goto_4

    .line 137
    :cond_8
    move v4, v7

    .line 138
    :goto_4
    and-int/lit8 v5, v10, 0x1

    .line 139
    .line 140
    invoke-virtual {v2, v5, v4}, La/fet;->U(IZ)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_b

    .line 145
    .line 146
    sget-object v4, La/qmk;->a:La/zcl;

    .line 147
    .line 148
    const/4 v12, 0x0

    .line 149
    const/16 v13, 0xd

    .line 150
    .line 151
    const/4 v9, 0x0

    .line 152
    const/high16 v10, 0x40800000    # 4.0f

    .line 153
    .line 154
    const/4 v11, 0x0

    .line 155
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-static {v1, v4}, La/y5d;->c(La/y5d;La/mm40;)La/mm40;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const/high16 v4, 0x3f800000    # 1.0f

    .line 164
    .line 165
    invoke-static {v1, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 170
    .line 171
    new-instance v8, La/qw3;

    .line 172
    .line 173
    new-instance v9, La/gne;

    .line 174
    .line 175
    const/16 v10, 0xb

    .line 176
    .line 177
    invoke-direct {v9, v5, v10}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 178
    .line 179
    .line 180
    const/high16 v5, 0x41000000    # 8.0f

    .line 181
    .line 182
    invoke-direct {v8, v5, v7, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 183
    .line 184
    .line 185
    sget-object v5, La/gqw0;->n:La/xx7;

    .line 186
    .line 187
    invoke-static {v8, v5, v2, v14}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    iget-wide v8, v2, La/fet;->T:J

    .line 192
    .line 193
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-static {v2, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 206
    .line 207
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, La/fet;->i0()V

    .line 211
    .line 212
    .line 213
    iget-boolean v10, v2, La/fet;->S:Z

    .line 214
    .line 215
    sget-object v11, La/e7z;->u1:La/pcy;

    .line 216
    .line 217
    if-eqz v10, :cond_9

    .line 218
    .line 219
    invoke-virtual {v2, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 220
    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_9
    invoke-virtual {v2}, La/fet;->r0()V

    .line 224
    .line 225
    .line 226
    :goto_5
    sget-object v10, La/gqw0;->x:La/shd;

    .line 227
    .line 228
    invoke-static {v2, v5, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 229
    .line 230
    .line 231
    sget-object v5, La/gqw0;->w:La/shd;

    .line 232
    .line 233
    invoke-static {v2, v9, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 234
    .line 235
    .line 236
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    sget-object v9, La/gqw0;->y:La/shd;

    .line 241
    .line 242
    invoke-static {v2, v8, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 243
    .line 244
    .line 245
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 246
    .line 247
    .line 248
    sget-object v8, La/gqw0;->v:La/shd;

    .line 249
    .line 250
    invoke-static {v2, v1, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 251
    .line 252
    .line 253
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 254
    .line 255
    invoke-static {v1, v7}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    iget-wide v12, v2, La/fet;->T:J

    .line 260
    .line 261
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 266
    .line 267
    .line 268
    move-result-object v12

    .line 269
    sget-object v13, La/jm40;->b:La/jm40;

    .line 270
    .line 271
    invoke-static {v2, v13}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 272
    .line 273
    .line 274
    move-result-object v14

    .line 275
    invoke-virtual {v2}, La/fet;->i0()V

    .line 276
    .line 277
    .line 278
    iget-boolean v15, v2, La/fet;->S:Z

    .line 279
    .line 280
    if-eqz v15, :cond_a

    .line 281
    .line 282
    invoke-virtual {v2, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 283
    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_a
    invoke-virtual {v2}, La/fet;->r0()V

    .line 287
    .line 288
    .line 289
    :goto_6
    invoke-static {v2, v1, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 290
    .line 291
    .line 292
    invoke-static {v2, v12, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 293
    .line 294
    .line 295
    invoke-static {v7, v2, v9, v2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 296
    .line 297
    .line 298
    invoke-static {v2, v14, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 299
    .line 300
    .line 301
    iget-object v9, v0, La/qda;->b:Ljava/lang/String;

    .line 302
    .line 303
    sget-object v0, La/j1t0;->e:La/zfn;

    .line 304
    .line 305
    invoke-virtual {v2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    check-cast v0, La/g1t0;

    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    sget-object v20, La/j1t0;->c:La/qrq;

    .line 315
    .line 316
    sget-wide v17, La/qmk;->t:J

    .line 317
    .line 318
    const/16 v0, 0x16

    .line 319
    .line 320
    invoke-static {v0}, La/idm0;->t(I)J

    .line 321
    .line 322
    .line 323
    move-result-wide v26

    .line 324
    new-instance v29, La/y9q0;

    .line 325
    .line 326
    const/16 v25, 0x0

    .line 327
    .line 328
    const v28, 0xfdffdd

    .line 329
    .line 330
    .line 331
    const-wide/16 v15, 0x0

    .line 332
    .line 333
    const/16 v19, 0x0

    .line 334
    .line 335
    const-wide/16 v21, 0x0

    .line 336
    .line 337
    const/16 v23, 0x0

    .line 338
    .line 339
    const/16 v24, 0x0

    .line 340
    .line 341
    move-object/from16 v14, v29

    .line 342
    .line 343
    invoke-direct/range {v14 .. v28}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 344
    .line 345
    .line 346
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 347
    .line 348
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 349
    .line 350
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 351
    .line 352
    .line 353
    move-result-wide v11

    .line 354
    sget-wide v22, La/qmk;->q:J

    .line 355
    .line 356
    sget-wide v26, La/qmk;->n:J

    .line 357
    .line 358
    new-instance v21, La/n05;

    .line 359
    .line 360
    move-wide/from16 v24, v17

    .line 361
    .line 362
    invoke-direct/range {v21 .. v27}, La/n05;-><init>(JJJ)V

    .line 363
    .line 364
    .line 365
    new-instance v0, La/f2q0;

    .line 366
    .line 367
    invoke-direct {v0, v3}, La/f2q0;-><init>(I)V

    .line 368
    .line 369
    .line 370
    const/16 v32, 0x6180

    .line 371
    .line 372
    const v33, 0x1abf2

    .line 373
    .line 374
    .line 375
    const/4 v10, 0x0

    .line 376
    const-wide/16 v14, 0x0

    .line 377
    .line 378
    const/16 v16, 0x0

    .line 379
    .line 380
    const/16 v17, 0x0

    .line 381
    .line 382
    const/16 v18, 0x0

    .line 383
    .line 384
    const-wide/16 v19, 0x0

    .line 385
    .line 386
    const-wide/16 v22, 0x0

    .line 387
    .line 388
    const/16 v24, 0x2

    .line 389
    .line 390
    const/16 v25, 0x0

    .line 391
    .line 392
    const/16 v26, 0x4

    .line 393
    .line 394
    const/16 v27, 0x0

    .line 395
    .line 396
    const/16 v28, 0x0

    .line 397
    .line 398
    const/16 v31, 0x0

    .line 399
    .line 400
    move-object/from16 v30, v21

    .line 401
    .line 402
    move-object/from16 v21, v0

    .line 403
    .line 404
    move-object v0, v13

    .line 405
    move-object/from16 v13, v30

    .line 406
    .line 407
    move-object/from16 v30, v2

    .line 408
    .line 409
    invoke-static/range {v9 .. v33}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 410
    .line 411
    .line 412
    move-object/from16 v1, v30

    .line 413
    .line 414
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 415
    .line 416
    .line 417
    invoke-static {v0, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    const/4 v2, 0x6

    .line 422
    invoke-static {v2, v1, v0}, La/fka;->a(ILa/fet;La/mm40;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 426
    .line 427
    .line 428
    goto :goto_7

    .line 429
    :cond_b
    move-object v1, v2

    .line 430
    invoke-virtual {v1}, La/fet;->X()V

    .line 431
    .line 432
    .line 433
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 434
    .line 435
    return-object v0

    .line 436
    :pswitch_1
    move-object/from16 v1, p1

    .line 437
    .line 438
    check-cast v1, La/y5d;

    .line 439
    .line 440
    move-object/from16 v8, p2

    .line 441
    .line 442
    check-cast v8, La/mm40;

    .line 443
    .line 444
    move-object/from16 v9, p3

    .line 445
    .line 446
    check-cast v9, La/fet;

    .line 447
    .line 448
    move-object/from16 v10, p4

    .line 449
    .line 450
    check-cast v10, Ljava/lang/Integer;

    .line 451
    .line 452
    invoke-static {v10, v1, v8}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    and-int/lit8 v10, v1, 0x30

    .line 457
    .line 458
    if-nez v10, :cond_d

    .line 459
    .line 460
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v10

    .line 464
    if-eqz v10, :cond_c

    .line 465
    .line 466
    move v4, v5

    .line 467
    :cond_c
    or-int/2addr v1, v4

    .line 468
    :cond_d
    and-int/lit16 v4, v1, 0x91

    .line 469
    .line 470
    if-eq v4, v2, :cond_e

    .line 471
    .line 472
    goto :goto_8

    .line 473
    :cond_e
    move v6, v7

    .line 474
    :goto_8
    and-int/lit8 v2, v1, 0x1

    .line 475
    .line 476
    invoke-virtual {v9, v2, v6}, La/fet;->U(IZ)Z

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    if-eqz v2, :cond_f

    .line 481
    .line 482
    iget-object v0, v0, La/qda;->a:La/j83;

    .line 483
    .line 484
    shr-int/2addr v1, v3

    .line 485
    and-int/lit8 v1, v1, 0xe

    .line 486
    .line 487
    invoke-static {v8, v0, v9, v1}, La/knx;->m(La/mm40;La/j83;La/fet;I)V

    .line 488
    .line 489
    .line 490
    goto :goto_9

    .line 491
    :cond_f
    invoke-virtual {v9}, La/fet;->X()V

    .line 492
    .line 493
    .line 494
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 495
    .line 496
    return-object v0

    .line 497
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
