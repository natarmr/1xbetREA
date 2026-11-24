.class public final synthetic La/qt1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:La/l7m0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(FLa/l7m0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/qt1;->a:B

    iput p1, p0, La/qt1;->b:F

    iput-object p2, p0, La/qt1;->c:La/l7m0;

    iput-object p3, p0, La/qt1;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qt1;->a:B

    .line 4
    .line 5
    const/16 v2, 0x482

    .line 6
    .line 7
    const v5, 0x7f040ae3

    .line 8
    .line 9
    .line 10
    sget-object v6, La/ukd;->a:La/cl5;

    .line 11
    .line 12
    const/high16 v7, 0x3f800000    # 1.0f

    .line 13
    .line 14
    sget-object v8, La/jm40;->b:La/jm40;

    .line 15
    .line 16
    const/4 v10, 0x4

    .line 17
    const/4 v11, 0x1

    .line 18
    const/4 v12, 0x0

    .line 19
    iget-object v13, v0, La/qt1;->d:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    iget-object v14, v0, La/qt1;->c:La/l7m0;

    .line 22
    .line 23
    const/16 v15, 0xe

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, La/l7m0;

    .line 31
    .line 32
    move-object/from16 v16, p2

    .line 33
    .line 34
    check-cast v16, La/l7m0;

    .line 35
    .line 36
    move-object/from16 v3, p3

    .line 37
    .line 38
    check-cast v3, La/ycl;

    .line 39
    .line 40
    move-object/from16 v4, p4

    .line 41
    .line 42
    check-cast v4, La/fet;

    .line 43
    .line 44
    move-object/from16 v19, p5

    .line 45
    .line 46
    check-cast v19, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    and-int/lit8 v16, v9, 0x6

    .line 59
    .line 60
    if-nez v16, :cond_1

    .line 61
    .line 62
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v16

    .line 66
    if-eqz v16, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    const/4 v10, 0x2

    .line 70
    :goto_0
    or-int/2addr v10, v9

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move v10, v9

    .line 73
    :goto_1
    and-int/lit16 v9, v9, 0x180

    .line 74
    .line 75
    if-nez v9, :cond_3

    .line 76
    .line 77
    iget v9, v3, La/ycl;->a:F

    .line 78
    .line 79
    invoke-virtual {v4, v9}, La/fet;->d(F)Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-eqz v9, :cond_2

    .line 84
    .line 85
    const/16 v17, 0x100

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    const/16 v17, 0x80

    .line 89
    .line 90
    :goto_2
    or-int v10, v10, v17

    .line 91
    .line 92
    :cond_3
    and-int/lit16 v9, v10, 0x483

    .line 93
    .line 94
    if-eq v9, v2, :cond_4

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    move v11, v12

    .line 98
    :goto_3
    and-int/lit8 v2, v10, 0x1

    .line 99
    .line 100
    invoke-virtual {v4, v2, v11}, La/fet;->U(IZ)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_7

    .line 105
    .line 106
    invoke-static {v8, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 107
    .line 108
    .line 109
    move-result-object v16

    .line 110
    iget v2, v3, La/ycl;->a:F

    .line 111
    .line 112
    invoke-interface {v14}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, La/ev1;

    .line 117
    .line 118
    invoke-interface {v3}, La/ev1;->e()La/fu1;

    .line 119
    .line 120
    .line 121
    move-result-object v20

    .line 122
    invoke-virtual {v4, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    if-nez v3, :cond_5

    .line 131
    .line 132
    if-ne v7, v6, :cond_6

    .line 133
    .line 134
    :cond_5
    new-instance v7, La/si1;

    .line 135
    .line 136
    const/16 v3, 0x12

    .line 137
    .line 138
    invoke-direct {v7, v13, v3}, La/si1;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_6
    move-object/from16 v21, v7

    .line 145
    .line 146
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 147
    .line 148
    shl-int/lit8 v3, v10, 0x3

    .line 149
    .line 150
    and-int/lit8 v6, v3, 0x70

    .line 151
    .line 152
    or-int/lit8 v6, v6, 0x6

    .line 153
    .line 154
    and-int/lit16 v3, v3, 0x1c00

    .line 155
    .line 156
    or-int v23, v6, v3

    .line 157
    .line 158
    iget v0, v0, La/qt1;->b:F

    .line 159
    .line 160
    move/from16 v18, v0

    .line 161
    .line 162
    move-object/from16 v17, v1

    .line 163
    .line 164
    move/from16 v19, v2

    .line 165
    .line 166
    move-object/from16 v22, v4

    .line 167
    .line 168
    invoke-static/range {v16 .. v23}, La/hu1;->a(La/mm40;La/l7m0;FFLa/fu1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 169
    .line 170
    .line 171
    move-object/from16 v0, v17

    .line 172
    .line 173
    move-object/from16 v1, v22

    .line 174
    .line 175
    and-int/lit8 v2, v10, 0xe

    .line 176
    .line 177
    invoke-static {v0, v5, v1, v2}, La/vbc;->f(La/l7m0;ILa/fet;I)V

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_7
    move-object v1, v4

    .line 182
    invoke-virtual {v1}, La/fet;->X()V

    .line 183
    .line 184
    .line 185
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object v0

    .line 188
    :pswitch_0
    move-object/from16 v1, p1

    .line 189
    .line 190
    check-cast v1, La/l7m0;

    .line 191
    .line 192
    move-object/from16 v3, p2

    .line 193
    .line 194
    check-cast v3, La/l7m0;

    .line 195
    .line 196
    move-object/from16 v4, p3

    .line 197
    .line 198
    check-cast v4, La/ycl;

    .line 199
    .line 200
    move v9, v12

    .line 201
    move-object/from16 v12, p4

    .line 202
    .line 203
    check-cast v12, La/fet;

    .line 204
    .line 205
    move-object/from16 v16, p5

    .line 206
    .line 207
    check-cast v16, Ljava/lang/Integer;

    .line 208
    .line 209
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    and-int/lit8 v3, v9, 0x6

    .line 220
    .line 221
    if-nez v3, :cond_9

    .line 222
    .line 223
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-eqz v3, :cond_8

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_8
    const/4 v10, 0x2

    .line 231
    :goto_5
    or-int v3, v9, v10

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_9
    move v3, v9

    .line 235
    :goto_6
    and-int/lit16 v9, v9, 0x180

    .line 236
    .line 237
    if-nez v9, :cond_b

    .line 238
    .line 239
    iget v9, v4, La/ycl;->a:F

    .line 240
    .line 241
    invoke-virtual {v12, v9}, La/fet;->d(F)Z

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    if-eqz v9, :cond_a

    .line 246
    .line 247
    const/16 v17, 0x100

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_a
    const/16 v17, 0x80

    .line 251
    .line 252
    :goto_7
    or-int v3, v3, v17

    .line 253
    .line 254
    :cond_b
    and-int/lit16 v9, v3, 0x483

    .line 255
    .line 256
    if-eq v9, v2, :cond_c

    .line 257
    .line 258
    goto :goto_8

    .line 259
    :cond_c
    const/4 v11, 0x0

    .line 260
    :goto_8
    and-int/lit8 v2, v3, 0x1

    .line 261
    .line 262
    invoke-virtual {v12, v2, v11}, La/fet;->U(IZ)Z

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    if-eqz v2, :cond_f

    .line 267
    .line 268
    invoke-static {v8, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    iget v9, v4, La/ycl;->a:F

    .line 273
    .line 274
    invoke-interface {v14}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    check-cast v4, La/ev1;

    .line 279
    .line 280
    invoke-interface {v4}, La/ev1;->e()La/fu1;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    invoke-virtual {v12, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    if-nez v4, :cond_d

    .line 293
    .line 294
    if-ne v7, v6, :cond_e

    .line 295
    .line 296
    :cond_d
    new-instance v7, La/si1;

    .line 297
    .line 298
    const/16 v4, 0x10

    .line 299
    .line 300
    invoke-direct {v7, v13, v4}, La/si1;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    :cond_e
    move-object v11, v7

    .line 307
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 308
    .line 309
    shl-int/lit8 v4, v3, 0x3

    .line 310
    .line 311
    and-int/lit8 v6, v4, 0x70

    .line 312
    .line 313
    or-int/lit8 v6, v6, 0x6

    .line 314
    .line 315
    and-int/lit16 v4, v4, 0x1c00

    .line 316
    .line 317
    or-int v13, v6, v4

    .line 318
    .line 319
    iget v8, v0, La/qt1;->b:F

    .line 320
    .line 321
    move-object v7, v1

    .line 322
    move-object v6, v2

    .line 323
    invoke-static/range {v6 .. v13}, La/ro4;->i(La/mm40;La/l7m0;FFLa/fu1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 324
    .line 325
    .line 326
    and-int/lit8 v0, v3, 0xe

    .line 327
    .line 328
    invoke-static {v7, v5, v12, v0}, La/vbc;->f(La/l7m0;ILa/fet;I)V

    .line 329
    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_f
    invoke-virtual {v12}, La/fet;->X()V

    .line 333
    .line 334
    .line 335
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object v0

    .line 338
    :pswitch_1
    move-object/from16 v1, p1

    .line 339
    .line 340
    check-cast v1, La/l7m0;

    .line 341
    .line 342
    move-object/from16 v3, p2

    .line 343
    .line 344
    check-cast v3, La/l7m0;

    .line 345
    .line 346
    move-object/from16 v4, p3

    .line 347
    .line 348
    check-cast v4, La/ycl;

    .line 349
    .line 350
    move-object/from16 v12, p4

    .line 351
    .line 352
    check-cast v12, La/fet;

    .line 353
    .line 354
    move-object/from16 v9, p5

    .line 355
    .line 356
    check-cast v9, Ljava/lang/Integer;

    .line 357
    .line 358
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 359
    .line 360
    .line 361
    move-result v9

    .line 362
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    and-int/lit8 v3, v9, 0x6

    .line 369
    .line 370
    if-nez v3, :cond_11

    .line 371
    .line 372
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v3

    .line 376
    if-eqz v3, :cond_10

    .line 377
    .line 378
    goto :goto_a

    .line 379
    :cond_10
    const/4 v10, 0x2

    .line 380
    :goto_a
    or-int v3, v9, v10

    .line 381
    .line 382
    goto :goto_b

    .line 383
    :cond_11
    move v3, v9

    .line 384
    :goto_b
    and-int/lit16 v9, v9, 0x180

    .line 385
    .line 386
    if-nez v9, :cond_13

    .line 387
    .line 388
    iget v9, v4, La/ycl;->a:F

    .line 389
    .line 390
    invoke-virtual {v12, v9}, La/fet;->d(F)Z

    .line 391
    .line 392
    .line 393
    move-result v9

    .line 394
    if-eqz v9, :cond_12

    .line 395
    .line 396
    const/16 v17, 0x100

    .line 397
    .line 398
    goto :goto_c

    .line 399
    :cond_12
    const/16 v17, 0x80

    .line 400
    .line 401
    :goto_c
    or-int v3, v3, v17

    .line 402
    .line 403
    :cond_13
    and-int/lit16 v9, v3, 0x483

    .line 404
    .line 405
    if-eq v9, v2, :cond_14

    .line 406
    .line 407
    goto :goto_d

    .line 408
    :cond_14
    const/4 v11, 0x0

    .line 409
    :goto_d
    and-int/lit8 v2, v3, 0x1

    .line 410
    .line 411
    invoke-virtual {v12, v2, v11}, La/fet;->U(IZ)Z

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    if-eqz v2, :cond_17

    .line 416
    .line 417
    invoke-static {v8, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    iget v9, v4, La/ycl;->a:F

    .line 422
    .line 423
    invoke-interface {v14}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    check-cast v4, La/ev1;

    .line 428
    .line 429
    invoke-interface {v4}, La/ev1;->e()La/fu1;

    .line 430
    .line 431
    .line 432
    move-result-object v10

    .line 433
    invoke-virtual {v12, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v7

    .line 441
    if-nez v4, :cond_15

    .line 442
    .line 443
    if-ne v7, v6, :cond_16

    .line 444
    .line 445
    :cond_15
    new-instance v7, La/si1;

    .line 446
    .line 447
    invoke-direct {v7, v13, v15}, La/si1;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    :cond_16
    move-object v11, v7

    .line 454
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 455
    .line 456
    shl-int/lit8 v4, v3, 0x3

    .line 457
    .line 458
    and-int/lit8 v6, v4, 0x70

    .line 459
    .line 460
    or-int/lit8 v6, v6, 0x6

    .line 461
    .line 462
    and-int/lit16 v4, v4, 0x1c00

    .line 463
    .line 464
    or-int v13, v6, v4

    .line 465
    .line 466
    iget v8, v0, La/qt1;->b:F

    .line 467
    .line 468
    move-object v7, v1

    .line 469
    move-object v6, v2

    .line 470
    invoke-static/range {v6 .. v13}, La/xia0;->c(La/mm40;La/l7m0;FFLa/fu1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 471
    .line 472
    .line 473
    and-int/lit8 v0, v3, 0xe

    .line 474
    .line 475
    invoke-static {v7, v5, v12, v0}, La/vbc;->f(La/l7m0;ILa/fet;I)V

    .line 476
    .line 477
    .line 478
    goto :goto_e

    .line 479
    :cond_17
    invoke-virtual {v12}, La/fet;->X()V

    .line 480
    .line 481
    .line 482
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 483
    .line 484
    return-object v0

    .line 485
    :pswitch_2
    move-object/from16 v1, p1

    .line 486
    .line 487
    check-cast v1, La/l7m0;

    .line 488
    .line 489
    move-object/from16 v2, p2

    .line 490
    .line 491
    check-cast v2, La/l7m0;

    .line 492
    .line 493
    move-object/from16 v3, p3

    .line 494
    .line 495
    check-cast v3, La/ycl;

    .line 496
    .line 497
    move-object/from16 v3, p4

    .line 498
    .line 499
    check-cast v3, La/fet;

    .line 500
    .line 501
    move-object/from16 v4, p5

    .line 502
    .line 503
    check-cast v4, Ljava/lang/Integer;

    .line 504
    .line 505
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 506
    .line 507
    .line 508
    move-result v4

    .line 509
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    and-int/lit8 v2, v4, 0x6

    .line 516
    .line 517
    if-nez v2, :cond_19

    .line 518
    .line 519
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    if-eqz v2, :cond_18

    .line 524
    .line 525
    move v9, v10

    .line 526
    goto :goto_f

    .line 527
    :cond_18
    const/4 v9, 0x2

    .line 528
    :goto_f
    or-int/2addr v4, v9

    .line 529
    :cond_19
    and-int/lit16 v2, v4, 0x403

    .line 530
    .line 531
    const/16 v9, 0x402

    .line 532
    .line 533
    if-eq v2, v9, :cond_1a

    .line 534
    .line 535
    goto :goto_10

    .line 536
    :cond_1a
    const/4 v11, 0x0

    .line 537
    :goto_10
    and-int/lit8 v2, v4, 0x1

    .line 538
    .line 539
    invoke-virtual {v3, v2, v11}, La/fet;->U(IZ)Z

    .line 540
    .line 541
    .line 542
    move-result v2

    .line 543
    if-eqz v2, :cond_1d

    .line 544
    .line 545
    invoke-static {v8, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    invoke-interface {v14}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v7

    .line 553
    check-cast v7, La/ev1;

    .line 554
    .line 555
    invoke-interface {v7}, La/ev1;->e()La/fu1;

    .line 556
    .line 557
    .line 558
    move-result-object v9

    .line 559
    invoke-virtual {v3, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v7

    .line 563
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v8

    .line 567
    if-nez v7, :cond_1b

    .line 568
    .line 569
    if-ne v8, v6, :cond_1c

    .line 570
    .line 571
    :cond_1b
    new-instance v8, La/si1;

    .line 572
    .line 573
    const/16 v6, 0xb

    .line 574
    .line 575
    invoke-direct {v8, v13, v6}, La/si1;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v3, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    :cond_1c
    move-object v10, v8

    .line 582
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 583
    .line 584
    shl-int/lit8 v6, v4, 0x3

    .line 585
    .line 586
    and-int/lit8 v6, v6, 0x70

    .line 587
    .line 588
    or-int/lit8 v12, v6, 0x6

    .line 589
    .line 590
    iget v8, v0, La/qt1;->b:F

    .line 591
    .line 592
    move-object v7, v1

    .line 593
    move-object v6, v2

    .line 594
    move-object v11, v3

    .line 595
    invoke-static/range {v6 .. v12}, La/gq80;->f(La/mm40;La/l7m0;FLa/fu1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 596
    .line 597
    .line 598
    and-int/lit8 v0, v4, 0xe

    .line 599
    .line 600
    invoke-static {v7, v5, v11, v0}, La/vbc;->f(La/l7m0;ILa/fet;I)V

    .line 601
    .line 602
    .line 603
    goto :goto_11

    .line 604
    :cond_1d
    move-object v11, v3

    .line 605
    invoke-virtual {v11}, La/fet;->X()V

    .line 606
    .line 607
    .line 608
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 609
    .line 610
    return-object v0

    .line 611
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
