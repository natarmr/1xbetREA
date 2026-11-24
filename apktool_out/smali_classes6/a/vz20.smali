.class public final synthetic La/vz20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xdr;

.field public final synthetic c:La/xdr;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/xdr;La/xdr;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/vz20;->a:B

    iput-object p1, p0, La/vz20;->b:La/xdr;

    iput-object p2, p0, La/vz20;->c:La/xdr;

    iput-object p3, p0, La/vz20;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vz20;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/high16 v4, 0x41000000    # 8.0f

    .line 10
    .line 11
    const/16 v5, 0x40

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/16 v7, 0x12

    .line 15
    .line 16
    const/4 v8, 0x2

    .line 17
    const/4 v9, 0x4

    .line 18
    const/4 v10, 0x1

    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v12, p1

    .line 23
    .line 24
    check-cast v12, La/uv20;

    .line 25
    .line 26
    move-object/from16 v1, p2

    .line 27
    .line 28
    check-cast v1, La/fet;

    .line 29
    .line 30
    move-object/from16 v2, p3

    .line 31
    .line 32
    check-cast v2, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    and-int/lit8 v3, v2, 0x6

    .line 42
    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    and-int/lit8 v3, v2, 0x8

    .line 46
    .line 47
    if-nez v3, :cond_0

    .line 48
    .line 49
    invoke-virtual {v1, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v1, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    :goto_0
    if-eqz v3, :cond_1

    .line 59
    .line 60
    move v8, v9

    .line 61
    :cond_1
    or-int/2addr v2, v8

    .line 62
    :cond_2
    and-int/lit8 v3, v2, 0x13

    .line 63
    .line 64
    if-eq v3, v7, :cond_3

    .line 65
    .line 66
    move v6, v10

    .line 67
    :cond_3
    and-int/lit8 v3, v2, 0x1

    .line 68
    .line 69
    invoke-virtual {v1, v3, v6}, La/fet;->U(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    shl-int/lit8 v2, v2, 0x3

    .line 76
    .line 77
    and-int/lit8 v2, v2, 0x70

    .line 78
    .line 79
    or-int v17, v5, v2

    .line 80
    .line 81
    const/4 v11, 0x0

    .line 82
    iget-object v13, v0, La/vz20;->b:La/xdr;

    .line 83
    .line 84
    iget-object v14, v0, La/vz20;->c:La/xdr;

    .line 85
    .line 86
    iget-object v15, v0, La/vz20;->d:Lkotlin/jvm/functions/Function1;

    .line 87
    .line 88
    move-object/from16 v16, v1

    .line 89
    .line 90
    invoke-static/range {v11 .. v17}, La/x1x;->h(La/mm40;La/uv20;La/xdr;La/xdr;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    move-object/from16 v16, v1

    .line 95
    .line 96
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 97
    .line 98
    .line 99
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_0
    move-object/from16 v2, p1

    .line 103
    .line 104
    check-cast v2, La/uv20;

    .line 105
    .line 106
    move v1, v6

    .line 107
    move-object/from16 v6, p2

    .line 108
    .line 109
    check-cast v6, La/fet;

    .line 110
    .line 111
    move-object/from16 v3, p3

    .line 112
    .line 113
    check-cast v3, Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    and-int/lit8 v4, v3, 0x6

    .line 123
    .line 124
    if-nez v4, :cond_7

    .line 125
    .line 126
    and-int/lit8 v4, v3, 0x8

    .line 127
    .line 128
    if-nez v4, :cond_5

    .line 129
    .line 130
    invoke-virtual {v6, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    goto :goto_2

    .line 135
    :cond_5
    invoke-virtual {v6, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    :goto_2
    if-eqz v4, :cond_6

    .line 140
    .line 141
    move v8, v9

    .line 142
    :cond_6
    or-int/2addr v3, v8

    .line 143
    :cond_7
    and-int/lit8 v4, v3, 0x13

    .line 144
    .line 145
    if-eq v4, v7, :cond_8

    .line 146
    .line 147
    move v1, v10

    .line 148
    :cond_8
    and-int/lit8 v4, v3, 0x1

    .line 149
    .line 150
    invoke-virtual {v6, v4, v1}, La/fet;->U(IZ)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_9

    .line 155
    .line 156
    shl-int/lit8 v1, v3, 0x3

    .line 157
    .line 158
    and-int/lit8 v1, v1, 0x70

    .line 159
    .line 160
    or-int v7, v5, v1

    .line 161
    .line 162
    const/4 v1, 0x0

    .line 163
    iget-object v3, v0, La/vz20;->b:La/xdr;

    .line 164
    .line 165
    iget-object v4, v0, La/vz20;->c:La/xdr;

    .line 166
    .line 167
    iget-object v5, v0, La/vz20;->d:Lkotlin/jvm/functions/Function1;

    .line 168
    .line 169
    invoke-static/range {v1 .. v7}, La/g1x;->c(La/mm40;La/uv20;La/xdr;La/xdr;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_9
    invoke-virtual {v6}, La/fet;->X()V

    .line 174
    .line 175
    .line 176
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_1
    move v1, v6

    .line 180
    move-object/from16 v6, p1

    .line 181
    .line 182
    check-cast v6, La/uv20;

    .line 183
    .line 184
    move-object/from16 v11, p2

    .line 185
    .line 186
    check-cast v11, La/fet;

    .line 187
    .line 188
    move-object/from16 v12, p3

    .line 189
    .line 190
    check-cast v12, Ljava/lang/Integer;

    .line 191
    .line 192
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    and-int/lit8 v13, v12, 0x6

    .line 200
    .line 201
    if-nez v13, :cond_c

    .line 202
    .line 203
    and-int/lit8 v13, v12, 0x8

    .line 204
    .line 205
    if-nez v13, :cond_a

    .line 206
    .line 207
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    goto :goto_4

    .line 212
    :cond_a
    invoke-virtual {v11, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    :goto_4
    if-eqz v13, :cond_b

    .line 217
    .line 218
    move v8, v9

    .line 219
    :cond_b
    or-int/2addr v12, v8

    .line 220
    :cond_c
    and-int/lit8 v8, v12, 0x13

    .line 221
    .line 222
    if-eq v8, v7, :cond_d

    .line 223
    .line 224
    move v1, v10

    .line 225
    :cond_d
    and-int/lit8 v7, v12, 0x1

    .line 226
    .line 227
    invoke-virtual {v11, v7, v1}, La/fet;->U(IZ)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_f

    .line 232
    .line 233
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 238
    .line 239
    invoke-virtual {v11, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 244
    .line 245
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 246
    .line 247
    .line 248
    move-result-wide v2

    .line 249
    sget-object v7, La/jd8;->n:La/ljc;

    .line 250
    .line 251
    invoke-static {v1, v2, v3, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    sget-object v2, La/qmk;->a:La/zcl;

    .line 256
    .line 257
    iget-boolean v2, v6, La/uv20;->d:Z

    .line 258
    .line 259
    const/high16 v3, 0x41400000    # 12.0f

    .line 260
    .line 261
    if-eqz v2, :cond_e

    .line 262
    .line 263
    const/4 v2, 0x0

    .line 264
    goto :goto_5

    .line 265
    :cond_e
    move v2, v3

    .line 266
    :goto_5
    new-instance v7, La/lh80;

    .line 267
    .line 268
    invoke-direct {v7, v4, v3, v4, v2}, La/lh80;-><init>(FFFF)V

    .line 269
    .line 270
    .line 271
    invoke-static {v1, v7}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    shl-int/lit8 v2, v12, 0x3

    .line 276
    .line 277
    and-int/lit8 v2, v2, 0x70

    .line 278
    .line 279
    or-int v7, v5, v2

    .line 280
    .line 281
    iget-object v3, v0, La/vz20;->b:La/xdr;

    .line 282
    .line 283
    iget-object v4, v0, La/vz20;->c:La/xdr;

    .line 284
    .line 285
    iget-object v5, v0, La/vz20;->d:Lkotlin/jvm/functions/Function1;

    .line 286
    .line 287
    move-object v2, v6

    .line 288
    move-object v6, v11

    .line 289
    invoke-static/range {v1 .. v7}, La/s0x;->k(La/mm40;La/uv20;La/xdr;La/xdr;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 290
    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_f
    move-object v6, v11

    .line 294
    invoke-virtual {v6}, La/fet;->X()V

    .line 295
    .line 296
    .line 297
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_2
    move v1, v6

    .line 301
    move-object/from16 v6, p1

    .line 302
    .line 303
    check-cast v6, La/uv20;

    .line 304
    .line 305
    move-object/from16 v11, p2

    .line 306
    .line 307
    check-cast v11, La/fet;

    .line 308
    .line 309
    move-object/from16 v12, p3

    .line 310
    .line 311
    check-cast v12, Ljava/lang/Integer;

    .line 312
    .line 313
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 314
    .line 315
    .line 316
    move-result v12

    .line 317
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    iget-boolean v13, v6, La/uv20;->d:Z

    .line 321
    .line 322
    and-int/lit8 v14, v12, 0x6

    .line 323
    .line 324
    if-nez v14, :cond_12

    .line 325
    .line 326
    and-int/lit8 v14, v12, 0x8

    .line 327
    .line 328
    if-nez v14, :cond_10

    .line 329
    .line 330
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    goto :goto_7

    .line 335
    :cond_10
    invoke-virtual {v11, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v14

    .line 339
    :goto_7
    if-eqz v14, :cond_11

    .line 340
    .line 341
    move v8, v9

    .line 342
    :cond_11
    or-int/2addr v12, v8

    .line 343
    :cond_12
    and-int/lit8 v8, v12, 0x13

    .line 344
    .line 345
    if-eq v8, v7, :cond_13

    .line 346
    .line 347
    move v1, v10

    .line 348
    :cond_13
    and-int/lit8 v7, v12, 0x1

    .line 349
    .line 350
    invoke-virtual {v11, v7, v1}, La/fet;->U(IZ)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_16

    .line 355
    .line 356
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    if-eqz v13, :cond_14

    .line 361
    .line 362
    sget-object v2, La/qmk;->i:La/zcl;

    .line 363
    .line 364
    sget-object v3, La/qmk;->a:La/zcl;

    .line 365
    .line 366
    new-instance v7, La/ugg0;

    .line 367
    .line 368
    invoke-direct {v7, v2, v2, v3, v3}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 369
    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_14
    sget-object v2, La/qmk;->i:La/zcl;

    .line 373
    .line 374
    sget-object v3, La/vgg0;->a:La/ugg0;

    .line 375
    .line 376
    new-instance v7, La/ugg0;

    .line 377
    .line 378
    invoke-direct {v7, v2, v2, v2, v2}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 379
    .line 380
    .line 381
    :goto_8
    invoke-static {v1, v7}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 386
    .line 387
    invoke-virtual {v11, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 392
    .line 393
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 394
    .line 395
    .line 396
    move-result-wide v2

    .line 397
    sget-object v7, La/jd8;->n:La/ljc;

    .line 398
    .line 399
    invoke-static {v1, v2, v3, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    if-eqz v13, :cond_15

    .line 404
    .line 405
    const/high16 v2, 0x40000000    # 2.0f

    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_15
    move v2, v4

    .line 409
    :goto_9
    new-instance v3, La/lh80;

    .line 410
    .line 411
    invoke-direct {v3, v4, v4, v4, v2}, La/lh80;-><init>(FFFF)V

    .line 412
    .line 413
    .line 414
    invoke-static {v1, v3}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    shl-int/lit8 v2, v12, 0x3

    .line 419
    .line 420
    and-int/lit8 v2, v2, 0x70

    .line 421
    .line 422
    or-int v7, v5, v2

    .line 423
    .line 424
    iget-object v3, v0, La/vz20;->b:La/xdr;

    .line 425
    .line 426
    iget-object v4, v0, La/vz20;->c:La/xdr;

    .line 427
    .line 428
    iget-object v5, v0, La/vz20;->d:Lkotlin/jvm/functions/Function1;

    .line 429
    .line 430
    move-object v2, v6

    .line 431
    move-object v6, v11

    .line 432
    invoke-static/range {v1 .. v7}, La/q0x;->k(La/mm40;La/uv20;La/xdr;La/xdr;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 433
    .line 434
    .line 435
    goto :goto_a

    .line 436
    :cond_16
    move-object v6, v11

    .line 437
    invoke-virtual {v6}, La/fet;->X()V

    .line 438
    .line 439
    .line 440
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 441
    .line 442
    return-object v0

    .line 443
    :pswitch_3
    move v1, v6

    .line 444
    move-object/from16 v2, p1

    .line 445
    .line 446
    check-cast v2, La/uv20;

    .line 447
    .line 448
    move-object/from16 v6, p2

    .line 449
    .line 450
    check-cast v6, La/fet;

    .line 451
    .line 452
    move-object/from16 v3, p3

    .line 453
    .line 454
    check-cast v3, Ljava/lang/Integer;

    .line 455
    .line 456
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    and-int/lit8 v4, v3, 0x6

    .line 464
    .line 465
    if-nez v4, :cond_19

    .line 466
    .line 467
    and-int/lit8 v4, v3, 0x8

    .line 468
    .line 469
    if-nez v4, :cond_17

    .line 470
    .line 471
    invoke-virtual {v6, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    goto :goto_b

    .line 476
    :cond_17
    invoke-virtual {v6, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    :goto_b
    if-eqz v4, :cond_18

    .line 481
    .line 482
    move v8, v9

    .line 483
    :cond_18
    or-int/2addr v3, v8

    .line 484
    :cond_19
    and-int/lit8 v4, v3, 0x13

    .line 485
    .line 486
    if-eq v4, v7, :cond_1a

    .line 487
    .line 488
    move v1, v10

    .line 489
    :cond_1a
    and-int/lit8 v4, v3, 0x1

    .line 490
    .line 491
    invoke-virtual {v6, v4, v1}, La/fet;->U(IZ)Z

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    if-eqz v1, :cond_1b

    .line 496
    .line 497
    shl-int/lit8 v1, v3, 0x3

    .line 498
    .line 499
    and-int/lit8 v1, v1, 0x70

    .line 500
    .line 501
    or-int v7, v5, v1

    .line 502
    .line 503
    const/4 v1, 0x0

    .line 504
    iget-object v3, v0, La/vz20;->b:La/xdr;

    .line 505
    .line 506
    iget-object v4, v0, La/vz20;->c:La/xdr;

    .line 507
    .line 508
    iget-object v5, v0, La/vz20;->d:Lkotlin/jvm/functions/Function1;

    .line 509
    .line 510
    invoke-static/range {v1 .. v7}, La/j0x;->f(La/mm40;La/uv20;La/xdr;La/xdr;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 511
    .line 512
    .line 513
    goto :goto_c

    .line 514
    :cond_1b
    invoke-virtual {v6}, La/fet;->X()V

    .line 515
    .line 516
    .line 517
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 518
    .line 519
    return-object v0

    .line 520
    nop

    .line 521
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
