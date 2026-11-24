.class public final synthetic La/yjm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/yjm;->a:B

    iput p1, p0, La/yjm;->b:F

    iput-object p2, p0, La/yjm;->c:Ljava/lang/Object;

    iput-object p3, p0, La/yjm;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/y3d;FLa/l7m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/yjm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yjm;->c:Ljava/lang/Object;

    iput p2, p0, La/yjm;->b:F

    iput-object p3, p0, La/yjm;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yjm;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/16 v3, 0x80

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v0, La/yjm;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, La/yjm;->c:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v7, La/ugg0;

    .line 19
    .line 20
    check-cast v6, La/fqj0;

    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, La/k8z;

    .line 25
    .line 26
    move-object/from16 v8, p2

    .line 27
    .line 28
    check-cast v8, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object/from16 v8, p3

    .line 34
    .line 35
    check-cast v8, La/fet;

    .line 36
    .line 37
    move-object/from16 v9, p4

    .line 38
    .line 39
    check-cast v9, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    and-int/lit16 v1, v9, 0x81

    .line 49
    .line 50
    if-eq v1, v3, :cond_0

    .line 51
    .line 52
    move v1, v5

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v1, v4

    .line 55
    :goto_0
    and-int/lit8 v3, v9, 0x1

    .line 56
    .line 57
    invoke-virtual {v8, v3, v1}, La/fet;->U(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    iget v0, v0, La/yjm;->b:F

    .line 64
    .line 65
    invoke-static {v2, v0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 70
    .line 71
    invoke-static {v1, v0, v4}, La/ny9;->O(FLa/mm40;Z)La/mm40;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0, v7}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0, v6}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v4, v8, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v8}, La/fet;->X()V

    .line 88
    .line 89
    .line 90
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_0
    check-cast v7, La/kz20;

    .line 94
    .line 95
    move-object v15, v6

    .line 96
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 97
    .line 98
    move-object/from16 v8, p1

    .line 99
    .line 100
    check-cast v8, La/mm40;

    .line 101
    .line 102
    move-object/from16 v1, p2

    .line 103
    .line 104
    check-cast v1, La/qym0;

    .line 105
    .line 106
    move-object/from16 v2, p3

    .line 107
    .line 108
    check-cast v2, La/fet;

    .line 109
    .line 110
    move-object/from16 v3, p4

    .line 111
    .line 112
    check-cast v3, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    and-int/lit8 v6, v3, 0x6

    .line 125
    .line 126
    if-nez v6, :cond_3

    .line 127
    .line 128
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    if-eqz v6, :cond_2

    .line 133
    .line 134
    const/4 v6, 0x4

    .line 135
    goto :goto_2

    .line 136
    :cond_2
    const/4 v6, 0x2

    .line 137
    :goto_2
    or-int/2addr v6, v3

    .line 138
    goto :goto_3

    .line 139
    :cond_3
    move v6, v3

    .line 140
    :goto_3
    and-int/lit8 v9, v3, 0x30

    .line 141
    .line 142
    const/16 v14, 0x40

    .line 143
    .line 144
    if-nez v9, :cond_6

    .line 145
    .line 146
    and-int/2addr v3, v14

    .line 147
    if-nez v3, :cond_4

    .line 148
    .line 149
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    goto :goto_4

    .line 154
    :cond_4
    invoke-virtual {v2, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    :goto_4
    if-eqz v3, :cond_5

    .line 159
    .line 160
    const/16 v3, 0x20

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_5
    const/16 v3, 0x10

    .line 164
    .line 165
    :goto_5
    or-int/2addr v6, v3

    .line 166
    :cond_6
    and-int/lit16 v3, v6, 0x93

    .line 167
    .line 168
    const/16 v9, 0x92

    .line 169
    .line 170
    if-eq v3, v9, :cond_7

    .line 171
    .line 172
    move v4, v5

    .line 173
    :cond_7
    and-int/lit8 v3, v6, 0x1

    .line 174
    .line 175
    invoke-virtual {v2, v3, v4}, La/fet;->U(IZ)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_8

    .line 180
    .line 181
    const/4 v12, 0x0

    .line 182
    const/16 v13, 0xe

    .line 183
    .line 184
    iget v9, v0, La/yjm;->b:F

    .line 185
    .line 186
    const/4 v10, 0x0

    .line 187
    const/4 v11, 0x0

    .line 188
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 193
    .line 194
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 199
    .line 200
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 201
    .line 202
    .line 203
    move-result-wide v10

    .line 204
    iget-boolean v12, v7, La/kz20;->k:Z

    .line 205
    .line 206
    and-int/lit8 v0, v6, 0x70

    .line 207
    .line 208
    or-int v17, v14, v0

    .line 209
    .line 210
    const/16 v18, 0x30

    .line 211
    .line 212
    const/4 v13, 0x0

    .line 213
    const/4 v14, 0x0

    .line 214
    move-object v9, v1

    .line 215
    move-object/from16 v16, v2

    .line 216
    .line 217
    invoke-static/range {v8 .. v18}, La/iym0;->b(La/mm40;La/qym0;JZZZLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_8
    move-object/from16 v16, v2

    .line 222
    .line 223
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 224
    .line 225
    .line 226
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object v0

    .line 229
    :pswitch_1
    check-cast v7, La/y3d;

    .line 230
    .line 231
    check-cast v6, La/l7m0;

    .line 232
    .line 233
    move-object/from16 v1, p1

    .line 234
    .line 235
    check-cast v1, La/b53;

    .line 236
    .line 237
    move-object/from16 v8, p2

    .line 238
    .line 239
    check-cast v8, Ljava/lang/Boolean;

    .line 240
    .line 241
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    move-object/from16 v14, p3

    .line 245
    .line 246
    check-cast v14, La/fet;

    .line 247
    .line 248
    move-object/from16 v8, p4

    .line 249
    .line 250
    check-cast v8, Ljava/lang/Integer;

    .line 251
    .line 252
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    and-int/lit16 v1, v8, 0x81

    .line 260
    .line 261
    if-eq v1, v3, :cond_9

    .line 262
    .line 263
    move v1, v5

    .line 264
    goto :goto_7

    .line 265
    :cond_9
    move v1, v4

    .line 266
    :goto_7
    and-int/lit8 v3, v8, 0x1

    .line 267
    .line 268
    invoke-virtual {v14, v3, v1}, La/fet;->U(IZ)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-eqz v1, :cond_c

    .line 273
    .line 274
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 275
    .line 276
    invoke-static {v1, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    iget-wide v8, v14, La/fet;->T:J

    .line 281
    .line 282
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    invoke-virtual {v14}, La/fet;->m()La/bh90;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    invoke-static {v14, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 295
    .line 296
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v14}, La/fet;->i0()V

    .line 300
    .line 301
    .line 302
    iget-boolean v10, v14, La/fet;->S:Z

    .line 303
    .line 304
    if-eqz v10, :cond_a

    .line 305
    .line 306
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 307
    .line 308
    invoke-virtual {v14, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 309
    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_a
    invoke-virtual {v14}, La/fet;->r0()V

    .line 313
    .line 314
    .line 315
    :goto_8
    sget-object v10, La/gqw0;->x:La/shd;

    .line 316
    .line 317
    invoke-static {v14, v1, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 318
    .line 319
    .line 320
    sget-object v1, La/gqw0;->w:La/shd;

    .line 321
    .line 322
    invoke-static {v14, v8, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 323
    .line 324
    .line 325
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    sget-object v3, La/gqw0;->y:La/shd;

    .line 330
    .line 331
    invoke-static {v14, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 332
    .line 333
    .line 334
    invoke-static {v14}, La/jpm0;->n(La/fet;)V

    .line 335
    .line 336
    .line 337
    sget-object v1, La/gqw0;->v:La/shd;

    .line 338
    .line 339
    invoke-static {v14, v9, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 340
    .line 341
    .line 342
    const v1, 0x7f080ba8

    .line 343
    .line 344
    .line 345
    invoke-static {v1, v4, v14}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 346
    .line 347
    .line 348
    move-result-object v9

    .line 349
    const v1, -0x69af5844

    .line 350
    .line 351
    .line 352
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 353
    .line 354
    .line 355
    sget-object v1, La/m8m0;->a:La/zfn;

    .line 356
    .line 357
    invoke-virtual {v14, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 362
    .line 363
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 364
    .line 365
    .line 366
    move-result-wide v10

    .line 367
    invoke-virtual {v14, v4}, La/fet;->r(Z)V

    .line 368
    .line 369
    .line 370
    new-instance v15, La/m78;

    .line 371
    .line 372
    const/4 v1, 0x5

    .line 373
    invoke-direct {v15, v10, v11, v1}, La/m78;-><init>(JI)V

    .line 374
    .line 375
    .line 376
    const/16 v18, 0x3c

    .line 377
    .line 378
    const/4 v10, 0x0

    .line 379
    const/4 v11, 0x0

    .line 380
    const/4 v12, 0x0

    .line 381
    const/4 v13, 0x0

    .line 382
    move-object/from16 v16, v14

    .line 383
    .line 384
    const/4 v14, 0x0

    .line 385
    const/16 v17, 0x38

    .line 386
    .line 387
    invoke-static/range {v9 .. v18}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 388
    .line 389
    .line 390
    move-object/from16 v14, v16

    .line 391
    .line 392
    move/from16 v15, v17

    .line 393
    .line 394
    const v1, 0x7f080812

    .line 395
    .line 396
    .line 397
    invoke-static {v1, v4, v14}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 398
    .line 399
    .line 400
    move-result-object v9

    .line 401
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 402
    .line 403
    invoke-virtual {v14, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 408
    .line 409
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimaryForeground-0d7_KjU()J

    .line 410
    .line 411
    .line 412
    move-result-wide v12

    .line 413
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    check-cast v3, La/ycl;

    .line 418
    .line 419
    iget v3, v3, La/ycl;->a:F

    .line 420
    .line 421
    invoke-static {v2, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    if-nez v7, :cond_b

    .line 426
    .line 427
    const v3, -0x69af23a2

    .line 428
    .line 429
    .line 430
    invoke-virtual {v14, v3}, La/fet;->e0(I)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v14, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 438
    .line 439
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 440
    .line 441
    .line 442
    move-result-wide v6

    .line 443
    invoke-virtual {v14, v4}, La/fet;->r(Z)V

    .line 444
    .line 445
    .line 446
    goto :goto_9

    .line 447
    :cond_b
    const v1, -0x69af281d

    .line 448
    .line 449
    .line 450
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v14, v4}, La/fet;->r(Z)V

    .line 454
    .line 455
    .line 456
    iget-wide v6, v7, La/y3d;->a:J

    .line 457
    .line 458
    :goto_9
    sget-object v1, La/vgg0;->a:La/ugg0;

    .line 459
    .line 460
    invoke-static {v2, v6, v7, v1}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 461
    .line 462
    .line 463
    move-result-object v16

    .line 464
    const/16 v34, 0x0

    .line 465
    .line 466
    const v35, 0xffffc

    .line 467
    .line 468
    .line 469
    iget v0, v0, La/yjm;->b:F

    .line 470
    .line 471
    const/16 v19, 0x0

    .line 472
    .line 473
    const/16 v20, 0x0

    .line 474
    .line 475
    const/16 v21, 0x0

    .line 476
    .line 477
    const/16 v22, 0x0

    .line 478
    .line 479
    const/16 v23, 0x0

    .line 480
    .line 481
    const/16 v24, 0x0

    .line 482
    .line 483
    const-wide/16 v25, 0x0

    .line 484
    .line 485
    const/16 v27, 0x0

    .line 486
    .line 487
    const/16 v28, 0x0

    .line 488
    .line 489
    const-wide/16 v29, 0x0

    .line 490
    .line 491
    const-wide/16 v31, 0x0

    .line 492
    .line 493
    const/16 v33, 0x0

    .line 494
    .line 495
    move/from16 v18, v0

    .line 496
    .line 497
    move/from16 v17, v0

    .line 498
    .line 499
    invoke-static/range {v16 .. v35}, La/i4w0;->U(La/mm40;FFFFFFFFJLa/yjj0;ZJJILa/z5z;I)La/mm40;

    .line 500
    .line 501
    .line 502
    move-result-object v11

    .line 503
    const/4 v10, 0x0

    .line 504
    const/16 v16, 0x0

    .line 505
    .line 506
    invoke-static/range {v9 .. v16}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v14, v5}, La/fet;->r(Z)V

    .line 510
    .line 511
    .line 512
    goto :goto_a

    .line 513
    :cond_c
    invoke-virtual {v14}, La/fet;->X()V

    .line 514
    .line 515
    .line 516
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 517
    .line 518
    return-object v0

    .line 519
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
