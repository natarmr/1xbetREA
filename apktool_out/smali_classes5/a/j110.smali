.class public final synthetic La/j110;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g110;


# direct methods
.method public synthetic constructor <init>(La/g110;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j110;->a:B

    iput-object p1, p0, La/j110;->b:La/g110;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/j110;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x42000000    # 32.0f

    .line 6
    .line 7
    const/16 v3, 0x186

    .line 8
    .line 9
    const/high16 v4, 0x41e00000    # 28.0f

    .line 10
    .line 11
    const/16 v5, 0x180

    .line 12
    .line 13
    const/high16 v6, 0x41000000    # 8.0f

    .line 14
    .line 15
    const/high16 v7, 0x40c00000    # 6.0f

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x3

    .line 19
    const/4 v10, 0x2

    .line 20
    sget-object v11, La/jm40;->b:La/jm40;

    .line 21
    .line 22
    const/16 v12, 0x10

    .line 23
    .line 24
    const/4 v13, 0x0

    .line 25
    iget-object v0, v0, La/j110;->b:La/g110;

    .line 26
    .line 27
    const/4 v14, 0x1

    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, La/ir8;

    .line 34
    .line 35
    move-object/from16 v2, p2

    .line 36
    .line 37
    check-cast v2, La/fet;

    .line 38
    .line 39
    move-object/from16 v3, p3

    .line 40
    .line 41
    check-cast v3, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    and-int/lit8 v1, v3, 0x11

    .line 51
    .line 52
    if-eq v1, v12, :cond_0

    .line 53
    .line 54
    move v13, v14

    .line 55
    :cond_0
    and-int/lit8 v1, v3, 0x1

    .line 56
    .line 57
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const v1, 0x7f080d63

    .line 67
    .line 68
    .line 69
    const/4 v3, 0x6

    .line 70
    invoke-static {v1, v3, v2}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1, v2}, La/iom0;->r(La/r2x;La/fet;)La/s4u0;

    .line 75
    .line 76
    .line 77
    move-result-object v18

    .line 78
    sget-object v1, La/qmk;->a:La/zcl;

    .line 79
    .line 80
    invoke-static {v11, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    sget-object v3, La/qmk;->e:La/zcl;

    .line 85
    .line 86
    sget-object v4, La/vgg0;->a:La/ugg0;

    .line 87
    .line 88
    invoke-static {v3, v3, v3, v3, v1}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 89
    .line 90
    .line 91
    move-result-object v17

    .line 92
    iget-object v15, v0, La/g110;->c:Ljava/lang/String;

    .line 93
    .line 94
    const/16 v29, 0x0

    .line 95
    .line 96
    const/16 v30, 0x7fe0

    .line 97
    .line 98
    const/16 v16, 0x0

    .line 99
    .line 100
    const/16 v20, 0x0

    .line 101
    .line 102
    const/16 v21, 0x0

    .line 103
    .line 104
    const/16 v22, 0x0

    .line 105
    .line 106
    const/16 v23, 0x0

    .line 107
    .line 108
    const/16 v24, 0x0

    .line 109
    .line 110
    const/16 v25, 0x0

    .line 111
    .line 112
    const/16 v26, 0x0

    .line 113
    .line 114
    const v28, 0x9030

    .line 115
    .line 116
    .line 117
    move-object/from16 v19, v18

    .line 118
    .line 119
    move-object/from16 v27, v2

    .line 120
    .line 121
    invoke-static/range {v15 .. v30}, La/k7x;->b(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/pm80;La/pm80;La/pm80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;La/fet;III)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    move-object/from16 v27, v2

    .line 126
    .line 127
    invoke-virtual/range {v27 .. v27}, La/fet;->X()V

    .line 128
    .line 129
    .line 130
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_0
    move-object/from16 v1, p1

    .line 134
    .line 135
    check-cast v1, La/ir8;

    .line 136
    .line 137
    move-object/from16 v2, p2

    .line 138
    .line 139
    check-cast v2, La/fet;

    .line 140
    .line 141
    move-object/from16 v3, p3

    .line 142
    .line 143
    check-cast v3, Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    and-int/lit8 v1, v3, 0x11

    .line 153
    .line 154
    if-eq v1, v12, :cond_2

    .line 155
    .line 156
    move v13, v14

    .line 157
    :cond_2
    and-int/lit8 v1, v3, 0x1

    .line 158
    .line 159
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_3

    .line 164
    .line 165
    sget-object v1, La/qmk;->a:La/zcl;

    .line 166
    .line 167
    const/high16 v1, 0x40800000    # 4.0f

    .line 168
    .line 169
    invoke-static {v11, v1, v7}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    const/4 v3, 0x0

    .line 174
    invoke-static {v1, v3, v9}, La/o7k0;->A(La/mm40;La/xx7;I)La/mm40;

    .line 175
    .line 176
    .line 177
    move-result-object v16

    .line 178
    iget-object v15, v0, La/g110;->d:Ljava/lang/String;

    .line 179
    .line 180
    sget-object v23, La/j1t0;->c:La/qrq;

    .line 181
    .line 182
    sget-wide v20, La/qmk;->r:J

    .line 183
    .line 184
    sget-wide v29, La/qmk;->F:J

    .line 185
    .line 186
    new-instance v17, La/y9q0;

    .line 187
    .line 188
    const/16 v28, 0x0

    .line 189
    .line 190
    const v31, 0xfdffdd

    .line 191
    .line 192
    .line 193
    const-wide/16 v18, 0x0

    .line 194
    .line 195
    const/16 v22, 0x0

    .line 196
    .line 197
    const-wide/16 v24, 0x0

    .line 198
    .line 199
    const/16 v26, 0x0

    .line 200
    .line 201
    const/16 v27, 0x0

    .line 202
    .line 203
    invoke-direct/range {v17 .. v31}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 204
    .line 205
    .line 206
    move-object/from16 v0, v17

    .line 207
    .line 208
    invoke-static {v0, v2}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 209
    .line 210
    .line 211
    move-result-object v35

    .line 212
    const/16 v38, 0x6180

    .line 213
    .line 214
    const v39, 0x1affc

    .line 215
    .line 216
    .line 217
    const-wide/16 v17, 0x0

    .line 218
    .line 219
    const/16 v19, 0x0

    .line 220
    .line 221
    const-wide/16 v20, 0x0

    .line 222
    .line 223
    const/16 v23, 0x0

    .line 224
    .line 225
    const/16 v24, 0x0

    .line 226
    .line 227
    const-wide/16 v25, 0x0

    .line 228
    .line 229
    const/16 v27, 0x0

    .line 230
    .line 231
    const-wide/16 v28, 0x0

    .line 232
    .line 233
    const/16 v30, 0x2

    .line 234
    .line 235
    const/16 v31, 0x0

    .line 236
    .line 237
    const/16 v32, 0x1

    .line 238
    .line 239
    const/16 v33, 0x0

    .line 240
    .line 241
    const/16 v34, 0x0

    .line 242
    .line 243
    const/16 v37, 0x0

    .line 244
    .line 245
    move-object/from16 v36, v2

    .line 246
    .line 247
    invoke-static/range {v15 .. v39}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 248
    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_3
    move-object/from16 v36, v2

    .line 252
    .line 253
    invoke-virtual/range {v36 .. v36}, La/fet;->X()V

    .line 254
    .line 255
    .line 256
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_1
    move-object/from16 v1, p1

    .line 260
    .line 261
    check-cast v1, La/yhg0;

    .line 262
    .line 263
    move-object/from16 v2, p2

    .line 264
    .line 265
    check-cast v2, La/fet;

    .line 266
    .line 267
    move-object/from16 v4, p3

    .line 268
    .line 269
    check-cast v4, Ljava/lang/Integer;

    .line 270
    .line 271
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    and-int/lit8 v1, v4, 0x11

    .line 279
    .line 280
    if-eq v1, v12, :cond_4

    .line 281
    .line 282
    move v13, v14

    .line 283
    :cond_4
    and-int/lit8 v1, v4, 0x1

    .line 284
    .line 285
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-eqz v1, :cond_5

    .line 290
    .line 291
    new-instance v1, La/j110;

    .line 292
    .line 293
    invoke-direct {v1, v0, v9}, La/j110;-><init>(La/g110;B)V

    .line 294
    .line 295
    .line 296
    const v0, 0x39ed7db8

    .line 297
    .line 298
    .line 299
    invoke-static {v0, v1, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v11, v0, v2, v3, v10}, La/obc;->h(La/mm40;La/ugd;La/fet;II)V

    .line 304
    .line 305
    .line 306
    goto :goto_2

    .line 307
    :cond_5
    invoke-virtual {v2}, La/fet;->X()V

    .line 308
    .line 309
    .line 310
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_2
    move-object/from16 v1, p1

    .line 314
    .line 315
    check-cast v1, La/yhg0;

    .line 316
    .line 317
    move-object/from16 v3, p2

    .line 318
    .line 319
    check-cast v3, La/fet;

    .line 320
    .line 321
    move-object/from16 v4, p3

    .line 322
    .line 323
    check-cast v4, Ljava/lang/Integer;

    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    and-int/lit8 v1, v4, 0x11

    .line 333
    .line 334
    if-eq v1, v12, :cond_6

    .line 335
    .line 336
    move v13, v14

    .line 337
    :cond_6
    and-int/lit8 v1, v4, 0x1

    .line 338
    .line 339
    invoke-virtual {v3, v1, v13}, La/fet;->U(IZ)Z

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    if-eqz v1, :cond_7

    .line 344
    .line 345
    sget-object v1, La/qmk;->a:La/zcl;

    .line 346
    .line 347
    invoke-static {v11, v6, v8, v10}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-static {v1, v2}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    new-instance v2, La/j110;

    .line 356
    .line 357
    invoke-direct {v2, v0, v14}, La/j110;-><init>(La/g110;B)V

    .line 358
    .line 359
    .line 360
    const v0, -0xb6d5949

    .line 361
    .line 362
    .line 363
    invoke-static {v0, v2, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-static {v1, v0, v3, v5, v10}, La/obc;->h(La/mm40;La/ugd;La/fet;II)V

    .line 368
    .line 369
    .line 370
    goto :goto_3

    .line 371
    :cond_7
    invoke-virtual {v3}, La/fet;->X()V

    .line 372
    .line 373
    .line 374
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object v0

    .line 377
    :pswitch_3
    move-object/from16 v1, p1

    .line 378
    .line 379
    check-cast v1, La/yhg0;

    .line 380
    .line 381
    move-object/from16 v2, p2

    .line 382
    .line 383
    check-cast v2, La/fet;

    .line 384
    .line 385
    move-object/from16 v4, p3

    .line 386
    .line 387
    check-cast v4, Ljava/lang/Integer;

    .line 388
    .line 389
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    and-int/lit8 v1, v4, 0x11

    .line 397
    .line 398
    if-eq v1, v12, :cond_8

    .line 399
    .line 400
    move v13, v14

    .line 401
    :cond_8
    and-int/lit8 v1, v4, 0x1

    .line 402
    .line 403
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    if-eqz v1, :cond_9

    .line 408
    .line 409
    new-instance v1, La/j110;

    .line 410
    .line 411
    const/4 v4, 0x4

    .line 412
    invoke-direct {v1, v0, v4}, La/j110;-><init>(La/g110;B)V

    .line 413
    .line 414
    .line 415
    const v0, -0x50c8304a

    .line 416
    .line 417
    .line 418
    invoke-static {v0, v1, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-static {v11, v0, v2, v3, v10}, La/obc;->h(La/mm40;La/ugd;La/fet;II)V

    .line 423
    .line 424
    .line 425
    goto :goto_4

    .line 426
    :cond_9
    invoke-virtual {v2}, La/fet;->X()V

    .line 427
    .line 428
    .line 429
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 430
    .line 431
    return-object v0

    .line 432
    :pswitch_4
    move-object/from16 v1, p1

    .line 433
    .line 434
    check-cast v1, La/yhg0;

    .line 435
    .line 436
    move-object/from16 v2, p2

    .line 437
    .line 438
    check-cast v2, La/fet;

    .line 439
    .line 440
    move-object/from16 v3, p3

    .line 441
    .line 442
    check-cast v3, Ljava/lang/Integer;

    .line 443
    .line 444
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    and-int/lit8 v1, v3, 0x11

    .line 452
    .line 453
    if-eq v1, v12, :cond_a

    .line 454
    .line 455
    move v13, v14

    .line 456
    :cond_a
    and-int/lit8 v1, v3, 0x1

    .line 457
    .line 458
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    if-eqz v1, :cond_b

    .line 463
    .line 464
    sget-object v1, La/qmk;->a:La/zcl;

    .line 465
    .line 466
    invoke-static {v11, v6, v8, v10}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    new-instance v3, La/j110;

    .line 471
    .line 472
    invoke-direct {v3, v0, v10}, La/j110;-><init>(La/g110;B)V

    .line 473
    .line 474
    .line 475
    const v0, 0x21223e8e

    .line 476
    .line 477
    .line 478
    invoke-static {v0, v3, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-static {v1, v0, v2, v5, v10}, La/obc;->h(La/mm40;La/ugd;La/fet;II)V

    .line 483
    .line 484
    .line 485
    goto :goto_5

    .line 486
    :cond_b
    invoke-virtual {v2}, La/fet;->X()V

    .line 487
    .line 488
    .line 489
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 490
    .line 491
    return-object v0

    .line 492
    :pswitch_5
    move-object/from16 v1, p1

    .line 493
    .line 494
    check-cast v1, La/yhg0;

    .line 495
    .line 496
    move-object/from16 v2, p2

    .line 497
    .line 498
    check-cast v2, La/fet;

    .line 499
    .line 500
    move-object/from16 v3, p3

    .line 501
    .line 502
    check-cast v3, Ljava/lang/Integer;

    .line 503
    .line 504
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    and-int/lit8 v1, v3, 0x11

    .line 512
    .line 513
    if-eq v1, v12, :cond_c

    .line 514
    .line 515
    move v13, v14

    .line 516
    :cond_c
    and-int/lit8 v1, v3, 0x1

    .line 517
    .line 518
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 519
    .line 520
    .line 521
    move-result v1

    .line 522
    if-eqz v1, :cond_d

    .line 523
    .line 524
    sget-object v1, La/qmk;->a:La/zcl;

    .line 525
    .line 526
    invoke-static {v11, v6, v8, v10}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    new-instance v3, La/j110;

    .line 531
    .line 532
    const/16 v4, 0xc

    .line 533
    .line 534
    invoke-direct {v3, v0, v4}, La/j110;-><init>(La/g110;B)V

    .line 535
    .line 536
    .line 537
    const v0, -0x69936f74

    .line 538
    .line 539
    .line 540
    invoke-static {v0, v3, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-static {v1, v0, v2, v5, v10}, La/obc;->h(La/mm40;La/ugd;La/fet;II)V

    .line 545
    .line 546
    .line 547
    goto :goto_6

    .line 548
    :cond_d
    invoke-virtual {v2}, La/fet;->X()V

    .line 549
    .line 550
    .line 551
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 552
    .line 553
    return-object v0

    .line 554
    :pswitch_6
    move-object/from16 v1, p1

    .line 555
    .line 556
    check-cast v1, La/yhg0;

    .line 557
    .line 558
    move-object/from16 v3, p2

    .line 559
    .line 560
    check-cast v3, La/fet;

    .line 561
    .line 562
    move-object/from16 v6, p3

    .line 563
    .line 564
    check-cast v6, Ljava/lang/Integer;

    .line 565
    .line 566
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 567
    .line 568
    .line 569
    move-result v6

    .line 570
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    and-int/lit8 v1, v6, 0x11

    .line 574
    .line 575
    if-eq v1, v12, :cond_e

    .line 576
    .line 577
    move v13, v14

    .line 578
    :cond_e
    and-int/lit8 v1, v6, 0x1

    .line 579
    .line 580
    invoke-virtual {v3, v1, v13}, La/fet;->U(IZ)Z

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    if-eqz v1, :cond_f

    .line 585
    .line 586
    sget-object v1, La/qmk;->a:La/zcl;

    .line 587
    .line 588
    invoke-static {v11, v4, v2}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    new-instance v2, La/j110;

    .line 593
    .line 594
    const/16 v4, 0xd

    .line 595
    .line 596
    invoke-direct {v2, v0, v4}, La/j110;-><init>(La/g110;B)V

    .line 597
    .line 598
    .line 599
    const v0, 0x5111b98b

    .line 600
    .line 601
    .line 602
    invoke-static {v0, v2, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-static {v1, v0, v3, v5, v10}, La/obc;->h(La/mm40;La/ugd;La/fet;II)V

    .line 607
    .line 608
    .line 609
    goto :goto_7

    .line 610
    :cond_f
    invoke-virtual {v3}, La/fet;->X()V

    .line 611
    .line 612
    .line 613
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 614
    .line 615
    return-object v0

    .line 616
    :pswitch_7
    move-object/from16 v1, p1

    .line 617
    .line 618
    check-cast v1, La/ir8;

    .line 619
    .line 620
    move-object/from16 v2, p2

    .line 621
    .line 622
    check-cast v2, La/fet;

    .line 623
    .line 624
    move-object/from16 v3, p3

    .line 625
    .line 626
    check-cast v3, Ljava/lang/Integer;

    .line 627
    .line 628
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 629
    .line 630
    .line 631
    move-result v3

    .line 632
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    and-int/lit8 v1, v3, 0x11

    .line 636
    .line 637
    if-eq v1, v12, :cond_10

    .line 638
    .line 639
    move v13, v14

    .line 640
    :cond_10
    and-int/lit8 v1, v3, 0x1

    .line 641
    .line 642
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    if-eqz v1, :cond_11

    .line 647
    .line 648
    sget-object v1, La/qmk;->a:La/zcl;

    .line 649
    .line 650
    const/high16 v7, 0x40c00000    # 6.0f

    .line 651
    .line 652
    const/4 v8, 0x5

    .line 653
    sget-object v3, La/jm40;->b:La/jm40;

    .line 654
    .line 655
    const/4 v4, 0x0

    .line 656
    const/high16 v5, 0x40c00000    # 6.0f

    .line 657
    .line 658
    const/4 v6, 0x0

    .line 659
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    const/high16 v3, 0x41c00000    # 24.0f

    .line 664
    .line 665
    invoke-static {v1, v3}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 666
    .line 667
    .line 668
    move-result-object v16

    .line 669
    iget-object v15, v0, La/g110;->b:Ljava/lang/String;

    .line 670
    .line 671
    sget-object v23, La/j1t0;->c:La/qrq;

    .line 672
    .line 673
    sget-wide v20, La/qmk;->r:J

    .line 674
    .line 675
    sget-wide v29, La/qmk;->F:J

    .line 676
    .line 677
    new-instance v17, La/y9q0;

    .line 678
    .line 679
    const/16 v28, 0x0

    .line 680
    .line 681
    const v31, 0xfdffdd

    .line 682
    .line 683
    .line 684
    const-wide/16 v18, 0x0

    .line 685
    .line 686
    const/16 v22, 0x0

    .line 687
    .line 688
    const-wide/16 v24, 0x0

    .line 689
    .line 690
    const/16 v26, 0x0

    .line 691
    .line 692
    const/16 v27, 0x0

    .line 693
    .line 694
    invoke-direct/range {v17 .. v31}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 695
    .line 696
    .line 697
    move-object/from16 v0, v17

    .line 698
    .line 699
    invoke-static {v0, v2}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 700
    .line 701
    .line 702
    move-result-object v35

    .line 703
    new-instance v0, La/f2q0;

    .line 704
    .line 705
    invoke-direct {v0, v9}, La/f2q0;-><init>(I)V

    .line 706
    .line 707
    .line 708
    const/16 v38, 0x0

    .line 709
    .line 710
    const v39, 0x1fbfc

    .line 711
    .line 712
    .line 713
    const-wide/16 v17, 0x0

    .line 714
    .line 715
    const/16 v19, 0x0

    .line 716
    .line 717
    const-wide/16 v20, 0x0

    .line 718
    .line 719
    const/16 v23, 0x0

    .line 720
    .line 721
    const/16 v24, 0x0

    .line 722
    .line 723
    const-wide/16 v25, 0x0

    .line 724
    .line 725
    const-wide/16 v28, 0x0

    .line 726
    .line 727
    const/16 v30, 0x0

    .line 728
    .line 729
    const/16 v31, 0x0

    .line 730
    .line 731
    const/16 v32, 0x0

    .line 732
    .line 733
    const/16 v33, 0x0

    .line 734
    .line 735
    const/16 v34, 0x0

    .line 736
    .line 737
    const/16 v37, 0x0

    .line 738
    .line 739
    move-object/from16 v27, v0

    .line 740
    .line 741
    move-object/from16 v36, v2

    .line 742
    .line 743
    invoke-static/range {v15 .. v39}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 744
    .line 745
    .line 746
    goto :goto_8

    .line 747
    :cond_11
    move-object/from16 v36, v2

    .line 748
    .line 749
    invoke-virtual/range {v36 .. v36}, La/fet;->X()V

    .line 750
    .line 751
    .line 752
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 753
    .line 754
    return-object v0

    .line 755
    :pswitch_8
    move-object/from16 v1, p1

    .line 756
    .line 757
    check-cast v1, La/ir8;

    .line 758
    .line 759
    move-object/from16 v2, p2

    .line 760
    .line 761
    check-cast v2, La/fet;

    .line 762
    .line 763
    move-object/from16 v3, p3

    .line 764
    .line 765
    check-cast v3, Ljava/lang/Integer;

    .line 766
    .line 767
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 768
    .line 769
    .line 770
    move-result v3

    .line 771
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    and-int/lit8 v1, v3, 0x11

    .line 775
    .line 776
    if-eq v1, v12, :cond_12

    .line 777
    .line 778
    move v13, v14

    .line 779
    :cond_12
    and-int/lit8 v1, v3, 0x1

    .line 780
    .line 781
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 782
    .line 783
    .line 784
    move-result v1

    .line 785
    if-eqz v1, :cond_13

    .line 786
    .line 787
    sget-object v1, La/qmk;->a:La/zcl;

    .line 788
    .line 789
    invoke-static {v11, v8, v7, v14}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    const/high16 v3, 0x41f00000    # 30.0f

    .line 794
    .line 795
    invoke-static {v1, v3}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 796
    .line 797
    .line 798
    move-result-object v16

    .line 799
    iget-object v15, v0, La/g110;->e:Ljava/lang/String;

    .line 800
    .line 801
    sget-object v23, La/j1t0;->c:La/qrq;

    .line 802
    .line 803
    sget-wide v20, La/qmk;->r:J

    .line 804
    .line 805
    sget-wide v29, La/qmk;->F:J

    .line 806
    .line 807
    new-instance v17, La/y9q0;

    .line 808
    .line 809
    const/16 v28, 0x0

    .line 810
    .line 811
    const v31, 0xfdffdd

    .line 812
    .line 813
    .line 814
    const-wide/16 v18, 0x0

    .line 815
    .line 816
    const/16 v22, 0x0

    .line 817
    .line 818
    const-wide/16 v24, 0x0

    .line 819
    .line 820
    const/16 v26, 0x0

    .line 821
    .line 822
    const/16 v27, 0x0

    .line 823
    .line 824
    invoke-direct/range {v17 .. v31}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 825
    .line 826
    .line 827
    move-object/from16 v0, v17

    .line 828
    .line 829
    invoke-static {v0, v2}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 830
    .line 831
    .line 832
    move-result-object v35

    .line 833
    new-instance v0, La/f2q0;

    .line 834
    .line 835
    invoke-direct {v0, v9}, La/f2q0;-><init>(I)V

    .line 836
    .line 837
    .line 838
    const/16 v38, 0x6180

    .line 839
    .line 840
    const v39, 0x1abfc

    .line 841
    .line 842
    .line 843
    const-wide/16 v17, 0x0

    .line 844
    .line 845
    const/16 v19, 0x0

    .line 846
    .line 847
    const-wide/16 v20, 0x0

    .line 848
    .line 849
    const/16 v23, 0x0

    .line 850
    .line 851
    const/16 v24, 0x0

    .line 852
    .line 853
    const-wide/16 v25, 0x0

    .line 854
    .line 855
    const-wide/16 v28, 0x0

    .line 856
    .line 857
    const/16 v30, 0x2

    .line 858
    .line 859
    const/16 v31, 0x0

    .line 860
    .line 861
    const/16 v32, 0x1

    .line 862
    .line 863
    const/16 v33, 0x0

    .line 864
    .line 865
    const/16 v34, 0x0

    .line 866
    .line 867
    const/16 v37, 0x0

    .line 868
    .line 869
    move-object/from16 v27, v0

    .line 870
    .line 871
    move-object/from16 v36, v2

    .line 872
    .line 873
    invoke-static/range {v15 .. v39}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 874
    .line 875
    .line 876
    goto :goto_9

    .line 877
    :cond_13
    move-object/from16 v36, v2

    .line 878
    .line 879
    invoke-virtual/range {v36 .. v36}, La/fet;->X()V

    .line 880
    .line 881
    .line 882
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 883
    .line 884
    return-object v0

    .line 885
    :pswitch_9
    move-object/from16 v1, p1

    .line 886
    .line 887
    check-cast v1, La/ir8;

    .line 888
    .line 889
    move-object/from16 v2, p2

    .line 890
    .line 891
    check-cast v2, La/fet;

    .line 892
    .line 893
    move-object/from16 v3, p3

    .line 894
    .line 895
    check-cast v3, Ljava/lang/Integer;

    .line 896
    .line 897
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 898
    .line 899
    .line 900
    move-result v3

    .line 901
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 902
    .line 903
    .line 904
    and-int/lit8 v1, v3, 0x11

    .line 905
    .line 906
    if-eq v1, v12, :cond_14

    .line 907
    .line 908
    move v13, v14

    .line 909
    :cond_14
    and-int/lit8 v1, v3, 0x1

    .line 910
    .line 911
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 912
    .line 913
    .line 914
    move-result v1

    .line 915
    if-eqz v1, :cond_15

    .line 916
    .line 917
    sget-object v1, La/qmk;->a:La/zcl;

    .line 918
    .line 919
    invoke-static {v11, v8, v7, v14}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 920
    .line 921
    .line 922
    move-result-object v1

    .line 923
    const/high16 v3, 0x42100000    # 36.0f

    .line 924
    .line 925
    invoke-static {v1, v3}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 926
    .line 927
    .line 928
    move-result-object v16

    .line 929
    iget-object v15, v0, La/g110;->h:Ljava/lang/String;

    .line 930
    .line 931
    sget-object v23, La/j1t0;->c:La/qrq;

    .line 932
    .line 933
    sget-wide v20, La/qmk;->r:J

    .line 934
    .line 935
    sget-wide v29, La/qmk;->F:J

    .line 936
    .line 937
    new-instance v17, La/y9q0;

    .line 938
    .line 939
    const/16 v28, 0x0

    .line 940
    .line 941
    const v31, 0xfdffdd

    .line 942
    .line 943
    .line 944
    const-wide/16 v18, 0x0

    .line 945
    .line 946
    const/16 v22, 0x0

    .line 947
    .line 948
    const-wide/16 v24, 0x0

    .line 949
    .line 950
    const/16 v26, 0x0

    .line 951
    .line 952
    const/16 v27, 0x0

    .line 953
    .line 954
    invoke-direct/range {v17 .. v31}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 955
    .line 956
    .line 957
    move-object/from16 v0, v17

    .line 958
    .line 959
    invoke-static {v0, v2}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 960
    .line 961
    .line 962
    move-result-object v35

    .line 963
    new-instance v0, La/f2q0;

    .line 964
    .line 965
    invoke-direct {v0, v9}, La/f2q0;-><init>(I)V

    .line 966
    .line 967
    .line 968
    const/16 v38, 0x6180

    .line 969
    .line 970
    const v39, 0x1abfc

    .line 971
    .line 972
    .line 973
    const-wide/16 v17, 0x0

    .line 974
    .line 975
    const/16 v19, 0x0

    .line 976
    .line 977
    const-wide/16 v20, 0x0

    .line 978
    .line 979
    const/16 v23, 0x0

    .line 980
    .line 981
    const/16 v24, 0x0

    .line 982
    .line 983
    const-wide/16 v25, 0x0

    .line 984
    .line 985
    const-wide/16 v28, 0x0

    .line 986
    .line 987
    const/16 v30, 0x2

    .line 988
    .line 989
    const/16 v31, 0x0

    .line 990
    .line 991
    const/16 v32, 0x1

    .line 992
    .line 993
    const/16 v33, 0x0

    .line 994
    .line 995
    const/16 v34, 0x0

    .line 996
    .line 997
    const/16 v37, 0x0

    .line 998
    .line 999
    move-object/from16 v27, v0

    .line 1000
    .line 1001
    move-object/from16 v36, v2

    .line 1002
    .line 1003
    invoke-static/range {v15 .. v39}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1004
    .line 1005
    .line 1006
    goto :goto_a

    .line 1007
    :cond_15
    move-object/from16 v36, v2

    .line 1008
    .line 1009
    invoke-virtual/range {v36 .. v36}, La/fet;->X()V

    .line 1010
    .line 1011
    .line 1012
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1013
    .line 1014
    return-object v0

    .line 1015
    :pswitch_a
    move-object/from16 v1, p1

    .line 1016
    .line 1017
    check-cast v1, La/ir8;

    .line 1018
    .line 1019
    move-object/from16 v2, p2

    .line 1020
    .line 1021
    check-cast v2, La/fet;

    .line 1022
    .line 1023
    move-object/from16 v3, p3

    .line 1024
    .line 1025
    check-cast v3, Ljava/lang/Integer;

    .line 1026
    .line 1027
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1028
    .line 1029
    .line 1030
    move-result v3

    .line 1031
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1032
    .line 1033
    .line 1034
    and-int/lit8 v1, v3, 0x11

    .line 1035
    .line 1036
    if-eq v1, v12, :cond_16

    .line 1037
    .line 1038
    move v13, v14

    .line 1039
    :cond_16
    and-int/lit8 v1, v3, 0x1

    .line 1040
    .line 1041
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v1

    .line 1045
    if-eqz v1, :cond_17

    .line 1046
    .line 1047
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1048
    .line 1049
    invoke-static {v11, v8, v7, v14}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v1

    .line 1053
    const/high16 v3, 0x42380000    # 46.0f

    .line 1054
    .line 1055
    invoke-static {v1, v3}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v16

    .line 1059
    iget-object v15, v0, La/g110;->f:Ljava/lang/String;

    .line 1060
    .line 1061
    sget-object v23, La/j1t0;->c:La/qrq;

    .line 1062
    .line 1063
    sget-wide v20, La/qmk;->r:J

    .line 1064
    .line 1065
    sget-wide v29, La/qmk;->F:J

    .line 1066
    .line 1067
    new-instance v17, La/y9q0;

    .line 1068
    .line 1069
    const/16 v28, 0x0

    .line 1070
    .line 1071
    const v31, 0xfdffdd

    .line 1072
    .line 1073
    .line 1074
    const-wide/16 v18, 0x0

    .line 1075
    .line 1076
    const/16 v22, 0x0

    .line 1077
    .line 1078
    const-wide/16 v24, 0x0

    .line 1079
    .line 1080
    const/16 v26, 0x0

    .line 1081
    .line 1082
    const/16 v27, 0x0

    .line 1083
    .line 1084
    invoke-direct/range {v17 .. v31}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 1085
    .line 1086
    .line 1087
    move-object/from16 v0, v17

    .line 1088
    .line 1089
    invoke-static {v0, v2}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v35

    .line 1093
    new-instance v0, La/f2q0;

    .line 1094
    .line 1095
    invoke-direct {v0, v9}, La/f2q0;-><init>(I)V

    .line 1096
    .line 1097
    .line 1098
    const/16 v38, 0x6180

    .line 1099
    .line 1100
    const v39, 0x1abfc

    .line 1101
    .line 1102
    .line 1103
    const-wide/16 v17, 0x0

    .line 1104
    .line 1105
    const/16 v19, 0x0

    .line 1106
    .line 1107
    const-wide/16 v20, 0x0

    .line 1108
    .line 1109
    const/16 v23, 0x0

    .line 1110
    .line 1111
    const/16 v24, 0x0

    .line 1112
    .line 1113
    const-wide/16 v25, 0x0

    .line 1114
    .line 1115
    const-wide/16 v28, 0x0

    .line 1116
    .line 1117
    const/16 v30, 0x2

    .line 1118
    .line 1119
    const/16 v31, 0x0

    .line 1120
    .line 1121
    const/16 v32, 0x1

    .line 1122
    .line 1123
    const/16 v33, 0x0

    .line 1124
    .line 1125
    const/16 v34, 0x0

    .line 1126
    .line 1127
    const/16 v37, 0x0

    .line 1128
    .line 1129
    move-object/from16 v27, v0

    .line 1130
    .line 1131
    move-object/from16 v36, v2

    .line 1132
    .line 1133
    invoke-static/range {v15 .. v39}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1134
    .line 1135
    .line 1136
    goto :goto_b

    .line 1137
    :cond_17
    move-object/from16 v36, v2

    .line 1138
    .line 1139
    invoke-virtual/range {v36 .. v36}, La/fet;->X()V

    .line 1140
    .line 1141
    .line 1142
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1143
    .line 1144
    return-object v0

    .line 1145
    :pswitch_b
    move-object/from16 v1, p1

    .line 1146
    .line 1147
    check-cast v1, La/ir8;

    .line 1148
    .line 1149
    move-object/from16 v2, p2

    .line 1150
    .line 1151
    check-cast v2, La/fet;

    .line 1152
    .line 1153
    move-object/from16 v3, p3

    .line 1154
    .line 1155
    check-cast v3, Ljava/lang/Integer;

    .line 1156
    .line 1157
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1158
    .line 1159
    .line 1160
    move-result v3

    .line 1161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1162
    .line 1163
    .line 1164
    and-int/lit8 v1, v3, 0x11

    .line 1165
    .line 1166
    if-eq v1, v12, :cond_18

    .line 1167
    .line 1168
    move v13, v14

    .line 1169
    :cond_18
    and-int/lit8 v1, v3, 0x1

    .line 1170
    .line 1171
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 1172
    .line 1173
    .line 1174
    move-result v1

    .line 1175
    if-eqz v1, :cond_19

    .line 1176
    .line 1177
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1178
    .line 1179
    invoke-static {v11, v6, v7}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v1

    .line 1183
    const/high16 v3, 0x41900000    # 18.0f

    .line 1184
    .line 1185
    invoke-static {v1, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v17

    .line 1189
    iget v0, v0, La/g110;->g:I

    .line 1190
    .line 1191
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v15

    .line 1195
    const/16 v21, 0x30

    .line 1196
    .line 1197
    const/16 v22, 0x7f8

    .line 1198
    .line 1199
    const/16 v16, 0x0

    .line 1200
    .line 1201
    const/16 v18, 0x0

    .line 1202
    .line 1203
    const/16 v19, 0x0

    .line 1204
    .line 1205
    move-object/from16 v20, v2

    .line 1206
    .line 1207
    invoke-static/range {v15 .. v22}, La/k7x;->a(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/qge;La/a4d;La/fet;II)V

    .line 1208
    .line 1209
    .line 1210
    goto :goto_c

    .line 1211
    :cond_19
    move-object/from16 v20, v2

    .line 1212
    .line 1213
    invoke-virtual/range {v20 .. v20}, La/fet;->X()V

    .line 1214
    .line 1215
    .line 1216
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1217
    .line 1218
    return-object v0

    .line 1219
    :pswitch_c
    move-object/from16 v1, p1

    .line 1220
    .line 1221
    check-cast v1, La/yhg0;

    .line 1222
    .line 1223
    move-object/from16 v2, p2

    .line 1224
    .line 1225
    check-cast v2, La/fet;

    .line 1226
    .line 1227
    move-object/from16 v3, p3

    .line 1228
    .line 1229
    check-cast v3, Ljava/lang/Integer;

    .line 1230
    .line 1231
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1232
    .line 1233
    .line 1234
    move-result v3

    .line 1235
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1236
    .line 1237
    .line 1238
    and-int/lit8 v1, v3, 0x11

    .line 1239
    .line 1240
    if-eq v1, v12, :cond_1a

    .line 1241
    .line 1242
    move v1, v14

    .line 1243
    goto :goto_d

    .line 1244
    :cond_1a
    move v1, v13

    .line 1245
    :goto_d
    and-int/2addr v3, v14

    .line 1246
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 1247
    .line 1248
    .line 1249
    move-result v1

    .line 1250
    if-eqz v1, :cond_1b

    .line 1251
    .line 1252
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1253
    .line 1254
    const/4 v7, 0x0

    .line 1255
    const/16 v8, 0xb

    .line 1256
    .line 1257
    sget-object v3, La/jm40;->b:La/jm40;

    .line 1258
    .line 1259
    const/4 v4, 0x0

    .line 1260
    const/4 v5, 0x0

    .line 1261
    const/high16 v6, 0x41000000    # 8.0f

    .line 1262
    .line 1263
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v1

    .line 1267
    new-instance v3, La/j110;

    .line 1268
    .line 1269
    const/4 v4, 0x5

    .line 1270
    invoke-direct {v3, v0, v4}, La/j110;-><init>(La/g110;B)V

    .line 1271
    .line 1272
    .line 1273
    const v0, 0xbb6e28a

    .line 1274
    .line 1275
    .line 1276
    invoke-static {v0, v3, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    const/16 v3, 0x1b0

    .line 1281
    .line 1282
    invoke-static {v1, v0, v2, v3, v13}, La/obc;->h(La/mm40;La/ugd;La/fet;II)V

    .line 1283
    .line 1284
    .line 1285
    goto :goto_e

    .line 1286
    :cond_1b
    invoke-virtual {v2}, La/fet;->X()V

    .line 1287
    .line 1288
    .line 1289
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1290
    .line 1291
    return-object v0

    .line 1292
    nop

    .line 1293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
.end method
