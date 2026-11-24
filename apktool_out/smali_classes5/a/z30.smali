.class public final synthetic La/z30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z30;->a:B

    iput p1, p0, La/z30;->b:I

    iput-object p2, p0, La/z30;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/z30;->a:B

    iput-object p1, p0, La/z30;->c:Ljava/lang/Object;

    iput p2, p0, La/z30;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/z30;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/16 v5, 0x12

    .line 11
    .line 12
    const/16 v6, 0x10

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x4

    .line 16
    const/4 v11, 0x1

    .line 17
    iget v12, v0, La/z30;->b:I

    .line 18
    .line 19
    iget-object v0, v0, La/z30;->c:Ljava/lang/Object;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    check-cast v0, La/o0d0;

    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/ams0;

    .line 29
    .line 30
    move-object/from16 v2, p2

    .line 31
    .line 32
    check-cast v2, La/fet;

    .line 33
    .line 34
    move-object/from16 v3, p3

    .line 35
    .line 36
    check-cast v3, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const v3, 0x19ba7891

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 45
    .line 46
    .line 47
    iget-object v0, v0, La/o0d0;->a:Ljava/util/ArrayList;

    .line 48
    .line 49
    new-instance v3, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const/4 v5, 0x0

    .line 63
    :goto_0
    if-ge v5, v4, :cond_6

    .line 64
    .line 65
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, La/boq0;

    .line 70
    .line 71
    iget v7, v6, La/boq0;->a:I

    .line 72
    .line 73
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    iget v8, v6, La/boq0;->b:I

    .line 78
    .line 79
    iget-object v11, v6, La/boq0;->e:La/p0d0;

    .line 80
    .line 81
    instance-of v13, v11, La/t0d0;

    .line 82
    .line 83
    if-eqz v13, :cond_1

    .line 84
    .line 85
    check-cast v11, La/t0d0;

    .line 86
    .line 87
    new-instance v13, La/jmy;

    .line 88
    .line 89
    new-instance v14, La/imy;

    .line 90
    .line 91
    invoke-direct {v14}, La/imy;-><init>()V

    .line 92
    .line 93
    .line 94
    iput v8, v14, La/imy;->a:I

    .line 95
    .line 96
    iget-object v11, v11, La/t0d0;->b:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result v15

    .line 102
    const/4 v9, 0x0

    .line 103
    :goto_1
    if-ge v9, v15, :cond_0

    .line 104
    .line 105
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v16

    .line 109
    move-object/from16 v10, v16

    .line 110
    .line 111
    check-cast v10, La/dmy;

    .line 112
    .line 113
    move-object/from16 v16, v0

    .line 114
    .line 115
    iget-object v0, v10, La/dmy;->b:Ljava/lang/Object;

    .line 116
    .line 117
    move-object/from16 p0, v1

    .line 118
    .line 119
    int-to-float v1, v8

    .line 120
    move/from16 p1, v1

    .line 121
    .line 122
    iget v1, v10, La/dmy;->a:F

    .line 123
    .line 124
    mul-float v1, v1, p1

    .line 125
    .line 126
    float-to-int v1, v1

    .line 127
    invoke-virtual {v14, v1, v0}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iget-object v1, v10, La/dmy;->c:La/ghn;

    .line 132
    .line 133
    iput-object v1, v0, La/hmy;->b:La/ghn;

    .line 134
    .line 135
    add-int/lit8 v9, v9, 0x1

    .line 136
    .line 137
    move-object/from16 v1, p0

    .line 138
    .line 139
    move-object/from16 v0, v16

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_0
    move-object/from16 v16, v0

    .line 143
    .line 144
    move-object/from16 p0, v1

    .line 145
    .line 146
    invoke-direct {v13, v14}, La/jmy;-><init>(La/imy;)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_1
    move-object/from16 v16, v0

    .line 151
    .line 152
    move-object/from16 p0, v1

    .line 153
    .line 154
    instance-of v0, v11, La/s0d0;

    .line 155
    .line 156
    if-eqz v0, :cond_5

    .line 157
    .line 158
    check-cast v11, La/s0d0;

    .line 159
    .line 160
    new-instance v13, La/jmy;

    .line 161
    .line 162
    new-instance v0, La/imy;

    .line 163
    .line 164
    invoke-direct {v0}, La/imy;-><init>()V

    .line 165
    .line 166
    .line 167
    iput v8, v0, La/imy;->a:I

    .line 168
    .line 169
    iget-object v1, v11, La/s0d0;->b:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    const/4 v10, 0x0

    .line 176
    :goto_2
    if-ge v10, v9, :cond_2

    .line 177
    .line 178
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v11

    .line 182
    check-cast v11, La/dmy;

    .line 183
    .line 184
    iget-object v14, v11, La/dmy;->b:Ljava/lang/Object;

    .line 185
    .line 186
    int-to-float v15, v8

    .line 187
    move-object/from16 p1, v1

    .line 188
    .line 189
    iget v1, v11, La/dmy;->a:F

    .line 190
    .line 191
    mul-float/2addr v15, v1

    .line 192
    float-to-int v1, v15

    .line 193
    invoke-virtual {v0, v1, v14}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    iget-object v11, v11, La/dmy;->c:La/ghn;

    .line 198
    .line 199
    iput-object v11, v1, La/hmy;->b:La/ghn;

    .line 200
    .line 201
    add-int/lit8 v10, v10, 0x1

    .line 202
    .line 203
    move-object/from16 v1, p1

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_2
    invoke-direct {v13, v0}, La/jmy;-><init>(La/imy;)V

    .line 207
    .line 208
    .line 209
    :goto_3
    iget v0, v6, La/boq0;->c:I

    .line 210
    .line 211
    if-nez v0, :cond_3

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_3
    const/4 v1, -0x1

    .line 215
    if-ne v0, v1, :cond_4

    .line 216
    .line 217
    const v0, 0x7fffffff

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 222
    .line 223
    :goto_4
    iget-object v1, v6, La/boq0;->d:La/kkf0;

    .line 224
    .line 225
    const/16 v6, 0x8

    .line 226
    .line 227
    invoke-static {v0, v13, v1, v6}, La/ro4;->f0(ILa/jmy;La/kkf0;I)La/ukf0;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    :goto_5
    new-instance v0, Lkotlin/Pair;

    .line 232
    .line 233
    invoke-direct {v0, v7, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    add-int/lit8 v5, v5, 0x1

    .line 240
    .line 241
    move-object/from16 v1, p0

    .line 242
    .line 243
    move-object/from16 v0, v16

    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_5
    const-string v0, "Unexpected value type: "

    .line 248
    .line 249
    invoke-static {v11, v0}, La/e9d0;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    const/4 v9, 0x0

    .line 253
    goto :goto_8

    .line 254
    :cond_6
    move-object/from16 p0, v1

    .line 255
    .line 256
    new-instance v0, La/j7d;

    .line 257
    .line 258
    invoke-direct {v0, v3}, La/j7d;-><init>(Ljava/util/ArrayList;)V

    .line 259
    .line 260
    .line 261
    invoke-interface/range {p0 .. p0}, La/ams0;->b()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    check-cast v1, Ljava/lang/Boolean;

    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-eqz v1, :cond_7

    .line 272
    .line 273
    move-object v9, v0

    .line 274
    :goto_6
    const/4 v0, 0x0

    .line 275
    goto :goto_7

    .line 276
    :cond_7
    new-instance v1, La/zag0;

    .line 277
    .line 278
    invoke-direct {v1, v0, v12}, La/zag0;-><init>(La/cfq;I)V

    .line 279
    .line 280
    .line 281
    move-object v9, v1

    .line 282
    goto :goto_6

    .line 283
    :goto_7
    invoke-virtual {v2, v0}, La/fet;->r(Z)V

    .line 284
    .line 285
    .line 286
    :goto_8
    return-object v9

    .line 287
    :pswitch_0
    check-cast v0, La/ugd;

    .line 288
    .line 289
    move-object/from16 v1, p1

    .line 290
    .line 291
    check-cast v1, La/g9z;

    .line 292
    .line 293
    move-object/from16 v2, p2

    .line 294
    .line 295
    check-cast v2, La/fet;

    .line 296
    .line 297
    move-object/from16 v3, p3

    .line 298
    .line 299
    check-cast v3, Ljava/lang/Integer;

    .line 300
    .line 301
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    and-int/lit8 v4, v3, 0x6

    .line 306
    .line 307
    if-nez v4, :cond_9

    .line 308
    .line 309
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    if-eqz v4, :cond_8

    .line 314
    .line 315
    move v7, v8

    .line 316
    :cond_8
    or-int/2addr v3, v7

    .line 317
    :cond_9
    and-int/lit8 v4, v3, 0x13

    .line 318
    .line 319
    if-eq v4, v5, :cond_a

    .line 320
    .line 321
    move v10, v11

    .line 322
    goto :goto_9

    .line 323
    :cond_a
    const/4 v10, 0x0

    .line 324
    :goto_9
    and-int/lit8 v4, v3, 0x1

    .line 325
    .line 326
    invoke-virtual {v2, v4, v10}, La/fet;->U(IZ)Z

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    if-eqz v4, :cond_b

    .line 331
    .line 332
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    and-int/lit8 v3, v3, 0xe

    .line 337
    .line 338
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    invoke-virtual {v0, v1, v4, v2, v3}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    goto :goto_a

    .line 346
    :cond_b
    invoke-virtual {v2}, La/fet;->X()V

    .line 347
    .line 348
    .line 349
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    return-object v0

    .line 352
    :pswitch_1
    check-cast v0, La/fit;

    .line 353
    .line 354
    move-object/from16 v1, p1

    .line 355
    .line 356
    check-cast v1, La/y5d;

    .line 357
    .line 358
    move-object/from16 v5, p2

    .line 359
    .line 360
    check-cast v5, La/fet;

    .line 361
    .line 362
    move-object/from16 v7, p3

    .line 363
    .line 364
    check-cast v7, Ljava/lang/Integer;

    .line 365
    .line 366
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    sget-object v8, La/fit;->m2:La/ddk;

    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    and-int/lit8 v1, v7, 0x11

    .line 376
    .line 377
    if-eq v1, v6, :cond_c

    .line 378
    .line 379
    move v1, v11

    .line 380
    goto :goto_b

    .line 381
    :cond_c
    const/4 v1, 0x0

    .line 382
    :goto_b
    and-int/lit8 v6, v7, 0x1

    .line 383
    .line 384
    invoke-virtual {v5, v6, v1}, La/fet;->U(IZ)Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-eqz v1, :cond_f

    .line 389
    .line 390
    const/4 v1, 0x0

    .line 391
    invoke-static {v1, v1, v5, v1, v4}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-static {v1, v5}, La/a8k0;->G(La/bch0;La/fet;)La/ak50;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    const/4 v6, 0x0

    .line 400
    invoke-static {v3, v4, v6}, La/cjx;->V(La/mm40;La/vj50;La/yj50;)La/mm40;

    .line 401
    .line 402
    .line 403
    move-result-object v17

    .line 404
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    invoke-virtual {v5, v12}, La/fet;->e(I)Z

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    or-int/2addr v3, v4

    .line 413
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    if-nez v3, :cond_d

    .line 418
    .line 419
    if-ne v4, v2, :cond_e

    .line 420
    .line 421
    :cond_d
    new-instance v4, La/z08;

    .line 422
    .line 423
    const/4 v2, 0x5

    .line 424
    invoke-direct {v4, v0, v12, v2}, La/z08;-><init>(Ljava/lang/Object;IB)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v5, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    :cond_e
    move-object/from16 v25, v4

    .line 431
    .line 432
    check-cast v25, Lkotlin/jvm/functions/Function1;

    .line 433
    .line 434
    const/16 v27, 0x0

    .line 435
    .line 436
    const/16 v28, 0x1fc

    .line 437
    .line 438
    const/16 v19, 0x0

    .line 439
    .line 440
    const/16 v20, 0x0

    .line 441
    .line 442
    const/16 v21, 0x0

    .line 443
    .line 444
    const/16 v22, 0x0

    .line 445
    .line 446
    const/16 v23, 0x0

    .line 447
    .line 448
    const/16 v24, 0x0

    .line 449
    .line 450
    move-object/from16 v18, v1

    .line 451
    .line 452
    move-object/from16 v26, v5

    .line 453
    .line 454
    invoke-static/range {v17 .. v28}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 455
    .line 456
    .line 457
    goto :goto_c

    .line 458
    :cond_f
    move-object/from16 v26, v5

    .line 459
    .line 460
    invoke-virtual/range {v26 .. v26}, La/fet;->X()V

    .line 461
    .line 462
    .line 463
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 464
    .line 465
    return-object v0

    .line 466
    :pswitch_2
    check-cast v0, La/dit;

    .line 467
    .line 468
    move-object/from16 v1, p1

    .line 469
    .line 470
    check-cast v1, La/y5d;

    .line 471
    .line 472
    move-object/from16 v5, p2

    .line 473
    .line 474
    check-cast v5, La/fet;

    .line 475
    .line 476
    move-object/from16 v7, p3

    .line 477
    .line 478
    check-cast v7, Ljava/lang/Integer;

    .line 479
    .line 480
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 481
    .line 482
    .line 483
    move-result v7

    .line 484
    sget-object v9, La/dit;->m2:La/xak;

    .line 485
    .line 486
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    and-int/lit8 v1, v7, 0x11

    .line 490
    .line 491
    if-eq v1, v6, :cond_10

    .line 492
    .line 493
    move v1, v11

    .line 494
    goto :goto_d

    .line 495
    :cond_10
    const/4 v1, 0x0

    .line 496
    :goto_d
    and-int/lit8 v6, v7, 0x1

    .line 497
    .line 498
    invoke-virtual {v5, v6, v1}, La/fet;->U(IZ)Z

    .line 499
    .line 500
    .line 501
    move-result v1

    .line 502
    if-eqz v1, :cond_13

    .line 503
    .line 504
    const/4 v1, 0x0

    .line 505
    invoke-static {v1, v1, v5, v1, v4}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    invoke-static {v1, v5}, La/a8k0;->G(La/bch0;La/fet;)La/ak50;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    const/4 v6, 0x0

    .line 514
    invoke-static {v3, v4, v6}, La/cjx;->V(La/mm40;La/vj50;La/yj50;)La/mm40;

    .line 515
    .line 516
    .line 517
    move-result-object v17

    .line 518
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    invoke-virtual {v5, v12}, La/fet;->e(I)Z

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    or-int/2addr v3, v4

    .line 527
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v4

    .line 531
    if-nez v3, :cond_11

    .line 532
    .line 533
    if-ne v4, v2, :cond_12

    .line 534
    .line 535
    :cond_11
    new-instance v4, La/z08;

    .line 536
    .line 537
    invoke-direct {v4, v0, v12, v8}, La/z08;-><init>(Ljava/lang/Object;IB)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v5, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    :cond_12
    move-object/from16 v25, v4

    .line 544
    .line 545
    check-cast v25, Lkotlin/jvm/functions/Function1;

    .line 546
    .line 547
    const/16 v27, 0x0

    .line 548
    .line 549
    const/16 v28, 0x1fc

    .line 550
    .line 551
    const/16 v19, 0x0

    .line 552
    .line 553
    const/16 v20, 0x0

    .line 554
    .line 555
    const/16 v21, 0x0

    .line 556
    .line 557
    const/16 v22, 0x0

    .line 558
    .line 559
    const/16 v23, 0x0

    .line 560
    .line 561
    const/16 v24, 0x0

    .line 562
    .line 563
    move-object/from16 v18, v1

    .line 564
    .line 565
    move-object/from16 v26, v5

    .line 566
    .line 567
    invoke-static/range {v17 .. v28}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 568
    .line 569
    .line 570
    goto :goto_e

    .line 571
    :cond_13
    move-object/from16 v26, v5

    .line 572
    .line 573
    invoke-virtual/range {v26 .. v26}, La/fet;->X()V

    .line 574
    .line 575
    .line 576
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 577
    .line 578
    return-object v0

    .line 579
    :pswitch_3
    check-cast v0, La/qao0;

    .line 580
    .line 581
    move-object/from16 v1, p1

    .line 582
    .line 583
    check-cast v1, La/odo0;

    .line 584
    .line 585
    move-object/from16 v2, p2

    .line 586
    .line 587
    check-cast v2, La/fet;

    .line 588
    .line 589
    move-object/from16 v3, p3

    .line 590
    .line 591
    check-cast v3, Ljava/lang/Integer;

    .line 592
    .line 593
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    and-int/lit8 v4, v3, 0x6

    .line 601
    .line 602
    if-nez v4, :cond_16

    .line 603
    .line 604
    and-int/lit8 v4, v3, 0x8

    .line 605
    .line 606
    if-nez v4, :cond_14

    .line 607
    .line 608
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v4

    .line 612
    goto :goto_f

    .line 613
    :cond_14
    invoke-virtual {v2, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v4

    .line 617
    :goto_f
    if-eqz v4, :cond_15

    .line 618
    .line 619
    move v7, v8

    .line 620
    :cond_15
    or-int/2addr v3, v7

    .line 621
    :cond_16
    and-int/lit8 v4, v3, 0x13

    .line 622
    .line 623
    if-eq v4, v5, :cond_17

    .line 624
    .line 625
    move v4, v11

    .line 626
    goto :goto_10

    .line 627
    :cond_17
    const/4 v4, 0x0

    .line 628
    :goto_10
    and-int/2addr v3, v11

    .line 629
    invoke-virtual {v2, v3, v4}, La/fet;->U(IZ)Z

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    if-eqz v3, :cond_18

    .line 634
    .line 635
    sget-object v17, La/jdk0;->c:La/jdk0;

    .line 636
    .line 637
    new-instance v3, La/jbo0;

    .line 638
    .line 639
    iget-object v4, v1, La/odo0;->a:La/pz40;

    .line 640
    .line 641
    iget-object v1, v1, La/odo0;->b:La/nul0;

    .line 642
    .line 643
    const/4 v5, 0x0

    .line 644
    invoke-direct {v3, v4, v12, v5, v1}, La/jbo0;-><init>(La/l7m0;IZLa/nul0;)V

    .line 645
    .line 646
    .line 647
    sget-object v1, La/qmk;->a:La/zcl;

    .line 648
    .line 649
    iget-wide v0, v0, La/qao0;->a:J

    .line 650
    .line 651
    const/high16 v4, 0x43b40000    # 360.0f

    .line 652
    .line 653
    const/4 v5, 0x0

    .line 654
    invoke-static {v4, v4, v5, v5}, La/vgg0;->b(FFFF)La/ugg0;

    .line 655
    .line 656
    .line 657
    move-result-object v23

    .line 658
    const/high16 v25, 0x30000

    .line 659
    .line 660
    const/16 v26, 0x0

    .line 661
    .line 662
    const/high16 v19, 0x42600000    # 56.0f

    .line 663
    .line 664
    const/high16 v20, 0x40000000    # 2.0f

    .line 665
    .line 666
    move-wide/from16 v21, v0

    .line 667
    .line 668
    move-object/from16 v24, v2

    .line 669
    .line 670
    move-object/from16 v18, v3

    .line 671
    .line 672
    invoke-virtual/range {v17 .. v26}, La/jdk0;->b(La/mm40;FFJLa/yjj0;La/fet;II)V

    .line 673
    .line 674
    .line 675
    goto :goto_11

    .line 676
    :cond_18
    move-object/from16 v24, v2

    .line 677
    .line 678
    invoke-virtual/range {v24 .. v24}, La/fet;->X()V

    .line 679
    .line 680
    .line 681
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 682
    .line 683
    return-object v0

    .line 684
    :pswitch_4
    check-cast v0, La/kie0;

    .line 685
    .line 686
    move-object/from16 v1, p1

    .line 687
    .line 688
    check-cast v1, La/g9z;

    .line 689
    .line 690
    move-object/from16 v2, p2

    .line 691
    .line 692
    check-cast v2, La/fet;

    .line 693
    .line 694
    move-object/from16 v3, p3

    .line 695
    .line 696
    check-cast v3, Ljava/lang/Integer;

    .line 697
    .line 698
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 699
    .line 700
    .line 701
    move-result v3

    .line 702
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    and-int/lit8 v1, v3, 0x11

    .line 706
    .line 707
    if-eq v1, v6, :cond_19

    .line 708
    .line 709
    move v1, v11

    .line 710
    goto :goto_12

    .line 711
    :cond_19
    const/4 v1, 0x0

    .line 712
    :goto_12
    and-int/2addr v3, v11

    .line 713
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 714
    .line 715
    .line 716
    move-result v1

    .line 717
    if-eqz v1, :cond_1e

    .line 718
    .line 719
    rem-int/2addr v12, v7

    .line 720
    if-eqz v12, :cond_1a

    .line 721
    .line 722
    const v0, -0x42cd5b71

    .line 723
    .line 724
    .line 725
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 726
    .line 727
    .line 728
    sget-object v0, La/qmk;->a:La/zcl;

    .line 729
    .line 730
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 731
    .line 732
    invoke-virtual {v2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 737
    .line 738
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSeparator60-0d7_KjU()J

    .line 739
    .line 740
    .line 741
    move-result-wide v19

    .line 742
    const/16 v22, 0x0

    .line 743
    .line 744
    const/16 v23, 0x1

    .line 745
    .line 746
    const/16 v17, 0x0

    .line 747
    .line 748
    const/high16 v18, 0x3f800000    # 1.0f

    .line 749
    .line 750
    move-object/from16 v21, v2

    .line 751
    .line 752
    invoke-static/range {v17 .. v23}, La/jcb;->v(La/mm40;FJLa/fet;II)V

    .line 753
    .line 754
    .line 755
    move-object/from16 v1, v21

    .line 756
    .line 757
    const/4 v5, 0x0

    .line 758
    invoke-virtual {v1, v5}, La/fet;->r(Z)V

    .line 759
    .line 760
    .line 761
    goto/16 :goto_16

    .line 762
    .line 763
    :cond_1a
    move-object v1, v2

    .line 764
    const/4 v5, 0x0

    .line 765
    const v2, -0x42c974a9

    .line 766
    .line 767
    .line 768
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 769
    .line 770
    .line 771
    iget v2, v0, La/kie0;->a:I

    .line 772
    .line 773
    add-int/2addr v2, v11

    .line 774
    iput v2, v0, La/kie0;->a:I

    .line 775
    .line 776
    sget-object v2, La/uc9;->c:La/mw3;

    .line 777
    .line 778
    sget-object v3, La/gqw0;->m:La/xx7;

    .line 779
    .line 780
    invoke-static {v2, v3, v1, v5}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    iget-wide v3, v1, La/fet;->T:J

    .line 785
    .line 786
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 787
    .line 788
    .line 789
    move-result v3

    .line 790
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    sget-object v5, La/jm40;->b:La/jm40;

    .line 795
    .line 796
    invoke-static {v1, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 797
    .line 798
    .line 799
    move-result-object v6

    .line 800
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 801
    .line 802
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v1}, La/fet;->i0()V

    .line 806
    .line 807
    .line 808
    iget-boolean v8, v1, La/fet;->S:Z

    .line 809
    .line 810
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 811
    .line 812
    if-eqz v8, :cond_1b

    .line 813
    .line 814
    invoke-virtual {v1, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 815
    .line 816
    .line 817
    goto :goto_13

    .line 818
    :cond_1b
    invoke-virtual {v1}, La/fet;->r0()V

    .line 819
    .line 820
    .line 821
    :goto_13
    sget-object v8, La/gqw0;->x:La/shd;

    .line 822
    .line 823
    invoke-static {v1, v2, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 824
    .line 825
    .line 826
    sget-object v2, La/gqw0;->w:La/shd;

    .line 827
    .line 828
    invoke-static {v1, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 829
    .line 830
    .line 831
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 832
    .line 833
    .line 834
    move-result-object v3

    .line 835
    sget-object v4, La/gqw0;->y:La/shd;

    .line 836
    .line 837
    invoke-static {v1, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 838
    .line 839
    .line 840
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 841
    .line 842
    .line 843
    sget-object v3, La/gqw0;->v:La/shd;

    .line 844
    .line 845
    invoke-static {v1, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 846
    .line 847
    .line 848
    sget-object v6, La/qmk;->a:La/zcl;

    .line 849
    .line 850
    const/16 v21, 0x0

    .line 851
    .line 852
    const/16 v22, 0xc

    .line 853
    .line 854
    const/high16 v18, 0x41000000    # 8.0f

    .line 855
    .line 856
    const/high16 v19, 0x41000000    # 8.0f

    .line 857
    .line 858
    const/16 v20, 0x0

    .line 859
    .line 860
    move-object/from16 v17, v5

    .line 861
    .line 862
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 863
    .line 864
    .line 865
    move-result-object v5

    .line 866
    const/high16 v6, 0x41900000    # 18.0f

    .line 867
    .line 868
    invoke-static {v5, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 869
    .line 870
    .line 871
    move-result-object v5

    .line 872
    iget v0, v0, La/kie0;->a:I

    .line 873
    .line 874
    rem-int/2addr v0, v7

    .line 875
    if-eqz v0, :cond_1c

    .line 876
    .line 877
    const/high16 v0, 0x42800000    # 64.0f

    .line 878
    .line 879
    goto :goto_14

    .line 880
    :cond_1c
    const/high16 v0, 0x43000000    # 128.0f

    .line 881
    .line 882
    :goto_14
    invoke-static {v5, v0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    sget-object v5, La/qmk;->i:La/zcl;

    .line 887
    .line 888
    sget-object v6, La/vgg0;->a:La/ugg0;

    .line 889
    .line 890
    invoke-static {v5, v5, v5, v5, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    const/4 v6, 0x0

    .line 895
    const/4 v7, 0x0

    .line 896
    invoke-static {v6, v1, v7, v11}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 897
    .line 898
    .line 899
    move-result-object v10

    .line 900
    invoke-static {v0, v10}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    invoke-static {v7, v1, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 905
    .line 906
    .line 907
    const/high16 v21, 0x41000000    # 8.0f

    .line 908
    .line 909
    const/16 v22, 0x5

    .line 910
    .line 911
    const/16 v18, 0x0

    .line 912
    .line 913
    const/high16 v19, 0x41400000    # 12.0f

    .line 914
    .line 915
    const/16 v20, 0x0

    .line 916
    .line 917
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    move-object/from16 v6, v17

    .line 922
    .line 923
    sget-object v10, La/uc9;->a:La/lw3;

    .line 924
    .line 925
    sget-object v12, La/gqw0;->j:La/yx7;

    .line 926
    .line 927
    invoke-static {v10, v12, v1, v7}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 928
    .line 929
    .line 930
    move-result-object v10

    .line 931
    iget-wide v12, v1, La/fet;->T:J

    .line 932
    .line 933
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 934
    .line 935
    .line 936
    move-result v7

    .line 937
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 938
    .line 939
    .line 940
    move-result-object v12

    .line 941
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    invoke-virtual {v1}, La/fet;->i0()V

    .line 946
    .line 947
    .line 948
    iget-boolean v13, v1, La/fet;->S:Z

    .line 949
    .line 950
    if-eqz v13, :cond_1d

    .line 951
    .line 952
    invoke-virtual {v1, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 953
    .line 954
    .line 955
    goto :goto_15

    .line 956
    :cond_1d
    invoke-virtual {v1}, La/fet;->r0()V

    .line 957
    .line 958
    .line 959
    :goto_15
    invoke-static {v1, v10, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 960
    .line 961
    .line 962
    invoke-static {v1, v12, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 963
    .line 964
    .line 965
    invoke-static {v7, v1, v4, v1}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 966
    .line 967
    .line 968
    invoke-static {v1, v0, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 969
    .line 970
    .line 971
    const/high16 v0, 0x42200000    # 40.0f

    .line 972
    .line 973
    invoke-static {v6, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 974
    .line 975
    .line 976
    move-result-object v2

    .line 977
    sget-object v3, La/zhg0;->a:La/zhg0;

    .line 978
    .line 979
    const/high16 v4, 0x3f800000    # 1.0f

    .line 980
    .line 981
    invoke-virtual {v3, v4, v2, v11}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 982
    .line 983
    .line 984
    move-result-object v2

    .line 985
    invoke-static {v5, v5, v5, v5, v2}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 986
    .line 987
    .line 988
    move-result-object v2

    .line 989
    const/4 v7, 0x0

    .line 990
    const/4 v8, 0x0

    .line 991
    invoke-static {v7, v1, v8, v11}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 992
    .line 993
    .line 994
    move-result-object v9

    .line 995
    invoke-static {v2, v9}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 996
    .line 997
    .line 998
    move-result-object v2

    .line 999
    invoke-static {v8, v1, v2}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 1000
    .line 1001
    .line 1002
    const/16 v21, 0x0

    .line 1003
    .line 1004
    const/16 v22, 0xe

    .line 1005
    .line 1006
    const/high16 v18, 0x40800000    # 4.0f

    .line 1007
    .line 1008
    const/16 v19, 0x0

    .line 1009
    .line 1010
    const/16 v20, 0x0

    .line 1011
    .line 1012
    move-object/from16 v17, v6

    .line 1013
    .line 1014
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v2

    .line 1018
    invoke-static {v2, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v2

    .line 1022
    invoke-virtual {v3, v4, v2, v11}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v2

    .line 1026
    invoke-static {v5, v5, v5, v5, v2}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v2

    .line 1030
    const/4 v6, 0x0

    .line 1031
    invoke-static {v6, v1, v8, v11}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v7

    .line 1035
    invoke-static {v2, v7}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v2

    .line 1039
    invoke-static {v8, v1, v2}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v2

    .line 1046
    invoke-static {v2, v0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    invoke-virtual {v3, v4, v0, v11}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    invoke-static {v5, v5, v5, v5, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    const/4 v6, 0x0

    .line 1059
    invoke-static {v6, v1, v8, v11}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    invoke-static {v0, v2, v1, v8, v11}, La/dw9;->x(La/mm40;La/fqj0;La/fet;IZ)V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v1, v11}, La/fet;->r(Z)V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 1070
    .line 1071
    .line 1072
    goto :goto_16

    .line 1073
    :cond_1e
    move-object v1, v2

    .line 1074
    invoke-virtual {v1}, La/fet;->X()V

    .line 1075
    .line 1076
    .line 1077
    :goto_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1078
    .line 1079
    return-object v0

    .line 1080
    nop

    .line 1081
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
