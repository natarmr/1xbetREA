.class public final synthetic La/iio;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i3w;


# direct methods
.method public synthetic constructor <init>(La/i3w;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/iio;->a:B

    iput-object p1, p0, La/iio;->b:La/i3w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iio;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/iio;->b:La/i3w;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v15, p1

    .line 14
    .line 15
    check-cast v15, La/fet;

    .line 16
    .line 17
    move-object/from16 v1, p2

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    and-int/lit8 v5, v1, 0x3

    .line 26
    .line 27
    if-eq v5, v4, :cond_0

    .line 28
    .line 29
    move v4, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v4, v2

    .line 32
    :goto_0
    and-int/2addr v1, v3

    .line 33
    invoke-virtual {v15, v1, v4}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    const/high16 v1, 0x3f800000    # 1.0f

    .line 40
    .line 41
    float-to-double v3, v1

    .line 42
    const-wide/16 v5, 0x0

    .line 43
    .line 44
    cmpl-double v3, v3, v5

    .line 45
    .line 46
    if-lez v3, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string v3, "invalid weight; must be greater than zero"

    .line 50
    .line 51
    invoke-static {v3}, La/vcx;->a(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_1
    new-instance v6, La/x7z;

    .line 55
    .line 56
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 57
    .line 58
    .line 59
    cmpl-float v4, v1, v3

    .line 60
    .line 61
    if-lez v4, :cond_2

    .line 62
    .line 63
    move v1, v3

    .line 64
    :cond_2
    invoke-direct {v6, v1, v2}, La/x7z;-><init>(FZ)V

    .line 65
    .line 66
    .line 67
    iget-object v5, v0, La/i3w;->a:Ljava/lang/String;

    .line 68
    .line 69
    sget-wide v8, La/qmk;->q:J

    .line 70
    .line 71
    sget-wide v19, La/qmk;->s:J

    .line 72
    .line 73
    sget-wide v12, La/qmk;->n:J

    .line 74
    .line 75
    new-instance v14, La/n05;

    .line 76
    .line 77
    move-object v7, v14

    .line 78
    move-wide/from16 v10, v19

    .line 79
    .line 80
    invoke-direct/range {v7 .. v13}, La/n05;-><init>(JJJ)V

    .line 81
    .line 82
    .line 83
    sget-object v22, La/j1t0;->b:La/qrq;

    .line 84
    .line 85
    sget-wide v28, La/qmk;->G:J

    .line 86
    .line 87
    new-instance v16, La/y9q0;

    .line 88
    .line 89
    const/16 v27, 0x0

    .line 90
    .line 91
    const v30, 0xfdffdd

    .line 92
    .line 93
    .line 94
    const-wide/16 v17, 0x0

    .line 95
    .line 96
    const/16 v21, 0x0

    .line 97
    .line 98
    const-wide/16 v23, 0x0

    .line 99
    .line 100
    const/16 v25, 0x0

    .line 101
    .line 102
    const/16 v26, 0x0

    .line 103
    .line 104
    invoke-direct/range {v16 .. v30}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 105
    .line 106
    .line 107
    move-object/from16 v0, v16

    .line 108
    .line 109
    invoke-static {v0, v15}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    const v16, 0x186000

    .line 114
    .line 115
    .line 116
    const/16 v17, 0x1a8

    .line 117
    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v9, 0x2

    .line 120
    const/4 v10, 0x0

    .line 121
    const/4 v11, 0x1

    .line 122
    const/4 v12, 0x0

    .line 123
    const/4 v13, 0x0

    .line 124
    invoke-static/range {v5 .. v17}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    invoke-virtual {v15}, La/fet;->X()V

    .line 129
    .line 130
    .line 131
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_0
    move-object/from16 v11, p1

    .line 135
    .line 136
    check-cast v11, La/fet;

    .line 137
    .line 138
    move-object/from16 v1, p2

    .line 139
    .line 140
    check-cast v1, Ljava/lang/Integer;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    and-int/lit8 v5, v1, 0x3

    .line 147
    .line 148
    if-eq v5, v4, :cond_4

    .line 149
    .line 150
    move v2, v3

    .line 151
    :cond_4
    and-int/2addr v1, v3

    .line 152
    invoke-virtual {v11, v1, v2}, La/fet;->U(IZ)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_5

    .line 157
    .line 158
    sget-object v1, La/jm40;->b:La/jm40;

    .line 159
    .line 160
    const-string v2, "DESCRIPTION_TEXT"

    .line 161
    .line 162
    invoke-static {v1, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    iget-object v1, v0, La/i3w;->c:Ljava/lang/String;

    .line 167
    .line 168
    sget-wide v4, La/qmk;->q:J

    .line 169
    .line 170
    sget-wide v15, La/qmk;->s:J

    .line 171
    .line 172
    sget-wide v8, La/qmk;->n:J

    .line 173
    .line 174
    new-instance v3, La/n05;

    .line 175
    .line 176
    move-wide v6, v15

    .line 177
    invoke-direct/range {v3 .. v9}, La/n05;-><init>(JJJ)V

    .line 178
    .line 179
    .line 180
    sget-object v18, La/j1t0;->b:La/qrq;

    .line 181
    .line 182
    sget-wide v24, La/qmk;->G:J

    .line 183
    .line 184
    new-instance v12, La/y9q0;

    .line 185
    .line 186
    const/16 v23, 0x0

    .line 187
    .line 188
    const v26, 0xfdffdd

    .line 189
    .line 190
    .line 191
    const-wide/16 v13, 0x0

    .line 192
    .line 193
    const/16 v17, 0x0

    .line 194
    .line 195
    const-wide/16 v19, 0x0

    .line 196
    .line 197
    const/16 v21, 0x0

    .line 198
    .line 199
    const/16 v22, 0x0

    .line 200
    .line 201
    invoke-direct/range {v12 .. v26}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 202
    .line 203
    .line 204
    invoke-static {v12, v11}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 205
    .line 206
    .line 207
    move-result-object v13

    .line 208
    const/16 v30, 0x0

    .line 209
    .line 210
    const v31, 0xff7fff

    .line 211
    .line 212
    .line 213
    const-wide/16 v14, 0x0

    .line 214
    .line 215
    const-wide/16 v16, 0x0

    .line 216
    .line 217
    const/16 v18, 0x0

    .line 218
    .line 219
    const/16 v19, 0x0

    .line 220
    .line 221
    const/16 v20, 0x0

    .line 222
    .line 223
    const-wide/16 v21, 0x0

    .line 224
    .line 225
    const/16 v23, 0x0

    .line 226
    .line 227
    const/16 v24, 0x0

    .line 228
    .line 229
    const/16 v25, 0x6

    .line 230
    .line 231
    const/16 v26, 0x0

    .line 232
    .line 233
    const-wide/16 v27, 0x0

    .line 234
    .line 235
    const/16 v29, 0x0

    .line 236
    .line 237
    invoke-static/range {v13 .. v31}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    const v12, 0x186030

    .line 242
    .line 243
    .line 244
    const/16 v13, 0x1a8

    .line 245
    .line 246
    const/4 v4, 0x0

    .line 247
    const/4 v5, 0x2

    .line 248
    const/4 v6, 0x0

    .line 249
    const/4 v7, 0x1

    .line 250
    const/4 v8, 0x0

    .line 251
    const/4 v9, 0x0

    .line 252
    move-object v10, v3

    .line 253
    move-object v3, v0

    .line 254
    invoke-static/range {v1 .. v13}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_5
    invoke-virtual {v11}, La/fet;->X()V

    .line 259
    .line 260
    .line 261
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object v0

    .line 264
    :pswitch_1
    move-object/from16 v10, p1

    .line 265
    .line 266
    check-cast v10, La/fet;

    .line 267
    .line 268
    move-object/from16 v1, p2

    .line 269
    .line 270
    check-cast v1, Ljava/lang/Integer;

    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    and-int/lit8 v5, v1, 0x3

    .line 277
    .line 278
    if-eq v5, v4, :cond_6

    .line 279
    .line 280
    move v5, v3

    .line 281
    goto :goto_4

    .line 282
    :cond_6
    move v5, v2

    .line 283
    :goto_4
    and-int/2addr v1, v3

    .line 284
    invoke-virtual {v10, v1, v5}, La/fet;->U(IZ)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_8

    .line 289
    .line 290
    const-string v1, "TITLE_TEXT"

    .line 291
    .line 292
    sget-object v13, La/jm40;->b:La/jm40;

    .line 293
    .line 294
    invoke-static {v13, v1}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    sget-object v5, La/qmk;->a:La/zcl;

    .line 299
    .line 300
    new-instance v5, La/qw3;

    .line 301
    .line 302
    new-instance v6, La/jf4;

    .line 303
    .line 304
    const/16 v7, 0xe

    .line 305
    .line 306
    invoke-direct {v6, v7}, La/jf4;-><init>(B)V

    .line 307
    .line 308
    .line 309
    const/high16 v7, 0x40000000    # 2.0f

    .line 310
    .line 311
    invoke-direct {v5, v7, v3, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 312
    .line 313
    .line 314
    sget-object v6, La/gqw0;->k:La/yx7;

    .line 315
    .line 316
    const/16 v7, 0x30

    .line 317
    .line 318
    invoke-static {v5, v6, v10, v7}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    iget-wide v6, v10, La/fet;->T:J

    .line 323
    .line 324
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 325
    .line 326
    .line 327
    move-result v6

    .line 328
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    invoke-static {v10, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 337
    .line 338
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v10}, La/fet;->i0()V

    .line 342
    .line 343
    .line 344
    iget-boolean v8, v10, La/fet;->S:Z

    .line 345
    .line 346
    if-eqz v8, :cond_7

    .line 347
    .line 348
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 349
    .line 350
    invoke-virtual {v10, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 351
    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_7
    invoke-virtual {v10}, La/fet;->r0()V

    .line 355
    .line 356
    .line 357
    :goto_5
    sget-object v8, La/gqw0;->x:La/shd;

    .line 358
    .line 359
    invoke-static {v10, v5, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 360
    .line 361
    .line 362
    sget-object v5, La/gqw0;->w:La/shd;

    .line 363
    .line 364
    invoke-static {v10, v7, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 365
    .line 366
    .line 367
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    sget-object v6, La/gqw0;->y:La/shd;

    .line 372
    .line 373
    invoke-static {v10, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 374
    .line 375
    .line 376
    invoke-static {v10}, La/jpm0;->n(La/fet;)V

    .line 377
    .line 378
    .line 379
    sget-object v5, La/gqw0;->v:La/shd;

    .line 380
    .line 381
    invoke-static {v10, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 382
    .line 383
    .line 384
    const v1, 0x7f080999

    .line 385
    .line 386
    .line 387
    invoke-static {v1, v2, v10}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    const/high16 v1, 0x41800000    # 16.0f

    .line 392
    .line 393
    invoke-static {v13, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 394
    .line 395
    .line 396
    move-result-object v7

    .line 397
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 398
    .line 399
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 404
    .line 405
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 406
    .line 407
    .line 408
    move-result-wide v8

    .line 409
    const/4 v12, 0x0

    .line 410
    const/4 v6, 0x0

    .line 411
    const/16 v11, 0x38

    .line 412
    .line 413
    invoke-static/range {v5 .. v12}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 414
    .line 415
    .line 416
    sget-object v1, La/bmd;->n:La/zfn;

    .line 417
    .line 418
    sget-object v2, La/k6z;->a:La/k6z;

    .line 419
    .line 420
    invoke-virtual {v1, v2}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    new-instance v2, La/iio;

    .line 425
    .line 426
    invoke-direct {v2, v0, v4}, La/iio;-><init>(La/i3w;B)V

    .line 427
    .line 428
    .line 429
    const v4, -0x68274d87

    .line 430
    .line 431
    .line 432
    invoke-static {v4, v2, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-static {v1, v2, v10, v11}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 437
    .line 438
    .line 439
    iget-object v4, v0, La/i3w;->b:Ljava/lang/String;

    .line 440
    .line 441
    sget-object v20, La/j1t0;->b:La/qrq;

    .line 442
    .line 443
    sget-wide v17, La/qmk;->s:J

    .line 444
    .line 445
    sget-wide v26, La/qmk;->G:J

    .line 446
    .line 447
    new-instance v14, La/y9q0;

    .line 448
    .line 449
    const/16 v25, 0x0

    .line 450
    .line 451
    const v28, 0xfdffdd

    .line 452
    .line 453
    .line 454
    const-wide/16 v15, 0x0

    .line 455
    .line 456
    const/16 v19, 0x0

    .line 457
    .line 458
    const-wide/16 v21, 0x0

    .line 459
    .line 460
    const/16 v23, 0x0

    .line 461
    .line 462
    const/16 v24, 0x0

    .line 463
    .line 464
    invoke-direct/range {v14 .. v28}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 465
    .line 466
    .line 467
    invoke-static {v14, v10}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 468
    .line 469
    .line 470
    move-result-object v24

    .line 471
    const/16 v27, 0x0

    .line 472
    .line 473
    const v28, 0x1fffc

    .line 474
    .line 475
    .line 476
    const-wide/16 v6, 0x0

    .line 477
    .line 478
    const/4 v8, 0x0

    .line 479
    move-object/from16 v25, v10

    .line 480
    .line 481
    const-wide/16 v9, 0x0

    .line 482
    .line 483
    const/4 v11, 0x0

    .line 484
    const/4 v12, 0x0

    .line 485
    move-object v5, v13

    .line 486
    const/4 v13, 0x0

    .line 487
    const-wide/16 v14, 0x0

    .line 488
    .line 489
    const/16 v16, 0x0

    .line 490
    .line 491
    const-wide/16 v17, 0x0

    .line 492
    .line 493
    const/16 v19, 0x0

    .line 494
    .line 495
    const/16 v20, 0x0

    .line 496
    .line 497
    const/16 v21, 0x0

    .line 498
    .line 499
    const/16 v22, 0x0

    .line 500
    .line 501
    const/16 v26, 0x30

    .line 502
    .line 503
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 504
    .line 505
    .line 506
    move-object/from16 v10, v25

    .line 507
    .line 508
    invoke-virtual {v10, v3}, La/fet;->r(Z)V

    .line 509
    .line 510
    .line 511
    goto :goto_6

    .line 512
    :cond_8
    invoke-virtual {v10}, La/fet;->X()V

    .line 513
    .line 514
    .line 515
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 516
    .line 517
    return-object v0

    .line 518
    nop

    .line 519
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
