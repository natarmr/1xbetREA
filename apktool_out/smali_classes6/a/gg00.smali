.class public final synthetic La/gg00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r020;

.field public final synthetic c:La/mm40;

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/r020;La/mm40;ZLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/gg00;->a:B

    iput-object p1, p0, La/gg00;->b:La/r020;

    iput-object p2, p0, La/gg00;->c:La/mm40;

    iput-boolean p3, p0, La/gg00;->d:Z

    iput-object p4, p0, La/gg00;->e:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gg00;->a:B

    .line 4
    .line 5
    sget-object v3, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/16 v4, 0x12

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x4

    .line 11
    const/4 v7, 0x0

    .line 12
    iget-object v8, v0, La/gg00;->c:La/mm40;

    .line 13
    .line 14
    iget-object v9, v0, La/gg00;->b:La/r020;

    .line 15
    .line 16
    sget-object v10, La/jm40;->b:La/jm40;

    .line 17
    .line 18
    const/high16 v11, 0x3f800000    # 1.0f

    .line 19
    .line 20
    const/4 v12, 0x1

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/lr8;

    .line 27
    .line 28
    move-object/from16 v13, p2

    .line 29
    .line 30
    check-cast v13, La/fet;

    .line 31
    .line 32
    move-object/from16 v14, p3

    .line 33
    .line 34
    check-cast v14, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v14

    .line 40
    sget-object v15, La/gqw0;->e:La/zx7;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    and-int/lit8 v16, v14, 0x6

    .line 46
    .line 47
    if-nez v16, :cond_1

    .line 48
    .line 49
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v16

    .line 53
    if-eqz v16, :cond_0

    .line 54
    .line 55
    move v5, v6

    .line 56
    :cond_0
    or-int/2addr v14, v5

    .line 57
    :cond_1
    and-int/lit8 v5, v14, 0x13

    .line 58
    .line 59
    if-eq v5, v4, :cond_2

    .line 60
    .line 61
    move v4, v12

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v4, v7

    .line 64
    :goto_0
    and-int/lit8 v5, v14, 0x1

    .line 65
    .line 66
    invoke-virtual {v13, v5, v4}, La/fet;->U(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_d

    .line 71
    .line 72
    invoke-virtual {v1}, La/lr8;->c()F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    instance-of v4, v9, La/n020;

    .line 77
    .line 78
    iget-object v5, v0, La/gg00;->e:Lkotlin/jvm/functions/Function1;

    .line 79
    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    const v1, -0x200514c1

    .line 83
    .line 84
    .line 85
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 86
    .line 87
    .line 88
    check-cast v9, La/n020;

    .line 89
    .line 90
    iget-object v1, v9, La/n020;->a:La/m020;

    .line 91
    .line 92
    move-object/from16 v27, v13

    .line 93
    .line 94
    iget-object v13, v1, La/m020;->d:La/a4x;

    .line 95
    .line 96
    iget-object v14, v1, La/m020;->f:La/ehm0;

    .line 97
    .line 98
    iget-object v15, v1, La/m020;->g:La/ehm0;

    .line 99
    .line 100
    iget-object v2, v1, La/m020;->h:La/ehm0;

    .line 101
    .line 102
    iget-object v3, v1, La/m020;->b:La/a4x;

    .line 103
    .line 104
    iget-object v4, v1, La/m020;->a:La/l7m0;

    .line 105
    .line 106
    iget-object v6, v1, La/m020;->e:La/db00;

    .line 107
    .line 108
    iget-object v9, v1, La/m020;->i:La/ehm0;

    .line 109
    .line 110
    iget-object v10, v1, La/m020;->j:La/ehm0;

    .line 111
    .line 112
    iget-object v12, v1, La/m020;->k:La/ehm0;

    .line 113
    .line 114
    iget-object v1, v1, La/m020;->l:La/ehm0;

    .line 115
    .line 116
    invoke-static {v8, v11}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 117
    .line 118
    .line 119
    move-result-object v26

    .line 120
    const/16 v28, 0x0

    .line 121
    .line 122
    iget-boolean v0, v0, La/gg00;->d:Z

    .line 123
    .line 124
    move/from16 v24, v0

    .line 125
    .line 126
    move-object/from16 v20, v1

    .line 127
    .line 128
    move-object/from16 v16, v2

    .line 129
    .line 130
    move-object/from16 v22, v3

    .line 131
    .line 132
    move-object/from16 v23, v4

    .line 133
    .line 134
    move-object/from16 v25, v5

    .line 135
    .line 136
    move-object/from16 v21, v6

    .line 137
    .line 138
    move-object/from16 v17, v9

    .line 139
    .line 140
    move-object/from16 v18, v10

    .line 141
    .line 142
    move-object/from16 v19, v12

    .line 143
    .line 144
    invoke-static/range {v13 .. v28}, La/hkb;->c(La/a4x;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/db00;La/a4x;La/l7m0;ZLkotlin/jvm/functions/Function1;La/mm40;La/fet;I)V

    .line 145
    .line 146
    .line 147
    move-object/from16 v0, v27

    .line 148
    .line 149
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_5

    .line 153
    .line 154
    :cond_3
    move-object v4, v5

    .line 155
    move-object v0, v13

    .line 156
    instance-of v5, v9, La/p020;

    .line 157
    .line 158
    if-eqz v5, :cond_4

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    instance-of v6, v9, La/q020;

    .line 162
    .line 163
    if-eqz v6, :cond_5

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_5
    instance-of v6, v9, La/o020;

    .line 167
    .line 168
    if-eqz v6, :cond_c

    .line 169
    .line 170
    :goto_1
    const v6, -0x1ff208ea

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v6}, La/fet;->e0(I)V

    .line 174
    .line 175
    .line 176
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 177
    .line 178
    invoke-virtual {v0, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 183
    .line 184
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 185
    .line 186
    .line 187
    move-result-wide v13

    .line 188
    sget-object v6, La/qmk;->a:La/zcl;

    .line 189
    .line 190
    const/high16 v6, 0x41c00000    # 24.0f

    .line 191
    .line 192
    const/4 v12, 0x0

    .line 193
    const/16 v2, 0xc

    .line 194
    .line 195
    invoke-static {v6, v6, v12, v12, v2}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    invoke-static {v8, v13, v14, v11}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    invoke-static {v6, v6, v12, v12, v2}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-static {v8, v2}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    sget-object v6, La/gqw0;->a:La/zx7;

    .line 212
    .line 213
    invoke-static {v6, v7}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    iget-wide v11, v0, La/fet;->T:J

    .line 218
    .line 219
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 224
    .line 225
    .line 226
    move-result-object v11

    .line 227
    invoke-static {v0, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 232
    .line 233
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, La/fet;->i0()V

    .line 237
    .line 238
    .line 239
    iget-boolean v12, v0, La/fet;->S:Z

    .line 240
    .line 241
    if-eqz v12, :cond_6

    .line 242
    .line 243
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 244
    .line 245
    invoke-virtual {v0, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 246
    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_6
    invoke-virtual {v0}, La/fet;->r0()V

    .line 250
    .line 251
    .line 252
    :goto_2
    sget-object v12, La/gqw0;->x:La/shd;

    .line 253
    .line 254
    invoke-static {v0, v6, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 255
    .line 256
    .line 257
    sget-object v6, La/gqw0;->w:La/shd;

    .line 258
    .line 259
    invoke-static {v0, v11, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    sget-object v8, La/gqw0;->y:La/shd;

    .line 267
    .line 268
    invoke-static {v0, v6, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 269
    .line 270
    .line 271
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 272
    .line 273
    .line 274
    sget-object v6, La/gqw0;->v:La/shd;

    .line 275
    .line 276
    invoke-static {v0, v2, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 277
    .line 278
    .line 279
    sget-object v2, La/jr8;->a:La/jr8;

    .line 280
    .line 281
    if-eqz v5, :cond_9

    .line 282
    .line 283
    const v1, 0x4b100601    # 9438721.0f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v10, v15}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    check-cast v9, La/p020;

    .line 294
    .line 295
    iget-object v2, v9, La/p020;->a:La/eb10;

    .line 296
    .line 297
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    if-nez v5, :cond_7

    .line 306
    .line 307
    if-ne v6, v3, :cond_8

    .line 308
    .line 309
    :cond_7
    new-instance v6, La/gno0;

    .line 310
    .line 311
    const/16 v3, 0x11

    .line 312
    .line 313
    invoke-direct {v6, v4, v3}, La/gno0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 320
    .line 321
    invoke-static {v1, v2, v6, v0, v7}, La/r7x;->b(La/mm40;La/eb10;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 325
    .line 326
    .line 327
    :goto_3
    const/4 v1, 0x1

    .line 328
    goto :goto_4

    .line 329
    :cond_9
    instance-of v3, v9, La/q020;

    .line 330
    .line 331
    if-eqz v3, :cond_a

    .line 332
    .line 333
    const v2, 0x4b175b14    # 9919252.0f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 337
    .line 338
    .line 339
    invoke-static {v1}, La/iym0;->r(F)I

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    const/high16 v2, 0x3f800000    # 1.0f

    .line 344
    .line 345
    invoke-static {v10, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    const/16 v3, 0x30

    .line 350
    .line 351
    invoke-static {v1, v3, v0, v2}, La/j0x;->l(IILa/fet;La/mm40;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 355
    .line 356
    .line 357
    goto :goto_3

    .line 358
    :cond_a
    instance-of v1, v9, La/o020;

    .line 359
    .line 360
    if-eqz v1, :cond_b

    .line 361
    .line 362
    const v1, 0x4b1d6781    # 1.0315649E7f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2, v10, v15}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    check-cast v9, La/o020;

    .line 373
    .line 374
    iget-object v2, v9, La/o020;->a:La/eb10;

    .line 375
    .line 376
    invoke-static {v1, v2, v0, v7}, La/q7x;->d(La/mm40;La/eb10;La/fet;I)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 380
    .line 381
    .line 382
    goto :goto_3

    .line 383
    :goto_4
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 387
    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_b
    const v1, -0xe18495a

    .line 391
    .line 392
    .line 393
    invoke-static {v1, v0, v7}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    throw v0

    .line 398
    :cond_c
    const v1, 0x518c329f

    .line 399
    .line 400
    .line 401
    invoke-static {v1, v0, v7}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    throw v0

    .line 406
    :cond_d
    move-object v0, v13

    .line 407
    invoke-virtual {v0}, La/fet;->X()V

    .line 408
    .line 409
    .line 410
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_0
    move-object/from16 v1, p1

    .line 414
    .line 415
    check-cast v1, La/lr8;

    .line 416
    .line 417
    move-object/from16 v2, p2

    .line 418
    .line 419
    check-cast v2, La/fet;

    .line 420
    .line 421
    move-object/from16 v11, p3

    .line 422
    .line 423
    check-cast v11, Ljava/lang/Integer;

    .line 424
    .line 425
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 426
    .line 427
    .line 428
    move-result v11

    .line 429
    sget-object v12, La/gqw0;->e:La/zx7;

    .line 430
    .line 431
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    and-int/lit8 v13, v11, 0x6

    .line 435
    .line 436
    if-nez v13, :cond_f

    .line 437
    .line 438
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v13

    .line 442
    if-eqz v13, :cond_e

    .line 443
    .line 444
    move v5, v6

    .line 445
    :cond_e
    or-int/2addr v11, v5

    .line 446
    :cond_f
    and-int/lit8 v5, v11, 0x13

    .line 447
    .line 448
    if-eq v5, v4, :cond_10

    .line 449
    .line 450
    const/4 v4, 0x1

    .line 451
    :goto_6
    const/16 v16, 0x1

    .line 452
    .line 453
    goto :goto_7

    .line 454
    :cond_10
    move v4, v7

    .line 455
    goto :goto_6

    .line 456
    :goto_7
    and-int/lit8 v5, v11, 0x1

    .line 457
    .line 458
    invoke-virtual {v2, v5, v4}, La/fet;->U(IZ)Z

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    if-eqz v4, :cond_17

    .line 463
    .line 464
    invoke-virtual {v1}, La/lr8;->c()F

    .line 465
    .line 466
    .line 467
    move-result v4

    .line 468
    instance-of v5, v9, La/n020;

    .line 469
    .line 470
    iget-object v6, v0, La/gg00;->e:Lkotlin/jvm/functions/Function1;

    .line 471
    .line 472
    if-eqz v5, :cond_11

    .line 473
    .line 474
    const v1, 0x2d30d7c9

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 478
    .line 479
    .line 480
    check-cast v9, La/n020;

    .line 481
    .line 482
    iget-object v1, v9, La/n020;->a:La/m020;

    .line 483
    .line 484
    iget-object v3, v1, La/m020;->d:La/a4x;

    .line 485
    .line 486
    iget-object v4, v1, La/m020;->f:La/ehm0;

    .line 487
    .line 488
    iget-object v5, v1, La/m020;->g:La/ehm0;

    .line 489
    .line 490
    iget-object v9, v1, La/m020;->h:La/ehm0;

    .line 491
    .line 492
    iget-object v10, v1, La/m020;->e:La/db00;

    .line 493
    .line 494
    iget-object v11, v1, La/m020;->i:La/ehm0;

    .line 495
    .line 496
    iget-object v12, v1, La/m020;->j:La/ehm0;

    .line 497
    .line 498
    iget-object v13, v1, La/m020;->k:La/ehm0;

    .line 499
    .line 500
    iget-object v1, v1, La/m020;->l:La/ehm0;

    .line 501
    .line 502
    const/high16 v14, 0x3f800000    # 1.0f

    .line 503
    .line 504
    invoke-static {v8, v14}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 505
    .line 506
    .line 507
    move-result-object v30

    .line 508
    const/16 v32, 0x0

    .line 509
    .line 510
    iget-boolean v0, v0, La/gg00;->d:Z

    .line 511
    .line 512
    move/from16 v28, v0

    .line 513
    .line 514
    move-object/from16 v26, v1

    .line 515
    .line 516
    move-object/from16 v31, v2

    .line 517
    .line 518
    move-object/from16 v19, v3

    .line 519
    .line 520
    move-object/from16 v20, v4

    .line 521
    .line 522
    move-object/from16 v21, v5

    .line 523
    .line 524
    move-object/from16 v29, v6

    .line 525
    .line 526
    move-object/from16 v22, v9

    .line 527
    .line 528
    move-object/from16 v27, v10

    .line 529
    .line 530
    move-object/from16 v23, v11

    .line 531
    .line 532
    move-object/from16 v24, v12

    .line 533
    .line 534
    move-object/from16 v25, v13

    .line 535
    .line 536
    invoke-static/range {v19 .. v32}, La/kkb;->f(La/a4x;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/db00;ZLkotlin/jvm/functions/Function1;La/mm40;La/fet;I)V

    .line 537
    .line 538
    .line 539
    move-object/from16 v0, v31

    .line 540
    .line 541
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 542
    .line 543
    .line 544
    goto/16 :goto_8

    .line 545
    .line 546
    :cond_11
    move-object v0, v2

    .line 547
    move-object v2, v6

    .line 548
    instance-of v5, v9, La/p020;

    .line 549
    .line 550
    if-eqz v5, :cond_14

    .line 551
    .line 552
    const v4, 0x33020bba

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v4}, La/fet;->e0(I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v1, v10, v12}, La/lr8;->b(La/mm40;La/u12;)La/mm40;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    check-cast v9, La/p020;

    .line 563
    .line 564
    iget-object v4, v9, La/p020;->a:La/eb10;

    .line 565
    .line 566
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    move-result v5

    .line 570
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v6

    .line 574
    if-nez v5, :cond_12

    .line 575
    .line 576
    if-ne v6, v3, :cond_13

    .line 577
    .line 578
    :cond_12
    new-instance v6, La/dg00;

    .line 579
    .line 580
    const/4 v3, 0x1

    .line 581
    invoke-direct {v6, v2, v3}, La/dg00;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    :cond_13
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 588
    .line 589
    invoke-static {v1, v4, v6, v0, v7}, La/r7x;->b(La/mm40;La/eb10;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 593
    .line 594
    .line 595
    goto :goto_8

    .line 596
    :cond_14
    instance-of v2, v9, La/o020;

    .line 597
    .line 598
    if-eqz v2, :cond_15

    .line 599
    .line 600
    const v2, 0x3302385e

    .line 601
    .line 602
    .line 603
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1, v10, v12}, La/lr8;->b(La/mm40;La/u12;)La/mm40;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    check-cast v9, La/o020;

    .line 611
    .line 612
    iget-object v2, v9, La/o020;->a:La/eb10;

    .line 613
    .line 614
    invoke-static {v1, v2, v0, v7}, La/q7x;->d(La/mm40;La/eb10;La/fet;I)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 618
    .line 619
    .line 620
    goto :goto_8

    .line 621
    :cond_15
    instance-of v1, v9, La/q020;

    .line 622
    .line 623
    if-eqz v1, :cond_16

    .line 624
    .line 625
    const v1, 0x2d483f24

    .line 626
    .line 627
    .line 628
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 629
    .line 630
    .line 631
    invoke-static {v4}, La/iym0;->r(F)I

    .line 632
    .line 633
    .line 634
    move-result v1

    .line 635
    const/high16 v14, 0x3f800000    # 1.0f

    .line 636
    .line 637
    invoke-static {v10, v14}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    const/16 v3, 0x30

    .line 642
    .line 643
    invoke-static {v1, v3, v0, v2}, La/s0x;->t(IILa/fet;La/mm40;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 647
    .line 648
    .line 649
    goto :goto_8

    .line 650
    :cond_16
    const v1, 0x33018919

    .line 651
    .line 652
    .line 653
    invoke-static {v1, v0, v7}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    throw v0

    .line 658
    :cond_17
    move-object v0, v2

    .line 659
    invoke-virtual {v0}, La/fet;->X()V

    .line 660
    .line 661
    .line 662
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 663
    .line 664
    return-object v0

    .line 665
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
