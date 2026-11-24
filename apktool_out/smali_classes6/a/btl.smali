.class public final La/btl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Integer;

.field public final synthetic e:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILjava/lang/Integer;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/btl;->a:B

    iput-object p1, p0, La/btl;->b:Ljava/util/List;

    iput p2, p0, La/btl;->c:I

    iput-object p3, p0, La/btl;->d:Ljava/lang/Integer;

    iput-object p4, p0, La/btl;->e:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/btl;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/btl;->b:Ljava/util/List;

    .line 6
    .line 7
    const/16 v3, 0x92

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    const/16 v5, 0x20

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/g9z;

    .line 23
    .line 24
    move-object/from16 v10, p2

    .line 25
    .line 26
    check-cast v10, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v10

    .line 32
    move-object/from16 v11, p3

    .line 33
    .line 34
    check-cast v11, La/fet;

    .line 35
    .line 36
    move-object/from16 v12, p4

    .line 37
    .line 38
    check-cast v12, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v12

    .line 44
    and-int/lit8 v13, v12, 0x6

    .line 45
    .line 46
    if-nez v13, :cond_1

    .line 47
    .line 48
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    move v6, v7

    .line 55
    :cond_0
    or-int v1, v12, v6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move v1, v12

    .line 59
    :goto_0
    and-int/lit8 v6, v12, 0x30

    .line 60
    .line 61
    if-nez v6, :cond_3

    .line 62
    .line 63
    invoke-virtual {v11, v10}, La/fet;->e(I)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    move v4, v5

    .line 70
    :cond_2
    or-int/2addr v1, v4

    .line 71
    :cond_3
    and-int/lit16 v4, v1, 0x93

    .line 72
    .line 73
    if-eq v4, v3, :cond_4

    .line 74
    .line 75
    move v3, v8

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    move v3, v9

    .line 78
    :goto_1
    and-int/2addr v1, v8

    .line 79
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_5

    .line 84
    .line 85
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    move-object v12, v1

    .line 90
    check-cast v12, La/fr5;

    .line 91
    .line 92
    const v1, -0x575b283b

    .line 93
    .line 94
    .line 95
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 96
    .line 97
    .line 98
    iget-object v15, v0, La/btl;->e:Lkotlin/jvm/functions/Function2;

    .line 99
    .line 100
    const/16 v17, 0x0

    .line 101
    .line 102
    move-object/from16 v16, v11

    .line 103
    .line 104
    const/4 v11, 0x0

    .line 105
    iget v13, v0, La/btl;->c:I

    .line 106
    .line 107
    iget-object v14, v0, La/btl;->d:Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-static/range {v11 .. v17}, La/j0x;->o(La/mm40;La/fr5;ILjava/lang/Integer;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 110
    .line 111
    .line 112
    move-object/from16 v0, v16

    .line 113
    .line 114
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    move-object v0, v11

    .line 119
    invoke-virtual {v0}, La/fet;->X()V

    .line 120
    .line 121
    .line 122
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_0
    move-object/from16 v1, p1

    .line 126
    .line 127
    check-cast v1, La/g9z;

    .line 128
    .line 129
    move-object/from16 v10, p2

    .line 130
    .line 131
    check-cast v10, Ljava/lang/Number;

    .line 132
    .line 133
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    move-object/from16 v11, p3

    .line 138
    .line 139
    check-cast v11, La/fet;

    .line 140
    .line 141
    move-object/from16 v12, p4

    .line 142
    .line 143
    check-cast v12, Ljava/lang/Number;

    .line 144
    .line 145
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    and-int/lit8 v13, v12, 0x6

    .line 150
    .line 151
    if-nez v13, :cond_7

    .line 152
    .line 153
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_6

    .line 158
    .line 159
    move v6, v7

    .line 160
    :cond_6
    or-int v1, v12, v6

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_7
    move v1, v12

    .line 164
    :goto_3
    and-int/lit8 v6, v12, 0x30

    .line 165
    .line 166
    if-nez v6, :cond_9

    .line 167
    .line 168
    invoke-virtual {v11, v10}, La/fet;->e(I)Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-eqz v6, :cond_8

    .line 173
    .line 174
    move v4, v5

    .line 175
    :cond_8
    or-int/2addr v1, v4

    .line 176
    :cond_9
    and-int/lit16 v4, v1, 0x93

    .line 177
    .line 178
    if-eq v4, v3, :cond_a

    .line 179
    .line 180
    move v3, v8

    .line 181
    goto :goto_4

    .line 182
    :cond_a
    move v3, v9

    .line 183
    :goto_4
    and-int/2addr v1, v8

    .line 184
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_b

    .line 189
    .line 190
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    move-object v12, v1

    .line 195
    check-cast v12, La/fr5;

    .line 196
    .line 197
    const v1, -0x656ed1c1

    .line 198
    .line 199
    .line 200
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 201
    .line 202
    .line 203
    iget-object v15, v0, La/btl;->e:Lkotlin/jvm/functions/Function2;

    .line 204
    .line 205
    const/16 v17, 0x0

    .line 206
    .line 207
    move-object/from16 v16, v11

    .line 208
    .line 209
    const/4 v11, 0x0

    .line 210
    iget v13, v0, La/btl;->c:I

    .line 211
    .line 212
    iget-object v14, v0, La/btl;->d:Ljava/lang/Integer;

    .line 213
    .line 214
    invoke-static/range {v11 .. v17}, La/q0x;->A(La/mm40;La/fr5;ILjava/lang/Integer;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 215
    .line 216
    .line 217
    move-object/from16 v0, v16

    .line 218
    .line 219
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 220
    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_b
    move-object v0, v11

    .line 224
    invoke-virtual {v0}, La/fet;->X()V

    .line 225
    .line 226
    .line 227
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_1
    move-object/from16 v1, p1

    .line 231
    .line 232
    check-cast v1, La/g9z;

    .line 233
    .line 234
    move-object/from16 v10, p2

    .line 235
    .line 236
    check-cast v10, Ljava/lang/Number;

    .line 237
    .line 238
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    move-object/from16 v11, p3

    .line 243
    .line 244
    check-cast v11, La/fet;

    .line 245
    .line 246
    move-object/from16 v12, p4

    .line 247
    .line 248
    check-cast v12, Ljava/lang/Number;

    .line 249
    .line 250
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result v12

    .line 254
    and-int/lit8 v13, v12, 0x6

    .line 255
    .line 256
    if-nez v13, :cond_d

    .line 257
    .line 258
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-eqz v1, :cond_c

    .line 263
    .line 264
    move v6, v7

    .line 265
    :cond_c
    or-int v1, v12, v6

    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_d
    move v1, v12

    .line 269
    :goto_6
    and-int/lit8 v6, v12, 0x30

    .line 270
    .line 271
    if-nez v6, :cond_f

    .line 272
    .line 273
    invoke-virtual {v11, v10}, La/fet;->e(I)Z

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    if-eqz v6, :cond_e

    .line 278
    .line 279
    move v4, v5

    .line 280
    :cond_e
    or-int/2addr v1, v4

    .line 281
    :cond_f
    and-int/lit16 v4, v1, 0x93

    .line 282
    .line 283
    if-eq v4, v3, :cond_10

    .line 284
    .line 285
    move v3, v8

    .line 286
    goto :goto_7

    .line 287
    :cond_10
    move v3, v9

    .line 288
    :goto_7
    and-int/2addr v1, v8

    .line 289
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-eqz v1, :cond_11

    .line 294
    .line 295
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    move-object v12, v1

    .line 300
    check-cast v12, La/fr5;

    .line 301
    .line 302
    const v1, -0x2e52928

    .line 303
    .line 304
    .line 305
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 306
    .line 307
    .line 308
    iget-object v15, v0, La/btl;->e:Lkotlin/jvm/functions/Function2;

    .line 309
    .line 310
    const/16 v17, 0x0

    .line 311
    .line 312
    move-object/from16 v16, v11

    .line 313
    .line 314
    const/4 v11, 0x0

    .line 315
    iget v13, v0, La/btl;->c:I

    .line 316
    .line 317
    iget-object v14, v0, La/btl;->d:Ljava/lang/Integer;

    .line 318
    .line 319
    invoke-static/range {v11 .. v17}, La/i4w0;->l(La/mm40;La/fr5;ILjava/lang/Integer;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 320
    .line 321
    .line 322
    move-object/from16 v0, v16

    .line 323
    .line 324
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 325
    .line 326
    .line 327
    goto :goto_8

    .line 328
    :cond_11
    move-object v0, v11

    .line 329
    invoke-virtual {v0}, La/fet;->X()V

    .line 330
    .line 331
    .line 332
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    return-object v0

    .line 335
    :pswitch_2
    move-object/from16 v1, p1

    .line 336
    .line 337
    check-cast v1, La/g9z;

    .line 338
    .line 339
    move-object/from16 v10, p2

    .line 340
    .line 341
    check-cast v10, Ljava/lang/Number;

    .line 342
    .line 343
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v10

    .line 347
    move-object/from16 v11, p3

    .line 348
    .line 349
    check-cast v11, La/fet;

    .line 350
    .line 351
    move-object/from16 v12, p4

    .line 352
    .line 353
    check-cast v12, Ljava/lang/Number;

    .line 354
    .line 355
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 356
    .line 357
    .line 358
    move-result v12

    .line 359
    and-int/lit8 v13, v12, 0x6

    .line 360
    .line 361
    if-nez v13, :cond_13

    .line 362
    .line 363
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-eqz v1, :cond_12

    .line 368
    .line 369
    move v6, v7

    .line 370
    :cond_12
    or-int v1, v12, v6

    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_13
    move v1, v12

    .line 374
    :goto_9
    and-int/lit8 v6, v12, 0x30

    .line 375
    .line 376
    if-nez v6, :cond_15

    .line 377
    .line 378
    invoke-virtual {v11, v10}, La/fet;->e(I)Z

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    if-eqz v6, :cond_14

    .line 383
    .line 384
    move v4, v5

    .line 385
    :cond_14
    or-int/2addr v1, v4

    .line 386
    :cond_15
    and-int/lit16 v4, v1, 0x93

    .line 387
    .line 388
    if-eq v4, v3, :cond_16

    .line 389
    .line 390
    move v3, v8

    .line 391
    goto :goto_a

    .line 392
    :cond_16
    move v3, v9

    .line 393
    :goto_a
    and-int/2addr v1, v8

    .line 394
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    if-eqz v1, :cond_17

    .line 399
    .line 400
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    move-object v12, v1

    .line 405
    check-cast v12, La/fr5;

    .line 406
    .line 407
    const v1, -0x10f8d213

    .line 408
    .line 409
    .line 410
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 411
    .line 412
    .line 413
    iget-object v15, v0, La/btl;->e:Lkotlin/jvm/functions/Function2;

    .line 414
    .line 415
    const/16 v17, 0x0

    .line 416
    .line 417
    move-object/from16 v16, v11

    .line 418
    .line 419
    const/4 v11, 0x0

    .line 420
    iget v13, v0, La/btl;->c:I

    .line 421
    .line 422
    iget-object v14, v0, La/btl;->d:Ljava/lang/Integer;

    .line 423
    .line 424
    invoke-static/range {v11 .. v17}, La/t9x;->r(La/mm40;La/fr5;ILjava/lang/Integer;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 425
    .line 426
    .line 427
    move-object/from16 v0, v16

    .line 428
    .line 429
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 430
    .line 431
    .line 432
    goto :goto_b

    .line 433
    :cond_17
    move-object v0, v11

    .line 434
    invoke-virtual {v0}, La/fet;->X()V

    .line 435
    .line 436
    .line 437
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 438
    .line 439
    return-object v0

    .line 440
    :pswitch_3
    move-object/from16 v1, p1

    .line 441
    .line 442
    check-cast v1, La/g9z;

    .line 443
    .line 444
    move-object/from16 v10, p2

    .line 445
    .line 446
    check-cast v10, Ljava/lang/Number;

    .line 447
    .line 448
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 449
    .line 450
    .line 451
    move-result v10

    .line 452
    move-object/from16 v11, p3

    .line 453
    .line 454
    check-cast v11, La/fet;

    .line 455
    .line 456
    move-object/from16 v12, p4

    .line 457
    .line 458
    check-cast v12, Ljava/lang/Number;

    .line 459
    .line 460
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 461
    .line 462
    .line 463
    move-result v12

    .line 464
    and-int/lit8 v13, v12, 0x6

    .line 465
    .line 466
    if-nez v13, :cond_19

    .line 467
    .line 468
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-eqz v1, :cond_18

    .line 473
    .line 474
    move v6, v7

    .line 475
    :cond_18
    or-int v1, v12, v6

    .line 476
    .line 477
    goto :goto_c

    .line 478
    :cond_19
    move v1, v12

    .line 479
    :goto_c
    and-int/lit8 v6, v12, 0x30

    .line 480
    .line 481
    if-nez v6, :cond_1b

    .line 482
    .line 483
    invoke-virtual {v11, v10}, La/fet;->e(I)Z

    .line 484
    .line 485
    .line 486
    move-result v6

    .line 487
    if-eqz v6, :cond_1a

    .line 488
    .line 489
    move v4, v5

    .line 490
    :cond_1a
    or-int/2addr v1, v4

    .line 491
    :cond_1b
    and-int/lit16 v4, v1, 0x93

    .line 492
    .line 493
    if-eq v4, v3, :cond_1c

    .line 494
    .line 495
    move v3, v8

    .line 496
    goto :goto_d

    .line 497
    :cond_1c
    move v3, v9

    .line 498
    :goto_d
    and-int/2addr v1, v8

    .line 499
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    if-eqz v1, :cond_1d

    .line 504
    .line 505
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    move-object v12, v1

    .line 510
    check-cast v12, La/fr5;

    .line 511
    .line 512
    const v1, -0x1f0c7d4b

    .line 513
    .line 514
    .line 515
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 516
    .line 517
    .line 518
    iget-object v15, v0, La/btl;->e:Lkotlin/jvm/functions/Function2;

    .line 519
    .line 520
    const/16 v17, 0x0

    .line 521
    .line 522
    move-object/from16 v16, v11

    .line 523
    .line 524
    const/4 v11, 0x0

    .line 525
    iget v13, v0, La/btl;->c:I

    .line 526
    .line 527
    iget-object v14, v0, La/btl;->d:Ljava/lang/Integer;

    .line 528
    .line 529
    invoke-static/range {v11 .. v17}, La/t9x;->q(La/mm40;La/fr5;ILjava/lang/Integer;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 530
    .line 531
    .line 532
    move-object/from16 v0, v16

    .line 533
    .line 534
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 535
    .line 536
    .line 537
    goto :goto_e

    .line 538
    :cond_1d
    move-object v0, v11

    .line 539
    invoke-virtual {v0}, La/fet;->X()V

    .line 540
    .line 541
    .line 542
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 543
    .line 544
    return-object v0

    .line 545
    :pswitch_4
    move-object/from16 v1, p1

    .line 546
    .line 547
    check-cast v1, La/g9z;

    .line 548
    .line 549
    move-object/from16 v10, p2

    .line 550
    .line 551
    check-cast v10, Ljava/lang/Number;

    .line 552
    .line 553
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 554
    .line 555
    .line 556
    move-result v10

    .line 557
    move-object/from16 v11, p3

    .line 558
    .line 559
    check-cast v11, La/fet;

    .line 560
    .line 561
    move-object/from16 v12, p4

    .line 562
    .line 563
    check-cast v12, Ljava/lang/Number;

    .line 564
    .line 565
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 566
    .line 567
    .line 568
    move-result v12

    .line 569
    and-int/lit8 v13, v12, 0x6

    .line 570
    .line 571
    if-nez v13, :cond_1f

    .line 572
    .line 573
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v1

    .line 577
    if-eqz v1, :cond_1e

    .line 578
    .line 579
    move v6, v7

    .line 580
    :cond_1e
    or-int v1, v12, v6

    .line 581
    .line 582
    goto :goto_f

    .line 583
    :cond_1f
    move v1, v12

    .line 584
    :goto_f
    and-int/lit8 v6, v12, 0x30

    .line 585
    .line 586
    if-nez v6, :cond_21

    .line 587
    .line 588
    invoke-virtual {v11, v10}, La/fet;->e(I)Z

    .line 589
    .line 590
    .line 591
    move-result v6

    .line 592
    if-eqz v6, :cond_20

    .line 593
    .line 594
    move v4, v5

    .line 595
    :cond_20
    or-int/2addr v1, v4

    .line 596
    :cond_21
    and-int/lit16 v4, v1, 0x93

    .line 597
    .line 598
    if-eq v4, v3, :cond_22

    .line 599
    .line 600
    move v3, v8

    .line 601
    goto :goto_10

    .line 602
    :cond_22
    move v3, v9

    .line 603
    :goto_10
    and-int/2addr v1, v8

    .line 604
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 605
    .line 606
    .line 607
    move-result v1

    .line 608
    if-eqz v1, :cond_23

    .line 609
    .line 610
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    move-object v12, v1

    .line 615
    check-cast v12, La/fr5;

    .line 616
    .line 617
    const v1, -0x2d20270f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 621
    .line 622
    .line 623
    iget-object v15, v0, La/btl;->e:Lkotlin/jvm/functions/Function2;

    .line 624
    .line 625
    const/16 v17, 0x0

    .line 626
    .line 627
    move-object/from16 v16, v11

    .line 628
    .line 629
    const/4 v11, 0x0

    .line 630
    iget v13, v0, La/btl;->c:I

    .line 631
    .line 632
    iget-object v14, v0, La/btl;->d:Ljava/lang/Integer;

    .line 633
    .line 634
    invoke-static/range {v11 .. v17}, La/w9x;->p(La/mm40;La/fr5;ILjava/lang/Integer;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 635
    .line 636
    .line 637
    move-object/from16 v0, v16

    .line 638
    .line 639
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 640
    .line 641
    .line 642
    goto :goto_11

    .line 643
    :cond_23
    move-object v0, v11

    .line 644
    invoke-virtual {v0}, La/fet;->X()V

    .line 645
    .line 646
    .line 647
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 648
    .line 649
    return-object v0

    .line 650
    :pswitch_5
    move-object/from16 v1, p1

    .line 651
    .line 652
    check-cast v1, La/g9z;

    .line 653
    .line 654
    move-object/from16 v10, p2

    .line 655
    .line 656
    check-cast v10, Ljava/lang/Number;

    .line 657
    .line 658
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 659
    .line 660
    .line 661
    move-result v10

    .line 662
    move-object/from16 v11, p3

    .line 663
    .line 664
    check-cast v11, La/fet;

    .line 665
    .line 666
    move-object/from16 v12, p4

    .line 667
    .line 668
    check-cast v12, Ljava/lang/Number;

    .line 669
    .line 670
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 671
    .line 672
    .line 673
    move-result v12

    .line 674
    and-int/lit8 v13, v12, 0x6

    .line 675
    .line 676
    if-nez v13, :cond_25

    .line 677
    .line 678
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v1

    .line 682
    if-eqz v1, :cond_24

    .line 683
    .line 684
    move v6, v7

    .line 685
    :cond_24
    or-int v1, v12, v6

    .line 686
    .line 687
    goto :goto_12

    .line 688
    :cond_25
    move v1, v12

    .line 689
    :goto_12
    and-int/lit8 v6, v12, 0x30

    .line 690
    .line 691
    if-nez v6, :cond_27

    .line 692
    .line 693
    invoke-virtual {v11, v10}, La/fet;->e(I)Z

    .line 694
    .line 695
    .line 696
    move-result v6

    .line 697
    if-eqz v6, :cond_26

    .line 698
    .line 699
    move v4, v5

    .line 700
    :cond_26
    or-int/2addr v1, v4

    .line 701
    :cond_27
    and-int/lit16 v4, v1, 0x93

    .line 702
    .line 703
    if-eq v4, v3, :cond_28

    .line 704
    .line 705
    move v3, v8

    .line 706
    goto :goto_13

    .line 707
    :cond_28
    move v3, v9

    .line 708
    :goto_13
    and-int/2addr v1, v8

    .line 709
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 710
    .line 711
    .line 712
    move-result v1

    .line 713
    if-eqz v1, :cond_29

    .line 714
    .line 715
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    move-object v12, v1

    .line 720
    check-cast v12, La/fr5;

    .line 721
    .line 722
    const v1, -0x3b33d247

    .line 723
    .line 724
    .line 725
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 726
    .line 727
    .line 728
    iget-object v15, v0, La/btl;->e:Lkotlin/jvm/functions/Function2;

    .line 729
    .line 730
    const/16 v17, 0x0

    .line 731
    .line 732
    move-object/from16 v16, v11

    .line 733
    .line 734
    const/4 v11, 0x0

    .line 735
    iget v13, v0, La/btl;->c:I

    .line 736
    .line 737
    iget-object v14, v0, La/btl;->d:Ljava/lang/Integer;

    .line 738
    .line 739
    invoke-static/range {v11 .. v17}, La/w9x;->o(La/mm40;La/fr5;ILjava/lang/Integer;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 740
    .line 741
    .line 742
    move-object/from16 v0, v16

    .line 743
    .line 744
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 745
    .line 746
    .line 747
    goto :goto_14

    .line 748
    :cond_29
    move-object v0, v11

    .line 749
    invoke-virtual {v0}, La/fet;->X()V

    .line 750
    .line 751
    .line 752
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 753
    .line 754
    return-object v0

    .line 755
    :pswitch_6
    move-object/from16 v1, p1

    .line 756
    .line 757
    check-cast v1, La/g9z;

    .line 758
    .line 759
    move-object/from16 v10, p2

    .line 760
    .line 761
    check-cast v10, Ljava/lang/Number;

    .line 762
    .line 763
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 764
    .line 765
    .line 766
    move-result v10

    .line 767
    move-object/from16 v11, p3

    .line 768
    .line 769
    check-cast v11, La/fet;

    .line 770
    .line 771
    move-object/from16 v12, p4

    .line 772
    .line 773
    check-cast v12, Ljava/lang/Number;

    .line 774
    .line 775
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 776
    .line 777
    .line 778
    move-result v12

    .line 779
    and-int/lit8 v13, v12, 0x6

    .line 780
    .line 781
    if-nez v13, :cond_2b

    .line 782
    .line 783
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    move-result v1

    .line 787
    if-eqz v1, :cond_2a

    .line 788
    .line 789
    move v6, v7

    .line 790
    :cond_2a
    or-int v1, v12, v6

    .line 791
    .line 792
    goto :goto_15

    .line 793
    :cond_2b
    move v1, v12

    .line 794
    :goto_15
    and-int/lit8 v6, v12, 0x30

    .line 795
    .line 796
    if-nez v6, :cond_2d

    .line 797
    .line 798
    invoke-virtual {v11, v10}, La/fet;->e(I)Z

    .line 799
    .line 800
    .line 801
    move-result v6

    .line 802
    if-eqz v6, :cond_2c

    .line 803
    .line 804
    move v4, v5

    .line 805
    :cond_2c
    or-int/2addr v1, v4

    .line 806
    :cond_2d
    and-int/lit16 v4, v1, 0x93

    .line 807
    .line 808
    if-eq v4, v3, :cond_2e

    .line 809
    .line 810
    move v3, v8

    .line 811
    goto :goto_16

    .line 812
    :cond_2e
    move v3, v9

    .line 813
    :goto_16
    and-int/2addr v1, v8

    .line 814
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 815
    .line 816
    .line 817
    move-result v1

    .line 818
    if-eqz v1, :cond_2f

    .line 819
    .line 820
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    move-object v12, v1

    .line 825
    check-cast v12, La/fr5;

    .line 826
    .line 827
    const v1, -0x49477d03

    .line 828
    .line 829
    .line 830
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 831
    .line 832
    .line 833
    iget-object v15, v0, La/btl;->e:Lkotlin/jvm/functions/Function2;

    .line 834
    .line 835
    const/16 v17, 0x0

    .line 836
    .line 837
    move-object/from16 v16, v11

    .line 838
    .line 839
    const/4 v11, 0x0

    .line 840
    iget v13, v0, La/btl;->c:I

    .line 841
    .line 842
    iget-object v14, v0, La/btl;->d:Ljava/lang/Integer;

    .line 843
    .line 844
    invoke-static/range {v11 .. v17}, La/j0x;->p(La/mm40;La/fr5;ILjava/lang/Integer;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 845
    .line 846
    .line 847
    move-object/from16 v0, v16

    .line 848
    .line 849
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 850
    .line 851
    .line 852
    goto :goto_17

    .line 853
    :cond_2f
    move-object v0, v11

    .line 854
    invoke-virtual {v0}, La/fet;->X()V

    .line 855
    .line 856
    .line 857
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 858
    .line 859
    return-object v0

    .line 860
    nop

    .line 861
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
