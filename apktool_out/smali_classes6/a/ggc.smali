.class public final La/ggc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ggc;->a:B

    iput-object p1, p0, La/ggc;->c:Ljava/lang/Object;

    iput-object p2, p0, La/ggc;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ggc;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x2

    .line 8
    sget-object v5, La/ukd;->a:La/cl5;

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v7, v0, La/ggc;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v0, v0, La/ggc;->b:Ljava/lang/Object;

    .line 14
    .line 15
    const/16 v8, 0x12

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 24
    .line 25
    move-object/from16 v2, p2

    .line 26
    .line 27
    check-cast v2, La/fet;

    .line 28
    .line 29
    move-object/from16 v10, p3

    .line 30
    .line 31
    check-cast v10, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    check-cast v0, Ljava/lang/String;

    .line 38
    .line 39
    check-cast v7, La/hwo;

    .line 40
    .line 41
    and-int/lit8 v11, v10, 0x6

    .line 42
    .line 43
    if-nez v11, :cond_1

    .line 44
    .line 45
    invoke-virtual {v2, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    if-eqz v11, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v3, v4

    .line 53
    :goto_0
    or-int/2addr v10, v3

    .line 54
    :cond_1
    and-int/lit8 v3, v10, 0x13

    .line 55
    .line 56
    if-eq v3, v8, :cond_2

    .line 57
    .line 58
    move v3, v6

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v3, v9

    .line 61
    :goto_1
    and-int/lit8 v4, v10, 0x1

    .line 62
    .line 63
    invoke-virtual {v2, v4, v3}, La/fet;->U(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_10

    .line 68
    .line 69
    sget-object v3, La/yt40;->d:La/yt40;

    .line 70
    .line 71
    invoke-static {v3, v2}, La/d7x;->P(La/yt40;La/fet;)La/nul0;

    .line 72
    .line 73
    .line 74
    move-result-object v13

    .line 75
    const/4 v15, 0x0

    .line 76
    invoke-virtual {v2, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-virtual {v2, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    or-int/2addr v3, v4

    .line 85
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    if-nez v3, :cond_3

    .line 90
    .line 91
    if-ne v4, v5, :cond_4

    .line 92
    .line 93
    :cond_3
    new-instance v4, La/goi0;

    .line 94
    .line 95
    const/16 v3, 0x9

    .line 96
    .line 97
    invoke-direct {v4, v7, v3}, La/goi0;-><init>(Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    move-object v14, v4

    .line 104
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 105
    .line 106
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    if-ne v3, v5, :cond_5

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    invoke-static {v3}, La/xf0;->c(F)La/t33;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_5
    move-object v12, v3

    .line 121
    check-cast v12, La/t33;

    .line 122
    .line 123
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {v2, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    invoke-virtual {v2, v6}, La/fet;->h(Z)Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    or-int/2addr v4, v7

    .line 134
    invoke-virtual {v2, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    or-int/2addr v4, v7

    .line 139
    invoke-virtual {v2, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    or-int/2addr v4, v7

    .line 144
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    if-nez v4, :cond_6

    .line 149
    .line 150
    if-ne v7, v5, :cond_7

    .line 151
    .line 152
    :cond_6
    new-instance v11, La/myj0;

    .line 153
    .line 154
    const/16 v16, 0x7

    .line 155
    .line 156
    invoke-direct/range {v11 .. v16}, La/myj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    move-object v7, v11

    .line 163
    :cond_7
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 164
    .line 165
    invoke-static {v2, v3, v7}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    iget-object v4, v12, La/t33;->c:La/l73;

    .line 169
    .line 170
    sget-object v7, La/yt40;->b:La/yt40;

    .line 171
    .line 172
    invoke-static {v7, v2}, La/d7x;->P(La/yt40;La/fet;)La/nul0;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    if-ne v11, v5, :cond_8

    .line 181
    .line 182
    const v11, 0x3f4ccccd    # 0.8f

    .line 183
    .line 184
    .line 185
    invoke-static {v11}, La/xf0;->c(F)La/t33;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    invoke-virtual {v2, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    :cond_8
    check-cast v11, La/t33;

    .line 193
    .line 194
    invoke-virtual {v2, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    invoke-virtual {v2, v6}, La/fet;->h(Z)Z

    .line 199
    .line 200
    .line 201
    move-result v13

    .line 202
    or-int/2addr v12, v13

    .line 203
    invoke-virtual {v2, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    or-int/2addr v12, v13

    .line 208
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v13

    .line 212
    if-nez v12, :cond_9

    .line 213
    .line 214
    if-ne v13, v5, :cond_a

    .line 215
    .line 216
    :cond_9
    new-instance v13, La/kbh0;

    .line 217
    .line 218
    invoke-direct {v13, v11, v7, v15, v8}, La/kbh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_a
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 225
    .line 226
    invoke-static {v2, v3, v13}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 227
    .line 228
    .line 229
    iget-object v3, v11, La/t33;->c:La/l73;

    .line 230
    .line 231
    iget-object v7, v3, La/l73;->b:La/pz40;

    .line 232
    .line 233
    check-cast v7, La/hgk0;

    .line 234
    .line 235
    invoke-virtual {v7}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    check-cast v7, Ljava/lang/Number;

    .line 240
    .line 241
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 242
    .line 243
    .line 244
    move-result v17

    .line 245
    iget-object v3, v3, La/l73;->b:La/pz40;

    .line 246
    .line 247
    check-cast v3, La/hgk0;

    .line 248
    .line 249
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    check-cast v3, Ljava/lang/Number;

    .line 254
    .line 255
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 256
    .line 257
    .line 258
    move-result v18

    .line 259
    iget-object v3, v4, La/l73;->b:La/pz40;

    .line 260
    .line 261
    check-cast v3, La/hgk0;

    .line 262
    .line 263
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    check-cast v3, Ljava/lang/Number;

    .line 268
    .line 269
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 270
    .line 271
    .line 272
    move-result v19

    .line 273
    const/16 v21, 0x0

    .line 274
    .line 275
    const v22, 0x1fff8

    .line 276
    .line 277
    .line 278
    sget-object v16, La/jm40;->b:La/jm40;

    .line 279
    .line 280
    const/16 v20, 0x0

    .line 281
    .line 282
    invoke-static/range {v16 .. v22}, La/i4w0;->V(La/mm40;FFFFLa/yjj0;I)La/mm40;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-virtual {v2, v6}, La/fet;->h(Z)Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    invoke-virtual {v2, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    or-int/2addr v4, v7

    .line 295
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v7

    .line 299
    or-int/2addr v4, v7

    .line 300
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    const/16 v8, 0xe

    .line 305
    .line 306
    if-nez v4, :cond_b

    .line 307
    .line 308
    if-ne v7, v5, :cond_c

    .line 309
    .line 310
    :cond_b
    new-instance v7, La/ka6;

    .line 311
    .line 312
    invoke-direct {v7, v0, v8}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    :cond_c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 319
    .line 320
    invoke-static {v3, v9, v7}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    sget-object v3, La/gqw0;->a:La/zx7;

    .line 325
    .line 326
    invoke-static {v3, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    invoke-static {v2}, La/e3c;->x(La/fet;)I

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    invoke-static {v2, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 343
    .line 344
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2}, La/fet;->i0()V

    .line 348
    .line 349
    .line 350
    iget-boolean v7, v2, La/fet;->S:Z

    .line 351
    .line 352
    if-eqz v7, :cond_d

    .line 353
    .line 354
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 355
    .line 356
    invoke-virtual {v2, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 357
    .line 358
    .line 359
    goto :goto_2

    .line 360
    :cond_d
    invoke-virtual {v2}, La/fet;->r0()V

    .line 361
    .line 362
    .line 363
    :goto_2
    sget-object v7, La/gqw0;->x:La/shd;

    .line 364
    .line 365
    invoke-static {v2, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 366
    .line 367
    .line 368
    sget-object v3, La/gqw0;->w:La/shd;

    .line 369
    .line 370
    invoke-static {v2, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 371
    .line 372
    .line 373
    sget-object v3, La/gqw0;->y:La/shd;

    .line 374
    .line 375
    iget-boolean v5, v2, La/fet;->S:Z

    .line 376
    .line 377
    if-nez v5, :cond_e

    .line 378
    .line 379
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v5

    .line 391
    if-nez v5, :cond_f

    .line 392
    .line 393
    :cond_e
    invoke-static {v4, v2, v4, v3}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 394
    .line 395
    .line 396
    :cond_f
    sget-object v3, La/gqw0;->v:La/shd;

    .line 397
    .line 398
    invoke-static {v2, v0, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 399
    .line 400
    .line 401
    and-int/lit8 v0, v10, 0xe

    .line 402
    .line 403
    invoke-static {v0, v2, v1, v6}, La/h97;->q(ILa/fet;Lkotlin/jvm/functions/Function2;Z)V

    .line 404
    .line 405
    .line 406
    goto :goto_3

    .line 407
    :cond_10
    invoke-virtual {v2}, La/fet;->X()V

    .line 408
    .line 409
    .line 410
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_0
    move-object/from16 v1, p1

    .line 414
    .line 415
    check-cast v1, La/y5d;

    .line 416
    .line 417
    move-object/from16 v14, p2

    .line 418
    .line 419
    check-cast v14, La/fet;

    .line 420
    .line 421
    move-object/from16 v3, p3

    .line 422
    .line 423
    check-cast v3, Ljava/lang/Number;

    .line 424
    .line 425
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    and-int/lit8 v1, v3, 0x11

    .line 433
    .line 434
    const/16 v4, 0x10

    .line 435
    .line 436
    if-eq v1, v4, :cond_11

    .line 437
    .line 438
    move v1, v6

    .line 439
    goto :goto_4

    .line 440
    :cond_11
    move v1, v9

    .line 441
    :goto_4
    and-int/2addr v3, v6

    .line 442
    invoke-virtual {v14, v3, v1}, La/fet;->U(IZ)Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-eqz v1, :cond_13

    .line 447
    .line 448
    move-object v11, v7

    .line 449
    check-cast v11, La/zgx;

    .line 450
    .line 451
    iget-object v1, v11, La/zgx;->b:La/a4x;

    .line 452
    .line 453
    move-object v10, v0

    .line 454
    check-cast v10, La/ugd;

    .line 455
    .line 456
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    move v1, v9

    .line 461
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 462
    .line 463
    .line 464
    move-result v3

    .line 465
    if-eqz v3, :cond_14

    .line 466
    .line 467
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    add-int/lit8 v4, v1, 0x1

    .line 472
    .line 473
    if-ltz v1, :cond_12

    .line 474
    .line 475
    move-object v12, v3

    .line 476
    check-cast v12, La/d4n;

    .line 477
    .line 478
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 479
    .line 480
    .line 481
    move-result-object v13

    .line 482
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 483
    .line 484
    .line 485
    move-result-object v15

    .line 486
    invoke-virtual/range {v10 .. v15}, La/ugd;->O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move v1, v4

    .line 490
    goto :goto_5

    .line 491
    :cond_12
    invoke-static {}, La/q3d;->p()V

    .line 492
    .line 493
    .line 494
    throw v2

    .line 495
    :cond_13
    invoke-virtual {v14}, La/fet;->X()V

    .line 496
    .line 497
    .line 498
    :cond_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_1
    move-object/from16 v1, p1

    .line 502
    .line 503
    check-cast v1, La/jgc;

    .line 504
    .line 505
    move-object/from16 v10, p2

    .line 506
    .line 507
    check-cast v10, La/fet;

    .line 508
    .line 509
    move-object/from16 v11, p3

    .line 510
    .line 511
    check-cast v11, Ljava/lang/Number;

    .line 512
    .line 513
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 514
    .line 515
    .line 516
    move-result v11

    .line 517
    check-cast v7, La/sfc;

    .line 518
    .line 519
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    and-int/lit8 v12, v11, 0x6

    .line 523
    .line 524
    if-nez v12, :cond_17

    .line 525
    .line 526
    and-int/lit8 v12, v11, 0x8

    .line 527
    .line 528
    if-nez v12, :cond_15

    .line 529
    .line 530
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v12

    .line 534
    goto :goto_6

    .line 535
    :cond_15
    invoke-virtual {v10, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v12

    .line 539
    :goto_6
    if-eqz v12, :cond_16

    .line 540
    .line 541
    move v4, v3

    .line 542
    :cond_16
    or-int/2addr v11, v4

    .line 543
    :cond_17
    and-int/lit8 v4, v11, 0x13

    .line 544
    .line 545
    if-eq v4, v8, :cond_18

    .line 546
    .line 547
    move v4, v6

    .line 548
    goto :goto_7

    .line 549
    :cond_18
    move v4, v9

    .line 550
    :goto_7
    and-int/lit8 v12, v11, 0x1

    .line 551
    .line 552
    invoke-virtual {v10, v12, v4}, La/fet;->U(IZ)Z

    .line 553
    .line 554
    .line 555
    move-result v4

    .line 556
    if-eqz v4, :cond_1d

    .line 557
    .line 558
    invoke-virtual {v10, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v4

    .line 562
    and-int/lit8 v12, v11, 0xe

    .line 563
    .line 564
    if-eq v12, v3, :cond_1a

    .line 565
    .line 566
    and-int/lit8 v3, v11, 0x8

    .line 567
    .line 568
    if-eqz v3, :cond_19

    .line 569
    .line 570
    invoke-virtual {v10, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    if-eqz v3, :cond_19

    .line 575
    .line 576
    goto :goto_8

    .line 577
    :cond_19
    move v6, v9

    .line 578
    :cond_1a
    :goto_8
    or-int v3, v4, v6

    .line 579
    .line 580
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    if-nez v3, :cond_1b

    .line 585
    .line 586
    if-ne v4, v5, :cond_1c

    .line 587
    .line 588
    :cond_1b
    new-instance v4, La/at7;

    .line 589
    .line 590
    invoke-direct {v4, v7, v1, v8}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v10, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    :cond_1c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 597
    .line 598
    new-instance v3, La/ggc;

    .line 599
    .line 600
    check-cast v0, La/fwv0;

    .line 601
    .line 602
    invoke-direct {v3, v1, v0, v9}, La/ggc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 603
    .line 604
    .line 605
    const v0, -0x1f3caf17

    .line 606
    .line 607
    .line 608
    invoke-static {v0, v3, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    const/16 v1, 0xc00

    .line 613
    .line 614
    invoke-static {v2, v4, v0, v10, v1}, La/yum0;->b(La/mm40;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 615
    .line 616
    .line 617
    goto :goto_9

    .line 618
    :cond_1d
    invoke-virtual {v10}, La/fet;->X()V

    .line 619
    .line 620
    .line 621
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 622
    .line 623
    return-object v0

    .line 624
    :pswitch_2
    move-object/from16 v1, p1

    .line 625
    .line 626
    check-cast v1, La/pwv0;

    .line 627
    .line 628
    move-object/from16 v2, p2

    .line 629
    .line 630
    check-cast v2, La/fet;

    .line 631
    .line 632
    move-object/from16 v10, p3

    .line 633
    .line 634
    check-cast v10, Ljava/lang/Number;

    .line 635
    .line 636
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 637
    .line 638
    .line 639
    move-result v10

    .line 640
    check-cast v7, La/jgc;

    .line 641
    .line 642
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    and-int/lit8 v11, v10, 0x6

    .line 646
    .line 647
    if-nez v11, :cond_1f

    .line 648
    .line 649
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v11

    .line 653
    if-eqz v11, :cond_1e

    .line 654
    .line 655
    move v4, v3

    .line 656
    :cond_1e
    or-int/2addr v10, v4

    .line 657
    :cond_1f
    and-int/lit8 v4, v10, 0x13

    .line 658
    .line 659
    if-eq v4, v8, :cond_20

    .line 660
    .line 661
    move v4, v6

    .line 662
    goto :goto_a

    .line 663
    :cond_20
    move v4, v9

    .line 664
    :goto_a
    and-int/lit8 v8, v10, 0x1

    .line 665
    .line 666
    invoke-virtual {v2, v8, v4}, La/fet;->U(IZ)Z

    .line 667
    .line 668
    .line 669
    move-result v4

    .line 670
    if-eqz v4, :cond_26

    .line 671
    .line 672
    check-cast v0, La/fwv0;

    .line 673
    .line 674
    and-int/lit8 v4, v10, 0xe

    .line 675
    .line 676
    xor-int/lit8 v4, v4, 0x6

    .line 677
    .line 678
    if-le v4, v3, :cond_21

    .line 679
    .line 680
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    move-result v4

    .line 684
    if-nez v4, :cond_23

    .line 685
    .line 686
    :cond_21
    and-int/lit8 v4, v10, 0x6

    .line 687
    .line 688
    if-ne v4, v3, :cond_22

    .line 689
    .line 690
    goto :goto_b

    .line 691
    :cond_22
    move v6, v9

    .line 692
    :cond_23
    :goto_b
    invoke-virtual {v2, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 693
    .line 694
    .line 695
    move-result v3

    .line 696
    or-int/2addr v3, v6

    .line 697
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v4

    .line 701
    or-int/2addr v3, v4

    .line 702
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v4

    .line 706
    if-nez v3, :cond_24

    .line 707
    .line 708
    if-ne v4, v5, :cond_25

    .line 709
    .line 710
    :cond_24
    new-instance v4, La/hwv0;

    .line 711
    .line 712
    invoke-direct {v4, v1, v7, v0}, La/hwv0;-><init>(La/pwv0;La/jgc;La/fwv0;)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    :cond_25
    check-cast v4, La/hwv0;

    .line 719
    .line 720
    sget-object v0, La/ahy;->a:La/ugd;

    .line 721
    .line 722
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    invoke-virtual {v0, v4, v7, v2, v1}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    goto :goto_c

    .line 730
    :cond_26
    invoke-virtual {v2}, La/fet;->X()V

    .line 731
    .line 732
    .line 733
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 734
    .line 735
    return-object v0

    .line 736
    nop

    .line 737
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
