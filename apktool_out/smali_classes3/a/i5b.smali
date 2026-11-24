.class public final synthetic La/i5b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/i5b;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/i5b;->a:B

    .line 4
    .line 5
    const/16 v1, 0x18

    .line 6
    .line 7
    const/16 v2, 0x38

    .line 8
    .line 9
    const/high16 v3, 0x41800000    # 16.0f

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/high16 v6, 0x41000000    # 8.0f

    .line 14
    .line 15
    const/high16 v7, 0x3f800000    # 1.0f

    .line 16
    .line 17
    const/16 v8, 0x12

    .line 18
    .line 19
    const/4 v9, 0x4

    .line 20
    sget-object v10, La/jm40;->b:La/jm40;

    .line 21
    .line 22
    const/4 v11, 0x2

    .line 23
    const/4 v12, 0x6

    .line 24
    const/16 v13, 0x10

    .line 25
    .line 26
    const/4 v14, 0x0

    .line 27
    const/4 v15, 0x1

    .line 28
    packed-switch v0, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    move-object/from16 v0, p1

    .line 32
    .line 33
    check-cast v0, La/mm40;

    .line 34
    .line 35
    move-object/from16 v1, p2

    .line 36
    .line 37
    check-cast v1, La/fet;

    .line 38
    .line 39
    move-object/from16 v3, p3

    .line 40
    .line 41
    check-cast v3, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    and-int/lit8 v4, v3, 0x6

    .line 51
    .line 52
    if-nez v4, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v9, v11

    .line 62
    :goto_0
    or-int/2addr v3, v9

    .line 63
    :cond_1
    and-int/lit8 v4, v3, 0x13

    .line 64
    .line 65
    if-eq v4, v8, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move v15, v14

    .line 69
    :goto_1
    and-int/lit8 v4, v3, 0x1

    .line 70
    .line 71
    invoke-virtual {v1, v4, v15}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_3

    .line 76
    .line 77
    const v4, 0x7f0809ee

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v14, v1}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 81
    .line 82
    .line 83
    move-result-object v16

    .line 84
    shl-int/2addr v3, v12

    .line 85
    and-int/lit16 v3, v3, 0x380

    .line 86
    .line 87
    or-int v22, v2, v3

    .line 88
    .line 89
    const/16 v23, 0x8

    .line 90
    .line 91
    const/16 v17, 0x0

    .line 92
    .line 93
    const-wide/16 v19, 0x0

    .line 94
    .line 95
    move-object/from16 v18, v0

    .line 96
    .line 97
    move-object/from16 v21, v1

    .line 98
    .line 99
    invoke-static/range {v16 .. v23}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    move-object/from16 v21, v1

    .line 104
    .line 105
    invoke-virtual/range {v21 .. v21}, La/fet;->X()V

    .line 106
    .line 107
    .line 108
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_0
    move-object/from16 v3, p1

    .line 112
    .line 113
    check-cast v3, La/mm40;

    .line 114
    .line 115
    move-object/from16 v6, p2

    .line 116
    .line 117
    check-cast v6, La/fet;

    .line 118
    .line 119
    move-object/from16 v0, p3

    .line 120
    .line 121
    check-cast v0, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    and-int/lit8 v1, v0, 0x6

    .line 131
    .line 132
    if-nez v1, :cond_5

    .line 133
    .line 134
    invoke-virtual {v6, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_4

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_4
    move v9, v11

    .line 142
    :goto_3
    or-int/2addr v0, v9

    .line 143
    :cond_5
    and-int/lit8 v1, v0, 0x13

    .line 144
    .line 145
    if-eq v1, v8, :cond_6

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_6
    move v15, v14

    .line 149
    :goto_4
    and-int/lit8 v1, v0, 0x1

    .line 150
    .line 151
    invoke-virtual {v6, v1, v15}, La/fet;->U(IZ)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_7

    .line 156
    .line 157
    const v1, 0x7f0807d9

    .line 158
    .line 159
    .line 160
    invoke-static {v1, v14, v6}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    shl-int/2addr v0, v12

    .line 165
    and-int/lit16 v0, v0, 0x380

    .line 166
    .line 167
    or-int v7, v2, v0

    .line 168
    .line 169
    const/16 v8, 0x8

    .line 170
    .line 171
    const/4 v2, 0x0

    .line 172
    const-wide/16 v4, 0x0

    .line 173
    .line 174
    invoke-static/range {v1 .. v8}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 175
    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_7
    invoke-virtual {v6}, La/fet;->X()V

    .line 179
    .line 180
    .line 181
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object v0

    .line 184
    :pswitch_1
    move-object/from16 v0, p1

    .line 185
    .line 186
    check-cast v0, La/y5d;

    .line 187
    .line 188
    move-object/from16 v1, p2

    .line 189
    .line 190
    check-cast v1, La/fet;

    .line 191
    .line 192
    move-object/from16 v2, p3

    .line 193
    .line 194
    check-cast v2, Ljava/lang/Integer;

    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    and-int/lit8 v3, v2, 0x6

    .line 204
    .line 205
    if-nez v3, :cond_9

    .line 206
    .line 207
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-eqz v3, :cond_8

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_8
    move v9, v11

    .line 215
    :goto_6
    or-int/2addr v2, v9

    .line 216
    :cond_9
    and-int/lit8 v3, v2, 0x13

    .line 217
    .line 218
    if-eq v3, v8, :cond_a

    .line 219
    .line 220
    move v3, v15

    .line 221
    goto :goto_7

    .line 222
    :cond_a
    move v3, v14

    .line 223
    :goto_7
    and-int/2addr v2, v15

    .line 224
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-eqz v2, :cond_b

    .line 229
    .line 230
    invoke-static {v10, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    sget-object v3, La/gqw0;->n:La/xx7;

    .line 235
    .line 236
    invoke-virtual {v0, v2, v3}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    sget-object v0, La/qmk;->a:La/zcl;

    .line 241
    .line 242
    const/4 v8, 0x0

    .line 243
    const/16 v9, 0xd

    .line 244
    .line 245
    const/4 v5, 0x0

    .line 246
    const/high16 v6, 0x41e00000    # 28.0f

    .line 247
    .line 248
    const/4 v7, 0x0

    .line 249
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 250
    .line 251
    .line 252
    move-result-object v16

    .line 253
    const v0, 0x7f13046c

    .line 254
    .line 255
    .line 256
    invoke-static {v0, v14, v1}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v17

    .line 260
    const/16 v24, 0x0

    .line 261
    .line 262
    const/16 v25, 0x1c

    .line 263
    .line 264
    const-wide/16 v18, 0x0

    .line 265
    .line 266
    const/16 v20, 0x0

    .line 267
    .line 268
    const-wide/16 v21, 0x0

    .line 269
    .line 270
    move-object/from16 v23, v1

    .line 271
    .line 272
    invoke-static/range {v16 .. v25}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 273
    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_b
    move-object/from16 v23, v1

    .line 277
    .line 278
    invoke-virtual/range {v23 .. v23}, La/fet;->X()V

    .line 279
    .line 280
    .line 281
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object v0

    .line 284
    :pswitch_2
    move-object/from16 v0, p1

    .line 285
    .line 286
    check-cast v0, La/g9z;

    .line 287
    .line 288
    move-object/from16 v1, p2

    .line 289
    .line 290
    check-cast v1, La/fet;

    .line 291
    .line 292
    move-object/from16 v2, p3

    .line 293
    .line 294
    check-cast v2, Ljava/lang/Integer;

    .line 295
    .line 296
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    and-int/lit8 v0, v2, 0x11

    .line 304
    .line 305
    if-eq v0, v13, :cond_c

    .line 306
    .line 307
    move v0, v15

    .line 308
    goto :goto_9

    .line 309
    :cond_c
    move v0, v14

    .line 310
    :goto_9
    and-int/2addr v2, v15

    .line 311
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-eqz v0, :cond_10

    .line 316
    .line 317
    sget-object v0, La/qmk;->i:La/zcl;

    .line 318
    .line 319
    sget-object v2, La/vgg0;->a:La/ugg0;

    .line 320
    .line 321
    sget-object v2, La/jm40;->b:La/jm40;

    .line 322
    .line 323
    invoke-static {v0, v0, v0, v0, v2}, La/dw9;->i(La/zcl;La/zcl;La/zcl;La/zcl;La/jm40;)La/mm40;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 328
    .line 329
    invoke-virtual {v1, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 334
    .line 335
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 336
    .line 337
    .line 338
    move-result-wide v7

    .line 339
    sget-object v3, La/jd8;->n:La/ljc;

    .line 340
    .line 341
    invoke-static {v0, v7, v8, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {v0, v6, v5, v11}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 346
    .line 347
    .line 348
    move-result-object v16

    .line 349
    const/high16 v20, 0x40000000    # 2.0f

    .line 350
    .line 351
    const/16 v21, 0x5

    .line 352
    .line 353
    const/16 v17, 0x0

    .line 354
    .line 355
    const/high16 v18, 0x41000000    # 8.0f

    .line 356
    .line 357
    const/16 v19, 0x0

    .line 358
    .line 359
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    sget-object v3, La/uc9;->c:La/mw3;

    .line 364
    .line 365
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 366
    .line 367
    invoke-static {v3, v5, v1, v14}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    iget-wide v5, v1, La/fet;->T:J

    .line 372
    .line 373
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 386
    .line 387
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1}, La/fet;->i0()V

    .line 391
    .line 392
    .line 393
    iget-boolean v7, v1, La/fet;->S:Z

    .line 394
    .line 395
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 396
    .line 397
    if-eqz v7, :cond_d

    .line 398
    .line 399
    invoke-virtual {v1, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 400
    .line 401
    .line 402
    goto :goto_a

    .line 403
    :cond_d
    invoke-virtual {v1}, La/fet;->r0()V

    .line 404
    .line 405
    .line 406
    :goto_a
    sget-object v7, La/gqw0;->x:La/shd;

    .line 407
    .line 408
    invoke-static {v1, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 409
    .line 410
    .line 411
    sget-object v3, La/gqw0;->w:La/shd;

    .line 412
    .line 413
    invoke-static {v1, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 414
    .line 415
    .line 416
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    sget-object v6, La/gqw0;->y:La/shd;

    .line 421
    .line 422
    invoke-static {v1, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 423
    .line 424
    .line 425
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 426
    .line 427
    .line 428
    sget-object v5, La/gqw0;->v:La/shd;

    .line 429
    .line 430
    invoke-static {v1, v0, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x41f00000    # 30.0f

    .line 434
    .line 435
    invoke-static {v2, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    sget-object v9, La/gqw0;->e:La/zx7;

    .line 440
    .line 441
    invoke-static {v9, v14}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 442
    .line 443
    .line 444
    move-result-object v10

    .line 445
    iget-wide v11, v1, La/fet;->T:J

    .line 446
    .line 447
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 448
    .line 449
    .line 450
    move-result v11

    .line 451
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 452
    .line 453
    .line 454
    move-result-object v12

    .line 455
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {v1}, La/fet;->i0()V

    .line 460
    .line 461
    .line 462
    iget-boolean v13, v1, La/fet;->S:Z

    .line 463
    .line 464
    if-eqz v13, :cond_e

    .line 465
    .line 466
    invoke-virtual {v1, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 467
    .line 468
    .line 469
    goto :goto_b

    .line 470
    :cond_e
    invoke-virtual {v1}, La/fet;->r0()V

    .line 471
    .line 472
    .line 473
    :goto_b
    invoke-static {v1, v10, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 474
    .line 475
    .line 476
    invoke-static {v1, v12, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 477
    .line 478
    .line 479
    invoke-static {v11, v1, v6, v1}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 480
    .line 481
    .line 482
    invoke-static {v1, v0, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 483
    .line 484
    .line 485
    const/high16 v0, 0x41600000    # 14.0f

    .line 486
    .line 487
    invoke-static {v2, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    const/high16 v10, 0x43000000    # 128.0f

    .line 492
    .line 493
    invoke-static {v0, v10}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    sget-object v10, La/qmk;->m:La/zcl;

    .line 498
    .line 499
    invoke-static {v10, v10, v10, v10, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-static {v4, v1, v14, v15}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    invoke-static {v0, v4, v1, v14, v15}, La/dw9;->x(La/mm40;La/fqj0;La/fet;IZ)V

    .line 508
    .line 509
    .line 510
    const/high16 v20, 0x40c00000    # 6.0f

    .line 511
    .line 512
    const/16 v21, 0x5

    .line 513
    .line 514
    const/16 v17, 0x0

    .line 515
    .line 516
    const/high16 v18, 0x41000000    # 8.0f

    .line 517
    .line 518
    const/16 v19, 0x0

    .line 519
    .line 520
    move-object/from16 v16, v2

    .line 521
    .line 522
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-static {v9, v14}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    iget-wide v9, v1, La/fet;->T:J

    .line 531
    .line 532
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 533
    .line 534
    .line 535
    move-result v4

    .line 536
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 537
    .line 538
    .line 539
    move-result-object v9

    .line 540
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-virtual {v1}, La/fet;->i0()V

    .line 545
    .line 546
    .line 547
    iget-boolean v10, v1, La/fet;->S:Z

    .line 548
    .line 549
    if-eqz v10, :cond_f

    .line 550
    .line 551
    invoke-virtual {v1, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 552
    .line 553
    .line 554
    goto :goto_c

    .line 555
    :cond_f
    invoke-virtual {v1}, La/fet;->r0()V

    .line 556
    .line 557
    .line 558
    :goto_c
    invoke-static {v1, v2, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 559
    .line 560
    .line 561
    invoke-static {v1, v9, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 562
    .line 563
    .line 564
    invoke-static {v4, v1, v6, v1}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 565
    .line 566
    .line 567
    invoke-static {v1, v0, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 568
    .line 569
    .line 570
    sget-object v0, La/kr00;->a:La/zfn;

    .line 571
    .line 572
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    check-cast v0, Ljava/lang/Boolean;

    .line 577
    .line 578
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 579
    .line 580
    .line 581
    move-result v18

    .line 582
    const/16 v22, 0x30

    .line 583
    .line 584
    const/16 v23, 0x19

    .line 585
    .line 586
    const/16 v16, 0x0

    .line 587
    .line 588
    sget-object v17, La/f4n;->a:La/f4n;

    .line 589
    .line 590
    const/16 v19, 0x0

    .line 591
    .line 592
    const/16 v20, 0x0

    .line 593
    .line 594
    move-object/from16 v21, v1

    .line 595
    .line 596
    invoke-static/range {v16 .. v23}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 597
    .line 598
    .line 599
    move-object/from16 v0, v21

    .line 600
    .line 601
    invoke-virtual {v0, v15}, La/fet;->r(Z)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v0, v15}, La/fet;->r(Z)V

    .line 605
    .line 606
    .line 607
    goto :goto_d

    .line 608
    :cond_10
    move-object v0, v1

    .line 609
    invoke-virtual {v0}, La/fet;->X()V

    .line 610
    .line 611
    .line 612
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 613
    .line 614
    return-object v0

    .line 615
    :pswitch_3
    move-object/from16 v0, p1

    .line 616
    .line 617
    check-cast v0, La/g9z;

    .line 618
    .line 619
    move-object/from16 v1, p2

    .line 620
    .line 621
    check-cast v1, La/fet;

    .line 622
    .line 623
    move-object/from16 v2, p3

    .line 624
    .line 625
    check-cast v2, Ljava/lang/Integer;

    .line 626
    .line 627
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 628
    .line 629
    .line 630
    move-result v2

    .line 631
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    and-int/lit8 v0, v2, 0x11

    .line 635
    .line 636
    if-eq v0, v13, :cond_11

    .line 637
    .line 638
    move v14, v15

    .line 639
    :cond_11
    and-int/lit8 v0, v2, 0x1

    .line 640
    .line 641
    invoke-virtual {v1, v0, v14}, La/fet;->U(IZ)Z

    .line 642
    .line 643
    .line 644
    move-result v0

    .line 645
    if-eqz v0, :cond_12

    .line 646
    .line 647
    invoke-static {v10, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    sget-object v2, La/qmk;->a:La/zcl;

    .line 652
    .line 653
    invoke-static {v0, v3, v6, v3, v6}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 654
    .line 655
    .line 656
    move-result-object v17

    .line 657
    const v0, 0x7f1308ec

    .line 658
    .line 659
    .line 660
    invoke-static {v0, v1}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v16

    .line 664
    sget-object v0, La/j1t0;->e:La/zfn;

    .line 665
    .line 666
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    check-cast v0, La/g1t0;

    .line 671
    .line 672
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    invoke-static {}, La/g1t0;->k()La/y9q0;

    .line 676
    .line 677
    .line 678
    move-result-object v36

    .line 679
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 680
    .line 681
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 686
    .line 687
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 688
    .line 689
    .line 690
    move-result-wide v18

    .line 691
    const/16 v39, 0x0

    .line 692
    .line 693
    const v40, 0x1fff8

    .line 694
    .line 695
    .line 696
    const/16 v20, 0x0

    .line 697
    .line 698
    const-wide/16 v21, 0x0

    .line 699
    .line 700
    const/16 v23, 0x0

    .line 701
    .line 702
    const/16 v24, 0x0

    .line 703
    .line 704
    const/16 v25, 0x0

    .line 705
    .line 706
    const-wide/16 v26, 0x0

    .line 707
    .line 708
    const/16 v28, 0x0

    .line 709
    .line 710
    const-wide/16 v29, 0x0

    .line 711
    .line 712
    const/16 v31, 0x0

    .line 713
    .line 714
    const/16 v32, 0x0

    .line 715
    .line 716
    const/16 v33, 0x0

    .line 717
    .line 718
    const/16 v34, 0x0

    .line 719
    .line 720
    const/16 v35, 0x0

    .line 721
    .line 722
    const/16 v38, 0x0

    .line 723
    .line 724
    move-object/from16 v37, v1

    .line 725
    .line 726
    invoke-static/range {v16 .. v40}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 727
    .line 728
    .line 729
    goto :goto_e

    .line 730
    :cond_12
    move-object/from16 v37, v1

    .line 731
    .line 732
    invoke-virtual/range {v37 .. v37}, La/fet;->X()V

    .line 733
    .line 734
    .line 735
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 736
    .line 737
    return-object v0

    .line 738
    :pswitch_4
    move-object/from16 v0, p1

    .line 739
    .line 740
    check-cast v0, La/g9z;

    .line 741
    .line 742
    move-object/from16 v1, p2

    .line 743
    .line 744
    check-cast v1, La/fet;

    .line 745
    .line 746
    move-object/from16 v2, p3

    .line 747
    .line 748
    check-cast v2, Ljava/lang/Integer;

    .line 749
    .line 750
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 751
    .line 752
    .line 753
    move-result v2

    .line 754
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    and-int/lit8 v0, v2, 0x11

    .line 758
    .line 759
    if-eq v0, v13, :cond_13

    .line 760
    .line 761
    move v14, v15

    .line 762
    :cond_13
    and-int/lit8 v0, v2, 0x1

    .line 763
    .line 764
    invoke-virtual {v1, v0, v14}, La/fet;->U(IZ)Z

    .line 765
    .line 766
    .line 767
    move-result v0

    .line 768
    if-eqz v0, :cond_14

    .line 769
    .line 770
    invoke-static {v10, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    sget-object v2, La/qmk;->a:La/zcl;

    .line 775
    .line 776
    invoke-static {v0, v3, v6, v3, v6}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 777
    .line 778
    .line 779
    move-result-object v17

    .line 780
    const v0, 0x7f130b08

    .line 781
    .line 782
    .line 783
    invoke-static {v0, v1}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v16

    .line 787
    sget-object v0, La/j1t0;->e:La/zfn;

    .line 788
    .line 789
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    check-cast v0, La/g1t0;

    .line 794
    .line 795
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 796
    .line 797
    .line 798
    invoke-static {}, La/g1t0;->k()La/y9q0;

    .line 799
    .line 800
    .line 801
    move-result-object v36

    .line 802
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 803
    .line 804
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 809
    .line 810
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 811
    .line 812
    .line 813
    move-result-wide v18

    .line 814
    const/16 v39, 0x0

    .line 815
    .line 816
    const v40, 0x1fff8

    .line 817
    .line 818
    .line 819
    const/16 v20, 0x0

    .line 820
    .line 821
    const-wide/16 v21, 0x0

    .line 822
    .line 823
    const/16 v23, 0x0

    .line 824
    .line 825
    const/16 v24, 0x0

    .line 826
    .line 827
    const/16 v25, 0x0

    .line 828
    .line 829
    const-wide/16 v26, 0x0

    .line 830
    .line 831
    const/16 v28, 0x0

    .line 832
    .line 833
    const-wide/16 v29, 0x0

    .line 834
    .line 835
    const/16 v31, 0x0

    .line 836
    .line 837
    const/16 v32, 0x0

    .line 838
    .line 839
    const/16 v33, 0x0

    .line 840
    .line 841
    const/16 v34, 0x0

    .line 842
    .line 843
    const/16 v35, 0x0

    .line 844
    .line 845
    const/16 v38, 0x0

    .line 846
    .line 847
    move-object/from16 v37, v1

    .line 848
    .line 849
    invoke-static/range {v16 .. v40}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 850
    .line 851
    .line 852
    goto :goto_f

    .line 853
    :cond_14
    move-object/from16 v37, v1

    .line 854
    .line 855
    invoke-virtual/range {v37 .. v37}, La/fet;->X()V

    .line 856
    .line 857
    .line 858
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 859
    .line 860
    return-object v0

    .line 861
    :pswitch_5
    move-object/from16 v0, p1

    .line 862
    .line 863
    check-cast v0, La/y5d;

    .line 864
    .line 865
    move-object/from16 v2, p2

    .line 866
    .line 867
    check-cast v2, La/fet;

    .line 868
    .line 869
    move-object/from16 v3, p3

    .line 870
    .line 871
    check-cast v3, Ljava/lang/Integer;

    .line 872
    .line 873
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 874
    .line 875
    .line 876
    move-result v3

    .line 877
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    .line 879
    .line 880
    and-int/lit8 v0, v3, 0x11

    .line 881
    .line 882
    const/4 v5, 0x0

    .line 883
    const/4 v6, 0x1

    .line 884
    if-eq v0, v13, :cond_15

    .line 885
    .line 886
    move v0, v6

    .line 887
    goto :goto_10

    .line 888
    :cond_15
    move v0, v5

    .line 889
    :goto_10
    and-int/2addr v3, v6

    .line 890
    invoke-virtual {v2, v3, v0}, La/fet;->U(IZ)Z

    .line 891
    .line 892
    .line 893
    move-result v0

    .line 894
    if-eqz v0, :cond_16

    .line 895
    .line 896
    sget-object v0, La/qmk;->a:La/zcl;

    .line 897
    .line 898
    const/high16 v12, 0x41000000    # 8.0f

    .line 899
    .line 900
    const/4 v13, 0x5

    .line 901
    sget-object v14, La/jm40;->b:La/jm40;

    .line 902
    .line 903
    const/4 v9, 0x0

    .line 904
    const/high16 v10, 0x40c00000    # 6.0f

    .line 905
    .line 906
    const/4 v11, 0x0

    .line 907
    move-object v8, v14

    .line 908
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 909
    .line 910
    .line 911
    move-result-object v14

    .line 912
    sget-object v16, La/kjm;->b:La/kjm;

    .line 913
    .line 914
    new-instance v15, La/ijm;

    .line 915
    .line 916
    invoke-direct {v15}, La/ijm;-><init>()V

    .line 917
    .line 918
    .line 919
    const/16 v21, 0x180

    .line 920
    .line 921
    const/16 v22, 0x38

    .line 922
    .line 923
    const/16 v17, 0x0

    .line 924
    .line 925
    const/16 v18, 0x0

    .line 926
    .line 927
    const/16 v19, 0x0

    .line 928
    .line 929
    move-object/from16 v20, v2

    .line 930
    .line 931
    invoke-static/range {v14 .. v22}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 932
    .line 933
    .line 934
    move-object/from16 v0, v20

    .line 935
    .line 936
    move v2, v5

    .line 937
    :goto_11
    if-ge v2, v1, :cond_17

    .line 938
    .line 939
    sget-object v3, La/qmk;->a:La/zcl;

    .line 940
    .line 941
    const/high16 v18, 0x41800000    # 16.0f

    .line 942
    .line 943
    const/16 v19, 0x7

    .line 944
    .line 945
    const/4 v15, 0x0

    .line 946
    const/16 v16, 0x0

    .line 947
    .line 948
    const/16 v17, 0x0

    .line 949
    .line 950
    move-object v14, v8

    .line 951
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 952
    .line 953
    .line 954
    move-result-object v3

    .line 955
    invoke-static {v3, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 956
    .line 957
    .line 958
    move-result-object v3

    .line 959
    const/high16 v9, 0x41c00000    # 24.0f

    .line 960
    .line 961
    invoke-static {v3, v9}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 962
    .line 963
    .line 964
    move-result-object v3

    .line 965
    sget-object v9, La/qmk;->e:La/zcl;

    .line 966
    .line 967
    sget-object v10, La/vgg0;->a:La/ugg0;

    .line 968
    .line 969
    invoke-static {v9, v9, v9, v9, v3}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 970
    .line 971
    .line 972
    move-result-object v14

    .line 973
    invoke-static {v4, v0, v5, v6}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 974
    .line 975
    .line 976
    move-result-object v15

    .line 977
    move-object/from16 v16, v0

    .line 978
    .line 979
    move/from16 v18, v2

    .line 980
    .line 981
    move/from16 v17, v5

    .line 982
    .line 983
    move/from16 v19, v6

    .line 984
    .line 985
    invoke-static/range {v14 .. v19}, La/h97;->b(La/mm40;La/fqj0;La/fet;III)I

    .line 986
    .line 987
    .line 988
    move-result v2

    .line 989
    goto :goto_11

    .line 990
    :cond_16
    move-object v0, v2

    .line 991
    invoke-virtual {v0}, La/fet;->X()V

    .line 992
    .line 993
    .line 994
    :cond_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 995
    .line 996
    return-object v0

    .line 997
    :pswitch_6
    move-object/from16 v0, p1

    .line 998
    .line 999
    check-cast v0, La/y5d;

    .line 1000
    .line 1001
    move-object/from16 v2, p2

    .line 1002
    .line 1003
    check-cast v2, La/fet;

    .line 1004
    .line 1005
    move-object/from16 v3, p3

    .line 1006
    .line 1007
    check-cast v3, Ljava/lang/Integer;

    .line 1008
    .line 1009
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1010
    .line 1011
    .line 1012
    move-result v3

    .line 1013
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    and-int/lit8 v0, v3, 0x11

    .line 1017
    .line 1018
    if-eq v0, v13, :cond_18

    .line 1019
    .line 1020
    move v0, v15

    .line 1021
    goto :goto_12

    .line 1022
    :cond_18
    move v0, v14

    .line 1023
    :goto_12
    and-int/2addr v3, v15

    .line 1024
    invoke-virtual {v2, v3, v0}, La/fet;->U(IZ)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v0

    .line 1028
    if-eqz v0, :cond_19

    .line 1029
    .line 1030
    sget-object v18, La/kjm;->b:La/kjm;

    .line 1031
    .line 1032
    new-instance v17, La/ijm;

    .line 1033
    .line 1034
    invoke-direct/range {v17 .. v17}, La/ijm;-><init>()V

    .line 1035
    .line 1036
    .line 1037
    const/16 v23, 0x186

    .line 1038
    .line 1039
    const/16 v24, 0x38

    .line 1040
    .line 1041
    sget-object v16, La/jm40;->b:La/jm40;

    .line 1042
    .line 1043
    const/16 v19, 0x0

    .line 1044
    .line 1045
    const/16 v20, 0x0

    .line 1046
    .line 1047
    const/16 v21, 0x0

    .line 1048
    .line 1049
    move-object/from16 v22, v2

    .line 1050
    .line 1051
    invoke-static/range {v16 .. v24}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1052
    .line 1053
    .line 1054
    move-object/from16 v2, v16

    .line 1055
    .line 1056
    move-object/from16 v0, v22

    .line 1057
    .line 1058
    move v3, v14

    .line 1059
    :goto_13
    if-ge v3, v1, :cond_1a

    .line 1060
    .line 1061
    invoke-static {v2, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v5

    .line 1065
    sget-object v6, La/qmk;->a:La/zcl;

    .line 1066
    .line 1067
    const/high16 v6, 0x42400000    # 48.0f

    .line 1068
    .line 1069
    invoke-static {v5, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v5

    .line 1073
    sget-object v6, La/qmk;->i:La/zcl;

    .line 1074
    .line 1075
    sget-object v8, La/vgg0;->a:La/ugg0;

    .line 1076
    .line 1077
    invoke-static {v6, v6, v6, v6, v5}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v5

    .line 1081
    invoke-static {v4, v0, v14, v15}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v6

    .line 1085
    invoke-static {v5, v6}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v5

    .line 1089
    invoke-static {v14, v0, v5}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 1090
    .line 1091
    .line 1092
    const/high16 v5, 0x40c00000    # 6.0f

    .line 1093
    .line 1094
    invoke-static {v2, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v5

    .line 1098
    invoke-static {v0, v5}, La/qxw;->o(La/fet;La/mm40;)V

    .line 1099
    .line 1100
    .line 1101
    add-int/lit8 v3, v3, 0x1

    .line 1102
    .line 1103
    goto :goto_13

    .line 1104
    :cond_19
    move-object v0, v2

    .line 1105
    invoke-virtual {v0}, La/fet;->X()V

    .line 1106
    .line 1107
    .line 1108
    :cond_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1109
    .line 1110
    return-object v0

    .line 1111
    :pswitch_7
    move-object/from16 v2, p1

    .line 1112
    .line 1113
    check-cast v2, La/x5b;

    .line 1114
    .line 1115
    move-object/from16 v5, p2

    .line 1116
    .line 1117
    check-cast v5, La/fet;

    .line 1118
    .line 1119
    move-object/from16 v0, p3

    .line 1120
    .line 1121
    check-cast v0, Ljava/lang/Integer;

    .line 1122
    .line 1123
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1124
    .line 1125
    .line 1126
    move-result v0

    .line 1127
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1128
    .line 1129
    .line 1130
    and-int/lit8 v1, v0, 0x6

    .line 1131
    .line 1132
    if-nez v1, :cond_1c

    .line 1133
    .line 1134
    invoke-virtual {v5, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1135
    .line 1136
    .line 1137
    move-result v1

    .line 1138
    if-eqz v1, :cond_1b

    .line 1139
    .line 1140
    goto :goto_14

    .line 1141
    :cond_1b
    move v9, v11

    .line 1142
    :goto_14
    or-int/2addr v0, v9

    .line 1143
    :cond_1c
    and-int/lit8 v1, v0, 0x13

    .line 1144
    .line 1145
    if-eq v1, v8, :cond_1d

    .line 1146
    .line 1147
    move v14, v15

    .line 1148
    :cond_1d
    and-int/lit8 v1, v0, 0x1

    .line 1149
    .line 1150
    invoke-virtual {v5, v1, v14}, La/fet;->U(IZ)Z

    .line 1151
    .line 1152
    .line 1153
    move-result v1

    .line 1154
    if-eqz v1, :cond_1e

    .line 1155
    .line 1156
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1157
    .line 1158
    const/4 v10, 0x0

    .line 1159
    const/16 v11, 0xe

    .line 1160
    .line 1161
    sget-object v6, La/jm40;->b:La/jm40;

    .line 1162
    .line 1163
    const/high16 v7, 0x41000000    # 8.0f

    .line 1164
    .line 1165
    const/4 v8, 0x0

    .line 1166
    const/4 v9, 0x0

    .line 1167
    invoke-static/range {v6 .. v11}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    sget-object v3, La/cjx;->c:La/ugd;

    .line 1172
    .line 1173
    sget-object v4, La/cjx;->d:La/ugd;

    .line 1174
    .line 1175
    shl-int/lit8 v0, v0, 0x3

    .line 1176
    .line 1177
    and-int/lit8 v0, v0, 0x70

    .line 1178
    .line 1179
    or-int/lit16 v6, v0, 0xd80

    .line 1180
    .line 1181
    invoke-static/range {v1 .. v6}, La/phu0;->h(La/mm40;La/x5b;La/ugd;La/ugd;La/fet;I)V

    .line 1182
    .line 1183
    .line 1184
    goto :goto_15

    .line 1185
    :cond_1e
    invoke-virtual {v5}, La/fet;->X()V

    .line 1186
    .line 1187
    .line 1188
    :goto_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1189
    .line 1190
    return-object v0

    .line 1191
    :pswitch_8
    move-object/from16 v2, p1

    .line 1192
    .line 1193
    check-cast v2, La/x5b;

    .line 1194
    .line 1195
    move-object/from16 v0, p2

    .line 1196
    .line 1197
    check-cast v0, La/fet;

    .line 1198
    .line 1199
    move-object/from16 v1, p3

    .line 1200
    .line 1201
    check-cast v1, Ljava/lang/Integer;

    .line 1202
    .line 1203
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1204
    .line 1205
    .line 1206
    move-result v1

    .line 1207
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1208
    .line 1209
    .line 1210
    and-int/lit8 v3, v1, 0x6

    .line 1211
    .line 1212
    if-nez v3, :cond_20

    .line 1213
    .line 1214
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v3

    .line 1218
    if-eqz v3, :cond_1f

    .line 1219
    .line 1220
    goto :goto_16

    .line 1221
    :cond_1f
    move v9, v11

    .line 1222
    :goto_16
    or-int/2addr v1, v9

    .line 1223
    :cond_20
    and-int/lit8 v3, v1, 0x13

    .line 1224
    .line 1225
    if-eq v3, v8, :cond_21

    .line 1226
    .line 1227
    move v14, v15

    .line 1228
    :cond_21
    and-int/lit8 v3, v1, 0x1

    .line 1229
    .line 1230
    invoke-virtual {v0, v3, v14}, La/fet;->U(IZ)Z

    .line 1231
    .line 1232
    .line 1233
    move-result v3

    .line 1234
    if-eqz v3, :cond_22

    .line 1235
    .line 1236
    sget-object v3, La/qmk;->a:La/zcl;

    .line 1237
    .line 1238
    move v3, v1

    .line 1239
    invoke-static {v10, v6, v5, v11}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v1

    .line 1243
    move v4, v3

    .line 1244
    sget-object v3, La/eeq;->a:La/ugd;

    .line 1245
    .line 1246
    move v5, v4

    .line 1247
    sget-object v4, La/eeq;->b:La/ugd;

    .line 1248
    .line 1249
    shl-int/lit8 v5, v5, 0x3

    .line 1250
    .line 1251
    and-int/lit8 v5, v5, 0x70

    .line 1252
    .line 1253
    or-int/lit16 v6, v5, 0xd80

    .line 1254
    .line 1255
    move-object v5, v0

    .line 1256
    invoke-static/range {v1 .. v6}, La/phu0;->h(La/mm40;La/x5b;La/ugd;La/ugd;La/fet;I)V

    .line 1257
    .line 1258
    .line 1259
    goto :goto_17

    .line 1260
    :cond_22
    move-object v5, v0

    .line 1261
    invoke-virtual {v5}, La/fet;->X()V

    .line 1262
    .line 1263
    .line 1264
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1265
    .line 1266
    return-object v0

    .line 1267
    :pswitch_9
    move-object/from16 v0, p1

    .line 1268
    .line 1269
    check-cast v0, La/g9z;

    .line 1270
    .line 1271
    move-object/from16 v1, p2

    .line 1272
    .line 1273
    check-cast v1, La/fet;

    .line 1274
    .line 1275
    move-object/from16 v2, p3

    .line 1276
    .line 1277
    check-cast v2, Ljava/lang/Integer;

    .line 1278
    .line 1279
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1280
    .line 1281
    .line 1282
    move-result v2

    .line 1283
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1284
    .line 1285
    .line 1286
    and-int/lit8 v0, v2, 0x11

    .line 1287
    .line 1288
    if-eq v0, v13, :cond_23

    .line 1289
    .line 1290
    move v0, v15

    .line 1291
    goto :goto_18

    .line 1292
    :cond_23
    move v0, v14

    .line 1293
    :goto_18
    and-int/2addr v2, v15

    .line 1294
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 1295
    .line 1296
    .line 1297
    move-result v0

    .line 1298
    if-eqz v0, :cond_24

    .line 1299
    .line 1300
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1301
    .line 1302
    const/high16 v0, 0x42000000    # 32.0f

    .line 1303
    .line 1304
    invoke-static {v10, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v0

    .line 1308
    const/high16 v2, 0x42a80000    # 84.0f

    .line 1309
    .line 1310
    invoke-static {v0, v2}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v0

    .line 1314
    sget-object v2, La/qmk;->m:La/zcl;

    .line 1315
    .line 1316
    sget-object v3, La/vgg0;->a:La/ugg0;

    .line 1317
    .line 1318
    invoke-static {v2, v2, v2, v2, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v0

    .line 1322
    sget-object v2, La/vqm;->b:La/vqm;

    .line 1323
    .line 1324
    invoke-static {v2, v1, v12, v14}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v2

    .line 1328
    invoke-static {v0, v2}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v0

    .line 1332
    invoke-static {v14, v1, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 1333
    .line 1334
    .line 1335
    goto :goto_19

    .line 1336
    :cond_24
    invoke-virtual {v1}, La/fet;->X()V

    .line 1337
    .line 1338
    .line 1339
    :goto_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1340
    .line 1341
    return-object v0

    .line 1342
    :pswitch_a
    move-object/from16 v0, p1

    .line 1343
    .line 1344
    check-cast v0, La/g9z;

    .line 1345
    .line 1346
    move-object/from16 v1, p2

    .line 1347
    .line 1348
    check-cast v1, La/fet;

    .line 1349
    .line 1350
    move-object/from16 v2, p3

    .line 1351
    .line 1352
    check-cast v2, Ljava/lang/Integer;

    .line 1353
    .line 1354
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1355
    .line 1356
    .line 1357
    move-result v2

    .line 1358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1359
    .line 1360
    .line 1361
    and-int/lit8 v0, v2, 0x11

    .line 1362
    .line 1363
    if-eq v0, v13, :cond_25

    .line 1364
    .line 1365
    move v0, v15

    .line 1366
    goto :goto_1a

    .line 1367
    :cond_25
    move v0, v14

    .line 1368
    :goto_1a
    and-int/2addr v2, v15

    .line 1369
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 1370
    .line 1371
    .line 1372
    move-result v0

    .line 1373
    if-eqz v0, :cond_26

    .line 1374
    .line 1375
    invoke-static {v10, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v0

    .line 1379
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1380
    .line 1381
    invoke-static {v0, v5, v3, v15}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v17

    .line 1385
    const v0, 0x7f130fa8

    .line 1386
    .line 1387
    .line 1388
    invoke-static {v0, v14, v1}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v16

    .line 1392
    sget-object v24, La/j1t0;->c:La/qrq;

    .line 1393
    .line 1394
    sget-wide v21, La/qmk;->r:J

    .line 1395
    .line 1396
    sget-wide v30, La/qmk;->F:J

    .line 1397
    .line 1398
    new-instance v18, La/y9q0;

    .line 1399
    .line 1400
    const/16 v29, 0x0

    .line 1401
    .line 1402
    const v32, 0xfdffdd

    .line 1403
    .line 1404
    .line 1405
    const-wide/16 v19, 0x0

    .line 1406
    .line 1407
    const/16 v23, 0x0

    .line 1408
    .line 1409
    const-wide/16 v25, 0x0

    .line 1410
    .line 1411
    const/16 v27, 0x0

    .line 1412
    .line 1413
    const/16 v28, 0x0

    .line 1414
    .line 1415
    invoke-direct/range {v18 .. v32}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 1416
    .line 1417
    .line 1418
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 1419
    .line 1420
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v0

    .line 1424
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1425
    .line 1426
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1427
    .line 1428
    .line 1429
    move-result-wide v2

    .line 1430
    const/16 v39, 0x6180

    .line 1431
    .line 1432
    const v40, 0x1aff8

    .line 1433
    .line 1434
    .line 1435
    const/16 v20, 0x0

    .line 1436
    .line 1437
    const-wide/16 v21, 0x0

    .line 1438
    .line 1439
    const/16 v24, 0x0

    .line 1440
    .line 1441
    const/16 v25, 0x0

    .line 1442
    .line 1443
    const-wide/16 v26, 0x0

    .line 1444
    .line 1445
    const/16 v28, 0x0

    .line 1446
    .line 1447
    const-wide/16 v29, 0x0

    .line 1448
    .line 1449
    const/16 v31, 0x2

    .line 1450
    .line 1451
    const/16 v32, 0x0

    .line 1452
    .line 1453
    const/16 v33, 0x2

    .line 1454
    .line 1455
    const/16 v34, 0x0

    .line 1456
    .line 1457
    const/16 v35, 0x0

    .line 1458
    .line 1459
    const/16 v38, 0x0

    .line 1460
    .line 1461
    move-object/from16 v37, v1

    .line 1462
    .line 1463
    move-object/from16 v36, v18

    .line 1464
    .line 1465
    move-wide/from16 v18, v2

    .line 1466
    .line 1467
    invoke-static/range {v16 .. v40}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1468
    .line 1469
    .line 1470
    goto :goto_1b

    .line 1471
    :cond_26
    move-object/from16 v37, v1

    .line 1472
    .line 1473
    invoke-virtual/range {v37 .. v37}, La/fet;->X()V

    .line 1474
    .line 1475
    .line 1476
    :goto_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1477
    .line 1478
    return-object v0

    .line 1479
    :pswitch_b
    move-object/from16 v1, p1

    .line 1480
    .line 1481
    check-cast v1, La/mm40;

    .line 1482
    .line 1483
    move v0, v9

    .line 1484
    move-object/from16 v9, p2

    .line 1485
    .line 1486
    check-cast v9, La/fet;

    .line 1487
    .line 1488
    move-object/from16 v2, p3

    .line 1489
    .line 1490
    check-cast v2, Ljava/lang/Integer;

    .line 1491
    .line 1492
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1493
    .line 1494
    .line 1495
    move-result v2

    .line 1496
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1497
    .line 1498
    .line 1499
    and-int/lit8 v3, v2, 0x6

    .line 1500
    .line 1501
    if-nez v3, :cond_28

    .line 1502
    .line 1503
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1504
    .line 1505
    .line 1506
    move-result v3

    .line 1507
    if-eqz v3, :cond_27

    .line 1508
    .line 1509
    goto :goto_1c

    .line 1510
    :cond_27
    move v0, v11

    .line 1511
    :goto_1c
    or-int/2addr v2, v0

    .line 1512
    :cond_28
    and-int/lit8 v0, v2, 0x13

    .line 1513
    .line 1514
    if-eq v0, v8, :cond_29

    .line 1515
    .line 1516
    move v14, v15

    .line 1517
    :cond_29
    and-int/lit8 v0, v2, 0x1

    .line 1518
    .line 1519
    invoke-virtual {v9, v0, v14}, La/fet;->U(IZ)Z

    .line 1520
    .line 1521
    .line 1522
    move-result v0

    .line 1523
    if-eqz v0, :cond_2a

    .line 1524
    .line 1525
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 1526
    .line 1527
    invoke-virtual {v9, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v0

    .line 1531
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1532
    .line 1533
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 1534
    .line 1535
    .line 1536
    move-result-wide v3

    .line 1537
    and-int/lit8 v10, v2, 0xe

    .line 1538
    .line 1539
    const/16 v11, 0x3c

    .line 1540
    .line 1541
    move-wide v2, v3

    .line 1542
    const/4 v4, 0x0

    .line 1543
    const-wide/16 v5, 0x0

    .line 1544
    .line 1545
    const/4 v7, 0x0

    .line 1546
    const/4 v8, 0x0

    .line 1547
    invoke-static/range {v1 .. v11}, La/p3c0;->a(La/mm40;JFJIFLa/fet;II)V

    .line 1548
    .line 1549
    .line 1550
    goto :goto_1d

    .line 1551
    :cond_2a
    invoke-virtual {v9}, La/fet;->X()V

    .line 1552
    .line 1553
    .line 1554
    :goto_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1555
    .line 1556
    return-object v0

    .line 1557
    :pswitch_c
    move v0, v9

    .line 1558
    move-object/from16 v1, p1

    .line 1559
    .line 1560
    check-cast v1, La/mm40;

    .line 1561
    .line 1562
    move-object/from16 v9, p2

    .line 1563
    .line 1564
    check-cast v9, La/fet;

    .line 1565
    .line 1566
    move-object/from16 v2, p3

    .line 1567
    .line 1568
    check-cast v2, Ljava/lang/Integer;

    .line 1569
    .line 1570
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1571
    .line 1572
    .line 1573
    move-result v2

    .line 1574
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1575
    .line 1576
    .line 1577
    and-int/lit8 v3, v2, 0x6

    .line 1578
    .line 1579
    if-nez v3, :cond_2c

    .line 1580
    .line 1581
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1582
    .line 1583
    .line 1584
    move-result v3

    .line 1585
    if-eqz v3, :cond_2b

    .line 1586
    .line 1587
    goto :goto_1e

    .line 1588
    :cond_2b
    move v0, v11

    .line 1589
    :goto_1e
    or-int/2addr v2, v0

    .line 1590
    :cond_2c
    and-int/lit8 v0, v2, 0x13

    .line 1591
    .line 1592
    if-eq v0, v8, :cond_2d

    .line 1593
    .line 1594
    move v14, v15

    .line 1595
    :cond_2d
    and-int/lit8 v0, v2, 0x1

    .line 1596
    .line 1597
    invoke-virtual {v9, v0, v14}, La/fet;->U(IZ)Z

    .line 1598
    .line 1599
    .line 1600
    move-result v0

    .line 1601
    if-eqz v0, :cond_2e

    .line 1602
    .line 1603
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 1604
    .line 1605
    invoke-virtual {v9, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v0

    .line 1609
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1610
    .line 1611
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 1612
    .line 1613
    .line 1614
    move-result-wide v3

    .line 1615
    and-int/lit8 v10, v2, 0xe

    .line 1616
    .line 1617
    const/16 v11, 0x3c

    .line 1618
    .line 1619
    move-wide v2, v3

    .line 1620
    const/4 v4, 0x0

    .line 1621
    const-wide/16 v5, 0x0

    .line 1622
    .line 1623
    const/4 v7, 0x0

    .line 1624
    const/4 v8, 0x0

    .line 1625
    invoke-static/range {v1 .. v11}, La/p3c0;->a(La/mm40;JFJIFLa/fet;II)V

    .line 1626
    .line 1627
    .line 1628
    goto :goto_1f

    .line 1629
    :cond_2e
    invoke-virtual {v9}, La/fet;->X()V

    .line 1630
    .line 1631
    .line 1632
    :goto_1f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1633
    .line 1634
    return-object v0

    .line 1635
    :pswitch_d
    move-object/from16 v0, p1

    .line 1636
    .line 1637
    check-cast v0, Ljava/lang/String;

    .line 1638
    .line 1639
    move-object/from16 v1, p2

    .line 1640
    .line 1641
    check-cast v1, La/fet;

    .line 1642
    .line 1643
    move-object/from16 v2, p3

    .line 1644
    .line 1645
    check-cast v2, Ljava/lang/Integer;

    .line 1646
    .line 1647
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1648
    .line 1649
    .line 1650
    move-result v2

    .line 1651
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1652
    .line 1653
    .line 1654
    and-int/lit8 v0, v2, 0x11

    .line 1655
    .line 1656
    if-eq v0, v13, :cond_2f

    .line 1657
    .line 1658
    move v14, v15

    .line 1659
    :cond_2f
    and-int/lit8 v0, v2, 0x1

    .line 1660
    .line 1661
    invoke-virtual {v1, v0, v14}, La/fet;->U(IZ)Z

    .line 1662
    .line 1663
    .line 1664
    move-result v0

    .line 1665
    if-eqz v0, :cond_30

    .line 1666
    .line 1667
    goto :goto_20

    .line 1668
    :cond_30
    invoke-virtual {v1}, La/fet;->X()V

    .line 1669
    .line 1670
    .line 1671
    :goto_20
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1672
    .line 1673
    return-object v0

    .line 1674
    :pswitch_e
    move v0, v9

    .line 1675
    move-object/from16 v1, p1

    .line 1676
    .line 1677
    check-cast v1, La/y5d;

    .line 1678
    .line 1679
    move-object/from16 v2, p2

    .line 1680
    .line 1681
    check-cast v2, La/fet;

    .line 1682
    .line 1683
    move-object/from16 v3, p3

    .line 1684
    .line 1685
    check-cast v3, Ljava/lang/Integer;

    .line 1686
    .line 1687
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1688
    .line 1689
    .line 1690
    move-result v3

    .line 1691
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1692
    .line 1693
    .line 1694
    and-int/lit8 v4, v3, 0x6

    .line 1695
    .line 1696
    if-nez v4, :cond_32

    .line 1697
    .line 1698
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1699
    .line 1700
    .line 1701
    move-result v4

    .line 1702
    if-eqz v4, :cond_31

    .line 1703
    .line 1704
    move v9, v0

    .line 1705
    goto :goto_21

    .line 1706
    :cond_31
    move v9, v11

    .line 1707
    :goto_21
    or-int/2addr v3, v9

    .line 1708
    :cond_32
    and-int/lit8 v0, v3, 0x13

    .line 1709
    .line 1710
    if-eq v0, v8, :cond_33

    .line 1711
    .line 1712
    move v0, v15

    .line 1713
    goto :goto_22

    .line 1714
    :cond_33
    move v0, v14

    .line 1715
    :goto_22
    and-int/2addr v3, v15

    .line 1716
    invoke-virtual {v2, v3, v0}, La/fet;->U(IZ)Z

    .line 1717
    .line 1718
    .line 1719
    move-result v0

    .line 1720
    if-eqz v0, :cond_34

    .line 1721
    .line 1722
    invoke-static {v10, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v0

    .line 1726
    sget-object v3, La/gqw0;->n:La/xx7;

    .line 1727
    .line 1728
    invoke-virtual {v1, v0, v3}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v4

    .line 1732
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1733
    .line 1734
    const/4 v8, 0x0

    .line 1735
    const/16 v9, 0xd

    .line 1736
    .line 1737
    const/4 v5, 0x0

    .line 1738
    const/high16 v6, 0x41e00000    # 28.0f

    .line 1739
    .line 1740
    const/4 v7, 0x0

    .line 1741
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v0

    .line 1745
    const-string v1, "BONUSES_INFO_BOTTOM_SHEET"

    .line 1746
    .line 1747
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v16

    .line 1751
    const v0, 0x7f1302de

    .line 1752
    .line 1753
    .line 1754
    invoke-static {v0, v14, v2}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v17

    .line 1758
    const/16 v24, 0x0

    .line 1759
    .line 1760
    const/16 v25, 0x1c

    .line 1761
    .line 1762
    const-wide/16 v18, 0x0

    .line 1763
    .line 1764
    const/16 v20, 0x0

    .line 1765
    .line 1766
    const-wide/16 v21, 0x0

    .line 1767
    .line 1768
    move-object/from16 v23, v2

    .line 1769
    .line 1770
    invoke-static/range {v16 .. v25}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 1771
    .line 1772
    .line 1773
    goto :goto_23

    .line 1774
    :cond_34
    move-object/from16 v23, v2

    .line 1775
    .line 1776
    invoke-virtual/range {v23 .. v23}, La/fet;->X()V

    .line 1777
    .line 1778
    .line 1779
    :goto_23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1780
    .line 1781
    return-object v0

    .line 1782
    :pswitch_f
    move-object/from16 v0, p1

    .line 1783
    .line 1784
    check-cast v0, La/g9z;

    .line 1785
    .line 1786
    move-object/from16 v1, p2

    .line 1787
    .line 1788
    check-cast v1, La/fet;

    .line 1789
    .line 1790
    move-object/from16 v2, p3

    .line 1791
    .line 1792
    check-cast v2, Ljava/lang/Integer;

    .line 1793
    .line 1794
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1795
    .line 1796
    .line 1797
    move-result v2

    .line 1798
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1799
    .line 1800
    .line 1801
    and-int/lit8 v0, v2, 0x11

    .line 1802
    .line 1803
    if-eq v0, v13, :cond_35

    .line 1804
    .line 1805
    move v14, v15

    .line 1806
    :cond_35
    and-int/lit8 v0, v2, 0x1

    .line 1807
    .line 1808
    invoke-virtual {v1, v0, v14}, La/fet;->U(IZ)Z

    .line 1809
    .line 1810
    .line 1811
    move-result v0

    .line 1812
    if-eqz v0, :cond_36

    .line 1813
    .line 1814
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1815
    .line 1816
    invoke-static {v10, v5, v6, v15}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v17

    .line 1820
    const/16 v20, 0x6

    .line 1821
    .line 1822
    const/16 v21, 0x4

    .line 1823
    .line 1824
    sget-object v16, La/zfi0;->a:La/zfi0;

    .line 1825
    .line 1826
    const/16 v18, 0x0

    .line 1827
    .line 1828
    move-object/from16 v19, v1

    .line 1829
    .line 1830
    invoke-static/range {v16 .. v21}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 1831
    .line 1832
    .line 1833
    goto :goto_24

    .line 1834
    :cond_36
    move-object/from16 v19, v1

    .line 1835
    .line 1836
    invoke-virtual/range {v19 .. v19}, La/fet;->X()V

    .line 1837
    .line 1838
    .line 1839
    :goto_24
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1840
    .line 1841
    return-object v0

    .line 1842
    :pswitch_10
    move-object/from16 v0, p1

    .line 1843
    .line 1844
    check-cast v0, La/g9z;

    .line 1845
    .line 1846
    move-object/from16 v1, p2

    .line 1847
    .line 1848
    check-cast v1, La/fet;

    .line 1849
    .line 1850
    move-object/from16 v2, p3

    .line 1851
    .line 1852
    check-cast v2, Ljava/lang/Integer;

    .line 1853
    .line 1854
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1855
    .line 1856
    .line 1857
    move-result v2

    .line 1858
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1859
    .line 1860
    .line 1861
    and-int/lit8 v0, v2, 0x11

    .line 1862
    .line 1863
    if-eq v0, v13, :cond_37

    .line 1864
    .line 1865
    move v0, v15

    .line 1866
    goto :goto_25

    .line 1867
    :cond_37
    move v0, v14

    .line 1868
    :goto_25
    and-int/2addr v2, v15

    .line 1869
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 1870
    .line 1871
    .line 1872
    move-result v0

    .line 1873
    if-eqz v0, :cond_38

    .line 1874
    .line 1875
    invoke-static {v14, v1}, La/m7x;->g(ILa/fet;)V

    .line 1876
    .line 1877
    .line 1878
    goto :goto_26

    .line 1879
    :cond_38
    invoke-virtual {v1}, La/fet;->X()V

    .line 1880
    .line 1881
    .line 1882
    :goto_26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1883
    .line 1884
    return-object v0

    .line 1885
    :pswitch_11
    move v0, v9

    .line 1886
    move-object/from16 v1, p1

    .line 1887
    .line 1888
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 1889
    .line 1890
    move-object/from16 v2, p2

    .line 1891
    .line 1892
    check-cast v2, La/fet;

    .line 1893
    .line 1894
    move-object/from16 v3, p3

    .line 1895
    .line 1896
    check-cast v3, Ljava/lang/Integer;

    .line 1897
    .line 1898
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1899
    .line 1900
    .line 1901
    move-result v3

    .line 1902
    and-int/lit8 v4, v3, 0x6

    .line 1903
    .line 1904
    if-nez v4, :cond_3a

    .line 1905
    .line 1906
    invoke-virtual {v2, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1907
    .line 1908
    .line 1909
    move-result v4

    .line 1910
    if-eqz v4, :cond_39

    .line 1911
    .line 1912
    move v9, v0

    .line 1913
    goto :goto_27

    .line 1914
    :cond_39
    move v9, v11

    .line 1915
    :goto_27
    or-int/2addr v3, v9

    .line 1916
    :cond_3a
    and-int/lit8 v0, v3, 0x13

    .line 1917
    .line 1918
    if-eq v0, v8, :cond_3b

    .line 1919
    .line 1920
    move v14, v15

    .line 1921
    :cond_3b
    and-int/lit8 v0, v3, 0x1

    .line 1922
    .line 1923
    invoke-virtual {v2, v0, v14}, La/fet;->U(IZ)Z

    .line 1924
    .line 1925
    .line 1926
    move-result v0

    .line 1927
    if-eqz v0, :cond_3c

    .line 1928
    .line 1929
    and-int/lit8 v0, v3, 0xe

    .line 1930
    .line 1931
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v0

    .line 1935
    invoke-interface {v1, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1936
    .line 1937
    .line 1938
    goto :goto_28

    .line 1939
    :cond_3c
    invoke-virtual {v2}, La/fet;->X()V

    .line 1940
    .line 1941
    .line 1942
    :goto_28
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1943
    .line 1944
    return-object v0

    .line 1945
    :pswitch_12
    move v0, v9

    .line 1946
    move-object/from16 v1, p1

    .line 1947
    .line 1948
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 1949
    .line 1950
    move-object/from16 v2, p2

    .line 1951
    .line 1952
    check-cast v2, La/fet;

    .line 1953
    .line 1954
    move-object/from16 v3, p3

    .line 1955
    .line 1956
    check-cast v3, Ljava/lang/Integer;

    .line 1957
    .line 1958
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1959
    .line 1960
    .line 1961
    move-result v3

    .line 1962
    and-int/lit8 v4, v3, 0x6

    .line 1963
    .line 1964
    if-nez v4, :cond_3e

    .line 1965
    .line 1966
    invoke-virtual {v2, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1967
    .line 1968
    .line 1969
    move-result v4

    .line 1970
    if-eqz v4, :cond_3d

    .line 1971
    .line 1972
    move v9, v0

    .line 1973
    goto :goto_29

    .line 1974
    :cond_3d
    move v9, v11

    .line 1975
    :goto_29
    or-int/2addr v3, v9

    .line 1976
    :cond_3e
    and-int/lit8 v0, v3, 0x13

    .line 1977
    .line 1978
    if-eq v0, v8, :cond_3f

    .line 1979
    .line 1980
    move v14, v15

    .line 1981
    :cond_3f
    and-int/lit8 v0, v3, 0x1

    .line 1982
    .line 1983
    invoke-virtual {v2, v0, v14}, La/fet;->U(IZ)Z

    .line 1984
    .line 1985
    .line 1986
    move-result v0

    .line 1987
    if-eqz v0, :cond_40

    .line 1988
    .line 1989
    and-int/lit8 v0, v3, 0xe

    .line 1990
    .line 1991
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v0

    .line 1995
    invoke-interface {v1, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1996
    .line 1997
    .line 1998
    goto :goto_2a

    .line 1999
    :cond_40
    invoke-virtual {v2}, La/fet;->X()V

    .line 2000
    .line 2001
    .line 2002
    :goto_2a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2003
    .line 2004
    return-object v0

    .line 2005
    :pswitch_13
    move-object/from16 v0, p1

    .line 2006
    .line 2007
    check-cast v0, La/g9z;

    .line 2008
    .line 2009
    move-object/from16 v1, p2

    .line 2010
    .line 2011
    check-cast v1, La/fet;

    .line 2012
    .line 2013
    move-object/from16 v2, p3

    .line 2014
    .line 2015
    check-cast v2, Ljava/lang/Integer;

    .line 2016
    .line 2017
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2018
    .line 2019
    .line 2020
    move-result v2

    .line 2021
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2022
    .line 2023
    .line 2024
    and-int/lit8 v0, v2, 0x11

    .line 2025
    .line 2026
    if-eq v0, v13, :cond_41

    .line 2027
    .line 2028
    move v14, v15

    .line 2029
    :cond_41
    and-int/lit8 v0, v2, 0x1

    .line 2030
    .line 2031
    invoke-virtual {v1, v0, v14}, La/fet;->U(IZ)Z

    .line 2032
    .line 2033
    .line 2034
    move-result v0

    .line 2035
    if-eqz v0, :cond_42

    .line 2036
    .line 2037
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2038
    .line 2039
    const/high16 v0, 0x41400000    # 12.0f

    .line 2040
    .line 2041
    invoke-static {v10, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v0

    .line 2045
    invoke-static {v1, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 2046
    .line 2047
    .line 2048
    goto :goto_2b

    .line 2049
    :cond_42
    invoke-virtual {v1}, La/fet;->X()V

    .line 2050
    .line 2051
    .line 2052
    :goto_2b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2053
    .line 2054
    return-object v0

    .line 2055
    :pswitch_14
    move-object/from16 v0, p1

    .line 2056
    .line 2057
    check-cast v0, La/yhg0;

    .line 2058
    .line 2059
    move-object/from16 v6, p2

    .line 2060
    .line 2061
    check-cast v6, La/fet;

    .line 2062
    .line 2063
    move-object/from16 v1, p3

    .line 2064
    .line 2065
    check-cast v1, Ljava/lang/Integer;

    .line 2066
    .line 2067
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2068
    .line 2069
    .line 2070
    move-result v1

    .line 2071
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2072
    .line 2073
    .line 2074
    and-int/lit8 v0, v1, 0x11

    .line 2075
    .line 2076
    if-eq v0, v13, :cond_43

    .line 2077
    .line 2078
    move v0, v15

    .line 2079
    goto :goto_2c

    .line 2080
    :cond_43
    move v0, v14

    .line 2081
    :goto_2c
    and-int/2addr v1, v15

    .line 2082
    invoke-virtual {v6, v1, v0}, La/fet;->U(IZ)Z

    .line 2083
    .line 2084
    .line 2085
    move-result v0

    .line 2086
    if-eqz v0, :cond_44

    .line 2087
    .line 2088
    const v0, 0x7f080800

    .line 2089
    .line 2090
    .line 2091
    invoke-static {v0, v14, v6}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v1

    .line 2095
    const/16 v7, 0x38

    .line 2096
    .line 2097
    const/16 v8, 0xc

    .line 2098
    .line 2099
    const/4 v2, 0x0

    .line 2100
    const/4 v3, 0x0

    .line 2101
    const-wide/16 v4, 0x0

    .line 2102
    .line 2103
    invoke-static/range {v1 .. v8}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 2104
    .line 2105
    .line 2106
    goto :goto_2d

    .line 2107
    :cond_44
    invoke-virtual {v6}, La/fet;->X()V

    .line 2108
    .line 2109
    .line 2110
    :goto_2d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2111
    .line 2112
    return-object v0

    .line 2113
    :pswitch_15
    move-object/from16 v0, p1

    .line 2114
    .line 2115
    check-cast v0, La/yhg0;

    .line 2116
    .line 2117
    move-object/from16 v6, p2

    .line 2118
    .line 2119
    check-cast v6, La/fet;

    .line 2120
    .line 2121
    move-object/from16 v1, p3

    .line 2122
    .line 2123
    check-cast v1, Ljava/lang/Integer;

    .line 2124
    .line 2125
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2126
    .line 2127
    .line 2128
    move-result v1

    .line 2129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2130
    .line 2131
    .line 2132
    and-int/lit8 v0, v1, 0x11

    .line 2133
    .line 2134
    if-eq v0, v13, :cond_45

    .line 2135
    .line 2136
    move v0, v15

    .line 2137
    goto :goto_2e

    .line 2138
    :cond_45
    move v0, v14

    .line 2139
    :goto_2e
    and-int/2addr v1, v15

    .line 2140
    invoke-virtual {v6, v1, v0}, La/fet;->U(IZ)Z

    .line 2141
    .line 2142
    .line 2143
    move-result v0

    .line 2144
    if-eqz v0, :cond_46

    .line 2145
    .line 2146
    const v0, 0x7f080467

    .line 2147
    .line 2148
    .line 2149
    invoke-static {v0, v14, v6}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v1

    .line 2153
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2154
    .line 2155
    const/high16 v0, 0x41900000    # 18.0f

    .line 2156
    .line 2157
    invoke-static {v10, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 2158
    .line 2159
    .line 2160
    move-result-object v3

    .line 2161
    const/16 v7, 0x38

    .line 2162
    .line 2163
    const/16 v8, 0x8

    .line 2164
    .line 2165
    const/4 v2, 0x0

    .line 2166
    const-wide/16 v4, 0x0

    .line 2167
    .line 2168
    invoke-static/range {v1 .. v8}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 2169
    .line 2170
    .line 2171
    goto :goto_2f

    .line 2172
    :cond_46
    invoke-virtual {v6}, La/fet;->X()V

    .line 2173
    .line 2174
    .line 2175
    :goto_2f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2176
    .line 2177
    return-object v0

    .line 2178
    :pswitch_16
    move-object/from16 v0, p1

    .line 2179
    .line 2180
    check-cast v0, La/y5d;

    .line 2181
    .line 2182
    move-object/from16 v8, p2

    .line 2183
    .line 2184
    check-cast v8, La/fet;

    .line 2185
    .line 2186
    move-object/from16 v1, p3

    .line 2187
    .line 2188
    check-cast v1, Ljava/lang/Integer;

    .line 2189
    .line 2190
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2191
    .line 2192
    .line 2193
    move-result v1

    .line 2194
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2195
    .line 2196
    .line 2197
    and-int/lit8 v0, v1, 0x11

    .line 2198
    .line 2199
    if-eq v0, v13, :cond_47

    .line 2200
    .line 2201
    move v0, v15

    .line 2202
    goto :goto_30

    .line 2203
    :cond_47
    move v0, v14

    .line 2204
    :goto_30
    and-int/2addr v1, v15

    .line 2205
    invoke-virtual {v8, v1, v0}, La/fet;->U(IZ)Z

    .line 2206
    .line 2207
    .line 2208
    move-result v0

    .line 2209
    if-eqz v0, :cond_48

    .line 2210
    .line 2211
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2212
    .line 2213
    const/4 v5, 0x0

    .line 2214
    const/16 v6, 0xd

    .line 2215
    .line 2216
    sget-object v1, La/jm40;->b:La/jm40;

    .line 2217
    .line 2218
    const/4 v2, 0x0

    .line 2219
    const/high16 v3, 0x41e00000    # 28.0f

    .line 2220
    .line 2221
    const/4 v4, 0x0

    .line 2222
    invoke-static/range {v1 .. v6}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2223
    .line 2224
    .line 2225
    move-result-object v1

    .line 2226
    const v0, 0x7f1311f1

    .line 2227
    .line 2228
    .line 2229
    invoke-static {v0, v14, v8}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 2230
    .line 2231
    .line 2232
    move-result-object v2

    .line 2233
    const/4 v9, 0x0

    .line 2234
    const/16 v10, 0x1c

    .line 2235
    .line 2236
    const-wide/16 v3, 0x0

    .line 2237
    .line 2238
    const/4 v5, 0x0

    .line 2239
    const-wide/16 v6, 0x0

    .line 2240
    .line 2241
    invoke-static/range {v1 .. v10}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 2242
    .line 2243
    .line 2244
    goto :goto_31

    .line 2245
    :cond_48
    invoke-virtual {v8}, La/fet;->X()V

    .line 2246
    .line 2247
    .line 2248
    :goto_31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2249
    .line 2250
    return-object v0

    .line 2251
    :pswitch_17
    move-object/from16 v0, p1

    .line 2252
    .line 2253
    check-cast v0, La/y5d;

    .line 2254
    .line 2255
    move-object/from16 v8, p2

    .line 2256
    .line 2257
    check-cast v8, La/fet;

    .line 2258
    .line 2259
    move-object/from16 v1, p3

    .line 2260
    .line 2261
    check-cast v1, Ljava/lang/Integer;

    .line 2262
    .line 2263
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2264
    .line 2265
    .line 2266
    move-result v1

    .line 2267
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2268
    .line 2269
    .line 2270
    and-int/lit8 v0, v1, 0x11

    .line 2271
    .line 2272
    if-eq v0, v13, :cond_49

    .line 2273
    .line 2274
    move v0, v15

    .line 2275
    goto :goto_32

    .line 2276
    :cond_49
    move v0, v14

    .line 2277
    :goto_32
    and-int/2addr v1, v15

    .line 2278
    invoke-virtual {v8, v1, v0}, La/fet;->U(IZ)Z

    .line 2279
    .line 2280
    .line 2281
    move-result v0

    .line 2282
    if-eqz v0, :cond_4a

    .line 2283
    .line 2284
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2285
    .line 2286
    const/4 v5, 0x0

    .line 2287
    const/16 v6, 0xd

    .line 2288
    .line 2289
    sget-object v1, La/jm40;->b:La/jm40;

    .line 2290
    .line 2291
    const/4 v2, 0x0

    .line 2292
    const/high16 v3, 0x41e00000    # 28.0f

    .line 2293
    .line 2294
    const/4 v4, 0x0

    .line 2295
    invoke-static/range {v1 .. v6}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v1

    .line 2299
    const v0, 0x7f1311f9

    .line 2300
    .line 2301
    .line 2302
    invoke-static {v0, v14, v8}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 2303
    .line 2304
    .line 2305
    move-result-object v2

    .line 2306
    const/4 v9, 0x0

    .line 2307
    const/16 v10, 0x1c

    .line 2308
    .line 2309
    const-wide/16 v3, 0x0

    .line 2310
    .line 2311
    const/4 v5, 0x0

    .line 2312
    const-wide/16 v6, 0x0

    .line 2313
    .line 2314
    invoke-static/range {v1 .. v10}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 2315
    .line 2316
    .line 2317
    goto :goto_33

    .line 2318
    :cond_4a
    invoke-virtual {v8}, La/fet;->X()V

    .line 2319
    .line 2320
    .line 2321
    :goto_33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2322
    .line 2323
    return-object v0

    .line 2324
    :pswitch_18
    move-object/from16 v0, p1

    .line 2325
    .line 2326
    check-cast v0, La/g9z;

    .line 2327
    .line 2328
    move-object/from16 v1, p2

    .line 2329
    .line 2330
    check-cast v1, La/fet;

    .line 2331
    .line 2332
    move-object/from16 v2, p3

    .line 2333
    .line 2334
    check-cast v2, Ljava/lang/Integer;

    .line 2335
    .line 2336
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2337
    .line 2338
    .line 2339
    move-result v2

    .line 2340
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2341
    .line 2342
    .line 2343
    and-int/lit8 v0, v2, 0x11

    .line 2344
    .line 2345
    if-eq v0, v13, :cond_4b

    .line 2346
    .line 2347
    move v14, v15

    .line 2348
    :cond_4b
    and-int/lit8 v0, v2, 0x1

    .line 2349
    .line 2350
    invoke-virtual {v1, v0, v14}, La/fet;->U(IZ)Z

    .line 2351
    .line 2352
    .line 2353
    move-result v0

    .line 2354
    if-eqz v0, :cond_4c

    .line 2355
    .line 2356
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2357
    .line 2358
    invoke-static {v10, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 2359
    .line 2360
    .line 2361
    move-result-object v0

    .line 2362
    invoke-static {v1, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 2363
    .line 2364
    .line 2365
    goto :goto_34

    .line 2366
    :cond_4c
    invoke-virtual {v1}, La/fet;->X()V

    .line 2367
    .line 2368
    .line 2369
    :goto_34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2370
    .line 2371
    return-object v0

    .line 2372
    :pswitch_19
    move-object/from16 v0, p1

    .line 2373
    .line 2374
    check-cast v0, La/iao0;

    .line 2375
    .line 2376
    move-object/from16 v1, p2

    .line 2377
    .line 2378
    check-cast v1, La/fet;

    .line 2379
    .line 2380
    move-object/from16 v2, p3

    .line 2381
    .line 2382
    check-cast v2, Ljava/lang/Integer;

    .line 2383
    .line 2384
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2385
    .line 2386
    .line 2387
    move-result v2

    .line 2388
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2389
    .line 2390
    .line 2391
    and-int/lit8 v0, v2, 0x11

    .line 2392
    .line 2393
    if-eq v0, v13, :cond_4d

    .line 2394
    .line 2395
    move v0, v15

    .line 2396
    goto :goto_35

    .line 2397
    :cond_4d
    move v0, v14

    .line 2398
    :goto_35
    and-int/2addr v2, v15

    .line 2399
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 2400
    .line 2401
    .line 2402
    move-result v0

    .line 2403
    if-eqz v0, :cond_4e

    .line 2404
    .line 2405
    invoke-static {v14, v1}, La/oja0;->K(ILa/fet;)V

    .line 2406
    .line 2407
    .line 2408
    goto :goto_36

    .line 2409
    :cond_4e
    invoke-virtual {v1}, La/fet;->X()V

    .line 2410
    .line 2411
    .line 2412
    :goto_36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2413
    .line 2414
    return-object v0

    .line 2415
    :pswitch_1a
    move-object/from16 v0, p1

    .line 2416
    .line 2417
    check-cast v0, La/vj30;

    .line 2418
    .line 2419
    move-object/from16 v1, p2

    .line 2420
    .line 2421
    check-cast v1, La/pj30;

    .line 2422
    .line 2423
    move-object/from16 v2, p3

    .line 2424
    .line 2425
    check-cast v2, La/p4e;

    .line 2426
    .line 2427
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2428
    .line 2429
    .line 2430
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2431
    .line 2432
    .line 2433
    iget-wide v2, v2, La/p4e;->a:J

    .line 2434
    .line 2435
    invoke-static {v2, v3}, La/p4e;->i(J)I

    .line 2436
    .line 2437
    .line 2438
    move-result v2

    .line 2439
    const/16 v3, 0x1af

    .line 2440
    .line 2441
    invoke-static {v3}, La/f7k;->M(I)I

    .line 2442
    .line 2443
    .line 2444
    move-result v3

    .line 2445
    if-le v2, v3, :cond_4f

    .line 2446
    .line 2447
    sget-object v2, La/qmk;->a:La/zcl;

    .line 2448
    .line 2449
    const/high16 v2, 0x43b40000    # 360.0f

    .line 2450
    .line 2451
    goto :goto_37

    .line 2452
    :cond_4f
    const/16 v3, 0x168

    .line 2453
    .line 2454
    invoke-static {v3}, La/f7k;->M(I)I

    .line 2455
    .line 2456
    .line 2457
    move-result v3

    .line 2458
    if-le v2, v3, :cond_50

    .line 2459
    .line 2460
    sget-object v2, La/qmk;->a:La/zcl;

    .line 2461
    .line 2462
    const/high16 v2, 0x438c0000    # 280.0f

    .line 2463
    .line 2464
    goto :goto_37

    .line 2465
    :cond_50
    sget-object v2, La/qmk;->a:La/zcl;

    .line 2466
    .line 2467
    const/high16 v2, 0x43580000    # 216.0f

    .line 2468
    .line 2469
    :goto_37
    invoke-interface {v0, v2}, La/w6k;->T(F)I

    .line 2470
    .line 2471
    .line 2472
    move-result v2

    .line 2473
    int-to-float v3, v2

    .line 2474
    const/high16 v4, 0x40000000    # 2.0f

    .line 2475
    .line 2476
    div-float/2addr v3, v4

    .line 2477
    float-to-int v3, v3

    .line 2478
    if-ltz v2, :cond_51

    .line 2479
    .line 2480
    move v4, v15

    .line 2481
    goto :goto_38

    .line 2482
    :cond_51
    move v4, v14

    .line 2483
    :goto_38
    if-ltz v3, :cond_52

    .line 2484
    .line 2485
    move v14, v15

    .line 2486
    :cond_52
    and-int/2addr v4, v14

    .line 2487
    if-nez v4, :cond_53

    .line 2488
    .line 2489
    const-string v4, "width and height must be >= 0"

    .line 2490
    .line 2491
    invoke-static {v4}, La/zcx;->a(Ljava/lang/String;)V

    .line 2492
    .line 2493
    .line 2494
    :cond_53
    invoke-static {v2, v2, v3, v3}, La/r4e;->h(IIII)J

    .line 2495
    .line 2496
    .line 2497
    move-result-wide v2

    .line 2498
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 2499
    .line 2500
    .line 2501
    move-result-object v1

    .line 2502
    iget v2, v1, La/pu90;->a:I

    .line 2503
    .line 2504
    iget v3, v1, La/pu90;->b:I

    .line 2505
    .line 2506
    new-instance v4, La/y1;

    .line 2507
    .line 2508
    const/16 v5, 0xc

    .line 2509
    .line 2510
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 2511
    .line 2512
    .line 2513
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 2514
    .line 2515
    .line 2516
    move-result-object v0

    .line 2517
    return-object v0

    .line 2518
    :pswitch_1b
    move-object/from16 v0, p1

    .line 2519
    .line 2520
    check-cast v0, La/vj30;

    .line 2521
    .line 2522
    move-object/from16 v1, p2

    .line 2523
    .line 2524
    check-cast v1, La/pj30;

    .line 2525
    .line 2526
    move-object/from16 v2, p3

    .line 2527
    .line 2528
    check-cast v2, La/p4e;

    .line 2529
    .line 2530
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2531
    .line 2532
    .line 2533
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2534
    .line 2535
    .line 2536
    iget-wide v3, v2, La/p4e;->a:J

    .line 2537
    .line 2538
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 2539
    .line 2540
    .line 2541
    move-result v3

    .line 2542
    int-to-float v4, v3

    .line 2543
    const/high16 v5, 0x3f400000    # 0.75f

    .line 2544
    .line 2545
    mul-float/2addr v4, v5

    .line 2546
    float-to-int v4, v4

    .line 2547
    iget-wide v5, v2, La/p4e;->a:J

    .line 2548
    .line 2549
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 2550
    .line 2551
    .line 2552
    move-result v2

    .line 2553
    if-le v4, v2, :cond_54

    .line 2554
    .line 2555
    move v4, v2

    .line 2556
    :cond_54
    invoke-static {v4, v4, v3, v3}, La/p4e;->a(IIII)J

    .line 2557
    .line 2558
    .line 2559
    move-result-wide v2

    .line 2560
    invoke-static {v2, v3, v5, v6}, La/r4e;->e(JJ)J

    .line 2561
    .line 2562
    .line 2563
    move-result-wide v2

    .line 2564
    invoke-interface {v1, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 2565
    .line 2566
    .line 2567
    move-result-object v1

    .line 2568
    iget v2, v1, La/pu90;->a:I

    .line 2569
    .line 2570
    iget v3, v1, La/pu90;->b:I

    .line 2571
    .line 2572
    new-instance v4, La/y1;

    .line 2573
    .line 2574
    const/16 v5, 0xb

    .line 2575
    .line 2576
    invoke-direct {v4, v1, v5}, La/y1;-><init>(La/pu90;B)V

    .line 2577
    .line 2578
    .line 2579
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 2580
    .line 2581
    .line 2582
    move-result-object v0

    .line 2583
    return-object v0

    .line 2584
    :pswitch_1c
    move-object/from16 v0, p1

    .line 2585
    .line 2586
    check-cast v0, La/vj30;

    .line 2587
    .line 2588
    move-object/from16 v1, p2

    .line 2589
    .line 2590
    check-cast v1, La/pj30;

    .line 2591
    .line 2592
    move-object/from16 v2, p3

    .line 2593
    .line 2594
    check-cast v2, La/p4e;

    .line 2595
    .line 2596
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2597
    .line 2598
    .line 2599
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2600
    .line 2601
    .line 2602
    sget-object v3, La/qmk;->a:La/zcl;

    .line 2603
    .line 2604
    const/high16 v3, 0x42100000    # 36.0f

    .line 2605
    .line 2606
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 2607
    .line 2608
    .line 2609
    move-result v3

    .line 2610
    add-int/2addr v3, v15

    .line 2611
    iget-wide v4, v2, La/p4e;->a:J

    .line 2612
    .line 2613
    invoke-static {v4, v5}, La/p4e;->h(J)I

    .line 2614
    .line 2615
    .line 2616
    move-result v6

    .line 2617
    add-int v8, v6, v3

    .line 2618
    .line 2619
    iget-wide v11, v2, La/p4e;->a:J

    .line 2620
    .line 2621
    invoke-static {v11, v12}, La/p4e;->h(J)I

    .line 2622
    .line 2623
    .line 2624
    move-result v2

    .line 2625
    add-int v9, v2, v3

    .line 2626
    .line 2627
    const/4 v10, 0x3

    .line 2628
    const/4 v6, 0x0

    .line 2629
    const/4 v7, 0x0

    .line 2630
    invoke-static/range {v4 .. v10}, La/p4e;->b(JIIIII)J

    .line 2631
    .line 2632
    .line 2633
    move-result-wide v4

    .line 2634
    invoke-interface {v1, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 2635
    .line 2636
    .line 2637
    move-result-object v1

    .line 2638
    iget v2, v1, La/pu90;->a:I

    .line 2639
    .line 2640
    invoke-static {v11, v12}, La/p4e;->h(J)I

    .line 2641
    .line 2642
    .line 2643
    move-result v4

    .line 2644
    new-instance v5, La/n7;

    .line 2645
    .line 2646
    const/4 v6, 0x5

    .line 2647
    invoke-direct {v5, v1, v3, v6}, La/n7;-><init>(La/pu90;IB)V

    .line 2648
    .line 2649
    .line 2650
    invoke-static {v0, v2, v4, v5}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 2651
    .line 2652
    .line 2653
    move-result-object v0

    .line 2654
    return-object v0

    .line 2655
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
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
