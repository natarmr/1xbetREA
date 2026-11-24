.class public final synthetic La/cw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cw0;->a:B

    iput-object p1, p0, La/cw0;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/l7m0;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/cw0;->a:B

    iput-object p1, p0, La/cw0;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cw0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x6

    .line 7
    sget-object v4, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    const/high16 v5, 0x3f800000    # 1.0f

    .line 10
    .line 11
    sget-object v6, La/jm40;->b:La/jm40;

    .line 12
    .line 13
    const/4 v7, 0x2

    .line 14
    const/4 v8, 0x3

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x1

    .line 17
    iget-object v0, v0, La/cw0;->b:La/l7m0;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, La/fet;

    .line 25
    .line 26
    move-object/from16 v2, p2

    .line 27
    .line 28
    check-cast v2, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v10}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {v0, v1, v2}, La/knx;->z(La/l7m0;La/fet;I)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_0
    move-object/from16 v1, p1

    .line 44
    .line 45
    check-cast v1, La/fet;

    .line 46
    .line 47
    move-object/from16 v2, p2

    .line 48
    .line 49
    check-cast v2, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    and-int/lit8 v3, v2, 0x3

    .line 56
    .line 57
    if-eq v3, v7, :cond_0

    .line 58
    .line 59
    move v3, v10

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v3, v9

    .line 62
    :goto_0
    and-int/2addr v2, v10

    .line 63
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_6

    .line 68
    .line 69
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/q1m0;

    .line 74
    .line 75
    instance-of v2, v0, La/p1m0;

    .line 76
    .line 77
    if-eqz v2, :cond_5

    .line 78
    .line 79
    const v2, -0x69a7cb49

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 83
    .line 84
    .line 85
    check-cast v0, La/p1m0;

    .line 86
    .line 87
    iget-object v0, v0, La/p1m0;->b:Ljava/util/List;

    .line 88
    .line 89
    new-instance v2, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_2

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    instance-of v7, v3, La/i1m0;

    .line 109
    .line 110
    if-eqz v7, :cond_1

    .line 111
    .line 112
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    invoke-static {v9, v9, v1, v9, v8}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    invoke-static {v6, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0, v5}, La/o7k0;->c(La/mm40;F)La/mm40;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    or-int/2addr v0, v3

    .line 137
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-nez v0, :cond_3

    .line 142
    .line 143
    if-ne v3, v4, :cond_4

    .line 144
    .line 145
    :cond_3
    new-instance v3, La/u5l0;

    .line 146
    .line 147
    const/16 v0, 0xe

    .line 148
    .line 149
    invoke-direct {v3, v2, v11, v0}, La/u5l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    move-object/from16 v18, v3

    .line 156
    .line 157
    check-cast v18, Lkotlin/jvm/functions/Function1;

    .line 158
    .line 159
    const/16 v20, 0x6

    .line 160
    .line 161
    const/16 v21, 0x1fc

    .line 162
    .line 163
    const/4 v12, 0x0

    .line 164
    const/4 v13, 0x0

    .line 165
    const/4 v14, 0x0

    .line 166
    const/4 v15, 0x0

    .line 167
    const/16 v16, 0x0

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    move-object/from16 v19, v1

    .line 172
    .line 173
    invoke-static/range {v10 .. v21}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 174
    .line 175
    .line 176
    move-object/from16 v0, v19

    .line 177
    .line 178
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_5
    move-object v0, v1

    .line 183
    const v1, -0x6992755a

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_6
    move-object v0, v1

    .line 194
    invoke-virtual {v0}, La/fet;->X()V

    .line 195
    .line 196
    .line 197
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object v0

    .line 200
    :pswitch_1
    move-object/from16 v1, p1

    .line 201
    .line 202
    check-cast v1, La/fet;

    .line 203
    .line 204
    move-object/from16 v2, p2

    .line 205
    .line 206
    check-cast v2, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-static {v10}, La/x8x;->L(I)I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    invoke-static {v0, v1, v2}, La/g8x;->m(La/l7m0;La/fet;I)V

    .line 216
    .line 217
    .line 218
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object v0

    .line 221
    :pswitch_2
    move-object/from16 v1, p1

    .line 222
    .line 223
    check-cast v1, La/fet;

    .line 224
    .line 225
    move-object/from16 v2, p2

    .line 226
    .line 227
    check-cast v2, Ljava/lang/Integer;

    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    and-int/lit8 v3, v2, 0x3

    .line 234
    .line 235
    if-eq v3, v7, :cond_7

    .line 236
    .line 237
    move v3, v10

    .line 238
    goto :goto_3

    .line 239
    :cond_7
    move v3, v9

    .line 240
    :goto_3
    and-int/2addr v2, v10

    .line 241
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-eqz v2, :cond_8

    .line 246
    .line 247
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    check-cast v0, La/iu70;

    .line 252
    .line 253
    iget-object v0, v0, La/iu70;->j:Ljava/lang/String;

    .line 254
    .line 255
    const/4 v2, 0x0

    .line 256
    invoke-static {v9, v1, v2, v0}, La/d7x;->e(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_8
    invoke-virtual {v1}, La/fet;->X()V

    .line 261
    .line 262
    .line 263
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_3
    move v1, v9

    .line 267
    move-object/from16 v9, p1

    .line 268
    .line 269
    check-cast v9, La/fet;

    .line 270
    .line 271
    move-object/from16 v2, p2

    .line 272
    .line 273
    check-cast v2, Ljava/lang/Integer;

    .line 274
    .line 275
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    and-int/lit8 v3, v2, 0x3

    .line 280
    .line 281
    if-eq v3, v7, :cond_9

    .line 282
    .line 283
    move v1, v10

    .line 284
    :cond_9
    and-int/2addr v2, v10

    .line 285
    invoke-virtual {v9, v2, v1}, La/fet;->U(IZ)Z

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-eqz v1, :cond_a

    .line 290
    .line 291
    invoke-static {v6, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, La/iu70;

    .line 300
    .line 301
    iget v2, v0, La/iu70;->r:I

    .line 302
    .line 303
    const/4 v8, 0x0

    .line 304
    const/4 v10, 0x6

    .line 305
    const-wide/16 v3, 0x0

    .line 306
    .line 307
    const/4 v5, 0x0

    .line 308
    const-wide/16 v6, 0x0

    .line 309
    .line 310
    invoke-static/range {v1 .. v10}, La/zjb;->c(La/mm40;IJLa/nrq;JILa/fet;I)V

    .line 311
    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_a
    invoke-virtual {v9}, La/fet;->X()V

    .line 315
    .line 316
    .line 317
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    return-object v0

    .line 320
    :pswitch_4
    move-object/from16 v1, p1

    .line 321
    .line 322
    check-cast v1, La/fet;

    .line 323
    .line 324
    move-object/from16 v2, p2

    .line 325
    .line 326
    check-cast v2, Ljava/lang/Integer;

    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    invoke-static {v10}, La/x8x;->L(I)I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    invoke-static {v0, v1, v2}, La/jar0;->l(La/l7m0;La/fet;I)V

    .line 336
    .line 337
    .line 338
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    return-object v0

    .line 341
    :pswitch_5
    move v1, v9

    .line 342
    move-object/from16 v2, p1

    .line 343
    .line 344
    check-cast v2, La/fet;

    .line 345
    .line 346
    move-object/from16 v3, p2

    .line 347
    .line 348
    check-cast v3, Ljava/lang/Integer;

    .line 349
    .line 350
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    and-int/lit8 v4, v3, 0x3

    .line 355
    .line 356
    if-eq v4, v7, :cond_b

    .line 357
    .line 358
    move v4, v10

    .line 359
    goto :goto_6

    .line 360
    :cond_b
    move v4, v1

    .line 361
    :goto_6
    and-int/2addr v3, v10

    .line 362
    invoke-virtual {v2, v3, v4}, La/fet;->U(IZ)Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-eqz v3, :cond_c

    .line 367
    .line 368
    invoke-static {v0, v2, v1}, La/lmc;->v(La/l7m0;La/fet;I)V

    .line 369
    .line 370
    .line 371
    goto :goto_7

    .line 372
    :cond_c
    invoke-virtual {v2}, La/fet;->X()V

    .line 373
    .line 374
    .line 375
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 376
    .line 377
    return-object v0

    .line 378
    :pswitch_6
    move-object/from16 v1, p1

    .line 379
    .line 380
    check-cast v1, La/fet;

    .line 381
    .line 382
    move-object/from16 v2, p2

    .line 383
    .line 384
    check-cast v2, Ljava/lang/Integer;

    .line 385
    .line 386
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    invoke-static {v10}, La/x8x;->L(I)I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    invoke-static {v0, v1, v2}, La/lmc;->v(La/l7m0;La/fet;I)V

    .line 394
    .line 395
    .line 396
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 397
    .line 398
    return-object v0

    .line 399
    :pswitch_7
    move v1, v9

    .line 400
    move-object/from16 v8, p1

    .line 401
    .line 402
    check-cast v8, La/fet;

    .line 403
    .line 404
    move-object/from16 v9, p2

    .line 405
    .line 406
    check-cast v9, Ljava/lang/Integer;

    .line 407
    .line 408
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 409
    .line 410
    .line 411
    move-result v9

    .line 412
    and-int/lit8 v11, v9, 0x3

    .line 413
    .line 414
    if-eq v11, v7, :cond_d

    .line 415
    .line 416
    move v7, v10

    .line 417
    goto :goto_8

    .line 418
    :cond_d
    move v7, v1

    .line 419
    :goto_8
    and-int/2addr v9, v10

    .line 420
    invoke-virtual {v8, v9, v7}, La/fet;->U(IZ)Z

    .line 421
    .line 422
    .line 423
    move-result v7

    .line 424
    if-eqz v7, :cond_11

    .line 425
    .line 426
    invoke-static {v6, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 427
    .line 428
    .line 429
    move-result-object v5

    .line 430
    sget-object v7, La/qmk;->a:La/zcl;

    .line 431
    .line 432
    const/high16 v7, 0x43660000    # 230.0f

    .line 433
    .line 434
    invoke-static {v5, v7}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    sget-object v7, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 439
    .line 440
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 441
    .line 442
    .line 443
    move-result-wide v11

    .line 444
    sget-object v7, La/qmk;->i:La/zcl;

    .line 445
    .line 446
    sget-object v9, La/vgg0;->a:La/ugg0;

    .line 447
    .line 448
    new-instance v9, La/ugg0;

    .line 449
    .line 450
    invoke-direct {v9, v7, v7, v7, v7}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 451
    .line 452
    .line 453
    invoke-static {v5, v11, v12, v9}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    const/high16 v7, 0x41000000    # 8.0f

    .line 458
    .line 459
    invoke-static {v5, v2, v7, v10}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    sget-object v5, La/uc9;->c:La/mw3;

    .line 464
    .line 465
    sget-object v7, La/gqw0;->m:La/xx7;

    .line 466
    .line 467
    invoke-static {v5, v7, v8, v1}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 468
    .line 469
    .line 470
    move-result-object v5

    .line 471
    iget-wide v11, v8, La/fet;->T:J

    .line 472
    .line 473
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 474
    .line 475
    .line 476
    move-result v7

    .line 477
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 478
    .line 479
    .line 480
    move-result-object v9

    .line 481
    invoke-static {v8, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 486
    .line 487
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v8}, La/fet;->i0()V

    .line 491
    .line 492
    .line 493
    iget-boolean v11, v8, La/fet;->S:Z

    .line 494
    .line 495
    if-eqz v11, :cond_e

    .line 496
    .line 497
    sget-object v11, La/e7z;->u1:La/pcy;

    .line 498
    .line 499
    invoke-virtual {v8, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 500
    .line 501
    .line 502
    goto :goto_9

    .line 503
    :cond_e
    invoke-virtual {v8}, La/fet;->r0()V

    .line 504
    .line 505
    .line 506
    :goto_9
    sget-object v11, La/gqw0;->x:La/shd;

    .line 507
    .line 508
    invoke-static {v8, v5, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 509
    .line 510
    .line 511
    sget-object v5, La/gqw0;->w:La/shd;

    .line 512
    .line 513
    invoke-static {v8, v9, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 514
    .line 515
    .line 516
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    sget-object v7, La/gqw0;->y:La/shd;

    .line 521
    .line 522
    invoke-static {v8, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 523
    .line 524
    .line 525
    invoke-static {v8}, La/jpm0;->n(La/fet;)V

    .line 526
    .line 527
    .line 528
    sget-object v5, La/gqw0;->v:La/shd;

    .line 529
    .line 530
    invoke-static {v8, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 531
    .line 532
    .line 533
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    check-cast v2, La/uls;

    .line 538
    .line 539
    invoke-static {v2, v8, v1}, La/plc;->p(La/uls;La/fet;I)V

    .line 540
    .line 541
    .line 542
    const-string v2, "00:00"

    .line 543
    .line 544
    invoke-static {v2, v8, v3}, La/obb;->B(Ljava/lang/String;La/fet;I)V

    .line 545
    .line 546
    .line 547
    const/high16 v2, 0x43200000    # 160.0f

    .line 548
    .line 549
    invoke-static {v6, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 550
    .line 551
    .line 552
    move-result-object v11

    .line 553
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    if-nez v2, :cond_f

    .line 562
    .line 563
    if-ne v5, v4, :cond_10

    .line 564
    .line 565
    :cond_f
    new-instance v5, La/ufp;

    .line 566
    .line 567
    invoke-direct {v5, v0, v3}, La/ufp;-><init>(La/l7m0;B)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v8, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    :cond_10
    move-object/from16 v19, v5

    .line 574
    .line 575
    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 576
    .line 577
    const/16 v21, 0x0

    .line 578
    .line 579
    const/16 v22, 0x1fe

    .line 580
    .line 581
    const/4 v12, 0x0

    .line 582
    const/4 v13, 0x0

    .line 583
    const/4 v14, 0x0

    .line 584
    const/4 v15, 0x0

    .line 585
    const/16 v16, 0x0

    .line 586
    .line 587
    const/16 v17, 0x0

    .line 588
    .line 589
    const/16 v18, 0x0

    .line 590
    .line 591
    move-object/from16 v20, v8

    .line 592
    .line 593
    invoke-static/range {v11 .. v22}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 594
    .line 595
    .line 596
    move-object/from16 v2, v20

    .line 597
    .line 598
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    check-cast v0, La/uls;

    .line 603
    .line 604
    iget-object v0, v0, La/uls;->c:Ljava/lang/String;

    .line 605
    .line 606
    invoke-static {v0, v2, v1}, La/obb;->B(Ljava/lang/String;La/fet;I)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2, v10}, La/fet;->r(Z)V

    .line 610
    .line 611
    .line 612
    goto :goto_a

    .line 613
    :cond_11
    move-object v2, v8

    .line 614
    invoke-virtual {v2}, La/fet;->X()V

    .line 615
    .line 616
    .line 617
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 618
    .line 619
    return-object v0

    .line 620
    :pswitch_8
    move v1, v9

    .line 621
    move-object/from16 v2, p1

    .line 622
    .line 623
    check-cast v2, La/fet;

    .line 624
    .line 625
    move-object/from16 v4, p2

    .line 626
    .line 627
    check-cast v4, Ljava/lang/Integer;

    .line 628
    .line 629
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 630
    .line 631
    .line 632
    move-result v4

    .line 633
    and-int/lit8 v8, v4, 0x3

    .line 634
    .line 635
    if-eq v8, v7, :cond_12

    .line 636
    .line 637
    move v7, v10

    .line 638
    goto :goto_b

    .line 639
    :cond_12
    move v7, v1

    .line 640
    :goto_b
    and-int/2addr v4, v10

    .line 641
    invoke-virtual {v2, v4, v7}, La/fet;->U(IZ)Z

    .line 642
    .line 643
    .line 644
    move-result v4

    .line 645
    if-eqz v4, :cond_13

    .line 646
    .line 647
    invoke-static {v6, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    check-cast v0, La/o3l;

    .line 656
    .line 657
    iget-object v0, v0, La/o3l;->a:La/o6m;

    .line 658
    .line 659
    invoke-static {v4, v0, v2, v3, v1}, La/n6m;->b(La/mm40;La/o6m;La/fet;II)V

    .line 660
    .line 661
    .line 662
    goto :goto_c

    .line 663
    :cond_13
    invoke-virtual {v2}, La/fet;->X()V

    .line 664
    .line 665
    .line 666
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 667
    .line 668
    return-object v0

    .line 669
    :pswitch_9
    move-object/from16 v1, p1

    .line 670
    .line 671
    check-cast v1, La/fet;

    .line 672
    .line 673
    move-object/from16 v2, p2

    .line 674
    .line 675
    check-cast v2, Ljava/lang/Integer;

    .line 676
    .line 677
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    invoke-static {v10}, La/x8x;->L(I)I

    .line 681
    .line 682
    .line 683
    move-result v2

    .line 684
    invoke-static {v0, v1, v2}, La/y860;->y(La/l7m0;La/fet;I)V

    .line 685
    .line 686
    .line 687
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 688
    .line 689
    return-object v0

    .line 690
    :pswitch_a
    move-object/from16 v1, p1

    .line 691
    .line 692
    check-cast v1, La/fet;

    .line 693
    .line 694
    move-object/from16 v2, p2

    .line 695
    .line 696
    check-cast v2, Ljava/lang/Integer;

    .line 697
    .line 698
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    invoke-static {v10}, La/x8x;->L(I)I

    .line 702
    .line 703
    .line 704
    move-result v2

    .line 705
    invoke-static {v0, v1, v2}, La/y860;->z(La/l7m0;La/fet;I)V

    .line 706
    .line 707
    .line 708
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 709
    .line 710
    return-object v0

    .line 711
    :pswitch_b
    move v1, v9

    .line 712
    move-object/from16 v2, p1

    .line 713
    .line 714
    check-cast v2, La/fet;

    .line 715
    .line 716
    move-object/from16 v3, p2

    .line 717
    .line 718
    check-cast v3, Ljava/lang/Integer;

    .line 719
    .line 720
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 721
    .line 722
    .line 723
    move-result v3

    .line 724
    and-int/lit8 v5, v3, 0x3

    .line 725
    .line 726
    if-eq v5, v7, :cond_14

    .line 727
    .line 728
    move v5, v10

    .line 729
    goto :goto_d

    .line 730
    :cond_14
    move v5, v1

    .line 731
    :goto_d
    and-int/2addr v3, v10

    .line 732
    invoke-virtual {v2, v3, v5}, La/fet;->U(IZ)Z

    .line 733
    .line 734
    .line 735
    move-result v3

    .line 736
    if-eqz v3, :cond_17

    .line 737
    .line 738
    sget-object v3, La/qmk;->a:La/zcl;

    .line 739
    .line 740
    const/high16 v3, 0x41a00000    # 20.0f

    .line 741
    .line 742
    invoke-static {v6, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    move-result v5

    .line 750
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v6

    .line 754
    if-nez v5, :cond_15

    .line 755
    .line 756
    if-ne v6, v4, :cond_16

    .line 757
    .line 758
    :cond_15
    new-instance v6, La/x1d;

    .line 759
    .line 760
    const/16 v4, 0x8

    .line 761
    .line 762
    invoke-direct {v6, v0, v4}, La/x1d;-><init>(La/l7m0;B)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v2, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    :cond_16
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 769
    .line 770
    invoke-static {v3, v6}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 771
    .line 772
    .line 773
    move-result-object v3

    .line 774
    const v0, 0x7f080815

    .line 775
    .line 776
    .line 777
    invoke-static {v0, v1, v2}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 778
    .line 779
    .line 780
    move-result-object v1

    .line 781
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 782
    .line 783
    invoke-virtual {v2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 788
    .line 789
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 790
    .line 791
    .line 792
    move-result-wide v4

    .line 793
    const/16 v7, 0x38

    .line 794
    .line 795
    const/4 v8, 0x0

    .line 796
    move-object v6, v2

    .line 797
    const/4 v2, 0x0

    .line 798
    invoke-static/range {v1 .. v8}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 799
    .line 800
    .line 801
    goto :goto_e

    .line 802
    :cond_17
    move-object v6, v2

    .line 803
    invoke-virtual {v6}, La/fet;->X()V

    .line 804
    .line 805
    .line 806
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 807
    .line 808
    return-object v0

    .line 809
    :pswitch_c
    move v1, v9

    .line 810
    move-object/from16 v3, p1

    .line 811
    .line 812
    check-cast v3, La/fet;

    .line 813
    .line 814
    move-object/from16 v5, p2

    .line 815
    .line 816
    check-cast v5, Ljava/lang/Integer;

    .line 817
    .line 818
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 819
    .line 820
    .line 821
    move-result v5

    .line 822
    and-int/lit8 v8, v5, 0x3

    .line 823
    .line 824
    if-eq v8, v7, :cond_18

    .line 825
    .line 826
    move v9, v10

    .line 827
    goto :goto_f

    .line 828
    :cond_18
    move v9, v1

    .line 829
    :goto_f
    and-int/lit8 v1, v5, 0x1

    .line 830
    .line 831
    invoke-virtual {v3, v1, v9}, La/fet;->U(IZ)Z

    .line 832
    .line 833
    .line 834
    move-result v1

    .line 835
    if-eqz v1, :cond_1b

    .line 836
    .line 837
    sget-object v1, La/qmk;->a:La/zcl;

    .line 838
    .line 839
    const/high16 v1, 0x40800000    # 4.0f

    .line 840
    .line 841
    invoke-static {v6, v1, v2, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    const/high16 v2, 0x40c00000    # 6.0f

    .line 846
    .line 847
    const/high16 v5, 0x42200000    # 40.0f

    .line 848
    .line 849
    invoke-static {v1, v5, v2}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    sget-object v2, La/vgg0;->a:La/ugg0;

    .line 854
    .line 855
    invoke-static {v1, v2}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    invoke-virtual {v3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    move-result v2

    .line 863
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v5

    .line 867
    if-nez v2, :cond_19

    .line 868
    .line 869
    if-ne v5, v4, :cond_1a

    .line 870
    .line 871
    :cond_19
    new-instance v5, La/eka;

    .line 872
    .line 873
    const/16 v2, 0xc

    .line 874
    .line 875
    invoke-direct {v5, v0, v2}, La/eka;-><init>(La/l7m0;B)V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v3, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 879
    .line 880
    .line 881
    :cond_1a
    move-object v6, v5

    .line 882
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 883
    .line 884
    const/4 v8, 0x0

    .line 885
    move-object v7, v3

    .line 886
    const-wide/16 v2, 0x0

    .line 887
    .line 888
    const-wide/16 v4, 0x0

    .line 889
    .line 890
    invoke-static/range {v1 .. v8}, La/hkb;->u(La/mm40;JJLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 891
    .line 892
    .line 893
    goto :goto_10

    .line 894
    :cond_1b
    move-object v7, v3

    .line 895
    invoke-virtual {v7}, La/fet;->X()V

    .line 896
    .line 897
    .line 898
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 899
    .line 900
    return-object v0

    .line 901
    :pswitch_d
    move-object/from16 v1, p1

    .line 902
    .line 903
    check-cast v1, La/fet;

    .line 904
    .line 905
    move-object/from16 v2, p2

    .line 906
    .line 907
    check-cast v2, Ljava/lang/Integer;

    .line 908
    .line 909
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    invoke-static {v10}, La/x8x;->L(I)I

    .line 913
    .line 914
    .line 915
    move-result v2

    .line 916
    invoke-static {v2, v1, v6, v0}, La/jiq0;->f(ILa/fet;La/mm40;La/l7m0;)V

    .line 917
    .line 918
    .line 919
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 920
    .line 921
    return-object v0

    .line 922
    :pswitch_e
    move-object/from16 v1, p1

    .line 923
    .line 924
    check-cast v1, La/fet;

    .line 925
    .line 926
    move-object/from16 v2, p2

    .line 927
    .line 928
    check-cast v2, Ljava/lang/Integer;

    .line 929
    .line 930
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 931
    .line 932
    .line 933
    invoke-static {v10}, La/x8x;->L(I)I

    .line 934
    .line 935
    .line 936
    move-result v2

    .line 937
    invoke-static {v0, v1, v2}, La/j47;->N(La/l7m0;La/fet;I)V

    .line 938
    .line 939
    .line 940
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 941
    .line 942
    return-object v0

    .line 943
    :pswitch_f
    move v1, v9

    .line 944
    move-object/from16 v2, p1

    .line 945
    .line 946
    check-cast v2, La/fet;

    .line 947
    .line 948
    move-object/from16 v3, p2

    .line 949
    .line 950
    check-cast v3, Ljava/lang/Integer;

    .line 951
    .line 952
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 953
    .line 954
    .line 955
    move-result v3

    .line 956
    and-int/lit8 v4, v3, 0x3

    .line 957
    .line 958
    if-eq v4, v7, :cond_1c

    .line 959
    .line 960
    move v9, v10

    .line 961
    goto :goto_11

    .line 962
    :cond_1c
    move v9, v1

    .line 963
    :goto_11
    and-int/lit8 v1, v3, 0x1

    .line 964
    .line 965
    invoke-virtual {v2, v1, v9}, La/fet;->U(IZ)Z

    .line 966
    .line 967
    .line 968
    move-result v1

    .line 969
    if-eqz v1, :cond_1d

    .line 970
    .line 971
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 972
    .line 973
    .line 974
    const-string v1, "ToolbarTitleTestTag"

    .line 975
    .line 976
    invoke-static {v6, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 977
    .line 978
    .line 979
    move-result-object v1

    .line 980
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    check-cast v0, La/nw0;

    .line 985
    .line 986
    iget-object v0, v0, La/nw0;->a:Ljava/lang/String;

    .line 987
    .line 988
    sget-object v3, La/m8m0;->a:La/zfn;

    .line 989
    .line 990
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v3

    .line 994
    check-cast v3, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 995
    .line 996
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 997
    .line 998
    .line 999
    move-result-wide v3

    .line 1000
    sget-object v10, La/j1t0;->b:La/qrq;

    .line 1001
    .line 1002
    new-instance v13, La/f2q0;

    .line 1003
    .line 1004
    invoke-direct {v13, v8}, La/f2q0;-><init>(I)V

    .line 1005
    .line 1006
    .line 1007
    const/16 v24, 0x6180

    .line 1008
    .line 1009
    const v25, 0x3ab78

    .line 1010
    .line 1011
    .line 1012
    const/4 v5, 0x0

    .line 1013
    const-wide/16 v6, 0x0

    .line 1014
    .line 1015
    const/4 v8, 0x0

    .line 1016
    const/4 v9, 0x0

    .line 1017
    const-wide/16 v11, 0x0

    .line 1018
    .line 1019
    const-wide/16 v14, 0x0

    .line 1020
    .line 1021
    const/16 v16, 0x2

    .line 1022
    .line 1023
    const/16 v17, 0x0

    .line 1024
    .line 1025
    const/16 v18, 0x2

    .line 1026
    .line 1027
    const/16 v19, 0x0

    .line 1028
    .line 1029
    const/16 v20, 0x0

    .line 1030
    .line 1031
    const/16 v21, 0x0

    .line 1032
    .line 1033
    const/16 v23, 0x0

    .line 1034
    .line 1035
    move-object/from16 v22, v2

    .line 1036
    .line 1037
    move-object v2, v1

    .line 1038
    move-object v1, v0

    .line 1039
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1040
    .line 1041
    .line 1042
    goto :goto_12

    .line 1043
    :cond_1d
    move-object/from16 v22, v2

    .line 1044
    .line 1045
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 1046
    .line 1047
    .line 1048
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1049
    .line 1050
    return-object v0

    .line 1051
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
