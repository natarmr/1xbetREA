.class public final La/bzp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bzp0;->a:B

    iput-object p1, p0, La/bzp0;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bzp0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, La/jm40;->b:La/jm40;

    .line 7
    .line 8
    iget-object v0, v0, La/bzp0;->b:Ljava/util/List;

    .line 9
    .line 10
    const/16 v4, 0x92

    .line 11
    .line 12
    const/16 v5, 0x10

    .line 13
    .line 14
    const/16 v6, 0x20

    .line 15
    .line 16
    const/4 v7, 0x2

    .line 17
    const/4 v8, 0x4

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x1

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, La/g9z;

    .line 26
    .line 27
    move-object/from16 v2, p2

    .line 28
    .line 29
    check-cast v2, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    move-object/from16 v3, p3

    .line 36
    .line 37
    check-cast v3, La/fet;

    .line 38
    .line 39
    move-object/from16 v11, p4

    .line 40
    .line 41
    check-cast v11, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v11

    .line 47
    and-int/lit8 v12, v11, 0x6

    .line 48
    .line 49
    if-nez v12, :cond_1

    .line 50
    .line 51
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    move v7, v8

    .line 58
    :cond_0
    or-int v1, v11, v7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move v1, v11

    .line 62
    :goto_0
    and-int/lit8 v7, v11, 0x30

    .line 63
    .line 64
    if-nez v7, :cond_3

    .line 65
    .line 66
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_2

    .line 71
    .line 72
    move v5, v6

    .line 73
    :cond_2
    or-int/2addr v1, v5

    .line 74
    :cond_3
    and-int/lit16 v5, v1, 0x93

    .line 75
    .line 76
    if-eq v5, v4, :cond_4

    .line 77
    .line 78
    move v4, v10

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    move v4, v9

    .line 81
    :goto_1
    and-int/2addr v1, v10

    .line 82
    invoke-virtual {v3, v1, v4}, La/fet;->U(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_5

    .line 87
    .line 88
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/nmv0;

    .line 93
    .line 94
    const v1, 0x5335f7b1

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v3, v9}, La/gq80;->K(La/nmv0;La/fet;I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v9}, La/fet;->r(Z)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    invoke-virtual {v3}, La/fet;->X()V

    .line 108
    .line 109
    .line 110
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_0
    move-object/from16 v1, p1

    .line 114
    .line 115
    check-cast v1, La/g9z;

    .line 116
    .line 117
    move-object/from16 v2, p2

    .line 118
    .line 119
    check-cast v2, Ljava/lang/Number;

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    move-object/from16 v11, p3

    .line 126
    .line 127
    check-cast v11, La/fet;

    .line 128
    .line 129
    move-object/from16 v12, p4

    .line 130
    .line 131
    check-cast v12, Ljava/lang/Number;

    .line 132
    .line 133
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    and-int/lit8 v13, v12, 0x6

    .line 141
    .line 142
    if-nez v13, :cond_7

    .line 143
    .line 144
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    move v7, v8

    .line 151
    :cond_6
    or-int v1, v12, v7

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_7
    move v1, v12

    .line 155
    :goto_3
    and-int/lit8 v7, v12, 0x30

    .line 156
    .line 157
    if-nez v7, :cond_9

    .line 158
    .line 159
    invoke-virtual {v11, v2}, La/fet;->e(I)Z

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    if-eqz v7, :cond_8

    .line 164
    .line 165
    move v5, v6

    .line 166
    :cond_8
    or-int/2addr v1, v5

    .line 167
    :cond_9
    and-int/lit16 v5, v1, 0x93

    .line 168
    .line 169
    if-eq v5, v4, :cond_a

    .line 170
    .line 171
    move v4, v10

    .line 172
    goto :goto_4

    .line 173
    :cond_a
    move v4, v9

    .line 174
    :goto_4
    and-int/2addr v1, v10

    .line 175
    invoke-virtual {v11, v1, v4}, La/fet;->U(IZ)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_c

    .line 180
    .line 181
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, La/rss0;

    .line 186
    .line 187
    const v1, 0x489baf50    # 318842.5f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 191
    .line 192
    .line 193
    const/high16 v1, 0x3f800000    # 1.0f

    .line 194
    .line 195
    invoke-static {v3, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    iget-wide v2, v0, La/rss0;->f:J

    .line 200
    .line 201
    sget-object v4, La/jd8;->n:La/ljc;

    .line 202
    .line 203
    invoke-static {v1, v2, v3, v4}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    sget-object v2, La/uc9;->h:La/nw3;

    .line 208
    .line 209
    sget-object v3, La/gqw0;->k:La/yx7;

    .line 210
    .line 211
    const/16 v4, 0x36

    .line 212
    .line 213
    invoke-static {v2, v3, v11, v4}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    iget-wide v3, v11, La/fet;->T:J

    .line 218
    .line 219
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-static {v11, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v11}, La/fet;->i0()V

    .line 237
    .line 238
    .line 239
    iget-boolean v5, v11, La/fet;->S:Z

    .line 240
    .line 241
    if-eqz v5, :cond_b

    .line 242
    .line 243
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 244
    .line 245
    invoke-virtual {v11, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_b
    invoke-virtual {v11}, La/fet;->r0()V

    .line 250
    .line 251
    .line 252
    :goto_5
    sget-object v5, La/gqw0;->x:La/shd;

    .line 253
    .line 254
    invoke-static {v11, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 255
    .line 256
    .line 257
    sget-object v2, La/gqw0;->w:La/shd;

    .line 258
    .line 259
    invoke-static {v11, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    sget-object v3, La/gqw0;->y:La/shd;

    .line 267
    .line 268
    invoke-static {v11, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 269
    .line 270
    .line 271
    invoke-static {v11}, La/jpm0;->n(La/fet;)V

    .line 272
    .line 273
    .line 274
    sget-object v2, La/gqw0;->v:La/shd;

    .line 275
    .line 276
    invoke-static {v11, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 277
    .line 278
    .line 279
    iget-object v1, v0, La/rss0;->b:Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {v1, v11, v9}, La/vbw0;->m(Ljava/lang/String;La/fet;I)V

    .line 282
    .line 283
    .line 284
    iget-object v1, v0, La/rss0;->c:Ljava/lang/String;

    .line 285
    .line 286
    invoke-static {v1, v11, v9}, La/vbw0;->A(Ljava/lang/String;La/fet;I)V

    .line 287
    .line 288
    .line 289
    iget-object v1, v0, La/rss0;->d:Ljava/lang/String;

    .line 290
    .line 291
    iget-object v0, v0, La/rss0;->e:Ljava/lang/String;

    .line 292
    .line 293
    invoke-static {v1, v0, v11, v9}, La/vbw0;->d(Ljava/lang/String;Ljava/lang/String;La/fet;I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v11, v10}, La/fet;->r(Z)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v11, v9}, La/fet;->r(Z)V

    .line 300
    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_c
    invoke-virtual {v11}, La/fet;->X()V

    .line 304
    .line 305
    .line 306
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    return-object v0

    .line 309
    :pswitch_1
    move-object/from16 v1, p1

    .line 310
    .line 311
    check-cast v1, La/g9z;

    .line 312
    .line 313
    move-object/from16 v2, p2

    .line 314
    .line 315
    check-cast v2, Ljava/lang/Number;

    .line 316
    .line 317
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    move-object/from16 v14, p3

    .line 322
    .line 323
    check-cast v14, La/fet;

    .line 324
    .line 325
    move-object/from16 v3, p4

    .line 326
    .line 327
    check-cast v3, Ljava/lang/Number;

    .line 328
    .line 329
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    and-int/lit8 v11, v3, 0x6

    .line 337
    .line 338
    if-nez v11, :cond_e

    .line 339
    .line 340
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-eqz v1, :cond_d

    .line 345
    .line 346
    move v7, v8

    .line 347
    :cond_d
    or-int v1, v3, v7

    .line 348
    .line 349
    goto :goto_7

    .line 350
    :cond_e
    move v1, v3

    .line 351
    :goto_7
    and-int/lit8 v3, v3, 0x30

    .line 352
    .line 353
    if-nez v3, :cond_10

    .line 354
    .line 355
    invoke-virtual {v14, v2}, La/fet;->e(I)Z

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    if-eqz v3, :cond_f

    .line 360
    .line 361
    move v5, v6

    .line 362
    :cond_f
    or-int/2addr v1, v5

    .line 363
    :cond_10
    and-int/lit16 v3, v1, 0x93

    .line 364
    .line 365
    if-eq v3, v4, :cond_11

    .line 366
    .line 367
    move v3, v10

    .line 368
    goto :goto_8

    .line 369
    :cond_11
    move v3, v9

    .line 370
    :goto_8
    and-int/2addr v1, v10

    .line 371
    invoke-virtual {v14, v1, v3}, La/fet;->U(IZ)Z

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    if-eqz v1, :cond_12

    .line 376
    .line 377
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    check-cast v0, La/q5s0;

    .line 382
    .line 383
    const v1, -0x2044a776    # -2.6999383E19f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v14, v1}, La/fet;->e0(I)V

    .line 387
    .line 388
    .line 389
    iget-object v12, v0, La/q5s0;->b:La/l5i;

    .line 390
    .line 391
    iget-object v13, v0, La/q5s0;->c:La/trl;

    .line 392
    .line 393
    const/4 v15, 0x0

    .line 394
    const/16 v16, 0x1

    .line 395
    .line 396
    const/4 v11, 0x0

    .line 397
    invoke-static/range {v11 .. v16}, La/acb;->o(La/mm40;La/l5i;La/trl;La/fet;II)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v14, v9}, La/fet;->r(Z)V

    .line 401
    .line 402
    .line 403
    goto :goto_9

    .line 404
    :cond_12
    invoke-virtual {v14}, La/fet;->X()V

    .line 405
    .line 406
    .line 407
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 408
    .line 409
    return-object v0

    .line 410
    :pswitch_2
    move-object/from16 v1, p1

    .line 411
    .line 412
    check-cast v1, La/g9z;

    .line 413
    .line 414
    move-object/from16 v11, p2

    .line 415
    .line 416
    check-cast v11, Ljava/lang/Number;

    .line 417
    .line 418
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 419
    .line 420
    .line 421
    move-result v11

    .line 422
    move-object/from16 v12, p3

    .line 423
    .line 424
    check-cast v12, La/fet;

    .line 425
    .line 426
    move-object/from16 v13, p4

    .line 427
    .line 428
    check-cast v13, Ljava/lang/Number;

    .line 429
    .line 430
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 431
    .line 432
    .line 433
    move-result v13

    .line 434
    and-int/lit8 v14, v13, 0x6

    .line 435
    .line 436
    if-nez v14, :cond_14

    .line 437
    .line 438
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-eqz v1, :cond_13

    .line 443
    .line 444
    goto :goto_a

    .line 445
    :cond_13
    move v8, v7

    .line 446
    :goto_a
    or-int v1, v13, v8

    .line 447
    .line 448
    goto :goto_b

    .line 449
    :cond_14
    move v1, v13

    .line 450
    :goto_b
    and-int/lit8 v8, v13, 0x30

    .line 451
    .line 452
    if-nez v8, :cond_16

    .line 453
    .line 454
    invoke-virtual {v12, v11}, La/fet;->e(I)Z

    .line 455
    .line 456
    .line 457
    move-result v8

    .line 458
    if-eqz v8, :cond_15

    .line 459
    .line 460
    move v5, v6

    .line 461
    :cond_15
    or-int/2addr v1, v5

    .line 462
    :cond_16
    and-int/lit16 v5, v1, 0x93

    .line 463
    .line 464
    if-eq v5, v4, :cond_17

    .line 465
    .line 466
    move v4, v10

    .line 467
    goto :goto_c

    .line 468
    :cond_17
    move v4, v9

    .line 469
    :goto_c
    and-int/2addr v1, v10

    .line 470
    invoke-virtual {v12, v1, v4}, La/fet;->U(IZ)Z

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    if-eqz v1, :cond_18

    .line 475
    .line 476
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    check-cast v0, La/d9r0;

    .line 481
    .line 482
    const v1, 0x5671ec4c

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 486
    .line 487
    .line 488
    sget-object v1, La/qmk;->a:La/zcl;

    .line 489
    .line 490
    const/high16 v1, 0x41b00000    # 22.0f

    .line 491
    .line 492
    invoke-static {v3, v1, v2, v7}, La/o7k0;->b(La/mm40;FFI)La/mm40;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    invoke-static {v1, v0, v12, v9}, La/dnm0;->d(La/mm40;La/d9r0;La/fet;I)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v9}, La/fet;->r(Z)V

    .line 500
    .line 501
    .line 502
    goto :goto_d

    .line 503
    :cond_18
    invoke-virtual {v12}, La/fet;->X()V

    .line 504
    .line 505
    .line 506
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 507
    .line 508
    return-object v0

    .line 509
    :pswitch_3
    move-object/from16 v1, p1

    .line 510
    .line 511
    check-cast v1, La/g9z;

    .line 512
    .line 513
    move-object/from16 v2, p2

    .line 514
    .line 515
    check-cast v2, Ljava/lang/Number;

    .line 516
    .line 517
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    move-object/from16 v3, p3

    .line 522
    .line 523
    check-cast v3, La/fet;

    .line 524
    .line 525
    move-object/from16 v11, p4

    .line 526
    .line 527
    check-cast v11, Ljava/lang/Number;

    .line 528
    .line 529
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 530
    .line 531
    .line 532
    move-result v11

    .line 533
    and-int/lit8 v12, v11, 0x6

    .line 534
    .line 535
    if-nez v12, :cond_1a

    .line 536
    .line 537
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v1

    .line 541
    if-eqz v1, :cond_19

    .line 542
    .line 543
    move v7, v8

    .line 544
    :cond_19
    or-int v1, v11, v7

    .line 545
    .line 546
    goto :goto_e

    .line 547
    :cond_1a
    move v1, v11

    .line 548
    :goto_e
    and-int/lit8 v7, v11, 0x30

    .line 549
    .line 550
    if-nez v7, :cond_1c

    .line 551
    .line 552
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 553
    .line 554
    .line 555
    move-result v7

    .line 556
    if-eqz v7, :cond_1b

    .line 557
    .line 558
    move v5, v6

    .line 559
    :cond_1b
    or-int/2addr v1, v5

    .line 560
    :cond_1c
    and-int/lit16 v5, v1, 0x93

    .line 561
    .line 562
    if-eq v5, v4, :cond_1d

    .line 563
    .line 564
    move v4, v10

    .line 565
    goto :goto_f

    .line 566
    :cond_1d
    move v4, v9

    .line 567
    :goto_f
    and-int/2addr v1, v10

    .line 568
    invoke-virtual {v3, v1, v4}, La/fet;->U(IZ)Z

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    if-eqz v1, :cond_1e

    .line 573
    .line 574
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    check-cast v0, La/m39;

    .line 579
    .line 580
    const v1, -0x781e20c7

    .line 581
    .line 582
    .line 583
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 584
    .line 585
    .line 586
    invoke-static {v0, v3, v9}, La/tke;->m(La/m39;La/fet;I)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v3, v9}, La/fet;->r(Z)V

    .line 590
    .line 591
    .line 592
    goto :goto_10

    .line 593
    :cond_1e
    invoke-virtual {v3}, La/fet;->X()V

    .line 594
    .line 595
    .line 596
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 597
    .line 598
    return-object v0

    .line 599
    :pswitch_4
    move-object/from16 v1, p1

    .line 600
    .line 601
    check-cast v1, La/g9z;

    .line 602
    .line 603
    move-object/from16 v2, p2

    .line 604
    .line 605
    check-cast v2, Ljava/lang/Number;

    .line 606
    .line 607
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    move-object/from16 v11, p3

    .line 612
    .line 613
    check-cast v11, La/fet;

    .line 614
    .line 615
    move-object/from16 v12, p4

    .line 616
    .line 617
    check-cast v12, Ljava/lang/Number;

    .line 618
    .line 619
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 620
    .line 621
    .line 622
    move-result v12

    .line 623
    and-int/lit8 v13, v12, 0x6

    .line 624
    .line 625
    if-nez v13, :cond_20

    .line 626
    .line 627
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    if-eqz v1, :cond_1f

    .line 632
    .line 633
    move v7, v8

    .line 634
    :cond_1f
    or-int v1, v12, v7

    .line 635
    .line 636
    goto :goto_11

    .line 637
    :cond_20
    move v1, v12

    .line 638
    :goto_11
    and-int/lit8 v7, v12, 0x30

    .line 639
    .line 640
    if-nez v7, :cond_22

    .line 641
    .line 642
    invoke-virtual {v11, v2}, La/fet;->e(I)Z

    .line 643
    .line 644
    .line 645
    move-result v7

    .line 646
    if-eqz v7, :cond_21

    .line 647
    .line 648
    move v5, v6

    .line 649
    :cond_21
    or-int/2addr v1, v5

    .line 650
    :cond_22
    and-int/lit16 v5, v1, 0x93

    .line 651
    .line 652
    if-eq v5, v4, :cond_23

    .line 653
    .line 654
    move v4, v10

    .line 655
    goto :goto_12

    .line 656
    :cond_23
    move v4, v9

    .line 657
    :goto_12
    and-int/2addr v1, v10

    .line 658
    invoke-virtual {v11, v1, v4}, La/fet;->U(IZ)Z

    .line 659
    .line 660
    .line 661
    move-result v1

    .line 662
    if-eqz v1, :cond_24

    .line 663
    .line 664
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    check-cast v0, La/cxp0;

    .line 669
    .line 670
    const v1, -0x4b2ec14a

    .line 671
    .line 672
    .line 673
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 674
    .line 675
    .line 676
    sget-object v1, La/qmk;->a:La/zcl;

    .line 677
    .line 678
    const/high16 v1, 0x42480000    # 50.0f

    .line 679
    .line 680
    invoke-static {v3, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 681
    .line 682
    .line 683
    move-result-object v1

    .line 684
    iget-wide v2, v0, La/cxp0;->b:J

    .line 685
    .line 686
    sget-object v4, La/jd8;->n:La/ljc;

    .line 687
    .line 688
    invoke-static {v1, v2, v3, v4}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    iget-object v0, v0, La/cxp0;->a:La/ixp0;

    .line 693
    .line 694
    invoke-static {v1, v0, v11, v9}, La/qsm0;->i(La/mm40;La/ixp0;La/fet;I)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v11, v9}, La/fet;->r(Z)V

    .line 698
    .line 699
    .line 700
    goto :goto_13

    .line 701
    :cond_24
    invoke-virtual {v11}, La/fet;->X()V

    .line 702
    .line 703
    .line 704
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 705
    .line 706
    return-object v0

    .line 707
    :pswitch_5
    move-object/from16 v1, p1

    .line 708
    .line 709
    check-cast v1, La/g9z;

    .line 710
    .line 711
    move-object/from16 v11, p2

    .line 712
    .line 713
    check-cast v11, Ljava/lang/Number;

    .line 714
    .line 715
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 716
    .line 717
    .line 718
    move-result v11

    .line 719
    move-object/from16 v12, p3

    .line 720
    .line 721
    check-cast v12, La/fet;

    .line 722
    .line 723
    move-object/from16 v13, p4

    .line 724
    .line 725
    check-cast v13, Ljava/lang/Number;

    .line 726
    .line 727
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 728
    .line 729
    .line 730
    move-result v13

    .line 731
    and-int/lit8 v14, v13, 0x6

    .line 732
    .line 733
    if-nez v14, :cond_26

    .line 734
    .line 735
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v1

    .line 739
    if-eqz v1, :cond_25

    .line 740
    .line 741
    goto :goto_14

    .line 742
    :cond_25
    move v8, v7

    .line 743
    :goto_14
    or-int v1, v13, v8

    .line 744
    .line 745
    goto :goto_15

    .line 746
    :cond_26
    move v1, v13

    .line 747
    :goto_15
    and-int/lit8 v8, v13, 0x30

    .line 748
    .line 749
    if-nez v8, :cond_28

    .line 750
    .line 751
    invoke-virtual {v12, v11}, La/fet;->e(I)Z

    .line 752
    .line 753
    .line 754
    move-result v8

    .line 755
    if-eqz v8, :cond_27

    .line 756
    .line 757
    move v5, v6

    .line 758
    :cond_27
    or-int/2addr v1, v5

    .line 759
    :cond_28
    and-int/lit16 v5, v1, 0x93

    .line 760
    .line 761
    if-eq v5, v4, :cond_29

    .line 762
    .line 763
    move v4, v10

    .line 764
    goto :goto_16

    .line 765
    :cond_29
    move v4, v9

    .line 766
    :goto_16
    and-int/2addr v1, v10

    .line 767
    invoke-virtual {v12, v1, v4}, La/fet;->U(IZ)Z

    .line 768
    .line 769
    .line 770
    move-result v1

    .line 771
    if-eqz v1, :cond_2a

    .line 772
    .line 773
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    check-cast v0, La/gzp0;

    .line 778
    .line 779
    const v1, 0x2c7bd829

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 783
    .line 784
    .line 785
    iget-object v1, v0, La/gzp0;->a:Ljava/lang/String;

    .line 786
    .line 787
    iget-object v0, v0, La/gzp0;->b:Ljava/lang/String;

    .line 788
    .line 789
    invoke-static {v12}, La/xfn;->a(La/fet;)La/wfn;

    .line 790
    .line 791
    .line 792
    move-result-object v4

    .line 793
    iget v4, v4, La/wfn;->d:F

    .line 794
    .line 795
    invoke-static {v3, v4, v2, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 796
    .line 797
    .line 798
    move-result-object v13

    .line 799
    sget-object v2, La/qmk;->a:La/zcl;

    .line 800
    .line 801
    const/16 v17, 0x0

    .line 802
    .line 803
    const/16 v18, 0xd

    .line 804
    .line 805
    const/4 v14, 0x0

    .line 806
    const/high16 v15, 0x41800000    # 16.0f

    .line 807
    .line 808
    const/16 v16, 0x0

    .line 809
    .line 810
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    invoke-static {v9, v12, v2, v1, v0}, La/zgc;->F(ILa/fet;La/mm40;Ljava/lang/String;Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v12, v9}, La/fet;->r(Z)V

    .line 818
    .line 819
    .line 820
    goto :goto_17

    .line 821
    :cond_2a
    invoke-virtual {v12}, La/fet;->X()V

    .line 822
    .line 823
    .line 824
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 825
    .line 826
    return-object v0

    .line 827
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
