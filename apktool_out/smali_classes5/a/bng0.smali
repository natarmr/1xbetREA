.class public final synthetic La/bng0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/l7m0;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:La/hh80;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function1;ZZLa/hh80;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bng0;->a:La/l7m0;

    iput-object p2, p0, La/bng0;->b:Lkotlin/jvm/functions/Function1;

    iput-boolean p3, p0, La/bng0;->c:Z

    iput-boolean p4, p0, La/bng0;->d:Z

    iput-object p5, p0, La/bng0;->e:La/hh80;

    iput-boolean p6, p0, La/bng0;->f:Z

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/gqw0;->v:La/shd;

    .line 4
    .line 5
    sget-object v2, La/gqw0;->y:La/shd;

    .line 6
    .line 7
    sget-object v3, La/gqw0;->w:La/shd;

    .line 8
    .line 9
    sget-object v4, La/gqw0;->x:La/shd;

    .line 10
    .line 11
    move-object/from16 v5, p1

    .line 12
    .line 13
    check-cast v5, La/hh80;

    .line 14
    .line 15
    move-object/from16 v12, p2

    .line 16
    .line 17
    check-cast v12, La/fet;

    .line 18
    .line 19
    move-object/from16 v6, p3

    .line 20
    .line 21
    check-cast v6, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    sget-object v7, La/gqw0;->a:La/zx7;

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    and-int/lit8 v8, v6, 0x6

    .line 33
    .line 34
    if-nez v8, :cond_1

    .line 35
    .line 36
    invoke-virtual {v12, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eqz v8, :cond_0

    .line 41
    .line 42
    const/4 v8, 0x4

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v8, 0x2

    .line 45
    :goto_0
    or-int/2addr v6, v8

    .line 46
    :cond_1
    and-int/lit8 v8, v6, 0x13

    .line 47
    .line 48
    const/16 v9, 0x12

    .line 49
    .line 50
    const/4 v15, 0x1

    .line 51
    const/4 v13, 0x0

    .line 52
    if-eq v8, v9, :cond_2

    .line 53
    .line 54
    move v8, v15

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v8, v13

    .line 57
    :goto_1
    and-int/2addr v6, v15

    .line 58
    invoke-virtual {v12, v6, v8}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_13

    .line 63
    .line 64
    iget-object v6, v0, La/bng0;->a:La/l7m0;

    .line 65
    .line 66
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, La/ung0;

    .line 71
    .line 72
    if-eqz v6, :cond_12

    .line 73
    .line 74
    instance-of v8, v6, La/sng0;

    .line 75
    .line 76
    sget-object v14, La/jm40;->b:La/jm40;

    .line 77
    .line 78
    if-eqz v8, :cond_3

    .line 79
    .line 80
    const v0, 0x44ef608f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12, v0}, La/fet;->e0(I)V

    .line 84
    .line 85
    .line 86
    invoke-static {v14, v5}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 91
    .line 92
    invoke-interface {v0, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v13, v12, v0}, La/piz;->h(ILa/fet;La/mm40;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12, v13}, La/fet;->r(Z)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_f

    .line 103
    .line 104
    :cond_3
    instance-of v8, v6, La/rng0;

    .line 105
    .line 106
    iget-object v9, v0, La/bng0;->b:Lkotlin/jvm/functions/Function1;

    .line 107
    .line 108
    sget-object v10, La/jr8;->a:La/jr8;

    .line 109
    .line 110
    sget-object v11, La/e7z;->u1:La/pcy;

    .line 111
    .line 112
    sget-object v15, La/ukd;->a:La/cl5;

    .line 113
    .line 114
    if-eqz v8, :cond_7

    .line 115
    .line 116
    const v0, 0x44ef79a9

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12, v0}, La/fet;->e0(I)V

    .line 120
    .line 121
    .line 122
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 123
    .line 124
    invoke-static {v7, v13}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    iget-wide v7, v12, La/fet;->T:J

    .line 129
    .line 130
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-static {v12, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 143
    .line 144
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12}, La/fet;->i0()V

    .line 148
    .line 149
    .line 150
    iget-boolean v13, v12, La/fet;->S:Z

    .line 151
    .line 152
    if-eqz v13, :cond_4

    .line 153
    .line 154
    invoke-virtual {v12, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_4
    invoke-virtual {v12}, La/fet;->r0()V

    .line 159
    .line 160
    .line 161
    :goto_2
    invoke-static {v12, v5, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v12, v8, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v7, v12, v2, v12}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v12, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 171
    .line 172
    .line 173
    sget-object v0, La/gqw0;->e:La/zx7;

    .line 174
    .line 175
    invoke-virtual {v10, v14, v0}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v6, La/rng0;

    .line 180
    .line 181
    iget-object v1, v6, La/rng0;->c:La/mdm;

    .line 182
    .line 183
    invoke-virtual {v12, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    if-nez v2, :cond_6

    .line 192
    .line 193
    if-ne v3, v15, :cond_5

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_5
    const/4 v8, 0x0

    .line 197
    goto :goto_4

    .line 198
    :cond_6
    :goto_3
    new-instance v3, La/dng0;

    .line 199
    .line 200
    const/4 v8, 0x0

    .line 201
    invoke-direct {v3, v9, v8}, La/dng0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :goto_4
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 208
    .line 209
    invoke-static {v0, v1, v3, v12, v8}, La/piz;->b(La/mm40;La/mdm;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 210
    .line 211
    .line 212
    const/4 v0, 0x1

    .line 213
    invoke-virtual {v12, v0}, La/fet;->r(Z)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v8}, La/fet;->r(Z)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_f

    .line 220
    .line 221
    :cond_7
    move v8, v13

    .line 222
    instance-of v13, v6, La/tng0;

    .line 223
    .line 224
    if-eqz v13, :cond_11

    .line 225
    .line 226
    const v13, 0x44efaf91

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v13}, La/fet;->e0(I)V

    .line 230
    .line 231
    .line 232
    sget-object v13, La/o7k0;->c:La/n0q;

    .line 233
    .line 234
    invoke-static {v7, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    move-object/from16 v16, v9

    .line 239
    .line 240
    iget-wide v8, v12, La/fet;->T:J

    .line 241
    .line 242
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    move-object/from16 p3, v6

    .line 251
    .line 252
    invoke-static {v12, v13}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    sget-object v17, La/mkd;->c0:La/gqw0;

    .line 257
    .line 258
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12}, La/fet;->i0()V

    .line 262
    .line 263
    .line 264
    move-object/from16 v17, v10

    .line 265
    .line 266
    iget-boolean v10, v12, La/fet;->S:Z

    .line 267
    .line 268
    if-eqz v10, :cond_8

    .line 269
    .line 270
    invoke-virtual {v12, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 271
    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_8
    invoke-virtual {v12}, La/fet;->r0()V

    .line 275
    .line 276
    .line 277
    :goto_5
    invoke-static {v12, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v12, v9, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 281
    .line 282
    .line 283
    invoke-static {v8, v12, v2, v12}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 284
    .line 285
    .line 286
    invoke-static {v12, v6, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v14, v5}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-interface {v1, v13}, La/mm40;->e(La/mm40;)La/mm40;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    iget-boolean v1, v0, La/bng0;->c:Z

    .line 298
    .line 299
    iget-object v2, v0, La/bng0;->e:La/hh80;

    .line 300
    .line 301
    if-nez v1, :cond_9

    .line 302
    .line 303
    iget-boolean v1, v0, La/bng0;->d:Z

    .line 304
    .line 305
    if-eqz v1, :cond_a

    .line 306
    .line 307
    move-object/from16 v6, p3

    .line 308
    .line 309
    check-cast v6, La/tng0;

    .line 310
    .line 311
    iget-object v1, v6, La/tng0;->e:La/mtl;

    .line 312
    .line 313
    if-eqz v1, :cond_a

    .line 314
    .line 315
    :cond_9
    const/4 v3, 0x0

    .line 316
    goto :goto_7

    .line 317
    :cond_a
    const v1, 0x75fadce6

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 321
    .line 322
    .line 323
    invoke-static {v2, v12}, La/knm0;->f(La/hh80;La/fet;)La/ch80;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    const/4 v3, 0x0

    .line 328
    invoke-virtual {v12, v3}, La/fet;->r(Z)V

    .line 329
    .line 330
    .line 331
    :goto_6
    move-object v10, v1

    .line 332
    goto :goto_8

    .line 333
    :goto_7
    const v1, 0x75f96bed

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 337
    .line 338
    .line 339
    invoke-static {v2, v12}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-virtual {v12, v3}, La/fet;->r(Z)V

    .line 344
    .line 345
    .line 346
    goto :goto_6

    .line 347
    :goto_8
    move-object/from16 v1, p3

    .line 348
    .line 349
    check-cast v1, La/tng0;

    .line 350
    .line 351
    iget-object v6, v1, La/tng0;->c:La/a4x;

    .line 352
    .line 353
    iget-boolean v0, v0, La/bng0;->f:Z

    .line 354
    .line 355
    if-eqz v0, :cond_b

    .line 356
    .line 357
    iget-object v2, v1, La/tng0;->d:La/xkg0;

    .line 358
    .line 359
    if-eqz v2, :cond_b

    .line 360
    .line 361
    const/4 v7, 0x1

    .line 362
    :goto_9
    move-object/from16 v2, v16

    .line 363
    .line 364
    goto :goto_a

    .line 365
    :cond_b
    move v7, v3

    .line 366
    goto :goto_9

    .line 367
    :goto_a
    invoke-virtual {v12, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    if-nez v4, :cond_c

    .line 376
    .line 377
    if-ne v5, v15, :cond_d

    .line 378
    .line 379
    :cond_c
    new-instance v5, La/ru80;

    .line 380
    .line 381
    const/16 v4, 0xb

    .line 382
    .line 383
    invoke-direct {v5, v2, v4}, La/ru80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    :cond_d
    move-object v8, v5

    .line 390
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 391
    .line 392
    move-object v11, v12

    .line 393
    const/4 v12, 0x0

    .line 394
    move-object/from16 v4, v17

    .line 395
    .line 396
    invoke-static/range {v6 .. v12}, La/piz;->w(La/a4x;ZLkotlin/jvm/functions/Function2;La/mm40;La/ch80;La/fet;I)V

    .line 397
    .line 398
    .line 399
    if-eqz v0, :cond_10

    .line 400
    .line 401
    iget-object v0, v1, La/tng0;->e:La/mtl;

    .line 402
    .line 403
    if-eqz v0, :cond_10

    .line 404
    .line 405
    const v0, 0x7606b7c0

    .line 406
    .line 407
    .line 408
    invoke-virtual {v11, v0}, La/fet;->e0(I)V

    .line 409
    .line 410
    .line 411
    sget-object v0, La/gqw0;->h:La/zx7;

    .line 412
    .line 413
    invoke-virtual {v4, v14, v0}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    iget-object v7, v1, La/tng0;->e:La/mtl;

    .line 418
    .line 419
    sget-object v0, La/qmk;->a:La/zcl;

    .line 420
    .line 421
    const/high16 v0, 0x41400000    # 12.0f

    .line 422
    .line 423
    const/4 v1, 0x7

    .line 424
    const/4 v4, 0x0

    .line 425
    invoke-static {v4, v4, v4, v0, v1}, La/s5x0;->u(FFFFI)La/lh80;

    .line 426
    .line 427
    .line 428
    move-result-object v10

    .line 429
    invoke-virtual {v11, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    if-nez v0, :cond_e

    .line 438
    .line 439
    if-ne v1, v15, :cond_f

    .line 440
    .line 441
    :cond_e
    new-instance v1, La/a9g0;

    .line 442
    .line 443
    const/4 v0, 0x1

    .line 444
    invoke-direct {v1, v2, v0}, La/a9g0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v11, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    :cond_f
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 451
    .line 452
    const/4 v13, 0x0

    .line 453
    const/16 v14, 0xc

    .line 454
    .line 455
    const/4 v8, 0x0

    .line 456
    const/4 v9, 0x0

    .line 457
    move-object v12, v11

    .line 458
    move-object v11, v1

    .line 459
    invoke-static/range {v6 .. v14}, La/bkb;->f(La/mm40;La/mtl;La/ma80;ZLa/hh80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 460
    .line 461
    .line 462
    move-object v11, v12

    .line 463
    invoke-virtual {v11, v3}, La/fet;->r(Z)V

    .line 464
    .line 465
    .line 466
    :goto_b
    const/4 v0, 0x1

    .line 467
    goto :goto_c

    .line 468
    :cond_10
    const v0, 0x760d6006

    .line 469
    .line 470
    .line 471
    invoke-virtual {v11, v0}, La/fet;->e0(I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v11, v3}, La/fet;->r(Z)V

    .line 475
    .line 476
    .line 477
    goto :goto_b

    .line 478
    :goto_c
    invoke-virtual {v11, v0}, La/fet;->r(Z)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v11, v3}, La/fet;->r(Z)V

    .line 482
    .line 483
    .line 484
    goto :goto_f

    .line 485
    :cond_11
    move v3, v8

    .line 486
    :goto_d
    move-object v11, v12

    .line 487
    goto :goto_e

    .line 488
    :cond_12
    move v3, v13

    .line 489
    goto :goto_d

    .line 490
    :goto_e
    const v0, 0x44ef5fb3

    .line 491
    .line 492
    .line 493
    invoke-static {v0, v11, v3}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    throw v0

    .line 498
    :cond_13
    move-object v11, v12

    .line 499
    invoke-virtual {v11}, La/fet;->X()V

    .line 500
    .line 501
    .line 502
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 503
    .line 504
    return-object v0
.end method
