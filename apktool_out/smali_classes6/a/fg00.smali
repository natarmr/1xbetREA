.class public final synthetic La/fg00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/k3t0;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/k3t0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fg00;->a:B

    iput-object p1, p0, La/fg00;->b:La/pz40;

    iput-object p2, p0, La/fg00;->c:La/k3t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fg00;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x43060000    # 134.0f

    .line 6
    .line 7
    iget-object v3, v0, La/fg00;->c:La/k3t0;

    .line 8
    .line 9
    const/high16 v4, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/16 v5, 0x12

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    sget-object v8, La/ukd;->a:La/cl5;

    .line 16
    .line 17
    iget-object v9, v0, La/fg00;->b:La/pz40;

    .line 18
    .line 19
    sget-object v10, La/jm40;->b:La/jm40;

    .line 20
    .line 21
    const/4 v11, 0x2

    .line 22
    const/4 v12, 0x4

    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    check-cast v0, La/ir8;

    .line 29
    .line 30
    move-object/from16 v1, p2

    .line 31
    .line 32
    check-cast v1, La/fet;

    .line 33
    .line 34
    move-object/from16 v13, p3

    .line 35
    .line 36
    check-cast v13, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v13

    .line 42
    sget-object v14, La/gqw0;->e:La/zx7;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    and-int/lit8 v15, v13, 0x6

    .line 48
    .line 49
    if-nez v15, :cond_1

    .line 50
    .line 51
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v15

    .line 55
    if-eqz v15, :cond_0

    .line 56
    .line 57
    move v11, v12

    .line 58
    :cond_0
    or-int/2addr v13, v11

    .line 59
    :cond_1
    and-int/lit8 v11, v13, 0x13

    .line 60
    .line 61
    if-eq v11, v5, :cond_2

    .line 62
    .line 63
    move v5, v7

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move v5, v6

    .line 66
    :goto_0
    and-int/2addr v7, v13

    .line 67
    invoke-virtual {v1, v7, v5}, La/fet;->U(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_b

    .line 72
    .line 73
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, La/drd0;

    .line 78
    .line 79
    if-eqz v5, :cond_a

    .line 80
    .line 81
    instance-of v7, v5, La/zqd0;

    .line 82
    .line 83
    if-eqz v7, :cond_5

    .line 84
    .line 85
    const v0, 0x3bbff9dc

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 89
    .line 90
    .line 91
    check-cast v5, La/zqd0;

    .line 92
    .line 93
    iget-object v13, v5, La/zqd0;->d:La/a4x;

    .line 94
    .line 95
    invoke-static {v10, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    if-nez v0, :cond_3

    .line 108
    .line 109
    if-ne v2, v8, :cond_4

    .line 110
    .line 111
    :cond_3
    new-instance v2, La/ebh;

    .line 112
    .line 113
    const/4 v0, 0x7

    .line 114
    invoke-direct {v2, v3, v0}, La/ebh;-><init>(La/k3t0;B)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    move-object v15, v2

    .line 121
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 122
    .line 123
    const/16 v18, 0x30

    .line 124
    .line 125
    const/16 v19, 0x0

    .line 126
    .line 127
    const v16, 0x7f130cb3

    .line 128
    .line 129
    .line 130
    move-object/from16 v17, v1

    .line 131
    .line 132
    invoke-static/range {v13 .. v19}, La/gkb;->c(La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;ILa/fet;II)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_1

    .line 139
    .line 140
    :cond_5
    instance-of v7, v5, La/ard0;

    .line 141
    .line 142
    if-eqz v7, :cond_6

    .line 143
    .line 144
    const v2, 0x7dcca039    # 3.3999304E37f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v0, v10, v14}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    check-cast v5, La/ard0;

    .line 155
    .line 156
    iget-object v14, v5, La/ard0;->d:La/mdm;

    .line 157
    .line 158
    const/16 v18, 0x0

    .line 159
    .line 160
    const/16 v19, 0xc

    .line 161
    .line 162
    const/4 v15, 0x0

    .line 163
    const/16 v16, 0x0

    .line 164
    .line 165
    move-object/from16 v17, v1

    .line 166
    .line 167
    invoke-static/range {v13 .. v19}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_1

    .line 174
    .line 175
    :cond_6
    instance-of v7, v5, La/brd0;

    .line 176
    .line 177
    if-eqz v7, :cond_9

    .line 178
    .line 179
    const v2, 0x7dccb011

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 183
    .line 184
    .line 185
    invoke-interface {v0, v10, v14}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 186
    .line 187
    .line 188
    move-result-object v13

    .line 189
    check-cast v5, La/brd0;

    .line 190
    .line 191
    iget-object v14, v5, La/brd0;->d:La/mdm;

    .line 192
    .line 193
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    if-nez v0, :cond_7

    .line 202
    .line 203
    if-ne v2, v8, :cond_8

    .line 204
    .line 205
    :cond_7
    new-instance v2, La/dbh;

    .line 206
    .line 207
    const/16 v0, 0x1c

    .line 208
    .line 209
    invoke-direct {v2, v3, v0}, La/dbh;-><init>(La/k3t0;B)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_8
    move-object/from16 v16, v2

    .line 216
    .line 217
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 218
    .line 219
    const/16 v18, 0x0

    .line 220
    .line 221
    const/16 v19, 0x4

    .line 222
    .line 223
    const/4 v15, 0x0

    .line 224
    move-object/from16 v17, v1

    .line 225
    .line 226
    invoke-static/range {v13 .. v19}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 230
    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_9
    instance-of v0, v5, La/crd0;

    .line 234
    .line 235
    if-eqz v0, :cond_a

    .line 236
    .line 237
    const v0, 0x3bcd5855

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 241
    .line 242
    .line 243
    invoke-static {v10, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    sget-object v0, La/qmk;->a:La/zcl;

    .line 248
    .line 249
    const/4 v15, 0x0

    .line 250
    const/16 v16, 0xd

    .line 251
    .line 252
    const/4 v12, 0x0

    .line 253
    const/high16 v13, 0x41000000    # 8.0f

    .line 254
    .line 255
    const/4 v14, 0x0

    .line 256
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    sget-object v3, La/dy2;->a:La/zfn;

    .line 261
    .line 262
    invoke-virtual {v1, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    check-cast v3, Landroid/content/res/Configuration;

    .line 267
    .line 268
    iget v3, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 269
    .line 270
    int-to-float v3, v3

    .line 271
    sub-float/2addr v3, v2

    .line 272
    invoke-static {v3}, La/iym0;->r(F)I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    invoke-static {v2, v6, v1, v0}, La/s0x;->t(IILa/fet;La/mm40;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 280
    .line 281
    .line 282
    goto :goto_1

    .line 283
    :cond_a
    const v0, 0x7dcc58c9

    .line 284
    .line 285
    .line 286
    invoke-static {v0, v1, v6}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    throw v0

    .line 291
    :cond_b
    invoke-virtual {v1}, La/fet;->X()V

    .line 292
    .line 293
    .line 294
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    return-object v0

    .line 297
    :pswitch_0
    move-object/from16 v1, p1

    .line 298
    .line 299
    check-cast v1, La/ir8;

    .line 300
    .line 301
    move-object/from16 v2, p2

    .line 302
    .line 303
    check-cast v2, La/fet;

    .line 304
    .line 305
    move-object/from16 v3, p3

    .line 306
    .line 307
    check-cast v3, Ljava/lang/Integer;

    .line 308
    .line 309
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    sget-object v4, La/gqw0;->e:La/zx7;

    .line 314
    .line 315
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    and-int/lit8 v13, v3, 0x6

    .line 319
    .line 320
    if-nez v13, :cond_d

    .line 321
    .line 322
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v13

    .line 326
    if-eqz v13, :cond_c

    .line 327
    .line 328
    move v11, v12

    .line 329
    :cond_c
    or-int/2addr v3, v11

    .line 330
    :cond_d
    and-int/lit8 v11, v3, 0x13

    .line 331
    .line 332
    if-eq v11, v5, :cond_e

    .line 333
    .line 334
    move v5, v7

    .line 335
    goto :goto_2

    .line 336
    :cond_e
    move v5, v6

    .line 337
    :goto_2
    and-int/2addr v3, v7

    .line 338
    invoke-virtual {v2, v3, v5}, La/fet;->U(IZ)Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-eqz v3, :cond_18

    .line 343
    .line 344
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    check-cast v3, La/drd0;

    .line 349
    .line 350
    if-eqz v3, :cond_17

    .line 351
    .line 352
    instance-of v5, v3, La/brd0;

    .line 353
    .line 354
    iget-object v15, v0, La/fg00;->c:La/k3t0;

    .line 355
    .line 356
    if-eqz v5, :cond_11

    .line 357
    .line 358
    const v0, 0x32c82273

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 362
    .line 363
    .line 364
    invoke-interface {v1, v10, v4}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    check-cast v3, La/brd0;

    .line 369
    .line 370
    iget-object v1, v3, La/brd0;->d:La/mdm;

    .line 371
    .line 372
    invoke-virtual {v2, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v3

    .line 376
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    if-nez v3, :cond_f

    .line 381
    .line 382
    if-ne v4, v8, :cond_10

    .line 383
    .line 384
    :cond_f
    new-instance v4, La/dbh;

    .line 385
    .line 386
    const/16 v3, 0xf

    .line 387
    .line 388
    invoke-direct {v4, v15, v3}, La/dbh;-><init>(La/k3t0;B)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    :cond_10
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 395
    .line 396
    invoke-static {v0, v1, v4, v2, v6}, La/vdx;->b(La/mm40;La/mdm;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v6}, La/fet;->r(Z)V

    .line 400
    .line 401
    .line 402
    goto/16 :goto_3

    .line 403
    .line 404
    :cond_11
    instance-of v0, v3, La/ard0;

    .line 405
    .line 406
    if-eqz v0, :cond_13

    .line 407
    .line 408
    const v0, 0x32c842a1

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 412
    .line 413
    .line 414
    invoke-interface {v1, v10, v4}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    check-cast v3, La/ard0;

    .line 419
    .line 420
    iget-object v1, v3, La/ard0;->d:La/mdm;

    .line 421
    .line 422
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    if-ne v3, v8, :cond_12

    .line 427
    .line 428
    new-instance v3, La/wm90;

    .line 429
    .line 430
    invoke-direct {v3, v12}, La/wm90;-><init>(B)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    :cond_12
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 437
    .line 438
    const/16 v4, 0x180

    .line 439
    .line 440
    invoke-static {v0, v1, v3, v2, v4}, La/vdx;->b(La/mm40;La/mdm;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v6}, La/fet;->r(Z)V

    .line 444
    .line 445
    .line 446
    goto :goto_3

    .line 447
    :cond_13
    instance-of v0, v3, La/zqd0;

    .line 448
    .line 449
    if-eqz v0, :cond_16

    .line 450
    .line 451
    const v0, 0x32c85cd9

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 455
    .line 456
    .line 457
    check-cast v3, La/zqd0;

    .line 458
    .line 459
    iget-object v0, v3, La/zqd0;->d:La/a4x;

    .line 460
    .line 461
    invoke-virtual {v2, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    if-nez v1, :cond_14

    .line 470
    .line 471
    if-ne v3, v8, :cond_15

    .line 472
    .line 473
    :cond_14
    new-instance v13, La/yi90;

    .line 474
    .line 475
    const/16 v19, 0x0

    .line 476
    .line 477
    const/16 v20, 0x9

    .line 478
    .line 479
    const/4 v14, 0x1

    .line 480
    const-class v16, La/k3t0;

    .line 481
    .line 482
    const-string v17, "onAction"

    .line 483
    .line 484
    const-string v18, "onAction(Ljava/lang/Object;)V"

    .line 485
    .line 486
    invoke-direct/range {v13 .. v20}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    move-object v3, v13

    .line 493
    :cond_15
    check-cast v3, La/jhy;

    .line 494
    .line 495
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 496
    .line 497
    invoke-static {v0, v3, v2, v6}, La/vdx;->k(Ljava/util/List;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2, v6}, La/fet;->r(Z)V

    .line 501
    .line 502
    .line 503
    goto :goto_3

    .line 504
    :cond_16
    instance-of v0, v3, La/crd0;

    .line 505
    .line 506
    if-eqz v0, :cond_17

    .line 507
    .line 508
    const v0, 0x32c871c3

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 512
    .line 513
    .line 514
    invoke-static {v6, v2}, La/vdx;->z(ILa/fet;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v6}, La/fet;->r(Z)V

    .line 518
    .line 519
    .line 520
    goto :goto_3

    .line 521
    :cond_17
    const v0, 0x32c81b19

    .line 522
    .line 523
    .line 524
    invoke-static {v0, v2, v6}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    throw v0

    .line 529
    :cond_18
    invoke-virtual {v2}, La/fet;->X()V

    .line 530
    .line 531
    .line 532
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 533
    .line 534
    return-object v0

    .line 535
    :pswitch_1
    move-object/from16 v0, p1

    .line 536
    .line 537
    check-cast v0, La/ir8;

    .line 538
    .line 539
    move-object/from16 v1, p2

    .line 540
    .line 541
    check-cast v1, La/fet;

    .line 542
    .line 543
    move-object/from16 v13, p3

    .line 544
    .line 545
    check-cast v13, Ljava/lang/Integer;

    .line 546
    .line 547
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 548
    .line 549
    .line 550
    move-result v13

    .line 551
    sget-object v14, La/gqw0;->e:La/zx7;

    .line 552
    .line 553
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    and-int/lit8 v15, v13, 0x6

    .line 557
    .line 558
    if-nez v15, :cond_1a

    .line 559
    .line 560
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v15

    .line 564
    if-eqz v15, :cond_19

    .line 565
    .line 566
    goto :goto_4

    .line 567
    :cond_19
    move v12, v11

    .line 568
    :goto_4
    or-int/2addr v13, v12

    .line 569
    :cond_1a
    and-int/lit8 v12, v13, 0x13

    .line 570
    .line 571
    if-eq v12, v5, :cond_1b

    .line 572
    .line 573
    move v5, v7

    .line 574
    goto :goto_5

    .line 575
    :cond_1b
    move v5, v6

    .line 576
    :goto_5
    and-int/2addr v7, v13

    .line 577
    invoke-virtual {v1, v7, v5}, La/fet;->U(IZ)Z

    .line 578
    .line 579
    .line 580
    move-result v5

    .line 581
    if-eqz v5, :cond_24

    .line 582
    .line 583
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v5

    .line 587
    check-cast v5, La/drd0;

    .line 588
    .line 589
    if-eqz v5, :cond_23

    .line 590
    .line 591
    instance-of v7, v5, La/zqd0;

    .line 592
    .line 593
    if-eqz v7, :cond_1e

    .line 594
    .line 595
    const v0, 0x3a953058

    .line 596
    .line 597
    .line 598
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 599
    .line 600
    .line 601
    check-cast v5, La/zqd0;

    .line 602
    .line 603
    iget-object v13, v5, La/zqd0;->d:La/a4x;

    .line 604
    .line 605
    invoke-static {v10, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 606
    .line 607
    .line 608
    move-result-object v14

    .line 609
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    if-nez v0, :cond_1c

    .line 618
    .line 619
    if-ne v2, v8, :cond_1d

    .line 620
    .line 621
    :cond_1c
    new-instance v2, La/ebh;

    .line 622
    .line 623
    invoke-direct {v2, v3, v11}, La/ebh;-><init>(La/k3t0;B)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    :cond_1d
    move-object v15, v2

    .line 630
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 631
    .line 632
    const/16 v18, 0x30

    .line 633
    .line 634
    const/16 v19, 0x8

    .line 635
    .line 636
    const/16 v16, 0x0

    .line 637
    .line 638
    move-object/from16 v17, v1

    .line 639
    .line 640
    invoke-static/range {v13 .. v19}, La/gkb;->c(La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;ILa/fet;II)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 644
    .line 645
    .line 646
    goto/16 :goto_6

    .line 647
    .line 648
    :cond_1e
    instance-of v7, v5, La/ard0;

    .line 649
    .line 650
    if-eqz v7, :cond_1f

    .line 651
    .line 652
    const v2, 0x5478a2f9

    .line 653
    .line 654
    .line 655
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 656
    .line 657
    .line 658
    invoke-interface {v0, v10, v14}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 659
    .line 660
    .line 661
    move-result-object v13

    .line 662
    check-cast v5, La/ard0;

    .line 663
    .line 664
    iget-object v14, v5, La/ard0;->d:La/mdm;

    .line 665
    .line 666
    const/16 v18, 0x0

    .line 667
    .line 668
    const/16 v19, 0xc

    .line 669
    .line 670
    const/4 v15, 0x0

    .line 671
    const/16 v16, 0x0

    .line 672
    .line 673
    move-object/from16 v17, v1

    .line 674
    .line 675
    invoke-static/range {v13 .. v19}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 679
    .line 680
    .line 681
    goto :goto_6

    .line 682
    :cond_1f
    instance-of v7, v5, La/brd0;

    .line 683
    .line 684
    if-eqz v7, :cond_22

    .line 685
    .line 686
    const v2, 0x5478b2d1

    .line 687
    .line 688
    .line 689
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 690
    .line 691
    .line 692
    invoke-interface {v0, v10, v14}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 693
    .line 694
    .line 695
    move-result-object v13

    .line 696
    check-cast v5, La/brd0;

    .line 697
    .line 698
    iget-object v14, v5, La/brd0;->d:La/mdm;

    .line 699
    .line 700
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-result v0

    .line 704
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    if-nez v0, :cond_20

    .line 709
    .line 710
    if-ne v2, v8, :cond_21

    .line 711
    .line 712
    :cond_20
    new-instance v2, La/dbh;

    .line 713
    .line 714
    const/16 v0, 0xa

    .line 715
    .line 716
    invoke-direct {v2, v3, v0}, La/dbh;-><init>(La/k3t0;B)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    :cond_21
    move-object/from16 v16, v2

    .line 723
    .line 724
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 725
    .line 726
    const/16 v18, 0x0

    .line 727
    .line 728
    const/16 v19, 0x4

    .line 729
    .line 730
    const/4 v15, 0x0

    .line 731
    move-object/from16 v17, v1

    .line 732
    .line 733
    invoke-static/range {v13 .. v19}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 737
    .line 738
    .line 739
    goto :goto_6

    .line 740
    :cond_22
    instance-of v0, v5, La/crd0;

    .line 741
    .line 742
    if-eqz v0, :cond_23

    .line 743
    .line 744
    const v0, 0x3aa1669f

    .line 745
    .line 746
    .line 747
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 748
    .line 749
    .line 750
    sget-object v0, La/dy2;->a:La/zfn;

    .line 751
    .line 752
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    check-cast v0, Landroid/content/res/Configuration;

    .line 757
    .line 758
    iget v0, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 759
    .line 760
    int-to-float v0, v0

    .line 761
    sget-object v3, La/qmk;->a:La/zcl;

    .line 762
    .line 763
    sub-float/2addr v0, v2

    .line 764
    invoke-static {v0}, La/iym0;->r(F)I

    .line 765
    .line 766
    .line 767
    move-result v0

    .line 768
    invoke-static {v10, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    const/16 v3, 0x30

    .line 773
    .line 774
    invoke-static {v0, v3, v1, v2}, La/s0x;->t(IILa/fet;La/mm40;)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 778
    .line 779
    .line 780
    goto :goto_6

    .line 781
    :cond_23
    const v0, 0x547862a3

    .line 782
    .line 783
    .line 784
    invoke-static {v0, v1, v6}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    throw v0

    .line 789
    :cond_24
    invoke-virtual {v1}, La/fet;->X()V

    .line 790
    .line 791
    .line 792
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 793
    .line 794
    return-object v0

    .line 795
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
