.class public final La/hgl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:La/kfl0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;La/kfl0;Lkotlin/jvm/functions/Function1;ZB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/hgl0;->a:B

    iput-object p1, p0, La/hgl0;->b:Ljava/util/List;

    iput-object p2, p0, La/hgl0;->c:La/kfl0;

    iput-object p3, p0, La/hgl0;->d:Lkotlin/jvm/functions/Function1;

    iput-boolean p4, p0, La/hgl0;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hgl0;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41800000    # 16.0f

    .line 6
    .line 7
    const/16 v3, 0x1a

    .line 8
    .line 9
    iget-boolean v5, v0, La/hgl0;->e:Z

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v7, v0, La/hgl0;->c:La/kfl0;

    .line 13
    .line 14
    iget-object v8, v0, La/hgl0;->b:Ljava/util/List;

    .line 15
    .line 16
    const/16 v9, 0x92

    .line 17
    .line 18
    const/4 v12, 0x0

    .line 19
    iget-object v0, v0, La/hgl0;->d:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    const/4 v13, 0x1

    .line 22
    sget-object v14, La/ukd;->a:La/cl5;

    .line 23
    .line 24
    const/4 v15, 0x2

    .line 25
    const/4 v10, 0x4

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, La/g9z;

    .line 32
    .line 33
    move-object/from16 v2, p2

    .line 34
    .line 35
    check-cast v2, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    move-object/from16 v11, p3

    .line 42
    .line 43
    check-cast v11, La/fet;

    .line 44
    .line 45
    move-object/from16 v18, p4

    .line 46
    .line 47
    check-cast v18, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v18

    .line 53
    and-int/lit8 v19, v18, 0x6

    .line 54
    .line 55
    if-nez v19, :cond_1

    .line 56
    .line 57
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    move v1, v10

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move v1, v15

    .line 66
    :goto_0
    or-int v1, v18, v1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move/from16 v1, v18

    .line 70
    .line 71
    :goto_1
    and-int/lit8 v18, v18, 0x30

    .line 72
    .line 73
    if-nez v18, :cond_3

    .line 74
    .line 75
    invoke-virtual {v11, v2}, La/fet;->e(I)Z

    .line 76
    .line 77
    .line 78
    move-result v18

    .line 79
    if-eqz v18, :cond_2

    .line 80
    .line 81
    const/16 v16, 0x20

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    const/16 v16, 0x10

    .line 85
    .line 86
    :goto_2
    or-int v1, v1, v16

    .line 87
    .line 88
    :cond_3
    and-int/lit16 v4, v1, 0x93

    .line 89
    .line 90
    if-eq v4, v9, :cond_4

    .line 91
    .line 92
    move v4, v13

    .line 93
    goto :goto_3

    .line 94
    :cond_4
    move v4, v12

    .line 95
    :goto_3
    and-int/2addr v1, v13

    .line 96
    invoke-virtual {v11, v1, v4}, La/fet;->U(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_14

    .line 101
    .line 102
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, La/p6t0;

    .line 107
    .line 108
    const v4, 0x3b74a96e

    .line 109
    .line 110
    .line 111
    invoke-virtual {v11, v4}, La/fet;->e0(I)V

    .line 112
    .line 113
    .line 114
    iget-object v4, v7, La/kfl0;->b:La/a4x;

    .line 115
    .line 116
    invoke-static {v4}, La/q3d;->i(Ljava/util/List;)I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-ne v2, v4, :cond_5

    .line 121
    .line 122
    move v2, v13

    .line 123
    goto :goto_4

    .line 124
    :cond_5
    move v2, v12

    .line 125
    :goto_4
    sget-object v16, La/jm40;->b:La/jm40;

    .line 126
    .line 127
    if-nez v1, :cond_7

    .line 128
    .line 129
    move-object v4, v11

    .line 130
    move-object/from16 v7, v16

    .line 131
    .line 132
    :cond_6
    move v0, v12

    .line 133
    goto/16 :goto_6

    .line 134
    .line 135
    :cond_7
    instance-of v4, v1, La/rfl0;

    .line 136
    .line 137
    if-eqz v4, :cond_8

    .line 138
    .line 139
    const v0, 0x3b7577a6

    .line 140
    .line 141
    .line 142
    invoke-virtual {v11, v0}, La/fet;->e0(I)V

    .line 143
    .line 144
    .line 145
    check-cast v1, La/rfl0;

    .line 146
    .line 147
    iget-object v0, v1, La/rfl0;->a:La/jjm;

    .line 148
    .line 149
    sget-object v19, La/kjm;->b:La/kjm;

    .line 150
    .line 151
    const/16 v24, 0x180

    .line 152
    .line 153
    const/16 v25, 0x39

    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    const/16 v20, 0x0

    .line 158
    .line 159
    const/16 v21, 0x0

    .line 160
    .line 161
    const/16 v22, 0x0

    .line 162
    .line 163
    move-object/from16 v18, v0

    .line 164
    .line 165
    move-object/from16 v23, v11

    .line 166
    .line 167
    invoke-static/range {v17 .. v25}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 168
    .line 169
    .line 170
    move-object/from16 v4, v23

    .line 171
    .line 172
    invoke-virtual {v4, v12}, La/fet;->r(Z)V

    .line 173
    .line 174
    .line 175
    move-object/from16 v7, v16

    .line 176
    .line 177
    goto/16 :goto_7

    .line 178
    .line 179
    :cond_8
    move-object v4, v11

    .line 180
    instance-of v7, v1, La/rer0;

    .line 181
    .line 182
    if-eqz v7, :cond_b

    .line 183
    .line 184
    const v3, 0x3b78c38d

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 188
    .line 189
    .line 190
    sget-object v3, La/qmk;->a:La/zcl;

    .line 191
    .line 192
    const/high16 v20, 0x41400000    # 12.0f

    .line 193
    .line 194
    const/16 v21, 0x7

    .line 195
    .line 196
    const/16 v17, 0x0

    .line 197
    .line 198
    const/16 v18, 0x0

    .line 199
    .line 200
    const/16 v19, 0x0

    .line 201
    .line 202
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    move-object/from16 v7, v16

    .line 207
    .line 208
    check-cast v1, La/rer0;

    .line 209
    .line 210
    iget-object v1, v1, La/rer0;->a:La/f3n;

    .line 211
    .line 212
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    if-nez v6, :cond_9

    .line 221
    .line 222
    if-ne v8, v14, :cond_a

    .line 223
    .line 224
    :cond_9
    new-instance v8, La/v6a0;

    .line 225
    .line 226
    const/16 v6, 0x1d

    .line 227
    .line 228
    invoke-direct {v8, v0, v6}, La/v6a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v4, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_a
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 235
    .line 236
    invoke-static {v3, v1, v8, v4, v10}, La/qcc;->m(La/mm40;La/f3n;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4, v12}, La/fet;->r(Z)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_7

    .line 243
    .line 244
    :cond_b
    move-object/from16 v7, v16

    .line 245
    .line 246
    instance-of v8, v1, La/gpp;

    .line 247
    .line 248
    if-eqz v8, :cond_6

    .line 249
    .line 250
    const v8, 0x3b80930d

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4, v8}, La/fet;->e0(I)V

    .line 254
    .line 255
    .line 256
    sget-object v8, La/uc9;->c:La/mw3;

    .line 257
    .line 258
    sget-object v9, La/gqw0;->m:La/xx7;

    .line 259
    .line 260
    invoke-static {v8, v9, v4, v12}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 261
    .line 262
    .line 263
    move-result-object v8

    .line 264
    iget-wide v9, v4, La/fet;->T:J

    .line 265
    .line 266
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 267
    .line 268
    .line 269
    move-result v9

    .line 270
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    invoke-static {v4, v7}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 279
    .line 280
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v4}, La/fet;->i0()V

    .line 284
    .line 285
    .line 286
    iget-boolean v12, v4, La/fet;->S:Z

    .line 287
    .line 288
    if-eqz v12, :cond_c

    .line 289
    .line 290
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 291
    .line 292
    invoke-virtual {v4, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 293
    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_c
    invoke-virtual {v4}, La/fet;->r0()V

    .line 297
    .line 298
    .line 299
    :goto_5
    sget-object v12, La/gqw0;->x:La/shd;

    .line 300
    .line 301
    invoke-static {v4, v8, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 302
    .line 303
    .line 304
    sget-object v8, La/gqw0;->w:La/shd;

    .line 305
    .line 306
    invoke-static {v4, v10, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    sget-object v9, La/gqw0;->y:La/shd;

    .line 314
    .line 315
    invoke-static {v4, v8, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v4}, La/jpm0;->n(La/fet;)V

    .line 319
    .line 320
    .line 321
    sget-object v8, La/gqw0;->v:La/shd;

    .line 322
    .line 323
    invoke-static {v4, v11, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v4}, La/xfn;->a(La/fet;)La/wfn;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    iget v8, v8, La/wfn;->b:F

    .line 331
    .line 332
    invoke-static {v7, v8, v6, v15}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 333
    .line 334
    .line 335
    move-result-object v17

    .line 336
    move-object v6, v1

    .line 337
    check-cast v6, La/gpp;

    .line 338
    .line 339
    iget-object v6, v6, La/gpp;->d:La/b8l0;

    .line 340
    .line 341
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v9

    .line 349
    or-int/2addr v8, v9

    .line 350
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v9

    .line 354
    if-nez v8, :cond_d

    .line 355
    .line 356
    if-ne v9, v14, :cond_e

    .line 357
    .line 358
    :cond_d
    new-instance v9, La/z7;

    .line 359
    .line 360
    invoke-direct {v9, v0, v1, v3}, La/z7;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :cond_e
    move-object/from16 v22, v9

    .line 367
    .line 368
    check-cast v22, Lkotlin/jvm/functions/Function0;

    .line 369
    .line 370
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v8

    .line 378
    or-int/2addr v3, v8

    .line 379
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v8

    .line 383
    if-nez v3, :cond_f

    .line 384
    .line 385
    if-ne v8, v14, :cond_10

    .line 386
    .line 387
    :cond_f
    new-instance v8, La/z7;

    .line 388
    .line 389
    const/16 v3, 0x1b

    .line 390
    .line 391
    invoke-direct {v8, v0, v1, v3}, La/z7;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v4, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    :cond_10
    move-object/from16 v23, v8

    .line 398
    .line 399
    check-cast v23, Lkotlin/jvm/functions/Function0;

    .line 400
    .line 401
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v8

    .line 409
    or-int/2addr v3, v8

    .line 410
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v8

    .line 414
    if-nez v3, :cond_11

    .line 415
    .line 416
    if-ne v8, v14, :cond_12

    .line 417
    .line 418
    :cond_11
    new-instance v8, La/bi2;

    .line 419
    .line 420
    const/16 v3, 0x9

    .line 421
    .line 422
    invoke-direct {v8, v0, v1, v3}, La/bi2;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v4, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :cond_12
    move-object/from16 v25, v8

    .line 429
    .line 430
    check-cast v25, Lkotlin/jvm/functions/Function1;

    .line 431
    .line 432
    const/16 v27, 0x0

    .line 433
    .line 434
    const/16 v28, 0x9c

    .line 435
    .line 436
    const/16 v19, 0x0

    .line 437
    .line 438
    const/16 v20, 0x0

    .line 439
    .line 440
    const/16 v21, 0x0

    .line 441
    .line 442
    const/16 v24, 0x0

    .line 443
    .line 444
    move-object/from16 v26, v4

    .line 445
    .line 446
    move-object/from16 v18, v6

    .line 447
    .line 448
    invoke-static/range {v17 .. v28}, La/xbc;->o(La/mm40;La/b8l0;La/n3l0;La/d4d;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 452
    .line 453
    .line 454
    const/16 v21, 0x6

    .line 455
    .line 456
    const/16 v22, 0x6

    .line 457
    .line 458
    sget-object v17, La/zfi0;->a:La/zfi0;

    .line 459
    .line 460
    const/16 v18, 0x0

    .line 461
    .line 462
    const/16 v19, 0x0

    .line 463
    .line 464
    move-object/from16 v20, v4

    .line 465
    .line 466
    invoke-static/range {v17 .. v22}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 467
    .line 468
    .line 469
    const/4 v0, 0x0

    .line 470
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 471
    .line 472
    .line 473
    goto :goto_7

    .line 474
    :goto_6
    const v1, 0x3b931daf

    .line 475
    .line 476
    .line 477
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 481
    .line 482
    .line 483
    :goto_7
    if-nez v5, :cond_13

    .line 484
    .line 485
    if-eqz v2, :cond_13

    .line 486
    .line 487
    const v0, 0x3b940347

    .line 488
    .line 489
    .line 490
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 491
    .line 492
    .line 493
    sget-object v0, La/qmk;->a:La/zcl;

    .line 494
    .line 495
    const/high16 v0, 0x41a00000    # 20.0f

    .line 496
    .line 497
    invoke-static {v7, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 502
    .line 503
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 508
    .line 509
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 510
    .line 511
    .line 512
    move-result-wide v1

    .line 513
    sget-object v3, La/jd8;->n:La/ljc;

    .line 514
    .line 515
    invoke-static {v0, v1, v2, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-static {v4, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 520
    .line 521
    .line 522
    const/4 v0, 0x0

    .line 523
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 524
    .line 525
    .line 526
    goto :goto_8

    .line 527
    :cond_13
    const/4 v0, 0x0

    .line 528
    const v1, 0x3b96f20f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 535
    .line 536
    .line 537
    :goto_8
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 538
    .line 539
    .line 540
    goto :goto_9

    .line 541
    :cond_14
    move-object v4, v11

    .line 542
    invoke-virtual {v4}, La/fet;->X()V

    .line 543
    .line 544
    .line 545
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 546
    .line 547
    return-object v0

    .line 548
    :pswitch_0
    move-object/from16 v1, p1

    .line 549
    .line 550
    check-cast v1, La/g9z;

    .line 551
    .line 552
    move-object/from16 v3, p2

    .line 553
    .line 554
    check-cast v3, Ljava/lang/Number;

    .line 555
    .line 556
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    move-object/from16 v4, p3

    .line 561
    .line 562
    check-cast v4, La/fet;

    .line 563
    .line 564
    move-object/from16 v11, p4

    .line 565
    .line 566
    check-cast v11, Ljava/lang/Number;

    .line 567
    .line 568
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 569
    .line 570
    .line 571
    move-result v11

    .line 572
    and-int/lit8 v12, v11, 0x6

    .line 573
    .line 574
    if-nez v12, :cond_16

    .line 575
    .line 576
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    if-eqz v1, :cond_15

    .line 581
    .line 582
    move v1, v10

    .line 583
    goto :goto_a

    .line 584
    :cond_15
    move v1, v15

    .line 585
    :goto_a
    or-int/2addr v1, v11

    .line 586
    goto :goto_b

    .line 587
    :cond_16
    move v1, v11

    .line 588
    :goto_b
    and-int/lit8 v11, v11, 0x30

    .line 589
    .line 590
    if-nez v11, :cond_18

    .line 591
    .line 592
    invoke-virtual {v4, v3}, La/fet;->e(I)Z

    .line 593
    .line 594
    .line 595
    move-result v11

    .line 596
    if-eqz v11, :cond_17

    .line 597
    .line 598
    const/16 v16, 0x20

    .line 599
    .line 600
    goto :goto_c

    .line 601
    :cond_17
    const/16 v16, 0x10

    .line 602
    .line 603
    :goto_c
    or-int v1, v1, v16

    .line 604
    .line 605
    :cond_18
    and-int/lit16 v11, v1, 0x93

    .line 606
    .line 607
    if-eq v11, v9, :cond_19

    .line 608
    .line 609
    move v9, v13

    .line 610
    goto :goto_d

    .line 611
    :cond_19
    const/4 v9, 0x0

    .line 612
    :goto_d
    and-int/2addr v1, v13

    .line 613
    invoke-virtual {v4, v1, v9}, La/fet;->U(IZ)Z

    .line 614
    .line 615
    .line 616
    move-result v1

    .line 617
    if-eqz v1, :cond_28

    .line 618
    .line 619
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    check-cast v1, La/p6t0;

    .line 624
    .line 625
    const v8, 0x48974063

    .line 626
    .line 627
    .line 628
    invoke-virtual {v4, v8}, La/fet;->e0(I)V

    .line 629
    .line 630
    .line 631
    iget-object v7, v7, La/kfl0;->b:La/a4x;

    .line 632
    .line 633
    invoke-static {v7}, La/q3d;->i(Ljava/util/List;)I

    .line 634
    .line 635
    .line 636
    move-result v7

    .line 637
    if-ne v3, v7, :cond_1a

    .line 638
    .line 639
    goto :goto_e

    .line 640
    :cond_1a
    const/4 v13, 0x0

    .line 641
    :goto_e
    sget-object v3, La/jm40;->b:La/jm40;

    .line 642
    .line 643
    if-nez v1, :cond_1b

    .line 644
    .line 645
    :goto_f
    const/4 v0, 0x0

    .line 646
    goto/16 :goto_10

    .line 647
    .line 648
    :cond_1b
    instance-of v7, v1, La/rfl0;

    .line 649
    .line 650
    if-eqz v7, :cond_1c

    .line 651
    .line 652
    const v0, 0x48980b94    # 311388.62f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 656
    .line 657
    .line 658
    invoke-static {v4}, La/xfn;->a(La/fet;)La/wfn;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    iget v0, v0, La/wfn;->d:F

    .line 663
    .line 664
    invoke-static {v3, v0, v6, v15}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 665
    .line 666
    .line 667
    move-result-object v18

    .line 668
    check-cast v1, La/rfl0;

    .line 669
    .line 670
    iget-object v0, v1, La/rfl0;->a:La/jjm;

    .line 671
    .line 672
    sget-object v20, La/kjm;->b:La/kjm;

    .line 673
    .line 674
    const/16 v25, 0x180

    .line 675
    .line 676
    const/16 v26, 0x38

    .line 677
    .line 678
    const/16 v21, 0x0

    .line 679
    .line 680
    const/16 v22, 0x0

    .line 681
    .line 682
    const/16 v23, 0x0

    .line 683
    .line 684
    move-object/from16 v19, v0

    .line 685
    .line 686
    move-object/from16 v24, v4

    .line 687
    .line 688
    invoke-static/range {v18 .. v26}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 689
    .line 690
    .line 691
    const/4 v0, 0x0

    .line 692
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 693
    .line 694
    .line 695
    goto/16 :goto_11

    .line 696
    .line 697
    :cond_1c
    instance-of v6, v1, La/rer0;

    .line 698
    .line 699
    if-eqz v6, :cond_1f

    .line 700
    .line 701
    const v2, 0x489ce565

    .line 702
    .line 703
    .line 704
    invoke-virtual {v4, v2}, La/fet;->e0(I)V

    .line 705
    .line 706
    .line 707
    sget-object v2, La/qmk;->a:La/zcl;

    .line 708
    .line 709
    const/high16 v20, 0x41400000    # 12.0f

    .line 710
    .line 711
    const/16 v21, 0x7

    .line 712
    .line 713
    const/16 v17, 0x0

    .line 714
    .line 715
    const/16 v18, 0x0

    .line 716
    .line 717
    const/16 v19, 0x0

    .line 718
    .line 719
    move-object/from16 v16, v3

    .line 720
    .line 721
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    check-cast v1, La/rer0;

    .line 726
    .line 727
    iget-object v1, v1, La/rer0;->a:La/f3n;

    .line 728
    .line 729
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    move-result v3

    .line 733
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v6

    .line 737
    if-nez v3, :cond_1d

    .line 738
    .line 739
    if-ne v6, v14, :cond_1e

    .line 740
    .line 741
    :cond_1d
    new-instance v6, La/v6a0;

    .line 742
    .line 743
    const/16 v3, 0x1c

    .line 744
    .line 745
    invoke-direct {v6, v0, v3}, La/v6a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v4, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 749
    .line 750
    .line 751
    :cond_1e
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 752
    .line 753
    invoke-static {v2, v1, v6, v4, v10}, La/qcc;->m(La/mm40;La/f3n;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 754
    .line 755
    .line 756
    const/4 v0, 0x0

    .line 757
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 758
    .line 759
    .line 760
    move-object/from16 v3, v16

    .line 761
    .line 762
    goto/16 :goto_11

    .line 763
    .line 764
    :cond_1f
    move-object/from16 v16, v3

    .line 765
    .line 766
    instance-of v3, v1, La/gpp;

    .line 767
    .line 768
    if-eqz v3, :cond_26

    .line 769
    .line 770
    const v3, 0x48a50854    # 337986.62f

    .line 771
    .line 772
    .line 773
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 774
    .line 775
    .line 776
    sget-object v3, La/qmk;->a:La/zcl;

    .line 777
    .line 778
    invoke-static {v4}, La/xfn;->a(La/fet;)La/wfn;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    iget v3, v3, La/wfn;->d:F

    .line 783
    .line 784
    invoke-static {v4}, La/xfn;->a(La/fet;)La/wfn;

    .line 785
    .line 786
    .line 787
    move-result-object v6

    .line 788
    iget v6, v6, La/wfn;->d:F

    .line 789
    .line 790
    const/16 v18, 0x0

    .line 791
    .line 792
    const/16 v21, 0x2

    .line 793
    .line 794
    const/high16 v20, 0x40c00000    # 6.0f

    .line 795
    .line 796
    move/from16 v17, v3

    .line 797
    .line 798
    move/from16 v19, v6

    .line 799
    .line 800
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 801
    .line 802
    .line 803
    move-result-object v29

    .line 804
    move-object/from16 v3, v16

    .line 805
    .line 806
    move-object v6, v1

    .line 807
    check-cast v6, La/gpp;

    .line 808
    .line 809
    iget-object v6, v6, La/gpp;->d:La/b8l0;

    .line 810
    .line 811
    new-instance v7, La/l3l0;

    .line 812
    .line 813
    invoke-direct {v7, v2}, La/l3l0;-><init>(F)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    move-result v2

    .line 820
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v8

    .line 824
    or-int/2addr v2, v8

    .line 825
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v8

    .line 829
    if-nez v2, :cond_20

    .line 830
    .line 831
    if-ne v8, v14, :cond_21

    .line 832
    .line 833
    :cond_20
    new-instance v8, La/z7;

    .line 834
    .line 835
    const/16 v2, 0x18

    .line 836
    .line 837
    invoke-direct {v8, v0, v1, v2}, La/z7;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v4, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 841
    .line 842
    .line 843
    :cond_21
    move-object/from16 v34, v8

    .line 844
    .line 845
    check-cast v34, Lkotlin/jvm/functions/Function0;

    .line 846
    .line 847
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    move-result v2

    .line 851
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-result v8

    .line 855
    or-int/2addr v2, v8

    .line 856
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v8

    .line 860
    if-nez v2, :cond_22

    .line 861
    .line 862
    if-ne v8, v14, :cond_23

    .line 863
    .line 864
    :cond_22
    new-instance v8, La/z7;

    .line 865
    .line 866
    const/16 v2, 0x19

    .line 867
    .line 868
    invoke-direct {v8, v0, v1, v2}, La/z7;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v4, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 872
    .line 873
    .line 874
    :cond_23
    move-object/from16 v35, v8

    .line 875
    .line 876
    check-cast v35, Lkotlin/jvm/functions/Function0;

    .line 877
    .line 878
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result v2

    .line 882
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 883
    .line 884
    .line 885
    move-result v8

    .line 886
    or-int/2addr v2, v8

    .line 887
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v8

    .line 891
    if-nez v2, :cond_24

    .line 892
    .line 893
    if-ne v8, v14, :cond_25

    .line 894
    .line 895
    :cond_24
    new-instance v8, La/bi2;

    .line 896
    .line 897
    const/16 v2, 0x8

    .line 898
    .line 899
    invoke-direct {v8, v0, v1, v2}, La/bi2;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 900
    .line 901
    .line 902
    invoke-virtual {v4, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 903
    .line 904
    .line 905
    :cond_25
    move-object/from16 v37, v8

    .line 906
    .line 907
    check-cast v37, Lkotlin/jvm/functions/Function1;

    .line 908
    .line 909
    const/16 v39, 0x0

    .line 910
    .line 911
    const/16 v40, 0x98

    .line 912
    .line 913
    const/16 v32, 0x0

    .line 914
    .line 915
    const/16 v33, 0x0

    .line 916
    .line 917
    const/16 v36, 0x0

    .line 918
    .line 919
    move-object/from16 v38, v4

    .line 920
    .line 921
    move-object/from16 v30, v6

    .line 922
    .line 923
    move-object/from16 v31, v7

    .line 924
    .line 925
    invoke-static/range {v29 .. v40}, La/xbc;->o(La/mm40;La/b8l0;La/n3l0;La/d4d;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 926
    .line 927
    .line 928
    const/4 v0, 0x0

    .line 929
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 930
    .line 931
    .line 932
    goto :goto_11

    .line 933
    :cond_26
    move-object/from16 v3, v16

    .line 934
    .line 935
    goto/16 :goto_f

    .line 936
    .line 937
    :goto_10
    const v1, 0x48b7a067

    .line 938
    .line 939
    .line 940
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 944
    .line 945
    .line 946
    :goto_11
    if-nez v5, :cond_27

    .line 947
    .line 948
    if-eqz v13, :cond_27

    .line 949
    .line 950
    const v0, 0x48b885ff

    .line 951
    .line 952
    .line 953
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 954
    .line 955
    .line 956
    sget-object v0, La/qmk;->a:La/zcl;

    .line 957
    .line 958
    const/high16 v0, 0x41a00000    # 20.0f

    .line 959
    .line 960
    invoke-static {v3, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 965
    .line 966
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 971
    .line 972
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 973
    .line 974
    .line 975
    move-result-wide v1

    .line 976
    sget-object v3, La/jd8;->n:La/ljc;

    .line 977
    .line 978
    invoke-static {v0, v1, v2, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    invoke-static {v4, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 983
    .line 984
    .line 985
    const/4 v0, 0x0

    .line 986
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 987
    .line 988
    .line 989
    goto :goto_12

    .line 990
    :cond_27
    const/4 v0, 0x0

    .line 991
    const v1, 0x48bb74c7

    .line 992
    .line 993
    .line 994
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 998
    .line 999
    .line 1000
    :goto_12
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 1001
    .line 1002
    .line 1003
    goto :goto_13

    .line 1004
    :cond_28
    invoke-virtual {v4}, La/fet;->X()V

    .line 1005
    .line 1006
    .line 1007
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1008
    .line 1009
    return-object v0

    .line 1010
    :pswitch_1
    move-object/from16 v1, p1

    .line 1011
    .line 1012
    check-cast v1, La/g9z;

    .line 1013
    .line 1014
    move-object/from16 v4, p2

    .line 1015
    .line 1016
    check-cast v4, Ljava/lang/Number;

    .line 1017
    .line 1018
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 1019
    .line 1020
    .line 1021
    move-result v4

    .line 1022
    move-object/from16 v11, p3

    .line 1023
    .line 1024
    check-cast v11, La/fet;

    .line 1025
    .line 1026
    move-object/from16 v12, p4

    .line 1027
    .line 1028
    check-cast v12, Ljava/lang/Number;

    .line 1029
    .line 1030
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 1031
    .line 1032
    .line 1033
    move-result v12

    .line 1034
    and-int/lit8 v18, v12, 0x6

    .line 1035
    .line 1036
    if-nez v18, :cond_2a

    .line 1037
    .line 1038
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1039
    .line 1040
    .line 1041
    move-result v1

    .line 1042
    if-eqz v1, :cond_29

    .line 1043
    .line 1044
    move v1, v10

    .line 1045
    goto :goto_14

    .line 1046
    :cond_29
    move v1, v15

    .line 1047
    :goto_14
    or-int/2addr v1, v12

    .line 1048
    goto :goto_15

    .line 1049
    :cond_2a
    move v1, v12

    .line 1050
    :goto_15
    and-int/lit8 v12, v12, 0x30

    .line 1051
    .line 1052
    if-nez v12, :cond_2c

    .line 1053
    .line 1054
    invoke-virtual {v11, v4}, La/fet;->e(I)Z

    .line 1055
    .line 1056
    .line 1057
    move-result v12

    .line 1058
    if-eqz v12, :cond_2b

    .line 1059
    .line 1060
    const/16 v16, 0x20

    .line 1061
    .line 1062
    goto :goto_16

    .line 1063
    :cond_2b
    const/16 v16, 0x10

    .line 1064
    .line 1065
    :goto_16
    or-int v1, v1, v16

    .line 1066
    .line 1067
    :cond_2c
    and-int/lit16 v12, v1, 0x93

    .line 1068
    .line 1069
    if-eq v12, v9, :cond_2d

    .line 1070
    .line 1071
    move v9, v13

    .line 1072
    goto :goto_17

    .line 1073
    :cond_2d
    const/4 v9, 0x0

    .line 1074
    :goto_17
    and-int/2addr v1, v13

    .line 1075
    invoke-virtual {v11, v1, v9}, La/fet;->U(IZ)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v1

    .line 1079
    if-eqz v1, :cond_3c

    .line 1080
    .line 1081
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v1

    .line 1085
    check-cast v1, La/p6t0;

    .line 1086
    .line 1087
    const v8, -0x694ec8b4

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v11, v8}, La/fet;->e0(I)V

    .line 1091
    .line 1092
    .line 1093
    iget-object v7, v7, La/kfl0;->b:La/a4x;

    .line 1094
    .line 1095
    invoke-static {v7}, La/q3d;->i(Ljava/util/List;)I

    .line 1096
    .line 1097
    .line 1098
    move-result v7

    .line 1099
    if-ne v4, v7, :cond_2e

    .line 1100
    .line 1101
    goto :goto_18

    .line 1102
    :cond_2e
    const/4 v13, 0x0

    .line 1103
    :goto_18
    sget-object v4, La/jm40;->b:La/jm40;

    .line 1104
    .line 1105
    if-nez v1, :cond_2f

    .line 1106
    .line 1107
    move-object v3, v4

    .line 1108
    move-object v6, v11

    .line 1109
    :goto_19
    const/4 v0, 0x0

    .line 1110
    goto/16 :goto_1a

    .line 1111
    .line 1112
    :cond_2f
    instance-of v7, v1, La/rfl0;

    .line 1113
    .line 1114
    if-eqz v7, :cond_30

    .line 1115
    .line 1116
    const v0, -0x694dfd64

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v11, v0}, La/fet;->e0(I)V

    .line 1120
    .line 1121
    .line 1122
    invoke-static {v11}, La/xfn;->a(La/fet;)La/wfn;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    iget v0, v0, La/wfn;->d:F

    .line 1127
    .line 1128
    invoke-static {v4, v0, v6, v15}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v18

    .line 1132
    check-cast v1, La/rfl0;

    .line 1133
    .line 1134
    iget-object v0, v1, La/rfl0;->a:La/jjm;

    .line 1135
    .line 1136
    sget-object v20, La/kjm;->b:La/kjm;

    .line 1137
    .line 1138
    const/16 v25, 0x180

    .line 1139
    .line 1140
    const/16 v26, 0x38

    .line 1141
    .line 1142
    const/16 v21, 0x0

    .line 1143
    .line 1144
    const/16 v22, 0x0

    .line 1145
    .line 1146
    const/16 v23, 0x0

    .line 1147
    .line 1148
    move-object/from16 v19, v0

    .line 1149
    .line 1150
    move-object/from16 v24, v11

    .line 1151
    .line 1152
    invoke-static/range {v18 .. v26}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1153
    .line 1154
    .line 1155
    move-object/from16 v6, v24

    .line 1156
    .line 1157
    const/4 v0, 0x0

    .line 1158
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 1159
    .line 1160
    .line 1161
    move-object v3, v4

    .line 1162
    goto/16 :goto_1b

    .line 1163
    .line 1164
    :cond_30
    move-object v6, v11

    .line 1165
    instance-of v7, v1, La/rer0;

    .line 1166
    .line 1167
    if-eqz v7, :cond_33

    .line 1168
    .line 1169
    const v2, -0x69492393

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v6, v2}, La/fet;->e0(I)V

    .line 1173
    .line 1174
    .line 1175
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1176
    .line 1177
    const/high16 v20, 0x41400000    # 12.0f

    .line 1178
    .line 1179
    const/16 v21, 0x7

    .line 1180
    .line 1181
    const/16 v17, 0x0

    .line 1182
    .line 1183
    const/16 v18, 0x0

    .line 1184
    .line 1185
    const/16 v19, 0x0

    .line 1186
    .line 1187
    move-object/from16 v16, v4

    .line 1188
    .line 1189
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v2

    .line 1193
    check-cast v1, La/rer0;

    .line 1194
    .line 1195
    iget-object v1, v1, La/rer0;->a:La/f3n;

    .line 1196
    .line 1197
    invoke-virtual {v6, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1198
    .line 1199
    .line 1200
    move-result v4

    .line 1201
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v7

    .line 1205
    if-nez v4, :cond_31

    .line 1206
    .line 1207
    if-ne v7, v14, :cond_32

    .line 1208
    .line 1209
    :cond_31
    new-instance v7, La/v6a0;

    .line 1210
    .line 1211
    invoke-direct {v7, v0, v3}, La/v6a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v6, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1215
    .line 1216
    .line 1217
    :cond_32
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 1218
    .line 1219
    invoke-static {v2, v1, v7, v6, v10}, La/qcc;->m(La/mm40;La/f3n;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1220
    .line 1221
    .line 1222
    const/4 v0, 0x0

    .line 1223
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 1224
    .line 1225
    .line 1226
    move-object/from16 v3, v16

    .line 1227
    .line 1228
    goto/16 :goto_1b

    .line 1229
    .line 1230
    :cond_33
    move-object/from16 v16, v4

    .line 1231
    .line 1232
    instance-of v3, v1, La/gpp;

    .line 1233
    .line 1234
    if-eqz v3, :cond_3a

    .line 1235
    .line 1236
    const v3, -0x694100c3

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v6, v3}, La/fet;->e0(I)V

    .line 1240
    .line 1241
    .line 1242
    invoke-static {v6}, La/xfn;->a(La/fet;)La/wfn;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v3

    .line 1246
    iget v3, v3, La/wfn;->d:F

    .line 1247
    .line 1248
    invoke-static {v6}, La/xfn;->a(La/fet;)La/wfn;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v4

    .line 1252
    iget v4, v4, La/wfn;->d:F

    .line 1253
    .line 1254
    sget-object v7, La/qmk;->a:La/zcl;

    .line 1255
    .line 1256
    const/high16 v20, 0x41000000    # 8.0f

    .line 1257
    .line 1258
    const/16 v21, 0x2

    .line 1259
    .line 1260
    const/16 v18, 0x0

    .line 1261
    .line 1262
    move/from16 v17, v3

    .line 1263
    .line 1264
    move/from16 v19, v4

    .line 1265
    .line 1266
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v29

    .line 1270
    move-object/from16 v3, v16

    .line 1271
    .line 1272
    move-object v4, v1

    .line 1273
    check-cast v4, La/gpp;

    .line 1274
    .line 1275
    iget-object v4, v4, La/gpp;->d:La/b8l0;

    .line 1276
    .line 1277
    new-instance v7, La/l3l0;

    .line 1278
    .line 1279
    invoke-direct {v7, v2}, La/l3l0;-><init>(F)V

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v6, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v2

    .line 1286
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1287
    .line 1288
    .line 1289
    move-result v8

    .line 1290
    or-int/2addr v2, v8

    .line 1291
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v8

    .line 1295
    if-nez v2, :cond_34

    .line 1296
    .line 1297
    if-ne v8, v14, :cond_35

    .line 1298
    .line 1299
    :cond_34
    new-instance v8, La/z7;

    .line 1300
    .line 1301
    const/16 v2, 0x14

    .line 1302
    .line 1303
    invoke-direct {v8, v0, v1, v2}, La/z7;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v6, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1307
    .line 1308
    .line 1309
    :cond_35
    move-object/from16 v34, v8

    .line 1310
    .line 1311
    check-cast v34, Lkotlin/jvm/functions/Function0;

    .line 1312
    .line 1313
    invoke-virtual {v6, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1314
    .line 1315
    .line 1316
    move-result v2

    .line 1317
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1318
    .line 1319
    .line 1320
    move-result v8

    .line 1321
    or-int/2addr v2, v8

    .line 1322
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v8

    .line 1326
    if-nez v2, :cond_36

    .line 1327
    .line 1328
    if-ne v8, v14, :cond_37

    .line 1329
    .line 1330
    :cond_36
    new-instance v8, La/z7;

    .line 1331
    .line 1332
    const/16 v2, 0x15

    .line 1333
    .line 1334
    invoke-direct {v8, v0, v1, v2}, La/z7;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {v6, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1338
    .line 1339
    .line 1340
    :cond_37
    move-object/from16 v35, v8

    .line 1341
    .line 1342
    check-cast v35, Lkotlin/jvm/functions/Function0;

    .line 1343
    .line 1344
    invoke-virtual {v6, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1345
    .line 1346
    .line 1347
    move-result v2

    .line 1348
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1349
    .line 1350
    .line 1351
    move-result v8

    .line 1352
    or-int/2addr v2, v8

    .line 1353
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v8

    .line 1357
    if-nez v2, :cond_38

    .line 1358
    .line 1359
    if-ne v8, v14, :cond_39

    .line 1360
    .line 1361
    :cond_38
    new-instance v8, La/bi2;

    .line 1362
    .line 1363
    const/4 v2, 0x6

    .line 1364
    invoke-direct {v8, v0, v1, v2}, La/bi2;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v6, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1368
    .line 1369
    .line 1370
    :cond_39
    move-object/from16 v37, v8

    .line 1371
    .line 1372
    check-cast v37, Lkotlin/jvm/functions/Function1;

    .line 1373
    .line 1374
    const/16 v39, 0x0

    .line 1375
    .line 1376
    const/16 v40, 0x98

    .line 1377
    .line 1378
    const/16 v32, 0x0

    .line 1379
    .line 1380
    const/16 v33, 0x0

    .line 1381
    .line 1382
    const/16 v36, 0x0

    .line 1383
    .line 1384
    move-object/from16 v30, v4

    .line 1385
    .line 1386
    move-object/from16 v38, v6

    .line 1387
    .line 1388
    move-object/from16 v31, v7

    .line 1389
    .line 1390
    invoke-static/range {v29 .. v40}, La/xbc;->o(La/mm40;La/b8l0;La/n3l0;La/d4d;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1391
    .line 1392
    .line 1393
    const/4 v0, 0x0

    .line 1394
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 1395
    .line 1396
    .line 1397
    goto :goto_1b

    .line 1398
    :cond_3a
    move-object/from16 v3, v16

    .line 1399
    .line 1400
    goto/16 :goto_19

    .line 1401
    .line 1402
    :goto_1a
    const v1, -0x692e6c71

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual {v6, v1}, La/fet;->e0(I)V

    .line 1406
    .line 1407
    .line 1408
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 1409
    .line 1410
    .line 1411
    :goto_1b
    if-nez v5, :cond_3b

    .line 1412
    .line 1413
    if-eqz v13, :cond_3b

    .line 1414
    .line 1415
    const v0, -0x692d86d9

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 1419
    .line 1420
    .line 1421
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1422
    .line 1423
    const/high16 v0, 0x41a00000    # 20.0f

    .line 1424
    .line 1425
    invoke-static {v3, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 1430
    .line 1431
    invoke-virtual {v6, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v1

    .line 1435
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1436
    .line 1437
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 1438
    .line 1439
    .line 1440
    move-result-wide v1

    .line 1441
    sget-object v3, La/jd8;->n:La/ljc;

    .line 1442
    .line 1443
    invoke-static {v0, v1, v2, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v0

    .line 1447
    invoke-static {v6, v0}, La/qxw;->o(La/fet;La/mm40;)V

    .line 1448
    .line 1449
    .line 1450
    const/4 v0, 0x0

    .line 1451
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 1452
    .line 1453
    .line 1454
    goto :goto_1c

    .line 1455
    :cond_3b
    const/4 v0, 0x0

    .line 1456
    const v1, -0x692a9811

    .line 1457
    .line 1458
    .line 1459
    invoke-virtual {v6, v1}, La/fet;->e0(I)V

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 1463
    .line 1464
    .line 1465
    :goto_1c
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 1466
    .line 1467
    .line 1468
    goto :goto_1d

    .line 1469
    :cond_3c
    move-object v6, v11

    .line 1470
    invoke-virtual {v6}, La/fet;->X()V

    .line 1471
    .line 1472
    .line 1473
    :goto_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1474
    .line 1475
    return-object v0

    .line 1476
    nop

    .line 1477
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
