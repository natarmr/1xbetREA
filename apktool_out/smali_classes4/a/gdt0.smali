.class public final synthetic La/gdt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ej1;


# direct methods
.method public synthetic constructor <init>(La/ej1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gdt0;->a:B

    iput-object p1, p0, La/gdt0;->b:La/ej1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/d1s0;

    .line 4
    .line 5
    if-eqz v0, :cond_f

    .line 6
    .line 7
    move-object/from16 v2, p0

    .line 8
    .line 9
    iget-object v2, v2, La/gdt0;->b:La/ej1;

    .line 10
    .line 11
    iget-object v2, v2, La/ej1;->b:La/ctf0;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    instance-of v3, v0, La/b1s0;

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    const/4 v6, 0x0

    .line 20
    if-eqz v3, :cond_d

    .line 21
    .line 22
    check-cast v0, La/b1s0;

    .line 23
    .line 24
    iget-object v0, v0, La/b1s0;->a:La/h2s0;

    .line 25
    .line 26
    iget-object v0, v0, La/h2s0;->c:Ljava/util/List;

    .line 27
    .line 28
    new-instance v3, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    move-object v8, v7

    .line 48
    check-cast v8, La/a2s0;

    .line 49
    .line 50
    iget-object v8, v8, La/a2s0;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-lez v8, :cond_0

    .line 57
    .line 58
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_3

    .line 76
    .line 77
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    move-object v8, v7

    .line 82
    check-cast v8, La/a2s0;

    .line 83
    .line 84
    iget v9, v8, La/a2s0;->e:I

    .line 85
    .line 86
    if-nez v9, :cond_2

    .line 87
    .line 88
    iget v9, v8, La/a2s0;->g:I

    .line 89
    .line 90
    if-nez v9, :cond_2

    .line 91
    .line 92
    iget v9, v8, La/a2s0;->h:I

    .line 93
    .line 94
    if-nez v9, :cond_2

    .line 95
    .line 96
    iget v9, v8, La/a2s0;->i:I

    .line 97
    .line 98
    if-nez v9, :cond_2

    .line 99
    .line 100
    iget v8, v8, La/a2s0;->j:F

    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    cmpg-float v8, v8, v9

    .line 104
    .line 105
    if-nez v8, :cond_2

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_4

    .line 117
    .line 118
    move/from16 v21, v5

    .line 119
    .line 120
    move/from16 p0, v6

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :cond_4
    const/4 v3, 0x5

    .line 126
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-instance v7, La/q9m;

    .line 131
    .line 132
    new-array v8, v6, [Ljava/lang/Object;

    .line 133
    .line 134
    iget-object v9, v2, La/ctf0;->b:La/lsm0;

    .line 135
    .line 136
    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    const v10, 0x7f130e4e

    .line 141
    .line 142
    .line 143
    invoke-virtual {v9, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    new-array v10, v6, [Ljava/lang/Object;

    .line 148
    .line 149
    invoke-static {v10, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    const v11, 0x7f130400

    .line 154
    .line 155
    .line 156
    invoke-virtual {v9, v11, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    new-array v11, v6, [Ljava/lang/Object;

    .line 161
    .line 162
    invoke-static {v11, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    const v12, 0x7f130613

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    new-array v11, v6, [Ljava/lang/Object;

    .line 174
    .line 175
    invoke-static {v11, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    const v12, 0x7f13060c

    .line 180
    .line 181
    .line 182
    invoke-virtual {v9, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    new-array v11, v6, [Ljava/lang/Object;

    .line 187
    .line 188
    invoke-static {v11, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    const v12, 0x7f1305c6

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    new-array v11, v6, [Ljava/lang/Object;

    .line 200
    .line 201
    invoke-static {v11, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    const v12, 0x7f13062a

    .line 206
    .line 207
    .line 208
    invoke-virtual {v9, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v16

    .line 212
    new-array v11, v6, [Ljava/lang/Object;

    .line 213
    .line 214
    invoke-static {v11, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    const v12, 0x7f130606

    .line 219
    .line 220
    .line 221
    invoke-virtual {v9, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v17

    .line 225
    new-array v11, v6, [Ljava/lang/Object;

    .line 226
    .line 227
    invoke-static {v11, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v11

    .line 231
    const v12, 0x7f13062d

    .line 232
    .line 233
    .line 234
    invoke-virtual {v9, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v18

    .line 238
    filled-new-array/range {v13 .. v18}, [Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    invoke-static {v9}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    invoke-direct {v7, v9, v8, v10}, La/q9m;-><init>(La/i4;Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    new-instance v8, Ljava/util/ArrayList;

    .line 250
    .line 251
    const/16 v9, 0xa

    .line 252
    .line 253
    invoke-static {v0, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    move v9, v6

    .line 265
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    if-eqz v10, :cond_c

    .line 270
    .line 271
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    add-int/lit8 v11, v9, 0x1

    .line 276
    .line 277
    if-ltz v9, :cond_b

    .line 278
    .line 279
    check-cast v10, La/a2s0;

    .line 280
    .line 281
    new-instance v12, La/fam;

    .line 282
    .line 283
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v13

    .line 287
    new-instance v14, La/n0x;

    .line 288
    .line 289
    iget-object v9, v10, La/a2s0;->b:Ljava/lang/String;

    .line 290
    .line 291
    invoke-static {v9}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    invoke-direct {v14, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    sget-object v15, La/ut90;->d:La/ut90;

    .line 299
    .line 300
    iget-object v9, v10, La/a2s0;->a:Ljava/lang/String;

    .line 301
    .line 302
    move/from16 p0, v6

    .line 303
    .line 304
    new-instance v6, La/gam;

    .line 305
    .line 306
    const/16 p1, 0x0

    .line 307
    .line 308
    new-instance v1, La/m0x;

    .line 309
    .line 310
    iget-object v3, v10, La/a2s0;->f:La/b2s0;

    .line 311
    .line 312
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    const/4 v4, 0x3

    .line 317
    if-eqz v3, :cond_a

    .line 318
    .line 319
    if-eq v3, v5, :cond_9

    .line 320
    .line 321
    move/from16 v21, v5

    .line 322
    .line 323
    const/4 v5, 0x2

    .line 324
    if-eq v3, v5, :cond_8

    .line 325
    .line 326
    if-eq v3, v4, :cond_7

    .line 327
    .line 328
    const/4 v5, 0x4

    .line 329
    if-eq v3, v5, :cond_6

    .line 330
    .line 331
    const/4 v5, 0x5

    .line 332
    if-ne v3, v5, :cond_5

    .line 333
    .line 334
    const v3, 0x7f080d62

    .line 335
    .line 336
    .line 337
    goto :goto_3

    .line 338
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 339
    .line 340
    .line 341
    return-object p1

    .line 342
    :cond_6
    const v3, 0x7f080d5d

    .line 343
    .line 344
    .line 345
    goto :goto_3

    .line 346
    :cond_7
    const v3, 0x7f080d5e

    .line 347
    .line 348
    .line 349
    goto :goto_3

    .line 350
    :cond_8
    const v3, 0x7f080d5f

    .line 351
    .line 352
    .line 353
    goto :goto_3

    .line 354
    :cond_9
    move/from16 v21, v5

    .line 355
    .line 356
    const v3, 0x7f080d61

    .line 357
    .line 358
    .line 359
    goto :goto_3

    .line 360
    :cond_a
    move/from16 v21, v5

    .line 361
    .line 362
    const v3, 0x7f080d60

    .line 363
    .line 364
    .line 365
    :goto_3
    const/4 v5, 0x6

    .line 366
    move/from16 v17, v4

    .line 367
    .line 368
    move-object/from16 v4, p1

    .line 369
    .line 370
    invoke-direct {v1, v3, v4, v5}, La/m0x;-><init>(ILa/bzw;I)V

    .line 371
    .line 372
    .line 373
    sget-object v3, La/ut90;->c:La/ut90;

    .line 374
    .line 375
    invoke-direct {v6, v1, v3}, La/gam;-><init>(La/m0x;La/ut90;)V

    .line 376
    .line 377
    .line 378
    new-instance v1, La/ham;

    .line 379
    .line 380
    iget v3, v10, La/a2s0;->e:I

    .line 381
    .line 382
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    invoke-direct {v1, v3}, La/ham;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    new-instance v3, La/ham;

    .line 390
    .line 391
    iget v4, v10, La/a2s0;->g:I

    .line 392
    .line 393
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    invoke-direct {v3, v4}, La/ham;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    new-instance v4, La/ham;

    .line 401
    .line 402
    iget v5, v10, La/a2s0;->h:I

    .line 403
    .line 404
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    invoke-direct {v4, v5}, La/ham;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    new-instance v5, La/ham;

    .line 412
    .line 413
    move-object/from16 v22, v0

    .line 414
    .line 415
    iget v0, v10, La/a2s0;->i:I

    .line 416
    .line 417
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-direct {v5, v0}, La/ham;-><init>(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    new-instance v0, La/ham;

    .line 425
    .line 426
    iget v10, v10, La/a2s0;->j:F

    .line 427
    .line 428
    invoke-static {v10}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v10

    .line 432
    invoke-direct {v0, v10}, La/ham;-><init>(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    const/4 v10, 0x6

    .line 436
    new-array v10, v10, [La/iam;

    .line 437
    .line 438
    aput-object v6, v10, p0

    .line 439
    .line 440
    aput-object v1, v10, v21

    .line 441
    .line 442
    const/16 v20, 0x2

    .line 443
    .line 444
    aput-object v3, v10, v20

    .line 445
    .line 446
    aput-object v4, v10, v17

    .line 447
    .line 448
    const/16 v16, 0x4

    .line 449
    .line 450
    aput-object v5, v10, v16

    .line 451
    .line 452
    const/16 v19, 0x5

    .line 453
    .line 454
    aput-object v0, v10, v19

    .line 455
    .line 456
    invoke-static {v10}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 457
    .line 458
    .line 459
    move-result-object v18

    .line 460
    sget-object v16, La/qt90;->a:La/qt90;

    .line 461
    .line 462
    move-object/from16 v17, v9

    .line 463
    .line 464
    invoke-direct/range {v12 .. v18}, La/fam;-><init>(Ljava/lang/String;La/n0x;La/ut90;La/tt90;Ljava/lang/String;La/i4;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move/from16 v6, p0

    .line 471
    .line 472
    move v9, v11

    .line 473
    move/from16 v3, v19

    .line 474
    .line 475
    move/from16 v5, v21

    .line 476
    .line 477
    move-object/from16 v0, v22

    .line 478
    .line 479
    goto/16 :goto_2

    .line 480
    .line 481
    :cond_b
    invoke-static {}, La/q3d;->p()V

    .line 482
    .line 483
    .line 484
    const/4 v4, 0x0

    .line 485
    throw v4

    .line 486
    :cond_c
    move/from16 v21, v5

    .line 487
    .line 488
    move/from16 p0, v6

    .line 489
    .line 490
    const/4 v4, 0x0

    .line 491
    invoke-static {v8}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    new-instance v1, La/jam;

    .line 496
    .line 497
    const/16 v3, 0xc

    .line 498
    .line 499
    invoke-direct {v1, v7, v0, v4, v3}, La/jam;-><init>(La/s9m;La/a4x;Ljava/lang/String;I)V

    .line 500
    .line 501
    .line 502
    goto :goto_4

    .line 503
    :cond_d
    move/from16 v21, v5

    .line 504
    .line 505
    move/from16 p0, v6

    .line 506
    .line 507
    const/4 v4, 0x0

    .line 508
    move-object v1, v4

    .line 509
    :goto_4
    if-nez v1, :cond_e

    .line 510
    .line 511
    sget-object v0, La/iun;->a:La/iun;

    .line 512
    .line 513
    :goto_5
    move-object v1, v0

    .line 514
    goto :goto_6

    .line 515
    :cond_e
    new-instance v0, La/l9t0;

    .line 516
    .line 517
    new-instance v3, La/hjm;

    .line 518
    .line 519
    move/from16 v4, p0

    .line 520
    .line 521
    new-array v5, v4, [Ljava/lang/Object;

    .line 522
    .line 523
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 524
    .line 525
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v5

    .line 529
    const v4, 0x7f130fc3

    .line 530
    .line 531
    .line 532
    invoke-virtual {v2, v4, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    const/4 v15, 0x0

    .line 537
    const/16 v16, 0x1ffe

    .line 538
    .line 539
    const/4 v5, 0x0

    .line 540
    const/4 v6, 0x0

    .line 541
    const/4 v7, 0x0

    .line 542
    const/4 v8, 0x0

    .line 543
    const/4 v9, 0x0

    .line 544
    const/4 v10, 0x0

    .line 545
    const/4 v11, 0x0

    .line 546
    const/4 v12, 0x0

    .line 547
    const/4 v13, 0x0

    .line 548
    const/4 v14, 0x0

    .line 549
    invoke-direct/range {v3 .. v16}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 550
    .line 551
    .line 552
    const-string v2, "HEADER_POPULAR_CHAMPIONS"

    .line 553
    .line 554
    invoke-direct {v0, v2, v3}, La/l9t0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 555
    .line 556
    .line 557
    new-instance v2, La/kdt0;

    .line 558
    .line 559
    const-string v3, "POPULAR_CHAMPIONS"

    .line 560
    .line 561
    invoke-direct {v2, v3, v1}, La/kdt0;-><init>(Ljava/lang/String;La/jam;)V

    .line 562
    .line 563
    .line 564
    const/4 v5, 0x2

    .line 565
    new-array v1, v5, [La/p6t0;

    .line 566
    .line 567
    const/4 v4, 0x0

    .line 568
    aput-object v0, v1, v4

    .line 569
    .line 570
    aput-object v2, v1, v21

    .line 571
    .line 572
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    goto :goto_5

    .line 577
    :cond_f
    const/4 v4, 0x0

    .line 578
    move-object v1, v4

    .line 579
    :goto_6
    if-nez v1, :cond_10

    .line 580
    .line 581
    sget-object v0, La/iun;->a:La/iun;

    .line 582
    .line 583
    return-object v0

    .line 584
    :cond_10
    return-object v1
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/j0g0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    instance-of v2, v0, La/g0g0;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :cond_0
    check-cast v0, La/fn9;

    .line 16
    .line 17
    if-eqz v0, :cond_7

    .line 18
    .line 19
    move-object/from16 v2, p0

    .line 20
    .line 21
    iget-object v2, v2, La/gdt0;->b:La/ej1;

    .line 22
    .line 23
    iget-object v2, v2, La/ej1;->b:La/ctf0;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, La/fn9;->v:Ljava/util/List;

    .line 29
    .line 30
    new-instance v3, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    move-object v5, v4

    .line 50
    check-cast v5, La/pm9;

    .line 51
    .line 52
    iget-object v5, v5, La/pm9;->a:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-lez v5, :cond_1

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const/4 v4, 0x0

    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    goto/16 :goto_2

    .line 72
    .line 73
    :cond_3
    const/4 v0, 0x5

    .line 74
    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    new-instance v3, La/q9m;

    .line 79
    .line 80
    new-array v5, v4, [Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v6, v2, La/ctf0;->b:La/lsm0;

    .line 83
    .line 84
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    const v7, 0x7f130e4e

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    new-array v7, v4, [Ljava/lang/Object;

    .line 96
    .line 97
    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    const v8, 0x7f13158e

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    new-array v8, v4, [Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {v8, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    const v9, 0x7f13062d

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    new-array v9, v4, [Ljava/lang/Object;

    .line 122
    .line 123
    invoke-static {v9, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    const v10, 0x7f13060f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    new-array v10, v4, [Ljava/lang/Object;

    .line 135
    .line 136
    invoke-static {v10, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    const v11, 0x7f1305c8

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6, v11, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    filled-new-array {v8, v9, v6}, [Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    invoke-static {v6}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-direct {v3, v6, v5, v7}, La/q9m;-><init>(La/i4;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    new-instance v5, Ljava/util/ArrayList;

    .line 159
    .line 160
    const/16 v6, 0xa

    .line 161
    .line 162
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    move v6, v4

    .line 174
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_5

    .line 179
    .line 180
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    add-int/lit8 v8, v6, 0x1

    .line 185
    .line 186
    if-ltz v6, :cond_4

    .line 187
    .line 188
    check-cast v7, La/pm9;

    .line 189
    .line 190
    new-instance v9, La/fam;

    .line 191
    .line 192
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    new-instance v11, La/n0x;

    .line 197
    .line 198
    iget-object v6, v7, La/pm9;->b:Ljava/lang/String;

    .line 199
    .line 200
    invoke-static {v6}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-direct {v11, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    sget-object v12, La/ut90;->e:La/ut90;

    .line 208
    .line 209
    iget-object v14, v7, La/pm9;->a:Ljava/lang/String;

    .line 210
    .line 211
    new-instance v6, La/ham;

    .line 212
    .line 213
    iget v13, v7, La/pm9;->c:F

    .line 214
    .line 215
    float-to-int v13, v13

    .line 216
    const-string v15, "%"

    .line 217
    .line 218
    invoke-static {v13, v15}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v13

    .line 222
    invoke-direct {v6, v13}, La/ham;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    new-instance v13, La/ham;

    .line 226
    .line 227
    iget v4, v7, La/pm9;->d:F

    .line 228
    .line 229
    float-to-int v4, v4

    .line 230
    invoke-static {v4, v15}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-direct {v13, v4}, La/ham;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    new-instance v4, La/ham;

    .line 238
    .line 239
    iget v7, v7, La/pm9;->e:F

    .line 240
    .line 241
    float-to-int v7, v7

    .line 242
    invoke-static {v7, v15}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    invoke-direct {v4, v7}, La/ham;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    filled-new-array {v6, v13, v4}, [La/ham;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-static {v4}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 254
    .line 255
    .line 256
    move-result-object v15

    .line 257
    sget-object v13, La/qt90;->a:La/qt90;

    .line 258
    .line 259
    invoke-direct/range {v9 .. v15}, La/fam;-><init>(Ljava/lang/String;La/n0x;La/ut90;La/tt90;Ljava/lang/String;La/i4;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move v6, v8

    .line 266
    const/4 v4, 0x0

    .line 267
    goto :goto_1

    .line 268
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 269
    .line 270
    .line 271
    throw v1

    .line 272
    :cond_5
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    new-instance v4, La/jam;

    .line 277
    .line 278
    const/16 v5, 0xc

    .line 279
    .line 280
    invoke-direct {v4, v3, v0, v1, v5}, La/jam;-><init>(La/s9m;La/a4x;Ljava/lang/String;I)V

    .line 281
    .line 282
    .line 283
    move-object v1, v4

    .line 284
    :goto_2
    if-nez v1, :cond_6

    .line 285
    .line 286
    sget-object v0, La/iun;->a:La/iun;

    .line 287
    .line 288
    :goto_3
    move-object v1, v0

    .line 289
    goto :goto_4

    .line 290
    :cond_6
    new-instance v0, La/l9t0;

    .line 291
    .line 292
    new-instance v3, La/hjm;

    .line 293
    .line 294
    const/4 v4, 0x0

    .line 295
    new-array v5, v4, [Ljava/lang/Object;

    .line 296
    .line 297
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 298
    .line 299
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    const v4, 0x7f130fd1

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v4, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    const/4 v15, 0x0

    .line 311
    const/16 v16, 0x1ffe

    .line 312
    .line 313
    const/4 v5, 0x0

    .line 314
    const/4 v6, 0x0

    .line 315
    const/4 v7, 0x0

    .line 316
    const/4 v8, 0x0

    .line 317
    const/4 v9, 0x0

    .line 318
    const/4 v10, 0x0

    .line 319
    const/4 v11, 0x0

    .line 320
    const/4 v12, 0x0

    .line 321
    const/4 v13, 0x0

    .line 322
    const/4 v14, 0x0

    .line 323
    invoke-direct/range {v3 .. v16}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 324
    .line 325
    .line 326
    const-string v2, "HEADER_POPULAR_HEROES"

    .line 327
    .line 328
    invoke-direct {v0, v2, v3}, La/l9t0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 329
    .line 330
    .line 331
    new-instance v2, La/kdt0;

    .line 332
    .line 333
    const-string v3, "POPULAR_HEROES"

    .line 334
    .line 335
    invoke-direct {v2, v3, v1}, La/kdt0;-><init>(Ljava/lang/String;La/jam;)V

    .line 336
    .line 337
    .line 338
    const/4 v1, 0x2

    .line 339
    new-array v1, v1, [La/p6t0;

    .line 340
    .line 341
    const/4 v4, 0x0

    .line 342
    aput-object v0, v1, v4

    .line 343
    .line 344
    const/4 v0, 0x1

    .line 345
    aput-object v2, v1, v0

    .line 346
    .line 347
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    goto :goto_3

    .line 352
    :cond_7
    :goto_4
    if-nez v1, :cond_8

    .line 353
    .line 354
    sget-object v0, La/iun;->a:La/iun;

    .line 355
    .line 356
    return-object v0

    .line 357
    :cond_8
    return-object v1
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/d1s0;

    .line 4
    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    iget-object v1, v1, La/gdt0;->b:La/ej1;

    .line 8
    .line 9
    iget-object v1, v1, La/ej1;->b:La/ctf0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    sget-object v0, La/iun;->a:La/iun;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    instance-of v2, v0, La/z0s0;

    .line 20
    .line 21
    const-string v3, "%"

    .line 22
    .line 23
    const-string v7, "MAP_STATISTIC"

    .line 24
    .line 25
    const-string v10, "/"

    .line 26
    .line 27
    const-string v11, "https://"

    .line 28
    .line 29
    const-string v13, ".png"

    .line 30
    .line 31
    const/16 v14, 0xa

    .line 32
    .line 33
    if-eqz v2, :cond_1d

    .line 34
    .line 35
    check-cast v0, La/z0s0;

    .line 36
    .line 37
    iget-object v0, v0, La/z0s0;->a:Ljava/util/ArrayList;

    .line 38
    .line 39
    new-instance v2, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v15

    .line 52
    if-eqz v15, :cond_1

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v15

    .line 58
    check-cast v15, La/f0s0;

    .line 59
    .line 60
    iget-object v15, v15, La/f0s0;->c:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v2, v15}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v15

    .line 79
    if-eqz v15, :cond_3

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v15

    .line 85
    move-object v5, v15

    .line 86
    check-cast v5, La/b0s0;

    .line 87
    .line 88
    iget-object v5, v5, La/b0s0;->a:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-lez v5, :cond_2

    .line 95
    .line 96
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_5

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    move-object v15, v5

    .line 120
    check-cast v15, La/b0s0;

    .line 121
    .line 122
    iget-object v15, v15, La/b0s0;->a:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v2, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v16

    .line 128
    if-nez v16, :cond_4

    .line 129
    .line 130
    new-instance v8, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-interface {v2, v15, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-object/from16 v16, v8

    .line 139
    .line 140
    :cond_4
    move-object/from16 v8, v16

    .line 141
    .line 142
    check-cast v8, Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    const/4 v8, -0x1

    .line 170
    if-eqz v5, :cond_11

    .line 171
    .line 172
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    check-cast v5, Ljava/util/Map$Entry;

    .line 177
    .line 178
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v15

    .line 182
    check-cast v15, Ljava/lang/String;

    .line 183
    .line 184
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    check-cast v5, Ljava/util/List;

    .line 189
    .line 190
    if-eqz v5, :cond_6

    .line 191
    .line 192
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 193
    .line 194
    .line 195
    move-result v16

    .line 196
    if-eqz v16, :cond_6

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_6
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v16

    .line 203
    :cond_7
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v17

    .line 207
    if-eqz v17, :cond_8

    .line 208
    .line 209
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v17

    .line 213
    move-object/from16 v9, v17

    .line 214
    .line 215
    check-cast v9, La/b0s0;

    .line 216
    .line 217
    iget v9, v9, La/b0s0;->b:I

    .line 218
    .line 219
    if-ne v9, v8, :cond_7

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_8
    :goto_4
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    if-eqz v9, :cond_9

    .line 227
    .line 228
    :goto_5
    move v4, v8

    .line 229
    goto :goto_7

    .line 230
    :cond_9
    new-instance v9, Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-static {v5, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 237
    .line 238
    .line 239
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v17

    .line 247
    if-eqz v17, :cond_a

    .line 248
    .line 249
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v17

    .line 253
    move-object/from16 v12, v17

    .line 254
    .line 255
    check-cast v12, La/b0s0;

    .line 256
    .line 257
    iget v12, v12, La/b0s0;->b:I

    .line 258
    .line 259
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object v12

    .line 263
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_a
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->J(Ljava/util/ArrayList;)D

    .line 268
    .line 269
    .line 270
    move-result-wide v20

    .line 271
    invoke-static/range {v20 .. v21}, La/si30;->a(D)I

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    :goto_7
    if-eqz v5, :cond_b

    .line 276
    .line 277
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 278
    .line 279
    .line 280
    move-result v9

    .line 281
    if-eqz v9, :cond_b

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_b
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 285
    .line 286
    .line 287
    move-result-object v9

    .line 288
    :cond_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v12

    .line 292
    if-eqz v12, :cond_d

    .line 293
    .line 294
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v12

    .line 298
    check-cast v12, La/b0s0;

    .line 299
    .line 300
    iget v12, v12, La/b0s0;->c:I

    .line 301
    .line 302
    if-ne v12, v8, :cond_c

    .line 303
    .line 304
    goto :goto_a

    .line 305
    :cond_d
    :goto_8
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-eqz v9, :cond_e

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_e
    new-instance v8, Ljava/util/ArrayList;

    .line 313
    .line 314
    invoke-static {v5, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 319
    .line 320
    .line 321
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    .line 327
    .line 328
    move-result v12

    .line 329
    if-eqz v12, :cond_f

    .line 330
    .line 331
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v12

    .line 335
    check-cast v12, La/b0s0;

    .line 336
    .line 337
    iget v12, v12, La/b0s0;->c:I

    .line 338
    .line 339
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 340
    .line 341
    .line 342
    move-result-object v12

    .line 343
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    goto :goto_9

    .line 347
    :cond_f
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->J(Ljava/util/ArrayList;)D

    .line 348
    .line 349
    .line 350
    move-result-wide v8

    .line 351
    invoke-static {v8, v9}, La/si30;->a(D)I

    .line 352
    .line 353
    .line 354
    move-result v8

    .line 355
    :goto_a
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    const/4 v9, 0x0

    .line 360
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 361
    .line 362
    .line 363
    move-result v12

    .line 364
    if-eqz v12, :cond_10

    .line 365
    .line 366
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v12

    .line 370
    check-cast v12, La/b0s0;

    .line 371
    .line 372
    iget v12, v12, La/b0s0;->d:I

    .line 373
    .line 374
    add-int/2addr v9, v12

    .line 375
    goto :goto_b

    .line 376
    :cond_10
    new-instance v5, La/b0s0;

    .line 377
    .line 378
    invoke-direct {v5, v4, v8, v9, v15}, La/b0s0;-><init>(IIILjava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    goto/16 :goto_3

    .line 385
    .line 386
    :cond_11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    if-eqz v2, :cond_12

    .line 391
    .line 392
    :goto_c
    const/4 v2, 0x0

    .line 393
    :goto_d
    const/4 v14, 0x0

    .line 394
    goto/16 :goto_24

    .line 395
    .line 396
    :cond_12
    new-instance v2, Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-static {v0, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    const/4 v4, 0x0

    .line 410
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    if-eqz v5, :cond_1c

    .line 415
    .line 416
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    add-int/lit8 v9, v4, 0x1

    .line 421
    .line 422
    if-ltz v4, :cond_1b

    .line 423
    .line 424
    check-cast v5, La/b0s0;

    .line 425
    .line 426
    new-instance v20, La/l5h;

    .line 427
    .line 428
    invoke-static {v4, v7}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v21

    .line 432
    new-instance v4, La/n0x;

    .line 433
    .line 434
    new-instance v12, Ljava/lang/StringBuilder;

    .line 435
    .line 436
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 437
    .line 438
    invoke-direct {v12, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    iget-object v14, v5, La/b0s0;->a:Ljava/lang/String;

    .line 442
    .line 443
    iget v15, v5, La/b0s0;->c:I

    .line 444
    .line 445
    iget v8, v5, La/b0s0;->b:I

    .line 446
    .line 447
    const-string v6, "static/img/ImgDefault/Esports/CS/Maps_Stat/WinRate/Vertical/mob/"

    .line 448
    .line 449
    invoke-static {v6, v14, v13}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 454
    .line 455
    .line 456
    move-result v14

    .line 457
    if-nez v14, :cond_13

    .line 458
    .line 459
    const/4 v14, 0x0

    .line 460
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 461
    .line 462
    .line 463
    move-object/from16 v34, v0

    .line 464
    .line 465
    goto :goto_11

    .line 466
    :cond_13
    move-object/from16 v34, v0

    .line 467
    .line 468
    const/4 v14, 0x0

    .line 469
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 470
    .line 471
    invoke-static {v6, v0, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    if-nez v0, :cond_16

    .line 476
    .line 477
    invoke-static {v6, v11, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    if-eqz v0, :cond_14

    .line 482
    .line 483
    const/4 v14, 0x0

    .line 484
    goto :goto_10

    .line 485
    :cond_14
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    if-lez v0, :cond_15

    .line 490
    .line 491
    invoke-static {v12, v10}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    if-nez v0, :cond_15

    .line 496
    .line 497
    const/16 v0, 0x2f

    .line 498
    .line 499
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    move/from16 v19, v0

    .line 503
    .line 504
    const/4 v14, 0x1

    .line 505
    goto :goto_f

    .line 506
    :cond_15
    const/4 v14, 0x1

    .line 507
    const/16 v19, 0x2f

    .line 508
    .line 509
    :goto_f
    new-array v0, v14, [C

    .line 510
    .line 511
    const/4 v14, 0x0

    .line 512
    aput-char v19, v0, v14

    .line 513
    .line 514
    invoke-static {v6, v0}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    goto :goto_11

    .line 522
    :cond_16
    :goto_10
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    :goto_11
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-direct {v4, v0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    iget-object v0, v5, La/b0s0;->a:Ljava/lang/String;

    .line 536
    .line 537
    iget v5, v5, La/b0s0;->d:I

    .line 538
    .line 539
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 540
    .line 541
    .line 542
    move-result-object v5

    .line 543
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v5

    .line 547
    iget-object v6, v1, La/ctf0;->b:La/lsm0;

    .line 548
    .line 549
    const/4 v14, 0x1

    .line 550
    invoke-static {v5, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    const v12, 0x7f1316f9

    .line 555
    .line 556
    .line 557
    invoke-virtual {v6, v12, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v24

    .line 561
    new-instance v5, La/m0x;

    .line 562
    .line 563
    const v6, 0x7f080883

    .line 564
    .line 565
    .line 566
    const/4 v12, 0x6

    .line 567
    const/4 v14, 0x0

    .line 568
    invoke-direct {v5, v6, v14, v12}, La/m0x;-><init>(ILa/bzw;I)V

    .line 569
    .line 570
    .line 571
    const-string v6, "-"

    .line 572
    .line 573
    const/4 v12, -0x1

    .line 574
    if-ne v8, v12, :cond_17

    .line 575
    .line 576
    move-object/from16 v26, v6

    .line 577
    .line 578
    goto :goto_12

    .line 579
    :cond_17
    invoke-static {v8, v3}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v12

    .line 583
    move-object/from16 v26, v12

    .line 584
    .line 585
    :goto_12
    if-le v8, v15, :cond_18

    .line 586
    .line 587
    sget-wide v22, La/ijg;->J0:J

    .line 588
    .line 589
    :goto_13
    move-wide/from16 v27, v22

    .line 590
    .line 591
    goto :goto_14

    .line 592
    :cond_18
    sget-object v12, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 593
    .line 594
    invoke-virtual {v12}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 595
    .line 596
    .line 597
    move-result-wide v22

    .line 598
    goto :goto_13

    .line 599
    :goto_14
    new-instance v12, La/m0x;

    .line 600
    .line 601
    const v14, 0x7f0808b0

    .line 602
    .line 603
    .line 604
    move-object/from16 v23, v0

    .line 605
    .line 606
    move-object/from16 v22, v4

    .line 607
    .line 608
    const/4 v0, 0x6

    .line 609
    const/4 v4, 0x0

    .line 610
    invoke-direct {v12, v14, v4, v0}, La/m0x;-><init>(ILa/bzw;I)V

    .line 611
    .line 612
    .line 613
    const/4 v0, -0x1

    .line 614
    if-ne v15, v0, :cond_19

    .line 615
    .line 616
    :goto_15
    move-object/from16 v30, v6

    .line 617
    .line 618
    goto :goto_16

    .line 619
    :cond_19
    invoke-static {v15, v3}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v6

    .line 623
    goto :goto_15

    .line 624
    :goto_16
    if-le v15, v8, :cond_1a

    .line 625
    .line 626
    sget-wide v14, La/ijg;->S:J

    .line 627
    .line 628
    :goto_17
    move-object/from16 v25, v5

    .line 629
    .line 630
    move-object/from16 v29, v12

    .line 631
    .line 632
    move-wide/from16 v31, v14

    .line 633
    .line 634
    goto :goto_18

    .line 635
    :cond_1a
    sget-object v4, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 636
    .line 637
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 638
    .line 639
    .line 640
    move-result-wide v14

    .line 641
    goto :goto_17

    .line 642
    :goto_18
    invoke-direct/range {v20 .. v32}, La/l5h;-><init>(Ljava/lang/String;La/n0x;Ljava/lang/String;Ljava/lang/String;La/m0x;Ljava/lang/String;JLa/m0x;Ljava/lang/String;J)V

    .line 643
    .line 644
    .line 645
    move-object/from16 v4, v20

    .line 646
    .line 647
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    move v8, v0

    .line 651
    move v4, v9

    .line 652
    move-object/from16 v0, v34

    .line 653
    .line 654
    goto/16 :goto_e

    .line 655
    .line 656
    :cond_1b
    invoke-static {}, La/q3d;->p()V

    .line 657
    .line 658
    .line 659
    const/4 v14, 0x0

    .line 660
    throw v14

    .line 661
    :cond_1c
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    new-instance v2, La/m5h;

    .line 666
    .line 667
    invoke-direct {v2, v0}, La/m5h;-><init>(La/a4x;)V

    .line 668
    .line 669
    .line 670
    goto/16 :goto_d

    .line 671
    .line 672
    :cond_1d
    instance-of v2, v0, La/c1s0;

    .line 673
    .line 674
    if-eqz v2, :cond_2a

    .line 675
    .line 676
    check-cast v0, La/c1s0;

    .line 677
    .line 678
    iget-object v0, v0, La/c1s0;->a:La/t8s0;

    .line 679
    .line 680
    iget-object v0, v0, La/t8s0;->b:Ljava/util/List;

    .line 681
    .line 682
    new-instance v2, Ljava/util/ArrayList;

    .line 683
    .line 684
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 685
    .line 686
    .line 687
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    :cond_1e
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    if-eqz v4, :cond_1f

    .line 696
    .line 697
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v4

    .line 701
    move-object v5, v4

    .line 702
    check-cast v5, La/p8s0;

    .line 703
    .line 704
    iget-object v6, v5, La/p8s0;->a:Ljava/lang/String;

    .line 705
    .line 706
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 707
    .line 708
    .line 709
    move-result v6

    .line 710
    if-lez v6, :cond_1e

    .line 711
    .line 712
    iget v5, v5, La/p8s0;->c:I

    .line 713
    .line 714
    if-eqz v5, :cond_1e

    .line 715
    .line 716
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 717
    .line 718
    .line 719
    goto :goto_19

    .line 720
    :cond_1f
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 721
    .line 722
    .line 723
    move-result v0

    .line 724
    if-eqz v0, :cond_20

    .line 725
    .line 726
    goto/16 :goto_c

    .line 727
    .line 728
    :cond_20
    new-instance v0, Ljava/util/ArrayList;

    .line 729
    .line 730
    invoke-static {v2, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 731
    .line 732
    .line 733
    move-result v4

    .line 734
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    const/4 v4, 0x0

    .line 742
    :goto_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 743
    .line 744
    .line 745
    move-result v5

    .line 746
    if-eqz v5, :cond_29

    .line 747
    .line 748
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v5

    .line 752
    add-int/lit8 v6, v4, 0x1

    .line 753
    .line 754
    if-ltz v4, :cond_28

    .line 755
    .line 756
    check-cast v5, La/p8s0;

    .line 757
    .line 758
    const/16 v33, 0x0

    .line 759
    .line 760
    invoke-static/range {v33 .. v33}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 761
    .line 762
    .line 763
    move-result-object v8

    .line 764
    iget v9, v5, La/p8s0;->f:I

    .line 765
    .line 766
    iget-object v12, v5, La/p8s0;->a:Ljava/lang/String;

    .line 767
    .line 768
    iget v14, v5, La/p8s0;->e:I

    .line 769
    .line 770
    if-nez v9, :cond_21

    .line 771
    .line 772
    if-nez v14, :cond_21

    .line 773
    .line 774
    new-instance v9, Lkotlin/Pair;

    .line 775
    .line 776
    invoke-direct {v9, v8, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    goto :goto_1b

    .line 780
    :cond_21
    mul-int/lit8 v8, v9, 0x64

    .line 781
    .line 782
    add-int/2addr v9, v14

    .line 783
    div-int/2addr v8, v9

    .line 784
    rsub-int/lit8 v9, v8, 0x64

    .line 785
    .line 786
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 787
    .line 788
    .line 789
    move-result-object v8

    .line 790
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 791
    .line 792
    .line 793
    move-result-object v9

    .line 794
    new-instance v14, Lkotlin/Pair;

    .line 795
    .line 796
    invoke-direct {v14, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 797
    .line 798
    .line 799
    move-object v9, v14

    .line 800
    :goto_1b
    iget-object v8, v9, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 801
    .line 802
    check-cast v8, Ljava/lang/Number;

    .line 803
    .line 804
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 805
    .line 806
    .line 807
    move-result v8

    .line 808
    iget-object v9, v9, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast v9, Ljava/lang/Number;

    .line 811
    .line 812
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 813
    .line 814
    .line 815
    move-result v9

    .line 816
    new-instance v20, La/l5h;

    .line 817
    .line 818
    invoke-static {v4, v7}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v21

    .line 822
    new-instance v4, La/n0x;

    .line 823
    .line 824
    new-instance v14, Ljava/lang/StringBuilder;

    .line 825
    .line 826
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 827
    .line 828
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    const-string v15, "static/img/ImgDefault/Esports/Valorant/Maps_Stat/WinRate/Vertical/mob/"

    .line 832
    .line 833
    invoke-static {v15, v12, v13}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v15

    .line 837
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 838
    .line 839
    .line 840
    move-result v17

    .line 841
    if-nez v17, :cond_22

    .line 842
    .line 843
    move-object/from16 v17, v2

    .line 844
    .line 845
    const/4 v2, 0x0

    .line 846
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 847
    .line 848
    .line 849
    move/from16 v34, v6

    .line 850
    .line 851
    const/16 v19, 0x2f

    .line 852
    .line 853
    goto :goto_1f

    .line 854
    :cond_22
    move-object/from16 v17, v2

    .line 855
    .line 856
    move/from16 v34, v6

    .line 857
    .line 858
    const/4 v2, 0x0

    .line 859
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 860
    .line 861
    invoke-static {v15, v6, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 862
    .line 863
    .line 864
    move-result v6

    .line 865
    if-nez v6, :cond_25

    .line 866
    .line 867
    invoke-static {v15, v11, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 868
    .line 869
    .line 870
    move-result v6

    .line 871
    if-eqz v6, :cond_23

    .line 872
    .line 873
    const/4 v6, 0x0

    .line 874
    :goto_1c
    const/16 v19, 0x2f

    .line 875
    .line 876
    goto :goto_1e

    .line 877
    :cond_23
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    .line 878
    .line 879
    .line 880
    move-result v2

    .line 881
    if-lez v2, :cond_24

    .line 882
    .line 883
    invoke-static {v14, v10}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 884
    .line 885
    .line 886
    move-result v2

    .line 887
    if-nez v2, :cond_24

    .line 888
    .line 889
    const/16 v2, 0x2f

    .line 890
    .line 891
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 892
    .line 893
    .line 894
    move/from16 v19, v2

    .line 895
    .line 896
    const/4 v6, 0x1

    .line 897
    goto :goto_1d

    .line 898
    :cond_24
    const/4 v6, 0x1

    .line 899
    const/16 v19, 0x2f

    .line 900
    .line 901
    :goto_1d
    new-array v2, v6, [C

    .line 902
    .line 903
    const/4 v6, 0x0

    .line 904
    aput-char v19, v2, v6

    .line 905
    .line 906
    invoke-static {v15, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v2

    .line 910
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 911
    .line 912
    .line 913
    goto :goto_1f

    .line 914
    :cond_25
    move v6, v2

    .line 915
    goto :goto_1c

    .line 916
    :goto_1e
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 917
    .line 918
    .line 919
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 920
    .line 921
    .line 922
    :goto_1f
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v2

    .line 926
    invoke-direct {v4, v2}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 927
    .line 928
    .line 929
    iget v2, v5, La/p8s0;->c:I

    .line 930
    .line 931
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    iget-object v5, v1, La/ctf0;->b:La/lsm0;

    .line 940
    .line 941
    const/4 v14, 0x1

    .line 942
    invoke-static {v2, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v2

    .line 946
    const v6, 0x7f1316f9

    .line 947
    .line 948
    .line 949
    invoke-virtual {v5, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object v24

    .line 953
    new-instance v2, La/m0x;

    .line 954
    .line 955
    const v5, 0x7f080872

    .line 956
    .line 957
    .line 958
    const/4 v14, 0x6

    .line 959
    const/4 v15, 0x0

    .line 960
    invoke-direct {v2, v5, v15, v14}, La/m0x;-><init>(ILa/bzw;I)V

    .line 961
    .line 962
    .line 963
    invoke-static {v8, v3}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v26

    .line 967
    if-le v8, v9, :cond_26

    .line 968
    .line 969
    sget-wide v22, La/ijg;->V:J

    .line 970
    .line 971
    :goto_20
    move-wide/from16 v27, v22

    .line 972
    .line 973
    goto :goto_21

    .line 974
    :cond_26
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 975
    .line 976
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 977
    .line 978
    .line 979
    move-result-wide v22

    .line 980
    goto :goto_20

    .line 981
    :goto_21
    new-instance v5, La/m0x;

    .line 982
    .line 983
    const v6, 0x7f0809ff

    .line 984
    .line 985
    .line 986
    invoke-direct {v5, v6, v15, v14}, La/m0x;-><init>(ILa/bzw;I)V

    .line 987
    .line 988
    .line 989
    invoke-static {v9, v3}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v30

    .line 993
    if-le v9, v8, :cond_27

    .line 994
    .line 995
    sget-wide v8, La/ijg;->V:J

    .line 996
    .line 997
    :goto_22
    move-object/from16 v25, v2

    .line 998
    .line 999
    move-object/from16 v22, v4

    .line 1000
    .line 1001
    move-object/from16 v29, v5

    .line 1002
    .line 1003
    move-wide/from16 v31, v8

    .line 1004
    .line 1005
    move-object/from16 v23, v12

    .line 1006
    .line 1007
    goto :goto_23

    .line 1008
    :cond_27
    sget-object v6, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1009
    .line 1010
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 1011
    .line 1012
    .line 1013
    move-result-wide v8

    .line 1014
    goto :goto_22

    .line 1015
    :goto_23
    invoke-direct/range {v20 .. v32}, La/l5h;-><init>(Ljava/lang/String;La/n0x;Ljava/lang/String;Ljava/lang/String;La/m0x;Ljava/lang/String;JLa/m0x;Ljava/lang/String;J)V

    .line 1016
    .line 1017
    .line 1018
    move-object/from16 v2, v20

    .line 1019
    .line 1020
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1021
    .line 1022
    .line 1023
    move-object/from16 v2, v17

    .line 1024
    .line 1025
    move/from16 v4, v34

    .line 1026
    .line 1027
    goto/16 :goto_1a

    .line 1028
    .line 1029
    :cond_28
    invoke-static {}, La/q3d;->p()V

    .line 1030
    .line 1031
    .line 1032
    const/4 v14, 0x0

    .line 1033
    throw v14

    .line 1034
    :cond_29
    const/4 v14, 0x0

    .line 1035
    new-instance v2, La/m5h;

    .line 1036
    .line 1037
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v0

    .line 1041
    invoke-direct {v2, v0}, La/m5h;-><init>(La/a4x;)V

    .line 1042
    .line 1043
    .line 1044
    goto :goto_24

    .line 1045
    :cond_2a
    const/4 v14, 0x0

    .line 1046
    move-object v2, v14

    .line 1047
    :goto_24
    if-eqz v2, :cond_2b

    .line 1048
    .line 1049
    new-instance v0, La/l9t0;

    .line 1050
    .line 1051
    new-instance v17, La/hjm;

    .line 1052
    .line 1053
    const/4 v14, 0x0

    .line 1054
    new-array v3, v14, [Ljava/lang/Object;

    .line 1055
    .line 1056
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1057
    .line 1058
    invoke-static {v3, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v3

    .line 1062
    const v4, 0x7f1313c8

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v1, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v18

    .line 1069
    const/16 v29, 0x0

    .line 1070
    .line 1071
    const/16 v30, 0x1ffe

    .line 1072
    .line 1073
    const/16 v19, 0x0

    .line 1074
    .line 1075
    const/16 v20, 0x0

    .line 1076
    .line 1077
    const/16 v21, 0x0

    .line 1078
    .line 1079
    const/16 v22, 0x0

    .line 1080
    .line 1081
    const/16 v23, 0x0

    .line 1082
    .line 1083
    const/16 v24, 0x0

    .line 1084
    .line 1085
    const/16 v25, 0x0

    .line 1086
    .line 1087
    const/16 v26, 0x0

    .line 1088
    .line 1089
    const/16 v27, 0x0

    .line 1090
    .line 1091
    const/16 v28, 0x0

    .line 1092
    .line 1093
    invoke-direct/range {v17 .. v30}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1094
    .line 1095
    .line 1096
    move-object/from16 v1, v17

    .line 1097
    .line 1098
    const-string v3, "HEADER_MAP_STATISTIC"

    .line 1099
    .line 1100
    invoke-direct {v0, v3, v1}, La/l9t0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 1101
    .line 1102
    .line 1103
    new-instance v1, La/fat0;

    .line 1104
    .line 1105
    invoke-direct {v1, v2}, La/fat0;-><init>(La/m5h;)V

    .line 1106
    .line 1107
    .line 1108
    const/4 v2, 0x2

    .line 1109
    new-array v2, v2, [La/p6t0;

    .line 1110
    .line 1111
    const/16 v33, 0x0

    .line 1112
    .line 1113
    aput-object v0, v2, v33

    .line 1114
    .line 1115
    const/16 v16, 0x1

    .line 1116
    .line 1117
    aput-object v1, v2, v16

    .line 1118
    .line 1119
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v8

    .line 1123
    goto :goto_25

    .line 1124
    :cond_2b
    move-object v8, v14

    .line 1125
    :goto_25
    if-nez v8, :cond_2c

    .line 1126
    .line 1127
    sget-object v0, La/iun;->a:La/iun;

    .line 1128
    .line 1129
    return-object v0

    .line 1130
    :cond_2c
    return-object v8
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    iget-object v1, v1, La/gdt0;->b:La/ej1;

    .line 8
    .line 9
    iget-object v1, v1, La/ej1;->b:La/ctf0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto/16 :goto_1

    .line 23
    .line 24
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v3, 0xa

    .line 27
    .line 28
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v3, 0x0

    .line 40
    move v5, v3

    .line 41
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    add-int/lit8 v10, v5, 0x1

    .line 52
    .line 53
    if-ltz v5, :cond_1

    .line 54
    .line 55
    check-cast v4, La/phk0;

    .line 56
    .line 57
    new-instance v6, La/y8m;

    .line 58
    .line 59
    move-object v7, v6

    .line 60
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    move-object v8, v7

    .line 65
    new-instance v7, La/n0x;

    .line 66
    .line 67
    iget-object v9, v4, La/phk0;->b:Ljava/lang/String;

    .line 68
    .line 69
    invoke-direct {v7, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v4, v4, La/phk0;->a:Ljava/lang/String;

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    move-object/from16 v18, v8

    .line 76
    .line 77
    move-object v8, v4

    .line 78
    move-object/from16 v4, v18

    .line 79
    .line 80
    invoke-direct/range {v4 .. v9}, La/y8m;-><init>(ILjava/lang/String;La/n0x;Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move v5, v10

    .line 87
    goto :goto_0

    .line 88
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 89
    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    throw v0

    .line 93
    :cond_2
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v2, La/l9t0;

    .line 98
    .line 99
    new-instance v4, La/hjm;

    .line 100
    .line 101
    new-array v5, v3, [Ljava/lang/Object;

    .line 102
    .line 103
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 104
    .line 105
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    const v6, 0x7f131312

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    const/16 v16, 0x0

    .line 117
    .line 118
    const/16 v17, 0x1ffe

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    const/4 v7, 0x0

    .line 122
    const/4 v8, 0x0

    .line 123
    const/4 v9, 0x0

    .line 124
    const/4 v10, 0x0

    .line 125
    const/4 v11, 0x0

    .line 126
    const/4 v12, 0x0

    .line 127
    const/4 v13, 0x0

    .line 128
    const/4 v14, 0x0

    .line 129
    const/4 v15, 0x0

    .line 130
    invoke-direct/range {v4 .. v17}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 131
    .line 132
    .line 133
    const-string v1, "HEADER_SOCIAL_MEDIA"

    .line 134
    .line 135
    invoke-direct {v2, v1, v4}, La/l9t0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 136
    .line 137
    .line 138
    new-instance v1, La/yct0;

    .line 139
    .line 140
    new-instance v4, La/g9m;

    .line 141
    .line 142
    invoke-direct {v4, v0}, La/g9m;-><init>(La/a4x;)V

    .line 143
    .line 144
    .line 145
    invoke-direct {v1, v4}, La/yct0;-><init>(La/g9m;)V

    .line 146
    .line 147
    .line 148
    const/4 v0, 0x2

    .line 149
    new-array v0, v0, [La/p6t0;

    .line 150
    .line 151
    aput-object v2, v0, v3

    .line 152
    .line 153
    const/4 v2, 0x1

    .line 154
    aput-object v1, v0, v2

    .line 155
    .line 156
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    return-object v0

    .line 161
    :cond_3
    :goto_1
    sget-object v0, La/iun;->a:La/iun;

    .line 162
    .line 163
    return-object v0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/cdt0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/cdt0;->h:Ljava/util/Locale;

    .line 9
    .line 10
    iget-object v2, v0, La/cdt0;->j:Ljava/util/Date;

    .line 11
    .line 12
    iget-object v3, v0, La/cdt0;->k:La/j0g0;

    .line 13
    .line 14
    iget-object v4, v0, La/cdt0;->c:La/xbt0;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    iget-object v4, v4, La/xbt0;->j:Ljava/lang/Object;

    .line 20
    .line 21
    sget-object v6, La/j0g0;->b:La/e0g0;

    .line 22
    .line 23
    instance-of v6, v4, La/g0g0;

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    move-object v4, v5

    .line 28
    :cond_0
    check-cast v4, La/qbt0;

    .line 29
    .line 30
    move-object v6, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object v6, v5

    .line 33
    :goto_0
    iget-object v4, v0, La/cdt0;->f:La/sff0;

    .line 34
    .line 35
    iget-object v4, v4, La/sff0;->g:La/mum0;

    .line 36
    .line 37
    iget-object v9, v4, La/mum0;->y:La/v5l0;

    .line 38
    .line 39
    move-object/from16 v4, p0

    .line 40
    .line 41
    iget-object v4, v4, La/gdt0;->b:La/ej1;

    .line 42
    .line 43
    iget-object v8, v4, La/ej1;->b:La/ctf0;

    .line 44
    .line 45
    iget-boolean v13, v0, La/cdt0;->l:Z

    .line 46
    .line 47
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    if-eqz v3, :cond_5

    .line 51
    .line 52
    iget-object v0, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 53
    .line 54
    instance-of v3, v0, La/g0g0;

    .line 55
    .line 56
    if-nez v3, :cond_5

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-object v5, v0

    .line 62
    :goto_1
    check-cast v5, Ljava/util/List;

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    if-eqz v5, :cond_3

    .line 66
    .line 67
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-ne v4, v3, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    if-nez v2, :cond_4

    .line 75
    .line 76
    new-instance v2, Ljava/util/Date;

    .line 77
    .line 78
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 79
    .line 80
    .line 81
    :cond_4
    move-object v7, v2

    .line 82
    new-instance v2, La/l9t0;

    .line 83
    .line 84
    new-instance v14, La/hjm;

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    new-array v5, v4, [Ljava/lang/Object;

    .line 88
    .line 89
    iget-object v10, v8, La/ctf0;->b:La/lsm0;

    .line 90
    .line 91
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    const v11, 0x7f1303ff

    .line 96
    .line 97
    .line 98
    invoke-virtual {v10, v11, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    new-instance v5, La/ue9;

    .line 103
    .line 104
    new-array v11, v4, [Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {v11, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    const v12, 0x7f1300e4

    .line 111
    .line 112
    .line 113
    invoke-virtual {v10, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-direct {v5, v10}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/16 v26, 0x0

    .line 121
    .line 122
    const/16 v27, 0x1bfe

    .line 123
    .line 124
    const/16 v16, 0x0

    .line 125
    .line 126
    const/16 v17, 0x0

    .line 127
    .line 128
    const/16 v18, 0x0

    .line 129
    .line 130
    const/16 v19, 0x0

    .line 131
    .line 132
    const/16 v20, 0x0

    .line 133
    .line 134
    const/16 v21, 0x0

    .line 135
    .line 136
    const/16 v22, 0x0

    .line 137
    .line 138
    const/16 v23, 0x0

    .line 139
    .line 140
    const/16 v24, 0x0

    .line 141
    .line 142
    move-object/from16 v25, v5

    .line 143
    .line 144
    invoke-direct/range {v14 .. v27}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 145
    .line 146
    .line 147
    const-string v5, "HEADER_RESULTS"

    .line 148
    .line 149
    invoke-direct {v2, v5, v14}, La/l9t0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v0, v7, v1}, La/aem0;->n(Ljava/lang/Object;Ljava/util/Date;Ljava/util/Locale;)La/z8t0;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget-object v10, La/q0s;->b:La/q0s;

    .line 157
    .line 158
    const/4 v11, 0x1

    .line 159
    const/4 v12, 0x2

    .line 160
    invoke-static/range {v6 .. v13}, La/qem0;->m(La/qbt0;Ljava/util/Date;La/ctf0;La/v5l0;La/q0s;ZIZ)La/zat0;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    const/4 v5, 0x3

    .line 165
    new-array v5, v5, [La/p6t0;

    .line 166
    .line 167
    aput-object v2, v5, v4

    .line 168
    .line 169
    aput-object v0, v5, v3

    .line 170
    .line 171
    const/4 v0, 0x2

    .line 172
    aput-object v1, v5, v0

    .line 173
    .line 174
    invoke-static {v5}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    return-object v0

    .line 179
    :cond_5
    :goto_2
    sget-object v0, La/iun;->a:La/iun;

    .line 180
    .line 181
    return-object v0
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    iget-object v1, v1, La/gdt0;->b:La/ej1;

    .line 11
    .line 12
    iget-object v1, v1, La/ej1;->b:La/ctf0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sget-object v0, La/iun;->a:La/iun;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    new-instance v2, La/l9t0;

    .line 27
    .line 28
    new-instance v3, La/hjm;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    new-array v5, v4, [Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 34
    .line 35
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const v6, 0x7f1305fe

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v15, 0x0

    .line 47
    const/16 v16, 0x1ffe

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x0

    .line 56
    const/4 v12, 0x0

    .line 57
    const/4 v13, 0x0

    .line 58
    const/4 v14, 0x0

    .line 59
    move/from16 v17, v4

    .line 60
    .line 61
    move-object v4, v1

    .line 62
    move/from16 v1, v17

    .line 63
    .line 64
    invoke-direct/range {v3 .. v16}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 65
    .line 66
    .line 67
    const-string v4, "HEADER_BANNERS"

    .line 68
    .line 69
    invoke-direct {v2, v4, v3}, La/l9t0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 70
    .line 71
    .line 72
    new-instance v3, Ljava/util/ArrayList;

    .line 73
    .line 74
    const/16 v4, 0xa

    .line 75
    .line 76
    invoke-static {v0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_1

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, La/uog;

    .line 98
    .line 99
    new-instance v5, La/fr5;

    .line 100
    .line 101
    iget v6, v4, La/uog;->a:I

    .line 102
    .line 103
    new-instance v7, La/n0x;

    .line 104
    .line 105
    iget-object v8, v4, La/uog;->e:Ljava/lang/String;

    .line 106
    .line 107
    invoke-direct {v7, v8}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v9, v4, La/uog;->b:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v10, v4, La/uog;->d:Ljava/lang/String;

    .line 113
    .line 114
    const/4 v11, 0x0

    .line 115
    const/16 v12, 0x44

    .line 116
    .line 117
    const/4 v8, 0x0

    .line 118
    invoke-direct/range {v5 .. v12}, La/fr5;-><init>(ILa/n0x;La/n0x;Ljava/lang/String;Ljava/lang/String;La/er5;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    new-instance v3, La/w8t0;

    .line 130
    .line 131
    invoke-direct {v3, v0}, La/w8t0;-><init>(La/a4x;)V

    .line 132
    .line 133
    .line 134
    const/4 v0, 0x2

    .line 135
    new-array v0, v0, [La/p6t0;

    .line 136
    .line 137
    aput-object v2, v0, v1

    .line 138
    .line 139
    const/4 v1, 0x1

    .line 140
    aput-object v3, v0, v1

    .line 141
    .line 142
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gdt0;->a:B

    .line 4
    .line 5
    const-string v2, "%,d$"

    .line 6
    .line 7
    const-string v3, "$%,d"

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const v7, 0x7f130e4e

    .line 11
    .line 12
    .line 13
    const v8, 0x7f1306e3

    .line 14
    .line 15
    .line 16
    const/16 v9, 0x8

    .line 17
    .line 18
    const-string v10, ""

    .line 19
    .line 20
    const/16 v12, 0xa

    .line 21
    .line 22
    iget-object v15, v0, La/gdt0;->b:La/ej1;

    .line 23
    .line 24
    const-wide/16 v16, 0x0

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    const/4 v5, 0x0

    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    move-object/from16 v0, p1

    .line 32
    .line 33
    check-cast v0, La/xbt0;

    .line 34
    .line 35
    iget-object v1, v15, La/ej1;->b:La/ctf0;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v2, v0, La/xbt0;->a:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 45
    .line 46
    instance-of v3, v2, La/g0g0;

    .line 47
    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    :cond_0
    check-cast v2, La/fn9;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v2, 0x0

    .line 55
    :goto_0
    invoke-static {v2, v5, v1}, La/cem0;->p(La/fn9;ZLa/ctf0;)La/bat0;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    iget-object v0, v0, La/xbt0;->a:Ljava/lang/Object;

    .line 62
    .line 63
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 64
    .line 65
    instance-of v3, v0, La/g0g0;

    .line 66
    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    :cond_2
    check-cast v0, La/fn9;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    const/4 v0, 0x0

    .line 74
    :goto_1
    invoke-static {v0, v1}, La/ghm0;->p(La/fn9;La/ctf0;)La/zct0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-nez v2, :cond_4

    .line 79
    .line 80
    if-nez v0, :cond_4

    .line 81
    .line 82
    sget-object v0, La/iun;->a:La/iun;

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    new-instance v4, La/l9t0;

    .line 90
    .line 91
    new-instance v15, La/hjm;

    .line 92
    .line 93
    new-array v6, v5, [Ljava/lang/Object;

    .line 94
    .line 95
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 96
    .line 97
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    const v7, 0x7f130029

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v16

    .line 108
    if-eqz v2, :cond_5

    .line 109
    .line 110
    iget-object v6, v2, La/bat0;->b:La/inh;

    .line 111
    .line 112
    instance-of v7, v6, La/gnh;

    .line 113
    .line 114
    if-eqz v7, :cond_5

    .line 115
    .line 116
    check-cast v6, La/gnh;

    .line 117
    .line 118
    iget-object v6, v6, La/gnh;->g:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-lez v6, :cond_5

    .line 125
    .line 126
    new-instance v14, La/ue9;

    .line 127
    .line 128
    new-array v6, v5, [Ljava/lang/Object;

    .line 129
    .line 130
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    const v6, 0x7f131668

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-direct {v14, v1}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    move-object/from16 v26, v14

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_5
    const/16 v26, 0x0

    .line 148
    .line 149
    :goto_2
    const/16 v27, 0x0

    .line 150
    .line 151
    const/16 v28, 0x1bfe

    .line 152
    .line 153
    const/16 v17, 0x0

    .line 154
    .line 155
    const/16 v18, 0x0

    .line 156
    .line 157
    const/16 v19, 0x0

    .line 158
    .line 159
    const/16 v20, 0x0

    .line 160
    .line 161
    const/16 v21, 0x0

    .line 162
    .line 163
    const/16 v22, 0x0

    .line 164
    .line 165
    const/16 v23, 0x0

    .line 166
    .line 167
    const/16 v24, 0x0

    .line 168
    .line 169
    const/16 v25, 0x0

    .line 170
    .line 171
    invoke-direct/range {v15 .. v28}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 172
    .line 173
    .line 174
    const-string v1, "HEADER_TOURNAMENT_INFO"

    .line 175
    .line 176
    invoke-direct {v4, v1, v15}, La/l9t0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    if-eqz v2, :cond_6

    .line 183
    .line 184
    invoke-virtual {v3, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    :cond_6
    if-eqz v0, :cond_7

    .line 188
    .line 189
    invoke-virtual {v3, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    :cond_7
    invoke-static {v3}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    :goto_3
    return-object v0

    .line 197
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/gdt0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    return-object v0

    .line 202
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/gdt0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    return-object v0

    .line 207
    :pswitch_2
    move-object/from16 v0, p1

    .line 208
    .line 209
    check-cast v0, La/fcg;

    .line 210
    .line 211
    invoke-virtual {v15, v0, v5}, La/ej1;->a(La/fcg;Z)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    return-object v0

    .line 216
    :pswitch_3
    move-object/from16 v0, p1

    .line 217
    .line 218
    check-cast v0, La/fcg;

    .line 219
    .line 220
    invoke-virtual {v15, v0, v4}, La/ej1;->a(La/fcg;Z)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    return-object v0

    .line 225
    :pswitch_4
    invoke-direct/range {p0 .. p1}, La/gdt0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    return-object v0

    .line 230
    :pswitch_5
    invoke-direct/range {p0 .. p1}, La/gdt0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    return-object v0

    .line 235
    :pswitch_6
    invoke-direct/range {p0 .. p1}, La/gdt0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    return-object v0

    .line 240
    :pswitch_7
    invoke-direct/range {p0 .. p1}, La/gdt0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    return-object v0

    .line 245
    :pswitch_8
    move-object/from16 v0, p1

    .line 246
    .line 247
    check-cast v0, La/d1s0;

    .line 248
    .line 249
    if-eqz v0, :cond_26

    .line 250
    .line 251
    iget-object v1, v15, La/ej1;->b:La/ctf0;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    instance-of v2, v0, La/z0s0;

    .line 257
    .line 258
    sget-object v19, La/rt90;->a:La/rt90;

    .line 259
    .line 260
    const v3, 0x7f130f92

    .line 261
    .line 262
    .line 263
    if-eqz v2, :cond_16

    .line 264
    .line 265
    check-cast v0, La/z0s0;

    .line 266
    .line 267
    iget-object v0, v0, La/z0s0;->a:Ljava/util/ArrayList;

    .line 268
    .line 269
    new-instance v2, Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    if-eqz v6, :cond_8

    .line 283
    .line 284
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    check-cast v6, La/f0s0;

    .line 289
    .line 290
    iget-object v6, v6, La/f0s0;->b:Ljava/util/List;

    .line 291
    .line 292
    invoke-static {v2, v6}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 293
    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    :cond_9
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    if-eqz v6, :cond_a

    .line 310
    .line 311
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    move-object v10, v6

    .line 316
    check-cast v10, La/j0s0;

    .line 317
    .line 318
    iget-object v10, v10, La/j0s0;->a:Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 321
    .line 322
    .line 323
    move-result v10

    .line 324
    if-lez v10, :cond_9

    .line 325
    .line 326
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_a
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 331
    .line 332
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v6

    .line 343
    if-eqz v6, :cond_c

    .line 344
    .line 345
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    move-object v10, v6

    .line 350
    check-cast v10, La/j0s0;

    .line 351
    .line 352
    iget-object v10, v10, La/j0s0;->a:Ljava/lang/String;

    .line 353
    .line 354
    invoke-virtual {v2, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v11

    .line 358
    if-nez v11, :cond_b

    .line 359
    .line 360
    new-instance v11, Ljava/util/ArrayList;

    .line 361
    .line 362
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 363
    .line 364
    .line 365
    invoke-interface {v2, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    :cond_b
    check-cast v11, Ljava/util/List;

    .line 369
    .line 370
    invoke-interface {v11, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    goto :goto_6

    .line 374
    :cond_c
    new-instance v0, Ljava/util/ArrayList;

    .line 375
    .line 376
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    if-eqz v6, :cond_12

    .line 392
    .line 393
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    check-cast v6, Ljava/util/Map$Entry;

    .line 398
    .line 399
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    check-cast v6, Ljava/util/List;

    .line 404
    .line 405
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 413
    .line 414
    .line 415
    move-result v10

    .line 416
    if-nez v10, :cond_e

    .line 417
    .line 418
    const/4 v10, 0x0

    .line 419
    :cond_d
    const/16 v22, 0x0

    .line 420
    .line 421
    goto :goto_a

    .line 422
    :cond_e
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v10

    .line 426
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 427
    .line 428
    .line 429
    move-result v11

    .line 430
    if-eqz v11, :cond_d

    .line 431
    .line 432
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v11

    .line 436
    move-object v15, v10

    .line 437
    check-cast v15, La/j0s0;

    .line 438
    .line 439
    const/16 v22, 0x0

    .line 440
    .line 441
    iget-object v14, v15, La/j0s0;->d:La/n0s0;

    .line 442
    .line 443
    iget v14, v14, La/n0s0;->b:I

    .line 444
    .line 445
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 446
    .line 447
    .line 448
    move-result-object v14

    .line 449
    move-object v13, v11

    .line 450
    check-cast v13, La/j0s0;

    .line 451
    .line 452
    iget-object v4, v13, La/j0s0;->d:La/n0s0;

    .line 453
    .line 454
    iget v4, v4, La/n0s0;->b:I

    .line 455
    .line 456
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    invoke-virtual {v14, v4}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 461
    .line 462
    .line 463
    move-result v4

    .line 464
    if-eqz v4, :cond_f

    .line 465
    .line 466
    goto :goto_9

    .line 467
    :cond_f
    iget-object v4, v15, La/j0s0;->d:La/n0s0;

    .line 468
    .line 469
    iget v4, v4, La/n0s0;->a:F

    .line 470
    .line 471
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    iget-object v13, v13, La/j0s0;->d:La/n0s0;

    .line 476
    .line 477
    iget v13, v13, La/n0s0;->a:F

    .line 478
    .line 479
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 480
    .line 481
    .line 482
    move-result-object v13

    .line 483
    invoke-virtual {v4, v13}, Ljava/lang/Float;->compareTo(Ljava/lang/Object;)I

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    :goto_9
    if-gez v4, :cond_10

    .line 488
    .line 489
    move-object v10, v11

    .line 490
    :cond_10
    const/4 v4, 0x1

    .line 491
    goto :goto_8

    .line 492
    :goto_a
    check-cast v10, La/j0s0;

    .line 493
    .line 494
    if-eqz v10, :cond_11

    .line 495
    .line 496
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    :cond_11
    const/4 v4, 0x1

    .line 500
    goto :goto_7

    .line 501
    :cond_12
    const/16 v22, 0x0

    .line 502
    .line 503
    new-instance v2, La/tgo0;

    .line 504
    .line 505
    const/16 v4, 0x1a

    .line 506
    .line 507
    invoke-direct {v2, v4}, La/tgo0;-><init>(B)V

    .line 508
    .line 509
    .line 510
    new-instance v4, La/mto;

    .line 511
    .line 512
    const/16 v6, 0xc

    .line 513
    .line 514
    invoke-direct {v4, v2, v6}, La/mto;-><init>(Ljava/lang/Object;B)V

    .line 515
    .line 516
    .line 517
    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-static {v0, v12}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    if-eqz v2, :cond_13

    .line 530
    .line 531
    :goto_b
    move v3, v5

    .line 532
    move-object/from16 v14, v22

    .line 533
    .line 534
    goto/16 :goto_11

    .line 535
    .line 536
    :cond_13
    new-instance v2, La/q9m;

    .line 537
    .line 538
    new-array v4, v5, [Ljava/lang/Object;

    .line 539
    .line 540
    iget-object v6, v1, La/ctf0;->b:La/lsm0;

    .line 541
    .line 542
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v4

    .line 546
    invoke-virtual {v6, v7, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    new-array v7, v5, [Ljava/lang/Object;

    .line 551
    .line 552
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v7

    .line 556
    invoke-virtual {v6, v3, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v3

    .line 560
    new-array v7, v5, [Ljava/lang/Object;

    .line 561
    .line 562
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v7

    .line 566
    const v10, 0x7f130597

    .line 567
    .line 568
    .line 569
    invoke-virtual {v6, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v7

    .line 573
    new-array v10, v5, [Ljava/lang/Object;

    .line 574
    .line 575
    invoke-static {v10, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v10

    .line 579
    const v11, 0x7f1305a2

    .line 580
    .line 581
    .line 582
    invoke-virtual {v6, v11, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v10

    .line 586
    filled-new-array {v7, v10}, [Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v7

    .line 590
    invoke-static {v7}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 591
    .line 592
    .line 593
    move-result-object v7

    .line 594
    invoke-direct {v2, v7, v4, v3}, La/q9m;-><init>(La/i4;Ljava/lang/String;Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    new-instance v3, Ljava/util/ArrayList;

    .line 598
    .line 599
    invoke-static {v0, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 600
    .line 601
    .line 602
    move-result v4

    .line 603
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 604
    .line 605
    .line 606
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    move v4, v5

    .line 611
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 612
    .line 613
    .line 614
    move-result v7

    .line 615
    if-eqz v7, :cond_15

    .line 616
    .line 617
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    add-int/lit8 v10, v4, 0x1

    .line 622
    .line 623
    if-ltz v4, :cond_14

    .line 624
    .line 625
    check-cast v7, La/j0s0;

    .line 626
    .line 627
    new-instance v15, La/fam;

    .line 628
    .line 629
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v16

    .line 633
    new-instance v4, La/n0x;

    .line 634
    .line 635
    iget-object v11, v7, La/j0s0;->c:Ljava/lang/String;

    .line 636
    .line 637
    iget-object v12, v7, La/j0s0;->d:La/n0s0;

    .line 638
    .line 639
    invoke-static {v11}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v11

    .line 643
    invoke-direct {v4, v11}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    sget-object v18, La/ut90;->d:La/ut90;

    .line 647
    .line 648
    iget-object v7, v7, La/j0s0;->a:Ljava/lang/String;

    .line 649
    .line 650
    new-instance v11, La/ham;

    .line 651
    .line 652
    iget v13, v12, La/n0s0;->a:F

    .line 653
    .line 654
    invoke-static {v13}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v13

    .line 658
    invoke-direct {v11, v13}, La/ham;-><init>(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    new-instance v13, La/ham;

    .line 662
    .line 663
    iget v12, v12, La/n0s0;->b:I

    .line 664
    .line 665
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v12

    .line 669
    invoke-direct {v13, v12}, La/ham;-><init>(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    filled-new-array {v11, v13}, [La/ham;

    .line 673
    .line 674
    .line 675
    move-result-object v11

    .line 676
    invoke-static {v11}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 677
    .line 678
    .line 679
    move-result-object v21

    .line 680
    move-object/from16 v17, v4

    .line 681
    .line 682
    move-object/from16 v20, v7

    .line 683
    .line 684
    invoke-direct/range {v15 .. v21}, La/fam;-><init>(Ljava/lang/String;La/n0x;La/ut90;La/tt90;Ljava/lang/String;La/i4;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    move v4, v10

    .line 691
    goto :goto_c

    .line 692
    :cond_14
    invoke-static {}, La/q3d;->p()V

    .line 693
    .line 694
    .line 695
    throw v22

    .line 696
    :cond_15
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    new-array v3, v5, [Ljava/lang/Object;

    .line 701
    .line 702
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v3

    .line 706
    invoke-virtual {v6, v8, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v3

    .line 710
    new-instance v14, La/jam;

    .line 711
    .line 712
    invoke-direct {v14, v2, v0, v3, v9}, La/jam;-><init>(La/s9m;La/a4x;Ljava/lang/String;I)V

    .line 713
    .line 714
    .line 715
    move v3, v5

    .line 716
    goto/16 :goto_11

    .line 717
    .line 718
    :cond_16
    const/16 v22, 0x0

    .line 719
    .line 720
    instance-of v2, v0, La/b1s0;

    .line 721
    .line 722
    if-eqz v2, :cond_24

    .line 723
    .line 724
    check-cast v0, La/b1s0;

    .line 725
    .line 726
    iget-object v0, v0, La/b1s0;->a:La/h2s0;

    .line 727
    .line 728
    iget-object v0, v0, La/h2s0;->b:Ljava/util/List;

    .line 729
    .line 730
    new-instance v2, Ljava/util/ArrayList;

    .line 731
    .line 732
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 733
    .line 734
    .line 735
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    :cond_17
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 740
    .line 741
    .line 742
    move-result v4

    .line 743
    if-eqz v4, :cond_18

    .line 744
    .line 745
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v4

    .line 749
    move-object v10, v4

    .line 750
    check-cast v10, La/i2s0;

    .line 751
    .line 752
    iget-object v10, v10, La/i2s0;->b:Ljava/lang/String;

    .line 753
    .line 754
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 755
    .line 756
    .line 757
    move-result v10

    .line 758
    if-lez v10, :cond_17

    .line 759
    .line 760
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    goto :goto_d

    .line 764
    :cond_18
    new-instance v0, Ljava/util/ArrayList;

    .line 765
    .line 766
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 774
    .line 775
    .line 776
    move-result v4

    .line 777
    if-eqz v4, :cond_1a

    .line 778
    .line 779
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v4

    .line 783
    move-object v10, v4

    .line 784
    check-cast v10, La/i2s0;

    .line 785
    .line 786
    iget-object v13, v10, La/i2s0;->d:La/b2s0;

    .line 787
    .line 788
    sget-object v14, La/b2s0;->f:La/b2s0;

    .line 789
    .line 790
    if-ne v13, v14, :cond_19

    .line 791
    .line 792
    iget v13, v10, La/i2s0;->e:I

    .line 793
    .line 794
    if-nez v13, :cond_19

    .line 795
    .line 796
    iget v13, v10, La/i2s0;->f:I

    .line 797
    .line 798
    if-nez v13, :cond_19

    .line 799
    .line 800
    iget v13, v10, La/i2s0;->g:F

    .line 801
    .line 802
    cmpg-float v13, v13, v6

    .line 803
    .line 804
    if-nez v13, :cond_19

    .line 805
    .line 806
    iget v10, v10, La/i2s0;->h:F

    .line 807
    .line 808
    cmpg-float v10, v10, v6

    .line 809
    .line 810
    if-nez v10, :cond_19

    .line 811
    .line 812
    goto :goto_e

    .line 813
    :cond_19
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    goto :goto_e

    .line 817
    :cond_1a
    invoke-static {v0, v12}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 822
    .line 823
    .line 824
    move-result v2

    .line 825
    if-eqz v2, :cond_1b

    .line 826
    .line 827
    goto/16 :goto_b

    .line 828
    .line 829
    :cond_1b
    new-instance v2, La/q9m;

    .line 830
    .line 831
    new-array v4, v5, [Ljava/lang/Object;

    .line 832
    .line 833
    iget-object v6, v1, La/ctf0;->b:La/lsm0;

    .line 834
    .line 835
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v4

    .line 839
    invoke-virtual {v6, v7, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v4

    .line 843
    new-array v7, v5, [Ljava/lang/Object;

    .line 844
    .line 845
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v7

    .line 849
    invoke-virtual {v6, v3, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    move-result-object v3

    .line 853
    new-array v7, v5, [Ljava/lang/Object;

    .line 854
    .line 855
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v7

    .line 859
    const v10, 0x7f130613

    .line 860
    .line 861
    .line 862
    invoke-virtual {v6, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    move-result-object v13

    .line 866
    new-array v7, v5, [Ljava/lang/Object;

    .line 867
    .line 868
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v7

    .line 872
    const v10, 0x7f1305e3

    .line 873
    .line 874
    .line 875
    invoke-virtual {v6, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v14

    .line 879
    new-array v7, v5, [Ljava/lang/Object;

    .line 880
    .line 881
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v7

    .line 885
    const v10, 0x7f13062a

    .line 886
    .line 887
    .line 888
    invoke-virtual {v6, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v15

    .line 892
    new-array v7, v5, [Ljava/lang/Object;

    .line 893
    .line 894
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v7

    .line 898
    const v10, 0x7f130606

    .line 899
    .line 900
    .line 901
    invoke-virtual {v6, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v16

    .line 905
    new-array v7, v5, [Ljava/lang/Object;

    .line 906
    .line 907
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v7

    .line 911
    const v10, 0x7f13062d

    .line 912
    .line 913
    .line 914
    invoke-virtual {v6, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v17

    .line 918
    new-array v7, v5, [Ljava/lang/Object;

    .line 919
    .line 920
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v7

    .line 924
    const v10, 0x7f130605

    .line 925
    .line 926
    .line 927
    invoke-virtual {v6, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v18

    .line 931
    filled-new-array/range {v13 .. v18}, [Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v7

    .line 935
    invoke-static {v7}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 936
    .line 937
    .line 938
    move-result-object v7

    .line 939
    invoke-direct {v2, v7, v4, v3}, La/q9m;-><init>(La/i4;Ljava/lang/String;Ljava/lang/String;)V

    .line 940
    .line 941
    .line 942
    new-instance v3, Ljava/util/ArrayList;

    .line 943
    .line 944
    invoke-static {v0, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 945
    .line 946
    .line 947
    move-result v4

    .line 948
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 949
    .line 950
    .line 951
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    move v4, v5

    .line 956
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 957
    .line 958
    .line 959
    move-result v7

    .line 960
    if-eqz v7, :cond_23

    .line 961
    .line 962
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v7

    .line 966
    add-int/lit8 v10, v4, 0x1

    .line 967
    .line 968
    if-ltz v4, :cond_22

    .line 969
    .line 970
    check-cast v7, La/i2s0;

    .line 971
    .line 972
    new-instance v15, La/fam;

    .line 973
    .line 974
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v16

    .line 978
    new-instance v4, La/n0x;

    .line 979
    .line 980
    iget-object v12, v7, La/i2s0;->c:Ljava/lang/String;

    .line 981
    .line 982
    iget v13, v7, La/i2s0;->f:I

    .line 983
    .line 984
    iget v14, v7, La/i2s0;->e:I

    .line 985
    .line 986
    invoke-static {v12}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v12

    .line 990
    invoke-direct {v4, v12}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    sget-object v18, La/ut90;->d:La/ut90;

    .line 994
    .line 995
    iget-object v12, v7, La/i2s0;->b:Ljava/lang/String;

    .line 996
    .line 997
    new-instance v9, La/gam;

    .line 998
    .line 999
    new-instance v8, La/m0x;

    .line 1000
    .line 1001
    move/from16 v27, v5

    .line 1002
    .line 1003
    iget-object v5, v7, La/i2s0;->d:La/b2s0;

    .line 1004
    .line 1005
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 1006
    .line 1007
    .line 1008
    move-result v5

    .line 1009
    if-eqz v5, :cond_21

    .line 1010
    .line 1011
    const/4 v11, 0x1

    .line 1012
    if-eq v5, v11, :cond_20

    .line 1013
    .line 1014
    const/4 v11, 0x2

    .line 1015
    if-eq v5, v11, :cond_1f

    .line 1016
    .line 1017
    const/4 v11, 0x3

    .line 1018
    if-eq v5, v11, :cond_1e

    .line 1019
    .line 1020
    const/4 v11, 0x4

    .line 1021
    if-eq v5, v11, :cond_1d

    .line 1022
    .line 1023
    const/4 v11, 0x5

    .line 1024
    if-ne v5, v11, :cond_1c

    .line 1025
    .line 1026
    const v5, 0x7f080d62

    .line 1027
    .line 1028
    .line 1029
    goto :goto_10

    .line 1030
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 1031
    .line 1032
    .line 1033
    move-object/from16 v14, v22

    .line 1034
    .line 1035
    goto/16 :goto_14

    .line 1036
    .line 1037
    :cond_1d
    const v5, 0x7f080d5d

    .line 1038
    .line 1039
    .line 1040
    goto :goto_10

    .line 1041
    :cond_1e
    const v5, 0x7f080d5e

    .line 1042
    .line 1043
    .line 1044
    goto :goto_10

    .line 1045
    :cond_1f
    const v5, 0x7f080d5f

    .line 1046
    .line 1047
    .line 1048
    goto :goto_10

    .line 1049
    :cond_20
    const v5, 0x7f080d61

    .line 1050
    .line 1051
    .line 1052
    goto :goto_10

    .line 1053
    :cond_21
    const v5, 0x7f080d60

    .line 1054
    .line 1055
    .line 1056
    :goto_10
    const/4 v11, 0x6

    .line 1057
    move-object/from16 v29, v0

    .line 1058
    .line 1059
    move-object/from16 v0, v22

    .line 1060
    .line 1061
    invoke-direct {v8, v5, v0, v11}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1062
    .line 1063
    .line 1064
    sget-object v0, La/ut90;->c:La/ut90;

    .line 1065
    .line 1066
    invoke-direct {v9, v8, v0}, La/gam;-><init>(La/m0x;La/ut90;)V

    .line 1067
    .line 1068
    .line 1069
    new-instance v0, La/ham;

    .line 1070
    .line 1071
    add-int v5, v14, v13

    .line 1072
    .line 1073
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v5

    .line 1077
    invoke-direct {v0, v5}, La/ham;-><init>(Ljava/lang/String;)V

    .line 1078
    .line 1079
    .line 1080
    new-instance v5, La/ham;

    .line 1081
    .line 1082
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v8

    .line 1086
    invoke-direct {v5, v8}, La/ham;-><init>(Ljava/lang/String;)V

    .line 1087
    .line 1088
    .line 1089
    new-instance v8, La/ham;

    .line 1090
    .line 1091
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v13

    .line 1095
    invoke-direct {v8, v13}, La/ham;-><init>(Ljava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    new-instance v13, La/ham;

    .line 1099
    .line 1100
    iget v14, v7, La/i2s0;->g:F

    .line 1101
    .line 1102
    invoke-static {v14}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v14

    .line 1106
    invoke-direct {v13, v14}, La/ham;-><init>(Ljava/lang/String;)V

    .line 1107
    .line 1108
    .line 1109
    new-instance v14, La/ham;

    .line 1110
    .line 1111
    iget v7, v7, La/i2s0;->h:F

    .line 1112
    .line 1113
    invoke-static {v7}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v7

    .line 1117
    invoke-direct {v14, v7}, La/ham;-><init>(Ljava/lang/String;)V

    .line 1118
    .line 1119
    .line 1120
    new-array v7, v11, [La/iam;

    .line 1121
    .line 1122
    aput-object v9, v7, v27

    .line 1123
    .line 1124
    const/16 v24, 0x1

    .line 1125
    .line 1126
    aput-object v0, v7, v24

    .line 1127
    .line 1128
    const/16 v23, 0x2

    .line 1129
    .line 1130
    aput-object v5, v7, v23

    .line 1131
    .line 1132
    const/16 v28, 0x3

    .line 1133
    .line 1134
    aput-object v8, v7, v28

    .line 1135
    .line 1136
    const/4 v11, 0x4

    .line 1137
    aput-object v13, v7, v11

    .line 1138
    .line 1139
    const/4 v11, 0x5

    .line 1140
    aput-object v14, v7, v11

    .line 1141
    .line 1142
    invoke-static {v7}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v21

    .line 1146
    move-object/from16 v17, v4

    .line 1147
    .line 1148
    move-object/from16 v20, v12

    .line 1149
    .line 1150
    invoke-direct/range {v15 .. v21}, La/fam;-><init>(Ljava/lang/String;La/n0x;La/ut90;La/tt90;Ljava/lang/String;La/i4;)V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1154
    .line 1155
    .line 1156
    move v4, v10

    .line 1157
    move/from16 v5, v27

    .line 1158
    .line 1159
    move-object/from16 v0, v29

    .line 1160
    .line 1161
    const v8, 0x7f1306e3

    .line 1162
    .line 1163
    .line 1164
    const/16 v9, 0x8

    .line 1165
    .line 1166
    const/16 v22, 0x0

    .line 1167
    .line 1168
    goto/16 :goto_f

    .line 1169
    .line 1170
    :cond_22
    invoke-static {}, La/q3d;->p()V

    .line 1171
    .line 1172
    .line 1173
    const/16 v22, 0x0

    .line 1174
    .line 1175
    throw v22

    .line 1176
    :cond_23
    move/from16 v27, v5

    .line 1177
    .line 1178
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    move/from16 v3, v27

    .line 1183
    .line 1184
    new-array v4, v3, [Ljava/lang/Object;

    .line 1185
    .line 1186
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v4

    .line 1190
    const v5, 0x7f1306e3

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v6, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v4

    .line 1197
    new-instance v14, La/jam;

    .line 1198
    .line 1199
    const/16 v5, 0x8

    .line 1200
    .line 1201
    invoke-direct {v14, v2, v0, v4, v5}, La/jam;-><init>(La/s9m;La/a4x;Ljava/lang/String;I)V

    .line 1202
    .line 1203
    .line 1204
    goto :goto_11

    .line 1205
    :cond_24
    move v3, v5

    .line 1206
    const/4 v14, 0x0

    .line 1207
    :goto_11
    if-nez v14, :cond_25

    .line 1208
    .line 1209
    sget-object v0, La/iun;->a:La/iun;

    .line 1210
    .line 1211
    :goto_12
    move-object v14, v0

    .line 1212
    goto :goto_13

    .line 1213
    :cond_25
    new-instance v0, La/l9t0;

    .line 1214
    .line 1215
    new-instance v28, La/hjm;

    .line 1216
    .line 1217
    new-array v2, v3, [Ljava/lang/Object;

    .line 1218
    .line 1219
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1220
    .line 1221
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v2

    .line 1225
    const v3, 0x7f130229

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v29

    .line 1232
    const/16 v40, 0x0

    .line 1233
    .line 1234
    const/16 v41, 0x1ffe

    .line 1235
    .line 1236
    const/16 v30, 0x0

    .line 1237
    .line 1238
    const/16 v31, 0x0

    .line 1239
    .line 1240
    const/16 v32, 0x0

    .line 1241
    .line 1242
    const/16 v33, 0x0

    .line 1243
    .line 1244
    const/16 v34, 0x0

    .line 1245
    .line 1246
    const/16 v35, 0x0

    .line 1247
    .line 1248
    const/16 v36, 0x0

    .line 1249
    .line 1250
    const/16 v37, 0x0

    .line 1251
    .line 1252
    const/16 v38, 0x0

    .line 1253
    .line 1254
    const/16 v39, 0x0

    .line 1255
    .line 1256
    invoke-direct/range {v28 .. v41}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1257
    .line 1258
    .line 1259
    move-object/from16 v1, v28

    .line 1260
    .line 1261
    const-string v2, "HEADER_BEST_PLAYERS"

    .line 1262
    .line 1263
    invoke-direct {v0, v2, v1}, La/l9t0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 1264
    .line 1265
    .line 1266
    new-instance v1, La/kdt0;

    .line 1267
    .line 1268
    const-string v2, "BEST_PLAYERS"

    .line 1269
    .line 1270
    invoke-direct {v1, v2, v14}, La/kdt0;-><init>(Ljava/lang/String;La/jam;)V

    .line 1271
    .line 1272
    .line 1273
    const/4 v11, 0x2

    .line 1274
    new-array v2, v11, [La/p6t0;

    .line 1275
    .line 1276
    const/16 v27, 0x0

    .line 1277
    .line 1278
    aput-object v0, v2, v27

    .line 1279
    .line 1280
    const/16 v24, 0x1

    .line 1281
    .line 1282
    aput-object v1, v2, v24

    .line 1283
    .line 1284
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v0

    .line 1288
    goto :goto_12

    .line 1289
    :cond_26
    const/4 v14, 0x0

    .line 1290
    :goto_13
    if-nez v14, :cond_27

    .line 1291
    .line 1292
    sget-object v14, La/iun;->a:La/iun;

    .line 1293
    .line 1294
    :cond_27
    :goto_14
    return-object v14

    .line 1295
    :pswitch_9
    move-object/from16 v0, p1

    .line 1296
    .line 1297
    check-cast v0, La/j0g0;

    .line 1298
    .line 1299
    if-eqz v0, :cond_34

    .line 1300
    .line 1301
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 1302
    .line 1303
    instance-of v1, v0, La/g0g0;

    .line 1304
    .line 1305
    if-eqz v1, :cond_28

    .line 1306
    .line 1307
    const/4 v0, 0x0

    .line 1308
    :cond_28
    check-cast v0, La/fn9;

    .line 1309
    .line 1310
    if-eqz v0, :cond_34

    .line 1311
    .line 1312
    iget-object v1, v15, La/ej1;->b:La/ctf0;

    .line 1313
    .line 1314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    .line 1316
    .line 1317
    iget-object v4, v0, La/fn9;->j:Ljava/util/List;

    .line 1318
    .line 1319
    new-instance v5, Ljava/util/ArrayList;

    .line 1320
    .line 1321
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1322
    .line 1323
    .line 1324
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v4

    .line 1328
    :goto_15
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1329
    .line 1330
    .line 1331
    move-result v6

    .line 1332
    if-eqz v6, :cond_2a

    .line 1333
    .line 1334
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v6

    .line 1338
    move-object v7, v6

    .line 1339
    check-cast v7, La/hn9;

    .line 1340
    .line 1341
    iget-wide v7, v7, La/hn9;->b:J

    .line 1342
    .line 1343
    cmp-long v7, v7, v16

    .line 1344
    .line 1345
    if-gez v7, :cond_29

    .line 1346
    .line 1347
    goto :goto_15

    .line 1348
    :cond_29
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1349
    .line 1350
    .line 1351
    goto :goto_15

    .line 1352
    :cond_2a
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1353
    .line 1354
    .line 1355
    move-result v4

    .line 1356
    if-nez v4, :cond_33

    .line 1357
    .line 1358
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1359
    .line 1360
    .line 1361
    move-result v4

    .line 1362
    if-eqz v4, :cond_2b

    .line 1363
    .line 1364
    goto/16 :goto_1d

    .line 1365
    .line 1366
    :cond_2b
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v4

    .line 1370
    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1371
    .line 1372
    .line 1373
    move-result v6

    .line 1374
    if-eqz v6, :cond_33

    .line 1375
    .line 1376
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v6

    .line 1380
    check-cast v6, La/hn9;

    .line 1381
    .line 1382
    iget-wide v6, v6, La/hn9;->b:J

    .line 1383
    .line 1384
    cmp-long v6, v6, v16

    .line 1385
    .line 1386
    if-nez v6, :cond_2c

    .line 1387
    .line 1388
    goto :goto_16

    .line 1389
    :cond_2c
    new-instance v4, Ljava/util/ArrayList;

    .line 1390
    .line 1391
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v5

    .line 1398
    :goto_17
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1399
    .line 1400
    .line 1401
    move-result v6

    .line 1402
    if-eqz v6, :cond_30

    .line 1403
    .line 1404
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v6

    .line 1408
    check-cast v6, La/hn9;

    .line 1409
    .line 1410
    iget-wide v7, v6, La/hn9;->b:J

    .line 1411
    .line 1412
    iget-object v9, v6, La/hn9;->a:Ljava/lang/String;

    .line 1413
    .line 1414
    iget-object v6, v6, La/hn9;->c:Ljava/util/List;

    .line 1415
    .line 1416
    iget-boolean v11, v0, La/fn9;->s:Z

    .line 1417
    .line 1418
    if-eqz v11, :cond_2d

    .line 1419
    .line 1420
    move-object v11, v3

    .line 1421
    goto :goto_18

    .line 1422
    :cond_2d
    move-object v11, v2

    .line 1423
    :goto_18
    invoke-static {v7, v8, v11}, La/zvw;->a0(JLjava/lang/String;)Ljava/lang/String;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v7

    .line 1427
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 1428
    .line 1429
    .line 1430
    move-result v8

    .line 1431
    if-eqz v8, :cond_2e

    .line 1432
    .line 1433
    new-instance v6, La/b3s0;

    .line 1434
    .line 1435
    new-instance v8, La/n0x;

    .line 1436
    .line 1437
    invoke-direct {v8, v10}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1438
    .line 1439
    .line 1440
    invoke-direct {v6, v8, v9, v7}, La/b3s0;-><init>(La/n0x;Ljava/lang/String;Ljava/lang/String;)V

    .line 1441
    .line 1442
    .line 1443
    invoke-static {v6}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v6

    .line 1447
    goto :goto_1a

    .line 1448
    :cond_2e
    new-instance v8, Ljava/util/ArrayList;

    .line 1449
    .line 1450
    invoke-static {v6, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1451
    .line 1452
    .line 1453
    move-result v11

    .line 1454
    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 1455
    .line 1456
    .line 1457
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v6

    .line 1461
    :goto_19
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1462
    .line 1463
    .line 1464
    move-result v11

    .line 1465
    if-eqz v11, :cond_2f

    .line 1466
    .line 1467
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v11

    .line 1471
    check-cast v11, La/po9;

    .line 1472
    .line 1473
    new-instance v13, La/b3s0;

    .line 1474
    .line 1475
    new-instance v14, La/n0x;

    .line 1476
    .line 1477
    iget-object v11, v11, La/po9;->c:Ljava/lang/String;

    .line 1478
    .line 1479
    invoke-direct {v14, v11}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1480
    .line 1481
    .line 1482
    invoke-direct {v13, v14, v9, v7}, La/b3s0;-><init>(La/n0x;Ljava/lang/String;Ljava/lang/String;)V

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1486
    .line 1487
    .line 1488
    goto :goto_19

    .line 1489
    :cond_2f
    move-object v6, v8

    .line 1490
    :goto_1a
    invoke-static {v4, v6}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1491
    .line 1492
    .line 1493
    goto :goto_17

    .line 1494
    :cond_30
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v0

    .line 1498
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v0

    .line 1502
    new-instance v2, Ljava/util/ArrayList;

    .line 1503
    .line 1504
    invoke-static {v0, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1505
    .line 1506
    .line 1507
    move-result v3

    .line 1508
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1509
    .line 1510
    .line 1511
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v0

    .line 1515
    const/4 v3, 0x0

    .line 1516
    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1517
    .line 1518
    .line 1519
    move-result v4

    .line 1520
    if-eqz v4, :cond_32

    .line 1521
    .line 1522
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v4

    .line 1526
    add-int/lit8 v5, v3, 0x1

    .line 1527
    .line 1528
    if-ltz v3, :cond_31

    .line 1529
    .line 1530
    check-cast v4, La/b3s0;

    .line 1531
    .line 1532
    new-instance v6, La/jnh;

    .line 1533
    .line 1534
    const-string v7, "PRIZE_POOL"

    .line 1535
    .line 1536
    invoke-static {v3, v7}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v3

    .line 1540
    iget-object v7, v4, La/b3s0;->a:Ljava/lang/String;

    .line 1541
    .line 1542
    iget-object v8, v4, La/b3s0;->b:La/n0x;

    .line 1543
    .line 1544
    iget-object v4, v4, La/b3s0;->c:Ljava/lang/String;

    .line 1545
    .line 1546
    invoke-direct {v6, v8, v3, v7, v4}, La/jnh;-><init>(La/n0x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1547
    .line 1548
    .line 1549
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1550
    .line 1551
    .line 1552
    move v3, v5

    .line 1553
    goto :goto_1b

    .line 1554
    :cond_31
    invoke-static {}, La/q3d;->p()V

    .line 1555
    .line 1556
    .line 1557
    const/16 v22, 0x0

    .line 1558
    .line 1559
    throw v22

    .line 1560
    :cond_32
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v0

    .line 1564
    new-instance v2, La/l9t0;

    .line 1565
    .line 1566
    new-instance v3, La/hjm;

    .line 1567
    .line 1568
    const/4 v4, 0x0

    .line 1569
    new-array v5, v4, [Ljava/lang/Object;

    .line 1570
    .line 1571
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1572
    .line 1573
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v5

    .line 1577
    const v6, 0x7f13164f

    .line 1578
    .line 1579
    .line 1580
    invoke-virtual {v1, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v5

    .line 1584
    new-instance v14, La/ue9;

    .line 1585
    .line 1586
    new-array v6, v4, [Ljava/lang/Object;

    .line 1587
    .line 1588
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v6

    .line 1592
    const v4, 0x7f1300e4

    .line 1593
    .line 1594
    .line 1595
    invoke-virtual {v1, v4, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v1

    .line 1599
    invoke-direct {v14, v1}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 1600
    .line 1601
    .line 1602
    const/4 v15, 0x0

    .line 1603
    const/16 v16, 0x1bfe

    .line 1604
    .line 1605
    move-object v4, v5

    .line 1606
    const/4 v5, 0x0

    .line 1607
    const/4 v6, 0x0

    .line 1608
    const/4 v7, 0x0

    .line 1609
    const/4 v8, 0x0

    .line 1610
    const/4 v9, 0x0

    .line 1611
    const/4 v10, 0x0

    .line 1612
    const/4 v11, 0x0

    .line 1613
    const/4 v12, 0x0

    .line 1614
    const/4 v13, 0x0

    .line 1615
    invoke-direct/range {v3 .. v16}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1616
    .line 1617
    .line 1618
    const-string v1, "HEADER_PRIZE_POOL"

    .line 1619
    .line 1620
    invoke-direct {v2, v1, v3}, La/l9t0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 1621
    .line 1622
    .line 1623
    new-instance v1, La/hat0;

    .line 1624
    .line 1625
    new-instance v3, La/knh;

    .line 1626
    .line 1627
    invoke-direct {v3, v0}, La/knh;-><init>(La/a4x;)V

    .line 1628
    .line 1629
    .line 1630
    invoke-direct {v1, v3}, La/hat0;-><init>(La/knh;)V

    .line 1631
    .line 1632
    .line 1633
    const/4 v11, 0x2

    .line 1634
    new-array v0, v11, [La/p6t0;

    .line 1635
    .line 1636
    const/16 v27, 0x0

    .line 1637
    .line 1638
    aput-object v2, v0, v27

    .line 1639
    .line 1640
    const/16 v24, 0x1

    .line 1641
    .line 1642
    aput-object v1, v0, v24

    .line 1643
    .line 1644
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v0

    .line 1648
    :goto_1c
    move-object v14, v0

    .line 1649
    goto :goto_1e

    .line 1650
    :cond_33
    :goto_1d
    sget-object v0, La/iun;->a:La/iun;

    .line 1651
    .line 1652
    goto :goto_1c

    .line 1653
    :cond_34
    const/4 v14, 0x0

    .line 1654
    :goto_1e
    if-nez v14, :cond_35

    .line 1655
    .line 1656
    sget-object v14, La/iun;->a:La/iun;

    .line 1657
    .line 1658
    :cond_35
    return-object v14

    .line 1659
    :pswitch_a
    move-object/from16 v0, p1

    .line 1660
    .line 1661
    check-cast v0, La/cdt0;

    .line 1662
    .line 1663
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1664
    .line 1665
    .line 1666
    iget-object v1, v0, La/cdt0;->c:La/xbt0;

    .line 1667
    .line 1668
    if-eqz v1, :cond_37

    .line 1669
    .line 1670
    iget-object v1, v1, La/xbt0;->a:Ljava/lang/Object;

    .line 1671
    .line 1672
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 1673
    .line 1674
    instance-of v2, v1, La/g0g0;

    .line 1675
    .line 1676
    if-eqz v2, :cond_36

    .line 1677
    .line 1678
    const/4 v1, 0x0

    .line 1679
    :cond_36
    check-cast v1, La/fn9;

    .line 1680
    .line 1681
    if-eqz v1, :cond_37

    .line 1682
    .line 1683
    iget-object v1, v1, La/fn9;->r:Ljava/util/List;

    .line 1684
    .line 1685
    goto :goto_1f

    .line 1686
    :cond_37
    const/4 v1, 0x0

    .line 1687
    :goto_1f
    iget v0, v0, La/cdt0;->i:I

    .line 1688
    .line 1689
    iget-object v2, v15, La/ej1;->b:La/ctf0;

    .line 1690
    .line 1691
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1692
    .line 1693
    .line 1694
    if-eqz v1, :cond_41

    .line 1695
    .line 1696
    new-instance v3, Ljava/util/ArrayList;

    .line 1697
    .line 1698
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1699
    .line 1700
    .line 1701
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v1

    .line 1705
    :cond_38
    :goto_20
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1706
    .line 1707
    .line 1708
    move-result v4

    .line 1709
    if-eqz v4, :cond_42

    .line 1710
    .line 1711
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v4

    .line 1715
    check-cast v4, La/io9;

    .line 1716
    .line 1717
    invoke-virtual {v4}, La/io9;->a()Ljava/lang/String;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v5

    .line 1721
    instance-of v8, v4, La/ho9;

    .line 1722
    .line 1723
    if-eqz v8, :cond_3c

    .line 1724
    .line 1725
    check-cast v4, La/ho9;

    .line 1726
    .line 1727
    iget-object v4, v4, La/ho9;->b:Ljava/util/List;

    .line 1728
    .line 1729
    new-instance v8, Ljava/util/ArrayList;

    .line 1730
    .line 1731
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1732
    .line 1733
    .line 1734
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v4

    .line 1738
    :goto_21
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1739
    .line 1740
    .line 1741
    move-result v9

    .line 1742
    if-eqz v9, :cond_39

    .line 1743
    .line 1744
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v9

    .line 1748
    check-cast v9, La/lm9;

    .line 1749
    .line 1750
    iget-object v9, v9, La/lm9;->b:Ljava/util/List;

    .line 1751
    .line 1752
    invoke-static {v8, v9}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1753
    .line 1754
    .line 1755
    goto :goto_21

    .line 1756
    :cond_39
    new-instance v4, Ljava/util/ArrayList;

    .line 1757
    .line 1758
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1759
    .line 1760
    .line 1761
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v8

    .line 1765
    :goto_22
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1766
    .line 1767
    .line 1768
    move-result v9

    .line 1769
    if-eqz v9, :cond_3a

    .line 1770
    .line 1771
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v9

    .line 1775
    check-cast v9, La/yn9;

    .line 1776
    .line 1777
    iget-object v9, v9, La/yn9;->c:Ljava/util/List;

    .line 1778
    .line 1779
    invoke-static {v4, v9}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1780
    .line 1781
    .line 1782
    goto :goto_22

    .line 1783
    :cond_3a
    new-instance v8, Ljava/util/ArrayList;

    .line 1784
    .line 1785
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1786
    .line 1787
    .line 1788
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v4

    .line 1792
    :goto_23
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1793
    .line 1794
    .line 1795
    move-result v9

    .line 1796
    if-eqz v9, :cond_3b

    .line 1797
    .line 1798
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v9

    .line 1802
    check-cast v9, La/tm9;

    .line 1803
    .line 1804
    iget-object v9, v9, La/tm9;->f:Ljava/util/List;

    .line 1805
    .line 1806
    invoke-static {v8, v9}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1807
    .line 1808
    .line 1809
    goto :goto_23

    .line 1810
    :cond_3b
    invoke-static {v8}, La/y0x0;->H(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v4

    .line 1814
    goto :goto_26

    .line 1815
    :cond_3c
    instance-of v8, v4, La/fo9;

    .line 1816
    .line 1817
    if-eqz v8, :cond_3f

    .line 1818
    .line 1819
    check-cast v4, La/fo9;

    .line 1820
    .line 1821
    iget-object v4, v4, La/fo9;->b:Ljava/util/List;

    .line 1822
    .line 1823
    new-instance v8, Ljava/util/ArrayList;

    .line 1824
    .line 1825
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1826
    .line 1827
    .line 1828
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v4

    .line 1832
    :goto_24
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1833
    .line 1834
    .line 1835
    move-result v9

    .line 1836
    if-eqz v9, :cond_3d

    .line 1837
    .line 1838
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v9

    .line 1842
    check-cast v9, La/dm9;

    .line 1843
    .line 1844
    iget-object v9, v9, La/dm9;->b:Ljava/util/List;

    .line 1845
    .line 1846
    invoke-static {v8, v9}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1847
    .line 1848
    .line 1849
    goto :goto_24

    .line 1850
    :cond_3d
    new-instance v4, Ljava/util/ArrayList;

    .line 1851
    .line 1852
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1853
    .line 1854
    .line 1855
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v8

    .line 1859
    :goto_25
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1860
    .line 1861
    .line 1862
    move-result v9

    .line 1863
    if-eqz v9, :cond_3e

    .line 1864
    .line 1865
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v9

    .line 1869
    check-cast v9, La/qn9;

    .line 1870
    .line 1871
    iget-object v9, v9, La/qn9;->b:Ljava/util/List;

    .line 1872
    .line 1873
    invoke-static {v4, v9}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1874
    .line 1875
    .line 1876
    goto :goto_25

    .line 1877
    :cond_3e
    invoke-static {v4}, La/y0x0;->H(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v4

    .line 1881
    goto :goto_26

    .line 1882
    :cond_3f
    sget-object v4, La/iun;->a:La/iun;

    .line 1883
    .line 1884
    :goto_26
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 1885
    .line 1886
    .line 1887
    move-result v8

    .line 1888
    if-eqz v8, :cond_40

    .line 1889
    .line 1890
    const/4 v8, 0x0

    .line 1891
    goto :goto_27

    .line 1892
    :cond_40
    new-instance v8, La/p1s0;

    .line 1893
    .line 1894
    invoke-direct {v8, v5, v4}, La/p1s0;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 1895
    .line 1896
    .line 1897
    :goto_27
    if-eqz v8, :cond_38

    .line 1898
    .line 1899
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1900
    .line 1901
    .line 1902
    goto/16 :goto_20

    .line 1903
    .line 1904
    :cond_41
    const/4 v3, 0x0

    .line 1905
    :cond_42
    if-nez v3, :cond_43

    .line 1906
    .line 1907
    sget-object v3, La/iun;->a:La/iun;

    .line 1908
    .line 1909
    :cond_43
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v1

    .line 1913
    check-cast v1, La/p1s0;

    .line 1914
    .line 1915
    if-nez v1, :cond_44

    .line 1916
    .line 1917
    sget-object v0, La/iun;->a:La/iun;

    .line 1918
    .line 1919
    goto/16 :goto_33

    .line 1920
    .line 1921
    :cond_44
    iget-object v1, v1, La/p1s0;->b:Ljava/util/List;

    .line 1922
    .line 1923
    new-instance v4, Ljava/util/ArrayList;

    .line 1924
    .line 1925
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1926
    .line 1927
    .line 1928
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v1

    .line 1932
    :goto_28
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1933
    .line 1934
    .line 1935
    move-result v5

    .line 1936
    if-eqz v5, :cond_45

    .line 1937
    .line 1938
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v5

    .line 1942
    check-cast v5, La/xm9;

    .line 1943
    .line 1944
    iget-object v8, v5, La/xm9;->d:La/bn9;

    .line 1945
    .line 1946
    iget-object v8, v8, La/bn9;->b:Ljava/lang/String;

    .line 1947
    .line 1948
    new-instance v9, Lkotlin/Pair;

    .line 1949
    .line 1950
    invoke-direct {v9, v8, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1951
    .line 1952
    .line 1953
    iget-object v8, v5, La/xm9;->e:La/bn9;

    .line 1954
    .line 1955
    iget-object v8, v8, La/bn9;->b:Ljava/lang/String;

    .line 1956
    .line 1957
    new-instance v11, Lkotlin/Pair;

    .line 1958
    .line 1959
    invoke-direct {v11, v8, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1960
    .line 1961
    .line 1962
    filled-new-array {v9, v11}, [Lkotlin/Pair;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v5

    .line 1966
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v5

    .line 1970
    invoke-static {v4, v5}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1971
    .line 1972
    .line 1973
    goto :goto_28

    .line 1974
    :cond_45
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 1975
    .line 1976
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1977
    .line 1978
    .line 1979
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v4

    .line 1983
    :goto_29
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1984
    .line 1985
    .line 1986
    move-result v5

    .line 1987
    if-eqz v5, :cond_47

    .line 1988
    .line 1989
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v5

    .line 1993
    check-cast v5, Lkotlin/Pair;

    .line 1994
    .line 1995
    iget-object v8, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1996
    .line 1997
    check-cast v8, Ljava/lang/String;

    .line 1998
    .line 1999
    invoke-virtual {v1, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v9

    .line 2003
    if-nez v9, :cond_46

    .line 2004
    .line 2005
    new-instance v9, Ljava/util/ArrayList;

    .line 2006
    .line 2007
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 2008
    .line 2009
    .line 2010
    invoke-interface {v1, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2011
    .line 2012
    .line 2013
    :cond_46
    check-cast v9, Ljava/util/List;

    .line 2014
    .line 2015
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 2016
    .line 2017
    check-cast v5, La/xm9;

    .line 2018
    .line 2019
    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2020
    .line 2021
    .line 2022
    goto :goto_29

    .line 2023
    :cond_47
    new-instance v4, Ljava/util/ArrayList;

    .line 2024
    .line 2025
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 2026
    .line 2027
    .line 2028
    move-result v5

    .line 2029
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 2030
    .line 2031
    .line 2032
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v1

    .line 2036
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v1

    .line 2040
    :goto_2a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2041
    .line 2042
    .line 2043
    move-result v5

    .line 2044
    if-eqz v5, :cond_4d

    .line 2045
    .line 2046
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v5

    .line 2050
    check-cast v5, Ljava/util/Map$Entry;

    .line 2051
    .line 2052
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v8

    .line 2056
    check-cast v8, Ljava/lang/String;

    .line 2057
    .line 2058
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v5

    .line 2062
    check-cast v5, Ljava/util/List;

    .line 2063
    .line 2064
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2065
    .line 2066
    .line 2067
    move-result-object v5

    .line 2068
    move-object/from16 v18, v10

    .line 2069
    .line 2070
    const/4 v9, 0x0

    .line 2071
    const/4 v14, 0x0

    .line 2072
    const/4 v15, 0x0

    .line 2073
    :goto_2b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2074
    .line 2075
    .line 2076
    move-result v11

    .line 2077
    if-eqz v11, :cond_4b

    .line 2078
    .line 2079
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v11

    .line 2083
    check-cast v11, La/xm9;

    .line 2084
    .line 2085
    iget-object v13, v11, La/xm9;->d:La/bn9;

    .line 2086
    .line 2087
    iget-object v11, v11, La/xm9;->e:La/bn9;

    .line 2088
    .line 2089
    iget-object v7, v13, La/bn9;->b:Ljava/lang/String;

    .line 2090
    .line 2091
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2092
    .line 2093
    .line 2094
    move-result v7

    .line 2095
    if-eqz v7, :cond_48

    .line 2096
    .line 2097
    new-instance v7, Lkotlin/Pair;

    .line 2098
    .line 2099
    invoke-direct {v7, v13, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2100
    .line 2101
    .line 2102
    goto :goto_2c

    .line 2103
    :cond_48
    new-instance v7, Lkotlin/Pair;

    .line 2104
    .line 2105
    invoke-direct {v7, v11, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2106
    .line 2107
    .line 2108
    :goto_2c
    iget-object v11, v7, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 2109
    .line 2110
    check-cast v11, La/bn9;

    .line 2111
    .line 2112
    iget-object v7, v7, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 2113
    .line 2114
    check-cast v7, La/bn9;

    .line 2115
    .line 2116
    iget-boolean v13, v11, La/bn9;->e:Z

    .line 2117
    .line 2118
    iget v6, v11, La/bn9;->d:I

    .line 2119
    .line 2120
    if-eqz v13, :cond_49

    .line 2121
    .line 2122
    add-int/2addr v14, v6

    .line 2123
    goto :goto_2d

    .line 2124
    :cond_49
    iget v13, v7, La/bn9;->d:I

    .line 2125
    .line 2126
    add-int/2addr v15, v13

    .line 2127
    :goto_2d
    iget v7, v7, La/bn9;->d:I

    .line 2128
    .line 2129
    add-int/2addr v6, v7

    .line 2130
    add-int/2addr v9, v6

    .line 2131
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 2132
    .line 2133
    .line 2134
    move-result v6

    .line 2135
    if-nez v6, :cond_4a

    .line 2136
    .line 2137
    iget-object v6, v11, La/bn9;->c:Ljava/lang/String;

    .line 2138
    .line 2139
    move-object/from16 v18, v6

    .line 2140
    .line 2141
    :cond_4a
    const/4 v6, 0x0

    .line 2142
    const v7, 0x7f130e4e

    .line 2143
    .line 2144
    .line 2145
    goto :goto_2b

    .line 2146
    :cond_4b
    if-lez v9, :cond_4c

    .line 2147
    .line 2148
    int-to-double v5, v14

    .line 2149
    int-to-double v12, v9

    .line 2150
    div-double/2addr v5, v12

    .line 2151
    const-wide/high16 v11, 0x4059000000000000L    # 100.0

    .line 2152
    .line 2153
    mul-double/2addr v5, v11

    .line 2154
    invoke-static {v5, v6}, La/si30;->a(D)I

    .line 2155
    .line 2156
    .line 2157
    move-result v5

    .line 2158
    goto :goto_2e

    .line 2159
    :cond_4c
    const/4 v5, 0x0

    .line 2160
    :goto_2e
    new-instance v13, La/k9t0;

    .line 2161
    .line 2162
    const-string v6, "%"

    .line 2163
    .line 2164
    invoke-static {v5, v6}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v19

    .line 2168
    move/from16 v16, v5

    .line 2169
    .line 2170
    move-object/from16 v17, v8

    .line 2171
    .line 2172
    invoke-direct/range {v13 .. v19}, La/k9t0;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2173
    .line 2174
    .line 2175
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2176
    .line 2177
    .line 2178
    const/4 v6, 0x0

    .line 2179
    const v7, 0x7f130e4e

    .line 2180
    .line 2181
    .line 2182
    const/16 v12, 0xa

    .line 2183
    .line 2184
    goto/16 :goto_2a

    .line 2185
    .line 2186
    :cond_4d
    sget-object v1, La/y0x0;->m:La/mto;

    .line 2187
    .line 2188
    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 2189
    .line 2190
    .line 2191
    move-result-object v1

    .line 2192
    new-instance v4, La/l9t0;

    .line 2193
    .line 2194
    new-instance v29, La/hjm;

    .line 2195
    .line 2196
    const/4 v5, 0x0

    .line 2197
    new-array v6, v5, [Ljava/lang/Object;

    .line 2198
    .line 2199
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 2200
    .line 2201
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v6

    .line 2205
    const v5, 0x7f1309a2

    .line 2206
    .line 2207
    .line 2208
    invoke-virtual {v2, v5, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v30

    .line 2212
    const/16 v41, 0x0

    .line 2213
    .line 2214
    const/16 v42, 0x1ffe

    .line 2215
    .line 2216
    const/16 v31, 0x0

    .line 2217
    .line 2218
    const/16 v32, 0x0

    .line 2219
    .line 2220
    const/16 v33, 0x0

    .line 2221
    .line 2222
    const/16 v34, 0x0

    .line 2223
    .line 2224
    const/16 v35, 0x0

    .line 2225
    .line 2226
    const/16 v36, 0x0

    .line 2227
    .line 2228
    const/16 v37, 0x0

    .line 2229
    .line 2230
    const/16 v38, 0x0

    .line 2231
    .line 2232
    const/16 v39, 0x0

    .line 2233
    .line 2234
    const/16 v40, 0x0

    .line 2235
    .line 2236
    invoke-direct/range {v29 .. v42}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 2237
    .line 2238
    .line 2239
    move-object/from16 v5, v29

    .line 2240
    .line 2241
    const-string v6, "HEADER_GROUP_STAGE"

    .line 2242
    .line 2243
    invoke-direct {v4, v6, v5}, La/l9t0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 2244
    .line 2245
    .line 2246
    new-instance v5, Ljava/util/ArrayList;

    .line 2247
    .line 2248
    const/16 v7, 0xa

    .line 2249
    .line 2250
    invoke-static {v3, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2251
    .line 2252
    .line 2253
    move-result v6

    .line 2254
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 2255
    .line 2256
    .line 2257
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v3

    .line 2261
    const/4 v6, 0x0

    .line 2262
    :goto_2f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2263
    .line 2264
    .line 2265
    move-result v8

    .line 2266
    if-eqz v8, :cond_50

    .line 2267
    .line 2268
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v8

    .line 2272
    add-int/lit8 v9, v6, 0x1

    .line 2273
    .line 2274
    if-ltz v6, :cond_4f

    .line 2275
    .line 2276
    check-cast v8, La/p1s0;

    .line 2277
    .line 2278
    new-instance v10, La/lxl;

    .line 2279
    .line 2280
    int-to-long v11, v6

    .line 2281
    new-instance v13, La/xxl;

    .line 2282
    .line 2283
    iget-object v8, v8, La/p1s0;->a:Ljava/lang/String;

    .line 2284
    .line 2285
    invoke-direct {v13, v8}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 2286
    .line 2287
    .line 2288
    if-ne v6, v0, :cond_4e

    .line 2289
    .line 2290
    sget-object v6, La/uxl;->b:La/uxl;

    .line 2291
    .line 2292
    :goto_30
    move-object v15, v6

    .line 2293
    goto :goto_31

    .line 2294
    :cond_4e
    sget-object v6, La/uxl;->a:La/uxl;

    .line 2295
    .line 2296
    goto :goto_30

    .line 2297
    :goto_31
    const/16 v16, 0x0

    .line 2298
    .line 2299
    const/16 v17, 0x6c

    .line 2300
    .line 2301
    const/4 v14, 0x0

    .line 2302
    invoke-direct/range {v10 .. v17}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 2303
    .line 2304
    .line 2305
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2306
    .line 2307
    .line 2308
    move v6, v9

    .line 2309
    goto :goto_2f

    .line 2310
    :cond_4f
    invoke-static {}, La/q3d;->p()V

    .line 2311
    .line 2312
    .line 2313
    const/16 v22, 0x0

    .line 2314
    .line 2315
    throw v22

    .line 2316
    :cond_50
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v9

    .line 2320
    const/high16 v0, 0x41000000    # 8.0f

    .line 2321
    .line 2322
    const/4 v3, 0x0

    .line 2323
    const/4 v11, 0x2

    .line 2324
    invoke-static {v0, v3, v11}, La/s5x0;->t(FFI)La/lh80;

    .line 2325
    .line 2326
    .line 2327
    move-result-object v12

    .line 2328
    new-instance v8, La/fyl;

    .line 2329
    .line 2330
    const/4 v10, 0x0

    .line 2331
    const/4 v11, 0x0

    .line 2332
    const/4 v13, 0x0

    .line 2333
    const/16 v14, 0x16

    .line 2334
    .line 2335
    invoke-direct/range {v8 .. v14}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 2336
    .line 2337
    .line 2338
    new-instance v0, La/a9t0;

    .line 2339
    .line 2340
    invoke-direct {v0, v8}, La/a9t0;-><init>(La/fyl;)V

    .line 2341
    .line 2342
    .line 2343
    new-instance v3, La/kdt0;

    .line 2344
    .line 2345
    new-instance v5, La/q9m;

    .line 2346
    .line 2347
    const/4 v6, 0x0

    .line 2348
    new-array v8, v6, [Ljava/lang/Object;

    .line 2349
    .line 2350
    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v8

    .line 2354
    const v9, 0x7f130e4e

    .line 2355
    .line 2356
    .line 2357
    invoke-virtual {v2, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2358
    .line 2359
    .line 2360
    move-result-object v8

    .line 2361
    new-array v9, v6, [Ljava/lang/Object;

    .line 2362
    .line 2363
    invoke-static {v9, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2364
    .line 2365
    .line 2366
    move-result-object v9

    .line 2367
    const v10, 0x7f13149e

    .line 2368
    .line 2369
    .line 2370
    invoke-virtual {v2, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2371
    .line 2372
    .line 2373
    move-result-object v9

    .line 2374
    new-array v10, v6, [Ljava/lang/Object;

    .line 2375
    .line 2376
    invoke-static {v10, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2377
    .line 2378
    .line 2379
    move-result-object v10

    .line 2380
    const v11, 0x7f130c88

    .line 2381
    .line 2382
    .line 2383
    invoke-virtual {v2, v11, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2384
    .line 2385
    .line 2386
    move-result-object v10

    .line 2387
    new-array v11, v6, [Ljava/lang/Object;

    .line 2388
    .line 2389
    invoke-static {v11, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2390
    .line 2391
    .line 2392
    move-result-object v11

    .line 2393
    const v12, 0x7f130c87

    .line 2394
    .line 2395
    .line 2396
    invoke-virtual {v2, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2397
    .line 2398
    .line 2399
    move-result-object v11

    .line 2400
    new-array v12, v6, [Ljava/lang/Object;

    .line 2401
    .line 2402
    invoke-static {v12, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2403
    .line 2404
    .line 2405
    move-result-object v12

    .line 2406
    const v6, 0x7f130ba3

    .line 2407
    .line 2408
    .line 2409
    invoke-virtual {v2, v6, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2410
    .line 2411
    .line 2412
    move-result-object v6

    .line 2413
    filled-new-array {v10, v11, v6}, [Ljava/lang/String;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v6

    .line 2417
    invoke-static {v6}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 2418
    .line 2419
    .line 2420
    move-result-object v6

    .line 2421
    invoke-direct {v5, v6, v8, v9}, La/q9m;-><init>(La/i4;Ljava/lang/String;Ljava/lang/String;)V

    .line 2422
    .line 2423
    .line 2424
    new-instance v6, Ljava/util/ArrayList;

    .line 2425
    .line 2426
    const/16 v7, 0xa

    .line 2427
    .line 2428
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2429
    .line 2430
    .line 2431
    move-result v7

    .line 2432
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 2433
    .line 2434
    .line 2435
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2436
    .line 2437
    .line 2438
    move-result-object v1

    .line 2439
    const/4 v7, 0x0

    .line 2440
    :goto_32
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2441
    .line 2442
    .line 2443
    move-result v8

    .line 2444
    if-eqz v8, :cond_52

    .line 2445
    .line 2446
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2447
    .line 2448
    .line 2449
    move-result-object v8

    .line 2450
    add-int/lit8 v9, v7, 0x1

    .line 2451
    .line 2452
    if-ltz v7, :cond_51

    .line 2453
    .line 2454
    check-cast v8, La/k9t0;

    .line 2455
    .line 2456
    new-instance v10, La/fam;

    .line 2457
    .line 2458
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2459
    .line 2460
    .line 2461
    move-result-object v11

    .line 2462
    new-instance v12, La/n0x;

    .line 2463
    .line 2464
    iget-object v7, v8, La/k9t0;->b:Ljava/lang/String;

    .line 2465
    .line 2466
    invoke-direct {v12, v7}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2467
    .line 2468
    .line 2469
    iget-object v15, v8, La/k9t0;->a:Ljava/lang/String;

    .line 2470
    .line 2471
    new-instance v7, La/ham;

    .line 2472
    .line 2473
    iget v13, v8, La/k9t0;->c:I

    .line 2474
    .line 2475
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2476
    .line 2477
    .line 2478
    move-result-object v13

    .line 2479
    invoke-direct {v7, v13}, La/ham;-><init>(Ljava/lang/String;)V

    .line 2480
    .line 2481
    .line 2482
    new-instance v13, La/ham;

    .line 2483
    .line 2484
    iget v14, v8, La/k9t0;->d:I

    .line 2485
    .line 2486
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2487
    .line 2488
    .line 2489
    move-result-object v14

    .line 2490
    invoke-direct {v13, v14}, La/ham;-><init>(Ljava/lang/String;)V

    .line 2491
    .line 2492
    .line 2493
    new-instance v14, La/ham;

    .line 2494
    .line 2495
    iget-object v8, v8, La/k9t0;->f:Ljava/lang/String;

    .line 2496
    .line 2497
    invoke-direct {v14, v8}, La/ham;-><init>(Ljava/lang/String;)V

    .line 2498
    .line 2499
    .line 2500
    filled-new-array {v7, v13, v14}, [La/ham;

    .line 2501
    .line 2502
    .line 2503
    move-result-object v7

    .line 2504
    invoke-static {v7}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 2505
    .line 2506
    .line 2507
    move-result-object v16

    .line 2508
    sget-object v13, La/ut90;->c:La/ut90;

    .line 2509
    .line 2510
    sget-object v14, La/st90;->a:La/st90;

    .line 2511
    .line 2512
    invoke-direct/range {v10 .. v16}, La/fam;-><init>(Ljava/lang/String;La/n0x;La/ut90;La/tt90;Ljava/lang/String;La/i4;)V

    .line 2513
    .line 2514
    .line 2515
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2516
    .line 2517
    .line 2518
    move v7, v9

    .line 2519
    goto :goto_32

    .line 2520
    :cond_51
    invoke-static {}, La/q3d;->p()V

    .line 2521
    .line 2522
    .line 2523
    const/16 v22, 0x0

    .line 2524
    .line 2525
    throw v22

    .line 2526
    :cond_52
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2527
    .line 2528
    .line 2529
    move-result-object v1

    .line 2530
    const/4 v6, 0x0

    .line 2531
    new-array v7, v6, [Ljava/lang/Object;

    .line 2532
    .line 2533
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v7

    .line 2537
    const v8, 0x7f1306e3

    .line 2538
    .line 2539
    .line 2540
    invoke-virtual {v2, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2541
    .line 2542
    .line 2543
    move-result-object v2

    .line 2544
    new-instance v7, La/jam;

    .line 2545
    .line 2546
    const/16 v8, 0x8

    .line 2547
    .line 2548
    invoke-direct {v7, v5, v1, v2, v8}, La/jam;-><init>(La/s9m;La/a4x;Ljava/lang/String;I)V

    .line 2549
    .line 2550
    .line 2551
    const-string v1, "GROUP_STAGE"

    .line 2552
    .line 2553
    invoke-direct {v3, v1, v7}, La/kdt0;-><init>(Ljava/lang/String;La/jam;)V

    .line 2554
    .line 2555
    .line 2556
    const/4 v11, 0x3

    .line 2557
    new-array v1, v11, [La/p6t0;

    .line 2558
    .line 2559
    aput-object v4, v1, v6

    .line 2560
    .line 2561
    const/16 v24, 0x1

    .line 2562
    .line 2563
    aput-object v0, v1, v24

    .line 2564
    .line 2565
    const/16 v23, 0x2

    .line 2566
    .line 2567
    aput-object v3, v1, v23

    .line 2568
    .line 2569
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 2570
    .line 2571
    .line 2572
    move-result-object v0

    .line 2573
    :goto_33
    return-object v0

    .line 2574
    :pswitch_b
    move-object/from16 v0, p1

    .line 2575
    .line 2576
    check-cast v0, La/j0g0;

    .line 2577
    .line 2578
    if-eqz v0, :cond_54

    .line 2579
    .line 2580
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 2581
    .line 2582
    instance-of v1, v0, La/g0g0;

    .line 2583
    .line 2584
    if-eqz v1, :cond_53

    .line 2585
    .line 2586
    const/4 v0, 0x0

    .line 2587
    :cond_53
    check-cast v0, La/fn9;

    .line 2588
    .line 2589
    goto :goto_34

    .line 2590
    :cond_54
    const/4 v0, 0x0

    .line 2591
    :goto_34
    iget-object v1, v15, La/ej1;->b:La/ctf0;

    .line 2592
    .line 2593
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2594
    .line 2595
    .line 2596
    if-eqz v0, :cond_59

    .line 2597
    .line 2598
    iget-object v0, v0, La/fn9;->l:Ljava/util/List;

    .line 2599
    .line 2600
    if-eqz v0, :cond_59

    .line 2601
    .line 2602
    new-instance v2, Ljava/util/ArrayList;

    .line 2603
    .line 2604
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2605
    .line 2606
    .line 2607
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2608
    .line 2609
    .line 2610
    move-result-object v0

    .line 2611
    const/4 v4, 0x0

    .line 2612
    :goto_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2613
    .line 2614
    .line 2615
    move-result v3

    .line 2616
    if-eqz v3, :cond_58

    .line 2617
    .line 2618
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2619
    .line 2620
    .line 2621
    move-result-object v3

    .line 2622
    add-int/lit8 v9, v4, 0x1

    .line 2623
    .line 2624
    if-ltz v4, :cond_57

    .line 2625
    .line 2626
    check-cast v3, La/po9;

    .line 2627
    .line 2628
    iget-wide v5, v3, La/po9;->a:J

    .line 2629
    .line 2630
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2631
    .line 2632
    .line 2633
    move-result-object v5

    .line 2634
    new-instance v6, La/n0x;

    .line 2635
    .line 2636
    iget-object v7, v3, La/po9;->c:Ljava/lang/String;

    .line 2637
    .line 2638
    invoke-direct {v6, v7}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2639
    .line 2640
    .line 2641
    iget-object v7, v3, La/po9;->b:Ljava/lang/String;

    .line 2642
    .line 2643
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 2644
    .line 2645
    .line 2646
    move-result v8

    .line 2647
    if-nez v8, :cond_55

    .line 2648
    .line 2649
    const/4 v3, 0x0

    .line 2650
    goto :goto_36

    .line 2651
    :cond_55
    iget-boolean v8, v3, La/po9;->d:Z

    .line 2652
    .line 2653
    new-instance v3, La/y8m;

    .line 2654
    .line 2655
    invoke-direct/range {v3 .. v8}, La/y8m;-><init>(ILjava/lang/String;La/n0x;Ljava/lang/String;Z)V

    .line 2656
    .line 2657
    .line 2658
    :goto_36
    if-eqz v3, :cond_56

    .line 2659
    .line 2660
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2661
    .line 2662
    .line 2663
    :cond_56
    move v4, v9

    .line 2664
    goto :goto_35

    .line 2665
    :cond_57
    invoke-static {}, La/q3d;->p()V

    .line 2666
    .line 2667
    .line 2668
    const/16 v22, 0x0

    .line 2669
    .line 2670
    throw v22

    .line 2671
    :cond_58
    move-object v14, v2

    .line 2672
    goto :goto_37

    .line 2673
    :cond_59
    const/16 v22, 0x0

    .line 2674
    .line 2675
    move-object/from16 v14, v22

    .line 2676
    .line 2677
    :goto_37
    if-nez v14, :cond_5a

    .line 2678
    .line 2679
    sget-object v14, La/iun;->a:La/iun;

    .line 2680
    .line 2681
    :cond_5a
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 2682
    .line 2683
    .line 2684
    move-result v0

    .line 2685
    if-eqz v0, :cond_5b

    .line 2686
    .line 2687
    sget-object v0, La/iun;->a:La/iun;

    .line 2688
    .line 2689
    goto :goto_38

    .line 2690
    :cond_5b
    new-instance v0, La/l9t0;

    .line 2691
    .line 2692
    new-instance v28, La/hjm;

    .line 2693
    .line 2694
    const/4 v6, 0x0

    .line 2695
    new-array v2, v6, [Ljava/lang/Object;

    .line 2696
    .line 2697
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 2698
    .line 2699
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2700
    .line 2701
    .line 2702
    move-result-object v2

    .line 2703
    const v3, 0x7f1314d2

    .line 2704
    .line 2705
    .line 2706
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2707
    .line 2708
    .line 2709
    move-result-object v29

    .line 2710
    const/16 v40, 0x0

    .line 2711
    .line 2712
    const/16 v41, 0x1ffe

    .line 2713
    .line 2714
    const/16 v30, 0x0

    .line 2715
    .line 2716
    const/16 v31, 0x0

    .line 2717
    .line 2718
    const/16 v32, 0x0

    .line 2719
    .line 2720
    const/16 v33, 0x0

    .line 2721
    .line 2722
    const/16 v34, 0x0

    .line 2723
    .line 2724
    const/16 v35, 0x0

    .line 2725
    .line 2726
    const/16 v36, 0x0

    .line 2727
    .line 2728
    const/16 v37, 0x0

    .line 2729
    .line 2730
    const/16 v38, 0x0

    .line 2731
    .line 2732
    const/16 v39, 0x0

    .line 2733
    .line 2734
    invoke-direct/range {v28 .. v41}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 2735
    .line 2736
    .line 2737
    move-object/from16 v1, v28

    .line 2738
    .line 2739
    const-string v2, "HEADER_TEAMS"

    .line 2740
    .line 2741
    invoke-direct {v0, v2, v1}, La/l9t0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 2742
    .line 2743
    .line 2744
    new-instance v1, La/ddt0;

    .line 2745
    .line 2746
    new-instance v2, La/d9m;

    .line 2747
    .line 2748
    invoke-static {v14}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2749
    .line 2750
    .line 2751
    move-result-object v3

    .line 2752
    invoke-direct {v2, v3}, La/d9m;-><init>(La/a4x;)V

    .line 2753
    .line 2754
    .line 2755
    invoke-direct {v1, v2}, La/ddt0;-><init>(La/d9m;)V

    .line 2756
    .line 2757
    .line 2758
    const/4 v11, 0x2

    .line 2759
    new-array v2, v11, [La/p6t0;

    .line 2760
    .line 2761
    const/16 v27, 0x0

    .line 2762
    .line 2763
    aput-object v0, v2, v27

    .line 2764
    .line 2765
    const/16 v24, 0x1

    .line 2766
    .line 2767
    aput-object v1, v2, v24

    .line 2768
    .line 2769
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 2770
    .line 2771
    .line 2772
    move-result-object v0

    .line 2773
    :goto_38
    return-object v0

    .line 2774
    :pswitch_c
    const/16 v22, 0x0

    .line 2775
    .line 2776
    move-object/from16 v0, p1

    .line 2777
    .line 2778
    check-cast v0, La/xbt0;

    .line 2779
    .line 2780
    iget-object v1, v15, La/ej1;->q:Ljava/lang/Object;

    .line 2781
    .line 2782
    check-cast v1, La/cdt0;

    .line 2783
    .line 2784
    iget-object v4, v1, La/cdt0;->b:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;

    .line 2785
    .line 2786
    iget-object v5, v15, La/ej1;->b:La/ctf0;

    .line 2787
    .line 2788
    iget-boolean v1, v1, La/cdt0;->g:Z

    .line 2789
    .line 2790
    iget-object v6, v4, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->b:Ljava/lang/String;

    .line 2791
    .line 2792
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2793
    .line 2794
    .line 2795
    if-eqz v0, :cond_7c

    .line 2796
    .line 2797
    iget-object v9, v0, La/xbt0;->a:Ljava/lang/Object;

    .line 2798
    .line 2799
    sget-object v10, La/j0g0;->b:La/e0g0;

    .line 2800
    .line 2801
    instance-of v10, v9, La/g0g0;

    .line 2802
    .line 2803
    if-eqz v10, :cond_5c

    .line 2804
    .line 2805
    move-object/from16 v9, v22

    .line 2806
    .line 2807
    :cond_5c
    check-cast v9, La/fn9;

    .line 2808
    .line 2809
    iget-object v10, v0, La/xbt0;->b:Ljava/lang/Object;

    .line 2810
    .line 2811
    instance-of v11, v10, La/g0g0;

    .line 2812
    .line 2813
    if-eqz v11, :cond_5d

    .line 2814
    .line 2815
    move-object/from16 v10, v22

    .line 2816
    .line 2817
    :cond_5d
    check-cast v10, La/fcg;

    .line 2818
    .line 2819
    if-eqz v10, :cond_5f

    .line 2820
    .line 2821
    iget-object v10, v10, La/fcg;->a:Ljava/util/List;

    .line 2822
    .line 2823
    if-eqz v10, :cond_5f

    .line 2824
    .line 2825
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2826
    .line 2827
    .line 2828
    move-result-object v10

    .line 2829
    check-cast v10, La/d0t;

    .line 2830
    .line 2831
    if-eqz v10, :cond_5f

    .line 2832
    .line 2833
    iget-object v10, v10, La/d0t;->o:Ljava/lang/String;

    .line 2834
    .line 2835
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 2836
    .line 2837
    .line 2838
    move-result v11

    .line 2839
    if-nez v11, :cond_5e

    .line 2840
    .line 2841
    move-object/from16 v10, v22

    .line 2842
    .line 2843
    :cond_5e
    if-nez v10, :cond_66

    .line 2844
    .line 2845
    :cond_5f
    iget-object v10, v0, La/xbt0;->c:Ljava/lang/Object;

    .line 2846
    .line 2847
    instance-of v11, v10, La/g0g0;

    .line 2848
    .line 2849
    if-eqz v11, :cond_60

    .line 2850
    .line 2851
    move-object/from16 v10, v22

    .line 2852
    .line 2853
    :cond_60
    check-cast v10, La/fcg;

    .line 2854
    .line 2855
    if-eqz v10, :cond_61

    .line 2856
    .line 2857
    iget-object v10, v10, La/fcg;->a:Ljava/util/List;

    .line 2858
    .line 2859
    if-eqz v10, :cond_61

    .line 2860
    .line 2861
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2862
    .line 2863
    .line 2864
    move-result-object v10

    .line 2865
    check-cast v10, La/d0t;

    .line 2866
    .line 2867
    if-eqz v10, :cond_61

    .line 2868
    .line 2869
    iget-object v10, v10, La/d0t;->o:Ljava/lang/String;

    .line 2870
    .line 2871
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 2872
    .line 2873
    .line 2874
    move-result v11

    .line 2875
    if-nez v11, :cond_62

    .line 2876
    .line 2877
    :cond_61
    move-object/from16 v10, v22

    .line 2878
    .line 2879
    :cond_62
    if-nez v10, :cond_66

    .line 2880
    .line 2881
    iget-object v10, v0, La/xbt0;->j:Ljava/lang/Object;

    .line 2882
    .line 2883
    instance-of v11, v10, La/g0g0;

    .line 2884
    .line 2885
    if-eqz v11, :cond_63

    .line 2886
    .line 2887
    move-object/from16 v10, v22

    .line 2888
    .line 2889
    :cond_63
    check-cast v10, La/qbt0;

    .line 2890
    .line 2891
    if-eqz v10, :cond_65

    .line 2892
    .line 2893
    iget-object v10, v10, La/qbt0;->b:Ljava/lang/Object;

    .line 2894
    .line 2895
    instance-of v11, v10, La/g0g0;

    .line 2896
    .line 2897
    if-eqz v11, :cond_64

    .line 2898
    .line 2899
    move-object/from16 v10, v22

    .line 2900
    .line 2901
    :cond_64
    check-cast v10, Ljava/util/List;

    .line 2902
    .line 2903
    if-eqz v10, :cond_65

    .line 2904
    .line 2905
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2906
    .line 2907
    .line 2908
    move-result-object v10

    .line 2909
    check-cast v10, La/icg;

    .line 2910
    .line 2911
    if-eqz v10, :cond_65

    .line 2912
    .line 2913
    iget-object v10, v10, La/icg;->b:Ljava/lang/String;

    .line 2914
    .line 2915
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 2916
    .line 2917
    .line 2918
    move-result v11

    .line 2919
    if-nez v11, :cond_66

    .line 2920
    .line 2921
    :cond_65
    move-object/from16 v10, v22

    .line 2922
    .line 2923
    :cond_66
    if-eqz v10, :cond_67

    .line 2924
    .line 2925
    const-string v11, ". "

    .line 2926
    .line 2927
    invoke-static {v10, v11, v10}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2928
    .line 2929
    .line 2930
    move-result-object v14

    .line 2931
    goto :goto_39

    .line 2932
    :cond_67
    move-object/from16 v14, v22

    .line 2933
    .line 2934
    :goto_39
    iget-object v10, v0, La/xbt0;->e:La/ypl0;

    .line 2935
    .line 2936
    iget-object v10, v10, La/ypl0;->c:La/lel0;

    .line 2937
    .line 2938
    iget-object v0, v0, La/xbt0;->f:La/qgg;

    .line 2939
    .line 2940
    new-instance v11, La/edt0;

    .line 2941
    .line 2942
    invoke-static {v14, v6}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2943
    .line 2944
    .line 2945
    move-result-object v12

    .line 2946
    new-instance v18, La/fcm;

    .line 2947
    .line 2948
    if-eqz v9, :cond_68

    .line 2949
    .line 2950
    iget-wide v7, v9, La/fn9;->a:J

    .line 2951
    .line 2952
    :goto_3a
    move-wide/from16 v19, v7

    .line 2953
    .line 2954
    goto :goto_3b

    .line 2955
    :cond_68
    iget-wide v7, v4, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->a:J

    .line 2956
    .line 2957
    goto :goto_3a

    .line 2958
    :goto_3b
    new-instance v4, La/ecm;

    .line 2959
    .line 2960
    invoke-static {v14, v6}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2961
    .line 2962
    .line 2963
    move-result-object v6

    .line 2964
    invoke-direct {v4, v6}, La/ecm;-><init>(Ljava/lang/String;)V

    .line 2965
    .line 2966
    .line 2967
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 2968
    .line 2969
    .line 2970
    move-result-object v6

    .line 2971
    new-instance v7, La/vbm;

    .line 2972
    .line 2973
    new-instance v8, La/n0x;

    .line 2974
    .line 2975
    new-instance v13, Ljava/lang/StringBuilder;

    .line 2976
    .line 2977
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 2978
    .line 2979
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2980
    .line 2981
    .line 2982
    iget-object v14, v10, La/lel0;->a:Ljava/lang/String;

    .line 2983
    .line 2984
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2985
    .line 2986
    .line 2987
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 2988
    .line 2989
    .line 2990
    move-result v15

    .line 2991
    move/from16 v25, v1

    .line 2992
    .line 2993
    const-string v1, "/"

    .line 2994
    .line 2995
    move-object/from16 v21, v2

    .line 2996
    .line 2997
    const-string v2, "https://"

    .line 2998
    .line 2999
    move-object/from16 v22, v3

    .line 3000
    .line 3001
    if-nez v15, :cond_69

    .line 3002
    .line 3003
    const/4 v15, 0x0

    .line 3004
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 3005
    .line 3006
    .line 3007
    goto :goto_3e

    .line 3008
    :cond_69
    const/4 v15, 0x0

    .line 3009
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 3010
    .line 3011
    invoke-static {v14, v3, v15}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 3012
    .line 3013
    .line 3014
    move-result v3

    .line 3015
    if-nez v3, :cond_6c

    .line 3016
    .line 3017
    invoke-static {v14, v2, v15}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 3018
    .line 3019
    .line 3020
    move-result v3

    .line 3021
    if-eqz v3, :cond_6a

    .line 3022
    .line 3023
    const/4 v15, 0x0

    .line 3024
    goto :goto_3d

    .line 3025
    :cond_6a
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 3026
    .line 3027
    .line 3028
    move-result v3

    .line 3029
    if-lez v3, :cond_6b

    .line 3030
    .line 3031
    invoke-static {v13, v1}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 3032
    .line 3033
    .line 3034
    move-result v3

    .line 3035
    if-nez v3, :cond_6b

    .line 3036
    .line 3037
    const/16 v3, 0x2f

    .line 3038
    .line 3039
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3040
    .line 3041
    .line 3042
    move/from16 v26, v3

    .line 3043
    .line 3044
    const/4 v15, 0x1

    .line 3045
    goto :goto_3c

    .line 3046
    :cond_6b
    const/4 v15, 0x1

    .line 3047
    const/16 v26, 0x2f

    .line 3048
    .line 3049
    :goto_3c
    new-array v3, v15, [C

    .line 3050
    .line 3051
    const/4 v15, 0x0

    .line 3052
    aput-char v26, v3, v15

    .line 3053
    .line 3054
    invoke-static {v14, v3}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 3055
    .line 3056
    .line 3057
    move-result-object v3

    .line 3058
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3059
    .line 3060
    .line 3061
    goto :goto_3e

    .line 3062
    :cond_6c
    :goto_3d
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 3063
    .line 3064
    .line 3065
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3066
    .line 3067
    .line 3068
    :goto_3e
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3069
    .line 3070
    .line 3071
    move-result-object v3

    .line 3072
    invoke-direct {v8, v3}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 3073
    .line 3074
    .line 3075
    sget-object v3, La/ubm;->a:La/ubm;

    .line 3076
    .line 3077
    sget-object v3, La/rbm;->a:La/rbm;

    .line 3078
    .line 3079
    invoke-direct {v7, v8, v3}, La/vbm;-><init>(La/n0x;La/tbm;)V

    .line 3080
    .line 3081
    .line 3082
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3083
    .line 3084
    .line 3085
    if-eqz v9, :cond_6d

    .line 3086
    .line 3087
    iget v3, v9, La/fn9;->k:I

    .line 3088
    .line 3089
    if-lez v3, :cond_6d

    .line 3090
    .line 3091
    new-instance v7, La/wbm;

    .line 3092
    .line 3093
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3094
    .line 3095
    .line 3096
    move-result-object v3

    .line 3097
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 3098
    .line 3099
    .line 3100
    move-result-object v3

    .line 3101
    iget-object v8, v5, La/ctf0;->b:La/lsm0;

    .line 3102
    .line 3103
    const/4 v15, 0x1

    .line 3104
    invoke-static {v3, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3105
    .line 3106
    .line 3107
    move-result-object v3

    .line 3108
    const v13, 0x7f1316fb

    .line 3109
    .line 3110
    .line 3111
    invoke-virtual {v8, v13, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3112
    .line 3113
    .line 3114
    move-result-object v3

    .line 3115
    const-wide/16 v13, 0x2

    .line 3116
    .line 3117
    invoke-direct {v7, v13, v14, v3}, La/wbm;-><init>(JLjava/lang/String;)V

    .line 3118
    .line 3119
    .line 3120
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3121
    .line 3122
    .line 3123
    :cond_6d
    if-eqz v9, :cond_6f

    .line 3124
    .line 3125
    iget-wide v7, v9, La/fn9;->i:J

    .line 3126
    .line 3127
    cmp-long v3, v7, v16

    .line 3128
    .line 3129
    if-lez v3, :cond_6f

    .line 3130
    .line 3131
    new-instance v3, La/wbm;

    .line 3132
    .line 3133
    iget-boolean v13, v9, La/fn9;->s:Z

    .line 3134
    .line 3135
    if-eqz v13, :cond_6e

    .line 3136
    .line 3137
    move-object/from16 v13, v22

    .line 3138
    .line 3139
    goto :goto_3f

    .line 3140
    :cond_6e
    move-object/from16 v13, v21

    .line 3141
    .line 3142
    :goto_3f
    invoke-static {v7, v8, v13}, La/zvw;->a0(JLjava/lang/String;)Ljava/lang/String;

    .line 3143
    .line 3144
    .line 3145
    move-result-object v7

    .line 3146
    const-wide/16 v13, 0x3

    .line 3147
    .line 3148
    invoke-direct {v3, v13, v14, v7}, La/wbm;-><init>(JLjava/lang/String;)V

    .line 3149
    .line 3150
    .line 3151
    invoke-virtual {v6, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3152
    .line 3153
    .line 3154
    :cond_6f
    if-eqz v9, :cond_70

    .line 3155
    .line 3156
    iget-object v3, v9, La/fn9;->h:Ljava/lang/String;

    .line 3157
    .line 3158
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 3159
    .line 3160
    .line 3161
    move-result v7

    .line 3162
    if-lez v7, :cond_70

    .line 3163
    .line 3164
    new-instance v28, La/xbm;

    .line 3165
    .line 3166
    new-instance v7, La/n0x;

    .line 3167
    .line 3168
    iget-object v8, v9, La/fn9;->u:Ljava/lang/String;

    .line 3169
    .line 3170
    invoke-direct {v7, v8}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 3171
    .line 3172
    .line 3173
    sget-object v33, La/ubm;->b:La/ubm;

    .line 3174
    .line 3175
    const v34, 0x7f08082c

    .line 3176
    .line 3177
    .line 3178
    const-wide/16 v29, 0x4

    .line 3179
    .line 3180
    move-object/from16 v31, v3

    .line 3181
    .line 3182
    move-object/from16 v32, v7

    .line 3183
    .line 3184
    invoke-direct/range {v28 .. v34}, La/xbm;-><init>(JLjava/lang/String;La/o0x;La/ubm;I)V

    .line 3185
    .line 3186
    .line 3187
    move-object/from16 v3, v28

    .line 3188
    .line 3189
    invoke-virtual {v6, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3190
    .line 3191
    .line 3192
    :cond_70
    if-eqz v9, :cond_71

    .line 3193
    .line 3194
    iget-object v3, v9, La/fn9;->l:Ljava/util/List;

    .line 3195
    .line 3196
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 3197
    .line 3198
    .line 3199
    move-result v7

    .line 3200
    if-nez v7, :cond_71

    .line 3201
    .line 3202
    new-instance v7, La/wbm;

    .line 3203
    .line 3204
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 3205
    .line 3206
    .line 3207
    move-result v3

    .line 3208
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3209
    .line 3210
    .line 3211
    move-result-object v3

    .line 3212
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 3213
    .line 3214
    .line 3215
    move-result-object v3

    .line 3216
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 3217
    .line 3218
    const/4 v15, 0x1

    .line 3219
    invoke-static {v3, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3220
    .line 3221
    .line 3222
    move-result-object v3

    .line 3223
    const v8, 0x7f1316fa

    .line 3224
    .line 3225
    .line 3226
    invoke-virtual {v5, v8, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3227
    .line 3228
    .line 3229
    move-result-object v3

    .line 3230
    const-wide/16 v13, 0x5

    .line 3231
    .line 3232
    invoke-direct {v7, v13, v14, v3}, La/wbm;-><init>(JLjava/lang/String;)V

    .line 3233
    .line 3234
    .line 3235
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3236
    .line 3237
    .line 3238
    :cond_71
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3239
    .line 3240
    .line 3241
    move-result-object v3

    .line 3242
    invoke-virtual {v3}, La/e4;->b()I

    .line 3243
    .line 3244
    .line 3245
    move-result v5

    .line 3246
    const/4 v15, 0x1

    .line 3247
    if-le v5, v15, :cond_72

    .line 3248
    .line 3249
    new-instance v5, La/nbm;

    .line 3250
    .line 3251
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 3252
    .line 3253
    .line 3254
    move-result-object v3

    .line 3255
    invoke-direct {v5, v3}, La/nbm;-><init>(La/a4x;)V

    .line 3256
    .line 3257
    .line 3258
    :goto_40
    move-object/from16 v22, v5

    .line 3259
    .line 3260
    goto :goto_41

    .line 3261
    :cond_72
    sget-object v5, La/obm;->a:La/obm;

    .line 3262
    .line 3263
    goto :goto_40

    .line 3264
    :goto_41
    if-eqz v9, :cond_75

    .line 3265
    .line 3266
    iget-wide v5, v9, La/fn9;->q:J

    .line 3267
    .line 3268
    iget-wide v7, v9, La/fn9;->p:J

    .line 3269
    .line 3270
    cmp-long v3, v7, v16

    .line 3271
    .line 3272
    if-lez v3, :cond_75

    .line 3273
    .line 3274
    cmp-long v3, v5, v16

    .line 3275
    .line 3276
    if-gtz v3, :cond_73

    .line 3277
    .line 3278
    goto :goto_44

    .line 3279
    :cond_73
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 3280
    .line 3281
    .line 3282
    move-result-object v3

    .line 3283
    sget-object v9, La/wen;->b:La/uen;

    .line 3284
    .line 3285
    sget-object v9, La/bfn;->e:La/bfn;

    .line 3286
    .line 3287
    invoke-static {v7, v8, v9}, La/ibc;->w0(JLa/bfn;)J

    .line 3288
    .line 3289
    .line 3290
    move-result-wide v7

    .line 3291
    invoke-static {v7, v8}, La/wen;->e(J)J

    .line 3292
    .line 3293
    .line 3294
    move-result-wide v7

    .line 3295
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3296
    .line 3297
    .line 3298
    invoke-static {v7, v8, v3}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 3299
    .line 3300
    .line 3301
    move-result-object v7

    .line 3302
    invoke-static {v5, v6, v9}, La/ibc;->w0(JLa/bfn;)J

    .line 3303
    .line 3304
    .line 3305
    move-result-wide v5

    .line 3306
    invoke-static {v5, v6}, La/wen;->e(J)J

    .line 3307
    .line 3308
    .line 3309
    move-result-wide v5

    .line 3310
    invoke-static {v5, v6, v3}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 3311
    .line 3312
    .line 3313
    move-result-object v3

    .line 3314
    new-instance v5, La/bcm;

    .line 3315
    .line 3316
    iget v6, v7, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->a:I

    .line 3317
    .line 3318
    iget v8, v3, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->a:I

    .line 3319
    .line 3320
    if-eq v6, v8, :cond_74

    .line 3321
    .line 3322
    sget-object v6, La/sdj;->n:La/sdj;

    .line 3323
    .line 3324
    goto :goto_42

    .line 3325
    :cond_74
    sget-object v6, La/sdj;->m:La/sdj;

    .line 3326
    .line 3327
    :goto_42
    iget-object v6, v6, La/sdj;->a:Ljava/lang/String;

    .line 3328
    .line 3329
    invoke-direct {v5, v7, v3, v6}, La/bcm;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/lang/String;)V

    .line 3330
    .line 3331
    .line 3332
    :goto_43
    move-object/from16 v21, v4

    .line 3333
    .line 3334
    move-object/from16 v23, v5

    .line 3335
    .line 3336
    goto :goto_45

    .line 3337
    :cond_75
    :goto_44
    sget-object v5, La/ccm;->a:La/ccm;

    .line 3338
    .line 3339
    goto :goto_43

    .line 3340
    :goto_45
    invoke-direct/range {v18 .. v23}, La/fcm;-><init>(JLa/ecm;La/pbm;La/dcm;)V

    .line 3341
    .line 3342
    .line 3343
    move-object/from16 v3, v18

    .line 3344
    .line 3345
    if-eqz v25, :cond_76

    .line 3346
    .line 3347
    iget-object v0, v0, La/qgg;->e:Ljava/lang/String;

    .line 3348
    .line 3349
    iget-object v4, v10, La/lel0;->h:Ljava/lang/String;

    .line 3350
    .line 3351
    new-instance v5, Lkotlin/Pair;

    .line 3352
    .line 3353
    invoke-direct {v5, v0, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3354
    .line 3355
    .line 3356
    goto :goto_46

    .line 3357
    :cond_76
    iget-object v0, v0, La/qgg;->d:Ljava/lang/String;

    .line 3358
    .line 3359
    iget-object v4, v10, La/lel0;->g:Ljava/lang/String;

    .line 3360
    .line 3361
    new-instance v5, Lkotlin/Pair;

    .line 3362
    .line 3363
    invoke-direct {v5, v0, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3364
    .line 3365
    .line 3366
    :goto_46
    iget-object v0, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 3367
    .line 3368
    check-cast v0, Ljava/lang/String;

    .line 3369
    .line 3370
    iget-object v4, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 3371
    .line 3372
    check-cast v4, Ljava/lang/String;

    .line 3373
    .line 3374
    new-instance v5, Ljava/lang/StringBuilder;

    .line 3375
    .line 3376
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 3377
    .line 3378
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3379
    .line 3380
    .line 3381
    invoke-static {v0, v4}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3382
    .line 3383
    .line 3384
    move-result-object v0

    .line 3385
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3386
    .line 3387
    .line 3388
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 3389
    .line 3390
    .line 3391
    move-result v4

    .line 3392
    if-nez v4, :cond_77

    .line 3393
    .line 3394
    const/4 v6, 0x0

    .line 3395
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 3396
    .line 3397
    .line 3398
    goto :goto_4a

    .line 3399
    :cond_77
    const/4 v6, 0x0

    .line 3400
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 3401
    .line 3402
    invoke-static {v0, v4, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 3403
    .line 3404
    .line 3405
    move-result v4

    .line 3406
    if-nez v4, :cond_7a

    .line 3407
    .line 3408
    invoke-static {v0, v2, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 3409
    .line 3410
    .line 3411
    move-result v2

    .line 3412
    if-eqz v2, :cond_78

    .line 3413
    .line 3414
    const/4 v6, 0x0

    .line 3415
    goto :goto_49

    .line 3416
    :cond_78
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    .line 3417
    .line 3418
    .line 3419
    move-result v2

    .line 3420
    if-lez v2, :cond_79

    .line 3421
    .line 3422
    invoke-static {v5, v1}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 3423
    .line 3424
    .line 3425
    move-result v1

    .line 3426
    if-nez v1, :cond_79

    .line 3427
    .line 3428
    const/16 v1, 0x2f

    .line 3429
    .line 3430
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3431
    .line 3432
    .line 3433
    :goto_47
    const/4 v15, 0x1

    .line 3434
    goto :goto_48

    .line 3435
    :cond_79
    const/16 v1, 0x2f

    .line 3436
    .line 3437
    goto :goto_47

    .line 3438
    :goto_48
    new-array v2, v15, [C

    .line 3439
    .line 3440
    const/4 v6, 0x0

    .line 3441
    aput-char v1, v2, v6

    .line 3442
    .line 3443
    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 3444
    .line 3445
    .line 3446
    move-result-object v0

    .line 3447
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3448
    .line 3449
    .line 3450
    goto :goto_4a

    .line 3451
    :cond_7a
    :goto_49
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 3452
    .line 3453
    .line 3454
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3455
    .line 3456
    .line 3457
    :goto_4a
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3458
    .line 3459
    .line 3460
    move-result-object v0

    .line 3461
    if-eqz v25, :cond_7b

    .line 3462
    .line 3463
    const v7, 0x7f08045c

    .line 3464
    .line 3465
    .line 3466
    goto :goto_4b

    .line 3467
    :cond_7b
    const v7, 0x7f080455

    .line 3468
    .line 3469
    .line 3470
    :goto_4b
    invoke-direct {v11, v12, v3, v0, v7}, La/edt0;-><init>(Ljava/lang/String;La/hcm;Ljava/lang/String;I)V

    .line 3471
    .line 3472
    .line 3473
    goto :goto_4d

    .line 3474
    :cond_7c
    move/from16 v25, v1

    .line 3475
    .line 3476
    new-instance v11, La/edt0;

    .line 3477
    .line 3478
    if-eqz v25, :cond_7d

    .line 3479
    .line 3480
    const v7, 0x7f08045c

    .line 3481
    .line 3482
    .line 3483
    goto :goto_4c

    .line 3484
    :cond_7d
    const v7, 0x7f080455

    .line 3485
    .line 3486
    .line 3487
    :goto_4c
    sget-object v0, La/gcm;->a:La/gcm;

    .line 3488
    .line 3489
    invoke-direct {v11, v6, v0, v10, v7}, La/edt0;-><init>(Ljava/lang/String;La/hcm;Ljava/lang/String;I)V

    .line 3490
    .line 3491
    .line 3492
    :goto_4d
    return-object v11

    .line 3493
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
