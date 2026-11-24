.class public final synthetic La/u6o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v6o;


# direct methods
.method public synthetic constructor <init>(La/v6o;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u6o;->a:B

    iput-object p1, p0, La/u6o;->b:La/v6o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 42

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/fee;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/jlr;

    .line 13
    .line 14
    instance-of v1, v0, La/xkr;

    .line 15
    .line 16
    if-eqz v1, :cond_b4

    .line 17
    .line 18
    check-cast v0, La/xkr;

    .line 19
    .line 20
    iget-object v2, v0, La/xkr;->d:La/m9s;

    .line 21
    .line 22
    move-object/from16 v0, p0

    .line 23
    .line 24
    iget-object v0, v0, La/u6o;->b:La/v6o;

    .line 25
    .line 26
    iget-object v1, v0, La/v6o;->r:La/n0o0;

    .line 27
    .line 28
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/fee;

    .line 33
    .line 34
    iget-object v3, v0, La/v6o;->D:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, La/l6o;

    .line 37
    .line 38
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, La/tdt0;

    .line 43
    .line 44
    iget-boolean v5, v3, La/l6o;->w:Z

    .line 45
    .line 46
    iget-object v4, v0, La/v6o;->b:La/ctf0;

    .line 47
    .line 48
    move v7, v5

    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 50
    .line 51
    .line 52
    move-result-wide v5

    .line 53
    iget-object v8, v0, La/v6o;->p:La/n0o0;

    .line 54
    .line 55
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    check-cast v8, La/fee;

    .line 60
    .line 61
    invoke-virtual {v8}, La/fee;->c()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    check-cast v8, La/yws;

    .line 66
    .line 67
    iget-object v0, v0, La/v6o;->u:La/n0o0;

    .line 68
    .line 69
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/fee;

    .line 74
    .line 75
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v9

    .line 85
    iget-boolean v0, v3, La/l6o;->z:Z

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object v3, v2, La/m9s;->h:La/qqs;

    .line 91
    .line 92
    iget-object v11, v2, La/m9s;->j:Ljava/lang/String;

    .line 93
    .line 94
    iget-wide v12, v2, La/m9s;->v:J

    .line 95
    .line 96
    iget-object v14, v2, La/m9s;->n:Ljava/util/List;

    .line 97
    .line 98
    iget-object v15, v2, La/m9s;->m:Ljava/util/List;

    .line 99
    .line 100
    move/from16 v23, v0

    .line 101
    .line 102
    iget-object v0, v2, La/m9s;->i:Ljava/lang/String;

    .line 103
    .line 104
    move-wide/from16 p0, v5

    .line 105
    .line 106
    iget-wide v5, v2, La/m9s;->o:J

    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {}, La/xkb;->P()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v16

    .line 115
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v16

    .line 119
    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v17

    .line 123
    move-wide/from16 v18, v5

    .line 124
    .line 125
    if-eqz v17, :cond_1

    .line 126
    .line 127
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    const/16 v17, 0x0

    .line 132
    .line 133
    move-object v5, v6

    .line 134
    check-cast v5, La/yxg;

    .line 135
    .line 136
    move-object/from16 v20, v6

    .line 137
    .line 138
    iget-wide v5, v5, La/yxg;->b:J

    .line 139
    .line 140
    cmp-long v5, v5, v18

    .line 141
    .line 142
    if-nez v5, :cond_0

    .line 143
    .line 144
    move-object/from16 v6, v20

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_0
    move-wide/from16 v5, v18

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_1
    const/16 v17, 0x0

    .line 151
    .line 152
    move-object/from16 v6, v17

    .line 153
    .line 154
    :goto_1
    check-cast v6, La/yxg;

    .line 155
    .line 156
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    if-eqz v8, :cond_2

    .line 161
    .line 162
    iget-boolean v8, v8, La/yws;->c:Z

    .line 163
    .line 164
    if-nez v8, :cond_2

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_2
    new-instance v8, La/kxs;

    .line 168
    .line 169
    invoke-direct {v8}, La/kxs;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v5, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    :goto_2
    if-eqz v6, :cond_b2

    .line 176
    .line 177
    if-eqz v1, :cond_b2

    .line 178
    .line 179
    iget-boolean v8, v1, La/tdt0;->b:Z

    .line 180
    .line 181
    move/from16 v16, v7

    .line 182
    .line 183
    const/4 v7, 0x1

    .line 184
    if-ne v8, v7, :cond_b2

    .line 185
    .line 186
    iget-object v8, v1, La/tdt0;->a:La/cqg;

    .line 187
    .line 188
    iget-object v7, v1, La/tdt0;->d:Ljava/lang/String;

    .line 189
    .line 190
    if-nez v8, :cond_3

    .line 191
    .line 192
    goto/16 :goto_57

    .line 193
    .line 194
    :cond_3
    move-object/from16 v28, v7

    .line 195
    .line 196
    instance-of v7, v8, La/xf5;

    .line 197
    .line 198
    move/from16 v21, v7

    .line 199
    .line 200
    const-wide/16 v25, 0x0

    .line 201
    .line 202
    const/4 v7, 0x0

    .line 203
    if-eqz v21, :cond_e

    .line 204
    .line 205
    check-cast v8, La/xf5;

    .line 206
    .line 207
    sget-object v0, La/y1g;->a:Ljava/util/List;

    .line 208
    .line 209
    new-instance v9, La/w1g;

    .line 210
    .line 211
    iget-object v0, v8, La/xf5;->a:La/wf5;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    packed-switch v1, :pswitch_data_0

    .line 218
    .line 219
    .line 220
    invoke-static {}, La/t9f;->b()V

    .line 221
    .line 222
    .line 223
    return-object v17

    .line 224
    :pswitch_0
    const v1, 0x7f130792

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :pswitch_1
    const v1, 0x7f13073d

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :pswitch_2
    const v1, 0x7f130215

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :pswitch_3
    const v1, 0x7f130fa5

    .line 237
    .line 238
    .line 239
    goto :goto_3

    .line 240
    :pswitch_4
    const v1, 0x7f13073e

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :pswitch_5
    const v1, 0x7f130213

    .line 245
    .line 246
    .line 247
    goto :goto_3

    .line 248
    :pswitch_6
    const v1, 0x7f130f9f

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :pswitch_7
    const v1, 0x7f130214

    .line 253
    .line 254
    .line 255
    goto :goto_3

    .line 256
    :pswitch_8
    const v1, 0x7f130fa2

    .line 257
    .line 258
    .line 259
    goto :goto_3

    .line 260
    :pswitch_9
    const v1, 0x7f130232

    .line 261
    .line 262
    .line 263
    :goto_3
    new-array v6, v7, [Ljava/lang/Object;

    .line 264
    .line 265
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 266
    .line 267
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    invoke-virtual {v4, v1, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    new-instance v11, La/wnq0;

    .line 276
    .line 277
    iget-wide v12, v3, La/qqs;->h:J

    .line 278
    .line 279
    iget-object v1, v3, La/qqs;->o:La/oqs;

    .line 280
    .line 281
    invoke-static {v12, v13}, La/znq0;->f(J)J

    .line 282
    .line 283
    .line 284
    move-result-wide v14

    .line 285
    cmp-long v4, v14, v25

    .line 286
    .line 287
    if-eqz v4, :cond_5

    .line 288
    .line 289
    sget-object v4, La/wf5;->a:La/wf5;

    .line 290
    .line 291
    if-eq v0, v4, :cond_4

    .line 292
    .line 293
    sget-object v4, La/wf5;->b:La/wf5;

    .line 294
    .line 295
    if-eq v0, v4, :cond_4

    .line 296
    .line 297
    sget-object v4, La/wf5;->c:La/wf5;

    .line 298
    .line 299
    if-ne v0, v4, :cond_5

    .line 300
    .line 301
    :cond_4
    const/16 v29, 0x1

    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_5
    move/from16 v29, v7

    .line 305
    .line 306
    :goto_4
    invoke-static {v12, v13}, La/znq0;->f(J)J

    .line 307
    .line 308
    .line 309
    move-result-wide v30

    .line 310
    iget-boolean v4, v3, La/qqs;->j:Z

    .line 311
    .line 312
    iget-object v3, v3, La/qqs;->k:La/znq0;

    .line 313
    .line 314
    if-eqz v3, :cond_6

    .line 315
    .line 316
    iget-wide v12, v3, La/znq0;->a:J

    .line 317
    .line 318
    invoke-static {v12, v13}, La/znq0;->f(J)J

    .line 319
    .line 320
    .line 321
    move-result-wide v12

    .line 322
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    move-object/from16 v34, v3

    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_6
    move-object/from16 v34, v17

    .line 330
    .line 331
    :goto_5
    const/16 v33, 0x1

    .line 332
    .line 333
    move/from16 v32, v4

    .line 334
    .line 335
    move-object/from16 v28, v11

    .line 336
    .line 337
    invoke-direct/range {v28 .. v34}, La/wnq0;-><init>(ZJZILjava/lang/Long;)V

    .line 338
    .line 339
    .line 340
    iget-object v13, v2, La/m9s;->i:Ljava/lang/String;

    .line 341
    .line 342
    iget-object v3, v8, La/xf5;->b:Ljava/util/List;

    .line 343
    .line 344
    const/4 v4, 0x3

    .line 345
    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    new-instance v4, Ljava/util/ArrayList;

    .line 350
    .line 351
    const/16 v6, 0xa

    .line 352
    .line 353
    invoke-static {v3, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 354
    .line 355
    .line 356
    move-result v12

    .line 357
    invoke-direct {v4, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 358
    .line 359
    .line 360
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    if-eqz v6, :cond_7

    .line 369
    .line 370
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    check-cast v6, La/tna0;

    .line 375
    .line 376
    invoke-static {v6}, La/z1x;->F(La/tna0;)I

    .line 377
    .line 378
    .line 379
    move-result v6

    .line 380
    new-instance v12, La/una0;

    .line 381
    .line 382
    invoke-direct {v12, v6}, La/una0;-><init>(I)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    goto :goto_6

    .line 389
    :cond_7
    invoke-static {v4}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 390
    .line 391
    .line 392
    move-result-object v14

    .line 393
    sget-object v3, La/x1g;->a:[I

    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 396
    .line 397
    .line 398
    move-result v4

    .line 399
    aget v3, v3, v4

    .line 400
    .line 401
    const/4 v4, 0x7

    .line 402
    if-ne v3, v4, :cond_8

    .line 403
    .line 404
    sget-wide v3, La/kkg;->H:J

    .line 405
    .line 406
    :goto_7
    move-wide v15, v3

    .line 407
    goto :goto_8

    .line 408
    :cond_8
    sget-object v3, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 409
    .line 410
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 411
    .line 412
    .line 413
    move-result-wide v3

    .line 414
    goto :goto_7

    .line 415
    :goto_8
    iget v3, v1, La/oqs;->a:I

    .line 416
    .line 417
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v17

    .line 421
    new-instance v12, La/v1g;

    .line 422
    .line 423
    invoke-direct/range {v12 .. v17}, La/v1g;-><init>(Ljava/lang/String;La/i4;JLjava/lang/String;)V

    .line 424
    .line 425
    .line 426
    iget-object v14, v2, La/m9s;->j:Ljava/lang/String;

    .line 427
    .line 428
    iget-object v2, v8, La/xf5;->c:Ljava/util/List;

    .line 429
    .line 430
    const/4 v4, 0x3

    .line 431
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    new-instance v3, Ljava/util/ArrayList;

    .line 436
    .line 437
    const/16 v6, 0xa

    .line 438
    .line 439
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 440
    .line 441
    .line 442
    move-result v4

    .line 443
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 444
    .line 445
    .line 446
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v4

    .line 454
    if-eqz v4, :cond_9

    .line 455
    .line 456
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    check-cast v4, La/tna0;

    .line 461
    .line 462
    invoke-static {v4}, La/z1x;->F(La/tna0;)I

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    new-instance v6, La/una0;

    .line 467
    .line 468
    invoke-direct {v6, v4}, La/una0;-><init>(I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    goto :goto_9

    .line 475
    :cond_9
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 476
    .line 477
    .line 478
    move-result-object v15

    .line 479
    sget-object v2, La/x1g;->a:[I

    .line 480
    .line 481
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    aget v0, v2, v0

    .line 486
    .line 487
    const/16 v2, 0x8

    .line 488
    .line 489
    if-ne v0, v2, :cond_a

    .line 490
    .line 491
    sget-wide v2, La/kkg;->H:J

    .line 492
    .line 493
    :goto_a
    move-wide/from16 v16, v2

    .line 494
    .line 495
    goto :goto_b

    .line 496
    :cond_a
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 497
    .line 498
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 499
    .line 500
    .line 501
    move-result-wide v2

    .line 502
    goto :goto_a

    .line 503
    :goto_b
    iget v0, v1, La/oqs;->b:I

    .line 504
    .line 505
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v18

    .line 509
    new-instance v13, La/v1g;

    .line 510
    .line 511
    invoke-direct/range {v13 .. v18}, La/v1g;-><init>(Ljava/lang/String;La/i4;JLjava/lang/String;)V

    .line 512
    .line 513
    .line 514
    new-instance v0, Ljava/lang/StringBuilder;

    .line 515
    .line 516
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 517
    .line 518
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 522
    .line 523
    const-string v2, "static/img/ImgDefault/Esports/Baccarat/Table.png"

    .line 524
    .line 525
    invoke-static {v2, v1, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    if-nez v1, :cond_d

    .line 530
    .line 531
    const-string v1, "https://"

    .line 532
    .line 533
    invoke-static {v2, v1, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 534
    .line 535
    .line 536
    move-result v1

    .line 537
    if-eqz v1, :cond_b

    .line 538
    .line 539
    goto :goto_c

    .line 540
    :cond_b
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 541
    .line 542
    .line 543
    move-result v1

    .line 544
    const/16 v3, 0x2f

    .line 545
    .line 546
    if-lez v1, :cond_c

    .line 547
    .line 548
    const-string v1, "/"

    .line 549
    .line 550
    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    if-nez v1, :cond_c

    .line 555
    .line 556
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    :cond_c
    const/4 v1, 0x1

    .line 560
    new-array v1, v1, [C

    .line 561
    .line 562
    aput-char v3, v1, v7

    .line 563
    .line 564
    invoke-static {v2, v1}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    goto :goto_d

    .line 572
    :cond_d
    :goto_c
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    :goto_d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v14

    .line 582
    invoke-direct/range {v9 .. v14}, La/w1g;-><init>(Ljava/lang/String;La/wnq0;La/v1g;La/v1g;Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v5, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    goto/16 :goto_57

    .line 589
    .line 590
    :cond_e
    instance-of v7, v8, La/ckk;

    .line 591
    .line 592
    move/from16 v29, v7

    .line 593
    .line 594
    const/4 v7, 0x2

    .line 595
    if-eqz v29, :cond_1a

    .line 596
    .line 597
    check-cast v8, La/ckk;

    .line 598
    .line 599
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    new-instance v11, La/amg;

    .line 606
    .line 607
    iget-object v0, v8, La/ckk;->a:La/bkk;

    .line 608
    .line 609
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 610
    .line 611
    .line 612
    move-result v1

    .line 613
    const v3, 0x7f13134f

    .line 614
    .line 615
    .line 616
    if-eqz v1, :cond_14

    .line 617
    .line 618
    const/4 v6, 0x1

    .line 619
    if-eq v1, v6, :cond_13

    .line 620
    .line 621
    if-eq v1, v7, :cond_12

    .line 622
    .line 623
    const/4 v3, 0x3

    .line 624
    if-eq v1, v3, :cond_11

    .line 625
    .line 626
    const/4 v3, 0x4

    .line 627
    if-eq v1, v3, :cond_10

    .line 628
    .line 629
    const/4 v3, 0x5

    .line 630
    if-ne v1, v3, :cond_f

    .line 631
    .line 632
    const/4 v1, 0x0

    .line 633
    new-array v3, v1, [Ljava/lang/Object;

    .line 634
    .line 635
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 636
    .line 637
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    const v3, 0x7f130792

    .line 642
    .line 643
    .line 644
    invoke-virtual {v4, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    :goto_e
    move-object v12, v1

    .line 649
    goto :goto_f

    .line 650
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 651
    .line 652
    .line 653
    goto/16 :goto_57

    .line 654
    .line 655
    :cond_10
    const/4 v1, 0x0

    .line 656
    new-array v3, v1, [Ljava/lang/Object;

    .line 657
    .line 658
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 659
    .line 660
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    const v3, 0x7f13073c

    .line 665
    .line 666
    .line 667
    invoke-virtual {v4, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    goto :goto_e

    .line 672
    :cond_11
    const/4 v1, 0x0

    .line 673
    new-array v3, v1, [Ljava/lang/Object;

    .line 674
    .line 675
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 676
    .line 677
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    const v3, 0x7f130fa4

    .line 682
    .line 683
    .line 684
    invoke-virtual {v4, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    goto :goto_e

    .line 689
    :cond_12
    const/4 v1, 0x0

    .line 690
    new-array v3, v1, [Ljava/lang/Object;

    .line 691
    .line 692
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 693
    .line 694
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    const v3, 0x7f130f9e

    .line 699
    .line 700
    .line 701
    invoke-virtual {v4, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    goto :goto_e

    .line 706
    :cond_13
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v1

    .line 714
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 715
    .line 716
    const/4 v6, 0x1

    .line 717
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    invoke-virtual {v4, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    goto :goto_e

    .line 726
    :cond_14
    const/4 v6, 0x1

    .line 727
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 736
    .line 737
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    invoke-virtual {v4, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    goto :goto_e

    .line 746
    :goto_f
    iget-object v13, v2, La/m9s;->i:Ljava/lang/String;

    .line 747
    .line 748
    iget-object v1, v2, La/m9s;->h:La/qqs;

    .line 749
    .line 750
    iget-object v14, v2, La/m9s;->j:Ljava/lang/String;

    .line 751
    .line 752
    iget-object v2, v8, La/ckk;->d:Ljava/util/List;

    .line 753
    .line 754
    invoke-static {v2}, La/jeb;->W(Ljava/util/List;)Ljava/util/ArrayList;

    .line 755
    .line 756
    .line 757
    move-result-object v15

    .line 758
    iget-object v2, v8, La/ckk;->e:Ljava/util/List;

    .line 759
    .line 760
    invoke-static {v2}, La/jeb;->W(Ljava/util/List;)Ljava/util/ArrayList;

    .line 761
    .line 762
    .line 763
    move-result-object v16

    .line 764
    iget v2, v1, La/qqs;->d:I

    .line 765
    .line 766
    const-string v3, "-"

    .line 767
    .line 768
    if-nez v2, :cond_15

    .line 769
    .line 770
    move-object/from16 v17, v3

    .line 771
    .line 772
    goto :goto_10

    .line 773
    :cond_15
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    move-object/from16 v17, v2

    .line 778
    .line 779
    :goto_10
    iget v1, v1, La/qqs;->e:I

    .line 780
    .line 781
    if-nez v1, :cond_16

    .line 782
    .line 783
    :goto_11
    move-object/from16 v18, v3

    .line 784
    .line 785
    goto :goto_12

    .line 786
    :cond_16
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    goto :goto_11

    .line 791
    :goto_12
    iget-object v1, v8, La/ckk;->b:La/zjk;

    .line 792
    .line 793
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 794
    .line 795
    .line 796
    move-result v1

    .line 797
    const v2, 0x7f080761

    .line 798
    .line 799
    .line 800
    const v3, 0x7f080764

    .line 801
    .line 802
    .line 803
    const v4, 0x7f080763

    .line 804
    .line 805
    .line 806
    const v6, 0x7f080760

    .line 807
    .line 808
    .line 809
    const v9, 0x7f08075f

    .line 810
    .line 811
    .line 812
    const v10, 0x7f080762

    .line 813
    .line 814
    .line 815
    const v19, 0x7f0606d8

    .line 816
    .line 817
    .line 818
    packed-switch v1, :pswitch_data_1

    .line 819
    .line 820
    .line 821
    invoke-static {}, La/t9f;->b()V

    .line 822
    .line 823
    .line 824
    goto/16 :goto_57

    .line 825
    .line 826
    :pswitch_a
    move/from16 v1, v19

    .line 827
    .line 828
    goto :goto_13

    .line 829
    :pswitch_b
    move/from16 v1, v19

    .line 830
    .line 831
    move/from16 v19, v10

    .line 832
    .line 833
    goto :goto_13

    .line 834
    :pswitch_c
    move/from16 v1, v19

    .line 835
    .line 836
    move/from16 v19, v9

    .line 837
    .line 838
    goto :goto_13

    .line 839
    :pswitch_d
    move/from16 v1, v19

    .line 840
    .line 841
    move/from16 v19, v6

    .line 842
    .line 843
    goto :goto_13

    .line 844
    :pswitch_e
    move/from16 v1, v19

    .line 845
    .line 846
    move/from16 v19, v4

    .line 847
    .line 848
    goto :goto_13

    .line 849
    :pswitch_f
    move/from16 v1, v19

    .line 850
    .line 851
    move/from16 v19, v3

    .line 852
    .line 853
    goto :goto_13

    .line 854
    :pswitch_10
    move/from16 v1, v19

    .line 855
    .line 856
    move/from16 v19, v2

    .line 857
    .line 858
    :goto_13
    iget-object v8, v8, La/ckk;->c:La/zjk;

    .line 859
    .line 860
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 861
    .line 862
    .line 863
    move-result v8

    .line 864
    packed-switch v8, :pswitch_data_2

    .line 865
    .line 866
    .line 867
    invoke-static {}, La/t9f;->b()V

    .line 868
    .line 869
    .line 870
    goto/16 :goto_57

    .line 871
    .line 872
    :pswitch_11
    move v2, v1

    .line 873
    goto :goto_14

    .line 874
    :pswitch_12
    move v2, v10

    .line 875
    goto :goto_14

    .line 876
    :pswitch_13
    move v2, v9

    .line 877
    goto :goto_14

    .line 878
    :pswitch_14
    move v2, v6

    .line 879
    goto :goto_14

    .line 880
    :pswitch_15
    move v2, v4

    .line 881
    goto :goto_14

    .line 882
    :pswitch_16
    move v2, v3

    .line 883
    :goto_14
    :pswitch_17
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 884
    .line 885
    .line 886
    move-result v1

    .line 887
    const/high16 v3, 0x3f800000    # 1.0f

    .line 888
    .line 889
    const/high16 v4, 0x3f000000    # 0.5f

    .line 890
    .line 891
    if-eqz v1, :cond_17

    .line 892
    .line 893
    if-eq v1, v7, :cond_17

    .line 894
    .line 895
    const/4 v6, 0x4

    .line 896
    if-eq v1, v6, :cond_18

    .line 897
    .line 898
    move/from16 v21, v4

    .line 899
    .line 900
    goto :goto_15

    .line 901
    :cond_17
    const/4 v6, 0x4

    .line 902
    :cond_18
    move/from16 v21, v3

    .line 903
    .line 904
    :goto_15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 905
    .line 906
    .line 907
    move-result v0

    .line 908
    const/4 v1, 0x1

    .line 909
    if-eq v0, v1, :cond_19

    .line 910
    .line 911
    const/4 v1, 0x3

    .line 912
    if-eq v0, v1, :cond_19

    .line 913
    .line 914
    if-eq v0, v6, :cond_19

    .line 915
    .line 916
    move/from16 v22, v4

    .line 917
    .line 918
    :goto_16
    move/from16 v20, v2

    .line 919
    .line 920
    goto :goto_17

    .line 921
    :cond_19
    move/from16 v22, v3

    .line 922
    .line 923
    goto :goto_16

    .line 924
    :goto_17
    invoke-direct/range {v11 .. v23}, La/amg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;IIFFZ)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v5, v11}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 928
    .line 929
    .line 930
    goto/16 :goto_57

    .line 931
    .line 932
    :cond_1a
    instance-of v7, v8, La/qxv;

    .line 933
    .line 934
    if-eqz v7, :cond_1b

    .line 935
    .line 936
    move-object v3, v8

    .line 937
    check-cast v3, La/qxv;

    .line 938
    .line 939
    move-object v1, v5

    .line 940
    move/from16 v7, v23

    .line 941
    .line 942
    move-wide/from16 v5, p0

    .line 943
    .line 944
    invoke-static/range {v1 .. v7}, La/dub;->a0(La/lc00;La/m9s;La/qxv;La/ctf0;JZ)V

    .line 945
    .line 946
    .line 947
    goto/16 :goto_58

    .line 948
    .line 949
    :cond_1b
    move-object/from16 p0, v5

    .line 950
    .line 951
    move/from16 v7, v23

    .line 952
    .line 953
    move-object v5, v2

    .line 954
    instance-of v2, v8, La/rq20;

    .line 955
    .line 956
    move/from16 v23, v2

    .line 957
    .line 958
    if-eqz v23, :cond_2a

    .line 959
    .line 960
    const-wide/16 v0, 0xe8

    .line 961
    .line 962
    cmp-long v3, v18, v0

    .line 963
    .line 964
    const/4 v5, -0x1

    .line 965
    const-wide/16 v6, 0xf4

    .line 966
    .line 967
    const-wide/16 v9, 0xf8

    .line 968
    .line 969
    const-wide/16 v11, 0xf6

    .line 970
    .line 971
    const-wide/16 v13, 0xf5

    .line 972
    .line 973
    if-eqz v3, :cond_1e

    .line 974
    .line 975
    cmp-long v15, v18, v13

    .line 976
    .line 977
    if-eqz v15, :cond_1e

    .line 978
    .line 979
    cmp-long v15, v18, v11

    .line 980
    .line 981
    if-eqz v15, :cond_1e

    .line 982
    .line 983
    cmp-long v15, v18, v9

    .line 984
    .line 985
    if-nez v15, :cond_1c

    .line 986
    .line 987
    goto :goto_18

    .line 988
    :cond_1c
    cmp-long v15, v18, v6

    .line 989
    .line 990
    if-nez v15, :cond_1d

    .line 991
    .line 992
    const v15, 0x7f131393

    .line 993
    .line 994
    .line 995
    goto :goto_19

    .line 996
    :cond_1d
    move v15, v5

    .line 997
    goto :goto_19

    .line 998
    :cond_1e
    :goto_18
    const v15, 0x7f13119f

    .line 999
    .line 1000
    .line 1001
    :goto_19
    if-eqz v3, :cond_21

    .line 1002
    .line 1003
    cmp-long v3, v18, v13

    .line 1004
    .line 1005
    if-eqz v3, :cond_21

    .line 1006
    .line 1007
    cmp-long v3, v18, v11

    .line 1008
    .line 1009
    if-eqz v3, :cond_21

    .line 1010
    .line 1011
    cmp-long v3, v18, v9

    .line 1012
    .line 1013
    if-nez v3, :cond_1f

    .line 1014
    .line 1015
    goto :goto_1a

    .line 1016
    :cond_1f
    cmp-long v2, v18, v6

    .line 1017
    .line 1018
    if-nez v2, :cond_20

    .line 1019
    .line 1020
    const v2, 0x7f131469

    .line 1021
    .line 1022
    .line 1023
    goto :goto_1b

    .line 1024
    :cond_20
    move v2, v5

    .line 1025
    goto :goto_1b

    .line 1026
    :cond_21
    :goto_1a
    const v2, 0x7f13146b

    .line 1027
    .line 1028
    .line 1029
    :goto_1b
    cmp-long v0, v18, v0

    .line 1030
    .line 1031
    if-nez v0, :cond_22

    .line 1032
    .line 1033
    const v0, 0x7f08042a

    .line 1034
    .line 1035
    .line 1036
    :goto_1c
    move v11, v0

    .line 1037
    goto :goto_1d

    .line 1038
    :cond_22
    cmp-long v0, v18, v13

    .line 1039
    .line 1040
    if-nez v0, :cond_23

    .line 1041
    .line 1042
    const v0, 0x7f080421

    .line 1043
    .line 1044
    .line 1045
    goto :goto_1c

    .line 1046
    :cond_23
    cmp-long v0, v18, v11

    .line 1047
    .line 1048
    if-nez v0, :cond_24

    .line 1049
    .line 1050
    const v0, 0x7f080440

    .line 1051
    .line 1052
    .line 1053
    goto :goto_1c

    .line 1054
    :cond_24
    cmp-long v0, v18, v9

    .line 1055
    .line 1056
    if-nez v0, :cond_25

    .line 1057
    .line 1058
    const v0, 0x7f080451

    .line 1059
    .line 1060
    .line 1061
    goto :goto_1c

    .line 1062
    :cond_25
    cmp-long v0, v18, v6

    .line 1063
    .line 1064
    if-nez v0, :cond_26

    .line 1065
    .line 1066
    const v0, 0x7f08041c

    .line 1067
    .line 1068
    .line 1069
    goto :goto_1c

    .line 1070
    :cond_26
    move v11, v5

    .line 1071
    :goto_1d
    invoke-static/range {v18 .. v19}, La/bfb;->T(J)I

    .line 1072
    .line 1073
    .line 1074
    move-result v12

    .line 1075
    invoke-static/range {v18 .. v19}, La/bfb;->U(J)I

    .line 1076
    .line 1077
    .line 1078
    move-result v13

    .line 1079
    if-eq v15, v5, :cond_27

    .line 1080
    .line 1081
    if-eq v2, v5, :cond_27

    .line 1082
    .line 1083
    if-eq v11, v5, :cond_27

    .line 1084
    .line 1085
    if-eq v12, v5, :cond_27

    .line 1086
    .line 1087
    if-ne v13, v5, :cond_28

    .line 1088
    .line 1089
    :cond_27
    move-object/from16 v4, p0

    .line 1090
    .line 1091
    goto :goto_1e

    .line 1092
    :cond_28
    move-object v7, v8

    .line 1093
    check-cast v7, La/rq20;

    .line 1094
    .line 1095
    move-object/from16 v6, p0

    .line 1096
    .line 1097
    move v10, v2

    .line 1098
    move-object v8, v4

    .line 1099
    move v9, v15

    .line 1100
    invoke-static/range {v6 .. v13}, La/bdx;->P(La/lc00;La/rq20;La/ctf0;IIIII)V

    .line 1101
    .line 1102
    .line 1103
    move-object v1, v6

    .line 1104
    goto/16 :goto_58

    .line 1105
    .line 1106
    :cond_29
    :goto_1e
    move-object v1, v4

    .line 1107
    goto/16 :goto_58

    .line 1108
    .line 1109
    :cond_2a
    move-object v2, v6

    .line 1110
    move-wide/from16 v18, v9

    .line 1111
    .line 1112
    move-object v6, v4

    .line 1113
    move-object/from16 v4, p0

    .line 1114
    .line 1115
    instance-of v9, v8, La/ir40;

    .line 1116
    .line 1117
    if-eqz v9, :cond_2b

    .line 1118
    .line 1119
    check-cast v8, La/ir40;

    .line 1120
    .line 1121
    iget-object v0, v8, La/ir40;->a:Ljava/util/List;

    .line 1122
    .line 1123
    invoke-static {v4, v0, v5, v6}, La/b5x;->t(La/lc00;Ljava/util/List;La/m9s;La/ctf0;)V

    .line 1124
    .line 1125
    .line 1126
    goto :goto_1e

    .line 1127
    :cond_2b
    instance-of v9, v8, La/mpa0;

    .line 1128
    .line 1129
    if-eqz v9, :cond_2c

    .line 1130
    .line 1131
    check-cast v8, La/mpa0;

    .line 1132
    .line 1133
    invoke-static {v4, v5, v8, v7}, La/ibc;->R(La/lc00;La/m9s;La/mpa0;Z)V

    .line 1134
    .line 1135
    .line 1136
    goto :goto_1e

    .line 1137
    :cond_2c
    instance-of v9, v8, La/jyh0;

    .line 1138
    .line 1139
    if-eqz v9, :cond_2d

    .line 1140
    .line 1141
    check-cast v8, La/jyh0;

    .line 1142
    .line 1143
    iget-object v0, v8, La/jyh0;->a:Ljava/util/List;

    .line 1144
    .line 1145
    invoke-static {v4, v0, v6}, La/tnq0;->g(La/lc00;Ljava/util/List;La/ctf0;)V

    .line 1146
    .line 1147
    .line 1148
    goto :goto_1e

    .line 1149
    :cond_2d
    instance-of v9, v8, La/oij0;

    .line 1150
    .line 1151
    if-eqz v9, :cond_2e

    .line 1152
    .line 1153
    move-object v3, v8

    .line 1154
    check-cast v3, La/oij0;

    .line 1155
    .line 1156
    move-object v1, v4

    .line 1157
    move-object v2, v5

    .line 1158
    move-wide/from16 v4, v18

    .line 1159
    .line 1160
    invoke-static/range {v1 .. v6}, La/zvw;->y(La/lc00;La/m9s;La/oij0;JLa/ctf0;)V

    .line 1161
    .line 1162
    .line 1163
    goto/16 :goto_58

    .line 1164
    .line 1165
    :cond_2e
    instance-of v9, v8, La/jus0;

    .line 1166
    .line 1167
    if-eqz v9, :cond_2f

    .line 1168
    .line 1169
    move-object v3, v8

    .line 1170
    check-cast v3, La/jus0;

    .line 1171
    .line 1172
    move-object v1, v4

    .line 1173
    move-object v2, v5

    .line 1174
    move-object v4, v6

    .line 1175
    move/from16 v6, v16

    .line 1176
    .line 1177
    move-object/from16 v5, v28

    .line 1178
    .line 1179
    invoke-static/range {v1 .. v6}, La/pym0;->g(La/lc00;La/m9s;La/jus0;La/ctf0;Ljava/lang/String;Z)V

    .line 1180
    .line 1181
    .line 1182
    goto/16 :goto_58

    .line 1183
    .line 1184
    :cond_2f
    move-object v9, v6

    .line 1185
    move/from16 v6, v16

    .line 1186
    .line 1187
    instance-of v10, v8, La/o4t0;

    .line 1188
    .line 1189
    if-eqz v10, :cond_30

    .line 1190
    .line 1191
    check-cast v8, La/o4t0;

    .line 1192
    .line 1193
    iget-object v0, v8, La/o4t0;->a:Ljava/util/List;

    .line 1194
    .line 1195
    invoke-static {v4, v0, v9}, La/btm0;->m(La/lc00;Ljava/util/List;La/ctf0;)V

    .line 1196
    .line 1197
    .line 1198
    goto :goto_1e

    .line 1199
    :cond_30
    instance-of v10, v8, La/wog0;

    .line 1200
    .line 1201
    if-eqz v10, :cond_31

    .line 1202
    .line 1203
    check-cast v8, La/wog0;

    .line 1204
    .line 1205
    invoke-static {v4, v5, v8, v9}, La/s7o0;->a(La/lc00;La/m9s;La/wog0;La/ctf0;)V

    .line 1206
    .line 1207
    .line 1208
    goto :goto_1e

    .line 1209
    :cond_31
    instance-of v10, v8, La/gdh0;

    .line 1210
    .line 1211
    if-eqz v10, :cond_32

    .line 1212
    .line 1213
    check-cast v8, La/gdh0;

    .line 1214
    .line 1215
    invoke-static {v4, v5, v8, v9}, La/x0x;->q(La/lc00;La/m9s;La/gdh0;La/ctf0;)V

    .line 1216
    .line 1217
    .line 1218
    goto :goto_1e

    .line 1219
    :cond_32
    instance-of v10, v8, La/gdu0;

    .line 1220
    .line 1221
    if-eqz v10, :cond_33

    .line 1222
    .line 1223
    check-cast v8, La/gdu0;

    .line 1224
    .line 1225
    invoke-static {v12, v13}, La/bfb;->l0(J)Z

    .line 1226
    .line 1227
    .line 1228
    move-result v0

    .line 1229
    invoke-static {v4, v8, v5, v9, v0}, La/jtt0;->e(La/lc00;La/gdu0;La/m9s;La/ctf0;Z)V

    .line 1230
    .line 1231
    .line 1232
    goto :goto_1e

    .line 1233
    :cond_33
    instance-of v10, v8, La/o8j;

    .line 1234
    .line 1235
    if-eqz v10, :cond_34

    .line 1236
    .line 1237
    check-cast v8, La/o8j;

    .line 1238
    .line 1239
    invoke-static {v4, v8, v9, v5}, La/ckb;->J(La/lc00;La/o8j;La/ctf0;La/m9s;)V

    .line 1240
    .line 1241
    .line 1242
    goto/16 :goto_1e

    .line 1243
    .line 1244
    :cond_34
    instance-of v10, v8, La/men;

    .line 1245
    .line 1246
    if-eqz v10, :cond_35

    .line 1247
    .line 1248
    check-cast v8, La/men;

    .line 1249
    .line 1250
    invoke-static {v4, v8, v5, v6, v9}, La/yng;->a(La/lc00;La/men;La/m9s;ZLa/ctf0;)V

    .line 1251
    .line 1252
    .line 1253
    goto/16 :goto_1e

    .line 1254
    .line 1255
    :cond_35
    instance-of v10, v8, La/kha;

    .line 1256
    .line 1257
    if-eqz v10, :cond_36

    .line 1258
    .line 1259
    check-cast v8, La/kha;

    .line 1260
    .line 1261
    invoke-static {v4, v8, v9, v5}, La/fia;->a(La/lc00;La/kha;La/ctf0;La/m9s;)V

    .line 1262
    .line 1263
    .line 1264
    goto/16 :goto_1e

    .line 1265
    .line 1266
    :cond_36
    instance-of v10, v8, La/kgf;

    .line 1267
    .line 1268
    if-eqz v10, :cond_37

    .line 1269
    .line 1270
    check-cast v8, La/kgf;

    .line 1271
    .line 1272
    invoke-static {v4, v5, v8, v9, v7}, La/ozb;->H(La/lc00;La/m9s;La/kgf;La/ctf0;Z)V

    .line 1273
    .line 1274
    .line 1275
    goto/16 :goto_1e

    .line 1276
    .line 1277
    :cond_37
    instance-of v10, v8, La/ikk;

    .line 1278
    .line 1279
    if-eqz v10, :cond_38

    .line 1280
    .line 1281
    check-cast v8, La/ikk;

    .line 1282
    .line 1283
    invoke-static {v4, v8, v9, v5, v7}, La/xkb;->I(La/lc00;La/ikk;La/ctf0;La/m9s;Z)V

    .line 1284
    .line 1285
    .line 1286
    goto/16 :goto_1e

    .line 1287
    .line 1288
    :cond_38
    instance-of v10, v8, La/xxh0;

    .line 1289
    .line 1290
    if-eqz v10, :cond_39

    .line 1291
    .line 1292
    check-cast v8, La/xxh0;

    .line 1293
    .line 1294
    invoke-static {v4, v8, v9, v5, v7}, La/vvw;->p(La/lc00;La/xxh0;La/ctf0;La/m9s;Z)V

    .line 1295
    .line 1296
    .line 1297
    goto/16 :goto_1e

    .line 1298
    .line 1299
    :cond_39
    instance-of v10, v8, La/xeg0;

    .line 1300
    .line 1301
    if-eqz v10, :cond_3a

    .line 1302
    .line 1303
    check-cast v8, La/xeg0;

    .line 1304
    .line 1305
    invoke-static {v4, v8, v9}, La/g8x;->u(La/lc00;La/xeg0;La/ctf0;)V

    .line 1306
    .line 1307
    .line 1308
    goto/16 :goto_1e

    .line 1309
    .line 1310
    :cond_3a
    instance-of v10, v8, La/l5x;

    .line 1311
    .line 1312
    if-eqz v10, :cond_3b

    .line 1313
    .line 1314
    check-cast v8, La/l5x;

    .line 1315
    .line 1316
    invoke-static {v4, v8, v9, v7, v5}, La/z5x;->a(La/lc00;La/l5x;La/ctf0;ZLa/m9s;)V

    .line 1317
    .line 1318
    .line 1319
    goto/16 :goto_1e

    .line 1320
    .line 1321
    :cond_3b
    instance-of v10, v8, La/utp0;

    .line 1322
    .line 1323
    if-eqz v10, :cond_3c

    .line 1324
    .line 1325
    check-cast v8, La/utp0;

    .line 1326
    .line 1327
    invoke-static {v4, v8, v5}, La/zsm0;->g(La/lc00;La/utp0;La/m9s;)V

    .line 1328
    .line 1329
    .line 1330
    goto/16 :goto_1e

    .line 1331
    .line 1332
    :cond_3c
    instance-of v10, v8, La/eoy;

    .line 1333
    .line 1334
    if-eqz v10, :cond_3d

    .line 1335
    .line 1336
    check-cast v8, La/eoy;

    .line 1337
    .line 1338
    invoke-static {v12, v13}, La/bfb;->l0(J)Z

    .line 1339
    .line 1340
    .line 1341
    move-result v0

    .line 1342
    invoke-static {v4, v8, v9, v5, v0}, La/r8x;->B(La/lc00;La/eoy;La/ctf0;La/m9s;Z)V

    .line 1343
    .line 1344
    .line 1345
    goto/16 :goto_1e

    .line 1346
    .line 1347
    :cond_3d
    instance-of v10, v8, La/dav;

    .line 1348
    .line 1349
    if-eqz v10, :cond_3e

    .line 1350
    .line 1351
    move-object v2, v8

    .line 1352
    check-cast v2, La/dav;

    .line 1353
    .line 1354
    move-object v1, v4

    .line 1355
    move-object v3, v5

    .line 1356
    move v5, v6

    .line 1357
    move v6, v7

    .line 1358
    move-object v4, v9

    .line 1359
    invoke-static/range {v1 .. v6}, La/qbc;->F(La/lc00;La/dav;La/m9s;La/ctf0;ZZ)V

    .line 1360
    .line 1361
    .line 1362
    goto/16 :goto_58

    .line 1363
    .line 1364
    :cond_3e
    instance-of v7, v8, La/wea;

    .line 1365
    .line 1366
    if-eqz v7, :cond_3f

    .line 1367
    .line 1368
    move-object v2, v8

    .line 1369
    check-cast v2, La/wea;

    .line 1370
    .line 1371
    move-object v1, v4

    .line 1372
    move-object v3, v5

    .line 1373
    move-object v4, v9

    .line 1374
    move-wide/from16 v5, v18

    .line 1375
    .line 1376
    move-object/from16 v7, v28

    .line 1377
    .line 1378
    invoke-static/range {v1 .. v7}, La/efa;->a(La/lc00;La/wea;La/m9s;La/ctf0;JLjava/lang/String;)V

    .line 1379
    .line 1380
    .line 1381
    goto/16 :goto_58

    .line 1382
    .line 1383
    :cond_3f
    move-object/from16 v7, v28

    .line 1384
    .line 1385
    instance-of v10, v8, La/bba;

    .line 1386
    .line 1387
    if-eqz v10, :cond_40

    .line 1388
    .line 1389
    check-cast v8, La/bba;

    .line 1390
    .line 1391
    invoke-static {v4, v8, v5, v9, v7}, La/cjx;->M(La/lc00;La/bba;La/m9s;La/ctf0;Ljava/lang/String;)V

    .line 1392
    .line 1393
    .line 1394
    goto/16 :goto_1e

    .line 1395
    .line 1396
    :cond_40
    instance-of v10, v8, La/eqb0;

    .line 1397
    .line 1398
    if-eqz v10, :cond_41

    .line 1399
    .line 1400
    check-cast v8, La/eqb0;

    .line 1401
    .line 1402
    invoke-static {v4, v8, v5, v9}, La/pzw;->y(La/lc00;La/eqb0;La/m9s;La/ctf0;)V

    .line 1403
    .line 1404
    .line 1405
    goto/16 :goto_1e

    .line 1406
    .line 1407
    :cond_41
    instance-of v10, v8, La/qz7;

    .line 1408
    .line 1409
    if-eqz v10, :cond_42

    .line 1410
    .line 1411
    check-cast v8, La/qz7;

    .line 1412
    .line 1413
    move-object v1, v4

    .line 1414
    move-object v2, v5

    .line 1415
    move-object v4, v8

    .line 1416
    move-object v3, v9

    .line 1417
    move-wide/from16 v5, v18

    .line 1418
    .line 1419
    invoke-static/range {v1 .. v6}, La/hmw0;->X(La/lc00;La/m9s;La/ctf0;La/qz7;J)V

    .line 1420
    .line 1421
    .line 1422
    goto/16 :goto_58

    .line 1423
    .line 1424
    :cond_42
    instance-of v10, v8, La/yrp;

    .line 1425
    .line 1426
    if-eqz v10, :cond_43

    .line 1427
    .line 1428
    invoke-static {v4, v5, v9}, La/vtb;->L(La/lc00;La/m9s;La/ctf0;)V

    .line 1429
    .line 1430
    .line 1431
    iget-object v2, v1, La/tdt0;->c:La/r2s0;

    .line 1432
    .line 1433
    if-eqz v2, :cond_29

    .line 1434
    .line 1435
    move-object v1, v4

    .line 1436
    move v7, v6

    .line 1437
    move-object v6, v9

    .line 1438
    move-wide/from16 v3, v18

    .line 1439
    .line 1440
    invoke-static/range {v1 .. v7}, La/stp0;->a(La/lc00;La/r2s0;JLa/m9s;La/ctf0;Z)V

    .line 1441
    .line 1442
    .line 1443
    goto/16 :goto_58

    .line 1444
    .line 1445
    :cond_43
    move-object v1, v4

    .line 1446
    move-object v4, v9

    .line 1447
    instance-of v6, v8, La/ly3;

    .line 1448
    .line 1449
    if-eqz v6, :cond_44

    .line 1450
    .line 1451
    invoke-static {v1, v5, v4}, La/osm0;->f(La/lc00;La/m9s;La/ctf0;)V

    .line 1452
    .line 1453
    .line 1454
    goto/16 :goto_58

    .line 1455
    .line 1456
    :cond_44
    instance-of v6, v8, La/btq;

    .line 1457
    .line 1458
    if-eqz v6, :cond_45

    .line 1459
    .line 1460
    invoke-static {v1, v5, v2, v4}, La/vsm0;->j(La/lc00;La/m9s;La/yxg;La/ctf0;)V

    .line 1461
    .line 1462
    .line 1463
    goto/16 :goto_58

    .line 1464
    .line 1465
    :cond_45
    instance-of v6, v8, La/gq20;

    .line 1466
    .line 1467
    if-eqz v6, :cond_46

    .line 1468
    .line 1469
    invoke-static {v1, v5}, La/qsm0;->r(La/lc00;La/m9s;)V

    .line 1470
    .line 1471
    .line 1472
    goto/16 :goto_58

    .line 1473
    .line 1474
    :cond_46
    instance-of v6, v8, La/yq20;

    .line 1475
    .line 1476
    if-eqz v6, :cond_47

    .line 1477
    .line 1478
    invoke-static {v1, v5, v4}, La/xsm0;->i(La/lc00;La/m9s;La/ctf0;)V

    .line 1479
    .line 1480
    .line 1481
    goto/16 :goto_58

    .line 1482
    .line 1483
    :cond_47
    instance-of v6, v8, La/k8o0;

    .line 1484
    .line 1485
    if-eqz v6, :cond_48

    .line 1486
    .line 1487
    invoke-static {v1, v5, v4}, La/atm0;->f(La/lc00;La/m9s;La/ctf0;)V

    .line 1488
    .line 1489
    .line 1490
    goto/16 :goto_58

    .line 1491
    .line 1492
    :cond_48
    instance-of v6, v8, La/evu0;

    .line 1493
    .line 1494
    if-eqz v6, :cond_49

    .line 1495
    .line 1496
    invoke-static {v1, v5, v2, v4}, La/qim0;->i(La/lc00;La/m9s;La/yxg;La/ctf0;)V

    .line 1497
    .line 1498
    .line 1499
    goto/16 :goto_58

    .line 1500
    .line 1501
    :cond_49
    instance-of v2, v8, La/pdq0;

    .line 1502
    .line 1503
    if-eqz v2, :cond_4a

    .line 1504
    .line 1505
    check-cast v8, La/pdq0;

    .line 1506
    .line 1507
    invoke-static {v1, v5, v8, v4, v7}, La/sac;->I(La/lc00;La/m9s;La/pdq0;La/ctf0;Ljava/lang/String;)V

    .line 1508
    .line 1509
    .line 1510
    goto/16 :goto_58

    .line 1511
    .line 1512
    :cond_4a
    instance-of v2, v8, La/uiv;

    .line 1513
    .line 1514
    if-eqz v2, :cond_4b

    .line 1515
    .line 1516
    check-cast v8, La/uiv;

    .line 1517
    .line 1518
    invoke-static {v1, v5, v4, v8}, La/vdb;->T(La/lc00;La/m9s;La/ctf0;La/uiv;)V

    .line 1519
    .line 1520
    .line 1521
    goto/16 :goto_58

    .line 1522
    .line 1523
    :cond_4b
    instance-of v2, v8, La/v0p;

    .line 1524
    .line 1525
    const-string v12, ""

    .line 1526
    .line 1527
    if-eqz v2, :cond_64

    .line 1528
    .line 1529
    check-cast v8, La/v0p;

    .line 1530
    .line 1531
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1532
    .line 1533
    .line 1534
    iget-object v2, v8, La/v0p;->a:Ljava/util/List;

    .line 1535
    .line 1536
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 1537
    .line 1538
    .line 1539
    move-result v3

    .line 1540
    if-eqz v3, :cond_4c

    .line 1541
    .line 1542
    goto/16 :goto_58

    .line 1543
    .line 1544
    :cond_4c
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 1545
    .line 1546
    .line 1547
    move-result v3

    .line 1548
    if-eqz v3, :cond_4d

    .line 1549
    .line 1550
    goto :goto_1f

    .line 1551
    :cond_4d
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v3

    .line 1555
    :cond_4e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1556
    .line 1557
    .line 1558
    move-result v5

    .line 1559
    if-eqz v5, :cond_4f

    .line 1560
    .line 1561
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v5

    .line 1565
    check-cast v5, La/q0p;

    .line 1566
    .line 1567
    iget v8, v5, La/q0p;->a:I

    .line 1568
    .line 1569
    if-eqz v8, :cond_b3

    .line 1570
    .line 1571
    iget v8, v5, La/q0p;->b:I

    .line 1572
    .line 1573
    if-eqz v8, :cond_b3

    .line 1574
    .line 1575
    iget-object v5, v5, La/q0p;->c:Ljava/lang/String;

    .line 1576
    .line 1577
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1578
    .line 1579
    .line 1580
    move-result v5

    .line 1581
    if-nez v5, :cond_4e

    .line 1582
    .line 1583
    goto/16 :goto_58

    .line 1584
    .line 1585
    :cond_4f
    :goto_1f
    new-instance v3, Ljava/util/ArrayList;

    .line 1586
    .line 1587
    const/16 v5, 0xa

    .line 1588
    .line 1589
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1590
    .line 1591
    .line 1592
    move-result v5

    .line 1593
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1594
    .line 1595
    .line 1596
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v2

    .line 1600
    :goto_20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1601
    .line 1602
    .line 1603
    move-result v5

    .line 1604
    if-eqz v5, :cond_63

    .line 1605
    .line 1606
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v5

    .line 1610
    check-cast v5, La/q0p;

    .line 1611
    .line 1612
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1613
    .line 1614
    .line 1615
    iget-object v8, v5, La/q0p;->c:Ljava/lang/String;

    .line 1616
    .line 1617
    iget-object v11, v5, La/q0p;->d:La/a1p;

    .line 1618
    .line 1619
    invoke-virtual {v8, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1620
    .line 1621
    .line 1622
    move-result v13

    .line 1623
    const-string v16, "%s/playerlogo/%s"

    .line 1624
    .line 1625
    const-string v18, "%s/%s"

    .line 1626
    .line 1627
    const-string v6, "playerlogo/"

    .line 1628
    .line 1629
    if-eqz v13, :cond_55

    .line 1630
    .line 1631
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v13

    .line 1635
    check-cast v13, Ljava/lang/String;

    .line 1636
    .line 1637
    if-nez v13, :cond_50

    .line 1638
    .line 1639
    move-object v13, v12

    .line 1640
    :cond_50
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 1641
    .line 1642
    const/4 v10, 0x0

    .line 1643
    invoke-static {v13, v9, v10}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1644
    .line 1645
    .line 1646
    move-result v9

    .line 1647
    if-eqz v9, :cond_51

    .line 1648
    .line 1649
    goto/16 :goto_25

    .line 1650
    .line 1651
    :cond_51
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 1652
    .line 1653
    .line 1654
    move-result v9

    .line 1655
    if-nez v9, :cond_52

    .line 1656
    .line 1657
    goto :goto_21

    .line 1658
    :cond_52
    sget-object v9, La/u0d;->a:Ljava/util/List;

    .line 1659
    .line 1660
    invoke-static {v13}, La/u0d;->c(Ljava/lang/String;)Z

    .line 1661
    .line 1662
    .line 1663
    move-result v9

    .line 1664
    if-eqz v9, :cond_53

    .line 1665
    .line 1666
    :goto_21
    move-object v13, v12

    .line 1667
    goto :goto_25

    .line 1668
    :cond_53
    const/4 v9, 0x1

    .line 1669
    invoke-static {v13, v6, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1670
    .line 1671
    .line 1672
    move-result v6

    .line 1673
    if-eqz v6, :cond_54

    .line 1674
    .line 1675
    move-object/from16 v6, v18

    .line 1676
    .line 1677
    goto :goto_22

    .line 1678
    :cond_54
    move-object/from16 v6, v16

    .line 1679
    .line 1680
    :goto_22
    sget-object v9, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1681
    .line 1682
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 1683
    .line 1684
    filled-new-array {v10, v13}, [Ljava/lang/Object;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v10

    .line 1688
    const/4 v13, 0x2

    .line 1689
    invoke-static {v10, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v10

    .line 1693
    invoke-static {v9, v6, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v13

    .line 1697
    goto :goto_25

    .line 1698
    :cond_55
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v9

    .line 1702
    check-cast v9, Ljava/lang/String;

    .line 1703
    .line 1704
    if-nez v9, :cond_56

    .line 1705
    .line 1706
    move-object v9, v12

    .line 1707
    :cond_56
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 1708
    .line 1709
    const/4 v13, 0x0

    .line 1710
    invoke-static {v9, v10, v13}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1711
    .line 1712
    .line 1713
    move-result v10

    .line 1714
    if-eqz v10, :cond_57

    .line 1715
    .line 1716
    move-object v13, v9

    .line 1717
    goto :goto_25

    .line 1718
    :cond_57
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 1719
    .line 1720
    .line 1721
    move-result v10

    .line 1722
    if-nez v10, :cond_58

    .line 1723
    .line 1724
    goto :goto_23

    .line 1725
    :cond_58
    sget-object v10, La/u0d;->a:Ljava/util/List;

    .line 1726
    .line 1727
    invoke-static {v9}, La/u0d;->c(Ljava/lang/String;)Z

    .line 1728
    .line 1729
    .line 1730
    move-result v10

    .line 1731
    if-eqz v10, :cond_59

    .line 1732
    .line 1733
    :goto_23
    goto :goto_21

    .line 1734
    :cond_59
    const/4 v10, 0x1

    .line 1735
    invoke-static {v9, v6, v10}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1736
    .line 1737
    .line 1738
    move-result v6

    .line 1739
    if-eqz v6, :cond_5a

    .line 1740
    .line 1741
    move-object/from16 v6, v18

    .line 1742
    .line 1743
    goto :goto_24

    .line 1744
    :cond_5a
    move-object/from16 v6, v16

    .line 1745
    .line 1746
    :goto_24
    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1747
    .line 1748
    sget-object v13, La/ujn;->h:Ljava/lang/String;

    .line 1749
    .line 1750
    filled-new-array {v13, v9}, [Ljava/lang/Object;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v9

    .line 1754
    const/4 v13, 0x2

    .line 1755
    invoke-static {v9, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v9

    .line 1759
    invoke-static {v10, v6, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v6

    .line 1763
    move-object v13, v6

    .line 1764
    :goto_25
    iget v6, v5, La/q0p;->b:I

    .line 1765
    .line 1766
    div-int/lit8 v9, v6, 0x3c

    .line 1767
    .line 1768
    rem-int/lit8 v6, v6, 0x3c

    .line 1769
    .line 1770
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v10

    .line 1774
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v9

    .line 1778
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v6

    .line 1782
    filled-new-array {v9, v6}, [Ljava/lang/Object;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v6

    .line 1786
    const/4 v9, 0x2

    .line 1787
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v6

    .line 1791
    const-string v9, "%02d:%02d"

    .line 1792
    .line 1793
    invoke-static {v10, v9, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1794
    .line 1795
    .line 1796
    move-result-object v6

    .line 1797
    sget-wide v9, La/ijg;->g:J

    .line 1798
    .line 1799
    sget-object v16, La/qmk;->a:La/zcl;

    .line 1800
    .line 1801
    sget-object v16, La/gqw0;->e:La/zx7;

    .line 1802
    .line 1803
    move-object/from16 v18, v0

    .line 1804
    .line 1805
    new-instance v0, La/x0p;

    .line 1806
    .line 1807
    invoke-direct {v0, v13, v9, v10}, La/x0p;-><init>(Ljava/lang/String;J)V

    .line 1808
    .line 1809
    .line 1810
    new-instance v32, La/y0p;

    .line 1811
    .line 1812
    sget-object v13, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1813
    .line 1814
    invoke-virtual {v13}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1815
    .line 1816
    .line 1817
    move-result-wide v36

    .line 1818
    const/16 v38, 0x0

    .line 1819
    .line 1820
    sget-object v39, La/gqw0;->d:La/zx7;

    .line 1821
    .line 1822
    const/high16 v34, 0x41400000    # 12.0f

    .line 1823
    .line 1824
    const/high16 v35, 0x40c00000    # 6.0f

    .line 1825
    .line 1826
    move-object/from16 v33, v8

    .line 1827
    .line 1828
    move-wide/from16 v40, v9

    .line 1829
    .line 1830
    invoke-direct/range {v32 .. v41}, La/y0p;-><init>(Ljava/lang/String;FFJFLa/zx7;J)V

    .line 1831
    .line 1832
    .line 1833
    move-object/from16 v8, v32

    .line 1834
    .line 1835
    new-instance v32, La/y0p;

    .line 1836
    .line 1837
    invoke-virtual {v13}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1838
    .line 1839
    .line 1840
    move-result-wide v36

    .line 1841
    const/high16 v38, 0x42840000    # 66.0f

    .line 1842
    .line 1843
    const/16 v34, 0x0

    .line 1844
    .line 1845
    const/16 v35, 0x0

    .line 1846
    .line 1847
    move-object/from16 v33, v6

    .line 1848
    .line 1849
    move-object/from16 v39, v16

    .line 1850
    .line 1851
    invoke-direct/range {v32 .. v41}, La/y0p;-><init>(Ljava/lang/String;FFJFLa/zx7;J)V

    .line 1852
    .line 1853
    .line 1854
    move-object/from16 v6, v32

    .line 1855
    .line 1856
    new-instance v32, La/y0p;

    .line 1857
    .line 1858
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 1859
    .line 1860
    .line 1861
    move-result v9

    .line 1862
    if-eqz v9, :cond_5e

    .line 1863
    .line 1864
    const/4 v10, 0x1

    .line 1865
    if-eq v9, v10, :cond_5d

    .line 1866
    .line 1867
    const/4 v10, 0x2

    .line 1868
    if-eq v9, v10, :cond_5c

    .line 1869
    .line 1870
    const/4 v10, 0x3

    .line 1871
    if-ne v9, v10, :cond_5b

    .line 1872
    .line 1873
    move-object/from16 p0, v0

    .line 1874
    .line 1875
    move-object/from16 v33, v12

    .line 1876
    .line 1877
    goto :goto_27

    .line 1878
    :cond_5b
    invoke-static {}, La/t9f;->b()V

    .line 1879
    .line 1880
    .line 1881
    return-object v17

    .line 1882
    :cond_5c
    const/4 v10, 0x0

    .line 1883
    new-array v9, v10, [Ljava/lang/Object;

    .line 1884
    .line 1885
    move-object/from16 p0, v0

    .line 1886
    .line 1887
    iget-object v0, v4, La/ctf0;->b:La/lsm0;

    .line 1888
    .line 1889
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1890
    .line 1891
    .line 1892
    move-result-object v9

    .line 1893
    const v10, 0x7f130aa3

    .line 1894
    .line 1895
    .line 1896
    invoke-virtual {v0, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v0

    .line 1900
    :goto_26
    move-object/from16 v33, v0

    .line 1901
    .line 1902
    goto :goto_27

    .line 1903
    :cond_5d
    move-object/from16 p0, v0

    .line 1904
    .line 1905
    const/4 v10, 0x0

    .line 1906
    new-array v0, v10, [Ljava/lang/Object;

    .line 1907
    .line 1908
    const v9, 0x7f1315b4

    .line 1909
    .line 1910
    .line 1911
    invoke-virtual {v4, v9, v0}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v0

    .line 1915
    goto :goto_26

    .line 1916
    :cond_5e
    move-object/from16 p0, v0

    .line 1917
    .line 1918
    const/4 v10, 0x0

    .line 1919
    new-array v0, v10, [Ljava/lang/Object;

    .line 1920
    .line 1921
    const v9, 0x7f130861

    .line 1922
    .line 1923
    .line 1924
    invoke-virtual {v4, v9, v0}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v0

    .line 1928
    goto :goto_26

    .line 1929
    :goto_27
    invoke-virtual {v13}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack-0d7_KjU()J

    .line 1930
    .line 1931
    .line 1932
    move-result-wide v36

    .line 1933
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 1934
    .line 1935
    .line 1936
    move-result v0

    .line 1937
    if-eqz v0, :cond_62

    .line 1938
    .line 1939
    const/4 v10, 0x1

    .line 1940
    if-eq v0, v10, :cond_61

    .line 1941
    .line 1942
    const/4 v13, 0x2

    .line 1943
    if-eq v0, v13, :cond_60

    .line 1944
    .line 1945
    const/4 v10, 0x3

    .line 1946
    if-ne v0, v10, :cond_5f

    .line 1947
    .line 1948
    goto :goto_29

    .line 1949
    :cond_5f
    invoke-static {}, La/t9f;->b()V

    .line 1950
    .line 1951
    .line 1952
    return-object v17

    .line 1953
    :cond_60
    sget-wide v9, La/ijg;->o0:J

    .line 1954
    .line 1955
    :goto_28
    move-wide/from16 v40, v9

    .line 1956
    .line 1957
    goto :goto_29

    .line 1958
    :cond_61
    sget-wide v9, La/ijg;->q:J

    .line 1959
    .line 1960
    goto :goto_28

    .line 1961
    :cond_62
    sget-wide v9, La/ijg;->R:J

    .line 1962
    .line 1963
    goto :goto_28

    .line 1964
    :goto_29
    const/high16 v34, 0x41200000    # 10.0f

    .line 1965
    .line 1966
    const/high16 v35, 0x41000000    # 8.0f

    .line 1967
    .line 1968
    const/high16 v38, 0x42c80000    # 100.0f

    .line 1969
    .line 1970
    invoke-direct/range {v32 .. v41}, La/y0p;-><init>(Ljava/lang/String;FFJFLa/zx7;J)V

    .line 1971
    .line 1972
    .line 1973
    const/4 v0, 0x4

    .line 1974
    new-array v9, v0, [La/z0p;

    .line 1975
    .line 1976
    const/16 v21, 0x0

    .line 1977
    .line 1978
    aput-object p0, v9, v21

    .line 1979
    .line 1980
    const/16 v20, 0x1

    .line 1981
    .line 1982
    aput-object v8, v9, v20

    .line 1983
    .line 1984
    const/16 v22, 0x2

    .line 1985
    .line 1986
    aput-object v6, v9, v22

    .line 1987
    .line 1988
    const/16 v27, 0x3

    .line 1989
    .line 1990
    aput-object v32, v9, v27

    .line 1991
    .line 1992
    invoke-static {v9}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1993
    .line 1994
    .line 1995
    move-result-object v6

    .line 1996
    invoke-static {v6}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v6

    .line 2000
    new-instance v8, La/u0p;

    .line 2001
    .line 2002
    iget v5, v5, La/q0p;->a:I

    .line 2003
    .line 2004
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v5

    .line 2008
    invoke-direct {v8, v6, v5}, La/u0p;-><init>(La/i4;Ljava/lang/String;)V

    .line 2009
    .line 2010
    .line 2011
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2012
    .line 2013
    .line 2014
    move-object/from16 v0, v18

    .line 2015
    .line 2016
    goto/16 :goto_20

    .line 2017
    .line 2018
    :cond_63
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2019
    .line 2020
    .line 2021
    move-result-object v0

    .line 2022
    new-instance v2, La/w0p;

    .line 2023
    .line 2024
    invoke-direct {v2, v0, v7}, La/w0p;-><init>(La/i4;Ljava/lang/String;)V

    .line 2025
    .line 2026
    .line 2027
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2028
    .line 2029
    .line 2030
    goto/16 :goto_58

    .line 2031
    .line 2032
    :cond_64
    move-object/from16 v18, v0

    .line 2033
    .line 2034
    instance-of v0, v8, La/huf;

    .line 2035
    .line 2036
    if-eqz v0, :cond_70

    .line 2037
    .line 2038
    check-cast v8, La/huf;

    .line 2039
    .line 2040
    iget-object v0, v8, La/huf;->a:Ljava/util/List;

    .line 2041
    .line 2042
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2043
    .line 2044
    .line 2045
    move-result v3

    .line 2046
    if-eqz v3, :cond_65

    .line 2047
    .line 2048
    goto/16 :goto_58

    .line 2049
    .line 2050
    :cond_65
    new-instance v27, La/hjm;

    .line 2051
    .line 2052
    const/4 v10, 0x0

    .line 2053
    new-array v3, v10, [Ljava/lang/Object;

    .line 2054
    .line 2055
    const v5, 0x7f13119e

    .line 2056
    .line 2057
    .line 2058
    invoke-virtual {v4, v5, v3}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v28

    .line 2062
    new-instance v3, La/njm;

    .line 2063
    .line 2064
    const/16 v5, 0x7f

    .line 2065
    .line 2066
    invoke-direct {v3, v5}, La/njm;-><init>(I)V

    .line 2067
    .line 2068
    .line 2069
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 2070
    .line 2071
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 2072
    .line 2073
    .line 2074
    move-result-wide v7

    .line 2075
    new-instance v5, La/y3d;

    .line 2076
    .line 2077
    invoke-direct {v5, v7, v8}, La/y3d;-><init>(J)V

    .line 2078
    .line 2079
    .line 2080
    const/16 v39, 0x0

    .line 2081
    .line 2082
    const/16 v40, 0x1ff8

    .line 2083
    .line 2084
    const/16 v31, 0x0

    .line 2085
    .line 2086
    const/16 v32, 0x0

    .line 2087
    .line 2088
    const/16 v33, 0x0

    .line 2089
    .line 2090
    const/16 v34, 0x0

    .line 2091
    .line 2092
    const/16 v35, 0x0

    .line 2093
    .line 2094
    const/16 v36, 0x0

    .line 2095
    .line 2096
    const/16 v37, 0x0

    .line 2097
    .line 2098
    const/16 v38, 0x0

    .line 2099
    .line 2100
    move-object/from16 v29, v3

    .line 2101
    .line 2102
    move-object/from16 v30, v5

    .line 2103
    .line 2104
    invoke-direct/range {v27 .. v40}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 2105
    .line 2106
    .line 2107
    move-object/from16 v3, v27

    .line 2108
    .line 2109
    new-instance v5, Ljava/util/ArrayList;

    .line 2110
    .line 2111
    const/16 v7, 0xa

    .line 2112
    .line 2113
    invoke-static {v0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2114
    .line 2115
    .line 2116
    move-result v7

    .line 2117
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 2118
    .line 2119
    .line 2120
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v0

    .line 2124
    const/4 v7, 0x0

    .line 2125
    :goto_2a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2126
    .line 2127
    .line 2128
    move-result v8

    .line 2129
    if-eqz v8, :cond_6f

    .line 2130
    .line 2131
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v8

    .line 2135
    add-int/lit8 v9, v7, 0x1

    .line 2136
    .line 2137
    if-ltz v7, :cond_6e

    .line 2138
    .line 2139
    check-cast v8, La/iuf;

    .line 2140
    .line 2141
    iget-object v10, v8, La/iuf;->c:Ljava/lang/Integer;

    .line 2142
    .line 2143
    iget v13, v8, La/iuf;->a:I

    .line 2144
    .line 2145
    iget-boolean v6, v8, La/iuf;->f:Z

    .line 2146
    .line 2147
    if-eqz v10, :cond_66

    .line 2148
    .line 2149
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 2150
    .line 2151
    .line 2152
    move-result v10

    .line 2153
    goto :goto_2b

    .line 2154
    :cond_66
    const/4 v10, 0x0

    .line 2155
    :goto_2b
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2156
    .line 2157
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2158
    .line 2159
    .line 2160
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2161
    .line 2162
    .line 2163
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2164
    .line 2165
    .line 2166
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2167
    .line 2168
    .line 2169
    move-result-object v30

    .line 2170
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v2

    .line 2174
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 2175
    .line 2176
    .line 2177
    move-result-object v2

    .line 2178
    const v7, 0x7f1309a4

    .line 2179
    .line 2180
    .line 2181
    invoke-virtual {v4, v7, v2}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v33

    .line 2185
    new-instance v2, La/juf;

    .line 2186
    .line 2187
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v7

    .line 2191
    check-cast v7, Ljava/lang/String;

    .line 2192
    .line 2193
    if-nez v7, :cond_67

    .line 2194
    .line 2195
    move-object v7, v12

    .line 2196
    :cond_67
    invoke-static {v7}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 2197
    .line 2198
    .line 2199
    move-result-object v7

    .line 2200
    invoke-direct {v2, v7, v6, v6}, La/juf;-><init>(Ljava/lang/String;ZZ)V

    .line 2201
    .line 2202
    .line 2203
    new-instance v7, La/juf;

    .line 2204
    .line 2205
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2206
    .line 2207
    .line 2208
    move-result-object v13

    .line 2209
    check-cast v13, Ljava/lang/String;

    .line 2210
    .line 2211
    if-nez v13, :cond_68

    .line 2212
    .line 2213
    move-object v13, v12

    .line 2214
    :cond_68
    invoke-static {v13}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v13

    .line 2218
    move-object/from16 p0, v0

    .line 2219
    .line 2220
    xor-int/lit8 v0, v6, 0x1

    .line 2221
    .line 2222
    invoke-direct {v7, v13, v0, v0}, La/juf;-><init>(Ljava/lang/String;ZZ)V

    .line 2223
    .line 2224
    .line 2225
    sget-object v0, La/rdj;->a:La/rdj;

    .line 2226
    .line 2227
    move v0, v6

    .line 2228
    move-object/from16 v32, v7

    .line 2229
    .line 2230
    iget-wide v6, v8, La/iuf;->b:J

    .line 2231
    .line 2232
    new-instance v13, La/znq0;

    .line 2233
    .line 2234
    invoke-direct {v13, v6, v7}, La/znq0;-><init>(J)V

    .line 2235
    .line 2236
    .line 2237
    cmp-long v6, v6, v25

    .line 2238
    .line 2239
    if-ltz v6, :cond_69

    .line 2240
    .line 2241
    goto :goto_2c

    .line 2242
    :cond_69
    move-object/from16 v13, v17

    .line 2243
    .line 2244
    :goto_2c
    if-eqz v13, :cond_6a

    .line 2245
    .line 2246
    iget-wide v6, v13, La/znq0;->a:J

    .line 2247
    .line 2248
    goto :goto_2d

    .line 2249
    :cond_6a
    move-wide/from16 v6, v25

    .line 2250
    .line 2251
    :goto_2d
    sget-object v13, La/ykq0;->e:La/ykq0;

    .line 2252
    .line 2253
    move/from16 p1, v0

    .line 2254
    .line 2255
    new-instance v0, La/znq0;

    .line 2256
    .line 2257
    invoke-direct {v0, v6, v7}, La/znq0;-><init>(J)V

    .line 2258
    .line 2259
    .line 2260
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2261
    .line 2262
    move-object/from16 v31, v2

    .line 2263
    .line 2264
    move-object/from16 v2, v17

    .line 2265
    .line 2266
    const/16 v7, 0xe8

    .line 2267
    .line 2268
    invoke-static {v0, v13, v6, v2, v7}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v34

    .line 2272
    new-instance v0, La/buf;

    .line 2273
    .line 2274
    const/4 v13, 0x0

    .line 2275
    new-array v2, v13, [Ljava/lang/Object;

    .line 2276
    .line 2277
    const v6, 0x7f131814

    .line 2278
    .line 2279
    .line 2280
    invoke-virtual {v4, v6, v2}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2281
    .line 2282
    .line 2283
    move-result-object v2

    .line 2284
    if-eqz p1, :cond_6b

    .line 2285
    .line 2286
    move-object/from16 v6, v18

    .line 2287
    .line 2288
    goto :goto_2e

    .line 2289
    :cond_6b
    move-object v6, v11

    .line 2290
    :goto_2e
    new-instance v7, La/auf;

    .line 2291
    .line 2292
    move/from16 p1, v9

    .line 2293
    .line 2294
    const v9, 0x7f1305ab

    .line 2295
    .line 2296
    .line 2297
    move/from16 v19, v10

    .line 2298
    .line 2299
    new-array v10, v13, [Ljava/lang/Object;

    .line 2300
    .line 2301
    invoke-virtual {v4, v9, v10}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2302
    .line 2303
    .line 2304
    move-result-object v9

    .line 2305
    iget v10, v8, La/iuf;->e:I

    .line 2306
    .line 2307
    iget-object v8, v8, La/iuf;->d:Ljava/lang/Integer;

    .line 2308
    .line 2309
    if-nez v8, :cond_6c

    .line 2310
    .line 2311
    add-int/lit8 v8, v10, 0x1

    .line 2312
    .line 2313
    goto :goto_2f

    .line 2314
    :cond_6c
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 2315
    .line 2316
    .line 2317
    move-result v8

    .line 2318
    :goto_2f
    invoke-direct {v7, v9, v10, v8}, La/auf;-><init>(Ljava/lang/String;II)V

    .line 2319
    .line 2320
    .line 2321
    new-instance v8, La/ztf;

    .line 2322
    .line 2323
    const v9, 0x7f130585

    .line 2324
    .line 2325
    .line 2326
    const/4 v10, 0x0

    .line 2327
    new-array v13, v10, [Ljava/lang/Object;

    .line 2328
    .line 2329
    invoke-virtual {v4, v9, v13}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v9

    .line 2333
    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2334
    .line 2335
    .line 2336
    move-result-object v10

    .line 2337
    if-lez v19, :cond_6d

    .line 2338
    .line 2339
    const v13, 0x7f0803a3

    .line 2340
    .line 2341
    .line 2342
    goto :goto_30

    .line 2343
    :cond_6d
    const v13, 0x7f0803a4

    .line 2344
    .line 2345
    .line 2346
    :goto_30
    invoke-direct {v8, v13, v9, v10}, La/ztf;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 2347
    .line 2348
    .line 2349
    invoke-direct {v0, v2, v6, v7, v8}, La/buf;-><init>(Ljava/lang/String;Ljava/lang/String;La/auf;La/ztf;)V

    .line 2350
    .line 2351
    .line 2352
    new-instance v29, La/fuf;

    .line 2353
    .line 2354
    move-object/from16 v35, v0

    .line 2355
    .line 2356
    invoke-direct/range {v29 .. v35}, La/fuf;-><init>(Ljava/lang/String;La/juf;La/juf;Ljava/lang/String;Ljava/lang/String;La/buf;)V

    .line 2357
    .line 2358
    .line 2359
    move-object/from16 v0, v29

    .line 2360
    .line 2361
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2362
    .line 2363
    .line 2364
    move-object/from16 v0, p0

    .line 2365
    .line 2366
    move/from16 v7, p1

    .line 2367
    .line 2368
    const/16 v17, 0x0

    .line 2369
    .line 2370
    goto/16 :goto_2a

    .line 2371
    .line 2372
    :cond_6e
    invoke-static {}, La/q3d;->p()V

    .line 2373
    .line 2374
    .line 2375
    const/16 v17, 0x0

    .line 2376
    .line 2377
    throw v17

    .line 2378
    :cond_6f
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v0

    .line 2382
    new-instance v2, La/kuf;

    .line 2383
    .line 2384
    invoke-direct {v2, v3, v0}, La/kuf;-><init>(La/hjm;La/a4x;)V

    .line 2385
    .line 2386
    .line 2387
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2388
    .line 2389
    .line 2390
    goto/16 :goto_58

    .line 2391
    .line 2392
    :cond_70
    instance-of v0, v8, La/i960;

    .line 2393
    .line 2394
    const/4 v2, 0x6

    .line 2395
    if-eqz v0, :cond_78

    .line 2396
    .line 2397
    check-cast v8, La/i960;

    .line 2398
    .line 2399
    sget-object v0, La/n960;->a:Lkotlin/ranges/IntRange;

    .line 2400
    .line 2401
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2402
    .line 2403
    .line 2404
    iget-object v0, v8, La/i960;->a:Ljava/lang/String;

    .line 2405
    .line 2406
    invoke-static {v0}, La/n960;->b(Ljava/lang/String;)La/e960;

    .line 2407
    .line 2408
    .line 2409
    move-result-object v26

    .line 2410
    iget-object v0, v8, La/i960;->b:Ljava/lang/String;

    .line 2411
    .line 2412
    const-string v5, ","

    .line 2413
    .line 2414
    filled-new-array {v5}, [Ljava/lang/String;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v5

    .line 2418
    const/4 v10, 0x0

    .line 2419
    invoke-static {v0, v5, v10, v2}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 2420
    .line 2421
    .line 2422
    move-result-object v0

    .line 2423
    new-instance v2, Ljava/util/ArrayList;

    .line 2424
    .line 2425
    const/16 v6, 0xa

    .line 2426
    .line 2427
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2428
    .line 2429
    .line 2430
    move-result v5

    .line 2431
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 2432
    .line 2433
    .line 2434
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2435
    .line 2436
    .line 2437
    move-result-object v0

    .line 2438
    :goto_31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2439
    .line 2440
    .line 2441
    move-result v5

    .line 2442
    if-eqz v5, :cond_71

    .line 2443
    .line 2444
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2445
    .line 2446
    .line 2447
    move-result-object v5

    .line 2448
    check-cast v5, Ljava/lang/String;

    .line 2449
    .line 2450
    invoke-static {v5}, La/n960;->b(Ljava/lang/String;)La/e960;

    .line 2451
    .line 2452
    .line 2453
    move-result-object v5

    .line 2454
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2455
    .line 2456
    .line 2457
    goto :goto_31

    .line 2458
    :cond_71
    if-eqz v26, :cond_b3

    .line 2459
    .line 2460
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2461
    .line 2462
    .line 2463
    move-result v0

    .line 2464
    if-eqz v0, :cond_72

    .line 2465
    .line 2466
    goto :goto_32

    .line 2467
    :cond_72
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2468
    .line 2469
    .line 2470
    move-result-object v0

    .line 2471
    :cond_73
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2472
    .line 2473
    .line 2474
    move-result v5

    .line 2475
    if-eqz v5, :cond_74

    .line 2476
    .line 2477
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2478
    .line 2479
    .line 2480
    move-result-object v5

    .line 2481
    check-cast v5, La/e960;

    .line 2482
    .line 2483
    if-nez v5, :cond_73

    .line 2484
    .line 2485
    goto/16 :goto_58

    .line 2486
    .line 2487
    :cond_74
    :goto_32
    new-instance v0, Ljava/util/ArrayList;

    .line 2488
    .line 2489
    const/4 v10, 0x3

    .line 2490
    invoke-direct {v0, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 2491
    .line 2492
    .line 2493
    const/4 v5, 0x0

    .line 2494
    :goto_33
    if-ge v5, v10, :cond_76

    .line 2495
    .line 2496
    invoke-static {v5, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 2497
    .line 2498
    .line 2499
    move-result-object v6

    .line 2500
    check-cast v6, La/e960;

    .line 2501
    .line 2502
    if-nez v6, :cond_75

    .line 2503
    .line 2504
    sget-object v6, La/c960;->a:La/c960;

    .line 2505
    .line 2506
    :cond_75
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2507
    .line 2508
    .line 2509
    add-int/lit8 v5, v5, 0x1

    .line 2510
    .line 2511
    const/4 v10, 0x3

    .line 2512
    goto :goto_33

    .line 2513
    :cond_76
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2514
    .line 2515
    .line 2516
    move-result-object v27

    .line 2517
    new-instance v24, La/m960;

    .line 2518
    .line 2519
    iget v0, v3, La/qqs;->p:I

    .line 2520
    .line 2521
    if-lez v0, :cond_77

    .line 2522
    .line 2523
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2524
    .line 2525
    .line 2526
    move-result-object v0

    .line 2527
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2528
    .line 2529
    .line 2530
    move-result-object v0

    .line 2531
    const v2, 0x7f13060b

    .line 2532
    .line 2533
    .line 2534
    invoke-virtual {v4, v2, v0}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2535
    .line 2536
    .line 2537
    move-result-object v0

    .line 2538
    :goto_34
    move-object/from16 v25, v0

    .line 2539
    .line 2540
    goto :goto_35

    .line 2541
    :cond_77
    iget-object v0, v3, La/qqs;->l:Ljava/lang/String;

    .line 2542
    .line 2543
    goto :goto_34

    .line 2544
    :goto_35
    new-instance v8, La/g960;

    .line 2545
    .line 2546
    const-string v0, "static/img/ImgDefault/Esports/Virtual/Numbers/gameTable.png"

    .line 2547
    .line 2548
    invoke-static {v0}, La/n960;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2549
    .line 2550
    .line 2551
    move-result-object v9

    .line 2552
    const-string v0, "static/img/ImgDefault/Esports/Virtual/Numbers/roundScoreboard.png"

    .line 2553
    .line 2554
    invoke-static {v0}, La/n960;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2555
    .line 2556
    .line 2557
    move-result-object v10

    .line 2558
    const-string v0, "static/img/ImgDefault/Esports/Virtual/Numbers/wholeCookie.png"

    .line 2559
    .line 2560
    invoke-static {v0}, La/n960;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2561
    .line 2562
    .line 2563
    move-result-object v11

    .line 2564
    const-string v0, "static/img/ImgDefault/Esports/Virtual/Numbers/cookieLeftPart.png"

    .line 2565
    .line 2566
    invoke-static {v0}, La/n960;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2567
    .line 2568
    .line 2569
    move-result-object v12

    .line 2570
    const-string v0, "static/img/ImgDefault/Esports/Virtual/Numbers/cookieRightPart.png"

    .line 2571
    .line 2572
    invoke-static {v0}, La/n960;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2573
    .line 2574
    .line 2575
    move-result-object v13

    .line 2576
    const-string v0, "static/img/ImgDefault/Esports/Virtual/Numbers/largeNote.png"

    .line 2577
    .line 2578
    invoke-static {v0}, La/n960;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2579
    .line 2580
    .line 2581
    move-result-object v14

    .line 2582
    const-string v0, "static/img/ImgDefault/Esports/Virtual/Numbers/smallNote.png"

    .line 2583
    .line 2584
    invoke-static {v0}, La/n960;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2585
    .line 2586
    .line 2587
    move-result-object v15

    .line 2588
    invoke-direct/range {v8 .. v15}, La/g960;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2589
    .line 2590
    .line 2591
    move-object/from16 v28, v7

    .line 2592
    .line 2593
    move-object/from16 v29, v8

    .line 2594
    .line 2595
    invoke-direct/range {v24 .. v29}, La/m960;-><init>(Ljava/lang/String;La/e960;La/i4;Ljava/lang/String;La/g960;)V

    .line 2596
    .line 2597
    .line 2598
    move-object/from16 v0, v24

    .line 2599
    .line 2600
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2601
    .line 2602
    .line 2603
    goto/16 :goto_58

    .line 2604
    .line 2605
    :cond_78
    instance-of v0, v8, La/cjg0;

    .line 2606
    .line 2607
    if-eqz v0, :cond_98

    .line 2608
    .line 2609
    check-cast v8, La/cjg0;

    .line 2610
    .line 2611
    new-instance v0, La/ajg0;

    .line 2612
    .line 2613
    iget-object v3, v8, La/cjg0;->d:Ljava/util/List;

    .line 2614
    .line 2615
    iget v5, v8, La/cjg0;->a:I

    .line 2616
    .line 2617
    iget-object v7, v8, La/cjg0;->c:La/xjg0;

    .line 2618
    .line 2619
    iget-object v8, v8, La/cjg0;->b:La/nig0;

    .line 2620
    .line 2621
    sget-object v9, La/vig0;->a:La/vig0;

    .line 2622
    .line 2623
    if-eqz v5, :cond_7c

    .line 2624
    .line 2625
    const/4 v10, 0x1

    .line 2626
    if-eq v5, v10, :cond_7b

    .line 2627
    .line 2628
    const/4 v13, 0x2

    .line 2629
    if-eq v5, v13, :cond_7a

    .line 2630
    .line 2631
    const/4 v10, 0x3

    .line 2632
    if-eq v5, v10, :cond_79

    .line 2633
    .line 2634
    sget-object v5, La/uig0;->a:La/uig0;

    .line 2635
    .line 2636
    goto :goto_36

    .line 2637
    :cond_79
    move-object v5, v9

    .line 2638
    goto :goto_36

    .line 2639
    :cond_7a
    sget-object v5, La/yig0;->a:La/yig0;

    .line 2640
    .line 2641
    goto :goto_36

    .line 2642
    :cond_7b
    sget-object v5, La/xig0;->a:La/xig0;

    .line 2643
    .line 2644
    goto :goto_36

    .line 2645
    :cond_7c
    sget-object v5, La/wig0;->a:La/wig0;

    .line 2646
    .line 2647
    :goto_36
    iget-object v10, v8, La/nig0;->a:La/qjg0;

    .line 2648
    .line 2649
    iget-object v11, v8, La/nig0;->d:La/tig0;

    .line 2650
    .line 2651
    iget-object v13, v8, La/nig0;->b:La/qjg0;

    .line 2652
    .line 2653
    iget-object v8, v8, La/nig0;->c:La/qjg0;

    .line 2654
    .line 2655
    invoke-static {v10}, La/ufx;->L(La/qjg0;)La/pjg0;

    .line 2656
    .line 2657
    .line 2658
    move-result-object v14

    .line 2659
    invoke-static {v13}, La/ufx;->L(La/qjg0;)La/pjg0;

    .line 2660
    .line 2661
    .line 2662
    move-result-object v15

    .line 2663
    invoke-static {v8}, La/ufx;->L(La/qjg0;)La/pjg0;

    .line 2664
    .line 2665
    .line 2666
    move-result-object v2

    .line 2667
    invoke-virtual {v5, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2668
    .line 2669
    .line 2670
    move-result v9

    .line 2671
    if-eqz v9, :cond_80

    .line 2672
    .line 2673
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 2674
    .line 2675
    .line 2676
    move-result-object v9

    .line 2677
    iget-boolean v6, v10, La/qjg0;->d:Z

    .line 2678
    .line 2679
    if-eqz v6, :cond_7d

    .line 2680
    .line 2681
    invoke-virtual {v9, v14}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2682
    .line 2683
    .line 2684
    :cond_7d
    iget-boolean v6, v13, La/qjg0;->d:Z

    .line 2685
    .line 2686
    if-eqz v6, :cond_7e

    .line 2687
    .line 2688
    invoke-virtual {v9, v15}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2689
    .line 2690
    .line 2691
    :cond_7e
    iget-boolean v6, v8, La/qjg0;->d:Z

    .line 2692
    .line 2693
    if-eqz v6, :cond_7f

    .line 2694
    .line 2695
    invoke-virtual {v9, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2696
    .line 2697
    .line 2698
    :cond_7f
    invoke-static {v9}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 2699
    .line 2700
    .line 2701
    move-result-object v6

    .line 2702
    goto :goto_37

    .line 2703
    :cond_80
    sget-object v6, La/iun;->a:La/iun;

    .line 2704
    .line 2705
    :goto_37
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 2706
    .line 2707
    .line 2708
    move-result v9

    .line 2709
    move-object/from16 v40, v2

    .line 2710
    .line 2711
    const/4 v2, 0x1

    .line 2712
    if-eq v9, v2, :cond_83

    .line 2713
    .line 2714
    const/4 v2, 0x2

    .line 2715
    if-eq v9, v2, :cond_82

    .line 2716
    .line 2717
    const/4 v2, 0x3

    .line 2718
    if-eq v9, v2, :cond_81

    .line 2719
    .line 2720
    move-object v2, v12

    .line 2721
    goto :goto_38

    .line 2722
    :cond_81
    const/4 v2, 0x0

    .line 2723
    new-array v9, v2, [Ljava/lang/Object;

    .line 2724
    .line 2725
    const v2, 0x7f13073c

    .line 2726
    .line 2727
    .line 2728
    invoke-virtual {v4, v2, v9}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2729
    .line 2730
    .line 2731
    move-result-object v2

    .line 2732
    goto :goto_38

    .line 2733
    :cond_82
    const/4 v2, 0x0

    .line 2734
    new-array v9, v2, [Ljava/lang/Object;

    .line 2735
    .line 2736
    const v2, 0x7f131815

    .line 2737
    .line 2738
    .line 2739
    invoke-virtual {v4, v2, v9}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2740
    .line 2741
    .line 2742
    move-result-object v2

    .line 2743
    goto :goto_38

    .line 2744
    :cond_83
    const/4 v2, 0x0

    .line 2745
    new-array v9, v2, [Ljava/lang/Object;

    .line 2746
    .line 2747
    const v2, 0x7f131814

    .line 2748
    .line 2749
    .line 2750
    invoke-virtual {v4, v2, v9}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2751
    .line 2752
    .line 2753
    move-result-object v2

    .line 2754
    :goto_38
    new-instance v31, La/mkg0;

    .line 2755
    .line 2756
    new-instance v9, La/n0x;

    .line 2757
    .line 2758
    move-object/from16 v33, v5

    .line 2759
    .line 2760
    const-string v5, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Tablet.png"

    .line 2761
    .line 2762
    invoke-direct {v9, v5}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2763
    .line 2764
    .line 2765
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2766
    .line 2767
    .line 2768
    move-result v34

    .line 2769
    if-eqz v7, :cond_84

    .line 2770
    .line 2771
    iget-object v5, v7, La/xjg0;->a:La/fkg0;

    .line 2772
    .line 2773
    iget-object v5, v5, La/fkg0;->a:La/lig0;

    .line 2774
    .line 2775
    goto :goto_39

    .line 2776
    :cond_84
    const/4 v5, 0x0

    .line 2777
    :goto_39
    invoke-static {v10, v5}, La/ufx;->K(La/qjg0;La/lig0;)La/njg0;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v35

    .line 2781
    if-eqz v7, :cond_85

    .line 2782
    .line 2783
    iget-object v5, v7, La/xjg0;->b:La/fkg0;

    .line 2784
    .line 2785
    iget-object v5, v5, La/fkg0;->a:La/lig0;

    .line 2786
    .line 2787
    goto :goto_3a

    .line 2788
    :cond_85
    const/4 v5, 0x0

    .line 2789
    :goto_3a
    invoke-static {v13, v5}, La/ufx;->K(La/qjg0;La/lig0;)La/njg0;

    .line 2790
    .line 2791
    .line 2792
    move-result-object v36

    .line 2793
    if-eqz v7, :cond_86

    .line 2794
    .line 2795
    iget-object v5, v7, La/xjg0;->c:La/fkg0;

    .line 2796
    .line 2797
    iget-object v5, v5, La/fkg0;->a:La/lig0;

    .line 2798
    .line 2799
    goto :goto_3b

    .line 2800
    :cond_86
    const/4 v5, 0x0

    .line 2801
    :goto_3b
    invoke-static {v8, v5}, La/ufx;->K(La/qjg0;La/lig0;)La/njg0;

    .line 2802
    .line 2803
    .line 2804
    move-result-object v37

    .line 2805
    new-instance v5, La/okg0;

    .line 2806
    .line 2807
    invoke-direct {v5, v6, v2}, La/okg0;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 2808
    .line 2809
    .line 2810
    move-object/from16 v41, v5

    .line 2811
    .line 2812
    move-object/from16 v32, v9

    .line 2813
    .line 2814
    move-object/from16 v38, v14

    .line 2815
    .line 2816
    move-object/from16 v39, v15

    .line 2817
    .line 2818
    invoke-direct/range {v31 .. v41}, La/mkg0;-><init>(La/n0x;La/zig0;ILa/njg0;La/njg0;La/njg0;La/pjg0;La/pjg0;La/pjg0;La/okg0;)V

    .line 2819
    .line 2820
    .line 2821
    move-object/from16 v2, v31

    .line 2822
    .line 2823
    sget-object v5, La/tig0;->a:La/tig0;

    .line 2824
    .line 2825
    if-eq v11, v5, :cond_87

    .line 2826
    .line 2827
    sget-object v5, La/tig0;->e:La/tig0;

    .line 2828
    .line 2829
    if-eq v11, v5, :cond_87

    .line 2830
    .line 2831
    const/4 v5, 0x1

    .line 2832
    goto :goto_3c

    .line 2833
    :cond_87
    const/4 v5, 0x0

    .line 2834
    :goto_3c
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2835
    .line 2836
    .line 2837
    move-result v6

    .line 2838
    if-eqz v5, :cond_88

    .line 2839
    .line 2840
    move v5, v6

    .line 2841
    goto :goto_3d

    .line 2842
    :cond_88
    add-int/lit8 v5, v6, 0x1

    .line 2843
    .line 2844
    :goto_3d
    iget v7, v10, La/qjg0;->c:I

    .line 2845
    .line 2846
    iget v9, v13, La/qjg0;->c:I

    .line 2847
    .line 2848
    iget v11, v8, La/qjg0;->c:I

    .line 2849
    .line 2850
    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    .line 2851
    .line 2852
    .line 2853
    move-result v9

    .line 2854
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    .line 2855
    .line 2856
    .line 2857
    move-result v7

    .line 2858
    filled-new-array {v10, v13, v8}, [La/qjg0;

    .line 2859
    .line 2860
    .line 2861
    move-result-object v8

    .line 2862
    invoke-static {v8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 2863
    .line 2864
    .line 2865
    move-result-object v8

    .line 2866
    new-instance v9, Ljava/util/ArrayList;

    .line 2867
    .line 2868
    const/16 v10, 0xa

    .line 2869
    .line 2870
    invoke-static {v8, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2871
    .line 2872
    .line 2873
    move-result v11

    .line 2874
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 2875
    .line 2876
    .line 2877
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2878
    .line 2879
    .line 2880
    move-result-object v8

    .line 2881
    :goto_3e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2882
    .line 2883
    .line 2884
    move-result v10

    .line 2885
    if-eqz v10, :cond_8a

    .line 2886
    .line 2887
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v10

    .line 2891
    check-cast v10, La/qjg0;

    .line 2892
    .line 2893
    new-instance v11, La/t6n;

    .line 2894
    .line 2895
    sget-object v13, La/d4d;->Q1:La/d4d;

    .line 2896
    .line 2897
    sget-object v14, La/w6n;->g:La/w6n;

    .line 2898
    .line 2899
    new-instance v15, La/c280;

    .line 2900
    .line 2901
    move-object/from16 p1, v8

    .line 2902
    .line 2903
    iget v8, v10, La/qjg0;->a:I

    .line 2904
    .line 2905
    packed-switch v8, :pswitch_data_3

    .line 2906
    .line 2907
    .line 2908
    move-object v8, v12

    .line 2909
    move-object/from16 v16, v8

    .line 2910
    .line 2911
    :goto_3f
    const v12, 0x7f0809ae

    .line 2912
    .line 2913
    .line 2914
    goto :goto_41

    .line 2915
    :pswitch_18
    const-string v8, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Wood/9.png"

    .line 2916
    .line 2917
    :goto_40
    move-object/from16 v16, v12

    .line 2918
    .line 2919
    goto :goto_3f

    .line 2920
    :pswitch_19
    const-string v8, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Wood/8.png"

    .line 2921
    .line 2922
    goto :goto_40

    .line 2923
    :pswitch_1a
    const-string v8, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Wood/7.png"

    .line 2924
    .line 2925
    goto :goto_40

    .line 2926
    :pswitch_1b
    const-string v8, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Wood/6.png"

    .line 2927
    .line 2928
    goto :goto_40

    .line 2929
    :pswitch_1c
    const-string v8, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Wood/5.png"

    .line 2930
    .line 2931
    goto :goto_40

    .line 2932
    :pswitch_1d
    const-string v8, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Wood/4.png"

    .line 2933
    .line 2934
    goto :goto_40

    .line 2935
    :pswitch_1e
    const-string v8, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Wood/3.png"

    .line 2936
    .line 2937
    goto :goto_40

    .line 2938
    :pswitch_1f
    const-string v8, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Wood/2.png"

    .line 2939
    .line 2940
    goto :goto_40

    .line 2941
    :pswitch_20
    const-string v8, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Wood/1.png"

    .line 2942
    .line 2943
    goto :goto_40

    .line 2944
    :goto_41
    invoke-direct {v15, v8, v12}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 2945
    .line 2946
    .line 2947
    invoke-direct {v11, v13, v14, v15}, La/t6n;-><init>(La/d4d;La/w6n;La/c280;)V

    .line 2948
    .line 2949
    .line 2950
    new-instance v30, La/ckg0;

    .line 2951
    .line 2952
    iget v8, v10, La/qjg0;->a:I

    .line 2953
    .line 2954
    iget-object v12, v10, La/qjg0;->b:Ljava/lang/String;

    .line 2955
    .line 2956
    iget v10, v10, La/qjg0;->c:I

    .line 2957
    .line 2958
    if-eqz v10, :cond_89

    .line 2959
    .line 2960
    if-lt v10, v7, :cond_89

    .line 2961
    .line 2962
    const/16 v34, 0x1

    .line 2963
    .line 2964
    goto :goto_42

    .line 2965
    :cond_89
    const/16 v34, 0x0

    .line 2966
    .line 2967
    :goto_42
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2968
    .line 2969
    .line 2970
    move-result-object v10

    .line 2971
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 2972
    .line 2973
    .line 2974
    move-result-object v10

    .line 2975
    const v13, 0x7f130fba

    .line 2976
    .line 2977
    .line 2978
    invoke-virtual {v4, v13, v10}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2979
    .line 2980
    .line 2981
    move-result-object v35

    .line 2982
    move/from16 v31, v8

    .line 2983
    .line 2984
    move-object/from16 v33, v11

    .line 2985
    .line 2986
    move-object/from16 v32, v12

    .line 2987
    .line 2988
    invoke-direct/range {v30 .. v35}, La/ckg0;-><init>(ILjava/lang/String;La/t6n;ZLjava/lang/String;)V

    .line 2989
    .line 2990
    .line 2991
    move-object/from16 v8, v30

    .line 2992
    .line 2993
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2994
    .line 2995
    .line 2996
    move-object/from16 v8, p1

    .line 2997
    .line 2998
    move-object/from16 v12, v16

    .line 2999
    .line 3000
    goto :goto_3e

    .line 3001
    :cond_8a
    move-object/from16 v16, v12

    .line 3002
    .line 3003
    const/4 v10, 0x0

    .line 3004
    invoke-static {v10, v5}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 3005
    .line 3006
    .line 3007
    move-result-object v5

    .line 3008
    new-instance v7, Ljava/util/ArrayList;

    .line 3009
    .line 3010
    const/16 v10, 0xa

    .line 3011
    .line 3012
    invoke-static {v5, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3013
    .line 3014
    .line 3015
    move-result v8

    .line 3016
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 3017
    .line 3018
    .line 3019
    invoke-virtual {v5}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 3020
    .line 3021
    .line 3022
    move-result-object v5

    .line 3023
    :goto_43
    move-object v8, v5

    .line 3024
    check-cast v8, La/kkx;

    .line 3025
    .line 3026
    iget-boolean v8, v8, La/kkx;->c:Z

    .line 3027
    .line 3028
    if-eqz v8, :cond_97

    .line 3029
    .line 3030
    move-object v8, v5

    .line 3031
    check-cast v8, La/bkx;

    .line 3032
    .line 3033
    invoke-virtual {v8}, La/bkx;->nextInt()I

    .line 3034
    .line 3035
    .line 3036
    move-result v8

    .line 3037
    new-instance v10, Lkotlin/ranges/IntRange;

    .line 3038
    .line 3039
    const/4 v11, 0x1

    .line 3040
    const/4 v12, 0x0

    .line 3041
    const/4 v13, 0x2

    .line 3042
    invoke-direct {v10, v12, v13, v11}, Lkotlin/ranges/a;-><init>(III)V

    .line 3043
    .line 3044
    .line 3045
    new-instance v11, Ljava/util/ArrayList;

    .line 3046
    .line 3047
    const/16 v12, 0xa

    .line 3048
    .line 3049
    invoke-static {v10, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3050
    .line 3051
    .line 3052
    move-result v13

    .line 3053
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 3054
    .line 3055
    .line 3056
    invoke-virtual {v10}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 3057
    .line 3058
    .line 3059
    move-result-object v10

    .line 3060
    :goto_44
    move-object v12, v10

    .line 3061
    check-cast v12, La/kkx;

    .line 3062
    .line 3063
    invoke-virtual {v12}, La/kkx;->hasNext()Z

    .line 3064
    .line 3065
    .line 3066
    move-result v12

    .line 3067
    if-eqz v12, :cond_96

    .line 3068
    .line 3069
    move-object v12, v10

    .line 3070
    check-cast v12, La/bkx;

    .line 3071
    .line 3072
    invoke-virtual {v12}, La/bkx;->nextInt()I

    .line 3073
    .line 3074
    .line 3075
    move-result v12

    .line 3076
    const-string v13, "0"

    .line 3077
    .line 3078
    if-ge v8, v6, :cond_95

    .line 3079
    .line 3080
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3081
    .line 3082
    .line 3083
    move-result-object v14

    .line 3084
    check-cast v14, La/xjg0;

    .line 3085
    .line 3086
    if-eqz v12, :cond_8d

    .line 3087
    .line 3088
    const/4 v15, 0x1

    .line 3089
    if-eq v12, v15, :cond_8c

    .line 3090
    .line 3091
    const/4 v15, 0x2

    .line 3092
    if-eq v12, v15, :cond_8b

    .line 3093
    .line 3094
    const/4 v12, 0x0

    .line 3095
    goto :goto_45

    .line 3096
    :cond_8b
    iget-object v12, v14, La/xjg0;->c:La/fkg0;

    .line 3097
    .line 3098
    goto :goto_45

    .line 3099
    :cond_8c
    iget-object v12, v14, La/xjg0;->b:La/fkg0;

    .line 3100
    .line 3101
    goto :goto_45

    .line 3102
    :cond_8d
    iget-object v12, v14, La/xjg0;->a:La/fkg0;

    .line 3103
    .line 3104
    :goto_45
    if-eqz v12, :cond_8e

    .line 3105
    .line 3106
    iget-object v14, v12, La/fkg0;->b:La/ekg0;

    .line 3107
    .line 3108
    goto :goto_46

    .line 3109
    :cond_8e
    const/4 v14, 0x0

    .line 3110
    :goto_46
    sget-object v15, La/ekg0;->c:La/ekg0;

    .line 3111
    .line 3112
    if-ne v14, v15, :cond_8f

    .line 3113
    .line 3114
    const/4 v14, 0x1

    .line 3115
    goto :goto_47

    .line 3116
    :cond_8f
    const/4 v14, 0x0

    .line 3117
    :goto_47
    new-instance v15, La/kkg0;

    .line 3118
    .line 3119
    move-object/from16 v18, v3

    .line 3120
    .line 3121
    new-instance v3, La/n0x;

    .line 3122
    .line 3123
    if-eqz v12, :cond_90

    .line 3124
    .line 3125
    iget-object v12, v12, La/fkg0;->a:La/lig0;

    .line 3126
    .line 3127
    goto :goto_48

    .line 3128
    :cond_90
    sget-object v12, La/lig0;->d:La/lig0;

    .line 3129
    .line 3130
    :goto_48
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 3131
    .line 3132
    .line 3133
    move-result v12

    .line 3134
    move-object/from16 p1, v5

    .line 3135
    .line 3136
    if-eqz v12, :cond_93

    .line 3137
    .line 3138
    const/4 v5, 0x1

    .line 3139
    if-eq v12, v5, :cond_92

    .line 3140
    .line 3141
    const/4 v5, 0x2

    .line 3142
    if-eq v12, v5, :cond_91

    .line 3143
    .line 3144
    move-object/from16 v5, v16

    .line 3145
    .line 3146
    goto :goto_49

    .line 3147
    :cond_91
    const-string v5, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Scissors.png"

    .line 3148
    .line 3149
    goto :goto_49

    .line 3150
    :cond_92
    const-string v5, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Paper.png"

    .line 3151
    .line 3152
    goto :goto_49

    .line 3153
    :cond_93
    const-string v5, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Stone.png"

    .line 3154
    .line 3155
    :goto_49
    invoke-direct {v3, v5}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 3156
    .line 3157
    .line 3158
    if-eqz v14, :cond_94

    .line 3159
    .line 3160
    const-string v13, "+1"

    .line 3161
    .line 3162
    :cond_94
    invoke-direct {v15, v3, v13, v14}, La/kkg0;-><init>(La/o0x;Ljava/lang/String;Z)V

    .line 3163
    .line 3164
    .line 3165
    const/4 v12, 0x6

    .line 3166
    goto :goto_4a

    .line 3167
    :cond_95
    move-object/from16 v18, v3

    .line 3168
    .line 3169
    move-object/from16 p1, v5

    .line 3170
    .line 3171
    new-instance v15, La/kkg0;

    .line 3172
    .line 3173
    new-instance v3, La/m0x;

    .line 3174
    .line 3175
    const v5, 0x7f0805c0

    .line 3176
    .line 3177
    .line 3178
    const/4 v12, 0x6

    .line 3179
    const/4 v14, 0x0

    .line 3180
    invoke-direct {v3, v5, v14, v12}, La/m0x;-><init>(ILa/bzw;I)V

    .line 3181
    .line 3182
    .line 3183
    const/4 v5, 0x0

    .line 3184
    invoke-direct {v15, v3, v13, v5}, La/kkg0;-><init>(La/o0x;Ljava/lang/String;Z)V

    .line 3185
    .line 3186
    .line 3187
    :goto_4a
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3188
    .line 3189
    .line 3190
    move-object/from16 v5, p1

    .line 3191
    .line 3192
    move-object/from16 v3, v18

    .line 3193
    .line 3194
    goto/16 :goto_44

    .line 3195
    .line 3196
    :cond_96
    move-object/from16 v18, v3

    .line 3197
    .line 3198
    move-object/from16 p1, v5

    .line 3199
    .line 3200
    const/4 v12, 0x6

    .line 3201
    invoke-static {v11}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 3202
    .line 3203
    .line 3204
    move-result-object v3

    .line 3205
    new-instance v5, La/bkg0;

    .line 3206
    .line 3207
    add-int/lit8 v8, v8, 0x1

    .line 3208
    .line 3209
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3210
    .line 3211
    .line 3212
    move-result-object v8

    .line 3213
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 3214
    .line 3215
    .line 3216
    move-result-object v8

    .line 3217
    const v10, 0x7f13146b

    .line 3218
    .line 3219
    .line 3220
    invoke-virtual {v4, v10, v8}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3221
    .line 3222
    .line 3223
    move-result-object v8

    .line 3224
    invoke-direct {v5, v3, v8}, La/bkg0;-><init>(La/a4x;Ljava/lang/String;)V

    .line 3225
    .line 3226
    .line 3227
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3228
    .line 3229
    .line 3230
    move-object/from16 v5, p1

    .line 3231
    .line 3232
    move-object/from16 v3, v18

    .line 3233
    .line 3234
    goto/16 :goto_43

    .line 3235
    .line 3236
    :cond_97
    new-instance v3, La/dkg0;

    .line 3237
    .line 3238
    const/4 v10, 0x0

    .line 3239
    new-array v5, v10, [Ljava/lang/Object;

    .line 3240
    .line 3241
    const v6, 0x7f130f92

    .line 3242
    .line 3243
    .line 3244
    invoke-virtual {v4, v6, v5}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3245
    .line 3246
    .line 3247
    move-result-object v4

    .line 3248
    invoke-static {v9}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 3249
    .line 3250
    .line 3251
    move-result-object v5

    .line 3252
    invoke-static {v7}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 3253
    .line 3254
    .line 3255
    move-result-object v6

    .line 3256
    invoke-direct {v3, v4, v5, v6}, La/dkg0;-><init>(Ljava/lang/String;La/a4x;La/a4x;)V

    .line 3257
    .line 3258
    .line 3259
    invoke-direct {v0, v2, v3}, La/ajg0;-><init>(La/mkg0;La/dkg0;)V

    .line 3260
    .line 3261
    .line 3262
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3263
    .line 3264
    .line 3265
    goto/16 :goto_58

    .line 3266
    .line 3267
    :cond_98
    move-object/from16 v16, v12

    .line 3268
    .line 3269
    instance-of v0, v8, La/tlk0;

    .line 3270
    .line 3271
    if-eqz v0, :cond_b3

    .line 3272
    .line 3273
    check-cast v8, La/tlk0;

    .line 3274
    .line 3275
    iget-object v0, v8, La/tlk0;->a:Ljava/util/List;

    .line 3276
    .line 3277
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 3278
    .line 3279
    .line 3280
    move-result v2

    .line 3281
    if-eqz v2, :cond_99

    .line 3282
    .line 3283
    goto/16 :goto_58

    .line 3284
    .line 3285
    :cond_99
    new-instance v2, La/cmk0;

    .line 3286
    .line 3287
    sget-object v6, La/uam;->a:La/uam;

    .line 3288
    .line 3289
    sget-object v7, La/uam;->b:La/uam;

    .line 3290
    .line 3291
    filled-new-array {v6, v7}, [La/uam;

    .line 3292
    .line 3293
    .line 3294
    move-result-object v6

    .line 3295
    invoke-static {v6}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 3296
    .line 3297
    .line 3298
    move-result-object v6

    .line 3299
    new-instance v7, Ljava/util/ArrayList;

    .line 3300
    .line 3301
    const/16 v10, 0xa

    .line 3302
    .line 3303
    invoke-static {v0, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3304
    .line 3305
    .line 3306
    move-result v8

    .line 3307
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 3308
    .line 3309
    .line 3310
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3311
    .line 3312
    .line 3313
    move-result-object v8

    .line 3314
    :goto_4b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 3315
    .line 3316
    .line 3317
    move-result v9

    .line 3318
    if-eqz v9, :cond_b1

    .line 3319
    .line 3320
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3321
    .line 3322
    .line 3323
    move-result-object v9

    .line 3324
    check-cast v9, La/xlk0;

    .line 3325
    .line 3326
    new-instance v29, La/vam;

    .line 3327
    .line 3328
    iget v10, v9, La/xlk0;->a:I

    .line 3329
    .line 3330
    iget-object v12, v9, La/xlk0;->c:Ljava/lang/String;

    .line 3331
    .line 3332
    iget-object v13, v9, La/xlk0;->d:La/bmk0;

    .line 3333
    .line 3334
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 3335
    .line 3336
    .line 3337
    move-result-object v30

    .line 3338
    invoke-static {v12}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 3339
    .line 3340
    .line 3341
    move-result-object v10

    .line 3342
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 3343
    .line 3344
    .line 3345
    move-result-object v10

    .line 3346
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 3347
    .line 3348
    .line 3349
    move-result v24

    .line 3350
    if-nez v24, :cond_9b

    .line 3351
    .line 3352
    move-object/from16 v35, v0

    .line 3353
    .line 3354
    move-object/from16 v24, v3

    .line 3355
    .line 3356
    :goto_4c
    move-object/from16 p0, v8

    .line 3357
    .line 3358
    :cond_9a
    const/4 v0, 0x0

    .line 3359
    goto/16 :goto_50

    .line 3360
    .line 3361
    :cond_9b
    invoke-static/range {v18 .. v18}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 3362
    .line 3363
    .line 3364
    move-result-object v24

    .line 3365
    move-object/from16 v35, v0

    .line 3366
    .line 3367
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 3368
    .line 3369
    .line 3370
    move-result-object v0

    .line 3371
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3372
    .line 3373
    .line 3374
    move-result v0

    .line 3375
    if-eqz v0, :cond_9c

    .line 3376
    .line 3377
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 3378
    .line 3379
    :goto_4d
    move-object/from16 v24, v3

    .line 3380
    .line 3381
    move-object/from16 p0, v8

    .line 3382
    .line 3383
    goto/16 :goto_50

    .line 3384
    .line 3385
    :cond_9c
    invoke-static {v11}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 3386
    .line 3387
    .line 3388
    move-result-object v0

    .line 3389
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 3390
    .line 3391
    .line 3392
    move-result-object v0

    .line 3393
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3394
    .line 3395
    .line 3396
    move-result v0

    .line 3397
    if-eqz v0, :cond_9d

    .line 3398
    .line 3399
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3400
    .line 3401
    goto :goto_4d

    .line 3402
    :cond_9d
    iget-object v0, v3, La/qqs;->o:La/oqs;

    .line 3403
    .line 3404
    move-object/from16 v24, v3

    .line 3405
    .line 3406
    iget v3, v0, La/oqs;->a:I

    .line 3407
    .line 3408
    iget v0, v0, La/oqs;->b:I

    .line 3409
    .line 3410
    if-ne v3, v0, :cond_9e

    .line 3411
    .line 3412
    goto :goto_4c

    .line 3413
    :cond_9e
    invoke-interface/range {v35 .. v35}, Ljava/util/Collection;->isEmpty()Z

    .line 3414
    .line 3415
    .line 3416
    move-result v31

    .line 3417
    if-eqz v31, :cond_9f

    .line 3418
    .line 3419
    move-object/from16 p0, v8

    .line 3420
    .line 3421
    const/4 v8, 0x0

    .line 3422
    goto :goto_4f

    .line 3423
    :cond_9f
    invoke-interface/range {v35 .. v35}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3424
    .line 3425
    .line 3426
    move-result-object v31

    .line 3427
    const/16 v32, 0x0

    .line 3428
    .line 3429
    :goto_4e
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    .line 3430
    .line 3431
    .line 3432
    move-result v33

    .line 3433
    if-eqz v33, :cond_a2

    .line 3434
    .line 3435
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3436
    .line 3437
    .line 3438
    move-result-object v33

    .line 3439
    move-object/from16 p0, v8

    .line 3440
    .line 3441
    move-object/from16 v8, v33

    .line 3442
    .line 3443
    check-cast v8, La/xlk0;

    .line 3444
    .line 3445
    iget-object v8, v8, La/xlk0;->c:Ljava/lang/String;

    .line 3446
    .line 3447
    invoke-static {v8}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 3448
    .line 3449
    .line 3450
    move-result-object v8

    .line 3451
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 3452
    .line 3453
    .line 3454
    move-result-object v8

    .line 3455
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3456
    .line 3457
    .line 3458
    move-result v8

    .line 3459
    if-eqz v8, :cond_a0

    .line 3460
    .line 3461
    add-int/lit8 v32, v32, 0x1

    .line 3462
    .line 3463
    if-ltz v32, :cond_a1

    .line 3464
    .line 3465
    :cond_a0
    move-object/from16 v8, p0

    .line 3466
    .line 3467
    goto :goto_4e

    .line 3468
    :cond_a1
    invoke-static {}, La/q3d;->o()V

    .line 3469
    .line 3470
    .line 3471
    const/16 v17, 0x0

    .line 3472
    .line 3473
    throw v17

    .line 3474
    :cond_a2
    move-object/from16 p0, v8

    .line 3475
    .line 3476
    move/from16 v8, v32

    .line 3477
    .line 3478
    :goto_4f
    if-ne v8, v3, :cond_a3

    .line 3479
    .line 3480
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 3481
    .line 3482
    goto :goto_50

    .line 3483
    :cond_a3
    if-ne v8, v0, :cond_9a

    .line 3484
    .line 3485
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3486
    .line 3487
    :goto_50
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 3488
    .line 3489
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3490
    .line 3491
    .line 3492
    move-result v8

    .line 3493
    if-eqz v8, :cond_a4

    .line 3494
    .line 3495
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 3496
    .line 3497
    .line 3498
    move-result-object v8

    .line 3499
    check-cast v8, Ljava/lang/String;

    .line 3500
    .line 3501
    goto :goto_51

    .line 3502
    :cond_a4
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3503
    .line 3504
    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3505
    .line 3506
    .line 3507
    move-result v8

    .line 3508
    if-eqz v8, :cond_a5

    .line 3509
    .line 3510
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 3511
    .line 3512
    .line 3513
    move-result-object v8

    .line 3514
    check-cast v8, Ljava/lang/String;

    .line 3515
    .line 3516
    goto :goto_51

    .line 3517
    :cond_a5
    if-nez v0, :cond_b0

    .line 3518
    .line 3519
    const/4 v8, 0x0

    .line 3520
    :goto_51
    if-nez v8, :cond_a6

    .line 3521
    .line 3522
    move-object/from16 v8, v16

    .line 3523
    .line 3524
    :cond_a6
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3525
    .line 3526
    .line 3527
    move-result v10

    .line 3528
    if-eqz v10, :cond_a7

    .line 3529
    .line 3530
    iget-object v0, v5, La/m9s;->c:Ljava/util/List;

    .line 3531
    .line 3532
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 3533
    .line 3534
    .line 3535
    move-result-object v0

    .line 3536
    check-cast v0, Ljava/lang/Long;

    .line 3537
    .line 3538
    goto :goto_52

    .line 3539
    :cond_a7
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3540
    .line 3541
    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3542
    .line 3543
    .line 3544
    move-result v10

    .line 3545
    if-eqz v10, :cond_a8

    .line 3546
    .line 3547
    iget-object v0, v5, La/m9s;->d:Ljava/util/List;

    .line 3548
    .line 3549
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 3550
    .line 3551
    .line 3552
    move-result-object v0

    .line 3553
    check-cast v0, Ljava/lang/Long;

    .line 3554
    .line 3555
    goto :goto_52

    .line 3556
    :cond_a8
    if-nez v0, :cond_af

    .line 3557
    .line 3558
    const/4 v0, 0x0

    .line 3559
    :goto_52
    if-eqz v0, :cond_a9

    .line 3560
    .line 3561
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 3562
    .line 3563
    .line 3564
    move-result-wide v31

    .line 3565
    move-object/from16 v36, v11

    .line 3566
    .line 3567
    move-wide/from16 v10, v31

    .line 3568
    .line 3569
    goto :goto_53

    .line 3570
    :cond_a9
    move-object/from16 v36, v11

    .line 3571
    .line 3572
    move-wide/from16 v10, v25

    .line 3573
    .line 3574
    :goto_53
    new-instance v0, La/r2m;

    .line 3575
    .line 3576
    move-object/from16 v37, v5

    .line 3577
    .line 3578
    new-instance v5, La/u6n;

    .line 3579
    .line 3580
    move-object/from16 v38, v14

    .line 3581
    .line 3582
    sget-object v14, La/d4d;->Q1:La/d4d;

    .line 3583
    .line 3584
    move-object/from16 v39, v15

    .line 3585
    .line 3586
    sget-object v15, La/w6n;->k:La/w6n;

    .line 3587
    .line 3588
    move-object/from16 v40, v1

    .line 3589
    .line 3590
    new-instance v1, La/c280;

    .line 3591
    .line 3592
    invoke-static {v10, v11, v8}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 3593
    .line 3594
    .line 3595
    move-result-object v8

    .line 3596
    const v10, 0x7f0809ae

    .line 3597
    .line 3598
    .line 3599
    invoke-direct {v1, v8, v10}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 3600
    .line 3601
    .line 3602
    invoke-direct {v5, v14, v15, v1}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 3603
    .line 3604
    .line 3605
    const/4 v14, 0x0

    .line 3606
    invoke-direct {v0, v12, v5, v14, v14}, La/r2m;-><init>(Ljava/lang/String;La/v6n;La/y3d;La/y3d;)V

    .line 3607
    .line 3608
    .line 3609
    iget-wide v8, v9, La/xlk0;->b:J

    .line 3610
    .line 3611
    sget-object v1, La/rdj;->a:La/rdj;

    .line 3612
    .line 3613
    sget-object v1, La/ykq0;->e:La/ykq0;

    .line 3614
    .line 3615
    new-instance v5, La/znq0;

    .line 3616
    .line 3617
    invoke-direct {v5, v8, v9}, La/znq0;-><init>(J)V

    .line 3618
    .line 3619
    .line 3620
    const/16 v8, 0xe8

    .line 3621
    .line 3622
    invoke-static {v5, v1, v3, v14, v8}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 3623
    .line 3624
    .line 3625
    move-result-object v1

    .line 3626
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 3627
    .line 3628
    .line 3629
    move-result v3

    .line 3630
    if-eqz v3, :cond_ad

    .line 3631
    .line 3632
    const/4 v15, 0x1

    .line 3633
    if-eq v3, v15, :cond_ac

    .line 3634
    .line 3635
    const/4 v5, 0x2

    .line 3636
    if-eq v3, v5, :cond_ab

    .line 3637
    .line 3638
    const/4 v9, 0x3

    .line 3639
    if-ne v3, v9, :cond_aa

    .line 3640
    .line 3641
    move-object/from16 v11, v16

    .line 3642
    .line 3643
    const v3, 0x7f130861

    .line 3644
    .line 3645
    .line 3646
    const v5, 0x7f1315b4

    .line 3647
    .line 3648
    .line 3649
    const v14, 0x7f130aa3

    .line 3650
    .line 3651
    .line 3652
    goto :goto_54

    .line 3653
    :cond_aa
    invoke-static {}, La/t9f;->b()V

    .line 3654
    .line 3655
    .line 3656
    return-object v14

    .line 3657
    :cond_ab
    const/4 v3, 0x0

    .line 3658
    const/4 v9, 0x3

    .line 3659
    new-array v11, v3, [Ljava/lang/Object;

    .line 3660
    .line 3661
    const v14, 0x7f130aa3

    .line 3662
    .line 3663
    .line 3664
    invoke-virtual {v4, v14, v11}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3665
    .line 3666
    .line 3667
    move-result-object v11

    .line 3668
    const v3, 0x7f130861

    .line 3669
    .line 3670
    .line 3671
    const v5, 0x7f1315b4

    .line 3672
    .line 3673
    .line 3674
    goto :goto_54

    .line 3675
    :cond_ac
    const/4 v3, 0x0

    .line 3676
    const/4 v5, 0x2

    .line 3677
    const/4 v9, 0x3

    .line 3678
    const v14, 0x7f130aa3

    .line 3679
    .line 3680
    .line 3681
    new-array v11, v3, [Ljava/lang/Object;

    .line 3682
    .line 3683
    const v5, 0x7f1315b4

    .line 3684
    .line 3685
    .line 3686
    invoke-virtual {v4, v5, v11}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3687
    .line 3688
    .line 3689
    move-result-object v11

    .line 3690
    const v3, 0x7f130861

    .line 3691
    .line 3692
    .line 3693
    goto :goto_54

    .line 3694
    :cond_ad
    const/4 v3, 0x0

    .line 3695
    const v5, 0x7f1315b4

    .line 3696
    .line 3697
    .line 3698
    const/4 v9, 0x3

    .line 3699
    const v14, 0x7f130aa3

    .line 3700
    .line 3701
    .line 3702
    const/4 v15, 0x1

    .line 3703
    new-array v11, v3, [Ljava/lang/Object;

    .line 3704
    .line 3705
    const v3, 0x7f130861

    .line 3706
    .line 3707
    .line 3708
    invoke-virtual {v4, v3, v11}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3709
    .line 3710
    .line 3711
    move-result-object v11

    .line 3712
    :goto_54
    filled-new-array {v1, v11}, [Ljava/lang/String;

    .line 3713
    .line 3714
    .line 3715
    move-result-object v1

    .line 3716
    invoke-static {v1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 3717
    .line 3718
    .line 3719
    move-result-object v33

    .line 3720
    sget-object v1, La/bmk0;->a:La/bmk0;

    .line 3721
    .line 3722
    if-ne v13, v1, :cond_ae

    .line 3723
    .line 3724
    move/from16 v34, v15

    .line 3725
    .line 3726
    :goto_55
    move-object/from16 v31, v0

    .line 3727
    .line 3728
    move-object/from16 v32, v12

    .line 3729
    .line 3730
    goto :goto_56

    .line 3731
    :cond_ae
    const/16 v34, 0x0

    .line 3732
    .line 3733
    goto :goto_55

    .line 3734
    :goto_56
    invoke-direct/range {v29 .. v34}, La/vam;-><init>(Ljava/lang/String;La/r2m;Ljava/lang/String;La/i4;Z)V

    .line 3735
    .line 3736
    .line 3737
    move-object/from16 v0, v29

    .line 3738
    .line 3739
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3740
    .line 3741
    .line 3742
    move-object/from16 v8, p0

    .line 3743
    .line 3744
    move-object/from16 v3, v24

    .line 3745
    .line 3746
    move-object/from16 v0, v35

    .line 3747
    .line 3748
    move-object/from16 v11, v36

    .line 3749
    .line 3750
    move-object/from16 v5, v37

    .line 3751
    .line 3752
    move-object/from16 v14, v38

    .line 3753
    .line 3754
    move-object/from16 v15, v39

    .line 3755
    .line 3756
    move-object/from16 v1, v40

    .line 3757
    .line 3758
    goto/16 :goto_4b

    .line 3759
    .line 3760
    :cond_af
    invoke-static {}, La/t9f;->b()V

    .line 3761
    .line 3762
    .line 3763
    const/16 v17, 0x0

    .line 3764
    .line 3765
    return-object v17

    .line 3766
    :cond_b0
    const/16 v17, 0x0

    .line 3767
    .line 3768
    invoke-static {}, La/t9f;->b()V

    .line 3769
    .line 3770
    .line 3771
    return-object v17

    .line 3772
    :cond_b1
    move-object/from16 v40, v1

    .line 3773
    .line 3774
    invoke-static {v7}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 3775
    .line 3776
    .line 3777
    move-result-object v0

    .line 3778
    new-instance v1, La/wam;

    .line 3779
    .line 3780
    invoke-direct {v1, v6, v0}, La/wam;-><init>(La/i4;La/a4x;)V

    .line 3781
    .line 3782
    .line 3783
    invoke-direct {v2, v1}, La/cmk0;-><init>(La/wam;)V

    .line 3784
    .line 3785
    .line 3786
    move-object/from16 v1, v40

    .line 3787
    .line 3788
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3789
    .line 3790
    .line 3791
    goto :goto_58

    .line 3792
    :cond_b2
    :goto_57
    move-object v1, v5

    .line 3793
    :cond_b3
    :goto_58
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3794
    .line 3795
    .line 3796
    move-result-object v0

    .line 3797
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3798
    .line 3799
    .line 3800
    move-result-object v0

    .line 3801
    return-object v0

    .line 3802
    :cond_b4
    sget-object v0, La/lak0;->c:La/lak0;

    .line 3803
    .line 3804
    return-object v0

    .line 3805
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 3806
    .line 3807
    .line 3808
    .line 3809
    .line 3810
    .line 3811
    .line 3812
    .line 3813
    .line 3814
    .line 3815
    .line 3816
    .line 3817
    .line 3818
    .line 3819
    .line 3820
    .line 3821
    .line 3822
    .line 3823
    .line 3824
    .line 3825
    .line 3826
    .line 3827
    .line 3828
    .line 3829
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 3830
    .line 3831
    .line 3832
    .line 3833
    .line 3834
    .line 3835
    .line 3836
    .line 3837
    .line 3838
    .line 3839
    .line 3840
    .line 3841
    .line 3842
    .line 3843
    .line 3844
    .line 3845
    .line 3846
    .line 3847
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch

    .line 3848
    .line 3849
    .line 3850
    .line 3851
    .line 3852
    .line 3853
    .line 3854
    .line 3855
    .line 3856
    .line 3857
    .line 3858
    .line 3859
    .line 3860
    .line 3861
    .line 3862
    .line 3863
    .line 3864
    .line 3865
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
    .end packed-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u6o;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/u6o;->b:La/v6o;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v3, La/v6o;->B:La/n0o0;

    .line 12
    .line 13
    iget-object v1, v3, La/v6o;->D:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/l6o;

    .line 16
    .line 17
    iget-object v4, v3, La/v6o;->c:La/g2v;

    .line 18
    .line 19
    move-object/from16 v5, p1

    .line 20
    .line 21
    check-cast v5, La/fee;

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, La/jlr;

    .line 31
    .line 32
    if-eqz v5, :cond_7

    .line 33
    .line 34
    instance-of v6, v5, La/xkr;

    .line 35
    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    iget-object v2, v3, La/v6o;->r:La/n0o0;

    .line 39
    .line 40
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, La/fee;

    .line 45
    .line 46
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-nez v2, :cond_0

    .line 51
    .line 52
    iget-object v0, v1, La/l6o;->a:Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 53
    .line 54
    iget-wide v1, v0, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->d:J

    .line 55
    .line 56
    iget-wide v5, v0, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->e:J

    .line 57
    .line 58
    invoke-static {v1, v2, v5, v6}, La/ozb;->O(JJ)La/pb10;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    sget-object v7, La/ldm;->b:La/ldm;

    .line 63
    .line 64
    const-wide/16 v15, 0x0

    .line 65
    .line 66
    const/16 v17, 0x3fa

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v8, 0x0

    .line 70
    const/4 v9, 0x0

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v12, 0x0

    .line 74
    const-wide/16 v13, 0x0

    .line 75
    .line 76
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-instance v2, La/nss;

    .line 81
    .line 82
    invoke-direct {v2, v0}, La/nss;-><init>(La/mdm;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_0
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/fee;

    .line 92
    .line 93
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v2, La/pss;

    .line 99
    .line 100
    invoke-direct {v2, v0}, La/pss;-><init>(La/l7m0;)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :cond_1
    instance-of v6, v5, La/alr;

    .line 106
    .line 107
    if-eqz v6, :cond_2

    .line 108
    .line 109
    new-instance v2, La/lss;

    .line 110
    .line 111
    iget-object v0, v1, La/l6o;->a:Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 112
    .line 113
    iget-wide v5, v0, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->d:J

    .line 114
    .line 115
    iget-wide v0, v0, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->e:J

    .line 116
    .line 117
    invoke-static {v5, v6, v0, v1}, La/ozb;->N(JJ)La/pb10;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    sget-object v7, La/ldm;->b:La/ldm;

    .line 122
    .line 123
    const-wide/16 v15, 0x0

    .line 124
    .line 125
    const/16 v17, 0x25a

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    const/4 v8, 0x0

    .line 129
    const/4 v9, 0x0

    .line 130
    const v10, 0x7f130677

    .line 131
    .line 132
    .line 133
    const/4 v11, 0x0

    .line 134
    const v12, 0x7f131690

    .line 135
    .line 136
    .line 137
    const-wide/16 v13, 0x2710

    .line 138
    .line 139
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iget-object v1, v3, La/v6o;->t:La/n0o0;

    .line 144
    .line 145
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, La/fee;

    .line 150
    .line 151
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, La/da10;

    .line 156
    .line 157
    iget-short v1, v1, La/da10;->a:S

    .line 158
    .line 159
    int-to-long v3, v1

    .line 160
    invoke-direct {v2, v3, v4, v0}, La/lss;-><init>(JLa/mdm;)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_1

    .line 164
    .line 165
    :cond_2
    instance-of v3, v5, La/blr;

    .line 166
    .line 167
    if-eqz v3, :cond_3

    .line 168
    .line 169
    new-instance v0, La/pdq;

    .line 170
    .line 171
    iget-object v1, v1, La/l6o;->a:Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 172
    .line 173
    iget-wide v2, v1, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->d:J

    .line 174
    .line 175
    iget-wide v6, v1, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->e:J

    .line 176
    .line 177
    invoke-static {v2, v3, v6, v7}, La/ozb;->N(JJ)La/pb10;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const-wide/16 v15, 0x0

    .line 182
    .line 183
    const/16 v17, 0x3fe

    .line 184
    .line 185
    const/4 v6, 0x0

    .line 186
    const/4 v7, 0x0

    .line 187
    const/4 v8, 0x0

    .line 188
    const/4 v9, 0x0

    .line 189
    const/4 v10, 0x0

    .line 190
    const/4 v11, 0x0

    .line 191
    const/4 v12, 0x0

    .line 192
    const-wide/16 v13, 0x0

    .line 193
    .line 194
    move-object v3, v5

    .line 195
    move-object v5, v1

    .line 196
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    move-object v5, v3

    .line 201
    check-cast v5, La/blr;

    .line 202
    .line 203
    iget-wide v2, v5, La/blr;->c:J

    .line 204
    .line 205
    const v4, 0x7f13168b

    .line 206
    .line 207
    .line 208
    invoke-direct {v0, v1, v2, v3, v4}, La/pdq;-><init>(La/mdm;JI)V

    .line 209
    .line 210
    .line 211
    new-instance v2, La/mss;

    .line 212
    .line 213
    invoke-direct {v2, v0}, La/mss;-><init>(La/pdq;)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_1

    .line 217
    .line 218
    :cond_3
    move-object v3, v5

    .line 219
    nop

    .line 220
    instance-of v5, v3, La/clr;

    .line 221
    .line 222
    if-eqz v5, :cond_4

    .line 223
    .line 224
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, La/fee;

    .line 229
    .line 230
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    new-instance v2, La/pss;

    .line 236
    .line 237
    invoke-direct {v2, v0}, La/pss;-><init>(La/l7m0;)V

    .line 238
    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_4
    instance-of v0, v3, La/dlr;

    .line 242
    .line 243
    if-eqz v0, :cond_5

    .line 244
    .line 245
    goto :goto_0

    .line 246
    :cond_5
    instance-of v0, v3, La/ilr;

    .line 247
    .line 248
    if-eqz v0, :cond_6

    .line 249
    .line 250
    :goto_0
    iget-object v0, v1, La/l6o;->a:Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 251
    .line 252
    iget-wide v1, v0, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->d:J

    .line 253
    .line 254
    iget-wide v5, v0, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->e:J

    .line 255
    .line 256
    invoke-static {v1, v2, v5, v6}, La/ozb;->O(JJ)La/pb10;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    sget-object v7, La/ldm;->b:La/ldm;

    .line 261
    .line 262
    const-wide/16 v15, 0x0

    .line 263
    .line 264
    const/16 v17, 0x3fa

    .line 265
    .line 266
    const/4 v6, 0x0

    .line 267
    const/4 v8, 0x0

    .line 268
    const/4 v9, 0x0

    .line 269
    const/4 v10, 0x0

    .line 270
    const/4 v11, 0x0

    .line 271
    const/4 v12, 0x0

    .line 272
    const-wide/16 v13, 0x0

    .line 273
    .line 274
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    new-instance v2, La/nss;

    .line 279
    .line 280
    invoke-direct {v2, v0}, La/nss;-><init>(La/mdm;)V

    .line 281
    .line 282
    .line 283
    goto :goto_1

    .line 284
    :cond_6
    instance-of v0, v3, La/elr;

    .line 285
    .line 286
    if-eqz v0, :cond_7

    .line 287
    .line 288
    iget-object v0, v1, La/l6o;->a:Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 289
    .line 290
    iget-wide v1, v0, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->d:J

    .line 291
    .line 292
    iget-wide v5, v0, Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;->e:J

    .line 293
    .line 294
    invoke-static {v1, v2, v5, v6}, La/ozb;->N(JJ)La/pb10;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    sget-object v7, La/ldm;->b:La/ldm;

    .line 299
    .line 300
    const-wide/16 v15, 0x0

    .line 301
    .line 302
    const/16 v17, 0x35a

    .line 303
    .line 304
    const/4 v6, 0x0

    .line 305
    const/4 v8, 0x0

    .line 306
    const/4 v9, 0x0

    .line 307
    const v10, 0x7f130922

    .line 308
    .line 309
    .line 310
    const/4 v11, 0x0

    .line 311
    const v12, 0x7f130987

    .line 312
    .line 313
    .line 314
    const-wide/16 v13, 0x0

    .line 315
    .line 316
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    new-instance v2, La/oss;

    .line 321
    .line 322
    invoke-direct {v2, v0}, La/oss;-><init>(La/mdm;)V

    .line 323
    .line 324
    .line 325
    goto :goto_1

    .line 326
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 327
    .line 328
    .line 329
    :goto_1
    return-object v2

    .line 330
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/u6o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    return-object v0

    .line 335
    :pswitch_1
    move-object/from16 v0, p1

    .line 336
    .line 337
    check-cast v0, La/fee;

    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    iget-object v0, v3, La/v6o;->s:La/n0o0;

    .line 343
    .line 344
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    check-cast v0, La/fee;

    .line 349
    .line 350
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    check-cast v0, La/szj0;

    .line 355
    .line 356
    iget-object v1, v3, La/v6o;->D:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v1, La/l6o;

    .line 359
    .line 360
    iget-object v1, v1, La/l6o;->p:La/sff0;

    .line 361
    .line 362
    iget-boolean v1, v1, La/sff0;->K1:Z

    .line 363
    .line 364
    iget-object v2, v3, La/v6o;->b:La/ctf0;

    .line 365
    .line 366
    invoke-static {v0, v1, v2}, La/pzw;->W(La/szj0;ZLa/ctf0;)La/sam;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    return-object v0

    .line 371
    :pswitch_2
    move-object/from16 v0, p1

    .line 372
    .line 373
    check-cast v0, La/fee;

    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    move-object v4, v0

    .line 383
    check-cast v4, La/jlr;

    .line 384
    .line 385
    iget-object v0, v3, La/v6o;->k:La/n0o0;

    .line 386
    .line 387
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    check-cast v0, La/fee;

    .line 392
    .line 393
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    check-cast v0, Ljava/lang/Boolean;

    .line 398
    .line 399
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 400
    .line 401
    .line 402
    move-result v5

    .line 403
    iget-object v0, v3, La/v6o;->D:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v0, La/l6o;

    .line 406
    .line 407
    iget-object v1, v0, La/l6o;->p:La/sff0;

    .line 408
    .line 409
    iget-boolean v6, v1, La/sff0;->J:Z

    .line 410
    .line 411
    iget-object v1, v3, La/v6o;->n:La/n0o0;

    .line 412
    .line 413
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    check-cast v1, La/fee;

    .line 418
    .line 419
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    check-cast v1, Ljava/lang/Boolean;

    .line 424
    .line 425
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 426
    .line 427
    .line 428
    move-result v7

    .line 429
    iget-object v1, v3, La/v6o;->o:La/n0o0;

    .line 430
    .line 431
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    check-cast v1, La/fee;

    .line 436
    .line 437
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    check-cast v1, Ljava/lang/Boolean;

    .line 442
    .line 443
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 444
    .line 445
    .line 446
    move-result v8

    .line 447
    iget-boolean v9, v0, La/l6o;->s:Z

    .line 448
    .line 449
    iget-object v0, v3, La/v6o;->p:La/n0o0;

    .line 450
    .line 451
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    check-cast v0, La/fee;

    .line 456
    .line 457
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    move-object v10, v0

    .line 462
    check-cast v10, La/yws;

    .line 463
    .line 464
    invoke-static/range {v4 .. v10}, La/ulb;->j0(La/jlr;ZZZZZLa/yws;)La/its;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    return-object v0

    .line 469
    :pswitch_3
    iget-object v0, v3, La/v6o;->r:La/n0o0;

    .line 470
    .line 471
    move-object/from16 v1, p1

    .line 472
    .line 473
    check-cast v1, La/fee;

    .line 474
    .line 475
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    check-cast v1, La/jlr;

    .line 483
    .line 484
    invoke-static {v1}, La/d5c;->C(La/jlr;)La/m9s;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    iget-object v1, v3, La/v6o;->f:La/n0o0;

    .line 489
    .line 490
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    check-cast v1, La/fee;

    .line 495
    .line 496
    iget-object v5, v3, La/v6o;->D:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast v5, La/l6o;

    .line 499
    .line 500
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    check-cast v1, Ljava/lang/Boolean;

    .line 505
    .line 506
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    iget-object v7, v3, La/v6o;->b:La/ctf0;

    .line 511
    .line 512
    if-eqz v4, :cond_9

    .line 513
    .line 514
    iget-object v6, v4, La/m9s;->h:La/qqs;

    .line 515
    .line 516
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v8

    .line 520
    check-cast v8, La/fee;

    .line 521
    .line 522
    invoke-virtual {v8}, La/fee;->c()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v8

    .line 526
    check-cast v8, La/tdt0;

    .line 527
    .line 528
    if-eqz v8, :cond_8

    .line 529
    .line 530
    sget-object v8, La/mc6;->b:La/yk5;

    .line 531
    .line 532
    iget v9, v6, La/qqs;->n:I

    .line 533
    .line 534
    iget v6, v6, La/qqs;->d:I

    .line 535
    .line 536
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 537
    .line 538
    .line 539
    move-result-object v9

    .line 540
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-static {v9}, La/yk5;->d(Ljava/lang/Integer;)La/mc6;

    .line 544
    .line 545
    .line 546
    move-result-object v8

    .line 547
    iget-byte v10, v8, La/mc6;->a:B

    .line 548
    .line 549
    new-instance v9, La/la30;

    .line 550
    .line 551
    invoke-static {v10, v6}, La/qem0;->l(II)Ljava/util/List;

    .line 552
    .line 553
    .line 554
    move-result-object v14

    .line 555
    invoke-static {v10, v6}, La/qem0;->l(II)Ljava/util/List;

    .line 556
    .line 557
    .line 558
    move-result-object v15

    .line 559
    const-wide/16 v11, 0x0

    .line 560
    .line 561
    iget-object v13, v4, La/m9s;->E:Ljava/lang/String;

    .line 562
    .line 563
    invoke-direct/range {v9 .. v15}, La/la30;-><init>(IJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 564
    .line 565
    .line 566
    goto :goto_2

    .line 567
    :cond_8
    move-object v9, v2

    .line 568
    :goto_2
    move-object v8, v9

    .line 569
    goto :goto_3

    .line 570
    :cond_9
    move-object v8, v2

    .line 571
    :goto_3
    iget-object v6, v3, La/v6o;->k:La/n0o0;

    .line 572
    .line 573
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v6

    .line 577
    check-cast v6, La/fee;

    .line 578
    .line 579
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    check-cast v6, Ljava/lang/Boolean;

    .line 584
    .line 585
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 586
    .line 587
    .line 588
    move-result v9

    .line 589
    iget-object v6, v3, La/v6o;->l:La/n0o0;

    .line 590
    .line 591
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v6

    .line 595
    check-cast v6, La/fee;

    .line 596
    .line 597
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v6

    .line 601
    move-object v10, v6

    .line 602
    check-cast v10, Ljava/util/List;

    .line 603
    .line 604
    iget-boolean v11, v5, La/l6o;->z:Z

    .line 605
    .line 606
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    check-cast v0, La/fee;

    .line 611
    .line 612
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    check-cast v0, La/tdt0;

    .line 617
    .line 618
    if-eqz v0, :cond_a

    .line 619
    .line 620
    iget-object v2, v0, La/tdt0;->a:La/cqg;

    .line 621
    .line 622
    :cond_a
    instance-of v0, v2, La/l5x;

    .line 623
    .line 624
    xor-int/lit8 v12, v0, 0x1

    .line 625
    .line 626
    iget-object v0, v3, La/v6o;->m:La/n0o0;

    .line 627
    .line 628
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    check-cast v0, La/fee;

    .line 633
    .line 634
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    check-cast v0, La/ypl0;

    .line 639
    .line 640
    iget-object v0, v0, La/ypl0;->c:La/lel0;

    .line 641
    .line 642
    iget-object v13, v0, La/lel0;->a:Ljava/lang/String;

    .line 643
    .line 644
    iget-object v14, v5, La/l6o;->o:Ljava/lang/String;

    .line 645
    .line 646
    const/4 v6, 0x1

    .line 647
    move v5, v1

    .line 648
    invoke-static/range {v4 .. v14}, La/hkb;->P(La/m9s;ZZLa/ctf0;La/la30;ZLjava/util/List;ZZLjava/lang/String;Ljava/lang/String;)La/zqg;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    return-object v0

    .line 653
    :pswitch_4
    move-object/from16 v0, p1

    .line 654
    .line 655
    check-cast v0, La/fee;

    .line 656
    .line 657
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    new-instance v0, La/avs;

    .line 661
    .line 662
    iget-object v1, v3, La/v6o;->g:La/n0o0;

    .line 663
    .line 664
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    check-cast v1, La/fee;

    .line 669
    .line 670
    iget-object v1, v1, La/fee;->d:La/pz40;

    .line 671
    .line 672
    iget-object v2, v3, La/v6o;->h:La/n0o0;

    .line 673
    .line 674
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    check-cast v2, La/fee;

    .line 679
    .line 680
    iget-object v2, v2, La/fee;->d:La/pz40;

    .line 681
    .line 682
    iget-object v4, v3, La/v6o;->i:La/n0o0;

    .line 683
    .line 684
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v4

    .line 688
    check-cast v4, La/fee;

    .line 689
    .line 690
    iget-object v4, v4, La/fee;->d:La/pz40;

    .line 691
    .line 692
    iget-object v3, v3, La/v6o;->j:La/n0o0;

    .line 693
    .line 694
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v3

    .line 698
    check-cast v3, La/fee;

    .line 699
    .line 700
    iget-object v3, v3, La/fee;->d:La/pz40;

    .line 701
    .line 702
    invoke-direct {v0, v1, v2, v4, v3}, La/avs;-><init>(La/l7m0;La/l7m0;La/l7m0;La/l7m0;)V

    .line 703
    .line 704
    .line 705
    return-object v0

    .line 706
    :pswitch_5
    move-object/from16 v0, p1

    .line 707
    .line 708
    check-cast v0, La/fee;

    .line 709
    .line 710
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    iget-object v1, v3, La/v6o;->v:La/n0o0;

    .line 714
    .line 715
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    check-cast v1, La/fee;

    .line 720
    .line 721
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    check-cast v1, Ljava/lang/Boolean;

    .line 726
    .line 727
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    check-cast v2, La/bqr;

    .line 732
    .line 733
    iget-wide v2, v2, La/bqr;->a:J

    .line 734
    .line 735
    sget-object v4, La/qtg;->d:La/qtg;

    .line 736
    .line 737
    iget-wide v4, v4, La/yxg;->b:J

    .line 738
    .line 739
    cmp-long v2, v2, v4

    .line 740
    .line 741
    if-nez v2, :cond_b

    .line 742
    .line 743
    if-nez v1, :cond_b

    .line 744
    .line 745
    new-instance v0, La/cqr;

    .line 746
    .line 747
    const v1, 0x7f06069d

    .line 748
    .line 749
    .line 750
    const/4 v2, 0x0

    .line 751
    const-string v3, ""

    .line 752
    .line 753
    invoke-direct {v0, v3, v1, v2}, La/cqr;-><init>(Ljava/lang/String;IZ)V

    .line 754
    .line 755
    .line 756
    goto :goto_4

    .line 757
    :cond_b
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    check-cast v0, La/bqr;

    .line 762
    .line 763
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 764
    .line 765
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v1

    .line 769
    invoke-static {v0, v1}, La/kpb;->o0(La/bqr;Z)La/cqr;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    :goto_4
    return-object v0

    .line 774
    nop

    .line 775
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
