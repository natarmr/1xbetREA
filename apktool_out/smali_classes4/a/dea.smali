.class public abstract La/dea;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x41b00000    # 22.0f

    .line 4
    .line 5
    sput v0, La/dea;->a:F

    .line 6
    .line 7
    const/high16 v0, 0x43c80000    # 400.0f

    .line 8
    .line 9
    sput v0, La/dea;->b:F

    .line 10
    .line 11
    return-void
.end method

.method public static final a(La/mm40;IZZFFFFFLa/fet;I)V
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v10, p9

    .line 8
    .line 9
    const v0, -0x5aa02a71

    .line 10
    .line 11
    .line 12
    invoke-virtual {v10, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    :goto_0
    or-int v0, p10, v0

    .line 25
    .line 26
    move/from16 v2, p1

    .line 27
    .line 28
    invoke-virtual {v10, v2}, La/fet;->e(I)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    const/16 v5, 0x20

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/16 v5, 0x10

    .line 38
    .line 39
    :goto_1
    or-int/2addr v0, v5

    .line 40
    invoke-virtual {v10, v3}, La/fet;->h(Z)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    const/16 v5, 0x100

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v5, 0x80

    .line 50
    .line 51
    :goto_2
    or-int/2addr v0, v5

    .line 52
    invoke-virtual {v10, v4}, La/fet;->h(Z)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    const/16 v5, 0x800

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/16 v5, 0x400

    .line 62
    .line 63
    :goto_3
    or-int/2addr v0, v5

    .line 64
    move/from16 v15, p4

    .line 65
    .line 66
    invoke-virtual {v10, v15}, La/fet;->d(F)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    const/16 v5, 0x4000

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    const/16 v5, 0x2000

    .line 76
    .line 77
    :goto_4
    or-int/2addr v0, v5

    .line 78
    move/from16 v5, p5

    .line 79
    .line 80
    invoke-virtual {v10, v5}, La/fet;->d(F)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_5

    .line 85
    .line 86
    const/high16 v6, 0x20000

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_5
    const/high16 v6, 0x10000

    .line 90
    .line 91
    :goto_5
    or-int/2addr v0, v6

    .line 92
    move/from16 v6, p6

    .line 93
    .line 94
    invoke-virtual {v10, v6}, La/fet;->d(F)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_6

    .line 99
    .line 100
    const/high16 v7, 0x100000

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_6
    const/high16 v7, 0x80000

    .line 104
    .line 105
    :goto_6
    or-int/2addr v0, v7

    .line 106
    move/from16 v7, p7

    .line 107
    .line 108
    invoke-virtual {v10, v7}, La/fet;->d(F)Z

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    if-eqz v8, :cond_7

    .line 113
    .line 114
    const/high16 v8, 0x800000

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_7
    const/high16 v8, 0x400000

    .line 118
    .line 119
    :goto_7
    or-int/2addr v0, v8

    .line 120
    move/from16 v9, p8

    .line 121
    .line 122
    invoke-virtual {v10, v9}, La/fet;->d(F)Z

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    if-eqz v8, :cond_8

    .line 127
    .line 128
    const/high16 v8, 0x4000000

    .line 129
    .line 130
    goto :goto_8

    .line 131
    :cond_8
    const/high16 v8, 0x2000000

    .line 132
    .line 133
    :goto_8
    or-int/2addr v0, v8

    .line 134
    const v8, 0x2492493

    .line 135
    .line 136
    .line 137
    and-int/2addr v8, v0

    .line 138
    const v11, 0x2492492

    .line 139
    .line 140
    .line 141
    const/4 v12, 0x0

    .line 142
    if-eq v8, v11, :cond_9

    .line 143
    .line 144
    const/4 v8, 0x1

    .line 145
    goto :goto_9

    .line 146
    :cond_9
    move v8, v12

    .line 147
    :goto_9
    and-int/lit8 v11, v0, 0x1

    .line 148
    .line 149
    invoke-virtual {v10, v11, v8}, La/fet;->U(IZ)Z

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    if-eqz v8, :cond_d

    .line 154
    .line 155
    sget-object v8, La/gqw0;->a:La/zx7;

    .line 156
    .line 157
    invoke-static {v8, v12}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    iget-wide v13, v10, La/fet;->T:J

    .line 162
    .line 163
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 164
    .line 165
    .line 166
    move-result v13

    .line 167
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    .line 168
    .line 169
    .line 170
    move-result-object v14

    .line 171
    invoke-static {v10, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 176
    .line 177
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v10}, La/fet;->i0()V

    .line 181
    .line 182
    .line 183
    iget-boolean v12, v10, La/fet;->S:Z

    .line 184
    .line 185
    if-eqz v12, :cond_a

    .line 186
    .line 187
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 188
    .line 189
    invoke-virtual {v10, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 190
    .line 191
    .line 192
    goto :goto_a

    .line 193
    :cond_a
    invoke-virtual {v10}, La/fet;->r0()V

    .line 194
    .line 195
    .line 196
    :goto_a
    sget-object v12, La/gqw0;->x:La/shd;

    .line 197
    .line 198
    invoke-static {v10, v8, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 199
    .line 200
    .line 201
    sget-object v8, La/gqw0;->w:La/shd;

    .line 202
    .line 203
    invoke-static {v10, v14, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    sget-object v12, La/gqw0;->y:La/shd;

    .line 211
    .line 212
    invoke-static {v10, v8, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v10}, La/jpm0;->n(La/fet;)V

    .line 216
    .line 217
    .line 218
    sget-object v8, La/gqw0;->v:La/shd;

    .line 219
    .line 220
    invoke-static {v10, v11, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 221
    .line 222
    .line 223
    if-nez v4, :cond_b

    .line 224
    .line 225
    const v8, 0x5c3f1615    # 2.15144E17f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10, v8}, La/fet;->e0(I)V

    .line 229
    .line 230
    .line 231
    sget-object v8, La/qmk;->a:La/zcl;

    .line 232
    .line 233
    const/high16 v8, 0x42400000    # 48.0f

    .line 234
    .line 235
    sget-object v11, La/jm40;->b:La/jm40;

    .line 236
    .line 237
    invoke-static {v11, v8}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    const/high16 v11, 0x42100000    # 36.0f

    .line 242
    .line 243
    invoke-static {v8, v11}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 244
    .line 245
    .line 246
    move-result-object v16

    .line 247
    const/16 v34, 0x0

    .line 248
    .line 249
    const v35, 0xffffb

    .line 250
    .line 251
    .line 252
    const/16 v17, 0x0

    .line 253
    .line 254
    const/16 v18, 0x0

    .line 255
    .line 256
    const/16 v20, 0x0

    .line 257
    .line 258
    const/16 v21, 0x0

    .line 259
    .line 260
    const/16 v22, 0x0

    .line 261
    .line 262
    const/16 v23, 0x0

    .line 263
    .line 264
    const/16 v24, 0x0

    .line 265
    .line 266
    const-wide/16 v25, 0x0

    .line 267
    .line 268
    const/16 v27, 0x0

    .line 269
    .line 270
    const/16 v28, 0x0

    .line 271
    .line 272
    const-wide/16 v29, 0x0

    .line 273
    .line 274
    const-wide/16 v31, 0x0

    .line 275
    .line 276
    const/16 v33, 0x0

    .line 277
    .line 278
    move/from16 v19, v9

    .line 279
    .line 280
    invoke-static/range {v16 .. v35}, La/i4w0;->U(La/mm40;FFFFFFFFJLa/yjj0;ZJJILa/z5z;I)La/mm40;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    const v9, 0x7f080322

    .line 285
    .line 286
    .line 287
    const/4 v11, 0x0

    .line 288
    invoke-static {v9, v11, v10}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    sget-object v12, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 293
    .line 294
    invoke-virtual {v12}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 295
    .line 296
    .line 297
    move-result-wide v12

    .line 298
    move/from16 v36, v11

    .line 299
    .line 300
    new-instance v11, La/m78;

    .line 301
    .line 302
    const/4 v14, 0x5

    .line 303
    invoke-direct {v11, v12, v13, v14}, La/m78;-><init>(JI)V

    .line 304
    .line 305
    .line 306
    const/16 v13, 0x38

    .line 307
    .line 308
    const/16 v14, 0x38

    .line 309
    .line 310
    const/4 v6, 0x0

    .line 311
    move-object v7, v8

    .line 312
    const/4 v8, 0x0

    .line 313
    move-object v5, v9

    .line 314
    const/4 v9, 0x0

    .line 315
    const/4 v10, 0x0

    .line 316
    move-object/from16 v12, p9

    .line 317
    .line 318
    move/from16 v16, v0

    .line 319
    .line 320
    move/from16 v0, v36

    .line 321
    .line 322
    const/4 v1, 0x1

    .line 323
    invoke-static/range {v5 .. v14}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0}, La/fet;->r(Z)V

    .line 327
    .line 328
    .line 329
    goto :goto_b

    .line 330
    :cond_b
    move/from16 v16, v0

    .line 331
    .line 332
    move-object v12, v10

    .line 333
    const/4 v0, 0x0

    .line 334
    const/4 v1, 0x1

    .line 335
    const v5, 0x5c45386d

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v5}, La/fet;->e0(I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0}, La/fet;->r(Z)V

    .line 342
    .line 343
    .line 344
    :goto_b
    if-eqz v3, :cond_c

    .line 345
    .line 346
    const v5, 0x5c463e98

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v5}, La/fet;->e0(I)V

    .line 350
    .line 351
    .line 352
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 353
    .line 354
    .line 355
    move-result-object v11

    .line 356
    const/16 v5, 0x190

    .line 357
    .line 358
    const/4 v6, 0x0

    .line 359
    const/4 v7, 0x6

    .line 360
    invoke-static {v5, v0, v6, v7}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 361
    .line 362
    .line 363
    move-result-object v13

    .line 364
    new-instance v5, La/uda;

    .line 365
    .line 366
    move/from16 v7, p5

    .line 367
    .line 368
    move/from16 v8, p6

    .line 369
    .line 370
    move/from16 v9, p7

    .line 371
    .line 372
    move v10, v2

    .line 373
    move v6, v15

    .line 374
    invoke-direct/range {v5 .. v10}, La/uda;-><init>(FFFFI)V

    .line 375
    .line 376
    .line 377
    const v2, -0x4325b93

    .line 378
    .line 379
    .line 380
    invoke-static {v2, v5, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 381
    .line 382
    .line 383
    move-result-object v9

    .line 384
    shr-int/lit8 v2, v16, 0x3

    .line 385
    .line 386
    and-int/lit8 v2, v2, 0xe

    .line 387
    .line 388
    or-int/lit16 v2, v2, 0x6180

    .line 389
    .line 390
    const/16 v12, 0xa

    .line 391
    .line 392
    const/4 v6, 0x0

    .line 393
    const/4 v8, 0x0

    .line 394
    move-object/from16 v10, p9

    .line 395
    .line 396
    move-object v5, v11

    .line 397
    move-object v7, v13

    .line 398
    move v11, v2

    .line 399
    invoke-static/range {v5 .. v12}, La/jwb;->e(Ljava/lang/Object;La/mm40;La/cfq;Ljava/lang/String;La/ugd;La/fet;II)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v10, v0}, La/fet;->r(Z)V

    .line 403
    .line 404
    .line 405
    goto :goto_c

    .line 406
    :cond_c
    move-object v10, v12

    .line 407
    const v2, 0x5c58da4d

    .line 408
    .line 409
    .line 410
    invoke-virtual {v10, v2}, La/fet;->e0(I)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v10, v0}, La/fet;->r(Z)V

    .line 414
    .line 415
    .line 416
    :goto_c
    invoke-virtual {v10, v1}, La/fet;->r(Z)V

    .line 417
    .line 418
    .line 419
    goto :goto_d

    .line 420
    :cond_d
    invoke-virtual {v10}, La/fet;->X()V

    .line 421
    .line 422
    .line 423
    :goto_d
    invoke-virtual {v10}, La/fet;->u()La/yfe0;

    .line 424
    .line 425
    .line 426
    move-result-object v11

    .line 427
    if-eqz v11, :cond_e

    .line 428
    .line 429
    new-instance v0, La/vda;

    .line 430
    .line 431
    move-object/from16 v1, p0

    .line 432
    .line 433
    move/from16 v2, p1

    .line 434
    .line 435
    move/from16 v5, p4

    .line 436
    .line 437
    move/from16 v6, p5

    .line 438
    .line 439
    move/from16 v7, p6

    .line 440
    .line 441
    move/from16 v8, p7

    .line 442
    .line 443
    move/from16 v9, p8

    .line 444
    .line 445
    move/from16 v10, p10

    .line 446
    .line 447
    invoke-direct/range {v0 .. v10}, La/vda;-><init>(La/mm40;IZZFFFFFI)V

    .line 448
    .line 449
    .line 450
    iput-object v0, v11, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 451
    .line 452
    :cond_e
    return-void
.end method

.method public static final b(La/mm40;La/iea;La/l7m0;La/fet;I)V
    .locals 35

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v13, p3

    .line 4
    .line 5
    iget-boolean v0, v2, La/iea;->d:Z

    .line 6
    .line 7
    iget-boolean v1, v2, La/iea;->c:Z

    .line 8
    .line 9
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const v3, -0x6a072639    # -1.00509994E-25f

    .line 13
    .line 14
    .line 15
    invoke-virtual {v13, v3}, La/fet;->g0(I)La/fet;

    .line 16
    .line 17
    .line 18
    move-object/from16 v14, p0

    .line 19
    .line 20
    invoke-virtual {v13, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x2

    .line 29
    :goto_0
    or-int v3, p4, v3

    .line 30
    .line 31
    invoke-virtual {v13, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    const/16 v4, 0x20

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/16 v4, 0x10

    .line 41
    .line 42
    :goto_1
    or-int/2addr v3, v4

    .line 43
    and-int/lit16 v4, v3, 0x93

    .line 44
    .line 45
    const/16 v6, 0x92

    .line 46
    .line 47
    if-eq v4, v6, :cond_2

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/4 v4, 0x0

    .line 52
    :goto_2
    and-int/lit8 v6, v3, 0x1

    .line 53
    .line 54
    invoke-virtual {v13, v6, v4}, La/fet;->U(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_15

    .line 59
    .line 60
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const/4 v6, 0x0

    .line 65
    sget-object v8, La/ukd;->a:La/cl5;

    .line 66
    .line 67
    if-ne v4, v8, :cond_3

    .line 68
    .line 69
    invoke-static {v6}, La/xf0;->c(F)La/t33;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    check-cast v4, La/t33;

    .line 77
    .line 78
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    if-ne v9, v8, :cond_4

    .line 83
    .line 84
    invoke-static {v6}, La/xf0;->c(F)La/t33;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    invoke-virtual {v13, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    check-cast v9, La/t33;

    .line 92
    .line 93
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    if-ne v10, v8, :cond_5

    .line 98
    .line 99
    invoke-static {v6}, La/xf0;->c(F)La/t33;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-virtual {v13, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    check-cast v10, La/t33;

    .line 107
    .line 108
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    const/high16 v12, 0x3f800000    # 1.0f

    .line 113
    .line 114
    if-ne v11, v8, :cond_7

    .line 115
    .line 116
    if-eqz v1, :cond_6

    .line 117
    .line 118
    invoke-static {v6}, La/xf0;->c(F)La/t33;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    goto :goto_3

    .line 123
    :cond_6
    invoke-static {v12}, La/xf0;->c(F)La/t33;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    :goto_3
    invoke-virtual {v13, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_7
    check-cast v11, La/t33;

    .line 131
    .line 132
    move/from16 v16, v6

    .line 133
    .line 134
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    if-ne v6, v8, :cond_8

    .line 139
    .line 140
    invoke-static/range {v16 .. v16}, La/xf0;->c(F)La/t33;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-virtual {v13, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_8
    check-cast v6, La/t33;

    .line 148
    .line 149
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    if-ne v7, v8, :cond_9

    .line 154
    .line 155
    invoke-static/range {v16 .. v16}, La/xf0;->c(F)La/t33;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    invoke-virtual {v13, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_9
    check-cast v7, La/t33;

    .line 163
    .line 164
    move/from16 v18, v12

    .line 165
    .line 166
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    if-ne v12, v8, :cond_a

    .line 171
    .line 172
    invoke-static/range {v16 .. v16}, La/xf0;->c(F)La/t33;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    invoke-virtual {v13, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_a
    check-cast v12, La/t33;

    .line 180
    .line 181
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v15

    .line 185
    if-ne v15, v8, :cond_c

    .line 186
    .line 187
    if-eqz v0, :cond_b

    .line 188
    .line 189
    invoke-static/range {v16 .. v16}, La/xf0;->c(F)La/t33;

    .line 190
    .line 191
    .line 192
    move-result-object v15

    .line 193
    goto :goto_4

    .line 194
    :cond_b
    invoke-static/range {v18 .. v18}, La/xf0;->c(F)La/t33;

    .line 195
    .line 196
    .line 197
    move-result-object v15

    .line 198
    :goto_4
    invoke-virtual {v13, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_c
    check-cast v15, La/t33;

    .line 202
    .line 203
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    if-ne v5, v8, :cond_d

    .line 208
    .line 209
    invoke-static/range {v18 .. v18}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    invoke-virtual {v13, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    :cond_d
    move-object/from16 v22, v5

    .line 217
    .line 218
    check-cast v22, La/agk0;

    .line 219
    .line 220
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    if-ne v5, v8, :cond_e

    .line 225
    .line 226
    invoke-static/range {v18 .. v18}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-virtual {v13, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_e
    move-object/from16 v21, v5

    .line 234
    .line 235
    check-cast v21, La/agk0;

    .line 236
    .line 237
    sget v5, La/dea;->a:F

    .line 238
    .line 239
    invoke-static {v5, v13}, La/pkd;->b(FLa/fet;)F

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    move/from16 v18, v0

    .line 244
    .line 245
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    if-ne v0, v8, :cond_f

    .line 250
    .line 251
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 252
    .line 253
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v13, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_f
    check-cast v0, La/pz40;

    .line 261
    .line 262
    move-object/from16 v25, v0

    .line 263
    .line 264
    invoke-interface/range {p2 .. p2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    move/from16 v26, v1

    .line 269
    .line 270
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    if-ne v1, v8, :cond_10

    .line 275
    .line 276
    new-instance v19, La/ee0;

    .line 277
    .line 278
    const/16 v24, 0x15

    .line 279
    .line 280
    const/16 v23, 0x0

    .line 281
    .line 282
    move-object/from16 v20, p2

    .line 283
    .line 284
    invoke-direct/range {v19 .. v24}, La/ee0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 285
    .line 286
    .line 287
    move-object/from16 v1, v19

    .line 288
    .line 289
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    :cond_10
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 293
    .line 294
    invoke-static {v13, v0, v1}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 295
    .line 296
    .line 297
    iget v0, v2, La/iea;->a:I

    .line 298
    .line 299
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    iget v1, v2, La/iea;->b:I

    .line 304
    .line 305
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-static/range {v26 .. v26}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    move/from16 v19, v3

    .line 314
    .line 315
    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {v13, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    invoke-virtual {v13, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    or-int/2addr v1, v2

    .line 332
    invoke-virtual {v13, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    or-int/2addr v1, v2

    .line 337
    invoke-virtual {v13, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    or-int/2addr v1, v2

    .line 342
    invoke-virtual {v13, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    or-int/2addr v1, v2

    .line 347
    invoke-virtual {v13, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    or-int/2addr v1, v2

    .line 352
    and-int/lit8 v2, v19, 0x70

    .line 353
    .line 354
    const/16 v3, 0x20

    .line 355
    .line 356
    if-eq v2, v3, :cond_11

    .line 357
    .line 358
    const/16 v17, 0x0

    .line 359
    .line 360
    goto :goto_5

    .line 361
    :cond_11
    const/16 v17, 0x1

    .line 362
    .line 363
    :goto_5
    or-int v1, v1, v17

    .line 364
    .line 365
    invoke-virtual {v13, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    or-int/2addr v1, v2

    .line 370
    invoke-virtual {v13, v5}, La/fet;->d(F)Z

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    or-int/2addr v1, v2

    .line 375
    invoke-virtual {v13, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    or-int/2addr v1, v2

    .line 380
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    if-nez v1, :cond_12

    .line 385
    .line 386
    if-ne v2, v8, :cond_13

    .line 387
    .line 388
    :cond_12
    move-object v1, v0

    .line 389
    goto :goto_6

    .line 390
    :cond_13
    move-object v1, v4

    .line 391
    move-object/from16 v16, v7

    .line 392
    .line 393
    move-object v3, v10

    .line 394
    move-object v8, v11

    .line 395
    move-object/from16 v17, v12

    .line 396
    .line 397
    move-object/from16 v18, v15

    .line 398
    .line 399
    move-object/from16 v11, p1

    .line 400
    .line 401
    move-object v15, v0

    .line 402
    move-object v0, v2

    .line 403
    move-object v12, v6

    .line 404
    move-object v2, v9

    .line 405
    goto :goto_7

    .line 406
    :goto_6
    new-instance v0, La/wda;

    .line 407
    .line 408
    move-object v2, v1

    .line 409
    move-object v1, v4

    .line 410
    move-object v4, v6

    .line 411
    move-object v6, v12

    .line 412
    const/4 v12, 0x0

    .line 413
    move-object v3, v10

    .line 414
    move-object v8, v11

    .line 415
    move-object v10, v15

    .line 416
    move-object/from16 v11, v25

    .line 417
    .line 418
    move-object v15, v2

    .line 419
    move-object v2, v9

    .line 420
    move v9, v5

    .line 421
    move-object v5, v7

    .line 422
    move-object/from16 v7, p1

    .line 423
    .line 424
    invoke-direct/range {v0 .. v12}, La/wda;-><init>(La/t33;La/t33;La/t33;La/t33;La/t33;La/t33;La/iea;La/t33;FLa/t33;La/pz40;La/yje;)V

    .line 425
    .line 426
    .line 427
    move-object v12, v4

    .line 428
    move-object/from16 v16, v5

    .line 429
    .line 430
    move-object/from16 v17, v6

    .line 431
    .line 432
    move-object v11, v7

    .line 433
    move-object/from16 v18, v10

    .line 434
    .line 435
    invoke-virtual {v13, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    :goto_7
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 439
    .line 440
    invoke-static {v15, v0, v13}, La/m0x0;->w([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 441
    .line 442
    .line 443
    invoke-static {v14}, La/lgb;->K(La/mm40;)La/mm40;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    sget-object v4, La/uc9;->e:La/nw3;

    .line 448
    .line 449
    sget-object v5, La/gqw0;->j:La/yx7;

    .line 450
    .line 451
    const/4 v6, 0x6

    .line 452
    invoke-static {v4, v5, v13, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    iget-wide v5, v13, La/fet;->T:J

    .line 457
    .line 458
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 459
    .line 460
    .line 461
    move-result v5

    .line 462
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 463
    .line 464
    .line 465
    move-result-object v6

    .line 466
    invoke-static {v13, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 471
    .line 472
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v13}, La/fet;->i0()V

    .line 476
    .line 477
    .line 478
    iget-boolean v7, v13, La/fet;->S:Z

    .line 479
    .line 480
    if-eqz v7, :cond_14

    .line 481
    .line 482
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 483
    .line 484
    invoke-virtual {v13, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 485
    .line 486
    .line 487
    goto :goto_8

    .line 488
    :cond_14
    invoke-virtual {v13}, La/fet;->r0()V

    .line 489
    .line 490
    .line 491
    :goto_8
    sget-object v7, La/gqw0;->x:La/shd;

    .line 492
    .line 493
    invoke-static {v13, v4, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 494
    .line 495
    .line 496
    sget-object v4, La/gqw0;->w:La/shd;

    .line 497
    .line 498
    invoke-static {v13, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 499
    .line 500
    .line 501
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    sget-object v5, La/gqw0;->y:La/shd;

    .line 506
    .line 507
    invoke-static {v13, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 508
    .line 509
    .line 510
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 511
    .line 512
    .line 513
    sget-object v4, La/gqw0;->v:La/shd;

    .line 514
    .line 515
    invoke-static {v13, v0, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 516
    .line 517
    .line 518
    move-object v4, v1

    .line 519
    iget v1, v11, La/iea;->a:I

    .line 520
    .line 521
    move-object v9, v2

    .line 522
    iget-boolean v2, v11, La/iea;->c:Z

    .line 523
    .line 524
    invoke-virtual {v4}, La/t33;->d()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    check-cast v0, Ljava/lang/Number;

    .line 529
    .line 530
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 531
    .line 532
    .line 533
    move-result v4

    .line 534
    invoke-virtual {v9}, La/t33;->d()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    check-cast v0, Ljava/lang/Number;

    .line 539
    .line 540
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 541
    .line 542
    .line 543
    move-result v5

    .line 544
    invoke-virtual {v3}, La/t33;->d()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    check-cast v0, Ljava/lang/Number;

    .line 549
    .line 550
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 551
    .line 552
    .line 553
    move-result v6

    .line 554
    sget-object v0, La/qmk;->a:La/zcl;

    .line 555
    .line 556
    const/16 v25, 0x0

    .line 557
    .line 558
    const/16 v28, 0x3

    .line 559
    .line 560
    sget-object v29, La/jm40;->b:La/jm40;

    .line 561
    .line 562
    const/16 v24, 0x0

    .line 563
    .line 564
    const/high16 v26, 0x40800000    # 4.0f

    .line 565
    .line 566
    const/high16 v27, 0x42a40000    # 82.0f

    .line 567
    .line 568
    move-object/from16 v23, v29

    .line 569
    .line 570
    invoke-static/range {v23 .. v28}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual/range {v21 .. v21}, La/agk0;->l()F

    .line 575
    .line 576
    .line 577
    move-result v7

    .line 578
    iget-boolean v3, v11, La/iea;->e:Z

    .line 579
    .line 580
    invoke-virtual {v8}, La/t33;->d()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    check-cast v8, Ljava/lang/Number;

    .line 585
    .line 586
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 587
    .line 588
    .line 589
    move-result v8

    .line 590
    const/4 v10, 0x0

    .line 591
    move-object v9, v13

    .line 592
    invoke-static/range {v0 .. v10}, La/dea;->a(La/mm40;IZZFFFFFLa/fet;I)V

    .line 593
    .line 594
    .line 595
    iget v1, v11, La/iea;->b:I

    .line 596
    .line 597
    iget-boolean v2, v11, La/iea;->d:Z

    .line 598
    .line 599
    invoke-virtual {v12}, La/t33;->d()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    check-cast v0, Ljava/lang/Number;

    .line 604
    .line 605
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 606
    .line 607
    .line 608
    move-result v4

    .line 609
    invoke-virtual/range {v16 .. v16}, La/t33;->d()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    check-cast v0, Ljava/lang/Number;

    .line 614
    .line 615
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 616
    .line 617
    .line 618
    move-result v5

    .line 619
    invoke-virtual/range {v17 .. v17}, La/t33;->d()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    check-cast v0, Ljava/lang/Number;

    .line 624
    .line 625
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 626
    .line 627
    .line 628
    move-result v6

    .line 629
    const/16 v32, 0x0

    .line 630
    .line 631
    const/16 v34, 0x6

    .line 632
    .line 633
    const/high16 v30, 0x40800000    # 4.0f

    .line 634
    .line 635
    const/16 v31, 0x0

    .line 636
    .line 637
    const/high16 v33, 0x42a40000    # 82.0f

    .line 638
    .line 639
    invoke-static/range {v29 .. v34}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-virtual/range {v22 .. v22}, La/agk0;->l()F

    .line 644
    .line 645
    .line 646
    move-result v7

    .line 647
    iget-boolean v3, v11, La/iea;->e:Z

    .line 648
    .line 649
    invoke-virtual/range {v18 .. v18}, La/t33;->d()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v8

    .line 653
    check-cast v8, Ljava/lang/Number;

    .line 654
    .line 655
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 656
    .line 657
    .line 658
    move-result v8

    .line 659
    move-object/from16 v9, p3

    .line 660
    .line 661
    invoke-static/range {v0 .. v10}, La/dea;->a(La/mm40;IZZFFFFFLa/fet;I)V

    .line 662
    .line 663
    .line 664
    const/4 v0, 0x1

    .line 665
    invoke-virtual {v9, v0}, La/fet;->r(Z)V

    .line 666
    .line 667
    .line 668
    goto :goto_9

    .line 669
    :cond_15
    move-object v11, v2

    .line 670
    move-object v9, v13

    .line 671
    invoke-virtual {v9}, La/fet;->X()V

    .line 672
    .line 673
    .line 674
    :goto_9
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 675
    .line 676
    .line 677
    move-result-object v6

    .line 678
    if-eqz v6, :cond_16

    .line 679
    .line 680
    new-instance v0, La/zb8;

    .line 681
    .line 682
    const/16 v5, 0x14

    .line 683
    .line 684
    move-object/from16 v3, p2

    .line 685
    .line 686
    move/from16 v4, p4

    .line 687
    .line 688
    move-object v2, v11

    .line 689
    move-object v1, v14

    .line 690
    invoke-direct/range {v0 .. v5}, La/zb8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 691
    .line 692
    .line 693
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 694
    .line 695
    :cond_16
    return-void
.end method

.method public static final c(La/t33;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, La/xda;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/xda;

    .line 7
    .line 8
    iget v1, v0, La/xda;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/xda;->j:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/xda;

    .line 22
    .line 23
    invoke-direct {v0, p1}, La/zje;-><init>(La/yje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v6, La/xda;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/xda;->j:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move p1, v2

    .line 53
    new-instance v2, Ljava/lang/Float;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    .line 57
    .line 58
    .line 59
    new-instance v3, La/zsf;

    .line 60
    .line 61
    const/high16 v4, 0x3f800000    # 1.0f

    .line 62
    .line 63
    invoke-direct {v3, v1, v4, v4, v4}, La/zsf;-><init>(FFFF)V

    .line 64
    .line 65
    .line 66
    const/4 v1, 0x2

    .line 67
    const/16 v4, 0x258

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    invoke-static {v4, v5, v3, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iput p1, v6, La/xda;->j:I

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    const/16 v7, 0xc

    .line 79
    .line 80
    move-object v1, p0

    .line 81
    invoke-static/range {v1 .. v7}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, v0, :cond_3

    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_3
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0
.end method

.method public static final d(La/t33;La/t33;La/t33;La/t33;La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p4, La/yda;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/yda;

    .line 7
    .line 8
    iget v1, v0, La/yda;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/yda;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/yda;

    .line 21
    .line 22
    invoke-direct {v0, p4}, La/zje;-><init>(La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/yda;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/yda;->j:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v4, La/zda;

    .line 51
    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    move-object v5, p0

    .line 55
    move-object v6, p1

    .line 56
    move-object v7, p2

    .line 57
    move-object v8, p3

    .line 58
    invoke-direct/range {v4 .. v10}, La/zda;-><init>(La/t33;La/t33;La/t33;La/t33;La/yje;B)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, La/yda;->j:I

    .line 62
    .line 63
    invoke-static {v0, v4}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-ne p0, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0
.end method

.method public static final e(La/t33;La/t33;La/t33;La/t33;La/t33;La/t33;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p6, La/aea;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/aea;

    .line 7
    .line 8
    iget v1, v0, La/aea;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/aea;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/aea;

    .line 21
    .line 22
    invoke-direct {v0, p6}, La/zje;-><init>(La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, La/aea;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/aea;->o:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    packed-switch v2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v4

    .line 42
    :pswitch_0
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_7

    .line 46
    .line 47
    :pswitch_1
    iget-object p0, v0, La/aea;->m:La/t33;

    .line 48
    .line 49
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :pswitch_2
    iget-object p0, v0, La/aea;->m:La/t33;

    .line 55
    .line 56
    iget-object p1, v0, La/aea;->l:La/t33;

    .line 57
    .line 58
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :pswitch_3
    iget-object p0, v0, La/aea;->m:La/t33;

    .line 64
    .line 65
    iget-object p1, v0, La/aea;->l:La/t33;

    .line 66
    .line 67
    iget-object p2, v0, La/aea;->k:La/t33;

    .line 68
    .line 69
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :pswitch_4
    iget-object p0, v0, La/aea;->m:La/t33;

    .line 75
    .line 76
    iget-object p1, v0, La/aea;->l:La/t33;

    .line 77
    .line 78
    iget-object p2, v0, La/aea;->k:La/t33;

    .line 79
    .line 80
    iget-object p3, v0, La/aea;->j:La/t33;

    .line 81
    .line 82
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :pswitch_5
    iget-object p5, v0, La/aea;->m:La/t33;

    .line 87
    .line 88
    iget-object p4, v0, La/aea;->l:La/t33;

    .line 89
    .line 90
    iget-object p3, v0, La/aea;->k:La/t33;

    .line 91
    .line 92
    iget-object p2, v0, La/aea;->j:La/t33;

    .line 93
    .line 94
    iget-object p1, v0, La/aea;->i:La/t33;

    .line 95
    .line 96
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :pswitch_6
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    new-instance p6, Ljava/lang/Float;

    .line 104
    .line 105
    invoke-direct {p6, v3}, Ljava/lang/Float;-><init>(F)V

    .line 106
    .line 107
    .line 108
    iput-object p1, v0, La/aea;->i:La/t33;

    .line 109
    .line 110
    iput-object p2, v0, La/aea;->j:La/t33;

    .line 111
    .line 112
    iput-object p3, v0, La/aea;->k:La/t33;

    .line 113
    .line 114
    iput-object p4, v0, La/aea;->l:La/t33;

    .line 115
    .line 116
    iput-object p5, v0, La/aea;->m:La/t33;

    .line 117
    .line 118
    const/4 v2, 0x1

    .line 119
    iput v2, v0, La/aea;->o:I

    .line 120
    .line 121
    invoke-virtual {p0, v0, p6}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-ne p0, v1, :cond_1

    .line 126
    .line 127
    goto/16 :goto_6

    .line 128
    .line 129
    :cond_1
    :goto_1
    new-instance p0, Ljava/lang/Float;

    .line 130
    .line 131
    invoke-direct {p0, v3}, Ljava/lang/Float;-><init>(F)V

    .line 132
    .line 133
    .line 134
    iput-object v4, v0, La/aea;->i:La/t33;

    .line 135
    .line 136
    iput-object p2, v0, La/aea;->j:La/t33;

    .line 137
    .line 138
    iput-object p3, v0, La/aea;->k:La/t33;

    .line 139
    .line 140
    iput-object p4, v0, La/aea;->l:La/t33;

    .line 141
    .line 142
    iput-object p5, v0, La/aea;->m:La/t33;

    .line 143
    .line 144
    const/4 p6, 0x2

    .line 145
    iput p6, v0, La/aea;->o:I

    .line 146
    .line 147
    invoke-virtual {p1, v0, p0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    if-ne p0, v1, :cond_2

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_2
    move-object p0, p3

    .line 155
    move-object p3, p2

    .line 156
    move-object p2, p0

    .line 157
    move-object p1, p4

    .line 158
    move-object p0, p5

    .line 159
    :goto_2
    new-instance p4, Ljava/lang/Float;

    .line 160
    .line 161
    invoke-direct {p4, v3}, Ljava/lang/Float;-><init>(F)V

    .line 162
    .line 163
    .line 164
    iput-object v4, v0, La/aea;->i:La/t33;

    .line 165
    .line 166
    iput-object v4, v0, La/aea;->j:La/t33;

    .line 167
    .line 168
    iput-object p2, v0, La/aea;->k:La/t33;

    .line 169
    .line 170
    iput-object p1, v0, La/aea;->l:La/t33;

    .line 171
    .line 172
    iput-object p0, v0, La/aea;->m:La/t33;

    .line 173
    .line 174
    const/4 p5, 0x3

    .line 175
    iput p5, v0, La/aea;->o:I

    .line 176
    .line 177
    invoke-virtual {p3, v0, p4}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p3

    .line 181
    if-ne p3, v1, :cond_3

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_3
    :goto_3
    new-instance p3, Ljava/lang/Float;

    .line 185
    .line 186
    invoke-direct {p3, v3}, Ljava/lang/Float;-><init>(F)V

    .line 187
    .line 188
    .line 189
    iput-object v4, v0, La/aea;->i:La/t33;

    .line 190
    .line 191
    iput-object v4, v0, La/aea;->j:La/t33;

    .line 192
    .line 193
    iput-object v4, v0, La/aea;->k:La/t33;

    .line 194
    .line 195
    iput-object p1, v0, La/aea;->l:La/t33;

    .line 196
    .line 197
    iput-object p0, v0, La/aea;->m:La/t33;

    .line 198
    .line 199
    const/4 p4, 0x4

    .line 200
    iput p4, v0, La/aea;->o:I

    .line 201
    .line 202
    invoke-virtual {p2, v0, p3}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    if-ne p2, v1, :cond_4

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_4
    :goto_4
    new-instance p2, Ljava/lang/Float;

    .line 210
    .line 211
    invoke-direct {p2, v3}, Ljava/lang/Float;-><init>(F)V

    .line 212
    .line 213
    .line 214
    iput-object v4, v0, La/aea;->i:La/t33;

    .line 215
    .line 216
    iput-object v4, v0, La/aea;->j:La/t33;

    .line 217
    .line 218
    iput-object v4, v0, La/aea;->k:La/t33;

    .line 219
    .line 220
    iput-object v4, v0, La/aea;->l:La/t33;

    .line 221
    .line 222
    iput-object p0, v0, La/aea;->m:La/t33;

    .line 223
    .line 224
    const/4 p3, 0x5

    .line 225
    iput p3, v0, La/aea;->o:I

    .line 226
    .line 227
    invoke-virtual {p1, v0, p2}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    if-ne p1, v1, :cond_5

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_5
    :goto_5
    new-instance p1, Ljava/lang/Float;

    .line 235
    .line 236
    invoke-direct {p1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 237
    .line 238
    .line 239
    iput-object v4, v0, La/aea;->i:La/t33;

    .line 240
    .line 241
    iput-object v4, v0, La/aea;->j:La/t33;

    .line 242
    .line 243
    iput-object v4, v0, La/aea;->k:La/t33;

    .line 244
    .line 245
    iput-object v4, v0, La/aea;->l:La/t33;

    .line 246
    .line 247
    iput-object v4, v0, La/aea;->m:La/t33;

    .line 248
    .line 249
    const/4 p2, 0x6

    .line 250
    iput p2, v0, La/aea;->o:I

    .line 251
    .line 252
    invoke-virtual {p0, v0, p1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    if-ne p0, v1, :cond_6

    .line 257
    .line 258
    :goto_6
    return-object v1

    .line 259
    :cond_6
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object p0

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final f(La/t33;La/t33;La/t33;La/t33;FLa/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p5, La/bea;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/bea;

    .line 7
    .line 8
    iget v1, v0, La/bea;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/bea;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/bea;

    .line 21
    .line 22
    invoke-direct {v0, p5}, La/zje;-><init>(La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/bea;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/bea;->n:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v2, :cond_5

    .line 37
    .line 38
    if-eq v2, v6, :cond_4

    .line 39
    .line 40
    if-eq v2, v5, :cond_3

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v7

    .line 57
    :cond_2
    iget p0, v0, La/bea;->l:F

    .line 58
    .line 59
    iget-object p1, v0, La/bea;->k:La/t33;

    .line 60
    .line 61
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    iget p0, v0, La/bea;->l:F

    .line 66
    .line 67
    iget-object p1, v0, La/bea;->k:La/t33;

    .line 68
    .line 69
    iget-object p2, v0, La/bea;->j:La/t33;

    .line 70
    .line 71
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    iget p4, v0, La/bea;->l:F

    .line 76
    .line 77
    iget-object p3, v0, La/bea;->k:La/t33;

    .line 78
    .line 79
    iget-object p2, v0, La/bea;->j:La/t33;

    .line 80
    .line 81
    iget-object p1, v0, La/bea;->i:La/t33;

    .line 82
    .line 83
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    new-instance p5, Ljava/lang/Float;

    .line 91
    .line 92
    invoke-direct {p5, p4}, Ljava/lang/Float;-><init>(F)V

    .line 93
    .line 94
    .line 95
    iput-object p1, v0, La/bea;->i:La/t33;

    .line 96
    .line 97
    iput-object p2, v0, La/bea;->j:La/t33;

    .line 98
    .line 99
    iput-object p3, v0, La/bea;->k:La/t33;

    .line 100
    .line 101
    iput p4, v0, La/bea;->l:F

    .line 102
    .line 103
    iput v6, v0, La/bea;->n:I

    .line 104
    .line 105
    invoke-virtual {p0, v0, p5}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-ne p0, v1, :cond_6

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    :goto_1
    new-instance p0, Ljava/lang/Float;

    .line 113
    .line 114
    sget p5, La/dea;->b:F

    .line 115
    .line 116
    invoke-direct {p0, p5}, Ljava/lang/Float;-><init>(F)V

    .line 117
    .line 118
    .line 119
    iput-object v7, v0, La/bea;->i:La/t33;

    .line 120
    .line 121
    iput-object p2, v0, La/bea;->j:La/t33;

    .line 122
    .line 123
    iput-object p3, v0, La/bea;->k:La/t33;

    .line 124
    .line 125
    iput p4, v0, La/bea;->l:F

    .line 126
    .line 127
    iput v5, v0, La/bea;->n:I

    .line 128
    .line 129
    invoke-virtual {p1, v0, p0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-ne p0, v1, :cond_7

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_7
    move-object p1, p3

    .line 137
    move p0, p4

    .line 138
    :goto_2
    new-instance p3, Ljava/lang/Float;

    .line 139
    .line 140
    const/high16 p4, -0x3d4c0000    # -90.0f

    .line 141
    .line 142
    invoke-direct {p3, p4}, Ljava/lang/Float;-><init>(F)V

    .line 143
    .line 144
    .line 145
    iput-object v7, v0, La/bea;->i:La/t33;

    .line 146
    .line 147
    iput-object v7, v0, La/bea;->j:La/t33;

    .line 148
    .line 149
    iput-object p1, v0, La/bea;->k:La/t33;

    .line 150
    .line 151
    iput p0, v0, La/bea;->l:F

    .line 152
    .line 153
    iput v4, v0, La/bea;->n:I

    .line 154
    .line 155
    invoke-virtual {p2, v0, p3}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    if-ne p2, v1, :cond_8

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_8
    :goto_3
    new-instance p2, Ljava/lang/Float;

    .line 163
    .line 164
    const/high16 p3, 0x3f800000    # 1.0f

    .line 165
    .line 166
    invoke-direct {p2, p3}, Ljava/lang/Float;-><init>(F)V

    .line 167
    .line 168
    .line 169
    iput-object v7, v0, La/bea;->i:La/t33;

    .line 170
    .line 171
    iput-object v7, v0, La/bea;->j:La/t33;

    .line 172
    .line 173
    iput-object v7, v0, La/bea;->k:La/t33;

    .line 174
    .line 175
    iput p0, v0, La/bea;->l:F

    .line 176
    .line 177
    iput v3, v0, La/bea;->n:I

    .line 178
    .line 179
    invoke-virtual {p1, v0, p2}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    if-ne p0, v1, :cond_9

    .line 184
    .line 185
    :goto_4
    return-object v1

    .line 186
    :cond_9
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object p0
.end method

.method public static final g(La/t33;La/t33;La/t33;La/t33;La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p4, La/cea;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/cea;

    .line 7
    .line 8
    iget v1, v0, La/cea;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/cea;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/cea;

    .line 21
    .line 22
    invoke-direct {v0, p4}, La/zje;-><init>(La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/cea;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/cea;->j:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v4, La/zda;

    .line 51
    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x1

    .line 54
    move-object v5, p0

    .line 55
    move-object v6, p1

    .line 56
    move-object v7, p2

    .line 57
    move-object v8, p3

    .line 58
    invoke-direct/range {v4 .. v10}, La/zda;-><init>(La/t33;La/t33;La/t33;La/t33;La/yje;B)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, La/cea;->j:I

    .line 62
    .line 63
    invoke-static {v0, v4}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-ne p0, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0
.end method
