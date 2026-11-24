.class public final synthetic La/axy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/xcz;

.field public final synthetic e:La/xeb;


# direct methods
.method public synthetic constructor <init>(La/mm40;Lkotlin/jvm/functions/Function1;La/xcz;La/xeb;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/axy;->a:B

    iput-object p1, p0, La/axy;->b:La/mm40;

    iput-object p2, p0, La/axy;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/axy;->d:La/xcz;

    iput-object p4, p0, La/axy;->e:La/xeb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/axy;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41c00000    # 24.0f

    .line 6
    .line 7
    const/high16 v3, 0x42000000    # 32.0f

    .line 8
    .line 9
    const/16 v4, 0x17

    .line 10
    .line 11
    const/high16 v5, 0x41400000    # 12.0f

    .line 12
    .line 13
    sget-object v6, La/ukd;->a:La/cl5;

    .line 14
    .line 15
    iget-object v7, v0, La/axy;->e:La/xeb;

    .line 16
    .line 17
    iget-object v8, v0, La/axy;->c:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    iget-object v9, v0, La/axy;->b:La/mm40;

    .line 20
    .line 21
    const/16 v10, 0x10

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x1

    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, La/ir8;

    .line 31
    .line 32
    move-object/from16 v2, p2

    .line 33
    .line 34
    check-cast v2, La/fet;

    .line 35
    .line 36
    move-object/from16 v5, p3

    .line 37
    .line 38
    check-cast v5, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    and-int/lit8 v1, v5, 0x11

    .line 48
    .line 49
    if-eq v1, v10, :cond_0

    .line 50
    .line 51
    move v1, v12

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v1, v11

    .line 54
    :goto_0
    and-int/2addr v5, v12

    .line 55
    invoke-virtual {v2, v5, v1}, La/fet;->U(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_6

    .line 60
    .line 61
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 62
    .line 63
    invoke-interface {v9, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    if-nez v5, :cond_1

    .line 76
    .line 77
    if-ne v9, v6, :cond_2

    .line 78
    .line 79
    :cond_1
    new-instance v9, La/nrj0;

    .line 80
    .line 81
    invoke-direct {v9, v8, v4}, La/nrj0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 88
    .line 89
    invoke-static {v11, v2, v1, v9}, La/pzw;->A(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)La/mm40;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    const v1, -0x76282b5c

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 97
    .line 98
    .line 99
    sget-object v1, La/qmk;->a:La/zcl;

    .line 100
    .line 101
    const/high16 v1, 0x41200000    # 10.0f

    .line 102
    .line 103
    const/4 v4, 0x5

    .line 104
    const/4 v5, 0x0

    .line 105
    invoke-static {v5, v1, v5, v3, v4}, La/s5x0;->u(FFFFI)La/lh80;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-object v3, v7, La/xeb;->b:La/mtl;

    .line 110
    .line 111
    if-eqz v3, :cond_3

    .line 112
    .line 113
    const v3, -0xd2ce866

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 117
    .line 118
    .line 119
    :goto_1
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 120
    .line 121
    .line 122
    move-object v15, v1

    .line 123
    goto :goto_2

    .line 124
    :cond_3
    const v3, -0xd2bf5d9

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 128
    .line 129
    .line 130
    invoke-static {v1, v2}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    goto :goto_1

    .line 135
    :goto_2
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    or-int/2addr v1, v3

    .line 147
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    if-nez v1, :cond_4

    .line 152
    .line 153
    if-ne v3, v6, :cond_5

    .line 154
    .line 155
    :cond_4
    new-instance v3, La/pwy;

    .line 156
    .line 157
    const/4 v1, 0x3

    .line 158
    invoke-direct {v3, v7, v8, v1}, La/pwy;-><init>(La/xeb;Lkotlin/jvm/functions/Function1;B)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_5
    move-object/from16 v21, v3

    .line 165
    .line 166
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 167
    .line 168
    const/16 v23, 0x0

    .line 169
    .line 170
    const/16 v24, 0x1f8

    .line 171
    .line 172
    iget-object v14, v0, La/axy;->d:La/xcz;

    .line 173
    .line 174
    const/16 v16, 0x0

    .line 175
    .line 176
    const/16 v17, 0x0

    .line 177
    .line 178
    const/16 v18, 0x0

    .line 179
    .line 180
    const/16 v19, 0x0

    .line 181
    .line 182
    const/16 v20, 0x0

    .line 183
    .line 184
    move-object/from16 v22, v2

    .line 185
    .line 186
    invoke-static/range {v13 .. v24}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    move-object/from16 v22, v2

    .line 191
    .line 192
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 193
    .line 194
    .line 195
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_0
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, La/ir8;

    .line 201
    .line 202
    move-object/from16 v3, p2

    .line 203
    .line 204
    check-cast v3, La/fet;

    .line 205
    .line 206
    move-object/from16 v13, p3

    .line 207
    .line 208
    check-cast v13, Ljava/lang/Integer;

    .line 209
    .line 210
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v13

    .line 214
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    and-int/lit8 v1, v13, 0x11

    .line 218
    .line 219
    if-eq v1, v10, :cond_7

    .line 220
    .line 221
    move v1, v12

    .line 222
    goto :goto_4

    .line 223
    :cond_7
    move v1, v11

    .line 224
    :goto_4
    and-int/lit8 v10, v13, 0x1

    .line 225
    .line 226
    invoke-virtual {v3, v10, v1}, La/fet;->U(IZ)Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_d

    .line 231
    .line 232
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 233
    .line 234
    invoke-interface {v9, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v3, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v9

    .line 242
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    if-nez v9, :cond_8

    .line 247
    .line 248
    if-ne v10, v6, :cond_9

    .line 249
    .line 250
    :cond_8
    new-instance v10, La/ia30;

    .line 251
    .line 252
    invoke-direct {v10, v8, v4}, La/ia30;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v3, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    :cond_9
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 259
    .line 260
    invoke-static {v11, v3, v1, v10}, La/pzw;->A(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)La/mm40;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    const v1, -0x24cebdd3

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 268
    .line 269
    .line 270
    invoke-static {v3}, La/xfn;->a(La/fet;)La/wfn;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    iget v1, v1, La/wfn;->d:F

    .line 275
    .line 276
    invoke-static {v3}, La/xfn;->a(La/fet;)La/wfn;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    iget v4, v4, La/wfn;->d:F

    .line 281
    .line 282
    sget-object v9, La/qmk;->a:La/zcl;

    .line 283
    .line 284
    new-instance v9, La/lh80;

    .line 285
    .line 286
    invoke-direct {v9, v1, v5, v4, v2}, La/lh80;-><init>(FFFF)V

    .line 287
    .line 288
    .line 289
    iget-object v1, v7, La/xeb;->b:La/mtl;

    .line 290
    .line 291
    if-eqz v1, :cond_a

    .line 292
    .line 293
    const v1, 0x7b637fc5

    .line 294
    .line 295
    .line 296
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 297
    .line 298
    .line 299
    :goto_5
    invoke-virtual {v3, v11}, La/fet;->r(Z)V

    .line 300
    .line 301
    .line 302
    move-object v15, v9

    .line 303
    goto :goto_6

    .line 304
    :cond_a
    const v1, 0x7b647252

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 308
    .line 309
    .line 310
    invoke-static {v9, v3}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    goto :goto_5

    .line 315
    :goto_6
    invoke-virtual {v3, v11}, La/fet;->r(Z)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    invoke-virtual {v3, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    or-int/2addr v1, v2

    .line 327
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    if-nez v1, :cond_b

    .line 332
    .line 333
    if-ne v2, v6, :cond_c

    .line 334
    .line 335
    :cond_b
    new-instance v2, La/pwy;

    .line 336
    .line 337
    const/4 v1, 0x2

    .line 338
    invoke-direct {v2, v7, v8, v1}, La/pwy;-><init>(La/xeb;Lkotlin/jvm/functions/Function1;B)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    :cond_c
    move-object/from16 v21, v2

    .line 345
    .line 346
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 347
    .line 348
    const/16 v23, 0x0

    .line 349
    .line 350
    const/16 v24, 0x1f8

    .line 351
    .line 352
    iget-object v14, v0, La/axy;->d:La/xcz;

    .line 353
    .line 354
    const/16 v16, 0x0

    .line 355
    .line 356
    const/16 v17, 0x0

    .line 357
    .line 358
    const/16 v18, 0x0

    .line 359
    .line 360
    const/16 v19, 0x0

    .line 361
    .line 362
    const/16 v20, 0x0

    .line 363
    .line 364
    move-object/from16 v22, v3

    .line 365
    .line 366
    invoke-static/range {v13 .. v24}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 367
    .line 368
    .line 369
    goto :goto_7

    .line 370
    :cond_d
    move-object/from16 v22, v3

    .line 371
    .line 372
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 373
    .line 374
    .line 375
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 376
    .line 377
    return-object v0

    .line 378
    :pswitch_1
    move-object/from16 v1, p1

    .line 379
    .line 380
    check-cast v1, La/ir8;

    .line 381
    .line 382
    move-object/from16 v2, p2

    .line 383
    .line 384
    check-cast v2, La/fet;

    .line 385
    .line 386
    move-object/from16 v4, p3

    .line 387
    .line 388
    check-cast v4, Ljava/lang/Integer;

    .line 389
    .line 390
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 391
    .line 392
    .line 393
    move-result v4

    .line 394
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    and-int/lit8 v1, v4, 0x11

    .line 398
    .line 399
    if-eq v1, v10, :cond_e

    .line 400
    .line 401
    move v1, v12

    .line 402
    goto :goto_8

    .line 403
    :cond_e
    move v1, v11

    .line 404
    :goto_8
    and-int/2addr v4, v12

    .line 405
    invoke-virtual {v2, v4, v1}, La/fet;->U(IZ)Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-eqz v1, :cond_14

    .line 410
    .line 411
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 412
    .line 413
    invoke-interface {v9, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v4

    .line 421
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v9

    .line 425
    if-nez v4, :cond_f

    .line 426
    .line 427
    if-ne v9, v6, :cond_10

    .line 428
    .line 429
    :cond_f
    new-instance v9, La/ia30;

    .line 430
    .line 431
    invoke-direct {v9, v8, v10}, La/ia30;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    :cond_10
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 438
    .line 439
    invoke-static {v11, v2, v1, v9}, La/pzw;->A(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)La/mm40;

    .line 440
    .line 441
    .line 442
    move-result-object v13

    .line 443
    const v1, -0x21a7198b

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 447
    .line 448
    .line 449
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    iget v1, v1, La/wfn;->d:F

    .line 454
    .line 455
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    iget v4, v4, La/wfn;->d:F

    .line 460
    .line 461
    sget-object v9, La/qmk;->a:La/zcl;

    .line 462
    .line 463
    new-instance v9, La/lh80;

    .line 464
    .line 465
    invoke-direct {v9, v1, v5, v4, v3}, La/lh80;-><init>(FFFF)V

    .line 466
    .line 467
    .line 468
    iget-object v1, v7, La/xeb;->b:La/mtl;

    .line 469
    .line 470
    if-eqz v1, :cond_11

    .line 471
    .line 472
    const v1, -0x6658fcd7

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 476
    .line 477
    .line 478
    :goto_9
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 479
    .line 480
    .line 481
    move-object v15, v9

    .line 482
    goto :goto_a

    .line 483
    :cond_11
    const v1, -0x66580a4a

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 487
    .line 488
    .line 489
    invoke-static {v9, v2}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 490
    .line 491
    .line 492
    move-result-object v9

    .line 493
    goto :goto_9

    .line 494
    :goto_a
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    or-int/2addr v1, v3

    .line 506
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    if-nez v1, :cond_12

    .line 511
    .line 512
    if-ne v3, v6, :cond_13

    .line 513
    .line 514
    :cond_12
    new-instance v3, La/pwy;

    .line 515
    .line 516
    invoke-direct {v3, v7, v8, v12}, La/pwy;-><init>(La/xeb;Lkotlin/jvm/functions/Function1;B)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    :cond_13
    move-object/from16 v21, v3

    .line 523
    .line 524
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 525
    .line 526
    const/16 v23, 0x0

    .line 527
    .line 528
    const/16 v24, 0x1f8

    .line 529
    .line 530
    iget-object v14, v0, La/axy;->d:La/xcz;

    .line 531
    .line 532
    const/16 v16, 0x0

    .line 533
    .line 534
    const/16 v17, 0x0

    .line 535
    .line 536
    const/16 v18, 0x0

    .line 537
    .line 538
    const/16 v19, 0x0

    .line 539
    .line 540
    const/16 v20, 0x0

    .line 541
    .line 542
    move-object/from16 v22, v2

    .line 543
    .line 544
    invoke-static/range {v13 .. v24}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 545
    .line 546
    .line 547
    goto :goto_b

    .line 548
    :cond_14
    move-object/from16 v22, v2

    .line 549
    .line 550
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 551
    .line 552
    .line 553
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 554
    .line 555
    return-object v0

    .line 556
    :pswitch_2
    move-object/from16 v1, p1

    .line 557
    .line 558
    check-cast v1, La/ir8;

    .line 559
    .line 560
    move-object/from16 v3, p2

    .line 561
    .line 562
    check-cast v3, La/fet;

    .line 563
    .line 564
    move-object/from16 v4, p3

    .line 565
    .line 566
    check-cast v4, Ljava/lang/Integer;

    .line 567
    .line 568
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 569
    .line 570
    .line 571
    move-result v4

    .line 572
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    and-int/lit8 v1, v4, 0x11

    .line 576
    .line 577
    if-eq v1, v10, :cond_15

    .line 578
    .line 579
    move v1, v12

    .line 580
    goto :goto_c

    .line 581
    :cond_15
    move v1, v11

    .line 582
    :goto_c
    and-int/2addr v4, v12

    .line 583
    invoke-virtual {v3, v4, v1}, La/fet;->U(IZ)Z

    .line 584
    .line 585
    .line 586
    move-result v1

    .line 587
    if-eqz v1, :cond_1b

    .line 588
    .line 589
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 590
    .line 591
    invoke-interface {v9, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    invoke-virtual {v3, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v9

    .line 603
    if-nez v4, :cond_16

    .line 604
    .line 605
    if-ne v9, v6, :cond_17

    .line 606
    .line 607
    :cond_16
    new-instance v9, La/u9x;

    .line 608
    .line 609
    const/16 v4, 0x1d

    .line 610
    .line 611
    invoke-direct {v9, v8, v4}, La/u9x;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v3, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    :cond_17
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 618
    .line 619
    invoke-static {v11, v3, v1, v9}, La/pzw;->A(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)La/mm40;

    .line 620
    .line 621
    .line 622
    move-result-object v13

    .line 623
    const v1, -0x54796896

    .line 624
    .line 625
    .line 626
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 627
    .line 628
    .line 629
    invoke-static {v3}, La/xfn;->a(La/fet;)La/wfn;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    iget v1, v1, La/wfn;->d:F

    .line 634
    .line 635
    invoke-static {v3}, La/xfn;->a(La/fet;)La/wfn;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    iget v4, v4, La/wfn;->d:F

    .line 640
    .line 641
    sget-object v9, La/qmk;->a:La/zcl;

    .line 642
    .line 643
    new-instance v9, La/lh80;

    .line 644
    .line 645
    invoke-direct {v9, v1, v5, v4, v2}, La/lh80;-><init>(FFFF)V

    .line 646
    .line 647
    .line 648
    iget-object v1, v7, La/xeb;->b:La/mtl;

    .line 649
    .line 650
    if-eqz v1, :cond_18

    .line 651
    .line 652
    const v1, -0x45abb358

    .line 653
    .line 654
    .line 655
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 656
    .line 657
    .line 658
    :goto_d
    invoke-virtual {v3, v11}, La/fet;->r(Z)V

    .line 659
    .line 660
    .line 661
    move-object v15, v9

    .line 662
    goto :goto_e

    .line 663
    :cond_18
    const v1, -0x45aac0cb

    .line 664
    .line 665
    .line 666
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 667
    .line 668
    .line 669
    invoke-static {v9, v3}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 670
    .line 671
    .line 672
    move-result-object v9

    .line 673
    goto :goto_d

    .line 674
    :goto_e
    invoke-virtual {v3, v11}, La/fet;->r(Z)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v3, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    move-result v1

    .line 681
    invoke-virtual {v3, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v2

    .line 685
    or-int/2addr v1, v2

    .line 686
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    if-nez v1, :cond_19

    .line 691
    .line 692
    if-ne v2, v6, :cond_1a

    .line 693
    .line 694
    :cond_19
    new-instance v2, La/pwy;

    .line 695
    .line 696
    invoke-direct {v2, v7, v8, v11}, La/pwy;-><init>(La/xeb;Lkotlin/jvm/functions/Function1;B)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v3, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    :cond_1a
    move-object/from16 v21, v2

    .line 703
    .line 704
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 705
    .line 706
    const/16 v23, 0x0

    .line 707
    .line 708
    const/16 v24, 0x1f8

    .line 709
    .line 710
    iget-object v14, v0, La/axy;->d:La/xcz;

    .line 711
    .line 712
    const/16 v16, 0x0

    .line 713
    .line 714
    const/16 v17, 0x0

    .line 715
    .line 716
    const/16 v18, 0x0

    .line 717
    .line 718
    const/16 v19, 0x0

    .line 719
    .line 720
    const/16 v20, 0x0

    .line 721
    .line 722
    move-object/from16 v22, v3

    .line 723
    .line 724
    invoke-static/range {v13 .. v24}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 725
    .line 726
    .line 727
    goto :goto_f

    .line 728
    :cond_1b
    move-object/from16 v22, v3

    .line 729
    .line 730
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 731
    .line 732
    .line 733
    :goto_f
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
