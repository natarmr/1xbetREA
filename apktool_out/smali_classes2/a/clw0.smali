.class public final La/clw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:La/clw0;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/clw0;

    .line 2
    .line 3
    invoke-direct {v0}, La/clw0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/clw0;->b:La/clw0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/clw0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    sget-object p0, La/lkw0;->a:[B

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)La/dlw0;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v0, v0, La/clw0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-nez v2, :cond_3c

    .line 12
    .line 13
    const-class v2, La/jkw0;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v3, :cond_3b

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, La/jkw0;->g(Ljava/lang/Class;)La/jkw0;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const/4 v3, 0x3

    .line 34
    invoke-virtual {v2, v3}, La/jkw0;->h(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, La/elw0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    iget v3, v2, La/elw0;->d:I

    .line 41
    .line 42
    const/4 v5, 0x2

    .line 43
    and-int/2addr v3, v5

    .line 44
    const/4 v6, 0x1

    .line 45
    const/4 v7, 0x0

    .line 46
    if-ne v3, v5, :cond_0

    .line 47
    .line 48
    move v3, v6

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v3, v7

    .line 51
    :goto_0
    if-eqz v3, :cond_1

    .line 52
    .line 53
    iget-object v2, v2, La/elw0;->a:La/ojw0;

    .line 54
    .line 55
    new-instance v3, La/zkw0;

    .line 56
    .line 57
    invoke-direct {v3, v2}, La/zkw0;-><init>(La/ojw0;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_28

    .line 61
    .line 62
    :cond_1
    sget-object v3, La/tkw0;->a:[I

    .line 63
    .line 64
    invoke-virtual {v2}, La/elw0;->a()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-static {v5}, La/hne;->E(I)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    aget v3, v3, v5

    .line 73
    .line 74
    if-eq v3, v6, :cond_2

    .line 75
    .line 76
    sget-object v3, La/ekw0;->a:La/uxs0;

    .line 77
    .line 78
    move-object/from16 v17, v3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    move-object/from16 v17, v4

    .line 82
    .line 83
    :goto_1
    sget-object v3, La/vkw0;->k:Lsun/misc/Unsafe;

    .line 84
    .line 85
    if-eqz v3, :cond_3a

    .line 86
    .line 87
    instance-of v5, v2, La/elw0;

    .line 88
    .line 89
    if-eqz v5, :cond_39

    .line 90
    .line 91
    iget-object v4, v2, La/elw0;->b:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    const v9, 0xd800

    .line 102
    .line 103
    .line 104
    if-lt v8, v9, :cond_3

    .line 105
    .line 106
    move v8, v6

    .line 107
    :goto_2
    add-int/lit8 v10, v8, 0x1

    .line 108
    .line 109
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-lt v8, v9, :cond_4

    .line 114
    .line 115
    move v8, v10

    .line 116
    goto :goto_2

    .line 117
    :cond_3
    move v10, v6

    .line 118
    :cond_4
    add-int/lit8 v8, v10, 0x1

    .line 119
    .line 120
    invoke-virtual {v4, v10}, Ljava/lang/String;->charAt(I)C

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    if-lt v10, v9, :cond_6

    .line 125
    .line 126
    and-int/lit16 v10, v10, 0x1fff

    .line 127
    .line 128
    const/16 v12, 0xd

    .line 129
    .line 130
    :goto_3
    add-int/lit8 v13, v8, 0x1

    .line 131
    .line 132
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-lt v8, v9, :cond_5

    .line 137
    .line 138
    and-int/lit16 v8, v8, 0x1fff

    .line 139
    .line 140
    shl-int/2addr v8, v12

    .line 141
    or-int/2addr v10, v8

    .line 142
    add-int/lit8 v12, v12, 0xd

    .line 143
    .line 144
    move v8, v13

    .line 145
    goto :goto_3

    .line 146
    :cond_5
    shl-int/2addr v8, v12

    .line 147
    or-int/2addr v10, v8

    .line 148
    move v8, v13

    .line 149
    :cond_6
    if-nez v10, :cond_7

    .line 150
    .line 151
    sget-object v10, La/vkw0;->j:[I

    .line 152
    .line 153
    move v11, v7

    .line 154
    move v12, v11

    .line 155
    move v13, v12

    .line 156
    move v15, v13

    .line 157
    move/from16 v19, v15

    .line 158
    .line 159
    move-object v14, v10

    .line 160
    move/from16 v10, v19

    .line 161
    .line 162
    :goto_4
    move/from16 v16, v6

    .line 163
    .line 164
    goto/16 :goto_e

    .line 165
    .line 166
    :cond_7
    add-int/lit8 v10, v8, 0x1

    .line 167
    .line 168
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    if-lt v8, v9, :cond_9

    .line 173
    .line 174
    and-int/lit16 v8, v8, 0x1fff

    .line 175
    .line 176
    const/16 v12, 0xd

    .line 177
    .line 178
    :goto_5
    add-int/lit8 v13, v10, 0x1

    .line 179
    .line 180
    invoke-virtual {v4, v10}, Ljava/lang/String;->charAt(I)C

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    if-lt v10, v9, :cond_8

    .line 185
    .line 186
    and-int/lit16 v10, v10, 0x1fff

    .line 187
    .line 188
    shl-int/2addr v10, v12

    .line 189
    or-int/2addr v8, v10

    .line 190
    add-int/lit8 v12, v12, 0xd

    .line 191
    .line 192
    move v10, v13

    .line 193
    goto :goto_5

    .line 194
    :cond_8
    shl-int/2addr v10, v12

    .line 195
    or-int/2addr v8, v10

    .line 196
    move v10, v13

    .line 197
    :cond_9
    add-int/lit8 v12, v10, 0x1

    .line 198
    .line 199
    invoke-virtual {v4, v10}, Ljava/lang/String;->charAt(I)C

    .line 200
    .line 201
    .line 202
    move-result v10

    .line 203
    if-lt v10, v9, :cond_b

    .line 204
    .line 205
    and-int/lit16 v10, v10, 0x1fff

    .line 206
    .line 207
    const/16 v13, 0xd

    .line 208
    .line 209
    :goto_6
    add-int/lit8 v14, v12, 0x1

    .line 210
    .line 211
    invoke-virtual {v4, v12}, Ljava/lang/String;->charAt(I)C

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    if-lt v12, v9, :cond_a

    .line 216
    .line 217
    and-int/lit16 v12, v12, 0x1fff

    .line 218
    .line 219
    shl-int/2addr v12, v13

    .line 220
    or-int/2addr v10, v12

    .line 221
    add-int/lit8 v13, v13, 0xd

    .line 222
    .line 223
    move v12, v14

    .line 224
    goto :goto_6

    .line 225
    :cond_a
    shl-int/2addr v12, v13

    .line 226
    or-int/2addr v10, v12

    .line 227
    move v12, v14

    .line 228
    :cond_b
    add-int/lit8 v13, v12, 0x1

    .line 229
    .line 230
    invoke-virtual {v4, v12}, Ljava/lang/String;->charAt(I)C

    .line 231
    .line 232
    .line 233
    move-result v12

    .line 234
    if-lt v12, v9, :cond_d

    .line 235
    .line 236
    and-int/lit16 v12, v12, 0x1fff

    .line 237
    .line 238
    const/16 v14, 0xd

    .line 239
    .line 240
    :goto_7
    add-int/lit8 v15, v13, 0x1

    .line 241
    .line 242
    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    .line 243
    .line 244
    .line 245
    move-result v13

    .line 246
    if-lt v13, v9, :cond_c

    .line 247
    .line 248
    and-int/lit16 v13, v13, 0x1fff

    .line 249
    .line 250
    shl-int/2addr v13, v14

    .line 251
    or-int/2addr v12, v13

    .line 252
    add-int/lit8 v14, v14, 0xd

    .line 253
    .line 254
    move v13, v15

    .line 255
    goto :goto_7

    .line 256
    :cond_c
    shl-int/2addr v13, v14

    .line 257
    or-int/2addr v12, v13

    .line 258
    move v13, v15

    .line 259
    :cond_d
    add-int/lit8 v14, v13, 0x1

    .line 260
    .line 261
    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    .line 262
    .line 263
    .line 264
    move-result v13

    .line 265
    if-lt v13, v9, :cond_f

    .line 266
    .line 267
    and-int/lit16 v13, v13, 0x1fff

    .line 268
    .line 269
    const/16 v15, 0xd

    .line 270
    .line 271
    :goto_8
    add-int/lit8 v16, v14, 0x1

    .line 272
    .line 273
    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    .line 274
    .line 275
    .line 276
    move-result v14

    .line 277
    if-lt v14, v9, :cond_e

    .line 278
    .line 279
    and-int/lit16 v14, v14, 0x1fff

    .line 280
    .line 281
    shl-int/2addr v14, v15

    .line 282
    or-int/2addr v13, v14

    .line 283
    add-int/lit8 v15, v15, 0xd

    .line 284
    .line 285
    move/from16 v14, v16

    .line 286
    .line 287
    goto :goto_8

    .line 288
    :cond_e
    shl-int/2addr v14, v15

    .line 289
    or-int/2addr v13, v14

    .line 290
    move/from16 v14, v16

    .line 291
    .line 292
    :cond_f
    add-int/lit8 v15, v14, 0x1

    .line 293
    .line 294
    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    .line 295
    .line 296
    .line 297
    move-result v14

    .line 298
    if-lt v14, v9, :cond_11

    .line 299
    .line 300
    and-int/lit16 v14, v14, 0x1fff

    .line 301
    .line 302
    const/16 v16, 0xd

    .line 303
    .line 304
    :goto_9
    add-int/lit8 v18, v15, 0x1

    .line 305
    .line 306
    invoke-virtual {v4, v15}, Ljava/lang/String;->charAt(I)C

    .line 307
    .line 308
    .line 309
    move-result v15

    .line 310
    if-lt v15, v9, :cond_10

    .line 311
    .line 312
    and-int/lit16 v15, v15, 0x1fff

    .line 313
    .line 314
    shl-int v15, v15, v16

    .line 315
    .line 316
    or-int/2addr v14, v15

    .line 317
    add-int/lit8 v16, v16, 0xd

    .line 318
    .line 319
    move/from16 v15, v18

    .line 320
    .line 321
    goto :goto_9

    .line 322
    :cond_10
    shl-int v15, v15, v16

    .line 323
    .line 324
    or-int/2addr v14, v15

    .line 325
    move/from16 v15, v18

    .line 326
    .line 327
    :cond_11
    add-int/lit8 v16, v15, 0x1

    .line 328
    .line 329
    invoke-virtual {v4, v15}, Ljava/lang/String;->charAt(I)C

    .line 330
    .line 331
    .line 332
    move-result v15

    .line 333
    if-lt v15, v9, :cond_13

    .line 334
    .line 335
    and-int/lit16 v15, v15, 0x1fff

    .line 336
    .line 337
    move/from16 v7, v16

    .line 338
    .line 339
    const/16 v16, 0xd

    .line 340
    .line 341
    :goto_a
    add-int/lit8 v18, v7, 0x1

    .line 342
    .line 343
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    if-lt v7, v9, :cond_12

    .line 348
    .line 349
    and-int/lit16 v7, v7, 0x1fff

    .line 350
    .line 351
    shl-int v7, v7, v16

    .line 352
    .line 353
    or-int/2addr v15, v7

    .line 354
    add-int/lit8 v16, v16, 0xd

    .line 355
    .line 356
    move/from16 v7, v18

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_12
    shl-int v7, v7, v16

    .line 360
    .line 361
    or-int/2addr v15, v7

    .line 362
    move/from16 v7, v18

    .line 363
    .line 364
    goto :goto_b

    .line 365
    :cond_13
    move/from16 v7, v16

    .line 366
    .line 367
    :goto_b
    add-int/lit8 v16, v7, 0x1

    .line 368
    .line 369
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 370
    .line 371
    .line 372
    move-result v7

    .line 373
    if-lt v7, v9, :cond_14

    .line 374
    .line 375
    :goto_c
    move/from16 v7, v16

    .line 376
    .line 377
    add-int/lit8 v16, v7, 0x1

    .line 378
    .line 379
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    if-lt v7, v9, :cond_14

    .line 384
    .line 385
    goto :goto_c

    .line 386
    :cond_14
    move/from16 v7, v16

    .line 387
    .line 388
    add-int/lit8 v16, v7, 0x1

    .line 389
    .line 390
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 391
    .line 392
    .line 393
    move-result v7

    .line 394
    if-lt v7, v9, :cond_16

    .line 395
    .line 396
    and-int/lit16 v7, v7, 0x1fff

    .line 397
    .line 398
    move/from16 v11, v16

    .line 399
    .line 400
    const/16 v16, 0xd

    .line 401
    .line 402
    :goto_d
    add-int/lit8 v19, v11, 0x1

    .line 403
    .line 404
    invoke-virtual {v4, v11}, Ljava/lang/String;->charAt(I)C

    .line 405
    .line 406
    .line 407
    move-result v11

    .line 408
    if-lt v11, v9, :cond_15

    .line 409
    .line 410
    and-int/lit16 v11, v11, 0x1fff

    .line 411
    .line 412
    shl-int v11, v11, v16

    .line 413
    .line 414
    or-int/2addr v7, v11

    .line 415
    add-int/lit8 v16, v16, 0xd

    .line 416
    .line 417
    move/from16 v11, v19

    .line 418
    .line 419
    goto :goto_d

    .line 420
    :cond_15
    shl-int v11, v11, v16

    .line 421
    .line 422
    or-int/2addr v7, v11

    .line 423
    move/from16 v16, v19

    .line 424
    .line 425
    :cond_16
    add-int v11, v7, v15

    .line 426
    .line 427
    add-int/2addr v11, v8

    .line 428
    new-array v11, v11, [I

    .line 429
    .line 430
    shl-int/lit8 v19, v8, 0x1

    .line 431
    .line 432
    add-int v19, v19, v10

    .line 433
    .line 434
    move v10, v14

    .line 435
    move-object v14, v11

    .line 436
    move v11, v12

    .line 437
    move v12, v13

    .line 438
    move v13, v15

    .line 439
    move v15, v7

    .line 440
    move v7, v8

    .line 441
    move/from16 v8, v16

    .line 442
    .line 443
    goto/16 :goto_4

    .line 444
    .line 445
    :goto_e
    iget-object v6, v2, La/elw0;->c:[Ljava/lang/Object;

    .line 446
    .line 447
    iget-object v9, v2, La/elw0;->a:La/ojw0;

    .line 448
    .line 449
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    move-result-object v9

    .line 453
    move-object/from16 v21, v6

    .line 454
    .line 455
    mul-int/lit8 v6, v10, 0x3

    .line 456
    .line 457
    new-array v6, v6, [I

    .line 458
    .line 459
    shl-int/lit8 v10, v10, 0x1

    .line 460
    .line 461
    new-array v10, v10, [Ljava/lang/Object;

    .line 462
    .line 463
    add-int/2addr v13, v15

    .line 464
    move/from16 v24, v13

    .line 465
    .line 466
    move/from16 v25, v15

    .line 467
    .line 468
    const/16 v22, 0x0

    .line 469
    .line 470
    const/16 v23, 0x0

    .line 471
    .line 472
    :goto_f
    if-ge v8, v5, :cond_37

    .line 473
    .line 474
    add-int/lit8 v26, v8, 0x1

    .line 475
    .line 476
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 477
    .line 478
    .line 479
    move-result v8

    .line 480
    move/from16 v27, v5

    .line 481
    .line 482
    const v5, 0xd800

    .line 483
    .line 484
    .line 485
    if-lt v8, v5, :cond_18

    .line 486
    .line 487
    and-int/lit16 v8, v8, 0x1fff

    .line 488
    .line 489
    move/from16 v5, v26

    .line 490
    .line 491
    const/16 v26, 0xd

    .line 492
    .line 493
    :goto_10
    add-int/lit8 v28, v5, 0x1

    .line 494
    .line 495
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    .line 496
    .line 497
    .line 498
    move-result v5

    .line 499
    move-object/from16 v29, v6

    .line 500
    .line 501
    const v6, 0xd800

    .line 502
    .line 503
    .line 504
    if-lt v5, v6, :cond_17

    .line 505
    .line 506
    and-int/lit16 v5, v5, 0x1fff

    .line 507
    .line 508
    shl-int v5, v5, v26

    .line 509
    .line 510
    or-int/2addr v8, v5

    .line 511
    add-int/lit8 v26, v26, 0xd

    .line 512
    .line 513
    move/from16 v5, v28

    .line 514
    .line 515
    move-object/from16 v6, v29

    .line 516
    .line 517
    goto :goto_10

    .line 518
    :cond_17
    shl-int v5, v5, v26

    .line 519
    .line 520
    or-int/2addr v8, v5

    .line 521
    move/from16 v5, v28

    .line 522
    .line 523
    goto :goto_11

    .line 524
    :cond_18
    move-object/from16 v29, v6

    .line 525
    .line 526
    move/from16 v5, v26

    .line 527
    .line 528
    :goto_11
    add-int/lit8 v6, v5, 0x1

    .line 529
    .line 530
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    .line 531
    .line 532
    .line 533
    move-result v5

    .line 534
    move/from16 v26, v6

    .line 535
    .line 536
    const v6, 0xd800

    .line 537
    .line 538
    .line 539
    if-lt v5, v6, :cond_1a

    .line 540
    .line 541
    and-int/lit16 v5, v5, 0x1fff

    .line 542
    .line 543
    move/from16 v6, v26

    .line 544
    .line 545
    const/16 v26, 0xd

    .line 546
    .line 547
    :goto_12
    add-int/lit8 v28, v6, 0x1

    .line 548
    .line 549
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    .line 550
    .line 551
    .line 552
    move-result v6

    .line 553
    move/from16 v30, v5

    .line 554
    .line 555
    const v5, 0xd800

    .line 556
    .line 557
    .line 558
    if-lt v6, v5, :cond_19

    .line 559
    .line 560
    and-int/lit16 v5, v6, 0x1fff

    .line 561
    .line 562
    shl-int v5, v5, v26

    .line 563
    .line 564
    or-int v5, v30, v5

    .line 565
    .line 566
    add-int/lit8 v26, v26, 0xd

    .line 567
    .line 568
    move/from16 v6, v28

    .line 569
    .line 570
    goto :goto_12

    .line 571
    :cond_19
    shl-int v5, v6, v26

    .line 572
    .line 573
    or-int v5, v30, v5

    .line 574
    .line 575
    move/from16 v6, v28

    .line 576
    .line 577
    goto :goto_13

    .line 578
    :cond_1a
    move/from16 v6, v26

    .line 579
    .line 580
    :goto_13
    move/from16 v26, v7

    .line 581
    .line 582
    and-int/lit16 v7, v5, 0xff

    .line 583
    .line 584
    move/from16 v28, v8

    .line 585
    .line 586
    and-int/lit16 v8, v5, 0x400

    .line 587
    .line 588
    if-eqz v8, :cond_1b

    .line 589
    .line 590
    add-int/lit8 v8, v23, 0x1

    .line 591
    .line 592
    aput v22, v14, v23

    .line 593
    .line 594
    move/from16 v23, v8

    .line 595
    .line 596
    :cond_1b
    const/16 v8, 0x33

    .line 597
    .line 598
    move-object/from16 v32, v10

    .line 599
    .line 600
    if-lt v7, v8, :cond_25

    .line 601
    .line 602
    add-int/lit8 v8, v6, 0x1

    .line 603
    .line 604
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    .line 605
    .line 606
    .line 607
    move-result v6

    .line 608
    const v10, 0xd800

    .line 609
    .line 610
    .line 611
    if-lt v6, v10, :cond_1d

    .line 612
    .line 613
    and-int/lit16 v6, v6, 0x1fff

    .line 614
    .line 615
    const/16 v34, 0xd

    .line 616
    .line 617
    :goto_14
    add-int/lit8 v35, v8, 0x1

    .line 618
    .line 619
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 620
    .line 621
    .line 622
    move-result v8

    .line 623
    if-lt v8, v10, :cond_1c

    .line 624
    .line 625
    and-int/lit16 v8, v8, 0x1fff

    .line 626
    .line 627
    shl-int v8, v8, v34

    .line 628
    .line 629
    or-int/2addr v6, v8

    .line 630
    add-int/lit8 v34, v34, 0xd

    .line 631
    .line 632
    move/from16 v8, v35

    .line 633
    .line 634
    const v10, 0xd800

    .line 635
    .line 636
    .line 637
    goto :goto_14

    .line 638
    :cond_1c
    shl-int v8, v8, v34

    .line 639
    .line 640
    or-int/2addr v6, v8

    .line 641
    move/from16 v8, v35

    .line 642
    .line 643
    :cond_1d
    add-int/lit8 v10, v7, -0x33

    .line 644
    .line 645
    move/from16 v34, v6

    .line 646
    .line 647
    const/16 v6, 0x9

    .line 648
    .line 649
    if-eq v10, v6, :cond_1e

    .line 650
    .line 651
    const/16 v6, 0x11

    .line 652
    .line 653
    if-ne v10, v6, :cond_1f

    .line 654
    .line 655
    :cond_1e
    move/from16 v10, v16

    .line 656
    .line 657
    goto :goto_16

    .line 658
    :cond_1f
    const/16 v6, 0xc

    .line 659
    .line 660
    if-ne v10, v6, :cond_21

    .line 661
    .line 662
    invoke-virtual {v2}, La/elw0;->a()I

    .line 663
    .line 664
    .line 665
    move-result v6

    .line 666
    move/from16 v10, v16

    .line 667
    .line 668
    invoke-static {v6, v10}, La/hne;->b(II)Z

    .line 669
    .line 670
    .line 671
    move-result v6

    .line 672
    if-nez v6, :cond_20

    .line 673
    .line 674
    and-int/lit16 v6, v5, 0x800

    .line 675
    .line 676
    if-eqz v6, :cond_22

    .line 677
    .line 678
    :cond_20
    div-int/lit8 v6, v22, 0x3

    .line 679
    .line 680
    shl-int/2addr v6, v10

    .line 681
    add-int/2addr v6, v10

    .line 682
    add-int/lit8 v16, v19, 0x1

    .line 683
    .line 684
    aget-object v19, v21, v19

    .line 685
    .line 686
    aput-object v19, v32, v6

    .line 687
    .line 688
    :goto_15
    move/from16 v19, v16

    .line 689
    .line 690
    goto :goto_17

    .line 691
    :cond_21
    move/from16 v10, v16

    .line 692
    .line 693
    goto :goto_17

    .line 694
    :goto_16
    div-int/lit8 v6, v22, 0x3

    .line 695
    .line 696
    shl-int/2addr v6, v10

    .line 697
    add-int/2addr v6, v10

    .line 698
    add-int/lit8 v16, v19, 0x1

    .line 699
    .line 700
    aget-object v19, v21, v19

    .line 701
    .line 702
    aput-object v19, v32, v6

    .line 703
    .line 704
    goto :goto_15

    .line 705
    :cond_22
    :goto_17
    shl-int/lit8 v6, v34, 0x1

    .line 706
    .line 707
    aget-object v10, v21, v6

    .line 708
    .line 709
    move/from16 v30, v6

    .line 710
    .line 711
    instance-of v6, v10, Ljava/lang/reflect/Field;

    .line 712
    .line 713
    if-eqz v6, :cond_23

    .line 714
    .line 715
    check-cast v10, Ljava/lang/reflect/Field;

    .line 716
    .line 717
    :goto_18
    move/from16 v34, v11

    .line 718
    .line 719
    goto :goto_19

    .line 720
    :cond_23
    check-cast v10, Ljava/lang/String;

    .line 721
    .line 722
    invoke-static {v9, v10}, La/vkw0;->o(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 723
    .line 724
    .line 725
    move-result-object v10

    .line 726
    aput-object v10, v21, v30

    .line 727
    .line 728
    add-int/lit8 v6, v24, 0x1

    .line 729
    .line 730
    aput v22, v14, v24

    .line 731
    .line 732
    move/from16 v24, v6

    .line 733
    .line 734
    goto :goto_18

    .line 735
    :goto_19
    invoke-virtual {v3, v10}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 736
    .line 737
    .line 738
    move-result-wide v10

    .line 739
    long-to-int v6, v10

    .line 740
    add-int/lit8 v10, v30, 0x1

    .line 741
    .line 742
    aget-object v11, v21, v10

    .line 743
    .line 744
    move/from16 v30, v6

    .line 745
    .line 746
    instance-of v6, v11, Ljava/lang/reflect/Field;

    .line 747
    .line 748
    if-eqz v6, :cond_24

    .line 749
    .line 750
    check-cast v11, Ljava/lang/reflect/Field;

    .line 751
    .line 752
    goto :goto_1a

    .line 753
    :cond_24
    check-cast v11, Ljava/lang/String;

    .line 754
    .line 755
    invoke-static {v9, v11}, La/vkw0;->o(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 756
    .line 757
    .line 758
    move-result-object v11

    .line 759
    aput-object v11, v21, v10

    .line 760
    .line 761
    :goto_1a
    invoke-virtual {v3, v11}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 762
    .line 763
    .line 764
    move-result-wide v10

    .line 765
    long-to-int v6, v10

    .line 766
    move-object/from16 v31, v4

    .line 767
    .line 768
    move/from16 v10, v19

    .line 769
    .line 770
    const/4 v4, 0x0

    .line 771
    const/16 v16, 0x1

    .line 772
    .line 773
    move/from16 v19, v7

    .line 774
    .line 775
    move v7, v6

    .line 776
    move/from16 v6, v30

    .line 777
    .line 778
    goto/16 :goto_24

    .line 779
    .line 780
    :cond_25
    move/from16 v34, v11

    .line 781
    .line 782
    add-int/lit8 v8, v19, 0x1

    .line 783
    .line 784
    aget-object v10, v21, v19

    .line 785
    .line 786
    check-cast v10, Ljava/lang/String;

    .line 787
    .line 788
    invoke-static {v9, v10}, La/vkw0;->o(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 789
    .line 790
    .line 791
    move-result-object v10

    .line 792
    const/16 v11, 0x9

    .line 793
    .line 794
    if-eq v7, v11, :cond_26

    .line 795
    .line 796
    const/16 v11, 0x11

    .line 797
    .line 798
    if-ne v7, v11, :cond_27

    .line 799
    .line 800
    :cond_26
    move/from16 v30, v8

    .line 801
    .line 802
    const/4 v8, 0x1

    .line 803
    goto/16 :goto_1f

    .line 804
    .line 805
    :cond_27
    const/16 v11, 0x1b

    .line 806
    .line 807
    if-eq v7, v11, :cond_28

    .line 808
    .line 809
    const/16 v11, 0x31

    .line 810
    .line 811
    if-ne v7, v11, :cond_29

    .line 812
    .line 813
    :cond_28
    move/from16 v30, v8

    .line 814
    .line 815
    const/4 v8, 0x1

    .line 816
    goto :goto_1e

    .line 817
    :cond_29
    const/16 v11, 0xc

    .line 818
    .line 819
    if-eq v7, v11, :cond_2e

    .line 820
    .line 821
    const/16 v11, 0x1e

    .line 822
    .line 823
    if-eq v7, v11, :cond_2e

    .line 824
    .line 825
    const/16 v11, 0x2c

    .line 826
    .line 827
    if-ne v7, v11, :cond_2a

    .line 828
    .line 829
    goto :goto_1c

    .line 830
    :cond_2a
    const/16 v11, 0x32

    .line 831
    .line 832
    if-ne v7, v11, :cond_2d

    .line 833
    .line 834
    add-int/lit8 v11, v25, 0x1

    .line 835
    .line 836
    aput v22, v14, v25

    .line 837
    .line 838
    div-int/lit8 v25, v22, 0x3

    .line 839
    .line 840
    const/16 v16, 0x1

    .line 841
    .line 842
    shl-int/lit8 v25, v25, 0x1

    .line 843
    .line 844
    add-int/lit8 v30, v19, 0x2

    .line 845
    .line 846
    aget-object v8, v21, v8

    .line 847
    .line 848
    aput-object v8, v32, v25

    .line 849
    .line 850
    and-int/lit16 v8, v5, 0x800

    .line 851
    .line 852
    if-eqz v8, :cond_2b

    .line 853
    .line 854
    add-int/lit8 v25, v25, 0x1

    .line 855
    .line 856
    add-int/lit8 v8, v19, 0x3

    .line 857
    .line 858
    aget-object v19, v21, v30

    .line 859
    .line 860
    aput-object v19, v32, v25

    .line 861
    .line 862
    move/from16 v25, v11

    .line 863
    .line 864
    goto :goto_20

    .line 865
    :cond_2b
    move/from16 v25, v11

    .line 866
    .line 867
    :cond_2c
    :goto_1b
    move/from16 v8, v30

    .line 868
    .line 869
    goto :goto_20

    .line 870
    :cond_2d
    move/from16 v30, v8

    .line 871
    .line 872
    goto :goto_1b

    .line 873
    :cond_2e
    :goto_1c
    invoke-virtual {v2}, La/elw0;->a()I

    .line 874
    .line 875
    .line 876
    move-result v11

    .line 877
    move/from16 v30, v8

    .line 878
    .line 879
    const/4 v8, 0x1

    .line 880
    if-eq v11, v8, :cond_2f

    .line 881
    .line 882
    and-int/lit16 v11, v5, 0x800

    .line 883
    .line 884
    if-eqz v11, :cond_2c

    .line 885
    .line 886
    :cond_2f
    div-int/lit8 v11, v22, 0x3

    .line 887
    .line 888
    shl-int/2addr v11, v8

    .line 889
    add-int/2addr v11, v8

    .line 890
    add-int/lit8 v19, v19, 0x2

    .line 891
    .line 892
    aget-object v16, v21, v30

    .line 893
    .line 894
    aput-object v16, v32, v11

    .line 895
    .line 896
    :goto_1d
    move/from16 v8, v19

    .line 897
    .line 898
    goto :goto_20

    .line 899
    :goto_1e
    div-int/lit8 v11, v22, 0x3

    .line 900
    .line 901
    shl-int/2addr v11, v8

    .line 902
    add-int/2addr v11, v8

    .line 903
    add-int/lit8 v19, v19, 0x2

    .line 904
    .line 905
    aget-object v16, v21, v30

    .line 906
    .line 907
    aput-object v16, v32, v11

    .line 908
    .line 909
    goto :goto_1d

    .line 910
    :goto_1f
    div-int/lit8 v11, v22, 0x3

    .line 911
    .line 912
    shl-int/2addr v11, v8

    .line 913
    add-int/2addr v11, v8

    .line 914
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 915
    .line 916
    .line 917
    move-result-object v8

    .line 918
    aput-object v8, v32, v11

    .line 919
    .line 920
    goto :goto_1b

    .line 921
    :goto_20
    invoke-virtual {v3, v10}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 922
    .line 923
    .line 924
    move-result-wide v10

    .line 925
    long-to-int v10, v10

    .line 926
    and-int/lit16 v11, v5, 0x1000

    .line 927
    .line 928
    if-eqz v11, :cond_33

    .line 929
    .line 930
    const/16 v11, 0x11

    .line 931
    .line 932
    if-gt v7, v11, :cond_33

    .line 933
    .line 934
    add-int/lit8 v11, v6, 0x1

    .line 935
    .line 936
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    .line 937
    .line 938
    .line 939
    move-result v6

    .line 940
    move/from16 v19, v7

    .line 941
    .line 942
    const v7, 0xd800

    .line 943
    .line 944
    .line 945
    if-lt v6, v7, :cond_31

    .line 946
    .line 947
    and-int/lit16 v6, v6, 0x1fff

    .line 948
    .line 949
    const/16 v20, 0xd

    .line 950
    .line 951
    :goto_21
    add-int/lit8 v30, v11, 0x1

    .line 952
    .line 953
    invoke-virtual {v4, v11}, Ljava/lang/String;->charAt(I)C

    .line 954
    .line 955
    .line 956
    move-result v11

    .line 957
    if-lt v11, v7, :cond_30

    .line 958
    .line 959
    and-int/lit16 v11, v11, 0x1fff

    .line 960
    .line 961
    shl-int v11, v11, v20

    .line 962
    .line 963
    or-int/2addr v6, v11

    .line 964
    add-int/lit8 v20, v20, 0xd

    .line 965
    .line 966
    move/from16 v11, v30

    .line 967
    .line 968
    goto :goto_21

    .line 969
    :cond_30
    shl-int v11, v11, v20

    .line 970
    .line 971
    or-int/2addr v6, v11

    .line 972
    move/from16 v11, v30

    .line 973
    .line 974
    :cond_31
    const/16 v16, 0x1

    .line 975
    .line 976
    shl-int/lit8 v20, v26, 0x1

    .line 977
    .line 978
    div-int/lit8 v30, v6, 0x20

    .line 979
    .line 980
    add-int v30, v30, v20

    .line 981
    .line 982
    aget-object v7, v21, v30

    .line 983
    .line 984
    move-object/from16 v31, v4

    .line 985
    .line 986
    instance-of v4, v7, Ljava/lang/reflect/Field;

    .line 987
    .line 988
    if-eqz v4, :cond_32

    .line 989
    .line 990
    check-cast v7, Ljava/lang/reflect/Field;

    .line 991
    .line 992
    :goto_22
    move v4, v6

    .line 993
    goto :goto_23

    .line 994
    :cond_32
    check-cast v7, Ljava/lang/String;

    .line 995
    .line 996
    invoke-static {v9, v7}, La/vkw0;->o(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 997
    .line 998
    .line 999
    move-result-object v7

    .line 1000
    aput-object v7, v21, v30

    .line 1001
    .line 1002
    goto :goto_22

    .line 1003
    :goto_23
    invoke-virtual {v3, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 1004
    .line 1005
    .line 1006
    move-result-wide v6

    .line 1007
    long-to-int v6, v6

    .line 1008
    rem-int/lit8 v4, v4, 0x20

    .line 1009
    .line 1010
    move v7, v6

    .line 1011
    move v6, v10

    .line 1012
    move v10, v8

    .line 1013
    move v8, v11

    .line 1014
    goto :goto_24

    .line 1015
    :cond_33
    move-object/from16 v31, v4

    .line 1016
    .line 1017
    move/from16 v19, v7

    .line 1018
    .line 1019
    const/16 v16, 0x1

    .line 1020
    .line 1021
    const v4, 0xfffff

    .line 1022
    .line 1023
    .line 1024
    move v7, v8

    .line 1025
    move v8, v6

    .line 1026
    move v6, v10

    .line 1027
    move v10, v7

    .line 1028
    move v7, v4

    .line 1029
    const/4 v4, 0x0

    .line 1030
    :goto_24
    add-int/lit8 v11, v22, 0x1

    .line 1031
    .line 1032
    aput v28, v29, v22

    .line 1033
    .line 1034
    add-int/lit8 v28, v22, 0x2

    .line 1035
    .line 1036
    move-object/from16 v30, v3

    .line 1037
    .line 1038
    and-int/lit16 v3, v5, 0x200

    .line 1039
    .line 1040
    if-eqz v3, :cond_34

    .line 1041
    .line 1042
    const/high16 v3, 0x20000000

    .line 1043
    .line 1044
    goto :goto_25

    .line 1045
    :cond_34
    const/4 v3, 0x0

    .line 1046
    :goto_25
    move/from16 v33, v3

    .line 1047
    .line 1048
    and-int/lit16 v3, v5, 0x100

    .line 1049
    .line 1050
    if-eqz v3, :cond_35

    .line 1051
    .line 1052
    const/high16 v3, 0x10000000

    .line 1053
    .line 1054
    goto :goto_26

    .line 1055
    :cond_35
    const/4 v3, 0x0

    .line 1056
    :goto_26
    or-int v3, v33, v3

    .line 1057
    .line 1058
    and-int/lit16 v5, v5, 0x800

    .line 1059
    .line 1060
    if-eqz v5, :cond_36

    .line 1061
    .line 1062
    const/high16 v5, -0x80000000

    .line 1063
    .line 1064
    goto :goto_27

    .line 1065
    :cond_36
    const/4 v5, 0x0

    .line 1066
    :goto_27
    or-int/2addr v3, v5

    .line 1067
    shl-int/lit8 v5, v19, 0x14

    .line 1068
    .line 1069
    or-int/2addr v3, v5

    .line 1070
    or-int/2addr v3, v6

    .line 1071
    aput v3, v29, v11

    .line 1072
    .line 1073
    add-int/lit8 v22, v22, 0x3

    .line 1074
    .line 1075
    shl-int/lit8 v3, v4, 0x14

    .line 1076
    .line 1077
    or-int/2addr v3, v7

    .line 1078
    aput v3, v29, v28

    .line 1079
    .line 1080
    move/from16 v19, v10

    .line 1081
    .line 1082
    move/from16 v7, v26

    .line 1083
    .line 1084
    move/from16 v5, v27

    .line 1085
    .line 1086
    move-object/from16 v6, v29

    .line 1087
    .line 1088
    move-object/from16 v3, v30

    .line 1089
    .line 1090
    move-object/from16 v4, v31

    .line 1091
    .line 1092
    move-object/from16 v10, v32

    .line 1093
    .line 1094
    move/from16 v11, v34

    .line 1095
    .line 1096
    goto/16 :goto_f

    .line 1097
    .line 1098
    :cond_37
    move-object/from16 v29, v6

    .line 1099
    .line 1100
    move-object/from16 v32, v10

    .line 1101
    .line 1102
    move/from16 v34, v11

    .line 1103
    .line 1104
    new-instance v8, La/vkw0;

    .line 1105
    .line 1106
    iget-object v2, v2, La/elw0;->a:La/ojw0;

    .line 1107
    .line 1108
    move/from16 v16, v13

    .line 1109
    .line 1110
    move-object/from16 v9, v29

    .line 1111
    .line 1112
    move-object v13, v2

    .line 1113
    invoke-direct/range {v8 .. v17}, La/vkw0;-><init>([I[Ljava/lang/Object;IILa/ojw0;[IIILa/uxs0;)V

    .line 1114
    .line 1115
    .line 1116
    move-object v3, v8

    .line 1117
    :goto_28
    sget-object v2, La/lkw0;->a:[B

    .line 1118
    .line 1119
    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    check-cast v0, La/dlw0;

    .line 1124
    .line 1125
    if-eqz v0, :cond_38

    .line 1126
    .line 1127
    return-object v0

    .line 1128
    :cond_38
    return-object v3

    .line 1129
    :cond_39
    invoke-static {}, La/hny;->b()V

    .line 1130
    .line 1131
    .line 1132
    return-object v4

    .line 1133
    :cond_3a
    const-string v0, "Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode."

    .line 1134
    .line 1135
    invoke-static {v0}, La/itt0;->k(Ljava/lang/String;)V

    .line 1136
    .line 1137
    .line 1138
    return-object v4

    .line 1139
    :catch_0
    move-exception v0

    .line 1140
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v1

    .line 1144
    const-string v2, "Unable to get message info for "

    .line 1145
    .line 1146
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v1

    .line 1150
    invoke-static {v1, v0}, La/e9d0;->m(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1151
    .line 1152
    .line 1153
    return-object v4

    .line 1154
    :cond_3b
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v0

    .line 1158
    const-string v1, "Unsupported message type: "

    .line 1159
    .line 1160
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v0

    .line 1164
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 1165
    .line 1166
    .line 1167
    return-object v4

    .line 1168
    :cond_3c
    check-cast v2, La/dlw0;

    .line 1169
    .line 1170
    return-object v2
.end method
