.class public abstract La/tz7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x42c40000    # 98.0f

    .line 4
    .line 5
    sput v0, La/tz7;->a:F

    .line 6
    .line 7
    const/high16 v0, 0x42fc0000    # 126.0f

    .line 8
    .line 9
    sput v0, La/tz7;->b:F

    .line 10
    .line 11
    const/high16 v0, 0x43200000    # 160.0f

    .line 12
    .line 13
    sput v0, La/tz7;->c:F

    .line 14
    .line 15
    return-void
.end method

.method public static final a(La/mm40;La/d08;La/rz7;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    move-object/from16 v7, p7

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-boolean v12, v2, La/d08;->b:Z

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const v3, -0x1f966caa

    .line 32
    .line 33
    .line 34
    invoke-virtual {v7, v3}, La/fet;->g0(I)La/fet;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/4 v13, 0x2

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    const/4 v3, 0x4

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v3, v13

    .line 47
    :goto_0
    or-int v3, p8, v3

    .line 48
    .line 49
    invoke-virtual {v7, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    const/16 v5, 0x20

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/16 v5, 0x10

    .line 59
    .line 60
    :goto_1
    or-int/2addr v3, v5

    .line 61
    invoke-virtual {v7, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    const/16 v5, 0x100

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    const/16 v5, 0x80

    .line 71
    .line 72
    :goto_2
    or-int/2addr v3, v5

    .line 73
    invoke-virtual {v7, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_3

    .line 78
    .line 79
    const/16 v5, 0x800

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_3
    const/16 v5, 0x400

    .line 83
    .line 84
    :goto_3
    or-int/2addr v3, v5

    .line 85
    move-object/from16 v15, p4

    .line 86
    .line 87
    invoke-virtual {v7, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_4

    .line 92
    .line 93
    const/16 v5, 0x4000

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_4
    const/16 v5, 0x2000

    .line 97
    .line 98
    :goto_4
    or-int/2addr v3, v5

    .line 99
    move-object/from16 v5, p5

    .line 100
    .line 101
    invoke-virtual {v7, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_5

    .line 106
    .line 107
    const/high16 v6, 0x20000

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_5
    const/high16 v6, 0x10000

    .line 111
    .line 112
    :goto_5
    or-int/2addr v3, v6

    .line 113
    move-object/from16 v6, p6

    .line 114
    .line 115
    invoke-virtual {v7, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_6

    .line 120
    .line 121
    const/high16 v8, 0x100000

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_6
    const/high16 v8, 0x80000

    .line 125
    .line 126
    :goto_6
    or-int/2addr v3, v8

    .line 127
    const v8, 0x92493

    .line 128
    .line 129
    .line 130
    and-int/2addr v8, v3

    .line 131
    const v9, 0x92492

    .line 132
    .line 133
    .line 134
    const/4 v10, 0x0

    .line 135
    const/4 v11, 0x1

    .line 136
    if-eq v8, v9, :cond_7

    .line 137
    .line 138
    move v8, v11

    .line 139
    goto :goto_7

    .line 140
    :cond_7
    move v8, v10

    .line 141
    :goto_7
    and-int/lit8 v9, v3, 0x1

    .line 142
    .line 143
    invoke-virtual {v7, v9, v8}, La/fet;->U(IZ)Z

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    if-eqz v8, :cond_15

    .line 148
    .line 149
    const/16 v16, 0x0

    .line 150
    .line 151
    const/high16 v17, 0x3f800000    # 1.0f

    .line 152
    .line 153
    if-eqz v12, :cond_8

    .line 154
    .line 155
    move/from16 v5, v17

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :cond_8
    move/from16 v5, v16

    .line 159
    .line 160
    :goto_8
    sget-object v8, La/jz7;->c:La/zsf;

    .line 161
    .line 162
    const/16 v9, 0x96

    .line 163
    .line 164
    invoke-static {v9, v10, v8, v13}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    move/from16 v18, v10

    .line 169
    .line 170
    const/16 v10, 0xc00

    .line 171
    .line 172
    move/from16 v19, v11

    .line 173
    .line 174
    const/16 v11, 0x14

    .line 175
    .line 176
    const-string v7, "BigPigWaitingCrossfade"

    .line 177
    .line 178
    move-object/from16 v20, v8

    .line 179
    .line 180
    const/4 v8, 0x0

    .line 181
    move v15, v9

    .line 182
    move/from16 v14, v18

    .line 183
    .line 184
    move-object/from16 v4, v20

    .line 185
    .line 186
    move-object/from16 v9, p7

    .line 187
    .line 188
    invoke-static/range {v5 .. v11}, La/d43;->b(FLa/j73;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    iget-boolean v6, v2, La/d08;->c:Z

    .line 193
    .line 194
    if-eqz v6, :cond_9

    .line 195
    .line 196
    move/from16 v16, v17

    .line 197
    .line 198
    :cond_9
    invoke-static {v15, v14, v4, v13}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    const/16 v10, 0xc00

    .line 203
    .line 204
    const/16 v11, 0x14

    .line 205
    .line 206
    const-string v7, "BigPigSadCrossfade"

    .line 207
    .line 208
    const/4 v8, 0x0

    .line 209
    move-object/from16 v9, p7

    .line 210
    .line 211
    move-object v13, v5

    .line 212
    move/from16 v5, v16

    .line 213
    .line 214
    invoke-static/range {v5 .. v11}, La/d43;->b(FLa/j73;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    move-object v7, v9

    .line 219
    and-int/lit16 v4, v3, 0x1c00

    .line 220
    .line 221
    const/16 v5, 0x800

    .line 222
    .line 223
    if-ne v4, v5, :cond_a

    .line 224
    .line 225
    const/4 v4, 0x1

    .line 226
    goto :goto_9

    .line 227
    :cond_a
    move v4, v14

    .line 228
    :goto_9
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    sget-object v9, La/ukd;->a:La/cl5;

    .line 233
    .line 234
    if-nez v4, :cond_b

    .line 235
    .line 236
    if-ne v5, v9, :cond_c

    .line 237
    .line 238
    :cond_b
    new-instance v5, La/y;

    .line 239
    .line 240
    const/16 v4, 0xa

    .line 241
    .line 242
    invoke-direct {v5, v0, v4}, La/y;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :cond_c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 249
    .line 250
    sget-object v4, La/jm40;->b:La/jm40;

    .line 251
    .line 252
    invoke-static {v4, v5}, La/ffb0;->P(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    sget-object v4, La/gqw0;->h:La/zx7;

    .line 257
    .line 258
    invoke-static {v4, v14}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    iget-wide v5, v7, La/fet;->T:J

    .line 263
    .line 264
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    invoke-static {v7, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    sget-object v15, La/mkd;->c0:La/gqw0;

    .line 277
    .line 278
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v7}, La/fet;->i0()V

    .line 282
    .line 283
    .line 284
    iget-boolean v15, v7, La/fet;->S:Z

    .line 285
    .line 286
    if-eqz v15, :cond_d

    .line 287
    .line 288
    sget-object v15, La/e7z;->u1:La/pcy;

    .line 289
    .line 290
    invoke-virtual {v7, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 291
    .line 292
    .line 293
    goto :goto_a

    .line 294
    :cond_d
    invoke-virtual {v7}, La/fet;->r0()V

    .line 295
    .line 296
    .line 297
    :goto_a
    sget-object v15, La/gqw0;->x:La/shd;

    .line 298
    .line 299
    invoke-static {v7, v4, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 300
    .line 301
    .line 302
    sget-object v4, La/gqw0;->w:La/shd;

    .line 303
    .line 304
    invoke-static {v7, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 305
    .line 306
    .line 307
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    sget-object v5, La/gqw0;->y:La/shd;

    .line 312
    .line 313
    invoke-static {v7, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v7}, La/jpm0;->n(La/fet;)V

    .line 317
    .line 318
    .line 319
    sget-object v4, La/gqw0;->v:La/shd;

    .line 320
    .line 321
    invoke-static {v7, v8, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 322
    .line 323
    .line 324
    iget-boolean v4, v2, La/d08;->e:Z

    .line 325
    .line 326
    if-eqz v4, :cond_e

    .line 327
    .line 328
    const v4, -0x2282e1d5

    .line 329
    .line 330
    .line 331
    invoke-virtual {v7, v4}, La/fet;->e0(I)V

    .line 332
    .line 333
    .line 334
    shr-int/lit8 v4, v3, 0x3

    .line 335
    .line 336
    and-int/lit8 v4, v4, 0x70

    .line 337
    .line 338
    shr-int/lit8 v3, v3, 0x9

    .line 339
    .line 340
    and-int/lit16 v5, v3, 0x380

    .line 341
    .line 342
    or-int/2addr v4, v5

    .line 343
    and-int/lit16 v3, v3, 0x1c00

    .line 344
    .line 345
    or-int v8, v4, v3

    .line 346
    .line 347
    const/4 v3, 0x0

    .line 348
    move-object/from16 v4, p2

    .line 349
    .line 350
    move-object/from16 v5, p5

    .line 351
    .line 352
    move-object/from16 v6, p6

    .line 353
    .line 354
    invoke-static/range {v3 .. v8}, La/t18;->a(La/mm40;La/rz7;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v7, v14}, La/fet;->r(Z)V

    .line 358
    .line 359
    .line 360
    const/4 v9, 0x1

    .line 361
    goto/16 :goto_d

    .line 362
    .line 363
    :cond_e
    const v4, -0x227f8f45

    .line 364
    .line 365
    .line 366
    invoke-virtual {v7, v4}, La/fet;->e0(I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v7, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v4

    .line 373
    invoke-virtual {v7, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    or-int/2addr v4, v5

    .line 378
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    if-nez v4, :cond_f

    .line 383
    .line 384
    if-ne v5, v9, :cond_10

    .line 385
    .line 386
    :cond_f
    new-instance v5, La/sz7;

    .line 387
    .line 388
    invoke-direct {v5, v13, v10, v14}, La/sz7;-><init>(La/l7m0;La/l7m0;B)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    :cond_10
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 395
    .line 396
    invoke-static {v11, v5}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    iget-boolean v5, v2, La/d08;->a:Z

    .line 401
    .line 402
    shr-int/lit8 v3, v3, 0x3

    .line 403
    .line 404
    and-int/lit8 v15, v3, 0x70

    .line 405
    .line 406
    and-int/lit16 v8, v3, 0x1c70

    .line 407
    .line 408
    move-object/from16 v6, p4

    .line 409
    .line 410
    move-object v3, v4

    .line 411
    move-object/from16 v4, p2

    .line 412
    .line 413
    invoke-static/range {v3 .. v8}, La/l18;->a(La/mm40;La/rz7;ZLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 414
    .line 415
    .line 416
    move-object v3, v4

    .line 417
    invoke-virtual {v7, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v4

    .line 421
    invoke-virtual {v7, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    or-int/2addr v4, v5

    .line 426
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v5

    .line 430
    if-nez v4, :cond_12

    .line 431
    .line 432
    if-ne v5, v9, :cond_11

    .line 433
    .line 434
    goto :goto_b

    .line 435
    :cond_11
    const/4 v4, 0x1

    .line 436
    goto :goto_c

    .line 437
    :cond_12
    :goto_b
    new-instance v5, La/sz7;

    .line 438
    .line 439
    const/4 v4, 0x1

    .line 440
    invoke-direct {v5, v13, v10, v4}, La/sz7;-><init>(La/l7m0;La/l7m0;B)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    :goto_c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 447
    .line 448
    invoke-static {v11, v5}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 449
    .line 450
    .line 451
    move-result-object v5

    .line 452
    invoke-static {v5, v3, v12, v7, v15}, La/u18;->a(La/mm40;La/rz7;ZLa/fet;I)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v7, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v5

    .line 459
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    if-nez v5, :cond_13

    .line 464
    .line 465
    if-ne v6, v9, :cond_14

    .line 466
    .line 467
    :cond_13
    new-instance v6, La/yd1;

    .line 468
    .line 469
    const/16 v5, 0x17

    .line 470
    .line 471
    invoke-direct {v6, v10, v5}, La/yd1;-><init>(La/l7m0;B)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v7, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    :cond_14
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 478
    .line 479
    invoke-static {v11, v6}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    iget-object v7, v3, La/rz7;->g:Ljava/lang/String;

    .line 484
    .line 485
    const/4 v3, 0x0

    .line 486
    move/from16 v19, v4

    .line 487
    .line 488
    const/4 v4, 0x4

    .line 489
    const/4 v8, 0x0

    .line 490
    move-object/from16 v5, p7

    .line 491
    .line 492
    move/from16 v9, v19

    .line 493
    .line 494
    invoke-static/range {v3 .. v8}, La/vbw0;->H(IILa/fet;La/mm40;Ljava/lang/String;Z)V

    .line 495
    .line 496
    .line 497
    move-object v7, v5

    .line 498
    invoke-virtual {v7, v14}, La/fet;->r(Z)V

    .line 499
    .line 500
    .line 501
    :goto_d
    invoke-virtual {v7, v9}, La/fet;->r(Z)V

    .line 502
    .line 503
    .line 504
    goto :goto_e

    .line 505
    :cond_15
    invoke-virtual {v7}, La/fet;->X()V

    .line 506
    .line 507
    .line 508
    :goto_e
    invoke-virtual {v7}, La/fet;->u()La/yfe0;

    .line 509
    .line 510
    .line 511
    move-result-object v10

    .line 512
    if-eqz v10, :cond_16

    .line 513
    .line 514
    new-instance v0, La/fn0;

    .line 515
    .line 516
    const/4 v9, 0x2

    .line 517
    move-object/from16 v3, p2

    .line 518
    .line 519
    move-object/from16 v4, p3

    .line 520
    .line 521
    move-object/from16 v5, p4

    .line 522
    .line 523
    move-object/from16 v6, p5

    .line 524
    .line 525
    move-object/from16 v7, p6

    .line 526
    .line 527
    move/from16 v8, p8

    .line 528
    .line 529
    invoke-direct/range {v0 .. v9}, La/fn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/wdr;IB)V

    .line 530
    .line 531
    .line 532
    iput-object v0, v10, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 533
    .line 534
    :cond_16
    return-void
.end method
