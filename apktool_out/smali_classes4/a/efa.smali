.class public abstract La/efa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/gfa;

    .line 2
    .line 3
    const-wide/16 v1, 0x1

    .line 4
    .line 5
    const v3, 0x7f130934

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, La/hfa;-><init>(JI)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/ffa;

    .line 12
    .line 13
    const-wide/16 v2, 0x2

    .line 14
    .line 15
    const v4, 0x7f130339

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3, v4}, La/hfa;-><init>(JI)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    new-array v2, v2, [La/hfa;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    aput-object v0, v2, v3

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v1, v2, v0

    .line 29
    .line 30
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, La/efa;->a:Ljava/util/List;

    .line 35
    .line 36
    return-void
.end method

.method public static final a(La/lc00;La/wea;La/m9s;La/ctf0;JLjava/lang/String;)V
    .locals 36

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v3, Ljava/util/ArrayList;

    .line 17
    .line 18
    sget-object v4, La/efa;->a:Ljava/util/List;

    .line 19
    .line 20
    const/16 v5, 0xa

    .line 21
    .line 22
    invoke-static {v4, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    const/4 v8, 0x0

    .line 38
    if-eqz v7, :cond_1

    .line 39
    .line 40
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    check-cast v7, La/hfa;

    .line 45
    .line 46
    new-instance v9, La/lxl;

    .line 47
    .line 48
    iget-byte v10, v7, La/hfa;->a:B

    .line 49
    .line 50
    int-to-long v10, v10

    .line 51
    new-instance v12, La/xxl;

    .line 52
    .line 53
    iget v13, v7, La/hfa;->b:I

    .line 54
    .line 55
    new-array v14, v8, [Ljava/lang/Object;

    .line 56
    .line 57
    iget-object v15, v2, La/ctf0;->b:La/lsm0;

    .line 58
    .line 59
    invoke-static {v14, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-virtual {v15, v13, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-direct {v12, v8}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-byte v7, v7, La/hfa;->a:B

    .line 71
    .line 72
    int-to-long v7, v7

    .line 73
    cmp-long v7, v7, p4

    .line 74
    .line 75
    if-nez v7, :cond_0

    .line 76
    .line 77
    sget-object v7, La/uxl;->b:La/uxl;

    .line 78
    .line 79
    :goto_1
    move-object v14, v7

    .line 80
    goto :goto_2

    .line 81
    :cond_0
    sget-object v7, La/uxl;->a:La/uxl;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :goto_2
    const/4 v15, 0x0

    .line 85
    const/16 v16, 0x6c

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    invoke-direct/range {v9 .. v16}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    new-instance v3, La/boo0;

    .line 100
    .line 101
    new-instance v10, La/fyl;

    .line 102
    .line 103
    iget-object v6, v2, La/ctf0;->b:La/lsm0;

    .line 104
    .line 105
    invoke-virtual {v2}, La/ctf0;->j()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-static {v2}, La/xfn;->b(Z)La/wfn;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    iget v2, v2, La/wfn;->e:F

    .line 114
    .line 115
    const/4 v7, 0x0

    .line 116
    const/4 v9, 0x2

    .line 117
    invoke-static {v2, v7, v9}, La/s5x0;->t(FFI)La/lh80;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    new-instance v15, La/jyl;

    .line 122
    .line 123
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 124
    .line 125
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getDarkBlue-0d7_KjU()J

    .line 126
    .line 127
    .line 128
    move-result-wide v12

    .line 129
    new-instance v2, La/y3d;

    .line 130
    .line 131
    invoke-direct {v2, v12, v13}, La/y3d;-><init>(J)V

    .line 132
    .line 133
    .line 134
    const/16 v7, 0x7e

    .line 135
    .line 136
    const/4 v12, 0x0

    .line 137
    invoke-direct {v15, v2, v12, v12, v7}, La/jyl;-><init>(La/y3d;La/y3d;La/y3d;I)V

    .line 138
    .line 139
    .line 140
    const/16 v16, 0x6

    .line 141
    .line 142
    move-object v2, v12

    .line 143
    const/4 v13, 0x0

    .line 144
    invoke-direct/range {v10 .. v16}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 145
    .line 146
    .line 147
    sget-object v7, La/pno0;->a:La/pno0;

    .line 148
    .line 149
    const-string v11, "CARD_CRICKET_TABS_KEY"

    .line 150
    .line 151
    invoke-direct {v3, v11, v10, v7}, La/boo0;-><init>(Ljava/lang/String;La/fyl;La/pno0;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    if-eqz v7, :cond_3

    .line 163
    .line 164
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    move-object v7, v12

    .line 169
    check-cast v7, La/hfa;

    .line 170
    .line 171
    iget-byte v7, v7, La/hfa;->a:B

    .line 172
    .line 173
    int-to-long v10, v7

    .line 174
    cmp-long v7, v10, p4

    .line 175
    .line 176
    if-nez v7, :cond_2

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_3
    move-object v12, v2

    .line 180
    :goto_3
    check-cast v12, La/hfa;

    .line 181
    .line 182
    if-nez v12, :cond_4

    .line 183
    .line 184
    new-instance v12, La/gfa;

    .line 185
    .line 186
    const-wide/16 v10, 0x1

    .line 187
    .line 188
    const v4, 0x7f130934

    .line 189
    .line 190
    .line 191
    invoke-direct {v12, v10, v11, v4}, La/hfa;-><init>(JI)V

    .line 192
    .line 193
    .line 194
    :cond_4
    new-instance v4, Lkotlin/Pair;

    .line 195
    .line 196
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-direct {v4, v7, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    new-instance v10, La/gea;

    .line 204
    .line 205
    new-instance v11, La/una0;

    .line 206
    .line 207
    const v13, 0x7f0806b3

    .line 208
    .line 209
    .line 210
    invoke-direct {v11, v13}, La/una0;-><init>(I)V

    .line 211
    .line 212
    .line 213
    new-instance v13, La/una0;

    .line 214
    .line 215
    const v14, 0x7f0806b7

    .line 216
    .line 217
    .line 218
    invoke-direct {v13, v14}, La/una0;-><init>(I)V

    .line 219
    .line 220
    .line 221
    new-instance v14, La/una0;

    .line 222
    .line 223
    const v15, 0x7f0806bb

    .line 224
    .line 225
    .line 226
    invoke-direct {v14, v15}, La/una0;-><init>(I)V

    .line 227
    .line 228
    .line 229
    filled-new-array {v11, v13, v14}, [La/una0;

    .line 230
    .line 231
    .line 232
    move-result-object v11

    .line 233
    invoke-static {v11}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    new-array v13, v8, [Ljava/lang/Object;

    .line 238
    .line 239
    invoke-static {v13, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v13

    .line 243
    const v14, 0x7f130343

    .line 244
    .line 245
    .line 246
    invoke-virtual {v6, v14, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v13

    .line 250
    invoke-direct {v10, v11, v13}, La/gea;-><init>(La/i4;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    new-instance v14, Lkotlin/Pair;

    .line 254
    .line 255
    invoke-direct {v14, v4, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    new-instance v4, Lkotlin/Pair;

    .line 259
    .line 260
    const/4 v10, 0x1

    .line 261
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    invoke-direct {v4, v7, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    new-instance v13, La/gea;

    .line 269
    .line 270
    new-instance v15, La/una0;

    .line 271
    .line 272
    move-object/from16 p3, v2

    .line 273
    .line 274
    const v2, 0x7f0806bf

    .line 275
    .line 276
    .line 277
    invoke-direct {v15, v2}, La/una0;-><init>(I)V

    .line 278
    .line 279
    .line 280
    new-instance v2, La/una0;

    .line 281
    .line 282
    move/from16 v20, v9

    .line 283
    .line 284
    const v9, 0x7f0806c3

    .line 285
    .line 286
    .line 287
    invoke-direct {v2, v9}, La/una0;-><init>(I)V

    .line 288
    .line 289
    .line 290
    new-instance v9, La/una0;

    .line 291
    .line 292
    const v10, 0x7f0806c7

    .line 293
    .line 294
    .line 295
    invoke-direct {v9, v10}, La/una0;-><init>(I)V

    .line 296
    .line 297
    .line 298
    new-instance v10, La/una0;

    .line 299
    .line 300
    const v5, 0x7f0806cb

    .line 301
    .line 302
    .line 303
    invoke-direct {v10, v5}, La/una0;-><init>(I)V

    .line 304
    .line 305
    .line 306
    filled-new-array {v15, v2, v9, v10}, [La/una0;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-static {v2}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    new-array v5, v8, [Ljava/lang/Object;

    .line 315
    .line 316
    invoke-static {v5, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    const v9, 0x7f13033d

    .line 321
    .line 322
    .line 323
    invoke-virtual {v6, v9, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    invoke-direct {v13, v2, v5}, La/gea;-><init>(La/i4;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    new-instance v15, Lkotlin/Pair;

    .line 331
    .line 332
    invoke-direct {v15, v4, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    new-instance v2, Lkotlin/Pair;

    .line 336
    .line 337
    invoke-direct {v2, v11, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    new-instance v4, La/gea;

    .line 341
    .line 342
    new-instance v5, La/una0;

    .line 343
    .line 344
    const v9, 0x7f0806cf

    .line 345
    .line 346
    .line 347
    invoke-direct {v5, v9}, La/una0;-><init>(I)V

    .line 348
    .line 349
    .line 350
    new-instance v9, La/una0;

    .line 351
    .line 352
    const v10, 0x7f0806af

    .line 353
    .line 354
    .line 355
    invoke-direct {v9, v10}, La/una0;-><init>(I)V

    .line 356
    .line 357
    .line 358
    filled-new-array {v5, v9}, [La/una0;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    invoke-static {v5}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    new-array v9, v8, [Ljava/lang/Object;

    .line 367
    .line 368
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v9

    .line 372
    const v10, 0x7f130342

    .line 373
    .line 374
    .line 375
    invoke-virtual {v6, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v9

    .line 379
    invoke-direct {v4, v5, v9}, La/gea;-><init>(La/i4;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    new-instance v5, Lkotlin/Pair;

    .line 383
    .line 384
    invoke-direct {v5, v2, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    new-instance v2, Lkotlin/Pair;

    .line 388
    .line 389
    invoke-direct {v2, v11, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    new-instance v4, La/gea;

    .line 393
    .line 394
    new-instance v9, La/una0;

    .line 395
    .line 396
    const v10, 0x7f0806d7

    .line 397
    .line 398
    .line 399
    invoke-direct {v9, v10}, La/una0;-><init>(I)V

    .line 400
    .line 401
    .line 402
    filled-new-array {v9}, [La/una0;

    .line 403
    .line 404
    .line 405
    move-result-object v9

    .line 406
    invoke-static {v9}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 407
    .line 408
    .line 409
    move-result-object v9

    .line 410
    new-array v10, v8, [Ljava/lang/Object;

    .line 411
    .line 412
    invoke-static {v10, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v10

    .line 416
    const v13, 0x7f130341

    .line 417
    .line 418
    .line 419
    invoke-virtual {v6, v13, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v10

    .line 423
    invoke-direct {v4, v9, v10}, La/gea;-><init>(La/i4;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    new-instance v9, Lkotlin/Pair;

    .line 427
    .line 428
    invoke-direct {v9, v2, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    new-instance v2, Lkotlin/Pair;

    .line 432
    .line 433
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    invoke-direct {v2, v4, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    new-instance v7, La/gea;

    .line 441
    .line 442
    new-instance v10, La/una0;

    .line 443
    .line 444
    const v13, 0x7f0806df

    .line 445
    .line 446
    .line 447
    invoke-direct {v10, v13}, La/una0;-><init>(I)V

    .line 448
    .line 449
    .line 450
    new-instance v13, La/una0;

    .line 451
    .line 452
    const v8, 0x7f0806db

    .line 453
    .line 454
    .line 455
    invoke-direct {v13, v8}, La/una0;-><init>(I)V

    .line 456
    .line 457
    .line 458
    filled-new-array {v10, v13}, [La/una0;

    .line 459
    .line 460
    .line 461
    move-result-object v8

    .line 462
    invoke-static {v8}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 463
    .line 464
    .line 465
    move-result-object v8

    .line 466
    const/4 v10, 0x0

    .line 467
    new-array v13, v10, [Ljava/lang/Object;

    .line 468
    .line 469
    invoke-static {v13, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v13

    .line 473
    const v10, 0x7f13033c

    .line 474
    .line 475
    .line 476
    invoke-virtual {v6, v10, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v10

    .line 480
    invoke-direct {v7, v8, v10}, La/gea;-><init>(La/i4;Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    new-instance v8, Lkotlin/Pair;

    .line 484
    .line 485
    invoke-direct {v8, v2, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    new-instance v2, Lkotlin/Pair;

    .line 489
    .line 490
    invoke-direct {v2, v4, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    new-instance v4, La/gea;

    .line 494
    .line 495
    new-instance v7, La/una0;

    .line 496
    .line 497
    const v10, 0x7f0806d3

    .line 498
    .line 499
    .line 500
    invoke-direct {v7, v10}, La/una0;-><init>(I)V

    .line 501
    .line 502
    .line 503
    filled-new-array {v7}, [La/una0;

    .line 504
    .line 505
    .line 506
    move-result-object v7

    .line 507
    invoke-static {v7}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 508
    .line 509
    .line 510
    move-result-object v7

    .line 511
    const/4 v10, 0x0

    .line 512
    new-array v11, v10, [Ljava/lang/Object;

    .line 513
    .line 514
    invoke-static {v11, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v11

    .line 518
    const v10, 0x7f130340

    .line 519
    .line 520
    .line 521
    invoke-virtual {v6, v10, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v10

    .line 525
    invoke-direct {v4, v7, v10}, La/gea;-><init>(La/i4;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    new-instance v7, Lkotlin/Pair;

    .line 529
    .line 530
    invoke-direct {v7, v2, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    move-object/from16 v16, v5

    .line 534
    .line 535
    move-object/from16 v19, v7

    .line 536
    .line 537
    move-object/from16 v18, v8

    .line 538
    .line 539
    move-object/from16 v17, v9

    .line 540
    .line 541
    filled-new-array/range {v14 .. v19}, [Lkotlin/Pair;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    sget-object v4, La/uh90;->g:La/uh90;

    .line 546
    .line 547
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    new-instance v5, La/vh90;

    .line 551
    .line 552
    invoke-direct {v5, v4}, La/vh90;-><init>(La/uh90;)V

    .line 553
    .line 554
    .line 555
    invoke-static {v5, v2}, La/xp20;->l(Ljava/util/Map;[Lkotlin/Pair;)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v5}, La/vh90;->build()La/th90;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    iget-object v4, v0, La/wea;->a:La/uea;

    .line 563
    .line 564
    iget-object v5, v0, La/wea;->g:Ljava/util/List;

    .line 565
    .line 566
    iget-object v7, v0, La/wea;->f:Ljava/util/List;

    .line 567
    .line 568
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 569
    .line 570
    .line 571
    move-result-object v8

    .line 572
    new-instance v9, Ljava/util/ArrayList;

    .line 573
    .line 574
    const/16 v10, 0xa

    .line 575
    .line 576
    invoke-static {v7, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 577
    .line 578
    .line 579
    move-result v11

    .line 580
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 581
    .line 582
    .line 583
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 584
    .line 585
    .line 586
    move-result-object v10

    .line 587
    const/4 v11, 0x0

    .line 588
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 589
    .line 590
    .line 591
    move-result v13

    .line 592
    if-eqz v13, :cond_6

    .line 593
    .line 594
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v13

    .line 598
    add-int/lit8 v14, v11, 0x1

    .line 599
    .line 600
    if-ltz v11, :cond_5

    .line 601
    .line 602
    check-cast v13, La/afa;

    .line 603
    .line 604
    sget-object v15, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 605
    .line 606
    move-object/from16 p5, v2

    .line 607
    .line 608
    move-object/from16 v16, v3

    .line 609
    .line 610
    invoke-virtual {v15}, Lorg/xplatform/uikit/compose/color/StaticColors;->getRed-0d7_KjU()J

    .line 611
    .line 612
    .line 613
    move-result-wide v2

    .line 614
    new-instance v15, Ljava/lang/StringBuilder;

    .line 615
    .line 616
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    const-string v11, "firstOpponent"

    .line 623
    .line 624
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v11

    .line 631
    invoke-static {v13, v2, v3, v11}, La/unh0;->p0(La/afa;JLjava/lang/String;)La/tea;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-object/from16 v2, p5

    .line 639
    .line 640
    move v11, v14

    .line 641
    move-object/from16 v3, v16

    .line 642
    .line 643
    goto :goto_4

    .line 644
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 645
    .line 646
    .line 647
    throw p3

    .line 648
    :cond_6
    move-object/from16 p5, v2

    .line 649
    .line 650
    move-object/from16 v16, v3

    .line 651
    .line 652
    invoke-virtual {v8, v9}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 653
    .line 654
    .line 655
    new-instance v2, Ljava/util/ArrayList;

    .line 656
    .line 657
    const/16 v10, 0xa

    .line 658
    .line 659
    invoke-static {v5, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 660
    .line 661
    .line 662
    move-result v3

    .line 663
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 664
    .line 665
    .line 666
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 667
    .line 668
    .line 669
    move-result-object v3

    .line 670
    const/4 v9, 0x0

    .line 671
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 672
    .line 673
    .line 674
    move-result v10

    .line 675
    if-eqz v10, :cond_8

    .line 676
    .line 677
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v10

    .line 681
    add-int/lit8 v11, v9, 0x1

    .line 682
    .line 683
    if-ltz v9, :cond_7

    .line 684
    .line 685
    check-cast v10, La/afa;

    .line 686
    .line 687
    sget-object v13, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 688
    .line 689
    invoke-virtual {v13}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack-0d7_KjU()J

    .line 690
    .line 691
    .line 692
    move-result-wide v13

    .line 693
    new-instance v15, Ljava/lang/StringBuilder;

    .line 694
    .line 695
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 699
    .line 700
    .line 701
    const-string v9, "secondOpponent"

    .line 702
    .line 703
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v9

    .line 710
    invoke-static {v10, v13, v14, v9}, La/unh0;->p0(La/afa;JLjava/lang/String;)La/tea;

    .line 711
    .line 712
    .line 713
    move-result-object v9

    .line 714
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move v9, v11

    .line 718
    goto :goto_5

    .line 719
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 720
    .line 721
    .line 722
    throw p3

    .line 723
    :cond_8
    invoke-virtual {v8, v2}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 724
    .line 725
    .line 726
    sget-object v2, La/uea;->e:La/uea;

    .line 727
    .line 728
    if-eq v4, v2, :cond_9

    .line 729
    .line 730
    sget-object v3, La/uea;->f:La/uea;

    .line 731
    .line 732
    if-eq v4, v3, :cond_9

    .line 733
    .line 734
    sget-object v3, La/uea;->g:La/uea;

    .line 735
    .line 736
    if-eq v4, v3, :cond_9

    .line 737
    .line 738
    sget-object v3, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 739
    .line 740
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 741
    .line 742
    .line 743
    move-result-wide v26

    .line 744
    new-instance v23, La/tea;

    .line 745
    .line 746
    const-string v28, ""

    .line 747
    .line 748
    const-string v29, ""

    .line 749
    .line 750
    const v24, 0x7f080f5c

    .line 751
    .line 752
    .line 753
    const v25, 0x7f080f5c

    .line 754
    .line 755
    .line 756
    invoke-direct/range {v23 .. v29}, La/tea;-><init>(IIJLjava/lang/String;Ljava/lang/String;)V

    .line 757
    .line 758
    .line 759
    move-object/from16 v3, v23

    .line 760
    .line 761
    invoke-virtual {v8, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    :cond_9
    invoke-static {v8}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 769
    .line 770
    .line 771
    move-result-object v3

    .line 772
    invoke-static {v7, v5}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 773
    .line 774
    .line 775
    move-result-object v5

    .line 776
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v7

    .line 780
    check-cast v7, La/afa;

    .line 781
    .line 782
    if-eqz v7, :cond_a

    .line 783
    .line 784
    iget-object v7, v7, La/afa;->b:La/tna0;

    .line 785
    .line 786
    goto :goto_6

    .line 787
    :cond_a
    new-instance v7, La/tna0;

    .line 788
    .line 789
    sget-object v8, La/sna0;->e:La/sna0;

    .line 790
    .line 791
    sget-object v9, La/rna0;->p:La/rna0;

    .line 792
    .line 793
    invoke-direct {v7, v8, v9}, La/tna0;-><init>(La/sna0;La/rna0;)V

    .line 794
    .line 795
    .line 796
    :goto_6
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v5

    .line 800
    check-cast v5, La/afa;

    .line 801
    .line 802
    if-eqz v5, :cond_b

    .line 803
    .line 804
    iget-object v5, v5, La/afa;->c:La/tna0;

    .line 805
    .line 806
    goto :goto_7

    .line 807
    :cond_b
    new-instance v5, La/tna0;

    .line 808
    .line 809
    sget-object v8, La/sna0;->e:La/sna0;

    .line 810
    .line 811
    sget-object v9, La/rna0;->p:La/rna0;

    .line 812
    .line 813
    invoke-direct {v5, v8, v9}, La/tna0;-><init>(La/sna0;La/rna0;)V

    .line 814
    .line 815
    .line 816
    :goto_7
    invoke-static {v7}, La/z1x;->F(La/tna0;)I

    .line 817
    .line 818
    .line 819
    move-result v7

    .line 820
    invoke-static {v5}, La/z1x;->F(La/tna0;)I

    .line 821
    .line 822
    .line 823
    move-result v5

    .line 824
    new-instance v8, Ljava/lang/StringBuilder;

    .line 825
    .line 826
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 827
    .line 828
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 832
    .line 833
    const-string v10, "static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Field.png"

    .line 834
    .line 835
    const/4 v11, 0x0

    .line 836
    invoke-static {v10, v9, v11}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 837
    .line 838
    .line 839
    move-result v9

    .line 840
    const-string v13, "/"

    .line 841
    .line 842
    const-string v14, "https://"

    .line 843
    .line 844
    const/16 v15, 0x2f

    .line 845
    .line 846
    if-nez v9, :cond_e

    .line 847
    .line 848
    invoke-static {v10, v14, v11}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 849
    .line 850
    .line 851
    move-result v9

    .line 852
    if-eqz v9, :cond_c

    .line 853
    .line 854
    const/4 v9, 0x0

    .line 855
    goto :goto_8

    .line 856
    :cond_c
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    .line 857
    .line 858
    .line 859
    move-result v9

    .line 860
    if-lez v9, :cond_d

    .line 861
    .line 862
    invoke-static {v8, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 863
    .line 864
    .line 865
    move-result v9

    .line 866
    if-nez v9, :cond_d

    .line 867
    .line 868
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 869
    .line 870
    .line 871
    :cond_d
    const/4 v9, 0x1

    .line 872
    new-array v11, v9, [C

    .line 873
    .line 874
    const/4 v9, 0x0

    .line 875
    aput-char v15, v11, v9

    .line 876
    .line 877
    invoke-static {v10, v11}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v10

    .line 881
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 882
    .line 883
    .line 884
    goto :goto_9

    .line 885
    :cond_e
    move v9, v11

    .line 886
    :goto_8
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 890
    .line 891
    .line 892
    :goto_9
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v8

    .line 896
    new-instance v23, La/jea;

    .line 897
    .line 898
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 899
    .line 900
    .line 901
    move-result v9

    .line 902
    const/4 v10, 0x4

    .line 903
    const/4 v11, 0x1

    .line 904
    if-eq v9, v11, :cond_16

    .line 905
    .line 906
    if-eq v9, v10, :cond_12

    .line 907
    .line 908
    new-instance v9, Ljava/lang/StringBuilder;

    .line 909
    .line 910
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 911
    .line 912
    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 913
    .line 914
    .line 915
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 916
    .line 917
    const-string v10, "static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreyIcon.png"

    .line 918
    .line 919
    const/4 v15, 0x0

    .line 920
    invoke-static {v10, v11, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 921
    .line 922
    .line 923
    move-result v11

    .line 924
    if-nez v11, :cond_11

    .line 925
    .line 926
    invoke-static {v10, v14, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 927
    .line 928
    .line 929
    move-result v11

    .line 930
    if-eqz v11, :cond_f

    .line 931
    .line 932
    const/4 v15, 0x0

    .line 933
    goto :goto_b

    .line 934
    :cond_f
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 935
    .line 936
    .line 937
    move-result v11

    .line 938
    if-lez v11, :cond_10

    .line 939
    .line 940
    invoke-static {v9, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 941
    .line 942
    .line 943
    move-result v11

    .line 944
    if-nez v11, :cond_10

    .line 945
    .line 946
    const/16 v11, 0x2f

    .line 947
    .line 948
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 949
    .line 950
    .line 951
    move/from16 v17, v11

    .line 952
    .line 953
    const/4 v15, 0x1

    .line 954
    goto :goto_a

    .line 955
    :cond_10
    const/4 v15, 0x1

    .line 956
    const/16 v17, 0x2f

    .line 957
    .line 958
    :goto_a
    new-array v11, v15, [C

    .line 959
    .line 960
    const/4 v15, 0x0

    .line 961
    aput-char v17, v11, v15

    .line 962
    .line 963
    invoke-static {v10, v11}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v10

    .line 967
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 968
    .line 969
    .line 970
    goto :goto_c

    .line 971
    :cond_11
    :goto_b
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    :goto_c
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v9

    .line 981
    :goto_d
    move-object/from16 v24, v9

    .line 982
    .line 983
    goto/16 :goto_14

    .line 984
    .line 985
    :cond_12
    const/4 v15, 0x0

    .line 986
    new-instance v9, Ljava/lang/StringBuilder;

    .line 987
    .line 988
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 989
    .line 990
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 994
    .line 995
    const-string v11, "static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreenIcon.png"

    .line 996
    .line 997
    invoke-static {v11, v10, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 998
    .line 999
    .line 1000
    move-result v10

    .line 1001
    if-nez v10, :cond_15

    .line 1002
    .line 1003
    invoke-static {v11, v14, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v10

    .line 1007
    if-eqz v10, :cond_13

    .line 1008
    .line 1009
    const/4 v15, 0x0

    .line 1010
    goto :goto_f

    .line 1011
    :cond_13
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 1012
    .line 1013
    .line 1014
    move-result v10

    .line 1015
    if-lez v10, :cond_14

    .line 1016
    .line 1017
    invoke-static {v9, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v10

    .line 1021
    if-nez v10, :cond_14

    .line 1022
    .line 1023
    const/16 v10, 0x2f

    .line 1024
    .line 1025
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1026
    .line 1027
    .line 1028
    move/from16 v17, v10

    .line 1029
    .line 1030
    const/4 v15, 0x1

    .line 1031
    goto :goto_e

    .line 1032
    :cond_14
    const/4 v15, 0x1

    .line 1033
    const/16 v17, 0x2f

    .line 1034
    .line 1035
    :goto_e
    new-array v10, v15, [C

    .line 1036
    .line 1037
    const/4 v15, 0x0

    .line 1038
    aput-char v17, v10, v15

    .line 1039
    .line 1040
    invoke-static {v11, v10}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v10

    .line 1044
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1045
    .line 1046
    .line 1047
    goto :goto_10

    .line 1048
    :cond_15
    :goto_f
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1052
    .line 1053
    .line 1054
    :goto_10
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v9

    .line 1058
    goto :goto_d

    .line 1059
    :cond_16
    const/4 v15, 0x0

    .line 1060
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1061
    .line 1062
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 1063
    .line 1064
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1065
    .line 1066
    .line 1067
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 1068
    .line 1069
    const-string v11, "static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/BlueIcon.png"

    .line 1070
    .line 1071
    invoke-static {v11, v10, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v10

    .line 1075
    if-nez v10, :cond_19

    .line 1076
    .line 1077
    invoke-static {v11, v14, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v10

    .line 1081
    if-eqz v10, :cond_17

    .line 1082
    .line 1083
    const/4 v15, 0x0

    .line 1084
    goto :goto_12

    .line 1085
    :cond_17
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 1086
    .line 1087
    .line 1088
    move-result v10

    .line 1089
    if-lez v10, :cond_18

    .line 1090
    .line 1091
    invoke-static {v9, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v10

    .line 1095
    if-nez v10, :cond_18

    .line 1096
    .line 1097
    const/16 v10, 0x2f

    .line 1098
    .line 1099
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1100
    .line 1101
    .line 1102
    move/from16 v17, v10

    .line 1103
    .line 1104
    const/4 v15, 0x1

    .line 1105
    goto :goto_11

    .line 1106
    :cond_18
    const/4 v15, 0x1

    .line 1107
    const/16 v17, 0x2f

    .line 1108
    .line 1109
    :goto_11
    new-array v10, v15, [C

    .line 1110
    .line 1111
    const/4 v15, 0x0

    .line 1112
    aput-char v17, v10, v15

    .line 1113
    .line 1114
    invoke-static {v11, v10}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v10

    .line 1118
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1119
    .line 1120
    .line 1121
    goto :goto_13

    .line 1122
    :cond_19
    :goto_12
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1126
    .line 1127
    .line 1128
    :goto_13
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v9

    .line 1132
    goto/16 :goto_d

    .line 1133
    .line 1134
    :goto_14
    iget-object v9, v1, La/m9s;->i:Ljava/lang/String;

    .line 1135
    .line 1136
    iget v10, v0, La/wea;->b:I

    .line 1137
    .line 1138
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v26

    .line 1142
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1143
    .line 1144
    .line 1145
    move-result v10

    .line 1146
    const/4 v11, 0x5

    .line 1147
    move/from16 v15, v20

    .line 1148
    .line 1149
    if-eq v10, v15, :cond_21

    .line 1150
    .line 1151
    if-eq v10, v11, :cond_1d

    .line 1152
    .line 1153
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1154
    .line 1155
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 1156
    .line 1157
    invoke-direct {v10, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 1161
    .line 1162
    const-string v11, "static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreyIcon.png"

    .line 1163
    .line 1164
    move-object/from16 v19, v3

    .line 1165
    .line 1166
    const/4 v3, 0x0

    .line 1167
    invoke-static {v11, v15, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1168
    .line 1169
    .line 1170
    move-result v15

    .line 1171
    if-nez v15, :cond_1c

    .line 1172
    .line 1173
    invoke-static {v11, v14, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1174
    .line 1175
    .line 1176
    move-result v15

    .line 1177
    if-eqz v15, :cond_1a

    .line 1178
    .line 1179
    const/4 v15, 0x0

    .line 1180
    goto :goto_16

    .line 1181
    :cond_1a
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    .line 1182
    .line 1183
    .line 1184
    move-result v3

    .line 1185
    if-lez v3, :cond_1b

    .line 1186
    .line 1187
    invoke-static {v10, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v3

    .line 1191
    if-nez v3, :cond_1b

    .line 1192
    .line 1193
    const/16 v3, 0x2f

    .line 1194
    .line 1195
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1196
    .line 1197
    .line 1198
    move/from16 v17, v3

    .line 1199
    .line 1200
    const/4 v15, 0x1

    .line 1201
    goto :goto_15

    .line 1202
    :cond_1b
    const/4 v15, 0x1

    .line 1203
    const/16 v17, 0x2f

    .line 1204
    .line 1205
    :goto_15
    new-array v3, v15, [C

    .line 1206
    .line 1207
    const/4 v15, 0x0

    .line 1208
    aput-char v17, v3, v15

    .line 1209
    .line 1210
    invoke-static {v11, v3}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v3

    .line 1214
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1215
    .line 1216
    .line 1217
    goto :goto_17

    .line 1218
    :cond_1c
    move v15, v3

    .line 1219
    :goto_16
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1223
    .line 1224
    .line 1225
    :goto_17
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v3

    .line 1229
    :goto_18
    move-object/from16 v27, v3

    .line 1230
    .line 1231
    goto/16 :goto_1f

    .line 1232
    .line 1233
    :cond_1d
    move-object/from16 v19, v3

    .line 1234
    .line 1235
    const/4 v15, 0x0

    .line 1236
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1237
    .line 1238
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 1239
    .line 1240
    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1241
    .line 1242
    .line 1243
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 1244
    .line 1245
    const-string v11, "static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreenIcon.png"

    .line 1246
    .line 1247
    invoke-static {v11, v10, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1248
    .line 1249
    .line 1250
    move-result v10

    .line 1251
    if-nez v10, :cond_20

    .line 1252
    .line 1253
    invoke-static {v11, v14, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v10

    .line 1257
    if-eqz v10, :cond_1e

    .line 1258
    .line 1259
    const/4 v15, 0x0

    .line 1260
    goto :goto_1a

    .line 1261
    :cond_1e
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 1262
    .line 1263
    .line 1264
    move-result v10

    .line 1265
    if-lez v10, :cond_1f

    .line 1266
    .line 1267
    invoke-static {v3, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1268
    .line 1269
    .line 1270
    move-result v10

    .line 1271
    if-nez v10, :cond_1f

    .line 1272
    .line 1273
    const/16 v10, 0x2f

    .line 1274
    .line 1275
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1276
    .line 1277
    .line 1278
    move/from16 v17, v10

    .line 1279
    .line 1280
    const/4 v15, 0x1

    .line 1281
    goto :goto_19

    .line 1282
    :cond_1f
    const/4 v15, 0x1

    .line 1283
    const/16 v17, 0x2f

    .line 1284
    .line 1285
    :goto_19
    new-array v10, v15, [C

    .line 1286
    .line 1287
    const/4 v15, 0x0

    .line 1288
    aput-char v17, v10, v15

    .line 1289
    .line 1290
    invoke-static {v11, v10}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v10

    .line 1294
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1295
    .line 1296
    .line 1297
    goto :goto_1b

    .line 1298
    :cond_20
    :goto_1a
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1302
    .line 1303
    .line 1304
    :goto_1b
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v3

    .line 1308
    goto :goto_18

    .line 1309
    :cond_21
    move-object/from16 v19, v3

    .line 1310
    .line 1311
    const/4 v15, 0x0

    .line 1312
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1313
    .line 1314
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 1315
    .line 1316
    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1317
    .line 1318
    .line 1319
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 1320
    .line 1321
    const-string v11, "static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/BlueIcon.png"

    .line 1322
    .line 1323
    invoke-static {v11, v10, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1324
    .line 1325
    .line 1326
    move-result v10

    .line 1327
    if-nez v10, :cond_24

    .line 1328
    .line 1329
    invoke-static {v11, v14, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1330
    .line 1331
    .line 1332
    move-result v10

    .line 1333
    if-eqz v10, :cond_22

    .line 1334
    .line 1335
    const/4 v15, 0x0

    .line 1336
    goto :goto_1d

    .line 1337
    :cond_22
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 1338
    .line 1339
    .line 1340
    move-result v10

    .line 1341
    if-lez v10, :cond_23

    .line 1342
    .line 1343
    invoke-static {v3, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1344
    .line 1345
    .line 1346
    move-result v10

    .line 1347
    if-nez v10, :cond_23

    .line 1348
    .line 1349
    const/16 v10, 0x2f

    .line 1350
    .line 1351
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1352
    .line 1353
    .line 1354
    move/from16 v17, v10

    .line 1355
    .line 1356
    const/4 v15, 0x1

    .line 1357
    goto :goto_1c

    .line 1358
    :cond_23
    const/4 v15, 0x1

    .line 1359
    const/16 v17, 0x2f

    .line 1360
    .line 1361
    :goto_1c
    new-array v10, v15, [C

    .line 1362
    .line 1363
    const/4 v15, 0x0

    .line 1364
    aput-char v17, v10, v15

    .line 1365
    .line 1366
    invoke-static {v11, v10}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v10

    .line 1370
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1371
    .line 1372
    .line 1373
    goto :goto_1e

    .line 1374
    :cond_24
    :goto_1d
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1375
    .line 1376
    .line 1377
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1378
    .line 1379
    .line 1380
    :goto_1e
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v3

    .line 1384
    goto/16 :goto_18

    .line 1385
    .line 1386
    :goto_1f
    iget-object v1, v1, La/m9s;->j:Ljava/lang/String;

    .line 1387
    .line 1388
    iget v0, v0, La/wea;->c:I

    .line 1389
    .line 1390
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v29

    .line 1394
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1395
    .line 1396
    .line 1397
    move-result v0

    .line 1398
    const/4 v15, 0x1

    .line 1399
    if-eq v0, v15, :cond_26

    .line 1400
    .line 1401
    const/4 v3, 0x4

    .line 1402
    if-eq v0, v3, :cond_25

    .line 1403
    .line 1404
    sget-wide v10, La/y3d;->f:J

    .line 1405
    .line 1406
    :goto_20
    move-wide/from16 v30, v10

    .line 1407
    .line 1408
    goto :goto_21

    .line 1409
    :cond_25
    sget-wide v10, La/ijg;->u0:J

    .line 1410
    .line 1411
    goto :goto_20

    .line 1412
    :cond_26
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1413
    .line 1414
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getDarkBlue-0d7_KjU()J

    .line 1415
    .line 1416
    .line 1417
    move-result-wide v10

    .line 1418
    goto :goto_20

    .line 1419
    :goto_21
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1420
    .line 1421
    .line 1422
    move-result v0

    .line 1423
    const/4 v15, 0x2

    .line 1424
    if-eq v0, v15, :cond_28

    .line 1425
    .line 1426
    const/4 v3, 0x5

    .line 1427
    if-eq v0, v3, :cond_27

    .line 1428
    .line 1429
    sget-wide v10, La/y3d;->f:J

    .line 1430
    .line 1431
    :goto_22
    move-wide/from16 v32, v10

    .line 1432
    .line 1433
    goto :goto_23

    .line 1434
    :cond_27
    sget-wide v10, La/ijg;->u0:J

    .line 1435
    .line 1436
    goto :goto_22

    .line 1437
    :cond_28
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1438
    .line 1439
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getDarkBlue-0d7_KjU()J

    .line 1440
    .line 1441
    .line 1442
    move-result-wide v10

    .line 1443
    goto :goto_22

    .line 1444
    :goto_23
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1445
    .line 1446
    .line 1447
    move-result v0

    .line 1448
    packed-switch v0, :pswitch_data_0

    .line 1449
    .line 1450
    .line 1451
    invoke-static {}, La/t9f;->b()V

    .line 1452
    .line 1453
    .line 1454
    return-void

    .line 1455
    :pswitch_0
    const/4 v15, 0x0

    .line 1456
    new-array v0, v15, [Ljava/lang/Object;

    .line 1457
    .line 1458
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v0

    .line 1462
    const v3, 0x7f13073c

    .line 1463
    .line 1464
    .line 1465
    invoke-virtual {v6, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v0

    .line 1469
    :goto_24
    move-object/from16 v35, p6

    .line 1470
    .line 1471
    move-object/from16 v34, v0

    .line 1472
    .line 1473
    move-object/from16 v28, v1

    .line 1474
    .line 1475
    move-object/from16 v25, v9

    .line 1476
    .line 1477
    goto :goto_25

    .line 1478
    :pswitch_1
    const/4 v15, 0x0

    .line 1479
    new-array v0, v15, [Ljava/lang/Object;

    .line 1480
    .line 1481
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v0

    .line 1485
    const v3, 0x7f13033f

    .line 1486
    .line 1487
    .line 1488
    invoke-virtual {v6, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v0

    .line 1492
    goto :goto_24

    .line 1493
    :pswitch_2
    const/4 v15, 0x0

    .line 1494
    new-array v0, v15, [Ljava/lang/Object;

    .line 1495
    .line 1496
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v0

    .line 1500
    const v3, 0x7f13033b

    .line 1501
    .line 1502
    .line 1503
    invoke-virtual {v6, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v0

    .line 1507
    goto :goto_24

    .line 1508
    :pswitch_3
    const/4 v15, 0x0

    .line 1509
    new-array v0, v15, [Ljava/lang/Object;

    .line 1510
    .line 1511
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v0

    .line 1515
    const v3, 0x7f130338

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v6, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v0

    .line 1522
    goto :goto_24

    .line 1523
    :pswitch_4
    const/4 v15, 0x0

    .line 1524
    new-array v0, v15, [Ljava/lang/Object;

    .line 1525
    .line 1526
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v0

    .line 1530
    const v3, 0x7f13033e

    .line 1531
    .line 1532
    .line 1533
    invoke-virtual {v6, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v0

    .line 1537
    goto :goto_24

    .line 1538
    :pswitch_5
    const/4 v15, 0x0

    .line 1539
    new-array v0, v15, [Ljava/lang/Object;

    .line 1540
    .line 1541
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v0

    .line 1545
    const v3, 0x7f13033a

    .line 1546
    .line 1547
    .line 1548
    invoke-virtual {v6, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v0

    .line 1552
    goto :goto_24

    .line 1553
    :pswitch_6
    const/4 v15, 0x0

    .line 1554
    new-array v0, v15, [Ljava/lang/Object;

    .line 1555
    .line 1556
    invoke-static {v0, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v0

    .line 1560
    const v3, 0x7f130233

    .line 1561
    .line 1562
    .line 1563
    invoke-virtual {v6, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    goto :goto_24

    .line 1568
    :goto_25
    invoke-direct/range {v23 .. v35}, La/jea;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    .line 1569
    .line 1570
    .line 1571
    move-object/from16 v0, v23

    .line 1572
    .line 1573
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1574
    .line 1575
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 1576
    .line 1577
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1578
    .line 1579
    .line 1580
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 1581
    .line 1582
    const-string v6, "static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Gates.png"

    .line 1583
    .line 1584
    invoke-static {v6, v3, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1585
    .line 1586
    .line 1587
    move-result v3

    .line 1588
    if-nez v3, :cond_2b

    .line 1589
    .line 1590
    invoke-static {v6, v14, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1591
    .line 1592
    .line 1593
    move-result v3

    .line 1594
    if-eqz v3, :cond_29

    .line 1595
    .line 1596
    const/4 v15, 0x0

    .line 1597
    goto :goto_28

    .line 1598
    :cond_29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 1599
    .line 1600
    .line 1601
    move-result v3

    .line 1602
    if-lez v3, :cond_2a

    .line 1603
    .line 1604
    invoke-static {v1, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1605
    .line 1606
    .line 1607
    move-result v3

    .line 1608
    if-nez v3, :cond_2a

    .line 1609
    .line 1610
    const/16 v10, 0x2f

    .line 1611
    .line 1612
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1613
    .line 1614
    .line 1615
    :goto_26
    const/4 v15, 0x1

    .line 1616
    goto :goto_27

    .line 1617
    :cond_2a
    const/16 v10, 0x2f

    .line 1618
    .line 1619
    goto :goto_26

    .line 1620
    :goto_27
    new-array v3, v15, [C

    .line 1621
    .line 1622
    const/4 v15, 0x0

    .line 1623
    aput-char v10, v3, v15

    .line 1624
    .line 1625
    invoke-static {v6, v3}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v3

    .line 1629
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1630
    .line 1631
    .line 1632
    goto :goto_29

    .line 1633
    :cond_2b
    :goto_28
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1634
    .line 1635
    .line 1636
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1637
    .line 1638
    .line 1639
    :goto_29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v1

    .line 1643
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1644
    .line 1645
    .line 1646
    move-result v3

    .line 1647
    const-string v6, ""

    .line 1648
    .line 1649
    const/4 v15, 0x1

    .line 1650
    if-eq v3, v15, :cond_34

    .line 1651
    .line 1652
    const/4 v15, 0x2

    .line 1653
    if-eq v3, v15, :cond_30

    .line 1654
    .line 1655
    const/4 v9, 0x4

    .line 1656
    if-eq v3, v9, :cond_2c

    .line 1657
    .line 1658
    move-object/from16 v23, v6

    .line 1659
    .line 1660
    goto/16 :goto_37

    .line 1661
    .line 1662
    :cond_2c
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1663
    .line 1664
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 1665
    .line 1666
    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1667
    .line 1668
    .line 1669
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 1670
    .line 1671
    const-string v10, "static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyRed.png"

    .line 1672
    .line 1673
    const/4 v15, 0x0

    .line 1674
    invoke-static {v10, v9, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1675
    .line 1676
    .line 1677
    move-result v9

    .line 1678
    if-nez v9, :cond_2f

    .line 1679
    .line 1680
    invoke-static {v10, v14, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1681
    .line 1682
    .line 1683
    move-result v9

    .line 1684
    if-eqz v9, :cond_2d

    .line 1685
    .line 1686
    const/4 v15, 0x0

    .line 1687
    goto :goto_2c

    .line 1688
    :cond_2d
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 1689
    .line 1690
    .line 1691
    move-result v9

    .line 1692
    if-lez v9, :cond_2e

    .line 1693
    .line 1694
    invoke-static {v3, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1695
    .line 1696
    .line 1697
    move-result v9

    .line 1698
    if-nez v9, :cond_2e

    .line 1699
    .line 1700
    const/16 v11, 0x2f

    .line 1701
    .line 1702
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1703
    .line 1704
    .line 1705
    :goto_2a
    const/4 v15, 0x1

    .line 1706
    goto :goto_2b

    .line 1707
    :cond_2e
    const/16 v11, 0x2f

    .line 1708
    .line 1709
    goto :goto_2a

    .line 1710
    :goto_2b
    new-array v9, v15, [C

    .line 1711
    .line 1712
    const/4 v15, 0x0

    .line 1713
    aput-char v11, v9, v15

    .line 1714
    .line 1715
    invoke-static {v10, v9}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v9

    .line 1719
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1720
    .line 1721
    .line 1722
    goto :goto_2d

    .line 1723
    :cond_2f
    :goto_2c
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1724
    .line 1725
    .line 1726
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1727
    .line 1728
    .line 1729
    :goto_2d
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v3

    .line 1733
    :goto_2e
    move-object/from16 v23, v3

    .line 1734
    .line 1735
    goto/16 :goto_37

    .line 1736
    .line 1737
    :cond_30
    const/4 v15, 0x0

    .line 1738
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1739
    .line 1740
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 1741
    .line 1742
    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1743
    .line 1744
    .line 1745
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 1746
    .line 1747
    const-string v10, "static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsBlack.png"

    .line 1748
    .line 1749
    invoke-static {v10, v9, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1750
    .line 1751
    .line 1752
    move-result v9

    .line 1753
    if-nez v9, :cond_33

    .line 1754
    .line 1755
    invoke-static {v10, v14, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1756
    .line 1757
    .line 1758
    move-result v9

    .line 1759
    if-eqz v9, :cond_31

    .line 1760
    .line 1761
    const/4 v15, 0x0

    .line 1762
    goto :goto_31

    .line 1763
    :cond_31
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 1764
    .line 1765
    .line 1766
    move-result v9

    .line 1767
    if-lez v9, :cond_32

    .line 1768
    .line 1769
    invoke-static {v3, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1770
    .line 1771
    .line 1772
    move-result v9

    .line 1773
    if-nez v9, :cond_32

    .line 1774
    .line 1775
    const/16 v11, 0x2f

    .line 1776
    .line 1777
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1778
    .line 1779
    .line 1780
    :goto_2f
    const/4 v15, 0x1

    .line 1781
    goto :goto_30

    .line 1782
    :cond_32
    const/16 v11, 0x2f

    .line 1783
    .line 1784
    goto :goto_2f

    .line 1785
    :goto_30
    new-array v9, v15, [C

    .line 1786
    .line 1787
    const/4 v15, 0x0

    .line 1788
    aput-char v11, v9, v15

    .line 1789
    .line 1790
    invoke-static {v10, v9}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v9

    .line 1794
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1795
    .line 1796
    .line 1797
    goto :goto_32

    .line 1798
    :cond_33
    :goto_31
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1799
    .line 1800
    .line 1801
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1802
    .line 1803
    .line 1804
    :goto_32
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v3

    .line 1808
    goto :goto_2e

    .line 1809
    :cond_34
    const/4 v15, 0x0

    .line 1810
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1811
    .line 1812
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 1813
    .line 1814
    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1815
    .line 1816
    .line 1817
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 1818
    .line 1819
    const-string v10, "static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsRed.png"

    .line 1820
    .line 1821
    invoke-static {v10, v9, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1822
    .line 1823
    .line 1824
    move-result v9

    .line 1825
    if-nez v9, :cond_37

    .line 1826
    .line 1827
    invoke-static {v10, v14, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1828
    .line 1829
    .line 1830
    move-result v9

    .line 1831
    if-eqz v9, :cond_35

    .line 1832
    .line 1833
    const/4 v15, 0x0

    .line 1834
    goto :goto_35

    .line 1835
    :cond_35
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 1836
    .line 1837
    .line 1838
    move-result v9

    .line 1839
    if-lez v9, :cond_36

    .line 1840
    .line 1841
    invoke-static {v3, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1842
    .line 1843
    .line 1844
    move-result v9

    .line 1845
    if-nez v9, :cond_36

    .line 1846
    .line 1847
    const/16 v11, 0x2f

    .line 1848
    .line 1849
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1850
    .line 1851
    .line 1852
    :goto_33
    const/4 v15, 0x1

    .line 1853
    goto :goto_34

    .line 1854
    :cond_36
    const/16 v11, 0x2f

    .line 1855
    .line 1856
    goto :goto_33

    .line 1857
    :goto_34
    new-array v9, v15, [C

    .line 1858
    .line 1859
    const/4 v15, 0x0

    .line 1860
    aput-char v11, v9, v15

    .line 1861
    .line 1862
    invoke-static {v10, v9}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1863
    .line 1864
    .line 1865
    move-result-object v9

    .line 1866
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1867
    .line 1868
    .line 1869
    goto :goto_36

    .line 1870
    :cond_37
    :goto_35
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1871
    .line 1872
    .line 1873
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1874
    .line 1875
    .line 1876
    :goto_36
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v3

    .line 1880
    goto/16 :goto_2e

    .line 1881
    .line 1882
    :goto_37
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1883
    .line 1884
    .line 1885
    move-result v3

    .line 1886
    const/4 v15, 0x1

    .line 1887
    if-eq v3, v15, :cond_40

    .line 1888
    .line 1889
    const/4 v15, 0x2

    .line 1890
    if-eq v3, v15, :cond_3c

    .line 1891
    .line 1892
    const/4 v9, 0x5

    .line 1893
    if-eq v3, v9, :cond_38

    .line 1894
    .line 1895
    move-object/from16 v24, v6

    .line 1896
    .line 1897
    const/4 v11, 0x0

    .line 1898
    :goto_38
    const/4 v15, 0x1

    .line 1899
    goto/16 :goto_47

    .line 1900
    .line 1901
    :cond_38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1902
    .line 1903
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 1904
    .line 1905
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1906
    .line 1907
    .line 1908
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 1909
    .line 1910
    const-string v9, "static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png"

    .line 1911
    .line 1912
    const/4 v15, 0x0

    .line 1913
    invoke-static {v9, v6, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1914
    .line 1915
    .line 1916
    move-result v6

    .line 1917
    if-nez v6, :cond_3b

    .line 1918
    .line 1919
    invoke-static {v9, v14, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1920
    .line 1921
    .line 1922
    move-result v6

    .line 1923
    if-eqz v6, :cond_39

    .line 1924
    .line 1925
    const/4 v15, 0x0

    .line 1926
    goto :goto_3b

    .line 1927
    :cond_39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 1928
    .line 1929
    .line 1930
    move-result v6

    .line 1931
    if-lez v6, :cond_3a

    .line 1932
    .line 1933
    invoke-static {v3, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1934
    .line 1935
    .line 1936
    move-result v6

    .line 1937
    if-nez v6, :cond_3a

    .line 1938
    .line 1939
    const/16 v10, 0x2f

    .line 1940
    .line 1941
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1942
    .line 1943
    .line 1944
    :goto_39
    const/4 v15, 0x1

    .line 1945
    goto :goto_3a

    .line 1946
    :cond_3a
    const/16 v10, 0x2f

    .line 1947
    .line 1948
    goto :goto_39

    .line 1949
    :goto_3a
    new-array v6, v15, [C

    .line 1950
    .line 1951
    const/4 v15, 0x0

    .line 1952
    aput-char v10, v6, v15

    .line 1953
    .line 1954
    invoke-static {v9, v6}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v6

    .line 1958
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1959
    .line 1960
    .line 1961
    goto :goto_3c

    .line 1962
    :cond_3b
    :goto_3b
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1963
    .line 1964
    .line 1965
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1966
    .line 1967
    .line 1968
    :goto_3c
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1969
    .line 1970
    .line 1971
    move-result-object v6

    .line 1972
    :goto_3d
    move-object/from16 v24, v6

    .line 1973
    .line 1974
    move v11, v15

    .line 1975
    goto :goto_38

    .line 1976
    :cond_3c
    const/4 v15, 0x0

    .line 1977
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1978
    .line 1979
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 1980
    .line 1981
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1982
    .line 1983
    .line 1984
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 1985
    .line 1986
    const-string v9, "static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png"

    .line 1987
    .line 1988
    invoke-static {v9, v6, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1989
    .line 1990
    .line 1991
    move-result v6

    .line 1992
    if-nez v6, :cond_3f

    .line 1993
    .line 1994
    invoke-static {v9, v14, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1995
    .line 1996
    .line 1997
    move-result v6

    .line 1998
    if-eqz v6, :cond_3d

    .line 1999
    .line 2000
    const/4 v15, 0x0

    .line 2001
    goto :goto_40

    .line 2002
    :cond_3d
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 2003
    .line 2004
    .line 2005
    move-result v6

    .line 2006
    if-lez v6, :cond_3e

    .line 2007
    .line 2008
    invoke-static {v3, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 2009
    .line 2010
    .line 2011
    move-result v6

    .line 2012
    if-nez v6, :cond_3e

    .line 2013
    .line 2014
    const/16 v10, 0x2f

    .line 2015
    .line 2016
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2017
    .line 2018
    .line 2019
    :goto_3e
    const/4 v15, 0x1

    .line 2020
    goto :goto_3f

    .line 2021
    :cond_3e
    const/16 v10, 0x2f

    .line 2022
    .line 2023
    goto :goto_3e

    .line 2024
    :goto_3f
    new-array v6, v15, [C

    .line 2025
    .line 2026
    const/4 v15, 0x0

    .line 2027
    aput-char v10, v6, v15

    .line 2028
    .line 2029
    invoke-static {v9, v6}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 2030
    .line 2031
    .line 2032
    move-result-object v6

    .line 2033
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2034
    .line 2035
    .line 2036
    goto :goto_41

    .line 2037
    :cond_3f
    :goto_40
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2038
    .line 2039
    .line 2040
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2041
    .line 2042
    .line 2043
    :goto_41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v6

    .line 2047
    goto :goto_3d

    .line 2048
    :cond_40
    const/4 v15, 0x0

    .line 2049
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2050
    .line 2051
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 2052
    .line 2053
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2054
    .line 2055
    .line 2056
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 2057
    .line 2058
    const-string v9, "static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png"

    .line 2059
    .line 2060
    invoke-static {v9, v6, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2061
    .line 2062
    .line 2063
    move-result v6

    .line 2064
    if-nez v6, :cond_43

    .line 2065
    .line 2066
    invoke-static {v9, v14, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2067
    .line 2068
    .line 2069
    move-result v6

    .line 2070
    if-eqz v6, :cond_41

    .line 2071
    .line 2072
    const/4 v11, 0x0

    .line 2073
    :goto_42
    const/4 v15, 0x1

    .line 2074
    goto :goto_45

    .line 2075
    :cond_41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 2076
    .line 2077
    .line 2078
    move-result v6

    .line 2079
    if-lez v6, :cond_42

    .line 2080
    .line 2081
    invoke-static {v3, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 2082
    .line 2083
    .line 2084
    move-result v6

    .line 2085
    if-nez v6, :cond_42

    .line 2086
    .line 2087
    const/16 v10, 0x2f

    .line 2088
    .line 2089
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2090
    .line 2091
    .line 2092
    :goto_43
    const/4 v15, 0x1

    .line 2093
    goto :goto_44

    .line 2094
    :cond_42
    const/16 v10, 0x2f

    .line 2095
    .line 2096
    goto :goto_43

    .line 2097
    :goto_44
    new-array v6, v15, [C

    .line 2098
    .line 2099
    const/4 v11, 0x0

    .line 2100
    aput-char v10, v6, v11

    .line 2101
    .line 2102
    invoke-static {v9, v6}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v6

    .line 2106
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2107
    .line 2108
    .line 2109
    goto :goto_46

    .line 2110
    :cond_43
    move v11, v15

    .line 2111
    goto :goto_42

    .line 2112
    :goto_45
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2113
    .line 2114
    .line 2115
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2116
    .line 2117
    .line 2118
    :goto_46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v6

    .line 2122
    move-object/from16 v24, v6

    .line 2123
    .line 2124
    :goto_47
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 2125
    .line 2126
    .line 2127
    move-result v3

    .line 2128
    packed-switch v3, :pswitch_data_1

    .line 2129
    .line 2130
    .line 2131
    sget-object v3, La/hea;->f:La/hea;

    .line 2132
    .line 2133
    :goto_48
    move-object/from16 v26, v3

    .line 2134
    .line 2135
    goto :goto_49

    .line 2136
    :pswitch_7
    sget-object v3, La/hea;->e:La/hea;

    .line 2137
    .line 2138
    goto :goto_48

    .line 2139
    :pswitch_8
    sget-object v3, La/hea;->b:La/hea;

    .line 2140
    .line 2141
    goto :goto_48

    .line 2142
    :pswitch_9
    sget-object v3, La/hea;->a:La/hea;

    .line 2143
    .line 2144
    goto :goto_48

    .line 2145
    :pswitch_a
    sget-object v3, La/hea;->d:La/hea;

    .line 2146
    .line 2147
    goto :goto_48

    .line 2148
    :pswitch_b
    sget-object v3, La/hea;->c:La/hea;

    .line 2149
    .line 2150
    goto :goto_48

    .line 2151
    :goto_49
    if-eq v4, v2, :cond_45

    .line 2152
    .line 2153
    sget-object v3, La/uea;->f:La/uea;

    .line 2154
    .line 2155
    if-eq v4, v3, :cond_45

    .line 2156
    .line 2157
    sget-object v3, La/uea;->g:La/uea;

    .line 2158
    .line 2159
    if-ne v4, v3, :cond_44

    .line 2160
    .line 2161
    goto :goto_4a

    .line 2162
    :cond_44
    move/from16 v25, v11

    .line 2163
    .line 2164
    goto :goto_4b

    .line 2165
    :cond_45
    :goto_4a
    move/from16 v25, v15

    .line 2166
    .line 2167
    :goto_4b
    new-instance v21, La/nea;

    .line 2168
    .line 2169
    move-object/from16 v22, v1

    .line 2170
    .line 2171
    invoke-direct/range {v21 .. v26}, La/nea;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/hea;)V

    .line 2172
    .line 2173
    .line 2174
    move-object/from16 v1, v21

    .line 2175
    .line 2176
    new-instance v23, La/iea;

    .line 2177
    .line 2178
    const v3, 0x7f08031f

    .line 2179
    .line 2180
    .line 2181
    if-eq v7, v3, :cond_46

    .line 2182
    .line 2183
    move/from16 v26, v15

    .line 2184
    .line 2185
    goto :goto_4c

    .line 2186
    :cond_46
    move/from16 v26, v11

    .line 2187
    .line 2188
    :goto_4c
    if-eq v5, v3, :cond_47

    .line 2189
    .line 2190
    move/from16 v27, v15

    .line 2191
    .line 2192
    goto :goto_4d

    .line 2193
    :cond_47
    move/from16 v27, v11

    .line 2194
    .line 2195
    :goto_4d
    if-eq v4, v2, :cond_49

    .line 2196
    .line 2197
    sget-object v2, La/uea;->f:La/uea;

    .line 2198
    .line 2199
    if-eq v4, v2, :cond_49

    .line 2200
    .line 2201
    sget-object v2, La/uea;->g:La/uea;

    .line 2202
    .line 2203
    if-ne v4, v2, :cond_48

    .line 2204
    .line 2205
    goto :goto_4f

    .line 2206
    :cond_48
    move/from16 v28, v11

    .line 2207
    .line 2208
    :goto_4e
    move/from16 v25, v5

    .line 2209
    .line 2210
    move/from16 v24, v7

    .line 2211
    .line 2212
    goto :goto_50

    .line 2213
    :cond_49
    :goto_4f
    move/from16 v28, v15

    .line 2214
    .line 2215
    goto :goto_4e

    .line 2216
    :goto_50
    invoke-direct/range {v23 .. v28}, La/iea;-><init>(IIZZZ)V

    .line 2217
    .line 2218
    .line 2219
    move-object/from16 v2, v23

    .line 2220
    .line 2221
    new-instance v3, La/lea;

    .line 2222
    .line 2223
    invoke-direct {v3, v8, v0, v2, v1}, La/lea;-><init>(Ljava/lang/String;La/jea;La/iea;La/nea;)V

    .line 2224
    .line 2225
    .line 2226
    new-instance v0, La/ifa;

    .line 2227
    .line 2228
    move-object/from16 v2, p5

    .line 2229
    .line 2230
    check-cast v2, La/uh90;

    .line 2231
    .line 2232
    move-object/from16 p1, v0

    .line 2233
    .line 2234
    move-object/from16 p4, v2

    .line 2235
    .line 2236
    move-object/from16 p6, v3

    .line 2237
    .line 2238
    move-object/from16 p3, v12

    .line 2239
    .line 2240
    move-object/from16 p2, v16

    .line 2241
    .line 2242
    move-object/from16 p5, v19

    .line 2243
    .line 2244
    invoke-direct/range {p1 .. p6}, La/ifa;-><init>(La/boo0;La/hfa;La/uh90;La/i4;La/lea;)V

    .line 2245
    .line 2246
    .line 2247
    move-object/from16 v0, p0

    .line 2248
    .line 2249
    move-object/from16 v1, p1

    .line 2250
    .line 2251
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2252
    .line 2253
    .line 2254
    return-void

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

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method
