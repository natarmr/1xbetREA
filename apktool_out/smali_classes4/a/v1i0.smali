.class public final synthetic La/v1i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/v1i0;->a:B

    iput-object p1, p0, La/v1i0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/v1i0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/v1i0;->d:Ljava/lang/Object;

    iput-object p4, p0, La/v1i0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/v1i0;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/16 v4, 0xb

    .line 8
    .line 9
    const/16 v5, 0x12

    .line 10
    .line 11
    const/4 v6, 0x4

    .line 12
    const/16 v7, 0x10

    .line 13
    .line 14
    const/4 v8, 0x2

    .line 15
    const/4 v9, 0x0

    .line 16
    sget-object v11, La/ukd;->a:La/cl5;

    .line 17
    .line 18
    iget-object v12, v0, La/v1i0;->e:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v13, v0, La/v1i0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v14, v0, La/v1i0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v0, v0, La/v1i0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    check-cast v0, La/qdz;

    .line 30
    .line 31
    move-object/from16 v20, v14

    .line 32
    .line 33
    check-cast v20, Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 36
    .line 37
    check-cast v12, La/d930;

    .line 38
    .line 39
    move-object/from16 v1, p1

    .line 40
    .line 41
    check-cast v1, La/p6t0;

    .line 42
    .line 43
    move-object/from16 v2, p2

    .line 44
    .line 45
    check-cast v2, La/fet;

    .line 46
    .line 47
    move-object/from16 v3, p3

    .line 48
    .line 49
    check-cast v3, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    and-int/lit8 v14, v3, 0x6

    .line 59
    .line 60
    if-nez v14, :cond_1

    .line 61
    .line 62
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v14

    .line 66
    if-eqz v14, :cond_0

    .line 67
    .line 68
    move v14, v6

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move v14, v8

    .line 71
    :goto_0
    or-int/2addr v3, v14

    .line 72
    :cond_1
    and-int/lit8 v14, v3, 0x13

    .line 73
    .line 74
    if-eq v14, v5, :cond_2

    .line 75
    .line 76
    const/4 v5, 0x1

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    move v5, v9

    .line 79
    :goto_1
    and-int/lit8 v14, v3, 0x1

    .line 80
    .line 81
    invoke-virtual {v2, v14, v5}, La/fet;->U(IZ)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_12

    .line 86
    .line 87
    instance-of v5, v1, La/epu0;

    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    sget-object v21, La/jm40;->b:La/jm40;

    .line 91
    .line 92
    if-eqz v5, :cond_3

    .line 93
    .line 94
    const v3, -0x31e0b954

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 98
    .line 99
    .line 100
    check-cast v1, La/epu0;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    sget-object v3, La/qmk;->a:La/zcl;

    .line 106
    .line 107
    const/high16 v25, 0x41000000    # 8.0f

    .line 108
    .line 109
    const/16 v26, 0x7

    .line 110
    .line 111
    const/16 v22, 0x0

    .line 112
    .line 113
    const/16 v23, 0x0

    .line 114
    .line 115
    const/16 v24, 0x0

    .line 116
    .line 117
    invoke-static/range {v21 .. v26}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 118
    .line 119
    .line 120
    move-result-object v15

    .line 121
    iget-object v3, v1, La/epu0;->b:La/vb90;

    .line 122
    .line 123
    iget-object v1, v1, La/epu0;->a:Ljava/lang/String;

    .line 124
    .line 125
    new-instance v4, La/b4u0;

    .line 126
    .line 127
    invoke-direct {v4, v7}, La/b4u0;-><init>(B)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1, v4, v2, v9}, La/qdz;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/fet;I)La/xcz;

    .line 131
    .line 132
    .line 133
    move-result-object v18

    .line 134
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iget v0, v0, La/wfn;->c:F

    .line 139
    .line 140
    invoke-static {v0, v14, v8}, La/s5x0;->t(FFI)La/lh80;

    .line 141
    .line 142
    .line 143
    move-result-object v19

    .line 144
    const/16 v22, 0x180

    .line 145
    .line 146
    const/16 v23, 0x0

    .line 147
    .line 148
    const/16 v17, 0x0

    .line 149
    .line 150
    move-object/from16 v21, v2

    .line 151
    .line 152
    move-object/from16 v16, v3

    .line 153
    .line 154
    invoke-static/range {v15 .. v23}, La/zvw;->k(La/mm40;La/vb90;ZLa/xcz;La/lh80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 155
    .line 156
    .line 157
    move-object/from16 v0, v21

    .line 158
    .line 159
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_4

    .line 163
    .line 164
    :cond_3
    move-object v0, v2

    .line 165
    move-object/from16 v2, v21

    .line 166
    .line 167
    instance-of v5, v1, La/qpu0;

    .line 168
    .line 169
    if-eqz v5, :cond_7

    .line 170
    .line 171
    const v5, -0x31dba8a8

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v5}, La/fet;->e0(I)V

    .line 175
    .line 176
    .line 177
    invoke-static {v0}, La/xfn;->a(La/fet;)La/wfn;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    iget v5, v5, La/wfn;->e:F

    .line 182
    .line 183
    invoke-static {v2, v5, v14, v8}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    move-object v5, v1

    .line 188
    check-cast v5, La/qpu0;

    .line 189
    .line 190
    invoke-virtual {v0, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    and-int/lit8 v3, v3, 0xe

    .line 195
    .line 196
    if-ne v3, v6, :cond_4

    .line 197
    .line 198
    const/4 v10, 0x1

    .line 199
    goto :goto_2

    .line 200
    :cond_4
    move v10, v9

    .line 201
    :goto_2
    or-int v3, v7, v10

    .line 202
    .line 203
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    if-nez v3, :cond_5

    .line 208
    .line 209
    if-ne v6, v11, :cond_6

    .line 210
    .line 211
    :cond_5
    new-instance v6, La/vwj;

    .line 212
    .line 213
    invoke-direct {v6, v13, v1, v4}, La/vwj;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_6
    move-object/from16 v25, v6

    .line 220
    .line 221
    check-cast v25, Lkotlin/jvm/functions/Function0;

    .line 222
    .line 223
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    const/high16 v1, 0x3f800000    # 1.0f

    .line 227
    .line 228
    invoke-static {v2, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 229
    .line 230
    .line 231
    move-result-object v21

    .line 232
    iget-object v1, v5, La/qpu0;->b:La/jjm;

    .line 233
    .line 234
    sget-object v23, La/kjm;->a:La/kjm;

    .line 235
    .line 236
    const/16 v28, 0x180

    .line 237
    .line 238
    const/16 v29, 0x28

    .line 239
    .line 240
    const/16 v24, 0x0

    .line 241
    .line 242
    const/16 v26, 0x0

    .line 243
    .line 244
    move-object/from16 v27, v0

    .line 245
    .line 246
    move-object/from16 v22, v1

    .line 247
    .line 248
    invoke-static/range {v21 .. v29}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_4

    .line 255
    .line 256
    :cond_7
    instance-of v4, v1, La/vpu0;

    .line 257
    .line 258
    if-eqz v4, :cond_b

    .line 259
    .line 260
    const v4, -0x31d46980

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0, v4}, La/fet;->e0(I)V

    .line 264
    .line 265
    .line 266
    move-object v4, v1

    .line 267
    check-cast v4, La/vpu0;

    .line 268
    .line 269
    invoke-virtual {v0, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    and-int/lit8 v3, v3, 0xe

    .line 274
    .line 275
    if-ne v3, v6, :cond_8

    .line 276
    .line 277
    const/4 v10, 0x1

    .line 278
    goto :goto_3

    .line 279
    :cond_8
    move v10, v9

    .line 280
    :goto_3
    or-int v3, v5, v10

    .line 281
    .line 282
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    if-nez v3, :cond_9

    .line 287
    .line 288
    if-ne v5, v11, :cond_a

    .line 289
    .line 290
    :cond_9
    new-instance v5, La/vwj;

    .line 291
    .line 292
    const/16 v3, 0xc

    .line 293
    .line 294
    invoke-direct {v5, v13, v1, v3}, La/vwj;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    :cond_a
    move-object/from16 v16, v5

    .line 301
    .line 302
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 303
    .line 304
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-static {v0}, La/xfn;->a(La/fet;)La/wfn;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    iget v1, v1, La/wfn;->e:F

    .line 312
    .line 313
    invoke-static {v0}, La/xfn;->a(La/fet;)La/wfn;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    iget v3, v3, La/wfn;->e:F

    .line 318
    .line 319
    sget-object v5, La/qmk;->a:La/zcl;

    .line 320
    .line 321
    const/high16 v25, 0x40800000    # 4.0f

    .line 322
    .line 323
    const/16 v26, 0x2

    .line 324
    .line 325
    const/16 v23, 0x0

    .line 326
    .line 327
    move/from16 v22, v1

    .line 328
    .line 329
    move-object/from16 v21, v2

    .line 330
    .line 331
    move/from16 v24, v3

    .line 332
    .line 333
    invoke-static/range {v21 .. v26}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 334
    .line 335
    .line 336
    move-result-object v14

    .line 337
    iget-object v15, v4, La/vpu0;->c:La/h5n;

    .line 338
    .line 339
    const/16 v18, 0x0

    .line 340
    .line 341
    const/16 v19, 0x0

    .line 342
    .line 343
    move-object/from16 v17, v0

    .line 344
    .line 345
    invoke-static/range {v14 .. v19}, La/tlb;->o(La/mm40;La/h5n;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 349
    .line 350
    .line 351
    goto/16 :goto_4

    .line 352
    .line 353
    :cond_b
    move-object/from16 v21, v2

    .line 354
    .line 355
    instance-of v2, v1, La/jpu0;

    .line 356
    .line 357
    if-eqz v2, :cond_e

    .line 358
    .line 359
    const v2, -0x31ce297d

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 363
    .line 364
    .line 365
    check-cast v1, La/jpu0;

    .line 366
    .line 367
    invoke-virtual {v0, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    if-nez v2, :cond_c

    .line 376
    .line 377
    if-ne v4, v11, :cond_d

    .line 378
    .line 379
    :cond_c
    new-instance v4, La/sbt0;

    .line 380
    .line 381
    const/16 v2, 0x14

    .line 382
    .line 383
    invoke-direct {v4, v13, v2}, La/sbt0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    :cond_d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 390
    .line 391
    shl-int/lit8 v2, v3, 0x3

    .line 392
    .line 393
    and-int/lit8 v2, v2, 0x70

    .line 394
    .line 395
    or-int/lit8 v2, v2, 0x6

    .line 396
    .line 397
    invoke-static {v1, v12, v4, v0, v2}, La/dem0;->j(La/jpu0;La/d930;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 401
    .line 402
    .line 403
    goto :goto_4

    .line 404
    :cond_e
    instance-of v2, v1, La/fpu0;

    .line 405
    .line 406
    if-eqz v2, :cond_11

    .line 407
    .line 408
    const v2, -0x31c66ce1

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 412
    .line 413
    .line 414
    invoke-static {v0}, La/xfn;->a(La/fet;)La/wfn;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    iget v2, v2, La/wfn;->c:F

    .line 419
    .line 420
    sget-object v3, La/qmk;->a:La/zcl;

    .line 421
    .line 422
    const/high16 v25, 0x41000000    # 8.0f

    .line 423
    .line 424
    const/16 v26, 0x2

    .line 425
    .line 426
    const/16 v23, 0x0

    .line 427
    .line 428
    move/from16 v24, v2

    .line 429
    .line 430
    move/from16 v22, v2

    .line 431
    .line 432
    invoke-static/range {v21 .. v26}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    check-cast v1, La/fpu0;

    .line 437
    .line 438
    iget-object v1, v1, La/fpu0;->b:La/vrm;

    .line 439
    .line 440
    invoke-virtual {v0, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    if-nez v3, :cond_f

    .line 449
    .line 450
    if-ne v4, v11, :cond_10

    .line 451
    .line 452
    :cond_f
    new-instance v4, La/sbt0;

    .line 453
    .line 454
    const/16 v3, 0x15

    .line 455
    .line 456
    invoke-direct {v4, v13, v3}, La/sbt0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    :cond_10
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 463
    .line 464
    invoke-static {v2, v1, v4, v0, v9}, La/ccq0;->s(La/mm40;La/vrm;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 468
    .line 469
    .line 470
    goto :goto_4

    .line 471
    :cond_11
    const v1, -0x31bce762

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 478
    .line 479
    .line 480
    goto :goto_4

    .line 481
    :cond_12
    move-object v0, v2

    .line 482
    invoke-virtual {v0}, La/fet;->X()V

    .line 483
    .line 484
    .line 485
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 486
    .line 487
    return-object v0

    .line 488
    :pswitch_0
    move-object v6, v0

    .line 489
    check-cast v6, La/skk0;

    .line 490
    .line 491
    move-object v5, v14

    .line 492
    check-cast v5, La/djz;

    .line 493
    .line 494
    check-cast v13, La/a8q0;

    .line 495
    .line 496
    check-cast v12, La/qe60;

    .line 497
    .line 498
    move-object/from16 v0, p1

    .line 499
    .line 500
    check-cast v0, La/mm40;

    .line 501
    .line 502
    move-object/from16 v8, p2

    .line 503
    .line 504
    check-cast v8, La/fet;

    .line 505
    .line 506
    move-object/from16 v1, p3

    .line 507
    .line 508
    check-cast v1, Ljava/lang/Integer;

    .line 509
    .line 510
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    const v1, -0x5097aed    # -6.4000205E35f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 517
    .line 518
    .line 519
    sget-object v1, La/bmd;->y:La/zfn;

    .line 520
    .line 521
    invoke-virtual {v8, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    check-cast v1, Ljava/lang/Boolean;

    .line 526
    .line 527
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    invoke-virtual {v8, v1}, La/fet;->h(Z)Z

    .line 532
    .line 533
    .line 534
    move-result v7

    .line 535
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v14

    .line 539
    if-nez v7, :cond_13

    .line 540
    .line 541
    if-ne v14, v11, :cond_14

    .line 542
    .line 543
    :cond_13
    new-instance v14, La/fwf;

    .line 544
    .line 545
    invoke-direct {v14, v1}, La/fwf;-><init>(Z)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v8, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    :cond_14
    check-cast v14, La/fwf;

    .line 552
    .line 553
    const/4 v1, 0x1

    .line 554
    iget-wide v9, v6, La/skk0;->a:J

    .line 555
    .line 556
    const-wide/16 v16, 0x10

    .line 557
    .line 558
    cmp-long v7, v9, v16

    .line 559
    .line 560
    if-nez v7, :cond_15

    .line 561
    .line 562
    const/4 v10, 0x0

    .line 563
    goto :goto_5

    .line 564
    :cond_15
    move v10, v1

    .line 565
    :goto_5
    sget-object v1, La/bmd;->u:La/zfn;

    .line 566
    .line 567
    invoke-virtual {v8, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    check-cast v1, La/rhv0;

    .line 572
    .line 573
    check-cast v1, La/yez;

    .line 574
    .line 575
    invoke-virtual {v1}, La/yez;->c()Z

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    if-eqz v1, :cond_1a

    .line 580
    .line 581
    invoke-virtual {v5}, La/djz;->b()Z

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    if-eqz v1, :cond_1a

    .line 586
    .line 587
    iget-wide v3, v13, La/a8q0;->b:J

    .line 588
    .line 589
    invoke-static {v3, v4}, La/o9q0;->c(J)Z

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    if-eqz v1, :cond_1a

    .line 594
    .line 595
    if-eqz v10, :cond_1a

    .line 596
    .line 597
    const v1, -0x2a2b68da

    .line 598
    .line 599
    .line 600
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 601
    .line 602
    .line 603
    iget-object v1, v13, La/a8q0;->a:La/j83;

    .line 604
    .line 605
    iget-wide v2, v13, La/a8q0;->b:J

    .line 606
    .line 607
    new-instance v4, La/o9q0;

    .line 608
    .line 609
    invoke-direct {v4, v2, v3}, La/o9q0;-><init>(J)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v8, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    if-nez v2, :cond_16

    .line 621
    .line 622
    if-ne v3, v11, :cond_17

    .line 623
    .line 624
    :cond_16
    new-instance v3, La/z2n0;

    .line 625
    .line 626
    const/16 v2, 0xb

    .line 627
    .line 628
    const/4 v9, 0x0

    .line 629
    invoke-direct {v3, v14, v9, v2}, La/z2n0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v8, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    :cond_17
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 636
    .line 637
    invoke-static {v1, v4, v3, v8}, La/m0x0;->v(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v8, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v1

    .line 644
    invoke-virtual {v8, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    or-int/2addr v1, v2

    .line 649
    invoke-virtual {v8, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v2

    .line 653
    or-int/2addr v1, v2

    .line 654
    invoke-virtual {v8, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 655
    .line 656
    .line 657
    move-result v2

    .line 658
    or-int/2addr v1, v2

    .line 659
    invoke-virtual {v8, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v2

    .line 663
    or-int/2addr v1, v2

    .line 664
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    if-nez v1, :cond_18

    .line 669
    .line 670
    if-ne v2, v11, :cond_19

    .line 671
    .line 672
    :cond_18
    new-instance v1, La/q6q0;

    .line 673
    .line 674
    const/4 v7, 0x0

    .line 675
    move-object v3, v12

    .line 676
    move-object v4, v13

    .line 677
    move-object v2, v14

    .line 678
    invoke-direct/range {v1 .. v7}, La/q6q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 682
    .line 683
    .line 684
    move-object v2, v1

    .line 685
    :cond_19
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 686
    .line 687
    invoke-static {v0, v2}, La/rq8;->M(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    const/4 v15, 0x0

    .line 692
    invoke-virtual {v8, v15}, La/fet;->r(Z)V

    .line 693
    .line 694
    .line 695
    goto :goto_6

    .line 696
    :cond_1a
    const/4 v15, 0x0

    .line 697
    const v0, -0x2a0caad9

    .line 698
    .line 699
    .line 700
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v8, v15}, La/fet;->r(Z)V

    .line 704
    .line 705
    .line 706
    :goto_6
    invoke-virtual {v8, v15}, La/fet;->r(Z)V

    .line 707
    .line 708
    .line 709
    return-object v2

    .line 710
    :pswitch_1
    const/4 v1, 0x1

    .line 711
    check-cast v0, La/f1l0;

    .line 712
    .line 713
    check-cast v14, La/w6k;

    .line 714
    .line 715
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 716
    .line 717
    check-cast v12, La/pz40;

    .line 718
    .line 719
    move-object/from16 v3, p1

    .line 720
    .line 721
    check-cast v3, La/g9z;

    .line 722
    .line 723
    move-object/from16 v4, p2

    .line 724
    .line 725
    check-cast v4, La/fet;

    .line 726
    .line 727
    move-object/from16 v7, p3

    .line 728
    .line 729
    check-cast v7, Ljava/lang/Integer;

    .line 730
    .line 731
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 732
    .line 733
    .line 734
    move-result v7

    .line 735
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    and-int/lit8 v10, v7, 0x6

    .line 739
    .line 740
    if-nez v10, :cond_1c

    .line 741
    .line 742
    invoke-virtual {v4, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    move-result v10

    .line 746
    if-eqz v10, :cond_1b

    .line 747
    .line 748
    goto :goto_7

    .line 749
    :cond_1b
    move v6, v8

    .line 750
    :goto_7
    or-int/2addr v7, v6

    .line 751
    :cond_1c
    and-int/lit8 v6, v7, 0x13

    .line 752
    .line 753
    if-eq v6, v5, :cond_1d

    .line 754
    .line 755
    move v5, v1

    .line 756
    goto :goto_8

    .line 757
    :cond_1d
    const/4 v5, 0x0

    .line 758
    :goto_8
    and-int/2addr v1, v7

    .line 759
    invoke-virtual {v4, v1, v5}, La/fet;->U(IZ)Z

    .line 760
    .line 761
    .line 762
    move-result v1

    .line 763
    if-eqz v1, :cond_21

    .line 764
    .line 765
    const/4 v1, 0x7

    .line 766
    const/4 v9, 0x0

    .line 767
    invoke-static {v3, v2, v9, v1}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    instance-of v3, v0, La/d1l0;

    .line 772
    .line 773
    if-eqz v3, :cond_20

    .line 774
    .line 775
    const v3, 0x1d5df9c1

    .line 776
    .line 777
    .line 778
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v4, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v3

    .line 785
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v5

    .line 789
    if-nez v3, :cond_1e

    .line 790
    .line 791
    if-ne v5, v11, :cond_1f

    .line 792
    .line 793
    :cond_1e
    new-instance v5, La/a1i;

    .line 794
    .line 795
    invoke-direct {v5, v12, v14}, La/a1i;-><init>(La/pz40;La/w6k;)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 799
    .line 800
    .line 801
    :cond_1f
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 802
    .line 803
    invoke-static {v2, v5}, La/fre0;->Y(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 804
    .line 805
    .line 806
    move-result-object v2

    .line 807
    const/4 v15, 0x0

    .line 808
    invoke-virtual {v4, v15}, La/fet;->r(Z)V

    .line 809
    .line 810
    .line 811
    goto :goto_9

    .line 812
    :cond_20
    const/4 v15, 0x0

    .line 813
    const v3, 0x1d615395

    .line 814
    .line 815
    .line 816
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v4, v15}, La/fet;->r(Z)V

    .line 820
    .line 821
    .line 822
    :goto_9
    invoke-interface {v1, v2}, La/mm40;->e(La/mm40;)La/mm40;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    invoke-static {v1, v0, v13, v4, v15}, La/o2e;->U(La/mm40;La/f1l0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 827
    .line 828
    .line 829
    goto :goto_a

    .line 830
    :cond_21
    invoke-virtual {v4}, La/fet;->X()V

    .line 831
    .line 832
    .line 833
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 834
    .line 835
    return-object v0

    .line 836
    :pswitch_2
    move v15, v9

    .line 837
    const/4 v1, 0x1

    .line 838
    move-object v3, v0

    .line 839
    check-cast v3, La/wul;

    .line 840
    .line 841
    move-object v4, v14

    .line 842
    check-cast v4, La/wul;

    .line 843
    .line 844
    check-cast v13, La/y3i0;

    .line 845
    .line 846
    check-cast v12, La/gfj;

    .line 847
    .line 848
    move-object/from16 v0, p1

    .line 849
    .line 850
    check-cast v0, La/ir8;

    .line 851
    .line 852
    move-object/from16 v9, p2

    .line 853
    .line 854
    check-cast v9, La/fet;

    .line 855
    .line 856
    move-object/from16 v2, p3

    .line 857
    .line 858
    check-cast v2, Ljava/lang/Integer;

    .line 859
    .line 860
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 861
    .line 862
    .line 863
    move-result v2

    .line 864
    sget-object v5, La/y3i0;->n2:La/lme0;

    .line 865
    .line 866
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    and-int/lit8 v0, v2, 0x11

    .line 870
    .line 871
    if-eq v0, v7, :cond_22

    .line 872
    .line 873
    move v15, v1

    .line 874
    :cond_22
    and-int/lit8 v0, v2, 0x1

    .line 875
    .line 876
    invoke-virtual {v9, v0, v15}, La/fet;->U(IZ)Z

    .line 877
    .line 878
    .line 879
    move-result v0

    .line 880
    if-eqz v0, :cond_27

    .line 881
    .line 882
    sget-object v17, La/qqm;->b:La/qqm;

    .line 883
    .line 884
    const/16 v22, 0x30

    .line 885
    .line 886
    const/16 v23, 0xd

    .line 887
    .line 888
    const/16 v16, 0x0

    .line 889
    .line 890
    const/16 v18, 0x0

    .line 891
    .line 892
    const-wide/16 v19, 0x0

    .line 893
    .line 894
    move-object/from16 v21, v9

    .line 895
    .line 896
    invoke-static/range {v16 .. v23}, La/vtb;->t(La/mm40;La/qqm;La/bgi0;JLa/fet;II)V

    .line 897
    .line 898
    .line 899
    sget-object v2, La/vul;->a:La/vul;

    .line 900
    .line 901
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 902
    .line 903
    .line 904
    move-result v0

    .line 905
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v1

    .line 909
    if-nez v0, :cond_23

    .line 910
    .line 911
    if-ne v1, v11, :cond_24

    .line 912
    .line 913
    :cond_23
    new-instance v1, La/w3i0;

    .line 914
    .line 915
    invoke-direct {v1, v13, v8}, La/w3i0;-><init>(La/y3i0;B)V

    .line 916
    .line 917
    .line 918
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 919
    .line 920
    .line 921
    :cond_24
    move-object v7, v1

    .line 922
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 923
    .line 924
    invoke-virtual {v9, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    move-result v0

    .line 928
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 929
    .line 930
    .line 931
    move-result v1

    .line 932
    or-int/2addr v0, v1

    .line 933
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    if-nez v0, :cond_25

    .line 938
    .line 939
    if-ne v1, v11, :cond_26

    .line 940
    .line 941
    :cond_25
    new-instance v1, La/x6h0;

    .line 942
    .line 943
    const/16 v0, 0xa

    .line 944
    .line 945
    invoke-direct {v1, v12, v13, v0}, La/x6h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 949
    .line 950
    .line 951
    :cond_26
    move-object v8, v1

    .line 952
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 953
    .line 954
    const/16 v10, 0x30

    .line 955
    .line 956
    const/16 v11, 0x11

    .line 957
    .line 958
    const/4 v1, 0x0

    .line 959
    const-wide/16 v5, 0x0

    .line 960
    .line 961
    invoke-static/range {v1 .. v11}, La/gkb;->i(La/mm40;La/vul;La/wul;La/wul;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 962
    .line 963
    .line 964
    sget-object v0, La/qmk;->a:La/zcl;

    .line 965
    .line 966
    const/16 v21, 0x0

    .line 967
    .line 968
    const/16 v22, 0x5

    .line 969
    .line 970
    const/16 v16, 0x0

    .line 971
    .line 972
    const/high16 v17, 0x41000000    # 8.0f

    .line 973
    .line 974
    const-wide/16 v18, 0x0

    .line 975
    .line 976
    move-object/from16 v20, v9

    .line 977
    .line 978
    invoke-static/range {v16 .. v22}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 979
    .line 980
    .line 981
    goto :goto_b

    .line 982
    :cond_27
    invoke-virtual {v9}, La/fet;->X()V

    .line 983
    .line 984
    .line 985
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 986
    .line 987
    return-object v0

    .line 988
    :pswitch_3
    move v15, v9

    .line 989
    const/4 v1, 0x1

    .line 990
    move-object v3, v0

    .line 991
    check-cast v3, La/wul;

    .line 992
    .line 993
    move-object v4, v14

    .line 994
    check-cast v4, La/wul;

    .line 995
    .line 996
    check-cast v13, La/x1i0;

    .line 997
    .line 998
    check-cast v12, La/hdj;

    .line 999
    .line 1000
    move-object/from16 v0, p1

    .line 1001
    .line 1002
    check-cast v0, La/ir8;

    .line 1003
    .line 1004
    move-object/from16 v9, p2

    .line 1005
    .line 1006
    check-cast v9, La/fet;

    .line 1007
    .line 1008
    move-object/from16 v2, p3

    .line 1009
    .line 1010
    check-cast v2, Ljava/lang/Integer;

    .line 1011
    .line 1012
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1013
    .line 1014
    .line 1015
    move-result v2

    .line 1016
    sget-object v5, La/x1i0;->n2:La/zie0;

    .line 1017
    .line 1018
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1019
    .line 1020
    .line 1021
    and-int/lit8 v0, v2, 0x11

    .line 1022
    .line 1023
    if-eq v0, v7, :cond_28

    .line 1024
    .line 1025
    move v15, v1

    .line 1026
    :cond_28
    and-int/lit8 v0, v2, 0x1

    .line 1027
    .line 1028
    invoke-virtual {v9, v0, v15}, La/fet;->U(IZ)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v0

    .line 1032
    if-eqz v0, :cond_2d

    .line 1033
    .line 1034
    sget-object v17, La/qqm;->b:La/qqm;

    .line 1035
    .line 1036
    const/16 v22, 0x30

    .line 1037
    .line 1038
    const/16 v23, 0xd

    .line 1039
    .line 1040
    const/16 v16, 0x0

    .line 1041
    .line 1042
    const/16 v18, 0x0

    .line 1043
    .line 1044
    const-wide/16 v19, 0x0

    .line 1045
    .line 1046
    move-object/from16 v21, v9

    .line 1047
    .line 1048
    invoke-static/range {v16 .. v23}, La/vtb;->t(La/mm40;La/qqm;La/bgi0;JLa/fet;II)V

    .line 1049
    .line 1050
    .line 1051
    sget-object v2, La/vul;->a:La/vul;

    .line 1052
    .line 1053
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v0

    .line 1057
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v1

    .line 1061
    if-nez v0, :cond_29

    .line 1062
    .line 1063
    if-ne v1, v11, :cond_2a

    .line 1064
    .line 1065
    :cond_29
    new-instance v1, La/w1i0;

    .line 1066
    .line 1067
    invoke-direct {v1, v13, v8}, La/w1i0;-><init>(La/x1i0;B)V

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1071
    .line 1072
    .line 1073
    :cond_2a
    move-object v7, v1

    .line 1074
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 1075
    .line 1076
    invoke-virtual {v9, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v0

    .line 1080
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v1

    .line 1084
    or-int/2addr v0, v1

    .line 1085
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    if-nez v0, :cond_2b

    .line 1090
    .line 1091
    if-ne v1, v11, :cond_2c

    .line 1092
    .line 1093
    :cond_2b
    new-instance v1, La/x6h0;

    .line 1094
    .line 1095
    const/16 v0, 0x9

    .line 1096
    .line 1097
    invoke-direct {v1, v12, v13, v0}, La/x6h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1101
    .line 1102
    .line 1103
    :cond_2c
    move-object v8, v1

    .line 1104
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 1105
    .line 1106
    const/16 v10, 0x30

    .line 1107
    .line 1108
    const/16 v11, 0x11

    .line 1109
    .line 1110
    const/4 v1, 0x0

    .line 1111
    const-wide/16 v5, 0x0

    .line 1112
    .line 1113
    invoke-static/range {v1 .. v11}, La/gkb;->i(La/mm40;La/vul;La/wul;La/wul;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1114
    .line 1115
    .line 1116
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1117
    .line 1118
    const/16 v21, 0x0

    .line 1119
    .line 1120
    const/16 v22, 0x5

    .line 1121
    .line 1122
    const/16 v16, 0x0

    .line 1123
    .line 1124
    const/high16 v17, 0x41000000    # 8.0f

    .line 1125
    .line 1126
    const-wide/16 v18, 0x0

    .line 1127
    .line 1128
    move-object/from16 v20, v9

    .line 1129
    .line 1130
    invoke-static/range {v16 .. v22}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 1131
    .line 1132
    .line 1133
    goto :goto_c

    .line 1134
    :cond_2d
    invoke-virtual {v9}, La/fet;->X()V

    .line 1135
    .line 1136
    .line 1137
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1138
    .line 1139
    return-object v0

    .line 1140
    nop

    .line 1141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
