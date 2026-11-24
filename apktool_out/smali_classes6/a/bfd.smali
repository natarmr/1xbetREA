.class public final La/bfd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/l7m0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 14
    iput-byte p4, p0, La/bfd;->a:B

    iput-object p1, p0, La/bfd;->b:La/a4x;

    iput-object p2, p0, La/bfd;->c:La/l7m0;

    iput-object p3, p0, La/bfd;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/a4x;Lkotlin/jvm/functions/Function1;La/l7m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, La/bfd;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/bfd;->b:La/a4x;

    .line 8
    .line 9
    iput-object p2, p0, La/bfd;->d:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iput-object p3, p0, La/bfd;->c:La/l7m0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bfd;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41000000    # 8.0f

    .line 6
    .line 7
    const/high16 v3, 0x40800000    # 4.0f

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    sget-object v6, La/jm40;->b:La/jm40;

    .line 11
    .line 12
    iget-object v7, v0, La/bfd;->d:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    sget-object v8, La/ukd;->a:La/cl5;

    .line 15
    .line 16
    iget-object v9, v0, La/bfd;->c:La/l7m0;

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    iget-object v11, v0, La/bfd;->b:La/a4x;

    .line 20
    .line 21
    const/16 v12, 0x92

    .line 22
    .line 23
    const/4 v15, 0x4

    .line 24
    const/4 v5, 0x2

    .line 25
    const/4 v13, 0x0

    .line 26
    const/4 v14, 0x1

    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v0, p1

    .line 31
    .line 32
    check-cast v0, La/g9z;

    .line 33
    .line 34
    move-object/from16 v1, p2

    .line 35
    .line 36
    check-cast v1, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    move-object/from16 v2, p3

    .line 43
    .line 44
    check-cast v2, La/fet;

    .line 45
    .line 46
    move-object/from16 v16, p4

    .line 47
    .line 48
    check-cast v16, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v16

    .line 54
    and-int/lit8 v18, v16, 0x6

    .line 55
    .line 56
    if-nez v18, :cond_1

    .line 57
    .line 58
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move v15, v5

    .line 66
    :goto_0
    or-int v0, v16, v15

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move/from16 v0, v16

    .line 70
    .line 71
    :goto_1
    and-int/lit8 v15, v16, 0x30

    .line 72
    .line 73
    if-nez v15, :cond_3

    .line 74
    .line 75
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 76
    .line 77
    .line 78
    move-result v15

    .line 79
    if-eqz v15, :cond_2

    .line 80
    .line 81
    const/16 v17, 0x20

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    const/16 v17, 0x10

    .line 85
    .line 86
    :goto_2
    or-int v0, v0, v17

    .line 87
    .line 88
    :cond_3
    and-int/lit16 v15, v0, 0x93

    .line 89
    .line 90
    if-eq v15, v12, :cond_4

    .line 91
    .line 92
    move v12, v14

    .line 93
    goto :goto_3

    .line 94
    :cond_4
    move v12, v13

    .line 95
    :goto_3
    and-int/2addr v0, v14

    .line 96
    invoke-virtual {v2, v0, v12}, La/fet;->U(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_c

    .line 101
    .line 102
    invoke-interface {v11, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, La/mxm0;

    .line 107
    .line 108
    const v11, 0x700061b4

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v11}, La/fet;->e0(I)V

    .line 112
    .line 113
    .line 114
    iget-wide v11, v0, La/mxm0;->a:J

    .line 115
    .line 116
    iget-object v15, v0, La/mxm0;->b:Ljava/lang/String;

    .line 117
    .line 118
    iget-boolean v14, v0, La/mxm0;->c:Z

    .line 119
    .line 120
    invoke-virtual {v2, v11, v12}, La/fet;->f(J)Z

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    invoke-virtual {v2, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    or-int/2addr v11, v12

    .line 129
    invoke-virtual {v2, v14}, La/fet;->h(Z)Z

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    or-int/2addr v11, v12

    .line 134
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    if-nez v11, :cond_5

    .line 139
    .line 140
    if-ne v12, v8, :cond_6

    .line 141
    .line 142
    :cond_5
    new-instance v19, La/kvl;

    .line 143
    .line 144
    iget-wide v11, v0, La/mxm0;->a:J

    .line 145
    .line 146
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object v20

    .line 150
    new-instance v11, La/tui0;

    .line 151
    .line 152
    invoke-direct {v11, v15, v4}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 153
    .line 154
    .line 155
    new-instance v4, La/nvi0;

    .line 156
    .line 157
    invoke-direct {v4, v14}, La/nvi0;-><init>(Z)V

    .line 158
    .line 159
    .line 160
    const/16 v24, 0x0

    .line 161
    .line 162
    const/16 v25, 0x1f4

    .line 163
    .line 164
    const/16 v22, 0x0

    .line 165
    .line 166
    move-object/from16 v23, v4

    .line 167
    .line 168
    move-object/from16 v21, v11

    .line 169
    .line 170
    invoke-direct/range {v19 .. v25}, La/kvl;-><init>(Ljava/lang/Object;La/tui0;La/oui0;La/pvi0;La/wui0;I)V

    .line 171
    .line 172
    .line 173
    move-object/from16 v12, v19

    .line 174
    .line 175
    invoke-virtual {v2, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_6
    move-object/from16 v19, v12

    .line 179
    .line 180
    check-cast v19, La/kvl;

    .line 181
    .line 182
    sget-object v4, La/qmk;->a:La/zcl;

    .line 183
    .line 184
    const/4 v4, 0x1

    .line 185
    invoke-static {v6, v3, v10, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 186
    .line 187
    .line 188
    move-result-object v18

    .line 189
    invoke-virtual {v2, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    or-int/2addr v3, v5

    .line 198
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    if-nez v3, :cond_7

    .line 203
    .line 204
    if-ne v5, v8, :cond_8

    .line 205
    .line 206
    :cond_7
    new-instance v5, La/gxm0;

    .line 207
    .line 208
    invoke-direct {v5, v7, v0, v13}, La/gxm0;-><init>(Lkotlin/jvm/functions/Function1;La/mxm0;B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_8
    move-object/from16 v20, v5

    .line 215
    .line 216
    check-cast v20, Lkotlin/jvm/functions/Function1;

    .line 217
    .line 218
    invoke-virtual {v2, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    or-int/2addr v3, v5

    .line 227
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    if-nez v3, :cond_9

    .line 232
    .line 233
    if-ne v5, v8, :cond_a

    .line 234
    .line 235
    :cond_9
    new-instance v5, La/gxm0;

    .line 236
    .line 237
    invoke-direct {v5, v7, v0, v4}, La/gxm0;-><init>(Lkotlin/jvm/functions/Function1;La/mxm0;B)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    :cond_a
    move-object/from16 v21, v5

    .line 244
    .line 245
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 246
    .line 247
    const/16 v23, 0x0

    .line 248
    .line 249
    const/16 v24, 0x4

    .line 250
    .line 251
    move-object/from16 v22, v2

    .line 252
    .line 253
    invoke-static/range {v18 .. v24}, La/dub;->x(La/mm40;La/mvl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 254
    .line 255
    .line 256
    move-object/from16 v0, v22

    .line 257
    .line 258
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, La/vxm0;

    .line 263
    .line 264
    iget-object v2, v2, La/vxm0;->b:La/a4x;

    .line 265
    .line 266
    invoke-static {v2}, La/q3d;->i(Ljava/util/List;)I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-eq v1, v2, :cond_b

    .line 271
    .line 272
    const v1, 0x70098462

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 276
    .line 277
    .line 278
    sget-object v19, La/qqm;->a:La/qqm;

    .line 279
    .line 280
    const/16 v24, 0x30

    .line 281
    .line 282
    const/16 v25, 0xd

    .line 283
    .line 284
    const/16 v18, 0x0

    .line 285
    .line 286
    const/16 v20, 0x0

    .line 287
    .line 288
    const-wide/16 v21, 0x0

    .line 289
    .line 290
    move-object/from16 v23, v0

    .line 291
    .line 292
    invoke-static/range {v18 .. v25}, La/vtb;->t(La/mm40;La/qqm;La/bgi0;JLa/fet;II)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 296
    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_b
    const v1, 0x700be0c3

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 306
    .line 307
    .line 308
    :goto_4
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 309
    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_c
    move-object v0, v2

    .line 313
    invoke-virtual {v0}, La/fet;->X()V

    .line 314
    .line 315
    .line 316
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 317
    .line 318
    return-object v0

    .line 319
    :pswitch_0
    move-object/from16 v0, p1

    .line 320
    .line 321
    check-cast v0, La/g9z;

    .line 322
    .line 323
    move-object/from16 v1, p2

    .line 324
    .line 325
    check-cast v1, Ljava/lang/Number;

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    move-object/from16 v2, p3

    .line 332
    .line 333
    check-cast v2, La/fet;

    .line 334
    .line 335
    move-object/from16 v3, p4

    .line 336
    .line 337
    check-cast v3, Ljava/lang/Number;

    .line 338
    .line 339
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    and-int/lit8 v14, v3, 0x6

    .line 344
    .line 345
    if-nez v14, :cond_e

    .line 346
    .line 347
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-eqz v0, :cond_d

    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_d
    move v15, v5

    .line 355
    :goto_6
    or-int v0, v3, v15

    .line 356
    .line 357
    goto :goto_7

    .line 358
    :cond_e
    move v0, v3

    .line 359
    :goto_7
    and-int/lit8 v3, v3, 0x30

    .line 360
    .line 361
    if-nez v3, :cond_10

    .line 362
    .line 363
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    if-eqz v3, :cond_f

    .line 368
    .line 369
    const/16 v17, 0x20

    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_f
    const/16 v17, 0x10

    .line 373
    .line 374
    :goto_8
    or-int v0, v0, v17

    .line 375
    .line 376
    :cond_10
    and-int/lit16 v3, v0, 0x93

    .line 377
    .line 378
    if-eq v3, v12, :cond_11

    .line 379
    .line 380
    const/4 v3, 0x1

    .line 381
    :goto_9
    const/16 v18, 0x1

    .line 382
    .line 383
    goto :goto_a

    .line 384
    :cond_11
    move v3, v13

    .line 385
    goto :goto_9

    .line 386
    :goto_a
    and-int/lit8 v0, v0, 0x1

    .line 387
    .line 388
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-eqz v0, :cond_1b

    .line 393
    .line 394
    invoke-interface {v11, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    check-cast v0, La/nq90;

    .line 399
    .line 400
    const v3, -0x41ada548

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 404
    .line 405
    .line 406
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    check-cast v3, La/lo90;

    .line 411
    .line 412
    iget v3, v3, La/lo90;->g:I

    .line 413
    .line 414
    if-ne v3, v1, :cond_12

    .line 415
    .line 416
    const/4 v3, 0x1

    .line 417
    goto :goto_b

    .line 418
    :cond_12
    move v3, v13

    .line 419
    :goto_b
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v11

    .line 423
    check-cast v11, La/lo90;

    .line 424
    .line 425
    iget v11, v11, La/lo90;->f:I

    .line 426
    .line 427
    if-ne v11, v1, :cond_13

    .line 428
    .line 429
    const v1, -0x41abe30f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 433
    .line 434
    .line 435
    sget-object v1, La/sjm;->a:[La/sjm;

    .line 436
    .line 437
    const v1, 0x7f1310d8

    .line 438
    .line 439
    .line 440
    invoke-static {v1, v2}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v20

    .line 444
    const/16 v24, 0x0

    .line 445
    .line 446
    const/16 v26, 0x30

    .line 447
    .line 448
    const/16 v19, 0x0

    .line 449
    .line 450
    const/16 v21, 0x0

    .line 451
    .line 452
    const-wide/16 v22, 0x0

    .line 453
    .line 454
    move-object/from16 v25, v2

    .line 455
    .line 456
    invoke-static/range {v19 .. v26}, La/slb;->l(La/mm40;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 457
    .line 458
    .line 459
    move-object/from16 v1, v25

    .line 460
    .line 461
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 462
    .line 463
    .line 464
    goto :goto_c

    .line 465
    :cond_13
    move-object v1, v2

    .line 466
    const v2, -0x41a8f447    # -0.21000566f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 473
    .line 474
    .line 475
    :goto_c
    if-eqz v3, :cond_14

    .line 476
    .line 477
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    check-cast v2, La/lo90;

    .line 482
    .line 483
    iget-boolean v2, v2, La/lo90;->e:Z

    .line 484
    .line 485
    if-eqz v2, :cond_14

    .line 486
    .line 487
    const v2, -0x41a7e44d

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 491
    .line 492
    .line 493
    sget-object v2, La/qmk;->a:La/zcl;

    .line 494
    .line 495
    const/16 v24, 0x0

    .line 496
    .line 497
    const/16 v25, 0x5

    .line 498
    .line 499
    const/16 v19, 0x0

    .line 500
    .line 501
    const/high16 v20, 0x41800000    # 16.0f

    .line 502
    .line 503
    const-wide/16 v21, 0x0

    .line 504
    .line 505
    move-object/from16 v23, v1

    .line 506
    .line 507
    invoke-static/range {v19 .. v25}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 508
    .line 509
    .line 510
    sget-object v2, La/sjm;->a:[La/sjm;

    .line 511
    .line 512
    const v2, 0x7f130ee1

    .line 513
    .line 514
    .line 515
    invoke-static {v2, v1}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v20

    .line 519
    const/16 v24, 0x0

    .line 520
    .line 521
    const/16 v26, 0x30

    .line 522
    .line 523
    const/16 v21, 0x0

    .line 524
    .line 525
    const-wide/16 v22, 0x0

    .line 526
    .line 527
    move-object/from16 v25, v1

    .line 528
    .line 529
    invoke-static/range {v19 .. v26}, La/slb;->l(La/mm40;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 533
    .line 534
    .line 535
    goto :goto_d

    .line 536
    :cond_14
    const v2, -0x41a40cc7

    .line 537
    .line 538
    .line 539
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 543
    .line 544
    .line 545
    :goto_d
    instance-of v2, v0, La/jq90;

    .line 546
    .line 547
    if-eqz v2, :cond_1a

    .line 548
    .line 549
    const v2, -0x41a27644

    .line 550
    .line 551
    .line 552
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 553
    .line 554
    .line 555
    sget-object v2, La/qmk;->a:La/zcl;

    .line 556
    .line 557
    const/high16 v2, 0x41800000    # 16.0f

    .line 558
    .line 559
    invoke-static {v6, v2, v10, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 560
    .line 561
    .line 562
    move-result-object v19

    .line 563
    new-instance v20, La/rqm;

    .line 564
    .line 565
    new-instance v2, La/tui0;

    .line 566
    .line 567
    move-object v3, v0

    .line 568
    check-cast v3, La/jq90;

    .line 569
    .line 570
    iget-object v5, v3, La/jq90;->b:Ljava/lang/String;

    .line 571
    .line 572
    invoke-direct {v2, v5, v4}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 573
    .line 574
    .line 575
    new-instance v4, La/nvi0;

    .line 576
    .line 577
    iget v5, v3, La/jq90;->a:I

    .line 578
    .line 579
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    check-cast v6, La/lo90;

    .line 584
    .line 585
    iget v6, v6, La/lo90;->c:I

    .line 586
    .line 587
    if-ne v5, v6, :cond_15

    .line 588
    .line 589
    const/4 v5, 0x1

    .line 590
    goto :goto_e

    .line 591
    :cond_15
    move v5, v13

    .line 592
    :goto_e
    invoke-direct {v4, v5}, La/nvi0;-><init>(Z)V

    .line 593
    .line 594
    .line 595
    const/16 v28, 0x0

    .line 596
    .line 597
    const/16 v29, 0x1fa

    .line 598
    .line 599
    const/16 v22, 0x0

    .line 600
    .line 601
    const/16 v24, 0x0

    .line 602
    .line 603
    const/16 v25, 0x0

    .line 604
    .line 605
    const/16 v26, 0x0

    .line 606
    .line 607
    const/16 v27, 0x0

    .line 608
    .line 609
    move-object/from16 v21, v2

    .line 610
    .line 611
    move-object/from16 v23, v4

    .line 612
    .line 613
    invoke-direct/range {v20 .. v29}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v1, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    move-result v4

    .line 624
    or-int/2addr v2, v4

    .line 625
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v4

    .line 629
    if-nez v2, :cond_16

    .line 630
    .line 631
    if-ne v4, v8, :cond_17

    .line 632
    .line 633
    :cond_16
    new-instance v4, La/oo90;

    .line 634
    .line 635
    invoke-direct {v4, v7, v3, v13}, La/oo90;-><init>(Lkotlin/jvm/functions/Function1;La/jq90;B)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    :cond_17
    move-object/from16 v23, v4

    .line 642
    .line 643
    check-cast v23, Lkotlin/jvm/functions/Function0;

    .line 644
    .line 645
    invoke-virtual {v1, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v0

    .line 653
    or-int/2addr v0, v2

    .line 654
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    if-nez v0, :cond_18

    .line 659
    .line 660
    if-ne v2, v8, :cond_19

    .line 661
    .line 662
    :cond_18
    new-instance v2, La/oo90;

    .line 663
    .line 664
    const/4 v4, 0x1

    .line 665
    invoke-direct {v2, v7, v3, v4}, La/oo90;-><init>(Lkotlin/jvm/functions/Function1;La/jq90;B)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 669
    .line 670
    .line 671
    :cond_19
    move-object/from16 v25, v2

    .line 672
    .line 673
    check-cast v25, Lkotlin/jvm/functions/Function0;

    .line 674
    .line 675
    const/16 v28, 0x0

    .line 676
    .line 677
    const/16 v29, 0xac

    .line 678
    .line 679
    const/16 v21, 0x0

    .line 680
    .line 681
    const/16 v22, 0x0

    .line 682
    .line 683
    const/16 v24, 0x0

    .line 684
    .line 685
    const/16 v26, 0x0

    .line 686
    .line 687
    move-object/from16 v27, v1

    .line 688
    .line 689
    invoke-static/range {v19 .. v29}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 690
    .line 691
    .line 692
    sget-object v20, La/qqm;->a:La/qqm;

    .line 693
    .line 694
    const/16 v25, 0x1b0

    .line 695
    .line 696
    const/16 v26, 0x9

    .line 697
    .line 698
    const/16 v19, 0x0

    .line 699
    .line 700
    sget-object v21, La/zfi0;->a:La/zfi0;

    .line 701
    .line 702
    const-wide/16 v22, 0x0

    .line 703
    .line 704
    move-object/from16 v24, v1

    .line 705
    .line 706
    invoke-static/range {v19 .. v26}, La/vtb;->t(La/mm40;La/qqm;La/bgi0;JLa/fet;II)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 710
    .line 711
    .line 712
    goto :goto_f

    .line 713
    :cond_1a
    const v0, -0x4191b409

    .line 714
    .line 715
    .line 716
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 720
    .line 721
    .line 722
    :goto_f
    invoke-virtual {v1, v13}, La/fet;->r(Z)V

    .line 723
    .line 724
    .line 725
    goto :goto_10

    .line 726
    :cond_1b
    move-object v1, v2

    .line 727
    invoke-virtual {v1}, La/fet;->X()V

    .line 728
    .line 729
    .line 730
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 731
    .line 732
    return-object v0

    .line 733
    :pswitch_1
    move-object/from16 v1, p1

    .line 734
    .line 735
    check-cast v1, La/g9z;

    .line 736
    .line 737
    move-object/from16 v4, p2

    .line 738
    .line 739
    check-cast v4, Ljava/lang/Number;

    .line 740
    .line 741
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 742
    .line 743
    .line 744
    move-result v4

    .line 745
    move-object/from16 v6, p3

    .line 746
    .line 747
    check-cast v6, La/fet;

    .line 748
    .line 749
    move-object/from16 v7, p4

    .line 750
    .line 751
    check-cast v7, Ljava/lang/Number;

    .line 752
    .line 753
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 754
    .line 755
    .line 756
    move-result v7

    .line 757
    and-int/lit8 v8, v7, 0x6

    .line 758
    .line 759
    if-nez v8, :cond_1d

    .line 760
    .line 761
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result v1

    .line 765
    if-eqz v1, :cond_1c

    .line 766
    .line 767
    goto :goto_11

    .line 768
    :cond_1c
    move v15, v5

    .line 769
    :goto_11
    or-int v1, v7, v15

    .line 770
    .line 771
    goto :goto_12

    .line 772
    :cond_1d
    move v1, v7

    .line 773
    :goto_12
    and-int/lit8 v5, v7, 0x30

    .line 774
    .line 775
    if-nez v5, :cond_1f

    .line 776
    .line 777
    invoke-virtual {v6, v4}, La/fet;->e(I)Z

    .line 778
    .line 779
    .line 780
    move-result v5

    .line 781
    if-eqz v5, :cond_1e

    .line 782
    .line 783
    const/16 v17, 0x20

    .line 784
    .line 785
    goto :goto_13

    .line 786
    :cond_1e
    const/16 v17, 0x10

    .line 787
    .line 788
    :goto_13
    or-int v1, v1, v17

    .line 789
    .line 790
    :cond_1f
    and-int/lit16 v5, v1, 0x93

    .line 791
    .line 792
    if-eq v5, v12, :cond_20

    .line 793
    .line 794
    const/4 v5, 0x1

    .line 795
    :goto_14
    const/16 v18, 0x1

    .line 796
    .line 797
    goto :goto_15

    .line 798
    :cond_20
    move v5, v13

    .line 799
    goto :goto_14

    .line 800
    :goto_15
    and-int/lit8 v1, v1, 0x1

    .line 801
    .line 802
    invoke-virtual {v6, v1, v5}, La/fet;->U(IZ)Z

    .line 803
    .line 804
    .line 805
    move-result v1

    .line 806
    if-eqz v1, :cond_25

    .line 807
    .line 808
    invoke-interface {v11, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    check-cast v1, La/uzy;

    .line 813
    .line 814
    const v5, -0x588953e2

    .line 815
    .line 816
    .line 817
    invoke-virtual {v6, v5}, La/fet;->e0(I)V

    .line 818
    .line 819
    .line 820
    instance-of v5, v1, La/szy;

    .line 821
    .line 822
    sget-object v7, La/jm40;->b:La/jm40;

    .line 823
    .line 824
    if-eqz v5, :cond_23

    .line 825
    .line 826
    const v5, -0x58887171

    .line 827
    .line 828
    .line 829
    invoke-virtual {v6, v5}, La/fet;->e0(I)V

    .line 830
    .line 831
    .line 832
    if-nez v4, :cond_21

    .line 833
    .line 834
    sget-object v3, La/qmk;->a:La/zcl;

    .line 835
    .line 836
    goto :goto_16

    .line 837
    :cond_21
    sget-object v2, La/qmk;->a:La/zcl;

    .line 838
    .line 839
    move v2, v3

    .line 840
    :goto_16
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v3

    .line 844
    check-cast v3, La/vzy;

    .line 845
    .line 846
    iget-object v3, v3, La/vzy;->b:La/a4x;

    .line 847
    .line 848
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 849
    .line 850
    .line 851
    move-result v3

    .line 852
    const/16 v18, 0x1

    .line 853
    .line 854
    add-int/lit8 v3, v3, -0x1

    .line 855
    .line 856
    if-ne v4, v3, :cond_22

    .line 857
    .line 858
    const/high16 v5, 0x41c00000    # 24.0f

    .line 859
    .line 860
    goto :goto_17

    .line 861
    :cond_22
    move v5, v10

    .line 862
    :goto_17
    invoke-static {v6}, La/xfn;->a(La/fet;)La/wfn;

    .line 863
    .line 864
    .line 865
    move-result-object v3

    .line 866
    iget v3, v3, La/wfn;->d:F

    .line 867
    .line 868
    invoke-static {v6}, La/xfn;->a(La/fet;)La/wfn;

    .line 869
    .line 870
    .line 871
    move-result-object v4

    .line 872
    iget v4, v4, La/wfn;->d:F

    .line 873
    .line 874
    invoke-static {v7, v3, v2, v4, v5}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 875
    .line 876
    .line 877
    move-result-object v19

    .line 878
    move-object/from16 v20, v1

    .line 879
    .line 880
    check-cast v20, La/szy;

    .line 881
    .line 882
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v1

    .line 886
    check-cast v1, La/vzy;

    .line 887
    .line 888
    iget-boolean v1, v1, La/vzy;->c:Z

    .line 889
    .line 890
    iget-object v0, v0, La/bfd;->d:Lkotlin/jvm/functions/Function1;

    .line 891
    .line 892
    const/16 v24, 0x0

    .line 893
    .line 894
    move-object/from16 v22, v0

    .line 895
    .line 896
    move/from16 v21, v1

    .line 897
    .line 898
    move-object/from16 v23, v6

    .line 899
    .line 900
    invoke-static/range {v19 .. v24}, La/x1x;->n(La/mm40;La/szy;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 901
    .line 902
    .line 903
    move-object/from16 v0, v23

    .line 904
    .line 905
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 906
    .line 907
    .line 908
    goto :goto_19

    .line 909
    :cond_23
    move-object v0, v6

    .line 910
    const v1, -0x587c73f5

    .line 911
    .line 912
    .line 913
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 914
    .line 915
    .line 916
    sget-object v1, La/qmk;->a:La/zcl;

    .line 917
    .line 918
    if-nez v4, :cond_24

    .line 919
    .line 920
    move/from16 v21, v2

    .line 921
    .line 922
    goto :goto_18

    .line 923
    :cond_24
    move/from16 v21, v3

    .line 924
    .line 925
    :goto_18
    invoke-static {v0}, La/xfn;->a(La/fet;)La/wfn;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    iget v1, v1, La/wfn;->d:F

    .line 930
    .line 931
    invoke-static {v0}, La/xfn;->a(La/fet;)La/wfn;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    iget v2, v2, La/wfn;->d:F

    .line 936
    .line 937
    const/16 v23, 0x0

    .line 938
    .line 939
    const/16 v24, 0x8

    .line 940
    .line 941
    move/from16 v20, v1

    .line 942
    .line 943
    move/from16 v22, v2

    .line 944
    .line 945
    move-object/from16 v19, v7

    .line 946
    .line 947
    invoke-static/range {v19 .. v24}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 948
    .line 949
    .line 950
    move-result-object v1

    .line 951
    invoke-static {v13, v0, v1}, La/eeq;->I(ILa/fet;La/mm40;)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 955
    .line 956
    .line 957
    :goto_19
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 958
    .line 959
    .line 960
    goto :goto_1a

    .line 961
    :cond_25
    move-object v0, v6

    .line 962
    invoke-virtual {v0}, La/fet;->X()V

    .line 963
    .line 964
    .line 965
    :goto_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 966
    .line 967
    return-object v0

    .line 968
    :pswitch_2
    move-object/from16 v0, p1

    .line 969
    .line 970
    check-cast v0, La/g9z;

    .line 971
    .line 972
    move-object/from16 v1, p2

    .line 973
    .line 974
    check-cast v1, Ljava/lang/Number;

    .line 975
    .line 976
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 977
    .line 978
    .line 979
    move-result v1

    .line 980
    move-object/from16 v3, p3

    .line 981
    .line 982
    check-cast v3, La/fet;

    .line 983
    .line 984
    move-object/from16 v4, p4

    .line 985
    .line 986
    check-cast v4, Ljava/lang/Number;

    .line 987
    .line 988
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 989
    .line 990
    .line 991
    move-result v4

    .line 992
    and-int/lit8 v14, v4, 0x6

    .line 993
    .line 994
    if-nez v14, :cond_27

    .line 995
    .line 996
    invoke-virtual {v3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 997
    .line 998
    .line 999
    move-result v0

    .line 1000
    if-eqz v0, :cond_26

    .line 1001
    .line 1002
    goto :goto_1b

    .line 1003
    :cond_26
    move v15, v5

    .line 1004
    :goto_1b
    or-int v0, v4, v15

    .line 1005
    .line 1006
    goto :goto_1c

    .line 1007
    :cond_27
    move v0, v4

    .line 1008
    :goto_1c
    and-int/lit8 v4, v4, 0x30

    .line 1009
    .line 1010
    if-nez v4, :cond_29

    .line 1011
    .line 1012
    invoke-virtual {v3, v1}, La/fet;->e(I)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v4

    .line 1016
    if-eqz v4, :cond_28

    .line 1017
    .line 1018
    const/16 v17, 0x20

    .line 1019
    .line 1020
    goto :goto_1d

    .line 1021
    :cond_28
    const/16 v17, 0x10

    .line 1022
    .line 1023
    :goto_1d
    or-int v0, v0, v17

    .line 1024
    .line 1025
    :cond_29
    and-int/lit16 v4, v0, 0x93

    .line 1026
    .line 1027
    if-eq v4, v12, :cond_2a

    .line 1028
    .line 1029
    const/4 v4, 0x1

    .line 1030
    :goto_1e
    const/16 v18, 0x1

    .line 1031
    .line 1032
    goto :goto_1f

    .line 1033
    :cond_2a
    move v4, v13

    .line 1034
    goto :goto_1e

    .line 1035
    :goto_1f
    and-int/lit8 v0, v0, 0x1

    .line 1036
    .line 1037
    invoke-virtual {v3, v0, v4}, La/fet;->U(IZ)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v0

    .line 1041
    if-eqz v0, :cond_2f

    .line 1042
    .line 1043
    invoke-interface {v11, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    check-cast v0, La/ugp;

    .line 1048
    .line 1049
    const v4, -0x42e9b15d

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 1053
    .line 1054
    .line 1055
    instance-of v4, v0, La/sgp;

    .line 1056
    .line 1057
    if-eqz v4, :cond_2b

    .line 1058
    .line 1059
    move-object v4, v0

    .line 1060
    check-cast v4, La/sgp;

    .line 1061
    .line 1062
    iget-object v4, v4, La/sgp;->a:La/mim0;

    .line 1063
    .line 1064
    :goto_20
    move-object/from16 v20, v4

    .line 1065
    .line 1066
    goto :goto_21

    .line 1067
    :cond_2b
    new-instance v4, La/lim0;

    .line 1068
    .line 1069
    sget-object v5, La/aql0;->a:La/aql0;

    .line 1070
    .line 1071
    invoke-direct {v4}, La/lim0;-><init>()V

    .line 1072
    .line 1073
    .line 1074
    goto :goto_20

    .line 1075
    :goto_21
    sget-object v4, La/qmk;->a:La/zcl;

    .line 1076
    .line 1077
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v4

    .line 1081
    check-cast v4, La/vgp;

    .line 1082
    .line 1083
    iget-object v4, v4, La/vgp;->b:La/a4x;

    .line 1084
    .line 1085
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1086
    .line 1087
    .line 1088
    move-result v4

    .line 1089
    const/16 v18, 0x1

    .line 1090
    .line 1091
    add-int/lit8 v4, v4, -0x1

    .line 1092
    .line 1093
    if-ne v1, v4, :cond_2c

    .line 1094
    .line 1095
    const/high16 v5, 0x41c00000    # 24.0f

    .line 1096
    .line 1097
    goto :goto_22

    .line 1098
    :cond_2c
    move v5, v10

    .line 1099
    :goto_22
    invoke-static {v3}, La/xfn;->a(La/fet;)La/wfn;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v1

    .line 1103
    iget v1, v1, La/wfn;->d:F

    .line 1104
    .line 1105
    invoke-static {v3}, La/xfn;->a(La/fet;)La/wfn;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v4

    .line 1109
    iget v4, v4, La/wfn;->d:F

    .line 1110
    .line 1111
    invoke-static {v6, v1, v2, v4, v5}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v19

    .line 1115
    invoke-virtual {v3, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v1

    .line 1119
    invoke-virtual {v3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1120
    .line 1121
    .line 1122
    move-result v2

    .line 1123
    or-int/2addr v1, v2

    .line 1124
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v2

    .line 1128
    if-nez v1, :cond_2d

    .line 1129
    .line 1130
    if-ne v2, v8, :cond_2e

    .line 1131
    .line 1132
    :cond_2d
    new-instance v2, La/d2p;

    .line 1133
    .line 1134
    const/4 v1, 0x5

    .line 1135
    invoke-direct {v2, v7, v0, v1}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v3, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1139
    .line 1140
    .line 1141
    :cond_2e
    move-object/from16 v22, v2

    .line 1142
    .line 1143
    check-cast v22, Lkotlin/jvm/functions/Function1;

    .line 1144
    .line 1145
    const/16 v24, 0x0

    .line 1146
    .line 1147
    const/16 v21, 0x1

    .line 1148
    .line 1149
    move-object/from16 v23, v3

    .line 1150
    .line 1151
    invoke-static/range {v19 .. v24}, La/lgb;->n(La/mm40;La/mim0;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1152
    .line 1153
    .line 1154
    move-object/from16 v0, v23

    .line 1155
    .line 1156
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 1157
    .line 1158
    .line 1159
    goto :goto_23

    .line 1160
    :cond_2f
    move-object v0, v3

    .line 1161
    invoke-virtual {v0}, La/fet;->X()V

    .line 1162
    .line 1163
    .line 1164
    :goto_23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1165
    .line 1166
    return-object v0

    .line 1167
    :pswitch_3
    move-object/from16 v0, p1

    .line 1168
    .line 1169
    check-cast v0, La/g9z;

    .line 1170
    .line 1171
    move-object/from16 v1, p2

    .line 1172
    .line 1173
    check-cast v1, Ljava/lang/Number;

    .line 1174
    .line 1175
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1176
    .line 1177
    .line 1178
    move-result v1

    .line 1179
    move-object/from16 v2, p3

    .line 1180
    .line 1181
    check-cast v2, La/fet;

    .line 1182
    .line 1183
    move-object/from16 v3, p4

    .line 1184
    .line 1185
    check-cast v3, Ljava/lang/Number;

    .line 1186
    .line 1187
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1188
    .line 1189
    .line 1190
    move-result v3

    .line 1191
    and-int/lit8 v4, v3, 0x6

    .line 1192
    .line 1193
    if-nez v4, :cond_31

    .line 1194
    .line 1195
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1196
    .line 1197
    .line 1198
    move-result v0

    .line 1199
    if-eqz v0, :cond_30

    .line 1200
    .line 1201
    goto :goto_24

    .line 1202
    :cond_30
    move v15, v5

    .line 1203
    :goto_24
    or-int v0, v3, v15

    .line 1204
    .line 1205
    goto :goto_25

    .line 1206
    :cond_31
    move v0, v3

    .line 1207
    :goto_25
    and-int/lit8 v3, v3, 0x30

    .line 1208
    .line 1209
    if-nez v3, :cond_33

    .line 1210
    .line 1211
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v3

    .line 1215
    if-eqz v3, :cond_32

    .line 1216
    .line 1217
    const/16 v17, 0x20

    .line 1218
    .line 1219
    goto :goto_26

    .line 1220
    :cond_32
    const/16 v17, 0x10

    .line 1221
    .line 1222
    :goto_26
    or-int v0, v0, v17

    .line 1223
    .line 1224
    :cond_33
    and-int/lit16 v3, v0, 0x93

    .line 1225
    .line 1226
    if-eq v3, v12, :cond_34

    .line 1227
    .line 1228
    const/4 v4, 0x1

    .line 1229
    :goto_27
    const/16 v18, 0x1

    .line 1230
    .line 1231
    goto :goto_28

    .line 1232
    :cond_34
    move v4, v13

    .line 1233
    goto :goto_27

    .line 1234
    :goto_28
    and-int/lit8 v0, v0, 0x1

    .line 1235
    .line 1236
    invoke-virtual {v2, v0, v4}, La/fet;->U(IZ)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v0

    .line 1240
    if-eqz v0, :cond_39

    .line 1241
    .line 1242
    invoke-interface {v11, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v0

    .line 1246
    check-cast v0, La/xdd;

    .line 1247
    .line 1248
    const v3, -0x7a02b00b

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 1252
    .line 1253
    .line 1254
    instance-of v3, v0, La/vdd;

    .line 1255
    .line 1256
    if-eqz v3, :cond_35

    .line 1257
    .line 1258
    move-object v3, v0

    .line 1259
    check-cast v3, La/vdd;

    .line 1260
    .line 1261
    iget-object v3, v3, La/vdd;->a:La/mim0;

    .line 1262
    .line 1263
    :goto_29
    move-object/from16 v20, v3

    .line 1264
    .line 1265
    goto :goto_2a

    .line 1266
    :cond_35
    new-instance v3, La/lim0;

    .line 1267
    .line 1268
    sget-object v4, La/aql0;->a:La/aql0;

    .line 1269
    .line 1270
    invoke-direct {v3}, La/lim0;-><init>()V

    .line 1271
    .line 1272
    .line 1273
    goto :goto_29

    .line 1274
    :goto_2a
    sget-object v3, La/qmk;->a:La/zcl;

    .line 1275
    .line 1276
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v3

    .line 1280
    check-cast v3, La/dfd;

    .line 1281
    .line 1282
    iget-object v3, v3, La/dfd;->b:La/a4x;

    .line 1283
    .line 1284
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1285
    .line 1286
    .line 1287
    move-result v3

    .line 1288
    const/16 v18, 0x1

    .line 1289
    .line 1290
    add-int/lit8 v3, v3, -0x1

    .line 1291
    .line 1292
    if-ne v1, v3, :cond_36

    .line 1293
    .line 1294
    const/high16 v5, 0x41c00000    # 24.0f

    .line 1295
    .line 1296
    goto :goto_2b

    .line 1297
    :cond_36
    move v5, v10

    .line 1298
    :goto_2b
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v1

    .line 1302
    iget v1, v1, La/wfn;->d:F

    .line 1303
    .line 1304
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v3

    .line 1308
    iget v3, v3, La/wfn;->d:F

    .line 1309
    .line 1310
    const/high16 v4, 0x41400000    # 12.0f

    .line 1311
    .line 1312
    invoke-static {v6, v1, v4, v3, v5}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v19

    .line 1316
    invoke-virtual {v2, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1317
    .line 1318
    .line 1319
    move-result v1

    .line 1320
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1321
    .line 1322
    .line 1323
    move-result v3

    .line 1324
    or-int/2addr v1, v3

    .line 1325
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v3

    .line 1329
    if-nez v1, :cond_37

    .line 1330
    .line 1331
    if-ne v3, v8, :cond_38

    .line 1332
    .line 1333
    :cond_37
    new-instance v3, La/at7;

    .line 1334
    .line 1335
    const/16 v1, 0x18

    .line 1336
    .line 1337
    invoke-direct {v3, v7, v0, v1}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1341
    .line 1342
    .line 1343
    :cond_38
    move-object/from16 v22, v3

    .line 1344
    .line 1345
    check-cast v22, Lkotlin/jvm/functions/Function1;

    .line 1346
    .line 1347
    const/16 v24, 0x0

    .line 1348
    .line 1349
    const/16 v21, 0x1

    .line 1350
    .line 1351
    move-object/from16 v23, v2

    .line 1352
    .line 1353
    invoke-static/range {v19 .. v24}, La/lgb;->n(La/mm40;La/mim0;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1354
    .line 1355
    .line 1356
    move-object/from16 v0, v23

    .line 1357
    .line 1358
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 1359
    .line 1360
    .line 1361
    goto :goto_2c

    .line 1362
    :cond_39
    move-object v0, v2

    .line 1363
    invoke-virtual {v0}, La/fet;->X()V

    .line 1364
    .line 1365
    .line 1366
    :goto_2c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1367
    .line 1368
    return-object v0

    .line 1369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
