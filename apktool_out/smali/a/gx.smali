.class public final La/gx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;La/rwl0;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/gx;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/gx;->b:Ljava/util/List;

    .line 8
    .line 9
    iput-object p2, p0, La/gx;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p3, p0, La/gx;->c:Z

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ZLjava/lang/Object;B)V
    .locals 0

    .line 14
    iput-byte p4, p0, La/gx;->a:B

    iput-object p1, p0, La/gx;->b:Ljava/util/List;

    iput-boolean p2, p0, La/gx;->c:Z

    iput-object p3, p0, La/gx;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gx;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    iget-boolean v3, v0, La/gx;->c:Z

    .line 8
    .line 9
    iget-object v4, v0, La/gx;->b:Ljava/util/List;

    .line 10
    .line 11
    const/16 v5, 0x92

    .line 12
    .line 13
    const/16 v6, 0x10

    .line 14
    .line 15
    const/16 v7, 0x20

    .line 16
    .line 17
    const/4 v8, 0x2

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x1

    .line 20
    iget-object v11, v0, La/gx;->d:Ljava/lang/Object;

    .line 21
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
    check-cast v0, La/g9z;

    .line 29
    .line 30
    move-object/from16 v1, p2

    .line 31
    .line 32
    check-cast v1, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    move-object/from16 v13, p3

    .line 39
    .line 40
    check-cast v13, La/fet;

    .line 41
    .line 42
    move-object/from16 v14, p4

    .line 43
    .line 44
    check-cast v14, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v14

    .line 50
    check-cast v11, La/rwl0;

    .line 51
    .line 52
    iget-object v11, v11, La/rwl0;->b:La/a4x;

    .line 53
    .line 54
    and-int/lit8 v15, v14, 0x6

    .line 55
    .line 56
    if-nez v15, :cond_1

    .line 57
    .line 58
    invoke-virtual {v13, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    move v8, v12

    .line 65
    :cond_0
    or-int v0, v14, v8

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    move v0, v14

    .line 69
    :goto_0
    and-int/lit8 v8, v14, 0x30

    .line 70
    .line 71
    if-nez v8, :cond_3

    .line 72
    .line 73
    invoke-virtual {v13, v1}, La/fet;->e(I)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_2

    .line 78
    .line 79
    move v6, v7

    .line 80
    :cond_2
    or-int/2addr v0, v6

    .line 81
    :cond_3
    and-int/lit16 v6, v0, 0x93

    .line 82
    .line 83
    if-eq v6, v5, :cond_4

    .line 84
    .line 85
    move v5, v10

    .line 86
    goto :goto_1

    .line 87
    :cond_4
    move v5, v9

    .line 88
    :goto_1
    and-int/2addr v0, v10

    .line 89
    invoke-virtual {v13, v0, v5}, La/fet;->U(IZ)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_b

    .line 94
    .line 95
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/a9x;

    .line 100
    .line 101
    const v4, 0x11c2409c

    .line 102
    .line 103
    .line 104
    invoke-virtual {v13, v4}, La/fet;->e0(I)V

    .line 105
    .line 106
    .line 107
    if-nez v1, :cond_5

    .line 108
    .line 109
    move v4, v10

    .line 110
    goto :goto_2

    .line 111
    :cond_5
    move v4, v9

    .line 112
    :goto_2
    invoke-static {v11}, La/q3d;->i(Ljava/util/List;)I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-ne v1, v5, :cond_6

    .line 117
    .line 118
    move v5, v10

    .line 119
    goto :goto_3

    .line 120
    :cond_6
    move v5, v9

    .line 121
    :goto_3
    const/high16 v6, 0x41400000    # 12.0f

    .line 122
    .line 123
    const/4 v7, 0x0

    .line 124
    if-eqz v4, :cond_7

    .line 125
    .line 126
    if-nez v3, :cond_7

    .line 127
    .line 128
    sget-object v3, La/qmk;->a:La/zcl;

    .line 129
    .line 130
    move v3, v6

    .line 131
    goto :goto_4

    .line 132
    :cond_7
    sget-object v3, La/qmk;->a:La/zcl;

    .line 133
    .line 134
    move v3, v7

    .line 135
    :goto_4
    if-eqz v5, :cond_8

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_8
    move v6, v7

    .line 139
    :goto_5
    sget-object v4, La/zaq0;->b:La/zfn;

    .line 140
    .line 141
    invoke-virtual {v13, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 146
    .line 147
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 148
    .line 149
    .line 150
    move-result-wide v4

    .line 151
    invoke-static {v3, v3, v6, v6}, La/vgg0;->b(FFFF)La/ugg0;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-static {v2, v4, v5, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    sget-object v4, La/uc9;->c:La/mw3;

    .line 160
    .line 161
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 162
    .line 163
    invoke-static {v4, v5, v13, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    iget-wide v5, v13, La/fet;->T:J

    .line 168
    .line 169
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-static {v13, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 182
    .line 183
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v13}, La/fet;->i0()V

    .line 187
    .line 188
    .line 189
    iget-boolean v7, v13, La/fet;->S:Z

    .line 190
    .line 191
    if-eqz v7, :cond_9

    .line 192
    .line 193
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 194
    .line 195
    invoke-virtual {v13, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 196
    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_9
    invoke-virtual {v13}, La/fet;->r0()V

    .line 200
    .line 201
    .line 202
    :goto_6
    sget-object v7, La/gqw0;->x:La/shd;

    .line 203
    .line 204
    invoke-static {v13, v4, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 205
    .line 206
    .line 207
    sget-object v4, La/gqw0;->w:La/shd;

    .line 208
    .line 209
    invoke-static {v13, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    sget-object v5, La/gqw0;->y:La/shd;

    .line 217
    .line 218
    invoke-static {v13, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 222
    .line 223
    .line 224
    sget-object v4, La/gqw0;->v:La/shd;

    .line 225
    .line 226
    invoke-static {v13, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v0, v13, v9}, La/z1x;->c(La/a9x;La/fet;I)V

    .line 230
    .line 231
    .line 232
    invoke-static {v11}, La/q3d;->i(Ljava/util/List;)I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-ge v1, v0, :cond_a

    .line 237
    .line 238
    const v0, -0x484a8062

    .line 239
    .line 240
    .line 241
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x3f800000    # 1.0f

    .line 245
    .line 246
    invoke-static {v2, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    const/4 v7, 0x0

    .line 251
    const/16 v8, 0xe

    .line 252
    .line 253
    const/high16 v4, 0x41400000    # 12.0f

    .line 254
    .line 255
    const/4 v5, 0x0

    .line 256
    const/4 v6, 0x0

    .line 257
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 258
    .line 259
    .line 260
    move-result-object v14

    .line 261
    const/16 v17, 0x6

    .line 262
    .line 263
    const/16 v18, 0x4

    .line 264
    .line 265
    move-object/from16 v16, v13

    .line 266
    .line 267
    sget-object v13, La/zfi0;->a:La/zfi0;

    .line 268
    .line 269
    const/4 v15, 0x0

    .line 270
    invoke-static/range {v13 .. v18}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 271
    .line 272
    .line 273
    move-object/from16 v0, v16

    .line 274
    .line 275
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 276
    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_a
    move-object v0, v13

    .line 280
    const v1, -0x484688a6

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 287
    .line 288
    .line 289
    :goto_7
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 293
    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_b
    move-object v0, v13

    .line 297
    invoke-virtual {v0}, La/fet;->X()V

    .line 298
    .line 299
    .line 300
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    return-object v0

    .line 303
    :pswitch_0
    move-object/from16 v0, p1

    .line 304
    .line 305
    check-cast v0, La/g9z;

    .line 306
    .line 307
    move-object/from16 v1, p2

    .line 308
    .line 309
    check-cast v1, Ljava/lang/Number;

    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    move-object/from16 v13, p3

    .line 316
    .line 317
    check-cast v13, La/fet;

    .line 318
    .line 319
    move-object/from16 v14, p4

    .line 320
    .line 321
    check-cast v14, Ljava/lang/Number;

    .line 322
    .line 323
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 324
    .line 325
    .line 326
    move-result v14

    .line 327
    and-int/lit8 v15, v14, 0x6

    .line 328
    .line 329
    if-nez v15, :cond_d

    .line 330
    .line 331
    invoke-virtual {v13, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v15

    .line 335
    if-eqz v15, :cond_c

    .line 336
    .line 337
    move v8, v12

    .line 338
    :cond_c
    or-int/2addr v8, v14

    .line 339
    goto :goto_9

    .line 340
    :cond_d
    move v8, v14

    .line 341
    :goto_9
    and-int/lit8 v14, v14, 0x30

    .line 342
    .line 343
    if-nez v14, :cond_f

    .line 344
    .line 345
    invoke-virtual {v13, v1}, La/fet;->e(I)Z

    .line 346
    .line 347
    .line 348
    move-result v14

    .line 349
    if-eqz v14, :cond_e

    .line 350
    .line 351
    move v6, v7

    .line 352
    :cond_e
    or-int/2addr v8, v6

    .line 353
    :cond_f
    and-int/lit16 v6, v8, 0x93

    .line 354
    .line 355
    if-eq v6, v5, :cond_10

    .line 356
    .line 357
    move v5, v10

    .line 358
    goto :goto_a

    .line 359
    :cond_10
    move v5, v9

    .line 360
    :goto_a
    and-int/lit8 v6, v8, 0x1

    .line 361
    .line 362
    invoke-virtual {v13, v6, v5}, La/fet;->U(IZ)Z

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    if-eqz v5, :cond_12

    .line 367
    .line 368
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    check-cast v4, La/bkg0;

    .line 373
    .line 374
    const v5, 0x24042828

    .line 375
    .line 376
    .line 377
    invoke-virtual {v13, v5}, La/fet;->e0(I)V

    .line 378
    .line 379
    .line 380
    const/high16 v5, 0x3f400000    # 0.75f

    .line 381
    .line 382
    const/high16 v6, 0x43480000    # 200.0f

    .line 383
    .line 384
    const/4 v7, 0x0

    .line 385
    invoke-static {v5, v6, v7, v12}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    const/4 v6, 0x5

    .line 390
    invoke-static {v0, v2, v5, v6}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v14

    .line 398
    if-eqz v3, :cond_11

    .line 399
    .line 400
    check-cast v11, La/a4x;

    .line 401
    .line 402
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    sub-int/2addr v2, v10

    .line 407
    if-lt v1, v2, :cond_11

    .line 408
    .line 409
    move v15, v10

    .line 410
    goto :goto_b

    .line 411
    :cond_11
    move v15, v9

    .line 412
    :goto_b
    new-instance v1, La/f42;

    .line 413
    .line 414
    const/16 v2, 0xc

    .line 415
    .line 416
    invoke-direct {v1, v4, v2}, La/f42;-><init>(Ljava/lang/Object;B)V

    .line 417
    .line 418
    .line 419
    const v2, -0x32171421    # -4.8847152E8f

    .line 420
    .line 421
    .line 422
    invoke-static {v2, v1, v13}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 423
    .line 424
    .line 425
    move-result-object v16

    .line 426
    const/16 v18, 0xc00

    .line 427
    .line 428
    move-object/from16 v17, v13

    .line 429
    .line 430
    move-object v13, v0

    .line 431
    invoke-static/range {v13 .. v18}, La/j120;->C(La/mm40;Ljava/lang/String;ZLa/ugd;La/fet;I)V

    .line 432
    .line 433
    .line 434
    move-object/from16 v0, v17

    .line 435
    .line 436
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 437
    .line 438
    .line 439
    goto :goto_c

    .line 440
    :cond_12
    move-object v0, v13

    .line 441
    invoke-virtual {v0}, La/fet;->X()V

    .line 442
    .line 443
    .line 444
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 445
    .line 446
    return-object v0

    .line 447
    :pswitch_1
    move-object/from16 v0, p1

    .line 448
    .line 449
    check-cast v0, La/g9z;

    .line 450
    .line 451
    move-object/from16 v1, p2

    .line 452
    .line 453
    check-cast v1, Ljava/lang/Number;

    .line 454
    .line 455
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    move-object/from16 v2, p3

    .line 460
    .line 461
    check-cast v2, La/fet;

    .line 462
    .line 463
    move-object/from16 v13, p4

    .line 464
    .line 465
    check-cast v13, Ljava/lang/Number;

    .line 466
    .line 467
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 468
    .line 469
    .line 470
    move-result v13

    .line 471
    and-int/lit8 v14, v13, 0x6

    .line 472
    .line 473
    if-nez v14, :cond_14

    .line 474
    .line 475
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    if-eqz v0, :cond_13

    .line 480
    .line 481
    move v8, v12

    .line 482
    :cond_13
    or-int v0, v13, v8

    .line 483
    .line 484
    goto :goto_d

    .line 485
    :cond_14
    move v0, v13

    .line 486
    :goto_d
    and-int/lit8 v8, v13, 0x30

    .line 487
    .line 488
    if-nez v8, :cond_16

    .line 489
    .line 490
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 491
    .line 492
    .line 493
    move-result v8

    .line 494
    if-eqz v8, :cond_15

    .line 495
    .line 496
    move v6, v7

    .line 497
    :cond_15
    or-int/2addr v0, v6

    .line 498
    :cond_16
    and-int/lit16 v6, v0, 0x93

    .line 499
    .line 500
    if-eq v6, v5, :cond_17

    .line 501
    .line 502
    move v5, v10

    .line 503
    goto :goto_e

    .line 504
    :cond_17
    move v5, v9

    .line 505
    :goto_e
    and-int/2addr v0, v10

    .line 506
    invoke-virtual {v2, v0, v5}, La/fet;->U(IZ)Z

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    if-eqz v0, :cond_19

    .line 511
    .line 512
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    check-cast v0, La/fuf;

    .line 517
    .line 518
    const v1, 0x6fb28b45

    .line 519
    .line 520
    .line 521
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 522
    .line 523
    .line 524
    iget-object v14, v0, La/fuf;->a:Ljava/lang/String;

    .line 525
    .line 526
    if-eqz v3, :cond_18

    .line 527
    .line 528
    check-cast v11, Ljava/lang/String;

    .line 529
    .line 530
    invoke-virtual {v14, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v1

    .line 534
    if-eqz v1, :cond_18

    .line 535
    .line 536
    move v15, v10

    .line 537
    goto :goto_f

    .line 538
    :cond_18
    move v15, v9

    .line 539
    :goto_f
    new-instance v1, La/f42;

    .line 540
    .line 541
    invoke-direct {v1, v0, v12}, La/f42;-><init>(Ljava/lang/Object;B)V

    .line 542
    .line 543
    .line 544
    const v0, -0x7b7fae5b

    .line 545
    .line 546
    .line 547
    invoke-static {v0, v1, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 548
    .line 549
    .line 550
    move-result-object v16

    .line 551
    const/16 v18, 0xc00

    .line 552
    .line 553
    const/4 v13, 0x0

    .line 554
    move-object/from16 v17, v2

    .line 555
    .line 556
    invoke-static/range {v13 .. v18}, La/gkb;->H(La/mm40;Ljava/lang/String;ZLa/ugd;La/fet;I)V

    .line 557
    .line 558
    .line 559
    move-object/from16 v0, v17

    .line 560
    .line 561
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 562
    .line 563
    .line 564
    goto :goto_10

    .line 565
    :cond_19
    move-object v0, v2

    .line 566
    invoke-virtual {v0}, La/fet;->X()V

    .line 567
    .line 568
    .line 569
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 570
    .line 571
    return-object v0

    .line 572
    :pswitch_2
    move-object/from16 v1, p1

    .line 573
    .line 574
    check-cast v1, La/g9z;

    .line 575
    .line 576
    move-object/from16 v2, p2

    .line 577
    .line 578
    check-cast v2, Ljava/lang/Number;

    .line 579
    .line 580
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    move-object/from16 v3, p3

    .line 585
    .line 586
    check-cast v3, La/fet;

    .line 587
    .line 588
    move-object/from16 v13, p4

    .line 589
    .line 590
    check-cast v13, Ljava/lang/Number;

    .line 591
    .line 592
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 593
    .line 594
    .line 595
    move-result v13

    .line 596
    and-int/lit8 v14, v13, 0x6

    .line 597
    .line 598
    if-nez v14, :cond_1b

    .line 599
    .line 600
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    if-eqz v1, :cond_1a

    .line 605
    .line 606
    move v8, v12

    .line 607
    :cond_1a
    or-int v1, v13, v8

    .line 608
    .line 609
    goto :goto_11

    .line 610
    :cond_1b
    move v1, v13

    .line 611
    :goto_11
    and-int/lit8 v8, v13, 0x30

    .line 612
    .line 613
    if-nez v8, :cond_1d

    .line 614
    .line 615
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 616
    .line 617
    .line 618
    move-result v8

    .line 619
    if-eqz v8, :cond_1c

    .line 620
    .line 621
    move v6, v7

    .line 622
    :cond_1c
    or-int/2addr v1, v6

    .line 623
    :cond_1d
    and-int/lit16 v6, v1, 0x93

    .line 624
    .line 625
    if-eq v6, v5, :cond_1e

    .line 626
    .line 627
    move v5, v10

    .line 628
    goto :goto_12

    .line 629
    :cond_1e
    move v5, v9

    .line 630
    :goto_12
    and-int/2addr v1, v10

    .line 631
    invoke-virtual {v3, v1, v5}, La/fet;->U(IZ)Z

    .line 632
    .line 633
    .line 634
    move-result v1

    .line 635
    if-eqz v1, :cond_1f

    .line 636
    .line 637
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    move-object v14, v1

    .line 642
    check-cast v14, La/ex;

    .line 643
    .line 644
    const v1, 0x3a2feec5

    .line 645
    .line 646
    .line 647
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 648
    .line 649
    .line 650
    check-cast v11, La/zy;

    .line 651
    .line 652
    iget-boolean v1, v11, La/zy;->b:Z

    .line 653
    .line 654
    const/16 v18, 0x0

    .line 655
    .line 656
    const/4 v13, 0x0

    .line 657
    iget-boolean v15, v0, La/gx;->c:Z

    .line 658
    .line 659
    move/from16 v16, v1

    .line 660
    .line 661
    move-object/from16 v17, v3

    .line 662
    .line 663
    invoke-static/range {v13 .. v18}, La/vbw0;->a(La/mm40;La/ex;ZZLa/fet;I)V

    .line 664
    .line 665
    .line 666
    move-object/from16 v0, v17

    .line 667
    .line 668
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 669
    .line 670
    .line 671
    goto :goto_13

    .line 672
    :cond_1f
    move-object v0, v3

    .line 673
    invoke-virtual {v0}, La/fet;->X()V

    .line 674
    .line 675
    .line 676
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 677
    .line 678
    return-object v0

    .line 679
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
