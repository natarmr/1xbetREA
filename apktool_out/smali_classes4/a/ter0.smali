.class public abstract La/ter0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[La/iiy;

.field public static final b:La/zai0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ter0;

    .line 4
    .line 5
    const-string v2, "hasEllipsis"

    .line 6
    .line 7
    const-string v3, "getHasEllipsis(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-array v1, v4, [La/iiy;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aput-object v0, v1, v2

    .line 17
    .line 18
    sput-object v1, La/ter0;->a:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/zai0;

    .line 21
    .line 22
    const-string v1, "Ellipsis"

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/zai0;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/ter0;->b:La/zai0;

    .line 28
    .line 29
    return-void
.end method

.method public static final a(La/mm40;Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/String;La/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 43

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move/from16 v7, p3

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    move-object/from16 v9, p8

    .line 8
    .line 9
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const v1, -0x1e4a5f7c

    .line 19
    .line 20
    .line 21
    invoke-virtual {v9, v1}, La/fet;->g0(I)La/fet;

    .line 22
    .line 23
    .line 24
    or-int/lit8 v1, p9, 0x6

    .line 25
    .line 26
    move-object/from16 v2, p1

    .line 27
    .line 28
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    const/16 v4, 0x20

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/16 v4, 0x10

    .line 38
    .line 39
    :goto_0
    or-int/2addr v1, v4

    .line 40
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    const/16 v4, 0x100

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/16 v4, 0x80

    .line 50
    .line 51
    :goto_1
    or-int/2addr v1, v4

    .line 52
    invoke-virtual {v9, v7}, La/fet;->h(Z)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const/16 v5, 0x800

    .line 57
    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    move v4, v5

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/16 v4, 0x400

    .line 63
    .line 64
    :goto_2
    or-int/2addr v1, v4

    .line 65
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    const/16 v4, 0x4000

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    const/16 v4, 0x2000

    .line 75
    .line 76
    :goto_3
    or-int/2addr v1, v4

    .line 77
    move-object/from16 v8, p6

    .line 78
    .line 79
    invoke-virtual {v9, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_4

    .line 84
    .line 85
    const/high16 v4, 0x100000

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_4
    const/high16 v4, 0x80000

    .line 89
    .line 90
    :goto_4
    or-int/2addr v1, v4

    .line 91
    move-object/from16 v4, p7

    .line 92
    .line 93
    invoke-virtual {v9, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_5

    .line 98
    .line 99
    const/high16 v6, 0x800000

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_5
    const/high16 v6, 0x400000

    .line 103
    .line 104
    :goto_5
    or-int/2addr v1, v6

    .line 105
    const v6, 0x492493

    .line 106
    .line 107
    .line 108
    and-int/2addr v6, v1

    .line 109
    const v10, 0x492492

    .line 110
    .line 111
    .line 112
    const/4 v11, 0x0

    .line 113
    if-eq v6, v10, :cond_6

    .line 114
    .line 115
    const/4 v6, 0x1

    .line 116
    goto :goto_6

    .line 117
    :cond_6
    move v6, v11

    .line 118
    :goto_6
    and-int/lit8 v10, v1, 0x1

    .line 119
    .line 120
    invoke-virtual {v9, v10, v6}, La/fet;->U(IZ)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_1e

    .line 125
    .line 126
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    sget-object v10, La/ukd;->a:La/cl5;

    .line 131
    .line 132
    if-ne v6, v10, :cond_7

    .line 133
    .line 134
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-static {v6}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-virtual {v9, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_7
    check-cast v6, La/pz40;

    .line 144
    .line 145
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    if-ne v13, v10, :cond_9

    .line 150
    .line 151
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v13

    .line 155
    check-cast v13, Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 158
    .line 159
    .line 160
    move-result v13

    .line 161
    if-eqz v13, :cond_8

    .line 162
    .line 163
    sget-wide v13, La/qmk;->u:J

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_8
    sget-wide v13, La/qmk;->w:J

    .line 167
    .line 168
    :goto_7
    new-instance v15, La/daq0;

    .line 169
    .line 170
    invoke-direct {v15, v13, v14}, La/daq0;-><init>(J)V

    .line 171
    .line 172
    .line 173
    invoke-static {v15}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 174
    .line 175
    .line 176
    move-result-object v13

    .line 177
    invoke-virtual {v9, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_9
    check-cast v13, La/pz40;

    .line 181
    .line 182
    if-eqz v7, :cond_a

    .line 183
    .line 184
    const v14, 0xf2983b1

    .line 185
    .line 186
    .line 187
    invoke-static {v9, v14, v9, v11}, La/rz4;->c(La/fet;ILa/fet;Z)J

    .line 188
    .line 189
    .line 190
    move-result-wide v14

    .line 191
    :goto_8
    move-wide/from16 v29, v14

    .line 192
    .line 193
    goto :goto_9

    .line 194
    :cond_a
    const v14, 0xf2a4913

    .line 195
    .line 196
    .line 197
    invoke-virtual {v9, v14}, La/fet;->e0(I)V

    .line 198
    .line 199
    .line 200
    invoke-static {v9}, La/afn0;->m(La/fet;)Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 201
    .line 202
    .line 203
    move-result-object v14

    .line 204
    invoke-virtual {v14}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 205
    .line 206
    .line 207
    move-result-wide v14

    .line 208
    invoke-virtual {v9, v11}, La/fet;->r(Z)V

    .line 209
    .line 210
    .line 211
    goto :goto_8

    .line 212
    :goto_9
    if-nez v7, :cond_c

    .line 213
    .line 214
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v14

    .line 218
    check-cast v14, Ljava/lang/Boolean;

    .line 219
    .line 220
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 221
    .line 222
    .line 223
    move-result v14

    .line 224
    if-eqz v14, :cond_b

    .line 225
    .line 226
    goto :goto_a

    .line 227
    :cond_b
    move v14, v11

    .line 228
    goto :goto_b

    .line 229
    :cond_c
    :goto_a
    const/4 v14, 0x1

    .line 230
    :goto_b
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 231
    .line 232
    .line 233
    move-result-object v14

    .line 234
    and-int/lit16 v15, v1, 0x1c00

    .line 235
    .line 236
    if-ne v15, v5, :cond_d

    .line 237
    .line 238
    const/16 v16, 0x1

    .line 239
    .line 240
    goto :goto_c

    .line 241
    :cond_d
    move/from16 v16, v11

    .line 242
    .line 243
    :goto_c
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    if-nez v16, :cond_e

    .line 248
    .line 249
    if-ne v5, v10, :cond_f

    .line 250
    .line 251
    :cond_e
    new-instance v5, La/meq0;

    .line 252
    .line 253
    const/4 v12, 0x0

    .line 254
    invoke-direct {v5, v7, v6, v13, v12}, La/meq0;-><init>(ZLa/pz40;La/pz40;La/yje;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v9, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_f
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 261
    .line 262
    invoke-static {v9, v14, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 263
    .line 264
    .line 265
    sget-object v5, La/jm40;->b:La/jm40;

    .line 266
    .line 267
    const/high16 v12, 0x3f800000    # 1.0f

    .line 268
    .line 269
    invoke-static {v5, v12}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 270
    .line 271
    .line 272
    move-result-object v14

    .line 273
    sget-object v18, La/qmk;->a:La/zcl;

    .line 274
    .line 275
    const/high16 v12, 0x42600000    # 56.0f

    .line 276
    .line 277
    invoke-static {v14, v12}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    invoke-static {v9}, La/afn0;->m(La/fet;)Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 282
    .line 283
    .line 284
    move-result-object v14

    .line 285
    move/from16 v24, v1

    .line 286
    .line 287
    invoke-virtual {v14}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 288
    .line 289
    .line 290
    move-result-wide v1

    .line 291
    sget-object v14, La/jd8;->n:La/ljc;

    .line 292
    .line 293
    invoke-static {v12, v1, v2, v14}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    sget-object v2, La/gqw0;->a:La/zx7;

    .line 298
    .line 299
    invoke-static {v2, v11}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    iget-wide v11, v9, La/fet;->T:J

    .line 304
    .line 305
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 306
    .line 307
    .line 308
    move-result v11

    .line 309
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 310
    .line 311
    .line 312
    move-result-object v12

    .line 313
    invoke-static {v9, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    sget-object v18, La/mkd;->c0:La/gqw0;

    .line 318
    .line 319
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v9}, La/fet;->i0()V

    .line 323
    .line 324
    .line 325
    iget-boolean v14, v9, La/fet;->S:Z

    .line 326
    .line 327
    move-object/from16 v25, v6

    .line 328
    .line 329
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 330
    .line 331
    if-eqz v14, :cond_10

    .line 332
    .line 333
    invoke-virtual {v9, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 334
    .line 335
    .line 336
    goto :goto_d

    .line 337
    :cond_10
    invoke-virtual {v9}, La/fet;->r0()V

    .line 338
    .line 339
    .line 340
    :goto_d
    sget-object v14, La/gqw0;->x:La/shd;

    .line 341
    .line 342
    invoke-static {v9, v2, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 343
    .line 344
    .line 345
    sget-object v2, La/gqw0;->w:La/shd;

    .line 346
    .line 347
    invoke-static {v9, v12, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 348
    .line 349
    .line 350
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 351
    .line 352
    .line 353
    move-result-object v11

    .line 354
    sget-object v12, La/gqw0;->y:La/shd;

    .line 355
    .line 356
    invoke-static {v9, v11, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 357
    .line 358
    .line 359
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 360
    .line 361
    .line 362
    sget-object v11, La/gqw0;->v:La/shd;

    .line 363
    .line 364
    invoke-static {v9, v1, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 365
    .line 366
    .line 367
    const/high16 v1, 0x42400000    # 48.0f

    .line 368
    .line 369
    invoke-static {v5, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    sget-object v3, La/gqw0;->d:La/zx7;

    .line 374
    .line 375
    move-object/from16 v19, v10

    .line 376
    .line 377
    sget-object v10, La/jr8;->a:La/jr8;

    .line 378
    .line 379
    invoke-virtual {v10, v1, v3}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    const-string v3, "buttonArrowBack"

    .line 384
    .line 385
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    move-object v3, v13

    .line 390
    sget-object v13, La/f1t0;->e:La/ugd;

    .line 391
    .line 392
    shr-int/lit8 v20, v24, 0x12

    .line 393
    .line 394
    and-int/lit8 v20, v20, 0xe

    .line 395
    .line 396
    const/high16 v21, 0x180000

    .line 397
    .line 398
    or-int v20, v20, v21

    .line 399
    .line 400
    const/16 v21, 0x1

    .line 401
    .line 402
    const/16 v16, 0x3c

    .line 403
    .line 404
    move-object/from16 v22, v10

    .line 405
    .line 406
    const/4 v10, 0x0

    .line 407
    move-object/from16 v23, v11

    .line 408
    .line 409
    const/4 v11, 0x0

    .line 410
    move-object/from16 v26, v12

    .line 411
    .line 412
    const/4 v12, 0x0

    .line 413
    move-object/from16 p0, v9

    .line 414
    .line 415
    move-object v9, v1

    .line 416
    move-object v1, v14

    .line 417
    move-object/from16 v14, p0

    .line 418
    .line 419
    move-object/from16 p0, v3

    .line 420
    .line 421
    move/from16 v31, v15

    .line 422
    .line 423
    move-object/from16 v33, v19

    .line 424
    .line 425
    move/from16 v15, v20

    .line 426
    .line 427
    move-object/from16 v7, v22

    .line 428
    .line 429
    move-object/from16 v4, v23

    .line 430
    .line 431
    move-object/from16 v0, v26

    .line 432
    .line 433
    const/high16 v3, 0x3f800000    # 1.0f

    .line 434
    .line 435
    invoke-static/range {v8 .. v16}, La/zvw;->d(Lkotlin/jvm/functions/Function0;La/mm40;ZLa/wvw;La/yjj0;La/ugd;La/fet;II)V

    .line 436
    .line 437
    .line 438
    invoke-static {v5, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 439
    .line 440
    .line 441
    move-result-object v8

    .line 442
    const/4 v12, 0x0

    .line 443
    const/16 v13, 0xa

    .line 444
    .line 445
    const/high16 v9, 0x42600000    # 56.0f

    .line 446
    .line 447
    const/4 v10, 0x0

    .line 448
    const/high16 v11, 0x42400000    # 48.0f

    .line 449
    .line 450
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 451
    .line 452
    .line 453
    move-result-object v8

    .line 454
    sget-object v9, La/gqw0;->e:La/zx7;

    .line 455
    .line 456
    invoke-virtual {v7, v8, v9}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    sget-object v11, La/uc9;->e:La/nw3;

    .line 461
    .line 462
    sget-object v9, La/gqw0;->n:La/xx7;

    .line 463
    .line 464
    const/16 v12, 0x36

    .line 465
    .line 466
    invoke-static {v11, v9, v14, v12}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 467
    .line 468
    .line 469
    move-result-object v9

    .line 470
    iget-wide v12, v14, La/fet;->T:J

    .line 471
    .line 472
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 473
    .line 474
    .line 475
    move-result v10

    .line 476
    invoke-virtual {v14}, La/fet;->m()La/bh90;

    .line 477
    .line 478
    .line 479
    move-result-object v12

    .line 480
    invoke-static {v14, v8}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    invoke-virtual {v14}, La/fet;->i0()V

    .line 485
    .line 486
    .line 487
    iget-boolean v13, v14, La/fet;->S:Z

    .line 488
    .line 489
    if-eqz v13, :cond_11

    .line 490
    .line 491
    invoke-virtual {v14, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 492
    .line 493
    .line 494
    goto :goto_e

    .line 495
    :cond_11
    invoke-virtual {v14}, La/fet;->r0()V

    .line 496
    .line 497
    .line 498
    :goto_e
    invoke-static {v14, v9, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 499
    .line 500
    .line 501
    invoke-static {v14, v12, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 502
    .line 503
    .line 504
    invoke-static {v10, v14, v0, v14}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 505
    .line 506
    .line 507
    invoke-static {v14, v8, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 508
    .line 509
    .line 510
    invoke-interface/range {v25 .. v25}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v8

    .line 514
    check-cast v8, Ljava/lang/Boolean;

    .line 515
    .line 516
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 517
    .line 518
    .line 519
    move-result v8

    .line 520
    const/high16 v12, 0x41800000    # 16.0f

    .line 521
    .line 522
    const/16 v34, 0x0

    .line 523
    .line 524
    if-eqz v8, :cond_12

    .line 525
    .line 526
    move/from16 v21, v34

    .line 527
    .line 528
    goto :goto_f

    .line 529
    :cond_12
    move/from16 v21, v12

    .line 530
    .line 531
    :goto_f
    const/16 v22, 0x0

    .line 532
    .line 533
    const/16 v23, 0xb

    .line 534
    .line 535
    const/16 v19, 0x0

    .line 536
    .line 537
    const/16 v20, 0x0

    .line 538
    .line 539
    move-object/from16 v18, v5

    .line 540
    .line 541
    invoke-static/range {v18 .. v23}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    const/4 v8, 0x0

    .line 546
    const/16 v10, 0x18

    .line 547
    .line 548
    move-object v9, v6

    .line 549
    const/4 v6, 0x0

    .line 550
    move-object/from16 v23, v4

    .line 551
    .line 552
    move-object v4, v5

    .line 553
    move-object/from16 v35, v7

    .line 554
    .line 555
    move-object v13, v9

    .line 556
    const/16 v17, 0x800

    .line 557
    .line 558
    move/from16 v7, p3

    .line 559
    .line 560
    move-object/from16 v5, p5

    .line 561
    .line 562
    move-object/from16 v9, p7

    .line 563
    .line 564
    invoke-static/range {v4 .. v10}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    const-string v5, "TOP_TABS_ACCOUNT_ID"

    .line 569
    .line 570
    invoke-static {v4, v5}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 571
    .line 572
    .line 573
    move-result-object v5

    .line 574
    move/from16 v4, v24

    .line 575
    .line 576
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 577
    .line 578
    .line 579
    move-result-object v24

    .line 580
    invoke-static {v14}, La/afn0;->m(La/fet;)Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 581
    .line 582
    .line 583
    move-result-object v6

    .line 584
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 585
    .line 586
    .line 587
    move-result-wide v6

    .line 588
    shr-int/lit8 v4, v4, 0x3

    .line 589
    .line 590
    and-int/lit8 v26, v4, 0xe

    .line 591
    .line 592
    const/16 v27, 0x6180

    .line 593
    .line 594
    const v28, 0x1aff8

    .line 595
    .line 596
    .line 597
    const-wide/16 v9, 0x0

    .line 598
    .line 599
    move-object v4, v11

    .line 600
    const/4 v11, 0x0

    .line 601
    move/from16 v16, v12

    .line 602
    .line 603
    const/4 v12, 0x0

    .line 604
    move-object/from16 v19, v13

    .line 605
    .line 606
    const/4 v13, 0x0

    .line 607
    const/16 v20, 0x36

    .line 608
    .line 609
    const-wide/16 v14, 0x0

    .line 610
    .line 611
    move/from16 v21, v16

    .line 612
    .line 613
    const/16 v16, 0x0

    .line 614
    .line 615
    move/from16 v22, v17

    .line 616
    .line 617
    move-object/from16 v36, v18

    .line 618
    .line 619
    const-wide/16 v17, 0x0

    .line 620
    .line 621
    move-object/from16 v37, v19

    .line 622
    .line 623
    const/16 v19, 0x2

    .line 624
    .line 625
    move/from16 v38, v20

    .line 626
    .line 627
    const/16 v20, 0x0

    .line 628
    .line 629
    move/from16 v39, v21

    .line 630
    .line 631
    const/16 v21, 0x1

    .line 632
    .line 633
    move/from16 v40, v22

    .line 634
    .line 635
    const/16 v22, 0x0

    .line 636
    .line 637
    move-object/from16 v41, v23

    .line 638
    .line 639
    const/16 v23, 0x0

    .line 640
    .line 641
    move-object/from16 v40, v1

    .line 642
    .line 643
    move-object/from16 v38, v2

    .line 644
    .line 645
    move-object/from16 v2, v36

    .line 646
    .line 647
    move-object/from16 v1, v37

    .line 648
    .line 649
    move-object/from16 v42, v41

    .line 650
    .line 651
    move-object/from16 v37, v0

    .line 652
    .line 653
    move-object v0, v4

    .line 654
    move-object/from16 v36, v25

    .line 655
    .line 656
    move-object/from16 v4, p1

    .line 657
    .line 658
    move-object/from16 v25, p8

    .line 659
    .line 660
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 661
    .line 662
    .line 663
    move-object/from16 v14, v25

    .line 664
    .line 665
    invoke-static {v2, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    const-string v5, "WalletRow"

    .line 670
    .line 671
    invoke-static {v4, v5}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 672
    .line 673
    .line 674
    move-result-object v4

    .line 675
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 676
    .line 677
    const/16 v15, 0x36

    .line 678
    .line 679
    invoke-static {v0, v5, v14, v15}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    iget-wide v5, v14, La/fet;->T:J

    .line 684
    .line 685
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 686
    .line 687
    .line 688
    move-result v5

    .line 689
    invoke-virtual {v14}, La/fet;->m()La/bh90;

    .line 690
    .line 691
    .line 692
    move-result-object v6

    .line 693
    invoke-static {v14, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 694
    .line 695
    .line 696
    move-result-object v4

    .line 697
    invoke-virtual {v14}, La/fet;->i0()V

    .line 698
    .line 699
    .line 700
    iget-boolean v7, v14, La/fet;->S:Z

    .line 701
    .line 702
    if-eqz v7, :cond_13

    .line 703
    .line 704
    invoke-virtual {v14, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 705
    .line 706
    .line 707
    :goto_10
    move-object/from16 v1, v40

    .line 708
    .line 709
    goto :goto_11

    .line 710
    :cond_13
    invoke-virtual {v14}, La/fet;->r0()V

    .line 711
    .line 712
    .line 713
    goto :goto_10

    .line 714
    :goto_11
    invoke-static {v14, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 715
    .line 716
    .line 717
    move-object/from16 v0, v38

    .line 718
    .line 719
    invoke-static {v14, v6, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 720
    .line 721
    .line 722
    move-object/from16 v0, v37

    .line 723
    .line 724
    invoke-static {v5, v14, v0, v14}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 725
    .line 726
    .line 727
    move-object/from16 v0, v42

    .line 728
    .line 729
    invoke-static {v14, v4, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 730
    .line 731
    .line 732
    sget-object v0, La/bmd;->n:La/zfn;

    .line 733
    .line 734
    invoke-virtual {v14, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    check-cast v0, La/k6z;

    .line 739
    .line 740
    sget-object v1, La/k6z;->b:La/k6z;

    .line 741
    .line 742
    const-string v11, " "

    .line 743
    .line 744
    if-ne v0, v1, :cond_14

    .line 745
    .line 746
    const v1, -0x6b712d93

    .line 747
    .line 748
    .line 749
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 750
    .line 751
    .line 752
    const/4 v8, 0x0

    .line 753
    const/16 v10, 0x18

    .line 754
    .line 755
    const/4 v6, 0x0

    .line 756
    move/from16 v7, p3

    .line 757
    .line 758
    move-object/from16 v5, p5

    .line 759
    .line 760
    move-object/from16 v9, p7

    .line 761
    .line 762
    move-object v4, v2

    .line 763
    invoke-static/range {v4 .. v10}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    move-object/from16 v2, p4

    .line 768
    .line 769
    move-object/from16 v37, v4

    .line 770
    .line 771
    invoke-virtual {v2, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v4

    .line 775
    invoke-static {}, La/g1t0;->u()La/y9q0;

    .line 776
    .line 777
    .line 778
    move-result-object v24

    .line 779
    invoke-interface/range {p0 .. p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v5

    .line 783
    check-cast v5, La/daq0;

    .line 784
    .line 785
    iget-wide v9, v5, La/daq0;->a:J

    .line 786
    .line 787
    const/16 v27, 0x6180

    .line 788
    .line 789
    const v28, 0x1afe8

    .line 790
    .line 791
    .line 792
    move-object v5, v11

    .line 793
    const/4 v11, 0x0

    .line 794
    const/4 v12, 0x0

    .line 795
    const/4 v13, 0x0

    .line 796
    const-wide/16 v14, 0x0

    .line 797
    .line 798
    const/16 v16, 0x0

    .line 799
    .line 800
    const-wide/16 v17, 0x0

    .line 801
    .line 802
    const/16 v19, 0x2

    .line 803
    .line 804
    const/16 v20, 0x0

    .line 805
    .line 806
    const/16 v21, 0x1

    .line 807
    .line 808
    const/16 v22, 0x0

    .line 809
    .line 810
    const/16 v23, 0x0

    .line 811
    .line 812
    const/16 v26, 0x0

    .line 813
    .line 814
    move-object v6, v5

    .line 815
    move-object v5, v1

    .line 816
    move-object v1, v6

    .line 817
    move-object/from16 v25, p8

    .line 818
    .line 819
    move-wide/from16 v6, v29

    .line 820
    .line 821
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 822
    .line 823
    .line 824
    move-wide v11, v6

    .line 825
    move-object/from16 v14, v25

    .line 826
    .line 827
    const/4 v4, 0x0

    .line 828
    invoke-virtual {v14, v4}, La/fet;->r(Z)V

    .line 829
    .line 830
    .line 831
    goto :goto_12

    .line 832
    :cond_14
    move-object/from16 v37, v2

    .line 833
    .line 834
    move-object v1, v11

    .line 835
    move-wide/from16 v11, v29

    .line 836
    .line 837
    const/4 v4, 0x0

    .line 838
    move-object/from16 v2, p4

    .line 839
    .line 840
    const v5, -0x6b67bda2

    .line 841
    .line 842
    .line 843
    invoke-virtual {v14, v5}, La/fet;->e0(I)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v14, v4}, La/fet;->r(Z)V

    .line 847
    .line 848
    .line 849
    :goto_12
    if-eqz p2, :cond_1a

    .line 850
    .line 851
    const v5, -0x6b660b83

    .line 852
    .line 853
    .line 854
    invoke-static {v14, v5, v3, v4}, La/rz4;->f(La/fet;IFZ)La/x7z;

    .line 855
    .line 856
    .line 857
    move-result-object v15

    .line 858
    invoke-interface/range {v36 .. v36}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v4

    .line 862
    check-cast v4, Ljava/lang/Boolean;

    .line 863
    .line 864
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 865
    .line 866
    .line 867
    move-result v4

    .line 868
    if-nez v4, :cond_15

    .line 869
    .line 870
    move/from16 v16, v34

    .line 871
    .line 872
    goto :goto_13

    .line 873
    :cond_15
    const/high16 v16, 0x41800000    # 16.0f

    .line 874
    .line 875
    :goto_13
    const/16 v19, 0x0

    .line 876
    .line 877
    const/16 v20, 0xe

    .line 878
    .line 879
    const/16 v17, 0x0

    .line 880
    .line 881
    const/16 v18, 0x0

    .line 882
    .line 883
    invoke-static/range {v15 .. v20}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 884
    .line 885
    .line 886
    move-result-object v4

    .line 887
    const/4 v8, 0x0

    .line 888
    const/16 v10, 0x18

    .line 889
    .line 890
    const/4 v6, 0x0

    .line 891
    move/from16 v7, p3

    .line 892
    .line 893
    move-object/from16 v5, p5

    .line 894
    .line 895
    move-object/from16 v9, p7

    .line 896
    .line 897
    invoke-static/range {v4 .. v10}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 898
    .line 899
    .line 900
    move-result-object v4

    .line 901
    move v5, v7

    .line 902
    const-string v6, "TopTabsSum"

    .line 903
    .line 904
    invoke-static {v4, v6}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 905
    .line 906
    .line 907
    move-result-object v4

    .line 908
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v6

    .line 912
    move-object/from16 v7, v33

    .line 913
    .line 914
    if-ne v6, v7, :cond_16

    .line 915
    .line 916
    new-instance v6, La/dbo0;

    .line 917
    .line 918
    const/4 v8, 0x6

    .line 919
    move-object/from16 v9, v36

    .line 920
    .line 921
    invoke-direct {v6, v9, v8}, La/dbo0;-><init>(La/pz40;B)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v14, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 925
    .line 926
    .line 927
    goto :goto_14

    .line 928
    :cond_16
    move-object/from16 v9, v36

    .line 929
    .line 930
    :goto_14
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 931
    .line 932
    const/4 v8, 0x0

    .line 933
    invoke-static {v4, v8, v6}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 934
    .line 935
    .line 936
    move-result-object v4

    .line 937
    sget-object v6, La/pn40;->a:La/pn40;

    .line 938
    .line 939
    move-object v6, v4

    .line 940
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Double;->doubleValue()D

    .line 941
    .line 942
    .line 943
    move-result-wide v3

    .line 944
    sget-object v8, La/p3u0;->c:La/p3u0;

    .line 945
    .line 946
    invoke-static {v3, v4, v8}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v4

    .line 950
    invoke-static {}, La/g1t0;->u()La/y9q0;

    .line 951
    .line 952
    .line 953
    move-result-object v24

    .line 954
    invoke-interface/range {p0 .. p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v3

    .line 958
    check-cast v3, La/daq0;

    .line 959
    .line 960
    move-object v8, v4

    .line 961
    iget-wide v3, v3, La/daq0;->a:J

    .line 962
    .line 963
    move/from16 v10, v31

    .line 964
    .line 965
    const/16 v13, 0x800

    .line 966
    .line 967
    if-ne v10, v13, :cond_17

    .line 968
    .line 969
    const/4 v10, 0x1

    .line 970
    goto :goto_15

    .line 971
    :cond_17
    const/4 v10, 0x0

    .line 972
    :goto_15
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v13

    .line 976
    if-nez v10, :cond_19

    .line 977
    .line 978
    if-ne v13, v7, :cond_18

    .line 979
    .line 980
    goto :goto_16

    .line 981
    :cond_18
    move-object/from16 v7, p0

    .line 982
    .line 983
    const/4 v10, 0x1

    .line 984
    goto :goto_17

    .line 985
    :cond_19
    :goto_16
    new-instance v13, La/b36;

    .line 986
    .line 987
    move-object/from16 v7, p0

    .line 988
    .line 989
    const/4 v10, 0x1

    .line 990
    invoke-direct {v13, v5, v9, v7, v10}, La/b36;-><init>(ZLa/pz40;La/pz40;B)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v14, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 994
    .line 995
    .line 996
    :goto_17
    move-object/from16 v23, v13

    .line 997
    .line 998
    check-cast v23, Lkotlin/jvm/functions/Function1;

    .line 999
    .line 1000
    const/16 v27, 0x6180

    .line 1001
    .line 1002
    const v28, 0xafe8

    .line 1003
    .line 1004
    .line 1005
    move/from16 v16, v10

    .line 1006
    .line 1007
    move-wide v9, v3

    .line 1008
    move-object v4, v8

    .line 1009
    const/4 v8, 0x0

    .line 1010
    move-object v5, v6

    .line 1011
    move-object v3, v7

    .line 1012
    move-wide v6, v11

    .line 1013
    const/4 v11, 0x0

    .line 1014
    const/4 v12, 0x0

    .line 1015
    const/4 v13, 0x0

    .line 1016
    const-wide/16 v14, 0x0

    .line 1017
    .line 1018
    move/from16 v32, v16

    .line 1019
    .line 1020
    const/16 v16, 0x0

    .line 1021
    .line 1022
    const-wide/16 v17, 0x0

    .line 1023
    .line 1024
    const/16 v19, 0x2

    .line 1025
    .line 1026
    const/16 v20, 0x0

    .line 1027
    .line 1028
    const/16 v21, 0x1

    .line 1029
    .line 1030
    const/16 v22, 0x0

    .line 1031
    .line 1032
    const/16 v26, 0x0

    .line 1033
    .line 1034
    move-object/from16 v25, p8

    .line 1035
    .line 1036
    move-object/from16 p0, v3

    .line 1037
    .line 1038
    move/from16 v3, v32

    .line 1039
    .line 1040
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1041
    .line 1042
    .line 1043
    move-wide v11, v6

    .line 1044
    move-object/from16 v14, v25

    .line 1045
    .line 1046
    const/4 v8, 0x0

    .line 1047
    invoke-virtual {v14, v8}, La/fet;->r(Z)V

    .line 1048
    .line 1049
    .line 1050
    goto :goto_18

    .line 1051
    :cond_1a
    move v8, v4

    .line 1052
    const/4 v3, 0x1

    .line 1053
    const v4, -0x6b5284e2

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v14, v4}, La/fet;->e0(I)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v14, v8}, La/fet;->r(Z)V

    .line 1060
    .line 1061
    .line 1062
    :goto_18
    sget-object v4, La/k6z;->a:La/k6z;

    .line 1063
    .line 1064
    if-ne v0, v4, :cond_1b

    .line 1065
    .line 1066
    const v0, -0x6b50eafb

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 1070
    .line 1071
    .line 1072
    const/4 v8, 0x0

    .line 1073
    const/16 v10, 0x18

    .line 1074
    .line 1075
    const/4 v6, 0x0

    .line 1076
    move/from16 v7, p3

    .line 1077
    .line 1078
    move-object/from16 v5, p5

    .line 1079
    .line 1080
    move-object/from16 v9, p7

    .line 1081
    .line 1082
    move-object/from16 v4, v37

    .line 1083
    .line 1084
    invoke-static/range {v4 .. v10}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0

    .line 1088
    move-object/from16 v18, v4

    .line 1089
    .line 1090
    const-string v4, "TopTabCurrency"

    .line 1091
    .line 1092
    invoke-static {v0, v4}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v5

    .line 1096
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v4

    .line 1100
    invoke-static {}, La/g1t0;->u()La/y9q0;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v24

    .line 1104
    invoke-interface/range {p0 .. p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    check-cast v0, La/daq0;

    .line 1109
    .line 1110
    iget-wide v9, v0, La/daq0;->a:J

    .line 1111
    .line 1112
    const/16 v27, 0x6180

    .line 1113
    .line 1114
    const v28, 0x1afe8

    .line 1115
    .line 1116
    .line 1117
    move-wide v6, v11

    .line 1118
    const/4 v11, 0x0

    .line 1119
    const/4 v12, 0x0

    .line 1120
    const/4 v13, 0x0

    .line 1121
    const-wide/16 v14, 0x0

    .line 1122
    .line 1123
    const/16 v16, 0x0

    .line 1124
    .line 1125
    move-object/from16 v37, v18

    .line 1126
    .line 1127
    const-wide/16 v17, 0x0

    .line 1128
    .line 1129
    const/16 v19, 0x2

    .line 1130
    .line 1131
    const/16 v20, 0x0

    .line 1132
    .line 1133
    const/16 v21, 0x1

    .line 1134
    .line 1135
    const/16 v22, 0x0

    .line 1136
    .line 1137
    const/16 v23, 0x0

    .line 1138
    .line 1139
    const/16 v26, 0x0

    .line 1140
    .line 1141
    move-object/from16 v25, p8

    .line 1142
    .line 1143
    move-object/from16 v0, v37

    .line 1144
    .line 1145
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1146
    .line 1147
    .line 1148
    move-object/from16 v14, v25

    .line 1149
    .line 1150
    const/4 v8, 0x0

    .line 1151
    invoke-virtual {v14, v8}, La/fet;->r(Z)V

    .line 1152
    .line 1153
    .line 1154
    :goto_19
    const/high16 v1, 0x41800000    # 16.0f

    .line 1155
    .line 1156
    goto :goto_1a

    .line 1157
    :cond_1b
    move-object/from16 v0, v37

    .line 1158
    .line 1159
    const/4 v8, 0x0

    .line 1160
    const v1, -0x6b45f4a2

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v14, v8}, La/fet;->r(Z)V

    .line 1167
    .line 1168
    .line 1169
    goto :goto_19

    .line 1170
    :goto_1a
    invoke-static {v0, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v1

    .line 1174
    if-eqz p3, :cond_1c

    .line 1175
    .line 1176
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1177
    .line 1178
    goto :goto_1b

    .line 1179
    :cond_1c
    move/from16 v12, v34

    .line 1180
    .line 1181
    :goto_1b
    invoke-static {v1, v12}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v4

    .line 1185
    const/4 v8, 0x0

    .line 1186
    const/16 v10, 0x18

    .line 1187
    .line 1188
    const/4 v6, 0x0

    .line 1189
    move/from16 v7, p3

    .line 1190
    .line 1191
    move-object/from16 v5, p5

    .line 1192
    .line 1193
    move-object/from16 v9, p7

    .line 1194
    .line 1195
    invoke-static/range {v4 .. v10}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v1

    .line 1199
    const-string v4, "TopTabIconArrow"

    .line 1200
    .line 1201
    invoke-static {v1, v4}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v6

    .line 1205
    const v1, 0x7f080815

    .line 1206
    .line 1207
    .line 1208
    const/4 v8, 0x0

    .line 1209
    invoke-static {v1, v8, v14}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v4

    .line 1213
    invoke-static {v14}, La/afn0;->m(La/fet;)Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v1

    .line 1217
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1218
    .line 1219
    .line 1220
    move-result-wide v7

    .line 1221
    const/16 v10, 0x38

    .line 1222
    .line 1223
    const/4 v11, 0x0

    .line 1224
    const/4 v5, 0x0

    .line 1225
    move-object v9, v14

    .line 1226
    invoke-static/range {v4 .. v11}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v14, v3}, La/fet;->r(Z)V

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v14, v3}, La/fet;->r(Z)V

    .line 1233
    .line 1234
    .line 1235
    if-nez p3, :cond_1d

    .line 1236
    .line 1237
    const v1, 0x4629eab1

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 1241
    .line 1242
    .line 1243
    const/high16 v1, 0x3f800000    # 1.0f

    .line 1244
    .line 1245
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v1

    .line 1249
    sget-object v4, La/gqw0;->h:La/zx7;

    .line 1250
    .line 1251
    move-object/from16 v7, v35

    .line 1252
    .line 1253
    invoke-virtual {v7, v1, v4}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v1

    .line 1257
    const/4 v8, 0x0

    .line 1258
    invoke-static {v8, v14, v1}, La/rcb;->p(ILa/fet;La/mm40;)V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v14, v8}, La/fet;->r(Z)V

    .line 1262
    .line 1263
    .line 1264
    goto :goto_1c

    .line 1265
    :cond_1d
    const/4 v8, 0x0

    .line 1266
    const v1, 0x7f14ee18

    .line 1267
    .line 1268
    .line 1269
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 1270
    .line 1271
    .line 1272
    invoke-virtual {v14, v8}, La/fet;->r(Z)V

    .line 1273
    .line 1274
    .line 1275
    :goto_1c
    invoke-virtual {v14, v3}, La/fet;->r(Z)V

    .line 1276
    .line 1277
    .line 1278
    move-object v1, v0

    .line 1279
    goto :goto_1d

    .line 1280
    :cond_1e
    move-object v2, v0

    .line 1281
    move-object v14, v9

    .line 1282
    invoke-virtual {v14}, La/fet;->X()V

    .line 1283
    .line 1284
    .line 1285
    move-object/from16 v1, p0

    .line 1286
    .line 1287
    :goto_1d
    invoke-virtual {v14}, La/fet;->u()La/yfe0;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v10

    .line 1291
    if-eqz v10, :cond_1f

    .line 1292
    .line 1293
    new-instance v0, La/ntm;

    .line 1294
    .line 1295
    move-object/from16 v3, p2

    .line 1296
    .line 1297
    move/from16 v4, p3

    .line 1298
    .line 1299
    move-object/from16 v6, p5

    .line 1300
    .line 1301
    move-object/from16 v7, p6

    .line 1302
    .line 1303
    move-object/from16 v8, p7

    .line 1304
    .line 1305
    move/from16 v9, p9

    .line 1306
    .line 1307
    move-object v5, v2

    .line 1308
    move-object/from16 v2, p1

    .line 1309
    .line 1310
    invoke-direct/range {v0 .. v9}, La/ntm;-><init>(La/mm40;Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/String;La/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 1311
    .line 1312
    .line 1313
    iput-object v0, v10, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 1314
    .line 1315
    :cond_1f
    return-void
.end method
