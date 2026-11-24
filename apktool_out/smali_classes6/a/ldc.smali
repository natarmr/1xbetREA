.class public final synthetic La/ldc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ldc;->a:B

    iput-boolean p1, p0, La/ldc;->b:Z

    iput-object p2, p0, La/ldc;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ldc;->a:B

    .line 4
    .line 5
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 6
    .line 7
    const/16 v3, 0x12

    .line 8
    .line 9
    const v4, 0x7f1311b2

    .line 10
    .line 11
    .line 12
    const v5, 0x7f1304d0

    .line 13
    .line 14
    .line 15
    const/high16 v6, 0x3f800000    # 1.0f

    .line 16
    .line 17
    const/16 v7, 0x10

    .line 18
    .line 19
    iget-object v8, v0, La/ldc;->c:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    sget-object v9, La/ukd;->a:La/cl5;

    .line 22
    .line 23
    const/high16 v10, 0x41400000    # 12.0f

    .line 24
    .line 25
    sget-object v11, La/jm40;->b:La/jm40;

    .line 26
    .line 27
    const/4 v12, 0x1

    .line 28
    const/4 v13, 0x0

    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    move-object/from16 v1, p1

    .line 33
    .line 34
    check-cast v1, La/ir8;

    .line 35
    .line 36
    move-object/from16 v2, p2

    .line 37
    .line 38
    check-cast v2, La/fet;

    .line 39
    .line 40
    move-object/from16 v3, p3

    .line 41
    .line 42
    check-cast v3, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    and-int/lit8 v1, v3, 0x11

    .line 52
    .line 53
    if-eq v1, v7, :cond_0

    .line 54
    .line 55
    move v1, v12

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move v1, v13

    .line 58
    :goto_0
    and-int/2addr v3, v12

    .line 59
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-static {v11, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    iget v3, v3, La/wfn;->d:F

    .line 74
    .line 75
    sget-object v4, La/qmk;->a:La/zcl;

    .line 76
    .line 77
    invoke-static {v1, v3, v10}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v14

    .line 81
    new-instance v15, La/wul;

    .line 82
    .line 83
    sget-object v16, La/lul;->e:La/lul;

    .line 84
    .line 85
    sget-object v17, La/oe9;->a:La/oe9;

    .line 86
    .line 87
    new-instance v1, La/ue9;

    .line 88
    .line 89
    invoke-static {v5, v2}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-direct {v1, v3}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const/16 v20, 0x0

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    iget-boolean v0, v0, La/ldc;->b:Z

    .line 101
    .line 102
    move/from16 v19, v0

    .line 103
    .line 104
    move-object/from16 v18, v1

    .line 105
    .line 106
    invoke-direct/range {v15 .. v21}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    if-nez v0, :cond_1

    .line 118
    .line 119
    if-ne v1, v9, :cond_2

    .line 120
    .line 121
    :cond_1
    new-instance v1, La/yqz;

    .line 122
    .line 123
    invoke-direct {v1, v8, v13}, La/yqz;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_2
    move-object/from16 v16, v1

    .line 130
    .line 131
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 132
    .line 133
    const/16 v18, 0x0

    .line 134
    .line 135
    const/16 v19, 0x0

    .line 136
    .line 137
    move-object/from16 v17, v2

    .line 138
    .line 139
    invoke-static/range {v14 .. v19}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_3
    move-object/from16 v17, v2

    .line 144
    .line 145
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 146
    .line 147
    .line 148
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_0
    move-object/from16 v1, p1

    .line 152
    .line 153
    check-cast v1, La/ir8;

    .line 154
    .line 155
    move-object/from16 v2, p2

    .line 156
    .line 157
    check-cast v2, La/fet;

    .line 158
    .line 159
    move-object/from16 v3, p3

    .line 160
    .line 161
    check-cast v3, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    and-int/lit8 v1, v3, 0x11

    .line 171
    .line 172
    if-eq v1, v7, :cond_4

    .line 173
    .line 174
    move v13, v12

    .line 175
    :cond_4
    and-int/lit8 v1, v3, 0x1

    .line 176
    .line 177
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_7

    .line 182
    .line 183
    invoke-static {v11, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    iget v3, v3, La/wfn;->d:F

    .line 192
    .line 193
    sget-object v5, La/qmk;->a:La/zcl;

    .line 194
    .line 195
    invoke-static {v1, v3, v10}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 196
    .line 197
    .line 198
    move-result-object v14

    .line 199
    new-instance v15, La/wul;

    .line 200
    .line 201
    sget-object v16, La/lul;->e:La/lul;

    .line 202
    .line 203
    sget-object v17, La/oe9;->a:La/oe9;

    .line 204
    .line 205
    new-instance v1, La/ue9;

    .line 206
    .line 207
    invoke-static {v4, v2}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-direct {v1, v3}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const/16 v20, 0x0

    .line 215
    .line 216
    const/16 v21, 0x0

    .line 217
    .line 218
    iget-boolean v0, v0, La/ldc;->b:Z

    .line 219
    .line 220
    move/from16 v19, v0

    .line 221
    .line 222
    move-object/from16 v18, v1

    .line 223
    .line 224
    invoke-direct/range {v15 .. v21}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    if-nez v0, :cond_5

    .line 236
    .line 237
    if-ne v1, v9, :cond_6

    .line 238
    .line 239
    :cond_5
    new-instance v1, La/xwy;

    .line 240
    .line 241
    const/16 v0, 0x18

    .line 242
    .line 243
    invoke-direct {v1, v8, v0}, La/xwy;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_6
    move-object/from16 v16, v1

    .line 250
    .line 251
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 252
    .line 253
    const/16 v18, 0x0

    .line 254
    .line 255
    const/16 v19, 0x0

    .line 256
    .line 257
    move-object/from16 v17, v2

    .line 258
    .line 259
    invoke-static/range {v14 .. v19}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 260
    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_7
    move-object/from16 v17, v2

    .line 264
    .line 265
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 266
    .line 267
    .line 268
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_1
    move-object/from16 v1, p1

    .line 272
    .line 273
    check-cast v1, La/ir8;

    .line 274
    .line 275
    move-object/from16 v2, p2

    .line 276
    .line 277
    check-cast v2, La/fet;

    .line 278
    .line 279
    move-object/from16 v3, p3

    .line 280
    .line 281
    check-cast v3, Ljava/lang/Integer;

    .line 282
    .line 283
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    and-int/lit8 v1, v3, 0x11

    .line 291
    .line 292
    if-eq v1, v7, :cond_8

    .line 293
    .line 294
    move v13, v12

    .line 295
    :cond_8
    and-int/lit8 v1, v3, 0x1

    .line 296
    .line 297
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    if-eqz v1, :cond_b

    .line 302
    .line 303
    invoke-static {v11, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    iget v3, v3, La/wfn;->d:F

    .line 312
    .line 313
    sget-object v5, La/qmk;->a:La/zcl;

    .line 314
    .line 315
    invoke-static {v1, v3, v10}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 316
    .line 317
    .line 318
    move-result-object v14

    .line 319
    new-instance v15, La/wul;

    .line 320
    .line 321
    sget-object v16, La/lul;->e:La/lul;

    .line 322
    .line 323
    sget-object v17, La/oe9;->a:La/oe9;

    .line 324
    .line 325
    new-instance v1, La/ue9;

    .line 326
    .line 327
    invoke-static {v4, v2}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-direct {v1, v3}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    const/16 v20, 0x0

    .line 335
    .line 336
    const/16 v21, 0x0

    .line 337
    .line 338
    iget-boolean v0, v0, La/ldc;->b:Z

    .line 339
    .line 340
    move/from16 v19, v0

    .line 341
    .line 342
    move-object/from16 v18, v1

    .line 343
    .line 344
    invoke-direct/range {v15 .. v21}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    if-nez v0, :cond_9

    .line 356
    .line 357
    if-ne v1, v9, :cond_a

    .line 358
    .line 359
    :cond_9
    new-instance v1, La/xwy;

    .line 360
    .line 361
    const/16 v0, 0x15

    .line 362
    .line 363
    invoke-direct {v1, v8, v0}, La/xwy;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    :cond_a
    move-object/from16 v16, v1

    .line 370
    .line 371
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 372
    .line 373
    const/16 v18, 0x0

    .line 374
    .line 375
    const/16 v19, 0x0

    .line 376
    .line 377
    move-object/from16 v17, v2

    .line 378
    .line 379
    invoke-static/range {v14 .. v19}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 380
    .line 381
    .line 382
    goto :goto_3

    .line 383
    :cond_b
    move-object/from16 v17, v2

    .line 384
    .line 385
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 386
    .line 387
    .line 388
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    return-object v0

    .line 391
    :pswitch_2
    move-object/from16 v1, p1

    .line 392
    .line 393
    check-cast v1, La/ir8;

    .line 394
    .line 395
    move-object/from16 v2, p2

    .line 396
    .line 397
    check-cast v2, La/fet;

    .line 398
    .line 399
    move-object/from16 v4, p3

    .line 400
    .line 401
    check-cast v4, Ljava/lang/Integer;

    .line 402
    .line 403
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    and-int/lit8 v1, v4, 0x11

    .line 411
    .line 412
    if-eq v1, v7, :cond_c

    .line 413
    .line 414
    move v13, v12

    .line 415
    :cond_c
    and-int/lit8 v1, v4, 0x1

    .line 416
    .line 417
    invoke-virtual {v2, v1, v13}, La/fet;->U(IZ)Z

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    if-eqz v1, :cond_f

    .line 422
    .line 423
    invoke-static {v11, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    iget v4, v4, La/wfn;->d:F

    .line 432
    .line 433
    sget-object v5, La/qmk;->a:La/zcl;

    .line 434
    .line 435
    invoke-static {v1, v4, v10}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 436
    .line 437
    .line 438
    move-result-object v14

    .line 439
    new-instance v15, La/wul;

    .line 440
    .line 441
    sget-object v16, La/lul;->e:La/lul;

    .line 442
    .line 443
    sget-object v17, La/oe9;->a:La/oe9;

    .line 444
    .line 445
    new-instance v1, La/ue9;

    .line 446
    .line 447
    const v4, 0x7f130dfb

    .line 448
    .line 449
    .line 450
    invoke-static {v4, v2}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    invoke-direct {v1, v4}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    const/16 v20, 0x0

    .line 458
    .line 459
    const/16 v21, 0x0

    .line 460
    .line 461
    iget-boolean v0, v0, La/ldc;->b:Z

    .line 462
    .line 463
    move/from16 v19, v0

    .line 464
    .line 465
    move-object/from16 v18, v1

    .line 466
    .line 467
    invoke-direct/range {v15 .. v21}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    if-nez v0, :cond_d

    .line 479
    .line 480
    if-ne v1, v9, :cond_e

    .line 481
    .line 482
    :cond_d
    new-instance v1, La/xwy;

    .line 483
    .line 484
    invoke-direct {v1, v8, v3}, La/xwy;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    :cond_e
    move-object/from16 v16, v1

    .line 491
    .line 492
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 493
    .line 494
    const/16 v18, 0x0

    .line 495
    .line 496
    const/16 v19, 0x0

    .line 497
    .line 498
    move-object/from16 v17, v2

    .line 499
    .line 500
    invoke-static/range {v14 .. v19}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 501
    .line 502
    .line 503
    goto :goto_4

    .line 504
    :cond_f
    move-object/from16 v17, v2

    .line 505
    .line 506
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 507
    .line 508
    .line 509
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 510
    .line 511
    return-object v0

    .line 512
    :pswitch_3
    move-object/from16 v1, p1

    .line 513
    .line 514
    check-cast v1, La/lr8;

    .line 515
    .line 516
    move-object/from16 v4, p2

    .line 517
    .line 518
    check-cast v4, La/fet;

    .line 519
    .line 520
    move-object/from16 v5, p3

    .line 521
    .line 522
    check-cast v5, Ljava/lang/Integer;

    .line 523
    .line 524
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 525
    .line 526
    .line 527
    move-result v5

    .line 528
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    and-int/lit8 v6, v5, 0x6

    .line 532
    .line 533
    const/4 v7, 0x4

    .line 534
    if-nez v6, :cond_11

    .line 535
    .line 536
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v6

    .line 540
    if-eqz v6, :cond_10

    .line 541
    .line 542
    move v6, v7

    .line 543
    goto :goto_5

    .line 544
    :cond_10
    const/4 v6, 0x2

    .line 545
    :goto_5
    or-int/2addr v5, v6

    .line 546
    :cond_11
    and-int/lit8 v6, v5, 0x13

    .line 547
    .line 548
    if-eq v6, v3, :cond_12

    .line 549
    .line 550
    move v3, v12

    .line 551
    goto :goto_6

    .line 552
    :cond_12
    move v3, v13

    .line 553
    :goto_6
    and-int/2addr v5, v12

    .line 554
    invoke-virtual {v4, v5, v3}, La/fet;->U(IZ)Z

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    if-eqz v3, :cond_1c

    .line 559
    .line 560
    sget-object v3, La/bmd;->h:La/zfn;

    .line 561
    .line 562
    invoke-virtual {v4, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    check-cast v3, La/w6k;

    .line 567
    .line 568
    invoke-virtual {v1}, La/lr8;->d()F

    .line 569
    .line 570
    .line 571
    move-result v5

    .line 572
    invoke-interface {v3, v5}, La/w6k;->T(F)I

    .line 573
    .line 574
    .line 575
    move-result v5

    .line 576
    invoke-virtual {v1}, La/lr8;->c()F

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    invoke-interface {v3, v1}, La/w6k;->T(F)I

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    int-to-long v5, v5

    .line 585
    const/16 v3, 0x20

    .line 586
    .line 587
    shl-long/2addr v5, v3

    .line 588
    int-to-long v14, v1

    .line 589
    const-wide v16, 0xffffffffL

    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    and-long v14, v14, v16

    .line 595
    .line 596
    or-long/2addr v5, v14

    .line 597
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    if-ne v1, v9, :cond_13

    .line 602
    .line 603
    new-instance v1, La/qkx;

    .line 604
    .line 605
    const-wide/16 v14, 0x0

    .line 606
    .line 607
    invoke-direct {v1, v14, v15}, La/qkx;-><init>(J)V

    .line 608
    .line 609
    .line 610
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-virtual {v4, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    :cond_13
    move-object/from16 v20, v1

    .line 618
    .line 619
    check-cast v20, La/pz40;

    .line 620
    .line 621
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    if-ne v1, v9, :cond_14

    .line 626
    .line 627
    const/4 v1, 0x0

    .line 628
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    invoke-virtual {v4, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    :cond_14
    move-object/from16 v19, v1

    .line 636
    .line 637
    check-cast v19, La/pz40;

    .line 638
    .line 639
    sget-object v1, La/gqw0;->k:La/yx7;

    .line 640
    .line 641
    invoke-virtual {v4, v5, v6}, La/fet;->f(J)Z

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v8

    .line 649
    if-nez v3, :cond_16

    .line 650
    .line 651
    if-ne v8, v9, :cond_15

    .line 652
    .line 653
    goto :goto_7

    .line 654
    :cond_15
    move-object/from16 v14, v19

    .line 655
    .line 656
    move-object/from16 v3, v20

    .line 657
    .line 658
    goto :goto_8

    .line 659
    :cond_16
    :goto_7
    new-instance v16, La/gjj;

    .line 660
    .line 661
    const/16 v21, 0x1

    .line 662
    .line 663
    move-wide/from16 v17, v5

    .line 664
    .line 665
    invoke-direct/range {v16 .. v21}, La/gjj;-><init>(JLa/pz40;La/pz40;B)V

    .line 666
    .line 667
    .line 668
    move-object/from16 v8, v16

    .line 669
    .line 670
    move-object/from16 v14, v19

    .line 671
    .line 672
    move-object/from16 v3, v20

    .line 673
    .line 674
    invoke-virtual {v4, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    :goto_8
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 678
    .line 679
    invoke-static {v11, v8}, La/ffb0;->P(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 680
    .line 681
    .line 682
    move-result-object v8

    .line 683
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v15

    .line 687
    if-ne v15, v9, :cond_17

    .line 688
    .line 689
    new-instance v15, La/y9v;

    .line 690
    .line 691
    invoke-direct {v15, v3, v7}, La/y9v;-><init>(La/pz40;B)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v4, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    :cond_17
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 698
    .line 699
    invoke-static {v8, v15}, La/fre0;->Y(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 700
    .line 701
    .line 702
    move-result-object v7

    .line 703
    new-instance v8, La/qkx;

    .line 704
    .line 705
    invoke-direct {v8, v5, v6}, La/qkx;-><init>(J)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v4, v5, v6}, La/fet;->f(J)Z

    .line 709
    .line 710
    .line 711
    move-result v15

    .line 712
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v12

    .line 716
    if-nez v15, :cond_18

    .line 717
    .line 718
    if-ne v12, v9, :cond_19

    .line 719
    .line 720
    :cond_18
    new-instance v12, La/tmx;

    .line 721
    .line 722
    invoke-direct {v12, v5, v6, v14, v3}, La/tmx;-><init>(JLa/pz40;La/pz40;)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v4, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    :cond_19
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 729
    .line 730
    invoke-static {v7, v8, v12}, La/fnn0;->a(La/mm40;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)La/mm40;

    .line 731
    .line 732
    .line 733
    move-result-object v3

    .line 734
    sget-object v5, La/qmk;->m:La/zcl;

    .line 735
    .line 736
    sget-object v6, La/vgg0;->a:La/ugg0;

    .line 737
    .line 738
    invoke-static {v5, v5, v5, v5, v3}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 743
    .line 744
    invoke-virtual {v4, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v5

    .line 748
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 749
    .line 750
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 751
    .line 752
    .line 753
    move-result-wide v5

    .line 754
    sget-object v7, La/jd8;->n:La/ljc;

    .line 755
    .line 756
    invoke-static {v3, v5, v6, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 757
    .line 758
    .line 759
    move-result-object v3

    .line 760
    const/high16 v5, 0x41800000    # 16.0f

    .line 761
    .line 762
    const/high16 v6, 0x41000000    # 8.0f

    .line 763
    .line 764
    invoke-static {v3, v5, v6}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    sget-object v5, La/uc9;->a:La/lw3;

    .line 769
    .line 770
    const/16 v6, 0x30

    .line 771
    .line 772
    invoke-static {v5, v1, v4, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    iget-wide v5, v4, La/fet;->T:J

    .line 777
    .line 778
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 779
    .line 780
    .line 781
    move-result v5

    .line 782
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 783
    .line 784
    .line 785
    move-result-object v6

    .line 786
    invoke-static {v4, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 791
    .line 792
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v4}, La/fet;->i0()V

    .line 796
    .line 797
    .line 798
    iget-boolean v7, v4, La/fet;->S:Z

    .line 799
    .line 800
    if-eqz v7, :cond_1a

    .line 801
    .line 802
    invoke-virtual {v4, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 803
    .line 804
    .line 805
    goto :goto_9

    .line 806
    :cond_1a
    invoke-virtual {v4}, La/fet;->r0()V

    .line 807
    .line 808
    .line 809
    :goto_9
    sget-object v2, La/gqw0;->x:La/shd;

    .line 810
    .line 811
    invoke-static {v4, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 812
    .line 813
    .line 814
    sget-object v1, La/gqw0;->w:La/shd;

    .line 815
    .line 816
    invoke-static {v4, v6, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 817
    .line 818
    .line 819
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    sget-object v2, La/gqw0;->y:La/shd;

    .line 824
    .line 825
    invoke-static {v4, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 826
    .line 827
    .line 828
    invoke-static {v4}, La/jpm0;->n(La/fet;)V

    .line 829
    .line 830
    .line 831
    sget-object v1, La/gqw0;->v:La/shd;

    .line 832
    .line 833
    invoke-static {v4, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 834
    .line 835
    .line 836
    const v1, 0x7f130a83

    .line 837
    .line 838
    .line 839
    invoke-static {v1, v13, v4}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v14

    .line 843
    sget-object v1, La/j1t0;->e:La/zfn;

    .line 844
    .line 845
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v1

    .line 849
    check-cast v1, La/g1t0;

    .line 850
    .line 851
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 855
    .line 856
    .line 857
    move-result-object v16

    .line 858
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    if-ne v1, v9, :cond_1b

    .line 863
    .line 864
    sget-object v1, La/m6m;->d:La/m6m;

    .line 865
    .line 866
    invoke-virtual {v4, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    :cond_1b
    move-object/from16 v22, v1

    .line 870
    .line 871
    check-cast v22, La/n4d;

    .line 872
    .line 873
    const/16 v25, 0x0

    .line 874
    .line 875
    const/16 v26, 0x2fa

    .line 876
    .line 877
    const/4 v15, 0x0

    .line 878
    const/16 v17, 0x0

    .line 879
    .line 880
    const/16 v18, 0x0

    .line 881
    .line 882
    const/16 v19, 0x0

    .line 883
    .line 884
    const/16 v20, 0x0

    .line 885
    .line 886
    const/16 v21, 0x0

    .line 887
    .line 888
    const/16 v23, 0x0

    .line 889
    .line 890
    move-object/from16 v24, v4

    .line 891
    .line 892
    invoke-static/range {v14 .. v26}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 893
    .line 894
    .line 895
    move-object/from16 v1, v24

    .line 896
    .line 897
    invoke-static {v11, v10}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 898
    .line 899
    .line 900
    move-result-object v2

    .line 901
    invoke-static {v1, v2}, La/qxw;->o(La/fet;La/mm40;)V

    .line 902
    .line 903
    .line 904
    const/16 v21, 0xd

    .line 905
    .line 906
    const/4 v14, 0x0

    .line 907
    iget-boolean v15, v0, La/ldc;->b:Z

    .line 908
    .line 909
    const/16 v16, 0x0

    .line 910
    .line 911
    iget-object v0, v0, La/ldc;->c:Lkotlin/jvm/functions/Function1;

    .line 912
    .line 913
    move-object/from16 v18, v0

    .line 914
    .line 915
    move-object/from16 v19, v1

    .line 916
    .line 917
    invoke-static/range {v14 .. v21}, La/n5n;->b(La/mm40;ZZLa/gy40;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 918
    .line 919
    .line 920
    const/4 v0, 0x1

    .line 921
    invoke-virtual {v1, v0}, La/fet;->r(Z)V

    .line 922
    .line 923
    .line 924
    goto :goto_a

    .line 925
    :cond_1c
    move-object v1, v4

    .line 926
    invoke-virtual {v1}, La/fet;->X()V

    .line 927
    .line 928
    .line 929
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 930
    .line 931
    return-object v0

    .line 932
    :pswitch_4
    move-object/from16 v1, p1

    .line 933
    .line 934
    check-cast v1, La/ir8;

    .line 935
    .line 936
    move-object/from16 v3, p2

    .line 937
    .line 938
    check-cast v3, La/fet;

    .line 939
    .line 940
    move-object/from16 v4, p3

    .line 941
    .line 942
    check-cast v4, Ljava/lang/Integer;

    .line 943
    .line 944
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 945
    .line 946
    .line 947
    move-result v4

    .line 948
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    .line 950
    .line 951
    and-int/lit8 v1, v4, 0x11

    .line 952
    .line 953
    if-eq v1, v7, :cond_1d

    .line 954
    .line 955
    const/4 v1, 0x1

    .line 956
    :goto_b
    const/16 v27, 0x1

    .line 957
    .line 958
    goto :goto_c

    .line 959
    :cond_1d
    move v1, v13

    .line 960
    goto :goto_b

    .line 961
    :goto_c
    and-int/lit8 v4, v4, 0x1

    .line 962
    .line 963
    invoke-virtual {v3, v4, v1}, La/fet;->U(IZ)Z

    .line 964
    .line 965
    .line 966
    move-result v1

    .line 967
    if-eqz v1, :cond_21

    .line 968
    .line 969
    sget-object v1, La/uc9;->c:La/mw3;

    .line 970
    .line 971
    sget-object v4, La/gqw0;->m:La/xx7;

    .line 972
    .line 973
    invoke-static {v1, v4, v3, v13}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 974
    .line 975
    .line 976
    move-result-object v1

    .line 977
    iget-wide v12, v3, La/fet;->T:J

    .line 978
    .line 979
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 980
    .line 981
    .line 982
    move-result v4

    .line 983
    invoke-virtual {v3}, La/fet;->m()La/bh90;

    .line 984
    .line 985
    .line 986
    move-result-object v7

    .line 987
    invoke-static {v3, v11}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 988
    .line 989
    .line 990
    move-result-object v12

    .line 991
    sget-object v13, La/mkd;->c0:La/gqw0;

    .line 992
    .line 993
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 994
    .line 995
    .line 996
    invoke-virtual {v3}, La/fet;->i0()V

    .line 997
    .line 998
    .line 999
    iget-boolean v13, v3, La/fet;->S:Z

    .line 1000
    .line 1001
    if-eqz v13, :cond_1e

    .line 1002
    .line 1003
    invoke-virtual {v3, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1004
    .line 1005
    .line 1006
    goto :goto_d

    .line 1007
    :cond_1e
    invoke-virtual {v3}, La/fet;->r0()V

    .line 1008
    .line 1009
    .line 1010
    :goto_d
    sget-object v2, La/gqw0;->x:La/shd;

    .line 1011
    .line 1012
    invoke-static {v3, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1013
    .line 1014
    .line 1015
    sget-object v1, La/gqw0;->w:La/shd;

    .line 1016
    .line 1017
    invoke-static {v3, v7, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1018
    .line 1019
    .line 1020
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v1

    .line 1024
    sget-object v2, La/gqw0;->y:La/shd;

    .line 1025
    .line 1026
    invoke-static {v3, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1027
    .line 1028
    .line 1029
    invoke-static {v3}, La/jpm0;->n(La/fet;)V

    .line 1030
    .line 1031
    .line 1032
    sget-object v1, La/gqw0;->v:La/shd;

    .line 1033
    .line 1034
    invoke-static {v3, v12, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1035
    .line 1036
    .line 1037
    invoke-static {v11, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v1

    .line 1041
    invoke-static {v3}, La/xfn;->a(La/fet;)La/wfn;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v2

    .line 1045
    iget v2, v2, La/wfn;->d:F

    .line 1046
    .line 1047
    sget-object v4, La/qmk;->a:La/zcl;

    .line 1048
    .line 1049
    invoke-static {v1, v2, v10}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v14

    .line 1053
    new-instance v15, La/wul;

    .line 1054
    .line 1055
    sget-object v16, La/lul;->e:La/lul;

    .line 1056
    .line 1057
    sget-object v17, La/oe9;->a:La/oe9;

    .line 1058
    .line 1059
    new-instance v1, La/ue9;

    .line 1060
    .line 1061
    invoke-static {v5, v3}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v2

    .line 1065
    invoke-direct {v1, v2}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 1066
    .line 1067
    .line 1068
    const/16 v20, 0x0

    .line 1069
    .line 1070
    const/16 v21, 0x0

    .line 1071
    .line 1072
    iget-boolean v0, v0, La/ldc;->b:Z

    .line 1073
    .line 1074
    move/from16 v19, v0

    .line 1075
    .line 1076
    move-object/from16 v18, v1

    .line 1077
    .line 1078
    invoke-direct/range {v15 .. v21}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v3, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v0

    .line 1085
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    if-nez v0, :cond_1f

    .line 1090
    .line 1091
    if-ne v1, v9, :cond_20

    .line 1092
    .line 1093
    :cond_1f
    new-instance v1, La/dib;

    .line 1094
    .line 1095
    const/16 v0, 0x8

    .line 1096
    .line 1097
    invoke-direct {v1, v8, v0}, La/dib;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v3, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1101
    .line 1102
    .line 1103
    :cond_20
    move-object/from16 v16, v1

    .line 1104
    .line 1105
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 1106
    .line 1107
    const/16 v18, 0x0

    .line 1108
    .line 1109
    const/16 v19, 0x0

    .line 1110
    .line 1111
    move-object/from16 v17, v3

    .line 1112
    .line 1113
    invoke-static/range {v14 .. v19}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1114
    .line 1115
    .line 1116
    move-object/from16 v0, v17

    .line 1117
    .line 1118
    const/4 v1, 0x1

    .line 1119
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 1120
    .line 1121
    .line 1122
    goto :goto_e

    .line 1123
    :cond_21
    move-object v0, v3

    .line 1124
    invoke-virtual {v0}, La/fet;->X()V

    .line 1125
    .line 1126
    .line 1127
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1128
    .line 1129
    return-object v0

    .line 1130
    nop

    .line 1131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
