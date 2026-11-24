.class public final synthetic La/c61;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p3w;


# direct methods
.method public synthetic constructor <init>(La/p3w;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c61;->a:B

    iput-object p1, p0, La/c61;->b:La/p3w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/c61;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "index"

    .line 7
    .line 8
    const/high16 v4, 0x41000000    # 8.0f

    .line 9
    .line 10
    const/high16 v5, 0x40800000    # 4.0f

    .line 11
    .line 12
    const/16 v6, 0xe

    .line 13
    .line 14
    sget-object v7, La/jm40;->b:La/jm40;

    .line 15
    .line 16
    const/4 v8, 0x2

    .line 17
    iget-object v0, v0, La/c61;->b:La/p3w;

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x1

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/fet;

    .line 27
    .line 28
    move-object/from16 v2, p2

    .line 29
    .line 30
    check-cast v2, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    and-int/lit8 v3, v2, 0x3

    .line 37
    .line 38
    if-eq v3, v8, :cond_0

    .line 39
    .line 40
    move v9, v10

    .line 41
    :cond_0
    and-int/2addr v2, v10

    .line 42
    invoke-virtual {v1, v2, v9}, La/fet;->U(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    sget-object v2, La/qmk;->a:La/zcl;

    .line 49
    .line 50
    new-instance v12, La/qw3;

    .line 51
    .line 52
    new-instance v2, La/jf4;

    .line 53
    .line 54
    invoke-direct {v2, v6}, La/jf4;-><init>(B)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v12, v5, v10, v2}, La/qw3;-><init>(FZLa/rw3;)V

    .line 58
    .line 59
    .line 60
    new-instance v13, La/qw3;

    .line 61
    .line 62
    new-instance v2, La/jf4;

    .line 63
    .line 64
    invoke-direct {v2, v6}, La/jf4;-><init>(B)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v13, v5, v10, v2}, La/qw3;-><init>(FZLa/rw3;)V

    .line 68
    .line 69
    .line 70
    new-instance v2, La/ocd;

    .line 71
    .line 72
    invoke-direct {v2, v0, v10}, La/ocd;-><init>(La/p3w;B)V

    .line 73
    .line 74
    .line 75
    const v0, 0x705a386d

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 79
    .line 80
    .line 81
    move-result-object v17

    .line 82
    const v19, 0x180006

    .line 83
    .line 84
    .line 85
    const/16 v20, 0x38

    .line 86
    .line 87
    sget-object v11, La/jm40;->b:La/jm40;

    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/4 v15, 0x0

    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    move-object/from16 v18, v1

    .line 94
    .line 95
    invoke-static/range {v11 .. v20}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    move-object/from16 v18, v1

    .line 100
    .line 101
    invoke-virtual/range {v18 .. v18}, La/fet;->X()V

    .line 102
    .line 103
    .line 104
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_0
    move-object/from16 v1, p1

    .line 108
    .line 109
    check-cast v1, La/fet;

    .line 110
    .line 111
    move-object/from16 v2, p2

    .line 112
    .line 113
    check-cast v2, Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    and-int/lit8 v3, v2, 0x3

    .line 120
    .line 121
    if-eq v3, v8, :cond_2

    .line 122
    .line 123
    move v3, v10

    .line 124
    goto :goto_1

    .line 125
    :cond_2
    move v3, v9

    .line 126
    :goto_1
    and-int/2addr v2, v10

    .line 127
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_4

    .line 132
    .line 133
    sget-object v2, La/gqw0;->e:La/zx7;

    .line 134
    .line 135
    sget-object v3, La/qmk;->a:La/zcl;

    .line 136
    .line 137
    const/high16 v3, 0x42100000    # 36.0f

    .line 138
    .line 139
    invoke-static {v7, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    const/4 v5, 0x0

    .line 144
    const/high16 v6, 0x43280000    # 168.0f

    .line 145
    .line 146
    invoke-static {v3, v5, v6, v10}, La/o7k0;->u(La/mm40;FFI)La/mm40;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 151
    .line 152
    invoke-virtual {v1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 157
    .line 158
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 159
    .line 160
    .line 161
    move-result-wide v5

    .line 162
    sget-object v8, La/qmk;->i:La/zcl;

    .line 163
    .line 164
    sget-object v11, La/vgg0;->a:La/ugg0;

    .line 165
    .line 166
    new-instance v11, La/ugg0;

    .line 167
    .line 168
    invoke-direct {v11, v8, v8, v8, v8}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v3, v5, v6, v11}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    const-string v5, "COEFFICIENT_INFO_ID"

    .line 176
    .line 177
    invoke-static {v3, v5}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-static {v2, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    iget-wide v5, v1, La/fet;->T:J

    .line 186
    .line 187
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-static {v1, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 200
    .line 201
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, La/fet;->i0()V

    .line 205
    .line 206
    .line 207
    iget-boolean v8, v1, La/fet;->S:Z

    .line 208
    .line 209
    if-eqz v8, :cond_3

    .line 210
    .line 211
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 212
    .line 213
    invoke-virtual {v1, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_3
    invoke-virtual {v1}, La/fet;->r0()V

    .line 218
    .line 219
    .line 220
    :goto_2
    sget-object v8, La/gqw0;->x:La/shd;

    .line 221
    .line 222
    invoke-static {v1, v2, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 223
    .line 224
    .line 225
    sget-object v2, La/gqw0;->w:La/shd;

    .line 226
    .line 227
    invoke-static {v1, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    sget-object v5, La/gqw0;->y:La/shd;

    .line 235
    .line 236
    invoke-static {v1, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 237
    .line 238
    .line 239
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 240
    .line 241
    .line 242
    sget-object v2, La/gqw0;->v:La/shd;

    .line 243
    .line 244
    invoke-static {v1, v3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v7, v4}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    const-string v3, "CoefficientInfoTestTag"

    .line 252
    .line 253
    invoke-static {v2, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    iget-object v11, v0, La/p3w;->t:Ljava/lang/String;

    .line 258
    .line 259
    sget-wide v3, La/qmk;->p:J

    .line 260
    .line 261
    sget-wide v16, La/qmk;->s:J

    .line 262
    .line 263
    sget-wide v7, La/qmk;->n:J

    .line 264
    .line 265
    new-instance v2, La/n05;

    .line 266
    .line 267
    move-wide/from16 v5, v16

    .line 268
    .line 269
    invoke-direct/range {v2 .. v8}, La/n05;-><init>(JJJ)V

    .line 270
    .line 271
    .line 272
    sget-object v19, La/j1t0;->b:La/qrq;

    .line 273
    .line 274
    sget-wide v25, La/qmk;->G:J

    .line 275
    .line 276
    new-instance v13, La/y9q0;

    .line 277
    .line 278
    const/16 v24, 0x0

    .line 279
    .line 280
    const v27, 0xfdffdd

    .line 281
    .line 282
    .line 283
    const-wide/16 v14, 0x0

    .line 284
    .line 285
    const/16 v18, 0x0

    .line 286
    .line 287
    const-wide/16 v20, 0x0

    .line 288
    .line 289
    const/16 v22, 0x0

    .line 290
    .line 291
    const/16 v23, 0x0

    .line 292
    .line 293
    invoke-direct/range {v13 .. v27}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 294
    .line 295
    .line 296
    invoke-static {v13, v1}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 297
    .line 298
    .line 299
    move-result-object v13

    .line 300
    const v22, 0x186000

    .line 301
    .line 302
    .line 303
    const/16 v23, 0x1a8

    .line 304
    .line 305
    const/4 v14, 0x0

    .line 306
    const/4 v15, 0x2

    .line 307
    const/16 v16, 0x0

    .line 308
    .line 309
    const/16 v17, 0x1

    .line 310
    .line 311
    const/16 v18, 0x0

    .line 312
    .line 313
    const/16 v19, 0x0

    .line 314
    .line 315
    move-object/from16 v21, v1

    .line 316
    .line 317
    move-object/from16 v20, v2

    .line 318
    .line 319
    invoke-static/range {v11 .. v23}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 320
    .line 321
    .line 322
    move-object/from16 v0, v21

    .line 323
    .line 324
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 325
    .line 326
    .line 327
    goto :goto_3

    .line 328
    :cond_4
    move-object v0, v1

    .line 329
    invoke-virtual {v0}, La/fet;->X()V

    .line 330
    .line 331
    .line 332
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    return-object v0

    .line 335
    :pswitch_1
    move-object/from16 v1, p1

    .line 336
    .line 337
    check-cast v1, La/fet;

    .line 338
    .line 339
    move-object/from16 v2, p2

    .line 340
    .line 341
    check-cast v2, Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    and-int/lit8 v3, v2, 0x3

    .line 348
    .line 349
    if-eq v3, v8, :cond_5

    .line 350
    .line 351
    move v9, v10

    .line 352
    :cond_5
    and-int/2addr v2, v10

    .line 353
    invoke-virtual {v1, v2, v9}, La/fet;->U(IZ)Z

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    if-eqz v2, :cond_6

    .line 358
    .line 359
    const-string v2, "SUB_MARKET_INFO_ID"

    .line 360
    .line 361
    invoke-static {v7, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    iget-object v0, v0, La/p3w;->v:Ljava/lang/String;

    .line 366
    .line 367
    sget-object v9, La/j1t0;->c:La/qrq;

    .line 368
    .line 369
    sget-wide v6, La/qmk;->r:J

    .line 370
    .line 371
    sget-wide v15, La/qmk;->F:J

    .line 372
    .line 373
    new-instance v3, La/y9q0;

    .line 374
    .line 375
    const/4 v14, 0x0

    .line 376
    const v17, 0xfdffdd

    .line 377
    .line 378
    .line 379
    const-wide/16 v4, 0x0

    .line 380
    .line 381
    const/4 v8, 0x0

    .line 382
    const-wide/16 v10, 0x0

    .line 383
    .line 384
    const/4 v12, 0x0

    .line 385
    const/4 v13, 0x0

    .line 386
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 387
    .line 388
    .line 389
    invoke-static {v3, v1}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 390
    .line 391
    .line 392
    move-result-object v21

    .line 393
    const/16 v24, 0x0

    .line 394
    .line 395
    const v25, 0x1fffc

    .line 396
    .line 397
    .line 398
    const-wide/16 v3, 0x0

    .line 399
    .line 400
    const/4 v5, 0x0

    .line 401
    const-wide/16 v6, 0x0

    .line 402
    .line 403
    const/4 v9, 0x0

    .line 404
    const/4 v10, 0x0

    .line 405
    const-wide/16 v11, 0x0

    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const-wide/16 v14, 0x0

    .line 409
    .line 410
    const/16 v16, 0x0

    .line 411
    .line 412
    const/16 v17, 0x0

    .line 413
    .line 414
    const/16 v18, 0x0

    .line 415
    .line 416
    const/16 v19, 0x0

    .line 417
    .line 418
    const/16 v20, 0x0

    .line 419
    .line 420
    const/16 v23, 0x30

    .line 421
    .line 422
    move-object/from16 v22, v1

    .line 423
    .line 424
    move-object v1, v0

    .line 425
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 426
    .line 427
    .line 428
    goto :goto_4

    .line 429
    :cond_6
    move-object/from16 v22, v1

    .line 430
    .line 431
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 432
    .line 433
    .line 434
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object v0

    .line 437
    :pswitch_2
    move-object/from16 v1, p1

    .line 438
    .line 439
    check-cast v1, La/fet;

    .line 440
    .line 441
    move-object/from16 v2, p2

    .line 442
    .line 443
    check-cast v2, Ljava/lang/Integer;

    .line 444
    .line 445
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 446
    .line 447
    .line 448
    move-result v2

    .line 449
    and-int/lit8 v3, v2, 0x3

    .line 450
    .line 451
    if-eq v3, v8, :cond_7

    .line 452
    .line 453
    move v9, v10

    .line 454
    :cond_7
    and-int/2addr v2, v10

    .line 455
    invoke-virtual {v1, v2, v9}, La/fet;->U(IZ)Z

    .line 456
    .line 457
    .line 458
    move-result v2

    .line 459
    if-eqz v2, :cond_8

    .line 460
    .line 461
    const-string v2, "MARKET_INFO_ID"

    .line 462
    .line 463
    invoke-static {v7, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 464
    .line 465
    .line 466
    move-result-object v8

    .line 467
    sget-object v2, La/qmk;->a:La/zcl;

    .line 468
    .line 469
    const/high16 v12, 0x40000000    # 2.0f

    .line 470
    .line 471
    const/4 v13, 0x7

    .line 472
    const/4 v9, 0x0

    .line 473
    const/4 v10, 0x0

    .line 474
    const/4 v11, 0x0

    .line 475
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    iget-object v0, v0, La/p3w;->u:Ljava/lang/String;

    .line 480
    .line 481
    sget-object v9, La/j1t0;->b:La/qrq;

    .line 482
    .line 483
    sget-wide v6, La/qmk;->r:J

    .line 484
    .line 485
    sget-wide v15, La/qmk;->F:J

    .line 486
    .line 487
    new-instance v3, La/y9q0;

    .line 488
    .line 489
    const/4 v14, 0x0

    .line 490
    const v17, 0xfdffdd

    .line 491
    .line 492
    .line 493
    const-wide/16 v4, 0x0

    .line 494
    .line 495
    const/4 v8, 0x0

    .line 496
    const-wide/16 v10, 0x0

    .line 497
    .line 498
    const/4 v12, 0x0

    .line 499
    const/4 v13, 0x0

    .line 500
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 501
    .line 502
    .line 503
    invoke-static {v3, v1}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 504
    .line 505
    .line 506
    move-result-object v21

    .line 507
    const/16 v24, 0x0

    .line 508
    .line 509
    const v25, 0x1fffc

    .line 510
    .line 511
    .line 512
    const-wide/16 v3, 0x0

    .line 513
    .line 514
    const/4 v5, 0x0

    .line 515
    const-wide/16 v6, 0x0

    .line 516
    .line 517
    const/4 v9, 0x0

    .line 518
    const/4 v10, 0x0

    .line 519
    const-wide/16 v11, 0x0

    .line 520
    .line 521
    const/4 v13, 0x0

    .line 522
    const-wide/16 v14, 0x0

    .line 523
    .line 524
    const/16 v16, 0x0

    .line 525
    .line 526
    const/16 v17, 0x0

    .line 527
    .line 528
    const/16 v18, 0x0

    .line 529
    .line 530
    const/16 v19, 0x0

    .line 531
    .line 532
    const/16 v20, 0x0

    .line 533
    .line 534
    const/16 v23, 0x0

    .line 535
    .line 536
    move-object/from16 v22, v1

    .line 537
    .line 538
    move-object v1, v0

    .line 539
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 540
    .line 541
    .line 542
    goto :goto_5

    .line 543
    :cond_8
    move-object/from16 v22, v1

    .line 544
    .line 545
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 546
    .line 547
    .line 548
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 549
    .line 550
    return-object v0

    .line 551
    :pswitch_3
    move-object/from16 v1, p1

    .line 552
    .line 553
    check-cast v1, La/fet;

    .line 554
    .line 555
    move-object/from16 v2, p2

    .line 556
    .line 557
    check-cast v2, Ljava/lang/Integer;

    .line 558
    .line 559
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 560
    .line 561
    .line 562
    move-result v2

    .line 563
    and-int/lit8 v3, v2, 0x3

    .line 564
    .line 565
    if-eq v3, v8, :cond_9

    .line 566
    .line 567
    move v9, v10

    .line 568
    :cond_9
    and-int/2addr v2, v10

    .line 569
    invoke-virtual {v1, v2, v9}, La/fet;->U(IZ)Z

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    if-eqz v2, :cond_a

    .line 574
    .line 575
    const-string v2, "EVENT_DESCRIPTION_ID"

    .line 576
    .line 577
    invoke-static {v7, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 578
    .line 579
    .line 580
    move-result-object v8

    .line 581
    sget-object v2, La/qmk;->a:La/zcl;

    .line 582
    .line 583
    const/high16 v12, 0x40000000    # 2.0f

    .line 584
    .line 585
    const/4 v13, 0x7

    .line 586
    const/4 v9, 0x0

    .line 587
    const/4 v10, 0x0

    .line 588
    const/4 v11, 0x0

    .line 589
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    const-string v3, "EventDescriptionTestTag"

    .line 594
    .line 595
    invoke-static {v2, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    iget-object v0, v0, La/p3w;->s:Ljava/lang/String;

    .line 600
    .line 601
    sget-object v9, La/j1t0;->c:La/qrq;

    .line 602
    .line 603
    sget-wide v6, La/qmk;->r:J

    .line 604
    .line 605
    sget-wide v15, La/qmk;->F:J

    .line 606
    .line 607
    new-instance v3, La/y9q0;

    .line 608
    .line 609
    const/4 v14, 0x0

    .line 610
    const v17, 0xfdffdd

    .line 611
    .line 612
    .line 613
    const-wide/16 v4, 0x0

    .line 614
    .line 615
    const/4 v8, 0x0

    .line 616
    const-wide/16 v10, 0x0

    .line 617
    .line 618
    const/4 v12, 0x0

    .line 619
    const/4 v13, 0x0

    .line 620
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 621
    .line 622
    .line 623
    invoke-static {v3, v1}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 624
    .line 625
    .line 626
    move-result-object v21

    .line 627
    const/16 v24, 0x0

    .line 628
    .line 629
    const v25, 0x1fffc

    .line 630
    .line 631
    .line 632
    const-wide/16 v3, 0x0

    .line 633
    .line 634
    const/4 v5, 0x0

    .line 635
    const-wide/16 v6, 0x0

    .line 636
    .line 637
    const/4 v9, 0x0

    .line 638
    const/4 v10, 0x0

    .line 639
    const-wide/16 v11, 0x0

    .line 640
    .line 641
    const/4 v13, 0x0

    .line 642
    const-wide/16 v14, 0x0

    .line 643
    .line 644
    const/16 v16, 0x0

    .line 645
    .line 646
    const/16 v17, 0x0

    .line 647
    .line 648
    const/16 v18, 0x0

    .line 649
    .line 650
    const/16 v19, 0x0

    .line 651
    .line 652
    const/16 v20, 0x0

    .line 653
    .line 654
    const/16 v23, 0x0

    .line 655
    .line 656
    move-object/from16 v22, v1

    .line 657
    .line 658
    move-object v1, v0

    .line 659
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 660
    .line 661
    .line 662
    goto :goto_6

    .line 663
    :cond_a
    move-object/from16 v22, v1

    .line 664
    .line 665
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 666
    .line 667
    .line 668
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 669
    .line 670
    return-object v0

    .line 671
    :pswitch_4
    move-object/from16 v1, p1

    .line 672
    .line 673
    check-cast v1, La/fet;

    .line 674
    .line 675
    move-object/from16 v2, p2

    .line 676
    .line 677
    check-cast v2, Ljava/lang/Integer;

    .line 678
    .line 679
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 680
    .line 681
    .line 682
    move-result v2

    .line 683
    and-int/lit8 v3, v2, 0x3

    .line 684
    .line 685
    if-eq v3, v8, :cond_b

    .line 686
    .line 687
    move v3, v10

    .line 688
    goto :goto_7

    .line 689
    :cond_b
    move v3, v9

    .line 690
    :goto_7
    and-int/2addr v2, v10

    .line 691
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 692
    .line 693
    .line 694
    move-result v2

    .line 695
    if-eqz v2, :cond_c

    .line 696
    .line 697
    const/high16 v2, 0x3f800000    # 1.0f

    .line 698
    .line 699
    invoke-static {v7, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 700
    .line 701
    .line 702
    move-result-object v10

    .line 703
    sget-object v2, La/qmk;->a:La/zcl;

    .line 704
    .line 705
    const/4 v12, 0x0

    .line 706
    const/4 v15, 0x2

    .line 707
    const/high16 v11, 0x41400000    # 12.0f

    .line 708
    .line 709
    const/high16 v13, 0x41400000    # 12.0f

    .line 710
    .line 711
    const/high16 v14, 0x41000000    # 8.0f

    .line 712
    .line 713
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    invoke-static {v2, v0, v1, v9}, La/m0x0;->b(La/mm40;La/p3w;La/fet;I)V

    .line 718
    .line 719
    .line 720
    goto :goto_8

    .line 721
    :cond_c
    invoke-virtual {v1}, La/fet;->X()V

    .line 722
    .line 723
    .line 724
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 725
    .line 726
    return-object v0

    .line 727
    :pswitch_5
    move-object/from16 v1, p1

    .line 728
    .line 729
    check-cast v1, La/fet;

    .line 730
    .line 731
    move-object/from16 v2, p2

    .line 732
    .line 733
    check-cast v2, Ljava/lang/Integer;

    .line 734
    .line 735
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    and-int/lit8 v3, v2, 0x3

    .line 740
    .line 741
    if-eq v3, v8, :cond_d

    .line 742
    .line 743
    move v3, v10

    .line 744
    goto :goto_9

    .line 745
    :cond_d
    move v3, v9

    .line 746
    :goto_9
    and-int/2addr v2, v10

    .line 747
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 748
    .line 749
    .line 750
    move-result v2

    .line 751
    if-eqz v2, :cond_e

    .line 752
    .line 753
    sget-object v2, La/qmk;->a:La/zcl;

    .line 754
    .line 755
    const/high16 v2, 0x41400000    # 12.0f

    .line 756
    .line 757
    invoke-static {v7, v2, v5, v2, v4}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    invoke-static {v2, v0, v1, v9}, La/r8x;->n(La/mm40;La/p3w;La/fet;I)V

    .line 762
    .line 763
    .line 764
    goto :goto_a

    .line 765
    :cond_e
    invoke-virtual {v1}, La/fet;->X()V

    .line 766
    .line 767
    .line 768
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 769
    .line 770
    return-object v0

    .line 771
    :pswitch_6
    move-object/from16 v1, p1

    .line 772
    .line 773
    check-cast v1, La/fet;

    .line 774
    .line 775
    move-object/from16 v4, p2

    .line 776
    .line 777
    check-cast v4, Ljava/lang/Integer;

    .line 778
    .line 779
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 780
    .line 781
    .line 782
    move-result v4

    .line 783
    and-int/lit8 v5, v4, 0x3

    .line 784
    .line 785
    if-eq v5, v8, :cond_f

    .line 786
    .line 787
    move v5, v10

    .line 788
    goto :goto_b

    .line 789
    :cond_f
    move v5, v9

    .line 790
    :goto_b
    and-int/2addr v4, v10

    .line 791
    invoke-virtual {v1, v4, v5}, La/fet;->U(IZ)Z

    .line 792
    .line 793
    .line 794
    move-result v4

    .line 795
    if-eqz v4, :cond_19

    .line 796
    .line 797
    iget-object v4, v0, La/p3w;->g:La/a4x;

    .line 798
    .line 799
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 800
    .line 801
    .line 802
    move-result-object v4

    .line 803
    move v5, v9

    .line 804
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 805
    .line 806
    .line 807
    move-result v6

    .line 808
    if-eqz v6, :cond_1a

    .line 809
    .line 810
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v6

    .line 814
    add-int/lit8 v7, v5, 0x1

    .line 815
    .line 816
    if-ltz v5, :cond_18

    .line 817
    .line 818
    check-cast v6, La/h3w;

    .line 819
    .line 820
    iget-object v8, v0, La/p3w;->b:Ljava/lang/String;

    .line 821
    .line 822
    new-instance v10, Ljava/lang/StringBuilder;

    .line 823
    .line 824
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 831
    .line 832
    .line 833
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 834
    .line 835
    .line 836
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v5

    .line 840
    const v8, -0x1a5fa8a5

    .line 841
    .line 842
    .line 843
    invoke-virtual {v1, v8, v5}, La/fet;->b0(ILjava/lang/Object;)V

    .line 844
    .line 845
    .line 846
    if-nez v6, :cond_10

    .line 847
    .line 848
    goto/16 :goto_d

    .line 849
    .line 850
    :cond_10
    instance-of v5, v6, La/f3w;

    .line 851
    .line 852
    sget-object v10, La/jm40;->b:La/jm40;

    .line 853
    .line 854
    if-eqz v5, :cond_11

    .line 855
    .line 856
    const v5, -0x3194bcdf    # -9.867613E8f

    .line 857
    .line 858
    .line 859
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 860
    .line 861
    .line 862
    sget-object v5, La/qmk;->a:La/zcl;

    .line 863
    .line 864
    const/4 v12, 0x0

    .line 865
    const/4 v15, 0x2

    .line 866
    const/high16 v11, 0x41400000    # 12.0f

    .line 867
    .line 868
    const/high16 v13, 0x41400000    # 12.0f

    .line 869
    .line 870
    const/high16 v14, 0x40c00000    # 6.0f

    .line 871
    .line 872
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 873
    .line 874
    .line 875
    move-result-object v5

    .line 876
    const-string v8, "AMOUNT_TEXT_LARGE_HISTORY_CARD"

    .line 877
    .line 878
    invoke-static {v5, v8}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 879
    .line 880
    .line 881
    move-result-object v5

    .line 882
    check-cast v6, La/f3w;

    .line 883
    .line 884
    invoke-static {v5, v6, v1, v9}, La/hp4;->c(La/mm40;La/f3w;La/fet;I)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 888
    .line 889
    .line 890
    goto/16 :goto_e

    .line 891
    .line 892
    :cond_11
    instance-of v5, v6, La/m3w;

    .line 893
    .line 894
    if-eqz v5, :cond_12

    .line 895
    .line 896
    const v5, -0x318b6355

    .line 897
    .line 898
    .line 899
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 900
    .line 901
    .line 902
    sget-object v5, La/qmk;->a:La/zcl;

    .line 903
    .line 904
    const/4 v12, 0x0

    .line 905
    const/4 v15, 0x2

    .line 906
    const/high16 v11, 0x41400000    # 12.0f

    .line 907
    .line 908
    const/high16 v13, 0x41400000    # 12.0f

    .line 909
    .line 910
    const/high16 v14, 0x40c00000    # 6.0f

    .line 911
    .line 912
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 913
    .line 914
    .line 915
    move-result-object v5

    .line 916
    check-cast v6, La/m3w;

    .line 917
    .line 918
    invoke-static {v5, v6, v1, v9}, La/xdx;->c(La/mm40;La/m3w;La/fet;I)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 922
    .line 923
    .line 924
    goto/16 :goto_e

    .line 925
    .line 926
    :cond_12
    instance-of v5, v6, La/i3w;

    .line 927
    .line 928
    if-eqz v5, :cond_13

    .line 929
    .line 930
    const v5, -0x3182a357

    .line 931
    .line 932
    .line 933
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 934
    .line 935
    .line 936
    sget-object v5, La/qmk;->a:La/zcl;

    .line 937
    .line 938
    const/4 v12, 0x0

    .line 939
    const/4 v15, 0x2

    .line 940
    const/high16 v11, 0x41400000    # 12.0f

    .line 941
    .line 942
    const/high16 v13, 0x41400000    # 12.0f

    .line 943
    .line 944
    const/high16 v14, 0x40c00000    # 6.0f

    .line 945
    .line 946
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 947
    .line 948
    .line 949
    move-result-object v5

    .line 950
    check-cast v6, La/i3w;

    .line 951
    .line 952
    invoke-static {v5, v6, v1, v9}, La/vfc;->u(La/mm40;La/i3w;La/fet;I)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 956
    .line 957
    .line 958
    goto/16 :goto_e

    .line 959
    .line 960
    :cond_13
    instance-of v5, v6, La/j3w;

    .line 961
    .line 962
    if-eqz v5, :cond_14

    .line 963
    .line 964
    const v5, -0x3179ba6b

    .line 965
    .line 966
    .line 967
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 968
    .line 969
    .line 970
    sget-object v5, La/qmk;->a:La/zcl;

    .line 971
    .line 972
    const/4 v12, 0x0

    .line 973
    const/4 v15, 0x2

    .line 974
    const/high16 v11, 0x41400000    # 12.0f

    .line 975
    .line 976
    const/high16 v13, 0x41400000    # 12.0f

    .line 977
    .line 978
    const/high16 v14, 0x40c00000    # 6.0f

    .line 979
    .line 980
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 981
    .line 982
    .line 983
    move-result-object v5

    .line 984
    check-cast v6, La/j3w;

    .line 985
    .line 986
    invoke-static {v5, v6, v1, v9}, La/hkb;->p(La/mm40;La/j3w;La/fet;I)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 990
    .line 991
    .line 992
    goto :goto_e

    .line 993
    :cond_14
    instance-of v5, v6, La/k3w;

    .line 994
    .line 995
    if-eqz v5, :cond_15

    .line 996
    .line 997
    const v5, -0x31708a89

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 1001
    .line 1002
    .line 1003
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1004
    .line 1005
    const/4 v12, 0x0

    .line 1006
    const/4 v15, 0x2

    .line 1007
    const/high16 v11, 0x41400000    # 12.0f

    .line 1008
    .line 1009
    const/high16 v13, 0x41400000    # 12.0f

    .line 1010
    .line 1011
    const/high16 v14, 0x40c00000    # 6.0f

    .line 1012
    .line 1013
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v5

    .line 1017
    check-cast v6, La/k3w;

    .line 1018
    .line 1019
    invoke-static {v5, v6, v1, v9}, La/vic;->l(La/mm40;La/k3w;La/fet;I)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 1023
    .line 1024
    .line 1025
    goto :goto_e

    .line 1026
    :cond_15
    instance-of v5, v6, La/o3w;

    .line 1027
    .line 1028
    if-eqz v5, :cond_16

    .line 1029
    .line 1030
    const v5, -0x31678c0f

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 1034
    .line 1035
    .line 1036
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1037
    .line 1038
    const/4 v12, 0x0

    .line 1039
    const/4 v15, 0x2

    .line 1040
    const/high16 v11, 0x40800000    # 4.0f

    .line 1041
    .line 1042
    const/high16 v13, 0x40800000    # 4.0f

    .line 1043
    .line 1044
    const/high16 v14, 0x40c00000    # 6.0f

    .line 1045
    .line 1046
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v5

    .line 1050
    check-cast v6, La/o3w;

    .line 1051
    .line 1052
    invoke-static {v5, v6, v1, v9}, La/zsm0;->b(La/mm40;La/o3w;La/fet;I)V

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 1056
    .line 1057
    .line 1058
    goto :goto_e

    .line 1059
    :cond_16
    instance-of v5, v6, La/l3w;

    .line 1060
    .line 1061
    if-eqz v5, :cond_17

    .line 1062
    .line 1063
    const v5, -0x315ee639

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 1067
    .line 1068
    .line 1069
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1070
    .line 1071
    const/4 v12, 0x0

    .line 1072
    const/4 v15, 0x2

    .line 1073
    const/high16 v11, 0x41400000    # 12.0f

    .line 1074
    .line 1075
    const/high16 v13, 0x41400000    # 12.0f

    .line 1076
    .line 1077
    const/high16 v14, 0x40c00000    # 6.0f

    .line 1078
    .line 1079
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v5

    .line 1083
    check-cast v6, La/l3w;

    .line 1084
    .line 1085
    invoke-static {v5, v6, v1, v9, v9}, La/h8x;->f(La/mm40;La/l3w;La/fet;II)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 1089
    .line 1090
    .line 1091
    goto :goto_e

    .line 1092
    :cond_17
    :goto_d
    const v5, -0x3156e877

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 1099
    .line 1100
    .line 1101
    :goto_e
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 1102
    .line 1103
    .line 1104
    move v5, v7

    .line 1105
    goto/16 :goto_c

    .line 1106
    .line 1107
    :cond_18
    invoke-static {}, La/q3d;->p()V

    .line 1108
    .line 1109
    .line 1110
    throw v2

    .line 1111
    :cond_19
    invoke-virtual {v1}, La/fet;->X()V

    .line 1112
    .line 1113
    .line 1114
    :cond_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1115
    .line 1116
    return-object v0

    .line 1117
    :pswitch_7
    move-object/from16 v1, p1

    .line 1118
    .line 1119
    check-cast v1, La/fet;

    .line 1120
    .line 1121
    move-object/from16 v2, p2

    .line 1122
    .line 1123
    check-cast v2, Ljava/lang/Integer;

    .line 1124
    .line 1125
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1126
    .line 1127
    .line 1128
    move-result v2

    .line 1129
    and-int/lit8 v3, v2, 0x3

    .line 1130
    .line 1131
    if-eq v3, v8, :cond_1b

    .line 1132
    .line 1133
    move v3, v10

    .line 1134
    goto :goto_f

    .line 1135
    :cond_1b
    move v3, v9

    .line 1136
    :goto_f
    and-int/2addr v2, v10

    .line 1137
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v2

    .line 1141
    if-eqz v2, :cond_1c

    .line 1142
    .line 1143
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1144
    .line 1145
    const/4 v15, 0x0

    .line 1146
    const/16 v16, 0xd

    .line 1147
    .line 1148
    sget-object v11, La/jm40;->b:La/jm40;

    .line 1149
    .line 1150
    const/4 v12, 0x0

    .line 1151
    const/high16 v13, 0x40000000    # 2.0f

    .line 1152
    .line 1153
    const/4 v14, 0x0

    .line 1154
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v2

    .line 1158
    move-object v3, v2

    .line 1159
    new-instance v2, La/qw3;

    .line 1160
    .line 1161
    new-instance v4, La/jf4;

    .line 1162
    .line 1163
    invoke-direct {v4, v6}, La/jf4;-><init>(B)V

    .line 1164
    .line 1165
    .line 1166
    invoke-direct {v2, v5, v10, v4}, La/qw3;-><init>(FZLa/rw3;)V

    .line 1167
    .line 1168
    .line 1169
    move-object v4, v3

    .line 1170
    new-instance v3, La/qw3;

    .line 1171
    .line 1172
    new-instance v7, La/jf4;

    .line 1173
    .line 1174
    invoke-direct {v7, v6}, La/jf4;-><init>(B)V

    .line 1175
    .line 1176
    .line 1177
    invoke-direct {v3, v5, v10, v7}, La/qw3;-><init>(FZLa/rw3;)V

    .line 1178
    .line 1179
    .line 1180
    move-object v5, v4

    .line 1181
    sget-object v4, La/gqw0;->k:La/yx7;

    .line 1182
    .line 1183
    new-instance v6, La/ocd;

    .line 1184
    .line 1185
    invoke-direct {v6, v0, v9}, La/ocd;-><init>(La/p3w;B)V

    .line 1186
    .line 1187
    .line 1188
    const v0, 0xf850816

    .line 1189
    .line 1190
    .line 1191
    invoke-static {v0, v6, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v7

    .line 1195
    const v9, 0x180c00

    .line 1196
    .line 1197
    .line 1198
    const/16 v10, 0x30

    .line 1199
    .line 1200
    move-object v8, v1

    .line 1201
    move-object v1, v5

    .line 1202
    const/4 v5, 0x0

    .line 1203
    const/4 v6, 0x0

    .line 1204
    invoke-static/range {v1 .. v10}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 1205
    .line 1206
    .line 1207
    goto :goto_10

    .line 1208
    :cond_1c
    move-object v8, v1

    .line 1209
    invoke-virtual {v8}, La/fet;->X()V

    .line 1210
    .line 1211
    .line 1212
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1213
    .line 1214
    return-object v0

    .line 1215
    :pswitch_8
    move-object/from16 v1, p1

    .line 1216
    .line 1217
    check-cast v1, La/fet;

    .line 1218
    .line 1219
    move-object/from16 v4, p2

    .line 1220
    .line 1221
    check-cast v4, Ljava/lang/Integer;

    .line 1222
    .line 1223
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1224
    .line 1225
    .line 1226
    move-result v4

    .line 1227
    and-int/lit8 v5, v4, 0x3

    .line 1228
    .line 1229
    if-eq v5, v8, :cond_1d

    .line 1230
    .line 1231
    move v5, v10

    .line 1232
    goto :goto_11

    .line 1233
    :cond_1d
    move v5, v9

    .line 1234
    :goto_11
    and-int/2addr v4, v10

    .line 1235
    invoke-virtual {v1, v4, v5}, La/fet;->U(IZ)Z

    .line 1236
    .line 1237
    .line 1238
    move-result v4

    .line 1239
    if-eqz v4, :cond_24

    .line 1240
    .line 1241
    iget-object v4, v0, La/p3w;->g:La/a4x;

    .line 1242
    .line 1243
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v4

    .line 1247
    move v5, v9

    .line 1248
    :goto_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1249
    .line 1250
    .line 1251
    move-result v6

    .line 1252
    if-eqz v6, :cond_25

    .line 1253
    .line 1254
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v6

    .line 1258
    add-int/lit8 v7, v5, 0x1

    .line 1259
    .line 1260
    if-ltz v5, :cond_23

    .line 1261
    .line 1262
    check-cast v6, La/h3w;

    .line 1263
    .line 1264
    iget-object v8, v0, La/p3w;->b:Ljava/lang/String;

    .line 1265
    .line 1266
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1267
    .line 1268
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v5

    .line 1284
    const v8, -0x279a9915

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v1, v8, v5}, La/fet;->b0(ILjava/lang/Object;)V

    .line 1288
    .line 1289
    .line 1290
    if-nez v6, :cond_1e

    .line 1291
    .line 1292
    goto/16 :goto_13

    .line 1293
    .line 1294
    :cond_1e
    instance-of v5, v6, La/g3w;

    .line 1295
    .line 1296
    sget-object v10, La/jm40;->b:La/jm40;

    .line 1297
    .line 1298
    if-eqz v5, :cond_1f

    .line 1299
    .line 1300
    const v5, 0x3448ebad

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 1304
    .line 1305
    .line 1306
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1307
    .line 1308
    const/4 v12, 0x0

    .line 1309
    const/4 v15, 0x2

    .line 1310
    const/high16 v11, 0x41400000    # 12.0f

    .line 1311
    .line 1312
    const/high16 v13, 0x41400000    # 12.0f

    .line 1313
    .line 1314
    const/high16 v14, 0x40800000    # 4.0f

    .line 1315
    .line 1316
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v5

    .line 1320
    const-string v8, "CompactCoefficientTextLargeHistoryCard"

    .line 1321
    .line 1322
    invoke-static {v5, v8}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v5

    .line 1326
    check-cast v6, La/g3w;

    .line 1327
    .line 1328
    invoke-static {v5, v6, v1, v9}, La/vdb;->k(La/mm40;La/g3w;La/fet;I)V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 1332
    .line 1333
    .line 1334
    goto :goto_14

    .line 1335
    :cond_1f
    instance-of v5, v6, La/f3w;

    .line 1336
    .line 1337
    if-eqz v5, :cond_20

    .line 1338
    .line 1339
    const v5, 0x34521698

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 1343
    .line 1344
    .line 1345
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1346
    .line 1347
    const/4 v12, 0x0

    .line 1348
    const/4 v15, 0x2

    .line 1349
    const/high16 v11, 0x41400000    # 12.0f

    .line 1350
    .line 1351
    const/high16 v13, 0x41400000    # 12.0f

    .line 1352
    .line 1353
    const/high16 v14, 0x40800000    # 4.0f

    .line 1354
    .line 1355
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v5

    .line 1359
    const-string v8, "COMPACT_AMOUNT_TEXT_LARGE_HISTORY_CARD"

    .line 1360
    .line 1361
    invoke-static {v5, v8}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v5

    .line 1365
    check-cast v6, La/f3w;

    .line 1366
    .line 1367
    invoke-static {v5, v6, v1, v9, v9}, La/jcb;->a(La/mm40;La/f3w;La/fet;II)V

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 1371
    .line 1372
    .line 1373
    goto :goto_14

    .line 1374
    :cond_20
    instance-of v5, v6, La/m3w;

    .line 1375
    .line 1376
    if-eqz v5, :cond_21

    .line 1377
    .line 1378
    const v5, 0x345b0e4a

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 1382
    .line 1383
    .line 1384
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1385
    .line 1386
    const/4 v12, 0x0

    .line 1387
    const/4 v15, 0x2

    .line 1388
    const/high16 v11, 0x41400000    # 12.0f

    .line 1389
    .line 1390
    const/high16 v13, 0x41400000    # 12.0f

    .line 1391
    .line 1392
    const/high16 v14, 0x40800000    # 4.0f

    .line 1393
    .line 1394
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v5

    .line 1398
    check-cast v6, La/m3w;

    .line 1399
    .line 1400
    invoke-static {v5, v6, v1, v9}, La/ahb;->c(La/mm40;La/m3w;La/fet;I)V

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 1404
    .line 1405
    .line 1406
    goto :goto_14

    .line 1407
    :cond_21
    instance-of v5, v6, La/o3w;

    .line 1408
    .line 1409
    if-eqz v5, :cond_22

    .line 1410
    .line 1411
    const v5, 0x346341d0

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 1415
    .line 1416
    .line 1417
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1418
    .line 1419
    const/4 v12, 0x0

    .line 1420
    const/4 v15, 0x2

    .line 1421
    const/high16 v11, 0x40800000    # 4.0f

    .line 1422
    .line 1423
    const/high16 v13, 0x40800000    # 4.0f

    .line 1424
    .line 1425
    const/high16 v14, 0x40800000    # 4.0f

    .line 1426
    .line 1427
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v5

    .line 1431
    check-cast v6, La/o3w;

    .line 1432
    .line 1433
    invoke-static {v5, v6, v1, v9}, La/tlb;->c(La/mm40;La/o3w;La/fet;I)V

    .line 1434
    .line 1435
    .line 1436
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 1437
    .line 1438
    .line 1439
    goto :goto_14

    .line 1440
    :cond_22
    :goto_13
    const v5, 0x346a9dab

    .line 1441
    .line 1442
    .line 1443
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 1444
    .line 1445
    .line 1446
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 1447
    .line 1448
    .line 1449
    :goto_14
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 1450
    .line 1451
    .line 1452
    move v5, v7

    .line 1453
    goto/16 :goto_12

    .line 1454
    .line 1455
    :cond_23
    invoke-static {}, La/q3d;->p()V

    .line 1456
    .line 1457
    .line 1458
    throw v2

    .line 1459
    :cond_24
    invoke-virtual {v1}, La/fet;->X()V

    .line 1460
    .line 1461
    .line 1462
    :cond_25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1463
    .line 1464
    return-object v0

    .line 1465
    :pswitch_9
    move-object/from16 v1, p1

    .line 1466
    .line 1467
    check-cast v1, La/fet;

    .line 1468
    .line 1469
    move-object/from16 v2, p2

    .line 1470
    .line 1471
    check-cast v2, Ljava/lang/Integer;

    .line 1472
    .line 1473
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1474
    .line 1475
    .line 1476
    move-result v2

    .line 1477
    and-int/lit8 v3, v2, 0x3

    .line 1478
    .line 1479
    if-eq v3, v8, :cond_26

    .line 1480
    .line 1481
    move v9, v10

    .line 1482
    :cond_26
    and-int/2addr v2, v10

    .line 1483
    invoke-virtual {v1, v2, v9}, La/fet;->U(IZ)Z

    .line 1484
    .line 1485
    .line 1486
    move-result v2

    .line 1487
    if-eqz v2, :cond_27

    .line 1488
    .line 1489
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1490
    .line 1491
    const/high16 v7, 0x40000000    # 2.0f

    .line 1492
    .line 1493
    const/4 v8, 0x7

    .line 1494
    sget-object v3, La/jm40;->b:La/jm40;

    .line 1495
    .line 1496
    const/4 v4, 0x0

    .line 1497
    const/4 v5, 0x0

    .line 1498
    const/4 v6, 0x0

    .line 1499
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v2

    .line 1503
    iget-object v0, v0, La/p3w;->s:Ljava/lang/String;

    .line 1504
    .line 1505
    sget-object v9, La/j1t0;->c:La/qrq;

    .line 1506
    .line 1507
    sget-wide v6, La/qmk;->r:J

    .line 1508
    .line 1509
    sget-wide v15, La/qmk;->F:J

    .line 1510
    .line 1511
    new-instance v3, La/y9q0;

    .line 1512
    .line 1513
    const/4 v14, 0x0

    .line 1514
    const v17, 0xfdffdd

    .line 1515
    .line 1516
    .line 1517
    const-wide/16 v4, 0x0

    .line 1518
    .line 1519
    const/4 v8, 0x0

    .line 1520
    const-wide/16 v10, 0x0

    .line 1521
    .line 1522
    const/4 v12, 0x0

    .line 1523
    const/4 v13, 0x0

    .line 1524
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 1525
    .line 1526
    .line 1527
    invoke-static {v3, v1}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v21

    .line 1531
    const/16 v24, 0x0

    .line 1532
    .line 1533
    const v25, 0x1fffc

    .line 1534
    .line 1535
    .line 1536
    const-wide/16 v3, 0x0

    .line 1537
    .line 1538
    const/4 v5, 0x0

    .line 1539
    const-wide/16 v6, 0x0

    .line 1540
    .line 1541
    const/4 v9, 0x0

    .line 1542
    const/4 v10, 0x0

    .line 1543
    const-wide/16 v11, 0x0

    .line 1544
    .line 1545
    const/4 v13, 0x0

    .line 1546
    const-wide/16 v14, 0x0

    .line 1547
    .line 1548
    const/16 v16, 0x0

    .line 1549
    .line 1550
    const/16 v17, 0x0

    .line 1551
    .line 1552
    const/16 v18, 0x0

    .line 1553
    .line 1554
    const/16 v19, 0x0

    .line 1555
    .line 1556
    const/16 v20, 0x0

    .line 1557
    .line 1558
    const/16 v23, 0x0

    .line 1559
    .line 1560
    move-object/from16 v22, v1

    .line 1561
    .line 1562
    move-object v1, v0

    .line 1563
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1564
    .line 1565
    .line 1566
    goto :goto_15

    .line 1567
    :cond_27
    move-object/from16 v22, v1

    .line 1568
    .line 1569
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 1570
    .line 1571
    .line 1572
    :goto_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1573
    .line 1574
    return-object v0

    .line 1575
    :pswitch_a
    move-object/from16 v1, p1

    .line 1576
    .line 1577
    check-cast v1, La/fet;

    .line 1578
    .line 1579
    move-object/from16 v2, p2

    .line 1580
    .line 1581
    check-cast v2, Ljava/lang/Integer;

    .line 1582
    .line 1583
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1584
    .line 1585
    .line 1586
    move-result v2

    .line 1587
    and-int/lit8 v3, v2, 0x3

    .line 1588
    .line 1589
    if-eq v3, v8, :cond_28

    .line 1590
    .line 1591
    move v9, v10

    .line 1592
    :cond_28
    and-int/2addr v2, v10

    .line 1593
    invoke-virtual {v1, v2, v9}, La/fet;->U(IZ)Z

    .line 1594
    .line 1595
    .line 1596
    move-result v2

    .line 1597
    if-eqz v2, :cond_29

    .line 1598
    .line 1599
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1600
    .line 1601
    const/high16 v7, 0x40000000    # 2.0f

    .line 1602
    .line 1603
    const/4 v8, 0x7

    .line 1604
    sget-object v3, La/jm40;->b:La/jm40;

    .line 1605
    .line 1606
    const/4 v4, 0x0

    .line 1607
    const/4 v5, 0x0

    .line 1608
    const/4 v6, 0x0

    .line 1609
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v2

    .line 1613
    iget-object v0, v0, La/p3w;->u:Ljava/lang/String;

    .line 1614
    .line 1615
    sget-object v9, La/j1t0;->b:La/qrq;

    .line 1616
    .line 1617
    sget-wide v6, La/qmk;->r:J

    .line 1618
    .line 1619
    sget-wide v15, La/qmk;->F:J

    .line 1620
    .line 1621
    new-instance v3, La/y9q0;

    .line 1622
    .line 1623
    const/4 v14, 0x0

    .line 1624
    const v17, 0xfdffdd

    .line 1625
    .line 1626
    .line 1627
    const-wide/16 v4, 0x0

    .line 1628
    .line 1629
    const/4 v8, 0x0

    .line 1630
    const-wide/16 v10, 0x0

    .line 1631
    .line 1632
    const/4 v12, 0x0

    .line 1633
    const/4 v13, 0x0

    .line 1634
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 1635
    .line 1636
    .line 1637
    invoke-static {v3, v1}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v21

    .line 1641
    const/16 v24, 0x0

    .line 1642
    .line 1643
    const v25, 0x1fffc

    .line 1644
    .line 1645
    .line 1646
    const-wide/16 v3, 0x0

    .line 1647
    .line 1648
    const/4 v5, 0x0

    .line 1649
    const-wide/16 v6, 0x0

    .line 1650
    .line 1651
    const/4 v9, 0x0

    .line 1652
    const/4 v10, 0x0

    .line 1653
    const-wide/16 v11, 0x0

    .line 1654
    .line 1655
    const/4 v13, 0x0

    .line 1656
    const-wide/16 v14, 0x0

    .line 1657
    .line 1658
    const/16 v16, 0x0

    .line 1659
    .line 1660
    const/16 v17, 0x0

    .line 1661
    .line 1662
    const/16 v18, 0x0

    .line 1663
    .line 1664
    const/16 v19, 0x0

    .line 1665
    .line 1666
    const/16 v20, 0x0

    .line 1667
    .line 1668
    const/16 v23, 0x0

    .line 1669
    .line 1670
    move-object/from16 v22, v1

    .line 1671
    .line 1672
    move-object v1, v0

    .line 1673
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1674
    .line 1675
    .line 1676
    goto :goto_16

    .line 1677
    :cond_29
    move-object/from16 v22, v1

    .line 1678
    .line 1679
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 1680
    .line 1681
    .line 1682
    :goto_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1683
    .line 1684
    return-object v0

    .line 1685
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
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
