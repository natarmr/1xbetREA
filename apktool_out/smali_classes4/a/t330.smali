.class public final synthetic La/t330;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/t330;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/vhe;)V
    .locals 0

    .line 1
    const/16 p1, 0xf

    iput-byte p1, p0, La/t330;->a:B

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
    iget-byte v0, v0, La/t330;->a:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v0, p1

    .line 13
    .line 14
    check-cast v0, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-object/from16 v0, p2

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Float;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p3

    .line 27
    .line 28
    check-cast v0, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object/from16 v0, p1

    .line 37
    .line 38
    check-cast v0, La/y5d;

    .line 39
    .line 40
    move-object/from16 v11, p2

    .line 41
    .line 42
    check-cast v11, La/fet;

    .line 43
    .line 44
    move-object/from16 v2, p3

    .line 45
    .line 46
    check-cast v2, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    and-int/lit8 v0, v2, 0x11

    .line 56
    .line 57
    const/16 v14, 0x10

    .line 58
    .line 59
    if-eq v0, v14, :cond_0

    .line 60
    .line 61
    move v0, v4

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v0, v3

    .line 64
    :goto_0
    and-int/2addr v2, v4

    .line 65
    invoke-virtual {v11, v2, v0}, La/fet;->U(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    new-instance v6, La/ijm;

    .line 72
    .line 73
    invoke-direct {v6}, La/ijm;-><init>()V

    .line 74
    .line 75
    .line 76
    sget-object v7, La/kjm;->b:La/kjm;

    .line 77
    .line 78
    const/16 v12, 0x180

    .line 79
    .line 80
    const/16 v13, 0x39

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v8, 0x0

    .line 84
    const/4 v9, 0x0

    .line 85
    const/4 v10, 0x0

    .line 86
    invoke-static/range {v5 .. v13}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 87
    .line 88
    .line 89
    move v0, v3

    .line 90
    :goto_1
    if-ge v0, v14, :cond_2

    .line 91
    .line 92
    sget-object v2, La/jm40;->b:La/jm40;

    .line 93
    .line 94
    const/high16 v5, 0x3f800000    # 1.0f

    .line 95
    .line 96
    invoke-static {v2, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    sget-object v5, La/qmk;->a:La/zcl;

    .line 101
    .line 102
    const/high16 v5, 0x42600000    # 56.0f

    .line 103
    .line 104
    invoke-static {v2, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 105
    .line 106
    .line 107
    move-result-object v15

    .line 108
    const/high16 v19, 0x41000000    # 8.0f

    .line 109
    .line 110
    const/16 v20, 0x7

    .line 111
    .line 112
    const/16 v16, 0x0

    .line 113
    .line 114
    const/16 v17, 0x0

    .line 115
    .line 116
    const/16 v18, 0x0

    .line 117
    .line 118
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    sget-object v5, La/qmk;->i:La/zcl;

    .line 123
    .line 124
    sget-object v6, La/vgg0;->a:La/ugg0;

    .line 125
    .line 126
    invoke-static {v5, v5, v5, v5, v2}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-static {v1, v11, v3, v4}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-static {v2, v5}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-static {v11, v2}, La/qxw;->o(La/fet;La/mm40;)V

    .line 139
    .line 140
    .line 141
    add-int/lit8 v0, v0, 0x1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_1
    invoke-virtual {v11}, La/fet;->X()V

    .line 145
    .line 146
    .line 147
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_1
    move-object/from16 v0, p1

    .line 151
    .line 152
    check-cast v0, La/vj30;

    .line 153
    .line 154
    move-object/from16 v1, p2

    .line 155
    .line 156
    check-cast v1, La/pj30;

    .line 157
    .line 158
    move-object/from16 v2, p3

    .line 159
    .line 160
    check-cast v2, La/p4e;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    sget-object v3, La/qmk;->a:La/zcl;

    .line 169
    .line 170
    const/high16 v3, 0x41c00000    # 24.0f

    .line 171
    .line 172
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    add-int/2addr v3, v4

    .line 177
    iget-wide v4, v2, La/p4e;->a:J

    .line 178
    .line 179
    invoke-static {v4, v5}, La/p4e;->h(J)I

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    add-int v8, v6, v3

    .line 184
    .line 185
    iget-wide v11, v2, La/p4e;->a:J

    .line 186
    .line 187
    invoke-static {v11, v12}, La/p4e;->h(J)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    add-int v9, v2, v3

    .line 192
    .line 193
    const/4 v10, 0x3

    .line 194
    const/4 v6, 0x0

    .line 195
    const/4 v7, 0x0

    .line 196
    invoke-static/range {v4 .. v10}, La/p4e;->b(JIIIII)J

    .line 197
    .line 198
    .line 199
    move-result-wide v4

    .line 200
    invoke-interface {v1, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    iget v2, v1, La/pu90;->a:I

    .line 205
    .line 206
    invoke-static {v11, v12}, La/p4e;->h(J)I

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    new-instance v5, La/n7;

    .line 211
    .line 212
    const/16 v6, 0x12

    .line 213
    .line 214
    invoke-direct {v5, v1, v3, v6}, La/n7;-><init>(La/pu90;IB)V

    .line 215
    .line 216
    .line 217
    invoke-static {v0, v2, v4, v5}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    return-object v0

    .line 222
    :pswitch_2
    move-object/from16 v0, p1

    .line 223
    .line 224
    check-cast v0, La/x8z;

    .line 225
    .line 226
    move-object/from16 v1, p2

    .line 227
    .line 228
    check-cast v1, Ljava/lang/Integer;

    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 231
    .line 232
    .line 233
    move-object/from16 v1, p3

    .line 234
    .line 235
    check-cast v1, La/p6t0;

    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    instance-of v0, v1, La/jy30;

    .line 244
    .line 245
    if-eqz v0, :cond_3

    .line 246
    .line 247
    invoke-static {v4}, La/q8x;->e(I)J

    .line 248
    .line 249
    .line 250
    move-result-wide v0

    .line 251
    goto :goto_2

    .line 252
    :cond_3
    invoke-static {v2}, La/q8x;->e(I)J

    .line 253
    .line 254
    .line 255
    move-result-wide v0

    .line 256
    :goto_2
    new-instance v2, La/pgv;

    .line 257
    .line 258
    invoke-direct {v2, v0, v1}, La/pgv;-><init>(J)V

    .line 259
    .line 260
    .line 261
    return-object v2

    .line 262
    :pswitch_3
    move-object/from16 v0, p1

    .line 263
    .line 264
    check-cast v0, La/p6t0;

    .line 265
    .line 266
    move-object/from16 v1, p2

    .line 267
    .line 268
    check-cast v1, Ljava/util/List;

    .line 269
    .line 270
    move-object/from16 v2, p3

    .line 271
    .line 272
    check-cast v2, Ljava/lang/Integer;

    .line 273
    .line 274
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    instance-of v1, v0, La/yjn0;

    .line 284
    .line 285
    if-eqz v1, :cond_4

    .line 286
    .line 287
    check-cast v0, La/yjn0;

    .line 288
    .line 289
    iget-object v0, v0, La/yjn0;->f:La/rjn0;

    .line 290
    .line 291
    sget-object v1, La/rjn0;->c:La/rjn0;

    .line 292
    .line 293
    if-ne v0, v1, :cond_4

    .line 294
    .line 295
    move v3, v4

    .line 296
    :cond_4
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    return-object v0

    .line 301
    :pswitch_4
    move-object/from16 v0, p1

    .line 302
    .line 303
    check-cast v0, La/p6t0;

    .line 304
    .line 305
    move-object/from16 v1, p2

    .line 306
    .line 307
    check-cast v1, Ljava/util/List;

    .line 308
    .line 309
    move-object/from16 v2, p3

    .line 310
    .line 311
    check-cast v2, Ljava/lang/Integer;

    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    instance-of v1, v0, La/yjn0;

    .line 323
    .line 324
    if-eqz v1, :cond_5

    .line 325
    .line 326
    check-cast v0, La/yjn0;

    .line 327
    .line 328
    iget-object v0, v0, La/yjn0;->f:La/rjn0;

    .line 329
    .line 330
    sget-object v1, La/rjn0;->b:La/rjn0;

    .line 331
    .line 332
    if-ne v0, v1, :cond_5

    .line 333
    .line 334
    move v3, v4

    .line 335
    :cond_5
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    return-object v0

    .line 340
    :pswitch_5
    move-object/from16 v0, p1

    .line 341
    .line 342
    check-cast v0, La/x8z;

    .line 343
    .line 344
    move-object/from16 v1, p2

    .line 345
    .line 346
    check-cast v1, Ljava/lang/Integer;

    .line 347
    .line 348
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 349
    .line 350
    .line 351
    move-object/from16 v1, p3

    .line 352
    .line 353
    check-cast v1, La/p6t0;

    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    instance-of v0, v1, La/nfh0;

    .line 362
    .line 363
    if-eqz v0, :cond_6

    .line 364
    .line 365
    invoke-static {v2}, La/q8x;->e(I)J

    .line 366
    .line 367
    .line 368
    move-result-wide v0

    .line 369
    goto :goto_3

    .line 370
    :cond_6
    instance-of v0, v1, La/ofh0;

    .line 371
    .line 372
    if-eqz v0, :cond_7

    .line 373
    .line 374
    invoke-static {v2}, La/q8x;->e(I)J

    .line 375
    .line 376
    .line 377
    move-result-wide v0

    .line 378
    goto :goto_3

    .line 379
    :cond_7
    instance-of v0, v1, La/zfh0;

    .line 380
    .line 381
    if-eqz v0, :cond_9

    .line 382
    .line 383
    check-cast v1, La/zfh0;

    .line 384
    .line 385
    iget-boolean v0, v1, La/zfh0;->b:Z

    .line 386
    .line 387
    if-eqz v0, :cond_8

    .line 388
    .line 389
    move v2, v4

    .line 390
    :cond_8
    invoke-static {v2}, La/q8x;->e(I)J

    .line 391
    .line 392
    .line 393
    move-result-wide v0

    .line 394
    goto :goto_3

    .line 395
    :cond_9
    invoke-static {v4}, La/q8x;->e(I)J

    .line 396
    .line 397
    .line 398
    move-result-wide v0

    .line 399
    :goto_3
    new-instance v2, La/pgv;

    .line 400
    .line 401
    invoke-direct {v2, v0, v1}, La/pgv;-><init>(J)V

    .line 402
    .line 403
    .line 404
    return-object v2

    .line 405
    :pswitch_6
    move-object/from16 v0, p1

    .line 406
    .line 407
    check-cast v0, La/tcz;

    .line 408
    .line 409
    move-object/from16 v1, p2

    .line 410
    .line 411
    check-cast v1, Ljava/lang/Integer;

    .line 412
    .line 413
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 414
    .line 415
    .line 416
    move-object/from16 v1, p3

    .line 417
    .line 418
    check-cast v1, Ljava/lang/Integer;

    .line 419
    .line 420
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    return-object v1

    .line 427
    :pswitch_7
    move-object/from16 v0, p1

    .line 428
    .line 429
    check-cast v0, La/tcz;

    .line 430
    .line 431
    move-object/from16 v1, p2

    .line 432
    .line 433
    check-cast v1, Ljava/lang/Integer;

    .line 434
    .line 435
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    move-object/from16 v2, p3

    .line 440
    .line 441
    check-cast v2, Ljava/lang/Integer;

    .line 442
    .line 443
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    add-int/lit8 v0, v1, -0x1

    .line 451
    .line 452
    add-int/2addr v1, v4

    .line 453
    invoke-static {v2, v0, v1}, La/l1e0;->d(III)I

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    return-object v0

    .line 462
    :pswitch_8
    move-object/from16 v0, p1

    .line 463
    .line 464
    check-cast v0, Ljava/lang/Long;

    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 467
    .line 468
    .line 469
    move-object/from16 v0, p2

    .line 470
    .line 471
    check-cast v0, Ljava/lang/String;

    .line 472
    .line 473
    move-object/from16 v1, p3

    .line 474
    .line 475
    check-cast v1, Ljava/lang/Boolean;

    .line 476
    .line 477
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 484
    .line 485
    return-object v0

    .line 486
    :pswitch_9
    move-object/from16 v0, p1

    .line 487
    .line 488
    check-cast v0, La/x8z;

    .line 489
    .line 490
    move-object/from16 v3, p2

    .line 491
    .line 492
    check-cast v3, Ljava/lang/Integer;

    .line 493
    .line 494
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    move-object/from16 v3, p3

    .line 498
    .line 499
    check-cast v3, La/p6t0;

    .line 500
    .line 501
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    instance-of v0, v3, La/pqv;

    .line 508
    .line 509
    if-nez v0, :cond_c

    .line 510
    .line 511
    instance-of v0, v3, La/ly30;

    .line 512
    .line 513
    if-nez v0, :cond_c

    .line 514
    .line 515
    instance-of v0, v3, La/my30;

    .line 516
    .line 517
    if-eqz v0, :cond_a

    .line 518
    .line 519
    move-object v1, v3

    .line 520
    check-cast v1, La/my30;

    .line 521
    .line 522
    :cond_a
    if-eqz v1, :cond_b

    .line 523
    .line 524
    invoke-interface {v1}, La/my30;->y0()Z

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    if-ne v0, v4, :cond_b

    .line 529
    .line 530
    goto :goto_4

    .line 531
    :cond_b
    invoke-static {v4}, La/q8x;->e(I)J

    .line 532
    .line 533
    .line 534
    move-result-wide v0

    .line 535
    goto :goto_5

    .line 536
    :cond_c
    :goto_4
    invoke-static {v2}, La/q8x;->e(I)J

    .line 537
    .line 538
    .line 539
    move-result-wide v0

    .line 540
    :goto_5
    new-instance v2, La/pgv;

    .line 541
    .line 542
    invoke-direct {v2, v0, v1}, La/pgv;-><init>(J)V

    .line 543
    .line 544
    .line 545
    return-object v2

    .line 546
    :pswitch_a
    move-object/from16 v0, p1

    .line 547
    .line 548
    check-cast v0, Ljava/lang/Integer;

    .line 549
    .line 550
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    move-object/from16 v0, p2

    .line 554
    .line 555
    check-cast v0, Ljava/lang/Integer;

    .line 556
    .line 557
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    move-object/from16 v0, p3

    .line 561
    .line 562
    check-cast v0, Ljava/lang/Integer;

    .line 563
    .line 564
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 568
    .line 569
    return-object v0

    .line 570
    :pswitch_b
    move-object/from16 v0, p1

    .line 571
    .line 572
    check-cast v0, La/vj30;

    .line 573
    .line 574
    move-object/from16 v1, p2

    .line 575
    .line 576
    check-cast v1, La/pj30;

    .line 577
    .line 578
    move-object/from16 v2, p3

    .line 579
    .line 580
    check-cast v2, La/p4e;

    .line 581
    .line 582
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    sget-object v5, La/qmk;->a:La/zcl;

    .line 589
    .line 590
    const/high16 v5, 0x43e00000    # 448.0f

    .line 591
    .line 592
    invoke-interface {v0, v5}, La/w6k;->T(F)I

    .line 593
    .line 594
    .line 595
    move-result v5

    .line 596
    const/high16 v6, 0x42b00000    # 88.0f

    .line 597
    .line 598
    invoke-interface {v0, v6}, La/w6k;->T(F)I

    .line 599
    .line 600
    .line 601
    move-result v6

    .line 602
    iget-wide v7, v2, La/p4e;->a:J

    .line 603
    .line 604
    invoke-static {v7, v8}, La/p4e;->e(J)Z

    .line 605
    .line 606
    .line 607
    move-result v7

    .line 608
    if-eqz v7, :cond_d

    .line 609
    .line 610
    iget-wide v7, v2, La/p4e;->a:J

    .line 611
    .line 612
    invoke-static {v7, v8}, La/p4e;->i(J)I

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    goto :goto_6

    .line 617
    :cond_d
    move v2, v5

    .line 618
    :goto_6
    int-to-float v2, v2

    .line 619
    const v7, 0x3f4ccccd    # 0.8f

    .line 620
    .line 621
    .line 622
    mul-float/2addr v2, v7

    .line 623
    float-to-int v2, v2

    .line 624
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 625
    .line 626
    .line 627
    move-result v2

    .line 628
    const v5, 0x7fffffff

    .line 629
    .line 630
    .line 631
    invoke-interface {v1, v5}, La/pj30;->L(I)I

    .line 632
    .line 633
    .line 634
    move-result v7

    .line 635
    invoke-interface {v1, v5}, La/pj30;->D(I)I

    .line 636
    .line 637
    .line 638
    move-result v5

    .line 639
    if-lez v7, :cond_e

    .line 640
    .line 641
    if-lez v5, :cond_e

    .line 642
    .line 643
    int-to-float v8, v2

    .line 644
    int-to-float v5, v5

    .line 645
    mul-float/2addr v8, v5

    .line 646
    int-to-float v5, v7

    .line 647
    div-float/2addr v8, v5

    .line 648
    float-to-int v5, v8

    .line 649
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 650
    .line 651
    .line 652
    move-result v5

    .line 653
    goto :goto_7

    .line 654
    :cond_e
    move v5, v3

    .line 655
    :goto_7
    if-ltz v2, :cond_f

    .line 656
    .line 657
    move v6, v4

    .line 658
    goto :goto_8

    .line 659
    :cond_f
    move v6, v3

    .line 660
    :goto_8
    if-ltz v5, :cond_10

    .line 661
    .line 662
    move v3, v4

    .line 663
    :cond_10
    and-int/2addr v3, v6

    .line 664
    if-nez v3, :cond_11

    .line 665
    .line 666
    const-string v3, "width and height must be >= 0"

    .line 667
    .line 668
    invoke-static {v3}, La/zcx;->a(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    :cond_11
    invoke-static {v2, v2, v5, v5}, La/r4e;->h(IIII)J

    .line 672
    .line 673
    .line 674
    move-result-wide v3

    .line 675
    invoke-interface {v1, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 676
    .line 677
    .line 678
    move-result-object v1

    .line 679
    new-instance v3, La/cam;

    .line 680
    .line 681
    const/16 v4, 0x13

    .line 682
    .line 683
    invoke-direct {v3, v1, v4}, La/cam;-><init>(La/pu90;B)V

    .line 684
    .line 685
    .line 686
    invoke-static {v0, v2, v5, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    return-object v0

    .line 691
    :pswitch_c
    move-object/from16 v0, p1

    .line 692
    .line 693
    check-cast v0, La/vj30;

    .line 694
    .line 695
    move-object/from16 v1, p2

    .line 696
    .line 697
    check-cast v1, La/pj30;

    .line 698
    .line 699
    move-object/from16 v2, p3

    .line 700
    .line 701
    check-cast v2, La/p4e;

    .line 702
    .line 703
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    sget-object v3, La/qmk;->a:La/zcl;

    .line 710
    .line 711
    const/high16 v3, 0x41000000    # 8.0f

    .line 712
    .line 713
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 714
    .line 715
    .line 716
    move-result v3

    .line 717
    iget-wide v4, v2, La/p4e;->a:J

    .line 718
    .line 719
    invoke-static {v4, v5}, La/p4e;->i(J)I

    .line 720
    .line 721
    .line 722
    move-result v4

    .line 723
    sub-int/2addr v4, v3

    .line 724
    int-to-float v4, v4

    .line 725
    const v5, 0x3fe38e39

    .line 726
    .line 727
    .line 728
    div-float/2addr v4, v5

    .line 729
    int-to-float v3, v3

    .line 730
    add-float/2addr v4, v3

    .line 731
    float-to-int v9, v4

    .line 732
    iget-wide v5, v2, La/p4e;->a:J

    .line 733
    .line 734
    const/4 v8, 0x0

    .line 735
    const/4 v11, 0x3

    .line 736
    const/4 v7, 0x0

    .line 737
    move v10, v9

    .line 738
    invoke-static/range {v5 .. v11}, La/p4e;->b(JIIIII)J

    .line 739
    .line 740
    .line 741
    move-result-wide v2

    .line 742
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    iget v2, v1, La/pu90;->a:I

    .line 747
    .line 748
    iget v3, v1, La/pu90;->b:I

    .line 749
    .line 750
    new-instance v4, La/cam;

    .line 751
    .line 752
    const/16 v5, 0xd

    .line 753
    .line 754
    invoke-direct {v4, v1, v5}, La/cam;-><init>(La/pu90;B)V

    .line 755
    .line 756
    .line 757
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    return-object v0

    .line 762
    :pswitch_d
    move-object/from16 v0, p1

    .line 763
    .line 764
    check-cast v0, Ljava/lang/Long;

    .line 765
    .line 766
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 767
    .line 768
    .line 769
    move-object/from16 v0, p2

    .line 770
    .line 771
    check-cast v0, Ljava/lang/String;

    .line 772
    .line 773
    move-object/from16 v1, p3

    .line 774
    .line 775
    check-cast v1, Ljava/lang/Boolean;

    .line 776
    .line 777
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 778
    .line 779
    .line 780
    sget-object v1, La/v330;->Q1:La/xuz;

    .line 781
    .line 782
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 783
    .line 784
    .line 785
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 786
    .line 787
    return-object v0

    .line 788
    :pswitch_e
    move-object/from16 v0, p1

    .line 789
    .line 790
    check-cast v0, Ljava/lang/Long;

    .line 791
    .line 792
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 793
    .line 794
    .line 795
    move-object/from16 v0, p2

    .line 796
    .line 797
    check-cast v0, Ljava/lang/String;

    .line 798
    .line 799
    move-object/from16 v1, p3

    .line 800
    .line 801
    check-cast v1, Ljava/lang/Boolean;

    .line 802
    .line 803
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 804
    .line 805
    .line 806
    sget-object v1, La/v330;->Q1:La/xuz;

    .line 807
    .line 808
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 812
    .line 813
    return-object v0

    .line 814
    :pswitch_f
    move-object/from16 v0, p1

    .line 815
    .line 816
    check-cast v0, Ljava/lang/Long;

    .line 817
    .line 818
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    move-object/from16 v0, p2

    .line 822
    .line 823
    check-cast v0, Ljava/lang/Long;

    .line 824
    .line 825
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 826
    .line 827
    .line 828
    move-object/from16 v0, p3

    .line 829
    .line 830
    check-cast v0, Ljava/lang/Double;

    .line 831
    .line 832
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    sget-object v0, La/v330;->Q1:La/xuz;

    .line 836
    .line 837
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 838
    .line 839
    return-object v0

    .line 840
    nop

    .line 841
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
