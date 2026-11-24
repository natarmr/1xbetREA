.class public final synthetic La/mo30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ip00;


# direct methods
.method public synthetic constructor <init>(La/ip00;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mo30;->a:B

    iput-object p1, p0, La/mo30;->b:La/ip00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/mo30;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x41800000    # 16.0f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x12

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x4

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x1

    .line 12
    iget-object p0, p0, La/mo30;->b:La/ip00;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object v8, p1

    .line 18
    check-cast v8, La/mm40;

    .line 19
    .line 20
    move-object/from16 v0, p2

    .line 21
    .line 22
    check-cast v0, La/fet;

    .line 23
    .line 24
    move-object/from16 v1, p3

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    and-int/lit8 v2, v1, 0x6

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    move v4, v5

    .line 46
    :cond_0
    or-int/2addr v1, v4

    .line 47
    :cond_1
    and-int/lit8 v2, v1, 0x13

    .line 48
    .line 49
    if-eq v2, v3, :cond_2

    .line 50
    .line 51
    move v2, v7

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move v2, v6

    .line 54
    :goto_0
    and-int/2addr v1, v7

    .line 55
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    sget-object v1, La/qmk;->a:La/zcl;

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    const/16 v13, 0xd

    .line 65
    .line 66
    const/4 v9, 0x0

    .line 67
    const/high16 v10, 0x41c00000    # 24.0f

    .line 68
    .line 69
    const/4 v11, 0x0

    .line 70
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object p0, p0, La/ip00;->c:La/a4x;

    .line 75
    .line 76
    invoke-static {v6, v0, p0, v1}, La/jpm0;->d(ILa/fet;La/a4x;La/mm40;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {v0}, La/fet;->X()V

    .line 81
    .line 82
    .line 83
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_0
    move-object v0, p1

    .line 87
    check-cast v0, La/mm40;

    .line 88
    .line 89
    move-object/from16 v1, p2

    .line 90
    .line 91
    check-cast v1, La/fet;

    .line 92
    .line 93
    move-object/from16 v2, p3

    .line 94
    .line 95
    check-cast v2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    and-int/lit8 v8, v2, 0x6

    .line 105
    .line 106
    if-nez v8, :cond_5

    .line 107
    .line 108
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    if-eqz v8, :cond_4

    .line 113
    .line 114
    move v4, v5

    .line 115
    :cond_4
    or-int/2addr v2, v4

    .line 116
    :cond_5
    and-int/lit8 v4, v2, 0x13

    .line 117
    .line 118
    if-eq v4, v3, :cond_6

    .line 119
    .line 120
    move v6, v7

    .line 121
    :cond_6
    and-int/lit8 v3, v2, 0x1

    .line 122
    .line 123
    invoke-virtual {v1, v3, v6}, La/fet;->U(IZ)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-eqz v3, :cond_7

    .line 128
    .line 129
    iget-object p0, p0, La/ip00;->a:Ljava/lang/String;

    .line 130
    .line 131
    and-int/lit8 v2, v2, 0xe

    .line 132
    .line 133
    invoke-static {v2, v1, v0, p0}, La/aad;->b(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_7
    invoke-virtual {v1}, La/fet;->X()V

    .line 138
    .line 139
    .line 140
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_1
    move-object v0, p1

    .line 144
    check-cast v0, La/mm40;

    .line 145
    .line 146
    move-object/from16 v8, p2

    .line 147
    .line 148
    check-cast v8, La/fet;

    .line 149
    .line 150
    move-object/from16 v9, p3

    .line 151
    .line 152
    check-cast v9, Ljava/lang/Integer;

    .line 153
    .line 154
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    and-int/lit8 v10, v9, 0x6

    .line 162
    .line 163
    if-nez v10, :cond_9

    .line 164
    .line 165
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    if-eqz v10, :cond_8

    .line 170
    .line 171
    move v4, v5

    .line 172
    :cond_8
    or-int/2addr v9, v4

    .line 173
    :cond_9
    and-int/lit8 v4, v9, 0x13

    .line 174
    .line 175
    if-eq v4, v3, :cond_a

    .line 176
    .line 177
    move v3, v7

    .line 178
    goto :goto_3

    .line 179
    :cond_a
    move v3, v6

    .line 180
    :goto_3
    and-int/lit8 v4, v9, 0x1

    .line 181
    .line 182
    invoke-virtual {v8, v4, v3}, La/fet;->U(IZ)Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eqz v3, :cond_b

    .line 187
    .line 188
    sget-object v3, La/qmk;->a:La/zcl;

    .line 189
    .line 190
    invoke-static {v0, v2, v1, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iget-object p0, p0, La/ip00;->c:La/a4x;

    .line 195
    .line 196
    invoke-static {v6, v8, p0, v0}, La/jpm0;->d(ILa/fet;La/a4x;La/mm40;)V

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_b
    invoke-virtual {v8}, La/fet;->X()V

    .line 201
    .line 202
    .line 203
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object p0

    .line 206
    :pswitch_2
    move-object v0, p1

    .line 207
    check-cast v0, La/mm40;

    .line 208
    .line 209
    move-object/from16 v1, p2

    .line 210
    .line 211
    check-cast v1, La/fet;

    .line 212
    .line 213
    move-object/from16 v2, p3

    .line 214
    .line 215
    check-cast v2, Ljava/lang/Integer;

    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    and-int/lit8 v8, v2, 0x6

    .line 225
    .line 226
    if-nez v8, :cond_d

    .line 227
    .line 228
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    if-eqz v8, :cond_c

    .line 233
    .line 234
    move v4, v5

    .line 235
    :cond_c
    or-int/2addr v2, v4

    .line 236
    :cond_d
    and-int/lit8 v4, v2, 0x13

    .line 237
    .line 238
    if-eq v4, v3, :cond_e

    .line 239
    .line 240
    move v6, v7

    .line 241
    :cond_e
    and-int/lit8 v3, v2, 0x1

    .line 242
    .line 243
    invoke-virtual {v1, v3, v6}, La/fet;->U(IZ)Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-eqz v3, :cond_f

    .line 248
    .line 249
    iget-object p0, p0, La/ip00;->a:Ljava/lang/String;

    .line 250
    .line 251
    and-int/lit8 v2, v2, 0xe

    .line 252
    .line 253
    invoke-static {v2, v1, v0, p0}, La/aad;->b(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_f
    invoke-virtual {v1}, La/fet;->X()V

    .line 258
    .line 259
    .line 260
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_3
    move-object v0, p1

    .line 264
    check-cast v0, La/mm40;

    .line 265
    .line 266
    move-object/from16 v8, p2

    .line 267
    .line 268
    check-cast v8, La/fet;

    .line 269
    .line 270
    move-object/from16 v9, p3

    .line 271
    .line 272
    check-cast v9, Ljava/lang/Integer;

    .line 273
    .line 274
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    and-int/lit8 v10, v9, 0x6

    .line 282
    .line 283
    if-nez v10, :cond_11

    .line 284
    .line 285
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v10

    .line 289
    if-eqz v10, :cond_10

    .line 290
    .line 291
    move v4, v5

    .line 292
    :cond_10
    or-int/2addr v9, v4

    .line 293
    :cond_11
    and-int/lit8 v4, v9, 0x13

    .line 294
    .line 295
    if-eq v4, v3, :cond_12

    .line 296
    .line 297
    move v3, v7

    .line 298
    goto :goto_6

    .line 299
    :cond_12
    move v3, v6

    .line 300
    :goto_6
    and-int/lit8 v4, v9, 0x1

    .line 301
    .line 302
    invoke-virtual {v8, v4, v3}, La/fet;->U(IZ)Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    if-eqz v3, :cond_13

    .line 307
    .line 308
    sget-object v3, La/qmk;->a:La/zcl;

    .line 309
    .line 310
    invoke-static {v0, v2, v1, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    iget-object p0, p0, La/ip00;->c:La/a4x;

    .line 315
    .line 316
    invoke-static {v6, v8, p0, v0}, La/jpm0;->d(ILa/fet;La/a4x;La/mm40;)V

    .line 317
    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_13
    invoke-virtual {v8}, La/fet;->X()V

    .line 321
    .line 322
    .line 323
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    return-object p0

    .line 326
    :pswitch_4
    move-object v0, p1

    .line 327
    check-cast v0, La/mm40;

    .line 328
    .line 329
    move-object/from16 v1, p2

    .line 330
    .line 331
    check-cast v1, La/fet;

    .line 332
    .line 333
    move-object/from16 v2, p3

    .line 334
    .line 335
    check-cast v2, Ljava/lang/Integer;

    .line 336
    .line 337
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    and-int/lit8 v8, v2, 0x6

    .line 345
    .line 346
    if-nez v8, :cond_15

    .line 347
    .line 348
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v8

    .line 352
    if-eqz v8, :cond_14

    .line 353
    .line 354
    move v4, v5

    .line 355
    :cond_14
    or-int/2addr v2, v4

    .line 356
    :cond_15
    and-int/lit8 v4, v2, 0x13

    .line 357
    .line 358
    if-eq v4, v3, :cond_16

    .line 359
    .line 360
    move v6, v7

    .line 361
    :cond_16
    and-int/lit8 v3, v2, 0x1

    .line 362
    .line 363
    invoke-virtual {v1, v3, v6}, La/fet;->U(IZ)Z

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    if-eqz v3, :cond_17

    .line 368
    .line 369
    iget-object p0, p0, La/ip00;->a:Ljava/lang/String;

    .line 370
    .line 371
    and-int/lit8 v2, v2, 0xe

    .line 372
    .line 373
    invoke-static {v2, v1, v0, p0}, La/aad;->b(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    goto :goto_8

    .line 377
    :cond_17
    invoke-virtual {v1}, La/fet;->X()V

    .line 378
    .line 379
    .line 380
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    return-object p0

    .line 383
    :pswitch_5
    move-object v0, p1

    .line 384
    check-cast v0, La/mm40;

    .line 385
    .line 386
    move-object/from16 v1, p2

    .line 387
    .line 388
    check-cast v1, La/fet;

    .line 389
    .line 390
    move-object/from16 v2, p3

    .line 391
    .line 392
    check-cast v2, Ljava/lang/Integer;

    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    and-int/lit8 v8, v2, 0x6

    .line 402
    .line 403
    if-nez v8, :cond_19

    .line 404
    .line 405
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v8

    .line 409
    if-eqz v8, :cond_18

    .line 410
    .line 411
    move v4, v5

    .line 412
    :cond_18
    or-int/2addr v2, v4

    .line 413
    :cond_19
    and-int/lit8 v4, v2, 0x13

    .line 414
    .line 415
    if-eq v4, v3, :cond_1a

    .line 416
    .line 417
    move v6, v7

    .line 418
    :cond_1a
    and-int/lit8 v3, v2, 0x1

    .line 419
    .line 420
    invoke-virtual {v1, v3, v6}, La/fet;->U(IZ)Z

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    if-eqz v3, :cond_1b

    .line 425
    .line 426
    iget-object p0, p0, La/ip00;->c:La/a4x;

    .line 427
    .line 428
    and-int/lit8 v2, v2, 0xe

    .line 429
    .line 430
    invoke-static {v2, v1, p0, v0}, La/jpm0;->d(ILa/fet;La/a4x;La/mm40;)V

    .line 431
    .line 432
    .line 433
    goto :goto_9

    .line 434
    :cond_1b
    invoke-virtual {v1}, La/fet;->X()V

    .line 435
    .line 436
    .line 437
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 438
    .line 439
    return-object p0

    .line 440
    :pswitch_6
    move-object v0, p1

    .line 441
    check-cast v0, La/mm40;

    .line 442
    .line 443
    move-object/from16 v1, p2

    .line 444
    .line 445
    check-cast v1, La/fet;

    .line 446
    .line 447
    move-object/from16 v2, p3

    .line 448
    .line 449
    check-cast v2, Ljava/lang/Integer;

    .line 450
    .line 451
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    and-int/lit8 v8, v2, 0x6

    .line 459
    .line 460
    if-nez v8, :cond_1d

    .line 461
    .line 462
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v8

    .line 466
    if-eqz v8, :cond_1c

    .line 467
    .line 468
    move v4, v5

    .line 469
    :cond_1c
    or-int/2addr v2, v4

    .line 470
    :cond_1d
    and-int/lit8 v4, v2, 0x13

    .line 471
    .line 472
    if-eq v4, v3, :cond_1e

    .line 473
    .line 474
    move v6, v7

    .line 475
    :cond_1e
    and-int/lit8 v3, v2, 0x1

    .line 476
    .line 477
    invoke-virtual {v1, v3, v6}, La/fet;->U(IZ)Z

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    if-eqz v3, :cond_1f

    .line 482
    .line 483
    iget-object p0, p0, La/ip00;->a:Ljava/lang/String;

    .line 484
    .line 485
    and-int/lit8 v2, v2, 0xe

    .line 486
    .line 487
    invoke-static {v2, v1, v0, p0}, La/aad;->b(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    goto :goto_a

    .line 491
    :cond_1f
    invoke-virtual {v1}, La/fet;->X()V

    .line 492
    .line 493
    .line 494
    :goto_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 495
    .line 496
    return-object p0

    .line 497
    :pswitch_7
    move-object v0, p1

    .line 498
    check-cast v0, La/mm40;

    .line 499
    .line 500
    move-object/from16 v8, p2

    .line 501
    .line 502
    check-cast v8, La/fet;

    .line 503
    .line 504
    move-object/from16 v9, p3

    .line 505
    .line 506
    check-cast v9, Ljava/lang/Integer;

    .line 507
    .line 508
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 509
    .line 510
    .line 511
    move-result v9

    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    and-int/lit8 v10, v9, 0x6

    .line 516
    .line 517
    if-nez v10, :cond_21

    .line 518
    .line 519
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v10

    .line 523
    if-eqz v10, :cond_20

    .line 524
    .line 525
    move v4, v5

    .line 526
    :cond_20
    or-int/2addr v9, v4

    .line 527
    :cond_21
    and-int/lit8 v4, v9, 0x13

    .line 528
    .line 529
    if-eq v4, v3, :cond_22

    .line 530
    .line 531
    move v3, v7

    .line 532
    goto :goto_b

    .line 533
    :cond_22
    move v3, v6

    .line 534
    :goto_b
    and-int/lit8 v4, v9, 0x1

    .line 535
    .line 536
    invoke-virtual {v8, v4, v3}, La/fet;->U(IZ)Z

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    if-eqz v3, :cond_23

    .line 541
    .line 542
    sget-object v3, La/qmk;->a:La/zcl;

    .line 543
    .line 544
    invoke-static {v0, v2, v1, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    iget-object p0, p0, La/ip00;->c:La/a4x;

    .line 549
    .line 550
    invoke-static {v6, v8, p0, v0}, La/jpm0;->d(ILa/fet;La/a4x;La/mm40;)V

    .line 551
    .line 552
    .line 553
    goto :goto_c

    .line 554
    :cond_23
    invoke-virtual {v8}, La/fet;->X()V

    .line 555
    .line 556
    .line 557
    :goto_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 558
    .line 559
    return-object p0

    .line 560
    :pswitch_8
    move-object v0, p1

    .line 561
    check-cast v0, La/mm40;

    .line 562
    .line 563
    move-object/from16 v1, p2

    .line 564
    .line 565
    check-cast v1, La/fet;

    .line 566
    .line 567
    move-object/from16 v2, p3

    .line 568
    .line 569
    check-cast v2, Ljava/lang/Integer;

    .line 570
    .line 571
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 572
    .line 573
    .line 574
    move-result v2

    .line 575
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    and-int/lit8 v8, v2, 0x6

    .line 579
    .line 580
    if-nez v8, :cond_25

    .line 581
    .line 582
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v8

    .line 586
    if-eqz v8, :cond_24

    .line 587
    .line 588
    move v4, v5

    .line 589
    :cond_24
    or-int/2addr v2, v4

    .line 590
    :cond_25
    and-int/lit8 v4, v2, 0x13

    .line 591
    .line 592
    if-eq v4, v3, :cond_26

    .line 593
    .line 594
    move v6, v7

    .line 595
    :cond_26
    and-int/lit8 v3, v2, 0x1

    .line 596
    .line 597
    invoke-virtual {v1, v3, v6}, La/fet;->U(IZ)Z

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    if-eqz v3, :cond_27

    .line 602
    .line 603
    iget-object p0, p0, La/ip00;->a:Ljava/lang/String;

    .line 604
    .line 605
    and-int/lit8 v2, v2, 0xe

    .line 606
    .line 607
    invoke-static {v2, v1, v0, p0}, La/aad;->b(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    goto :goto_d

    .line 611
    :cond_27
    invoke-virtual {v1}, La/fet;->X()V

    .line 612
    .line 613
    .line 614
    :goto_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 615
    .line 616
    return-object p0

    .line 617
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
