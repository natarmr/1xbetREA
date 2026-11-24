.class public abstract La/i18;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x41000000    # 8.0f

    .line 4
    .line 5
    sput v0, La/i18;->a:F

    .line 6
    .line 7
    const/high16 v0, 0x42700000    # 60.0f

    .line 8
    .line 9
    sput v0, La/i18;->b:F

    .line 10
    .line 11
    const/high16 v0, 0x42a80000    # 84.0f

    .line 12
    .line 13
    sput v0, La/i18;->c:F

    .line 14
    .line 15
    const/high16 v0, 0x41800000    # 16.0f

    .line 16
    .line 17
    sput v0, La/i18;->d:F

    .line 18
    .line 19
    return-void
.end method

.method public static final a(La/rz7;La/iz7;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 44

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v8, p3

    .line 8
    .line 9
    sget-object v0, La/gqw0;->h:La/zx7;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const v4, -0x38736ae6

    .line 21
    .line 22
    .line 23
    invoke-virtual {v8, v4}, La/fet;->g0(I)La/fet;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    const/16 v4, 0x20

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/16 v4, 0x10

    .line 36
    .line 37
    :goto_0
    or-int v4, p4, v4

    .line 38
    .line 39
    invoke-virtual {v8, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    const/16 v5, 0x100

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/16 v5, 0x80

    .line 49
    .line 50
    :goto_1
    or-int/2addr v4, v5

    .line 51
    invoke-virtual {v8, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    const/16 v12, 0x800

    .line 56
    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    move v5, v12

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/16 v5, 0x400

    .line 62
    .line 63
    :goto_2
    or-int/2addr v4, v5

    .line 64
    and-int/lit16 v5, v4, 0x493

    .line 65
    .line 66
    const/16 v6, 0x492

    .line 67
    .line 68
    const/4 v14, 0x0

    .line 69
    if-eq v5, v6, :cond_3

    .line 70
    .line 71
    const/4 v5, 0x1

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    move v5, v14

    .line 74
    :goto_3
    and-int/lit8 v6, v4, 0x1

    .line 75
    .line 76
    invoke-virtual {v8, v6, v5}, La/fet;->U(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_21

    .line 81
    .line 82
    iget-object v5, v1, La/rz7;->b:Ljava/lang/String;

    .line 83
    .line 84
    sget-object v15, La/jr8;->a:La/jr8;

    .line 85
    .line 86
    sget-object v6, La/jm40;->b:La/jm40;

    .line 87
    .line 88
    invoke-virtual {v15, v6, v0}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    const/high16 v9, 0x3f800000    # 1.0f

    .line 93
    .line 94
    invoke-static {v7, v9}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    sget-object v10, La/qmk;->a:La/zcl;

    .line 99
    .line 100
    const/high16 v10, 0x41b00000    # 22.0f

    .line 101
    .line 102
    const/4 v11, 0x0

    .line 103
    const/4 v13, 0x2

    .line 104
    invoke-static {v7, v10, v11, v13}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    const v10, 0x3fe433b8

    .line 109
    .line 110
    .line 111
    invoke-static {v10, v7, v14}, La/ny9;->O(FLa/mm40;Z)La/mm40;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    and-int/lit16 v4, v4, 0x1c00

    .line 116
    .line 117
    if-ne v4, v12, :cond_4

    .line 118
    .line 119
    const/4 v10, 0x1

    .line 120
    goto :goto_4

    .line 121
    :cond_4
    move v10, v14

    .line 122
    :goto_4
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    sget-object v13, La/ukd;->a:La/cl5;

    .line 127
    .line 128
    if-nez v10, :cond_5

    .line 129
    .line 130
    if-ne v9, v13, :cond_6

    .line 131
    .line 132
    :cond_5
    new-instance v9, La/y;

    .line 133
    .line 134
    const/16 v10, 0xb

    .line 135
    .line 136
    invoke-direct {v9, v3, v10}, La/y;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 143
    .line 144
    invoke-static {v7, v9}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    const/16 v10, 0x30

    .line 149
    .line 150
    move v9, v11

    .line 151
    const/16 v11, 0x7f8

    .line 152
    .line 153
    move/from16 v18, v4

    .line 154
    .line 155
    move-object v4, v5

    .line 156
    const/4 v5, 0x0

    .line 157
    move-object/from16 v19, v6

    .line 158
    .line 159
    move-object v6, v7

    .line 160
    const/4 v7, 0x0

    .line 161
    const/4 v8, 0x0

    .line 162
    move-object/from16 v9, p3

    .line 163
    .line 164
    move/from16 v20, v18

    .line 165
    .line 166
    move-object/from16 v12, v19

    .line 167
    .line 168
    const/high16 v16, 0x3f800000    # 1.0f

    .line 169
    .line 170
    invoke-static/range {v4 .. v11}, La/k7x;->a(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/qge;La/a4d;La/fet;II)V

    .line 171
    .line 172
    .line 173
    iget-boolean v11, v2, La/iz7;->a:Z

    .line 174
    .line 175
    iget-boolean v4, v2, La/iz7;->b:Z

    .line 176
    .line 177
    if-nez v11, :cond_8

    .line 178
    .line 179
    if-eqz v4, :cond_7

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_7
    move v5, v14

    .line 183
    goto :goto_6

    .line 184
    :cond_8
    :goto_5
    const/4 v5, 0x1

    .line 185
    :goto_6
    if-eqz v5, :cond_9

    .line 186
    .line 187
    move/from16 v9, v16

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_9
    const/4 v9, 0x0

    .line 191
    :goto_7
    const/16 v6, 0xfa

    .line 192
    .line 193
    const/4 v7, 0x0

    .line 194
    const/4 v8, 0x6

    .line 195
    if-eqz v5, :cond_a

    .line 196
    .line 197
    invoke-static {v6, v14, v7, v8}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    :goto_8
    move v10, v4

    .line 202
    move v4, v9

    .line 203
    goto :goto_9

    .line 204
    :cond_a
    new-instance v5, La/jfk0;

    .line 205
    .line 206
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 207
    .line 208
    .line 209
    goto :goto_8

    .line 210
    :goto_9
    const/16 v9, 0xc00

    .line 211
    .line 212
    move/from16 v21, v10

    .line 213
    .line 214
    const/16 v10, 0x14

    .line 215
    .line 216
    move/from16 v22, v6

    .line 217
    .line 218
    const-string v6, "BigPigDiceShadow"

    .line 219
    .line 220
    move-object/from16 v23, v7

    .line 221
    .line 222
    const/4 v7, 0x0

    .line 223
    move-object/from16 v8, p3

    .line 224
    .line 225
    invoke-static/range {v4 .. v10}, La/d43;->b(FLa/j73;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-virtual {v15, v12, v0}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 230
    .line 231
    .line 232
    move-result-object v27

    .line 233
    sget v31, La/i18;->b:F

    .line 234
    .line 235
    const/16 v32, 0x7

    .line 236
    .line 237
    const/16 v28, 0x0

    .line 238
    .line 239
    const/16 v29, 0x0

    .line 240
    .line 241
    const/16 v30, 0x0

    .line 242
    .line 243
    invoke-static/range {v27 .. v32}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    sget v6, La/i18;->d:F

    .line 248
    .line 249
    const/4 v7, 0x1

    .line 250
    const/4 v9, 0x0

    .line 251
    invoke-static {v5, v9, v6, v7}, La/ffb0;->R(La/mm40;FFI)La/mm40;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    invoke-virtual {v8, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    move/from16 v7, v20

    .line 260
    .line 261
    const/16 v9, 0x800

    .line 262
    .line 263
    if-ne v7, v9, :cond_b

    .line 264
    .line 265
    const/4 v9, 0x1

    .line 266
    goto :goto_a

    .line 267
    :cond_b
    move v9, v14

    .line 268
    :goto_a
    or-int/2addr v6, v9

    .line 269
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v9

    .line 273
    if-nez v6, :cond_c

    .line 274
    .line 275
    if-ne v9, v13, :cond_d

    .line 276
    .line 277
    :cond_c
    new-instance v9, La/e18;

    .line 278
    .line 279
    invoke-direct {v9, v3, v4, v14}, La/e18;-><init>(Lkotlin/jvm/functions/Function0;La/l7m0;B)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v8, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :cond_d
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 286
    .line 287
    invoke-static {v5, v9}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-static {v14, v8, v4}, La/i18;->c(ILa/fet;La/mm40;)V

    .line 292
    .line 293
    .line 294
    if-eqz v11, :cond_e

    .line 295
    .line 296
    move/from16 v4, v16

    .line 297
    .line 298
    :goto_b
    const/16 v5, 0xfa

    .line 299
    .line 300
    const/4 v6, 0x0

    .line 301
    const/4 v9, 0x6

    .line 302
    goto :goto_c

    .line 303
    :cond_e
    const/4 v4, 0x0

    .line 304
    goto :goto_b

    .line 305
    :goto_c
    invoke-static {v5, v14, v6, v9}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 306
    .line 307
    .line 308
    move-result-object v10

    .line 309
    move/from16 v26, v9

    .line 310
    .line 311
    const/16 v9, 0xc30

    .line 312
    .line 313
    move/from16 v22, v5

    .line 314
    .line 315
    move-object v5, v10

    .line 316
    const/16 v10, 0x14

    .line 317
    .line 318
    move-object/from16 v23, v6

    .line 319
    .line 320
    const-string v6, "BigPigDiceRolling"

    .line 321
    .line 322
    move/from16 v20, v7

    .line 323
    .line 324
    const/4 v7, 0x0

    .line 325
    move/from16 v33, v20

    .line 326
    .line 327
    invoke-static/range {v4 .. v10}, La/d43;->b(FLa/j73;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 328
    .line 329
    .line 330
    move-result-object v10

    .line 331
    iget-object v4, v1, La/rz7;->k:La/a4x;

    .line 332
    .line 333
    const v5, -0x50596d05    # -3.029966E-10f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v8, v5}, La/fet;->e0(I)V

    .line 337
    .line 338
    .line 339
    new-instance v5, Ljava/util/ArrayList;

    .line 340
    .line 341
    const/16 v6, 0xa

    .line 342
    .line 343
    invoke-static {v4, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 348
    .line 349
    .line 350
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v20

    .line 354
    :goto_d
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    if-eqz v4, :cond_f

    .line 359
    .line 360
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    check-cast v4, Ljava/lang/String;

    .line 365
    .line 366
    const/4 v8, 0x0

    .line 367
    const/16 v9, 0x1e

    .line 368
    .line 369
    move-object v6, v5

    .line 370
    const/4 v5, 0x0

    .line 371
    move-object v7, v6

    .line 372
    const/4 v6, 0x0

    .line 373
    move-object v14, v7

    .line 374
    move-object/from16 v7, p3

    .line 375
    .line 376
    invoke-static/range {v4 .. v9}, La/l7x;->X(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/qge;La/fet;II)La/mz3;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    move-object v5, v7

    .line 381
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-object v8, v5

    .line 385
    move-object v5, v14

    .line 386
    const/4 v14, 0x0

    .line 387
    goto :goto_d

    .line 388
    :cond_f
    move v4, v14

    .line 389
    move-object v14, v5

    .line 390
    move-object v5, v8

    .line 391
    invoke-virtual {v5, v4}, La/fet;->r(Z)V

    .line 392
    .line 393
    .line 394
    invoke-static {v14}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 395
    .line 396
    .line 397
    move-result-object v14

    .line 398
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 399
    .line 400
    .line 401
    move-result v7

    .line 402
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    if-ne v4, v13, :cond_10

    .line 407
    .line 408
    const/16 v19, 0x0

    .line 409
    .line 410
    invoke-static/range {v19 .. v19}, La/xf0;->c(F)La/t33;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    invoke-virtual {v5, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    goto :goto_e

    .line 418
    :cond_10
    const/16 v19, 0x0

    .line 419
    .line 420
    :goto_e
    check-cast v4, La/t33;

    .line 421
    .line 422
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 423
    .line 424
    .line 425
    move-result-object v6

    .line 426
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 427
    .line 428
    .line 429
    move-result-object v8

    .line 430
    invoke-virtual {v5, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v9

    .line 434
    invoke-virtual {v5, v11}, La/fet;->h(Z)Z

    .line 435
    .line 436
    .line 437
    move-result v20

    .line 438
    or-int v9, v9, v20

    .line 439
    .line 440
    invoke-virtual {v5, v7}, La/fet;->e(I)Z

    .line 441
    .line 442
    .line 443
    move-result v20

    .line 444
    or-int v9, v9, v20

    .line 445
    .line 446
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    if-nez v9, :cond_11

    .line 451
    .line 452
    if-ne v2, v13, :cond_12

    .line 453
    .line 454
    :cond_11
    move-object v5, v4

    .line 455
    goto :goto_f

    .line 456
    :cond_12
    move-object v1, v4

    .line 457
    move-object v4, v2

    .line 458
    move-object v2, v5

    .line 459
    move-object v5, v1

    .line 460
    move-object v11, v6

    .line 461
    move-object v1, v8

    .line 462
    move-object/from16 v6, v23

    .line 463
    .line 464
    goto :goto_10

    .line 465
    :goto_f
    new-instance v4, La/h18;

    .line 466
    .line 467
    const/4 v9, 0x0

    .line 468
    move v1, v11

    .line 469
    move-object v11, v6

    .line 470
    move v6, v1

    .line 471
    move-object/from16 v2, p3

    .line 472
    .line 473
    move-object v1, v8

    .line 474
    move-object/from16 v8, v23

    .line 475
    .line 476
    invoke-direct/range {v4 .. v9}, La/h18;-><init>(Ljava/lang/Object;ZILa/yje;B)V

    .line 477
    .line 478
    .line 479
    move-object v6, v8

    .line 480
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    :goto_10
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 484
    .line 485
    invoke-static {v11, v1, v4, v2}, La/m0x0;->v(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    if-ne v1, v13, :cond_13

    .line 493
    .line 494
    new-instance v1, La/fu7;

    .line 495
    .line 496
    const/4 v4, 0x2

    .line 497
    invoke-direct {v1, v5, v4}, La/fu7;-><init>(La/t33;B)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    :cond_13
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 504
    .line 505
    invoke-virtual {v15, v12, v0}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 506
    .line 507
    .line 508
    move-result-object v23

    .line 509
    const/16 v28, 0x7

    .line 510
    .line 511
    const/16 v24, 0x0

    .line 512
    .line 513
    const/16 v25, 0x0

    .line 514
    .line 515
    const/16 v26, 0x0

    .line 516
    .line 517
    sget v27, La/i18;->b:F

    .line 518
    .line 519
    invoke-static/range {v23 .. v28}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 520
    .line 521
    .line 522
    move-result-object v4

    .line 523
    invoke-virtual {v2, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v5

    .line 527
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v7

    .line 531
    if-nez v5, :cond_14

    .line 532
    .line 533
    if-ne v7, v13, :cond_15

    .line 534
    .line 535
    :cond_14
    new-instance v7, La/yd1;

    .line 536
    .line 537
    const/16 v5, 0x18

    .line 538
    .line 539
    invoke-direct {v7, v10, v5}, La/yd1;-><init>(La/l7m0;B)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    :cond_15
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 546
    .line 547
    invoke-static {v4, v7}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    sget-object v11, La/uc9;->a:La/lw3;

    .line 552
    .line 553
    sget-object v5, La/gqw0;->j:La/yx7;

    .line 554
    .line 555
    const/4 v7, 0x0

    .line 556
    invoke-static {v11, v5, v2, v7}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 557
    .line 558
    .line 559
    move-result-object v8

    .line 560
    iget-wide v9, v2, La/fet;->T:J

    .line 561
    .line 562
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 563
    .line 564
    .line 565
    move-result v7

    .line 566
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 567
    .line 568
    .line 569
    move-result-object v9

    .line 570
    invoke-static {v2, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 575
    .line 576
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2}, La/fet;->i0()V

    .line 580
    .line 581
    .line 582
    iget-boolean v10, v2, La/fet;->S:Z

    .line 583
    .line 584
    move/from16 v17, v7

    .line 585
    .line 586
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 587
    .line 588
    if-eqz v10, :cond_16

    .line 589
    .line 590
    invoke-virtual {v2, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 591
    .line 592
    .line 593
    goto :goto_11

    .line 594
    :cond_16
    invoke-virtual {v2}, La/fet;->r0()V

    .line 595
    .line 596
    .line 597
    :goto_11
    sget-object v10, La/gqw0;->x:La/shd;

    .line 598
    .line 599
    invoke-static {v2, v8, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 600
    .line 601
    .line 602
    sget-object v8, La/gqw0;->w:La/shd;

    .line 603
    .line 604
    invoke-static {v2, v9, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 605
    .line 606
    .line 607
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 608
    .line 609
    .line 610
    move-result-object v9

    .line 611
    move-object/from16 v17, v7

    .line 612
    .line 613
    sget-object v7, La/gqw0;->y:La/shd;

    .line 614
    .line 615
    invoke-static {v2, v9, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 616
    .line 617
    .line 618
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 619
    .line 620
    .line 621
    sget-object v9, La/gqw0;->v:La/shd;

    .line 622
    .line 623
    invoke-static {v2, v4, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 624
    .line 625
    .line 626
    const/16 v4, 0x8

    .line 627
    .line 628
    invoke-static {v14, v1, v2, v4}, La/i18;->b(La/a4x;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 629
    .line 630
    .line 631
    invoke-static {v14, v1, v2, v4}, La/i18;->b(La/a4x;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 632
    .line 633
    .line 634
    const/4 v1, 0x1

    .line 635
    invoke-virtual {v2, v1}, La/fet;->r(Z)V

    .line 636
    .line 637
    .line 638
    if-eqz v21, :cond_17

    .line 639
    .line 640
    move/from16 v4, v16

    .line 641
    .line 642
    goto :goto_12

    .line 643
    :cond_17
    move/from16 v4, v19

    .line 644
    .line 645
    :goto_12
    if-eqz v21, :cond_18

    .line 646
    .line 647
    const/16 v1, 0xfa

    .line 648
    .line 649
    const/4 v2, 0x6

    .line 650
    const/4 v14, 0x0

    .line 651
    invoke-static {v1, v14, v6, v2}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    :goto_13
    move-object v14, v9

    .line 656
    goto :goto_14

    .line 657
    :cond_18
    const/16 v1, 0xfa

    .line 658
    .line 659
    new-instance v2, La/jfk0;

    .line 660
    .line 661
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 662
    .line 663
    .line 664
    goto :goto_13

    .line 665
    :goto_14
    const/16 v9, 0xc00

    .line 666
    .line 667
    move-object/from16 v16, v10

    .line 668
    .line 669
    const/16 v10, 0x14

    .line 670
    .line 671
    move-object/from16 v23, v6

    .line 672
    .line 673
    const-string v6, "BigPigDiceResult"

    .line 674
    .line 675
    move-object/from16 v20, v7

    .line 676
    .line 677
    const/4 v7, 0x0

    .line 678
    move-object/from16 v40, v5

    .line 679
    .line 680
    move-object v5, v2

    .line 681
    move-object/from16 v2, v40

    .line 682
    .line 683
    move-object/from16 v40, v8

    .line 684
    .line 685
    move-object/from16 v42, v14

    .line 686
    .line 687
    move-object/from16 v43, v17

    .line 688
    .line 689
    move-object/from16 v41, v20

    .line 690
    .line 691
    move-object/from16 v14, v23

    .line 692
    .line 693
    move-object/from16 v8, p3

    .line 694
    .line 695
    invoke-static/range {v4 .. v10}, La/d43;->b(FLa/j73;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 696
    .line 697
    .line 698
    move-result-object v10

    .line 699
    if-eqz v21, :cond_19

    .line 700
    .line 701
    sget v4, La/i18;->a:F

    .line 702
    .line 703
    goto :goto_15

    .line 704
    :cond_19
    sget-object v4, La/qmk;->a:La/zcl;

    .line 705
    .line 706
    move/from16 v4, v19

    .line 707
    .line 708
    :goto_15
    if-eqz v21, :cond_1a

    .line 709
    .line 710
    const/4 v5, 0x4

    .line 711
    invoke-static {v1, v1, v14, v5}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    :goto_16
    move-object v5, v1

    .line 716
    goto :goto_17

    .line 717
    :cond_1a
    new-instance v1, La/jfk0;

    .line 718
    .line 719
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 720
    .line 721
    .line 722
    goto :goto_16

    .line 723
    :goto_17
    const/16 v8, 0x180

    .line 724
    .line 725
    const/16 v9, 0x8

    .line 726
    .line 727
    const-string v6, "BigPigDiceDrop"

    .line 728
    .line 729
    move-object/from16 v7, p3

    .line 730
    .line 731
    invoke-static/range {v4 .. v9}, La/d43;->a(FLa/cfq;Ljava/lang/String;La/fet;II)La/l7m0;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    move-object v8, v7

    .line 736
    invoke-virtual {v15, v12, v0}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 737
    .line 738
    .line 739
    move-result-object v34

    .line 740
    const/16 v37, 0x0

    .line 741
    .line 742
    const/16 v39, 0x7

    .line 743
    .line 744
    const/16 v35, 0x0

    .line 745
    .line 746
    const/16 v36, 0x0

    .line 747
    .line 748
    move/from16 v38, v27

    .line 749
    .line 750
    invoke-static/range {v34 .. v39}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    move-result v4

    .line 758
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v5

    .line 762
    if-nez v4, :cond_1b

    .line 763
    .line 764
    if-ne v5, v13, :cond_1c

    .line 765
    .line 766
    :cond_1b
    new-instance v5, La/yd1;

    .line 767
    .line 768
    const/16 v4, 0x19

    .line 769
    .line 770
    invoke-direct {v5, v1, v4}, La/yd1;-><init>(La/l7m0;B)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v8, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 774
    .line 775
    .line 776
    :cond_1c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 777
    .line 778
    invoke-static {v0, v5}, La/ffb0;->P(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-virtual {v8, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    move-result v1

    .line 786
    move/from16 v7, v33

    .line 787
    .line 788
    const/16 v9, 0x800

    .line 789
    .line 790
    if-ne v7, v9, :cond_1d

    .line 791
    .line 792
    const/4 v4, 0x1

    .line 793
    goto :goto_18

    .line 794
    :cond_1d
    const/4 v4, 0x0

    .line 795
    :goto_18
    or-int/2addr v1, v4

    .line 796
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v4

    .line 800
    if-nez v1, :cond_1e

    .line 801
    .line 802
    if-ne v4, v13, :cond_1f

    .line 803
    .line 804
    :cond_1e
    new-instance v4, La/e18;

    .line 805
    .line 806
    const/4 v1, 0x1

    .line 807
    invoke-direct {v4, v3, v10, v1}, La/e18;-><init>(Lkotlin/jvm/functions/Function0;La/l7m0;B)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v8, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 811
    .line 812
    .line 813
    :cond_1f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 814
    .line 815
    invoke-static {v0, v4}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    const/4 v14, 0x0

    .line 820
    invoke-static {v11, v2, v8, v14}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    iget-wide v4, v8, La/fet;->T:J

    .line 825
    .line 826
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 827
    .line 828
    .line 829
    move-result v2

    .line 830
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 831
    .line 832
    .line 833
    move-result-object v4

    .line 834
    invoke-static {v8, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    invoke-virtual {v8}, La/fet;->i0()V

    .line 839
    .line 840
    .line 841
    iget-boolean v5, v8, La/fet;->S:Z

    .line 842
    .line 843
    if-eqz v5, :cond_20

    .line 844
    .line 845
    move-object/from16 v5, v43

    .line 846
    .line 847
    invoke-virtual {v8, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 848
    .line 849
    .line 850
    :goto_19
    move-object/from16 v5, v16

    .line 851
    .line 852
    goto :goto_1a

    .line 853
    :cond_20
    invoke-virtual {v8}, La/fet;->r0()V

    .line 854
    .line 855
    .line 856
    goto :goto_19

    .line 857
    :goto_1a
    invoke-static {v8, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 858
    .line 859
    .line 860
    move-object/from16 v1, v40

    .line 861
    .line 862
    invoke-static {v8, v4, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 863
    .line 864
    .line 865
    move-object/from16 v1, v41

    .line 866
    .line 867
    invoke-static {v2, v8, v1, v8}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 868
    .line 869
    .line 870
    move-object/from16 v14, v42

    .line 871
    .line 872
    invoke-static {v8, v0, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 873
    .line 874
    .line 875
    sget-object v0, La/qmk;->a:La/zcl;

    .line 876
    .line 877
    const/high16 v0, 0x42380000    # 46.0f

    .line 878
    .line 879
    invoke-static {v12, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 880
    .line 881
    .line 882
    move-result-object v6

    .line 883
    move-object/from16 v1, p0

    .line 884
    .line 885
    iget-object v4, v1, La/rz7;->l:Ljava/lang/String;

    .line 886
    .line 887
    const/16 v10, 0x30

    .line 888
    .line 889
    const/16 v11, 0x7f8

    .line 890
    .line 891
    const/4 v5, 0x0

    .line 892
    const/4 v7, 0x0

    .line 893
    const/4 v8, 0x0

    .line 894
    move-object/from16 v9, p3

    .line 895
    .line 896
    invoke-static/range {v4 .. v11}, La/k7x;->a(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/qge;La/a4d;La/fet;II)V

    .line 897
    .line 898
    .line 899
    invoke-static {v12, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 900
    .line 901
    .line 902
    move-result-object v6

    .line 903
    iget-object v4, v1, La/rz7;->m:Ljava/lang/String;

    .line 904
    .line 905
    invoke-static/range {v4 .. v11}, La/k7x;->a(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/qge;La/a4d;La/fet;II)V

    .line 906
    .line 907
    .line 908
    move-object v8, v9

    .line 909
    const/4 v7, 0x1

    .line 910
    invoke-virtual {v8, v7}, La/fet;->r(Z)V

    .line 911
    .line 912
    .line 913
    goto :goto_1b

    .line 914
    :cond_21
    invoke-virtual {v8}, La/fet;->X()V

    .line 915
    .line 916
    .line 917
    :goto_1b
    invoke-virtual {v8}, La/fet;->u()La/yfe0;

    .line 918
    .line 919
    .line 920
    move-result-object v6

    .line 921
    if-eqz v6, :cond_22

    .line 922
    .line 923
    new-instance v0, La/ry2;

    .line 924
    .line 925
    const/16 v5, 0x1b

    .line 926
    .line 927
    move-object/from16 v2, p1

    .line 928
    .line 929
    move/from16 v4, p4

    .line 930
    .line 931
    invoke-direct/range {v0 .. v5}, La/ry2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;IB)V

    .line 932
    .line 933
    .line 934
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 935
    .line 936
    :cond_22
    return-void
.end method

.method public static final b(La/a4x;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v12, p3

    .line 8
    .line 9
    const v2, -0x7d577c5f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v2}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v13, 0x4

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    move v2, v13

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x2

    .line 25
    :goto_0
    or-int/2addr v2, v12

    .line 26
    invoke-virtual {v9, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/16 v14, 0x20

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    move v3, v14

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v3, 0x10

    .line 37
    .line 38
    :goto_1
    or-int v15, v2, v3

    .line 39
    .line 40
    and-int/lit8 v2, v15, 0x13

    .line 41
    .line 42
    const/16 v3, 0x12

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x1

    .line 46
    if-eq v2, v3, :cond_2

    .line 47
    .line 48
    move v2, v5

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v2, v4

    .line 51
    :goto_2
    and-int/lit8 v3, v15, 0x1

    .line 52
    .line 53
    invoke-virtual {v9, v3, v2}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_c

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eqz v2, :cond_d

    .line 70
    .line 71
    new-instance v3, La/f18;

    .line 72
    .line 73
    invoke-direct {v3, v0, v1, v12, v4}, La/f18;-><init>(La/a4x;Lkotlin/jvm/functions/Function0;IB)V

    .line 74
    .line 75
    .line 76
    :goto_3
    iput-object v3, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    sget-object v2, La/qmk;->a:La/zcl;

    .line 80
    .line 81
    const/high16 v2, 0x42380000    # 46.0f

    .line 82
    .line 83
    sget-object v3, La/jm40;->b:La/jm40;

    .line 84
    .line 85
    invoke-static {v3, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    sget-object v3, La/gqw0;->a:La/zx7;

    .line 90
    .line 91
    invoke-static {v3, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iget-wide v6, v9, La/fet;->T:J

    .line 96
    .line 97
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-static {v9, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 110
    .line 111
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v9}, La/fet;->i0()V

    .line 115
    .line 116
    .line 117
    iget-boolean v8, v9, La/fet;->S:Z

    .line 118
    .line 119
    if-eqz v8, :cond_4

    .line 120
    .line 121
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 122
    .line 123
    invoke-virtual {v9, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_4
    invoke-virtual {v9}, La/fet;->r0()V

    .line 128
    .line 129
    .line 130
    :goto_4
    sget-object v8, La/gqw0;->x:La/shd;

    .line 131
    .line 132
    invoke-static {v9, v3, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 133
    .line 134
    .line 135
    sget-object v3, La/gqw0;->w:La/shd;

    .line 136
    .line 137
    invoke-static {v9, v7, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    sget-object v6, La/gqw0;->y:La/shd;

    .line 145
    .line 146
    invoke-static {v9, v3, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 150
    .line 151
    .line 152
    sget-object v3, La/gqw0;->v:La/shd;

    .line 153
    .line 154
    const v6, 0x3c3e130f

    .line 155
    .line 156
    .line 157
    invoke-static {v9, v2, v3, v6, v0}, La/h97;->o(La/fet;La/mm40;La/shd;ILa/a4x;)Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v16

    .line 161
    move v2, v4

    .line 162
    :goto_5
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_b

    .line 167
    .line 168
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    add-int/lit8 v17, v2, 0x1

    .line 173
    .line 174
    if-ltz v2, :cond_a

    .line 175
    .line 176
    check-cast v3, La/pm80;

    .line 177
    .line 178
    sget-object v6, La/o7k0;->c:La/n0q;

    .line 179
    .line 180
    and-int/lit8 v7, v15, 0x70

    .line 181
    .line 182
    if-ne v7, v14, :cond_5

    .line 183
    .line 184
    move v7, v5

    .line 185
    goto :goto_6

    .line 186
    :cond_5
    move v7, v4

    .line 187
    :goto_6
    and-int/lit8 v8, v15, 0xe

    .line 188
    .line 189
    if-eq v8, v13, :cond_7

    .line 190
    .line 191
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-eqz v8, :cond_6

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_6
    move v8, v4

    .line 199
    goto :goto_8

    .line 200
    :cond_7
    :goto_7
    move v8, v5

    .line 201
    :goto_8
    or-int/2addr v7, v8

    .line 202
    invoke-virtual {v9, v2}, La/fet;->e(I)Z

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    or-int/2addr v7, v8

    .line 207
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    if-nez v7, :cond_8

    .line 212
    .line 213
    sget-object v7, La/ukd;->a:La/cl5;

    .line 214
    .line 215
    if-ne v8, v7, :cond_9

    .line 216
    .line 217
    :cond_8
    new-instance v8, La/g18;

    .line 218
    .line 219
    invoke-direct {v8, v1, v0, v2, v4}, La/g18;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v9, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_9
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 226
    .line 227
    invoke-static {v6, v8}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    const/16 v10, 0x38

    .line 232
    .line 233
    const/16 v11, 0x78

    .line 234
    .line 235
    move v6, v4

    .line 236
    move-object v4, v2

    .line 237
    move-object v2, v3

    .line 238
    const/4 v3, 0x0

    .line 239
    move v7, v5

    .line 240
    const/4 v5, 0x0

    .line 241
    move v8, v6

    .line 242
    const/4 v6, 0x0

    .line 243
    move/from16 v18, v7

    .line 244
    .line 245
    const/4 v7, 0x0

    .line 246
    move/from16 v19, v8

    .line 247
    .line 248
    const/4 v8, 0x0

    .line 249
    move/from16 v14, v18

    .line 250
    .line 251
    move/from16 v13, v19

    .line 252
    .line 253
    invoke-static/range {v2 .. v11}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 254
    .line 255
    .line 256
    move v4, v13

    .line 257
    move v5, v14

    .line 258
    move/from16 v2, v17

    .line 259
    .line 260
    const/4 v13, 0x4

    .line 261
    const/16 v14, 0x20

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_a
    invoke-static {}, La/q3d;->p()V

    .line 265
    .line 266
    .line 267
    const/4 v0, 0x0

    .line 268
    throw v0

    .line 269
    :cond_b
    move v13, v4

    .line 270
    move v14, v5

    .line 271
    invoke-virtual {v9, v13}, La/fet;->r(Z)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v9, v14}, La/fet;->r(Z)V

    .line 275
    .line 276
    .line 277
    goto :goto_9

    .line 278
    :cond_c
    move v14, v5

    .line 279
    invoke-virtual {v9}, La/fet;->X()V

    .line 280
    .line 281
    .line 282
    :goto_9
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    if-eqz v2, :cond_d

    .line 287
    .line 288
    new-instance v3, La/f18;

    .line 289
    .line 290
    invoke-direct {v3, v0, v1, v12, v14}, La/f18;-><init>(La/a4x;Lkotlin/jvm/functions/Function0;IB)V

    .line 291
    .line 292
    .line 293
    goto/16 :goto_3

    .line 294
    .line 295
    :cond_d
    return-void
.end method

.method public static final c(ILa/fet;La/mm40;)V
    .locals 4

    .line 1
    const v0, -0x41c6d3ff

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p0

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-eq v2, v1, :cond_1

    .line 22
    .line 23
    move v1, v3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_1
    and-int/2addr v0, v3

    .line 27
    invoke-virtual {p1, v0, v1}, La/fet;->U(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    sget v0, La/i18;->c:F

    .line 34
    .line 35
    invoke-static {p2, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sget-object v2, La/ukd;->a:La/cl5;

    .line 44
    .line 45
    if-ne v1, v2, :cond_2

    .line 46
    .line 47
    new-instance v1, La/nk7;

    .line 48
    .line 49
    const/16 v3, 0xb

    .line 50
    .line 51
    invoke-direct {v1, v3}, La/nk7;-><init>(B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 58
    .line 59
    invoke-static {v0, v1}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-ne v1, v2, :cond_3

    .line 68
    .line 69
    new-instance v1, La/nk7;

    .line 70
    .line 71
    const/16 v2, 0xc

    .line 72
    .line 73
    invoke-direct {v1, v2}, La/nk7;-><init>(B)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 80
    .line 81
    const/16 v2, 0x30

    .line 82
    .line 83
    invoke-static {v0, v1, p1, v2}, La/p8a;->k(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 88
    .line 89
    .line 90
    :goto_2
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-eqz p1, :cond_5

    .line 95
    .line 96
    new-instance v0, La/eg;

    .line 97
    .line 98
    const/16 v1, 0x18

    .line 99
    .line 100
    invoke-direct {v0, p2, p0, v1}, La/eg;-><init>(La/mm40;IB)V

    .line 101
    .line 102
    .line 103
    iput-object v0, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 104
    .line 105
    :cond_5
    return-void
.end method
