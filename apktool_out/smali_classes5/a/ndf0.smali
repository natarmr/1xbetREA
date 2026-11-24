.class public final La/ndf0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a(La/mm40;La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/related/api/presentation/RelatedParams;La/fet;)V
    .locals 35

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const v2, 0x2fe8f29c

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const/4 v4, 0x0

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    sget-object v2, La/ukd;->a:La/cl5;

    .line 35
    .line 36
    if-ne v3, v2, :cond_4

    .line 37
    .line 38
    :cond_0
    invoke-static {v0}, La/vqd;->i(Landroidx/fragment/app/Fragment;)Landroid/app/Application;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    instance-of v3, v2, La/af3;

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    check-cast v2, La/af3;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v2, v4

    .line 50
    :goto_0
    const-class v3, La/mdf0;

    .line 51
    .line 52
    if-eqz v2, :cond_f

    .line 53
    .line 54
    invoke-interface {v2}, La/af3;->d()La/wcf0;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, La/o5d0;

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, La/ze3;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move-object v2, v4

    .line 74
    :goto_1
    instance-of v5, v2, La/mdf0;

    .line 75
    .line 76
    if-nez v5, :cond_3

    .line 77
    .line 78
    move-object v2, v4

    .line 79
    :cond_3
    check-cast v2, La/mdf0;

    .line 80
    .line 81
    if-eqz v2, :cond_f

    .line 82
    .line 83
    move-object v3, v0

    .line 84
    :goto_2
    if-eqz v3, :cond_e

    .line 85
    .line 86
    instance-of v5, v3, La/odf0;

    .line 87
    .line 88
    if-eqz v5, :cond_d

    .line 89
    .line 90
    check-cast v3, La/odf0;

    .line 91
    .line 92
    invoke-interface {v3}, La/odf0;->b()La/pdf0;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iget-object v5, v2, La/mdf0;->a:La/cad;

    .line 97
    .line 98
    iget-object v2, v2, La/mdf0;->b:La/ctf0;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v6, La/rri;

    .line 104
    .line 105
    invoke-direct {v6, v3, v5, v2}, La/rri;-><init>(La/pdf0;La/cad;La/ctf0;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object v3, v6

    .line 112
    :cond_4
    check-cast v3, La/rri;

    .line 113
    .line 114
    new-instance v2, La/q0h0;

    .line 115
    .line 116
    iget-object v3, v3, La/rri;->d:La/n5d0;

    .line 117
    .line 118
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, La/qri;

    .line 123
    .line 124
    invoke-direct {v2, v3}, La/q0h0;-><init>(La/p0h0;)V

    .line 125
    .line 126
    .line 127
    const-class v3, La/sef0;

    .line 128
    .line 129
    sget-object v5, La/sre0;->a:La/tre0;

    .line 130
    .line 131
    invoke-virtual {v5, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    sget v5, La/sef0;->o:I

    .line 136
    .line 137
    const/16 v5, 0xe

    .line 138
    .line 139
    invoke-static {v3, v4, v2, v1, v5}, La/n4c;->X(La/sgy;Ljava/lang/String;La/q0h0;La/fet;I)La/k3t0;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, La/i3t0;

    .line 144
    .line 145
    invoke-virtual {v2, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    new-instance v3, La/rwc0;

    .line 150
    .line 151
    move-object/from16 v5, p0

    .line 152
    .line 153
    move-object/from16 v6, p2

    .line 154
    .line 155
    move-object/from16 v7, p4

    .line 156
    .line 157
    invoke-direct {v3, v5, v6, v0, v7}, La/rwc0;-><init>(La/ndf0;La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/related/api/presentation/RelatedParams;)V

    .line 158
    .line 159
    .line 160
    const v0, -0x1ee3bb33

    .line 161
    .line 162
    .line 163
    invoke-static {v0, v3, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    sget-object v3, La/uc9;->c:La/mw3;

    .line 171
    .line 172
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 173
    .line 174
    const/4 v6, 0x0

    .line 175
    invoke-static {v3, v5, v1, v6}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    iget-wide v8, v1, La/fet;->T:J

    .line 180
    .line 181
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    move-object/from16 v10, p1

    .line 190
    .line 191
    invoke-static {v1, v10}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 196
    .line 197
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, La/fet;->i0()V

    .line 201
    .line 202
    .line 203
    iget-boolean v11, v1, La/fet;->S:Z

    .line 204
    .line 205
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 206
    .line 207
    if-eqz v11, :cond_5

    .line 208
    .line 209
    invoke-virtual {v1, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_5
    invoke-virtual {v1}, La/fet;->r0()V

    .line 214
    .line 215
    .line 216
    :goto_3
    sget-object v11, La/gqw0;->x:La/shd;

    .line 217
    .line 218
    invoke-static {v1, v7, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 219
    .line 220
    .line 221
    sget-object v7, La/gqw0;->w:La/shd;

    .line 222
    .line 223
    invoke-static {v1, v9, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    sget-object v9, La/gqw0;->y:La/shd;

    .line 231
    .line 232
    invoke-static {v1, v8, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 236
    .line 237
    .line 238
    sget-object v8, La/gqw0;->v:La/shd;

    .line 239
    .line 240
    invoke-static {v1, v10, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 241
    .line 242
    .line 243
    const/high16 v10, 0x3f800000    # 1.0f

    .line 244
    .line 245
    sget-object v13, La/jm40;->b:La/jm40;

    .line 246
    .line 247
    invoke-static {v13, v10}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    sget-object v14, La/gqw0;->e:La/zx7;

    .line 252
    .line 253
    invoke-static {v14, v6}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 254
    .line 255
    .line 256
    move-result-object v14

    .line 257
    move-object/from16 p0, v5

    .line 258
    .line 259
    iget-wide v4, v1, La/fet;->T:J

    .line 260
    .line 261
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-static {v1, v10}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    invoke-virtual {v1}, La/fet;->i0()V

    .line 274
    .line 275
    .line 276
    iget-boolean v15, v1, La/fet;->S:Z

    .line 277
    .line 278
    if-eqz v15, :cond_6

    .line 279
    .line 280
    invoke-virtual {v1, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 281
    .line 282
    .line 283
    goto :goto_4

    .line 284
    :cond_6
    invoke-virtual {v1}, La/fet;->r0()V

    .line 285
    .line 286
    .line 287
    :goto_4
    invoke-static {v1, v14, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 288
    .line 289
    .line 290
    invoke-static {v1, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 291
    .line 292
    .line 293
    invoke-static {v4, v1, v9, v1}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v1, v10, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    check-cast v2, La/ref0;

    .line 304
    .line 305
    if-eqz v2, :cond_c

    .line 306
    .line 307
    instance-of v4, v2, La/oef0;

    .line 308
    .line 309
    const/4 v5, 0x1

    .line 310
    if-eqz v4, :cond_7

    .line 311
    .line 312
    const v2, -0x1c0addba

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 319
    .line 320
    .line 321
    move-object/from16 v27, v0

    .line 322
    .line 323
    move v13, v5

    .line 324
    move v10, v6

    .line 325
    goto/16 :goto_8

    .line 326
    .line 327
    :cond_7
    instance-of v4, v2, La/pef0;

    .line 328
    .line 329
    const/high16 v10, 0x41400000    # 12.0f

    .line 330
    .line 331
    if-eqz v4, :cond_8

    .line 332
    .line 333
    const v3, -0x1c096dd8

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 337
    .line 338
    .line 339
    sget-object v3, La/qmk;->a:La/zcl;

    .line 340
    .line 341
    const/high16 v3, 0x41000000    # 8.0f

    .line 342
    .line 343
    invoke-static {v13, v3, v10}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    check-cast v2, La/pef0;

    .line 348
    .line 349
    iget-object v2, v2, La/pef0;->a:Ljava/lang/String;

    .line 350
    .line 351
    sget-object v13, La/j1t0;->c:La/qrq;

    .line 352
    .line 353
    sget-wide v10, La/qmk;->r:J

    .line 354
    .line 355
    sget-wide v19, La/qmk;->F:J

    .line 356
    .line 357
    new-instance v7, La/y9q0;

    .line 358
    .line 359
    const/16 v18, 0x0

    .line 360
    .line 361
    const v21, 0xfdffdd

    .line 362
    .line 363
    .line 364
    const-wide/16 v8, 0x0

    .line 365
    .line 366
    const/4 v12, 0x0

    .line 367
    const-wide/16 v14, 0x0

    .line 368
    .line 369
    const/16 v16, 0x0

    .line 370
    .line 371
    const/16 v17, 0x0

    .line 372
    .line 373
    invoke-direct/range {v7 .. v21}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 374
    .line 375
    .line 376
    move-object/from16 v20, v7

    .line 377
    .line 378
    sget-object v4, La/zaq0;->b:La/zfn;

    .line 379
    .line 380
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 385
    .line 386
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 387
    .line 388
    .line 389
    move-result-wide v7

    .line 390
    new-instance v12, La/f2q0;

    .line 391
    .line 392
    const/4 v4, 0x3

    .line 393
    invoke-direct {v12, v4}, La/f2q0;-><init>(I)V

    .line 394
    .line 395
    .line 396
    const/16 v23, 0x6180

    .line 397
    .line 398
    const v24, 0x1abf8

    .line 399
    .line 400
    .line 401
    const/4 v4, 0x0

    .line 402
    move v9, v5

    .line 403
    move v10, v6

    .line 404
    const-wide/16 v5, 0x0

    .line 405
    .line 406
    move-object v1, v3

    .line 407
    move-wide/from16 v33, v7

    .line 408
    .line 409
    move-object v8, v0

    .line 410
    move-object v0, v2

    .line 411
    move-wide/from16 v2, v33

    .line 412
    .line 413
    const/4 v7, 0x0

    .line 414
    move-object v11, v8

    .line 415
    const/4 v8, 0x0

    .line 416
    move v13, v9

    .line 417
    const/4 v9, 0x0

    .line 418
    move v15, v10

    .line 419
    move-object v14, v11

    .line 420
    const-wide/16 v10, 0x0

    .line 421
    .line 422
    move/from16 v17, v13

    .line 423
    .line 424
    move-object/from16 v16, v14

    .line 425
    .line 426
    const-wide/16 v13, 0x0

    .line 427
    .line 428
    move/from16 v18, v15

    .line 429
    .line 430
    const/4 v15, 0x2

    .line 431
    move-object/from16 v19, v16

    .line 432
    .line 433
    const/16 v16, 0x0

    .line 434
    .line 435
    move/from16 v21, v17

    .line 436
    .line 437
    const/16 v17, 0x2

    .line 438
    .line 439
    move/from16 v22, v18

    .line 440
    .line 441
    const/16 v18, 0x0

    .line 442
    .line 443
    move-object/from16 v25, v19

    .line 444
    .line 445
    const/16 v19, 0x0

    .line 446
    .line 447
    move/from16 v26, v22

    .line 448
    .line 449
    const/16 v22, 0x0

    .line 450
    .line 451
    move-object/from16 v21, p5

    .line 452
    .line 453
    move-object/from16 v27, v25

    .line 454
    .line 455
    invoke-static/range {v0 .. v24}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 456
    .line 457
    .line 458
    move-object/from16 v1, v21

    .line 459
    .line 460
    const/4 v0, 0x0

    .line 461
    invoke-virtual {v1, v0}, La/fet;->r(Z)V

    .line 462
    .line 463
    .line 464
    move v10, v0

    .line 465
    const/4 v13, 0x1

    .line 466
    goto/16 :goto_8

    .line 467
    .line 468
    :cond_8
    move-object/from16 v27, v0

    .line 469
    .line 470
    move v0, v6

    .line 471
    instance-of v4, v2, La/qef0;

    .line 472
    .line 473
    if-eqz v4, :cond_b

    .line 474
    .line 475
    const v4, -0x1c011145

    .line 476
    .line 477
    .line 478
    invoke-virtual {v1, v4}, La/fet;->e0(I)V

    .line 479
    .line 480
    .line 481
    sget-object v4, La/gqw0;->k:La/yx7;

    .line 482
    .line 483
    sget-object v5, La/uc9;->a:La/lw3;

    .line 484
    .line 485
    const/16 v6, 0x30

    .line 486
    .line 487
    invoke-static {v5, v4, v1, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    iget-wide v5, v1, La/fet;->T:J

    .line 492
    .line 493
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 494
    .line 495
    .line 496
    move-result v5

    .line 497
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 498
    .line 499
    .line 500
    move-result-object v6

    .line 501
    invoke-static {v1, v13}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 502
    .line 503
    .line 504
    move-result-object v14

    .line 505
    invoke-virtual {v1}, La/fet;->i0()V

    .line 506
    .line 507
    .line 508
    iget-boolean v15, v1, La/fet;->S:Z

    .line 509
    .line 510
    if-eqz v15, :cond_9

    .line 511
    .line 512
    invoke-virtual {v1, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 513
    .line 514
    .line 515
    goto :goto_5

    .line 516
    :cond_9
    invoke-virtual {v1}, La/fet;->r0()V

    .line 517
    .line 518
    .line 519
    :goto_5
    invoke-static {v1, v4, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 520
    .line 521
    .line 522
    invoke-static {v1, v6, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 523
    .line 524
    .line 525
    invoke-static {v5, v1, v9, v1}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 526
    .line 527
    .line 528
    invoke-static {v1, v14, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 529
    .line 530
    .line 531
    new-instance v4, La/dkm;

    .line 532
    .line 533
    sget-object v5, La/qmk;->a:La/zcl;

    .line 534
    .line 535
    new-instance v5, La/ycl;

    .line 536
    .line 537
    const/high16 v6, 0x41c00000    # 24.0f

    .line 538
    .line 539
    invoke-direct {v5, v6}, La/ycl;-><init>(F)V

    .line 540
    .line 541
    .line 542
    new-instance v6, La/ycl;

    .line 543
    .line 544
    const/high16 v14, 0x40000000    # 2.0f

    .line 545
    .line 546
    invoke-direct {v6, v14}, La/ycl;-><init>(F)V

    .line 547
    .line 548
    .line 549
    sget-object v14, La/zaq0;->b:La/zfn;

    .line 550
    .line 551
    invoke-virtual {v1, v14}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v15

    .line 555
    check-cast v15, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 556
    .line 557
    move-object/from16 p2, v11

    .line 558
    .line 559
    invoke-virtual {v15}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 560
    .line 561
    .line 562
    move-result-wide v10

    .line 563
    new-instance v15, La/y3d;

    .line 564
    .line 565
    invoke-direct {v15, v10, v11}, La/y3d;-><init>(J)V

    .line 566
    .line 567
    .line 568
    invoke-direct {v4, v5, v6, v15}, La/dkm;-><init>(La/ycl;La/ycl;La/y3d;)V

    .line 569
    .line 570
    .line 571
    const/4 v5, 0x1

    .line 572
    const/4 v15, 0x0

    .line 573
    invoke-static {v15, v4, v1, v0, v5}, La/kpb;->j(La/mm40;La/dkm;La/fet;II)V

    .line 574
    .line 575
    .line 576
    const/16 v17, 0x0

    .line 577
    .line 578
    const/16 v18, 0xe

    .line 579
    .line 580
    move-object v4, v14

    .line 581
    const/high16 v14, 0x41800000    # 16.0f

    .line 582
    .line 583
    const/4 v15, 0x0

    .line 584
    const/16 v16, 0x0

    .line 585
    .line 586
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 587
    .line 588
    .line 589
    move-result-object v6

    .line 590
    move-object/from16 v25, v13

    .line 591
    .line 592
    const/4 v10, 0x0

    .line 593
    const/high16 v11, 0x41400000    # 12.0f

    .line 594
    .line 595
    invoke-static {v6, v10, v11, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 596
    .line 597
    .line 598
    move-result-object v6

    .line 599
    move-object/from16 v10, p0

    .line 600
    .line 601
    invoke-static {v3, v10, v1, v0}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    iget-wide v10, v1, La/fet;->T:J

    .line 606
    .line 607
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 608
    .line 609
    .line 610
    move-result v10

    .line 611
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 612
    .line 613
    .line 614
    move-result-object v11

    .line 615
    invoke-static {v1, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 616
    .line 617
    .line 618
    move-result-object v6

    .line 619
    invoke-virtual {v1}, La/fet;->i0()V

    .line 620
    .line 621
    .line 622
    iget-boolean v13, v1, La/fet;->S:Z

    .line 623
    .line 624
    if-eqz v13, :cond_a

    .line 625
    .line 626
    invoke-virtual {v1, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 627
    .line 628
    .line 629
    :goto_6
    move-object/from16 v12, p2

    .line 630
    .line 631
    goto :goto_7

    .line 632
    :cond_a
    invoke-virtual {v1}, La/fet;->r0()V

    .line 633
    .line 634
    .line 635
    goto :goto_6

    .line 636
    :goto_7
    invoke-static {v1, v3, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 637
    .line 638
    .line 639
    invoke-static {v1, v11, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 640
    .line 641
    .line 642
    invoke-static {v10, v1, v9, v1}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 643
    .line 644
    .line 645
    invoke-static {v1, v6, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 646
    .line 647
    .line 648
    check-cast v2, La/qef0;

    .line 649
    .line 650
    move v10, v0

    .line 651
    iget-object v0, v2, La/qef0;->a:Ljava/lang/String;

    .line 652
    .line 653
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 654
    .line 655
    .line 656
    move-result-object v20

    .line 657
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 662
    .line 663
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 664
    .line 665
    .line 666
    move-result-wide v6

    .line 667
    new-instance v12, La/f2q0;

    .line 668
    .line 669
    const/4 v3, 0x5

    .line 670
    invoke-direct {v12, v3}, La/f2q0;-><init>(I)V

    .line 671
    .line 672
    .line 673
    const/16 v23, 0x0

    .line 674
    .line 675
    const v24, 0x1fbfa

    .line 676
    .line 677
    .line 678
    const/4 v1, 0x0

    .line 679
    move-object v8, v4

    .line 680
    const/4 v4, 0x0

    .line 681
    move v9, v3

    .line 682
    move/from16 v28, v5

    .line 683
    .line 684
    move-wide/from16 v33, v6

    .line 685
    .line 686
    move-object v7, v2

    .line 687
    move-wide/from16 v2, v33

    .line 688
    .line 689
    const-wide/16 v5, 0x0

    .line 690
    .line 691
    move-object v11, v7

    .line 692
    const/4 v7, 0x0

    .line 693
    move-object v13, v8

    .line 694
    const/4 v8, 0x0

    .line 695
    move v14, v9

    .line 696
    const/4 v9, 0x0

    .line 697
    move/from16 v26, v10

    .line 698
    .line 699
    move-object v15, v11

    .line 700
    const-wide/16 v10, 0x0

    .line 701
    .line 702
    move-object/from16 v16, v13

    .line 703
    .line 704
    move/from16 v17, v14

    .line 705
    .line 706
    const-wide/16 v13, 0x0

    .line 707
    .line 708
    move-object/from16 v18, v15

    .line 709
    .line 710
    const/4 v15, 0x0

    .line 711
    move-object/from16 v19, v16

    .line 712
    .line 713
    const/16 v16, 0x0

    .line 714
    .line 715
    move/from16 v21, v17

    .line 716
    .line 717
    const/16 v17, 0x0

    .line 718
    .line 719
    move-object/from16 v22, v18

    .line 720
    .line 721
    const/16 v18, 0x0

    .line 722
    .line 723
    move-object/from16 v29, v19

    .line 724
    .line 725
    const/16 v19, 0x0

    .line 726
    .line 727
    move-object/from16 v30, v22

    .line 728
    .line 729
    const/16 v22, 0x0

    .line 730
    .line 731
    move-object/from16 v21, p5

    .line 732
    .line 733
    move-object/from16 v31, v29

    .line 734
    .line 735
    move-object/from16 v32, v30

    .line 736
    .line 737
    invoke-static/range {v0 .. v24}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 738
    .line 739
    .line 740
    move-object/from16 v1, v21

    .line 741
    .line 742
    const/16 v17, 0x0

    .line 743
    .line 744
    const/16 v18, 0xd

    .line 745
    .line 746
    const/4 v14, 0x0

    .line 747
    const/high16 v15, 0x40800000    # 4.0f

    .line 748
    .line 749
    const/16 v16, 0x0

    .line 750
    .line 751
    move-object/from16 v13, v25

    .line 752
    .line 753
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    move-object/from16 v11, v32

    .line 758
    .line 759
    iget-object v2, v11, La/qef0;->b:Ljava/lang/String;

    .line 760
    .line 761
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 762
    .line 763
    .line 764
    move-result-object v20

    .line 765
    move-object/from16 v4, v31

    .line 766
    .line 767
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 772
    .line 773
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 774
    .line 775
    .line 776
    move-result-wide v3

    .line 777
    new-instance v12, La/f2q0;

    .line 778
    .line 779
    const/4 v14, 0x5

    .line 780
    invoke-direct {v12, v14}, La/f2q0;-><init>(I)V

    .line 781
    .line 782
    .line 783
    const v24, 0x1fbf8

    .line 784
    .line 785
    .line 786
    move-object v1, v0

    .line 787
    move-object v0, v2

    .line 788
    move-wide v2, v3

    .line 789
    const/4 v4, 0x0

    .line 790
    const-wide/16 v10, 0x0

    .line 791
    .line 792
    const-wide/16 v13, 0x0

    .line 793
    .line 794
    const/4 v15, 0x0

    .line 795
    const/16 v16, 0x0

    .line 796
    .line 797
    const/16 v17, 0x0

    .line 798
    .line 799
    const/16 v18, 0x0

    .line 800
    .line 801
    invoke-static/range {v0 .. v24}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 802
    .line 803
    .line 804
    move-object/from16 v1, v21

    .line 805
    .line 806
    const/4 v10, 0x0

    .line 807
    const/4 v13, 0x1

    .line 808
    invoke-static {v1, v13, v13, v10}, La/ohs0;->x(La/fet;ZZZ)V

    .line 809
    .line 810
    .line 811
    :goto_8
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 812
    .line 813
    .line 814
    const/4 v0, 0x6

    .line 815
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    move-object/from16 v11, v27

    .line 820
    .line 821
    invoke-virtual {v11, v1, v0}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 828
    .line 829
    .line 830
    return-void

    .line 831
    :cond_b
    move v10, v0

    .line 832
    goto :goto_9

    .line 833
    :cond_c
    move v10, v6

    .line 834
    :goto_9
    const v0, -0x74847cdd

    .line 835
    .line 836
    .line 837
    invoke-static {v0, v1, v10}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    throw v0

    .line 842
    :cond_d
    move-object/from16 v5, p0

    .line 843
    .line 844
    move-object/from16 v10, p1

    .line 845
    .line 846
    move-object/from16 v6, p2

    .line 847
    .line 848
    move-object/from16 v7, p4

    .line 849
    .line 850
    move-object v15, v4

    .line 851
    iget-object v3, v3, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 852
    .line 853
    goto/16 :goto_2

    .line 854
    .line 855
    :cond_e
    const-string v0, "Can\'t find feature provider!"

    .line 856
    .line 857
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    return-void

    .line 861
    :cond_f
    const-string v0, "Cannot create dependency "

    .line 862
    .line 863
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    return-void
.end method
