.class public abstract La/g2a0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/mm40;La/x2a0;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V
    .locals 26

    .line 1
    move-object/from16 v4, p1

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    move-object/from16 v11, p4

    .line 6
    .line 7
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const v0, 0x2ced3b5d

    .line 14
    .line 15
    .line 16
    invoke-virtual {v11, v0}, La/fet;->g0(I)La/fet;

    .line 17
    .line 18
    .line 19
    or-int/lit8 v0, p5, 0x6

    .line 20
    .line 21
    invoke-virtual {v11, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/16 v1, 0x20

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/16 v1, 0x10

    .line 31
    .line 32
    :goto_0
    or-int/2addr v0, v1

    .line 33
    invoke-virtual {v11, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/16 v2, 0x100

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    move v1, v2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/16 v1, 0x80

    .line 44
    .line 45
    :goto_1
    or-int/2addr v0, v1

    .line 46
    and-int/lit16 v1, v0, 0x493

    .line 47
    .line 48
    const/16 v3, 0x492

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x1

    .line 52
    if-eq v1, v3, :cond_2

    .line 53
    .line 54
    move v1, v7

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move v1, v6

    .line 57
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 58
    .line 59
    invoke-virtual {v11, v3, v1}, La/fet;->U(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_15

    .line 64
    .line 65
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 66
    .line 67
    sget-object v3, La/s6t0;->a:La/pz40;

    .line 68
    .line 69
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 74
    .line 75
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 76
    .line 77
    .line 78
    move-result-wide v8

    .line 79
    sget-object v3, La/jd8;->n:La/ljc;

    .line 80
    .line 81
    invoke-static {v1, v8, v9, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sget-object v8, La/uc9;->c:La/mw3;

    .line 86
    .line 87
    sget-object v9, La/gqw0;->m:La/xx7;

    .line 88
    .line 89
    invoke-static {v8, v9, v11, v6}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    iget-wide v9, v11, La/fet;->T:J

    .line 94
    .line 95
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-static {v11, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 108
    .line 109
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v11}, La/fet;->i0()V

    .line 113
    .line 114
    .line 115
    iget-boolean v12, v11, La/fet;->S:Z

    .line 116
    .line 117
    if-eqz v12, :cond_3

    .line 118
    .line 119
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 120
    .line 121
    invoke-virtual {v11, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_3
    invoke-virtual {v11}, La/fet;->r0()V

    .line 126
    .line 127
    .line 128
    :goto_3
    sget-object v12, La/gqw0;->x:La/shd;

    .line 129
    .line 130
    invoke-static {v11, v8, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    sget-object v8, La/gqw0;->w:La/shd;

    .line 134
    .line 135
    invoke-static {v11, v10, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    sget-object v9, La/gqw0;->y:La/shd;

    .line 143
    .line 144
    invoke-static {v11, v8, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v11}, La/jpm0;->n(La/fet;)V

    .line 148
    .line 149
    .line 150
    sget-object v8, La/gqw0;->v:La/shd;

    .line 151
    .line 152
    invoke-static {v11, v1, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 160
    .line 161
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 162
    .line 163
    .line 164
    move-result-wide v8

    .line 165
    sget-object v1, La/jm40;->b:La/jm40;

    .line 166
    .line 167
    invoke-static {v1, v8, v9, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    invoke-static {v8}, La/o050;->W(La/mm40;)La/mm40;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    const/high16 v9, 0x3f800000    # 1.0f

    .line 176
    .line 177
    invoke-static {v8, v9}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-interface {v4}, La/x2a0;->a()La/imm;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    and-int/lit16 v0, v0, 0x380

    .line 186
    .line 187
    if-ne v0, v2, :cond_4

    .line 188
    .line 189
    move v12, v7

    .line 190
    goto :goto_4

    .line 191
    :cond_4
    move v12, v6

    .line 192
    :goto_4
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    sget-object v14, La/ukd;->a:La/cl5;

    .line 197
    .line 198
    if-nez v12, :cond_5

    .line 199
    .line 200
    if-ne v13, v14, :cond_6

    .line 201
    .line 202
    :cond_5
    new-instance v13, La/i0a0;

    .line 203
    .line 204
    invoke-direct {v13, v5, v7}, La/i0a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v11, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    :cond_6
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 211
    .line 212
    if-ne v0, v2, :cond_7

    .line 213
    .line 214
    move v12, v7

    .line 215
    goto :goto_5

    .line 216
    :cond_7
    move v12, v6

    .line 217
    :goto_5
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v15

    .line 221
    if-nez v12, :cond_8

    .line 222
    .line 223
    if-ne v15, v14, :cond_9

    .line 224
    .line 225
    :cond_8
    new-instance v15, La/hs80;

    .line 226
    .line 227
    const/16 v12, 0xc

    .line 228
    .line 229
    invoke-direct {v15, v5, v12}, La/hs80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v11, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_9
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 236
    .line 237
    const/16 v20, 0x0

    .line 238
    .line 239
    const/16 v21, 0xfd4

    .line 240
    .line 241
    move v12, v6

    .line 242
    move-object v6, v8

    .line 243
    const/4 v8, 0x0

    .line 244
    move/from16 v16, v7

    .line 245
    .line 246
    move-object v7, v10

    .line 247
    const/4 v10, 0x0

    .line 248
    move/from16 v17, v12

    .line 249
    .line 250
    const/4 v12, 0x0

    .line 251
    move/from16 v18, v9

    .line 252
    .line 253
    move-object v9, v13

    .line 254
    const/4 v13, 0x0

    .line 255
    move-object/from16 v19, v14

    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    move-object v11, v15

    .line 259
    const/4 v15, 0x0

    .line 260
    move/from16 v22, v16

    .line 261
    .line 262
    const/16 v16, 0x0

    .line 263
    .line 264
    move/from16 v23, v17

    .line 265
    .line 266
    const/16 v17, 0x0

    .line 267
    .line 268
    move-object/from16 v24, v19

    .line 269
    .line 270
    const/16 v19, 0x0

    .line 271
    .line 272
    move/from16 v2, v18

    .line 273
    .line 274
    move-object/from16 v25, v24

    .line 275
    .line 276
    move-object/from16 v18, p4

    .line 277
    .line 278
    invoke-static/range {v6 .. v21}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 279
    .line 280
    .line 281
    move-object/from16 v11, v18

    .line 282
    .line 283
    instance-of v6, v4, La/v2a0;

    .line 284
    .line 285
    if-eqz v6, :cond_10

    .line 286
    .line 287
    const v6, 0xd63825a

    .line 288
    .line 289
    .line 290
    invoke-virtual {v11, v6}, La/fet;->e0(I)V

    .line 291
    .line 292
    .line 293
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    move-object v13, v4

    .line 298
    check-cast v13, La/v2a0;

    .line 299
    .line 300
    iget-object v7, v13, La/v2a0;->b:La/a4x;

    .line 301
    .line 302
    iget-object v8, v13, La/v2a0;->c:La/a4x;

    .line 303
    .line 304
    const/16 v9, 0x100

    .line 305
    .line 306
    if-ne v0, v9, :cond_a

    .line 307
    .line 308
    const/4 v9, 0x1

    .line 309
    goto :goto_6

    .line 310
    :cond_a
    const/4 v9, 0x0

    .line 311
    :goto_6
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v10

    .line 315
    if-nez v9, :cond_b

    .line 316
    .line 317
    move-object/from16 v9, v25

    .line 318
    .line 319
    if-ne v10, v9, :cond_c

    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_b
    move-object/from16 v9, v25

    .line 323
    .line 324
    :goto_7
    new-instance v10, La/hs80;

    .line 325
    .line 326
    const/16 v12, 0xd

    .line 327
    .line 328
    invoke-direct {v10, v5, v12}, La/hs80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v11, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_c
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 335
    .line 336
    const/16 v12, 0x100

    .line 337
    .line 338
    if-ne v0, v12, :cond_d

    .line 339
    .line 340
    const/4 v0, 0x1

    .line 341
    goto :goto_8

    .line 342
    :cond_d
    const/4 v0, 0x0

    .line 343
    :goto_8
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v12

    .line 347
    if-nez v0, :cond_e

    .line 348
    .line 349
    if-ne v12, v9, :cond_f

    .line 350
    .line 351
    :cond_e
    new-instance v12, La/hs80;

    .line 352
    .line 353
    const/16 v0, 0xe

    .line 354
    .line 355
    invoke-direct {v12, v5, v0}, La/hs80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v11, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    :cond_f
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 362
    .line 363
    move-object v9, v10

    .line 364
    move-object v10, v12

    .line 365
    const/4 v12, 0x6

    .line 366
    invoke-static/range {v6 .. v12}, La/azw;->n(La/mm40;La/a4x;La/a4x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 367
    .line 368
    .line 369
    new-instance v0, La/x7z;

    .line 370
    .line 371
    const/4 v6, 0x1

    .line 372
    invoke-direct {v0, v2, v6}, La/x7z;-><init>(FZ)V

    .line 373
    .line 374
    .line 375
    invoke-static {v0, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 380
    .line 381
    invoke-virtual {v11, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 386
    .line 387
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 388
    .line 389
    .line 390
    move-result-wide v7

    .line 391
    invoke-static {v0, v7, v8, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    iget-object v2, v13, La/v2a0;->d:Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;

    .line 396
    .line 397
    const/16 v3, 0x180

    .line 398
    .line 399
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    move-object/from16 v7, p3

    .line 404
    .line 405
    invoke-virtual {v7, v0, v2, v11, v3}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    const/4 v12, 0x0

    .line 409
    invoke-virtual {v11, v12}, La/fet;->r(Z)V

    .line 410
    .line 411
    .line 412
    goto :goto_a

    .line 413
    :cond_10
    move-object/from16 v7, p3

    .line 414
    .line 415
    move-object/from16 v9, v25

    .line 416
    .line 417
    const/4 v6, 0x1

    .line 418
    const/4 v12, 0x0

    .line 419
    instance-of v3, v4, La/w2a0;

    .line 420
    .line 421
    if-eqz v3, :cond_14

    .line 422
    .line 423
    const v3, 0x21773c83

    .line 424
    .line 425
    .line 426
    invoke-virtual {v11, v3}, La/fet;->e0(I)V

    .line 427
    .line 428
    .line 429
    new-instance v3, La/x7z;

    .line 430
    .line 431
    invoke-direct {v3, v2, v6}, La/x7z;-><init>(FZ)V

    .line 432
    .line 433
    .line 434
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    move-object v3, v4

    .line 439
    check-cast v3, La/w2a0;

    .line 440
    .line 441
    iget-object v3, v3, La/w2a0;->b:La/mdm;

    .line 442
    .line 443
    const/16 v8, 0x100

    .line 444
    .line 445
    if-ne v0, v8, :cond_11

    .line 446
    .line 447
    move v0, v6

    .line 448
    goto :goto_9

    .line 449
    :cond_11
    move v0, v12

    .line 450
    :goto_9
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v8

    .line 454
    if-nez v0, :cond_12

    .line 455
    .line 456
    if-ne v8, v9, :cond_13

    .line 457
    .line 458
    :cond_12
    new-instance v8, La/i0a0;

    .line 459
    .line 460
    const/4 v0, 0x2

    .line 461
    invoke-direct {v8, v5, v0}, La/i0a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v11, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    :cond_13
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 468
    .line 469
    invoke-static {v2, v3, v8, v11, v12}, La/tke;->F(La/mm40;La/mdm;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v11, v12}, La/fet;->r(Z)V

    .line 473
    .line 474
    .line 475
    :goto_a
    invoke-virtual {v11, v6}, La/fet;->r(Z)V

    .line 476
    .line 477
    .line 478
    move-object v3, v1

    .line 479
    goto :goto_b

    .line 480
    :cond_14
    const v0, 0x2176cc8a

    .line 481
    .line 482
    .line 483
    invoke-static {v0, v11, v12}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    throw v0

    .line 488
    :cond_15
    move-object/from16 v7, p3

    .line 489
    .line 490
    invoke-virtual {v11}, La/fet;->X()V

    .line 491
    .line 492
    .line 493
    move-object/from16 v3, p0

    .line 494
    .line 495
    :goto_b
    invoke-virtual {v11}, La/fet;->u()La/yfe0;

    .line 496
    .line 497
    .line 498
    move-result-object v8

    .line 499
    if-eqz v8, :cond_16

    .line 500
    .line 501
    new-instance v0, La/pd50;

    .line 502
    .line 503
    const/16 v1, 0x18

    .line 504
    .line 505
    move/from16 v2, p5

    .line 506
    .line 507
    move-object v6, v7

    .line 508
    invoke-direct/range {v0 .. v6}, La/pd50;-><init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 512
    .line 513
    :cond_16
    return-void
.end method
