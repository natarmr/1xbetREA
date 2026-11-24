.class public final La/cit;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, La/cit;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/cit;->b:Ljava/util/List;

    .line 8
    .line 9
    iput p2, p0, La/cit;->c:I

    .line 10
    .line 11
    iput-object p3, p0, La/cit;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/Object;IB)V
    .locals 0

    .line 14
    iput-byte p4, p0, La/cit;->a:B

    iput-object p1, p0, La/cit;->b:Ljava/util/List;

    iput-object p2, p0, La/cit;->d:Ljava/lang/Object;

    iput p3, p0, La/cit;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cit;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, La/ukd;->a:La/cl5;

    .line 7
    .line 8
    const/high16 v4, 0x3f800000    # 1.0f

    .line 9
    .line 10
    sget-object v5, La/jm40;->b:La/jm40;

    .line 11
    .line 12
    iget-object v6, v0, La/cit;->b:Ljava/util/List;

    .line 13
    .line 14
    const/16 v7, 0x92

    .line 15
    .line 16
    const/4 v9, 0x2

    .line 17
    const/4 v10, 0x4

    .line 18
    iget-object v11, v0, La/cit;->d:Ljava/lang/Object;

    .line 19
    .line 20
    iget v0, v0, La/cit;->c:I

    .line 21
    .line 22
    const/16 v12, 0x10

    .line 23
    .line 24
    const/4 v13, 0x0

    .line 25
    const/4 v14, 0x1

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, La/g9z;

    .line 32
    .line 33
    move-object/from16 v2, p2

    .line 34
    .line 35
    check-cast v2, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    move-object/from16 v15, p3

    .line 42
    .line 43
    check-cast v15, La/fet;

    .line 44
    .line 45
    move-object/from16 v16, p4

    .line 46
    .line 47
    check-cast v16, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v16

    .line 53
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    and-int/lit8 v17, v16, 0x6

    .line 56
    .line 57
    if-nez v17, :cond_1

    .line 58
    .line 59
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    move v9, v10

    .line 66
    :cond_0
    or-int v1, v16, v9

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move/from16 v1, v16

    .line 70
    .line 71
    :goto_0
    and-int/lit8 v9, v16, 0x30

    .line 72
    .line 73
    if-nez v9, :cond_3

    .line 74
    .line 75
    invoke-virtual {v15, v2}, La/fet;->e(I)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_2

    .line 80
    .line 81
    const/16 v8, 0x20

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move v8, v12

    .line 85
    :goto_1
    or-int/2addr v1, v8

    .line 86
    :cond_3
    and-int/lit16 v8, v1, 0x93

    .line 87
    .line 88
    if-eq v8, v7, :cond_4

    .line 89
    .line 90
    move v7, v14

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    move v7, v13

    .line 93
    :goto_2
    and-int/2addr v1, v14

    .line 94
    invoke-virtual {v15, v1, v7}, La/fet;->U(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_f

    .line 99
    .line 100
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Ljava/util/List;

    .line 105
    .line 106
    const v2, -0x4e95e99

    .line 107
    .line 108
    .line 109
    invoke-virtual {v15, v2}, La/fet;->e0(I)V

    .line 110
    .line 111
    .line 112
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    sget-object v5, La/enx;->b:La/enx;

    .line 117
    .line 118
    invoke-static {v2, v5}, La/q8a;->k0(La/mm40;La/enx;)La/mm40;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    sget-object v5, La/qmk;->a:La/zcl;

    .line 123
    .line 124
    new-instance v5, La/qw3;

    .line 125
    .line 126
    new-instance v6, La/jf4;

    .line 127
    .line 128
    const/16 v7, 0xe

    .line 129
    .line 130
    invoke-direct {v6, v7}, La/jf4;-><init>(B)V

    .line 131
    .line 132
    .line 133
    const/high16 v7, 0x41000000    # 8.0f

    .line 134
    .line 135
    invoke-direct {v5, v7, v14, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 136
    .line 137
    .line 138
    sget-object v6, La/gqw0;->j:La/yx7;

    .line 139
    .line 140
    invoke-static {v5, v6, v15, v13}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    iget-wide v6, v15, La/fet;->T:J

    .line 145
    .line 146
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-static {v15, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 159
    .line 160
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v15}, La/fet;->i0()V

    .line 164
    .line 165
    .line 166
    iget-boolean v8, v15, La/fet;->S:Z

    .line 167
    .line 168
    if-eqz v8, :cond_5

    .line 169
    .line 170
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 171
    .line 172
    invoke-virtual {v15, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_5
    invoke-virtual {v15}, La/fet;->r0()V

    .line 177
    .line 178
    .line 179
    :goto_3
    sget-object v8, La/gqw0;->x:La/shd;

    .line 180
    .line 181
    invoke-static {v15, v5, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 182
    .line 183
    .line 184
    sget-object v5, La/gqw0;->w:La/shd;

    .line 185
    .line 186
    invoke-static {v15, v7, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    sget-object v6, La/gqw0;->y:La/shd;

    .line 194
    .line 195
    invoke-static {v15, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 199
    .line 200
    .line 201
    sget-object v5, La/gqw0;->v:La/shd;

    .line 202
    .line 203
    const v6, -0x40169236

    .line 204
    .line 205
    .line 206
    invoke-static {v15, v2, v5, v6, v1}, La/kng0;->v(La/fet;La/mm40;La/shd;ILjava/util/List;)Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    const-string v7, "invalid weight; must be greater than zero"

    .line 215
    .line 216
    const-wide/16 v8, 0x0

    .line 217
    .line 218
    if-eqz v5, :cond_a

    .line 219
    .line 220
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    check-cast v5, La/pzc;

    .line 225
    .line 226
    move-object/from16 p1, v7

    .line 227
    .line 228
    const p0, 0x7f7fffff    # Float.MAX_VALUE

    .line 229
    .line 230
    .line 231
    float-to-double v6, v4

    .line 232
    cmpl-double v6, v6, v8

    .line 233
    .line 234
    if-lez v6, :cond_6

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_6
    invoke-static/range {p1 .. p1}, La/vcx;->a(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    :goto_5
    new-instance v6, La/x7z;

    .line 241
    .line 242
    cmpl-float v7, v4, p0

    .line 243
    .line 244
    if-lez v7, :cond_7

    .line 245
    .line 246
    move/from16 v7, p0

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_7
    move v7, v4

    .line 250
    :goto_6
    invoke-direct {v6, v7, v14}, La/x7z;-><init>(FZ)V

    .line 251
    .line 252
    .line 253
    invoke-static {v6, v4}, La/o7k0;->c(La/mm40;F)La/mm40;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    iget-object v7, v5, La/pzc;->b:La/rqm;

    .line 258
    .line 259
    invoke-virtual {v15, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    invoke-virtual {v15, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    or-int/2addr v8, v9

    .line 268
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    if-nez v8, :cond_8

    .line 273
    .line 274
    if-ne v9, v3, :cond_9

    .line 275
    .line 276
    :cond_8
    new-instance v9, La/sue0;

    .line 277
    .line 278
    invoke-direct {v9, v11, v5, v12}, La/sue0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v15, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_9
    move-object/from16 v19, v9

    .line 285
    .line 286
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 287
    .line 288
    const/16 v24, 0x0

    .line 289
    .line 290
    const/16 v25, 0xec

    .line 291
    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    const/16 v18, 0x0

    .line 295
    .line 296
    const/16 v20, 0x0

    .line 297
    .line 298
    const/16 v21, 0x0

    .line 299
    .line 300
    const/16 v22, 0x0

    .line 301
    .line 302
    move-object/from16 v16, v7

    .line 303
    .line 304
    move-object/from16 v23, v15

    .line 305
    .line 306
    move-object v15, v6

    .line 307
    invoke-static/range {v15 .. v25}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 308
    .line 309
    .line 310
    move-object/from16 v15, v23

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_a
    move-object/from16 p1, v7

    .line 314
    .line 315
    move-object v5, v15

    .line 316
    const p0, 0x7f7fffff    # Float.MAX_VALUE

    .line 317
    .line 318
    .line 319
    invoke-virtual {v5, v13}, La/fet;->r(Z)V

    .line 320
    .line 321
    .line 322
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-ge v2, v0, :cond_e

    .line 327
    .line 328
    const v2, 0x3d4a9d0a

    .line 329
    .line 330
    .line 331
    invoke-virtual {v5, v2}, La/fet;->e0(I)V

    .line 332
    .line 333
    .line 334
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    sub-int/2addr v0, v1

    .line 339
    move v1, v13

    .line 340
    :goto_7
    if-ge v1, v0, :cond_d

    .line 341
    .line 342
    float-to-double v2, v4

    .line 343
    cmpl-double v2, v2, v8

    .line 344
    .line 345
    if-lez v2, :cond_b

    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_b
    invoke-static/range {p1 .. p1}, La/vcx;->a(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    :goto_8
    new-instance v2, La/x7z;

    .line 352
    .line 353
    cmpl-float v3, v4, p0

    .line 354
    .line 355
    if-lez v3, :cond_c

    .line 356
    .line 357
    move/from16 v3, p0

    .line 358
    .line 359
    goto :goto_9

    .line 360
    :cond_c
    move v3, v4

    .line 361
    :goto_9
    invoke-direct {v2, v3, v14}, La/x7z;-><init>(FZ)V

    .line 362
    .line 363
    .line 364
    invoke-static {v5, v2}, La/qxw;->o(La/fet;La/mm40;)V

    .line 365
    .line 366
    .line 367
    add-int/lit8 v1, v1, 0x1

    .line 368
    .line 369
    goto :goto_7

    .line 370
    :cond_d
    invoke-virtual {v5, v13}, La/fet;->r(Z)V

    .line 371
    .line 372
    .line 373
    goto :goto_a

    .line 374
    :cond_e
    const v0, 0x3d4d00ed

    .line 375
    .line 376
    .line 377
    invoke-virtual {v5, v0}, La/fet;->e0(I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v5, v13}, La/fet;->r(Z)V

    .line 381
    .line 382
    .line 383
    :goto_a
    invoke-virtual {v5, v14}, La/fet;->r(Z)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v5, v13}, La/fet;->r(Z)V

    .line 387
    .line 388
    .line 389
    goto :goto_b

    .line 390
    :cond_f
    move-object v5, v15

    .line 391
    invoke-virtual {v5}, La/fet;->X()V

    .line 392
    .line 393
    .line 394
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 395
    .line 396
    return-object v0

    .line 397
    :pswitch_0
    move-object/from16 v1, p1

    .line 398
    .line 399
    check-cast v1, La/g9z;

    .line 400
    .line 401
    move-object/from16 v2, p2

    .line 402
    .line 403
    check-cast v2, Ljava/lang/Number;

    .line 404
    .line 405
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    move-object/from16 v3, p3

    .line 410
    .line 411
    check-cast v3, La/fet;

    .line 412
    .line 413
    move-object/from16 v4, p4

    .line 414
    .line 415
    check-cast v4, Ljava/lang/Number;

    .line 416
    .line 417
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 418
    .line 419
    .line 420
    move-result v4

    .line 421
    and-int/lit8 v5, v4, 0x6

    .line 422
    .line 423
    if-nez v5, :cond_11

    .line 424
    .line 425
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    if-eqz v1, :cond_10

    .line 430
    .line 431
    move v9, v10

    .line 432
    :cond_10
    or-int v1, v4, v9

    .line 433
    .line 434
    goto :goto_c

    .line 435
    :cond_11
    move v1, v4

    .line 436
    :goto_c
    and-int/lit8 v4, v4, 0x30

    .line 437
    .line 438
    if-nez v4, :cond_13

    .line 439
    .line 440
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 441
    .line 442
    .line 443
    move-result v4

    .line 444
    if-eqz v4, :cond_12

    .line 445
    .line 446
    const/16 v8, 0x20

    .line 447
    .line 448
    goto :goto_d

    .line 449
    :cond_12
    move v8, v12

    .line 450
    :goto_d
    or-int/2addr v1, v8

    .line 451
    :cond_13
    and-int/lit16 v4, v1, 0x93

    .line 452
    .line 453
    if-eq v4, v7, :cond_14

    .line 454
    .line 455
    move v4, v14

    .line 456
    goto :goto_e

    .line 457
    :cond_14
    move v4, v13

    .line 458
    :goto_e
    and-int/2addr v1, v14

    .line 459
    invoke-virtual {v3, v1, v4}, La/fet;->U(IZ)Z

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-eqz v1, :cond_1a

    .line 464
    .line 465
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    check-cast v1, La/hoa0;

    .line 470
    .line 471
    const v4, 0x1025a395

    .line 472
    .line 473
    .line 474
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 475
    .line 476
    .line 477
    check-cast v11, La/qd30;

    .line 478
    .line 479
    iget-object v4, v11, La/qd30;->e:La/a4x;

    .line 480
    .line 481
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    check-cast v0, La/a4x;

    .line 486
    .line 487
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    sub-int/2addr v0, v14

    .line 492
    if-ne v2, v0, :cond_15

    .line 493
    .line 494
    move v0, v14

    .line 495
    goto :goto_f

    .line 496
    :cond_15
    move v0, v13

    .line 497
    :goto_f
    instance-of v4, v1, La/eoa0;

    .line 498
    .line 499
    if-eqz v4, :cond_16

    .line 500
    .line 501
    const v2, 0x10281200

    .line 502
    .line 503
    .line 504
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 505
    .line 506
    .line 507
    check-cast v1, La/eoa0;

    .line 508
    .line 509
    invoke-static {v1, v0, v3, v13}, La/l7x;->k(La/eoa0;ZLa/fet;I)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 513
    .line 514
    .line 515
    goto :goto_11

    .line 516
    :cond_16
    instance-of v4, v1, La/foa0;

    .line 517
    .line 518
    if-eqz v4, :cond_18

    .line 519
    .line 520
    const v4, 0x102cfd41

    .line 521
    .line 522
    .line 523
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 524
    .line 525
    .line 526
    check-cast v1, La/foa0;

    .line 527
    .line 528
    if-nez v2, :cond_17

    .line 529
    .line 530
    goto :goto_10

    .line 531
    :cond_17
    move v14, v13

    .line 532
    :goto_10
    invoke-static {v1, v0, v14, v3, v13}, La/n7x;->b(La/foa0;ZZLa/fet;I)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 536
    .line 537
    .line 538
    goto :goto_11

    .line 539
    :cond_18
    sget-object v2, La/goa0;->a:La/goa0;

    .line 540
    .line 541
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    move-result v1

    .line 545
    if-eqz v1, :cond_19

    .line 546
    .line 547
    const v1, 0x1032841d

    .line 548
    .line 549
    .line 550
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 551
    .line 552
    .line 553
    invoke-static {v13, v3, v0}, La/u7x;->b(ILa/fet;Z)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 557
    .line 558
    .line 559
    :goto_11
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 560
    .line 561
    .line 562
    goto :goto_12

    .line 563
    :cond_19
    const v0, -0x5a515422

    .line 564
    .line 565
    .line 566
    invoke-static {v0, v3, v13}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    throw v0

    .line 571
    :cond_1a
    invoke-virtual {v3}, La/fet;->X()V

    .line 572
    .line 573
    .line 574
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 575
    .line 576
    return-object v0

    .line 577
    :pswitch_1
    move-object/from16 v1, p1

    .line 578
    .line 579
    check-cast v1, La/g9z;

    .line 580
    .line 581
    move-object/from16 v2, p2

    .line 582
    .line 583
    check-cast v2, Ljava/lang/Number;

    .line 584
    .line 585
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    move-object/from16 v3, p3

    .line 590
    .line 591
    check-cast v3, La/fet;

    .line 592
    .line 593
    move-object/from16 v4, p4

    .line 594
    .line 595
    check-cast v4, Ljava/lang/Number;

    .line 596
    .line 597
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 598
    .line 599
    .line 600
    move-result v4

    .line 601
    and-int/lit8 v5, v4, 0x6

    .line 602
    .line 603
    if-nez v5, :cond_1c

    .line 604
    .line 605
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v1

    .line 609
    if-eqz v1, :cond_1b

    .line 610
    .line 611
    move v9, v10

    .line 612
    :cond_1b
    or-int v1, v4, v9

    .line 613
    .line 614
    goto :goto_13

    .line 615
    :cond_1c
    move v1, v4

    .line 616
    :goto_13
    and-int/lit8 v4, v4, 0x30

    .line 617
    .line 618
    if-nez v4, :cond_1e

    .line 619
    .line 620
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 621
    .line 622
    .line 623
    move-result v4

    .line 624
    if-eqz v4, :cond_1d

    .line 625
    .line 626
    const/16 v8, 0x20

    .line 627
    .line 628
    goto :goto_14

    .line 629
    :cond_1d
    move v8, v12

    .line 630
    :goto_14
    or-int/2addr v1, v8

    .line 631
    :cond_1e
    and-int/lit16 v4, v1, 0x93

    .line 632
    .line 633
    if-eq v4, v7, :cond_1f

    .line 634
    .line 635
    move v4, v14

    .line 636
    goto :goto_15

    .line 637
    :cond_1f
    move v4, v13

    .line 638
    :goto_15
    and-int/2addr v1, v14

    .line 639
    invoke-virtual {v3, v1, v4}, La/fet;->U(IZ)Z

    .line 640
    .line 641
    .line 642
    move-result v1

    .line 643
    if-eqz v1, :cond_21

    .line 644
    .line 645
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    check-cast v1, La/wn5;

    .line 650
    .line 651
    const v4, 0x5e74325b

    .line 652
    .line 653
    .line 654
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 655
    .line 656
    .line 657
    check-cast v11, La/nc30;

    .line 658
    .line 659
    iget-object v4, v11, La/nc30;->d:La/a4x;

    .line 660
    .line 661
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    check-cast v0, La/a4x;

    .line 666
    .line 667
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 668
    .line 669
    .line 670
    move-result v0

    .line 671
    sub-int/2addr v0, v14

    .line 672
    if-ne v2, v0, :cond_20

    .line 673
    .line 674
    goto :goto_16

    .line 675
    :cond_20
    move v14, v13

    .line 676
    :goto_16
    invoke-static {v1, v14, v3, v13}, La/piz;->l(La/wn5;ZLa/fet;I)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v3, v13}, La/fet;->r(Z)V

    .line 680
    .line 681
    .line 682
    goto :goto_17

    .line 683
    :cond_21
    invoke-virtual {v3}, La/fet;->X()V

    .line 684
    .line 685
    .line 686
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 687
    .line 688
    return-object v0

    .line 689
    :pswitch_2
    move-object/from16 v1, p1

    .line 690
    .line 691
    check-cast v1, La/g9z;

    .line 692
    .line 693
    move-object/from16 v15, p2

    .line 694
    .line 695
    check-cast v15, Ljava/lang/Number;

    .line 696
    .line 697
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 698
    .line 699
    .line 700
    move-result v15

    .line 701
    move-object/from16 v8, p3

    .line 702
    .line 703
    check-cast v8, La/fet;

    .line 704
    .line 705
    move-object/from16 v17, p4

    .line 706
    .line 707
    check-cast v17, Ljava/lang/Number;

    .line 708
    .line 709
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 710
    .line 711
    .line 712
    move-result v17

    .line 713
    check-cast v11, La/fit;

    .line 714
    .line 715
    and-int/lit8 v18, v17, 0x6

    .line 716
    .line 717
    if-nez v18, :cond_23

    .line 718
    .line 719
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    move-result v1

    .line 723
    if-eqz v1, :cond_22

    .line 724
    .line 725
    move v9, v10

    .line 726
    :cond_22
    or-int v1, v17, v9

    .line 727
    .line 728
    goto :goto_18

    .line 729
    :cond_23
    move/from16 v1, v17

    .line 730
    .line 731
    :goto_18
    and-int/lit8 v9, v17, 0x30

    .line 732
    .line 733
    if-nez v9, :cond_25

    .line 734
    .line 735
    invoke-virtual {v8, v15}, La/fet;->e(I)Z

    .line 736
    .line 737
    .line 738
    move-result v9

    .line 739
    if-eqz v9, :cond_24

    .line 740
    .line 741
    const/16 v12, 0x20

    .line 742
    .line 743
    :cond_24
    or-int/2addr v1, v12

    .line 744
    :cond_25
    and-int/lit16 v9, v1, 0x93

    .line 745
    .line 746
    if-eq v9, v7, :cond_26

    .line 747
    .line 748
    move v7, v14

    .line 749
    goto :goto_19

    .line 750
    :cond_26
    move v7, v13

    .line 751
    :goto_19
    and-int/2addr v1, v14

    .line 752
    invoke-virtual {v8, v1, v7}, La/fet;->U(IZ)Z

    .line 753
    .line 754
    .line 755
    move-result v1

    .line 756
    if-eqz v1, :cond_2d

    .line 757
    .line 758
    invoke-interface {v6, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    check-cast v1, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;

    .line 763
    .line 764
    const v6, 0x9675831

    .line 765
    .line 766
    .line 767
    invoke-virtual {v8, v6}, La/fet;->e0(I)V

    .line 768
    .line 769
    .line 770
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 771
    .line 772
    .line 773
    move-result-object v16

    .line 774
    new-instance v17, La/rqm;

    .line 775
    .line 776
    new-instance v4, La/tui0;

    .line 777
    .line 778
    iget-object v5, v1, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;->a:Ljava/lang/String;

    .line 779
    .line 780
    invoke-direct {v4, v5, v2}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 781
    .line 782
    .line 783
    new-instance v2, La/nvi0;

    .line 784
    .line 785
    iget-boolean v5, v1, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;->c:Z

    .line 786
    .line 787
    invoke-direct {v2, v5}, La/nvi0;-><init>(Z)V

    .line 788
    .line 789
    .line 790
    sget-object v5, La/fit;->m2:La/ddk;

    .line 791
    .line 792
    iget-object v5, v11, La/fit;->l2:La/lhf0;

    .line 793
    .line 794
    sget-object v6, La/fit;->n2:[La/iiy;

    .line 795
    .line 796
    aget-object v6, v6, v14

    .line 797
    .line 798
    invoke-virtual {v5, v11, v6}, La/lhf0;->p(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 799
    .line 800
    .line 801
    move-result-object v5

    .line 802
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 803
    .line 804
    .line 805
    move-result v5

    .line 806
    sub-int/2addr v5, v14

    .line 807
    if-ne v15, v5, :cond_27

    .line 808
    .line 809
    sget-object v5, La/wui0;->d:La/wui0;

    .line 810
    .line 811
    :goto_1a
    move-object/from16 v23, v5

    .line 812
    .line 813
    goto :goto_1b

    .line 814
    :cond_27
    sget-object v5, La/wui0;->c:La/wui0;

    .line 815
    .line 816
    goto :goto_1a

    .line 817
    :goto_1b
    const/16 v25, 0x0

    .line 818
    .line 819
    const/16 v26, 0x1ba

    .line 820
    .line 821
    const/16 v19, 0x0

    .line 822
    .line 823
    const/16 v21, 0x0

    .line 824
    .line 825
    const/16 v22, 0x0

    .line 826
    .line 827
    const/16 v24, 0x0

    .line 828
    .line 829
    move-object/from16 v20, v2

    .line 830
    .line 831
    move-object/from16 v18, v4

    .line 832
    .line 833
    invoke-direct/range {v17 .. v26}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 834
    .line 835
    .line 836
    if-eq v15, v0, :cond_28

    .line 837
    .line 838
    move/from16 v18, v14

    .line 839
    .line 840
    goto :goto_1c

    .line 841
    :cond_28
    move/from16 v18, v13

    .line 842
    .line 843
    :goto_1c
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    move-result v0

    .line 847
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    move-result v2

    .line 851
    or-int/2addr v0, v2

    .line 852
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v2

    .line 856
    if-nez v0, :cond_29

    .line 857
    .line 858
    if-ne v2, v3, :cond_2a

    .line 859
    .line 860
    :cond_29
    new-instance v2, La/eit;

    .line 861
    .line 862
    invoke-direct {v2, v11, v1, v13}, La/eit;-><init>(La/fit;Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;B)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v8, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 866
    .line 867
    .line 868
    :cond_2a
    move-object/from16 v20, v2

    .line 869
    .line 870
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 871
    .line 872
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 873
    .line 874
    .line 875
    move-result v0

    .line 876
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 877
    .line 878
    .line 879
    move-result v2

    .line 880
    or-int/2addr v0, v2

    .line 881
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    if-nez v0, :cond_2b

    .line 886
    .line 887
    if-ne v2, v3, :cond_2c

    .line 888
    .line 889
    :cond_2b
    new-instance v2, La/eit;

    .line 890
    .line 891
    invoke-direct {v2, v11, v1, v14}, La/eit;-><init>(La/fit;Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;B)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v8, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 895
    .line 896
    .line 897
    :cond_2c
    move-object/from16 v22, v2

    .line 898
    .line 899
    check-cast v22, Lkotlin/jvm/functions/Function0;

    .line 900
    .line 901
    const/16 v25, 0x6

    .line 902
    .line 903
    const/16 v26, 0xa8

    .line 904
    .line 905
    const/16 v19, 0x0

    .line 906
    .line 907
    const/16 v21, 0x0

    .line 908
    .line 909
    const/16 v23, 0x0

    .line 910
    .line 911
    move-object/from16 v24, v8

    .line 912
    .line 913
    invoke-static/range {v16 .. v26}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 914
    .line 915
    .line 916
    move-object/from16 v0, v24

    .line 917
    .line 918
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 919
    .line 920
    .line 921
    goto :goto_1d

    .line 922
    :cond_2d
    move-object v0, v8

    .line 923
    invoke-virtual {v0}, La/fet;->X()V

    .line 924
    .line 925
    .line 926
    :goto_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 927
    .line 928
    return-object v0

    .line 929
    :pswitch_3
    move-object/from16 v1, p1

    .line 930
    .line 931
    check-cast v1, La/g9z;

    .line 932
    .line 933
    move-object/from16 v8, p2

    .line 934
    .line 935
    check-cast v8, Ljava/lang/Number;

    .line 936
    .line 937
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 938
    .line 939
    .line 940
    move-result v8

    .line 941
    move-object/from16 v15, p3

    .line 942
    .line 943
    check-cast v15, La/fet;

    .line 944
    .line 945
    move-object/from16 v17, p4

    .line 946
    .line 947
    check-cast v17, Ljava/lang/Number;

    .line 948
    .line 949
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 950
    .line 951
    .line 952
    move-result v17

    .line 953
    check-cast v11, La/dit;

    .line 954
    .line 955
    and-int/lit8 v18, v17, 0x6

    .line 956
    .line 957
    if-nez v18, :cond_2f

    .line 958
    .line 959
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 960
    .line 961
    .line 962
    move-result v1

    .line 963
    if-eqz v1, :cond_2e

    .line 964
    .line 965
    move v9, v10

    .line 966
    :cond_2e
    or-int v1, v17, v9

    .line 967
    .line 968
    goto :goto_1e

    .line 969
    :cond_2f
    move/from16 v1, v17

    .line 970
    .line 971
    :goto_1e
    and-int/lit8 v9, v17, 0x30

    .line 972
    .line 973
    if-nez v9, :cond_31

    .line 974
    .line 975
    invoke-virtual {v15, v8}, La/fet;->e(I)Z

    .line 976
    .line 977
    .line 978
    move-result v9

    .line 979
    if-eqz v9, :cond_30

    .line 980
    .line 981
    const/16 v12, 0x20

    .line 982
    .line 983
    :cond_30
    or-int/2addr v1, v12

    .line 984
    :cond_31
    and-int/lit16 v9, v1, 0x93

    .line 985
    .line 986
    if-eq v9, v7, :cond_32

    .line 987
    .line 988
    move v7, v14

    .line 989
    goto :goto_1f

    .line 990
    :cond_32
    move v7, v13

    .line 991
    :goto_1f
    and-int/2addr v1, v14

    .line 992
    invoke-virtual {v15, v1, v7}, La/fet;->U(IZ)Z

    .line 993
    .line 994
    .line 995
    move-result v1

    .line 996
    if-eqz v1, :cond_39

    .line 997
    .line 998
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    check-cast v1, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;

    .line 1003
    .line 1004
    const v6, 0x784f77ba

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v15, v6}, La/fet;->e0(I)V

    .line 1008
    .line 1009
    .line 1010
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v17

    .line 1014
    new-instance v18, La/rqm;

    .line 1015
    .line 1016
    new-instance v4, La/tui0;

    .line 1017
    .line 1018
    iget-object v5, v1, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;->a:Ljava/lang/String;

    .line 1019
    .line 1020
    invoke-direct {v4, v5, v2}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 1021
    .line 1022
    .line 1023
    new-instance v2, La/nvi0;

    .line 1024
    .line 1025
    iget-boolean v5, v1, Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;->c:Z

    .line 1026
    .line 1027
    invoke-direct {v2, v5}, La/nvi0;-><init>(Z)V

    .line 1028
    .line 1029
    .line 1030
    sget-object v5, La/dit;->m2:La/xak;

    .line 1031
    .line 1032
    iget-object v5, v11, La/dit;->l2:La/lhf0;

    .line 1033
    .line 1034
    sget-object v6, La/dit;->n2:[La/iiy;

    .line 1035
    .line 1036
    aget-object v6, v6, v14

    .line 1037
    .line 1038
    invoke-virtual {v5, v11, v6}, La/lhf0;->p(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v5

    .line 1042
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1043
    .line 1044
    .line 1045
    move-result v5

    .line 1046
    sub-int/2addr v5, v14

    .line 1047
    if-ne v8, v5, :cond_33

    .line 1048
    .line 1049
    sget-object v5, La/wui0;->d:La/wui0;

    .line 1050
    .line 1051
    :goto_20
    move-object/from16 v24, v5

    .line 1052
    .line 1053
    goto :goto_21

    .line 1054
    :cond_33
    sget-object v5, La/wui0;->c:La/wui0;

    .line 1055
    .line 1056
    goto :goto_20

    .line 1057
    :goto_21
    const/16 v26, 0x0

    .line 1058
    .line 1059
    const/16 v27, 0x1ba

    .line 1060
    .line 1061
    const/16 v20, 0x0

    .line 1062
    .line 1063
    const/16 v22, 0x0

    .line 1064
    .line 1065
    const/16 v23, 0x0

    .line 1066
    .line 1067
    const/16 v25, 0x0

    .line 1068
    .line 1069
    move-object/from16 v21, v2

    .line 1070
    .line 1071
    move-object/from16 v19, v4

    .line 1072
    .line 1073
    invoke-direct/range {v18 .. v27}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 1074
    .line 1075
    .line 1076
    if-eq v8, v0, :cond_34

    .line 1077
    .line 1078
    move/from16 v19, v14

    .line 1079
    .line 1080
    goto :goto_22

    .line 1081
    :cond_34
    move/from16 v19, v13

    .line 1082
    .line 1083
    :goto_22
    invoke-virtual {v15, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1084
    .line 1085
    .line 1086
    move-result v0

    .line 1087
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1088
    .line 1089
    .line 1090
    move-result v2

    .line 1091
    or-int/2addr v0, v2

    .line 1092
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v2

    .line 1096
    if-nez v0, :cond_35

    .line 1097
    .line 1098
    if-ne v2, v3, :cond_36

    .line 1099
    .line 1100
    :cond_35
    new-instance v2, La/bit;

    .line 1101
    .line 1102
    invoke-direct {v2, v11, v1, v13}, La/bit;-><init>(La/dit;Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;B)V

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v15, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1106
    .line 1107
    .line 1108
    :cond_36
    move-object/from16 v21, v2

    .line 1109
    .line 1110
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 1111
    .line 1112
    invoke-virtual {v15, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1113
    .line 1114
    .line 1115
    move-result v0

    .line 1116
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v2

    .line 1120
    or-int/2addr v0, v2

    .line 1121
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v2

    .line 1125
    if-nez v0, :cond_37

    .line 1126
    .line 1127
    if-ne v2, v3, :cond_38

    .line 1128
    .line 1129
    :cond_37
    new-instance v2, La/bit;

    .line 1130
    .line 1131
    invoke-direct {v2, v11, v1, v14}, La/bit;-><init>(La/dit;Lorg/xplatform/coupon/impl/generate_coupon/presentation/model/compose/GenerateCouponTypeUiModel;B)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v15, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1135
    .line 1136
    .line 1137
    :cond_38
    move-object/from16 v23, v2

    .line 1138
    .line 1139
    check-cast v23, Lkotlin/jvm/functions/Function0;

    .line 1140
    .line 1141
    const/16 v26, 0x6

    .line 1142
    .line 1143
    const/16 v27, 0xa8

    .line 1144
    .line 1145
    const/16 v20, 0x0

    .line 1146
    .line 1147
    const/16 v22, 0x0

    .line 1148
    .line 1149
    const/16 v24, 0x0

    .line 1150
    .line 1151
    move-object/from16 v25, v15

    .line 1152
    .line 1153
    invoke-static/range {v17 .. v27}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1154
    .line 1155
    .line 1156
    move-object/from16 v0, v25

    .line 1157
    .line 1158
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 1159
    .line 1160
    .line 1161
    goto :goto_23

    .line 1162
    :cond_39
    move-object v0, v15

    .line 1163
    invoke-virtual {v0}, La/fet;->X()V

    .line 1164
    .line 1165
    .line 1166
    :goto_23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1167
    .line 1168
    return-object v0

    .line 1169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
