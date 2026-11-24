.class public final synthetic La/ay;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/l7m0;La/l7m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/ay;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ay;->b:La/l7m0;

    iput-object p2, p0, La/ay;->c:La/l7m0;

    iput-object p3, p0, La/ay;->d:La/l7m0;

    return-void
.end method

.method public synthetic constructor <init>(La/l7m0;La/l7m0;La/l7m0;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/ay;->a:B

    iput-object p1, p0, La/ay;->b:La/l7m0;

    iput-object p2, p0, La/ay;->c:La/l7m0;

    iput-object p3, p0, La/ay;->d:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ay;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    sget-object v4, La/jm40;->b:La/jm40;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    iget-object v7, v0, La/ay;->d:La/l7m0;

    .line 14
    .line 15
    iget-object v8, v0, La/ay;->c:La/l7m0;

    .line 16
    .line 17
    iget-object v0, v0, La/ay;->b:La/l7m0;

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v14, p1

    .line 24
    .line 25
    check-cast v14, La/fet;

    .line 26
    .line 27
    move-object/from16 v1, p2

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    and-int/lit8 v10, v1, 0x3

    .line 36
    .line 37
    if-eq v10, v5, :cond_0

    .line 38
    .line 39
    move v5, v6

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v5, v9

    .line 42
    :goto_0
    and-int/2addr v1, v6

    .line 43
    invoke-virtual {v14, v1, v5}, La/fet;->U(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, La/l7m0;

    .line 54
    .line 55
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, La/sgs0;

    .line 60
    .line 61
    sget-object v1, La/qgs0;->a:La/qgs0;

    .line 62
    .line 63
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    instance-of v0, v0, La/rgs0;

    .line 70
    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    const v0, -0x6251344f

    .line 75
    .line 76
    .line 77
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v14, v9}, La/fet;->r(Z)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    :goto_1
    const v0, 0x18222436

    .line 85
    .line 86
    .line 87
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 88
    .line 89
    .line 90
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-ne v1, v2, :cond_3

    .line 99
    .line 100
    new-instance v1, La/g4s0;

    .line 101
    .line 102
    const/16 v2, 0x14

    .line 103
    .line 104
    invoke-direct {v1, v2}, La/g4s0;-><init>(B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v14, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 111
    .line 112
    invoke-static {v0, v1}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    move-object v11, v0

    .line 121
    check-cast v11, La/l7m0;

    .line 122
    .line 123
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    const/4 v13, 0x0

    .line 134
    const/4 v15, 0x0

    .line 135
    invoke-static/range {v10 .. v15}, La/jeb;->B(La/mm40;La/l7m0;FFLa/fet;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v14, v9}, La/fet;->r(Z)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    invoke-virtual {v14}, La/fet;->X()V

    .line 143
    .line 144
    .line 145
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object v0

    .line 148
    :pswitch_0
    move-object/from16 v1, p1

    .line 149
    .line 150
    check-cast v1, La/fet;

    .line 151
    .line 152
    move-object/from16 v10, p2

    .line 153
    .line 154
    check-cast v10, Ljava/lang/Integer;

    .line 155
    .line 156
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    and-int/lit8 v11, v10, 0x3

    .line 161
    .line 162
    if-eq v11, v5, :cond_5

    .line 163
    .line 164
    move v5, v6

    .line 165
    goto :goto_3

    .line 166
    :cond_5
    move v5, v9

    .line 167
    :goto_3
    and-int/2addr v6, v10

    .line 168
    invoke-virtual {v1, v6, v5}, La/fet;->U(IZ)Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eqz v5, :cond_a

    .line 173
    .line 174
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, La/l7m0;

    .line 179
    .line 180
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, La/fpb0;

    .line 185
    .line 186
    if-nez v0, :cond_7

    .line 187
    .line 188
    :cond_6
    move-object v5, v1

    .line 189
    goto :goto_5

    .line 190
    :cond_7
    instance-of v5, v0, La/epb0;

    .line 191
    .line 192
    if-eqz v5, :cond_8

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_8
    instance-of v0, v0, La/dpb0;

    .line 196
    .line 197
    if-eqz v0, :cond_6

    .line 198
    .line 199
    :goto_4
    const v0, -0x3a70f48e

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 203
    .line 204
    .line 205
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    if-ne v3, v2, :cond_9

    .line 214
    .line 215
    new-instance v3, La/peb0;

    .line 216
    .line 217
    const/16 v2, 0x1b

    .line 218
    .line 219
    invoke-direct {v3, v2}, La/peb0;-><init>(B)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 226
    .line 227
    invoke-static {v0, v3}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    check-cast v2, La/l7m0;

    .line 236
    .line 237
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    check-cast v3, Ljava/lang/Number;

    .line 242
    .line 243
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    const/4 v4, 0x0

    .line 248
    const/4 v6, 0x0

    .line 249
    move-object v5, v1

    .line 250
    move-object v1, v0

    .line 251
    invoke-static/range {v1 .. v6}, La/jeb;->B(La/mm40;La/l7m0;FFLa/fet;I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5, v9}, La/fet;->r(Z)V

    .line 255
    .line 256
    .line 257
    goto :goto_6

    .line 258
    :goto_5
    const v0, 0x2faa02c9

    .line 259
    .line 260
    .line 261
    invoke-virtual {v5, v0}, La/fet;->e0(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5, v9}, La/fet;->r(Z)V

    .line 265
    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_a
    move-object v5, v1

    .line 269
    invoke-virtual {v5}, La/fet;->X()V

    .line 270
    .line 271
    .line 272
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object v0

    .line 275
    :pswitch_1
    move v1, v6

    .line 276
    move-object/from16 v6, p1

    .line 277
    .line 278
    check-cast v6, La/fet;

    .line 279
    .line 280
    move-object/from16 v10, p2

    .line 281
    .line 282
    check-cast v10, Ljava/lang/Integer;

    .line 283
    .line 284
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    and-int/lit8 v11, v10, 0x3

    .line 289
    .line 290
    if-eq v11, v5, :cond_b

    .line 291
    .line 292
    move v9, v1

    .line 293
    :cond_b
    and-int/2addr v1, v10

    .line 294
    invoke-virtual {v6, v1, v9}, La/fet;->U(IZ)Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-eqz v1, :cond_d

    .line 299
    .line 300
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    if-ne v3, v2, :cond_c

    .line 309
    .line 310
    new-instance v3, La/h7w;

    .line 311
    .line 312
    const/16 v2, 0x16

    .line 313
    .line 314
    invoke-direct {v3, v2}, La/h7w;-><init>(B)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v6, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 321
    .line 322
    invoke-static {v1, v3}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    move-object v3, v0

    .line 331
    check-cast v3, La/l7m0;

    .line 332
    .line 333
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    move-object v2, v0

    .line 338
    check-cast v2, La/l7m0;

    .line 339
    .line 340
    sget-object v0, La/qmk;->a:La/zcl;

    .line 341
    .line 342
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    check-cast v0, Ljava/lang/Number;

    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    const/4 v7, 0x0

    .line 353
    const/4 v8, 0x0

    .line 354
    const/high16 v5, 0x42000000    # 32.0f

    .line 355
    .line 356
    invoke-static/range {v1 .. v8}, La/jeb;->C(La/mm40;La/l7m0;La/l7m0;FFLa/fet;II)V

    .line 357
    .line 358
    .line 359
    goto :goto_7

    .line 360
    :cond_d
    invoke-virtual {v6}, La/fet;->X()V

    .line 361
    .line 362
    .line 363
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    return-object v0

    .line 366
    :pswitch_2
    move v1, v6

    .line 367
    move-object/from16 v6, p1

    .line 368
    .line 369
    check-cast v6, La/fet;

    .line 370
    .line 371
    move-object/from16 v10, p2

    .line 372
    .line 373
    check-cast v10, Ljava/lang/Integer;

    .line 374
    .line 375
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 376
    .line 377
    .line 378
    move-result v10

    .line 379
    and-int/lit8 v11, v10, 0x3

    .line 380
    .line 381
    if-eq v11, v5, :cond_e

    .line 382
    .line 383
    move v5, v1

    .line 384
    goto :goto_8

    .line 385
    :cond_e
    move v5, v9

    .line 386
    :goto_8
    and-int/2addr v1, v10

    .line 387
    invoke-virtual {v6, v1, v5}, La/fet;->U(IZ)Z

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    if-eqz v1, :cond_10

    .line 392
    .line 393
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    if-ne v3, v2, :cond_f

    .line 402
    .line 403
    new-instance v3, La/nk7;

    .line 404
    .line 405
    invoke-direct {v3, v9}, La/nk7;-><init>(B)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v6, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    :cond_f
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 412
    .line 413
    invoke-static {v1, v3}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    move-object v2, v0

    .line 422
    check-cast v2, La/l7m0;

    .line 423
    .line 424
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    move-object v3, v0

    .line 429
    check-cast v3, La/l7m0;

    .line 430
    .line 431
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    check-cast v0, Ljava/lang/Number;

    .line 436
    .line 437
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    const/4 v7, 0x0

    .line 442
    const/16 v8, 0x10

    .line 443
    .line 444
    const/4 v5, 0x0

    .line 445
    invoke-static/range {v1 .. v8}, La/jeb;->C(La/mm40;La/l7m0;La/l7m0;FFLa/fet;II)V

    .line 446
    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_10
    invoke-virtual {v6}, La/fet;->X()V

    .line 450
    .line 451
    .line 452
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 453
    .line 454
    return-object v0

    .line 455
    :pswitch_3
    move v1, v6

    .line 456
    move-object/from16 v15, p1

    .line 457
    .line 458
    check-cast v15, La/fet;

    .line 459
    .line 460
    move-object/from16 v2, p2

    .line 461
    .line 462
    check-cast v2, Ljava/lang/Integer;

    .line 463
    .line 464
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 465
    .line 466
    .line 467
    move-result v2

    .line 468
    and-int/lit8 v3, v2, 0x3

    .line 469
    .line 470
    if-eq v3, v5, :cond_11

    .line 471
    .line 472
    move v9, v1

    .line 473
    :cond_11
    and-int/2addr v2, v1

    .line 474
    invoke-virtual {v15, v2, v9}, La/fet;->U(IZ)Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-eqz v2, :cond_16

    .line 479
    .line 480
    sget-object v2, La/qmk;->a:La/zcl;

    .line 481
    .line 482
    const/high16 v2, 0x41600000    # 14.0f

    .line 483
    .line 484
    invoke-static {v4, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    sget-object v3, La/gqw0;->k:La/yx7;

    .line 489
    .line 490
    new-instance v5, La/qw3;

    .line 491
    .line 492
    new-instance v6, La/jf4;

    .line 493
    .line 494
    const/16 v9, 0xe

    .line 495
    .line 496
    invoke-direct {v6, v9}, La/jf4;-><init>(B)V

    .line 497
    .line 498
    .line 499
    const/high16 v10, 0x41000000    # 8.0f

    .line 500
    .line 501
    invoke-direct {v5, v10, v1, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 502
    .line 503
    .line 504
    const/16 v6, 0x30

    .line 505
    .line 506
    invoke-static {v5, v3, v15, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 507
    .line 508
    .line 509
    move-result-object v5

    .line 510
    iget-wide v10, v15, La/fet;->T:J

    .line 511
    .line 512
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 513
    .line 514
    .line 515
    move-result v10

    .line 516
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 517
    .line 518
    .line 519
    move-result-object v11

    .line 520
    invoke-static {v15, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 525
    .line 526
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v15}, La/fet;->i0()V

    .line 530
    .line 531
    .line 532
    iget-boolean v12, v15, La/fet;->S:Z

    .line 533
    .line 534
    sget-object v13, La/e7z;->u1:La/pcy;

    .line 535
    .line 536
    if-eqz v12, :cond_12

    .line 537
    .line 538
    invoke-virtual {v15, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 539
    .line 540
    .line 541
    goto :goto_a

    .line 542
    :cond_12
    invoke-virtual {v15}, La/fet;->r0()V

    .line 543
    .line 544
    .line 545
    :goto_a
    sget-object v12, La/gqw0;->x:La/shd;

    .line 546
    .line 547
    invoke-static {v15, v5, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 548
    .line 549
    .line 550
    sget-object v5, La/gqw0;->w:La/shd;

    .line 551
    .line 552
    invoke-static {v15, v11, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 553
    .line 554
    .line 555
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 556
    .line 557
    .line 558
    move-result-object v10

    .line 559
    sget-object v11, La/gqw0;->y:La/shd;

    .line 560
    .line 561
    invoke-static {v15, v10, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 562
    .line 563
    .line 564
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 565
    .line 566
    .line 567
    sget-object v10, La/gqw0;->v:La/shd;

    .line 568
    .line 569
    invoke-static {v15, v2, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 570
    .line 571
    .line 572
    new-instance v2, La/qw3;

    .line 573
    .line 574
    new-instance v14, La/jf4;

    .line 575
    .line 576
    invoke-direct {v14, v9}, La/jf4;-><init>(B)V

    .line 577
    .line 578
    .line 579
    move-object/from16 v19, v0

    .line 580
    .line 581
    const/high16 v0, 0x40000000    # 2.0f

    .line 582
    .line 583
    invoke-direct {v2, v0, v1, v14}, La/qw3;-><init>(FZLa/rw3;)V

    .line 584
    .line 585
    .line 586
    invoke-static {v2, v3, v15, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    move-object/from16 v34, v7

    .line 591
    .line 592
    iget-wide v6, v15, La/fet;->T:J

    .line 593
    .line 594
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 595
    .line 596
    .line 597
    move-result v6

    .line 598
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    invoke-static {v15, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 603
    .line 604
    .line 605
    move-result-object v14

    .line 606
    invoke-virtual {v15}, La/fet;->i0()V

    .line 607
    .line 608
    .line 609
    iget-boolean v9, v15, La/fet;->S:Z

    .line 610
    .line 611
    if-eqz v9, :cond_13

    .line 612
    .line 613
    invoke-virtual {v15, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 614
    .line 615
    .line 616
    goto :goto_b

    .line 617
    :cond_13
    invoke-virtual {v15}, La/fet;->r0()V

    .line 618
    .line 619
    .line 620
    :goto_b
    invoke-static {v15, v2, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 621
    .line 622
    .line 623
    invoke-static {v15, v7, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 624
    .line 625
    .line 626
    invoke-static {v6, v15, v11, v15}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 627
    .line 628
    .line 629
    invoke-static {v15, v14, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 630
    .line 631
    .line 632
    const/high16 v2, 0x41400000    # 12.0f

    .line 633
    .line 634
    move-object v6, v11

    .line 635
    invoke-static {v4, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 636
    .line 637
    .line 638
    move-result-object v11

    .line 639
    const v7, 0x7f0807b6

    .line 640
    .line 641
    .line 642
    const/4 v9, 0x6

    .line 643
    invoke-static {v7, v9, v15}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 644
    .line 645
    .line 646
    move-result-object v7

    .line 647
    invoke-static {v7, v15}, La/iom0;->r(La/r2x;La/fet;)La/s4u0;

    .line 648
    .line 649
    .line 650
    move-result-object v7

    .line 651
    const/16 v18, 0x78

    .line 652
    .line 653
    move-object v14, v10

    .line 654
    const/4 v10, 0x0

    .line 655
    move-object/from16 v16, v12

    .line 656
    .line 657
    const/4 v12, 0x0

    .line 658
    move-object/from16 v17, v13

    .line 659
    .line 660
    const/4 v13, 0x0

    .line 661
    move-object/from16 v20, v14

    .line 662
    .line 663
    const/4 v14, 0x0

    .line 664
    move-object/from16 v29, v15

    .line 665
    .line 666
    const/4 v15, 0x0

    .line 667
    move-object/from16 v21, v17

    .line 668
    .line 669
    const/16 v17, 0x38

    .line 670
    .line 671
    move-object v9, v7

    .line 672
    move-object/from16 v2, v20

    .line 673
    .line 674
    move-object/from16 v36, v21

    .line 675
    .line 676
    const/16 v0, 0xe

    .line 677
    .line 678
    move-object v7, v6

    .line 679
    move-object/from16 v6, v16

    .line 680
    .line 681
    move-object/from16 v16, v29

    .line 682
    .line 683
    invoke-static/range {v9 .. v18}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 684
    .line 685
    .line 686
    move/from16 v37, v17

    .line 687
    .line 688
    invoke-interface/range {v19 .. v19}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v9

    .line 692
    check-cast v9, Ljava/lang/Number;

    .line 693
    .line 694
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 695
    .line 696
    .line 697
    move-result v9

    .line 698
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v9

    .line 702
    const/4 v11, 0x3

    .line 703
    move-object v12, v10

    .line 704
    invoke-static {v4, v12, v11}, La/o7k0;->A(La/mm40;La/xx7;I)La/mm40;

    .line 705
    .line 706
    .line 707
    move-result-object v10

    .line 708
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 709
    .line 710
    .line 711
    move-result-object v29

    .line 712
    sget-object v13, La/s6t0;->a:La/pz40;

    .line 713
    .line 714
    sget-object v38, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 715
    .line 716
    move v13, v11

    .line 717
    move-object v14, v12

    .line 718
    invoke-virtual/range {v38 .. v38}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 719
    .line 720
    .line 721
    move-result-wide v11

    .line 722
    const/16 v32, 0x0

    .line 723
    .line 724
    const v33, 0x1fff8

    .line 725
    .line 726
    .line 727
    move v15, v13

    .line 728
    const/4 v13, 0x0

    .line 729
    move-object/from16 v18, v14

    .line 730
    .line 731
    move/from16 v17, v15

    .line 732
    .line 733
    const-wide/16 v14, 0x0

    .line 734
    .line 735
    move-object/from16 v30, v16

    .line 736
    .line 737
    const/16 v16, 0x0

    .line 738
    .line 739
    move/from16 v19, v17

    .line 740
    .line 741
    const/16 v17, 0x0

    .line 742
    .line 743
    move-object/from16 v20, v18

    .line 744
    .line 745
    const/16 v18, 0x0

    .line 746
    .line 747
    move/from16 v21, v19

    .line 748
    .line 749
    move-object/from16 v22, v20

    .line 750
    .line 751
    const-wide/16 v19, 0x0

    .line 752
    .line 753
    move/from16 v23, v21

    .line 754
    .line 755
    const/16 v21, 0x0

    .line 756
    .line 757
    move-object/from16 v25, v22

    .line 758
    .line 759
    move/from16 v24, v23

    .line 760
    .line 761
    const-wide/16 v22, 0x0

    .line 762
    .line 763
    move/from16 v26, v24

    .line 764
    .line 765
    const/16 v24, 0x0

    .line 766
    .line 767
    move-object/from16 v27, v25

    .line 768
    .line 769
    const/16 v25, 0x0

    .line 770
    .line 771
    move/from16 v28, v26

    .line 772
    .line 773
    const/16 v26, 0x0

    .line 774
    .line 775
    move-object/from16 v31, v27

    .line 776
    .line 777
    const/16 v27, 0x0

    .line 778
    .line 779
    move/from16 v39, v28

    .line 780
    .line 781
    const/16 v28, 0x0

    .line 782
    .line 783
    move-object/from16 v40, v31

    .line 784
    .line 785
    const/16 v31, 0x30

    .line 786
    .line 787
    invoke-static/range {v9 .. v33}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 788
    .line 789
    .line 790
    move-object/from16 v15, v30

    .line 791
    .line 792
    invoke-virtual {v15, v1}, La/fet;->r(Z)V

    .line 793
    .line 794
    .line 795
    new-instance v9, La/qw3;

    .line 796
    .line 797
    new-instance v10, La/jf4;

    .line 798
    .line 799
    invoke-direct {v10, v0}, La/jf4;-><init>(B)V

    .line 800
    .line 801
    .line 802
    const/high16 v11, 0x40000000    # 2.0f

    .line 803
    .line 804
    invoke-direct {v9, v11, v1, v10}, La/qw3;-><init>(FZLa/rw3;)V

    .line 805
    .line 806
    .line 807
    const/16 v10, 0x30

    .line 808
    .line 809
    invoke-static {v9, v3, v15, v10}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 810
    .line 811
    .line 812
    move-result-object v9

    .line 813
    iget-wide v10, v15, La/fet;->T:J

    .line 814
    .line 815
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 816
    .line 817
    .line 818
    move-result v10

    .line 819
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 820
    .line 821
    .line 822
    move-result-object v11

    .line 823
    invoke-static {v15, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 824
    .line 825
    .line 826
    move-result-object v12

    .line 827
    invoke-virtual {v15}, La/fet;->i0()V

    .line 828
    .line 829
    .line 830
    iget-boolean v13, v15, La/fet;->S:Z

    .line 831
    .line 832
    if-eqz v13, :cond_14

    .line 833
    .line 834
    move-object/from16 v13, v36

    .line 835
    .line 836
    invoke-virtual {v15, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 837
    .line 838
    .line 839
    goto :goto_c

    .line 840
    :cond_14
    move-object/from16 v13, v36

    .line 841
    .line 842
    invoke-virtual {v15}, La/fet;->r0()V

    .line 843
    .line 844
    .line 845
    :goto_c
    invoke-static {v15, v9, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 846
    .line 847
    .line 848
    invoke-static {v15, v11, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 849
    .line 850
    .line 851
    invoke-static {v10, v15, v7, v15}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 852
    .line 853
    .line 854
    invoke-static {v15, v12, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 855
    .line 856
    .line 857
    const/high16 v9, 0x41400000    # 12.0f

    .line 858
    .line 859
    invoke-static {v4, v9}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 860
    .line 861
    .line 862
    move-result-object v11

    .line 863
    const v9, 0x7f0807bc

    .line 864
    .line 865
    .line 866
    const/4 v10, 0x6

    .line 867
    invoke-static {v9, v10, v15}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 868
    .line 869
    .line 870
    move-result-object v9

    .line 871
    invoke-static {v9, v15}, La/iom0;->r(La/r2x;La/fet;)La/s4u0;

    .line 872
    .line 873
    .line 874
    move-result-object v9

    .line 875
    move-object/from16 v29, v15

    .line 876
    .line 877
    const/4 v15, 0x0

    .line 878
    const/16 v18, 0x78

    .line 879
    .line 880
    move/from16 v35, v10

    .line 881
    .line 882
    const/4 v10, 0x0

    .line 883
    const/4 v12, 0x0

    .line 884
    move-object/from16 v17, v13

    .line 885
    .line 886
    const/4 v13, 0x0

    .line 887
    const/4 v14, 0x0

    .line 888
    move-object/from16 v41, v17

    .line 889
    .line 890
    move-object/from16 v16, v29

    .line 891
    .line 892
    move/from16 v17, v37

    .line 893
    .line 894
    invoke-static/range {v9 .. v18}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 895
    .line 896
    .line 897
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v8

    .line 901
    check-cast v8, Ljava/lang/Number;

    .line 902
    .line 903
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 904
    .line 905
    .line 906
    move-result v8

    .line 907
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v8

    .line 911
    const/4 v9, 0x3

    .line 912
    const/4 v10, 0x0

    .line 913
    invoke-static {v4, v10, v9}, La/o7k0;->A(La/mm40;La/xx7;I)La/mm40;

    .line 914
    .line 915
    .line 916
    move-result-object v11

    .line 917
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 918
    .line 919
    .line 920
    move-result-object v28

    .line 921
    move v13, v9

    .line 922
    move-object v14, v10

    .line 923
    move-object v9, v11

    .line 924
    invoke-virtual/range {v38 .. v38}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 925
    .line 926
    .line 927
    move-result-wide v10

    .line 928
    const/16 v31, 0x0

    .line 929
    .line 930
    const v32, 0x1fff8

    .line 931
    .line 932
    .line 933
    move v15, v13

    .line 934
    move-object/from16 v18, v14

    .line 935
    .line 936
    const-wide/16 v13, 0x0

    .line 937
    .line 938
    move/from16 v17, v15

    .line 939
    .line 940
    const/4 v15, 0x0

    .line 941
    const/16 v16, 0x0

    .line 942
    .line 943
    move/from16 v19, v17

    .line 944
    .line 945
    const/16 v17, 0x0

    .line 946
    .line 947
    move-object/from16 v20, v18

    .line 948
    .line 949
    move/from16 v21, v19

    .line 950
    .line 951
    const-wide/16 v18, 0x0

    .line 952
    .line 953
    move-object/from16 v22, v20

    .line 954
    .line 955
    const/16 v20, 0x0

    .line 956
    .line 957
    move/from16 v23, v21

    .line 958
    .line 959
    move-object/from16 v40, v22

    .line 960
    .line 961
    const-wide/16 v21, 0x0

    .line 962
    .line 963
    move/from16 v39, v23

    .line 964
    .line 965
    const/16 v23, 0x0

    .line 966
    .line 967
    const/16 v24, 0x0

    .line 968
    .line 969
    const/16 v25, 0x0

    .line 970
    .line 971
    const/16 v26, 0x0

    .line 972
    .line 973
    const/16 v27, 0x0

    .line 974
    .line 975
    const/16 v30, 0x30

    .line 976
    .line 977
    invoke-static/range {v8 .. v32}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 978
    .line 979
    .line 980
    move-object/from16 v15, v29

    .line 981
    .line 982
    invoke-virtual {v15, v1}, La/fet;->r(Z)V

    .line 983
    .line 984
    .line 985
    new-instance v8, La/qw3;

    .line 986
    .line 987
    new-instance v9, La/jf4;

    .line 988
    .line 989
    invoke-direct {v9, v0}, La/jf4;-><init>(B)V

    .line 990
    .line 991
    .line 992
    const/high16 v11, 0x40000000    # 2.0f

    .line 993
    .line 994
    invoke-direct {v8, v11, v1, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 995
    .line 996
    .line 997
    const/16 v10, 0x30

    .line 998
    .line 999
    invoke-static {v8, v3, v15, v10}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    iget-wide v8, v15, La/fet;->T:J

    .line 1004
    .line 1005
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 1006
    .line 1007
    .line 1008
    move-result v3

    .line 1009
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v8

    .line 1013
    invoke-static {v15, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v9

    .line 1017
    invoke-virtual {v15}, La/fet;->i0()V

    .line 1018
    .line 1019
    .line 1020
    iget-boolean v10, v15, La/fet;->S:Z

    .line 1021
    .line 1022
    if-eqz v10, :cond_15

    .line 1023
    .line 1024
    move-object/from16 v13, v41

    .line 1025
    .line 1026
    invoke-virtual {v15, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1027
    .line 1028
    .line 1029
    goto :goto_d

    .line 1030
    :cond_15
    invoke-virtual {v15}, La/fet;->r0()V

    .line 1031
    .line 1032
    .line 1033
    :goto_d
    invoke-static {v15, v0, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1034
    .line 1035
    .line 1036
    invoke-static {v15, v8, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1037
    .line 1038
    .line 1039
    invoke-static {v3, v15, v7, v15}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-static {v15, v9, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1043
    .line 1044
    .line 1045
    const/high16 v9, 0x41400000    # 12.0f

    .line 1046
    .line 1047
    invoke-static {v4, v9}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v10

    .line 1051
    const v0, 0x7f0807aa

    .line 1052
    .line 1053
    .line 1054
    const/4 v2, 0x6

    .line 1055
    invoke-static {v0, v2, v15}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    invoke-static {v0, v15}, La/iom0;->r(La/r2x;La/fet;)La/s4u0;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v8

    .line 1063
    const/4 v14, 0x0

    .line 1064
    const/16 v17, 0x78

    .line 1065
    .line 1066
    const/4 v9, 0x0

    .line 1067
    const/4 v11, 0x0

    .line 1068
    const/4 v12, 0x0

    .line 1069
    const/4 v13, 0x0

    .line 1070
    move/from16 v16, v37

    .line 1071
    .line 1072
    invoke-static/range {v8 .. v17}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 1073
    .line 1074
    .line 1075
    move-object/from16 v29, v15

    .line 1076
    .line 1077
    invoke-interface/range {v34 .. v34}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    check-cast v0, Ljava/lang/Number;

    .line 1082
    .line 1083
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1084
    .line 1085
    .line 1086
    move-result v0

    .line 1087
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v2

    .line 1091
    const/4 v13, 0x3

    .line 1092
    const/4 v14, 0x0

    .line 1093
    invoke-static {v4, v14, v13}, La/o7k0;->A(La/mm40;La/xx7;I)La/mm40;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v3

    .line 1097
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v22

    .line 1101
    invoke-virtual/range {v38 .. v38}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1102
    .line 1103
    .line 1104
    move-result-wide v4

    .line 1105
    const/16 v25, 0x0

    .line 1106
    .line 1107
    const v26, 0x1fff8

    .line 1108
    .line 1109
    .line 1110
    const/4 v6, 0x0

    .line 1111
    const-wide/16 v7, 0x0

    .line 1112
    .line 1113
    const/4 v10, 0x0

    .line 1114
    const-wide/16 v12, 0x0

    .line 1115
    .line 1116
    const/4 v14, 0x0

    .line 1117
    const-wide/16 v15, 0x0

    .line 1118
    .line 1119
    const/16 v17, 0x0

    .line 1120
    .line 1121
    const/16 v18, 0x0

    .line 1122
    .line 1123
    const/16 v19, 0x0

    .line 1124
    .line 1125
    const/16 v20, 0x0

    .line 1126
    .line 1127
    const/16 v21, 0x0

    .line 1128
    .line 1129
    const/16 v24, 0x30

    .line 1130
    .line 1131
    move-object/from16 v23, v29

    .line 1132
    .line 1133
    invoke-static/range {v2 .. v26}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1134
    .line 1135
    .line 1136
    move-object/from16 v15, v23

    .line 1137
    .line 1138
    invoke-virtual {v15, v1}, La/fet;->r(Z)V

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v15, v1}, La/fet;->r(Z)V

    .line 1142
    .line 1143
    .line 1144
    goto :goto_e

    .line 1145
    :cond_16
    invoke-virtual {v15}, La/fet;->X()V

    .line 1146
    .line 1147
    .line 1148
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1149
    .line 1150
    return-object v0

    .line 1151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
