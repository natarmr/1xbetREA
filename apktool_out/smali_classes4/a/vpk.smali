.class public final La/vpk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:La/qdz;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/vpk;->a:B

    iput-object p1, p0, La/vpk;->b:La/a4x;

    iput-object p2, p0, La/vpk;->c:La/qdz;

    iput-object p3, p0, La/vpk;->d:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/vpk;->e:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vpk;->a:B

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    iget-object v3, v0, La/vpk;->b:La/a4x;

    .line 8
    .line 9
    const/16 v4, 0x92

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    const/16 v6, 0x20

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    const/4 v8, 0x0

    .line 17
    sget-object v9, La/ukd;->a:La/cl5;

    .line 18
    .line 19
    const/4 v10, 0x1

    .line 20
    const/4 v11, 0x4

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/g9z;

    .line 27
    .line 28
    move-object/from16 v12, p2

    .line 29
    .line 30
    check-cast v12, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    move-object/from16 v13, p3

    .line 37
    .line 38
    check-cast v13, La/fet;

    .line 39
    .line 40
    move-object/from16 v14, p4

    .line 41
    .line 42
    check-cast v14, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v14

    .line 48
    and-int/lit8 v15, v14, 0x6

    .line 49
    .line 50
    if-nez v15, :cond_1

    .line 51
    .line 52
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    move v7, v11

    .line 59
    :cond_0
    or-int v1, v14, v7

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move v1, v14

    .line 63
    :goto_0
    and-int/lit8 v7, v14, 0x30

    .line 64
    .line 65
    if-nez v7, :cond_3

    .line 66
    .line 67
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_2

    .line 72
    .line 73
    move v5, v6

    .line 74
    :cond_2
    or-int/2addr v1, v5

    .line 75
    :cond_3
    and-int/lit16 v5, v1, 0x93

    .line 76
    .line 77
    if-eq v5, v4, :cond_4

    .line 78
    .line 79
    move v4, v10

    .line 80
    goto :goto_1

    .line 81
    :cond_4
    move v4, v8

    .line 82
    :goto_1
    and-int/2addr v1, v10

    .line 83
    invoke-virtual {v13, v1, v4}, La/fet;->U(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_1b

    .line 88
    .line 89
    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, La/p6t0;

    .line 94
    .line 95
    const v3, -0x6a8d9dc4

    .line 96
    .line 97
    .line 98
    invoke-virtual {v13, v3}, La/fet;->e0(I)V

    .line 99
    .line 100
    .line 101
    if-nez v1, :cond_5

    .line 102
    .line 103
    move-object v2, v13

    .line 104
    goto/16 :goto_2

    .line 105
    .line 106
    :cond_5
    instance-of v3, v1, La/dqk;

    .line 107
    .line 108
    iget-object v4, v0, La/vpk;->d:Lkotlin/jvm/functions/Function1;

    .line 109
    .line 110
    if-eqz v3, :cond_a

    .line 111
    .line 112
    const v3, -0x6a8dbc49

    .line 113
    .line 114
    .line 115
    invoke-virtual {v13, v3}, La/fet;->e0(I)V

    .line 116
    .line 117
    .line 118
    move-object v15, v1

    .line 119
    check-cast v15, La/dqk;

    .line 120
    .line 121
    invoke-virtual {v13, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    if-nez v1, :cond_6

    .line 130
    .line 131
    if-ne v3, v9, :cond_7

    .line 132
    .line 133
    :cond_6
    new-instance v3, La/rr0;

    .line 134
    .line 135
    const/16 v1, 0x16

    .line 136
    .line 137
    invoke-direct {v3, v4, v1}, La/rr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v13, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_7
    move-object/from16 v16, v3

    .line 144
    .line 145
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 146
    .line 147
    invoke-virtual {v13, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    if-nez v1, :cond_8

    .line 156
    .line 157
    if-ne v3, v9, :cond_9

    .line 158
    .line 159
    :cond_8
    new-instance v3, La/fzg;

    .line 160
    .line 161
    invoke-direct {v3, v4, v2}, La/fzg;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v13, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_9
    move-object/from16 v17, v3

    .line 168
    .line 169
    check-cast v17, Lkotlin/jvm/functions/Function1;

    .line 170
    .line 171
    const/16 v19, 0x0

    .line 172
    .line 173
    move-object/from16 v18, v13

    .line 174
    .line 175
    const/4 v13, 0x0

    .line 176
    iget-object v14, v0, La/vpk;->c:La/qdz;

    .line 177
    .line 178
    invoke-static/range {v13 .. v19}, La/fxb;->g(La/mm40;La/qdz;La/dqk;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 179
    .line 180
    .line 181
    move-object/from16 v2, v18

    .line 182
    .line 183
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_3

    .line 187
    .line 188
    :cond_a
    move-object v2, v13

    .line 189
    instance-of v3, v1, La/gqk;

    .line 190
    .line 191
    if-eqz v3, :cond_d

    .line 192
    .line 193
    const v3, -0x6a7fbed1

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 197
    .line 198
    .line 199
    move-object v13, v1

    .line 200
    check-cast v13, La/gqk;

    .line 201
    .line 202
    invoke-virtual {v2, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    if-nez v1, :cond_b

    .line 211
    .line 212
    if-ne v3, v9, :cond_c

    .line 213
    .line 214
    :cond_b
    new-instance v3, La/fzg;

    .line 215
    .line 216
    const/16 v1, 0xa

    .line 217
    .line 218
    invoke-direct {v3, v4, v1}, La/fzg;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_c
    move-object/from16 v16, v3

    .line 225
    .line 226
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 227
    .line 228
    const/16 v18, 0x6

    .line 229
    .line 230
    iget-object v14, v0, La/vpk;->c:La/qdz;

    .line 231
    .line 232
    iget-object v15, v0, La/vpk;->e:Lkotlin/jvm/functions/Function1;

    .line 233
    .line 234
    move-object/from16 v17, v2

    .line 235
    .line 236
    invoke-static/range {v13 .. v18}, La/ozb;->q(La/gqk;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_3

    .line 243
    .line 244
    :cond_d
    instance-of v3, v1, La/uqk;

    .line 245
    .line 246
    if-eqz v3, :cond_12

    .line 247
    .line 248
    const v3, -0x6a70e3fd

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 252
    .line 253
    .line 254
    move-object v15, v1

    .line 255
    check-cast v15, La/uqk;

    .line 256
    .line 257
    invoke-virtual {v2, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    if-nez v3, :cond_e

    .line 266
    .line 267
    if-ne v5, v9, :cond_f

    .line 268
    .line 269
    :cond_e
    new-instance v5, La/rr0;

    .line 270
    .line 271
    const/16 v3, 0x17

    .line 272
    .line 273
    invoke-direct {v5, v4, v3}, La/rr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :cond_f
    move-object/from16 v16, v5

    .line 280
    .line 281
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 282
    .line 283
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    invoke-virtual {v2, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    or-int/2addr v3, v5

    .line 292
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    if-nez v3, :cond_10

    .line 297
    .line 298
    if-ne v5, v9, :cond_11

    .line 299
    .line 300
    :cond_10
    new-instance v5, La/oqk;

    .line 301
    .line 302
    invoke-direct {v5, v1, v4}, La/oqk;-><init>(La/p6t0;Lkotlin/jvm/functions/Function1;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :cond_11
    move-object/from16 v17, v5

    .line 309
    .line 310
    check-cast v17, Lkotlin/jvm/functions/Function1;

    .line 311
    .line 312
    const/16 v19, 0x0

    .line 313
    .line 314
    const/4 v13, 0x0

    .line 315
    iget-object v14, v0, La/vpk;->c:La/qdz;

    .line 316
    .line 317
    move-object/from16 v18, v2

    .line 318
    .line 319
    invoke-static/range {v13 .. v19}, La/wzb;->n(La/mm40;La/qdz;La/uqk;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 323
    .line 324
    .line 325
    goto/16 :goto_3

    .line 326
    .line 327
    :cond_12
    instance-of v0, v1, La/ssk;

    .line 328
    .line 329
    if-eqz v0, :cond_15

    .line 330
    .line 331
    const v0, -0x13f2aca1

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 335
    .line 336
    .line 337
    check-cast v1, La/ssk;

    .line 338
    .line 339
    invoke-virtual {v2, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    if-nez v0, :cond_13

    .line 348
    .line 349
    if-ne v3, v9, :cond_14

    .line 350
    .line 351
    :cond_13
    new-instance v3, La/rr0;

    .line 352
    .line 353
    const/16 v0, 0x18

    .line 354
    .line 355
    invoke-direct {v3, v4, v0}, La/rr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    :cond_14
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 362
    .line 363
    invoke-static {v1, v3, v2, v8}, La/vcc;->e(La/ssk;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 367
    .line 368
    .line 369
    goto :goto_3

    .line 370
    :cond_15
    instance-of v0, v1, La/fsk;

    .line 371
    .line 372
    if-eqz v0, :cond_1a

    .line 373
    .line 374
    const v0, -0x6a5f4c64

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 378
    .line 379
    .line 380
    check-cast v1, La/fsk;

    .line 381
    .line 382
    invoke-virtual {v2, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    if-nez v0, :cond_16

    .line 391
    .line 392
    if-ne v3, v9, :cond_17

    .line 393
    .line 394
    :cond_16
    new-instance v3, La/fzg;

    .line 395
    .line 396
    const/16 v0, 0xb

    .line 397
    .line 398
    invoke-direct {v3, v4, v0}, La/fzg;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    :cond_17
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 405
    .line 406
    invoke-virtual {v2, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    if-nez v0, :cond_18

    .line 415
    .line 416
    if-ne v5, v9, :cond_19

    .line 417
    .line 418
    :cond_18
    new-instance v5, La/rr0;

    .line 419
    .line 420
    const/16 v0, 0x19

    .line 421
    .line 422
    invoke-direct {v5, v4, v0}, La/rr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :cond_19
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 429
    .line 430
    invoke-static {v1, v3, v5, v2, v8}, La/qbc;->h(La/fsk;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 434
    .line 435
    .line 436
    goto :goto_3

    .line 437
    :cond_1a
    :goto_2
    const v0, -0x6a58b96e

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 444
    .line 445
    .line 446
    :goto_3
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 447
    .line 448
    .line 449
    goto :goto_4

    .line 450
    :cond_1b
    move-object v2, v13

    .line 451
    invoke-virtual {v2}, La/fet;->X()V

    .line 452
    .line 453
    .line 454
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 455
    .line 456
    return-object v0

    .line 457
    :pswitch_0
    move-object/from16 v1, p1

    .line 458
    .line 459
    check-cast v1, La/g9z;

    .line 460
    .line 461
    move-object/from16 v12, p2

    .line 462
    .line 463
    check-cast v12, Ljava/lang/Number;

    .line 464
    .line 465
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 466
    .line 467
    .line 468
    move-result v12

    .line 469
    move-object/from16 v13, p3

    .line 470
    .line 471
    check-cast v13, La/fet;

    .line 472
    .line 473
    move-object/from16 v14, p4

    .line 474
    .line 475
    check-cast v14, Ljava/lang/Number;

    .line 476
    .line 477
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 478
    .line 479
    .line 480
    move-result v14

    .line 481
    and-int/lit8 v15, v14, 0x6

    .line 482
    .line 483
    if-nez v15, :cond_1d

    .line 484
    .line 485
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    if-eqz v1, :cond_1c

    .line 490
    .line 491
    move v1, v11

    .line 492
    goto :goto_5

    .line 493
    :cond_1c
    move v1, v7

    .line 494
    :goto_5
    or-int/2addr v1, v14

    .line 495
    goto :goto_6

    .line 496
    :cond_1d
    move v1, v14

    .line 497
    :goto_6
    and-int/lit8 v14, v14, 0x30

    .line 498
    .line 499
    if-nez v14, :cond_1f

    .line 500
    .line 501
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 502
    .line 503
    .line 504
    move-result v14

    .line 505
    if-eqz v14, :cond_1e

    .line 506
    .line 507
    move v5, v6

    .line 508
    :cond_1e
    or-int/2addr v1, v5

    .line 509
    :cond_1f
    and-int/lit16 v5, v1, 0x93

    .line 510
    .line 511
    if-eq v5, v4, :cond_20

    .line 512
    .line 513
    move v4, v10

    .line 514
    goto :goto_7

    .line 515
    :cond_20
    move v4, v8

    .line 516
    :goto_7
    and-int/2addr v1, v10

    .line 517
    invoke-virtual {v13, v1, v4}, La/fet;->U(IZ)Z

    .line 518
    .line 519
    .line 520
    move-result v1

    .line 521
    if-eqz v1, :cond_36

    .line 522
    .line 523
    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    check-cast v1, La/p6t0;

    .line 528
    .line 529
    const v3, 0x5a4fd489

    .line 530
    .line 531
    .line 532
    invoke-virtual {v13, v3}, La/fet;->e0(I)V

    .line 533
    .line 534
    .line 535
    if-nez v1, :cond_21

    .line 536
    .line 537
    move-object v3, v13

    .line 538
    goto/16 :goto_8

    .line 539
    .line 540
    :cond_21
    instance-of v3, v1, La/kuj;

    .line 541
    .line 542
    sget-object v14, La/jm40;->b:La/jm40;

    .line 543
    .line 544
    if-eqz v3, :cond_22

    .line 545
    .line 546
    const v2, 0x5a4f6c83

    .line 547
    .line 548
    .line 549
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 550
    .line 551
    .line 552
    check-cast v1, La/kuj;

    .line 553
    .line 554
    iget-object v2, v0, La/vpk;->d:Lkotlin/jvm/functions/Function1;

    .line 555
    .line 556
    const/16 v18, 0x6

    .line 557
    .line 558
    iget-object v15, v0, La/vpk;->c:La/qdz;

    .line 559
    .line 560
    move-object/from16 v16, v2

    .line 561
    .line 562
    move-object/from16 v17, v13

    .line 563
    .line 564
    move-object v13, v14

    .line 565
    move-object v14, v1

    .line 566
    invoke-static/range {v13 .. v18}, La/sac;->l(La/mm40;La/kuj;La/qdz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 567
    .line 568
    .line 569
    move-object/from16 v3, v17

    .line 570
    .line 571
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 572
    .line 573
    .line 574
    goto/16 :goto_9

    .line 575
    .line 576
    :cond_22
    move-object v3, v13

    .line 577
    move-object v13, v14

    .line 578
    instance-of v4, v1, La/nuj;

    .line 579
    .line 580
    iget-object v5, v0, La/vpk;->e:Lkotlin/jvm/functions/Function1;

    .line 581
    .line 582
    if-eqz v4, :cond_25

    .line 583
    .line 584
    const v0, 0x5a540f79

    .line 585
    .line 586
    .line 587
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 588
    .line 589
    .line 590
    invoke-static {v3}, La/xfn;->a(La/fet;)La/wfn;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    iget v0, v0, La/wfn;->e:F

    .line 595
    .line 596
    const/4 v4, 0x0

    .line 597
    invoke-static {v13, v0, v4, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    move-object v4, v1

    .line 602
    check-cast v4, La/nuj;

    .line 603
    .line 604
    invoke-virtual {v3, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v6

    .line 608
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v7

    .line 612
    or-int/2addr v6, v7

    .line 613
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v7

    .line 617
    if-nez v6, :cond_23

    .line 618
    .line 619
    if-ne v7, v9, :cond_24

    .line 620
    .line 621
    :cond_23
    new-instance v7, La/z7;

    .line 622
    .line 623
    invoke-direct {v7, v5, v1, v2}, La/z7;-><init>(Lkotlin/jvm/functions/Function1;La/p6t0;B)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v3, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    :cond_24
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 630
    .line 631
    invoke-static {v0, v4, v7, v3, v8}, La/fbc;->t(La/mm40;La/nuj;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 635
    .line 636
    .line 637
    goto/16 :goto_9

    .line 638
    .line 639
    :cond_25
    instance-of v2, v1, La/mtj;

    .line 640
    .line 641
    const/4 v4, 0x6

    .line 642
    if-eqz v2, :cond_28

    .line 643
    .line 644
    const v2, 0x5a5afc68

    .line 645
    .line 646
    .line 647
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 648
    .line 649
    .line 650
    check-cast v1, La/mtj;

    .line 651
    .line 652
    invoke-virtual {v3, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v2

    .line 656
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v6

    .line 660
    if-nez v2, :cond_26

    .line 661
    .line 662
    if-ne v6, v9, :cond_27

    .line 663
    .line 664
    :cond_26
    new-instance v6, La/fzg;

    .line 665
    .line 666
    const/4 v2, 0x3

    .line 667
    invoke-direct {v6, v5, v2}, La/fzg;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v3, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    :cond_27
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 674
    .line 675
    iget-object v0, v0, La/vpk;->c:La/qdz;

    .line 676
    .line 677
    invoke-static {v1, v0, v6, v3, v4}, La/n4c;->e(La/mtj;La/qdz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 681
    .line 682
    .line 683
    goto/16 :goto_9

    .line 684
    .line 685
    :cond_28
    instance-of v0, v1, La/oxj;

    .line 686
    .line 687
    if-eqz v0, :cond_2b

    .line 688
    .line 689
    const v0, 0x5a6423d0

    .line 690
    .line 691
    .line 692
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 693
    .line 694
    .line 695
    invoke-static {v3}, La/xfn;->a(La/fet;)La/wfn;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    iget v15, v0, La/wfn;->c:F

    .line 700
    .line 701
    sget-object v0, La/qmk;->a:La/zcl;

    .line 702
    .line 703
    const/high16 v18, 0x41000000    # 8.0f

    .line 704
    .line 705
    const/16 v19, 0x2

    .line 706
    .line 707
    const/16 v16, 0x0

    .line 708
    .line 709
    move/from16 v17, v15

    .line 710
    .line 711
    move-object v14, v13

    .line 712
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    check-cast v1, La/oxj;

    .line 717
    .line 718
    iget-object v1, v1, La/oxj;->b:La/vrm;

    .line 719
    .line 720
    invoke-virtual {v3, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    move-result v2

    .line 724
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v4

    .line 728
    if-nez v2, :cond_29

    .line 729
    .line 730
    if-ne v4, v9, :cond_2a

    .line 731
    .line 732
    :cond_29
    new-instance v4, La/fzg;

    .line 733
    .line 734
    invoke-direct {v4, v5, v11}, La/fzg;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    :cond_2a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 741
    .line 742
    invoke-static {v0, v1, v4, v3, v8}, La/ccq0;->s(La/mm40;La/vrm;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 746
    .line 747
    .line 748
    goto/16 :goto_9

    .line 749
    .line 750
    :cond_2b
    instance-of v0, v1, La/ztj;

    .line 751
    .line 752
    if-eqz v0, :cond_35

    .line 753
    .line 754
    const v0, 0x5a6ee7e8

    .line 755
    .line 756
    .line 757
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 758
    .line 759
    .line 760
    check-cast v1, La/ztj;

    .line 761
    .line 762
    iget-object v14, v1, La/ztj;->b:La/a4x;

    .line 763
    .line 764
    invoke-virtual {v3, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v0

    .line 768
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v1

    .line 772
    if-nez v0, :cond_2c

    .line 773
    .line 774
    if-ne v1, v9, :cond_2d

    .line 775
    .line 776
    :cond_2c
    new-instance v1, La/fzg;

    .line 777
    .line 778
    const/4 v0, 0x5

    .line 779
    invoke-direct {v1, v5, v0}, La/fzg;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v3, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    :cond_2d
    move-object/from16 v16, v1

    .line 786
    .line 787
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 788
    .line 789
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    if-ne v0, v9, :cond_2e

    .line 794
    .line 795
    sget-object v0, La/ske;->s:La/ske;

    .line 796
    .line 797
    invoke-virtual {v3, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 798
    .line 799
    .line 800
    :cond_2e
    move-object/from16 v17, v0

    .line 801
    .line 802
    check-cast v17, Lkotlin/jvm/functions/Function1;

    .line 803
    .line 804
    invoke-virtual {v3, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    move-result v0

    .line 808
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    if-nez v0, :cond_2f

    .line 813
    .line 814
    if-ne v1, v9, :cond_30

    .line 815
    .line 816
    :cond_2f
    new-instance v1, La/fzg;

    .line 817
    .line 818
    invoke-direct {v1, v5, v4}, La/fzg;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v3, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 822
    .line 823
    .line 824
    :cond_30
    move-object/from16 v18, v1

    .line 825
    .line 826
    check-cast v18, Lkotlin/jvm/functions/Function1;

    .line 827
    .line 828
    invoke-virtual {v3, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 829
    .line 830
    .line 831
    move-result v0

    .line 832
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    if-nez v0, :cond_31

    .line 837
    .line 838
    if-ne v1, v9, :cond_32

    .line 839
    .line 840
    :cond_31
    new-instance v1, La/fzg;

    .line 841
    .line 842
    const/4 v0, 0x7

    .line 843
    invoke-direct {v1, v5, v0}, La/fzg;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v3, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    :cond_32
    move-object/from16 v19, v1

    .line 850
    .line 851
    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 852
    .line 853
    invoke-virtual {v3, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    move-result v0

    .line 857
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v1

    .line 861
    if-nez v0, :cond_33

    .line 862
    .line 863
    if-ne v1, v9, :cond_34

    .line 864
    .line 865
    :cond_33
    new-instance v1, La/fzg;

    .line 866
    .line 867
    const/16 v0, 0x8

    .line 868
    .line 869
    invoke-direct {v1, v5, v0}, La/fzg;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 870
    .line 871
    .line 872
    invoke-virtual {v3, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 873
    .line 874
    .line 875
    :cond_34
    move-object/from16 v20, v1

    .line 876
    .line 877
    check-cast v20, Lkotlin/jvm/functions/Function1;

    .line 878
    .line 879
    const/16 v22, 0x6000

    .line 880
    .line 881
    const/16 v23, 0x5

    .line 882
    .line 883
    const/4 v13, 0x0

    .line 884
    const/4 v15, 0x0

    .line 885
    move-object/from16 v21, v3

    .line 886
    .line 887
    invoke-static/range {v13 .. v23}, La/feb;->m(La/mm40;La/a4x;La/xcz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 891
    .line 892
    .line 893
    goto :goto_9

    .line 894
    :cond_35
    :goto_8
    const v0, 0x5a7a1389

    .line 895
    .line 896
    .line 897
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 898
    .line 899
    .line 900
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 901
    .line 902
    .line 903
    :goto_9
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 904
    .line 905
    .line 906
    goto :goto_a

    .line 907
    :cond_36
    move-object v3, v13

    .line 908
    invoke-virtual {v3}, La/fet;->X()V

    .line 909
    .line 910
    .line 911
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 912
    .line 913
    return-object v0

    .line 914
    nop

    .line 915
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
