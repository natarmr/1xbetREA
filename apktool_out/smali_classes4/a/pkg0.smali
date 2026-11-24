.class public abstract La/pkg0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zsf;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/zsf;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const v2, 0x3fcb851f    # 1.59f

    .line 5
    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const v4, 0x3c23d70a    # 0.01f

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, La/zsf;-><init>(FFFF)V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/pkg0;->a:La/zsf;

    .line 16
    .line 17
    return-void
.end method

.method public static final a(La/mig0;La/nkg0;La/fet;I)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    sget-object v10, La/gqw0;->v:La/shd;

    .line 8
    .line 9
    sget-object v11, La/gqw0;->y:La/shd;

    .line 10
    .line 11
    sget-object v12, La/gqw0;->w:La/shd;

    .line 12
    .line 13
    sget-object v13, La/gqw0;->x:La/shd;

    .line 14
    .line 15
    sget-object v14, La/gqw0;->e:La/zx7;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const v2, -0x4e360006

    .line 21
    .line 22
    .line 23
    invoke-virtual {v7, v2}, La/fet;->g0(I)La/fet;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v7, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v15, 0x4

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    move v2, v15

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v2, 0x2

    .line 36
    :goto_0
    or-int v2, p3, v2

    .line 37
    .line 38
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const/16 v3, 0x20

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/16 v3, 0x10

    .line 48
    .line 49
    :goto_1
    or-int/2addr v2, v3

    .line 50
    and-int/lit8 v3, v2, 0x13

    .line 51
    .line 52
    const/16 v4, 0x12

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    if-eq v3, v4, :cond_2

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move v3, v6

    .line 60
    :goto_2
    and-int/lit8 v4, v2, 0x1

    .line 61
    .line 62
    invoke-virtual {v7, v4, v3}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_10

    .line 67
    .line 68
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    sget-object v4, La/ukd;->a:La/cl5;

    .line 73
    .line 74
    if-ne v3, v4, :cond_4

    .line 75
    .line 76
    iget-boolean v3, v0, La/mig0;->j:Z

    .line 77
    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    const/high16 v3, 0x3f800000    # 1.0f

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    const/high16 v3, 0x40000000    # 2.0f

    .line 84
    .line 85
    :goto_3
    invoke-static {v3}, La/xf0;->c(F)La/t33;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v7, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    check-cast v3, La/t33;

    .line 93
    .line 94
    const/16 v8, 0xe

    .line 95
    .line 96
    and-int/2addr v2, v8

    .line 97
    if-ne v2, v15, :cond_5

    .line 98
    .line 99
    const/4 v2, 0x1

    .line 100
    goto :goto_4

    .line 101
    :cond_5
    move v2, v6

    .line 102
    :goto_4
    invoke-virtual {v7, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    or-int/2addr v2, v9

    .line 107
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    if-nez v2, :cond_6

    .line 112
    .line 113
    if-ne v9, v4, :cond_7

    .line 114
    .line 115
    :cond_6
    new-instance v9, La/k6d0;

    .line 116
    .line 117
    const/16 v2, 0x17

    .line 118
    .line 119
    const/4 v15, 0x0

    .line 120
    invoke-direct {v9, v0, v3, v15, v2}, La/k6d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_7
    check-cast v9, Lkotlin/jvm/functions/Function2;

    .line 127
    .line 128
    invoke-static {v7, v0, v9}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 129
    .line 130
    .line 131
    iget v2, v1, La/nkg0;->d:F

    .line 132
    .line 133
    iget v9, v1, La/nkg0;->c:F

    .line 134
    .line 135
    sget-object v15, La/jm40;->b:La/jm40;

    .line 136
    .line 137
    invoke-static {v15, v2, v9}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    sget-object v9, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 142
    .line 143
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 144
    .line 145
    .line 146
    move-result-wide v8

    .line 147
    sget-object v5, La/jd8;->n:La/ljc;

    .line 148
    .line 149
    invoke-static {v2, v8, v9, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {v14, v6}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    iget-wide v8, v7, La/fet;->T:J

    .line 158
    .line 159
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-static {v7, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    sget-object v19, La/mkd;->c0:La/gqw0;

    .line 172
    .line 173
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7}, La/fet;->i0()V

    .line 177
    .line 178
    .line 179
    iget-boolean v6, v7, La/fet;->S:Z

    .line 180
    .line 181
    move/from16 v20, v6

    .line 182
    .line 183
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 184
    .line 185
    if-eqz v20, :cond_8

    .line 186
    .line 187
    invoke-virtual {v7, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 188
    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_8
    invoke-virtual {v7}, La/fet;->r0()V

    .line 192
    .line 193
    .line 194
    :goto_5
    invoke-static {v7, v5, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v7, v9, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v8, v7, v11, v7}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v7, v2, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    if-nez v2, :cond_9

    .line 215
    .line 216
    if-ne v5, v4, :cond_a

    .line 217
    .line 218
    :cond_9
    new-instance v5, La/m53;

    .line 219
    .line 220
    const/16 v2, 0x19

    .line 221
    .line 222
    invoke-direct {v5, v3, v2}, La/m53;-><init>(La/t33;B)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 229
    .line 230
    invoke-static {v15, v5}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    const/4 v3, 0x0

    .line 235
    invoke-static {v14, v3}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    iget-wide v8, v7, La/fet;->T:J

    .line 240
    .line 241
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    invoke-static {v7, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {v7}, La/fet;->i0()V

    .line 254
    .line 255
    .line 256
    iget-boolean v8, v7, La/fet;->S:Z

    .line 257
    .line 258
    if-eqz v8, :cond_b

    .line 259
    .line 260
    invoke-virtual {v7, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 261
    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_b
    invoke-virtual {v7}, La/fet;->r0()V

    .line 265
    .line 266
    .line 267
    :goto_6
    invoke-static {v7, v4, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v7, v5, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v3, v7, v11, v7}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v7, v2, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 277
    .line 278
    .line 279
    iget-object v2, v0, La/mig0;->i:La/okg0;

    .line 280
    .line 281
    iget-object v3, v2, La/okg0;->a:Ljava/util/List;

    .line 282
    .line 283
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    if-nez v3, :cond_e

    .line 288
    .line 289
    const v3, 0x7336d074

    .line 290
    .line 291
    .line 292
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 293
    .line 294
    .line 295
    sget-object v3, La/qmk;->a:La/zcl;

    .line 296
    .line 297
    new-instance v3, La/qw3;

    .line 298
    .line 299
    new-instance v4, La/jf4;

    .line 300
    .line 301
    const/16 v5, 0xe

    .line 302
    .line 303
    invoke-direct {v4, v5}, La/jf4;-><init>(B)V

    .line 304
    .line 305
    .line 306
    const/high16 v5, -0x3e400000    # -24.0f

    .line 307
    .line 308
    const/4 v8, 0x1

    .line 309
    invoke-direct {v3, v5, v8, v4}, La/qw3;-><init>(FZLa/rw3;)V

    .line 310
    .line 311
    .line 312
    sget-object v4, La/gqw0;->j:La/yx7;

    .line 313
    .line 314
    const/4 v5, 0x0

    .line 315
    invoke-static {v3, v4, v7, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    iget-wide v8, v7, La/fet;->T:J

    .line 320
    .line 321
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    invoke-static {v7, v15}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 330
    .line 331
    .line 332
    move-result-object v9

    .line 333
    invoke-virtual {v7}, La/fet;->i0()V

    .line 334
    .line 335
    .line 336
    iget-boolean v5, v7, La/fet;->S:Z

    .line 337
    .line 338
    if-eqz v5, :cond_c

    .line 339
    .line 340
    invoke-virtual {v7, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 341
    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_c
    invoke-virtual {v7}, La/fet;->r0()V

    .line 345
    .line 346
    .line 347
    :goto_7
    invoke-static {v7, v3, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 348
    .line 349
    .line 350
    invoke-static {v7, v8, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 351
    .line 352
    .line 353
    invoke-static {v4, v7, v11, v7}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 354
    .line 355
    .line 356
    invoke-static {v7, v9, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 357
    .line 358
    .line 359
    const v3, 0x177d5c79

    .line 360
    .line 361
    .line 362
    invoke-virtual {v7, v3}, La/fet;->e0(I)V

    .line 363
    .line 364
    .line 365
    iget-object v3, v2, La/okg0;->a:Ljava/util/List;

    .line 366
    .line 367
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v17

    .line 371
    :goto_8
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    if-eqz v3, :cond_d

    .line 376
    .line 377
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    check-cast v3, La/pjg0;

    .line 382
    .line 383
    iget-object v3, v3, La/pjg0;->b:La/n0x;

    .line 384
    .line 385
    invoke-interface {v3}, La/o0x;->a()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    iget v4, v1, La/nkg0;->l:F

    .line 390
    .line 391
    invoke-static {v15, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    const/16 v8, 0x30

    .line 396
    .line 397
    const/16 v9, 0x7f8

    .line 398
    .line 399
    move-object v5, v2

    .line 400
    move-object v2, v3

    .line 401
    const/4 v3, 0x0

    .line 402
    move-object/from16 v20, v5

    .line 403
    .line 404
    const/4 v5, 0x0

    .line 405
    move-object/from16 v21, v6

    .line 406
    .line 407
    const/4 v6, 0x0

    .line 408
    move-object/from16 v18, v10

    .line 409
    .line 410
    move-object/from16 v0, v21

    .line 411
    .line 412
    const/4 v1, 0x1

    .line 413
    const/4 v10, 0x0

    .line 414
    invoke-static/range {v2 .. v9}, La/k7x;->a(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/qge;La/a4d;La/fet;II)V

    .line 415
    .line 416
    .line 417
    move-object/from16 v1, p1

    .line 418
    .line 419
    move-object v6, v0

    .line 420
    move-object/from16 v10, v18

    .line 421
    .line 422
    move-object/from16 v2, v20

    .line 423
    .line 424
    move-object/from16 v0, p0

    .line 425
    .line 426
    goto :goto_8

    .line 427
    :cond_d
    move-object/from16 v20, v2

    .line 428
    .line 429
    move-object v0, v6

    .line 430
    move-object/from16 v18, v10

    .line 431
    .line 432
    const/4 v1, 0x1

    .line 433
    const/4 v10, 0x0

    .line 434
    invoke-static {v7, v10, v1, v10}, La/ohs0;->x(La/fet;ZZZ)V

    .line 435
    .line 436
    .line 437
    goto :goto_9

    .line 438
    :cond_e
    move-object/from16 v20, v2

    .line 439
    .line 440
    move-object v0, v6

    .line 441
    move-object/from16 v18, v10

    .line 442
    .line 443
    const/4 v1, 0x1

    .line 444
    const/4 v10, 0x0

    .line 445
    const v2, 0x733e707c

    .line 446
    .line 447
    .line 448
    invoke-virtual {v7, v2}, La/fet;->e0(I)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 452
    .line 453
    .line 454
    :goto_9
    sget-object v2, La/gqw0;->h:La/zx7;

    .line 455
    .line 456
    sget-object v3, La/jr8;->a:La/jr8;

    .line 457
    .line 458
    invoke-virtual {v3, v15, v2}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    invoke-static {v14, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    iget-wide v4, v7, La/fet;->T:J

    .line 467
    .line 468
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 469
    .line 470
    .line 471
    move-result v4

    .line 472
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    invoke-static {v7, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 481
    .line 482
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v7}, La/fet;->i0()V

    .line 486
    .line 487
    .line 488
    iget-boolean v6, v7, La/fet;->S:Z

    .line 489
    .line 490
    if-eqz v6, :cond_f

    .line 491
    .line 492
    invoke-virtual {v7, v0}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 493
    .line 494
    .line 495
    goto :goto_a

    .line 496
    :cond_f
    invoke-virtual {v7}, La/fet;->r0()V

    .line 497
    .line 498
    .line 499
    :goto_a
    invoke-static {v7, v3, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 500
    .line 501
    .line 502
    invoke-static {v7, v5, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 503
    .line 504
    .line 505
    invoke-static {v4, v7, v11, v7}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 506
    .line 507
    .line 508
    move-object/from16 v0, v18

    .line 509
    .line 510
    invoke-static {v7, v2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 511
    .line 512
    .line 513
    move-object/from16 v0, p1

    .line 514
    .line 515
    iget v2, v0, La/nkg0;->m:F

    .line 516
    .line 517
    invoke-static {v15, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    iget v3, v0, La/nkg0;->n:F

    .line 522
    .line 523
    invoke-static {v2, v3}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    const/16 v8, 0x36

    .line 528
    .line 529
    const/16 v9, 0x7f8

    .line 530
    .line 531
    const-string v2, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/NamePanel.png"

    .line 532
    .line 533
    const/4 v3, 0x0

    .line 534
    const/4 v5, 0x0

    .line 535
    const/4 v6, 0x0

    .line 536
    invoke-static/range {v2 .. v9}, La/k7x;->a(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/qge;La/a4d;La/fet;II)V

    .line 537
    .line 538
    .line 539
    move-object/from16 v5, v20

    .line 540
    .line 541
    iget-object v2, v5, La/okg0;->b:Ljava/lang/String;

    .line 542
    .line 543
    sget-object v23, La/j1t0;->b:La/qrq;

    .line 544
    .line 545
    sget-wide v20, La/qmk;->r:J

    .line 546
    .line 547
    sget-wide v29, La/qmk;->F:J

    .line 548
    .line 549
    new-instance v17, La/y9q0;

    .line 550
    .line 551
    const/16 v28, 0x0

    .line 552
    .line 553
    const v31, 0xfdffdd

    .line 554
    .line 555
    .line 556
    const-wide/16 v18, 0x0

    .line 557
    .line 558
    const/16 v22, 0x0

    .line 559
    .line 560
    const-wide/16 v24, 0x0

    .line 561
    .line 562
    const/16 v26, 0x0

    .line 563
    .line 564
    const/16 v27, 0x0

    .line 565
    .line 566
    invoke-direct/range {v17 .. v31}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 567
    .line 568
    .line 569
    const/16 v25, 0x0

    .line 570
    .line 571
    const v26, 0x1fffe

    .line 572
    .line 573
    .line 574
    const-wide/16 v4, 0x0

    .line 575
    .line 576
    const-wide/16 v7, 0x0

    .line 577
    .line 578
    const/4 v9, 0x0

    .line 579
    const/4 v10, 0x0

    .line 580
    const/4 v11, 0x0

    .line 581
    const-wide/16 v12, 0x0

    .line 582
    .line 583
    const/4 v14, 0x0

    .line 584
    const/16 v18, 0x4

    .line 585
    .line 586
    const-wide/16 v15, 0x0

    .line 587
    .line 588
    move-object/from16 v22, v17

    .line 589
    .line 590
    const/16 v17, 0x0

    .line 591
    .line 592
    move/from16 v19, v18

    .line 593
    .line 594
    const/16 v18, 0x0

    .line 595
    .line 596
    move/from16 v20, v19

    .line 597
    .line 598
    const/16 v19, 0x0

    .line 599
    .line 600
    move/from16 v21, v20

    .line 601
    .line 602
    const/16 v20, 0x0

    .line 603
    .line 604
    move/from16 v23, v21

    .line 605
    .line 606
    const/16 v21, 0x0

    .line 607
    .line 608
    const/16 v24, 0x0

    .line 609
    .line 610
    move-object/from16 v23, p2

    .line 611
    .line 612
    invoke-static/range {v2 .. v26}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 613
    .line 614
    .line 615
    move-object/from16 v7, v23

    .line 616
    .line 617
    invoke-static {v7, v1, v1, v1}, La/ohs0;->x(La/fet;ZZZ)V

    .line 618
    .line 619
    .line 620
    goto :goto_b

    .line 621
    :cond_10
    move-object v0, v1

    .line 622
    invoke-virtual {v7}, La/fet;->X()V

    .line 623
    .line 624
    .line 625
    :goto_b
    invoke-virtual {v7}, La/fet;->u()La/yfe0;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    if-eqz v1, :cond_11

    .line 630
    .line 631
    new-instance v2, La/rig0;

    .line 632
    .line 633
    const/4 v5, 0x4

    .line 634
    move-object/from16 v3, p0

    .line 635
    .line 636
    move/from16 v4, p3

    .line 637
    .line 638
    invoke-direct {v2, v3, v0, v4, v5}, La/rig0;-><init>(La/mig0;La/nkg0;IB)V

    .line 639
    .line 640
    .line 641
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 642
    .line 643
    :cond_11
    return-void
.end method
