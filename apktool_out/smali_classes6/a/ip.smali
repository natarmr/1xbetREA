.class public final synthetic La/ip;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/lh80;

.field public final synthetic b:I

.field public final synthetic c:Lkotlin/ranges/IntRange;

.field public final synthetic d:La/ycl;

.field public final synthetic e:J

.field public final synthetic f:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/lh80;ILkotlin/ranges/IntRange;La/ycl;JLa/ugd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ip;->a:La/lh80;

    iput p2, p0, La/ip;->b:I

    iput-object p3, p0, La/ip;->c:Lkotlin/ranges/IntRange;

    iput-object p4, p0, La/ip;->d:La/ycl;

    iput-wide p5, p0, La/ip;->e:J

    iput-object p7, p0, La/ip;->f:La/ugd;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/lr8;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, La/fet;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v4, v3, 0x6

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    const/4 v4, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v4, 0x2

    .line 35
    :goto_0
    or-int/2addr v3, v4

    .line 36
    :cond_1
    and-int/lit8 v4, v3, 0x13

    .line 37
    .line 38
    const/16 v5, 0x12

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x1

    .line 42
    if-eq v4, v5, :cond_2

    .line 43
    .line 44
    move v4, v7

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move v4, v6

    .line 47
    :goto_1
    and-int/2addr v3, v7

    .line 48
    invoke-virtual {v2, v3, v4}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_e

    .line 53
    .line 54
    sget-object v3, La/bmd;->n:La/zfn;

    .line 55
    .line 56
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    move-object v12, v3

    .line 61
    check-cast v12, La/k6z;

    .line 62
    .line 63
    sget-object v3, La/bmd;->h:La/zfn;

    .line 64
    .line 65
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    move-object v10, v3

    .line 70
    check-cast v10, La/w6k;

    .line 71
    .line 72
    iget-object v3, v0, La/ip;->a:La/lh80;

    .line 73
    .line 74
    invoke-static {v3, v12}, La/s5x0;->B(La/hh80;La/k6z;)F

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-static {v3, v12}, La/s5x0;->A(La/hh80;La/k6z;)F

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    add-float/2addr v5, v4

    .line 83
    invoke-virtual {v1}, La/lr8;->d()F

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    sub-float/2addr v1, v5

    .line 88
    iget v4, v0, La/ip;->b:I

    .line 89
    .line 90
    int-to-float v5, v4

    .line 91
    div-float v8, v1, v5

    .line 92
    .line 93
    new-instance v9, La/ycl;

    .line 94
    .line 95
    invoke-direct {v9, v8}, La/ycl;-><init>(F)V

    .line 96
    .line 97
    .line 98
    new-instance v8, La/ycl;

    .line 99
    .line 100
    const/high16 v11, 0x42000000    # 32.0f

    .line 101
    .line 102
    invoke-direct {v8, v11}, La/ycl;-><init>(F)V

    .line 103
    .line 104
    .line 105
    new-instance v11, La/ycl;

    .line 106
    .line 107
    const/high16 v13, 0x42200000    # 40.0f

    .line 108
    .line 109
    invoke-direct {v11, v13}, La/ycl;-><init>(F)V

    .line 110
    .line 111
    .line 112
    invoke-static {v9, v8, v11}, La/l1e0;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    check-cast v8, La/ycl;

    .line 117
    .line 118
    iget v15, v8, La/ycl;->a:F

    .line 119
    .line 120
    mul-float/2addr v5, v15

    .line 121
    sub-float/2addr v1, v5

    .line 122
    const/4 v5, 0x0

    .line 123
    if-le v4, v7, :cond_3

    .line 124
    .line 125
    sget-object v8, La/qmk;->a:La/zcl;

    .line 126
    .line 127
    invoke-static {v1, v5}, La/ycl;->a(FF)I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-lez v8, :cond_3

    .line 132
    .line 133
    add-int/lit8 v8, v4, -0x1

    .line 134
    .line 135
    int-to-float v8, v8

    .line 136
    div-float/2addr v1, v8

    .line 137
    goto :goto_2

    .line 138
    :cond_3
    sget-object v1, La/qmk;->a:La/zcl;

    .line 139
    .line 140
    move v1, v5

    .line 141
    :goto_2
    iget-object v8, v0, La/ip;->c:Lkotlin/ranges/IntRange;

    .line 142
    .line 143
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    invoke-virtual {v2, v4}, La/fet;->e(I)Z

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    or-int/2addr v9, v11

    .line 152
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    sget-object v13, La/ukd;->a:La/cl5;

    .line 157
    .line 158
    if-nez v9, :cond_4

    .line 159
    .line 160
    if-ne v11, v13, :cond_7

    .line 161
    .line 162
    :cond_4
    if-eqz v8, :cond_6

    .line 163
    .line 164
    iget v9, v8, Lkotlin/ranges/a;->a:I

    .line 165
    .line 166
    add-int/lit8 v11, v4, -0x1

    .line 167
    .line 168
    invoke-static {v9, v6, v11}, La/l1e0;->d(III)I

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    iget v8, v8, Lkotlin/ranges/a;->b:I

    .line 173
    .line 174
    invoke-static {v8, v6, v11}, La/l1e0;->d(III)I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    new-instance v11, Lkotlin/ranges/IntRange;

    .line 179
    .line 180
    if-gt v9, v8, :cond_5

    .line 181
    .line 182
    invoke-direct {v11, v9, v8, v7}, Lkotlin/ranges/a;-><init>(III)V

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_5
    invoke-direct {v11, v8, v9, v7}, Lkotlin/ranges/a;-><init>(III)V

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    const/4 v8, 0x0

    .line 191
    move-object v11, v8

    .line 192
    :goto_3
    invoke-virtual {v2, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_7
    move-object v9, v11

    .line 196
    check-cast v9, Lkotlin/ranges/IntRange;

    .line 197
    .line 198
    sget-object v8, La/jm40;->b:La/jm40;

    .line 199
    .line 200
    const/high16 v11, 0x3f800000    # 1.0f

    .line 201
    .line 202
    invoke-static {v8, v11}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 203
    .line 204
    .line 205
    move-result-object v14

    .line 206
    invoke-static {v14, v3}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-static {v3}, La/lgb;->K(La/mm40;)La/mm40;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    sget-object v14, La/gqw0;->a:La/zx7;

    .line 215
    .line 216
    invoke-static {v14, v6}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 217
    .line 218
    .line 219
    move-result-object v14

    .line 220
    move-object/from16 p1, v12

    .line 221
    .line 222
    iget-wide v11, v2, La/fet;->T:J

    .line 223
    .line 224
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 229
    .line 230
    .line 231
    move-result-object v12

    .line 232
    invoke-static {v2, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 237
    .line 238
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, La/fet;->i0()V

    .line 242
    .line 243
    .line 244
    iget-boolean v7, v2, La/fet;->S:Z

    .line 245
    .line 246
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 247
    .line 248
    if-eqz v7, :cond_8

    .line 249
    .line 250
    invoke-virtual {v2, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 251
    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_8
    invoke-virtual {v2}, La/fet;->r0()V

    .line 255
    .line 256
    .line 257
    :goto_4
    sget-object v7, La/gqw0;->x:La/shd;

    .line 258
    .line 259
    invoke-static {v2, v14, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 260
    .line 261
    .line 262
    sget-object v14, La/gqw0;->w:La/shd;

    .line 263
    .line 264
    invoke-static {v2, v12, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    sget-object v12, La/gqw0;->y:La/shd;

    .line 272
    .line 273
    invoke-static {v2, v11, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 277
    .line 278
    .line 279
    sget-object v11, La/gqw0;->v:La/shd;

    .line 280
    .line 281
    invoke-static {v2, v3, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 282
    .line 283
    .line 284
    sget-object v3, La/jr8;->a:La/jr8;

    .line 285
    .line 286
    invoke-virtual {v3, v8}, La/jr8;->a(La/mm40;)La/mm40;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    invoke-virtual {v2, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v16

    .line 294
    invoke-virtual {v2, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v17

    .line 298
    or-int v16, v16, v17

    .line 299
    .line 300
    invoke-virtual {v2, v15}, La/fet;->d(F)Z

    .line 301
    .line 302
    .line 303
    move-result v17

    .line 304
    or-int v16, v16, v17

    .line 305
    .line 306
    invoke-virtual {v2, v1}, La/fet;->d(F)Z

    .line 307
    .line 308
    .line 309
    move-result v17

    .line 310
    or-int v16, v16, v17

    .line 311
    .line 312
    invoke-virtual {v2, v5}, La/fet;->d(F)Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    or-int v5, v16, v5

    .line 317
    .line 318
    move-object/from16 v16, v11

    .line 319
    .line 320
    iget-object v11, v0, La/ip;->d:La/ycl;

    .line 321
    .line 322
    invoke-virtual {v2, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v17

    .line 326
    or-int v5, v5, v17

    .line 327
    .line 328
    move/from16 v17, v1

    .line 329
    .line 330
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    or-int/2addr v1, v5

    .line 339
    const/high16 v5, 0x41400000    # 12.0f

    .line 340
    .line 341
    invoke-virtual {v2, v5}, La/fet;->d(F)Z

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    or-int/2addr v1, v5

    .line 346
    move-object/from16 v18, v8

    .line 347
    .line 348
    move-object v5, v9

    .line 349
    iget-wide v8, v0, La/ip;->e:J

    .line 350
    .line 351
    invoke-virtual {v2, v8, v9}, La/fet;->f(J)Z

    .line 352
    .line 353
    .line 354
    move-result v19

    .line 355
    or-int v1, v1, v19

    .line 356
    .line 357
    move/from16 v19, v1

    .line 358
    .line 359
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    if-nez v19, :cond_9

    .line 364
    .line 365
    if-ne v1, v13, :cond_a

    .line 366
    .line 367
    :cond_9
    move-object v1, v14

    .line 368
    move-wide v13, v8

    .line 369
    goto :goto_5

    .line 370
    :cond_a
    move-object v8, v1

    .line 371
    move-object v1, v14

    .line 372
    move/from16 v9, v17

    .line 373
    .line 374
    move-object/from16 v5, v18

    .line 375
    .line 376
    const/high16 v0, 0x3f800000    # 1.0f

    .line 377
    .line 378
    move-object/from16 v18, v12

    .line 379
    .line 380
    move-object/from16 v17, v16

    .line 381
    .line 382
    goto :goto_6

    .line 383
    :goto_5
    new-instance v8, La/kp;

    .line 384
    .line 385
    move/from16 v0, v17

    .line 386
    .line 387
    move-object/from16 v17, v16

    .line 388
    .line 389
    move/from16 v16, v0

    .line 390
    .line 391
    move-object v9, v5

    .line 392
    move-object/from16 v5, v18

    .line 393
    .line 394
    const/high16 v0, 0x3f800000    # 1.0f

    .line 395
    .line 396
    move-object/from16 v18, v12

    .line 397
    .line 398
    move-object/from16 v12, p1

    .line 399
    .line 400
    invoke-direct/range {v8 .. v16}, La/kp;-><init>(Lkotlin/ranges/IntRange;La/w6k;La/ycl;La/k6z;JFF)V

    .line 401
    .line 402
    .line 403
    move/from16 v9, v16

    .line 404
    .line 405
    invoke-virtual {v2, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    :goto_6
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 409
    .line 410
    const/4 v10, 0x0

    .line 411
    invoke-static {v3, v8, v2, v10}, La/p8a;->k(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 412
    .line 413
    .line 414
    invoke-static {v5, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    const/4 v3, 0x1

    .line 419
    if-le v4, v3, :cond_b

    .line 420
    .line 421
    new-instance v8, La/qw3;

    .line 422
    .line 423
    new-instance v10, La/jf4;

    .line 424
    .line 425
    const/16 v11, 0xe

    .line 426
    .line 427
    invoke-direct {v10, v11}, La/jf4;-><init>(B)V

    .line 428
    .line 429
    .line 430
    invoke-direct {v8, v9, v3, v10}, La/qw3;-><init>(FZLa/rw3;)V

    .line 431
    .line 432
    .line 433
    goto :goto_7

    .line 434
    :cond_b
    sget-object v8, La/uc9;->a:La/lw3;

    .line 435
    .line 436
    :goto_7
    sget-object v3, La/gqw0;->k:La/yx7;

    .line 437
    .line 438
    const/16 v9, 0x30

    .line 439
    .line 440
    invoke-static {v8, v3, v2, v9}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    iget-wide v8, v2, La/fet;->T:J

    .line 445
    .line 446
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 447
    .line 448
    .line 449
    move-result v8

    .line 450
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 451
    .line 452
    .line 453
    move-result-object v9

    .line 454
    invoke-static {v2, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-virtual {v2}, La/fet;->i0()V

    .line 459
    .line 460
    .line 461
    iget-boolean v10, v2, La/fet;->S:Z

    .line 462
    .line 463
    if-eqz v10, :cond_c

    .line 464
    .line 465
    invoke-virtual {v2, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 466
    .line 467
    .line 468
    goto :goto_8

    .line 469
    :cond_c
    invoke-virtual {v2}, La/fet;->r0()V

    .line 470
    .line 471
    .line 472
    :goto_8
    invoke-static {v2, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 473
    .line 474
    .line 475
    invoke-static {v2, v9, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 476
    .line 477
    .line 478
    move-object/from16 v1, v18

    .line 479
    .line 480
    invoke-static {v8, v2, v1, v2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 481
    .line 482
    .line 483
    move-object/from16 v1, v17

    .line 484
    .line 485
    invoke-static {v2, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 486
    .line 487
    .line 488
    const v0, 0x2736a3ed

    .line 489
    .line 490
    .line 491
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 492
    .line 493
    .line 494
    const/4 v10, 0x0

    .line 495
    :goto_9
    if-ge v10, v4, :cond_d

    .line 496
    .line 497
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-static {v5, v15}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    const/4 v3, 0x0

    .line 506
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 507
    .line 508
    .line 509
    move-result-object v6

    .line 510
    move-object/from16 v7, p0

    .line 511
    .line 512
    iget-object v8, v7, La/ip;->f:La/ugd;

    .line 513
    .line 514
    invoke-virtual {v8, v0, v1, v2, v6}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    add-int/lit8 v10, v10, 0x1

    .line 518
    .line 519
    goto :goto_9

    .line 520
    :cond_d
    const/4 v0, 0x1

    .line 521
    const/4 v3, 0x0

    .line 522
    invoke-static {v2, v3, v0, v0}, La/ohs0;->x(La/fet;ZZZ)V

    .line 523
    .line 524
    .line 525
    goto :goto_a

    .line 526
    :cond_e
    invoke-virtual {v2}, La/fet;->X()V

    .line 527
    .line 528
    .line 529
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 530
    .line 531
    return-object v0
.end method
