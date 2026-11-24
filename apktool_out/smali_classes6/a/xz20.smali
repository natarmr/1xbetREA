.class public final synthetic La/xz20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xdr;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/xz20;->a:B

    iput-object p1, p0, La/xz20;->b:La/xdr;

    iput-object p2, p0, La/xz20;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/xz20;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xz20;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    sget-object v3, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/16 v5, 0x12

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x4

    .line 14
    const/4 v8, 0x1

    .line 15
    iget-object v9, v0, La/xz20;->c:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/or20;

    .line 23
    .line 24
    move-object/from16 v10, p2

    .line 25
    .line 26
    check-cast v10, La/fet;

    .line 27
    .line 28
    move-object/from16 v11, p3

    .line 29
    .line 30
    check-cast v11, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v11

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v12, v11, 0x6

    .line 40
    .line 41
    if-nez v12, :cond_1

    .line 42
    .line 43
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v12

    .line 47
    if-eqz v12, :cond_0

    .line 48
    .line 49
    move v6, v7

    .line 50
    :cond_0
    or-int/2addr v11, v6

    .line 51
    :cond_1
    and-int/lit8 v6, v11, 0x13

    .line 52
    .line 53
    if-eq v6, v5, :cond_2

    .line 54
    .line 55
    move v4, v8

    .line 56
    :cond_2
    and-int/lit8 v5, v11, 0x1

    .line 57
    .line 58
    invoke-virtual {v10, v5, v4}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_5

    .line 63
    .line 64
    sget-object v4, La/zaq0;->b:La/zfn;

    .line 65
    .line 66
    invoke-virtual {v10, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 71
    .line 72
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 73
    .line 74
    .line 75
    move-result-wide v4

    .line 76
    sget-object v6, La/jd8;->n:La/ljc;

    .line 77
    .line 78
    invoke-static {v2, v4, v5, v6}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iget-object v1, v1, La/or20;->b:La/bh;

    .line 83
    .line 84
    iget-object v11, v1, La/bh;->a:La/eao;

    .line 85
    .line 86
    iget-object v12, v1, La/bh;->b:La/a4x;

    .line 87
    .line 88
    invoke-virtual {v10, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    if-nez v1, :cond_3

    .line 97
    .line 98
    if-ne v4, v3, :cond_4

    .line 99
    .line 100
    :cond_3
    new-instance v4, La/lj00;

    .line 101
    .line 102
    const/16 v1, 0x1a

    .line 103
    .line 104
    invoke-direct {v4, v9, v1}, La/lj00;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v10, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    move-object v14, v4

    .line 111
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/16 v18, 0x0

    .line 116
    .line 117
    iget-object v13, v0, La/xz20;->b:La/xdr;

    .line 118
    .line 119
    iget-object v15, v0, La/xz20;->d:Lkotlin/jvm/functions/Function1;

    .line 120
    .line 121
    move-object/from16 v16, v10

    .line 122
    .line 123
    move-object v10, v2

    .line 124
    invoke-static/range {v10 .. v18}, La/qxw;->g(La/mm40;La/eao;La/a4x;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_5
    move-object/from16 v16, v10

    .line 129
    .line 130
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 131
    .line 132
    .line 133
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_0
    move-object/from16 v1, p1

    .line 137
    .line 138
    check-cast v1, La/or20;

    .line 139
    .line 140
    move-object/from16 v2, p2

    .line 141
    .line 142
    check-cast v2, La/fet;

    .line 143
    .line 144
    move-object/from16 v10, p3

    .line 145
    .line 146
    check-cast v10, Ljava/lang/Integer;

    .line 147
    .line 148
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    and-int/lit8 v11, v10, 0x6

    .line 156
    .line 157
    if-nez v11, :cond_7

    .line 158
    .line 159
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    if-eqz v11, :cond_6

    .line 164
    .line 165
    move v6, v7

    .line 166
    :cond_6
    or-int/2addr v10, v6

    .line 167
    :cond_7
    and-int/lit8 v6, v10, 0x13

    .line 168
    .line 169
    if-eq v6, v5, :cond_8

    .line 170
    .line 171
    move v4, v8

    .line 172
    :cond_8
    and-int/lit8 v5, v10, 0x1

    .line 173
    .line 174
    invoke-virtual {v2, v5, v4}, La/fet;->U(IZ)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eqz v4, :cond_b

    .line 179
    .line 180
    iget-object v1, v1, La/or20;->b:La/bh;

    .line 181
    .line 182
    iget-object v11, v1, La/bh;->a:La/eao;

    .line 183
    .line 184
    iget-object v12, v1, La/bh;->b:La/a4x;

    .line 185
    .line 186
    invoke-virtual {v2, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    if-nez v1, :cond_9

    .line 195
    .line 196
    if-ne v4, v3, :cond_a

    .line 197
    .line 198
    :cond_9
    new-instance v4, La/lj00;

    .line 199
    .line 200
    const/16 v1, 0x19

    .line 201
    .line 202
    invoke-direct {v4, v9, v1}, La/lj00;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_a
    move-object v14, v4

    .line 209
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const/4 v10, 0x0

    .line 214
    iget-object v13, v0, La/xz20;->b:La/xdr;

    .line 215
    .line 216
    iget-object v15, v0, La/xz20;->d:Lkotlin/jvm/functions/Function1;

    .line 217
    .line 218
    move-object/from16 v16, v2

    .line 219
    .line 220
    invoke-static/range {v10 .. v17}, La/xww;->h(La/mm40;La/eao;La/a4x;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_b
    move-object/from16 v16, v2

    .line 225
    .line 226
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 227
    .line 228
    .line 229
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object v0

    .line 232
    :pswitch_1
    move-object/from16 v1, p1

    .line 233
    .line 234
    check-cast v1, La/or20;

    .line 235
    .line 236
    move-object/from16 v10, p2

    .line 237
    .line 238
    check-cast v10, La/fet;

    .line 239
    .line 240
    move-object/from16 v11, p3

    .line 241
    .line 242
    check-cast v11, Ljava/lang/Integer;

    .line 243
    .line 244
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    and-int/lit8 v12, v11, 0x6

    .line 252
    .line 253
    if-nez v12, :cond_d

    .line 254
    .line 255
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v12

    .line 259
    if-eqz v12, :cond_c

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_c
    move v7, v6

    .line 263
    :goto_2
    or-int/2addr v11, v7

    .line 264
    :cond_d
    and-int/lit8 v7, v11, 0x13

    .line 265
    .line 266
    if-eq v7, v5, :cond_e

    .line 267
    .line 268
    move v4, v8

    .line 269
    :cond_e
    and-int/lit8 v5, v11, 0x1

    .line 270
    .line 271
    invoke-virtual {v10, v5, v4}, La/fet;->U(IZ)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_11

    .line 276
    .line 277
    sget-object v4, La/zaq0;->b:La/zfn;

    .line 278
    .line 279
    invoke-virtual {v10, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 284
    .line 285
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 286
    .line 287
    .line 288
    move-result-wide v4

    .line 289
    sget-object v7, La/jd8;->n:La/ljc;

    .line 290
    .line 291
    invoke-static {v2, v4, v5, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    sget-object v4, La/qmk;->a:La/zcl;

    .line 296
    .line 297
    const/high16 v4, 0x41000000    # 8.0f

    .line 298
    .line 299
    const/4 v5, 0x0

    .line 300
    invoke-static {v2, v4, v5, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    const/4 v15, 0x0

    .line 305
    const/16 v16, 0x5

    .line 306
    .line 307
    const/4 v12, 0x0

    .line 308
    const/high16 v13, 0x41400000    # 12.0f

    .line 309
    .line 310
    const/4 v14, 0x0

    .line 311
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    iget-object v1, v1, La/or20;->b:La/bh;

    .line 316
    .line 317
    iget-object v11, v1, La/bh;->a:La/eao;

    .line 318
    .line 319
    iget-object v12, v1, La/bh;->b:La/a4x;

    .line 320
    .line 321
    invoke-virtual {v10, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    if-nez v1, :cond_f

    .line 330
    .line 331
    if-ne v4, v3, :cond_10

    .line 332
    .line 333
    :cond_f
    new-instance v4, La/lj00;

    .line 334
    .line 335
    const/16 v1, 0x18

    .line 336
    .line 337
    invoke-direct {v4, v9, v1}, La/lj00;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v10, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    :cond_10
    move-object v14, v4

    .line 344
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 345
    .line 346
    const/16 v17, 0x0

    .line 347
    .line 348
    iget-object v13, v0, La/xz20;->b:La/xdr;

    .line 349
    .line 350
    iget-object v15, v0, La/xz20;->d:Lkotlin/jvm/functions/Function1;

    .line 351
    .line 352
    move-object/from16 v16, v10

    .line 353
    .line 354
    move-object v10, v2

    .line 355
    invoke-static/range {v10 .. v17}, La/cww;->d(La/mm40;La/eao;La/a4x;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 356
    .line 357
    .line 358
    goto :goto_3

    .line 359
    :cond_11
    move-object/from16 v16, v10

    .line 360
    .line 361
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 362
    .line 363
    .line 364
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 365
    .line 366
    return-object v0

    .line 367
    :pswitch_2
    move-object/from16 v1, p1

    .line 368
    .line 369
    check-cast v1, La/or20;

    .line 370
    .line 371
    move-object/from16 v10, p2

    .line 372
    .line 373
    check-cast v10, La/fet;

    .line 374
    .line 375
    move-object/from16 v11, p3

    .line 376
    .line 377
    check-cast v11, Ljava/lang/Integer;

    .line 378
    .line 379
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 380
    .line 381
    .line 382
    move-result v11

    .line 383
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    and-int/lit8 v12, v11, 0x6

    .line 387
    .line 388
    if-nez v12, :cond_13

    .line 389
    .line 390
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v12

    .line 394
    if-eqz v12, :cond_12

    .line 395
    .line 396
    move v6, v7

    .line 397
    :cond_12
    or-int/2addr v11, v6

    .line 398
    :cond_13
    and-int/lit8 v6, v11, 0x13

    .line 399
    .line 400
    if-eq v6, v5, :cond_14

    .line 401
    .line 402
    move v4, v8

    .line 403
    :cond_14
    and-int/lit8 v5, v11, 0x1

    .line 404
    .line 405
    invoke-virtual {v10, v5, v4}, La/fet;->U(IZ)Z

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    if-eqz v4, :cond_17

    .line 410
    .line 411
    sget-object v4, La/qmk;->a:La/zcl;

    .line 412
    .line 413
    sget-object v5, La/qmk;->i:La/zcl;

    .line 414
    .line 415
    invoke-static {v4, v4, v5, v5, v2}, La/dw9;->i(La/zcl;La/zcl;La/zcl;La/zcl;La/jm40;)La/mm40;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    sget-object v4, La/zaq0;->b:La/zfn;

    .line 420
    .line 421
    invoke-virtual {v10, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 426
    .line 427
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 428
    .line 429
    .line 430
    move-result-wide v4

    .line 431
    sget-object v6, La/jd8;->n:La/ljc;

    .line 432
    .line 433
    invoke-static {v2, v4, v5, v6}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 434
    .line 435
    .line 436
    move-result-object v11

    .line 437
    const/4 v14, 0x0

    .line 438
    const/16 v16, 0x5

    .line 439
    .line 440
    const/4 v12, 0x0

    .line 441
    const/high16 v13, 0x40800000    # 4.0f

    .line 442
    .line 443
    const/high16 v15, 0x40000000    # 2.0f

    .line 444
    .line 445
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    iget-object v1, v1, La/or20;->b:La/bh;

    .line 450
    .line 451
    iget-object v11, v1, La/bh;->a:La/eao;

    .line 452
    .line 453
    iget-object v12, v1, La/bh;->b:La/a4x;

    .line 454
    .line 455
    invoke-virtual {v10, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v4

    .line 463
    if-nez v1, :cond_15

    .line 464
    .line 465
    if-ne v4, v3, :cond_16

    .line 466
    .line 467
    :cond_15
    new-instance v4, La/lj00;

    .line 468
    .line 469
    const/16 v1, 0x17

    .line 470
    .line 471
    invoke-direct {v4, v9, v1}, La/lj00;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v10, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    :cond_16
    move-object v14, v4

    .line 478
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 479
    .line 480
    const/16 v17, 0x0

    .line 481
    .line 482
    iget-object v13, v0, La/xz20;->b:La/xdr;

    .line 483
    .line 484
    iget-object v15, v0, La/xz20;->d:Lkotlin/jvm/functions/Function1;

    .line 485
    .line 486
    move-object/from16 v16, v10

    .line 487
    .line 488
    move-object v10, v2

    .line 489
    invoke-static/range {v10 .. v17}, La/cww;->d(La/mm40;La/eao;La/a4x;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 490
    .line 491
    .line 492
    goto :goto_4

    .line 493
    :cond_17
    move-object/from16 v16, v10

    .line 494
    .line 495
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 496
    .line 497
    .line 498
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_3
    move-object/from16 v1, p1

    .line 502
    .line 503
    check-cast v1, La/or20;

    .line 504
    .line 505
    move-object/from16 v2, p2

    .line 506
    .line 507
    check-cast v2, La/fet;

    .line 508
    .line 509
    move-object/from16 v10, p3

    .line 510
    .line 511
    check-cast v10, Ljava/lang/Integer;

    .line 512
    .line 513
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 514
    .line 515
    .line 516
    move-result v10

    .line 517
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    and-int/lit8 v11, v10, 0x6

    .line 521
    .line 522
    if-nez v11, :cond_19

    .line 523
    .line 524
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v11

    .line 528
    if-eqz v11, :cond_18

    .line 529
    .line 530
    move v6, v7

    .line 531
    :cond_18
    or-int/2addr v10, v6

    .line 532
    :cond_19
    and-int/lit8 v6, v10, 0x13

    .line 533
    .line 534
    if-eq v6, v5, :cond_1a

    .line 535
    .line 536
    move v4, v8

    .line 537
    :cond_1a
    and-int/lit8 v5, v10, 0x1

    .line 538
    .line 539
    invoke-virtual {v2, v5, v4}, La/fet;->U(IZ)Z

    .line 540
    .line 541
    .line 542
    move-result v4

    .line 543
    if-eqz v4, :cond_1d

    .line 544
    .line 545
    iget-object v1, v1, La/or20;->b:La/bh;

    .line 546
    .line 547
    iget-object v11, v1, La/bh;->a:La/eao;

    .line 548
    .line 549
    iget-object v12, v1, La/bh;->b:La/a4x;

    .line 550
    .line 551
    invoke-virtual {v2, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v1

    .line 555
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    if-nez v1, :cond_1b

    .line 560
    .line 561
    if-ne v4, v3, :cond_1c

    .line 562
    .line 563
    :cond_1b
    new-instance v4, La/lj00;

    .line 564
    .line 565
    const/16 v1, 0x16

    .line 566
    .line 567
    invoke-direct {v4, v9, v1}, La/lj00;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    :cond_1c
    move-object v14, v4

    .line 574
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 575
    .line 576
    const/16 v17, 0x0

    .line 577
    .line 578
    const/4 v10, 0x0

    .line 579
    iget-object v13, v0, La/xz20;->b:La/xdr;

    .line 580
    .line 581
    iget-object v15, v0, La/xz20;->d:Lkotlin/jvm/functions/Function1;

    .line 582
    .line 583
    move-object/from16 v16, v2

    .line 584
    .line 585
    invoke-static/range {v10 .. v17}, La/bww;->f(La/mm40;La/eao;La/a4x;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 586
    .line 587
    .line 588
    goto :goto_5

    .line 589
    :cond_1d
    move-object/from16 v16, v2

    .line 590
    .line 591
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 592
    .line 593
    .line 594
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 595
    .line 596
    return-object v0

    .line 597
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
