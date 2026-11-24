.class public final synthetic La/e2s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/e2s;->a:B

    iput-object p1, p0, La/e2s;->b:La/mm40;

    iput-object p2, p0, La/e2s;->c:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/l7m0;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/e2s;->a:B

    iput-object p1, p0, La/e2s;->b:La/mm40;

    iput-object p2, p0, La/e2s;->c:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e2s;->a:B

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/4 v3, 0x6

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v6, v0, La/e2s;->c:La/l7m0;

    .line 10
    .line 11
    iget-object v0, v0, La/e2s;->b:La/mm40;

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/fet;

    .line 20
    .line 21
    move-object/from16 v3, p2

    .line 22
    .line 23
    check-cast v3, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {v2, v1, v0, v6}, La/ghm0;->m(ILa/fet;La/mm40;La/l7m0;)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    move-object/from16 v1, p1

    .line 39
    .line 40
    check-cast v1, La/fet;

    .line 41
    .line 42
    move-object/from16 v2, p2

    .line 43
    .line 44
    check-cast v2, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v7}, La/x8x;->L(I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-static {v2, v1, v0, v6}, La/btm0;->j(ILa/fet;La/mm40;La/l7m0;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_1
    move-object/from16 v1, p1

    .line 60
    .line 61
    check-cast v1, La/fet;

    .line 62
    .line 63
    move-object/from16 v2, p2

    .line 64
    .line 65
    check-cast v2, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {v7}, La/x8x;->L(I)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-static {v2, v1, v0, v6}, La/o050;->I(ILa/fet;La/mm40;La/l7m0;)V

    .line 75
    .line 76
    .line 77
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_2
    move-object/from16 v1, p1

    .line 81
    .line 82
    check-cast v1, La/fet;

    .line 83
    .line 84
    move-object/from16 v3, p2

    .line 85
    .line 86
    check-cast v3, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {v2}, La/x8x;->L(I)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-static {v2, v1, v0, v6}, La/t9x;->o(ILa/fet;La/mm40;La/l7m0;)V

    .line 96
    .line 97
    .line 98
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_3
    move-object/from16 v1, p1

    .line 102
    .line 103
    check-cast v1, La/fet;

    .line 104
    .line 105
    move-object/from16 v2, p2

    .line 106
    .line 107
    check-cast v2, Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    and-int/lit8 v8, v2, 0x3

    .line 114
    .line 115
    if-eq v8, v4, :cond_0

    .line 116
    .line 117
    move v5, v7

    .line 118
    :cond_0
    and-int/2addr v2, v7

    .line 119
    invoke-virtual {v1, v2, v5}, La/fet;->U(IZ)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_1

    .line 124
    .line 125
    invoke-static {v3, v1, v0, v6}, La/ghm0;->m(ILa/fet;La/mm40;La/l7m0;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_1
    invoke-virtual {v1}, La/fet;->X()V

    .line 130
    .line 131
    .line 132
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_4
    move-object/from16 v1, p1

    .line 136
    .line 137
    check-cast v1, La/fet;

    .line 138
    .line 139
    move-object/from16 v2, p2

    .line 140
    .line 141
    check-cast v2, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    and-int/lit8 v8, v2, 0x3

    .line 148
    .line 149
    if-eq v8, v4, :cond_2

    .line 150
    .line 151
    move v5, v7

    .line 152
    :cond_2
    and-int/2addr v2, v7

    .line 153
    invoke-virtual {v1, v2, v5}, La/fet;->U(IZ)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_3

    .line 158
    .line 159
    invoke-static {v3, v1, v0, v6}, La/zdx;->d(ILa/fet;La/mm40;La/l7m0;)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_3
    invoke-virtual {v1}, La/fet;->X()V

    .line 164
    .line 165
    .line 166
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_5
    move-object/from16 v1, p1

    .line 170
    .line 171
    check-cast v1, La/fet;

    .line 172
    .line 173
    move-object/from16 v2, p2

    .line 174
    .line 175
    check-cast v2, Ljava/lang/Integer;

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    and-int/lit8 v8, v2, 0x3

    .line 182
    .line 183
    if-eq v8, v4, :cond_4

    .line 184
    .line 185
    move v5, v7

    .line 186
    :cond_4
    and-int/2addr v2, v7

    .line 187
    invoke-virtual {v1, v2, v5}, La/fet;->U(IZ)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-eqz v2, :cond_5

    .line 192
    .line 193
    invoke-static {v3, v1, v0, v6}, La/ghm0;->m(ILa/fet;La/mm40;La/l7m0;)V

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_5
    invoke-virtual {v1}, La/fet;->X()V

    .line 198
    .line 199
    .line 200
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_6
    move-object/from16 v1, p1

    .line 204
    .line 205
    check-cast v1, La/fet;

    .line 206
    .line 207
    move-object/from16 v2, p2

    .line 208
    .line 209
    check-cast v2, Ljava/lang/Integer;

    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    and-int/lit8 v8, v2, 0x3

    .line 216
    .line 217
    if-eq v8, v4, :cond_6

    .line 218
    .line 219
    move v5, v7

    .line 220
    :cond_6
    and-int/2addr v2, v7

    .line 221
    invoke-virtual {v1, v2, v5}, La/fet;->U(IZ)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_7

    .line 226
    .line 227
    invoke-static {v3, v1, v0, v6}, La/zdx;->d(ILa/fet;La/mm40;La/l7m0;)V

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_7
    invoke-virtual {v1}, La/fet;->X()V

    .line 232
    .line 233
    .line 234
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object v0

    .line 237
    :pswitch_7
    move-object/from16 v1, p1

    .line 238
    .line 239
    check-cast v1, La/fet;

    .line 240
    .line 241
    move-object/from16 v2, p2

    .line 242
    .line 243
    check-cast v2, Ljava/lang/Integer;

    .line 244
    .line 245
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-static {v7}, La/x8x;->L(I)I

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    invoke-static {v2, v1, v0, v6}, La/jiq0;->f(ILa/fet;La/mm40;La/l7m0;)V

    .line 253
    .line 254
    .line 255
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    return-object v0

    .line 258
    :pswitch_8
    move-object/from16 v10, p1

    .line 259
    .line 260
    check-cast v10, La/fet;

    .line 261
    .line 262
    move-object/from16 v1, p2

    .line 263
    .line 264
    check-cast v1, Ljava/lang/Integer;

    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    sget-object v2, La/j2s;->b2:La/xak;

    .line 271
    .line 272
    and-int/lit8 v2, v1, 0x3

    .line 273
    .line 274
    if-eq v2, v4, :cond_8

    .line 275
    .line 276
    move v2, v7

    .line 277
    goto :goto_4

    .line 278
    :cond_8
    move v2, v5

    .line 279
    :goto_4
    and-int/2addr v1, v7

    .line 280
    invoke-virtual {v10, v1, v2}, La/fet;->U(IZ)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_10

    .line 285
    .line 286
    sget-object v1, La/uc9;->e:La/nw3;

    .line 287
    .line 288
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    sget-object v2, La/o7k0;->c:La/n0q;

    .line 292
    .line 293
    invoke-interface {v0, v2}, La/mm40;->e(La/mm40;)La/mm40;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    check-cast v2, La/ynd;

    .line 302
    .line 303
    if-nez v2, :cond_9

    .line 304
    .line 305
    const v0, -0x463edfcf

    .line 306
    .line 307
    .line 308
    invoke-virtual {v10, v0}, La/fet;->e0(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v10, v5}, La/fet;->r(Z)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_5

    .line 315
    .line 316
    :cond_9
    instance-of v3, v2, La/und;

    .line 317
    .line 318
    if-eqz v3, :cond_a

    .line 319
    .line 320
    const v1, 0x58924294

    .line 321
    .line 322
    .line 323
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 324
    .line 325
    .line 326
    check-cast v2, La/und;

    .line 327
    .line 328
    invoke-static {v0, v2, v10, v5}, La/b34;->m(La/mm40;La/und;La/fet;I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v10, v5}, La/fet;->r(Z)V

    .line 332
    .line 333
    .line 334
    goto/16 :goto_5

    .line 335
    .line 336
    :cond_a
    instance-of v3, v2, La/snd;

    .line 337
    .line 338
    const/16 v6, 0xe

    .line 339
    .line 340
    const/high16 v8, 0x41000000    # 8.0f

    .line 341
    .line 342
    if-eqz v3, :cond_b

    .line 343
    .line 344
    const v1, 0x589250b6

    .line 345
    .line 346
    .line 347
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 348
    .line 349
    .line 350
    check-cast v2, La/snd;

    .line 351
    .line 352
    sget-object v1, La/qmk;->a:La/zcl;

    .line 353
    .line 354
    invoke-static {v0, v8}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    new-instance v1, La/qw3;

    .line 359
    .line 360
    new-instance v3, La/jf4;

    .line 361
    .line 362
    invoke-direct {v3, v6}, La/jf4;-><init>(B)V

    .line 363
    .line 364
    .line 365
    invoke-direct {v1, v8, v7, v3}, La/qw3;-><init>(FZLa/rw3;)V

    .line 366
    .line 367
    .line 368
    new-instance v3, La/pnd;

    .line 369
    .line 370
    invoke-direct {v3, v2, v5}, La/pnd;-><init>(La/snd;B)V

    .line 371
    .line 372
    .line 373
    const v4, -0x44699b6d    # -0.004589626f

    .line 374
    .line 375
    .line 376
    invoke-static {v4, v3, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 377
    .line 378
    .line 379
    move-result-object v8

    .line 380
    new-instance v3, La/pnd;

    .line 381
    .line 382
    invoke-direct {v3, v2, v7}, La/pnd;-><init>(La/snd;B)V

    .line 383
    .line 384
    .line 385
    const v2, 0x70d1994

    .line 386
    .line 387
    .line 388
    invoke-static {v2, v3, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 389
    .line 390
    .line 391
    move-result-object v9

    .line 392
    const/16 v11, 0xd80

    .line 393
    .line 394
    const/4 v12, 0x0

    .line 395
    move-object v6, v0

    .line 396
    move-object v7, v1

    .line 397
    invoke-static/range {v6 .. v12}, La/kc5;->T(La/mm40;La/pw3;La/ugd;La/ugd;La/fet;II)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v10, v5}, La/fet;->r(Z)V

    .line 401
    .line 402
    .line 403
    goto/16 :goto_5

    .line 404
    .line 405
    :cond_b
    instance-of v3, v2, La/yod;

    .line 406
    .line 407
    if-eqz v3, :cond_c

    .line 408
    .line 409
    const v3, 0x58925f58

    .line 410
    .line 411
    .line 412
    invoke-virtual {v10, v3}, La/fet;->e0(I)V

    .line 413
    .line 414
    .line 415
    check-cast v2, La/yod;

    .line 416
    .line 417
    sget-object v3, La/qmk;->a:La/zcl;

    .line 418
    .line 419
    invoke-static {v0, v8}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 420
    .line 421
    .line 422
    move-result-object v6

    .line 423
    new-instance v0, La/wod;

    .line 424
    .line 425
    invoke-direct {v0, v2, v5}, La/wod;-><init>(La/yod;B)V

    .line 426
    .line 427
    .line 428
    const v3, -0x3e5802b2

    .line 429
    .line 430
    .line 431
    invoke-static {v3, v0, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 432
    .line 433
    .line 434
    move-result-object v8

    .line 435
    new-instance v0, La/wod;

    .line 436
    .line 437
    invoke-direct {v0, v2, v7}, La/wod;-><init>(La/yod;B)V

    .line 438
    .line 439
    .line 440
    const v2, -0x23c9a693

    .line 441
    .line 442
    .line 443
    invoke-static {v2, v0, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 444
    .line 445
    .line 446
    move-result-object v9

    .line 447
    const/16 v11, 0xdb0

    .line 448
    .line 449
    const/4 v12, 0x0

    .line 450
    move-object v7, v1

    .line 451
    invoke-static/range {v6 .. v12}, La/kc5;->T(La/mm40;La/pw3;La/ugd;La/ugd;La/fet;II)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v10, v5}, La/fet;->r(Z)V

    .line 455
    .line 456
    .line 457
    goto/16 :goto_5

    .line 458
    .line 459
    :cond_c
    instance-of v3, v2, La/kpd;

    .line 460
    .line 461
    if-eqz v3, :cond_d

    .line 462
    .line 463
    const v3, 0x58926e90

    .line 464
    .line 465
    .line 466
    invoke-virtual {v10, v3}, La/fet;->e0(I)V

    .line 467
    .line 468
    .line 469
    check-cast v2, La/kpd;

    .line 470
    .line 471
    sget-object v3, La/qmk;->a:La/zcl;

    .line 472
    .line 473
    invoke-static {v0, v8}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 474
    .line 475
    .line 476
    move-result-object v6

    .line 477
    new-instance v0, La/hpd;

    .line 478
    .line 479
    invoke-direct {v0, v2, v5}, La/hpd;-><init>(La/kpd;B)V

    .line 480
    .line 481
    .line 482
    const v3, -0x55792318

    .line 483
    .line 484
    .line 485
    invoke-static {v3, v0, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 486
    .line 487
    .line 488
    move-result-object v8

    .line 489
    new-instance v0, La/hpd;

    .line 490
    .line 491
    invoke-direct {v0, v2, v7}, La/hpd;-><init>(La/kpd;B)V

    .line 492
    .line 493
    .line 494
    const v2, -0x1cbd55f9

    .line 495
    .line 496
    .line 497
    invoke-static {v2, v0, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 498
    .line 499
    .line 500
    move-result-object v9

    .line 501
    const/16 v11, 0xdb0

    .line 502
    .line 503
    const/4 v12, 0x0

    .line 504
    move-object v7, v1

    .line 505
    invoke-static/range {v6 .. v12}, La/kc5;->T(La/mm40;La/pw3;La/ugd;La/ugd;La/fet;II)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v10, v5}, La/fet;->r(Z)V

    .line 509
    .line 510
    .line 511
    goto/16 :goto_5

    .line 512
    .line 513
    :cond_d
    instance-of v3, v2, La/opd;

    .line 514
    .line 515
    if-eqz v3, :cond_e

    .line 516
    .line 517
    const v1, 0x58928079

    .line 518
    .line 519
    .line 520
    invoke-virtual {v10, v1}, La/fet;->e0(I)V

    .line 521
    .line 522
    .line 523
    check-cast v2, La/opd;

    .line 524
    .line 525
    sget-object v1, La/qmk;->a:La/zcl;

    .line 526
    .line 527
    invoke-static {v0, v8}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    new-instance v1, La/qw3;

    .line 532
    .line 533
    new-instance v3, La/jf4;

    .line 534
    .line 535
    invoke-direct {v3, v6}, La/jf4;-><init>(B)V

    .line 536
    .line 537
    .line 538
    invoke-direct {v1, v8, v7, v3}, La/qw3;-><init>(FZLa/rw3;)V

    .line 539
    .line 540
    .line 541
    new-instance v3, La/npd;

    .line 542
    .line 543
    invoke-direct {v3, v2, v5}, La/npd;-><init>(La/opd;B)V

    .line 544
    .line 545
    .line 546
    const v4, 0x5bd11e48

    .line 547
    .line 548
    .line 549
    invoke-static {v4, v3, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 550
    .line 551
    .line 552
    move-result-object v8

    .line 553
    new-instance v3, La/npd;

    .line 554
    .line 555
    invoke-direct {v3, v2, v7}, La/npd;-><init>(La/opd;B)V

    .line 556
    .line 557
    .line 558
    const v2, -0x6e79ad19

    .line 559
    .line 560
    .line 561
    invoke-static {v2, v3, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 562
    .line 563
    .line 564
    move-result-object v9

    .line 565
    const/16 v11, 0xd80

    .line 566
    .line 567
    const/4 v12, 0x0

    .line 568
    move-object v6, v0

    .line 569
    move-object v7, v1

    .line 570
    invoke-static/range {v6 .. v12}, La/kc5;->T(La/mm40;La/pw3;La/ugd;La/ugd;La/fet;II)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v10, v5}, La/fet;->r(Z)V

    .line 574
    .line 575
    .line 576
    goto :goto_5

    .line 577
    :cond_e
    instance-of v3, v2, La/epd;

    .line 578
    .line 579
    if-eqz v3, :cond_f

    .line 580
    .line 581
    const v3, 0x58928ff1

    .line 582
    .line 583
    .line 584
    invoke-virtual {v10, v3}, La/fet;->e0(I)V

    .line 585
    .line 586
    .line 587
    check-cast v2, La/epd;

    .line 588
    .line 589
    sget-object v3, La/qmk;->a:La/zcl;

    .line 590
    .line 591
    const/4 v3, 0x0

    .line 592
    invoke-static {v0, v8, v3, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 593
    .line 594
    .line 595
    move-result-object v11

    .line 596
    const/4 v15, 0x0

    .line 597
    const/16 v16, 0xd

    .line 598
    .line 599
    const/4 v12, 0x0

    .line 600
    const/high16 v13, 0x41000000    # 8.0f

    .line 601
    .line 602
    const/4 v14, 0x0

    .line 603
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 604
    .line 605
    .line 606
    move-result-object v6

    .line 607
    new-instance v0, La/awh;

    .line 608
    .line 609
    const/16 v3, 0x18

    .line 610
    .line 611
    invoke-direct {v0, v2, v3}, La/awh;-><init>(Ljava/lang/Object;B)V

    .line 612
    .line 613
    .line 614
    const v2, 0x7b0bc611

    .line 615
    .line 616
    .line 617
    invoke-static {v2, v0, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 618
    .line 619
    .line 620
    move-result-object v9

    .line 621
    const/16 v11, 0xc30

    .line 622
    .line 623
    const/4 v12, 0x4

    .line 624
    const/4 v8, 0x0

    .line 625
    move-object v7, v1

    .line 626
    invoke-static/range {v6 .. v12}, La/kc5;->T(La/mm40;La/pw3;La/ugd;La/ugd;La/fet;II)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v10, v5}, La/fet;->r(Z)V

    .line 630
    .line 631
    .line 632
    goto :goto_5

    .line 633
    :cond_f
    const v0, 0x58923bc2

    .line 634
    .line 635
    .line 636
    invoke-static {v0, v10, v5}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    throw v0

    .line 641
    :cond_10
    invoke-virtual {v10}, La/fet;->X()V

    .line 642
    .line 643
    .line 644
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 645
    .line 646
    return-object v0

    .line 647
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
